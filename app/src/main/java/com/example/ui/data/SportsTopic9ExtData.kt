package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic9ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_9_m6_q1", "spt_9",
            "शतरंज में राजा (King) और हाथी (Rook) की विशेष संयुक्त चाल, जो राजा की सुरक्षा और हाथी को सक्रिय करने के लिए एक ही चाल में की जाती है, क्या कहलाती है?",
            "What is the unique special move in chess in which a player moves the King two squares toward a Rook and then hops the Rook over the King, accomplished in a single turn?",
            listOf("एन पासेंट (En Passant)", "कैसलिंग (Castling - Kingside/Short O-O or Queenside/Long O-O-O)", "चेकमेट (Checkmate)", "फोर्क (Fork)"),
            listOf("En Passant", "Castling (A defensive maneuver permissible only if neither the King nor the chosen Rook has moved prior)", "Checkmate", "Fork"),
            1,
            "कैसलिंग (Castling) शतरंज में राजा और हाथी की संयुक्त चाल है। यह राजा की सुरक्षा और हाथी को केंद्र में लाने के लिए की जाती है। यह तभी संभव है जब राजा और हाथी दोनों ने इससे पहले कोई चाल न चली हो और उनके बीच कोई मोहरा न हो तथा राजा चेक में न हो।",
            "Castling is a special move in chess involving the king and either rook. It is the only move allowing two pieces to move in the same turn and the only move where the king moves two squares.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q2", "spt_9",
            "शतरंज में जब किसी खिलाड़ी की बारी हो और उसका राजा 'चेक' में न हो, लेकिन उसके पास चलने के लिए कोई भी वैध (Legal) चाल न बची हो, तो मैच अनिर्णीत समाप्त होता है। इस स्थिति को क्या कहते हैं?",
            "In chess, what is the game situation called where the player whose turn it is to move is NOT in check, but has no legal moves available, resulting in an immediate drawn game?",
            listOf("चेकमेट (Checkmate)", "स्टेलमेट (Stalemate / Patt - Game declared a Draw)", "रिजाइन (Resignation)", "टाइम आउट (Time forfeit)"),
            listOf("Checkmate", "Stalemate (Results in an immediate half-point draw for both players)", "Resignation", "Time forfeit"),
            1,
            "स्टेलमेट (Stalemate) वह स्थिति है जब जिस खिलाड़ी की बारी हो, उसका राजा चेक (Check) में नहीं होता लेकिन बोर्ड पर चलने के लिए कोई भी वैध चाल नहीं होती। स्टेलमेट होते ही मैच तुरंत ड्रॉ (बराबर) घोषित हो जाता है और दोनों को 0.5-0.5 अंक मिलते हैं।",
            "A stalemate is a situation in chess whereby the player whose turn it is to move is not in check and has no legal move. Stalemate results in an immediate draw.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q3", "spt_9",
            "3000 मीटर स्टीपलचेज़ (3000m Steeplechase) स्पर्धा में राष्ट्रीय रिकॉर्ड धारक और 2022 बर्मिंघम राष्ट्रमंडल खेलों में रजत पदक जीतने वाले भारतीय सेना के एथलीट कौन हैं?",
            "Who holds the Indian national record in the Men's 3000m Steeplechase (8:09.91) and won a historic Silver medal breaking Kenyan dominance at the 2022 Commonwealth Games in Birmingham?",
            listOf("बहादुर प्रसाद", "अविनाश साबले (Avinash Sable - Commonwealth Games 2022 Silver & Asian Games 2022 Gold in 3000m Steeplechase)", "मुरली श्रीशंकर", "तेजिंदरपाल सिंह तूर"),
            listOf("Bahadur Prasad", "Avinash Sable (Maharashtra/Indian Army distance runner who won Steeplechase Gold at 2022 Asian Games)", "Murali Sreeshankar", "Tajinderpal Singh Toor"),
            1,
            "अविनाश साबले (बीड, महाराष्ट्र / भारतीय सेना) ने 3000 मीटर स्टीपलचेज़ में 8:09.91 का राष्ट्रीय रिकॉर्ड बनाया। उन्होंने 2022 राष्ट्रमंडल खेलों में केन्याई धावकों के 24 साल के दबदबे को तोड़ते हुए रजत पदक जीता और 2022 एशियाई खेलों में स्वर्ण पदक जीता।",
            "Avinash Sable is an Indian track and field athlete who specializes in the 3000 metres steeplechase, breaking the national record multiple times and winning historic international medals.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q4", "spt_9",
            "पुरुषों की शॉट पुट (गोला फेंक / Shot Put) स्पर्धा में 21.77 मीटर फेंककर एशियाई रिकॉर्ड बनाने वाले और दो बार के एशियाई खेलों के स्वर्ण पदक विजेता भारतीय एथलीट कौन हैं?",
            "Holding the Asian record in Men's Shot Put with a massive throw of 21.77m and winning back-to-back Asian Games Gold medals (2018 Jakarta & 2022 Hangzhou), who is this Indian thrower?",
            listOf("इंदरजीत सिंह", "तेजिंदरपाल सिंह तूर (Tajinderpal Singh Toor - Asian Record Holder & double Asian Games Gold medalist)", "ओम प्रकाश करहाना", "शक्ति सिंह"),
            listOf("Inderjeet Singh", "Tajinderpal Singh Toor (Punjab shot putter who broke the Asian record with 21.77m in 2023)", "Om Prakash Karhana", "Shakti Singh"),
            1,
            "तेजिंदरपाल सिंह तूर (मोगा, पंजाब) भारत के प्रमुख शॉट पुटर हैं जिन्होंने 2023 में 21.77 मीटर का एशियाई रिकॉर्ड बनाया। उन्होंने 2018 जकार्ता और 2022 हांग्जो एशियाई खेलों में लगातार दो स्वर्ण पदक जीते।",
            "Tajinderpal Singh Toor is an Indian shot putter who holds the outdoor Asian record with a throw of 21.77 metres and won gold at the 2018 and 2022 Asian Games.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_9_m6_q5", "spt_9",
            "पेरिस 2024 ओलंपिक में पुरुषों की 50 मीटर राइफल 3-पोजीशन (50m Rifle 3 Positions) स्पर्धा में कांस्य पदक जीतकर इस स्पर्धा में पदक जीतने वाले पहले भारतीय निशानेबाज कौन बने?",
            "At the Paris 2024 Olympic Games, which Indian marksman won the historic Bronze medal in the Men's 50m Rifle 3 Positions event at Châteauroux shooting range?",
            listOf("ऐश्वर्य प्रताप सिंह तोमर", "स्वप्निल कुसाले (Swapnil Kusale - First Indian shooter to win an Olympic medal in 50m Rifle 3 Positions)", "संजीव राजपूत", "गगन नारंग"),
            listOf("Aishwary Pratap Singh Tomar", "Swapnil Kusale (Central Railway Travelling Ticket Examiner from Kolhapur who clinched Paris 2024 Bronze)", "Sanjeev Rajput", "Gagan Narang"),
            1,
            "स्वप्निल कुसाले (कोल्हापुर, महाराष्ट्र) ने पेरिस 2024 ओलंपिक में 50 मीटर राइफल 3-पोजीशन (नीलिंग, प्रोन और स्टैंडिंग) में 451.4 के स्कोर के साथ कांस्य पदक जीता। वे इस स्पर्धा में ओलंपिक पदक जीतने वाले पहले भारतीय हैं।",
            "Swapnil Kusale is an Indian sport shooter who won the bronze medal in the men's 50 metre rifle three positions event at the 2024 Summer Olympics.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q6", "spt_9",
            "2002 में भारत की पहली महिला ग्रैंडमास्टर (Woman Grandmaster - WGM) बनने वाली और 2002 में 15 वर्ष की उम्र में सबसे कम उम्र की अंतरराष्ट्रीय ग्रैंडमास्टर (GM) बनने वाली भारतीय शतरंज खिलाड़ी कौन हैं?",
            "Who became India's first female Grandmaster (GM) in chess in 2002 and won the FIDE Women's World Rapid Chess Championship title in 2019?",
            listOf("हरिका द्रोणावल्ली", "कोनेरू हम्पी (Koneru Humpy - First Indian Woman to achieve full GM title & 2019 World Rapid Champion)", "वैशाली रमेशबाबू", "तानिया सचदेव"),
            listOf("Harika Dronavalli", "Koneru Humpy (Grandmaster from Andhra Pradesh; achieved GM title at age 15 in 2002; World Rapid Champion 2019)", "Vaishali Rameshbabu", "Tania Sachdev"),
            1,
            "कोनेरू हम्पी (गुंटूर, आंध्र प्रदेश) 2002 में 15 वर्ष की आयु में जुडिट पोलगर का रिकॉर्ड तोड़कर ग्रैंडमास्टर (GM) खिताब पाने वाली दुनिया की सबसे युवा महिला बनी थीं। उन्होंने 2019 में विश्व रैपिड शतरंज चैंपियनशिप का खिताब जीता।",
            "Koneru Humpy is an Indian chess grandmaster. In 2002, she became the youngest woman ever to achieve the title of grandmaster at the age of 15 years, 1 month, 27 days.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q7", "spt_9",
            "शतरंज में भाई और बहन की दुनिया की पहली ऐसी जोड़ी जिसने दोनों ने 'ग्रैंडमास्टर' (Grandmaster - GM) का खिताब हासिल किया है, कौन है?",
            "Who are the world's first brother-sister duo in chess history to both achieve the prestigious open 'Grandmaster' (GM) title?",
            listOf("निहाल सरीन और दिव्या देशमुख", "आर. प्रज्ञानानंदा और आर. वैशाली (R. Praggnanandhaa & R. Vaishali - First brother-sister Grandmaster duo)", "विदित गुजराती और तानिया सचदेव", "गुकेश डी और वंतिका अग्रवाल"),
            listOf("Nihal Sarin & Divya Deshmukh", "R. Praggnanandhaa and Rameshbabu Vaishali (First siblings in history to both hold the full FIDE Grandmaster title)", "Vidit Gujrathi & Tania Sachdev", "Gukesh D & Vantika Agrawal"),
            1,
            "रमेशबाबू प्रज्ञानानंदा (2018 में जीएम) और उनकी बड़ी बहन रमेशबाबू वैशाली (2023 में जीएम) शतरंज इतिहास में दुनिया के पहले भाई-बहन बने जिन्होंने दोनों ने सर्वोच्च ग्रैंडमास्टर खिताब हासिल किया और 2024 कैंडिडेट्स टूर्नामेंट में एक साथ खेले।",
            "Rameshbabu Praggnanandhaa and Rameshbabu Vaishali are the first brother and sister duo in chess history to become Grandmasters and qualify for Candidates.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q8", "spt_9",
            "एथलेटिक्स में 'डेकाथलॉन' (Decathlon) पुरुषों की एक बहु-स्पर्धा प्रतियोगिता होती है जिसमें 2 दिनों में कुल कितनी स्पर्धाएं आयोजित की जाती हैं?",
            "In track and field athletics, how many distinct track and field disciplines make up the men's two-day 'Decathlon' competition?",
            listOf("7 स्पर्धाएं", "10 स्पर्धाएं (10 disciplines over 2 consecutive days: 100m, Long Jump, Shot Put, High Jump, 400m, 110m Hurdles, Discus, Pole Vault, Javelin, 1500m)", "12 स्पर्धाएं", "8 स्पर्धाएं"),
            listOf("7 events (Heptathlon)", "10 events (Decathlon - Day 1: 100m, LJ, SP, HJ, 400m; Day 2: 110m H, DT, PV, JT, 1500m)", "12 events", "8 events"),
            1,
            "डेकाथलॉन (Decathlon) में 10 स्पर्धाएं होती हैं जो 2 दिनों में लड़ी जाती हैं। महिलाओं के लिए 'हेप्टाथलॉन' (Heptathlon) होती है जिसमें 7 स्पर्धाएं होती हैं (जैसे स्वप्ना बर्मन ने 2018 में स्वर्ण जीता)।",
            "The decathlon is a combined event in athletics consisting of ten track and field events held across two consecutive days, with the winner crowned the 'World's Greatest Athlete'.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q9", "spt_9",
            "मैराथन दौड़ (Marathon Race) की आधिकारिक मानक दूरी कितनी तय की गई है?",
            "What is the official standard distance of a regulation Marathon race officially recognized by World Athletics and the IOC?",
            listOf("40.000 किलोमीटर (24.85 मील)", "42.195 किलोमीटर (26 मील 385 गज / 26.2 miles / 42.195 km)", "45.500 किलोमीटर (28.27 मील)", "38.250 किलोमीटर (23.76 मील)"),
            listOf("40.000 km", "42.195 kilometers (26 miles 385 yards / 42.195 km established at the 1908 London Olympics)", "45.500 km", "38.250 km"),
            1,
            "मैराथन की आधिकारिक दूरी 42.195 किमी (26 मील 385 गज) होती है। यह दूरी 1908 के लंदन ओलंपिक में विंडसर कैसल से व्हाइट सिटी स्टेडियम के शाही बॉक्स के सामने तक तय की गई थी और 1921 में इसे स्थायी मानक बनाया गया।",
            "The marathon is a long-distance foot race with an official distance of 42.195 kilometres (26 miles 385 yards), standardized in 1921 following the 1908 London Olympic course.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q10", "spt_9",
            "पुरुषों की 'भाला फेंक' (Javelin Throw) स्पर्धा में प्रयुक्त होने वाले भाले का न्यूनतम मानक वजन कितना होता है?",
            "What is the standard official minimum weight of the javelin used in senior men's international track and field competitions?",
            listOf("600 ग्राम (महिलाओं का)", "800 ग्राम (Senior Men's Javelin Weight = 800 grams / Length: 2.60 to 2.70 meters)", "900 ग्राम", "750 ग्राम"),
            listOf("600 grams (Senior Women's weight)", "800 grams (Senior Men's weight: minimum 800g, length 2.6-2.7m)", "900 grams", "750 grams"),
            1,
            "वरिष्ठ पुरुषों के भाले का न्यूनतम वजन 800 ग्राम और लंबाई 2.6 से 2.7 मीटर होती है। महिलाओं के भाले का न्यूनतम वजन 600 ग्राम और लंबाई 2.2 से 2.3 मीटर होती है।",
            "In men's javelin throw, the regulation implement weighs a minimum of 800 grams (length 2.60-2.70m), whereas the women's javelin weighs 600 grams (length 2.20-2.30m).",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q11", "spt_9",
            "बिना दोनों हाथों (Arms) के पैरों से तीर चलाकर 2023 विश्व तीरंदाजी पैरा चैंपियनशिप और 2022 पैरा एशियाई खेलों में स्वर्ण पदक जीतने वाली 'शीतल देवी' किस राज्य/केंद्र शासित प्रदेश से हैं?",
            "Hailing from Kishtwar, who made global headlines as the world's first armless female archer (shooting with feet) to win double Gold at the 2022 Asian Para Games and Paris 2024 Bronze?",
            listOf("लद्दाख", "जम्मू और कश्मीर (Sheetal Devi - Armless archer from Kishtwar, J&K / Arjuna Awardee)", "हिमाचल प्रदेश", "पंजाब"),
            listOf("Ladakh", "Jammu and Kashmir (Sheetal Devi - Born with Phocomelia; won 2 Golds at Hangzhou Para Asian Games 2022 and Bronze at Paris 2024 Paralympics)", "Himachal Pradesh", "Punjab"),
            1,
            "शीतल देवी (किश्तवाड़, जम्मू और कश्मीर) बिना हाथों के पैरों और ठोड़ी की मदद से तीरंदाजी करने वाली विश्व की पहली महिला तीरंदाज हैं। उन्होंने हांग्जो 2022 एशियाई पैरा खेलों में 2 स्वर्ण जीते और पेरिस 2024 पैरालंपिक में मिक्स्ड टीम कांस्य पदक जीता।",
            "Sheetal Devi is an Indian para-archer from Kishtwar, Jammu & Kashmir, who became the world's first armless female archer to compete using her legs and feet, winning multiple international medals.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q12", "spt_9",
            "भारतीय एथलेटिक्स में पुरुषों की 'लंबी कूद' (Long Jump) में 8.42 मीटर का राष्ट्रीय रिकॉर्ड धारक एथलीट कौन है?",
            "Who holds the Indian outdoor national record in Men's Long Jump with a massive leap of 8.42 meters set at Bhubaneswar in 2023?",
            listOf("अमृतपाल सिंह", "जेसविं एल्ड्रिन (Jeswin Aldrin - 8.42m national record) / मुरली श्रीशंकर (M. Sreeshankar - 8.41m)", "अंकित शर्मा", "टी. सी. योहन्नान"),
            listOf("Amritpal Singh", "Jeswin Aldrin (Set national record of 8.42m at Indian Grand Prix 2023 in Bellary) / Murali Sreeshankar", "Ankit Sharma", "T. C. Yohannan"),
            1,
            "जेसविं एल्ड्रिन (तमिलनाडु) ने 2023 में 8.42 मीटर की छलांग लगाकर भारत का राष्ट्रीय रिकॉर्ड बनाया। उनके निकटतम प्रतिद्वंद्वी मुरली श्रीशंकर (केरल) ने 8.41 मीटर की छलांग लगाई है और राष्ट्रमंडल खेलों में रजत पदक जीता है।",
            "Jeswin Aldrin holds the Indian national long jump record of 8.42 metres set in March 2023, while Murali Sreeshankar holds the Commonwealth Games silver medal.",
            "Moderate"
        ),
        makeSportsQ(
            "spt_9_m6_q13", "spt_9",
            "शतरंज में खिलाड़ियों के कौशल और शक्ति को मापने के लिए प्रयुक्त होने वाली अंतरराष्ट्रीय रेटिंग प्रणाली को किस नाम से जाना जाता है?",
            "What is the mathematical rating system used by the International Chess Federation (FIDE) to calculate the relative skill levels of chess players called?",
            listOf("एटीपी रैंकिंग", "एलो रेटिंग प्रणाली (Elo Rating System - Developed by Arpad Elo)", "हैंडीकैप इंडेक्स", "फिडे स्कोर"),
            listOf("ATP Ranking", "Elo Rating System (Created by Hungarian-American physics professor Arpad Elo; 2500+ for GM title)", "Handicap Index", "FIDE Score"),
            1,
            "शतरंज में खिलाड़ियों की क्षमता मापने के लिए 'एलो रेटिंग प्रणाली' (Elo Rating) का उपयोग होता है, जिसे हंगेरियन-अमेरिकी भौतिक विज्ञानी अरापाद एलो (Arpad Elo) ने विकसित किया था। 2500+ एलो रेटिंग ग्रैंडमास्टर (GM) उपाधि की एक आवश्यक शर्त है।",
            "The Elo rating system is a method for calculating the relative skill levels of players in zero-sum games such as chess, created by physicist Arpad Elo.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q14", "spt_9",
            "विश्व शतरंज निकाय 'FIDE' (International Chess Federation) का गठन 1924 में पेरिस में हुआ था, इसका वर्तमान मुख्यालय किस शहर में स्थित है?",
            "Founded in Paris in 1924 under the motto 'Gens una sumus' (We are one family), where is the headquarters of the International Chess Federation (FIDE) located?",
            listOf("जिनेवा", "लुसाने, स्विट्जरलैंड (Lausanne, Switzerland - FIDE Headquarters)", "लंदन", "मास्को"),
            listOf("Geneva", "Lausanne, Switzerland (FIDE - Fédération Internationale des Échecs)", "London", "Moscow"),
            1,
            "FIDE (अंतर्राष्ट्रीय शतरंज महासंघ) की स्थापना 20 जुलाई 1924 को पेरिस में हुई थी (इसलिए 20 जुलाई को विश्व शतरंज दिवस मनाया जाता है)। इसका मुख्यालय लुसाने (स्विट्जरलैंड) में स्थित है। इसका आदर्श वाक्य है: 'Gens una sumus' (हम एक परिवार हैं)।",
            "The International Chess Federation (FIDE) is the governing body of international chess competition, founded in 1924 and headquartered in Lausanne, Switzerland.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m6_q15", "spt_9",
            "फॉर्मूला वन (F1) रेसिंग में किसी कार के आगे या पीछे के टायर बदलने और ईंधन/एडजस्टमेंट के लिए रुकने वाले तकनीकी क्षेत्र और टीम क्रू को क्या कहा जाता है?",
            "In Formula 1 motorsport, what is the designated service lane where cars pull in during a race for ultra-fast tire changes and wing adjustments (often under 2.0 seconds) called?",
            listOf("पैडॉक", "पिट स्टॉप / पिट लेन (Pit Stop / Pit Lane - Sub-2 second tire changes by pit crew)", "ग्रिड बॉक्स", "पार्क फर्मे"),
            listOf("Paddock", "Pit Stop / Pit Lane (Fastest recorded F1 pit stop is 1.80 seconds by McLaren at Qatar GP 2023)", "Grid Box", "Parc Fermé"),
            1,
            "पिट लेन (Pit Lane) ट्रैक के समानांतर बनी सुरक्षित लेन होती है जहाँ कारें टायर बदलने के लिए 'पिट स्टॉप' (Pit Stop) करती हैं। F1 इतिहास का सबसे तेज पिट स्टॉप 1.80 सेकंड का है, जो मैकलेरन टीम ने 2023 कतर ग्रां प्री में लांडो नोरिस की कार पर किया था।",
            "A pit stop in motorsport is a pause in the pit lane where a racing car refuels, changes tires, or undergoes repairs during a race.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_9", 7, 10, baseQuestions)
    }
}
