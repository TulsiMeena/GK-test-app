package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic10Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1: Natural & Synthetic Polymers (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m1_q1", "sci_10",
            "नॉन-स्टिक बर्तनों (Non-Stick Cookware) पर भोजन चिपकने से रोकने हेतु किस बहुलक (Polymer) की परत चढ़ाई जाती है?",
            "Which fluoropolymer, chemically known as Polytetrafluoroethylene (PTFE), is coated on cooking pans and utensils to create a heat-resistant, non-stick surface?",
            listOf("टेफ्लॉन / पॉलीटेट्राफ्लुओरोएथिलीन (Teflon / PTFE)", "पीवीसी (PVC)", "बेकेलाइट", "नायलॉन-6,6"),
            listOf("Teflon / PTFE (Polytetrafluoroethylene - -(CF2-CF2)n- discovered by Roy Plunkett)", "PVC (Polyvinyl Chloride)", "Bakelite", "Nylon-6,6"),
            0,
            "टेफ्लॉन (PTFE - Polytetrafluoroethylene) टेट्राफ्लुओरोएथिलीन (F2C=CF2) का बहुलक है। इसके कार्बन-फ्लोरीन बंध अत्यंत मजबूत होते हैं, जिससे यह 300°C तक गर्मी, एसिड, क्षार और तेल-पानी को चिपकने नहीं देता।",
            "Polytetrafluoroethylene (PTFE) possesses exceptionally high chemical inertness, high thermal stability (melting point 327°C), and the lowest coefficient of friction among solid polymers due to non-polar C-F bonds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q2", "sci_10",
            "बिजली के स्विच (Electric Switches), प्लग और बर्तनों के काले हैंडिल बनाने में किस पहले पूर्णतः संश्लेषित थर्मोसेटिंग प्लास्टिक (Thermosetting Plastic) का उपयोग होता है?",
            "Which pioneering synthetic thermosetting cross-linked polymer (synthesized from Phenol and Formaldehyde by Leo Baekeland in 1907) is used for electrical switches and heat-resistant cookware handles?",
            listOf("बेकेलाइट (Bakelite / Phenol-Formaldehyde Resin)", "पॉलीथीन", "टेफ्लॉन", "पीवीसी"),
            listOf("Bakelite (Phenol-Formaldehyde cross-linked polymer)", "Polyethylene", "Teflon", "Polyvinyl Chloride"),
            0,
            "बेकेलाइट (Bakelite) फिनोल और फॉर्मेल्डिहाइड का संघनन बहुलक (Condensation Polymer) है। यह ऊष्मा और बिजली का कुचालक (Insulator) होता है और एक बार गर्म करके सांचे में ढालने के बाद दोबारा पिघलता नहीं है (Thermosetting)।",
            "Bakelite is a thermosetting phenolic resin formed by step-growth polymerization of phenol with formaldehyde under alkaline/acidic catalysis, forming a rigid 3D cross-linked covalent network.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q3", "sci_10",
            "पानी की पाइपों (Plumbing Pipes), बरसाती कोट (Raincoats) और बिजली के तारों के इंसुलेशन में इस्तेमाल होने वाला 'पीवीसी' (PVC) किसका बहुलक है?",
            "Polyvinyl Chloride (PVC), widely used for construction drainage pipes, vinyl flooring, and cable sheathing, is an addition polymer synthesized from which monomer?",
            listOf("विनाइल क्लोराइड (Vinyl Chloride - CH2=CHCl)", "एथिलीन", "टेट्राफ्लुओरोएथिलीन", "स्टाइरीन"),
            listOf("Vinyl Chloride / Chloroethene (CH2=CHCl)", "Ethylene", "Tetrafluoroethylene", "Styrene"),
            0,
            "PVC (पॉलीविनाइल क्लोराइड) विनाइल क्लोराइड (CH2=CHCl) के बहुलकीकरण से बनता है। यह अग्निरोधी और जलरोधी होता है। इसे लचीला बनाने हेतु इसमें 'थैलेट्स' (Phthalate Plasticizers) मिलाए जाते हैं।",
            "Polyvinyl chloride is produced by free-radical suspension polymerization of vinyl chloride monomer; addition of plasticizers (e.g., DEHP) converts rigid unplasticized PVC (uPVC) into flexible PVC.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q4", "sci_10",
            "बुलेटप्रूफ जैकेट (Bulletproof Vests) और उच्च क्षमता वाले हेलमेट बनाने में किस अत्यधिक मजबूत सिंथेटिक पॉलीएमाइड फाइबर (Aramid Fiber) का उपयोग किया जाता है?",
            "Which ultra-high-strength synthetic aromatic polyamide (Aramid) fiber, developed by Stephanie Kwolek at DuPont, is widely deployed in military Bulletproof Vests and aerospace armor?",
            listOf("केवलर (Kevlar / Poly-paraphenylene terephthalamide)", "रेयॉन", "नायलॉन-6", "डैक्रॉन"),
            listOf("Kevlar (Poly-para-phenylene terephthalamide - Tensile strength 5 times higher than structural steel by weight)", "Rayon", "Nylon-6", "Dacron"),
            0,
            "केवलर (Kevlar) एक सुगंधित पॉलीएमाइड (Aramid) है जो 1,4-फेनिलीन-डायमीन और टेरेफ्थैलिक एसिड के संघनन से बनता है। इसकी आणविक श्रृंखलाओं में मजबूत अंतर-आणविक हाइड्रोजन बंध होते हैं, जिससे यह स्टील से 5 गुना मजबूत और बुलेटप्रूफ होता है।",
            "Kevlar's extraordinary tensile strength (~3620 MPa) derives from fully extended all-trans aromatic rigid-rod polymer chains aligned in parallel liquid-crystalline domains bonded by extensive hydrogen bonds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q5", "sci_10",
            "क्रॉकरी के न टूटने वाले कप-प्लेट (Unbreakable Dinnerware) और मेलामाइन बर्तनों के निर्माण में प्रयुक्त बहुलक किसका संघनन उत्पाद है?",
            "Unbreakable, shatter-resistant decorative plastic crockery, melamine plates, and laminate tabletops are made of a condensation copolymer formed from Formaldehyde and:",
            listOf("मेलामाइन (Melamine - 1,3,5-triazine-2,4,6-triamine)", "फिनोल", "यूरिया", "एथिलीन ग्लाइकोल"),
            listOf("Melamine (Melamine-Formaldehyde Resin - 2,4,6-triamino-1,3,5-triazine)", "Phenol", "Urea", "Ethylene glycol"),
            0,
            "मेलामाइन-फॉर्मेल्डिहाइड रेजिन एक मजबूत थर्मोसेटिंग प्लास्टिक है जो टूटने और खरोंच के प्रति अत्यधिक प्रतिरोधी है। इसका उपयोग अटूट कप-प्लेट, ट्रे और फॉर्मिका लेमिनेट बनाने में होता है।",
            "Melamine reacts with formaldehyde in a nucleophilic addition to yield methylolmelamines, which cross-link under heat and acid to form a rigid, flame-retardant thermosetting network.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q6", "sci_10",
            "मानव निर्मित पहला पूर्णतः संश्लेषित रेशा (First Fully Synthetic Fibre) कौन-सा था जिसे कोयले, पानी और हवा से 1935 में बनाया गया था?",
            "Which was the world's first commercially successful, 100% fully synthetic polymer fiber synthesized by Wallace Carothers in 1935 (used for toothbrush bristles, stockings, and ropes)?",
            listOf("नायलॉन-6,6 (Nylon-6,6)", "रेयॉन (Semi-synthetic)", "डैक्रॉन / पॉलिएस्टर", "ऐक्रेलिक"),
            listOf("Nylon-6,6 (Aliphatic polyamide synthesized from Hexamethylenediamine and Adipic acid)", "Rayon (Regenerated cellulose)", "Dacron / Polyester", "Acrylic / Orlon"),
            0,
            "नायलॉन-6,6 (Nylon 6,6) हेक्सामेथिलीन डायमीन और एडिपिक एसिड (दोनों में 6-6 कार्बन) से बनाया गया था। इसका नाम न्यूयॉर्क (NY) और लंदन (LON) के नाम पर 'NYLON' रखा गया। यह बहुत मजबूत, लचीला और जलरोधी होता है।",
            "Nylon-6,6 is a step-growth aliphatic polyamide formed by polycondensation of adipic acid with hexamethylenediamine, exhibiting high tensile strength due to repeating interchain hydrogen-bonded amide (-CONH-) linkages.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q7", "sci_10",
            "कपड़ों के निर्माण में प्रयुक्त होने वाला 'टेरीलीन' (Terylene) या 'डैक्रॉन' (Dacron) किस श्रेणी का लोकप्रिय बहुलक रेशा है?",
            "Terylene (Dacron), the wrinkle-resistant, fast-drying synthetic fiber blended with cotton to make 'Terrycot', belongs to which major polymer class?",
            listOf("पॉलिएस्टर (Polyester - Polyethylene Terephthalate / PET)", "पॉलीएमाइड", "पॉलीयूरेथेन", "पॉलीएक्रिलोनाइट्राइल"),
            listOf("Polyester (PET - Synthesized by polycondensation of Ethylene Glycol and Terephthalic Acid with ester linkages -COO-)", "Polyamide", "Polyurethane", "Polyacrylonitrile"),
            0,
            "टेरीलीन (डैक्रॉन / PET) एथिलीन ग्लाइकोल और टेरेफ्थैलिक एसिड के संघनन से बनता है। इसमें एस्टर (-COO-) समूह की पुनरावृत्ति होती है, इसलिए यह 'पॉलिएस्टर' कहलाता है। इसमें सलवटें (Wrinkles) नहीं पड़तीं।",
            "Polyethylene terephthalate (PET / Terylene) is synthesized via transesterification of dimethyl terephthalate or direct esterification of purified terephthalic acid with monoethylene glycol at 280°C with antimony catalyst.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q8", "sci_10",
            "डिस्पोजेबल चाय के कप, पैकेजिंग फोम और थर्माकोल (Thermocol) किस बहुलक के झागदार रूप (Expanded form) से बनाए जाते हैं?",
            "Lightweight insulation sheets, shock-absorbing packaging foam, and white Thermocol beads are industrially manufactured from Expanded:",
            listOf("पॉलीस्टाइरीन (Polystyrene - Expanded Polystyrene / EPS)", "पॉलीथीन", "पॉलीविनाइल क्लोराइड", "टेफ्लॉन"),
            listOf("Expanded Polystyrene (EPS / Thermocol - Polymerized from Styrene / Ethenylbenzene C6H5-CH=CH2)", "Polyethylene", "Polyvinyl chloride", "Teflon"),
            0,
            "थर्माकोल वास्तव में 'एक्सपेंडेड पॉलीस्टाइरीन' (EPS) है। इसमें 95-98% हवा भरी होती है। यह स्टाइरीन (C6H5-CH=CH2) का बहुलक है। यह ऊष्मा और झटके का बेहतरीन कुचालक है, लेकिन पर्यावरण में कभी नष्ट नहीं होता।",
            "Polystyrene is an aromatic addition polymer made from vinyl benzene; expanding pentane blowing agent inside heated polystyrene beads forms lightweight foamed thermal insulation (EPS).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q9", "sci_10",
            "प्राकृतिक रूप से पाए जाने वाले सेल्युलोज (लकड़ी की लुगदी / Wood Pulp) से रासायनिक उपचार द्वारा बनाया जाने वाला 'अर्ध-संश्लेषित रेशा' (Semi-Synthetic Fibre / कृत्रिम रेशम) कौन-सा है?",
            "Which regenerated semi-synthetic cellulosic fiber, historically developed as an affordable alternative to pure silk ('Artificial Silk'), is manufactured from regenerated wood pulp?",
            listOf("रेयॉन (Rayon / Viscose Rayon)", "नायलॉन", "पॉलिएस्टर", "ऐक्रेलिक"),
            listOf("Rayon (Viscose Rayon / Cuprammonium Rayon - Regenerated natural Cellulose xanthate)", "Nylon", "Polyester", "Acrylic"),
            0,
            "रेयॉन (Rayon) को 'कृत्रिम रेशम' (Artificial Silk) कहते हैं। यह शुद्ध सिंथेटिक नहीं बल्कि 'अर्ध-संश्लेषित' है क्योंकि इसका कच्चा माल प्राकृतिक सेल्युलोज (लकड़ी की लुगदी) होता है जिसे NaOH और CS2 से विस्कोस बनाकर धागे में ढाला जाता है।",
            "Viscose rayon production treats wood alpha-cellulose with sodium hydroxide and carbon disulfide to form soluble sodium cellulose xanthate, extruded through spinnerets into dilute sulfuric acid baths for cellulose regeneration.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q10", "sci_10",
            "उनी कपड़ों और स्वेटर में प्राकृतिक ऊन (Wool) के सस्ते कृत्रिम विकल्प के रूप में किस सिंथेटिक रेशे का उपयोग किया जाता है?",
            "Which synthetic acrylic fiber (commercialized as Orlon, Cashmilon, or Acrilan) is widely used as a warm, lightweight, moth-resistant artificial substitute for natural sheep Wool?",
            listOf("ऐक्रेलिक / ऑरलॉन / कैशमिलॉन (Acrylic / Polyacrylonitrile - PAN / Orlon)", "रेयॉन", "टेरीलीन", "नायलॉन"),
            listOf("Polyacrylonitrile (PAN / Acrylic / Orlon - polymerized from Acrylonitrile CH2=CH-CN)", "Rayon", "Terylene", "Nylon"),
            0,
            "ऐक्रेलिक (ऑरलॉन / कैशमिलॉन) ऐक्रिलोनाइट्राइल (CH2=CH-CN) का बहुलक है। यह बिल्कुल ऊन जैसा गर्म, हल्का और मुलायम होता है, लेकिन इस पर फफूंद और कीड़े (Moths) नहीं लगते और यह धोना बहुत आसान है।",
            "Polyacrylonitrile (PAN) fibers mimic natural keratin wool properties via low thermal conductivity and bulky crimped molecular morphology, synthesized by peroxide-catalyzed free-radical polymerization of vinyl cyanide.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q11", "sci_10",
            "शल्य चिकित्सा (Surgery) में आंतरिक अंगों के टांके (Biodegradable Sutures) लगाने में किस घुलनशील बहुलक का उपयोग होता है जो शरीर में स्वतः घुलकर अवशोषित हो जाता है?",
            "Which fully bioabsorbable and biodegradable aliphatic polyester copolymer is utilized in modern medical surgery for dissolvable internal surgical stitches (Sutures)?",
            listOf("डेक्सट्रॉन / पीजीए / पीएलजीए (Polyglycolic Acid - PGA / Polyhydroxybutyrate - PHBV)", "नायलॉन-6", "पीवीसी", "टेफ्लॉन"),
            listOf("PHBV / Polyglycolic Acid (PGA) / Poly-L-lactic acid (PLLA - Hydrolyzed safely in vivo by tissue esterases into natural metabolites)", "Nylon-6", "PVC", "Teflon"),
            0,
            "PHBV (पॉली-बीटा-हाइड्रॉक्सीब्यूटायरेट-को-बीटा-हाइड्रॉक्सीवैलेरेट) और पॉलीग्लाइकोलिक एसिड (PGA) जैव-निम्नीकरणीय (Biodegradable) बहुलक हैं। शरीर के ऊतकों में मौजूद एंजाइम इन्हें हानिरहित लैक्टिक एसिड और पानी में घोल देते हैं, जिससे टांके निकालने की जरूरत नहीं पड़ती।",
            "Surgical absorbable sutures (Vicryl / Dexon) made of polyglycolic acid-co-lactic acid undergo non-enzymatic ester bond hydrolysis in physiologic aqueous tissue fluid into biocompatible glycolate and lactate.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m1_q12", "sci_10",
            "हवाई जहाज की खिड़कियां, कार की हेडलाइट्स और चश्मे के पारदर्शी लेंस (Unbreakable Glass) बनाने में किस एक्रिलिक बहुलक (Plexiglas) का उपयोग होता है?",
            "Which optically transparent, shatterproof acrylic glass polymer (known commercially as Lucite, Plexiglas, or Perspex) is synthesized from Methyl Methacrylate?",
            listOf("पीएमएमए / प्लेक्सीग्लास (PMMA - Polymethyl Methacrylate / Perspex)", "पॉलीथीन", "नायलॉन", "बेकेलाइट"),
            listOf("Polymethyl Methacrylate (PMMA / Acrylic Glass / Plexiglas - 92% visible light transmittance, shatterproof)", "Polyethylene", "Nylon", "Bakelite"),
            0,
            "PMMA (पॉलीमिथाइल मेथाक्रिलेट / प्लेक्सीग्लास / पर्सपेक्स) कांच से आधा हल्का और 10 गुना अधिक मजबूत होता है। यह 92% प्रकाश को पार जाने देता है। इसका उपयोग पनडुब्बी की खिड़कियां, एक्वेरियम की दीवारें, और कॉन्टैक्ट लेंस बनाने में होता है।",
            "PMMA is a transparent thermoplastic homopolymer synthesized by free-radical polymerization of methyl methacrylate, possessing refractive index 1.49 and high UV-weathering resistance.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q13", "sci_10",
            "नायलॉन-6 (Nylon-6 / Perlon) का निर्माण किस एकल चक्रीय मोनोमर (Cyclic Monomer) को उच्च ताप पर गर्म करके रिंग-ओपनिंग पॉलीमराइजेशन द्वारा किया जाता है?",
            "Nylon-6 (Perlon) is industrially synthesized via ring-opening polymerization of which single 7-membered cyclic lactam monomer heated with water at 533 K?",
            listOf("कैप्रोलैक्टम (Caprolactam)", "एडिपिक एसिड", "एथिलीन ग्लाइकोल", "स्टाइरीन"),
            listOf("Caprolactam (Hexahydro-2H-azepin-2-one - Ring opening hydrolyzes into 6-aminohexanoic acid)", "Adipic acid", "Ethylene glycol", "Styrene"),
            0,
            "नायलॉन-6 केवल एक मोनोमर 'कैप्रोलैक्टम' (Caprolactam) से बनता है। जब कैप्रोलैक्टम को पानी के साथ 533 K पर गर्म किया जाता है, तो इसकी वलय टूट जाती है और नायलॉन-6 बन जाता है। इसका उपयोग टायर कॉर्ड और मछली पकड़ने के जाल में होता है।",
            "Caprolactam undergoes water-initiated hydrolytic ring-opening polymerization, where the cleavage of its internal amide bond generates aminocaproic acid which step-polymerizes into high-tenacity Nylon-6 filaments.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m1_q14", "sci_10",
            "पौधों की कोशिकाओं में संचित 'स्टार्च' (Starch) किन दो प्रकार के ग्लूकोज पॉलीमर्स का मिश्रण होता है?",
            "Plant dietary Starch, the primary energy storage macromolecule in potatoes and grains, consists of which two structurally distinct alpha-D-glucan polysaccharides?",
            listOf("एमाइलोज (20% जल में घुलनशील) एवं एमाइलोपेक्टिन (80% शाखित अघुलनशील) (Amylose and Amylopectin)", "सेल्युलोज और पेक्टिन", "ग्लूकोज और फ्रुक्टोज", "ग्लाइकोजन और काइटीन"),
            listOf("Amylose (Linear alpha-1,4-linked unbranched chains) and Amylopectin (Highly branched with alpha-1,4 and alpha-1,6 branch linkages)", "Cellulose and Pectin", "Glucose and Fructose", "Glycogen and Chitin"),
            0,
            "स्टार्च में दो भाग होते हैं: 1. एमाइलोज (15-20%): सीधी अनावृत श्रृंखला जो जल में घुलनशील होती है और आयोडीन के साथ नीला रंग देती है। 2. एमाइलोपेक्टिन (80-85%): अत्यधिक शाखित (Branched) श्रृंखला जो जल में अघुलनशील होती है।",
            "Amylose forms a left-handed helical coil that entraps polyiodide chromophores; Amylopectin features branch points every 24-30 glucose residues via alpha-1,6-glucosidic bonds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m1_q15", "sci_10",
            "कीट-पतंगों (Insects), केकड़ों और झींगों के बाह्य कंकाल (Exoskeleton) तथा कवकों (Fungi) की कोशिका भित्ति में पाया जाने वाला प्राकृतिक बहुलक कौन-सा है?",
            "Which tough, nitrogenous structural polysaccharide forms the rigid exoskeletons of arthropods (crabs, lobsters, insects) and the cell walls of true fungi?",
            listOf("काइटीन (Chitin - N-Acetylglucosamine polymer)", "सेल्युलोज", "केराटिन", "लिग्निन"),
            listOf("Chitin (Beta-1,4-linked homopolymer of N-acetyl-D-glucosamine residues)", "Cellulose", "Keratin", "Lignin"),
            0,
            "काइटीन (Chitin) प्रकृति में सेल्युलोज के बाद दूसरा सबसे प्रचुर प्राकृतिक बहुलक है। यह 'एन-एसिटाइल ग्लूकोसामाइन' का बहुलक है। झींगे और केकड़े का कड़ा कवच काइटीन का ही बना होता है। इसे डी-एसिटिलेट करके 'काइटोसन' बनाया जाता है जो घाव भरने में उपयोगी है।",
            "Chitin consists of unbranched chains of beta-(1->4)-linked N-acetylglucosamine, forming antiparallel crystalline microfibrils reinforced by interchain hydrogen bonding.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2: Soaps, Detergents & Cleansing Action (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m2_q1", "sci_10",
            "साबुन (Soap) रासायनिक रूप से उच्च वसा अम्लों (Higher Fatty Acids) के कौन-से लवण होते हैं?",
            "Chemically, ordinary household cleaning Soaps are sodium or potassium salts of long-chain aliphatic carboxylic acids (Fatty Acids) such as:",
            listOf("सोडियम या पोटेशियम स्टीयरेट, पामिटेट एवं ओलिएट (Sodium or Potassium Stearate / Palmitate / Oleate)", "कैल्शियम कार्बोनेट", "सोडियम क्लोराइड", "पोटेशियम नाइट्रेट"),
            listOf("Sodium or Potassium salts of long-chain fatty acids (e.g., Sodium Stearate C17H35COONa, Sodium Palmitate C15H31COONa)", "Calcium Carbonate", "Sodium Chloride", "Potassium Nitrate"),
            0,
            "साबुन 12 से 18 कार्बन वाले उच्च वसा अम्लों (जैसे स्टीयरिक, पामिटिक और ओलिक एसिड) के सोडियम या पोटेशियम लवण होते हैं। सोडियम लवण (कठोर साबुन - कपड़े धोने हेतु) और पोटेशियम लवण (मुलायम साबुन - नहाने व शेविंग हेतु) कहलाते हैं।",
            "Soaps are alkali metal carboxylates synthesized by basic hydrolysis of triglyceride esters; sodium soaps yield dense hard soap bars, while potassium soaps yield soft soluble body washes and shaving foams.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q2", "sci_10",
            "वनस्पति तेल या जंतु वसा (Triglycerides) को कास्टिक सोडा (NaOH) के साथ गर्म करके साबुन और सह-उत्पाद 'ग्लिसरॉल' बनाने की रासायनिक प्रक्रिया क्या कहलाती है?",
            "The alkaline hydrolysis of natural triglycerides (esters of glycerol and fatty acids) with Sodium Hydroxide (NaOH) to yield Soap and by-product Glycerol is termed:",
            listOf("साबुनीकरण (Saponification)", "किण्वन (Fermentation)", "एस्टरीकरण", "हाइड्रोजनीकरण"),
            listOf("Saponification (Base-catalyzed ester hydrolysis of triglycerides yielding glycerol / 1,2,3-propanetriol and soap carboxylates)", "Fermentation", "Esterification", "Hydrogenation"),
            0,
            "साबुनीकरण (Saponification) में तेल/वसा + NaOH → साबुन + ग्लिसरॉल (Glycerol / Glycerine) बनता है। साबुन को घोल से अलग (अवक्षेपित) करने के लिए इसमें साधारण नमक (NaCl - Salting out of soap) मिलाया जाता है।",
            "Triglycerides undergo nucleophilic acyl substitution by hydroxide ions at ester carbonyl carbons, cleaving the triester into propane-1,2,3-triol (glycerol) and three carboxylate soap anions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q3", "sci_10",
            "साबुन के निर्माण के दौरान बनने वाले मूल्यवान उप-उत्पाद (By-Product) 'ग्लिसरीन / ग्लिसरॉल' (Glycerine) का रासायनिक सूत्र और उपयोग क्या है?",
            "What is the chemical formula and primary commercial utility of Glycerol (Glycerine / Propane-1,2,3-triol), the major by-product recovered during soap saponification?",
            listOf("C3H8O3 - सौंदर्य प्रसाधन, मॉइस्चराइजर एवं नाइट्रोग्लिसरीन विस्फोटक बनाने में", "C2H5OH - ईंधन", "CH4 - गैस", "C6H12O6 - चीनी"),
            listOf("C3H5(OH)3 / Propane-1,2,3-triol (Trihydric alcohol used in cosmetics, skin humectants, pharmaceuticals, and nitroglycerine dynamite)", "C2H5OH - Fuel", "CH4 - Biogas", "C6H12O6 - Sugar"),
            0,
            "ग्लिसरॉल (C3H8O3) एक त्रि-हाइड्रिक अल्कोहल (Propane-1,2,3-triol) है। यह नमी सोखने वाला (Humectant) होता है, इसलिए इसे त्वचा की क्रीम, ग्लिसरीन साबुन, दवाओं और नाइट्रोग्लिसरीन (डायनामाइट विस्फोटक) बनाने में काम में लिया जाता है।",
            "Glycerol contains three hydrophilic hydroxyl groups capable of extensive hydrogen bonding with water molecules, functioning as an emollient humectant in topical dermatological formulations.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q4", "sci_10",
            "साबुन के अणु में जल-आकर्षक (Hydrophilic) और जल-प्रतिकर्षक (Hydrophobic) सिरे कौन-से होते हैं?",
            "In a Sodium Stearate soap molecule (C17H35COO- Na+), which structural parts constitute the Water-Loving (Hydrophilic) and Oil-Loving / Water-Repelling (Hydrophobic) ends respectively?",
            listOf("आयनिक सिरा (-COO- Na+) जल-स्नेही (Hydrophilic) तथा हाइड्रोकार्बन पूंछ (C17H35) जल-विरोधी (Hydrophobic)", "दोनों जल-स्नेही हैं", "दोनों जल-विरोधी हैं", "कार्बन पूंछ जल-स्नेही है"),
            listOf("Polar ionic head group (-COO- Na+) is Hydrophilic / Lipophobic, while long non-polar alkyl tail (C17H35) is Hydrophobic / Lipophilic", "Both are hydrophilic", "Both are hydrophobic", "Alkyl tail is hydrophilic"),
            0,
            "साबुन का अणु उभयधर्मी (Amphipathic) होता है। 1. लंबी हाइड्रोकार्बन पूंछ (C17H35): अध्रुवीय, जल-विरोधी (Hydrophobic), तेल-स्नेही (मैल/तेल से चिपकती है)। 2. आयनिक शीर्ष (-COO-Na+): ध्रुवीय, जल-स्नेही (Hydrophilic, पानी की तरफ रहता है)।",
            "Soap anions are classic surfactants; the polar carboxylate head forms ion-dipole interactions with aqueous bulk water, while the non-polar aliphatic hydrocarbon tail partitions into hydrophobic greasy soils.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q5", "sci_10",
            "पानी में साबुन के अणुओं द्वारा तेल और मैल की बूंद के चारों ओर गोलाकार गुच्छे बनाने की संरचना क्या कहलाती है?",
            "The spherical colloidal aggregate formed in water when soap molecules orient their hydrophobic tails inward into an oil droplet and hydrophilic heads outward toward water is called a:",
            listOf("मिसेल / मिसेली संरचना (Micelle / Micellar Aggregate)", "क्रिस्टल", "पॉलीमर", "अवक्षेप"),
            listOf("Micelle (Spherical colloidal cluster formed above the Critical Micelle Concentration - CMC)", "Ionic Crystal", "Polymer Matrix", "Macro-precipitate"),
            0,
            "मैल (ग्रीस/तेल) पानी में नहीं घुलता। साबुन के अणुओं की हाइड्रोकार्बन पूंछ मैल की बूंद में घुस जाती है और ध्रुवीय सिरे बाहर पानी की तरफ रहते हैं, जिससे एक गोलाकार 'मिसेल' (Micelle) बन जाता है। हिलाने पर यह मिसेल पानी में खिंच जाता है और कपड़ा साफ हो जाता है।",
            "Micellization is driven by the hydrophobic effect (entropy gain from releasing structured water cages around alkyl tails); spherical micelles encapsulate hydrophobic greases in their core, forming a stable emulsion.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q6", "sci_10",
            "वह न्यूनतम तापमान (Kraft Temperature) और न्यूनतम सांद्रण जिसके ऊपर साबुन के अणु मिसेल बनाना शुरू करते हैं, क्या कहलाता है?",
            "The threshold surfactant concentration above which individual surfactant monomers spontaneously assemble into colloidal micelles is designated as:",
            listOf("क्रांतिक मिसेल सांद्रता (Critical Micelle Concentration - CMC)", "संतृप्त सांद्रता", "क्वथनांक", "गलनांक"),
            listOf("Critical Micelle Concentration (CMC - Above which surface tension remains constant and micellar solubilization begins)", "Saturation point", "Boiling point", "Krafft temperature"),
            0,
            "CMC (Critical Micelle Concentration) वह निश्चित सांद्रता है जिसके बाद साबुन या डिटर्जेंट के अणु आपस में जुड़कर मिसेल बनाना शुरू करते हैं। CMC से कम सांद्रता पर साबुन मैल साफ नहीं कर पाता। क्राफ्ट तापमान (Tk) वह न्यूनतम तापमान है जिस पर मिसेल बनते हैं।",
            "At surfactant concentrations below CMC, monomers adsorb at the air-water interface; upon reaching the CMC, the interface saturates, driving spontaneous thermodynamic self-assembly into spherical micelles.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m2_q7", "sci_10",
            "साधारण साबुन 'कठोर जल' (Hard Water - जिसमें Ca2+ और Mg2+ आयन होते हैं) में झाग क्यों नहीं देता और सफेद मैल (Scum) क्यों बना लेता है?",
            "Why do traditional fatty acid soaps fail to lather in Hard Water, producing an insoluble sticky white curd/scum (Curdy precipitate)?",
            listOf("कठोर जल के Ca2+ एवं Mg2+ आयन साबुन के साथ मिलकर अघुलनशील कैल्शियम/मैग्नीशियम स्टीयरेट का अवक्षेप बना लेते हैं", "कठोर जल में ऑक्सीजन नहीं होती", "कठोर जल साबुन को भाप बना देता है", "कठोर जल का pH शून्य होता है"),
            listOf("Divalent Ca2+ and Mg2+ ions displace sodium ions to form insoluble, uncharged Calcium and Magnesium Stearate precipitates (Scum)", "Hard water lacks dissolved oxygen", "Hard water boils the soap", "Hard water has zero pH"),
            0,
            "कठोर जल में कैल्शियम और मैग्नीशियम क्लोराइड/सल्फेट होते हैं: 2 C17H35COONa + Ca2+ → (C17H35COO)2Ca ↓ (अघुलनशील स्कम) + 2 Na+। जब तक सारा Ca/Mg अवक्षेपित नहीं हो जाता, साबुन झाग नहीं दे पाता और व्यर्थ नष्ट हो जाता है।",
            "Divalent alkaline earth cations (Ca2+, Mg2+) cross-link two fatty acid carboxylate heads, eliminating net electrostatic charge and precipitating insoluble divalent metal soaps that adhere to fabrics.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q8", "sci_10",
            "संश्लेषित अपमार्जक (Synthetic Detergents / साबुन-रहित साबुन / Soapless Soaps) कठोर जल में भी आसानी से झाग क्यों दे देते हैं?",
            "Why do Synthetic Detergents (e.g., Sodium Alkylbenzene Sulfonates) clean effectively and lather readily even in hard water and acidic water?",
            listOf("डिटर्जेंट के कैल्शियम और मैग्नीशियम लवण (सल्फोनेट्स) जल में पूर्णतः घुलनशील होते हैं (Calcium/Magnesium sulfonates are water soluble)", "डिटर्जेंट में कोई रसायन नहीं होता", "डिटर्जेंट कठोर जल को नरम बना देते हैं", "डिटर्जेंट केवल झाग बनाते हैं"),
            listOf("The corresponding calcium and magnesium sulfonates (-SO3-) are highly soluble in water and do not precipitate as scum", "Detergents contain no active chemical ions", "Detergents permanently soften hard water", "Detergents only produce bubbles"),
            0,
            "सिंथेटिक डिटर्जेंट लंबी श्रृंखला वाले हाइड्रोकार्बन के 'सोडियम अल्काइल सल्फोनेट' (-SO3Na) या सल्फेट (-OSO3Na) लवण होते हैं। इनके कैल्शियम और मैग्नीशियम सल्फोनेट लवण पानी में घुलनशील होते हैं, इसलिए वे कठोर जल या ठंडे पानी में भी कोई मैल (Scum) नहीं बनाते और पूरा झाग देते हैं।",
            "Sulfonate and sulfate head groups (-SO3- and -OSO3-) possess higher charge delocalization and lower coordination affinity for divalent Ca2+/Mg2+ cations than carboxylates, remaining fully soluble in hard water.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q9", "sci_10",
            "घरेलू कपड़े धोने के वाशिंग पाउडर में सर्वाधिक इस्तेमाल होने वाला 'ऋणायनी अपमार्जक' (Anionic Detergent) कौन-सा है?",
            "Which major Anionic Detergent, synthesized from petroleum benzene and propylene tetramer/linear alkyl chains, is the principal cleaning surfactant in laundry detergent powders?",
            listOf("सोडियम लॉरिल सल्फेट / सोडियम डोडेसिलबेंजीन सल्फोनेट (Sodium Dodecylbenzene Sulfonate - LAS / SLS)", "सिटाइलट्राइमिथाइल अमोनियम ब्रोमाइड", "पॉलीएथिलीन ग्लाइकोल स्टीयरेट", "सोडियम क्लोराइड"),
            listOf("Sodium Linear Alkylbenzene Sulfonate (LABS / LAS) and Sodium Lauryl Sulfate (SLS / SDS)", "Cetyltrimethylammonium bromide (Cationic)", "Polyethylene glycol stearate (Non-ionic)", "Sodium chloride"),
            0,
            "LAS (लीनियर अल्काइल बेंजीन सल्फोनेट) और SLS (सोडियम लॉरिल सल्फेट) सबसे आम ऋणायनी अपमार्जक हैं। इनमें सफाई करने वाला बड़ा हिस्सा 'ऋणायन' (Anion) होता है। टूथपेस्ट और शैम्पू में झाग बनाने हेतु 'सोडियम लॉरिल सल्फेट' (SLS) मिलाया जाता है।",
            "Linear alkylbenzene sulfonate (LAS) is produced by alkylating benzene with linear alpha-olefins followed by sulfonation with SO3 gas and neutralization with NaOH; it provides superior detergency and foaming.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q10", "sci_10",
            "हेयर कंडीशनर (Hair Conditioners) और कीटाणुनाशक लोशन (Germicides) में प्रयुक्त होने वाला प्रसिद्ध 'धनायनी अपमार्जक' (Cationic Detergent) कौन-सा है?",
            "Which Cationic Detergent (quaternary ammonium salt possessing potent germicidal and anti-static conditioning properties) is formulated in Hair Conditioners and hospital disinfectants?",
            listOf("सिटाइलट्राइमिथाइल अमोनियम ब्रोमाइड (Cetyltrimethylammonium Bromide - CTAB)", "सोडियम लॉरिल सल्फेट", "सोडियम स्टीयरेट", "पॉलीसोर्बेट"),
            listOf("Cetyltrimethylammonium Bromide (CTAB / Cetrimide - Positively charged quaternary ammonium surfactant)", "Sodium Lauryl Sulfate", "Sodium Stearate", "Polysorbate 80"),
            0,
            "धनायनी अपमार्जक (Cationic Detergents) क्वाटरनरी अमोनियम लवण होते हैं जिनमें धनात्मक आवेशित लंबा नाइट्रोजन युक्त भाग होता है। ये बालों के ऋणात्मक आवेश को उदासीन करके बालों को रेशमी बनाते हैं (हेयर कंडीशनर) और बैक्टीरिया की कोशिका झिल्ली को नष्ट कर कीटाणुनाशक का काम करते हैं।",
            "Cationic surfactants electrostatically bind to negatively charged keratin surfaces of hair shafts, neutralizing static repulsion while disrupting phospholipid bilayers of pathogenic bacteria.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m2_q11", "sci_10",
            "बर्तन धोने वाले लिक्विड डिशवॉश (Liquid Dishwashing Liquids) में इस्तेमाल होने वाले 'अन-आयनिक अपमार्जक' (Non-Ionic Detergents) की क्या विशेषता होती है?",
            "Non-Ionic Detergents (such as polyoxyethylene alcohol ethers), widely formulated in domestic Liquid Dishwashers, are characterized by:",
            listOf("घोल में कोई आयन नहीं बनाना (No ions in solution, hydrophilic polyether groups with hydrogen bonding)", "केवल धनात्मक आयन बनाना", "केवल ऋणात्मक आयन बनाना", "पानी में न घुलना"),
            listOf("Generating zero ionic charges in aqueous solution; solubility arises from extensive hydrogen bonding between polyether oxygen atoms and water", "Forming only cations", "Forming only anions", "Completely insoluble in water"),
            0,
            "अन-आयनिक अपमार्जक (Non-ionic detergents) स्टीयरिक एसिड और पॉलीएथिलीन ग्लाइकोल के संघनन से बनते हैं: CH3(CH2)16COO(CH2CH2O)nCH2CH2OH। इनमें कोई धनायन या ऋणायन नहीं होता। ये कम झाग में भी बर्तनों से तेल और चिकनाई को तुरंत साफ कर देते हैं।",
            "Non-ionic surfactants exhibit high grease-emulsifying capacity at low temperatures and are unaffected by water hardness cations due to the absence of net electrical charge.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m2_q12", "sci_10",
            "वाशिंग पाउडर में कपड़ों को चमकीला सफेद दिखाने के लिए मिलाए जाने वाले 'ऑप्टिकल ब्राइटनर' (Optical Brighteners / Tinopal) किस सिद्धांत पर कार्य करते हैं?",
            "Fluorescent Whitening Agents / Optical Brightening Agents (OBAs) added to laundry detergents make clothes appear brilliantly white by absorbing invisible UV light and re-emitting it as:",
            listOf("दृश्यमान नीली रोशनी (Absorbing invisible UV radiation and re-emitting visible Blue fluorescent light)", "लाल रोशनी", "हरी रोशनी", "पीली रोशनी"),
            listOf("Visible Blue fluorescence (420-470 nm) that complements and cancels natural fabric yellowish tinge, enhancing perceptual whiteness", "Red light", "Green light", "Yellow light"),
            0,
            "कपड़े पुराने होने पर थोड़े पीले पड़ने लगते हैं। ऑप्टिकल ब्राइटनर (टिनोपोल) धूप की अदृश्य पराबैंगनी (UV) किरणों को सोखकर उन्हें 'नीली रोशनी' के रूप में उत्सर्जित करते हैं। यह नीली रोशनी कपड़े के पीलेपन को काट देती है जिससे कपड़ा आंखों को चमकदार सफेद दिखाई देता है।",
            "Optical brighteners (stilbene disulfonic acid derivatives) undergo Stokes fluorescence shift, converting ultraviolet photon energy into complementary blue emission that offsets the yellowing of aged cellulose fibers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q13", "sci_10",
            "अपमार्जकों में अत्यधिक शाखित हाइड्रोकार्बन श्रृंखला (Branched Hydrocarbon Chains) होने से पर्यावरण में कौन-सा गंभीर प्रदूषण उत्पन्न होता है?",
            "Why were early non-biodegradable synthetic detergents containing highly branched alkylbenzene chains (such as ABS) phased out globally?",
            listOf("जीवाणु उन्हें तोड़ नहीं पाते, जिससे नदियों और झीलों में पानी पर झाग की मोटी चादर (Foaming in rivers) जम जाती है", "वे पानी को आग लगा देते हैं", "वे पानी को जमा देते हैं", "वे बर्फ बना देते हैं"),
            listOf("Sewage bacteria cannot enzymatically degrade branched quaternary carbons, causing persistent toxic foams on rivers and water treatment plants", "They ignite rivers", "They freeze water bodies", "They turn rivers to ice"),
            0,
            "अत्यधिक शाखित हाइड्रोकार्बन वाले डिटर्जेंट 'गैर-जैव-निम्नीकरणीय' (Non-biodegradable) होते हैं। सीवेज बैक्टीरिया इन्हें पचा नहीं पाते, जिससे नदियों और नालों में झाग के विशाल पहाड़ बन जाते हैं (जैसे दिल्ली के यमुना घाट या बेंगलुरु के बेलांदुर झील पर)। इसलिए अब केवल सीधी श्रृंखला वाले (Linear - LAS) जैव-निम्नीकरणीय डिटर्जेंट का उपयोग होता है।",
            "Bacterial beta-oxidation enzymes require unhindered linear methylene chains; quaternary branched carbons stereochemically block microbial catabolism, causing severe persistent water pollution.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q14", "sci_10",
            "वाशिंग पाउडर में सफाई की क्षमता बढ़ाने और पानी की कठोरता को बांधने हेतु मिलाए जाने वाले 'फॉस्फेट बिल्डर्स' (STPP) से झीलों में कौन-सा जल प्रदूषण (Algal Bloom) होता है?",
            "The historic inclusion of Sodium Tripolyphosphate (STPP) builder salts in detergents led to excessive nutrient enrichment in lakes, triggering massive toxic algal blooms termed:",
            listOf("सुपोषण / यूट्रोफिकेशन (Eutrophication & Hypoxia in water bodies)", "अम्ल वर्षा", "ओजोन छिद्र", "बायोमैग्निफिकेशन"),
            listOf("Cultural Eutrophication (Dense cyanobacterial algal blooms that deplete dissolved oxygen, suffocating aquatic fish)", "Acid Rain", "Ozone Hole Depletion", "Biomagnification of heavy metals"),
            0,
            "डिटर्जेंट का फॉस्फेट (STPP) पानी में जाकर शैवालों (Algae) के लिए खाद का काम करता है, जिससे पूरी झील पर हरी काई (Algal bloom) की मोटी चादर छा जाती है (यूट्रोफिकेशन)। जब यह काई मरती है, तो बैक्टीरिया पानी की सारी ऑक्सीजन सोख लेते हैं जिससे मछलियां मर जाती हैं। अब फॉस्फेट की जगह 'जिओलाइट' (Zeolite) मिलाया जाता है।",
            "Phosphates are primary limiting nutrients in freshwater; excessive detergent runoff triggers hyper-eutrophication, oxygen depletion (biological oxygen demand surge), and aquatic ecosystem collapse.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m2_q15", "sci_10",
            "शेविंग क्रीम (Shaving Soap) में झाग को लंबे समय तक बनाए रखने और सूखने से रोकने हेतु कौन-सा अल्कोहल और रेजिन मिलाया जाता है?",
            "To prevent rapid drying and promote rich, long-lasting lather on the face, Shaving Creams and Shaving Soaps are specifically enriched with:",
            listOf("ग्लिसरॉल (Glycerol) एवं रोसिन गोंद (Rosin / Sodium Rosinate)", "मेथनॉल", "सल्फ्यूरिक एसिड", "सोडियम बाइकार्बोनेट"),
            listOf("Glycerol (Humectant preventing evaporation) and Rosin resin (Forms sodium rosinate to produce abundant durable lather)", "Methanol", "Sulfuric acid", "Sodium bicarbonate"),
            0,
            "शेविंग साबुन में 'पोटेशियम स्टीयरेट' के साथ 'ग्लिसरॉल' (नमी बनाए रखने हेतु) और 'रोसिन' (Rosin - चीड़ के पेड़ का गोंद) मिलाया जाता है। रोसिन सोडियम रोजिनेट बनाता है जो गाढ़ा और देर तक टिकने वाला झाग देता है।",
            "Shaving soap formulations incorporate stearic acid-rich potassium soaps supersaturated with free glycerol for skin moisturization and abietic acid-rich rosin for robust micellar foam stabilization.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 3: Plastics, Classification & Environmental Chemistry (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m3_q1", "sci_10",
            "थर्मोप्लास्टिक (Thermoplastics) और थर्मोसेटिंग प्लास्टिक (Thermosetting Plastics) में सबसे मूलभूत संरचनात्मक अंतर क्या है?",
            "What is the fundamental structural and thermal behavioral difference between Thermoplastic and Thermosetting polymers?",
            listOf("थर्मोप्लास्टिक गर्म करने पर बार-बार पिघलकर नए सांचे में ढल सकते हैं, जबकि थर्मोसेटिंग प्लास्टिक गर्म करने पर स्थायी रूप से क्रॉस-लिंक्ड होकर दोबारा नहीं पिघलते", "थर्मोप्लास्टिक कभी गर्म नहीं होते", "दोनों एक ही प्रकार के होते हैं", "थर्मोसेटिंग प्लास्टिक जल में घुलनशील हैं"),
            listOf("Thermoplastics possess linear/branched chains that soften reversibly on heating; Thermosetting plastics form permanent irreversible 3D covalent cross-links on heating", "Thermoplastics cannot be heated", "Both behave identically", "Thermosetting plastics dissolve in water"),
            0,
            "1. थर्मोप्लास्टिक (जैसे पॉलीथीन, PVC, नायलॉन, पॉलीस्टाइरीन): गर्म करने पर मुलायम और ठंडे पर कठोर होते हैं, इन्हें पुनर्चक्रित (Recycle) किया जा सकता है। 2. थर्मोसेटिंग (जैसे बेकेलाइट, मेलामाइन, एपॉक्सी रेजिन): गर्म करने पर क्रॉस-लिंक बनकर स्थायी कठोर हो जाते हैं और दोबारा पिघलते नहीं हैं।",
            "Thermoplastics consist of polymer chains held by secondary van der Waals or hydrogen bonds that dissociate upon heating; Thermosets undergo irreversible chemical curing via covalent cross-linking.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q2", "sci_10",
            "प्लास्टिक के पुनः चक्रण (Plastic Recycling) के अंतरराष्ट्रीय रीसाइक्लिंग कोड में 'कोड 1' (Resin Identification Code #1) किस लोकप्रिय प्लास्टिक को दर्शाता है?",
            "Under the international SPI Resin Identification Coding system (triangular chasing arrows symbol), 'Code 1' specifically identifies which recyclable plastic polymer?",
            listOf("पीईटी / पीईटीई - पॉलीएथिलीन टेरेफ्थैलेट (PET / PETE - Mineral water & soft drink bottles)", "एचडीपीई (HDPE - Code 2)", "पीवीसी (PVC - Code 3)", "पीपी (PP - Code 5)"),
            listOf("PET / PETE (Polyethylene Terephthalate - Resin Code 1 for beverage bottles and food containers)", "HDPE (High-Density Polyethylene - Code 2)", "PVC (Code 3)", "PP (Polypropylene - Code 5)"),
            0,
            "प्लास्टिक रीसाइक्लिंग कोड 1 से 7: 1 = PET (पानी/कोल्ड ड्रिंक की बोतलें), 2 = HDPE (दूध की बोतलें/शैम्पू), 3 = PVC (पाइप/तार), 4 = LDPE (सब्जी की थैलियां), 5 = PP (दवा की बोतलें/टिफिन), 6 = PS (थर्माकोल), 7 = Other (पॉलीकार्बोनेट/मिश्रित)।",
            "The SPI resin coding system standardizes post-consumer sorting: Code 1 designates PET (Polyethylene terephthalate) possessing high barrier properties and high mechanical recyclability into rPET fibers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q3", "sci_10",
            "दूध के प्लास्टिक पाउच, किराने की पतली थैलियां (Shopping Bags) और स्क्वीज बोतलें किस लचीले बहुलक से बनाई जाती हैं?",
            "Thin plastic shopping carry bags, squeeze condiment bottles, and milk packaging pouches are manufactured from highly branched, flexible:",
            listOf("एलडीपीई - निम्न घनत्व पॉलीएथिलीन (Low-Density Polyethylene - LDPE / Code 4)", "एचडीपीई", "बेकेलाइट", "टेफ्लॉन"),
            listOf("Low-Density Polyethylene (LDPE - Synthesized under extreme high pressure 1000-2000 atm with high chain branching)", "High-Density Polyethylene", "Bakelite", "Teflon"),
            0,
            "LDPE (निम्न घनत्व पॉलीथीन) अत्यधिक शाखित संरचना के कारण बहुत लचीला, कम घनत्व और पारदर्शी होता है। इसे 1000-2000 वायुमंडलीय दबाव पर बनाया जाता है। HDPE (उच्च घनत्व) सीधी श्रृंखला होने के कारण कठोर होता है (बाल्टियां/ड्रम बनाने हेतु)।",
            "Free-radical high-pressure polymerization of ethylene yields LDPE featuring extensive short- and long-chain branching that inhibits crystalline packing, giving density 0.910-0.940 g/cm³.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q4", "sci_10",
            "प्लास्टिक की मजबूत बाल्टियां, पानी के ड्रम, खिलौने और पाइप बनाने में प्रयुक्त 'एचडीपीई' (HDPE - Code 2) के निर्माण हेतु 1963 के नोबेल विजेता 'जिग्लर-नाटा उत्प्रेरक' (Ziegler-Natta Catalyst) का क्या संयोजन है?",
            "High-Density Polyethylene (HDPE) is synthesized at low pressure using the famous Nobel Prize-winning Ziegler-Natta Catalyst, which consists of:",
            listOf("ट्राईएथिल एल्यूमीनियम एवं टाइटेनियम टेट्राक्लोराइड (Triethylaluminum + Titanium Tetrachloride - Al(C2H5)3 + TiCl4)", "आयरन और मोलिब्डेनम", "निकल और पैलेडियम", "प्लेटिनम और कार्बन"),
            listOf("TiCl4 + (C2H5)3Al (Coordination catalyst synthesizing linear unbranched stereoregular polyolefins at low temperatures and pressures)", "Iron + Molybdenum (Haber process)", "Nickel + Palladium", "Platinum on carbon"),
            0,
            "कार्ल जिग्लर और गिउलिओ नाटा ने TiCl4 और Al(C2H5)3 का समन्वय उत्प्रेरक बनाया जिससे सामान्य दबाव (1-6 atm) पर बिना शाखा वाली सीधी श्रृंखला वाली कठोर और मजबूत 'HDPE' पॉलीथीन बनी। इस खोज पर 1963 का नोबेल पुरस्कार मिला।",
            "Ziegler-Natta coordination polymerization proceeds via active organometallic titanium centers on crystalline TiCl3/TiCl4 surfaces, inserting ethylene monomers into Ti-C bonds to yield linear unbranched HDPE.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m3_q5", "sci_10",
            "माइक्रोवेव में भोजन गर्म करने वाले सुरक्षित प्लास्टिक के डिब्बे (Microwave-Safe Plastic Tiffin & Containers) किस उच्च गलनांक वाले प्लास्टिक से बनाए जाते हैं?",
            "Reusable microwave-safe food containers, hot-fill syrup bottles, and car battery casings are industrially molded from which high-melting-point (160°C) plastic (Code 5)?",
            listOf("पॉलीप्रोपाइलीन (Polypropylene - PP / Code 5)", "पॉलीस्टाइरीन", "पीवीसी", "एलडीपीई"),
            listOf("Polypropylene (PP - Propene polymer with high heat distortion resistance, melting at ~160-165°C)", "Polystyrene", "PVC", "LDPE"),
            0,
            "पॉलीप्रोपाइलीन (PP - कोड 5) प्रोपीन (CH3-CH=CH2) का बहुलक है। इसका गलनांक 160°C से अधिक होता है, इसलिए यह माइक्रोवेव की गर्मी में पिघलता या हानिकारक रसायन नहीं छोड़ता। कार के बंपर और सिरिंज भी इसी से बनते हैं।",
            "Isotactic polypropylene synthesized via Ziegler-Natta catalysis features methyl groups aligned along one side of the polymer backbone, conferring high crystallinity, thermal stiffness, and fatigue resistance.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q6", "sci_10",
            "प्लास्टिक की पानी की बोतलों और बच्चों के दूध के डिब्बों में पाए जाने वाले किस विषैले रासायनिक यौगिक (BPA) पर भारत और वैश्विक स्तर पर प्रतिबंध लगाया गया है?",
            "Which endocrine-disrupting industrial chemical, historically used to manufacture polycarbonate plastics and epoxy can linings, mimics estrogen and is banned in baby feeding bottles?",
            listOf("बिस्फेनॉल-ए (Bisphenol-A / BPA - BPA-Free Plastics)", "बेंजीन", "क्लोरोफॉर्म", "एसीटोन"),
            listOf("Bisphenol-A (BPA - 4,4'-(propane-2,2-diyl)diphenol, a xenoestrogen linked to reproductive and metabolic toxicity)", "Benzene", "Chloroform", "Acetone"),
            0,
            "बिस्फेनॉल-ए (BPA) पॉलीकार्बोनेट प्लास्टिक और फूड कैन की आंतरिक कोटिंग में इस्तेमाल होता था। यह भोजन में रिसकर एस्ट्रोजन हार्मोन की नकल करता है जिससे बच्चों में हार्मोनल असंतुलन, मोटापा और बांझपन हो सकता है। अब 'BPA-मुक्त' (BPA-Free) उत्पाद अनिवार्य हैं।",
            "BPA leaches from polycarbonate via ester bond hydrolysis under heat/alkalinity; its phenolic rings bind estrogen receptors ER-alpha and ER-beta, disrupting endocrine homeostatic signaling cascades.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q7", "sci_10",
            "मक्के के स्टार्च या गन्ने के शीरे से किण्वन द्वारा बनाया जाने वाला सबसे लोकप्रिय 100% जैव-निम्नीकरणीय बायोप्लास्टिक (Biodegradable Bioplastic) कौन-सा है?",
            "Which compostable, plant-derived bioplastic polymer is commercially synthesized from fermented corn starch via bacterial conversion to Lactic Acid?",
            listOf("पीएलए - पॉलीलैक्टिक एसिड (Polylactic Acid - PLA)", "पीवीसी", "नायलॉन-6,6", "पॉलीथीन"),
            listOf("Polylactic Acid (PLA - Thermoplastic aliphatic polyester derived from renewable plant sugars fermented into lactic acid)", "PVC", "Nylon-6,6", "Polyethylene"),
            0,
            "PLA (पॉलीलैक्टिक एसिड) मक्के या गन्ने के स्टार्च से बैक्टीरिया द्वारा लैक्टिक एसिड बनाकर उसका बहुलकीकरण करके तैयार किया जाता है। औद्योगिक कम्पोस्टिंग में यह 6 महीने में पानी और कार्बन डाइऑक्साइड में विघटित हो जाता है। 3D प्रिंटिंग में भी PLA सबसे अधिक उपयोग होता है।",
            "Lactobacillus ferments glucose into L-lactic acid, dimerized into cyclic lactide and ring-opening polymerized using stannous octoate catalyst into high-molecular-weight biodegradable PLA.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q8", "sci_10",
            "पर्यावरण और समुद्री पारिस्थितिकी तंत्र के लिए अत्यंत घातक 'माइक्रोप्लास्टिक्स' (Microplastics) का वैज्ञानिक आकार क्या निर्धारित किया गया है?",
            "In environmental marine chemistry, synthetic polymer debris particles are officially categorized as 'Microplastics' if their diameter size is less than:",
            listOf("5 मिलीमीटर से कम (Plastic particles less than 5 mm in diameter)", "50 सेंटीमीटर", "1 मीटर", "10 सेंटीमीटर"),
            listOf("Less than 5.0 millimeters (< 5 mm, down to 1 micrometer; < 1 micron is nanoplastics)", "Less than 50 cm", "Less than 1 meter", "Less than 10 cm"),
            0,
            "माइक्रोप्लास्टिक्स 5 मिमी से छोटे प्लास्टिक कण होते हैं। 1. प्राथमिक: फेसवाश और टूथपेस्ट के माइक्रोबीड्स। 2. द्वितीयक: बड़ी बोतलों और प्लास्टिक कचरे के धूप व लहरों से टूटकर बने टुकड़े। ये समुद्री मछलियों के पेट से होते हुए मानव रक्त, फेफड़ों और प्लेसेंटा तक पहुंच रहे हैं।",
            "NOAA and UNEP define microplastics as synthetic solid polymeric particles between 1 micron and 5 mm that resist biodegradation, bioaccumulate in trophic food webs, and adsorb persistent organic pollutants (POPs).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q9", "sci_10",
            "भारत सरकार ने 1 जुलाई 2022 से किस श्रेणी के प्लास्टिक उत्पादों के निर्माण, आयात, भंडारण, वितरण और बिक्री पर पूर्ण देशव्यापी प्रतिबंध (Nationwide Ban) लगाया है?",
            "From July 1, 2022, the Ministry of Environment, Forest and Climate Change (MoEFCC) enforced a nationwide ban in India on identified Single-Use Plastic (SUP) items having:",
            listOf("एकल-उपयोग प्लास्टिक वस्तुएं (Single-Use Plastics - SUPs with low utility and high littering potential like plastic straws, cutlery, flags)", "सभी प्रकार की पानी की पाइपें", "अस्पताल की दवा की बोतलें", "बिजली के तार"),
            listOf("Single-Use Plastic (SUP) items (Earbud sticks, candy sticks, ice-cream sticks, thermocol decoration, plastic plates, cups, glasses, cutlery, straws, and wrapping films <100 microns)", "All PVC drainage pipes", "Pharmaceutical syrup bottles", "Electrical cable insulation"),
            0,
            "1 जुलाई 2022 से भारत में 19 एकल-उपयोग प्लास्टिक (SUP) वस्तुओं पर प्रतिबंध लगाया गया है जिनमें प्लास्टिक की तीलियां, थर्माकोल सजावट, प्लास्टिक की प्लेट, कप, गिलास, कांटे, चम्मच, स्ट्रॉ, ट्रे और मिठाई के डिब्बों की पन्नियां शामिल हैं। साथ ही कैरी बैग की न्यूनतम मोटाई 120 माइक्रोन अनिवार्य की गई है।",
            "Plastic Waste Management Amendment Rules, 2021 notified a total ban on the manufacture, import, stocking, distribution, sale, and use of identified single-use plastics having low utility and high littering potential.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q10", "sci_10",
            "प्लास्टिक कचरे को ऑक्सीजन की अनुपस्थिति में उच्च तापमान (400-800°C) पर गर्म करके सिंथेटिक कच्चे तेल और ईंधन में बदलने की थर्मो-केमिकल प्रक्रिया क्या कहलाती है?",
            "The advanced thermochemical recycling process that depolymerizes waste mixed plastics in the complete absence of Oxygen at 400-800°C into synthetic crude oil and gaseous fuel is termed:",
            listOf("पायरोलिसिस / ताप-अपघटन (Pyrolysis / Plastic-to-Fuel Depolymerization)", "दहन (Incineration)", "किण्वन", "पाश्चुरीकरण"),
            listOf("Pyrolysis (Thermal cracking of long-chain polymer backbones into short-chain aliphatic hydrocarbons, synthetic diesel, and syngas)", "Incineration (Open combustion with O2 generating toxic dioxins)", "Fermentation", "Pasteurization"),
            0,
            "पायरोलिसिस (Pyrolysis) में बिना ऑक्सीजन के प्लास्टिक को गर्म करके उसकी लंबी कार्बन श्रृंखलाओं को तोड़ दिया जाता है। इससे 1 टन प्लास्टिक कचरे से लगभग 700-800 लीटर सिंथेटिक डीजल/फ्यूल ऑयल बनता है जिसका उपयोग औद्योगिक बॉयलरों और वाहनों में किया जा सकता है।",
            "Pyrolysis breaks covalent C-C bonds in polyolefins via free-radical homolytic cleavage, yielding a condensable pyrolytic oil fraction containing paraffins, olefins, and aromatics suitable for refinery co-processing.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q11", "sci_10",
            "कठोर पीवीसी (Rigid PVC) को नरम, लचीला और मोड़ने योग्य (जैसे कृत्रिम चमड़ा/रेक्सीन) बनाने के लिए उसमें कौन-से कार्बनिक यौगिक मिलाए जाते हैं?",
            "Which organic chemical additives (Plasticizers) are blended with rigid PVC polymer chains to reduce intermolecular forces and impart high flexibility for artificial leather (Rexine)?",
            listOf("थैलेट्स / थैलेट एस्टर (Phthalates - Diisononyl Phthalate / DEHP)", "कैल्शियम कार्बोनेट", "सोडियम हाइड्रोक्साइड", "सल्फ्यूरिक एसिड"),
            listOf("Phthalates (Dialkyl esters of 1,2-benzenedicarboxylic acid such as DEHP, DINP, DBP)", "Calcium carbonate", "Sodium hydroxide", "Sulfuric acid"),
            0,
            "थैलेट्स (Phthalates) प्लास्टिक के बहुलक तारों के बीच घुसकर उन्हें एक-दूसरे पर फिसलने देते हैं जिससे कठोर प्लास्टिक लचीला बन जाता है। हालांकि, थैलेट्स धीरे-धीरे बाहर रिसते हैं और अंतःस्रावी तंत्र (हार्मोन) को नुकसान पहुंचाते हैं।",
            "Phthalate ester molecules intersperse between PVC chains, shielding dipolar C-Cl interactions and lowering the glass transition temperature (Tg) from 80°C down to below ambient room temperature.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m3_q12", "sci_10",
            "पॉलीयूरेथेन (Polyurethane - PU) फोम का उपयोग गद्दों, सोफों और कार की सीटों में कुशनिंग हेतु होता है, यह किन दो यौगिकों के बीच अभिक्रिया से बनता है?",
            "Flexible Polyurethane (PU) foams used in mattresses, seating cushions, and sneaker soles are synthesized by the addition reaction between Polyols (Diols) and:",
            listOf("डाई-आइसोसाइनेट्स (Diisocyanates - Toluene Diisocyanate / TDI / MDI)", "कार्बोक्जिलिक एसिड", "एल्डीहाइड", "अमोनिया"),
            listOf("Diisocyanates (Toluene Diisocyanate - TDI or Methylene diphenyl diisocyanate - MDI forming urethane linkages -NH-COO-)", "Carboxylic acids", "Aldehydes", "Ammonia"),
            0,
            "पॉलीयूरेथेन डाई-आइसोसाइनेट (जैसे TDI/MDI) और पॉलीऑल (पॉलीईथर/पॉलिएस्टर डायोल) की अभिक्रिया से बनता है। अभिक्रिया के दौरान थोड़ा पानी मिलाने से CO2 गैस निकलती है जो झाग (Foam) बनाती है और गद्देदार संरचना देती है।",
            "Urethane bonds are generated by exothermic polyaddition of isocyanate (-N=C=O) groups with polyol hydroxyl (-OH) groups; reaction with water generates amine and CO2 blowing agent.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m3_q13", "sci_10",
            "इलेक्ट्रॉनिक चिप्स, सर्किट बोर्डों (PCBs) और सुपरग्लू / चिपकने वाले पदार्थों में प्रयुक्त होने वाला 'एपॉक्सी रेजिन' (Epoxy Resin) किस श्रेणी का बहुलक है?",
            "High-strength industrial structural adhesives, aerospace composites, and printed circuit board (PCB) encapsulants are formulated from which thermosetting polymer class?",
            listOf("एपॉक्सी रेजिन - थर्मोसेटिंग बहुलक (Epoxy Resin / Polyepoxide - Bisphenol-A & Epichlorohydrin)", "थर्मोप्लास्टिक", "प्राकृतिक रबर", "सेल्युलोज"),
            listOf("Epoxy Resin (Thermosetting polyepoxide polymer cross-linked with amine hardeners/curing agents)", "Thermoplastic", "Natural rubber", "Cellulose"),
            0,
            "एपॉक्सी रेजिन (Araldite) बिस्फेनॉल-A और एपिक्लोरोहाइड्रिन से बनता है। जब इसमें 'हार्डनर' (पॉलीएमीन) मिलाया जाता है, तो यह अत्यधिक मजबूत 3D नेटवर्क में जम जाता है जो धातुओं, कांच और लकड़ी को बहुत मजबूती से चिपका देता है।",
            "Epoxy pre-polymers terminate in reactive oxirane epoxide three-membered rings; reaction with polyamines triggers ring-opening nucleophilic cross-linking without releasing volatile reaction by-products.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m3_q14", "sci_10",
            "प्लास्टिक के जलने (Incineration of Chlorinated Plastics like PVC) से निकलने वाली कौन-सी अत्यधिक विषैली कैंसरकारी गैसें वायुमंडल को प्रदूषित करती हैं?",
            "Uncontrolled low-temperature combustion of chlorinated plastics (PVC) releases which persistent bioaccumulative environmental toxins and carcinogens?",
            listOf("डाइऑक्सिन एवं फ्यूरान (Dioxins - PCDDs and Furans - PCDFs along with toxic HCl gas)", "शुद्ध ऑक्सीजन", "नाइट्रोजन केवल", "हीलियम"),
            listOf("Polychlorinated Dibenzo-p-Dioxins (PCDDs) and Polychlorinated Dibenzofurans (PCDFs) along with corrosive Hydrogen Chloride", "Pure oxygen", "Pure nitrogen", "Helium gas"),
            0,
            "PVC या क्लोरीन युक्त प्लास्टिक को खुले में जलाने पर भयंकर विषैली 'डाइऑक्सिन' (Dioxin) और 'फ्यूरान' गैसें निकलती हैं। ये हवा में घुलकर मिट्टी और घास पर जमती हैं और जानवरों के दूध/मांस के जरिए मानव शरीर में पहुंचकर कैंसर और जन्मजात विकृतियां पैदा करती हैं।",
            "Incomplete combustion of organohalogen polymers at 200-400°C in the presence of trace copper catalysts generates 2,3,7,8-TCDD dioxins which activate AhR nuclear receptors to induce mutagenesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m3_q15", "sci_10",
            "प्लास्टिक कचरे (Bitumen Plastic Blend) का उपयोग करके मजबूत, टिकाऊ और गड्ढा-मुक्त डामर की सड़कें बनाने की अभिनव तकनीक विकसित करने वाले 'भारत के प्लास्टिक मैन' कौन कहलाते हैं?",
            "Who is celebrated as the 'Plastic Man of India' for pioneering the patented technology of mixing shredded waste plastics with hot Bitumen to construct highly durable plastic asphalt roads?",
            listOf("प्रोफेसर आर. वासुदेवन (Prof. Rajagopalan Vasudevan - Thiagarajar College of Engineering, Madurai)", "डॉ. ए.पी.जे. अब्दुल कलाम", "सी.वी. रमन", "एम.एस. स्वामीनाथन"),
            listOf("Prof. Rajagopalan Vasudevan (Padma Shri awardee, developed dry process blending 6-8% shredded waste plastic films into aggregate-bitumen roads)", "Dr. A.P.J. Abdul Kalam", "Sir C.V. Raman", "Dr. M.S. Swaminathan"),
            0,
            "पद्मश्री डॉ. आर. वासुदेवन (मदुरै) ने खोजा कि 170°C पर गर्म पत्थरों पर प्लास्टिक कचरा (थैलियां, चिप्स पैकेट) डालने पर वह पिघलकर पत्थरों पर चिपक जाता है और डामर (Bitumen) के साथ मिलकर सड़कों को वाटरप्रूफ बना देता है। भारत में 1 लाख किमी से अधिक ऐसी सड़कें बन चुकी हैं।",
            "Prof. R. Vasudevan's technology utilizes shredded waste polyethylene/polypropylene (1-4 mm) coated uniformly over hot stone aggregates at 165°C, improving road binding, Marshall stability, and pothole resistance.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 4: Rubber, Vulcanization & Elastomers (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m4_q1", "sci_10",
            "प्राकृतिक रबर (Natural Rubber) रबर के पेड़ (Hevea brasiliensis) के दूधिया रस (Latex) से प्राप्त होता है, यह रासायनिक रूप से किसका बहुलक है?",
            "Natural Rubber, harvested as an aqueous colloidal latex from the Hevea brasiliensis tree, is chemically classified as a linear addition polymer of:",
            listOf("सिस-1,4-पॉलीआइसोप्रीन (cis-1,4-polyisoprene - 2-methyl-1,3-butadiene)", "ट्रांस-पॉलीआइसोप्रीन (गट्टा-पर्चा)", "क्लोरोप्रीन", "स्टाइरीन"),
            listOf("cis-1,4-Polyisoprene (Isoprene monomer: CH2=C(CH3)-CH=CH2 in cis-stereochemical geometry)", "trans-1,4-Polyisoprene (Gutta-Percha / Balata)", "Chloroprene", "Styrene"),
            0,
            "प्राकृतिक रबर 'आइसोप्रीन' (2-मिथाइल-1,3-ब्यूटाइलडीन) का 'सिस-1,4' बहुलक है। सिस-विन्यास के कारण इसकी आणविक श्रृंखलाएं मुड़ी हुई (Coiled) स्प्रिंग जैसी होती हैं, जिससे इसमें खींचने पर फैलने और छोड़ने पर वापस आने का लचीलापन (Elastomer) होता है।",
            "Natural rubber consists of over 99.9% cis-1,4-polyisoprene polymer chains where all methyl and hydrogen substituents lie on the same side of double bonds, preventing crystallization at ambient temperature.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q2", "sci_10",
            "प्राकृतिक रबर के चिपचिपेपन, कमजोरी और अत्यधिक तापमान संवेदनशीलता को दूर करने हेतु 'सल्फर' (गंधक) के साथ गर्म करने की प्रक्रिया 'वल्कनीकरण' (Vulcanization) की खोज 1839 में किसने की थी?",
            "Who accidentally discovered the revolutionary process of Rubber Vulcanization in 1839 by heating raw natural rubber with elemental Sulfur over a hot stove?",
            listOf("चार्ल्स गुडइयर (Charles Goodyear)", "जॉन डनलप", "थॉमस हैनकॉक", "रॉबर्ट थॉमसन"),
            listOf("Charles Goodyear (American inventor who patented sulfur cross-linking vulcanization)", "John Boyd Dunlop (Pneumatic tire)", "Thomas Hancock", "Robert Thomson"),
            0,
            "1839 में चार्ल्स गुडइयर ने रबर में 3% से 5% गंधक (Sulfur) मिलाकर 140°C पर गर्म किया। सल्फर ने रबर की समानांतर श्रृंखलाओं के बीच 'डाईसल्फाइड पुल' (-S-S- Cross-links) बना दिए जिससे रबर कठोर, मजबूत, जलरोधी और तापमान-स्थिर बन गया।",
            "Charles Goodyear's vulcanization introduces polysulfide covalent cross-link bridges between polyisoprene double bonds, anchoring polymer chains to prevent irreversible plastic slip under stress.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q3", "sci_10",
            "वाहन के टायरों (Automobile Tires) के निर्माण में कठोर और घर्षण-रोधी रबर बनाने के लिए वल्कनीकरण में कितने प्रतिशत सल्फर और कौन-सा काला वर्णक मिलाया जाता है?",
            "In commercial tire manufacturing, raw rubber is vulcanized with approximately 3-5% Sulfur and compounded with 30% of which reinforcement filler to enhance tensile strength and wear resistance?",
            listOf("कार्बन ब्लैक (Carbon Black filler - C) एवं 3-5% सल्फर", "सफेद चाक", "सिलिका केवल", "रेत"),
            listOf("Carbon Black (Nanoparticle carbon black reinforcing matrix) with 3-5% Sulfur cross-links", "White chalk", "Pure silica only", "River sand"),
            0,
            "टायर बनाने वाले रबर में 3-5% सल्फर के साथ 30% 'कार्बन ब्लैक' (Carbon Black) पाउडर मिलाया जाता है। कार्बन ब्लैक रबर की मजबूती को 10 गुना बढ़ा देता है, घर्षण गर्मी को बाहर निकालता है और पराबैंगनी किरणों (UV) से टायर को फटने से बचाता है।",
            "Carbon black nanoparticles form physical-chemical networks with rubber macromolecules, dispersing mechanical shear stress, improving abrasion resistance, and shielding polymer chains from UV photo-oxidation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q4", "sci_10",
            "रबर के पेड़ के समान प्राकृतिक रूप से प्राप्त होने वाला 'गट्टा-पर्चा' (Gutta-Percha - दांतों की रूट कैनाल RCT में प्रयुक्त) रबर का कौन-सा ज्यामितीय समावयवी (Stereoisomer) है?",
            "Gutta-Percha (harvested from Palaquium gutta trees and utilized as an inert root-canal dental filling material) is the stereochemical:",
            listOf("ट्रांस-1,4-पॉलीआइसोप्रीन (trans-1,4-polyisoprene - Rigid, crystalline & non-elastic)", "सिस-1,4-पॉलीआइसोप्रीन", "पॉलीब्यूटाइलडीन", "पॉलीस्टाइरीन"),
            listOf("trans-1,4-Polyisoprene (All-trans stereochemistry allows dense crystalline chain packing, making it hard and inelastic at room temperature)", "cis-1,4-Polyisoprene (Elastic natural rubber)", "Polybutadiene", "Polystyrene"),
            0,
            "गट्टा-पर्चा प्राकृतिक रबर का 'ट्रांस-समावयवी' (Trans-isomer) है। ट्रांस विन्यास होने से इसकी श्रृंखलाएं सीधी होकर एक-दूसरे पर सघन बैठ जाती हैं (क्रिस्टलीय रूप), जिससे यह रबर की तरह खिंचता नहीं बल्कि कठोर, जलरोधी और विद्युत-कुचालक होता है। RCT और पनडुब्बी के तारों में इसका उपयोग होता है।",
            "Trans-1,4-polyisoprene forms an extended zigzag linear configuration that readily crystallizes into rigid spherulites, exhibiting high melting point (~65°C) and complete lack of ambient elasticity.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m4_q5", "sci_10",
            "मोटर वाहनों के टायरों के निर्माण में सर्वाधिक प्रयुक्त होने वाला सबसे बड़ा सिंथेटिक रबर 'ब्यूना-एस' (Buna-S / SBR) किन दो मोनोमर्स का सह-बहुलक (Copolymer) है?",
            "Styrene-Butadiene Rubber (SBR / Buna-S), the most widely consumed synthetic elastomer for automobile tread tires, is a copolymer of 1,3-Butadiene and:",
            listOf("स्टाइरीन (Styrene - 75% Butadiene + 25% Styrene with Sodium catalyst)", "एक्रिलोनाइट्राइल", "आइसोप्रीन", "एथिलीन"),
            listOf("Styrene (C6H5-CH=CH2 - Synthesized by emulsion copolymerization of 1,3-butadiene and styrene in 3:1 ratio)", "Acrylonitrile (Buna-N)", "Isoprene", "Ethylene"),
            0,
            "ब्यूना-एस (Buna-S): Bu = Butadiene, Na = Sodium (उत्प्रेरक), S = Styrene। इसमें 75% 1,3-ब्यूटाइलडीन और 25% स्टाइरीन होता है। यह प्राकृतिक रबर से अधिक घर्षण-रोधी और सस्ता होता है, इसलिए कारों के टायरों के ट्रेड बनाने में प्रयुक्त होता है।",
            "SBR is an elastomeric random copolymer synthesized via free-radical emulsion polymerization at 5°C ('cold rubber'), exhibiting high abrasion resistance and excellent braking grip.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q6", "sci_10",
            "तेल की पाइपलाइनों (Oil Hoses), ऑटोमोबाइल गैसकेट और ईंधन की टंकियों की सील बनाने में किस तेल-प्रतिरोधी सिंथेटिक रबर 'ब्यूना-एन' (Buna-N / Nitrile Rubber) का उपयोग होता है?",
            "Nitrile Rubber (Buna-N / NBR), famed for its exceptional resistance to petroleum oils, solvents, and fuels (used for fuel hoses and medical nitrile gloves), is a copolymer of 1,3-Butadiene and:",
            listOf("ऐक्रिलोनाइट्राइल (Acrylonitrile - CH2=CH-CN)", "स्टाइरीन", "विनाइल क्लोराइड", "मेलामाइन"),
            listOf("Acrylonitrile (Vinyl cyanide - CH2=CH-CN providing polar nitrile groups resistant to non-polar hydrocarbons)", "Styrene", "Vinyl chloride", "Melamine"),
            0,
            "ब्यूना-एन (Buna-N / NBR) 1,3-ब्यूटाइलडीन और ऐक्रिलोनाइट्राइल का सह-बहुलक है। ऐक्रिलोनाइट्राइल के ध्रुवीय साइनाइड (-CN) समूह पेट्रोल और तेलों को रबर में घुलने नहीं देते। इसलिए तेल की टंकियों की सील, गैसोलीन पाइप और मेडिकल नाइट्राइल दस्ताने इसी से बनाए जाते हैं।",
            "The polar cyano (-C≡N) substituents in Buna-N repel non-polar aliphatic and aromatic hydrocarbon fuels, rendering NBR insoluble and swell-resistant in petroleum lubricants and hydraulic fluids.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q7", "sci_10",
            "पहला व्यावसायिक कृत्रिम रबर 'नियोप्रीन' (Neoprene / डुओप्रीन - डाइविंग सूट व कन्वेयर बेल्ट में प्रयुक्त) किसका बहुलक है?",
            "Neoprene (Duprene), the flame-resistant synthetic rubber developed by DuPont in 1931 for wetsuits and chemical-resistant industrial hoses, is polymerized from:",
            listOf("क्लोरोप्रीन / 2-क्लोरो-1,3-ब्यूटाइलडीन (Chloroprene - CH2=C(Cl)-CH=CH2)", "आइसोप्रीन", "विनाइल क्लोराइड", "टेट्राफ्लुओरोएथिलीन"),
            listOf("Chloroprene (2-chloro-1,3-butadiene - Synthesized by dimerization of acetylene followed by HCl addition)", "Isoprene", "Vinyl chloride", "Tetrafluoroethylene"),
            0,
            "नियोप्रीन (Neoprene) क्लोरोप्रीन का बहुलक है। क्लोरीन परमाणु की उपस्थिति के कारण यह आग नहीं पकड़ता (अग्निरोधी), तेल और ओजोन गैस के प्रति अत्यधिक प्रतिरोधी होता है। गहरे समुद्र में गोताखोरों के 'वेटसूट' (Wetsuits) इसी से बनाए जाते हैं।",
            "Polymerization of 2-chlorobutadiene yields polychloroprene (Neoprene); the electronegative chlorine allylic substituent deactivates the conjugated diene, conferring ozone, flame, and weather resistance.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q8", "sci_10",
            "रबर में लगभग 30% से 40% सल्फर मिलाकर अत्यधिक कठोर, गैर-लचीला और काला विद्युत-कुचालक पदार्थ क्या बनाया जाता है जिसका उपयोग कंघी और बैटरी बक्से बनाने में होता था?",
            "When raw rubber is heavily vulcanized with an extreme sulfur content of 30% to 40%, it transforms into a rock-hard, non-elastic rigid thermoset compound known as:",
            listOf("एबोनाइट / वल्केनाइट (Ebonite / Vulcanite / Hard Rubber)", "गट्टा-पर्चा", "बेकेलाइट", "टेफ्लॉन"),
            listOf("Ebonite (Hard Rubber / Vulcanite - Highly cross-linked, rigid, glossy black dielectric insulator)", "Gutta-percha", "Bakelite", "Teflon"),
            0,
            "एबोनाइट (Ebonite) रबर का अत्यधिक वल्कनीकृत रूप है जिसमें 30-40% सल्फर होता है। इसमें इतनी अधिक क्रॉस-लिंकिंग हो जाती है कि इसका सारा लचीलापन खत्म हो जाता है और यह पत्थर जैसा कठोर हो जाता है। इसका उपयोग फाउंटेन पेन की बॉडी, कंघी और कार बैटरी के बक्से बनाने में होता था।",
            "Ebonite represents the saturation limit of rubber vulcanization where almost every remaining double bond is cross-linked with sulfur polysulfide bridges, yielding a dense, rigid thermoset with dielectric strength ~30 kV/mm.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q9", "sci_10",
            "चिकित्सा उपकरणों, कृत्रिम प्रत्यारोपण (Implants), पेसमेकर सील और बच्चों के चूसने वाले निप्पल (Teats) में इस्तेमाल होने वाले 'सिलिकॉन रबर' (Silicone Rubber) की मुख्य रीढ़ (Backbone) किन परमाणुओं से बनी होती है?",
            "Biocompatible Silicone Rubbers, renowned for extreme thermal stability (-60°C to +250°C) and chemical inertness in medical implants, possess a polymer backbone consisting of alternating:",
            listOf("सिलिकॉन एवं ऑक्सीजन परमाणु (-Si-O-Si-O- Siloxane bonds with methyl side groups)", "कार्बन और नाइट्रोजन", "सल्फर और कार्बन", "फास्फोरस और नाइट्रोजन"),
            listOf("Silicon and Oxygen atoms (Siloxane chain -Si-O-Si- substituted with organic methyl groups: Polydimethylsiloxane / PDMS)", "Carbon and Nitrogen", "Sulfur and Carbon", "Phosphorus and Nitrogen"),
            0,
            "सिलिकॉन रबर एक अकार्बनिक बहुलक (Inorganic polymer) है। इसकी रीढ़ में कार्बन नहीं बल्कि 'सिलोक्सेन' बंध (-Si-O-Si-) होते हैं। सिलिकॉन-ऑक्सीजन बंध अत्यधिक मजबूत होने से यह 250°C तक नहीं पिघलता, मानव शरीर में कोई एलर्जी या प्रतिक्रिया नहीं करता (जैव-संगत / Biocompatible)।",
            "Polydimethylsiloxane (PDMS) elastomer possesses high Si-O bond dissociation energy (452 kJ/mol) and wide Si-O-Si bond angles (143°), conferring extreme rotational flexibility, thermal resistance, and gas permeability.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q10", "sci_10",
            "प्राकृतिक रबर के ताजे लेटेक्स (Latex) को तरल अवस्था में सुरक्षित रखने और उसे स्वतः जमने (Coagulation) से रोकने के लिए उसमें कौन-सा रसायन मिलाया जाता है?",
            "Which alkaline chemical preservative is added to freshly harvested raw rubber latex in plantation storage tanks to prevent bacterial acid fermentation and premature coagulation?",
            listOf("अमोनिया का घोल (Ammonia Solution - NH3)", "एसिटिक एसिड", "फॉर्मिक एसिड", "सल्फ्यूरिक एसिड"),
            listOf("Ammonia Solution (NH3 - Maintains alkaline pH ~10, neutralizing bacterial acids and preserving colloidal negative surface charge on rubber globules)", "Acetic Acid (Used for deliberate coagulation)", "Formic Acid", "Sulfuric Acid"),
            0,
            "रबर के दूध (लेटेक्स) में बैक्टीरिया लैक्टिक एसिड बनाकर उसका pH घटा देते हैं जिससे रबर स्वतः जमने लगता है। अमोनिया (NH3) लेटेक्स को क्षारीय बनाए रखता है जिससे रबर के कणों पर ऋणात्मक आवेश बना रहता है और वे आपस में नहीं चिपकते। (जब रबर को जमाना होता है, तब 'फॉर्मिक एसिड' या 'एसिटिक एसिड' मिलाया जाता है)।",
            "Rubber latex globules are stabilized by a protective interfacial protein-lipid membrane carrying negative zeta potential; ammonia inhibits acid-producing bacteria and maintains electrostatic repulsion between suspended droplets.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q11", "sci_10",
            "कार के एयरबैग, स्पेससूट और स्विमिंग गॉगल्स में प्रयुक्त होने वाला 'फ्लोरोइलास्टोमर' (Viton / FKM) किस चरम परिस्थिति के प्रति प्रतिरोधी होता है?",
            "Viton (FKM fluoroelastomer), synthesized from vinylidene fluoride and hexafluoropropylene, is specifically deployed in aerospace and chemical industries due to its resistance to:",
            listOf("अत्यधिक तापमान (200°C+), आक्रामक रसायन, अम्ल एवं रॉकेट ईंधन", "केवल सामान्य पानी", "केवल सामान्य हवा", "केवल बर्फ"),
            listOf("Extreme temperatures (>200°C), aggressive corrosive acids, aviation jet fuels, and synthetic lubricants", "Normal tap water only", "Ordinary air only", "Ice only"),
            0,
            "वाइटन (Viton) एक अत्यधिक उन्नत फ्लोरीन युक्त रबर है। इसमें कार्बन-फ्लोरीन बंध इतने मजबूत होते हैं कि यह 200°C से अधिक तापमान, रॉकेट ईंधन, सल्फ्यूरिक एसिड और नाइट्रिक एसिड से भी अप्रभावित रहता है।",
            "Fluoroelastomers (FKM) possess high fluorine-to-hydrogen ratios along the aliphatic polymer backbone, creating steric shielding and electro-negative resistance against thermal oxidation and chemical nucleophilic attack.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m4_q12", "sci_10",
            "हवाई जहाज के लैंडिंग गियर के टायरों (Aircraft Landing Tires) में प्राकृतिक रबर (Natural Rubber) को सिंथेटिक रबर की तुलना में प्राथमिकता क्यों दी जाती है?",
            "Why is Natural Rubber (NR) preferred over synthetic polybutadiene rubber in heavy-load Aircraft Landing Tires?",
            listOf("प्राकृतिक रबर में उच्च तन्यता शक्ति, न्यूनतम आंतरिक ऊष्मा उत्पादन (Low Hysteresis heat build-up) और उत्कृष्ट प्रभाव अवशोषण क्षमता होती है", "प्राकृतिक रबर सस्ता होता है", "सिंथेटिक रबर जल जाता है", "विमान में रबर नहीं लगता"),
            listOf("Natural rubber exhibits superior elasticity, high green strength, exceptional tear resistance, and remarkably low hysteresis heat build-up upon sudden touchdown braking shock", "Natural rubber is cheaper", "Synthetic rubber dissolves", "Aircraft tires contain no rubber"),
            0,
            "विमान जब 250-300 किमी/घंटे की रफ्तार से रनवे पर उतरता है, तो टायरों पर अचानक भारी वजन और घर्षण पड़ता है। प्राकृतिक रबर में खिंचाव के दौरान क्रिस्टलीकरण (Strain-induced crystallization) की क्षमता होती है और यह तेजी से मुड़ने पर अंदर गर्मी (Hysteresis Heat) पैदा नहीं करता जिससे टायर फटते नहीं हैं।",
            "Natural rubber's stereoregular cis-1,4 architecture undergoes instantaneous strain-induced crystallization under high-frequency dynamic impact, dissipating immense frictional energy without catastrophic thermal blowout.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m4_q13", "sci_10",
            "चुइंगम (Chewing Gum) को चबाने योग्य और लचीला बनाने के लिए किस प्राकृतिक लेटेक्स या सिंथेटिक बहुलक बेस का उपयोग किया जाता है?",
            "The elastic gum base of traditional and commercial Chewing Gums is derived from the natural latex sapodilla sap 'Chicle' or synthetic:",
            listOf("चिकल लेटेक्स (Chicle Latex) एवं पॉलीआइसोब्यूटिलीन / पीवीएसी (Polyisobutylene / Polyvinyl Acetate)", "टेफ्लॉन", "नायलॉन", "बेकेलाइट"),
            listOf("Chicle (Latex from Manilkara zapota tree) and food-grade Polyisobutylene / Polyvinyl Acetate (PVA)", "Teflon", "Nylon", "Bakelite"),
            0,
            "पारंपरिक चुइंगम 'चीकू' (Manilkara zapota / Sapodilla) के पेड़ के लेटेक्स 'चिकल' (Chicle) से बनती थी। आधुनिक चुइंगम में खाद्य-ग्रेड 'पॉलीआइसोब्यूटिलीन' (ब्यूटाइल रबर) और 'पॉलीविनाइल एसीटेट' (PVAc) मिलाया जाता है जो मुंह के तापमान पर मुलायम रहते हैं लेकिन पचते नहीं हैं।",
            "Chicle is a natural polyterpene emulsion harvested from Central American sapodilla trees; modern synthetic gum bases blend food-grade polyisobutylene elastomers with plasticizing microcrystalline waxes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m4_q14", "sci_10",
            "गैसों के लिए न्यूनतम पारगम्यता (Lowest Gas Permeability) के कारण साइकिल और कार के टायरों के अंदर की 'इनर ट्यूब' (Inner Tubes) किस सिंथेटिक रबर से बनाई जाती है?",
            "Which synthetic elastomer (copolymer of Isobutylene with 2% Isoprene) is universally used for pneumatic tire Inner Tubes due to its near-zero gas permeability?",
            listOf("ब्यूटाइल रबर (Butyl Rubber / IIR - Isobutylene-Isoprene Rubber)", "ब्यूना-एस", "नियोप्रीन", "सिलिकॉन रबर"),
            listOf("Butyl Rubber (IIR - Low gas permeability keeps compressed air trapped inside inner tubes 8 times longer than natural rubber)", "Buna-S", "Neoprene", "Silicone rubber"),
            0,
            "ब्यूटाइल रबर (Isobutylene + Isoprene) की आणविक श्रृंखलाएं इतनी घनी और कसी हुई होती हैं कि हवा और गैसों के अणु इसके आर-पार नहीं निकल पाते। इसलिए टायरों की इनर ट्यूब और फुटबॉल के ब्लैडर इसी से बनाए जाते हैं ताकि महीनों तक हवा न निकले।",
            "Polyisobutylene methyl side groups packed tightly along the carbon chain create intense steric hindrance, reducing free volume and lowering diffusion coefficients for N2 and O2 gases to negligible levels.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m4_q15", "sci_10",
            "थर्मोप्लास्टिक इलास्टोमर्स (TPE - जैसे टूथब्रश के रबर ग्रिप और मोबाइल बैक कवर) की क्या खासियत होती है?",
            "Thermoplastic Elastomers (TPE / TPR), used for soft-touch toothbrush grips and flexible mobile phone bumpers, uniquely combine:",
            listOf("रबर जैसा लचीलापन और प्लास्टिक की तरह पिघलाकर दोबारा सांचे में ढलने (Recyclable) का गुण", "लोहे जैसी कठोरता", "पानी में घुलनशीलता", "कांच जैसी पारदर्शिता"),
            listOf("Rubber-like elastic elongation combined with thermoplastic melt-processability and 100% recyclability without chemical vulcanization", "Iron-like rigidity", "Water solubility", "Glass brittleness"),
            0,
            "TPE (थर्मोप्लास्टिक इलास्टोमर) में रबर जैसा खिंचाव और लचीलापन होता है, लेकिन पारंपरिक रबर की तरह इसे वल्कनीकृत करने की जरूरत नहीं होती। इसे गर्म करके प्लास्टिक की तरह बार-बार इंजेक्शन मोल्डिंग द्वारा किसी भी आकार में ढाला और रीसाइकिल किया जा सकता है।",
            "Thermoplastic elastomers are block copolymers (e.g., SBS - Styrene-Butadiene-Styrene) containing hard thermoplastic domains physically cross-linking soft elastomeric matrix segments via phase separation.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 5: Industrial Textile Chemistry, Synthetic Fibres & Composites (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m5_q1", "sci_10",
            "जिम के कपड़े, स्विमसूट और खिंचने वाले कपड़ों (Stretchable Sportswear) में प्रयुक्त होने वाला 'स्पैन्डेक्स' या 'लाइक्रा' (Spandex / Lycra) किस बहुलक का रूप है?",
            "Spandex (Lycra / Elastane), celebrated for its extraordinary elastic recovery (can stretch up to 500% without breaking), is chemically classified as a:",
            listOf("पॉलीयूरेथेन-पॉलीईथर कॉपोलीमर (Segmented Polyurethane / Elastane)", "पॉलिएस्टर", "पॉलीएमाइड", "सेल्युलोज"),
            listOf("Segmented Polyurethane (Elastane - alternating soft flexible polyether segments and rigid hard polyurethane segments)", "Polyester", "Polyamide", "Cellulose"),
            0,
            "स्पैन्डेक्स (Lycra) एक सेगमेंटेड पॉलीयूरेथेन फाइबर है। इसके 'सॉफ्ट सेगमेंट' (पॉलीईथर) खिंचकर 500-600% तक लंबे हो जाते हैं और 'हार्ड सेगमेंट' (यूरेथेन) इसे वापस अपने मूल आकार में खींच लेते हैं। ड्यूपॉन्ट ने 1958 में इसका आविष्कार किया था।",
            "Elastane (Spandex) consists of alternating flexible amorphous low-Tg polyol segments that uncoil during tensile elongation, physically cross-linked by crystalline high-Tg diisocyanate domains.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q2", "sci_10",
            "हवाई जहाजों (Boeing 787 Dreamliner), फॉर्मूला-1 रेसिंग कारों और अंतरिक्ष यानों में हल्के और अत्यंत मजबूत वजन-ढांचे बनाने हेतु किस उच्च-तकनीकी फाइबर का उपयोग किया जाता है?",
            "Which advanced aerospace composite material, possessing extreme tensile strength, high stiffness, and ultra-low weight, is pyrolyzed from Polyacrylonitrile (PAN) fibers?",
            listOf("कार्बन फाइबर (Carbon Fibre / CFRP - Carbon Fibre Reinforced Polymer)", "ग्लास फाइबर", "जूट फाइबर", "कपास"),
            listOf("Carbon Fibre (Pyrolyzed polyacrylonitrile precursor forming graphene-like hexagonal carbon sheets aligned along the fiber axis)", "Glass fibre", "Jute fibre", "Cotton"),
            0,
            "कार्बन फाइबर स्टील से 5 गुना मजबूत और 70% हल्का होता है। इसे पॉलीएक्रिलोनाइट्राइल (PAN) धागों को 1000-3000°C पर अक्रिय वातावरण में गर्म करके (Carbonization) बनाया जाता है जिससे केवल शुद्ध कार्बन के हेक्सागोनल क्रिस्टल बचते हैं।",
            "High-modulus carbon fibers (>500 GPa) are produced by stabilizing PAN fibers at 230°C in air followed by inert carbonization at 1500°C, aligning turbostratic graphitic basal planes along the filament axis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q3", "sci_10",
            "अग्निशामक कर्मियों (Firefighters) के सुरक्षात्मक सूट और रेसिंग ड्राइवरों के आग-रोधी कपड़ों में किस थर्मो-प्रतिरोधी पॉलीएमाइड फाइबर (Nomex) का उपयोग होता है?",
            "Which flame-resistant, thermally stable meta-aramid fiber (synthesized from m-phenylenediamine and isophthaloyl chloride) is deployed in Firefighter turnout gear and flight suits?",
            listOf("नोमेक्स (Nomex / Meta-Aramid Fibre)", "नायलॉन-6,6", "रेयॉन", "डैक्रॉन"),
            listOf("Nomex (Poly-meta-phenylene isophthalamide - High flame resistance, does not melt or support combustion in air)", "Nylon-6,6", "Rayon", "Dacron"),
            0,
            "नोमेक्स (Nomex) एक मेटा-अरामिड फाइबर है। यह 370°C तक के तापमान को बिना पिघले या आग पकड़े सहन कर सकता है। आग लगने पर यह जलता नहीं बल्कि फूलकर एक सुरक्षात्मक चारकोल परत बना लेता है जो अंदर की त्वचा को जलने से बचाती है।",
            "Nomex's meta-oriented aromatic backbone inhibits chain conformation alignment compared to para-aramids (Kevlar), yielding high thermal barrier properties and Limiting Oxygen Index (LOI > 28).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q4", "sci_10",
            "फाइबरग्लास (Fiberglass / कांच के बारीक रेशे) को प्लास्टिक रेजिन के साथ मिलाकर नावों, हेलमेट और पवन चक्की के ब्लेड बनाने वाले मजबूत कम्पोजिट को क्या कहते हैं?",
            "The widely used industrial structural composite made by embedding fine woven glass filaments into a thermosetting polyester or epoxy resin matrix is known as:",
            listOf("जीआरपी / एफआरपी - ग्लास रीइन्फोर्स्ड प्लास्टिक (GRP / FRP - Glass-Reinforced Plastic)", "पीवीसी", "टेफ्लॉन", "थर्माकोल"),
            listOf("Glass-Reinforced Plastic (GRP / FRP / Fiberglass - High strength-to-weight ratio and electrical insulation)", "PVC", "Teflon", "Thermocol"),
            0,
            "FRP (फाइबर रीइन्फोर्स्ड प्लास्टिक) में कांच के अत्यंत पतले रेशे (E-Glass) तनाव शक्ति (Tensile Strength) प्रदान करते हैं और बहुलक रेजिन उन्हें बांधकर रखता है। यह कभी जंग नहीं खाता और स्टील से बहुत हल्का होता है।",
            "Fiberglass composites exploit the immense tensile strength of defect-free silica glass filaments (~3400 MPa) bound within a cross-linked vinyl-ester/epoxy matrix that transfers interfacial shear stress.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q5", "sci_10",
            "कपास (Cotton) प्राकृतिक रूप से 90% से अधिक किस शुद्ध जैविक बहुलक (Biopolymer) से बना होता है?",
            "Natural raw Cotton fibers, harvested from Gossypium plant seed bolls, consist of over 90% of which pure structural polysaccharide?",
            listOf("सेल्युलोज (Cellulose - Beta-1,4-D-glucan)", "स्टार्च", "ग्लाइकोजन", "पेक्टिन"),
            listOf("Cellulose (Linear beta-1,4-D-glucan homopolymer chains stabilized by intra- and intermolecular hydrogen bonds)", "Starch", "Glycogen", "Pectin"),
            0,
            "कपास प्रकृति में सेल्युलोज का सबसे शुद्धतम रूप है (90-95% सेल्युलोज)। सेल्युलोज की लंबी ग्लूकोज श्रृंखलाएं और हाइड्रॉक्सिल (-OH) समूह पानी को आसानी से सोखते हैं (Hydrophilic), इसलिए सूती कपड़े पसीना सोखने में सबसे आरामदायक होते हैं।",
            "Cotton fibrils contain crystalline cellulose I-beta microfibrils where extensive inter-chain hydrogen bonds between C3-OH and C6-OH groups confer high tensile strength and moisture regain (~8.5%).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q6", "sci_10",
            "सूती कपड़ों को चमकदार, मजबूत और रंगाई के अनुकूल बनाने हेतु उन्हें कास्टिक सोडा (NaOH) के ठंडे घोल से उपचारित करने की प्रक्रिया क्या कहलाती है?",
            "The textile finishing process of treating cotton yarns or fabrics with concentrated Sodium Hydroxide (NaOH) under tension to impart luster, dimensional stability, and increased dye affinity is called:",
            listOf("मर्सरीकरण (Mercerization - John Mercer process)", "वल्कनीकरण", "पाश्चुरीकरण", "साबुनीकरण"),
            listOf("Mercerization (Converts native Cellulose I crystal lattice into hydrated Cellulose II, causing fiber swelling and round cross-section)", "Vulcanization", "Pasteurization", "Saponification"),
            0,
            "1844 में जॉन मर्सर ने 'मर्सरीकरण' (Mercerization) की खोज की। 20% NaOH के घोल में सूती धागे को खींचकर रखने से चपटे धागे गोल हो जाते हैं, जिससे कपड़े में रेशम जैसी चमक (Luster) आ जाती है और उसकी मजबूती 25% बढ़ जाती है।",
            "Mercerization de-crystallizes native Cellulose I into Cellulose II allomorph, swelling the lumen and converting kidney-shaped cotton cross-sections into circular fibers with enhanced specular light reflection.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q7", "sci_10",
            "ऊन (Wool) और प्राकृतिक रेशम (Natural Silk) रासायनिक रूप से किस प्रकार के जैविक बहुलक हैं?",
            "Chemically, natural animal fibers such as Sheep Wool and Mulberry Silk are composed of which structural class of biopolymers?",
            listOf("प्रोटीन (Proteins - Keratin in wool & Fibroin/Sericin in silk)", "कार्बोहाइड्रेट", "वसा", "पॉलिएस्टर"),
            listOf("Proteins (Wool consists of sulfur-rich alpha-Keratin; Silk consists of beta-pleated sheet Fibroin protein coated with Sericin gum)", "Carbohydrates", "Lipids", "Polyesters"),
            0,
            "ऊन 'अल्फा-केराटिन' (Keratin) प्रोटीन है जिसमें सिस्टीन अमीनो एसिड के सल्फर बंध होते हैं (जलने पर बालों जैसी गंध)। रेशम (Silk) शहतूत के रेशमकीट (Bombyx mori) के कोकून से प्राप्त 'फाइब्रोइन' (Fibroin - 75%) और 'सेरिसिन' (Sericin - 25%) प्रोटीन है।",
            "Wool keratin forms alpha-helical coiled-coils rich in cystine disulfide cross-links; Silk fibroin comprises antiparallel beta-pleated sheets dominated by repeating Gly-Ser-Gly-Ala-Gly-Ala amino acid motifs.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q8", "sci_10",
            "सूती कपड़ों में सलवटें (Wrinkles) क्यों पड़ती हैं जबकि पॉलिएस्टर और नायलॉन के कपड़े 'रिंकल-फ्री' (Wrinkle-Resistant) क्यों होते हैं?",
            "Why do natural Cotton fabrics crease easily upon laundering, whereas synthetic Polyester fabrics maintain permanent creases and resist wrinkles?",
            listOf("कपास के हाइड्रोजन बंध पानी और गर्मी से टूटकर नए स्थान पर जम जाते हैं, जबकि पॉलिएस्टर में मजबूत एस्टर बंध और उच्च प्रत्यास्थता होती है", "कपास में लोहा होता है", "पॉलिएस्टर में कोई बंध नहीं होते", "दोनों एक समान सिकुड़ते हैं"),
            listOf("Cotton cellulose interchain hydrogen bonds break and reform in displaced positions upon wetting/drying; Polyester's hydrophobic rigid aromatic chains possess high elastic recovery", "Cotton contains iron", "Polyester has zero bonds", "Both crease identically"),
            0,
            "कपास के सेल्युलोज में पानी घुसने पर उसके कमजोर हाइड्रोजन बंध टूट जाते हैं और सूखने पर मुड़ी हुई स्थिति में पुनः जुड़ जाते हैं (सलवटें)। पॉलिएस्टर (PET) पानी नहीं सोखता (हाइड्रोफोबिक) और इसकी आणविक श्रृंखलाएं मुड़ने के बाद वापस सीधी हो जाती हैं।",
            "Cellulose amorphous regions undergo plasticization by water molecules which rupture inter-chain H-bonds; synthetic polyesters exhibit high glass transition temperatures and hydrophobic dimensional resilience.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q9", "sci_10",
            "सूती कपड़ों को 'रिंकल-फ्री' (Iron-Free / Wash-and-Wear) बनाने हेतु उन पर किस रासायनिक रेजिन की कोटिंग चढ़ाई जाती है?",
            "To manufacture commercial 'Durable Press' / 'Wrinkle-Free' cotton shirts, cotton fabric is chemically cross-linked using which resin finish?",
            listOf("DMDHEU / फॉर्मेल्डिहाइड रेजिन (Dimethyloldihydroxyethyleneurea / Formaldehyde Resins)", "कास्टिक सोडा", "सोडियम क्लोराइड", "अमोनिया"),
            listOf("DMDHEU (Dimethyloldihydroxyethyleneurea cross-linking hydroxyl groups between adjacent cellulose microfibrils)", "Caustic soda", "Sodium chloride", "Ammonia"),
            0,
            "DMDHEU रेजिन सेल्युलोज के दो अलग-अलग -OH समूहों के बीच रासायनिक सहसंयोजक सेतु (Covalent Cross-links) बना देता है। इससे धोने के बाद भी सूती धागे अपनी जगह से नहीं खिसकते और कपड़े पर सलवटें नहीं पड़तीं।",
            "DMDHEU undergoes acid-catalyzed condensation with primary C6-hydroxyls of cellulose chains, locking microfibrils in a relaxed state to prevent irreversible sliding and wrinkling during laundering.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m5_q10", "sci_10",
            "कपड़ों की 'ड्राई क्लीनिंग' (Dry Cleaning) में पानी की जगह किस गैर-ज्वलनशील विलायक (Solvent) का सबसे आम तौर पर उपयोग किया जाता है?",
            "Which chlorinated organic solvent (Perc) is universally utilized as the primary cleaning fluid in commercial commercial Dry Cleaning of delicate fabrics?",
            listOf("टेट्राक्लोरोएथिलीन / पर्क्लोरोएथिलीन (Tetrachloroethylene / Perchloroethylene - PERC / C2Cl4)", "एथिल अल्कोहल", "साधारण पानी", "सल्फ्यूरिक एसिड"),
            listOf("Perchloroethylene / PERC (Tetrachloroethene - C2Cl4 - Non-flammable, powerful lipophilic solvent that dissolves oils without swelling natural fibers)", "Ethyl alcohol", "Pure distilled water", "Sulfuric acid"),
            0,
            "ड्राई क्लीनिंग में पानी का इस्तेमाल नहीं होता (जिससे ऊन और रेशम के धागे सिकुड़ते या फूलते नहीं हैं)। इसमें 'पर्क्लोरोएथिलीन' (PERC - C2Cl4) विलायक का उपयोग होता है जो कपड़ों से तेल, ग्रीस और मैल को तुरंत घोलकर अलग कर देता है।",
            "Perchloroethylene (PCE / PERC) dissolves non-polar greasy soils via dipole-induced interactions; because it possesses zero water activity, it avoids fiber swelling, shrinkage, and dye bleeding.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q11", "sci_10",
            "रेशेदार कांच (Optical Fibres / प्रकाशिक तंतु) की कोर (Core) और क्लैडिंग (Cladding) किस अति-शुद्ध पदार्थ से बनाई जाती है जो पूर्ण आंतरिक परावर्तन (TIR) पर काम करती है?",
            "High-speed telecommunication Optical Fibers, transmitting digital data as light pulses via Total Internal Reflection (TIR), are drawn from ultra-pure synthetic:",
            listOf("सिलिका ग्लास / सिलिकॉन डाइऑक्साइड (Fused Silica Glass - SiO2 doped with Germanium)", "साधारण खिड़की का कांच", "प्लास्टिक शीट", "तांबा"),
            listOf("Fused Silica (Ultra-pure SiO2 glass with core doped with GeO2 to achieve higher refractive index n1 > n2)", "Ordinary soda-lime window glass", "Polyester sheet", "Copper metal"),
            0,
            "ऑप्टिकल फाइबर की कोर अति-शुद्ध सिलिका ग्लास (SiO2) की होती है जिसमें जर्मेनियम मिलाकर अपवर्तनांक (Refractive Index n1) अधिक रखा जाता है, और बाहरी क्लैडिंग (n2) का अपवर्तनांक कम होता है। इससे प्रकाश किरणें 'पूर्ण आंतरिक परावर्तन' (TIR) द्वारा बिना ऊर्जा ह्रास के हजारों किमी दूर तक डेटा ले जाती हैं।",
            "Modified Chemical Vapor Deposition (MCVD) produces ultra-pure fused silica glass preforms with attenuation <0.2 dB/km at 1550 nm infrared wavelength window.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q12", "sci_10",
            "गोल्डन फाइबर (Golden Fibre) के नाम से प्रसिद्ध प्राकृतिक पादप रेशा कौन-सा है जो भारत और बांग्लादेश में प्रचुरता से उत्पादित होता है?",
            "Which natural bast plant fiber, harvested from the bark of Corchorus plants and famed as the 'Golden Fibre' of India, is 100% biodegradable and used for gunny sacks?",
            listOf("जूट / पटसन (Jute / Corchorus olitorius / C. capsularis)", "कपास", "सन (Hemp)", "फ्लेक्स (Linen)"),
            listOf("Jute (Lignocellulosic bast fiber containing 60% cellulose and 20% lignin, cultivated predominantly in West Bengal and Ganga delta)", "Cotton", "Hemp", "Flax (Linen)"),
            0,
            "जूट को 'गोल्डन फाइबर' (स्वर्ण रेशा) कहा जाता है। यह पौधे के तने की छाल से 'रेटिंग' (पानी में सड़ाने) की प्रक्रिया द्वारा निकाला जाता है। भारत दुनिया का सबसे बड़ा जूट उत्पादक देश है (विशेषकर पश्चिम बंगाल की हुगली नदी घाटी)। यह बोरे, रस्सियां और थैले बनाने के काम आता है।",
            "Jute is a multicellular lignocellulosic fiber; microbial retting of Corchorus stalks in slow-moving water degrades pectinaceous gums, liberating commercial golden-brown bast fiber bundles.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q13", "sci_10",
            "प्राकृतिक रेशमकीट (Silkworm) के पालन और रेशम उत्पादन के विज्ञान को क्या कहा जाता है?",
            "The commercial rearing of silkworms (especially Bombyx mori on Mulberry leaves) for the agricultural production of raw natural silk is scientifically termed:",
            listOf("सेरीकल्चर (Sericulture / रेशम कीट पालन)", "एपिकल्चर (मधुमक्खी पालन)", "पिसीकल्चर (मत्स्य पालन)", "विटीकल्चर (अंगूर की खेती)"),
            listOf("Sericulture (Silkworm husbandry - Bombyx mori feeding on Morus alba mulberry foliage)", "Apiculture (Beekeeping)", "Pisciculture (Fish farming)", "Viticulture (Grape cultivation)"),
            0,
            "सेरीकल्चर (रेशम कीट पालन) में मादा तितली के अंडों से कैटरपिलर शहतूत की पत्तियां खाकर बड़े होते हैं और अपने चारों ओर लार से 'कोकून' (Cocoon) बुनते हैं। कोकून को गर्म पानी में उबालकर धागा निकाला जाता है। भारत में 4 प्रकार का रेशम होता है: शहतूती, टसर, एरी और मूंगा (असम का सुनहरा रेशम)।",
            "Sericulture comprises Moriculture (mulberry cultivation), silkworm rearing, and post-cocoon reeling; pupae are stifled in hot air/steam to unwind continuous mono-filament fibroin silk threads (~800-1200 meters/cocoon).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q14", "sci_10",
            "कांच (Glass / Soda-Lime Glass) को रासायनिक रूप से किस भौतिक अवस्था में माना जाता है?",
            "In physical chemistry and materials science, ordinary Soda-Lime Glass (SiO2 + Na2O + CaO) is fundamentally classified as an:",
            listOf("अतिशीतित द्रव / अक्रिस्टलीय ठोस (Supercooled Liquid / Amorphous Solid with no sharp melting point)", "क्रिस्टलीय ठोस", "शुद्ध धातु", "गैसीय मिश्रण"),
            listOf("Supercooled Liquid / Amorphous Solid (Non-crystalline, isotropic glassy state lacking long-range translational atomic periodicity)", "Crystalline Solid (like Quartz)", "Pure transition metal", "Gaseous plasma"),
            0,
            "कांच एक 'अक्रिस्टलीय ठोस' (Amorphous Solid) या 'अतिशीतित द्रव' (Supercooled Liquid) है। इसमें परमाणुओं की कोई निश्चित त्रिविमीय क्रिस्टल संरचना नहीं होती। पुरानी इमारतों की खिड़कियों के शीशे कई दशकों बाद नीचे से थोड़े मोटे हो जाते हैं क्योंकि कांच में बहुत धीमी गति से बहने का गुण होता है।",
            "Glass is an amorphous solid formed by quenching molten silica-soda-lime mixtures below their glass transition temperature (Tg) fast enough to prevent nucleation into a thermodynamically stable crystalline lattice.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m5_q15", "sci_10",
            "बुलेटप्रूफ ग्लास (Bulletproof Glass / Laminated Safety Glass) का निर्माण किन दो पदार्थों की परतों को आपस में चिपकाकर किया जाता है?",
            "Bulletproof Security Glass is constructed by sandwiching which transparent thermoplastic interlayer between multiple tough laminated sheets of tempered Glass?",
            listOf("पॉलीविनाइल ब्यूटायरल या पॉलीकार्बोनेट (Polyvinyl Butyral - PVB or Polycarbonate resin interlayer)", "थर्माकोल", "पीवीसी केवल", "टेफ्लॉन"),
            listOf("PVB (Polyvinyl Butyral) or Polycarbonate thermoplastic sheets bonded under intense heat and autoclave pressure", "Thermocol", "PVC only", "Teflon"),
            0,
            "बुलेटप्रूफ कांच में कांच की कई परतों के बीच में 'पॉलीकार्बोनेट' (Polycarbonate) या 'PVB' की लचीली और पारदर्शी प्लास्टिक परतें चिपकाई जाती हैं। जब गोली टकराती है, तो कांच की बाहरी परत गोली को चपटा करती है और अंदर की पॉलीकार्बोनेट परत गोली की गतिज ऊर्जा को सोखकर उसे आर-पार जाने से रोक देती है।",
            "Laminated glass utilizes elastomeric PVB or ductile polycarbonate interlayers to absorb ballistic projectile kinetic energy via plastic deformation while holding shattered glass fragments intact.",
            "Easy"
        )
    )
}
