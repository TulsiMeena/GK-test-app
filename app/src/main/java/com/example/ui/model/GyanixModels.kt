package com.example.ui.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AutoStories
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.HistoryEdu
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.LocationCity
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.Science
import androidx.compose.material.icons.filled.ShowChart
import androidx.compose.material.icons.filled.SportsCricket
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.ui.theme.ElectricCyan400
import com.example.ui.theme.PurpleAccent
import com.example.ui.theme.RoyalBlue400
import com.example.ui.theme.RoyalBlue500
import com.example.ui.theme.SuccessGreen
import com.example.ui.theme.WarningAmber

/**
 * 10 GK Categories for GYANIX Exam Platform
 */
data class GkTopicItem(
    val id: String,
    val title: String,
    val titleHindi: String,
    val questionCount: Int,
    val completedCount: Int,
    val accuracy: Int, // percentage 0-100
    val difficulty: String // "Easy", "Moderate", "Hard"
)

data class GkCategory(
    val id: String,
    val title: String,
    val titleHindi: String,
    val icon: ImageVector,
    val questionCount: Int,
    val attemptedCount: Int,
    val testsCount: Int,
    val progress: Float, // 0.0 to 1.0
    val accuracy: Int, // percentage 0-100
    val difficulty: String, // "High Yield", "Moderate", "Advanced", "State Special"
    val accentColor: Color,
    val subtitle: String,
    val subtopics: List<GkTopicItem> = emptyList()
)

data class PracticeModeConfig(
    val id: String,
    val title: String,
    val description: String,
    val questionCount: Int,
    val durationMinutes: Int,
    val difficultyBadge: String,
    val badgeColor: Color,
    val icon: ImageVector,
    val isRecommended: Boolean = false
)

object GyanixData {
    val categories: List<GkCategory> = listOf(
        GkCategory(
            id = "history",
            title = "Indian History",
            titleHindi = "भारतीय इतिहास",
            icon = Icons.Default.HistoryEdu,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 85,
            difficulty = "High Yield",
            accentColor = RoyalBlue400,
            subtitle = "Ancient, Medieval, Modern Freedom Movement, South India & Reformers",
            subtopics = listOf(
                GkTopicItem("hist_1", "Ancient India & Indus Valley", "प्राचीन भारत एवं सिंधु सभ्यता", 150, 0, 85, "Easy"),
                GkTopicItem("hist_2", "Vedic Period, Mahajanapadas & Religions", "वैदिक काल, महाजनपद, बौद्ध एवं जैन धर्म", 150, 0, 80, "Moderate"),
                GkTopicItem("hist_3", "Maurya Empire & Gupta Golden Age", "मौर्य साम्राज्य, कुषाण एवं गुप्त काल", 150, 0, 78, "Moderate"),
                GkTopicItem("hist_4", "Delhi Sultanate & Regional Dynasties", "दिल्ली सल्तनत एवं मध्यकालीन राजवंश", 150, 0, 88, "Hard"),
                GkTopicItem("hist_5", "Mughal Empire & Administration", "मुग़ल साम्राज्य, प्रशासन एवं स्थापत्य", 150, 0, 72, "Moderate"),
                GkTopicItem("hist_6", "European Arrival, British Conquest & 1857", "यूरोपीय आगमन, ब्रिटिश सत्ता एवं 1857 विद्रोह", 150, 0, 75, "Hard"),
                GkTopicItem("hist_7", "Indian Freedom Movement & Independence", "भारतीय स्वतंत्रता संग्राम एवं राष्ट्रीय आंदोलन (1885-1947)", 150, 0, 84, "Easy"),
                GkTopicItem("hist_8", "South Indian Dynasties & Vijayanagara", "दक्षिण भारत के प्रमुख राजवंश (चोल, चालुक्य, पल्लव, राष्ट्रकूट एवं विजयनगर साम्राज्य)", 150, 0, 80, "Moderate"),
                GkTopicItem("hist_9", "British Governors-General, Viceroys & Policies", "ब्रिटिश भारत के प्रमुख गवर्नर जनरल, वायसराय एवं नीतियां", 150, 0, 82, "Moderate"),
                GkTopicItem("hist_10", "Newspapers, Periodicals, Organizations & Socio-Religious Reforms", "भारतीय समाचार पत्र, पत्रिकाएं, संगठन एवं प्रमुख सामाजिक-धार्मिक सुधार आंदोलन", 150, 0, 85, "Easy")
            )
        ),
        GkCategory(
            id = "polity",
            title = "Indian Polity & Constitution",
            titleHindi = "भारतीय राजव्यवस्था एवं संविधान",
            icon = Icons.Default.AccountBalance,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 88,
            difficulty = "High Yield",
            accentColor = ElectricCyan400,
            subtitle = "Articles, Amendments, Executive, Judiciary, Emergency & Panchayati Raj",
            subtopics = listOf(
                GkTopicItem("pol_1", "Preamble & Salient Features", "प्रस्तावना एवं मुख्य विशेषताएं", 150, 0, 92, "Easy"),
                GkTopicItem("pol_2", "Fundamental Rights, Duties & DPSP", "मौलिक अधिकार, कर्तव्य एवं नीति निदेशक तत्व", 150, 0, 89, "Hard"),
                GkTopicItem("pol_3", "President, PM & Union Executive", "राष्ट्रपति, प्रधानमंत्री एवं संघ कार्यपालिका", 150, 0, 85, "Moderate"),
                GkTopicItem("pol_4", "Parliament & Legislative Procedure", "संसद एवं विधायी प्रक्रिया", 150, 0, 82, "Moderate"),
                GkTopicItem("pol_5", "Supreme Court & High Courts", "सर्वोच्च न्यायालय एवं उच्च न्यायालय", 150, 0, 86, "Hard"),
                GkTopicItem("pol_6", "Constitutional Bodies (ECI, UPSC, CAG)", "संवैधानिक निकाय", 150, 0, 84, "Moderate"),
                GkTopicItem("pol_7", "Important Articles & Amendments", "प्रमुख अनुच्छेद एवं संविधान संशोधन", 150, 0, 90, "Hard"),
                GkTopicItem("pol_8", "Centre-State Relations, Inter-State Council & Finance Commission", "केंद्र-राज्य संबंध, अंतरराज्यीय परिषद एवं वित्त आयोग", 150, 0, 84, "Moderate"),
                GkTopicItem("pol_9", "Emergency Provisions (Art 352, 356, 360) & Special States", "आपातकालीन उपबंध (अनुच्छेद 352, 356, 360) एवं विशेष राज्य प्रावधान", 150, 0, 88, "Hard"),
                GkTopicItem("pol_10", "Panchayati Raj, 73rd/74th Amendments & Urban Bodies", "पंचायती राज व्यवस्था, 73वां व 74वां संविधान संशोधन एवं नगरीय निकाय", 150, 0, 86, "Easy")
            )
        ),
        GkCategory(
            id = "geography",
            title = "Indian Geography",
            titleHindi = "भारत का भूगोल",
            icon = Icons.Default.Explore,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 85,
            difficulty = "High Yield",
            accentColor = SuccessGreen,
            subtitle = "Physical, Rivers, Climate, Agriculture, Minerals, Multipurpose Dams, Tribes & Disaster Management",
            subtopics = listOf(
                GkTopicItem("geo_1", "Physical Features, Himalayas & Islands", "भौतिक स्वरूप, हिमालय, प्रायद्वीपीय पठार एवं द्वीप समूह", 150, 0, 85, "Moderate"),
                GkTopicItem("geo_2", "Rivers, Lakes & Drainage Systems", "नदियाँ, झीलें, जलप्रपात एवं अपवाह तंत्र", 150, 0, 82, "Hard"),
                GkTopicItem("geo_3", "Climate, Monsoons & Seasons", "जलवायु, मानसून एवं ऋतु चक्र", 150, 0, 80, "Moderate"),
                GkTopicItem("geo_4", "Soils, Agriculture & Irrigation", "मृदा वर्गीकरण, भारतीय कृषि, फसलें एवं सिंचाई प्रणाली", 150, 0, 78, "Moderate"),
                GkTopicItem("geo_5", "Minerals, Energy Resources & Industries", "खनिज संपदा, ऊर्जा संसाधन एवं प्रमुख औद्योगिक क्षेत्र", 150, 0, 84, "Moderate"),
                GkTopicItem("geo_6", "Transport, Highways, Railways & Ports", "परिवहन, राष्ट्रीय राजमार्ग, रेलवे, प्रमुख बंदरगाह एवं व्यापार", 150, 0, 86, "Easy"),
                GkTopicItem("geo_7", "Vegetation, Forests, Wildlife & Demographics", "प्राकृतिक वनस्पति, वन, राष्ट्रीय उद्यान, जैवमंडल रिजर्व एवं जनगणना", 150, 0, 88, "Easy"),
                GkTopicItem("geo_8", "Multipurpose River Valley Projects & Dams", "भारत की प्रमुख बहुउद्देशीय नदी घाटी परियोजनाएं व बांध", 150, 0, 84, "Moderate"),
                GkTopicItem("geo_9", "Major Tribes & Regional Distribution", "भारत की प्रमुख जनजातियां एवं क्षेत्रीय वितरण", 150, 0, 86, "Moderate"),
                GkTopicItem("geo_10", "Disaster Management, Seismic Zones & Environmental Issues", "भारत में आपदा प्रबंधन, भूकंपीय क्षेत्र एवं प्रमुख पर्यावरण मुद्दे", 150, 0, 88, "Hard")
            )
        ),
        GkCategory(
            id = "economy",
            title = "Indian Economy",
            titleHindi = "भारतीय अर्थव्यवस्था",
            icon = Icons.Default.ShowChart,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 86,
            difficulty = "High Yield",
            accentColor = WarningAmber,
            subtitle = "National Income, Budget & Taxes, RBI & Banking, Capital Markets, Schemes & Infrastructure",
            subtopics = listOf(
                GkTopicItem("eco_1", "National Income, GDP & Economic Concepts", "राष्ट्रीय आय, जीडीपी एवं बुनियादी आर्थिक अवधारणाएं", 150, 0, 84, "Moderate"),
                GkTopicItem("eco_2", "Fiscal Policy, Union Budget, Taxation & GST", "राजकोषीय नीति, केंद्रीय बजट, कराधान एवं जीएसटी", 150, 0, 80, "Hard"),
                GkTopicItem("eco_3", "RBI, Monetary Policy, Money & Capital Markets", "आरबीआई, मौद्रिक नीति, मुद्रा एवं पूंजी बाजार", 150, 0, 85, "Hard"),
                GkTopicItem("eco_4", "Economic Planning, Five-Year Plans & NITI Aayog", "आर्थिक नियोजन, पंचवर्षीय योजनाएं एवं नीति आयोग", 150, 0, 88, "Easy"),
                GkTopicItem("eco_5", "Foreign Trade, BoP, WTO, Inflation & Agriculture", "विदेश व्यापार, भुगतान संतुलन, मुद्रास्फीति एवं भारतीय कृषि", 150, 0, 82, "Moderate"),
                GkTopicItem("eco_6", "Industry, Infrastructure, Energy & Digital Services", "उद्योग, अवसंरचना, ऊर्जा क्षेत्र, लॉजिस्टिक्स एवं डिजिटल अर्थव्यवस्था", 150, 0, 86, "Easy"),
                GkTopicItem("eco_7", "Poverty, Unemployment, Human Development & Schemes", "निर्धनता, बेरोजगारी, मानव विकास सूचकांक एवं प्रमुख कल्याणकारी योजनाएं", 150, 0, 90, "Easy"),
                GkTopicItem("eco_8", "Direct & Indirect Tax System, GST & Finance Commission", "भारत में प्रत्यक्ष एवं अप्रत्यक्ष कर प्रणाली, जीएसटी (GST) एवं वित्त आयोग", 150, 0, 85, "Moderate"),
                GkTopicItem("eco_9", "Stock Market, SEBI, Mutual Funds & Financial Markets", "शेयर बाजार, सेबी (SEBI), म्यूचुअल फंड एवं वित्तीय बाजार", 150, 0, 87, "Moderate"),
                GkTopicItem("eco_10", "Major Welfare Schemes, Poverty Alleviation & Flagship Programmes", "प्रमुख सरकारी सामाजिक कल्याणकारी योजनाएं, गरीबी उन्मूलन एवं फ्लैगशिप कार्यक्रम", 150, 0, 89, "Easy")
            )
        ),
        GkCategory(
            id = "world_gk",
            title = "World GK",
            titleHindi = "विश्व सामान्य ज्ञान",
            icon = Icons.Default.Language,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 85,
            difficulty = "High Yield",
            accentColor = RoyalBlue500,
            subtitle = "World Geography, UN, Treaties, History, Volcanoes, Alliances & Inventions",
            subtopics = listOf(
                GkTopicItem("wgk_1", "World Geography, Continents, Oceans & Landforms", "विश्व भूगोल, महाद्वीप, महासागर, पर्वत, पठार, मैदान एवं मरुस्थल", 150, 0, 84, "Moderate"),
                GkTopicItem("wgk_2", "World Rivers, Lakes, Waterfalls, Straits & Canals", "विश्व की प्रमुख नदियां, झीलें, जलप्रपात, जलडमरूमध्य, नहरें एवं खाड़ियां", 150, 0, 82, "Moderate"),
                GkTopicItem("wgk_3", "UN, Specialized Agencies & International Bodies", "संयुक्त राष्ट्र (UN), सुरक्षा परिषद, यूनेस्को, डब्ल्यूटीओ, डब्ल्यूएचओ, आईएमएफ एवं विश्व बैंक", 150, 0, 86, "Easy"),
                GkTopicItem("wgk_4", "Global Summits, Alliances, Regional Blocs & Treaties", "वैश्विक शिखर सम्मेलन, नाटो, यूरोपीय संघ, जी20, ब्रिक्स, एससीओ, आसियान, सार्क एवं पर्यावरण संधियां", 150, 0, 85, "Moderate"),
                GkTopicItem("wgk_5", "World History, Revolutions, World Wars & Cold War", "विश्व इतिहास, पुनर्जागरण, प्रमुख क्रांतियां, प्रथम एवं द्वितीय विश्व युद्ध तथा शीत युद्ध", 150, 0, 83, "Moderate"),
                GkTopicItem("wgk_6", "World Capitals, Currencies, Parliaments & Borders", "विश्व के देश, राजधानियां, मुद्राएं, संसदें, अंतरराष्ट्रीय सीमाएं एवं भौगोलिक उपनाम", 150, 0, 88, "Easy"),
                GkTopicItem("wgk_7", "Wonders, Nobel Prizes, Records & International Days", "विश्व के आश्चर्य, नोबेल पुरस्कार, वैश्विक रिकॉर्ड, प्रमुख व्यक्तित्व एवं अंतरराष्ट्रीय दिवस", 150, 0, 87, "Easy"),
                GkTopicItem("wgk_8", "Global Volcanoes, Earthquakes, Deepest Trenches & Geological Wonders", "विश्व के प्रमुख ज्वालामुखी, भूकंप क्षेत्र, चरम भौगोलिक बिंदु एवं भू-आकृतिक आश्चर्य", 150, 0, 85, "Moderate"),
                GkTopicItem("wgk_9", "International Treaties, Environmental Accords & Geopolitical Blocs", "अंतरराष्ट्रीय संधियां, पर्यावरण समझौते, निरस्त्रीकरण एवं भू-राजनीतिक संधियां", 150, 0, 86, "Moderate"),
                GkTopicItem("wgk_10", "World Exploration, Great Navigators, Space Missions & Global Inventions", "विश्व खोजकर्ता, महान नाविक, ऐतिहासिक अंतरिक्ष मिशन एवं युगांतरकारी आविष्कार", 150, 0, 88, "Easy")
            )
        ),
        GkCategory(
            id = "science",
            title = "General Science",
            titleHindi = "सामान्य विज्ञान",
            icon = Icons.Default.Science,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 85,
            difficulty = "High Yield",
            accentColor = ElectricCyan400,
            subtitle = "Physics, Chemistry, Biology, Environment, Tech, Diseases & Polymers",
            subtopics = listOf(
                GkTopicItem("sci_1", "Units, Mechanics, Gravitation & Work-Energy", "मात्रक, मापन, यांत्रिकी, गुरुत्वाकर्षण, कार्य एवं ऊर्जा", 150, 0, 84, "Moderate"),
                GkTopicItem("sci_2", "Heat, Thermodynamics, Waves, Sound, Optics & Electromagnetism", "ऊष्मा, तरंगें, ध्वनि, प्रकाशिकी, विद्युत एवं चुंबकत्व", 150, 0, 82, "Moderate"),
                GkTopicItem("sci_3", "Matter, Atomic Structure, Periodic Table & Chemical Reactions", "द्रव्य, परमाणु संरचना, आवर्त सारणी एवं रासायनिक आबंधन", 150, 0, 85, "Moderate"),
                GkTopicItem("sci_4", "Acids, Bases, Salts, Metals, Carbon & Applied Chemistry", "अम्ल, क्षार, लवण, धातुएं, अधातुएं एवं कार्बनिक रसायन", 150, 0, 86, "Easy"),
                GkTopicItem("sci_5", "Cell Biology, Genetics, Human Physiology & Health", "कोशिका विज्ञान, आनुवंशिकी, मानव शरीर क्रिया विज्ञान एवं पोषण", 150, 0, 88, "Easy"),
                GkTopicItem("sci_6", "Ecology, Environment, Biodiversity, Wildlife & Pollution", "पारिस्थितिकी, पर्यावरण, जैव विविधता, वन्यजीव संरक्षण एवं प्रदूषण", 150, 0, 87, "Easy"),
                GkTopicItem("sci_7", "Space Science, Defense Technology, IT, AI & Everyday Science", "अंतरिक्ष विज्ञान, रक्षा प्रौद्योगिकी, कंप्यूटर, एआई एवं दैनिक विज्ञान", 150, 0, 89, "Easy"),
                GkTopicItem("sci_8", "Human Diseases, Bacterial/Viral Pathogens & Vaccination", "मानव रोग, जीवाणु/विषाणु जनित बीमारियां एवं टीकाकरण", 150, 0, 85, "Moderate"),
                GkTopicItem("sci_9", "Vitamins, Minerals, Balanced Diet & Nutritional Science", "विटामिन, खनिज, संतुलित आहार एवं पोषण विज्ञान", 150, 0, 88, "Easy"),
                GkTopicItem("sci_10", "Chemistry in Daily Life & Polymers (Polymers, Soaps, Plastics)", "दैनिक जीवन में रसायन एवं बहुलक (Polymers, Soaps, Plastics)", 150, 0, 86, "Moderate")
            )
        ),
        GkCategory(
            id = "sports",
            title = "Sports & Games",
            titleHindi = "खेल एवं खिलाड़ी",
            icon = Icons.Default.SportsCricket,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 85,
            difficulty = "High Yield",
            accentColor = SuccessGreen,
            subtitle = "Olympics, Cricket, Football, Grand Slams, Asian Games, Martial Arts, Chess & Governance",
            subtopics = listOf(
                GkTopicItem("spt_1", "Olympics & Paralympic Games (Summer & Winter)", "ग्रीष्मकालीन एवं शीतकालीन ओलंपिक, पैरालंपिक खेल एवं पदक विजेता", 150, 0, 86, "Moderate"),
                GkTopicItem("spt_2", "Cricket & ICC World Tournaments", "क्रिकेट इतिहास, आईसीसी विश्व कप, आईपीएल, रणजी ट्रॉफी एवं नियम", 150, 0, 89, "Easy"),
                GkTopicItem("spt_3", "Football, FIFA World Cup & Major Leagues", "फीफा विश्व कप, कोपा अमेरिका, यूरो, क्लब फुटबॉल एवं संतोष ट्रॉफी", 150, 0, 85, "Moderate"),
                GkTopicItem("spt_4", "Tennis Grand Slams, Badminton & Table Tennis", "ग्रैंड स्लैम टेनिस, ऑल इंग्लैंड, थॉमस कप एवं टेबल टेनिस", 150, 0, 84, "Moderate"),
                GkTopicItem("spt_5", "Asian Games, Commonwealth Games & Khelo India", "एशियाई खेल, राष्ट्रमंडल खेल, राष्ट्रीय खेल एवं खेलो इंडिया गेम्स", 150, 0, 87, "Easy"),
                GkTopicItem("spt_6", "National Sports Awards, Trophies & Famous Players", "मेजर ध्यानचंद खेल रत्न, अर्जुन पुरस्कार, ट्रॉफियां एवं महान खिलाड़ी", 150, 0, 88, "Easy"),
                GkTopicItem("spt_7", "Sports Terminology, Rules, Autobiographies & Grounds", "खेल शब्दावली, मैदानों की माप, आत्मकथाएं एवं राष्ट्रीय खेल", 150, 0, 86, "Easy"),
                GkTopicItem("spt_8", "Traditional Indigenous Indian Sports, Martial Arts & Rural Games", "पारंपरिक भारतीय खेल, स्वदेशी मार्शल आर्ट्स एवं ग्रामीण क्रीड़ाएं", 150, 0, 87, "Easy"),
                GkTopicItem("spt_9", "Chess, Athletics, Formula 1, Archery & Shooting Champions", "शतरंज, एथलेटिक्स, फॉर्मूला-1, तीरंदाजी, निशानेबाजी एवं बिलियर्ड्स-स्नूकर", 150, 0, 88, "Easy"),
                GkTopicItem("spt_10", "Paralympic Movement, Winter Sports, Global Sports Governance & Anti-Doping", "पैरालंपिक अभियान, शीतकालीन खेल, वैश्विक खेल शासी निकाय एवं डोपिंग-रोधी एजेंसियां", 150, 0, 86, "Moderate")
            )
        ),
        GkCategory(
            id = "art_culture",
            title = "Art & Culture",
            titleHindi = "कला एवं संस्कृति",
            icon = Icons.Default.Palette,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 85,
            difficulty = "High Yield",
            accentColor = PurpleAccent,
            subtitle = "Classical Dances, Music, Paintings, Architecture, Festivals & Heritage",
            subtopics = listOf(
                GkTopicItem("art_1", "Classical Dances of India & Exponents", "भारत के शास्त्रीय नृत्य, प्रमुख नर्तक एवं घराने", 150, 0, 86, "Moderate"),
                GkTopicItem("art_2", "Folk Dances, Tribal Dances, Regional Theatres & Puppetry", "भारत के लोक एवं जनजातीय नृत्य, क्षेत्रीय लोक नाट्य एवं कठपुतली कलाएं", 150, 0, 84, "Moderate"),
                GkTopicItem("art_3", "Indian Classical & Carnatic Music, Gharanas & Instruments", "भारतीय शास्त्रीय एवं कर्नाटक संगीत, प्रमुख घराने, संगीतकार एवं वाद्य यंत्र", 150, 0, 83, "Hard"),
                GkTopicItem("art_4", "Painting Styles, Folk Paintings, Handlooms & Handicrafts", "भारतीय चित्रकला शैलियां, लोक पेंटिंग्स, पारंपरिक हस्तशिल्प एवं वस्त्र कला", 150, 0, 87, "Easy"),
                GkTopicItem("art_5", "Architecture, Temples, Caves, Forts & UNESCO Heritage", "मंदिर वास्तुकला, शैलकर्तित गुफाएं, ऐतिहासिक किले एवं यूनेस्को विश्व धरोहर स्थल", 150, 0, 85, "Moderate"),
                GkTopicItem("art_6", "Indian Festivals, Fairs, Calendars & Traditions", "भारत के प्रमुख मेले, पारंपरिक त्यौहार, राष्ट्रीय कैलेंडर एवं धार्मिक परंपराएं", 150, 0, 89, "Easy"),
                GkTopicItem("art_7", "Classical Literature, Philosophy, Epics & Literary Awards", "शास्त्रीय साहित्य, भाषाएं, दर्शन (षड्दर्शन) एवं ज्ञानपीठ-साहित्य अकादमी पुरस्कार", 150, 0, 84, "Moderate"),
                GkTopicItem("art_8", "UNESCO World Heritage Sites & Ancient Caves (Ajanta, Ellora, Elephanta)", "भारत के प्रमुख यूनेस्को विश्व धरोहर स्थल एवं प्राचीन गुफाएं (अजंता, एलोरा, एलीफेंटा आदि)", 150, 0, 86, "Moderate"),
                GkTopicItem("art_9", "Classical & Folk Music Gharanas, Musicians & Musical Instruments", "शास्त्रीय एवं लोक संगीत घराने, संगीतकार एवं प्रमुख वाद्य यंत्र", 150, 0, 85, "Moderate"),
                GkTopicItem("art_10", "Major Fairs, Sacred Pilgrimages & Cultural Festivals of India", "भारत के प्रमुख मेले, धार्मिक यात्राएं एवं सांस्कृतिक उत्सव", 150, 0, 88, "Easy")
            )
        ),
        GkCategory(
            id = "static_gk",
            title = "Static GK",
            titleHindi = "स्टैटिक जीके (विविध)",
            icon = Icons.Default.AutoStories,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 88,
            difficulty = "High Yield",
            accentColor = RoyalBlue400,
            subtitle = "Firsts, HQ, Institutes, Festivals, Folk Arts, Military Exercises & Records",
            subtopics = listOf(
                GkTopicItem("stk_1", "First in India & World (Personalities, Space & Events)", "भारत एवं विश्व में प्रथम (व्यक्तित्व, अंतरिक्ष, रक्षा एवं ऐतिहासिक घटनाएं)", 150, 0, 89, "Easy"),
                GkTopicItem("stk_2", "National & International Organizations, HQ & Research Institutes", "प्रमुख राष्ट्रीय एवं अंतरराष्ट्रीय संगठन, मुख्यालय, बैंक टैगलाइन एवं केंद्रीय अनुसंधान संस्थान", 150, 0, 86, "Moderate"),
                GkTopicItem("stk_3", "National Symbols, Highest Honors & Gallantry Awards", "राष्ट्रीय प्रतीक, भारत रत्न, पद्म पुरस्कार, परमवीर चक्र एवं राज्यों के राजकीय प्रतीक", 150, 0, 91, "Easy"),
                GkTopicItem("stk_4", "Major Books, Authors, Autobiographies & Literature", "प्रमुख पुस्तकें, प्रसिद्ध लेखक, महान आत्मकथाएं एवं कालजयी साहित्यिक कृतियां", 150, 0, 85, "Moderate"),
                GkTopicItem("stk_5", "Important National & International Days & Themes", "महत्वपूर्ण राष्ट्रीय एवं अंतरराष्ट्रीय दिवस, प्रमुख थीम एवं संयुक्त राष्ट्र दशक", 150, 0, 88, "Easy"),
                GkTopicItem("stk_6", "World Heritage Sites, Biosphere Reserves & National Parks", "यूनेस्को विश्व धरोहर स्थल, बायोस्फीयर रिजर्व, रामसर आर्द्रभूमियां एवं राष्ट्रीय उद्यान", 150, 0, 87, "Easy"),
                GkTopicItem("stk_7", "Miscellaneous Superlatives, Bridges, Airports & Records", "विविध स्टैटिक जीके: प्रमुख बांध, पुल, सुरंगे, हवाई अड्डे, बंदरगाह एवं विश्व/भारत के रिकॉर्ड्स", 150, 0, 86, "Easy"),
                GkTopicItem("stk_8", "Key Research Institutes, Space Centers & Nuclear Power Plants of India", "भारत के प्रमुख अनुसंधान केंद्र, अंतरिक्ष केंद्र एवं परमाणु ऊर्जा संयंत्र", 150, 0, 87, "Moderate"),
                GkTopicItem("stk_9", "Major Festivals, Folk Theatres & Tribal Arts of India", "भारत के प्रमुख उत्सव, लोक नाट्य एवं जनजातीय कलाएं", 150, 0, 89, "Easy"),
                GkTopicItem("stk_10", "Major Military Exercises of India & Global", "विश्व एवं भारत के प्रमुख सैन्य अभ्यास (Military Exercises)", 150, 0, 86, "Moderate")
            )
        ),
        GkCategory(
            id = "rajasthan_gk",
            title = "Rajasthan GK",
            titleHindi = "राजस्थान सामान्य ज्ञान (State Special)",
            icon = Icons.Default.LocationCity,
            questionCount = 1500,
            attemptedCount = 0,
            testsCount = 100,
            progress = 0.0f,
            accuracy = 86,
            difficulty = "State Special",
            accentColor = WarningAmber,
            subtitle = "History, Dynasties, Forts, Geography, Minerals, Forests, Polity & Culture",
            subtopics = listOf(
                GkTopicItem("raj_1", "Ancient Civilization, 1857 Revolution & Ekikaran", "प्राचीन सभ्यताएं, 1857 क्रांति, प्रजामंडल एवं एकीकरण", 150, 0, 85, "Moderate"),
                GkTopicItem("raj_2", "Rajput Dynasties, Forts, Palaces & Havelis", "प्रमुख राजपूत राजवंश, ऐतिहासिक दुर्ग, महल एवं हवेलियां", 150, 0, 88, "Moderate"),
                GkTopicItem("raj_3", "Thar Desert, Aravalli & Physical Geography", "थार का मरुस्थल, अरावली पर्वतमाला एवं भौतिक भूगोल", 150, 0, 84, "Moderate"),
                GkTopicItem("raj_4", "Drainage, Rivers, Lakes, Dams & Irrigation Projects", "अपवाह तंत्र, नदियां, झीलें, बांध एवं सिंचाई परियोजनाएं", 150, 0, 82, "Hard"),
                GkTopicItem("raj_5", "Forests, Wildlife, Sanctuaries & State Symbols", "वन संपदा, वन्यजीव, राष्ट्रीय उद्यान, अभयारण्य एवं प्रतीक चिन्ह", 150, 0, 89, "Easy"),
                GkTopicItem("raj_6", "Minerals, Energy, Industries & Agriculture Economy", "खनिज संपदा, ऊर्जा संसाधन, उद्योग, रिफाइनरी एवं कृषि", 150, 0, 85, "Moderate"),
                GkTopicItem("raj_7", "Polity, Panchayati Raj, Administration & Schemes", "प्रशासनिक व्यवस्था, पंचायती राज, विधानसभा, राज्यपाल एवं योजनाएं", 150, 0, 87, "Easy"),
                GkTopicItem("raj_8", "Folk Deities, Goddesses, Saints & Religious Sects", "राजस्थान के प्रमुख लोक देवता, लोक देवियां, संत एवं धार्मिक संप्रदाय", 150, 0, 88, "Easy"),
                GkTopicItem("raj_9", "Painting Styles, Handicrafts, Ornaments, Costumes, Folk Music & Dance", "राजस्थान की चित्रकला शैलियां, हस्तशिल्प, आभूषण, वेशभूषा एवं लोक संगीत/नृत्य", 150, 0, 86, "Moderate"),
                GkTopicItem("raj_10", "Fairs, Festivals, Folk Drama, Literature & Eminent Personalities", "राजस्थान के प्रमुख मेले, त्योहार, लोक नाट्य, साहित्य एवं प्रमुख व्यक्तित्व", 150, 0, 89, "Easy")
            )
        )
    )

    val practiceModes: List<PracticeModeConfig> = listOf(
        PracticeModeConfig(
            id = "quick_10",
            title = "Quick Practice",
            description = "Short focused speed session for daily revision",
            questionCount = 10,
            durationMinutes = 10,
            difficultyBadge = "Speed Mode",
            badgeColor = ElectricCyan400,
            icon = Icons.Default.Science,
            isRecommended = false
        ),
        PracticeModeConfig(
            id = "standard_25",
            title = "Standard Test",
            description = "Balanced multi-topic subject test with in-depth analysis",
            questionCount = 25,
            durationMinutes = 25,
            difficultyBadge = "Recommended",
            badgeColor = RoyalBlue400,
            icon = Icons.Default.HistoryEdu,
            isRecommended = true
        ),
        PracticeModeConfig(
            id = "full_50",
            title = "Full Test",
            description = "Competitive exam style timed test with negative marking",
            questionCount = 50,
            durationMinutes = 45,
            difficultyBadge = "Exam Level",
            badgeColor = WarningAmber,
            icon = Icons.Default.AccountBalance,
            isRecommended = false
        ),
        PracticeModeConfig(
            id = "mega_100",
            title = "Mega Test",
            description = "Complete full-length UPSC/SSC simulator challenge",
            questionCount = 100,
            durationMinutes = 90,
            difficultyBadge = "Pro Simulator",
            badgeColor = PurpleAccent,
            icon = Icons.Default.EmojiEvents,
            isRecommended = false
        ),
        PracticeModeConfig(
            id = "random_20",
            title = "Random Test",
            description = "Questions selected randomly from available GK categories",
            questionCount = 20,
            durationMinutes = 20,
            difficultyBadge = "Random Shuffle",
            badgeColor = SuccessGreen,
            icon = Icons.Default.Explore,
            isRecommended = false
        )
    )

    val recentSearches = listOf(
        "Fundamental Rights",
        "1857 Revolt",
        "Indus Valley Civilization",
        "Western Ghats",
        "NITI Aayog",
        "GST Constitutional Amendment",
        "Thar Desert Rivers"
    )

    val popularTopics = listOf(
        "Constitution Articles",
        "Bhakti Movement",
        "Monsoon Mechanism",
        "Nobel Laureates",
        "UNESCO Heritage Sites",
        "Rajasthan Forts",
        "National Parks of India"
    )
}


/**
 * Test Series Model
 */
data class ExamTestItem(
    val id: String,
    val title: String,
    val categoryName: String,
    val questionsCount: Int,
    val durationMinutes: Int,
    val totalMarks: Int,
    val negativeMarking: String,
    val difficulty: String,
    val attemptsCount: Int,
    val isFeatured: Boolean = false,
    val tag: String = "Exam Mock"
)

/**
 * Quiz Question Layout Model for Visual Verification
 */
data class QuizOptionPreview(
    val id: String,
    val label: String, // "A", "B", "C", "D"
    val textEnglish: String,
    val textHindi: String,
    val isSelected: Boolean = false
)

data class QuizQuestionPreview(
    val questionNumber: Int,
    val totalQuestions: Int,
    val category: String,
    val marksWeightage: String,
    val questionEnglish: String,
    val questionHindi: String,
    val options: List<QuizOptionPreview>,
    val isMarkedForReview: Boolean = false
)

/**
 * Result Performance Model
 */
data class ResultSummaryPreview(
    val testTitle: String,
    val score: Float,
    val maxScore: Float,
    val accuracyPercentage: Int,
    val rankPercentile: Float,
    val correctCount: Int,
    val incorrectCount: Int,
    val unattemptedCount: Int,
    val timeTaken: String,
    val speedPerQuestion: String,
    val categoryBreakdown: List<Pair<String, Int>> // Category name to % score
)

/**
 * Achievement Badge Model
 */
data class AchievementBadge(
    val id: String,
    val name: String,
    val description: String,
    val icon: ImageVector,
    val isUnlocked: Boolean,
    val unlockedDate: String? = null
)
