package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic3Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m1_q1", "sci_3",
            "ओम का नियम (Ohm's Law) भौतिक अवस्थाएं नियत रहने पर विद्युत धारा (I) और विभवांतर (V) में क्या संबंध स्थापित करता है?",
            "Under constant physical conditions and temperature, Ohm's Law establishes which relationship between current (I) and voltage (V)?",
            listOf("V = I / R", "V = I × R (विभवांतर विद्युत धारा के अनुक्रमानुपाती होता है)", "V = I² R", "I = V² R"),
            listOf("V = I / R", "V = I × R (Potential difference is directly proportional to current)", "V = I² R", "I = V² R"),
            1,
            "ओम के नियमानुसार नियत ताप पर चालक के सिरों पर लगाया गया विभवांतर उसमें प्रवाहित विद्युत धारा के समानुपाती होता है (V = IR), जहाँ R चालक का विद्युत प्रतिरोध (Resistance) है।",
            "Ohm's Law states that steady electric current through a conductor is directly proportional to potential difference across its terminals (V = IR), where R is electrical resistance.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q2", "sci_3",
            "विद्युत प्रतिरोधकता (Electrical Resistivity / Specific Resistance - ρ) का SI मात्रक क्या है?",
            "What is the SI unit of Electrical Resistivity (ρ = R·A / L)?",
            listOf("ओम (Ω)", "ओम-मीटर (Ω·m)", "ओम/मीटर (Ω/m)", "म्हो (Mho)"),
            listOf("Ohm (Ω)", "Ohm-meter (Ω·m)", "Ohm/meter (Ω/m)", "Siemens"),
            1,
            "प्रतिरोध R = ρ (L/A) होता है। अतः प्रतिरोधकता ρ = R·A/L = (Ω × m²) / m = ओम-मीटर (Ω·m) है। यह पदार्थ का विशिष्ट गुण है जो केवल तापमान और पदार्थ की प्रकृति पर निर्भर करता है।",
            "Resistivity ρ = R·A/L has the SI unit Ohm-meter (Ω·m). It is an intrinsic material property independent of dimensions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q3", "sci_3",
            "घरों में विद्युत उपकरण (पंखा, बल्ब, टीवी) किस क्रम में संयोजित (Connected) किए जाते हैं?",
            "In domestic household electrical wiring, appliances (fans, lights, sockets) are connected in:",
            listOf("श्रेणीक्रम (Series Circuit)", "समानांतर क्रम (Parallel Circuit)", "मिश्रित क्रम", "चक्रीय क्रम"),
            listOf("Series Circuit", "Parallel Circuit", "Mixed Circuit", "Cyclic Circuit"),
            1,
            "समानांतर क्रम में प्रत्येक उपकरण को समान वोल्टेज (भारत में 220V) मिलता है, प्रत्येक का अलग स्विच होता है, और एक उपकरण खराब होने पर बाकी चालू रहते हैं।",
            "Domestic circuits are wired in Parallel so every appliance operates independently at the full standard mains voltage (220V AC) without affecting other loads if one fails.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q4", "sci_3",
            "विद्युत फ्यूज तार (Electric Fuse Wire) किस मिश्रधातु का बना होता है और इसके मुख्य गुण क्या होते हैं?",
            "A conventional Electric Fuse Wire is made of an alloy of Tin and Lead (Sn-Pb) characterized by:",
            listOf("उच्च गलनांक और उच्च प्रतिरोध", "निम्न गलनांक और उच्च प्रतिरोध (Low Melting Point and High Resistance)", "उच्च गलनांक और निम्न प्रतिरोध", "निम्न गलनांक और निम्न प्रतिरोध"),
            listOf("High melting point and high resistance", "Low Melting Point and High Resistance (approx 63% Sn, 37% Pb)", "High melting point and low resistance", "Low melting point and low resistance"),
            1,
            "फ्यूज तार टिन (63%) और लेड (37%) की मिश्रधातु का बना होता है। इसका गलनांक कम और प्रतिरोध अधिक होता है ताकि अत्यधिक धारा प्रवाहित होने पर जूल ऊष्मन से यह तुरंत पिघलकर परिपथ तोड़ दे।",
            "Fuse wires made of lead-tin alloy have low melting points and relatively high resistance, melting swiftly to break the circuit during overloads and short circuits.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q5", "sci_3",
            "विद्युत बल्ब का फिलामेंट किस धातु का बनाया जाता है?",
            "The filament of an incandescent electric bulb is fabricated from which metal?",
            listOf("तांबा (Copper)", "टंगस्टन (Tungsten - W)", "नाइक्रोम (Nichrome)", "एल्यूमीनियम (Aluminium)"),
            listOf("Copper", "Tungsten (Wolfram - W)", "Nichrome", "Aluminium"),
            1,
            "टंगस्टन का गलनांक अत्यंत उच्च (~3422 °C) होता है और इसका प्रतिरोध भी उपयुक्त होता है, जिससे यह श्वेत तप्त अवस्था में बिना पिघले अत्यधिक प्रकाश देता है।",
            "Tungsten possesses the highest melting point of all metals (~3422°C) and high tensile strength, glowing incandescently white without melting.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q6", "sci_3",
            "विद्युत हीटर, गीजर और टोस्टर के हीटिंग एलिमेंट (Heating Element) किसके बने होते हैं?",
            "The Heating Elements of electric irons, toasters, and room heaters are made of which alloy?",
            listOf("टंगस्टन", "नाइक्रोम (Nichrome - 80% Ni, 20% Cr)", "तांबा", "पीतल"),
            listOf("Tungsten", "Nichrome (80% Nickel, 20% Chromium)", "Copper", "Brass"),
            1,
            "नाइक्रोम (निकल + क्रोमियम) की प्रतिरोधकता अत्यधिक उच्च होती है, इसका गलनांक ~1400°C होता है और उच्च तापमान पर भी इसका ऑक्सीकरण (दहन) नहीं होता।",
            "Nichrome (80% Ni, 20% Cr) combines high electrical resistivity with exceptional resistance to high-temperature oxidation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q7", "sci_3",
            "विद्युत धारा के चुंबकीय प्रभाव (Magnetic Effect of Electric Current) की खोज 1820 में किसने की थी?",
            "Who discovered the Magnetic Effect of Electric Current in 1820 by observing deflection in a magnetic compass needle near a current-carrying wire?",
            listOf("माइकल फैराडे", "हंस क्रिश्चियन ओरस्टेड (Hans Christian Oersted)", "आंद्रे-मैरी एम्पीयर", "निकोला टेस्ला"),
            listOf("Michael Faraday", "Hans Christian Oersted", "André-Marie Ampère", "Nikola Tesla"),
            1,
            "एच.सी. ओरस्टेड ने देखा कि जब किसी चालक तार में विद्युत धारा प्रवाहित की जाती है, तो उसके पास रखी चुंबकीय सुई विक्षेपित हो जाती है, जिससे सिद्ध हुआ कि गतिमान आवेश चुंबकीय क्षेत्र उत्पन्न करते हैं।",
            "Hans Christian Ørsted demonstrated that an electric current circulating in a wire generates a surrounding magnetic field, founding the science of electromagnetism.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q8", "sci_3",
            "विद्युत मोटर (Electric Motor) विद्युत ऊर्जा को किस ऊर्जा में परिवर्तित करती है?",
            "An Electric Motor converts Electrical Energy into which form of energy?",
            listOf("रासायनिक ऊर्जा", "यांत्रिक ऊर्जा (Mechanical Energy)", "ऊष्मीय ऊर्जा", "ध्वनि ऊर्जा"),
            listOf("Chemical Energy", "Mechanical Energy (Rotational Kinetic Energy)", "Thermal Energy", "Sound Energy"),
            1,
            "विद्युत मोटर फ्लेमिंग के बाएं हाथ के नियम पर कार्य करती है। जब चुंबकीय क्षेत्र में रखी कुंडली में विद्युत धारा प्रवाहित की जाती है, तो उस पर चुंबकीय बल आघूर्ण लगता है और वह यांत्रिक घूर्णन करने लगती है।",
            "An electric motor transforms electrical input energy into mechanical rotational work based on Lorentz force and Fleming's Left-Hand Rule.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q9", "sci_3",
            "विद्युत जनरेटर (Dynamo / Electric Generator) और ट्रांसफार्मर भौतिकी के किस सिद्धांत पर कार्य करते हैं?",
            "Electric Generators (Dynamos) and Transformers operate on which fundamental physical principle?",
            listOf("विद्युत चुम्बकीय प्रेरण (Electromagnetic Induction - Faraday's Law)", "ओम का नियम", "कूलॉम का नियम", "जूल का ऊष्मन नियम"),
            listOf("Electromagnetic Induction (Faraday's Laws)", "Ohm's Law", "Coulomb's Law", "Joule's Heating Law"),
            0,
            "माइकल फैराडे के विद्युत चुम्बकीय प्रेरण के नियमानुसार जब किसी परिपथ से बद्ध चुंबकीय फ्लक्स में परिवर्तन होता है, तो उसमें प्रेरित विद्युत वाहक बल (Induced EMF = -dΦ/dt) उत्पन्न होता है।",
            "Faraday's Law of Electromagnetic Induction dictates that a changing magnetic flux through a conductor loop induces an electromotive force (EMF = -dΦ/dt).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q10", "sci_3",
            "ट्रांसफार्मर (Transformer) का मुख्य कार्य क्या है?",
            "What is the primary function of an electrical Transformer?",
            listOf("प्रत्यावर्ती धारा (AC) वोल्टेज को बढ़ाना या घटाना (Step-up / Step-down AC Voltage)", "AC को DC में बदलना", "DC को AC में बदलना", "विद्युत ऊर्जा उत्पन्न करना"),
            listOf("Step-up or Step-down Alternating Current (AC) Voltage", "Convert AC to DC", "Convert DC to AC", "Generate electric power"),
            0,
            "ट्रांसफार्मर अन्योन्य प्रेरण (Mutual Induction) पर कार्य करता है और यह केवल प्रत्यावर्ती धारा (AC) पर काम करता है। यह आवृत्ति और शक्ति को स्थिर रखते हुए AC वोल्टेज को बढ़ाता (Step-up) या घटाता (Step-down) है।",
            "A transformer operates on mutual inductance to alter AC voltage levels (Step-Up or Step-Down) while conserving electrical power and maintaining constant operating frequency. It does not work on pure DC.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q11", "sci_3",
            "प्रत्यावर्ती धारा (AC) को दिष्ट धारा (DC) में परिवर्तित करने वाले इलेक्ट्रॉनिक उपकरण को क्या कहते हैं?",
            "The electronic device that converts Alternating Current (AC) into Direct Current (DC) is called:",
            listOf("इन्वर्टर (Inverter)", "दिष्टकारी / रेक्टिफायर (Rectifier / Diode circuit)", "ट्रांसफार्मर", "ऑसिलेटर"),
            listOf("Inverter", "Rectifier (Diode PN-junction circuit)", "Transformer", "Oscillator"),
            1,
            "दिष्टकारी (Rectifier), जो अर्धचालक डायोड (P-N Junction Diodes) से बना होता है, AC को DC में बदलता है। DC को AC में बदलने वाले उपकरण को इन्वर्टर (Inverter) कहते हैं।",
            "A Rectifier uses semiconductor diodes to permit unidirectional current flow, converting bidirectional AC into pulsating DC. An Inverter converts DC back to AC.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q12", "sci_3",
            "लेंज का नियम (Lenz's Law) किस भौतिक राशि के संरक्षण का प्रत्यक्ष परिणाम है?",
            "Lenz's Law for the direction of induced EMF is a direct consequence of the conservation of:",
            listOf("आवेश (Charge)", "ऊर्जा (Energy)", "संवेग (Momentum)", "द्रव्यमान (Mass)"),
            listOf("Charge", "Energy", "Momentum", "Mass"),
            1,
            "लेंज का नियम कहता है कि प्रेरित धारा की दिशा सदैव ऐसी होती है कि वह उस कारण (चुंबकीय फ्लक्स परिवर्तन) का विरोध करती है जिससे वह स्वयं उत्पन्न हुई है। यह ऊर्जा संरक्षण के नियम का पालन करता है।",
            "Lenz's Law specifies that induced current always opposes the magnetic flux change producing it, maintaining strict conservation of mechanical-to-electrical energy.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m1_q13", "sci_3",
            "परमाणु के नाभिक (Atomic Nucleus) की खोज 1911 में किस वैज्ञानिक ने अल्फा कण प्रकीर्णन प्रयोग द्वारा की थी?",
            "Who discovered the Atomic Nucleus in 1911 through the historic Alpha Particle Gold Foil Scattering Experiment?",
            listOf("जे.जे. थॉमसन", "अर्नेस्ट रदरफोर्ड (Ernest Rutherford)", "नील्स बोर", "जेम्स चैडविक"),
            listOf("J. J. Thomson", "Ernest Rutherford", "Niels Bohr", "James Chadwick"),
            1,
            "रदरफोर्ड ने सोने की पतली पन्नी पर अल्फा कणों की बमबारी की। कुछ कण 180° पर वापस लौट आए जिससे सिद्ध हुआ कि परमाणु का समस्त धनावेश और अधिकांश द्रव्यमान केंद्र में एक अति सूक्ष्म 'नाभिक' में केंद्रित है।",
            "Ernest Rutherford bombarded thin gold foil with alpha particles, deducing that atomic positive charge and mass are concentrated in a tiny central Nucleus.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q14", "sci_3",
            "न्यूट्रॉन (Neutron) की खोज 1932 में किसने की थी?",
            "Who discovered the uncharged subatomic particle 'Neutron' in 1932?",
            listOf("जे.जे. थॉमसन (इलेक्ट्रॉन)", "जेम्स चैडविक (James Chadwick)", "यूजीन गोल्डस्टीन (प्रोटॉन)", "एनरिको फर्मी"),
            listOf("J. J. Thomson", "James Chadwick", "Eugen Goldstein", "Enrico Fermi"),
            1,
            "जेम्स चैडविक ने बेरिलियम पर अल्फा कणों की बमबारी करके उदासीन कण 'न्यूट्रॉन' की खोज की, जिसके लिए उन्हें 1935 में नोबेल पुरस्कार मिला।",
            "James Chadwick identified the Neutron by bombarding beryllium with alpha particles, proving it to be a neutral nucleon of mass ~1.675 × 10⁻²⁷ kg.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m1_q15", "sci_3",
            "परमाणु बम (Atomic Bomb) और परमाणु रिएक्टर (Nuclear Reactor) किस नाभिकीय अभिक्रिया पर आधारित हैं?",
            "Atomic Bombs and civil Nuclear Power Reactors operate on which nuclear reaction?",
            listOf("नाभिकीय संलयन (Nuclear Fusion)", "नाभिकीय विखंडन (Controlled / Uncontrolled Nuclear Fission)", "प्राकृतिक रेडियोधर्मिता", "रासायनिक दहन"),
            listOf("Nuclear Fusion", "Nuclear Fission (Controlled in reactor, Uncontrolled in A-bomb)", "Natural Radioactivity", "Chemical Combustion"),
            1,
            "नाभिकीय विखंडन में यूरेनियम-235 या प्लूटोनियम-239 के भारी नाभिक पर मंद न्यूट्रॉन से प्रहार कर उसे हल्के नाभिकों (बेरियम, क्रिप्टन) में तोड़ा जाता है, जिससे भारी ऊर्जा और अतिरिक्त न्यूट्रॉन निकलते हैं।",
            "Nuclear Fission splits heavy unstable actinides (U-235, Pu-239) into lighter daughter nuclei upon neutron absorption, releasing massive nuclear binding energy (E = mc²).",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m2_q1", "sci_3",
            "सूर्य और तारों में ऊर्जा उत्पादन का मुख्य स्रोत कौन-सी नाभिकीय प्रक्रिया है?",
            "What is the primary thermonuclear mechanism powering the Sun and stars?",
            listOf("नाभिकीय विखंडन (Nuclear Fission)", "नाभिकीय संलयन (Nuclear Fusion - Proton-Proton Chain)", "रासायनिक दहन", "गुरुत्वीय संकुचन"),
            listOf("Nuclear Fission", "Thermonuclear Fusion (Proton-Proton chain & CNO cycle)", "Chemical Combustion", "Gravitational Contraction"),
            1,
            "सूर्य के अत्यधिक उच्च तापमान और दाब पर 4 हाइड्रोजन नाभिक (प्रोटॉन) संलयित होकर 1 हीलियम नाभिक बनाते हैं, जिसमें द्रव्यमान क्षति (Mass defect) के कारण भारी मात्रा में ऊर्जा (E = Δm·c²) विमुक्त होती है।",
            "In stellar cores, hydrogen nuclei fuse under extreme thermonuclear temperatures into helium (4 ¹H → ⁴He + 2e⁺ + 2ν + 26.7 MeV), liberating immense radiative energy via mass defect.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q2", "sci_3",
            "हाइड्रोजन बम (Hydrogen Bomb / Thermonuclear Bomb) किस सिद्धांत पर आधारित है?",
            "A Hydrogen Bomb (Thermonuclear device) is based on:",
            listOf("केवल नियंत्रित विखंडन", "अनियंत्रित नाभिकीय संलयन (Uncontrolled Nuclear Fusion)", "केवल भारी जल अभिक्रिया", "रासायनिक विस्फोट"),
            listOf("Controlled Fission", "Uncontrolled Thermonuclear Fusion initiated by a fission trigger", "Heavy water reaction", "Chemical TNT blast"),
            1,
            "हाइड्रोजन बम अनियंत्रित नाभिकीय संलयन (Nuclear Fusion) पर आधारित है। संलयन के लिए आवश्यक करोड़ों डिग्री तापमान उत्पन्न करने हेतु पहले एक परमाणु बम (विखंडन ट्रिगर) का विस्फोट किया जाता है।",
            "A hydrogen bomb utilizes an atomic fission primary to produce the tens of millions of degrees needed to ignite uncontrolled thermonuclear fusion of deuterium and tritium secondary stages.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q3", "sci_3",
            "परमाणु रिएक्टर में न्यूट्रॉनों की गति को धीमा करने के लिए 'मंदक' (Moderator) के रूप में किसका उपयोग किया जाता है?",
            "Which materials are standardly used as a Neutron Moderator in thermal nuclear reactors to slow down fast fission neutrons?",
            listOf("कैडमियम और बोरॉन छड़ें", "भारी जल (D₂O) और ग्रेफाइट (Heavy Water and Graphite)", "यूरेनियम-238", "द्रव सोडियम"),
            listOf("Cadmium and Boron rods", "Heavy Water (Deuterium Oxide - D₂O) and Graphite", "Uranium-238", "Liquid Sodium"),
            1,
            "तीव्रगामी न्यूट्रॉनों को तापीय न्यूट्रॉन (Thermal neutrons) में बदलने के लिए भारी जल (D₂O) या शुद्ध ग्रेफाइट का उपयोग मंदक के रूप में होता है। कैडमियम/बोरॉन नियंत्रक छड़ें (Control rods) होती हैं।",
            "Moderators like Heavy Water (D₂O) and high-purity Graphite undergo elastic collisions with fast neutrons without absorbing them, slowing them to thermal velocities for sustaining chain fission.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q4", "sci_3",
            "नाभिकीय रिएक्टर में विखंडन श्रृंखला अभिक्रिया को नियंत्रित करने के लिए न्यूट्रॉन-अवशोषक 'नियंत्रक छड़ें' (Control Rods) किसकी बनी होती हैं?",
            "Control Rods used in nuclear reactors to absorb excess neutrons and regulate chain reaction rates are made of:",
            listOf("ग्रेफाइट और भारी जल", "कैडमियम और बोरॉन (Cadmium and Boron)", "लोहा और तांबा", "प्लूटोनियम"),
            listOf("Graphite and Heavy water", "Cadmium and Boron", "Iron and Copper", "Plutonium"),
            1,
            "बोरॉन और कैडमियम का न्यूट्रॉन अवशोषण क्रॉस-सेक्शन बहुत उच्च होता है। रिएक्टर को बंद करने या गति नियंत्रित करने के लिए इन छड़ों को कोर में अंदर डाला जाता है।",
            "Cadmium and Boron have exceptionally high thermal neutron capture cross-sections, allowing fine control or emergency scramming (shutdown) of reactor reactivity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q5", "sci_3",
            "रेडियोधर्मिता (Radioactivity) की खोज 1896 में सर्वप्रथम किस वैज्ञानिक ने की थी?",
            "Who first discovered natural Radioactivity in 1896 while investigating phosphorescence in uranium salts?",
            listOf("मैरी क्यूरी", "हेनरी बेकेरल (Henri Becquerel)", "पियरे क्यूरी", "अर्नेस्ट रदरफोर्ड"),
            listOf("Marie Curie", "Henri Becquerel", "Pierre Curie", "Ernest Rutherford"),
            1,
            "हेनरी बेकेरल ने यूरेनियम यौगिकों से निकलने वाली स्वतःस्फूर्त अदृश्य भेदनकारी किरणों की खोज की। बाद में मैरी क्यूरी और पियरे क्यूरी ने पोलोनियम और रेडियम की खोज की। बेकेरल (Bq) रेडियोधर्मिता का SI मात्रक है।",
            "Henri Becquerel discovered spontaneous radioactive emissions from uranium in 1896. Marie and Pierre Curie subsequently isolated polonium and radium. The SI unit is Becquerel (1 decay/sec).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q6", "sci_3",
            "अल्फा (α), बीटा (β), और गामा (γ) विकिरणों में सर्वाधिक आयनीकरण क्षमता (Ionizing Power) और सर्वाधिक भेदन क्षमता (Penetrating Power) क्रमशः किसकी होती है?",
            "Among Alpha, Beta, and Gamma radiations, which have the Maximum Ionizing Power and Maximum Penetrating Power respectively?",
            listOf("सर्वाधिक आयनीकरण: गामा, सर्वाधिक भेदन: अल्फा", "सर्वाधिक आयनीकरण: अल्फा (α), सर्वाधिक भेदन: गामा (γ)", "दोनों में बीटा", "दोनों में अल्फा"),
            listOf("Max Ionizing: Gamma, Max Penetrating: Alpha", "Max Ionizing: Alpha (α), Max Penetrating: Gamma (γ)", "Beta in both", "Alpha in both"),
            1,
            "अल्फा कण (He²⁺) पर +2 आवेश और अधिक द्रव्यमान होने से इसकी आयनीकरण क्षमता सर्वाधिक और भेदन क्षमता सबसे कम (कागज से रुक जाती है) होती है। गामा किरणें आवेशहीन फोटॉन होने से इनकी भेदन क्षमता सर्वाधिक होती है।",
            "Alpha particles (+2e, heavy) possess the highest ionization density. Gamma photons have zero charge and mass, conferring maximum penetrating power through dense materials.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m2_q7", "sci_3",
            "जीवाश्मों, प्राचीन काष्ठ और पुरातात्विक अवशेषों की आयु निर्धारित करने के लिए किस रेडियोधर्मी समस्थानिक का उपयोग किया जाता है?",
            "Radiocarbon dating uses which radioactive isotope with a half-life of ~5,730 years to date organic archaeological specimens?",
            listOf("कार्बन-12 (C-12)", "कार्बन-14 (C-14)", "यूरेनियम-238", "पोटेशियम-40"),
            listOf("Carbon-12", "Carbon-14 (C-14)", "Uranium-238", "Potassium-40"),
            1,
            "रेडियोकार्बन डेटिंग (विलार्ड लिब्बी द्वारा खोजी गई) C-14 की रेडियोधर्मी क्षय दर (अर्धायु 5,730 वर्ष) को मापकर 50,000 वर्ष तक पुराने मृत जैविक नमूनों की सटीक आयु बताती है।",
            "Carbon-14 dating measures the residual ratio of radioactive C-14 to stable C-12 in organic matter, accurately dating artifacts up to ~50,000 years old.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q8", "sci_3",
            "थायरॉयड ग्रंथि (घेंघा/थायरॉयड कैंसर) के उपचार और निदान में किस रेडियोआइसोटोप का उपयोग किया जाता है?",
            "Which radioisotope is standardly administered for diagnostic scanning and targeted radiotherapy of Thyroid disorders?",
            listOf("कोबाल्ट-60", "आयोडीन-131 (I-131)", "सोडियम-24", "फास्फोरस-32"),
            listOf("Cobalt-60", "Iodine-131 (I-131)", "Sodium-24", "Phosphorus-32"),
            1,
            "थायरॉयड ग्रंथि प्राकृतिक रूप से आयोडीन एकत्र करती है। I-131 से निकलने वाली बीटा और गामा विकिरणें अतिसक्रिय या कैंसरयुक्त थायरॉयड कोशिकाओं को लक्षित करके नष्ट कर देती हैं।",
            "The thyroid gland avidly sequesters Iodine-131; its localized beta emissions destroy hyperactive thyrocytes and thyroid malignancies selectively.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q9", "sci_3",
            "भारत के त्रि-स्तरीय परमाणु ऊर्जा कार्यक्रम (Three-Stage Nuclear Power Programme) के जनक कौन थे?",
            "Who was the visionary architect and Founding Father of India's Three-Stage Nuclear Power Programme?",
            listOf("डॉ. ए.पी.जे. अब्दुल कलाम", "डॉ. होमी जहांगीर भाभा (Dr. Homi J. Bhabha)", "डॉ. विक्रम साराभाई", "डॉ. सतीश धवन"),
            listOf("Dr. A. P. J. Abdul Kalam", "Dr. Homi Jehangir Bhabha", "Dr. Vikram Sarabhai", "Dr. Satish Dhawan"),
            1,
            "डॉ. होमी जहांगीर भाभा ने भारत के विशाल थोरियम भंडारों का उपयोग करने के लिए 3-चरणीय कार्यक्रम तैयार किया: चरण-1 PHWR (प्राकृतिक यूरेनियम), चरण-2 FBR (प्लूटोनियम), चरण-3 थोरियम-232 आधारित AHWR।",
            "Dr. Homi J. Bhabha formulated India's 3-stage nuclear energy roadmap designed to exploit domestic monazite thorium reserves (Stage 1: PHWR, Stage 2: FBR, Stage 3: Thorium AHWR).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q10", "sci_3",
            "भारत का पहला परमाणु अनुसंधान रिएक्टर कौन-सा था जिसे 1956 में ट्रॉम्बे में शुरू किया गया था?",
            "Which was India's (and Asia's) very first nuclear research reactor, commissioned at Trombay in August 1956?",
            listOf("सायरस (CIRUS)", "अप्सरा (Apsara)", "ध्रुव (Dhruva)", "पूर्णिमा (Purnima)"),
            listOf("CIRUS", "Apsara", "Dhruva", "Purnima"),
            1,
            "अप्सरा (Apsara) 4 अगस्त 1956 को क्रिटिकल हुआ भारत और एशिया का पहला स्विमिंग पूल प्रकार का परमाणु अनुसंधान रिएक्टर था।",
            "Apsara was Asia's first swimming-pool-type nuclear research reactor, reaching initial criticality on 4 August 1956 at BARC Trombay.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q11", "sci_3",
            "भारत के अंतरिक्ष कार्यक्रम के जनक (Father of the Indian Space Programme) किन्हें माना जाता है?",
            "Who is universally regarded as the 'Father of the Indian Space Programme'?",
            listOf("डॉ. होमी भाभा", "डॉ. विक्रम साराभाई (Dr. Vikram Sarabhai)", "डॉ. के. सिवन", "सतीश धवन"),
            listOf("Dr. Homi Bhabha", "Dr. Vikram Sarabhai", "Dr. K. Sivan", "Prof. Satish Dhawan"),
            1,
            "डॉ. विक्रम साराभाई ने 1962 में INCOSPAR और 1969 में ISRO की स्थापना में अग्रणी भूमिका निभाई। थुम्बा से प्रथम रॉकेट प्रक्षेपण (1963) और आर्यभट्ट उपग्रह उन्हीं के विजन का परिणाम थे।",
            "Dr. Vikram Sarabhai founded INCOSPAR in 1962, established ISRO in 1969, and spearheaded India's space telecommunications and satellite applications.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q12", "sci_3",
            "भारत का पहला स्वदेशी उपग्रह 'आर्यभट्ट' (Aryabhata) कब और किस देश के रॉकेट से प्रक्षेपित किया गया था?",
            "India's first satellite 'Aryabhata' was launched on 19 April 1975 using which country's launch vehicle?",
            listOf("USA (नासा - डेल्टा रॉकेट)", "सोवियत संघ (USSR - कॉसमॉस-3M रॉकेट)", "फ्रांस (एरियन)", "भारत (SLV-3)"),
            listOf("USA (NASA Delta)", "Soviet Union (USSR - Kosmos-3M rocket)", "France (Ariane)", "India (SLV-3)"),
            1,
            "आर्यभट्ट (360 किग्रा) को 19 अप्रैल 1975 को सोवियत संघ के कपुस्टिन यार प्रक्षेपण स्थल से 'कॉसमॉस-3एम' रॉकेट द्वारा अंतरिक्ष में भेजा गया था।",
            "Aryabhata was launched on 19 April 1975 from Kapustin Yar aboard a Soviet Kosmos-3M launch vehicle, marking India's entry into space exploration.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q13", "sci_3",
            "इसरो (ISRO) का प्रमुख प्रक्षेपण केंद्र 'सतीश धवन अंतरिक्ष केंद्र' (SDSC) कहाँ स्थित है?",
            "ISRO's primary spaceport, the Satish Dhawan Space Centre (SDSC-SHAR), is situated at:",
            listOf("थुम्बा, केरल", "श्रीहरिकोटा, आंध्र प्रदेश (Sriharikota, AP)", "चांदीपुर, ओडिशा", "पोखरण, राजस्थान"),
            listOf("Thumba, Kerala", "Sriharikota, Andhra Pradesh", "Chandipur, Odisha", "Pokhran, Rajasthan"),
            1,
            "श्रीहरिकोटा (आंध्र प्रदेश के तिरुपति जिले में स्थित द्वीप) भूमध्य रेखा के निकट और पूर्वी तट पर स्थित है, जिससे रॉकेटों को पृथ्वी के घूर्णन का वेग लाभ मिलता है और मलबा समुद्र में गिरता है।",
            "Sriharikota island in Andhra Pradesh serves as ISRO's orbital launch spaceport, offering eastward launch trajectories over the Bay of Bengal.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q14", "sci_3",
            "चंद्रयान-3 (Chandrayaan-3) मिशन ने 23 अगस्त 2023 को चंद्रमा के किस हिस्से पर सफल सॉफ्ट लैंडिंग कर इतिहास रचा?",
            "On 23 August 2023, Chandrayaan-3's Vikram lander made a historic soft landing near which lunar region?",
            listOf("चंद्रमा का उत्तरी ध्रुव", "चंद्रमा का दक्षिणी ध्रुव क्षेत्र (Lunar South Pole Region - Shiv Shakti Point)", "सी ऑफ ट्रैंक्विलिटी", "ओशनस प्रोसेलरम"),
            listOf("Lunar North Pole", "Lunar South Pole Region (Shiv Shakti Point)", "Sea of Tranquillity", "Oceanus Procellarum"),
            1,
            "भारत चंद्रमा के दक्षिणी ध्रुव पर उतरने वाला विश्व का पहला देश बना। इस लैंडिंग स्थल को 'शिव शक्ति बिंदु' (Shiv Shakti Point) नाम दिया गया और 23 अगस्त को 'राष्ट्रीय अंतरिक्ष दिवस' घोषित किया गया।",
            "India became the first nation to land softly near the Lunar South Pole (designated 'Shiv Shakti Point'). August 23 is now celebrated as National Space Day.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m2_q15", "sci_3",
            "क्रायोजेनिक इंजन (Cryogenic Rocket Engine) में प्रयुक्त ईंधन और ऑक्सीकारक कौन-से होते हैं?",
            "What propellants are used in the upper stages of Cryogenic Rocket Engines (such as ISRO's CE-20)?",
            listOf("तरल केरोसिन और तरल ऑक्सीजन", "तरल हाइड्रोजन (-253°C) और तरल ऑक्सीजन (-183°C)", "ठोस प्रोपेलेंट HTPB", "हाइड्राज़ीन और N₂O₄"),
            listOf("Liquid Kerosene and Liquid Oxygen", "Liquid Hydrogen (-253°C) as fuel and Liquid Oxygen (-183°C) as oxidizer (LH2 / LOX)", "Solid propellant HTPB", "Hydrazine and NTO"),
            1,
            "क्रायोजेनिक इंजन अत्यंत निम्न तापमान पर तरल हाइड्रोजन (LH₂: -253 °C) को ईंधन तथा तरल ऑक्सीजन (LOX: -183 °C) को ऑक्सीकारक के रूप में जलाते हैं, जो सर्वाधिक विशिष्ट आवेग (Specific Impulse) प्रदान करते हैं।",
            "Cryogenic engines combust Liquid Hydrogen (fuel at -253°C) and Liquid Oxygen (oxidizer at -183°C), delivering maximum specific impulse thrust per unit mass of propellant.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 3 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m3_q1", "sci_3",
            "चुंबकीय फ्लक्स (Magnetic Flux - Φ) का SI मात्रक क्या है?",
            "What is the SI unit of Magnetic Flux (Φ = B · A)?",
            listOf("टेस्ला (Tesla)", "वेबर (Weber - Wb)", "गॉस (Gauss)", "हेनरी (Henry)"),
            listOf("Tesla", "Weber (Wb = T·m²)", "Gauss", "Henry"),
            1,
            "चुंबकीय फ्लक्स का SI मात्रक वेबर (Weber - Wb) या टेस्ला-वर्ग मीटर (T·m²) है। चुंबकीय क्षेत्र की तीव्रता (Magnetic field B) का मात्रक टेस्ला (T) या गॉस (1 T = 10⁴ Gauss) होता है।",
            "The SI unit of magnetic flux is Weber (Wb = Tesla × m²). Magnetic flux density / field strength is measured in Tesla (T).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m3_q2", "sci_3",
            "विद्युत चुंबक (Electromagnet) बनाने के लिए किस प्रकार के लोहे का कोर सबसे उपयुक्त होता है?",
            "Which type of core material is ideally preferred for manufacturing powerful Electromagnets?",
            listOf("कठोर इस्पात (Hard Steel)", "नरम लोहा (Soft Iron)", "तांबा", "स्टेनलेस स्टील"),
            listOf("Hardened Steel", "Soft Iron (High permeability and low retentivity)", "Copper", "Stainless Steel"),
            1,
            "नरम लोहे (Soft Iron) की चुंबकीय पारगम्यता (Permeability) बहुत अधिक और धारणशीलता (Retentivity) बहुत कम होती है, जिससे धारा बहने पर यह तुरंत चुंबक बन जाता है और धारा बंद होते ही चुंबकत्व समाप्त हो जाता है।",
            "Soft iron exhibits high magnetic permeability and very low coercivity/retentivity, magnetizing intensely when current flows and demagnetizing instantaneously when switched off.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m3_q3", "sci_3",
            "स्थायी चुंबक (Permanent Magnets) बनाने के लिए कौन-सा पदार्थ सर्वोत्तम होता है?",
            "Which material is best suited for fabricating robust Permanent Magnets?",
            listOf("नरम लोहा", "एल्निको और कठोर कार्बन इस्पात (Alnico and High-Carbon Steel)", "तांबा", "एल्युमीनियम"),
            listOf("Soft Iron", "Alnico (Al-Ni-Co alloy) and Carbon/Cobalt Steel", "Copper", "Aluminium"),
            1,
            "स्थायी चुंबकों के लिए ऐसा पदार्थ चाहिए जिसकी धारणशीलता (Retentivity) और निग्राहिता (Coercivity) दोनों उच्च हों ताकि चुंबकत्व आसानी से नष्ट न हो। एल्निको (Alnico) और कोबाल्ट स्टील इसके सर्वोत्तम उदाहरण हैं।",
            "Permanent magnets require high magnetic retentivity and high coercivity to prevent demagnetization. Alnico alloys and cobalt steels are industry standards.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m3_q4", "sci_3",
            "क्यूरी तापमान (Curie Temperature) वह तापमान है जिसके ऊपर लौह-चुंबकीय पदार्थ (Ferromagnetic) किसमें बदल जाता है?",
            "The Curie Temperature is the threshold temperature above which a Ferromagnetic material transitions into a:",
            listOf("प्रतिचुंबकीय (Diamagnetic)", "अनुचुंबकीय पदार्थ (Paramagnetic Material)", "अतिचालक", "अचुंबकीय गैस"),
            listOf("Diamagnetic substance", "Paramagnetic substance (Loss of spontaneous magnetization)", "Superconductor", "Non-magnetic gas"),
            1,
            "क्यूरी तापमान पर थर्मल उत्तेजना चुंबकीय डोमेन को तोड़ देती है, जिससे लौह-चुंबकीय पदार्थ (जैसे लोहा ~770°C, निकेल ~358°C) अनुचुंबकीय (Paramagnetic) बन जाता है।",
            "Above the Curie point, thermal agitation overcomes exchange coupling between atomic spins, collapsing ferromagnetic domains into disordered paramagnetism.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m3_q5", "sci_3",
            "अतिचालकता (Superconductivity) की खोज 1911 में किसने की थी और इसमें पदार्थ का विद्युत प्रतिरोध कितना हो जाता है?",
            "Who discovered Superconductivity in mercury at 4.2 K in 1911, and what happens to electrical resistance below critical temperature (Tc)?",
            listOf("हेइके कामरलिंघ ओनेस, प्रतिरोध शून्य (R = 0)", "निकोला टेस्ला, प्रतिरोध अनंत", "अल्बर्ट आइंस्टीन, प्रतिरोध आधा", "मैक्स प्लांक, प्रतिरोध नियत"),
            listOf("Heike Kamerlingh Onnes; Electrical Resistance drops to exactly Zero (R = 0)", "Nikola Tesla; Resistance infinite", "Albert Einstein; Resistance halves", "Max Planck; Resistance constant"),
            0,
            "डच भौतिक विज्ञानी कामरलिंघ ओनेस ने पाया कि 4.2 K पर पारे का विद्युत प्रतिरोध अचानक पूरी तरह शून्य (Zero) हो जाता है। अतिचालक आंतरिक चुंबकीय क्षेत्र को भी बाहर निकाल देते हैं (माइजनर प्रभाव)।",
            "Heike Kamerlingh Onnes discovered that mercury cooled below 4.2 K exhibits absolute zero electrical resistivity and perfect diamagnetism (Meissner Effect).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m3_q6", "sci_3",
            "माइजनर प्रभाव (Meissner Effect) किससे संबंधित है?",
            "The Meissner Effect is the complete expulsion of magnetic flux lines from the interior of a material when it transitions into the:",
            listOf("अर्धचालक अवस्था", "अतिचालक अवस्था (Superconducting State)", "प्लाज्मा अवस्था", "गैसीय अवस्था"),
            listOf("Semiconductor state", "Superconducting State (Perfect Diamagnetism: B_internal = 0)", "Plasma state", "Gaseous state"),
            1,
            "जब किसी अतिचालक को उसके क्रांतिक ताप (Tc) से नीचे ठंडा किया जाता है, तो वह अपने भीतर से सभी चुंबकीय बल रेखाओं को बाहर निकाल देता है (आंतरिक B = 0), जिससे चुंबकीय लेविटेशन (Maglev ट्रेन) संभव होता है।",
            "The Meissner effect describes the expulsion of external magnetic fields from a superconductor cooled below Tc, making it a perfect diamagnet and enabling magnetic levitation (Maglev).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m3_q7", "sci_3",
            "अर्धचालक (Semiconductors जैसे सिलिकॉन और जर्मेनियम) का तापमान बढ़ाने पर उनकी विद्युत चालकता (Conductivity) पर क्या प्रभाव पड़ता है?",
            "What happens to the Electrical Conductivity of intrinsic Semiconductors (Si, Ge) as temperature increases?",
            listOf("चालकता घटती है", "चालकता बढ़ती है (Conductivity increases / Resistance decreases)", "अपरिवर्तित रहती है", "शून्य हो जाती है"),
            listOf("Conductivity decreases", "Conductivity increases (Resistance decreases with negative temperature coefficient)", "Remains unchanged", "Becomes zero"),
            1,
            "धातुओं के विपरीत, अर्धचालकों में तापमान बढ़ाने पर सहसंयोजक बंध टूटने से मुक्त इलेक्ट्रॉन और कोटर (Holes) की संख्या तेजी से बढ़ती है, जिससे चालकता बढ़ती है और प्रतिरोधकता घटती है।",
            "Semiconductors possess a negative temperature coefficient of resistance (NTC). Thermal energy excites valence electrons across the bandgap into conduction bands, exponentially increasing conductivity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m3_q8", "sci_3",
            "शुद्ध सिलिकॉन में त्रिसंयोजी अशुद्धि (Trivalent Impurity जैसे बोरॉन, एल्युमिनियम) मिलाने पर किस प्रकार का बाह्य अर्धचालक बनता है?",
            "Doping pure Silicon with a Trivalent impurity (Boron, Indium, Gallium) produces which type of extrinsic semiconductor?",
            listOf("N-प्रकार का अर्धचालक", "P-प्रकार का अर्धचालक (P-Type Semiconductor, Holes are majority carriers)", "अतिचालक", "चालक"),
            listOf("N-Type semiconductor", "P-Type Semiconductor (Holes as majority charge carriers)", "Superconductor", "Insulator"),
            1,
            "त्रिसंयोजी परमाणु के पास 3 संयोजी इलेक्ट्रॉन होते हैं, जिससे सिलिकॉन के साथ 4 बंध बनाते समय एक इलेक्ट्रॉन की कमी (Hole/कोटर) रह जाती है। अतः P-प्रकार में कोटर बहुसंख्यक आवेश वाहक होते हैं।",
            "Trivalent dopants (Group 13) create positive electron deficiencies called Holes, generating a P-type semiconductor where holes dominate electrical transport.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m3_q9", "sci_3",
            "एलईडी (Light Emitting Diode - LED) विद्युत ऊर्जा को प्रकाश में बदलते समय किस अभिनति (Biasing) में कार्य करती है?",
            "A Light Emitting Diode (LED) emits optical photons when operating under which electrical Biasing condition?",
            listOf("उत्क्रम अभिनति (Reverse Bias)", "अग्र अभिनति (Forward Bias)", "शून्य बायस", "उच्च प्रतिरोध बायस"),
            listOf("Reverse Bias", "Forward Bias (Direct recombination of electrons and holes across bandgap)", "Zero bias", "High AC bias"),
            1,
            "एलईडी एक विशेष P-N संधि डायोड है जो अग्र अभिनति (Forward Bias) में होने पर इलेक्ट्रॉनों और होलों के पुनर्संयोजन से ऊर्जा को प्रकाश फोटॉन (E = hν = E_g) के रूप में उत्सर्जित करता है।",
            "In Forward Bias, majority carriers are injected across the PN junction where electron-hole radiative recombinations release bandgap energy as visible photons.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m3_q10", "sci_3",
            "सौर सेल (Solar Cell / Photovoltaic Cell) बनाने के लिए सबसे व्यापक रूप से किस अर्धचालक पदार्थ का उपयोग किया जाता है?",
            "Which semiconductor material is most widely utilized in manufacturing commercial Photovoltaic Solar Cells?",
            listOf("तांबा", "सिलिकॉन (Silicon - Si)", "कार्बन", "लोहा"),
            listOf("Copper", "Silicon (Monocrystalline and Polycrystalline Si)", "Carbon", "Iron"),
            1,
            "सिलिकॉन का ऊर्जा बैंडगैप (~1.1 eV) सौर स्पेक्ट्रम के फोटॉनों को अवशोषित करने के लिए अत्यंत उपयुक्त है और यह पृथ्वी पर प्रचुर मात्रा में (रेत से) उपलब्ध है।",
            "Silicon is the standard photovoltaic material worldwide due to its optimal bandgap (1.12 eV), durability, and abundance in silica sand.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m3_q11", "sci_3",
            "गॉड पार्टिकल (God Particle) के नाम से लोकप्रिय 'हिग्स बोसॉन' (Higgs Boson) किस मूलभूत अवधारणा के लिए जिम्मेदार है?",
            "The 'Higgs Boson' subatomic particle, discovered at CERN's Large Hadron Collider (LHC) in 2012, imparts what property to fundamental particles?",
            listOf("विद्युत आवेश", "द्रव्यमान (Mass)", "चुंबकीय आघूर्ण", "प्रकाश की चाल"),
            listOf("Electric charge", "Inertial Mass via interaction with Higgs Field", "Magnetic moment", "Speed of light"),
            1,
            "हिग्स क्षेत्र (Higgs Field) ब्रह्मांड में सर्वत्र व्याप्त है। प्राथमिक कण (क्वार्क, इलेक्ट्रॉन, W/Z बोसॉन) हिग्स क्षेत्र के साथ अंतःक्रिया करके द्रव्यमान (Mass) प्राप्त करते हैं। पीटर हिग्स और सत्येंद्र नाथ बोस के नाम पर इसका नाम है।",
            "The Higgs Boson is the quantum excitation of the Higgs Field, which endows electroweak gauge bosons and fermions with mass through spontaneous symmetry breaking.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m3_q12", "sci_3",
            "आइंस्टीन का प्रसिद्ध द्रव्यमान-ऊर्जा तुल्यता समीकरण क्या है?",
            "What is Albert Einstein's famous Mass-Energy Equivalence relation formulated in Special Relativity (1905)?",
            listOf("E = mc", "E = m c² (ऊर्जा = द्रव्यमान × प्रकाश की चाल का वर्ग)", "E = 1/2 m v²", "E = h ν"),
            listOf("E = mc", "E = m c² (Energy = Mass × Speed of Light squared)", "E = 1/2 m v²", "E = h ν"),
            1,
            "E = mc² के अनुसार द्रव्यमान ऊर्जा का ही एक रूप है। 1 ग्राम द्रव्यमान के पूर्ण विनाश से E = (10⁻³ kg) × (3 × 10⁸ m/s)² = 9 × 10¹³ जूल ऊर्जा उत्पन्न हो सकती है।",
            "E = mc² shows mass and energy are interconvertible. The complete conversion of 1 gram of matter releases 90 Terajoules of explosive energy.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m3_q13", "sci_3",
            "नासा का 'जेम्स वेब स्पेस टेलीस्कोप' (JWST) मुख्य रूप से ब्रह्मांड का अध्ययन किस तरंगदैर्घ्य स्पेक्ट्रम में करता है?",
            "NASA's flagship James Webb Space Telescope (JWST) observes the early deep universe primarily in which electromagnetic band?",
            listOf("पराबैंगनी", "अवरक्त प्रकाश (Infrared Radiation - Near & Mid IR)", "एक्स-रे", "रेडियो तरंगें"),
            listOf("Ultraviolet", "Infrared Radiation (Near-Infrared NIRCam and Mid-Infrared MIRI)", "X-Rays", "Radio waves"),
            1,
            "सुदूर ब्रह्मांड से आने वाला प्रकाश ब्रह्मांडीय विस्तार के कारण अत्यधिक रेडशिफ्ट होकर अवरक्त (Infrared) में बदल जाता है। JWST 13.5 अरब वर्ष पुरानी पहली आकाशगंगाओं को इन्फ्रारेड में देखता है।",
            "JWST uses high-sensitivity Infrared instrumentation to penetrate cosmic dust and capture cosmological redshifted emissions from the universe's earliest galaxies.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m3_q14", "sci_3",
            "भारत का पहला मानवयुक्त अंतरिक्ष मिशन (Human Spaceflight Programme) कौन-सा है जिसे इसरो द्वारा विकसित किया जा रहा है?",
            "What is the designated name of ISRO's first indigenous crewed orbital spaceflight mission?",
            listOf("चंद्रयान-4", "गगनयान (Gaganyaan)", "आदित्य-L1", "शुक्रयान"),
            listOf("Chandrayaan-4", "Gaganyaan", "Aditya-L1", "Shukrayaan"),
            1,
            "गगनयान मिशन के तहत 3 सदस्यीय भारतीय अंतरिक्ष दल को 400 किमी की निचली पृथ्वी कक्षा (LEO) में 3 दिनों के लिए ले जाकर सुरक्षित रूप से भारतीय समुद्र में वापस उतारा जाएगा।",
            "Gaganyaan is ISRO's indigenous Human Spaceflight mission designed to place a 3-member crew into a 400 km Low Earth Orbit for a 3-day mission and return them safely.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m3_q15", "sci_3",
            "इसरो का सौर मिशन 'आदित्य-L1' (Aditya-L1) सूर्य के अध्ययन के लिए किस विशेष कक्षा में स्थापित किया गया है?",
            "ISRO's Aditya-L1 solar observatory is stationed in a halo orbit around which Lagrangian Point?",
            listOf("पृथ्वी की ध्रुवीय कक्षा", "सूर्य-पृथ्वी लैग्रेंज बिंदु 1 (Lagrange Point 1 - L1, ~15 लाख किमी)", "चंद्रमा की कक्षा", "भू-स्थिर कक्षा"),
            listOf("Polar Earth Orbit", "Sun-Earth Lagrange Point 1 (L1, ~1.5 million km from Earth)", "Lunar orbit", "Geostationary orbit"),
            1,
            "L1 बिंदु पर सूर्य और पृथ्वी का गुरुत्वाकर्षण खिंचाव उपग्रह के अभिकेंद्रीय त्वरण के बराबर होता है, जिससे बिना किसी ग्रहण या बाधा के सूर्य का 24 घंटे निरंतर अवलोकन संभव होता है।",
            "Lagrange Point 1 (L1) offers an uninterrupted, eclipse-free vantage point 1.5 million kilometers from Earth to continuously image the solar corona, flares, and solar wind.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 4 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m4_q1", "sci_3",
            "धारिता (Electrical Capacitance - C = Q/V) का SI मात्रक क्या है?",
            "What is the SI unit of Electrical Capacitance?",
            listOf("हेनरी (Henry)", "फैराड (Farad - F)", "वेबर", "कूलॉम"),
            listOf("Henry", "Farad (F = Coulomb/Volt)", "Weber", "Coulomb"),
            1,
            "संधारित्र (Capacitor) की धारिता का SI मात्रक फैराड (Farad) है। माइकल फैराडे के सम्मान में इसका नाम रखा गया। व्यावहारिक रूप से माइक्रोफैराड (µF) या पिकोफैराड (pF) प्रयुक्त होते हैं।",
            "Capacitance C = Q/V has the SI unit Farad (F = 1 C/V), named after Michael Faraday. Typical capacitors range in microfarads (µF) and picofarads (pF).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m4_q2", "sci_3",
            "स्वप्रेरकत्व (Self-Inductance) और अन्योन्य प्रेरकत्व (Mutual Inductance) का SI मात्रक क्या है?",
            "What is the SI unit of Inductance (Self and Mutual Inductance)?",
            listOf("टेस्ला", "हेनरी (Henry - H)", "फैराड", "एम्पीयर-टर्न"),
            listOf("Tesla", "Henry (H = Volt·second / Ampere)", "Farad", "Ampere-turn"),
            1,
            "प्रेरकत्व (L) का SI मात्रक हेनरी (H = V·s/A या Wb/A) है, जिसका नाम अमेरिकी वैज्ञानिक जोसेफ हेनरी के नाम पर रखा गया है।",
            "The SI unit of electrical inductance is Henry (H), defined as the inductance generating 1 volt of induced EMF for a current rate of change of 1 ampere per second.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m4_q3", "sci_3",
            "तड़ित चालक (Lightning Conductor), जो ऊंची इमारतों को आकाशीय बिजली से बचाता है, किसका बना होता है?",
            "Lightning Conductors installed atop tall buildings to safely ground lightning strikes are made of which highly conductive metal?",
            listOf("लोहा", "तांबा (Copper)", "एल्यूमीनियम", "सीसा"),
            listOf("Iron", "Copper (High electrical conductivity and corrosion resistance)", "Aluminium", "Lead"),
            1,
            "बेंजामिन फ्रैंकलिन द्वारा आविष्कृत तड़ित चालक तांबे (Copper) की मोटी पट्टी और नुकीले सिरों का बना होता है, जो आकाशीय बिजली के विशाल आवेश को कम प्रतिरोध से सीधे जमीन (Earth) में भेज देता है।",
            "Invented by Benjamin Franklin, a lightning rod uses high-conductivity copper pointed rods connected to thick copper ground cables to channel atmospheric discharge harmlessly into the earth.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m4_q4", "sci_3",
            "भारत में घरेलू प्रत्यावर्ती धारा (Domestic AC Mains) की मानक वोल्टता और आवृत्ति (Frequency) कितनी होती है?",
            "What is the standard Voltage and Frequency of domestic AC electricity in India?",
            listOf("110 V, 60 Hz", "220 V (या 230 V), 50 Hz", "440 V, 50 Hz", "220 V, 100 Hz"),
            listOf("110 V, 60 Hz", "220 V (or 230 V RMS), 50 Hz", "440 V, 50 Hz", "220 V, 100 Hz"),
            1,
            "भारत और अधिकांश राष्ट्रों में मानक घरेलू आपूर्ति 220-230V AC और 50 Hz आवृत्ति (प्रति सेकंड 50 चक्र) होती है। अमेरिका और जापान में यह 110-120V और 60 Hz होती है।",
            "Indian domestic single-phase grid supplies 220-230 V RMS at 50 Hz AC. USA operates at 120 V at 60 Hz.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m4_q5", "sci_3",
            "गैल्वेनोमीटर (Galvanometer) को अमीटर (Ammeter) में बदलने के लिए क्या किया जाता है?",
            "To convert a sensitive moving-coil Galvanometer into an Ammeter, what modification is made?",
            listOf("श्रेणीक्रम में उच्च प्रतिरोध जोड़ना", "समानांतर क्रम में निम्न प्रतिरोध (Shunt) जोड़ना", "श्रेणीक्रम में निम्न प्रतिरोध जोड़ना", "समानांतर क्रम में उच्च प्रतिरोध जोड़ना"),
            listOf("Connecting high resistance in series", "Connecting a very Low Resistance (Shunt) in Parallel", "Connecting low resistance in series", "Connecting high resistance in parallel"),
            1,
            "गैल्वेनोमीटर के समानांतर में एक बहुत कम प्रतिरोध (शंट - Shunt) जोड़ने से अधिकांश धारा शंट से निकल जाती है और यह अमीटर बन जाता है। वोल्टमीटर बनाने हेतु श्रेणीक्रम में उच्च प्रतिरोध जोड़ा जाता है।",
            "A galvanometer is converted into an ammeter by connecting a low-resistance shunt resistor in parallel, bypassing excessive current and minimizing insertion impedance.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m4_q6", "sci_3",
            "एक आदर्श वोल्टमीटर (Ideal Voltmeter) और एक आदर्श अमीटर (Ideal Ammeter) का आंतरिक प्रतिरोध कितना होना चाहिए?",
            "What is the internal resistance of an Ideal Voltmeter and an Ideal Ammeter respectively?",
            listOf("वोल्टमीटर: शून्य, अमीटर: अनंत", "वोल्टमीटर: अनंत (Infinity), अमीटर: शून्य (Zero)", "दोनों का शून्य", "दोनों का अनंत"),
            listOf("Voltmeter: Zero, Ammeter: Infinite", "Voltmeter: Infinite (R_v = ∞), Ammeter: Zero (R_a = 0)", "Both Zero", "Both Infinite"),
            1,
            "आदर्श वोल्टमीटर परिपथ से कोई धारा न खींचे इसलिए इसका प्रतिरोध अनंत (∞) होना चाहिए। आदर्श अमीटर परिपथ में कोई वोल्टेज ड्रॉप न करे इसलिए इसका प्रतिरोध शून्य (0) होना चाहिए।",
            "An ideal voltmeter draws zero current (infinite resistance, R = ∞); an ideal ammeter causes zero voltage drop (zero resistance, R = 0).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m4_q7", "sci_3",
            "नाभिकीय विखंडन में यूरेनियम के किस समस्थानिक का उपयोग मुख्य परमाणु ईंधन के रूप में किया जाता है?",
            "Which isotope of Uranium is fissile with thermal neutrons and used as standard nuclear reactor fuel?",
            listOf("यूरेनियम-238 (U-238)", "यूरेनियम-235 (U-235)", "यूरेनियम-233", "यूरेनियम-234"),
            listOf("Uranium-238", "Uranium-235 (U-235, ~0.7% in natural uranium)", "Uranium-233", "Uranium-234"),
            1,
            "प्राकृतिक यूरेनियम में केवल 0.7% विखंडनीय U-235 और 99.3% गैर-विखंडनीय U-238 होता है। प्रकाश जल रिएक्टरों में 3-5% तक 'संवर्धित यूरेनियम' (Enriched Uranium) का उपयोग किया जाता है।",
            "Uranium-235 is the only naturally occurring fissile nuclide (~0.7% natural abundance). Civil power reactors use enriched uranium fuel containing 3-5% U-235.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m4_q8", "sci_3",
            "थोरियम (Thorium) का मुख्य अयस्क कौन-सा है जो भारत के केरल के तटीय बालू में प्रचुर मात्रा में पाया जाता है?",
            "What is the principal mineral ore of Thorium found abundantly in the monazite beach sands of Kerala, India?",
            listOf("पिचब्लेंड (Pitchblende)", "मोनाजाइट (Monazite)", "हेमेटाइट", "बॉक्साइट"),
            listOf("Pitchblende", "Monazite (Monazite Sand)", "Hematite", "Bauxite"),
            1,
            "मोनाजाइट रेत में लगभग 8-10% थोरियम ऑक्साइड (ThO₂) होता है। भारत के पास विश्व के थोरियम भंडारों का लगभग 25% हिस्सा है।",
            "Monazite sand deposits along the Kerala and Odisha coasts constitute the world's richest reserves of thorium phosphate minerals.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m4_q9", "sci_3",
            "नाभिकीय संलयन रिएक्टर 'आईटीईआर' (ITER - International Thermonuclear Experimental Reactor) कहाँ स्थापित किया जा रहा है?",
            "The world's largest experimental magnetic confinement fusion reactor, ITER (Tokamak), is currently being constructed at:",
            listOf("जिनेवा, स्विट्जरलैंड", "कैडराचे, फ्रांस (Cadarache, Southern France)", "ओक रिज, यूएसए", "टोक्यो, जापान"),
            listOf("Geneva, Switzerland", "Cadarache, Southern France", "Oak Ridge, USA", "Tokyo, Japan"),
            1,
            "ITER 35 देशों (भारत, यूरोपीय संघ, अमेरिका, रूस, चीन, जापान, दक्षिण कोरिया) का संयुक्त मेगा-प्रोजेक्ट है जो फ्रांस में टोकामक (Tokamak) द्वारा 500 MW संलयन ऊर्जा उत्पन्न करने का परीक्षण कर रहा है।",
            "ITER is a 35-nation collaboration constructing the world's largest Tokamak magnetic fusion device at Cadarache in southern France to demonstrate net energy gain (Q ≥ 10).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m4_q10", "sci_3",
            "रेडियोधर्मी क्षय (Radioactive Decay) में किसी तत्व की 'अर्ध-आयु' (Half-life - T_1/2) और क्षय नियतांक (λ) में क्या संबंध है?",
            "What is the mathematical relationship between the Half-Life (T_1/2) and radioactive decay constant (λ)?",
            listOf("T_1/2 = 0.693 / λ", "T_1/2 = λ / 0.693", "T_1/2 = 1.44 λ", "T_1/2 = 0.693 × λ"),
            listOf("T_1/2 = 0.693 / λ (ln 2 / λ)", "T_1/2 = λ / 0.693", "T_1/2 = 1.44 λ", "T_1/2 = 0.693 × λ"),
            0,
            "अर्ध-आयु वह समय है जिसमें रेडियोधर्मी परमाणुओं की संख्या घटकर प्रारंभिक मान की आधी रह जाती है (T_1/2 = ln 2 / λ = 0.693 / λ)। औसत आयु τ = 1/λ = 1.44 T_1/2 होती है।",
            "Radioactive half-life is the duration required for half of the initial nuclei to disintegrate: T_1/2 = ln(2)/λ ≈ 0.693/λ. Mean lifetime τ = 1/λ = 1.443 T_1/2.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m4_q11", "sci_3",
            "रेडियोधर्मिता मापन की पारंपरिक इकाई 'क्यूरी' (Curie - Ci) कितने बेकेरल (विघटन प्रति सेकंड) के बराबर होती है?",
            "One traditional unit of radioactivity, 1 Curie (1 Ci), equals how many Becquerels (decays per second)?",
            listOf("10⁶ Bq", "3.7 × 10¹⁰ Bq (विघटन/सेकंड)", "1 Bq", "3.7 × 10⁶ Bq"),
            listOf("10⁶ Bq", "3.7 × 10¹⁰ Bq (Disintegrations/second)", "1 Bq", "3.7 × 10⁶ Bq"),
            1,
            "1 क्यूरी (Ci) = 1 ग्राम शुद्ध रेडियम-226 की रेडियोधर्मी सक्रियता = 3.7 × 10¹⁰ विघटन प्रति सेकंड (Bq)। 1 रदरफोर्ड = 10⁶ Bq।",
            "1 Curie (Ci) represents the decay rate of 1 gram of Radium-226, defined exactly as 3.7 × 10¹⁰ Becquerels (nuclear disintegrations per second).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m4_q12", "sci_3",
            "भारत का पहला परमाणु परीक्षण 'ऑपरेशन स्माइलिंग बुद्धा' (Pokhran-I) पोखरण में कब किया गया था?",
            "India conducted its first peaceful underground nuclear detonation 'Operation Smiling Buddha' (Pokhran-I) on:",
            listOf("15 अगस्त 1947", "18 मई 1974 (18 May 1974)", "11 मई 1998", "26 जनवरी 1950"),
            listOf("15 August 1947", "18 May 1974", "11 May 1998", "26 January 1950"),
            1,
            "18 मई 1974 को राजस्थान के पोखरण में भारत ने पहला भूमिगत परमाणु परीक्षण सफलतापूर्वक किया। 11 और 13 मई 1998 को पोखरण-II ('ऑपरेशन शक्ति') के तहत 5 परीक्षण किए गए।",
            "On 18 May 1974, India detonated its first underground nuclear test ('Smiling Buddha') at Pokhran, Rajasthan. Operation Shakti (Pokhran-II) followed in May 1998.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m4_q13", "sci_3",
            "इसरो का ध्रुवीय उपग्रह प्रक्षेपण यान (PSLV) कितने चरणों वाला रॉकेट है और इसमें कौन-से ईंधन का उपयोग होता है?",
            "ISRO's workhorse launch vehicle PSLV (Polar Satellite Launch Vehicle) is a 4-stage rocket featuring alternating propellants as:",
            listOf("केवल ठोस ईंधन", "चार चरण: 1st ठोस, 2nd तरल (विकास इंजन), 3rd ठोस, 4th तरल", "केवल क्रायोजेनिक ईंधन", "केवल तरल ईंधन"),
            listOf("All solid", "4-Stage: 1st Solid (HTPB), 2nd Liquid (Vikas Engine), 3rd Solid, 4th Liquid (UDMH/NTO)", "All cryogenic", "All liquid"),
            1,
            "PSLV में 4 चरण होते हैं: पहला ठोस (HTPB), दूसरा तरल (विकास इंजन - UDMH + N₂O₄), तीसरा ठोस (HES-3), और चौथा चरण तरल (MMH + MON) होता है।",
            "PSLV is a four-stage vehicle using solid rocket motors in the 1st and 3rd stages, and hypergolic liquid propulsion (including the indigenous Vikas engine) in the 2nd and 4th stages.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m4_q14", "sci_3",
            "नाविक (NavIC - Navigation with Indian Constellation) भारत की स्वतंत्र क्षेत्रीय उपग्रह नेविगेशन प्रणाली है। इसमें कितने उपग्रहों का समूह कार्य करता है?",
            "India's regional satellite navigation system NavIC (IRNSS) operates with an orbital constellation of how many dedicated operational satellites?",
            listOf("3 उपग्रह", "7 उपग्रह (3 भू-स्थिर GEO + 4 भू-तुल्यकालिक GSO)", "24 उपग्रह", "12 उपग्रह"),
            listOf("3 satellites", "7 satellites (3 Geostationary GEO + 4 Geosynchronous GSO)", "24 satellites", "12 satellites"),
            1,
            "NavIC (IRNSS) में 7 सक्रिय उपग्रह हैं जो भारत और उसकी सीमाओं से 1500 किमी के दायरे में 5 मीटर से बेहतर सटीक स्थिति निर्धारण (PNT) सेवा प्रदान करते हैं।",
            "NavIC provides standalone Positioning, Navigation, and Timing over India and 1,500 km beyond using a constellation of 7 satellites (3 in GEO and 4 in inclined GSO).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m4_q15", "sci_3",
            "परमाणु घड़ी (Atomic Clock), जो जीपीएस उपग्रहों और अंतर्राष्ट्रीय मानक समय (UTC) के लिए प्रयुक्त होती है, किस तत्व के परमाणुओं के कंपन पर आधारित है?",
            "Atomic Clocks providing global UTC time and GPS positioning precision are standardized on the hyperfine transition frequency of which atom?",
            listOf("हाइड्रोजन", "सीजियम-133 (Caesium-133: 9,192,631,770 Hz)", "सोडियम", "प्लूटोनियम"),
            listOf("Hydrogen", "Caesium-133 (9,192,631,770 oscillations per SI second)", "Sodium", "Plutonium"),
            1,
            "SI प्रणाली में 1 सेकंड को सीजियम-133 परमाणु के मूल स्तर के दो अतिसूक्ष्म स्तरों के बीच संक्रमण के अनुरूप विकिरण के 9,192,631,770 आवर्तकालों के रूप में परिभाषित किया गया है।",
            "The SI second is defined by taking the fixed numerical value of the Caesium-133 ground-state hyperfine transition frequency (Δν_Cs = 9,192,631,770 Hz).",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 5 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_3_m5_q1", "sci_3",
            "किरचॉफ का प्रथम नियम (धारा नियम / KCL) किस संरक्षण सिद्धांत पर आधारित है?",
            "Kirchhoff's Current Law (KCL / Junction Rule: ΣI = 0) is based on the conservation of:",
            listOf("ऊर्जा (Energy)", "विद्युत आवेश (Electric Charge)", "संवेग (Momentum)", "द्रव्यमान (Mass)"),
            listOf("Energy", "Electric Charge", "Momentum", "Mass"),
            1,
            "किरचॉफ का संधि नियम (KCL) कहता है कि किसी संधि पर मिलने वाली सभी धाराओं का बीजगणितीय योग शून्य होता है। यह आवेश संरक्षण (Conservation of Charge) का नियम है। द्वितीय नियम (KVL) ऊर्जा संरक्षण पर आधारित है।",
            "Kirchhoff's Current Law (ΣI_in = ΣI_out at any electrical node) asserts that electric charge cannot accumulate at a junction, obeying Conservation of Electric Charge. KVL obeys Conservation of Energy.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m5_q2", "sci_3",
            "व्हीटस्टोन ब्रिज (Wheatstone Bridge) का उपयोग किसका सटीक मान ज्ञात करने के लिए किया जाता है?",
            "A Wheatstone Bridge circuit is utilized for the precise measurement of:",
            listOf("विद्युत धारा", "अज्ञात विद्युत प्रतिरोध (Unknown Electrical Resistance: P/Q = R/S)", "विद्युत वाहक बल", "धारिता"),
            listOf("Current", "Unknown Electrical Resistance (P/Q = R/S under null deflection)", "EMF", "Capacitance"),
            1,
            "व्हीटस्टोन ब्रिज में जब गैल्वेनोमीटर में शून्य विक्षेप (Null deflection) होता है, तो P/Q = R/S के सूत्र द्वारा किसी अज्ञात प्रतिरोध का अत्यंत सटीक मान मापा जाता है।",
            "A Wheatstone bridge determines an unknown electrical resistance by balancing two legs of a bridge circuit against a calibrated variable standard resistor (P/Q = R/S).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m5_q3", "sci_3",
            "विभवमापी (Potentiometer) को वोल्टमीटर से श्रेष्ठ क्यों माना जाता है?",
            "Why is a Potentiometer considered superior to a standard Voltmeter for measuring cell EMF?",
            listOf("यह सस्ता है", "संतुलन की स्थिति में यह परिपथ से कोई विद्युत धारा नहीं लेता (अनंत प्रतिरोध / शून्य विक्षेप विधि)", "यह छोटा है", "यह तेज कार्य करता है"),
            listOf("It is cheaper", "At null balance condition, it draws zero current from the source under test (infinite effective resistance)", "Compact size", "Faster reading"),
            1,
            "विभवमापी शून्य-विक्षेप (Null method) पर कार्य करता है। संतुलन पर यह सेल से कोई धारा नहीं खींचता, जिससे सेल के आंतरिक प्रतिरोध के कारण कोई वोल्टेज ड्रॉप नहीं होता और वास्तविक EMF मापा जाता है।",
            "Operating on null deflection, a potentiometer measures cell EMF without drawing load current, functioning as a theoretically ideal voltmeter with infinite input impedance.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m5_q4", "sci_3",
            "ट्रांजिस्टर (BJT Transistor) का मुख्य कार्य क्या होता है?",
            "What are the two primary circuit functions of a Bipolar Junction Transistor (BJT)?",
            listOf("दिष्टकरण और ट्रांसफार्मेशन", "प्रवर्धन (Amplification) और स्विचिंग (Switching)", "ऊर्जा संचयन", "केवल शीतलन"),
            listOf("Rectification and transformation", "Signal Amplification and Electronic Switching", "Energy storage", "Cooling only"),
            1,
            "1947 में बार्डीन, ब्रैटन और शॉकले द्वारा आविष्कृत ट्रांजिस्टर का उपयोग कमजोर विद्युत संकेतों को प्रवर्धित (Amplify) करने तथा डिजिटल कंप्यूटरों में बाइनरी स्विच (On/Off) के रूप में किया जाता है।",
            "Invented at Bell Labs in 1947, transistors serve as linear signal amplifiers and ultrafast digital electronic switches across microprocessors.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m5_q5", "sci_3",
            "जेनर डायोड (Zener Diode) का उपयोग परिपथ में मुख्य रूप से किस उद्देश्य के लिए किया जाता है?",
            "A Zener Diode is specially designed to operate in reverse breakdown region to function as a:",
            listOf("प्रवर्धक", "वोल्टेज नियामक / स्थिरक (Voltage Regulator)", "प्रकाश उत्सर्जक", "दोलक"),
            listOf("Amplifier", "Voltage Regulator / Stabilizer (Constant breakdown voltage V_z)", "Light emitter", "Oscillator"),
            1,
            "जेनर डायोड अत्यधिक डोपित P-N संधि डायोड है जो उत्क्रम भंजन क्षेत्र (Reverse Breakdown Region) में धारा में भारी परिवर्तन के बावजूद अपने सिरों पर नियत वोल्टेज (V_z) बनाए रखता है।",
            "A heavily doped Zener diode maintains a constant voltage drop across its terminals in reverse breakdown over a wide current range, acting as a stable Voltage Regulator.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m5_q6", "sci_3",
            "इंटीग्रेटेड सर्किट (IC चिप / Microchip) का आविष्कार 1958 में किसने किया था जिसके लिए उन्हें नोबेल पुरस्कार मिला?",
            "Who invented the Silicon Integrated Circuit (IC Microchip) in 1958 at Texas Instruments?",
            listOf("बिल गेट्स", "जैक किल्बी (Jack Kilby)", "स्टीव जॉब्स", "चार्ल्स बैबेज"),
            listOf("Bill Gates", "Jack Kilby (with Robert Noyce)", "Steve Jobs", "Charles Babbage"),
            1,
            "जैक किल्बी (और रॉबर्ट नॉयस) ने एक ही अर्धचालक सिलिकॉन चिप पर ट्रांजिस्टर, प्रतिरोधक और संधारित्र को एकीकृत करके आधुनिक माइक्रोइलेक्ट्रॉनिक्स क्रांति की शुरुआत की।",
            "Jack Kilby invented the monolithic integrated circuit (IC) in 1958, integrating multiple electronic components onto a single germanium/silicon substrate, winning the 2000 Nobel Prize in Physics.",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m5_q7", "sci_3",
            "नाभिकीय संलयन (Nuclear Fusion) कराने के लिए न्यूनतम तापमान कितना होना आवश्यक होता है?",
            "What order of minimum temperature is required to overcome electrostatic Coulomb repulsion and initiate Thermonuclear Fusion?",
            listOf("1000 °C", "10⁴ K", "10⁷ से 10⁸ K (करोड़ों डिग्री केल्विन)", "0 K"),
            listOf("1000 °C", "10⁴ K", "10⁷ to 10⁸ Kelvin (tens of millions of degrees)", "0 K"),
            2,
            "धनावेशित प्रोटॉनों के बीच अत्यधिक कूलॉम प्रतिकर्षण बल को पार करने के लिए नाभिकों की गतिज ऊर्जा इतनी अधिक होनी चाहिए कि वे 10⁻¹⁵ मीटर की दूरी पर आ सकें, जिसके लिए 10 करोड़ केल्विन तापमान चाहिए।",
            "Overcoming Coulomb electrostatic repulsion between positively charged protons requires thermonuclear plasma temperatures exceeding 100 million Kelvin (10⁸ K).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m5_q8", "sci_3",
            "नाभिकीय घनत्व (Nuclear Density) का मान सभी तत्वों के नाभिकों के लिए लगभग कितना होता है?",
            "What is the approximate order of Nuclear Density for all atomic nuclei (independent of mass number A)?",
            listOf("10³ kg/m³", "10⁷ kg/m³", "2.3 × 10¹⁷ kg/m³ (अत्यधिक सघन)", "10²⁵ kg/m³"),
            listOf("10³ kg/m³", "10⁷ kg/m³", "2.3 × 10¹⁷ kg/m³ (extremely dense)", "10²⁵ kg/m³"),
            2,
            "नाभिक की त्रिज्या R = R₀ A^(1/3) होती है, जिससे आयतन V ∝ A होता है। अतः घनत्व = द्रव्यमान/आयतन = A / (constant × A) = नियतांक (~2.3 × 10¹⁷ kg/m³)।",
            "Since nuclear radius scales as R = R₀·A^(1/3), nuclear volume is proportional to mass number A. Thus, nuclear density is constant across all elements at roughly 2.3 × 10¹⁷ kg/m³.",
            "Hard"
        ),
        makeScienceQ(
            "sci_3_m5_q9", "sci_3",
            "प्रकृति में ज्ञात चार मूलभूत बलों में सबसे प्रबल और सबसे दुर्बल बल क्रमशः कौन-से हैं?",
            "Among the four fundamental forces of nature, which are the Strongest and Weakest forces respectively?",
            listOf("प्रबल: विद्युत चुम्बकीय, दुर्बल: गुरुत्वाकर्षण", "प्रबल: प्रबल नाभिकीय बल (Strong Nuclear), दुर्बल: गुरुत्वाकर्षण बल (Gravity)", "प्रबल: दुर्बल नाभिकीय, दुर्बल: स्थिर वैद्युत", "सभी समान हैं"),
            listOf("Strongest: Electromagnetic, Weakest: Gravity", "Strongest: Strong Nuclear Force, Weakest: Gravitational Force", "Strongest: Weak nuclear, Weakest: Electrostatic", "All equal"),
            1,
            "प्रबल नाभिकीय बल (सापेक्ष सामर्थ्य 1) प्रोटॉनों और न्यूट्रॉनों को नाभिक में बांधे रखता है। गुरुत्वाकर्षण बल (सापेक्ष सामर्थ्य ~10⁻³⁸) ब्रह्मांड का सबसे दुर्बल मूलभूत बल है।",
            "The Strong Nuclear force is the most potent fundamental force (~100× electromagnetic), while Gravitational force is by far the weakest (~10⁻³⁸ relative strength).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m5_q10", "sci_3",
            "द्रव्यमान क्षति (Mass Defect - Δm) और नाभिक की बंधन ऊर्जा (Nuclear Binding Energy - BE) में क्या संबंध है?",
            "Nuclear Binding Energy (BE), the energy required to disassemble a nucleus into constituent nucleons, is related to Mass Defect (Δm) by:",
            listOf("BE = Δm × c²", "BE = Δm / c²", "BE = Δm × c", "BE = 1/2 Δm c²"),
            listOf("BE = Δm × c² (or BE = Δm [in amu] × 931.5 MeV)", "BE = Δm / c²", "BE = Δm × c", "BE = 1/2 Δm c²"),
            0,
            "जब स्वतंत्र न्यूक्लिऑन मिलकर नाभिक बनाते हैं, तो कुल द्रव्यमान घट जाता है (द्रव्यमान क्षति Δm)। यह लुप्त द्रव्यमान बंधन ऊर्जा BE = Δm·c² (1 amu ≈ 931.5 MeV) के रूप में मुक्त होता है।",
            "Mass Defect Δm = (Z·m_p + N·m_n) - M_nucleus. This missing mass is released as Binding Energy BE = Δm·c² (1 amu mass loss = 931.5 MeV).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m5_q11", "sci_3",
            "प्रति न्यूक्लिऑन बंधन ऊर्जा (Binding Energy per Nucleon) किस तत्व के नाभिक के लिए सर्वाधिक (~8.8 MeV) और सबसे स्थिर होती है?",
            "Binding Energy per Nucleon reaches its maximum peak (~8.75 MeV/nucleon), making which nuclide the most tightly bound and stable in the universe?",
            listOf("हीलियम-4", "लोहा-56 (Iron-56 / Fe-56)", "यूरेनियम-238", "कार्बन-12"),
            listOf("Helium-4", "Iron-56 (Fe-56 / Nickel-62)", "Uranium-238", "Carbon-12"),
            1,
            "आयरन-56 (Fe-56) का नाभिक ब्रह्मांड में सबसे अधिक स्थायी होता है। लोहे से हल्के तत्व संलयन (Fusion) द्वारा और लोहे से भारी तत्व विखंडन (Fission) द्वारा ऊर्जा मुक्त करते हैं।",
            "Iron-56 (and Ni-62) sits at the peak of the nuclear binding energy curve (~8.79 MeV/nucleon); lighter nuclei undergo exothermic fusion while heavier elements undergo exothermic fission.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m5_q12", "sci_3",
            "क्वांटम यांत्रिकी में 'हाइजेनबर्ग का अनिश्चितता सिद्धांत' (Heisenberg's Uncertainty Principle) क्या व्यक्त करता है?",
            "Heisenberg's Uncertainty Principle states that it is fundamentally impossible to simultaneously measure precisely:",
            listOf("आवेश और द्रव्यमान", "किसी कण की स्थिति (Δx) और संवेग (Δp) (Δx · Δp ≥ h / 4π)", "तापमान और दाब", "ऊर्जा और घनत्व"),
            listOf("Charge and mass", "Position (Δx) and Linear Momentum (Δp) of a particle simultaneously (Δx · Δp ≥ ℏ/2)", "Temperature and pressure", "Energy and density"),
            1,
            "वर्नर हाइजेनबर्ग के अनुसार किसी सूक्ष्म कण की स्थिति (x) और संवेग (p) का एक साथ शत-प्रतिशत यथार्थता से मापन असंभव है: Δx · Δp ≥ h / (4π)।",
            "Heisenberg's principle establishes a fundamental limit on quantum measurement: the product of uncertainties in position and momentum satisfies Δx · Δp ≥ h / 4π (or ℏ/2).",
            "Easy"
        ),
        makeScienceQ(
            "sci_3_m5_q13", "sci_3",
            "डी ब्रोग्ली की द्रव्य-तरंग परिकल्पना (de Broglie Matter Waves) के अनुसार किसी गतिशील कण की तरंगदैर्घ्य (λ) क्या होती है?",
            "According to de Broglie's Matter-Wave hypothesis, the wavelength λ of a particle of mass 'm' moving with velocity 'v' is:",
            listOf("λ = h / mv (λ = h / p)", "λ = mv / h", "λ = h × mv", "λ = h / 2m"),
            listOf("λ = h / mv (λ = h / p)", "λ = mv / h", "λ = h × mv", "λ = h / 2m"),
            0,
            "लुई डी ब्रोग्ली ने बताया कि गतिशील द्रव्य कण तरंग की भांति भी व्यवहार करते हैं, जिसकी तरंगदैर्घ्य λ = h / p = h / (mv) होती है। इसका उपयोग इलेक्ट्रॉन सूक्ष्मदर्शी में किया जाता है।",
            "Louis de Broglie proposed that all moving matter exhibits wave-particle duality with wavelength λ = h/p = h/(mv), forming the foundation of Transmission Electron Microscopy (TEM).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m5_q14", "sci_3",
            "इलेक्ट्रॉन सूक्ष्मदर्शी (Electron Microscope) की आवर्धन क्षमता साधारण प्रकाशिक सूक्ष्मदर्शी से हजारों गुना अधिक क्यों होती है?",
            "Why is the resolving power and magnification of an Electron Microscope thousands of times higher than an Optical Microscope?",
            listOf("इलेक्ट्रॉनों का वेग कम होता है", "तीव्रगामी इलेक्ट्रॉनों की डी ब्रोग्ली तरंगदैर्घ्य दृश्य प्रकाश की तुलना में अत्यंत सूक्ष्म (~100,000 गुना छोटी) होती है", "इलेक्ट्रॉन भारी होते हैं", "कांच का उपयोग नहीं होता"),
            listOf("Electrons move slowly", "de Broglie wavelength of relativistic electrons is ~100,000 times shorter than visible light photons", "Electrons are heavy", "No glass lenses used"),
            1,
            "सूक्ष्मदर्शी की विभेदन सीमा तरंगदैर्घ्य के समानुपाती होती है (d = 0.61 λ / NA)। इलेक्ट्रॉनों की तरंगदैर्घ्य प्रकाश (~500 nm) की तुलना में पिकोमीटर (< 0.005 nm) में होती है, जिससे नैनो-स्तर का स्पष्ट चित्रण होता है।",
            "Microscopic resolution is diffraction-limited (Rayleigh criterion ∝ λ). Accelerated electron beams have sub-angstrom wavelengths (λ ~ 0.004 nm), enabling atomic-scale resolution.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_3_m5_q15", "sci_3",
            "तारों और सूर्य के कोर में पदार्थ की कौन-सी चौथी अवस्था (Fourth State of Matter) पाई जाती है जिसमें अत्यधिक तापमान पर गैस के परमाणु आयनित होकर आयनों और मुक्त इलेक्ट्रॉनों का मिश्रण बन जाते हैं?",
            "Which Fourth State of Matter, consisting of an ionized gas of positive ions and free electrons, comprises 99% of the visible universe and stellar cores?",
            listOf("ठोस", "प्लाज्मा (Plasma State)", "बोस-आइंस्टीन संघनन (BEC)", "अति-तरल"),
            listOf("Solid", "Plasma State", "Bose-Einstein Condensate (BEC)", "Superfluid"),
            1,
            "प्लाज्मा अत्यधिक ऊर्जावान और आयनित गैस की अवस्था है जिसमें इलेक्ट्रॉन परमाणुओं से अलग होकर स्वतंत्र रूप से घूमते हैं। सूर्य, तारे, तड़ित बिजली, और नियॉन बल्बों में प्लाज्मा अवस्था पाई जाती है।",
            "Plasma is a quasineutral ionized gas containing high densities of free electrons and positive cations at extreme temperatures, conducting electricity and generating magnetic fields.",
            "Easy"
        )
    )
}
