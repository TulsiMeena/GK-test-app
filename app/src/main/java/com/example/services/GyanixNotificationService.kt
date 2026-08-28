package com.example.services

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import androidx.compose.runtime.mutableStateListOf
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.MainActivity
import com.example.R
import org.json.JSONArray
import org.json.JSONObject

/**
 * Data Model for In-App Notification Items.
 */
data class GyanixInAppNotification(
    val id: String,
    val title: String,
    val message: String,
    val senderName: String = "Amit Meena (App Owner & Founder)",
    val senderRole: String = "Founder & Developer",
    val timestamp: Long = System.currentTimeMillis(),
    val isRead: Boolean = false,
    val type: String = "WELCOME", // WELCOME, UPDATE, TIP, ALERT
    val targetScreen: String? = null
)

/**
 * Service to manage Android System Notifications and In-App Notification Center.
 */
object GyanixNotificationService {

    private const val CHANNEL_ID = "gyanix_welcome_channel"
    private const val CHANNEL_NAME = "GYANIX Welcome & Announcements"
    private const val CHANNEL_DESC = "Notifications and Welcome messages from Amit Meena (App Owner)"
    private const val NOTIFICATION_ID_WELCOME = 1001

    val inAppNotifications = mutableStateListOf<GyanixInAppNotification>()
    private var currentUserId: String = "guest"
    private var prefs: SharedPreferences? = null

    /**
     * Initializes notification channels on Android O+.
     */
    fun initializeChannel(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = CHANNEL_DESC
                enableLights(true)
                enableVibration(true)
                setShowBadge(true)
            }
            val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager
            manager?.createNotificationChannel(channel)
        }
    }

    /**
     * Switch storage for current logged in user.
     */
    fun switchUser(userId: String, context: Context) {
        currentUserId = userId
        prefs = context.getSharedPreferences("gyanix_notifications_$userId", Context.MODE_PRIVATE)
        loadNotifications()
    }

    /**
     * Clear on logout.
     */
    fun clearUserData() {
        inAppNotifications.clear()
        currentUserId = "guest"
        prefs = null
    }

    /**
     * Triggers both a System Notification and adds an In-App Notification
     * when a user creates an account or logs in for the first time.
     */
    fun triggerWelcomeNotification(
        context: Context,
        userName: String,
        userEmail: String
    ) {
        initializeChannel(context)

        val cleanName = userName.trim().ifEmpty { "Aspirant" }
        val title = "🎉 Welcome to GYANIX, $cleanName!"
        val shortMessage = "Amit Meena (App Owner) welcomes you to GYANIX GK Championship!"
        val fullMessage = "नमस्ते $cleanName!\n\nGYANIX परिवार में आपका हार्दिक स्वागत है। मैं अमित मीणा (Amit Meena - App Owner & Founder), आपके सभी आगामी प्रतियोगी परीक्षाओं में सर्वोच्च सफलता की कामना करता हूँ।\n\nआपकी तैयारी को मजबूत बनाने के लिए ऐप में 10,500+ GK प्रश्न और 700+ मॉक टेस्ट जोड़े गए हैं। Best of luck for your preparation!"

        // 1. Android System Push Notification
        try {
            val intent = Intent(context, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            val pendingIntent = PendingIntent.getActivity(
                context,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )

            val builder = NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle(title)
                .setContentText(shortMessage)
                .setStyle(
                    NotificationCompat.BigTextStyle()
                        .setBigContentTitle("🎉 Welcome from Amit Meena (App Owner)")
                        .bigText(fullMessage)
                        .setSummaryText("GYANIX Official Notification")
                )
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)

            val notificationManager = NotificationManagerCompat.from(context)
            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU ||
                androidx.core.content.ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.POST_NOTIFICATIONS
                ) == android.content.pm.PackageManager.PERMISSION_GRANTED
            ) {
                notificationManager.notify(NOTIFICATION_ID_WELCOME, builder.build())
            }
        } catch (e: Throwable) {
            // Android 13+ permission or notification block safety
        }

        // 2. Add to In-App Notification Center
        val welcomeItem = GyanixInAppNotification(
            id = "welcome_${System.currentTimeMillis()}",
            title = title,
            message = fullMessage,
            senderName = "Amit Meena (App Owner & Founder)",
            senderRole = "Founder & Lead Developer",
            timestamp = System.currentTimeMillis(),
            isRead = false,
            type = "WELCOME"
        )

        // Avoid duplicate welcome notifications
        if (inAppNotifications.none { it.type == "WELCOME" }) {
            inAppNotifications.add(0, welcomeItem)
            saveNotifications()
        }
    }

    /**
     * Mark single notification as read.
     */
    fun markAsRead(id: String) {
        val index = inAppNotifications.indexOfFirst { it.id == id }
        if (index != -1) {
            val item = inAppNotifications[index]
            inAppNotifications[index] = item.copy(isRead = true)
            saveNotifications()
        }
    }

    /**
     * Mark all notifications as read.
     */
    fun markAllAsRead() {
        for (i in inAppNotifications.indices) {
            inAppNotifications[i] = inAppNotifications[i].copy(isRead = true)
        }
        saveNotifications()
    }

    /**
     * Delete notification.
     */
    fun deleteNotification(id: String) {
        inAppNotifications.removeAll { it.id == id }
        saveNotifications()
    }

    val unreadCount: Int
        get() = inAppNotifications.count { !it.isRead }

    private fun loadNotifications() {
        inAppNotifications.clear()
        val jsonStr = prefs?.getString("notifications_json", null) ?: return
        try {
            val arr = JSONArray(jsonStr)
            for (i in 0 until arr.length()) {
                val obj = arr.getJSONObject(i)
                inAppNotifications.add(
                    GyanixInAppNotification(
                        id = obj.getString("id"),
                        title = obj.getString("title"),
                        message = obj.getString("message"),
                        senderName = obj.optString("senderName", "Amit Meena (App Owner & Founder)"),
                        senderRole = obj.optString("senderRole", "Founder & Lead Developer"),
                        timestamp = obj.optLong("timestamp", System.currentTimeMillis()),
                        isRead = obj.optBoolean("isRead", false),
                        type = obj.optString("type", "WELCOME"),
                        targetScreen = obj.optString("targetScreen", null)
                    )
                )
            }
        } catch (e: Exception) {
            // Error parsing fallback
        }
    }

    private fun saveNotifications() {
        val p = prefs ?: return
        try {
            val arr = JSONArray()
            inAppNotifications.forEach { item ->
                val obj = JSONObject().apply {
                    put("id", item.id)
                    put("title", item.title)
                    put("message", item.message)
                    put("senderName", item.senderName)
                    put("senderRole", item.senderRole)
                    put("timestamp", item.timestamp)
                    put("isRead", item.isRead)
                    put("type", item.type)
                    if (item.targetScreen != null) put("targetScreen", item.targetScreen)
                }
                arr.put(obj)
            }
            p.edit().putString("notifications_json", arr.toString()).apply()
        } catch (e: Exception) {
            // Ignore
        }
    }
}
