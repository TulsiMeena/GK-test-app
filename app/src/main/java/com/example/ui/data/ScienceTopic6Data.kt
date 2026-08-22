package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic6Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_6_m1_q1", "sci_6",
            "'पारिस्थितिकी' (Ecology / Oekologie) शब्द का सर्वप्रथम प्रयोग 1866 में किस जर्मन जीवविज्ञानी ने किया था?",
            "Who coined the scientific term 'Ecology' (Ökologie, derived from Greek oikos meaning 'house') in 1866?",
            listOf("ए. जी. टांसले", "अर्नस्ट हेकेल (Ernst Haeckel)", "ई. पी. ओडम", "चार्ल्स एल्टन"),
            listOf("A. G. Tansley", "Ernst Haeckel", "E. P. Odum", "Charles Elton"),
            1,
            "जर्मन प्राणीशास्त्री अर्नस्ट हेकेल ने 1866 में जीवों और उनके पर्यावरण के बीच पारस्परिक संबंधों के अध्ययन के लिए 'ओइकोलॉजी' (Ecology) शब्द गढ़ा।",
            "Ernst Haeckel coined 'Ecology' in 1866 to describe the comprehensive investigation of the relationships of living organisms with both organic and inorganic environments.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q2", "sci_6",
            "'पारिस्थितिक तंत्र' या 'पारितंत्र' (Ecosystem) शब्द का प्रतिपादन 1935 में किस ब्रिटिश वनस्पतिशास्त्री ने किया था?",
            "Who introduced the fundamental concept and term 'Ecosystem' in ecology in 1935?",
            listOf("अर्नस्ट हेकेल", "ए. जी. टांसले (Arthur Tansley / A. G. Tansley)", "रेमंड लिंडमैन", "रामदेव मिश्र"),
            listOf("Ernst Haeckel", "Arthur Tansley (A. G. Tansley)", "Raymond Lindeman", "Ramdeo Misra"),
            1,
            "आर्थर टांसले ने 1935 में 'इकोसिस्टम' (पारिस्थितिक तंत्र) शब्द दिया, जो किसी क्षेत्र में जैविक समुदाय (Biotic community) और अजैविक घटकों (Abiotic factors) के संयुक्त तंत्र को परिभाषित करता है।",
            "Sir Arthur Tansley defined an 'Ecosystem' as the integrated structural and functional system formed by the interaction of a community of organisms with their physical environment.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q3", "sci_6",
            "भारत में पारिस्थितिकी का जनक (Father of Indian Ecology) किसे माना जाता है जिन्होंने बीएचयू में पारिस्थितिकी पीठ की स्थापना की थी?",
            "Who is reverently celebrated as the 'Father of Indian Ecology' for pioneering tropical grassland and forestry ecological research in India?",
            listOf("एम. एस. स्वामीनाथन", "प्रोफेसर रामदेव मिश्र (Prof. Ramdeo Misra)", "सलीम अली", "सुंदरलाल बहुगुणा"),
            listOf("M. S. Swaminathan", "Prof. Ramdeo Misra", "Salim Ali", "Sunderlal Bahuguna"),
            1,
            "प्रोफेसर रामदेव मिश्र को भारत में आधुनिक पारिस्थितिकी का जनक कहा जाता है। उन्होंने बनारस हिंदू विश्वविद्यालय (BHU) में पारिस्थितिकी के शोध और शिक्षण की नींव रखी।",
            "Prof. Ramdeo Misra established tropical ecology in India, mentoring generations of environmental scientists and shaping national environmental policies.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q4", "sci_6",
            "पारिस्थितिक तंत्र में ऊर्जा प्रवाह का '10% नियम' (10 Percent Law of Energy Flow) 1942 में किसने दिया था?",
            "Who formulated the Lindeman's '10% Law of Trophic Efficiency' in ecological energy transfer (1942)?",
            listOf("चार्ल्स एल्टन", "रेमंड लिंडमैन (Raymond Lindeman)", "ई. पी. ओडम", "टांसले"),
            listOf("Charles Elton", "Raymond Lindeman", "E. P. Odum", "Arthur Tansley"),
            1,
            "रेमंड लिंडमैन के नियमानुसार, खाद्य श्रृंखला में प्रत्येक पोषी स्तर (Trophic Level) पर केवल 10% ऊर्जा ही अगले स्तर में स्थानांतरित होती है; शेष 90% ऊर्जा श्वसन, ऊष्मा और जैविक क्रियाओं में नष्ट हो जाती है।",
            "Raymond Lindeman's 10% Rule states that on average only about 10% of the net primary/secondary energy is transferred from one trophic level to the next higher level.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q5", "sci_6",
            "किसी भी पारिस्थितिक तंत्र में 'ऊर्जा का पिरामिड' (Pyramid of Energy) सदैव कैसा होता है?",
            "In all ecological systems without exception, the Pyramid of Energy is ALWAYS:",
            listOf("सदैव उल्टा (Always Inverted)", "सदैव सीधा / ऊर्ध्वाधर (Always Upright)", "पहले सीधा फिर उल्टा", "तर्कुरूपी / स्पिंडल"),
            listOf("Always Inverted", "Always Upright (Unidirectional thermodynamic energy dissipation)", "Variable", "Spindle-shaped"),
            1,
            "ऊष्मागतिकी के द्वितीय नियम और 10% ऊर्जा नियम के अनुसार, प्राथमिक उत्पादकों (हरे पौधे) से शीर्ष मांसाहारियों की ओर जाने पर उपलब्ध ऊर्जा लगातार घटती है, अतः ऊर्जा का पिरामिड सदैव सीधा (Upright) होता है।",
            "Because energy is progressively lost as metabolic heat at every successive trophic step, the Pyramid of Energy can NEVER be inverted and is strictly upright.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q6", "sci_6",
            "तालाब या समुद्र के जलीय पारिस्थितिक तंत्र में 'जैव-भार का पिरामिड' (Pyramid of Biomass in an Aquatic Ecosystem) कैसा होता है?",
            "In an open ocean or freshwater aquatic ecosystem (Pond ecosystem), the Pyramid of Biomass is typically:",
            listOf("सदैव सीधा", "उल्टा (Inverted - सूक्ष्म प्लवक का अल्प भार बनाम बड़ी मछलियों का विशाल भार)", "क्षैतिज", "गोलाकार"),
            listOf("Always upright", "Inverted (Inverted: Phytoplankton low instantaneous biomass vs high consumer fish biomass)", "Horizontal", "Spherical"),
            1,
            "जलीय पारितंत्र में पादप प्लवक (Phytoplankton) का तात्कालिक जैव-भार बहुत कम होता है परन्तु उनका प्रजनन चक्र तीव्र होता है, जबकि उन्हें खाने वाली मांसाहारी बड़ी मछलियों का जैव-भार बहुत अधिक होता है, अतः पिरामिड उल्टा होता है।",
            "The biomass pyramid of aquatic ecosystems is inverted because the standing crop biomass of microalgal phytoplankton at any instant is far lower than the long-lived predatory fish feeding on them.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q7", "sci_6",
            "दो भिन्न पारिस्थितिक तंत्रों (जैसे वन और घास का मैदान, या भूमि और जल) के बीच के संक्रमणकालीन क्षेत्र (Transitional Zone) को क्या कहते हैं?",
            "What ecological term describes the rich Transitional Boundary Zone where two distinct ecological communities or biomes meet and integrate?",
            listOf("इकोफैन", "इकोटोन / संक्रांतिका (Ecotone - exhibits Edge Effect)", "इकेड", "इकोक्लाइन"),
            listOf("Ecophane", "Ecotone (Zone of tension exhibiting species richness and 'Edge Effect')", "Ecad", "Ecocline"),
            1,
            "इकोटोन (Ecotone) दो पारिस्थितिक तंत्रों का संगम क्षेत्र है (जैसे मैंग्रोव, दलदल, वन सीमा)। यहाँ दोनों क्षेत्रों की प्रजातियां और कुछ विशेष प्रजातियां पाई जाती हैं, जिसे 'कोर प्रभाव' (Edge Effect) कहते हैं।",
            "An Ecotone is a boundary tension zone between two biomes (e.g., mangrove estuaries between terrestrial and marine systems) displaying high biodiversity termed Edge Effect.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q8", "sci_6",
            "विश्व पर्यावरण दिवस (World Environment Day) प्रतिवर्ष किस तिथि को मनाया जाता है (स्टॉकहोम सम्मेलन 1972 की स्मृति में)?",
            "World Environment Day is observed globally every year on which date (established by the UN at the Stockholm Conference in 1972)?",
            listOf("22 अप्रैल (पृथ्वी दिवस)", "5 जून (5th June)", "16 सितंबर (ओजोन दिवस)", "22 मई (जैव विविधता दिवस)"),
            listOf("22 April (Earth Day)", "5th June (World Environment Day)", "16 September (Ozone Day)", "22 May (Biodiversity Day)"),
            1,
            "संयुक्त राष्ट्र पर्यावरण कार्यक्रम (UNEP) द्वारा 5 जून 1974 से प्रतिवर्ष विश्व पर्यावरण दिवस मनाया जाता है। 22 अप्रैल को विश्व पृथ्वी दिवस, 22 मई को अंतर्राष्ट्रीय जैव विविधता दिवस, और 16 सितंबर को ओजोन दिवस मनाते हैं।",
            "5th June was designated as World Environment Day by the UN General Assembly in 1972 to promote global environmental stewardship.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q9", "sci_6",
            "ओजोन परत संरक्षण के लिए अंतर्राष्ट्रीय दिवस (World Ozone Day) प्रतिवर्ष किस तिथि को मनाया जाता है?",
            "International Day for the Preservation of the Ozone Layer (World Ozone Day) is observed globally on:",
            listOf("5 जून", "16 सितंबर (16th September - मॉन्ट्रियल प्रोटोकॉल 1987)", "22 मार्च", "2 दिसंबर"),
            listOf("5 June", "16th September (Commemorating Montreal Protocol signing, 1987)", "22 March", "2 December"),
            1,
            "16 सितंबर 1987 को ओजोन को नष्ट करने वाले पदार्थों (CFCs) पर ऐतिहासिक 'मॉन्ट्रियल प्रोटोकॉल' पर हस्ताक्षर हुए थे। 1994 में UN ने 16 सितंबर को विश्व ओजोन दिवस घोषित किया।",
            "World Ozone Day is celebrated annually on September 16 to mark the anniversary of the 1987 Montreal Protocol on Substances that Deplete the Ozone Layer.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q10", "sci_6",
            "वायुमंडल के किस स्तर में जीवन रक्षक 'ओजोन परत' (Good Ozone Layer) पाई जाती है जो सूर्य की हानिकारक पराबैंगनी (UV-B) किरणों को अवशोषित करती है?",
            "In which atmospheric thermal layer is the stratospheric 'Good Ozone Layer' (~15 to 35 km altitude) concentrated?",
            listOf("क्षोभमंडल (Troposphere - Bad Ozone)", "समतापमंडल (Stratosphere - Good Ozone)", "मध्यमंडल (Mesosphere)", "आयनमंडल (Ionosphere)"),
            listOf("Troposphere", "Stratosphere (Ozonosphere absorbing lethal solar UV-C and UV-B radiation)", "Mesosphere", "Ionosphere"),
            1,
            "ओजोन परत (O₃) समतापमंडल (Stratosphere) में 15 से 35 किमी की ऊंचाई पर स्थित है। यह सूर्य की घातक पराबैंगनी किरणों (UV-B) को रोककर त्वचा कैंसर और मोतियाबिंद से पृथ्वी के जीवों की रक्षा करती है।",
            "Approximately 90% of atmospheric ozone resides in the Stratosphere, shielding the biosphere from mutagenic solar Ultraviolet-B and UV-C wavelengths.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q11", "sci_6",
            "ओजोन परत की मोटाई मापने की मानक वैज्ञानिक इकाई क्या है?",
            "What is the standard scientific unit used to express total column atmospheric Ozone thickness?",
            listOf("डेसिबल (ध्वनि)", "डॉबसन इकाई (Dobson Unit - DU)", "पास्कल (दाब)", "कैंडेला"),
            listOf("Decibel", "Dobson Unit (DU - 1 DU = 0.01 mm thickness of pure O₃ at STP)", "Pascal", "Candela"),
            1,
            "ओजोन परत की मोटाई 'डॉबसन यूनिट' (DU) में मापी जाती है। सामान्य वायुमंडलीय ओजोन लगभग 300 DU (~3 मिमी शुद्ध O₃) होती है। 220 DU से कम मोटाई होने पर उसे 'ओजोन छिद्र' (Ozone Hole) माना जाता है।",
            "A Dobson Unit (DU) measures column ozone. At STP, 300 Dobson Units corresponds to an ozone gas layer only 3.0 millimeters thick.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q12", "sci_6",
            "समतापमंडलीय ओजोन परत के क्षरण (Ozone Depletion) के लिए सबसे प्रमुख उत्तरदायी रसायन कौन-सा है?",
            "Which synthetic synthetic halogenated industrial compound family is the primary catalyst of Stratospheric Ozone Depletion?",
            listOf("कार्बन डाइऑक्साइड", "क्लोरोफ्लोरोकार्बन / सीएफसी और फ्रीऑन (Chlorofluorocarbons - CFCs / Freons)", "सल्फर डाइऑक्साइड", "मीथेन"),
            listOf("Carbon dioxide", "Chlorofluorocarbons (CFCs / Freon refrigerants releasing free Chlorine radicals)", "Sulfur dioxide", "Methane"),
            1,
            "फ्रिज और AC से निकलने वाले CFC अणु समतापमंडल में UV किरणों द्वारा टूटकर मुक्त क्लोरीन परमाणु (Cl•) छोड़ते हैं। 1 क्लोरीन परमाणु 1 लाख से अधिक ओजोन अणुओं को नष्ट कर सकता है: Cl + O₃ → ClO + O₂।",
            "Chlorofluorocarbons (CFCs) photolyze under stratospheric UV light to release reactive chlorine radicals (Cl•), which catalyze the destruction of >100,000 O₃ molecules per radical.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q13", "sci_6",
            "अंटार्कटिका के ऊपर ओजोन छिद्र (Ozone Hole) की खोज 1985 में ब्रिटिश अंटार्कटिक सर्वेक्षण के किस वैज्ञानिक दल ने की थी?",
            "The British Antarctic Survey team led by which scientist first discovered the springtime Antarctic Ozone Hole in 1985?",
            listOf("चार्ल्स कीलिंग", "जोसेफ फारमैन, ब्रायन गार्डिनर और जोनाथन शैंकलिन (Joseph Farman, Brian Gardiner, Jonathan Shanklin)", "जेम्स हैंसन", "मारियो मोलिना"),
            listOf("Charles Keeling", "Joseph Farman, Brian Gardiner, and Jonathan Shanklin", "James Hansen", "Mario Molina (Nobel 1995)"),
            1,
            "1985 में जोसेफ फारमैन और उनके सहयोगियों ने हैली बे स्टेशन पर वसंत ऋतु (सितंबर-अक्टूबर) में अंटार्कटिका के ऊपर ओजोन परत की मोटाई में भारी गिरावट (ओजोन होल) दर्ज की।",
            "Joseph Farman and colleagues published the groundbreaking 1985 Nature paper detecting a dramatic 50-70% seasonal loss of stratospheric ozone over Halley Bay, Antarctica.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_6_m1_q14", "sci_6",
            "ओजोन परत के क्षरण को रोकने के लिए ओजोन-विनाशक पदार्थों (CFCs, हैलोन) के उत्पादन को चरणबद्ध तरीके से बंद करने वाला विश्व का सबसे सफल अंतरराष्ट्रीय समझौता कौन-सा है?",
            "Which 1987 environmental treaty is widely celebrated as the single most successful global environmental agreement in history, phasing out 99% of Ozone-Depleting Substances?",
            listOf("क्योटो प्रोटोकॉल (1997 - ग्रीनहाउस गैसें)", "मॉन्ट्रियल प्रोटोकॉल (Montreal Protocol - 1987 / प्रभावी 1989)", "पेरिस समझौता (2015)", "स्टॉकहोम कन्वेंशन"),
            listOf("Kyoto Protocol (Carbon emissions)", "Montreal Protocol on Substances that Deplete the Ozone Layer (1987)", "Paris Agreement", "Stockholm Convention (POPs)"),
            1,
            "मॉन्ट्रियल प्रोटोकॉल (1987) संयुक्त राष्ट्र का पहला सार्वभौमिक संधि है जिसे सभी 198 देशों ने अनुमोदित किया। इसके तहत CFCs को पूरी तरह समाप्त किया गया। 2016 में इसमें 'किगाली संशोधन' द्वारा HFCs को भी शामिल किया गया।",
            "The Montreal Protocol (1987) universally mandated the complete global phase-out of chlorofluorocarbons and halons, facilitating the slow healing of the Antarctic ozone hole.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q15", "sci_6",
            "ग्रीनहाउस प्रभाव (Greenhouse Effect) की खोज सर्वप्रथम 1824 में किस फ्रांसीसी भौतिक विज्ञानी ने की थी?",
            "Who first mathematically and physically discovered the natural Greenhouse Effect in planetary atmospheres in 1824?",
            listOf("स्वांते अरहेनियस", "जोसेफ फूरियर (Joseph Fourier)", "जॉन टिंडल", "चार्ल्स कीलिंग"),
            listOf("Svante Arrhenius (Calculated CO₂ warming 1896)", "Joseph Fourier (Discovered atmospheric heat trapping 1824)", "John Tyndall (Proved gas absorption 1859)", "Charles Keeling"),
            1,
            "जोसेफ फूरियर ने 1824 में बताया कि पृथ्वी का वायुमंडल एक कांच के ग्रीनहाउस की तरह कार्य करता है जो दृश्य प्रकाश को आने देता है परन्तु अवरक्त (गर्मी) को बाहर जाने से रोकता है। 1896 में अरहेनियस ने CO₂ की भूमिका को मापा।",
            "Joseph Fourier first identified in 1824 that atmospheric gases trap planetary thermal infrared radiation, elevating Earth's average surface temperature above freezing.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_6_m2_q1", "sci_6",
            "पृथ्वी के प्राकृतिक ग्रीनहाउस प्रभाव में सबसे बड़ा योगदान (लगभग 60-70%) किस प्राकृतिक घटक का है?",
            "Which atmospheric constituent is the single largest natural contributor (~60-70%) to Earth's natural baseline Greenhouse Warming effect?",
            listOf("कार्बन डाइऑक्साइड (CO₂)", "जलवाष्प (Water Vapor - H₂O)", "मीथेन (CH₄)", "ओजोन"),
            listOf("Carbon dioxide (CO₂ - primary anthropogenic driver)", "Water Vapor (H₂O vapor - primary natural greenhouse constituent ~60%)", "Methane (CH₄)", "Ozone"),
            1,
            "प्राकृतिक ग्रीनहाउस प्रभाव में जलवाष्प (Water vapor) 60-70% योगदान देता है, CO₂ 20-25% और मीथेन 4-9% योगदान देती है। हालांकि, मानवजनित ग्लोबल वार्मिंग का मुख्य कारण जीवाश्म ईंधन से निकलने वाली अतिरिक्त CO₂ है।",
            "Water vapor is the most abundant natural greenhouse gas providing Earth's baseline habitability, while anthropogenic CO₂ acts as the non-condensable forcing control knob.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q2", "sci_6",
            "मानवजनित ग्लोबल वार्मिंग (Global Warming) के लिए सर्वाधिक उत्तरदायी प्राथमिक ग्रीनहाउस गैस कौन-सी है?",
            "Which anthropogenic gas, released primarily by fossil fuel combustion and deforestation, is the dominant driver of modern human-induced Global Climate Change?",
            listOf("सल्फर हेक्साफ्लोराइड", "कार्बन डाइऑक्साइड (Carbon Dioxide - CO₂, ~76% of GHG emissions)", "नाइट्रोजन", "आर्गन"),
            listOf("Sulfur hexafluoride", "Carbon Dioxide (CO₂ - responsible for ~76% of anthropogenic emissions)", "Nitrogen", "Argon"),
            1,
            "जीवाश्म ईंधन (कोयला, तेल, गैस) के जलने से वायुमंडलीय CO₂ की सांद्रता औद्योगिक क्रांति-पूर्व के 280 ppm से बढ़कर वर्तमान में 420+ ppm हो गई है, जो आधुनिक ग्लोबल वार्मिंग का मुख्य कारण है।",
            "Anthropogenic Carbon Dioxide (CO₂) constitutes over 75% of global greenhouse emissions, driving ongoing radiative forcing and climate warming.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q3", "sci_6",
            "मीथेन (CH₄) गैस का ग्लोबल वार्मिंग विभव (Global Warming Potential - GWP) 20 वर्षों के पैमाने पर CO₂ की तुलना में लगभग कितने गुना अधिक शक्तिशाली है?",
            "On a 20-year timescale, Methane (CH₄) has a Global Warming Potential (GWP) approximately how many times higher than Carbon Dioxide (CO₂ = 1)?",
            listOf("2 गुना", "लगभग 80 से 84 गुना अधिक (80-84× on 20-yr horizon; ~28-30× on 100-yr horizon)", "10 गुना", "500 गुना"),
            listOf("2×", "Approximately 80 to 84 times more potent (28-36× on 100-year timescale)", "10×", "500×"),
            1,
            "मीथेन (CH₄) वायुमंडल में 12 वर्ष रहती है परन्तु यह CO₂ की तुलना में बहुत अधिक अवरक्त ऊष्मा अवशोषित करती है। 20 वर्ष के पैमाने पर इसका GWP 84 गुना और 100 वर्ष के पैमाने पर 28 गुना अधिक होता है।",
            "Methane is a potent short-lived climate pollutant with a 20-year Global Warming Potential of ~84, making methane emission reduction crucial for near-term climate mitigation.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_6_m2_q4", "sci_6",
            "क्योटो प्रोटोकॉल (Kyoto Protocol - 1997) का मुख्य उद्देश्य क्या था?",
            "The Kyoto Protocol, adopted in Japan in 1997 under the UNFCCC framework, was an international treaty committing industrialized nations to:",
            listOf("ओजोन क्षरण रोकना", "ग्रीनहाउस गैसों के उत्सर्जन में कटौती करना (Legally binding GHG Emission Reductions)", "परमाणु हथियारों पर प्रतिबंध", "वन्यजीव संरक्षण"),
            listOf("Ozone protection (Montreal)", "Binding Reductions in Greenhouse Gas emissions (6 GHGs: CO₂, CH₄, N₂O, HFCs, PFCs, SF₆)", "Nuclear ban", "Wildlife protection"),
            1,
            "क्योटो प्रोटोकॉल (1997) विकसित देशों (Annex-I) के लिए 6 प्रमुख ग्रीनहाउस गैसों (CO₂, CH₄, N₂O, HFCs, PFCs, SF₆) के उत्सर्जन को 1990 के स्तर से औसतन 5.2% कम करने का कानूनी रूप से बाध्यकारी समझौता था।",
            "The Kyoto Protocol introduced legally binding greenhouse gas reduction targets and flexible market mechanisms (Carbon Credits, Clean Development Mechanism).",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q5", "sci_6",
            "पेरिस जलवायु समझौता (Paris Climate Agreement - COP21, 2015) का मुख्य वैश्विक तापमान लक्ष्य क्या है?",
            "What is the core long-term temperature goal established under the 2015 Paris Climate Agreement (COP21)?",
            listOf("तापमान को 5°C तक सीमित करना", "वैश्विक तापमान वृद्धि को पूर्व-औद्योगिक स्तर से 2°C से काफी नीचे रखना और 1.5°C तक सीमित करने का प्रयास करना (Limit warming well below 2°C, preferably 1.5°C)", "शून्य तापमान", "ग्लेशियरों को पिघलाना"),
            listOf("Limit warming to 5°C", "Hold global average temperature increase to well below 2°C above pre-industrial levels, pursuing efforts to limit to 1.5°C", "Zero degrees", "Melting glaciers"),
            1,
            "पेरिस समझौते (2015) के तहत सभी 196 देशों ने राष्ट्रीय स्तर पर निर्धारित योगदान (NDCs) द्वारा सदी के अंत तक वैश्विक तापमान वृद्धि को 1.5°C - 2°C के भीतर रोकने और 2050 तक 'नेट ज़ीरो' कार्बन का लक्ष्य रखा है।",
            "The Paris Accord aims to keep global temperature rise well below 2.0°C and vigorously pursue efforts to cap warming at 1.5°C to avoid irreversible climate tipping points.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q6", "sci_6",
            "'जैव विविधता' (Biodiversity) शब्द का सर्वप्रथम प्रयोग 1985 में किस अमेरिकी वैज्ञानिक ने किया था?",
            "Who coined the term 'Biodiversity' (shortened from Biological Diversity) in 1985?",
            listOf("ई. ओ. विल्सन", "डब्ल्यू. जी. रोसेन (Walter G. Rosen / W. G. Rosen)", "नॉर्मन मायर्स", "चार्ल्स डार्विन"),
            listOf("E. O. Wilson (Popularized the term)", "Walter G. Rosen (Coined 'Biodiversity' in 1985)", "Norman Myers (Hotspots concept)", "Charles Darwin"),
            1,
            "वॉल्टर जी. रोसेन (W. G. Rosen) ने 1985 में 'बायोडायवर्सिटी' शब्द गढ़ा। एडवर्ड ओ. विल्सन (E. O. Wilson - Father of Biodiversity) ने 1988 में अपनी पुस्तक द्वारा इसे विश्व भर में लोकप्रिय बनाया।",
            "Walter G. Rosen formulated the compound word 'Biodiversity' during the National Forum on BioDiversity (1986), subsequently popularized by sociobiologist E. O. Wilson.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_6_m2_q7", "sci_6",
            "जैव विविधता के 'तप्त स्थल' या 'हॉटस्पॉट' (Biodiversity Hotspots) की अवधारणा 1988 में किसने प्रस्तुत की थी?",
            "Who introduced the conservation concept of 'Biodiversity Hotspots' in 1988 to prioritize exceptionally rich yet highly threatened ecosystems?",
            listOf("ई. ओ. विल्सन", "नॉर्मन मायर्स (Norman Myers)", "रामदेव मिश्र", "सलीम अली"),
            listOf("E. O. Wilson", "Norman Myers (British ecologist)", "Ramdeo Misra", "Salim Ali"),
            1,
            "नॉर्मन मायर्स ने हॉटस्पॉट की अवधारणा दी। हॉटस्पॉट के लिए 2 शर्तें हैं: 1. कम से कम 1,500 स्थानिक संवहनी पौधे (0.5% विश्व वनस्पति) होने चाहिए, 2. इसका कम से कम 70% मूल प्राकृतिक आवास नष्ट हो चुका हो।",
            "Norman Myers designated Biodiversity Hotspots as regions containing at least 1,500 endemic vascular plant species that have lost ≥70% of primary vegetation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q8", "sci_6",
            "विश्व में कुल कितने वैश्विक जैव विविधता हॉटस्पॉट हैं और उनमें से कितने भारत में आंशिक या पूर्ण रूप से फैले हैं?",
            "How many global Biodiversity Hotspots exist worldwide, and how many are represented in India?",
            listOf("25 विश्व में, 2 भारत में", "36 विश्व में, 4 भारत में (36 Worldwide; 4 in India: Western Ghats, Himalayas, Indo-Burma, Sundaland)", "50 विश्व में, 10 भारत में", "18 विश्व में, 1 भारत में"),
            listOf("25 worldwide, 2 in India", "36 Worldwide; 4 in India (Himalaya, Western Ghats & Sri Lanka, Indo-Burma, and Sundaland/Nicobar)", "50 worldwide, 10 in India", "18 worldwide, 1 in India"),
            1,
            "विश्व में कंजर्वेशन इंटरनेशनल द्वारा 36 हॉटस्पॉट मान्यता प्राप्त हैं। भारत में 4 हॉटस्पॉट हैं: 1. पश्चिमी घाट (और श्रीलंका), 2. हिमालय क्षेत्र, 3. भारत-म्यांमार (उत्तर-पूर्व भारत), 4. सुंदरलैंड (निकोबार द्वीप समूह)।",
            "Conservation International recognizes 36 global Hotspots, with 4 overlapping India: The Himalayas, Western Ghats-Sri Lanka, Indo-Burma, and Sundaland.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q9", "sci_6",
            "आईयूसीएन (IUCN) द्वारा संकटग्रस्त और विलुप्तप्राय जीवों की सूची किस आधिकारिक पुस्तक में प्रकाशित की जाती है?",
            "The International Union for Conservation of Nature (IUCN) publishes the global conservation status of threatened biological species in the:",
            listOf("ग्रीन डेटा बुक", "रेड डेटा बुक / आईयूसीएन रेड लिस्ट (Red Data Book / IUCN Red List of Threatened Species)", "ब्लू डेटा बुक", "येलो बुक"),
            listOf("Green Data Book", "Red Data Book / IUCN Red List (Founded 1964 in Gland, Switzerland)", "Blue Data Book", "Yellow Book"),
            1,
            "रेड डेटा बुक 1964 से प्रकाशित हो रही है। इसमें प्रजातियों को 9 श्रेणियों में बांटा जाता है: विलुप्त (EX), जंगल में विलुप्त (EW), घोर संकटग्रस्त (CR), संकटग्रस्त (EN), संवेदनशील (VU), संकटापन्न (NT), आदि।",
            "The IUCN Red List catalogs the global extinction risk of taxa across structured categories (Extinct, Critically Endangered, Endangered, Vulnerable).",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q10", "sci_6",
            "प्रोजेक्ट टाइगर (Project Tiger) भारत सरकार द्वारा बाघों के संरक्षण के लिए किस वर्ष शुरू किया गया था?",
            "Project Tiger, one of the world's most successful carnivore conservation initiatives, was officially launched by the Government of India in which year?",
            listOf("1972", "1 अप्रैल 1973 (1973 - जिम कॉर्बेट राष्ट्रीय उद्यान से)", "1980", "1992"),
            listOf("1972 (Wildlife Protection Act)", "1 April 1973 (Launched at Jim Corbett National Park under PM Indira Gandhi)", "1980", "1992 (Project Elephant)"),
            1,
            "प्रोजेक्ट टाइगर 1 अप्रैल 1973 को जिम कॉर्बेट नेशनल पार्क से 9 टाइगर रिजर्व के साथ शुरू किया गया था। वर्तमान में भारत में 55+ टाइगर रिजर्व हैं और विश्व के 75% से अधिक जंगली बाघ भारत में पाए जाते हैं।",
            "Project Tiger commenced on April 1, 1973, establishing dedicated tiger reserves overseen by the National Tiger Conservation Authority (NTCA).",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q11", "sci_6",
            "भारत का पहला राष्ट्रीय उद्यान (First National Park of India) कौन-सा है जिसकी स्थापना 1936 में 'हेली नेशनल पार्क' के रूप में हुई थी?",
            "Which was India's first National Park, established in 1936 in Uttarakhand as 'Hailey National Park'?",
            listOf("काजीरंगा राष्ट्रीय उद्यान", "जिम कॉर्बेट राष्ट्रीय उद्यान (Jim Corbett National Park / Ramganga National Park)", "कान्हा राष्ट्रीय उद्यान", "गिर राष्ट्रीय उद्यान"),
            listOf("Kaziranga National Park", "Jim Corbett National Park (Uttarakhand - formerly Hailey National Park)", "Kanha National Park", "Gir National Park"),
            1,
            "1936 में उत्तराखंड के नैनीताल/पौड़ी गढ़वाल में स्थापित 'हेली नेशनल पार्क' भारत और एशिया का पहला राष्ट्रीय उद्यान था। स्वतंत्रता के बाद इसका नाम रामगंगा और 1957 में प्रसिद्ध शिकारी-संरक्षक जिम कॉर्बेट के नाम पर रखा गया।",
            "Established in 1936 as Hailey National Park to protect the Bengal tiger, Jim Corbett National Park in Uttarakhand holds the distinction of being India's oldest national park.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q12", "sci_6",
            "एक सींग वाले भारतीय गैंडे (One-Horned Rhinoceros) के लिए विश्व प्रसिद्ध राष्ट्रीय उद्यान कौन-सा है?",
            "Which UNESCO World Heritage National Park in Assam hosts two-thirds of the world's Great One-Horned Rhinoceroses (Rhinoceros unicornis)?",
            listOf("मानस राष्ट्रीय उद्यान", "काजीरंगा राष्ट्रीय उद्यान (Kaziranga National Park, Assam)", "जिम कॉर्बेट", "सुंदरबन"),
            listOf("Manas National Park", "Kaziranga National Park (Golaghat and Nagaon districts, Assam)", "Jim Corbett", "Sundarbans"),
            1,
            "असम का काजीरंगा राष्ट्रीय उद्यान ब्रह्मपुत्र नदी के कछार में स्थित है और विश्व के 2600+ एक सींग वाले गैंडों का घर है। यह यूनेस्को विश्व धरोहर स्थल और टाइगर रिजर्व भी है।",
            "Kaziranga National Park in Assam hosts the world's largest breeding population of the Vulnerable Indian One-Horned Rhinoceros.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q13", "sci_6",
            "एशियाई शेरों (Asiatic Lion - Panthera leo persica) का एकमात्र प्राकृतिक निवास स्थान कौन-सा राष्ट्रीय उद्यान है?",
            "Which wildlife sanctuary and national park in Gujarat is the ONLY natural wild habitat of the endangered Asiatic Lion in the world?",
            listOf("रणथंभौर राष्ट्रीय उद्यान", "गिर राष्ट्रीय उद्यान (Gir National Park & Wildlife Sanctuary, Gujarat)", "बांधवगढ़ राष्ट्रीय उद्यान", "सरिस्का"),
            listOf("Ranthambore National Park", "Gir National Park (Junagadh, Gujarat - Sasan Gir)", "Bandhavgarh National Park", "Sariska"),
            1,
            "गुजरात के सौराष्ट्र क्षेत्र में स्थित गिर वन (Gir Forest) विश्व में एशियाई शेरों का एकमात्र प्राकृतिक घर है। इनकी गर्दन के अयाल (Mane) अफ्रीकी शेरों से थोड़े छोटे होते हैं और पेट पर त्वचा की अनुदैर्ध्य सिलवट होती है।",
            "Gir National Park in Gujarat preserves the sole surviving wild population of Asiatic Lions, saved from near extinction by the Nawabs of Junagadh and forest departments.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m2_q14", "sci_6",
            "विश्व का एकमात्र तैरता हुआ राष्ट्रीय उद्यान (World's Only Floating National Park) 'केइबुल लामजाओ' किस झील में स्थित है?",
            "Keibul Lamjao National Park, the world's only floating national park famous for the endangered Sangai Brow-antlered Deer, is situated on which freshwater lake in Manipur?",
            listOf("चिल्का झील", "लोकटक झील (Loktak Lake, Manipur - Floating Phumdis)", "वूलर झील", "सांभर झील"),
            listOf("Chilika Lake", "Loktak Lake (Manipur - floating decomposed biomass mats called 'Phumdis')", "Wular Lake", "Sambhar Lake"),
            1,
            "मणिपुर की लोकटक झील में स्थित केइबुल लामजाओ तैरते हुए जैविक द्वीपों 'फुmdi' (Phumdi) पर बना है। यह मणिपुर के राज्य पशु 'संगाई हिरण' (Dancing Deer / Rucervus eldii) का एकमात्र प्राकृतिक घर है।",
            "Keibul Lamjao National Park on Loktak Lake in Manipur floats atop heterogenous masses of soil and organic matter (Phumdis), harboring the endemic Sangai deer.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m1_q15", "sci_6",
            "भारत का पहला बायोस्फीयर रिजर्व (First Biosphere Reserve of India) 1986 में कौन-सा घोषित किया गया था?",
            "Which was established as the First Biosphere Reserve in India in 1986 under UNESCO's Man and the Biosphere (MAB) Program?",
            listOf("सुंदरबन", "नीलगिरि बायोस्फीयर रिजर्व (Nilgiri Biosphere Reserve - TN, Kerala, Karnataka)", "नंदा देवी", "मन्नार की खाड़ी"),
            listOf("Sundarbans", "Nilgiri Biosphere Reserve (Spanning Tamil Nadu, Kerala, and Karnataka)", "Nanda Devi", "Gulf of Mannar"),
            1,
            "नीलगिरि बायोस्फीयर रिजर्व (1986) पश्चिमी घाट में तमिलनाडु, केरल और कर्नाटक के संगम पर स्थित है। इसमें नीलगिरि तहर और लायन-टेल्ड मकाक (शेर-पूंछ बंदर) जैसे संकटग्रस्त जीव पाए जाते हैं।",
            "The Nilgiri Biosphere Reserve was designated in 1986 in the Western Ghats mountain range, encompassing Silent Valley, Bandipur, Mudumalai, and Wayanad sanctuaries.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 3 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_6_m3_q1", "sci_6",
            "चिपको आंदोलन (Chipko Movement - 1973) की शुरुआत उत्तराखंड (तत्कालीन यूपी) के चमोली जिले के रेणी गांव में पेड़ों की कटाई रोकने के लिए किसके नेतृत्व में हुई थी?",
            "The grassroots Chipko Movement to hug forest trees to prevent commercial deforestation was launched in 1973 in Chamoli (Uttarakhand) under the leadership of:",
            listOf("मेधा पाटकर", "चंडी प्रसाद भट्ट, गौरा देवी और सुंदरलाल बहुगुणा (Chandi Prasad Bhatt, Gaura Devi, Sunderlal Bahuguna)", "बाबा आम्टे", "अरुंधति रॉय"),
            listOf("Medha Patkar (Narmada Bachao)", "Chandi Prasad Bhatt, Gaura Devi, and Sunderlal Bahuguna", "Baba Amte", "Arundhati Roy"),
            1,
            "1973 में गोपेश्वर/रेणी गांव में गौरा देवी और ग्रामीण महिलाओं ने पेड़ों से चिपककर ठेकेदारों की कुल्हाड़ियों से पेड़ों की रक्षा की। सुंदरलाल बहुगुणा ने 'पारिस्थितिकी स्थायी अर्थव्यवस्था है' का नारा देकर इसे वैश्विक पहचान दिलाई।",
            "The Chipko Movement utilized non-violent Gandhian tree-hugging tactics led by Chandi Prasad Bhatt (DGSM), Gaura Devi, and Sunderlal Bahuguna to preserve Himalayan forests.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q2", "sci_6",
            "1730 में राजस्थान के खेजड़ली गांव में खेजड़ी के पेड़ों को बचाने के लिए अपनी तीन बेटियों सहित 363 बिश्नोईयों के साथ अपने प्राणों की आहुति देने वाली वीरांगना कौन थीं?",
            "In 1730 at Khejarli village (Jodhpur), who led 363 Bishnoi martyrs in sacrificing their lives to protect sacred Khejri trees (Prosopis cineraria) from the royal axe?",
            listOf("गौरा देवी", "अमृता देवी बिश्नोई (Amrita Devi Bishnoi)", "रानी अहिल्याबाई", "पन्ना धाय"),
            listOf("Gaura Devi", "Amrita Devi Bishnoi (Amrita Devi Bishnoi National Wildlife Protection Award)", "Rani Ahilyabai", "Panna Dai"),
            1,
            "अमृता देवी बिश्नोई ने कहा था: 'सीर सांटे रूंख रहे तो भी सस्तो जाण' (यदि सिर कटने के बाद भी एक पेड़ बच जाए तो यह सस्ता सौदा है)। भारत सरकार वन्यजीव संरक्षण के लिए 'अमृता देवी बिश्नोई राष्ट्रीय पुरस्कार' देती है।",
            "Amrita Devi Bishnoi and 363 Bishnois were slain protecting sacred Khejri trees from the Maharaja of Marwar's woodcutters, inspiring modern forestry movements.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q3", "sci_6",
            "नर्मदा बचाओ आंदोलन (Narmada Bachao Andolan - NBA) का नेतृत्व नर्मदा नदी पर बनने वाले सरदार सरोवर बड़े बांध के विस्थापितों और पर्यावरण संरक्षण के लिए किसने किया था?",
            "Which social and environmental movement was led by Medha Patkar and Baba Amte to oppose large dam construction and submergence along the Narmada river basin?",
            listOf("चिपको आंदोलन", "नर्मदा बचाओ आंदोलन (Narmada Bachao Andolan - Medha Patkar & Baba Amte)", "अप्पिको आंदोलन", "साइलेंट वैली आंदोलन"),
            listOf("Chipko Movement", "Narmada Bachao Andolan (Led by Medha Patkar, Baba Amte, and local adivasis)", "Appiko Movement", "Silent Valley Movement"),
            1,
            "मेधा पाटकर और बाबा आम्टे ने 1985 से सरदार सरोवर बांध की ऊंचाई बढ़ाने के कारण लाखों आदिवासियों के विस्थापन और जंगलों के जलमग्न होने के विरोध में अहिंसक आंदोलन चलाया।",
            "Narmada Bachao Andolan mobilized tribal communities against human displacement and forest inundation caused by the Sardar Sarovar and Indira Sagar megadams.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q4", "sci_6",
            "कर्नाटक के उत्तर कन्नड़ जिले में 1983 में पश्चिमी घाट के जंगलों को बचाने के लिए शुरू हुआ 'अप्पिको आंदोलन' (Appiko Movement) किस आंदोलन का दक्षिणी रूप था?",
            "The 1983 Appiko Movement in Karnataka's Western Ghats, led by Pandurang Hegde, was the southern Indian counterpart of which movement?",
            listOf("नर्मदा बचाओ आंदोलन", "चिपको आंदोलन (Chipko Movement - 'Appiko' means to embrace in Kannada)", "जंगल बचाओ आंदोलन", "टिहरी बांध आंदोलन"),
            listOf("Narmada Bachao Andolan", "Chipko Movement ('Appiko' is the Kannada verb for 'to hug/embrace')", "Jungle Bachao Andolan", "Tehri Dam Movement"),
            1,
            "पांडुरंग हेगड़े के नेतृत्व में सिरसी के गुब्बीगाडे वन में ग्रामीणों ने पेड़ों को गले लगाया ('अप्पिको') और पश्चिमी घाट के उष्णकटिबंधीय वर्षावनों की व्यावसायिक कटाई को रुकवाया।",
            "The Appiko movement mobilized local youth in Uttara Kannada to hug forest trees, successfully halting clear-felling and mono-culture teak plantations in the Western Ghats.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q5", "sci_6",
            "केरल की 'साइलेंट वैली' (शांत घाटी) को 1970 के दशक में किस नदी पर जलविद्युत बांध बनने से बचाने के लिए एक ऐतिहासिक जन आंदोलन चलाया गया था?",
            "The Save Silent Valley movement in Kerala successfully protested against a hydroelectric dam project proposed across which pristine river?",
            listOf("पेरियार नदी", "कुंतीपुझा नदी (Kunthipuzha River in Silent Valley)", "कावेरी नदी", "भरतपुझा नदी"),
            listOf("Periyar river", "Kunthipuzha River (Tributary of Bharathapuzha traversing Silent Valley)", "Kaveri river", "Pamba river"),
            1,
            "केरल शास्त्र साहित्य परिषद (KSSP) और कवयित्री सुगतकुमारी के नेतृत्व में कुंतीपुझा नदी पर बांध का विरोध हुआ ताकि शेर-पूंछ वाले बंदरों (Lion-tailed Macaque) के वर्षावन को जलमग्न होने से बचाया जा सके। 1984 में इसे राष्ट्रीय उद्यान घोषित किया गया।",
            "The Save Silent Valley movement protected India's last undisturbed tropical evergreen rainforest from submersion by the proposed Kunthipuzha hydroelectric project.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_6_m3_q6", "sci_6",
            "जैव आवर्धन (Biomagnification / Biological Magnification) क्या होता है?",
            "What is the ecological phenomenon of 'Biomagnification'?",
            listOf("जीवों का आकार बड़ा होना", "खाद्य श्रृंखला में उच्च पोषी स्तरों पर अजैव-निम्नीकरणीय विषैले रसायनों (जैसे DDT, पारा) की सांद्रता में लगातार वृद्धि होना", "पौधों का तेजी से बढ़ना", "जीवों की संख्या बढ़ना"),
            listOf("Growth in organism size", "Progressive increase in the concentration of persistent non-biodegradable toxins (DDT, Mercury) at successive higher trophic levels", "Plant blooming", "Population increase"),
            1,
            "DDT या भारी धातुएं (Hg) वसा में घुलनशील और अजैव-निम्नीकरणीय होती हैं। जब एक स्तर का जीव दूसरे स्तर द्वारा खाया जाता है, तो शीर्ष उपभोक्ता (जैसे बाज़, गिद्ध, मानव) में विष की सांद्रता लाखों गुना बढ़ जाती है।",
            "Biomagnification occurs when persistent bioaccumulative toxic substances (PBTs) concentrate up the food chain, causing eggshell thinning in raptors or mercury poisoning in apex predators.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q7", "sci_6",
            "भारत में गिद्धों (Vultures) की आबादी 99% तक समाप्त होने का मुख्य कारण किस पशु दर्द निवारक दवा का उपयोग था जिसे बाद में प्रतिबंधित किया गया?",
            "The catastrophic 99% collapse of the Indian White-rumped and Gyps Vulture populations was caused by renal failure from feeding on livestock treated with which NSAID drug?",
            listOf("पैरासिटामोल", "डाइक्लोफेनाक (Diclofenac Sodium)", "एस्पिरिन", "इबुप्रोफेन"),
            listOf("Paracetamol", "Diclofenac (Veterinary Non-Steroidal Anti-Inflammatory Drug - NSAID)", "Aspirin", "Ibuprofen"),
            1,
            "मवेशियों के दर्द व सूजन के लिए दी जाने वाली 'डाइक्लोफेनाक' दवा मृत पशुओं के मांस में रह जाती थी। इसे खाने पर गिद्धों में यूरिक एसिड जमा होकर गुर्दे फेल (Visceral Gout) हो जाते थे। 2006 में भारत सरकार ने इस पर पशु चिकित्सा में पूर्ण प्रतिबंध लगाया।",
            "Veterinary Diclofenac administered to cattle causes fatal visceral gout and acute renal failure in scavenging Gyps vultures, precipitating an unprecedented ecological collapse.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q8", "sci_6",
            "सुपोषण (Eutrophication) जल निकायों में किस प्रकार की मानवीय गतिविधियों के कारण होता है जिससे 'शैवाल प्रस्फुटन' (Algal Bloom) और मछलियों की मृत्यु होती है?",
            "Cultural Eutrophication of freshwater lakes is driven by excessive runoff of which agricultural and sewage plant nutrients?",
            listOf("सोडियम और पोटेशियम", "नाइट्रोजन और फॉस्फोरस लवण (Nitrogen & Phosphorus from fertilizers and detergents)", "कैल्शियम और मैग्नीशियम", "लोहा और तांबा"),
            listOf("Sodium and Potassium", "Nitrates (NO₃⁻) and Phosphates (PO₄³⁻) from agricultural fertilizers and untreated domestic sewage", "Calcium and Magnesium", "Iron and Copper"),
            1,
            "उर्वरकों और डिटर्जेंट से बहकर आए नाइट्रोजन और फॉस्फोरस से शैवाल तेजी से फैलते हैं (Algal bloom)। जब शैवाल मरते हैं, तो उनके अपघटन में पानी की समस्त घुलित ऑक्सीजन (DO) समाप्त हो जाती है और जलीय जीव दम घुटने से मर जाते हैं।",
            "Excessive nitrate and phosphate loading induces massive cyanobacterial algal blooms. Subsequent microbial decomposition exhausts dissolved oxygen, creating hypoxic aquatic dead zones.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q9", "sci_6",
            "जल प्रदूषण मापने के लिए प्रयुक्त 'बीओडी' (BOD - Biochemical Oxygen Demand) क्या दर्शाता है?",
            "What does Biochemical Oxygen Demand (BOD), a standard metric of organic water pollution, measure?",
            listOf("जल में ऑक्सीजन का कुल भार", "जल में उपस्थित कार्बनिक पदार्थों को अपघटित करने के लिए सूक्ष्मजीवों द्वारा आवश्यक घुलित ऑक्सीजन की मात्रा (Amount of Dissolved Oxygen needed by aerobic microbes)", "जल का तापमान", "जल की अम्लता"),
            listOf("Total weight of oxygen", "Amount of Dissolved Oxygen required by aerobic microorganisms to biologically oxidize organic waste in water", "Water temperature", "Water acidity"),
            1,
            "BOD जितना अधिक होगा, जल उतना ही अधिक प्रदूषित (कार्बनिक कचरे से भरा) होगा क्योंकि जीवाणुओं को कचरा पचाने के लिए उतनी ही अधिक ऑक्सीजन की आवश्यकता होगी। शुद्ध पेयजल का BOD 1 mg/L से कम होना चाहिए।",
            "High BOD values indicate severe organic pollution where decomposing bacterial populations consume dissolved oxygen, threatening fish and benthic survival.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q10", "sci_6",
            "ध्वनि प्रदूषण (Noise Pollution) की तीव्रता मापने की मानक इकाई क्या है और केंद्रीय प्रदूषण नियंत्रण बोर्ड (CPCB) के अनुसार आवासीय क्षेत्र में दिन का सुरक्षित स्तर क्या है?",
            "What is the standard logarithmic decibel unit for acoustic noise, and what is the CPCB daytime permissible limit for Residential Areas?",
            listOf("हर्ट्ज, 90 dB", "डेसिबल (Decibel - dB), 55 dB (दिन) और 45 dB (रात)", "पास्कल, 100 dB", "लक्स, 75 dB"),
            listOf("Hertz", "Decibels (dB / dBA scale); Residential daytime limit = 55 dB(A) and night = 45 dB(A)", "Pascal", "Lux"),
            1,
            "ध्वनि तीव्रता डेसिबल (dB) में मापी जाती है। CPCB मानक: शांत क्षेत्र (अस्पताल/स्कूल) = 50 dB (दिन)/40 dB (रात); आवासीय क्षेत्र = 55 dB (दिन)/45 dB (रात); वाणिज्यिक = 65 dB; औद्योगिक = 75 dB। 85 dB से अधिक निरंतर ध्वनि सुनने की क्षमता छीन सकती है।",
            "Acoustic noise is quantified on the logarithmic decibel (dB) A-weighted scale. Exposure to sustained sound pressure levels above 80-85 dBA induces permanent sensorineural hearing loss.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q11", "sci_6",
            "वायु गुणवत्ता सूचकांक (AQI - National Air Quality Index) में किन 8 प्रमुख प्रदूषकों की सांद्रता को शामिल किया जाता है?",
            "India's National Air Quality Index (AQI launched in 2014) monitors ambient concentrations of which key pollutant parameters?",
            listOf("केवल CO₂ और ऑक्सीजन", "PM2.5, PM10, NO₂, SO₂, CO, O₃ (ग्राउंड ओजोन), NH₃ (अमोनिया), और Pb (सीसा)", "केवल धुआं और धूल", "नाइट्रोजन, हीलियम, मीथेन"),
            listOf("Only CO₂ and Oxygen", "Eight Pollutants: PM2.5, PM10, Nitrogen Dioxide (NO₂), Sulfur Dioxide (SO₂), Carbon Monoxide (CO), Ground Ozone (O₃), Ammonia (NH₃), and Lead (Pb)", "Only dust", "Nitrogen and helium"),
            1,
            "राष्ट्रीय AQI में 8 प्रदूषक शामिल हैं: PM2.5, PM10, NO₂, SO₂, CO, O₃, NH₃, Pb। इसमें 6 रंग-कोड श्रेणियां हैं: अच्छा (0-50), संतोषजनक (51-100), मध्यम (101-200), खराब (201-300), बहुत खराब (301-400), और गंभीर (401-500)।",
            "The Indian NAQI evaluates 8 criteria pollutants with 'One Number-One Color-One Description' across 6 severity brackets (Good 0-50 to Severe 401-500).",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q12", "sci_6",
            "पार्टिकुलेट मैटर (Particulate Matter - PM2.5) मानव स्वास्थ्य के लिए सबसे खतरनाक क्यों माना जाता है?",
            "Why is fine inhalable Particulate Matter PM2.5 (aerodynamic diameter ≤ 2.5 micrometers) considered exceptionally lethal to human health?",
            listOf("यह केवल त्वचा पर चिपकता है", "यह अत्यंत सूक्ष्म होने के कारण श्वास नली के सुरक्षात्मक बालों को पार कर फेफड़ों की गहराई (एल्वियोली) और रक्तप्रवाह में सीधे प्रवेश कर जाता है", "यह पेट में चला जाता है", "यह पानी में नहीं घुलता"),
            listOf("Only irritates skin", "Due to ultra-fine microscopic size, it bypasses upper respiratory cilia, penetrates deep into pulmonary alveoli, and translocates directly into the bloodstream", "Enters stomach", "Insoluble in water"),
            1,
            "PM2.5 कण मानव बाल के 30वें हिस्से जितने सूक्ष्म होते हैं। सांस लेने पर ये सीधे फेफड़ों की कूपिकाओं में जाकर सूजन, क्रोनिक ब्रोंकाइटिस, हृदय घात (Heart attack), और फेफड़ों का कैंसर पैदा करते हैं।",
            "PM2.5 penetrates deep into alveolar capillary beds, triggering systemic vascular inflammation, arterial plaque rupture, COPD exacerbation, and premature mortality.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q13", "sci_6",
            "प्रकाश-रासायनिक स्मॉग (Photochemical Smog / लॉस एंजिल्स स्मॉग) का निर्माण धूप की उपस्थिति में किन प्राथमिक प्रदूषकों की पारस्परिक क्रिया से होता है?",
            "Photochemical Smog (Los Angeles Smog) is formed on hot sunny days through complex photochemical reactions between Solar UV Radiation and:",
            listOf("सल्फर डाइऑक्साइड और धुआं (लंदन स्मॉग)", "नाइट्रोजन के ऑक्साइड (NO_x) और वाष्पशील कार्बनिक यौगिक (VOCs / हाइड्रोकार्बन)", "केवल कार्बन डाइऑक्साइड", "जलवाष्प और धूल"),
            listOf("SO₂ and smoke (Classical London Smog)", "Nitrogen Oxides (NO_x) and Volatile Organic Compounds (VOCs) generating secondary Ground-Level Ozone and PAN", "Carbon dioxide only", "Water vapor and dust"),
            1,
            "वाहनों के धुएं से निकले नाइट्रोजन ऑक्साइड (NO_x) और बिना जले हाइड्रोकार्बन (VOCs) जब तेज धूप में क्रिया करते हैं, तो ग्राउंड-लेवल ओजोन (O₃), फॉर्मेल्डिहाइड और परऑक्सीएसिटाइल नाइट्रेट (PAN) का दमघोंटू भूरा स्मॉग बनाते हैं।",
            "Photochemical smog is an oxidizing cocktail of secondary pollutants (Ozone, Peroxyacetyl Nitrate / PAN, Aldehydes) driven by sunlight-mediated photo-oxidation of NO_x and hydrocarbons.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q14", "sci_6",
            "रामसर कन्वेंशन (Ramsar Convention - 1971) किस प्रकार के पारिस्थितिक तंत्रों के संरक्षण और विवेकपूर्ण उपयोग के लिए एक अंतरराष्ट्रीय संधि है?",
            "The Ramsar Convention, signed in the Iranian city of Ramsar in 1971, is an intergovernmental environmental treaty dedicated to the global conservation of:",
            listOf("रेगिस्तानों के संरक्षण", "आर्द्रभूमियों / दलदली क्षेत्रों (Wetlands - Marshes, Bogs, Estuaries, Lakes)", "पहाड़ों के संरक्षण", "घास के मैदानों"),
            listOf("Deserts", "Wetlands of International Importance (Swamps, peatlands, mangroves, lakes, tidal flats)", "Mountains", "Grasslands"),
            1,
            "रामसर कन्वेंशन (2 फरवरी 1971) आर्द्रभूमियों (Wetlands) के संरक्षण के लिए हुआ था। प्रतिवर्ष 2 फरवरी को 'विश्व आर्द्रभूमि दिवस' मनाया जाता है। भारत 1982 में इसमें शामिल हुआ और भारत में 85+ रामसर स्थल हैं (चिल्का झील और केवलादेव प्रथम थे)।",
            "The Ramsar Convention promotes the wise use of international wetlands. India designated its first Ramsar sites (Chilika Lake and Keoladeo National Park) in 1981.",
            "Easy"
        ),
        makeScienceQ(
            "sci_6_m3_q15", "sci_6",
            "भारत का सबसे बड़ा मैंग्रोव वन (Largest Mangrove Forest) और विश्व का सबसे बड़ा डेल्टा कौन-सा है जो रॉयल बंगाल टाइगर का निवास है?",
            "Which is the Largest contiguous Mangrove Forest ecosystem in the world, shared between India and Bangladesh across the Ganges-Brahmaputra-Meghna delta?",
            listOf("भितरकनिका मैंग्रोव (ओडिशा)", "सुंदरबन मैंग्रोव (Sundarbans Mangrove Forest - West Bengal)", "पिचावरम मैंग्रोव (तमिलनाडु)", "कच्छ का रन"),
            listOf("Bhitarkanika (Odisha)", "Sundarbans (West Bengal - UNESCO World Heritage Site & Biosphere Reserve)", "Pichavaram (Tamil Nadu)", "Rann of Kutch"),
            1,
            "सुंदरबन (~10,000 वर्ग किमी) गंगा-ब्रह्मपुत्र डेल्टा पर स्थित विश्व का सबसे बड़ा ज्वारीय मैंग्रोव वन है। इसका नाम 'सुंदरी' (Heritiera fomes) वृक्षों की प्रचुरता के कारण पड़ा है। यह रॉयल बंगाल टाइगर का प्रमुख आवास है।",
            "The Sundarbans delta hosts the world's most expansive halophytic mangrove forest, stabilizing coastal shorelines and sheltering apex Panthera tigris tigris tigers.",
            "Easy"
        )
    )
}
