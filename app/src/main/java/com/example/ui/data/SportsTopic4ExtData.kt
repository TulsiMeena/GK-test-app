package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic4ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_4_m6_q1", "spt_4",
            "विश्व बैडमिंटन संघ (BWF - Badminton World Federation) का वैश्विक मुख्यालय किस शहर में स्थित है (स्थापना 1934)?",
            "Where is the global headquarters of the Badminton World Federation (BWF - established in 1934 as IBF) located?",
            listOf("लंदन (यूके)", "कुआलालंपुर, मलेशिया (Kuala Lumpur, Malaysia - Relocated in 2005)", "ज्यूरिख (स्विट्जरलैंड)", "सिंगापुर"),
            listOf("London, UK", "Kuala Lumpur, Malaysia (Headquartered here since October 2005)", "Zurich, Switzerland", "Singapore"),
            1,
            "BWF की स्थापना 1934 में लंदन (यूके) में हुई थी। 2005 में इसका मुख्यालय चेल्टनहैम (यूके) से कुआलालंपुर (मलेशिया) स्थानांतरित कर दिया गया।",
            "The Badminton World Federation (BWF) is the international governing body for badminton, headquartered in Kuala Lumpur, Malaysia.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q2", "spt_4",
            "बैडमिंटन में पुरुषों की विश्व युगल रैंकिंग में 'विश्व नंबर 1' बनने वाली और 2023 में खेल रत्न पुरस्कार पाने वाली भारत की प्रसिद्ध पुरुष युगल जोड़ी कौन-सी है?",
            "Which iconic Indian men's badminton doubles duo became World No. 1 in BWF rankings, winning Asian Games Gold 2023, Asian Championship Gold 2023, and Major Dhyan Chand Khel Ratna?",
            listOf("सानिया मिर्जा और रोहन बोपन्ना", "सात्विकसाईराज रंकीरेड्डी और चिराग शेट्टी (Satwiksairaj Rankireddy & Chirag Shetty - 'Sat-Chi')", "प्रकाश पादुकोण और सैयद मोदी", "लक्ष्य सेन और किदांबी श्रीकांत"),
            listOf("Sania Mirza & Rohan Bopanna", "Satwiksairaj Rankireddy and Chirag Shetty (First Indian doubles pair to reach BWF World No. 1 ranking)", "Prakash Padukone & Syed Modi", "Lakshya Sen & Kidambi Srikanth"),
            1,
            "सात्विकसाईराज रंकीरेड्डी (आंध्र प्रदेश) और चिराग शेट्टी (महाराष्ट्र) ने 2022 राष्ट्रमंडल स्वर्ण, 2022 थॉमस कप, 2023 एशियाई खेल स्वर्ण और 2023 एशियाई चैंपियनशिप जीतकर दुनिया की नंबर 1 युगल जोड़ी बनने का गौरव पाया।",
            "Satwiksairaj Rankireddy and Chirag Shetty are India's most successful men's doubles badminton pair in history.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q3", "spt_4",
            "महिलाओं की विश्व टीम बैडमिंटन चैंपियनशिप (Women's World Team Badminton Championship) को किस नाम से जाना जाता है (स्थापना 1956-57)?",
            "What is the premier international team competition in women's world badminton called, founded in 1956-57 by former British player Betty Uber?",
            listOf("थॉमस कप (पुरुष कप)", "उबेर कप (Uber Cup - Women's World Team Badminton Championship)", "सुदीरमन कप (मिश्रित कप)", "योनेक्स कप"),
            listOf("Thomas Cup (Men's Championship)", "Uber Cup (Instituted by Betty Uber; China has won a record 16 titles)", "Sudirman Cup", "Yonex Cup"),
            1,
            "उबेर कप (स्थापना 1956) महिलाओं की विश्व टीम बैडमिंटन चैंपियनशिप है। (पुरुषों की विश्व टीम चैंपियनशिप 'थॉमस कप' और मिश्रित टीम विश्व चैंपियनशिप 'सुदीरमन कप' कहलाती है)। चीन ने उबेर कप रिकॉर्ड 16 बार जीता है।",
            "The Uber Cup, sometimes called the World Team Championships for Women, is a major international badminton competition.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q4", "spt_4",
            "अंतर्राष्ट्रीय टेबल टेनिस महासंघ (ITTF - International Table Tennis Federation) का मुख्यालय किस शहर में स्थित है (स्थापना 1926)?",
            "Where is the headquarters of the International Table Tennis Federation (ITTF - founded in 1926) located?",
            listOf("पेरिस", "लुसाने, स्विट्जरलैंड (Lausanne, Switzerland)", "बीजिंग", "लंदन"),
            listOf("Paris", "Lausanne, Switzerland (ITTF Headquarters)", "Beijing", "London"),
            1,
            "ITTF की स्थापना 1926 में बर्लिन में हुई थी और इसके पहले अध्यक्ष इवोर मोंटागु थे। इसका मुख्यालय लुसाने (स्विट्जरलैंड) में स्थित है।",
            "The International Table Tennis Federation (ITTF) is the governing body for all national table tennis associations, based in Lausanne.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q5", "spt_4",
            "राष्ट्रमंडल खेलों (Commonwealth Games) में कुल 10 पदक (7 स्वर्ण, 3 रजत) जीतने वाले और 2022 में मेजर ध्यानचंद खेल रत्न पुरस्कार पाने वाले भारत के महानतम टेबल टेनिस खिलाड़ी कौन हैं?",
            "Who is India's most decorated table tennis legend, winning 7 Commonwealth Games Gold medals across five editions and the Major Dhyan Chand Khel Ratna in 2022?",
            listOf("साथियान गणानाशेखरन", "अचंत शरत कमल (Achanta Sharath Kamal - 10 Commonwealth Medals / Khel Ratna 2022 / Paris 2024 Flag Bearer)", "मानव ठक्कर", "हरमीत देसाई"),
            listOf("Sathiyan Gnanasekaran", "Achanta Sharath Kamal (First Indian table tennis player to become 10-time Senior National Champion; Paris 2024 Olympic flag bearer)", "Manav Thakkar", "Harmeet Desai"),
            1,
            "अचंत शरत कमल (चेन्नई, तमिलनाडु) 10 बार के राष्ट्रीय चैंपियन हैं। उन्होंने राष्ट्रमंडल खेलों में 7 स्वर्ण सहित 10 पदक और एशियाई खेलों में 2 पदक जीते। वे 2024 पेरिस ओलंपिक में भारत के ध्वजवाहक रहे।",
            "Achanta Sharath Kamal is widely regarded as the greatest table tennis player India has ever produced.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q6", "spt_4",
            "2018 राष्ट्रमंडल खेलों (गोल्ड कोस्ट) में महिला एकल टेबल टेनिस में ऐतिहासिक स्वर्ण पदक जीतने वाली और खेल रत्न (2020) प्राप्त करने वाली पहली भारतीय महिला टेबल टेनिस खिलाड़ी कौन हैं?",
            "Who became the first Indian woman table tennis player to win Commonwealth Games Women's Singles Gold (Gold Coast 2018) and Khel Ratna in 2020?",
            listOf("मौमा दास", "मणिका बत्रा (Manika Batra - CWG 2018 Singles Gold / Khel Ratna 2020 / Top 25 World Ranked)", "श्रीजा अकुला", "अहिका मुखर्जी"),
            listOf("Mouma Das", "Manika Batra (Won 4 medals at Gold Coast 2018 including historic Women's Team & Singles Gold)", "Sreeja Akula", "Ayhika Mukherjee"),
            1,
            "मणिका बत्रा (दिल्ली) ने 2018 राष्ट्रमंडल खेलों में 2 स्वर्ण सहित 4 पदक जीते और 2024 पेरिस ओलंपिक में टेबल टेनिस एकल के राउंड ऑफ 16 में पहुंचने वाली पहली भारतीय बनीं।",
            "Manika Batra is India's top female table tennis player, breaking multiple global barriers for Indian table tennis.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q7", "spt_4",
            "बैडमिंटन के खेल में शटलकॉक (Shuttlecock / Birdie) में कुल कितने असली पंख (Feathers) लगे होते हैं?",
            "According to the official Laws of Badminton, exactly how many natural feathers are embedded in the cork base of a regulation feather shuttlecock?",
            listOf("12 पंख", "16 पंख (16 Natural Goose or Duck Feathers / Weight: 4.74 to 5.50 grams)", "14 पंख", "18 पंख"),
            listOf("12 feathers", "16 Feathers (Fixed in the cork base, having a uniform length between 62 mm and 70 mm)", "14 feathers", "18 feathers"),
            1,
            "एक मानक बैडमिंटन शटलकॉक में बत्तख या हंस के ठीक 16 असली पंख लगे होते हैं। शटलकॉक का वजन 4.74 से 5.50 ग्राम के बीच होता है।",
            "A regulation feather shuttlecock consists of exactly 16 feathers fixed into a cork base covered with thin leather.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q8", "spt_4",
            "बैडमिंटन कोर्ट के जाल (Net) की ऊंचाई कोर्ट के मध्य में कितनी होती है?",
            "What is the official height of a regulation badminton net at the center of the court?",
            listOf("4 फीट 6 इंच", "5 फीट / 1.524 मीटर (5 Feet / 1.524 m at the center and 1.55 m / 5 ft 1 in at posts)", "5 फीट 6 इंच", "4 फीट"),
            listOf("4 ft 6 in", "5 feet (1.524 meters at center; 1.55 meters / 5 ft 1 in at the side lines)", "5 ft 6 in", "4 feet"),
            1,
            "बैडमिंटन नेट की ऊंचाई कोर्ट के मध्य में 5 फीट (1.524 मीटर) और किनारों (पोस्ट्स) पर 5 फीट 1 इंच (1.55 मीटर) होती है। कोर्ट की कुल लंबाई 44 फीट (13.41 मीटर) होती है।",
            "The top of the badminton net from the surface of the court is 1.524 m at the center and 1.55 m over the side lines for doubles.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q9", "spt_4",
            "टेनिस में जब दोनों खिलाड़ियों का स्कोर 40-40 की बराबरी पर होता है, तो इस स्थिति को क्या कहा जाता है?",
            "In tennis scoring terminology, what is the score called when both players/teams have won three points each (40-40)?",
            listOf("लव (Love - 0)", "ड्यूस (Deuce - Score 40-40; requires 2 consecutive points to win game: Advantage -> Game)", "ऐस (Ace)", "फॉल्ट (Fault)"),
            listOf("Love (Zero points)", "Deuce (Tied score at 40-all; player must score two consecutive points to win)", "Ace", "Fault"),
            1,
            "टेनिस में स्कोरिंग: 15, 30, 40 और गेम। 40-40 की बराबरी को 'ड्यूस' (Deuce) कहा जाता है। इसके बाद एक अंक जीतने पर 'एडवांटेज' (Advantage) और अगला अंक जीतने पर गेम जीता जाता है। शून्य अंक को 'लव' (Love) कहते हैं।",
            "Deuce is a score of 40–40 in a tennis game, requiring either player to win two consecutive points to take the game.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q10", "spt_4",
            "एक ही कैलेंडर वर्ष में चारों ग्रैंड स्लैम खिताब (ऑस्ट्रेलियन, फ्रेंच, विंबलडन, यूएस ओपन) और उसी वर्ष ओलंपिक स्वर्ण पदक जीतकर 'गोल्डन स्लैम' (Golden Slam) पूरा करने वाली इतिहास की एकमात्र टेनिस खिलाड़ी (1988) कौन हैं?",
            "Who is the only tennis player in history (male or female) to achieve the 'Calendar Golden Slam' by winning all four Grand Slam singles titles and the Olympic Gold Medal in the single calendar year 1988?",
            listOf("सेरेना विलियम्स", "स्टेफी ग्राफ (Steffi Graf, Germany - 1988 Calendar Year Golden Slam / 22 Grand Slams)", "मार्टिना नवरातिलोवा", "क्रिस एवर्ट"),
            listOf("Serena Williams", "Steffi Graf (Won Australian Open, French Open, Wimbledon, US Open, and Seoul Olympic Gold in 1988)", "Martina Navratilova", "Chris Evert"),
            1,
            "स्टेफी ग्राफ (जर्मनी) ने 1988 में चारों ग्रैंड स्लैम और सियोल ओलंपिक में स्वर्ण पदक जीतकर खेल इतिहास का एकमात्र 'कैलेंडर ईयर गोल्डन स्लैम' हासिल किया।",
            "Steffi Graf achieved the only Golden Slam in history in 1988, winning all four Grand Slams and the Olympic gold medal in the same calendar year.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q11", "spt_4",
            "टेबल टेनिस की मानक गेंद (Table Tennis Ball) का व्यास और वजन कितना होता है?",
            "What is the official standard diameter and weight of an ITTF-approved celluloid/plastic table tennis ball?",
            listOf("38 मिमी, 2.5 ग्राम", "40 मिमी (40+ mm), 2.7 ग्राम (40 mm Diameter / 2.7 Grams Weight)", "42 मिमी, 3.0 ग्राम", "45 मिमी, 3.5 ग्राम"),
            listOf("38 mm, 2.5 g", "40 mm (40+ mm diameter, 2.7 grams weight; white or orange matte finish)", "42 mm, 3.0 g", "45 mm, 3.5 g"),
            1,
            "2000 सिडनी ओलंपिक के बाद टेबल टेनिस गेंद का आकार 38 मिमी से बढ़ाकर 40 मिमी और वजन 2.7 ग्राम किया गया ताकि रैलियां धीमी और दर्शकों के लिए दृश्यमान हो सकें।",
            "International regulations specify that a table tennis ball must have a diameter of 40 mm and weigh 2.7 grams.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q12", "spt_4",
            "भारत के 20 वर्षीय बैडमिंटन खिलाड़ी लक्ष्य सेन (Lakshya Sen) ने 2022 में किस प्रतिष्ठित खेल आयोजन में पुरुष एकल का स्वर्ण पदक जीता था?",
            "In which major multi-sport competition did Indian badminton prodigy Lakshya Sen win the Men's Singles Gold Medal in August 2022?",
            listOf("एशियाई खेल", "बर्मिंघम राष्ट्रमंडल खेल 2022 (Birmingham Commonwealth Games 2022 - Men's Singles Gold)", "ओलंपिक खेल", "दक्षिण एशियाई खेल"),
            listOf("Asian Games", "Birmingham Commonwealth Games 2022 (Defeated Malaysia's Ng Tze Yong in the final)", "Olympic Games", "South Asian Games"),
            1,
            "लक्ष्य सेन (अल्मोड़ा, उत्तराखंड) ने 2022 बर्मिंघम राष्ट्रमंडल खेलों में मलेशिया के एनजी त्जे योंग को हराकर स्वर्ण पदक जीता और 2024 पेरिस ओलंपिक में पुरुष एकल के चौथे स्थान (सेमीफाइनल) तक पहुंचे।",
            "Lakshya Sen won the Men's Singles gold medal at the 2022 Commonwealth Games in Birmingham.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q13", "spt_4",
            "बैडमिंटन में 'स् smash' (Smash) का विश्व में सबसे तेज शॉट (565 किमी/घंटा का गिनीज वर्ल्ड रिकॉर्ड) किस भारतीय शटलर के नाम दर्ज है?",
            "Which Indian badminton powerhouse holds the official Guinness World Record for the fastest smash in badminton history, recorded at an astonishing 565 km/h (351 mph)?",
            listOf("चिराग शेट्टी", "सात्विकसाईराज रंकीरेड्डी (Satwiksairaj Rankireddy - 565 km/h Smash World Record)", "किदांबी श्रीकांत", "एच. एस. प्रणय"),
            listOf("Chirag Shetty", "Satwiksairaj Rankireddy (Recorded at Yonex Tokyo Gymnasium test facility in April 2023)", "Kidambi Srikanth", "H. S. Prannoy"),
            1,
            "14 अप्रैल 2023 को योनेक्स परीक्षण में सात्विकसाईराज रंकीरेड्डी ने 565 किमी/घंटा की गति से स्मैश मारकर बैडमिंटन इतिहास का सबसे तेज शॉट लगाने का गिनीज वर्ल्ड रिकॉर्ड बनाया (फॉर्मूला-1 कार की गति से भी तेज)।",
            "Satwiksairaj Rankireddy set the Guinness World Record for the fastest smash hit by a male badminton player at 565 km/h.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q14", "spt_4",
            "टेबल टेनिस को आधिकारिक तौर पर किस ग्रीष्मकालीन ओलंपिक खेलों में पहली बार शामिल किया गया था?",
            "In which Olympic Games was table tennis officially introduced to the Olympic program for the first time?",
            listOf("1980 मॉस्को", "1988 सियोल ओलंपिक, दक्षिण कोरिया (1988 Seoul Olympics)", "1992 बार्सिलोना", "1996 अटलांटा"),
            listOf("1980 Moscow", "1988 Seoul Summer Olympics (Men's & Women's Singles and Doubles events debuted)", "1992 Barcelona", "1996 Atlanta"),
            1,
            "टेबल टेनिस 1988 सियोल (दक्षिण कोरिया) ओलंपिक में पहली बार शामिल किया गया था। (बैडमिंटन को 1992 बार्सिलोना ओलंपिक में शामिल किया गया था)।",
            "Table tennis made its Olympic debut at the 1988 Summer Olympics in Seoul, South Korea.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m6_q15", "spt_4",
            "टेनिस में जब किसी खिलाड़ी की पहली सर्विस नेट से टकराकर सही सर्विस बॉक्स में गिरती है, तो अंपायर द्वारा क्या कॉल दिया जाता है?",
            "In tennis, what is called when a serve hits the net cord but still lands successfully in the proper receiver's service box?",
            listOf("फॉल्ट (Fault)", "लेट (Let - The serve does not count as a fault and is replayed without penalty)", "ऐस (Ace)", "आउट (Out)"),
            listOf("Fault", "Let (The serve is retaken without counting against the server)", "Ace", "Out"),
            1,
            "यदि सर्विस गेंद नेट को छूकर सही सर्विस कोर्ट में गिरती है तो उसे 'लेट' (Let) कहा जाता है और वह सर्विस दोबारा की जाती है। यदि नेट छूने के बाद कोर्ट से बाहर गिरती है तो उसे 'फॉल्ट' (Fault) माना जाता है।",
            "A 'let' in tennis occurs when a serve touches the net cord but otherwise lands in bounds, requiring the serve to be retaken.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_4", 7, 10, baseQuestions)
    }
}
