package com.example.ui.data

import com.example.ui.data.EconomyQuestionHelper.makeEconomyQ
import com.example.ui.model.GkQuestion

object EconomyTopic10ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions) - सौर ऊर्जा, गति शक्ति, पोषण, शिक्षा, स्वास्थ्य एवं आधुनिक सामाजिक योजनाएं
        // ==========================================
        makeEconomyQ(
            "eco_10_m6_q1", "eco_10",
            "फरवरी 2024 में शुरू की गई 'पीएम सूर्य घर: मुफ्त बिजली योजना' (PM Surya Ghar: Muft Bijli Yojana) के तहत 1 करोड़ परिवारों को हर महीने कितने यूनिट तक मुफ्त सौर बिजली देने का लक्ष्य है?",
            "Under the 'PM Surya Ghar: Muft Bijli Yojana' launched in February 2024 with an outlay of ₹75,000 Crore, how many units of free solar rooftop electricity are targeted per month for 1 crore households?",
            listOf("100 यूनिट प्रतिमाह", "300 यूनिट प्रतिमाह (Up to 300 units of free electricity per month / ₹78,000 तक की केंद्रीय सब्सिडी)", "200 यूनिट प्रतिमाह", "500 यूनिट प्रतिमाह"),
            listOf("100 units/month", "300 units/month (Targeting 1 Crore households with up to 300 units free monthly solar power and direct capital subsidies up to ₹78,000)", "200 units/month", "500 units/month"),
            1,
            "'पीएम सूर्य घर: मुफ्त बिजली योजना' 13 फरवरी 2024 को प्रधानमंत्री द्वारा ₹75,021 करोड़ के बजट के साथ शुरू की गई। इसका उद्देश्य 1 करोड़ घरों की छतों पर रूफटॉप सोलर सिस्टम लगाना है, जिससे परिवारों को हर महीने 300 यूनिट तक मुफ्त बिजली मिलेगी और ग्रिड को अतिरिक्त बिजली बेचकर वे प्रति वर्ष ₹15,000 तक कमा सकेंगे।",
            "PM Surya Ghar scheme combines renewable energy transition with household utility bill savings.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q2", "eco_10",
            "भारत में बुनियादी ढांचा परियोजनाओं के समन्वित नियोजन, लॉजिस्टिक्स लागत घटाने और मल्टी-मॉडल कनेक्टिविटी हेतु 13 अक्टूबर 2021 को कौन-सा राष्ट्रीय मास्टर प्लान शुरू किया गया?",
            "Which transformative digital platform was launched on 13 October 2021 for integrated multimodal connectivity planning across 16 infrastructure ministries?",
            listOf("भारतमाला परियोजना", "पीएम गति शक्ति राष्ट्रीय मास्टर प्लान (PM GatiShakti National Master Plan / 16 Ministries GIS-based integrated digital platform / ₹100 Lakh Crore)", "सागरमाला परियोजना", "राष्ट्रीय मुद्रीकरण पाइपलाइन (NMP)"),
            listOf("Bharatmala Pariyojana", "PM GatiShakti National Master Plan (A mega GIS-based spatial planning portal integrating railways, highways, ports, airports, mass transport, water and logistics infrastructure)", "Sagarmala Pariyojana", "National Monetisation Pipeline"),
            1,
            "'पीएम गति शक्ति राष्ट्रीय मास्टर प्लान' 13 अक्टूबर 2021 को ₹100 लाख करोड़ के बुनियादी ढांचे के एकीकृत विकास के लिए शुरू किया गया। यह 16 मंत्रालयों (रेल, सड़क, पोत, विमानन, पेट्रोलियम, दूरसंचार आदि) के डेटा को एक डिजिटल जीआईएस (GIS) प्लेटफॉर्म पर एकीकृत करता है ताकि विभागों के बीच तालमेल की कमी से सड़कों की बार-बार खुदाई और देरी न हो।",
            "PM GatiShakti serves as India's technological engine to lower logistics costs from ~13% of GDP toward global benchmarks.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q3", "eco_10",
            "रासायनिक उर्वरकों के संतुलित उपयोग को बढ़ावा देने और वैकल्पिक जैविक/प्राकृतिक उर्वरकों को प्रोत्साहित करने हेतु केंद्रीय बजट 2023-24 में घोषित योजना कौन-सी है?",
            "Which national initiative was announced in Budget 2023-24 to incentivize States to promote alternative bio-fertilizers and reduce excessive chemical fertilizer consumption?",
            listOf("परंपरागत कृषि विकास योजना", "पीएम-प्रणाम योजना (PM-PRANAM - PM Programme for Restoration, Awareness, Nourishment and Amelioration of Mother Earth)", "मृदा स्वास्थ्य कार्ड योजना", "पीएम कुसुम योजना"),
            listOf("Paramparagat Krishi Vikas Yojana", "PM-PRANAM (Programme for Restoration, Awareness, Nourishment and Amelioration of Mother Earth - Sharing 50% fertilizer subsidy savings with performing States)", "Soil Health Card Scheme", "PM KUSUM Scheme"),
            1,
            "'पीएम-प्रणाम' (PM-PRANAM - Programme for Restoration, Awareness, Nourishment and Amelioration of Mother Earth) योजना का मुख्य उद्देश्य रासायनिक उर्वरकों (यूरिया, डीएपी) के अत्यधिक उपयोग को कम करना है। इसके तहत केंद्र सरकार द्वारा रासायनिक उर्वरक सब्सिडी में जो बचत होगी, उसका 50% हिस्सा संबंधित राज्य को अनुदान के रूप में दिया जाएगा।",
            "PM-PRANAM promotes sustainable soil chemistry and curbs excessive fiscal burdens of chemical fertilizer subsidies.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q4", "eco_10",
            "किसानों को सिंचाई के लिए सौर ऊर्जा पंप स्थापित करने और बंजर भूमि पर सौर संयंत्र लगाकर ग्रिड को बिजली बेचकर अतिरिक्त आय कमाने हेतु शुरू की गई योजना कौन-सी है?",
            "Which flagship solar scheme launched by the Ministry of New and Renewable Energy in 2019 enables farmers to install solar water pumps and grid-connected solar power plants?",
            listOf("सौर सुजला योजना", "पीएम कुसुम योजना (PM-KUSUM - Pradhan Mantri Kisan Urja Suraksha evam Utthaan Mahabhiyan / De-dieselisation of farm sector)", "उजाला (UJALA) योजना", "पीएम सूर्योदय योजना"),
            listOf("Saur Sujala Yojana", "PM-KUSUM (Pradhan Mantri Kisan Urja Suraksha evam Utthaan Mahabhiyan - Aiming to add 34,800 MW of solar capacity in rural farm sectors)", "UJALA Scheme", "PM Suryodaya Yojana"),
            1,
            "पीएम-कुसुम (PM-KUSUM) योजना 2019 में शुरू की गई थी। इसके 3 घटक हैं:\n- घटक A: 10,000 MW क्षमता के छोटे विकेंद्रीकृत सौर संयंत्र (भूमि पर),\n- घटक B: 20 लाख स्टैंडअलोन सौर कृषि पंप लगाना,\n- घटक C: 15 लाख मौजूदा ग्रिड-कनेक्टेड कृषि पंपों का सौरीकरण (Solarisation) करना।",
            "PM-KUSUM replaces expensive diesel pump irrigation with clean solar power while turning farmers into 'Urjadata' (power producers).",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q5", "eco_10",
            "देशभर में 14,500 से अधिक मौजूदा स्कूलों को आधुनिक, हरित, स्मार्ट कक्षाओं एवं राष्ट्रीय शिक्षा नीति (NEP 2020) की प्रयोगशाला के रूप में विकसित करने हेतु 2022 में शुरू की गई योजना कौन-सी है?",
            "Which centrally sponsored scheme launched in September 2022 aims to upgrade 14,500+ existing schools into state-of-the-art exemplar schools showcasing NEP 2020?",
            listOf("समग्र शिक्षा अभियान", "पीएम श्री योजना (PM SHRI - PM Schools for Rising India / ₹27,360 Crore / 5 Years 2022-2027)", "ऑपरेशन ब्लैकबोर्ड", "रूसा (RUSA)"),
            listOf("Samagra Shiksha Abhiyan", "PM SHRI Schools (PM Schools for Rising India - Upgrading selected central/state/local body schools with experiential pedagogy, ICT labs, and green campuses)", "Operation Blackboard", "RUSA"),
            1,
            "'पीएम श्री' (PM SHRI - PM Schools for Rising India) योजना 5 सितंबर 2022 (शिक्षक दिवस) को शुरू की गई थी। इसके तहत ₹27,360 करोड़ के परिव्यय से 14,500 से अधिक स्कूलों को आधुनिक सुविधाओं, स्मार्ट क्लासरूम, अटल टिंकरिंग लैब और राष्ट्रीय शिक्षा नीति 2020 के मॉडल स्कूल के रूप में अपग्रेड किया जा रहा है।",
            "PM SHRI Schools serve as incubation centers and role models for 21st-century experiential pedagogy across India.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q6", "eco_10",
            "भारत सरकार द्वारा वर्ष 2047 तक देश से सिकल सेल रोग के पूर्ण उन्मूलन के उद्देश्य से 1 जुलाई 2023 को शहडोल (मध्य प्रदेश) से कौन-सा राष्ट्रीय मिशन शुरू किया गया?",
            "Which landmark mission was launched by PM Narendra Modi on 1 July 2023 from Shahdol, Madhya Pradesh to eliminate a severe hereditary blood disorder primarily affecting tribal populations by 2047?",
            listOf("राष्ट्रीय टीबी उन्मूलन मिशन", "राष्ट्रीय सिकल सेल एनीमिया उन्मूलन मिशन (National Sickle Cell Anaemia Elimination Mission 2047 / 7 करोड़ नागरिकों की स्क्रीनिंग)", "राष्ट्रीय कुष्ठ उन्मूलन कार्यक्रम", "राष्ट्रीय मलेरिया उन्मूलन कार्यक्रम"),
            listOf("National TB Elimination Mission", "National Sickle Cell Anaemia Elimination Mission (Targeting the elimination of Sickle Cell Disease by 2047 across 17 high-prevalence States)", "National Leprosy Elimination Programme", "National Malaria Eradication Programme"),
            1,
            "'राष्ट्रीय सिकल सेल एनीमिया उन्मूलन मिशन' 1 जुलाई 2023 को शहडोल (मध्य प्रदेश) से शुरू किया गया। इसका लक्ष्य 2047 तक भारत से सिकल सेल रोग को पूरी तरह खत्म करना है। इसके तहत 17 राज्यों के जनजातीय और प्रभावित क्षेत्रों में 0 से 40 वर्ष के 7 करोड़ लोगों की स्क्रीनिंग कर 'सिकल सेल स्टेटस कार्ड' दिए जा रहे हैं।",
            "The mission addresses a critical, generational genetic health vulnerability among India's indigenous tribal communities.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q7", "eco_10",
            "देश में बच्चों, किशोरियों और गर्भवती/स्तनपान कराने वाली माताओं में कुपोषण, बौनेपन (Stunting) और एनीमिया को कम करने हेतु 8 मार्च 2018 को झुंझुनू (राजस्थान) से शुरू किया गया राष्ट्रीय अभियान कौन-सा है?",
            "Which premier multi-ministerial convergence mission was launched on International Women's Day 2018 from Jhunjhunu, Rajasthan to combat child stunting, wasting, and maternal anaemia?",
            listOf("इंद्रधनुष मिशन", "पोषण अभियान / राष्ट्रीय पोषण मिशन (POSHAN Abhiyaan / Prime Minister's Overarching Scheme for Holistic Nutrition / Poshan 2.0)", "सक्षम आंगनवाड़ी", "मातृ वंदना योजना"),
            listOf("Mission Indradhanush", "POSHAN Abhiyaan (National Nutrition Mission - Launched from Jhunjhunu, Rajasthan targeting annual 2% reduction in stunting/underweight and 3% reduction in anaemia)", "Saksham Anganwadi", "Matru Vandana Yojana"),
            1,
            "पोषण अभियान (POSHAN Abhiyaan - Prime Minister's Overarching Scheme for Holistic Nutrition) 8 मार्च 2018 को झुंझुनू (राजस्थान) से शुरू किया गया। इसका उद्देश्य प्रति वर्ष बच्चों में बौनापन (Stunting) 2%, अल्पवजन 2% और महिलाओं में एनीमिया (रक्तअल्पता) 3% घटाना है। हर वर्ष सितंबर माह को 'राष्ट्रीय पोषण माह' के रूप में मनाया जाता है।",
            "POSHAN Abhiyaan leverages technology, behavioral change, and Anganwadi worker tracking for maternal and child nutritional outcomes.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q8", "eco_10",
            "गर्भवती महिलाओं और धात्री माताओं को प्रथम जीवित बच्चे के जन्म पर संस्थागत प्रसव और पोषण सुधार हेतु ₹5,000 (दूसरे बच्चे में बालिका होने पर ₹6,000) की प्रत्यक्ष नकद सहायता देने वाली योजना कौन-सी है?",
            "Which conditional cash transfer maternity benefit scheme implemented under the National Food Security Act (NFSA) 2013 provides direct monetary support of ₹5,000 to pregnant and lactating mothers?",
            listOf("जननी सुरक्षा योजना (JSY)", "प्रधानमंत्री मातृ वंदना योजना (PMMVY - Pradhan Mantri Matru Vandana Yojana / DBT to bank accounts)", "सुमन (SUMAN) योजना", "लक्ष्य (LaQshya) कार्यक्रम"),
            listOf("Janani Suraksha Yojana (JSY)", "Pradhan Mantri Matru Vandana Yojana (PMMVY - Centrally sponsored DBT scheme compensating for wage loss and ensuring maternal nutrition)", "SUMAN Scheme", "LaQshya Programme"),
            1,
            "प्रधानमंत्री मातृ वंदना योजना (PMMVY) 1 जनवरी 2017 से लागू की गई। इसके तहत पहले बच्चे के लिए ₹5,000 की राशि किस्तों में सीधे गर्भवती महिला के आधार-लिंक्ड बैंक खाते में भेजी जाती है। PMMVY 2.0 के तहत यदि दूसरा बच्चा बालिका है, तो उसे ₹6,000 की एकमुश्त प्रोत्साहन राशि दी जाती है।",
            "PMMVY protects expectant mothers from nutritional deprivation while offsetting domestic wage losses during late pregnancy.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q9", "eco_10",
            "भारत सरकार द्वारा पूर्वोत्तर राज्यों (North Eastern Region) में बुनियादी ढांचे और सामाजिक विकास परियोजनाओं के वित्तपोषण हेतु 2022 के केंद्रीय बजट में शुरू की गई 100% केंद्र पोषित विशेष योजना कौन-सी है?",
            "Which 100% centrally funded special development scheme with an initial outlay of ₹6,600 Crore was launched in 2022 to fund infrastructure and livelihood gaps in the North Eastern States?",
            listOf("डोनर (DoNER) विशेष निधि", "पीएम-डिवाइन योजना (PM-DevINE - Prime Minister's Development Initiative for North East Region / 2022-2026)", "उत्तर पूर्व औद्योगिक विकास योजना (NEIDS)", "एक्ट ईस्ट मिशन"),
            listOf("DoNER Special Fund", "PM-DevINE (Prime Minister's Development Initiative for North Eastern Region - Implemented by North Eastern Council to fund socio-economic gaps and youth livelihoods)", "NEIDS", "Act East Mission"),
            1,
            "'पीएम-डिवाइन' (PM-DevINE - Prime Minister's Development Initiative for North East Region) 2022-23 के बजट में घोषित 100% केंद्रीय योजना है (₹6,600 करोड़ का परिव्यय)। यह पूर्वोत्तर परिषद (NEC) और पूर्वोत्तर विकास मंत्रालय (DoNER) द्वारा बुनियादी ढांचे, सामाजिक विकास और युवाओं व महिलाओं के आजीविका सृजन के लिए लागू की जा रही है।",
            "PM-DevINE fast-tracks high-impact infrastructure and social transformation projects in the frontier North Eastern States.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q10", "eco_10",
            "देश के 500 प्रमुख शहरों में जलापूर्ति, सीवरेज प्रबंधन, हरित स्थल और शहरी परिवहन में बुनियादी सुधार लाने हेतु 2015 में शुरू किए गए 'अमृत मिशन' का पूर्ण रूप क्या है?",
            "What is the full expansion of 'AMRUT', the flagship urban renewal mission launched in June 2015 by the Ministry of Housing and Urban Affairs across 500 target cities?",
            listOf("Atal Mission for Rural and Urban Transformation", "Atal Mission for Rejuvenation and Urban Transformation (AMRUT / अमृत 2.0 launched in October 2021 for 100% water tap & sewerage coverage in all statutory towns)", "Advanced Municipal Reform & Urban Transit", "Ayushman Mission for Reconstruction of Urban Towns"),
            listOf("Atal Mission for Rural and Urban Transformation", "Atal Mission for Rejuvenation and Urban Transformation (AMRUT - Dedicated to universal water tap coverage, sewerage septage management, stormwater drainage, and parks)", "Advanced Municipal Reform & Urban Transit", "Ayushman Mission for Reconstruction of Urban Towns"),
            1,
            "AMRUT का पूर्ण रूप 'Atal Mission for Rejuvenation and Urban Transformation' (अटल नवीकरण और शहरी परिवर्तन मिशन) है। इसे 25 जून 2015 को शुरू किया गया था। अक्टूबर 2021 में 'अमृत 2.0' (AMRUT 2.0) शुरू किया गया, जिसका लक्ष्य भारत के सभी 4,700+ वैधानिक शहरों (Statutory Towns) में 100% नल जल कनेक्शन और सीवरेज सुनिश्चित करना है।",
            "AMRUT and AMRUT 2.0 form the foundation of municipal basic services infrastructure across urban India.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q11", "eco_10",
            "ग्रामीण क्षेत्रों में संपत्तियों के सटीक सीमांकन और ग्रामीण नागरिकों को उनकी आवासीय संपत्तियों का कानूनी स्वामित्व कार्ड ('प्रॉपर्टी कार्ड') देने हेतु 24 अप्रैल 2020 (राष्ट्रीय पंचायती राज दिवस) को कौन-सी योजना शुरू की गई?",
            "Which national mapping and surveying scheme was launched on National Panchayati Raj Day (24 April 2020) using cutting-edge Drone technology to issue legal 'Property Cards' to rural home owners?",
            listOf("डिजिटल इंडिया भू-अभिलेख कार्यक्रम (DILRMP)", "स्वामित्व योजना (SVAMITVA Scheme - Survey of Villages and Mapping with Improvised Technology in Village Areas / पंचायती राज मंत्रालय)", "पीएम ग्राम सड़क योजना", "ई-पंचायत मिशन"),
            listOf("DILRMP", "SVAMITVA Scheme (Survey of Villages and Mapping with Improvised Technology in Village Areas - Generating accurate spatial records and empowering villagers to monetize residential property as collateral)", "PM Gram Sadak Yojana", "E-Panchayat Mission"),
            1,
            "स्वामित्व योजना (SVAMITVA - Survey of Villages and Mapping with Improvised Technology in Village Areas) पंचायती राज मंत्रालय और भारतीय सर्वेक्षण विभाग (Survey of India) की संयुक्त पहल है। इसमें ड्रोन कैमरों से ग्रामीण आबादी क्षेत्र (आबादी भूमि) का सटीक 3D मानचित्रण कर संपत्ति मालिकों को डिजिटल 'प्रॉपर्टी कार्ड' दिया जाता है जिससे वे बैंक ऋण ले सकें और भूमि विवाद समाप्त हों।",
            "SVAMITVA unrolls high-precision drone surveying to unlock trillions in dead capital across rural India.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q12", "eco_10",
            "देश के सभी 2 वर्ष तक के बच्चों और गर्भवती महिलाओं को 12 जानलेवा बीमारियों के खिलाफ 100% पूर्ण टीकाकरण (Universal Immunization) प्रदान करने हेतु 25 दिसंबर 2014 को शुरू किया गया राष्ट्रीय मिशन कौन-सा है?",
            "Which intensive flagship immunization programme was launched on 25 December 2014 (Good Governance Day) by the Ministry of Health to achieve >90% full immunization coverage across India?",
            listOf("पल्स पोलियो अभियान", "मिशन इंद्रधनुष (Mission Indradhanush / Intensified Mission Indradhanush - IMI 5.0 in 2023 / DTP, Measles-Rubella, Polio, Hepatitis B, Rotavirus, etc.)", "आयुष्मान भारत", "राष्ट्रीय बाल स्वास्थ्य कार्यक्रम"),
            listOf("Pulse Polio", "Mission Indradhanush (Aimed at rapidly vaccinating all unvaccinated and partially vaccinated children and pregnant mothers across high-priority districts; expanded through IMI 5.0)", "Ayushman Bharat", "Rashtriya Bal Swasthya Karyakram"),
            1,
            "'मिशन इंद्रधनुष' 25 दिसंबर 2014 को स्वास्थ्य एवं परिवार कल्याण मंत्रालय द्वारा शुरू किया गया था। इसका नाम इंद्रधनुष के सात रंगों पर रखा गया था जो शुरू में 7 बीमारियों (डिप्थीरिया, काली खांसी, टिटनेस, पोलियो, टीबी, खसरा और हेपेटाइटिस-बी) के खिलाफ था। अब यह जापानी एन्सेफलाइटिस, रोटावायरस, न्यूमोकोकल और रूबेला सहित 12 टीकों को कवर करता है।",
            "Mission Indradhanush has protected tens of millions of vulnerable infants and pregnant mothers against life-threatening vaccine-preventable diseases.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q13", "eco_10",
            "भारत के 100 चयनित शहरों को विश्वस्तरीय नागरिक सुविधाएं, स्मार्ट मोबिलिटी, 24x7 बिजली-पानी, स्मार्ट सर्विलांस (ICCC) और सतत शहरी विकास प्रदान करने हेतु 25 जून 2015 को शुरू किया गया प्रमुख राष्ट्रीय कार्यक्रम कौन-सा है?",
            "Which flagship urban transformation programme launched in June 2015 developed Integrated Command and Control Centres (ICCC) and smart citizen utilities across 100 selected cities?",
            listOf("अमृत योजना", "स्मार्ट सिटीज मिशन (Smart Cities Mission / MoHUA / Area-Based Development & Pan-City Solutions)", "हृदय (HRIDAY) योजना", "पीएम ई-बस सेवा"),
            listOf("AMRUT", "Smart Cities Mission (Selected 100 cities through competitive City Challenge rounds to deploy sensor networks, intelligent traffic management, and upgraded civic infrastructure)", "HRIDAY Scheme", "PM-eBus Sewa"),
            1,
            "स्मार्ट सिटीज मिशन (Smart Cities Mission) 25 जून 2015 को शुरू किया गया था। इसके तहत 100 शहरों का चयन 4 चरणों में 'सिटी चैलेंज' प्रतियोगिता द्वारा किया गया। इन सभी 100 शहरों में स्थापित 'एकीकृत कमान एवं नियंत्रण केंद्र' (ICCC) यातायात नियंत्रण, सीसीटीवी सुरक्षा, आपदा प्रबंधन और नागरिक सेवाओं के डिजिटल मस्तिष्क के रूप में कार्य करते हैं।",
            "The Smart Cities Mission spearheaded urban data governance and technology-driven municipal service delivery across Indian metropolises.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q14", "eco_10",
            "महिलाओं की सुरक्षा, संरक्षण और सशक्तिकरण के लिए महिला एवं बाल विकास मंत्रालय द्वारा 15वें वित्त आयोग की अवधि (2021-2026) के लिए शुरू किए गए दो उप-घटकों ('संबल' और 'सामर्थ्य') वाली एकीकृत योजना कौन-सी है?",
            "Which umbrella scheme launched by the Ministry of Women and Child Development integrates women's safety, protection, and empowerment through two verticals named 'Sambal' and 'Samarthya'?",
            listOf("मिशन वात्सल्य", "मिशन शक्ति (Mission Shakti - 'Sambal' for safety/security like One Stop Centres & 'Samarthya' for empowerment like Shakti Sadan & Creche)", "मिशन पोषण", "स्वाधार गृह योजना"),
            listOf("Mission Vatsalya (Child protection umbrella)", "Mission Shakti (Umbrella scheme uniting safety and empowerment of women through One Stop Centres, Women Helpline, Beti Bachao Beti Padhao, and working women hostels)", "Mission Poshan", "Swadhar Greh"),
            1,
            "'मिशन शक्ति' (Mission Shakti) महिला एवं बाल विकास मंत्रालय की एकीकृत अंब्रेला योजना है। इसके दो घटक हैं:\n1. 'संबल' (Sambal) - सुरक्षा व संरक्षण (वन स्टॉप सेंटर, महिला हेल्पलाइन 181, बेटी बचाओ बेटी पढ़ाओ, नारी अदालत),\n2. 'सामर्थ्य' (Samarthya) - सशक्तिकरण (उज्ज्वला, स्वाधार गृह, कामकाजी महिला छात्रावास, राष्ट्रीय क्रेच योजना, PMMVY)।",
            "Mission Shakti institutionalizes lifecycle support for women spanning physical safety to economic self-reliance.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m6_q15", "eco_10",
            "देश के सभी असंगठित कामगारों (प्रवासी श्रमिक, निर्माण मजदूर, गिग व प्लेटफॉर्म वर्कर्स, कृषि मजदूर) का एक राष्ट्रीय डेटाबेस तैयार करने हेतु अगस्त 2021 में शुरू किया गया 12-अंकीय विशिष्ट पहचान वाला राष्ट्रीय पोर्टल कौन-सा है?",
            "Which national portal was launched on 26 August 2021 by the Ministry of Labour and Employment to register unorganized workers and issue a 12-digit Universal Account Number (UAN)?",
            listOf("श्रम सुविधा पोर्टल", "ई-श्रम पोर्टल (e-Shram Portal - National Database of Unorganized Workers / 30+ Crore registrations / UAN Card)", "उमंग (UMANG) पोर्टल", "समाधान (SAMADHAN) पोर्टल"),
            listOf("Shram Suvidha Portal", "e-Shram Portal (First-ever comprehensive national database of unorganized workers seeded with Aadhaar, delivering ₹2 Lakh PMSBY accidental cover)", "UMANG Portal", "SAMADHAN Portal"),
            1,
            "ई-श्रम पोर्टल (e-Shram Portal) 26 अगस्त 2021 को श्रम एवं रोजगार मंत्रालय द्वारा शुरू किया गया। यह असंगठित क्षेत्र के 30 करोड़ से अधिक कामगारों का देश का पहला राष्ट्रीय डिजिटल डेटाबेस है। पंजीकृत श्रमिकों को 12 अंकों का विशिष्ट 'ई-श्रम कार्ड' (UAN) मिलता है, जिससे उन्हें सामाजिक सुरक्षा योजनाओं और आपातकालीन राहत का सीधा लाभ मिलता है।",
            "e-Shram is a foundational digital platform delivering targeted welfare to India's vast informal labor workforce.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + EconomyQuestionHelper.generateTopicMocks("eco_10", 7, 10, baseQuestions)
    }
}
