package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic8Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions) - यूनेस्को विश्व धरोहर स्थल, प्राचीन शैलकृत गुफाएं एवं स्मारक
        // ==========================================
        makeArtCultureQ(
            "art_8_m1_q1", "art_8",
            "महाराष्ट्र के छत्रपति संभाजीनगर (औरंगाबाद) जिले में वाघोरा नदी के किनारे स्थित 'अजंता की गुफाओं' (Ajanta Caves) में कुल कितनी शैलकृत बौद्ध गुफाएं हैं?",
            "How many rock-cut Buddhist caves are situated in a horseshoe-shaped gorge along the Waghora River in the Ajanta complex near Chhatrapati Sambhajinagar, Maharashtra?",
            listOf("24 गुफाएं", "30 गुफाएं (30 Caves including unfinished ones / 29 or 30 numbered Buddhist Caves / UNESCO 1983)", "34 गुफाएं", "12 गुफाएं"),
            listOf("24 caves", "30 caves (30 Rock-cut Buddhist caves excavated in two distinct phases: Satavahana and Vakataka periods; UNESCO World Heritage Site 1983)", "34 caves (Ellora)", "12 caves"),
            1,
            "अजंता में कुल 30 बौद्ध गुफाएं (24 विहार और 5-6 चैत्य) हैं, जिन्हें 1983 में भारत के पहले यूनेस्को धरोहर स्थलों में शामिल किया गया था। ये गुफाएं ईसा पूर्व दूसरी सदी से छठी सदी ईस्वी के मध्य वाकाटक और सातवाहन राजाओं के संरक्षण में निर्मित हुईं। यहाँ के भित्ति चित्र (फ्रेस्को/टेम्पेरा) जातक कथाओं और बुद्ध के जीवन को दर्शाते हैं (जैसे 'पद्मपाणि बोधिसत्व')।",
            "Ajanta Caves represent the pinnacle of ancient Indian rock-cut architecture and classical Buddhist mural painting.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q2", "art_8",
            "एलोरा की विश्वविख्यात गुफा संख्या 16 में स्थित 'कैलाश मंदिर' (Kailash Temple) का निर्माण 8वीं शताब्दी में किस राष्ट्रकूट सम्राट द्वारा एकाश्म (Monolithic) चट्टान को ऊपर से नीचे तराशकर करवाया गया था?",
            "Which Rashtrakuta emperor commissioned the magnificent monolithic rock-cut Kailash Temple (Cave 16) at Ellora, carved vertically top-down from a single basalt cliff in the 8th century?",
            listOf("दंतिदुर्ग", "कृष्ण प्रथम (Krishna I - Rashtrakuta Dynasty / Reigned c. 756–774 CE / Dravidian Rock-cut Architecture)", "अमोघवर्ष प्रथम", "गोविंद तृतीय"),
            listOf("Dantidurga (Founder)", "Krishna I (Rashtrakuta monarch who commissioned the colossal rock-hewn Kailash temple complex dedicated to Lord Shiva)", "Amoghavarsha I", "Govinda III"),
            1,
            "एलोरा की गुफा संख्या 16 में स्थित 'कैलाशनाथ मंदिर' वास्तुकला का अद्वितीय चमत्कार है, जिसे राष्ट्रकूट राजा कृष्ण प्रथम (756-774 ईस्वी) ने बनवाया था। इसे ऊपर से नीचे की ओर एक ही बेसाल्ट चट्टान को काटकर द्रविड़ शैली में बनाया गया है। एलोरा में कुल 34 गुफाएं हैं (1-12 बौद्ध, 13-29 हिंदू, 30-34 जैन)।",
            "The Kailash temple at Ellora is celebrated globally as the largest monolithic rock-cut monument ever engineered.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q3", "art_8",
            "मुंबई हार्बर में स्थित 'एलीफेंटा की गुफाओं' (Elephanta Caves) की सबसे प्रसिद्ध मूर्तिकला कृति कौन-सी है, जिसमें भगवान शिव के तीन रूपों (सृष्टिकर्ता, संरक्षक, संहारक) को दर्शाया गया है?",
            "Which iconic colossal rock-cut sculpture inside Cave 1 of Elephanta Island depicts Lord Shiva as the supreme creator, preserver, and destroyer?",
            listOf("नटराज शिव", "त्रिमूर्ति / सदाशिव (Trimurti / Maheshamurti - 20-foot three-headed Shiva sculpture / UNESCO 1987)", "अर्धनारीश्वर", "गंगाधर शिव"),
            listOf("Nataraja", "Trimurti / Sadashiva (The monumental three-headed representation of Shiva embodying Aghora, Tatpurusha, and Vamadeva)", "Ardhanarishvara", "Gangadhara"),
            1,
            "एलीफेंटा गुफाएं (घारापुरी द्वीप, मुंबई) मुख्य रूप से भगवान शिव को समर्पित हैं। यहाँ गुफा-1 में 20 फीट ऊंची 'त्रिमूर्ति' (महेशमूर्ति) स्थित है, जिसमें शिव के तीन मुख—अघोर (संहारक), तत्पुरुष (शांत/संरक्षक) और वामदेव (सृष्टिकर्ता)—अंकित हैं। पुर्तगालियों ने द्वीप पर विशाल पत्थर के हाथी की मूर्ति देखकर इसका नाम 'एलीफेंटा' रखा था।",
            "The monumental Trimurti sculpture at Elephanta Island is considered one of the finest masterpieces of Indian sculpture.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q4", "art_8",
            "मध्य प्रदेश के रायसेन जिले में स्थित 'भीमबेटका के शैल शैलाश्रय' (Rock Shelters of Bhimbetka) की खोज 1957 में किस प्रसिद्ध पुरातत्वविद् द्वारा की गई थी?",
            "Which distinguished Indian archaeologist discovered the prehistoric rock shelters and cave paintings of Bhimbetka in Madhya Pradesh in 1957?",
            listOf("दयाराम साहनी", "विष्णु श्रीधर वाकणकर (Dr. V. S. Wakankar - Discovered in 1957 / UNESCO World Heritage Site 2003)", "राखालदास बनर्जी", "अलेक्जेंडर कनिंघम"),
            listOf("Daya Ram Sahni", "Dr. Vishnu Shridhar Wakankar (Discovered the Paleolithic and Mesolithic cave art sites during a train survey in 1957)", "R. D. Banerji", "Sir Alexander Cunningham"),
            1,
            "भीमबेटका शैलाश्रय (रायसेन, मध्य प्रदेश) की खोज 1957-58 में विक्रम विश्वविद्यालय के पुरातत्वविद् डॉ. विष्णु श्रीधर वाकणकर ने की थी। यहाँ 750 से अधिक शैलाश्रय हैं जिनमें 500 से अधिक में पुरापाषाण, मध्यपाषाण और ताम्रपाषाण कालीन शैलचित्र (शिकार, नृत्य, जानवर) प्राकृतिक गेरू व सफेद रंगों में संरक्षित हैं। इसे 2003 में यूनेस्को धरोहर घोषित किया गया।",
            "Bhimbetka showcases some of the oldest continuous prehistoric rock art traces of human creativity spanning over 10,000 years.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q5", "art_8",
            "गुजरात के पाटन में सरस्वती नदी के तट पर स्थित 11वीं सदी की किस सीढ़ीदार बावड़ी (Stepwell) को यूनेस्को ने 2014 में विश्व धरोहर स्थल का दर्जा दिया, जो ₹100 के नए नोट पर भी चित्रित है?",
            "Which 11th-century underground multi-storey stepwell in Patan, Gujarat, built by Queen Udayamati of the Chaulukya/Solanki dynasty, is featured on India's ₹100 currency note?",
            listOf("चांद बावड़ी (आभानेरी)", "रानी की वाव (Rani ki Vav - The Queen's Stepwell / Maru-Gurjara style / UNESCO 2014 / ₹100 Currency Note)", "अडालज की बावड़ी", "अग्रसेन की बावड़ी"),
            listOf("Chand Baori (Abhaneri)", "Rani ki Vav (The Queen's Stepwell built in memory of King Bhima I by Queen Udayamati; UNESCO World Heritage Site 2014)", "Adalaj Stepwell", "Agrasen ki Baoli"),
            1,
            "'रानी की वाव' (पाटन, गुजरात) का निर्माण सोलंकी राजवंश के राजा भीमदेव प्रथम की स्मृति में उनकी पत्नी रानी उदयमति ने 1063 ईस्वी में करवाया था। यह मारू-गुर्जर स्थापत्य शैली में निर्मित सात मंजिला उल्टे मंदिर के समान बावड़ी है, जिसमें भगवान विष्णु के दशावतारों सहित 800 से अधिक बारीक नक्काशीदार मूर्तियां हैं।",
            "Rani ki Vav exemplifies the pinnacle of subterranean water management architecture and sculptural iconography in medieval India.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q6", "art_8",
            "सितंबर 2023 में 45वें विश्व धरोहर समिति सत्र (रियाद) में भारत के 41वें और 42वें यूनेस्को विश्व धरोहर स्थल के रूप में क्रमशः किन दो ऐतिहासिक धरोहरों को शामिल किया गया?",
            "Which two cultural heritage sites were inscribed as India's 41st and 42nd UNESCO World Heritage Sites respectively at the 45th World Heritage Committee session in September 2023?",
            listOf("धोलावीरा और काकतीय रुद्रेश्वर मंदिर", "शांतिनिकेतन (पश्चिम बंगाल) और होयसल के पवित्र मंदिर समूह (कर्नाटक - बेलूर, हलेबिडु, सोमनाथपुरा)", "जयपुर शहर और नालंदा महाविहार", "कुतुब मीनार और हम्पी स्मारक"),
            listOf("Dholavira & Ramappa Temple", "Santiniketan (West Bengal - 41st) and Sacred Ensembles of the Hoysalas (Karnataka - Belur, Halebidu, Somanathapura - 42nd)", "Jaipur City & Nalanda", "Qutb Minar & Hampi"),
            1,
            "सितंबर 2023 में:\n- **41वां स्थल**: 'शांतिनिकेतन' (बीरभूम, पश्चिम बंगाल) - रवींद्रनाथ टैगोर द्वारा 1901 में स्थापित विश्वभारती का खुला आश्रम-विश्वविद्यालय।\n- **42वां स्थल**: 'होयसल के पवित्र मंदिर समूह' (कर्नाटक) - बेलूर का चेन्नाकेशव मंदिर, हलेबिडु का होयसलेश्वर मंदिर और सोमनाथपुरा का केशव मंदिर (ताराकार आधार व सोपस्टोन नक्काशी)।",
            "Santiniketan and the Sacred Hoysala Ensembles expanded India's world heritage roll, recognizing intellectual and sculptural zeniths.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q7", "art_8",
            "भारत का 43वां यूनेस्को विश्व धरोहर स्थल बनने का गौरव जुलाई 2024 में नई दिल्ली में आयोजित 46वें सत्र में किस पूर्वोत्तर राज्य के अहोम राजवंश के 'मोइदाम' (Moidams) को मिला?",
            "Which North-Eastern historical landmark representing the unique royal burial mounds of the Tai-Ahom dynasty was inscribed as India's 43rd UNESCO World Heritage Site in July 2024?",
            listOf("त्रिपुरा के उनाकोटी शैलचित्र", "असम के चराइदेव के मोइदाम (Moidams - The Mound-Burial System of the Ahom Dynasty, Charaideo, Assam / 43rd UNESCO Site)", "मणिपुर का कांगला किला", "मेघालय के जीवित जड़ पुल"),
            listOf("Unakoti Rock Carvings", "Moidams of Charaideo, Assam (The sacred royal pyramid-like burial mounds of the Ahom Kingdom, inscribed in July 2024 as India's 43rd UNESCO site)", "Kangla Fort, Manipur", "Living Root Bridges"),
            1,
            "जुलाई 2024 में 'चराइदेव के मोइदाम' (असम) को यूनेस्को की विश्व धरोहर सूची में शामिल किया गया। यह पूर्वोत्तर भारत का पहला सांस्कृतिक विश्व धरोहर स्थल बना। मोइदाम अहोम साम्राज्य (1228-1826) के राजाओं व रानियों की पिरामिडनुमा मिट्टी के टीलों वाली समाधियां हैं, जिनकी तुलना अक्सर मिस्र के पिरामिडों से की जाती है।",
            "The Charaideo Moidams represent the centuries-old funeral traditions and royal architecture of Assam's Tai-Ahom civilization.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q8", "art_8",
            "मध्य प्रदेश के छतरपुर जिले में 10वीं-11वीं शताब्दी में चंदेल राजपूत राजाओं द्वारा नागर शैली में निर्मित 'खजुराहो के मंदिर समूह' में सबसे बड़ा और भव्य मंदिर कौन-सा है?",
            "Which is the largest, most majestic Hindu temple in the UNESCO World Heritage Western Group at Khajuraho, built around 1030 CE by Chandela ruler Vidyadhara?",
            listOf("लक्ष्मण मंदिर", "कंदरिया महादेव मंदिर (Kandariya Mahadeva Temple - Dedicated to Lord Shiva / Shikhara replicates Mount Kailash / Chandela Dynasty)", "चौसठ योगिनी मंदिर", "पार्श्वनाथ मंदिर"),
            listOf("Lakshmana Temple", "Kandariya Mahadeva Temple (Magnificent temple with an 84-meter-high spired shikhara adorned with 800+ celestial sculptures)", "Chausath Yogini Temple", "Parshvanatha Temple"),
            1,
            "खजुराहो मंदिर समूह (1986 यूनेस्को धरोहर) का निर्माण चंदेल शासकों ने 950 से 1050 ईस्वी के बीच करवाया था। यहाँ मूल रूप से 85 मंदिर थे, जिनमें से 25 बचे हैं (हिंदू और जैन धर्म के)। इनमें सबसे विशाल 'कंदरिया महादेव मंदिर' है, जिसकी वास्तुकला, कामुक मूर्तियां (मिथुन मुद्राएं) और पर्वत श्रृंखला जैसी शिखर संरचना नागर शैली का सर्वश्रेष्ठ उदाहरण हैं।",
            "The Kandariya Mahadeva temple at Khajuraho epitomizes the zenith of Central Indian Nagara temple architecture.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q9", "art_8",
            "ओडिशा के पुरी जिले में बंगाल की खाड़ी के तट पर 13वीं शताब्दी में पूर्वी गंग वंश के राजा नरसिंहदेव प्रथम द्वारा सूर्य भगवान के 24 पहियों वाले विशाल रथ के रूप में निर्मित 'ब्लैक पैगोडा' मंदिर कौन-सा है?",
            "Which 13th-century monumental Sun Temple on the Odisha coast, built by King Narasimhadeva I as a colossal chariot with 24 carved wheels pulled by 7 horses, is called the 'Black Pagoda'?",
            listOf("जगन्नाथ मंदिर, पुरी", "कोणार्क का सूर्य मंदिर (Sun Temple, Konark - 1984 UNESCO / Kalinga Architecture / ₹10 Currency Note / Black Pagoda)", "लिंगराज मंदिर, भुवनेश्वर", "मुक्तेश्वर मंदिर"),
            listOf("Jagannath Temple, Puri", "Konark Sun Temple (13th-century Kalinga architectural masterpiece conceived as Surya's celestial chariot with sundial wheels; UNESCO 1984)", "Lingaraj Temple", "Mukteshwar Temple"),
            1,
            "कोणार्क सूर्य मंदिर (1984 यूनेस्को) को यूरोपीय नाविकों द्वारा इसके गहरे रंग के पत्थर और चुंबकीय चुंबकीय प्रभाव के कारण 'ब्लैक पैगोडा' कहा जाता था (जबकि पुरी जगन्नाथ मंदिर को 'व्हाइट पैगोडा' कहा जाता है)। इसके पहिए धूपघड़ी की तरह सटीक समय बताते हैं। यह ₹10 के भारतीय नोट पर भी चित्रित है।",
            "The Sun Temple at Konark is a sublime synthesis of astronomy, Kalinga stonemasonry, and monumental chariot conception.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q10", "art_8",
            "तमिलनाडु के तंजावुर में 1010 ईस्वी में महान चोल सम्राट राजराज प्रथम द्वारा निर्मित 'बृहदेश्वर मंदिर' (राजराजेश्वर मंदिर) की किस मुख्य स्थापत्य विशेषता के लिए जाना जाता है?",
            "What unique architectural marvel distinguishes the Brihadisvara Temple at Thanjavur, built by Chola Emperor Rajaraja I in 1010 CE as part of the 'Great Living Chola Temples'?",
            listOf("लकड़ी का शिखर", "विशाल ग्रेनाइट विमान (66 मीटर ऊंचा) एवं शीर्ष पर 80 टन का एकाश्म कलश/कुंभम (80-tonne monolithic granite capstone)", "संगमरमर की नक्काशी", "ईंटों का गोपुरम"),
            listOf("Wooden superstructure", "Massive 66m Granite Vimana topped by an 80-tonne single granite block dome (Kumbam) cast without binding mortar", "Marble inlays", "Brick Gopuram"),
            1,
            "तंजावुर का 'बृहदेश्वर मंदिर' (यूनेस्को 1987) द्रविड़ वास्तुकला का सर्वोच्च शिखर है। यह पूरी तरह कठोर ग्रेनाइट से बना है। इसका 13 मंजिला 66 मीटर ऊंचा 'विमान' और शीर्ष पर स्थित 80 टन का अखंड 'कुंभम' (शिखर गुंबद) बिना चूने-गारे के इंटरलॉकिंग तकनीक से स्थापित किया गया है। इसके परिसर में 20 टन की अखंड नंदी की मूर्ति भी है।",
            "The Brihadisvara Temple at Thanjavur stands as an engineering feat of dynamic granite structural mechanics.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q11", "art_8",
            "कर्नाटक के बेल्लारी/विजयनगर जिले में तुंगभद्रा नदी के तट पर स्थित विजयनगर साम्राज्य की राजधानी 'हम्पी' (Hampi Monuments) में 56 संगीतमय स्तंभों (Musical Pillars) वाला प्रसिद्ध मंदिर कौन-सा है?",
            "Which iconic 16th-century temple complex at the UNESCO World Heritage site of Hampi features 56 musical pillars that produce melodic tones when tapped and the famed Stone Chariot?",
            listOf("विरूपाक्ष मंदिर", "विट्ठल मंदिर (Vijaya Vittala Temple - Stone Chariot / 56 Musical/SaReGaMa Pillars / Featured on ₹50 Note / UNESCO 1986)", "हजारा राम मंदिर", "अच्युतराय मंदिर"),
            listOf("Virupaksha Temple", "Vijaya Vittala Temple (Famous for the monolithic Garuda Stone Chariot depicted on ₹50 note and acoustic musical pillars)", "Hazara Rama Temple", "Achyutaraya Temple"),
            1,
            "हम्पी (1986 यूनेस्को) 14वीं-16वीं शताब्दी में विजयनगर साम्राज्य की वैभवशाली राजधानी थी। यहाँ का 'विट्ठल मंदिर' अपने एकाश्म पत्थर के रथ (गरुड़ रथ - ₹50 के नोट पर अंकित) और 'सारेगामा स्तंभों' (संगीतमय स्तंभ जिन पर थपथपाने से 7 सुरों की ध्वनि निकलती है) के लिए विश्व प्रसिद्ध है।",
            "Hampi represents the monumental urban planning, defensive works, and acoustic stone architecture of the Vijayanagara Empire.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q12", "art_8",
            "भारत का एकमात्र 'मिश्रित' (Mixed Heritage Site - प्राकृतिक एवं सांस्कृतिक दोनों) यूनेस्को विश्व धरोहर स्थल कौन-सा है जिसे 2016 में यह दर्जा प्राप्त हुआ?",
            "Which is India's only 'Mixed World Heritage Site' (recognizing both exceptional natural biodiversity and sacred cultural landscape), inscribed by UNESCO in 2016?",
            listOf("सुंदरबन राष्ट्रीय उद्यान", "कंचनजंगा राष्ट्रीय उद्यान (Khangchendzonga National Park, सिक्किम / Sacred Buddhist Beyul & Eastern Himalayan biodiversity)", "मानस वन्यजीव अभयारण्य", "नंदा देवी राष्ट्रीय उद्यान"),
            listOf("Sundarbans National Park", "Khangchendzonga National Park, Sikkim (India's sole Mixed UNESCO Heritage Site, sacred to Lepcha and Tibetan Buddhist traditions)", "Manas Wildlife Sanctuary", "Nanda Devi National Park"),
            1,
            "सिक्किम का 'कंचनजंगा राष्ट्रीय उद्यान' (KNP) भारत का एकमात्र मिश्रित धरोहर स्थल है। यह दुनिया की तीसरी सबसे ऊंची चोटी (8,586 मीटर) को घेरे हुए है। यह दुर्लभ हिम तेंदुआ, लाल पांडा और हिमालयी कस्तूरी मृग का आवास है तथा लेप्चा व तिब्बती बौद्ध परंपराओं में एक पवित्र आध्यात्मिक 'बेयुल' (गुप्त स्वर्ग) माना जाता है।",
            "Khangchendzonga National Park holds universal value bridging sacred indigenous beliefs and sublime montane ecology.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q13", "art_8",
            "असम में ब्रह्मपुत्र नदी के दक्षिण तट पर स्थित कौन-सा राष्ट्रीय उद्यान एक सींग वाले भारतीय गैंडों (One-Horned Rhinoceros) की दुनिया की दो-तिहाई आबादी का घर है और 1985 में यूनेस्को प्राकृतिक धरोहर बना?",
            "Which national park in Assam holds two-thirds of the world's great one-horned rhinoceros population and was designated a UNESCO Natural World Heritage Site in 1985?",
            listOf("मानस राष्ट्रीय उद्यान", "काजीरंगा राष्ट्रीय उद्यान (Kaziranga National Park - Golaghat/Nagaon, Assam / Big Five animals)", "डिब्रू-सैखोवा राष्ट्रीय उद्यान", "ओरांग राष्ट्रीय उद्यान"),
            listOf("Manas National Park", "Kaziranga National Park (Home to the largest population of Great Indian One-Horned Rhinos, wild water buffaloes, and tigers; UNESCO 1985)", "Dibru-Saikhowa National Park", "Orang National Park"),
            1,
            "काजीरंगा राष्ट्रीय उद्यान (असम) को 1985 में यूनेस्को प्राकृतिक विश्व धरोहर स्थल घोषित किया गया था। यह दुनिया भर में एक सींग वाले गैंडों, एशियाई हाथियों, जंगली जल भैंसों और बाघों के सबसे सफल संरक्षण का प्रतीक है। (असम का मानस राष्ट्रीय उद्यान भी 1985 में यूनेस्को प्राकृतिक धरोहर बना था)।",
            "Kaziranga stands as an internationally celebrated triumph of species recovery and grassland biome conservation.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q14", "art_8",
            "यूनेस्को की विश्व धरोहर सूची में 'हेरिटेज सिटी' (Heritage City) के रूप में शामिल होने वाले भारत के दो ऐतिहासिक शहर कौन-से हैं?",
            "Which are the only two historic cities in India to be inscribed directly as UNESCO World Heritage Cities?",
            listOf("वाराणसी और उज्जैन", "अहमदाबाद (2017 - प्रथम) और जयपुर (2019 - द्वितीय) / Historic City of Ahmedabad & Walled City of Jaipur", "दिल्ली और आगरा", "कोलकाता और मुंबई"),
            listOf("Varanasi and Ujjain", "Historic City of Ahmedabad (2017 - India's 1st) and Jaipur City (2019 - India's 2nd / Pink City grid planning)", "Delhi and Agra", "Kolkata and Mumbai"),
            1,
            "भारत के दो शहर यूनेस्को विश्व धरोहर शहर हैं:\n1. **अहमदाबाद** (2017) - 15वीं सदी में सुल्तान अहमद शाह द्वारा स्थापित, अपने पारंपरिक 'पोल' (आवासीय बस्तियों), लकड़ी के घरों और इंडो-इस्लामिक वास्तुकला हेतु पहला भारतीय हेरिटेज शहर बना।\n2. **जयपुर** (2019) - 1727 में सवाई जयसिंह द्वितीय द्वारा वास्तुशास्त्र और ग्रिड पैटर्न पर नियोजित 'गुलाबी नगर'।",
            "Ahmedabad and Jaipur reflect exceptional vernacular urbanism, historic communal pols, and scientific town planning.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_8_m1_q15", "art_8",
            "बिहार के नालंदा में 5वीं शताब्दी में गुप्त सम्राट कुमारगुप्त प्रथम द्वारा स्थापित किस प्राचीन विश्वविद्यालय के खंडहरों को 2016 में यूनेस्को विश्व धरोहर स्थल घोषित किया गया?",
            "The archaeological ruins of which 5th-century Mahavihara (monastic university), founded by Gupta ruler Kumaragupta I and excavated at Nalanda, Bihar, were declared a UNESCO World Heritage Site in 2016?",
            listOf("विक्रमशिला विश्वविद्यालय", "नालंदा महाविहार (Archaeological Site of Nalanda Mahavihara - Ruled by Guptas, Harsha & Palas / Destroyed in 1193 CE / UNESCO 2016)", "तक्षशिला विश्वविद्यालय", "ओदंतपुरी विश्वविद्यालय"),
            listOf("Vikramashila University", "Nalanda Mahavihara (Ancient residential international seat of Buddhist and Vedic learning that attracted scholars from China, Korea, Tibet, and Central Asia)", "Taxila University", "Odantapuri University"),
            1,
            "नालंदा महाविहार (बिहार) प्राचीन विश्व का पहला आवासीय अंतरराष्ट्रीय विश्वविद्यालय था, जहाँ 10,000 छात्र और 2,000 शिक्षक रहते थे। चीनी यात्री ह्वेनसांग (Xuanzang) और इत्सिंग ने यहाँ कई वर्ष अध्ययन किया। यहाँ का पुस्तकालय 'धर्मगंज' (रत्नसागर, रत्नोदधि, रत्नरंजक) 1193 में बख्तियार खिलजी द्वारा जला दिया गया था।",
            "Nalanda Mahavihara was the beacon of higher Buddhist learning, philosophy, astronomy, and international scholastic exchange.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_8", 2, 5, baseQuestions)
    }
}
