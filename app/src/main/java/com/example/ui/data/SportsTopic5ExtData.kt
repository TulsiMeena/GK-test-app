package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic5ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_5_m6_q1", "spt_5",
            "एशियाई ओलंपिक परिषद (OCA - Olympic Council of Asia) का स्थायी मुख्यालय किस शहर में स्थित है (स्थापना 1982, नई दिल्ली)?",
            "Where is the headquarters of the Olympic Council of Asia (OCA - governing body of sports in Asia, established 1982) located?",
            listOf("दोहा (कतर)", "कुवैत सिटी, कुवैत (Kuwait City, Kuwait)", "रियाद (सऊदी अरब)", "दुबई (यूएई)"),
            listOf("Doha, Qatar", "Kuwait City, Kuwait (OCA Headquarters)", "Riyadh, Saudi Arabia", "Dubai, UAE"),
            1,
            "एशियाई ओलंपिक परिषद (OCA) की स्थापना 1982 के नई दिल्ली एशियाई खेलों के दौरान हुई थी। इसका मुख्यालय कुवैत सिटी (कुवैत) में स्थित है।",
            "The Olympic Council of Asia (OCA) is headquartered in Kuwait City, Kuwait, overseeing the Asian Games.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q2", "spt_5",
            "2026 के 20वें एशियाई खेलों (20th Asian Games 2026) का आयोजन किस देश के आइची-नागोया (Aichi-Nagoya) प्रांत में किया जाएगा?",
            "Which country will host the 20th Asian Games in 2026 across the Aichi Prefecture and its capital Nagoya?",
            listOf("दक्षिण कोरिया", "जापान (Japan - Aichi-Nagoya 2026 Asian Games)", "कतर (2030 दोहा)", "सऊदी अरब (2034 रियाद)"),
            listOf("South Korea", "Japan (Aichi-Nagoya 2026; Japan previously hosted in Tokyo 1958 and Hiroshima 1994)", "Qatar (Host for 2030 in Doha)", "Saudi Arabia (Host for 2034 in Riyadh)"),
            1,
            "2026 एशियाई खेल 19 सितंबर से 4 अक्टूबर 2026 तक आइची प्रान्त और नागोया (जापान) में आयोजित होंगे। (2030 दोहा, कतर और 2034 रियाद, सऊदी अरब में होंगे)।",
            "The 2026 Asian Games will be held in Aichi Prefecture and the city of Nagoya in Japan.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q3", "spt_5",
            "राष्ट्रमंडल खेल महासंघ (CGF - Commonwealth Games Federation) का मुख्यालय कहाँ स्थित है?",
            "Where is the headquarters of the Commonwealth Games Federation (CGF) located?",
            listOf("मेलबर्न", "लंदन, यूनाइटेड किंगडम (London, United Kingdom)", "ओटावा", "एडिनबर्ग"),
            listOf("Melbourne", "London, United Kingdom (CGF Headquarters)", "Ottawa", "Edinburgh"),
            1,
            "राष्ट्रमंडल खेल महासंघ (CGF) का मुख्यालय लंदन (यूके) में स्थित है। यह संस्था हर 4 वर्ष में राष्ट्रमंडल खेलों का आयोजन करती है।",
            "The Commonwealth Games Federation (CGF) is headquartered in London, England.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q4", "spt_5",
            "2022 बर्मिंघम राष्ट्रमंडल खेलों (Birmingham CWG 2022) में भारत ने कुल कितने पदक (22 स्वर्ण, 16 रजत, 23 कांस्य) जीतकर पदक तालिका में चौथा स्थान हासिल किया था?",
            "How many total medals did India win at the Birmingham 2022 Commonwealth Games (22 Gold, 16 Silver, 23 Bronze), finishing 4th on the medal table?",
            listOf("55 पदक", "61 पदक (61 Medals: 22 Gold, 16 Silver, 23 Bronze at Birmingham 2022)", "66 पदक (गोल्ड कोस्ट 2018)", "70 पदक"),
            listOf("55 medals", "61 Medals (Even without shooting and archery, India won 22 golds and 61 total medals)", "66 medals (Gold Coast 2018)", "70 medals"),
            1,
            "बर्मिंघम 2022 राष्ट्रमंडल खेलों में भारत ने 22 स्वर्ण सहित कुल 61 पदक जीते और पदक तालिका में ऑस्ट्रेलिया, इंग्लैंड और कनाडा के बाद चौथा स्थान हासिल किया।",
            "India finished fourth in the 2022 Commonwealth Games medal table with 61 medals, including 22 golds.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q5", "spt_5",
            "राष्ट्रमंडल खेलों के इतिहास में भारत के लिए भारोत्तोलन (Weightlifting) में स्वर्ण पदक जीतने वाली मीराबाई चानू (Mirabai Chanu) किस भारतीय राज्य से संबंधित हैं?",
            "Saikhom Mirabai Chanu, Olympic Silver medalist and multiple Commonwealth Games Gold medalist in weightlifting, hails from which Indian state?",
            listOf("असम", "मणिपुर (Manipur - Capital: Imphal / Padma Shri & Khel Ratna awardee)", "त्रिपुरा", "मिजोरम"),
            listOf("Assam", "Manipur (Born in Nongpok Kakching, Imphal East; 49 kg weightlifter)", "Tripura", "Mizoram"),
            1,
            "मीराबाई चानू (इंफाल, मणिपुर) भारत की शीर्ष भारोत्तोलक हैं जिन्होंने 2020 टोक्यो ओलंपिक में 49 किग्रा में रजत पदक और 2018 व 2022 राष्ट्रमंडल खेलों में स्वर्ण पदक जीते।",
            "Mirabai Chanu is an Indian weightlifter from Manipur who won silver at the Tokyo 2020 Olympics in the women's 49 kg category.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q6", "spt_5",
            "2023 के हांगझू एशियाई खेलों में भाला फेंक (Men's Javelin Throw) में 88.88 मीटर फेंककर लगातार दूसरा एशियाई खेल स्वर्ण पदक किस भारतीय एथलीट ने जीता?",
            "Which Indian track and field icon defended his Asian Games title with an 88.88m throw to win Gold at Hangzhou 2023, with compatriot Kishore Jena winning Silver?",
            listOf("शिवपाल सिंह", "नीरज चोपड़ा (Neeraj Chopra - Gold Medal 88.88 m at Hangzhou 2023)", "डी. पी. मनु", "रोहित यादव"),
            listOf("Shivpal Singh", "Neeraj Chopra (Won Gold with season-best 88.88m; Kishore Jena won Silver with 87.54m)", "D. P. Manu", "Rohit Yadav"),
            1,
            "नीरज चोपड़ा ने 2018 जकार्ता (88.06 मी) के बाद 2023 हांगझू (88.88 मी) में भी स्वर्ण पदक जीतकर लगातार दो एशियाई खेल स्वर्ण जीतने का इतिहास रचा। किशोर जेना ने रजत पदक जीता।",
            "Neeraj Chopra won his second consecutive Asian Games gold medal in javelin throw at Hangzhou 2023.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q7", "spt_5",
            "एशियाई खेलों में तीरंदाजी (Archery) में एक ही संस्करण (हांगझू 2023) में 3 स्वर्ण पदक जीतकर इतिहास रचने वाली भारत की 17 वर्षीय महिला तीरंदाज कौन हैं?",
            "Which 17-year-old Indian archer won 3 Gold Medals (Individual Compound, Mixed Team, Women's Team) at the Hangzhou 2023 Asian Games, sweeping all compound events?",
            listOf("दीपिका कुमारी", "ज्योति सुरेखा वेन्नम (Jyothi Surekha Vennam - 3 Golds in Compound Archery, Hangzhou 2023)", "अंकिता भकत", "कोमलिका बारी"),
            listOf("Deepika Kumari", "Jyothi Surekha Vennam (Won 3 Gold medals in Women's Individual, Team, and Mixed Team compound archery)", "Ankita Bhakat", "Komalika Bari"),
            1,
            "ज्योति सुरेखा वेन्नम (और पुरुषों में ओजस देवतले) ने हांगझू 2023 एशियाई खेलों में तीरंदाजी में 3-3 स्वर्ण पदक जीतकर ऐतिहासिक 'गोल्डन हैट्रिक' बनाई।",
            "Jyothi Surekha Vennam and Ojas Deotale won three gold medals each in compound archery at Hangzhou 2023.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q8", "spt_5",
            "खेलो इंडिया यूथ गेम्स 2024 (6th Khelo India Youth Games) का आयोजन जनवरी 2024 में किस दक्षिणी राज्य के चार शहरों (चेन्नई, त्रिची, मदुरै, कोयंबटूर) में हुआ था?",
            "Which South Indian state hosted the 6th edition of the Khelo India Youth Games in January 2024 across four cities (Chennai, Madurai, Trichy, Coimbatore)?",
            listOf("कर्नाटक", "तमिलनाडु (Tamil Nadu - 6th KIYG 2024 / Mascot: Veeramangai Velu Nachiyar)", "केरल", "आंध्र प्रदेश"),
            listOf("Karnataka", "Tamil Nadu (Held 19–31 January 2024; Mascot 'Veeramangai' honoring Rani Velu Nachiyar; Maharashtra topped tally)", "Kerala", "Andhra Pradesh"),
            1,
            "6वें खेलो इंडिया यूथ गेम्स 2024 तमिलनाडु में आयोजित हुए। इसका शुभंकर 'वीरमंगई' (रानी वेलु नचियार) था। महाराष्ट्र 57 स्वर्ण सहित 158 पदकों के साथ चैंपियन रहा।",
            "Tamil Nadu hosted the 6th Khelo India Youth Games in January 2024 with indigenous martial art Silambam featured as a demo sport.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q9", "spt_5",
            "एशियाई खेलों में घुड़सवारी (Equestrian Dressage Team) में भारत ने 41 वर्षों के लंबे अंतराल के बाद किस एशियाई खेल में ऐतिहासिक स्वर्ण पदक जीता?",
            "In which Asian Games did the Indian Equestrian Dressage Team win a historic Gold Medal, ending a 41-year medal drought in equestrian sports since 1982?",
            listOf("2014 इंचियोन", "2023 हांगझू एशियाई खेल (Hangzhou 2023 Asian Games - Anush Agarwalla, Hriday Chheda, Divyakriti Singh, Sudipti Hajela)", "2018 जकार्ता", "2010 ग्वांगझू"),
            listOf("2014 Incheon", "Hangzhou 2023 Asian Games (India's Dressage team won gold scoring 209.205 points on 26 September 2023)", "2018 Jakarta", "2010 Guangzhou"),
            1,
            "26 सितंबर 2023 को हांगझू में भारत की घुड़सवारी ड्रेसेज टीम (अनुष अग्रवाल, हृदय छेड़ा, दिव्यकृति सिंह, सुदीप्ति हजेला) ने 1982 नई दिल्ली के बाद 41 साल में पहला घुड़सवारी स्वर्ण पदक जीता।",
            "India won a historic gold medal in the Equestrian Dressage Team event at the Hangzhou Asian Games 2023 after 41 years.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q10", "spt_5",
            "राष्ट्रमंडल खेलों में लॉन बाउल्स (Women's Fours Lawn Bowls) में भारत की महिला टीम ने 2022 बर्मिंघम में किसे हराकर इतिहास का पहला ऐतिहासिक स्वर्ण पदक जीता था?",
            "Which nation did the Indian Women's Fours Lawn Bowls team defeat in the final at Birmingham 2022 to win India's first-ever Commonwealth medal and Gold in the sport?",
            listOf("इंग्लैंड", "दक्षिण अफ्रीका (South Africa - Defeated 17-10 in Final by Lovely Choubey, Pinki, Nayanmoni Saikia, Rupa Rani Tirkey)", "ऑस्ट्रेलिया", "न्यूजीलैंड"),
            listOf("England", "South Africa (India won 17-10 on 2 August 2022; historic breakthrough in Indian sports history)", "Australia", "New Zealand"),
            1,
            "2 अगस्त 2022 को बर्मिंघम में लवली चौबे, पिंकी, नयनमोनी सैकिया और रूपा रानी तिर्की की भारतीय 'लॉन बाउल्स' टीम ने दक्षिण अफ्रीका को 17-10 से हराकर देश का पहला स्वर्ण पदक जीता।",
            "The Indian women's lawn bowls team captured the nation's imagination by winning a sensational historic gold medal at Birmingham 2022.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q11", "spt_5",
            "एशियाई खेलों में महिला क्रिकेट (Women's Cricket) और पुरुष क्रिकेट (Men's Cricket) दोनों में किस देश की टीमों ने 2023 हांगझू में स्वर्ण पदक जीते?",
            "Which country swept both the Men's and Women's Cricket Gold Medals at the Hangzhou 2023 Asian Games in its debut cricket campaign?",
            listOf("पाकिस्तान", "भारत (India - Women defeated Sri Lanka; Men crowned champions vs Afghanistan)", "श्रीलंका", "बांग्लादेश"),
            listOf("Pakistan", "India (Harmanpreet Kaur led Women's team and Ruturaj Gaikwad led Men's team to dual Gold medals)", "Sri Lanka", "Bangladesh"),
            1,
            "हांगझू 2023 में भारतीय महिला क्रिकेट टीम (कप्तान हरमनप्रीत कौर) ने श्रीलंका को हराकर और पुरुष क्रिकेट टीम (कप्तान रुतुराज गायकवाड़) ने अफगानिस्तान के खिलाफ उच्च वरीयता के आधार पर दोनों स्वर्ण पदक जीते।",
            "India won both the Men's and Women's Twenty20 cricket gold medals at the Hangzhou 2023 Asian Games.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q12", "spt_5",
            "एशियाई खेलों में कबड्डी (Kabaddi) के इतिहास में भारतीय पुरुष कबड्डी टीम ने कुल 9 में से कितने स्वर्ण पदक जीते हैं?",
            "In Asian Games history (introduced in Beijing 1990), how many Gold Medals has the Indian Men's Kabaddi team won out of 9 editions?",
            listOf("6 स्वर्ण पदक", "8 स्वर्ण पदक (8 Gold Medals: 1990, 1994, 1998, 2002, 2006, 2010, 2014, 2023)", "7 स्वर्ण पदक", "9 स्वर्ण पदक"),
            listOf("6 Gold Medals", "8 Gold Medals (India won 7 consecutive golds from 1990 to 2014, Bronze in 2018, and Gold in 2023 in Hangzhou)", "7 Gold Medals", "9 Gold Medals"),
            1,
            "भारतीय पुरुष कबड्डी टीम ने 9 में से 8 बार एशियाई खेलों में स्वर्ण पदक जीता है (1990, 1994, 1998, 2002, 2006, 2010, 2014, 2023)। केवल 2018 जकार्ता में ईरान ने स्वर्ण जीता था और भारत को कांस्य मिला था।",
            "India is the most dominant nation in Asian Games Kabaddi history, winning 8 out of 9 men's gold medals.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q13", "spt_5",
            "राष्ट्रीय खेल पुरस्कारों में 'राजा भालिंद्र सिंह ट्रॉफी' (Raja Bhalindra Singh Trophy) किस दल को प्रदान की जाती है?",
            "The prestigious Raja Bhalindra Singh Trophy is presented to which contingent at the National Games of India?",
            listOf("सर्वश्रेष्ठ अनुशासित दल को", "राष्ट्रीय खेलों में समग्र पदक तालिका में शीर्ष स्थान (Over-all Champion State/Team) प्राप्त करने वाले राज्य/दल को", "केवल एथलेटिक्स विजेता को", "सर्वश्रेष्ठ मेजबान राज्य को"),
            listOf("Best disciplined contingent", "The Overall Champions of the National Games of India (Top of medal tally)", "Athletics champion only", "Best host state"),
            1,
            "राजा भालिंद्र सिंह ट्रॉफी (IOA के पूर्व अध्यक्ष राजा भालिंद्र सिंह के नाम पर) राष्ट्रीय खेलों के समग्र चैंपियन राज्य/दल (Overall Champion State/Services) को दी जाती है।",
            "The Raja Bhalindra Singh Trophy is awarded to the overall champion state team at the National Games of India.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q14", "spt_5",
            "खेलो इंडिया पैरा गेम्स (Khelo India Para Games - KIPG) का पहला उद्घाटन संस्करण दिसंबर 2023 में किस शहर में आयोजित हुआ था?",
            "In which city was the inaugural edition of the Khelo India Para Games (KIPG) held in December 2023, where Haryana topped the medal table?",
            listOf("चंडीगढ़", "नई दिल्ली (New Delhi - 10 to 17 December 2023 / Mascot: 'Ujjwala' the Sparrow)", "बेंगलुरु", "पुणे"),
            listOf("Chandigarh", "New Delhi (Held at JLN Stadium, IGI Stadium, and Karni Singh Range; Mascot 'Ujjwala' a sparrow)", "Bengaluru", "Pune"),
            1,
            "पहले खेलो इंडिया पैरा गेम्स 10 से 17 दिसंबर 2023 तक नई दिल्ली में आयोजित हुए। इसका शुभंकर 'उज्ज्वला' (एक गौरैया) था। हरियाणा 40 स्वर्ण सहित 105 पदकों के साथ शीर्ष पर रहा।",
            "The inaugural Khelo India Para Games were held in New Delhi in December 2023 with Haryana topping the medal tally.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m6_q15", "spt_5",
            "दक्षिण एशियाई खेलों (SAG) में भारत ने अब तक आयोजित सभी 13 संस्करणों में कौन-सा स्थान प्राप्त किया है?",
            "What has been India's final medal standing in every single edition of the South Asian Games (SAG) held from 1984 to 2019?",
            listOf("दूसरा स्थान", "पहला स्थान / शीर्ष स्थान (Rank 1 / Undefeated Top Position in all 13 editions from 1984 to 2019)", "तीसरा स्थान", "चौथा स्थान"),
            listOf("2nd place", "1st Place / Undisputed Overall Leader in all 13 South Asian Games editions", "3rd place", "4th place"),
            1,
            "भारत ने 1984 से 2019 (नेपाल) तक आयोजित सभी 13 दक्षिण एशियाई खेलों में निरंतर पदक तालिका में पहला (शीर्ष) स्थान हासिल किया है।",
            "India has finished at the top of the medal tally in all 13 editions of the South Asian Games since 1984.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_5", 7, 10, baseQuestions)
    }
}
