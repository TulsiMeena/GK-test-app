package com.example.ui.data

import com.example.ui.data.StaticGkQuestionHelper.makeStaticGkQ
import com.example.ui.model.GkQuestion

object StaticGkTopic8Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeStaticGkQ(
            "stk_8_m1_q1", "stk_8",
            "भारतीय अंतरिक्ष अनुसंधान संगठन (ISRO) का मुख्यालय कहाँ स्थित है और इसकी स्थापना किस वर्ष हुई थी?",
            "Where is the headquarters of the Indian Space Research Organisation (ISRO) located, and in which year was it established?",
            listOf("नई दिल्ली (1958)", "बेंगलुरु, कर्नाटक (15 अगस्त 1969 - संस्थापक: डॉ. विक्रम साराभाई)", "तिरुवनंतपुरम, केरल (1962)", "हैदराबाद, तेलंगाना (1975)"),
            listOf("New Delhi (1958)", "Bengaluru, Karnataka (15 August 1969 / Founder: Dr. Vikram Sarabhai - Antariksh Bhavan)", "Thiruvananthapuram, Kerala (1962)", "Hyderabad, Telangana (1975)"),
            1,
            "ISRO की स्थापना 15 अगस्त 1969 को डॉ. विक्रम साराभाई (भारतीय अंतरिक्ष कार्यक्रम के जनक) के प्रयासों से हुई थी। इसका मुख्यालय 'अंतरिक्ष भवन', बेंगलुरु (कर्नाटक) में है। यह भारत सरकार के अंतरिक्ष विभाग (Department of Space) के अंतर्गत कार्य करता है।",
            "ISRO's headquarters is situated at Antariksh Bhavan in Bengaluru, Karnataka, driving India's space missions.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q2", "stk_8",
            "सतीश धवन अंतरिक्ष केंद्र (SDSC-SHAR) जहाँ से भारत के रॉकेट (PSLV, GSLV, LVM3) प्रक्षेपित किए जाते हैं, किस द्वीप पर स्थित है?",
            "Satish Dhawan Space Centre (SDSC-SHAR), India's primary orbital spaceport from where rockets like PSLV and LVM3 are launched, is located on which barrier island in Andhra Pradesh?",
            listOf("व्हीलर द्वीप (अब्दुल कलाम द्वीप, ओडिशा)", "श्रीहरिकोटा द्वीप, तिरुपति/नेल्लोर, आंध्र प्रदेश (Sriharikota Island / Pulicat Lake)", "पंबन द्वीप (तमिलनाडु)", "एलिफेंटा द्वीप (महाराष्ट्र)"),
            listOf("Wheeler Island (Dr. APJ Abdul Kalam Island, Odisha - Missile testing)", "Sriharikota Island, Andhra Pradesh (Located in Tirupati district on the edge of Pulicat Lake; near the equator for optimal eastward orbital launches)", "Pamban Island (Tamil Nadu)", "Elephanta Island (Maharashtra)"),
            1,
            "सतीश धवन अंतरिक्ष केंद्र (SDSC) श्रीहरिकोटा (आंध्र प्रदेश) में पुलीकट झील के तट पर स्थित है। इसे भारत का मुख्य स्पेसपोर्ट (रॉकेट लॉन्चिंग सेंटर) माना जाता है। पूर्व में इसे 'शार' (SHAR) कहा जाता था, 2002 में इसका नाम इसरो के पूर्व अध्यक्ष सतीश धवन के नाम पर रखा गया।",
            "Sriharikota provides the ideal coastal launch trajectory for polar and geosynchronous satellite launch vehicles.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q3", "stk_8",
            "भाभा परमाणु अनुसंधान केंद्र (BARC) का मुख्यालय कहाँ स्थित है और इसके संस्थापक कौन थे?",
            "Where is the headquarters of Bhabha Atomic Research Centre (BARC) located, and who founded it?",
            listOf("कलपक्कम, चेन्नई (डॉ. राजा रमन्ना)", "ट्रॉम्बे, मुंबई, महाराष्ट्र (संस्थापक: डॉ. होमी जहांगीर भाभा - 1954)", "रावतभाटा, राजस्थान (डॉ. एपीजे अब्दुल कलाम)", "हैदराबाद (डॉ. शांति स्वरूप भटनागर)"),
            listOf("Kalpakkam, Chennai (Dr. Raja Ramanna)", "Trombay, Mumbai, Maharashtra (Founded on 3 January 1954 by Dr. Homi Jehangir Bhabha as Atomic Energy Establishment, Trombay - AEET)", "Rawatbhata, Rajasthan (Dr. APJ Abdul Kalam)", "Hyderabad (Dr. Shanti Swaroop Bhatnagar)"),
            1,
            "BARC भारत का प्रमुख परमाणु अनुसंधान संस्थान है जो ट्रॉम्बे (मुंबई, महाराष्ट्र) में स्थित है। 3 जनवरी 1954 को डॉ. होमी जहांगीर भाभा द्वारा 'परमाणु ऊर्जा प्रतिष्ठान, ट्रॉम्बे' (AEET) के रूप में स्थापित किया गया था, जिसका नाम 1967 में बदलकर BARC किया गया।",
            "BARC is India's premier nuclear research facility spearheading research reactors, fuel cycles, and radioisotopes.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q4", "stk_8",
            "भारत का पहला स्वदेशी परमाणु अनुसंधान रिएक्टर कौन-सा था जो 1956 में भाभा परमाणु अनुसंधान केंद्र में शुरू हुआ था?",
            "Which was India's (and Asia's) first nuclear research reactor, which achieved criticality in August 1956 at Trombay?",
            listOf("सायरस (CIRUS)", "अप्सरा (Apsara - 4 August 1956 / Swimming pool type reactor)", "ध्रुव (Dhruva)", "पूर्णिमा (Purnima)"),
            listOf("CIRUS (Canada-India Reactor)", "Apsara (Critical on 4 August 1956; one MW swimming-pool type research reactor named by PM Jawaharlal Nehru)", "Dhruva (100 MW research reactor)", "Purnima (Zero-energy fast reactor)"),
            1,
            "4 अगस्त 1956 को शुरू हुआ 'अप्सरा' भारत और पूरे एशिया का पहला परमाणु अनुसंधान रिएक्टर था। यह एक स्विमिंग-पूल प्रकार का रिएक्टर था जिसे पंडित जवाहरलाल नेहरू ने 'अप्सरा' नाम दिया था। 2018 में इसका उन्नत संस्करण 'अप्सरा-यू' शुरू किया गया।",
            "Apsara marked the dawn of the nuclear era in India and across the entire Asian continent.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q5", "stk_8",
            "विक्रम साराभाई अंतरिक्ष केंद्र (VSSC) जहाँ रॉकेट और प्रक्षेपण यान (Launch Vehicles) तैयार किए जाते हैं, कहाँ स्थित है?",
            "Vikram Sarabhai Space Centre (VSSC), responsible for the design and development of launch vehicle technology in India, is located at:",
            listOf("बेंगलुरु, कर्नाटक", "तिरुवनंतपुरम (थुम्बा), केरल (Thumba, Thiruvananthapuram, Kerala)", "अहमदाबाद, गुजरात", "श्रीहरिकोटा, आंध्र प्रदेश"),
            listOf("Bengaluru, Karnataka (ISRO HQ / URSC)", "Thiruvananthapuram (Thumba), Kerala (Pioneered at Thumba Equatorial Rocket Launching Station - TERLS in 1963)", "Ahmedabad, Gujarat (Space Applications Centre - SAC)", "Sriharikota, Andhra Pradesh (SDSC Launch port)"),
            1,
            "विक्रम साराभाई अंतरिक्ष केंद्र (VSSC) तिरुवनंतपुरम (केरल) के थुम्बा में स्थित है। यह इसरो का प्रमुख केंद्र है जहाँ PSLV, GSLV और LVM3 जैसे रॉकेटों का डिज़ाइन और निर्माण किया जाता है। 21 नवंबर 1963 को थुम्बा से भारत का पहला साउंडिंग रॉकेट (Nike-Apache) दागा गया था।",
            "VSSC in Thiruvananthapuram is the cradle of India's indigenous rocket propulsion and launch vehicle engineering.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q6", "stk_8",
            "भारत का 'काकरापार परमाणु ऊर्जा संयंत्र' (Kakrapar Atomic Power Station - KAPS) किस राज्य में तापी नदी के किनारे स्थित है?",
            "Kakrapar Atomic Power Station (KAPS), home to India's first indigenously designed 700 MWe pressurized heavy water reactor (PHWR), is located in which state?",
            listOf("महाराष्ट्र", "गुजरात (सूरत/तापी जिला / Gujarat)", "राजस्थान", "कर्नाटक"),
            listOf("Maharashtra (Tarapur)", "Gujarat (Near Vyara / Surat on the banks of Tapi River / KAPS-3 & KAPS-4 700 MW reactors)", "Rajasthan (Rawatbhata)", "Karnataka (Kaiga)"),
            1,
            "काकरापार परमाणु ऊर्जा संयंत्र गुजरात के तापी/सूरत जिले में तापी नदी के निकट स्थित है। काकरापार-3 भारत का पहला स्वदेशी 700 मेगावाट का दाबित भारी जल रिएक्टर (PHWR) है जिसने जुलाई 2020 में क्रिटिकलिटी हासिल की थी।",
            "Kakrapar in Gujarat represents India's transition to large-scale 700 MW domestic pressurized heavy water reactors.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q7", "stk_8",
            "इंदिरा गांधी परमाणु अनुसंधान केंद्र (IGCAR) जहाँ भारत का 'फास्ट ब्रीडर टेस्ट रिएक्टर' (FBTR) स्थित है, कहाँ स्थित है?",
            "Indira Gandhi Centre for Atomic Research (IGCAR), dedicated to the development of sodium-cooled Fast Breeder Reactor technology, is located at:",
            listOf("ट्रॉम्बे, मुंबई", "कलपक्कम, चेंगलपट्टू, तमिलनाडु (Kalpakkam, Tamil Nadu / PFBR 500 MWe)", "हैदराबाद, तेलंगाना", "इंदौर, मध्य प्रदेश"),
            listOf("Trombay, Mumbai", "Kalpakkam, Tamil Nadu (Established in 1971; houses the Fast Breeder Test Reactor - FBTR and Prototype Fast Breeder Reactor - PFBR)", "Hyderabad, Telangana (Nuclear Fuel Complex - NFC)", "Indore, Madhya Pradesh (RRCAT)"),
            1,
            "इंदिरा गांधी परमाणु अनुसंधान केंद्र (IGCAR) की स्थापना 1971 में कलपक्कम (तमिलनाडु) में हुई थी। यह भारत के तीन-चरणीय परमाणु ऊर्जा कार्यक्रम के दूसरे चरण (फास्ट ब्रीडर रिएक्टर - FBR) का प्रमुख केंद्र है। यहाँ 500 MW का प्रोटोटाइप फास्ट ब्रीडर रिएक्टर (PFBR) विकसित किया गया है।",
            "IGCAR at Kalpakkam leads India's advanced thorium-utilization and fast neutron breeder reactor research.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q8", "stk_8",
            "भारतीय कृषि अनुसंधान परिषद (ICAR) और भारतीय कृषि अनुसंधान संस्थान (IARI - पूसा संस्थान) का मुख्यालय कहाँ स्थित है?",
            "Where is the headquarters of the Indian Council of Agricultural Research (ICAR) and Indian Agricultural Research Institute (IARI - Pusa Institute) located?",
            listOf("लखनऊ, उत्तर प्रदेश", "नई दिल्ली (New Delhi / Pusa Campus)", "कटक, ओडिशा", "नागपुर, महाराष्ट्र"),
            listOf("Lucknow, Uttar Pradesh (IISR)", "New Delhi (Established in 1905 at Pusa, Bihar; relocated to New Delhi after 1934 earthquake; ICAR established on 16 July 1929)", "Cuttack, Odisha (NRRI)", "Nagpur, Maharashtra (CICR)"),
            1,
            "ICAR (स्थापना: 16 जुलाई 1929) और IARI (पूसा संस्थान) दोनों का मुख्यालय नई दिल्ली में है। IARI की स्थापना मूल रूप से 1905 में पूसा (बिहार) में हुई थी, जिसे 1934 के भूकंप के बाद नई दिल्ली में स्थानांतरित किया गया।",
            "ICAR coordinates agricultural education and research across India, spearheading the Green Revolution.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q9", "stk_8",
            "केंद्रीय चावल अनुसंधान संस्थान (National Rice Research Institute - NRRI) कहाँ स्थित है?",
            "Where is the ICAR-National Rice Research Institute (NRRI) located?",
            listOf("वाराणसी, उत्तर प्रदेश", "कटक, ओडिशा (Cuttack, Odisha / Established 1946 / Mahanadi delta)", "राजमुंदरी, आंध्र प्रदेश", "करनाल, हरियाणा"),
            listOf("Varanasi, Uttar Pradesh", "Cuttack, Odisha (Established in 1946; premier institute for rice crop genetics, pathology and climate-smart varieties)", "Rajahmundry, Andhra Pradesh (CTRI - Tobacco)", "Karnal, Haryana (NDRI / CSSRI)"),
            1,
            "केंद्रीय चावल अनुसंधान संस्थान (NRRI) कटक (ओडिशा) में स्थित है। इसकी स्थापना 1946 में हुई थी। यह भारत में उच्च उपज वाली धान की किस्मों और चावल अनुसंधान का सर्वोच्च केंद्र है। (अंतरराष्ट्रीय चावल अनुसंधान संस्थान - IRRI मनीला, फिलीपींस में है)।",
            "NRRI Cuttack has played a transformative role in enhancing India's rice productivity and food security.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q10", "stk_8",
            "राष्ट्रीय डेयरी अनुसंधान संस्थान (National Dairy Research Institute - NDRI) किस शहर में स्थित है?",
            "The National Dairy Research Institute (NDRI), India's premier institute for dairy research and cattle breeding, is located in which city?",
            listOf("आनंद, गुजरात", "करनाल, हरियाणा (Karnal, Haryana / Established 1923 at Bengaluru, shifted to Karnal 1955)", "हिसार, हरियाणा", "मथुरा, उत्तर प्रदेश"),
            listOf("Anand, Gujarat (AMUL / NDDB headquarters)", "Karnal, Haryana (Founded in 1923; renowned for cattle and buffalo cloning research like 'Pratham' and 'Garima')", "Hisar, Haryana (CIRB - Buffalo)", "Mathura, Uttar Pradesh (CIRG - Goat)"),
            1,
            "राष्ट्रीय डेयरी अनुसंधान संस्थान (NDRI) करनाल (हरियाणा) में स्थित है। इसकी स्थापना 1923 में बेंगलुरु में 'इम्पीरियल इंस्टीट्यूट ऑफ एनिमल हसबेंडरी' के रूप में हुई थी और 1955 में इसे करनाल स्थानांतरित किया गया। यहाँ भैंसों के क्लोन (गरिमा, प्रथम आदि) तैयार किए गए हैं।",
            "NDRI Karnal drives technological innovations in milk production, processing, and bovine genetics.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q11", "stk_8",
            "डीआरडीओ (DRDO - रक्षा अनुसंधान एवं विकास संगठन) की स्थापना किस वर्ष हुई थी और इसका मुख्यालय कहाँ स्थित है?",
            "Defence Research and Development Organisation (DRDO) was established in which year and where is its headquarters located?",
            listOf("1969, बेंगलुरु", "1958, नई दिल्ली (New Delhi / Motto: 'बलस्य मूलं विज्ञानम्' - Strength's Origin is in Science)", "1972, हैदराबाद", "1962, पुणे"),
            listOf("1969, Bengaluru (ISRO)", "1958, New Delhi (Formed by amalgamating Technical Development Establishment and Defence Science Organisation; HQ: DRDO Bhavan, New Delhi)", "1972, Hyderabad", "1962, Pune"),
            1,
            "DRDO की स्थापना 1958 में रक्षा विज्ञान संगठन (DSO) और तकनीकी विकास प्रतिष्ठानों को मिलाकर की गई थी। इसका मुख्यालय 'डीआरडीओ भवन', नई दिल्ली में है। इसका ध्येय वाक्य 'बलस्य मूलं विज्ञानम्' (शक्ति का मूल विज्ञान है) है।",
            "DRDO is India's premier military research and development agency empowering self-reliance in defense hardware.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q12", "stk_8",
            "भारत का 'नरौरा परमाणु ऊर्जा केंद्र' (Narora Atomic Power Station - NAPS) किस राज्य में गंगा नदी के तट पर स्थित है?",
            "Narora Atomic Power Station (NAPS), consisting of two 220 MWe pressurized heavy water reactors, is located in which state on the banks of River Ganga?",
            listOf("मध्य प्रदेश", "उत्तर प्रदेश (बुलंदशहर जिला / Bulandshahr, Uttar Pradesh)", "उत्तराखंड", "बिहार"),
            listOf("Madhya Pradesh", "Uttar Pradesh (Located in Narora, Bulandshahr district, UP; commissioned in 1991 and 1992)", "Uttarakhand", "Bihar"),
            1,
            "नरौरा परमाणु ऊर्जा स्टेशन उत्तर प्रदेश के बुलंदशहर जिले में गंगा नदी के निकट स्थित है। यहाँ 220-220 मेगावाट क्षमता के दो भारी जल रिएक्टर (PHWR) कार्यरत हैं।",
            "Narora Atomic Power Station delivers clean base power to the northern regional electrical grid.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q13", "stk_8",
            "अंतरिक्ष अनुप्रयोग केंद्र (Space Applications Centre - SAC) और भौतिक अनुसंधान प्रयोगशाला (Physical Research Laboratory - PRL) कहाँ स्थित हैं?",
            "Where are the Space Applications Centre (SAC) and Physical Research Laboratory (PRL) located?",
            listOf("हैदराबाद", "अहमदाबाद, गुजरात (Ahmedabad, Gujarat / Founded by Dr. Vikram Sarabhai 1947)", "बेंगलुरु", "तिरुवनंतपुरम"),
            listOf("Hyderabad (NRSC)", "Ahmedabad, Gujarat (SAC develops satellite payloads and communication transponders; PRL is the cradle of space sciences)", "Bengaluru (URSC)", "Thiruvananthapuram (VSSC)"),
            1,
            "अंतरिक्ष अनुप्रयोग केंद्र (SAC) और भौतिक अनुसंधान प्रयोगशाला (PRL) दोनों अहमदाबाद (गुजरात) में स्थित हैं। PRL की स्थापना 1947 में डॉ. विक्रम साराभाई द्वारा की गई थी और इसे भारतीय अंतरिक्ष विज्ञान की जननी माना जाता है।",
            "Ahmedabad hosts both SAC and PRL, leading payload development and astronomical space sciences.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q14", "stk_8",
            "भारत का 'कैगा परमाणु ऊर्जा संयंत्र' (Kaiga Generating Station) किस राज्य में काली नदी के किनारे स्थित है?",
            "Kaiga Generating Station, which holds a world record for continuous operation of a PHWR reactor (962 days), is located in which state on the banks of Kali River?",
            listOf("केरल", "कर्नाटक (उत्तर कन्नड़ जिला / Uttara Kannada, Karnataka)", "तमिलनाडु", "आंध्र प्रदेश"),
            listOf("Kerala", "Karnataka (Located in Kaiga forest area in Karwar, Uttara Kannada district; unit-1 ran non-stop for 962 days until Dec 2018)", "Tamil Nadu (Kudankulam / Kalpakkam)", "Andhra Pradesh (Kovvada proposed)"),
            1,
            "कैगा परमाणु ऊर्जा संयंत्र कर्नाटक के उत्तर कन्नड़ जिले में काली नदी के तट पर स्थित है। कैगा की यूनिट-1 ने लगातार 962 दिनों तक निर्बाध बिजली उत्पादन करके विश्व रिकॉर्ड बनाया था।",
            "Kaiga Generating Station in Karnataka is globally renowned for its benchmark continuous operational safety and reliability.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_8_m1_q15", "stk_8",
            "वैज्ञानिक एवं औद्योगिक अनुसंधान परिषद (CSIR) की स्थापना 1942 में हुई थी। इसके पदेन अध्यक्ष (Ex-officio President) कौन होते हैं?",
            "Council of Scientific and Industrial Research (CSIR), established in September 1942, has which dignitary as its Ex-officio President?",
            listOf("राष्ट्रपति", "भारत के प्रधानमंत्री (Prime Minister of India / Founder Director: Dr. Shanti Swaroop Bhatnagar)", "विज्ञान एवं प्रौद्योगिकी मंत्री", "नीति आयोग के उपाध्यक्ष"),
            listOf("President of India", "Prime Minister of India (Dr. Shanti Swaroop Bhatnagar was its first Director-General; operates 37 national laboratories across India)", "Minister of Science and Technology (Vice President of CSIR)", "Vice Chairman of NITI Aayog"),
            1,
            "CSIR की स्थापना 26 सितंबर 1942 को हुई थी। भारत के प्रधानमंत्री CSIR के पदेन अध्यक्ष (Ex-officio President) होते हैं, जबकि केंद्रीय विज्ञान एवं प्रौद्योगिकी मंत्री इसके उपाध्यक्ष होते हैं। इसके पहले महानिदेशक डॉ. शांति स्वरूप भटनागर थे।",
            "CSIR is India's largest research and development organisation with 37 premier national laboratories spanning all domains of science.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + StaticGkQuestionHelper.generateTopicMocks("stk_8", 2, 5, baseQuestions)
    }
}
