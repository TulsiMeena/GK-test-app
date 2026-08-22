package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic5Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m1_q1", "sci_5",
            "जीव विज्ञान (Biology) और जंतु विज्ञान (Zoology) का जनक (Father of Biology & Zoology) किसे कहा जाता है?",
            "Who is universally regarded as the 'Father of Biology' and 'Father of Zoology'?",
            listOf("थियोफ्रेस्टस", "अरस्तू (Aristotle - 384–322 BC)", "कार्ल लिनिअस", "ग्रेगर मेंडल"),
            listOf("Theophrastus", "Aristotle", "Carl Linnaeus", "Gregor Mendel"),
            1,
            "प्राचीन यूनानी दार्शनिक अरस्तू (Aristotle) को जीव विज्ञान और जंतु विज्ञान दोनों का जनक कहा जाता है। उन्होंने 'हिस्टोरिया एनिमेलियम' (Historia Animalium) में 500 से अधिक जीवों का वर्गीकरण किया।",
            "Aristotle is acknowledged as the Father of Biology and Zoology for his foundational anatomical observations and animal taxonomies in Historia Animalium.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q2", "sci_5",
            "वनस्पति विज्ञान का जनक (Father of Botany) किसे कहा जाता है जिन्होंने 'हिस्टोरिया प्लांटारम' पुस्तक लिखी थी?",
            "Who is celebrated as the 'Father of Botany' for cataloging over 500 plant species in 'Historia Plantarum'?",
            listOf("अरस्तू", "थियोफ्रेस्टस (Theophrastus)", "लिनिअस", "रॉबर्ट हुक"),
            listOf("Aristotle", "Theophrastus", "Carl Linnaeus", "Robert Hooke"),
            1,
            "अरस्तू के शिष्य थियोफ्रेस्टस (Theophrastus) को वनस्पति विज्ञान का जनक कहा जाता है। उन्होंने पौधों को वृक्ष, झाड़ी, उपझाड़ी और शाक के रूप में वर्गीकृत किया।",
            "Theophrastus, a student of Aristotle, founded Botany through his pioneering treatises Enquiry into Plants and Causes of Plants.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q3", "sci_5",
            "द्विनाम पद्धति (Binomial Nomenclature) और आधुनिक वर्गिकी (Taxonomy) का जनक किसे माना जाता है?",
            "Who established modern biological Taxonomy and Binomial Nomenclature (Systema Naturae, 1758)?",
            listOf("चार्ल्स डार्विन", "कार्ल लिनिअस (Carl Linnaeus)", "अर्नस्ट हेकेल", "व्हिटेकर"),
            listOf("Charles Darwin", "Carl Linnaeus (Carolus Linnaeus)", "Ernst Haeckel", "R. H. Whittaker"),
            1,
            "कार्ल लिनिअस ने जीवों के वैज्ञानिक नामकरण की 'द्विनाम पद्धति' दी, जिसमें पहला शब्द वंश (Genus - Capital) और दूसरा जाति (Species - Small) होता है, जैसे मानव = Homo sapiens।",
            "Carl Linnaeus introduced Binomial Nomenclature, assigning every organism a two-part Latinized genus and species identifier.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q4", "sci_5",
            "पांच जगत वर्गीकरण प्रणाली (Five Kingdom Classification System - 1969) का प्रतिपादन किसने किया था?",
            "Who proposed the widely accepted Five Kingdom Classification of living organisms (Monera, Protista, Fungi, Plantae, Animalia) in 1969?",
            listOf("कार्ल लिनिअस (2 जगत)", "आर. एच. व्हिटेकर (R. H. Whittaker)", "अर्नस्ट हेकेल (3 जगत)", "कार्ल वोस (6 जगत)"),
            listOf("Carl Linnaeus", "R. H. Whittaker (Monera, Protista, Fungi, Plantae, Animalia)", "Ernst Haeckel", "Carl Woese"),
            1,
            "रॉबर्ट एच. व्हिटेकर ने जीवों को 5 जगतों में विभाजित किया: 1. मोनेरा (प्रोकैरियोटिक/बैक्टीरिया), 2. प्रोटिस्टा (एककोशिकीय यूकैरियोटिक), 3. फंजाई (कवक), 4. प्लांटी (पादप), 5. एनिमेलिया (जंतु)।",
            "R. H. Whittaker categorized cellular life into five kingdoms based on cell structure (prokaryotic vs eukaryotic), body organization, and mode of nutrition.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q5", "sci_5",
            "कोशिका (Cell) की खोज 1665 में कॉर्क की पतली काट में 'माइक्रोग्राफिया' पुस्तक में किसने प्रकाशित की थी?",
            "Who first observed and named the 'Cell' (dead cork cell walls) in 1665 using an early compound microscope?",
            listOf("एंटनी वॉन ल्यूवेनहॉक", "रॉबर्ट हुक (Robert Hooke)", "रॉबर्ट ब्राउन", "श्लाइडेन और श्वान"),
            listOf("Antoni van Leeuwenhoek", "Robert Hooke (Micrographia, 1665)", "Robert Brown", "Schleiden and Schwann"),
            1,
            "रॉबर्ट हुक ने 1665 में बोतल के कॉर्क में मधुमक्खी के छत्ते जैसी कोठरियां देखीं और उन्हें 'सेल्युला' (Cell) नाम दिया। जीवित कोशिका को पहली बार 1674 में एंटनी वॉन ल्यूवेनहॉक ने देखा था।",
            "Robert Hooke coined the biological term 'Cell' after observing honeycomb-like dead cell walls in cork tissue under his custom microscope.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q6", "sci_5",
            "कोशिका सिद्धांत (Cell Theory) का प्रतिपादन 1838-1839 में किन दो वैज्ञानिकों ने मिलकर किया था?",
            "The Classical Cell Theory ('All living organisms are composed of cells') was formulated by which two scientists?",
            listOf("रॉबर्ट हुक और रॉबर्ट ब्राउन", "एम. जे. श्लाइडेन और थियोडोर श्वान (M. J. Schleiden and Theodor Schwann)", "वाटसन और क्रिक", "लुई पाश्चर और कोच"),
            listOf("Hooke and Brown", "Matthias Schleiden (Botanist) and Theodor Schwann (Zoologist)", "Watson and Crick", "Pasteur and Koch"),
            1,
            "जर्मन वनस्पतिशास्त्री मैथियास श्लाइडेन (1838) और प्राणीशास्त्री थियोडोर श्वान (1839) ने कोशिका सिद्धांत दिया। बाद में 1855 में रुडोल्फ विरचो ने जोड़ा कि 'सभी कोशिकाएं पूर्ववर्ती कोशिकाओं से बनती हैं' (Omnis cellula-e cellula)।",
            "Schleiden and Schwann established that cells are the basic structural and functional units of all life, expanded by Rudolf Virchow's doctrine of cellular biogenesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q7", "sci_5",
            "कोशिका का 'शक्तिगृह' या 'पावरहाउस' (Powerhouse of the Cell) किसे कहा जाता है जहां कोशिकीय श्वसन द्वारा ATP बनती है?",
            "Which cytoplasmic organelle is termed the 'Powerhouse of the Cell' because it synthesizes cellular energy in the form of ATP via the Krebs Cycle?",
            listOf("राइबोसोम", "माइटोकॉन्ड्रिया (Mitochondria)", "लाइसोसोम", "गॉल्जी काय"),
            listOf("Ribosome", "Mitochondria (Synthesizes ATP via oxidative phosphorylation)", "Lysosome", "Golgi apparatus"),
            1,
            "माइटोकॉन्ड्रिया में क्रेब्स चक्र और ऑक्सीडेटिव फॉस्फोरिलेशन द्वारा ग्लूकोज के ऑक्सीकरण से ATP (एडेनोसिन ट्राइफॉस्फेट - ऊर्जा मुद्रा) बनती है। इसका अपना स्वयं का वृत्ताकार DNA और 70S राइबोसोम होता है।",
            "Mitochondria are double-membraned organelles that generate ATP chemical energy through the electron transport chain and aerobic Krebs cycle.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q8", "sci_5",
            "कोशिका की 'आत्मघाती थैली' (Suicide Bag of the Cell) किस कोशिकांग को कहा जाता है जिसमें जल-अपघटनीय पाचक एंजाइम होते हैं?",
            "Which hydrolytic enzyme-filled organelle, discovered by Christian de Duve in 1955, is nicknamed the 'Suicidal Bag of the Cell'?",
            listOf("राइबोसोम", "लाइसोसोम (Lysosome)", "माइटोकॉन्ड्रिया", "तारककाय"),
            listOf("Ribosome", "Lysosome (Contains acidic hydrolase enzymes)", "Mitochondria", "Centrosome"),
            1,
            "लाइसोसोम में लगभग 50 प्रकार के पाचक हाइड्रोलाइटिक एंजाइम (एसिड फॉस्फेटेज आदि) होते हैं। कोशिका के क्षतिग्रस्त होने पर यह फट जाती है और अपने ही एंजाइमों द्वारा पूरी कोशिका को पचा डालती है।",
            "Lysosomes contain acidic digestive hydrolases that digest phagocytosed debris or trigger autolysis (programmed cell death) when ruptured.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q9", "sci_5",
            "कोशिका की 'प्रोटीन फैक्ट्री' (Protein Factory of the Cell) किसे कहा जाता है?",
            "Which ribonucleoprotein granule, the smallest cell organelle, is known as the 'Protein Factory of the Cell'?",
            listOf("माइटोकॉन्ड्रिया", "राइबोसोम (Ribosome - जॉर्ज पैलाडे द्वारा खोजा गया)", "लाइसोसोम", "लवक"),
            listOf("Mitochondria", "Ribosome (Palade granules / Site of translation)", "Lysosome", "Plastid"),
            1,
            "राइबोसोम (Ribosome) RNA और प्रोटीन के बने झिल्ली-रहित कण होते हैं। यह mRNA के कोड को पढ़कर अमीनो अम्लों को जोड़कर प्रोटीन संश्लेषण (Translation) का कार्य करते हैं।",
            "Ribosomes assemble amino acids into polypeptide chains during translation, translating mRNA genetic sequences into functional proteins.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q10", "sci_5",
            "कोशिका का 'यातायात प्रबंधक' (Traffic Police / Director of Macromolecular Traffic) किस कोशिकांग को कहा जाता है?",
            "Which organelle responsible for packaging, modifying, and sorting cellular proteins is nicknamed the 'Traffic Police of the Cell'?",
            listOf("लाइसोसोम", "गॉल्जी उपकरण / गॉल्जी काय (Golgi Apparatus - खोजकर्ता कैमिलो गॉल्जी)", "अंतःप्रद्रव्यी जालिका", "रिक्तिका"),
            listOf("Lysosome", "Golgi Apparatus / Golgi Body (Camillo Golgi, 1898)", "Endoplasmic reticulum", "Vacuole"),
            1,
            "गॉल्जी उपकरण (Golgi apparatus) अंतःप्रद्रव्यी जालिका में बने प्रोटीनों और लिपिडों का रूपांतरण, पैकेजिंग और पुटिकाओं (Vesicles) में बंद करके गंतव्य तक भेजने का कार्य करता है।",
            "The Golgi apparatus post-translationally modifies, packages, and routes proteins and lipids destined for secretion or lysosomal delivery.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q11", "sci_5",
            "पौधों में पत्तियों का हरा रंग किस वर्णक (Pigment) के कारण होता है और इसके केंद्र में कौन-सी धातु उपस्थित होती है?",
            "Green plant foliage owes its color to Chlorophyll pigment. Which divalent metal ion is bound at the center of the Chlorophyll porphyrin ring?",
            listOf("लोहा (Fe)", "मैग्नीशियम (Magnesium - Mg²⁺)", "तांबा (Cu)", "जस्ता (Zn)"),
            listOf("Iron (Fe - in Hemoglobin)", "Magnesium (Mg²⁺ - coordinated in Chlorophyll)", "Copper (Cu)", "Zinc (Zn)"),
            1,
            "क्लोरोफिल में मैग्नीशियम (Mg) धातु का परमाणु पोरफाइरिन वलय के केंद्र में स्थित होता है। यह सूर्य के प्रकाश के नीले और लाल रंग को अवशोषित करता है और हरे रंग को परावर्तित करता है।",
            "Chlorophyll contains a central Magnesium ion (Mg²⁺) chelated within a substituted tetrapyrrole ring, essential for capturing solar photons in photosynthesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q12", "sci_5",
            "पौधों में जड़ों द्वारा अवशोषित जल और खनिजों को पत्तियों तक ऊपर ले जाने वाला संवहनी ऊतक (Vascular Tissue) कौन-सा है?",
            "Which complex vascular plant tissue transports Water and dissolved Minerals unidirectionally upwards from roots to leaves?",
            listOf("फ्लोएम (Phloem)", "जाइलम (Xylem / दारु)", "कैम्बियम", "कॉर्टेक्स"),
            listOf("Phloem (Food transport)", "Xylem (Water and mineral transport via tracheids and vessels)", "Cambium", "Cortex"),
            1,
            "जाइलम (Xylem) मृत वाहिकाओं (Vessels) और वाहिनिकाओं (Tracheids) का बना ऊतक है जो वाष्पोत्सर्जन खिंचाव (Transpiration pull) द्वारा जल को ऊपर चढ़ाता है। फ्लोएम पत्तियों से बने भोजन को वितरित करता है।",
            "Xylem conducts water and inorganic solutes from root systems to the canopy driven by transpirational pull and root capillary pressure.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q13", "sci_5",
            "पौधों की पत्तियों में प्रकाश संश्लेषण द्वारा बने भोजन (सुक्रोज) को पौधे के सभी अंगों तक पहुंचाने वाला ऊतक कौन-सा है?",
            "Which living vascular plant tissue conducts photosynthesized organic nutrients (sugars/sucrose) bidirectionally across plant organs?",
            listOf("जाइलम", "फ्लोएम (Phloem / पोषवाह - चालनी नलिकाएं और सहकोशिकाएं)", "पिथ", "एपिडर्मिस"),
            listOf("Xylem", "Phloem (Translocates sucrose via sieve tubes and companion cells)", "Pith", "Epidermis"),
            1,
            "फ्लोएम (Phloem) जीवित चालनी नलिकाओं (Sieve tubes) और सहकोशिकाओं (Companion cells) द्वारा घुलनशील कार्बनिक पोषक तत्वों को पत्तियों से जड़ों और वृद्धि बिंदुओं तक दोनों दिशाओं में पहुंचाता है।",
            "Phloem facilitates the translocation of photosynthetic assimilates (primarily sucrose) through active pressure-flow mechanisms.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q14", "sci_5",
            "प्रकाश संश्लेषण (Photosynthesis) की प्रक्रिया में उप-उत्पाद (By-product) के रूप में निकलने वाली ऑक्सीजन (O₂) गैस किस अणु के टूटने (Photolysis) से उत्पन्न होती है?",
            "In oxygenic photosynthesis, the molecular oxygen (O₂) released into the atmosphere originates directly from the photolytic splitting of:",
            listOf("कार्बन डाइऑक्साइड (CO₂)", "जल (Water - H₂O)", "ग्लूकोज", "क्लोरोफिल"),
            listOf("Carbon Dioxide (CO₂)", "Water molecules (H₂O photolysis in Photosystem II: 2H₂O → 4H⁺ + 4e⁻ + O₂)", "Glucose", "Chlorophyll"),
            1,
            "रॉबिन हिल और रूबेन-कामेन के आइसोटोपिक (O¹⁸) प्रयोगों ने सिद्ध किया कि प्रकाश संश्लेषण में निकलने वाली O₂ जल (H₂O) के प्रकाशीय अपघटन (Photolysis) से आती है, न कि CO₂ से।",
            "Photolysis of water at the oxygen-evolving complex of Photosystem II splits H₂O into protons, electrons, and molecular oxygen (O₂).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m1_q15", "sci_5",
            "पादप हार्मोन 'ऑक्सिन' (Auxin - जैसे IAA) का मुख्य कार्य क्या है जिसकी खोज डार्विन और वेंट ने की थी?",
            "What is the primary physiological function of the plant growth hormone Auxin (Indole-3-acetic acid)?",
            listOf("पौधों को सुप्त करना", "कोशिका दीर्घीकरण और प्ररोह शीर्ष की ओर प्रकाशानुवर्तन गति (Cell elongation & Phototropism)", "पत्तियों को गिराना", "फलों को पकाना"),
            listOf("Inducing dormancy", "Cell elongation, apical dominance, and phototropic bending towards light", "Leaf abscission", "Fruit ripening"),
            1,
            "ऑक्सिन पौधे के शीर्ष कलिका (Shoot tip) में बनता है। यह कोशिकाओं को लंबा करता है और पौधे को सूर्य के प्रकाश की दिशा में मुड़ने (Phototropism) में मदद करता है।",
            "Auxins stimulate cellular elongation, maintain apical dominance, and mediate directional growth responses (phototropism and gravitropism).",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m2_q1", "sci_5",
            "गैसीय अवस्था में पाया जाने वाला एकमात्र प्राकृतिक पादप हार्मोन कौन-सा है जो फलों को पकाता है?",
            "Which is the ONLY naturally occurring Gaseous plant hormone that accelerates Fruit Ripening and triggers leaf abscission?",
            listOf("ऑक्सिन", "एथिलीन (Ethylene - C₂H₄)", "जिबरेलिन", "साइटोकाइनिन"),
            listOf("Auxin", "Ethylene (Ethene gas - C₂H₄)", "Gibberellin", "Cytokinin"),
            1,
            "एथिलीन (C₂H₄) एकमात्र गैसीय पादप हार्मोन है। यह फलों को प्राकृतिक रूप से पकाने, पकने पर रंग बदलने और पत्तियों व पुराने फलों को गिराने (Abscission) को प्रेरित करता है।",
            "Ethylene is a volatile hydrocarbon gas functioning as a plant hormone that orchestrates climacteric fruit ripening and tissue senescence.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q2", "sci_5",
            "कोशिका विभाजन (Cell Division) को तीव्र गति से प्रेरित करने वाला प्रमुख पादप हार्मोन कौन-सा है?",
            "Which plant hormone, first isolated by Miller from herring sperm DNA as kinetin, primarily promotes active Cell Division (Cytokinesis)?",
            listOf("एब्सिसिक एसिड", "साइटोकाइनिन (Cytokinin - जैसे Zeatin)", "ऑक्सिन", "एथिलीन"),
            listOf("Abscisic acid", "Cytokinin (Zeatin / Kinetin)", "Auxin", "Ethylene"),
            1,
            "साइटोकाइनिन (Cytokinin) कोशिका विभाजन को तेज करता है, पत्तियों में बुढ़ापे (जीर्णता / Senescence) को रोकता है और पार्श्व कलिकाओं के विकास को बढ़ावा देता है।",
            "Cytokinins stimulate cell division in developing root and shoot meristems and delay leaf senescence (Richmond-Lang effect).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q3", "sci_5",
            "तनाव हार्मोन (Stress Hormone) और वृद्धि रोधक (Growth Inhibitor) के रूप में कौन-सा पादप हार्मोन जाना जाता है जो सूखे में रंध्रों (Stomata) को बंद करता है?",
            "Which plant hormone is termed the 'Stress Hormone' because it closes stomata during drought and enforces seed dormancy?",
            listOf("जिबरेलिन", "एब्सिसिक अम्ल (Abscisic Acid - ABA)", "ऑक्सिन", "साइटोकाइनिन"),
            listOf("Gibberellin", "Abscisic Acid (ABA / Dormin)", "Auxin", "Cytokinin"),
            1,
            "एब्सिसिक अम्ल (ABA) सूखे या अत्यधिक ठंड की स्थिति में रंध्रों (Stomata) को बंद कर वाष्पोत्सर्जन रोकता है और बीजों को अंकुरित होने से रोककर सुप्तावस्था (Dormancy) बनाए रखता है।",
            "Abscisic acid (ABA) functions as an antitranspirant by closing guard cells in water stress and arresting embryonic germination during dormancy.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q4", "sci_5",
            "बोने पौधों को लंबा करने और बीजों की सुप्तावस्था को तोड़कर अंकुरण (Germination) प्रेरित करने वाला पादप हार्मोन कौन-सा है?",
            "Which plant hormone family, discovered in Japan from the fungus Gibberella fujikuroi ('foolish seedling disease'), causes stem elongation in dwarf plants?",
            listOf("ऑक्सिन", "जिबरेलिन (Gibberellin - GA₃)", "एथिलीन", "एब्सिसिक एसिड"),
            listOf("Auxin", "Gibberellins (Gibberellic Acid - GA₃)", "Ethylene", "Abscisic acid"),
            1,
            "जिबरेलिन (GA₃) पर्व (Internodes) की लंबाई बढ़ाता है, अंगूर के गुच्छों का आकार बड़ा करता है और अल्फा-एमाइलेज एंजाइम को सक्रिय कर बीजों में अंकुरण शुरू करता है।",
            "Gibberellins stimulate internodal stem elongation, promote bolting in rosette plants, and mobilize endosperm starch reserves in germinating cereal seeds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q5", "sci_5",
            "कीटभक्षी पौधे (Insectivorous Plants - जैसे पिक्चर प्लांट / नेपेंथीस, घटपर्णी) उन मिट्टियों में उगते हैं जहां किस तत्व की कमी होती है?",
            "Carnivorous / Insectivorous plants (like Pitcher plant Nepenthes, Venus flytrap, and Drosera) trap insects to supplement their deficiency of which mineral nutrient?",
            listOf("कार्बन", "नाइट्रोजन (Nitrogen - N)", "कैल्शियम", "सोडियम"),
            listOf("Carbon", "Nitrogen (N)", "Calcium", "Sodium"),
            1,
            "कीटभक्षी पौधे दलदली और नाइट्रोजन-विहीन अम्लीय मिट्टी में उगते हैं। वे प्रकाश संश्लेषण तो करते हैं, परन्तु अपनी नाइट्रोजन और अमीनो एसिड की आवश्यकता पूरी करने के लिए कीड़ों को फंसाकर पचाते हैं।",
            "Carnivorous plants photosynthesize normally but derive essential nitrogen and phosphorus compounds by trapping and enzymatically digesting insect prey in nutrient-poor bogs.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q6", "sci_5",
            "मानव शरीर की सबसे बड़ी ग्रंथि (Largest Gland) कौन-सी है जिसका वजन लगभग 1.5 किलोग्राम होता है?",
            "Which is the Largest Gland and primary metabolic/detoxification organ of the human body (weighing ~1.5 kg)?",
            listOf("अग्न्याशय (Pancreas)", "यकृत / लिवर (Liver / Hepar)", "थायराइड", "पीयूष ग्रंथि"),
            listOf("Pancreas", "Liver (Hepar - weighs ~1.4 to 1.6 kg)", "Thyroid", "Pituitary gland"),
            1,
            "यकृत (Liver) मानव शरीर की सबसे बड़ी ग्रंथि और सबसे बड़ा आंतरिक अंग है। यह पित्त रस (Bile juice) बनाता है, यूरिया चक्र चलाता है, ग्लाइकोजन संग्रह करता है और विषैले पदार्थों को निष्प्रभावी करता है।",
            "The Liver is the largest internal gland, executing >500 vital metabolic functions including bile secretion, glycogen storage, plasma protein synthesis, and xenobiotic detoxification.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q7", "sci_5",
            "मानव शरीर का सबसे बड़ा अंग (Largest Organ) कौन-सा है?",
            "What is the single Largest Organ of the entire human body by surface area and weight?",
            listOf("यकृत", "त्वचा (Skin / Integumentary System - वजन ~4-5 किग्रा)", "मस्तिष्क", "बड़ी आंत"),
            listOf("Liver (Largest internal organ)", "Skin (Integumentary organ - surface area ~1.5-2 m²)", "Brain", "Large intestine"),
            1,
            "मानव शरीर का सबसे बड़ा अंग 'त्वचा' (Skin) है जिसका सतही क्षेत्रफल लगभग 1.5 से 2 वर्ग मीटर और वजन 4-5 किलोग्राम होता है। सबसे बड़ा आंतरिक अंग 'यकृत' (Liver) है।",
            "The Skin is the largest organ of the human body, serving as a dynamic barrier for thermoregulation, sensory perception, and pathogen defense.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q8", "sci_5",
            "मानव शरीर की सबसे लंबी और सबसे मजबूत हड्डी (Longest & Strongest Bone) कौन-सी है?",
            "Which is the Longest, Heaviest, and Strongest Bone in the human skeleton?",
            listOf("टिबिया (Tibia)", "फीमर / जांघ की हड्डी (Femur / Thigh Bone)", "ह्यूमरस", "फाइबुला"),
            listOf("Tibia", "Femur (Thigh bone - accounts for ~27% of adult height)", "Humerus", "Fibula"),
            1,
            "जांघ की हड्डी 'फीमर' (Femur) मानव शरीर की सबसे लंबी, सबसे भारी और सबसे मजबूत हड्डी है। यह कंक्रीट से भी अधिक संपीड़न भार सहन कर सकती है।",
            "The Femur (thigh bone) is the longest and mechanically strongest load-bearing bone in the human body, capable of supporting up to 30 times body weight.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q9", "sci_5",
            "मानव शरीर की सबसे छोटी हड्डी (Smallest Bone) कौन-सी है जो मध्य कर्ण (Middle Ear) में स्थित होती है?",
            "Which is the Smallest Bone in the human body (measuring only ~3 mm in length)?",
            listOf("मैलियस (Malleus / Hammer)", "स्टेप्स / स्टेपीज (Stapes / Stirrup in the middle ear)", "इंकस (Incus / Anvil)", "नासास्थि"),
            listOf("Malleus", "Stapes (Stirrup - located in the middle ear tympanic cavity)", "Incus", "Nasal bone"),
            1,
            "मध्य कान में तीन छोटी हड्डियां (श्रवण अस्थियां) होती हैं: मैलियस, इंकस और 'स्टेप्स' (Stapes)। स्टेप्स केवल 3 मिमी लंबी होती है और यह शरीर की सबसे छोटी हड्डी है।",
            "The Stapes (stirrup bone) in the middle ear is the smallest bone in the human body, transmitting acoustic sound vibrations from the incus to the oval window of the cochlea.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q10", "sci_5",
            "मानव कंकाल तंत्र (Adult Human Skeleton) में कुल कितनी अस्थियां (हड्डियां) पाई जाती हैं?",
            "How many total bones are present in the fully developed adult human skeletal framework?",
            listOf("300", "206 (अक्षीय कंकाल: 80, उपांगीय कंकाल: 126)", "208", "250"),
            listOf("300 (Newborn infant bones)", "206 Bones (Axial: 80, Appendicular: 126)", "208", "250"),
            1,
            "वयस्क मानव में 206 हड्डियां होती हैं। नवजात शिशु में लगभग 270 से 300 नरम हड्डियां (उपास्थि युक्त) होती हैं जो बड़े होने पर आपस में जुड़कर (फ्यूज होकर) 206 रह जाती हैं।",
            "The adult human skeleton comprises exactly 206 bones divided into the axial skeleton (80 bones) and appendicular skeleton (126 bones), fused from ~300 infantile bones.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q11", "sci_5",
            "पित्त रस (Bile Juice) का निर्माण कहाँ होता है और इसका संचय (Storage) कहाँ होता है?",
            "Where is alkaline Bile Juice synthesized, and where is it concentrated and stored prior to release into the duodenum?",
            listOf("निर्माण: पित्ताशय में, संचय: यकृत में", "निर्माण: यकृत में (Liver), संचय: पित्ताशय में (Gallbladder)", "निर्माण: अग्न्याशय में, संचय: पेट में", "निर्माण: आंत में, संचय: यकृत में"),
            listOf("Synthesis: Gallbladder, Storage: Liver", "Synthesized in Liver; Stored and concentrated in the Gallbladder (Vesica biliaris)", "Synthesis: Pancreas, Storage: Stomach", "Synthesis: Intestine, Storage: Liver"),
            1,
            "यकृत कोशिकाएं (Hepatocytes) प्रतिदिन 500-1000 मिली पित्त रस बनाती हैं जिसमें कोई पाचक एंजाइम नहीं होता। यह पित्ताशय (Gallbladder) में जमा होता है और वसा के इमल्सीकरण (Emulsification) में मदद करता है।",
            "Bile is continuously synthesized by liver hepatocytes and stored in the Gallbladder, which concentrates bile salts to emulsify dietary lipids in the small intestine.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q12", "sci_5",
            "इंसुलिन (Insulin) हार्मोन मानव शरीर के किस अंग की लैंगरहैंस की द्वीपिकाओं (Islets of Langerhans) की बीटा कोशिकाओं (β-cells) द्वारा स्रावित होता है?",
            "Insulin hormone, essential for regulating blood glucose levels, is secreted by the Beta cells of the Islets of Langerhans in which mixed gland?",
            listOf("यकृत", "अग्न्याशय (Pancreas)", "थायरॉयड", "अधिवृक्क (Adrenal)"),
            listOf("Liver", "Pancreas (Endocrine islets of Langerhans β-cells)", "Thyroid", "Adrenal"),
            1,
            "अग्न्याशय एक मिश्रित ग्रंथि (अंतःस्रावी + बहिःस्रावी) है। इसके अंतःस्रावी भाग की बीटा-कोशिकाएं इंसुलिन स्रावित करती हैं जो रक्त में अतिरिक्त ग्लूकोज को ग्लाइकोजन में बदलता है। इंसुलिन की कमी से डायबिटीज मेलिटस होता है।",
            "Insulin is a peptide hormone produced by pancreatic beta cells that facilitates cellular glucose uptake, lowering blood sugar levels.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q13", "sci_5",
            "रक्त समूह प्रणाली (ABO Blood Group System) और Rh कारक की खोज क्रमशः किसने की थी?",
            "Who discovered the human ABO Blood Groups in 1900 (Nobel Prize 1930) and co-discovered the Rh factor in 1940 with Alexander Wiener?",
            listOf("विलियम हार्वे", "कार्ल लैंडस्टीनर (Karl Landsteiner)", "एडवर्ड जेनर", "लुई पाश्चर"),
            listOf("William Harvey (Discovered blood circulation, 1628)", "Karl Landsteiner", "Edward Jenner", "Louis Pasteur"),
            1,
            "कार्ल लैंडस्टीनर ने 1900 में RBC की सतह पर उपस्थित एंटीजन के आधार पर A, B, O रक्त समूहों की खोज की (AB समूह 1902 में डिकास्टेलो व स्टर्ली ने खोजा)। 1940 में लैंडस्टीनर और वीनर ने रीसस बंदर में Rh कारक खोजा।",
            "Austrian biologist Karl Landsteiner discovered the ABO blood groups in 1900 and later co-discovered the Rhesus (Rh) factor, enabling safe clinical blood transfusions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q14", "sci_5",
            "सर्वदाता रक्त समूह (Universal Blood Donor) और सर्वग्राही रक्त समूह (Universal Blood Recipient) क्रमशः कौन-से हैं?",
            "Which blood types are designated as the Universal Red Cell Donor and Universal Plasma/Red Cell Recipient respectively?",
            listOf("सर्वदाता: AB+, सर्वग्राही: O-", "सर्वदाता: O नेगेटिव (O Negative - O⁻), सर्वग्राही: AB पॉजिटिव (AB Positive - AB⁺)", "सर्वदाता: A+, सर्वग्राही: B+", "सर्वदाता: O+, सर्वग्राही: AB-"),
            listOf("Donor: AB+, Recipient: O-", "Universal Donor: O Negative (O⁻); Universal Recipient: AB Positive (AB⁺)", "Donor: A+, Recipient: B+", "Donor: O+, Recipient: AB-"),
            1,
            "O⁻ रक्त में RBC पर न तो A/B एंटीजन होते हैं और न ही Rh एंटीजन, अतः इसे किसी भी व्यक्ति को सुरक्षित रूप से दिया जा सकता है (सर्वदाता)। AB⁺ के प्लाज्मा में कोई एंटीबॉडी नहीं होती, अतः यह किसी से भी रक्त ले सकता है।",
            "O-negative lacks A, B, and Rh surface antigens, preventing hemolytic transfusion reactions in any recipient. AB-positive lacks plasma anti-A/anti-B antibodies, accepting all RBC types.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m2_q15", "sci_5",
            "लाल रक्त कणिकाओं (RBC - Erythrocytes) का जीवनकाल कितना होता है और इनका कब्रिस्तान (Graveyard of RBCs) किसे कहा जाता है?",
            "What is the average lifespan of human Red Blood Cells (RBCs), and which lymphoid organ is called the 'Graveyard of RBCs'?",
            listOf("10 दिन, यकृत", "120 दिन (120 Days), प्लीहा / तिल्ली (Spleen)", "30 दिन, किडनी", "365 दिन, हृदय"),
            listOf("10 days, Liver", "120 Days; Spleen (Lien / Graveyard & Blood Bank of the body)", "30 days, Kidney", "365 days, Heart"),
            1,
            "RBC का जीवनकाल 120 दिन होता है। पुरानी और क्षत-विक्षत RBC को प्लीहा (Spleen) के मैक्रोफेज द्वारा तोड़ा जाता है, इसलिए प्लीहा को RBC का कब्रिस्तान और शरीर का रक्त बैंक कहते हैं।",
            "Erythrocytes circulate for approximately 120 days before being filtered and destroyed by splenic macrophages in the Spleen.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 3 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m3_q1", "sci_5",
            "श्वेत रक्त कणिकाओं (WBC - Leukocytes) का मुख्य कार्य क्या है?",
            "What is the primary physiological role of White Blood Cells (Leukocytes) in the human body?",
            listOf("ऑक्सीजन का परिवहन", "संक्रमण से लड़ना और प्रतिरक्षा प्रदान करना (Fight Infection and Provide Immunity)", "रक्त का थक्का जमाना", "पोषक तत्वों का वितरण"),
            listOf("Oxygen transport (RBC function)", "Defending against infectious pathogens and foreign antigens (Immune Defense)", "Blood clotting (Platelet function)", "Nutrient distribution"),
            1,
            "WBC को शरीर के 'सैनिक' कहा जाता है। न्यूट्रोफिल और मोनोसाइट जीवाणुओं का भक्षण (Phagocytosis) करते हैं, जबकि लिम्फोसाइट (B और T कोशिकाएं) एंटीबॉडी बनाकर रोगों से सुरक्षा प्रदान करते हैं।",
            "Leukocytes constitute the core cellular defenders of the immune system, eliminating pathogenic microorganisms, foreign antigens, and malignant cells.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q2", "sci_5",
            "रक्त का थक्का जमने (Blood Clotting / Coagulation) में कौन-सी रक्त कोशिकाएं और कौन-सा विटामिन अनिवार्य भूमिका निभाते हैं?",
            "Which blood cellular fragments and which fat-soluble vitamin are essential for biological Hemostasis and blood clot formation?",
            listOf("RBC और विटामिन A", "रक्त प्लेटलेट्स (Thrombocytes) और विटामिन K (Phylloquinone)", "WBC और विटामिन C", "प्लाज्मा और विटामिन D"),
            listOf("RBC and Vitamin A", "Blood Platelets (Thrombocytes) and Vitamin K (Phylloquinone)", "WBC and Vitamin C", "Plasma and Vitamin D"),
            1,
            "प्लेटलेट्स थ्रोम्बोप्लास्टिन मुक्त करती हैं और विटामिन K यकृत में प्रोथ्रोम्बिन व अन्य क्लॉटिंग कारकों (Factors II, VII, IX, X) के निर्माण के लिए आवश्यक है। कैल्शियम आयन (Ca²⁺) भी थक्का बनने के लिए अनिवार्य है।",
            "Platelets aggregate at vascular injury sites, and Vitamin K is a necessary cofactor for hepatic synthesis of clotting factors Prothrombin (Factor II), VII, IX, and X.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q3", "sci_5",
            "रक्त वाहिकाओं के अंदर रक्त को जमने से रोकने वाला प्राकृतिक थक्कारोधी (Natural Anticoagulant) कौन-सा है जो यकृत और मास्ट कोशिकाओं द्वारा बनता है?",
            "Which natural polysaccharide anticoagulant synthesized in the liver and mast cells prevents intravascular blood clotting in healthy blood vessels?",
            listOf("फाइब्रिनोजेन", "हिपेरिन (Heparin)", "थ्रोम्बिन", "ग्लोबुलिन"),
            listOf("Fibrinogen", "Heparin (Potentiates Antithrombin III)", "Thrombin", "Globulin"),
            1,
            "हिपेरिन एक प्राकृतिक थक्कारोधी है जो एंटीथ्रोम्बिन III को सक्रिय करके रक्त वाहिकाओं में रक्त को तरल अवस्था में बनाए रखता है और अनावश्यक थक्के जमने से रोकता है।",
            "Heparin is an endogenous glycosaminoglycan that inhibits thrombin and Factor Xa, preventing pathological thrombosis within the circulatory system.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q4", "sci_5",
            "हृदय की धड़कन (Heartbeat) की गति को नियंत्रित करने वाला प्राकृतिक 'पेसमेकर' (Natural Pacemaker) हृदय के किस भाग में स्थित होता है?",
            "The natural cardiac 'Pacemaker' that rhythmically initiates spontaneous action potentials (~72 bpm) is the:",
            listOf("एवी नोड (AV Node)", "एसए नोड / सिनो-एट्रियल नोड (SA Node - Sinoatrial Node in right atrium)", "बंडल ऑफ हिज", "पुर्किंजे तंतु"),
            listOf("AV Node", "SA Node (Sinoatrial Node located in the upper wall of the right atrium)", "Bundle of His", "Purkinje fibers"),
            1,
            "एसए नोड (SA Node) दाएं आलिंद (Right Atrium) की ऊपरी भित्ति में स्थित विशिष्ट पेशी तंतुओं का समूह है जो स्वतः विद्युत आवेग उत्पन्न कर हृदय गति (औसत 72 धड़कन/मिनट) को संचालित करता है।",
            "The SA (Sinoatrial) Node serves as the primary cardiac pacemaker, generating intrinsic electrical rhythmic impulses that propagate through the conduction system.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q5", "sci_5",
            "एक स्वस्थ वयस्क मनुष्य का सामान्य रक्तचाप (Normal Blood Pressure) कितना होता है?",
            "What is the standard resting arterial Blood Pressure of a healthy adult measured in mmHg?",
            listOf("80/120 mmHg", "120/80 mmHg (सिस्टोलिक 120 mmHg / डायस्टोलिक 80 mmHg)", "140/90 mmHg", "100/60 mmHg"),
            listOf("80/120 mmHg", "120/80 mmHg (Systolic 120 mmHg / Diastolic 80 mmHg)", "140/90 mmHg (Hypertension)", "100/60 mmHg"),
            1,
            "सामान्य रक्तचाप 120/80 mmHg होता है। सिस्टोलिक दाब (120 mmHg) निलय के संकुचन के समय का अधिकतम दाब है और डायस्टोलिक दाब (80 mmHg) निलय के शिथिलन का न्यूनतम दाब है। इसे स्फिग्मोमैनोमीटर से मापते हैं।",
            "Standard normotensive resting arterial pressure is 120 mmHg during ventricular contraction (systole) and 80 mmHg during ventricular relaxation (diastole).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q6", "sci_5",
            "रक्तचाप (Blood Pressure) मापने के लिए किस चिकित्सीय उपकरण का उपयोग किया जाता है?",
            "Which medical diagnostic instrument is used to measure arterial blood pressure using an inflatable cuff and mercury manometer?",
            listOf("स्टेथोस्कोप", "स्फिग्मोमैनोमीटर (Sphygmomanometer)", "इलेक्ट्रोकार्डियोग्राम (ECG)", "थर्मामीटर"),
            listOf("Stethoscope (Auscultation)", "Sphygmomanometer", "Electrocardiogram (ECG)", "Thermometer"),
            1,
            "स्फिग्मोमैनोमीटर (Sphygmomanometer) का आविष्कार सैमुअल सिगफ्रीड कार्ल वॉन बाश ने किया था। यह ब्रैकियल धमनी में पारे के स्तंभ के दबाव द्वारा रक्तचाप को मापता है।",
            "A Sphygmomanometer consists of an inflatable pressure cuff, bulb pump, and manometer used alongside a stethoscope to record Korotkoff sounds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q7", "sci_5",
            "हृदय की विद्युत गतिविधि (Electrical Activity of the Heart) को रिकॉर्ड करने वाले ग्राफिकल टेस्ट को क्या कहते हैं?",
            "What is the clinical diagnostic test that graphically records the electrical waves (P, QRS, T waves) generated by cardiac muscle depolarization?",
            listOf("ईईजी (EEG)", "ईसीजी (ECG - Electrocardiogram / इलेक्ट्रोकार्डियोग्राम)", "ईएमजी (EMG)", "एमआरआई (MRI)"),
            listOf("EEG (Electroencephalogram - Brain)", "ECG / EKG (Electrocardiogram - Heart)", "EMG (Electromyogram - Muscles)", "MRI (Magnetic Resonance Imaging)"),
            1,
            "ईसीजी (ECG) की खोज 1903 में विलेम आइनथोवेन ने की थी (नोबेल 1924)। इसमें P तरंग (आलिंद विद्रवण), QRS कॉम्प्लेक्स (निलय विद्रवण) और T तरंग (निलय पुनर्ध्रुवण) हृदय के कार्य को दर्शाते हैं।",
            "Willem Einthoven invented the Electrocardiogram (ECG/EKG), which maps cardiac voltage vectors over time to diagnose arrhythmias and myocardial infarctions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q8", "sci_5",
            "मस्तिष्क की विद्युत गतिविधि (Brain Wave Activity) को रिकॉर्ड करने वाले टेस्ट को क्या कहते हैं?",
            "Which neurological recording procedure tracks and graphs brain wave electrical oscillations using scalp electrodes?",
            listOf("ईसीजी (ECG)", "ईईजी (EEG - Electroencephalogram / इलेक्ट्रोएन्सेफेलोग्राम)", "एंजियोग्राफी", "सोनोग्राफी"),
            listOf("ECG (Heart)", "EEG (Electroencephalogram - Brain alpha/beta/theta/delta waves)", "Angiography (Blood vessels)", "Sonography (Ultrasound)"),
            1,
            "हंस बर्गर ने 1924 में मानव ईईजी (EEG) की खोज की। यह मिर्गी (Epilepsy), नींद के विकारों और मस्तिष्क मृत्यु की पुष्टि के लिए सेरेब्रल कॉर्टेक्स के न्यूरॉनों के विद्युत संकेतों को रिकॉर्ड करता है।",
            "An Electroencephalogram (EEG) non-invasively monitors neural cortical postsynaptic potentials to evaluate seizures, sleep architecture, and encephalopathies.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q9", "sci_5",
            "मानव मस्तिष्क का कौन-सा भाग ऐच्छिक पेशी गतियों के समन्वय, शरीर के संतुलन (Posture & Balance) और मांसपेशियों के टोन को नियंत्रित करता है?",
            "Which anatomical subdivision of the Hindbrain coordinates voluntary muscle synchrony, posture, and motor equilibrium?",
            listOf("प्रमस्तिष्क (Cerebrum)", "अनुमस्तिष्क / सेरिबेलम (Cerebellum / Little Brain)", "मेडुला ऑबलांगाटा", "हाइपोथैलेमस"),
            listOf("Cerebrum", "Cerebellum (Little Brain - maintains equilibrium and precise motor coordination)", "Medulla oblongata", "Hypothalamus"),
            1,
            "सेरिबेलम (अनुमस्तिष्क) शरीर के संतुलन, चलने-दौड़ने और मोटर समन्वय को नियंत्रित करता है। अत्यधिक शराब पीने पर सेरिबेलम प्रभावित होता है जिससे व्यक्ति लड़खड़ाकर चलता है।",
            "The Cerebellum ('little brain') integrates sensory proprioceptive inputs to fine-tune voluntary motor skills, balance, and gait cadence.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q10", "sci_5",
            "मानव मस्तिष्क का सबसे बड़ा और सबसे विकसित भाग कौन-सा है जो स्मृति, बुद्धिमत्ता, चेतना और तर्कशक्ति का केंद्र है?",
            "Which is the Largest and most rostral region of the human brain (~80% of total brain mass), serving as the center for intellect, memory, and conscious thought?",
            listOf("सेरिबेलम", "प्रमस्तिष्क / सेरेब्रम (Cerebrum / Forebrain)", "मेडुला", "थैलेमस"),
            listOf("Cerebellum", "Cerebrum (Telencephalon / Cerebral Cortex)", "Medulla", "Thalamus"),
            1,
            "प्रमस्तिष्क (Cerebrum) अग्र-मस्तिष्क का मुख्य भाग है। इसके कॉर्टेक्स में संवेदी क्षेत्र, प्रेरक क्षेत्र और साहचर्य क्षेत्र (Association areas) होते हैं जो सीखने, सोचने, भाषा और याददाश्त को नियंत्रित करते हैं।",
            "The Cerebrum directs higher-order cognitive processing including sensory integration, reasoning, planning, language formulation, and voluntary movement.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q11", "sci_5",
            "मानव शरीर का तापमान (Thermoregulation), भूख, प्यास, नींद और भावनाओं को नियंत्रित करने वाला मस्तिष्क का मुख्य केंद्र कौन-सा है?",
            "Which critical diencephalic brain structure acts as the body's 'Thermostat' and regulates Hunger, Thirst, Satiety, Circadian Rhythms, and Pituitary gland secretion?",
            listOf("सेरिबेलम", "हाइपोथैलेमस (Hypothalamus - Body Thermostat)", "मेडुला ऑबलांगाटा", "पोंस"),
            listOf("Cerebellum", "Hypothalamus (Central homeostatic control regulator)", "Medulla oblongata", "Pons"),
            1,
            "हाइपोथैलेमस तंत्रिका तंत्र और अंतःस्रावी तंत्र के बीच का मुख्य सेतु है। यह शरीर का तापमान 37°C पर स्थिर रखता है, भूख-प्यास के केंद्र चलाता है और पीयूष ग्रंथि के हार्मोन स्राव को नियंत्रित करता है।",
            "The Hypothalamus maintains neuroendocrine homeostasis, regulating core body temperature, fluid osmolarity, feeding behavior, and pituitary releasing hormones.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q12", "sci_5",
            "हृदय गति, श्वास दर, रक्तचाप, निगलना और उल्टी (Vomiting) जैसी अनैच्छिक क्रियाओं (Involuntary Functions) को मस्तिष्क का कौन-सा भाग नियंत्रित करता है?",
            "Which lower brainstem center controls vital autonomic involuntary functions including Respiration rate, Vasomotor tone, Cardiac rhythm, and Swallowing/Vomiting reflexes?",
            listOf("सेरेब्रम", "मेडुला ऑबलांगाटा (Medulla Oblongata)", "सेरिबेलम", "थैलेमस"),
            listOf("Cerebrum", "Medulla Oblongata (Myelencephalon brainstem core)", "Cerebellum", "Thalamus"),
            1,
            "मेडुला ऑबलांगाटा मस्तिष्क का सबसे निचला भाग है जो मेरुरज्जु (Spinal cord) से जुड़ता है। इसमें श्वसन केंद्र, हृदय केंद्र, वैसोमोटर केंद्र और उल्टी, छींकने व खांसने के प्रतिवर्ती केंद्र होते हैं।",
            "The Medulla Oblongata houses vital autonomic centers governing cardiac output, arterial pressure, pulmonary ventilation, and gastrointestinal reflex arcs.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q13", "sci_5",
            "मानव शरीर की 'मास्टर ग्रंथि' (Master Gland) किस अंतःस्रावी ग्रंथि को कहा जाता है?",
            "Which pea-sized endocrine gland located in the sella turcica of the sphenoid bone is historically termed the 'Master Gland' of the endocrine system?",
            listOf("थायरॉयड ग्रंथि", "पीयूष ग्रंथि / पिट्यूटरी ग्रंथि (Pituitary Gland / Hypophysis)", "अग्न्याशय", "अधिवृक्क ग्रंथि"),
            listOf("Thyroid gland", "Pituitary Gland (Hypophysis cerebri)", "Pancreas", "Adrenal gland"),
            1,
            "पीयूष ग्रंथि (Pituitary) अन्य सभी अंतःस्रावी ग्रंथियों (थायरॉयड, एड्रिनल, गोनाड्स) के स्राव को नियंत्रित करने वाले ट्रॉपिक हार्मोन (TSH, ACTH, FSH, LH, GH) छोड़ती है। इसे स्वयं हाइपोथैलेमस नियंत्रित करता है।",
            "The Pituitary Gland secretes tropic hormones orchestrating thyroid, adrenal cortex, and gonadal activities under hypothalamic neurohormonal guidance.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q14", "sci_5",
            "मानव शरीर की सबसे छोटी अंतःस्रावी ग्रंथि कौन-सी है जो मेलाटोनिन (Melatonin) हार्मोन स्रावित कर जैविक घड़ी (Circadian / Sleep-Wake Cycle) को नियंत्रित करती है?",
            "Which tiny pinecone-shaped endocrine gland in the epithalamus secretes Melatonin to regulate the 24-hour Circadian Sleep-Wake Cycle?",
            listOf("थाइमस", "पीनियल ग्रंथि (Pineal Gland / Third Eye)", "थायरॉयड", "अधिवृक्क"),
            listOf("Thymus", "Pineal Gland (Epiphysis cerebri - secretes Melatonin)", "Thyroid", "Adrenal"),
            1,
            "पीनियल ग्रंथि (Pineal Gland) केवल 5-8 मिमी लंबी होती है। यह अंधकार में 'मेलाटोनिन' हार्मोन स्रावित करती है जो नींद लाने और 24 घंटे के जैविक चक्र को नियंत्रित करता है।",
            "The Pineal Gland synthesizes and secretes Melatonin in response to darkness, transducing photoperiodic signals to govern circadian rhythms.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m3_q15", "sci_5",
            "'करो या मरो' (Fight or Flight) और आपातकालीन हार्मोन (Emergency Hormone) किसे कहा जाता है जो तनाव में हृदय गति और रक्तचाप को तुरंत बढ़ा देता है?",
            "Which catecholamine hormone secreted by the Adrenal Medulla is known as the 'Emergency Hormone' or 'Fight-or-Flight Hormone'?",
            listOf("इंसुलिन", "एड्रेनालिन / एपिनेफ्रीन (Adrenaline / Epinephrine)", "थायरॉक्सिन", "ग्लूकागन"),
            listOf("Insulin", "Adrenaline / Epinephrine (Secreted by Adrenal Medulla)", "Thyroxine", "Glucagon"),
            1,
            "संकट, भय या गुस्से की स्थिति में एड्रिनल मेडुला से एड्रेनालिन स्रावित होता है। यह पुतलियों को फैलाता है, हृदय गति, श्वसन दर, रक्तचाप और रक्त शर्करा को तेजी से बढ़ाकर शरीर को आपात स्थिति के लिए तैयार करता है।",
            "Adrenaline (Epinephrine) stimulates sympathetic alpha and beta-adrenergic receptors, elevating cardiac output, blood glucose, and skeletal muscle blood perfusion during acute stress.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 4 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m4_q1", "sci_5",
            "थायरॉयड ग्रंथि (Thyroid Gland) द्वारा थायरॉक्सिन (T₄) हार्मोन के निर्माण के लिए भोजन में किस सूक्ष्म खनिज तत्व की अनिवार्यता होती है?",
            "Which essential dietary trace halogen element is chemically required by the Thyroid Gland to synthesize Thyroxine (T₄) and Triiodothyronine (T₃)?",
            listOf("लोहा", "आयोडीन (Iodine - I)", "कैल्शियम", "सोडियम"),
            listOf("Iron", "Iodine (Essential for T₄/T₃ iodination)", "Calcium", "Sodium"),
            1,
            "भोजन में आयोडीन की कमी से थायरॉयड ग्रंथि थायरॉक्सिन नहीं बना पाती और TSH के अत्यधिक स्राव से फूलकर बड़ी हो जाती है, जिसे गलगंड या घेंघा रोग (Simple Goitre) कहते हैं।",
            "Iodine is covalently incorporated into tyrosine residues of thyroglobulin. Dietary iodine deficiency causes compensatory thyroid hyperplasia, manifesting as Goitre.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q2", "sci_5",
            "वृक्क (Kidney / गुर्दे) की संरचनात्मक और कार्यात्मक सूक्ष्म इकाई (Structural & Functional Unit) क्या है?",
            "What is the microscopic structural and functional filtration unit of the human Kidney (~1 million per kidney)?",
            listOf("न्यूरॉन (Neuron)", "नेफ्रॉन (Nephron / वृक्काणु)", "एल्वियोली (Alveoli)", "हेपेटोसाइट"),
            listOf("Neuron (Nervous system unit)", "Nephron (Renal functional filtration unit)", "Alveoli (Respiratory unit)", "Hepatocyte (Liver cell)"),
            1,
            "प्रत्येक गुर्दे में लगभग 10 से 12 लाख सूक्ष्म 'नेफ्रॉन' (Nephron) होते हैं। इसमें बोमन कैप्सूल, ग्लोमेरुलस और वृक्कीय नलिकाएं होती हैं जो रक्त को छानकर मूत्र (Urine) का निर्माण करती हैं।",
            "Each kidney contains ~1 to 1.2 million Nephrons, comprising a renal corpuscle (glomerulus and Bowman's capsule) and renal tubule system executing ultrafiltration and selective reabsorption.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q3", "sci_5",
            "तंत्रिका तंत्र (Nervous System) की संरचनात्मक और कार्यात्मक इकाई क्या है जो शरीर की सबसे लंबी कोशिका है?",
            "What is the basic structural, functional, and electrical signaling unit of the Human Nervous System (and the longest cell in the body)?",
            listOf("नेफ्रॉन", "न्यूरॉन / तंत्रिका कोशिका (Neuron / Nerve Cell)", "मायोसाइट", "ओस्टियोसाइट"),
            listOf("Nephron (Kidney)", "Neuron / Nerve Cell (Axon, dendrites, and soma)", "Myocyte (Muscle)", "Osteocyte (Bone)"),
            1,
            "न्यूरॉन (Neuron) तंत्रिका तंत्र की मूल इकाई है और यह शरीर की सबसे लंबी कोशिका है (1 मीटर तक लंबी)। यह विद्युत-रासायनिक आवेगों (Action potentials) के रूप में सूचनाओं का संचरण करती है।",
            "Neurons are specialized excitable cells comprising a cell soma, dendrites, and an axon, propagating bioelectrical nerve impulses across synaptic junctions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q4", "sci_5",
            "फेफड़ों (Lungs) की गैसीय विनिमय (Gas Exchange: O₂ और CO₂) करने वाली सूक्ष्म संरचनात्मक इकाई क्या है?",
            "What are the tiny microscopic balloon-like sacs in the human lungs where respiratory gas exchange (O₂ uptake and CO₂ release) takes place?",
            listOf("ब्रोंकिओल्स", "एल्वियोली / कूपिकाएं (Alveoli - ~300-500 million sacs)", "नेफ्रॉन", "प्लूरल गुहा"),
            listOf("Bronchioles", "Alveoli (Pulmonary air sacs with ~70-100 m² surface area)", "Nephrons", "Pleural cavity"),
            1,
            "फेफड़ों में लगभग 30-50 करोड़ सूक्ष्म कूपिकाएं (Alveoli) होती हैं। इनकी पतली भित्ति के चारों ओर केशिकाओं का जाल होता है जहां विसरण (Diffusion) द्वारा O₂ रक्त में और CO₂ हवा में जाती है।",
            "Alveoli are thin-walled, surfactant-lined pulmonary terminal sacs providing ~100 m² of surface area for passive capillary gas exchange.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q5", "sci_5",
            "मानव मूत्र (Urine) का विशिष्ट हल्का पीला रंग किस वर्णक (Pigment) की उपस्थिति के कारण होता है?",
            "The characteristic pale yellow straw color of normal human urine is attributed to the presence of which urobilin breakdown pigment?",
            listOf("बिलीरुबिन", "यूरोक्रोम / यूरोबिलिन (Urochrome / Urobilin - from hemoglobin degradation)", "बिलीवर्डीन", "मेलेनिन"),
            listOf("Bilirubin", "Urochrome / Urobilin (End-product of heme bile pigment catabolism)", "Biliverdin", "Melanin"),
            1,
            "यूरोक्रोम (यूरोबिलिन) पुरानी लाल रक्त कोशिकाओं के हीमोग्लोबिन के टूटने से बनता है। जब हीम टूटकर पित्त वर्णक (बिलीरुबिन) बनाता है, तो उसका कुछ भाग मूत्र में यूरोक्रोम के रूप में उत्सर्जित होता है।",
            "Urochrome (urobilin) is a linear tetrapyrrole pigment generated from hepatic and intestinal degradation of heme, responsible for standard yellow urine pigmentation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q6", "sci_5",
            "गुर्दे की पथरी (Kidney Stones / Renal Calculi) मुख्य रूप से किस अघुलनशील रासायनिक क्रिस्टल के जमाव से बनती है?",
            "Approximately 80% of clinical Kidney Stones are hard mineral crystalline aggregations composed primarily of:",
            listOf("सोडियम क्लोराइड", "कैल्शियम ऑक्सालेट (Calcium Oxalate - CaC₂O₄)", "कैल्शियम कार्बोनेट", "पोटेशियम नाइट्रेट"),
            listOf("Sodium chloride", "Calcium Oxalate (CaC₂O₄·H₂O)", "Calcium carbonate", "Potassium nitrate"),
            1,
            "गुर्दे की पथरी मुख्य रूप से कैल्शियम ऑक्सालेट (CaC₂O₄) और कुछ मामलों में यूरिक एसिड या कैल्शियम फॉस्फेट के क्रिस्टलीकरण से बनती है। टमाटर, पालक आदि में ऑक्सालेट की मात्रा अधिक होती है।",
            "Renal calculi develop when urine becomes supersaturated with Calcium Oxalate (CaC₂O₄), precipitating into sharp painful crystalline stones in renal calyces.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q7", "sci_5",
            "मानव आंख में किसी वस्तु का वास्तविक और उल्टा प्रतिबिम्ब (Real and Inverted Image) किस आंतरिक प्रकाश-संवेदी परत पर बनता है?",
            "In the human eye, light rays refracted by the cornea and crystalline lens focus to form an inverted real image on which innermost neural photosensitive layer?",
            listOf("कॉर्निया", "रेटिना / दृष्टिपटल (Retina - containing Rods and Cones)", "आइरिस", "पुतली"),
            listOf("Cornea", "Retina (Sensory neural tunic hosting photoreceptors)", "Iris", "Pupil"),
            1,
            "रेटिना आंख के पिछले भाग में स्थित प्रकाश-संवेदी पर्दा है जिसमें शलाकाएं (Rods - कम प्रकाश के लिए) और शंकु (Cones - रंग दृष्टि के लिए) कोशिकाएं होती हैं। ऑप्टिक तंत्रिका इस छवि को मस्तिष्क तक पहुंचाती है।",
            "The Retina functions like photographic film, converting focused photon patterns via rhodopsin/photopsin into nerve action potentials sent to the visual cortex.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q8", "sci_5",
            "नेत्रदान (Eye Donation) में दाता की आंख का कौन-सा पारदर्शी भाग प्रत्यारोपित (Transplant) किया जाता है?",
            "In clinical corneal keratoplasty (Eye Donation), which transparent anterior layer of the donor's eyeball is surgically transplanted?",
            listOf("पूरी आंख", "कॉर्निया / स्वच्छमंडल (Cornea - Avascular tissue)", "रेटिना", "लेंस"),
            listOf("Whole eyeball", "Cornea (Transparent anterior avascular fibrous layer)", "Retina", "Crystalline Lens"),
            1,
            "नेत्रदान में केवल पारदर्शी 'कॉर्निया' का प्रत्यारोपण किया जाता है। कॉर्निया में कोई रक्त वाहिकाएं नहीं होतीं (यह अश्रु और जलीय द्रव से पोषण लेती है), इसलिए प्रतिरक्षा अस्वीकृति (Graft rejection) का खतरा न्यूनतम होता है।",
            "Corneal transplantation (Keratoplasty) grafts the transparent Cornea. Being completely avascular, the cornea exhibits high immune privilege and minimal rejection rates.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q9", "sci_5",
            "निकट दृष्टि दोष (Myopia / Short-sightedness) में वस्तु का प्रतिबिम्ब कहाँ बनता है और इसके निवारण के लिए किस लेंस का उपयोग किया जाता है?",
            "In Myopia (Nearsightedness), where is the image formed, and which corrective spectacle lens is prescribed?",
            listOf("रेटिना के पीछे, उत्तल लेंस", "रेटिना के आगे (In front of Retina), अवतल लेंस (Concave Lens / Diverging lens)", "रेटिना पर, समतल लेंस", "रेटिना के पीछे, बेलनाकार लेंस"),
            listOf("Behind retina, Convex lens", "In front of Retina; corrected with a Concave (Diverging) Lens", "On retina, Flat lens", "Behind retina, Cylindrical lens"),
            1,
            "मायोपिया में नेत्रगोलक लंबा होने से दूर की वस्तुओं का प्रतिबिम्ब रेटिना के पहले ही बन जाता है। अवतल लेंस (Concave lens) प्रकाश किरणों को अपसारित करके प्रतिबिम्ब को ठीक रेटिना पर केंद्रित करता है।",
            "In axial myopia, light rays converge anterior to the retinal plane. A concave diverging lens spreads incident rays so the focal point shifts back onto the retina.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q10", "sci_5",
            "दूर दृष्टि दोष (Hypermetropia / Long-sightedness) के निवारण के लिए किस लेंस का चश्मा लगाया जाता है?",
            "In Hypermetropia (Farsightedness), where distant objects are clear but near objects appear blurred, which corrective lens is used?",
            listOf("अवतल लेंस", "उत्तल लेंस (Convex Lens / Converging lens)", "बेलनाकार लेंस", "द्विफोकसी लेंस"),
            listOf("Concave lens", "Convex Lens (Converging lens focusing rays forward onto retina)", "Cylindrical lens (Astigmatism)", "Bifocal lens (Presbyopia)"),
            1,
            "हाइपरमेट्रोपिया में पास की वस्तुओं की किरणें रेटिना के पीछे केंद्रित होती हैं। उत्तल लेंस (Convex lens) अतिरिक्त अभिसारी शक्ति प्रदान कर प्रकाश को रेटिना पर केंद्रित करता है।",
            "Hyperopia causes close images to focus behind the retina due to a short axial eye globe. A convex converging lens increases refractive power to project images precisely onto the retina.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q11", "sci_5",
            "जरा-दृष्टि दोष (Presbyopia / बुढ़ापे में निकट दृष्टि में कमी) के निवारण के लिए किस प्रकार के लेंस का उपयोग किया जाता है?",
            "Presbyopia, the age-related loss of accommodation due to rigidification of the ciliary muscles and crystalline lens, is corrected using:",
            listOf("अवतल लेंस", "द्विफोकसी लेंस (Bifocal Lens - ऊपरी भाग अवतल, निचला भाग उत्तल)", "उत्तल लेंस", "बेलनाकार लेंस"),
            listOf("Concave lens", "Bifocal Lens (Upper segment Concave for distance, lower segment Convex for reading)", "Convex lens only", "Cylindrical lens"),
            1,
            "40-45 वर्ष की आयु के बाद सिलियरी मांसपेशियों के कमजोर होने से आंख की समंजन क्षमता घट जाती है। बेंजामिन फ्रैंकलिन द्वारा आविष्कृत 'द्विफोकसी लेंस' (Bifocal Lens) में ऊपर दूर दृष्टि और नीचे पढ़ने का लेंस होता है।",
            "Bifocal spectacles combine an upper diverging concave section for distance viewing with a lower convex segment for near reading tasks.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q12", "sci_5",
            "अबिंदुकता (Astigmatism / कॉर्निया की वक्रता में असमानता) के निवारण के लिए किस लेंस का उपयोग किया जाता है?",
            "Astigmatism, a refractive defect caused by asymmetrical curvature of the cornea or crystalline lens, is optically corrected using a:",
            listOf("उत्तल लेंस", "बेलनाकार लेंस (Cylindrical Lens)", "अवतल लेंस", "समतल लेंस"),
            listOf("Convex lens", "Cylindrical Lens (Toric lens correcting meridian focal differences)", "Concave lens", "Plano lens"),
            1,
            "अबिंदुकता में कॉर्निया की वक्रता क्षैतिज और ऊर्ध्वाधर दिशाओं में अलग-अलग हो जाती है, जिससे व्यक्ति को क्षैतिज व ऊर्ध्वाधर रेखाएं एक साथ स्पष्ट नहीं दिखतीं। इसे बेलनाकार (Cylindrical) लेंस से ठीक किया जाता है।",
            "Astigmatism prevents light from focusing at a single point on the retina. Cylindrical (toric) lenses have varying curvature power across perpendicular meridians to eliminate distortion.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q13", "sci_5",
            "मोतियाबिंद (Cataract) रोग में आंख का कौन-सा भाग अपारदर्शी या धुंधला (Cloudy / Opaque) हो जाता है?",
            "In Cataract, which refractive structure of the human eye undergoes progressive protein denaturing and opacification, leading to vision loss?",
            listOf("कॉर्निया", "प्राकृतिक क्रिस्टलीय लेंस (Natural Crystalline Lens)", "रेटिना", "पुतली"),
            listOf("Cornea", "Crystalline Lens (Replaced by artificial Intraocular Lens - IOL)", "Retina", "Pupil"),
            1,
            "मोतियाबिंद में लेंस के क्रिस्टलिन प्रोटीन गुच्छों में बदलकर जम जाते हैं, जिससे लेंस धुंधला हो जाता है। फेकोइमल्सीफिकेशन सर्जरी द्वारा अपारदर्शी लेंस को हटाकर कृत्रिम इंट्राओकुलर लेंस (IOL) लगाया जाता है।",
            "Cataracts occur when crystallin proteins within the natural crystalline lens aggregate and scatter light. Phacoemulsification surgery replaces it with a synthetic Intraocular Lens (IOL).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q14", "sci_5",
            "काला मोतिया या ग्लूकोमा (Glaucoma) आंख के अंदर किस द्रव के दबाव (Intraocular Pressure - IOP) के बढ़ने के कारण ऑप्टिक तंत्रिका को नष्ट करता है?",
            "Glaucoma ('silent thief of sight') causes progressive optic nerve damage primarily due to pathological elevation of fluid pressure inside the eye, termed:",
            listOf("रक्तचाप", "अंतःनेत्र दाब (Intraocular Pressure - IOP due to excess Aqueous Humor fluid)", "वायुमंडलीय दाब", "मस्तिष्क दाब"),
            listOf("Blood pressure", "Intraocular Pressure (IOP > 21 mmHg due to poor Aqueous Humor drainage)", "Atmospheric pressure", "Intracranial pressure"),
            1,
            "नेत्र के अग्र कक्ष में 'एक्वस ह्यूमर' (Aqueous humor) द्रव का निकास मार्ग (Trabecular meshwork) अवरुद्ध होने पर इंट्राओकुलर दबाव (IOP) बढ़ जाता है, जिससे ऑप्टिक तंत्रिका के तंतु नष्ट होकर स्थायी अंधापन आ सकता है।",
            "Impaired outflow of aqueous humor through the canal of Schlemm elevates intraocular pressure (IOP), irreversibly damaging retinal ganglion cells and optic nerve axons.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m4_q15", "sci_5",
            "रतौंधी (Night Blindness / Nyctalopia) किस विटामिन की कमी के कारण होती है जिसमें रेटिना की रॉड (Rod) कोशिकाओं में रोडोप्सिन नहीं बन पाता?",
            "Night Blindness (Nyctalopia) is caused by a dietary deficiency of which fat-soluble vitamin, preventing the synthesis of the visual pigment Rhodopsin?",
            listOf("विटामिन C", "विटामिन A (Retinol / Retinal)", "विटामिन D", "विटामिन K"),
            listOf("Vitamin C", "Vitamin A (Retinol / 11-cis-retinal forming Rhodopsin in rod cells)", "Vitamin D", "Vitamin K"),
            1,
            "विटामिन A (रेटिनॉल) आंख के रेटिना में प्रकाश-ग्राही वर्णक 'रोडोप्सिन' (विजुअल पर्पल) का अनिवार्य घटक है। इसकी कमी से मंद प्रकाश में रॉड कोशिकाएं काम नहीं करतीं जिससे रतौंधी और आंखों का सूखना (जेरोफ्थैल्मिया) होता है।",
            "Vitamin A deficiency depletes retinaldehyde chromophores required to regenerate Rhodopsin in retinal rod cells, causing impaired scotopic night vision and Xerophthalmia.",
            "Easy"
        )
    )
}
