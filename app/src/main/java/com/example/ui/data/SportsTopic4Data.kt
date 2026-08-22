package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic4Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_4_m1_q1", "spt_4",
            "विश्व का सबसे पुराना और सबसे प्रतिष्ठित टेनिस टूर्नामेंट 'विंबलडन चैंपियनशिप' (Wimbledon Championships) किस कोर्ट (Court Surface) पर खेला जाता है और इसकी शुरुआत कब हुई थी?",
            "Which is the oldest tennis tournament in the world, founded in 1877 at the All England Club in London, and played on what surface?",
            listOf("क्ले कोर्ट (मिट्टी का मैदान)", "ग्रास कोर्ट / घास का मैदान (Grass Court - Founded 1877, All England Lawn Tennis Club, Wimbledon)", "हार्ड कोर्ट", "कारपेट कोर्ट"),
            listOf("Clay court", "Grass Court (Founded July 1877; traditional white attire dress code)", "Hard court", "Carpet court"),
            1,
            "विंबलडन (स्थापना 1877) लंदन के 'ऑल इंग्लैंड लॉन टेनिस क्लब' में घास के मैदान (Grass Court) पर खेला जाता है। यह चारों ग्रैंड स्लैम में सबसे पुराना है और खिलाड़ियों के लिए सफेद परिधान पहनना अनिवार्य है।",
            "Wimbledon is the oldest tennis tournament in the world, widely regarded as the most prestigious, played on outdoor grass courts.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q2", "spt_4",
            "कैलेंडर वर्ष में खेले जाने वाले चारों टेनिस ग्रैंड स्लैम टूर्नामेंटों (Grand Slam Tournaments) का सही कालानुक्रमिक क्रम क्या है?",
            "What is the correct chronological order of the four annual tennis Grand Slam tournaments held throughout the calendar year?",
            listOf("विंबलडन, फ्रेंच ओपन, यूएस ओपन, ऑस्ट्रेलियन ओपन", "ऑस्ट्रेलियन ओपन (जनवरी), फ्रेंच ओपन (मई-जून), विंबलडन (जून-जुलाई), यूएस ओपन (अगस्त-सितंबर)", "यूएस ओपन, विंबलडन, फ्रेंच ओपन, ऑस्ट्रेलियन ओपन", "फ्रेंच ओपन, ऑस्ट्रेलियन ओपन, विंबलडन, यूएस ओपन"),
            listOf("Wimbledon, French Open, US Open, Australian Open", "Australian Open (Jan - Hard), French Open (May-Jun - Clay), Wimbledon (Jun-Jul - Grass), US Open (Aug-Sep - Hard)", "US Open, Wimbledon, French Open, Australian Open", "French Open, Australian Open, Wimbledon, US Open"),
            1,
            "कैलेंडर वर्ष में चारों ग्रैंड स्लैम का क्रम: 1. ऑस्ट्रेलियन ओपन (मेलबर्न, हार्ड कोर्ट - जनवरी), 2. फ्रेंच ओपन / रोलां गैरोस (पेरिस, क्ले कोर्ट - मई-जून), 3. विंबलडन (लंदन, ग्रास कोर्ट - जुलाई), 4. यूएस ओपन (न्यूयॉर्क, हार्ड कोर्ट - अगस्त-सितंबर)।",
            "The four Grand Slam tournaments are played in chronological order: Australian Open, French Open (Roland Garros), Wimbledon, and the US Open.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q3", "spt_4",
            "पेरिस में क्ले कोर्ट (लाल मिट्टी) पर खेले जाने वाले फ्रेंच ओपन (Roland Garros) को रिकॉर्ड 14 बार जीतने वाले महान स्पेनिश खिलाड़ी कौन हैं जिन्हें 'किंग ऑफ क्ले' (King of Clay) कहा जाता है?",
            "Which Spanish tennis legend has won a record 14 French Open men's singles titles at Roland Garros, celebrated as the undisputed 'King of Clay'?",
            listOf("रोजर फेडरर", "राफेल नडाल (Rafael Nadal, Spain - 'King of Clay' / 14 French Open & 22 Grand Slam Titles)", "नोवाक जोकोविच", "कार्लोस अल्कराज"),
            listOf("Roger Federer", "Rafael Nadal (Won Roland Garros in 2005-08, 2010-14, 2017-20, 2022; 112-4 win-loss match record in Paris)", "Novak Djokovic", "Carlos Alcaraz"),
            1,
            "राफेल नडाल (स्पेन) ने रोलां गैरोस में 14 फ्रेंच ओपन खिताब (कुल 22 ग्रैंड स्लैम) जीतकर क्ले कोर्ट पर खेल इतिहास का सबसे एकतरफा दबदबा कायम किया। उन्हें 'किंग ऑफ क्ले' कहा जाता है।",
            "Rafael Nadal is widely recognized as the greatest clay-court player in tennis history, holding an unparalleled 14 French Open singles titles.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q4", "spt_4",
            "पुरुष एकल टेनिस में सर्वाधिक 24 ग्रैंड स्लैम खिताब (24 Men's Singles Grand Slam Titles) जीतने का सर्वकालिक विश्व रिकॉर्ड किस सर्बियाई खिलाड़ी के नाम है?",
            "Which Serbian tennis champion holds the all-time men's record for winning the most Grand Slam singles titles in tennis history (24 titles)?",
            listOf("रोजर फेडरर (20 खिताब)", "नोवाक जोकोविच (Novak Djokovic, Serbia - 24 Grand Slam Titles / 10 Australian Open)", "राफेल नडाल (22 खिताब)", "पीट सम्प्रास (14 खिताब)"),
            listOf("Roger Federer (20 titles)", "Novak Djokovic (Won 10 Australian Open, 7 Wimbledon, 4 US Open, 3 French Open titles)", "Rafael Nadal (22 titles)", "Pete Sampras (14 titles)"),
            1,
            "नोवाक जोकोविच (सर्बिया) ने रिकॉर्ड 24 ग्रैंड स्लैम पुरुष एकल खिताब जीते हैं (10 ऑस्ट्रेलियन ओपन, 7 विंबलडन, 4 यूएस ओपन, 3 फ्रेंच ओपन)। उन्होंने सर्वाधिक 400+ सप्ताह विश्व नंबर 1 रहने का भी रिकॉर्ड बनाया है।",
            "Novak Djokovic has won an all-time record 24 Grand Slam men's singles titles and completed the career Golden Slam in 2024.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q5", "spt_4",
            "20 ग्रैंड स्लैम एकल खिताब जीतने वाले और 8 बार विंबलडन चैंपियन रहे किस स्विस टेनिस दिग्गज को 'टेनिस का सर्वकालिक सबसे सुंदर और सुरुचिपूर्ण खिलाड़ी' माना जाता है?",
            "Which Swiss tennis legend, known for his effortless single-handed backhand and sportsmanship, won 20 Grand Slam titles and a record 8 Wimbledon men's singles crowns?",
            listOf("स्टेन वावरिंका", "रोजर फेडरर (Roger Federer, Switzerland - 20 Grand Slam Titles / 8 Wimbledon / Retired 2022)", "राफेल नडाल", "आंद्रे अगासी"),
            listOf("Stan Wawrinka", "Roger Federer (Held ATP world No. 1 ranking for 310 weeks, including record 237 consecutive weeks)", "Rafael Nadal", "Andre Agassi"),
            1,
            "रोजर फेडरर (स्विट्जरलैंड) ने 20 ग्रैंड स्लैम खिताब (8 विंबलडन, 6 ऑस्ट्रेलियन ओपन, 5 यूएस ओपन, 1 फ्रेंच ओपन) जीते। उन्होंने सितंबर 2022 में लेवर कप में अपने संन्यास की घोषणा की।",
            "Roger Federer was the first male player to reach 20 Grand Slam singles titles, revolutionizing the modern sport of tennis.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q6", "spt_4",
            "महिला टेनिस में ओपन एरा में सर्वाधिक 23 ग्रैंड स्लैम एकल खिताब (23 Grand Slam Singles Titles in Open Era) जीतने वाली अमेरिकी खिलाड़ी कौन हैं?",
            "Which American tennis icon won a record 23 Grand Slam women's singles titles in the Open Era, along with 14 Grand Slam doubles titles with sister Venus?",
            listOf("मार्टिना नवरातिलोवा", "सेरेना विलियम्स (Serena Williams, USA - 23 Grand Slam Singles Titles)", "स्टेफी ग्राफ (22 खिताब)", "मार्गरेट कोर्ट (24 खिताब)"),
            listOf("Martina Navratilova", "Serena Williams (Won 7 Australian Open, 7 Wimbledon, 6 US Open, 3 French Open titles)", "Steffi Graf (22 titles / Golden Slam 1988)", "Margaret Court"),
            1,
            "सेरेना विलियम्स (यूएसए) ने ओपन एरा में रिकॉर्ड 23 ग्रैंड स्लैम एकल खिताब और 4 ओलंपिक स्वर्ण पदक जीते हैं। (ऑल-टाइम रिकॉर्ड मार्गरेट कोर्ट के नाम 24 खिताब है)।",
            "Serena Williams is universally regarded as one of the greatest female tennis players of all time, dominating the women's tour for over two decades.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q7", "spt_4",
            "ग्रैंड स्लैम खिताब (1997 फ्रेंच ओपन मिक्स्ड डबल्स) जीतने वाले पहले भारतीय टेनिस खिलाड़ी कौन थे जिन्होंने कुल 12 ग्रैंड स्लैम युगल खिताब जीते?",
            "Who was the first Indian tennis player to win a Grand Slam title, winning the 1997 French Open Mixed Doubles alongside Rika Hiraki of Japan?",
            listOf("लिएंडर पेस", "महेश भूपति (Mahesh Bhupathi - 12 Grand Slam Doubles Titles / First Indian Grand Slam Champion)", "रोहन बोपन्ना", "विजय अमृतराज"),
            listOf("Leander Paes", "Mahesh Bhupathi (Won 4 Men's Doubles & 8 Mixed Doubles Grand Slam trophies; completed Career Mixed Slam)", "Rohan Bopanna", "Vijay Amritraj"),
            1,
            "महेश भूपति ने 1997 में जापान की रिका हिराकी के साथ फ्रेंच ओपन मिक्स्ड डबल्स जीतकर पहला भारतीय ग्रैंड स्लैम खिताब हासिल किया। उन्होंने कुल 12 ग्रैंड स्लैम (4 पुरुष युगल + 8 मिश्रित युगल) जीते।",
            "Mahesh Bhupathi made history as India's first Grand Slam champion in 1997, pioneering Indian success in professional doubles tennis.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q8", "spt_4",
            "1996 के अटलांटा ओलंपिक में पुरुष एकल टेनिस में कांस्य पदक जीतने वाले और 18 ग्रैंड स्लैम युगल खिताब जीतने वाले भारत के महान टेनिस खिलाड़ी कौन हैं?",
            "Which legendary Indian tennis player won the Olympic Bronze Medal in Men's Singles at Atlanta 1996 and captured 18 Grand Slam doubles titles (8 Men's + 10 Mixed)?",
            listOf("महेश भूपति", "लिएंडर पेस (Leander Paes - Atlanta 1996 Olympic Bronze / 18 Grand Slam Titles / 7 Consecutive Olympics)", "रोहन बोपन्ना", "सोमदेव देववर्मन"),
            listOf("Mahesh Bhupathi", "Leander Paes (Competed in 7 consecutive Olympic Games: 1992-2016; Career Grand Slam in both Men's & Mixed Doubles)", "Rohan Bopanna", "Somdev Devvarman"),
            1,
            "लिएंडर पेस ने 1996 अटलांटा ओलंपिक में एकल कांस्य पदक जीता (44 साल बाद भारत का पहला व्यक्तिगत ओलंपिक पदक)। उन्होंने 8 पुरुष युगल और 10 मिश्रित युगल ग्रैंड स्लैम जीते और लगातार 7 ओलंपिक (1992-2016) खेले।",
            "Leander Paes is considered one of the greatest doubles tennis players of all time, inducted into the International Tennis Hall of Fame in 2024.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q9", "spt_4",
            "6 ग्रैंड स्लैम युगल खिताब जीतने वाली और महिला युगल में विश्व नंबर 1 रैंकिंग हासिल करने वाली भारत की पहली और सबसे सफल महिला टेनिस खिलाड़ी कौन हैं?",
            "Who is India's most successful female tennis player, winning 6 Grand Slam doubles titles (3 Women's + 3 Mixed) and reaching World No. 1 in Women's Doubles?",
            listOf("अंकिता रैना", "सानिया मिर्जा (Sania Mirza - 6 Grand Slam Titles / World No. 1 in WTA Doubles / Khel Ratna)", "निरुपमा संजीव", "करमन कौर थांडी"),
            listOf("Ankita Raina", "Sania Mirza (Won 2015 Wimbledon, 2015 US Open, 2016 Australian Open women's doubles with Martina Hingis)", "Nirupama Sanjeev", "Karman Kaur Thandi"),
            1,
            "सानिया मिर्जा ने मार्टिना हिंगिस के साथ 3 महिला युगल और महेश भूपति व ब्रूनो सोरेस के साथ 3 मिश्रित युगल ग्रैंड स्लैम जीते। वे 91 सप्ताह तक WTA युगल में विश्व नंबर 1 रहीं।",
            "Sania Mirza revolutionized women's sports in India, becoming the country's highest-ranked female singles player and world No. 1 in doubles.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q10", "spt_4",
            "43 वर्ष की आयु में 2024 ऑस्ट्रेलियन ओपन पुरुष युगल जीतकर 'ओपन एरा में सबसे उम्रदराज ग्रैंड स्लैम चैंपियन और विश्व नंबर 1' बनने का ऐतिहासिक रिकॉर्ड किस भारतीय खिलाड़ी ने बनाया?",
            "Which Indian tennis player became the oldest first-time World No. 1 and oldest Grand Slam champion in Open Era history by winning the 2024 Australian Open Men's Doubles at age 43?",
            listOf("लिएंडर पेस", "रोहन बोपन्ना (Rohan Bopanna - Won Australian Open 2024 with Matthew Ebden / World No. 1 at age 43)", "महेश भूपति", "युकी भांबरी"),
            listOf("Leander Paes", "Rohan Bopanna (Paired with Australia's Matthew Ebden to win men's doubles title in January 2024)", "Mahesh Bhupathi", "Yuki Bhambri"),
            1,
            "रोहन बोपन्ना (कर्नाटक) ने जनवरी 2024 में ऑस्ट्रेलिया के मैथ्यू एब्डेन के साथ ऑस्ट्रेलियन ओपन पुरुष युगल का खिताब जीतकर 43 वर्ष की आयु में सबसे उम्रदराज ग्रैंड स्लैम विजेता और एटीपी युगल में विश्व नंबर 1 बनने का कीर्तिमान बनाया।",
            "Rohan Bopanna set an extraordinary longevity milestone in tennis, crowned Australian Open doubles champion and world No. 1 at age 43.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q11", "spt_4",
            "1980 में प्रतिष्ठित 'ऑल इंग्लैंड ओपन बैडमिंटन चैंपियनशिप' (All England Open Badminton Championship) का पुरुष एकल खिताब जीतने वाले पहले भारतीय खिलाड़ी कौन थे?",
            "Who became the first Indian badminton player to win the prestigious All England Open Men's Singles Championship, defeating Liem Swie King in London in March 1980?",
            listOf("पुलेला गोपीचंद", "प्रकाश पादुकोण (Prakash Padukone - 1980 All England Champion / World No. 1)", "सैयद मोदी", "दिनेश खन्ना"),
            listOf("Pullela Gopichand (Won 2001 All England)", "Prakash Padukone (First Indian to achieve world No. 1 badminton ranking in 1980)", "Syed Modi", "Dinesh Khanna"),
            1,
            "प्रकाश पादुकोण (कर्नाटक) ने 23 मार्च 1980 को लंदन के वेम्बली एरिना में इंडोनेशिया के लिएम स्वी किंग को 15-3, 15-10 से हराकर ऑल इंग्लैंड खिताब जीता और विश्व नंबर 1 बने। 2001 में पुलेला गोपीचंद यह खिताब जीतने वाले दूसरे भारतीय बने।",
            "Prakash Padukone was a pioneer of Indian badminton, winning the 1980 All England title and establishing the foundation for modern Indian badminton.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q12", "spt_4",
            "2019 में बीडब्ल्यूएफ विश्व बैडमिंटन चैंपियनशिप (BWF World Championships) में स्वर्ण पदक जीतकर 'विश्व बैडमिंटन चैंपियन' बनने वाली पहली भारतीय खिलाड़ी कौन हैं?",
            "Who created history in Basel, Switzerland in August 2019 by becoming the first Indian ever to win a Gold Medal at the BWF World Badminton Championships?",
            listOf("साइना नेहवाल", "पी. वी. सिंधु (P. V. Sindhu - BWF World Champion 2019 / Defeated Nozomi Okuhara 21-7, 21-7)", "ज्वाला गुट्टा", "लक्ष्य सेन"),
            listOf("Saina Nehwal", "P. V. Sindhu (Demolished Japan's Nozomi Okuhara in 38 minutes to win historic World Championship Gold)", "Jwala Gutta", "Lakshya Sen"),
            1,
            "25 अगस्त 2019 को बासेल (स्विट्जरलैंड) में पी.वी. सिंधु ने जापान की नोजोमी ओकुहारा को 21-7, 21-7 से हराकर भारत के लिए पहला विश्व बैडमिंटन स्वर्ण पदक जीता। उनके नाम विश्व चैंपियनशिप में कुल 5 पदक (1 स्वर्ण, 2 रजत, 2 कांस्य) हैं।",
            "P. V. Sindhu became the first Indian to become badminton world champion at the 2019 BWF World Championships.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q13", "spt_4",
            "ओलंपिक में बैडमिंटन में भारत के लिए पहला पदक (2012 लंदन ओलंपिक में महिला एकल कांस्य पदक) किस खिलाड़ी ने जीता था?",
            "Who won India's first-ever Olympic medal in badminton, securing Bronze in Women's Singles at the 2012 London Olympic Games?",
            listOf("पी. वी. सिंधु", "साइना नेहवाल (Saina Nehwal - London 2012 Olympic Bronze / First Indian World No. 1 Woman)", "अश्विनी पोनप्पा", "अपर्णा पोपट"),
            listOf("P. V. Sindhu", "Saina Nehwal (Won bronze when China's Wang Xin retired injured; first Indian woman to reach world No. 1 in 2015)", "Ashwini Ponnappa", "Aparna Popat"),
            1,
            "साइना नेहवाल (हिसार, हरियाणा) ने 4 अगस्त 2012 को लंदन ओलंपिक में कांस्य पदक जीतकर बैडमिंटन में भारत का पहला ओलंपिक पदक हासिल किया। 2015 में वे बीडब्ल्यूएफ महिला एकल में विश्व नंबर 1 बनने वाली पहली भारतीय बनीं।",
            "Saina Nehwal is an Indian badminton player who won a bronze medal at the 2012 London Olympics and attained world No. 1 ranking in 2015.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q14", "spt_4",
            "भारतीय पुरुष बैडमिंटन टीम ने मई 2022 में 14 बार के चैंपियन इंडोनेशिया को 3-0 से हराकर 73 साल के इतिहास में पहली बार कौन-सा विश्व टीम कप (World Men's Team Championship) जीता?",
            "Which prestigious World Men's Team Badminton Championship did the Indian men's team win for the first time in history in Bangkok in May 2022, defeating 14-time champions Indonesia 3-0 in the final?",
            listOf("उबेर कप (महिला कप)", "थॉमस कप (Thomas Cup - Men's World Team Badminton Championship 2022)", "सुदीरमन कप (मिक्स्ड कप)", "डेविस कप"),
            listOf("Uber Cup (Women's world team championship)", "Thomas Cup (India won 3-0 via Lakshya Sen, Satwik-Chirag, and Kidambi Srikanth)", "Sudirman Cup (Mixed team world cup)", "Davis Cup (Tennis)"),
            1,
            "15 मई 2022 को बैंकॉक में भारत ने 14 बार के चैंपियन इंडोनेशिया को 3-0 से हराकर पहली बार प्रतिष्ठित 'थॉमस कप' जीता। लक्ष्य सेन, सात्विकसाईराज रंकीरेड्डी - चिराग शेट्टी और किदांबी श्रीकांत ने अपने-अपने मैच जीते।",
            "India's historic Thomas Cup victory in 2022 is regarded as one of the greatest team achievements in Indian sporting history.",
            "Easy"
        ),
        makeSportsQ(
            "spt_4_m1_q15", "spt_4",
            "पुरुषों की अंतर्राष्ट्रीय टीम टेनिस चैम्पियनशिप 'डेविस कप' (Davis Cup) की शुरुआत किस वर्ष हुई थी जिसे 'टेनिस का विश्व कप' कहा जाता है?",
            "In which year was the Davis Cup (premier international team event in men's tennis, colloquially called the 'World Cup of Tennis') founded by Dwight F. Davis?",
            listOf("1877", "1900 (Davis Cup - Founded in August 1900 as International Lawn Tennis Challenge)", "1924", "1950"),
            listOf("1877", "1900 (Originally played between Great Britain and United States at Longwood Cricket Club, Boston)", "1924", "1950"),
            1,
            "डेविस कप (1900 में ड्वाइट डेविस द्वारा शुरू) पुरुषों की वार्षिक अंतरराष्ट्रीय टीम टेनिस प्रतियोगिता है। अमेरिका ने इसे सर्वाधिक 32 बार और ऑस्ट्रेलिया ने 28 बार जीता है। (महिला समकक्ष टूर्नामेंट को 'बिली जीन किंग कप' / पूर्व में फेड कप कहते हैं)।",
            "The Davis Cup is the premier international team event in men's tennis, run by the International Tennis Federation (ITF).",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_4", 2, 5, baseQuestions)
    }
}
