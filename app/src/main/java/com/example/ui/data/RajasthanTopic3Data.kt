package com.example.ui.data

import com.example.ui.data.RajasthanQuestionHelper.makeRajQ
import com.example.ui.model.GkQuestion

object RajasthanTopic3Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeRajQ(
            "raj_3_m1_q1", "raj_3",
            "राजस्थान का कुल क्षेत्रफल 3,42,239 वर्ग किमी है, जो भारत के कुल भौगोलिक क्षेत्रफल का कितना प्रतिशत है?",
            "What exact percentage of India's total geographical area does Rajasthan occupy, making it the largest state in India by area since 2000?",
            listOf("8.50%", "10.41% (1/10th of India's total area - 3,42,239 sq km)", "12.25%", "14.80%"),
            listOf("8.50%", "10.41% (342,239 sq km out of India's 3.287 million sq km)", "12.25%", "14.80%"),
            1,
            "1 नवंबर 2000 को मध्य प्रदेश से छत्तीसगढ़ के अलग होने के बाद राजस्थान भारत का क्षेत्रफल की दृष्टि से सबसे बड़ा राज्य बना। इसका क्षेत्रफल 3,42,239 वर्ग किमी (1,32,139 वर्ग मील) है, जो भारत के कुल क्षेत्रफल का 10.41% (लगभग 1/10 भाग) है।",
            "Rajasthan is the largest Indian state by land area, constituting 10.41% of the country's total landmass.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q2", "raj_3",
            "अरावली पर्वतमाला की सबसे ऊंची चोटी 'गुरुशिखर' (Guru Shikhar, 1722 मीटर) सिरोही जिले में किस पर्वत खंड पर स्थित है?",
            "The highest mountain peak of the Aravalli Range and Rajasthan, 'Guru Shikhar' (1,722 meters), is located on which massif in Sirohi district?",
            listOf("जरगा पर्वत", "माउंट आबू / आबू पर्वत खंड (Mount Abu, Sirohi district)", "तारागढ़", "रघुनाथगढ़"),
            listOf("Jarga Peak", "Mount Abu / Abu Block (Sirohi district, 1722 m / 5650 ft)", "Taragarh", "Raghunathgarh"),
            1,
            "गुरुशिखर (1722 मीटर / मंदिर सहित 1727 मीटर) माउंट आबू (सिरोही) में स्थित अरावली और हिमालय-नीलगिरी के बीच मध्य भारत की सर्वोच्च चोटी है। कर्नल टॉड ने इसे 'संतों का शिखर' (Peak of Saints) कहा था।",
            "Guru Shikhar in Mount Abu rises to 1,722 m (5,650 ft), acclaimed by Col. Tod as the 'Peak of the Saints'.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q3", "raj_3",
            "विश्व की सबसे प्राचीन वलित पर्वतमाला (World's Oldest Fold Mountain Range) कौन सी है जो राजस्थान को उत्तर-पूर्व से दक्षिण-पश्चिम में विभाजित करती है?",
            "Which is the world's oldest fold mountain system (Pre-Cambrian era) running diagonally across Rajasthan from southwest to northeast?",
            listOf("हिमालय", "अरावली पर्वतमाला (Aravalli Range - approx 692 km total, 550 km in Rajasthan)", "विंध्याचल", "सतपुड़ा"),
            listOf("Himalayas", "Aravalli Range (Extends 692 km from Palanpur, Gujarat to Raisina Hill, Delhi; 550 km in Rajasthan)", "Vindhyas", "Satpura"),
            1,
            "अरावली पर्वतमाला प्री-कैम्ब्रियन काल (लगभग 65 करोड़ वर्ष पूर्व) की अवशिष्ट वलित पर्वतमाला है। इसकी कुल लंबाई 692 किमी (गुजरात के पालनपुर से दिल्ली की रायसीना पहाड़ी तक) है, जिसका 80% भाग (550 किमी) राजस्थान में स्थित है।",
            "The Aravalli Range is one of the oldest geological fold mountain systems in the world, formed during the Proterozoic eon.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q4", "raj_3",
            "थार का मरुस्थल (Great Indian Desert / Thar) राजस्थान के कुल क्षेत्रफल का लगभग कितना प्रतिशत भूभाग घेरता है?",
            "The Thar Desert covers approximately what percentage of Rajasthan's total land area across 12 western desert districts?",
            listOf("40%", "61.11% (Thar Desert covers ~61.11% of area and supports ~40% of population)", "75%", "50%"),
            listOf("40%", "61.11% (Covers 61.11% land area and inhabits 40% of state population)", "75%", "50%"),
            1,
            "राजस्थान का उत्तर-पश्चिमी रेतीला मरुस्थलीय प्रदेश राज्य के कुल क्षेत्रफल के 61.11% भाग पर विस्तृत है और यहाँ राज्य की लगभग 40% जनसंख्या निवास करती है। यह विश्व का सबसे अधिक जैव विविधता व जनघनत्व वाला मरुस्थल है।",
            "The Thar Desert occupies roughly 61.11% of Rajasthan's total area and is the most densely populated desert on Earth.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q5", "raj_3",
            "थार मरुस्थल में हवा की दिशा के समानांतर बनने वाले लंबे बालुका स्तूपों (Sand Dunes) को क्या कहा जाता है?",
            "Longitudinal sand dunes formed parallel to the prevailing wind direction in the Thar Desert are termed as:",
            listOf("बरखान", "सीफ / रेखीय बालुका स्तूप (Seif / Longitudinal Sand Dunes)", "पैराबोलिक", "तारा स्तूप"),
            listOf("Barkhan", "Seif / Longitudinal Dunes (अनुदैर्ध्य / सीफ बालुका स्तूप)", "Parabolic Dunes", "Star Dunes"),
            1,
            "पवन की दिशा के समानांतर बनने वाले रेखीय बालुका स्तूपों को 'अनुदैर्ध्य' या 'सीफ' (Seif) कहा जाता है। जबकि पवन की दिशा के लंबवत बनने वाले अर्धचंद्राकार गतिशील बालुका स्तूपों को 'बरखान' (Barchan) कहते हैं।",
            "Longitudinal dunes (Seif) align parallel to the wind, while crescent-shaped shifting dunes are called Barchans.",
            "Moderate"
        ),
        makeRajQ(
            "raj_3_m1_q6", "raj_3",
            "जैसलमेर में पोकरण से मोहनगढ़ के बीच 60 किमी लंबी भूगर्भीय मीठे जल की पट्टी (Subterranean Aquifer) को क्या कहा जाता है?",
            "The 60-km subterranean fresh water-bearing limestone belt between Pokhran and Mohangarh in Jaisalmer is known as:",
            listOf("आकल वुड पट्टी", "लाठी सीरीज (Lathi Series - Subterranean Sweet Water Aquifer)", "कुबड़ पट्टी", "नाहर पट्टी"),
            listOf("Akal Wood Belt", "Lathi Series (Subterranean Sweet Ground Water Belt rich in Sevan grass)", "Hump Belt", "Nahar Series"),
            1,
            "लाठी सीरीज जैसलमेर में पोकरण से मोहनगढ़ तक विस्तृत भूगर्भीय जल पट्टी है जहाँ प्रसिद्ध 'चांदन नलकूप' (थार का घड़ा) स्थित है तथा यहाँ पौष्टिक 'सेवण घास' (लसियुरुस सिंडिकस) बहुतायत में उगती है।",
            "The Lathi Series is a productive subterranean aquifer in Jaisalmer where nutrient-rich Sevan grass thrives.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q7", "raj_3",
            "जैसलमेर के चांदन गांव में स्थित नलकूप को अपने अत्यधिक मीठे और शीतल जल प्रवाह के कारण क्या कहा जाता है?",
            "Due to its perennial cold sweet water yield in the deep desert, the tube-well at Chandan village (Jaisalmer) is nicknamed:",
            listOf("रेगिस्तान का अमृत", "थार का घड़ा (Pitcher of the Thar / थार का घड़ा)", "मरुभूमि का मोती", "रेगिस्तान का झरना"),
            listOf("Amrit of Desert", "Pitcher of the Thar (Chandan Tubewell, Jaisalmer)", "Pearl of Marwar", "Desert Cascade"),
            1,
            "जैसलमेर के चांदन गांव में लाठी सीरीज पर स्थित चांदन नलकूप से वर्षभर मीठा व ठंडा जल मिलता है, इसलिए इसे 'थार का घड़ा' कहा जाता है।",
            "The Chandan tubewell in Jaisalmer provides sweet water in the heart of the desert, earning the moniker 'Pitcher of the Thar'.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q8", "raj_3",
            "जैसलमेर में 18 करोड़ वर्ष पुराने जुरासिक कालीन जीवाश्मों और लकड़ी के अवशेषों से युक्त 'आकल वुड फॉसिल पार्क' कहाँ स्थित है?",
            "Where is the famous 'Akal Wood Fossil Park'—housing 180-million-year-old petrified tree trunks from the Jurassic era—located?",
            listOf("बीकानेर", "आकल गांव, जैसलमेर (राष्ट्रीय मरु उद्यान - Akal Wood Fossil Park, Jaisalmer)", "बाड़मेर", "जोधपुर"),
            listOf("Bikaner", "Akal Village, Jaisalmer (National Desert Park - Jurassic fossils)", "Barmer", "Jodhpur"),
            1,
            "आकल वुड फॉसिल पार्क जैसलमेर के राष्ट्रीय मरु उद्यान में स्थित है। यहाँ 18 करोड़ वर्ष पुराने 25 विशाल काष्ठ जीवाश्म (Petrified Tree Trunks) सुरक्षित हैं जो जुरासिक काल में यहाँ घने वनों और समुद्र की उपस्थिति दर्शाते हैं।",
            "Akal Wood Fossil Park features fossilized tree trunks dating back to the Jurassic period, preserved in Jaisalmer.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q9", "raj_3",
            "नागौर और अजमेर के मध्य फ्लोराइडयुक्त भूमिगत जल के कारण लोगों की रीढ़ झुकने से इस क्षेत्र को क्या कहा जाता है?",
            "The geographical belt between Nagaur and Ajmer with excessive fluoride in groundwater causing fluorosis and hunchback posture is termed:",
            listOf("लाठी सीरीज", "बांका पट्टी / कुबड़ पट्टी (Hunchback Belt / Banka Patti)", "मगरा पट्टी", "उपरमाल पट्टी"),
            listOf("Lathi Series", "Banka Patti / Kubad Patti (Fluorosis Hunchback Belt between Nagaur and Ajmer)", "Magra Belt", "Uparmal Belt"),
            1,
            "नागौर और अजमेर के सीमावर्ती गांवों में भूमिगत जल में फ्लोराइड की मात्रा अत्यधिक होने के कारण फ्लोरोसिस रोग होता है जिससे दांत पीले और पीठ झुक जाती है। इसे 'कुबड़ पट्टी' या 'बांका पट्टी' कहा जाता है।",
            "The Kubad Patti (Hunchback Belt) between Nagaur and Ajmer has high fluoride levels in drinking water leading to skeletal fluorosis.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q10", "raj_3",
            "राजस्थान का सबसे ऊंचा पठार 'उड़िया का पठार' (Oriya Plateau, 1360 मीटर) किस जिले में स्थित है?",
            "Which is the highest plateau in Rajasthan, rising to an elevation of 1,360 meters just below Guru Shikhar in Sirohi district?",
            listOf("भोराट का पठार", "उड़िया का पठार (Oriya Plateau, Sirohi - 1360 m)", "उपरमाल का पठार", "मेसा का पठार"),
            listOf("Bhorat Plateau", "Oriya Plateau (Sirohi - highest in Rajasthan at 1360 m altitude)", "Uparmal Plateau", "Mesa Plateau"),
            1,
            "उड़िया का पठार (1360 मीटर) माउंट आबू (सिरोhi) में गुरुशिखर के ठीक नीचे स्थित राजस्थान का सबसे ऊंचा पठार है। (दूसरा ऊंचा आबू पठार 1200 मी, तीसरा भोराट पठार 1225 मी है)।",
            "Oriya Plateau in Sirohi district is the highest plateau tableland in Rajasthan at 1,360 m above sea level.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q11", "raj_3",
            "कुंभलगढ़ (राजसमंद) और गोगुंदा (उदयपुर) के मध्य स्थित प्रसिद्ध पठार को क्या कहा जाता है?",
            "The elevated plateau region lying between Kumbhalgarh (Rajsamand) and Gogunda (Udaipur) is historically called:",
            listOf("मेसा का पठार", "भोराट का पठार (Bhorat Plateau)", "उपरमाल का पठार", "लसाड़िया का पठार"),
            listOf("Mesa Plateau", "Bhorat Plateau (Between Kumbhalgarh and Gogunda)", "Uparmal Plateau", "Lasadiya Plateau"),
            1,
            "गोगुंदा (उदयपुर) से कुंभलगढ़ (राजसमंद) के बीच फैले 1225 मीटर ऊंचे पठारी क्षेत्र को 'भोराट का पठार' कहा जाता है। यह राजस्थान का प्रमुख जल विभाजक क्षेत्र है।",
            "The Bhorat Plateau lies between the hills of Gogunda and Kumbhalgarh, serving as an important drainage divide in south Rajasthan.",
            "Moderate"
        ),
        makeRajQ(
            "raj_3_m1_q12", "raj_3",
            "चित्तौड़गढ़ का ऐतिहासिक किला किस पठार पर समुद्र तल से 616 मीटर की ऊंचाई पर स्थित है?",
            "On which flat-topped tableland plateau is the historic Chittorgarh Fort situated at an elevation of 616 meters above sea level?",
            listOf("उड़िया पठार", "मेसा का पठार (Mesa Plateau, Chittorgarh)", "भोराट पठार", "हाड़ौती पठार"),
            listOf("Oriya Plateau", "Mesa Plateau (Mesa Ka Pathar, Chittorgarh)", "Bhorat Plateau", "Hadoti Plateau"),
            1,
            "चित्तौड़गढ़ दुर्ग गंभीरी और बेड़च नदियों के संगम के समीप 'मेसा के पठार' (ऊंचाई 616 मीटर) पर स्थित है। इसका निर्माण चित्रांगद मौर्य ने करवाया था।",
            "Chittorgarh Fort is perched atop the Mesa Plateau, overlooking the Gambhiri and Berach river basins.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q13", "raj_3",
            "राजस्थान में गर्मियों में चलने वाली अत्यधिक गर्म और शुष्क धूलभरी हवाओं को स्थानीय भाषा में क्या कहा जाता है?",
            "In Rajasthan, the extremely hot and dry dusty westerly winds blowing during May-June are locally called:",
            listOf("मावठ", "लू (Loo - scorching hot summer winds)", "पुरवइयां", "बबूflat"),
            listOf("Mawath", "Loo (Intense hot dry westerly winds causing heat stroke)", "Purvaiya", "Baboolya"),
            1,
            "थार मरुस्थल में मई-जून माह में चलने वाली अत्यंत तप्त व शुष्क पश्चिमी हवाओं को 'लू' कहा जाता है। जबकि आकस्मिक आने वाले धूलभरे भंवर को 'बबूल्या' (Bhaboolya) और सर्दियों की वर्षा को 'मावठ' कहते हैं।",
            "Loo is a strong, dusty, hot and dry summer wind from the west that blows across the plains of Rajasthan.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q14", "raj_3",
            "शीत ऋतु में पश्चिमी विक्षोभों (Mediterranean Western Disturbances) से राजस्थान में होने वाली वर्षा को क्या कहते हैं जो रबी की फसल हेतु 'गोल्डन ड्रॉप्स' मानी जाती है?",
            "The winter rainfall in Rajasthan caused by Mediterranean Western Disturbances, highly beneficial for Rabi wheat crops (Golden Drops), is termed:",
            listOf("लू", "मावठ (Mawath - Winter rainfall from Western Disturbances)", "आंधी", "बरखा"),
            listOf("Loo", "Mawath (Winter precipitation crucial for Rabi crops like wheat and mustard)", "Andhi", "Barkha"),
            1,
            "दिसंबर-जनवरी में भूमध्य सागर से उत्पन्न पश्चिमी विक्षोभों द्वारा राजस्थान के उत्तर-पश्चिमी भाग में होने वाली वर्षा को 'मावठ' कहते हैं। यह रबी फसलों (गेहूं, चना, सरसों) हेतु अमृत के समान होती है, इसलिए इसे 'गोल्डन ड्रॉप्स' (स्वर्ण बूंदें) कहा जाता है।",
            "Mawath refers to winter rainfall in northwestern India driven by western disturbances, essential for Rabi harvest.",
            "Easy"
        ),
        makeRajQ(
            "raj_3_m1_q15", "raj_3",
            "राजस्थान का सबसे अधिक वर्षा वाला स्थान 'माउंट आबू' (150 सेमी) तथा सबसे अधिक वर्षा वाला जिला कौन सा है?",
            "While Mount Abu is the wettest place in Rajasthan (150 cm rainfall), which is the wettest district receiving maximum annual rainfall (~100 cm)?",
            listOf("बांसवाड़ा", "झालावाड़ (Jhalawar - Highest average rainfall district ~100 cm)", "उदयपुर", "सिरोही"),
            listOf("Banswara", "Jhalawar (Highest rainfall district in Rajasthan)", "Udaipur", "Sirohi"),
            1,
            "राजस्थान में सर्वाधिक वर्षा वाला स्थान 'माउंट आबू' (सिरोही - 150 सेमी, राजस्थान का चेरापूंजी) है तथा सर्वाधिक वर्षा वाला जिला 'झालावाड़' (लगभग 100 सेमी, 40 दिन वर्षा) है। सबसे कम वर्षा वाला जिला जैसलमेर (10 सेमी) है।",
            "Jhalawar is Rajasthan's rainiest district, while Mount Abu is the single highest-precipitation locality.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + RajasthanQuestionHelper.generateTopicMocks("raj_3", 2, 5, baseQuestions)
    }
}
