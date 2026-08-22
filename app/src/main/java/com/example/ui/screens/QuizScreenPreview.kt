package com.example.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.GridOn
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.GyanixConfirmationDialog
import com.example.ui.components.GyanixOptionCard
import com.example.ui.components.GyanixQuestionCard
import com.example.ui.model.QuizOptionPreview
import com.example.ui.model.QuizQuestionPreview
import com.example.ui.theme.DarkNavySurfaceElevated
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.ErrorRed
import com.example.ui.theme.GyanixDimens
import com.example.ui.theme.MetricTypography
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.RoyalBlue600
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreenPreview(
    onExitQuiz: () -> Unit,
    onSubmitQuiz: () -> Unit,
    modifier: Modifier = Modifier
) {
    var currentQuestionIndex by remember { mutableIntStateOf(14) }
    var selectedOptionId by remember { mutableStateOf<String?>("opt_b") }
    var isMarkedForReview by remember { mutableStateOf(false) }
    var showSubmitDialog by remember { mutableStateOf(false) }
    var showPaletteSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState()

    val totalQuestions = 50
    val progress = currentQuestionIndex.toFloat() / totalQuestions.toFloat()

    val sampleQuestion = remember(currentQuestionIndex) {
        QuizQuestionPreview(
            questionNumber = currentQuestionIndex,
            totalQuestions = totalQuestions,
            category = "Indian Polity & Constitution",
            marksWeightage = "+2.0 / -0.50 Marks",
            questionEnglish = "Which Constitutional Amendment Act is famously known as the 'Mini-Constitution' of India and added the words Socialist, Secular and Integrity to the Preamble?",
            questionHindi = "किस संविधान संशोधन अधिनियम को भारत का 'लघु संविधान' (Mini-Constitution) कहा जाता है, जिसने प्रस्तावना में समाजवादी, धर्मनिरपेक्ष और अखंडता शब्द जोड़े?",
            options = listOf(
                QuizOptionPreview("opt_a", "A", "44th Constitutional Amendment Act, 1978", "44वां संविधान संशोधन अधिनियम, 1978"),
                QuizOptionPreview("opt_b", "B", "42nd Constitutional Amendment Act, 1976", "42वां संविधान संशोधन अधिनियम, 1976"),
                QuizOptionPreview("opt_c", "C", "73rd Constitutional Amendment Act, 1992", "73वां संविधान संशोधन अधिनियम, 1992"),
                QuizOptionPreview("opt_d", "D", "86th Constitutional Amendment Act, 2002", "86वां संविधान संशोधन अधिनियम, 2002")
            ),
            isMarkedForReview = isMarkedForReview
        )
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .testTag("quiz_screen_container")
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            // 1. Top Exam Header Bar (Title, Timer, Palette Icon, Close)
            QuizTopBar(
                testTitle = "Full Mock Test #01",
                timeRemaining = "28:45",
                onOpenPalette = { showPaletteSheet = true },
                onCloseQuiz = onExitQuiz
            )

            // 2. Progress Indicator
            LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp),
                color = ElectricCyan400,
                trackColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                strokeCap = StrokeCap.Square
            )

            // 3. Question & Options Scrollable Content
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = GyanixDimens.screenPadding),
                contentPadding = PaddingValues(top = 16.dp, bottom = 16.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                // Question Card
                item {
                    GyanixQuestionCard(
                        questionNumber = sampleQuestion.questionNumber,
                        totalQuestions = sampleQuestion.totalQuestions,
                        categoryName = sampleQuestion.category,
                        marksWeightage = sampleQuestion.marksWeightage,
                        questionEnglish = sampleQuestion.questionEnglish,
                        questionHindi = sampleQuestion.questionHindi,
                        isMarkedForReview = isMarkedForReview,
                        onToggleReview = { isMarkedForReview = !isMarkedForReview }
                    )
                }

                // Answer Options List
                item {
                    Text(
                        text = "SELECT THE CORRECT OPTION",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            letterSpacing = 1.sp
                        ),
                        modifier = Modifier.padding(start = 4.dp, top = 4.dp)
                    )
                }

                items(sampleQuestion.options) { option ->
                    val isSelected = selectedOptionId == option.id
                    GyanixOptionCard(
                        option = option.copy(isSelected = isSelected),
                        onClick = {
                            selectedOptionId = if (isSelected) null else option.id
                        }
                    )
                }
            }

            // 4. Bottom Exam Navigation Bar (Previous, Next, Submit)
            QuizBottomActionBar(
                canGoPrevious = currentQuestionIndex > 1,
                canGoNext = currentQuestionIndex < totalQuestions,
                onPrevious = { if (currentQuestionIndex > 1) currentQuestionIndex-- },
                onNext = { if (currentQuestionIndex < totalQuestions) currentQuestionIndex++ },
                onSubmit = { showSubmitDialog = true }
            )
        }

        // 5. Submit Confirmation Dialog
        if (showSubmitDialog) {
            GyanixConfirmationDialog(
                title = "Submit Test?",
                message = "You have answered 42 of 50 questions.\n5 marked for review • 3 unattempted.\n\nAre you sure you want to finalize your submission?",
                confirmText = "Submit Test",
                dismissText = "Keep Answering",
                onConfirm = {
                    showSubmitDialog = false
                    onSubmitQuiz()
                },
                onDismiss = { showSubmitDialog = false }
            )
        }

        // 6. Question Palette Bottom Sheet (Grid 1 to 50)
        if (showPaletteSheet) {
            ModalBottomSheet(
                onDismissRequest = { showPaletteSheet = false },
                sheetState = sheetState,
                containerColor = MaterialTheme.colorScheme.surface
            ) {
                QuestionPaletteSheetContent(
                    totalQuestions = totalQuestions,
                    currentQuestion = currentQuestionIndex,
                    onSelectQuestion = { qNum ->
                        currentQuestionIndex = qNum
                        showPaletteSheet = false
                    }
                )
            }
        }
    }
}

@Composable
private fun QuizTopBar(
    testTitle: String,
    timeRemaining: String,
    onOpenPalette: () -> Unit,
    onCloseQuiz: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(
                onClick = onCloseQuiz,
                modifier = Modifier.size(36.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Exit Test",
                    tint = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = testTitle,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            // Live Timer Badge
            Surface(
                shape = RoundedCornerShape(GyanixDimens.radiusSm),
                color = WarningAmber.copy(alpha = 0.15f),
                border = BorderStroke(1.dp, WarningAmber.copy(alpha = 0.5f))
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Timer,
                        contentDescription = null,
                        tint = WarningAmber,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = timeRemaining,
                        style = MetricTypography.TimerDisplay.copy(color = WarningAmber)
                    )
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            // Question Palette Grid Button
            IconButton(
                onClick = onOpenPalette,
                modifier = Modifier
                    .size(36.dp)
                    .background(MaterialTheme.colorScheme.surfaceVariant, CircleShape)
                    .testTag("btn_question_palette")
            ) {
                Icon(
                    imageVector = Icons.Default.GridOn,
                    contentDescription = "Question Palette",
                    tint = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}

@Composable
private fun QuizBottomActionBar(
    canGoPrevious: Boolean,
    canGoNext: Boolean,
    onPrevious: () -> Unit,
    onNext: () -> Unit,
    onSubmit: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding(),
        color = MaterialTheme.colorScheme.surface,
        shadowElevation = 8.dp,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.6f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedButton(
                onClick = onPrevious,
                enabled = canGoPrevious,
                shape = RoundedCornerShape(GyanixDimens.radiusSm),
                modifier = Modifier.testTag("btn_quiz_prev")
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("Previous")
            }

            Button(
                onClick = onSubmit,
                shape = RoundedCornerShape(GyanixDimens.radiusSm),
                colors = ButtonDefaults.buttonColors(containerColor = SuccessGreen),
                modifier = Modifier.testTag("btn_quiz_submit")
            ) {
                Text(
                    text = "Submit Test",
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            Button(
                onClick = onNext,
                enabled = canGoNext,
                shape = RoundedCornerShape(GyanixDimens.radiusSm),
                colors = ButtonDefaults.buttonColors(containerColor = RoyalBlue600),
                modifier = Modifier.testTag("btn_quiz_next")
            ) {
                Text("Next")
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}

@Composable
private fun QuestionPaletteSheetContent(
    totalQuestions: Int,
    currentQuestion: Int,
    onSelectQuestion: (Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .navigationBarsPadding()
    ) {
        Text(
            text = "Question Palette",
            style = MaterialTheme.typography.titleLarge.copy(
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Status Legend
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            PaletteLegendItem(color = SuccessGreen, label = "Answered (42)")
            PaletteLegendItem(color = WarningAmber, label = "Review (5)")
            PaletteLegendItem(color = MaterialTheme.colorScheme.outline, label = "Unvisited (3)")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Grid of 50 numbers
        LazyVerticalGrid(
            columns = GridCells.Fixed(6),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.height(280.dp)
        ) {
            items(totalQuestions) { index ->
                val qNum = index + 1
                val isCurrent = qNum == currentQuestion
                val isAnswered = qNum in 1..42
                val isReview = qNum in 43..47

                val bg = when {
                    isCurrent -> RoyalBlue600
                    isReview -> WarningAmber
                    isAnswered -> SuccessGreen
                    else -> MaterialTheme.colorScheme.surfaceVariant
                }

                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .background(bg, RoundedCornerShape(8.dp))
                        .clickable { onSelectQuestion(qNum) },
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = qNum.toString(),
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 13.sp
                    )
                }
            }
        }
    }
}

@Composable
private fun PaletteLegendItem(color: Color, label: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(10.dp)
                .background(color, CircleShape)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        )
    }
}
