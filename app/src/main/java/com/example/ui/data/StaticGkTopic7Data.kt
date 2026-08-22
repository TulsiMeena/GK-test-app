package com.example.ui.data

import com.example.ui.data.StaticGkQuestionHelper.makeStaticGkQ
import com.example.ui.model.GkQuestion

object StaticGkTopic7Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeStaticGkQ(
            "stk_7_m1_q1", "stk_7",
            "जापान (Japan) की संसद का आधिकारिक नाम क्या है और इसकी राष्ट्रीय मुद्रा (Currency) क्या है?",
            "What is the official name of the supreme legislative bicameral parliament of Japan, and what is the official currency of Japan?",
            listOf("केसेट / शेकेल (इजराइल)", "डाइट / येन (National Diet / Kokkai & Japanese Yen '¥' - Japan / Capital: Tokyo / Bicameral: House of Representatives & House of Councillors)", "ड्यूमा / रूबल (रूस)", "मजलिस / रुफिया (मालदीव)"),
            listOf("Knesset / Shekel (Israel)", "National Diet (Kokkai) / Yen (Bicameral legislature established under the 1947 Constitution consisting of the lower House of Representatives and upper House of Councillors; Currency: Yen)", "State Duma / Ruble (Russia)", "Majlis / Rufiyaa (Maldives)"),
            1,
            "जापान की संसद का नाम 'डाइट' (National Diet / राष्ट्रीय संसद) है और इसकी मुद्रा 'येन' (Yen - ¥) है। राजधानी: टोक्यो (Tokyo)।\nअन्य प्रमुख संसदें:\n- इजराइल: नेसेट (Knesset)\n- रूस: ड्यूमा (Duma / Federal Assembly)\n- मालदीव / ईरान: मजलिस (Majlis)\n- बांग्लादेश: जातीय संसद\n- अफगानिस्तान: शोरा",
            "The National Diet of Japan is one of the world's most enduring modern parliamentary democracies.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q2", "stk_7",
            "भारत का 'पहला वाणिज्यिक परमाणु ऊर्जा संयंत्र' (First Commercial Nuclear Power Station) 1969 में संयुक्त राज्य अमेरिका के सहयोग से कहाँ स्थापित किया गया था?",
            "Which was India's first commercial nuclear power station, commissioned in October 1969 with technical and fuel assistance from the United States (GE), located in Maharashtra?",
            listOf("रावतभाटा (राजस्थान - कनाडाई सहयोग)", "तारापुर परमाणु ऊर्जा स्टेशन, पालघर, महाराष्ट्र (Tarapur Atomic Power Station - TAPS / Commissioned 28 October 1969 / Boiling Water Reactors BWRs / Dr. Homi Bhabha)", "कलपक्कम (तमिलनाडु - मद्रास परमाणु ऊर्जा संयंत्र)", "कुडनकुलम (तमिलनाडु - रूसी सहयोग)"),
            listOf("Rawatbhata (Rajasthan Atomic Power Station RAPS - Canadian CANDU reactors)", "Tarapur Atomic Power Station (Located in Palghar district, Maharashtra; first nuclear plant in India with initial capacity of 2x160 MWe; expanded to 1,400 MWe with PHWRs)", "Kalpakkam (Madras Atomic Power Station MAPS - Fully indigenous)", "Kudankulam (Tamil Nadu - Largest nuclear plant with Russian VVER-1000 reactors)"),
            1,
            "तारापुर परमाणु ऊर्जा संयंत्र (पालघर, महाराष्ट्र) 28 अक्टूबर 1969 को शुरू हुआ और यह भारत का पहला व्यावसायिक परमाणु ऊर्जा स्टेशन है। इसे अमेरिका के सहयोग से बोइलिंग वाटर रिएक्टर (BWR) तकनीक पर बनाया गया था।",
            "Tarapur Atomic Power Station pioneered atomic electricity generation on the Indian power grid.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q3", "stk_7",
            "भारत का 'सबसे बड़ा परमाणु ऊर्जा संयंत्र' (Largest Nuclear Power Plant in India - क्षमता 2,000 MW) कौन-सा है जो रूस के सहयोग से तमिलनाडु के तिरुनेलवेली में स्थापित किया गया है?",
            "Which is currently the largest nuclear power plant in India by operational capacity (2,000 MW from two 1,000 MW VVER units), built in collaboration with Russia in southern Tamil Nadu?",
            listOf("कैगा (कर्नाटक - 880 MW)", "कुडनकुलम परमाणु ऊर्जा संयंत्र, तमिलनाडु (Kudankulam Nuclear Power Plant - KKNPP, Tirunelveli, Tamil Nadu / Russian Atomstroyexport VVER-1000 pressurized water reactors / Total planned 6,000 MW)", "काकरापार (गुजरात)", "नरौरा (उत्तर प्रदेश)"),
            listOf("Kaiga Generating Station (Uttara Kannada, Karnataka)", "Kudankulam Nuclear Power Plant (Located on the coast of the Gulf of Mannar; India's first pressurized water reactor facility with highest installed commercial capacity)", "Kakrapar (Surat, Gujarat - 700 MW indigenous PHWRs)", "Narora (Bulandshahr, Uttar Pradesh)"),
            1,
            "कुडनकुलम परमाणु ऊर्जा संयंत्र (तिरुनेलवेली, तमिलनाडु) भारत का सबसे बड़ा परमाणु ऊर्जा संयंत्र है। इसे रूस के सहयोग से 1,000 MW क्षमता वाले दो VVER-1000 रिएक्टरों से संचालित किया जा रहा है (कुल क्षमता 6,000 MW तक विस्तारित की जा रही है)।",
            "Kudankulam provides clean baseload nuclear power powering industrial grids across Tamil Nadu, Karnataka, and Kerala.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q4", "stk_7",
            "विश्व का सबसे ऊंचा युद्धक्षेत्र 'सियाचिन ग्लेशियर' (Siachen Glacier - 5,400 मीटर ऊंचाई) किस पर्वत श्रृंखला में स्थित है जिसे 1984 में 'ऑपरेशन मेघदूत' द्वारा भारतीय सेना ने अपने नियंत्रण में लिया था?",
            "The Siachen Glacier, known as the world's highest and coldest battlefield (extending 76 km), is located in which mountain range of the trans-Himalayan region?",
            listOf("पीर पंजाल श्रृंखला", "पूर्वी काराकोरम श्रृंखला (Eastern Karakoram Range / Saltoro Ridge / Siachen Glacier / Nubra River origin / Operation Meghdoot 13 April 1984 / Point NJ9842)", "जास्कर श्रृंखला", "शिवालिक श्रृंखला"),
            listOf("Pir Panjal Range", "Eastern Karakoram Range (Located just northeast of Point NJ9842 where Line of Control ends; forms the divide between Shaksgam Valley and Nubra Valley; Operation Meghdoot launched on 13 April 1984)", "Zanskar Range", "Shiwalik Range"),
            1,
            "सियाचिन ग्लेशियर (76 किमी लंबा) पूर्वी काराकोरम पर्वत श्रृंखला में साल्टोरो रिज पर स्थित दुनिया का सबसे ऊंचा युद्धक्षेत्र है। 13 अप्रैल 1984 को भारतीय सेना ने 'ऑपरेशन मेघदूत' चलाकर पूरे सियाचिन ग्लेशियर और बिलाफोंड ला, सिया ला दर्रों पर तिरंगा फहराया था। इससे 'नुब्रा नदी' निकलती है।",
            "Operation Meghdoot on the Siachen Glacier demonstrated extraordinary high-altitude warfare endurance by the Indian Armed Forces.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q5", "stk_7",
            "भारत का 'सबसे लंबा नदी पुल' (Longest River Bridge in India - 9.15 किमी) 'भूपेन हजारिका सेतु' (ढोला-सादिया पुल) किस नदी पर बना है जो असम और अरुणाचल प्रदेश को जोड़ता है?",
            "The 9.15 km long Dhola-Sadiya Bridge (officially named Bhupen Hazarika Setu and inaugurated in May 2017), the longest water bridge in India, is built across which major tributary of the Brahmaputra River?",
            listOf("सुबनसिरी नदी", "लोहित नदी / लोहित-ब्रह्मपुत्र बेसिन, असम-अरुणाचल (Lohit River / Dhola-Sadiya Bridge - 9.15 km / Connects Dhola in Assam to Sadiya / Named after Bharat Ratna Dr. Bhupen Hazarika)", "दिबांग नदी", "तीस्ता नदी"),
            listOf("Subansiri River", "Lohit River (A major Himalayan tributary of Brahmaputra; bridge connects Tinsukia in Assam to Sadiya, slashing travel time to Arunachal Pradesh border from 6 hours to 30 minutes)", "Dibang River", "Teesta River"),
            1,
            "भूपेन हजारिका सेतु (ढोला-सादिया पुल - 9.15 किमी) लोहित नदी (ब्रह्मपुत्र की सहायक नदी) पर बना भारत का सबसे लंबा नदी पुल है। यह असम के तिनसुकिया जिले के ढोला को सादिया से जोड़ता है और भारतीय सेना के भारी टैंकों (अर्जुन और टी-90) की आवाजाही में सक्षम है। (भारत का सबसे लंबा समुद्री पुल अटल सेतु - MTHL 21.8 किमी है)।",
            "The Bhupen Hazarika Setu is a strategic infrastructure lifeline for civilian commerce and defense mobility in the Northeast.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q6", "stk_7",
            "भारत का 'सबसे लंबा समुद्री पुल' (Longest Sea Bridge in India - 21.8 किमी) 'अटल सेतु' (Mumbai Trans Harbour Link - MTHL), जिसका उद्घाटन जनवरी 2024 में हुआ, किन दो शहरों को जोड़ता है?",
            "The 21.8 km long Atal Bihari Vajpayee Sewri-Nhava Sheva Atal Setu (MTHL - inaugurated in January 2024), India's longest bridge and longest sea bridge, connects Mumbai Island with which mainland city?",
            listOf("मुंबई और ठाणे", "सेवरी (दक्षिण मुंबई) और न्हावा शेवा (नवी मुंबई) / Sewri, South Mumbai to Chirle, Nhava Sheva, Navi Mumbai (21.8 km - 16.5 km over the Arabian Sea / 6-lane expressway)", "मुंबई और अलीबाग", "मुंबई और वसई"),
            listOf("Mumbai and Thane", "Sewri (Mumbai Island) and Chirle / Nhava Sheva (Navi Mumbai) - 21.8 km total length with 16.5 km over Thane Creek / Arabian Sea; reduces travel time between South Mumbai and Navi Mumbai from 2 hours to 20 minutes", "Mumbai and Alibaug", "Mumbai and Vasai"),
            1,
            "अटल सेतु (MTHL - 21.8 किमी) भारत का सबसे लंबा पुल और सबसे लंबा समुद्री पुल है (16.5 किमी समुद्र के ऊपर)। यह दक्षिण मुंबई के सेवरी को नवी मुंबई के न्हावा शेवा (चिरले) से जोड़ता है। इसका निर्माण पर्यावरण-अनुकूल ऑर्थोट्रोपिक स्टील डेक (OSD) तकनीक से किया गया है ताकि राजहंस पक्षियों (Flamingos) के पर्यावास को नुकसान न पहुंचे।",
            "Atal Setu is an engineering marvel transforming connectivity across the Mumbai Metropolitan Region.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q7", "stk_7",
            "विश्व की सबसे ऊंची पर्वत सड़क सुरंग (World's Longest Highway Tunnel above 10,000 Feet - 9.02 किमी) 'अटल टनल' (Atal Tunnel) हिमाचल प्रदेश में किस दर्रे के नीचे पीर पंजाल श्रेणी में बनाई गई है?",
            "The 9.02 km long Atal Tunnel, the world's longest single-tube highway tunnel above 10,000 feet (3,048 m) built by the Border Roads Organisation (BRO), passes beneath which Himalayan pass?",
            listOf("शिपकी ला दर्रा", "रोहतांग दर्रा / पीर पंजाल श्रेणी, हिमाचल प्रदेश (Rohtang Pass / Atal Tunnel - 9.02 km / Connects Manali to Lahaul-Spiti Valley & Leh / Horseshoe shaped single tube / Inaugurated Oct 2020)", "बारालाचा ला दर्रा", "नाथू ला दर्रा"),
            listOf("Shipki La Pass (Kinnaur)", "Rohtang Pass (Cut through Pir Panjal Range under 3,978 m high Rohtang Pass; connects Manali to Sissu in Lahaul Valley, providing all-weather connectivity and reducing distance by 46 km)", "Bara-lacha La Pass", "Nathu La Pass (Sikkim)"),
            1,
            "अटल टनल (9.02 किमी) हिमाचल प्रदेश में रोहतांग दर्रे (3,978 मी.) के नीचे पीर पंजाल श्रेणी में बनाई गई है। यह 10,000 फीट से अधिक ऊंचाई पर दुनिया की सबसे लंबी राजमार्ग सुरंग है। इसे सीमा सड़क संगठन (BRO) ने बनाया और 3 अक्टूबर 2020 को प्रधानमंत्री नरेंद्र मोदी ने इसका उद्घाटन किया।",
            "Atal Tunnel provides year-round strategic and socio-economic connectivity between Manali, Lahaul-Spiti, and Ladakh.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q8", "stk_7",
            "विश्व का 'सबसे ऊंचा रेलवे मेहराब पुल' (World's Highest Railway Arch Bridge - 359 मीटर ऊंचाई, जो एफिल टॉवर से 35 मीटर ऊंचा है) जम्मू और कश्मीर में किस नदी पर बनाया गया है?",
            "The monumental Chenab Rail Bridge (359 meters above riverbed, 1,315 m long), recognized as the highest railway arch bridge in the world, is built over which river in Reasi district, J&K?",
            listOf("झेलम नदी", "चिनाब नदी / रियासी, जम्मू-कश्मीर (Chenab River, Reasi, J&K - USBRL Project / 359m above river bed / 35m higher than Eiffel Tower / Designed to withstand blast & 260 km/h winds)", "रावी नदी", "सिंधु नदी"),
            listOf("Jhelum River", "Chenab River (Part of the Udhampur-Srinagar-Baramulla Rail Link - USBRL; steel arch bridge built with specialized blast-proof steel by Konkan Railway; withstands Zone-V earthquakes)", "Ravi River", "Indus River"),
            1,
            "चिनाब रेलवे ब्रिज (रियासी, जम्मू-कश्मीर) नदी तल से 359 मीटर की ऊंचाई पर बना दुनिया का सबसे ऊंचा रेलवे आर्च ब्रिज है। यह एफिल टॉवर (330 मी.) से 35 मीटर ऊंचा है। यह 'उधमपुर-श्रीनगर-बारामूला रेल लिंक' (USBRL) का हिस्सा है जो कश्मीर घाटी को शेष भारत के रेल नेटवर्क से जोड़ता है।",
            "The Chenab Bridge is an epochal civil engineering achievement triumphing over rugged Himalayan seismic terrain.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q9", "stk_7",
            "विश्व का 'पहला 100% सौर ऊर्जा संचालित हवाई अड्डा' (World's First Fully Solar-Powered Airport) 2015 में कौन-सा बना जिसे संयुक्त राष्ट्र द्वारा 'चैंपियंस ऑफ द अर्थ' पुरस्कार से सम्मानित किया गया?",
            "Which international airport in India made history in August 2015 by becoming the world's first fully solar-powered airport, operating entirely on 46,000 solar panels?",
            listOf("इंदिरा गांधी अंतरराष्ट्रीय हवाई अड्डा, नई दिल्ली", "कोचीन अंतरराष्ट्रीय हवाई अड्डा लिमिटेड / सीआईएएल, केरल (Cochin International Airport - CIAL, Nedumbassery, Kochi, Kerala / UN Champions of the Earth Award 2018)", "केम्पेगौड़ा अंतरराष्ट्रीय हवाई अड्डा, बेंगलुरु", "राजीव गांधी अंतरराष्ट्रीय हवाई अड्डा, हैदराबाद"),
            listOf("Indira Gandhi International Airport, New Delhi", "Cochin International Airport (CIAL - Built as India's first PPP model airport; installed a 12 MWp solar power plant generating 50,000 units of electricity daily; won UN Champions of the Earth Award)", "Kempegowda International Airport, Bengaluru", "Rajiv Gandhi International Airport, Hyderabad"),
            1,
            "कोचीन अंतरराष्ट्रीय हवाई अड्डा (CIAL - नेदुंबस्सेरी, कोच्चि, केरल) 2015 में 100% सौर ऊर्जा से संचालित होने वाला विश्व का पहला हवाई अड्डा बना। 2018 में संयुक्त राष्ट्र पर्यावरण कार्यक्रम (UNEP) ने CIAL को सर्वोच्च पर्यावरण सम्मान 'चैंपियंस ऑफ द अर्थ' प्रदान किया।",
            "Cochin International Airport pioneered the global green airport transition, proving that large-scale infrastructure can run sustainably on solar energy.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q10", "stk_7",
            "भारत का 'सबसे व्यस्त हवाई अड्डा' (Busiest Airport in India) कौन-सा है जो यात्री संख्या और कार्गो दोनों में शीर्ष पर है?",
            "Which airport is the busiest in India and among the top 10 busiest airports in the world by passenger traffic, operating three terminals and four runways?",
            listOf("छत्रपति शिवाजी महाराज अंतरराष्ट्रीय हवाई अड्डा, मुंबई", "इंदिरा गांधी अंतरराष्ट्रीय हवाई अड्डा / आईजीआई, नई दिल्ली (Indira Gandhi International Airport - IGIA, New Delhi / Operated by DIAL / 4 Runways / 73+ million passengers annually)", "केम्पेगौड़ा हवाई अड्डा, बेंगलुरु", "नेताजी सुभाष चंद्र बोस हवाई अड्डा, कोलकाता"),
            listOf("Chhatrapati Shivaji Maharaj International Airport, Mumbai (2nd busiest)", "Indira Gandhi International Airport (IGIA New Delhi; handles over 73 million passengers annually; first airport in India with four operational runways and an elevated dual taxiway)", "Kempegowda International Airport, Bengaluru (3rd busiest)", "Netaji Subhas Chandra Bose International Airport, Kolkata"),
            1,
            "इंदिरा गांधी अंतरराष्ट्रीय हवाई अड्डा (IGI, नई दिल्ली) भारत का सबसे व्यस्त हवाई अड्डा है। यहाँ 4 चालू रनवे और एक एलिवेटेड क्रॉस टैक्सीवे (ECT) है। दूसरे स्थान पर मुंबई का छत्रपति शिवाजी महाराज अंतरराष्ट्रीय हवाई अड्डा है।",
            "IGI Airport New Delhi serves as India's premier international aviation hub and global transit gateway.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q11", "stk_7",
            "विश्व की सबसे ऊंची प्रतिमा 'स्टैच्यू ऑफ यूनिटी' (Statue of Unity - 182 मीटर / 597 फीट ऊंचाई) गुजरात के किस जिले में नर्मदा नदी पर साधु बेट द्वीप पर स्थित है?",
            "The Statue of Unity, the world's tallest statue measuring 182 meters (597 ft), honoring Sardar Vallabhbhai Patel, is situated on Sadhu Bet island in which district of Gujarat?",
            listOf("भरूच", "नर्मदा जिला / केवड़िया / एकता नगर, गुजरात (Narmada District, Ekta Nagar / Kevadia, Gujarat - Sadhu Bet island / Sardar Sarovar Dam / Sculptor: Padma Bhushan Ram V. Sutar / Inaugurated 31 Oct 2018)", "वडोदरा", "सूरत"),
            listOf("Bharuch", "Narmada District, Gujarat (Facing Sardar Sarovar Dam on Narmada River; designed by master sculptor Ram V. Sutar; height of 182 meters represents the 182 constituencies of Gujarat Legislative Assembly)", "Vadodara", "Surat"),
            1,
            "स्टैच्यू ऑफ यूनिटी (182 मीटर) दुनिया की सबसे ऊंची प्रतिमा है (चीन की स्प्रिंग टेम्पल बुद्ध 128 मी. से 54 मी. ऊंची)। यह गुजरात के नर्मदा जिले में केवड़िया (एकता नगर) के साधु बेट द्वीप पर सरदार सरोवर बांध के सामने स्थित है। इसके मूर्तिकार 'राम वी. सुतार' हैं। 182 मीटर की ऊंचाई गुजरात विधानसभा की 182 सीटों का प्रतीक है।",
            "The Statue of Unity is a monumental tribute to Sardar Patel's iron resolve in unifying the Indian nation.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q12", "stk_7",
            "विश्व का सबसे बड़ा क्रिकेट स्टेडियम 'नरेंद्र मोदी स्टेडियम' (Narendra Modi Stadium - क्षमता 1,32,000 दर्शक) गुजरात के किस शहर के मोटेरा में स्थित है?",
            "Which is the world's largest cricket and sports stadium with a record seating capacity of 132,000 spectators, located in the Motera neighborhood along the Sabarmati River?",
            listOf("सूरत", "अहमदाबाद, गुजरात (Narendra Modi Stadium / Motera Stadium, Ahmedabad, Gujarat - Capacity: 132,000 / Sub-air drainage system & LED floodlights / Hosted 2023 ICC World Cup Final)", "वडोदरा", "राजकोट"),
            listOf("Surat", "Ahmedabad, Gujarat (Spread over 63 acres; hosted 'Namaste Trump' event in Feb 2020 and 2023 Cricket World Cup final; features 4 dressing rooms, indoor cricket academy, and Olympic-sized swimming pool)", "Vadodara", "Rajkot"),
            1,
            "नरेंद्र मोदी स्टेडियम (मोटेरा, अहमदाबाद, गुजरात) 1,32,000 दर्शकों की क्षमता के साथ दुनिया का सबसे बड़ा क्रिकेट स्टेडियम है। (दूसरे स्थान पर ऑस्ट्रेलिया का मेलबर्न क्रिकेट ग्राउंड - MCG, क्षमता 1,00,024 दर्शक है)। यहाँ अत्याधुनिक सब-एयर ड्रेनेज सिस्टम लगा है जिससे बारिश रुकने के 30 मिनट बाद मैच शुरू हो सकता है।",
            "The Narendra Modi Stadium stands as a colossus of modern sports infrastructure hosting historic global cricketing tournaments.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q13", "stk_7",
            "भारत का 'पहला 100% जैविक राज्य' (World's First 100% Organic State) 2016 में कौन-सा बना जिसे संयुक्त राष्ट्र खाद्य एवं कृषि संगठन (FAO) द्वारा 'फ्यूचर पॉलिसी गोल्ड अवार्ड' से सम्मानित किया गया?",
            "Which northeastern state made history in January 2016 by becoming the first 100% organic state in the world, having phased out chemical fertilizers and pesticides completely across its agricultural land?",
            listOf("मेघालय", "सिक्किम (Sikkim - Declared 100% Organic State in Jan 2016 by PM Modi / Won UN FAO Future Policy Gold Award 2018 / 75,000 hectares of organic farmland)", "अरुणाचल प्रदेश", "नागालैंड"),
            listOf("Meghalaya", "Sikkim (Sikkim Organic Mission launched in 2003; completely eliminated chemical pesticides, synthetic fertilizers, and GMOs across 76,000 hectares of agricultural land; benefits 66,000+ farming families)", "Arunachal Pradesh", "Nagaland"),
            1,
            "सिक्किम जनवरी 2016 में दुनिया का पहला 100% जैविक (Organic) राज्य बना। 2003 में मुख्यमंत्री पवन चामलिंग ने सिक्किम ऑर्गेनिक मिशन शुरू किया था। 2018 में रोम में यूएन-एफएओ (FAO) ने सिक्किम को 'फ्यूचर पॉलिसी गोल्ड अवार्ड' (ऑस्कर ऑफ पॉलिसीज) प्रदान किया।",
            "Sikkim is a global beacon of eco-friendly sustainable agriculture and chemical-free regenerative farming.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q14", "stk_7",
            "विश्व की सबसे गहरी मीठे पानी की झील 'बैकाल झील' (Lake Baikal - गहराई 1,642 मीटर) किस देश के साइबेरिया क्षेत्र में स्थित है जो विश्व के कुल गैर-जमे हुए मीठे पानी का 20% धारण करती है?",
            "Lake Baikal, recognized as the world's deepest (1,642 m / 5,387 ft) and oldest (~25 million years) freshwater lake containing 20% of the world's unfrozen surface freshwater, is located in:",
            listOf("कनाडा (ग्रेट स्लेव झील)", "रूस / साइबेरिया (Russia / Siberia - Lake Baikal / 'Pearl of Siberia' / UNESCO 1996 / Endemic Baikal seal / Nerpa & Omul fish)", "संयुक्त राज्य अमेरिका (सुपीरियर झील)", "कजाकिस्तान"),
            listOf("Canada (Great Slave Lake)", "Russia (Located in southern Siberia near Irkutsk; rift lake formed along the Baikal Rift Zone; harbors 2,500+ endemic plant and animal species including the freshwater Nerpa seal)", "United States (Lake Superior - Largest by surface area)", "Kazakhstan (Lake Balkhash)"),
            1,
            "बैकाल झील (साइबेरिया, रूस) विश्व की सबसे गहरी (1,642 मीटर) और सबसे प्राचीन (2.5 करोड़ वर्ष पुरानी) मीठे पानी की झील है। इसमें दुनिया की सभी झीलों और नदियों के कुल तरल मीठे पानी का 20% हिस्सा समाहित है। (विश्व की सबसे बड़ी झील क्षेत्रफल के अनुसार 'कैस्पियन सागर' है और मीठे पानी की सबसे बड़ी झील 'सुपीरियर झील' है)।",
            "Lake Baikal is an unparalleled ecological treasure known as the 'Galapagos of Russia' for its evolutionary biodiversity.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_7_m1_q15", "stk_7",
            "विश्व का 'सबसे बड़ा द्वीप' (World's Largest Island by Area - 21.6 लाख वर्ग किमी) कौन-सा है जो भौगोलिक रूप से उत्तरी अमेरिका और राजनीतिक रूप से डेनमार्क के अधीन है?",
            "Which is the largest island in the world by surface area (covering 2,166,086 sq km), physically part of the North American continent but politically an autonomous territory of the Kingdom of Denmark?",
            listOf("न्यू गिनी (द्वितीय सबसे बड़ा)", "ग्रीनलैंड (Greenland - Kalaallit Nunaat / Capital: Nuuk / Area: 2.16 million sq km / 80% covered by Greenland ice sheet / Kingdom of Denmark)", "बोर्नियो (तृतीय सबसे बड़ा)", "मेडागास्कर (चौथा सबसे बड़ा)"),
            listOf("New Guinea (2nd largest island - 785,753 sq km)", "Greenland (World's largest non-continental island; Arctic autonomous territory with capital Nuuk; vast ice sheet up to 3 km thick holding 8% of Earth's fresh water)", "Borneo (3rd largest island - 748,168 sq km)", "Madagascar (4th largest island - 587,041 sq km)"),
            1,
            "ग्रीनलैंड (क्षेत्रफल: 21.6 लाख वर्ग किमी) विश्व का सबसे बड़ा द्वीप है। यह भौगोलिक दृष्टि से उत्तरी अमेरिका महाद्वीप का भाग है, लेकिन राजनीतिक रूप से डेनमार्क (यूरोप) का एक स्वायत्त क्षेत्र है। इसकी राजधानी 'नूक' (Nuuk) है।\nविश्व के 4 सबसे बड़े द्वीप:\n1. ग्रीनलैंड (21.6 लाख वर्ग किमी)\n2. न्यू गिनी (7.8 लाख वर्ग किमी)\n3. बोर्नियो (7.4 लाख वर्ग किमी)\n4. मेडागास्कर (5.8 लाख वर्ग किमी)",
            "Greenland is a colossal Arctic wonderland whose massive ice sheet plays a decisive role in regulating global sea levels and oceanic currents.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + StaticGkQuestionHelper.generateTopicMocks("stk_7", 2, 5, baseQuestions)
    }
}
