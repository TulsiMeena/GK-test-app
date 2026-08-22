package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic3ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_3_m6_q1", "spt_3",
            "यूईएफए चैंपियंस लीग (UEFA Champions League) के इतिहास में सर्वाधिक 15 बार खिताब जीतने वाला यूरोप का सबसे सफल फुटबॉल क्लब कौन-सा है?",
            "Which European football club has won the UEFA Champions League / European Cup a record 15 times, nicknamed 'Los Blancos'?",
            listOf("एफसी बार्सिलोना (5 बार)", "रियल मैड्रिड (Real Madrid CF, Spain - Record 15 Champions League Titles)", "बायर्न म्यूनिख (6 बार)", "लिवरपूल (6 बार)"),
            listOf("FC Barcelona (5 titles)", "Real Madrid CF (Won 15 European Cup / UCL titles including 1956-60, 2014, 2016-18, 2022, 2024)", "Bayern Munich (6 titles)", "Liverpool (6 titles)"),
            1,
            "रियल मैड्रिड (स्पेन) ने रिकॉर्ड 15 बार (1956, 1957, 1958, 1959, 1960, 1966, 1998, 2000, 2002, 2014, 2016, 2017, 2018, 2022, 2024) यूईएफए चैंपियंस लीग जीतकर यूरोप का सबसे सफल क्लब होने का गौरव प्राप्त किया है।",
            "Real Madrid is the most successful club in European football history with a record 15 UEFA Champions League titles.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q2", "spt_3",
            "1951 के पहले नई दिल्ली एशियाई खेलों और 1962 के जकार्ता एशियाई खेलों में भारत की राष्ट्रीय फुटबॉल टीम ने किस महान कोच के मार्गदर्शन में स्वर्ण पदक जीते थे जिसे 'भारतीय फुटबॉल का स्वर्ण युग' कहते हैं?",
            "Under the mentorship of which legendary visionary coach did the Indian national football team win Asian Games Gold in 1951 (Delhi) and 1962 (Jakarta) during 'The Golden Era'?",
            listOf("अमल दत्ता", "सैयद अब्दुल रहीम / रहीम साब (Syed Abdul Rahim - Architect of Golden Era of Indian Football: 1950-1963)", "पी. के. बनर्जी", "चुन्नी गोस्वामी"),
            listOf("Amal Dutta", "Syed Abdul Rahim (Led India to 1951 & 1962 Asian Games Gold and semi-finals of 1956 Melbourne Olympics)", "P. K. Banerjee", "Chuni Goswami"),
            1,
            "सैयद अब्दुल रहीम (हैदराबाद) 1950 से 1963 तक भारत के मुख्य फुटबॉल कोच रहे। उनके नेतृत्व में भारत ने 1951 व 1962 एशियाई खेलों में स्वर्ण पदक जीता और 1956 मेलबर्न ओलंपिक में चौथा स्थान (सेमीफाइनल) हासिल किया।",
            "Syed Abdul Rahim is revered as the architect of modern Indian football, guiding the national team through its most triumphant golden epoch.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q3", "spt_3",
            "1956 के मेलबर्न ओलंपिक में ओलंपिक फुटबॉल में हैट्रिक लगाने वाले पहले एशियाई खिलाड़ी कौन बने थे जिन्होंने ऑस्ट्रेलिया के खिलाफ 4-2 की जीत में 3 गोल दागे थे?",
            "Who became the first Asian footballer to score a hat-trick in Olympic Games football history, scoring three goals against Australia at Melbourne 1956?",
            listOf("चुन्नी गोस्वामी", "नेविले डिसूजा (Neville D'Souza, India - Olympic Hat-trick vs Australia at Melbourne 1956)", "पी. के. बनर्जी", "तुलसीदास बलराम"),
            listOf("Chuni Goswami", "Neville D'Souza (Finished joint top-scorer of 1956 Melbourne Olympics with 4 goals)", "P. K. Banerjee", "Tulsidas Balaram"),
            1,
            "1 दिसंबर 1956 को मेलबर्न ओलंपिक के क्वार्टर फाइनल में नेविले डिसूजा (महाराष्ट्र) ने मेजबान ऑस्ट्रेलिया के खिलाफ हैट्रिक जमाई और भारत को ओलंपिक के सेमीफाइनल में पहुंचाया। वे उस ओलंपिक के संयुक्त शीर्ष स्कोरर (4 गोल) रहे।",
            "Neville D'Souza made Olympic history as the first Asian player to score a hat-trick in Olympic football during the 1956 Games.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q4", "spt_3",
            "दक्षिण अमेरिकी महाद्वीप की सबसे प्रतिष्ठित और दुनिया की सबसे पुरानी अंतर्राष्ट्रीय फुटबॉल प्रतियोगिता कौन-सी है (शुरुआत 1916)?",
            "Which is the oldest extant continental football competition in the world, founded in 1916 in South America under CONMEBOL?",
            listOf("यूईएफए यूरो कप", "कोपा अमेरिका (Copa América - South American Championship, Inaugurated 1916)", "कॉनकाकाफ गोल्ड कप", "अफ्रीका कप ऑफ नेशंस"),
            listOf("UEFA European Championship", "Copa América (Argentina and Uruguay hold joint record of 16 and 15 titles)", "CONCACAF Gold Cup", "Africa Cup of Nations"),
            1,
            "कोपा अमेरिका (1916 में स्थापित) विश्व का सबसे पुराना महाद्वीपीय फुटबॉल टूर्नामेंट है। अर्जेंटीना ने इसे रिकॉर्ड 16 बार और उरुग्वे ने 15 बार जीता है।",
            "Copa América is the top men's football tournament contested among national teams from South America, organized by CONMEBOL.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q5", "spt_3",
            "यूरोपीय फुटबॉल चैंपियनशिप (UEFA European Championship / Euro Cup) का 2024 का 17वां संस्करण किस देश ने इंग्लैंड को 2-1 से हराकर रिकॉर्ड चौथी बार जीता?",
            "Which national team won the UEFA Euro 2024 championship in Berlin, defeating England 2-1 to lift a record fourth European Championship trophy?",
            listOf("फ्रांस", "स्पेन (Spain / La Roja - UEFA Euro 2024 Champions; 4th Title: 1964, 2008, 2012, 2024)", "जर्मनी", "इटली"),
            listOf("France", "Spain (Defeated England 2-1 on 14 July 2024 in Berlin; Lamine Yamal Young Player of Tournament)", "Germany (3 titles)", "Italy"),
            1,
            "14 जुलाई 2024 को बर्लिन (जर्मनी) के ओलंपियास्टेडियम में स्पेन ने इंग्लैंड को 2-1 से हराकर रिकॉर्ड चौथी बार (1964, 2008, 2012, 2024) यूरो कप जीता। 17 वर्षीय लेमिन यामल टूर्नामेंट के सर्वश्रेष्ठ युवा खिलाड़ी रहे।",
            "Spain won UEFA Euro 2024, becoming the first team to win all seven matches in a single European Championship finals tournament.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q6", "spt_3",
            "अंतर्राष्ट्रीय फुटबॉल में मानक फुटबॉल मैच की समय अवधि कितनी होती है?",
            "What is the standard regulatory duration of a professional association football match?",
            listOf("80 मिनट (40-40 मिनट के 2 हाफ)", "90 मिनट (45-45 मिनट के 2 हाफ) / 90 Minutes (Two halves of 45 minutes each + Extra Time)", "100 मिनट", "60 मिनट (30-30 मिनट)"),
            listOf("80 minutes", "90 minutes (Divided into two equal periods of 45 minutes, plus stoppage/injury time)", "100 minutes", "60 minutes"),
            1,
            "एक मानक फुटबॉल मैच 90 मिनट का होता है (45-45 मिनट के 2 हाफ तथा बीच में 15 मिनट का हाफ-टाइम ब्रेक)। नॉकआउट मैचों में ड्रॉ होने पर 30 मिनट का अतिरिक्त समय (15-15 मिनट) और फिर पेनल्टी शूटआउट होता है।",
            "A standard football match consists of two halves of 45 minutes each, totaling 90 minutes of regulation playing time.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q7", "spt_3",
            "फुटबॉल में जब कोई खिलाड़ी फाउल करता है तो रेफरी द्वारा 'रेड कार्ड' (Red Card) दिखाने का क्या परिणाम होता है?",
            "What is the immediate disciplinary consequence when a referee shows a Red Card to a player during a football match?",
            listOf("खिलाड़ी को 10 मिनट के लिए बाहर बैठना पड़ता है", "खिलाड़ी को तुरंत मैदान से बाहर (Expulsion / Sent Off) कर दिया जाता है और उसकी जगह कोई सब्स्टिट्यूट नहीं आ सकता (टीम 10 खिलाड़ियों से खेलती है)", "विपक्षी टीम को 2 पेनल्टी मिलती हैं", "केवल चेतावनी होती है"),
            listOf("10 minute sin-bin", "The player is immediately sent off for the remainder of the match with no substitution allowed (team plays with 10 players)", "Opponent gets 2 penalties", "Simple warning"),
            1,
            "रेड कार्ड (सीधा रेड कार्ड या दो यलो कार्ड) मिलने पर खिलाड़ी को तुरंत मैदान छोड़ना पड़ता है। टीम को शेष मैच 10 खिलाड़ियों के साथ खेलना पड़ता है और उस खिलाड़ी पर अगले मैचों का प्रतिबंध लगता है।",
            "A red card results in the immediate dismissal of the offending player from the field of play without substitution.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q8", "spt_3",
            "फीफा महिला फुटबॉल विश्व कप (FIFA Women's World Cup) के इतिहास में सर्वाधिक 4 बार खिताब जीतने वाली सबसे सफल टीम कौन-सी है?",
            "Which national team has won the FIFA Women's World Cup a record four times (1991, 1999, 2015, 2019)?",
            listOf("जर्मनी (2 बार)", "संयुक्त राज्य अमेरिका (United States Women's National Team - USWNT / 4 Titles)", "नॉर्वे", "जापान"),
            listOf("Germany (2 titles)", "United States (USWNT - Champions in 1991, 1999, 2015, 2019)", "Norway", "Japan"),
            1,
            "अमेरिकी महिला राष्ट्रीय टीम (USWNT) ने रिकॉर्ड 4 बार (1991, 1999, 2015, 2019) फीफा महिला विश्व कप जीता है। 2023 का 9वां महिला विश्व कप स्पेन ने इंग्लैंड को हराकर जीता।",
            "The United States Women's National Team is the most successful in international women's soccer, with four Women's World Cup titles.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q9", "spt_3",
            "फीफा द्वारा वर्ष के सबसे सुंदर और उत्कृष्ट गोल के लिए 2009 से कौन-सा प्रतिष्ठित वार्षिक पुरस्कार प्रदान किया जाता है?",
            "Which prestigious annual award was established by FIFA in 2009 to honor the player judged to have scored the most aesthetically significant or beautiful goal of the calendar year?",
            listOf("गोल्डन बूट", "फीफा पुस्कास पुरस्कार (FIFA Puskás Award - Named after Hungarian legend Ferenc Puskás)", "गोल्डन बॉल", "यशिन ट्रॉफी"),
            listOf("Golden Boot", "FIFA Puskás Award (Inaugurated in October 2009 in honor of Real Madrid and Hungary icon Ferenc Puskás)", "Golden Ball", "Yashin Trophy (Best Goalkeeper)"),
            1,
            "फीफा पुस्कास पुरस्कार (2009 से शुरू) हंगरी और रियल मैड्रिड के महान स्ट्राइकर फेरेंक पुस्कास के सम्मान में वर्ष के सबसे शानदार गोल के लिए दिया जाता है। पहला पुरस्कार 2009 में क्रिस्टियानो रोनाल्डो ने जीता था।",
            "The FIFA Puskás Award is presented annually to the footballer who scored the most spectacular goal in world football.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q10", "spt_3",
            "फीफा विश्व कप में सर्वश्रेष्ठ गोलकीपर (Best Goalkeeper of the Tournament) को कौन-सा प्रतिष्ठित पुरस्कार प्रदान किया जाता है जिसे पूर्व में 'लेव यशिन पुरस्कार' कहा जाता था?",
            "Which prestigious individual trophy is awarded to the best goalkeeper of the FIFA World Cup tournament (formerly known as the Lev Yashin Award from 1994 to 2006)?",
            listOf("गोल्डन बूट", "गोल्डन ग्लव पुरस्कार (Golden Glove Award / FIFA World Cup Golden Glove)", "गोल्डन बॉल", "सिल्वर बूट"),
            listOf("Golden Boot", "Golden Glove Award (Won by Emiliano Martínez in 2022, Thibaut Courtois in 2018, Manuel Neuer in 2014)", "Golden Ball", "Silver Boot"),
            1,
            "विश्व कप के सर्वश्रेष्ठ गोलकीपर को 'गोल्डन ग्लव' (Golden Glove) दिया जाता है। 2022 में अर्जेंटीना के एमिलियानो मार्टिनेज, 2018 में बेल्जियम के थिबॉट कर्टोइस और 2014 में जर्मनी के मैनुअल नेउर ने यह पुरस्कार जीता।",
            "The Golden Glove Award is presented to the most outstanding goalkeeper of each FIFA World Cup finals tournament.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q11", "spt_3",
            "भारतीय सुपर लीग (ISL - Indian Super League) की शुरुआत 2014 में हुई थी। यह वर्तमान में भारत की कौन-सी शीर्ष पेशेवर फुटबॉल लीग है?",
            "The Indian Super League (ISL) was inaugurated in 2014; which league does it represent in the Indian football pyramid today?",
            listOf("द्वितीय श्रेणी लीग", "भारत की शीर्ष स्तरीय पुरुष पेशेवर फुटबॉल लीग (Top-tier Men's Professional Football League of India)", "राज्य स्तरीय लीग", "अंडर-19 लीग"),
            listOf("Second Division", "Top-tier Men's Professional Football League in the Indian football system (Recognized by AIFF and AFC)", "State League", "U-19 League"),
            1,
            "इंडियन सुपर लीग (ISL) भारत की आधिकारिक शीर्ष-स्तरीय फुटबॉल लीग है (जिसका विजेता AFC चैंपियंस लीग के लिए क्वालीफाई करता है)। एटलेटिको डी कोलकाता (ATK) ने 2014 में इसका पहला खिताब जीता था।",
            "The Indian Super League (ISL) is the premier men's professional football league in India, organized by AIFF and FSDL.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q12", "spt_3",
            "दक्षिण एशियाई फुटबॉल महासंघ (SAFF Championship) के इतिहास में सर्वाधिक 9 बार खिताब जीतने वाला सबसे सफल देश कौन-सा है?",
            "Which national football team is the most successful in SAFF Championship history, winning a record 9 championship titles?",
            listOf("मालदीव", "भारत (India - Record 9 SAFF Championship Titles: 1993, 1997, 1999, 2005, 2009, 2011, 2015, 2021, 2023)", "नेपाल", "बांग्लादेश"),
            listOf("Maldives (2 titles)", "India (Blue Tigers - 9-time SAFF Champions, winning most recently in Bengaluru 2023)", "Nepal", "Bangladesh"),
            1,
            "भारतीय फुटबॉल टीम ('ब्लू टाइगर्स') ने रिकॉर्ड 9 बार सैफ चैंपियनशिप जीती है (1993, 1997, 1999, 2005, 2009, 2011, 2015, 2021, 2023)। 2023 में बेंगलुरु में कुवैत को हराकर 9वां खिताब जीता।",
            "India is the undisputed dominant force in South Asian football, capturing nine SAFF Championship crowns.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q13", "spt_3",
            "इंग्लिश प्रीमियर लीग (EPL - Premier League) की स्थापना 1992 में हुई थी। इसके इतिहास में सर्वाधिक 13 खिताब सर एलेक्स फर्ग्यूसन के मार्गदर्शन में किस क्लब ने जीते हैं?",
            "Which English football club has won the most Premier League titles (13 titles) since the competition's formation in 1992, all under Sir Alex Ferguson?",
            listOf("आर्सेनल", "मैनचेस्टर यूनाइटेड (Manchester United FC - 13 Premier League Titles / 20 English League Titles)", "चेल्सी", "मैनचेस्टर सिटी"),
            listOf("Arsenal", "Manchester United (Won 13 Premier League titles between 1993 and 2013 under Sir Alex Ferguson)", "Chelsea", "Manchester City"),
            1,
            "मैनचेस्टर यूनाइटेड ने 1992 में EPL बनने के बाद रिकॉर्ड 13 खिताब जीते हैं (कुल 20 अंग्रेजी शीर्ष लीग खिताब)। सर एलेक्स फर्ग्यूसन ने 1986 से 2013 तक क्लब को अभूतपूर्व सफलता दिलाई।",
            "Manchester United is the most successful club of the Premier League era, claiming 13 league championships.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q14", "spt_3",
            "फुटबॉल में 'पेनल्टी स्पॉट' (Penalty Spot) गोल लाइन से कितनी दूरी पर स्थित होता है?",
            "What is the standard regulatory distance of the penalty mark from the midpoint between the goalposts in football?",
            listOf("10 गज (9.15 मीटर)", "12 गज / 36 फीट / 11 मीटर (12 Yards / 11 Meters from Goal Line)", "15 गज (13.7 मीटर)", "18 गज (16.5 मीटर)"),
            listOf("10 yards", "12 yards (11 meters / 36 feet from the center of the goal line)", "15 yards", "18 yards"),
            1,
            "फुटबॉल में पेनल्टी स्पॉट गोल लाइन के ठीक मध्य से 12 गज (11 मीटर) की दूरी पर पेनल्टी बॉक्स के भीतर स्थित होता है। पेनल्टी क्षेत्र 18 गज (16.5 मीटर) गहरा होता है।",
            "A penalty kick is taken from the penalty mark, which is positioned 12 yards (11 m) away from the goal line.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m6_q15", "spt_3",
            "इतिहास के सबसे महान फुटबॉल गोलकीपरों में से एक सोवियत संघ के 'लेव यशिन' (Lev Yashin - द ब्लैक स्पाइडर) एकमात्र ऐसे गोलकीपर हैं जिन्होंने 1963 में कौन-सा प्रतिष्ठित पुरस्कार जीता था?",
            "Soviet legendary goalkeeper Lev Yashin (nicknamed 'The Black Spider') remains the only goalkeeper in football history to have won which ultimate individual award in 1963?",
            listOf("गोल्डन बूट", "बैलन डी'ओर (Ballon d'Or - 1963 / Only Goalkeeper in History to win Ballon d'Or)", "फीफा बेस्ट प्लेयर", "पुस्कास अवॉर्ड"),
            listOf("Golden Boot", "Ballon d'Or (Won in 1963; saved over 150 penalty kicks and kept 270 clean sheets in his career)", "FIFA Best Player", "Puskás Award"),
            1,
            "लेव यशिन (1929-1990) को फुटबॉल इतिहास का सबसे महान गोलकीपर माना जाता है। उन्होंने अपने करियर में 150 से अधिक पेनल्टी रोकीं और वे 1963 में 'बैलन डी'ओर' जीतने वाले इतिहास के एकमात्र गोलकीपर हैं।",
            "Lev Yashin is universally regarded as the greatest goalkeeper in the history of the sport and the sole goalkeeper to win the Ballon d'Or.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_3", 7, 10, baseQuestions)
    }
}
