package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic5Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeArtCultureQ(
            "art_5_m1_q1", "art_5",
            "प्राचीन भारतीय हिंदू मंदिर स्थापत्य कला (Temple Architecture) की तीन प्रमुख मुख्य शैलियां कौन-सी हैं जो भौगोलिक आधार पर विकसित हुईं?",
            "What are the three principal canonical architectural styles of ancient Indian Hindu temple architecture categorized by geographical evolution?",
            listOf("गांधार, मथुरा और अमरावती", "नागर शैली (उत्तर भारत), द्रविड़ शैली (दक्षिण भारत) और वेसर शैली (दक्कन/मध्य भारत) / Nagara, Dravida & Vesara Styles", "मुगल, राजपूत और दक्कनी", "स्तूप, चैत्य और विहार"),
            listOf("Gandhara, Mathura & Amaravati", "Nagara Style (North India - curvilinear Shikhara), Dravida Style (South India - pyramidal Vimana & monumental Gopuram), and Vesara/Hybrid Style (Deccan - Chalukya/Hoysala)", "Mughal, Rajput & Deccani", "Stupa, Chaitya & Vihara"),
            1,
            "भारतीय मंदिर वास्तुकला की 3 मुख्य शैलियां: 1. नागर शैली (हिमालय से विंध्य तक - शिखर, आम्लक व कलश), 2. द्रविड़ शैली (कृष्णा से कन्याकुमारी तक - विमान, मंडप, गोपुरम व विशाल प्राकार), 3. वेसर शैली (विंध्य और कृष्णा के बीच - नागर व द्रविड़ का संकर रूप, जैसे चालुक्य व होयसल मंदिर)।",
            "Nagara, Dravida, and Vesara styles represent the structural codification of temple vastu shastra across distinct regional topographies of India.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q2", "art_5",
            "द्रविड़ शैली के मंदिरों में मुख्य प्रवेश द्वार पर बने विशाल, बहुमंजिला और अलंकृत स्मारकीय द्वारों को क्या कहा जाता है?",
            "In South Indian Dravidian temple architecture, what are the towering, richly sculpted ornamental entrance gateways called?",
            listOf("विमान", "गोपुरम (Gopuram - Monumental monumental entrance gateway adorned with stucco sculptures of gods and celestial beings)", "गर्भगृह", "मंडप"),
            listOf("Vimana (Pyramidal tower directly above the Garbhagriha)", "Gopuram (Massive gateway towers; e.g., Rajagopuram of Madurai Meenakshi Temple and Srirangam Ranganathaswamy Temple)", "Garbhagriha (Sanctum sanctorum)", "Mandapa (Pillared hall)"),
            1,
            "द्रविड़ मंदिरों में चारदीवारी के मुख्य प्रवेश द्वारों को 'गोपुरम' (Gopuram) कहा जाता है। चोल, पांड्य और विजयनगर काल में गोपुरम को मंदिर के मुख्य शिखर (विमान) से भी अधिक ऊंचा और भव्य बनाया जाने लगा (जैसे श्रीरंगम का 239 फीट ऊंचा राजगोपुरम)।",
            "Gopurams are the monumental gateway landmarks that dominate the skyline of ancient South Indian temple cities.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q3", "art_5",
            "ओडिशा के पुरी जिले में 13वीं शताब्दी में पूर्वी गंग वंश के राजा 'नरसिंहदेव प्रथम' द्वारा निर्मित 'कोणार्क का सूर्य मंदिर' (Black Pagoda) किस आकार में बनाया गया है (UNESCO 1984)?",
            "In which monumental sculptural form is the 13th-century Konark Sun Temple (UNESCO World Heritage Site 1984) built by King Narasimhadeva I of the Eastern Ganga Dynasty?",
            listOf("विशाल शिवलिंग के आकार में", "24 विशाल नक्काशीदार पहियों और 7 घोड़ों द्वारा खींचे जाने वाले सूर्य देव के महाकाय रथ के रूप में (Colossal Chariot of the Sun God with 24 carved stone wheels & 7 horses)", "कमल के फूल के आकार में", "विशाल नौका के रूप में"),
            listOf("Colossal Shivlinga shape", "A colossal architectural Chariot of Surya (Sun God) with 24 elaborately carved stone wheels (functioning as sundials) pulled by 7 galloping horses", "Lotus shape", "Gigantic boat shape"),
            1,
            "कोणार्क सूर्य मंदिर (1250 ईस्वी) कलिंग वास्तुकला का सर्वोच्च शिखर है। इसमें 24 पहिए वर्ष के 12 महीनों के दो पक्षों (शुक्ल व कृष्ण) और 7 घोड़े सप्ताह के 7 दिनों/सूर्य के 7 रंगों का प्रतीक हैं। यूरोपीय नाविक इसे 'ब्लैक पगोडा' कहते थे।",
            "Konark Sun Temple is an engineering and artistic wonder of medieval India, designed as the grand celestial chariot of the solar deity.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q4", "art_5",
            "मध्य प्रदेश के छतरपुर जिले में चंदेल राजाओं (950 से 1050 ईस्वी) द्वारा निर्मित नागर शैली के विश्वप्रसिद्ध 'खजुराहो के मंदिर' (UNESCO 1986) में सबसे विशाल और भव्य मंदिर कौन-सा है?",
            "Which is the largest, most magnificent and architecturally grandest temple among the UNESCO World Heritage Khajuraho Group of Monuments, dedicated to Lord Shiva?",
            listOf("लक्ष्मण मंदिर", "कंदरिया महादेव मंदिर (Kandariya Mahadeva Temple - Built by King Vidyadhara c. 1030 AD / Soaring 31m Shikhara with 84 sub-spires/Urushringas)", "चौसठ योगिनी मंदिर", "पार्श्वनाथ मंदिर"),
            listOf("Lakshmana Temple", "Kandariya Mahadeva Temple (Magnificent sanctum with 870+ sculpted figures depicting celestial nymphs, deities, and Kama scenes)", "Chausath Yogini Temple", "Parshvanatha Temple"),
            1,
            "कंदरिया महादेव मंदिर खजुराहो का सबसे बड़ा मंदिर है, जिसे चंदेल राजा विद्याधर ने महमूद गजनवी पर विजय के उपलक्ष्य में बनवाया था। इसका शिखर कैलाश पर्वत की चोटियों जैसा प्रतीत होता है। खजुराहो में हिंदू और जैन धर्म दोनों के मंदिर हैं।",
            "Kandariya Mahadeva Temple is the crowning architectural jewel of Khajuraho's Nagara style, celebrated for its intricate sculptural harmony.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q5", "art_5",
            "तंजावुर (तमिलनाडु) का प्रसिद्ध 'बृहदेश्वर मंदिर' (राजराजेश्वर मंदिर - UNESCO 1987) किस महान चोल सम्राट द्वारा 1010 ईस्वी में विशुद्ध ग्रेनाइट पत्थरों से बनवाया गया था?",
            "Which great Chola emperor commissioned the monumental Brihadisvara Temple (Rajarajeswaram) at Thanjavur in 1010 AD, built entirely of interlocking granite blocks without mortar?",
            listOf("राजेंद्र चोल प्रथम", "राजराजा चोल प्रथम (Rajaraja Chola I - Brihadisvara Temple, Thanjavur / 66m high Vimana / 80-tonne monolithic Kumbam capstone)", "कुलोत्तुंग चोल", "करिकाल चोल"),
            listOf("Rajendra Chola I", "Rajaraja Chola I (The Great Chola monarch; completed the monumental temple in 1010 AD with the world's tallest stone Vimana of its time)", "Kulottunga Chola", "Karikala Chola"),
            1,
            "बृहदेश्वर मंदिर (तंजावुर) चोल वास्तुकला का अनुपम उदाहरण है। इसका 66 मीटर ऊंचा 'विमान' (शिखर) 13 मंजिलों का है और इसके शीर्ष पर 80 टन का एक ही ग्रेनाइट पत्थर का कलश (कुंभम) रखा गया है। इसे 'दक्षिण मेरु' भी कहा जाता है।",
            "Brihadisvara Temple at Thanjavur is one of the 'Great Living Chola Temples' recognized by UNESCO for its sublime structural scale.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q6", "art_5",
            "महाराष्ट्र के छत्रपति संभाजीनगर (औरंगाबाद) के एलोरा की गुफा संख्या 16 में स्थित 'कैलाश मंदिर' (Kailash Temple) किस राष्ट्रकूट राजा द्वारा एक ही विशाल ठोस चट्टान को ऊपर से नीचे तराशकर (Monolithic Rock-cut) बनवाया गया था?",
            "The monumental rock-cut Kailash Temple (Cave 16) at Ellora, carved top-to-bottom from a single colossal basalt cliff, was commissioned in the 8th century by which Rashtrakuta king?",
            listOf("दंतिदुर्ग", "कृष्ण प्रथम (Krishna I - Rashtrakuta Dynasty / Cave 16 Ellora / Single monolithic mountain carved into full temple complex)", "अमोघवर्ष प्रथम", "ध्रुव प्रथम"),
            listOf("Dantidurga", "Krishna I (Rashtrakuta monarch, r. 756–774 AD; oversaw excavation of 200,000 tonnes of volcanic rock without scaffolding)", "Amoghavarsha I", "Dhruva I"),
            1,
            "एलोरा का कैलाश मंदिर (गुफा 16) विश्व का सबसे बड़ा एकाश्म (Monolithic) रॉक-कट स्मारक है। इसे 8वीं सदी में राष्ट्रकूट राजा कृष्ण प्रथम ने बनवाया। कारीगरों ने 2 लाख टन बेसाल्ट चट्टान को ऊपर से नीचे की ओर काटकर दो मंजिला मंदिर, नंदी मंडप और हाथी तराशे।",
            "Kailash Temple at Ellora is a miraculous feat of ancient Indian stone engineering, carved entirely out of a single monolithic mountainside.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q7", "art_5",
            "महाराष्ट्र की 'अजंता की गुफाएं' (Ajanta Caves - UNESCO 1983) किस नदी की सर्पिलाकार घाटी में स्थित हैं और ये मुख्य रूप से किस धर्म के भित्ति चित्रों (Frescoes) और जातक कथाओं के लिए विख्यात हैं?",
            "Along the horseshoe gorge of which river in Maharashtra are the 30 rock-cut Ajanta Caves located, world-famous for their ancient Buddhist wall murals (Frescoes) and Jataka tales?",
            listOf("गोदावरी नदी", "वाघोरा नदी / बौद्ध धर्म (Waghora River / Buddhism - 2nd Century BCE to 5th Century CE / Hinayana & Mahayana phases)", "कृष्णा नदी", "नर्मदा नदी"),
            listOf("Godavari River", "Waghora River / Buddhism (30 rock-cut Buddhist chaityas and viharas; celebrated for Bodhisattva Padmapani and Vajrapani master frescoes)", "Krishna River", "Narmada River"),
            1,
            "अजंता की 30 गुफाएं वाघोरा नदी की घाटी में स्थित हैं। ये ईसा पूर्व दूसरी सदी से 5वीं सदी ईस्वी (सातवाहन और वाकाटक काल) के दौरान बौद्ध भिक्षुओं द्वारा बनाई गईं। गुफा संख्या 1 में 'बोधिसत्व पद्मपाणि' और 'वज्रपाणि' के विश्वप्रसिद्ध चित्र हैं।",
            "Ajanta Caves represent the highest watermark of ancient Indian painting and Buddhist monastic architecture, discovered by John Smith in 1819.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q8", "art_5",
            "मध्य प्रदेश के रायसेन जिले में स्थित 'सांची का महान स्तूप' (Great Stupa at Sanchi - UNESCO 1989) मूल रूप से तीसरी शताब्दी ईसा पूर्व में किस मौर्य सम्राट द्वारा बनवाया गया था?",
            "The Great Stupa at Sanchi (Stupa No. 1), India's oldest stone structure enshrining relics of Lord Buddha, was originally commissioned in the 3rd century BCE by which Mauryan Emperor?",
            listOf("चंद्रगुप्त मौर्य", "सम्राट अशोक (Emperor Ashoka the Great - Mauryan Dynasty / 3rd Century BCE / Stone Toranas added during Shunga & Satavahana era)", "बिंदुसार", "दशरथ मौर्य"),
            listOf("Chandragupta Maurya", "Emperor Ashoka the Great (Built the brick core hemispherical dome/Anda; embellished later with four intricately carved stone Torana gateways depicting Jataka tales)", "Bindusara", "Dasharatha"),
            1,
            "सांची के स्तूप का निर्माण मौर्य सम्राट अशोक ने भगवान बुद्ध के पवित्र धातु अवशेषों पर कराया था। शुंग और सातवाहन काल में इसके चारों ओर पत्थर की वेदिका और 4 अलंकृत तोरण द्वार (पूर्व, पश्चिम, उत्तर, दक्षिण) जोड़े गए।",
            "Sanchi Stupa is the grandest surviving architectural symbol of early Buddhist monastic art and Mauryan patronage.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q9", "art_5",
            "कर्नाटक के बेल्लारी (विजयनगर) जिले में तुंगभद्रा नदी के तट पर स्थित 14वीं-16वीं सदी के किस महान साम्राज्य की राजधानी के स्मारकों को यूनेस्को विश्व धरोहर स्थल (1986) घोषित किया गया है?",
            "The magnificent ruins of which 14th-16th century medieval empire on the banks of the Tungabhadra River in Karnataka form the UNESCO World Heritage Group of Monuments at Hampi?",
            listOf("बहमनी साम्राज्य", "विजयनगर साम्राज्य (Vijayanagara Empire - Capital Hampi / Virupaksha Temple, Stone Chariot, Vittala Temple Musical Pillars / UNESCO 1986)", "चालुक्य साम्राज्य", "होयसल साम्राज्य"),
            listOf("Bahmani Sultanate", "Vijayanagara Empire (Founded in 1336 by Harihara and Bukka; flourishing capital visited by foreign travelers Domingo Paes, Nicolo Conti, and Abdur Razzaq)", "Chalukya Empire", "Hoysala Empire"),
            1,
            "हम्पी (विजयनगर साम्राज्य की राजधानी) तुंगभद्रा नदी किनारे स्थित है। यहाँ का विट्ठल मंदिर, पत्थर का रथ (Stone Chariot - जो भारतीय ₹50 के नए नोट पर छपा है), 56 संगीतमय स्तंभ (SaReGaMa Pillars), लोटस महल और विरुपाक्ष मंदिर विश्वप्रसिद्ध हैं।",
            "Hampi is an open-air museum of grand imperial Dravidian architecture and urban planning, destroyed after the Battle of Talikota in 1565.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q10", "art_5",
            "सितंबर 2023 में यूनेस्को की विश्व धरोहर सूची में भारत के 42वें स्थल के रूप में शामिल 'होयसल के पवित्र मंदिर समूह' (Sacred Ensembles of the Hoysalas) कर्नाटक के किन तीन स्थानों पर स्थित हैं?",
            "Inscribed as India's 42nd UNESCO World Heritage Site in September 2023, the 'Sacred Ensembles of the Hoysalas' comprise magnificent 12th-13th century star-shaped temples across which three Karnataka locations?",
            listOf("हम्पी, बादामी और पट्टडकल", "बेलूर (चेन्नाकेशव मंदिर), हलेबिदु (होयसलेश्वर मंदिर) और सोमनाथपुरा (केशव मंदिर) / Belur, Halebidu & Somanathapura", "श्रवणबेलगोला, मैसूर और उडुपी", "ऐहोल, बीदर और गुलबर्गा"),
            listOf("Hampi, Badami & Pattadakal", "Belur (Chennakeshava Temple), Halebidu (Hoysaleswara Temple), and Somanathapura (Keshava Temple) / Stellated star plans & soapstone chloritic schist carvings", "Shravanabelagola, Mysore & Udupi", "Aihole, Bidar & Gulbarga"),
            1,
            "होयसल मंदिर (12वीं-13वीं सदी) अपनी ताराकार (Star-shaped) योजना, सॉपस्टोन (Chloritic Schist) पर बेहद महीन नक्काशी और आधार पर हाथियों व शेरों की पट्टियों के लिए जाने जाते हैं। सितंबर 2023 में बेलूर, हलेबिदु और सोमनाथपुरा को यूनेस्को सूची में शामिल किया गया।",
            "The Sacred Ensembles of the Hoysalas represent the pinnacle of Deccan soapstone sculpture and intricate star-plan architecture.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q11", "art_5",
            "पश्चिम बंगाल के बीरभूम जिले में स्थित 'शांतिनिकेतन' (Santiniketan), जिसे सितंबर 2023 में भारत का 41वां यूनेस्को विश्व धरोहर स्थल घोषित किया गया, की स्थापना किसने की थी?",
            "Which world-renowned residential school and university town in West Bengal was established by Nobel laureate Rabindranath Tagore and inscribed as India's 41st UNESCO World Heritage Site in September 2023?",
            listOf("देवेंद्रनाथ टैगोर", "शांतिनिकेतन - रवींद्रनाथ टैगोर (Santiniketan - Founded by Rabindranath Tagore / Visva-Bharati University 1921 / UNESCO Sept 2023)", "ईश्वरचंद्र विद्यासागर", "स्वामी विवेकानंद"),
            listOf("Debendranath Tagore (Founded the original ashram in 1863)", "Santiniketan - Rabindranath Tagore (Pioneered open-air education amidst nature; transformed into Visva-Bharati University in 1921)", "Ishwar Chandra Vidyasagar", "Swami Vivekananda"),
            1,
            "शांतिनिकेतन (बीरभूम, पं. बंगाल) की नींव महर्षि देवेंद्रनाथ टैगोर ने 1863 में आश्रम के रूप में रखी थी, जिसे 1901 में गुरुदेव रवींद्रनाथ टैगोर ने 'ब्रह्मचर्य आश्रम' और 1921 में 'विश्व भारती विश्वविद्यालय' का रूप दिया। सितंबर 2023 में इसे यूनेस्को धरोहर घोषित किया गया।",
            "Santiniketan is an architectural and educational embodiment of internationalist humanism and environmental aesthetics.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q12", "art_5",
            "कर्नाटक के बागलकोट जिले में स्थित 'पट्टडकल के स्मारक समूह' (Pattadakal - UNESCO 1987) को किस राजवंश के राजाओं द्वारा नागर और द्रविड़ वास्तुकला के सामंजस्यपूर्ण संगम के रूप में विकसित किया गया था?",
            "The UNESCO World Heritage Group of Monuments at Pattadakal (Karnataka), representing a harmonious fusion of Nagara and Dravida temple forms, was patronized by which dynasty?",
            listOf("पल्लव राजवंश", "बादामी के चालुक्य राजवंश (Badami Chalukya Dynasty - 7th-8th Century CE / Virupaksha Temple built by Queen Lokamahadevi)", "राष्ट्रकूट राजवंश", "काकतीय राजवंश"),
            listOf("Pallava Dynasty", "Badami Chalukyas (Used Pattadakal as their ceremonial coronation capital; Virupaksha Temple inspired the Kailash Temple of Ellora)", "Rashtrakuta Dynasty", "Kakatiya Dynasty"),
            1,
            "पट्टडकल (कर्नाटक) चालुक्य राजाओं का 'पट्टाभिषेक' स्थल था। यहाँ 10 प्रमुख मंदिर हैं जिनमें 4 नागर शैली (पापनाथ, काशी विश्वनाथ) और 6 द्रविड़ शैली (विरुपाक्ष, मल्लिकार्जुन) में बने हैं। रानी लोकमहादेवी ने विक्रमादित्य द्वितीय की कांची विजय पर विरुपाक्ष मंदिर बनवाया था।",
            "Pattadakal is the crucible where northern and southern Indian temple designs coalesced under the visionary Badami Chalukyas.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q13", "art_5",
            "तमिलनाडु के कांचीपुरम जिले में बंगाल की खाड़ी के तट पर स्थित 7वीं-8वीं सदी के 'महाबलीपुरम के स्मारक समूह' (Mamallapuram - UNESCO 1984) किस पल्लव शासक के समय तराशे गए थे?",
            "The UNESCO World Heritage rock-cut monuments at Mamallapuram (Shore Temple, Pancha Rathas, Arjuna's Penance) were commissioned primarily by which Pallava king?",
            listOf("महेंद्रवर्मन प्रथम", "नरसिंहवर्मन प्रथम 'मामल्ल' और नरसिंहवर्मन द्वितीय 'राजसिंह' (Narasimhavarman I 'Mamalla' & Rajasimha - Pallava Dynasty)", "दंतिवर्मन", "अपराजितवर्मन"),
            listOf("Mahendravarman I", "Narasimhavarman I 'Mamalla' (Named Mamallapuram after his title; monolithic Five Rathas / Pancha Pandava Rathas) & Rajasimha (Shore Temple)", "Dantivarman", "Aparajitavarman"),
            1,
            "महाबलीपुरम (मामल्लपुरम) पल्लव राजा नरसिंहवर्मन प्रथम 'मामल्ल' के नाम पर बसाया गया। यहाँ 'अर्जुन की तपस्या' (भागीरथ की गंगावतरण की दुनिया की सबसे बड़ी रॉक रिलीफ), 5 रथ (एकाश्म मंदिर) और समुद्र तट पर स्थित 'तट मंदिर' (Shore Temple) स्थित हैं।",
            "Mamallapuram is the cradle of South Indian granite rock-cut architecture overlooking the Bay of Bengal.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q14", "art_5",
            "राजस्थान के छह ऐतिहासिक पहाड़ी किलों (Hill Forts of Rajasthan - UNESCO 2013) में कौन-से छह किले शामिल हैं?",
            "Which six majestic Rajput forts were inscribed collectively as the 'Hill Forts of Rajasthan' UNESCO World Heritage Site in 2013?",
            listOf("मेहरानगढ़, जूनागढ़, तारागढ़, नाहरगढ़, जयगढ़, मांडलगढ़", "चित्तौड़गढ़, कुंभलगढ़, रणथंभौर, आमेर (जयपुर), जैसलमेर और गागरोन (झालावाड़) / Chittorgarh, Kumbhalgarh, Ranthambore, Amer, Jaisalmer & Gagron", "आगरा किला, ग्वालियर किला, झांसी किला, कालिंजर, रोहतासगढ़, चुनार", "दौलताबाद, गोलकोंडा, रायगढ़, शिवनेरी, प्रतापगढ़, जंजीरा"),
            listOf("Mehrangarh, Junagarh, Taragarh, Nahargarh, Jaigarh, Mandalgarh", "Chittorgarh Fort (Largest in India), Kumbhalgarh (36km long wall), Ranthambore, Amber Fort, Jaisalmer (Golden living fort), and Gagron Fort (Water fort / Jhalawar)", "Agra, Gwalior, Jhansi, Kalinjar, Rohtasgarh, Chunar", "Daulatabad, Golconda, Raigad, Shivneri, Pratapgad, Janjira"),
            1,
            "2013 में यूनेस्को ने राजस्थान के 6 पहाड़ी किलों को विश्व धरोहर का दर्जा दिया: 1. चित्तौड़गढ़ (विजय स्तंभ), 2. कुंभलगढ़ (भारत की सबसे लंबी 36 किमी दीवार), 3. रणथंभौर (सवाई माधोपुर), 4. आमेर (जयपुर), 5. जैसलमेर (सोनार किला), 6. गागरोन (जल दुर्ग - झालावाड़)। ट्रिक: 'चीकू गाजर आम'।",
            "The Hill Forts of Rajasthan exemplify Rajput military defense architecture using natural terrain and rainwater harvesting systems.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_5_m1_q15", "art_5",
            "तेलंगाना के मुलुगु जिले में स्थित 13वीं सदी का 'काकतीय रुद्रेश्वर / रामप्पा मंदिर' (Ramappa Temple - UNESCO 2021) किस वैज्ञानिक इंजीनियरिंग विशेषता के लिए विश्वविख्यात है?",
            "Which revolutionary architectural technique makes the 13th-century Kakatiya Rudreshwara (Ramappa) Temple of Telangana (UNESCO World Heritage Site 2021) earthquake-resistant and uniquely buoyant?",
            listOf("केवल लोहे के खंभों पर निर्माण", "सैंडबॉक्स तकनीक (Sandbox Technology) और पानी में तैरने वाली हल्की छिद्रित ईंटें (Floating Bricks made of spongy light clay)", "बिना नींव का निर्माण", "विशाल रबर पैड पर निर्माण"),
            listOf("Iron pillar framework only", "Sandbox Foundation Technology (Absorbs seismic earthquake shocks) and ultra-light porous 'floating bricks' used in the temple Gopuram/Shikhara", "Foundationless construction", "Rubber base isolation"),
            1,
            "रामप्पा मंदिर (1213 ईस्वी - काकतीय सेनापति रेचारला रुद्र द्वारा निर्मित) भारत का एकमात्र मंदिर है जिसका नाम उसके मूर्तिकार 'रामप्पा' के नाम पर रखा गया है। मंदिर की नींव में रेत और चूने का 'सैंडबॉक्स' है और इसके शिखर की ईंटें इतनी हल्की हैं कि पानी में तैरती हैं।",
            "Ramappa Temple stands as a testament to the brilliant structural engineering and earthquake-resistant mastery of Kakatiya artisans.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_5", 2, 5, baseQuestions)
    }
}
