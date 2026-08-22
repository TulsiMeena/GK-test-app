package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic8ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6: Emerging Zoonoses, Pandemics & AMR (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m6_q1", "sci_8",
            "कर्नाटक के पश्चिमी घाटों (शिवमोग्गा जिले) में बंदरों और टिक्स (Ticks) से फैलने वाला 'मंकी फीवर' (Monkey Fever) का आधिकारिक वैज्ञानिक नाम क्या है?",
            "What is the official medical name of the tick-borne viral hemorrhagic fever endemic to the Western Ghats of Karnataka, commonly termed 'Monkey Fever'?",
            listOf("क्यासानूर फॉरेस्ट डिजीज (Kyasanur Forest Disease - KFD)", "निपाह वायरस", "कांगो फीवर", "चांदीपुरा वायरस"),
            listOf("Kyasanur Forest Disease (KFD - Flaviviridae transmitted by Haemaphysalis spinigera ticks)", "Nipah virus encephalitis", "Crimean-Congo Hemorrhagic Fever", "Chandipura Vesiculovirus"),
            0,
            "KFD की पहचान 1957 में क्यासानूर के जंगलों में बंदरों की मौत के बाद हुई थी। यह 'हेमाफाइसैलिस' प्रजाति के टिक्स के काटने से फैलता है। भारत में इसके लिए निष्क्रिय टीका उपलब्ध है।",
            "Kyasanur Forest Disease is an arboviral zoonosis caused by KFD virus (Flavivirus); black-faced langurs and bonnet macaques act as sentinels and amplifying hosts.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q2", "sci_8",
            "रोगाणुरोधी प्रतिरोध (Antimicrobial Resistance - AMR / सुपरबग) से निपटने हेतु भारत सरकार द्वारा शुरू की गई 'रेड लाइन अभियान' (Red Line Campaign) का क्या उद्देश्य है?",
            "What is the primary public health objective of the Ministry of Health's 'Red Line Campaign' printed on pharmaceutical medicine packaging?",
            listOf("लाल लकीर (Red Vertical Line) वाली एंटीबायोटिक दवाओं को बिना डॉक्टर के वैध पर्चे (Prescription) के न खरीदना/बेचना", "दवा की एक्सपायरी डेट बताना", "दवा के मूल्य पर छूट देना", "दवा के शाकाहारी होने का संकेत"),
            listOf("Restricting over-the-counter sale and non-prescribed misuse of Schedule H and H1 antibiotics marked with a vertical red line to prevent AMR", "Marking medicine expiry date", "Price discount indicator", "Vegetarian seal"),
            0,
            "एंटीबायोटिक दवाओं के अत्यधिक व अनुचित उपयोग से बैक्टीरिया में प्रतिरोधी क्षमता (Superbugs जैसे MRSA, NDM-1) विकसित हो जाती है। रेड लाइन अभियान दवाओं के बिना पर्चे उपयोग को रोकता है।",
            "The Red Line campaign informs consumers that medicines bearing a vertical red stripe on their strip packaging are prescription-only antibiotics that must not be taken without registered medical advice.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m6_q3", "sci_8",
            "जीवाणुओं में एंटीबायोटिक प्रतिरोधी जीन 'एनडीएम-1' (NDM-1 Superbug Gene) का पूर्ण रूप क्या है?",
            "What does the acronym NDM-1 stand for regarding the carbapenemase enzyme gene that confers broad multidrug antibiotic resistance to Enterobacteriaceae?",
            listOf("नई दिल्ली मेटालो-बीटा-लैक्टामेज-1 (New Delhi Metallo-beta-lactamase-1)", "नेशनल ड्रग मिशन-1", "न्यूट्रल डिग्रेडिंग मॉलिक्यूल", "न्यूक्लियर डिफेंस मैकेनिज्म"),
            listOf("New Delhi Metallo-beta-lactamase-1 (Zinc-dependent carbapenemase hydrolyzing carbapenems, penicillins, and cephalosporins)", "National Drug Mission-1", "Neutral Degrading Molecule-1", "Nuclear Defense Mechanism-1"),
            0,
            "NDM-1 एक बैक्टीरियल एंजाइम है जो लगभग सभी शक्तिशाली एंटीबायोटिक्स (कार्बापेनेम्स सहित) को निष्क्रिय कर देता है। प्लास्मिड द्वारा यह जीन अन्य जीवाणुओं में तेजी से फैलता है।",
            "NDM-1 is a plasmid-borne carbapenemase capable of hydrolyzing beta-lactam antibiotics; its mobile horizontal gene transfer across bacterial species poses a major global AMR challenge.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q4", "sci_8",
            "मंकीपॉक्स (Mpox / मंकीपॉक्स वायरस) किस वायरस परिवार से संबंधित है और इसका चेचक (Smallpox) से क्या संबंध है?",
            "Mpox (Monkeypox), which causes fever, painful lymphadenopathy, and vesicular pustular lesions, belongs to which viral genus?",
            listOf("ऑर्थोपॉक्सवायरस (Orthopoxvirus - उसी जीनस का जिससे चेचक वायरस वैरियोला संबंधित है)", "रेट्रोवायरस", "फ्लेविवायरस", "कोरोनावायरस"),
            listOf("Orthopoxvirus (Poxviridae family, antigenically related to Variola and Vaccinia viruses)", "Retrovirus", "Flavivirus", "Coronavirus"),
            0,
            "एमपॉक्स (Mpox) एक डीएनए वायरस है जो ऑर्थोपॉक्सवायरस जीनस से संबंधित है। चेचक का टीका (Smallpox vaccine) एमपॉक्स के खिलाफ लगभग 85% सुरक्षा प्रदान करता है।",
            "Mpox is a zoonotic orthopoxvirus characterized by prominent submandibular and inguinal lymphadenopathy that clinically distinguishes it from smallpox and chickenpox.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q5", "sci_8",
            "गुजरात और महाराष्ट्र में बच्चों में एन्सेफलाइटिस (मस्तिष्क ज्वर) फैलाने वाला 'चांदीपुरा वायरस' (Chandipura Virus) किस कीट के काटने से फैलता है?",
            "Chandipura vesiculovirus (which causes rapid, high-mortality febrile encephalitis in young children) is vectorially transmitted by:",
            listOf("सैंडफ्लाई / बालू मक्खी (Phlebotomus Sandfly)", "घरेलू मक्खी", "मधुमक्खी", "ततैया"),
            listOf("Sandflies (Phlebotomus sandfly vector)", "Musca domestica (Housefly)", "Honeybee", "Wasp"),
            0,
            "चांदीपुरा वायरस (Rhabdoviridae) सैंडफ्लाई के काटने से फैलता है। यह 14 वर्ष से कम उम्र के बच्चों में अचानक तेज बुखार, उल्टी, कोमा और 24-48 घंटों में मृत्यु का कारण बन सकता है।",
            "Chandipura virus is an RNA vesiculovirus causing rapid neurological damage through microglial activation and cytokine storm in infected pediatric brain tissues.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q6", "sci_8",
            "जापानी एन्सेफलाइटिस (Japanese Encephalitis - JE / दिमागी बुखार) वायरस का मुख्य वाहक कौन-सा मच्छर है?",
            "Japanese Encephalitis, an arboviral zoonotic flavivirus causing severe pediatric acute encephalitis syndrome (AES), is transmitted by which mosquito genus?",
            listOf("क्यूलेक्स मच्छर (Culex tritaeniorhynchus / Culex vishnui)", "एडीज मच्छर", "एनोफेलीज मच्छर", "मंसोनिया"),
            listOf("Culex mosquitoes (Culex tritaeniorhynchus breeding in flooded rice paddies)", "Aedes aegypti", "Anopheles stephensi", "Mansonia annulifera"),
            0,
            "जापानी एन्सेफलाइटिस धान के खेतों में पनपने वाले 'क्यूलेक्स' मच्छरों द्वारा फैलता है। सूअर (Pigs) और बगुले (Ardeid wading birds) इसके एम्पलीफाइंग और प्राकृतिक भंडार होते हैं।",
            "JE virus is maintained in an enzootic cycle between ardeid birds and swine (amplifying hosts) and transmitted to dead-end human hosts via nocturnal Culex tritaeniorhynchus bites.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m6_q7", "sci_8",
            "मध्य पूर्व में ऊंटों (Dromedary Camels) से मनुष्यों में फैलने वाले गंभीर श्वसन कोरोनावायरस संक्रमण को क्या कहा जाता है?",
            "Which severe zoonotic coronavirus infection (with ~35% case fatality rate) spilled over from dromedary camels in the Arabian Peninsula in 2012?",
            listOf("मर्स (MERS-CoV - Middle East Respiratory Syndrome)", "सार्स (SARS-CoV)", "कोविड-19", "स्वाइन फ्लू"),
            listOf("MERS-CoV (Middle East Respiratory Syndrome Coronavirus utilizing DPP4 receptors)", "SARS-CoV-1", "COVID-19", "Swine Influenza H1N1"),
            0,
            "मर्स (MERS-CoV) 2012 में सऊदी अरब में खोजा गया था। इसका संचरण ऊंटों के सीधे संपर्क या उनके कच्चे दूध/मांस के सेवन से होता है। यह फेफड़ों और गुर्दे को तेजी से विफल करता है।",
            "MERS-CoV binds to the dipeptidyl peptidase 4 (DPP4 / CD26) cellular receptor, causing severe lower respiratory pneumonitis and acute renal failure in infected patients.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q8", "sci_8",
            "अत्यधिक संक्रामक बर्ड फ्लू (Avian Influenza) का सबसे खतरनाक वायरस स्ट्रेन कौन-सा है जो मुर्गियों से मनुष्यों में फैल सकता है?",
            "Which Highly Pathogenic Avian Influenza (HPAI) viral strain is responsible for recurrent poultry outbreaks and fatal zoonotic human infections globally?",
            listOf("H5N1 वायरस (H5N1 Avian Influenza)", "H1N1", "H2N2", "H3N2"),
            listOf("H5N1 (Highly Pathogenic Avian Influenza A subtype)", "H1N1 (Swine Flu)", "H2N2 (Asian Flu)", "H3N2 (Hong Kong Flu)"),
            0,
            "H5N1 बर्ड फ्लू पोल्ट्री फार्मों में मुर्गियों और प्रवासी पक्षियों में तेजी से फैलता है। संक्रमित पक्षियों के संपर्क में आने वाले मनुष्यों में मृत्यु दर 50% से अधिक होती है। मुर्गियों को नष्ट (Culling) करना इसका नियंत्रण उपाय है।",
            "H5N1 preferentially binds to alpha-2,3-linked sialic acid receptors abundant in lower human alveolar tissues, precipitating diffuse alveolar damage and severe acute respiratory distress (ARDS).",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m6_q9", "sci_8",
            "इबोला (Ebola) और मारबर्ग (Marburg) वायरस मानव शरीर में किस प्रकार की घातक बीमारी उत्पन्न करते हैं?",
            "Ebola and Marburg filoviruses cause which severe, high-fatality systemic pathological syndrome in humans?",
            listOf("वायरल रक्तस्रावी बुखार (Viral Hemorrhagic Fever - VHF with massive internal/external bleeding and shock)", "मधुमेह", "गठिया", "अस्थमा"),
            listOf("Viral Hemorrhagic Fever (VHF - Endothelial breakdown, disseminated intravascular coagulation, and hypovolemic shock)", "Diabetes", "Osteoarthritis", "Asthma"),
            0,
            "इबोला और मारबर्ग (Filoviridae परिवार) रक्त वाहिकाओं के एंडोथीलियम को नष्ट कर देते हैं, जिससे प्लेटलेट्स खत्म हो जाते हैं और आंतरिक व बाहरी रक्तस्राव (मल्टीपल ऑर्गन फेल्योर) होता है।",
            "Filoviruses trigger massive inflammatory cytokine release, tissue factor expression, and catastrophic microvascular barrier dysfunction, resulting in fatal hemorrhagic shock.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q10", "sci_8",
            "जीका वायरस (Zika Virus) के संक्रमण से गर्भवती महिलाओं के गर्भ में पल रहे भ्रूण में कौन-सा गंभीर जन्मजात सिर का विकार हो जाता है?",
            "Maternal infection with Zika virus during pregnancy crosses the placental barrier to cause which severe congenital neurological birth defect in neonates?",
            listOf("माइक्रोसेफली / छोटा सिर (Microcephaly - abnormally small brain and head circumference)", "डाउन सिंड्रोम", "हाइड्रोसिफैलस", "कूबड़ निकलना"),
            listOf("Microcephaly (Severe cranial hypoplasia and neurodevelopmental arrest caused by neural progenitor cell death)", "Down Syndrome", "Hydrocephalus", "Kyphosis"),
            0,
            "जीका वायरस भ्रूण की तंत्रिका स्टेम कोशिकाओं (Neural Progenitor Cells) पर हमला करके मस्तिष्क के विकास को रोक देता है, जिससे बच्चा असामान्य रूप से छोटे सिर (Microcephaly) के साथ पैदा होता है।",
            "Zika virus targets human radial glial cells and neural progenitor cells via AXL receptors, activating apoptotic cascades and halting cerebral cortical neurogenesis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q11", "sci_8",
            "कृषि और पशुपालन में मवेशियों के विकास को बढ़ाने हेतु किस एंटीबायोटिक के अंधाधुंध उपयोग पर भारत सरकार ने 2019 में पूर्ण प्रतिबंध लगा दिया था?",
            "Which critical last-resort reserve antibiotic, widely abused as a poultry growth promoter, was completely banned by India's MoHFW in 2019 to prevent resistance?",
            listOf("कोलिस्टिन (Colistin)", "पेनिसिलिन", "पैरासिटामोल", "स्ट्रेप्टोमाइसिन"),
            listOf("Colistin (Polymyxin E - Reserve last-line antibiotic for carbapenem-resistant Gram-negative superbugs)", "Penicillin", "Paracetamol", "Streptomycin"),
            0,
            "कोलिस्टिन इंसानों में सुपरबग्स के इलाज की अंतिम पंक्ति की दवा है। मुर्गियों के चारे में इसके उपयोग से 'mcr-1' प्रतिरोधी जीन पैदा हो रहा था, इसलिए सरकार ने इसके पशु उपयोग पर पूर्ण प्रतिबंध लगा दिया।",
            "Colistin is a cationic polypeptide antibiotic preserved exclusively for human multi-drug resistant Gram-negative infections; plasmid-mediated mcr genes threatened its global clinical utility.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q12", "sci_8",
            "प्रायन (Prions) क्या होते हैं जो 'मैड काउ डिजीज' (Mad Cow Disease / BSE) और मनुष्यों में 'क्रूट्जफेल्ट-जैकब रोग' (CJD) उत्पन्न करते हैं?",
            "What are Prions, the infectious agents responsible for Bovine Spongiform Encephalopathy (Mad Cow Disease) and Creutzfeldt-Jakob Disease (CJD)?",
            listOf("असामान्य रूप से मुड़े हुए संक्रामक प्रोटीन कण (Infectious Misfolded Proteins lacking DNA/RNA)", "एककोशिकीय कवक", "विषाणु", "जीवाणु"),
            listOf("Infectious misfolded proteinaceous particles devoid of nucleic acids (PrPSc converting normal cellular PrPC into amyloid beta-sheets)", "Single-cell fungi", "Retroviruses", "Archaebacteria"),
            0,
            "प्रायन में डीएनए या आरएनए नहीं होता; यह केवल एक विकृत प्रोटीन (PrPSc) होता है जो मस्तिष्क के सामान्य प्रोटीनों को भी विकृत कर मस्तिष्क में स्पंज जैसे छेद (Spongiform encephalopathy) बना देता है। स्टैनली प्रूसिनर को 1997 का नोबेल मिला था।",
            "Prions (PrPSc) propagate by templated conformational conversion of endogenous alpha-helical PrPC into protease-resistant beta-sheet amyloid polymers, inducing fatal neurodegeneration.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m6_q13", "sci_8",
            "विश्व स्वास्थ्य संगठन (WHO) द्वारा प्रतिवर्ष 'विश्व रोगाणुरोधी जागरूकता सप्ताह' (World Antimicrobial Awareness Week - WAAW) कब मनाया जाता है?",
            "When is World AMR Awareness Week (WAAW) observed globally each year to promote prudent antimicrobial stewardship?",
            listOf("18 से 24 नवंबर (18 - 24 November)", "1 से 7 अप्रैल", "15 से 21 अगस्त", "10 से 16 दिसंबर"),
            listOf("18 to 24 November (Global annual campaign themed 'Preventing Antimicrobial Resistance Together')", "1 to 7 April", "15 to 21 August", "10 to 16 December"),
            0,
            "WHO, FAO, UNEP और WOAH द्वारा 18-24 नवंबर को रोगाणुरोधी प्रतिरोध (AMR) के खतरे के प्रति जनता, डॉक्टरों और किसानों को जागरूक करने हेतु यह सप्ताह मनाया जाता है।",
            "World AMR Awareness Week is a Quadripartite global initiative to encourage best practices among the public, health workers, and policymakers to slow the spread of drug-resistant infections.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m6_q14", "sci_8",
            "लेप्टोस्पायरोसिस (Leptospirosis / चूहा बुखार) बाढ़ के गंदे पानी में किस जानवर के मूत्र से दूषित जीवाणु के मानव त्वचा के घावों से प्रवेश करने से होता है?",
            "Leptospirosis (Weil's disease), common after urban monsoon flooding, is transmitted to humans through direct contact with water contaminated with the urine of:",
            listOf("चूहे और मवेशी (Infected Rodents and Cattle urine - Leptospira interrogans)", "मच्छर", "मछलियां", "पक्षी"),
            listOf("Rats, rodents, and livestock (Leptospira interrogans shedding via renal tubules into floodwaters)", "Mosquitoes", "Fishes", "Birds"),
            0,
            "लेप्टोस्पायरोसिस 'लेप्टोस्पाइरा' स्पाइरोकीट जीवाणु से होता है। भारी बारिश और बाढ़ में चूहों का मूत्र सड़कों पर भर जाता है; नंगे पैर चलने पर पैरों के कटे-छिले घाव से यह शरीर में घुसकर यकृत और गुर्दे को नुकसान पहुंचाता है।",
            "Leptospira interrogans enters through broken skin abrasions or mucous membranes from contaminated floodwaters, leading to biphasic fever, hepatic failure, and acute renal tubular necrosis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m6_q15", "sci_8",
            "स्क्रब टाइफस (Scrub Typhus) रोग किस सूक्ष्म जीवाणु (Rickettsia) द्वारा होता है और यह किसके काटने से फैलता है?",
            "Scrub Typhus (characterized by fever, headache, and a pathognomonic black necrotic skin eschar) is caused by Orientia tsutsugamushi and transmitted by:",
            listOf("चिगर माइट के लार्वा (Larval Trombiculid Mites / Chiggers)", "सैंडफ्लाई", "सीसी मक्खी", "खटमल"),
            listOf("Chigger mites (Larval Leptotrombidium deliense / Trombiculid mites)", "Sandfly", "Tsetse fly", "Bedbug"),
            0,
            "स्क्रब टाइफस 'ओरिएंटिया त्सुत्सुगामुशी' (Orientia tsutsugamushi) जीवाणु से होता है और झाड़ियों में रहने वाले 'चिगर माइट' (Chigger Mite) के लार्वा के काटने से फैलता है। जहां यह काटता है वहां सिगरेट के जले जैसा काला निशान (Eschar) बन जाता है।",
            "Orientia tsutsugamushi is an obligate intracellular pathogen injected by feeding larval Leptotrombidium mites, producing an entry eschar, generalized vasculitis, and lymphadenopathy treatable with Doxycycline.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 7: Diagnostic Tests, Medical Imaging & Equipment (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m7_q1", "sci_8",
            "इलेक्ट्रोकार्डियोग्राम (ECG - Electrocardiogram) मानव शरीर के किस अंग की विद्युत गतिविधि (Electrical Activity) को रिकॉर्ड करता है?",
            "An Electrocardiogram (ECG / EKG, pioneered by Willem Einthoven) records the cyclic electrical conduction activity of which vital human organ?",
            listOf("हृदय (Heart / Myocardial Depolarization & Repolarization)", "मस्तिष्क (Brain)", "फेफड़े (Lungs)", "यकृत (Liver)"),
            listOf("Heart (Recording P wave atrial depolarization, QRS complex ventricular depolarization, and T wave repolarization)", "Brain (EEG)", "Lungs", "Liver"),
            0,
            "ECG हृदय की धड़कन और विद्युत तरंगों (P, QRS, T तरंगें) को ग्राफ पर दिखाता है। इसके आविष्कारक 'विलेम आइनथोवेन' को 1924 में नोबेल पुरस्कार मिला था।",
            "ECG traces myocardial electrical vector propagation across Einthoven's triangle leads, diagnosing arrhythmias, conduction blocks, and acute ST-elevation myocardial infarctions (STEMI).",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q2", "sci_8",
            "इलेक्ट्रोएन्सेफेलोग्राम (EEG - Electroencephalogram) किस अंग की न्यूरोनल तरंगों और मिर्गी (Epilepsy) की जांच हेतु उपयोग किया जाता है?",
            "An Electroencephalogram (EEG, invented by Hans Berger in 1924) measures postsynaptic electrical brainwave potentials across the scalp to evaluate:",
            listOf("मस्तिष्क (Brain electrical activity / Seizures & Sleep stages)", "गुर्दे", "पेट", "आंखें"),
            listOf("Brain (Cerebral cortex neuronal firing patterns: Alpha, Beta, Theta, and Delta rhythms)", "Kidneys", "Stomach", "Eyes (EOG)"),
            0,
            "EEG खोपड़ी पर इलेक्ट्रोड लगाकर मस्तिष्क की तरंगों (अल्फा, बीटा, थीटा, डेल्टा) को रिकॉर्ड करता है। इसका उपयोग मिर्गी के दौरे, ब्रेन डेथ और अनिद्रा की जांच में होता है।",
            "EEG records summated excitatory and inhibitory postsynaptic potentials of pyramidal cortical neurons, diagnosing epileptiform spike-and-wave discharges and sleep architecture.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q3", "sci_8",
            "चुंबकीय अनुनाद इमेजिंग (MRI - Magnetic Resonance Imaging) किस भौतिक सिद्धांत और तरंगों पर काम करती है, जिसमें हानिकारक एक्स-रे का उपयोग नहीं होता?",
            "Magnetic Resonance Imaging (MRI) produces high-contrast soft tissue anatomical cross-sections utilizing which physical principle without ionizing radiation?",
            listOf("प्रबल चुंबकीय क्षेत्र एवं रेडियो तरंगें (Strong Magnetic Fields and Radiofrequency Waves on Hydrogen Protons)", "गामा किरणें", "पराबैंगनी किरणें", "अल्फा कण"),
            listOf("Strong Magnetic Fields (1.5T to 3T) and Radiofrequency Pulses acting on tissue Hydrogen Nuclei (Protons)", "Gamma radiation", "Ultraviolet rays", "Alpha particles"),
            0,
            "MRI शरीर के पानी में मौजूद हाइड्रोजन प्रोटॉन को शक्तिशाली चुंबक से संरेखित करती है और रेडियो तरंगें भेजकर उनके घूमने की ऊर्जा से अत्यंत स्पष्ट 3D चित्र बनाती है। इसमें रेडिएशन नहीं होता।",
            "Nuclear Magnetic Resonance (NMR) aligns nuclear spins of tissue water hydrogen protons along B0 magnetic field; RF pulses tip spins into transverse plane, measuring T1 and T2 relaxation signals.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q4", "sci_8",
            "सीटी स्कैन (CT Scan - Computed Tomography) में शरीर के आंतरिक अंगों के विस्तृत क्रॉस-सेक्शनल चित्र बनाने हेतु किन किरणों का उपयोग किया जाता है?",
            "Computed Tomography (CT / CAT Scan, invented by Godfrey Hounsfield) uses rotating beams of which ionizing radiation to generate cross-sectional slice images?",
            listOf("एक्स-किरणें (X-Rays with computer-reconstructed Hounsfield attenuation units)", "ध्वनि तरंगें", "माइक्रोवेव", "अवरक्त किरणें"),
            listOf("X-Rays (Rotating narrow X-ray tube and digital multi-detector arrays)", "Sound waves (Ultrasound)", "Microwaves", "Infrared rays"),
            0,
            "सीटी स्कैन में 360 डिग्री घूमने वाली एक्स-रे किरणों और कंप्यूटर एल्गोरिदम से शरीर के अंगों की पतली-पतली स्लाइस छवियां बनाई जाती हैं। गॉडफ्रे हाउन्सफील्ड और एलन कॉरमैक को 1979 का नोबेल मिला था।",
            "CT scanners project rotating narrow fan-beams of X-rays through the patient, calculating differential tissue linear attenuation coefficients (measured in Hounsfield Units, HU).",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q5", "sci_8",
            "सोनोग्राफी (Ultrasound / Ultrasonography) में गर्भस्थ शिशु और पेट के अंगों की जांच हेतु किन तरंगों का उपयोग किया जाता है?",
            "Medical Ultrasonography (Sonography) generates real-time diagnostic acoustic images using which non-ionizing mechanical sound waves?",
            listOf("पराश्रव्य ध्वनि तरंगें (Ultrasound Waves - frequency > 20,000 Hz / 2 to 15 MHz)", "अपश्रव्य तरंगें", "रेडियो तरंगें", "प्रकाश तरंगें"),
            listOf("Ultrasonic sound waves (High frequency acoustic waves between 2 MHz and 15 MHz utilizing piezoelectric crystals)", "Infrasonic sound waves", "Radio waves", "Visible light"),
            0,
            "अल्ट्रासाउंड में पीजोइलेक्ट्रिक क्रिस्टल द्वारा 2 से 15 मेगाहर्ट्ज (MHz) की पराश्रव्य (Ultrasound) ध्वनि तरंगें शरीर में भेजी जाती हैं, जो ऊतकों से टकराकर वापस लौटने पर स्क्रीन पर लाइव चित्र बनाती हैं।",
            "Ultrasound transducers utilize the piezoelectric effect to transmit high-frequency longitudinal acoustic pulses and detect reflected tissue acoustic impedance mismatches.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q6", "sci_8",
            "रक्त में ऑक्सीजन संतृप्ति स्तर (SpO2 / Blood Oxygen Saturation) और पल्स रेट मापने वाले पोर्टेबल क्लिप उपकरण को क्या कहा जाता है?",
            "Which non-invasive fingertip optical sensor device measures the percentage of oxygenated hemoglobin in arterial blood (SpO2)?",
            listOf("पल्स ऑक्सीमीटर (Pulse Oximeter)", "ग्लूकोमीटर", "थर्मामीटर", "स्पिरोमीटर"),
            listOf("Pulse Oximeter (Dual-wavelength spectrophotometer utilizing 660 nm Red and 940 nm Infrared LEDs)", "Glucometer", "Clinical Thermometer", "Spirometer"),
            0,
            "पल्स ऑक्सीमीटर उंगली पर लाल (660 nm) और इन्फ्रारेड (940 nm) प्रकाश डालकर ऑक्सीहीमोग्लोबिन और डीऑक्सीहीमोग्लोबिन द्वारा प्रकाश अवशोषण के अंतर से रक्त में ऑक्सीजन प्रतिशत (95-100% सामान्य) मापता है।",
            "Pulse oximetry relies on spectrophotometric differential light absorption of pulsatile arterial capillary bed, calculating ratio of oxygenated HbO2 to total functional hemoglobin.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q7", "sci_8",
            "गुर्दे (Kidney) के पूरी तरह विफल होने पर रक्त से यूरिया, यूरिक एसिड और अतिरिक्त विषाक्त पदार्थों को कृत्रिम रूप से छानने की प्रक्रिया क्या कहलाती है?",
            "The artificial medical procedure of filtering metabolic wastes (urea, creatinine) and excess water from human blood during end-stage renal failure is called:",
            listOf("डायलिसिस / अपोहन (Haemodialysis / Peritoneal Dialysis)", "कीमोथेरेपी", "एंजियोप्लास्टी", "बायोप्सी"),
            listOf("Haemodialysis (Artificial kidney utilizing semi-permeable dialyzer membrane and dialysate fluid)", "Chemotherapy", "Coronary Angioplasty", "Biopsy"),
            0,
            "डायलिसिस में रक्त को 'डायलाइजर' (कृत्रिम गुर्दा) से गुजारा जाता है जहां सेलोफेन की अर्ध-पारगम्य झिल्ली विसरण (Diffusion) द्वारा रक्त से नाइट्रोजनयुक्त अपशिष्ट पदार्थों को डायलिसेट तरल में निकाल देती है।",
            "Hemodialysis circulates heparinized blood countercurrently against dialysate across semipermeable hollow-fiber membranes, clearing azotemic solutes via concentration gradients and ultrafiltration.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q8", "sci_8",
            "हृदय की अवरुद्ध धमनियों (Coronary Artery Blockage) को खोलने हेतु गुब्बारे से फुलाकर धातु का छल्ला (Stent) डालने की प्रक्रिया क्या कहलाती है?",
            "The minimally invasive cardiovascular catheterization procedure to widen stenotic coronary arteries and deploy a metallic mesh stent is called:",
            listOf("एंजियोप्लास्टी (Coronary Angioplasty / PTCA)", "बायपास सर्जरी", "पेसमेकर प्रत्यारोपण", "एंडोस्कोपी"),
            listOf("Angioplasty (Percutaneous Transluminal Coronary Angioplasty - PTCA with Drug-Eluting Stent)", "Coronary Artery Bypass Grafting (CABG)", "Pacemaker Implantation", "Endoscopy"),
            0,
            "एंजियोप्लास्टी में पैर या हाथ की धमनी से कैथेटर डालकर कोरोनरी धमनी के ब्लॉकेज वाली जगह पर गुब्बारा फुलाया जाता है और रक्त प्रवाह बनाए रखने हेतु 'ड्रग-एल्यूटिंग स्टेंट' (Stent) स्थापित किया जाता है।",
            "Percutaneous Coronary Intervention (PCI/PTCA) compresses atherosclerotic plaque with a balloon catheter and deploys a drug-eluting cobalt-chromium stent to restore coronary perfusion.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q9", "sci_8",
            "हृदय की धड़कन (Heart Rhythm) अत्यंत धीमी (Bradycardia) या अनियमित होने पर सीने की त्वचा के नीचे लगाया जाने वाला इलेक्ट्रॉनिक उपकरण क्या कहलाता है?",
            "Which small battery-powered surgically implantable electronic cardiac device delivers electrical impulses to maintain a normal heart rhythm during sinus node failure?",
            listOf("कृत्रिम पेसमेकर (Artificial Cardiac Pacemaker)", "डिफाइब्रिलेटर", "स्टेथोस्कोप", "सक्शन पंप"),
            listOf("Artificial Cardiac Pacemaker (Lithium-iodine battery powered pulse generator with transvenous pacing leads)", "Automated External Defibrillator", "Stethoscope", "Mechanical Ventilator"),
            0,
            "हृदय का प्राकृतिक पेसमेकर 'एसए नोड' (SA Node) होता है। इसके खराब होने पर कृत्रिम पेसमेकर लगाया जाता है जो लिथियम बैटरी से निश्चित अंतराल पर विद्युत सिग्नल भेजकर हृदय को सामान्य दर (72 धड़कन/मिनट) पर धड़काता है।",
            "An artificial pacemaker senses intrinsic ventricular depolarization and emits electrical stimulation threshold impulses when intrinsic SA-node firing drops below a programmed baseline.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q10", "sci_8",
            "कैंसर के निदान हेतु संदिग्ध ट्यूमर से ऊतक का एक छोटा टुकड़ा काटकर सूक्ष्मदर्शी द्वारा जांच करने की प्रक्रिया क्या कहलाती है?",
            "The surgical extraction and histopathological microscopic examination of a small tissue specimen to confirm or rule out malignancy (Cancer) is termed:",
            listOf("बायोप्सी (Biopsy / Histopathology)", "ऑटोप्सी", "एंडोस्कोपी", "डायलिसिस"),
            listOf("Biopsy (Incisional, excisional, core-needle, or fine-needle aspiration cytology - FNAC)", "Autopsy (Post-mortem examination)", "Endoscopy", "Dialysis"),
            0,
            "बायोप्सी (Biopsy) जीवित रोगी के ऊतक की सूक्ष्मदर्शी जांच है जिससे कैंसर के प्रकार और ग्रेड का सटीक पता चलता है। शव परीक्षण को 'ऑटोप्सी' (Autopsy / Post-mortem) कहा जाता है।",
            "Biopsy provides the definitive histopathological gold standard for oncological diagnosis, assessing cytological atypia, architectural dysplasia, mitotic index, and immunohistochemical tumor markers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q11", "sci_8",
            "मानव शरीर के आंतरिक खोखले अंगों (जैसे पेट, ग्रासनली, आंत) को अंदर से देखने हेतु किस फाइबर-ऑप्टिक उपकरण का उपयोग किया जाता है जो 'पूर्ण आंतरिक परावर्तन' (TIR) पर कार्य करता है?",
            "Which flexible medical optical device utilizes Total Internal Reflection (TIR) through fiber-optic bundles to directly visualize inner lining of internal hollow organs?",
            listOf("एंडोस्कोप (Endoscope / Gastroscopy / Colonoscopy)", "पेरिस्कोप", "टेलीस्कोप", "कैलिडोस्कोप"),
            listOf("Endoscope (Flexible video endoscope operating on optical fiber Total Internal Reflection)", "Periscope", "Telescope", "Kaleidoscope"),
            0,
            "एंडोस्कोपी में मुंह या गुदा मार्ग से पतली लचीली नली डाली जाती है जिसमें ऑप्टिकल फाइबर और छोटा कैमरा होता है। यह पूर्ण आंतरिक परावर्तन (TIR) सिद्धांत से प्रकाश पहुंचाकर पेट के छालों, ब्लीडिंग और कैंसर की जांच करता है।",
            "Endoscopy transmits coherent light along flexible quartz fiber-optic bundles via Total Internal Reflection, enabling real-time mucosal visualization and endoscopic mucosal biopsy/resection.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q12", "sci_8",
            "फेफड़ों की वायु क्षमता और श्वसन क्रिया (Lung Capacity & Airflow Volume) को मापने हेतु कौन-सा परीक्षण उपकरण उपयोग किया जाता है?",
            "Which diagnostic pulmonary function testing device measures the volume of air inhaled and exhaled as a function of time (FVC, FEV1) in Asthma and COPD?",
            listOf("स्पिरोमीटर (Spirometer / Pulmonary Function Test - PFT)", "स्फिग्मोमैनोमीटर", "ऑक्सीमीटर", "बैरोमीटर"),
            listOf("Spirometer (Measures Forced Vital Capacity - FVC and Forced Expiratory Volume in 1 second - FEV1)", "Sphygmomanometer", "Pulse Oximeter", "Barometer"),
            0,
            "स्पिरोमेट्री (Spirometry) परीक्षण में मरीज जोर से फूंक मारता है जिससे फेफड़ों की कुल क्षमता (FVC) और 1 सेकंड में छोड़ी गई हवा (FEV1) मापी जाती है, जिससे दमा (Asthma) और ब्रोंकाइटिस का पता चलता है।",
            "Spirometry generates volume-time and flow-volume loops to differentiate obstructive lung defects (reduced FEV1/FVC ratio in asthma/COPD) from restrictive parenchymal pathologies.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q13", "sci_8",
            "रिवर्स ट्रांसक्रिप्शन पॉलीमरेज़ चेन रिएक्शन (RT-PCR) तकनीक में वायरस के आरएनए (RNA) को पहले किसमें बदला जाता है?",
            "In diagnostic RT-PCR testing (used for COVID-19, Swine Flu), the enzyme Reverse Transcriptase first converts single-stranded viral RNA into:",
            listOf("पूरक डीएनए / सी-डीएनए (Complementary DNA - cDNA)", "प्रोटीन", "ग्लूकोज", "अमीनो एसिड"),
            listOf("Complementary DNA (cDNA - which is subsequently exponentially amplified by Taq DNA polymerase)", "Polypeptide protein", "Glucose", "Amino acid chain"),
            0,
            "RT-PCR में 'रिवर्स ट्रांसक्रिप्टेज' एंजाइम वायरल RNA से cDNA बनाता है, फिर 'Taq पॉलीमरेज' डीएनए की लाखों प्रतियां बनाता है जिसे फ्लोरोसेंट डाई द्वारा पहचाना जाता है।",
            "Reverse Transcriptase synthesizes complementary DNA (cDNA) from viral RNA templates; thermal cycling with sequence-specific primers and fluorescent probes exponentially amplifies target amplicon sequences.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m7_q14", "sci_8",
            "डॉक्टरों द्वारा छाती और फेफड़ों की आवाज सुनने के लिए इस्तेमाल होने वाले 'स्टेथोस्कोप' (Stethoscope) का आविष्कार 1816 में किसने किया था?",
            "Who invented the acoustic medical Stethoscope in 1816 in Paris to auscultate internal cardiac and pulmonary acoustic sounds?",
            listOf("रेने लेनेक (René Laennec)", "एडवर्ड जेनर", "जोसेफ लिस्टर", "विलियम हार्वे"),
            listOf("René Laennec (French physician who carved the first wooden monaural stethoscope cylinder in 1816)", "Edward Jenner", "Joseph Lister", "William Harvey"),
            0,
            "रेने लेनेक (René Laennec) ने 1816 में स्टेथोस्कोप का आविष्कार किया था। यह ध्वनि के 'बहु परावर्तन' (Multiple Reflection of Sound) के सिद्धांत पर कार्य करता है।",
            "René Laennec invented the stethoscope to mediate acoustic auscultation of chest sounds via acoustic impedance matching and multiple acoustic reflection along tubing.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m7_q15", "sci_8",
            "पॉजिट्रॉन एमिशन टोमोग्राफी (PET Scan) में कैंसर कोशिकाओं के मेटाबॉलिज्म का पता लगाने हेतु किस रेडियोधर्मी ट्रेसर का सबसे अधिक उपयोग किया जाता है?",
            "Which radioactive positron-emitting radiopharmaceutical glucose analogue is most widely injected in oncology PET Scans to image hypermetabolic cancer cells?",
            listOf("18F-एफडीजी / फ्लोरोडीऑक्सीग्लूकोज (18F-Fluorodeoxyglucose / 18F-FDG)", "आयोडीन-131", "कोबाल्ट-60", "कार्बन-14"),
            listOf("18F-FDG (18F-Fluorodeoxyglucose - Radioactive glucose analog trapped in malignant cells exhibiting Warburg glycolysis)", "Iodine-131 (Thyroid)", "Cobalt-60", "Carbon-14"),
            0,
            "कैंसर कोशिकाएं तेजी से ग्लूकोज खाती हैं (वारबर्ग प्रभाव)। 18F-FDG ग्लूकोज के साथ जुड़कर कैंसर ट्यूमर में जमा हो जाता है और पॉजिट्रॉन छोड़ता है जो गामा किरणों में बदलकर PET कैमरे पर चमकते हैं।",
            "PET utilizes 18F-FDG to exploit accelerated aerobic glycolysis in malignant neoplasms; trapped intracellular FDG-6-phosphate emits positrons that annihilate with electrons into 511 keV coincidence gamma photon pairs.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 8: Pharmacology, Drugs, Antibiotics & Therapeutics (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m8_q1", "sci_8",
            "शरीर के दर्द और सिरदर्द को दूर करने वाली दवाएं (Painkillers) औषध विज्ञान में क्या कहलाती हैं?",
            "Pharmacological therapeutic agents specifically formulated to alleviate and relieve pain without causing loss of consciousness are termed:",
            listOf("एनाल्जेसिक्स / दर्द निवारक (Analgesics)", "एंटीपायरेटिक्स", "एंटीबायोटिक्स", "एनेस्थेटिक्स"),
            listOf("Analgesics (Non-opioid NSAIDs like Aspirin/Ibuprofen and Opioid analgesics like Morphine/Codeine)", "Antipyretics (Fever reducers)", "Antibiotics", "Anesthetics (Induce unconsciousness)"),
            0,
            "एनाल्जेसिक्स (Analgesics) दर्द दूर करती हैं (जैसे एस्पिरिन, इबुप्रोफेन, ट्रामाडोल)। बुखार कम करने वाली दवाएं 'एंटीपायरेटिक्स' (Antipyretics जैसे पैरासिटामोल) कहलाती हैं।",
            "Analgesics act selectively on peripheral nociceptors and central pain pathways (COX enzyme inhibition or mu-opioid receptor agonism) to attenuate pain transmission.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q2", "sci_8",
            "बुखार (Fever / Pyrexia) को कम करने हेतु सबसे व्यापक रूप से इस्तेमाल की जाने वाली दवा 'पैरासिटामोल' (Paracetamol) का रासायनिक नाम क्या है?",
            "What is the standard chemical IUPAC designation of Paracetamol (Acetaminophen), the most ubiquitous antipyretic and mild analgesic?",
            listOf("एन-एसिटाइल-पी-एमिनोफेनॉल (N-acetyl-para-aminophenol / APAP)", "एसिटाइलसैलिसिलिक एसिड (Aspirin)", "सोडियम बेंजोएट", "मिथाइल सैलिसिलेट"),
            listOf("N-acetyl-p-aminophenol (APAP / Acetaminophen)", "Acetylsalicylic acid (Aspirin)", "Sodium Benzoate", "Methyl salicylate (Oil of wintergreen)"),
            0,
            "पैरासिटामोल (N-acetyl-p-aminophenol) मस्तिष्क के हाइपोथैलेमस में प्रोस्टाग्लैंडीन के संश्लेषण को रोककर शरीर के तापमान नियामक केंद्र को सामान्य स्तर पर लाती है।",
            "Paracetamol acts centrally via selective peroxidase inhibition of COX-3/COX-2 pathways, inhibiting prostaglandin E2 (PGE2) generation in the preoptic hypothalamic thermoregulatory center.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q3", "sci_8",
            "एस्पिरिन (Aspirin) का रासायनिक नाम क्या है और यह दर्द निवारक के साथ-साथ दिल के मरीजों में किस रूप में कार्य करती है?",
            "What is the chemical identity of Aspirin, and how does its low daily maintenance dose protect cardiovascular patients against myocardial infarction?",
            listOf("एसिटाइलसैलिसिलिक एसिड - रक्त का थक्का जमने से रोकने वाला एंटी-प्लेटलेट एजेंट (Acetylsalicylic Acid - Blood thinner / Antiplatelet)", "नाइट्रोग्लिसरीन", "पैरासिटामोल", "क्लोरोक्वीन"),
            listOf("Acetylsalicylic Acid (Irreversibly acetylates COX-1 enzyme, suppressing platelet Thromboxane A2 synthesis to prevent arterial clots)", "Nitroglycerin", "Paracetamol", "Chloroquine phosphate"),
            0,
            "एस्पिरिन (एसिटाइल सैलिसिलिक एसिड) प्लेटलेट्स के 'थ्रोम्बोक्सेन A2' को रोक देती है जिससे रक्त पतला रहता है और दिल के दौरे व स्ट्रोक का खतरा कम होता है। इसे विलो (Willow) वृक्ष की छाल से तैयार किया गया था।",
            "Aspirin irreversibly acetylates serine-529 residue of cyclooxygenase-1 (COX-1), shutting down platelet production of prothrombotic thromboxane A2 for the ~10-day lifespan of circulating platelets.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q4", "sci_8",
            "शल्य चिकित्सा (Surgery / ऑपरेशन) के दौरान मरीज को दर्द-रहित और बेहोश करने वाली दवाएं क्या कहलाती हैं?",
            "Pharmacological agents administered prior to and during invasive surgery to induce reversible loss of sensation or complete consciousness are termed:",
            listOf("एनेस्थेटिक्स / निश्चेतक (Anesthetics - General and Local Anesthetics)", "एंटीसेप्टिक्स", "एंटीडिप्रेसेंट", "एंटीबायोटिक्स"),
            listOf("Anesthetics (General Anesthetics like Propofol/Sevoflurane and Local Anesthetics like Lignocaine/Bupivacaine)", "Antiseptics", "Antidepressants", "Antibiotics"),
            0,
            "एनेस्थीसिया दो प्रकार का होता है: 1. स्थानीय (Local - लिग्नोकेन जो केवल एक अंग को सुन्न करता है) और 2. सामान्य (General - नाइट्रस ऑक्साइड, प्रोपोफॉल जो पूरी तरह बेहोश करता है)। जेम्स सिम्पसन ने क्लोरोफॉर्म का निश्चेतक के रूप में प्रयोग शुरू किया था।",
            "General anesthetics potentiate inhibitory GABA-A receptor currents and depress excitatory NMDA transmission in the reticular activating system, producing reversible hypnosis, amnesia, and analgesia.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q5", "sci_8",
            "जीवित मानव ऊतकों (घाव, कटी त्वचा) पर सूक्ष्मजीवों को नष्ट करने हेतु लगाए जाने वाले रसायन (जैसे डेटॉल, टिंचर आयोडीन, सेवलॉन) क्या कहलाते हैं?",
            "Chemical antimicrobial formulations safely applied topically onto living human skin, lacerations, and surgical wounds to prevent infection are called:",
            listOf("एंटीसेप्टिक्स / रोगाणुरोधक (Antiseptics)", "डिसइंफेक्टेंट्स / कीटाणुनाशक", "एंटीबायोटिक्स", "एंटीपायरेटिक्स"),
            listOf("Antiseptics (e.g., Chloroxylenol in Dettol, Tincture of Iodine, Povidone-Iodine Betadine, Savlon)", "Disinfectants (Toxic chemicals like Phenol/Bleach applied on floors/inanimate surfaces)", "Antibiotics", "Antipyretics"),
            0,
            "एंटीसेप्टिक्स (Antiseptics) जीवित त्वचा पर सुरक्षित रूप से लगाए जाते हैं (जैसे डेटॉल, बीटाडीन)। निर्जीव वस्तुओं (फर्श, नाली, उपकरणों) पर बैक्टीरिया मारने वाले कठोर रसायन 'डिसइंफेक्टेंट्स' (Disinfectants जैसे फिनाइल, ब्लीचिंग पाउडर) कहलाते हैं।",
            "Antiseptics are non-toxic topical germicides applied to viable living tissue, whereas disinfectants are high-toxicity microbicidal agents applied strictly to non-living fomites and environmental surfaces.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q6", "sci_8",
            "प्रसिद्ध एंटीसेप्टिक 'डेटॉल' (Dettol) का मुख्य सक्रिय रासायनिक घटक कौन-सा है?",
            "What is the primary active antiseptic chemical constituent present in commercial Dettol liquid formulation?",
            listOf("क्लोरोजाइलिनोल एवं टेरपिनिओल (Chloroxylenol & Terpineol)", "एसिटिक एसिड", "सोडियम हाइपोक्लोराइट", "फॉर्मेल्डिहाइड"),
            listOf("Chloroxylenol (4-chloro-3,5-dimethylphenol) and alpha-Terpineol", "Acetic acid", "Sodium hypochlorite (Bleach)", "Formaldehyde"),
            0,
            "डेटॉल में 4.8% क्लोरोजाइलिनोल (Chloroxylenol), टेरपिनिओल और आइसोप्रोपिल अल्कोहल होता है। यह जीवाणुओं की कोशिका झिल्ली को तोड़कर उन्हें नष्ट कर देता है।",
            "Chloroxylenol exerts microbicidal action by disrupting bacterial cell wall integrity and denaturing essential cytoplasmic functional proteins and enzymatic systems.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q7", "sci_8",
            "घावों की ड्रेसिंग में इस्तेमाल होने वाला 'टिंचर आयोडीन' (Tincture of Iodine) किसका मिश्रण होता है?",
            "Tincture of Iodine, an effective traditional topical antiseptic, is chemically prepared by dissolving elemental Iodine and Potassium Iodide in:",
            listOf("अल्कोहल और जल का मिश्रण (2-3% Iodine in Alcohol-Water solution)", "केवल शुद्ध पेट्रोल", "शुद्ध एसीटोन", "क्लोरोफॉर्म"),
            listOf("2% to 7% elemental Iodine and Potassium Iodide in Ethanol-Water mixture", "Pure petroleum ether", "Pure Acetone", "Liquid Chloroform"),
            0,
            "टिंचर आयोडीन में 2-3% आयोडीन को अल्कोहल और जल के घोल में घोला जाता है। आज आधुनिक चिकित्सा में इसकी जगह बिना जलन वाली 'पोवीडोन-आयोडीन' (Betadine) का प्रयोग अधिक होता है।",
            "Tincture of iodine provides free molecular iodine that rapidly penetrates bacterial cell walls, oxidizing thiol functional groups of structural proteins and respiratory nucleotides.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q8", "sci_8",
            "मानव पेट में अत्यधिक हाइड्रोक्लोरिक एसिड (HCl) से होने वाली एसिडिटी और सीने की जलन को शांत करने वाली दवाएं (जैसे मैग्नीशियम हाइड्रॉक्साइड / मिल्क ऑफ मैग्नीशिया) क्या कहलाती हैं?",
            "Pharmacological alkaline neutralizing formulations (such as Milk of Magnesia - Mg(OH)2, Gelusil, Digene) prescribed for gastric hyperacidity are classified as:",
            listOf("एंटासिड्स / प्रति-अम्ल (Antacids)", "एंटीबायोटिक्स", "एंटीहिस्टामाइन", "प्रोटॉन डोनर्स"),
            listOf("Antacids (Weak bases neutralizing excessive gastric hydrochloric acid, e.g., Magnesium Hydroxide, Aluminum Hydroxide, Sodium Bicarbonate)", "Antibiotics", "Antihistamines", "Proton donors"),
            0,
            "एंटासिड्स दुर्बल क्षार (Weak Bases) होते हैं जो पेट के अतिरिक्त HCl अम्ल के साथ उदासीनीकरण (Neutralization) अभिक्रिया करके लवण और जल बनाते हैं, जिससे पेट का pH सुरक्षित स्तर पर आ जाता है।",
            "Antacids react chemically with gastric hydrochloric acid to raise intra-gastric pH above 4.0, inactivating proteolytic pepsin and relieving mucosal acid irritation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q9", "sci_8",
            "मानसिक तनाव, चिंता और अवसाद को कम कर तंत्रिका तंत्र को शांत करने वाली दवाएं क्या कहलाती हैं?",
            "Therapeutic psychotropic drugs designed to calm emotional anxiety, tension, agitation, and mental stress by acting on the central nervous system are termed:",
            listOf("ट्रैंक्विलाइज़र / प्रशांतक (Tranquilizers / Sedatives / Anxiolytics)", "एंटीबायोटिक्स", "एंटीपायरेटिक्स", "एस्ट्रिंजेंट्स"),
            listOf("Tranquilizers / Sedatives (e.g., Benzodiazepines like Diazepam, Alprazolam; Barbiturates)", "Antibiotics", "Antipyretics", "Astringents"),
            0,
            "ट्रैंक्विलाइज़र (जैसे डायजेपाम, अल्प्राजोलम, वैलियम) मस्तिष्क में निरोधात्मक न्यूरोट्रांसमीटर 'गाबा' (GABA) के प्रभाव को बढ़ाकर चिंता, घबराहट और अनिद्रा को दूर करते हैं।",
            "Tranquilizers and anxiolytics enhance GABA-mediated chloride conductance across neuronal membranes, inducing hyperpolarization and dampening limbic excitability.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q10", "sci_8",
            "अफीम (Opium / Papaver somniferum) के पौधे के सूखे लेटेक्स से प्राप्त होने वाला सबसे शक्तिशाली प्राकृतिक दर्द निवारक एल्कलॉइड कौन-सा है?",
            "Which potent narcotic opioid alkaloid extracted from the dried latex capsules of the Opium Poppy (Papaver somniferum) is the gold-standard analgesic for severe traumatic/post-surgical pain?",
            listOf("मॉर्फिन (Morphine)", "कुनैन", "निकोटिन", "कैफीन"),
            listOf("Morphine (Pure mu-opioid receptor agonist named after Morpheus, Greek god of dreams)", "Quinine", "Nicotine", "Caffeine"),
            0,
            "मॉर्फिन अफीम से निकाला जाने वाला प्रमुख एल्कलॉइड है। यह रीढ़ की हड्डी और मस्तिष्क के ओपिओइड रिसेप्टर्स से जुड़कर कैंसर और सर्जरी के असहनीय दर्द को तुरंत मिटाता है। हेरोइन (स्मैक) मॉर्फिन का डाई-एसिटाइल रूप है।",
            "Morphine is a powerful phenanthrene opioid alkaloid that binds stereo-specifically to central mu-opioid receptors, opening K+ channels, closing Ca2+ channels, and blocking substance P release.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q11", "sci_8",
            "बैक्टीरिया जनित संक्रमणों में स्ट्रेप्टोमाइसिन (Streptomycin) एंटीबायोटिक की खोज 1943 में किसने की थी, जिसके लिए उन्हें नोबेल पुरस्कार मिला?",
            "Who discovered the landmark aminoglycoside antibiotic Streptomycin from soil actinomycete Streptomyces griseus in 1943, enabling the first cure for Tuberculosis?",
            listOf("सेलमैन वाक्समैन (Selman Waksman)", "अलेक्जेंडर फ्लेमिंग", "रॉबर्ट कोच", "लुई पाश्चर"),
            listOf("Selman Waksman (American microbiologist who coined the term 'antibiotic', Nobel Prize in 1952)", "Alexander Fleming", "Robert Koch", "Louis Pasteur"),
            0,
            "सेलमैन वाक्समैन ने 'स्ट्रेप्टोमाइसीज ग्रीसियस' मिट्टी के बैक्टीरिया से स्ट्रेप्टोमाइसिन बनाई जो टीबी (क्षय रोग) के खिलाफ काम करने वाली इतिहास की पहली प्रभावी एंटीबायोटिक थी। वाक्समैन ने ही 'एंटीबायोटिक' शब्द गढ़ा था।",
            "Selman Waksman isolated Streptomycin from Streptomyces griseus; it binds the 30S bacterial ribosomal subunit, inducing codon misreading and halting bacterial protein elongation.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m8_q12", "sci_8",
            "कोविड-19 और इन्फ्लूएंजा जैसे वायरल रोगों में वायरस के गुणन (Viral Replication) को रोकने हेतु उपयोग की जाने वाली दवाएं क्या कहलाती हैं?",
            "Pharmacological drugs that selectively inhibit specific stages of the viral life cycle (such as entry, reverse transcription, protease cleavage, or polymerase synthesis) are termed:",
            listOf("एंटीवायरल दवाएं (Antiviral Drugs - e.g., Remdesivir, Oseltamivir/Tamiflu, Acyclovir)", "एंटीबायोटिक्स", "एंटीफंगल", "एंटीहेल्मिंथिक"),
            listOf("Antivirals (e.g., Remdesivir, Acyclovir, Oseltamivir Tamiflu, Paxlovid)", "Antibacterials", "Antifungals", "Antihelminthics"),
            0,
            "एंटीवायरल दवाएं वायरस के एंजाइमों (जैसे RNA पॉलीमरेज, प्रोटीएज, न्यूरामिनिडेस) को रोकती हैं। उदाहरण: हर्पीस के लिए एसाइक्लोविर, फ्लू के लिए ओसेल्टामिविर (टैमीफ्लू), हेपेटाइटिस-C के लिए सोफोसबुविर।",
            "Antiviral drugs target viral-specific enzymes and structural proteins without cytotoxic destruction of host eukaryotic biochemical pathways.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q13", "sci_8",
            "कैंसर और ऑटोइम्यून बीमारियों के उपचार में एक ही प्रकार की बी-कोशिकाओं से प्रयोगशाला में तैयार 'मोनोक्लोनल एंटीबॉडीज' (Monoclonal Antibodies - mAbs) के नाम के अंत में सामान्यतः क्या प्रत्यय (Suffix) आता है?",
            "Genetically engineered targeted biological therapies composed of identical immune cells cloned from a single parent cell (Monoclonal Antibodies) universally carry which pharmacopoeial suffix?",
            listOf("-mab (जैसे Trastuzumab, Rituximab, Tocilizumab)", "-cillin", "-statin", "-olol"),
            listOf("-mab (e.g., Trastuzumab for HER2 breast cancer, Rituximab for lymphoma, Infliximab for autoimmune arthritis)", "-cillin (Penicillins)", "-statin (Cholesterol lowering)", "-olol (Beta blockers)"),
            0,
            "मोनोक्लोनल एंटीबॉडीज (खोजकर्ता: जॉर्ज कोहलर और सीज़र मिलस्टीन - हाइब्रिडोमा तकनीक, 1984 नोबेल) कैंसर कोशिकाओं के विशिष्ट एंटीजन को सटीक निशाना बनाती हैं। इनके नाम के अंत में '-mab' आता है।",
            "Monoclonal antibodies (mAbs) produced via B-cell myeloma hybridoma technology bind monovalently to singular target epitopes, facilitating antibody-dependent cellular cytotoxicity (ADCC) and targeted immunotherapy.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m8_q14", "sci_8",
            "एंजाइना पेक्टोरिस (Angina Pectoris / सीने के दर्द) के दौरे के समय हृदय की धमनियों को तुरंत चौड़ा (Vasodilation) करने हेतु जीभ के नीचे कौन-सी गोली रखी जाती है?",
            "Which sublingual vasodilating nitrate tablet is immediately placed under the tongue of an angina patient during acute chest pain to rapidly dilate coronary arterioles?",
            listOf("नाइट्रोग्लिसरीन / सोर्बिट्रेट (Nitroglycerin / Glyceryl Trinitrate / Sorbitrate)", "एस्पिरिन", "पैरासिटामोल", "इंसुलिन"),
            listOf("Nitroglycerin / Glyceryl Trinitrate / Isosorbide Dinitrate (Sorbitrate)", "Aspirin", "Paracetamol", "Insulin"),
            0,
            "नाइट्रोग्लिसरीन शरीर में जाकर 'नाइट्रिक ऑक्साइड' (NO) छोड़ती है जो रक्त वाहिकाओं की चिकनी पेशियों को शिथिल कर धमनियों को चौड़ा कर देती है, जिससे हृदय पर रक्त का दबाव घटता है और सीने का दर्द मिट जाता है।",
            "Nitroglycerin is denitrated by mitochondrial aldehyde dehydrogenase to generate nitric oxide (NO), stimulating guanylyl cyclase to increase cGMP, resulting in profound venous and coronary vasodilation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m8_q15", "sci_8",
            "रक्त में कोलेस्ट्रॉल (LDL Cholesterol) के स्तर को घटाकर दिल के दौरे से बचाने वाली लोकप्रिय दवाएं (जैसे एटोरवास्टेटिन, रोसुवास्टेटिन) किस वर्ग की दवाएं हैं?",
            "Which widely prescribed class of lipid-lowering drugs competitively inhibits the rate-limiting enzyme HMG-CoA reductase in hepatic cholesterol biosynthesis?",
            listOf("स्टैटिन्स (Statins - e.g., Atorvastatin, Rosuvastatin, Simvastatin)", "बीटा ब्लॉकर्स", "एंटीबायोटिक्स", "सल्फोनामाइड्स"),
            listOf("Statins (HMG-CoA Reductase Inhibitors lowering serum LDL-C and stabilizing atherosclerotic plaques)", "Beta-adrenergic receptor blockers", "Aminoglycosides", "Sulfonamides"),
            0,
            "स्टैटिन्स यकृत में 'HMG-CoA रिडक्टेस' एंजाइम को रोककर खराब कोलेस्ट्रॉल (LDL) के निर्माण को घटाते हैं और धमनियों में प्लाक जमने से रोकते हैं।",
            "Statins competitively block 3-hydroxy-3-methylglutaryl-coenzyme A (HMG-CoA) reductase, upregulating hepatic LDL receptor clearance of atherogenic circulating ApoB lipoproteins.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 9: Genetic Metabolic Disorders, Endocrine & Renal Pathologies (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m9_q1", "sci_8",
            "फेनिलकेटोन्यूरिया (Phenylketonuria - PKU) किस आवश्यक एंजाइम की जन्मजात कमी से होने वाला आनुवंशिक चयापचय विकार है?",
            "Phenylketonuria (PKU - autosomal recessive inborn error of amino acid metabolism causing severe mental retardation if untreated) is caused by deficiency of:",
            listOf("फेनिलएलनिन हाइड्रॉक्सिलेस (Phenylalanine Hydroxylase - PAH)", "लैक्टेज", "टायरोसिनेज", "पेप्सिन"),
            listOf("Phenylalanine Hydroxylase (PAH - converts dietary phenylalanine to tyrosine)", "Lactase", "Tyrosinase", "Pepsin"),
            0,
            "PKU में फेनिलएलनिन अमीनो एसिड टायरोसिन में नहीं बदल पाता और रक्त व मस्तिष्क में फेनिलपायरुविक एसिड के रूप में जमा होकर मानसिक मंदता करता है। ऐसे बच्चों के आहार में फेनिलएलनिन की मात्रा नियंत्रित रखी जाती है।",
            "Deficiency of phenylalanine hydroxylase (PAH) or its tetrahydrobiopterin (BH4) cofactor leads to hyperphenylalaninemia and accumulation of neurotoxic phenylketones in developing brain.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m9_q2", "sci_8",
            "रंजकहीनता (Albinism / एल्बिनिज्म) में त्वचा, बाल और आंखों की पुतली में कौन-सा प्राकृतिक सुरक्षात्मक वर्णक (Pigment) नहीं बन पाता?",
            "Albinism, an autosomal recessive congenital disorder characterized by complete lack of pigmentation, results from deficiency of tyrosinase enzyme required to synthesize:",
            listOf("मेलेनिन वर्णक (Melanin Pigment)", "हीमोग्लोबिन", "कैरोटीन", "क्लोरोफिल"),
            listOf("Melanin Pigment (Synthesized by melanocytes in basal epidermal layer to absorb harmful UV radiation)", "Hemoglobin", "Carotene", "Bilirubin"),
            0,
            "एल्बिनिज्म में टायरोसिनेज एंजाइम की कमी से त्वचा की मेलानोसाइट कोशिकाएं 'मेलेनिन' (Melanin) नहीं बना पातीं, जिससे त्वचा पूरी तरह सफेद और बाल सुनहरे हो जाते हैं और त्वचा कैंसर का खतरा बढ़ जाता है।",
            "Oculocutaneous albinism stems from mutational loss of tyrosinase catalytic activity within melanosomes, blocking oxidation of tyrosine to DOPA and dopaquinone during eumelanin melanogenesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q3", "sci_8",
            "गंभीर कुपोषण (Severe Acute Malnutrition) से पीड़ित बच्चों में केवल प्रोटीन की कमी से होने वाला रोग कौन-सा है जिसमें पेट मटके जैसा सूज जाता है (Edema)?",
            "Which form of severe childhood protein-energy malnutrition (PEM) is caused primarily by acute dietary protein deficiency despite adequate caloric intake, presenting with pitting edema and 'pot belly'?",
            listOf("क्वाशिओरकोर (Kwashiorkor)", "मरास्मस (सूखा रोग)", "रिकेट्स", "स्कर्वी"),
            listOf("Kwashiorkor (Hypoalbuminemia causing generalized pitting edema, ascites, and 'flaky-paint' skin dermatosis)", "Marasmus (Calorie + protein starvation with severe wasting)", "Rickets", "Scurvy"),
            0,
            "क्वाशिओरकोर (Kwashiorkor) केवल प्रोटीन की कमी से होता है। रक्त में एल्ब्यूमिन घटने से ऊतकों में पानी भर जाता है (सूजन/एडिमा), पेट फूल जाता है और बाल लाल-भूरे हो जाते हैं। प्रोटीन + कैलोरी दोनों की कमी से 'मरास्मस' (Marasmus) होता है।",
            "Kwashiorkor results from deficient dietary amino acid intake with carbohydrate maintenance; marked hypoalbuminemia crashes plasma oncotic pressure, producing peripheral edema, hepatomegaly, and fatty liver.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q4", "sci_8",
            "गठिया रोग (Gout / वातरक्त) जोड़ों में किस अपशिष्ट रासायनिक पदार्थ के नुकीले सुई जैसे क्रिस्टल (Monosodium Urate Crystals) जमा होने से होता है?",
            "Gout, an excruciating metabolic inflammatory arthritis typically attacking the first metatarsophalangeal big toe joint (Podagra), is caused by hyperuricemia and intra-articular deposition of:",
            listOf("यूरिक एसिड / मोनोसोडियम यूरेट क्रिस्टल (Monosodium Urate Crystals / Uric Acid)", "कैल्शियम ऑक्सालेट", "सोडियम क्लोराइड", "ग्लूकोज"),
            listOf("Monosodium Urate (MSU) needle-shaped negatively birefringent crystals derived from purine catabolism", "Calcium oxalate crystals", "Sodium chloride crystals", "Cholesterol crystals"),
            0,
            "प्यूरीन (मांस, शराब, समुद्री भोजन) के अधिक सेवन से रक्त में यूरिक एसिड बढ़ जाता है और जोड़ों में यूरेट के तीखे क्रिस्टल जम जाते हैं जिससे जोड़ों में असहनीय दर्द और सूजन होती है। इसके इलाज में 'एलोप्यूरिनॉल' दवा दी जाती है।",
            "Hyperuricemia leads to supersaturation of synovial fluid; monosodium urate microcrystals precipitate in joint cavities, triggering NLRP3 inflammasome activation and severe neutrophilic synovitis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q5", "sci_8",
            "गुर्दे की पथरी (Kidney Stones / वृक्क अश्मरी / Renal Calculi) का सबसे आम रासायनिक घटक कौन-सा होता है?",
            "What is the most frequent chemical mineral composition found in over 80% of human nephrolithiasis renal kidney stones?",
            listOf("कैल्शियम ऑक्सालेट (Calcium Oxalate - CaC2O4)", "मैग्नीशियम सल्फेट", "सोडियम बाइकार्बोनेट", "पोटेशियम क्लोराइड"),
            listOf("Calcium Oxalate (Monohydrate / Whewellite and Dihydrate / Weddellite crystals)", "Magnesium sulfate", "Sodium bicarbonate", "Potassium chloride"),
            0,
            "गुर्दे की अधिकांश पथरी 'कैल्शियम ऑक्सालेट' की बनी होती है। टमाटर, पालक, चॉकलेट और कम पानी पीने से मूत्र में ऑक्सालेट और कैल्शियम का सांद्रण बढ़ जाता है जिससे पथरी बन जाती है।",
            "Supersaturation of urinary calcium and oxalate ions promotes heterologous nucleation and crystalline aggregation into insoluble calcium oxalate stones along the renal calyces and ureter.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q6", "sci_8",
            "थायरॉयड ग्रंथि से थायरॉक्सिन हार्मोन के अत्यधिक स्राव (Hyperthyroidism) से होने वाला 'ग्रेव्स रोग' (Graves' Disease) का विशिष्ट लक्षण क्या है?",
            "What is the hallmark clinical ophthalmological sign of Graves' Disease (autoimmune hyperthyroidism caused by TSH-receptor stimulating antibodies)?",
            listOf("आंखों के गोलकों का बाहर की ओर उभर आना / एक्सोफ्थैल्मोस (Exophthalmos / Proptosis)", "आंखों का अंधापन", "आंखों में मोतियाबिंद", "रतौंधी"),
            listOf("Exophthalmos / Proptosis (Forward bulging of eyeballs due to retro-orbital lymphocytic infiltration and adipogenesis)", "Complete amaurosis", "Cortical cataract", "Nyctalopia"),
            0,
            "ग्रेव्स रोग में ऑटोएंटीबॉडीज TSH रिसेप्टर्स को उत्तेजित करती हैं, जिससे थायरॉयड हार्मोन अत्यधिक बनता है। इससे वजन घटना, धड़कन बढ़ना और आंखों के पीछे सूजन से आंखें बाहर निकली हुई (Exophthalmos) दिखाई देती हैं।",
            "Thyroid-Stimulating Immunoglobulins (TSI) bind to and chronically activate TSH receptors on thyroid follicular cells and orbital retrobulbar fibroblasts, producing hyperthyroid thyrotoxicosis and exophthalmos.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m9_q7", "sci_8",
            "नवजात शिशुओं में जन्मजात हाइपोथायरायडिज्म (Thyroid Hormone Deficiency at birth) के कारण होने वाले शारीरिक और मानसिक बौनेपन को क्या कहा जाता है?",
            "Congenital untreated maternal and fetal hypothyroidism leading to stunted physical growth and severe mental retardation in infants is termed:",
            listOf("क्रेटिनिज्म / जड़वामनता (Cretinism / Congenital Hypothyroidism)", "मिक्सिडीमा (वयस्कों में)", "गिगांटिज्म (विशालकायता)", "एक्रोमेगाली"),
            listOf("Cretinism (Severe irreversible infantile intellectual disability and skeletal dysplasia)", "Myxedema (Adult hypothyroidism)", "Gigantism (Excess GH in children)", "Acromegaly (Excess GH in adults)"),
            0,
            "गर्भावस्था या जन्म के बाद थायरॉक्सिन की भारी कमी से बच्चे की शारीरिक वृद्धि और मस्तिष्क का विकास स्थायी रूप से रुक जाता है, जिसे 'क्रेटिनिज्म' (Cretinism) कहते हैं। वयस्कों में हाइपोथायरायडिज्म को 'मिक्सिडीमा' (Myxedema) कहते हैं।",
            "Thyroid hormone is essential for cerebral neurogenesis, myelination, and skeletal endochondral ossification; neonatal deficiency causes profound developmental arrest (Cretinism).",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q8", "sci_8",
            "वयस्कों में पीयूष ग्रंथि (Pituitary Gland) द्वारा वृद्धि हार्मोन (Growth Hormone / GH) के अत्यधिक स्राव से चेहरे और हाथ-पैरों की हड्डियों के अत्यधिक बढ़ने का विकार क्या कहलाता है?",
            "Hypersecretion of Growth Hormone (Somatotropin) by a pituitary adenoma in adults after epiphyseal plate closure produces which disfiguring condition?",
            listOf("एक्रोमेगाली (Acromegaly - enlargement of hands, feet, jaw, and facial bones)", "गिगांटिज्म / महाकायता", "ड्वार्फिज्म / बौनापन", "कुशिंग सिंड्रोम"),
            listOf("Acromegaly (Mandibular prognathism, frontal bossing, and enlarged extremities due to elevated IGF-1)", "Gigantism (Pre-pubertal GH hypersecretion)", "Pituitary Dwarfism", "Cushing's Syndrome"),
            0,
            "वयस्क होने के बाद हड्डियों की लंबाई नहीं बढ़ सकती, इसलिए अतिरिक्त ग्रोथ हार्मोन से जबड़ा, नाक, हाथ और पैरों की हड्डियां चौड़ी और मोटी हो जाती हैं, जिसे 'एक्रोमेगाली' कहते हैं। बचपन में अधिक स्राव से 'गिगांटिज्म' होता है।",
            "Acromegaly results from autonomous GH hypersecretion stimulating hepatic IGF-1 synthesis, causing acral periosteal bone overgrowth, soft-tissue hypertrophy, and visceral organomegaly.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m9_q9", "sci_8",
            "अधिवृक्क ग्रंथि (Adrenal Cortex) द्वारा कोर्टिसोल हार्मोन के अत्यधिक स्राव से 'मून फेस' (Moon Face) और 'बफेलो हम्प' वाला विकार क्या कहलाता है?",
            "Hypercortisolemia characterized by central truncal obesity, rounded 'moon face', dorsal fat pad 'buffalo hump', and purple abdominal striae is diagnosed as:",
            listOf("कुशिंग सिंड्रोम (Cushing's Syndrome)", "एडिसन रोग", "हाशिमोटो रोग", "डायबिटीज इंसिपिडस"),
            listOf("Cushing's Syndrome (Hypercortisolism due to adrenal adenoma, pituitary ACTH adenoma / Cushing's disease, or chronic corticosteroid therapy)", "Addison's Disease", "Hashimoto's Thyroiditis", "Diabetes Insipidus"),
            0,
            "कोर्टिसोल (तनाव हार्मोन) की अत्यधिक मात्रा से प्रोटीन टूटता है और वसा चेहरे, गर्दन के पीछे (Buffalo hump) और पेट पर जमा हो जाती है, जिसे 'कुशिंग सिंड्रोम' कहते हैं। कोर्टिसोल की कमी से 'एडिसन रोग' (Addison's Disease) होता है।",
            "Cushing's syndrome stems from chronic supraphysiological glucocorticoid exposure, triggering gluconeogenesis, muscle proteolysis, skin thinning, hypertension, and characteristic centripetal adiposity.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m9_q10", "sci_8",
            "डायबिटीज इंसिपिडस (Diabetes Insipidus / उदकमेह) किस हार्मोन की कमी से होता है जिसमें रोगी को बार-बार अत्यधिक मात्रा में पतला मूत्र (Polyuria) आता है?",
            "Diabetes Insipidus, characterized by severe polydipsia and excretion of massive volumes of dilute, glucose-free urine, is caused by deficiency or resistance to:",
            listOf("एंटी-डाइयूरेटिक हार्मोन / वैसोप्रेसिन (ADH - Antidiuretic Hormone / Vasopressin)", "इंसुलिन", "ग्लूकागन", "ऑक्सीटोसिन"),
            listOf("Antidiuretic Hormone (ADH / Arginine Vasopressin secreted by posterior pituitary)", "Insulin (Deficiency causes Diabetes Mellitus)", "Glucagon", "Oxytocin"),
            0,
            "ADH हार्मोन हाइपोथैलेमस में बनता है और पोस्टीरियर पिट्यूटरी से निकलता है। यह गुर्दे की नलिकाओं से पानी को अवशोषित करता है। ADH न होने पर गुर्दे पानी नहीं रोक पाते और दिन में 10-15 लीटर तक मूत्र निकलता है। इसमें शर्करा (ग्लूकोज) नहीं होती।",
            "Central Diabetes Insipidus results from inadequate neurohypophyseal secretion of AVP/ADH, preventing aquaporin-2 water channel insertion in renal collecting ducts and precipitating severe polyuria.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q11", "sci_8",
            "हड्डी घनत्व में भारी गिरावट और हड्डियों के खोखले व भुरभुरे होकर आसानी से फ्रैक्चर होने का रोग (विशेषकर रजोनिवृत्त महिलाओं में) क्या कहलाता है?",
            "The systemic skeletal metabolic bone disorder characterized by low Bone Mineral Density (BMD) and microarchitectural deterioration leading to fragility fractures is termed:",
            listOf("ऑस्टियोपोरोसिस (Osteoporosis / अस्थि सुषिरता)", "ऑस्टियोमलेशिया", "गठिया", "रिकेट्स"),
            listOf("Osteoporosis (T-score ≤ -2.5 on DEXA scan, exacerbated by postmenopausal estrogen decline)", "Osteomalacia (Adult soft bones due to Vitamin D deficiency)", "Osteoarthritis", "Nutritional Rickets"),
            0,
            "महिलाओं में मेनोपॉज के बाद एस्ट्रोजन हार्मोन घटने से अस्थि-शोषक कोशिकाएं (Osteoclasts) तेजी से हड्डियों का कैल्शियम सोखने लगती हैं, जिससे हड्डियां कमजोर हो जाती हैं। इसकी जांच 'DEXA स्कैन' द्वारा की जाती है।",
            "Postmenopausal osteoporosis is driven by estrogen withdrawal which upregulates RANKL signaling, accelerating osteoclastic bone resorption relative to osteoblastic bone formation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q12", "sci_8",
            "मानव आंख में रेटिना के पीछे प्रकाश केंद्रित होने के कारण दूर की वस्तुएं साफ और पास की वस्तुएं धुंधली दिखने का दृष्टि दोष (Hypermetropia / दूर दृष्टि दोष) किस लेंस द्वारा ठीक किया जाता है?",
            "Hypermetropia (Farsightedness, where light rays focus behind the retina) is optically corrected using which spectacle lens?",
            listOf("उत्तल लेंस (Convex Lens - Converging Lens)", "अवतल लेंस (Concave Lens for Myopia)", "बेलनाकार लेंस (Cylindrical Lens for Astigmatism)", "द्विफोकसी लेंस (Bifocal Lens)"),
            listOf("Convex Lens (Converging positive diopter lens)", "Concave Lens (Diverging lens for Myopia / Nearsightedness)", "Cylindrical Lens (For Astigmatism)", "Bifocal Lens (For Presbyopia)"),
            0,
            "निकट दृष्टि दोष (Myopia) में अवतल लेंस (Concave Lens) और दूर दृष्टि दोष (Hypermetropia) में उत्तल लेंस (Convex Lens) का चश्मा लगाया जाता है। बुढ़ापे में होने वाले 'जरा दूरदृष्टिता' (Presbyopia) में द्विफोकसी (Bifocal) लेंस लगता है।",
            "Hypermetropia occurs when the eyeball is too short or corneal refractive power is insufficient; a convex lens adds converging power to shift the focal plane forward directly onto the fovea centralis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q13", "sci_8",
            "आंख के प्राकृतिक क्रिस्टलीय लेंस के धुंधले या अपारदर्शी (Cloudy / Opaque) हो जाने से दृष्टि समाप्त होने का सबसे प्रमुख रोग कौन-सा है?",
            "The gradual clouding and opacification of the eye's natural crystalline lens, leading to progressive painless vision loss, is termed:",
            listOf("मोतियाबिंद (Cataract)", "ग्लूकोमा (काला मोतिया)", "ट्रेकोमा", "कंजंक्टिवाइटिस"),
            listOf("Cataract (Senile protein denaturation in lens matrix, corrected surgically by Phacoemulsification and Intraocular Lens - IOL implantation)", "Glaucoma (Elevated intraocular pressure damaging optic nerve)", "Trachoma", "Infectious Conjunctivitis"),
            0,
            "मोतियाबिंद (Cataract) में लेंस के क्रिस्टलिन प्रोटीन विकृत होकर सफेद व अपारदर्शी हो जाते हैं। आधुनिक 'फेकोइमल्सीफिकेशन' (Phaco) सर्जरी द्वारा अल्ट्रासाउंड से खराब लेंस निकालकर कृत्रिम लेंस (IOL) लगा दिया जाता है।",
            "Cataractogenesis involves post-translational oxidative cross-linking, aggregation, and insolubilization of lens crystallin proteins, scattering incident light rays and degrading retinal image contrast.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m9_q14", "sci_8",
            "काला मोतिया (Glaucoma / दृष्टि चोर) रोग में आंख के अंदर किस तरल का दबाव (Intraocular Pressure - IOP) बढ़ जाने से ऑप्टिक नर्व स्थायी रूप से नष्ट हो जाती है?",
            "Glaucoma ('Silent thief of sight') causes irreversible blindness due to optic nerve atrophy triggered primarily by elevated intraocular pressure of which ocular fluid?",
            listOf("नेत्रोद / जलीय द्रव (Aqueous Humor / Elevated IOP in anterior chamber)", "काचाभ द्रव (Vitreous Humor)", "आंसू तरल", "रक्त सीरम"),
            listOf("Aqueous Humor (Obstruction of trabecular meshwork drainage elevating Intraocular Pressure above normal 10-21 mmHg)", "Vitreous Humor", "Lacrimal tears", "Blood serum"),
            0,
            "नेत्रोद (Aqueous Humor) का सामान्य दबाव 10-21 mmHg होता है। जब इसकी निकासी नली (ट्रैबेकुलर मेशवर्क) बंद हो जाती है, तो दबाव बढ़कर ऑप्टिक तंत्रिका को सुखा देता है, जिससे परिधीय दृष्टि (Tunnel vision) खत्म हो जाती है।",
            "Impaired outflow of aqueous humor through the trabecular meshwork and Canal of Schlemm elevates intraocular pressure (IOP), inducing mechanical compression and ischemic axonal apoptosis of retinal ganglion cells.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m9_q15", "sci_8",
            "शराब (Alcohol) के अत्यधिक और दीर्घकालिक सेवन से यकृत (Liver) की सामान्य कोशिकाओं के नष्ट होकर रेशेदार संयोजी ऊतक (Fibrosis) में बदलने का लाइलाज रोग क्या कहलाता है?",
            "The chronic progressive end-stage liver pathology characterized by replacement of functional hepatic parenchyma with diffuse fibrous scar tissue and regenerative nodules is termed:",
            listOf("यकृत सिरोसिस (Liver Cirrhosis)", "फैटी लिवर ग्रेड 1", "पीलिया", "गॉलब्लेडर स्टोन"),
            listOf("Liver Cirrhosis (Hepatic Cirrhosis leading to portal hypertension, esophageal varices, and ascites)", "Simple hepatic steatosis", "Physiological Jaundice", "Cholelithiasis"),
            0,
            "शराब के मेटाबॉलिज्म से बना 'एसिटैल्डिहाइड' हेपेटोसाइट्स को नष्ट करता है। यकृत की स्टैलेट कोशिकाएं कोलेजन रेशे बनाने लगती हैं (Fibrosis), जिससे लिवर सिकुड़कर कठोर हो जाता है, जिसे 'लिवर सिरोसिस' कहते हैं।",
            "Hepatic stellate cells are transdifferentiated into myofibroblasts by acetaldehyde and oxidative reactive oxygen species (ROS), depositing excessive extracellular matrix collagen that distorts vascular architecture in Cirrhosis.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 10: Global Public Health, Epidemics & Medical Milestones (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m10_q1", "sci_8",
            "विश्व स्वास्थ्य संगठन (WHO - World Health Organization) की स्थापना किस ऐतिहासिक तिथि को हुई थी, जिसे प्रतिवर्ष 'विश्व स्वास्थ्य दिवस' (World Health Day) के रूप में मनाया जाता है?",
            "On which historic date in 1948 was the World Health Organization (WHO) constitution ratified, celebrated annually worldwide as 'World Health Day'?",
            listOf("7 अप्रैल 1948 (7 April 1948)", "1 दिसंबर 1948", "24 अक्टूबर 1945", "15 अगस्त 1947"),
            listOf("7 April 1948 (Headquarters in Geneva, Switzerland)", "1 December 1948 (World AIDS Day)", "24 October 1945 (UN Day)", "15 August 1947"),
            0,
            "WHO की स्थापना 7 अप्रैल 1948 को हुई थी। इसका मुख्यालय जिनेवा (स्विट्जरलैंड) में है। प्रत्येक वर्ष 7 अप्रैल को वैश्विक स्वास्थ्य जागरूकता हेतु 'विश्व स्वास्थ्य दिवस' मनाया जाता है।",
            "WHO is the specialized United Nations agency for international public health, founded on 7 April 1948 and governed by the World Health Assembly in Geneva.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q2", "sci_8",
            "विश्व एड्स दिवस (World AIDS Day) प्रतिवर्ष किस तिथि को वैश्विक स्तर पर मनाया जाता है?",
            "On which date is World AIDS Day observed globally each year to raise awareness and remember those who died from AIDS?",
            listOf("1 दिसंबर (1 December)", "11 जुलाई", "16 सितंबर", "8 मार्च"),
            listOf("1 December (Identified by the Red Ribbon awareness symbol)", "11 July (World Population Day)", "16 September (World Ozone Day)", "8 March (International Women's Day)"),
            0,
            "1 दिसंबर को विश्व एड्स दिवस मनाया जाता है। इसका अंतरराष्ट्रीय प्रतीक 'लाल रिबन' (Red Ribbon) है।",
            "First designated in 1988 by WHO and UNAIDS, World AIDS Day on 1 December unites global efforts to eliminate HIV transmission and stigma.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q3", "sci_8",
            "भारत को किस ऐतिहासिक वर्ष में विश्व स्वास्थ्य संगठन (WHO) द्वारा आधिकारिक तौर पर 'पोलियो मुक्त देश' (Polio-Free Nation) प्रमाणित किया गया?",
            "In which historic year did the South-East Asia Regional Certification Commission of the WHO officially certify India as a 'Polio-Free Country'?",
            listOf("2014 में (27 March 2014)", "2000", "2010", "2020"),
            listOf("2014 (Official certification awarded on 27 March 2014 after three consecutive years without wild poliovirus transmission)", "2000", "2010", "2020"),
            0,
            "भारत में वाइल्ड पोलियो वायरस का अंतिम मामला 13 जनवरी 2011 को हावड़ा (पश्चिम बंगाल) में 2 वर्षीय बच्ची रुखसार में मिला था। लगातार 3 वर्ष शून्य मामले रहने के बाद 27 मार्च 2014 को भारत को पोलियो मुक्त घोषित किया गया।",
            "India eradicated wild poliovirus through the sustained National Pulse Polio Programme (OPV immunization and environmental sewage surveillance), certified polio-free by WHO in March 2014.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q4", "sci_8",
            "भारत में टीबी (क्षय रोग) की रोकथाम हेतु 'प्रत्यक्ष प्रेक्षित उपचार लघु-अवधि' (DOTS) प्रणाली का पूर्ण रूप क्या है?",
            "What is the full expansion of DOTS, the internationally recommended comprehensive strategy for Tuberculosis control implemented in India?",
            listOf("डायरेक्टली ऑब्जर्व्ड ट्रीटमेंट, शॉर्ट-कोर्स (Directly Observed Treatment, Short-course)", "डेली ओरल थेरेपी सिस्टम", "ड्रग्स ऑन टाइम स्कीम", "डायग्नोस्टिक ऑप्टिकल टेस्ट सिस्टम"),
            listOf("Directly Observed Treatment, Short-course (Ensuring patient swallows each dose under supervision of a healthcare provider)", "Daily Oral Therapy Scheme", "Drugs On Time Schedule", "Diagnostic Optical Treatment Strategy"),
            0,
            "डॉट्स (DOTS) में स्वास्थ्य कार्यकर्ता या आशा बहु के सामने टीबी रोगी को दवाइयां (रिफैम्पिसिन, आइसोनियाजिड, पाइराजीनामाइड, एथमब्यूटोल) खिलाई जाती हैं ताकि दवा बीच में छोड़ने से MDR-TB (ड्रग रेजिस्टेंट टीबी) न बने।",
            "DOTS strategy integrates political commitment, case detection via quality-assured sputum bacteriology, standardized supervised short-course chemotherapy, uninterrupted drug supply, and standardized reporting.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q5", "sci_8",
            "भारत में 1970 के दशक में किस विनाशकारी जल जनित रोग से शिशुओं की जान बचाने हेतु 'ओआरएस' (ORS - Oral Rehydration Salts) घोल का क्रांतिकारी आविष्कार डॉ. दिलीप महालनाबिस ने किया था?",
            "Oral Rehydration Solution (ORS, developed by Dr. Dilip Mahalanabis during the 1971 Bangladesh refugee crisis) saves millions of infants from dehydration caused by:",
            listOf("हैजा एवं डायरिया / दस्त (Cholera and Acute Watery Diarrhoea)", "मलेरिया", "पोलियो", "टीबी"),
            listOf("Cholera and Severe Dehydrating Diarrhoea (Exploiting sodium-glucose co-transport mechanism in small intestinal enterocytes)", "Malaria", "Poliomyelitis", "Pulmonary Tuberculosis"),
            0,
            "डॉ. दिलीप महालनाबिस ने सिद्ध किया कि ग्लूकोज और नमक (सोडियम) को 1:1 अनुपात में पानी में मिलाकर देने से आंतों में सोडियम-ग्लूकोज को-ट्रांसपोर्टर सक्रिय हो जाता है और पानी का अवशोषण 25 गुना बढ़ जाता है। लैंसेट पत्रिका ने इसे '20वीं सदी की सबसे बड़ी चिकित्सा खोज' कहा था।",
            "ORS formulations utilize the intact SGLT-1 intestinal epithelial carrier system where sodium is actively co-transported with D-glucose against electrical gradients, drawing water isosmotically into vascular circulation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q6", "sci_8",
            "पीने के पानी को कीटाणुरहित करने के लिए कौन-सी गैस या रासायनिक यौगिक का उपयोग सबसे व्यापक रूप से किया जाता है?",
            "Which halogen gas or oxidizing chemical compound is universally added to municipal drinking water supplies for residual microbial disinfection (Water Chlorination)?",
            listOf("क्लोरीन गैस / ब्लीचिंग पाउडर (Chlorine Gas / Calcium Hypochlorite / Chloramines)", "हीलियम", "नाइट्रोजन", "आर्गन"),
            listOf("Chlorine Gas / Calcium Hypochlorite Bleaching Powder / Sodium Hypochlorite", "Helium", "Pure Nitrogen", "Argon"),
            0,
            "क्लोरीन पानी में घुलकर 'हाइपोक्लोरस एसिड' (HOCl) बनाता है जो जीवाणुओं की कोशिका झिल्ली और एंजाइमों को ऑक्सीकृत कर नष्ट कर देता है। सुरक्षित पेयजल में 0.2 से 0.5 mg/L अवशिष्ट क्लोरीन होना चाहिए।",
            "Chlorine hydrolysis forms hypochlorous acid (HOCl) and hypochlorite ions (OCl-); unionized HOCl penetrates bacterial phospholipid membranes, oxidizing sulfhydryl groups of glycolytic enzymes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q7", "sci_8",
            "मानव शरीर में रक्त का थक्का जमाने वाली प्राथमिक रक्त कणिकाएं (Platelets) का चिकित्सकीय नाम क्या है?",
            "What is the medical cytological designation for human blood Platelets responsible for primary hemostasis and clot formation?",
            listOf("थ्रोम्बोसाइट्स (Thrombocytes)", "एरिथ्रोसाइट्स (लाल रक्त कणिकाएं)", "ल्यूकोसाइट्स (श्वेत रक्त कणिकाएं)", "मोनोसाइट्स"),
            listOf("Thrombocytes (Anucleated cell fragments budded from bone marrow megakaryocytes)", "Erythrocytes (Red blood cells)", "Leukocytes (White blood cells)", "Monocytes"),
            0,
            "रक्त प्लेटलेट्स को 'थ्रोम्बोसाइट्स' कहते हैं। सामान्य वयस्क में इनकी संख्या 1.5 से 4.5 लाख प्रति माइक्रोलीटर होती है। डेंगू में प्लेटलेट्स की संख्या 50,000 से नीचे गिरना 'थ्रोम्बोसाइटोपेनिया' कहलाता है।",
            "Thrombocytes are cytoplasmic fragments derived from marrow megakaryocytes; upon vascular injury, they adhere to exposed subendothelial von Willebrand factor, aggregate, and form primary hemostatic plugs.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q8", "sci_8",
            "एनीमिया (Anaemia / रक्ताल्पता) मुख्य रूप से रक्त में किसकी कमी से होता है?",
            "Clinical Anaemia is hematologically defined as a pathological reduction below normal reference ranges in:",
            listOf("हीमोग्लोबिन की मात्रा या लाल रक्त कोशिकाओं (RBC) की संख्या", "श्वेत रक्त कोशिकाओं की संख्या", "रक्त में ग्लूकोज की मात्रा", "रक्तचाप"),
            listOf("Hemoglobin concentration (Hb < 12 g/dL in adult females, < 13 g/dL in adult males) or circulating Erythrocyte count", "Leukocyte count", "Blood Glucose level", "Blood Pressure"),
            0,
            "एनीमिया में रक्त की ऑक्सीजन ले जाने की क्षमता घट जाती है। भारत में सबसे आम 'आयरन डेफिशिएंसी एनीमिया' (IDA) है। भारत सरकार इसे रोकने हेतु 'एनीमिया मुक्त भारत' (AMB - 6x6x6 रणनीति) चला रही है।",
            "Anaemia reduces oxygen-carrying capacity of peripheral blood, presenting with fatigue, pallor, tachycardia, and dyspnea. Iron deficiency anemia manifests with microcytic hypochromic red cell indices.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q9", "sci_8",
            "चिकित्सा विज्ञान में 'ब्लड कैंसर' (Blood Cancer) को किस नाम से जाना जाता है जिसमें अस्थि मज्जा में असामान्य श्वेत रक्त कणिकाओं (WBC) की अनियंत्रित वृद्धि होती है?",
            "Which hematological malignancy of the bone marrow and lymphoid tissues is characterized by rapid clonal proliferation of abnormal white blood cells (Leukocytes)?",
            listOf("ल्यूकेमिया (Leukemia)", "लिंफोमा", "मेलेनोमा", "कार्सिनोमा"),
            listOf("Leukemia (Acute Lymphoblastic Leukemia - ALL, Acute Myeloid Leukemia - AML, CML, CLL)", "Lymphoma (Hodgkin / Non-Hodgkin)", "Melanoma (Skin cancer)", "Carcinoma (Epithelial cancer)"),
            0,
            "ल्यूकेमिया में अस्थि मज्जा (Bone marrow) में अपरिपक्व ब्लास्ट कोशिकाएं इतनी तेजी से बढ़ती हैं कि सामान्य आरबीसी और प्लेटलेट्स का निर्माण रुक जाता है, जिससे गंभीर एनीमिया, संक्रमण और रक्तस्राव होता है।",
            "Leukemia arises from oncogenic hematopoietic stem cell mutations causing maturation arrest and unrestrained marrow expansion of leukemic blasts, crowding out normal erythropoiesis and thrombopoiesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q10", "sci_8",
            "मानव शरीर में रक्त शर्करा (Blood Sugar) को नियंत्रित करने के लिए इंसुलिन हार्मोन की खोज 1921 में टोरंटो विश्वविद्यालय में किसने की थी?",
            "Who discovered the hormone Insulin from canine pancreatic extracts in 1921, saving millions of diabetic patients (Nobel Prize in 1923)?",
            listOf("सर फ्रेडरिक बैंटिंग एवं चार्ल्स बेस्ट (Sir Frederick Banting & Charles Best)", "अलेक्जेंडर फ्लेमिंग", "एडवर्ड जेनर", "लुई पाश्चर"),
            listOf("Sir Frederick Banting and Charles Best (with J.J.R. Macleod and James Collip)", "Alexander Fleming", "Edward Jenner", "Louis Pasteur"),
            0,
            "1921 में फ्रेडरिक बैंटिंग और चार्ल्स बेस्ट ने कुत्ते के अग्न्याशय से इंसुलिन निकाला। 14 वर्षीय लड़के लियोनार्ड थॉम्पसन को 1922 में इंसुलिन का पहला सफल इंजेक्शन दिया गया। 14 नवंबर को बैंटिंग के जन्मदिन पर 'विश्व मधुमेह दिवस' मनाया जाता है।",
            "Banting and Macleod were awarded the 1923 Nobel Prize for purifying bovine pancreatic insulin, transforming fatal Type 1 diabetes into a medically manageable condition.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q11", "sci_8",
            "भारत सरकार की 'आयुष्मान भारत - प्रधानमंत्री जन आरोग्य योजना' (AB-PMJAY) के तहत प्रत्येक पात्र परिवार को प्रतिवर्ष कितने रुपये का मुफ्त स्वास्थ्य बीमा कवर दिया जाता है?",
            "Under the Government of India's Ayushman Bharat PM-JAY scheme (world's largest government-funded healthcare assurance scheme), what is the annual cashless hospitalization cover per eligible family?",
            listOf("₹5 लाख प्रतिवर्ष (₹5 Lakh per family per year for secondary & tertiary hospitalization)", "₹1 लाख", "₹10 लाख", "₹2 लाख"),
            listOf("₹5,00,000 per family per year (Cashless and paperless inpatient access at empanelled public and private hospitals)", "₹1,00,000", "₹10,00,000", "₹2,00,000"),
            0,
            "PM-JAY योजना 23 सितंबर 2018 को रांची (झारखंड) से शुरू की गई थी। यह देश के 12 करोड़ से अधिक गरीब और कमजोर परिवारों (55 करोड़ नागरिकों) को ₹5 लाख का द्वितीयक व तृतीयक कैशलेस इलाज प्रदान करती है।",
            "Ayushman Bharat PM-JAY operates on a pan-India portable platform managed by the National Health Authority (NHA), covering pre-existing conditions and over 1,900 surgical/medical packages.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q12", "sci_8",
            "विश्व भर में 24 मार्च को 'विश्व क्षय रोग दिवस' (World TB Day) क्यों मनाया जाता है?",
            "Why is World Tuberculosis (TB) Day observed globally on 24 March each year?",
            listOf("24 मार्च 1882 को डॉ. रॉबर्ट कोच ने टीबी के जीवाणु 'माइकोबैक्टीरियम ट्यूबरकुलोसिस' की खोज की घोषणा की थी", "इस दिन टीबी का पहला टीका बना था", "इस दिन WHO बना था", "इस दिन भारत टीबी मुक्त हुआ था"),
            listOf("Dr. Robert Koch announced the discovery of Mycobacterium tuberculosis bacterium on 24 March 1882 in Berlin", "First TB vaccine was patented", "WHO was established", "India eradicated TB"),
            0,
            "24 मार्च 1882 को बर्लिन में फिजियोलॉजिकल सोसायटी में रॉबर्ट कोच ने टीबी के जीवाणु की खोज प्रस्तुत की थी। कोच को 1905 में चिकित्सा का नोबेल पुरस्कार मिला था।",
            "On March 24, 1882, Robert Koch delivered his historic presentation identifying the tubercle bacillus, opening the pathway to tuberculosis diagnosis and therapeutic cure.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q13", "sci_8",
            "रक्त आधान (Blood Transfusion) में 'सर्वदाता' (Universal Blood Donor) और 'सर्वग्राही' (Universal Blood Recipient) क्रमशः कौन-से रक्त समूह कहलाते हैं?",
            "In the ABO and Rh human blood group systems, which blood types are designated as the Universal Donor and Universal Recipient respectively?",
            listOf("O-नेगेटिव (Universal Donor) एवं AB-पॉजिटिव (Universal Recipient)", "A-पॉजिटिव एवं B-नेगेटिव", "AB-नेगेटिव एवं O-पॉजिटिव", "B-पॉजिटिव एवं O-नेगेटिव"),
            listOf("O-Negative (Universal Donor lacking A, B, and Rh D surface antigens) and AB-Positive (Universal Recipient lacking anti-A, anti-B, and anti-Rh antibodies)", "A-Positive and B-Negative", "AB-Negative and O-Positive", "B-Positive and O-Negative"),
            0,
            "O-Negative की लाल रक्त कोशिकाओं पर कोई A, B या Rh एंटीजन नहीं होता, इसलिए इसका रक्त किसी भी मरीज को दिया जा सकता है। AB-Positive के प्लाज्मा में कोई एंटीबॉडी नहीं होती, इसलिए यह किसी का भी रक्त ले सकता है। कार्ल लैंडस्टीनर ने 1900 में ABO रक्त समूह खोजा था।",
            "Karl Landsteiner discovered the ABO blood groups (1930 Nobel Prize). O-negative red blood cells evade allogeneic antibody agglutination, while AB-positive serum lacks agglutinins against ABO/Rh determinants.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m10_q14", "sci_8",
            "एरिथ्रोब्लास्टोसिस फीटेलिस (Erythroblastosis Fetalis / नवजात का हीमोलिटिक रोग) किस स्थिति में माता और गर्भस्थ शिशु के Rh कारक के असंगत (Incompatible) होने पर होता है?",
            "Hemolytic Disease of the Newborn (Erythroblastosis Fetalis) occurs during second pregnancy when maternal and fetal Rh blood factors are:",
            listOf("Rh-नेगेटिव माता और Rh-पॉजिटिव गर्भस्थ शिशु (Rh-Negative Mother carrying Rh-Positive Fetus)", "Rh-पॉजिटिव माता और Rh-नेगेटिव शिशु", "दोनों Rh-पॉजिटिव", "दोनों Rh-नेगेटिव"),
            listOf("Rh-Negative Mother and Rh-Positive Fetus (Maternal anti-Rh IgG antibodies crossing placenta to lyse fetal RBCs)", "Rh-Positive Mother and Rh-Negative Fetus", "Both Rh-Positive", "Both Rh-Negative"),
            0,
            "पहले प्रसव के समय Rh-पॉजिटिव शिशु का रक्त मिलने से Rh-नेगेटिव माता के शरीर में Rh एंटीबॉडीज (IgG) बन जाती हैं। दूसरे Rh-पॉजिटिव गर्भ के समय ये एंटीबॉडीज प्लेसेंटा पार कर भ्रूण के आरबीसी को नष्ट कर देती हैं। इसे रोकने हेतु जन्म के बाद माता को 'RhoGAM' (एंटी-D) इंजेक्शन लगाया जाता है।",
            "Maternal alloimmunization occurs during fetomaternal hemorrhage; subsequent pregnancies with Rh-positive fetuses trigger transplacental transfer of maternal IgG anti-D antibodies, causing fetal hydrops and kernicterus.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m10_q15", "sci_8",
            "मानव शरीर का 'थर्मोस्टेट' (Thermostat / तापमान नियंत्रण केंद्र) मस्तिष्क के किस भाग में स्थित होता है जो बुखार में पसीना लाकर शरीर को ठंडा करता है?",
            "Which vital anatomical region of the diencephalon in the human brain functions as the master biological Thermostat regulating core body temperature (37°C / 98.6°F)?",
            listOf("हाइपोथैलेमस (Hypothalamus - Preoptic Anterior Nucleus)", "मेडुला ऑबलांगाटा", "सेरिबैलम", "थैलेमस"),
            listOf("Hypothalamus (Anterior preoptic area for heat dissipation / Posterior area for heat conservation)", "Medulla oblongata (Cardiac & respiratory center)", "Cerebellum (Balance & coordination)", "Thalamus (Sensory relay station)"),
            0,
            "हाइपोथैलेमस शरीर के तापमान को 37°C (98.6°F) पर नियंत्रित रखता है। शरीर गर्म होने पर यह पसीना और रक्त वाहिकाओं का फैलाव (Vasodilation) कराता है; ठंड लगने पर कंपकंपी (Shivering) कराकर गर्मी पैदा करता है।",
            "The preoptic area of the anterior hypothalamus integrates peripheral and central thermoreceptor inputs, modulating sympathetic cutaneous vasomotor tone and eccrine sweating to maintain homeostatic core thermal balance.",
            "Easy"
        )
    )
}
