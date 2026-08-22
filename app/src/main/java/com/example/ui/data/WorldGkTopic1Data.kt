package com.example.ui.data

import com.example.ui.data.WorldGkQuestionHelper.makeWorldGkQ
import com.example.ui.model.GkQuestion

object WorldGkTopic1Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeWorldGkQ(
            "wgk_1_m1_q1", "wgk_1",
            "क्षेत्रफल (Area) और जनसंख्या (Population) दोनों ही दृष्टियों से विश्व का सबसे बड़ा महाद्वीप कौन-सा है?",
            "Which is the largest continent on Earth in terms of both total land area and human population?",
            listOf("अफ्रीका", "एशिया (Asia)", "उत्तरी अमेरिका", "यूरोप"),
            listOf("Africa", "Asia (Covers ~30% of Earth's land area & ~60% of world population)", "North America", "Europe"),
            1,
            "एशिया पृथ्वी के कुल स्थलीय क्षेत्रफल का लगभग 30% भाग (4.45 करोड़ वर्ग किमी) घेरे हुए है और यहाँ विश्व की लगभग 60% आबादी निवास करती है।",
            "Asia is the largest continent by area (~44.58 million km²) and population (~4.7 billion), containing 48 UN member states.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q2", "wgk_1",
            "विश्व का सबसे छोटा महाद्वीप कौन-सा है जिसे 'द्वीपीय महाद्वीप' (Island Continent) भी कहा जाता है?",
            "Which is the smallest continent by land area on Earth, often termed the 'Island Continent'?",
            listOf("अंटार्कटिका", "ऑस्ट्रेलिया / ओशिनिया (Australia / Oceania)", "यूरोप", "दक्षिण अमेरिका"),
            listOf("Antarctica", "Australia / Oceania (Smallest continent surrounded by Indian and Pacific Oceans)", "Europe", "South America"),
            1,
            "ऑस्ट्रेलिया विश्व का सबसे छोटा महाद्वीप है (लगभग 77 लाख वर्ग किमी)। यह पूर्णतः दक्षिणी गोलार्ध में स्थित है और चारों ओर से महासागरों से घिरा होने के कारण इसे 'द्वीपीय महाद्वीप' कहा जाता है।",
            "Australia is the smallest continent with an area of ~7.69 million km². It is completely situated in the Southern Hemisphere.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q3", "wgk_1",
            "विश्व का सबसे बड़ा और सबसे गहरा महासागर कौन-सा है जिसमें 'मारियाना गर्त' (Mariana Trench - 11,022 मी.) स्थित है?",
            "Which is the largest and deepest ocean on Earth, containing the deepest known point Challenger Deep in the Mariana Trench?",
            listOf("अटलांटिक महासागर", "प्रशांत महासागर (Pacific Ocean)", "हिंद महासागर", "आर्कटिक महासागर"),
            listOf("Atlantic Ocean", "Pacific Ocean (Covers over 30% of Earth's surface; Challenger Deep ~10,994-11,022 m)", "Indian Ocean", "Arctic Ocean"),
            1,
            "प्रशांत महासागर पृथ्वी के एक तिहाई भाग पर फैला है (क्षेत्रफल: लगभग 16.5 करोड़ वर्ग किमी)। फिलीपींस के पूर्व में स्थित मारियाना गर्त (Challenger Deep, लगभग 11,022 मीटर) इसका सबसे गहरा बिंदु है।",
            "The Pacific Ocean is the largest ocean basin on Earth, bordered by the 'Ring of Fire' and housing the Mariana Trench (~11,022 m).",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q4", "wgk_1",
            "अंग्रेजी के अक्षर 'S' के आकार वाला विश्व का दूसरा सबसे बड़ा और सबसे व्यस्त व्यापारिक महासागर कौन-सा है?",
            "Which is the second-largest and commercially busiest ocean in the world, uniquely shaped like the English letter 'S'?",
            listOf("प्रशांत महासागर", "अटलांटिक महासागर (Atlantic Ocean - Mid-Atlantic Ridge)", "हिंद महासागर", "दक्षिणी महासागर"),
            listOf("Pacific Ocean", "Atlantic Ocean (S-shaped basin traversed by the 16,000 km Mid-Atlantic Ridge)", "Indian Ocean", "Southern Ocean"),
            1,
            "अटलांटिक महासागर यूरोप, अफ्रीका और अमेरिका महाद्वीपों के बीच 'S' आकार में फैला है। इसमें उत्तर से दक्षिण तक फैला विशाल 'मध्य अटलांटिक कटक' (Mid-Atlantic Ridge) स्थित है।",
            "The Atlantic Ocean occupies an elongated, S-shaped basin between the Americas to the west and Eurasia/Africa to the east.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q5", "wgk_1",
            "विश्व का एकमात्र महासागर कौन-सा है जिसका नाम किसी देश (भारत) के नाम पर रखा गया है?",
            "Which is the only ocean in the world named after a sovereign nation?",
            listOf("अटलांटिक महासागर", "हिंद महासागर (Indian Ocean)", "आर्कटिक महासागर", "दक्षिणी महासागर"),
            listOf("Atlantic Ocean", "Indian Ocean (Named after India / Hindustan)", "Arctic Ocean", "Southern Ocean"),
            1,
            "हिंद महासागर (Indian Ocean) विश्व का तीसरा सबसे बड़ा महासागर है। इसका नाम 'हिंदुस्तान' (भारत) के नाम पर पड़ा है। इसका सबसे गहरा गर्त 'सुंडा गर्त' (जावा गर्त, 7,450 मी.) है।",
            "The Indian Ocean is the third largest of the world's oceanic divisions, bounded by Asia to the north, Africa to the west, and Australia to the east.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q6", "wgk_1",
            "विश्व की सबसे लंबी नदी (Longest River in the World) कौन-सी है जो अफ्रीका महाद्वीप में विक्टोरिया झील से निकलकर भूमध्य सागर में गिरती है?",
            "Which is the world's longest river, flowing northwards across East Africa into the Mediterranean Sea (~6,650 km)?",
            listOf("अमेज़न नदी", "नील नदी (Nile River - 6,650 km)", "यांग्त्सी नदी", "मिसिसिपी-मिसौरी"),
            listOf("Amazon River", "Nile River (Length: ~6,650 km, draining into Mediterranean Sea)", "Yangtze River", "Mississippi-Missouri"),
            1,
            "नील नदी (Nile) लगभग 6,650 किमी लंबी है। यह व्हाइट नाइल (विक्टोरिया झील से) और ब्लू नाइल (ताना झील, इथियोपिया से) के मिलने से खार्तूम (सूडान) में बनती है और मिस्र (इजिप्ट) की जीवन रेखा कहलाती है।",
            "The Nile is the world's longest river, flowing through 11 countries in northeastern Africa before discharging into the Mediterranean Sea.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q7", "wgk_1",
            "जल प्रवाह की मात्रा (Water Discharge Volume) और बेसिन क्षेत्रफल की दृष्टि से विश्व की सबसे बड़ी नदी कौन-सी है?",
            "Which is the largest river in the world by water discharge volume and drainage basin area (~7 million km²)?",
            listOf("नील नदी", "अमेज़न नदी (Amazon River, South America - Discharges 20% of world's river flow)", "कांगो नदी", "डेन्यूब नदी"),
            listOf("Nile River", "Amazon River (Greatest river by water volume discharging ~209,000 m³/s into Atlantic)", "Congo River", "Danube River"),
            1,
            "अमेज़न नदी (दक्षिण अमेरिका) एंडीज पर्वत से निकलकर अटलांटिक महासागर में गिरती है। यह विश्व की सबसे चौड़ी और सर्वाधिक जल प्रवाह वाली नदी है (विश्व के कुल नदी जल का 20% हिस्सा अकेले वहन करती है)।",
            "The Amazon River in South America is by far the largest river by water discharge, draining approximately 7 million km² of tropical rainforest.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q8", "wgk_1",
            "एशिया की सबसे लंबी नदी (Longest River in Asia) कौन-सी है जो चीन में बहती है और शंघाई के निकट पूर्वी चीन सागर में गिरती है?",
            "Which is the longest river in Asia and third-longest in the world (~6,300 km), flowing entirely within China?",
            listOf("ह्वांगहो (पीली नदी)", "यांग्त्सी नदी / चांग जियांग (Yangtze River - Three Gorges Dam)", "मेकांग नदी", "सिंधु नदी"),
            listOf("Yellow River (Huang He)", "Yangtze River / Chang Jiang (~6,300 km long, location of Three Gorges Dam)", "Mekong River", "Indus River"),
            1,
            "यांग्त्सी नदी (6,300 किमी) तिब्बत के पठार से निकलती है और पूरी तरह चीन में बहने वाली एशिया की सबसे लंबी नदी है। इस पर विश्व की सबसे बड़ी जलविद्युत परियोजना 'थ्री गॉर्जेस डैम' (Three Gorges Dam) स्थित है।",
            "The Yangtze River is the longest river in Eurasia, flowing 6,300 km from the Tibetan Plateau to the East China Sea at Shanghai.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q9", "wgk_1",
            "विश्व की सबसे लंबी पर्वत श्रृंखला (Longest Mountain Range in the World) कौन-सी है जो दक्षिण अमेरिका के पश्चिमी तट पर 7,000 किमी तक फैली है?",
            "Which is the world's longest continental mountain range, stretching approximately 7,000 km along the western coast of South America?",
            listOf("रॉकी पर्वतमाला", "एंडीज पर्वतमाला (Andes Mountain Range - Highest Peak: Mt. Aconcagua)", "हिमालय पर्वतमाला", "आल्प्स पर्वतमाला"),
            listOf("Rocky Mountains (North America)", "Andes Mountains (Length: ~7,000 km across 7 South American countries)", "Himalayas (Highest)", "Alps (Europe)"),
            1,
            "एंडीज पर्वतमाला 7 देशों (वेनेजुएला, कोलंबिया, इक्वाडोर, पेरू, बोलीविया, चिली, अर्जेंटीना) में 7,000 किमी लंबी है। इसकी सर्वोच्च चोटी 'माउंट एकांकागुआ' (Mt. Aconcagua, 6,961 मी.) है।",
            "The Andes span across 7 countries in South America, forming the longest continuous mountain chain on Earth with peak Mt. Aconcagua.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q10", "wgk_1",
            "यूरोप और एशिया को प्राकृतिक रूप से अलग करने वाली प्रमुख पर्वत श्रृंखला और नदी कौन-सी है?",
            "Which mountain range and river form the traditional natural geographic boundary dividing Europe from Asia?",
            listOf("आल्प्स पर्वत और राइन नदी", "यूराल पर्वतमाला और यूराल नदी (Ural Mountains & Ural River)", "काकेशस पर्वत और डेन्यूब नदी", "पिरेनीज पर्वतमाला"),
            listOf("Alps & Rhine", "Ural Mountains and Ural River (Forming Eurasia boundary in Russia & Kazakhstan)", "Caucasus & Danube", "Pyrenees"),
            1,
            "रूस में उत्तर से दक्षिण तक फैली यूराल पर्वतमाला (Ural Mountains) और यूराल नदी भौगोलिक रूप से यूरोप को एशिया से अलग करती है। रूस का यूराल के पश्चिम का भाग यूरोपीय रूस और पूर्व का भाग साइबेरिया (एशिया) कहलाता है।",
            "The Ural Mountains run north-south through western Russia, forming the conventional physiographic boundary between the continents of Europe and Asia.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q11", "wgk_1",
            "विश्व का सबसे बड़ा गर्म मरुस्थल (Largest Hot Desert in the World) कौन-सा है जो उत्तरी अफ्रीका के 11 देशों में फैला है?",
            "Which is the world's largest hot subtropical desert (~9.2 million km²), covering most of Northern Africa?",
            listOf("गोबी मरुस्थल", "सहारा मरुस्थल (Sahara Desert - North Africa)", "कालाहारी मरुस्थल", "थार मरुस्थल"),
            listOf("Gobi Desert", "Sahara Desert (~9.2 million km² across 11 North African nations)", "Kalahari Desert", "Thar Desert"),
            1,
            "सहारा मरुस्थल का क्षेत्रफल लगभग 92 लाख वर्ग किमी है (भारत के क्षेत्रफल का लगभग 3 गुना)। यह अल्जीरिया, मिस्र, लीबिया, माली, मोरक्को, सूडान, चाड आदि 11 देशों में विस्तृत है।",
            "The Sahara is the largest hot desert in the world and third-largest desert overall (after Antarctica and Arctic polar deserts).",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q12", "wgk_1",
            "विश्व का सबसे शुष्क स्थान (Driest Non-Polar Desert on Earth) कौन-सा है जो दक्षिण अमेरिका में पेरू और चिली के तटीय क्षेत्र में स्थित है?",
            "Which is recognized as the driest non-polar desert on Earth, located along the Pacific coast in Chile and Peru?",
            listOf("सहारा मरुस्थल", "अटाकामा मरुस्थल (Atacama Desert, Chile - Home to ALMA observatory)", "पेटागोनिया मरुस्थल", "मोजावे मरुस्थल"),
            listOf("Sahara Desert", "Atacama Desert (Northern Chile - rainless plateau between Andes and Chilean Coast Range)", "Patagonian Desert", "Mojave Desert"),
            1,
            "अटाकामा मरुस्थल (चिली) में कुछ स्थानों पर सैकड़ों वर्षों से वर्षा नहीं हुई है। अत्यधिक शुष्कता और साफ आकाश के कारण यहाँ विश्व की सबसे बड़ी खगोलीय वेधशालाएं (जैसे ALMA और Very Large Telescope) स्थापित हैं।",
            "The Atacama Desert is a hyper-arid plateau in South America where some weather stations have never recorded a single drop of rain.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q13", "wgk_1",
            "मंगोलिया और उत्तरी चीन में फैला एशिया का सबसे बड़ा 'शीत मरुस्थल' (Cold Desert in Asia) कौन-सा है?",
            "Which is the vast cold rain-shadow desert spanning across southern Mongolia and northern China?",
            listOf("टकलामकान मरुस्थल", "गोबी मरुस्थल (Gobi Desert - Known for dinosaur fossil discoveries)", "थार मरुस्थल", "दश्त-ए-कबीर"),
            listOf("Taklamakan Desert", "Gobi Desert (Cold desert created by Himalayan rain-shadow effect)", "Thar Desert", "Dasht-e Kavir"),
            1,
            "गोबी मरुस्थल एक ठंडा मरुस्थल है जहाँ सर्दियों में तापमान -40°C तक गिर जाता है और बर्फ जमती है। यहाँ दो कूबड़ वाले बैक्ट्रियन ऊंट (Bactrian Camel) पाए जाते हैं।",
            "The Gobi Desert is a large cold desert region in East Asia bounded by the Altai Mountains and the Tibetan Plateau.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q14", "wgk_1",
            "विश्व की 'छत' (Roof of the World) के उपनाम से किस उच्च पर्वतीय पठारी गांठ को जाना जाता है जहाँ से हिमालय, हिंदूकुश और काराकोरम पर्वत निकलते हैं?",
            "Which high-altitude plateau junction in Central Asia (Tajikistan) is popularly known as the 'Roof of the World' (Bam-e-Dunya)?",
            listOf("तिब्बत का पठार", "पामीर का पठार / पामीर नॉट (Pamir Knot / Plateau)", "दक्कन का पठार", "अनातोलिया का पठार"),
            listOf("Tibetan Plateau (Highest Plateau)", "Pamir Knot / Pamir Plateau (Orographical junction of Hindu Kush, Tian Shan, Karakoram)", "Deccan Plateau", "Anatolian Plateau"),
            1,
            "पामीर के पठार (Pamir Knot, ताजिकिस्तान) को 'दुनिया की छत' कहा जाता है। यह वह पर्वतीय केंद्र है जहाँ से हिमालय, काराकोरम, कुनलुन, तियान शान और हिंदूकुश पर्वतमालाएं विभिन्न दिशाओं में निकलती हैं।",
            "The Pamir Knot is a major mountain hub in Central Asia from which five of the world's most formidable mountain ranges radiate outwards.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m1_q15", "wgk_1",
            "क्षेत्रफल और औसत ऊंचाई (4,500 मीटर) की दृष्टि से विश्व का सबसे ऊंचा और सबसे बड़ा पठार (Highest and Largest Plateau) कौन-सा है?",
            "Which is the highest and largest plateau in the world, often called the 'Third Pole' due to its vast glacial water reserves?",
            listOf("कोलोराडो का पठार", "तिब्बत का पठार (Qinghai-Tibetan Plateau - Area ~2.5 million km²)", "पामीर का पठार", "मेक्सिको का पठार"),
            listOf("Colorado Plateau", "Tibetan Plateau (Average elevation > 4,500 m; spanning ~2.5 million km²)", "Pamir Plateau", "Mexican Plateau"),
            1,
            "तिब्बत का पठार (क्षेत्रफल 25 लाख वर्ग किमी, औसत ऊंचाई 4,500 मीटर) 'विश्व का तीसरा ध्रुव' (Third Pole) कहलाता है क्योंकि यह ध्रुवों के बाहर सबसे बड़ा हिमनद (ग्लेशियर) जल भंडार है जहाँ से 10 प्रमुख एशियाई नदियाँ निकलती हैं।",
            "The Tibetan Plateau is the world's highest and largest plateau, feeding major river systems supporting over 1.4 billion people across Asia.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2 (15 Questions)
        // ==========================================
        makeWorldGkQ(
            "wgk_1_m2_q1", "wgk_1",
            "विश्व का सबसे बड़ा द्वीप (Largest Island in the World) कौन-सा है जो भौगोलिक रूप से उत्तरी अमेरिका लेकिन राजनीतिक रूप से डेनमार्क का हिस्सा है?",
            "Which is the world's largest non-continental island, geographically part of North America but politically an autonomous territory of Denmark?",
            listOf("न्यू गिनी", "ग्रीनलैंड (Greenland - Area ~2.16 million km²)", "बोर्नियो", "मेडागास्कर"),
            listOf("New Guinea (2nd largest)", "Greenland (Area: ~2.16 million km²; capital: Nuuk, Denmark)", "Borneo (3rd largest)", "Madagascar"),
            1,
            "ग्रीनलैंड (क्षेत्रफल 21.6 लाख वर्ग किमी) विश्व का सबसे बड़ा द्वीप है। इसका 80% से अधिक भाग बर्फ की चादर से ढका है। इसकी राजधानी नूक (Nuuk) है और यह डेनमार्क का स्वायत्त क्षेत्र है।",
            "Greenland is the world's largest island, situated between the Arctic and Atlantic oceans east of the Canadian Arctic Archipelago.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q2", "wgk_1",
            "विश्व का सबसे बड़ा द्वीप समूह (Largest Archipelago in the World) कौन-सा देश है जिसमें 17,500 से अधिक द्वीप शामिल हैं?",
            "Which country constitutes the world's largest island country and archipelago with over 17,500 islands?",
            listOf("फिलीपींस", "इंडोनेशिया (Indonesia - Capital: Jakarta / Nusantara)", "जापान", "मालदीव"),
            listOf("Philippines", "Indonesia (World's largest archipelagic state spanning across ~5,120 km east to west)", "Japan", "Maldives"),
            1,
            "इंडोनेशिया 17,508 द्वीपों (जावा, सुमात्रा, बोर्नियो/कालिमंतन, सुलावेसी, पापुआ आदि) से मिलकर बना विश्व का सबसे बड़ा द्वीपसमूह राष्ट्र है। जावा विश्व का सर्वाधिक आबादी वाला द्वीप है।",
            "Indonesia is the largest archipelagic country in the world by area and population, situated along the equator in Southeast Asia.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q3", "wgk_1",
            "विश्व का सबसे बड़ा प्रायद्वीप (Largest Peninsula in the World) कौन-सा है जो 32 लाख वर्ग किमी में फैला है?",
            "Which is the largest peninsula in the world, spanning approximately 3.2 million km² between the Red Sea and Persian Gulf?",
            listOf("भारतीय प्रायद्वीप", "अरब प्रायद्वीप (Arabian Peninsula - Saudi Arabia, UAE, Yemen, Oman, etc.)", "इंडोचाइना प्रायद्वीप", "स्कैंडिनेवियाई प्रायद्वीप"),
            listOf("Indian Peninsula", "Arabian Peninsula (Covers Saudi Arabia, Yemen, Oman, UAE, Qatar, Kuwait, Bahrain)", "Indochina Peninsula", "Scandinavian Peninsula"),
            1,
            "अरब प्रायद्वीप (32.3 लाख वर्ग किमी) विश्व का सबसे बड़ा प्रायद्वीप है। यह पश्चिम में लाल सागर, दक्षिण में अरब सागर और पूर्व में फारस की खाड़ी से घिरा हुआ है।",
            "The Arabian Peninsula is the world's largest peninsula, holding the world's largest proven reserves of crude oil and natural gas.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q4", "wgk_1",
            "भूमध्य रेखा (Equator), कर्क रेखा (Tropic of Cancer) और मकर रेखा (Tropic of Capricorn) - ये तीनों प्रमुख अक्षांश रेखाएं किस एकमात्र महाद्वीप से होकर गुजरती हैं?",
            "Which is the only continent on Earth traversed by all three major latitude parallels: Equator, Tropic of Cancer, and Tropic of Capricorn?",
            listOf("एशिया", "अफ्रीका (Africa - Dark Continent / Mother Continent)", "दक्षिण अमेरिका", "ऑस्ट्रेलिया"),
            listOf("Asia", "Africa (Traversed by Equator, Tropic of Cancer, Tropic of Capricorn & Prime Meridian)", "South America", "Australia"),
            1,
            "अफ्रीका विश्व का एकमात्र ऐसा महाद्वीप है जिससे 0° भूमध्य रेखा, 23.5° N कर्क रेखा और 23.5° S मकर रेखा तीनों गुजरती हैं। इसके अलावा 0° देशांतर (ग्रीनविच मीन रेखा) भी अफ्रीका (घाना, माली, अल्जीरिया) से गुजरती है।",
            "Africa is the only continent straddling the Northern, Southern, Eastern, and Western Hemispheres, crossed by the Equator and both Tropics.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q5", "wgk_1",
            "अफ्रीका महाद्वीप की कौन-सी नदी 'भूमध्य रेखा' (Equator) को दो बार काटती है (पार करती है)?",
            "Which African river crosses the Equator twice during its 4,700 km course and is the deepest river in the world (>220 m)?",
            listOf("नील नदी", "कांगो नदी / जाइरे नदी (Congo River / Zaire River)", "नाइजर नदी", "जाम्बेजी नदी"),
            listOf("Nile River", "Congo River (Zaire - crosses the Equator twice and is world's deepest river)", "Niger River", "Zambezi River"),
            1,
            "कांगो (जाइरे) नदी मध्य अफ्रीका में बहती है और भूमध्य रेखा को दो बार पार करती है। यह 220 मीटर से अधिक गहराई के साथ विश्व की सबसे गहरी नदी भी है।",
            "The Congo River is the second longest river in Africa and the only major river in the world to cross the Equator twice.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q6", "wgk_1",
            "दक्षिणी अफ्रीका की कौन-सी प्रसिद्ध नदी 'मकर रेखा' (Tropic of Capricorn) को दो बार काटती है और हिंद महासागर में गिरती है?",
            "Which river in Southern Africa famously crosses the Tropic of Capricorn twice before emptying into the Indian Ocean in Mozambique?",
            listOf("जाम्बेजी नदी", "लिम्पोपो नदी (Limpopo River - Also known as Crocodile River)", "ऑरेंज नदी", "कांगो नदी"),
            listOf("Zambezi River", "Limpopo River (Crosses Tropic of Capricorn twice in Southern Africa)", "Orange River", "Congo River"),
            1,
            "लिम्पोपो नदी दक्षिण अफ्रीका, बोत्सवाना, जिम्बाब्वे और मोजाम्बिक में बहती है। यह मकर रेखा (23.5° S) को दो बार पार करती है (नोट: भारत की 'माही नदी' कर्क रेखा को दो बार काटती है)।",
            "The Limpopo River rises in South Africa and flows in a spiral semicircle crossing the Tropic of Capricorn twice.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q7", "wgk_1",
            "अफ्रीका महाद्वीप की सर्वोच्च पर्वत चोटी (Highest Peak in Africa) 'माउंट किलिमंजारो' (Mt. Kilimanjaro - 5,895 मी.) किस देश में स्थित एक सुप्त ज्वालामुखी है?",
            "Mount Kilimanjaro (5,895 m), the highest peak in Africa and the world's tallest free-standing mountain, is located in which nation?",
            listOf("केन्या", "तंजानिया (Tanzania - Dormant Stratovolcano with Uhuru Peak)", "युगांडा", "इथियोपिया"),
            listOf("Kenya", "Tanzania (Free-standing dormant volcanic mountain; highest peak: Uhuru Peak 5,895 m)", "Uganda", "Ethiopia"),
            1,
            "माउंट किलिमंजारो तंजानिया में स्थित एक विशाल सुप्त ज्वालामुखी पर्वत है जिसकी सबसे ऊंची चोटी 'उहुरू पीक' (5,895 मीटर) है। भूमध्य रेखा के पास होने के बावजूद इसकी चोटी बर्फ से ढकी रहती है।",
            "Located in northeastern Tanzania, Mount Kilimanjaro is a dormant volcano composed of three distinct volcanic cones: Kibo, Mawenzi, and Shira.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q8", "wgk_1",
            "यूरोप महाद्वीप की सबसे ऊंची पर्वत चोटी (Highest Peak in Europe) 'माउंट एल्ब्रस' (Mt. Elbrus - 5,642 मी.) किस पर्वत श्रृंखला में स्थित है?",
            "Which is the highest mountain peak in Europe (5,642 m), located in the Caucasus Mountains in Russia?",
            listOf("माउंट ब्लैंक (आल्प्स)", "माउंट एल्ब्रस (Mount Elbrus - Caucasus Mountains, Russia)", "माटर्हॉर्न", "माउंट एटना"),
            listOf("Mont Blanc (Highest in Alps, 4,808 m)", "Mount Elbrus (Caucasus Mountains in Southern Russia, 5,642 m)", "Matterhorn", "Mount Etna"),
            1,
            "माउंट एल्ब्रस (5,642 मीटर) रूस के काकेशस पर्वत में स्थित एक शांत ज्वालामुखी है और भौगोलिक रूप से यूरोप की सर्वोच्च चोटी है (आल्प्स की सबसे ऊंची चोटी माउंट ब्लैंक 4,808 मीटर है)।",
            "Mount Elbrus is a dormant volcano in the Caucasus Mountains in southern Russia, ranking as the highest peak in Europe.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q9", "wgk_1",
            "उत्तरी अमेरिका महाद्वीप की सर्वोच्च पर्वत चोटी कौन-सी है जिसे 'माउंट देनाली' (Mount Denali - 6,190 मी.) के नाम से जाना जाता है?",
            "Which is the highest mountain peak in North America (6,190 m), located in the Alaska Range in the United States?",
            listOf("माउंट लोगन", "माउंट देनाली / पूर्व नाम माउंट मैकिन्ले (Mount Denali / Mt. McKinley, Alaska)", "माउंट व्हिटनी", "माउंट रेनियर"),
            listOf("Mount Logan", "Mount Denali / formerly Mount McKinley (Alaska, USA - elevation 6,190 m)", "Mount Whitney", "Mount Rainier"),
            1,
            "माउंट देनाली (अलास्का, संयुक्त राज्य अमेरिका) उत्तरी अमेरिका की सर्वोच्च चोटी है। इसका नाम 2015 में आधिकारिक रूप से माउंट मैकिन्ले से बदलकर मूल अलास्का नाम 'देनाली' (Denali - The Great One) किया गया।",
            "Denali is the highest mountain peak in North America, with a summit elevation of 6,190 m above sea level in south-central Alaska.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q10", "wgk_1",
            "ऑस्ट्रेलिया महाद्वीप की सर्वोच्च पर्वत चोटी (Highest Mountain Peak in Australia) कौन-सी है?",
            "Which is the highest mountain peak on mainland Australia (2,228 m), located in the Snowy Mountains of New South Wales?",
            listOf("माउंट कुक (न्यूजीलैंड)", "माउंट कोसिउस्को (Mount Kosciuszko - 2,228 m)", "माउंट विंसन", "ब्लू माउंटेन"),
            listOf("Mount Cook (New Zealand)", "Mount Kosciuszko (New South Wales, Australia - 2,228 m)", "Mount Vinson (Antarctica)", "Blue Mountain"),
            1,
            "माउंट कोसिउस्को (2,228 मीटर) न्यू साउथ वेल्स में ग्रेट डिवाइडिंग रेंज के स्नोवी माउंटेंस में स्थित ऑस्ट्रेलिया की सबसे ऊंची चोटी है। इसका नाम पोलिश स्वतंत्रता सेनानी तादेउश कोसिउस्को के नाम पर रखा गया था।",
            "Mount Kosciuszko is mainland Australia's highest mountain, situated in Kosciuszko National Park, part of the Australian Alps.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q11", "wgk_1",
            "अंटार्कटिका महाद्वीप की सर्वोच्च पर्वत चोटी (Highest Peak of Antarctica) कौन-सी है?",
            "Which is the highest mountain peak on the continent of Antarctica (4,892 m), located in the Sentinel Range of the Ellsworth Mountains?",
            listOf("माउंट एरेबस", "माउंट विंसन मैसिफ (Vinson Massif - 4,892 m)", "माउंट सिडनी", "माउंट जैक्सन"),
            listOf("Mount Erebus (Active volcano)", "Vinson Massif (Sentinel Range, Ellsworth Mountains - 4,892 m)", "Mount Sidley", "Mount Jackson"),
            1,
            "विंसन मैसिफ (4,892 मीटर) दक्षिणी ध्रुव से लगभग 1,200 किमी दूर अंटार्कटिका की सर्वोच्च चोटी है। 'माउंट एरेबस' अंटार्कटिका का सबसे सक्रिय ज्वालामुखी है।",
            "Vinson Massif is the highest mountain of Antarctica, lying in the Sentinel Range of the Ellsworth Mountains.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q12", "wgk_1",
            "यूरोप की दूसरी सबसे लंबी नदी 'डेन्यूब नदी' (Danube River) यूरोप के कितने देशों और चार देशों की राजधानियों से होकर बहती है?",
            "The Danube River (~2,850 km) flows through or borders how many European countries and 4 national capitals before reaching the Black Sea?",
            listOf("5 देश", "10 देश (10 Countries - Capitals: Vienna, Bratislava, Budapest, Belgrade)", "3 देश", "15 देश"),
            listOf("5 countries", "10 countries (Flows through Germany, Austria, Slovakia, Hungary, Croatia, Serbia, Bulgaria, Romania, Moldova, Ukraine)", "3 countries", "15 countries"),
            1,
            "डेन्यूब नदी जर्मनी के ब्लैक फॉरेस्ट से निकलकर काला सागर में गिरती है। यह विश्व की सर्वाधिक 10 देशों से बहने वाली नदी है और 4 राजधानियों (वियना, ब्रातिस्लावा, बुडापेस्ट, बेलग्रेड) से गुजरती है।",
            "The Danube is Europe's second-longest river, uniquely flowing through ten nations and draining into the Danube Delta on the Black Sea.",
            "Moderate"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q13", "wgk_1",
            "यूरोप की सबसे लंबी नदी (Longest River in Europe) कौन-सी है जो रूस में वल्दाई पहाड़ियों से निकलकर कैस्पियन सागर में गिरती है?",
            "Which is the longest river in Europe (~3,530 km), flowing entirely through Russia into the Caspian Sea?",
            listOf("डेन्यूब नदी", "वोल्गा नदी (Volga River - Russia)", "राइन नदी", "सीन नदी"),
            listOf("Danube River", "Volga River (~3,530 km in Western Russia, discharging into Caspian Sea)", "Rhine River", "Seine River"),
            1,
            "वोल्गा नदी (3,530 किमी) यूरोप और यूरोपीय रूस की सबसे लंबी नदी है। इसे रूस की राष्ट्रीय नदी माना जाता है और यह कैस्पियन सागर में गिरती है।",
            "The Volga is the longest river in Europe and the principal waterway of western Russia, carrying roughly half of all river freight in Russia.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q14", "wgk_1",
            "जर्मनी और नीदरलैंड से होकर बहने वाली यूरोप की सबसे व्यस्त आंतरिक जलमार्ग (Busiest Inland Waterway of Europe) नदी कौन-सी है जो रॉटरडैम बंदरगाह पर उत्तरी सागर में गिरती है?",
            "Which river serves as Europe's most important and busiest commercial inland shipping waterway, passing through Switzerland, Germany, France, and the Netherlands?",
            listOf("टेम्स नदी", "राइन नदी (Rhine River - World's busiest commercial waterway)", "एल्ब नदी", "टाइबर नदी"),
            listOf("Thames River", "Rhine River (Passes through Basel, Strasbourg, Cologne, Rotterdam into North Sea)", "Elbe River", "Tiber River"),
            1,
            "राइन नदी (1,230 किमी) स्विस आल्प्स से निकलकर उत्तरी सागर में गिरती है। यह यूरोप के औद्योगिक हृदय स्थल (रूर घाटी) से गुजरती है और विश्व का सबसे व्यस्त व्यापारिक जलमार्ग है।",
            "The Rhine is an iconic European river flowing from the Swiss Alps through Germany to Rotterdam, serving as a critical commercial artery.",
            "Easy"
        ),
        makeWorldGkQ(
            "wgk_1_m2_q15", "wgk_1",
            "पेरिस (फ्रांस), लंदन (ब्रिटेन) और रोम (इटली) क्रमशः किन प्रसिद्ध नदियों के तट पर बसे हैं?",
            "The historic European capitals Paris, London, and Rome are situated on the banks of which rivers respectively?",
            listOf("राइन, एल्ब, पो", "सीन (Seine), टेम्स (Thames), और टाइबर (Tiber)", "डेन्यूब, स्प्री, वल्तावा", "रोन, मियामी, टैगस"),
            listOf("Rhine, Elbe, Po", "Seine (Paris), Thames (London), and Tiber (Rome)", "Danube, Spree, Vltava", "Rhone, Miami, Tagus"),
            1,
            "पेरिस 'सीन' (Seine) नदी के तट पर, लंदन 'टेम्स' (Thames) नदी के तट पर और रोम 'टाइबर' (Tiber) नदी के तट पर स्थित है।",
            "Paris is situated on the river Seine, London on the river Thames, and the ancient city of Rome on the river Tiber.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + WorldGkQuestionHelper.generateTopicMocks("wgk_1", 3, 5, baseQuestions)
    }
}
