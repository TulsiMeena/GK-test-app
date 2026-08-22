package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic8ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_8_m6_q1", "spt_8",
            "कबड्डी में 'डू ऑर डाई रेड' (Do-or-Die Raid) का नियम क्या है और यह कब लागू होती है?",
            "What is the 'Do-or-Die Raid' rule in modern Kabaddi and when is an attacking raider penalized if unable to score?",
            listOf("प्रत्येक दूसरी खाली रेड के बाद", "लगातार दो खाली (Empty) रेड के बाद तीसरी रेड में अंक लेना अनिवार्य होता है, अन्यथा रेडर आउट घोषित होता है", "मैच के आखिरी 5 मिनट में", "जब टीम में केवल 2 डिफेंडर बचें"),
            listOf("After every second empty raid", "Triggered after two consecutive empty raids; the 3rd raider must score a touch/bonus point or is declared out", "In the final 5 minutes of each half", "When only two defenders remain on court"),
            1,
            "कबड्डी में जब कोई टीम लगातार 2 खाली (Empty) रेड करती है (जिसमें कोई अंक नहीं मिलता), तो तीसरी रेड 'डू ऑर डाई' (Do-or-Die Raid) बन जाती है। इसमें रेडर को या तो टच पॉइंट या बोनस पॉइंट लेना अनिवार्य होता है, वरना वह आउट हो जाता है।",
            "In Kabaddi, a 'Do-or-Die Raid' is triggered when a team completes two successive empty raids. The raider in the third raid must score a point or is declared out.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m6_q2", "spt_8",
            "कबड्डी में 'सुपर टैकल' (Super Tackle) क्या होता है और सफल सुपर टैकल पर डिफेंडिंग टीम को कितने अंक मिलते हैं?",
            "In Kabaddi, what constitutes a 'Super Tackle' and how many points are awarded to the defending team for executing it successfully?",
            listOf("जब 5 या अधिक डिफेंडर हों, 3 अंक", "जब डिफेंडिंग टीम के कोर्ट में 3 या उससे कम डिफेंडर हों और वे रेडर को टैकल करें, तो 2 अंक मिलते हैं (2 points when ≤ 3 defenders tackle raider)", "जब बोनस लाइन पर टैकल हो, 2 अंक", "जब कप्तान टैकल करे, 3 अंक"),
            listOf("When 5+ defenders tackle, 3 points", "When the defending team has 3 or fewer players on court and successfully captures the raider, earning 2 points", "When tackled at bonus line, 2 points", "When captain executes tackle, 3 points"),
            1,
            "जब बचाव दल (Defending Team) में कोर्ट पर 3 या उससे कम (1, 2 या 3) खिलाड़ी शेष हों और वे रेडर को सफलतापूर्वक टैकल कर लें, तो इसे 'सुपर टैकल' कहा जाता है और इसके लिए सामान्य 1 अंक के स्थान पर 2 अंक मिलते हैं।",
            "A Super Tackle occurs when a defending team of 3 or fewer players successfully traps and stops an opposing raider, earning 2 points instead of the standard 1.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m6_q3", "spt_8",
            "2022 में शुरू की गई 'अल्टीमेट खो-खो' (Ultimate Kho Kho - UKK) के पहले संस्करण का खिताब किस फ्रेंचाइजी टीम ने जीता था?",
            "Inaugurated in August 2022, which franchise team won the inaugural season championship of the Ultimate Kho Kho (UKK) league?",
            listOf("गुजरात जायंट्स", "ओडिशा जगरनॉट्स (Odisha Juggernauts - Defeated Telugu Yoddhas 46-45 in UKK inaugural final)", "तेलुगु योद्धाज", "मुंबई खिलाड़ीज"),
            listOf("Gujarat Giants", "Odisha Juggernauts (Defeated Telugu Yoddhas in a nail-biting final 46-45 at Shree Shiv Chhatrapati Sports Complex)", "Telugu Yoddhas", "Mumbai Khiladis"),
            1,
            "अल्टीमेट खो-खो (UKK) के पहले सीजन (2022) में 'ओडिशा जगरनॉट्स' ने रोमांचक फाइनल में तेलुगु योद्धाज को 46-45 से हराकर खिताब जीता। दूसरे सीजन (2024) में 'गुजरात जायंट्स' चैंपियन बनी।",
            "Odisha Juggernauts won the inaugural 2022 Ultimate Kho Kho championship by defeating Telugu Yoddhas 46-45 in Pune, revolutionizing professional Kho Kho broadcasting.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q4", "spt_8",
            "पारंपरिक मल्ल-विद्या 'मलखंब' में प्रयुक्त होने वाला लकड़ी का खंभा किस लकड़ी से बनाया जाता है और उस पर फिसलन रोकने व सुरक्षा के लिए क्या लगाया जाता है?",
            "In traditional Pole Mallakhamb, the central pillar is typically carved from which hardwood and treated with which natural substance to provide grip and reduce friction burns?",
            listOf("बांस, सरसों का तेल", "सागौन (Teak) या शीशम (Rosewood), अरंडी का तेल (Castor oil) लगाया जाता है", "नीम, नारियल तेल", "साल, चन्दन लेप"),
            listOf("Bamboo, Mustard oil", "Teak (Sheesham/Sagwan) polished smooth and lubricated with Castor Oil (Arandi ka Tel)", "Neem, Coconut oil", "Sal, Sandalwood paste"),
            1,
            "मलखंब का खंभा सागौन (Teakwood) या शीशम की चिकनी लकड़ी से बनाया जाता है, जिसकी ऊंचाई लगभग 2.6 मीटर और आधार व्यास 55 सेमी होता है। त्वचा की रगड़ और चोट से बचाने के लिए इस पर अरंडी का तेल (Castor oil) लगाया जाता है।",
            "Standard Pole Mallakhamb utilizes a tapered teakwood or rosewood trunk treated with castor oil to reduce friction burns and facilitate swift aerial transitions.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q5", "spt_8",
            "ओडिशा की पारंपरिक मार्शल आर्ट जिसमें योद्धा नर्तक ढाल और तलवार लेकर युद्ध मुद्राओं का प्रदर्शन करते हैं और जो 1817 के स्वतंत्रता संग्राम से जुड़ी है, क्या कहलाती है?",
            "Rooted in the warrior class of Odisha that led the historic 1817 Paika Rebellion against the British East India Company, which martial dance/combat art is practiced in traditional gymnasiums?",
            listOf("थांग-ता", "पाइक अखाड़ा (Paika Akhada / Paika Nrutya, Odisha - Warrior martial art of Paikas)", "मर्दानी खेल", "सिलंबम"),
            listOf("Thang-Ta", "Paika Akhada (Odisha - Traditional martial art and battle dance of the Paika warrior clan under Bakshi Jagabandhu)", "Mardani Khel", "Silambam"),
            1,
            "पाइक अखाड़ा (Paika Akhada) ओडिशा के पाइक सैनिकों (कृषक योद्धाओं) की युद्ध कला है, जिन्होंने बख्शी जगबंधु के नेतृत्व में 1817 का प्रसिद्ध 'पाइक विद्रोह' किया था। इसमें तलवार, लाठी, ढाल और कलाबाजी का अनूठा प्रदर्शन होता है।",
            "Paika Akhada is an ancient martial art of Odisha practiced by the Paika militia, blending dynamic acrobatics, swordplay, and stick fighting.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q6", "spt_8",
            "असम में माघ बिहू (भोगली बिहू) उत्सव के अवसर पर अहोम राजवंश के समय से आयोजित होने वाली पारंपरिक 'भैंसों की लड़ाई' (Buffalo Fight) किस नाम से जानी जाती है?",
            "Associated with the historical Ahom kings and held during the Magh Bihu festival in Ahatguri (Morigaon, Assam), which traditional buffalo-fight event is organized?",
            listOf("कंबाला", "मोह-झुज (Moh-Juj / Mohor Juj - Traditional Assamese Buffalo Fight during Magh Bihu)", "बुल फाइट", "जल्लीकट्टू"),
            listOf("Kambala", "Moh-Juj (Assam - Traditional buffalo fight festival practiced since the Ahom Kingdom at Rang Ghar during Magh Bihu)", "Bull Fight", "Jallikattu"),
            1,
            "मोह-झुज (Moh-Juj) असम का पारंपरिक खेल है जिसमें माघ बिहू के अवसर पर मोरीगांव के अहतगुरी में भैंसों की कुश्ती कराई जाती है। इसकी शुरुआत अहोम राजा स्वर्गादेव रुद्र सिंह ने 18वीं सदी में रंग घर के सामने की थी।",
            "Moh-Juj is a traditional buffalo fighting festival in Assam organized during Magh Bihu, tracing its patronage back to the royal Ahom dynasty.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q7", "spt_8",
            "मणिपुर का पारंपरिक 'नंगे पैर खेला जाने वाला रग्बी' (Foot Rugby) जिसमें खिलाड़ी तेल लगे नारियल को लेकर गोल रेखा तक दौड़ते हैं, क्या कहलाता है?",
            "Which unique traditional rugby-like game of Manipur involves players wrestling and racing barefoot to carry an oiled coconut (Dheb) across the opposing goal line?",
            listOf("सगोल कांगजेई", "युबी लाकपी (Yubi Lakpi - Traditional Manipuri coconut rugby / 'Snatching the Coconut')", "खोंग कांगजेई", "मुकना"),
            listOf("Sagol Kangjei", "Yubi Lakpi (Manipur - Traditional 7-a-side barefoot rugby played with a grease-coated coconut)", "Khong Kangjei", "Mukna"),
            1,
            "युबी लाकपी (Yubi Lakpi) मणिपुर का पारंपरिक खेल है जिसका अर्थ है 'नारियल छीनना'। इसमें 7-7 खिलाड़ी बिना जूतों के तेल लगे चिकने नारियल को छीनकर गोल रेखा पार कराने की होड़ करते हैं। इसे मणिपुर का रग्बी कहा जाता है।",
            "Yubi Lakpi is a traditional game played in Manipur that closely resembles rugby, where players compete to score by carrying a greased coconut across the goal line.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q8", "spt_8",
            "मणिपुर की पारंपरिक 'फील्ड हॉकी' (Manipuri Field Hockey) जो बांस की छड़ियों और खजूर के रेशे से बनी गेंद से 7-7 खिलाड़ियों द्वारा खेली जाती है, क्या कहलाती है?",
            "Which traditional form of field hockey played with curved bamboo sticks and a seasoned root/bamboo ball is indigenous to Manipur?",
            listOf("सगोल कांगजेई", "खोंग कांगजेई (Khong Kangjei - Traditional Manipuri Field Hockey & Foot Polo)", "युबी लाकपी", "थांग-ता"),
            listOf("Sagol Kangjei", "Khong Kangjei (Manipur - Indigenous foot polo/hockey where players can also tackle and grapple with opponents)", "Yubi Lakpi", "Thang-Ta"),
            1,
            "खोंग कांगजेई (Khong Kangjei) मणिपुर की पारंपरिक जमीनी हॉकी है (खोंग = पैर, कांगजेई = हॉकी स्टिक)। इसमें खिलाड़ी बांस की घुमावदार स्टिक से गेंद मारते हैं और विपक्षी खिलाड़ियों को टैकल व कुश्ती (मुकना) भी कर सकते हैं।",
            "Khong Kangjei is a traditional Manipuri hockey game combining running, stick-handling, and martial wrestling techniques.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q9", "spt_8",
            "आंध्र प्रदेश और तेलंगाना में संक्रांति उत्सव के दौरान आयोजित होने वाली पारंपरिक 'मुर्गों की लड़ाई' (Cockfight) किस नाम से जानी जाती है?",
            "Widely organized in the Godavari districts of Andhra Pradesh during Sankranti, which traditional rooster-fighting sport is known regionally?",
            listOf("जल्लीकट्टू", "कोडी पंडेम (Kodi Pandem / Cockfighting in Andhra Pradesh during Makar Sankranti)", "कंबाला", "मोह-झुज"),
            listOf("Jallikattu", "Kodi Pandem (Andhra Pradesh & Telangana - Traditional Sankranti rooster fight sporting custom)", "Kambala", "Moh-Juj"),
            1,
            "कोडी पंडेम (Kodi Pandem) आंध्र प्रदेश (विशेषकर पूर्वी व पश्चिमी गोदावरी, कृष्णा जिलों) का पारंपरिक मुर्गों का मुकाबला है जो मकर संक्रांति के दौरान सदियों से आयोजित होता आ रहा है।",
            "Kodi Pandem is a traditional rooster-fight event deeply entrenched in the folk customs of coastal Andhra Pradesh during the Sankranti harvest festival.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m6_q10", "spt_8",
            "मणिपुर की पारंपरिक लोक कुश्ती (Folk Wrestling) जिसमें पहलवान धोती और कमरबंद (Kanglei) पकड़कर प्रतिद्वंद्वी की पीठ जमीन पर लगाने का प्रयास करते हैं, क्या कहलाती है?",
            "Which traditional belt-wrestling martial art of Manipur requires contestants to grip each other's waistcloth (Ningri) to throw the opponent flat on their back?",
            listOf("मलखंब", "मुकना (Mukna - Traditional Manipuri Folk Belt-Wrestling)", "थांग-ता", "कलारिपयाट्टू"),
            listOf("Mallakhamb", "Mukna (Manipur - Ancient style of folk wrestling practiced during Lai Haraoba festivals)", "Thang-Ta", "Kalaripayattu"),
            1,
            "मुकना (Mukna) मणिपुर की पारंपरिक कुश्ती है जो लई हरोबा उत्सवों और राजाओं के काल से प्रचलित है। इसमें पहलवान केवल कमरबंद पकड़कर पैर के दांव-पेंच (Leg locks & trips) से प्रतिद्वंद्वी को गिराते हैं।",
            "Mukna is a popular indigenous form of folk wrestling from Manipur characterized by complex tripping and throwing techniques.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q11", "spt_8",
            "हिमाचल प्रदेश के कुल्लू और शिमला क्षेत्रों में आयोजित होने वाला पारंपरिक 'धनुष-बाण' का युद्ध-खेल (Archery War Dance) कौन-सा है जिसमें प्रतिभागी लकड़ी के तीरों से पैरों पर निशाना साधते हैं?",
            "Practiced during Baisakhi in Himachal Pradesh, which traditional martial archery martial sport divides participants into 'Satha' (Kauravas) and 'Pasha' (Pandavas) aiming blunted arrows at lower limbs?",
            listOf("गटका", "ठोडा (Thoda - Martial Archery dance sport of Himachal Pradesh / Satha vs Pasha)", "सिलंबम", "मर्दानी खेल"),
            listOf("Gatka", "Thoda (Himachal Pradesh - Traditional archery martial art blending dance, music, and arrows aimed below the knee)", "Silambam", "Mardani Khel"),
            1,
            "ठोडा (Thoda) हिमाचल प्रदेश का प्रसिद्ध पारंपरिक युद्ध-खेल है जो महाभारत के कौरव (साठा) और पांडव (पाशा) के युद्ध का प्रतीक है। इसमें धनुर्धर विरोधी के घुटने से नीचे पिंडलियों पर लकड़ी के तीर से सटीक निशाना लगाते हैं।",
            "Thoda is a traditional martial archery art form from Himachal Pradesh, enacted by descendants of mythological warriors during harvest fairs.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q12", "spt_8",
            "लद्दाख और जम्मू-कश्मीर का प्रसिद्ध शीतकालीन खेल 'आइस हॉकी' (Ice Hockey) भारत में मुख्य रूप से किस प्राकृतिक जमे हुए मैदान पर खेला जाता है?",
            "Known as the highest natural ice-rink destination in India, which region in Ladakh serves as the premier hub for high-altitude Ice Hockey tournaments in winter?",
            listOf("गुलमर्ग", "करगू व लेह (Karzoo Ice Rink & Nimu, Leh-Ladakh - Highest Ice Hockey arena in India)", "मनाली", "औली"),
            listOf("Gulmarg", "Leh & Kargil (Ladakh - Karzoo Ring, Drass & Nimu high-altitude natural frozen ice sheets)", "Manali", "Auli"),
            1,
            "लद्दाख (लेह और कारगिल) भारत में आइस हॉकी की राजधानी माना जाता है। लेह का 'कर्ज़ू आइस रिंक' (Karzoo Ice Rink) दुनिया के सबसे ऊंचे प्राकृतिक बर्फ के मैदानों में से एक है जहाँ माइनस 20°C तापमान में राष्ट्रीय आइस हॉकी चैंपियनशिप आयोजित होती है।",
            "Ladakh (Leh and Kargil) is the epicentre of Ice Hockey in India, hosting national ice championships on natural high-altitude frozen rinks.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m6_q13", "spt_8",
            "मिजोरम का पारंपरिक खेल जिसमें दो प्रतिभागी एक-दूसरे के सिर को कपड़े की पट्टी से जोड़कर गर्दन और सिर के बल से खींचते हैं (Neck Wrestling), क्या कहलाता है?",
            "Which unique traditional neck-strength indigenous sport of Mizoram involves two contestants testing head and neck pulling power tied with a cloth strap?",
            listOf("इंसुखनव", "इंसुनाव्न (Insuhnaw / Insuknaw - Indigenous Mizo pole/neck wrestling contest)", "युबी लाकपी", "ठोडा"),
            listOf("Inbuan", "Insuknaw / Inbuan (Mizoram - Traditional strength sports of the Mizo people testing core and neck endurance)", "Yubi Lakpi", "Thoda"),
            1,
            "इंसुकनाव (Insuknaw) और इनबुआन (Inbuan) मिजोरम के पारंपरिक खेल हैं। 'इनबुआन' मिजो कुश्ती है जिसमें कमरबंद पकड़ा जाता है, जबकि 'इंसुकनाव' में गोल लकड़ी के डंडे को धकेलने की शक्ति की परीक्षा होती है।",
            "Inbuan and Insuknaw are indigenous combat strength games of Mizoram that have been practiced for centuries across tribal festivals.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_8_m6_q14", "spt_8",
            "एशियाई खेलों (Asian Games) में 'कबड्डी' को पहली बार किस वर्ष आधिकारिक पदक खेल (Official Medal Sport) के रूप में शामिल किया गया था?",
            "In which year's Asian Games was Men's Kabaddi first introduced as an official competitive medal sport, with India winning the historic gold?",
            listOf("1982 नई दिल्ली", "1990 बीजिंग एशियाई खेल (1990 Beijing Asian Games - India won first official gold in Men's Kabaddi)", "1994 हिरोशिमा", "1998 बैंकॉक"),
            listOf("1982 New Delhi", "1990 Beijing Asian Games (Men's Kabaddi debuted as a full medal sport; India won gold)", "1994 Hiroshima", "1998 Bangkok"),
            1,
            "पुरुष कबड्डी को 1990 के बीजिंग एशियाई खेलों में पहली बार आधिकारिक पदक खेल के रूप में शामिल किया गया, जहाँ भारत ने स्वर्ण पदक जीता। महिला कबड्डी को 2010 के ग्वांगझू एशियाई खेलों में शामिल किया गया था।",
            "Men's Kabaddi was inaugurated as an official medal sport at the 1990 Beijing Asian Games, while Women's Kabaddi was included in 2010 Guangzhou.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m6_q15", "spt_8",
            "भारत के पारंपरिक खेल 'गिल्ली-डंडा' (Gilli-Danda) का इतिहास किस प्राचीन सभ्यता से जुड़ा माना जाता है और यह आधुनिक किस वैश्विक खेल का अग्रदूत माना जाता है?",
            "Originating over 2,500 years ago during the Maurya/Vedic periods, the traditional Indian street sport 'Gilli-Danda' is widely considered a precursor to which modern global bat-and-ball sports?",
            listOf("फुटबॉल और हॉकी", "क्रिकेट और बेसबॉल (Cricket and Baseball / Softball)", "बैडमिंटन और टेनिस", "पोलो और गोल्फ"),
            listOf("Football and Hockey", "Cricket and Baseball (Early bat-and-spindle hitting mechanics sharing roots with Tip-Cat and Cricket)", "Badminton and Tennis", "Polo and Golf"),
            1,
            "गिल्ली-डंडा (Gilli-Danda) भारत का प्राचीन खेल है जिसमें एक बड़े डंडे (Danda) से दोनों सिरों पर तराशी गई छोटी लकड़ी (Gilli) को हवा में उछालकर मारा जाता है। इसे आधुनिक क्रिकेट, बेसबॉल और ब्रिटिश 'टिप-कैट' खेल का पूर्वज माना जाता है।",
            "Gilli-Danda is an ancient Indian pastime dating back thousands of years, widely acknowledged by sports historians as an early conceptual ancestor of Cricket and Baseball.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_8", 7, 10, baseQuestions)
    }
}
