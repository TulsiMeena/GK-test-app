package com.example.ui.data

import com.example.ui.data.StaticGkQuestionHelper.makeStaticGkQ
import com.example.ui.model.GkQuestion

object StaticGkTopic3ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeStaticGkQ(
            "stk_3_m6_q1", "stk_3",
            "भारत का 'राष्ट्रीय वृक्ष' (National Tree of India) कौन-सा है जिसे 'कल्पवृक्ष' भी माना जाता है और जिसका वानस्पतिक नाम 'फिकस बेंगालेंसिस' (Ficus benghalensis) है?",
            "Which immortal tree, scientifically named Ficus benghalensis and revered in Indian culture for its expansive aerial prop roots and ecological canopy, is the National Tree of India?",
            listOf("पीपल (Ficus religiosa)", "बरगद / वट वृक्ष (Banyan Tree - Ficus benghalensis / Symbol of eternal life, cosmic longevity & shade / National Tree of India)", "नीम (Azadirachta indica)", "आम (Mangifera indica)"),
            listOf("Peepal (Ficus religiosa)", "Banyan Tree (Ficus benghalensis - Revered for expansive root system and centuries-long lifespan; symbolizes immortality and cosmic vitality)", "Neem (Azadirachta indica)", "Mango (National Fruit - Mangifera indica)"),
            1,
            "भारत का राष्ट्रीय वृक्ष 'बरगद' (Banyan Tree / वट वृक्ष - Ficus benghalensis) है। इसकी शाखाएं जमीन में जड़ें (Prop roots) जमाकर विशाल रूप ले लेती हैं, जो अनंत जीवन और दृढ़ता का प्रतीक है। (भारत का 'राष्ट्रीय फल' आम - Mangifera indica है और 'राष्ट्रीय पुष्प' कमल - Nelumbo nucifera है)।",
            "The Banyan Tree's unfurling canopy and enduring strength make it a poignant natural symbol of Indian cultural resilience.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q2", "stk_3",
            "भारत का 'राष्ट्रीय पक्षी' (National Bird of India) 'भारतीय मोर' (Indian Peacock) का वैज्ञानिक नाम क्या है जिसे 1963 में राष्ट्रीय पक्षी घोषित किया गया था?",
            "What is the binomial scientific name of the Indian Peacock, crowned as the National Bird of India on 1 February 1963 for its breathtaking plumage and mythological sanctity?",
            listOf("पैंथेरा टाइग्रिस (बाघ)", "पावो क्रिस्टेटस (Pavo cristatus - Indian Peafowl / Indian Peacock / Protected under Schedule I of Wildlife Protection Act 1972)", "कोरासियस बेंगालेंसिस (नीलकंठ)", "ग्रस एंटीगोन (सारस क्रेन)"),
            listOf("Panthera tigris (Royal Bengal Tiger)", "Pavo cristatus (Male bird with iridescent blue neck, fan-shaped crest, and magnificent iridescent green-bronze eye-spotted tail train)", "Coracias benghalensis (Indian Roller)", "Grus antigone (Sarus Crane)"),
            1,
            "भारत का राष्ट्रीय पक्षी 'मोर' (Indian Peafowl) है जिसका वैज्ञानिक नाम 'पावो क्रिस्टेटस' (Pavo cristatus) है। इसे 1963 में राष्ट्रीय पक्षी घोषित किया गया था। यह भारतीय वन्यजीव संरक्षण अधिनियम 1972 की अनुसूची-1 के तहत पूर्ण रूप से संरक्षित है।",
            "The Indian Peacock represents elegance, joy, beauty, and grace across Indian classical art, poetry, and temple sculptures.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q3", "stk_3",
            "भारत का 'राष्ट्रीय पुष्प' (National Flower of India) 'कमल' (Lotus) का वैज्ञानिक वानस्पतिक नाम क्या है जो पवित्रता और शुभता का प्रतीक है?",
            "What is the botanical scientific name of the sacred Lotus flower, chosen as the National Flower of India for embodying purity, beauty, and detachment?",
            listOf("रोसा इंडिका (गुलाब)", "नेलम्बो न्यूसिफेरा (Nelumbo nucifera Gaertn - Sacred Lotus / Hydrophyte with floating orbicular leaves / National Flower of India)", "जैस्मिनम संबक (मोगरा)", "टैगेटस इरेक्टा (गेंदा)"),
            listOf("Rosa indica (Rose)", "Nelumbo nucifera (Aquatic perennial herb with peltate leaves and majestic fragrant pink-white petals that remain untouched by murky waters)", "Jasminum sambac (Jasmine)", "Tagetes erecta (Marigold)"),
            1,
            "भारत का राष्ट्रीय पुष्प 'कमल' (Sacred Lotus) है जिसका वानस्पतिक नाम 'नेलम्बो न्यूसिफेरा' (Nelumbo nucifera) है। यह कीचड़ में खिलने के बावजूद जल और गंदगी से अप्रभावित रहता है, जो भारतीय दर्शन में अनासक्ति (Detachment) और निर्मलता का प्रतीक है।",
            "The sacred Lotus symbolizes pristine spiritual elevation, purity of heart, and cosmic creation across ancient Indian civilization.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q4", "stk_3",
            "भारत का 'राष्ट्रीय फल' (National Fruit of India) 'आम' (Mango) का वानस्पतिक नाम क्या है जिसे 'फलों का राजा' कहा जाता है?",
            "What is the botanical scientific name of the Mango, celebrated as the 'King of Fruits' and officially recognized as the National Fruit of India?",
            listOf("मूसा पैराडिसियाका (केला)", "मैंगीफेरा इंडिका (Mangifera indica - Mango / 'King of Fruits' / National Fruit of India & Pakistan / National Tree of Bangladesh)", "सिट्रस लिमोन (नींबू)", "पायरस मैलस (सेब)"),
            listOf("Musa paradisiaca (Banana)", "Mangifera indica (Indigenous tropical stone-fruit cultivated in India for over 4,000 years; represents tropical abundance, fertility, and sweetness)", "Citrus limon (Lemon)", "Pyrus malus (Apple)"),
            1,
            "भारत का राष्ट्रीय फल 'आम' है जिसका वानस्पतिक नाम 'मैंगीफेरा इंडिका' (Mangifera indica) है। भारत दुनिया का सबसे बड़ा आम उत्पादक देश है (अल्फांसो, दशहरी, लंगड़ा, चौसा, केसर प्रमुख किस्में हैं)। यह पाकिस्तान का भी राष्ट्रीय फल और बांग्लादेश का राष्ट्रीय वृक्ष है।",
            "The Mango is woven into Indian hospitality, summer folklore, classical art motifs (Paisley/Kalka), and culinary traditions.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q5", "stk_3",
            "उत्तर प्रदेश का 'राजकीय पशु' (State Animal of Uttar Pradesh) कौन-सा दलदली हिरण है जिसके सींगों में 12 शाखाएं होती हैं?",
            "Which magnificent swamp deer, characterized by antlers bearing twelve or more tines, is the official State Animal of Uttar Pradesh and Madhya Pradesh?",
            listOf("चिंकारा", "बारहसिंगा / दलदली हिरण (Barasingha / Swamp Deer - Rucervus duvaucelii / State Animal of UP & MP / Dudhwa & Kanha National Parks)", "काला हिरण (Blackbuck)", "कस्तूरी मृग (Musk Deer)"),
            listOf("Chinkara (Indian Gazelle)", "Barasingha / Swamp Deer (Rucervus duvaucelii - Saved from extinction in Kanha and Dudhwa National Parks; mascot 'Bhoorsingh the Barasingha')", "Blackbuck (State Animal of AP, Haryana & Punjab)", "Musk Deer (State Animal of Uttarakhand)"),
            1,
            "उत्तर प्रदेश (और मध्य प्रदेश) का राजकीय पशु 'बारहसिंगा' (Barasingha - Rucervus duvaucelii) है।\nउत्तर प्रदेश के अन्य राजकीय प्रतीक:\n- राजकीय पक्षी: सारस क्रेन (Sarus Crane - Grus antigone)\n- राजकीय वृक्ष: अशोक (Saraca asoca)\n- राजकीय पुष्प: पलाश / ढाक (Butea monosperma)",
            "The Barasingha is an iconic wetland herbivore whose conservation in Dudhwa and Kanha preserves central India's grassland biodiversity.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q6", "stk_3",
            "आंध्र प्रदेश, हरियाणा और पंजाब—इन तीनों राज्यों का संयुक्त 'राजकीय पशु' (State Animal of Andhra Pradesh, Haryana & Punjab) कौन-सा तेज दौड़ने वाला मृग है?",
            "Which elegant antelope with spiraling horns, scientifically named Antilope cervicapra, serves as the official State Animal of Andhra Pradesh, Haryana, and Punjab?",
            listOf("नीलगाय", "काला हिरण / कृष्णमृग (Blackbuck - Antilope cervicapra / Fastest Indian antelope / State Animal of AP, Haryana & Punjab / Sacred to Bishnoi community)", "सांभर", "चीतल"),
            listOf("Nilgai (Blue Bull)", "Blackbuck (Antilope cervicapra - Endemic to Indian plains; worshipped by the Bishnoi community for centuries; IUCN Least Concern)", "Sambar (State Animal of Odisha)", "Chital (Spotted Deer)"),
            1,
            "काला हिरण (Blackbuck - Antilope cervicapra) आंध्र प्रदेश, हरियाणा और पंजाब का राजकीय पशु है। यह भारत का सबसे तेज दौड़ने वाला मृग (80 किमी/घंटा) है। राजस्थान का बिश्नोई समुदाय इसे अपनी संतान के समान पवित्र मानकर इसकी रक्षा करता है।",
            "The Blackbuck is an agile and graceful inhabitant of Indian scrublands and open savannahs.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q7", "stk_3",
            "राजस्थान का आधिकारिक 'राजकीय पशु' (State Animal of Rajasthan) 2014 में वन्य श्रेणी में चिंकारा के साथ-साथ पशुधन (Livestock) श्रेणी में किसे घोषित किया गया?",
            "In 2014, the Government of Rajasthan declared which iconic 'Ship of the Desert' as the official State Animal in the domesticated livestock category alongside Chinkara in the wild category?",
            listOf("मारवाड़ी घोड़ा", "ऊंट (Camel - Camelus dromedarius / 'Ship of the Desert' / Declared State Animal in Livestock category on 30 June 2014)", "थारपारकर गाय", "मारवाड़ी भेड़"),
            listOf("Marwari Horse", "Camel (Dromedary one-humped camel - Declared State Animal under Rajasthan Camel Act 2015 to prevent slaughter and illegal migration)", "Tharparkar Cow", "Marwari Sheep"),
            1,
            "राजस्थान के दो राजकीय पशु हैं: 1. चिंकारा (वन्यजीव श्रेणी - 1981), 2. ऊंट (पशुधन/घरेलू श्रेणी - 2014)।\nराजस्थान के अन्य प्रतीक:\n- राजकीय पक्षी: गोडावण / ग्रेट इंडियन बस्टर्ड (Ardeotis nigriceps)\n- राजकीय वृक्ष: खेजड़ी (Prosopis cineraria - 'थार का कल्पवृक्ष')\n- राजकीय पुष्प: रोहिड़ा (Tecomella undulata)",
            "The Dromedary Camel is the timeless desert lifeline enabling pastoral communities to thrive in the arid Thar ecosystem.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q8", "stk_3",
            "केरल, कर्नाटक और झारखंड—इन तीनों राज्यों का संयुक्त 'राजकीय पशु' (State Animal of Kerala, Karnataka & Jharkhand) कौन-सा विशालकाय वन्यजीव है?",
            "Which majestic megaherbivore serves as the official State Animal for three Indian states: Kerala, Karnataka, and Jharkhand?",
            listOf("बाघ", "भारतीय हाथी (Indian Elephant - Elephas maximus indicus / State Animal of Kerala, Karnataka & Jharkhand / Project Elephant)", "तेंदुआ", "गौर (भारतीय बाइसन)"),
            listOf("Tiger", "Indian Elephant (Elephas maximus - Symbol of royal processions, temple festivals in Kerala, and wilderness heritage of Western Ghats & Chota Nagpur)", "Leopard", "Gaur / Indian Bison (State Animal of Bihar & Goa)"),
            1,
            "भारतीय हाथी (Elephas maximus) केरल, कर्नाटक और झारखंड का आधिकारिक राजकीय पशु है। भारत में हाथियों की सर्वाधिक संख्या कर्नाटक (6,049+) और दूसरे स्थान पर असम में पाई जाती है।",
            "The Indian Elephant commands profound reverence in the culture and biodiversity conservation policies of southern and eastern states.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q9", "stk_3",
            "लद्दाख का 'राजकीय पशु' (State Animal of Ladakh UT) और 'राजकीय पक्षी' (State Bird) 2021 में किसे घोषित किया गया?",
            "In September 2021, the Union Territory of Ladakh officially designated which high-altitude apex predator and endangered avian species as its State Animal and State Bird?",
            listOf("याक और तिब्बती तीतर", "हिम तेंदुआ (Snow Leopard - Panthera uncia) और काली गर्दन वाला सारस (Black-necked Crane - Grus nigricollis) / Ladakh UT State Symbols 2021", "तिब्बती भेड़िया और दाढ़ी वाला गिद्ध", "हिमालयन भूरा भालू और मोनाल"),
            listOf("Yak & Tibetan Partridge", "Snow Leopard (Panthera uncia - 'Ghost of the Mountains') and Black-necked Crane (Grus nigricollis - Breeds in Tso Kar & Changthang high altitude wetlands)", "Tibetan Wolf & Bearded Vulture", "Himalayan Brown Bear & Monal"),
            1,
            "सितंबर 2021 में लद्दाख केंद्र शासित प्रदेश ने 'हिम तेंदुआ' (Snow Leopard / Panthera uncia - हेमिस राष्ट्रीय उद्यान में सर्वाधिक) को राजकीय पशु और 'काली गर्दन वाले सारस' (Black-necked Crane / Grus nigricollis - चांगथांग क्षेत्र) को राजकीय पक्षी घोषित किया।",
            "Ladakh's state symbols spotlight the extreme-altitude biodiversity and trans-Himalayan ecological balance.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q10", "stk_3",
            "भारत का दूसरा सर्वोच्च नागरिक सम्मान 'पद्म विभूषण' (Padma Vibhushan - 1954) का पदक किस धातु और डिजाइन का होता है?",
            "What is the distinct design of India's second-highest civilian decoration 'Padma Vibhushan', instituted on 2 January 1954 to reward 'exceptional and distinguished service'?",
            listOf("सोने का त्रिकोण पदक", "गोलाकार कांस्य पदक जिसके केंद्र में कमल का फूल और चारों कोनों में ज्यामितीय पैटर्न (Circular toned bronze medal with embossed Lotus flower, 'Padma' & 'Vibhushan' in Devanagari)", "चांदी का अष्टकोणीय तारा", "प्लैटिनम का चक्र"),
            listOf("Gold Triangle", "Circular bronze medal with geometric embossed edges; obverse has a lotus flower in the center with words 'Padma' above and 'Vibhushan' below; reverse has State Emblem", "Silver Octagonal Star", "Platinum Wheel"),
            1,
            "पद्म पुरस्कारों की 3 श्रेणियां हैं (1954 में स्थापित):\n1. पद्म विभूषण (द्वितीय सर्वोच्च नागरिक सम्मान - असाधारण और विशिष्ट सेवा)\n2. पद्म भूषण (तृतीय सर्वोच्च - उच्च कोटि की विशिष्ट सेवा)\n3. पद्म श्री (चतुर्थ सर्वोच्च - किसी भी क्षेत्र में विशिष्ट सेवा)\nये पुरस्कार प्रतिवर्ष गणतंत्र दिवस की पूर्व संध्या पर घोषित किए जाते हैं।",
            "The Padma Awards recognize multifaceted civilian contributions across art, science, social work, literature, and sports.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q11", "stk_3",
            "भारत के एक वर्ष में अधिकतम कितने व्यक्तियों को 'भारत रत्न' (Bharat Ratna) सम्मान दिया जा सकता है, यद्यपि 2024 में अपवाद स्वरूप 5 महान विभूतियों को यह सम्मान दिया गया?",
            "Under standard presidential regulations, what is the maximum number of Bharat Ratna awards that can normally be conferred in a single calendar year (as amended in exceptions like 1999 & 2024)?",
            listOf("1 व्यक्ति", "अधिकतम 3 व्यक्ति (Maximum 3 recipients per year / 2024 exception: 5 awardees - Karpoori Thakur, L. K. Advani, P. V. Narasimha Rao, Charan Singh, M. S. Swaminathan)", "अधिकतम 5 व्यक्ति", "कोई सीमा नहीं"),
            listOf("1 Person", "Maximum 3 Persons (General rule restricts recommendations to maximum 3 in a calendar year; 2024 set a historic record with 5 awardees announced by President Droupadi Murmu)", "Maximum 5 Persons", "No statutory limit"),
            1,
            "सामान्य नियमानुसार एक वर्ष में अधिकतम 3 व्यक्तियों को भारत रत्न दिया जा सकता है। लेकिन 1999 में 4 व्यक्तियों को (जयप्रकाश नारायण, अमर्त्य सेन, गोपीनाथ बोरदोलोई, पं. रवि शंकर) और 2024 में 5 व्यक्तियों को (कर्पूरी ठाकुर, लालकृष्ण आडवाणी, पी. वी. नरसिम्हा राव, चौधरी चरण सिंह, डॉ. एम. एस. स्वामीनाथन) भारत रत्न प्रदान किया गया।",
            "Bharat Ratna recommendations are made by the Prime Minister directly to the President of India without formal committee quotas.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q12", "stk_3",
            "1999 के कारगिल युद्ध में 'ऑपरेशन विजय' के दौरान 'ये दिल मांगे मोर!' का विजय उद्घोष करने वाले और मरणोपरांत परमवीर चक्र से सम्मानित अमर बलिदानी कौन थे?",
            "Which legendary Captain of 13 JAK Rifles was posthumously awarded the Param Vir Chakra for capturing Point 5140 and Point 4875 during the 1999 Kargil War, famous for his battle cry 'Yeh Dil Maange More!'?",
            listOf("मेजर सोमनाथ शर्मा", "कैप्टन विक्रम बत्रा / 'शेरशाह' (Captain Vikram Batra - 13 JAK RIF / Codenamed 'Shershah' / Point 5140 & Point 4875 capture / Param Vir Chakra 1999)", "लेफ्टिनेंट मनोज कुमार पांडे (1/11 GR)", "राइफलमैन संजय कुमार"),
            listOf("Major Somnath Sharma (1947)", "Captain Vikram Batra (13 Jammu and Kashmir Rifles; nicknamed 'Shershah'; sacrificed his life on 7 July 1999 clearing enemy bunkers on Point 4875 / Batra Top)", "Lieutenant Manoj Kumar Pandey (Posthumous PVC 1999 - Khalubar)", "Rifleman Sanjay Kumar (PVC recipient 1999)"),
            1,
            "कैप्टन विक्रम बत्रा (पालमपुर, हिमाचल प्रदेश - कोड नाम 'शेरशाह') ने 1999 कारगिल युद्ध में प्वाइंट 5140 और प्वाइंट 4875 (बत्रा टॉप) पर अदम्य साहस से तिरंगा फहराया और 7 जुलाई 1999 को अपने साथी को बचाते हुए वीरगति को प्राप्त हुए। उन्हें मरणोपरांत भारत का सर्वोच्च सैन्य सम्मान 'परमवीर चक्र' मिला।",
            "Captain Vikram Batra's electrifying courage and legendary valor made him an immortal national icon of the Indian Armed Forces.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q13", "stk_3",
            "भारतीय वायुसेना (Indian Air Force) के एकमात्र जांबाज अधिकारी कौन हैं जिन्हें 1971 के भारत-पाक युद्ध में श्रीनगर एयरफील्ड की रक्षा करते हुए मरणोपरांत 'परमवीर चक्र' (IAF's Only PVC) प्रदान किया गया?",
            "Who is the only officer of the Indian Air Force ever to be awarded the Param Vir Chakra, posthumously honored for defending Srinagar Airfield in his Gnat fighter on 14 December 1971 against six PAF Sabres?",
            listOf("मार्शल अर्जन सिंह", "फ्लाइंग ऑफिसर निर्मल जीत सिंह सेखों (Flying Officer Nirmal Jit Singh Sekhon - 18 Squadron 'Flying Bullets' / Folland Gnat / IAF's Sole Param Vir Chakra / 14 Dec 1971)", "विंग कमांडर राकेश शर्मा", "ग्रुप कैप्टन अभिनंदन वर्तमान"),
            listOf("Marshal of the Air Force Arjan Singh", "Flying Officer Nirmal Jit Singh Sekhon (18 Squadron; single-handedly engaged 6 Pakistani F-86 Sabre jets over Srinagar, shooting down two before his Gnat crashed)", "Wing Commander Rakesh Sharma", "Group Captain Abhinandan Varthaman (Vir Chakra 2019)"),
            1,
            "फ्लाइंग ऑफिसर निर्मल जीत सिंह सेखों (लुधियाना, पंजाब - 18 स्क्वाड्रन 'फ्लाइंग बुलेट्स') भारतीय वायुसेना के एकमात्र सदस्य हैं जिन्हें 'परमवीर चक्र' मिला है। 14 दिसंबर 1971 को उन्होंने अकेले अपने नैट (Gnat) विमान से श्रीनगर हवाई अड्डे पर हमला करने आए 6 पाकिस्तानी सेबर जेट्स का मुकाबला किया और 2 को मार गिराया।",
            "Nirmal Jit Singh Sekhon's heroic air combat defense remains unmatched in the annals of modern air warfare.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q14", "stk_3",
            "अंडमान और निकोबार द्वीप समूह के 21 सबसे बड़े अनाम द्वीपों का नामकरण 23 जनवरी 2023 (पराक्रम दिवस) को प्रधानमंत्री नरेंद्र मोदी द्वारा किनके नाम पर किया गया?",
            "On 23 January 2023 (Parakram Diwas - Netaji Subhas Chandra Bose Jayanti), the 21 largest unnamed islands of Andaman and Nicobar Islands were officially named after recipients of which gallantry award?",
            listOf("भारत रत्न विजेता", "21 परमवीर चक्र विजेता (21 Param Vir Chakra Awardees - Largest island named 'Somnath Dweep' after Major Somnath Sharma; Subedar Karam Singh Dweep, Batra Dweep etc.)", "अशोक चक्र विजेता", "महावीर चक्र विजेता"),
            listOf("Bharat Ratna Recipients", "21 Param Vir Chakra Awardees (Major Somnath Dweep, Major Shaitan Singh Dweep, Abdul Hamid Dweep, Captain Vikram Batra Dweep, Subedar Major Yogendra Singh Yadav Dweep etc.)", "Ashoka Chakra Awardees", "Maha Vir Chakra Awardees"),
            1,
            "23 जनवरी 2023 को नेताजी सुभाष चंद्र बोस की 126वीं जयंती (पराक्रम दिवस) पर अंडमान और निकोबार के 21 अनाम द्वीपों का नाम 21 परमवीर चक्र विजेताओं के नाम पर रखा गया। सबसे बड़े द्वीप का नाम प्रथम पीवीसी विजेता 'मेजर सोमनाथ शर्मा' के नाम पर 'सोमनाथ द्वीप' रखा गया।",
            "Naming the Andaman islands after Param Vir Chakra heroes pays immortal tribute to India's greatest battlefield defenders.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_3_m6_q15", "stk_3",
            "भारत का 'राष्ट्रीय सूक्ष्मजीव' (National Microbe of India) 2012 में किस जीवाणु को घोषित किया गया जो दूध को दही में बदलने का कार्य करता है?",
            "Which beneficial probiotic bacterium, essential for fermenting milk into curd, was officially declared as the 'National Microbe of India' in October 2012 at the International Biodiversity Conference in Hyderabad?",
            listOf("एस्चेरिचिया कोलाई (E. coli)", "लैक्टोबैसिलस डेलब्रुइकी उपप्रजाति बुल्गारिकस (Lactobacillus delbrueckii subsp. bulgaricus - National Microbe of India / Declared at COP-11 CBD Hyderabad 2012)", "राइजोबियम लेग्यूमिनोसोरम", "स्ट्रेप्टोकोकस थर्मोफिलस"),
            listOf("Escherichia coli", "Lactobacillus delbrueckii subsp. bulgaricus (Announced by Minister Jayanthi Natarajan at Science Express Biodiversity Special / Children voted to pick lactic acid bacteria)", "Rhizobium leguminosarum", "Streptococcus thermophilus"),
            1,
            "अक्टूबर 2012 में हैदराबाद में आयोजित संयुक्त राष्ट्र जैव विविधता सम्मेलन (COP-11) के दौरान 'लैक्टोबैसिलस बुल्गारिकस' (Lactobacillus bulgaricus) को भारत का 'राष्ट्रीय सूक्ष्मजीव' घोषित किया गया। यह जीवाणु दूध से दही जमाने और पाचन तंत्र को स्वस्थ रखने में अत्यंत उपयोगी है।",
            "Lactobacillus bulgaricus holds the unique status of being India's official national microbe celebrating micro-biodiversity.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + StaticGkQuestionHelper.generateTopicMocks("stk_3", 7, 10, baseQuestions)
    }
}
