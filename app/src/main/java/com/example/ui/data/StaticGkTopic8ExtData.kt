package com.example.ui.data

import com.example.ui.data.StaticGkQuestionHelper.makeStaticGkQ
import com.example.ui.model.GkQuestion

object StaticGkTopic8ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeStaticGkQ(
            "stk_8_m6_q1", "stk_8",
            "केंद्रीय आलू अनुसंधान संस्थान (Central Potato Research Institute - CPRI) किस पर्वतीय शहर में स्थित है?",
            "Where is the ICAR-Central Potato Research Institute (CPRI) located?",
            listOf("देहरादून, उत्तराखंड", "शिमला, हिमाचल प्रदेश (Kufri / Shimla, Himachal Pradesh / Established 1949)", "दार्जिलिंग, पश्चिम बंगाल", "श्रीनगर, जम्मू-कश्मीर"),
            listOf("Dehradun, Uttarakhand (FRI)", "Shimla, Himachal Pradesh (Established in 1949 at Patna, shifted to Shimla in 1956; known for 'Kufri' series potato varieties)", "Darjeeling, West Bengal", "Srinagar, Jammu & Kashmir"),
            1,
            "केंद्रीय आलू अनुसंधान संस्थान (CPRI) शिमला (हिमाचल प्रदेश) के कुफरी में स्थित है। इसकी स्थापना 1949 में हुई थी। भारत में विकसित लगभग सभी आलू की उन्नत किस्में (जैसे कुफरी ज्योति, कुफरी चिप्सोना आदि) इसी संस्थान की देन हैं।",
            "CPRI Shimla is the premier institute driving tuber research, disease-free seed production, and potato genetics in India.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q2", "stk_8",
            "वन अनुसंधान संस्थान (Forest Research Institute - FRI) और भारतीय वन्यजीव संस्थान (WII) कहाँ स्थित हैं?",
            "Where are the Forest Research Institute (FRI - established 1906) and Wildlife Institute of India (WII) located?",
            listOf("भोपाल, मध्य प्रदेश (IIFM)", "देहरादून, उत्तराखंड (Dehradun, Uttarakhand / Greco-Roman architecture / Established 1906)", "जोधपुर, राजस्थान (AFRI)", "शिलांग, मेघालय"),
            listOf("Bhopal, Madhya Pradesh (Indian Institute of Forest Management - IIFM)", "Dehradun, Uttarakhand (Founded in 1906 as Imperial Forest Research Institute; grand Greco-Roman architectural landmark; WII established 1982)", "Jodhpur, Rajasthan (Arid Forest Research Institute)", "Shillong, Meghalaya"),
            1,
            "वन अनुसंधान संस्थान (FRI) और भारतीय वन्यजीव संस्थान (WII) दोनों देहरादून (उत्तराखंड) में स्थित हैं। FRI की स्थापना 1906 में 'इंपीरियल फॉरेस्ट रिसर्च इंस्टीट्यूट' के रूप में हुई थी। इसका मुख्य भवन शानदार ग्रीको-रोमन वास्तुकला का प्रतीक है।",
            "FRI Dehradun is an iconic forestry institution and deemed university leading scientific forestry research.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q3", "stk_8",
            "राष्ट्रीय सुदूर संवेदन केंद्र (National Remote Sensing Centre - NRSC) जो उपग्रह डेटा संग्रह और मैपिंग का कार्य करता है, कहाँ स्थित है?",
            "National Remote Sensing Centre (NRSC), an ISRO center responsible for satellite data acquisition, aerial remote sensing, and disaster management support, is located at:",
            listOf("बेंगलुरु, कर्नाटक", "हैदराबाद (बालानगर/शादनगर), तेलंगाना (Hyderabad, Telangana / Earth Station at Shadnagar)", "अहमदाबाद, गुजरात", "नागपुर, महाराष्ट्र"),
            listOf("Bengaluru, Karnataka (ISTRAC / URSC)", "Hyderabad, Telangana (Receives and processes data from IRS, Cartosat, and foreign earth observation satellites; operates Bhuvan geoportal)", "Ahmedabad, Gujarat (SAC)", "Nagpur, Maharashtra"),
            1,
            "राष्ट्रीय सुदूर संवेदन केंद्र (NRSC) हैदराबाद (तेलंगाना) में स्थित है। इसका अर्थ स्टेशन शादनगर (हैदराबाद के पास) में है जहाँ से कार्टोसैट, रिसोर्ससैट, रिसेट आदि उपग्रहों का डेटा प्राप्त किया जाता है। भारत का भू-स्थानिक पोर्टल 'भुवन' (Bhuvan) इसी द्वारा संचालित होता है।",
            "NRSC Hyderabad is the hub for earth observation satellite operations and geospatial applications in India.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q4", "stk_8",
            "राजा रामन्ना प्रगत प्रौद्योगिकी केंद्र (Raja Ramanna Centre for Advanced Technology - RRCAT) जो लेजर और कण त्वरक (Particle Accelerators) पर अनुसंधान करता है, कहाँ स्थित है?",
            "Raja Ramanna Centre for Advanced Technology (RRCAT), a unit of Department of Atomic Energy working on Lasers and Synchrotron Radiation Sources (Indus-1 & Indus-2), is located at:",
            listOf("मुंबई, महाराष्ट्र", "इंदौर, मध्य प्रदेश (Indore, Madhya Pradesh / Established 1984 / Indus-1 & Indus-2 Accelerators)", "हैदराबाद, तेलंगाना", "कलपक्कम, तमिलनाडु"),
            listOf("Mumbai, Maharashtra (BARC)", "Indore, Madhya Pradesh (Founded in 1984 by PM Indira Gandhi; commissioned synchrotron radiation sources Indus-1 and Indus-2 for high-energy physics)", "Hyderabad, Telangana (NFC)", "Kalpakkam, Tamil Nadu (IGCAR)"),
            1,
            "RRCAT मध्य प्रदेश के इंदौर में स्थित है। इसकी स्थापना 1984 में हुई थी। यह संस्थान लेजर तकनीक, पार्टिकल एक्सेलेरेटर (कण त्वरक) तथा सिंक्रोट्रॉन रेडिएशन स्रोतों ('सिंधु-1' और 'सिंधु-2') के विकास के लिए प्रसिद्ध है।",
            "RRCAT Indore is India's leading laboratory dedicated to advanced lasers, accelerator physics, and synchrotron facilities.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q5", "stk_8",
            "भारत का आगामी सबसे बड़ा परमाणु ऊर्जा संयंत्र 'जैतापुर परमाणु ऊर्जा परियोजना' (Jaitapur Nuclear Power Project - 9,900 MW) किस राज्य में फ्रांस के सहयोग से प्रस्तावित है?",
            "The proposed Jaitapur Nuclear Power Project (planned capacity 9,900 MWe with 6 EPR reactors from France's EDF), set to be the world's largest nuclear power park, is located in which state?",
            listOf("गुजरात", "महाराष्ट्र (रत्नागिरी जिला / Ratnagiri district, Maharashtra / French EDF collaboration)", "कर्नाटक", "आंध्र प्रदेश"),
            listOf("Gujarat (Mithi Virdi proposed)", "Maharashtra (Located in Madban village, Ratnagiri district; designed to house six 1,650 MW European Pressurized Reactors - EPRs)", "Karnataka (Kaiga expansion)", "Andhra Pradesh (Kovvada proposed)"),
            1,
            "जैतापुर परमाणु ऊर्जा परियोजना महाराष्ट्र के रत्नागिरी जिले में स्थित है। यह फ्रांस की कंपनी EDF के सहयोग से 6 यूरोपीय दाबित रिएक्टरों (EPR - 1650 MW प्रत्येक) के साथ कुल 9,900 MW क्षमता का विश्व का सबसे बड़ा परमाणु ऊर्जा पार्क बनने जा रहा है।",
            "Jaitapur in Maharashtra is envisioned to be a massive zero-emission clean energy hub powered by next-generation EPR reactors.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q6", "stk_8",
            "उत्तर भारत का 'पहला परमाणु ऊर्जा संयंत्र' 'गोरखपुर परमाणु ऊर्जा संयंत्र' (Gorakhpur Haryana Anu Vidyut Pariyojana - GHAVP) हरियाणा के किस जिले में निर्माणाधीन है?",
            "North India's upcoming indigenous nuclear power station, Gorakhpur Haryana Anu Vidyut Pariyojana (GHAVP - 4x700 MWe PHWRs), is being constructed in which district of Haryana?",
            listOf("हिसार जिला", "फतेहाबाद जिला (Fatehabad, Haryana / Gorakhpur village / 2,800 MWe total capacity)", "रोहतक जिला", "करनाल जिला"),
            listOf("Hisar district", "Fatehabad district (Situated at Gorakhpur village near Fatehabad in Haryana; will generate 2,800 MWe from four 700 MW indigenous PHWRs)", "Rohtak district", "Karnal district"),
            1,
            "गोरखपुर हरियाणा अणु विद्युत परियोजना (GHAVP) हरियाणा के फतेहाबाद जिले के गोरखपुर गांव में स्थापित की जा रही है। यह उत्तर भारत का एक प्रमुख परमाणु ऊर्जा संयंत्र होगा जिसमें 700-700 MW के चार स्वदेशी PHWR रिएक्टर होंगे।",
            "GHAVP in Fatehabad, Haryana expands nuclear power generation into the northern plains of India.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q7", "stk_8",
            "भारतीय चमड़ा अनुसंधान संस्थान (Central Leather Research Institute - CLRI) किस शहर में स्थित है?",
            "Central Leather Research Institute (CSIR-CLRI), the world's largest leather research institute in terms of patents and technology output, is located at:",
            listOf("कानपुर, उत्तर प्रदेश", "चेन्नई, तमिलनाडु (Adyar, Chennai, Tamil Nadu / Established 1948)", "कोलकाता, पश्चिम बंगाल", "आगरा, उत्तर प्रदेश"),
            listOf("Kanpur, Uttar Pradesh (HBTU / Footwear Park)", "Chennai, Tamil Nadu (Founded in 1948; premier national laboratory for leather processing, tannery effluent treatment, and fashion leather goods)", "Kolkata, West Bengal", "Agra, Uttar Pradesh"),
            1,
            "केंद्रीय चमड़ा अनुसंधान संस्थान (CLRI) चेन्नई (तमिलनाडु) के अड्यार में स्थित है। इसकी स्थापना 1948 में हुई थी। यह दुनिया का सबसे बड़ा चमड़ा अनुसंधान संस्थान है जो पर्यावरण-अनुकूल टैनिंग और लेदर टेक्नोलॉजी पर शोध करता है।",
            "CSIR-CLRI Chennai leads global advancements in sustainable leather processing and leather footwear technology.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q8", "stk_8",
            "केंद्रीय औषधि अनुसंधान संस्थान (Central Drug Research Institute - CDRI) और राष्ट्रीय वनस्पति अनुसंधान संस्थान (NBRI) कहाँ स्थित हैं?",
            "Where are the Central Drug Research Institute (CSIR-CDRI) and National Botanical Research Institute (CSIR-NBRI) located?",
            listOf("नई दिल्ली", "लखनऊ, उत्तर प्रदेश (Lucknow, Uttar Pradesh / Developed Centchroman 'Saheli' oral contraceptive)", "वाराणसी, उत्तर प्रदेश", "भोपाल, मध्य प्रदेश"),
            listOf("New Delhi (NII / AIIMS)", "Lucknow, Uttar Pradesh (CDRI was established in 1951 at Chattar Manzil; invented 'Saheli' non-steroidal oral contraceptive and anti-malarial Arteether; NBRI is premier botanical research hub)", "Varanasi, Uttar Pradesh", "Bhopal, Madhya Pradesh"),
            1,
            "CDRI और NBRI दोनों लखनऊ (उत्तर प्रदेश) में स्थित हैं। CDRI की स्थापना 1951 में हुई थी। इस संस्थान ने भारत की प्रसिद्ध गैर-स्टेरॉयडल गर्भनिरोधक गोली 'सहेली' (Centchroman) तथा मलेरिया रोधी दवाइयों का विकास किया है।",
            "CDRI Lucknow has spearheaded indigenous drug discovery and pharmaceutical research in India for decades.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q9", "stk_8",
            "भारतीय विज्ञान संस्थान (Indian Institute of Science - IISc) की स्थापना 1909 में किसके दूरदर्शी सहयोग से बेंगलुरु में हुई थी?",
            "The Indian Institute of Science (IISc), India's highest-ranked premier scientific and engineering university, was founded in 1909 in Bengaluru through the visionary partnership of which industrialist and the Maharaja of Mysore?",
            listOf("घनश्याम दास बिड़ला", "जमशेदजी नसरवानजी टाटा एवं कृष्णराज वोडेयार चतुर्थ (Jamsetji Tata & Maharaja Krishnaraja Wadiyar IV / Bengaluru)", "जे.आर.डी. टाटा", "सर जमशेदजी जीजीभोय"),
            listOf("Ghanshyam Das Birla", "Jamsetji Nusserwanji Tata and Krishnaraja Wadiyar IV (Conceived following Swami Vivekananda's conversation with Jamsetji Tata in 1893; started with Nobel laureate Sir C.V. Raman as first Indian director in 1933)", "J.R.D. Tata", "Sir Jamsetjee Jejeebhoy"),
            1,
            "IISc की स्थापना 1909 में बेंगलुरु में महान उद्योगपति जमशेदजी टाटा और मैसूर के महाराजा कृष्णराज वोडेयार चतुर्थ के सहयोग से हुई थी। 1893 में स्वामी विवेकानंद के साथ समुद्री यात्रा के दौरान जमशेदजी टाटा को इस विश्वस्तरीय संस्थान का विचार आया था। 1933 में नोबेल विजेता डॉ. सी.वी. रमन इसके पहले भारतीय निदेशक बने।",
            "IISc Bengaluru stands as India's crown jewel in fundamental scientific research and advanced engineering.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q10", "stk_8",
            "टाटा मूलभूत अनुसंधान संस्थान (Tata Institute of Fundamental Research - TIFR) की स्थापना 1945 में डॉ. होमी भाभा ने कहाँ की थी?",
            "Tata Institute of Fundamental Research (TIFR), dedicated to basic research in mathematics and natural sciences, was founded in 1945 by Dr. Homi J. Bhabha with support from Sir Dorabji Tata Trust in which city?",
            listOf("पुणे, महाराष्ट्र", "मुंबई, महाराष्ट्र (Colaba, Mumbai, Maharashtra / Founded June 1945)", "बेंगलुरु, कर्नाटक", "कोलकाता, पश्चिम बंगाल"),
            listOf("Pune, Maharashtra (IUCAA / NCCS)", "Mumbai, Maharashtra (Established on 1 June 1945 at Kenilworth, Pedder Road, later shifted to Colaba; cradle of India's nuclear and cosmic ray research programs)", "Bengaluru, Karnataka (NCBS / TIFR Center)", "Kolkata, West Bengal (SINP)"),
            1,
            "TIFR की स्थापना 1 जून 1945 को मुंबई में डॉ. होमी जहांगीर भाभा द्वारा जे.आर.डी. टाटा और सर दोराबजी टाटा ट्रस्ट की सहायता से की गई थी। यह भारत में परमाणु ऊर्जा और ब्रह्मांडीय किरणों (Cosmic Rays) के अनुसंधान का केंद्र बना।",
            "TIFR Mumbai is a premier national center of the Government of India for nuclear science and advanced mathematics.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q11", "stk_8",
            "परमाणु ईंधन परिसर (Nuclear Fuel Complex - NFC) और इलेक्ट्रॉनिक्स कॉर्पोरेशन ऑफ इंडिया (ECIL) कहाँ स्थित हैं?",
            "Where are the Nuclear Fuel Complex (NFC - fabricating natural uranium fuel bundles) and Electronics Corporation of India Limited (ECIL) located?",
            listOf("चेन्नई, तमिलनाडु", "हैदराबाद, तेलंगाना (Moula Ali / ECIL, Hyderabad, Telangana)", "मुंबई, महाराष्ट्र", "जादूगोड़ा, झारखंड"),
            listOf("Chennai, Tamil Nadu", "Hyderabad, Telangana (NFC established in 1971 manufactures zirconium alloy components and nuclear fuel bundles for all Indian PHWRs; ECIL founded 1967 manufactures EVMs and control systems)", "Mumbai, Maharashtra", "Jaduguda, Jharkhand (UCIL Uranium mining)"),
            1,
            "परमाणु ईंधन परिसर (NFC) और ECIL दोनों हैदराबाद (तेलंगाना) में स्थित हैं। NFC भारत के सभी परमाणु संयंत्रों के लिए परमाणु ईंधन (यूरेनियम बंडल) और जिरकोनियम मिश्र धातु घटकों का निर्माण करता है। ECIL भारत की इलेक्ट्रॉनिक वोटिंग मशीन (EVM) और रक्षा इलेक्ट्रॉनिक्स उपकरण बनाता है।",
            "Hyderabad's NFC and ECIL are foundational industrial pillars supporting India's nuclear power infrastructure and high-tech electronics.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q12", "stk_8",
            "भारत में यूरेनियम खनन का मुख्य केंद्र 'जादूगोड़ा' (Jaduguda Uranium Mine) किस राज्य के पूर्वी सिंहभूम जिले में स्थित है?",
            "Jaduguda Mine, the first uranium mine in India operated by Uranium Corporation of India Limited (UCIL) since 1967, is located in which state?",
            listOf("ओडिशा (मयूरभंज जिला)", "झारखंड (पूर्वी सिंहभूम जिला / East Singhbhum, Jharkhand - UCIL Jaduguda / Bhatin / Narwapahar)", "मध्य प्रदेश", "छत्तीसगढ़"),
            listOf("Odisha (Mayurbhanj)", "Jharkhand (Located in Purbi Singhbhum district; provides yellowcake uranium ore concentrates for Indian nuclear reactors; UCIL founded 1967)", "Madhya Pradesh", "Chhattisgarh"),
            1,
            "जादूगोड़ा यूरेनियम खदान झारखंड के पूर्वी सिंहभूम जिले में स्थित है। यह 1967 में शुरू हुई भारत की पहली यूरेनियम खदान है जिसका संचालन 'यूरेनियम कॉर्पोरेशन ऑफ इंडिया लिमिटेड' (UCIL) द्वारा किया जाता है। (आंध्र प्रदेश के तुमालापल्ले में भी यूरेनियम के विशाल भंडार पाए गए हैं)।",
            "Jaduguda is India's historic hub for uranium extraction, fueling the domestic nuclear energy program.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q13", "stk_8",
            "भारतीय दलहन अनुसंधान संस्थान (Indian Institute of Pulses Research - IIPR) कहाँ स्थित है?",
            "Where is the ICAR-Indian Institute of Pulses Research (IIPR) located?",
            listOf("वाराणसी, उत्तर प्रदेश", "कानपुर, उत्तर प्रदेश (Kalyanpur, Kanpur, Uttar Pradesh / Established 1983)", "इंदौर, मध्य प्रदेश (IISR Soybean)", "नागपुर, महाराष्ट्र"),
            listOf("Varanasi, Uttar Pradesh (IIVR - Vegetable)", "Kanpur, Uttar Pradesh (Established in 1983; national apex institute for research on chickpeas, pigeon peas, lentils, and pulses genomics)", "Indore, Madhya Pradesh (Directorate of Soybean Research)", "Nagpur, Maharashtra (CICR - Cotton)"),
            1,
            "भारतीय दलहन अनुसंधान संस्थान (IIPR) कानपुर (उत्तर प्रदेश) के कल्याणपुर में स्थित है। यह देश में दालों (चना, अरहर, मूंग, उड़द, मसूर) के उत्पादन और नई प्रजातियों के विकास का प्रमुख राष्ट्रीय अनुसंधान केंद्र है।",
            "IIPR Kanpur spearheads pulse crop genomics, climate resilience, and nutritional self-sufficiency in India.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q14", "stk_8",
            "भारतीय सब्जी अनुसंधान संस्थान (Indian Institute of Vegetable Research - IIVR) किस शहर में स्थित है?",
            "Where is the ICAR-Indian Institute of Vegetable Research (IIVR) located?",
            listOf("लखनऊ, उत्तर प्रदेश", "वाराणसी, उत्तर प्रदेश (Shahanshapur, Varanasi, Uttar Pradesh / Established 1999)", "प्रयागराज, उत्तर प्रदेश", "पटना, बिहार"),
            listOf("Lucknow, Uttar Pradesh (IISR Sugarcane / CISH Subtropical)", "Varanasi, Uttar Pradesh (Established in 1999; premier institute dedicated to vegetable breeding, hybrid varieties, and organic vegetable production)", "Prayagraj, Uttar Pradesh", "Patna, Bihar (ICAR RCER)"),
            1,
            "भारतीय सब्जी अनुसंधान संस्थान (IIVR) वाराणसी (उत्तर प्रदेश) के शहंशाहपुर में स्थित है। यह संस्थान सब्जियों की नई उन्नत प्रजातियों, संकर बीजों और जैविक खेती के अनुसंधान के लिए जाना जाता है।",
            "IIVR Varanasi is the nodal national center for horticulture advancements and vegetable breeding technology.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m6_q15", "stk_8",
            "केंद्रीय शुष्क क्षेत्र अनुसंधान संस्थान (Central Arid Zone Research Institute - CAZRI) किस शहर में स्थित है?",
            "Where is the ICAR-Central Arid Zone Research Institute (CAZRI) located?",
            listOf("बीकानेर, राजस्थान", "जोधपुर, राजस्थान (Jodhpur, Rajasthan / Established 1959 / Thar Desert research & sand dune stabilization)", "जैसलमेर, राजस्थान", "जयपुर, राजस्थान"),
            listOf("Bikaner, Rajasthan (CIAH - Arid Horticulture / NRCC Camel)", "Jodhpur, Rajasthan (Established in 1959; dedicated to desert ecology, sand dune stabilization, windbreak shelterbelts, and arid agriculture)", "Jaisalmer, Rajasthan", "Jaipur, Rajasthan"),
            1,
            "केंद्रीय शुष्क क्षेत्र अनुसंधान संस्थान (काजरी / CAZRI) जोधपुर (राजस्थान) में स्थित है। इसकी स्थापना 1959 में हुई थी। यह थार मरुस्थल में रेत के टीलों के स्थिरीकरण, मरुस्थलीकरण की रोकथाम और शुष्क कृषि पर अनुसंधान का प्रमुख केंद्र है। (जोधपुर में AFRI - शुष्क वन अनुसंधान संस्थान भी स्थित है)।",
            "CAZRI Jodhpur is an internationally renowned institute pioneering desertification control and arid zone sustainability.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + StaticGkQuestionHelper.generateTopicMocks("stk_8", 7, 10, baseQuestions)
    }
}
