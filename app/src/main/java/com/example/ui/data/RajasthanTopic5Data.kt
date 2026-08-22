package com.example.ui.data

import com.example.ui.data.RajasthanQuestionHelper.makeRajQ
import com.example.ui.model.GkQuestion

object RajasthanTopic5Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeRajQ(
            "raj_5_m1_q1", "raj_5",
            "राजस्थान में सर्वाधिक वन क्षेत्र (Maximum Forest Area in sq km) वाला जिला कौन सा है?",
            "According to the India State of Forest Report (ISFR), which district of Rajasthan records the highest geographical forest cover area?",
            listOf("अलवर", "उदयपुर (Udaipur - Highest forest area)", "प्रतापगढ़", "करौली"),
            listOf("Alwar", "Udaipur (Highest forest cover in sq km in Rajasthan)", "Pratapgarh", "Karauli"),
            1,
            "राजस्थान में सर्वाधिक वन क्षेत्र वाला जिला उदयपुर है, इसके बाद अलवर, प्रतापगढ़ और बारां आते हैं। जबकि प्रतिशत की दृष्टि से सर्वाधिक वन क्षेत्र उदयपुर (लगभग 23.49%) और प्रतापगढ़ में पाया जाता है। सबसे कम वन चूरू और हनुमानगढ़ में हैं।",
            "Udaipur holds the largest forest expanse in Rajasthan both in total square kilometers and high forest density.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q2", "raj_5",
            "राजस्थान का पहला राष्ट्रीय उद्यान 'रणथंभौर राष्ट्रीय उद्यान' (Ranthambore National Park, सवाई माधोपुर) को राष्ट्रीय उद्यान का दर्जा कब मिला?",
            "In which year was Ranthambore National Park (Sawai Madhopur)—famed as the tiger haven of Rajasthan—accorded National Park status?",
            listOf("1955", "1 नवंबर 1980 (1980 - First National Park / Tiger Reserve 1973-74)", "1985", "1991"),
            listOf("1955", "1 November 1980 (Designated Rajasthan's 1st National Park)", "1985", "1991"),
            1,
            "रणथंभौर को 1955 में वन्यजीव अभयारण्य, 1973-74 में राजस्थान का प्रथम टाइगर रिजर्व (प्रोजेक्ट टाइगर) और 1 नवंबर 1980 को राजस्थान का प्रथम राष्ट्रीय उद्यान घोषित किया गया। इसे 'बाघों का घर' (Home of Indian Tigers) कहा जाता है।",
            "Ranthambore was declared Rajasthan's first National Park in 1980 and is globally acclaimed for Bengal tiger conservation.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q3", "raj_5",
            "केवलादेव घना राष्ट्रीय उद्यान (Bharatpur) को यूनेस्को (UNESCO) द्वारा 'विश्व प्राकृतिक धरोहर स्थल' कब घोषित किया गया?",
            "In which year was Keoladeo Ghana National Park in Bharatpur inscribed as a UNESCO World Natural Heritage Site?",
            listOf("1973", "1985 (UNESCO World Heritage Site in 1985 & Ramsar Wetland 1981)", "1992", "2000"),
            listOf("1973", "1985 (Inscribed on UNESCO World Heritage List for avifaunal biodiversity)", "1992", "2000"),
            1,
            "भरतपुर स्थित केवलादेव घना पक्षी विहार को 1981 में रामसर आर्द्रभूमि (Ramsar Wetland Site) और 1985 में यूनेस्को द्वारा प्राकृतिक विश्व धरोहर स्थल का दर्जा दिया गया। प्रसिद्ध पक्षी विज्ञानी डॉ. सलीम अली की यह प्रमुख कार्यस्थली रही है।",
            "Keoladeo National Park was inscribed as a UNESCO World Heritage site in 1985, serving as winter refuge for migratory waterfowl.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q4", "raj_5",
            "उड़न गिलहरी (Flying Squirrel - Petaurista philippensis) और 'चौसिंगा' (घोटल) किस अभयारण्य का मुख्य आकर्षण हैं?",
            "The Giant Flying Squirrel and Four-Horned Antelope (Chousingha / Bhedal) are key flagship species of which wildlife sanctuary?",
            listOf("ताल छापर अभयारण्य", "सीतामाता वन्यजीव अभयारण्य (Sita Mata Sanctuary - Pratapgarh/Udaipur)", "कुंभलगढ़ अभयारण्य", "माउंट आबू अभयारण्य"),
            listOf("Tal Chhapar", "Sita Mata Wildlife Sanctuary (Pratapgarh - dense teak forests)", "Kumbhalgarh", "Mount Abu"),
            1,
            "प्रतापगढ़ और चित्तौड़गढ़-उदयपुर में विस्तृत सीतामाता वन्यजीव अभयारण्य में सागवान (Teak) और महुआ के घने वृक्षों पर 'उड़न गिलहरी' (रात में उड़ने वाली गिलहरी) पाई जाती है। यहाँ 'लव-कुश' नामक दो सदाबहार ठंडे-गर्म जलस्रोत भी हैं।",
            "Sita Mata Wildlife Sanctuary is famous for its nocturnal flying squirrel population and four-horned antelopes.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q5", "raj_5",
            "काले हिरणों (Blackbucks) और 'कुरंजा' पक्षियों के लिए राजस्थान का कौन सा अभयारण्य विश्व प्रसिद्ध है?",
            "Which sanctuary in Churu district is globally celebrated for hosting large thriving herds of Indian Blackbucks and migratory Demoiselle Cranes (Kuranja)?",
            listOf("राष्ट्रीय मरु उद्यान", "ताल छापर अभयारण्य, चूरू (Tal Chhapar Wildlife Sanctuary, Churu)", "सरिस्का अभयारण्य", "नाहरगढ़ अभयारण्य"),
            listOf("Desert National Park", "Tal Chhapar Sanctuary, Churu (Famous for Blackbuck & Machia grass)", "Sariska Sanctuary", "Nahargarh"),
            1,
            "चूरू जिले में स्थित ताल छापर अभयारण्य काले हिरणों की शरणस्थली है। यहाँ 'मोचिया साइप्रस' (माचिया घास) पाई जाती है जो काले हिरणों का प्रिय भोजन है। यहाँ प्रवासी कुरंजा पक्षी (Demoiselle Crane) भी बड़ी संख्या में आते हैं।",
            "Tal Chhapar Sanctuary in Churu is a pristine saline grassland sanctuary famed for hundreds of majestic blackbucks.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q6", "raj_5",
            "राजस्थान का क्षेत्रफल की दृष्टि से सबसे बड़ा वन्यजीव अभयारण्य कौन सा है जो 3162 वर्ग किमी में विस्तृत है?",
            "Which is the largest wildlife sanctuary by geographical area in Rajasthan (spanning 3,162 sq km across Jaisalmer and Barmer)?",
            listOf("सरिस्का अभयारण्य", "राष्ट्रीय मरु उद्यान (Desert National Park - Jaisalmer & Barmer)", "कुंभलगढ़ अभयारण्य", "कैलादेवी अभयारण्य"),
            listOf("Sariska Sanctuary", "Desert National Park (3162 sq km across Jaisalmer 1900 sq km & Barmer 1262 sq km)", "Kumbhalgarh Sanctuary", "Kailadevi Sanctuary"),
            1,
            "राष्ट्रीय मरु उद्यान (जैसलमेर 1900 वर्ग किमी + बाड़मेर 1262 वर्ग किमी = कुल 3162 वर्ग किमी) राजस्थान का सबसे बड़ा संरक्षित अभयारण्य है। यह राज्य पक्षी गोडावण, चिंकारा, मरु बिल्ली और आकल वुड फॉसिल्स हेतु प्रसिद्ध है।",
            "Desert National Park is the largest protected area in Rajasthan, preserving fragile Thar desert fauna.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q7", "raj_5",
            "राजस्थान का चौथा और देश का 52वां टाइगर रिजर्व 'रामगढ़ विषधारी टाइगर रिजर्व' (Ramgarh Vishdhari) किस जिले में अधिसूचित किया गया?",
            "In May 2022, 'Ramgarh Vishdhari Tiger Reserve' was notified as Rajasthan's 4th tiger reserve in which district?",
            listOf("सवाई माधोपुर", "बूंदी (Bundi district - 4th Tiger Reserve of Rajasthan)", "अलवर", "करौली"),
            listOf("Sawai Madhopur", "Bundi (Ramgarh Vishdhari Tiger Reserve, Bundi)", "Alwar", "Karauli"),
            1,
            "मई 2022 में बूंदी के रामगढ़ विषधारी को राजस्थान का चौथा टाइगर रिजर्व घोषित किया गया। इसके बाद 2023 में धौलपुर-करौली को राज्य का 5वां टाइगर रिजर्व बनाया गया है।",
            "Ramgarh Vishdhari in Bundi serves as an ecological tiger corridor between Ranthambore and Mukundra Hills.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q8", "raj_5",
            "मुकुंदरा हिल्स राष्ट्रीय उद्यान (Mukundra Hills National Park / दर्रा) किन जिलों में फैला है और इसे टाइगर रिजर्व कब बनाया गया?",
            "Across which Hadoti districts is Mukundra Hills (Darrah) National Park located, notified as Rajasthan's 3rd Tiger Reserve in 2013?",
            listOf("सवाई माधोपुर व टोंक", "कोटा, झालावाड़, बूंदी और चित्तौड़गढ़ (Kota, Jhalawar, Bundi & Chittorgarh)", "उदयपुर व सिरोही", "अलवर व जयपुर"),
            listOf("Sawai Madhopur & Tonk", "Kota, Jhalawar, Bundi and Chittorgarh (Mukundra Hills)", "Udaipur & Sirohi", "Alwar & Jaipur"),
            1,
            "मुकुंदरा हिल्स राष्ट्रीय उद्यान (2012 में राष्ट्रीय उद्यान, 2013 में राजस्थान का तीसरा टाइगर रिजर्व) कोटा-झालावाड़ क्षेत्र में स्थित है। यहाँ प्रसिद्ध 'गागरोनी तोता' (हीरामन तोता / अलेक्जेंड्रिन पैराकीट) और अबली मीणी का महल स्थित है।",
            "Mukundra Hills National Park forms a lush forested canyon belt in the Hadoti terrain.",
            "Moderate"
        ),
        makeRajQ(
            "raj_5_m1_q9", "raj_5",
            "जंगली मुर्गों (Grey Junglefowl) और डिकिल्पटेरा आबूएंसिस (दुर्लभ वनस्पति) के लिए कौन सा अभयारण्य जाना जाता है?",
            "Which sanctuary located at high altitude in Sirohi district is renowned for wild Grey Junglefowl and the endemic Strobilanthes/Dicliptera flora?",
            listOf("कुंभलगढ़ अभयारण्य", "माउंट आबू वन्यजीव अभयारण्य, सिरोही (Mount Abu Wildlife Sanctuary)", "फुलवारी की नाल", "रावली टॉडगढ़"),
            listOf("Kumbhalgarh Sanctuary", "Mount Abu Sanctuary (Sirohi - Wild Green/Grey Fowl & Carvia callosa)", "Phulwari Ki Nal", "Rawli Todgarh"),
            1,
            "माउंट आबू वन्यजीव अभयारण्य (सिरोही) राज्य का सबसे ऊंचा अभयारण्य है। यह 'जंगली मुर्गों' (Grey Junglefowl) तथा सुंदर औषधीय वनस्पति 'डिकिल्पटेरा आबूएंसिस' के लिए प्रसिद्ध है।",
            "Mount Abu Wildlife Sanctuary offers refuge to wild fowl and rich sub-tropical hill forest vegetation.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q10", "raj_5",
            "राजस्थान में 'धौक' / 'धौकड़ा' (Anogeissus pendula) वनों का विस्तार कुल वन क्षेत्र के लगभग कितने प्रतिशत भाग पर है?",
            "Dhok / Dhokra trees (Anogeissus pendula) dominate Rajasthan's dry deciduous forests, covering approximately what percentage of forest area?",
            listOf("20%", "58% से 60% (Covers ~58-60% of total forest vegetation)", "35%", "80%"),
            listOf("20%", "58% to 60% (Most widely distributed tree species across Aravalli hills)", "35%", "80%"),
            1,
            "राजस्थान के शुष्क पर्णपाती वनों में 'धौकड़ा' (Anogeissus pendula) सबसे प्रमुख वृक्ष प्रजाति है जो राज्य के लगभग 58% से 60% वन क्षेत्र में विस्तृत है। यह अरावली की पथरीली ढलानों पर सघन रूप से पाया जाता है।",
            "Dhok (Anogeissus pendula) forms the primary biomass in Rajasthan's dry deciduous hill forest ecosystems.",
            "Moderate"
        ),
        makeRajQ(
            "raj_5_m1_q11", "raj_5",
            "राजस्थान की 'खेजड़ी' (Khejri) के वृक्ष पर लगने वाले फल को क्या कहा जाता है जिसकी प्रसिद्ध सब्जी बनाई जाती है?",
            "What is the local culinary name for the protein-rich green edible pod of the Khejri tree (Prosopis cineraria)?",
            listOf("केर", "सांगरी (Sangri - edible pod of Khejri / dry desert delicacy)", "काचरी", "कुमटिया"),
            listOf("Ker", "Sangri (Dried or fresh Khejri pods used in Panchkuta delicacy)", "Kachri", "Kumatiya"),
            1,
            "खेजड़ी के फल को 'सांगरी' (सूखने पर 'खोखा') कहा जाता है जो राजस्थानी पंचकुटा सब्जी का मुख्य घटक है। खेजड़ी के पत्तों को 'लूम' कहते हैं जो बकरियों और ऊंटों का मुख्य चारा है।",
            "Sangri is the traditional green pod harvest of the desert Khejri tree, celebrated in authentic Rajasthani cuisine.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q12", "raj_5",
            "उदयपुर जिले में कोटड़ा तहसील के पास मानसी-वाकल नदियों के उद्गम स्थल पर कौन सा अभयारण्य स्थित है?",
            "Which sanctuary in Udaipur district encompasses the origin catchment of Mansi and Wakal rivers, declared a protected area in 1983?",
            listOf("जयसमंद अभयारण्य", "फुलवारी की नाल अभयारण्य (Phulwari Ki Nal Wildlife Sanctuary, Udaipur)", "सज्जनगढ़ अभयारण्य", "बस्सी अभयारण्य"),
            listOf("Jaisamand Sanctuary", "Phulwari Ki Nal Wildlife Sanctuary (Udaipur - Kotra / Mansi-Wakal origin)", "Sajjangarh Sanctuary", "Bassi Sanctuary"),
            1,
            "फुलवारी की नाल अभयारण्य (उदयपुर) से मानसी, वाकल और सोम नदियां निकलती हैं। यह आदिवासी अंचल में सघन वनस्पति व वन्यजीवों का सुंदर प्राकृतिक आवास है। यहाँ राज्य का पहला 'ह्यूमन एनाटॉमी पार्क' भी स्थापित है।",
            "Phulwari Ki Nal Sanctuary in Udaipur encompasses the headwaters of the Mansi and Wakal river systems.",
            "Moderate"
        ),
        makeRajQ(
            "raj_5_m1_q13", "raj_5",
            "हरे कबूतरों (Green Pigeons / हरियल) के लिए राजस्थान का कौन सा अभयारण्य प्रसिद्ध है?",
            "Which wildlife sanctuary in Alwar district is famed for the unique sightings of yellow-footed green pigeons (Hariyal)?",
            listOf("रणथंभौर अभयारण्य", "सरिस्का वन्यजीव अभयारण्य, अलवर (Sariska Tiger Reserve & Sanctuary)", "केवलादेव राष्ट्रीय उद्यान", "ताल छापर"),
            listOf("Ranthambore", "Sariska Sanctuary, Alwar (Famous for Green Pigeons & Nilgai herds)", "Keoladeo Ghana", "Tal Chhapar"),
            1,
            "अलवर का सरिस्का अभयारण्य (1978-79 में दूसरा टाइगर रिजर्व) हरे कबूतरों (हरियल पक्षी) तथा पांडुपोल हनुमान जी, नीलकंठ महादेव और भर्तृहरि तपोभूमि हेतु प्रसिद्ध है।",
            "Sariska in Alwar is famous for its healthy habitat of green pigeons nesting among old Dhok trees.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q14", "raj_5",
            "राजस्थान में 'घास के मैदानों' (Bir / Oran) में पाई जाने वाली सबसे पौष्टिक और दुधारू पशुओं हेतु सर्वोत्तम घास कौन सी है?",
            "Which protein-rich perennial desert grass (Lasiurus scindicus) growing abundantly in the Lathi series of Jaisalmer is considered superior forage for desert cattle?",
            listOf("माचिया घास", "सेवण घास / लसियुरुस सिंडिकस (Sevan Grass - Lasiurus scindicus)", "धामण घास", "करड़ घास"),
            listOf("Machia grass", "Sevan Grass (Lasiurus scindicus - highly nutritious Thar pasture grass)", "Dhaman grass", "Karanj"),
            1,
            "सेवण घास (वैज्ञानिक नाम: Lasiurus scindicus, स्थानीय नाम: लीलण) जैसलमेर की लाठी सीरीज में 60 किमी की पट्टी में प्राकृतिक रूप से उगती है। यह गोडावण का मुख्य प्रजनन स्थल और मरुस्थलीय गायों (राठी, थारपारकर) हेतु सर्वोत्तम प्रोटीनयुक्त चारा है।",
            "Sevan grass thrives in western Thar, providing essential nesting pasture for the Great Indian Bustard.",
            "Easy"
        ),
        makeRajQ(
            "raj_5_m1_q15", "raj_5",
            "राजस्थान का राज्य पुष्प 'रोहिड़ा' (Rohida - Tecomella undulata) को 'मरुशोभा' / 'रेगिस्तान का सागवान' कहा जाता है। इसे राज्य पुष्प कब घोषित किया गया?",
            "In which year was 'Rohida' (Tecomella undulata)—known as the Desert Teak or Marwar Shobha with its fiery orange-yellow blossoms—declared the State Flower of Rajasthan?",
            listOf("1971", "31 अक्टूबर 1983 (1983 - State Flower: Rohida)", "1991", "2001"),
            listOf("1971", "31 October 1983 (Declared State Flower along with Khejri as State Tree)", "1991", "2001"),
            1,
            "31 अक्टूबर 1983 को रोहिड़ा (Tecomella undulata) को राजस्थान का राज्य पुष्प घोषित किया गया। इसके चमकीले नारंगी-लाल फूलों को 'मरुस्थल का सागवान', 'रेगिस्तान की मरुशोभा' और 'मारवाड़ टीक' कहा जाता है।",
            "Rohida was designated Rajasthan's State Flower in 1983, celebrated for durable timber and desert blooms.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + RajasthanQuestionHelper.generateTopicMocks("raj_5", 2, 5, baseQuestions)
    }
}
