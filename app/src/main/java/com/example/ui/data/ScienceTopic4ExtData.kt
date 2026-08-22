package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic4ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m6_q1", "sci_4",
            "संश्लेषित अपमार्जक (Synthetic Detergents) साबुन की तुलना में कठोर जल (Hard Water) में भी आसानी से झाग क्यों देते हैं?",
            "Why do Synthetic Detergents lather effectively in Hard Water unlike conventional soaps?",
            listOf("वे अधिक चिकने होते हैं", "उनके कैल्शियम और मैग्नीशियम लवण जल में घुलनशील होते हैं और मैल (Scum) नहीं बनाते", "उनमें अधिक एसिड होता है", "वे भारी होते हैं"),
            listOf("They are oilier", "Their Calcium and Magnesium salts are water-soluble and do not precipitate insoluble curd (Scum)", "More acidic", "Heavier"),
            1,
            "साबुन कठोर जल के Ca²⁺ और Mg²⁺ के साथ अघुलनशील अवक्षेप (Scum) बना लेता है जिससे झाग नहीं बनता। अपमार्जक लंबी श्रृंखला वाले अल्काइल बेंजीन सल्फोनेट होते हैं जिनके Ca/Mg लवण जल में पूरी तरह घुलनशील रहते हैं।",
            "Detergents are sodium alkylbenzene sulfonates whose Ca²⁺ and Mg²⁺ salts remain completely soluble in hard water, avoiding insoluble precipitate formation.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m6_q2", "sci_4",
            "कांच (Glass) रासायनिक रूप से क्या है?",
            "Chemically and physically, standard Soda-Lime Glass is classified as an:",
            listOf("क्रिस्टलीय ठोस", "अक्रिस्टलीय अतिशीतित द्रव (Amorphous Supercooled Liquid / Non-crystalline Solid)", "तत्व", "शुद्ध यौगिक"),
            listOf("Crystalline solid", "Amorphous Supercooled Liquid (Homogeneous mixture of sodium and calcium silicates)", "Element", "Pure compound"),
            1,
            "कांच सोडियम सिलिकेट और कैल्शियम सिलिकेट (Na₂O·CaO·6SiO₂) का अक्रिस्टलीय मिश्रण है। इसमें कोई निश्चित गलनांक नहीं होता और यह अत्यंत उच्च श्यानता वाला अतिशीतित द्रव (Supercooled liquid) माना जाता है।",
            "Glass is an amorphous, non-crystalline supercooled liquid consisting of a disordered fused network of silica (SiO₂), sodium silicate, and calcium silicate.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q3", "sci_4",
            "बुलेटप्रूफ कांच (Bulletproof Glass / Laminated Glass) बनाने के लिए कांच की परतों के बीच किस मजबूत पॉलीमर की शीट लगाई जाती है?",
            "Laminated ballistic Bulletproof Glass sandwiches transparent sheets of which tough thermoplastic resin between glass layers?",
            listOf("पॉलीथीन", "पॉलीकार्बोनेट (Polycarbonate) और पॉलीविनाइल ब्यूटिरल (PVB)", "टेफ्लॉन", "बैकेलाइट"),
            listOf("Polythene", "Polycarbonate (Lexan) and Polyvinyl Butyral (PVB) interlayer", "Teflon", "Bakelite"),
            1,
            "बुलेटप्रूफ कांच में सख्त कांच की परतों के बीच पॉलीकार्बोनेट (Lexan) और PVB की लचीली परतें जोड़ी जाती हैं, जो गोली के प्रभाव की गतिज ऊर्जा को अवशोषित और विकीर्ण कर देती हैं।",
            "Bullet-resistant glass utilizes layered composites of tempered glass and impact-absorbing transparent Polycarbonate/PVB interlayers to dissipate projectile energy.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q4", "sci_4",
            "पोर्टलैंड सीमेंट (Portland Cement) का प्रमुख घटक क्या है जिसकी खोज 1824 में जोसेफ एस्पडिन ने की थी?",
            "What is the predominant chemical oxide component of Portland Cement (comprising 60-67% by weight)?",
            listOf("सिलिका (SiO₂)", "कैल्शियम ऑक्साइड / चूना (Lime - CaO, 60-67%)", "एल्युमिना (Al₂O₃)", "आयरन ऑक्साइड"),
            listOf("Silica (SiO₂)", "Calcium Oxide / Quicklime (CaO, 60-67%)", "Alumina (Al₂O₃)", "Iron Oxide"),
            1,
            "सीमेंट में मुख्य रूप से चूना (CaO: 60-67%), सिलिका (SiO₂: 17-25%), एल्युमिना (Al₂O₃: 3-8%), और आयरन ऑक्साइड (Fe₂O₃: 0.5-6%) होते हैं। सीमेंट को जमने में धीमा करने के लिए 2-3% जिप्सम मिलाया जाता है।",
            "Portland Cement consists primarily of Quicklime (CaO, 60-67%) and Silica (SiO₂, 17-25%). Gypsum (CaSO₄·2H₂O) is blended to retard flash setting.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q5", "sci_4",
            "सीमेंट के निर्माण में जिप्सम (Gypsum - CaSO₄·2H₂O) क्यों मिलाया जाता है?",
            "Why is 2 to 3% Gypsum added to finely ground cement clinker during manufacturing?",
            listOf("सीमेंट को तुरंत जमाने के लिए", "सीमेंट के जमने की दर को धीमा करने के लिए (To Retard Initial Setting Time)", "सीमेंट को रंग देने के लिए", "मजबूती घटाने के लिए"),
            listOf("To flash-set cement instantly", "To retard the initial setting rate and allow workable placement time", "To impart grey color", "To reduce strength"),
            1,
            "जिप्सम ट्राइकैल्शियम एल्युमिनेट (C₃A) के साथ क्रिया करके सीमेंट को तुरंत (Flash set) जमने से रोकता है, जिससे राजमिस्त्री को कंक्रीट मिलाने और बिछाने का पर्याप्त समय (Initial setting time ~30 मिनट) मिल जाता है।",
            "Gypsum acts as a setting retarder by forming ettringite crystals around tricalcium aluminate, preventing instantaneous flash setting.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q6", "sci_4",
            "यूरिया (Urea - NH₂CONH₂) प्रयोगशाला में संश्लेषित होने वाला पहला कार्बनिक यौगिक था। 1828 में इसे अकार्बनिक अमोनियम साइनाइड से किसने बनाया?",
            "Who synthesized Urea (the first synthetic organic molecule) from inorganic Ammonium Cyanate in 1828, overthrowing the Vital Force Theory?",
            listOf("एंटोनी लेवोजिए", "फ्रेडरिक वोहलर (Friedrich Wöhler)", "लुई पाश्चर", "जॉन डाल्टन"),
            listOf("Antoine Lavoisier", "Friedrich Wöhler (Ammonium cyanate NH₄CNO → Urea NH₂CONH₂)", "Louis Pasteur", "John Dalton"),
            1,
            "जर्मन रसायनशास्त्री फ्रेडरिक वोहलर ने अमोनियम साइनाइड (NH₄CNO) को गर्म करके यूरिया (NH₂CONH₂) का संश्लेषण किया और सिद्ध किया कि कार्बनिक यौगिक प्रयोगशाला में बिना किसी 'जैव-शक्ति' (Vital Force) के बनाए जा सकते हैं।",
            "Friedrich Wöhler's 1828 synthesis of Urea from Ammonium Cyanate marked the birth of modern organic chemistry and dismantled Berzelius's Vital Force theory.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q7", "sci_4",
            "यूरिया (Urea) उर्वरक में नाइट्रोजन का प्रतिशत कितना होता है और पौधे इसे किस रूप में अवशोषित करते हैं?",
            "What is the Nitrogen content in commercial Urea fertilizer, and in which chemical form do plant roots primarily assimilate it?",
            listOf("21%, अमोनिया", "46% नाइट्रोजन (Nitrate - NO₃⁻ और Ammonium - NH₄⁺ रूप में)", "33%, नाइट्राइट", "18%, यूरिया"),
            listOf("21%, Ammonia", "46% Nitrogen (Assimilated after soil hydrolysis into Nitrate NO₃⁻ and Ammonium NH₄⁺)", "33%, Nitrite", "18%, Urea"),
            1,
            "यूरिया (NH₂CONH₂) में सर्वाधिक 46% नाइट्रोजन होती है। मिट्टी में यूरेज एंजाइम इसे अमोनियम और फिर नाइट्रीकारक जीवाणु (Nitrosomonas / Nitrobacter) इसे नाइट्रेट (NO₃⁻) में बदलते हैं जिसे पौधे ग्रहण करते हैं।",
            "Commercial urea contains 46% nitrogen (N). Soil urease hydrolyzes it into ammonium and nitrates (NO₃⁻), the principal absorbable nitrogen source for crops.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q8", "sci_4",
            "भोपाल गैस त्रासदी (Bhopal Gas Tragedy - 2-3 दिसंबर 1984) में यूनियन कार्बाइड कारखाने से किस अत्यधिक विषैली गैस का रिसाव हुआ था?",
            "Which lethal toxic gas leaked from the Union Carbide pesticide plant during the Bhopal Gas Tragedy on 2-3 December 1984?",
            listOf("फॉस्जीन गैस", "मिथाइल आइसोसाइनेट (Methyl Isocyanate - MIC / CH₃NCO)", "मस्टर्ड गैस", "कार्बन मोनोऑक्साइड"),
            listOf("Phosgene gas", "Methyl Isocyanate (MIC - CH₃NCO)", "Mustard gas", "Carbon monoxide"),
            1,
            "मिथाइल आइसोसाइनेट (MIC - CH₃NCO) सेविन (कार्बेरिल) कीटनाशक बनाने में प्रयुक्त होती थी। पानी के टैंक में घुसने से अत्यधिक ऊष्माक्षेपी अभिक्रिया हुई और 40 टन MIC गैस का रिसाव हुआ जिससे हजारों लोगों की मृत्यु हुई।",
            "Methyl Isocyanate (MIC) leaked from Tank 610 after an exothermic runaway reaction with water, causing acute pulmonary edema and thousands of immediate fatalities in Bhopal.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q9", "sci_4",
            "लाफिंग गैस (हंसाने वाली गैस / Laughing Gas) का रासायनिक नाम और सूत्र क्या है?",
            "What is the chemical name and molecular formula of Laughing Gas, used as an anesthetic in dentistry?",
            listOf("नाइट्रिक ऑक्साइड (NO)", "नाइट्रस ऑक्साइड (Nitrous Oxide - N₂O)", "नाइट्रोजन डाइऑक्साइड (NO₂)", "डाइनाइट्रोजन ट्राइऑक्साइड (N₂O₃)"),
            listOf("Nitric oxide (NO)", "Nitrous Oxide (N₂O)", "Nitrogen dioxide (NO₂)", "Dinitrogen trioxide (N₂O₃)"),
            1,
            "नाइट्रस ऑक्साइड (N₂O) की खोज जोसेफ प्रीस्टले ने की और हम्फ्री डेवी ने इसके संवेदनाहारी (Anesthetic) और उत्साहवर्धक प्रभावों को खोजा। यह दंत चिकित्सा में बेहोशी की दवा और रॉकेटों में ऑक्सीकारक के रूप में प्रयुक्त होती है।",
            "Nitrous Oxide (N₂O) produces mild euphoria and analgesia when inhaled, serving as a standard dental anesthetic and an automotive internal combustion oxidizer.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q10", "sci_4",
            "अश्रु गैस (Tear Gas / लैक्रीमेटर) के रूप में भीड़ नियंत्रण के लिए मुख्य रूप से किसका उपयोग किया जाता है?",
            "Which chemical agent is commonly deployed in riot control Tear Gas munitions to cause severe ocular tearing and temporary blindness?",
            listOf("क्लोरोफॉर्म", "क्लोरोपिक्रिन / सीएस गैस (Chloropicrin - CCl₃NO₂ / CS Gas - 2-chlorobenzalmalononitrile)", "सल्फर डाइऑक्साइड", "ईथर"),
            listOf("Chloroform", "Chloropicrin (CCl₃NO₂) and CS Gas (2-chlorobenzalmalononitrile)", "Sulfur dioxide", "Ether"),
            1,
            "अश्रु गैस (CS गैस या क्लोरोपिक्रिन CCl₃NO₂) आँखों के कॉर्नियल तंत्रिका तंतुओं को उत्तेजित करती है, जिससे तीव्र जलन, आंसुओं का अनियंत्रित स्राव और श्वास नली में जलन होती है।",
            "CS gas (o-chlorobenzylidene malononitrile) and Chloropicrin are lachrymatory irritants activating ocular and respiratory mucous membranes for crowd dispersion.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q11", "sci_4",
            "टीएनटी (TNT) का पूर्ण रूप क्या है जो एक शक्तिशाली विस्फोटक है?",
            "What is the chemical name and expansion of the high explosive military compound TNT?",
            listOf("ट्राईनाइट्रो टोलुइन (Trinitrotoluene - C₇H₅N₃O₆)", "ट्राईनाइट्रो ट्राइएज़ीन", "टेट्रानाइट्रो टोलुइन", "ट्राईनाइट्रो थर्माइट"),
            listOf("Trinitrotoluene (TNT - 2,4,6-trinitrotoluene)", "Trinitro triazine", "Tetranitrotoluene", "Trinitro thermite"),
            1,
            "TNT (2,4,6-ट्राइनाइट्रोटोलुइन) एक पीला क्रिस्टलीय ठोस विस्फोटक है जो टोलुइन के सांद्र HNO₃ और H₂SO₄ द्वारा नाइट्रीकरण से बनता है। परमाणु हथियारों की उपज 'किलोटन TNT' में मापी जाती है।",
            "Trinitrotoluene (TNT) is a shock-insensitive aromatic high explosive used as the universal benchmark for measuring blast yields (1 Ton of TNT = 4.184 × 10⁹ Joules).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q12", "sci_4",
            "आरडीएक्स (RDX / Research Department Explosive) को अन्य किस नाम से जाना जाता है?",
            "What is the chemical name and European trade alias of the military military explosive RDX?",
            listOf("ट्राईनाइट्रोग्लिसरीन", "साइक्लोनाइट / हेक्सोजेन (Cyclotrimethylenetrinitramine - Cyclonite / Hexogen)", "डायनामाइट", "गन कॉटन"),
            listOf("Trinitroglycerin", "Cyclonite / Hexogen (Cyclotrimethylenetrinitramine - C₃H₆N₆O₆)", "Dynamite", "Gun cotton"),
            1,
            "RDX (Cyclonite या Hexogen) श्वेत क्रिस्टलीय अति-विस्फोटक है। प्लास्टिक विस्फोटक C-4 और सेमेक्स (Semtex) में RDX का उपयोग किया जाता है।",
            "RDX (Cyclotrimethylenetrinitramine), known as Cyclonite in the US and Hexogen in Germany, forms the high-energy core of modern plastic explosives like C-4.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m6_q13", "sci_4",
            "डायनामाइट (Dynamite) का आविष्कार 1867 में अल्फ्रेड नोबेल ने नाइट्रोग्लिसरीन को किसमें अवशोषित कराकर किया था?",
            "Alfred Nobel invented stable Dynamite in 1867 by absorbing highly volatile liquid Nitroglycerin into which inert porous medium?",
            listOf("रेत में", "कीज़ेलगुर / डायटोमेसियस अर्थ (Kieselguhr / Diatomaceous Earth)", "कोयला पाउडर", "सॉलिड सीमेंट"),
            listOf("Sand", "Kieselguhr (Diatomaceous Earth porous silica powder)", "Charcoal powder", "Cement"),
            1,
            "तरल नाइट्रोग्लिसरीन अत्यधिक अस्थिर और आघात-संवेदनशील थी। नोबेल ने इसे कीज़ेलगुर (डायटम शैवाल की सिलिका मिट्टी) में अवशोषित कराकर स्थिर और सुरक्षित छड़ों (डायनामाइट) में बदला।",
            "Alfred Nobel stabilized liquid nitroglycerin by adsorbing it into porous silica-rich diatomaceous earth (Kieselguhr), creating manageable dynamite sticks.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q14", "sci_4",
            "अंगूर के किण्वन (Fermentation of Sugars) द्वारा शराब (Alcohol) बनाने में किस कवक (यूनिसेल्यूलर फंगस) का उपयोग होता है?",
            "In commercial brewery alcohol production, which yeast microorganism ferments glucose into ethanol and carbon dioxide?",
            listOf("पेनिसिलियम", "सैक्रोमाइसीज सेरेविसी / यीस्ट (Saccharomyces cerevisiae - Brewer's Yeast)", "एस्परजिलस", "राइजोपस"),
            listOf("Penicillium", "Saccharomyces cerevisiae (Brewer's / Baker's Yeast)", "Aspergillus", "Rhizopus"),
            1,
            "यीस्ट में उपस्थित 'जाइमेज' (Zymase) और 'इन्वर्टेज' एंजाइम शर्करा (C₆H₁₂O₆) को एथिल अल्कोहल (C₂H₅OH) और CO₂ में बदल देते हैं: C₆H₁₂O₆ → 2 C₂H₅OH + 2 CO₂।",
            "Saccharomyces cerevisiae yeast secretes Zymase enzymes that metabolize hexose sugars anaerobically into Ethanol and CO₂.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m6_q15", "sci_4",
            "विषाक्त अवैध शराब (Spurious Liquor / Hooch Tragedy) पीने से अंधापन और मृत्यु होने का मुख्य कारण कौन-सा जहरीला अल्कोहल है?",
            "Tragic toxic deaths and permanent blindness caused by illicit bootleg alcohol consumption are due to the presence of which lethal alcohol?",
            listOf("एथिल अल्कोहल (Ethanol)", "मिथाइल अल्कोहल / मेथनॉल (Methanol / Wood Spirit - CH₃OH)", "आइसोप्रोपिल अल्कोहल", "ग्लिसरॉल"),
            listOf("Ethyl alcohol (Ethanol)", "Methyl Alcohol / Methanol (Wood Spirit - CH₃OH)", "Isopropyl alcohol", "Glycerol"),
            1,
            "मिथाइल अल्कोहल (CH₃OH) यकृत में अल्कोहल डिहाइड्रोजनेज एंजाइम द्वारा अत्यंत विषैले फॉर्मेल्डिहाइड (HCHO) और फॉर्मिक एसिड (HCOOH) में ऑक्सीकृत हो जाता है, जो ऑप्टिक तंत्रिका को नष्ट कर अंधापन और मृत्यु का कारण बनता है।",
            "Methanol (CH₃OH) is metabolized in the liver into toxic formaldehyde and formic acid, inducing severe metabolic acidosis, optic nerve atrophy (blindness), and respiratory failure.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 7 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m7_q1", "sci_4",
            "एस्पिरिन (Aspirin) दर्द निवारक और रक्त को पतला करने वाली दवा का रासायनिक नाम क्या है?",
            "What is the chemical name of the analgesic, antipyretic, and antiplatelet drug Aspirin?",
            listOf("पैरासिटामोल", "एसिटाइल सैलिसिलिक एसिड (Acetylsalicylic Acid - ASA)", "इबुप्रोफेन", "मेफेनेमिक एसिड"),
            listOf("Paracetamol", "Acetylsalicylic Acid (ASA - C₉H₈O₄)", "Ibuprofen", "Mefenamic acid"),
            1,
            "एस्पिरिन सैलिसिलिक एसिड के एसिटिलीकरण से बनाई जाती है। यह साइक्लोऑक्सीजिनेज (COX) एंजाइम को अवरुद्ध कर प्रोस्टाग्लैंडीन निर्माण को रोकती है, जिससे दर्द, बुखार और रक्त के थक्कों से राहत मिलती है।",
            "Aspirin is Acetylsalicylic Acid, synthesized by acetylating salicylic acid with acetic anhydride, acting as an irreversible COX-1 and COX-2 inhibitor.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q2", "sci_4",
            "पैरासिटामोल (Paracetamol / Acetaminophen) का मुख्य चिकित्सीय उपयोग क्या है?",
            "Paracetamol (Acetaminophen) is pharmacologically categorized as a:",
            listOf("एंटीबायोटिक", "ज्वरनाशक और दर्द निवारक (Antipyretic and Analgesic)", "एंटीसेप्टिक", "एनेस्थेटिक"),
            listOf("Antibiotic", "Antipyretic (Fever-reducer) and Analgesic (Pain-reliever)", "Antiseptic", "Anesthetic"),
            1,
            "पैरासिटामोल (N-acetyl-p-aminophenol) बुखार को कम करने (Antipyretic) और हल्के से मध्यम दर्द से राहत (Analgesic) देने की सर्वाधिक उपयोग की जाने वाली दवा है।",
            "Paracetamol is a widely prescribed non-opioid antipyretic and analgesic that elevates pain thresholds and regulates hypothalamic thermoregulatory centers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q3", "sci_4",
            "प्रथम एंटीबायोटिक 'पेनिसिलिन' (Penicillin) की खोज 1928 में अलेक्जेंडर फ्लेमिंग ने किस कवक से की थी?",
            "Sir Alexander Fleming discovered the world's first true Antibiotic 'Penicillin' in 1928 from which mold fungus?",
            listOf("राइजोपस", "पेनिसिलियम नोटेटम (Penicillium notatum / Penicillium chrysogenum)", "यीस्ट", "एस्परजिलस"),
            listOf("Rhizopus", "Penicillium notatum (Penicillium chrysogenum fungus)", "Yeast", "Aspergillus"),
            1,
            "फ्लेमिंग ने स्टेफिलोकोकस जीवाणु की कल्चर प्लेट पर पेनिसिलियम नोटेटम कवक के चारों ओर जीवाणुओं को मरते देखा। फ्लोरी और चेन ने इसे शुद्ध दवा के रूप में विकसित किया (नोबेल 1945)।",
            "Alexander Fleming observed bacterial lysis around Penicillium notatum mold colonies, isolating the beta-lactam antibiotic Penicillin.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q4", "sci_4",
            "कीमोथेरेपी (Chemotherapy) शब्द की खोज किसने की और इसका संबंध किससे है?",
            "Who coined the term 'Chemotherapy' and founded antimicrobial research with Salvarsan (Compound 606)?",
            listOf("लुई पाश्चर", "पॉल एहरलिच (Paul Ehrlich - Father of Chemotherapy)", "रॉबर्ट कोच", "एडवर्ड जेनर"),
            listOf("Louis Pasteur", "Paul Ehrlich (Magic Bullet concept & Salvarsan)", "Robert Koch", "Edward Jenner"),
            1,
            "जर्मन वैज्ञानिक पॉल एहरलिच ने 1909 में सिफलिस के इलाज के लिए 'साल्वर्सन' खोजा और 'कीमोथेरेपी' (विशिष्ट रसायनों द्वारा रोगों का उपचार) की नींव रखी (नोबेल 1908)।",
            "Paul Ehrlich pioneered Chemotherapy by synthesizing targeted chemical agents ('magic bullets') like Salvarsan to selectively eliminate pathogens.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m7_q5", "sci_4",
            "कृत्रिम मधुरक (Artificial Sweetener) 'सैकरिन' (Saccharin) चीनी (सुक्रोज) की तुलना में कितनी गुना अधिक मीठी होती है और इसमें कितनी कैलोरी होती है?",
            "The artificial non-nutritive sweetener Saccharin is approximately how many times sweeter than table sugar (Sucrose) and yields how many calories?",
            listOf("10 गुना, 100 कैलोरी", "लगभग 500-550 गुना अधिक मीठी और 0 कैलोरी (Zero Calories)", "50 गुना, 50 कैलोरी", "2 गुना"),
            listOf("10× sweeter, 100 kcal", "500-550 times sweeter than sucrose with Zero Calories (excreted unchanged)", "50× sweeter", "2× sweeter"),
            1,
            "1879 में खोजी गई ऑर्थो-सल्फोबेंजीमाइड (सैकरिन) सुक्रोज से 550 गुना मीठी होती है। यह शरीर में पचती नहीं है और बिना ऊर्जा (शून्य कैलोरी) दिए मूत्र के साथ निकल जाती है, अतः मधुमेह रोगियों के लिए उपयोगी है।",
            "Saccharin is ~550 times sweeter than sucrose. It undergoes no metabolic breakdown in humans, providing zero calories for diabetic diet formulations.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q6", "sci_4",
            "खाद्य पदार्थों को खराब होने से बचाने के लिए सबसे व्यापक रूप से इस्तेमाल किया जाने वाला रासायनिक परिरक्षक (Food Preservative) कौन-सा है?",
            "Which chemical compound is the most standard commercial Food Preservative for fruit jams, soft drinks, and ketchups (E211)?",
            listOf("सोडियम क्लोराइड", "सोडियम बेंजोएट (Sodium Benzoate - C₆H₅COONa)", "कैल्शियम कार्बोनेट", "अमोनियम नाइट्रेट"),
            listOf("Sodium chloride", "Sodium Benzoate (C₆H₅COONa, E211)", "Calcium carbonate", "Ammonium nitrate"),
            1,
            "सोडियम बेंजोएट (C₆H₅COONa) अम्लीय माध्यम (pH < 4.5) में बेंजोइक एसिड बनाता है, जो यीस्ट, फफूंद और जीवाणुओं के एंजाइमों को निष्क्रिय कर खाद्य सामग्री को सड़ने से बचाता है।",
            "Sodium Benzoate (E211) inhibits cellular enzymatic activity in yeasts, molds, and bacteria in acidic food products (sauces, sodas, and juices).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q7", "sci_4",
            "रोगाणुरोधक (Antiseptic) 'डेटॉल' (Dettol) का मुख्य सक्रिय रासायनिक संघटक क्या है?",
            "What is the principal active antibacterial ingredient in commercial Dettol liquid antiseptic?",
            listOf("फिनोल", "क्लोरॉक्सिलेनॉल (Chloroxylenol - 4-chloro-3,5-dimethylphenol) और टर्पिनियोल", "आयोडीन", "एथिल अल्कोहल"),
            listOf("Phenol", "Chloroxylenol (PCMX - 4-chloro-3,5-dimethylphenol) blended with Terpineol", "Iodine", "Ethanol"),
            1,
            "डेटॉल क्लोरॉक्सिलेनॉल (Chloroxylenol ~4.8%), अल्फा-टर्पिनियोल (Terpineol ~9%) और आइसोप्रोपिल अल्कोहल का मिश्रण होता है जो जीवित त्वचा पर बिना क्षति पहुंचाए बैक्टीरिया की कोशिका भित्ति को नष्ट करता है।",
            "Dettol contains Chloroxylenol (PCMX) and Terpineol, which disrupt bacterial cell membranes and coagulate microbial intracellular proteins.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q8", "sci_4",
            "टिंचर आयोडीन (Tincture of Iodine), जो घावों पर लगाने वाला एक शक्तिशाली एंटीसेप्टिक है, किसका घोल होता है?",
            "Tincture of Iodine, a topical antiseptic for minor wounds, is prepared as a solution of:",
            listOf("आयोडीन का शुद्ध पानी में घोल", "2-3% आयोडीन का अल्कोहल और पानी के मिश्रण में घोल (I₂ + KI in Ethanol-Water)", "आयोडीन और तेल", "आयोडीन और पेट्रोल"),
            listOf("Iodine in water only", "2-3% Elemental Iodine (I₂) with Potassium Iodide (KI) in an Alcohol-Water mixture", "Iodine in oil", "Iodine in gasoline"),
            1,
            "टिंचर आयोडीन में 2-3% आयोडीन (I₂) को पोटेशियम आयोडाइड (KI) की उपस्थिति में एथिल अल्कोहल और जल के घोल में घोला जाता है। यह घावों के बैक्टीरिया और कवक को तुरंत नष्ट करता है।",
            "Tincture of Iodine is a 2-7% elemental iodine solution dissolved in alcohol-water with KI, acting as a broad-spectrum topical antimicrobial.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q9", "sci_4",
            "हवाई अड्डों और रेलवे स्टेशनों पर यात्रियों के हाथों पर लगाई जाने वाली 'अमिट स्याही' (Election / Indelible Ink) में कौन-सा रसायन होता है जो त्वचा पर काला-बैंगनी निशान छोड़ता है?",
            "The indelible Voting Ink applied to voter fingers during elections contains which photosensitive chemical compound?",
            listOf("सिल्वर क्लोराइड", "सिल्वर नाइट्रेट (Silver Nitrate - AgNO₃, ~10-18%)", "पोटेशियम परमैंगनेट", "कॉपर सल्फेट"),
            listOf("Silver chloride", "Silver Nitrate (AgNO₃, 10-18% aqueous solution)", "Potassium permanganate", "Copper sulfate"),
            1,
            "सिल्वर नाइट्रेट (AgNO₃) त्वचा के प्रोटीन और पसीने के क्लोराइड के साथ क्रिया करके अघुलनशील सिल्वर क्लोराइड (AgCl) बनाता है, जो पराबैंगनी प्रकाश में अपघटित होकर काला धात्विक चांदी (Ag) छोड़ता है जो धोया नहीं जा सकता।",
            "Silver nitrate (AgNO₃) reacts with epidermal salt (NaCl) and skin keratin to form AgCl, which photodegrades under ambient UV light into insoluble black metallic silver.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q10", "sci_4",
            "फोटोग्राफी में फिल्म को विकसित करने और 'फिक्सिंग' (Fixer) करने के लिए किस रसायन का उपयोग किया जाता है?",
            "In traditional chemical photography, which chemical salt is used as a 'Fixer' (Hypo) to dissolve unexposed silver halide crystals?",
            listOf("सोडियम कार्बोनेट", "सोडियम थायोसल्फेट / हाइपो (Sodium Thiosulfate - Na₂S₂O₃·5H₂O)", "सिल्वर ब्रोमाइड", "पोटेशियम ब्रोमाइड"),
            listOf("Sodium Carbonate", "Sodium Thiosulfate / Hypo (Na₂S₂O₃·5H₂O)", "Silver Bromide", "Potassium Bromide"),
            1,
            "सोडियम थायोसल्फेट (हाइपो Na₂S₂O₃) अप्रकाशित सिल्वर ब्रोमाइड (AgBr) के साथ घुलनशील जटिल यौगिक सोडियम डाइन अर्जेंटोथायोसल्फेट [Na₃[Ag(S₂O₃)₂]] बनाता है, जिससे फिल्म पर स्थायी चित्र फिक्स हो जाता है।",
            "Hypo (Sodium Thiosulfate Na₂S₂O₃·5H₂O) dissolves unexposed insoluble AgBr grains from photographic emulsions by forming soluble coordination complex ions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q11", "sci_4",
            "काले और सफेद फोटोग्राफी (Black and White Photography) में प्रयुक्त होने वाला मुख्य प्रकाश-संवेदी यौगिक कौन-सा है?",
            "Which light-sensitive silver halide salt is coated onto photographic film for Black and White photography?",
            listOf("सिल्वर नाइट्रेट", "सिल्वर ब्रोमाइड (Silver Bromide - AgBr)", "सिल्वर आयोडाइड", "सिल्वर फ्लोराइड"),
            listOf("Silver Nitrate", "Silver Bromide (AgBr)", "Silver Iodide", "Silver Fluoride"),
            1,
            "सिल्वर ब्रोमाइड (AgBr) प्रकाश के प्रति अत्यधिक संवेदनशील होता है। फोटॉन पड़ने पर 2AgBr → 2Ag + Br₂ में अपघटित होकर सूक्ष्म अव्यक्त प्रतिबिम्ब (Latent image) बनाता है।",
            "Silver Bromide (AgBr) undergoes photochemical decomposition upon exposure to visible light photons, producing metallic silver latent centers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q12", "sci_4",
            "कृत्रिम वर्षा (Artificial Rain / Cloud Seeding) कराने के लिए बादलों में किस यौगिक का छिड़काव किया जाता है?",
            "Which chemical compound, having a crystalline hexagonal structure closely matching natural ice crystals, is dispersed into clouds for Cloud Seeding (Artificial Rain)?",
            listOf("सिल्वर ब्रोमाइड", "सिल्वर आयोडाइड (Silver Iodide - AgI) और शुष्क बर्फ (Solid CO₂)", "सोडियम क्लोराइड", "कैल्शियम क्लोराइड"),
            listOf("Silver bromide", "Silver Iodide (AgI) and Dry Ice (Solid CO₂)", "Sodium chloride", "Calcium chloride"),
            1,
            "सिल्वर आयोडाइड (AgI) की क्रिस्टल संरचना बर्फ के क्रिस्टल के समान होती है। बादलों में इसका धुआं छोड़ने पर यह बर्फ नाभिक (Ice nuclei) की तरह कार्य करता है, जिससे जलवाष्प जमकर भारी बूंदें बनकर बरसती है।",
            "Silver Iodide (AgI) crystals act as glaciogenic freezing nuclei due to their hexagonal crystal lattice matching ice, inducing precipitation in supercooled clouds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q13", "sci_4",
            "हवाई जहाजों के ब्लैक बॉक्स (Black Box / CVR-FDR) का रंग क्या होता है ताकि मलबे में आसानी से ढूंढा जा सके?",
            "What is the standard high-visibility color of an aircraft's 'Black Box' (Flight Data Recorder and Cockpit Voice Recorder)?",
            listOf("काला (Black)", "चमकीला नारंगी (Bright Fluorescent Orange)", "पीला", "लाल"),
            listOf("Jet Black", "Bright Fluorescent Orange (RAL 2005 / International Orange)", "Bright Yellow", "Red"),
            1,
            "ब्लैक बॉक्स वास्तव में काले नहीं बल्कि चमकीले नारंगी (Bright Orange) रंग के होते हैं ताकि विमान दुर्घटना के बाद समुद्र की गहराई या घने जंगलों के मलबे में दूर से ही चमकते दिखाई दें।",
            "Aircraft flight recorders ('Black Boxes') are coated in high-visibility International Fluorescent Orange to assist search and recovery teams post-crash.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q14", "sci_4",
            "आतिशबाजी (पटाखों) में हरा रंग (Green Flame) और लाल/क्रिम्सन रंग (Crimson Red Flame) क्रमशः किन धातुओं के लवणों के कारण उत्पन्न होता है?",
            "In pyrotechnic fireworks, Green and Crimson-Red flare colors are produced by salts of which elements respectively?",
            listOf("हरा: सोडियम, लाल: कॉपर", "हरा: बेरियम (Barium - Ba²⁺), लाल: स्ट्रोंशियम (Strontium - Sr²⁺)", "हरा: तांबा, लाल: मैग्नीशियम", "हरा: कैल्शियम, लाल: बेरियम"),
            listOf("Green: Sodium, Red: Copper", "Green: Barium (BaCl₂ / Ba²⁺); Crimson Red: Strontium (SrCO₃ / Sr²⁺)", "Green: Copper, Red: Magnesium", "Green: Calcium, Red: Barium"),
            1,
            "पटाखों में: बेरियम (Ba) हरा रंग देता है, स्ट्रोंशियम (Sr) गहरा लाल/क्रिम्सन रंग देता है, तांबा (Cu) नीला रंग देता है, सोडियम (Na) पीला रंग देता है, और मैग्नीशियम/एल्युमीनियम चमकदार सफेद रोशनी देते हैं।",
            "Flame emission spectroscopy in fireworks uses Barium salts for vibrant green wavelengths (505-535 nm), Strontium for intense crimson red (650-680 nm), Copper for blue, and Sodium for yellow.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m7_q15", "sci_4",
            "आतिशबाजी में नीला रंग (Blue Flame) और पीला रंग (Yellow Flame) किन तत्वों द्वारा उत्पन्न होता है?",
            "In fireworks, vibrant Blue and Yellow emissions are generated by compounds of which elements respectively?",
            listOf("नीला: तांबा / कॉपर (Copper - Cu), पीला: सोडियम (Sodium - Na)", "नीला: बेरियम, पीला: स्ट्रोंशियम", "नीला: लोहा, पीला: कार्बन", "नीला: मैग्नीशियम, पीला: लेड"),
            listOf("Blue: Copper compounds (CuCl); Yellow: Sodium salts (NaNO₃ / NaCl)", "Blue: Barium, Yellow: Strontium", "Blue: Iron, Yellow: Carbon", "Blue: Magnesium, Yellow: Lead"),
            0,
            "कॉपर क्लोराइड (CuCl) 450 nm पर नीला प्रकाश उत्सर्जित करता है, और सोडियम लवण (589 nm की D-रेखाओं पर) तीव्र पीला प्रकाश उत्पन्न करते हैं।",
            "Copper monochloride (CuCl) produces characteristic blue hues, while Sodium salts provide strong yellow D-line emission.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 8 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m8_q1", "sci_4",
            "परमाणु के द्रव्यमान का अधिकांश भाग किसमें केंद्रित होता है?",
            "Where is over 99.9% of the mass of an atom concentrated?",
            listOf("इलेक्ट्रॉन क्लाउड में", "परमाणु के नाभिक में (Nucleus: Protons + Neutrons)", "संयोजी कोश में", "समान रूप से फैला हुआ"),
            listOf("In the electron cloud", "In the central Atomic Nucleus (Protons and Neutrons)", "In valence shell", "Uniformly distributed"),
            1,
            "प्रोटॉन (1.672 × 10⁻²⁷ kg) और न्यूट्रॉन (1.675 × 10⁻²⁷ kg) इलेक्ट्रॉन (9.1 × 10⁻³¹ kg, जो 1836 गुना हल्का है) की तुलना में अत्यधिक भारी होते हैं, अतः परमाणु का लगभग समस्त द्रव्यमान नाभिक में होता है।",
            "Protons and neutrons (nucleons) account for >99.94% of atomic mass, confined within the dense nucleus with radius ~10⁻¹⁵ m.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q2", "sci_4",
            "समस्थानिक (Isotopes) क्या होते हैं?",
            "Isotopes of a chemical element are atoms possessing:",
            listOf("समान द्रव्यमान संख्या लेकिन भिन्न परमाणु क्रमांक", "समान परमाणु क्रमांक (Z / समान प्रोटॉन) लेकिन भिन्न द्रव्यमान संख्या (A / भिन्न न्यूट्रॉन)", "समान न्यूट्रॉन संख्या", "समान रासायनिक गुण नहीं"),
            listOf("Same mass number but different atomic number (Isobars)", "Same Atomic Number (Z / equal protons) but Different Mass Numbers (A / unequal neutrons)", "Same number of neutrons (Isotones)", "Different chemical properties"),
            1,
            "समस्थानिकों में प्रोटॉनों की संख्या (Z) समान होने से उनके रासायनिक गुण समान होते हैं, परन्तु न्यूट्रॉनों की संख्या भिन्न होने से उनके भौतिक गुण और परमाणु भार अलग-अलग होते हैं (जैसे ₁H¹, ₁H², ₁H³)।",
            "Isotopes are nuclides with identical atomic numbers (protons) and identical electronic configurations but differing neutron counts and mass numbers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q3", "sci_4",
            "संभारिक (Isobars) क्या होते हैं?",
            "Isobars are atoms of different chemical elements that have:",
            listOf("समान परमाणु क्रमांक", "समान द्रव्यमान संख्या (Same Mass Number - A) लेकिन भिन्न परमाणु क्रमांक (Z)", "समान इलेक्ट्रॉन", "समान संयोजकता"),
            listOf("Same atomic number", "Same Mass Number (A) but Different Atomic Numbers (Z)", "Same electrons", "Same valency"),
            1,
            "संभारिक भिन्न-भिन्न तत्वों के परमाणु होते हैं जिनकी कुल न्यूक्लिऑन संख्या (द्रव्यमान संख्या A) समान होती है, जैसे ₁₈Ar⁴⁰, ₁₉K⁴⁰, और ₂₀Ca⁴⁰ (तीनों का भार 40 है)।",
            "Isobars are distinct chemical elements with identical mass numbers (A) but different atomic numbers (Z), exhibiting entirely different chemical properties (e.g., ₄₀Ar, ₄₀K, ₄₀Ca).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q4", "sci_4",
            "समन्यूट्रॉनिक (Isotones) किन्हें कहा जाता है?",
            "Isotones are atomic species characterized by containing:",
            listOf("समान प्रोटॉन", "समान न्यूट्रॉन संख्या (Same number of Neutrons: N = A - Z)", "समान परमाणु भार", "समान आवेश"),
            listOf("Same protons", "Identical Number of Neutrons (N = A - Z)", "Same mass", "Same charge"),
            1,
            "समन्यूट्रॉनिक वे नाभिक हैं जिनमें न्यूट्रॉनों की संख्या (A - Z) समान होती है। उदाहरण: ₆C¹⁴ (14-6 = 8 न्यूट्रॉन), ₇N¹⁵ (15-7 = 8 न्यूट्रॉन), ₈O¹⁶ (16-8 = 8 न्यूट्रॉन)।",
            "Isotones are distinct nuclides sharing the exact same number of neutrons (N = A - Z), such as Carbon-14, Nitrogen-15, and Oxygen-16 (all having 8 neutrons).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m8_q5", "sci_4",
            "आवर्त सारणी में सर्वाधिक विद्युत-ऋणात्मक (Most Electronegative) तत्व कौन-सा है?",
            "Which chemical element has the Highest Electronegativity (Pauling value = 4.0) in the periodic table?",
            listOf("क्लोरीन (Cl)", "फ्लोरीन (Fluorine - F)", "ऑक्सीजन (O)", "नाइट्रोजन (N)"),
            listOf("Chlorine (Cl)", "Fluorine (F, Pauling Electronegativity = 3.98)", "Oxygen (O, 3.44)", "Nitrogen (N, 3.04)"),
            1,
            "फ्लोरीन (F) आवर्त सारणी का सबसे छोटा और सबसे शक्तिशाली विद्युत-ऋणात्मक तत्व है (पॉलिंग मान 4.0)। यह अन्य परमाणुओं से इलेक्ट्रॉनों को सबसे प्रबलता से अपनी ओर खींचता है।",
            "Fluorine (F) is the most electronegative element with a Pauling scale score of ~4.0, owing to its minimal covalent radius and high effective nuclear charge.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q6", "sci_4",
            "आवर्त सारणी में सर्वाधिक इलेक्ट्रॉन बंधुता (Highest Electron Affinity / Electron Gain Enthalpy) किस तत्व की होती है?",
            "Which element releases the highest amount of energy upon accepting an electron (Highest Electron Affinity)?",
            listOf("फ्लोरीन", "क्लोरीन (Chlorine - Cl, -349 kJ/mol)", "ब्रोमीन", "आयोडीन"),
            listOf("Fluorine", "Chlorine (Cl, electron gain enthalpy = -349 kJ/mol)", "Bromine", "Iodine"),
            1,
            "फ्लोरीन का आकार बहुत छोटा होने के कारण 2p उपकोश में इलेक्ट्रॉन-इलेक्ट्रॉन प्रतिकर्षण अधिक होता है, जबकि क्लोरीन (3p) का आकार उपयुक्त होने से यह नए इलेक्ट्रॉन को अधिक आसानी से स्वीकार करता है।",
            "Chlorine exhibits higher electron affinity than fluorine because fluorine's compact 2p orbital creates significant inter-electronic repulsion, reducing net electron attachment enthalpy.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m8_q7", "sci_4",
            "परमाणु क्रमांक 1 से 118 तक में सबसे भारी प्राकृतिक तत्व (Heaviest Naturally Occurring Element) कौन-सा है?",
            "Which is the heaviest naturally occurring chemical element found on Earth?",
            listOf("प्लूटोनियम (Pu-94)", "यूरेनियम (Uranium - U, Z=92, Atomic Mass ~238)", "रेडियम", "थोरियम"),
            listOf("Plutonium", "Uranium (U, Atomic Number 92, standard atomic weight 238.03)", "Radium", "Thorium"),
            1,
            "यूरेनियम (परमाणु क्रमांक 92) पृथ्वी पर प्राकृतिक रूप से पाया जाने वाला सबसे भारी तत्व है। 92 के बाद के सभी तत्व (Transuranic elements) मानव-निर्मित (कृत्रिम) हैं।",
            "Uranium (Z = 92) is the heaviest primordial element occurring in macroscopic terrestrial ores. All elements beyond Z = 92 are synthetic transuranics.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q8", "sci_4",
            "आवर्त सारणी में सबसे हल्का तत्व (Lightest Element) और सबसे हल्की धातु (Lightest Metal) क्रमशः कौन-से हैं?",
            "Which are the Lightest Element and Lightest Solid Metal in the Periodic Table respectively?",
            listOf("तत्व: हीलियम, धातु: सोडियम", "तत्व: हाइड्रोजन (H - 1 amu), धातु: लीथियम (Lithium - Li, घनत्व 0.534 g/cm³)", "तत्व: ऑक्सीजन, धातु: एल्युमीनियम", "तत्व: कार्बन, धातु: पोटेशियम"),
            listOf("Element: Helium, Metal: Sodium", "Lightest Element: Hydrogen (H, Z=1); Lightest Metal: Lithium (Li, density 0.534 g/cm³)", "Element: Oxygen, Metal: Aluminium", "Element: Carbon, Metal: Potassium"),
            1,
            "हाइड्रोजन ब्रह्मांड का सबसे हल्का और सबसे प्रचुर तत्व है। लीथियम (Li) सबसे हल्की धातु है जिसका घनत्व पानी से भी आधा (0.534 g/cm³) होता है और यह पानी पर तैरती है।",
            "Hydrogen (H, Z=1) is the lightest chemical element. Lithium (Li, Z=3) is the least dense solid metal, floating buoyantly on water.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q9", "sci_4",
            "प्रकृति में ज्ञात सबसे भारी और सबसे सघन धातु (Densest Metal) कौन-सी है जिसका घनत्व 22.59 g/cm³ है?",
            "Which transition metal is the Densest naturally occurring element on Earth (Density ~22.59 g/cm³)?",
            listOf("सोना (19.3 g/cm³)", "ऑस्मियम (Osmium - Os) / इरिडियम (Iridium - Ir)", "प्लैटिनम", "सीसा (11.3 g/cm³)"),
            listOf("Gold", "Osmium (Os, density 22.59 g/cm³) / Iridium (Ir, 22.56 g/cm³)", "Platinum", "Lead"),
            1,
            "ऑस्मियम (Os, परमाणु क्रमांक 76) का घनत्व 22.59 ग्राम/सेमी³ है, जो पानी से 22.6 गुना और सीसे से दोगुना भारी है। इसका 1 फुट का घनाकार टुकड़ा लगभग 640 किग्रा का होगा।",
            "Osmium (Os, Z = 76) possesses the highest measured mass density of all chemical elements at 22.59 g/cm³, closely rivaled by Iridium.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q10", "sci_4",
            "वायुमंडल में सबसे प्रचुर मात्रा में पाई जाने वाली गैस (78%) और भूपर्पटी (Earth's Crust) में सबसे प्रचुर मात्रा में पाया जाने वाला तत्व (46.6%) क्रमशः कौन-से हैं?",
            "What are the Most Abundant Gas in Earth's Atmosphere and Most Abundant Element in the Earth's Crust respectively?",
            listOf("वायुमंडल: ऑक्सीजन, भूपर्पटी: सिलिकॉन", "वायुमंडल: नाइट्रोजन (N₂ - 78%), भूपर्पटी: ऑक्सीजन (Oxygen - 46.6%)", "वायुमंडल: आर्गन, भूपर्पटी: एल्युमीनियम", "वायुमंडल: CO₂, भूपर्पटी: लोहा"),
            listOf("Atmosphere: Oxygen, Crust: Silicon", "Atmosphere: Nitrogen (N₂ ~78%); Earth's Crust: Oxygen (~46.6% by mass)", "Atmosphere: Argon, Crust: Aluminium", "Atmosphere: CO₂, Crust: Iron"),
            1,
            "वायुमंडल में: नाइट्रोजन 78.08%, ऑक्सीजन 20.95%, आर्गन 0.93%। भूपर्पटी में: ऑक्सीजन 46.6%, सिलिकॉन 27.7%, एल्युमीनियम 8.1% (सर्वाधिक प्रचुर धातु), लोहा 5.0%।",
            "Nitrogen constitutes ~78% of dry atmospheric volume. In the continental crust, Oxygen is the most abundant element (~46.6% by weight), followed by Silicon (~27.7%) and Aluminium (~8.1%).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q11", "sci_4",
            "भूपर्पटी (Earth's Crust) में सबसे प्रचुर मात्रा में पाई जाने वाली धातु (Most Abundant Metal) कौन-सी है?",
            "Which is the Most Abundant Metal in the Earth's continental crust (comprising ~8.1% by mass)?",
            listOf("लोहा (Iron - Fe, 5%)", "एल्युमीनियम (Aluminium - Al, ~8.1%)", "कैल्शियम (3.6%)", "सोडियम (2.8%)"),
            listOf("Iron (Fe, ~5%)", "Aluminium (Al, ~8.1% by weight)", "Calcium", "Sodium"),
            1,
            "भूपर्पटी में एल्युमीनियम (8.1%) सर्वाधिक प्रचुर धातु है, जो मुख्य रूप से बॉक्साइट और एल्युमिनोसिलिकेट खनिजों में पाई जाती है। दूसरी सबसे प्रचुर धातु लोहा (5%) है। (संपूर्ण पृथ्वी में लोहा सर्वाधिक है)।",
            "Aluminium (Al) is the most abundant metallic element in Earth's crust (~8.1%), followed by Iron (~5.0%). (Across the entire planet including core, Iron is #1).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q12", "sci_4",
            "मानव शरीर में द्रव्यमान के अनुसार सबसे प्रचुर मात्रा में पाया जाने वाला तत्व कौन-सा है?",
            "By mass percentage, which chemical element constitutes the largest portion (~65%) of the Human Body?",
            listOf("कार्बन (18.5%)", "ऑक्सीजन (Oxygen - ~65%)", "हाइड्रोजन (10%)", "नाइट्रोजन (3.2%)"),
            listOf("Carbon (18.5%)", "Oxygen (O, ~65% of body mass)", "Hydrogen (10%)", "Nitrogen (3.2%)"),
            1,
            "मानव शरीर में लगभग 60-70% जल (H₂O) होता है। जल में ऑक्सीजन का भार 88.8% होने के कारण मानव शरीर के कुल भार का लगभग 65% हिस्सा ऑक्सीजन तत्व का होता है।",
            "Oxygen accounts for approximately 65% of human body mass, predominantly as the major constituent of cellular water (H₂O) and biomolecules.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q13", "sci_4",
            "आवर्त सारणी में किस समूह (Group) के तत्वों को 'हैलोजन' (Halogens - Salt formers) कहा जाता है?",
            "Which vertical column in the Periodic Table contains the salt-forming 'Halogens' (F, Cl, Br, I, At)?",
            listOf("समूह 1 (क्षार धातुएं)", "समूह 17 (Group 17 / Halogens)", "समूह 18 (उत्कृष्ट गैसें)", "समूह 2 (क्षारीय मृदा धातुएं)"),
            listOf("Group 1 (Alkali metals)", "Group 17 (Halogens: Fluorine, Chlorine, Bromine, Iodine, Astatine)", "Group 18 (Noble gases)", "Group 2 (Alkaline earth metals)"),
            1,
            "समूह 17 के तत्वों को हैलोजन (ग्रीक: 'लवण उत्पादक') कहते हैं क्योंकि ये धातुओं के साथ क्रिया करके लवण (जैसे NaCl, KBr) बनाते हैं। इनके बाहरी कोश में 7 संयोजी इलेक्ट्रॉन (ns²np⁵) होते हैं।",
            "Group 17 elements are termed Halogens ('salt producers') with valence configuration ns²np⁵, eagerly gaining 1 electron to form halide anions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q14", "sci_4",
            "अक्रिय या उत्कृष्ट गैसों (Noble Gases - He, Ne, Ar, Kr, Xe, Rn) को आधुनिक आवर्त सारणी के किस समूह में रखा गया है?",
            "Noble Gases possessing completely filled valence shells (s²p⁶) are located in which group of the Periodic Table?",
            listOf("समूह 1", "समूह 18 (Group 18 / Zero Group)", "समूह 16", "समूह 17"),
            listOf("Group 1", "Group 18 (Noble Gases / Aerogens)", "Group 16 (Chalcogens)", "Group 17"),
            1,
            "समूह 18 के तत्वों का अष्टक (Octet) पूर्ण होने के कारण ये रासायनिक रूप से अत्यधिक अक्रिय होते हैं, अतः इन्हें उत्कृष्ट गैसें (Noble gases) कहते हैं।",
            "Group 18 elements feature closed-shell electronic octets (ns²np⁶, 1s² for He), conferring exceptional chemical stability and unreactivity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m8_q15", "sci_4",
            "समूह 16 के तत्वों (ऑक्सीजन, सल्फर, सेलेनियम, टेल्यूरियम) को किस विशेष नाम से जाना जाता है?",
            "Group 16 elements of the periodic table (O, S, Se, Te, Po) are systematically termed:",
            listOf("हैलोजन", "कैल्कोजन / अयस्क-निर्माता (Chalcogens / Ore Formers)", "क्षार धातुएं", "पिंक्टोजन"),
            listOf("Halogens", "Chalcogens ('Ore Formers')", "Alkali metals", "Pnictogens (Group 15)"),
            1,
            "समूह 16 के तत्वों को 'कैल्कोजन' (ग्रीक: 'तांबा/अयस्क बनाने वाले') कहते हैं क्योंकि अधिकांश धातुओं के अयस्क ऑक्साइड (Oxides) या सल्फाइड (Sulfides) के रूप में पाए जाते हैं।",
            "Group 16 elements are called Chalcogens (ore-forming elements) because most metallic mineral ores exist as oxides and sulfides.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 9 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m9_q1", "sci_4",
            "एल्युमीनियम (Aluminium) का मुख्य अयस्क (Primary Ore) कौन-सा है जिससे हॉल-हेरोल्ट प्रक्रिया द्वारा एल्युमीनियम का निष्कर्षण किया जाता है?",
            "What is the principal mineral ore of Aluminium from which pure aluminium is extracted via the Hall-Héroult electrolytic process?",
            listOf("हेमेटाइट", "बॉक्साइट (Bauxite - Al₂O₃·2H₂O)", "पिचब्लेंड", "गैलेना"),
            listOf("Hematite (Iron ore)", "Bauxite (Hydrated Aluminium Oxide - Al₂O₃·2H₂O)", "Pitchblende (Uranium)", "Galena (Lead ore)"),
            1,
            "बॉक्साइट (Al₂O₃·2H₂O) एल्युमीनियम का मुख्य अयस्क है। बेयर प्रक्रिया द्वारा इससे शुद्ध एल्युमिना (Al₂O₃) निकाला जाता है और फिर क्रायोलाइट (Na₃AlF₆) मिलाकर विद्युत अपघटन से धातु प्राप्त होती है।",
            "Bauxite is the commercial ore of aluminium, refined into alumina via the Bayer process and electrolyzed in molten cryolite.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q2", "sci_4",
            "लोहे (Iron) का सर्वोत्तम और सबसे शुद्ध अयस्क कौन-सा है जिसमें लगभग 70% तक लोहा पाया जाता है?",
            "Which is the highest-grade, reddish-brown iron ore containing up to 70% elemental iron?",
            listOf("बॉक्साइट", "हेमेटाइट (Hematite - Fe₂O₃) और मैग्नेटाइट (Fe₃O₄)", "कैलामाइन", "सिनेबार"),
            listOf("Bauxite", "Hematite (Fe₂O₃) and Magnetite (Fe₃O₄ - 72.4% Fe)", "Calamine", "Cinnabar"),
            1,
            "हेमेटाइट (Fe₂O₃ - लाल अयस्क) और मैग्नेटाइट (Fe₃O₄ - काला चुंबकीय अयस्क) लोहे के दो प्रमुख अयस्क हैं। भारत में अधिकांश लोहा हेमेटाइट से वात्या भट्टी (Blast Furnace) में प्रगलन द्वारा निकाला जाता है।",
            "Hematite (Fe₂O₃) and natural magnetic Magnetite (Fe₃O₄) are the primary commercial iron ores smelted in blast furnaces.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q3", "sci_4",
            "पारे (Mercury / Hg) का मुख्य अयस्क कौन-सा है जो लाल रंग का खनिज होता है?",
            "What is the principal mineral sulfide ore of Mercury from which quicksilver is extracted by roasting in air?",
            listOf("गैलेना", "सिनेबार / हिंगुल (Cinnabar - Mercuric Sulfide / HgS)", "बॉक्साइट", "हेमेटाइट"),
            listOf("Galena", "Cinnabar / Vermilion (HgS - Mercuric Sulfide)", "Bauxite", "Hematite"),
            1,
            "सिनेबार (HgS - मर्क्युरिक सल्फाइड) पारे का प्रमुख अयस्क है। इसे हवा में गर्म करने पर पारा वाष्पीकृत होकर संघनित हो जाता है: HgS + O₂ → Hg + SO₂।",
            "Cinnabar (HgS) is the chief ore of mercury, historically ground into the vermilion pigment and roasted to yield metallic mercury.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q4", "sci_4",
            "सीसा (Lead / Pb) का मुख्य अयस्क कौन-सा है?",
            "What is the primary natural sulfide ore of Lead (Pb)?",
            listOf("सिनेबार", "गैलेना (Galena - Lead Sulfide / PbS)", "कैलामाइन", "पाइरोलुसाइट"),
            listOf("Cinnabar", "Galena (PbS - Lead Sulfide)", "Calamine", "Pyrolusite"),
            1,
            "गैलेना (PbS - लेड सल्फाइड) सीसे का मुख्य अयस्क है। यह एक धूसर घनाकार चमकदार खनिज है जो अक्सर चांदी के साथ पाया जाता है।",
            "Galena (PbS) is the most abundant lead ore, crystalizing in octahedral metallic cubic lattices.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q5", "sci_4",
            "जस्ता (Zinc / Zn) का मुख्य कार्बोनेट अयस्क कौन-सा है?",
            "What is the mineral name of the zinc carbonate ore ZnCO₃?",
            listOf("जिंक ब्लेंड (ZnS)", "कैलामाइन (Calamine / Smithsonite - ZnCO₃)", "जिंकाइट (ZnO)", "बॉक्साइट"),
            listOf("Zinc blende (Sphalerite - ZnS)", "Calamine / Smithsonite (ZnCO₃)", "Zincite (ZnO)", "Bauxite"),
            1,
            "जिंक के मुख्य अयस्क जिंक ब्लेंड (ZnS) और कैलामाइन (ZnCO₃) हैं। कैलामाइन का उपयोग त्वचा के लोशन (खुजली रोधी) में भी किया जाता है।",
            "Calamine (Smithsonite, ZnCO₃) and Sphalerite (ZnS) are major zinc ores, with calamine also utilized in soothing skin lotions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q6", "sci_4",
            "तांबा (Copper / Cu) का प्रमुख अयस्क कौन-सा है जिससे भारत में तांबा निकाला जाता है?",
            "Which copper-iron sulfide mineral is the most widely mined Copper ore worldwide?",
            listOf("बॉक्साइट", "कॉपर पाइराइट / कैल्कोपाइराइट (Copper Pyrite / Chalcopyrite - CuFeS₂)", "सिनेबार", "हेमेटाइट"),
            listOf("Bauxite", "Copper Pyrite / Chalcopyrite (CuFeS₂)", "Cinnabar", "Hematite"),
            1,
            "कॉपर पाइराइट (CuFeS₂) तांबे का सबसे महत्वपूर्ण अयस्क है। राजस्थान की खेतड़ी खदानें तांबे के खनन के लिए प्रसिद्ध हैं।",
            "Chalcopyrite (CuFeS₂) is the predominant copper mineral ore, processed via froth flotation and flash smelting.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q7", "sci_4",
            "मैंगनीज (Manganese / Mn) का मुख्य काला अयस्क कौन-सा है जिसका सूत्र MnO₂ है?",
            "What is the name of the primary black dioxide mineral ore of Manganese (MnO₂)?",
            listOf("हेमेटाइट", "पाइरोलुसाइट (Pyrolusite - MnO₂)", "गैलेना", "मैग्नेसाइट"),
            listOf("Hematite", "Pyrolusite (MnO₂)", "Galena", "Magnesite"),
            1,
            "पाइरोलुसाइट (MnO₂) मैंगनीज का प्रमुख अयस्क है। इसका उपयोग ड्राई सेल बैटरी में विध्रुवक (Depolarizer) और स्टील निर्माण में किया जाता है।",
            "Pyrolusite (MnO₂) is the principal ore of manganese, widely used in dry cell Leclanché batteries and high-strength manganese steel alloys.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q8", "sci_4",
            "प्लास्टिक के निर्माण में प्रयुक्त पीवीसी (PVC) का पूर्ण रूप क्या है?",
            "What is the full expansion of the widely used commercial thermoplastic polymer PVC?",
            listOf("पॉलीविनाइल क्लोराइड (Polyvinyl Chloride)", "पॉलीविनाइल कार्बोनेट", "पॉलीविनाइल कार्बन", "पॉलीविनाइल क्लोरेट"),
            listOf("Polyvinyl Chloride ([-CH₂-CHCl-]n)", "Polyvinyl Carbonate", "Polyvinyl Carbon", "Polyvinyl Chlorate"),
            1,
            "PVC विनाइल क्लोराइड (CH₂=CHCl) का बहुलक है। यह जल-रोधी और विद्युतरोधी होता है, जिससे पानी के पाइप, बिजली के तारों के कवर और रेनकोट बनाए जाते हैं।",
            "Polyvinyl Chloride (PVC) is synthesized by polymerizing vinyl chloride monomer, deployed in construction piping, electrical cable insulation, and vinyl flooring.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q9", "sci_4",
            "थर्माकोल (Thermocol) वास्तव में किस प्लास्टिक का झागदार (Foamed) रूप है?",
            "Thermocol packaging sheets and disposable cups are structurally made of Expanded:",
            listOf("पॉलीथीन", "पॉलीस्टाइरीन (Polystyrene / Expanded Polystyrene - EPS)", "पीवीसी", "टेफ्लॉन"),
            listOf("Polythene", "Polystyrene / Expanded Polystyrene (EPS)", "PVC", "Teflon"),
            1,
            "थर्माकोल स्टाइरीन (C₆H₅CH=CH₂) के बहुलक पॉलीस्टाइरीन में गैस भरकर बनाया गया झागदार रूप है। इसमें 95-98% हवा होती है जिससे यह अति-हल्का और ऊष्मा-रोधी होता है।",
            "Thermocol is Expanded Polystyrene (EPS), consisting of 98% trapped air inside cellular polystyrene matrices, providing superior thermal insulation and shock cushioning.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q10", "sci_4",
            "कृत्रिम रेशम (Artificial Silk) के नाम से किस अर्ध-संश्लेषित रेशे को जाना जाता है जो सेल्युलोज से बनता है?",
            "Which regenerated cellulose semi-synthetic fiber is commercially called 'Artificial Silk'?",
            listOf("नायलॉन", "रेयान (Rayon)", "पॉलिएस्टर", "ऐक्रेलिक"),
            listOf("Nylon", "Rayon (Viscose Rayon)", "Polyester", "Acrylic"),
            1,
            "रेयान प्राकृतिक सेल्युलोज (लकड़ी की लुगदी) को रासायनिक उपचार (विस्कोस प्रक्रिया) द्वारा पुनर्जीवित करके बनाया जाता है। यह दिखने और छूने में प्राकृतिक रेशम जैसा चमकदार होता है।",
            "Rayon is manufactured by dissolving natural wood pulp cellulose in carbon disulfide and extruding it into acid baths, mimicking natural silk sheen.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q11", "sci_4",
            "कृत्रिम ऊन (Artificial Wool) के रूप में किस सिंथेटिक रेशे का उपयोग स्वेटर और कंबलों में किया जाता है?",
            "Which acrylic synthetic fiber, prepared by polymerization of Acrylonitrile, is widely used as a substitute for natural wool in knitwear?",
            listOf("नायलॉन", "ऐक्रेलिक / ओरलॉन (Acrylic / Orlon - Polyacrylonitrile / PAN)", "रेयान", "टेरीलीन"),
            listOf("Nylon", "Acrylic / Orlon (Polyacrylonitrile - PAN / Cashmilon)", "Rayon", "Terylene"),
            1,
            "ऐक्रेलिक (पॉलीऐक्रिलोनाइट्राइल - PAN) को 'ओरलॉन' या 'कैशमिलॉन' भी कहते हैं। यह प्राकृतिक ऊन की तरह गर्म, हल्का और फफूंद-रोधी होता है और सस्ता होता है।",
            "Acrylic fibers (Polyacrylonitrile / Orlon) closely mimic natural sheep wool fibers with warm, lightweight, and moth-resistant thermal properties.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q12", "sci_4",
            "जल गैस (Water Gas / Synthesis Gas) किन दो गैसों का दहनशील मिश्रण है?",
            "Water Gas (Syngas), produced by passing steam over red-hot coke (C + H₂O → CO + H₂), is an equimolar mixture of:",
            listOf("कार्बन डाइऑक्साइड और नाइट्रोजन", "कार्बन मोनोऑक्साइड और हाइड्रोजन (CO + H₂)", "मीथेन और ऑक्सीजन", "नाइट्रोजन और हाइड्रोजन"),
            listOf("Carbon dioxide and nitrogen", "Carbon Monoxide and Hydrogen (CO + H₂)", "Methane and oxygen", "Nitrogen and hydrogen (Producer gas: CO + N₂)"),
            1,
            "जल गैस = CO + H₂ (लाल तप्त कोयले पर भाप प्रवाहित करने से बनती है)। प्रोड्यूसर गैस = CO + N₂ (कोयले पर वायु प्रवाहित करने से बनती है)।",
            "Water Gas is a synthetic fuel gas mixture of Carbon Monoxide (CO) and Hydrogen (H₂) generated by the endothermic reaction: C + H₂O(steam) → CO + H₂.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q13", "sci_4",
            "प्रोड्यूसर गैस (Producer Gas) किन गैसों का मिश्रण है?",
            "Producer Gas, manufactured by blowing air over an incandescent coke bed, consists primarily of:",
            listOf("CO और H₂", "कार्बन मोनोऑक्साइड और नाइट्रोजन (CO + N₂)", "CO₂ और H₂", "मीथेन और हीलियम"),
            listOf("CO and H₂", "Carbon Monoxide (~30%) and Nitrogen (~60%) (CO + N₂)", "CO₂ and H₂", "Methane and helium"),
            1,
            "प्रोड्यूसर गैस में लगभग 30% कार्बन मोनोऑक्साइड (CO) और 60% नाइट्रोजन (N₂) होती है। इसका उपयोग औद्योगिक भट्टियों में ईंधन के रूप में होता है।",
            "Producer Gas is an industrial gaseous fuel comprising Carbon Monoxide (CO) and Nitrogen (N₂), produced by incomplete air gasification of coal or coke.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q14", "sci_4",
            "कोयले की चार किस्मों में से सर्वाधिक कार्बन प्रतिशत (85-95%) और उच्चतम ऊष्मीय मान वाला सर्वश्रेष्ठ कोयला कौन-सा है?",
            "Among the four ranks of coal, which is the highest-grade coal possessing the highest fixed carbon content (85-95%) and calorific value?",
            listOf("पीट (Peat - <40% C)", "एन्थ्रेसाइट (Anthracite - 85-95% Carbon)", "बिटुमिनस (Bituminous - 60-80% C)", "लिग्नाइट (Lignite - 40-55% C)"),
            listOf("Peat", "Anthracite (85-95% fixed carbon, smokeless hard coal)", "Bituminous (Common household/thermal coal)", "Lignite (Brown coal)"),
            1,
            "कोयले की श्रेणियां (कार्बन प्रतिशत क्रम): एन्थ्रेसाइट (85-95%, सर्वोत्तम) > बिटुमिनस (60-80%, भारत में सर्वाधिक प्रयुक्त) > लिग्नाइट (40-55%, भूरा कोयला) > पीठ (<40%, सबसे घटिया)।",
            "Anthracite is the hardest and highest metamorphic grade of coal with >85-95% carbon content, burning with a short blue smokeless flame.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m9_q15", "sci_4",
            "पेट्रोल की गुणवत्ता (इंजन नॉकिंग प्रतिरोध) और डीजल की गुणवत्ता क्रमशः किन संख्याओं द्वारा मापी जाती है?",
            "The ignition quality and anti-knocking rating of Petrol (Gasoline) and Diesel are measured respectively by:",
            listOf("पेट्रोल: सीटेन संख्या, डीजल: ऑक्टेन संख्या", "पेट्रोल: ऑक्टेन संख्या (Octane Number), डीजल: सीटेन संख्या (Cetane Number)", "दोनों की ऑक्टेन संख्या से", "कैलोरी मान से"),
            listOf("Petrol: Cetane, Diesel: Octane", "Petrol: Octane Number (Iso-octane rating); Diesel: Cetane Number (Hexadecane rating)", "Both by Octane", "Calorific value"),
            1,
            "पेट्रोल की गुणवत्ता 'ऑक्टेन संख्या' (आइसो-ऑक्टेन = 100) से मापी जाती है। डीजल की गुणवत्ता 'सीटेन संख्या' (सीटेन = 100) से मापी जाती है। उच्च ऑक्टेन/सीटेन संख्या बेहतर दहन और कम नॉकिंग दर्शाती है।",
            "Octane rating benchmarks petrol against 2,2,4-trimethylpentane (iso-octane = 100) for antiknock behavior. Cetane rating benchmarks diesel ignition delay against n-hexadecane (cetane = 100).",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 10 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m10_q1", "sci_4",
            "वाहनों में पेट्रोल के अपस्फोटन (Knocking) को रोकने के लिए ऐतिहासिक रूप से किस एंटी-नॉकिंग एजेंट का उपयोग किया जाता था जिसे पर्यावरण प्रदूषण के कारण बंद कर दिया गया?",
            "Which organolead anti-knock additive was historically blended into petrol to boost octane ratings before being globally phased out?",
            listOf("टेट्रामिथाइल लेड", "टेट्राएथिल लेड (Tetraethyl Lead - TEL / (C₂H₅)₄Pb)", "लेड ऑक्साइड", "एथिल अल्कोहल"),
            listOf("Tetramethyl lead", "Tetraethyl Lead (TEL - (C₂H₅)₄Pb)", "Lead oxide", "Ethanol"),
            1,
            "थॉमस मिजले द्वारा खोजा गया TEL पेट्रोल में नॉकिंग रोकता था, परन्तु इसके धुएं से विषैला सीसा वायुमंडल में फैलता था जिससे तंत्रिका तंत्र को नुकसान होता था। अब इसके स्थान पर अनलेडेड पेट्रोल में MTBE या एथेनॉल मिलाया जाता है।",
            "Tetraethyllead (TEL) was added to gasoline as an octane booster. Due to atmospheric lead poisoning, it has been replaced worldwide with unleaded ethanol blends.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q2", "sci_4",
            "अल्कोहॉल थर्मामीटर में पारे (Mercury) के स्थान पर एथिल अल्कोहल का उपयोग किन परिस्थितियों में किया जाता है?",
            "Alcohol Thermometers (filled with dyed ethanol) are preferred over Mercury Thermometers for measuring:",
            listOf("अत्यधिक उच्च तापमान", "अत्यधिक निम्न तापमान (Extreme Cold / Sub-zero Temperatures down to -114°C)", "शरीर का तापमान", "उबलता पानी"),
            listOf("High temperatures", "Extremely Low sub-zero temperatures (Ethanol freezing point is -114.1°C vs Mercury -38.8°C)", "Body temperature", "Boiling water"),
            1,
            "पारा -38.8°C पर जम जाता है, इसलिए ध्रुवीय और अत्यधिक ठंडे क्षेत्रों में पारा थर्मामीटर काम नहीं करता। एथिल अल्कोहल का हिमांक -114.1°C होता है, अतः यह -100°C तक के तापमान को आसानी से माप लेता है।",
            "Mercury solidifies at -38.8°C, making it useless in polar climates. Ethanol freezes at -114.1°C, allowing cryogenic sub-zero meteorological readings.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q3", "sci_4",
            "पेट्रोल में 20% एथेनॉल मिलाने के भारत सरकार के लक्ष्य को किस नाम से जाना जाता है?",
            "India's target to achieve 20% Ethanol blending in Petrol by 2025-26 is part of which national initiative?",
            listOf("E-10 कार्यक्रम", "E-20 कार्यक्रम (Ethanol Blended Petrol - EBP Programme)", "गोबरधन योजना", "उज्ज्वला योजना"),
            listOf("E-10 program", "E-20 Programme (Ethanol Blended Petrol - 20% Bioethanol blend by 2025-26)", "GOBAR-dhan", "Ujjwala"),
            1,
            "E-20 कार्यक्रम के तहत पेट्रोल में 20% जैव-एथेनॉल (गन्ने के शीरे, मक्का और अतिरिक्त खाद्यान्न से निर्मित) मिलाया जाता है, जिससे कच्चे तेल के आयात पर निर्भरता घटती है और कार्बन उत्सर्जन कम होता है।",
            "The E-20 program mandates blending 20% sugarcane-derived anhydrous bioethanol with fossil gasoline to reduce crude oil import bills and carbon emissions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q4", "sci_4",
            "साबुन बनाने में तेल और वसा के साथ कास्टिक सोडा (NaOH) मिलाने पर सह-उत्पाद (By-product) के रूप में क्या प्राप्त होता है?",
            "In the saponification reaction of triglycerides with caustic soda (NaOH), which valuable trihydric alcohol is produced as a byproduct?",
            listOf("मेथनॉल", "ग्लिसरॉल / ग्लिसरीन (Glycerol - Propane-1,2,3-triol)", "एथेनॉल", "एसिटिक एसिड"),
            listOf("Methanol", "Glycerol / Glycerin (Propane-1,2,3-triol - C₃H₈O₃)", "Ethanol", "Acetic acid"),
            1,
            "सपोनिफिकेशन में 1 अणु ट्राइग्लिसराइड वसा + 3 NaOH → 3 साबुन अणु + 1 ग्लिसरॉल अणु। ग्लिसरॉल का उपयोग सौंदर्य प्रसाधनों, मॉइस्चराइजर और नाइट्रोग्लिसरीन विस्फोटक बनाने में होता है।",
            "Triglyceride saponification hydrolyzes ester linkages to yield crude soap and pure Glycerol (Glycerin, propane-1,2,3-triol) as a major byproduct.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q5", "sci_4",
            "पारंपरिक माचिस (Safety Matches) की तीली के सिरे पर और माचिस की डिब्बी की रगड़ने वाली सतह पर क्रमशः क्या लगा होता है?",
            "On a modern Safety Matchbox, the match head and the striking abrasive friction strip are coated respectively with:",
            listOf("तीली: लाल फास्फोरस, डिब्बी: सफेद फास्फोरस", "तीली के सिरे पर: पोटेशियम क्लोरेट (KClO₃) + एंटीमनी सल्फाइड; डिब्बी पर: लाल फास्फोरस + कांच का चूर्ण", "दोनों पर सल्फर", "तीली पर सोडियम, डिब्बी पर कार्बन"),
            listOf("Match head: Red phosphorus, Striker: White phosphorus", "Match Head: Potassium Chlorate (KClO₃) + Antimony Trisulfide (Sb₂S₃); Striker Strip: Red Phosphorus + Powdered Glass", "Both sulfur", "Match: Sodium, Striker: Carbon"),
            1,
            "डिब्बी की सतह पर लाल फास्फोरस और पिसा कांच होता है। रगड़ने पर घर्षण से थोड़ा लाल फास्फोरस सफेद फास्फोरस में बदलकर जलता है, जो तीली के KClO₃ और Sb₂S₃ को प्रज्वलित कर तीली जला देता है।",
            "Friction transforms red phosphorus on the striker strip into white phosphorus, which ignites and triggers the oxidizer Potassium Chlorate (KClO₃) and Antimony Trisulfide fuel on the match head.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m10_q6", "sci_4",
            "क्विकसिल्वर (Quicksilver / तरल चांदी) किस धातु का लोकप्रिय ऐतिहासिक नाम है?",
            "Which metallic element is known by the traditional historical name 'Quicksilver'?",
            listOf("चांदी (Ag)", "पारा / मरकरी (Mercury - Hydrargyrum / Hg)", "प्लेटिनम", "एल्युमीनियम"),
            listOf("Silver (Ag)", "Mercury (Hydrargyrum - Hg, Quicksilver)", "Platinum", "Aluminium"),
            1,
            "पारा (Hg) चांदी की तरह चमकदार और द्रव होने के कारण तेजी से बहता है, इसलिए इसे क्विकसिल्वर (Quicksilver) या 'द्रव चांदी' कहा जाता है। लैटिन नाम 'Hydrargyrum' का अर्थ 'जल-चांदी' है।",
            "Mercury's chemical symbol Hg derives from Latin Hydrargyrum (liquid silver), popularly called Quicksilver due to its metallic luster and liquid fluidity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q7", "sci_4",
            "मूर्खों का सोना (Fool's Gold) किसे कहा जाता है जो सोने जैसा पीला और चमकदार दिखता है?",
            "Which mineral sulfide is commonly nicknamed 'Fool's Gold' because its brassy yellow metallic luster deceives novice gold prospectors?",
            listOf("कॉपर सल्फेट", "आयरन पाइराइट (Iron Pyrite - FeS₂)", "जिंक सल्फाइड", "कैल्शियम सल्फाइड"),
            listOf("Copper sulfate", "Iron Pyrite (FeS₂ - Iron Disulfide / Fool's Gold)", "Zinc sulfide", "Calcium sulfide"),
            1,
            "आयरन पाइराइट (FeS₂) लोहे और सल्फर का यौगिक है। इसकी घन संरचना और पीली धातुई चमक सोने से मिलती-जुलती है, जिससे लोग धोखा खा जाते हैं।",
            "Iron Pyrite (FeS₂) is called Fool's Gold due to its brassy-yellow glittering crystals mimicking native gold nuggets.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q8", "sci_4",
            "काला सीसा (Black Lead) और 'प्लंबागो' (Plumbago) किसे कहा जाता है जिससे पेंसिल की लेड बनती है?",
            "Which non-metallic allotrope of carbon is colloquially known as 'Black Lead' or 'Plumbago' and used in pencil cores?",
            listOf("कोयला", "ग्रेफाइट (Graphite)", "चारकोल", "कार्बन ब्लैक"),
            listOf("Coal", "Graphite (Hexagonal layered Carbon allotrope)", "Charcoal", "Carbon black"),
            1,
            "ग्रेफाइट को ऐतिहासिक रूप से 'काला सीसा' कहा जाता था क्योंकि 16वीं शताब्दी में इसे सीसे (Lead) का एक प्रकार समझा गया था। पेंसिल की लेड में ग्रेफाइट और चिकनी मिट्टी (Clay) का मिश्रण होता है (इसमें सीसा 0% होता है)।",
            "Graphite was mistakenly called Black Lead when discovered in Borrowdale in 1564. Pencil leads contain pure graphite powder blended with clay binders, containing zero elemental lead.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q9", "sci_4",
            "हीरा (Diamond) और ग्रेफाइट (Graphite) दोनों केवल कार्बन के बने हैं, फिर भी हीरा कठोर व विद्युत का कुचालक है जबकि ग्रेफाइट नरम व विद्युत का सुचालक क्यों है?",
            "Diamond is an electrical insulator and the hardest known natural substance, while Graphite is soft, slippery, and an electrical conductor. Why?",
            listOf("हीरा भारी होता है", "हीरे में कार्बन sp³ संकरित (दृढ़ 3D चतुष्फलकीय जालक) है और कोई मुक्त इलेक्ट्रॉन नहीं है, जबकि ग्रेफाइट sp² संकरित (षट्कोणीय परतें) है और प्रति कार्बन एक मुक्त इलेक्ट्रॉन होता है", "ग्रेफाइट में हाइड्रोजन होता है", "हीरा ठंडा होता है"),
            listOf("Diamond is heavy", "Diamond has 3D tetrahedral sp³ network with no free electrons; Graphite has 2D hexagonal sp² sheets with delocalized free π electrons", "Graphite contains hydrogen", "Diamond is cold"),
            1,
            "हीरे में प्रत्येक कार्बन 4 अन्य कार्बनों से दृढ़ सहसंयोजक बंधों से जुड़ा होता है (sp³)। ग्रेफाइट में प्रत्येक कार्बन 3 कार्बनों से जुड़ा होता है (sp²) और चौथा इलेक्ट्रॉन विस्थानिकृत (मुक्त) होकर परतों के बीच विद्युत धारा प्रवाहित करता है।",
            "In Diamond, rigid tetrahedral sp³ bonding binds all 4 valence electrons tightly. In Graphite, planar sp² rings leave one delocalized π electron per atom free to conduct electricity.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m10_q10", "sci_4",
            "कैरेट (Carat) प्रणाली में 24 कैरेट शुद्ध सोना होता है। आभूषण बनाने के लिए प्रयुक्त 22 कैरेट सोने में शुद्ध सोने का प्रतिशत कितना होता है?",
            "24-Karat gold is 100% pure elemental gold. What is the purity percentage of pure gold in standard 22-Karat jewellery gold?",
            listOf("100%", "91.6% (या 916 हॉलमार्क: 22/24 × 100)", "75.0% (18 Karat)", "50.0%"),
            listOf("100%", "91.67% (BIS 916 Hallmark: 22 parts gold + 2 parts Copper/Silver)", "75.0% (18 Karat / 750 Hallmark)", "50.0%"),
            1,
            "24 कैरेट सोना बहुत नरम होता है और इसके आभूषण मुड़ जाते हैं। 22 कैरेट सोने में 22 भाग (91.67%) शुद्ध सोना और 2 भाग तांबा या चांदी मिलाई जाती है ताकि मजबूती आए (BIS 916 हॉलमार्क)। 18 कैरेट में 75% सोना होता है।",
            "22-Karat gold contains 22 parts pure gold alloyed with 2 parts copper or silver (22/24 = 91.67% purity, stamped as BIS 916 Hallmark).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q11", "sci_4",
            "अस्थियों (हड्डियों) और दांतों में मुख्य रूप से कौन-सा रासायनिक यौगिक पाया जाता है जो इन्हें कठोरता प्रदान करता है?",
            "Which inorganic calcium phosphate mineral constitutes ~70% of human bone mass and dental enamel?",
            listOf("कैल्शियम कार्बोनेट", "कैल्शियम हाइड्रॉक्सीएपेटाइट / कैल्शियम फॉस्फेट (Calcium Hydroxyapatite - Ca₁₀(PO₄)₆(OH)₂ / Tricalcium Phosphate)", "कैल्शियम सल्फेट", "कैल्शियम क्लोराइड"),
            listOf("Calcium carbonate", "Calcium Hydroxyapatite / Calcium Phosphate (Ca₁₀(PO₄)₆(OH)₂)", "Calcium sulfate", "Calcium chloride"),
            1,
            "मानव हड्डियों और दांतों के इनेमल का मुख्य खनिज घटक 'हाइड्रॉक्सीएपेटाइट' [Ca₁₀(PO₄)₆(OH)₂] है जो कैल्शियम फॉस्फेट का क्रिस्टलीय रूप है। दांतों का इनेमल शरीर का सबसे कठोर पदार्थ है।",
            "Bone mineral and tooth enamel consist predominantly of crystalline Hydroxyapatite (modified tricalcium phosphate), providing structural rigidity against mechanical strain.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q12", "sci_4",
            "दांतों को सड़ांध (Cavities) से बचाने के लिए टूथपेस्ट में कौन-सा खनिज आयन मिलाया जाता है जो इनेमल को फ्लोरोएपेटाइट में बदल देता है?",
            "Which trace halide ion is formulated in toothpastes to strengthen dental enamel into acid-resistant Fluoroapatite?",
            listOf("क्लोराइड", "फ्लोराइड (Fluoride - F⁻, ~1000-1500 ppm)", "ब्रोमाइड", "आयोडाइड"),
            listOf("Chloride", "Fluoride (Fluoride ion - F⁻ / Sodium Monofluorophosphate)", "Bromide", "Iodide"),
            1,
            "फ्लोराइड आयन (F⁻) दांतों के हाइड्रॉक्सीएपेटाइट के OH⁻ को प्रतिस्थापित कर फ्लोरोएपेटाइट बनाता है, जो मुंह के जीवाणुओं द्वारा उत्पन्न एसिड के प्रति अत्यधिक प्रतिरोधी होता है। (अधिक फ्लोराइड से फ्लोरोसिस होता है)।",
            "Fluoride incorporates into tooth enamel to form Fluorapatite [Ca₁₀(PO₄)₆F₂], which is significantly more resistant to demineralization by bacterial plaque acids.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q13", "sci_4",
            "पेयजल में फ्लोराइड की अत्यधिक मात्रा (> 1.5 mg/L) होने से कौन-सा गंभीर रोग होता है जिससे दांत पीले और हड्डियां टेढ़ी हो जाती हैं?",
            "Chronic consumption of drinking water with excessive Fluoride concentration (> 1.5 ppm) leads to:",
            listOf("घेंघा रोग", "फ्लोरोसिस (Fluorosis - Dental and Skeletal Fluorosis)", "एनीमिया", "स्कर्वी"),
            listOf("Goitre", "Fluorosis (Dental mottling and Skeletal Fluorosis)", "Anemia", "Scurvy"),
            1,
            "फ्लोरोसिस दो प्रकार का होता है: दंत फ्लोरोसिस (दांतों पर पीले-भूरे धब्बे) और कंकाल फ्लोरोसिस (हड्डियों का कड़ा होना, जोड़ों का दर्द और कूबड़ निकलना/Knock-knee syndrome)।",
            "Excessive groundwater fluoride causes Fluorosis, leading to enamel hypomineralization (brown mottling) and debilitating skeletal deformities.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m10_q14", "sci_4",
            "पेयजल में नाइट्रेट (NO₃⁻ > 45 mg/L) की अधिकता से शिशुओं में कौन-सा जानलेवा रोग 'ब्लू बेबी सिंड्रोम' (Blue Baby Syndrome) होता है?",
            "Infant cyanosis ('Blue Baby Syndrome') caused by high Nitrate contamination in well water is medically known as:",
            listOf("इटाई-इटाई रोग", "मेथेमोग्लोबिनेमिया (Methemoglobinemia)", "मिनीमाता रोग", "सिलिकोसिस"),
            listOf("Itai-Itai disease", "Methemoglobinemia (Blue Baby Syndrome)", "Minamata disease", "Silicosis"),
            1,
            "शिशुओं के पेट में नाइट्रेट नाइट्राइट (NO₂⁻) में बदल जाता है, जो हीमोग्लोबिन के Fe²⁺ को Fe³⁺ में ऑक्सीकृत कर 'मेथेमोग्लोबिन' बना देता है। यह ऑक्सीजन नहीं ले जा पाता जिससे शिशु का शरीर नीला पड़ जाता है।",
            "Nitrate ingested by infants reduces to nitrite in gut flora, converting hemoglobin into Methemoglobin (Fe³⁺) which cannot bind oxygen, causing fatal tissue hypoxia (cyanosis).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m10_q15", "sci_4",
            "जल में पारा (Mercury) और कैडमियम (Cadmium) के औद्योगिक प्रदूषण से क्रमशः कौन-से दो प्रसिद्ध जापानी रोग उत्पन्न हुए थे?",
            "Industrial water contamination with Mercury (Methylmercury) and Cadmium (Cd) caused which two infamous toxic diseases in Japan?",
            listOf("पारा: इटाई-इटाई, कैडमियम: मिनीमाता", "पारा: मिनीमाता रोग (Minamata Disease), कैडमियम: इटाई-इटाई रोग (Itai-Itai Disease)", "पारा: सिलिकोसिस, कैडमियम: एस्बेस्टोसिस", "दोनों से फ्लोरोसिस"),
            listOf("Mercury: Itai-Itai; Cadmium: Minamata", "Mercury: Minamata Disease; Cadmium: Itai-Itai Disease ('Ouch-Ouch' osteomalacia)", "Mercury: Silicosis; Cadmium: Asbestosis", "Both Fluorosis"),
            1,
            "1956 में मिनीमाता खाड़ी में मिथाइलमरकरी युक्त मछलियां खाने से तंत्रिका तंत्र का गंभीर 'मिनीमाता रोग' हुआ। 1912 में टोयामा में कैडमियम प्रदूषण से हड्डियों के टूटने और तेज दर्द वाला 'इटाई-इटाई रोग' हुआ।",
            "Minamata Disease was caused by bioaccumulated Methylmercury poisoning of coastal fish. Itai-Itai Disease was caused by Cadmium runoff from mines causing severe osteomalacia and renal failure.",
            "Easy"
        )
    )
}
