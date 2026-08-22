package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic8Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1: Bacterial Diseases & Pathogens (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m1_q1", "sci_8",
            "तपेदिक (Tuberculosis / TB / क्षय रोग) किस जीवाणु (Bacteria) के संक्रमण से होता है?",
            "Which bacterium is the causative pathogenic agent responsible for Pulmonary Tuberculosis (TB) in humans?",
            listOf("विब्रियो कोलेरी", "माइकोबैक्टीरियम ट्यूबरकुलोसिस (Mycobacterium tuberculosis)", "साल्मोनेला टाइफी", "क्लोस्ट्रीडियम टिटैनी"),
            listOf("Vibrio cholerae", "Mycobacterium tuberculosis (Acid-fast rod-shaped bacillus discovered by Robert Koch in 1882)", "Salmonella typhi", "Clostridium tetani"),
            1,
            "टीबी रोग 'माइकोबैक्टीरियम ट्यूबरकुलोसिस' जीवाणु से होता है, जिसकी खोज 1882 में रॉबर्ट कोच ने की थी। यह मुख्य रूप से फेफड़ों को प्रभावित करता है और हवा (Droplet infection) द्वारा फैलता है।",
            "Mycobacterium tuberculosis is an obligate aerobe that primarily infects human alveolar macrophages, causing granulomatous inflammation and pulmonary cavitations.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q2", "sci_8",
            "टायफाइड (मियादी बुखार / Typhoid Fever) की पुष्टि और नैदानिक परीक्षण हेतु कौन-सा प्रसिद्ध सीरोलॉजिकल टेस्ट किया जाता है?",
            "Which diagnostic serological laboratory test is universally utilized to confirm clinical infection of Typhoid (Enteric Fever)?",
            listOf("एलिसा टेस्ट (ELISA)", "विडाल टेस्ट (Widal Test)", "मोंटू टेस्ट (Mantoux Test)", "वेस्टर्न ब्लॉट"),
            listOf("ELISA Test (for HIV)", "Widal Test (Agglutination test detecting O and H antibodies against Salmonella typhi)", "Mantoux Tuberculin Skin Test", "Western Blot"),
            1,
            "विडाल टेस्ट (Widal Test) साल्मोनेला टाइफी जीवाणु के विरुद्ध शरीर में बने एंटीबॉडीज (O एवं H एंटीजन) की जांच करता है। टायफाइड दूषित जल और भोजन (Fecal-oral route) से फैलता है।",
            "The Widal test measures agglutinating antibody titers against Salmonella enterica serotype typhi lipopolysaccharide (O) and flagellar (H) antigens in human serum.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q3", "sci_8",
            "हैजा (Cholera) रोग किस कॉमा (Comma) के आकार वाले जीवाणु के संक्रमण से होता है?",
            "Which comma-shaped, gram-negative, highly motile bacterium causes acute watery diarrhoeal infection known as Cholera?",
            listOf("विब्रियो कोलेरी (Vibrio cholerae)", "बैसिलस एन्थ्रेसिस", "स्टैफिलोकोकस", "स्ट्रेप्टोकोकस न्यूमोनी"),
            listOf("Vibrio cholerae (Produces enterotoxin CTX causing massive rice-water stools)", "Bacillus anthracis", "Staphylococcus aureus", "Streptococcus pneumoniae"),
            0,
            "हैजा 'विब्रियो कोलेरी' जीवाणु द्वारा दूषित जल और भोजन से फैलता है। इस रोग में अत्यधिक निर्जलीकरण (Dehydration) और चावल के पानी जैसा दस्त (Rice-water stool) होता है।",
            "Vibrio cholerae colonizes the small intestinal mucosa and secretes cholera enterotoxin, which irreversibly stimulates adenylate cyclase leading to catastrophic electrolyte and water loss.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q4", "sci_8",
            "टिटनेस (Tetanus / धनुस्तंभ / Lockjaw) रोग किस जीवाणु के विषैले टॉक्सिन (Tetanospasmin) के कारण होता है?",
            "Tetanus (characterized by painful muscle spasms and trismus/lockjaw) is caused by the neurotoxin of which anaerobic spore-forming bacterium?",
            listOf("क्लोस्ट्रीडियम टिटैनी (Clostridium tetani)", "कोरीनेबैक्टीरियम डिफ्थीरिया", "ट्रेपोनेमा पैलिडम", "बोरेलिया"),
            listOf("Clostridium tetani (Produces potent neurotoxin tetanospasmin blocking inhibitory GABA/glycine neurotransmitters)", "Corynebacterium diphtheriae", "Treponema pallidum", "Borrelia burgdorferi"),
            0,
            "टिटनेस 'क्लोस्ट्रीडियम टिटैनी' के बीजाणुओं (Spores) द्वारा जंग लगे लोहे या मिट्टी से कटे घाव में प्रवेश करने से होता है। इसका टॉक्सिन 'टिटैनोस्पास्मिन' मांसपेशियों में स्थायी संकुचन (Lockjaw) उत्पन्न करता है।",
            "Clostridium tetani is an anaerobic bacterium whose spores germinate in deep puncture wounds, producing tetanospasmin which blocks inhibitory synaptic transmission in the central nervous system.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q5", "sci_8",
            "डिफ्थीरिया (गलघोंटू / Diphtheria) रोग मानव शरीर के किस अंग को मुख्य रूप से प्रभावित करता है?",
            "Which anatomical structure is primarily damaged by Corynebacterium diphtheriae, forming a thick grey pseudomembrane that obstructs breathing?",
            listOf("यकृत (Liver)", "गला / श्वसन नली (Throat / Pharynx / Trachea)", "गुर्दे (Kidneys)", "आंतें (Intestines)"),
            listOf("Liver", "Throat / Upper Respiratory Tract (Pharynx, tonsils, larynx creating asphyxiating pseudomembrane)", "Kidneys", "Intestines"),
            1,
            "डिफ्थीरिया (Corynebacterium diphtheriae) गले, टॉन्सिल और श्वासनली में एक धूसर कृत्रिम झिल्ली (Pseudomembrane) बना देता है, जिससे सांस लेने में कठिनाई होती है और दम घुटने लगता है।",
            "Corynebacterium diphtheriae produces diphtheria toxin which halts protein synthesis via EF-2 ADP-ribosylation, leading to necrotic mucosal pseudomembrane formation over the tonsils and larynx.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q6", "sci_8",
            "कुष्ठ रोग (Leprosy / हैंसन का रोग / Hansen's Disease) किस जीवाणु के संक्रमण से होता है?",
            "Leprosy, chronic granulomatous disease of peripheral nerves and skin (also known as Hansen's Disease), is caused by:",
            listOf("माइकोबैक्टीरियम लेप्री (Mycobacterium leprae)", "बैसिलस सबटिलिस", "स्यूडोमोनास", "माइकोप्लाज्मा"),
            listOf("Mycobacterium leprae (Acid-fast bacillus with tropism for Schwann cells, identified by Gerhard Hansen in 1873)", "Bacillus subtilis", "Pseudomonas aeruginosa", "Mycoplasma pneumoniae"),
            0,
            "कुष्ठ रोग 'माइकोबैक्टीरियम लेप्री' (खोजकर्ता: गेरहार्ड हैंसन, 1873) द्वारा होता है। यह तंत्रिकाओं (Schwann cells) और त्वचा को सुन्न और विकृत कर देता है। इसके उपचार हेतु MDT (मल्टी-ड्रग थेरेपी) दी जाती है।",
            "Mycobacterium leprae exhibits specific affinity for peripheral nerve Schwann cells and macrophage histiocytes, causing sensory anesthesia, skin hypopigmented patches, and motor deformities.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q7", "sci_8",
            "प्लेग (Plague / काली मौत / Black Death) रोग का जीवाणु 'यर्सिनिया पेस्टिस' किस कीट/पिस्सू के काटने से मानव में फैलता है?",
            "Plague (Black Death) caused by bacterium Yersinia pestis is vectorially transmitted from infected rodents to humans primarily via which flea?",
            listOf("तितली", "जीनोप्सिला चियोपिस / चूहे का पिस्सू (Xenopsylla cheopis / Rat Flea)", "सैंडफ्लाई", "सीसी मक्खी"),
            listOf("Butterfly", "Xenopsylla cheopis (Oriental Rat Flea vector)", "Phlebotomus sandfly", "Glossina tsetse fly"),
            1,
            "प्लेग (Yersinia pestis) चूहों के ऊपर परजीवी 'ओरिएंटल रैट पिस्सू' (Xenopsylla cheopis) के काटने से मनुष्यों में फैलता है। इसके तीन प्रकार होते हैं: ब्यूबोनिक प्लेग, न्यूमोनिक प्लेग और सेप्टीसीमिया प्लेग।",
            "Yersinia pestis is a zoonotic gram-negative coccobacillus transmitted via the bite of Xenopsylla cheopis fleas feeding on infected Rattus rattus rodents, causing necrotic lymphadenitis (buboes).",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q8", "sci_8",
            "काली खांसी (Whooping Cough / कुक्कुर खांसी / Pertussis) किस जीवाणु द्वारा उत्पन्न होती है?",
            "Whooping cough (Pertussis), an acute childhood respiratory tract infection marked by paroxysmal coughing spasms ending in a high-pitched 'whoop', is caused by:",
            listOf("बोर्डेटेला परट्यूसिस (Bordetella pertussis)", "स्ट्रेप्टोकोकस", "हेलिकोबैक्टर पाइलोरी", "लैक्टोबैसिलस"),
            listOf("Bordetella pertussis (Gram-negative coccobacillus producing pertussis toxin and tracheal cytotoxin)", "Streptococcus pyogenes", "Helicobacter pylori", "Lactobacillus acidophilus"),
            0,
            "काली खांसी 'बोर्डेटेला परट्यूसिस' (Bordetella pertussis) जीवाणु से होती है। यह बच्चों की श्वासनली के सिलिया को नष्ट कर देती है, जिससे लगातार खांसी के दौरे पड़ते हैं।",
            "Bordetella pertussis produces pertussis toxin and filamentous hemagglutinin that adhere to ciliated respiratory epithelial cells, causing mucosal necrosis and severe paroxysms of coughing.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q9", "sci_8",
            "मानव आमाशय (Stomach) में पेप्टिक अल्सर (Peptic Ulcers / गैस्ट्रिक घाव) उत्पन्न करने वाला प्रमुख जीवाणु कौन-सा है, जिसकी खोज हेतु मार्शल और वॉरेन को नोबेल पुरस्कार मिला?",
            "Which spiral bacterium colonizing gastric mucosal lining causes chronic gastritis, peptic ulcers, and stomach cancer (Nobel Prize to Marshall & Warren in 2005)?",
            listOf("हेलिकोबैक्टर पाइलोरी (Helicobacter pylori)", "ई. कोलाई (Escherichia coli)", "लैक्टोबैसिलस", "साल्मोनेला"),
            listOf("Helicobacter pylori (Microaerophilic spiral bacterium neutralizing stomach acid via urease enzyme)", "Escherichia coli", "Lactobacillus", "Salmonella"),
            0,
            "हेलिकोबैक्टर पाइलोरी (H. pylori) यूरिएज एंजाइम स्रावित कर पेट के HCl अम्ल को उदासीन करता है और आमाशय की सुरक्षात्मक श्लेष्मा झिल्ली को गलाकर पेप्टिक अल्सर बना देता है।",
            "Helicobacter pylori produces urease, converting urea to ammonia to survive acidic gastric gastric juice, triggering mucosal inflammation and ulcerogenesis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m1_q10", "sci_8",
            "यौन संचारित रोग (STD) 'सिफलिस' (Syphilis / उपदंश) किस सर्पिलाकार जीवाणु (Spirochaete) के संक्रमण से होता है?",
            "Which sexually transmitted bacterial spirochaete is the causative agent of Syphilis (characterized by primary painless chancres, secondary rash, and tertiary neurosyphilis)?",
            listOf("ट्रेपोनेमा पैलिडम (Treponema pallidum)", "नाइसीरिया गोनोरिया", "क्लैमाइडिया", "ट्राइकोमोनास"),
            listOf("Treponema pallidum (Obligate spiral spirochaete)", "Neisseria gonorrhoeae", "Chlamydia trachomatis", "Trichomonas vaginalis"),
            0,
            "सिफलिस 'ट्रेपोनेमा पैलिडम' (Treponema pallidum) स्पाइरोकीट जीवाणु से होता है। गोनोरिया (Gonorrhoea / सूजाक) 'नाइसीरिया गोनोरिया' (Neisseria gonorrhoeae) से होता है।",
            "Treponema pallidum is a microaerophilic spirochete that invades intact mucous membranes or micro-abrasions, progressing through primary chancre, secondary bacteremia, and tertiary gummatous lesions.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m1_q11", "sci_8",
            "डिब्बाबंद खाद्य पदार्थों में होने वाले जानलेवा भोजन विषाक्तन (Food Poisoning / Botulism) के लिए कौन-सा अवायवीय जीवाणु उत्तरदायी है?",
            "Which anaerobic spore-bearing bacterium produces the deadliest biological exotoxin (Botulinum neurotoxin) causing severe flaccid motor paralysis in foodborne Botulism?",
            listOf("क्लोस्ट्रीडियम बोटुलिनम (Clostridium botulinum)", "स्टैफिलोकोकस", "राइजोबियम", "एजोटोबैक्टर"),
            listOf("Clostridium botulinum (Produces Botulinum neurotoxin blocking presynaptic acetylcholine release at neuromuscular junctions)", "Staphylococcus aureus", "Rhizobium leguminosarum", "Azotobacter"),
            0,
            "क्लोस्ट्रीडियम बोटुलिनम अनुचित तरीके से डिब्बाबंद खाद्य पदार्थों (बिना ऑक्सीजन के वातावरण) में बोटुलिनम टॉक्सिन बनाता है, जो तंत्रिका-मांसपेशी संधि पर एसिटाइलकोलीन को रोककर पक्षाघात कर देता है।",
            "Clostridium botulinum produces botulinum neurotoxin (BoNT), the most lethal known bacterial exotoxin, which cleaves SNARE proteins and prevents acetylcholine vesicle exocytosis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m1_q12", "sci_8",
            "एंथ्रेक्स (Anthrax / वूलसॉर्टर्स रोग / Woolsorter's Disease) मुख्य रूप से मवेशियों और भेड़ों के ऊन से मानव में फैलने वाला किस जीवाणु का घातक संक्रमण है?",
            "Anthrax, a severe zoonotic occupational disease of wool sorters and tanners capable of weaponization as a bioweapon, is caused by:",
            listOf("बैसिलस एन्थ्रेसिस (Bacillus anthracis)", "ब्रूसेला मेलिटेंसिस", "लेप्टोस्पाइरा", "कॉक्सिएला"),
            listOf("Bacillus anthracis (Endospore-forming gram-positive rod with poly-D-glutamic acid capsule)", "Brucella melitensis", "Leptospira interrogans", "Coxiella burnetii"),
            0,
            "एंथ्रेक्स 'बैसिलस एन्थ्रेसिस' के बीजाणुओं द्वारा फैलता है। संक्रमित जानवरों की खाल और ऊन से काम करने वाले श्रमिकों में यह त्वचा (क्यूटेनियस) या फेफड़ों (पल्मोनरी वूलसॉर्टर्स डिजीज) में होता है।",
            "Bacillus anthracis spores remain dormant in soil for decades, germinating in the host to produce edema factor (EF), lethal factor (LF), and protective antigen (PA) exotoxins.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m1_q13", "sci_8",
            "न्यूमोनिया (Pneumonia) रोग में फेफड़ों की कौन-सी सूक्ष्म संरचना तरल और मवाद से भर जाती है जिससे गैसों का आदान-प्रदान बाधित होता है?",
            "In bacterial pneumonia (caused by Streptococcus pneumoniae), which microscopic terminal respiratory functional units of lungs get inflamed and filled with exudate/fluid?",
            listOf("श्वास नली (Trachea)", "वायु कूपिकाएं / एल्वियोली (Alveoli / Air Sacs)", "कंठ (Larynx)", "नासिका गुहा"),
            listOf("Trachea", "Alveoli (Microscopic pulmonary air sacs responsible for alveolar-capillary gas exchange)", "Larynx (Voice box)", "Nasal septum"),
            1,
            "न्यूमोनिया (Streptococcus pneumoniae या Haemophilus influenzae) में फेफड़ों की कूपिकाओं (Alveoli) में सूजन और तरल/मवाद भर जाता है, जिससे रक्त में ऑक्सीजन की भारी कमी हो जाती है।",
            "Streptococcus pneumoniae triggers intense alveolar inflammatory exudate and cellular consolidation, drastically decreasing effective gas diffusion surface area across pulmonary capillary membranes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q14", "sci_8",
            "जीवाणुओं (Bacteria) के संक्रमण को नष्ट करने हेतु दी जाने वाली दवाएं क्या कहलाती हैं, जो वायरस पर काम नहीं करतीं?",
            "What pharmacological class of antimicrobial drugs selectively targets bacterial cell walls, protein synthesis, or DNA replication without affecting viral structures?",
            listOf("एंटीबायोटिक्स / प्रतिजैविक (Antibiotics)", "एंटीपायरेटिक्स", "एनाल्जेसिक्स", "एंटीहिस्टामाइन"),
            listOf("Antibiotics (Such as Penicillin, Streptomycin, Tetracycline, Azithromycin)", "Antipyretics (Fever reducers)", "Analgesics (Pain killers)", "Antihistamines"),
            0,
            "एंटीबायोटिक्स (जैसे पेनिसिलिन, सिप्रोफ्लोक्सासिन, एजिथ्रोमाइसिन) जीवाणु कोशिका भित्ति (पेप्टिडोग्लाइकन) या 70S राइबोसोम को नष्ट करती हैं। वायरस में कोशिका भित्ति व उपापचयी तंत्र न होने से एंटीबायोटिक्स वायरस पर अप्रभावी होती हैं।",
            "Antibiotics exploit unique prokaryotic biochemical targets (peptidoglycan cell wall synthesis, 30S/50S ribosomal subunits, DNA gyrase) absent in viral capsids and human eukaryotic cells.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m1_q15", "sci_8",
            "दुनिया की पहली एंटीबायोटिक 'पेनिसिलिन' (Penicillin) की खोज 1928 में किस वैज्ञानिक ने 'पेनिसिलियम नोटेटम' कवक (Fungus) से की थी?",
            "Who discovered the world's first miraculous antibiotic, Penicillin, from the mold Penicillium notatum in 1928?",
            listOf("अलेक्जेंडर फ्लेमिंग (Sir Alexander Fleming)", "लुई पाश्चर", "एडवर्ड जेनर", "जोसेफ लिस्टर"),
            listOf("Sir Alexander Fleming (Scottish bacteriologist at St Mary's Hospital, London)", "Louis Pasteur", "Edward Jenner", "Joseph Lister"),
            0,
            "1928 में अलेक्जेंडर फ्लेमिंग ने देखा कि पेनिसिलियम नोटेटम फफूंद ने स्टैफिलोकोकस जीवाणुओं की वृद्धि को रोक दिया। फ्लेमिंग, हॉवर्ड फ्लोरी और अर्नस्ट चेन को 1945 में चिकित्सा का नोबेल पुरस्कार मिला।",
            "Alexander Fleming discovered that fungus Penicillium notatum secreted a diffusible antibacterial metabolite (Penicillin) that lysed surrounding Staphylococcal colonies.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2: Viral Diseases & Pandemics (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m2_q1", "sci_8",
            "एड्स (AIDS - Acquired Immuno Deficiency Syndrome) किस रेट्रोवायरस (Retrovirus) के संक्रमण से होता है?",
            "Acquired Immunodeficiency Syndrome (AIDS) is caused by which human retrovirus carrying single-stranded RNA and reverse transcriptase?",
            listOf("हेपेटाइटिस बी वायरस", "ह्यूमन इम्यूनोडेफिशिएंसी वायरस / एचआईवी (HIV - Human Immunodeficiency Virus)", "रेबीज वायरस", "इन्फ्लूएंजा वायरस"),
            listOf("Hepatitis B virus", "Human Immunodeficiency Virus (HIV-1 / HIV-2)", "Rabies lyssavirus", "Influenza virus"),
            1,
            "एड्स 'एचआईवी' (HIV) रेट्रोवायरस से होता है जो मानव प्रतिरक्षा प्रणाली की मुख्य कोशिकाएं 'सहायक टी-लिम्फोसाइट्स' (CD4+ T-cells) को नष्ट कर देता है, जिससे शरीर की रोग प्रतिरोधक क्षमता समाप्त हो जाती है।",
            "HIV targets CD4+ helper T lymphocytes and macrophages via gp120/gp41 glycoproteins, integrating viral proviral DNA into host genome and crashing cell-mediated immunity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q2", "sci_8",
            "एचआईवी/एड्स (HIV/AIDS) के प्रारंभिक निदान हेतु प्राथमिक स्क्रीनिंग टेस्ट कौन-सा है?",
            "Which primary enzyme-based screening serological immunoassay is universally deployed for detecting HIV antibodies in human blood?",
            listOf("एलिसा टेस्ट (ELISA - Enzyme-Linked Immunosorbent Assay)", "विडाल टेस्ट", "मोंटू टेस्ट", "क्रेब्स टेस्ट"),
            listOf("ELISA (Enzyme-Linked Immunosorbent Assay)", "Widal Test", "Mantoux Test", "Krebs Assay"),
            0,
            "एड्स की जांच में प्रारंभिक स्क्रीनिंग 'एलिसा' (ELISA) टेस्ट द्वारा और पुष्टिकरण (Confirmatory test) 'वेस्टर्न ब्लॉट टेस्ट' (Western Blot) या RT-PCR द्वारा किया जाता है।",
            "ELISA is the initial high-sensitivity screening immunoassay for anti-HIV antibodies, whereas Western Blot or qualitative RT-PCR viral load serves as the gold-standard confirmatory diagnostic.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q3", "sci_8",
            "रेबीज (Rabies / हाइड्रोफोबिया / Hydrophobia) रोग किस वायरस के कारण होता है और यह किसके काटने से फैलता है?",
            "Rabies (fatal encephalomyelitis characterized by hydrophobia and aerophobia) is caused by Lyssavirus (Rhabdovirus) transmitted primarily through the bite of:",
            listOf("मच्छर", "पागल कुत्ते, बिल्ली, चमगादड़ एवं लोमड़ी की लार से (Bite of rabid dogs, cats, bats, foxes)", "दूषित पानी", "मक्खी"),
            listOf("Mosquito", "Saliva of rabid mammals (Dogs, bats, wolves, jackals entering via transdermal bite wounds)", "Contaminated water", "Housefly"),
            1,
            "रेबीज 'रेबडोवायरस' (Lyssavirus) से होता है। यह तंत्रिका तंत्र (CNS) पर हमला करता है, जिससे मस्तिष्क में सूजन (Encephalitis) और पानी से अत्यधिक डर (Hydrophobia) लगता है। लुई पाश्चर ने रेबीज के टीके की खोज की थी।",
            "Rabies lyssavirus is a bullet-shaped negative-sense ssRNA rhabdovirus that travels retrogradely along peripheral axonal pathways to the central nervous system, creating cytoplasmic Negri bodies.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q4", "sci_8",
            "पोलियो (Polio / पोलियोमाइलाइटिस / Poliomyelitis) वायरस मानव शरीर के किस भाग को नष्ट कर पक्षाघात (Paralysis) उत्पन्न करता है?",
            "Poliovirus (an enterovirus transmitted via fecal-oral route) selectively attacks which neurological cells, causing acute flaccid paralysis?",
            listOf("हृदय पेशी", "मेरुरज्जु के अग्रिम हॉर्न की मोटर न्यूरॉन्स (Motor Neurons in Anterior Horn of Spinal Cord)", "यकृत कोशिकाएं", "श्वसन तंत्रिकाएं"),
            listOf("Cardiac myocytes", "Anterior horn motor neurons of spinal cord / Brainstem nuclei", "Hepatic hepatocytes", "Olfactory nerves"),
            1,
            "पोलियो वायरस आंतों से रक्त में पहुंचकर रीढ़ की हड्डी (Spinal cord) के अग्रिम हॉर्न की प्रेरक तंत्रिकाओं (Motor Neurons) को नष्ट कर देता है, जिससे पैरों में स्थायी लकवा हो जाता है।",
            "Poliovirus is a positive-sense ssRNA enterovirus; after mucosal intestinal multiplication, it enters the systemic circulation and selectively destroys anterior horn motor neurons in the spinal cord.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m2_q5", "sci_8",
            "डेंगू बुखार (Dengue Fever / हड्डी तोड़ बुखार / Breakbone Fever) किस वायरस से होता है और इसका वाहक मच्छर कौन-सा है?",
            "Dengue fever (Flavivirus characterized by severe arthralgia, retro-orbital pain, and thrombocytopenia) is transmitted by which day-biting vector mosquito?",
            listOf("मादा एनोफेलीज मच्छर", "मादा एडीज एजिप्टी मच्छर (Aedes aegypti mosquito)", "क्यूलेक्स मच्छर", "मंसोनिया"),
            listOf("Female Anopheles (Vector of Malaria)", "Female Aedes aegypti mosquito (Tiger mosquito)", "Culex mosquito (Vector of Filariasis)", "Mansonia"),
            1,
            "डेंगू 'फ्लेविवायरस' (Flavivirus / DENV 1-4) के कारण होता है और दिन में काटने वाले 'एडीज एजिप्टी' (Aedes aegypti) मच्छर द्वारा फैलता है। इसमें रक्त में प्लेटलेट्स (Thrombocytes) की संख्या तेजी से घटती है।",
            "Dengue virus (Flaviviridae, single-stranded RNA) is transmitted by daytime-active Aedes aegypti and Aedes albopictus mosquitoes, triggering bone/joint pain, rash, and severe vascular permeability in DHF.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q6", "sci_8",
            "चिकनगुनिया (Chikungunya) और जीका वायरस (Zika Virus) भी किस मच्छर के काटने से फैलते हैं?",
            "Chikungunya (Alphavirus) and Zika Virus (associated with neonatal microcephaly) are also vectorially transmitted by which genus of mosquito?",
            listOf("एडीज मच्छर (Aedes aegypti / Aedes albopictus)", "एनोफेलीज मच्छर", "क्यूलेक्स मच्छर", "फ्लेबोटोमस"),
            listOf("Aedes mosquitoes (Aedes aegypti / Aedes albopictus)", "Anopheles mosquitoes", "Culex mosquitoes", "Phlebotomus sandfly"),
            0,
            "एडीज एजिप्टी (चीते जैसी सफेद धारियों वाला 'टाइगर मॉस्किटो') डेंगू, चिकनगुनिया, जीका वायरस और पीला बुखार (Yellow Fever) का वाहक होता है। यह साफ व स्थिर पानी में अंडे देता है।",
            "Aedes aegypti serves as the common urban vector for multiple arboviral pathogens including Dengue, Chikungunya, Zika, and Yellow Fever viruses.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q7", "sci_8",
            "हेपेटाइटिस (Hepatitis / पीलिया) मानव शरीर के किस प्रमुख आंतरिक अंग की सूजन और क्षति का रोग है?",
            "Viral Hepatitis (caused by Hepatitis A, B, C, D, and E viruses) is an inflammatory pathological disease primarily targeting which human organ?",
            listOf("हृदय (Heart)", "यकृत / जिगर (Liver)", "फेफड़े (Lungs)", "वृक्क (Kidneys)"),
            listOf("Heart", "Liver (Hepatic parenchyma causing jaundice, elevated bilirubin, and cirrhosis)", "Lungs", "Kidneys"),
            1,
            "हेपेटाइटिस यकृत (Liver) की सूजन है। हेपेटाइटिस-A और E दूषित पानी/भोजन (Fecal-oral) से फैलते हैं, जबकि हेपेटाइटिस-B और C रक्त, असुरक्षित यौन संबंध और मां से शिशु में फैलते हैं (HBV एक DNA वायरस है)।",
            "Hepatitis viruses cause hepatocellular necrosis and portal inflammation. Hepatitis B (Hepadnavirus, dsDNA) and Hepatitis C (Flavivirus, ssRNA) are leading causes of chronic liver cirrhosis and hepatocellular carcinoma.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q8", "sci_8",
            "चेचक (Smallpox / शीतला रोग) किस घातक वायरस से होता था, जिसका विश्व से 1980 में WHO द्वारा पूर्ण उन्मूलन घोषित किया गया?",
            "Smallpox, the devastating historic disease eradicated globally in 1980 through mass vaccination, was caused by which poxvirus?",
            listOf("वैरियोला वायरस (Variola virus)", "वैरीसेला वायरस", "हर्पीस वायरस", "राइनोवायरस"),
            listOf("Variola virus (Orthopoxvirus with double-stranded DNA)", "Varicella zoster virus (Causes Chickenpox)", "Herpes simplex virus", "Rhinovirus"),
            0,
            "चेचक 'वैरियोला वायरस' (Variola virus) से होता था। एडवर्ड जेनर ने 1796 में चेचक के टीके का आविष्कार किया था। 1980 में WHO ने चेचक को मानव इतिहास का पहला पूर्णतः उन्मूलित संक्रामक रोग घोषित किया।",
            "Smallpox was caused by Variola major and Variola minor poxviruses. Edward Jenner established the principle of vaccination in 1796 using cowpox virus, leading to global eradication certified by WHO in 1980.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q9", "sci_8",
            "छोटी माता (Chickenpox / चिकनपॉक्स) रोग किस वायरस के संक्रमण से होता है?",
            "Chickenpox, characterized by itchy vesicular blister rashes and fever in children, is caused by which herpesvirus?",
            listOf("वैरीसेला जोस्टर वायरस (Varicella Zoster Virus - VZV)", "वैरियोला वायरस", "पैरामिक्सो वायरस", "इबोला वायरस"),
            listOf("Varicella Zoster Virus (Human Alphaherpesvirus 3)", "Variola virus", "Paramyxovirus", "Ebola filovirus"),
            0,
            "चिकनपॉक्स 'वैरीसेला जोस्टर वायरस' (VZV) से होता है। ठीक होने के बाद यह वायरस शरीर के संवेदी गैन्ग्लिया में प्रसुप्त (Dormant) रहता है और बुढ़ापे में 'शिंगल्स' (Shingles / दाद / Herpes Zoster) के रूप में दोबारा उभर सकता है।",
            "Varicella-Zoster Virus (VZV) establishes lifelong clinical latency in dorsal root sensory ganglia following primary varicella infection, potentially reactivating decades later as localized herpes zoster (shingles).",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q10", "sci_8",
            "खसरा (Measles / मॉर्बिली) और गलसुआ (Mumps / मम्प्स) क्रमशः किस वायरस परिवार से फैलते हैं?",
            "Measles (Rubeola with Koplik's spots) and Mumps (painful parotid salivary gland swelling) are caused by viruses belonging to which family?",
            listOf("पैरामिक्सोवायरस परिवार (Paramyxoviridae - Morbillivirus & Rubulavirus)", "कोरोनावायरस", "रेट्रोवायरस", "पोक्सवायरस"),
            listOf("Paramyxoviridae family (Morbillivirus for Measles and Paramyxovirus/Rubulavirus for Mumps)", "Coronaviridae", "Retroviridae", "Poxviridae"),
            0,
            "खसरा (Measles) 'मॉर्बिलीवायरस' से होता है जिसमें मुंह के अंदर कॉप्लिक स्पॉट्स (Koplik spots) बनते हैं। गलसुआ (Mumps) में पैरोटिड लार ग्रंथि (Parotid gland) में दर्दनाक सूजन आ जाती है।",
            "Measles virus and Mumps virus belong to the Paramyxoviridae family of enveloped negative-sense RNA viruses, preventable through the live attenuated MMR vaccine.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q11", "sci_8",
            "साधारण जुकाम (Common Cold / सर्दी-जुकाम) का सबसे आम संक्रामक कारक वायरस कौन-सा है?",
            "Which viral pathogen is responsible for more than 50% of acute upper respiratory tract infections known as the Common Cold?",
            listOf("राइनोवायरस (Rhinovirus)", "रेबीज वायरस", "एचआईवी", "तंबाकू मोज़ेक वायरस"),
            listOf("Rhinovirus (Picornaviridae family with over 160 antigenic serotypes)", "Rabies virus", "HIV", "Tobacco Mosaic Virus"),
            0,
            "साधारण जुकाम मुख्य रूप से 'राइनोवायरस' (Rhinovirus) और कुछ कोरोनावायरस/एडेनोवायरस के संक्रमण से होता है। यह केवल ऊपरी श्वसन तंत्र (नाक और गला) को प्रभावित करता है, फेफड़ों को नहीं।",
            "Rhinoviruses replicate optimally at 33°C-35°C in the cooler human nasopharynx, binding to ICAM-1 receptors on ciliated mucosal cells and provoking histamine-mediated rhinitis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q12", "sci_8",
            "इन्फ्लूएंजा (Influenza / फ्लू) वायरस के बाहरी आवरण पर कौन-से दो मुख्य सतही ग्लाइकोप्रोटीन एंटीजन पाए जाते हैं जिनके आधार पर इसके स्ट्रेन (जैसे H1N1, H5N1) तय होते हैं?",
            "Influenza A virus subtypes (e.g., H1N1 Swine Flu, H5N1 Bird Flu) are classified based on which two surface glycoprotein spike antigens?",
            listOf("हीमैग्लूटिनिन (H) और न्यूरामिनिडेस (N) (Hemagglutinin - H and Neuraminidase - N)", "ग्लाइकोजन और पेप्टाइड", "इंसुलिन और ग्लूकागन", "हीमोग्लोबिन और एल्ब्यूमिन"),
            listOf("Hemagglutinin (H - 18 types) and Neuraminidase (N - 11 types)", "Glycogen and Peptide", "Insulin and Glucagon", "Hemoglobin and Albumin"),
            0,
            "इन्फ्लूएंजा वायरस में H (Hemagglutinin - जो कोशिका में प्रवेश कराता है) और N (Neuraminidase - जो नए वायरस को कोशिका से बाहर निकालता है) एंटीजन होते हैं। H1N1 स्वाइन फ्लू और H5N1 बर्ड फ्लू का कारक है।",
            "Hemagglutinin binds to host cell surface sialic acid receptors facilitating viral entry, while neuraminidase cleaves terminal sialic acid residues to release progeny virions from infected host cells.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m2_q13", "sci_8",
            "कोविड-19 (COVID-19) महामारी उत्पन्न करने वाले कोरोना वायरस का आधिकारिक वैज्ञानिक नाम क्या है?",
            "What is the official taxonomic designation assigned by the ICTV to the coronavirus responsible for the global COVID-19 pandemic?",
            listOf("सार्स-सीओवी-2 (SARS-CoV-2 - Severe Acute Respiratory Syndrome Coronavirus 2)", "मर्स-सीओवी (MERS-CoV)", "सार्स-सीओवी-1", "एच1एन1"),
            listOf("SARS-CoV-2 (Severe Acute Respiratory Syndrome Coronavirus 2)", "MERS-CoV (Middle East Respiratory Syndrome)", "SARS-CoV-1", "H1N1"),
            0,
            "SARS-CoV-2 एक एकल-स्ट्रैंडेड पॉजिटिव-सेंस आरएनए (+ssRNA) वायरस है। इसका स्पाइक प्रोटीन (Spike S-protein) मानव कोशिकाओं के ACE2 (एंजियोटेंसिन-कनवर्टिंग एंजाइम 2) रिसेप्टर से जुड़ता है।",
            "SARS-CoV-2 utilizes its trimeric Spike surface glycoprotein to bind human Angiotensin-Converting Enzyme 2 (ACE2) transmembrane receptors, cleaved by TMPRSS2 protease for host cell entry.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m2_q14", "sci_8",
            "केरल में फैला 'निपाह वायरस' (Nipah Virus) और अफ्रीका का 'इबोला वायरस' (Ebola) का प्राकृतिक प्राकृतिक भंडार (Natural Reservoir Host) कौन-सा जीव है?",
            "Which animal serves as the natural asymptomatic reservoir flying host for Nipah virus (Henipavirus) and Marburg/Ebola filoviruses?",
            listOf("चमगादड़ / फलभक्षी फ्रूट बैट (Pteropus Fruit Bats / Flying Foxes)", "घरेलू चूहे", "बंदर", "सूअर"),
            listOf("Fruit Bats / Flying Foxes (Pteropus genus)", "House rodents", "Rhesus macaques", "Pigs"),
            0,
            "निपाह वायरस का प्राकृतिक भंडार 'टेरोपस' प्रजाति के फ्रूट बैट (फलभक्षी चमगादड़) हैं। चमगादड़ों के लार या मूत्र से दूषित फल/ताड़ी खाने से यह मनुष्यों और सूअरों में फैलता है।",
            "Pteropus fruit bats shed Nipah virus in saliva and urine; consumption of raw date palm sap or contaminated fruits contaminated with bat secretions mediates zoonotic spillover to humans and pigs.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m2_q15", "sci_8",
            "गर्भाशय ग्रीवा कैंसर (Cervical Cancer) का मुख्य कारण कौन-सा यौन संचारित ऑन्कोजेनिक डीएनए वायरस है जिसके खिलाफ 'सर्वावैक' (CERVAVAC) स्वदेशी टीका बना है?",
            "Which sexually transmitted oncovirus causes over 95% of cervical cancer cases in women, preventable via the HPV vaccine (e.g., indigenous CERVAVAC)?",
            listOf("ह्यूमन पैपिलोमा वायरस (Human Papillomavirus - HPV Types 16 & 18)", "हेपेटाइटिस सी वायरस", "एपस्टीन-बार वायरस", "साइटोमेगालोवायरस"),
            listOf("Human Papillomavirus (HPV Types 16 and 18 - producing E6 and E7 oncoproteins)", "Hepatitis C virus", "Epstein-Barr virus", "Cytomegalovirus"),
            0,
            "ह्यूमन पैपिलोमा वायरस (HPV प्रकार 16 और 18) गर्भाशय ग्रीवा (Cervix) के कैंसर का मुख्य कारण है। इसके वायरल प्रोटीन E6 और E7 मानव ट्यूमर सप्रेसर जीन p53 और Rb को निष्क्रिय कर देते हैं।",
            "High-risk HPV types 16 and 18 express viral oncoproteins E6 and E7, which target tumor suppressor proteins p53 and pRb for ubiquitin-mediated proteasomal degradation, inducing cervical neoplasia.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 3: Protozoan, Fungal & Parasitic Diseases (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m3_q1", "sci_8",
            "मलेरिया (Malaria) रोग किस एककोशिकीय प्रोटोजोआ परजीवी के संक्रमण से होता है?",
            "Malaria, characterized by recurrent cyclic paroxysms of chills and high fever, is caused by which protozoan endoparasite?",
            listOf("प्लाज्मोडियम (Plasmodium species - P. vivax, P. falciparum, P. malariae, P. ovale)", "एंटअमीबा", "ट्रिपैनोसोमा", "लीशमैनिया"),
            listOf("Plasmodium (Apicomplexan parasite - P. falciparum, P. vivax, P. malariae, P. ovale)", "Entamoeba histolytica", "Trypanosoma brucei", "Leishmania donovani"),
            0,
            "मलेरिया 'प्लाज्मोडियम' प्रोटोजोआ से होता है। सबसे घातक मलेरिया (सेरेब्रल मलेरिया / दिमागी मलेरिया) 'प्लाज्मोडियम फाल्सीपेरम' (P. falciparum) द्वारा होता है।",
            "Plasmodium is an obligate intra-erythrocytic protozoan that replicates asexually in human liver hepatocytes and red blood cells (erythrocytic schizogony), and sexually within female Anopheles mosquitoes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q2", "sci_8",
            "मलेरिया परजीवी (Plasmodium) का मानव में संचरण (Transmission) किस मच्छर के काटने से होता है?",
            "Which vector mosquito transmits infectious Plasmodium sporozoites into the human bloodstream during blood feeding?",
            listOf("मादा एनोफेलीज मच्छर (Female Anopheles mosquito)", "मादा एडीज मच्छर", "नर एनोफेलीज मच्छर", "मादा क्यूलेक्स मच्छर"),
            listOf("Female Anopheles mosquito (Primary definitive host)", "Female Aedes mosquito", "Male Anopheles mosquito (Feeds only on plant nectar)", "Female Culex mosquito"),
            0,
            "मलेरिया का वाहक 'मादा एनोफेलीज' मच्छर है (नर मच्छर केवल फूलों का रस चूसते हैं)। 1897 में सिकंदराबाद (भारत) में सर रोनाल्ड रॉस ने साबित किया कि मलेरिया मादा एनोफेलीज से फैलता है (1902 का नोबेल पुरस्कार)।",
            "Sir Ronald Ross demonstrated in Secunderabad in 1897 that Plasmodium oocysts develop in the stomach wall of female Anopheles mosquitoes, earning the 1902 Nobel Prize in Physiology or Medicine.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q3", "sci_8",
            "मलेरिया में रोगी को तेज कंपकंपी के साथ बुखार आने का कारण आरबीसी (RBC) के फटने पर निकलने वाला कौन-सा विषाक्त पदार्थ है?",
            "In malaria, the sudden synchronous rupture of infected human erythrocytes releases which toxic malarial pigment that triggers shivering and paroxysmal high fever?",
            listOf("हीमोजोइन (Hemozoin / Malarial Pigment)", "हिस्टामाइन", "बिलिरुबिन", "यूरिक एसिड"),
            listOf("Hemozoin (Crystalline biocrystal formed from digested hemoglobin ferriprotoporphyrin)", "Histamine", "Bilirubin", "Uric acid crystals"),
            0,
            "जब प्लाज्मोडियम आरबीसी के हीमोग्लोबिन को खाता है, तो वह विषैला 'हीमोजोइन' (Hemozoin) कण छोड़ता है। आरबीसी के फटने पर हीमोजोइन रक्त में आता है और हर 48 या 72 घंटे में तेज कंपकंपी व बुखार पैदा करता है।",
            "Plasmodium sequesters toxic free heme into insoluble crystalline hemozoin; periodic rupture of schizont-laden RBCs releases hemozoin and inflammatory cytokines (TNF-alpha), inducing violent chills and pyrexia.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m3_q4", "sci_8",
            "मलेरिया के ऐतिहासिक उपचार में प्रयोग की जाने वाली प्रसिद्ध दवा 'कुनैन' (Quinine) किस पौधे की छाल से प्राप्त की जाती है?",
            "The historic antimalarial alkaloid medication 'Quinine' is extracted from the dried bark of which medicinal tree native to South America?",
            listOf("सिनकोना का पेड़ (Cinchona tree bark)", "नीम का पेड़", "यूकेलिप्टस", "सिंकोना और बेलाडोना"),
            listOf("Cinchona tree bark (Cinchona officinalis / Cinchona calisaya)", "Neem tree", "Eucalyptus", "Atropa belladonna"),
            0,
            "कुनैन (Quinine) सिनकोना (Cinchona) वृक्ष की छाल से निकाला जाने वाला एल्कलॉइड है। आधुनिक मलेरिया के उपचार में WHO द्वारा 'आर्टिमिसिनिन-बेस्ड कॉम्बिनेशन थेरेपी' (ACT) की सिफारिश की जाती है।",
            "Quinine is an alkaloid isolated from Cinchona ledgeriana bark that inhibits heme polymerase in malarial trophozoites. Tu Youyou discovered artemisinin from Artemisia annua (Nobel Prize 2015).",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q5", "sci_8",
            "कालाजार (Kala-azar / दमदम बुखार / Visceral Leishmaniasis) किस प्रोटोजोआ परजीवी द्वारा होता है और इसका वाहक कीट कौन-सा है?",
            "Kala-azar (Visceral Leishmaniasis - marked by hepatosplenomegaly and skin darkening) is caused by Leishmania donovani and transmitted by which vector?",
            listOf("बालू मक्खी / सैंडफ्लाई (Sandfly - Phlebotomus argentipes)", "सीसी मक्खी", "घरेलू मक्खी", "खटमल"),
            listOf("Sandfly (Phlebotomus argentipes vector)", "Tsetse fly", "Musca domestica (Housefly)", "Bedbug"),
            0,
            "कालाजार 'लीशमैनिया डोनोवानी' (Leishmania donovani) प्रोटोजोआ से होता है और 'बालू मक्खी' (Phlebotomus argentipes) के काटने से फैलता है। यह प्लीहा (Spleen), यकृत और अस्थि मज्जा को गंभीर रूप से क्षतिग्रस्त करता है।",
            "Leishmania donovani is an intracellular protozoan transmitted as flagellated promastigotes by Phlebotomus argentipes sandflies, transforming into amastigotes inside reticuloendothelial macrophages.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q6", "sci_8",
            "अफ्रीकन स्लीपिंग सिकनेस (Sleeping Sickness / निद्रा रोग) किस प्रोटोजोआ से होता है और इसका वाहक कौन-सी मक्खी है?",
            "African Sleeping Sickness (Trypanosomiasis) is caused by Trypanosoma brucei and vectorially transmitted to humans by the bite of:",
            listOf("सीसी मक्खी (Tsetse fly - Glossina species)", "सैंडफ्लाई", "मच्छर", "पिस्सू"),
            listOf("Tsetse fly (Glossina palpalis / Glossina morsitans)", "Sandfly", "Aedes mosquito", "Xenopsylla flea"),
            0,
            "निद्रा रोग 'ट्रिपैनोसोमा ब्रूसी' (Trypanosoma brucei) प्रोटोजोआ द्वारा होता है और 'सीसी मक्खी' (Glossina) के काटने से फैलता है। यह मस्तिष्क की सेरेब्रोस्पाइनल द्रव (CSF) को संक्रमित कर रोगी को लगातार सुस्ती और नींद में धकेल देता है।",
            "Trypanosoma brucei crosses the blood-brain barrier into the central nervous system, disrupting circadian sleep-wake cycles and resulting in progressive neurological decline and somnolence.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q7", "sci_8",
            "अमीबी पेचिश (Amoebic Dysentery / अमीबायसिस / Amoebiasis) किस प्रोटोजोआ के संक्रमण से बड़ी आंत में घाव उत्पन्न करता है?",
            "Amoebic dysentery, presenting with severe abdominal cramps and bloody mucus stools, is caused by which protozoan colonizing the human large intestine?",
            listOf("एंटअमीबा हिस्टोलिटिका (Entamoeba histolytica)", "अमीबा प्रोटियस", "यूग्लीना", "पैरामीशियम"),
            listOf("Entamoeba histolytica (Trophozoites causing flask-shaped mucosal colonic ulcers and liver abscesses)", "Amoeba proteus", "Euglena viridis", "Paramecium caudatum"),
            0,
            "एंटअमीबा हिस्टोलिटिका (Entamoeba histolytica) दूषित जल व भोजन से आंतों में पहुंचता है। यह बड़ी आंत की दीवार को गलाकर फ्लास्क के आकार के घाव (Flask-shaped ulcers) बनाता है और यकृत में अमीबिक फोड़ा (Liver abscess) भी बना सकता है।",
            "Entamoeba histolytica trophozoites secrete pore-forming amoebapores and cysteine proteases that lyse human colonic epithelial cells, producing characteristic flask-shaped ulcers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q8", "sci_8",
            "हाथीपांव (Elephantiasis / फाइलेरिया / Filariasis) किस कृमि (Nematode worm) के संक्रमण से होता है जो लसीका वाहिकाओं (Lymphatic vessels) को अवरुद्ध कर देता है?",
            "Lymphatic Filariasis (Elephantiasis, marked by massive gross lymphedema of lower limbs and scrotum) is caused by which filarial nematode worm?",
            listOf("वुचेरेरिया बैन्क्रॉफ्टाई (Wuchereria bancrofti / Brugia malayi)", "एस्केरिस लुम्ब्रिकोइड्स", "फीताकृमि", "लिवर फ्लूक"),
            listOf("Wuchereria bancrofti (Transmitted by nocturnal Culex quinquefasciatus mosquitoes)", "Ascaris lumbricoides", "Taenia solium", "Fasciola hepatica"),
            0,
            "फाइलेरिया 'वुचेरेरिया बैन्क्रॉफ्टाई' (Wuchereria bancrofti) सूत्रकृमि से होता है और 'मादा क्यूलेक्स' (Culex) मच्छर द्वारा फैलता है। वयस्क कृमि लसीका वाहिकाओं में फंसकर लिम्फ प्रवाह को रोक देते हैं जिससे पैर हाथी जैसा सूज जाता है।",
            "Adult Wuchereria bancrofti worms lodge in human lymphatic channels and lymph nodes, inducing chronic inflammatory granulomas, lymphatic vessel dilation, and severe secondary elephantiasis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q9", "sci_8",
            "दाद (Ringworm / डर्मेटोमाइकोसिस) मानव त्वचा, सिर और नाखूनों में होने वाला किस प्रकार का संक्रामक रोग है?",
            "Ringworm (Tinea corporis / Tinea capitis - itchy circular erythematous skin lesions) is a fungal infection caused by dermatophytes belonging to:",
            listOf("कवक / फंगस (Fungal infection - Microsporum, Trichophyton, Epidermophyton)", "जीवाणु", "विषाणु", "प्रोटोजोआ"),
            listOf("Fungi / Dermatophytes (Microsporum, Trichophyton, and Epidermophyton utilizing keratin)", "Bacteria", "Viruses", "Protozoa"),
            0,
            "दाद (Ringworm) कोई कीड़ा नहीं बल्कि 'ट्राइकोफाइटन' (Trichophyton), 'माइक्रोस्पोरम' और 'एपिडर्मोफाइटन' नामक कवकों (Fungi) द्वारा त्वचा के केराटिन प्रोटीन को पचाने से होता है।",
            "Dermatophyte fungi secrete keratinases that digest structural keratin in human stratum corneum, hair shafts, and nail plates, producing expanding centrifugal annular rings.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q10", "sci_8",
            "एथलीट फुट (Athlete's Foot / टीनिया पेडिस) पैरों की उंगलियों के बीच त्वचा में खुजली और जलन उत्पन्न करने वाला संक्रमण किसके द्वारा होता है?",
            "Athlete's Foot (Tinea pedis - maceration, scaling, and pruritus between toes in warm, moist footwear) is caused by:",
            listOf("कवक (Fungus - Trichophyton rubrum)", "जीवाणु", "प्रोटोजोआ", "वायरस"),
            listOf("Fungus (Trichophyton rubrum / Trichophyton mentagrophytes)", "Bacterium", "Protozoan", "Virus"),
            0,
            "एथलीट फुट 'ट्राइकोफाइटन' (Trichophyton) कवक से होता है। यह गीले मोजे, पसीने और सार्वजनिक स्विमिंग पूल/शॉवर से फैलता है।",
            "Trichophyton rubrum is an anthropophilic dermatophyte causing chronic interdigital scaling and fungal maceration in moist, occluded epidermal spaces of human feet.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q11", "sci_8",
            "कोविड-19 के दौरान अनियंत्रित मधुमेह और स्टेरॉयड लेने वाले रोगियों में घातक 'ब्लैक फंगस' (Black Fungus) संक्रमण का वैज्ञानिक नाम क्या था?",
            "What was the medical term for the opportunistic, angioinvasive 'Black Fungus' infection seen during COVID-19 in immunocompromised/diabetic patients?",
            listOf("म्यूकरमाइकोसिस (Mucormycosis / Zygomycosis)", "कैंडिडिआसिस", "एस्परगिलोसिस", "क्रिप्टोकोकोसिस"),
            listOf("Mucormycosis (Caused by Rhizopus, Mucor, and Cunninghamella molds invading blood vessels)", "Candidiasis (Thrush)", "Aspergillosis", "Cryptococcosis"),
            0,
            "म्यूकरमाइकोसिस 'म्यूकर' और 'राइजोपस' कवकों के बीजाणुओं द्वारा होता है। यह रक्त वाहिकाओं में घुसकर ऊतकों में रक्त प्रवाह रोक देता है जिससे ऊतक काले पड़कर गल जाते हैं (नेक्रोसिस)। इसके उपचार हेतु एम्फोटेरिसिन-B दवा दी जाती है।",
            "Mucormycosis is an aggressive angioinvasive fungal disease caused by order Mucorales; fungal hyphae invade vascular lumina, provoking extensive endothelial thrombosis, infarction, and tissue necrosis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m3_q12", "sci_8",
            "मानव आंतों में रहने वाला सबसे आम गोलकृमि (Roundworm) परजीवी कौन-सा है जो बच्चों में कुपोषण और आंतों में रुकावट पैदा करता है?",
            "Which large intestinal roundworm (nematode) is the most common human helminthic parasite worldwide, transmitting via soil-contaminated eggs (Soil-Transmitted Helminth)?",
            listOf("एस्केरिस लुम्ब्रिकोइड्स (Ascaris lumbricoides)", "एंसाइलोस्टोमा (हुकवर्म)", "एंटरोबियस (पिनवर्म)", "ट्रिकिनेला"),
            listOf("Ascaris lumbricoides (Giant intestinal roundworm growing up to 35 cm)", "Ancylostoma duodenale (Hookworm)", "Enterobius vermicularis (Pinworm)", "Trichinella spiralis"),
            0,
            "एस्केरिस लुम्ब्रिकोइड्स (Ascaris lumbricoides) बच्चों में बिना धुली सब्जियों और गंदे हाथों से पेट में पहुंचता है। भारत सरकार 10 फरवरी को 'राष्ट्रीय कृमि मुक्ति दिवस' (National Deworming Day) पर 'एल्बेंडाजोल' (Albendazole) की गोली देती है।",
            "Ascaris lumbricoides unfertilized and embryonated eggs hatch in the duodenum; larvae migrate through the liver and lungs before returning to the small intestine to mature into adult roundworms.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q13", "sci_8",
            "अधपके सुअर के मांस (Pork) के सेवन से मानव मस्तिष्क में गांठें (न्यूरोसिस्टीसर्कोसिस / Neurocysticercosis) और मिर्गी के दौरे पैदा करने वाला फीताकृमि (Tapeworm) कौन-सा है?",
            "Consuming undercooked measles pork containing larval cysticerci of which pork tapeworm leads to cerebral Neurocysticercosis and epileptic seizures?",
            listOf("टीनिया सोलियम / सूअर का फीताकृमि (Taenia solium / Pork Tapeworm)", "टीनिया सैगिनाटा (बीफ टेपवर्म)", "इचिनोकोकस", "डाइफाइलोबोथ्रियम"),
            listOf("Taenia solium (Pork tapeworm whose oncospheres penetrate intestinal wall and form calcified neurocysticercosis cysts in brain parenchyma)", "Taenia saginata (Beef tapeworm)", "Echinococcus granulosus (Hydatid tapeworm)", "Diphyllobothrium latum (Fish tapeworm)"),
            0,
            "टीनिया सोलियम के लार्वा (Cysticercus) आंत से रक्त द्वारा मस्तिष्क में पहुंच जाते हैं, जिसे 'न्यूरोसिस्टीसर्कोसिस' कहते हैं। यह वयस्कों में मिर्गी के दौरों का एक प्रमुख कारण है।",
            "Taenia solium cysticercosis occurs when humans accidentally ingest viable eggs; oncospheres migrate hematogenously to the central nervous system, eliciting focal seizures and intracranial hypertension.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m3_q14", "sci_8",
            "मानव में 'खूजली' (Scabies / स्केबीज) रोग त्वचा के अंदर सुरंग बनाने वाले किस सूक्ष्म माइट (Mite) परजीवी के कारण होता है?",
            "Scabies (intensely pruritic dermatological infestation with nocturnal exacerbation) is caused by which microscopic itch mite burrowing in the epidermal stratum corneum?",
            listOf("सारकोप्टेस स्केबीई (Sarcoptes scabiei mite)", "पेडिक्युलस (जूँ)", "सिमेक्स (खटमल)", "टिक्स"),
            listOf("Sarcoptes scabiei var. hominis (Microscopic itch mite)", "Pediculus humanus capitis (Head louse)", "Cimex lectularius (Bedbug)", "Ixodes scapularis tick"),
            0,
            "स्केबीज (Scabies) 'सारकोप्टेस स्केबीई' माइट द्वारा त्वचा की ऊपरी परत में सुरंग बनाकर अंडे देने और मल त्यागने से होने वाली तीव्र एलर्जिक खुजली है। इसके उपचार हेतु 'परमेथ्रिन' (Permethrin) क्रीम लगाई जाती है।",
            "Female Sarcoptes scabiei mites burrow into the epidermis to deposit eggs and scybala (feces), provoking a severe Type IV delayed hypersensitivity cutaneous allergic response.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m3_q15", "sci_8",
            "मच्छरों के लार्वा को जैविक रूप से खाकर मलेरिया और डेंगू को नियंत्रित करने वाली प्रसिद्ध छोटी मीठे पानी की मछली कौन-सी है?",
            "Which small larvivorous freshwater fish is widely introduced into ponds and stagnant wells as an effective biological vector control agent to devour mosquito larvae?",
            listOf("गम्बूसिया मछली / मॉस्किटो फिश (Gambusia affinis / Mosquito Fish)", "रोहू मछली", "कतला मछली", "शार्क"),
            listOf("Gambusia affinis (Mosquito Fish / Poecilia reticulata guppy feeding voraciously on culicine and anopheline larvae)", "Labeo rohita (Rohu)", "Catla catla", "Scoliodon (Shark)"),
            0,
            "गम्बूसिया (Gambusia affinis) और गप्पी (Guppy) मछलियां एक दिन में सैकड़ों मच्छरों के लार्वा और प्यूपा खा जाती हैं, जिससे बिना रासायनिक कीटनाशकों (DDT) के मच्छरों की आबादी नियंत्रित होती है।",
            "Gambusia affinis is an efficient top-feeding larvivorous poeciliid fish utilized globally in integrated vector management programs to interrupt mosquito reproductive cycles biologically.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 4: Vaccines, Immunization & National Health Programs (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m4_q1", "sci_8",
            "चिकित्सा विज्ञान में 'प्रतिरक्षा विज्ञान का जनक' (Father of Immunology) किसे माना जाता है जिन्होंने 1796 में पहला सफल टीका विकसित किया था?",
            "Who is universally celebrated as the 'Father of Immunology' for pioneering the world's first successful vaccine in 1796 using cowpox pustules against smallpox?",
            listOf("एडवर्ड जेनर (Edward Jenner)", "लुई पाश्चर", "रॉबर्ट कोच", "पॉल एर्लिच"),
            listOf("Edward Jenner (English physician who inoculated James Phipps with cowpox matter in 1796)", "Louis Pasteur", "Robert Koch", "Paul Ehrlich"),
            0,
            "एडवर्ड जेनर ने 1796 में पाया कि ग्वालिनों को काउपॉक्स होने के बाद घातक चेचक (Smallpox) नहीं होता। उन्होंने काउपॉक्स से चेचक का पहला टीका बनाया। 'वैक्सीन' शब्द लैटिन शब्द 'Vacca' (गाय) से बना है।",
            "Edward Jenner demonstrated cross-protective heterologous immunity by inoculating cowpox virus (Vaccinia) to immunize against smallpox (Variola), establishing the bedrock of preventive vaccinology.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q2", "sci_8",
            "नवजात शिशुओं को जन्म के तुरंत बाद टीबी (Tuberculosis) से आजीवन सुरक्षा हेतु कौन-सा टीका लगाया जाता है?",
            "Which live attenuated bacterial vaccine derived from Mycobacterium bovis is administered intradermally to neonates at birth to protect against severe pediatric Tuberculosis?",
            listOf("बीसीजी का टीका (BCG - Bacillus Calmette-Guérin)", "डीपीटी टीका", "एमएमआर टीका", "ओपीवी टीका"),
            listOf("BCG Vaccine (Bacillus Calmette-Guérin - developed by Albert Calmette and Camille Guérin in 1921)", "DPT Vaccine", "MMR Vaccine", "OPV (Oral Polio Vaccine)"),
            0,
            "बीसीजी (BCG = बैसिलस कैलमेट-गुएरिन) टीका अल्बर्ट कैलमेट और केमिली गुएरिन द्वारा 1921 में विकसित किया गया था। यह नवजात शिशु के बाएं हाथ के ऊपरी हिस्से में अंतस्त्वचा (Intradermal) दिया जाता है।",
            "BCG is a live attenuated strain of Mycobacterium bovis administered intradermally at birth; it confers high protection against severe childhood disseminated TB and tuberculous meningitis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q3", "sci_8",
            "डीपीटी (DPT Vaccine / ट्रिपल एंटीजन) टीका बच्चों को किन तीन गंभीर जीवाणु जनित रोगों से सुरक्षा प्रदान करता है?",
            "The combination trivalent pediatric DPT vaccine provides simultaneous active immunization against which three dangerous bacterial diseases?",
            listOf("डिफ्थीरिया, काली खांसी (परट्यूसिस) एवं टिटनेस (Diphtheria, Pertussis / Whooping Cough, and Tetanus)", "डायरिया, पोलियो और टीबी", "डेंगू, प्लेग और टाइफाइड", "डिफ्थीरिया, पोलियो और चेचक"),
            listOf("Diphtheria, Pertussis (Whooping Cough), and Tetanus", "Diarrhoea, Polio, and Tuberculosis", "Dengue, Plague, and Typhoid", "Diphtheria, Polio, and Smallpox"),
            0,
            "डीपीटी (DPT) में डिफ्थीरिया टॉक्सोइड, निष्क्रिय बोर्डेटेला परट्यूसिस और टिटनेस टॉक्सोइड का मिश्रण होता है। वर्तमान में इसे 'पेंटावेलेंट टीके' (DPT + हेपेटाइटिस B + Hib) के रूप में दिया जाता है।",
            "DPT combination vaccine contains diphtheria toxoid, inactivated whole-cell or acellular Bordetella pertussis antigens, and tetanus toxoid adsorbed on aluminum adjuvant.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q4", "sci_8",
            "ओरल पोलियो वैक्सीन (OPV - साबिन ड्रॉप) और निष्क्रिय इंजेक्टेबल पोलियो वैक्सीन (IPV - साल्क टीका) का आविष्कार क्रमशः किसने किया था?",
            "Who invented the Inactivated Polio Vaccine (IPV injection, 1953) and the Oral Polio Vaccine (OPV live-attenuated drops, 1961) respectively?",
            listOf("जोनास साल्क (IPV) एवं अल्बर्ट साबिन (OPV) (Jonas Salk & Albert Sabin)", "लुई पाश्चर एवं रॉबर्ट कोच", "एडवर्ड जेनर एवं अलेक्जेंडर फ्लेमिंग", "कैलमेट एवं गुएरिन"),
            listOf("Jonas Salk (Inactivated IPV) and Albert Sabin (Live attenuated OPV)", "Louis Pasteur & Robert Koch", "Edward Jenner & Alexander Fleming", "Albert Calmette & Camille Guérin"),
            0,
            "1953 में जोनास साल्क ने निष्क्रिय वायरस से IPV इंजेक्शन बनाया, जबकि 1961 में अल्बर्ट साबिन ने जीवित कमजोर वायरस से ओरल ड्रॉप (OPV) बनाई जिसने 'पल्स पोलियो कार्यक्रम' को आसान बनाया। भारत को 2014 में पोलियो मुक्त घोषित किया गया।",
            "Dr. Jonas Salk developed the formalin-inactivated Salk polio vaccine (IPV) in 1953; Dr. Albert Sabin developed the live-attenuated trivalent oral polio vaccine (OPV) conferring mucosal gut IgA immunity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q5", "sci_8",
            "एमएमआर (MMR Vaccine) टीका किन तीन वायरल संक्रामक रोगों की रोकथाम हेतु लगाया जाता है?",
            "The trivalent live attenuated MMR combination vaccine is administered to children to confer lifelong protection against which three childhood viral illnesses?",
            listOf("मीजल्स (खसरा), मम्प्स (गलसुआ) एवं रूबेला (जर्मन खसरा) (Measles, Mumps, and Rubella)", "मलेरिया, मम्प्स और रेबीज", "मस्तिष्क ज्वर, म्यूटेशन और राइनो", "मंकीपॉक्स, मीजल्स और रोटावायरस"),
            listOf("Measles (Morbilli), Mumps (Parotitis), and Rubella (German Measles)", "Malaria, Mumps, and Rabies", "Meningitis, Mutation, and Rhinovirus", "Monkeypox, Measles, and Rotavirus"),
            0,
            "एमएमआर (MMR) टीका खसरा (Measles), गलसुआ (Mumps) और रूबेला (Rubella) से बचाता है। रूबेला गर्भवती महिलाओं में भ्रूण को गंभीर जन्मजात विसंगतियां (Congenital Rubella Syndrome) कर सकता है।",
            "MMR vaccine contains live attenuated strains of Enders' Edmonston measles, Jeryl Lynn mumps, and Wistar RA 27/3 rubella viruses, inducing robust neutralizing antibody titers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q6", "sci_8",
            "भारत सरकार द्वारा दिसंबर 2014 में शुरू किए गए 'मिशन इंद्रधनुष' (Mission Indradhanush) का मुख्य उद्देश्य क्या है?",
            "What is the strategic objective of the Government of India's flagship health initiative 'Mission Indradhanush' launched by MoHFW in December 2014?",
            listOf("देश के सभी बच्चों और गर्भवती महिलाओं का शत-प्रतिशत पूर्ण टीकाकरण सुनिश्चित करना (Full Immunization Coverage for all children & pregnant mothers)", "नदियों की सफाई करना", "सौर ऊर्जा लगाना", "डिजिटल साक्षरता बढ़ाना"),
            listOf("Achieving >90% Full Immunization Coverage (FIC) against vaccine-preventable diseases for all unvaccinated/partially vaccinated children and pregnant women", "River rejuvenation", "Solar electrification", "Digital literacy"),
            0,
            "मिशन इंद्रधनुष छूटे हुए बच्चों और गर्भवती महिलाओं को 12 जानलेवा बीमारियों (टीबी, पोलियो, हेपेटाइटिस-बी, डिफ्थीरिया, परट्यूसिस, टिटनेस, खसरा, रूबेला, Hib, रोटावायरस, PCV और JE) के टीके लगाकर 90%+ पूर्ण टीकाकरण सुनिश्चित करता है।",
            "Mission Indradhanush aggressively targets low immunization pockets across India, delivering life-saving Universal Immunization Programme (UIP) vaccines under Intensified Mission Indradhanush (IMI) campaigns.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q7", "sci_8",
            "नवजात शिशुओं में गंभीर दस्त (Severe Diarrhoea & Dehydration) के प्रमुख कारण 'रोटावायरस' से बचाव हेतु कौन-सा टीका दिया जाता है?",
            "Which orally administered live-attenuated vaccine is included in India's Universal Immunization Programme to prevent infant mortality caused by severe Rotavirus gastroenteritis?",
            listOf("रोटावायरस वैक्सीन (Rotavirus Vaccine - Rotavac / RotaSIIL)", "टाइफाइड टीका", "हैजा टीका", "हेपेटाइटिस ए टीका"),
            listOf("Rotavirus Vaccine (Rotavac / RotaSIIL developed indigenously with Bharat Biotech / Serum Institute)", "Typhoid Conjugate Vaccine", "Cholera vaccine", "Hepatitis A vaccine"),
            0,
            "रोटावायरस शिशुओं में घातक दस्त और निर्जलीकरण का सबसे बड़ा कारण है। भारत के 'रोटावैक' (Rotavac - 116E स्ट्रेन) टीके को यूनिवर्सल इम्यूनाइजेशन प्रोग्राम में मौखिक बूंदों (Oral drops) के रूप में शामिल किया गया है।",
            "Rotavirus infects mature enterocytes of small intestinal villi; live-attenuated oral Rotavac stimulates local intestinal secretory IgA and serum neutralizing antibodies against VP4 and VP7 capsid antigens.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q8", "sci_8",
            "भारत में निर्मित कोविड-19 के स्वदेशी टीके 'कोवैक्सीन' (Covaxin - BBV152) को किस तकनीक द्वारा तैयार किया गया था?",
            "Which vaccinology platform was utilized by Bharat Biotech in collaboration with ICMR-NIV Pune to manufacture India's indigenous COVID-19 vaccine 'Covaxin'?",
            listOf("संपूर्ण निष्क्रिय वायरस तकनीक (Whole-Virion Inactivated Vero Cell Platform)", "एमआरएनए (mRNA) तकनीक", "डीएनए प्लास्मिड तकनीक", "लाइव अटेन्युएटेड तकनीक"),
            listOf("Whole-Virion Inactivated SARS-CoV-2 Platform (Algel-IMDG adjuvant)", "Synthetic mRNA platform (Pfizer/Moderna)", "DNA Plasmid platform (ZyCoV-D)", "Live attenuated platform"),
            0,
            "कोवैक्सीन (Covaxin) को भारत बायोटेक और ICMR-NIV ने पूरे SARS-CoV-2 वायरस को बीटा-प्रोपियोलैक्टोन रसायन से निष्क्रिय (Inactivated/Killed) करके और Algel-IMDG सहायक पदार्थ मिलाकर बनाया था।",
            "Covaxin (BBV152) is an inactivated whole-virion SARS-CoV-2 vaccine formulated with an imidazoquinoline class TLR7/8 agonist molecule chemisorbed on aluminum hydroxide gel.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m4_q9", "sci_8",
            "पुणे स्थित 'सीरम इंस्टीट्यूट ऑफ इंडिया' (SII) द्वारा बड़े पैमाने पर उत्पादित 'कोविशील्ड' (Covishield) टीका किस प्रकार का टीका था?",
            "Covishield (manufactured by Serum Institute of India, licensed from Oxford-AstraZeneca) uses which viral vector platform?",
            listOf("चिंपैंजी एडेनोवायरस वायरल वेक्टर टीका (Recombinant Replicating-Deficient Chimpanzee Adenovirus Vector - ChAdOx1)", "निष्क्रिय टीका", "एमआरएनए टीका", "टॉक्सोइड टीका"),
            listOf("Recombinant Chimpanzee Adenovirus Vector (ChAdOx1-S carrying full-length SARS-CoV-2 Spike glycoprotein gene)", "Inactivated virus", "Lipid nanoparticle mRNA", "Bacterial Toxoid"),
            0,
            "कोविशील्ड में चिंपैंजी के अहानिकर एडेनोवायरस (ChAdOx1) का उपयोग करके उसके अंदर कोरोना वायरस का स्पाइक प्रोटीन जीन डाला गया था, जो मानव शरीर में स्पाइक प्रोटीन बनाकर एंटीबॉडी उत्पन्न करता है।",
            "ChAdOx1 nCoV-19 (AZD1222 / Covishield) utilizes a replication-incompetent simian adenoviral vector delivering genetic code for the SARS-CoV-2 spike protein to elicit humoral and cellular T-cell immunity.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m4_q10", "sci_8",
            "भारत में टीबी (क्षय रोग) के पूर्ण उन्मूलन हेतु राष्ट्रीय क्षय रोग उन्मूलन कार्यक्रम (NTEP) के तहत भारत सरकार ने किस वर्ष तक 'टीबी मुक्त भारत' का राष्ट्रीय लक्ष्य रखा है?",
            "Under the National Tuberculosis Elimination Programme (NTEP), India set the ambitious national target to eradicate Tuberculosis by which year (5 years ahead of Global SDG 2030)?",
            listOf("2025 तक (Target 2025 - TB Mukt Bharat Abhiyaan / Ni-kshay Mitra)", "2030", "2040", "2050"),
            listOf("By 2025 (Targeting 80% reduction in TB incidence and zero catastrophic healthcare costs)", "By 2030 (UN Sustainable Development Goal 3.3)", "By 2040", "By 2050"),
            0,
            "भारत ने वैश्विक SDG लक्ष्य (2030) से 5 वर्ष पूर्व यानी '2025 तक टीबी उन्मूलन' का लक्ष्य रखा है। सरकार टीबी रोगियों को पोषण हेतु 'निक्षय पोषण योजना' (₹500/माह DBT) और 'निक्षय मित्र' पहल चला रही है।",
            "The National Strategic Plan (NSP) for TB Elimination 2017-2025 adopts the 'Detect-Treat-Prevent-Build' framework supported by the digital Ni-kshay tracking platform and TrueNat/CBNAAT molecular diagnostic scale-up.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q11", "sci_8",
            "सांप के काटने पर दिए जाने वाले 'एंटी-वेनम' (Snake Antivenom) सीरम में कौन-सा प्रतिरक्षा तत्व होता है जो तत्काल विष को निष्क्रिय करता है?",
            "What immunobiological component is present in snake antivenom serum administered to envenomated patients to confer immediate passive immunity?",
            listOf("तैयार एंटीबॉडीज / प्रतिरक्षी (Preformed Purified Specific Antibodies / Immunoglobulins)", "सांप का कच्चा जहर", "एंटीबायोटिक पाउडर", "सफेद रक्त कोशिकाएं"),
            listOf("Preformed Specific Neutralizing Antibodies / F(ab')2 immunoglobulin fragments (Passive Immunity)", "Crude venom proteins", "Antibiotic suspension", "Host memory T-cells"),
            0,
            "एंटी-वेनम 'निष्क्रिय प्रतिरक्षा' (Passive Immunity) का उदाहरण है। इसमें घोड़ों या भेड़ों में सर्प विष देकर उत्पादित शुद्ध पॉलीवैलेंट एंटीबॉडीज (Antibodies) होती हैं जो रक्त में विष के अणुओं को तुरंत निष्क्रिय कर देती हैं।",
            "Polyvalent snake antivenom comprises purified immunoglobulin F(ab')2 antibody fragments raised in hyperimmunized equines against the 'Big Four' venomous Indian snakes (Cobra, Krait, Russell's Viper, Saw-scaled Viper).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m4_q12", "sci_8",
            "जब कोई व्यक्ति स्वयं किसी रोगाणु के संपर्क में आता है या टीका लगवाता है और उसका शरीर स्वयं एंटीबॉडी बनाता है, तो यह किस प्रकार की प्रतिरक्षा कहलाती है?",
            "When host immune system is exposed to antigens and autonomously produces its own neutralizing antibodies and memory lymphocytes, it is classified as:",
            listOf("सक्रिय प्रतिरक्षा (Active Immunity)", "निष्क्रिय प्रतिरक्षा (Passive Immunity)", "सहज प्रतिरक्षा", "अक्रिय प्रतिरक्षा"),
            listOf("Active Immunity (Long-lasting immunological memory via B and T cells)", "Passive Immunity (Transient protection via transferred preformed antibodies)", "Innate Non-specific Immunity", "Inert Immunity"),
            0,
            "सक्रिय प्रतिरक्षा (Active Immunity) में शरीर स्वयं एंटीबॉडी और मेमोरी बी/टी कोशिकाएं बनाता है, जो लंबे समय (या आजीवन) तक चलती है। मां के दूध (Colostrum - IgA) या एंटी-सीरम से मिलने वाली सुरक्षा 'निष्क्रिय प्रतिरक्षा' (Passive Immunity) होती है।",
            "Active immunity involves de novo antigen presentation, clonal expansion of B/T lymphocytes, and generation of long-lived memory cells, whereas passive immunity transfers transient exogenous antibodies without memory.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m4_q13", "sci_8",
            "नवजात शिशु के जन्म के प्रथम कुछ दिनों में मां के गाढ़े पीले दूध (Colostrum / खीस) में कौन-सा सुरक्षात्मक एंटीबॉडी प्रचुर मात्रा में पाया जाता है?",
            "Which primary protective secretory immunoglobulin antibody is abundantly present in maternal colostrum, providing natural passive gut immunity to newborns?",
            listOf("आईजीए (IgA - Secretory Immunoglobulin A)", "आईजीई (IgE)", "आईजीडी (IgD)", "आईजीएम (IgM)"),
            listOf("IgA (Secretory Immunoglobulin A protecting gastrointestinal mucosal surfaces)", "IgE (Mediates allergic reactions)", "IgD", "IgM (First antibody produced in primary immune response)"),
            0,
            "कोलोस्ट्रम में 'IgA' एंटीबॉडी प्रचुर मात्रा में होती है जो नवजात की आंतों की श्लेष्मा झिल्ली को ढककर जीवाणुओं व वायरसों के संक्रमण से बचाती है। मानव शरीर में सर्वाधिक पाई जाने वाली और प्लेसेंटा पार करने वाली एकमात्र एंटीबॉडी 'IgG' है।",
            "Secretory IgA (dimeric immunoglobulin) resists proteolytic degradation in the infant gut, neutralizing microbial pathogens and preventing enteric colonization.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m4_q14", "sci_8",
            "शरीर में किसी एलर्जेन (परागकण, धूल, दवा) के संपर्क में आने पर एलर्जी प्रतिक्रियाओं और अस्थमा में कौन-सी एंटीबॉडी सक्रिय होकर हिस्टामाइन छोड़ती है?",
            "Which class of immunoglobulin antibodies binds to high-affinity Fc receptors on mast cells and basophils, triggering explosive histamine release during allergic hypersensitivity reactions?",
            listOf("आईजीई (IgE - Immunoglobulin E)", "आईजीजी (IgG)", "आईजीएम (IgM)", "आईजीए (IgA)"),
            listOf("IgE (Mediates Type-I immediate hypersensitivity and anaphylaxis)", "IgG", "IgM", "IgA"),
            0,
            "एलर्जी और परजीवी कृमि संक्रमण में 'IgE' एंटीबॉडी मास्ट कोशिकाओं और बेसोफिल कोशिकाओं से जुड़कर हिस्टामाइन (Histamine) और सेरोटोनिन स्रावित कराती है, जिससे छींकें, खुजली और सूजन उत्पन्न होती है।",
            "Allergen-induced cross-linking of surface-bound IgE molecules on tissue mast cells triggers degranulation, discharging vasoactive amines (histamine, leukotrienes) that cause bronchoconstriction and vasodilation.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m4_q15", "sci_8",
            "राष्ट्रीय वेक्टर जनित रोग नियंत्रण कार्यक्रम (NVBDCP) के अंतर्गत भारत में कितने प्रमुख वेक्टर जनित रोगों के नियंत्रण पर ध्यान केंद्रित किया गया है?",
            "How many major vector-borne vector-transmitted infectious diseases are targeted under India's National Centre for Vector Borne Diseases Control (NCVBDC)?",
            listOf("6 रोग (मलेरिया, डेंगू, चिकनगुनिया, जापानी एन्सेफलाइटिस, कालाजार एवं फाइलेरिया)", "2 रोग", "10 रोग", "4 रोग"),
            listOf("6 Diseases: Malaria, Dengue, Chikungunya, Japanese Encephalitis (JE), Kala-azar, and Lymphatic Filariasis", "2 Diseases", "10 Diseases", "4 Diseases"),
            0,
            "NVBDCP (अब NCVBDC) छह प्रमुख वेक्टर जनित रोगों के उन्मूलन व नियंत्रण का राष्ट्रीय कार्यक्रम है: 1. मलेरिया, 2. फाइलेरिया, 3. कालाजार, 4. जापानी एन्सेफलाइटिस (JE), 5. डेंगू और 6. चिकनगुनिया।",
            "NCVBDC is the central umbrella nodal agency in the Ministry of Health and Family Welfare steering nationwide strategic vector surveillance, indoor residual spraying, and subsidized treatment regimens.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 5: Genetic, Non-Communicable & Autoimmune Diseases (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_8_m5_q1", "sci_8",
            "डाउन सिंड्रोम (Down Syndrome / मंगोलिज्म) किस ऑटोसोमल गुणसूत्र की त्रिसूत्रता (Trisomy) के कारण होने वाला आनुवंशिक विकार है?",
            "Down Syndrome, a genetic chromosomal disorder characterized by intellectual disability and distinct facial features, is caused by non-disjunction trisomy of which chromosome?",
            listOf("21वें गुणसूत्र की त्रिसूत्रता (Trisomy of Chromosome 21 / 47, XX or XY +21)", "18वें गुणसूत्र (Edward Syndrome)", "13वें गुणसूत्र (Patau Syndrome)", "23वें गुणसूत्र"),
            listOf("Trisomy of Chromosome 21 (Presence of an extra 21st chromosome resulting in 47 chromosomes)", "Trisomy 18 (Edwards Syndrome)", "Trisomy 13 (Patau Syndrome)", "Trisomy 23"),
            0,
            "डाउन सिंड्रोम में 21वें गुणसूत्र के जोड़े में 2 के बजाय 3 क्रोमोसोम (2n+1 = 47) आ जाते हैं। इससे बच्चे में मानसिक मंदता, गोल चेहरा, चौड़ी जीभ और हथेली पर एकल सिलवट (Simian crease) पाई जाती है।",
            "Down Syndrome is the most common autosomal aneuploidy (karyotype 47, +21), arising from meiotic non-disjunction of maternal homologous chromosome 21 during oogenesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q2", "sci_8",
            "टर्नर सिंड्रोम (Turner Syndrome) केवल महिलाओं में होने वाला आनुवंशिक विकार है जिसमें लिंग गुणसूत्रों की स्थिति क्या होती है?",
            "Turner Syndrome, a female genetic condition presenting with short stature, webbed neck, and gonadal dysgenesis (rudimentary ovaries/infertility), has which sex chromosome karyotype?",
            listOf("45, XO (एक X गुणसूत्र की अनुपस्थिति / Monosomy of X)", "47, XXY (Klinefelter Syndrome)", "47, XYY", "46, XX"),
            listOf("45, XO (Monosomy X - 44 autosomes + single X chromosome)", "47, XXY (Klinefelter Syndrome)", "47, XYY (Jacob's Syndrome)", "46, XX (Normal female)"),
            0,
            "टर्नर सिंड्रोम में महिला में 46 के बजाय केवल 45 गुणसूत्र (44A + XO) होते हैं। इनमें अंडाशय अल्पविकसित होते हैं, गर्भाशय छोटा होता है और महिलाएं बांझ (Sterile) होती हैं।",
            "Turner Syndrome is characterized by complete or partial X monosomy (45,X0), resulting from paternal sex chromosome loss during gametogenesis, causing streak gonads and lack of secondary sexual characteristics.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m5_q3", "sci_8",
            "क्लाइनफेल्टर सिंड्रोम (Klinefelter Syndrome) केवल पुरुषों में पाया जाने वाला गुणसूत्रीय विकार है जिसमें कौन-सा अतिरिक्त गुणसूत्र होता है?",
            "Klinefelter Syndrome, an endocrine chromosomal abnormality in genetic males characterized by hypogonadism, tall stature, and gynecomastia (breast development), has which karyotype?",
            listOf("47, XXY (44 ऑटोसोम + XXY लिंग गुणसूत्र)", "45, XO", "47, XYY", "48, XXXX"),
            listOf("47, XXY (44 autosomes + XXY - Presence of an extra maternal or paternal X chromosome in males)", "45, XO", "47, XYY", "48, XXXX"),
            0,
            "क्लाइनफेल्टर सिंड्रोम (44A + XXY = 47) में पुरुषों में एक अतिरिक्त X गुणसूत्र आ जाता है, जिससे वृषण अविकसित रह जाते हैं, शुक्राणु नहीं बनते (बांझपन) और स्तनों का विकास (गाइनेकोमास्टिया) हो जाता है।",
            "Klinefelter Syndrome (47,XXY) leads to testicular seminiferous tubule dysgenesis, low testosterone synthesis, elevated gonadotropins (LH and FSH), azoospermia, and eunuchoid body proportions.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m5_q4", "sci_8",
            "सिकल सेल एनीमिया (Sickle Cell Anaemia / हंसियाकार रक्ताल्पता) में हीमोग्लोबिन की बीटा-ग्लोबिन श्रृंखला में किस अमीनो अम्ल का प्रतिस्थापन हो जाता है?",
            "In Sickle Cell Anaemia (autosomal recessive hemoglobinopathy), which single point mutation in codon 6 of the beta-globin gene substitutes glutamic acid with:",
            listOf("वैलीन (Valine - GAG codon mutated to GUG)", "ग्लाइसिन", "लाइसिन", "एलानाइन"),
            listOf("Valine (Point mutation converting hydrophilic Glutamic Acid to hydrophobic Valine at position 6)", "Glycine", "Lysine", "Alanine"),
            0,
            "सिकल सेल एनीमिया में बिंदु उत्परिवर्तन (Point mutation) से 6वें स्थान पर ग्लूटामिक एसिड की जगह 'वैलीन' आ जाता है। कम ऑक्सीजन में HbS के बहुलकीकरण से लाल रक्त कोशिकाएं (RBC) हंसिया (Sickle) के आकार की होकर टूट जाती हैं।",
            "A single nucleotide transversion (GAG to GUG) encodes hydrophobic valine instead of charged glutamate at residue 6 of the beta-globin subunit, polymerizing under deoxygenated conditions into sickle-shaped RBCs.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m5_q5", "sci_8",
            "हीमोफीलिया (Haemophilia / रॉयल डिजीज / शाही रोग) में रक्त का थक्का (Blood Clotting) न जमने का मुख्य आनुवंशिक कारण क्या है?",
            "Haemophilia (X-linked recessive bleeding disorder famous in European royal families) is caused by genetic deficiency of which clotting factors?",
            listOf("क्लॉटिंग फैक्टर VIII (हीमोफीलिया A) या फैक्टर IX (हीमोफीलिया B) की कमी", "विटामिन सी की कमी", "कैल्शियम की कमी", "श्वेत रक्त कणिकाओं की कमी"),
            listOf("Factor VIII deficiency (Haemophilia A) or Factor IX deficiency (Haemophilia B / Christmas Disease)", "Vitamin C deficiency", "Calcium deficiency", "Leukopenia"),
            0,
            "हीमोफीलिया एक X-सहलग्न अप्रभावी (X-linked recessive) विकार है। हीमोफीलिया-A में क्लॉटिंग फैक्टर VIII और हीमोफीलिया-B में फैक्टर IX नहीं बनता, जिससे मामूली चोट पर भी अनियंत्रित रक्तस्राव होता है। महारानी विक्टोरिया इसकी वाहक (Carrier) थीं।",
            "Hemophilia A is caused by mutations in the F8 gene encoding Coagulation Factor VIII, disrupting the intrinsic tenase complex pathway of the secondary hemostatic cascade.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q6", "sci_8",
            "वर्णांधता (Colour Blindness / डाल्टोनिज्म) से पीड़ित व्यक्ति मुख्य रूप से किन दो रंगों में अंतर नहीं कर पाता है?",
            "Red-Green Colour Blindness (X-linked recessive condition involving photopigment cone cell defects) primarily impairs perceptual discrimination between:",
            listOf("लाल और हरा रंग (Red and Green colours)", "नीला और पीला", "काला और सफेद", "बैंगनी और नारंगी"),
            listOf("Red and Green colours (Protanopia / Deuteranopia)", "Blue and Yellow (Tritanopia)", "Black and White (Achromatopsia)", "Violet and Orange"),
            0,
            "वर्णांधता एक X-सहलग्न आनुवंशिक रोग है जो रेटिना के शंकु (Cone) कोशिकाओं में लाल और हरे रंग के वर्णकों के दोष से होता है। यह पुरुषों में अधिक पाया जाता है (8%) क्योंकि पुरुषों में केवल एक X गुणसूत्र होता है।",
            "Red-green color deficiency is inherited as an X-linked recessive trait affecting opsin photopigment genes on the q-arm of the X chromosome, evaluated clinically using Ishihara pseudoisochromatic plates.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q7", "sci_8",
            "थैलेसीमिया (Thalassemia) एक आनुवंशिक रक्त विकार है जिसमें शरीर किसका निर्माण करने में असमर्थ होता है?",
            "Thalassemia (autosomal recessive hemoglobinopathy) is characterized by reduced or absent synthesis of which crucial blood protein?",
            listOf("हीमोग्लोबिन की ग्लोबिन श्रृंखलाएं (Hemoglobin Globin Chains - Alpha or Beta chains)", "इंसुलिन", "फाइब्रिनोजेन", "एल्ब्यूमिन"),
            listOf("Hemoglobin Globin Chains (Alpha-globin or Beta-globin polypeptide chains causing severe microcytic anemia)", "Insulin", "Fibrinogen", "Albumin"),
            0,
            "थैलेसीमिया में हीमोग्लोबिन की अल्फा या बीटा ग्लोबिन प्रोटीन श्रृंखला का संश्लेषण घट जाता है। इससे आरबीसी तेजी से नष्ट होते हैं और रोगी को बार-बार रक्त चढ़ाने (Blood transfusion) की आवश्यकता पड़ती है।",
            "Thalassemias result from structural gene deletions or regulatory mutations in HBA1/HBA2 or HBB loci, triggering unbalanced globin chain precipitation and premature hemolysis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q8", "sci_8",
            "मधुमेह मेलेटस (Diabetes Mellitus / शुगर) किस अंतःस्रावी ग्रंथि के हार्मोन 'इंसुलिन' की कमी या निष्क्रियता से होता है?",
            "Diabetes Mellitus (characterized by hyperglycemia, polyuria, polydipsia, and polyphagia) results from deficiency or peripheral resistance to Insulin secreted by:",
            listOf("अग्न्याशय के आईलेट्स ऑफ लैंगरहैंड्स की बीटा कोशिकाएं (Beta Cells of Islets of Langerhans in Pancreas)", "थायरॉयड ग्रंथि", "पीयूष ग्रंथि", "अधिवृक्क ग्रंथि"),
            listOf("Beta cells of Islets of Langerhans in the Pancreas", "Follicular cells of Thyroid gland", "Anterior Pituitary gland", "Adrenal cortex"),
            0,
            "इंसुलिन रक्त के ग्लूकोज को ग्लाइकोजन में बदलकर कोशिकाओं में प्रवेश कराता है। टाइप-1 डायबिटीज में ऑटोइम्यून हमले से बीटा कोशिकाएं नष्ट हो जाती हैं, जबकि टाइप-2 में इंसुलिन प्रतिरोध (Insulin Resistance) हो जाता है।",
            "Type 1 Diabetes involves autoimmune T-cell mediated destruction of pancreatic beta cells, while Type 2 involves peripheral insulin receptor desensitization coupled with progressive secretory defect.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q9", "sci_8",
            "मानव में अनियंत्रित कोशिका विभाजन और ट्यूमर (Tumor) निर्माण की घातक बीमारी 'कैंसर' (Cancer) के अध्ययन को क्या कहा जाता है?",
            "What is the medical and scientific branch specialized in the research, diagnosis, staging, and treatment of malignant tumors and Cancer?",
            listOf("ऑन्कोलॉजी (Oncology)", "हेमेटोलॉजी", "नेफ्रोलॉजी", "कार्डियोलॉजी"),
            listOf("Oncology (Study and treatment of neoplasms and oncology)", "Hematology (Study of blood)", "Nephrology (Study of kidneys)", "Cardiology (Study of heart)"),
            0,
            "कैंसर कोशिकाओं में संपर्क संदमन (Contact Inhibition) का गुण समाप्त हो जाता है जिससे वे लगातार विभाजित होकर ट्यूमर बनाती हैं। कैंसर फैलाने वाले जीन 'ऑन्कोजीन' (Oncogenes) कहलाते हैं।",
            "Oncology investigates carcinogenic pathways (proto-oncogene activation, p53 mutation, angiogenesis, and metastatic invasion). Contact inhibition loss enables unchecked clonal proliferation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q10", "sci_8",
            "सामान्य रक्तचाप (Normal Blood Pressure) का मानक मान सिस्टोलिक और डायस्टोलिक दबाव में कितना माना जाता है?",
            "What is the standard clinical reference value for normal arterial blood pressure (Systolic / Diastolic pressure in mm of Mercury - mmHg) in a healthy resting adult?",
            listOf("120/80 mmHg (120 mmHg सिस्टोलिक / 80 mmHg डायस्टोलिक)", "140/90 mmHg", "100/60 mmHg", "80/120 mmHg"),
            listOf("120/80 mmHg (120 mmHg Systolic ventricular contraction / 80 mmHg Diastolic ventricular relaxation)", "140/90 mmHg (Stage 1 Hypertension)", "100/60 mmHg (Hypotension)", "80/120 mmHg"),
            0,
            "रक्तचाप को 'स्फिग्मोमैनोमीटर' (Sphygmomanometer) से मापा जाता है। हृदय के संकुचन के समय धमनी में दबाव 'सिस्टोलिक' (120 mmHg) और विश्राम के समय 'डायस्टोलिक' (80 mmHg) होता है। 140/90 से ऊपर उच्च रक्तचाप (Hypertension) होता है।",
            "Blood pressure is measured using a sphygmomanometer detecting Korotkoff sounds over the brachial artery. Systolic peak corresponds to left ventricular ejection; diastolic corresponds to runoff resistance.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q11", "sci_8",
            "दिल का दौरा (Heart Attack / मायोकार्डियल इन्फार्कशन / Myocardial Infarction) किस धमनी में रक्त का थक्का या रुकावट आने से होता है?",
            "A Heart Attack (Myocardial Infarction - necrosis of cardiac tissue) occurs when which specific blood vessels supplying oxygen to heart muscle get occluded by a thrombus?",
            listOf("कोरोनरी धमनी (Coronary Artery)", "कैरोटिड धमनी", "पल्मोनरी धमनी", "वृक्क धमनी"),
            listOf("Coronary Arteries (Left anterior descending / Right coronary artery atherosclerosis and thrombosis)", "Carotid artery (Supplies brain)", "Pulmonary artery (Carries deoxygenated blood to lungs)", "Renal artery"),
            0,
            "हृदय की पेशियों (Myocardium) को शुद्ध रक्त और ऑक्सीजन 'कोरोनरी धमनी' द्वारा मिलती है। जब इसमें कोलेस्ट्रॉल और एथेरोस्क्लेरोटिक प्लाक के फटने से थक्का जम जाता है, तो हृदय पेशी की मृत्यु हो जाती है।",
            "Atherosclerotic coronary plaque rupture exposes subendothelial collagen, triggering platelet aggregation and acute coronary artery thrombosis, starving cardiac myocytes of oxygen.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q12", "sci_8",
            "मस्तिष्क में रक्त प्रवाह में अचानक रुकावट या रक्त वाहिका फटने से मस्तिष्क कोशिकाओं की मृत्यु क्या कहलाती है?",
            "The sudden neurological deficit caused by cerebrovascular occlusion (ischemia) or cerebral hemorrhage, leading to localized brain tissue infarction, is termed:",
            listOf("स्ट्रोक / पक्षाघात / लकवा (Brain Stroke / Cerebrovascular Accident - CVA)", "हार्ट अटैक", "एपिलेप्सी", "अस्थमा"),
            listOf("Brain Stroke (Ischemic stroke / Hemorrhagic stroke / Cerebrovascular Accident)", "Heart Attack", "Epilepsy", "Bronchial Asthma"),
            0,
            "मस्तिष्क स्ट्रोक दो प्रकार का होता है: 1. इस्केमिक स्ट्रोक (87% - धमनी में थक्के से रक्त रुकना) और 2. हेमोरेजिक स्ट्रोक (उच्च रक्तचाप से धमनी का फटना)। इसे पहचानने हेतु 'FAST' (Face, Arms, Speech, Time) फॉर्मूला प्रयोग होता है।",
            "Cerebrovascular Accident (Stroke) interrupts cerebral blood supply, halting oxygen/glucose delivery to neurons, initiating cytotoxic edema, ischemic core necrosis, and penumbra damage.",
            "Easy"
        ),
        makeScienceQ(
            "sci_8_m5_q13", "sci_8",
            "रूमेटाइड अर्थराइटिस (Rheumatoid Arthritis / गठिया बाय) किस प्रकार का रोग है जिसमें शरीर की अपनी प्रतिरक्षा प्रणाली जोड़ों की श्लेष्मा झिल्ली पर हमला करती है?",
            "Rheumatoid Arthritis, causing painful symmetric joint inflammation, bone erosion, and deformities, is classified pathologically as an:",
            listOf("स्वप्रतिरक्षित रोग (Autoimmune Disease targeting synovial joints)", "जीवाणु संक्रमण", "विटामिन की कमी", "आनुवंशिक गुणसूत्रीय विकार"),
            listOf("Autoimmune Disease (Chronic systemic autoimmune disorder producing rheumatoid factors and anti-CCP antibodies against synovial membranes)", "Bacterial infection", "Nutritional deficiency", "Chromosomal trisomy"),
            0,
            "ऑटोइम्यून रोगों में शरीर की प्रतिरक्षा प्रणाली अपने ही स्वस्थ ऊतकों को 'विदेशी' समझकर नष्ट करने लगती है। अन्य उदाहरण: ल्यूपस (SLE), विटिलिगो (सफेद दाग), मल्टीपल स्केलेरोसिस और हाशिमोटो थायरॉयडिटिस।",
            "Autoimmune diseases arise when immunological self-tolerance breaks down; autoreactive CD4+ T-cells and plasma cells generate autoantibodies (like RF and ACPA) that attack synovial fibroblasts and articular cartilage.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m5_q14", "sci_8",
            "अल्जाइमर रोग (Alzheimer's Disease) में मस्तिष्क में कौन-से असामान्य प्रोटीन के जमा होने से याददाश्त और संज्ञानात्मक क्षमता नष्ट हो जाती है?",
            "In Alzheimer's Disease (progressive neurodegenerative dementia), which misfolded abnormal proteins aggregate as extracellular plaques and intracellular neurofibrillary tangles in cerebral cortex?",
            listOf("बीटा-एमाइलॉयड प्लाक एवं ताऊ प्रोटीन (Beta-Amyloid Plaques & Hyperphosphorylated Tau Tangles)", "हीमोग्लोबिन और मायोसिन", "इंसुलिन और कोलेजन", "केराटिन और फाइब्रिन"),
            listOf("Beta-Amyloid (Aβ) Plaques and Neurofibrillary Tau (τ) Protein Tangles", "Hemoglobin and Myosin", "Insulin and Collagen", "Keratin and Fibrin"),
            0,
            "अल्जाइमर रोग में मस्तिष्क के हिप्पोकैम्पस और कॉर्टेक्स में बीटा-एमाइलॉयड प्रोटीन के गुच्छे और ताऊ प्रोटीन के रेशे जम जाते हैं, जिससे न्यूरॉन्स नष्ट हो जाते हैं और एसिटाइलकोलीन न्यूरोट्रांसमीटर की भारी कमी हो जाती है।",
            "Extracellular deposition of insoluble amyloid-beta (Aβ42) peptide oligomers and intracellular hyperphosphorylated tau microtubule aggregates trigger synaptic failure and progressive cortical atrophy.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_8_m5_q15", "sci_8",
            "पार्किंसन रोग (Parkinson's Disease) में मस्तिष्क के 'सबस्टैंशिया नाइग्रा' भाग में किस न्यूरोट्रांसमीटर का उत्पादन करने वाले न्यूरॉन्स के नष्ट होने से कंपकंपी और गति में जकड़न होती है?",
            "Parkinson's Disease (marked by resting tremors, bradykinesia, and postural instability) results from the progressive degeneration of dopaminergic neurons in substantia nigra producing:",
            listOf("डोपामाइन (Dopamine Neurotransmitter)", "एसिटाइलकोलीन", "सेरोटोनिन", "गाबा (GABA)"),
            listOf("Dopamine (Loss of dopaminergic input from substantia nigra pars compacta to the striatum)", "Acetylcholine", "Serotonin", "GABA"),
            0,
            "पार्किंसन रोग में मस्तिष्क के बेसल गैन्ग्लिया में डोपामाइन (Dopamine) का स्तर गिर जाता है और लेवी बॉडीज (Lewy Bodies - अल्फा सिन्यूक्लिन) जमा हो जाती हैं। इसके उपचार हेतु 'लेवोडोपा' (L-Dopa) दवा दी जाती है।",
            "Parkinsonism stems from selective loss of pigmented dopaminergic projection neurons in the substantia nigra pars compacta, disrupting basal ganglia motor circuit control over voluntary movement.",
            "Moderate"
        )
    )
}
