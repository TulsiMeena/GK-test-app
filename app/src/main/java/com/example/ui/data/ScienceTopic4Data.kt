package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic4Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m1_q1", "sci_4",
            "आधुनिक आवर्त सारणी (Modern Periodic Table) का नियम 1913 में हेनरी मोजले ने दिया था। यह नियम क्या कहता है?",
            "Henry Moseley's Modern Periodic Law states that physical and chemical properties of elements are periodic functions of their:",
            listOf("परमाणु भार (Atomic Mass)", "परमाणु क्रमांक (Atomic Number - Z)", "परमाणु त्रिज्या", "संयोजकता"),
            listOf("Atomic Mass (Mendeleev's Law)", "Atomic Number (Nuclear charge Z)", "Atomic Radius", "Valency"),
            1,
            "मोजले के नियमानुसार तत्वों के भौतिक एवं रासायनिक गुण उनके परमाणु क्रमांक (नाभिक में उपस्थित प्रोटॉनों की संख्या Z) के आवर्ती फलन होते हैं। मेंडलीफ की मूल सारणी परमाणु भार पर आधारित थी।",
            "Moseley's Modern Periodic Law established that elemental properties recur periodically when arranged in ascending order of Atomic Number (Z), correcting Mendeleev's mass-based anomalies.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q2", "sci_4",
            "आधुनिक आवर्त सारणी में कुल कितने आवर्त (Periods) और कितने समूह/वर्ग (Groups) होते हैं?",
            "How many Periods (horizontal rows) and Groups (vertical columns) exist in the Long Form of the Periodic Table?",
            listOf("7 आवर्त और 8 समूह", "7 आवर्त और 18 समूह (7 Periods and 18 Groups)", "8 आवर्त और 18 समूह", "6 आवर्त और 16 समूह"),
            listOf("7 periods and 8 groups", "7 Periods and 18 Groups", "8 periods and 18 groups", "6 periods and 16 groups"),
            1,
            "आधुनिक आवर्त सारणी में 7 क्षैतिज पंक्तियां (आवर्त) और 18 ऊर्ध्वाधर स्तंभ (समूह या वर्ग) होते हैं, जिन्हें s, p, d, f चार ब्लॉकों में विभाजित किया गया है।",
            "The standard IUPAC periodic table is configured with 7 horizontal Periods and 18 vertical Groups across the s, p, d, and f orbital blocks.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q3", "sci_4",
            "शुद्ध जल का 25°C पर pH मान कितना होता है?",
            "What is the pH value of pure neutral water at 25°C (298 K)?",
            listOf("0", "7.0 (उदासीन)", "14", "1.0"),
            listOf("0", "7.0 (Neutral)", "14", "1.0"),
            1,
            "pH पैमाना 1909 में सोरेनसेन (Sørensen) द्वारा विकसित किया गया। 25°C पर शुद्ध जल में [H⁺] = [OH⁻] = 10⁻⁷ M होता है, अतः pH = -log[H⁺] = 7 (उदासीन) होता है।",
            "Devised by S. P. L. Sørensen, pH = -log₁₀[H⁺]. For pure neutral water at 25°C, autoionization gives [H⁺] = 10⁻⁷ mol/L, yielding pH = 7.0.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q4", "sci_4",
            "मानव रक्त (Human Blood) का सामान्य pH मान कितना होता है?",
            "What is the normal physiological pH range of healthy human blood?",
            listOf("6.0 से 6.5 (अम्लीय)", "7.35 से 7.45 (हल्का क्षारीय - Slightly Alkaline, ~7.4)", "8.5 से 9.0 (क्षारीय)", "5.0 से 5.5"),
            listOf("6.0 to 6.5", "7.35 to 7.45 (Slightly Alkaline / Basic, mean ~7.4)", "8.5 to 9.0", "5.0 to 5.5"),
            1,
            "मानव रक्त का pH 7.35 - 7.45 (औसत 7.4) के संकीर्ण दायरे में बाईकार्बोनेट बफर प्रणाली (H₂CO₃ / HCO₃⁻) द्वारा नियंत्रित रहता है। 7.0 से कम या 7.8 से अधिक pH जानलेवा होता है।",
            "Human arterial blood is tightly maintained between pH 7.35 and 7.45 by carbonic acid-bicarbonate buffer systems.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q5", "sci_4",
            "अम्लीय वर्षा (Acid Rain) का मुख्य कारण वायुमंडल में किन गैसों की उपस्थिति है?",
            "Acid Rain is primarily caused by atmospheric emissions of which two acidic gases dissolving in rainwater?",
            listOf("कार्बन मोनोऑक्साइड और मीथेन", "सल्फर डाइऑक्साइड (SO₂) और नाइट्रोजन ऑक्साइड (NO₂)", "ऑक्सीजन और हाइड्रोजन", "हीलियम और नियॉन"),
            listOf("Carbon monoxide and methane", "Sulfur Dioxide (SO₂) and Nitrogen Oxides (NO₂ forming H₂SO₄ and HNO₃)", "Oxygen and hydrogen", "Helium and neon"),
            1,
            "जीवाश्म ईंधन के दहन से निकलने वाली SO₂ और NO₂ वर्षा जल के साथ क्रिया करके सल्फ्यूरिक अम्ल (H₂SO₄) और नाइट्रिक अम्ल (HNO₃) बनाती हैं, जिससे वर्षा का pH 5.6 से कम हो जाता है।",
            "Combustion of sulfur-rich fossil fuels and vehicle exhausts releases SO₂ and NO_x, which oxidize in tropospheric moisture into sulfuric acid (H₂SO₄) and nitric acid (HNO₃).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q6", "sci_4",
            "लिटमस (Litmus Paper) प्राकृतिक सूचक किस पौधे से प्राप्त किया जाता है?",
            "The natural pH indicator 'Litmus' is extracted from which symbiotic organism?",
            listOf("शैवाल (Algae)", "लाइकेन / कवक-शैवाल सहजीवी (Lichen - Roccella tinctoria)", "फर्न (Fern)", "नीम"),
            listOf("Algae", "Lichen (Roccella tinctoria thallophytes)", "Fern", "Neem"),
            1,
            "लिटमस थैलौफाइटा समूह के 'लाइकेन' (Lichen) से निकाला जाने वाला बैंगनी रंग का रंजक है। यह अम्ल में लाल और क्षार में नीला रंग देता है।",
            "Litmus is a water-soluble dye mixture extracted from lichens (Roccella species). It turns red in acidic solutions (pH < 4.5) and blue under alkaline conditions (pH > 8.3).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q7", "sci_4",
            "बेकिंग सोडा (खाने का सोडा / Baking Soda) का रासायनिक नाम और सूत्र क्या है?",
            "What is the chemical name and molecular formula of Baking Soda?",
            listOf("सोडियम कार्बोनेट (Na₂CO₃·10H₂O)", "सोडियम हाइड्रोजन कार्बोनेट / सोडियम बाइकार्बोनेट (NaHCO₃)", "कैल्शियम कार्बोनेट (CaCO₃)", "सोडियम हाइड्रोक्साइड (NaOH)"),
            listOf("Sodium Carbonate", "Sodium Hydrogen Carbonate / Sodium Bicarbonate (NaHCO₃)", "Calcium Carbonate", "Sodium Hydroxide"),
            1,
            "बेकिंग सोडा सोडियम बाइकार्बोनेट (NaHCO₃) है। गर्म करने पर यह CO₂ गैस छोड़ता है जिससे केक/ब्रेड फूलकर स्पंजी हो जाते हैं। यह पेट की अम्लता (Antacid) दूर करने में भी प्रयुक्त होता है।",
            "Baking Soda is Sodium Bicarbonate (NaHCO₃). Thermal decomposition releases CO₂ gas (2 NaHCO₃ → Na₂CO₃ + H₂O + CO₂), creating leavening bubbles in dough.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q8", "sci_4",
            "धोने का सोडा (Washing Soda) का रासायनिक सूत्र क्या है?",
            "What is the chemical formula of Washing Soda (Sodium Carbonate Decahydrate)?",
            listOf("NaHCO₃", "Na₂CO₃·10H₂O (सोडियम कार्बोनेट डेकाहाइड्रेट)", "CaSO₄·2H₂O", "NaCl"),
            listOf("NaHCO₃", "Na₂CO₃·10H₂O (Sodium Carbonate Decahydrate)", "CaSO₄·2H₂O", "NaCl"),
            1,
            "धोने का सोडा Na₂CO₃·10H₂O (सोडियम कार्बोनेट डेकाहाइड्रेट) है जिसमें क्रिस्टलन जल के 10 अणु होते हैं। यह जल की स्थायी कठोरता दूर करने और कांच/साबुन उद्योग में प्रयुक्त होता है।",
            "Washing Soda is hydrated Sodium Carbonate (Na₂CO₃·10H₂O), containing 10 molecules of water of crystallization, used in softening hard water and detergent formulation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q9", "sci_4",
            "ब्लीचिंग पाउडर (विरंजक चूर्ण / Bleaching Powder) का रासायनिक सूत्र क्या है?",
            "What is the chemical formula and IUPAC name of Bleaching Powder?",
            listOf("CaO", "CaOCl₂ (कैल्शियम ऑक्सीक्लोराइड / Calcium Oxychloride)", "CaCl₂", "Ca(OH)₂"),
            listOf("CaO", "CaOCl₂ (Calcium Oxychloride / Calcium Hypochlorite)", "CaCl₂", "Ca(OH)₂"),
            1,
            "शुष्क बुझे हुए चूने [Ca(OH)₂] पर क्लोरीन गैस प्रवाहित करने पर ब्लीचिंग पाउडर (CaOCl₂) बनता है। इसका उपयोग पेयजल को कीटाणुरहित करने और वस्त्रों के विरंजन में होता है।",
            "Bleaching Powder (CaOCl₂) is synthesized by reacting chlorine gas with dry slaked lime: Ca(OH)₂ + Cl₂ → CaOCl₂ + H₂O. It acts as an industrial disinfectant and bleaching agent.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q10", "sci_4",
            "प्लास्टर ऑफ पेरिस (Plaster of Paris - POP) का रासायनिक सूत्र क्या है?",
            "What is the chemical formula of Plaster of Paris (Calcium Sulfate Hemihydrate)?",
            listOf("CaSO₄·2H₂O", "CaSO₄·½H₂O (या 2CaSO₄·H₂O - कैल्शियम सल्फेट हेमीहाइड्रेट)", "MgSO₄·7H₂O", "CaCO₃"),
            listOf("CaSO₄·2H₂O (Gypsum)", "CaSO₄·½H₂O or (CaSO₄)₂·H₂O (Calcium Sulfate Hemihydrate)", "MgSO₄·7H₂O", "CaCO₃"),
            1,
            "जिप्सम (CaSO₄·2H₂O) को 373 K (100°C) पर गर्म करने पर यह जल के 1½ अणु त्यागकर प्लास्टर ऑफ पेरिस (CaSO₄·½H₂O) बन जाता है। यह टूटी हड्डियों को जोड़ने और मूर्तियां बनाने में काम आता है।",
            "Heating gypsum (CaSO₄·2H₂O) to 100°C produces Plaster of Paris (CaSO₄·½H₂O). When mixed with water, it rehydrates and recrystallizes rapidly back into hard gypsum.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q11", "sci_4",
            "सिरका (Vinegar) में कौन-सा अम्ल पाया जाता है?",
            "Which carboxylic acid is present in domestic Vinegar (typically a 5-8% aqueous solution)?",
            listOf("सिट्रिक अम्ल", "एसिटिक अम्ल / एथेनॉइक अम्ल (Acetic Acid - CH₃COOH)", "टार्टरिक अम्ल", "ऑक्सालिक अम्ल"),
            listOf("Citric acid", "Acetic Acid / Ethanoic Acid (CH₃COOH, 5-8% solution)", "Tartaric acid", "Oxalic acid"),
            1,
            "सिरका एसिटिक अम्ल (CH₃COOH) का 5% से 8% जलीय घोल होता है। 100% शुद्ध निर्जल एसिटिक अम्ल 16.6°C पर जमकर बर्फ जैसा दिखता है जिसे 'ग्लेशियल एसिटिक अम्ल' कहते हैं।",
            "Vinegar is a 5-8% aqueous solution of Acetic Acid (Ethanoic Acid, CH₃COOH) produced by bacterial fermentation of ethanol.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q12", "sci_4",
            "नींबू और संतरे जैसे खट्टे फलों में मुख्य रूप से कौन-सा अम्ल पाया जाता है?",
            "Which organic tricarboxylic acid is naturally present in high concentrations in citrus fruits like Lemons, Oranges, and Limes?",
            listOf("सिट्रिक अम्ल (Citric Acid - C₆H₈O₇)", "लैक्टिक अम्ल", "मैलिक अम्ल", "फॉर्मिक अम्ल"),
            listOf("Citric Acid (C₆H₈O₇)", "Lactic acid", "Malic acid", "Formic acid"),
            0,
            "खट्टे फलों (सिट्रस फल) में सिट्रिक अम्ल और एस्कॉर्बिक अम्ल (विटामिन C) प्रचुर मात्रा में पाए जाते हैं।",
            "Citric Acid (2-hydroxypropane-1,2,3-tricarboxylic acid) is the predominant organic acid in citrus fruits, imparting their characteristic sour flavor.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q13", "sci_4",
            "चींटी के डंक (Ant Sting) और बिच्छू-बूटी (Nettle sting) में कौन-सा अम्ल होता है जिसके कारण जलन और दर्द होता है?",
            "The sharp stinging pain and inflammation from Red Ant bites and stinging nettle hair injection is caused by:",
            listOf("एसिटिक अम्ल", "फॉर्मिक अम्ल / मेथेनॉइक अम्ल (Formic Acid / Methanoic Acid - HCOOH)", "सिट्रिक अम्ल", "टार्टरिक अम्ल"),
            listOf("Acetic acid", "Formic Acid / Methanoic Acid (HCOOH)", "Citric acid", "Tartaric acid"),
            1,
            "चींटी के डंक में फॉर्मिक अम्ल (मेथेनॉइक अम्ल - HCOOH) होता है। इसके प्रभाव को बेकिंग सोडा (NaHCO₃) या कैलामाइन लोशन (ZnCO₃) लगाकर उदासीन किया जाता है।",
            "Red ants inject Formic Acid (Methanoic acid, HCOOH). The resulting burning sensation is neutralized by applying mild bases like baking soda or calamine lotion.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q14", "sci_4",
            "खट्टे दूध और दही (Curd / Yogurt) में कौन-सा अम्ल पाया जाता है?",
            "Which organic acid is formed during milk fermentation by Lactobacillus bacteria, curdling casein proteins?",
            listOf("सिट्रिक अम्ल", "लैक्टिक अम्ल (Lactic Acid - CH₃CH(OH)COOH)", "ब्यूटिरिक अम्ल", "ऑक्सालिक अम्ल"),
            listOf("Citric acid", "Lactic Acid (2-hydroxypropanoic acid)", "Butyric acid", "Oxalic acid"),
            1,
            "लैक्टोबैसिलस जीवाणु दूध में उपस्थित लैक्टोज शर्करा को लैक्टिक अम्ल में किण्वित कर देते हैं, जिससे दूध का pH गिर जाता है और कैसिइन प्रोटीन जमकर दही बन जाता है।",
            "Lactic acid is produced when Lactobacillus bacteria ferment lactose sugars in milk, causing casein coagulation into curd.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m1_q15", "sci_4",
            "इमली (Tamarind) और कच्चे अंगूर में कौन-सा प्राकृतिक अम्ल पाया जाता है?",
            "Which dicarboxylic hydroxy acid is found abundantly in Tamarind, Grapes, and Bananas?",
            listOf("सिट्रिक अम्ल", "टार्टरिक अम्ल (Tartaric Acid - C₄H₆O₆)", "एसिटिक अम्ल", "मैलिक अम्ल"),
            listOf("Citric acid", "Tartaric Acid (C₄H₆O₆)", "Acetic acid", "Malic acid"),
            1,
            "इमली, अंगूर और कच्चे आम में टार्टरिक अम्ल पाया जाता है। बेकिंग पाउडर बनाने में बेकिंग सोडा के साथ टार्टरिक अम्ल मिलाया जाता है ताकि कड़वाहट खत्म हो। सेब में मैलिक अम्ल होता है।",
            "Tartaric acid is the principal acid in tamarind pulp and grapes. Potassium hydrogen tartrate (Cream of Tartar) is blended with baking soda to make baking powder.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m2_q1", "sci_4",
            "सोना (Gold) और प्लेटिनम (Platinum) जैसी उत्कृष्ट धातुओं को घोलने के लिए किस अम्ल मिश्रण 'एक्वारेजिया' (Aqua Regia / अम्लराज) का उपयोग किया जाता है?",
            "Aqua Regia (Royal Water), capable of dissolving noble metals like Gold and Platinum, is a freshly prepared mixture of:",
            listOf("सांद्र HCl और सांद्र HNO₃ का 1:3 अनुपात", "सांद्र हाइड्रोक्लोरिक अम्ल (HCl) और सांद्र नाइट्रिक अम्ल (HNO₃) का 3:1 अनुपात", "सांद्र H₂SO₄ और सांद्र HNO₃ का 3:1 अनुपात", "HCl और H₂SO₄ का 1:1 अनुपात"),
            listOf("Concentrated HCl and concentrated HNO₃ in 1:3 ratio", "Concentrated Hydrochloric Acid (HCl) and Concentrated Nitric Acid (HNO₃) in 3:1 molar ratio", "H₂SO₄ and HNO₃ in 3:1 ratio", "HCl and H₂SO₄ in 1:1 ratio"),
            1,
            "एक्वारेजिया में 3 भाग सांद्र HCl और 1 भाग सांद्र HNO₃ होता है (3:1)। यह अत्यंत संक्षारक मिश्रण नवजात क्लोरीन (Nascent Chlorine) और नाइट्रोसिल क्लोराइड बनाता है जो सोने को [AuCl₄]⁻ में घोल देता है।",
            "Aqua Regia is a 3:1 volumetric mixture of concentrated HCl and concentrated HNO₃. It generates nascent chlorine and nitrosyl chloride (NOCl) to oxidize inert gold into soluble chlorauric acid.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q2", "sci_4",
            "ऑयल ऑफ विट्रियल (Oil of Vitriol / कसीस का तेल) और 'रसायनों का राजा' (King of Chemicals) किसे कहा जाता है?",
            "Which industrial inorganic chemical is historically termed 'Oil of Vitriol' and crowned the 'King of Chemicals'?",
            listOf("हाइड्रोक्लोरिक अम्ल (HCl)", "सल्फ्यूरिक अम्ल (Sulphuric Acid - H₂SO₄)", "नाइट्रिक अम्ल (HNO₃)", "एसिटिक अम्ल"),
            listOf("Hydrochloric acid", "Sulfuric Acid (H₂SO₄)", "Nitric acid", "Acetic acid"),
            1,
            "सल्फ्यूरिक अम्ल (H₂SO₄) को रसायनों का राजा कहा जाता है क्योंकि किसी देश के औद्योगिक विकास को उसके द्वारा उपभोग किए जाने वाले H₂SO₄ की मात्रा से आंका जाता है। यह उर्वरक, बैटरी, विस्फोटक आदि में आधारभूत है।",
            "Sulfuric acid (H₂SO₄) is termed the King of Chemicals due to its ubiquitous industrial use in fertilizer production, petroleum refining, chemical synthesis, and lead-acid batteries.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q3", "sci_4",
            "सीसा-अम्ल संचायक बैटरी (Lead-Acid Storage Battery), जो कारों और इन्वर्टर में प्रयुक्त होती है, में कौन-सा विद्युत अपघट्य (Electrolyte) अम्ल भरा जाता है?",
            "What electrolyte acid solution is used in automotive Lead-Acid storage batteries?",
            listOf("38% सांद्रता वाला सल्फ्यूरिक अम्ल (Dilute H₂SO₄ - Specific Gravity ~1.28)", "सांद्र हाइड्रोक्लोरिक अम्ल", "नाइट्रिक अम्ल", "फॉस्फोरिक अम्ल"),
            listOf("Dilute Sulfuric Acid (~38% H₂SO₄ aqueous solution with specific gravity ~1.28)", "Concentrated Hydrochloric acid", "Nitric acid", "Phosphoric acid"),
            0,
            "लेड-एसिड बैटरी में स्पंजी लेड (Anode: Pb), लेड डाइऑक्साइड (Cathode: PbO₂) और लगभग 38% सल्फ्यूरिक अम्ल (H₂SO₄) इलेक्ट्रोलाइट के रूप में उपयोग होता है। डिस्चार्ज पर दोनों इलेक्ट्रोड PbSO₄ बन जाते हैं।",
            "Lead-acid car batteries employ ~38% sulfuric acid (H₂SO₄, specific gravity 1.28) as the active ionizing electrolyte between porous lead sponge anodes and lead dioxide cathodes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q4", "sci_4",
            "सीएनजी (Compressed Natural Gas) और पीएनजी (Piped Natural Gas) का मुख्य रासायनिक घटक क्या है?",
            "What is the primary chemical hydrocarbon component of Compressed Natural Gas (CNG) and Piped Natural Gas (PNG)?",
            listOf("प्रोपेन (Propane)", "मीथेन (Methane - CH₄, 80-95%)", "ब्यूटेन (Butane)", "एथिलीन"),
            listOf("Propane", "Methane (CH₄, comprising 80-95% by volume)", "Butane", "Ethylene"),
            1,
            "प्राकृतिक गैस (CNG/PNG) का मुख्य घटक मीथेन (CH₄, 80-95%) है। यह स्वच्छ ईंधन है क्योंकि यह दहन पर न्यूनतम कार्बन मोनोऑक्साइड और कोई कालिख नहीं छोड़ता।",
            "CNG and domestic PNG consist predominantly of Methane (CH₄, 80-95% by volume), combusting with oxygen to produce clean carbon dioxide and water vapor.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q5", "sci_4",
            "घरेलू एलपीजी सिलेंडर (LPG - Liquefied Petroleum Gas) में मुख्य रूप से कौन-सी हाइड्रोकार्बन गैसों का मिश्रण द्रवीभूत रूप में भरा जाता है?",
            "Commercial liquefied petroleum gas (LPG) cooking cylinders primarily contain a pressurized mixture of which hydrocarbons?",
            listOf("मीथेन और एथेन", "प्रोपेन और ब्यूटेन (Propane C₃H₈ and Butane C₄H₁₀, predominantly Butane)", "एसिटिलीन और एथिलीन", "हाइड्रोजन और कार्बन मोनोऑक्साइड"),
            listOf("Methane and Ethane", "Propane (C₃H₈) and Butane (C₄H₁₀, predominantly Isobutane/n-Butane)", "Acetylene and Ethylene", "Hydrogen and CO"),
            1,
            "एलपीजी में मुख्य रूप से ब्यूटेन (C₄H₁₀) और प्रोपेन (C₃H₈) का द्रवीभूत मिश्रण होता है, जो कमरे के तापमान पर 6-8 बार दाब पर तरल अवस्था में सिलेंडर में रहता है।",
            "LPG is a pressurized liquefied blend of aliphatic hydrocarbons, primarily n-butane, isobutane, and propane, offering high calorific heating values (~50 MJ/kg).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q6", "sci_4",
            "एलपीजी गैस सिलेंडरों से रिसाव (Leakage) का तुरंत पता लगाने के लिए उसमें कौन-सा तीक्ष्ण गंधयुक्त यौगिक मिलाया जाता है?",
            "Which strong-smelling sulfur odorant compound is blended into odorless commercial LPG cylinders to alert users of hazardous gas leaks?",
            listOf("क्लोरोफॉर्म", "एथिल मरकैप्टन / एथेनथियोल (Ethyl Mercaptan - C₂H₅SH)", "अमोनिया", "सल्फर हेक्साफ्लोराइड"),
            listOf("Chloroform", "Ethyl Mercaptan / Ethanethiol (C₂H₅SH)", "Ammonia", "Sulfur hexafluoride"),
            1,
            "प्राकृतिक गैस और एलपीजी दोनों गंधहीन होती हैं। सुरक्षा के लिए इसमें अत्यंत तीखी सड़े हुए अंडे जैसी गंध वाला 'एथिल मरकैप्टन' (C₂H₅SH) मिलाया जाता है ताकि थोड़ा भी रिसाव होने पर तुरंत गंध आ जाए।",
            "Since pure propane and butane are odorless, Ethanethiol (Ethyl Mercaptan, C₂H₅SH) is added as a stinking organosulfur stenching agent to ensure immediate leak detection.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q7", "sci_4",
            "गोबर गैस (बायोगैस / Biogas) का मुख्य घटक क्या है जो अवायवीय जीवाणुओं द्वारा अपघटन से उत्पन्न होता है?",
            "What is the principal combustible constituent of Biogas (Gobar Gas) produced by anaerobic digestion of cattle dung and biomass?",
            listOf("कार्बन डाइऑक्साइड", "मीथेन (Methane - CH₄, लगभग 55-70%)", "हाइड्रोजन सल्फाइड", "नाइट्रोजन"),
            listOf("Carbon dioxide", "Methane (CH₄, approximately 55-70%)", "Hydrogen sulfide", "Nitrogen"),
            1,
            "बायोगैस में 55-70% मीथेन (CH₄), 30-40% कार्बन डाइऑक्साइड (CO₂), तथा अल्प मात्रा में H₂ और H₂S होती हैं। मेथनोजेन जीवाणु (Methanobacterium) गाय के गोबर को अवायवीय परिस्थितियों में अपघटित करते हैं।",
            "Biogas generated by anaerobic methanogenic archaebacteria consists of 55-70% Methane (CH₄) and 30-40% CO₂, providing renewable rural cooking fuel.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q8", "sci_4",
            "कोयला खदानों में विस्फोट (Firedamp explosion) का मुख्य कारण कौन-सी ज्वलनशील गैस है जो हवा के साथ मिलने पर आग पकड़ लेती है?",
            "Explosive 'Firedamp' blasts in underground coal mines are caused by the accumulation of which flammable hydrocarbon gas?",
            listOf("कार्बन मोनोऑक्साइड", "मीथेन (Methane - Marsh Gas / CH₄)", "सल्फर डाइऑक्साइड", "नाइट्रोजन डाइऑक्साइड"),
            listOf("Carbon monoxide", "Methane (Marsh Gas / Coalbed Methane - CH₄)", "Sulfur dioxide", "Nitrogen dioxide"),
            1,
            "मीथेन को 'मार्श गैस' या खदानों में 'फायरडैम्प' कहते हैं। कोयले की परतों से निकलने वाली मीथेन हवा में 5-15% सांद्रता होने पर एक छोटी सी चिंगारी से भयानक विस्फोट कर देती है।",
            "Coal seams naturally release trapped Methane (CH₄ / Firedamp). When mixed with air in concentrations of 5-15%, it detonates upon ignition, historically prevented by Davy's Safety Lamp.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q9", "sci_4",
            "हवाई जहाज के टायरों में और चिप्स के पैकेटों में खाद्य सामग्री को ऑक्सीकरण (खराब/Rancid) से बचाने के लिए किस अक्रिय गैस को भरा जाता है?",
            "Which inert, non-reactive diatomic gas is flushed into snack food packets to prevent lipid oxidation and pumped into aircraft tires?",
            listOf("ऑक्सीजन", "नाइट्रोजन (Nitrogen - N₂)", "क्लोरीन", "सल्फर डाइऑक्साइड"),
            listOf("Oxygen", "Nitrogen Gas (N₂)", "Chlorine", "Sulfur dioxide"),
            1,
            "नाइट्रोजन अणु में त्रि-बंध (N≡N) होने से यह कमरे के ताप पर अत्यधिक अक्रिय होती है। यह चिप्स के तेल और वसा को ऑक्सीजन के संपर्क में आकर विकृतगंधिता (Rancidity) होने से बचाती है।",
            "Nitrogen (N₂) is chemically inert due to its high bond dissociation energy (N≡N triple bond). Flushing potato chip packaging with N₂ displaces oxygen, preventing rancidity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q10", "sci_4",
            "गहरे समुद्र में गोताखोर (Deep-sea Divers) श्वसन के लिए ऑक्सीजन के साथ किस उत्कृष्ट अक्रिय गैस का मिश्रण सिलेंडरों में ले जाते हैं?",
            "Deep-sea scuba divers breathe a specialized compressed gas mixture of Oxygen diluted with which noble gas to avoid nitrogen narcosis and the bends?",
            listOf("आर्गन", "हीलियम (Helium - Heliox mixture: ~80% He, 20% O₂)", "नियॉन", "रेडॉन"),
            listOf("Argon", "Helium (Heliox mixture: He + O₂)", "Neon", "Radon"),
            1,
            "उच्च दाब पर रक्त में नाइट्रोजन घुल जाती है और सतह पर आने पर बुलबुले (Bends रोग) बनाती है। हीलियम रक्त में अत्यंत कम घुलनशील और हल्की होती है, जिससे डीकंप्रेशन सिकनेस नहीं होती।",
            "Helium is substituted for nitrogen in 'Heliox' deep diving gas mixtures because of its remarkably low lipid solubility and rapid diffusion rate, preventing decompression sickness ('the bends').",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q11", "sci_4",
            "बिजली के साधारण बल्बों में टंगस्टन फिलामेंट के वाष्पीकरण को रोकने और जीवनकाल बढ़ाने के लिए कौन-सी अक्रिय गैस भरी जाती है?",
            "Which chemically inert noble gas (often blended with a small amount of nitrogen) is filled inside incandescent light bulbs?",
            listOf("हीलियम", "आर्गन (Argon - Ar)", "रेडॉन", "क्लोरीन"),
            listOf("Helium", "Argon (Ar, ~93% Ar + 7% N₂)", "Radon", "Chlorine"),
            1,
            "आर्गन वायुमंडल में तीसरी सबसे प्रचुर गैस (~0.93%) है। यह अक्रिय होने के कारण उच्च ताप पर टंगस्टन फिलामेंट से रासायनिक क्रिया नहीं करती और फिलामेंट के वाष्पीकरण को दबा देती है।",
            "Argon (Ar) provides an inert non-reactive envelope around the white-hot tungsten filament, suppressing tungsten evaporation and preventing filament oxidation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q12", "sci_4",
            "विज्ञापन पट्टियों (Advertising Glow Signs) और रंगीन प्रकाश नलियों में किस उत्कृष्ट गैस का उपयोग किया जाता है जो लाल-नारंगी चमक देती है?",
            "Which noble gas is used in high-voltage illuminated advertising discharge tubes, glowing with a brilliant crimson-orange color?",
            listOf("हीलियम", "नियॉन (Neon - Ne)", "आर्गन", "क्रिप्टन"),
            listOf("Helium", "Neon (Ne)", "Argon", "Krypton"),
            1,
            "नियॉन गैस से भरी विसर्जन नलियों में उच्च वोल्टेज पर विद्युत विसर्जन कराने पर विशिष्ट चमकदार लाल-नारंगी प्रकाश निकलता है, जिसका उपयोग विज्ञापन बोर्डों (Neon signs) में होता है।",
            "Neon discharge tubes emit an intense reddish-orange glow under electric discharge, widely deployed in night advertising signs and runway beacon lights.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q13", "sci_4",
            "वायुमंडल में कौन-सी अक्रिय (उत्कृष्ट) गैस बिल्कुल नहीं पाई जाती और यह रेडियोधर्मी होती है?",
            "Which radioactive noble gas is completely absent from the Earth's normal atmosphere and emanates from the radioactive decay of radium in rock soil?",
            listOf("हीलियम", "रेडॉन (Radon - Rn, Atomic Number 86)", "जीनॉन", "क्रिप्टन"),
            listOf("Helium", "Radon (Rn, Z = 86)", "Xenon", "Krypton"),
            1,
            "रेडॉन (Rn) रेडियोधर्मी उत्कृष्ट गैस है जो रेडियम के अल्फा-क्षय से बनती है। यह वायुमंडल में प्राकृतिक रूप से नहीं पाई जाती। भूकंप से पहले चट्टानों से इसकी सांद्रता बढ़ जाती है।",
            "Radon (Rn) is a radioactive noble gas formed in the decay chain of uranium and radium. It is absent in the ambient open atmosphere and poses an indoor basement inhalation hazard.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m2_q14", "sci_4",
            "गैसों में सबसे भारी गैस और 'स्ट्रेंजर गैस' (Stranger Gas) के नाम से किस उत्कृष्ट गैस को जाना जाता है जो यौगिक (जैसे XeF₄, XeO₃) बनाती है?",
            "Which noble gas is uniquely nicknamed the 'Stranger Gas' and was the first noble gas synthesized into chemical compounds (by Neil Bartlett in 1962)?",
            listOf("हीलियम", "जीनॉन (Xenon - Xe, Z=54)", "आर्गन", "नियॉन"),
            listOf("Helium", "Xenon (Xe, Stranger Gas)", "Argon", "Neon"),
            1,
            "जीनॉन (ग्रीक शब्द 'Xenos' का अर्थ अजनबी/Stranger) की आयनन एन्थैल्पी कम होने के कारण यह फ्लोरीन और ऑक्सीजन के साथ रासायनिक यौगिक (XePtF₆, XeF₂) बना सकती है।",
            "Xenon (Xe) was nicknamed the 'Stranger Gas' from Greek xenos. Neil Bartlett prepared the first noble gas compound (XePtF₆) in 1962 using xenon.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_4_m2_q15", "sci_4",
            "मौसम की भविष्यवाणी के लिए गुब्बारों में हाइड्रोजन के स्थान पर हीलियम गैस क्यों भरी जाती है, यद्यपि हाइड्रोजन अधिक हल्की है?",
            "Why is Helium gas preferred over lighter Hydrogen for inflating meteorological weather balloons and airships?",
            listOf("हीलियम भारी है", "हीलियम अज्वलनशील और गैर-विस्फोटक (Non-flammable & Safe) होती है", "हीलियम सस्ती है", "हीलियम रंगीन है"),
            listOf("Helium is heavy", "Helium is non-combustible and completely non-flammable/non-explosive", "Helium is cheaper", "Helium is colorful"),
            1,
            "हाइड्रोजन हवा में ऑक्सीजन के साथ मिलकर अत्यधिक विस्फोटक मिश्रण बनाती है (जैसे हिंडनबर्ग दुर्घटना)। हीलियम अक्रिय और अज्वलनशील गैस है, जिससे गुब्बारे में आग लगने का कोई खतरा नहीं होता।",
            "Although Hydrogen has higher buoyant lift, it forms explosive mixtures with air. Helium is non-flammable and inert, making it completely safe for aviation balloons.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 3 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m3_q1", "sci_4",
            "धातुओं की सक्रियता श्रेणी (Reactivity Series) में सबसे अधिक क्रियाशील और सबसे कम क्रियाशील धातु क्रमशः कौन-सी हैं?",
            "In the electrochemical Reactivity Series of metals, which are the Most Reactive and Least Reactive metals respectively?",
            listOf("सर्वाधिक: लोहा, न्यूनतम: तांबा", "सर्वाधिक: पोटेशियम (K) / सीजियम, न्यूनतम: सोना (Gold - Au) / प्लेटिनम", "सर्वाधिक: एल्युमीनियम, न्यूनतम: चांदी", "सर्वाधिक: जस्ता, न्यूनतम: सीसा"),
            listOf("Most: Iron, Least: Copper", "Most Reactive: Potassium (K) / Caesium; Least Reactive: Gold (Au) / Platinum", "Most: Aluminium, Least: Silver", "Most: Zinc, Least: Lead"),
            1,
            "पोटेशियम (K) और सोडियम (Na) इतने क्रियाशील हैं कि ठंडे पानी से भी तेजी से क्रिया कर H₂ गैस छोड़ते हैं और आग पकड़ लेते हैं। सोना (Au) और प्लेटिनम (Pt) सबसे अक्रिय (Noble) धातुएं हैं।",
            "Potassium (K) and Caesium sit at the top of the galvanic reactivity series, violently reacting with water. Gold (Au) and Platinum (Pt) are inert noble metals at the bottom.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q2", "sci_4",
            "सोडियम (Na) और पोटेशियम (K) धातुओं को खुली हवा में रखने पर आग पकड़ने से बचाने के लिए किस द्रव में डुबोकर रखा जाता है?",
            "Alkali metals Sodium and Potassium are stored submerged in which liquid to prevent spontaneous reaction with atmospheric oxygen and moisture?",
            listOf("जल में", "मिट्टी के तेल / केरोसिन (Kerosene Oil)", "अल्कोहल में", "सिरके में"),
            listOf("In water", "Kerosene Oil (Paraffin liquid)", "In alcohol", "In vinegar"),
            1,
            "सोडियम और पोटेशियम हवा की ऑक्सीजन और नमी (H₂O) से अत्यंत तीव्र ऊष्माक्षेपी अभिक्रिया कर जल उठते हैं। केरोसिन हाइड्रोकार्बन होने के कारण इनसे कोई क्रिया नहीं करता। (सफेद फास्फोरस को जल में रखा जाता है)।",
            "Sodium reacts vigorously with air and water (2Na + 2H₂O → 2NaOH + H₂). It is stored under anhydrous kerosene oil. (White phosphorus is kept underwater).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q3", "sci_4",
            "सफेद फास्फोरस (White Phosphorus - P₄) को खुली हवा में स्वतः दहन (Spontaneous Combustion) से बचाने के लिए किसमें डुबोकर रखा जाता है?",
            "White Phosphorus (P₄) has an ignition temperature of only ~30°C. To prevent spontaneous combustion in air, it is safely stored in:",
            listOf("केरोसिन में", "जल / पानी में (Water)", "अल्कोहल में", "ईथर में"),
            listOf("In kerosene", "Water (H₂O)", "Alcohol", "Ether"),
            1,
            "सफेद फास्फोरस का प्रज्वलन ताप केवल 30°C होता है और यह हवा में पीली-हरी चमक (स्फुरदीप्ति - Chemiluminescence) के साथ स्वतः जलकर P₄O₁₀ का विषैला धुआं देता है। यह जल में अघुलनशील होने से जल में सुरक्षित रहता है।",
            "White phosphorus ignites spontaneously in air at room temperature. Because it is insoluble in water and denser than water, it is stored submerged in water.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q4", "sci_4",
            "कमरे के तापमान (25°C) पर द्रव अवस्था में रहने वाली एकमात्र धातु (Liquid Metal) और एकमात्र अधातु (Liquid Non-Metal) क्रमशः कौन-सी हैं?",
            "Which are the ONLY Metal and ONLY Non-Metal that exist in the Liquid State at standard room temperature (25°C)?",
            listOf("धातु: सीसा, अधातु: क्लोरीन", "धातु: पारा / मरकरी (Mercury - Hg), अधातु: ब्रोमीन (Bromine - Br₂)", "धातु: गैलियम, अधातु: आयोडीन", "धातु: तांबा, अधातु: सल्फर"),
            listOf("Metal: Lead, Non-metal: Chlorine", "Metal: Mercury (Hg, Quick Silver); Non-Metal: Bromine (Br₂, reddish-brown liquid)", "Metal: Gallium, Non-metal: Iodine", "Metal: Copper, Non-metal: Sulfur"),
            1,
            "पारा (Hg) एकमात्र ऐसी धातु है जो कमरे के ताप पर द्रव होती है (गलनांक -38.8°C)। ब्रोमीन (Br₂) एकमात्र अधातु है जो कमरे के ताप पर लाल-भूरे रंग का वाष्पशील द्रव होती है (गलनांक -7.2°C)।",
            "Mercury (Hg) is the sole elemental metal that is liquid at standard conditions (mp -38.8°C). Bromine (Br₂) is the only elemental non-metal that is liquid (mp -7.2°C).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q5", "sci_4",
            "कौन-सी दो धातुएं हथेली पर रखते ही शरीर की गर्मी (~37°C) से पिघलने लगती हैं?",
            "Which two metals possess melting points just slightly above room temperature and melt in the palm of your hand?",
            listOf("सोना और चांदी", "गैलियम (Gallium - mp ~29.76°C) और सीजियम (Caesium - mp ~28.4°C)", "लोहा और तांबा", "सीसा और टिन"),
            listOf("Gold and silver", "Gallium (mp 29.8°C) and Caesium (mp 28.4°C)", "Iron and copper", "Lead and tin"),
            1,
            "गैलियम (Ga, गलनांक 29.8°C) और सीजियम (Cs, गलनांक 28.4°C) का गलनांक मानव शरीर के तापमान (37°C) से कम होता है, अतः हथेली पर रखते ही ये तुरंत पिघलकर तरल बन जाती हैं।",
            "Gallium (mp 29.76°C) and Caesium (mp 28.44°C) have unusually low melting points and liquefy directly from body heat when placed in the hand.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q6", "sci_4",
            "विद्युत और ऊष्मा का सर्वश्रेष्ठ चालक (Best Electrical & Thermal Conductor) कौन-सी धातु है?",
            "Which metal possesses the Highest Electrical and Thermal Conductivity among all elements?",
            listOf("तांबा (Copper)", "चांदी / सिल्वर (Silver - Ag)", "सोना (Gold)", "एल्युमीनियम (Aluminium)"),
            listOf("Copper", "Silver (Argentum - Ag: conductivity 6.3 × 10⁷ S/m)", "Gold", "Aluminium"),
            1,
            "चांदी (Ag) में सर्वाधिक मुक्त इलेक्ट्रॉन घनत्व होने के कारण यह विद्युत और ऊष्मा की सर्वोत्तम चालक है। इसके बाद तांबा (Cu), फिर सोना (Au), और फिर एल्युमीनियम (Al) का स्थान आता है।",
            "Silver (Ag) exhibits the highest electrical conductivity and thermal conductivity of any known element, followed in descending order by copper, gold, and aluminium.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q7", "sci_4",
            "सर्वाधिक आघातवर्ध्य (Most Malleable) और सर्वाधिक तन्य (Most Ductile) धातु कौन-सी है जिसके केवल 1 ग्राम से 2 किलोमीटर लंबा तार खींचा जा सकता है?",
            "Which is the Most Malleable and Ductile metal on Earth, capable of being beaten into foils 0.0001 mm thin or drawn into a 2 km wire from just 1 gram?",
            listOf("चांदी", "सोना (Gold - Aurum / Au)", "प्लेटिनम", "तांबा"),
            listOf("Silver", "Gold (Au)", "Platinum", "Copper"),
            1,
            "सोना (Gold) धातुओं में सबसे अधिक आघातवर्ध्य (Malleable) और तन्य (Ductile) है। इसके सोने के पतले वर्क (Gold leaf) 400 परमाणु जितने पतले बनाए जा सकते हैं।",
            "Gold (Au) is the most ductile and malleable metal. A single gram can be drawn into a microscopic continuous wire over 2,000 meters long or beaten into translucent leaves.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q8", "sci_4",
            "लोहे पर जंग लगना (Rusting of Iron) किस प्रकार का परिवर्तन है और जंग का रासायनिक सूत्र क्या है?",
            "Rusting of Iron is a slow electrochemical oxidation reaction forming hydrated iron(III) oxide represented as:",
            listOf("भौतिक परिवर्तन, FeO", "रासायनिक परिवर्तन, हाइड्रेटेड फेरिक ऑक्साइड (Fe₂O₃·xH₂O)", "उत्क्रमणीय परिवर्तन, FeCl₃", "जैविक परिवर्तन, FeSO₄"),
            listOf("Physical change, FeO", "Chemical Change forming Hydrated Ferric Oxide (Fe₂O₃·xH₂O)", "Reversible change, FeCl₃", "Biological change, FeSO₄"),
            1,
            "जंग लगना रासायनिक और अनुत्क्रमणीय परिवर्तन है जो ऑक्सीजन और नमी (जल) दोनों की अनिवार्य उपस्थिति में होता है। 4Fe + 3O₂ + 2xH₂O → 2Fe₂O₃·xH₂O।",
            "Corrosion of iron is an irreversible redox process requiring both Oxygen and Moisture simultaneously, creating reddish-brown flakey Fe₂O₃·xH₂O.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q9", "sci_4",
            "लोहे पर जंग लगने से लोहे के कुल भार (Weight of Iron) पर क्या प्रभाव पड़ता है?",
            "What happens to the total Weight of an iron nail or girder when it undergoes Rusting?",
            listOf("लोहे का भार घट जाता है", "लोहे का भार बढ़ जाता है (Weight increases)", "भार अपरिवर्तित रहता है", "भार शून्य हो जाता है"),
            listOf("Weight decreases", "Total weight increases (due to chemical bonding with Oxygen and Water molecules)", "Weight remains unchanged", "Weight becomes zero"),
            1,
            "जंग लगने पर लोहे के परमाणुओं के साथ वायुमंडल की ऑक्सीजन और जल के अणु रासायनिक रूप से जुड़ जाते हैं (Fe₂O₃·xH₂O), जिससे जंग लगी वस्तु का कुल भार मूल लोहे से अधिक हो जाता है।",
            "When iron oxidizes, oxygen and hydrogen atoms chemically bond to the iron lattice to form hydrated ferric oxide, increasing the mass of the rusted object.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q10", "sci_4",
            "लोहे को जंग से बचाने के लिए उस पर जस्ते (Zinc) की पतली परत चढ़ाने की प्रक्रिया को क्या कहते हैं?",
            "The industrial anti-corrosion process of coating iron or steel sheets with a thin protective layer of molten Zinc is termed:",
            listOf("विद्युत अपघटन", "यशदलेपन / गैल्वनीकरण (Galvanization / Galvanizing)", "मिश्रधातुकरण", "वल्कनीकरण"),
            listOf("Electrolysis", "Galvanization / Galvanizing (Zinc sacrificial coating)", "Alloying", "Vulcanization"),
            1,
            "गैल्वनीकरण में लोहे को पिघले हुए जिंक (जस्ते) में डुबोया जाता है। जिंक लोहे से अधिक सक्रिय होने के कारण स्वयं बलिदानी एनोड (Sacrificial anode) बनकर लोहे की रक्षा करता है, भले ही परत पर खरोंच आ जाए।",
            "Galvanization coats steel with sacrificial zinc. Zinc oxidizes preferentially to form a barrier layer of zinc carbonate, protecting underlying iron electrochemically.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q11", "sci_4",
            "पीतल (Brass) किन धातुओं की मिश्रधातु (Alloy) है?",
            "Brass is an alloy composed primarily of which two metals?",
            listOf("तांबा और टिन (Cu + Sn)", "तांबा और जस्ता / जिंक (Copper ~70% + Zinc ~30% - Cu + Zn)", "तांबा और निकेल", "सीसा और टिन"),
            listOf("Copper and Tin (Bronze)", "Copper (~70%) and Zinc (~30%) (Cu + Zn)", "Copper and Nickel", "Lead and Tin (Solder)"),
            1,
            "पीतल (Brass) = तांबा (Cu ~70%) + जस्ता (Zn ~30%)। कांसा (Bronze) = तांबा (Cu ~88-90%) + टिन (Sn ~10-12%)। जर्मन सिल्वर = तांबा + जस्ता + निकेल (इसमें चांदी 0% होती है)।",
            "Brass is a substitutional alloy of Copper (60-70%) and Zinc (30-40%). Bronze consists of Copper and Tin.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q12", "sci_4",
            "कांसा (Bronze) किन धातुओं की मिश्रधातु है?",
            "Bronze, historic metal of the Bronze Age, is an alloy of:",
            listOf("तांबा और जस्ता (Cu + Zn)", "तांबा और टिन (Copper ~88% + Tin ~12% - Cu + Sn)", "लोहा और कार्बन", "एल्युमीनियम और मैग्नीशियम"),
            listOf("Copper and Zinc (Brass)", "Copper (~88%) and Tin (~12%) (Cu + Sn)", "Iron and Carbon", "Aluminium and Magnesium"),
            1,
            "कांसा (Bronze) तांबे (Cu ~88%) और टिन (Sn ~12%) की मिश्रधातु है। यह मूर्तियों, सिक्कों, पदकों और घंटी (Bell metal) निर्माण में उपयोग होता है।",
            "Bronze is primarily composed of Copper alloyed with Tin (~12%), conferring high corrosion resistance and low metal-on-metal friction.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q13", "sci_4",
            "जर्मन सिल्वर (German Silver / Nickel Silver) मिश्रधातु में चांदी (Silver) का प्रतिशत कितना होता है?",
            "What is the actual percentage of Silver (Ag) present in the alloy known as 'German Silver'?",
            listOf("50%", "0% (शून्य प्रतिशत - तांबा 50%, जस्ता 30%, निकेल 20%)", "25%", "10%"),
            listOf("50%", "0% (Zero Percent - Cu 50%, Zn 30%, Ni 20%)", "25%", "10%"),
            1,
            "जर्मन सिल्वर में चांदी बिल्कुल नहीं (0%) होती। यह तांबा (50%), जस्ता (30%) और निकेल (20%) की मिश्रधातु है, जो देखने में चांदी जैसी चमकदार दिखती है।",
            "German Silver contains 0% silver. It is an alloy of Copper (50%), Zinc (30%), and Nickel (20%), prized for its silvery luster and silverware imitation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q14", "sci_4",
            "स्टेनलेस स्टील (Stainless Steel) में लोहे के साथ किन तत्वों को मिलाकर इसे जंग-रोधी और कठोर बनाया जाता है?",
            "Stainless Steel is manufactured by alloying iron with carbon and which two corrosion-resistant transition metals?",
            listOf("तांबा और एल्युमीनियम", "क्रोमियम (~18%) और निकेल (~8%) (Iron + Chromium + Nickel + Carbon)", "सीसा और टिन", "जिंक और मैग्नीशियम"),
            listOf("Copper and Aluminium", "Chromium (~18%) and Nickel (~8%) with Carbon (~0.1-1%)", "Lead and Tin", "Zinc and Magnesium"),
            1,
            "स्टेनलेस स्टील में लोहा (~73%), क्रोमियम (~18%), निकेल (~8%) और कार्बन (~0.1-1%) होते हैं। क्रोमियम सतह पर Cr₂O₃ की एक अदृश्य, स्व-मरम्मत करने वाली निष्क्रिय ऑक्साइड परत बनाता है जो जंग नहीं लगने देती।",
            "Stainless Steel contains at least 10.5-18% Chromium and 8% Nickel. Chromium forms an imperceptible passive layer of chromium oxide that self-heals in air, preventing rust.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m3_q15", "sci_4",
            "अमलगम (Amalgam) किसी भी धातु का किसके साथ बना हुआ मिश्रधातु घोल होता है?",
            "An Amalgam is a specialized alloy solution formed by mixing any metal with:",
            listOf("सोना", "पारा / मरकरी (Mercury - Hg)", "सीसा", "चांदी"),
            listOf("Gold", "Mercury (Hg)", "Lead", "Silver"),
            1,
            "पारे (Hg) के साथ बनी किसी भी धातु की मिश्रधातु को अमलगम कहते हैं (जैसे दांत भरने वाला डेंटल अमलगम = Ag-Sn-Hg)। लोहा (Fe), प्लैटिनम (Pt) और टंगस्टन (W) पारे के साथ अमलगम नहीं बनाते, इसलिए पारे को लोहे के बर्तनों में रखा जाता है।",
            "An Amalgam is an alloy of Mercury with another metal. Iron, platinum, and tungsten do not form amalgams and are used as storage containers for mercury.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 4 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_4_m4_q1", "sci_4",
            "जल की स्थायी कठोरता (Permanent Hardness of Water) किन लवणों के घुले होने के कारण होती है?",
            "Permanent Hardness of water, which cannot be removed by simple boiling, is caused by dissolved:",
            listOf("कैल्शियम और मैग्नीशियम के बाइकार्बोनेट", "कैल्शियम और मैग्नीशियम के क्लोराइड और सल्फेट (CaCl₂, MgCl₂, CaSO₄, MgSO₄)", "सोडियम और पोटेशियम के कार्बोनेट", "लोहे के ऑक्साइड"),
            listOf("Calcium and magnesium bicarbonates (Temporary hardness)", "Chlorides and Sulfates of Calcium and Magnesium (CaCl₂, MgCl₂, CaSO₄, MgSO₄)", "Sodium and potassium carbonates", "Iron oxides"),
            1,
            "अस्थायी कठोरता Ca और Mg के बाइकार्बोनेटों के कारण होती है जिसे उबालकर हटाया जा सकता है। स्थायी कठोरता Ca और Mg के सल्फेटों व क्लोराइडों के कारण होती है जिसे वाशिंग सोडा या आयन-विनिमय विधि (ज़ियोलाइट) से हटाया जाता है।",
            "Temporary hardness is caused by dissolved bicarbonates Ca(HCO₃)₂. Permanent hardness is caused by CaSO₄, MgSO₄, CaCl₂, and MgCl₂, removed by Zeolite Permutit or soda ash processes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q2", "sci_4",
            "भारी जल (Heavy Water - D₂O) का अणुभार कितना होता है?",
            "What is the Molecular Mass of Heavy Water (Deuterium Oxide - D₂O) compared to normal water (H₂O = 18)?",
            listOf("18 amu", "20 amu (D₂O: 2×2 + 16 = 20)", "22 amu", "16 amu"),
            listOf("18 amu", "20 amu (Deuterium mass 2: 2×2 + 16 = 20 g/mol)", "22 amu", "16 amu"),
            1,
            "ड्यूटेरियम (₁H² या D) हाइड्रोजन का समस्थानिक है जिसका परमाणु भार 2 होता है। D₂O का अणुभार = (2 × 2) + 16 = 20 g/mol होता है। इसकी खोज 1932 में हेरोल्ड यूरे ने की थी।",
            "Heavy water is Deuterium Oxide (²H₂O / D₂O). With deuterium weighing 2.014 amu, D₂O molecular mass is ~20.03 g/mol.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q3", "sci_4",
            "जल का घनत्व (Density of Water) किस तापमान पर अधिकतम (Maximum at 1.0 g/cm³) और आयतन न्यूनतम होता है?",
            "At what temperature does liquid water attain its Maximum Density (1.000 g/cm³) and minimum volume due to anomalous thermal expansion?",
            listOf("0 °C", "4 °C (या 277 K / 39.2 °F)", "100 °C", "-4 °C"),
            listOf("0 °C", "4 °C (277.15 K / 39.2 °F)", "100 °C", "-4 °C"),
            1,
            "जल के असामान्य प्रसार (Anomalous expansion) के कारण 0°C से 4°C तक गर्म करने पर जल सिकुड़ता है और इसका घनत्व 4°C पर अधिकतम (1000 kg/m³) होता है। इसी कारण सर्दियों में झीलों के ऊपर बर्फ जमने पर भी नीचे 4°C पर जलीय जीव जीवित रहते हैं।",
            "Due to open hydrogen-bonded cage structures collapsing, water reaches peak density at 3.98°C (4°C), allowing aquatic ecosystems to survive beneath frozen lake ice.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q4", "sci_4",
            "शुष्क बर्फ (Dry Ice) किसे कहते हैं?",
            "What chemical substance is commercially termed 'Dry Ice'?",
            listOf("ठोस जल बर्फ", "ठोस कार्बन डाइऑक्साइड (Solid Carbon Dioxide - Solid CO₂)", "ठोस नाइट्रोजन", "ठोस मीथेन"),
            listOf("Solid water ice", "Solid Carbon Dioxide (Solid CO₂ at -78.5°C)", "Solid nitrogen", "Solid methane"),
            1,
            "ठोस कार्बन डाइऑक्साइड को शुष्क बर्फ कहते हैं। यह -78.5°C पर बिना द्रव में बदले सीधे गैस में ऊर्ध्वपातित (Sublimes) हो जाती है, जिससे यह गीलापन छोड़े बिना गहरा प्रशीतन प्रदान करती है।",
            "Solid CO₂ is called Dry Ice because it undergoes sublimation directly from solid to gas at -78.5°C (-109.3°F) at atmospheric pressure without melting into liquid.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q5", "sci_4",
            "अग्निशामक यंत्रों (Fire Extinguishers) में आग बुझाने के लिए किस गैस का उपयोग किया जाता है?",
            "Which heavy, non-combustible gas is released from Fire Extinguishers to smother flames by cutting off oxygen supply?",
            listOf("ऑक्सीजन", "कार्बन डाइऑक्साइड (Carbon Dioxide - CO₂)", "नाइट्रोजन डाइऑक्साइड", "हाइड्रोजन"),
            listOf("Oxygen", "Carbon Dioxide (CO₂)", "Nitrogen dioxide", "Hydrogen"),
            1,
            "CO₂ गैस हवा से 1.5 गुना भारी होती है। यह जलती हुई वस्तु के चारों ओर एक भारी कंबल की तरह फैलकर ऑक्सीजन के संपर्क को काट देती है और आग को तुरंत बुझा देती है।",
            "Carbon dioxide (CO₂) is heavier than air and does not support combustion, blanketing burning substrates to suffocate flames.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q6", "sci_4",
            "कार्बन मोनोऑक्साइड (CO) मानव शरीर के लिए अत्यधिक विषैली और जानलेवा क्यों है?",
            "Why is Carbon Monoxide (CO) inhalation highly toxic and fatal to human physiology?",
            listOf("यह फेफड़ों को फाड़ देती है", "यह हीमोग्लोबिन से ऑक्सीजन की तुलना में 200-250 गुना अधिक तीव्रता से जुड़कर कार्बोक्सीहीमोग्लोबिन बनाती है", "यह रक्त को जमा देती है", "यह पेट में एसिड बनाती है"),
            listOf("Ruptures lungs", "It binds to hemoglobin with 200-250 times higher affinity than oxygen, forming Carboxyhemoglobin (COHb) and causing asphyxiation", "Freezes blood", "Produces stomach acid"),
            1,
            "CO हीमोग्लोबिन के साथ मिलकर स्थायी 'कार्बोक्सीहीमोग्लोबिन' (Carboxyhemoglobin) बना लेती है, जिससे रक्त की ऑक्सीजन वहन क्षमता समाप्त हो जाती है और मस्तिष्क व अंगों तक ऑक्सीजन न पहुंचने से दम घुटने (Asphyxiation) से मृत्यु हो जाती है।",
            "Carbon monoxide binds avidly to the ferrous heme iron of hemoglobin (forming Carboxyhemoglobin) with ~250× the affinity of oxygen, starving tissues of cellular oxygen.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q7", "sci_4",
            "कच्चे फलों को कृत्रिम रूप से पकाने (Artificial Ripening) के लिए किस रसायन और गैस का उपयोग किया जाता है?",
            "Which industrial chemical carbide is banned for artificial fruit ripening because it releases acetylene gas contaminated with toxic arsenic/phosphorus traces?",
            listOf("कैल्शियम कार्बोनेट", "कैल्शियम कार्बाइड (CaC₂ - releases Acetylene gas C₂H₂)", "सोडियम क्लोराइड", "पोटेशियम नाइट्रेट"),
            listOf("Calcium Carbonate", "Calcium Carbide (CaC₂, reacting with moisture to release Acetylene gas C₂H₂)", "Sodium chloride", "Potassium nitrate"),
            1,
            "कैल्शियम कार्बाइड (CaC₂) नमी से क्रिया कर एसिटिलीन (C₂H₂) गैस छोड़ता है। यह विषैला होने के कारण FSSAI द्वारा प्रतिबंधित है। प्राकृतिक फल पकाने वाला पादप हार्मोन 'एथिलीन' (Ethylene - C₂H₄) है।",
            "Calcium Carbide (CaC₂ + 2H₂O → Ca(OH)₂ + C₂H₂) releases acetylene mimicking the natural ripening hormone Ethylene (C₂H₄), but is hazardous due to trace phosphine and arsine impurities.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q8", "sci_4",
            "वेल्डिंग (Oxy-Acetylene Welding) और धातुओं को काटने में ऑक्सीजन के साथ किस हाइड्रोकार्बन गैस की ज्वाला का उपयोग किया जाता है जो 3200°C तक तापमान देती है?",
            "In high-temperature Oxy-Fuel gas welding and metal cutting torches, Oxygen is combusted with which gas?",
            listOf("मीथेन", "एसिटिलीन / एथाइन (Acetylene / Ethyne - C₂H₂)", "ब्यूटेन", "प्रोपेन"),
            listOf("Methane", "Acetylene / Ethyne (C₂H₂, producing flame temperatures >3100°C)", "Butane", "Propane"),
            1,
            "ऑक्सी-एसिटिलीन ज्वाला (O₂ + C₂H₂) लगभग 3200°C से 3300°C का अत्यधिक उच्च तापमान उत्पन्न करती है, जो स्टील और भारी लोहे की मोटी चादरों को तुरंत पिघलाकर वेल्ड कर देती है।",
            "Oxy-Acetylene combustion (2 C₂H₂ + 5 O₂ → 4 CO₂ + 2 H₂O) produces the hottest open chemical flame (~3300°C), melting all structural steels easily.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q9", "sci_4",
            "प्राकृतिक रबर (Natural Rubber) किसका बहुलक (Polymer) है?",
            "Natural Rubber is a natural addition polymer of which monomer unit?",
            listOf("एथिलीन", "आइसोप्रीन / 2-मिथाइल-1,3-ब्यूटैडाइन (Isoprene - cis-1,4-polyisoprene)", "स्टाइरीन", "विनाइल क्लोराइड"),
            listOf("Ethylene", "Isoprene (2-methyl-1,3-butadiene / cis-1,4-polyisoprene)", "Styrene", "Vinyl chloride"),
            1,
            "प्राकृतिक रबर लेटेक्स (रबर के पेड़ के दूध) से प्राप्त होता है और यह सिस-1,4-पॉलीआइसोप्रीन होता है। संश्लेषित रबर 'नियोप्रीन' (Neoprene) क्लोरोप्रीन का बहुलक है।",
            "Natural rubber harvested from Hevea brasiliensis trees is cis-1,4-polyisoprene, an elastomer of Isoprene (2-methylbuta-1,3-diene).",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q10", "sci_4",
            "रबर के वल्कनीकरण (Vulcanization of Rubber) में रबर को कठोर, प्रत्यास्थ और टिकाऊ बनाने के लिए किसके साथ गर्म किया जाता है?",
            "In the Vulcanization process invented by Charles Goodyear in 1839, crude natural rubber is cross-linked by heating with:",
            listOf("कार्बन", "सल्फर / गंधक (Sulfur - 3 to 5%)", "फास्फोरस", "सिलिकॉन"),
            listOf("Carbon", "Sulfur (3-5% elemental sulfur forming disulfide cross-links)", "Phosphorus", "Silicon"),
            1,
            "चार्ल्स गुडइयर ने खोजा कि कच्चे रबर को सल्फर (गंधक) के साथ 100-140°C पर गर्म करने पर पॉलीमर श्रृंखलाओं के बीच डाइसल्फाइड क्रॉस-लिंक (-S-S-) बन जाते हैं, जिससे रबर मजबूत और गर्मी-रोधी बन जाता है।",
            "Charles Goodyear discovered that heating raw polyisoprene with elemental Sulfur creates cross-linking disulfide bridges across polymer chains, enhancing elasticity and tensile toughness.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q11", "sci_4",
            "न चिपकने वाले रसोई के बर्तनों (Non-Stick Cookware) पर किसकी परत चढ़ाई जाती है?",
            "Non-stick frying pans and cooking utensils are coated with which fluoropolymer characterized by ultra-low friction and heat resistance?",
            listOf("पीवीसी (PVC)", "टेफ्लॉन / पॉलीटेट्राफ्लूरोएथिलीन (Teflon - PTFE)", "बैकेलाइट", "पॉलीथीन"),
            listOf("PVC", "Teflon / Polytetrafluoroethylene (PTFE - [-CF₂-CF₂-]n)", "Bakelite", "Polythene"),
            1,
            "टेफ्लॉन (PTFE) टेट्राफ्लूरोएथिलीन (CF₂=CF₂) का बहुलक है। इसका घर्षण गुणांक बहुत कम होता है और यह 260°C तक बिना पिघले रासायनिक रूप से अक्रिय रहता है, जिससे तेल-पानी इस पर नहीं चिपकते।",
            "Teflon (PTFE / Polytetrafluoroethylene) features hydrophobic and oleophobic carbon-fluorine bonds providing extreme non-stick lubricity and thermal stability up to 260°C.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q12", "sci_4",
            "बिजली के स्विच, प्लग और बर्तनों के हैंडल बनाने के लिए किस थर्मोसेटिंग प्लास्टिक (Thermosetting Plastic) का उपयोग किया जाता है?",
            "Which thermosetting polymer, the first fully synthetic plastic invented by Leo Baekeland in 1907, is used for electrical switches and pan handles?",
            listOf("पॉलीथीन", "बैकेलाइट (Bakelite - Phenol-Formaldehyde Resin)", "पीवीसी", "नायलॉन"),
            listOf("Polythene", "Bakelite (Phenol-Formaldehyde condensation polymer)", "PVC", "Nylon"),
            1,
            "बैकेलाइट फिनोल और फॉर्मेल्डिहाइड का क्रॉस-लिंक्ड थर्मोसेटिंग बहुलक है। एक बार सांचे में ढलने के बाद गर्म करने पर यह दोबारा पिघलता नहीं है और विद्युत व ऊष्मा का कुचालक होता है।",
            "Bakelite is a rigid cross-linked thermosetting Phenol-Formaldehyde resin that does not soften upon reheating, making it ideal for electrical insulators and heat-resistant handles.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q13", "sci_4",
            "मानव द्वारा निर्मित पहला पूर्णतः संश्लेषित रेशा (First Fully Synthetic Fiber) कौन-सा था जिसे 1935 में वॉलेस कैरोथर्स ने विकसित किया था?",
            "Which was the world's first fully synthetic man-made polymer fiber, synthesized from coal, water, and air in 1935?",
            listOf("रेयान (Rayon)", "नायलॉन-6,6 (Nylon-6,6 - Polyamide)", "पॉलिएस्टर / टेरीलीन", "ऐक्रेलिक"),
            listOf("Rayon (Semi-synthetic regenerated cellulose)", "Nylon-6,6 (Polyamide synthesized from Adipic acid and Hexamethylenediamine)", "Polyester", "Acrylic"),
            1,
            "नायलॉन-6,6 एडिपिक एसिड और हेक्सामेथिलीन डायमाइन का पॉलीएमाइड संघनन बहुलक है। रेयान कृत्रिम रेशम है जो लकड़ी की लुगदी (सेल्युलोज) से बना अर्ध-संश्लेषित रेशा है।",
            "Nylon-6,6 was synthesized by Wallace Carothers at DuPont in 1935 as the first 100% synthetic fiber, combining extreme tensile strength with elasticity for parachutes and textiles.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q14", "sci_4",
            "बुलेटप्रूफ जैकेट (Bulletproof Vests) और हेलमेट बनाने के लिए किस अत्यंत मजबूत सिंथेटिक पॉलीएमाइड रेशे का उपयोग किया जाता है?",
            "Which ultra-high-strength aramid synthetic fiber is globally standard for fabricating lightweight Bulletproof Armor and helmets?",
            listOf("नायलॉन", "केवलर (Kevlar - Poly-paraphenylene terephthalamide)", "टेफ्लॉन", "रेयान"),
            listOf("Nylon", "Kevlar (Para-aramid synthetic polymer, 5× stronger than steel)", "Teflon", "Rayon"),
            1,
            "1965 में स्टेफनी क्वोलेक द्वारा खोजी गई केवलर (Kevlar) एक पैरा-एरामिड सिंथेटिक फाइबर है। इसकी हाइड्रोजन बॉन्डिंग के कारण यह समान वजन के स्टील से 5 गुना अधिक मजबूत होती है और गोलियों को रोक लेती है।",
            "Kevlar is a para-aramid fiber engineered with rigid aromatic polymer backbones that dissipate kinetic energy from high-velocity projectile impacts.",
            "Easy"
        ),
        makeScienceQ(
            "sci_4_m4_q15", "sci_4",
            "साबुन (Soap) रासायनिक रूप से क्या होते हैं?",
            "Chemically, Soaps manufactured via the Saponification process are:",
            listOf("सल्फ्यूरिक अम्ल के एस्टर", "उच्च वसीय अम्लों के सोडियम या पोटेशियम लवण (Sodium or Potassium salts of Long-Chain Fatty Acids)", "कैल्शियम कार्बोनेट", "अमीनो एसिड"),
            listOf("Sulfuric esters", "Sodium or Potassium salts of Long-Chain Fatty Acids (Stearic, Palmitic, Oleic acids)", "Calcium Carbonate", "Amino acids"),
            1,
            "साबुन निर्माण (Saponification) में वनस्पति तेल या जंतु वसा (ट्राइग्लिसराइड) को NaOH या KOH के साथ गर्म किया जाता है, जिससे उच्च वसीय अम्लों के लवण (साबुन) और सह-उत्पाद के रूप में ग्लिसरॉल (Glycerol) बनता है।",
            "Soaps are alkali salts of long-chain fatty acids (e.g., Sodium Stearate C₁₇H₃₅COONa) produced by alkaline hydrolysis of triglycerides, yielding Glycerol as a byproduct.",
            "Easy"
        )
    )
}
