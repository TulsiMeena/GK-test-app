package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic10ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6: Chemistry of Glass, Ceramics & Cement (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m6_q1", "sci_10",
            "प्रयोगशाला के रासायनिक उपकरण (Beakers, Test tubes, Flasks) और माइक्रोवेव कुकवेयर बनाने में किस ताप-प्रतिरोधी 'बोरोसिलिकेट ग्लास' (Pyrex / Borosilicate Glass) का उपयोग किया जाता है?",
            "Which thermal shock-resistant glass, commercially known as Pyrex or Borosil (containing ~13% Boron Trioxide B2O3), is universally used for laboratory apparatus and oven cookware?",
            listOf("बोरोसिलिकेट कांच / पाइरेक्स (Borosilicate Glass / Pyrex)", "सोडा-लाइम कांच", "फ्लिंट कांच", "क्रुक्स कांच"),
            listOf("Borosilicate Glass (Pyrex - Low coefficient of thermal expansion ~3.3 x 10^-6 /K, highly resistant to thermal shock)", "Soda-Lime Glass", "Flint Glass", "Crookes Glass"),
            0,
            "बोरोसिलिकेट कांच में सिलिका (SiO2) के साथ बोरॉन ट्राइऑक्साइड (B2O3) मिलाया जाता है। इसका 'तापीय प्रसार गुणांक' (Thermal Expansion Coefficient) बहुत कम होता है, जिससे तेज गर्म या ठंडा करने पर भी यह चटकता नहीं है।",
            "Incorporation of B2O3 into the silica tetrahedral network lowers network connectivity and thermal expansion coefficient, preventing high internal thermal strain during rapid heating/cooling cycles.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q2", "sci_10",
            "धूप के चश्मों (Sunglasses) में पराबैंगनी किरणों (UV Rays) को रोकने के लिए किस विशेष 'क्रुक्स कांच' (Crookes Glass) का उपयोग किया जाता है जिसमें कौन-सा दुर्लभ मृदा ऑक्साइड होता है?",
            "Which optical glass, invented by Sir William Crookes for UV-protective sunglasses and spectacle lenses, contains which rare-earth lanthanide oxide to absorb harmful ultraviolet radiation?",
            listOf("सीरियम ऑक्साइड युक्त क्रुक्स कांच (Crookes Glass containing Cerium Oxide - CeO2)", "आयरन ऑक्साइड", "कैल्शियम ऑक्साइड", "जिंक ऑक्साइड"),
            listOf("Crookes Glass (contains Cerium Oxide CeO2 which absorbs UV photons without dimming visible light)", "Iron oxide", "Calcium oxide", "Zinc oxide"),
            0,
            "क्रुक्स कांच में 'सीरियम ऑक्साइड' (CeO2) होता है। सीरियम पराबैंगनी किरणों (UV किरणों) को पूर्णतः अवशोषित कर लेता है लेकिन सामान्य दृश्य प्रकाश को पार जाने देता है, जिससे आंखों की रक्षा होती है।",
            "Cerium ions (Ce4+/Ce3+) in the glass matrix undergo high-energy electronic transitions corresponding precisely to the ultraviolet absorption band (290-380 nm), shielding the retina from photochemical damage.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q3", "sci_10",
            "कांच को गहरा नीला (Deep Royal Blue) रंग प्रदान करने के लिए विनिर्माण के दौरान उसमें किस धातु का ऑक्साइड मिलाया जाता है?",
            "Which transition metallic compound is added to molten glass batches to impart an intense, brilliant Deep Cobalt Blue color (Cobalt Glass)?",
            listOf("कोबाल्ट ऑक्साइड (Cobalt Oxide - CoO / Co2O3)", "कॉपर ऑक्साइड", "क्रोमियम ऑक्साइड", "फेरस ऑक्साइड"),
            listOf("Cobalt Oxide (CoO - Imparts characteristic royal blue chromophore due to tetrahedral Co2+ coordination)", "Copper Oxide (Cu2O - Red)", "Chromium Oxide (Cr2O3 - Green)", "Ferrous Oxide (FeO - Bottle green)"),
            0,
            "कांच के रंग: कोबाल्ट ऑक्साइड (CoO) = गहरा नीला; क्रोमियम ऑक्साइड (Cr2O3) = हरा; क्यूप्रस ऑक्साइड (Cu2O) = लाल/रूबी; कैडमियम सल्फाइड (CdS) = पीला; मैंगनीज डाइऑक्साइड (MnO2) = बैंगनी; गोल्ड क्लोराइड (AuCl3) = रूबी लाल।",
            "Cobalt(II) cations enter tetrahedral interstitial sites within the silicate network; ligand field d-d electron transitions absorb yellow-red light, transmitting brilliant deep blue wavelengths.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q4", "sci_10",
            "कांच को धीरे-धीरे नियंत्रित गति से ठंडा करने की औद्योगिक प्रक्रिया क्या कहलाती है जिससे कांच के अंदर का आंतरिक तनाव (Internal Stress) समाप्त हो जाता है और वह मजबूत बनता है?",
            "The essential thermal processing step of slowly and uniformly cooling hot molded glassware in a lehr oven to relieve residual internal mechanical stresses is called:",
            listOf("तापनुशीतन / एनीलिंग (Annealing of Glass)", "क्वेंचिंग (तीव्र शीतलन)", "गैल्वनीकरण", "पाश्चुरीकरण"),
            listOf("Annealing (Slow controlled cooling below glass transition temperature Tg to eliminate thermal gradients and prevent spontaneous shattering)", "Quenching", "Galvanization", "Pasteurization"),
            0,
            "यदि कांच को तेजी से ठंडा किया जाए तो उसकी बाहरी सतह जल्दी सिकुड़ जाती है जबकि अंदर का भाग गर्म रहता है, जिससे कांच अत्यधिक भंगुर होकर स्वतः चटक जाता है। 'एनीलिंग' (Annealing) में कांच को घंटों तक धीरे-धीरे ठंडा किया जाता है।",
            "Annealing relaxes viscoelastic shear stresses frozen into the vitreous silica network during rapid forming, restoring structural homogeneity and mechanical impact resistance.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q5", "sci_10",
            "पोर्टलैंड सीमेंट (Portland Cement) की खोज 1824 में इंग्लैंड के किस राजमिस्त्री/आविष्कारक ने की थी?",
            "Who patented modern Portland Cement in 1824 after calcining finely ground limestone and clay in a kiln, naming it after the natural stone quarried in Dorset, England?",
            listOf("जोसेफ एस्पडिन (Joseph Aspdin)", "चार्ल्स गुडइयर", "हेनरी बेसेमर", "जॉन स्मीटन"),
            listOf("Joseph Aspdin (British bricklayer and inventor of Portland Cement)", "Charles Goodyear", "Henry Bessemer", "John Smeaton (Eddystone Lighthouse hydraulic lime)"),
            0,
            "1824 में जोसेफ एस्पडिन ने चूना पत्थर (Limestone) और चिकनी मिट्टी (Clay) को उच्च ताप पर भट्टी में पकाकर सीमेंट बनाई। जमने पर इसका रंग पोर्टलैंड के प्राकृतिक चूना पत्थर जैसा दिखता था, इसलिए इसे 'पोर्टलैंड सीमेंट' कहा गया।",
            "Joseph Aspdin synthesized artificial hydraulic cement by calcining pulverized limestone and clay slurry at clinkering temperatures, producing calcium silicates that set under water.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q6", "sci_10",
            "सीमेंट के निर्माण में 'जिप्सम' (Gypsum - CaSO4·2H2O) को 2% से 3% की मात्रा में क्यों मिलाया जाता है?",
            "Why is 2% to 3% Gypsum (Calcium Sulfate Dihydrate) routinely ground with cement clinker during the final manufacturing stage?",
            listOf("सीमेंट के जमने की दर को धीमा करने हेतु (To slow down / retard the initial setting time of cement)", "सीमेंट को तुरंत जमाने हेतु", "सीमेंट को सफेद करने हेतु", "सीमेंट का वजन बढ़ाने हेतु"),
            listOf("To retard the rapid flash-setting of Tricalcium Aluminate (C3A), allowing sufficient time for mixing, transportation, and placing of concrete", "To accelerate instant flash set", "To bleach cement white", "To increase density"),
            0,
            "सीमेंट में मौजूद ट्राईकैल्शियम एल्युमिनेट (C3A) पानी मिलते ही कुछ ही मिनटों में तुरंत जम जाता है (Flash Set)। जिप्सम C3A के साथ क्रिया करके 'एट्रिंगाइट' (Ettringite) की परत बना देता है, जिससे सीमेंट 30 मिनट से पहले नहीं जमता और मजदूरों को काम करने का समय मिल जाता है।",
            "Gypsum reacts with Tricalcium Aluminate (3CaO·Al2O3) to form insoluble calcium sulfoaluminate (ettringite) barrier crystals around C3A grains, retarding flash hydration.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q7", "sci_10",
            "पोर्टलैंड सीमेंट में सर्वाधिक मात्रा (60-65%) में कौन-सा रासायनिक यौगिक पाया जाता है?",
            "What is the predominant chemical oxide component present in standard Portland Cement (accounting for 60% to 65% by weight)?",
            listOf("चूना / कैल्शियम ऑक्साइड (Lime / Calcium Oxide - CaO)", "सिलिका (SiO2)", "एल्युमिना (Al2O3)", "मैग्नीशिया (MgO)"),
            listOf("Lime / Calcium Oxide (CaO - 60-67% derived from calcined calcium carbonate)", "Silica (SiO2 - 17-25%)", "Alumina (Al2O3 - 3-8%)", "Magnesia (MgO - 1-3%)"),
            0,
            "सीमेंट की संरचना: 1. चूना (CaO) = 60-65%, 2. सिलिका (SiO2) = 17-25%, 3. एल्युमिना (Al2O3) = 3-8%, 4. आयरन ऑक्साइड (Fe2O3) = 0.5-6%, 5. मैग्नीशिया (MgO) = 1-3%, 6. सल्फर ट्राइऑक्साइड (SO3) = 1-2%।",
            "Calcium oxide is the primary basic component that reacts with acidic silica and alumina inside rotary kilns at 1450°C to synthesize alite (C3S) and belite (C2S) cement phases.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q8", "sci_10",
            "सीमेंट में पानी मिलाने के बाद 28 दिनों तक चलने वाली रासायनिक मजबूती (Strength development) मुख्य रूप से किन दो सिलिकेट्स के जलयोजन (Hydration) से होती है?",
            "The ultimate compressive load-bearing mechanical strength of hardened concrete develops primarily from the hydration of which two Calcium Silicates?",
            listOf("ट्राईकैल्शियम सिलिकेट (C3S) एवं डाईकैल्शियम सिलिकेट (C2S)", "कैल्शियम कार्बोनेट और रेत", "जिप्सम और चूना", "सोडियम सिलिकेट"),
            listOf("Tricalcium Silicate (C3S / Alite - early 7-day strength) and Dicalcium Silicate (C2S / Belite - progressive long-term 28-day strength)", "Calcium carbonate and sand", "Gypsum and lime", "Sodium silicate"),
            0,
            "सीमेंट का मुख्य मजबूती प्रदाता 'C3S' (शुरुआती 7 दिन की मजबूती) और 'C2S' (दीर्घकालिक 28 दिन की मजबूती) है। पानी से क्रिया करने पर ये 'कैल्शियम सिलिकेट हाइड्रेट' (C-S-H जेल) बनाते हैं जो आपस में जुड़कर पत्थर जैसा मजबूत ढांचा बना लेता है।",
            "Hydration of alite and belite produces rigid fibrous Calcium-Silicate-Hydrate (C-S-H) tobermorite gel alongside crystalline portlandite Ca(OH)2, binding sand/aggregates into concrete matrix.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m6_q9", "sci_10",
            "कांच पर नक्काशी करने (Etching on Glass) या कांच को घोलने के लिए किस अत्यधिक संक्षारक अम्ल का उपयोग किया जाता है जिसे कांच की बोतलों में नहीं रखा जा सकता?",
            "Which highly corrosive halogen acid dissolves silica glass (forming soluble fluorosilicates) and must be stored in wax-lined or Teflon bottles for decorative Glass Etching?",
            listOf("हाइड्रोफ्लोरोइक अम्ल (Hydrofluoric Acid - HF)", "हाइड्रोक्लोरिक अम्ल (HCl)", "सल्फ्यूरिक अम्ल (H2SO4)", "नाइट्रिक अम्ल (HNO3)"),
            listOf("Hydrofluoric Acid (HF - SiO2 + 4HF -> SiF4 + 2H2O)", "Hydrochloric acid", "Sulfuric acid", "Nitric acid"),
            0,
            "हाइड्रोफ्लोरोइक एसिड (HF) कांच के सिलिकॉन डाइऑक्साइड (SiO2) के साथ क्रिया करके उसे घोल देता है: SiO2 + 4 HF → SiF4 ↑ + 2 H2O। इसलिए कांच पर नाम या डिजाइन लिखने (Etching) में HF का उपयोग होता है और इसे प्लास्टिक/टेफ्लॉन की बोतलों में रखा जाता है।",
            "HF selectively attacks bridging Si-O-Si siloxane bonds via nucleophilic fluoride attack to generate volatile silicon tetrafluoride (SiF4) and hexafluorosilicic acid (H2SiF6).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q10", "sci_10",
            "मिश्रित कंक्रीट (Concrete) में लोहे की छड़ें (TMT Rebars) डालकर 'प्रबलित कंक्रीट' (RCC - Reinforced Cement Concrete) क्यों बनाया जाता है?",
            "Why is Concrete reinforced with embedded steel rebar mesh (RCC) in bridges, pillars, and multistory buildings?",
            listOf("कंक्रीट संपीड़न (Compression) में मजबूत लेकिन तनाव (Tension) में कमजोर होता है, जबकि स्टील तनाव शक्ति प्रदान करता है और दोनों का तापीय प्रसार गुणांक लगभग समान होता है", "केवल कंक्रीट का वजन घटाने हेतु", "लोहे को जंग से बचाने हेतु", "कंक्रीट को पारदर्शी बनाने हेतु"),
            listOf("Concrete excels in compressive strength but has poor tensile strength; embedded steel provides immense tensile load capacity, and both share nearly identical thermal expansion coefficients (~12 x 10^-6 /°C)", "To reduce total weight", "To prevent steel rust only", "To make concrete transparent"),
            0,
            "साधारण कंक्रीट भारी वजन (दबाव) तो सह लेता है लेकिन मुड़ने या खिंचाव (Tension) पर तुरंत टूट जाता है। स्टील तनाव में बहुत मजबूत होता है। सबसे महत्वपूर्ण बात यह है कि स्टील और कंक्रीट दोनों गर्मी-सर्दी में एक ही दर से फैलते और सिकुड़ते हैं, जिससे दरारें नहीं पड़तीं।",
            "Structural RCC exploits the synergy between high compressive strength of concrete and high tensile/yield strength of ductile ribbed steel rebars, stabilized by identical coefficients of thermal expansion (alpha ~ 1.2 x 10^-5 /K).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q11", "sci_10",
            "प्लास्टर ऑफ पेरिस (Plaster of Paris - POP / टूटी हड्डियों को जोड़ने व मूर्तियों में प्रयुक्त) का रासायनिक सूत्र क्या है?",
            "What is the precise chemical formula of Plaster of Paris (POP), produced by heating Gypsum at 373 K (100°C)?",
            listOf("कैल्शियम सल्फेट हेमीहाइड्रेट (CaSO4·½H2O या 2CaSO4·H2O)", "CaSO4·2H2O (जिप्सम)", "CaCO3", "CaO"),
            listOf("Calcium Sulfate Hemihydrate (CaSO4·½H2O or (CaSO4)2·H2O)", "Calcium Sulfate Dihydrate (Gypsum)", "Calcium Carbonate", "Calcium Oxide"),
            0,
            "जिप्सम (CaSO4·2H2O) को 373 K (100°C) पर गर्म करने पर वह अपने तीन-चौथाई क्रिस्टल जल को खोकर 'कैल्शियम सल्फेट हेमीहाइड्रेट' (CaSO4·½H2O - POP) बन जाता है। पानी मिलाने पर यह 10-15 मिनट में पुनः जिप्सम बनकर ठोस हो जाता है और थोड़ा फैलता है।",
            "Controlled calcination of gypsum at 120-180°C removes 1.5 water molecules per formula unit to yield beta-hemihydrate; rehydration initiates an exothermic dissolution-crystallization reaction returning to interlaced gypsum crystals.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q12", "sci_10",
            "कैमरे के उच्च-गुणवत्ता वाले लेंस, प्रिज्म और सजावटी झूमर (Chandeliers) बनाने में किस उच्च अपवर्तनांक वाले कांच का उपयोग होता है?",
            "Which optical glass, containing 15% to 30% Lead Oxide (PbO) and possessing a very high refractive index and sparkling brilliance, is used for prisms, optical lenses, and cut crystal glassware?",
            listOf("फ्लिंट कांच / लेड क्रिस्टल ग्लास (Flint Glass / Lead Crystal Glass)", "सोडा-लाइम कांच", "पाइरेक्स कांच", "क्रुक्स कांच"),
            listOf("Flint Glass / Lead Glass (Refractive index n ~ 1.6 to 1.9, high dispersive power)", "Soda-Lime Glass", "Pyrex Glass", "Crookes Glass"),
            0,
            "फ्लिंट कांच में 'लेड ऑक्साइड' (PbO) मिलाया जाता है जिससे इसका अपवर्तनांक (Refractive index) बहुत अधिक हो जाता है। यह प्रकाश को रंगों में विभाजित करता है और हीरे जैसी चमक पैदा करता है। कैमरों के लेंस और प्रिज्म इसी से बनते हैं।",
            "Heavy lead ions (Pb2+) possess high polarizability, elevating the dielectric constant, refractive index (n > 1.65), and chromatic dispersion of flint glass for achromatic optical doublet lenses.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q13", "sci_10",
            "घरों की खिड़कियों के शीशे और कांच की साधारण बोतलें बनाने में सबसे सस्ता और 90% उत्पादित होने वाला कांच कौन-सा है?",
            "Which ubiquitous commercial glass formulation (accounting for over 90% of all manufactured glass, made from Silica, Soda ash, and Limestone) is used for window panes and glass jars?",
            listOf("सोडा-लाइम कांच / मृदु कांच (Soda-Lime Glass / Soft Glass - 70% SiO2 + 15% Na2O + 9% CaO)", "बोरोसिलिकेट कांच", "क्वार्ट्ज कांच", "फ्लिंट कांच"),
            listOf("Soda-Lime Glass (Commercial flat window glass and container bottles)", "Borosilicate Glass", "Quartz Glass", "Flint Glass"),
            0,
            "सोडा-लाइम कांच (SiO2 + Na2CO3 + CaCO3) सबसे साधारण और सस्ता कांच है। सोडा (Na2O) सिलिका के गलनांक को 1700°C से घटाकर 1400°C कर देता है और चूना (CaO) कांच को पानी में घुलने से रोकता है।",
            "Soda ash acts as a network flux lowering the melting point of quartz, while limestone (calcium oxide) restores chemical durability against aqueous dissolution.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q14", "sci_10",
            "ऑटोमोबाइल की विंडशील्ड में दुर्घटना के समय सिर में कांच के नुकीले टुकड़े न चुभने हेतु किस 'टफेंड ग्लास' (Tempered / Safety Glass) का उपयोग होता है?",
            "Tempered Safety Glass (used for car side windows and smartphone screen protectors) breaks into tiny, blunt, pebble-like granular chunks upon impact because of:",
            listOf("बाहरी सतह पर तीव्र संपीड़न तनाव (Compressive stress) और अंदर तन्यता तनाव की संतुलित संतुलन परत", "कांच में प्लास्टिक भरा होना", "कांच का पिघल जाना", "कांच का नरम होना"),
            listOf("High surface compressive stress induced by rapid thermal quenching, causing it to dice into blunt, harmless granular fragments rather than jagged shards", "Filled with liquid plastic", "Instant melting", "Low density"),
            0,
            "टेम्पर्ड ग्लास को 600°C पर गर्म करके ठंडी हवा के झोंकों से तेजी से ठंडा किया जाता है। इससे बाहरी सतह संपीड़न (Compression) में आ जाती है और कांच साधारण कांच से 5 गुना मजबूत हो जाता है। टूटने पर यह नुकीले टुकड़ों के बजाय गोल-मटोल दानों (Dicing) में बिखरता है।",
            "Thermal tempering freezes the outer surface while the molten core slowly contracts, inducing permanent surface compressive stresses (>10,000 psi) counterbalanced by interior tensile stress.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m6_q15", "sci_10",
            "चीनी मिट्टी के बर्तन (Ceramics / Porcelain / Bone China) बनाने में किस मुख्य सफेद एल्युमिनोसिलिकेट चिकनी मिट्टी का उपयोग किया जाता है?",
            "Which fine white refractory clay mineral, chemically known as Hydrated Aluminum Silicate (Al2Si2O5(OH)4), is the foundational raw material for ceramic Pottery and Porcelain?",
            listOf("काओलिन / चाइना क्ले (Kaolin / Kaolinite / China Clay)", "बेंटोनाइट", "जिप्सम", "चूना पत्थर"),
            listOf("Kaolinite / China Clay (Al2O3·2SiO2·2H2O fired at 1200-1400°C into vitrified porcelain)", "Bentonite", "Gypsum", "Limestone"),
            0,
            "काओलिन (चाइना क्ले) चीनी मिट्टी का मुख्य घटक है। इसे क्वार्ट्ज और फेल्डस्पार के साथ मिलाकर 1200-1400°C पर पकाया जाता है जिससे यह चमकदार, जलरोधी और विद्युत-कुचालक 'पोर्सिलेन' (Porcelain) में बदल जाता है। बिजली के खंभों के इंसुलेटर भी इसी से बनते हैं।",
            "Kaolinite undergoes thermal dehydroxylation into amorphous metakaolin at 550°C, transforming into crystalline mullite needles (3Al2O3·2SiO2) and cristobalite matrix during high-temperature ceramic firing.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 7: Chemical Fertilizers, Pesticides & Agricultural Chemistry (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m7_q1", "sci_10",
            "भारत में सर्वाधिक इस्तेमाल होने वाले नाइट्रोजन उर्वरक 'यूरिया' (Urea / Carbamide) में नाइट्रोजन की प्रतिशत मात्रा कितनी होती है?",
            "What is the standard industrial percentage of elemental Nitrogen (N) present in pure agricultural Urea fertilizer (NH2CONH2)?",
            listOf("46% नाइट्रोजन (46.0% Nitrogen - Highest solid nitrogen content)", "20%", "60%", "80%"),
            listOf("46.0% Nitrogen by weight (Formulated as white prills / granules)", "20.0%", "60.0%", "80.0%"),
            0,
            "यूरिया (NH2-CO-NH2) का आणविक भार 60 होता है जिसमें दो नाइट्रोजन (28 g) होते हैं: (28/60) × 100 = 46.6% (मानक 46%)। यह ठोस उर्वरकों में सर्वाधिक नाइट्रोजन वाला उर्वरक है। मिट्टी का 'यूरिएज' एंजाइम इसे अमोनियम कार्बोनेट में बदलता है।",
            "Agricultural urea synthesized via the Bosch-Meiser reaction (2 NH3 + CO2 -> NH2COONH4 -> NH2CONH2 + H2O) provides the highest nitrogen concentration (46% N) of all solid fertilizers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q2", "sci_10",
            "भारत सरकार ने यूरिया की कालाबाजारी रोकने और मिट्टी में नाइट्रोजन के धीरे-धीरे अवशोषण हेतु 2015 से किस यूरिया का 100% उत्पादन अनिवार्य किया है?",
            "To prevent illegal diversion to chemical industries and act as a natural nitrification inhibitor for gradual nutrient release, the Indian Government mandated 100% production of:",
            listOf("नीम-लेपित यूरिया (Neem Coated Urea - NCU)", "सल्फर यूरिया", "बायो-यूरिया", "तरल नाइट्रोजन"),
            listOf("Neem Coated Urea (NCU - Neem oil triterpenes inhibit Nitrosomonas bacteria, reducing nitrogen leaching and volatilization losses by 10-15%)", "Sulfur Urea", "Bio-Urea", "Liquid Nitrogen"),
            0,
            "नीम लेपित यूरिया पर नीम के तेल की पतली परत होती है। नीम में मौजूद 'मेलीसिन्स' (Nimbin, Azadirachtin) मिट्टी के नाइट्रोसोमोनास जीवाणुओं को धीमा कर देते हैं (Nitrification Inhibition), जिससे यूरिया धीरे-धीरे घुलता है और पौधों को 10-15% अधिक नाइट्रोजन मिलती है।",
            "Neem oil coatings act as a botanical nitrification inhibitor, retarding the microbial conversion of ammonium (NH4+) to volatile/leachable nitrate (NO3-), enhancing Nitrogen Use Efficiency (NUE).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q3", "sci_10",
            "भारतीय कृषि में 'डीएपी' (DAP - Di-Ammonium Phosphate) उर्वरक में नाइट्रोजन (N) और फास्फोरस (P2O5) का मानक अनुपात कितना होता है?",
            "What is the standard commercial nutrient composition grade (N-P-K) of Di-Ammonium Phosphate (DAP) fertilizer widely applied during sowing?",
            listOf("18% नाइट्रोजन एवं 46% फास्फोरस (18-46-0 N-P2O5-K2O)", "46% नाइट्रोजन एवं 18% फास्फोरस", "10-26-26", "20-20-0"),
            listOf("18% Nitrogen and 46% Phosphorus (18-46-0 grade - (NH4)2HPO4 providing water-soluble phosphate for root establishment)", "46% N and 18% P", "10-26-26", "20-20-0"),
            0,
            "DAP [(NH4)2HPO4] में 18% अमोनिकल नाइट्रोजन और 46% फास्फोरस (P2O5) होता है। यह बुवाई के समय (Basal Application) बीजों के साथ डाला जाता है ताकि पौधों की जड़ों का तेजी से विकास हो सके।",
            "Diammonium phosphate is produced by reacting anhydrous ammonia with phosphoric acid; its high water solubility ensures rapid availability of orthophosphate ions (H2PO4-) to seedling root systems.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q4", "sci_10",
            "पौधों में पोटाश (Potassium / K) की आपूर्ति हेतु इस्तेमाल होने वाले 'म्यूरेट ऑफ पोटाश' (MOP) का रासायनिक नाम और सूत्र क्या है?",
            "What is the chemical name and mineral formula of Muriate of Potash (MOP - containing 60% K2O), the primary source of potassium fertilizer in India?",
            listOf("पोटेशियम क्लोराइड (Potassium Chloride - KCl / Sylvite)", "पोटेशियम सल्फेट", "पोटेशियम नाइट्रेट", "पोटेशियम कार्बोनेट"),
            listOf("Potassium Chloride (KCl - Muriate of Potash containing 60% K2O)", "Potassium Sulfate (SOP)", "Potassium Nitrate", "Potassium Carbonate"),
            0,
            "MOP (म्यूरेट ऑफ पोटाश) रासायनिक रूप से 'पोटेशियम क्लोराइड' (KCl) है जिसमें 60% K2O होता है। भारत अपनी पोटाश की 100% आवश्यकता विदेशों (कनाडा, रूस, बेलारूस) से आयात करता है। पोटेशियम पौधों में रंध्रों (Stomata) के खुलने-बंद होने और रोगों से लड़ने की शक्ति देता है।",
            "Muriate of Potash is mined from evaporite sylvinite deposits; potassium activates over 60 plant enzymes and regulates guard cell osmotic turgor for stomatal transpiration.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q5", "sci_10",
            "दलहनी फसलों (Legumes - जैसे चना, मटर, सोयाबीन) की जड़ों की गांठों (Root Nodules) में रहकर वायुमंडलीय नाइट्रोजन का स्थिरीकरण करने वाला सहजीवी जीवाणु कौन-सा है?",
            "Which symbiotic nitrogen-fixing bacterium colonizes the root nodules of Leguminous crops, expressing Nitrogenase enzyme to convert atmospheric N2 into plant-usable Ammonia?",
            listOf("राइजोबियम (Rhizobium leguminosarum)", "एजोटोबैक्टर (Free-living)", "क्लोस्ट्रीडियम", "लैक्टोबैसिलस"),
            listOf("Rhizobium (Symbiotic proteobacteria synthesizing leghemoglobin to fix atmospheric N2 into NH3)", "Azotobacter (Free-living aerobe)", "Clostridium (Free-living anaerobe)", "Lactobacillus"),
            0,
            "राइजोबियम (Rhizobium) दलहनी पौधों की जड़ों में 'लेगहीमोग्लोबिन' (गुलाबी वर्णक) की मदद से ऑक्सीजन-मुक्त वातावरण में 'नाइट्रोजिनेस' एंजाइम द्वारा वायुमंडल की नाइट्रोजन को अमोनिया में बदल देता है। इससे मिट्टी की उर्वरता प्राकृतिक रूप से बढ़ जाती है।",
            "Rhizobium bacteroids utilize Mo-Fe nitrogenase enzyme complexes to break the triple bond of N2 (N≡N), powered by host plant malate and shielded from oxygen inactivation by oxygen-scavenging leghemoglobin.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q6", "sci_10",
            "पहला सिंथेटिक ऑर्गनोक्लोरीन कीटनाशक 'डीडीटी' (DDT) के कीटनाशक गुणों की खोज हेतु 1948 में किस वैज्ञानिक को नोबेल पुरस्कार मिला था?",
            "Who was awarded the 1948 Nobel Prize in Physiology or Medicine for discovering the potent insecticidal contact action of DDT against Malaria mosquitoes and Typhus lice?",
            listOf("पॉल हरमन मुलर (Paul Hermann Müller)", "रेचेल कार्सन", "अलेक्जेंडर फ्लेमिंग", "रॉबर्ट कोच"),
            listOf("Paul Hermann Müller (Swiss chemist who discovered DDT's insecticidal efficacy in 1939)", "Rachel Carson (Author of Silent Spring)", "Alexander Fleming", "Robert Koch"),
            0,
            "पॉल मुलर ने 1939 में DDT (डाईक्लोरो डाईफेनिल ट्राईक्लोरोएथेन) के कीटनाशक गुणों की खोज की जिसने द्वितीय विश्व युद्ध में लाखों सैनिकों को मलेरिया और टाइफस से बचाया। लेकिन बाद में इसके पर्यावरण में जमा होने (Bioaccumulation) के कारण 1970 के दशक में वैश्विक प्रतिबंध लगा।",
            "Paul Müller synthesized DDT's contact toxicity; DDT opens voltage-gated sodium ion channels in insect neurons, causing continuous firing, spasms, and death.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q7", "sci_10",
            "1962 में प्रकाशित किस प्रसिद्ध पुस्तक ने डीडीटी (DDT) के पक्षियों के अंडों के पतले होने और खाद्य श्रृंखला में जहर फैलने (Biomagnification) के खतरों को उजागर कर आधुनिक पर्यावरण आंदोलन की शुरुआत की?",
            "Which historic 1962 environmental science book by American marine biologist Rachel Carson documented the ecological devastations of synthetic organochlorine pesticides (DDT)?",
            listOf("'साइलेंट स्प्रिंग' (Silent Spring by Rachel Carson)", "द ओरिजिन ऑफ स्पीशीज", "द पॉपुलेशन बॉम्ब", "अर्थ इन द बैलेंस"),
            listOf("'Silent Spring' (Rachel Carson - Triggered global environmental awakening, leading to the establishment of the US EPA and the Stockholm Convention)", "The Origin of Species (Charles Darwin)", "The Population Bomb", "Earth in the Balance"),
            0,
            "रेचेल कार्सन की 'साइलेंट स्प्रिंग' ने दिखाया कि डीडीटी खाद्य श्रृंखला में शीर्ष पर स्थित पक्षियों (जैसे बाल्ड ईगल) में 'बायोमैग्निफिकेशन' द्वारा जमा हो जाता है, जिससे उनके अंडों के छिलके पतले होकर फूट जाते हैं। इस पुस्तक से 1972 में अमेरिका में DDT पर प्रतिबंध लगा।",
            "Silent Spring highlighted how lipophilic organochlorines bioaccumulate across trophic levels, inhibiting avian calcium adenosine triphosphatase and thinning eggshells, decimating bird populations.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q8", "sci_10",
            "कीटनाशक 'गैमेक्सीन' (Gammaxene / Lindane / 666) रासायनिक रूप से क्या है?",
            "The broad-spectrum agricultural insecticide Gammaxene (Lindane / BHC / 666) is chemically designated as:",
            listOf("बेंजीन हेक्साक्लोराइड / गामा-हेक्साक्लोरोसाइक्लोहेक्सेन (Benzene Hexachloride - BHC / gamma-HCH - C6H6Cl6)", "क्लोरोफॉर्म", "डीडीटी", "टेट्राक्लोरोएथेन"),
            listOf("gamma-Hexachlorocyclohexane (gamma-HCH / Lindane / C6H6Cl6 - Addition product of benzene and chlorine under UV light)", "Chloroform", "DDT", "Tetrachloroethane"),
            0,
            "गैमेक्सीन (BHC / 666 / लिंडेन) बेंजीन पर पराबैंगनी (UV) प्रकाश की उपस्थिति में क्लोरीन के योग (Addition) से बनता है: C6H6 + 3 Cl2 → C6H6Cl6। इसका 'गामा' समावयवी ही सबसे शक्तिशाली कीटनाशक होता है जो दीमक और फसलों के कीटों को मारता है।",
            "Lindane is the gamma-stereoisomer of 1,2,3,4,5,6-hexachlorocyclohexane; it acts as a non-competitive antagonist at the GABAA receptor chloride channel complex in insect central nervous systems.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q9", "sci_10",
            "मच्छरों को भगाने वाली 'ऑल आउट / गुड नाइट' जैसी इलेक्ट्रॉनिक वेपोराइजर मशीनों में किस सिंथेटिक कीटनाशक रसायन (Pyrethroid) का उपयोग होता है?",
            "Which synthetic Pyrethroid insecticide (analogous to natural pyrethrins extracted from Chrysanthemum flowers) is formulated in mosquito repellent liquid vaporizers?",
            listOf("ट्रांसफ्लुथ्रिन / प्रैलेथ्रिन / एलेथ्रिन (Transfluthrin / Prallethrin / Allethrin)", "डीडीटी", "पैराथियॉन", "एंडोसल्फान"),
            listOf("Transfluthrin / Prallethrin / Dimefluthrin (Volatile synthetic pyrethroids attacking insect voltage-gated sodium channels)", "DDT", "Parathion", "Endosulfan"),
            0,
            "मच्छर भगाने वाले लिक्विड में 'ट्रांसफ्लुथ्रिन' (Transfluthrin) या 'प्रैलेथ्रिन' जैसे सिंथेटिक पाइरेथ्रॉइड होते हैं। ये गुलदाउदी (Chrysanthemum) के फूलों के प्राकृतिक 'पाइरेथ्रिन' की नकल हैं। गर्म होने पर ये वाष्पीकृत होकर मच्छरों के तंत्रिका तंत्र को लकवाग्रस्त कर देते हैं।",
            "Volatile fluorinated pyrethroids like transfluthrin exhibit high vapor pressure at mild heating, binding insect neuronal sodium channels to cause hyper-excitation and knockdown without mammalian acetylcholinesterase inhibition.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q10", "sci_10",
            "केरल के कासरगोड जिले में काजू के बागानों पर हवाई छिड़काव के बाद गंभीर जन्मजात विकृतियों, कैंसर और तंत्रिका विकारों के कारण 2011 में सुप्रीम कोर्ट द्वारा किस कीटनाशक पर देशव्यापी प्रतिबंध लगाया गया?",
            "Which highly toxic organochlorine pesticide, banned nationwide by the Supreme Court of India in 2011 after causing massive congenital anomalies and neurotoxicity in Kasaragod (Kerala), is:",
            listOf("एंडोसल्फान (Endosulfan)", "मैलाथियान", "यूरिया", "जिप्सम"),
            listOf("Endosulfan (Cyclodiene organochlorine banned globally under the Stockholm Convention on Persistent Organic Pollutants)", "Malathion", "Urea", "Gypsum"),
            0,
            "एंडोसल्फान (Endosulfan) के कासरगोड में हेलीकॉप्टर से छिड़काव से पूरी पीढ़ी शारीरिक व मानसिक विकृतियों (Hydrocephalus, सेरेब्रल पाल्सी) का शिकार हो गई। 2011 में सुप्रीम कोर्ट ने इसके निर्माण, बिक्री और उपयोग पर पूर्ण प्रतिबंध लगा दिया।",
            "Endosulfan is a non-specific GABA antagonist and endocrine disruptor with high bioaccumulation potential in aquatic fat reserves, generating genotoxic teratogenicity in exposed rural populations.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q11", "sci_10",
            "धान (चावल) के खेतों में मिट्टी में नाइट्रोजन बढ़ाने हेतु किस 'नील-हरित शैवाल' (Blue-Green Algae / Cyanobacteria) और जलीय फर्न के सहजीवन का उपयोग बायोफर्टिलाइजर के रूप में किया जाता है?",
            "Which symbiotic association between the aquatic floating water fern 'Azolla' and nitrogen-fixing cyanobacteria 'Anabaena azollae' is widely applied as a green biofertilizer in lowland Rice paddy fields?",
            listOf("एजोला एवं एनाबीना (Azolla pinnata - Anabaena azollae symbiosis)", "स्पाइरोगाइरा", "फंगस", "ई. कोलाई"),
            listOf("Azolla-Anabaena symbiosis (Fixes up to 30-50 kg atmospheric Nitrogen per hectare in wet rice fields)", "Spirogyra", "Aspergillus fungus", "E. coli"),
            0,
            "एजोला (Azolla) एक छोटा जलीय फर्न है जिसके पत्तों की गुहाओं में 'एनाबीना' (Anabaena) नील-हरित शैवाल रहता है। यह प्रति हेक्टेयर 30-50 किग्रा नाइट्रोजन स्थिर करता है और हरी खाद बनकर चावल की पैदावार 20-30% बढ़ा देता है।",
            "Anabaena azollae heterocysts fix N2 inside the specialized dorsal leaf cavities of the water fern Azolla; incorporation into flooded paddy soil releases bioavailable ammonium upon biomass decay.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q12", "sci_10",
            "कीटनाशकों के वर्ग 'ऑर्गनोफॉस्फेट्स' (Organophosphates - जैसे Malathion, Chlorpyrifos) कीटनाशकों और मनुष्यों में किस महत्वपूर्ण न्यूरोट्रांसमीटर एंजाइम को रोककर तंत्रिका तंत्र को नष्ट करते हैं?",
            "Organophosphate and Carbamate insecticides exert acute neurotoxicity by irreversibly phosphorylating and inhibiting which vital synaptic enzyme?",
            listOf("एसिटाइलकोलीनएस्टरेज (Acetylcholinesterase - AChE enzyme)", "डीएनए पॉलीमरेज", "एमाइलेज", "पेप्सिन"),
            listOf("Acetylcholinesterase (AChE - Leading to toxic accumulation of acetylcholine at neuromuscular junctions and continuous muscle convulsions)", "DNA Polymerase", "Amylase", "Pepsin"),
            0,
            "ऑर्गनोफॉस्फेट (मैलाथियान, क्लोरपायरीफॉस) तंत्रिकाओं के 'एसिटाइलकोलीनएस्टरेज' एंजाइम को निष्क्रिय कर देते हैं। इससे सिनेप्स पर एसिटाइलकोलीन जमा रहता है और कीड़ों (व मनुष्यों) में मांसपेशियों के अनियंत्रित दौरे पड़ते हैं और दम घुटने से मृत्यु हो जाती है। इसका एंटीडोट 'एट्रोपिन' (Atropine) और 'Pralidoxime (2-PAM)' है।",
            "Organophosphates covalently phosphorylate the serine hydroxyl residue within the catalytic triad of acetylcholinesterase, causing cholinergic crisis via hyperstimulation of muscarinic/nicotinic receptors.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m7_q13", "sci_10",
            "अम्लीय मिट्टी (Acidic Soils - pH < 5.5) की अम्लीयता को उदासीन कर उसकी उर्वरता सुधारने हेतु किसान खेत में कौन-सा पदार्थ मिलाते हैं?",
            "Which agricultural soil conditioner (Agricultural Liming) is applied to neutralize excessive soil acidity and raise soil pH to optimal neutral ranges (6.0-7.0)?",
            listOf("बुझा हुआ चूना / चूना पत्थर / डोलोमाइट (Quicklime CaO / Slaked Lime Ca(OH)2 / CaCO3)", "जिप्सम (Gypsum)", "सल्फ्यूरिक एसिड", "यूरिया"),
            listOf("Agricultural Lime / Slaked Lime (CaCO3 / Ca(OH)2 / Dolomite CaMg(CO3)2 - neutralizes H+ and Al3+ toxicities)", "Gypsum (Used for Alkaline/Sodic soils)", "Sulfuric acid", "Urea"),
            0,
            "1. अम्लीय मिट्टी (Acidic Soil) को ठीक करने हेतु: चूना पत्थर (CaCO3) या बुझा हुआ चूना (Ca(OH)2) मिलाया जाता है। 2. क्षारीय मिट्टी (Alkaline/Sodic Soil - pH > 8.5) को ठीक करने हेतु: जिप्सम (CaSO4·2H2O) या पायराइट (FeS2) मिलाया जाता है।",
            "Agricultural liming neutralizes exchangeable acidic protons and precipitates phytotoxic trivalent aluminum (Al3+) as inert aluminum hydroxide, liberating plant-available orthophosphates.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q14", "sci_10",
            "विश्व की पहली नैनो-उर्वरक 'नैनो यूरिया तरल' (Nano Urea Liquid) को किस भारतीय सहकारी संस्था ने विकसित और व्यावसायिक रूप से लॉन्च किया है?",
            "Which premier Indian cooperative organization developed and patented the world's first liquid 'Nano Urea' and 'Nano DAP' at its Kalol laboratory in Gujarat?",
            listOf("इफको (IFFCO - Indian Farmers Fertiliser Cooperative Limited)", "कृभको (KRIBHCO)", "नाबार्ड (NABARD)", "आईसीएआर (ICAR)"),
            listOf("IFFCO (Indian Farmers Fertiliser Cooperative Limited - Developed proprietary nitrogen nanoparticles 20-50 nm with >80% nutrient uptake efficiency)", "KRIBHCO", "NABARD", "ICAR"),
            0,
            "इफको (IFFCO) ने गुजरात के कलोल स्थित नैनो बायोटेक्नोलॉजी रिसर्च सेंटर (NBRC) में नैनो यूरिया विकसित किया। 500 मिली की एक बोतल नैनो यूरिया 45 किग्रा की एक पूरी पारंपरिक यूरिया की बोरी के बराबर काम करती है और पत्तियों पर सीधे स्प्रे से 80% से अधिक अवशोषित होती है।",
            "IFFCO Nano Urea comprises encapsulated nitrogen nanoparticles (20-50 nm) that penetrate through foliar stomatal apertures, delivering targeted nitrogen directly to photosynthetic mesophyll cells.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m7_q15", "sci_10",
            "जैविक खेती में कीट नियंत्रण हेतु प्रयुक्त 'नीम के अर्क' (Neem Extract) में पाया जाने वाला मुख्य सक्रिय कीटनाशक जैव-रसायन कौन-सा है?",
            "What is the primary bio-active limonoid triterpenoid compound present in Azadirachta indica (Neem seeds) that acts as a potent insect antifeedant, repellent, and growth regulator?",
            listOf("एज़ाडिरैक्टिन (Azadirachtin)", "निकोटिन", "कैफीन", "मॉर्फिन"),
            listOf("Azadirachtin (Tetranortriterpenoid limonoid disrupting insect ecdysone steroid hormone synthesis and molting)", "Nicotine", "Caffeine", "Morphine"),
            0,
            "नीम के बीजों में 'एज़ाडिरैक्टिन' (Azadirachtin) पाया जाता है। यह कीटों के 'एक्डायसोन' (Ecdysone) हार्मोन को रोककर उनके कायांतरण (Molting) को रोक देता है और कीटों को भोजन खाने से रोकता है। यह मधुमक्खियों और इंसानों के लिए पूरी तरह सुरक्षित है।",
            "Azadirachtin acts as an antifeedant via gustatory chemoreceptor deterrence while downregulating prothoracicotropic hormone (PTTH) and ecdysteroid titers to cause larval developmental arrest.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 8: Explosives, Propellants & Pyrotechnics Chemistry (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m8_q1", "sci_10",
            "1867 में अल्फ्रेड नोबेल ने 'डायनामाइट' (Dynamite) विस्फोटक का आविष्कार किस अत्यधिक अस्थिर तरल विस्फोटक को कीसलगुर (Kieselguhr मिट्टी) में सोखकर किया था?",
            "Alfred Nobel tamed the dangerous volatility of liquid Nitroglycerine in 1867 to invent safe, handleable Dynamite by absorbing it into which porous diatomaceous earth?",
            listOf("नाइट्रोग्लिसरीन एवं कीसलगुर (Nitroglycerine absorbed in Kieselguhr diatomaceous earth)", "टीएनटी", "आरडीएक्स", "गनपाउडर"),
            listOf("Nitroglycerine / Glyceryl Trinitrate - GTN absorbed into inert Kieselguhr silica earth", "TNT", "RDX", "Gunpowder"),
            0,
            "नाइट्रोग्लिसरीन [C3H5(ONO2)3] थोड़ा सा झटका लगने पर भी फट जाता था। 1867 में अल्फ्रेड नोबेल ने इसे 'कीसलगुर' (डायटोमेशियस मिट्टी) में सोखकर ठोस बत्तियां बनाईं और ब्लास्टिंग कैप (डिटोनेटर) बनाया, जिसे 'डायनामाइट' नाम दिया गया। इसी से अर्जित धन से नोबेल पुरस्कार स्थापित हुए।",
            "Nitroglycerine undergoes violent self-propagating detonation upon shock wave compression; absorption into porous amorphous silica (Kieselguhr) dampens mechanical sensitivity without sacrificing explosive energy.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q2", "sci_10",
            "मानव इतिहास का सबसे पहला रासायनिक विस्फोटक 'गनपाउडर' (Gunpowder / Black Powder - बारूद) किन तीन पदार्थों का मिश्रण है?",
            "Ancient Black Powder (Gunpowder), invented in 9th-century China, is a deflagrating pyrotechnic intimate mixture of Potassium Nitrate (Saltpetre), Charcoal, and:",
            listOf("पोटेशियम नाइट्रेट (75%), चारकोल (15%) एवं सल्फर (10%) (KNO3 + C + S)", "सोडियम क्लोराइड और रेत", "यूरिया और चीनी", "चूना और तेल"),
            listOf("75% Potassium Nitrate (KNO3 / Saltpetre - Oxidizer), 15% Charcoal (Fuel), and 10% Sulfur (Ignition reducer)", "Sodium chloride + sand", "Urea + sugar", "Lime + oil"),
            0,
            "बारूद (Black Powder) का मानक अनुपात 75:15:10 होता है: 1. पोटेशियम नाइट्रेट (शोरा / Shora - ऑक्सीकारक जो ऑक्सीजन देता है), 2. चारकोल (ईंधन जो CO2 बनाता है), 3. सल्फर (जो प्रज्वलन तापमान को घटाता है)। 2 KNO3 + S + 3 C → K2S + N2 ↑ + 3 CO2 ↑।",
            "Black powder deflagrates via rapid solid-state redox reaction: potassium nitrate decomposes to liberate oxygen, oxidizing charcoal and sulfur into rapidly expanding hot N2 and CO2 gases.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q3", "sci_10",
            "सैन्य उपयोग में प्रयुक्त शक्तिशाली प्लास्टिक विस्फोटक 'आरडीएक्स' (RDX / Cyclonite / Hexogen) का पूर्ण रासायनिक नाम क्या है?",
            "What is the official chemical IUPAC designation of the military high explosive RDX (Research Department Explosive / Cyclonite / T4)?",
            listOf("साइक्लोट्राइमेथिलीन ट्राइनाइट्रामाइन (Cyclotrimethylenetrinitramine - C3H6N6O6)", "ट्राईनाइट्रोटोल्यूइन", "ट्राईनाइट्रोफिनोल", "पेंटाएरिथ्रिटॉल टेट्रानाइट्रेट"),
            listOf("Cyclotrimethylenetrinitramine (1,3,5-trinitro-1,3,5-triazinane / Hexogen / RDX)", "Trinitrotoluene (TNT)", "Trinitrophenol (Picric Acid)", "Pentaerythritol Tetranitrate (PETN)"),
            0,
            "RDX को 'साइक्लोनाइट' (Cyclonite) या 'हेक्सोजन' (Hexogen) कहते हैं। इसे यूरोट्रोपिन (हेक्सामेथिलीन टेट्रामाइन) के नाइट्रिकरण से बनाया जाता है। इसमें वैक्स और प्लास्टिसाइजर मिलाकर 'C-4' (Plastic Explosive) बनाया जाता है। इसका विस्फोट वेग 8,750 मीटर/सेकंड होता है।",
            "RDX is an aliphatic nitramine compound with extremely high detonation velocity (~8750 m/s) and high chemical stability, forming the primary explosive filler in plastic explosive compositions (C-4 and Semtex).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q4", "sci_10",
            "पीले रंग का ठोस सैन्य विस्फोटक 'टीएनटी' (TNT) रासायनिक रूप से किस कार्बनिक यौगिक के तीव्र नाइट्रिकरण से प्राप्त होता है?",
            "Trinitrotoluene (TNT), the international benchmark explosive for measuring bomb yields (e.g., kilotons of TNT), is synthesized by step-wise nitration of:",
            listOf("टोल्यूइन (Toluene - C6H5CH3 with HNO3 and H2SO4)", "बेंजीन", "फिनोल", "नेफ्थलीन"),
            listOf("Toluene (Methylbenzene - synthesized by electrophilic aromatic nitration to 2,4,6-trinitrotoluene C7H5N3O6)", "Benzene", "Phenol", "Naphthalene"),
            0,
            "टोल्यूइन (C6H5CH3) को सांद्र HNO3 और H2SO4 के मिश्रण से गर्म करने पर 2,4,6-ट्राईनाइट्रोटोल्यूइन (TNT) बनता है। इसका गलनांक 81°C होता है, इसलिए इसे आसानी से पिघलाकर तोप के गोलों और बमों में भरा जा सकता है। यह झटके के प्रति सुरक्षित होता है।",
            "TNT possesses three electron-withdrawing nitro groups on the aromatic toluene core, balancing detonation energy with remarkably low impact and friction sensitivity, enabling safe melting and casting into munitions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q5", "sci_10",
            "खदानों में चट्टानों को उड़ाने हेतु प्रयुक्त सबसे सस्ता और लोकप्रिय औद्योगिक वाणिज्यिक विस्फोटक 'एएनएफओ' (ANFO) किन दो पदार्थों का मिश्रण है?",
            "The dominant bulk commercial mining blasting agent ANFO (accounting for >80% of global industrial explosives) is a stoichiometric mixture of:",
            listOf("अमोनियम नाइट्रेट (94%) एवं डीजल/फ्यूल ऑयल (6%) (Ammonium Nitrate + Fuel Oil - ANFO)", "यूरिया और पेट्रोल", "सोडियम नाइट्रेट और अल्कोहल", "पोटेशियम क्लोरेट और केरोसिन"),
            listOf("Ammonium Nitrate prills (94%) and Fuel Oil / Diesel (6%) [3 NH4NO3 + CH2 -> 3 N2 + 7 H2O + CO2]", "Urea and Petrol", "Sodium Nitrate and Alcohol", "Potassium Chlorate and Kerosene"),
            0,
            "ANFO (अमोनियम नाइट्रेट फ्यूल ऑयल) में 94% छिद्रयुक्त अमोनियम नाइट्रेट की गोलियां और 6% डीजल होता है। यह अपने आप में बिल्कुल सुरक्षित होता है (माचिस से नहीं जलता) और इसे फोड़ने हेतु एक शक्तिशाली बूस्टर (डिटोनेटर/प्राइमर) की आवश्यकता होती है।",
            "ANFO operates at an exact zero oxygen balance where stoichiometric fuel oil ensures complete oxidation of ammonium nitrate into harmless N2, H2O vapor, and CO2, maximizing gas expansion volume.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q6", "sci_10",
            "आतिशबाजी (Firecrackers / Fireworks) में आकाश में 'चमकीला लाल' (Crimson Red) और 'चमकीला हरा' (Vivid Green) रंग उत्पन्न करने के लिए क्रमशः किन धातुओं के लवण मिलाए जाते हैं?",
            "In pyrotechnic aerial fireworks, brilliant Crimson Red and Vivid Green flash colors are produced by electron excitation of salts of which two alkaline earth metals respectively?",
            listOf("स्ट्रोंशियम (लाल रंग) एवं बेरियम (हरा रंग) (Strontium for Red & Barium for Green)", "सोडियम (लाल) और कॉपर (हरा)", "कैल्शियम (लाल) और मैग्नीशियम (हरा)", "पोटेशियम (लाल) और आयरन (हरा)"),
            listOf("Strontium salts (SrCO3 / Sr(NO3)2 for Crimson Red, emitting at 650 nm) and Barium salts (Ba(NO3)2 / BaCl2 for Apple Green, emitting at 505 nm)", "Sodium and Copper", "Calcium and Magnesium", "Potassium and Iron"),
            0,
            "आतिशबाजी के रंग (Pyrotechnic Colors): स्ट्रोंशियम (Sr) = लाल रंग; बेरियम (Ba) = हरा रंग; कॉपर/तांबा (Cu) = नीला रंग; सोडियम (Na) = पीला रंग; कैल्शियम (Ca) = नारंगी रंग; मैग्नीशियम/एल्युमीनियम (Mg/Al) = चमकदार सफेद/सिल्वर रोशनी।",
            "Thermal excitation in pyrotechnic flame promotes metallic valence electrons; radiative relaxation back to ground states emits sharp atomic spectral emission lines (SrCl mono-radical for red, BaCl for green).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q7", "sci_10",
            "रॉकेटों के 'ठोस प्रणोदक' (Solid Rocket Propellant - जैसे ISRO के PSLV के प्रथम चरण PS1 में) में मुख्य ऑक्सीकारक (Oxidizer) कौन-सा रासायनिक लवण होता है?",
            "In solid composite rocket propellants (such as ISRO's PSLV / SSLV boosters), which crystalline inorganic perchlorate salt acts as the primary Oxidizer blended with Aluminum fuel powder?",
            listOf("अमोनियम परक्लोरेट (Ammonium Perchlorate - NH4ClO4 / APCP)", "पोटेशियम नाइट्रेट", "सोडियम क्लोराइड", "अमोनियम सल्फेट"),
            listOf("Ammonium Perchlorate (NH4ClO4 in Hydroxyl-Terminated Polybutadiene - HTPB polymer binder with fine metallic Aluminum powder fuel)", "Potassium nitrate", "Sodium chloride", "Ammonium sulfate"),
            0,
            "ISRO के ठोस रॉकेट मोटर में 'APCP' (अमोनियम परक्लोरेट कम्पोजिट प्रोपेलेंट) भरा होता है। इसमें 68-70% अमोनियम परक्लोरेट (ऑक्सीकारक), 15-20% एल्युमीनियम पाउडर (ईंधन) और 12-14% HTPB (बहुलक बाइंडर) होता है। यह अत्यधिक तीव्र थ्रस्ट पैदा करता है।",
            "Ammonium Perchlorate Composite Propellant (APCP) undergoes rapid continuous deflagration; thermal breakdown of NH4ClO4 generates HClO4 which vigorously oxidizes molten aluminum particles at flame temperatures >3000 K.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m8_q8", "sci_10",
            "क्रायोजेनिक रॉकेट इंजन (Cryogenic Rocket Engine - जैसे ISRO के GSLV Mk III / LVM3 में) में 'तरल ईंधन' और 'तरल ऑक्सीकारक' के रूप में किन दो अत्यधिक ठंडी गैसों का उपयोग किया जाता है?",
            "In advanced Cryogenic Rocket Stages, which two ultra-low temperature liquefied gases are combusted as liquid fuel and liquid oxidizer respectively?",
            listOf("तरल हाइड्रोजन (-253°C पर ईंधन) एवं तरल ऑक्सीजन (-183°C पर ऑक्सीकारक) (Liquid H2 Fuel + Liquid O2 Oxidizer / LH2 + LOX)", "तरल नाइट्रोजन और तरल हीलियम", "तरल मीथेन और तरल कार्बन डाइऑक्साइड", "तरल अमोनिया और तरल क्लोरीन"),
            listOf("Liquid Hydrogen (LH2 at -253°C / 20 K as Fuel) and Liquid Oxygen (LOX at -183°C / 90 K as Oxidizer)", "Liquid Nitrogen and Liquid Helium", "Liquid Methane and Liquid CO2", "Liquid Ammonia and Liquid Chlorine"),
            0,
            "क्रायोजेनिक चरण में तरल हाइड्रोजन (LH2) को -253°C पर और तरल ऑक्सीजन (LOX) को -183°C पर रखा जाता है। इनके जलने से केवल शुद्ध जलवाष्प (H2O) और भारी मात्रा में ऊर्जा निकलती है। इसका विशिष्ट आवेग (Specific Impulse ~450 सेकंड) सभी रासायनिक ईंधनों में सर्वाधिक होता है।",
            "The stoichiometric hydrolox (LH2/LOX) reaction 2 H2 + O2 -> 2 H2O generates an extraordinarily high characteristic exhaust velocity (~4400 m/s) due to the ultra-low molecular weight of pure water vapor exhaust.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q9", "sci_10",
            "पीले रंग का विस्फोटक 'पिक्रिक एसिड' (Picric Acid) रासायनिक रूप से कौन-सा ट्राइ-नाइट्रो यौगिक है?",
            "Picric Acid, historically utilized as a major yellow military artillery shell explosive (Lyddite / Melinite) and biological tissue fixative, is chemically:",
            listOf("2,4,6-ट्राईनाइट्रोफिनोल (2,4,6-Trinitrophenol - TNP / C6H2(NO2)3OH)", "ट्राईनाइट्रोटोल्यूइन", "ट्राईनाइट्रोबेंजीन", "नाइट्रोग्लिसरीन"),
            listOf("2,4,6-Trinitrophenol (TNP / Picric Acid - Strongly acidic yellow crystalline compound)", "Trinitrotoluene (TNT)", "Trinitrobenzene", "Nitroglycerine"),
            0,
            "पिक्रिक एसिड (2,4,6-ट्राईनाइट्रोफिनोल) फिनोल के तीन नाइट्रो समूहों (-NO2) से जुड़ने से बनता है। नाइट्रो समूहों के प्रबल इलेक्ट्रॉन खींचने के कारण इसका फिनोलिक हाइड्रोजन बहुत अम्लीय हो जाता है। यह धातुओं के साथ क्रिया करके अत्यधिक संवेदनशील विस्फोटक 'पिक्रेट्स' बनाता है।",
            "Three strong electron-withdrawing nitro groups stabilize the phenolate conjugate base via resonance delocalization, making picric acid a strong organic acid (pKa 0.38) and powerful shock-detonating explosive.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q10", "sci_10",
            "माचिस की तीली के सिरे (Matchstick Head) और माचिस की डिब्बी की रगड़ने वाली सतह (Striking Surface) पर क्रमशः कौन-से रसायन लगे होते हैं?",
            "In Safety Matches, what are the principal chemical compositions on the Match Head and the Friction Striking Surface of the matchbox respectively?",
            listOf("तीली के सिरे पर: पोटेशियम क्लोरेट (KClO3) व एंटीमनी सल्फाइड; डिब्बी पर: लाल फास्फोरस (Red Phosphorus) व कांच का चूरा", "तीली पर लाल फास्फोरस और डिब्बी पर बारूद", "तीली पर सल्फर और डिब्बी पर नमक", "तीली पर सोडियम और डिब्बी पर मोम"),
            listOf("Match head: Potassium Chlorate (KClO3 oxidizer) + Antimony Trisulfide (Sb2S3 fuel); Striking surface: Red Phosphorus + powdered glass binder", "Red phosphorus on match head", "Sulfur on match head and salt on box", "Sodium on match head"),
            0,
            "सेफ्टी माचिस में: 1. डिब्बी की रगड़ने वाली सतह पर: अहानिकर 'लाल फास्फोरस' (Red Phosphorus), कांच का चूरा और गोंद होता है। 2. तीली के सिरे पर: पोटेशियम क्लोरेट (KClO3 - ऑक्सीकारक), एंटीमनी ट्राइसल्फाइड (Sb2S3) और सल्फर होता है। रगड़ने पर घर्षण से थोड़ा लाल फास्फोरस सफेद फास्फोरस में बदलकर जल उठता है।",
            "Friction heat converts a trace of red phosphorus into volatile white phosphorus, which spontaneously ignites in air, decomposing potassium chlorate to release oxygen and combust the antimony trisulfide fuel.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q11", "sci_10",
            "अत्यधिक संवेदनशील प्राथमिक विस्फोटक 'मरकरी फुल्मिनेट' [Hg(ONC)2] और 'लेड एजाइड' [Pb(N3)2] का उपयोग विस्फोटकों में किस रूप में किया जाता है?",
            "Highly shock-sensitive primary explosives such as Mercury Fulminate [Hg(ONC)2] and Lead Azide [Pb(N3)2] are specifically deployed inside:",
            listOf("ब्लास्टिंग कैप / डिटोनेटर (Blasting Caps / Detonators to initiate secondary explosives)", "पटाखों के मुख्य बारूद में", "रॉकेट ईंधन में", "सीमेंट में"),
            listOf("Detonators and Percussion Primers (Initiates a supersonic shock wave to detonate less sensitive secondary charges like TNT/RDX)", "Main firecracker filler", "Rocket propellant", "Cement"),
            0,
            "प्राथमिक विस्फोटक (Primary Explosives - जैसे लेड एजाइड, मरकरी फुल्मिनेट) थोड़ी सी चिंगारी, घर्षण या चोट से तुरंत विस्फोट कर देते हैं। इनका उपयोग 'डिटोनेटर' (Detonator) में किया जाता है ताकि मुख्य सुरक्षित विस्फोटक (TNT, RDX, ANFO) को धमाके से उड़ाया जा सके।",
            "Primary explosives possess very low activation energy for deflagration-to-detonation transition (DDT), generating immediate supersonic detonation shock waves within millimeters of initiation.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m8_q12", "sci_10",
            "हार्ट अटैक (Angina Pectoris / सीने में तेज दर्द) के आपातकालीन इलाज में जीभ के नीचे रखी जाने वाली दवा के रूप में किस विस्फोटक रसायन का उपयोग किया जाता है?",
            "Which powerful liquid explosive compound (Glyceryl Trinitrate - GTN) is pharmacologically prescribed as a sublingual vasodilator tablet to treat acute Angina Pectoris chest pain?",
            listOf("नाइट्रोग्लिसरीन (Nitroglycerine / Glyceryl Trinitrate - GTN)", "टीएनटी", "आरडीएक्स", "पिक्रिक एसिड"),
            listOf("Nitroglycerine (Sublingual tablet converted in vascular endothelium into Nitric Oxide - NO, dilating coronary arteries)", "TNT", "RDX", "Picric acid"),
            0,
            "नाइट्रोग्लिसरीन विस्फोटक होने के साथ-साथ एक चमत्कारी दवा है। जीभ के नीचे रखने पर यह तुरंत घुलकर रक्त वाहिकाओं में 'नाइट्रिक ऑक्साइड' (NO) गैस छोड़ता है। NO धमनियों को चौड़ा (Vasodilation) कर देता है जिससे हृदय की मांसपेशियों को तुरंत रक्त मिलने लगता है और दिल का दौरा रुक जाता है।",
            "Mitochondrial aldehyde dehydrogenase (ALDH-2) biotransforms nitroglycerine into nitric oxide (NO), stimulating soluble guanylyl cyclase to elevate cGMP and dephosphorylate myosin light chains for smooth muscle vasodilation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q13", "sci_10",
            "विमानों और रॉकेटों के निर्माण में 'प्रणोदक' (Propellant) और साधारण 'विस्फोटक' (Explosive) में क्या मुख्य कार्यात्मक अंतर होता है?",
            "What is the fundamental thermodynamic difference between a Rocket Propellant and a High Military Explosive?",
            listOf("प्रणोदक नियंत्रित गति से जलकर (Deflagration) गैसों का थ्रस्ट पैदा करते हैं, जबकि उच्च विस्फोटक अति-तीव्र गति से पराध्वनिक शॉक वेव (Detonation >6000 m/s) बनाकर सब कुछ नष्ट कर देते हैं", "प्रणोदक कभी जलते नहीं", "दोनों एक ही हैं", "विस्फोटक में कोई ऊर्जा नहीं होती"),
            listOf("Propellants undergo controlled subsonic Deflagration to produce sustained expanding gas thrust; High explosives undergo supersonic Detonation (>6000-9000 m/s) generating crushing shock waves", "Propellants never burn", "Both are identical", "Explosives contain zero energy"),
            0,
            "1. प्रणोदक (Propellant / प्रपेलेंट): नियंत्रित दर से सबसोनिक गति (मीटर/सेकंड) पर जलता है (Deflagration) जिससे रॉकेट को लगातार धक्का (Thrust) मिलता है। 2. उच्च विस्फोटक (High Explosive): सुपरसोनिक गति (6000-9000 मीटर/सेकंड) पर शॉक वेव के साथ फटता है (Detonation) जिससे भारी विध्वंस होता है।",
            "Deflagration propagates via thermal heat conduction below the local speed of sound; Detonation propagates as a self-sustaining supersonic shock wave compressing and chemically decomposing the explosive mass at gigapascal pressures.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m8_q14", "sci_10",
            "पटाखों में 'चमकदार सफेद प्रकाश' (Bright White Flash) और 'चिंगारियां' उत्पन्न करने के लिए किस धातु के बारीक चूर्ण का उपयोग किया जाता है?",
            "Finely atomized powders of which two lightweight reactive metals are blended in pyrotechnic sparkles and flashbang stun grenades to generate blinding white thermal flashes?",
            listOf("मैग्नीशियम एवं एल्युमीनियम (Magnesium and Aluminum metal powders)", "तांबा और लोहा", "सोना और चांदी", "सोडियम और पोटेशियम"),
            listOf("Magnesium (Mg - Burns with intense ultraviolet/white flame at ~3100°C) and Aluminum (Al - Produces silver glitter cascades)", "Copper and Iron", "Gold and Silver", "Sodium and Potassium"),
            0,
            "मैग्नीशियम पाउडर हवा की ऑक्सीजन में जलकर 3100°C का भयंकर तापमान और अंधा कर देने वाला चमकदार सफेद प्रकाश (MgO) पैदा करता है। फुलझड़ियों में लोहे का बुरादा (सोने जैसी चिंगारियां) और एल्युमीनियम पाउडर (सिल्वर रोशनी) मिलाया जाता है।",
            "Highly exothermic oxidation of magnesium (2 Mg + O2 -> 2 MgO, delta H = -1204 kJ/mol) generates immense black-body incandescent continuum radiation peaking in the near-ultraviolet and visible spectrum.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m8_q15", "sci_10",
            "आधुनिक प्लास्टिक विस्फोटक 'सेमटेक्स' (Semtex) किन दो उच्च विस्फोटकों का मिश्रण होता है?",
            "The famous moldable, odorless commercial and military plastic explosive Semtex (developed in Czechoslovakia) is primarily a blend of RDX and:",
            listOf("पीईटीएन (PETN - Pentaerythritol Tetranitrate) एवं आरडीएक्स (RDX)", "टीएनटी और चारकोल", "गनपाउडर और मोम", "यूरिया और पिक्रिक एसिड"),
            listOf("PETN (Pentaerythritol Tetranitrate) and RDX (Cyclonite) plasticized with styrene-butadiene rubber and dioctyl phthalate", "TNT and Charcoal", "Gunpowder and Wax", "Urea and Picric Acid"),
            0,
            "सेमटेक्स (Semtex) में PETN (पेंटाएरिथ्रिटॉल टेट्रानाइट्रेट) और RDX का मिश्रण होता है जिसमें तेल और रबर प्लास्टिसाइजर मिलाकर इसे आटे की तरह लचीला बनाया जाता है। इसे -40°C से +60°C तक किसी भी तापमान पर हाथ से किसी भी सांचे में ढाला जा सकता है।",
            "Semtex blends high-velocity PETN with thermal-resistant RDX bound in a viscoelastic polymer matrix, making it malleable, waterproof, and extremely lethal across broad operating temperatures.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 9: Dyes, Pigments, Paints, Inks & Cosmetics Chemistry (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m9_q1", "sci_9",
            "भारत में चुनावों में फर्जी मतदान रोकने हेतु उंगली पर लगाई जाने वाली 'अमिट स्याही' (Indelible Electoral Ink) में कौन-सा प्रकाश-संवेदी रासायनिक यौगिक होता है?",
            "Which light-sensitive silver salt, formulated in Indian Electoral Indelible Ink by the National Physical Laboratory (NPL) and Mysore Paints, stains the skin with black metallic silver?",
            listOf("सिल्वर नाइट्रेट (Silver Nitrate - AgNO3)", "सिल्वर ब्रोमाइड", "सिल्वर आयोडाइड", "सिल्वर क्लोराइड"),
            listOf("Silver Nitrate (AgNO3 - Reacts with skin proteins and sunlight to precipitate indelible insoluble metallic Silver and Ag2O)", "Silver Bromide (Photographic film)", "Silver Iodide (Artificial rain)", "Silver Chloride"),
            0,
            "अमिट स्याही (Electoral Ink) में 10% से 18% 'सिल्वर नाइट्रेट' (AgNO3) होता है। त्वचा पर लगते ही यह त्वचा के प्रोटीन और पसीने के नमक से क्रिया करता है। धूप (UV किरणों) के संपर्क में आते ही यह अपचयित होकर काला अघुलनशील 'धात्विक चांदी' (Metallic Silver / Ag2O) बन जाता है जो साबुन या तेजाब से भी नहीं छूटता और केवल नई त्वचा आने पर ही हटता है।",
            "Silver nitrate reacts with epidermal amino acid sulfhydryl and carboxyl groups to form silver proteinates, which photochemically reduce under ambient UV light into colloidal black elemental silver nanoparticles bound to the stratum corneum.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q2", "sci_10",
            "1856 में 18 वर्षीय विलियम हेनरी पर्किन द्वारा दुर्घटनावश खोजी गई दुनिया की 'पहली सिंथेटिक डाई' (First Synthetic Organic Dye) कौन-सी थी?",
            "Which was the world's first synthetic aniline dye, accidentally discovered in 1856 by 18-year-old William Henry Perkin while attempting to synthesize malaria drug Quinine?",
            listOf("मॉवीन / एनिलीन पर्पल (Mauveine / Mauve / Aniline Purple)", "इंडिगो (नील)", "एलिज़ेरिन", "मिथाइल ऑरेंज"),
            listOf("Mauveine (Perkin's Mauve / Aniline Purple - Triggered the birth of the global synthetic chemical dye industry)", "Indigo", "Alizarin", "Methyl Orange"),
            0,
            "1856 में विलियम पर्किन कोलतार (Coal tar) से कुनैन बनाने की कोशिश कर रहे थे, तभी उन्होंने पाया कि एनिलीन के ऑक्सीकरण से एक सुंदर चमकीला बैंगनी रंग बनता है, जिसे 'मॉवीन' (Mauveine) नाम दिया गया। इसने सिंथेटिक डाई उद्योग की नींव रखी।",
            "Mauveine is a complex mixture of four related phenylphenazonium aromatic dyes formed by potassium dichromate oxidation of impure aniline containing ortho- and para-toluidine.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q3", "sci_10",
            "जींस (Blue Denim Jeans) को उसका पारंपरिक गहरा नीला रंग देने वाली ऐतिहासिक डाई 'इंडिगो' (Indigo / नील) रासायनिक रूप से किस श्रेणी की डाई है?",
            "Indigo, the ancient blue dye historically extracted from Indigofera tinctoria plants (and famously linked to the 1917 Champaran Satyagraha), is chemically classified as a:",
            listOf("वैट डाई (Vat Dye - Insoluble keto form reduced to soluble Leuco-indigo)", "अम्लीय डाई", "मूल डाई", "एज़ो डाई"),
            listOf("Vat Dye (Insoluble indigo pigment reduced in alkaline 'vat' with sodium dithionite into soluble leuco-indigo, which oxidizes back to blue on cotton upon air exposure)", "Acid Dye", "Basic Dye", "Azo Dye"),
            0,
            "इंडिगो एक 'वैट डाई' (Vat Dye) है। यह पानी में अघुलनशील होती है। इसे रंगाई हेतु पहले क्षारीय घोल में अपचयित करके रंगहीन 'ल्यूको-इंडिगो' (Leuco-indigo) बनाया जाता है। जब कपड़ा हवा में सूखता है, तो ऑक्सीजन इसे पुनः गहरे नीले अघुलनशील इंडिगो में बदल देती है।",
            "Vat dyeing exploits the reversible two-electron redox equilibrium between insoluble conjugated indigotin and water-soluble diphenolate leuco-indigo anion, locked inside fiber capillaries upon atmospheric re-oxidation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q4", "sci_10",
            "प्रयोगशाला में अम्ल-क्षार अनुमापन (Acid-Base Titration) में प्रयुक्त 'फिनोलफ्थेलीन' (Phenolphthalein Indicator) क्षारीय माध्यम में कौन-सा रंग देता है?",
            "What distinct color transition is displayed by the synthetic organic indicator Phenolphthalein when added to a basic / alkaline solution (pH > 8.3)?",
            listOf("गुलाबी / मैजेंटा रंग (Deep Pink / Magenta in basic medium; Colorless in acidic medium)", "पीला रंग", "नीला रंग", "हरा रंग"),
            listOf("Deep Pink / Magenta color in alkaline solution (pH 8.3-10.0), remaining completely Colorless in acidic and neutral solutions", "Yellow color", "Blue color", "Green color"),
            0,
            "फिनोलफ्थेलीन (Phenolphthalein) अम्लीय और उदासीन माध्यम में पूरी तरह 'रंगहीन' (Colorless) रहता है। लेकिन जैसे ही क्षार (जैसे NaOH) डाला जाता है और pH 8.3 से ऊपर जाता है, यह अपने क्विनोनॉइड रूप में बदलकर 'चमकीला गुलाबी' (Pink) हो जाता है।",
            "Deprotonation of phenolphthalein's phenolic lactone ring in alkali triggers structural isomerization into a resonant, conjugated triphenylmethane quinonoid dianion absorbing at 553 nm (pink).",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q5", "sci_10",
            "सफेद पेंट (White Paints), सनस्क्रीन लोशन और टूथपेस्ट में सफेदी और अपारदर्शिता (Opacity) प्रदान करने वाला सबसे प्रमुख सफेद वर्णक (White Pigment) कौन-सा है?",
            "Which premier white inorganic pigment (known for highest refractive index n=2.7 and extreme UV-scattering power) is used universally in white wall paints and broad-spectrum sunscreens?",
            listOf("टाइटेनियम डाइऑक्साइड (Titanium Dioxide - TiO2 / Rutile & Anatase)", "जिंक सल्फाइड", "कैल्शियम कार्बोनेट", "लेड कार्बोनेट"),
            listOf("Titanium Dioxide (TiO2 - Rutile crystal phase providing exceptional brightness, opacity, and UV absorption)", "Zinc Sulfide", "Calcium Carbonate", "White Lead (Basic lead carbonate)"),
            0,
            "टाइटेनियम डाइऑक्साइड (TiO2) दुनिया का सबसे महत्वपूर्ण सफेद वर्णक है। इसका अपवर्तनांक (2.7) हीरे से भी अधिक होता है, जिससे यह प्रकाश को पूरी तरह बिखेरकर अत्यधिक सफेदी और छुपाने की शक्ति (Opacity) देता है। सनस्क्रीन में यह हानिकारक UV किरणों को परावर्तित करता है।",
            "Rutile TiO2 nanoparticles possess a wide semiconductor bandgap (~3.0 eV) and high refractive index, scattering visible light efficiently while acting as a physical UV-A and UV-B optical filter.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q6", "sci_10",
            "नेल पॉलिश (Nail Polish / Nail Enamel) को हटाने वाले 'नेल पॉलिश रिमूवर' (Nail Polish Remover) में मुख्य सक्रिय कार्बनिक विलायक कौन-सा होता है?",
            "Which volatile organic solvent (ketone/ester) is the primary fast-evaporating active ingredient in commercial Nail Polish Removers?",
            listOf("एसीटोन / प्रोपेनोन या एथिल एसीटेट (Acetone / Propanone - CH3COCH3 or Ethyl Acetate)", "मेथनॉल", "सल्फ्यूरिक एसिड", "फॉर्मेलिन"),
            listOf("Acetone (Propanone - CH3COCH3) or non-acetone Ethyl Acetate (CH3COOC2H5)", "Methanol", "Sulfuric acid", "Formalin"),
            0,
            "नेल पॉलिश में नाइट्रोसेल्युलोज का बहुलक होता है। एसीटोन (CH3COCH3) या एथिल एसीटेट एक शक्तिशाली ध्रुवीय-अध्रुवीय विलायक है जो नेल पॉलिश के फिल्म-बहुलक को तुरंत घोलकर रुई पर उतार देता है।",
            "Acetone's carbonyl dipole rapidly breaks secondary intermolecular dispersion forces stabilizing dry nitrocellulose/resin films, solvating polymer chains into a free-flowing solution.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q7", "sci_10",
            "महिलाओं की लिपस्टिक (Lipstick) को उसका गहरा लाल रंग देने वाला प्राकृतिक 'कारमाइन डाई' (Carmine / Cochineal / E120) किस कीट से प्राप्त किया जाता है?",
            "The natural crimson-red pigment Carmine (Cochineal extract / Carminic acid, E120), widely formulated in luxury Lipsticks and food products, is harvested from:",
            listOf("कोचीनियल कीट / कैक्टस पर रहने वाला कीट (Cochineal scale insects - Dactylopius coccus)", "रेशमकीट", "मधुमक्खी", "तितली"),
            listOf("Cochineal Scale Insects (Dactylopius coccus females feeding on Opuntia cacti, yielding aluminum lake of carminic acid)", "Silkworms", "Honeybees", "Butterflies"),
            0,
            "कारमाइन (Carmine / E120) कैक्टस पर रहने वाले सूखे मादा 'कोचीनियल' कीटों से निकाला जाने वाला प्राकृतिक चमकीला लाल रंग है। इसमें 'कार्मीनिक एसिड' होता है। यह सुरक्षित और प्रकाश-स्थिर होता है, इसलिए लिपस्टिक, आईशैडो और लाल पेय पदार्थों में इस्तेमाल होता है।",
            "Carminic acid is a natural anthraquinone glycoside extracted from crushed cochineal scale insects, precipitated with aluminum and calcium salts into insoluble, photostable crimson Carmine lake pigment.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q8", "sci_10",
            "मेहंदी (Henna / Lawsonia inermis) के पत्तों में पाया जाने वाला कौन-सा प्राकृतिक रंजक अणु बालों और त्वचा के केराटिन प्रोटीन से जुड़कर गहरा लाल-भूरा रंग देता है?",
            "Which natural lawsone napthoquinone active dye molecule present in dried Henna leaves (Mehendi) binds covalently to hair and skin Keratin protein to impart a reddish-brown stain?",
            listOf("लॉसोन / 2-हाइड्रॉक्सी-1,4-नैफ्थोक्विनोन (Lawsone / Hennotannic Acid)", "करक्यूमिन", "लाइकोपीन", "एंथोसायनिन"),
            listOf("Lawsone (2-hydroxy-1,4-naphthoquinone - Undergoes Michael addition with keratin amino acid lysine/cysteine residues)", "Curcumin", "Lycopene", "Anthocyanin"),
            0,
            "मेहंदी में 'लॉसोन' (Lawsone) रंग वर्णक होता है। जब मेहंदी का पेस्ट त्वचा पर लगाया जाता है, तो लॉसोन के अणु त्वचा की मृत कोशिकाओं के 'केराटिन' प्रोटीन के अमीनो एसिड से स्थायी रूप से जुड़ जाते हैं। ऑक्सीजन के संपर्क में यह रंग धीरे-धीरे गहरा लाल-भूरा हो जाता है।",
            "Lawsone small molecules diffuse across the stratum corneum, undergoing non-enzymatic nucleophilic addition with sulfhydryl and amine groups of native keratin, producing a wash-resistant chromophoric stain.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q9", "sci_10",
            "घरों में दीवारों पर पुताई करने वाले सस्ते 'सफेद सफेदा' (Lithopone Pigment) में किन दो अघुलनशील अकार्बनिक लवणों का सह-अवक्षेपित मिश्रण होता है?",
            "Lithopone, a cost-effective white pigment historically utilized in interior wall emulsions and oil paints, is an equimolar co-precipitated mixture of:",
            listOf("जिंक सल्फाइड (ZnS) एवं बेरियम सल्फेट (BaSO4) (Zinc Sulfide + Barium Sulfate - ZnS + BaSO4)", "कैल्शियम क्लोराइड और नमक", "कॉपर सल्फेट और रेत", "सोडियम सल्फेट और चूना"),
            listOf("Zinc Sulfide (ZnS ~30%) and Barium Sulfate (BaSO4 ~70%) [ZnSO4 + BaS -> ZnS + BaSO4]", "Calcium Chloride and Salt", "Copper Sulfate and Sand", "Sodium Sulfate and Lime"),
            0,
            "लिथोफोन (Lithopone) जिंक सल्फेट और बेरियम सल्फाइड के मिश्रण से बनाया जाता है: ZnSO4 + BaS → ZnS ↓ + BaSO4 ↓। यह दोनों अघुलनशील सफेद अवक्षेप मिलकर एक सस्ता, गैर-विषाक्त और टिकाऊ सफेद रंग बनाते हैं जो H2S गैस से काला नहीं पड़ता।",
            "Lithopone co-precipitation delivers an intimate blend of refractive ZnS (n=2.37) and inert extender BaSO4 (n=1.64), offering high resistance to sulfide atmospheric discoloration compared to toxic white lead.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m9_q10", "sci_10",
            "बालों को डाई करने वाले 'हेयर डाई' (Hair Dyes) में बालों के क्यूटिकल को खोलने और बालों के प्राकृतिक रंग को ब्लीच करने हेतु किन दो प्रमुख रसायनों का उपयोग होता है?",
            "Permanent oxidative Hair Dyes utilize an alkaline agent to swell the hair cuticle and an oxidizer to bleach melanin and couple dye precursors, respectively:",
            listOf("अमोनिया (Ammonia - क्यूटिकल खोलने हेतु) एवं हाइड्रोजन परॉक्साइड (H2O2 - ब्लीचिंग हेतु)", "सल्फ्यूरिक एसिड और नमक", "एसिटिक एसिड और अल्कोहल", "सोडियम क्लोराइड और पानी"),
            listOf("Ammonia (Alkalizing agent opening cuticle scales) and Hydrogen Peroxide (H2O2 developer bleaching melanin and polymerizing PPD)", "Sulfuric acid and salt", "Acetic acid and alcohol", "Sodium chloride and water"),
            0,
            "हेयर डाई में: 1. अमोनिया (या MEA) बाल के क्यूटिकल को फुलाकर रंग को अंदर जाने का रास्ता देता है। 2. हाइड्रोजन परॉक्साइड (H2O2) प्राकृतिक मेलेनिन को ब्लीच करता है और डाई के अणुओं (PPD - पैराफेनिलीनडायमीन) को आपस में जोड़कर बड़ा अणु बना देता है जो बाल के अंदर बंद हो जाता है।",
            "Ammonia elevates pH to ~9-10, swelling the hydrophobic lipid hair cortex; H2O2 oxidizes primary aromatic diamine precursors (p-phenylenediamine / PPD) and couplers into large indo-dye polymeric networks inside the cortex.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q11", "sci_10",
            "लिटमस पेपर (Litmus Paper - प्राकृतिक अम्ल-क्षार सूचक) किस पौधे/जीव (Symbiotic Organism) से निष्कर्षित किया जाता है?",
            "Natural Litmus indicator dye (turning Red in acid and Blue in base) is historically extracted from which symbiotic composite organism?",
            listOf("लाइकेन / शैवाक (Lichens - Roccella tinctoria)", "गुलाब का फूल", "नीम का पेड़", "अमरबेल"),
            listOf("Lichens (Symbiotic partnership of Fungi and Algae/Cyanobacteria, specifically Roccella tinctoria / Dendrographa)", "Rose petals", "Neem tree", "Cuscuta"),
            0,
            "लिटमस एक प्राकृतिक सूचक (Natural Indicator) है जिसे 'लाइकेन' (Lichen - कवक और शैवाल का सहजीवन) से निकाला जाता है। उदासीन लिटमस का रंग बैंगनी होता है। यह अम्ल में लाल (Acid turns Blue litmus Red) और क्षार में नीला (Base turns Red litmus Blue) हो जाता है।",
            "Litmus is a chromogenic mixture of 10-15 distinct chromophoric azolitmin and erythrolitmin phenolic oligomers extracted from Roccella species that undergo reversible protonation/deprotonation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q12", "sci_10",
            "अत्यधिक जहरीली 'सफेद सीसा' (White Lead - 2PbCO3·Pb(OH)2) जो ऐतिहासिक रूप से सफेद पेंटों में प्रयुक्त होती थी, पर प्रतिबंध क्यों लगाया गया?",
            "Why was the historic white paint pigment 'White Lead' (Basic Lead Carbonate) banned globally under international public health conventions?",
            listOf("सीसा (Lead) एक संचयी भारी धातु जहर है जो बच्चों में दिमागी विकास अवरुद्ध, बौद्धिक मंदता (Low IQ) और तंत्रिका क्षति करता है", "यह जल में घुल जाता था", "यह आग लगा देता था", "यह सफेद नहीं था"),
            listOf("Lead is a cumulative neurotoxin causing irreversible cognitive developmental deficits, encephalopathy, and anemia upon ingestion/inhalation of peeling paint chips", "It dissolved instantly in rain", "It caused explosions", "It was not white"),
            0,
            "लेड पेंट की सूखी पपड़ियां मीठी होती हैं। बच्चे जब इन्हें चबा लेते हैं, तो सीसा (Pb) रक्त और हड्डियों में जमा होकर उनके मस्तिष्क को स्थायी रूप से क्षतिग्रस्त (सीसा विषाक्तता / Lead Poisoning) कर देता है। इसलिए 1970 के दशक के बाद सभी घरों में लेड पेंट प्रतिबंधित कर दिए गए।",
            "Lead cations (Pb2+) substitute for Ca2+ and Zn2+ in biological systems, crossing the blood-brain barrier to disrupt synaptic pruning, neurotransmitter release, and heme ferrochelatase synthesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q13", "sci_10",
            "बॉलपॉइंट पेन की स्याही (Ballpoint Pen Ink) में तेजी से सूखने और न फैलने के लिए किस विलायक और बहुलक का उपयोग होता है?",
            "Modern oil-based Ballpoint Pen Inks, formulated as viscous non-Newtonian thixotropic pastes that dry instantaneously on paper without feathering, utilize:",
            listOf("फेनॉक्सीएथेनॉल / बेंजाइल अल्कोहल विलायक एवं रेजिन रंजक (Phenoxyethanol solvent + Phthalocyanine dyes + Polyvinylpyrrolidone)", "शुद्ध पानी केवल", "सल्फ्यूरिक एसिड", "शुद्ध पेट्रोल"),
            listOf("Glycol / Phenoxyethanol solvents carrying high concentrations (40-50%) of synthetic phthalocyanine / triarylmethane dyes dissolved in polymeric resins", "Pure water only", "Sulfuric acid", "Pure petrol"),
            0,
            "बॉलपॉइंट पेन की स्याही में 40-50% गाढ़ा डाई घोल होता है जिसे 'फेनॉक्सीएथेनॉल' या ग्लाइकोल विलायक में घोला जाता है। इसमें थिक्सोट्रोपिक बहुलक होते हैं जो रोलर बॉल घूमने पर तरल बनकर बहते हैं लेकिन कागज पर लगते ही तुरंत स्थिर होकर सूख जाते हैं।",
            "Ballpoint ink displays shear-thinning thixotropy; rotational shear from the tungsten carbide ball bearing lowers ink viscosity locally, allowing uniform deposition onto paper fibers where solvent quickly penetrates.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q14", "sci_10",
            "पेंट (Paints) में प्रयुक्त 'अलसी का तेल' (Linseed Oil) किस घटक के रूप में कार्य करता है जो हवा की ऑक्सीजन से क्रिया कर एक ठोस सुरक्षात्मक चमकदार परत बनाता है?",
            "In traditional oil-based paints and varnishes, Raw or Boiled Linseed Oil functions as which essential component that polymerizes upon atmospheric oxidation?",
            listOf("सुखाने वाला तेल / बाइंडर (Drying Oil / Film-Forming Binder)", "विलायक (Thinner)", "वर्णक (Pigment)", "फिलर"),
            listOf("Drying Oil / Binder (Polyunsaturated triglycerides cross-link via oxidative polymerization into a tough, glossy linoxin polymer film)", "Volatile Thinner", "Inorganic Pigment", "Mineral Filler"),
            0,
            "पेंट के मुख्य घटक: 1. वर्णक (Pigment - रंग व अपारदर्शिता देता है), 2. बाइंडर/सुखाने वाला तेल (अलसी का तेल - जो सूखकर परत बनाता है), 3. थिनर/विलायक (तारपीन का तेल - जो पेंट को पतला करता है), 4. ड्रायर (धात्विक साबुन जो सुखाने की गति बढ़ाते हैं)।",
            "Linseed oil is rich in linolenic acid (C18:3); atmospheric oxygen attacks allylic methylene groups to form lipid hydroperoxides that decompose into free radicals, cross-linking triglycerides into a 3D linoxin thermoset film.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m9_q15", "sci_10",
            "इत्र और परफ्यूम (Perfumes) में सुगंधित वाष्पशील तेलों (Essential Oils) को लंबे समय तक त्वचा पर टिकाए रखने हेतु किस 'फिक्सेटिव' (Fixative) रसायन का उपयोग किया जाता है?",
            "In fine fragrance and perfumery chemistry, which non-volatile, high-molecular-weight compounds (Fixatives, e.g., Benzyl Benzoate / synthetic Musks) are added to:",
            listOf("सुगंधित वाष्पशील तेलों के वाष्पीकरण की दर को धीमा करने और खुशबू को लंबे समय तक बनाए रखने हेतु", "खुशबू को तुरंत उड़ाने हेतु", "परफ्यूम को रंगहीन करने हेतु", "परफ्यूम को गाढ़ा करने हेतु"),
            listOf("Retard the evaporation rates of lighter volatile top-note and heart-note fragrance molecules, providing long-lasting base scent longevity", "To instantly evaporate all scent", "To bleach the fragrance", "To turn perfume into solid wax"),
            0,
            "परफ्यूम में तीन स्तर की खुशबू होती है: टॉप नोट (तुरंत उड़ने वाली), मिडिल नोट (हृदय नोट), और बेस नोट। फिक्सेटिव (जैसे सिंथेटिक मस्क, बेंजोइन रेजिन, चंदन का तेल) वाष्प दाब को कम कर देते हैं जिससे खुशबू कई घंटों या दिनों तक धीमी गति से निकलती रहती है।",
            "Fixatives lower the thermodynamic vapor pressure and activity coefficients of volatile monoterpenoid aroma chemicals by forming hydrophobic dispersion complexes, standardizing evaporation kinetics.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 10: Pharmaceuticals, Medicinal Chemistry & Chemotherapy (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_10_m10_q1", "sci_10",
            "दर्द निवारक (Analgesic) और बुखार कम करने वाली (Antipyretic) सर्वाधिक लोकप्रिय दवा 'पैरासिटामोल' (Paracetamol / Acetaminophen) का रासायनिक नाम क्या है?",
            "What is the official IUPAC chemical name of the world's most widely consumed over-the-counter analgesic and antipyretic drug Paracetamol (Acetaminophen)?",
            listOf("एन-(4-हाइड्रॉक्सीफेनिल)एसिटामाइड / 4-एसिटामिडोफिनोल (N-(4-hydroxyphenyl)acetamide / N-acetyl-para-aminophenol - APAP)", "एसिटाइलसैलिसिलिक एसिड", "मिथाइल सैलिसिलेट", "सोडियम बेंजोएट"),
            listOf("N-(4-hydroxyphenyl)acetamide / 4-Acetamidophenol (APAP / Paracetamol - Acts on hypothalamic thermoregulatory center)", "Acetylsalicylic acid (Aspirin)", "Methyl Salicylate (Oil of Wintergreen)", "Sodium Benzoate"),
            0,
            "पैरासिटामोल का रासायनिक नाम '4-एसिटामिडोफिनोल' (APAP) है। यह मस्तिष्क के हाइपोथैलेमस में तापमान नियंत्रक केंद्र पर कार्य करके पसीना बढ़ाकर बुखार घटाता है और केंद्रीय तंत्रिका तंत्र में प्रोस्टाग्लैंडीन संश्लेषण को रोककर दर्द कम करता है। अधिक खुराक लिवर को नुकसान पहुंचाती है।",
            "Paracetamol acts as a selective central nervous system COX-3 / peroxidase inhibitor and indirect cannabinoid CB1 agonist (via AM404 metabolite), dissipating heat via cutaneous peripheral vasodilation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q2", "sci_10",
            "दर्द, सूजन और गठिया के इलाज के साथ-साथ दिल के दौरे (Heart Attack) की रोकथाम हेतु रक्त को पतला करने वाली प्रसिद्ध दवा 'एस्पिरिन' (Aspirin) का रासायनिक नाम क्या है?",
            "What is the chemical name of Aspirin, synthesized by Felix Hoffmann at Bayer in 1897, which irreversibly inhibits blood platelet COX-1 enzyme to prevent arterial blood clots?",
            listOf("एसिटाइलसैलिसिलिक एसिड (Acetylsalicylic Acid - C9H8O4 / ASA)", "सैलिसिलिक एसिड", "मिथाइल सैलिसिलेट", "फिनाइल सैलिसिलेट (सेलोल)"),
            listOf("Acetylsalicylic Acid (ASA - C9H8O4 / Acetylated derivative of salicylic acid from willow bark)", "Salicylic Acid", "Methyl Salicylate", "Phenyl Salicylate (Salol)"),
            0,
            "एस्पिरिन 'एसिटाइलसैलिसिलिक एसिड' (ASA) है। यह सैलिसिलिक एसिड और एसिटिक एनहाइड्राइड की क्रिया से बनती है। यह प्लेटलेट्स में 'साइक्लोऑक्सीजिनेज-1' (COX-1) एंजाइम को स्थायी रूप से एसिटिलेट कर थ्रोम्बोक्सेन-A2 का निर्माण रोक देती है जिससे रक्त के थक्के नहीं जमते और हार्ट अटैक से बचाव होता है।",
            "Aspirin transfers its acetyl moiety covalently to Serine-529 residue of platelet COX-1, irreversibly shutting down Thromboxane A2 (TXA2) biosynthesis for the entire 8-10 day lifespan of circulating platelets.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q3", "sci_10",
            "1928 में सर अलेक्जेंडर फ्लेमिंग द्वारा खोजी गई दुनिया की 'पहली एंटीबायोटिक' (First Miracle Antibiotic) कौन-सी थी जो फफूंद (Fungus) से प्राप्त की गई थी?",
            "Which revolutionary first true antibiotic was serendipitously discovered by Sir Alexander Fleming in 1928 from a contaminating mold Penicillium notatum (Nobel Prize in 1945)?",
            listOf("पेनिसिलिन (Penicillin / Benzylpenicillin - Penicillin G)", "स्ट्रेप्टोमाइसिन", "टेट्रासाइक्लिन", "क्लोरैम्फेनिकॉल"),
            listOf("Penicillin (Beta-lactam antibiotic derived from Penicillium notatum / P. chrysogenum mold)", "Streptomycin", "Tetracycline", "Chloramphenicol"),
            0,
            "1928 में अलेक्जेंडर फ्लेमिंग ने देखा कि 'पेनिसिलियम नोटेटम' फफूंद के चारों ओर स्टेफिलोकोकस बैक्टीरिया नष्ट हो गए। बाद में हॉवर्ड फ्लोरी और अर्न्स्ट चेन ने इसे शुद्ध रूप में दवा बनाया (1945 का नोबेल)। पेनिसिलिन बैक्टीरिया की कोशिका भित्ति के निर्माण (पेप्टिडोग्लाइकन क्रॉस-लिंकिंग) को रोककर उन्हें नष्ट करती है।",
            "Penicillin contains a reactive four-membered beta-lactam ring fused to a thiazolidine ring; it acylates transpeptidase enzymes (penicillin-binding proteins - PBPs), causing osmotic bacterial cell lysis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q4", "sci_10",
            "आमाशय में अत्यधिक एसिडिटी, सीने में जलन (Heartburn) और गैस्ट्रिक अल्सर को शांत करने हेतु इस्तेमाल होने वाले 'मिल्क ऑफ मैग्नीशिया' (Milk of Magnesia) का रासायनिक सूत्र क्या है?",
            "What is the chemical composition of the widely prescribed mild antacid suspension 'Milk of Magnesia', which neutralizes excess gastric hydrochloric acid without causing alkalosis?",
            listOf("मैग्नीशियम हाइड्रोक्साइड [Magnesium Hydroxide - Mg(OH)2]", "सोडियम हाइड्रोक्साइड", "कैल्शियम कार्बोनेट", "एल्यूमीनियम क्लोराइड"),
            listOf("Magnesium Hydroxide [Mg(OH)2 - Neutralizes HCl into MgCl2 + H2O and acts as an osmotic laxative]", "Sodium Hydroxide (Strong caustic base)", "Calcium Carbonate", "Aluminum Chloride"),
            0,
            "मिल्क ऑफ मैग्नीशिया [Mg(OH)2 का जलीय निलंबन] एक दुर्बल क्षार है। यह पेट के अतिरिक्त हाइड्रोक्लोरिक एसिड को उदासीन करता है: Mg(OH)2 + 2 HCl → MgCl2 + 2 H2O। सोडियम बाइकार्बोनेट (Eno) तुरंत राहत देता है लेकिन पेट में CO2 गैस बनाकर डकार पैदा करता है।",
            "Magnesium hydroxide possesses low aqueous solubility, providing sustained neutralization of hyperchlorhydria without systemic absorption; unabsorbed magnesium ions draw water into the colonic lumen.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q5", "sci_10",
            "पूतिरोधी (Antiseptics) और विसंक्रामक (Disinfectants) में सबसे प्रमुख अंतर क्या है?",
            "In pharmacological chemical hygiene, what is the critical operational distinction between 'Antiseptics' and 'Disinfectants'?",
            listOf("पूतिरोधी (Antiseptics) जीवित मानव त्वचा और घावों पर सुरक्षित रूप से लगाए जाते हैं, जबकि विसंक्रामक (Disinfectants) निर्जीव वस्तुओं (फर्श, औजार, ड्रेनेज) पर प्रयुक्त होते हैं", "दोनों केवल निर्जीव वस्तुओं हेतु हैं", "दोनों केवल त्वचा हेतु हैं", "विसंक्रामक को खाया जा सकता है"),
            listOf("Antiseptics are applied safely to Living biological tissues (wounds, cuts, skin); Disinfectants are toxic chemicals applied strictly to Inanimate non-living surfaces (floors, surgical tools, drains)", "Both are for inanimate objects only", "Both are safe for skin only", "Disinfectants are edible medications"),
            0,
            "1. पूतिरोधी (Antiseptics - जैसे डेटॉल, सैवलोन, टिंचर आयोडीन, बोरिक एसिड): जीवित त्वचा और घावों पर लगाए जाते हैं। 2. विसंक्रामक (Disinfectants - जैसे 1% फिनोल, ब्लीचिंग पाउडर, क्लोरीन, फिनाइल): अत्यधिक संक्षारक होते हैं और केवल फर्श, टॉयलेट व औजारों की सफाई में काम आते हैं। (नोट: 0.2% फिनोल एंटीसेप्टिक है, जबकि 1% फिनोल डिसइंफेक्टेंट है)।",
            "Antiseptics exhibit low cytotoxicity, destroying vegetative microorganisms on living epithelial tissue without provoking tissue necrosis; Disinfectants are broad-spectrum non-specific biocides for inert surfaces.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q6", "sci_10",
            "प्रसिद्ध घरेलू एंटीसेप्टिक लोशन 'डेटॉल' (Dettol) किन दो प्रमुख कार्बनिक यौगिकों का मिश्रण होता है?",
            "The iconic household antiseptic and wound cleansing liquid 'Dettol' is an emulsion formulated from which two synergistic active antibacterial compounds?",
            listOf("क्लोरोजाइलिनॉल एवं टरपीनियोल (Chloroxylenol - PCMX and alpha-Terpineol in pine oil/alcohol base)", "फिनोल और एथेनॉल", "सल्फ्यूरिक एसिड और आयोडीन", "सोडियम बाइकार्बोनेट और ग्लिसरीन"),
            listOf("Chloroxylenol (4-chloro-3,5-dimethylphenol ~4.8%) and alpha-Terpineol (Pine oil aromatic terpene alcohol)", "Phenol and Ethanol", "Sulfuric acid and Iodine", "Sodium bicarbonate and Glycerin"),
            0,
            "डेटॉल (Dettol) में 4.8% 'क्लोरोजाइलिनॉल' (Chloroxylenol - PCMX) और 'अल्फा-टरपीनियोल' (Terpineol) होता है। क्लोरोजाइलिनॉल बैक्टीरिया की कोशिका भित्ति को तोड़कर प्रोटीन को जमा देता है। पानी में मिलाने पर टरपीनियोल के कारण इसका रंग दूधिया सफेद (Ouzo effect) हो जाता है।",
            "Chloroxylenol disrupts bacterial cell membrane electrical potentials and denatures intracellular microbial enzymes, while terpineol acts as a penetration enhancer and pleasant pine fragrance carrier.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q7", "sci_10",
            "घावों पर लगाने वाला 'टिंचर आयोडीन' (Tincture of Iodine - गहरा बैंगनी-भूरा एंटीसेप्टिक) किसका घोल होता है?",
            "Tincture of Iodine, widely used for sterilizing skin before surgical incisions and dressing wounds, is chemically a 2% to 3% solution of elemental Iodine in:",
            listOf("अल्कोहल और पानी का मिश्रण जिसमें पोटेशियम आयोडाइड (KI) घुला होता है", "शुद्ध पानी केवल", "शुद्ध सल्फ्यूरिक एसिड", "शुद्ध केरोसिन तेल"),
            listOf("Alcohol-Water solvent containing 2-3% elemental Iodine (I2) solubilized with Potassium Iodide (KI forming soluble I3- complex)", "Pure distilled water only", "Concentrated Sulfuric Acid", "Kerosene oil"),
            0,
            "टिंचर आयोडीन में 2-3% आयोडीन को एथिल अल्कोहल और पानी के मिश्रण में पोटेशियम आयोडाइड (KI) के साथ घोला जाता है। KI डालने से अघुलनशील आयोडीन घुलनशील I3- (ट्राईआयोडाइड) आयन बना लेता है। यह एक अत्यंत शक्तिशाली रोगाणुनाशक है। 'पोवीडोन आयोडीन' (Betadine) इसका आधुनिक गैर-जलनकारी रूप है।",
            "Molecular iodine (I2) rapidly penetrates microbial cell walls, oxidizing essential sulfhydryl (-SH) groups of amino acids and iodinating tyrosine residues to precipitate lethal protein precipitation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q8", "sci_10",
            "साबुन में जीवाणुरोधी गुण (Antibacterial properties) प्रदान करने और पसीने की बदबू पैदा करने वाले बैक्टीरिया को मारने हेतु कौन-सा यौगिक मिलाया जाता है?",
            "Which chlorinated bisphenol compound is historically added to medicated and deodorizing toilet soaps to impart long-lasting antiseptic properties?",
            listOf("बाइथायोनॉल / ट्राइक्लोसन (Bithionol / Triclosan)", "सोडियम क्लोराइड", "ग्लिसरॉल", "एसीटोन"),
            listOf("Bithionol (2,2'-thiobis(4,6-dichlorophenol)) and Triclosan (Antibacterial phenolic additive incorporated into medicated toilet soaps)", "Sodium chloride", "Glycerol", "Acetone"),
            0,
            "औषधीय साबुनों में 'बाइथायोनॉल' (Bithionol) या 'ट्राइक्लोसन' मिलाया जाता है। यह त्वचा पर पसीने को सड़ाकर दुर्गंध पैदा करने वाले बैक्टीरिया की वृद्धि को रोकता है।",
            "Bithionol contains chlorinated phenolic rings linked by a sulfur thioether bridge, conferring broad-spectrum bacteriostatic efficacy against Gram-positive skin flora without irritating epidermal tissues.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q9", "sci_10",
            "मानसिक तनाव, चिंता, अवसाद और अनिद्रा (Anxiety, Depression & Insomnia) को दूर करने हेतु प्रयुक्त होने वाली केंद्रीय तंत्रिका तंत्र को शांत करने वाली दवाएं (जैसे Valium, Equanil) क्या कहलाती हैं?",
            "Which broad class of neuro-active psychiatric medications (such as Benzodiazepines, Diazepam / Valium, Equanil, and Luminal) relieves anxiety, calm mental tension, and induces sleep?",
            listOf("प्रशांतक / ट्रैंक्विलाइज़र (Tranquilizers / Psychotropic Sedative-Hypnotics)", "एंटीबायोटिक्स", "एंटासिड्स", "एंटीसेप्टिक्स"),
            listOf("Tranquilizers (Psychotherapeutic agents modulating GABA neurotransmission to alleviate emotional anxiety, psychosis, and tension)", "Antibiotics", "Antacids", "Antiseptics"),
            0,
            "प्रशांतक (Tranquilizers) वे दवाएं हैं जो मस्तिष्क के तंत्रिका आवेगों को धीमा करके चिंता, घबराहट और मानसिक तनाव को कम करती हैं (जैसे डाइजेपाम/वैलियम, इक्वेनिल, मेप्रोबामेट, अल्प्राजोलम)। ये गाबा (GABA) रिसेप्टर्स की क्रिया को बढ़ाती हैं।",
            "Tranquilizers allosterically bind central GABAA receptor chloride channels, increasing intracellular chloride influx and hyperpolarizing limbic neurons to suppress emotional anxiety and stress responses.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q10", "sci_10",
            "आमाशय में एसिडिटी को रोकने वाली आधुनिक 'प्रोटॉन पंप इनहिबिटर्स' (PPI Drugs - जैसे Omeprazole, Pantoprazole) किस एंजाइम पंप को सीधे ब्लॉक करती हैं?",
            "Modern blockbuster anti-ulcer medications known as Proton Pump Inhibitors (PPIs: Omeprazole, Pantoprazole, Rabeprazole) irreversibly block which gastric enzyme to stop acid secretion?",
            listOf("H+/K+ ATPase एंजाइम पंप (Gastric H+/K+-ATPase Proton Pump on parietal cells)", "पेप्सिनोजेन", "एमाइलेज", "लाइपेस"),
            listOf("Gastric H+/K+-ATPase (The definitive final proton pump in gastric parietal apical canaliculi generating luminal HCl)", "Pepsinogen", "Salivary Amylase", "Pancreatic Lipase"),
            0,
            "ओमेप्राजोल और पैंटोप्राजोल आमाशय की पैराइटल कोशिकाओं के 'H+/K+ ATPase' प्रोटॉन पंप को सहसंयोजक बंध द्वारा हमेशा के लिए बंद कर देते हैं। इससे पेट में एसिड बनना 90% से अधिक रुक जाता है और अल्सर व GERD के घाव तेजी से भर जाते हैं।",
            "PPI prodrugs accumulate in acidic parietal canaliculi where protonation converts them into reactive sulfenamides that form covalent disulfide bonds with cysteine-813 of the H+/K+-ATPase alpha-subunit.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q11", "sci_10",
            "एंटीबायोटिक दवाओं की खोज से पहले सिफलिस (Syphilis) और जीवाणु संक्रमण के इलाज हेतु पॉल एहरलिच द्वारा 1908 में विकसित 'सल्वारसन' (Salvarsan / यौगिक 606) में कौन-सी धातु/तत्व था?",
            "Paul Ehrlich (Father of Chemotherapy) developed Salvarsan (Compound 606 / Arsphenamine) in 1909 as the world's first targeted 'magic bullet' drug containing which toxic metalloid element?",
            listOf("आर्सेनिक (Arsenic - Organic organoarsenic compound As=As)", "पारा (Mercury)", "सीसा (Lead)", "सोना (Gold)"),
            listOf("Arsenic (Arsphenamine - Organoarsenic heterocyclic compound with cyclic As-As bonds targeting Treponema pallidum)", "Mercury", "Lead", "Gold"),
            0,
            "पॉल एहरलिच (Paul Ehrlich) को 'कीमोथेरेपी का जनक' कहा जाता है। उन्होंने 'जादुई गोली' (Magic Bullet) की अवधारणा दी और सिफलिस के रोगाणु को मारने हेतु आर्सेनिक युक्त दवा 'सल्वारसन' (Salvarsan) बनाई। इस खोज पर उन्हें 1908 का नोबेल पुरस्कार मिला।",
            "Salvarsan was the first rationally designed synthetic chemotherapeutic agent; its cyclic polyarsine structure selectively oxidized spirochetal thiol enzymes while exhibiting tolerable human host toxicity.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m10_q12", "sci_10",
            "बैक्टीरिया के खिलाफ पहला व्यापक रूप से सफल 'सिंथेटिक एंटीबैक्टीरियल ड्रग' (Sulfa Drugs / प्रोंटोसिल) 1932 में गेरहार्ड डोमैक ने किस एज़ो डाई से विकसित किया था?",
            "Which revolutionary first synthetic antibacterial Sulfa Drug (Prontosil) was synthesized by Gerhard Domagk in 1932 (Nobel Prize in 1939)?",
            listOf("प्रोंटोसिल / सल्फैनिलामाइड (Prontosil - Red Azo dye metabolizing in vivo into Sulfanilamide)", "पेनिसिलिन", "एस्पिरिन", "क्लोरोक्वीन"),
            listOf("Prontosil (Sulfamidochrysoidine - Ingested red azo dye cleaved in the liver into active antibacterial Sulfanilamide)", "Penicillin", "Aspirin", "Chloroquine"),
            0,
            "1932 में गेरहार्ड डोमैक ने पाया कि लाल डाई 'प्रोंटोसिल' (Prontosil) शरीर में जाकर 'सल्फैनिलामाइड' में बदल जाती है। सल्फैनिलामाइड बैक्टीरिया के फोलिक एसिड निर्माण में PABA (पैरा-अमीनोबेंजोइक एसिड) की नकल करके बैक्टीरिया को भूखा मार देती है। इस पर 1939 का नोबेल मिला।",
            "Sulfanilamide acts as a competitive antimetabolite structural analog of para-aminobenzoic acid (PABA), inhibiting dihydropteroate synthase in bacterial de novo folate synthesis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_10_m10_q13", "sci_10",
            "टीबी (Tuberculosis / क्षय रोग) के उपचार में प्रयुक्त होने वाली पहली प्रभावी एंटीबायोटिक 'स्ट्रेप्टोमाइसिन' (Streptomycin) की खोज 1943 में मिट्टी के किस सूक्ष्मजीव से की गई थी?",
            "Which life-saving aminoglycoside antibiotic, isolated from the actinobacterium Streptomyces griseus by Selman Waksman and Albert Schatz in 1943, was the first cure for human Pulmonary Tuberculosis?",
            listOf("स्ट्रेप्टोमाइसिन (Streptomycin - isolated from Streptomyces griseus)", "पेनिसिलिन", "सल्फा ड्रग", "टेट्रासाइक्लिन"),
            listOf("Streptomycin (Aminoglycoside antibiotic binding bacterial 30S ribosomal subunit to mistranslate mRNA in Mycobacterium tuberculosis)", "Penicillin", "Sulfa drug", "Tetracycline"),
            0,
            "सेलमैन वाक्समैन ने मिट्टी के बैक्टीरिया 'स्ट्रेप्टोमाइसिस ग्रीसियस' से 'स्ट्रेप्टोमाइसिन' की खोज की। इसने पहली बार टीबी (Tuberculosis) के घातक बैक्टीरिया को खत्म किया। वाक्समैन ने ही 'एंटीबायोटिक' (Antibiotic) शब्द गढ़ा था (1952 का नोबेल पुरस्कार)।",
            "Streptomycin binds irreversibly to the 16S rRNA of the bacterial 30S ribosomal subunit, causing codon misreading, defective protein synthesis, and disruption of cytoplasmic bacterial membranes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q14", "sci_10",
            "डॉक्टरों द्वारा एंटीबायोटिक दवाओं के अनावश्यक और अत्यधिक उपयोग से रोगाणुओं में कौन-सा वैश्विक संकट उत्पन्न हो रहा है जिसमें साधारण संक्रमण पर भी दवाएं बेअसर हो जाती हैं?",
            "The global public health crisis arising from overuse of antibiotics, wherein mutating bacterial strains survive standard antimicrobial drugs, is scientifically termed:",
            listOf("रोगाणुरोधी प्रतिरोध / सुपरबग्स (Antimicrobial Resistance - AMR / Superbugs)", "एनाफाइलेक्सिस", "हाइपरटेंशन", "हाइपोग्लाइसीमिया"),
            listOf("Antimicrobial Resistance (AMR / Multi-Drug Resistant Superbugs such as MRSA, producing beta-lactamases and efflux pumps)", "Anaphylaxis", "Hypertension", "Hypoglycemia"),
            0,
            "AMR (रोगाणुरोधी प्रतिरोध) तब होता है जब बैक्टीरिया म्यूटेशन करके या प्लास्मिड द्वारा एंटीबायोटिक को तोड़ने वाले एंजाइम (जैसे NDM-1, बीटा-लैक्टामेज) बना लेते हैं। ऐसे बैक्टीरिया 'सुपरबग' (Superbugs - जैसे MRSA, CRE) कहलाते हैं जिन पर कोई एंटीबायोटिक असर नहीं करती।",
            "Bacterial populations acquire AMR via horizontal gene transfer (conjugation/transduction) encoding enzymatic drug degradation, target site ribosomal methylation, altered porin permeability, and active multi-drug efflux pumps.",
            "Easy"
        ),
        makeScienceQ(
            "sci_10_m10_q15", "sci_10",
            "आंखों के संक्रमण (Eye infections) और मोतियाबिंद की सर्जरी के बाद संक्रमण रोकने हेतु इस्तेमाल होने वाले आई-ड्रॉप्स में कौन-सा ब्रॉड-स्पेक्ट्रम एंटीबायोटिक व्यापक रूप से उपयोग होता है?",
            "Which broad-spectrum chloramphenicol / fluoroquinolone synthetic antibiotic (e.g., Ciprofloxacin / Moxifloxacin / Chloramphenicol) is formulated in ophthalmic Eye Drops to inhibit bacterial DNA Gyrase?",
            listOf("सिप्रोफ्लोक्सासिन / मॉक्सीफ्लोक्सासिन (Ciprofloxacin / Moxifloxacin / Chloramphenicol)", "पेनिसिलिन केवल", "एस्पिरिन", "पैरासिटामोल"),
            listOf("Fluoroquinolones (Ciprofloxacin / Moxifloxacin - Inhibit bacterial DNA Gyrase / Topoisomerase IV) and Chloramphenicol (Inhibits 50S peptidyl transferase)", "Penicillin only", "Aspirin", "Paracetamol"),
            0,
            "आई-ड्रॉप्स में सिप्रोफ्लोक्सासिन या मॉक्सीफ्लोक्सासिन (फ्लोरोक्विनोलोन वर्ग) या क्लोरैम्फेनिकॉल का उपयोग होता है। फ्लोरोक्विनोलोन बैक्टीरिया के 'डीएनए गाइरेज' (Topoisomerase II) एंजाइम को रोककर बैक्टीरिया के डीएनए प्रतिकृति को तुरंत ठप कर देते हैं।",
            "Fluoroquinolones stabilize cleaved covalent complexes between bacterial Topoisomerase II/IV and DNA, generating lethal double-stranded DNA breaks and bactericidal death in ocular pathogen infections.",
            "Easy"
        )
    )
}
