package com.example.ui.data

import com.example.ui.data.RajasthanQuestionHelper.makeRajQ
import com.example.ui.model.GkQuestion

object RajasthanTopic6Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeRajQ(
            "raj_6_m1_q1", "raj_6",
            "राजस्थान को खनिजों की विविधता के कारण किस उपनाम से जाना जाता है?",
            "Due to its extraordinary geological diversity of having over 80 varieties of minerals, Rajasthan is acclaimed as:",
            listOf("रत्न नगरी", "खनिजों का अजायबघर (Museum of Minerals)", "धातु प्रदेश", "स्वर्ण भूमि"),
            listOf("Gem City", "Museum of Minerals (Repository of ~82 major and minor minerals)", "Metal State", "Land of Gold"),
            1,
            "राजस्थान में लगभग 82 प्रकार के विभिन्न खनिज पाए जाते हैं जिनमें से 57 खनिजों का व्यावसायिक खनन होता है। इस अपार भूगर्भीय विविधता के कारण राजस्थान को 'खनिजों का अजायबघर' (Museum of Minerals) कहा जाता है।",
            "Rajasthan produces 57 major & minor minerals out of 82 available types, earning the moniker 'Museum of Minerals'.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q2", "raj_6",
            "राजस्थान का भारत में किन खनिजों के उत्पादन में लगभग शत-प्रतिशत एकाधिकार (Sole Monopoly / 100% Production) है?",
            "In the production of which minerals does Rajasthan hold a near 100% complete national monopoly in India?",
            listOf("लोहा और कोयला", "वोलास्टोनाइट, जास्पर और सीसा-जस्ता (Wollastonite, Jasper, Lead-Zinc & Selenite)", "बॉक्साइट और तांबा", "सोना और यूरेनियम"),
            listOf("Iron and Coal", "Wollastonite, Jasper, Selenite, and Lead-Zinc concentrates", "Bauxite and Copper", "Gold and Uranium"),
            1,
            "राजस्थान वोलास्टोनाइट (100%), जास्पर (100%), सेलेनाइट (100%), सीसा-जस्ता अयस्क (99%), जिप्सम (93%) और कैल्साइट में देश में लगभग एकाधिकार रखता है।",
            "Rajasthan is the sole producer of Wollastonite and Jasper and leads India in Zinc, Lead, and Selenite output.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q3", "raj_6",
            "राजस्थान में 'हिंदुस्तान जिंक लिमिटेड' (HZL) का विश्व प्रसिद्ध सीसा-जस्ता (Lead-Zinc) खनन परिसर कहाँ स्थित है जिसकी शुरुआत 14वीं सदी में राणा लाखा के काल में हुई थी?",
            "Where is the legendary Lead-Zinc-Silver mine of Hindustan Zinc Limited located in Udaipur, discovered originally during Maharana Lakha's reign?",
            listOf("खेतड़ी", "जावर माइंस, उदयपुर (Zawar Mines, Udaipur - Zinc, Lead & Silver)", "नीम का थाना", "रामपुरा आगुचा"),
            listOf("Khetri", "Zawar Mines (Udaipur - Ancient silver-zinc smelting heritage since 14th century)", "Neem Ka Thana", "Rampura Agucha"),
            1,
            "उदयपुर की जावर माइंस विश्व की सबसे प्राचीन जस्ता-चांदी प्रगलन (Smelting) खदानों में से एक है। 14वीं शताब्दी में महाराणा लाखा के समय यहाँ चांदी की खान निकली थी। भीलवाड़ा का 'रामपुरा आगुचा' विश्व की सबसे बड़ी ओपन-कास्ट सीसा-जस्ता खान है।",
            "Zawar in Udaipur is historically renowned for ancient zinc retorting metallurgy dating back to medieval Mewar.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q4", "raj_6",
            "राजस्थान की 'ताम्र नगरी' (Copper Capital) किसे कहा जाता है जहाँ 'हिंदुस्तान कॉपर लिमिटेड' (HCL) का उपक्रम स्थित है?",
            "Which historic town in Neem Ka Thana/Jhunjhunu district is acclaimed as the 'Copper Capital' of India, housing Hindustan Copper Limited?",
            listOf("मकराना", "खेतड़ी (Khetri Copper Complex, Neem Ka Thana / Jhunjhunu)", "डेगाना", "खो-दरीबा"),
            listOf("Makrana", "Khetri (Khetri Nagar - Historic Copper mining belt)", "Degana", "Kho-Dariba"),
            1,
            "खेतड़ी (नीम का थाना / झुंझुनू) सिंधु घाटी सभ्यता के समय से ही तांबा खनन का प्रमुख केंद्र रहा है (गणेश्वर सभ्यता को ताम्रवती संस्कृति की जननी कहते हैं)। 1967 में यहाँ हिंदुस्तान कॉपर लिमिटेड (HCL) द्वारा खेतड़ी कॉपर प्रोजेक्ट स्थापित किया गया।",
            "Khetri is India's prime historical copper ore hub with roots tracing back to chalcolithic proto-history.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q5", "raj_6",
            "भारत का एकमात्र 'टंगस्टन' (Tungsten - Wolframite) उत्पादक प्रमुख क्षेत्र 'रेवंत पहाड़ी' (डेगाना) किस जिले में स्थित है?",
            "The famous 'Revant Hill' (Degana), recognized as India's prominent indigenous deposit of high-grade Tungsten ore (Wolframite), is in which district?",
            listOf("जैसलमेर", "नागौर (Degana - Revant Hill, Nagaur district)", "सीकर", "पाली"),
            listOf("Jaisalmer", "Nagaur (Degana - Revant Hill Tungsten Deposits)", "Sikar", "Pali"),
            1,
            "नागौर जिले के डेगाना में स्थित रेवंत पहाड़ी भारत में टंगस्टन (वुल्फ्रेमाइट) की सबसे प्रसिद्ध खान है। इसके अलावा सिरोही के 'बालदा' व 'आबू-रेवदर' क्षेत्र में भी टंगस्टन पाया जाता है। टंगस्टन का गलनांक (3422°C) अत्यधिक उच्च होता है और यह विद्युत बल्ब फिलामेंट में प्रयुक्त होता है।",
            "Degana in Nagaur is celebrated for wolframite tungsten ore, crucial for incandescent filaments and defense alloys.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q6", "raj_6",
            "राजस्थान का बाड़मेर-सांचौर बेसिन (Barmer-Sanchore Basin) किस प्रमुख खनिज संसाधन के विशाल भंडार हेतु विश्व मानचित्र पर उभरा है?",
            "The Barmer-Sanchore sedimentary basin in western Rajasthan has gained international significance for immense deposits of:",
            listOf("लोहा अयस्क", "कच्चा खनिज तेल / पेट्रोलियम और प्राकृतिक गैस (Crude Petroleum Oil & Natural Gas - Mangala, Bhagyam, Aishwarya)", "सोना", "बॉक्साइट"),
            listOf("Iron Ore", "Crude Mineral Oil / Petroleum & Natural Gas (Mangala, Bhagyam, Aishwarya, Saraswati oilfields)", "Gold", "Bauxite"),
            1,
            "बाड़मेर में 29 अगस्त 2009 को 'मंगला तेल क्षेत्र' (Mangala Oil Field, बायतु-गुढ़ा) से केयर्न वेदांता द्वारा वाणिज्यिक कच्चा तेल उत्पादन शुरू किया गया। बाड़मेर-सांचौर बेसिन में मंगला, भाग्यम, ऐश्वर्या, सरस्वती, कामेश्वरी और रागेश्वरी प्रमुख तेल व गैस कुएं हैं।",
            "The Barmer-Sanchore basin produces over 20% of India's domestic onshore crude oil output.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q7", "raj_6",
            "राजस्थान की पहली अत्याधुनिक 'पेट्रोलियम रिफाइनरी सह पेट्रोकेमिकल कॉम्प्लेक्स' (HPCL Rajasthan Refinery Ltd - 9 MMTPA) कहाँ स्थापित की जा रही है?",
            "Where is Rajasthan's state-of-the-art 9 MMTPA Petroleum Refinery cum Petrochemical Complex (HPCL : GoR = 74:26) being constructed?",
            listOf("जैसलमेर", "पचपदरा, बालोतरा / बाड़मेर (Pachpadra, Balotra district)", "बीकानेर", "जोधपुर"),
            listOf("Jaisalmer", "Pachpadra (Balotra / Barmer district - Joint venture of HPCL and Govt of Rajasthan)", "Bikaner", "Jodhpur"),
            1,
            "पचपदरा (बालोतरा) में 9 MMTPA क्षमता की देश की पहली BS-VI मानक युक्त रिफाइनरी सह पेट्रोकेमिकल संकुल स्थापित किया जा रहा है। यह एचपीसीएल (74%) और राजस्थान सरकार (26%) का संयुक्त उपक्रम है।",
            "The Pachpadra Refinery in Balotra is India's first integrated refinery producing petrochemical feedstocks compliant with BS-VI norms.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q8", "raj_6",
            "राजस्थान का मकराना (डीडवाना-कुचामन / नागौर) किस विश्व विख्यात सफेद पत्थर के लिए प्रसिद्ध है जिससे आगरा का ताजमहल और कोलकाता का विक्टोरिया मेमोरियल निर्मित है?",
            "Makrana is globally acclaimed for which pristine white metamorphic building stone used in constructing the Taj Mahal and Victoria Memorial?",
            listOf("सफेद ग्रेनाइट", "सफेद मकराना संगमरमर / मार्बल (Calcitic White Makrana Marble)", "सफेद बलुआ पत्थर", "क्वार्ट्ज"),
            listOf("White Granite", "Pristine Calcitic White Makrana Marble (GI Tagged Stone)", "White Sandstone", "Quartzite"),
            1,
            "मकराना का सफेद कैल्साइट संगमरमर (White Makrana Marble) 98% से अधिक शुद्ध कैल्शियम कार्बोनेट से युक्त होता है, जो सदियों तक पीला नहीं पड़ता। इसी से विश्व प्रसिद्ध ताजमहल, शेख जायद मस्जिद (अबू धाबी) और विक्टोरिया मेमोरियल (कोलकाता) बने हैं। इसे GI टैग प्राप्त है।",
            "Makrana marble is a world heritage building stone known for its crystalline purity and luster.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q9", "raj_6",
            "राजस्थान में 'पन्ना' (Emerald - हरे रंग का रत्न / हरि अग्नि) की पेटी किन जिलों के मध्य 'एमराल्ड बेल्ट' (Emerald Belt) के रूप में फैली है?",
            "The famous 221-km 'Emerald Belt' (producing dazzling green emeralds / Hari Agni) in Rajasthan stretches between which districts?",
            listOf("अलवर से भरतपुर", "कालागुमान (राजसमंद) से गोगुंदा व अजमेर (बुबानी) तक (Kalaguman, Rajsamand to Gogunda & Ajmer)", "बीकानेर से गंगानगर", "कोटा से झालावाड़"),
            listOf("Alwar to Bharatpur", "Kalaguman (Rajsamand) to Gogunda (Udaipur) and Bubani (Ajmer) - Emerald Belt", "Bikaner to Ganganagar", "Kota to Jhalawar"),
            1,
            "1943 में राजसमंद के 'कालागुमान' में पहली बार पन्ना (Emerald / हरी अग्नि) की खोज हुई थी। यह बेल्ट कालागुमान (राजसमंद), गोगुंदा (उदयपुर) से लेकर बुबानी-टिक्की (अजमेर) तक 221 किमी में फैली है।",
            "Rajasthan's Emerald Belt is a world-class source of precious green beryl (emerald) gems.",
            "Moderate"
        ),
        makeRajQ(
            "raj_6_m1_q10", "raj_6",
            "सीकर जिले का 'रोहिल' (खंडेला) और उदयपुर का 'उमरा' किस महत्वपूर्ण आणविक/परमाणु खनिज (Nuclear Mineral) के भंडार हेतु चर्चा में रहे हैं?",
            "Rohil in Khandela (Sikar district) and Umra in Udaipur are strategically renowned for substantial geological reserves of which radioactive nuclear mineral?",
            listOf("थोरियम", "यूरेनियम (Uranium ore reserves - Rohil Khandela, Sikar & Umra Udaipur)", "प्लूटोनियम", "टंगस्टन"),
            listOf("Thorium", "Uranium (Strategic nuclear fuel reserves discovered at Rohil, Sikar)", "Plutonium", "Tungsten"),
            1,
            "सीकर जिले के खंडेला के निकट 'रोहिल' गांव में यूरेनियम कॉरपोरेशन ऑफ इंडिया (UCIL) द्वारा यूरेनियम के लगभग 12 मिलियन टन के विशाल भंडार खोजे गए हैं। झारखंड (जादुगुड़ा) और आंध्र प्रदेश (तुमलपल्ले) के बाद यह भारत का तीसरा बड़ा यूरेनियम खनन क्षेत्र बन रहा है।",
            "Rohil in Sikar is developing as one of India's major indigenous uranium mining complexes.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q11", "raj_6",
            "राजस्थान को 'सीमेंट का घर' कहा जाता है। राजस्थान में पहली सीमेंट फैक्ट्री 1915 में 'क्लिक निक्सन कंपनी' द्वारा कहाँ स्थापित की गई थी?",
            "Where was Rajasthan's very first cement factory established in 1915 by the Click Nixon Company (ACC)?",
            listOf("चित्तौड़गढ़", "लाखेरी, बूंदी (Lakheri, Bundi district - 1915 AD)", "सवाई माधोपुर", "ब्यावर"),
            listOf("Chittorgarh", "Lakheri, Bundi (1915 - Rajasthan's 1st Portland cement plant)", "Sawai Madhopur", "Beawar"),
            1,
            "1915 ई. में बूंदी के 'लाखेरी' में राजस्थान का पहला सीमेंट कारखाना स्थापित हुआ जिसने 1917 में उत्पादन शुरू किया। वर्तमान में चित्तौड़गढ़ जिला उच्च श्रेणी के चूना पत्थर (Limestone) के कारण 'सीमेंट का मैनचेस्टर' / राजधानी कहलाता है।",
            "Lakheri in Bundi pioneered modern cement manufacturing in Rajasthan in 1915.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q12", "raj_6",
            "राजस्थान की 'वस्त्र नगरी' (Textile City) और 'राजस्थान का मैनचेस्टर' किसे कहा जाता है?",
            "Which industrial city is celebrated as the 'Textile City of India' and the 'Manchester of Rajasthan'?",
            listOf("जयपुर", "भीलवाड़ा (Bhilwara - Textile City / Manchester of Rajasthan / Apparel City)", "सूरतगढ़", "पाली"),
            listOf("Jaipur", "Bhilwara (Celebrated as the textile hub, fabric weaving & denim cluster)", "Suratgarh", "Pali"),
            1,
            "भीलवाड़ा को वस्त्र निर्माण, कताई मिलों और डेनिम/सूटिंग उत्पादन के कारण 'राजस्थान का मैनचेस्टर' और 'टेक्सटाइल सिटी' कहा जाता है। 2009 में केंद्र सरकार ने इसे 'वस्त्र निर्यात नगर' (Town of Export Excellence) का दर्जा दिया।",
            "Bhilwara is recognized across India as a major synthetic fabric and denim manufacturing center.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q13", "raj_6",
            "राजस्थान का पहला सुपर थर्मल पावर प्लांट 'सूरतगढ़ सुपर थर्मल पावर स्टेशन' (Suratgarh STPS) किस जिले में स्थित है जिसे 'राजस्थान का आधुनिक विकास तीर्थ' कहते हैं?",
            "Where is Rajasthan's first and largest Super Thermal Power Station (Suratgarh STPS, 2820 MW)—hailed as the Modern Pilgrimage of Development—situated?",
            listOf("कोटा", "श्रीगंगानगर (Suratgarh, Sri Ganganagar district)", "बाड़मेर", "झालावाड़"),
            listOf("Kota", "Suratgarh, Sri Ganganagar (Suratgarh Super Thermal Power Station)", "Barmer", "Jhalawar"),
            1,
            "सूरतगढ़ (श्रीगंगानगर) में 2820 मेगावाट क्षमता का सुपर क्रिटिकल थर्मल पावर प्लांट स्थित है। इसे राजस्थान का प्रथम सुपर थर्मल पावर प्लांट और 'आधुनिक विकास का तीर्थ' कहा जाता है। (छबड़ा बारां दूसरा बड़ा सुपर थर्मल प्लांट है)।",
            "Suratgarh STPS in Ganganagar is a flagship coal-based power station in northwest Rajasthan.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q14", "raj_6",
            "विश्व का सबसे बड़ा 'सोलर पार्क' (Solar Park) 2245 मेगावाट क्षमता के साथ राजस्थान के किस मरुस्थलीय जिले में स्थापित किया गया है?",
            "Which is one of the world's largest operational solar power parks with an installed capacity of 2,245 MW, located in Jodhpur district?",
            listOf("नोख सोलर पार्क (जैसलमेर)", "भड़ला सोलर पार्क, जोधपुर (Bhadla Solar Park, Phalodi / Jodhpur - 2245 MW)", "फतेहगढ़ सोलर पार्क", "धुसर सोलर पार्क"),
            listOf("Nokh Solar Park", "Bhadla Solar Park (Phalodi / Jodhpur - 2,245 MW clean energy park)", "Fatehgarh Solar Park", "Dhusar Solar Park"),
            1,
            "जोधपुर (फलोदी) के भड़ला में 14,000 एकड़ बंजर भूमि पर 2245 मेगावाट का 'भड़ला सोलर पार्क' 4 चरणों में विकसित किया गया है। अत्यधिक सौर विकिरण (Solar Insolation) के कारण राजस्थान देश में सौर ऊर्जा उत्पादन में प्रथम स्थान पर है।",
            "Bhadla Solar Park in Jodhpur/Phalodi is a global benchmark in renewable mega-solar photovoltaic infrastructure.",
            "Easy"
        ),
        makeRajQ(
            "raj_6_m1_q15", "raj_6",
            "राजस्थान का एकमात्र परमाणु ऊर्जा संयंत्र 'रावतभाटा परमाणु ऊर्जा स्टेशन' (RAPS) कनाडा के सहयोग से 1973 में किस जिले में स्थापित किया गया था?",
            "In which district is Rajasthan's sole nuclear power station, Rajasthan Atomic Power Station (RAPS, Rawatbhata), established with Canadian collaboration in 1973?",
            listOf("कोटा", "चित्तौड़गढ़ (Rawatbhata, Chittorgarh district - Heavy Water CANDU Reactor)", "बांसवाड़ा", "उदयपुर"),
            listOf("Kota", "Rawatbhata, Chittorgarh (India's first pressurized heavy water reactor CANDU type)", "Banswara", "Udaipur"),
            1,
            "रावतभाटा (चित्तौड़गढ़) में चंबल नदी के राणा प्रताप सागर बांध के किनारे 1973 में कनाडा के सहयोग से भारत का दूसरा (तारापुर के बाद) तथा राजस्थान का प्रथम परमाणु बिजलीघर स्थापित हुआ। यहाँ भारी जल (D2O) संयंत्र भी कार्यरत है।",
            "Rawatbhata in Chittorgarh operates Pressurized Heavy Water Reactors (PHWR) providing baseload clean power.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + RajasthanQuestionHelper.generateTopicMocks("raj_6", 2, 5, baseQuestions)
    }
}
