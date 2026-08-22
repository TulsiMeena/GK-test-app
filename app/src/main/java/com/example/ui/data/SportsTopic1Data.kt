package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic1Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_1_m1_q1", "spt_1",
            "आधुनिक ओलंपिक खेलों (Modern Olympic Games) की शुरुआत 1896 में किस शहर में हुई थी?",
            "In which historic city were the first Modern Olympic Games inaugurated in April 1896 under the leadership of Baron Pierre de Coubertin?",
            listOf("पेरिस (फ्रांस)", "एथेंस, ग्रीस (Athens, Greece - Panathenaic Stadium)", "लंदन (ब्रिटेन)", "रोम (इटली)"),
            listOf("Paris, France", "Athens, Greece (1896 Summer Olympics at Panathenaic Stadium)", "London, UK", "Rome, Italy"),
            1,
            "आधुनिक ओलंपिक खेलों की शुरुआत 6 अप्रैल 1896 को एथेंस (ग्रीस) में हुई थी। इसके जनक 'बैरोन पियरे डी कुबर्टिन' (फ्रांस) थे जिन्होंने 1894 में अंतर्राष्ट्रीय ओलंपिक समिति (IOC) की स्थापना की थी।",
            "The 1896 Summer Olympics, officially known as the Games of the I Olympiad, were held in Athens, Greece, reviving the ancient Greek Olympic tradition.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q2", "spt_1",
            "अंतर्राष्ट्रीय ओलंपिक समिति (IOC - International Olympic Committee) का स्थायी मुख्यालय किस शहर में स्थित है?",
            "Where is the permanent global headquarters of the International Olympic Committee (IOC - founded 1894) located?",
            listOf("जिनेवा (स्विट्जरलैंड)", "लुसाने, स्विट्जरलैंड (Lausanne, Switzerland - Olympic House)", "पेरिस (फ्रांस)", "ज्यूरिख (स्विट्जरलैंड)"),
            listOf("Geneva, Switzerland", "Lausanne, Switzerland (Olympic House on the shores of Lake Geneva)", "Paris, France", "Zurich, Switzerland"),
            1,
            "अंतर्राष्ट्रीय ओलंपिक समिति (IOC) का मुख्यालय 1915 से लुसाने (Lausanne, स्विट्जरलैंड) में स्थित है। यह संस्था ग्रीष्मकालीन और शीतकालीन ओलंपिक खेलों का संचालन करती है।",
            "The International Olympic Committee (IOC) is headquartered in Lausanne, Switzerland, responsible for organizing the modern Olympic Games.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q3", "spt_1",
            "ओलंपिक ध्वज में कितने परस्पर जुड़े हुए छल्ले (Interlocking Rings) होते हैं और वे क्या दर्शाते हैं?",
            "How many interlocking rings feature on the official Olympic flag, and what do they represent?",
            listOf("4 छल्ले, 4 मुख्य ऋतुएं", "5 छल्ले, विश्व के 5 महाद्वीप (5 Interlocking Rings representing 5 continents: Blue, Yellow, Black, Green, Red)", "6 छल्ले, 6 प्रमुख खेल", "7 छल्ले, 7 समुद्र"),
            listOf("4 rings, 4 seasons", "5 Rings representing the union of the 5 inhabited continents of the world and meeting of athletes", "6 rings, 6 core sports", "7 rings, 7 oceans"),
            1,
            "ओलंपिक ध्वज (1913 में पियरे डी कुबर्टिन द्वारा डिजाइन) में 5 परस्पर जुड़े छल्ले होते हैं: नीला (यूरोप), पीला (एशिया), काला (अफ्रीका), हरा (ऑस्ट्रेलिया/ओशिनिया) और लाल (अमेरिका)।",
            "The Olympic symbol consists of five interlaced rings of equal dimensions in five colors on a white field, representing the five inhabited continents.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q4", "spt_1",
            "ओलंपिक का आधिकारिक लैटिन आदर्श वाक्य (Olympic Motto) क्या है जिसे 2021 में टोक्यो ओलंपिक में अद्यतन किया गया?",
            "What is the official Olympic motto in Latin, updated by the IOC in 2021 to add the word 'Communiter' (Together)?",
            listOf("Veni, Vidi, Vici", "Citius, Altius, Fortius – Communiter (Faster, Higher, Stronger – Together / तेज, ऊंचा, मजबूत – साथ मिलकर)", "Altius, Citius, Magnus", "Pax, Virtus, Victoria"),
            listOf("Veni, Vidi, Vici", "Citius, Altius, Fortius – Communiter ('Faster, Higher, Stronger – Together')", "Altius, Citius, Magnus", "Pax, Virtus, Victoria"),
            1,
            "ओलंपिक का मूल आदर्श वाक्य 'Citius, Altius, Fortius' (फास्टर, हायर, स्ट्रॉन्गर) था। जुलाई 2021 में IOC ने वैश्विक एकजुटता दिखाने हेतु इसमें '- Communiter' (टुगेदर / साथ मिलकर) शब्द जोड़ा।",
            "The Olympic motto was updated to 'Citius, Altius, Fortius – Communiter' in 2021 to emphasize solidarity during challenging global times.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q5", "spt_1",
            "व्यक्तिगत स्पर्धा (Individual Event) में भारत के लिए पहला ओलंपिक स्वर्ण पदक (First Individual Olympic Gold Medal) 2008 बीजिंग ओलंपिक में किसने जीता था?",
            "Who created history as the first Indian athlete to win an individual Olympic Gold Medal, winning the 10m Air Rifle event at the 2008 Beijing Games?",
            listOf("के. डी. जाधव", "अभिनव बिंद्रा (Abhinav Bindra - 10m Air Rifle Shooting, Beijing 2008)", "नीरज चोपड़ा", "राज्यवर्धन सिंह राठौड़"),
            listOf("K. D. Jadhav", "Abhinav Bindra (Gold in Men's 10m Air Rifle at Beijing 2008 Olympics)", "Neeraj Chopra", "Rajyavardhan Singh Rathore (Silver in 2004)"),
            1,
            "अभिनव बिंद्रा ने 11 अगस्त 2008 को बीजिंग ओलंपिक में पुरुषों की 10 मीटर एयर राइफल निशानेबाजी में स्वर्ण पदक जीतकर व्यक्तिगत ओलंपिक स्वर्ण जीतने वाले पहले भारतीय बनने का गौरव हासिल किया।",
            "Abhinav Bindra won India's first individual Olympic gold medal in the 10m Air Rifle event at the 2008 Summer Olympics in Beijing.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q6", "spt_1",
            "ओलंपिक की एथलेटिक्स (ट्रैक एंड फील्ड) स्पर्धा में भारत के लिए पहला स्वर्ण पदक 2020 टोक्यो ओलंपिक में किस खिलाड़ी ने भाला फेंक (Javelin Throw) में जीता?",
            "Who won India's first-ever Olympic gold medal in Track and Field Athletics, throwing 87.58 m in Men's Javelin Throw at Tokyo 2020?",
            listOf("मिल्खा सिंह", "नीरज चोपड़ा (Neeraj Chopra - Javelin Throw 87.58 m, Tokyo 2020)", "शिवपाल सिंह", "अंजू बॉबी जॉर्ज"),
            listOf("Milkha Singh", "Neeraj Chopra (Won Gold with an 87.58 m throw on 7 August 2021 / National Javelin Day)", "Shivpal Singh", "Anju Bobby George"),
            1,
            "7 अगस्त 2021 को टोक्यो ओलंपिक में नीरज चोपड़ा (पानीपत, हरियाणा) ने 87.58 मीटर भाला फेंककर भारत को एथलेटिक्स में पहला ओलंपिक स्वर्ण पदक दिलाया। 7 अगस्त को प्रतिवर्ष 'राष्ट्रीय भाला फेंक दिवस' मनाया जाता है।",
            "Neeraj Chopra became only the second Indian to win an individual Olympic gold medal and the first in track and field athletics at Tokyo 2020.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q7", "spt_1",
            "स्वतंत्र भारत के लिए व्यक्तिगत स्पर्धा में पहला ओलंपिक पदक (कांस्य पदक - कुश्ती) 1952 के हेलसिंकी ओलंपिक में किस पहलवान ने जीता था?",
            "Who was the first athlete from independent India to win an individual Olympic medal (Bronze in Freestyle Wrestling at Helsinki 1952)?",
            listOf("सुशील कुमार", "खाशाबा दादासाहेब जाधव / के. डी. जाधव (K. D. Jadhav - Bantamweight Wrestling, Helsinki 1952)", "योगेश्वर दत्त", "दारा सिंह"),
            listOf("Sushil Kumar", "K. D. Jadhav (Khashaba Dadasaheb Jadhav - Bronze in Bantamweight Freestyle Wrestling)", "Yogeshwar Dutt", "Dara Singh"),
            1,
            "के. डी. जाधव (महाराष्ट्र) ने 1952 के हेलसिंकी ओलंपिक में बैंतमवेट फ्रीस्टाइल कुश्ती में कांस्य पदक जीता था। वे स्वतंत्र भारत के पहले व्यक्तिगत ओलंपिक पदक विजेता थे।",
            "K. D. Jadhav was an Indian freestyle wrestler who won a bronze medal at the 1952 Summer Olympics in Helsinki, the first individual medal for post-independence India.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q8", "spt_1",
            "ओलंपिक में पदक जीतने वाली पहली भारतीय महिला खिलाड़ी (First Indian Woman Olympic Medalist) कौन थीं जिन्होंने 2000 सिडनी ओलंपिक में भारोत्तोलन में कांस्य पदक जीता था?",
            "Who became the first Indian woman to win an Olympic medal, securing Bronze in Women's 69 kg Weightlifting at the 2000 Sydney Games?",
            listOf("मैरी कॉम", "कर्णम मल्लेश्वरी (Karnam Malleswari - Weightlifting 69 kg, Sydney 2000)", "साइना नेहवाल", "पी. वी. सिंधु"),
            listOf("Mary Kom", "Karnam Malleswari (Bronze in 69 kg weightlifting lifting 240 kg at Sydney 2000)", "Saina Nehwal", "P. V. Sindhu"),
            1,
            "कर्णम मल्लेश्वरी (आंध्र प्रदेश) ने 2000 सिडनी ओलंपिक में 69 किग्रा भारोत्तोलन स्पर्धा में 240 किग्रा वजन उठाकर कांस्य पदक जीता और ओलंपिक पदक जीतने वाली भारत की पहली महिला बनीं।",
            "Karnam Malleswari made history at the 2000 Sydney Olympics by becoming the first Indian female athlete to stand on the Olympic podium.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q9", "spt_1",
            "भारतीय पुरुष हॉकी टीम ने ओलंपिक इतिहास में कुल कितने स्वर्ण पदक (Olympic Gold Medals in Hockey) जीते हैं?",
            "How many Olympic Gold Medals has the Indian Men's Field Hockey team won in total, establishing an immortal golden era in world hockey?",
            listOf("6 स्वर्ण पदक", "8 स्वर्ण पदक (8 Gold Medals: 1928, 1932, 1936, 1948, 1952, 1956, 1964, 1980)", "10 स्वर्ण पदक", "5 स्वर्ण पदक"),
            listOf("6 Gold Medals", "8 Gold Medals (Including 6 consecutive titles from 1928 Amsterdam to 1956 Melbourne)", "10 Gold Medals", "5 Gold Medals"),
            1,
            "भारतीय पुरुष हॉकी टीम ने कुल 8 स्वर्ण पदक (1928, 1932, 1936, 1948, 1952, 1956, 1964, 1980), 1 रजत (1960) और 4 कांस्य (1968, 1972, 2020, 2024) जीते हैं - कुल 13 ओलंपिक पदक।",
            "India is the most successful team in Olympic field hockey history, having claimed eight gold medals, one silver, and four bronze medals.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q10", "spt_1",
            "ओलंपिक इतिहास में लगातार दो व्यक्तिगत ओलंपिक पदक जीतने वाली भारत की पहली महिला एथलीट कौन हैं जिन्होंने 2016 रियो (रजत) और 2020 टोक्यो (कांस्य) में बैडमिंटन पदक जीते?",
            "Who is the first Indian woman athlete to win two consecutive individual Olympic medals (Silver at Rio 2016 and Bronze at Tokyo 2020 in Badminton)?",
            listOf("साइना नेहवाल", "पी. वी. सिंधु / पुसरला वेंकट सिंधु (P. V. Sindhu - Badminton)", "अश्विनी पोनप्पा", "ज्वाला गुट्टा"),
            listOf("Saina Nehwal", "P. V. Sindhu (Pusarla Venkata Sindhu - Silver in Rio 2016, Bronze in Tokyo 2020)", "Ashwini Ponnappa", "Jwala Gutta"),
            1,
            "पी. वी. सिंधु ने 2016 रियो ओलंपिक में रजत पदक और 2020 टोक्यो ओलंपिक में कांस्य पदक जीतकर दो व्यक्तिगत ओलंपिक पदक जीतने वाली पहली भारतीय महिला बनने का इतिहास रचा। (सुशील कुमार ने पुरुषों में 2008 और 2012 में दो पदक जीते थे)।",
            "P. V. Sindhu is one of India's most decorated Olympians, securing back-to-back badminton singles medals at the 2016 and 2020 Olympic Games.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q11", "spt_1",
            "ओलंपिक इतिहास में सर्वाधिक कुल पदक (28 पदक) और सर्वाधिक स्वर्ण पदक (23 स्वर्ण पदक) जीतने का सर्वकालिक विश्व रिकॉर्ड किस महान अमेरिकी तैराक (Swimmer) के नाम है?",
            "Which legendary American swimmer holds the all-time record for the most Olympic medals (28 medals) and most Olympic gold medals (23 golds)?",
            listOf("मार्क स्पिट्ज़", "माइकल फेल्प्स (Michael Phelps - 'The Baltimore Bullet' / 23 Gold, 3 Silver, 2 Bronze)", "कालेब ड्रेसेल", "इयान थोर्प"),
            listOf("Mark Spitz", "Michael Phelps (28 total medals across 2004 Athens, 2008 Beijing, 2012 London, 2016 Rio)", "Caeleb Dressel", "Ian Thorpe"),
            1,
            "माइकल फेल्प्स (यूएसए) ने 4 ओलंपिक खेलों (2004-2016) में कुल 28 पदक (23 स्वर्ण, 3 रजत, 2 कांस्य) जीते हैं। उन्होंने 2008 बीजिंग ओलंपिक में अकेले एक ही खेल में 8 स्वर्ण पदक जीतने का ऐतिहासिक रिकॉर्ड बनाया।",
            "Michael Phelps is the most successful and most decorated Olympian of all time with a total of 28 medals, including 23 Olympic golds.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q12", "spt_1",
            "लगातार 3 ओलंपिक खेलों (2008 बीजिंग, 2012 लंदन, 2016 रियो) में 100 मीटर और 200 मीटर दोनों दौड़ में स्वर्ण पदक की 'ट्रिपल-डबल' जीतने वाले जमैका के महान धावक कौन हैं?",
            "Which Jamaican sprinter, nicknamed 'Lightning Bolt', achieved the historic 'Triple-Double' by winning 100m and 200m Olympic golds across three consecutive Games (2008, 2012, 2016)?",
            listOf("कार्ल लुईस", "उसेन बोल्ट (Usain Bolt - 8 Olympic Gold Medals / 100m World Record: 9.58s)", "योहान ब्लेक", "टायसन गे"),
            listOf("Carl Lewis", "Usain Bolt (World record holder in 100m at 9.58s and 200m at 19.19s)", "Yohan Blake", "Tyson Gay"),
            1,
            "उसेन बोल्ट (जमैका) विश्व के सबसे तेज धावक हैं। उनके नाम 100 मीटर (9.58 सेकंड) और 200 मीटर (19.19 सेकंड) का विश्व रिकॉर्ड है। उन्होंने ओलंपिक में कुल 8 स्वर्ण पदक जीते हैं।",
            "Usain Bolt is widely considered the greatest sprinter of all time, reigning undefeated in Olympic 100m and 200m individual finals across three Olympiads.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q13", "spt_1",
            "2024 के 33वें ग्रीष्मकालीन ओलंपिक खेल (33rd Summer Olympic Games 2024) किस शहर में आयोजित हुए?",
            "Which city hosted the 2024 Summer Olympics (Games of the XXXIII Olympiad), featuring an open-air opening ceremony on the Seine River?",
            listOf("लॉस एंजिल्स", "पेरिस, फ्रांस (Paris, France - 26 July to 11 August 2024)", "ब्रिस्बेन", "टोक्यो"),
            listOf("Los Angeles (Host for 2028)", "Paris, France (Centenary of 1924 Paris Olympics; 3rd time host)", "Brisbane (Host for 2032)", "Tokyo"),
            1,
            "2024 ग्रीष्मकालीन ओलंपिक 26 जुलाई से 11 अगस्त 2024 तक पेरिस (फ्रांस) में आयोजित हुए। पेरिस 1900, 1924 और 2024 में तीन बार ओलंपिक की मेजबानी करने वाला लंदन के बाद दूसरा शहर बना। (2028 ओलंपिक लॉस एंजिल्स और 2032 ब्रिस्बेन में होंगे)।",
            "Paris 2024 celebrated the 33rd Olympic Games, introducing breaking (breakdancing) and staging events at iconic landmarks like the Eiffel Tower.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q14", "spt_1",
            "पैरालंपिक खेलों (Paralympic Games) में दो स्वर्ण पदक जीतने वाले भारत के पहले पैरा-एथलीट कौन हैं जिन्होंने 2004 एथेंस और 2016 रियो पैरालंपिक में भाला फेंक (F46) में स्वर्ण जीता?",
            "Who was the first Indian para-athlete to win two Paralympic Gold Medals (Men's Javelin F46 at Athens 2004 and Rio 2016)?",
            listOf("मरियप्पन थंगावेलु", "देवेंद्र झाझरिया (Devendra Jhajharia - Javelin Throw F46 / Padma Bhushan)", "सुमित अंतिल", "प्रमोद भगत"),
            listOf("Mariyappan Thangavelu", "Devendra Jhajharia (Gold in 2004 Athens, Gold in 2016 Rio, Silver in 2020 Tokyo)", "Sumit Antil", "Pramod Bhagat"),
            1,
            "देवेंद्र झाझरिया (राजस्थान) ने 2004 एथेंस और 2016 रियो पैरालंपिक में एफ-46 भाला फेंक में स्वर्ण पदक और 2020 टोक्यो में रजत पदक जीता। वे पद्म भूषण पाने वाले पहले पैरा-एथलीट हैं।",
            "Devendra Jhajharia is an Indian Paralympic javelin thrower who became the first Indian to win two Paralympic gold medals in individual events.",
            "Easy"
        ),
        makeSportsQ(
            "spt_1_m1_q15", "spt_1",
            "एक ही पैरालंपिक खेल (टोक्यो 2020 पैरालंपिक) में दो पदक (10 मीटर एयर राइफल में स्वर्ण और 50 मीटर राइफल 3P में कांस्य) जीतने वाली भारत की पहली महिला पैरा-एथलीट कौन हैं?",
            "Who became the first Indian woman to win a Paralympic Gold Medal and two medals at a single Paralympic Games in shooting at Tokyo 2020?",
            listOf("दीपा मलिक", "अवनि लेखरा (Avani Lekhara - R2 10m Air Rifle Standing Gold & 50m Rifle Bronze, Tokyo 2020)", "भाविना पटेल", "एकता भ्यान"),
            listOf("Deepa Malik (First Indian woman Paralympic medalist - Silver 2016)", "Avani Lekhara (Gold in 10m Air Rifle SH1 & Bronze in 50m Rifle 3 Positions SH1)", "Bhavina Patel", "Ekta Bhyan"),
            1,
            "अवनि लेखरा (जयपुर, राजस्थान) ने टोक्यो 2020 पैरालंपिक में 10 मीटर एयर राइफल में स्वर्ण और 50 मीटर राइफल में कांस्य पदक जीता। उन्होंने 2024 पेरिस पैरालंपिक में भी 10 मीटर एयर राइफल में लगातार दूसरा स्वर्ण पदक जीता।",
            "Avani Lekhara made history as the first Indian woman to win a Paralympic gold medal in shooting at the Tokyo 2020 Paralympics.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_1", 2, 5, baseQuestions)
    }
}
