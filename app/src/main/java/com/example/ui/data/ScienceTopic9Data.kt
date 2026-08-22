package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic9Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1: Fat-Soluble Vitamins (A, D, E, K) (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m1_q1", "sci_9",
            "विटामिन 'ए' (Vitamin A) का रासायनिक नाम क्या है और इसकी कमी से कौन-सा प्रसिद्ध नेत्र रोग (दृष्टि विकार) होता है?",
            "What is the official chemical biochemical name of Vitamin A, and what classic ophthalmological condition is triggered by its dietary deficiency?",
            listOf("रेटिनॉल - रतौंधी एवं ज़ेरोफ्थैल्मिया (Retinol - Night Blindness / Nyctalopia & Xerophthalmia)", "थायमिन - बेरीबेरी", "एस्कॉर्बिक एसिड - स्कर्वी", "कैल्सिफेरॉल - रिकेट्स"),
            listOf("Retinol (Retinal & Retinoic Acid) - Night Blindness (Nyctalopia) and Xerophthalmia (Dry eye)", "Thiamine - Beriberi", "Ascorbic Acid - Scurvy", "Calciferol - Rickets"),
            0,
            "विटामिन-ए (रेटिनॉल) रेटिना के रॉड कोशिकाओं में दृष्टि वर्णक 'रोडोप्सिन' (Rhodopsin) के निर्माण हेतु आवश्यक है। इसकी कमी से कम रोशनी में न दिखना (रतौंधी), कॉर्निया का सूखना (ज़ेरोफ्थैल्मिया) और बिटोट के धब्बे (Bitot's spots) होते हैं। गाजर और पपीता इसके प्रमुख स्रोत हैं।",
            "Vitamin A (Retinol) is oxidized to 11-cis-retinal, which combines with opsin in retinal rod cells to form rhodopsin. Deficiency causes defective dark adaptation (nyctalopia) and squamous metaplasia of conjunctival epithelium.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q2", "sci_9",
            "विटामिन 'डी' (Vitamin D / धूप का विटामिन / Sunshine Vitamin) का रासायनिक नाम क्या है और यह शरीर में किसके अवशोषण में मदद करता है?",
            "What is the chemical name of Vitamin D3 (synthesized in skin upon exposure to solar UVB radiation), and which vital mineral does it help absorb from the intestines?",
            listOf("कोलेकैल्सिफेरॉल - आंतों से कैल्शियम एवं फास्फोरस का अवशोषण (Cholecalciferol - Calcium & Phosphorus Absorption)", "टोकोफेरॉल - आयरन", "फाइलोक्विनोन - सोडियम", "नियासिन - पोटेशियम"),
            listOf("Cholecalciferol (Vitamin D3) / Ergocalciferol (D2) - Intestinal absorption of Calcium and Phosphate", "Tocopherol - Iron absorption", "Phylloquinone - Sodium transport", "Niacin - Potassium balance"),
            0,
            "त्वचा में 7-डीहाइड्रोकोलेस्ट्रॉल पर सूर्य की पराबैंगनी-B (UV-B) किरणें पड़ने से विटामिन-D3 (कोलेकैल्सिफेरॉल) बनता है। यकृत और गुर्दे इसे सक्रिय हार्मोन 'कैल्सीट्रियोल' में बदलते हैं, जो आंतों से कैल्शियम और फास्फोरस सोखता है।",
            "Solar UV-B photolyzes cutaneous 7-dehydrocholesterol to pre-vitamin D3, hydroxylated sequentially by liver 25-hydroxylase and renal 1-alpha-hydroxylase into active calcitriol (1,25-(OH)2D3).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q3", "sci_9",
            "बच्चों में विटामिन 'डी' और कैल्शियम की गंभीर कमी से हड्डियों के मुड़ने और कमजोर होने का रोग क्या कहलाता है?",
            "Severe dietary deficiency of Vitamin D in growing infants and young children, leading to soft, pliable, deformed bones (bow legs, knock knees, pigeon chest), is termed:",
            listOf("रिकेट्स / सूखा रोग (Rickets)", "ऑस्टियोमलेशिया (वयस्कों में)", "स्कर्वी", "बेरीबेरी"),
            listOf("Rickets (Failure of epiphyseal growth plate chondrocyte mineralization in growing skeleton)", "Osteomalacia (Adult bone demineralization)", "Scurvy", "Beriberi"),
            0,
            "बच्चों में विटामिन-डी की कमी से 'रिकेट्स' (Rickets) होता है जिसमें पैर धनुष की तरह मुड़ जाते हैं (Bow legs) और पसलियों पर मनके बन जाते हैं (Rachitic rosary)। वयस्कों में हड्डियों का कमजोर होना 'ऑस्टियोमलेशिया' (Osteomalacia) कहलाता है।",
            "Nutritional Rickets stems from impaired mineralization of newly formed osteoid at growth plates, producing widening of wrists/ankles, craniotabes, and lower extremity bowing under body weight.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q4", "sci_9",
            "विटामिन 'ई' (Vitamin E / सुंदरता का विटामिन / Beauty Vitamin) का रासायनिक नाम क्या है और इसका मुख्य जैविक कार्य क्या है?",
            "What is the chemical name of Vitamin E, and what is its primary biological role as a lipid-soluble chain-breaking antioxidant in cell membranes?",
            listOf("टोकोफेरॉल - शक्तिशाली एंटीऑक्सीडेंट एवं प्रजनन क्षमता बनाए रखना (Tocopherol - Antioxidant protecting cell membranes & Fertility)", "रेटिनॉल", "बायोटिन", "कैल्सिफेरॉल"),
            listOf("Tocopherols (alpha-tocopherol) & Tocotrienols - Antioxidant scavenger of lipid peroxyl free radicals", "Retinol", "Biotin", "Calciferol"),
            0,
            "विटामिन-ई का रासायनिक नाम 'टोकोफेरॉल' (Tocopherol) है। यह कोशिका झिल्ली के पॉलीअनसैचुरेटेड फैटी एसिड को मुक्त कणों (Free Radicals) के ऑक्सीकरण से बचाता है और त्वचा व बालों को स्वस्थ रखता है। बादाम, सूरजमुखी का तेल और अंकुरित गेहूं इसके प्रमुख स्रोत हैं।",
            "Alpha-tocopherol traps reactive oxygen species (ROS) in phospholipid bilayers, terminating lipid peroxidation chain reactions and maintaining erythrocyte and neuronal membrane integrity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q5", "sci_9",
            "रक्त का थक्का जमाने (Blood Coagulation) के लिए कौन-सा वसा-घुलनशील विटामिन अनिवार्य है जो यकृत में प्रोथ्रोम्बिन का संश्लेषण कराता है?",
            "Which fat-soluble vitamin acts as an essential cofactor for gamma-glutamyl carboxylase in the hepatic synthesis of blood clotting factors II (Prothrombin), VII, IX, and X?",
            listOf("विटामिन 'के' (Vitamin K - Phylloquinone / Menaquinone)", "विटामिन ए", "विटामिन सी", "विटामिन ई"),
            listOf("Vitamin K (Phylloquinone - K1 from green leaves, Menaquinone - K2 from gut bacteria)", "Vitamin A", "Vitamin C", "Vitamin E"),
            0,
            "विटामिन-के (फाइलोक्विनोन / मेनाक्विनोन) यकृत में क्लॉटिंग फैक्टर II (प्रोथ्रोम्बिन), VII, IX और X के संश्लेषण के लिए अनिवार्य है। इसकी कमी से चोट लगने पर रक्त का थक्का नहीं जमता और अत्यधिक रक्तस्राव (Hemorrhage) होता है। हरी पत्तेदार सब्जियां और आंत के बैक्टीरिया इसे बनाते हैं।",
            "Vitamin K facilitates post-translational gamma-carboxylation of glutamic acid residues in clotting factors II, VII, IX, and X, enabling calcium binding on activated platelet phospholipid membranes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q6", "sci_9",
            "निम्नलिखित में से कौन-से चार विटामिन 'वसा में घुलनशील' (Fat-Soluble Vitamins) होते हैं जो यकृत और वसा ऊतकों में संचित रहते हैं?",
            "Which group represents the four Fat-Soluble Vitamins that require dietary lipids and bile salts for intestinal absorption and are stored in the liver/adipose tissue?",
            listOf("विटामिन A, D, E और K (Vitamins A, D, E, K)", "विटामिन B और C", "विटामिन B1, B2, B6 और B12", "विटामिन C, D और E"),
            listOf("Vitamins A, D, E, and K (ADEK - Non-polar isoprenoid derivatives)", "Vitamins B and C (Water-soluble)", "Vitamins B1, B2, B6, and B12", "Vitamins C, D, and E"),
            0,
            "विटामिन दो श्रेणियों में बंटे होते हैं: 1. वसा में घुलनशील (Fat-soluble) = A, D, E, K (इन्हें शरीर स्टोर कर सकता है)। 2. जल में घुलनशील (Water-soluble) = B-कॉम्प्लेक्स और C (ये मूत्र द्वारा निकल जाते हैं, इसलिए इन्हें प्रतिदिन भोजन में लेना आवश्यक है, B12 को छोड़कर)।",
            "Fat-soluble vitamins (A, D, E, K) are packaged into mixed micelles and chylomicrons for lymphatic absorption; excessive intake can lead to hypervitaminosis toxicity due to hepatic storage.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q7", "sci_9",
            "पौधों में पाया जाने वाला 'बीटा-कैरोटीन' (Beta-Carotene) मानव शरीर में पहुंचकर किस विटामिन के अग्रदूत (Pro-vitamin) के रूप में सक्रिय विटामिन में परिवर्तित होता है?",
            "Beta-Carotene (the orange-yellow carotenoid pigment abundant in carrots, pumpkins, and mangoes) acts as a dietary provitamin precursor for:",
            listOf("विटामिन 'ए' (Pro-Vitamin A / Retinol)", "विटामिन सी", "विटामिन डी", "विटामिन के"),
            listOf("Vitamin A (Cleaved symmetrically by beta-carotene-15,15'-dioxygenase in intestinal mucosa into two molecules of retinal)", "Vitamin C", "Vitamin D", "Vitamin K"),
            0,
            "बीटा-कैरोटीन आंतों की कोशिकाओं में एंजाइम द्वारा टूटकर दो रेटिनॉल (विटामिन-ए) अणुओं में बदल जाता है। गाजर, कद्दू, पपीता, आम और पालक बीटा-कैरोटीन के सबसे समृद्ध स्रोत हैं।",
            "Beta-carotene is an antioxidant tetraterpenoid provitamin cleaved enzymatically in intestinal enterocytes to yield active retinal (Vitamin A).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q8", "sci_9",
            "शिशुओं के जन्म के तुरंत बाद नवजात शिशु में रक्तस्राव रोग (Hemorrhagic Disease of Newborn) को रोकने हेतु किस विटामिन का एकल इंजेक्शन दिया जाता है?",
            "Which fat-soluble vitamin injection is routinely administered intramuscularly to all neonates at birth to prevent fatal neonatal intracranial hemorrhage?",
            listOf("विटामिन 'के' (Vitamin K1 injection)", "विटामिन ए", "विटामिन डी", "विटामिन सी"),
            listOf("Vitamin K1 (Phytomenadione injection - 1 mg given immediately post-delivery)", "Vitamin A", "Vitamin D", "Vitamin C"),
            0,
            "नवजात शिशुओं की आंतें जन्म के समय रोगाणुहीन (Sterile) होती हैं और मां के दूध में विटामिन-के कम होता है। इसलिए जन्म के समय विटामिन-K1 का इंजेक्शन लगाया जाता है ताकि शिशु में रक्तस्राव न हो।",
            "Neonates have low hepatic clotting factor reserves, poor placental transfer of Vitamin K, and uncolonized sterile gut flora; prophylactic Vitamin K administration prevents Vitamin K Deficiency Bleeding (VKDB).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q9", "sci_9",
            "विटामिन 'डी' की अधिकता (Hypervitaminosis D / विषाक्तता) से शरीर के रक्त में किस खनिज का स्तर खतरनाक रूप से बढ़ जाता है जिससे गुर्दे खराब हो सकते हैं?",
            "Excessive, toxic overconsumption of high-dose Vitamin D supplements leads to which condition, causing hypercalcemia, soft tissue calcification, and kidney failure?",
            listOf("हाइपरकैल्सीमिया - रक्त में अत्यधिक कैल्शियम (Hypercalcemia)", "हाइपोकैल्सीमिया", "हाइपोकलेमिया", "हाइपोग्लाइसीमिया"),
            listOf("Hypercalcemia (Excessive serum calcium deposition in kidneys, blood vessels, and heart)", "Hypocalcemia", "Hypokalemia", "Hypoglycemia"),
            0,
            "विटामिन-डी वसा में घुलनशील होने के कारण शरीर में जमा होता है। अत्यधिक सेवन से आंतों से बहुत अधिक कैल्शियम अवशोषित होने लगता है (Hypercalcemia), जिससे गुर्दे में पथरी और रक्त वाहिकाओं में कैल्सिफिकेशन हो जाता है।",
            "Hypervitaminosis D drives supraphysiological intestinal calcium absorption and bone resorption, elevating serum Ca2+ and precipitating nephrocalcinosis and renal failure.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m1_q10", "sci_9",
            "मछली के यकृत का तेल (Cod Liver Oil / Shark Liver Oil) किन दो महत्वपूर्ण वसा-घुलनशील विटामिनों का सर्वोत्तम प्राकृतिक स्रोत है?",
            "Cod Liver Oil and Shark Liver Oil are world-renowned rich natural therapeutic dietary sources of which two fat-soluble vitamins?",
            listOf("विटामिन 'ए' एवं विटामिन 'डी' (Vitamins A and D)", "विटामिन बी एवं सी", "विटामिन सी एवं के", "विटामिन ई एवं बी12"),
            listOf("Vitamins A and D (along with Omega-3 polyunsaturated fatty acids EPA and DHA)", "Vitamins B and C", "Vitamins C and K", "Vitamins E and B12"),
            0,
            "कॉड लिवर ऑयल (मछली के जिगर का तेल) में प्राकृतिक रूप से भारी मात्रा में विटामिन-ए, विटामिन-डी और ओमेगा-3 फैटी एसिड (EPA/DHA) पाए जाते हैं, जो हड्डियों, आंखों और मस्तिष्क के विकास हेतु अत्यंत लाभकारी हैं।",
            "Cod liver oil provides preformed bioavailable retinyl esters and cholecalciferol, historically utilized globally as a nutritional prophylaxis against childhood rickets and xerophthalmia.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q11", "sci_9",
            "आंखों के कॉर्निया का अपारदर्शी होकर गल जाना और स्थायी अंधापन होना (Keratomalacia) किस विटामिन की गंभीर दीर्घकालिक कमी का परिणाम है?",
            "Keratomalacia (liquefactive necrosis, ulceration, and irreversible corneal perforation leading to total blindness) is the terminal stage of severe deficiency of:",
            listOf("विटामिन 'ए' (Vitamin A / Retinol)", "विटामिन बी12", "विटामिन डी", "विटामिन सी"),
            listOf("Vitamin A (Terminal progression of xerophthalmia in malnourished children)", "Vitamin B12", "Vitamin D", "Vitamin C"),
            0,
            "विटामिन-ए की कमी का क्रम: 1. रतौंधी (Nyctalopia) → 2. कंजेक्टाइवल ज़ेरोसिस (सूखापन) → 3. बिटोट के धब्बे → 4. कॉर्नियल ज़ेरोसिस → 5. केराटोमलेशिया (कॉर्निया का गलना ও स्थायी अंधापन)। WHO 9 माह से 5 वर्ष के बच्चों को विटामिन-ए की खुराक देता है।",
            "Vitamin A deficiency causes severe goblet cell loss and keratinizing squamous metaplasia of ocular mucosal epithelium, ultimately causing sterile stromal melting and corneal liquefaction (Keratomalacia).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m1_q12", "sci_9",
            "विटामिन 'ई' की कमी से लाल रक्त कोशिकाओं (RBC) की झिल्ली कमजोर होकर फटने से कौन-सा एनीमिया हो सकता है?",
            "In premature infants, severe deficiency of Vitamin E (which protects RBC lipid membranes from oxidative hemolysis) causes:",
            listOf("हीमोलिटिक एनीमिया (Hemolytic Anaemia)", "मेगालोब्लास्टिक एनीमिया", "आयरन डेफिशिएंसी एनीमिया", "अप्लास्टिक एनीमिया"),
            listOf("Hemolytic Anaemia (Oxidative stress ruptures fragile erythrocyte membranes)", "Megaloblastic Anaemia", "Iron Deficiency Anaemia", "Aplastic Anaemia"),
            0,
            "विटामिन-ई की कमी से लाल रक्त कणिकाओं की झिल्ली पर मुक्त कण हमला कर देते हैं, जिससे RBC जल्दी फटने लगते हैं और हीमोलिटिक एनीमिया (Hemolytic Anemia) हो जाता है।",
            "Uninhibited free radical lipid peroxidation in the absence of alpha-tocopherol compromises RBC cytoskeletal deformability, leading to intravascular and extravascular splenic hemolysis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m1_q13", "sci_9",
            "विटामिन 'डी2' (Ergocalciferol) और 'डी3' (Cholecalciferol) क्रमशः किन स्रोतों से प्राप्त होते हैं?",
            "Vitamin D2 (Ergocalciferol) and Vitamin D3 (Cholecalciferol) are derived commercially and biologically from which sources respectively?",
            listOf("D2 पौधों एवं कवक (खमीर/मशरूम) से, तथा D3 सूर्य के प्रकाश व पशु स्रोतों से (D2 from Plants/Fungi; D3 from Sunlight & Animal sources)", "D2 सूर्य से और D3 कवक से", "दोनों केवल रसायनों से", "दोनों केवल समुद्री पानी से"),
            listOf("Vitamin D2 (Ergocalciferol) from fungal ergosterol (UV-irradiated yeast/mushrooms); Vitamin D3 (Cholecalciferol) from animal skin 7-dehydrocholesterol via UVB & oily fish", "D2 from sun and D3 from yeast", "Both purely synthetic", "Both from seawater"),
            0,
            "विटामिन-डी2 (एर्गोकैल्सिफेरॉल) पराबैंगनी किरणों से मशरूम और यीस्ट के एर्गोस्टेरॉल से बनता है। विटामिन-डी3 (कोलेकैल्सिफेरॉल) धूप द्वारा मानव/पशु त्वचा में और मछली के तेल व अंडों में बनता है।",
            "Fungal ergosterol undergoes photolysis into Ergocalciferol (D2), while animal 7-dehydrocholesterol photochemically isomerizes into Cholecalciferol (D3).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m1_q14", "sci_9",
            "गोल्डन राइस (Golden Rice) को आनुवंशिक रूप से (Genetically Modified) किस विटामिन के स्तर को बढ़ाने हेतु विकसित किया गया है?",
            "Golden Rice (Oryza sativa GM crop, developed by Ingo Potrykus) was bioengineered to synthesize beta-carotene to eradicate childhood deficiency of:",
            listOf("विटामिन 'ए' (Vitamin A / Beta-Carotene)", "विटामिन सी", "विटामिन बी12", "विटामिन डी"),
            listOf("Vitamin A (Provitamin A beta-carotene synthesized in endosperm using daffodil psy and bacterial crtI genes)", "Vitamin C", "Vitamin B12", "Vitamin D"),
            0,
            "गोल्डन राइस में डैफोडिल और बैक्टीरिया के जीन डालकर चावल के दाने (एंडोस्पर्म) में बीटा-कैरोटीन का निर्माण कराया गया है ताकि विकासशील देशों में बच्चों को रतौंधी और कुपोषण से बचाया जा सके।",
            "Golden Rice expresses phytoene synthase (psy) and carotene desaturase (crtI), completing the carotenoid biosynthetic pathway in the rice endosperm to produce Provitamin A.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m1_q15", "sci_9",
            "ऑस्टियोकैल्सिन (Osteocalcin) प्रोटीन को सक्रिय कर हड्डियों में कैल्शियम को बांधने में कौन-सा विटामिन 'के' का रूप महत्वपूर्ण भूमिका निभाता है?",
            "Which form of Vitamin K (produced by gut microbiome and fermented foods like Natto) gamma-carboxylates Osteocalcin to deposit calcium directly into bone hydroxyapatite matrix?",
            listOf("विटामिन K2 / मेनाक्विनोन (Vitamin K2 - Menaquinone)", "विटामिन K1 / फाइलोक्विनोन", "विटामिन K3 / मेनाडायोन", "विटामिन ए"),
            listOf("Vitamin K2 (Menaquinone - MK-4, MK-7 activating osteocalcin and matrix Gla-protein to prevent arterial calcification)", "Vitamin K1 (Phylloquinone)", "Vitamin K3 (Synthetic Menadione)", "Vitamin A"),
            0,
            "विटामिन K2 (मेनाक्विनोन) हड्डियों के प्रोटीन 'ऑस्टियोकैल्सिन' को सक्रिय करता है जो कैल्शियम को हड्डियों में जमा करता है और धमनियों में कैल्शियम जमने से रोकता है। किण्वित सोयाबीन (Natto) और पनीर इसके स्रोत हैं।",
            "Vitamin K2 (Menaquinone-7) functions as a cofactor for gamma-carboxylation of osteocalcin in osteoblasts and Matrix Gla-Protein (MGP) in vascular smooth muscle, enhancing bone density while inhibiting vascular calcification.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 2: Water-Soluble Vitamins (B-Complex & Vitamin C) (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m2_q1", "sci_9",
            "विटामिन 'बी1' (Vitamin B1) का रासायनिक नाम क्या है और पॉलिश किए हुए चावल (Polished White Rice) खाने से इसकी कमी से कौन-सा प्रसिद्ध रोग होता है?",
            "What is the chemical name of Vitamin B1, and what classic neuro-cardiovascular deficiency disease arises from consuming polished white rice devoid of its aleurone layer?",
            listOf("थायमिन - बेरीबेरी रोग (Thiamine - Beriberi Disease)", "राइबोफ्लेविन - चीलोसिस", "नियासिन - पेलाग्रा", "पायरीडॉक्सिन - एनीमिया"),
            listOf("Thiamine (Thiamine Pyrophosphate - TPP) - Beriberi (Dry beriberi peripheral neuropathy & Wet beriberi high-output cardiac failure)", "Riboflavin - Cheilosis", "Niacin - Pellagra", "Pyridoxine - Microcytic anemia"),
            0,
            "विटामिन-B1 का नाम 'थायमिन' है। चावल को अत्यधिक पॉलिश करने से उसके छिलके (Aleurone) का थायमिन नष्ट हो जाता है जिससे 'बेरीबेरी' रोग होता है। शुष्क बेरीबेरी में तंत्रिकाएं कमजोर होती हैं और आर्द्र बेरीबेरी में हृदय फूल जाता है। क्रिश्चियन आज्कमैन को इसकी खोज पर नोबेल मिला था।",
            "Thiamine is phosphorylated to thiamine pyrophosphate (TPP), an essential coenzyme for pyruvate dehydrogenase and alpha-ketoglutarate dehydrogenase in cellular aerobic carbohydrate respiration.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q2", "sci_9",
            "विटामिन 'बी2' (Vitamin B2) का रासायनिक नाम क्या है और इसकी कमी से होठों के कोनों का फटना (Cheilosis / Angular Stomatitis) होता है?",
            "What is the chemical name of Vitamin B2 (the yellow fluorescent flavin coenzyme precursor), deficiency of which causes painful fissures at mouth corners (Angular Cheilosis) and magenta tongue?",
            listOf("राइबोफ्लेविन (Riboflavin - FMN & FAD)", "थायमिन", "बायोटिन", "फोलिक एसिड"),
            listOf("Riboflavin (Precursor of Flavin Mononucleotide - FMN and Flavin Adenine Dinucleotide - FAD)", "Thiamine", "Biotin", "Folic Acid"),
            0,
            "विटामिन-B2 का रासायनिक नाम 'राइबोफ्लेविन' है। यह माइटोकॉन्ड्रिया के FAD और FMN का निर्माण करता है। इसकी कमी से मुंह और होठों के किनारे कट-फट जाते हैं (चीलोसिस), जीभ लाल हो जाती है (ग्लोसाइटिस) और त्वचा में सूजन आती है। गाय के दूध का हल्का पीला रंग इसी के कारण होता है।",
            "Riboflavin serves as the core prosthetic group for redox flavoenzymes (FAD/FMN) in the mitochondrial electron transport chain and Krebs cycle.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q3", "sci_9",
            "विटामिन 'बी3' (Vitamin B3 / Niacin) की कमी से होने वाले 'पेलाग्रा' (Pellagra) रोग के तीन मुख्य '3-D' लक्षण कौन-से हैं?",
            "Dietary deficiency of Vitamin B3 (Niacin / Nicotinic acid) produces Pellagra, clinically characterized by which classic triad of '3-D' symptoms?",
            listOf("डायरिया, डर्मेटाइटिस एवं डिमेंशिया (Diarrhoea, Dermatitis, and Dementia)", "डिस्लेक्सिया, डायबिटीज और डिहाइड्रेशन", "डिप्थीरिया, डिस्चार्ज और डेथ", "ड्वार्फिज्म, डिस्प्लेजिया और डिस्टोनिया"),
            listOf("Diarrhoea, Dermatitis (Casal's necklace sun-sensitive rash), and Dementia (leading to Death if untreated - 4Ds)", "Dyslexia, Diabetes, and Dehydration", "Diphtheria, Discharge, and Death", "Dwarfism, Dysplasia, and Dystonia"),
            0,
            "विटामिन-B3 (नियासिन / निकोटिनिक एसिड) की कमी से 'पेलाग्रा' होता है जिसमें 1. दस्त (Diarrhea), 2. त्वचा पर जलन/पपड़ी (Dermatitis) और 3. पागलपन/याददाश्त जाना (Dementia) होता है। मक्के (Maize) को मुख्य भोजन बनाने वाले लोगों में पेलाग्रा अधिक होता है।",
            "Niacin is the essential precursor for NAD+ and NADP+ redox dinucleotides involved in cellular glycolysis, Krebs cycle, and DNA repair (PARP enzymes).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q4", "sci_9",
            "विटामिन 'बी5' (Vitamin B5) और 'बी6' (Vitamin B6) के रासायनिक नाम क्रमशः क्या हैं?",
            "What are the official biochemical IUPAC designations of Vitamin B5 and Vitamin B6 respectively?",
            listOf("पैंटोथेनिक एसिड एवं पायरीडॉक्सिन (Pantothenic Acid & Pyridoxine)", "थायमिन एवं बायोटिन", "नियासिन एवं फोलिक एसिड", "राइबोफ्लेविन एवं कोबालामिन"),
            listOf("Pantothenic Acid (Constituent of Coenzyme-A) and Pyridoxine / Pyridoxal Phosphate (PLP)", "Thiamine & Biotin", "Niacin & Folic Acid", "Riboflavin & Cobalamin"),
            0,
            "विटामिन-B5 का नाम 'पैंटोथेनिक एसिड' (Coenzyme-A का घटक) है। इसकी कमी से पैरों के तलवों में जलन (Burning Feet Syndrome) होती है। विटामिन-B6 का नाम 'पायरीडॉक्सिन' (PLP) है जो अमीनो एसिड और न्यूरोट्रांसमीटर (GABA, सेरोटोनिन) बनाता है।",
            "Pantothenic acid forms Coenzyme A (CoA-SH) for acyl group transfer in the Krebs cycle, while Pyridoxal 5'-phosphate (PLP) is the coenzyme for transaminases and amino acid decarboxylases.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q5", "sci_9",
            "विटामिन 'बी7' (Vitamin B7 / Vitamin H) का रासायनिक नाम क्या है जो स्वस्थ बालों और नाखूनों के निर्माण हेतु आवश्यक है?",
            "What is the chemical designation of Vitamin B7 (historically termed Vitamin H), an essential coenzyme for carboxylase enzymes in fatty acid synthesis and gluconeogenesis?",
            listOf("बायोटिन (Biotin)", "थायमिन", "नियासिन", "एस्कॉर्बिक एसिड"),
            listOf("Biotin (Coenzyme for pyruvate carboxylase, acetyl-CoA carboxylase, and propionyl-CoA carboxylase)", "Thiamine", "Niacin", "Ascorbic acid"),
            0,
            "विटामिन-B7 का नाम 'बायोटिन' है। यह केराटिन प्रोटीन के संश्लेषण में मदद करता है। कच्चे अंडे की सफेदी में मौजूद 'एविडिन' (Avidin) प्रोटीन बायोटिन से जुड़कर इसके अवशोषण को रोक देता है (Egg-white injury)।",
            "Biotin is covalently attached to lysine residues of carboxylases via holocarboxylase synthetase. Raw egg white consumption introduces avidin which binds biotin with extremely high affinity, causing deficiency.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q6", "sci_9",
            "गर्भावस्था के दौरान भ्रूण में 'न्यूरल ट्यूब दोष' (Neural Tube Defects - जैसे Spina Bifida) को रोकने हेतु गर्भवती महिलाओं को कौन-सा विटामिन अनिवार्य रूप से दिया जाता है?",
            "Which B-complex vitamin (Vitamin B9) must be supplemented periconceptionally to prevent severe embryonic Neural Tube Defects (such as Spina Bifida and Anencephaly)?",
            listOf("फोलिक एसिड / फोलेट (Folic Acid / Vitamin B9 / Folate)", "विटामिन सी", "विटामिन ए", "विटामिन डी"),
            listOf("Folic Acid (Vitamin B9 / Pteroylglutamic acid converted to active Tetrahydrofolate - THF)", "Vitamin C", "Vitamin A", "Vitamin D"),
            0,
            "फोलिक एसिड (विटामिन-B9) डीएनए संश्लेषण और कोशिका विभाजन के लिए आवश्यक है। गर्भधारण के शुरुआती दिनों में इसकी कमी से भ्रूण की रीढ़ की हड्डी और मस्तिष्क खुला रह जाता है (स्पाइना बिफिडा)। हरी पत्तेदार सब्जियां इसका मुख्य स्रोत हैं।",
            "Tetrahydrofolate (THF) functions as a single-carbon donor in de novo purine and dTMP thymidylate biosynthesis required for rapid fetal neuroectodermal cell proliferation and neural tube closure.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q7", "sci_9",
            "विटामिन 'बी12' (Vitamin B12) का रासायनिक नाम क्या है और इसके केंद्र में कौन-सी दुर्लभ धातु का परमाणु पाया जाता है?",
            "What is the chemical name of Vitamin B12, and which trace transition metallic element is coordinated at the center of its corrin ring nucleus?",
            listOf("सायनोकोबालामिन - कोबाल्ट धातु (Cyanocobalamin - Cobalt metal Co)", "कैल्सिफेरॉल - कैल्शियम", "फाइलोक्विनोन - पोटेशियम", "थायमिन - सल्फर"),
            listOf("Cyanocobalamin / Methylcobalamin - Cobalt (Co) coordinated in a tetrapyrrole corrin ring", "Calciferol - Calcium", "Phylloquinone - Potassium", "Thiamine - Sulfur"),
            0,
            "विटामिन-B12 का रासायनिक नाम 'सायनोकोबालामिन' (Cyanocobalamin) है और इसमें 'कोबाल्ट' (Cobalt) धातु होती है। यह पौधों में नहीं पाया जाता (केवल दूध, मांस, अंडे और बैक्टीरिया में बनता है)। यह आरबीसी के परिपक्व होने और माइलिन तंत्रिका आवरण हेतु आवश्यक है।",
            "Vitamin B12 contains a cobalt ion centered in a corrin ring; it acts as a coenzyme for methionine synthase (homocysteine methylation) and methylmalonyl-CoA mutase in fatty acid catabolism.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q8", "sci_9",
            "आमाशय की पैराइटल कोशिकाओं द्वारा 'कैसल इंट्रिन्सिक फैक्टर' (Castle's Intrinsic Factor) का स्राव न होने से विटामिन B12 का अवशोषण रुकने पर होने वाला गंभीर एनीमिया क्या कहलाता है?",
            "Autoimmune destruction of gastric parietal cells destroying secretion of Gastric Intrinsic Factor prevents ileal absorption of Vitamin B12, precipitating which lethal condition?",
            listOf("घातक रक्ताल्पता / पर्णिशियस एनीमिया (Pernicious Anaemia / Megaloblastic Anaemia)", "सिकल सेल एनीमिया", "थैलेसीमिया", "आयरन एनीमिया"),
            listOf("Pernicious Anaemia (Megaloblastic macrocytic anemia with Subacute Combined Degeneration of the spinal cord)", "Sickle Cell Anaemia", "Thalassemia", "Iron Deficiency Anaemia"),
            0,
            "विटामिन B12 को अवशोषित करने के लिए पेट के इंट्रिन्सिक फैक्टर की आवश्यकता होती है। इसकी कमी से लाल रक्त कोशिकाएं अपरिपक्व और बहुत बड़ी हो जाती हैं (मेगालोब्लास्ट), जिसे 'पर्णिशियस एनीमिया' कहते हैं। इसमें रीढ़ की हड्डी की नसें भी नष्ट हो जाती हैं।",
            "Pernicious anemia involves anti-intrinsic factor and anti-parietal cell autoantibodies; lack of intrinsic factor prevents receptor-mediated endocytosis of the B12-IF complex in the terminal ileum.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m2_q9", "sci_9",
            "विटामिन 'सी' (Vitamin C) का रासायनिक नाम क्या है और इसकी कमी से मसूड़ों से खून आना और दांत हिलने का कौन-सा ऐतिहासिक रोग होता है?",
            "What is the chemical name of Vitamin C, and what collagen-defect bleeding disorder (historically afflicting seafaring sailors) is caused by its dietary absence?",
            listOf("एस्कॉर्बिक एसिड - स्कर्वी रोग (Ascorbic Acid - Scurvy Disease)", "सिट्रिक एसिड", "टार्टरिक एसिड", "ऑक्सालिक एसिड"),
            listOf("Ascorbic Acid (L-ascorbate) - Scurvy (Defective collagen synthesis, bleeding spongiform gums, petechiae, and poor wound healing)", "Citric Acid", "Tartaric Acid", "Oxalic Acid"),
            0,
            "विटामिन-C का रासायनिक नाम 'एस्कॉर्बिक एसिड' है। यह कोलेजन प्रोटीन के प्रोलाइन व लाइसिन के हाइड्रॉक्सिलेशन के लिए आवश्यक है। इसकी कमी से मसूड़ों से खून आता है, घाव नहीं भरते और रक्त वाहिकाएं कमजोर हो जाती हैं (स्कर्वी)। आंवला, नींबू, संतरा और अमरूद इसके सर्वोत्तम स्रोत हैं।",
            "Ascorbic acid acts as a water-soluble reducing agent maintaining prolyl and lysyl hydroxylase iron in Fe2+ active state, essential for triple-helix tropocollagen cross-linking and capillary wall integrity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q10", "sci_9",
            "भोजन को पकाने या अत्यधिक गर्म करने पर कौन-सा ताप-संवेदी (Heat-Sensitive / Thermolabile) विटामिन सबसे पहले नष्ट हो जाता है?",
            "Which heat-labile and water-soluble vitamin is most readily destroyed by culinary boiling, prolonged cooking temperatures, and atmospheric oxidation?",
            listOf("विटामिन 'सी' / एस्कॉर्बिक एसिड (Vitamin C / Ascorbic Acid)", "विटामिन डी", "विटामिन ए", "विटामिन के"),
            listOf("Vitamin C (Ascorbic acid is rapidly oxidized to dehydroascorbic acid and irreversibly hydrolyzed to 2,3-diketogulonic acid on heating)", "Vitamin D (Heat stable)", "Vitamin A", "Vitamin K"),
            0,
            "विटामिन-C अत्यधिक ऊष्मा-संवेदी (Heat-labile) होता है। गर्म करने, उबालने या खुली हवा में छोड़ने पर यह तुरंत ऑक्सीकृत होकर नष्ट हो जाता है। इसलिए खट्टे फलों को कच्चा खाना चाहिए।",
            "Ascorbic acid exhibits low thermal stability; cooking losses in vegetables frequently exceed 50-70% via thermal decomposition and leaching into boiling water.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q11", "sci_9",
            "विटामिन 'सी' वनस्पति स्रोतों (शाकाहारी भोजन) से मानव आंतों में किस आवश्यक खनिज के अवशोषण को कई गुना बढ़ा देता है?",
            "Dietary co-ingestion of Ascorbic Acid (Vitamin C) markedly enhances the intestinal mucosal absorption of which essential mineral from non-heme plant food sources?",
            listOf("लौह तत्व / आयरन (Non-Heme Iron Fe3+ reduced to soluble Fe2+)", "कैल्शियम", "सोडियम", "आयोडीन"),
            listOf("Iron (Reduces insoluble dietary ferric Fe3+ iron to soluble absorbable ferrous Fe2+ iron in duodenum)", "Calcium", "Sodium", "Iodine"),
            0,
            "विटामिन-C पौधों के भोजन में मौजूद अघुलनशील फेरिक आयरन (Fe3+) को घुलनशील फेरस आयरन (Fe2+) में अपचयित (Reduce) कर देता है, जिससे आंतों के DMT-1 रिसेप्टर द्वारा आयरन का अवशोषण 3 से 6 गुना बढ़ जाता है।",
            "Ascorbate reduces ferric (Fe3+) to ferrous (Fe2+) iron at acidic gastric pH, forming stable soluble chelates that prevent precipitation as insoluble ferric hydroxide in the alkaline duodenal lumen.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q12", "sci_9",
            "निम्नलिखित में से कौन-सा फल प्राकृतिक रूप से प्रति 100 ग्राम में 'विटामिन सी' (Ascorbic Acid) का सबसे प्रचुर और समृद्ध स्रोत है?",
            "Which fruit is universally recognized as the richest natural commercial source of Vitamin C (containing up to 600-900 mg per 100g)?",
            listOf("आंवला / भारतीय करौंदा (Amla / Indian Gooseberry - Phyllanthus emblica)", "सेब", "केला", "अंगूर"),
            listOf("Amla / Indian Gooseberry (Phyllanthus emblica - contains ~20-30 times more Vitamin C than oranges, stabilized by tannins)", "Apple", "Banana", "Grapes"),
            0,
            "आंवला (Indian Gooseberry) में प्रति 100 ग्राम 600-900 मिलीग्राम विटामिन-C होता है जो संतरे से 20 गुना अधिक है। आंवले में टैनिन होने के कारण इसका विटामिन-C गर्म करने पर भी जल्दी नष्ट नहीं होता। अमरूद और बारबाडोस चेरी भी इसके बहुत समृद्ध स्रोत हैं।",
            "Phyllanthus emblica (Amla) contains high concentrations of ascorbic acid protected from oxidative degradation by complex gallotannins and emblicanin polyphenols.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q13", "sci_9",
            "मानव मूत्र (Urine) के माध्यम से प्रतिदिन सामान्यतः कौन-से विटामिन उत्सर्जित होते हैं क्योंकि उनका शरीर में संचय नहीं होता?",
            "Which vitamins are continuously excreted in human urine due to their water solubility and lack of long-term storage organs?",
            listOf("विटामिन बी-कॉम्प्लेक्स एवं विटामिन सी (Water-Soluble Vitamins B & C)", "विटामिन ए एवं डी", "विटामिन ई एवं के", "विटामिन ए, डी, ई, के"),
            listOf("Water-Soluble Vitamins (Vitamin C and B-complex vitamins except B12 which is stored in liver)", "Vitamins A and D (Excreted in bile/feces)", "Vitamins E and K", "Fat-soluble Vitamins A, D, E, K"),
            0,
            "जल में घुलनशील विटामिन (B-कॉम्प्लेक्स और C) रक्त से गुर्दे द्वारा छानकर मूत्र के साथ बाहर निकाल दिए जाते हैं, इसलिए इनकी अधिकता से विषाक्तता नहीं होती और इन्हें रोजाना आहार में लेना पड़ता है। (अपवाद: विटामिन B12 यकृत में 3-5 वर्षों तक संचित रहता है)।",
            "Water-soluble vitamins filter freely across renal glomeruli; excess intake exceeding renal tubular reabsorptive thresholds (Tm) results in rapid clearance into urine.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m2_q14", "sci_9",
            "शराबी व्यक्तियों (Chronic Alcoholics) में थायमिन (विटामिन B1) की गंभीर कमी से होने वाले मस्तिष्क विकार को क्या कहा जाता है जिसमें याददाश्त भ्रम और आंखों का पक्षाघात होता है?",
            "The severe acute neurological syndrome seen in chronic alcoholics due to acute Thiamine (B1) deficiency, presenting with ataxia, ophthalmoplegia, and confabulation, is termed:",
            listOf("वर्निक-कोर्साकॉफ सिंड्रोम (Wernicke-Korsakoff Syndrome)", "अल्जाइमर रोग", "पार्किंसन रोग", "डाउन सिंड्रोम"),
            listOf("Wernicke-Korsakoff Syndrome (Wernicke's encephalopathy + Korsakoff's psychosis due to mammillary body and thalamic necrosis)", "Alzheimer's Disease", "Parkinson's Disease", "Down Syndrome"),
            0,
            "शराबियों में खराब आहार और आंतों में थायमिन अवशोषण रुकने से मस्तिष्क के मैमिलरी बॉडीज क्षतिग्रस्त हो जाते हैं, जिससे चलने में लड़खड़ाहट, आंखों की नसों का पक्षाघात और याददाश्त खोना (वर्निक-कोर्साकॉफ सिंड्रोम) होता है।",
            "Chronic ethanol intake impairs intestinal thiamine transport and hepatic thiamine pyrophosphokinase phosphorylation; acute cerebral energy failure causes hemorrhagic lesions in paraventricular and periaqueductal gray matter.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m2_q15", "sci_9",
            "विटामिन 'बी9' (Folate) और विटामिन 'बी12' (Cobalamin) दोनों की कमी से लाल रक्त कोशिकाओं में किस प्रकार का एनीमिया (Macro-ovalocytes) उत्पन्न होता है?",
            "Deficiency of either Vitamin B9 (Folate) or Vitamin B12 disrupts DNA synthesis, leading to ineffective erythropoiesis and which classic morphological type of anemia?",
            listOf("मेगालोब्लास्टिक एनीमिया (Megaloblastic Anaemia with large abnormal erythroblasts in bone marrow)", "माइक्रोसाइटिक एनीमिया", "सिकल सेल एनीमिया", "नॉर्मोसाइटिक एनीमिया"),
            listOf("Megaloblastic Anaemia (Nuclear-cytoplasmic asynchrony producing macrocytic ovalocytes and hypersegmented neutrophils)", "Microcytic Hypochromic Anaemia", "Sickle Cell Anaemia", "Normocytic Aplastic Anaemia"),
            0,
            "B9 और B12 डीएनए के निर्माण हेतु आवश्यक हैं। इनकी कमी से अस्थि मज्जा में आरबीसी का केंद्रक परिपक्व नहीं हो पाता जबकि कोशिका द्रव्य बढ़ता रहता है, जिससे विशाल और अपरिपक्व 'मेगालोब्लास्ट' आरबीसी बनते हैं और न्यूट्रोफिल के केंद्रक बहु-खंडित (Hypersegmented) हो जाते हैं।",
            "Folate and B12 deficiencies impair thymidylate synthase conversion of dUMP to dTMP, inducing nuclear replication arrest while RNA/protein synthesis continues unimpeded (nuclear-cytoplasmic dyssynchrony).",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 3: Minerals & Trace Elements (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m3_q1", "sci_9",
            "मानव रक्त में ऑक्सीजन का परिवहन करने वाले प्रोटीन 'हीमोग्लोबिन' (Hemoglobin) के केंद्र में कौन-सा खनिज तत्व उपस्थित होता है?",
            "Which essential transition metal ion is coordinated in the center of the protoporphyrin IX ring of Hemoglobin and Myoglobin to bind molecular oxygen (O2)?",
            listOf("लौह तत्व / आयरन (Iron - Fe2+ Ferrous Ion)", "मैग्नीशियम", "कॉपर (तांबा)", "कैल्शियम"),
            listOf("Iron (Fe2+ Ferrous state coordinating reversible ligand binding of O2)", "Magnesium (Present in Chlorophyll)", "Copper (Present in Hemocyanin)", "Calcium"),
            0,
            "हीमोग्लोबिन में चार हीम समूह होते हैं जिनमें Fe2+ (फेरस आयरन) ऑक्सीजन के अणु को बांधता है। शरीर में आयरन की कमी से 'आयरन डेफिशिएंसी एनीमिया' होता है। पालक, गुड़, खजूर, यकृत और हरी सब्जियां इसके प्रमुख स्रोत हैं।",
            "Iron in the ferrous (Fe2+) hexacoordinate oxidation state reversibly binds dioxygen in human hemoglobin tetramers; oxidation to ferric (Fe3+) produces non-functional methemoglobin.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q2", "sci_9",
            "थायरॉयड ग्रंथि द्वारा थायरॉक्सिन (T4) और ट्राईआयोडीथायरोनिन (T3) हार्मोन बनाने के लिए किस सूक्ष्म खनिज तत्व (Trace Mineral) की आवश्यकता होती है?",
            "Which trace halogenic mineral is essential for the enzymatic iodination of tyrosine residues on thyroglobulin in the follicular cells of Thyroid gland?",
            listOf("आयोडीन (Iodine - I)", "आयरन", "जिंक", "फ्लोरीन"),
            listOf("Iodine (Incorporated as iodotyrosines into T3 and T4 hormones)", "Iron", "Zinc", "Fluorine"),
            0,
            "थायरॉयड हार्मोन बनाने हेतु प्रतिदिन 150 माइक्रोग्राम आयोडीन की आवश्यकता होती है। आयोडीन की कमी से थायरॉयड ग्रंथि सूजकर बड़ी हो जाती है जिसे 'घेंघा रोग' (Goitre / गलगंड) कहते हैं। भारत सरकार ने इसके लिए 'आयोडीन युक्त नमक' (Iodized Salt) अनिवार्य किया है।",
            "Thyroperoxidase (TPO) oxidizes dietary iodide (I-) to organify tyrosine residues of thyroglobulin into monoiodotyrosine (MIT) and diiodotyrosine (DIT), coupling them into T3 and T4.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q3", "sci_9",
            "मानव शरीर में हड्डियों और दांतों के निर्माण के अलावा 'रक्त का थक्का जमाने' (Blood Clotting) और 'मांसपेशियों के संकुचन' (Muscle Contraction) हेतु कौन-सा खनिज अनिवार्य है?",
            "Which most abundant mineral cation in the human body is essential for bone hydroxyapatite crystallization, actomyosin muscle contraction, and coagulation cascade factor activation?",
            listOf("कैल्शियम (Calcium - Ca2+)", "सोडियम", "सल्फर", "सिलिकॉन"),
            listOf("Calcium (Ca2+ - Essential for sarcoplasmic reticulum muscle activation, prothrombinase complex, and neurotransmitter exocytosis)", "Sodium", "Sulfur", "Silicon"),
            0,
            "मानव शरीर का 99% कैल्शियम हड्डियों और दांतों में 'हाइड्रॉक्सीएपेटाइट' क्रिस्टल के रूप में होता है। शेष 1% रक्त प्लाज्मा में मांसपेशियों के संकुचन, तंत्रिका आवेग और रक्त का थक्का जमाने (क्लॉटिंग फैक्टर IV) में भाग लेता है। दूध, पनीर और तिल इसके सर्वोत्तम स्रोत हैं।",
            "Extracellular Ca2+ is maintained tightly between 8.5-10.5 mg/dL by Parathyroid Hormone (PTH) and Calcitriol; cytosolic Ca2+ surges trigger troponin-C conformational shifts for cross-bridge actomyosin contraction.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q4", "sci_9",
            "मानव शरीर की कोशिकाओं के 'अंदर' (Intracellular Fluid) मुख्य धनायन कौन-सा होता है जो तंत्रिका आवेग और हृदय की धड़कन को नियंत्रित करता है?",
            "Which alkali metal is the predominant major intracellular cation (K+) responsible for maintaining resting membrane potential and cardiac repolarization?",
            listOf("पोटेशियम (Potassium - K+)", "सोडियम (Extracellular)", "कैल्शियम", "मैग्नीशियम"),
            listOf("Potassium (K+ - High intracellular concentration maintained by Na+/K+-ATPase pump)", "Sodium (Na+ - Predominant extracellular cation)", "Calcium", "Magnesium"),
            0,
            "कोशिका के अंदर पोटेशियम (K+) और कोशिका के बाहर सोडियम (Na+) मुख्य आयन होते हैं। Na+/K+ ATPase पंप 3 सोडियम बाहर और 2 पोटेशियम अंदर भेजता है। पोटेशियम हृदय की सामान्य धड़कन और रक्तचाप नियंत्रण हेतु अत्यंत महत्वपूर्ण है (केला, नारियल पानी, आलू इसके स्रोत हैं)।",
            "Potassium (intracellular ~140 mEq/L vs extracellular ~4 mEq/L) establishes the Nernst resting electrical potential across human excitable neuronal and myocardial cell membranes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q5", "sci_9",
            "रक्तचाप (Blood Pressure) और शरीर में तरल संतुलन (Osmotic Balance) को बनाए रखने वाला मुख्य 'बहिर्कोशिकीय' धनायन (Extracellular Cation) कौन-सा है?",
            "Which major extracellular cation (Na+) is the primary osmotic determinant of extracellular fluid volume and systemic arterial blood pressure?",
            listOf("सोडियम (Sodium - Na+ / Common Salt)", "पोटेशियम", "मैंगनीज", "फॉस्फोरस"),
            listOf("Sodium (Na+ - Regulated by Renin-Angiotensin-Aldosterone System and Atrial Natriuretic Peptide)", "Potassium", "Manganese", "Phosphorus"),
            0,
            "सोडियम (साधारण नमक - NaCl) शरीर के बाह्य तरल का आयतन और रक्तचाप बनाए रखता है। अधिक नमक खाने से उच्च रक्तचाप (Hypertension) होता है जबकि अत्यधिक पसीने या निर्जलीकरण से सोडियम घटने पर चक्कर और बेहोशी (Hyponatremia) हो जाती है।",
            "Sodium accounts for over 90% of plasma osmolality; renal tubular sodium reabsorption in the distal nephron is regulated by aldosterone to control circulating blood volume.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q6", "sci_9",
            "पीने के पानी में 'फ्लोराइड' (Fluoride) की उचित मात्रा (1.0 mg/L) दांतों को इनेमल सड़न (Cavities) से बचाती है, लेकिन 1.5 mg/L से अधिक होने पर दांतों और हड्डियों का कौन-सा विकार होता है?",
            "While optimal fluoride levels convert dental hydroxyapatite to acid-resistant fluoroapatite, chronic ingestion of water with >1.5 mg/L fluoride causes:",
            listOf("फ्लोरोसिस - दांतों पर पीले-भूरे धब्बे एवं हड्डियों का टेढ़ापन (Dental and Skeletal Fluorosis)", "पायरिया", "रिकेट्स", "घेंघा रोग"),
            listOf("Fluorosis (Mottled brown enamel of teeth and crippling skeletal fluorosis with joint stiffness)", "Periodontal Pyorrhea", "Rickets", "Endemic Goitre"),
            0,
            "फ्लोराइड इनेमल के हाइड्रॉक्सीएपेटाइट को 'फ्लोरोएपेटाइट' में बदलता है जो कैविटी से बचाता है। लेकिन पानी में अधिक फ्लोराइड से दांतों पर भूरे धब्बे पड़ जाते हैं (डेंटल फ्लोरोसिस) और हड्डियां कूबड़ जैसी मुड़ जाती हैं (स्केलेटल फ्लोरोसिस)। राजस्थान और आंध्र प्रदेश में यह समस्या अधिक है।",
            "Excessive fluoride replaces hydroxyl ions in developing enamel, inducing ameloblast toxicity and hypomineralized subsurface porosity, progressing to osteosclerosis and ligament calcification in skeleton.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q7", "sci_9",
            "मानव प्रतिरक्षा प्रणाली, घाव भरने (Wound Healing) और डीएनए पॉलीमरेज सहित 300 से अधिक एंजाइमों के सक्रियण हेतु कौन-सा खनिज अनिवार्य है?",
            "Which essential trace element is a critical catalytic/structural cofactor for over 300 metalloenzymes (Carbonic Anhydrase, DNA Polymerase, Alcohol Dehydrogenase) and T-cell mediated immunity?",
            listOf("जस्ता / जिंक (Zinc - Zn2+)", "तांबा", "क्रोमियम", "सेलेनियम"),
            listOf("Zinc (Zn2+ - Required for zinc-finger transcription factors, epithelial wound healing, taste acuity, and insulin crystal storage)", "Copper", "Chromium", "Selenium"),
            0,
            "जिंक (जस्ता) प्रतिरक्षा प्रणाली को मजबूत करता है, स्वाद और गंध की पहचान (Gustin प्रोटीन) कराता है और अग्न्याशय में इंसुलिन के भंडारण में भाग लेता है। दस्त (Diarrhea) में बच्चों को ORS के साथ जिंक की गोली दी जाती है।",
            "Zinc ions coordinate finger-domain motifs in nuclear steroid/thyroid receptors, regulate thymulin for T-lymphocyte maturation, and catalyze carbonic anhydrase hydration of carbon dioxide.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q8", "sci_9",
            "मानव शरीर में तांबे (Copper) के चयापचय में आनुवंशिक दोष के कारण यकृत और मस्तिष्क में तांबे के जमाव से आंखों की पुतली में 'केसर-फ्लेशर रिंग' (Kayser-Fleischer Rings) बनने का रोग क्या कहलाता है?",
            "Wilson's Disease (autosomal recessive inborn error of biliary copper excretion caused by ATP7B gene mutation) is diagnosed by hepatic cirrhosis, basal ganglia damage, and corneal:",
            listOf("विल्सन रोग - केसर-फ्लेशर रिंग (Wilson's Disease - Kayser-Fleischer Corneal Rings)", "मेन्केस रोग", "हेमोक्रोमैटोसिस", "गौचर रोग"),
            listOf("Wilson's Disease (Hepatolenticular Degeneration with golden-brown copper deposits in Descemet's corneal membrane)", "Menkes Kinky Hair Syndrome", "Hemochromatosis (Iron overload)", "Gaucher Disease"),
            0,
            "विल्सन रोग में 'सेरुलोप्लास्मिन' की कमी से तांबा (Copper) शरीर से बाहर नहीं निकल पाता और यकृत, मस्तिष्क तथा आंखों के कॉर्निया में जमा होकर 'केसर-फ्लेशर' (KF) छल्ले बना देता है। इसके इलाज हेतु 'डी-पेनिसिलामाइन' दवा दी जाती है।",
            "Mutations in the hepatic copper-transporting ATPase (ATP7B) prevent incorporation of copper into ceruloplasmin and excretion into bile, accumulating toxic free copper in liver, basal ganglia, and cornea.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m3_q9", "sci_9",
            "शरीर में अत्यधिक 'आयरन' (लौह तत्व) के जमाव से त्वचा का कांस्य रंग (Bronze Diabetes) और यकृत क्षति का आनुवंशिक विकार क्या कहलाता है?",
            "The genetic iron overload disorder characterized by uncontrolled intestinal iron absorption and toxic hemosiderin deposition in pancreas, liver, and skin ('Bronze Diabetes') is:",
            listOf("हीमोक्रोमैटोसिस (Hemochromatosis)", "थैलेसीमिया", "विल्सन रोग", "पॉलीसिथीमिया"),
            listOf("Hemochromatosis (HFE gene mutation causing chronic hyperferritinemia and systemic tissue siderosis)", "Thalassemia Minor", "Wilson's Disease", "Polycythemia Vera"),
            0,
            "हीमोक्रोमैटोसिस में शरीर अत्यधिक आयरन सोखता है। यह अतिरिक्त आयरन अग्न्याशय में जमा होकर डायबिटीज और त्वचा में जमा होकर त्वचा को कांस्य/भूरा बना देता है।",
            "HFE gene mutations dysregulate hepatic hepcidin synthesis, leaving ferroportin channels continuously open and causing massive unregulated basolateral enterocyte iron efflux into plasma.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m3_q10", "sci_9",
            "मानव कोशिकाओं में ऊर्जा की मुद्रा 'एटीपी' (ATP - Adenosine Triphosphate) के संश्लेषण और उपयोग हेतु कौन-सा खनिज धनायन अनिवार्य रूप से ATP से जुड़ा रहता है?",
            "Which divalent metallic cation is obligatorily complexed with ATP (as Mg-ATP2-) to neutralize negative polyphosphate charges in all kinase and phosphorylation enzymatic reactions?",
            listOf("मैग्नीशियम (Magnesium - Mg2+)", "जिंक", "कैल्शियम", "सोडियम"),
            listOf("Magnesium (Mg2+ - Essential cofactor for ATP stabilization, DNA replication, and chlorophyll in plants)", "Zinc", "Calcium", "Sodium"),
            0,
            "शरीर में कोई भी एंजाइम शुद्ध ATP का उपयोग नहीं कर सकता; वह हमेशा 'Mg-ATP' संकुल का ही उपयोग करता है। मैग्नीशियम 300 से अधिक उपापचयी एंजाइमों का सह-कारक है और मांसपेशियों व तंत्रिकाओं को शिथिल रखता है।",
            "Magnesium chelation with oxygen atoms of alpha, beta, and gamma phosphate groups of ATP coordinates proper geometry for nucleophilic phosphotransfer in hexokinase and phosphofructokinase.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q11", "sci_9",
            "एंटीऑक्सीडेंट एंजाइम 'ग्लूटाथियोन परऑक्सीडेज' (Glutathione Peroxidase) के सक्रिय केंद्र में कौन-सा दुर्लभ गैर-धात्विक सूक्ष्म तत्व (Trace Element) पाया जाता है?",
            "Which essential trace metalloid element is incorporated as the 21st amino acid 'Selenocysteine' into the catalytic active site of human antioxidant enzyme Glutathione Peroxidase?",
            listOf("सेलेनियम (Selenium - Se)", "सल्फर", "सिलिकॉन", "बोरॉन"),
            listOf("Selenium (Incorporated as selenocysteine encoded by UGA stop codon via SECIS element)", "Sulfur", "Silicon", "Boron"),
            0,
            "सेलेनियम एक शक्तिशाली एंटीऑक्सीडेंट सूक्ष्म तत्व है जो विटामिन-ई के साथ मिलकर कोशिकाओं को पेरोक्साइड्स और मुक्त कणों के नुकसान से बचाता है। चीन में सेलेनियम की कमी से दिल की बीमारी 'केशण रोग' (Keshan Disease) खोजी गई थी।",
            "Selenium in the form of selenocysteine confers nucleophilic catalytic properties to glutathione peroxidase (GPx) and iodothyronine deiodinases (converting T4 to active T3).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m3_q12", "sci_9",
            "इंसुलिन हार्मोन की क्रियाशीलता को बढ़ाने और रक्त में ग्लूकोज के अवशोषण (Glucose Tolerance Factor - GTF) में कौन-सा सूक्ष्म खनिज मदद करता है?",
            "Which trace mineral element forms the core of the biological Glucose Tolerance Factor (GTF), potentiating the receptor action of Insulin in peripheral tissues?",
            listOf("क्रोमियम (Chromium - Cr3+ Trivalent Chromium)", "लेड", "कैडमियम", "पारा"),
            listOf("Chromium (Trivalent Cr3+ enhancing insulin receptor tyrosine kinase phosphorylation)", "Lead (Toxic heavy metal)", "Cadmium (Toxic metal causing Itai-Itai)", "Mercury (Toxic metal causing Minamata)"),
            0,
            "त्रिसंयोजी क्रोमियम (Cr3+) कोशिकाओं की सतह पर इंसुलिन रिसेप्टर्स की संवेदनशीलता को बढ़ाता है जिससे ग्लूकोज तेजी से कोशिकाओं में प्रवेश कर ऊर्जा बनाता है। साबुत अनाज और ब्रोकली इसके स्रोत हैं।",
            "Chromium is a constituent of low-molecular-weight chromium-binding substance (chromodulin), amplifying insulin signaling transduction upon insulin-receptor binding.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m3_q13", "sci_9",
            "मानव बालों, त्वचा और नाखूनों के मुख्य संरचनात्मक प्रोटीन 'केराटिन' (Keratin) में डाईसल्फाइड बंध (Disulfide bonds) बनाने वाला कौन-सा खनिज तत्व प्रचुरता से होता है?",
            "Which non-metallic mineral element forms covalent disulfide cross-link bonds (-S-S-) between cysteine residues in Keratin, giving mechanical tensile strength to hair and nails?",
            listOf("सल्फर / गंधक (Sulfur - S)", "फास्फोरस", "क्लोरीन", "आयोडीन"),
            listOf("Sulfur (Constituent of amino acids Methionine and Cysteine)", "Phosphorus", "Chlorine", "Iodine"),
            0,
            "सल्फर युक्त अमीनो एसिड (सिस्टीन और मेथियोनीन) बालों के केराटिन में डाईसल्फाइड पुल बनाते हैं। बाल जलने पर जो तीखी गंध आती है वह सल्फर के जलने के कारण होती है। लहसुन, प्याज और अंडों में सल्फर प्रचुर मात्रा में होता है।",
            "Disulfide bonds formed by the oxidation of sulfhydryl (-SH) groups of cysteine residues provide structural rigidity and thermal resistance to keratinized epidermal appendages.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m3_q14", "sci_9",
            "रक्त में पोटेशियम के स्तर में खतरनाक गिरावट (Hypokalemia) से मांसपेशियों में कमजोरी और हृदय में कौन-सी जानलेवा अनियमितता (Arrhythmia) हो सकती है?",
            "Severe clinical Hypokalemia (Serum Potassium < 3.0 mEq/L, caused by diuretics or persistent vomiting) causes muscular paralysis and which characteristic ECG abnormality?",
            listOf("हृदय अतालता एवं ईसीजी में U-वेव का दिखना (Cardiac Arrhythmias & Prominent U-Waves on ECG)", "ईसीजी में ST-एलिवेशन", "अचानक उच्च रक्तचाप", "मस्तिष्क ज्वर"),
            listOf("Ventricular Arrhythmias, flattened T-waves, and prominent U-waves on ECG", "Hyperacute ST-segment elevation", "Sudden hypertensive crisis", "Meningitis"),
            0,
            "पोटेशियम की कमी (Hypokalemia) से हृदय की मांसपेशियों की विद्युत पुनर्गठन (Repolarization) बाधित होती है, जिससे ईसीजी में T-वेव चपटी हो जाती है, U-वेव उभर आती है और वेंट्रिकुलर फाइब्रिलेशन से मृत्यु हो सकती है।",
            "Hypokalemia hyperpolarizes resting membrane potentials of cardiac myocytes, prolonging the effective refractory period and predisposing to fatal re-entrant ventricular tachyarrhythmias (Torsades de Pointes).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m3_q15", "sci_9",
            "दूध, दही, पनीर और हरी पत्तेदार सब्जियों के अलावा हड्डियों के निर्माण हेतु 'फास्फोरस' (Phosphorus) और कैल्शियम का आदर्श आहार अनुपात (Ca:P Ratio) क्या होना चाहिए?",
            "What is the scientifically recommended ideal dietary Calcium-to-Phosphorus ratio (Ca:P) for optimal bone mineralization and calcium retention in adults?",
            listOf("1 : 1 (या 1:1 से 2:1 के बीच)", "1 : 10", "10 : 1", "1 : 5"),
            listOf("1 : 1 to 2 : 1 (Balancing PTH regulation and preventing bone resorption)", "1 : 10 (Excess phosphorus causes bone demineralization)", "10 : 1", "1 : 5"),
            0,
            "कैल्शियम और फास्फोरस का आदर्श आहार अनुपात 1:1 होना चाहिए। यदि भोजन में फास्फोरस (कोल्ड ड्रिंक्स, प्रोसेस्ड फूड) बहुत अधिक हो जाए तो पैराथायरॉयड हार्मोन हड्डियों से कैल्शियम खींचकर रक्त में लाने लगता है जिससे हड्डियां कमजोर हो जाती हैं।",
            "An optimal 1:1 dietary Ca:P ratio supports precipitation of stoichiometric bone hydroxyapatite Ca10(PO4)6(OH)2 without triggering secondary hyperparathyroidism.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 4: Macronutrients, Metabolism & Energy Balance (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m4_q1", "sci_9",
            "मानव शरीर में 1 ग्राम कार्बोहाइड्रेट, 1 ग्राम प्रोटीन और 1 ग्राम वसा (Fat) के पूर्ण ऑक्सीकरण से क्रमशः कितनी ऊर्जा (कैलोरी) प्राप्त होती है?",
            "What are the physiological fuel energy values (in kilocalories per gram) yielded upon complete metabolic oxidation of Carbohydrates, Proteins, and Fats respectively?",
            listOf("4 kcal, 4 kcal, एवं 9 kcal (Carbs: 4 kcal/g, Protein: 4 kcal/g, Fat: 9 kcal/g)", "9 kcal, 4 kcal, एवं 4 kcal", "4 kcal, 9 kcal, एवं 4 kcal", "2 kcal, 4 kcal, एवं 8 kcal"),
            listOf("Carbohydrates: 4.0 kcal/g, Proteins: 4.0 kcal/g, Fats: 9.0 kcal/g (Atwater Energy Factors)", "9 kcal, 4 kcal, 4 kcal", "4 kcal, 9 kcal, 4 kcal", "2 kcal, 4 kcal, 8 kcal"),
            0,
            "वसा (Fat/Lipid) में हाइड्रोजन और कार्बन का अनुपात अधिक होने तथा ऑक्सीजन कम होने से यह सबसे सघन ऊर्जा स्रोत है (9 kcal प्रति ग्राम - कार्बोहाइड्रेट और प्रोटीन से दोगुने से भी अधिक)। कार्बोहाइड्रेट और प्रोटीन दोनों 4 kcal प्रति ग्राम देते हैं।",
            "Atwater physiological energy values calculate net usable biological enthalpy: Fats yield ~9.3 kcal/g due to high hydrocarbon reduction state, while Carbohydrates and Proteins yield ~4.1 kcal/g.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q2", "sci_9",
            "मानव शरीर में त्वरित ऊर्जा (Instant Energy) का प्राथमिक और सबसे पसंदीदा स्रोत कौन-सा सरल मोनोसैकेराइड कार्बोहाइड्रेट है?",
            "Which simple hexose monosaccharide serves as the primary, instantaneous circulating fuel substrate for human cellular respiration and the sole energy source for brain and erythrocytes under basal conditions?",
            listOf("ग्लूकोज (D-Glucose / Dextrose)", "फ्रुक्टोज", "गैलेक्टोज", "सुक्रोज"),
            listOf("D-Glucose (Blood Sugar / Dextrose - C6H12O6 entering glycolysis to yield ATP)", "Fructose (Fruit sugar)", "Galactose", "Sucrose (Table sugar)"),
            0,
            "ग्लूकोज (D-Glucose) रक्त शर्करा है जो कोशिकाओं में ग्लाइकोलाइसिस और क्रेब्स चक्र द्वारा तुरंत एटीपी (ATP) ऊर्जा बनाती है। मानव मस्तिष्क और आरबीसी (RBC) सामान्य स्थिति में केवल ग्लूकोज पर ही निर्भर रहते हैं।",
            "D-Glucose is transported across cell membranes via insulin-dependent GLUT4 or constitutive GLUT1/3 transporters, phosphorylated by hexokinase to initiate glycolysis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q3", "sci_9",
            "मानव और जानवरों के शरीर में अतिरिक्त ग्लूकोज को यकृत (Liver) और कंकाल की मांसपेशियों में किस पॉलीसैकेराइड के रूप में संचित (Store) किया जाता है?",
            "Excess dietary glucose is polymerized and stored in the human liver (~100g) and skeletal muscle tissue (~400g) in the form of which branched alpha-D-glucan polysaccharide?",
            listOf("ग्लाइकोजन / जन्तु स्टार्च (Glycogen / Animal Starch)", "सेल्युलोज", "स्टार्च", "काइटीन"),
            listOf("Glycogen (Highly branched polymer with alpha-1,4 and alpha-1,6 glycosidic bonds)", "Cellulose (Plant structural polymer)", "Starch (Amylose & Amylopectin in plants)", "Chitin (Fungal cell wall)"),
            0,
            "ग्लाइकोजन को 'जंतु स्टार्च' (Animal Starch) कहते हैं। जब रक्त में ग्लूकोज बढ़ता है, तो इंसुलिन हार्मोन इसे ग्लाइकोजन में बदल देता है (ग्लाइकोजेनेसिस)। उपवास के समय ग्लूकागन हार्मोन इसे तोड़कर पुनः ग्लूकोज बनाता है (ग्लाइकोजेनोलिसिस)।",
            "Glycogen is a multibranched polysaccharide synthesized around a central glycogenin protein core, providing rapid mobilizable glucose reserves during acute hypoglycemic stress.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q4", "sci_9",
            "प्रकृति में पाया जाने वाला सबसे मीठा प्राकृतिक शर्करा (Sweetest Natural Sugar) कौन-सा है जो फलों और शहद (Honey) में प्रचुर मात्रा में होता है?",
            "Which ketohexose monosaccharide is universally recognized as the sweetest tasting of all naturally occurring dietary sugars, abundant in fruits and pure honey?",
            listOf("फ्रुक्टोज / फल शर्करा (Fructose / Fruit Sugar / Levulose)", "ग्लूकोज", "सुक्रोज (चीनी)", "लैक्टोज (दूध)"),
            listOf("Fructose (Levulose - Relative sweetness ~1.7 times sweeter than sucrose)", "Glucose", "Sucrose (Table sugar - Glucose + Fructose)", "Lactose (Milk sugar)"),
            0,
            "फ्रुक्टोज (Fructose) सबसे मीठी प्राकृतिक शर्करा है। इसका ग्लाइसेमिक इंडेक्स (GI) कम होता है क्योंकि यह सीधे यकृत में मेटाबोलाइज होती है और इसे अवशोषण हेतु इंसुलिन की आवश्यकता नहीं होती। शहद और पके फलों में यह प्रचुर मात्रा में होती है।",
            "Fructose is a ketohexose absorbed via facilitative diffusion through GLUT5 enterocyte apical transporters and phosphorylated by hepatic fructokinase bypassing phosphofructokinase regulation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q5", "sci_9",
            "दैनिक जीवन में इस्तेमाल होने वाली साधारण 'घरेलू टेबल चीनी' (Table Sugar / Cane Sugar) रासायनिक रूप से कौन-सा डाईसैकेराइड है?",
            "Commercial refined white granulated cane sugar (Table Sugar) is chemically classified as which non-reducing disaccharide composed of Glucose and Fructose linked by an alpha-1,beta-2 bond?",
            listOf("सुक्रोज (Sucrose - Glucose + Fructose)", "माल्टोज (Glucose + Glucose)", "लैक्टोज (Glucose + Galactose)", "सेलोबायोज"),
            listOf("Sucrose (Invert sugar upon hydrolysis into D-glucose and D-fructose)", "Maltose (Malt sugar)", "Lactose (Milk sugar)", "Cellobiose"),
            0,
            "चीनी 'सुक्रोज' (Sucrose) है जो गन्ने और चुकंदर से प्राप्त होती है। यह एक ग्लूकोज और एक फ्रुक्टोज अणु से मिलकर बनती है। आंतों का 'सुकरेज' (इन्वर्टेज) एंजाइम इसे तोड़कर रक्त में पहुंचाता है।",
            "Sucrose is an alpha-D-glucopyranosyl-(1->2)-beta-D-fructofuranoside; hydrolysis by intestinal sucrase yields equimolar glucose and fructose (invert sugar).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q6", "sci_9",
            "स्तनधारियों के दूध (Milk) में पाई जाने वाली प्राकृतिक शर्करा 'लैक्टोज' (Lactose / दुग्ध शर्करा) किन दो मोनोसैकेराइड इकाइयों से मिलकर बनती है?",
            "Lactose (Milk Sugar), the exclusive carbohydrate energy source synthesized in mammary glands for nursing infants, is a disaccharide composed of:",
            listOf("ग्लूकोज एवं गैलेक्टोज (Glucose and Galactose)", "ग्लूकोज एवं फ्रुक्टोज", "ग्लूकोज एवं ग्लूकोज", "फ्रुक्टोज एवं गैलेक्टोज"),
            listOf("Glucose and Galactose (Beta-1,4-galactosidic linkage hydrolyzed by brush-border lactase)", "Glucose and Fructose", "Glucose and Glucose (Maltose)", "Fructose and Galactose"),
            0,
            "लैक्टोज दूध की शर्करा है। वयस्कों में जब आंत का 'लैक्टेज' (Lactase) एंजाइम कम हो जाता है, तो दूध पचने के बजाय गैस, मरोड़ और दस्त करता है, जिसे 'लैक्टोज असहिष्णुता' (Lactose Intolerance) कहते हैं।",
            "Lactose is cleaved by small intestinal apical lactase-phlorizin hydrolase into D-glucose and D-galactose; primary lactase non-persistence leads to colonic bacterial fermentation producing H2, CH4, and osmotic diarrhea.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q7", "sci_9",
            "पौधों की कोशिका भित्ति (Cell Wall) में प्रचुरता से पाया जाने वाला 'सेल्युलोज' (Cellulose) मानव पाचन तंत्र द्वारा क्यों नहीं पच पाता?",
            "Why is Cellulose (dietary roughage / fiber) indigestible by the human gastrointestinal tract despite being composed entirely of repeating D-glucose units?",
            listOf("मानव पाचन तंत्र में बीटा-1,4-ग्लाइकोसिडिक बंध को तोड़ने वाला 'सेल्युलेज' (Cellulase) एंजाइम नहीं होता", "सेल्युलोज विषैला होता है", "सेल्युलोज जल में अघुलनशील है", "सेल्युलोज में ग्लूकोज नहीं होता"),
            listOf("Human digestive secretions lack the enzyme Cellulase required to hydrolyze beta-1,4-glucosidic bonds", "Cellulose is biologically toxic", "Cellulose is completely hydrophobic", "Cellulose contains no glucose residues"),
            0,
            "सेल्युलोज में ग्लूकोज अणु 'बीटा-1,4' बंध द्वारा जुड़े होते हैं। मनुष्यों में केवल 'अल्फा-1,4' (स्टार्च) को तोड़ने वाले एमाइलेज होते हैं। गाय और दीमक के पेट में सहजीवी बैक्टीरिया सेल्युलेज बनाते हैं जो इसे पचा सकते हैं। मानव में यह अघुलनशील 'आहार रेशा' (Dietary Fiber) बनकर कब्ज रोकता है।",
            "Human amylases selectively hydrolyze alpha-(1->4) and alpha-(1->6) glycosidic linkages of starch and glycogen, unable to cleave linear beta-(1->4) linkages of structural cellulose microfibrils.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q8", "sci_9",
            "प्रोटीन की मूल रचनात्मक और कार्यात्मक इकाइयां (Building Blocks of Proteins) क्या होती हैं?",
            "What are the fundamental monomeric biochemical building blocks linked together by covalent peptide bonds (-CONH-) to form structural and functional Proteins?",
            listOf("अमीनो अम्ल (Amino Acids - 20 Standard Amino Acids)", "फैटी एसिड", "ग्लूकोज", "न्यूक्लियोटाइड्स"),
            listOf("Amino Acids (Alpha-amino carboxylic acids with specific R-side chains)", "Fatty acids", "Glucose molecules", "Nucleotides"),
            0,
            "प्रोटीन 'अमीनो अम्लों' के बहुलक (Polymers) होते हैं जो पेप्टाइड बंध द्वारा जुड़ते हैं। मानव शरीर में 20 प्रकार के मानक अमीनो अम्ल होते हैं, जिनमें से 9 'आवश्यक अमीनो अम्ल' (Essential Amino Acids) होते हैं जिन्हें भोजन से लेना अनिवार्य है।",
            "Proteins are linear heteropolymers of L-alpha-amino acids joined by planar peptide bonds, folding into complex secondary, tertiary, and quaternary conformations determined by Anfinsen's dogma.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q9", "sci_9",
            "निम्नलिखित में से कौन-सा 'आवश्यक अमीनो अम्ल' (Essential Amino Acid) है जिसे मानव शरीर स्वयं संश्लेषित नहीं कर सकता और इसे आहार से प्राप्त करना अनिवार्य है?",
            "Which of the following is an Essential Amino Acid that cannot be synthesized de novo by human metabolism and must be supplied through dietary protein intake?",
            listOf("लाइसिन / ल्यूसीन / मेथियोनीन / ट्रिप्टोफैन (Lysine / Leucine / Methionine / Tryptophan)", "ग्लाइसिन", "एलानाइन", "ग्लूटामिक एसिड"),
            listOf("Lysine (along with Leucine, Isoleucine, Valine, Methionine, Phenylalanine, Threonine, Tryptophan, and Histidine)", "Glycine", "Alanine", "Glutamic acid"),
            0,
            "9 आवश्यक अमीनो अम्ल हैं: हिस्टिडीन, आइसोल्यूसीन, ल्यूसीन, लाइसिन, मेथियोनीन, फेनिलएलनिन, थ्रियोनीन, ट्रिप्टोफैन और वैलीन। दालों में 'मेथियोनीन' कम और 'लाइसिन' अधिक होता है, जबकि अनाजों (चावल/गेहूं) में लाइसिन कम और मेथियोनीन अधिक होता है। इसलिए 'दाल-चावल' एक पूर्ण प्रोटीन भोजन बन जाता है।",
            "The 9 nutritionally essential amino acids possess complex carbon skeletons whose biosynthetic pathways were lost during metazoan evolution, requiring mandatory dietary ingestion.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m4_q10", "sci_9",
            "शाकाहारी भोजन में 'पूर्ण प्रोटीन' (Complete Protein - जिसमें सभी 9 आवश्यक अमीनो अम्ल सही अनुपात में होते हैं) का सर्वोत्तम वनस्पति स्रोत कौन-सा है?",
            "Which plant-based legume is universally celebrated as a complete high-biological-value protein source containing all essential amino acids and rich in isoflavones?",
            listOf("सोयाबीन (Soybean - ~40% High Biological Value Protein)", "चावल", "आलू", "मक्का"),
            listOf("Soybean (Glycine max - Contains ~36-40% protein with high PDCAAS score ~1.0)", "White Rice", "Potato", "Corn"),
            0,
            "सोयाबीन में 40% प्रोटीन होता है जो किसी भी अन्य पौधे या दाल से दोगुना है। इसका प्रोटीन पाचन स्कोर (PDCAAS = 1.0) अंडे और दूध के बराबर होता है।",
            "Soy protein isolate exhibits a Protein Digestibility-Corrected Amino Acid Score (PDCAAS) of 1.0, matching egg albumin and bovine casein in essential amino acid bioavailability.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q11", "sci_9",
            "हृदय के स्वास्थ्य के लिए अत्यंत लाभकारी 'ओमेगा-3 फैटी एसिड' (Omega-3 Fatty Acids - ALA, EPA, DHA) प्राकृतिक रूप से किन स्रोतों में प्रचुर मात्रा में पाए जाते हैं?",
            "Cardioprotective Polyunsaturated Fatty Acids (Omega-3 PUFAs: Alpha-Linolenic Acid - ALA, EPA, and DHA) are abundantly present in:",
            listOf("अलसी के बीज (Flaxseeds), अखरोट, चिया बीज एवं वसायुक्त समुद्री मछलियां (Salmon, Mackerel)", "पाम ऑयल और डालडा", "शुद्ध मक्खन", "नारियल तेल"),
            listOf("Flaxseeds (Linseed / Linum usitatissimum), Walnuts, Chia seeds, and Oily deep-sea cold-water Fish (Salmon, Sardines, Tuna)", "Palm oil and hydrogenated Vanaspati ghee", "Pure Butter", "Coconut oil"),
            0,
            "ओमेगा-3 फैटी एसिड (ALA, EPA, DHA) रक्त में ट्राइग्लिसराइड्स को घटाते हैं, रक्त के थक्के जमने से रोकते हैं और सूजन कम करते हैं। शाकाहारियों के लिए अलसी (Flaxseed) और अखरोट तथा मांसाहारियों के लिए साल्मन/मैकेरल मछली इसके सर्वोत्तम स्रोत हैं।",
            "Omega-3 fatty acids possess a double bond located at the third carbon from the methyl (omega) end, serving as substrates for anti-inflammatory resolvins, protectins, and 3-series prostaglandins.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q12", "sci_9",
            "वनस्पति तेलों (Vegetable Oils) से 'वनस्पति घी' (डालडा / Margarine) बनाने की औद्योगिक प्रक्रिया में निकेल (Ni) उत्प्रेरक की उपस्थिति में कौन-सी गैस प्रवाहित की जाती है?",
            "In the industrial manufacturing of semi-solid Vanaspati Ghee from liquid vegetable oils, which gas is bubbled through under high pressure using a Nickel (Ni) catalyst (Hydrogenation of Oils)?",
            listOf("हाइड्रोजन गैस - हाइड्रोजनीकरण (Hydrogen Gas - Catalytic Hydrogenation)", "ऑक्सीजन गैस", "नाइट्रोजन गैस", "कार्बन डाइऑक्साइड"),
            listOf("Hydrogen Gas (Catalytic Hydrogenation converting unsaturated cis-double bonds into saturated single bonds and harmful trans-fats)", "Oxygen gas", "Nitrogen gas", "Carbon dioxide"),
            0,
            "वनस्पति तेलों के असंतृप्त द्वि-बंधों पर हाइड्रोजन गैस जोड़ने की प्रक्रिया 'हाइड्रोजनीकरण' (Hydrogenation) कहलाती है। इससे अस्वास्थ्यकर 'ट्रांस फैट' (Trans Fats) बनते हैं जो धमनियों में खराब कोलेस्ट्रॉल (LDL) बढ़ाकर हार्ट अटैक का खतरा बढ़ाते हैं।",
            "Catalytic hydrogenation of polyunsaturated fatty acid triglycerides with nickel catalyst solidifies oils via saturation, yielding artificial elaidic acid trans-fatty acid isomers that accelerate coronary atherosclerosis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q13", "sci_9",
            "मानव रक्त प्लाज्मा में 'अच्छा कोलेस्ट्रॉल' (Good Cholesterol) और 'खराब कोलेस्ट्रॉल' (Bad Cholesterol) क्रमशः किन्हें कहा जाता है?",
            "In clinical lipid profiling, which circulating lipoproteins are universally designated as 'Good Cholesterol' and 'Bad Cholesterol' respectively?",
            listOf("एचडीएल - अच्छा कोलेस्ट्रॉल (HDL) एवं एलडीएल - खराब कोलेस्ट्रॉल (LDL)", "एलडीएल अच्छा और एचडीएल खराब", "वीएलडीएल अच्छा और काइलोमाइक्रोन खराब", "ट्राइग्लिसराइड्स अच्छा और एचडीएल खराब"),
            listOf("HDL (High-Density Lipoprotein - Good Cholesterol) and LDL (Low-Density Lipoprotein - Bad Cholesterol / Atherogenic)", "LDL Good and HDL Bad", "VLDL Good and Chylomicrons Bad", "Triglycerides Good and HDL Bad"),
            0,
            "HDL (उच्च घनत्व लिपोप्रोटीन) धमनियों की दीवारों से अतिरिक्त कोलेस्ट्रॉल को खींचकर यकृत में लाता है (रिवर्स कोलेस्ट्रॉल ट्रांसपोर्ट), इसलिए यह दिल का रक्षक है। LDL (निम्न घनत्व लिपोप्रोटीन) कोलेस्ट्रॉल को धमनियों में जमाकर ब्लॉकेज बनाता है, इसलिए यह खराब है।",
            "HDL facilitates reverse cholesterol transport via ABCA1/SR-B1 scavenger receptors, clearing peripheral cholesterol to liver for bile excretion, whereas oxidized LDL enters arterial subendothelium triggering macrophage foam cell plaque formation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q14", "sci_9",
            "मानव शरीर में पूर्ण विश्राम (Completely Resting & Fasting state) की स्थिति में जीवन की आवश्यक जैविक क्रियाओं (हृदय की धड़कन, श्वसन, गुर्दे का कार्य) को चालू रखने हेतु आवश्यक न्यूनतम ऊर्जा दर क्या कहलाती है?",
            "The minimum baseline energy expenditure (in calories/day) required by a homeothermic resting human in a post-absorptive thermo-neutral state to maintain vital vegetative cellular metabolic functions is termed:",
            listOf("बेसल मेटाबॉलिक रेट / आधारभूत चयापचय दर (Basal Metabolic Rate - BMR)", "ग्लाइकोलाइसिस रेट", "डाइजेस्टिव इंडेक्स", "एक्टिविटी कोशेंट"),
            listOf("Basal Metabolic Rate (BMR - Typically ~1400-1800 kcal/day for an average adult, regulated by Thyroid Thyroxine T4/T3)", "Glycolysis Quotient", "Digestive Index", "Physical Activity Level"),
            0,
            "BMR वह न्यूनतम कैलोरी ऊर्जा है जो बिना कोई शारीरिक काम किए केवल जीवित रहने (सांस लेने, दिल धड़कने, मस्तिष्क व कोशिकाओं के काम करने) के लिए चाहिए होती है। थायरॉयड ग्रंथि का 'थायरॉक्सिन' हार्मोन BMR का मुख्य नियंत्रक होता है।",
            "Basal Metabolic Rate reflects cellular ATP consumption by Na+/K+-ATPase membrane pumps, protein turnover, and mitochondrial proton leak in visceral organs (liver, brain, heart, kidneys) under basal resting conditions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m4_q15", "sci_9",
            "किसी खाद्य पदार्थ को खाने के बाद रक्त में ग्लूकोज का स्तर कितनी तेजी से बढ़ता है, इसे मापने वाले पैमाने को क्या कहा जाता है?",
            "What numerical ranking system (scale of 0 to 100 relative to pure glucose) measures how rapidly a carbohydrate-containing food elevates postprandial blood glucose concentrations?",
            listOf("ग्लाइसेमिक इंडेक्स (Glycemic Index - GI)", "बॉडी मास इंडेक्स (BMI)", "कैलोरी इंडेक्स", "डाइजेस्टिव स्कोर"),
            listOf("Glycemic Index (GI - High GI ≥70 like white bread/potatoes, Low GI ≤55 like oats/pulses/apples)", "Body Mass Index (BMI)", "Caloric Density Index", "Digestive Enzyme Score"),
            0,
            "ग्लाइसेमिक इंडेक्स (GI) बताता है कि कोई भोजन खून में शुगर कितनी तेजी से बढ़ाता है। सफेद चावल, चीनी और मैदा का GI उच्च (High GI > 70) होता है जो डायबिटीज में नुकसानदेह है। दालें, ओट्स, सेब और चने का GI कम (Low GI < 55) होता है जो शुगर को स्थिर रखते हैं।",
            "Glycemic Index assesses the incremental area under the 2-hour blood glucose response curve (iAUC) following ingestion of 50g available carbohydrates compared to 50g reference standard glucose.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 5: Human Digestion, Digestive Enzymes & Gastrointestinal Physiology (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m5_q1", "sci_9",
            "मानव मुख गुहा (Mouth) में लार (Saliva) में पाया जाने वाला कौन-सा एंजाइम स्टार्च (Starch) को माल्टोज शर्करा में तोड़कर पाचन की शुरुआत करता है?",
            "Which digestive enzyme present in human saliva (secreted by parotid, submandibular, and sublingual glands at pH 6.8) initiates starch hydrolysis into maltose disaccharides?",
            listOf("लार एमाइलेज / टायलिन (Salivary Amylase / Ptyalin)", "पेप्सिन", "ट्रिप्सिन", "लाइपेस"),
            listOf("Salivary Amylase / Ptyalin (Alpha-amylase hydrolyzing internal alpha-1,4-glucosidic bonds)", "Gastric Pepsin", "Pancreatic Trypsin", "Gastric Lipase"),
            0,
            "पाचन की शुरुआत मुंह से होती है। लार में 'टायलिन' (लार एमाइलेज) एंजाइम होता है जो भोजन के लगभग 30% स्टार्च को माल्टोज और डेक्सट्रिन में तोड़ देता है। लार में जीवाणुओं को मारने वाला 'लाइसोजाइम' (Lysozyme) एंजाइम भी होता है।",
            "Salivary alpha-amylase (ptyalin) initiates carbohydrate cleavage of dietary amylose and amylopectin in the oral cavity until inactivated by acidic gastric hydrochloric acid in the stomach.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q2", "sci_9",
            "मानव आमाशय (Stomach) की भित्ति में स्थित 'ऑक्सिंटिक / पैराइटल कोशिकाएं' (Oxyntic / Parietal Cells) कौन-सा शक्तिशाली अम्ल स्रावित करती हैं?",
            "Which mineral acid (maintaining a sterile, strongly acidic intra-gastric pH of 1.5 to 2.5) is secreted by the Oxyntic/Parietal cells of gastric glands?",
            listOf("हाइड्रोक्लोरिक अम्ल (Hydrochloric Acid - HCl)", "सल्फ्यूरिक अम्ल", "नाइट्रिक अम्ल", "एसिटिक अम्ल"),
            listOf("Hydrochloric Acid (HCl - secreted by H+/K+ ATPase proton pumps on apical parietal membranes)", "Sulfuric Acid", "Nitric Acid", "Acetic Acid"),
            0,
            "आमाशय का HCl भोजन के साथ आए हानिकारक जीवाणुओं को मारता है, निष्क्रिय पेप्सिनोजेन को सक्रिय 'पेप्सिन' एंजाइम में बदलता है और भोजन के रेशों को गलता है। पेट की दीवार को इस तेजाब से बचाने के लिए श्लेष्मा (Mucus) की मोटी परत होती है।",
            "Gastric parietal cell H+/K+-ATPase pumps actively pump protons into the gastric lumen in exchange for potassium, generating concentrated HCl that denatures dietary proteins and kills ingested pathogens.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q3", "sci_9",
            "आमाशय में प्रोटीन का पाचन करने वाला मुख्य प्रोटीयोलाइटिक एंजाइम कौन-सा है जो अम्लीय माध्यम (pH 1.5-2) में सक्रिय होता है?",
            "Which major endopeptidase enzyme of the stomach is cleaved from inactive zymogen pepsinogen at acidic pH to hydrolyze proteins into proteoses and peptones?",
            listOf("पेप्सिन (Pepsin)", "ट्रिप्सिन", "एमाइलेज", "माल्टेज"),
            listOf("Pepsin (Aspartic protease cleaving peptide bonds adjacent to aromatic amino acids phenylalanine, tyrosine, tryptophan)", "Trypsin", "Amylase", "Maltase"),
            0,
            "आमाशय की मुख्य (Chief/Peptic) कोशिकाएं 'पेप्सिनोजेन' बनाती हैं जो HCl की उपस्थिति में सक्रिय 'पेप्सिन' (Pepsin) में बदल जाता है और प्रोटीनों को पेप्टोन्स तथा प्रोटीओज में तोड़ देता है।",
            "Pepsin is an autocatalytic endopeptidase that hydrolyzes peptide backbones of dietary proteins into smaller polypeptide fragments in the acidic gastric environment.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q4", "sci_9",
            "शिशुओं के पेट में दूध के प्रोटीन 'कैसीन' (Casein) को फाड़कर दही में जमाने (Milk Curdling) वाला विशिष्ट एंजाइम कौन-सा होता है?",
            "Which proteolytic enzyme present in the gastric juice of human and bovine infants coagulates soluble milk casein into insoluble calcium paracaseinate in the presence of calcium?",
            listOf("रेनिन (Rennin / Chymosin - Prorennin)", "पेप्सिन", "रेनिन (Renin - गुर्दे का हार्मोन)", "ट्रिप्सिन"),
            listOf("Rennin / Chymosin (Gastric enzyme curdling milk protein casein in infants)", "Pepsin", "Renin (Kidney hormone regulating blood pressure)", "Trypsin"),
            0,
            "रेनिन (Rennin / काइमोसिन) दूध के कैसिइन प्रोटीन को कैल्शियम पैराकैसीनेट (दही) में बदल देता है ताकि वह पेट में रुककर आसानी से पच सके। (ध्यान दें: दो 'n' वाला Rennin पाचक एंजाइम है, जबकि एक 'n' वाला Renin गुर्दे से निकलने वाला रक्तचाप नियंत्रक हार्मोन है)।",
            "Gastric rennin (chymosin) cleaves the Phe105-Met106 peptide bond of kappa-casein, breaking steric stabilization of milk micelles and precipitating curds for slower enzymatic transit.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q5", "sci_9",
            "यकृत (Liver) द्वारा स्रावित 'पित्त रस' (Bile Juice) में कोई पाचक एंजाइम नहीं होता, फिर भी यह वसा के किस कार्य हेतु अनिवार्य है?",
            "Although hepatic Bile Juice contains no digestive enzymes, why is it indispensable for lipid digestion in the duodenum?",
            listOf("वसा का पायसीकरण (Emulsification of Fats by Bile Salts - सोडियम ग्लाइकोकोलेट व टॉरोकोलेट)", "प्रोटीन को तोड़ना", "स्टार्च को पचाना", "विटामिन सी बनाना"),
            listOf("Emulsification of Fats (Bile salts disperse large hydrophobic lipid globules into microscopic mixed micelles)", "Protein hydrolysis", "Starch digestion", "Vitamin C synthesis"),
            0,
            "पित्त रस पित्ताशय (Gallbladder) में जमा होता है। इसमें पित्त लवण (Bile Salts) होते हैं जो वसा की बड़ी-बड़ी बूंदों को तोड़कर छोटी-छोटी बूंदों में बदल देते हैं (पायसीकरण / Emulsification), जिससे लाइपेस एंजाइम वसा को आसानी से पचा सकता है।",
            "Amphipathic bile acid salts (cholate and chenodeoxycholate conjugates) lower interfacial surface tension of dietary triglycerides, forming emulsified lipid droplets with immense surface area for pancreatic lipase.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q6", "sci_9",
            "अग्न्याशय (Pancreas) द्वारा स्रावित 'पूर्ण पाचक रस' (Pancreatic Juice) में प्रोटीन, वसा और कार्बोहाइड्रेट को पचाने वाले कौन-से तीन प्रमुख एंजाइम होते हैं?",
            "The alkaline Pancreatic Juice (pH ~8.0-8.3) contains which powerful triad of digestive enzymes for digesting proteins, fats, and starches respectively?",
            listOf("ट्रिप्सिन, अग्न्याशयी लाइपेस (स्टीप्सिन) एवं एमाइलेज (Trypsin, Pancreatic Lipase / Steapsin, and Pancreatic Amylase)", "पेप्सिन, रेनिन और टायलिन", "सुकरेज, माल्टेज और लैक्टेज", "लाइसोजाइम, पेप्सिन और गैस्ट्रिन"),
            listOf("Trypsin (Endopeptidase), Pancreatic Lipase (Steapsin), and Pancreatic Alpha-Amylase (Amylopsin)", "Pepsin, Rennin, and Ptyalin", "Sucrase, Maltase, and Lactase", "Lysozyme, Pepsin, and Gastrin"),
            0,
            "अग्न्याशयी रस को 'पूर्ण पाचक रस' कहा जाता है क्योंकि इसमें कार्बोहाइड्रेट (अग्न्याशयी एमाइलेज), वसा (लाइपेस) और प्रोटीन (ट्रिप्सिन व काइमोट्रिप्सिन) तीनों को पचाने वाले एंजाइम होते हैं।",
            "Pancreatic acinar cells secrete zymogens (trypsinogen, chymotrypsinogen, procarboxypeptidase), active lipase-colipase, and alpha-amylase into the duodenum via the pancreatic duct.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q7", "sci_9",
            "छोटी आंत के ग्रहणी (Duodenum) भाग में अग्न्याशय के निष्क्रिय 'ट्रिप्सिनोजेन' को सक्रिय 'ट्रिप्सिन' (Trypsin) में कौन-सा आंत्रीय एंजाइम बदलता है?",
            "Which brush-border intestinal enterokinase enzyme localized on duodenal enterocytes activates inactive trypsinogen into active proteolytic Trypsin?",
            listOf("एंटरोकाइनेज / एंटरोपेप्टिडेस (Enterokinase / Enteropeptidase)", "पेप्सिन", "लाइपेस", "बाइल साल्ट"),
            listOf("Enterokinase / Enteropeptidase (Cleaves N-terminal hexapeptide from trypsinogen to trigger digestive cascade)", "Pepsin", "Lipase", "Bile salts"),
            0,
            "ग्रहणी की दीवार से स्रावित 'एंटरोकाइनेज' एंजाइम ट्रिप्सिनोजेन को सक्रिय 'ट्रिप्सिन' में बदल देता है। फिर सक्रिय ट्रिप्सिन अन्य सभी पाचक एंजाइमों (काइमोट्रिप्सिनोजेन, प्रोकार्बोक्सीपेप्टिडेस) को सक्रिय कर देता है।",
            "Enteropeptidase (enterokinase) anchored to the brush border of duodenal mucosal enterocytes catalyzes the specific activation cleavage of trypsinogen into trypsin.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m5_q8", "sci_9",
            "मानव पाचन तंत्र में भोजन के पचे हुए पोषक तत्वों (ग्लूकोज, अमीनो एसिड, फैटी एसिड) का सर्वाधिक अवशोषण (Maximum Absorption) किस अंग में होता है?",
            "In which anatomical section of the human alimentary canal does over 90% of all nutrient and fluid absorption take place?",
            listOf("छोटी आंत / क्षुद्रांत्र (Small Intestine - Jejunum and Ileum via Microvilli)", "बड़ी आंत (Large Intestine)", "आमाशय (Stomach)", "ग्रासनली (Esophagus)"),
            listOf("Small Intestine (Jejunum and Ileum - Providing ~250-300 m² absorptive surface area via villi and microvilli)", "Large Intestine (Absorbs only water & electrolytes)", "Stomach (Absorbs alcohol, water, aspirin)", "Esophagus"),
            0,
            "छोटी आंत (विशेषकर जेजुनम और इलियम) में उंगली जैसे लाखों उभार 'रसांकुर' (Villi) और 'सूक्ष्मांकुर' (Microvilli) होते हैं जो अवशोषण के पृष्ठीय क्षेत्रफल को 300 वर्ग मीटर (एक टेनिस कोर्ट जितना) बढ़ा देते हैं।",
            "The small intestine's plicae circulares, villi, and apical microvilli brush border create an immense absorptive surface equipped with active symporters and facilitative transporters.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q9", "sci_9",
            "वसा के पाचन के बाद बने फैटी एसिड और ग्लिसरॉल आंतों के रसांकुरों (Villi) की रक्त वाहिकाओं में सीधे न जाकर किन विशेष लसीका वाहिकाओं में अवशोषित होते हैं?",
            "Digested dietary lipids (resynthesized as chylomicrons in enterocytes) are absorbed directly into which specialized central lymphatic capillaries of intestinal villi?",
            listOf("लैक्टियल्स / लसीका वाहिकाएं (Lacteals / Central Lymphatic Capillaries)", "हेपेटिक पोर्टल वेन", "धमनियां", "केशिकाएं"),
            listOf("Lacteals (Central lymphatic vessels draining lipid-rich chyle into the thoracic lymph duct)", "Hepatic portal vein (Absorbs glucose & amino acids)", "Capillary arterioles", "Renal venules"),
            0,
            "पानी में घुलनशील पोषक तत्व (ग्लूकोज, अमीनो एसिड) रक्त केशिकाओं में जाकर यकृत (हेपेटिक पोर्टल शिरा) में जाते हैं। लेकिन वसा (काइलोमाइक्रोन) रसांकुर के केंद्र में स्थित 'लैक्टियल' (Lacteal) लसीका वाहिका में जाती है और थोरेसिक डक्ट द्वारा हृदय के पास रक्त में मिलती है।",
            "Chylomicrons are packaged by Golgi apparatus in enterocytes and exocytosed into the central lacteal vessel of each intestinal villus, bypassing immediate hepatic first-pass transit.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m5_q10", "sci_9",
            "बड़ी आंत (Large Intestine / बृहदांत्र / Colon) का मुख्य शारीरिक कार्य क्या है?",
            "What is the primary physiological digestive and absorptive function carried out by the human Large Intestine (Colon)?",
            listOf("अपचित भोजन से जल, लवण एवं इलेक्ट्रोलाइट्स का अवशोषण तथा मल का निर्माण (Absorption of Water, Electrolytes & Feces formation)", "प्रोटीन का पूर्ण पाचन", "वसा का पायसीकरण", "स्टार्च को ग्लूकोज में बदलना"),
            listOf("Reabsorption of water, sodium, and minerals from unabsorbed chime residues and compaction into solid feces", "Complete protein digestion", "Fat emulsification", "Starch hydrolysis"),
            0,
            "बड़ी आंत में कोई पाचक एंजाइम नहीं बनता। इसका मुख्य कार्य अपचित भोजन से 90% पानी और आवश्यक लवणों को वापस सोखना और मल (Feces) को मलाशय (Rectum) में एकत्र करना है। इसके सहजीवी बैक्टीरिया विटामिन K और B12 भी बनाते हैं।",
            "The colon extracts water (~1.5 L/day) and sodium via aldosterone-regulated ENaC epithelial channels, while resident gut microbiota ferment unabsorbed fibers into short-chain fatty acids (SCFAs).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q11", "sci_9",
            "मानव शरीर की सबसे बड़ी ग्रंथि (Largest Internal Gland / Organ) कौन-सी है जिसका वजन लगभग 1.5 किलोग्राम होता है?",
            "Which anatomical metabolic powerhouse is the largest internal solid organ and largest gland in the adult human body (weighing ~1.2 to 1.5 kg)?",
            listOf("यकृत / जिगर (Liver / Hepatic Organ)", "अग्न्याशय (Pancreas)", "थायरॉयड ग्रंथि", "पीयूष ग्रंथि"),
            listOf("Liver (Performs over 500 vital metabolic, detoxifying, storage, and secretory functions)", "Pancreas (Second largest gland - mixed gland)", "Thyroid gland", "Pituitary gland"),
            0,
            "यकृत (Liver) शरीर की सबसे बड़ी ग्रंथि है। यह पित्त रस बनाता है, यूरिया चक्र चलाता है, दवाओं और अमोनिया को डिटॉक्सिफाई करता है, ग्लाइकोजन और विटामिन A, D, B12 व आयरन को स्टोर करता है। इसमें पुनर्जनन (Regeneration) की अद्भुत क्षमता होती है।",
            "The human liver is the primary metabolic organ responsible for gluconeogenesis, lipogenesis, plasma protein synthesis (albumin, fibrinogen), xenobiotic cytochrome P450 detoxification, and bile excretion.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q12", "sci_9",
            "मानव पाचन नली में भोजन को नीचे की ओर धकेलने वाली आहार नली की मांसपेशियों की क्रमिक लयबद्ध संकुचन और फैलाव की गति क्या कहलाती है?",
            "The involuntary, wave-like coordinated contractions and relaxations of circular and longitudinal smooth muscles propagating food bolus along the GI tract are termed:",
            listOf("क्रमाकुंचन गति (Peristalsis / Peristaltic Waves)", "विसरण (Diffusion)", "परासरण (Osmosis)", "सक्शन"),
            listOf("Peristalsis (Myenteric Auerbach's plexus-mediated propulsive motor wave)", "Diffusion", "Osmosis", "Capillary suction"),
            0,
            "ग्रासनली (Esophagus) से लेकर मलाशय तक भोजन 'क्रमाकुंचन गति' (Peristalsis) द्वारा आगे बढ़ता है। यह स्वायत्त तंत्रिका तंत्र के 'मायंटेरिक प्लेक्सस' द्वारा नियंत्रित चिकनी पेशियों की स्वचालित तरंग गति है।",
            "Peristalsis is an intrinsic neuromuscular reflex where sensory enterochromaffin cells trigger proximal contraction (substance P/acetylcholine) and distal relaxation (nitric oxide/VIP) of intestinal smooth muscle.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q13", "sci_9",
            "आमाशय से निकलकर छोटी आंत में प्रवेश करने वाला अर्ध-पचा हुआ अम्लीय तरल भोजन क्या कहलाता है?",
            "The semi-fluid, highly acidic, creamy mass of partially digested food expelled periodically from the stomach through the pyloric sphincter into the duodenum is termed:",
            listOf("काइम (Chyme)", "बोलस (Bolus / ग्रास)", "काइल (Chyle)", "पित्त"),
            listOf("Chyme (Acidic gastric food pulp mixed with HCl, pepsin, and gastric secretions)", "Bolus (Masticated food bolus in mouth)", "Chyle (Alkaline fatty lymph fluid in lacteals)", "Bile"),
            0,
            "मुंह में चबाया हुआ लारयुक्त भोजन 'बोलस' (Bolus) कहलाता है; आमाशय में पचने के बाद यह अम्लीय पेस्ट 'काइम' (Chyme) कहलाता है; और छोटी आंत के बाद लैक्टियल्स में वसायुक्त सफेद तरल 'काइल' (Chyle) कहलाता है।",
            "Gastric churning converts solid ingested meals into acidic chyme; intermittent opening of the pyloric sphincter delivers controlled aliquots of chyme into the duodenal bulb.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q14", "sci_9",
            "शरीर में अत्यधिक जहरीली अमोनिया (Toxic Ammonia - NH3) को कम विषैले 'यूरिया' (Urea) में बदलने वाला 'ऑर्निथिन चक्र' (Ornithine Cycle / Urea Cycle) किस अंग में चलता है?",
            "In which vital organ does the Krebs-Henseleit Urea Cycle (Ornithine Cycle) take place to convert highly toxic metabolic ammonia into water-soluble non-toxic Urea?",
            listOf("यकृत (Liver / Hepatocytes)", "गुर्दे (Kidneys)", "हृदय", "प्लीहा"),
            listOf("Liver (Mitochondria and cytoplasm of hepatocytes)", "Kidneys (Excretes the synthesized urea)", "Heart", "Spleen"),
            0,
            "अमीनो एसिड के डी-अमीनेशन से बनने वाली अत्यधिक जहरीली अमोनिया को यकृत (Liver) की कोशिकाएं ऑर्निथिन चक्र द्वारा 'यूरिया' (NH2-CO-NH2) में बदल देती हैं। फिर यह यूरिया रक्त द्वारा गुर्दे में जाता है जहां से मूत्र द्वारा बाहर निकाल दिया जाता है।",
            "The Urea Cycle spans hepatic mitochondrial matrix (carbamoyl phosphate synthetase I, ornithine transcarbamylase) and cytosol (argininosuccinate synthetase, arginase) to detoxify ammonia.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m5_q15", "sci_9",
            "मानव दांतों का सबसे कठोर बाहरी आवरण 'इनेमल' (Tooth Enamel) मुख्य रूप से किस खनिज यौगिक से बना होता है जो पूरे शरीर का सबसे कठोरतम ऊतक है?",
            "Tooth Enamel (the hardest and most mineralized biological substance in the human body) is composed of 96% mineral matrix predominantly made of:",
            listOf("कैल्शियम हाइड्रॉक्सीएपेटाइट (Calcium Hydroxyapatite - Ca10(PO4)6(OH)2)", "कैल्शियम कार्बोनेट", "सोडियम क्लोराइड", "मैग्नीशियम सल्फेट"),
            listOf("Calcium Hydroxyapatite crystalline matrix (Acellular, non-regenerative enamel prisms secreted by ameloblasts)", "Calcium carbonate", "Sodium chloride", "Magnesium sulfate"),
            0,
            "इनेमल (Enamel) मानव शरीर का सबसे कठोर पदार्थ है। यह 'कैल्शियम हाइड्रॉक्सीएपेटाइट' का बना होता है। यह दांत के अंदरूनी 'डेंटिन' (Dentine) और 'पल्प' की सुरक्षा करता है। मुंह का pH 5.5 से नीचे गिरने पर इनेमल का क्षरण (Tooth Decay) शुरू हो जाता है।",
            "Enamel is formed by ameloblast cells during odontogenesis; its dense, hexagonal, highly carbonated calcium hydroxyapatite crystalline rods withstand immense masticatory shearing forces.",
            "Easy"
        )
    )
}
