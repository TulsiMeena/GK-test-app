package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic1Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeArtCultureQ(
            "art_1_m1_q1", "art_1",
            "संगीत नाटक अकादमी (Sangeet Natak Akademi) द्वारा भारत में आधिकारिक तौर पर कितने शास्त्रीय नृत्य रूपों (Classical Dance Forms) को मान्यता प्रदान की गई है?",
            "How many classical dance forms are officially recognized by India's National Academy of Music, Dance and Drama (Sangeet Natak Akademi)?",
            listOf("6 शास्त्रीय नृत्य", "8 शास्त्रीय नृत्य (8 Classical Dance Forms: Bharatanatyam, Kathak, Kathakali, Kuchipudi, Odissi, Manipuri, Mohiniyattam, Sattriya)", "10 शास्त्रीय नृत्य", "12 शास्त्रीय नृत्य"),
            listOf("6 Classical Dances", "8 Classical Dances (Ministry of Culture also includes Chhau, making it 9 for some schemes)", "10 Classical Dances", "12 Classical Dances"),
            1,
            "संगीत नाटक अकादमी 8 शास्त्रीय नृत्यों को मान्यता देती है: भरतनाट्यम (तमिलनाडु), कथक (उत्तर प्रदेश), कथकली (केरल), कुचिपुड़ी (आंध्र प्रदेश), ओडिसी (ओडिशा), मणिपुरी (मणिपुर), मोहिनीअट्टम (केरल) और सत्रिया (असम)।",
            "Sangeet Natak Akademi officially recognizes 8 Indian classical dance traditions across different cultural regions of India.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q2", "art_1",
            "भारत का सबसे प्राचीन शास्त्रीय नृत्य कौन-सा है जिसकी उत्पत्ति तमिलनाडु के मंदिरों में देवदासियों द्वारा 'सदिर अट्टम' (Sadir Attam) के रूप में हुई थी?",
            "Which is considered the oldest classical dance tradition in India, originating in Tamil Nadu temples as 'Sadir Attam' performed by Devadasis?",
            listOf("कथकली", "भरतनाट्यम (Bharatanatyam - Oldest Classical Dance / Tamil Nadu / 'Ekaharya' solo style)", "कुचिपुड़ी", "मोहिनीअट्टम"),
            listOf("Kathakali", "Bharatanatyam (Mentioned in Bharata Muni's Natya Shastra and Silappatikaram; revived by Rukmini Devi Arundale & E. Krishna Iyer)", "Kuchipudi", "Mohiniyattam"),
            1,
            "भरतनाट्यम भारत का सबसे प्राचीन शास्त्रीय नृत्य है। इसे पहले 'सदिर', 'दासी अट्टम' या 'तंजावुर नाट्यम' कहा जाता था। 20वीं सदी में रुक्मिणी देवी अरुंडेल (कलाक्षेत्र फाउंडेशन) और ई. कृष्ण अय्यर ने इसका पुनरुद्धार किया।",
            "Bharatanatyam is an ancient classical dance form of Tamil Nadu, known for its sculptured poses, rhythmic footwork (adavus), and expressive hand gestures (mudras).",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q3", "art_1",
            "भारतीय शास्त्रीय नृत्य और नाट्यकला का आधारभूत ग्रंथ 'नाट्यशास्त्र' (Natya Shastra) की रचना किस प्राचीन ऋषि/मुनि द्वारा की गई थी जिसे 'पंचम वेद' भी कहा जाता है?",
            "Which ancient sage composed the foundational Sanskrit treatise on performing arts, 'Natya Shastra', traditionally revered as the 'Fifth Veda'?",
            listOf("अभिनवगुप्त", "भरत मुनि (Sage Bharata Muni - Author of Natya Shastra with 36 chapters & 6000 slokas)", "नंदिकेश्वर (अभिनय दर्पण)", "पतंजलि"),
            listOf("Abhinavagupta", "Bharata Muni (Composed the monumental encyclopedia of theatrical arts, music, rasa theory, and aesthetics)", "Nandikeshvara (Author of Abhinaya Darpana)", "Patanjali"),
            1,
            "भरत मुनि ने ईसा पूर्व दूसरी शताब्दी से दूसरी शताब्दी ईस्वी के मध्य 'नाट्यशास्त्र' की रचना की। इसमें 36 अध्याय और 6000 श्लोक हैं, जो रस, भाव, हस्तमुद्रा, अभिनय और संगीत के मूल सिद्धांत स्थापित करते हैं।",
            "Sage Bharata Muni is venerated as the father of Indian theatrical and dance aesthetics through his foundational text, the Natya Shastra.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q4", "art_1",
            "उत्तर भारत (विशेषकर उत्तर प्रदेश) का एकमात्र प्रमुख शास्त्रीय नृत्य कौन-सा है जिसका नाम संस्कृत शब्द 'कथा' (कहानी कहना) से व्युत्पन्न हुआ है?",
            "Which classical dance form is native to Northern India (Uttar Pradesh), derived from the Sanskrit word 'Katha' meaning storyteller ('Katha kahe so Kathak kahaye')?",
            listOf("सत्रिया", "कथक (Kathak - Uttar Pradesh / Lucknow, Jaipur, Banaras & Raigarh Gharanas)", "ओडिसी", "कुचिपुड़ी"),
            listOf("Sattriya", "Kathak (Distinguished by swift spins/chakkars, intricate tatkar footwork, padhant, and ghungroo resonance)", "Odissi", "Kuchipudi"),
            1,
            "कथक उत्तर भारत का प्रमुख शास्त्रीय नृत्य है। यह मंदिरों के कथाकारों से शुरू होकर मुगल दरबारों में विकसित हुआ। इसके प्रमुख घराने लखनऊ (नवाब वाजिद अली शाह), जयपुर (सुंदर प्रसाद) और बनारस (जानकी प्रसाद) हैं।",
            "Kathak is characterized by rhythmic footwork (tatkar), rapid pirouettes (chakkars), and dramatic facial expressions depicting stories of Radha and Krishna.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q5", "art_1",
            "कथक नृत्य के लखनऊ घराने (Lucknow Gharana of Kathak) के कालका-बिंदादीन परिवार से संबंधित भारत के महान कथक सम्राट कौन थे जिनका जनवरी 2022 में निधन हुआ?",
            "Which legendary Kathak maestro from the Kalka-Bindadin lineage of the Lucknow Gharana was awarded the Padma Vibhushan in 1986 and passed away in January 2022?",
            listOf("शंभू महाराज", "पंडित बिरजू महाराज / बृजमोहन नाथ मिश्र (Pt. Birju Maharaj - Lucknow Kalka-Bindadin Gharana)", "लच्छू महाराज", "सीतारा देवी"),
            listOf("Shambhu Maharaj", "Pandit Birju Maharaj (Brijmohan Nath Mishra - Torchbearer of Lucknow Gharana, choreographer and vocalist)", "Lachhu Maharaj", "Sitara Devi"),
            1,
            "पंडित बिरजू महाराज (4 फरवरी 1938 – 17 जनवरी 2022) कथक के लखनऊ कालका-बिंदादीन घराने के प्रमुख स्तंभ थे। उनके पिता अच्छन महाराज तथा चाचा लच्छू महाराज व शंभू महाराज भी महान कथक गुरु थे।",
            "Pandit Birju Maharaj was a world-renowned maestro of the Lucknow Gharana of Kathak, taking the art form to global stages.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q6", "art_1",
            "केरल का कौन-सा प्रसिद्ध शास्त्रीय नृत्य-नाटक अपने विस्तृत चेहरे के श्रृंगार (Paccha, Kathi, Minukku), विशाल मुकुट और रामायण-महाभारत की बुराई पर अच्छाई की विजय की कथाओं के लिए जाना जाता है?",
            "Which classical dance-drama of Kerala is internationally celebrated for its elaborate face paint make-up (Vesham), towering headgears, and intense eye movements?",
            listOf("मोहिनीअट्टम", "कथकली (Kathakali - Kerala / Story-Play / Paccha = Noble, Kathi = Villainous, Minukku = Female/Sage)", "चाक्यार कूथु", "थैय्यम"),
            listOf("Mohiniyattam", "Kathakali (All-night dance-drama combining natyam, nritta, nritya with Chenda, Maddalam, and Sopana music)", "Chakyar Koothu", "Theyyam"),
            1,
            "कथकली (कथा + कली = कहानी का खेल) केरल का 17वीं सदी का शास्त्रीय नृत्य-नाटक है। इसमें 5 प्रकार के मुख्य वेष (श्रृंगार) होते हैं: पच्चा (हरा - नायक), कत्ती (चाकू - खलनायक), थाडी (दाढ़ी), करी (काला - राक्षसी) और मिनुक्कू (ऋषि/स्त्री)।",
            "Kathakali is a highly stylized classical dance-drama from Kerala known for its grand costumes, vivid facial makeup codes, and mudra-based communication.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q7", "art_1",
            "केरल का 'मोहिनीअट्टम' (Mohiniyattam) नृत्य किस पौराणिक आख्यान से जुड़ा है और यह पारंपरिक रूप से केवल किसके द्वारा किया जाता है?",
            "Mohiniyattam ('Dance of the Enchantress') of Kerala is based on Lord Vishnu's Mohini avatar; how is it traditionally performed?",
            listOf("पुरुषों द्वारा सामूहिक रूप से", "महिलाओं द्वारा एकल रूप से सफेद-सुनहरी (Kasavu) साड़ी में (Solo by Women in white & gold Kasavu saree / Lasya-dominant)", "केवल बच्चों द्वारा", "युगलों द्वारा"),
            listOf("Male group dance", "Solo dance by women wearing ivory-gold Kasavu saree, characterized by graceful swaying movements (Lasya)", "Children only", "Couples only"),
            1,
            "मोहिनीअट्टम (मोहिनी का नृत्य) भगवान विष्णु के मोहिनी अवतार (समुद्र मंथन और भस्मासुर वध) से प्रेरित है। यह महिलाओं द्वारा सफेद-सुनहरी किनारी वाली कसावु साड़ी पहनकर लास्य (सौम्य) शैली में किया जाता है। प्रसिद्ध नृत्यांगना: कल्याणीकुट्टी अम्मा।",
            "Mohiniyattam is an elegant solo dance form performed exclusively by women, symbolizing the enchantress avatar of Vishnu with fluid, lyrical movements.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q8", "art_1",
            "आंध्र प्रदेश के कृष्णा जिले के कुचिपुड़ी गांव से विकसित किस शास्त्रीय नृत्य में नर्तक पीतल की थाली के किनारों पर पैर रखकर और सिर पर जल का कलश रखकर 'तरंगम' (Tarangam) नृत्य करता है?",
            "In which Andhra Pradesh classical dance form does the performer balance on the rim of a brass plate while carrying a water pot on the head during the 'Tarangam' sequence?",
            listOf("भरतनाट्यम", "कुचिपुड़ी (Kuchipudi - Andhra Pradesh / Siddhendra Yogi / Tarangam on Brass Plate)", "मोहिनीअट्टम", "ओडिसी"),
            listOf("Bharatanatyam", "Kuchipudi (Originated in Kuchelapuram village; created as a devotional dance-drama by Siddhendra Yogi in 14th century)", "Mohiniyattam", "Odissi"),
            1,
            "कुचिपुड़ी (आंध्र प्रदेश) के जनक 14वीं शताब्दी के वैष्णव संत सिद्धेंद्र योगी माने जाते हैं। इसमें 'तरंगम' (पीतल की थाली की धार पर नाचना), 'मंडूक शब्दम' और 'भामा कलापम' प्रमुख तत्व हैं। प्रसिद्ध कलाकार: यामिनी कृष्णमूर्ति, राजा-राधा रेड्डी, स्वप्नसुंदरी।",
            "Kuchipudi is a classical dance from Andhra Pradesh famous for dramatic storytelling, quick footwork, and the iconic Tarangam brass plate dance.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q9", "art_1",
            "ओडिशा के प्राचीन मंदिरों (कोणार्क सूर्य मंदिर, जगन्नाथ मंदिर) की मूर्तियों और 'त्रिभंग' (Tribhanga - शरीर के तीन मोड़ों) मुद्रा के लिए प्रसिद्ध शास्त्रीय नृत्य कौन-सा है?",
            "Which classical dance form from Odisha is renowned for its sculptural poses, the signature 'Tribhanga' (three-bend) body posture, and Mahari/Gotipua traditions?",
            listOf("सत्रिया", "ओडिसी (Odissi - Odisha / Tribhanga & Chowk postures / Mangalacharan, Batu, Pallavi, Moksha)", "भरतनाट्यम", "मणिपुरी"),
            listOf("Sattriya", "Odissi (Mentioned in Udayagiri caves inscriptions; revived by Guru Kelucharan Mohapatra, Pankaj Charan Das)", "Bharatanatyam", "Manipuri"),
            1,
            "ओडिसी नृत्य में दो मुख्य मुद्राएं होती हैं: 'चौक' (चौकोर मुद्रा) और 'त्रिभंग' (सिर, धड़ और घुटनों पर 3 मोड़)। गुरु केलुचरण महापात्र, पंकज चरण दास और संजुक्ता पाणिग्रही ने ओडिसी को वैश्विक पहचान दिलाई।",
            "Odissi is one of the most lyrical classical dances of India, originating in temple sculptures and guided by the Tribhanga posture.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q10", "art_1",
            "15वीं शताब्दी में असम के महान वैष्णव संत और समाज सुधारक 'श्रीमंत शंकरदेव' (Srimanta Sankardev) द्वारा सत्रों (मठों) में भक्ति आंदोलन के अंग के रूप में शुरू किए गए शास्त्रीय नृत्य का क्या नाम है?",
            "Which classical dance form was introduced in the 15th century AD by the Vaishnavite saint-reformer Srimanta Sankardev in Assam's monastic institutions (Satras)?",
            listOf("बिहू (लोक नृत्य)", "सत्रिया (Sattriya - Assam / Recognized as Classical Dance by Sangeet Natak Akademi on 15 Nov 2000)", "ओडिसी", "मणिपुरी"),
            listOf("Bihu (Folk dance)", "Sattriya (Monastic dance tradition of Assam, performed with Khol drum, Borgeet songs, and Cymbals)", "Odissi", "Manipuri"),
            1,
            "सत्रिया नृत्य की शुरुआत 15वीं सदी में श्रीमंत शंकरदेव और उनके शिष्य माधवदेव ने असम के वैष्णव सत्रों में 'अंकिया नाट' के मंचन के साथ की। संगीत नाटक अकादमी ने 15 नवंबर 2000 को इसे भारत का 8वां शास्त्रीय नृत्य घोषित किया।",
            "Sattriya is an ancient devotional dance form nurtured in the Vaishnava monasteries of Assam, officially recognized as a classical dance in 2000.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q11", "art_1",
            "मणिपुर के किस शास्त्रीय नृत्य में राधा-कृष्ण की रासलीला मुख्य विषय है और इसमें नर्तकियां बेलनाकार कठोर घाघरा जिसे 'कुमिन' (Kumin / Potloi) कहते हैं, पहनती हैं?",
            "In which classical dance form from Northeast India do female dancers wear the cylindrical stiff skirt called 'Potloi / Kumin' during Radha-Krishna Raas Leela performances?",
            listOf("सत्रिया", "मणिपुरी / जागोई (Manipuri Dance / Jagoi - Manipur / Pung Cholom, Kartal Cholom, Raas Leela)", "ओडिसी", "कुचिपुड़ी"),
            listOf("Sattriya", "Manipuri / Jagoi (Includes Pung Cholom drum dance, Lai Haraoba, and graceful non-sensual footwork)", "Odissi", "Kuchipudi"),
            1,
            "मणिपुरी नृत्य (जागोई) में चेहरे के भावों की जगह शरीर के लयबद्ध, सौम्य और वृत्ताकार आंदोलनों पर बल दिया जाता है। इसमें घुंघरू नहीं पहने जाते। झावेरी बहनें (दर्शना, नयना, सुवर्णा, रंजना) मणिपुरी की शीर्ष प्रतिपादक हैं।",
            "Manipuri classical dance is deeply devotional, centered around the ethereal Raas Leela of Radha and Krishna with distinctive Potloi costumes.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q12", "art_1",
            "प्रसिद्ध 'झावेरी बहनें' (Jhaveri Sisters - नयना, सुवर्णा, रंजना और दर्शना झावेरी) किस भारतीय शास्त्रीय नृत्य की महान गुरु और नर्तकियां हैं?",
            "The famous 'Jhaveri Sisters' (Nayana, Suverna, Ranjana, and Darshana Jhaveri) are globally acclaimed exponents of which Indian classical dance form?",
            listOf("भरतनाट्यम", "मणिपुरी नृत्य (Manipuri Dance - Guru Bipin Singh's disciples / Dedicated to Manipuri dance preservation)", "कथक", "ओडिसी"),
            listOf("Bharatanatyam", "Manipuri Dance (Trained under Guru Bipin Singh; Darshana Jhaveri was awarded the Sangeet Natak Akademi Award & Padma Shri)", "Kathak", "Odissi"),
            1,
            "झावेरी बहनें (मुंबई) गुरु बिपिन सिंह की शिष्याएं थीं। उन्होंने 1950 के दशक से मणिपुरी नृत्य को भारत और दुनिया भर में लोकप्रिय बनाने में अपना संपूर्ण जीवन समर्पित किया। दर्शना झावेरी को 2002 में पद्म श्री मिला।",
            "The Jhaveri Sisters are celebrated worldwide for popularizing the Manipuri classical dance style across major national and international venues.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q13", "art_1",
            "महान ओडिसी नृत्यांगना और गुरु 'केलुचरण महापात्र' (Guru Kelucharan Mohapatra) वर्ष 2000 में किस सर्वोच्च नागरिक सम्मान से अलंकृत होने वाले ओडिशा के पहले व्यक्ति बने थे?",
            "Guru Kelucharan Mohapatra, the legendary architect of the modern revival of Odissi dance, was awarded which prestigious Padma award in the year 2000?",
            listOf("पद्म श्री", "पद्म विभूषण (Padma Vibhushan - First person from Odisha to receive India's 2nd highest civilian honor in 2000)", "पद्म भूषण", "भारत रत्न"),
            listOf("Padma Shri", "Padma Vibhushan (Awarded Padma Shri in 1974, Padma Bhushan in 1988, and Padma Vibhushan in 2000)", "Padma Bhushan", "Bharat Ratna"),
            1,
            "गुरु केलुचरण महापात्र (1926-2004) ने ओडिसी नृत्य का व्यवस्थित पाठ्यक्रम तैयार किया और 'सृजन' (Srjan) संस्था की स्थापना की। वे 2000 में पद्म विभूषण पाने वाले ओडिशा के पहले व्यक्ति बने।",
            "Guru Kelucharan Mohapatra was a master dancer and guru who codified and elevated Odissi to classical international acclaim.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q14", "art_1",
            "शास्त्रीय नृत्य में 'रस सिद्धांत' (Theory of Rasa) के अनुसार कुल कितने मूल 'स्थायी भाव' और 'रस' (Navarasa) माने गए हैं?",
            "According to the classical Indian aesthetic theory propounded in Natya Shastra, how many fundamental Rasas (emotional essences) constitute the 'Navarasa'?",
            listOf("6 रस", "9 रस / नवरस (9 Rasas: Shringara, Hasya, Karuna, Raudra, Veera, Bhayanaka, Bibhatsa, Adbhuta, Shanta)", "7 रस", "12 रस"),
            listOf("6 Rasas", "9 Rasas (Navarasa - Bharata Muni originally listed 8; Abhinavagupta added Shanta Rasa as the 9th)", "7 Rasas", "12 Rasas"),
            1,
            "नाट्यशास्त्र में मूलतः 8 रस बताए गए थे। बाद में अभिनवगुप्त ने 'शांत रस' को 9वां रस जोड़ा। नवरस: 1. श्रृंगार (प्रेम), 2. हास्य, 3. करुण (शोक), 4. रौद्र (क्रोध), 5. वीर (उत्साह), 6. भयानक (भय), 7. वीभत्स (घृणा), 8. अद्भुत (आश्चर्य), 9. शांत (निर्वेद/शांति)।",
            "The Navarasa represents the nine primary human emotions depicted through facial abhinaya and bodily gestures in Indian classical dances.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m1_q15", "art_1",
            "भरतनाट्यम की प्रसिद्ध नर्तकी 'रुक्मिणी देवी अरुंडेल' (Rukmini Devi Arundale) ने 1936 में चेन्नई (मद्रास) में किस विश्वविख्यात कला संस्थान की स्थापना की थी?",
            "Which iconic institutional center of classical arts and dance was established by Rukmini Devi Arundale in 1936 at Chennai (Adyar)?",
            listOf("संगीत नाटक अकादमी", "कलाक्षेत्र फाउंडेशन (Kalakshetra Foundation, Chennai - Established 1936 by Rukmini Devi Arundale)", "गंधर्व महाविद्यालय", "भारती कला केंद्र"),
            listOf("Sangeet Natak Akademi", "Kalakshetra Foundation (Declared an Institute of National Importance in 1993 by the Parliament of India)", "Gandharva Mahavidyalaya", "Kathak Kendra"),
            1,
            "रुक्मिणी देवी अरुंडेल ने जनवरी 1936 में चेन्नई में 'कलाक्षेत्र' (Kalakshetra) की स्थापना की। वे 1952 में राज्यसभा में मनोनीत होने वाली पहली भारतीय महिला नर्तकी थीं और उन्हें 1956 में पद्म भूषण दिया गया।",
            "Rukmini Devi Arundale founded the Kalakshetra academy, playing a historic role in rescuing Bharatanatyam from societal stigma and standardizing its pedagogy.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_1", 2, 5, baseQuestions)
    }
}
