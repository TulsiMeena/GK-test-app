package com.example.ui.data

import com.example.ui.data.RajasthanQuestionHelper.makeRajQ
import com.example.ui.model.GkQuestion

object RajasthanTopic1Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeRajQ(
            "raj_1_m1_q1", "raj_1",
            "कालीबंगा (Kalibangan) सिंधु घाटी सभ्यता स्थल राजस्थान के किस जिले में घग्घर नदी के तट पर स्थित है?",
            "In which district of Rajasthan is the famous Indus Valley Civilization site 'Kalibangan' located along the Ghaggar river?",
            listOf("बीकानेर", "हनुमानगढ़ (Hanumangarh district)", "गंगानगर", "चूरू"),
            listOf("Bikaner", "Hanumangarh (on the banks of ancient Saraswati/Ghaggar river)", "Sri Ganganagar", "Churu"),
            1,
            "कालीबंगा राजस्थान के हनुमानगढ़ जिले में घग्घर (प्राचीन सरस्वती) नदी के बाएं तट पर स्थित है। इसकी खोज 1952 में अमलानंद घोष ने की थी। यहाँ जुते हुए खेत (Ploughed field) और भूकंप के प्राचीनतम साक्ष्य मिले हैं।",
            "Kalibangan is situated in Hanumangarh district, Rajasthan. Discovered by Amlanand Ghosh in 1952, it yielded evidence of pre-Harappan ploughed fields and fire altars.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q2", "raj_1",
            "आहड़ सभ्यता (Ahar Culture) जिसे 'ताम्रवती नगरी' भी कहा जाता है, किस नदी की घाटी में फली-फूली?",
            "Ahar Civilization, also known as 'Tamravati Nagari' (Copper City), flourished in the valley of which river near Udaipur?",
            listOf("लूणी नदी", "आयड़ / बेड़च नदी (Ayad / Berach River, Udaipur)", "चंबल नदी", "माही नदी"),
            listOf("Luni River", "Ayad / Berach River (Udaipur)", "Chambal River", "Mahi River"),
            1,
            "आहड़ (उदयपुर) बनास-आयड़ नदी घाटी में स्थित ताम्रपाषाण कालीन सभ्यता है। इसे 'ताम्रवती नगरी' या 'धूलकोट' भी कहा जाता है। इसकी खोज अक्षय कीर्ति व्यास (1953) ने की थी।",
            "Ahar culture is a Chalcolithic archaeological culture on the banks of Ahar/Berach river in Udaipur district.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q3", "raj_1",
            "गणेश्वर सभ्यता (Ganeshwar Culture) जो ताम्रयुगीन संस्कृतियों की जननी कहलाती है, किस नदी के किनारे स्थित है?",
            "Ganeshwar civilization, regarded as the 'Mother of Copper Age Cultures' in India, is located on the banks of which river in Neem Ka Thana / Sikar?",
            listOf("कांतली नदी (Kanthli River, Neem Ka Thana / Sikar)", "साबी नदी", "रूपारेल नदी", "बाणगंगा"),
            listOf("Kanthli River (Neem Ka Thana / Sikar)", "Sabi River", "Ruparel River", "Banganga River"),
            0,
            "गणेश्वर (नीम का थाना / सीकर) कांतली नदी के उद्गम पर स्थित ताम्रयुगीन स्थल है। इसे 'ताम्रयुगीन संस्कृतियों की जननी' तथा 'पुरातत्व का पुष्कर' कहा जाता है।",
            "Ganeshwar is an ancient archaeological site on the Kantli river in Rajasthan, celebrated as the mother of Indian Copper Age cultures.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q4", "raj_1",
            "मौर्य सम्राट अशोक का प्रसिद्ध 'भाब्रू शिलालेख' (Bhabru Edict) बैराठ (विराटनगर) की किस डूंगरी से कैप्टन बर्ट द्वारा खोजा गया था?",
            "From which hill in Bairath (Viratnagar, Jaipur) was Emperor Ashoka's famous Bhabru Rock Edict discovered by Captain Burt in 1837?",
            listOf("मोती डूंगरी", "बीजक की पहाड़ी / डूंगरी (Beejak Ki Pahadi, Bairath)", "भीम डूंगरी", "गणेश डूंगरी"),
            listOf("Moti Dungri", "Beejak Ki Pahadi (Bijak Hill, Bairath)", "Bheem Dungri", "Ganesh Dungri"),
            1,
            "1837 में कैप्टन बर्ट ने बैराठ (विराटनगर) की 'बीजक की पहाड़ी' से सम्राट अशोक का भाब्रू शिलालेख खोजा, जिसमें अशोक द्वारा बौद्ध धर्म के त्रिरत्न (बुद्ध, धम्म, संघ) में आस्था व्यक्त की गई है।",
            "The Bhabru rock edict of Emperor Ashoka was discovered in 1837 by Captain Burt on Bijak-ki-Pahari at Bairath (ancient Matsya capital Viratnagar).",
            "Moderate"
        ),
        makeRajQ(
            "raj_1_m1_q5", "raj_1",
            "तराइन का प्रथम युद्ध (1191 ई.) में पृथ्वीराज चौहान तृतीय ने किसे पराजित किया था?",
            "Whom did Prithviraj Chauhan III decisively defeat in the First Battle of Tarain in 1191 AD?",
            listOf("महमूद गजनवी", "मुहम्मद गोरी (Muhammad Ghori)", "कुतुबुद्दीन ऐबक", "बलबन"),
            listOf("Mahmud Ghaznavi", "Muhammad Ghori (First Battle of Tarain 1191)", "Qutb-ud-din Aibak", "Balban"),
            1,
            "1191 ई. में तराइन के प्रथम युद्ध में अजमेर/दिल्ली के शासक पृथ्वीराज चौहान तृतीय ने मुहम्मद गोरी को बुरी तरह पराजित किया था। किंतु 1192 के द्वितीय युद्ध में गोरी विजयी रहा।",
            "In 1191, Prithviraj Chauhan defeated Muhammad of Ghor in the First Battle of Tarain.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q6", "raj_1",
            "चित्तौड़गढ़ का प्रथम साका (First Jauhar & Saka of Chittorgarh) 1303 ई. में अलाउद्दीन खिलजी के आक्रमण के समय किसके नेतृत्व में हुआ?",
            "Under whose leadership did Rani Padmini perform Jauhar during the First Saka of Chittorgarh in 1303 AD against Alauddin Khalji?",
            listOf("रावल रतन सिंह एवं रानी पद्मिनी (Rawal Ratan Singh & Rani Padmini)", "राणा कुंभा", "राणा सांगा एवं कर्मावती", "महाराणा प्रताप"),
            listOf("Rawal Ratan Singh & Rani Padmini (1303 AD)", "Rana Kumbha", "Rana Sanga & Karmavati", "Maharana Pratap"),
            0,
            "1303 ई. में अलाउद्दीन खिलजी ने चित्तौड़ पर आक्रमण किया। रावल रतन सिंह के नेतृत्व में केसरिया हुआ तथा रानी पद्मिनी के नेतृत्व में 1600 वीरांगनाओं ने ऐतिहासिक जौहर किया।",
            "In 1303 AD, Alauddin Khalji besieged Chittor Fort. Rawal Ratan Singh fought valiantly and Rani Padmini led the historic Jauhar.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q7", "raj_1",
            "1527 ई. में राणा सांगा और मुग़ल आक्रांता बाबर के मध्य प्रसिद्ध 'खानवा का युद्ध' (Battle of Khanwa) किस जिले में हुआ था?",
            "In which current district of Rajasthan was the historic 'Battle of Khanwa' fought in March 1527 between Rana Sanga and Babur?",
            listOf("दौसा", "भरतपुर (रूपवास तहसील, Bharatpur district)", "अलवर", "धौलपुर"),
            listOf("Dausa", "Bharatpur (Rupwas tehsil, Bharatpur)", "Alwar", "Dholpur"),
            1,
            "खानवा का युद्ध 17 मार्च 1527 को भरतपुर जिले की रूपवास तहसील के खानवा मैदान में राणा सांगा और बाबर के बीच लड़ा गया था, जिसमें बाबर ने जिहाद का नारा दिया और तुलगुमा पद्धति का प्रयोग किया।",
            "The Battle of Khanwa took place on 17 March 1527 near Bharatpur between Maharana Sanga of Mewar and Mughal founder Babur.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q8", "raj_1",
            "18 जून 1576 को लड़ा गया ऐतिहासिक 'हल्दीघाटी का युद्ध' (Battle of Haldighati) किनके बीच हुआ था?",
            "Between whom was the epic 'Battle of Haldighati' fought on 18 June 1576 in Rajasthan?",
            listOf("राणा सांगा और बाबर", "महाराणा प्रताप और अकबर की मुग़ल सेना (मानसिंह के नेतृत्व में)", "पृथ्वीराज चौहान और गोरी", "अमर सिंह और जहांगीर"),
            listOf("Rana Sanga and Babur", "Maharana Pratap and the Mughal Imperial Army led by Raja Man Singh I", "Prithviraj Chauhan and Ghori", "Amar Singh and Jahangir"),
            1,
            "हल्दीघाटी का युद्ध (राजसमंद) 18 जून 1576 को मेवाड़ के वीर शिरोमणि महाराणा प्रताप और मुग़ल सेनापति मानसिंह कछवाहा के मध्य हुआ। कर्नल टॉड ने इसे 'मेवाड़ की थर्मोपल्ली' कहा।",
            "The Battle of Haldighati was fought on 18 June 1576 between Maharana Pratap of Mewar and Mughal forces led by Man Singh I of Amber.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q9", "raj_1",
            "कर्नल जेम्स टॉड (Colonel James Tod) ने किस ऐतिहासिक युद्ध को 'मेवाड़ का मैराथन' (Marathon of Mewar) कहा था?",
            "Which battle fought in October 1582, where Maharana Pratap routed the Mughal outpost, was called the 'Marathon of Mewar' by Colonel James Tod?",
            listOf("हल्दीघाटी का युद्ध", "दिवेर का युद्ध (Battle of Diver, 1582 AD)", "खानवा का युद्ध", "सारंगपुर का युद्ध"),
            listOf("Battle of Haldighati", "Battle of Diver (1582 AD, Rajsamand)", "Battle of Khanwa", "Battle of Sarangpur"),
            1,
            "अक्टूबर 1582 में महाराणा प्रताप ने दिवेर की मुग़ल छावनी पर आक्रमण कर सुल्तान खां को पराजित किया। इसे महाराणा प्रताप की विजयों का 'श्रीगणेश' और टॉड द्वारा 'मेवाड़ का मैराथन' कहा गया।",
            "The Battle of Dewair (1582) saw Maharana Pratap recapture territories from Mughals, hailed by Tod as the 'Marathon of Mewar'.",
            "Moderate"
        ),
        makeRajQ(
            "raj_1_m1_q10", "raj_1",
            "1857 की क्रांति के समय राजस्थान में कुल कितनी ब्रिटिश सैनिक छावनियां (Military Cantonments) थीं?",
            "How many British military cantonments existed in Rajasthan during the Revolt of 1857?",
            listOf("4 छावनियां", "6 सैनिक छावनियां (नसीराबाद, नीमच, देवली, ब्यावर, एरिनपुरा, खेरवाड़ा)", "8 छावनियां", "10 छावनियां"),
            listOf("4 cantonments", "6 Military Cantonments (Nasirabad, Neemuch, Deoli, Beawar, Erinpura, Kherwara)", "8 cantonments", "10 cantonments"),
            1,
            "1857 की क्रांति के समय राजपूताना में 6 सैनिक छावनियां थीं: नसीराबाद, नीमच, देवली, एरिनपुरा, ब्यावर और खेरवाड़ा। (ब्यावर और खेरवाड़ा के सैनिकों ने विद्रोह में प्रत्यक्ष भाग नहीं लिया)।",
            "There were 6 British military cantonments in Rajasthan in 1857: Nasirabad, Neemuch, Deoli, Erinpura, Beawar, and Kherwara.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q11", "raj_1",
            "राजस्थान में 1857 की क्रांति की शुरुआत 28 मई 1857 को सर्वप्रथम किस छावनी से हुई थी?",
            "From which military cantonment did the 1857 Revolt in Rajasthan first break out on 28 May 1857?",
            listOf("नीमच छावनी", "नसीराबाद छावनी (Nasirabad Cantonment, Ajmer - 15th Bengal Native Infantry)", "एरिनपुरा छावनी", "कोटा"),
            listOf("Neemuch", "Nasirabad Cantonment (Ajmer - initiated by 15th Bengal Native Infantry on 28 May 1857)", "Erinpura", "Kota"),
            1,
            "राजस्थान में 1857 की क्रांति का प्रारंभ 28 मई 1857 को नसीराबाद (अजमेर) छावनी में 15वीं बंगाल नेटिव इन्फैंट्री के सैनिकों (बख्तावर सिंह के नेतृत्व) द्वारा किया गया।",
            "The Revolt of 1857 in Rajasthan began at Nasirabad cantonment on 28 May 1857 when troops of the 15th Native Infantry mutinied.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q12", "raj_1",
            "आउवा (पाली) के ठाकुर कुशाल सिंह चंपावत ने 1857 में 'बिथोड़ा' और 'चेलावास' के युद्ध में किन सेनाओं को हराया था?",
            "Thakur Kushal Singh of Auwa defeated British and Jodhpur State forces in which famous 1857 battles ('Battle of Black and White' / Gora-Kala)?",
            listOf("हल्दीघाटी युद्ध", "बिथोड़ा का युद्ध (8 सित.) और चेलावास का युद्ध (18 सित. 1857 - काले-गोरों का युद्ध)", "खानवा युद्ध", "दिवेर युद्ध"),
            listOf("Haldighati", "Battle of Bithoda (8 Sep) and Battle of Chelawas / Gora-Kala (18 Sep 1857)", "Khanwa", "Diver"),
            1,
            "आउवा के ठाकुर कुशाल सिंह ने 8 सितंबर 1857 को बिथोड़ा में जोधपुर सेना (कैप्टन हीथकोट) को तथा 18 सितंबर को चेलावास में लॉरेंस व मोंक मेसन की सेना को पराजित किया (मोंक मेसन का सिर काटकर आउवा किले पर लटका दिया गया)।",
            "Thakur Kushal Singh Champawat of Auwa defeated British forces at Bithoda and Chelawas (known as the Battle of Gora-Kala) in September 1857.",
            "Moderate"
        ),
        makeRajQ(
            "raj_1_m1_q13", "raj_1",
            "राजस्थान के एकीकरण (Integration of Rajasthan) का प्रथम चरण 'मत्स्य संघ' (Matsya Union) कब उद्घाटित हुआ था?",
            "On which date was the first stage of Rajasthan's integration, the 'Matsya Union' (comprising Alwar, Bharatpur, Dholpur, Karauli), inaugurated?",
            listOf("18 मार्च 1948 (18 March 1948 - Matsya Union)", "25 मार्च 1948", "18 अप्रैल 1948", "30 मार्च 1949"),
            listOf("18 March 1948 (Matsya Union - Alwar, Bharatpur, Dholpur, Karauli)", "25 March 1948", "18 April 1948", "30 March 1949"),
            0,
            "राजस्थान एकीकरण का प्रथम चरण 18 मार्च 1948 को 'मत्स्य संघ' के रूप में हुआ। इसमें अलवर, भरतपुर, धौलपुर, करौली रियासतें व नीमराणा ठिकाना शामिल था। शोभाराम कुमावत इसके प्रधानमंत्री बने।",
            "The Matsya Union was formed on 18 March 1948 with Alwar, Bharatpur, Dholpur, and Karauli. K.M. Munshi suggested the name 'Matsya Union'.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q14", "raj_1",
            "प्रतिवर्ष 'राजस्थान दिवस' (Rajasthan Day) 30 मार्च को किस चरण के गठन (वृहत् राजस्थान) के उपलक्ष्य में मनाया जाता है?",
            "Why is 'Rajasthan Day' celebrated annually on 30 March, commemorating the formation of 'Greater Rajasthan' in 1949?",
            listOf("मत्स्य संघ गठन", "वृहत् राजस्थान संघ (Greater Rajasthan - 30 March 1949 with Jaipur, Jodhpur, Bikaner & Jaisalmer merger)", "संयुक्त राजस्थान", "पुनर्गठित राजस्थान"),
            listOf("Matsya Union", "Formation of Greater Rajasthan (30 March 1949) merging major princely states Jaipur, Jodhpur, Bikaner & Jaisalmer", "United Rajasthan", "Reorganized Rajasthan"),
            1,
            "30 मार्च 1949 को चौथे चरण में जयपुर, जोधपुर, बीकानेर और जैसलमेर जैसी बड़ी रियासतों के विलय से 'वृहत् राजस्थान' का गठन हुआ। सरदार वल्लभभाई पटेल ने इसका उद्घाटन जयपुर में किया। इसलिए 30 मार्च को 'राजस्थान दिवस' मनाते हैं।",
            "Rajasthan Day is observed on 30 March commemorating the formation of Greater Rajasthan on 30 March 1949 with Jaipur as capital and Hiralal Shastri as premier.",
            "Easy"
        ),
        makeRajQ(
            "raj_1_m1_q15", "raj_1",
            "राजस्थान का वर्तमान स्वरूप (एकीकरण का अंतिम एवं 7वां चरण) किस तिथि को पूर्ण हुआ जब अजमेर-मेरवाड़ा और आबू-देलवाड़ा शामिल हुए?",
            "On which historic date was the 7th and final stage of Rajasthan integration completed, integrating Ajmer-Merwara and Abu-Delwara?",
            listOf("26 जनवरी 1950", "1 नवंबर 1956 (1 November 1956 - Complete Modern Rajasthan)", "15 अगस्त 1947", "30 मार्च 1956"),
            listOf("26 January 1950", "1 November 1956 (State Reorganisation Act - Ajmer-Merwara & Mount Abu merged)", "15 August 1947", "30 March 1956"),
            1,
            "राजस्थान का एकीकरण कुल 7 चरणों में (8 वर्ष 7 माह 14 दिन) पूरा हुआ। 1 नवंबर 1956 को राज्य पुनर्गठन आयोग (फजल अली आयोग) की सिफारिश पर अजमेर-मेरवाड़ा, आबू-देलवाड़ा तथा सुनेल टप्पा का विलय कर आधुनिक राजस्थान का स्वरूप बना।",
            "On 1 November 1956, Rajasthan attained its final modern political map through the States Reorganisation Act.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + RajasthanQuestionHelper.generateTopicMocks("raj_1", 2, 5, baseQuestions)
    }
}
