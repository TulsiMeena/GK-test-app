package com.example.ui.data

import com.example.ui.data.RajasthanQuestionHelper.makeRajQ
import com.example.ui.model.GkQuestion

object RajasthanTopic8Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeRajQ(
            "raj_8_m1_q1", "raj_8",
            "राजस्थान के 'पंचपीरों' (Panchpir) में निम्नलिखित में से कौन-से लोक देवता शामिल नहीं हैं?",
            "Which of the following folk deities is NOT included among the revered 'Panchpirs' of Rajasthan?",
            listOf("पाबूजी", "तेजाजी (Tejaji - Not in Panchpir; Panchpir includes Pabuji, Ramdevji, Gogaji, Harbhuji, Mehaji)", "गोगाजी", "हड़बूजी"),
            listOf("Pabuji", "Tejaji (Tejaji is a major folk deity but not among the traditional Panchpirs)", "Gogaji", "Harbhuji"),
            1,
            "राजस्थान के पंचपीरों के लिए प्रसिद्ध दोहा है: 'पाबू, हड़बू, रामदे, मांगलिया मेहा। पांचू पीर पधारज्ये, गोगाजी जेहा॥' इसमें पाबूजी, हड़बूजी, रामदेवजी, मेहाजी मांगलिया और गोगाजी शामिल हैं। तेजाजी पंचपीरों में शामिल नहीं हैं।",
            "The five venerated Panchpirs of Rajasthan are Pabuji, Ramdevji, Gogaji, Harbhuji, and Mehaji Mangaliya. Tejaji is not classified in the Panchpir group.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q2", "raj_8",
            "ऊंटों के देवता, प्लेग रक्षक देवता एवं 'मारवाड़ में सर्वप्रथम ऊंट (सांडे) लाने का श्रेय' किस लोक देवता को दिया जाता है?",
            "Which folk deity is worshipped as the protector of camels, healer of plague, and credited with first introducing camels to Marwar?",
            listOf("रामदेवजी", "पाबूजी (Pabuji - Camel deity, vehicle: Kesar Kalmi mare, Phad painted by Nayak/Bhil Bhopas)", "गोगाजी", "मल्लीनाथ जी"),
            listOf("Ramdevji", "Pabuji (Deity of Camels, protector of cows, fought Jindrav Khichi of Jayal)", "Gogaji", "Mallinath Ji"),
            1,
            "पाबूजी (कोलू मंड, फलोदी) को ऊंटों के देवता और प्लेग रक्षक देवता माना जाता है। ऊंट बीमार होने पर पाबूजी की फड़ का वाचन रावणहत्था वाद्य के साथ किया जाता है। रायका/रेबारी जाति पाबूजी को अपना आराध्य मानती है। इनकी घोड़ी का नाम 'केसर कालमी' था।",
            "Pabuji of Kolu Mand is revered as the patron deity of camels and cow protector. The Raika/Rebari camel-breeding community worships him as their prime deity.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q3", "raj_8",
            "रूणेचा (जैसलमेर) के प्रसिद्ध लोक देवता जिन्होंने 'कांबड़िया पंथ' की स्थापना की और एकमात्र ऐसे लोक देवता थे जो एक प्रसिद्ध 'कवि' भी थे?",
            "Which legendary folk deity of Runecha (Jaisalmer) established the 'Kamadiya Panth' and was the only folk deity who was also an accomplished poet (author of 'Chaubis Baniya')?",
            listOf("गोगाजी", "बाबा रामदेवजी (Baba Ramdevji - Incarnation of Krishna, founder of Kamadiya Panth, wrote 'Chaubis Baniya')", "हड़बूजी", "देवनारायण जी"),
            listOf("Gogaji", "Baba Ramdevji (Runecha, Jaisalmer - Champion of social equality, temple at Ramdevra)", "Harbhuji", "Devnarayan Ji"),
            1,
            "रामदेवजी (तंवर वंशीय राजपूत, उंडूकाश्मीर बाड़मेर में जन्म) को भगवान कृष्ण का अवतार और 'पीरों का पीर' (रामसा पीर) कहा जाता है। उन्होंने छुआछूत मिटाने के लिए 'कांबड़िया पंथ' चलाया। इनकी प्रमुख रचना 'चौबीस बाणियां' है। इनकी समाधि रूणेचा (रामदेवरा, जैसलमेर) में है जहाँ भाद्रपद शुक्ल द्वितीया से एकादशी तक विशाल मेला भरता है।",
            "Baba Ramdevji of Runecha established the Kamadiya sect advocating social equality. He authored 'Chaubis Baniya' and his devotees perform the Terah Taali dance.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q4", "raj_8",
            "गायों की रक्षा हेतु महमूद गजनवी से युद्ध करने वाले और 'जाहरपीर' (साक्षात देवता) के नाम से पूजे जाने वाले लोक देवता कौन हैं?",
            "Which folk deity fought valiantly against Mahmud of Ghazni to protect cattle and was bestowed the title 'Jaharpeer' (living god)?",
            listOf("पाबूजी", "गोगाजी (Gogaji - Jaharpeer, Dadrewa Churu is Sirsmedi, Gogamedi Hanumangarh is Dhursmedi)", "तेजाजी", "मेहाजी"),
            listOf("Pabuji", "Gogaji (Chauhan Rajput, battle against Ghazni, temple at Gogamedi Hanumangarh)", "Tejaji", "Mehaji"),
            1,
            "गोगाजी (ददरेवा, चूरू में जन्म) को सांपों के देवता और 'जाहरपीर' कहा जाता है। इनका सिर ददरेवा (शीर्षमेड़ी) में और धड़ नोहर हनुमानगढ़ (धुरमेड़ी/गोगामेड़ी) में गिरा था। गोगामेड़ी मंदिर का निर्माण फिरोजशाह तुगलक ने मकबरेनुमा शैली में करवाया था जिस पर 'बिस्मिल्लाह' अंकित है।",
            "Gogaji was a warrior saint of the Chauhan clan who battled Mahmud Ghaznavi. His shrines are at Dadrewa (Sirsmedi) and Gogamedi (Dhursmedi, Hanumangarh).",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q5", "raj_8",
            "लाछां गूजरी की गायों को मेर के मीणाओं से छुड़ाते समय वीरगति प्राप्त करने वाले और 'काला-बाला के देवता' कहलाने वाले लोक देवता कौन हैं?",
            "Which folk deity sacrificed his life at Sursura while rescuing the cattle of Lacha Gujari from the Meenas of Mer, and is revered as the deity of agriculture and snakebite cure?",
            listOf("गोगाजी", "वीर तेजाजी (Veer Tejaji - Born at Kharnal Nagaur, died at Sursura Ajmer, Parbatsar Fair)", "पाबूजी", "मल्लीनाथ जी"),
            listOf("Gogaji", "Veer Tejaji (Jat warrior born at Kharnal; legendary sacrifice for cattle protection; Parbatsar cattle fair)", "Pabuji", "Mallinath Ji"),
            1,
            "तेजाजी (खरनाल, नागौर में जाट परिवार में जन्म) ने लाछां गूजरी की गायों की रक्षा की। सुरसुरा (अजमेर) में सर्पदंश से वीरगति प्राप्त की। इनकी घोड़ी का नाम 'लीलण' (शिंगारी) था। परबतसर (नागौर/डीडवाना-कुचामन) में भाद्रपद शुक्ल दशमी (तेजा दशमी) को इनका प्रसिद्ध पशु मेला भरता है।",
            "Veer Tejaji was born at Kharnal (Nagaur). He sacrificed his life to protect the cows of Lacha Gujari. The famous Veer Tejaji Cattle Fair takes place at Parbatsar.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q6", "raj_8",
            "गुर्जर जाति के आराध्य लोक देवता जिनकी 'फड़' राजस्थान की सबसे लंबी व सबसे प्राचीन फड़ है और जिस पर 1992 में 5 रुपये का डाक टिकट जारी किया गया था?",
            "Which revered folk deity of the Gurjar community has the longest and oldest traditional 'Phad' painting in Rajasthan, on which a ₹5 postal stamp was issued in 1992?",
            listOf("तेजाजी", "भगवान देवनारायण जी (Lord Devnarayan Ji - Incarnation of Vishnu, Asind Bhilwara, Jantar musical instrument used)", "पाबूजी", "कल्लाजी राठौड़"),
            listOf("Tejaji", "Lord Devnarayan Ji (Bagarawat Gurjar warrior, incarnation of Vishnu, worshipped with Neem leaves and bricks)", "Pabuji", "Kallaji Rathore"),
            1,
            "देवनारायण जी (आसींद, भीलवाड़ा) को भगवान विष्णु का अवतार माना जाता है। इनकी फड़ राजस्थान की सबसे लंबी, सबसे प्राचीन और सर्वाधिक चित्रांकन वाली फड़ है, जिसका वाचन गुर्जर भोपों द्वारा 'जंतर' वाद्य के साथ किया जाता है। इनके मंदिर में मूर्ति के स्थान पर ईंटों की पूजा नीम की पत्तियों से की जाती है।",
            "Devnarayan Ji of Asind (Bhilwara) is an avatar of Vishnu. His Phad is the longest folk scroll in Rajasthan, performed with the Jantar string instrument.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q7", "raj_8",
            "1567-68 के चित्तौड़गढ़ के तीसरे साके में अकबर की सेना के विरुद्ध लड़ते हुए वीरगति पाने वाले 'चार हाथों वाले लोक देवता' (Four-armed Folk Deity) कौन हैं?",
            "Who is celebrated as the 'Four-armed Deity' (Char Hathon wale Devta) after he carried Jaimal Rathore on his shoulders during the 1567-68 Siege of Chittorgarh against Akbar?",
            listOf("वीर फत्ताजी", "वीर कल्लाजी राठौड़ (Veer Kallaji Rathore - 'Four-armed deity', hero of 3rd Jauhar of Chittorgarh)", "पत्ता चुंडावत", "मेहाजी मांगलिया"),
            listOf("Veer Fattaji", "Veer Kallaji Rathore (Fought Akbar carrying his wounded uncle Jaimal on his shoulders; chhatri at Bhairav Pol Chittorgarh)", "Patta Chundawat", "Mehaji Mangaliya"),
            1,
            "कल्लाजी राठौड़ (मेड़ता में जन्म) ने चित्तौड़गढ़ के तीसरे साके (1568) में घायल जयमल राठौड़ को अपने कंधों पर बिठाकर दोनों हाथों में तलवारें लेकर युद्ध लड़ा, जिससे वे 'चार हाथों वाले देवता' कहलाए। इनकी छतरी चित्तौड़गढ़ दुर्ग के भैरव पोल पर स्थित है।",
            "Veer Kallaji Rathore is revered as the four-armed deity because he carried his uncle Jaimal Rathore on his shoulders, both wielding swords against Akbar's forces at Chittorgarh.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q8", "raj_8",
            "बीकानेर के राठौड़ राजवंश की कुलदेवी तथा चूहों वाली देवी ('काबा' वाली माता) के रूप में प्रसिद्ध देशनोक की लोक देवी कौन हैं?",
            "Which iconic folk goddess of Deshnoke is worshipped as the tutelary deity of the Rathore dynasty of Bikaner, famous for thousands of revered sacred white rats (Kaba)?",
            listOf("जीण माता", "करणी माता (Karni Mata - Deshnoke Bikaner, goddess of rats/Kaba, temple built by Maharaja Ganga Singh)", "शीला देवी", "कैला देवी"),
            listOf("Jeen Mata", "Karni Mata (Deshnoke, Bikaner - Incarnation of Goddess Durga / Hinglaj; white rat sighting brings good fortune)", "Shila Devi", "Kaila Devi"),
            1,
            "करणी माता (रिद्धू बाई) का प्रसिद्ध मंदिर देशनोक (बीकानेर) में स्थित है। मंदिर में घूमने वाले चूहों को 'काबा' कहा जाता है और सफेद काबा (सफेद चूहा) देखना अत्यधिक शुभ माना जाता है। इन्हें दाढ़ी वाली डोकरी और चील (सफेद चील) का रूप भी माना जाता है।",
            "Karni Mata temple in Deshnoke is renowned worldwide for its sacred rats. She laid the foundation stones of Mehrangarh and Bikaner forts.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q9", "raj_8",
            "करौली के यदुवंशी राजवंश की कुलदेवी जिनके मंदिर में 'लांगुरिया' (Languriya) गीत एवं नृत्य गाए जाते हैं, कौन हैं?",
            "Worshipped as the tutelary goddess of the Yaduvanshi rulers of Karauli, in front of whose temple the famous 'Languriya' devotional songs and dances are performed?",
            listOf("शीतला माता", "कैला देवी (Kaila Devi - Trikut Hill Karauli, Languriya songs, Bohra Bhagat ki Chhatri)", "जीण माता", "आई माता"),
            listOf("Sheetla Mata", "Kaila Devi (Karauli - Situated on Trikut hill near Kalisil river; celebrated for Languriya devotional songs)", "Jeen Mata", "Aai Mata"),
            1,
            "कैला देवी (करौली) का मंदिर त्रिकूट पर्वत पर कालीसिल नदी के तट पर स्थित है। इन्हें भगवान कृष्ण की बहन योगमाया माना जाता है। इनके भक्त 'लांगुरिया' गीत गाते हुए नृत्य करते हैं। मंदिर के सामने 'बोहरा भगत की छतरी' स्थित है।",
            "Kaila Devi temple in Karauli is situated on the Trikut hill. Devotees sing joyful 'Languriya' bhajans and perform Kanak-Dandoti during the Chaitra Navratri fair.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q10", "raj_8",
            "सीकर के रेवासा में स्थित किस लोक देवी का लोकगीत राजस्थान के सभी लोक देवी-देवताओं में सबसे लंबा (गीत) माना जाता है?",
            "Whose devotional song (Chirja) in Rajasthan's rich folk lore is celebrated as the longest musical narrative among all folk deities, enshrined at Rewasa (Sikar)?",
            listOf("सकराय माता", "जीण माता (Jeen Mata - Rewasa Sikar, Kajal Shikar hill, longest folk bhajan in Rajasthan)", "शीला देवी", "बाण माता"),
            listOf("Sakray Mata", "Jeen Mata (Rewasa, Sikar - Sister of Harsh; temple built on Kajal Shikar during the reign of Prithviraj Chauhan I)", "Shila Devi", "Baan Mata"),
            1,
            "जीण माता (रेवासा, सीकर) का मंदिर काजल शिखर की पहाड़ी पर स्थित है। राजस्थान के लोक साहित्य में जीण माता का लोकगीत सबसे लंबा (चिरजा) है, जिसे जोगी (कनफटे नाथ) डमरू और सारंगी पर गाते हैं। औरंगजेब द्वारा इस मंदिर पर आक्रमण करने पर मधुमक्खियों (भंवरों) ने सेना पर हमला किया था।",
            "Jeen Mata temple at Rewasa (Sikar) features the longest traditional devotional song in Rajasthani folklore, chanted by Kanphata jogis with Sarangi.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q11", "raj_8",
            "चाकसू (जयपुर ग्रामीण) के शील की डूंगरी में स्थित किस देवी के मंदिर में 'खंडित मूर्ति' की पूजा की जाती है और बास्योड़ा (ठंडा भोजन) का भोग लगाया जाता है?",
            "At Sheel Ki Dungri in Chaksu (Jaipur), which goddess of smallpox is uniquely worshipped in the form of a broken idol, where devotees offer 'Basyoda' (cold stale food)?",
            listOf("आई माता", "शीतला माता (Sheetla Mata - Chaksu Jaipur, deity of smallpox/children, donkey vehicle, Kumar priest, Basyoda)", "रानी सती", "आवड़ माता"),
            listOf("Aai Mata", "Sheetla Mata (Chaksu, Jaipur - Goddess of Smallpox / Children's health, riding a donkey, worshipped on Sheetlashtami with cold food)", "Rani Sati", "Aawad Mata"),
            1,
            "शीतला माता (चाकसू, जयपुर) बच्चों की संरक्षिका और चेचक की देवी मानी जाती हैं। इनका वाहन गधा और पुजारी कुम्हार (प्रजापत) होता है। चैत्र कृष्ण अष्टमी (शीतलाष्टमी) को बास्योड़ा पर बासी ठंडे पकवानों का भोग लगाया जाता है। यह एकमात्र देवी हैं जिनकी खंडित रूप में पूजा होती है।",
            "Sheetla Mata at Chaksu is the protector deity of children from diseases like smallpox. She is worshipped on Sheetlashtami with stale/cold festive foods (Basyoda).",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q12", "raj_8",
            "पर्यावरण संरक्षण के प्रणेता जिन्होंने '29 नियम' (Twenty-Nine Rules) दिए और विश्नोई संप्रदाय की स्थापना की, वे महान संत कौन थे?",
            "Who founded the Bishnoi community at Samrathal Dhoro (1485) and formulated the '29 Principles' with a paramount emphasis on environmental conservation and tree protection?",
            listOf("संत जसनाथ जी", "संत जाम्भोजी (Sant Jambhoji - Guru Jambheshwar, born at Pipasar Nagaur, 29 rules, Samrathal Dhoro Bikaner)", "संत दादू दयाल", "संत पीपा"),
            listOf("Sant Jasnath Ji", "Sant Jambhoji (Guru Jambheshwar - Born at Pipasar Nagaur, established Bishnoi sect with 29 vows in 1485 at Samrathal Dhoro)", "Sant Dadu Dayal", "Sant Pipa"),
            1,
            "संत जाम्भोजी (गुरु जम्भेश्वर, 1451-1536 ई., पीपासर नागौर में जन्म) ने 1485 में समराथल धोरा (बीकानेर) में 29 नियम देकर 'विश्नोई संप्रदाय' (20+9 = विश्नोई) की स्थापना की। इनके उपदेश 'जम्भसागर' और 'जम्भसंहिता' में संकलित हैं। इनकी प्रमुख पीठ मुकाम (नोखा, बीकानेर) में है। खेजड़ली बलिदान (1730 अमृता देवी) इसी पर्यावरण चेतना का प्रतीक है।",
            "Guru Jambheshwar (Jambhoji) founded the Bishnoi faith based on 29 ethical and ecological commandments, pioneering global nature conservation.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q13", "raj_8",
            "कतरियासर (बीकानेर) में सिद्ध पुरुषों द्वारा धधकते अंगारों पर 'फतेह-फतेह' का उद्घोष करते हुए किया जाने वाला 'अग्नि नृत्य' किस संप्रदाय से संबंधित है?",
            "The electrifying 'Agni Nritya' (Fire Dance) performed on glowing live charcoal to the chant of 'Fateh-Fateh' at Katariasar (Bikaner) belongs to which sect?",
            listOf("विश्नोई संप्रदाय", "जसनाथी संप्रदाय (Jasnathi Sect - Founded by Sant Jasnath Ji, 36 rules, Fire Dance of Katariasar)", "रामस्नेही संप्रदाय", "दादूपंथ"),
            listOf("Bishnoi Sect", "Jasnathi Sect (Founded by Sant Jasnath Ji; 36 rules; famous Agni Nritya performed by Siddhas at Katariasar Bikaner)", "Ramsnehi Sect", "Dadu Panth"),
            1,
            "संत जसनाथ जी (1482-1506 ई.) ने कतरियासर (बीकानेर) में 'जसनाथी संप्रदाय' की स्थापना की जिसमें 36 नियम हैं। जसनाथी सिद्ध पुरुष धधकते अंगारों के धूणे में कूदकर 'फतेह-फतेह' बोलते हुए 'अग्नि नृत्य' (Fire Dance) करते हैं। सिकंदर लोदी ने जसनाथ जी को कतरियासर में जमीन भेंट की थी।",
            "The Jasnathi sect was founded by Sant Jasnath Ji at Katariasar (Bikaner). Its followers observe 36 rules and perform the celebrated Fire Dance on red-hot embers.",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q14", "raj_8",
            "'राजस्थान का कबीर' (Kabir of Rajasthan) किस महान संत को कहा जाता है, जिनकी प्रमुख पीठ नरेना/नारायणा (जयपुर) में स्थित है?",
            "Which great saint is venerated as the 'Kabir of Rajasthan', whose principal seat (Gaddi) is at Naraina (Jaipur) and whose satsangs are called 'Alakh Dariba'?",
            listOf("संत सुंदरदास", "संत दादू दयाल (Sant Dadu Dayal - 'Kabir of Rajasthan', Naraina Jaipur, Alakh Dariba, 52 Stambhas)", "संत रज्जब जी", "संत चरणदास"),
            listOf("Sant Sundardas", "Sant Dadu Dayal (1544-1603 - Known as Rajasthan's Kabir; Nirguna Bhakti; main seat at Naraina; met Akbar at Fatehpur Sikri in 1585)", "Sant Rajjab Ji", "Sant Charandas"),
            1,
            "संत दादू दयाल (1544-1603 ई., अहमदाबाद में जन्म) को 'राजस्थान का कबीर' कहा जाता है। उन्होंने निर्गुण भक्ति का उपदेश ढूँढाड़ी (सधुक्कड़ी) भाषा में दिया। इनकी प्रमुख पीठ नरेना (नारायणा, जयपुर) में है। दादूपंथ के सत्संग स्थल को 'अलख दरीबा' कहा जाता है। इनके 52 प्रमुख शिष्य 'बावन स्तंभ' कहलाते हैं। 1585 में इन्होंने फतेहपुर सीकरी में अकबर से भेंट की थी।",
            "Sant Dadu Dayal is revered as the Kabir of Rajasthan. He championed Nirguna bhakti and established Dadu Panth headquartered at Naraina (Jaipur).",
            "Easy"
        ),
        makeRajQ(
            "raj_8_m1_q15", "raj_8",
            "रामस्नेही संप्रदाय (Ramsnehi Sect) की मुख्य पीठ (Main Seat) कहाँ स्थित है जहाँ होली के अगले दिन प्रसिद्ध 'फूलडोल महोत्सव' (Phuldol Festival) आयोजित होता है?",
            "Where is the prime international seat of the Ramsnehi Sect located, where the world-famous 5-day 'Phuldol Festival' is celebrated right after Holi?",
            listOf("रेण (नागौर)", "शाहपुरा, भीलवाड़ा (Shahpura, Bhilwara - Founded by Sant Ramcharan Ji, Phuldol Festival)", "सिंहथल (बीकानेर)", "खेड़ापा (जोधपुर)"),
            listOf("Ren (Nagaur)", "Shahpura (Bhilwara - Established by Sant Ramcharan Ji; renowned Phuldol Mahotsav from Chaitra Krishna Pratipada to Panchami)", "Sinthal (Bikaner)", "Khedapa (Jodhpur)"),
            1,
            "रामस्नेही संप्रदाय की प्रधान पीठ शाहपुरा (भीलवाड़ा) में संत रामचरण जी (1720-1798 ई.) द्वारा स्थापित की गई। यहाँ चैत्र कृष्ण प्रतिपदा से पंचमी तक 5 दिवसीय 'फूलडोल महोत्सव' मनाया जाता है। रामस्नेही संप्रदाय की 4 शाखाएं हैं: 1. शाहपुरा (रामचरण जी), 2. रेण नागौर (संत दरियाव जी), 3. सिंहथल बीकानेर (संत हरिरामदास जी), 4. खेड़ापा जोधपुर (संत रामदास जी)।",
            "The prime seat of the Ramsnehi Sect is at Shahpura (Bhilwara), founded by Sant Ramcharan Ji. The annual Phuldol Festival is celebrated here with pink-robed sadhus.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + RajasthanQuestionHelper.generateTopicMocks("raj_8", 2, 5, baseQuestions)
    }
}
