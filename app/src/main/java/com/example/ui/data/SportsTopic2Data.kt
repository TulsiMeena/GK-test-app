package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic2Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_2_m1_q1", "spt_2",
            "अंतर्राष्ट्रीय क्रिकेट परिषद (ICC - International Cricket Council) का मुख्यालय किस शहर में स्थित है (स्थापना 1909)?",
            "Where is the global headquarters of the International Cricket Council (ICC - founded 1909 as Imperial Cricket Conference) located?",
            listOf("लंदन, यूके (लॉर्ड्स)", "दुबई, संयुक्त अरब अमीरात (Dubai, UAE - Relocated from London in 2005)", "मेलबर्न, ऑस्ट्रेलिया", "मुंबई, भारत"),
            listOf("London, UK (Lord's)", "Dubai, United Arab Emirates (Dubai Sports City - Headquartered here since August 2005)", "Melbourne, Australia", "Mumbai, India"),
            1,
            "ICC की स्थापना 15 जून 1909 को 'इंपीरियल क्रिकेट कॉन्फ्रेंस' के रूप में लॉर्ड्स (लंदन) में हुई थी। 2005 में इसका वैश्विक मुख्यालय लंदन से स्थानांतरित कर दुबई (UAE) कर दिया गया।",
            "The International Cricket Council (ICC) relocated its headquarters from London to Dubai, UAE in August 2005 for tax and logistical advantages.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q2", "spt_2",
            "इतिहास का पहला आधिकारिक अंतर्राष्ट्रीय टेस्ट क्रिकेट मैच (First Official Test Match) मार्च 1877 में किन दो देशों के बीच खेला गया था?",
            "Between which two countries was the first official international Test match in cricket history played at the Melbourne Cricket Ground (MCG) in March 1877?",
            listOf("इंग्लैंड और वेस्टइंडीज", "ऑस्ट्रेलिया और इंग्लैंड (Australia vs England - 15-19 March 1877 at MCG)", "इंग्लैंड और दक्षिण अफ्रीका", "भारत और इंग्लैंड"),
            listOf("England & West Indies", "Australia and England (Australia won by 45 runs; Charles Bannerman scored first Test century)", "England & South Africa", "India & England"),
            1,
            "15-19 मार्च 1877 को मेलबर्न (MCG) में ऑस्ट्रेलिया और इंग्लैंड के बीच पहला टेस्ट मैच खेला गया। ऑस्ट्रेलिया ने यह मैच 45 रनों से जीता और चार्ल्स बैनरमैन ने टेस्ट क्रिकेट का पहला शतक (165 रिटायर्ड हर्ट) बनाया।",
            "The first officially recognized Test match began on 15 March 1877 between England and Australia at the Melbourne Cricket Ground.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q3", "spt_2",
            "पहला पुरुष एकदिवसीय क्रिकेट विश्व कप (First ICC Men's Cricket World Cup - Prudential Cup 1975) किस देश ने जीता था?",
            "Which nation won the inaugural ICC Men's Cricket World Cup (Prudential Cup) held in England in June 1975, defeating Australia in the final at Lord's?",
            listOf("ऑस्ट्रेलिया", "वेस्टइंडीज (West Indies - Captain: Clive Lloyd)", "इंग्लैंड", "भारत"),
            listOf("Australia", "West Indies (Led by Clive Lloyd who scored 102 in the final at Lord's)", "England", "India"),
            1,
            "1975 में इंग्लैंड में आयोजित पहले 60 ओवर के क्रिकेट विश्व कप को क्लाइव लॉयड की कप्तानी वाली वेस्टइंडीज ने ऑस्ट्रेलिया को 17 रनों से हराकर जीता। वेस्टइंडीज ने 1979 का दूसरा विश्व कप भी जीता।",
            "The West Indies won the inaugural 1975 Cricket World Cup, defeating Australia by 17 runs in the final at Lord's Cricket Ground.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q4", "spt_2",
            "कपिल देव की कप्तानी में भारत ने 25 जून 1983 को लॉर्ड्स (इंग्लैंड) के मैदान पर किस दो बार की विश्व चैंपियन टीम को हराकर अपना पहला एकदिवसीय विश्व कप जीता था?",
            "Under the captaincy of Kapil Dev, India won its historic first Cricket World Cup on 25 June 1983 at Lord's by defeating which two-time defending champion team?",
            listOf("ऑस्ट्रेलिया", "वेस्टइंडीज (West Indies - Defeated by 43 runs)", "इंग्लैंड", "पाकिस्तान"),
            listOf("Australia", "West Indies (India defended 183 runs, bowling out West Indies for 140; Mohinder Amarnath Man of the Match)", "England", "Pakistan"),
            1,
            "25 जून 1983 को लॉर्ड्स में भारत ने पहले बल्लेबाजी करते हुए 183 रन बनाए और क्लाइव लॉयड की वेस्टइंडीज को 140 रनों पर समेटकर 43 रनों से विश्व कप जीता। मोहिंदर अमरनाथ मैन ऑफ द मैच रहे।",
            "India's triumph in the 1983 Cricket World Cup under Kapil Dev transformed cricket into the country's preeminent religion and sporting obsession.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q5", "spt_2",
            "एम. एस. धोनी (MS Dhoni) की कप्तानी में भारत ने 2 अप्रैल 2011 को मुंबई के वानखेड़े स्टेडियम में किस देश को हराकर 28 साल बाद अपना दूसरा एकदिवसीय विश्व कप जीता?",
            "Under MS Dhoni's leadership, India won its second ICC ODI World Cup on 2 April 2011 at the Wankhede Stadium, Mumbai by defeating which team?",
            listOf("ऑस्ट्रेलिया", "श्रीलंका (Sri Lanka - Defeated by 6 wickets; Dhoni finished with a historic six)", "पाकिस्तान", "इंग्लैंड"),
            listOf("Australia", "Sri Lanka (India chased down 275; Gautam Gambhir 97, MS Dhoni 91* Man of the Match)", "Pakistan", "England"),
            1,
            "2 अप्रैल 2011 को वानखेड़े स्टेडियम में भारत ने श्रीलंका के 274 रनों के लक्ष्य का पीछा करते हुए 6 विकेट से जीत दर्ज की। गौतम गंभीर ने 97 रन बनाए और कप्तान धोनी ने 91* रन (मैच विनिंग छक्का) बनाकर मैन ऑफ द मैच जीता। युवराज सिंह 'प्लेयर ऑफ द टूर्नामेंट' रहे।",
            "India became the first team to win the ICC Cricket World Cup on home soil in 2011, defeating Sri Lanka in the grand final in Mumbai.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q6", "spt_2",
            "2007 में दक्षिण अफ्रीका में आयोजित पहले आईसीसी पुरुष टी-20 विश्व कप (Inaugural ICC Men's T20 World Cup 2007) का खिताब किस देश ने जीता था?",
            "Which country won the inaugural ICC Men's Twenty20 World Cup held in South Africa in September 2007, defeating Pakistan by 5 runs in a thrilling final in Johannesburg?",
            listOf("पाकिस्तान", "भारत (India - Captain: MS Dhoni / Defeated Pakistan in Johannesburg)", "ऑस्ट्रेलिया", "दक्षिण अफ्रीका"),
            listOf("Pakistan", "India (Led by young MS Dhoni; Irfan Pathan Man of the Match, Joginder Sharma final over)", "Australia", "South Africa"),
            1,
            "24 सितंबर 2007 को जोहान्सबर्ग (वांडरर्स) में एमएस धोनी की युवा भारतीय टीम ने पाकिस्तान को 5 रनों से हराकर पहला टी-20 विश्व कप जीता। इसी टूर्नामेंट में युवराज सिंह ने इंग्लैंड के स्टुअर्ट ब्रॉड के एक ओवर में 6 छक्के लगाए थे।",
            "India won the inaugural 2007 ICC World Twenty20, a watershed moment that led directly to the formation of the Indian Premier League (IPL).",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q7", "spt_2",
            "रोहित शर्मा की कप्तानी में भारत ने 29 जून 2024 को बारबाडोस में किस देश को 7 रनों से हराकर 17 साल बाद अपना दूसरा आईसीसी पुरुष टी-20 विश्व कप जीता?",
            "Under Rohit Sharma's captaincy, India won the ICC Men's T20 World Cup 2024 on 29 June 2024 at Bridgetown, Barbados by defeating which undefeated finalist?",
            listOf("इंग्लैंड", "दक्षिण अफ्रीका (South Africa - Defeated by 7 runs / Virat Kohli 76, Bumrah 2/18)", "ऑस्ट्रेलिया", "वेस्टइंडीज"),
            listOf("England", "South Africa (India defended 176/7, winning by 7 runs; Virat Kohli Player of the Match, Bumrah Player of the Tournament)", "Australia", "West Indies"),
            1,
            "29 जून 2024 को बारबाडोस में भारत ने दक्षिण अफ्रीका को 7 रनों से हराकर टी-20 विश्व कप 2024 जीता। विराट कोहली (76 रन) मैन ऑफ द मैच और जसप्रीत बुमराह (15 विकेट, 4.17 इकॉनमी) 'प्लेयर ऑफ द टूर्नामेंट' रहे।",
            "India became the first team to win the ICC Men's T20 World Cup undefeated throughout the entire tournament edition in 2024.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q8", "spt_2",
            "अंतर्राष्ट्रीय क्रिकेट (टेस्ट + वनडे + टी20) में 100 अंतरराष्ट्रीय शतक (100 International Centuries) लगाने वाले और 34,357 रन बनाने वाले विश्व के एकमात्र बल्लेबाज कौन हैं?",
            "Who is the only cricketer in history to score 100 international centuries (51 in Tests, 49 in ODIs) and accumulate over 34,000 international runs?",
            listOf("रिकी पोंटिंग", "सचिन तेंदुलकर (Sachin Tendulkar - 'Master Blaster' / Bharat Ratna 2014)", "विराट कोहली", "ब्रायन लारा"),
            listOf("Ricky Ponting", "Sachin Tendulkar (Played 200 Tests, 463 ODIs; 100 international tons; 34,357 runs)", "Virat Kohli", "Brian Lara"),
            1,
            "सचिन तेंदुलकर (मास्टर ब्लास्टर) ने 200 टेस्ट और 463 वनडे मैचों में 100 अंतरराष्ट्रीय शतक (51 टेस्ट + 49 वनडे) और 34,357 रन बनाए। वे 2014 में 'भारत रत्न' से सम्मानित होने वाले एकमात्र खिलाड़ी हैं।",
            "Sachin Tendulkar is widely regarded as one of the greatest batsmen in cricket history, holding the all-time records for runs and centuries.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q9", "spt_2",
            "एकदिवसीय अंतर्राष्ट्रीय क्रिकेट (ODI) में 50 शतक (50 ODI Centuries) लगाने वाले विश्व के पहले बल्लेबाज बनने का रिकॉर्ड नवंबर 2023 में किसने बनाया?",
            "Who surpassed Sachin Tendulkar's tally of 49 ODI centuries to become the first batsman in history to score 50 ODI centuries at the 2023 World Cup semi-final?",
            listOf("रोहित शर्मा", "विराट कोहली (Virat Kohli - 50 ODI Centuries / 80 International Centuries)", "बाबर आजम", "डेविड वॉर्नर"),
            listOf("Rohit Sharma", "Virat Kohli (Achieved the milestone on 15 November 2023 vs New Zealand at Wankhede Stadium)", "Babar Azam", "David Warner"),
            1,
            "15 नवंबर 2023 को मुंबई के वानखेड़े स्टेडियम में न्यूजीलैंड के खिलाफ विश्व कप सेमीफाइनल में विराट कोहली ने अपना 50वां वनडे शतक पूरा कर सचिन तेंदुलकर (49 शतक) का रिकॉर्ड तोड़ा।",
            "Virat Kohli reached his historic 50th One Day International century during the 2023 ICC Cricket World Cup semi-final in Mumbai.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q10", "spt_2",
            "टेस्ट क्रिकेट के इतिहास में सर्वाधिक विकेट (800 टेस्ट विकेट) लेने का अटूट विश्व रिकॉर्ड किस महान स्पिनर के नाम है?",
            "Which Sri Lankan spin maestro holds the all-time bowling record for the most wickets taken in Test cricket history (800 wickets in 133 Tests)?",
            listOf("शेन वॉर्न (708 विकेट)", "मुथैया मुरलीधरन (Muttiah Muralitharan - 800 Test Wickets & 534 ODI Wickets)", "अनिल कुंबले (619 विकेट)", "जेम्स एंडरसन (704 विकेट)"),
            listOf("Shane Warne (708 wickets)", "Muttiah Muralitharan (Sri Lanka - 800 Test and 534 ODI wickets, taking 67 five-wicket hauls)", "Anil Kumble (619 wickets)", "James Anderson (704 wickets)"),
            1,
            "मुथैया मुरलीधरन (श्रीलंका) ने 133 टेस्ट मैचों में 800 विकेट और 350 वनडे में 534 विकेट लेकर दोनों प्रारूपों में सर्वाधिक विकेट लेने का विश्व रिकॉर्ड बनाया है।",
            "Muttiah Muralitharan is the highest wicket-taker in international cricket history, taking 800 Test wickets and 534 ODI wickets.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q11", "spt_2",
            "टेस्ट क्रिकेट की एक पारी में सभी 10 विकेट (10 wickets in a single Test innings) लेने वाले भारत के पहले और विश्व के दूसरे गेंदबाज कौन थे जिन्होंने 1999 में पाकिस्तान के खिलाफ फिरोजशाह कोटला में यह कारनामा किया था?",
            "Who became the second bowler in Test history (and first Indian) to take all 10 wickets in a single Test innings, achieving the feat against Pakistan in Delhi in February 1999?",
            listOf("कपिल देव", "अनिल कुंबले (Anil Kumble - 'Jumbo' / 10/74 vs Pakistan, Feroz Shah Kotla 1999)", "रविचंद्रन अश्विन", "हरभजन सिंह"),
            listOf("Kapil Dev", "Anil Kumble (Took 10/74 in 26.3 overs against Pakistan on 7 February 1999 in Delhi)", "Ravichandran Ashwin", "Harbhajan Singh"),
            1,
            "7 फरवरी 1999 को दिल्ली के फिरोजशाह कोटला मैदान में अनिल कुंबले ने पाकिस्तान के खिलाफ 74 रन देकर सभी 10 विकेट (10/74) झटके। जिम लेकर (1956) पहले, कुंबले (1999) दूसरे और एजाज पटेल (2021) तीसरे ऐसे गेंदबाज हैं।",
            "Anil Kumble's 10-wicket haul against Pakistan at the Feroz Shah Kotla is one of the most iconic bowling performances in cricket history.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q12", "spt_2",
            "क्रिकेट की पिच (Cricket Pitch) की मानक लंबाई दोनों स्टंप्स के बीच कितनी होती है?",
            "What is the standard regulatory distance/length of a cricket pitch between the popping creases / wickets at each end?",
            listOf("20 गज (60 फीट)", "22 गज / 66 फीट / 20.12 मीटर (22 Yards / 66 Feet / 20.12 Meters)", "24 गज (72 फीट)", "18 गज (54 फीट)"),
            listOf("20 yards", "22 yards (66 feet / 20.12 meters / exactly one chain)", "24 yards", "18 yards"),
            1,
            "क्रिकेट पिच की लंबाई दोनों छोर के स्टंप्स के बीच 22 गज (66 फीट या 20.12 मीटर) और चौड़ाई 10 फीट (3.05 मीटर) होती है। गेंदबाजी क्रीज 8 फीट 8 इंच चौड़ी होती है।",
            "The Laws of Cricket specify that a pitch is 22 yards (20.12 m) long between the sets of stumps at each end.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q13", "spt_2",
            "पुरुषों के एकदिवसीय अंतर्राष्ट्रीय क्रिकेट (ODI) में पहला दोहरा शतक (First Double Century - 200* रन) फरवरी 2010 में ग्वालियर में किस बल्लेबाज ने बनाया था?",
            "Who became the first male cricketer in history to score a double century (200 not out off 147 balls) in Men's One Day International cricket, playing against South Africa in Gwalior in 2010?",
            listOf("वीरेंद्र सहवाग", "सचिन तेंदुलकर (Sachin Tendulkar - 200* vs South Africa at Gwalior, 24 Feb 2010)", "रोहित शर्मा", "क्रिस गेल"),
            listOf("Virender Sehwag", "Sachin Tendulkar (First male player to break the 200-run ODI barrier on 24 February 2010)", "Rohit Sharma", "Chris Gayle"),
            1,
            "24 फरवरी 2010 को ग्वालियर के कैप्टन रूप सिंह स्टेडियम में सचिन तेंदुलकर ने दक्षिण अफ्रीका के खिलाफ 147 गेंदों में नाबाद 200 रन बनाकर पुरुषों के वनडे में पहला दोहरा शतक लगाने का इतिहास रचा।",
            "Sachin Tendulkar scored the first double century in Men's ODI history against South Africa in Gwalior on February 24, 2010.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q14", "spt_2",
            "एकदिवसीय अंतर्राष्ट्रीय क्रिकेट (ODI) में सर्वोच्च व्यक्तिगत स्कोर (264 रन) और सर्वाधिक 3 दोहरे शतक लगाने का विश्व रिकॉर्ड किस बल्लेबाज के नाम है?",
            "Which batsman holds the world record for the highest individual score in ODI cricket history (264 runs off 173 balls vs Sri Lanka in 2014) and the only batsman with three ODI double centuries?",
            listOf("मार्टिन गुप्टिल", "रोहित शर्मा (Rohit Sharma - 'Hitman' / 264 vs Sri Lanka, 209 vs Australia, 208* vs Sri Lanka)", "विराट कोहली", "डेविड वॉर्नर"),
            listOf("Martin Guptill", "Rohit Sharma (Scored 264 at Eden Gardens Kolkata on 13 November 2014; only player with 3 ODI double tons)", "Virat Kohli", "David Warner"),
            1,
            "रोहित शर्मा ने 13 नवंबर 2014 को ईडन गार्डन्स (कोलकाता) में श्रीलंका के खिलाफ 264 रन (33 चौके, 9 छक्के) बनाए। उनके नाम वनडे में 3 दोहरे शतक (209, 264, 208*) का अद्वितीय रिकॉर्ड है।",
            "Rohit Sharma holds the record for the highest individual score in ODI history with 264 runs against Sri Lanka at Eden Gardens.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m1_q15", "spt_2",
            "विश्व का सबसे बड़ा क्रिकेट स्टेडियम (Largest Cricket Stadium in the World - 1,32,000 दर्शक क्षमता) कौन-सा है?",
            "Which is the largest cricket stadium in the world by seating capacity (132,000 spectators), located in Ahmedabad, Gujarat?",
            listOf("मेलबर्न क्रिकेट ग्राउंड (MCG, ऑस्ट्रेलिया)", "नरेंद्र मोदी स्टेडियम / मोटेरा स्टेडियम (Narendra Modi Stadium, Motera, Ahmedabad)", "ईडन गार्डन्स (कोलकाता)", "लॉर्ड्स क्रिकेट ग्राउंड (लंदन)"),
            listOf("Melbourne Cricket Ground (MCG - 100,000 capacity)", "Narendra Modi Stadium (Motera, Ahmedabad - Capacity: 132,000 spectators)", "Eden Gardens (Kolkata)", "Lord's Cricket Ground (London)"),
            1,
            "नरेंद्र मोदी स्टेडियम (मोटेरा, अहमदाबाद, गुजरात) 1,32,000 दर्शकों की क्षमता के साथ विश्व का सबसे बड़ा क्रिकेट स्टेडियम है। यहाँ 2023 आईसीसी क्रिकेट विश्व कप का फाइनल मैच खेला गया था।",
            "The Narendra Modi Stadium in Ahmedabad is the largest cricket stadium in the world and the second-largest stadium overall by seating capacity.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_2", 2, 5, baseQuestions)
    }
}
