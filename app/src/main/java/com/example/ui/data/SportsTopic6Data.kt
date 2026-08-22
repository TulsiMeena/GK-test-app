package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic6Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_6_m1_q1", "spt_6",
            "भारत का सर्वोच्च खेल पुरस्कार 'मेजर ध्यानचंद खेल रत्न पुरस्कार' (पूर्व में राजीव गांधी खेल रत्न पुरस्कार) पहली बार 1991-92 में किस महान खिलाड़ी को दिया गया था?",
            "Who was the inaugural recipient of India's highest sporting honor, the Major Dhyan Chand Khel Ratna Award (originally Rajiv Gandhi Khel Ratna), in 1991-92?",
            listOf("सचिन तेंदुलकर (1997-98)", "विश्वनाथन आनंद (Viswanathan Anand - Chess Grandmaster, First Recipient 1991-92)", "गीत सेठी (1992-93)", "कपिल देव"),
            listOf("Sachin Tendulkar", "Viswanathan Anand (First Indian Chess Grandmaster and 5-time World Chess Champion)", "Geet Sethi (Billiards)", "Kapil Dev"),
            1,
            "भारत का सर्वोच्च खेल सम्मान खेल रत्न (स्थापना 1991-92) पहली बार भारत के पहले ग्रैंडमास्टर और 5 बार के विश्व शतरंज चैंपियन विश्वनाथन आनंद को दिया गया था। अगस्त 2021 में इसका नाम बदलकर 'मेजर ध्यानचंद खेल रत्न पुरस्कार' कर दिया गया।",
            "Viswanathan Anand was the first recipient of the Rajiv Gandhi Khel Ratna Award in 1991-92 for his exceptional achievements in chess.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q2", "spt_6",
            "वर्तमान में 'मेजर ध्यानचंद खेल रत्न पुरस्कार' (Major Dhyan Chand Khel Ratna Award) के विजेता को कितनी नकद पुरस्कार राशि (Cash Prize) प्रदान की जाती है?",
            "What is the current cash prize amount awarded to recipients of the Major Dhyan Chand Khel Ratna Award (revised in 2020)?",
            listOf("₹15 लाख", "₹25 लाख (₹25 Lakhs / 2.5 Million INR along with a medallion and citation)", "₹10 लाख", "₹50 लाख"),
            listOf("₹15 Lakh", "₹25 Lakh (₹25,00,000 INR along with a medal and certificate of honor)", "₹10 Lakh", "₹50 Lakh"),
            1,
            "2020 में राष्ट्रीय खेल पुरस्कारों की नकद राशि बढ़ाई गई: खेल रत्न पुरस्कार में ₹25 लाख (पहले ₹7.5 लाख), अर्जुन पुरस्कार में ₹15 लाख (पहले ₹5 लाख), और द्रोणाचार्य लाइफटाइम में ₹15 लाख दिए जाते हैं।",
            "The cash prize for the Major Dhyan Chand Khel Ratna Award was increased to ₹25 lakh in August 2020.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q3", "spt_6",
            "खेलों में उत्कृष्ट प्रदर्शन के लिए दिए जाने वाले 'अर्जुन पुरस्कार' (Arjuna Award) की शुरुआत किस वर्ष की गई थी?",
            "In which year was the Arjuna Award, India's second-highest sporting honor for consistent outstanding performance, instituted by the Government of India?",
            listOf("1954", "1961 (Arjuna Award - Instituted in 1961 / Bronze statuette of Arjuna with bow and arrow)", "1975", "1985"),
            listOf("1954", "1961 (Awarded for outstanding performance over 4 years; includes bronze statuette of Arjuna and ₹15 lakh)", "1975", "1985"),
            1,
            "अर्जुन पुरस्कार 1961 में स्थापित किया गया था। इसमें कांस्य की धनुर्धर अर्जुन की प्रतिमा, प्रशस्ति पत्र और ₹15 लाख की नकद राशि दी जाती है। 1961 में 20 खिलाड़ियों को यह पुरस्कार दिया गया था (क्रिकेटर सलीम दुर्रानी पहले क्रिकेटर थे)।",
            "The Arjuna Award was instituted in 1961 by the Ministry of Youth Affairs and Sports to recognize outstanding achievements in national sports.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q4", "spt_6",
            "खेल प्रशिक्षकों और कोचों (Sports Coaches) को उत्कृष्ट योगदान के लिए दिया जाने वाला 'द्रोणाचार्य पुरस्कार' (Dronacharya Award) किस वर्ष शुरू किया गया था?",
            "In which year was the Dronacharya Award instituted to honor exceptional coaches in sports and athletics in India?",
            listOf("1961", "1985 (Dronacharya Award - Instituted 1985 / First Recipients: Bhalchandra Bhaskar Bhagwat, O. M. Nambiar, Om Prakash Bhardwaj)", "1991", "2002"),
            listOf("1961", "1985 (Presented to coaches producing medal winners in international events; bronze statuette of Guru Dronacharya)", "1991", "2002"),
            1,
            "द्रोणाचार्य पुरस्कार 1985 में शुरू हुआ। 1985 में यह भालचंद्र भागवत (कुश्ती), ओ. एम. नाम्बियार (एथलेटिक्स - पीटी उषा के कोच) और ओम प्रकाश भारद्वाज (मुक्केबाजी) को पहली बार दिया गया।",
            "The Dronacharya Award was instituted in 1985 to recognize excellence in sports coaching.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q5", "spt_6",
            "भारत में 'राष्ट्रीय खेल दिवस' (National Sports Day) प्रतिवर्ष 29 अगस्त को किस महान हॉकी खिलाड़ी की जयंती के उपलक्ष्य में मनाया जाता है?",
            "National Sports Day (Rashtriya Khel Divas) is celebrated annually across India on 29 August to commemorate the birth anniversary of which legendary sports icon?",
            listOf("मिल्खा सिंह", "मेजर ध्यानचंद / 'हॉकी के जादूगर' (Major Dhyan Chand - 'The Wizard of Hockey' / Born 29 August 1905, Prayagraj)", "के. डी. जाधव", "सी. के. नायडू"),
            listOf("Milkha Singh", "Major Dhyan Chand (Born 29 August 1905 in Allahabad; led India to Olympic Hockey Golds in 1928, 1932, 1936)", "K. D. Jadhav", "C. K. Nayudu"),
            1,
            "29 अगस्त को हॉकी के महान जादूगर मेजर ध्यानचंद (जन्म: 29 अगस्त 1905, प्रयागराज) के जन्मदिवस पर 'राष्ट्रीय खेल दिवस' मनाया जाता है। इस दिन राष्ट्रपति भवन में राष्ट्रपति द्वारा राष्ट्रीय खेल पुरस्कार प्रदान किए जाते हैं।",
            "National Sports Day is celebrated on 29 August in India to honor Major Dhyan Chand's legendary contributions to Indian hockey.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q6", "spt_6",
            "भारत में अंतर-विश्वविद्यालय टूर्नामेंटों में समग्र रूप से सर्वश्रेष्ठ प्रदर्शन करने वाले विश्वविद्यालय को कौन-सी ऐतिहासिक चल-वैजयंती ट्रॉफी दी जाती है?",
            "Which historic rolling trophy, instituted in 1956-57, is awarded annually to the top-performing overall university in inter-university sports tournaments in India?",
            listOf("राजा भालिंद्र सिंह ट्रॉफी", "मौलाना अबुल कलाम आजाद ट्रॉफी / माका ट्रॉफी (Maulana Abul Kalam Azad Trophy - MAKA Trophy)", "लेडी रतन टाटा ट्रॉफी", "डॉ. बी. सी. रॉय ट्रॉफी"),
            listOf("Raja Bhalindra Singh Trophy", "Maulana Abul Kalam Azad (MAKA) Trophy (Guru Nanak Dev University Amritsar has won a record 25+ times)", "Lady Ratan Tata Trophy", "Dr. B. C. Roy Trophy"),
            1,
            "माका (MAKA) ट्रॉफी 1956-57 में भारत के पहले शिक्षा मंत्री मौलाना अबुल कलाम आजाद के नाम पर शुरू की गई थी। यह विश्वविद्यालय खेलों में सर्वश्रेष्ठ प्रदर्शन करने वाले विश्वविद्यालय को दी जाती है। गुरु नानक देव विश्वविद्यालय (अमृतसर) ने इसे सर्वाधिक बार जीता है।",
            "The MAKA Trophy is awarded annually by the President of India to the best all-round university in sports.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q7", "spt_6",
            "भारत में खेलों के विकास और प्रोत्साहन में योगदान देने वाले कॉर्पोरेट/निजी निकायों को कौन-सा राष्ट्रीय पुरस्कार दिया जाता है (शुरुआत 2009)?",
            "Which national sports award was instituted in 2009 to recognize corporate entities (private and public) and sports control boards for promoting sports development in India?",
            listOf("अर्जुन पुरस्कार", "राष्ट्रीय खेल प्रोत्साहन पुरस्कार (Rashtriya Khel Protsahan Puruskar - Instituted 2009)", "द्रोणाचार्य पुरस्कार", "ध्यानचंद पुरस्कार"),
            listOf("Arjuna Award", "Rashtriya Khel Protsahan Puruskar (Awarded for identifying talent, CSR sports funding, and employment of sportspersons)", "Dronacharya Award", "Dhyan Chand Award"),
            1,
            "राष्ट्रीय खेल प्रोत्साहन पुरस्कार (2009) खेल अकादमियों, कॉर्पोरेट संस्थाओं और खेल नियंत्रण बोर्डों को जमीनी स्तर पर खेल प्रतिभाओं की पहचान और प्रोत्साहन के लिए दिया जाता है।",
            "The Rashtriya Khel Protsahan Puruskar is awarded to organizations playing a visible role in the area of sports promotion and development.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q8", "spt_6",
            "प्रतिष्ठित 'आगा खां कप' (Agha Khan Cup) और 'बेगम रसूल ट्रॉफी' किस खेल से संबंधित प्रसिद्ध ट्रॉफियां हैं?",
            "The prestigious 'Agha Khan Cup' and 'Begum Rasul Trophy' are associated with which sport in India?",
            listOf("फुटबॉल", "हॉकी (Field Hockey - Agha Khan Cup, Dhyan Chand Trophy, Rangaswami Cup, Begum Rasul Trophy)", "क्रिकेट", "बैडमिंटन"),
            listOf("Football", "Field Hockey (Agha Khan Cup, Rangaswami Cup, Scindia Gold Cup, Nehru Senior Hockey Trophy)", "Cricket", "Badminton"),
            1,
            "आगा खां कप, रंगास्वामी कप, ध्यानचंद ट्रॉफी, सिंधिया गोल्ड कप, बेटन कप (भारत का सबसे पुराना हॉकी कप - 1895) और बेगम रसूल ट्रॉफी (महिला) हॉकी खेल से संबंधित हैं।",
            "The Agha Khan Cup and Beighton Cup are among the most historic and prestigious domestic field hockey tournaments in India.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q9", "spt_6",
            "घरेलू क्रिकेट की प्रमुख प्रतियोगिताएं 'देवधर ट्रॉफी' (Deodhar Trophy) और 'दिलीप ट्रॉफी' (Duleep Trophy) किस खेल से संबंधित हैं?",
            "The prominent domestic tournaments 'Deodhar Trophy', 'Duleep Trophy', and 'Irani Cup' belong to which sport in India?",
            listOf("हॉकी", "क्रिकेट (Cricket - Ranji Trophy, Duleep Trophy, Deodhar Trophy, Vijay Hazare Trophy, Syed Mushtaq Ali Trophy, Irani Cup)", "फुटबॉल", "शतरंज"),
            listOf("Hockey", "Cricket (Domestic first-class and List A tournaments organized by the BCCI)", "Football", "Chess"),
            1,
            "रणजी ट्रॉफी, दिलीप ट्रॉफी, देवधर ट्रॉफी (प्रो. डी. बी. देवधर के नाम पर), ईरानी कप, विजय हजारे ट्रॉफी (50 ओवर), और सैयद मुश्ताक अली ट्रॉफी (टी-20) भारत की प्रमुख घरेलू क्रिकेट प्रतियोगिताएं हैं।",
            "Deodhar Trophy, Duleep Trophy, and Irani Cup are prestigious domestic cricket competitions administered by the BCCI.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q10", "spt_6",
            "प्रतिष्ठित 'रोवर्स कप' (Rovers Cup), 'सुब्रतो कप' (Subroto Cup) और 'मर्डेका कप' (Merdeka Cup) किस खेल से संबंधित प्रसिद्ध कप हैं?",
            "The historic competitions 'Rovers Cup', 'Subroto Cup' (Inter-school), and 'Merdeka Cup' are associated with which sport?",
            listOf("हॉकी", "फुटबॉल (Football - Durand Cup, Santosh Trophy, Subroto Cup, Rovers Cup, Merdeka Cup, IFA Shield)", "लॉन टेनिस", "बास्केटबॉल"),
            listOf("Hockey", "Football (Rovers Cup founded 1890 in Bombay; Subroto Cup for international school children founded 1960)", "Lawn Tennis", "Basketball"),
            1,
            "डूरंड कप, संतोष ट्रॉफी, सुब्रतो कप (एयर मार्शल सुब्रतो मुखर्जी के नाम पर स्कूली फुटबॉल), रोवर्स कप, मर्डेका कप (मलेशिया) और आईएफए शील्ड फुटबॉल के प्रमुख टूर्नामेंट हैं।",
            "Rovers Cup, Subroto Cup, and Merdeka Tournament are famous football competitions.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q11", "spt_6",
            "विश्व भर में गोल्फ (Golf) के सबसे प्रतिष्ठित पुरुषों के द्विपक्षीय मुकाबले 'राइडर कप' (Ryder Cup) में किन दो टीमों के बीच मुकाबला होता है?",
            "The prestigious Ryder Cup in professional men's golf is contested biennially between teams representing which two entities?",
            listOf("अमेरिका और एशिया", "संयुक्त राज्य अमेरिका और यूरोप (United States and Europe - Biennial Men's Golf Competition)", "ब्रिटेन और ऑस्ट्रेलिया", "विश्व और यूरोप"),
            listOf("USA & Asia", "United States and Europe (Contested since 1927; named after Samuel Ryder)", "Great Britain & Australia", "Rest of the World & Europe"),
            1,
            "राइडर कप (1927 में सैमुअल राइडर द्वारा शुरू) हर दो साल में संयुक्त राज्य अमेरिका और यूरोप की सर्वश्रेष्ठ 12-12 गोल्फ टीमों के बीच खेला जाने वाला सबसे प्रतिष्ठित गोल्फ मुकाबला है। (महिला समकक्ष को 'सोल्हेम कप' कहते हैं)।",
            "The Ryder Cup is a biennial men's golf competition between teams from Europe and the United States.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q12", "spt_6",
            "पोलो (Polo) खेल से संबंधित प्रसिद्ध भारतीय ट्रॉफियां कौन-सी हैं?",
            "Which of the following historic cups and trophies are associated with the equestrian sport of Polo in India?",
            listOf("दिलीप ट्रॉफी और ईरानी कप", "एजरा कप, पृथ्वी सिंह कप और राधा मोहन कप (Ezra Cup, Prithi Singh Cup, Radha Mohan Cup, Winchester Cup)", "रंगास्वामी कप और बेटन कप", "सुब्रतो कप और मर्डेका कप"),
            listOf("Duleep Trophy & Irani Cup", "Ezra Cup (Oldest polo cup in the world - 1880, Calcutta Polo Club), Prithi Singh Cup, Radha Mohan Cup", "Rangaswami Cup & Beighton Cup", "Subroto Cup & Merdeka Cup"),
            1,
            "एजरा कप (1880 में कोलकाता पोलो क्लब द्वारा स्थापित - विश्व का सबसे पुराना पोलो कप), पृथ्वी सिंह कप, राधा मोहन कप और क्लासिक वेस्टर्न कप पोलो खेल से संबंधित हैं।",
            "The Ezra Cup, instituted in 1880 in Calcutta, is the world's oldest polo tournament trophy.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q13", "spt_6",
            "नौकायन / रोइंग (Rowing / Boat Race) के लिए केरल की प्रसिद्ध 'नेहरू ट्रॉफी बोट रेस' (Nehru Trophy Boat Race) किस झील में आयोजित की जाती है?",
            "In which picturesque backwater lake of Alappuzha, Kerala is the world-famous annual 'Nehru Trophy Snake Boat Race' (Vallam Kali) held?",
            listOf("वेम्बनाड झील", "पुन्नमदा झील, अलप्पुझा, केरल (Punnamada Lake, Alappuzha, Kerala - Snake Boat Race / Chundan Vallam)", "अष्टमुडी झील", "सस्थमकोट्टा झील"),
            listOf("Vembanad Lake", "Punnamada Lake, Alappuzha (Held on the second Saturday of August; inaugurated by Pt. Nehru in 1952)", "Ashtamudi Lake", "Sasthamkotta Lake"),
            1,
            "नेहरू ट्रॉफी बोट रेस (वल्लम कली / स्नेक बोट रेस) प्रतिवर्ष अगस्त के दूसरे शनिवार को अलप्पुझा की पुन्नमदा झील में आयोजित होती है। 1952 में पंडित नेहरू ने स्वयं चाँदी की ट्रॉफी प्रदान कर इसकी शुरुआत की थी।",
            "The Nehru Trophy Boat Race is a premier snake boat race held in Punnamada Lake, near Alappuzha, Kerala.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q14", "spt_6",
            "शतरंज (Chess) में विश्व चैंपियन बनने वाले और 'विश्व शतरंज कप' (FIDE World Cup 2023 के फाइनल में मैग्नस कार्लसन से मुकाबला करने वाले) भारत के सबसे युवा ग्रैंडमास्टर कौन हैं?",
            "Who became the youngest player in history to reach the FIDE Chess World Cup final (Baku 2023) at age 18 and won the Candidates Tournament 2024 to challenge for the World Chess Championship?",
            listOf("डी. गुकेश", "आर. प्रज्ञानानंद / रमेशबाबू प्रज्ञानानंद (R. Praggnanandhaa - FIDE World Cup Finalist 2023 / Arjuna Award)", "विदित गुजराती", "पेंटाला हरिकृष्णा"),
            listOf("D. Gukesh (Youngest Candidates Winner in 2024)", "R. Praggnanandhaa (Rameshbabu Praggnanandhaa - Youngest FIDE World Cup finalist in 2023)", "Vidit Gujrathi", "Pentala Harikrishna"),
            1,
            "आर. प्रज्ञानानंद (चेन्नई, तमिलनाडु) ने 2023 फिडे विश्व कप में विश्व नंबर 2 हिकारू नाकामुरा और विश्व नंबर 3 फैबियानो कारुआना को हराकर फाइनल में जगह बनाई थी।",
            "R. Praggnanandhaa is an Indian chess grandmaster who became the youngest World Cup finalist in Baku in 2023.",
            "Easy"
        ),
        makeSportsQ(
            "spt_6_m1_q15", "spt_6",
            "अप्रैल 2024 में 17 वर्ष की आयु में टोरंटो में 'फिडे कैंडिडेट्स शतरंज टूर्नामेंट' (FIDE Candidates 2024) जीतकर विश्व चैंपियनशिप मैच के लिए क्वालीफाई करने वाले इतिहास के सबसे युवा खिलाड़ी कौन बने?",
            "Who created global chess history in April 2024 by becoming the youngest-ever winner of the FIDE Candidates Tournament at age 17 in Toronto, Canada?",
            listOf("आर. प्रज्ञानानंद", "डी. गुकेश / डोम्माराजू गुकेश (D. Gukesh - Youngest World Chess Championship Challenger at 17 years)", "अर्जुन एरिगैसी", "निहाल सरीन"),
            listOf("R. Praggnanandhaa", "D. Gukesh (Dommaraju Gukesh from Chennai, won FIDE Candidates 2024 scoring 9/14 points)", "Arjun Erigaisi", "Nihal Sarin"),
            1,
            "डी. गुकेश (चेन्नई, तमिलनाडु) 17 वर्ष की आयु में 2024 फिडे कैंडिडेट्स टूर्नामेंट जीतकर गैरी कास्पारोव (20 वर्ष) का 40 साल पुराना रिकॉर्ड तोड़कर विश्व चैंपियनशिप के सबसे युवा चैलेंजर बने।",
            "D. Gukesh became the youngest-ever player to win the FIDE Candidates Tournament at age 17 in Toronto in April 2024.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_6", 2, 5, baseQuestions)
    }
}
