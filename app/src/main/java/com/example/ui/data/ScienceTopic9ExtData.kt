package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic9ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6: RDA, ICMR Dietary Guidelines & Balanced Diet (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m6_q1", "sci_9",
            "भारतीय आयुर्विज्ञान अनुसंधान परिषद (ICMR - National Institute of Nutrition, Hyderabad) के अनुसार एक सामान्य वयस्क पुरुष हेतु दैनिक प्रोटीन की अनुशंसित मात्रा (RDA) कितनी है?",
            "According to the ICMR-NIN 2020 Dietary Guidelines for Indians, what is the Recommended Dietary Allowance (RDA) of daily protein intake for a healthy adult?",
            listOf("0.83 ग्राम प्रति किलोग्राम शरीर भार (0.83 g/kg body weight/day ~ 54g/day for 65kg reference man)", "2.5 ग्राम प्रति किलोग्राम", "5.0 ग्राम प्रति किलोग्राम", "0.2 ग्राम प्रति किलोग्राम"),
            listOf("0.83 g per kg body weight per day (Standard reference man of 65 kg requires ~54.0 g/day; 55 kg reference woman requires ~46.0 g/day)", "2.5 g/kg/day", "5.0 g/kg/day", "0.2 g/kg/day"),
            0,
            "ICMR-NIN (हैदराबाद) की रिपोर्ट 2020 के अनुसार सामान्य वयस्क को प्रतिदिन लगभग 0.83 ग्राम प्रोटीन प्रति किग्रा शरीर भार लेना चाहिए (65 किग्रा पुरुष हेतु ~54 ग्राम और 55 किग्रा महिला हेतु ~46 ग्राम)।",
            "ICMR-NIN revised reference body weights in 2020 to 65 kg for Indian adult male and 55 kg for female, fixing baseline safe protein intake at 0.83 g/kg/day based on nitrogen balance studies.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q2", "sci_9",
            "ICMR-NIN के अनुसार एक सामान्य गतिहीन (Sedentary) वयस्क पुरुष और महिला की दैनिक ऊर्जा आवश्यकता (Caloric Requirement) क्रमशः कितनी निर्धारित की गई है?",
            "What is the daily baseline energy requirement (in kcal/day) recommended by ICMR-NIN 2020 for a sedentary adult Indian male and female?",
            listOf("2110 kcal (पुरुष) एवं 1660 kcal (महिला) (2110 kcal/day for men & 1660 kcal/day for women)", "3500 kcal एवं 3000 kcal", "1200 kcal एवं 1000 kcal", "4000 kcal एवं 3500 kcal"),
            listOf("2110 kcal/day for sedentary man and 1660 kcal/day for sedentary woman", "3500 kcal and 3000 kcal", "1200 kcal and 1000 kcal", "4000 kcal and 3500 kcal"),
            0,
            "ICMR-NIN (2020 दिशानिर्देश) के अनुसार: गतिहीन काम करने वाले पुरुष को ~2110 kcal, मध्यम काम करने वाले को ~2710 kcal और भारी श्रम करने वाले को ~3470 kcal प्रतिदिन ऊर्जा की आवश्यकता होती है।",
            "The 2020 ICMR Expert Group on Nutrient Requirements lowered reference caloric benchmarks to account for modern urban sedentary lifestyles and updated resting metabolic rate equations.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q3", "sci_9",
            "संतुलित आहार की 'मेरी थाली' (My Plate for the Day - ICMR) अवधारणा के अनुसार दैनिक थाली का आधा (50%) भाग किन खाद्य पदार्थों से युक्त होना चाहिए?",
            "Under the ICMR-NIN 'My Plate for the Day' nutritional guidelines, exactly half (50%) of a healthy daily meal plate should comprise:",
            listOf("ताजी सब्जियां, हरी पत्तेदार सब्जियां एवं फल (Fresh Vegetables, Green Leaves & Fruits)", "शुद्ध घी और मक्खन", "केवल सफेद चावल", "मिठाइयां और चीनी"),
            listOf("Vegetables, Green Leafy Vegetables, and Fresh Fruits (Providing micronutrients, antioxidants, and dietary fiber)", "Pure Ghee and Butter", "Only Refined Polished Rice", "Sweets and Confectionery"),
            0,
            "ICMR की 'माय प्लेट' के अनुसार: थाली का 50% भाग सब्जियां व फल होना चाहिए, 25-30% अनाज/मिलेट्स और 15-20% दालें, अंडे, नट्स या दूध उत्पाद होने चाहिए। प्रतिदिन कम से कम 400 ग्राम सब्जियां व 100 ग्राम फल खाने की सिफारिश है।",
            "The ICMR-NIN 'My Plate for the Day' recommends a daily intake of 350g vegetables, 150g fruits, 250g cereals/nutri-cereals, 85g pulses/meat, 27g fats/oils, and 300ml milk/curd.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q4", "sci_9",
            "विश्व स्वास्थ्य संगठन (WHO) के अनुसार एक वयस्क व्यक्ति को उच्च रक्तचाप और दिल के रोगों से बचाव हेतु प्रतिदिन कितने ग्राम से कम साधारण नमक (Salt / Sodium) खाना चाहिए?",
            "According to the WHO guidelines, an adult's daily salt intake should be restricted to less than how many grams per day (< 2g Sodium) to prevent cardiovascular disease?",
            listOf("5 ग्राम प्रतिदिन से कम / 1 छोटा चम्मच (Less than 5.0 grams of Salt per day)", "15 ग्राम प्रतिदिन", "25 ग्राम प्रतिदिन", "50 ग्राम प्रतिदिन"),
            listOf("Less than 5.0 g/day of common salt (Equivalent to < 2.0 g elemental Sodium per day)", "15.0 g/day", "25.0 g/day", "50.0 g/day"),
            0,
            "WHO के अनुसार प्रतिदिन 5 ग्राम (लगभग एक छोटा चम्मच) से कम नमक खाना चाहिए। भारतीय औसतन 10-12 ग्राम नमक प्रतिदिन खाते हैं, जो उच्च रक्तचाप और स्ट्रोक का मुख्य कारण है।",
            "WHO recommends reducing sodium intake to under 2000 mg/day (5 g/day salt) to lower blood pressure and attenuate the risk of stroke and coronary heart disease globally.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q5", "sci_9",
            "शरीर का वजन संतुलित है या नहीं, यह जानने के लिए 'बॉडी मास इंडेक्स' (BMI) की गणना किस सूत्र से की जाती है?",
            "What is the mathematical formula used universally to calculate an individual's Body Mass Index (BMI / Quetelet Index)?",
            listOf("वजन (किग्रा) / [ऊंचाई (मीटर)]² (Weight in kg / [Height in meters]²)", "वजन (किग्रा) × ऊंचाई (मीटर)", "ऊंचाई (सेमी) - 100", "वजन (पाउंड) / ऊंचाई (इंच)"),
            listOf("Weight (kg) divided by Height squared (m²) [BMI = kg/m²]", "Weight (kg) × Height (m)", "Height (cm) - 100", "Weight (lbs) / Height (inches)"),
            0,
            "BMI = वजन (kg) ÷ [ऊंचाई (m)]²। एशियाई भारतीयों हेतु मानक: 18.5 से कम = कम वजन (Underweight); 18.5 से 22.9 = सामान्य वजन (Normal); 23 से 24.9 = अधिक वजन (Overweight); 25 से अधिक = मोटापा (Obese)।",
            "Adolphe Quetelet formulated BMI (kg/m²). For Asian Indians, the WHO consensus classifies BMI 18.5-22.9 as normal, 23.0-24.9 as overweight, and ≥25.0 as obese due to high visceral adiposity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q6", "sci_9",
            "मोटे अनाज (Millets / श्री अन्न - जैसे रागी, बाजरा, ज्वार) को पोषण का 'पॉवरहाउस' क्यों माना जाता है?",
            "Why are Nutri-Cereals / Millets (Shree Anna - Ragi, Bajra, Jowar, Kodo, Foxtail) celebrated as nutritional powerhouses compared to refined wheat and white rice?",
            listOf("उच्च आहार रेशा (Fiber), कम ग्लाइसेमिक इंडेक्स (Low GI), प्रचुर खनिज (कैल्शियम, आयरन) एवं ग्लूटेन-मुक्त होना", "इनमें केवल वसा होती है", "ये केवल पानी सोखते हैं", "इनमें कोई कार्बोहाइड्रेट नहीं होता"),
            listOf("High dietary fiber, low glycemic index, gluten-free, and rich in essential minerals (Ragi for Calcium, Bajra for Iron)", "They contain only pure lipids", "They only absorb moisture", "They contain zero carbohydrates"),
            0,
            "रागी (Finger Millet) में दूध से तीन गुना अधिक कैल्शियम (344 mg/100g) और बाजरा में प्रचुर आयरन होता है। ये ग्लूटेन-मुक्त होते हैं और धीमी गति से पचने के कारण डायबिटीज और मोटापे के मरीजों के लिए सर्वोत्तम हैं। UN ने 2023 को 'अंतरराष्ट्रीय मिलेट्स वर्ष' घोषित किया था।",
            "Millets provide complex slowly-digestible starch, prebiotic arabinoxylans, phytosterols, polyphenols, and higher calcium/iron density than polished staple cereals, reducing metabolic syndrome risk.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q7", "sci_9",
            "गेहूं के आटे में पाया जाने वाला कौन-सा लचीला प्रोटीन नेटवर्क सीलिएक रोग (Celiac Disease) से पीड़ित लोगों में छोटी आंत के रसांकुरों को नष्ट कर देता है?",
            "Which composite storage protein complex present in Wheat, Barley, and Rye triggers chronic autoimmune enteropathy and villous atrophy in Celiac Disease patients?",
            listOf("ग्लूटेन प्रोटीन - ग्लाइडिन एवं ग्लूटेनिन (Gluten Protein - Gliadin & Glutenin)", "एल्ब्यूमिन", "केसीन", "कोलेजन"),
            listOf("Gluten (Composed of Gliadin and Glutenin proteins triggering anti-tTG antibody damage to duodenal villi)", "Egg Albumin", "Milk Casein", "Bone Collagen"),
            0,
            "सीलिएक रोग एक ऑटोइम्यून विकार है जिसमें गेहूं का 'ग्लूटेन' (Gluten) खाने पर शरीर की प्रतिरक्षा प्रणाली छोटी आंत के विली को नष्ट कर देती है, जिससे पोषक तत्वों का अवशोषण रुक जाता है। ऐसे मरीजों को 'ग्लूटेन-मुक्त आहार' (Gluten-Free Diet - चावल, मक्का, रागी) दिया जाता है।",
            "Ingestion of gluten gliadin peptides in HLA-DQ2/DQ8 positive individuals stimulates tissue transglutaminase (tTG), eliciting CD4+ T-cell infiltration, crypt hyperplasia, and mucosal villous flattening.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q8", "sci_9",
            "जल में घुलनशील आहार रेशा (Soluble Dietary Fiber - जैसे ओट्स, इसबगोल/Psyllium, सेब का पेक्टिन) रक्त में किस हानिकारक तत्व को कम करता है?",
            "Soluble Viscous Dietary Fiber (such as Beta-glucan in Oats, Psyllium Husk / Isabgol, and Apple Pectin) clinically lowers serum levels of:",
            listOf("एलडीएल कोलेस्ट्रॉल एवं भोजन के बाद ग्लूकोज स्पाइक (LDL Cholesterol & Postprandial Glucose Spikes)", "विटामिन सी", "कैल्शियम", "हीमोग्लोबिन"),
            listOf("LDL Cholesterol (binding intestinal bile acids) and postprandial glycemic surge", "Vitamin C", "Serum Calcium", "Hemoglobin"),
            0,
            "घुलनशील रेशा आंतों में जेल बनाकर पित्त अम्लों (Bile Acids) को बांध लेता है जिससे यकृत रक्त से कोलेस्ट्रॉल खींचकर नया पित्त बनाता है और खून में LDL कोलेस्ट्रॉल घटता है। यह शुगर के अवशोषण को भी धीमा करता है।",
            "Soluble fiber forms high-viscosity luminal gels that entrap mixed micelles and inhibit bile acid reabsorption, upregulating hepatic LDL receptor clearance of circulating atherogenic apolipoproteins.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q9", "sci_9",
            "अत्यधिक प्रसंस्कृत 'जंक फूड' (Ultra-Processed HFSS Foods - High Fat, Sugar, Salt) में पाए जाने वाले 'ट्रांस-फैट्स' (Trans Fatty Acids) को FSSAI ने खाद्य तेलों में अधिकतम कितने प्रतिशत तक सीमित कर दिया है?",
            "As per FSSAI regulations enacted in January 2022, the maximum permissible limit of industrial Trans Fatty Acids (TFAs) in all fats and oils in India is capped at:",
            listOf("2% से अधिक नहीं (Not more than 2.0% by weight)", "10%", "25%", "50%"),
            listOf("Not more than 2.0% by weight (Eliminating industrial trans-fats in alignment with WHO REPLACE action package)", "Not more than 10.0%", "Not more than 25.0%", "Not more than 50.0%"),
            0,
            "FSSAI ने 1 जनवरी 2022 से भारत में सभी खाद्य तेलों, वनस्पति घी और बेकरी उत्पादों में ट्रांस फैट की सीमा को 2% तक सीमित कर दिया है ताकि दिल की बीमारियों को रोका जा सके (WHO REPLACE पहल)।",
            "FSSAI gazette notification mandated that trans fatty acid levels in all edible refined oils, vanaspati, margarine, and shortenings must not exceed 2% by weight by January 2022.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q10", "sci_9",
            "गर्भावस्था के दौरान आयरन और फोलिक एसिड (IFA) की गोलियों का वितरण भारत सरकार के किस प्रमुख स्वास्थ्य कार्यक्रम के अंतर्गत किया जाता है?",
            "Under India's flagship 'Anemia Mukt Bharat' (AMB) strategy, pregnant women are provided 180 daily IFA tablets containing how much elemental Iron and Folic Acid?",
            listOf("60 mg तात्विक आयरन एवं 500 mcg फोलिक एसिड (60 mg Elemental Iron + 500 mcg Folic Acid)", "10 mg आयरन एवं 100 mcg फोलिक एसिड", "500 mg आयरन एवं 10 mg फोलिक एसिड", "1000 mg आयरन"),
            listOf("60 mg elemental Iron + 500 mcg Folic Acid (Red IFA tablet given daily for 180 days during pregnancy starting from second trimester)", "10 mg Iron + 100 mcg Folic acid", "500 mg Iron + 10 mg Folic acid", "1000 mg Iron"),
            0,
            "'एनीमिया मुक्त भारत' के तहत गर्भवती महिलाओं को दूसरी तिमाही से रोजाना लाल रंग की IFA गोली (60 mg आयरन + 500 mcg फोलिक एसिड) कम से कम 180 दिनों तक और प्रसव के बाद 180 दिनों तक दी जाती है।",
            "The 6x6x6 Anemia Mukt Bharat strategy ensures prophylactic iron-folic acid supplementation across 6 beneficiary age groups using age-specific color-coded IFA tablets and syrups.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q11", "sci_9",
            "नवजात शिशुओं के लिए जीवन के प्रथम 6 माह तक 'केवल स्तनपान' (Exclusive Breastfeeding) क्यों अनिवार्य माना जाता है?",
            "Why is Exclusive Breastfeeding (EBF - with zero water or supplementary milk) strictly recommended for the first 6 continuous months of infant life by WHO and UNICEF?",
            listOf("मां के दूध में शिशु के लिए आवश्यक सभी पोषक तत्व, पानी, पाचक एंजाइम और एंटीबॉडीज (IgA) पूर्ण संतुलन में होते हैं", "गाय का दूध मीठा होता है", "शिशु पानी नहीं पी सकते", "केवल वजन घटाने के लिए"),
            listOf("Human milk provides optimal bioavailable macronutrients, fluid hydration, human milk oligosaccharides (HMOs), and secretory IgA antibodies perfectly tailored for immature infant guts", "Cow milk is sweeter", "Infants cannot drink fluids", "Purely for maternal weight loss"),
            0,
            "मां के दूध में 88% पानी, लैक्टोज, सुपाच्य व्हे प्रोटीन (Whey protein), आवश्यक फैटी एसिड (DHA/ARA), आंतों के मित्र बैक्टीरिया बढ़ाने वाले ऑलिगोसैकेराइड्स (HMOs) और IgA एंटीबॉडीज होती हैं जो संक्रमण से बचाती हैं। 6 माह तक पानी देने की भी जरूरत नहीं होती।",
            "Exclusive breastfeeding fulfills complete nutrient and fluid requirements for 6 months, promoting neurological synaptic myelination and conferring mucosal immune resistance against infectious gastroenteritis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q12", "sci_9",
            "शिशु के 6 माह पूरे होने के बाद मां के दूध के साथ-साथ अर्ध-ठोस पौष्टिक आहार शुरू करने की प्रक्रिया बाल पोषण में क्या कहलाती है?",
            "The gradual introduction of hygienically prepared semi-solid nutrient-dense complementary foods alongside continued breastfeeding starting at 6 months of age is termed:",
            listOf("पूरक पोषण / अन्नप्राशन (Complementary Feeding / Weaning)", "उपवास", "ग्लूकोज थेरेपी", "स्टार्वेशन"),
            listOf("Complementary Feeding / Weaning (Introducing energy-dense mashed cereals, pulses, vegetables, and fruits at 6 months)", "Fasting", "Glucose therapy", "Starvation"),
            0,
            "6 माह के बाद केवल मां का दूध शिशु की तेजी से बढ़ती ऊर्जा, आयरन और जिंक की जरूरतों के लिए पर्याप्त नहीं होता। इसलिए दाल-चावल की खिचड़ी, मसला हुआ केला और दलिया जैसे पूरक आहार (Complementary Feeding) शुरू किए जाते हैं।",
            "Timely complementary feeding bridges the critical 'energy and nutrient gap' after 6 months, preventing linear growth faltering, stunting, and micro-nutrient deficiencies during the first 1000 days.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q13", "sci_9",
            "मानव जीवन के 'प्रथम 1000 दिन' (First 1,000 Days - गर्भधारण से लेकर बच्चे के दूसरे जन्मदिन तक) पोषण की दृष्टि से सबसे महत्वपूर्ण खिड़की (Window of Opportunity) क्यों माने जाते हैं?",
            "Why is the biological window of the 'First 1,000 Days' (from maternal conception to the child's second birthday) universally recognized as the most decisive period in human development?",
            listOf("इस अवधि में मानव मस्तिष्क का 80% विकास, तंत्रिका तंतुओं का माइलिनेशन और शारीरिक वृद्धि की नींव पड़ती है जो बाद में अपरिवर्तनीय होती है", "इस समय बच्चे चलना सीखते हैं", "इस समय दांत गिरते हैं", "केवल स्कूल जाने के लिए"),
            listOf("Over 80% of human cerebral neurogenesis, synaptic plasticity, metabolic programming, and immune development occur during this non-renewable window", "Children learn to run", "Deciduous teeth fall out", "School admission eligibility"),
            0,
            "गर्भधारण के 270 दिन + जन्म के बाद के 730 दिन = 1000 दिन। इस दौरान कुपोषण होने पर बच्चे का शारीरिक विकास बौना (Stunted) रह जाता है और दिमागी क्षमता आजीवन कमजोर हो जाती है, जिसे बाद में ठीक नहीं किया जा सकता।",
            "Barker's Developmental Origins of Health and Disease (DOHaD) proves that nutritional deficits during the first 1000 days cause irreversible cognitive impairment and epigenetically programme adult metabolic disorders.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q14", "sci_9",
            "चाय और कॉफी में पाए जाने वाले 'टैनिन' (Tannins) और अनाजों के 'फाइटेट्स' (Phytates) भोजन में किस महत्वपूर्ण खनिज के अवशोषण में बाधा उत्पन्न करते हैं?",
            "Polyphenolic Tannins in tea/coffee and Inositol hexaphosphate (Phytic Acid) in unsoaked whole grains act as anti-nutritional factors chelated tightly to:",
            listOf("आयरन एवं जिंक (Iron & Zinc - forming insoluble unabsorbable complexes)", "विटामिन सी", "सोडियम", "पोटेशियम"),
            listOf("Iron (Fe) and Zinc (Zn) - precipitating insoluble metal-phytate/tannate chelates in the duodenal lumen", "Vitamin C", "Sodium", "Potassium"),
            0,
            "खाना खाने के तुरंत बाद चाय या कॉफी पीने से उसमें मौजूद टैनिन और अनाजों के फाइटेट्स भोजन के आयरन और जिंक से चिपककर अघुलनशील यौगिक बना लेते हैं जिससे आयरन खून में नहीं पहुंच पाता। इसलिए भोजन और चाय में 1 घंटे का अंतर रखना चाहिए।",
            "Phytic acid binds polyvalent mineral cations (Fe2+, Zn2+, Ca2+) via its six phosphate moieties, resisting brush-border phosphatase cleavage and precipitating trace element malabsorption.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m6_q15", "sci_9",
            "दालों और बीजों को 'अंकुरित' (Sprouting / Germination) करने और किण्वन (Fermentation - जैसे इडली/डोसा बैटर) करने से भोजन में किन विटामिनों की मात्रा कई गुना बढ़ जाती है?",
            "Sprouting of whole legumes (Moong/Gram) and microbial Fermentation of cereal-pulse batters substantially increases the bioavailability and synthesis of:",
            listOf("विटामिन 'सी' एवं विटामिन 'बी-कॉम्प्लेक्स' (Vitamin C and B-Complex Vitamins like B1, B2, B9)", "विटामिन डी", "वसा की मात्रा", "ग्लूकोज केवल"),
            listOf("Vitamin C (Ascorbic Acid) and B-Complex vitamins (Thiamine, Riboflavin, Niacin, and Folate) while deactivating phytates", "Vitamin D", "Pure saturated fats", "Glucose only"),
            0,
            "अंकुरण के दौरान बीज के निष्क्रिय एंजाइम (फाइटेस) सक्रिय हो जाते हैं जो फाइटिक एसिड को तोड़ते हैं, जिससे आयरन/जिंक मुक्त होता है और नए विटामिन-C तथा B-कॉम्प्लेक्स का भारी संश्लेषण होता है।",
            "Seed germination triggers endogenous phytase activity to hydrolyze mineral-binding phytates while enzymatically synthesizing de novo ascorbic acid, riboflavin, and bioavailable free folates.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 7: Food Adulteration, Tests, FSSAI & Food Fortification (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m7_q1", "sci_9",
            "दूध (Milk) में 'स्टार्च' (Starch / आरारोट / मैदा) की मिलावट का पता लगाने के लिए प्रयोगशाला या घर पर कौन-सी रासायनिक परीक्षण बूंदें डाली जाती हैं?",
            "Which chemical reagent solution added to an adulterated milk sample turns it intensely Blue-Black, confirming the fraudulent addition of Starch/Flour thickener?",
            listOf("आयोडीन का घोल (Iodine Solution - Potassium Iodide reagent)", "सल्फ्यूरिक एसिड", "नींबू का रस", "सोडियम बाइकार्बोनेट"),
            listOf("Iodine Reagent Solution (Lugol's Iodine - Amylose helical chains form deep blue-black polyiodide charge-transfer complex)", "Concentrated Sulfuric Acid", "Lemon juice", "Sodium Bicarbonate"),
            0,
            "दूध में स्टार्च मिलाने पर आयोडीन की 2-3 बूंदें डालते ही रंग गहरा नीला या काला (Blue-black) हो जाता है। शुद्ध दूध में आयोडीन डालने पर कोई नीला रंग नहीं बनता।",
            "Triiodide and pentaiodide ions insert into the center of the helical coil of amylose polymers in starch, generating a characteristic dark blue-black absorption spectrum at 620 nm.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q2", "sci_9",
            "सरसों के तेल (Mustard Oil) में 'आर्जीमोन मैक्सिकाना' (Argemone Oil / पीली कटेरी का तेल) की घातक मिलावट से कौन-सा भयानक महामारी रोग (Epidemic Dropsy) होता है?",
            "Adulteration of mustard cooking oil with toxic Argemone mexicana seed oil containing sanguinarine alkaloid causes which fatal vascular disease?",
            listOf("एपिडेमिक ड्रॉप्सिएवं ग्लूकोमा (Epidemic Dropsy - Generalized Edema, Cardiac Failure & Blindness)", "मलेरिया", "टाइफाइड", "हैजा"),
            listOf("Epidemic Dropsy (Sanguinarine and dihydrosanguinarine inhibit Na+/K+-ATPase, causing extreme capillary dilation, massive pitting edema, and congestive heart failure)", "Malaria", "Typhoid", "Cholera"),
            0,
            "आर्जीमोन के तेल में 'सैंग्विनारिन' (Sanguinarine) नामक विषैला एल्कलॉइड होता है। इससे रक्त वाहिकाएं अत्यधिक चौड़ी होकर रिसने लगती हैं, जिससे पूरे शरीर में पानी भर जाता है (ड्रॉप्सि), दिल काम करना बंद कर देता है और अंधापन (ग्लूकोमा) हो जाता है। नाइट्रिक एसिड टेस्ट से इसकी पहचान होती है।",
            "Sanguinarine alkaloid uncouples oxidative phosphorylation and inhibits vascular endothelial Na+/K+-ATPase pumps, causing widespread capillary permeability and fatal myocardial fluid overload.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q3", "sci_9",
            "हल्दी पाउडर (Turmeric Powder) को चमकीला पीला दिखाने के लिए मिलाए जाने वाले किस जहरीले कैंसरकारी गैर-अनुमत रासायनिक रंग (Non-Permitted Coal Tar Dye) का परीक्षण सांद्र HCl से किया जाता है?",
            "Which carcinogenic, banned azo coal-tar dye fraudulently added to turmeric powder to impart a vibrant yellow hue produces a bright magenta/pink color when treated with concentrated HCl?",
            listOf("मेटानिल येलो (Metanil Yellow Dye)", "सूडान डाई", "मेलाटोनिन", "क्लोरोफिल"),
            listOf("Metanil Yellow (Sodium 4-(4-anilinophenylazo)benzenesulfonate - A toxic neurotoxic and testicular-damaging textile dye)", "Sudan Red Dye", "Melatonin", "Chlorophyll"),
            0,
            "हल्दी के नमूने में थोड़ा पानी और सांद्र हाइड्रोक्लोरिक एसिड (HCl) मिलाने पर यदि रंग गहरा मैजेंटा/गुलाबी (Magenta-pink) हो जाए, तो उसमें जहरीला 'मेटानिल येलो' रंग मिलाया गया है। शुद्ध हल्दी में HCl डालने पर रंग धीरे-धीरे उड़ जाता है।",
            "Metanil yellow is an unpermitted acid azo dye whose conjugated azo group protonates in strong mineral acid to yield a resonant quinonoid cation displaying a vivid magenta-pink chromophore.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q4", "sci_9",
            "काली मिर्च (Black Pepper) के दानों में वजन और मात्रा बढ़ाने हेतु किस फल के सूखे बीजों की मिलावट सबसे आम तौर पर की जाती है?",
            "Which dried fruit seeds, possessing identical dark wrinkled spherical morphology, are most frequently mixed as a fraudulent adulterant in whole Black Peppercorns (Piper nigrum)?",
            listOf("पपीते के सूखे बीज (Dried Papaya Seeds)", "सेब के बीज", "तरबूज के बीज", "इलायची के बीज"),
            listOf("Dried Papaya Seeds (Carica papaya seeds, easily identified by floating on alcohol or lacking pungent piperine taste)", "Apple seeds", "Watermelon seeds", "Cardamom seeds"),
            0,
            "पपीते के सूखे बीज हूबहू काली मिर्च जैसे दिखते हैं। परीक्षण: जब मिश्रण को पानी या अल्कोहल में डाला जाता है, तो भारी काली मिर्च नीचे डूब जाती है जबकि हल्के पपीते के बीज ऊपर तैरने लगते हैं।",
            "Papaya seeds lack the crystalline alkaloid piperine and sink differently in test fluids; floatation in methylated spirit cleanly separates lighter papaya seeds from heavier dense black peppercorns.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q5", "sci_9",
            "दूध में यूरिया (Urea) और डिटर्जेंट मिलाकर बनाए जाने वाले घातक 'सिंथेटिक दूध' (Synthetic Milk) में यूरिया का परीक्षण किस एंजाइम के पत्र (Paper Strip) द्वारा किया जाता है?",
            "The dangerous adulteration of synthetic milk with Urea (added to falsely elevate nitrogen content and lactometer reading) is detected using which specific enzyme test paper?",
            listOf("यूरिएज एंजाइम पेपर स्ट्रिप (Urease Enzyme Test Strip - turning pink/red with Phenol Red indicator)", "पेप्सिन स्ट्रिप", "एमाइलेज स्ट्रिप", "लाइपेस स्ट्रिप"),
            listOf("Urease Enzyme Paper Strip (Urease hydrolyzes urea to ammonium carbonate, raising pH and turning bromothymol blue / phenol red indicator intensely pink)", "Pepsin strip", "Amylase strip", "Lipase strip"),
            0,
            "यूरिएज एंजाइम (सोयाबीन से प्राप्त) यूरिया को अमोनिया में तोड़ता है जिससे घोल क्षारीय हो जाता है और फिनोल रेड सूचक का रंग गुलाबी या गहरा लाल हो जाता है।",
            "Urease specifically catalyzes the hydrolysis of urea into ammonia and carbon dioxide; alkaline ammonium ions elevate the pH, inducing a sharp color transition in localized pH indicators.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m7_q6", "sci_9",
            "शहद (Honey) में चीनी की चाशनी, कॉर्न सिरप या चावल के सिरप (C4/C3 Sugar Adulteration) की आधुनिक वैज्ञानिक जांच किस उन्नत तकनीक द्वारा की जाती है?",
            "Which sophisticated analytical isotopic mass spectrometry method is mandated by FSSAI to detect artificial C3/C4 commercial sugar and high-fructose corn syrups in pure Honey?",
            listOf("आइसोटोप अनुपात मास स्पेक्ट्रोमेट्री (EA-IRMS / SIRA - Stable Isotope Ratio Analysis of Carbon-13/Carbon-12)", "केवल थर्मामीटर", "बैरोमीटर", "रक्तचाप मशीन"),
            listOf("EA-IRMS (Elemental Analyzer - Isotope Ratio Mass Spectrometry measuring delta-13C isotopic signatures of honey protein vs sugars)", "Simple Thermometer", "Barometer", "Blood pressure cuff"),
            0,
            "शुद्ध शहद मधुमक्खियों द्वारा C3 पौधों के फूलों के मकरंद से बनता है (जिसमें कार्बन-13 का विशिष्ट अनुपात होता है)। जब गन्ने या मक्के (C4 पौधे) की चाशनी मिलाई जाती है, तो IRMS तकनीक कार्बन समस्थानिकों (13C/12C) के अंतर से मिलावट पकड़ लेती है।",
            "EA-IRMS analyzes the photosynthetic carbon fractionation difference between C3 floral nectars (Calvin cycle, delta-13C ~ -25‰) and C4 plant cane/corn syrups (Hatch-Slack pathway, delta-13C ~ -10‰).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m7_q7", "sci_9",
            "भारत में खाद्य सुरक्षा, गुणवत्ता मानकों और मिलावट रोकथाम हेतु स्थापित शीर्ष नियामक प्राधिकरण 'FSSAI' का पूर्ण रूप क्या है?",
            "What is the complete official expansion of FSSAI, the apex statutory food safety authority established under the Food Safety and Standards Act, 2006?",
            listOf("भारतीय खाद्य सुरक्षा और मानक प्राधिकरण (Food Safety and Standards Authority of India)", "फेडरल सेनेटरी एंड सेफ्टी एजेंसी ऑफ इंडिया", "फूड सप्लाई एंड सिक्योरिटी एसोसिएशन ऑफ इंडिया", "फॉरेन सेफ्टी एंड सिक्योरिटी एजेंसी"),
            listOf("Food Safety and Standards Authority of India (FSSAI - Under Ministry of Health and Family Welfare)", "Federal Sanitary and Safety Agency of India", "Food Supply and Security Association of India", "Foreign Safety and Standards Authority"),
            0,
            "FSSAI (Food Safety and Standards Authority of India) स्वास्थ्य एवं परिवार कल्याण मंत्रालय के अधीन स्वायत्त वैधानिक निकाय है। इसका मुख्यालय नई दिल्ली में है और यह देश भर में खाद्य पदार्थों के निर्माण, भंडारण, वितरण, बिक्री और आयात के मानक तय करता है।",
            "FSSAI was established under the FSS Act, 2006, consolidating eight historic food laws (including the Prevention of Food Adulteration Act, 1954) into a single unified regulatory science-based framework.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q8", "sci_9",
            "भारत सरकार द्वारा सूक्ष्म पोषक तत्वों की कमी (Hidden Hunger) को दूर करने हेतु फोर्टिफाइड खाद्य पदार्थों (जैसे फोर्टिफाइड चावल, तेल, दूध, नमक) पर कौन-सा विशिष्ट लोगो लगाया जाता है?",
            "Which official blue-colored certification symbol with a ring and a plus sign is mandated by FSSAI on packaging of government-notified Fortified Staple Foods?",
            listOf("'+F' लोगो (Fortified with Nutrition Logo - +F)", "आईएसआई (ISI) मार्क", "एगमार्क (AGMARK)", "ग्रीन डॉट"),
            listOf("+F Logo ('+F' enclosed in a square ring with the tagline 'Sampoorna Poshan Swasth Jeevan')", "ISI Mark (Bureau of Indian Standards)", "AGMARK (Agricultural produce grading)", "Green Veg Dot"),
            0,
            "'+F' लोगो बताता है कि उस खाद्य पदार्थ में आवश्यक विटामिन और खनिज जोड़े गए हैं (जैसे दूध/तेल में विटामिन A व D; नमक में आयोडीन व आयरन; चावल/गेहूं में आयरन, फोलिक एसिड व B12)।",
            "The '+F' logo certifies compliance with FSSAI (Fortification of Foods) Regulations, 2018, designating scientifically enriched staple commodities formulated to combat micronutrient malnutrition.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q9", "sci_9",
            "प्रधानमंत्री पोषण योजना (PM-POSHAN / मिड-डे मील) और सार्वजनिक वितरण प्रणाली (PDS / राशन) में वितरित किए जाने वाले 'फोर्टिफाइड चावल' (Fortified Rice) में किन तीन प्रमुख सूक्ष्म पोषक तत्वों का मिश्रण होता है?",
            "Fortified Rice Kernels (FRK blended at 1:100 ratio with regular rice) distributed across Indian welfare schemes are fortified with which three mandatory micronutrients?",
            listOf("आयरन, फोलिक एसिड एवं विटामिन बी12 (Iron, Folic Acid, and Vitamin B12)", "कैल्शियम, पोटेशियम और सोडियम", "विटामिन सी, विटामिन ई और जिंक", "केवल आयोडीन"),
            listOf("Iron (Ferric pyrophosphate/Sodium feredetate), Folic Acid (Vitamin B9), and Vitamin B12 (Cyanocobalamin)", "Calcium, Potassium, and Sodium", "Vitamin C, Vitamin E, and Zinc", "Iodine only"),
            0,
            "चावल के आटे में आयरन (28-42.5 mg/kg), फोलिक एसिड (75-125 mcg/kg) और विटामिन B12 (0.75-1.25 mcg/kg) मिलाकर एक्सट्रूजन तकनीक से 'FRK' दाने बनाए जाते हैं और साधारण चावल में 1:100 के अनुपात में मिलाया जाता है।",
            "Extruded Fortified Rice Kernels (FRK) incorporate micronized ferric pyrophosphate, synthetic pteroylglutamic acid, and cyanocobalamin to combat widespread nutritional anemia in vulnerable populations.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q10", "sci_9",
            "कृषि उत्पादों (घी, शहद, मक्खन, मसाले, सरसों तेल) की शुद्धता और ग्रेडिंग प्रमाणित करने हेतु कृषि एवं किसान कल्याण मंत्रालय द्वारा कौन-सा मानक प्रमाणन चिह्न दिया जाता है?",
            "Which quality certification mark is issued by the Directorate of Marketing and Inspection (DMI) on agricultural and food commodities under the Agricultural Produce Act, 1937?",
            listOf("एगमार्क (AGMARK - Agricultural Marketing)", "आईएसआई मार्क", "बीआईएस हॉलमार्क (सोने हेतु)", "एफपीओ (FPO)"),
            listOf("AGMARK (Agricultural Produce Grading and Marking Act, 1937)", "ISI Mark (Industrial products)", "BIS Hallmark (Precious gold/silver jewellery)", "FPO (Fruit Products Order)"),
            0,
            "एगमार्क (AGMARK) कृषि व खाद्य उत्पादों (जैसे शुद्ध घी, शहद, बेसन, सरसों तेल) की गुणवत्ता और शुद्धता का सरकारी प्रमाण पत्र है। केंद्रीय एगमार्क प्रयोगशाला (CAL) नागपुर (महाराष्ट्र) में स्थित है।",
            "AGMARK is a legally enforceable quality certification system for agricultural produce based on physical and chemical baseline standards governed by the Directorate of Marketing and Inspection.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q11", "sci_9",
            "आहार में 'अदृश्य भूख' (Hidden Hunger) किसे कहा जाता है जो पेट भरने के बावजूद शरीर को अंदर से बीमार बनाती है?",
            "In public health and clinical nutrition, what does the epidemiological term 'Hidden Hunger' specifically refer to?",
            listOf("कैलोरी पर्याप्त मिलने के बावजूद आहार में आवश्यक विटामिनों एवं खनिजों (Micronutrients) की गंभीर कमी होना", "पेट का खाली रहना", "भूख न लगना", "अत्यधिक उपवास करना"),
            listOf("Micronutrient Malnutrition (Deficiency of essential vitamins and trace minerals despite consuming adequate energy calories)", "Physical starvation", "Anorexia nervosa", "Religious fasting"),
            0,
            "छिपी हुई भूख (Hidden Hunger) वह स्थिति है जब व्यक्ति पर्याप्त चावल या रोटी खाकर पेट तो भर लेता है, लेकिन उसके भोजन में विटामिन-ए, आयरन, जिंक, आयोडीन और B12 जैसे सूक्ष्म पोषक तत्वों की कमी रह जाती है, जिससे प्रतिरोधक क्षमता और मानसिक विकास घट जाता है।",
            "Hidden hunger occurs when dietary energy intake satisfies macronutrient satiety thresholds but lacks essential bioavailable micronutrients required for enzyme catalysis, immunity, and endocrine regulation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q12", "sci_9",
            "चाय की पत्ती में पुरानी/इस्तेमाल की गई पत्तियों को रंगने के लिए मिलाए जाने वाले किस जहरीले खनिज वर्णक का पता मैग्नेट (चुंबक) से लगाया जाता है?",
            "Which magnetic iron particulate adulterant, fraudulently added to increase weight in commercial processed tea leaves, is readily extracted and detected using a powerful bar magnet?",
            listOf("लोहे का बुरादा / आयरन फिलिंग्स (Iron Fillings)", "कोयले का पाउडर", "लकड़ी का बुरादा", "मिट्टी"),
            listOf("Iron Filings (Magnet attracts fine iron filings when moved gently across a thin layer of tea leaves)", "Charcoal powder", "Sawdust", "Clay soil"),
            0,
            "चाय की पत्ती को सफेद कागज पर फैलाकर ऊपर चुंबक (Magnet) घुमाने पर यदि काले कण चुंबक से चिपक जाएं, तो उसमें लोहे का बुरादा (Iron filings) मिलाया गया है। FSSAI ने चाय में लोहे के बुरादे की अधिकतम सीमा 250 mg/kg तय की है।",
            "Ferromagnetic iron dust particles added during roller processing or deliberately for weight enhancement are magnetically separated and quantitated under statutory FSSAI tea quality standards.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q13", "sci_9",
            "ताजे हरे मटर (Green Peas) को अप्राकृतिक रूप से हरा और चमकदार दिखाने हेतु मिलाए जाने वाले किस जहरीले धातु रंजक (Dye) का उपयोग पूरी तरह प्रतिबंधित है?",
            "Which toxic, carcinogenic chemical dye fraudulently added to stale green peas and leafy vegetables to impart a vibrant green appearance turns water green when washed?",
            listOf("मैलाकाइट ग्रीन (Malachite Green Dye)", "क्लोरोफिल", "सिट्रिक एसिड", "नील"),
            listOf("Malachite Green (Triphenylmethane synthetic dye historically used as textile stain and aquaculture fungicide)", "Chlorophyll", "Citric acid", "Prussian blue"),
            0,
            "मैलाकाइट ग्रीन एक जहरीला रसायन है जो कैंसर और डीएनए म्यूटेशन करता है। हरे मटर को पानी में हिलाने पर यदि पानी तुरंत हरा हो जाए, तो उसमें मैलाकाइट ग्रीन मिलाया गया है।",
            "Malachite green is a cytotoxic triarylmethane dye that bioaccumulates in human tissues, metabolizing into leucomalachite green which induces hepatic adenomas and chromosomal aberrations.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m7_q14", "sci_9",
            "शुद्ध घी और मक्खन में 'वनस्पति तेल' या 'डालडा' (Vanaspati) की मिलावट का पता लगाने के लिए कौन-सा प्रसिद्ध रंग परीक्षण किया जाता है जिसमें हाइड्रोक्लोरिक एसिड और चीनी मिलाई जाती है?",
            "Which colorimetric test using concentrated Hydrochloric Acid and 1% Furfural / Sugar solution (turning crimson red) detects sesame oil present in adulterated Vanaspati ghee?",
            listOf("बौडोइन टेस्ट (Baudouin Test)", "बाययूरेट टेस्ट", "फेलिंग टेस्ट", "मिलन टेस्ट"),
            listOf("Baudouin Test (Furfural reacts with sesamol present in statutory sesame oil of Vanaspati to give persistent crimson-red color)", "Biuret Test (Proteins)", "Fehling's Test (Reducing sugars)", "Millon's Test (Tyrosine)"),
            0,
            "बौडोइन टेस्ट (Baudouin Test) में 5 ml घी में 5 ml सांद्र HCl और 2-3 बूंदें चीनी/फरफ्यूराल घोल की मिलाकर हिलाने पर 5 मिनट में यदि नीचे की परत गहरा लाल/गुलाबी (Crimson Red) हो जाए, तो उसमें डालडा (वनस्पति) मिलाया गया है।",
            "The Indian government mandates that all hydrogenated vanaspati must contain at least 5% sesame oil; the Baudouin test exploits the condensation of sesame oil's sesamol phenolic ether with furfural in acid medium.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m7_q15", "sci_9",
            "चांदी के वर्क (Silver Foil / Chandi ka Warq - मिठाइयों पर लगने वाला वर्क) में जहरीले 'एल्यूमीनियम' की मिलावट का पता लगाने के लिए वर्क को आग में जलाने पर शुद्ध चांदी का वर्क कैसा हो जाता है?",
            "To detect toxic Aluminum foil adulteration in edible Silver Foil (Chandi ka Warq) on Indian sweets, what happens when pure Silver Foil is ignited directly over a flame?",
            listOf("शुद्ध चांदी का वर्क तुरंत सिकुड़कर एक छोटी चमकदार चांदी की गोली बन जाता है (Pure silver instantly fuses into a bright metallic ball)", "काला धुआं निकलता है और राख बन जाता है", "नीली लौ से जलता है", "विस्फोट होता है"),
            listOf("Pure silver foil instantly collapses and melts into a tiny glistening silver ball without burning into black ash (Aluminum burns into black powder)", "Emits toxic black smoke and ash", "Burns with green-blue flame", "Explodes"),
            0,
            "शुद्ध चांदी का वर्क आग में जलाने पर जलता नहीं बल्कि पिघलकर एक छोटी चमकीली चांदी की गोली बन जाता है। यदि वर्क एल्युमीनियम का हो, तो वह काली राख बन जाएगा। इसके अलावा सूंघने पर या अंगूठे पर रगड़ने पर शुद्ध चांदी का वर्क गायब हो जाता है।",
            "Pure elemental silver (purity >99.9% as mandated by FSSAI) exhibits high thermal conductivity and noble metal resistance to atmospheric oxidation, whereas aluminum rapidly oxidizes to dark gray Al2O3 powder.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 8: Food Preservation, Pasteurization & Gut Microbiome (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m8_q1", "sci_9",
            "दूध के पाश्चुरीकरण (Pasteurization of Milk) की खोज 1864 में किस महान फ्रांसीसी वैज्ञानिक ने की थी?",
            "Who pioneered the scientific technique of Milk Pasteurization in 1864 to destroy pathogenic vegetative bacteria (such as Mycobacterium and Salmonella) without altering milk quality?",
            listOf("लुई पाश्चर (Louis Pasteur)", "रॉबर्ट कोच", "एडवर्ड जेनर", "जोसेफ लिस्टर"),
            listOf("Louis Pasteur (French microbiologist and chemist)", "Robert Koch", "Edward Jenner", "Joseph Lister"),
            0,
            "लुई पाश्चर ने पाया कि दूध या वाइन को निश्चित तापमान पर गर्म करके अचानक ठंडा करने से टीबी, टाइफाइड और ब्रुसेलोसिस फैलाने वाले हानिकारक रोगाणु नष्ट हो जाते हैं और दूध लंबे समय तक सुरक्षित रहता है।",
            "Louis Pasteur demonstrated that thermal processing kills heat-sensitive pathogenic vegetative micro-organisms via enzyme denaturation without precipitating total milk protein coagulation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q2", "sci_9",
            "व्यावसायिक दूध पाश्चुरीकरण में 'हाई-टेम्परेचर शॉर्ट-टाइम' (HTST Method) के अंतर्गत दूध को किस तापमान पर कितने समय तक गर्म किया जाता है?",
            "In modern commercial continuous High-Temperature Short-Time (HTST) milk pasteurization, milk is heated to which precise temperature and held for how many seconds?",
            listOf("71.7°C (या 72°C) पर 15 सेकंड के लिए (71.7°C for 15 seconds, followed by rapid cooling to <4°C)", "100°C पर 1 घंटा", "50°C पर 10 सेकंड", "150°C पर 5 मिनट"),
            listOf("71.7°C (161°F) for at least 15 seconds, immediately chilled to below 4°C", "100°C for 60 minutes", "50°C for 10 seconds", "150°C for 5 minutes"),
            0,
            "पाश्चुरीकरण की दो विधियां हैं: 1. LTLT (होल्डर विधि): 62.8°C पर 30 मिनट। 2. HTST (फ्लैश विधि): 71.7°C पर 15 सेकंड गर्म करके तुरंत 4°C से नीचे ठंडा करना। 3. UHT (अल्ट्रा-हाई): 135-140°C पर 2-3 सेकंड (टेट्रा पैक दूध हेतु)।",
            "HTST continuous plate heat exchangers guarantee a 5-log reduction (99.999%) in Coxiella burnetii and Mycobacterium tuberculosis while preserving organoleptic properties.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q3", "sci_9",
            "अचार (Pickles) और मुरब्बे में नमक और चीनी का उच्च सांद्रण सूक्ष्मजीवों (Bacteria/Fungi) को किस जैविक प्रक्रिया द्वारा नष्ट करता है?",
            "High concentrations of Salt (in pickling, 15-20%) and Sugar (in jams/jellies, 65-70%) preserve food by destroying microbial cells through which biophysical mechanism?",
            listOf("बहिःपरासरण एवं जीवद्रव्यकुंचन (Exosmosis & Plasmolysis - drawing water out of bacterial cells)", "ऑक्सीकरण", "तापमान बढ़ाना", "एंजाइम बनाना"),
            listOf("Exosmosis and Plasmolysis (Hypertonic medium dehydrates microbial cytoplasm, shrinking protoplasts and arresting metabolic enzymes)", "Chemical oxidation", "Thermal denaturation", "De novo enzyme synthesis"),
            0,
            "नमक या चीनी का गाढ़ा घोल एक अतिपरासारी (Hypertonic) माध्यम बनाता है। जब कोई बैक्टीरिया या फंगस इसमें आता है, तो परासरण (Osmosis) द्वारा बैक्टीरिया के अंदर का सारा पानी बाहर निकल जाता है और उसका जीवद्रव्य सिकुड़कर मर जाता है (जीवद्रव्यकुंचन / Plasmolysis)।",
            "Hypertonic sugar/salt solutions lower microbial water activity (aw < 0.85), driving water out across semipermeable bacterial phospholipid membranes via osmoconcentration gradients.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q4", "sci_9",
            "सॉस, जैम, जेली और फलों के रस में व्यापक रूप से इस्तेमाल होने वाला प्रसिद्ध रासायनिक परिरक्षक (Food Preservative) 'सोडियम बेंजोएट' (Sodium Benzoate) का सूत्र क्या है?",
            "Which widely utilized acidic chemical food preservative (E211) effectively inhibits molds, yeasts, and bacteria in fruit juices, carbonated beverages, and tomato ketchups?",
            listOf("सोडियम बेंजोएट (Sodium Benzoate - C6H5COONa)", "सोडियम क्लोराइड", "कैल्शियम कार्बोनेट", "पोटेशियम सल्फेट"),
            listOf("Sodium Benzoate (C6H5COONa - Most active in acidic foods at pH < 4.5)", "Sodium chloride", "Calcium carbonate", "Potassium sulfate"),
            0,
            "सोडियम बेंजोएट अम्लीय खाद्य पदार्थों (pH 2.5-4.0) में अन-आयनित बेंजोइक एसिड बनाता है जो फफूंद और खमीर की कोशिका में घुसकर फॉस्फोफ्रुक्टोकाइनेज एंजाइम को रोक देता है। FSSAI ने इसकी अधिकतम सीमा 750 ppm तय की है।",
            "Sodium benzoate dissociates into undissociated lipophilic benzoic acid in acidic media, diffusing across fungal cell membranes to acidify interior cytoplasm and inhibit glycolysis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q5", "sci_9",
            "आलू के चिप्स के पैकेटों में चिप्स को कुरकुरा रखने और वसा के ऑक्सीकरण (Rancidity / विकृतगंधिता) को रोकने के लिए कौन-सी अक्रिय गैस भरी जाती है?",
            "Which unreactive, inert gas is flushed into sealed potato chip snack bags to displace atmospheric oxygen and prevent oxidative lipid rancidity and sogginess?",
            listOf("नाइट्रोजन गैस (Nitrogen Gas - N2 Flushing)", "ऑक्सीजन गैस", "क्लोरीन गैस", "हाइड्रोजन गैस"),
            listOf("Nitrogen Gas (N2 - Dry, non-reactive atmospheric gas creating a protective cushion and oxygen-free modified atmosphere)", "Oxygen gas (Accelerates rancidity)", "Chlorine gas", "Hydrogen gas"),
            0,
            "चिप्स में मौजूद तेल हवा की ऑक्सीजन से क्रिया करके बदबूदार (Rancid) न हो, इसलिए पैकेट से हवा निकालकर अक्रिय 'नाइट्रोजन गैस' (N2) भर दी जाती है जो कुशन का काम भी करती है जिससे चिप्स टूटते नहीं।",
            "Modified Atmosphere Packaging (MAP) using dry high-purity Nitrogen gas displaces reactive atmospheric O2, arresting lipid autoxidation and off-flavor aldehyde/ketone generation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q6", "sci_9",
            "दूध से 'दही' (Curd / Yogurt) जमाने के लिए कौन-सा जीवाणु उत्तरदायी होता है जो दूध की लैक्टोज शर्करा को लैक्टिक एसिड में बदल देता है?",
            "Which beneficial probiotic lactic acid bacterium (LAB) ferments lactose milk sugar into lactic acid, lowering pH and coagulating milk protein into delicious Curd?",
            listOf("लैक्टोबैसिलस एसिडोफिलस / स्ट्रेप्टोकोकस लैक्टिस (Lactobacillus acidophilus / L. bulgaricus)", "ई. कोलाई", "साल्मोनेला", "विब्रियो"),
            listOf("Lactobacillus acidophilus / Streptococcus thermophilus / Lacticaseibacillus", "Escherichia coli", "Salmonella enterica", "Vibrio cholerae"),
            0,
            "लैक्टोबैसिलस बैक्टीरिया दूध की लैक्टोज को लैक्टिक एसिड में बदलता है। अम्ल बनने से दूध का pH 4.5 पर आ जाता है जिससे कैसीन प्रोटीन जम जाता है और दही बन जाती है। दही में विटामिन B12 भी बढ़ जाता है।",
            "Lactobacilli conduct homofermentative lactic acid glycolysis, generating L-lactate which destabilizes the steric repulsive barrier of kappa-casein micelles to form a viscoelastic curd gel.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q7", "sci_9",
            "प्रोबायोटिक्स (Probiotics) और प्रीबायोटिक्स (Prebiotics) में क्या मुख्य अंतर होता है?",
            "In functional gastrointestinal nutrition, what is the precise scientific distinction between 'Probiotics' and 'Prebiotics'?",
            listOf("प्रोबायोटिक्स जीवित लाभकारी सूक्ष्मजीव हैं, जबकि प्रीबायोटिक्स उन सूक्ष्मजीवों का गैर-पचने योग्य आहार (फाइबर) हैं", "दोनों एक ही हैं", "प्रोबायोटिक्स दवाएं हैं और प्रीबायोटिक्स रोग हैं", "प्रोबायोटिक्स केवल मृत बैक्टीरिया हैं"),
            listOf("Probiotics are Live beneficial gut microorganisms (e.g., Lactobacillus, Bifidobacteria); Prebiotics are Non-digestible dietary fibers (e.g., Inulin, FOS) that nourish them", "They are identical compounds", "Probiotics are toxic chemicals", "Probiotics are dead cellular debris"),
            0,
            "प्रोबायोटिक्स (Probiotics) = जीवित अच्छे बैक्टीरिया (जैसे दही, याकुल्ट, किण्वित पेय)। प्रीबायोटिक्स (Prebiotics) = आंत के अच्छे बैक्टीरिया का भोजन (जैसे लहसुन, प्याज, केला, जई में मौजूद इनुलिन और फ्रुक्टो-ऑलिगोसैकेराइड्स)। दोनों का मिश्रण 'सिनबायोटिक्स' (Synbiotics) कहलाता है।",
            "Probiotics are live microbial supplements that confer health benefits to the host; Prebiotics are selectively fermented dietary ingredients (inulin, fructo-oligosaccharides) that stimulate growth of beneficial colonic taxa.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q8", "sci_9",
            "मानव आंत में पाए जाने वाले खरबों सूक्ष्मजीवों के पारिस्थितिकी तंत्र को क्या कहा जाता है जिसे शरीर का 'दूसरा मस्तिष्क' (Second Brain) भी माना जाता है?",
            "The vast symbiotic ecosystem of over 100 trillion microbes inhabiting the human gastrointestinal tract is scientifically designated as:",
            listOf("मानव आंत माइक्रोबायोम (Human Gut Microbiome / Gut Microflora)", "माइटोकॉन्ड्रिया", "लाइसोसोम", "साइटोप्लाज्म"),
            listOf("Human Gut Microbiome (Gut-Brain Axis producing Serotonin, SCFAs, and Neurotransmitters)", "Mitochondrial network", "Lysosomal matrix", "Cytoplasmic matrix"),
            0,
            "मानव आंत माइक्रोबायोम में 1000 से अधिक बैक्टीरिया प्रजातियां होती हैं। यह शरीर का 90% सेरोटोनिन (खुशी का हार्मोन) बनाता है, विटामिन K और B बनाता है, और आंत-मस्तिष्क अक्ष (Gut-Brain Axis) द्वारा मानसिक स्वास्थ्य को नियंत्रित करता है।",
            "The human gut microbiome acts as an endocrine/immunological organ, fermenting non-digestible carbs into short-chain fatty acids (acetate, propionate, butyrate) that signal through GPCR41/43 receptors.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q9", "sci_9",
            "खाद्य पदार्थों को हानिकारक बैक्टीरिया से मुक्त रखने हेतु 'कोल्ड पाश्चुरीकरण' (Cold Pasteurization) के रूप में किस विकिरण तकनीक का उपयोग किया जाता है?",
            "Which non-thermal food preservation method (Food Irradiation) utilizes ionizing radiation (Gamma rays from Cobalt-60 or electron beams) to sterilize spices, onions, and potatoes?",
            listOf("खाद्य विकिरण / आयनकारी विकिरण (Food Irradiation / Gamma Irradiation)", "पराबैंगनी किरणें केवल", "माइक्रोवेव हीटिंग", "अवरक्त किरणें"),
            listOf("Food Irradiation (Cobalt-60 gamma rays / Cesium-137 / Electron beam accelerators breaking microbial DNA without making food radioactive)", "Ultraviolet rays only", "Microwave thermalization", "Infrared radiation"),
            0,
            "खाद्य विकिरण में प्याज, आलू (अंकुरण रोकने हेतु), मसालों और मांस पर नियंत्रित मात्रा में कोबाल्ट-60 की गामा किरणें डाली जाती हैं जो रोगाणुओं के डीएनए को तोड़ देती हैं। इससे भोजन कभी रेडियोधर्मी नहीं बनता। इस पर 'राडुरा' (Radura) अंतरराष्ट्रीय लोगो लगता है।",
            "Ionizing radiation generates radiolytic hydroxyl free radicals that induce single- and double-strand DNA scissions in contaminating Salmonella and Listeria, extending shelf life safely.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m8_q10", "sci_9",
            "आहार में चीनी के विकल्प के रूप में इस्तेमाल होने वाला 'एस्पार्टेम' (Aspartame / कृत्रिम मिठास) किस आनुवंशिक बीमारी से पीड़ित रोगियों के लिए खतरनाक होता है?",
            "The artificial non-caloric sweetener Aspartame (Equal / NutraSweet) must carry a mandatory statutory health warning for patients suffering from which genetic metabolic disorder?",
            listOf("फेनिलकेटोन्यूरिया (Phenylketonuria - PKU patients unable to metabolize Phenylalanine)", "मधुमेह (Diabetes)", "गठिया", "रिकेट्स"),
            listOf("Phenylketonuria (Aspartame hydrolyzes in gut into toxic phenylalanine, aspartic acid, and methanol)", "Diabetes Mellitus", "Gout", "Rickets"),
            0,
            "एस्पार्टेम एक मिथाइल एस्टर डाईपेप्टाइड (एस्पार्टिक एसिड + फेनिलएलनिन) है। PKU के मरीज फेनिलएलनिन को पचा नहीं सकते, जिससे उनके दिमाग में जहर जमा हो सकता है। इसलिए एस्पार्टेम वाले उत्पादों पर 'कंटेन्स फेनिलएलनिन' चेतावनी अनिवार्य होती है।",
            "Aspartame (L-aspartyl-L-phenylalanine methyl ester) is enzymatically cleaved in the intestinal lumen, liberating free phenylalanine which can cross the blood-brain barrier to cause neurotoxicity in PKU patients.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m8_q11", "sci_9",
            "मधुमेह रोगियों हेतु इस्तेमाल की जाने वाली सबसे पुरानी कृत्रिम मिठास 'सैकरीन' (Saccharin) चीनी (सुक्रोज) की तुलना में लगभग कितने गुना अधिक मीठी होती है?",
            "Discovered by Remsen and Fahlberg in 1879, how many times sweeter is the artificial non-nutritive sweetener Saccharin (o-sulfobenzoic imide) compared to standard cane sucrose sugar?",
            listOf("लगभग 300 से 500 गुना अधिक मीठी (Approx 300 to 500 times sweeter than sucrose)", "2 गुना", "10 गुना", "5000 गुना"),
            listOf("300 to 500 times sweeter (Zero glycemic index, excreted unchanged in urine)", "2 times", "10 times", "5000 times"),
            0,
            "सैकरीन (Saccharin) चीनी से 300-500 गुना अधिक मीठी होती है और शरीर में बिना पचे मूत्र द्वारा निकल जाती है (शून्य कैलोरी)। सुक्रालोज़ (Sucralose / Sugar Free) चीनी से 600 गुना मीठा और गर्मी-स्थिर होता है। एलिटेम 2000 गुना मीठा होता है।",
            "Saccharin binds with immense affinity to human sweet taste receptors T1R2/T1R3; because human enzymes cannot hydrolyze the sulfonamide core, it yields zero metabolic energy.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q12", "sci_9",
            "अत्यधिक शराब के निर्माण और सेवन में 'अवैध जहरीली शराब' (Illicit Hooch / जहरीली शराब त्रासदी) में कौन-सा अत्यंत विषैला अल्कोहल होता है जो अंधापन और मृत्यु का कारण बनता है?",
            "In lethal illicit moonshine / hooch tragedies, which adulterated or improperly distilled toxic alcohol is metabolized by liver alcohol dehydrogenase into formic acid, causing permanent blindness and death?",
            listOf("मेथनॉल / मिथाइल अल्कोहल / वुड स्पिरिट (Methanol / Methyl Alcohol - CH3OH)", "एथेनॉल (पीने योग्य शराब)", "ग्लिसरॉल", "आइसोप्रोपिल अल्कोहल"),
            listOf("Methanol (Wood Alcohol - CH3OH metabolized to formaldehyde and highly cytotoxic Formic Acid)", "Ethanol (Drinking alcohol - C2H5OH)", "Glycerol", "Isopropyl alcohol"),
            0,
            "मेथनॉल (CH3OH) को यकृत का अल्कोहल डीहाइड्रोजनेज एंजाइम 'फॉर्मेल्डिहाइड' और 'फॉर्मिक एसिड' में बदल देता है। फॉर्मिक एसिड आंखों की ऑप्टिक नर्व को नष्ट कर तुरंत अंधा कर देता है और एसिडोसिस से जान ले लेता है। इसके इलाज में 'एथेनॉल' या 'फोमेपिजोल' एंटीडोट दिया जाता है।",
            "Methanol oxidation produces formic acid which selectively inhibits mitochondrial cytochrome-c oxidase in optic nerve axonal fibers, precipitating histotoxic retinal hypoxia, optic disc edema, and metabolic acidosis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q13", "sci_9",
            "फलों को प्राकृतिक रूप से पकाने वाला पादप हार्मोन कौन-सा है और कृत्रिम रूप से पकाने हेतु किस प्रतिबंधित रसायन (कारबाइड) का उपयोग गैरकानूनी है?",
            "Which gaseous phytohormone naturally ripens fruits, and which hazardous, arsenic-contaminated chemical compound (Banned by FSSAI) is illegally used for artificial fruit ripening?",
            listOf("प्राकृतिक: एथिलीन गैस; कृत्रिम प्रतिबंधित: कैल्शियम कार्बाइड (Natural: Ethylene; Banned artificial: Calcium Carbide - CaC2)", "प्राकृतिक: ऑक्सिन; कृत्रिम: यूरिया", "प्राकृतिक: जिबरेलिन; कृत्रिम: डीडीटी", "प्राकृतिक: साइटोकाइनिन; कृत्रिम: फिनाइल"),
            listOf("Natural ripening gas: Ethylene (C2H4); Banned artificial ripener: Calcium Carbide (Masala / CaC2 releasing toxic Acetylene and Arsenic hydride)", "Auxin and Urea", "Gibberellin and DDT", "Cytokinin and Phenol"),
            0,
            "फलों का प्राकृतिक पकने वाला हार्मोन 'एथिलीन' (Ethylene) गैस है। व्यापारी सस्ते में पकाने हेतु 'कैल्शियम कार्बाइड' (मसाला) डालते हैं जो नमी से क्रिया करके 'एसिटिलीन' गैस बनाता है। इसमें आर्सेनिक और फास्फोरस की अशुद्धियां होने के कारण FSSAI ने इस पर पूर्ण प्रतिबंध लगाया है।",
            "Calcium carbide reacts with atmospheric moisture to release acetylene (C2H2) gas along with carcinogenic traces of arsenic hydride and phosphine, strictly prohibited under Regulation 2.3.5 of FSS Act.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q14", "sci_9",
            "सिरका (Vinegar) में मुख्य रूप से कौन-सा कार्बनिक अम्ल 4% से 8% की सांद्रता में पाया जाता है जो अचार और सलाद के परिरक्षण में काम आता है?",
            "Commercial Table Vinegar, an essential culinary condiment and natural preservative, is chemically an aqueous solution of 4% to 8% of which organic carboxylic acid?",
            listOf("एसिटिक अम्ल / एथेनॉइक अम्ल (Acetic Acid / Ethanoic Acid - CH3COOH)", "सिट्रिक अम्ल", "टार्टरिक अम्ल", "फॉर्मिक अम्ल"),
            listOf("Acetic Acid / Ethanoic Acid (CH3COOH produced via Acetobacter bacterial fermentation of ethanol)", "Citric acid", "Tartaric acid", "Formic acid"),
            0,
            "सिरका (Vinegar) गन्ने के रस या फलों के अल्कोहल पर 'एसिटोबैक्टर' जीवाणु के किण्वन से बनाया जाता है। इसमें 4-8% एसिटिक एसिड होता है जो बैक्टीरिया की वृद्धि को रोककर खाद्य पदार्थों को खराब होने से बचाता है।",
            "Vinegar is produced by a two-stage fermentation: yeast conversion of sugars to ethanol followed by Acetobacter aceti aerobic oxidation of ethanol into dilute ethanoic acid (CH3COOH).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m8_q15", "sci_9",
            "अंडों (Eggs) को उबलने पर उनकी सफेदी (Egg White) का तरल से ठोस में बदलना प्रोटीन की किस संरचनात्मक परिवर्तन का उदाहरण है?",
            "When an egg is boiled, the translucent liquid egg white transforms into an opaque solid white mass due to which biochemical process affecting Albumin proteins?",
            listOf("प्रोटीन का विकृतीकरण (Denaturation of Proteins - disruption of secondary & tertiary structures)", "हाइड्रोजनीकरण", "किण्वन", "पायसीकरण"),
            listOf("Protein Denaturation and Coagulation (Thermal rupture of hydrogen and ionic bonds uncoiling ovalbumin tertiary structures into an insoluble gel matrix)", "Hydrogenation", "Fermentation", "Emulsification"),
            0,
            "उबालने पर उच्च तापमान से अंडे के एल्ब्यूमिन प्रोटीन के हाइड्रोजन बंध और तृतीयक संरचना टूट जाती है (विकृतीकरण / Denaturation), जिससे प्रोटीन की मुड़ी हुई श्रृंखलाएं खुलकर आपस में उलझ जाती हैं और ठोस थक्का (Coagulation) बना लेती हैं।",
            "Thermal energy disrupts weak non-covalent interactions (hydrogen bonds, salt bridges, hydrophobic bonds) stabilizing native ovalbumin, exposing hydrophobic residues that aggregate irreversibly into a rigid protein network.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 9: Nutritional Deficiencies, Public Health Schemes & POSHAN (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m9_q1", "sci_9",
            "भारत सरकार द्वारा 8 मार्च 2018 को राजस्थान के झुंझुनू से शुरू किए गए 'राष्ट्रीय पोषण मिशन' का लोकप्रिय नाम क्या है?",
            "What is the official operational designation of the Government of India's flagship multi-ministerial convergence mission launched on International Women's Day 2018 to eradicate malnutrition?",
            listOf("पोषण अभियान / पोषण 2.0 (POSHAN Abhiyaan - Prime Minister's Overarching Scheme for Holistic Nourishment)", "मिड डे मील", "मिशन इंद्रधनुष", "आयुष्मान भारत"),
            listOf("POSHAN Abhiyaan (PM's Overarching Scheme for Holistic Nutrition / Mission POSHAN 2.0 under Ministry of Women and Child Development)", "Mid-Day Meal Scheme", "Mission Indradhanush", "Ayushman Bharat"),
            0,
            "पोषण अभियान (POSHAN Abhiyaan) बच्चों (0-6 वर्ष), गर्भवती महिलाओं और स्तनपान कराने वाली माताओं में बौनापन (Stunting), अल्पपोषण (Underweight), एनीमिया और जन्म के समय कम वजन (LBW) को प्रतिवर्ष 2% से 3% घटाने का राष्ट्रीय मिशन है।",
            "POSHAN Abhiyaan leverages technology (POSHAN Tracker ICT platform), convergence of frontline Anganwadi workers, and Jan Andolan behavioral change campaigns to improve nutritional outcomes nationwide.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q2", "sci_9",
            "ग्लोबल हंगर इंडेक्स (Global Hunger Index - GHI) की गणना किन चार प्रमुख संकेतकों (Indicators) के आधार पर की जाती है?",
            "The annual Global Hunger Index (GHI) report calculates multidimensional hunger scores across nations based on which four core indicators?",
            listOf("अल्पपोषण (Undernourishment), बाल बौनापन (Stunting), बाल क्षीणता/दुबलापन (Wasting), एवं बाल मृत्यु दर (Child Mortality)", "केवल प्रति व्यक्ति आय", "केवल अनाज उत्पादन", "केवल जन्म दर"),
            listOf("Undernourishment (Calorie deficit), Child Stunting (Low height-for-age), Child Wasting (Low weight-for-height), and Child Mortality (Under-5 mortality rate)", "Per capita GDP only", "Total grain output only", "Birth rate only"),
            0,
            "GHI में चार संकेतक होते हैं: 1. अल्पपोषण (जनसंख्या में अपर्याप्त कैलोरी), 2. चाइल्ड स्टंटिंग (उम्र के अनुसार कम लंबाई - दीर्घकालिक कुपोषण), 3. चाइल्ड वेस्टिंग (लंबाई के अनुसार कम वजन - तीव्र कुपोषण), 4. 5 वर्ष से कम बाल मृत्यु दर।",
            "Global Hunger Index combines standardized proportions of population undernourishment, under-5 child stunting (chronic malnutrition), child wasting (acute malnutrition), and under-5 child mortality into a 100-point severity scale.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q3", "sci_9",
            "बच्चों में कुपोषण के दो रूपों 'स्टंटिंग' (Stunting) और 'वेस्टिंग' (Wasting) का शारीरिक अर्थ क्या है?",
            "In public health anthropometry, what are the precise clinical definitions of 'Child Stunting' and 'Child Wasting' respectively?",
            listOf("स्टंटिंग: आयु के अनुसार कम लंबाई (Height-for-Age); वेस्टिंग: लंबाई के अनुसार अत्यंत कम वजन (Weight-for-Height)", "स्टंटिंग: अधिक वजन; वेस्टिंग: अधिक लंबाई", "दोनों एक ही हैं", "स्टंटिंग केवल दांतों का रोग है"),
            listOf("Stunting: Low Height-for-Age (< -2 SD, Chronic Linear Growth Arrest); Wasting: Low Weight-for-Height (< -2 SD, Acute Severe Muscle & Fat Loss)", "Stunting: Obesity; Wasting: Gigantism", "Both are identical", "Stunting is tooth loss"),
            0,
            "स्टंटिंग (Stunting) = उम्र के हिसाब से बच्चे की लंबाई न बढ़ना (दीर्घकालिक पोषण की कमी)। वेस्टिंग (Wasting) = लंबाई के हिसाब से वजन बहुत कम और हड्डियां दिखना (तत्काल बीमारी या भुखमरी से तीव्र कुपोषण)।",
            "Stunting reflects cumulative linear skeletal growth failure due to prolonged maternal/infant undernutrition; wasting indicates acute, life-threatening weight loss from infection or food deprivation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q4", "sci_9",
            "सरकारी और सहायता प्राप्त प्राथमिक विद्यालयों में बच्चों के पोषण स्तर और नामांकन को बढ़ाने वाली 'पीएम-पोषण' (PM-POSHAN / पूर्व में मिड-डे मील योजना) की शुरुआत भारत में किस वर्ष हुई थी?",
            "In which historic year was the nationwide National Programme of Nutritional Support to Primary Education (Mid-Day Meal Scheme, now PM POSHAN) launched by the Government of India?",
            listOf("15 अगस्त 1995 (15 August 1995)", "2005", "2014", "1980"),
            listOf("15 August 1995 (Centrally sponsored scheme providing hot cooked balanced lunch meals to school children)", "2005", "2014", "1980"),
            0,
            "मिड-डे मील योजना 15 अगस्त 1995 को शुरू हुई थी। तमिलनाडु देश का पहला राज्य था जिसने 1960 के दशक में के. कामराज के नेतृत्व में इसे शुरू किया था। 2021 में इसका नाम बदलकर 'पीएम-पोषण' (PM-POSHAN) कर दिया गया और इसमें बालवाटिका (पूर्व-प्राथमिक) को भी शामिल किया गया।",
            "PM POSHAN scheme covers over 120 million schoolchildren from pre-primary to Grade VIII, guaranteeing minimum nutritional norms of 450 kcal and 12g protein (Primary) and 700 kcal and 20g protein (Upper Primary).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q5", "sci_9",
            "भारत सरकार द्वारा प्रतिवर्ष सितंबर माह को किस राष्ट्रीय जागरूकता माह के रूप में मनाया जाता है?",
            "The entire month of September is observed nationwide every year across India by the Ministry of Women and Child Development as:",
            listOf("राष्ट्रीय पोषण माह (Rashtriya Poshan Maah)", "राष्ट्रीय स्वच्छता माह", "राष्ट्रीय डिजिटल साक्षरता माह", "सड़क सुरक्षा माह"),
            listOf("Rashtriya Poshan Maah (National Nutrition Month under POSHAN Abhiyaan)", "National Sanitation Month", "Digital Literacy Month", "Road Safety Month"),
            0,
            "पोषण अभियान के तहत जन-आंदोलन बनाने हेतु हर साल 1 से 30 सितंबर तक 'राष्ट्रीय पोषण माह' (Rashtriya Poshan Maah) और मार्च में 'पोषण पखवाड़ा' मनाया जाता है।",
            "Poshan Maah mobilizes multi-sectoral community campaigns focusing on exclusive breastfeeding, complementary feeding, growth monitoring, dietary diversity, and Poshan Vatikas (Nutri-gardens).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q6", "sci_9",
            "आंगनवाड़ी केंद्रों (Anganwadi Centres) के माध्यम से 6 वर्ष तक के बच्चों, गर्भवती व धात्री महिलाओं को पोषण व स्वास्थ्य सेवाएं प्रदान करने वाली ऐतिहासिक योजना 'ICDS' किस वर्ष शुरू की गई थी?",
            "Integrated Child Development Services (ICDS - one of the world's largest flagship early childhood care programmes) was launched on Gandhi Jayanti in which year?",
            listOf("2 अक्टूबर 1975 (2 October 1975)", "1990", "2000", "1965"),
            listOf("2 October 1975 (Providing supplementary nutrition, immunization, health check-up, referral services, and pre-school non-formal education)", "1990", "2000", "1965"),
            0,
            "ICDS योजना 2 अक्टूबर 1975 को शुरू की गई थी। इसके तहत गांव-गांव में आंगनवाड़ी कार्यकर्ता और सहायिकाएं 6 सेवाएं (पूरक पोषाहार, टीकाकरण, स्वास्थ्य जांच, रेफरल सेवाएं, पोषण शिक्षा और पूर्व-प्राथमिक शिक्षा) प्रदान करती हैं।",
            "ICDS operates via frontline Anganwadi workers delivering six core packages to break the intergenerational cycle of maternal and child undernutrition.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q7", "sci_9",
            "गर्भवती महिलाओं को पहले जीवित बच्चे के जन्म पर संस्थागत प्रसव और पोषण हेतु ₹5,000 की प्रत्यक्ष नकद सहायता (DBT) देने वाली योजना कौन-सी है?",
            "Under which maternity benefit conditional cash transfer scheme do eligible pregnant women receive financial assistance of ₹5,000 in bank accounts for wage loss and nutritional support?",
            listOf("प्रधानमंत्री मातृ वंदना योजना (PMMVY - Pradhan Mantri Matru Vandana Yojana)", "जननी सुरक्षा योजना", "सुकन्या समृद्धि योजना", "उज्ज्वला योजना"),
            listOf("Pradhan Mantri Matru Vandana Yojana (PMMVY - Under Mission Shakti, offering ₹5000 for first child and ₹6000 for second girl child)", "Janani Suraksha Yojana", "Sukanya Samriddhi Yojana", "PM Ujjwala Yojana"),
            0,
            "PMMVY योजना 2017 में शुरू हुई थी। इसके तहत गर्भवती महिला को पंजीकरण, प्रसव पूर्व जांच (ANC) और बच्चे के टीकाकरण पर तीन किस्तों में ₹5,000 दिए जाते हैं। जननी सुरक्षा योजना (JSY) के तहत अस्पताल में प्रसव कराने पर ₹1,400 अतिरिक्त मिलते हैं।",
            "PMMVY is a Centrally Sponsored Scheme providing partial wage compensation to pregnant women and lactating mothers to enable adequate rest and improved maternal nutrition during perinatal periods.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q8", "sci_9",
            "राष्ट्रीय परिवार स्वास्थ्य सर्वेक्षण (NFHS-5: 2019-21) के अनुसार भारत में 15 से 49 वर्ष की कितनी प्रतिशत महिलाएं 'एनीमिया' (रक्ताल्पता) से पीड़ित पाई गईं?",
            "According to the National Family Health Survey-5 (NFHS-5: 2019-21) data, what alarming percentage of Indian women aged 15-49 years were found to be Anemic?",
            listOf("लगभग 57% महिलाएं (57.0% of Women aged 15-49 years are Anemic)", "10%", "25%", "85%"),
            listOf("57.0% of all reproductive age women (compared to 53.1% in NFHS-4; 67.1% in children aged 6-59 months)", "10.0%", "25.0%", "85.0%"),
            0,
            "NFHS-5 के आंकड़ों के अनुसार भारत में 15-49 वर्ष की 57% महिलाएं, 52.2% गर्भवती महिलाएं और 6-59 माह के 67.1% बच्चे एनीमिया (खून की कमी) से पीड़ित हैं। इसी कारण सरकार ने 'एनीमिया मुक्त भारत' अभियान तेज किया है।",
            "NFHS-5 revealed high persistence of iron deficiency anemia across India, necessitating fortified rice distribution and universal weekly Iron-Folic Acid supplementation across school and Anganwadi platforms.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q9", "sci_9",
            "गंभीर तीव्र कुपोषण (Severe Acute Malnutrition - SAM) से पीड़ित बच्चों के जीवन रक्षक उपचार हेतु आंगनवाड़ी केंद्रों में किस विशेष खाद्य पेस्ट का उपयोग किया जाता है?",
            "Which ready-to-eat, lipid-based energy-dense therapeutic food paste (RUTF) is administered to treat non-complicated Severe Acute Malnutrition (SAM) in young children?",
            listOf("रेडी-टू-यूज़ थेराप्यूटिक फूड (RUTF - मूंगफली का पेस्ट, दूध पाउडर, चीनी, तेल, विटामिन व खनिजों से युक्त)", "केवल ग्लूकोज पानी", "केवल उबले चावल", "केवल साधारण दूध"),
            listOf("Ready-to-Use Therapeutic Food (RUTF paste providing ~500 kcal/packet with high micronutrient bioavailability without water addition)", "Plain glucose water", "Boiled rice only", "Cow milk only"),
            0,
            "RUTF (जैसे 'प्लंफीनट') मूंगफली, सूखे दूध, वनस्पति तेल, चीनी और 24 आवश्यक विटामिनों व खनिजों से बना एक गाढ़ा पेस्ट है। इसे बिना पानी मिलाए सीधे खाया जा सकता है, जिससे गंभीर कुपोषित बच्चे कुछ ही हफ्तों में ठीक हो जाते हैं।",
            "RUTF is a lipid-rich paste formulated to match F-100 therapeutic milk nutritional profiles, achieving rapid weight gain in SAM infants without requiring water preparation that risks microbial contamination.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q10", "sci_9",
            "भारत में जन्म के समय 'कम वजन' (Low Birth Weight - LBW) का चिकित्सकीय मानक क्या माना जाता है?",
            "In neonatal medicine and public health, a newborn infant is officially classified as having Low Birth Weight (LBW) if the birth weight is less than:",
            listOf("2.5 किलोग्राम से कम (Birth Weight < 2,500 grams / 2.5 kg)", "3.5 किलोग्राम", "4.0 किलोग्राम", "1.5 किलोग्राम"),
            listOf("Less than 2.5 kg (< 2500 grams regardless of gestational age)", "Less than 3.5 kg", "Less than 4.0 kg", "Less than 1.5 kg (Very Low Birth Weight - VLBW)"),
            0,
            "सामान्य नवजात का वजन 2.5 से 3.5 किग्रा होना चाहिए। 2.5 किग्रा से कम वजन वाले बच्चों को 'LBW' (कम वजन का शिशु) माना जाता है जो मां के कुपोषण और एनीमिया का परिणाम होता है। 1.5 किग्रा से कम 'VLBW' और 1.0 किग्रा से कम 'ELBW' कहलाता है।",
            "WHO defines Low Birth Weight as weight at birth of less than 2500g, caused by intrauterine growth restriction (IUGR) or preterm birth, elevating risks of neonatal morbidity and adult non-communicable diseases.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q11", "sci_9",
            "माता-पिता और बच्चों को संतुलित आहार के प्रति जागरूक करने हेतु FSSAI द्वारा चलाए जा रहे 'ईट राइट इंडिया' (Eat Right India) आंदोलन का मुख्य नारा क्या है?",
            "What is the official tripartite motto/tagline of FSSAI's flagship nationwide health movement 'Eat Right India'?",
            listOf("'सही भोजन, बेहतर जीवन' - ईट सेफ, ईट हेल्दी, ईट सस्टेनेबल ('Eat Safe, Eat Healthy, Eat Sustainable')", "केवल मीठा खाओ", "ज्यादा खाओ कम सोओ", "फास्ट फूड खाओ"),
            listOf("'Sahi Bhojan, Behtar Jeevan' (Eat Safe, Eat Healthy, and Eat Sustainable)", "Eat only sweets", "Eat more sleep less", "Fast food daily"),
            0,
            "FSSAI का 'ईट राइट इंडिया' आंदोलन तीन स्तंभों पर आधारित है: 1. सुरक्षित खाएं (खाद्य स्वच्छता), 2. स्वस्थ खाएं (नमक, चीनी और तेल कम करें - 'आज से थोड़ा कम' अभियान), 3. टिकाऊ खाएं (स्थानीय और मौसमी भोजन)।",
            "Eat Right India aligns with the National Health Policy 2017 to shift healthcare focus from curative to preventive healthcare by creating consumer awareness and building regulatory food environments.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q12", "sci_9",
            "अत्यधिक शराब के नशे में रहने वाले लोगों में आहार से किस विटामिन का अवशोषण लगभग बंद हो जाता है जिससे मस्तिष्क में 'वर्निक एन्सेफैलोपैथी' हो जाती है?",
            "In severe chronic alcohol use disorder, ethanol toxicity directly suppresses the active mucosal intestinal transport and hepatic phosphorylation of which vitamin?",
            listOf("विटामिन 'बी1' / थायमिन (Vitamin B1 / Thiamine)", "विटामिन सी", "विटामिन डी", "विटामिन के"),
            listOf("Vitamin B1 (Thiamine - Leading to sudden cerebral micro-vascular petechial hemorrhages in mammillary bodies)", "Vitamin C", "Vitamin D", "Vitamin K"),
            0,
            "शराब आंतों के थायमिन ट्रांसपोर्टर (THTR-1 और THTR-2) को निष्क्रिय कर देती है और यकृत में थायमिन के सक्रिय होने को रोकती है। इसलिए इमरजेंसी में शराबी मरीज को ग्लूकोज चढ़ाने से पहले थायमिन (B1) का इंजेक्शन दिया जाता है।",
            "Ethanol suppresses enterocyte expression of apical thiamine transporter THTR-1 and downregulates thiamine pyrophosphokinase, causing severe acute central neuronal energy collapse upon glucose loading.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m9_q13", "sci_9",
            "बच्चों में सूखा रोग 'मरास्मस' (Marasmus) और 'क्वाशिओरकोर' (Kwashiorkor) में सबसे प्रमुख नैदानिक अंतर क्या है?",
            "What is the hallmark physiological differentiating symptom between childhood Marasmus and Kwashiorkor?",
            listOf("क्वाशिओरकोर में पूरे शरीर में सूजन (Edema) और उभरा हुआ पेट होता है, जबकि मरास्मस में सूजन नहीं होती और बच्चा हड्डियों का ढांचा (Skin and Bones) बन जाता है", "मरास्मस में सूजन होती है", "दोनों में कोई अंतर नहीं है", "क्वाशिओरकोर केवल वृद्धों में होता है"),
            listOf("Kwashiorkor manifests with pitting Edema and pot-belly due to severe protein deficiency with normal calories; Marasmus has No edema and presents with total emaciation (skin-and-bone) due to total calorie-protein starvation", "Marasmus has generalized edema", "Both are identical", "Kwashiorkor occurs only in geriatric patients"),
            0,
            "क्वाशिओरकोर = केवल प्रोटीन की कमी → रक्त में एल्ब्यूमिन खत्म → अंगों में पानी भरना (Edema), फैटी लिवर और सूजा हुआ पेट। मरास्मस = कैलोरी + प्रोटीन दोनों की कमी → शरीर की चर्बी और मांसपेशियां पूरी तरह खत्म → झुर्रीदार चेहरा (Old man face) और कंकाल जैसा शरीर।",
            "Kwashiorkor is characterized by hypoalbuminemic pitting edema, hepatomegaly from impaired VLDL export, and flaky-paint dermatitis; Marasmus features severe subcutaneous fat wasting and muscle catabolism with preserved serum albumin.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q14", "sci_9",
            "भारत में महिलाओं और बच्चों में आयोडीन की कमी से होने वाले विकारों की रोकथाम हेतु 'राष्ट्रीय आयोडीन अल्पता विकार नियंत्रण कार्यक्रम' (NIDDCP) के तहत साधारण नमक में आयोडीन का न्यूनतम स्तर उपभोक्ता स्तर पर कितना अनिवार्य है?",
            "Under the National Iodine Deficiency Disorders Control Programme (NIDDCP), what is the mandatory minimum Iodine concentration in Iodized Salt at the retail/consumer level in India?",
            listOf("15 पीपीएम (15 parts per million / 15 ppm at consumer level; 30 ppm at production level)", "1 पीपीएम", "100 पीपीएम", "500 पीपीएम"),
            listOf("15 ppm (Parts Per Million) at retail/consumer level and 30 ppm at manufacturing/production level (using Potassium Iodate - KIO3)", "1 ppm", "100 ppm", "500 ppm"),
            0,
            "नमक में 'पोटेशियम आयोडेट' (KIO3) मिलाया जाता है। उत्पादन स्तर पर नमक में कम से कम 30 ppm और उपभोक्ता के घर पहुंचने पर कम से कम 15 ppm आयोडीन होना अनिवार्य है ताकि घेंघा और बच्चों में मंदबुद्धिता (Cretinism) को रोका जा सके।",
            "Universal Salt Iodization mandates 30 ppm iodine at production stage to buffer against environmental losses, ensuring households consume salt containing ≥15 ppm iodine to sustain normal thyroid hormonogenesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m9_q15", "sci_9",
            "आहार में 'फाइटोकेमिकल्स' (Phytochemicals - जैसे टमाटर में लाइकोपीन, हल्दी में करक्यूमिन, हरी चाय में EGCG) का मुख्य स्वास्थ्य लाभ क्या है?",
            "What is the primary biological protective health benefit offered by dietary Phytochemicals (such as Lycopene in tomatoes, Curcumin in turmeric, and Epigallocatechin gallate - EGCG in green tea)?",
            listOf("शक्तिशाली एंटीऑक्सीडेंट एवं कैंसर-रोधी गुण (Antioxidant, Anti-inflammatory & Anti-carcinogenic free-radical scavenging)", "कैलोरी ऊर्जा प्रदान करना", "केवल शरीर का वजन बढ़ाना", "दांतों को सफेद करना"),
            listOf("Potent antioxidant, cellular anti-inflammatory, DNA-protective, and antineoplastic properties neutralizing reactive oxygen species (ROS)", "Providing primary caloric fuel", "Purely promoting adiposity", "Teeth whitening only"),
            0,
            "फाइटोकेमिकल्स पौधों द्वारा बनाए जाने वाले गैर-पोषक सुरक्षात्मक जैव-सक्रिय यौगिक हैं। टमाटर का 'लाइकोपीन' प्रोस्टेट कैंसर से बचाता है; हल्दी का 'करक्यूमिन' सूजन घटाता है; और हरी चाय का 'EGCG' दिल और धमनियों की रक्षा करता है।",
            "Non-nutrient plant secondary metabolites modulate signaling pathways (Nrf2 antioxidant response element, NF-kB inhibition, apoptosis induction), mitigating chronic inflammatory mutagenesis and cardiovascular endothelial damage.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 10: Advanced Nutritional Biochemistry & Vitamins Discovery (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_9_m10_q1", "sci_9",
            "चिकित्सा विज्ञान में 'विटामिन' (Vitamin) शब्द का सर्वप्रथम प्रतिपादन 1912 में किस पोलिश बायोकेमिस्ट ने किया था?",
            "Who coined the scientific term 'Vitamine' (Vital Amine) in 1912 after isolating the anti-beriberi nutritional factor from rice polishings?",
            listOf("कासिमिर फंक (Casimir Funk)", "लुई पाश्चर", "अलेक्जेंडर फ्लेमिंग", "एडवर्ड जेनर"),
            listOf("Casimir Funk (Polish biochemist who postulated that deficiency of specific organic 'vitamines' caused beriberi, scurvy, and rickets)", "Louis Pasteur", "Alexander Fleming", "Edward Jenner"),
            0,
            "1912 में कासिमिर फंक (Casimir Funk) ने चावल के छिलके से एक यौगिक निकाला और इसे 'वाइटल एमीन' (Vital Amine) नाम दिया। बाद में देखा गया कि सभी विटामिन में एमीन समूह नहीं होता, इसलिए 'e' हटाकर 'Vitamin' कर दिया गया।",
            "Casimir Funk formulated the revolutionary concept of 'deficiency diseases', proposing that four distinct vital organic micronutrients prevented beriberi, scurvy, pellagra, and rickets.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q2", "sci_9",
            "सूर्य के प्रकाश (पराबैंगनी किरणों) की उपस्थिति में मानव त्वचा में विटामिन 'डी' का संश्लेषण किस रासायनिक यौगिक से होता है?",
            "In human skin epidermis, solar UV-B radiation (290-315 nm wavelength) converts which endogenous precursor sterol into Pre-Vitamin D3?",
            listOf("7-डीहाइड्रोकोलेस्ट्रॉल (7-Dehydrocholesterol)", "एर्गोस्टेरॉल", "बिलीरुबिन", "स्क्वैलीन"),
            listOf("7-Dehydrocholesterol (Pro-vitamin D3 synthesized from cholesterol in the stratum basale and stratum spinosum)", "Ergosterol (Plant fungal precursor)", "Bilirubin", "Squalene"),
            0,
            "त्वचा की बेसल परत में मौजूद '7-डीहाइड्रोकोलेस्ट्रॉल' पराबैंगनी-B किरणों को अवशोषित करके प्री-विटामिन D3 बनाता है, जो शरीर के तापमान पर स्वतः 'कोलेकैल्सिफेरॉल' (D3) में बदल जाता है।",
            "Absorption of UVB photons by the conjugated B-ring diene system of 7-dehydrocholesterol triggers electrocyclic ring opening into secosteroid pre-vitamin D3, followed by thermal isomerization into cholecalciferol.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q3", "sci_9",
            "रक्त के हीमोग्लोबिन के समान मांसपेशियों में ऑक्सीजन को संचित रखने वाले लाल वर्णक प्रोटीन 'मायोग्लोबिन' (Myoglobin) की खोज किसने की थी?",
            "Who determined the first atomic three-dimensional crystal structure of Myoglobin (the muscle oxygen-storage hemoprotein) using X-ray crystallography (Nobel Prize in 1962)?",
            listOf("जॉन केंड्रू (John Kendrew)", "मैक्स पेरूट्ज़ (Hemoglobin)", "जेम्स वॉटसन", "फ्रांसिस क्रिक"),
            listOf("John Kendrew (with Max Perutz determining hemoglobin structure, awarded 1962 Nobel Prize in Chemistry)", "Max Perutz", "James Watson", "Francis Crick"),
            0,
            "मायोग्लोबिन मांसपेशियों में एक एकल पॉलीपेप्टाइड श्रृंखला वाला हीम प्रोटीन है जो भारी व्यायाम के समय मांसपेशियों को ऑक्सीजन की आपूर्ति करता है। जॉन केंड्रू ने 1958 में इसकी 3D संरचना की खोज की थी।",
            "Myoglobin exhibits a hyperbolic oxygen-binding curve with higher oxygen affinity (P50 ~ 2.8 mmHg) than tetrameric hemoglobin, extracting and storing oxygen within striated muscle sarcoplasm.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m10_q4", "sci_9",
            "पादप और जंतु कोशिकाओं में 'एटीपी' (ATP) का निर्माण करने वाले क्रेब्स चक्र (Krebs Cycle / साइट्रिक एसिड चक्र) की खोज हेतु 1953 में किसे नोबेल पुरस्कार मिला था?",
            "Who discovered the Central Citric Acid Cycle (TCA Cycle / Krebs Cycle) of cellular aerobic respiration taking place in the mitochondrial matrix (Nobel Prize in 1953)?",
            listOf("सर हंस एडॉल्फ क्रेब्स (Sir Hans Adolf Krebs)", "लुई पाश्चर", "कासिमिर फंक", "मेल्विन केल्विन"),
            listOf("Sir Hans Adolf Krebs (German-British biochemist who mapped the 8-step mitochondrial tricarboxylic acid cycle)", "Louis Pasteur", "Casimir Funk", "Melvin Calvin (Photosynthesis Calvin Cycle)"),
            0,
            "क्रेब्स चक्र माइटोकॉन्ड्रिया के मैट्रिक्स में चलता है जहां एसिटाइल-CoA टूटकर NADH, FADH2 और ATP बनाता है। विटामिन B1 (थायमिन), B2 (राइबोफ्लेविन), B3 (नियासिन) और B5 (पैंटोथेनिक एसिड) इसके आवश्यक सह-एंजाइम हैं।",
            "The TCA cycle oxidizes two-carbon acetyl units from carbohydrate, lipid, and protein catabolism into two CO2 molecules, generating reducing equivalents (3 NADH and 1 FADH2) for oxidative phosphorylation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q5", "sci_9",
            "आहार में 'अम्ल-क्षार संतुलन' (Acid-Base Balance) को बनाए रखने के लिए रक्त का सामान्य शारीरिक pH मान कितना होना चाहिए?",
            "What is the tightly regulated physiological arterial Blood pH range in a healthy human body (maintained by bicarbonate and respiratory buffers)?",
            listOf("7.35 से 7.45 (7.35 to 7.45 - Slightly Alkaline / दुर्बल क्षारीय)", "6.0 से 6.5", "8.0 से 8.5", "5.0 से 5.5"),
            listOf("7.35 to 7.45 (Normal mean arterial pH of 7.40; pH < 7.35 indicates Acidosis, pH > 7.45 indicates Alkalosis)", "6.0 to 6.5 (Severe Acidosis)", "8.0 to 8.5 (Severe Alkalosis)", "5.0 to 5.5 (Incompatible with life)"),
            0,
            "मानव रक्त का सामान्य pH 7.35 से 7.45 (औसत 7.4 - हल्का क्षारीय) होता है। इसे स्थिर रखने के लिए रक्त में 'कार्बोनिक एसिड-बाइकार्बोनेट बफर' (H2CO3 / HCO3-) काम करता है तथा फेफड़े और गुर्दे अतिरिक्त अम्ल या क्षार को बाहर निकालते हैं।",
            "The Henderson-Hasselbalch equation defines blood pH as a function of the ratio between renal metabolic bicarbonate [HCO3-] and pulmonary respiratory partial pressure of carbon dioxide [PaCO2].",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q6", "sci_9",
            "यकृत में संचित 'ग्लाइकोजन' (Glycogen) की कुल मात्रा एक वयस्क मानव में लगभग कितने ग्राम होती है जो लगभग 12-24 घंटे के उपवास तक रक्त शर्करा बनाए रखती है?",
            "In an average well-nourished adult, approximately how much total Glycogen is stored in the Liver (~100g) and Skeletal Muscle (~400-500g)?",
            listOf("यकृत में ~100 ग्राम एवं मांसपेशियों में ~400-500 ग्राम (Total ~500-600 grams)", "यकृत में 5 किलोग्राम", "यकृत में 10 ग्राम", "यकृत में 2 किलोग्राम"),
            listOf("~100 g in Liver (available for systemic blood glucose regulation) and ~400-500 g in Skeletal Muscle (used strictly for local muscular contraction)", "~5 kg in liver", "~10 g in liver", "~2 kg in liver"),
            0,
            "यकृत का ग्लाइकोजन (लगभग 100 ग्राम = 400 kcal) उपवास के समय रक्त में ग्लूकोज बनाए रखता है। मांसपेशियों का ग्लाइकोजन (400-500 ग्राम) ग्लूकोज-6-फॉस्फेटेज न होने के कारण रक्त में नहीं आ सकता, वह केवल दौड़ने/व्यायाम में पेशी द्वारा ही जलाया जाता है।",
            "Hepatic glycogen stores are depleted after 18-24 hours of fasting, prompting hormonal transition to adipose lipolysis and hepatic gluconeogenesis utilizing amino acids and glycerol substrates.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q7", "sci_9",
            "दीर्घकालिक उपवास या कीटो आहार (Ketogenic Diet / Starvation) के दौरान जब ग्लूकोज समाप्त हो जाता है, तो यकृत में वसा के टूटने से बनने वाले कौन-से तीन 'कीटोन निकाय' (Ketone Bodies) मस्तिष्क को ऊर्जा देते हैं?",
            "During prolonged starvation, fasting, or severe diabetic ketoacidosis, which three Ketone Bodies are synthesized in hepatic mitochondria to fuel brain metabolism?",
            listOf("एसीटोएसीटेट, बीटा-हाइड्रॉक्सीब्यूटायरेट एवं एसीटोन (Acetoacetate, Beta-hydroxybutyrate & Acetone)", "ग्लूकोज, फ्रुक्टोज और माल्टोज", "यूरिया, यूरिक एसिड और अमोनिया", "एल्ब्यूमिन, ग्लोब्युलिन और फाइब्रिन"),
            listOf("Acetoacetate, Beta-hydroxybutyrate, and Acetone (synthesized from excess acetyl-CoA via HMG-CoA synthase)", "Glucose, Fructose, and Maltose", "Urea, Uric acid, and Ammonia", "Albumin, Globulin, and Fibrin"),
            0,
            "उपवास के तीसरे दिन के बाद मस्तिष्क अपनी 70% ऊर्जा 'कीटोन निकायों' (विशेषकर बीटा-हाइड्रॉक्सीब्यूटायरेट) से लेने लगता है। सांस से मीठी/फलों जैसी गंध आना एसीटोन (Acetone) के फेफड़ों से बाहर निकलने के कारण होता है।",
            "Ketogenesis occurs when hepatic oxaloacetate is consumed by gluconeogenesis, diverting excess beta-oxidation acetyl-CoA into water-soluble acetoacetate and beta-hydroxybutyrate capable of crossing the blood-brain barrier.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m10_q8", "sci_9",
            "मानव शरीर में कुल वजन का लगभग कितने प्रतिशत भाग 'जल' (Water - H2O) होता है?",
            "Total Body Water (TBW) constitutes approximately what percentage of total body weight in a healthy adult male?",
            listOf("लगभग 60% से 65% (Approx 60% in adult males; ~55% in adult females due to higher adipose tissue)", "20%", "90%", "30%"),
            listOf("60% of body weight in adult males and ~50-55% in adult females (Distributed as 2/3 Intracellular Fluid - ICF and 1/3 Extracellular Fluid - ECF)", "20%", "90%", "30%"),
            0,
            "70 किग्रा के स्वस्थ पुरुष में लगभग 42 लीटर पानी (60%) होता है। इसका दो-तिहाई (28 लीटर) कोशिकाओं के अंदर (ICF) और एक-तिहाई (14 लीटर) कोशिकाओं के बाहर (ECF: 11 लीटर ऊतक द्रव + 3 लीटर रक्त प्लाज्मा) होता है। शिशुओं में पानी 75% तक होता है।",
            "Total body water comprises the Intracellular Fluid compartment (~28 L) and Extracellular Fluid compartment (~14 L interstitial + plasma), regulated by hypothalamic osmoreceptors and renal aquaporins.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q9", "sci_9",
            "एंजाइमों (Enzymes) की रासायनिक प्रकृति क्या होती है और वे रासायनिक अभिक्रियाओं की गति को कैसे बढ़ाते हैं?",
            "What is the chemical macromolecular nature of biological Enzymes, and by which biophysical mechanism do they accelerate biochemical reaction rates by millions of times?",
            listOf("एंजाइम प्रोटीन होते हैं और वे अभिक्रिया की 'सक्रियण ऊर्जा' (Activation Energy) को घटा देते हैं", "एंजाइम कार्बोहाइड्रेट होते हैं और ऊर्जा बढ़ाते हैं", "एंजाइम वसा होते हैं", "एंजाइम अकार्बनिक गैसें हैं"),
            listOf("Enzymes are globular Proteins (except catalytic ribozymes) that accelerate reactions by dramatically Lowering the Activation Energy barrier (Ea)", "Enzymes are purely carbohydrates that add calories", "Enzymes are insoluble lipids", "Enzymes are inorganic mineral gases"),
            0,
            "लगभग सभी एंजाइम विशिष्ट 3D संरचना वाले 'प्रोटीन' (Proteins) होते हैं (अपवाद: राइबोजाइम जो RNA का बना होता है)। एंजाइम रासायनिक अभिक्रिया की सक्रियण ऊर्जा (Activation Energy) को घटा देते हैं जिससे अभिक्रिया कमरे के तापमान पर लाखों गुना तेजी से पूरी हो जाती है।",
            "Enzymes stabilize transition-state complexes through active site induced-fit interactions, lowering Gibbs free energy of activation without altering overall thermodynamic equilibrium (delta G).",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q10", "sci_9",
            "अत्यधिक शराब के नियमित सेवन से हृदय की मांसपेशियों के कमजोर होकर फैलने का रोग क्या कहलाता है?",
            "Chronic excessive alcohol consumption leading to toxic ventricular chamber dilation and impaired myocardial systolic pumping contractility is termed:",
            listOf("अल्कोहलिक कार्डियोमायोपैथी (Alcoholic Cardiomyopathy)", "कोरोनरी थ्रोम्बोसिस", "रुमेटिक फीवर", "पेरिकार्डिटिस"),
            listOf("Alcoholic Cardiomyopathy (Non-ischemic dilated cardiomyopathy caused by direct ethanol/acetaldehyde myocyte toxicity)", "Coronary thrombosis", "Rheumatic fever", "Pericarditis"),
            0,
            "शराब का एसिटैल्डिहाइड हृदय की मायोसाइट कोशिकाओं में प्रोटीन संश्लेषण और कैल्शियम प्रवाह को रोक देता है जिससे दिल के निलय फैल जाते हैं और दिल कमजोर होकर धड़कने लगता है (कंजेस्टिव हार्ट फेल्योर)।",
            "Alcoholic cardiomyopathy arises from ethanol-induced oxidative stress, sarcoplasmic reticulum calcium mishandling, and mitochondrial structural lysis, culminating in biventricular dilation and low ejection fraction.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m10_q11", "sci_9",
            "मानव शरीर में 'यूरिक एसिड' (Uric Acid) किसका अंतिम अपशिष्ट उत्पाद (End Product of Catabolism) है?",
            "In human metabolic biochemistry, Uric Acid is the final nitrogenous metabolic breakdown byproduct of which nitrogenous cellular components?",
            listOf("प्यूरीन न्यूक्लियोटाइड्स (Purine Bases - Adenine and Guanine in DNA & RNA)", "पिरिमिडीन (साइटोसिन, थाइमिन)", "ग्लूकोज", "फैटी एसिड"),
            listOf("Purines (Adenine and Guanine catabolized by Xanthine Oxidase into uric acid)", "Pyrimidines (Thymine, Cytosine, Uracil catabolized to beta-alanine)", "Glucose", "Fatty acids"),
            0,
            "डीएनए और आरएनए के प्यूरीन (एडेनिन और ग्वानिन) जब टूटते हैं, तो एंजाइम 'जैंथीन ऑक्सीडेज' (Xanthine Oxidase) उन्हें यूरिक एसिड में बदल देता है। अन्य स्तनधारियों में यूरिक एसिड 'एलेंटॉइन' में टूट जाता है, लेकिन मनुष्यों में यूरिकेज एंजाइम न होने से यूरिक एसिड ही मूत्र में निकलता है।",
            "Humans lack functional urate oxidase (uricase) due to pseudogenization during primate evolution; xanthine dehydrogenase/oxidase converts hypoxanthine to xanthine and xanthine to uric acid.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q12", "sci_9",
            "मानव रक्त में प्लाज्मा प्रोटीनों (एल्ब्यूमिन, ग्लोब्युलिन) द्वारा उत्पन्न किया जाने वाला 'कोलाइडल ऑस्मोटिक दबाव' (Oncotic Pressure) रक्त केशिकाओं से पानी को बाहर बहने से रोकता है, इसका मान कितना होता है?",
            "What is the normal intravascular Plasma Colloid Osmotic Pressure (Oncotic Pressure, maintained primarily by Serum Albumin) that prevents fluid extravasation into interstitial spaces?",
            listOf("लगभग 25 से 28 mmHg (Approx 25-28 mm Hg)", "120 mmHg", "80 mmHg", "5 mmHg"),
            listOf("25 to 28 mmHg (Starling forces balance preventing systemic peripheral Edema / Ascites)", "120 mmHg", "80 mmHg", "5 mmHg"),
            0,
            "यकृत द्वारा बनाया गया 'सीरम एल्ब्यूमिन' रक्त वाहिकाओं में 25-28 mmHg का ऑन्कोटिक दबाव बनाए रखता है। जब कुपोषण (क्वाशिओरकोर) या लिवर सिरोसिस में एल्ब्यूमिन कम हो जाता है, तो पानी रक्त वाहिकाओं से निकलकर पेट और पैरों में भर जाता है (एडिमा/जलोदर)।",
            "According to Starling's equation of microvascular fluid exchange, plasma oncotic pressure (pi_c ~28 mmHg) opposes hydrostatic capillary pressure, drawing interstitial water back into systemic venous capillaries.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m10_q13", "sci_9",
            "गैलेक्टोसीमिया (Galactosemia) एक आनुवंशिक चयापचय रोग है जिसमें नवजात शिशु दूध की किस शर्करा को पचाने में असमर्थ होता है?",
            "Classic Galactosemia (autosomal recessive inborn error of carbohydrate metabolism causing neonatal jaundice, cataracts, and liver failure) is caused by deficiency of GALT enzyme in metabolizing:",
            listOf("गैलेक्टोज (Galactose - Galactose-1-Phosphate Uridyltransferase deficiency)", "सुक्रोज", "माल्टोज", "सेल्युलोज"),
            listOf("Galactose (Failure to metabolize Galactose derived from milk Lactose, accumulating toxic Galactose-1-phosphate and Galactitol in lens)", "Sucrose", "Maltose", "Cellulose"),
            0,
            "गैलेक्टोसीमिया में शिशु दूध में मौजूद लैक्टोज के टूटने से बने 'गैलेक्टोज' को ग्लूकोज में नहीं बदल पाता। गैलेक्टोज आंखों के लेंस में 'गैलैक्टिटोल' बनकर जन्मजात मोतियाबिंद (Cataract) और यकृत क्षति करता है। ऐसे शिशुओं को सोया-मिल्क (लैक्टोज-मुक्त दूध) दिया जाता है।",
            "GALT enzyme deficiency causes intracellular accumulation of toxic galactose-1-phosphate; aldose reductase converts excess galactose into galactitol in the ocular lens, inducing osmotic swelling and early cataracts.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_9_m10_q14", "sci_9",
            "मानव शरीर में त्वचा और संयोजी ऊतकों का मुख्य संरचनात्मक प्रोटीन 'कोलेजन' (Collagen) पूरे शरीर के कुल प्रोटीन का लगभग कितने प्रतिशत होता है?",
            "Collagen (the most abundant structural fibrous protein in the human body, forming skin, bones, tendons, and cartilage) accounts for approximately what fraction of total human body protein?",
            listOf("लगभग 25% से 30% (Approx 25% to 30% of total body protein)", "5%", "75%", "90%"),
            listOf("25% to 30% of total protein mass (Extracellular triple-helix glycoprotein requiring Vitamin C for prolyl hydroxylation)", "5%", "75%", "90%"),
            0,
            "कोलेजन मानव शरीर का सबसे प्रचुर प्रोटीन है (कुल प्रोटीन का 30%)। यह तीन पॉलीपेप्टाइड श्रृंखलाओं की ट्रिपल हेलिक्स (Triple Helix) रस्सी जैसी मजबूत संरचना होती है। हड्डियों, उपास्थि (Cartilage), त्वचा और रक्त वाहिकाओं की मजबूती इसी पर निर्भर होती है।",
            "Collagen molecules comprise a repeating Gly-X-Y tripeptide motif (where X is often proline and Y is hydroxyproline), assembling into rigid triple-helical tropocollagen fibrils stabilized by covalent lysyl-oxidase crosslinks.",
            "Easy"
        ),
        makeScienceQ(
            "sci_9_m10_q15", "sci_9",
            "मानव बाल और त्वचा का प्राकृतिक रंग निर्धारित करने वाले 'मेलेनिन' (Melanin) वर्णक का निर्माण त्वचा की मेलानोसाइट कोशिकाओं में किस अमीनो एसिड से होता है?",
            "The photoprotective biological pigment Melanin (Eumelanin and Pheomelanin) is synthesized inside melanocyte melanosomes through oxidative pathways starting from which aromatic amino acid?",
            listOf("टायरोसिन (L-Tyrosine Amino Acid)", "ट्रिप्टोफैन", "ग्लाइसिन", "लाइसिन"),
            listOf("L-Tyrosine (Hydroxylated by tyrosinase enzyme into DOPA and dopaquinone)", "Tryptophan (Precursor of Serotonin & Melatonin)", "Glycine", "Lysine"),
            0,
            "टायरोसिन (Tyrosine) अमीनो एसिड से 'टायरोसिनेज' एंजाइम द्वारा त्वचा का वर्णक 'मेलेनिन' बनता है। इसके अलावा टायरोसिन से ही थायरॉक्सिन हार्मोन, एड्रेनालिन, नॉर-एड्रेनालिन और डोपामाइन न्यूरोट्रांसमीटर भी बनते हैं।",
            "Melanogenesis initiates with copper-dependent tyrosinase catalyzing the ortho-hydroxylation of L-tyrosine to L-DOPA and its subsequent oxidation to dopaquinone, polymerizing into brown-black eumelanin.",
            "Easy"
        )
    )
}
