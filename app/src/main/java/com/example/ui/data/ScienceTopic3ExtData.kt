package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic3ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m6_q1", "sci_3",
            "बोस-आइंस्टीन संघनन (Bose-Einstein Condensate - BEC) पदार्थ की कौन-सी अवस्था है?",
            "Bose-Einstein Condensate (BEC) represents which fundamental state of matter formed near absolute zero?",
            listOf("तीसरी अवस्था", "पांचवीं अवस्था (Fifth State of Matter)", "चौथी अवस्था", "छठी अवस्था"),
            listOf("Third state", "Fifth State of Matter (Predicted by SN Bose and Einstein in 1924)", "Fourth state", "Sixth state"),
            1,
            "1924 में भारतीय वैज्ञानिक सत्येंद्र नाथ बोस और अल्बर्ट आइंस्टीन द्वारा परिकल्पित यह पदार्थ की 5वीं अवस्था है, जिसमें परम शून्य ताप (~0 K) के निकट अति-निम्न घनत्व वाली गैस के परमाणु एक ही क्वांटम अवस्था में आकर 'सुपर-परमाणु' बन जाते हैं।",
            "Predicted by Satyendra Nath Bose and Albert Einstein (1924) and realized in 1995 (Cornell, Wieman, Ketterle), BEC is the 5th state of matter where bosonic atoms collapse into the lowest quantum ground state.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m6_q2", "sci_3",
            "पॉजिट्रॉन (Positron / e⁺) की खोज 1932 में किसने की थी जो इलेक्ट्रॉन का प्रतिकण (Antiparticle) है?",
            "Who discovered the Positron (the antimatter counterpart of the electron with +1e charge) in cosmic ray tracks in 1932?",
            listOf("पॉल डिराक", "कार्ल एंडरसन (Carl D. Anderson)", "अर्नेस्ट लॉरेंस", "जेम्स चैडविक"),
            listOf("Paul Dirac", "Carl D. Anderson", "Ernest Lawrence", "James Chadwick"),
            1,
            "कार्ल डी. एंडरसन ने क्लाउड चैंबर में कॉस्मिक किरणों का अध्ययन करते हुए पॉजिट्रॉन की खोज की, जिसके लिए उन्हें 1936 में नोबेल पुरस्कार दिया गया। डिराक ने इसका सैद्धांतिक पूर्वानुमान दिया था।",
            "Carl D. Anderson experimentally observed the Positron in a cloud chamber in 1932, confirming Paul Dirac's theoretical antimatter equation and winning the 1936 Nobel Prize.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m6_q3", "sci_3",
            "पेट स्कैन (PET Scan - Positron Emission Tomography) चिकित्सा में किसका पता लगाने के लिए पॉजिट्रॉन उत्सर्जक रेडियोट्रेसर (जैसे Fluorodeoxyglucose - FDG) का उपयोग करता है?",
            "PET Scans (Positron Emission Tomography) utilize positron-emitting isotopes (F-18 FDG) primarily to map:",
            listOf("हड्डियों का घनत्व", "कैंसर ट्यूमर और मस्तिष्क में ग्लूकोज चयापचय (Glucose Metabolism & Malignancy)", "रक्तचाप", "फेफड़ों की क्षमता"),
            listOf("Bone density", "Cellular Glucose Metabolism, Cancerous Metastasis and Brain Activity", "Blood pressure", "Lung vital capacity"),
            1,
            "कैंसर कोशिकाएं तेजी से विभाजित होने के कारण सामान्य कोशिकाओं से कई गुना अधिक ग्लूकोज (FDG) खाती हैं। पॉजिट्रॉन के इलेक्ट्रॉन से विलोपन (Annihilation) पर उत्पन्न दो विपरीत गामा किरणों को पकड़कर सटीक 3D इमेजिंग की जाती है।",
            "Malignant tumor cells exhibit hypermetabolic glucose consumption. Positron-electron annihilations yield coincident 511 keV gamma photon pairs mapped by ring detectors.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m6_q4", "sci_3",
            "क्वांटम कंप्यूटर (Quantum Computers) पारंपरिक बाइनरी बिट्स (0 या 1) के स्थान पर किसका उपयोग करते हैं जो सुपरपोजिशन और एंटैंगलमेंट के सिद्धांत पर कार्य करते हैं?",
            "Quantum computers process information using quantum units that can exist simultaneously as 0, 1, or any linear superposition, known as:",
            listOf("मेगाबाइट्स", "क्यूबिट्स (Qubits / Quantum Bits)", "टेराबाइट्स", "लॉजिक गेट्स"),
            listOf("Megabytes", "Qubits (Quantum Bits)", "Terabytes", "Silicon Gates"),
            1,
            "क्यूबिट (Qubit) क्वांटम सुपरपोजिशन के कारण एक साथ 0 और 1 दोनों अवस्थाओं में रह सकता है। n क्यूबिट एक साथ 2^n अवस्थाओं की समानांतर गणना कर सकते हैं, जिससे जटिल समस्याओं का समाधान सेकंडों में होता है।",
            "Qubits harness quantum superposition and entanglement to represent complex superposed states (|0⟩ and |1⟩), delivering exponential parallel processing power.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m6_q5", "sci_3",
            "भारत सरकार द्वारा 2023 में स्वीकृत 'राष्ट्रीय क्वांटम मिशन' (National Quantum Mission - NQM) का मुख्य लक्ष्य क्या है?",
            "What is the primary objective of India's 'National Quantum Mission' (NQM) sanctioned in 2023?",
            listOf("सौर पैनल निर्माण", "50 से 1000 भौतिक क्यूबिट क्षमता वाले स्वदेशी क्वांटम कंप्यूटर और सुरक्षित क्वांटम संचार विकसित करना", "सुपरसोनिक मिसाइल बनाना", "कोयला खनन बढ़ाना"),
            listOf("Solar panel manufacturing", "Developing indigenous 50-1000 physical Qubit Quantum Computers and secure Quantum Communications", "Supersonic missiles", "Coal mining"),
            1,
            "NQM (लागत ₹6,003 करोड़) के तहत 8 वर्षों में 50-1000 क्यूबिट के क्वांटम कंप्यूटर, 2000 किमी तक सुरक्षित क्वांटम की डिस्ट्रीब्यूशन (QKD), और क्वांटम सेंसिंग तकनीक विकसित करना है।",
            "India's National Quantum Mission aims to build scaled intermediate-scale quantum computers (50-1000 physical qubits) and secure satellite-based quantum key distribution networks.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m6_q6", "sci_3",
            "गुरुत्वाकर्षण तरंगों (Gravitational Waves) की पहली प्रत्यक्ष प्रायोगिक खोज 2015 में किस वेधशाला (Observatory) द्वारा की गई?",
            "Gravitational Waves produced by colliding black holes were first directly detected in September 2015 by:",
            listOf("हबल स्पेस टेलीस्कोप", "लीगो (LIGO - Laser Interferometer Gravitational-Wave Observatory)", "सर्न एलएचसी", "केप्लर मिशन"),
            listOf("Hubble Telescope", "LIGO (Laser Interferometer Gravitational-Wave Observatory)", "CERN LHC", "Kepler Mission"),
            1,
            "आइंस्टीन ने 1916 में सापेक्षता के सामान्य सिद्धांत में स्पेस-टाइम में गुरुत्वीय तरंगों का पूर्वानुमान लगाया था। 100 वर्ष बाद 14 सितंबर 2015 को LIGO (हैनफोर्ड और लिविंगस्टन) ने दो ब्लैक होल के विलय से उत्पन्न तरंगों को पकड़ा।",
            "LIGO's twin 4-kilometer laser interferometers recorded the gravitational wave signal GW150914 from a binary black hole merger, confirming Einstein's 1916 General Relativity prediction.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m6_q7", "sci_3",
            "भारत में 'लीगो-इंडिया' (LIGO-India) उन्नत गुरुत्वाकर्षण तरंग वेधशाला किस राज्य में स्थापित की जा रही है?",
            "The advanced gravitational-wave detector observatory 'LIGO-India' is being established in which state?",
            listOf("राजस्थान", "महाराष्ट्र (हिंगोली जिला)", "कर्नाटक", "गुजरात"),
            listOf("Rajasthan", "Maharashtra (Hingoli district)", "Karnataka", "Gujarat"),
            1,
            "LIGO-India वेधशाला महाराष्ट्र के हिंगोली जिले में परमाणु ऊर्जा विभाग (DAE) और विज्ञान एवं प्रौद्योगिकी विभाग (DST) द्वारा अमेरिकी NSF के सहयोग से स्थापित की जा रही है।",
            "LIGO-India is under construction in Hingoli district, Maharashtra, creating a globally synchronized triangulation network with US and European detectors.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m6_q8", "sci_3",
            "विश्व की सबसे बड़ी कण त्वरक प्रयोगशाला 'सर्न' (CERN - European Organization for Nuclear Research) कहाँ स्थित है?",
            "Where is CERN's Large Hadron Collider (LHC)—the world's most powerful particle accelerator—located?",
            listOf("पेरिस, फ्रांस", "जिनेवा, स्विट्जरलैंड-फ्रांस सीमा पर (Geneva)", "लंदन, यूके", "बर्लिन, जर्मनी"),
            listOf("Paris, France", "Geneva, on the Franco-Swiss border", "London, UK", "Berlin, Germany"),
            1,
            "सर्न (CERN) जिनेवा में स्विट्जरलैंड और फ्रांस की सीमा पर 100 मीटर नीचे 27 किलोमीटर लंबी वृत्ताकार सुरंग (LHC) में स्थित है, जहाँ प्रोटॉनों को प्रकाश के 99.999999% वेग पर टकराया जाता है।",
            "CERN is situated near Geneva across the Franco-Swiss border, operating the 27-kilometer circumference Large Hadron Collider (LHC).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m6_q9", "sci_3",
            "नाभिकीय रिएक्टर में 'क्रांतिक द्रव्यमान' (Critical Mass) का क्या अर्थ है?",
            "In nuclear physics, what is the definition of Critical Mass for a fissile material?",
            listOf("परमाणु बम का कुल वजन", "सतत स्वतःस्फूर्त विखंडन श्रृंखला अभिक्रिया (Self-sustaining Chain Reaction) बनाए रखने के लिए आवश्यक न्यूनतम विखंडनीय द्रव्यमान", "रिएक्टर का कुल भार", "ईंधन की आधी मात्रा"),
            listOf("Total bomb weight", "The minimum mass of fissile material required to sustain a continuous self-supporting nuclear chain reaction (k = 1)", "Total reactor mass", "Half fuel mass"),
            1,
            "क्रांतिक द्रव्यमान (Critical Mass) विखंडनीय पदार्थ (जैसे U-235 या Pu-239) की वह न्यूनतम मात्रा है जिसमें उत्पन्न न्यूट्रॉनों की संख्या लुप्त होने वाले न्यूट्रॉनों से संतुलित होकर गुणांक k = 1 बनाए रखती है।",
            "Critical mass is the smallest amount of fissile nuclide required to sustain a steady nuclear chain reaction without external neutron sources (effective multiplication factor k = 1).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m6_q10", "sci_3",
            "परमाणु दुर्घटना 'चेरनोबिल आपदा' (Chernobyl Disaster - 1986) किस देश (तत्कालीन सोवियत संघ) में घटित हुई थी?",
            "The catastrophic 1986 Chernobyl nuclear power plant disaster occurred in which country (then part of USSR)?",
            listOf("रूस", "यूक्रेन (Ukraine - Pripyat)", "बेलारूस", "कजाकिस्तान"),
            listOf("Russia", "Ukraine (Pripyat / Chernobyl)", "Belarus", "Kazakhstan"),
            1,
            "26 अप्रैल 1986 को यूक्रेन के चेरनोबिल परमाणु ऊर्जा संयंत्र के रिएक्टर नंबर 4 में भाप विस्फोट और कोर मेल्टडाउन हुआ, जो इतिहास की सबसे भीषण परमाणु दुर्घटना (स्तर 7) मानी जाती है।",
            "On 26 April 1986, Reactor No. 4 at the Chernobyl nuclear station near Pripyat in northern Ukraine exploded during a safety test, releasing vast radioactive fallout across Europe.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m6_q11", "sci_3",
            "2011 में भीषण भूकंप और सुनामी के कारण किस जापानी परमाणु ऊर्जा संयंत्र में गंभीर कोर मेल्टडाउन दुर्घटना हुई थी?",
            "Which Japanese nuclear power facility suffered a major level-7 meltdown disaster following the March 2011 Tohoku earthquake and tsunami?",
            listOf("काशीवाज़ाकी", "फुकुशिमा दाइची (Fukushima Daiichi)", "तोकाई", "हमाओका"),
            listOf("Kashiwazaki", "Fukushima Daiichi Nuclear Power Plant", "Tokai", "Hamaoka"),
            1,
            "11 मार्च 2011 को 15 मीटर ऊंची सुनामी ने फुकुशिमा दाइची संयंत्र के बैकअप डीजल जनरेटरों को नष्ट कर दिया, जिससे कूलिंग बंद हो गई और रिएक्टर 1, 2 और 3 में हाइड्रोजन विस्फोट व मेल्टडाउन हुआ।",
            "The 2011 tsunami disabled emergency backup cooling systems at the Fukushima Daiichi nuclear complex, leading to overheating, hydrogen gas explosions, and triple core meltdowns.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m6_q12", "sci_3",
            "नाभिकीय संलयन में सबसे आसानी से संलयित होने वाला ईंधन युग्म कौन-सा है जो 17.6 MeV ऊर्जा मुक्त करता है?",
            "Which isotopic fuel mixture exhibits the lowest ignition temperature and highest cross-section for commercial fusion reactors?",
            listOf("प्रोटियम और हीलियम", "ड्यूटेरियम और ट्रिटियम (D-T Reaction: ²H + ³H → ⁴He + n + 17.6 MeV)", "कार्बन और नाइट्रोजन", "यूरेनियम और प्लूटोनियम"),
            listOf("Protium and Helium", "Deuterium and Tritium (D-T reaction: ²H + ³H → ⁴He + n + 17.6 MeV)", "Carbon and Nitrogen", "Uranium and Plutonium"),
            1,
            "ड्यूटेरियम (समुद्री जल से) और ट्रिटियम (लिथियम से) का संलयन सबसे कम तापमान (~10 करोड़ K) पर होता है और प्रति अभिक्रिया 14.1 MeV का न्यूट्रॉन तथा 3.5 MeV का अल्फा कण उत्पन्न करता है।",
            "The Deuterium-Tritium (D-T) reaction has the lowest kinetic barrier and highest reaction yield (17.6 MeV total energy per fusion event), serving as the primary fuel for ITER.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m6_q13", "sci_3",
            "प्लाज्मा को अत्यधिक उच्च तापमान पर किसी ठोस बर्तन की दीवार को छुए बिना चुंबकीय क्षेत्र द्वारा परिबद्ध रखने वाले डोनट के आकार के उपकरण को क्या कहते हैं?",
            "What is the donut-shaped (toroidal) magnetic confinement device used to trap high-temperature fusion plasma called?",
            listOf("साइक्लोट्रॉन", "टोकामक (Tokamak)", "सिंक्रोट्रॉन", "बीटाट्रॉन"),
            listOf("Cyclotron", "Tokamak (Toroidal Chamber with Magnetic Coils)", "Synchrotron", "Betatron"),
            1,
            "टोकामक (रूसी संक्षेप: Toroidalnaya Kamera s Magnitnymi Katushkami) डोनट के आकार का कक्ष है जो मजबूत हेलिकल चुंबकीय क्षेत्र द्वारा 15 करोड़ डिग्री के गर्म प्लाज्मा को दीवारों से दूर हवा में तैरता रखता है।",
            "A Tokamak uses helical toroidal and poloidal magnetic fields to confine burning fusion plasma in a doughnut geometry away from vessel walls.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m6_q14", "sci_3",
            "रेडियोधर्मी विकिरण की मानव शरीर द्वारा अवशोषित मात्रा (Absorbed Dose) का SI मात्रक क्या है?",
            "What is the SI unit for measuring Absorbed Dose of Ionizing Radiation (1 Joule per kilogram)?",
            listOf("रॉन्टगन", "ग्रे (Gray - Gy)", "सीवर्ट (Sievert - Sv)", "क्यूरी"),
            listOf("Röntgen", "Gray (Gy = 1 J/kg)", "Sievert (Sv)", "Curie"),
            1,
            "अवशोषित विकिरण खुराक का SI मात्रक ग्रे (Gray - Gy = 1 J/kg) है। जैविक ऊतकों पर इसके समतुल्य प्रभाव (Equivalent Dose) का SI मात्रक सीवर्ट (Sievert - Sv) है।",
            "Gray (Gy) measures physical absorbed ionizing radiation energy (1 J/kg of matter). Sievert (Sv) quantifies biological equivalent dose factoring in tissue radiation weighting.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m6_q15", "sci_3",
            "रेडियोधर्मी विकिरण से सुरक्षा के लिए सबसे प्रभावी परिरक्षण (Shielding) सामग्री कौन-सी है?",
            "Which dense metal is the most effective and standard shielding barrier against hazardous Gamma and X-ray radiation?",
            listOf("एल्युमीनियम", "सीसा / लेड (Lead - Pb) और भारी कंक्रीट", "तांबा", "प्लास्टिक"),
            listOf("Aluminium", "Lead (Pb) and Heavy High-Density Concrete", "Copper", "Plastic"),
            1,
            "सीसा (Lead - Z=82) का परमाणु क्रमांक और घनत्व (11.34 g/cm³) बहुत उच्च होता है, जिससे यह फोटोइलेक्ट्रिक प्रभाव और कॉम्पटन प्रकीर्णन द्वारा उच्च ऊर्जा गामा किरणों को अत्यधिक कुशलता से अवशोषित कर लेता है।",
            "Lead (Pb) has a high atomic number (Z = 82) and high physical density, maximizing photoelectric absorption and Compton attenuation of penetrating gamma photons.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 7 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m7_q1", "sci_3",
            "भारत का 'फास्ट ब्रीडर टेस्ट रिएक्टर' (FBTR) और प्रोटोटाइप फास्ट ब्रीडर रिएक्टर (PFBR - 500 MWe) कहाँ स्थित हैं?",
            "India's Fast Breeder Test Reactor (FBTR) and 500 MWe Prototype Fast Breeder Reactor (PFBR) are located at:",
            listOf("तारापुर, महाराष्ट्र", "कलपक्कम, तमिलनाडु (Kalpakkam - IGCAR)", "रावतभाटा, राजस्थान", "नरोरा, उत्तर प्रदेश"),
            listOf("Tarapur, Maharashtra", "Kalpakkam, Tamil Nadu (Indira Gandhi Centre for Atomic Research)", "Rawatbhata, Rajasthan", "Narora, UP"),
            1,
            "कलपक्कम (चेन्नई के पास) में इंदिरा गांधी परमाणु अनुसंधान केंद्र (IGCAR) स्थित है जहाँ भारत के द्वितीय चरण के फास्ट ब्रीडर रिएक्टर हैं, जो ईंधन की खपत से अधिक प्लूटोनियम ईंधन 'पैदा' (Breed) करते हैं।",
            "Kalpakkam hosts IGCAR and the PFBR, India's second-stage liquid-sodium-cooled fast breeder reactor utilizing mixed plutonium-uranium carbide/oxide fuel.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q2", "sci_3",
            "भारत का सबसे बड़ा और सबसे शक्तिशाली परमाणु ऊर्जा संयंत्र कौन-सा है जिसकी क्षमता 2 × 1000 MWe (VVER-1000) है?",
            "Which is India's highest-capacity operational nuclear power station constructed with Russian collaboration?",
            listOf("तारापुर परमाणु केंद्र", "कुडनकुलम परमाणु ऊर्जा संयंत्र (Kudankulam, Tamil Nadu)", "कैगा, कर्नाटक", "काकरापार, गुजरात"),
            listOf("Tarapur Nuclear Station", "Kudankulam Nuclear Power Plant (KKNPP, Tamil Nadu)", "Kaiga, Karnataka", "Kakrapar, Gujarat"),
            1,
            "कुडनकुलम (तमिलनाडु के तिरुनेलवेली जिले में) रूसी तकनीक वाले दो 1000 MW VVER दाबित जल रिएक्टरों (PWR) से सुसज्जित है और 4 और इकाइयां निर्माणाधीन हैं।",
            "Kudankulam Nuclear Power Plant in Tamil Nadu operates two 1,000 MWe VVER pressurized water reactors, making it India's single largest nuclear generation site.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q3", "sci_3",
            "भारत का सबसे पहला वाणिज्यिक परमाणु ऊर्जा संयंत्र 1969 में कहाँ स्थापित किया गया था?",
            "Where was India's first commercial Nuclear Power Station commissioned in October 1969 with US BWR technology?",
            listOf("तारापुर, महाराष्ट्र (Tarapur - TAPS)", "रावतभाटा, राजस्थान", "कलपक्कम, तमिलनाडु", "नरोरा, यूपी"),
            listOf("Tarapur, Maharashtra (TAPS Units 1 & 2)", "Rawatbhata, Rajasthan", "Kalpakkam, Tamil Nadu", "Narora, UP"),
            1,
            "तारापुर परमाणु ऊर्जा स्टेशन (TAPS-1 और 2) भारत और एशिया का पहला वाणिज्यिक परमाणु ऊर्जा केंद्र था, जिसकी स्थापना अमेरिकी जनरल इलेक्ट्रिक के सहयोग से की गई थी।",
            "Tarapur Atomic Power Station (TAPS) in Palghar district, Maharashtra, commenced commercial operation in 1969 as India's first nuclear power facility.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q4", "sci_3",
            "भाभा परमाणु अनुसंधान केंद्र (BARC) का मुख्यालय कहाँ स्थित है?",
            "Where is the headquarters of Bhabha Atomic Research Centre (BARC) located?",
            listOf("नई दिल्ली", "ट्रॉम्बे, मुंबई (Trombay, Mumbai)", "हैदराबाद", "बेंगलुरु"),
            listOf("New Delhi", "Trombay, Mumbai, Maharashtra", "Hyderabad", "Bengaluru"),
            1,
            "BARC भारत का प्रमुख बहुविषयक परमाणु अनुसंधान केंद्र है। इसकी स्थापना जनवरी 1954 में होमी भाभा द्वारा परमाणु ऊर्जा प्रतिष्ठान ट्रॉम्बे (AEET) के रूप में की गई थी, जिसे 1967 में BARC नाम दिया गया।",
            "Bhabha Atomic Research Centre (BARC), established in 1954 at Trombay, Mumbai, serves as the premier multidisciplinary nuclear research center under the Department of Atomic Energy.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q5", "sci_3",
            "इसरो का सबसे भारी और शक्तिशाली प्रक्षेपण यान कौन-सा है जिसे 'बाहुबली' भी कहा जाता है और जिसने चंद्रयान-3 को लॉन्च किया था?",
            "Which is ISRO's heaviest and most capable Launch Vehicle, nicknamed 'Bahubali' (formerly GSLV Mk-III)?",
            listOf("PSLV-C56", "LVM3 (Launch Vehicle Mark-III / GSLV Mk III)", "SSLV", "SLV-3"),
            listOf("PSLV-C56", "LVM3 (Launch Vehicle Mark-III / GSLV Mk-III)", "SSLV", "SLV-3"),
            1,
            "LVM3 (GSLV Mk-III) 3-चरणीय रॉकेट है जिसमें 2 विशाल ठोस स्ट्रैप-ऑन (S200), एक कोर तरल चरण (L110), और एक शक्तिशाली क्रायोजेनिक ऊपरी चरण (C25/CE-20) है। यह GTO में 4,000 किग्रा और LEO में 8,000 किग्रा पेलोड ले जा सकता है।",
            "LVM3 (GSLV Mk III) is ISRO's heavy-lift launch vehicle comprising two S200 solid boosters, an L110 core liquid stage, and a cryogenic CE-20 engine, carrying up to 4 tonnes to GTO.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q6", "sci_3",
            "मंगलयान (Mars Orbiter Mission - MOM) ने 24 सितंबर 2014 को मंगल की कक्षा में प्रवेश कर भारत को अपने पहले ही प्रयास में मंगल पर पहुंचने वाला विश्व का कौन-सा देश बना दिया?",
            "India's Mars Orbiter Mission (Mangalyaan) made India the first nation in the world to reach Mars orbit on its maiden attempt, launched on 5 Nov 2013 by which rocket?",
            listOf("GSLV Mk-II", "PSLV-C25 (PSLV-XL वेरिएंट)", "LVM3", "Ariane 5"),
            listOf("GSLV Mk-II", "PSLV-C25 (PSLV-XL Variant)", "LVM3", "Ariane 5"),
            1,
            "इसरो ने अत्यंत किफायती लागत (~₹450 करोड़) में PSLV-C25 द्वारा 5 नवंबर 2013 को मंगलयान लॉन्च किया, जो 24 सितंबर 2014 को पहले ही प्रयास में सफलतापूर्वक मंगल की कक्षा में स्थापित हुआ।",
            "Mangalyaan (MOM) was launched on 5 November 2013 via PSLV-C25 and inserted into Martian orbit on 24 September 2014 at a record-low cost of ~$74 million.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q7", "sci_3",
            "इसरो द्वारा छोटे उपग्रहों (500 किग्रा तक) को निचली पृथ्वी कक्षा (LEO) में तेजी से और कम लागत में भेजने के लिए विकसित नए रॉकेट का नाम क्या है?",
            "What is the name of ISRO's new compact, low-cost launch vehicle designed to loft up to 500 kg payloads into Low Earth Orbit on demand?",
            listOf("RLV-TD", "SSLV (Small Satellite Launch Vehicle)", "HLV", "Scramjet"),
            listOf("RLV-TD", "SSLV (Small Satellite Launch Vehicle)", "HLV", "Scramjet"),
            1,
            "SSLV 3-चरणीय पूर्णतः ठोस ईंधन रॉकेट है जिसमें अंतिम चरण में वेग ट्रिमिंग मॉड्यूल (VTM तरल) होता है। इसे न्यूनतम बुनियादी ढांचे में 72 घंटे के भीतर तैयार किया जा सकता है।",
            "SSLV is a 3-stage all-solid rocket with a liquid Velocity Trimming Module (VTM) designed for rapid turnaround (<72 hours) and commercial launch of nano/microsatellites.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q8", "sci_3",
            "अंतरिक्ष में भारत की पहली समर्पित खगोलीय वेधशाला उपग्रह (Astronomical Space Observatory) कौन-सी है जिसे 2015 में लॉन्च किया गया था?",
            "Which is India's first dedicated multi-wavelength Space Astronomy Observatory satellite launched by ISRO in September 2015?",
            listOf("सरल (SARAL)", "एस्ट्रोसैट (AstroSat)", "मेघा-ट्रॉपिक्स", "कार्टोसैट-3"),
            listOf("SARAL", "AstroSat", "Megha-Tropiques", "Cartosat-3"),
            1,
            "एस्ट्रोसैट (AstroSat) एक्स-रे, ऑप्टिकल और यूवी स्पेक्ट्रम में एक साथ ब्रह्मांडीय पिंडों, न्यूट्रॉन तारों और ब्लैक होल का अध्ययन करने वाली भारत की अंतरिक्ष दूरबीन है।",
            "AstroSat is India's multi-wavelength space telescope launched into an equatorial 650 km orbit, simultaneously imaging optical, ultraviolet, and low/high-energy X-ray bands.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m7_q9", "sci_3",
            "भारत ने 27 मार्च 2019 को 'मिशन शक्ति' (Mission Shakti) के तहत किस तकनीक का सफल परीक्षण कर अंतरिक्ष में लाइव उपग्रह को मार गिराया?",
            "Under 'Mission Shakti' conducted on 27 March 2019, India successfully demonstrated which strategic defense capability?",
            listOf("एंटी-सैटेलाइट मिसाइल परीक्षण (A-SAT - Kinetic Kill ASAT weapon)", "परमाणु पनडुब्बी लॉन्च", "हाइपरसोनिक ग्लाइड वाहन", "लेजर हथियार"),
            listOf("Anti-Satellite Missile test (A-SAT Kinetic Kill Interceptor)", "Nuclear submarine launch", "Hypersonic Glide Vehicle", "Direct energy weapon"),
            1,
            "DRDO द्वारा विकसित A-SAT इंटरसेप्टर मिसाइल ने 300 किमी की ऊंचाई पर LEO में चक्कर लगा रहे एक सक्रिय भारतीय उपग्रह (Microsat-R) को 'काइनेटिक किल' से पूरी तरह नष्ट किया। भारत ऐसा करने वाला चौथा देश (US, रूस, चीन के बाद) बना।",
            "Mission Shakti demonstrated India's kinetic Anti-Satellite (ASAT) capability by intercepting and destroying a test satellite in Low Earth Orbit (300 km) with pinpoint accuracy.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q10", "sci_3",
            "स्क्रैमजेट इंजन (Scramjet Engine) पारंपरिक रॉकेट इंजनों की तुलना में क्रांतिकारी क्यों है?",
            "Why is a Scramjet (Supersonic Combusting Ramjet) engine fundamentally superior for hypersonic flight?",
            listOf("इसमें ईंधन नहीं होता", "यह सुपरसोनिक गति पर वातावरण से ऑक्सीजन लेकर ईंधन जलाता है, जिससे ऑक्सीकारक ले जाने की आवश्यकता नहीं होती", "यह गुरुत्वाकर्षण को समाप्त कर देता है", "यह प्रकाश की चाल से चलता है"),
            listOf("Uses no fuel", "It ingests atmospheric oxygen at supersonic airflow speeds, eliminating the need to carry heavy onboard oxidizer tanks", "Neutralizes gravity", "Travels at speed of light"),
            1,
            "स्क्रैमजेट (Supersonic Combusting Ramjet) बिना किसी घूर्णन पंखे के मैक 5+ गति पर हवा को संपीडित कर वायुमंडलीय ऑक्सीजन से हाइड्रोजन ईंधन का दहन करता है, जिससे रॉकेट का 70% वजन (ऑक्सीकारक) बच जाता है।",
            "Scramjets operate with supersonic combustion throughout the engine duct, harvesting ambient atmospheric oxygen to power hypersonic cruise vehicles (Mach 5 to 15) with unprecedented efficiency.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m7_q11", "sci_3",
            "सॉलिड स्टेट बैटरियों (Solid-State Batteries) में पारंपरिक लीथियम-आयन बैटरियों की तुलना में क्या मुख्य तकनीकी लाभ होता है?",
            "What is the key technological breakthrough in next-generation Solid-State Lithium Batteries over conventional liquid Li-ion cells?",
            listOf("सस्ता प्लास्टिक", "ज्वलनशील तरल इलेक्ट्रोलाइट के स्थान पर ठोस सिरेमिक/पॉलिमर इलेक्ट्रोलाइट का उपयोग (उच्च ऊर्जा घनत्व, शून्य आग का खतरा, तीव्र चार्जिंग)", "भारी वजन", "कम वोल्टेज"),
            listOf("Cheap plastic casing", "Solid ceramic/polymer electrolyte replacing flammable liquid electrolyte (higher energy density, no fire risk, ultra-fast charging)", "Heavy weight", "Lower voltage"),
            1,
            "सॉलिड-स्टेट बैटरियों में ठोस इलेक्ट्रोलाइट होने से लीथियम डेंड्राइट से शॉर्ट सर्किट और आग लगने का खतरा खत्म हो जाता है, ऊर्जा घनत्व दोगुना हो जाता है और 15 मिनट में चार्जिंग संभव होती है।",
            "Solid-state batteries replace volatile liquid organic solvents with non-flammable solid electrolytes, enabling pure lithium metal anodes, doubling gravimetric energy density and eliminating thermal runaway.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m7_q12", "sci_3",
            "ग्राफीन (Graphene), जिसके लिए 2010 में आंद्रे जीम और कोन्स्टेंटिन नोवोसेलोव को नोबेल पुरस्कार मिला, क्या है?",
            "Graphene, discovered in 2004 using adhesive scotch tape, is a 2D nanomaterial consisting of:",
            listOf("कार्बन की त्रि-विमीय संरचना", "कार्बन परमाणुओं की एकल-परमाण्विक षट्कोणीय जालीदार परत (Single-atom-thick 2D hexagonal honeycomb lattice of carbon)", "सिलिकॉन का यौगिक", "लोहे की नैनोट्यूब"),
            listOf("3D carbon allotrope", "Single-atom-thick 2D hexagonal honeycomb lattice of sp² carbon atoms", "Silicon compound", "Iron nanotube"),
            1,
            "ग्राफीन कार्बन का 2D अपररूप है जो केवल 1 परमाणु मोटा है। यह स्टील से 200 गुना मजबूत, हीरे से अधिक ऊष्मा चालक, और कमरे के तापमान पर तांबे से लाखों गुना बेहतर विद्युत चालक है।",
            "Graphene is a single atomic monolayer of sp² hybridized carbon atoms packed in a honeycomb crystal. It possesses phenomenal mechanical strength (130 GPa) and electron mobility (>200,000 cm²/V·s).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q13", "sci_3",
            "कार्बन नैनोट्यूब (Carbon Nanotubes - CNT) का मुख्य संरचनात्मक रूप क्या है?",
            "Carbon Nanotubes (CNTs), discovered by Sumio Iijima in 1991, are structurally:",
            listOf("ग्रेफाइट के गोले", "रोल की हुई बेलनाकार ग्राफीन शीटें (Rolled cylindrical sheets of graphene with single or multi-walls)", "हीरे के क्रिस्टल", "फुलरीन की गेंदें"),
            listOf("Graphite spheres", "Seamless cylindrical rolled tubes of graphene sheets (SWCNTs and MWCNTs)", "Diamond crystals", "Fullerene balls"),
            1,
            "कार्बन नैनोट्यूब्स (CNTs) ग्राफीन की चादर को नैनो-आकार के खोखले बेलन के रूप में मोड़कर बनती हैं। इनका तन्य सामर्थ्य अत्यधिक उच्च होता है और ये अति-हल्की बुलेटप्रूफ सामग्री व नैनो-इलेक्ट्रॉनिक्स में प्रयुक्त होती हैं।",
            "Carbon Nanotubes (Single-walled and Multi-walled) are seamless cylindrical tubules of rolled graphene offering extreme tensile strength, ballistic electron transport, and high thermal conductivity.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m7_q14", "sci_3",
            "बकमिनिस्टरफुलरीन (Fullerene / Buckyball - C₆₀) की संरचना किसके समान होती है?",
            "Buckminsterfullerene (C₆₀), discovered by Kroto, Smalley, and Curl (Nobel 1996), has a cage structure resembling:",
            listOf("षट्कोणीय प्रिज्म", "फुटबॉल / सॉकर बॉल (Truncated Icosahedron: 20 Hexagons & 12 Pentagons)", "पिरामिड", "घनाकार जालक"),
            listOf("Hexagonal prism", "A Hollow Soccer Ball (Truncated Icosahedron comprising 20 Hexagons and 12 Pentagons)", "Pyramid", "Cubic lattice"),
            1,
            "C₆₀ में 60 कार्बन परमाणु एक खोखले गोले (फुटबॉल) के रूप में जुड़े होते हैं जिसमें 20 षट्भुज (Hexagons) और 12 पंचभुज (Pentagons) फलक होते हैं। अमेरिकी वास्तुकार बकमिनिस्टर फुलर के जियोडेसिक डोम के नाम पर इसका नाम रखा गया।",
            "Buckminsterfullerene (C₆₀) forms a truncated icosahedral cage with 60 vertices consisting of 20 hexagonal and 12 pentagonal rings, geometrically identical to a regulation soccer ball.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m7_q15", "sci_3",
            "नासा का 'आर्टेमिस कार्यक्रम' (Artemis Program) का प्राथमिक उद्देश्य क्या है?",
            "What is the core mission objective of NASA's multinational Artemis Program?",
            listOf("सूर्य के नजदीक जाना", "मानवों (पहली महिला और पहले गैर-श्वेत अंतरिक्ष यात्री) को चंद्रमा के दक्षिणी ध्रुव पर पुनः उतारना और स्थायी चंद्र आधार स्थापित करना", "शुक्र ग्रह पर रोवर उतारना", "बृहस्पति के उपग्रहों का खनन"),
            listOf("Sun probe", "Landing humans (first woman and first person of color) on the Lunar South Pole and establishing sustainable Artemis Base Camp", "Venus rover", "Jupiter mining"),
            1,
            "आर्टेमिस कार्यक्रम का लक्ष्य 1972 (अपोलो-17) के बाद पहली बार अंतरिक्ष यात्रियों को चंद्रमा पर भेजना, चंद्र कक्षा में 'गेटवे' स्पेस स्टेशन स्थापित करना और भविष्य के मंगल मानव मिशन की तैयारी करना है।",
            "The Artemis campaign aims to land astronauts near the Lunar South Pole, build the lunar orbital Lunar Gateway station, and establish sustainable surface infrastructure as a stepping stone to crewed Mars missions.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 8 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m8_q1", "sci_3",
            "विद्युत ऊर्जा की व्यावसायिक इकाई '1 किलोवाट घंटा' (1 Unit) से 100 वाट का बल्ब कितने घंटे तक जलाया जा सकता है?",
            "With 1 kilowatt-hour (1 kWh = 1 commercial electricity unit), a 100-Watt incandescent bulb can operate continuously for how many hours?",
            listOf("1 घंटा", "10 घंटे (10 Hours)", "100 घंटे", "24 घंटे"),
            listOf("1 hour", "10 Hours (Time = Energy / Power = 1000 Wh / 100 W)", "100 hours", "24 hours"),
            1,
            "समय = ऊर्जा / शक्ति = 1 kWh / 100 W = 1000 Wh / 100 W = 10 घंटे।",
            "Operating time = Total Energy (1000 Watt-hours) / Load Power (100 Watts) = 10 continuous hours.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m8_q2", "sci_3",
            "तीन प्रतिरोधक R₁ = 2Ω, R₂ = 3Ω, R₃ = 6Ω समानांतर क्रम (Parallel) में जुड़े हैं। इनका तुल्य प्रतिरोध (Equivalent Resistance) क्या होगा?",
            "Three resistors R₁ = 2Ω, R₂ = 3Ω, and R₃ = 6Ω are connected in Parallel. What is their Equivalent Resistance (R_eq)?",
            listOf("11 Ω", "1 Ω (1/R = 1/2 + 1/3 + 1/6 = 6/6 = 1)", "2 Ω", "0.5 Ω"),
            listOf("11 Ω", "1 Ω (1/R = 1/2 + 1/3 + 1/6 = 1)", "2 Ω", "0.5 Ω"),
            1,
            "समानांतर क्रम में: 1/R_eq = 1/2 + 1/3 + 1/6 = (3 + 2 + 1) / 6 = 6/6 = 1 Ω। तुल्य प्रतिरोध सबसे छोटे प्रतिरोध (2Ω) से भी कम (1Ω) होता है।",
            "In parallel: 1/R_eq = 1/2 + 1/3 + 1/6 = (3+2+1)/6 = 6/6 = 1 Ω⁻¹, yielding R_eq = 1 Ω.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m8_q3", "sci_3",
            "जब एक ही पदार्थ और लंबाई के दो तारों में से एक का व्यास दोगुना हो, तो मोटे तार का प्रतिरोध पतले तार के प्रतिरोध का कितना होगा?",
            "For two wires of the same material and length where wire B has twice the diameter of wire A (d_B = 2 d_A), the resistance of wire B is:",
            listOf("दोगुना", "आधा", "एक-चौथाई (1/4th: R ∝ 1/A ∝ 1/r²)", "समान"),
            listOf("Double", "Half", "One-fourth (1/4th: R ∝ 1/r²)", "Same"),
            2,
            "प्रतिरोध R = ρ L / A = ρ L / (π r²)। त्रिज्या/व्यास 2 गुना होने पर अनुप्रस्थ काट क्षेत्रफल A 4 गुना (2² = 4) हो जाता है, अतः प्रतिरोध घटकर 1/4 रह जाएगा।",
            "Resistance is inversely proportional to cross-sectional area (R ∝ 1/d²). Doubling diameter increases area by 4×, reducing electrical resistance to 1/4th.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m8_q4", "sci_3",
            "विद्युत लेपन (Electroplating) और बैटरियों के आवेशन में माइकल फैराडे के किस नियम का उपयोग होता है?",
            "Industrial Electroplating and chemical battery electrolysis are governed by:",
            listOf("फैराडे के विद्युत अपघटन के नियम (Faraday's Laws of Electrolysis: m = Z·I·t)", "ओम का नियम", "एम्पीयर का नियम", "बायो-सावर्ट नियम"),
            listOf("Faraday's Laws of Electrolysis (m = Z·Q = Z·I·t)", "Ohm's Law", "Ampere's Law", "Biot-Savart Law"),
            0,
            "फैराडे के प्रथम नियमानुसार इलेक्ट्रोड पर मुक्त पदार्थ का द्रव्यमान (m) प्रवाहित विद्युत आवेश (Q = It) के समानुपाती होता है: m = Z·I·t, जहाँ Z विद्युत रासायनिक तुल्यांक (ECE) है।",
            "Faraday's First Law of Electrolysis states that chemical mass deposited at an electrode is directly proportional to the total electric charge passed (m = z·I·t).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m8_q5", "sci_3",
            "फ्लेमिंग के बाएं हाथ का नियम (Fleming's Left-Hand Rule) किसके लिए प्रयुक्त होता है?",
            "Fleming's Left-Hand Rule is applied in Electric Motors to determine the direction of:",
            listOf("प्रेरित विद्युत धारा की दिशा", "चुंबकीय क्षेत्र में धारावाही चालक पर लगने वाले चुंबकीय बल / गति की दिशा", "चुंबकीय क्षेत्र की दिशा", "विभवांतर"),
            listOf("Direction of Induced Current (Right Hand Rule)", "Direction of Magnetic Force / Motion acting on a current-carrying conductor in a magnetic field", "Direction of Magnetic Field", "Voltage"),
            1,
            "बाएं हाथ के नियम में अंगूठा बल/गति (Motion), तर्जनी चुंबकीय क्षेत्र (Field), और मध्यमा विद्युत धारा (Current) की दिशा दर्शाती है (याद रखने की ट्रिक: Father, Mother, Child = Force, Magnetic Field, Current)।",
            "Fleming's Left-Hand Rule aligns Thumb (Force/Thrust), Index finger (Magnetic Field), and Middle finger (Current) mutually at 90° for electric motor action.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m8_q6", "sci_3",
            "चुंबकीय क्षेत्र में गतिमान आवेशित कण पर लगने वाले लोरेंट्ज़ बल (Lorentz Force) का सूत्र क्या है?",
            "What is the mathematical expression for the magnetic Lorentz Force (F) acting on charge 'q' moving with velocity 'v' in magnetic field 'B'?",
            listOf("F = q (v × B) या F = q v B sin θ", "F = q / (v B)", "F = q v² B", "F = q B / v"),
            listOf("F = q (v × B) or F = q·v·B·sin θ", "F = q / (v B)", "F = q v² B", "F = q B / v"),
            0,
            "चुंबकीय बल F = q (v × B) = q v B sin θ होता है। यदि आवेश चुंबकीय क्षेत्र के समानांतर गति करे (θ = 0°), तो बल शून्य होगा। यदि लंबवत गति करे (θ = 90°), तो कण वृत्ताकार पथ पर गति करेगा।",
            "Magnetic force on a moving charge is F = q(v × B) = q v B sin θ. If velocity is perpendicular to B (θ = 90°), the particle undergoes uniform circular cyclotron motion.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m8_q7", "sci_3",
            "साइक्लोट्रॉन (Cyclotron) का उपयोग किसको त्वरित (Accelerate) करने के लिए किया जाता है?",
            "A Cyclotron particle accelerator is specifically used to accelerate which particles to high kinetic energies?",
            listOf("उदासीन न्यूट्रॉन", "धनावेशित भारी कणों (जैसे प्रोटॉन, ड्यूट्रॉन, अल्फा कण)", "इलेक्ट्रॉन", "फोटॉन"),
            listOf("Neutral neutrons", "Positively charged heavy ions (Protons, Deuterons, Alpha particles)", "Electrons (Betatron is used)", "Photons"),
            1,
            "1932 में अर्नेस्ट लॉरेंस द्वारा आविष्कृत साइक्लोट्रॉन चुंबकीय और प्रत्यावर्ती विद्युत क्षेत्रों के संयोजन द्वारा भारी धनावेशित आयनों को सर्पिलाकार पथ पर त्वरित करता है।",
            "Ernest Lawrence's Cyclotron accelerates positive nucleons (protons, deuterons) across high-frequency dees inside a static magnetic field for nuclear reactions.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m8_q8", "sci_3",
            "भू-चुंबकत्व (Geomagnetism) में चुंबकीय याम्योत्तर और भौगोलिक याम्योत्तर के बीच के कोण को क्या कहते हैं?",
            "The acute angle between the Magnetic Meridian and the True Geographic Meridian at any location on Earth is called:",
            listOf("नमन कोण (Angle of Dip)", "दिक्पात कोण (Angle of Magnetic Declination - θ)", "चुंबकीय अक्षांश", "ध्रुवीय कोण"),
            listOf("Angle of Dip (Inclination)", "Angle of Magnetic Declination (Variation)", "Magnetic latitude", "Polar angle"),
            1,
            "भौगोलिक उत्तर और चुंबकीय उत्तर एक ही दिशा में नहीं हैं। इन दोनों के बीच का क्षैतिज कोण 'दिक्पात कोण' (Magnetic Declination) कहलाता है। चुंबकीय सुई का क्षैतिज से झुकाव 'नमन कोण' (Angle of Dip) कहलाता है।",
            "Magnetic Declination is the horizontal angle between geographic true north and magnetic north. Angle of Dip (Inclination) is the angle the needle makes with the horizontal plane.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m8_q9", "sci_3",
            "पृथ्वी के चुंबकीय ध्रुवों (Magnetic Poles) पर और चुंबकीय भूमध्य रेखा (Magnetic Equator) पर नमन कोण (Angle of Dip) का मान क्रमशः कितना होता है?",
            "What is the value of the Angle of Dip (Magnetic Inclination) at Earth's Magnetic Poles and Magnetic Equator respectively?",
            listOf("ध्रुवों पर 0°, भूमध्य रेखा पर 90°", "ध्रुवों पर 90° (ऊर्ध्वाधर), भूमध्य रेखा पर 0° (क्षैतिज)", "दोनों पर 45°", "ध्रुवों पर 180°"),
            listOf("0° at poles, 90° at equator", "90° at Magnetic Poles (needle points vertically down), 0° at Magnetic Equator (needle is completely horizontal)", "45° at both", "180° at poles"),
            1,
            "चुंबकीय ध्रुवों पर चुंबकीय क्षेत्र रेखाएं पृथ्वी में लंबवत प्रवेश करती हैं अतः नमन कोण 90° होता है। भूमध्य रेखा पर क्षेत्र रेखाएं धरातल के समानांतर होती हैं अतः नमन कोण 0° होता है।",
            "At magnetic poles, field lines are vertical (Dip = 90°). At the magnetic dip equator, field lines are parallel to the ground surface (Dip = 0°).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m8_q10", "sci_3",
            "प्रतिचुंबकीय पदार्थ (Diamagnetic Materials जैसे तांबा, बिस्मथ, जल) चुंबकीय क्षेत्र में रखे जाने पर क्या व्यवहार दर्शाते हैं?",
            "When placed in an external magnetic field, Diamagnetic substances (Bismuth, Copper, Water, Gold):",
            listOf("तीव्रता से आकर्षित होते हैं", "दुर्बल रूप से प्रतिकर्षित (Weakly Repelled) होते हैं और तीव्र से मंद क्षेत्र की ओर गति करते हैं", "अपरिवर्तित रहते हैं", "स्थायी चुंबक बन जाते हैं"),
            listOf("Intensely attracted", "Are weakly repelled and migrate from stronger to weaker field regions (Susceptibility χ is small and negative)", "Unaffected", "Become permanent magnets"),
            1,
            "प्रतिचुंबकीय पदार्थों में सभी इलेक्ट्रॉन युग्मित होते हैं। बाह्य चुंबकीय क्षेत्र लगाने पर लेंज के नियमानुसार विपरीत दिशा में प्रेरित द्विध्रुव आघूर्ण बनता है जिससे ये दुर्बल प्रतिकर्षण दर्शाते हैं (χ < 0)।",
            "Diamagnetic materials have paired electrons; applied magnetic fields induce an opposing internal magnetic moment (Lenz's rule), causing weak repulsion with negative magnetic susceptibility.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m8_q11", "sci_3",
            "ऑक्सीजन गैस (O₂) और एल्युमीनियम किस प्रकार के चुंबकीय पदार्थ हैं?",
            "Liquid Oxygen and Aluminium metal belong to which magnetic classification?",
            listOf("लौह-चुंबकीय", "अनुचुंबकीय (Paramagnetic Materials, χ > 0)", "प्रतिचुंबकीय", "अचुंबकीय"),
            listOf("Ferromagnetic", "Paramagnetic (Weakly attracted to magnetic fields with positive susceptibility)", "Diamagnetic", "Non-magnetic"),
            1,
            "अनुचुंबकीय पदार्थों (जैसे O₂, Al, Pt, Cr, Na) में अयुग्मित इलेक्ट्रॉन होते हैं। ये बाह्य चुंबकीय क्षेत्र की दिशा में दुर्बल रूप से आकर्षित होते हैं और दुर्बल से तीव्र क्षेत्र की ओर जाते हैं।",
            "Paramagnetic substances possess permanent net atomic dipole moments from unpaired electrons, weakly aligning with external magnetic fields (positive susceptibility χ > 0).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m8_q12", "sci_3",
            "भंवर धाराएं (Eddy Currents / Foucault Currents) क्या हैं और इनका उपयोग कहाँ किया जाता है?",
            "Eddy Currents induced in bulk metallic conductors exposed to changing magnetic flux are utilized beneficially in:",
            listOf("केवल ऊर्जा ह्रास में", "इलेक्ट्रिक ट्रेनों के मैग्नेटिक ब्रेक और इंडक्शन फर्नेस में (Magnetic Braking and Induction Heating)", "विद्युत बल्ब में", "सोलर पैनल में"),
            listOf("Only heat wastage", "Magnetic Brakes in high-speed trains, Induction Furnaces, and Dead-beat Galvanometers", "Incandescent bulbs", "Solar panels"),
            1,
            "1855 में फूको द्वारा खोजी गई भंवर धाराएं धातु के पूरे आयतन में चक्करदार प्रेरित धाराएं होती हैं। इनका उपयोग बुलेट ट्रेनों में घर्षण रहित इलेक्ट्रोमैग्नेटिक ब्रेक लगाने और इंडक्शन चूल्हे में धातु पिघलाने में होता है।",
            "Eddy currents (Foucault currents) circulate in bulk conductors during flux changes, used constructively in deadbeat damping, electromagnetic braking, and Induction Cooktops.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m8_q13", "sci_3",
            "ट्रांसफार्मर के कोर में भंवर धाराओं (Eddy Currents) के कारण होने वाले ऊर्जा ह्रास को कम करने के लिए कोर को कैसा बनाया जाता है?",
            "To minimize Eddy Current energy losses (I²R heating) in Transformer iron cores, the core is constructed as:",
            listOf("लोहे का एक ठोस भारी ब्लॉक", "वार्निश से विद्युतरोधी पतली-पतली पट्टियों का पटलित कोर (Laminated Core of Thin Insulated Silicon Steel Sheets)", "प्लास्टिक का कोर", "खोखला कोर"),
            listOf("Solid heavy iron block", "Laminated Core composed of thin insulated Silicon Steel sheets (Laminations)", "Plastic core", "Hollow core"),
            1,
            "कोर को पतली-पतली सिलिकॉन स्टील की पट्टियों (पटलित लेमिनेशन) में काटकर वार्निश से अलग किया जाता है, जिससे भंवर धाराओं का बंद लूप छोटा हो जाता है और प्रतिरोध बढ़कर भंवर धारा ह्रास न्यूनतम हो जाता है।",
            "Transformer cores use thin silicon-steel laminated sheets insulated with varnish, breaking continuous eddy current loops to minimize core losses.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m8_q14", "sci_3",
            "चौक कुंडली (Choke Coil), जो ट्यूबलाइट में प्रयुक्त होती है, का मुख्य कार्य बिना ऊर्जा हानि के धारा को नियंत्रित करना है। इसकी क्या विशेषता होती है?",
            "A Choke Coil used in AC circuits (like fluorescent tube fixtures) to limit current with minimal power dissipation possesses:",
            listOf("उच्च प्रतिरोध और निम्न प्रेरकत्व", "उच्च स्वप्रेरकत्व और नगण्य प्रतिरोध (High Self-Inductance L and Negligible Resistance R)", "शून्य प्रेरकत्व", "उच्च धारिता"),
            listOf("High resistance and low inductance", "High Self-Inductance (L) and Negligible Electrical Resistance (R ≈ 0)", "Zero inductance", "High capacitance"),
            1,
            "चौक कुंडली में शक्ति गुणांक cos φ = R/Z ≈ 0 होता है, जिससे औसत शक्ति व्यय P = V_rms · I_rms · cos φ ≈ 0 (शून्य वाट) होता है और बिना ऊष्मा हानि के AC धारा नियंत्रित हो जाती है।",
            "A choke coil exhibits high inductive reactance (X_L = ωL) with near-zero ohmic resistance (R ≈ 0), resulting in near-zero average power loss (cos φ ≈ 0, Wattless current).",
            "Hard"
        ),
        makeScienceQ(
            "sci_3_m8_q15", "sci_3",
            "वाटहीन धारा (Wattless Current) प्रत्यावर्ती परिपथ में कब प्रवाहित होती है?",
            "Wattless Current (zero average electrical power consumption: P_avg = 0) flows in an AC circuit containing:",
            listOf("केवल शुद्ध प्रतिरोधक (Pure Resistor)", "केवल शुद्ध प्रेरकत्व (Pure Inductor) या शुद्ध संधारित्र (Pure Capacitor)", "प्रतिरोधक और बैटरी", "केवल डीसी परिपथ"),
            listOf("Pure Resistor", "Pure Ideal Inductor (L) or Pure Capacitor (C) where phase angle φ = 90°", "Resistor and Battery", "DC circuit only"),
            1,
            "शुद्ध L या शुद्ध C परिपथ में धारा और वोल्टेज के बीच 90° का कलान्तर होता है। शक्ति P = V I cos 90° = 0 होने से परिपथ में बहने वाली धारा को 'वाटहीन धारा' कहते हैं।",
            "In purely inductive or capacitive AC circuits, voltage and current are 90° out of phase (φ = π/2), yielding zero average real power dissipation (P = V·I·cos(90°) = 0).",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 9 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m9_q1", "sci_3",
            "परमाणु के बोहर मॉडल (Bohr's Atomic Model) के अनुसार इलेक्ट्रॉन केवल उन्हीं कक्षाओं में चक्कर लगाते हैं जिनमें उनका कोणीय संवेग (L) किसका पूर्ण गुणज होता है?",
            "According to Bohr's Quantum Atomic Model (1913), stable electron orbital angular momentum 'L' is quantized as:",
            listOf("L = n (h / 2π)", "L = n (2π / h)", "L = n h", "L = n / h"),
            listOf("L = n (h / 2π) or L = n ℏ (where n = 1, 2, 3...)", "L = n (2π / h)", "L = n h", "L = n / h"),
            0,
            "नील्स बोर के द्वितीय अभिगृहीत के अनुसार कोणीय संवेग L = mvr = n·h/(2π) होता है। इन गैर-विकिरक स्थिर कक्षाओं (Stationary orbits) में घूमते समय इलेक्ट्रॉन ऊर्जा उत्सर्जित नहीं करते।",
            "Bohr's quantization postulate restricts orbiting electrons to non-radiating discrete states where angular momentum mvr = n·h/(2π) = nℏ, resolving atomic collapse.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m9_q2", "sci_3",
            "हाइड्रोजन परमाणु के उत्सर्जन स्पेक्ट्रम में पराबैंगनी क्षेत्र (Ultraviolet Region) में आने वाली स्पेक्ट्रमी श्रेणी कौन-सी है?",
            "In the hydrogen atomic emission spectrum, which spectral line series falls in the Ultraviolet (UV) region when electron transitions down to ground state n₁ = 1?",
            listOf("बामर श्रेणी (Balmer Series)", "लाइमन श्रेणी (Lyman Series)", "पाशन श्रेणी (Paschen Series)", "ब्रैकेट श्रेणी (Brackett Series)"),
            listOf("Balmer Series (Visible)", "Lyman Series (Ultraviolet - UV)", "Paschen Series (Infrared)", "Brackett Series (Far-IR)"),
            1,
            "लाइमन श्रेणी (n₁ = 1, n₂ = 2, 3..) पराबैंगनी क्षेत्र में होती है। बामर श्रेणी (n₁ = 2) दृश्य प्रकाश क्षेत्र में होती है। पाशन, ब्रैकेट और फुंड श्रेणियां अवरक्त (Infrared) क्षेत्र में होती हैं।",
            "The Lyman series (transitions to n = 1) lies entirely in the Ultraviolet spectrum. The Balmer series (transitions to n = 2) produces visible spectral lines (H-alpha, etc.).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m9_q3", "sci_3",
            "प्रकाश विद्युत प्रभाव में धातु की सतह से इलेक्ट्रॉन उत्सर्जित करने के लिए आवश्यक न्यूनतम ऊर्जा को क्या कहते हैं?",
            "The minimum photon energy required to liberate a bound conduction electron from a metallic surface is termed:",
            listOf("आयनन ऊर्जा", "कार्य फलन (Work Function - Φ₀ = h ν₀)", "बंधन ऊर्जा", "गतिज ऊर्जा"),
            listOf("Ionization potential", "Work Function (Φ₀ = h·ν₀)", "Binding energy", "Kinetic threshold"),
            1,
            "कार्य फलन (Work Function Φ₀) धातु का अभिलाक्षणिक गुण है। सीजियम (Cs) का कार्य फलन सबसे कम (~2.14 eV) होता है, जिससे यह प्रकाश विद्युत सेलों के लिए सर्वोत्तम धातु है।",
            "The Work Function (Φ = hν₀) is the threshold energy barrier to eject an electron. Caesium has the lowest work function (~2.14 eV), making it ideal for photocathodes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m9_q4", "sci_3",
            "क्वांटम भौतिकी के जनक किन्हें माना जाता है जिन्होंने 1900 में ब्लैकबॉडी विकिरण को समझाने के लिए 'क्वांटम परिकल्पना' प्रस्तुत की थी?",
            "Who is celebrated as the Father of Quantum Theory for proposing that energy is emitted/absorbed in discrete packets called Quanta (E = hν) in 1900?",
            listOf("अल्बर्ट आइंस्टीन", "मैक्स प्लांक (Max Planck)", "नील्स बोर", "लुई डी ब्रोग्ली"),
            listOf("Albert Einstein", "Max Planck", "Niels Bohr", "Louis de Broglie"),
            1,
            "जर्मन भौतिक विज्ञानी मैक्स प्लांक ने 1900 में प्लांक का विकिरण नियम प्रतिपादित किया और बताया कि विकिरण ऊर्जा असतत पैकेटों (क्वांटा) में होती है: E = hν (जहाँ h प्लांक नियतांक = 6.626 × 10⁻³⁴ J·s है)।",
            "Max Planck resolved the ultraviolet catastrophe in blackbody radiation by introducing energy quantization (E = nhν), initiating the Quantum Revolution and winning the 1918 Nobel Prize.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m9_q5", "sci_3",
            "रेडियोधर्मी नाभिक से बीटा-माइनस (β⁻) क्षय होने पर परमाणु क्रमांक (Z) और द्रव्यमान संख्या (A) में क्या परिवर्तन होता है?",
            "During Beta-Minus (β⁻) radioactive decay of a nucleus, what happens to atomic number (Z) and mass number (A)?",
            listOf("Z 1 घटता है, A समान रहता है", "Z 1 बढ़ जाता है (Z+1), A अपरिवर्तित रहता है (A)", "Z 2 घटता है, A 4 घटता है", "दोनों समान रहते हैं"),
            listOf("Z decreases by 1, A unchanged", "Z increases by 1 (Z → Z+1), Mass number A remains unchanged (n → p + e⁻ + ν̄_e)", "Z drops by 2, A drops by 4 (Alpha decay)", "Both unchanged"),
            1,
            "β⁻ क्षय में नाभिक के अंदर एक न्यूट्रॉन प्रोटॉन में बदल जाता है (n → p + e⁻ + एंटीन्यूट्रिनो)। अतः प्रोटॉन संख्या (परमाणु क्रमांक Z) 1 बढ़ जाती है जबकि कुल न्यूक्लिऑन संख्या A वही रहती है।",
            "In β⁻ decay, a weak interaction transforms a down quark into an up quark (n → p + e⁻ + ν̄_e), increasing atomic number Z by 1 while keeping mass number A constant (Isobaric transition).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m9_q6", "sci_3",
            "अल्फा (α) क्षय में मूल नाभिक से क्या उत्सर्जित होता है?",
            "In an Alpha (α) decay, the parent nucleus expels which particle?",
            listOf("एक इलेक्ट्रॉन", "हीलियम का द्वि-आयनित नाभिक (Helium-4 Nucleus: ₂He⁴ / 2 प्रोटॉन + 2 न्यूट्रॉन)", "एक प्रोटॉन", "एक न्यूट्रॉन"),
            listOf("An electron", "A Helium-4 Nucleus (₂He⁴: 2 Protons and 2 Neutrons)", "A Proton", "A Neutron"),
            1,
            "अल्फा कण वास्तव में हीलियम का नाभिक (₂He⁴) होता है। इसके उत्सर्जन से जनक तत्व का परमाणु क्रमांक 2 घट जाता है (Z-2) और द्रव्यमान संख्या 4 घट जाती है (A-4)।",
            "Alpha decay releases a Helium-4 nucleus (₂He⁴). The daughter nucleus has atomic number reduced by 2 (Z-2) and mass number reduced by 4 (A-4).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m9_q7", "sci_3",
            "रेडियोधर्मी तत्व रेडियम (Radium) और पोलोनियम (Polonium) की खोज किसने की थी?",
            "Who discovered the highly radioactive elements Polonium and Radium in 1898 from pitchblende ore?",
            listOf("हेनरी बेकेरल", "मैरी क्यूरी और पियरे क्यूरी (Marie Curie and Pierre Curie)", "अर्नेस्ट रदरफोर्ड", "ओटो हान"),
            listOf("Henri Becquerel", "Marie Curie and Pierre Curie", "Ernest Rutherford", "Otto Hahn"),
            1,
            "मैरी क्यूरी और उनके पति पियरे क्यूरी ने यूरेनियम अयस्क पिचब्लेंड से पोलोनियम (मैरी के गृह देश पोलैंड के नाम पर) और रेडियम को पृथक किया। मैरी क्यूरी भौतिकी (1903) और रसायन (1911) दोनों में नोबेल जीतने वाली एकमात्र महिला हैं।",
            "Marie and Pierre Curie isolated Polonium and Radium from uraninite. Marie Curie remains the only person to win Nobel Prizes in two distinct scientific fields (Physics 1903, Chemistry 1911).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m9_q8", "sci_3",
            "नाभिकीय विखंडन (Nuclear Fission) की खोज 1938 में किन जर्मन वैज्ञानिकों ने की थी?",
            "Who discovered Nuclear Fission of Uranium in December 1938?",
            listOf("एनरिको फर्मी", "ओटो हान और फ्रिट्ज़ स्ट्रैसमैन (Otto Hahn and Fritz Strassmann - interpreted by Lise Meitner)", "अल्बर्ट आइंस्टीन", "रॉबर्ट ओपेनहाइमर"),
            listOf("Enrico Fermi", "Otto Hahn and Fritz Strassmann (with Lise Meitner & Otto Frisch)", "Albert Einstein", "J. Robert Oppenheimer"),
            1,
            "ओटो हान और फ्रिट्ज़ स्ट्रैसमैन ने जब यूरेनियम पर न्यूट्रॉनों की बौछार की, तो उन्हें बेरियम और क्रिप्टन के हल्के तत्व मिले। लीज माइटनर और ओटो फ्रिश ने सैद्धांतिक रूप से सिद्ध किया कि नाभिक दो भागों में टूट गया है।",
            "Otto Hahn and Fritz Strassmann experimentally identified barium isotopes from neutron-irradiated uranium, while Lise Meitner and Otto Frisch provided the theoretical physical explanation of nuclear fission.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m9_q9", "sci_3",
            "विश्व का पहला मानव निर्मित परमाणु रिएक्टर 'शिकागो पाइल-1' (Chicago Pile-1) 1942 में किसके नेतृत्व में बनाया गया था?",
            "Who built and operated the world's first artificial self-sustaining nuclear chain reactor, Chicago Pile-1, in December 1942?",
            listOf("रॉबर्ट ओपेनहाइमर", "एनरिको फर्मी (Enrico Fermi)", "नील्स बोर", "एडवर्ड टेलर"),
            listOf("J. Robert Oppenheimer", "Enrico Fermi (Father of the Nuclear Age)", "Niels Bohr", "Edward Teller"),
            1,
            "इतालवी-अमेरिकी भौतिक विज्ञानी एनरिको फर्मी ने 2 दिसंबर 1942 को शिकागो विश्वविद्यालय में ग्रेफाइट और प्राकृतिक यूरेनियम से बने दुनिया के पहले परमाणु रिएक्टर में नियंत्रित विखंडन श्रृंखला अभिक्रिया शुरू की।",
            "Enrico Fermi directed the Chicago Pile-1 team at the University of Chicago, achieving the world's first controlled, self-sustaining nuclear chain reaction on 2 December 1942.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m9_q10", "sci_3",
            "मैनहट्टन प्रोजेक्ट (Manhattan Project) के वैज्ञानिक निदेशक कौन थे जिन्हें 'परमाणु बम का जनक' (Father of the Atomic Bomb) कहा जाता है?",
            "Who served as the theoretical director of the Los Alamos Laboratory during the Manhattan Project, known as the 'Father of the Atomic Bomb'?",
            listOf("अल्बर्ट आइंस्टीन", "जे. रॉबर्ट ओपेनहाइमर (J. Robert Oppenheimer)", "रिचर्ड फेनमैन", "अर्नेस्ट लॉरेंस"),
            listOf("Albert Einstein", "J. Robert Oppenheimer", "Richard Feynman", "Ernest Lawrence"),
            1,
            "जे. रॉबर्ट ओपेनहाइमर ने द्वितीय विश्व युद्ध के दौरान लॉस अलामोस में 'मैनहट्टन प्रोजेक्ट' का नेतृत्व किया, जिसने 16 जुलाई 1945 को 'ट्रिनिटी' नाम से पहला परमाणु परीक्षण किया और 'लिटिल बॉय' व 'फैट मैन' बम विकसित किए।",
            "J. Robert Oppenheimer led the Manhattan Project's Los Alamos scientific team that developed the first nuclear weapons, detonated at the Trinity Test in July 1945.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m9_q11", "sci_3",
            "6 अगस्त और 9 अगस्त 1945 को क्रमशः हिरोशिमा और नागासाकी पर गिराए गए परमाणु बमों में कौन-से विखंडनीय ईंधन प्रयुक्त किए गए थे?",
            "What fissile isotopes fueled the 'Little Boy' bomb dropped on Hiroshima and the 'Fat Man' bomb on Nagasaki in August 1945?",
            listOf("दोनों में यूरेनियम-235", "हिरोशिमा: यूरेनियम-235 (U-235), नागासाकी: प्लूटोनियम-239 (Pu-239)", "दोनों में प्लूटोनियम-239", "हिरोशिमा: थोरियम, नागासाकी: यूरेनियम"),
            listOf("Both U-235", "Hiroshima: Uranium-235 (Gun-type 'Little Boy'); Nagasaki: Plutonium-239 (Implosion-type 'Fat Man')", "Both Pu-239", "Hiroshima: Thorium; Nagasaki: Uranium"),
            1,
            "हिरोशिमा पर गिराया गया बम 'लिटिल बॉय' यूरेनियम-235 गन-प्रकार का था, जबकि नागासाकी पर गिराया गया बम 'फैट मैन' प्लूटोनियम-239 अंतर्मुखी (Implosion) प्रकार का बम था।",
            "Little Boy (Hiroshima, 6 Aug 1945) utilized gun-assembled highly enriched Uranium-235. Fat Man (Nagasaki, 9 Aug 1945) used an implosion-triggered Plutonium-239 core.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m9_q12", "sci_3",
            "रेडियोधर्मी समस्थानिक सोडियम-24 (Na-24) का उपयोग चिकित्सा में किसके लिए किया जाता है?",
            "Radioactive isotope Sodium-24 (Na-24) is standardly used in medicine to detect and track:",
            listOf("कैंसर ट्यूमर", "रक्त परिसंचरण में रुकावट और रक्त के थक्कों (Blood Clots / Circulation blockages)", "थायरॉयड ग्रंथि विकार", "हड्डियों का फ्रैक्चर"),
            listOf("Cancer tumors", "Blood Circulation disorders and vascular thrombosis/clots", "Thyroid dysfunctions", "Bone fractures"),
            1,
            "सोडियम-24 को सोडियम क्लोराइड (नमक) के घोल के रूप में रक्तप्रवाह में इंजेक्ट किया जाता है। इसकी 15 घंटे की अर्धायु रक्त प्रवाह की गति मापने और रक्त वाहिकाओं में ब्लॉकेज/थक्के खोजने में उपयोगी है।",
            "Sodium-24 (half-life 15 hours) injected as isotonic saline serves as an ideal radiotracer to diagnose blood circulation constrictions and arterial thrombosis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m9_q13", "sci_3",
            "कृषि और वनस्पति विज्ञान में पौधों द्वारा उर्वरकों (फास्फोरस) के अवशोषण और प्रकाश संश्लेषण की गति का अध्ययन करने के लिए कौन-सा रेडियोआइसोटोप प्रयुक्त होता है?",
            "Which radioisotope is standardly applied in agricultural plant physiology to trace uptake of phosphatic fertilizers?",
            listOf("कार्बन-14", "फास्फोरस-32 (Phosphorus-32 / P-32)", "कोबाल्ट-60", "आयोडीन-131"),
            listOf("Carbon-14", "Phosphorus-32 (P-32, Beta emitter)", "Cobalt-60", "Iodine-131"),
            1,
            "फास्फोरस-32 (P-32) की अर्धायु 14.3 दिन होती है और यह बीटा कण उत्सर्जित करता है। इसका उपयोग मिट्टी से पौधों की जड़ों द्वारा फॉस्फेट उर्वरक सोखने की प्रक्रिया को ट्रैक करने में होता है।",
            "Phosphorus-32 is a pure beta emitter used as an agricultural radiotracer to map phosphorus assimilation rates, fertilizer efficiency, and nucleic acid synthesis in crops.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m9_q14", "sci_3",
            "पृथ्वी की आयु और अति प्राचीन चट्टानों/उल्कापिंडों (अरबों वर्ष पुराने) की आयु निर्धारित करने के लिए किस रेडियोधर्मी डेटिंग विधि का उपयोग किया जाता है?",
            "The age of the Earth (~4.54 billion years) and ancient primordial geological rocks is determined using which radiometric dating system?",
            listOf("कार्बन डेटिंग (C-14)", "यूरेनियम-लेड डेटिंग (Uranium-Lead / U-Pb & Potassium-Argon Dating)", "सोडियम डेटिंग", "नाइट्रोजन डेटिंग"),
            listOf("Carbon-14 dating", "Uranium-Lead (U-Pb) and Potassium-Argon (K-Ar) Radiometric Dating", "Sodium dating", "Nitrogen dating"),
            1,
            "यूरेनियम-238 की अर्धायु 4.47 अरब वर्ष और U-235 की 70.4 करोड़ वर्ष होती है, जो स्थिर लेड (Pb-206 और Pb-207) में बदलते हैं। ज़िरकॉन क्रिस्टल में U-Pb अनुपात से पृथ्वी की आयु 4.54 अरब वर्ष आंकी गई।",
            "Uranium-Lead radiometric dating (measuring radioactive decay of U-238 to Pb-206 and U-235 to Pb-207 in zircon crystals) dates minerals up to 4.5 billion years old.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m9_q15", "sci_3",
            "गीगर-मुलर काउंटर (Geiger-Muller Counter / GM Counter) का उपयोग किसका पता लगाने और मापने के लिए किया जाता है?",
            "A Geiger-Müller Counter (GM Tube) is a handheld radiation detection instrument designed to measure:",
            listOf("ध्वनि प्रदूषण", "आयनकारी रेडियोधर्मी विकिरण (Alpha, Beta particles and Gamma rays)", "वायुदाब", "चुंबकीय क्षेत्र"),
            listOf("Acoustic noise", "Ionizing Radioactive Radiation (Alpha, Beta particles and Gamma rays)", "Atmospheric pressure", "Magnetic flux"),
            1,
            "जीएम काउंटर में आर्गन गैस से भरी नली होती है। जब कोई आयनकारी विकिरण नली में प्रवेश करता है, तो गैस आयनित होकर विद्युत स्पंद उत्पन्न करती है जिसे काउंटर गिनता है।",
            "The Geiger-Müller counter detects ionizing radiation (alpha, beta, gamma) by Townsend avalanche gas-ionization discharges between coaxial anode-cathode electrodes.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 10 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m10_q1", "sci_3",
            "अंतरिक्ष में स्थापित 'अंतर्राष्ट्रीय अंतरिक्ष स्टेशन' (ISS - International Space Station) पृथ्वी की सतह से लगभग कितनी ऊंचाई पर चक्कर लगाता है?",
            "At what orbital altitude and speed does the International Space Station (ISS) orbit Earth in Low Earth Orbit?",
            listOf("100 किमी, 1,000 km/h", "लगभग 400 किमी (400-420 km), चाल ~27,600 km/h (प्रति 90 मिनट में 1 चक्कर)", "36,000 किमी, 24 घंटे", "10,000 किमी"),
            listOf("100 km, 1,000 km/h", "Approximately 400-420 km altitude, speed ~27,600 km/h (~7.66 km/s, orbiting Earth every 90 minutes)", "36,000 km, 24 hours", "10,000 km"),
            1,
            "ISS पृथ्वी की निचली कक्षा (LEO) में लगभग 400 किमी की ऊंचाई पर 7.66 किमी/सेकंड (27,600 किमी/घंटा) की तीव्र गति से घूमता है और 24 घंटे में पृथ्वी के लगभग 16 चक्कर पूरे करता है।",
            "The ISS orbits in Low Earth Orbit at ~400 km altitude at 7.66 km/s, circling the planet every ~92 minutes (completing 15.5 orbits per Earth day).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q2", "sci_3",
            "सूर्य के कोरोना और सौर तूफानों (Solar Flares/CME) का अध्ययन करने के लिए सूर्य के सबसे निकट जाने वाला नासा का अंतरिक्ष यान कौन-सा है?",
            "Which NASA spacecraft launched in 2018 became the first human-made object to 'touch the Sun' by flying through the outer solar corona?",
            listOf("वॉयजर-1", "पार्कर सोलर प्रोब (Parker Solar Probe)", "न्यू होराइजन्स", "कैसिनी"),
            listOf("Voyager-1", "Parker Solar Probe (approaching within 6.1 million km of solar photosphere)", "New Horizons", "Cassini"),
            1,
            "पार्कर सोलर प्रोब 1400°C की अत्यधिक गर्मी झेलने वाली कार्बन-कंपोजिट शील्ड के साथ सूर्य के कोरोना में 690,000 किमी/घंटा की रिकॉर्ड गति से प्रवेश कर सौर हवा के रहस्यों की खोज कर रहा है।",
            "NASA's Parker Solar Probe uses a reinforced carbon-carbon thermal shield to repeatedly dive through the million-degree solar corona at speeds exceeding 690,000 km/h.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m10_q3", "sci_3",
            "मानव इतिहास में किसी अन्य आकाशीय पिंड (चंद्रमा) पर पहला कदम रखने वाले व्यक्ति कौन थे और यह ऐतिहासिक घटना कब हुई?",
            "Who was the first human to step onto the lunar surface during Apollo 11 on 20 July 1969?",
            listOf("यूरी गागरिन", "नील आर्मस्ट्रांग (Neil Armstrong - 'That's one small step for man, one giant leap for mankind')", "बज़ एल्ड्रिन", "माइकल कोलिन्स"),
            listOf("Yuri Gagarin", "Neil Armstrong (Apollo 11, 20 July 1969)", "Buzz Aldrin", "Michael Collins"),
            1,
            "20 जुलाई 1969 को अमेरिकी अपोलो-11 मिशन के कमांडर नील आर्मस्ट्रांग चंद्रमा के 'सी ऑफ ट्रैंक्विलिटी' में कदम रखने वाले पहले व्यक्ति बने। उनके बाद बज़ एल्ड्रिन उतरे।",
            "Neil Armstrong set foot on the Moon on 20 July 1969 during NASA's Apollo 11 mission, followed 19 minutes later by Lunar Module Pilot Buzz Aldrin.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q4", "sci_3",
            "अंतरिक्ष में जाने वाले विश्व के प्रथम मानव (अंतरिक्ष यात्री) कौन थे?",
            "Who was the first human in history to travel into outer space, orbiting Earth aboard Vostok 1 on 12 April 1961?",
            listOf("नील आर्मस्ट्रांग", "यूरी गागरिन (Yuri Gagarin - USSR)", "एलेक्सी लियोनोव", "जॉन ग्लेन"),
            listOf("Neil Armstrong", "Yuri Gagarin (Soviet Cosmonaut)", "Alexei Leonov", "John Glenn"),
            1,
            "सोवियत कॉस्मोनॉट यूरी गागरिन ने 12 अप्रैल 1961 को 'वोस्तोक-1' अंतरिक्ष यान से 108 मिनट की कक्षीय उड़ान भरी। 12 अप्रैल को 'अंतर्राष्ट्रीय मानव अंतरिक्ष उड़ान दिवस' मनाया जाता है।",
            "Soviet cosmonaut Yuri Gagarin became the first person in space on 12 April 1961, completing a single 108-minute orbit around Earth in his Vostok 3KA capsule.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q5", "sci_3",
            "अंतरिक्ष में जाने वाले प्रथम भारतीय नागरिक कौन थे?",
            "Who was the first Indian citizen in space, flying aboard the Soviet Soyuz T-11 mission on 3 April 1984?",
            listOf("राकेश शर्मा (Wing Commander Rakesh Sharma)", "कल्पना चावला", "सुनीता विलियम्स", "सतीश धवन"),
            listOf("Wing Commander Rakesh Sharma", "Kalpana Chawla", "Sunita Williams", "Satish Dhawan"),
            1,
            "विंग कमांडर राकेश शर्मा 3 अप्रैल 1984 को सोवियत संघ के सोयूज टी-11 से सैल्यूट-7 स्पेस स्टेशन पहुंचे। तत्कालीन प्रधानमंत्री इंदिरा गांधी के सवाल पर उन्होंने कहा था— 'सारे जहाँ से अच्छा हिन्दोस्तां हमारा'।",
            "Wing Commander Rakesh Sharma flew aboard Soyuz T-11 in April 1984, spending 7 days on the Salyut 7 space station and famously describing India from space as 'Saare Jahan Se Achha'.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q6", "sci_3",
            "भारतीय मूल की पहली महिला अंतरिक्ष यात्री कौन थीं जिनका 1 फरवरी 2003 को स्पेस शटल कोलंबिया (STS-107) दुर्घटना में निधन हो गया?",
            "Who was the first Indian-origin woman in space who tragically perished in the Space Shuttle Columbia (STS-107) disaster on 1 February 2003?",
            listOf("सुनीता विलियम्स", "कल्पना चावला (Dr. Kalpana Chawla - Karnal, Haryana)", "सिरिशा बांदला", "अनुराधा टीके"),
            listOf("Sunita Williams", "Dr. Kalpana Chawla (Aeronautical Engineer from Karnal, Haryana)", "Sirisha Bandla", "Anuradha TK"),
            1,
            "करनाल (हरियाणा) में जन्मी डॉ. कल्पना चावला 1997 में STS-87 से अंतरिक्ष जाने वाली पहली भारतीय महिला बनीं। 2003 में उनके दूसरे मिशन (STS-107) के दौरान पृथ्वी पर लौटते समय कोलंबिया शटल दुर्घटनाग्रस्त हो गया।",
            "Dr. Kalpana Chawla was the first woman of Indian descent in space (STS-87 in 1997). She and six crewmates perished when Columbia disintegrated during atmospheric reentry in 2003.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q7", "sci_3",
            "भारतीय अंतरिक्ष अनुसंधान संगठन (ISRO) की स्थापना किस वर्ष हुई थी और इसका मुख्यालय कहाँ है?",
            "In which year was the Indian Space Research Organisation (ISRO) formally established, and where is its central headquarters located?",
            listOf("15 अगस्त 1947, नई दिल्ली", "15 अगस्त 1969, अंतरिक्ष भवन, बेंगलुरु (Bengaluru)", "1975, तिरुवनंतपुरम", "1958, मुंबई"),
            listOf("15 August 1947, New Delhi", "15 August 1969, Antariksh Bhavan, Bengaluru, Karnataka", "1975, Thiruvananthapuram", "1958, Mumbai"),
            1,
            "ISRO की स्थापना 15 अगस्त 1969 को INCOSPAR के स्थान पर डॉ. विक्रम साराभाई के नेतृत्व में की गई थी। इसका मुख्यालय 'अंतरिक्ष भवन', बेंगलुरु (कर्नाटक) में स्थित है।",
            "ISRO was founded on 15 August 1969 under the Department of Space. Its headquarters is situated at Antariksh Bhavan in Bengaluru, Karnataka.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q8", "sci_3",
            "रक्षा अनुसंधान एवं विकास संगठन (DRDO) का मुख्यालय कहाँ है और इसका ध्येय वाक्य क्या है?",
            "Where is the headquarters of DRDO located, and what is its official Sanskrit motto?",
            listOf("मुंबई, 'जय जवान'", "नई दिल्ली, 'बलस्य मूलं विज्ञानम्' (Strength's Origin is in Science)", "बेंगलुरु, 'सत्यमेव जयते'", "हैदराबाद, 'अग्नि विजय'"),
            listOf("Mumbai, 'Jai Jawan'", "New Delhi, 'Balasya Mulam Vijnanam' (Strength's Origin is in Science)", "Bengaluru, 'Satyameva Jayate'", "Hyderabad, 'Agni Vijay'"),
            1,
            "DRDO की स्थापना 1958 में रक्षा मंत्रालय के तहत की गई थी। इसका मुख्यालय DRDO भवन, नई दिल्ली में है और इसका आदर्श वाक्य 'बलस्य मूलं विज्ञानम्' (ज्ञान/विज्ञान ही शक्ति का स्रोत है) है।",
            "Established in 1958, Defence Research and Development Organisation (DRDO) is headquartered in New Delhi with the motto 'Balasya Mulam Vijnanam' (The source of strength is in science).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q9", "sci_3",
            "भारत का 'इंटीग्रेटेड गाइडेड मिसाइल डेवलपमेंट प्रोग्राम' (IGMDP) 1983 में डॉ. एपीजे अब्दुल कलाम के नेतृत्व में शुरू हुआ था। इसके तहत विकसित 'PATNA' पांच मिसाइलें कौन-सी हैं?",
            "Under Dr. A. P. J. Abdul Kalam's leadership, India's IGMDP developed the five core missile systems represented by the acronym PATNA:",
            listOf("Prithvi, Agni, Trishul, Nag, Akash", "Pinaka, Astra, Tejas, Nirbhay, Arjun", "Prahaar, Agni, Torpedo, Nirbhay, Astra", "Prithvi, Akash, Tejas, Nag, Astra"),
            listOf("Prithvi (Surface-to-Surface), Agni (IRBM), Trishul (Short Surface-to-Air), Nag (Anti-Tank), Akash (Medium Surface-to-Air)", "Pinaka, Astra, Tejas, Nirbhay, Arjun", "Prahaar, Agni, Torpedo, Nirbhay, Astra", "Prithvi, Akash, Tejas, Nag, Astra"),
            0,
            "IGMDP के तहत विकसित 5 मुख्य प्रणालियां: P-पृथ्वी (सतह से सतह), A-अग्नि (बैलिस्टिक मिसाइल), T-त्रिशूल (सतह से हवा कम दूरी), N-नाग (एंटी-टैंक मिसाइल), A-आकाश (सतह से हवा मध्यम दूरी)।",
            "The historic IGMDP conceived by Dr. Kalam developed Prithvi, Agni, Trishul, Nag (Fire-and-Forget Anti-Tank), and Akash (Air Defence Missile).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q10", "sci_3",
            "ब्रह्मोस (BrahMos) सुपरसोनिक क्रूज मिसाइल भारत और किस देश का संयुक्त उपक्रम है और इसका नाम किन दो नदियों पर रखा गया है?",
            "The world's fastest Supersonic Cruise Missile 'BrahMos' is a joint venture between India and Russia named after which two rivers?",
            listOf("गंगा और वोल्गा", "ब्रह्मपुत्र (भारत) और मोस्कवा (रूस) (Brahmaputra and Moskva rivers)", "सिंधु और डॉन", "यमुना और नेवा"),
            listOf("Ganga and Volga", "Brahmaputra (India) and Moskva (Russia) rivers", "Indus and Don", "Yamuna and Neva"),
            1,
            "ब्रह्मोस (BrahMos Aerospace - 1998) भारत के DRDO और रूस के NPO Mashinostroyeniya का संयुक्त उपक्रम है। यह मैक 2.8 से 3.0 की गति से दागी जाने वाली विश्व की सबसे तेज 'दागो और भूल जाओ' सुपरसोनिक क्रूज मिसाइल है।",
            "BrahMos is an Indo-Russian joint venture named after the Brahmaputra and Moskva rivers, flying at Mach ~2.8-3.0 with high precision strike range.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q11", "sci_3",
            "भारत का स्वदेशी हल्का लड़ाकू विमान (LCA - Light Combat Aircraft) कौन-सा है जिसे हिंदुस्तान एयरोनॉटिक्स लिमिटेड (HAL) द्वारा निर्मित किया गया है?",
            "What is the name of India's indigenous single-engine, delta-wing supersonic Light Combat Aircraft (LCA) developed by ADA and HAL?",
            listOf("मिग-21", "तेजस (Tejas)", "राफेल", "सुखोई-30 MKI"),
            listOf("MiG-21", "LCA Tejas (Tejas Mk-1 / Mk-1A)", "Rafale", "Sukhoi-30 MKI"),
            1,
            "तेजस 4.5 पीढ़ी का हर मौसम में मार करने वाला सबसे हल्का और सबसे छोटा सुपरसोनिक बहुउद्देशीय लड़ाकू विमान है जिसमें फ्लाई-बाय-वायर और कार्बन कंपोजिट ढांचा है। 'तेजस' नाम पूर्व पीएम अटल बिहारी वाजपेयी ने दिया था।",
            "LCA Tejas is an indigenous single-engine delta-wing 4.5 generation multirole fighter designed by ADA and manufactured by HAL for the Indian Air Force.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q12", "sci_3",
            "भारत का पहला स्वदेशी विमानवाहक पोत (Indigenous Aircraft Carrier - IAC-1) कौन-सा है जिसे 2022 में भारतीय नौसेना में शामिल किया गया?",
            "Which is India's first indigenously designed and built Aircraft Carrier, commissioned into the Indian Navy in September 2022?",
            listOf("आईएनएस विक्रमादित्य", "आईएनएस विक्रांत (INS Vikrant - IAC-1)", "आईएनएस विराट", "आईएनएस अरिहंत"),
            listOf("INS Vikramaditya", "INS Vikrant (IAC-1, built by Cochin Shipyard)", "INS Viraat", "INS Arihant"),
            1,
            "आईएनएस विक्रांत (45,000 टन) को कोचीन शिपयार्ड लिमिटेड (CSL) द्वारा स्वदेशी इस्पात और 76% घरेलू सामग्री से बनाया गया। इसके शामिल होने से भारत विमानवाहक पोत बनाने वाले चुनिंदा 6 देशों के क्लब में शामिल हुआ।",
            "INS Vikrant is India's first home-built aircraft carrier (45,000-tonne displacement), constructed at Cochin Shipyard and commissioned on 2 September 2022.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q13", "sci_3",
            "भारत की पहली स्वदेशी परमाणु ऊर्जा चालित बैलिस्टिक मिसाइल पनडुब्बी (SSBN - Nuclear-powered Submarine) कौन-सी है जो भारत के परमाणु त्रिकोण (Nuclear Triad) को पूरा करती है?",
            "Which is India's first indigenously developed nuclear-powered ballistic missile submarine (SSBN) commissioned in 2016?",
            listOf("आईएनएस सिंधुघोष", "आईएनएस अरिहंत (INS Arihant - SSBN S2)", "आईएनएस कलवरी", "आईएनएस खंडेरी"),
            listOf("INS Sindhuvijay", "INS Arihant (SSBN S2)", "INS Kalvari", "INS Khanderi"),
            1,
            "आईएनएस अरिहंत (6,000 टन) 83 MW के संवर्धित यूरेनियम दाबित जल परमाणु रिएक्टर से चलती है और K-15 तथा K-4 बैलिस्टिक मिसाइलों से लैस है, जिससे भारत की समुद्र से परमाणु जवाबी हमले (Second Strike) की क्षमता सुरक्षित होती है।",
            "INS Arihant is India's lead nuclear-powered ballistic missile submarine, completing the sea-based second-strike leg of India's strategic nuclear triad.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q14", "sci_3",
            "विश्व का पहला उपग्रह 'स्पुतनिक-1' (Sputnik-1) किस देश द्वारा 4 अक्टूबर 1957 को अंतरिक्ष में भेजा गया था जिसने 'अंतरिक्ष युग' की शुरुआत की?",
            "Which nation launched the world's very first artificial orbital satellite, Sputnik-1, on 4 October 1957, inaugurating the Space Age?",
            listOf("यूएसए (नासा)", "सोवियत संघ (USSR / रूस)", "यूके", "जर्मनी"),
            listOf("USA (NASA)", "Soviet Union (USSR)", "UK", "Germany"),
            1,
            "सोवियत संघ ने सर्गेई कोरोलेव के नेतृत्व में आर-7 रॉकेट द्वारा 83.6 किग्रा के 'स्पुतनिक-1' को कक्षा में स्थापित किया, जिसने रेडियो बीप संकेत भेजकर विश्व में अंतरिक्ष युग और अंतरिक्ष दौड़ (Space Race) का सूत्रपात किया।",
            "The Soviet Union launched Sputnik-1 on 4 October 1957 aboard an R-7 Semyorka ICBM, triggering the space race and technological leap forward.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m10_q15", "sci_3",
            "ब्लैक होल (Black Hole) की सीमा 'इवेंट होराइजन' (Event Horizon) क्या दर्शाती है?",
            "What physical boundary does the 'Event Horizon' of a gravitational Black Hole represent?",
            listOf("ब्लैक होल का ठोस केंद्र", "वह काल्पनिक सीमा (Point of No Return) जिसके पार से प्रकाश सहित कोई भी वस्तु बाहर नहीं निकल सकती (Escape Velocity > Speed of Light)", "ब्लैक होल का वायुमंडल", "चुंबकीय क्षेत्र"),
            listOf("Solid black hole surface", "The boundary / point of no return beyond which escape velocity exceeds the speed of light (c)", "Atmospheric boundary", "Accretion flare"),
            1,
            "इवेंट होराइजन वह सीमा है जहाँ गुरुत्वाकर्षण इतना तीव्र होता है कि पलायन वेग प्रकाश की चाल (c) से अधिक हो जाता है। श्वार्जस्चिल्ड त्रिज्या R_s = 2GM/c² इसके आकार को निर्धारित करती है।",
            "The Event Horizon is the spacetime threshold around a black hole where gravitational collapse creates an escape velocity exceeding the speed of light in vacuum (c), preventing any information/matter escape.",
            "Easy"
        )
    )
}
