package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic5ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m6_q1", "sci_5",
            "विटामिन B₁ (थायमिन) की गंभीर कमी से कौन-सा तंत्रिका और हृदय संबंधी रोग होता है, जो पॉलिश किए चावल खाने वाले लोगों में आम था?",
            "Severe deficiency of Vitamin B₁ (Thiamine), historically prevalent in populations consuming polished white rice, causes:",
            listOf("स्कर्वी", "बेरी-बेरी रोग (Beriberi - Dry & Wet Beriberi)", "पेलाग्रा", "रिकेट्स"),
            listOf("Scurvy", "Beriberi (Neurological Dry Beriberi and Cardiovascular Wet Beriberi)", "Pellagra", "Rickets"),
            1,
            "चावल की भूसी (Aleurone layer) उतारने पर थायमिन नष्ट हो जाता है। थायमिन की कमी से कार्बोहाइड्रेट चयापचय रुक जाता है और तंत्रिका क्षति व दिल की विफलता वाला 'बेरी-बेरी' रोग होता है।",
            "Thiamine (Vitamin B₁) acts as a cofactor in carbohydrate metabolism. Its deficiency causes Beriberi, characterized by peripheral neuropathy and high-output heart failure.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q2", "sci_5",
            "विटामिन B₃ (नियासिन / निकोटिनिक एसिड) की कमी से होने वाले '4-D सिंड्रोम' (Dermatitis, Diarrhea, Dementia, Death) वाले रोग को क्या कहते हैं?",
            "Deficiency of Vitamin B₃ (Niacin / Nicotinic Acid) causes which nutritional deficiency disease classically characterized by Dermatitis, Diarrhea, and Dementia?",
            listOf("बेरी-बेरी", "पेलाग्रा (Pellagra)", "स्कर्वी", "एनीमिया"),
            listOf("Beriberi", "Pellagra (Characterized by photosensitive collar rash and 4-Ds)", "Scurvy", "Anemia"),
            1,
            "मक्का आधारित आहार में ट्रिप्टोफैन और नियासिन की कमी से 'पेलाग्रा' (Pellagra) होता है, जिसमें त्वचा पर धूप से जलन, दस्त और मानसिक भ्रम (Dementia) होता है।",
            "Pellagra arises from inadequate dietary Niacin (B₃) or Tryptophan, triggering NAD/NADP depletion that damages skin, enteric lining, and brain function.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q3", "sci_5",
            "विटामिन B₁₂ (साइनोकोबालामिन / Cyanocobalamin) में कौन-सी धातु पाई जाती है और इसकी कमी से कौन-सा एनीमिया होता है?",
            "Which transition metal ion is coordinated at the center of the corrin ring of Vitamin B₁₂, and its deficiency leads to:",
            listOf("लोहा, थैलेसीमिया", "कोबाल्ट (Cobalt - Co), परनिशियस एनीमिया (Pernicious Anemia / Megaloblastic Anemia)", "तांबा, सिकल सेल एनीमिया", "मैग्नीशियम, ल्यूकेमिया"),
            listOf("Iron, Thalassemia", "Cobalt (Co³⁺); Pernicious Anemia / Megaloblastic Anemia", "Copper, Sickle cell", "Magnesium, Leukemia"),
            1,
            "विटामिन B₁₂ (साइनोकोबालामिन) एकमात्र ऐसा विटामिन है जिसमें 'कोबाल्ट' (Co) धातु होती है। यह RBC के परिपक्व होने और माइलिन शीथ के लिए अनिवार्य है। इसकी कमी से जानलेवा परनिशियस एनीमिया होता है।",
            "Vitamin B₁₂ contains a central Cobalt atom. Its deficiency impairs folate metabolism and myelin synthesis, causing Macrocytic Megaloblastic and Pernicious Anemia.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q4", "sci_5",
            "विटामिन C (एस्कॉर्बिक एसिड) की कमी से मसूड़ों से खून आना, जोड़ों का दर्द और घावों का देर से भरना किस रोग के लक्षण हैं?",
            "Bleeding gums, capillary fragility, petechial hemorrhages, and poor wound healing due to defective collagen synthesis in Vitamin C deficiency are signs of:",
            listOf("रिकेट्स", "स्कर्वी (Scurvy / Naval Scurvy)", "बेरी-बेरी", "पेलाग्रा"),
            listOf("Rickets", "Scurvy (Impaired prolyl-hydroxylase collagen crosslinking)", "Beriberi", "Pellagra"),
            1,
            "विटामिन C (एस्कॉर्बिक अम्ल) कोलेजन प्रोटीन के संश्लेषण के लिए आवश्यक है। यह खट्टे फलों, आंवला और हरी मिर्च में प्रचुर होता है। गर्म करने पर यह विटामिन सबसे पहले नष्ट होता है।",
            "Vitamin C (Ascorbic Acid) is an essential cofactor for prolyl and lysyl hydroxylases during collagen triple helix assembly; deficiency results in vascular fragility and Scurvy.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q5", "sci_5",
            "विटामिन D (कैल्सीफेरॉल) की कमी से बच्चों में हड्डियों के मुड़ने और नरम होने वाले रोग 'रिकेट्स' (Rickets) तथा वयस्कों में 'ओस्टियोमलेशिया' (Osteomalacia) होता है। इसे किस नाम से भी जाना जाता है?",
            "Vitamin D (Cholecalciferol) deficiency causes Rickets in children and Osteomalacia in adults. What is the popular nickname of Vitamin D synthesized in skin under UV-B rays?",
            listOf("सौंदर्य विटामिन", "सनशाइन विटामिन / धूप का विटामिन (Sunshine Vitamin)", "थक्का विटामिन", "दृष्टि विटामिन"),
            listOf("Beauty Vitamin (Vit E)", "Sunshine Vitamin (Synthesized photochemically in skin from 7-dehydrocholesterol)", "Clotting Vitamin (Vit K)", "Vision Vitamin (Vit A)"),
            1,
            "सूर्य के पराबैंगनी प्रकाश (UV-B) के प्रभाव से त्वचा में उपस्थित 7-डीहाइड्रोकोलेस्ट्रॉल विटामिन D₃ में बदल जाता है। यह आंतों में कैल्शियम और फास्फोरस के अवशोषण के लिए आवश्यक है।",
            "Photolysis of cutaneous 7-dehydrocholesterol by UV-B sunlight produces Cholecalciferol (Vitamin D₃), hydroxylated in liver and kidneys into active Calcitriol.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q6", "sci_5",
            "विटामिन E (टोकोफेरॉल / Tocopherol) को किस लोकप्रिय नाम से जाना जाता है और यह एक शक्तिशाली एंटीऑक्सीडेंट है?",
            "Vitamin E (alpha-tocopherol), a powerful lipid-soluble antioxidant that protects cell membranes and reproductive health, is popularly called the:",
            listOf("सनशाइन विटामिन", "सौंदर्य विटामिन / प्रजनन विटामिन (Beauty Vitamin / Anti-Sterility Vitamin)", "रक्तस्राव रोधी विटामिन", "ऊर्जा विटामिन"),
            listOf("Sunshine Vitamin", "Beauty Vitamin / Anti-Sterility Vitamin (Tocopherol)", "Anti-hemorrhagic Vitamin", "Energy Vitamin"),
            1,
            "विटामिन E त्वचा को मुक्त मूलकों (Free radicals) से बचाता है और जनन ग्रंथियों के सामान्य कार्य के लिए आवश्यक है। इसकी कमी से बांझपन (Sterility) और मांसपेशियों में कमजोरी आ सकती है।",
            "Vitamin E (Tocopherol) scavenges free radicals, preventing lipid peroxidation in polyunsaturated cell membranes, earning the title 'Beauty Vitamin' and 'Anti-Sterility Vitamin'.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q7", "sci_5",
            "जल में घुलनशील (Water-Soluble) विटामिन कौन-से हैं जो शरीर में संचित नहीं होते और मूत्र के साथ उत्सर्जित हो जाते हैं?",
            "Which vitamins are Water-Soluble and thus cannot be stored in large quantities in body adipose tissues, requiring regular dietary intake?",
            listOf("विटामिन A, D, E, K", "विटामिन B-कॉम्प्लेक्स और विटामिन C (Vitamin B Complex and Vitamin C)", "केवल विटामिन A और D", "केवल विटामिन E और K"),
            listOf("Vitamins A, D, E, K (Fat-soluble)", "Vitamin B-Complex and Vitamin C (Water-Soluble)", "Only A and D", "Only E and K"),
            1,
            "विटामिन दो प्रकार के होते हैं: 1. जल में घुलनशील: विटामिन B और C (इन्हें प्रतिदिन लेना जरूरी है)। 2. वसा में घुलनशील (Fat-soluble): विटामिन A, D, E, K (ये यकृत और वसीय ऊतकों में संचित रहते हैं)।",
            "Vitamins B-complex and C are hydrophilic and water-soluble, undergoing renal filtration and urinary excretion. Vitamins A, D, E, and K are hydrophobic and lipophilic.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q8", "sci_5",
            "प्रोटीन की गंभीर कमी से 1 से 5 वर्ष के बच्चों में पेट फूलने और अंगों के सूखने वाला कौन-सा कुपोषण रोग (PEM) होता है?",
            "Severe protein deficiency with adequate caloric intake in young children causes which form of Protein-Energy Malnutrition (PEM) presenting with abdominal ascites (potbelly) and edema?",
            listOf("मरास्मस", "क्वाशिओरकोर (Kwashiorkor)", "रिकेट्स", "स्कर्वी"),
            listOf("Marasmus (Calorie + Protein deficiency)", "Kwashiorkor (Pure Protein deficiency with edema and potbelly)", "Rickets", "Scurvy"),
            1,
            "क्वाशिओरकोर में प्लाज्मा एल्ब्यूमिन प्रोटीन की भारी कमी से परासरणी दाब गिर जाता है और तरल पेट व ऊतकों में भरकर 'पॉटबेली' (सूजन/Edema) पैदा करता है। मरास्मस में प्रोटीन व कुल कैलोरी दोनों की कमी से बच्चा हड्डियों का ढांचा बन जाता है।",
            "Kwashiorkor stems from acute dietary protein deprivation causing hypoalbuminemia, generalized edema, fatty liver infiltration, and a protruding potbelly.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q9", "sci_5",
            "आनुवंशिकी का जनक (Father of Genetics) किसे कहा जाता है जिन्होंने मटर के पौधे (Pisum sativum) पर 1856-1863 के बीच संकरण प्रयोग किए थे?",
            "Who is universally honored as the 'Father of Genetics' for formulating the fundamental Laws of Inheritance using garden pea plants (Pisum sativum)?",
            listOf("चार्ल्स डार्विन", "ग्रेगर जोहान मेंडल (Gregor Johann Mendel)", "थॉमस हंट मॉर्गन", "ह्यूगो डी व्रीज"),
            listOf("Charles Darwin", "Gregor Johann Mendel (Austrian Augustinian monk)", "Thomas Hunt Morgan", "Hugo de Vries"),
            1,
            "ग्रेगर मेंडल ने मटर के 7 विपर्यासी लक्षणों पर प्रयोग करके आनुवंशिकी के 3 मूल नियम दिए: 1. प्रभाविता का नियम, 2. विसंयोजन/पृथक्करण का नियम (Law of Segregation), 3. स्वतंत्र अपव्यूहन का नियम।",
            "Gregor Mendel established the fundamental laws of Mendelian inheritance (Dominance, Segregation, and Independent Assortment) through garden pea hybridization experiments.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q10", "sci_5",
            "मानव कोशिका के केंद्रक में कुल कितने गुणसूत्र (Chromosomes) पाए जाते हैं?",
            "How many total Chromosomes (and homologous pairs) are present in the somatic diploid nucleus of a normal human cell?",
            listOf("23 गुणसूत्र", "46 गुणसूत्र (23 जोड़े: 22 जोड़े ऑटोसोम + 1 जोड़ा लिंग गुणसूत्र)", "48 गुणसूत्र", "44 गुणसूत्र"),
            listOf("23 chromosomes", "46 Chromosomes (23 Pairs: 22 Autosomal pairs + 1 pair of Sex Chromosomes)", "48 chromosomes (Chimpanzees)", "44 chromosomes"),
            1,
            "मनुष्य की प्रत्येक द्विगुणित (2n) कायिक कोशिका में 46 गुणसूत्र (23 जोड़े) होते हैं। 22 जोड़े ऑटोसोम (दैहिक) होते हैं और 23वां जोड़ा लिंग गुणसूत्र (स्त्री में XX, पुरुष में XY) होता है।",
            "Human diploid somatic cells carry 46 chromosomes (2n = 46), organized into 22 homologous pairs of autosomes and 1 pair of allosomes (Sex chromosomes: XX in females, XY in males).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q11", "sci_5",
            "मानव में संतान का लिंग (Sex of Child) किसके गुणसूत्र द्वारा निर्धारित होता है?",
            "In human biological sex determination, the genetic sex of the zygote is determined solely by the sex chromosome contributed by the:",
            listOf("माता के अंडाणु द्वारा", "पिता के शुक्राणु द्वारा (Father's Sperm - carrying either X or Y chromosome)", "दोनों के समान योगदान से", "पर्यावरणीय तापमान से"),
            listOf("Mother's Ovum (Homogametic - always X)", "Father's Sperm (Heterogametic - delivering either 23,X or 23,Y chromosome)", "Equal contribution", "Environmental temperature"),
            1,
            "माता केवल X गुणसूत्र देती है (होमोगैमेटिक XX)। पिता 50% X और 50% Y शुक्राणु बनाता है (हेटेरोगैमेटिक XY)। यदि पिता से Y गुणसूत्र मिलता है तो पुत्र (XY) और X मिलता है तो पुत्री (XX) होती है।",
            "Human females produce only X-bearing eggs. Males produce 50% X-sperm and 50% Y-sperm. Fertilization by a Y-bearing sperm bearing SRY gene yields a male (XY).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q12", "sci_5",
            "डीएनए (DNA - Deoxyribonucleic Acid) की द्विकुंडलिनी संरचना (Double Helix Model) की खोज 1953 में किसने की थी (नोबेल 1962)?",
            "Who deciphered the antiparallel Double Helix molecular structure of DNA in 1953 (Nobel Prize in Physiology or Medicine 1962)?",
            listOf("रॉबर्ट हुक और ब्राउन", "जेम्स वॉटसन और फ्रांसिस क्रिक (James Watson and Francis Crick)", "मेंडल और मॉर्गन", "हरगोविंद खुराना"),
            listOf("Hooke and Brown", "James Watson and Francis Crick (utilizing Rosalind Franklin's Photo 51)", "Mendel and Morgan", "Har Gobind Khorana"),
            1,
            "वॉटसन और क्रिक ने रोजालिंड फ्रैंकलिन और मौरिस विल्किंस के एक्स-रे विवर्तन डेटा (Photo 51) के आधार पर DNA की द्विकुंडली संरचना प्रस्तावित की, जिसमें एडेनिन-थाइमिन (A=T) और ग्वानिन-साइटोसिन (G≡C) बंधते हैं।",
            "James Watson and Francis Crick elucidated the right-handed B-DNA double helix with complementary purine-pyrimidine base pairing (A=T and G≡C).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q13", "sci_5",
            "डीएनए (DNA) में कौन-सा नाइट्रोजनयुक्त क्षार (Nitrogenous Base) पाया जाता है जो आरएनए (RNA) में नहीं होता?",
            "Which pyrimidine nitrogenous base is present exclusively in DNA and is replaced by Uracil (U) in RNA?",
            listOf("एडेनिन", "थाइमिन (Thymine - 5-methyluracil)", "ग्वानिन", "साइटोसिन"),
            listOf("Adenine", "Thymine (T - methylated pyrimidine; replaced by Uracil in RNA)", "Guanine", "Cytosine"),
            1,
            "DNA में चार क्षार होते हैं: एडेनिन (A), ग्वानिन (G), साइटोसिन (C) और 'थाइमिन' (T)। RNA में थाइमिन के स्थान पर 'यूरेसिल' (U) पाया जाता है और डीऑक्सीराइबोज शर्करा के स्थान पर राइबोज शर्करा होती है।",
            "DNA contains Adenine, Guanine, Cytosine, and Thymine. RNA substitutes Thymine with Uracil (U) and utilizes ribose instead of 2-deoxyribose sugar.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q14", "sci_5",
            "जेनेटिक कोड (आनुवंशिक कूट) के डिकोडिंग और कृत्रिम जीन संश्लेषण के लिए 1968 में किस भारतीय मूल के वैज्ञानिक को नोबेल पुरस्कार मिला था?",
            "Which Indian-American biochemist shared the 1968 Nobel Prize for deciphering the Genetic Code and synthesizing functional artificial genes?",
            listOf("सी. वी. रमन", "डॉ. हरगोविंद खुराना (Dr. Har Gobind Khorana)", "सुब्रह्मण्यम चंद्रशेखर", "वेंकटरामन रामकृष्णन"),
            listOf("C. V. Raman", "Dr. Har Gobind Khorana (with Marshall Nirenberg and Robert Holley)", "S. Chandrasekhar", "Venkatraman Ramakrishnan"),
            1,
            "डॉ. हरगोविंद खुराना ने परिभाषित त्रिक प्रकूटों (Triplet codons) का उपयोग करके कृत्रिम mRNA और ट्रांसफर RNA (tRNA) का संश्लेषण किया और सिद्ध किया कि कौन-सा कोडॉन किस अमीनो एसिड को कोड करता है।",
            "Har Gobind Khorana synthesized polyribonucleotides to prove triplet codons translate into specific amino acids, sharing the 1968 Nobel Prize in Physiology or Medicine.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m6_q15", "sci_5",
            "डाउन सिंड्रोम (Down Syndrome / मंगोलिज्म) किस गुणसूत्र की त्रिसूत्रता (Trisomy) के कारण होने वाला आनुवंशिक विकार है?",
            "Down Syndrome, a genetic chromosomal disorder causing developmental and intellectual delays, is caused by Trisomy of Chromosome:",
            listOf("गुणसूत्र 18 (Edwards)", "गुणसूत्र 21 (Trisomy 21 - कुल 47 गुणसूत्र)", "गुणसूत्र 13 (Patau)", "गुणसूत्र 23"),
            listOf("Chromosome 18", "Chromosome 21 (Trisomy 21 / 47,XX,+21 or 47,XY,+21)", "Chromosome 13", "Chromosome 23"),
            1,
            "डाउन सिंड्रोम 21वें गुणसूत्र के अर्धसूत्री विभाजन में अलग न होने (Non-disjunction) के कारण एक अतिरिक्त 21वां गुणसूत्र (कुल 47 गुणसूत्र) होने से होता है। इसमें चपटा चेहरा, मंगोलियाई आंखें और मंदबुद्धिता होती है।",
            "Down Syndrome is the most common autosomal aneuploidy, resulting from meiotic non-disjunction leading to three copies of chromosome 21 (Trisomy 21).",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 7 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m7_q1", "sci_5",
            "टर्नर सिंड्रोम (Turner Syndrome) केवल महिलाओं में होने वाला विकार है जिसमें लिंग गुणसूत्रों की स्थिति क्या होती है?",
            "Turner Syndrome is a female genetic disorder characterized by short stature and gonadal dysgenesis caused by chromosomal karyotype:",
            listOf("XXY (Klinefelter)", "45, XO (एक X गुणसूत्र की अनुपस्थिति - Monosomy X)", "XXX", "XYY"),
            listOf("47, XXY (Klinefelter)", "45, X0 (Monosomy of X chromosome / 45,X)", "47, XXX", "47, XYY"),
            1,
            "टर्नर सिंड्रोम में महिला में केवल एक X गुणसूत्र होता है (45,X0)। इसके लक्षणों में छोटा कद, वेबयुक्त गर्दन (Webbed neck), अल्पविकसित अंडाशय और बांझपन शामिल हैं।",
            "Turner Syndrome (45,X) occurs when a female is born with only one functional X chromosome, resulting in ovarian dysgenesis and amenorrhea.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_5_m7_q2", "sci_5",
            "क्लाइनफेल्टर सिंड्रोम (Klinefelter Syndrome) पुरुषों में होने वाला आनुवंशिक विकार है जिसमें गुणसूत्रों की संरचना क्या होती है?",
            "Klinefelter Syndrome in males is characterized by small testes, gynecomastia, and infertility caused by karyotype:",
            listOf("45, X0", "47, XXY (एक अतिरिक्त X गुणसूत्र)", "47, XYY", "46, XX"),
            listOf("45, X0", "47, XXY (Male carrying an extra female X chromosome)", "47, XYY", "46, XX"),
            1,
            "क्लाइनफेल्टर सिंड्रोम में पुरुष में एक अतिरिक्त X गुणसूत्र आ जाता है (47,XXY)। इसमें पुरुष में वृषण अल्पविकसित होते हैं, पुरुषों में स्तन का विकास (Gynecomastia) होता है और वे बांझ (Sterile) होते हैं।",
            "Klinefelter syndrome (47,XXY) arises from maternal or paternal non-disjunction, conferring hypogonadism and female secondary sexual traits in phenotypic males.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_5_m7_q3", "sci_5",
            "हीमोफिलिया (Hemophilia / Royal Disease) किस प्रकार का आनुवंशिक रोग है?",
            "Hemophilia ('Royal Disease'), a genetic clotting defect famously carried by Queen Victoria's lineage, is inherited as an:",
            listOf("ऑटोसोमल प्रभावी रोग", "X-सहलग्न अप्रभावी रोग (X-Linked Recessive Genetic Disorder)", "Y-सहलग्न रोग", "जीवाणु रोग"),
            listOf("Autosomal dominant", "X-Linked Recessive Disorder (Factor VIII / Factor IX clotting deficiency)", "Y-linked disorder", "Bacterial disease"),
            1,
            "हीमोफिलिया X-सहलग्न अप्रभावी रोग है जिसमें रक्त का थक्का बनाने वाले कारक (Factor VIII या IX) नहीं बनते, जिससे छोटी चोट पर भी लगातार रक्त बहता रहता है। महिलाएं वाहक होती हैं और पुरुष रोगी होते हैं।",
            "Hemophilia A and B are X-linked recessive coagulopathies where mutations in F8 or F9 genes cause defective clotting factor cascades and spontaneous joint hemorrhages.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q4", "sci_5",
            "वर्णांधता (Color Blindness / Daltonism) से पीड़ित व्यक्ति मुख्य रूप से किन दो रंगों में अंतर करने में असमर्थ होता है?",
            "Individuals with Red-Green Color Blindness (Deuteranopia / Protanopia, an X-linked recessive trait) are unable to distinguish between:",
            listOf("नीला और पीला", "लाल और हरा रंग (Red and Green Colors)", "सफेद और काला", "बैंगनी और नारंगी"),
            listOf("Blue and yellow", "Red and Green colors (Due to defect in retinal L/M cone photopsins)", "White and black", "Violet and orange"),
            1,
            "वर्णांधता में रेटिना के शंकु (Cones) में लाल और हरे रंग के संवेदी वर्णक नहीं होते। जॉन डाल्टन स्वयं इससे पीड़ित थे, इसलिए इसे डाल्टनिज्म भी कहते हैं। इसे इशिहारा चार्ट द्वारा जांचा जाता है।",
            "Red-Green color blindness is an X-linked condition characterized by absent or anomalous photopigments in retinal cone photoreceptors.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q5", "sci_5",
            "सिकल सेल एनीमिया (Sickle Cell Anemia / दात्र कोशिका अरक्तता) में हीमोग्लोबिन की बीटा श्रृंखला में किस अमीनो एसिड का प्रतिस्थापन होता है जिससे RBC हंसिए के आकार की हो जाती हैं?",
            "In Sickle Cell Anemia (point mutation at codon 6 of the β-globin gene), which amino acid substitution distorts RBCs into rigid sickles?",
            listOf("ग्लाइसिन से एलेनिन", "ग्लूटामिक एसिड का वैलीन द्वारा प्रतिस्थापन (Glutamic Acid substituted by Valine - GAG to GUG)", "लाइसिन से ल्यूसीन", "टायरोसिन से सेरीन"),
            listOf("Glycine to Alanine", "Glutamic acid substituted by Valine (Glu6Val point mutation forming HbS)", "Lysine to Leucine", "Tyrosine to Serine"),
            1,
            "DNA में GAG की जगह GUG बिंदु उत्परिवर्तन (Point Mutation) होने से 6वें स्थान पर ग्लूटामिक एसिड की जगह वैलीन आ जाता है। कम ऑक्सीजन पर हीमोग्लोबिन पॉलीमेराइज होकर RBC को हंसियाकार बना देता है।",
            "A single base substitution (A→T) replaces hydrophilic glutamic acid with hydrophobic valine at position 6 of the β-globin subunit, precipitating hemoglobin HbS polymers.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_5_m7_q6", "sci_5",
            "जीवाणु (Bacteria) की खोज 1676 में अपने स्वनिर्मित सूक्ष्मदर्शी द्वारा किसने की थी?",
            "Who is honored as the 'Father of Microbiology' for first observing live Bacteria ('Animalcules') in dental scrapings and pond water in 1676?",
            listOf("रॉबर्ट हुक", "एंटनी वॉन ल्यूवेनहॉक (Antoni van Leeuwenhoek)", "लुई पाश्चर", "रॉबर्ट कोच"),
            listOf("Robert Hooke", "Antoni van Leeuwenhoek (Dutch microscopist)", "Louis Pasteur", "Robert Koch"),
            1,
            "डच वैज्ञानिक एंटनी वॉन ल्यूवेनहॉक ने पहली बार जीवित बैक्टीरिया, प्रोटोजोआ, शुक्राणु और RBC को देखा। उन्होंने इन्हें 'एनिमैक्यूल्स' (सूक्ष्म जंतु) नाम दिया था।",
            "Antoni van Leeuwenhoek ground single-lens high-magnification microscopes to describe living bacteria, founding the field of Microbiology.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q7", "sci_5",
            "दूध के पाश्चुरीकरण (Pasteurization of Milk) और रेबीज के टीके (Rabies Vaccine) की खोज किसने की थी?",
            "Who invented the food preservation technique of Pasteurization and developed the first live-attenuated Rabies and Anthrax vaccines?",
            listOf("एडवर्ड जेनर", "लुई पाश्चर (Louis Pasteur)", "अलेक्जेंडर फ्लेमिंग", "जोसेफ लिस्टर"),
            listOf("Edward Jenner", "Louis Pasteur (French microbiologist and chemist)", "Alexander Fleming", "Joseph Lister"),
            1,
            "लुई पाश्चर ने रोगाणु सिद्धांत (Germ Theory of Disease) स्थापित किया। दूध को 62.8°C पर 30 मिनट (LTLT) या 71.7°C पर 15 सेकंड (HTST) गर्म करके तुरंत ठंडा करने की विधि पाश्चुरीकरण कहलाती है।",
            "Louis Pasteur disproved spontaneous generation, developed milk pasteurization to kill pathogens, and formulated prophylactic Rabies vaccination in 1885.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q8", "sci_5",
            "चेचक (Smallpox) के विश्व के पहले टीके (First Vaccine) की खोज 1796 में किसने की थी (Father of Immunology)?",
            "Who is revered as the 'Father of Immunology' for discovering the world's first Smallpox vaccine in 1796 using cowpox virus?",
            listOf("लुई पाश्चर", "एडवर्ड जेनर (Edward Jenner)", "रॉबर्ट कोच", "जोनास साल्क"),
            listOf("Louis Pasteur", "Edward Jenner (English physician)", "Robert Koch", "Jonas Salk"),
            1,
            "एडवर्ड जेनर ने देखा कि गो-चेचक (Cowpox) से पीड़ित ग्वालिनों को चेचक (Smallpox) नहीं होता। उन्होंने काउपॉक्स से चेचक का पहला टीका बनाया। WHO ने 1980 में चेचक के पूर्ण उन्मूलन की घोषणा की।",
            "Edward Jenner inoculated 8-year-old James Phipps with Cowpox pus to confer immunity against Smallpox, inaugurating the science of Vaccinology.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q9", "sci_5",
            "पोलियो की सुई वाले टीके (Inactivated Injectable Polio Vaccine - IPV) और ओरल पोलियो ड्रॉप्स (Oral Polio Vaccine - OPV) की खोज क्रमशः किसने की थी?",
            "The Injectable Inactivated Polio Vaccine (IPV - 1953) and Oral Live-Attenuated Polio Drops (OPV - 1961) were developed respectively by:",
            listOf("साल्क और जेनर", "जोनास साल्क (Jonas Salk) और अल्बर्ट सेबिन (Albert Sabin)", "फ्लेमिंग और पाश्चर", "कोच और वोहलर"),
            listOf("Salk and Jenner", "Jonas Salk (Injectable IPV) and Albert Sabin (Oral OPV drops)", "Fleming and Pasteur", "Koch and Wöhler"),
            1,
            "1953 में जोनास साल्क ने मृत पोलियो वायरस से सुई वाला टीका (IPV) विकसित किया। 1961 में अल्बर्ट सेबिन ने मुंह से दी जाने वाली दो बूंद 'ओरल पोलियो वैक्सीन' (OPV) विकसित की।",
            "Jonas Salk created the first formalin-inactivated injectable polio vaccine (IPV), while Albert Sabin developed the convenient oral attenuated live polio vaccine (OPV).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q10", "sci_5",
            "टीबी (क्षयरोग / Tuberculosis) और हैजा (Cholera) के जीवाणुओं की खोज तथा रोगाणु अभिधारणाएं (Koch's Postulates) किसने दी थीं?",
            "Who identified the causative bacterial pathogens of Tuberculosis (Mycobacterium tuberculosis, 1882) and Cholera (Vibrio cholerae)?",
            listOf("लुई पाश्चर", "रॉबर्ट कोच (Robert Koch - Father of Modern Bacteriology)", "एडवर्ड जेनर", "रोनाल्ड रॉस"),
            listOf("Louis Pasteur", "Robert Koch (Nobel Prize in Physiology or Medicine 1905)", "Edward Jenner", "Ronald Ross"),
            1,
            "रॉबर्ट कोच ने टीबी के जीवाणु (माइकोबैक्टीरियम ट्यूबरकुलोसिस), हैजा के जीवाणु (विब्रियो कोलेरी) और एंथ्रेक्स के बीजाणुओं की खोज की। उन्होंने सिद्ध किया कि विशिष्ट रोग विशिष्ट रोगाणुओं से होते हैं।",
            "Robert Koch established rigorous Koch's postulates linking specific bacterial agents to diseases, isolating the pathogens of Anthrax, Tuberculosis, and Cholera.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q11", "sci_5",
            "मलेरिया परजीवी (Plasmodium) का जीवन चक्र और मादा एनाफिलीज मच्छर द्वारा इसके संचरण की खोज 1897 में सिकंदराबाद (भारत) में किसने की थी?",
            "Who discovered in 1897 in Secunderabad, India, that Malaria is transmitted to humans by female Anopheles mosquitoes (Nobel Prize 1902)?",
            listOf("रॉबर्ट कोच", "सर रोनाल्ड रॉस (Sir Ronald Ross)", "चार्ल्स लावेरन", "अलेक्जेंडर फ्लेमिंग"),
            listOf("Robert Koch", "Sir Ronald Ross (British physician in Indian Medical Service)", "Charles Laveran", "Alexander Fleming"),
            1,
            "रोनाल्ड रॉस ने मादा एनाफिलीज मच्छर के आमाशय में प्लास्मोडियम परजीवी के ऊसिस्ट खोजे और सिद्ध किया कि मच्छर ही मलेरिया फैलाते हैं। इस खोज के लिए उन्हें 1902 का नोबेल पुरस्कार मिला।",
            "Sir Ronald Ross demonstrated the mosquito-borne lifecycle of Plasmodium sporozoites in female Anopheles mosquitoes in India, earning the 1902 Nobel Prize.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q12", "sci_5",
            "मलेरिया के उपचार में प्रयुक्त प्रसिद्ध प्राकृतिक दवा 'कुनैन' (Quinine) किस वृक्ष की छाल से प्राप्त की जाती है?",
            "The traditional antimalarial alkaloid drug 'Quinine' is harvested from the dried bark of which South American medicinal tree?",
            listOf("नीम का पेड़", "सिनकोना का वृक्ष (Cinchona tree - Cinchona officinalis)", "यूकेलिप्टस", "सर्पगंधा"),
            listOf("Neem tree", "Cinchona Tree (Cinchona calisaya / ledgeriana bark)", "Eucalyptus", "Rauvolfia serpentina"),
            1,
            "सिनकोना वृक्ष की छाल से 'कुनैन' (Quinine) और सिनकोनिडीन क्षार प्राप्त होते हैं जो प्लास्मोडियम के हीमोजॉइन क्रिस्टल निर्माण को रोककर मलेरिया का उपचार करते हैं। आधुनिक दवा 'आर्टिमिसिनिन' है।",
            "Quinine is a natural white crystalline alkaloid extracted from the bark of the Cinchona tree, acting as a schizonticide against Plasmodium parasites.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q13", "sci_5",
            "एड्स (AIDS - Acquired Immunodeficiency Syndrome) किस रेट्रोवायरस के कारण होता है और यह प्रतिरक्षा तंत्र की किन कोशिकाओं को नष्ट करता है?",
            "AIDS is caused by the human immunodeficiency virus (HIV), an enveloped RNA retrovirus that selectively infects and destroys:",
            listOf("लाल रक्त कोशिकाएं (RBC)", "सहायक टी-लिम्फोसाइट्स / CD4+ T-Cells (Helper T-Cells)", "न्यूट्रोफिल", "प्लेटलेट्स"),
            listOf("Erythrocytes (RBC)", "CD4+ T-Helper Lymphocytes (Helper T-cells)", "Neutrophils", "Thrombocytes"),
            1,
            "HIV अपने ग्लाइकोप्रोटीन gp120 द्वारा CD4+ T-लिम्फोसाइट कोशिकाओं में प्रवेश करता है और रिवर्स ट्रांसक्रिप्टेज एंजाइम द्वारा अपने RNA से DNA बनाकर कोशिका को नष्ट करता है, जिससे प्रतिरक्षा समाप्त हो जाती है।",
            "HIV targets CD4 surface receptors on Helper T-lymphocytes, destroying cell-mediated immunity until secondary opportunistic infections define full-blown AIDS.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q14", "sci_5",
            "एड्स (HIV) की पुष्टि के लिए प्रारंभिक स्क्रीनिंग टेस्ट और अंतिम पुष्टिकरण टेस्ट क्रमशः कौन-से हैं?",
            "What are the standard Primary Screening Test and Definitive Confirmatory Test for clinical HIV infection diagnosis?",
            listOf("विडाल टेस्ट और मोंटौक्स टेस्ट", "एलिसा टेस्ट (ELISA) और वेस्टर्न ब्लॉट टेस्ट (Western Blot / PCR Test)", "ईसीजी और ईईजी", "बायोप्सी और एंडोस्कोपी"),
            listOf("Widal and Mantoux tests", "ELISA (Enzyme-Linked Immunosorbent Assay) and Western Blot / RT-PCR Test", "ECG and EEG", "Biopsy and Endoscopy"),
            1,
            "एलिसा (ELISA) रक्त में HIV एंटीबॉडी की त्वरित स्क्रीनिंग करता है। यदि एलिसा पॉजिटिव आए, तो पुष्टि के लिए वेस्टर्न ब्लॉट (Western Blot) या वायरल लोड के लिए RT-PCR टेस्ट किया जाता है।",
            "Initial HIV screening utilizes 4th generation ELISA immunoassays detecting p24 antigens and antibodies, confirmed via Western Blot or RT-PCR nucleic acid assays.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m7_q15", "sci_5",
            "टाइफाइड (मियादी बुखार / Typhoid Fever) के निदान के लिए कौन-सा प्रसिद्ध सीरोलॉजिकल परीक्षण किया जाता है?",
            "Which diagnostic serological agglutination test is clinically performed to detect antibodies against Salmonella Typhi (Typhoid Fever)?",
            listOf("एलिसा टेस्ट", "विडाल टेस्ट (Widal Test - खोजकर्ता जॉर्जेस फर्नांड विडाल)", "मोंटौक्स टेस्ट (TB के लिए)", "शिक टेस्ट (डिप्थीरिया के लिए)"),
            listOf("ELISA Test", "Widal Test (Measures O and H agglutinin titers against Salmonella)", "Mantoux Test (Tuberculosis)", "Schick Test (Diphtheria)"),
            1,
            "विडाल टेस्ट (Widal Test) साल्मोनेला टाइफी जीवाणु के O (दैहिक) और H (कशाभिकीय) एंटीजन के खिलाफ रोगी के सीरम में एंटीबॉडी की सांद्रता को मापता है।",
            "The Widal Test demonstrates rising antibody agglutination titers against Salmonella enterica serotype Typhi O and H antigens in suspected enteric fever cases.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 8 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m8_q1", "sci_5",
            "बीसीजी (BCG - Bacillus Calmette-Guérin) का टीका नवजात शिशुओं को किस गंभीर संक्रामक रोग से बचाव के लिए लगाया जाता है?",
            "The BCG (Bacillus Calmette-Guérin) vaccine, developed in 1921, is routinely administered to infants to confer immunity against:",
            listOf("पोलियो", "तपेदिक / क्षयरोग / टीबी (Tuberculosis - Mycobacterium tuberculosis)", "हैजा", "खसरा"),
            listOf("Polio", "Tuberculosis / TB (Caused by Mycobacterium tuberculosis)", "Cholera", "Measles"),
            1,
            "अल्बर्ट कैलमेट और केमिली गुएरिन द्वारा विकसित बीसीजी का टीका जीवित कमजोर माइकोबैक्टीरियम बोविस बैक्टीरिया से बना है। यह नवजात शिशुओं को टीबी मेनिनजाइटिस से सुरक्षा देता है।",
            "BCG vaccine utilizes an attenuated live strain of Mycobacterium bovis to protect neonates against disseminated and meningeal Tuberculosis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q2", "sci_5",
            "डीपीटी (DPT Triple Vaccine) का टीका किन तीन जानलेवा जीवाणु जनित रोगों से सुरक्षा प्रदान करता है?",
            "The pediatric DPT combination vaccine confers active immunization against which three deadly bacterial infectious diseases?",
            listOf("डायबिटीज, पोलियो, टिटनेस", "डिप्थीरिया, पर्टुसिस (काली खांसी) और टिटनेस (Diphtheria, Pertussis / Whooping Cough, and Tetanus)", "डेंगू, प्लेग, टाइफाइड", "डायरिया, निमोनिया, टीबी"),
            listOf("Diabetes, Polio, Tetanus", "Diphtheria (Corynebacterium), Pertussis / Whooping Cough (Bordetella), and Tetanus (Clostridium tetani)", "Dengue, Plague, Typhoid", "Diarrhea, Pneumonia, TB"),
            1,
            "DPT टीका डिप्थीरिया (गलघोंटू), पर्टुसिस (काली खांसी/Whooping cough) और टिटनेस (धनुस्तंभ/Lockjaw) के टॉक्सॉइड्स और मृत जीवाणुओं से तैयार किया जाता है।",
            "DPT vaccine combines diphtheria toxoid, killed Bordetella pertussis bacteria, and tetanus toxoid into a single trivalent childhood injection.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q3", "sci_5",
            "हाइड्रोफोबिया (Hydrophobia / पानी से अत्यधिक डर) किस घातक वायरल रोग का प्रमुख लक्षण है जो पागल कुत्ते के काटने से फैलता है?",
            "Hydrophobia (extreme fear of swallowing liquids due to severe painful laryngeal spasms) is the clinical hallmark of fatal:",
            listOf("मलेरिया", "रेबीज / जलांतक (Rabies - Rhabdovirus / Lyssavirus)", "टिटनेस", "हैजा"),
            listOf("Malaria", "Rabies / Hydrophobia (Transmitted via saliva of rabid dogs and bats)", "Tetanus", "Cholera"),
            1,
            "रेबीज एक न्यूरोट्रोपिक रैबडोवायरस है जो केंद्रीय तंत्रिका तंत्र को संक्रमित करता है। ग्रसनी की मांसपेशियों में तीव्र ऐंठन के कारण रोगी पानी पीने से डरता है (हाइड्रोफोबिया)।",
            "Rabies virus migrates retrogradely along peripheral nerves to the encephalon, provoking acute encephalomyelitis and pharyngeal spasms triggered by attempting to swallow liquids (Hydrophobia).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q4", "sci_5",
            "डेंगू बुखार (Dengue Fever / हड्डी तोड़ बुखार) किस वायरस के कारण होता है और इसका वाहक कौन-सा मच्छर है?",
            "Dengue ('Breakbone Fever') is caused by an arboviral Flavivirus transmitted predominantly by the bite of daytime-biting:",
            listOf("मादा एनाफिलीज मच्छर", "मादा एडीज इजिप्टी मच्छर (Female Aedes aegypti / Tiger Mosquito)", "मादा क्यूलेक्स मच्छर", "बालू मक्खी (Sandfly)"),
            listOf("Anopheles mosquito (Malaria)", "Female Aedes aegypti mosquito (Striped Tiger mosquito - also transmits Chikungunya, Zika, Yellow Fever)", "Culex mosquito (Filariasis)", "Sandfly (Kala-azar)"),
            1,
            "एडीज इजिप्टी (Aedes aegypti) मच्छर दिन के समय काटता है और साफ ठहरे पानी में पनपता है। डेंगू में रक्त प्लेटलेट्स की संख्या तेजी से घट जाती है (Thrombocytopenia)।",
            "Dengue virus is transmitted by female Aedes aegypti mosquitoes. Severe dengue induces plasma leakage, hemorrhagic shock, and critical thrombocytopenia (drop in platelet counts).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q5", "sci_5",
            "हाथीपांव या फाइलेरिया (Elephantiasis / Lymphatic Filariasis) रोग किस परजीवी कृमि और किस मच्छर के काटने से होता है?",
            "Lymphatic Filariasis (Elephantiasis), causing severe swelling of lower limbs, is caused by Wuchereria bancrofti nematode transmitted by:",
            listOf("एडीज मच्छर", "मादा क्यूलेक्स मच्छर (Female Culex mosquito)", "एनाफिलीज मच्छर", "घरेलू मक्खी"),
            listOf("Aedes mosquito", "Female Culex quinquefasciatus mosquito (transmitting Wuchereria bancrofti microfilariae)", "Anopheles mosquito", "Housefly"),
            1,
            "वुचेरेरिया ब्रैंकोफ्टी (Wuchereria bancrofti) फाइलेरियल कृमि लसिका वाहिकाओं (Lymph vessels) में जमा होकर उन्हें अवरुद्ध कर देते हैं, जिससे पैरों और अंडकोष में भारी सूजन (हाथी जैसा पैर) आ जाती है।",
            "Adult Wuchereria bancrofti worms lodge in human lymphatic channels, provoking chronic inflammation, lymphatic obstruction, and massive fibro-edematous enlargement of extremities.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q6", "sci_5",
            "कालाजार (Kala-azar / Black Fever / Visceral Leishmaniasis) रोग किस प्रोटोजोआ परजीवी द्वारा होता है और इसका वाहक कीट कौन-सा है?",
            "Visceral Leishmaniasis (Kala-Azar / Dumdum Fever), characterized by irregular fever, anemia, and massive splenomegaly, is transmitted by the bite of:",
            listOf("सीसी मक्खी (Tsetse fly)", "बालू मक्खी / सैंडफ्लाई (Sandfly - Phlebotomus argentipes carrying Leishmania donovani)", "खटमल", "पिस्सू"),
            listOf("Tsetse fly (Sleeping sickness)", "Sandfly (Phlebotomus argentipes transmitting protozoan Leishmania donovani)", "Bedbug", "Flea (Plague)"),
            1,
            "कालाजार लीशमैनिया डोनोवानी (Leishmania donovani) प्रोटोजोआ द्वारा होता है जिसे मादा बालू मक्खी (Sandfly) फैलाती है। यह यकृत, प्लीहा (तिल्ली) और अस्थिमज्जा को गंभीर क्षति पहुंचाता है।",
            "Leishmania donovani is an intracellular protozoan transmitted by female Phlebotomine sandflies, invading reticuloendothelial phagocytes and causing fatal visceral leishmaniasis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q7", "sci_5",
            "अफ्रीकी निद्रारोग (African Sleeping Sickness) किस प्रोटोजोआ द्वारा होता है और इसका वाहक कौन-सी मक्खी है?",
            "African Trypanosomiasis (Sleeping Sickness), which disrupts sleep cycles and leads to coma, is caused by Trypanosoma brucei transmitted by the:",
            listOf("सैंडफ्लाई", "त्सेत्से मक्खी (Tsetse Fly - Glossina species)", "मच्छर", "घरेलू मक्खी"),
            listOf("Sandfly", "Tsetse Fly (Glossina genus carrying Trypanosoma brucei gambiense/rhodesiense)", "Mosquito", "Housefly"),
            1,
            "त्सेत्से मक्खी (Tsetse fly) के काटने से ट्रिपैनोसोमा परजीवी रक्त और सेरेब्रोस्पाइनल द्रव (CSF) में पहुंच जाता है, जिससे मस्तिष्क में सूजन, गंभीर दिन की नींद और अंततः कोमा हो जाता है।",
            "Trypanosoma brucei parasites cross the blood-brain barrier after tsetse fly inoculation, causing somnolence, sensory ataxia, and terminal neurological coma.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q8", "sci_5",
            "काली मौत (Black Death / Plague) किस जीवाणु के कारण फैलती है और इसका प्राथमिक वाहक कौन-सा कीट है?",
            "The historic 'Black Death' (Bubonic Plague) is caused by the bacterium Yersinia pestis, transmitted from infected rodents to humans by:",
            listOf("मच्छर", "चूहे के पिस्सू (Rat Flea - Xenopsylla cheopis)", "खटमल", "जूँ"),
            listOf("Mosquito", "Rat Fleas (Oriental rat flea - Xenopsylla cheopis parasitizing Rattus rattus)", "Bedbug", "Body louse (Typhus)"),
            1,
            "प्लेग यर्सिनिया पेस्टिस (Yersinia pestis) जीवाणु द्वारा होता है। जंगली और घरेलू चूहों पर रहने वाले पिस्सू (Xenopsylla cheopis) चूहों के मरने पर इंसानों को काटकर गिल्टीदार ब्यूबोनिक प्लेग फैलाते हैं।",
            "Yersinia pestis proliferates in rodent reservoirs and is transmitted by Xenopsylla cheopis flea bites into human lymph nodes, creating agonizing buboes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q9", "sci_5",
            "मानव लार (Saliva) में कौन-सा पाचक एंजाइम पाया जाता है जो स्टार्च (Starch) को माल्टोज शर्करा में तोड़ता है?",
            "Which digestive enzyme present in human saliva hydrolyzes dietary starches and polysaccharides into maltose disaccharides?",
            listOf("पेप्सिन", "लार एमाइलेज / टायलिन (Salivary Amylase / Ptyalin)", "ट्रिप्सिन", "लाइपेज"),
            listOf("Pepsin (Gastric protein digestion)", "Salivary Amylase / Ptyalin (Hydrolyzes α-1,4-glycosidic bonds)", "Trypsin", "Lipase"),
            1,
            "लार ग्रंथियां प्रतिदिन लगभग 1.5 लीटर लार स्रावित करती हैं (pH 6.8)। इसमें 'टायलिन' (लार एमाइलेज) स्टार्च के 30% भाग को माल्टोज में बदल देता है, तथा लाइसोजाइम जीवाणुओं को मारता है।",
            "Ptyalin (salivary alpha-amylase) initiates carbohydrate breakdown in the buccal cavity by cleaving starch polymers into maltose and dextrins at pH ~6.8.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q10", "sci_5",
            "आमाशय (Stomach / जठर) के जठर रस में कौन-सा अम्ल पाया जाता है जो जीवाणुओं को मारता है और पेप्सिनोजेन को सक्रिय पेप्सिन में बदलता है?",
            "Which strong inorganic mineral acid is secreted by the Parietal (Oxyntic) cells of the gastric mucosa (maintaining pH ~1.5 to 2.0)?",
            listOf("सल्फ्यूरिक अम्ल", "हाइड्रोक्लोरिक अम्ल (Hydrochloric Acid - HCl)", "नाइट्रिक अम्ल", "एसिटिक अम्ल"),
            listOf("Sulfuric acid", "Hydrochloric Acid (HCl - gastric acid)", "Nitric acid", "Acetic acid"),
            1,
            "आमाशय की पैराइटल कोशिकाएं HCl स्रावित करती हैं। यह भोजन के साथ आए हानिकारक बैक्टीरिया को नष्ट करता है और निष्क्रिय पेप्सिनोजेन को प्रोटीन पाचक सक्रिय पेप्सिन (Pepsin) में सक्रिय करता है।",
            "Gastric Parietal cells employ proton pumps (H⁺/K⁺-ATPase) to secrete concentrated Hydrochloric Acid (HCl), establishing pH ~1.8 to activate Pepsin for protein proteolysis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q11", "sci_5",
            "भोजन के सभी पोषक तत्वों (कार्बोहाइड्रेट, प्रोटीन, वसा) का पूर्ण पाचन और पचे हुए भोजन का अवशोषण (Absorption) आहार नाल के किस भाग में होता है?",
            "In which anatomical segment of the human gastrointestinal tract does the complete chemical digestion of macronutrients and maximum nutrient absorption occur?",
            listOf("आमाशय (Stomach)", "छोटी आंत (Small Intestine - विशेष रूप से ग्रहणी और जेजुनम/इलियाम के विली में)", "बड़ी आंत (Large Intestine)", "ग्रासनली (Esophagus)"),
            listOf("Stomach", "Small Intestine (Duodenum, Jejunum, and Ileum microvilli)", "Large Intestine (Water absorption)", "Esophagus"),
            1,
            "छोटी आंत (~6 मीटर लंबी) में पित्त रस, अग्न्याशयी रस और आंत्रीय रस मिलकर भोजन का पूर्ण पाचन करते हैं। इसकी आंतरिक भित्ति पर लाखों रसांकुर (Villi) और सूक्ष्मांकुर होते हैं जो पोषक तत्वों को अवशोषित करते हैं।",
            "The Small Intestine is the ultimate site of complete digestion and absorption, leveraging its expansive brush border microvillar surface area (~250 m²).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q12", "sci_5",
            "अत्यधिक शारीरिक व्यायाम या दौड़ने के बाद मांसपेशियों में ऐंठन और दर्द (Muscle Fatigue & Cramps) किस अम्ल के अवायवीय जमाव के कारण होता है?",
            "Acute muscle soreness and fatigue during intense anaerobic exercise occur due to the accumulation of which metabolic byproduct in myocytes?",
            listOf("एसिटिक अम्ल", "लैक्टिक अम्ल (Lactic Acid - CH₃CH(OH)COOH)", "पाइरुविक अम्ल", "यूरिक अम्ल"),
            listOf("Acetic acid", "Lactic Acid (Formed via anaerobic glycolysis during cellular hypoxia)", "Pyruvic acid", "Uric acid"),
            1,
            "तीव्र व्यायाम के समय जब मांसपेशियों को पर्याप्त O₂ नहीं मिलती, तो कोशिकाएं अवायवीय श्वसन करती हैं। ग्लूकोज पाइरुवेट से लैक्टिक अम्ल में बदल जाता है। लैक्टिक एसिड के जमाव से मांसपेशियों में ऐंठन और थकावट होती है।",
            "Under skeletal muscle hypoxia, lactate dehydrogenase converts pyruvate into Lactic Acid to regenerate NAD⁺, causing temporary intracellular acidosis and cramp fatigue.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q13", "sci_5",
            "जोड़ों में यूरिक एसिड (Uric Acid) के मोनोसोडियम यूरेट क्रिस्टल जमा होने से होने वाले अत्यधिक दर्दनाक गठिया रोग को क्या कहते हैं?",
            "Which painful metabolic arthritis is caused by the hyperuricemic deposition of sharp needle-like Monosodium Urate crystals in synovial joints (especially the big toe)?",
            listOf("ओस्टियोआर्थराइटिस", "गाउट / गठिया वात (Gout / Podagra)", "रुमेटाइड आर्थराइटिस", "रिकेट्स"),
            listOf("Osteoarthritis", "Gout (Podagra / Crystal-induced arthropathy)", "Rheumatoid arthritis (Autoimmune)", "Rickets"),
            1,
            "प्यूरीन युक्त भोजन के अधिक सेवन या गुर्दों द्वारा यूरिक एसिड कम उत्सर्जित होने पर रक्त में यूरिक एसिड बढ़ जाता है और इसके नुकीले क्रिस्टल जोड़ों में जमा होकर तीव्र सूजन और दर्द पैदा करते हैं (गाउट)।",
            "Gout is an inflammatory crystal arthropathy resulting from chronic hyperuricemia, precipitating needle-shaped monosodium urate monohydrate crystals within articular cartilage.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q14", "sci_5",
            "मानव खोपड़ी (Human Skull) में कुल कितनी अस्थियां (हड्डियां) पाई जाती हैं?",
            "How many total bones constitute the complete Human Skull (Cranium + Facial bones)?",
            listOf("14", "22 अस्थियां (कपाल: 8 + चेहरा: 14; कर्ण अस्थियां 6 और हायॉइड 1 मिलाकर 29)", "8", "33"),
            listOf("14 (Facial bones only)", "22 Bones (Cranium: 8 + Facial: 14; 29 including 6 middle-ear ossicles and 1 hyoid)", "8 (Cranial bones only)", "33 (Vertebrae)"),
            1,
            "मानव खोपड़ी में 22 मुख्य हड्डियां होती हैं: 8 कपाल (Cranial) हड्डियां जो मस्तिष्क की रक्षा करती हैं और 14 चेहरे (Facial) की हड्डियां। कान की 6 अस्थियों और 1 कंठिका (Hyoid) को जोड़ने पर कुल 29 होती हैं।",
            "The human skull comprises 22 bones joined by immovable sutures: 8 neurocranial bones encasing the brain and 14 viscerocranial facial bones.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m8_q15", "sci_5",
            "मानव चेहरे की एकमात्र गतिशील (Movable) हड्डी और शरीर की सबसे मजबूत जबड़े की हड्डी कौन-सी है?",
            "Which is the ONLY movable bone in the human skull and the strongest, largest bone of the human face?",
            listOf("मैक्सिला (ऊपरी जबड़ा)", "मैंडिबल / निचला जबड़ा (Mandible / Lower Jawbone)", "जाइगोमैटिक", "नासास्थि"),
            listOf("Maxilla (Upper jaw)", "Mandible (Lower jawbone - articulates at the temporomandibular joint)", "Zygomatic (Cheekbone)", "Nasal bone"),
            1,
            "निचला जबड़ा 'मैंडिबल' (Mandible) खोपड़ी की एकमात्र गतिशील हड्डी है (टेंपोरोमैंडिबुलर जोड़ पर गति करती है)। यह चबाने और बोलने के लिए भोजन को पीसने की विशाल पेशीय शक्ति सहन करती है।",
            "The Mandible is the sole movable skull bone, anchoring the lower dentition and articulating bilaterally with temporal bones at the TMJ synovial joint.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 9 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m9_q1", "sci_5",
            "मानव मेरुदंड (Vertebral Column / रीढ़ की हड्डी) में वयस्कों में कुल कितनी कशेरुकाएं (Vertebrae) होती हैं?",
            "How many individual Vertebral segments form the adult human spinal column (cervical, thoracic, lumbar, sacrum, and coccyx)?",
            listOf("24", "26 कशेरुकाएं (शिशु में 33: C7, T12, L5, Sacrum 1 [5 फ्यूज्ड], Coccyx 1 [4 फ्यूज्ड])", "33", "20"),
            listOf("24", "26 Vertebrae in adults (Cervical: 7, Thoracic: 12, Lumbar: 5, Sacrum: 1, Coccyx: 1; fused from 33 infantile segments)", "33 (Infant vertebrae)", "20"),
            1,
            "वयस्क में 26 कशेरुकाएं होती हैं: ग्रीवा (Cervical - 7), वक्षीय (Thoracic - 12), कटि (Lumbar - 5), त्रिक (Sacrum - 1, जो 5 से जुड़कर बनी है), और पुच्छ (Coccyx - 1, जो 4 से जुड़कर बनी है)।",
            "The adult vertebral column comprises 26 bones: 7 cervical, 12 thoracic, 5 lumbar, 1 fused sacrum (5 segments), and 1 fused coccyx (4 segments).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q2", "sci_5",
            "मानव वक्ष गुहा में कुल कितनी पसलियां (Ribs) पाई जाती हैं?",
            "How many pairs (and total number) of Ribs form the thoracic rib cage in human anatomy?",
            listOf("10 जोड़े (20 पसलियां)", "12 जोड़े / कुल 24 पसलियां (12 Pairs / 24 Ribs)", "14 जोड़े (28 पसलियां)", "7 जोड़े (14 पसलियां)"),
            listOf("10 pairs (20 ribs)", "12 Pairs / 24 Total Ribs (True ribs: 1-7, False ribs: 8-10, Floating ribs: 11-12)", "14 pairs", "7 pairs"),
            1,
            "मानव में 12 जोड़ी (24) पसलियां होती हैं: 1 से 7 जोड़ी 'सत्य पसलियां' (True ribs) स्टर्नम से सीधी जुड़ती हैं, 8 से 10 'असत्य पसलियां' (False ribs) 7वीं पसली से जुड़ती हैं, और 11-12वीं जोड़ी 'प्लावी पसलियां' (Floating ribs) आगे खुली रहती हैं।",
            "The human ribcage consists of 12 pairs of ribs: 7 pairs of True ribs (vertebrosternal), 3 pairs of False ribs (vertebrochondral), and 2 pairs of Floating ribs (vertebral).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q3", "sci_5",
            "मानव शरीर में मांसपेशियों (Muscles) की कुल संख्या लगभग कितनी होती है?",
            "Approximately how many skeletal and voluntary Muscles are identified across the human muscular system?",
            listOf("206", "लगभग 639 मांसपेशियां (Approximately ~639-650 Muscles)", "500", "850"),
            listOf("206 (Number of bones)", "Approximately 639 to 650 Muscles", "500", "850"),
            1,
            "मानव शरीर में लगभग 639 से 650 मांसपेशियां होती हैं। शरीर की सबसे बड़ी मांसपेशी नितंब की 'ग्लूटियस मैक्सिमस' (Gluteus maximus) है और सबसे छोटी कान की 'स्टेपिडियस' (Stapedius - ~1 मिमी) है।",
            "The human body contains approximately 639 named skeletal muscles. The Gluteus Maximus is the largest muscle, while the Stapedius in the middle ear is the smallest.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q4", "sci_5",
            "शरीर की सबसे लंबी मांसपेशी (Longest Muscle) कौन-सी है जो जांघ के पार तिरछी जाती है?",
            "Which is the Longest individual Muscle in the human body, extending from the pelvis diagonally across the thigh to the tibia?",
            listOf("ग्लूटियस मैक्सिमस", "सार्टोरियस मांसपेशी / दर्जी पेशी (Sartorius Muscle / Tailor's Muscle)", "बाइसेप्स", "लैटिसिमस डोर्सी"),
            listOf("Gluteus maximus (Largest muscle)", "Sartorius Muscle ('Tailor's Muscle' - longest muscle ribbon)", "Biceps brachii", "Latissimus dorsi"),
            1,
            "सार्टोरियस (Sartorius) जांघ के अग्र भाग में स्थित एक लंबी, पतली फीते जैसी मांसपेशी है जो कूल्हे और घुटने दोनों को मोड़ने में मदद करती है (दर्जी की तरह पालथी मारकर बैठने में प्रयुक्त)।",
            "The Sartorius is a long, strap-like muscle traversing the anterior compartment of the thigh, functioning as a flexor and lateral rotator of the hip and knee joints.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q5", "sci_5",
            "अस्थियों को मांसपेशियों से जोड़ने वाले मजबूत संयोजी ऊतक (Dense Regular Connective Tissue) को क्या कहते हैं?",
            "Which fibrous collagenous band of connective tissue anchors Muscle to Bone?",
            listOf("लिगामेंट / स्नायु", "टेंडन / कंडरा (Tendon - जैसे Achilles Tendon)", "उपास्थि / कार्टिलेज", "एरियोलर ऊतक"),
            listOf("Ligament (Connects Bone to Bone)", "Tendon (Anchors Muscle to Bone)", "Cartilage", "Areolar tissue"),
            1,
            "कंडरा (Tendon) मांसपेशी को हड्डी से जोड़ता है (जैसे एड़ी का अकिलीज टेंडन)। स्नायु (Ligament) हड्डी को दूसरी हड्डी से जोड़ता है।",
            "Tendons are inelastic fibrous cords of dense regular collagen connective tissue that transmit tensile muscle contractile forces to bones. Ligaments connect bone to bone.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q6", "sci_5",
            "अस्थि को दूसरी अस्थि (Bone to Bone) से जोड़ने वाले लचीले संयोजी ऊतक को क्या कहते हैं?",
            "What is the elastic fibrous connective tissue that stabilizes joints by connecting Bone to Bone?",
            listOf("टेंडन", "लिगामेंट / स्नायु (Ligament)", "मांसपेशी", "तंत्रिका"),
            listOf("Tendon (Muscle to Bone)", "Ligament (Bone to Bone articulation stabilizer)", "Muscle", "Nerve"),
            1,
            "लिगामेंट (स्नायु) हड्डियों को जोड़ों पर आपस में बांधकर स्थिरता प्रदान करते हैं। लिगामेंट के अत्यधिक खिंचने या फटने को 'मोच' (Sprain) कहते हैं।",
            "Ligaments are tough, flexible bands of fibrous elastic tissue that bind articular bone ends together to limit excessive joint motion and prevent dislocation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q7", "sci_5",
            "मानव हृदय में कुल कितने कक्ष (Chambers) होते हैं और शुद्ध (ऑक्सीजनयुक्त) रक्त किस ओर बहता है?",
            "How many Chambers exist in the human heart, and through which side does fully oxygenated blood circulate?",
            listOf("3 कक्ष, दाएं भाग में", "4 कक्ष (2 आलिंद, 2 निलय); शुद्ध रक्त बाएं भाग (Left Atrium & Left Ventricle) में बहता है", "2 कक्ष", "4 कक्ष, दाएं भाग में"),
            listOf("3 chambers", "4 Chambers (2 Atria and 2 Ventricles); Oxygenated blood flows through the Left side", "2 chambers (Fish heart)", "4 chambers, Right side"),
            1,
            "मानव हृदय में 4 कक्ष होते हैं: दायां आलिंद व दायां निलय (अशुद्ध/डीऑक्सीजनेटेड रक्त फेफड़ों में भेजते हैं); बायां आलिंद व बायां निलय (फेफड़ों से शुद्ध ऑक्सीजनयुक्त रक्त महाधमनी द्वारा पूरे शरीर में पंप करते हैं)।",
            "The human heart has 4 muscular chambers. Deoxygenated blood is processed in the right side; pulmonary veins return oxygenated blood to the left atrium and powerful left ventricle.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q8", "sci_5",
            "मानव शरीर में शुद्ध (ऑक्सीजनयुक्त) रक्त ले जाने वाली एकमात्र शिरा (Vein) और अशुद्ध रक्त ले जाने वाली एकमात्र धमनी (Artery) क्रमशः कौन-सी हैं?",
            "Which are the ONLY Vein carrying oxygen-rich blood and the ONLY Artery carrying oxygen-poor deoxygenated blood in the human body?",
            listOf("जुगुलर शिरा और कैरोटिड धमनी", "फुफ्फुसीय शिरा (Pulmonary Vein) और फुफ्फुसीय धमनी (Pulmonary Artery)", "रीनल शिरा और रीनल धमनी", "हेपेटिक शिरा और हेपेटिक धमनी"),
            listOf("Jugular vein and carotid artery", "Pulmonary Vein (oxygenated) and Pulmonary Artery (deoxygenated)", "Renal vein and artery", "Hepatic vein and artery"),
            1,
            "अपवाद: सामान्यतः धमनियां शुद्ध और शिराएं अशुद्ध रक्त ले जाती हैं। परन्तु फुफ्फुसीय धमनी (Pulmonary artery) हृदय से अशुद्ध रक्त फेफड़ों में ले जाती है, और फुफ्फुसीय शिरा (Pulmonary vein) फेफड़ों से शुद्ध रक्त हृदय में लाती है।",
            "The Pulmonary Artery is the sole artery conveying deoxygenated venous blood (to lungs), while the four Pulmonary Veins deliver fully oxygenated blood from lungs to left atrium.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q9", "sci_5",
            "मानव शरीर की सबसे बड़ी धमनी (Largest Artery) कौन-सी है जो बाएं निलय से निकलकर पूरे शरीर में ऑक्सीजनयुक्त रक्त वितरित करती है?",
            "Which is the Largest and thickest-walled systemic blood vessel in the human cardiovascular system?",
            listOf("फुफ्फुसीय धमनी", "महाधमनी / एओर्टा (Aorta - diameter ~2.5 cm)", "कैरोटिड धमनी", "फेमोरल धमनी"),
            listOf("Pulmonary artery", "Aorta (Systemic trunk distributing cardiac output to systemic loop)", "Carotid artery", "Femoral artery"),
            1,
            "महाधमनी (Aorta) हृदय के बाएं निलय से उच्च दाब (~120 mmHg) पर शुद्ध रक्त प्राप्त करती है और अपनी शाखाओं द्वारा मस्तिष्क, अंगों और पूरे शरीर में वितरित करती है।",
            "The Aorta is the primary elastic conduit distributing oxygenated blood under pulsatile systemic systolic pressure to all visceral systemic capillary beds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q10", "sci_5",
            "शरीर से अशुद्ध (डीऑक्सीजनेटेड) रक्त को हृदय के दाएं आलिंद में वापस लाने वाली सबसे बड़ी शिराएं (Largest Veins) कौन-सी हैं?",
            "Which large venous trunks return all deoxygenated systemic venous blood into the Right Atrium of the heart?",
            listOf("फुफ्फुसीय शिराएं", "अग्र व पश्च महाशिरा (Superior and Inferior Vena Cava - IVC / SVC)", "कैरोटिड शिराएं", "रीनल शिराएं"),
            listOf("Pulmonary veins", "Superior and Inferior Vena Cava (SVC from upper body, IVC from lower body)", "Carotid veins", "Renal veins"),
            1,
            "इन्फीरियर वेना कावा (IVC) शरीर के निचले भाग से और सुपीरियर वेना कावा (SVC) सिर व भुजाओं से अशुद्ध रक्त लाकर दाएं आलिंद में डालती हैं। IVC शरीर की सबसे बड़ी शिरा है।",
            "The Inferior Vena Cava (IVC) and Superior Vena Cava (SVC) are the largest veins, funneling venous systemic return into the right cardiac chamber.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q11", "sci_5",
            "मानव शरीर में लाल रक्त कणिकाओं (RBC / Red Blood Cells) का निर्माण वयस्क अवस्था में कहाँ होता है?",
            "In healthy human adults, biological Erythropoiesis (RBC synthesis) occurs exclusively within the:",
            listOf("यकृत में", "लाल अस्थिमज्जा में (Red Bone Marrow in flat bones)", "प्लीहा में", "पीत अस्थिमज्जा में"),
            listOf("Liver (Fetal erythropoiesis)", "Red Bone Marrow (Myeloid tissue in sternum, ribs, pelvis, vertebrae)", "Spleen", "Yellow bone marrow"),
            1,
            "वयस्कों में RBC का निर्माण चपटी हड्डियों (पसलियों, स्टर्नम, रीढ़, श्रोणि) के 'लाल अस्थिमज्जा' (Red Bone Marrow) में होता है। भ्रूणीय अवस्था में RBC का निर्माण यकृत (Liver) और प्लीहा में होता है।",
            "Erythropoietin (EPO) hormone from kidneys stimulates hematopoietic stem cells in the trabecular Red Bone Marrow to produce ~2 million erythrocytes per second.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q12", "sci_5",
            "रक्त के थक्के के जमने के बाद बचा हुआ हल्का पीला तरल भाग, जिसमें थक्का जमाने वाले प्रोटीन (जैसे फाइब्रिनोजेन) नहीं होते, क्या कहलाता है?",
            "What is the clear, amber-colored fluid component of blood remaining after complete coagulation, essentially blood plasma devoid of fibrinogen and clotting factors?",
            listOf("प्लाज्मा", "सीरम (Blood Serum = Plasma - Fibrinogen / Clotting Factors)", "लसिका (Lymph)", "हीमोग्लोबिन"),
            listOf("Plasma (Contains fibrinogen)", "Serum (Blood Plasma minus Fibrinogen and Clotting Factors)", "Lymph", "Hemoglobin"),
            1,
            "सीरम (Serum) = प्लाज्मा - फाइब्रिनोजेन (और क्लॉटिंग फैक्टर्स)। सीरम कभी जमता नहीं है और इसमें एंटीबॉडीज, हार्मोन, इलेक्ट्रोलाइट्स व पोषक तत्व प्रचुर मात्रा में होते हैं।",
            "Blood Serum is whole plasma minus fibrinogen and coagulation clotting cascade factors, utilized extensively for diagnostic serology and immunological antibody assays.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q13", "sci_5",
            "मानव रक्त में प्लाज्मा (Plasma) का प्रतिशत कितना होता है और प्लाज्मा में जल का प्रतिशत कितना होता है?",
            "What is the volume percentage of Plasma in whole human blood, and what percentage of Plasma itself consists of pure water?",
            listOf("रक्त में 45% प्लाज्मा, 50% जल", "रक्त में लगभग 55% प्लाज्मा, और प्लाज्मा में लगभग 90-92% जल (Water)", "रक्त में 70% प्लाज्मा, 80% जल", "रक्त में 30% प्लाज्मा, 99% जल"),
            listOf("45% Plasma, 50% water", "Whole blood contains ~55% Plasma; Plasma contains ~90-92% Water (and 7-8% proteins: albumin, globulin, fibrinogen)", "70% Plasma", "30% Plasma"),
            1,
            "रक्त = 55% प्लाज्मा (द्रव भाग) + 45% संगठित तत्व (RBC, WBC, प्लेटलेट्स)। प्लाज्मा में 90-92% जल, 7% प्रोटीन (एल्ब्यूमिन, ग्लोबुलिन, फाइब्रिनोजेन), और 1-2% खनिज लवण व पोषक तत्व होते हैं।",
            "Whole blood volume is ~55% liquid plasma and 45% cellular hematocrit. Plasma consists of 91.5% water, 7% plasma proteins (Albumin 54%, Globulins 38%, Fibrinogen 7%), and 1.5% solutes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m9_q14", "sci_5",
            "मानव रक्त का परासरणी दबाव (Colloid Osmotic / Oncotic Pressure) बनाए रखने वाला सबसे प्रमुख प्लाज्मा प्रोटीन कौन-सा है?",
            "Which is the most abundant Plasma Protein (~54-60% of total plasma protein), synthesized by the liver to maintain colloid oncotic pressure and prevent edema?",
            listOf("ग्लोबुलिन", "सीरम एल्ब्यूमिन (Serum Albumin)", "फाइब्रिनोजेन", "प्रोथ्रोम्बिन"),
            listOf("Globulin (Immunity antibodies)", "Serum Albumin (Maintains vascular oncotic pressure)", "Fibrinogen (Blood clotting)", "Prothrombin"),
            1,
            "एल्ब्यूमिन (Albumin) रक्त वाहिकाओं के अंदर परासरणी खिंचाव (Oncotic pressure ~25 mmHg) बनाए रखता है जिससे रक्त का पानी बाहर ऊतकों में नहीं रिसता। इसकी कमी से शरीर में सूजन (Edema) आ जाती है।",
            "Albumin provides ~80% of intravascular colloid oncotic pressure, preventing plasma extravasation into interstitial spaces while serving as a transport carrier for hormones and drugs.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_5_m9_q15", "sci_5",
            "मानव प्रतिरक्षा प्रणाली में एंटीबॉडीज (Immunoglobulins - IgA, IgG, IgM, IgE, IgD) किस प्रकार के प्लाज्मा प्रोटीन होते हैं?",
            "Humoral immune Antibodies (Immunoglobulins: IgG, IgM, IgA, IgE, IgD) belong to which biochemical class of plasma proteins?",
            listOf("एल्ब्यूमिन", "गामा-ग्लोबुलिन (Gamma Globulins / Immunoglobulins)", "फाइब्रिनोजेन", "हिस्टोन"),
            listOf("Albumin", "Gamma-Globulins (Immunoglobulins secreted by plasma B-lymphocytes)", "Fibrinogen", "Histone"),
            1,
            "एंटीबॉडीज ग्लाइकोप्रोटीन अणु होते हैं जो प्लाज्मा B-कोशिकाओं द्वारा विशिष्ट एंटीजन के खिलाफ बनाए जाते हैं। ये ग्लोबुलिन प्रोटीन के 'गामा' अंश (Gamma globulins) में आते हैं।",
            "Immunoglobulins (antibodies) are Y-shaped gamma-globulin proteins produced by terminally differentiated B-plasma cells that bind and neutralize foreign microbial epitopes.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 10 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_5_m10_q1", "sci_5",
            "माता के प्रथम गाढ़े पीले दूध (Colostrum / खीस) में नवजात शिशु को निष्क्रिय प्रतिरक्षा (Passive Immunity) प्रदान करने वाला कौन-सा प्रमुख एंटीबॉडी पाया जाता है?",
            "Which dimeric secretory immunoglobulin antibody is abundantly present in maternal Colostrum (first breast milk), protecting the infant's mucosal gut lining?",
            listOf("IgG", "आईजीए (Secretory IgA - Immunoglobulin A)", "IgE", "IgM"),
            listOf("IgG (Crosses placenta)", "Secretory IgA (Dimeric mucosal defense antibody)", "IgE (Allergy mediator)", "IgM (Pentameric primary response)"),
            1,
            "कोलोस्ट्रम में प्रचुर मात्रा में 'IgA' एंटीबॉडी होती है जो नवजात के जठरांत्र मार्ग में रोगाणुओं के संक्रमण को रोकती है। 'IgG' एकमात्र ऐसी एंटीबॉडी है जो नाल (Placenta) को पार करके गर्भस्थ शिशु में पहुंचती है।",
            "Secretory IgA is the predominant mucosal immunoglobulin in breast milk colostrum, providing passive mucosal surface protection against gastrointestinal pathogens.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q2", "sci_5",
            "गर्भावस्था के दौरान माता के रक्त से गर्भनाल (Placenta) को पार करके भ्रूण में जाने वाली एकमात्र एंटीबॉडी कौन-सी है?",
            "Which is the ONLY monomeric immunoglobulin antibody capable of crossing the maternal-fetal Placental barrier to confer passive humoral immunity to the fetus?",
            listOf("IgA", "आईजीजी (Immunoglobulin G - IgG)", "IgM", "IgE"),
            listOf("IgA", "IgG (Immunoglobulin G - most abundant circulating antibody ~75-80%)", "IgM", "IgE"),
            1,
            "IgG रक्त में सबसे प्रचुर (75-80%) और सबसे छोटी एंटीबॉडी है। यह प्लेसेंटल सिंसिटियोट्रोफोब्लास्ट के FcRn रिसेप्टर्स द्वारा प्लेसेंटा को पार कर जन्म से पहले ही शिशु को प्रतिरक्षा कवच प्रदान करती है।",
            "IgG is the only antibody class capable of transplacental passage via FcRn receptor-mediated endocytosis, protecting the neonate during the first 6 months of life.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q3", "sci_5",
            "एलर्जी (Allergic Reactions) और अस्थमा के दौरान शरीर में किस प्रकार की एंटीबॉडी और किस रसायन (हिस्टामाइन) का स्राव बढ़ जाता है?",
            "In immediate Type I hypersensitivity (Allergies) and Asthma, mast cell degranulation of Histamine is triggered by which antibody?",
            listOf("IgG", "आईजीई (Immunoglobulin E - IgE)", "IgA", "IgM"),
            listOf("IgG", "IgE (Immunoglobulin E - binds high-affinity FcεRI receptors on Mast cells and Basophils)", "IgA", "IgM"),
            1,
            "धूल, परागकण या दवाओं की एलर्जी होने पर IgE एंटीबॉडी मास्ट कोशिकाओं से जुड़कर उनसे 'हिस्टामाइन' (Histamine) और सेरोटोनिन मुक्त कराती है, जिससे छींकें, त्वचा पर खुजली/चकत्ते और सांस फूलने की समस्या होती है।",
            "Allergen cross-linking of membrane-bound IgE on mast cells and basophils triggers explosive degranulation of Histamine and leukotrienes, causing acute anaphylaxis and asthma.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q4", "sci_5",
            "मानव आंख की पुतली (Pupil) का आकार प्रकाश की तीव्रता के अनुसार नियंत्रित करने वाला रंगीन पर्दा क्या कहलाता है?",
            "What is the pigmented, muscular contractile diaphragm of the eye that regulates pupil diameter to control the amount of light entering the retina?",
            listOf("कॉर्निया", "आइरिस / परितारिका (Iris)", "लेंस", "स्क्लेरा"),
            listOf("Cornea", "Iris (Contains radial and circular smooth muscles)", "Crystalline Lens", "Sclera"),
            1,
            "आइरिस (परितारिका) आंख का रंगीन भाग है (नीली, भूरी या काली आंखें आइरिस के मेलेनिन वर्णक पर निर्भर करती हैं)। यह तेज धूप में पुतली को सिकोड़ता है और अंधेरे में पुतली को फैला देता है।",
            "The Iris is an anterior ocular diaphragm containing sphincter pupillae and dilator pupillae muscles that dynamically modulate the aperture of the Pupil.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q5", "sci_5",
            "मानव आंख में आंसू (Tears) किस ग्रंथि द्वारा स्रावित होते हैं जिनमें जीवाणुनाशक 'लाइसोजाइम' (Lysozyme) एंजाइम होता है?",
            "Which exocrine gland located in the superolateral orbit secretes saline Lacrimal Fluid (Tears) containing antibacterial Lysozyme enzymes?",
            listOf("थायरॉयड ग्रंथि", "लैक्रिमल ग्रंथि / अश्रु ग्रंथि (Lacrimal Gland)", "पीयूष ग्रंथि", "स्वेद ग्रंथि"),
            listOf("Thyroid gland", "Lacrimal Gland (Tear gland)", "Pituitary gland", "Sweat gland"),
            1,
            "लैक्रिमल ग्रंथि आंसू बनाती है जो कॉर्निया को नम और साफ रखते हैं। आंसुओं में 'लाइसोजाइम' एंजाइम होता है जो बैक्टीरिया की कोशिका भित्ति के पेप्टिडोग्लाइकन को तोड़कर संक्रमण से बचाता है।",
            "The Lacrimal gland secretes tears across the conjunctiva containing antimicrobial Lysozyme and lactoferrin, draining via the nasolacrimal duct into the nasal cavity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q6", "sci_5",
            "मानव त्वचा की बाहरी मृत परत और बाल तथा नाखून मुख्य रूप से किस जल-अघुलनशील रेशेदार प्रोटीन के बने होते हैं?",
            "Human hair, fingernails, animal horns, and the stratum corneum epidermal layer are structurally composed of which tough, insoluble scleroprotein?",
            listOf("कोलेजन", "केराटिन (Keratin - Alpha-Keratin rich in Cysteine disulfide bonds)", "मायोसीन", "एल्ब्यूमिन"),
            listOf("Collagen (Dermal connective tissue)", "Keratin (α-Keratin structural fibrous protein)", "Myosin", "Albumin"),
            1,
            "केराटिन (Keratin) सल्फर-युक्त अमीनो एसिड (सिस्टीन) से भरपूर रेशेदार संरचनात्मक प्रोटीन है। इसके डाइसल्फाइड बंध इसे अत्यधिक सख्त, जल-रोधी और यांत्रिक आघातों के प्रति प्रतिरोधी बनाते हैं।",
            "Alpha-Keratins are structural helical fibrous proteins packed with cysteine disulfide crosslinks, providing mechanical resilience to epidermis, hair, and nails.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q7", "sci_5",
            "मानव त्वचा, बालों और आंखों की पुतली को उनका विशिष्ट रंग प्रदान करने वाला प्राकृतिक वर्णक (Pigment) कौन-सा है जो UV किरणों से रक्षा करता है?",
            "Which dark photoprotective biological pigment synthesized by epidermal Melanocytes absorbs hazardous Ultraviolet radiation?",
            listOf("हीमोग्लोबिन", "मेलेनिन (Melanin - Eumelanin and Pheomelanin)", "कैरोटीन", "रोडोप्सिन"),
            listOf("Hemoglobin", "Melanin (Synthesized from amino acid L-tyrosine)", "Carotene", "Rhodopsin"),
            1,
            "मेलेनोसाइट्स कोशिकाएं 'मेलेनिन' वर्णक बनाती हैं। अधिक धूप में त्वचा मेलेनिन बनाकर काली पड़ जाती है (Tanning) ताकि त्वचा कोशिकाओं के DNA को UV-किरणों से होने वाले कैंसर (मेलानोमा) से बचाया जा सके।",
            "Melanin polymers synthesized in basal melanocytes cap nuclear DNA in keratinocytes, dispersing UV light photons as harmless metabolic heat.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q8", "sci_5",
            "रंजकहीनता / रंजकहीनता विकार (Albinism / सूरजमुखी) किस एंजाइम की आनुवंशिक अनुपस्थिति के कारण मेलेनिन न बन पाने से होता है?",
            "Albinism, a congenital autosomal recessive condition characterized by complete absence of melanin pigment in skin, hair, and eyes, is caused by deficiency of:",
            listOf("पेप्सिन", "टायरोसिनेज एंजाइम (Tyrosinase Enzyme)", "एमाइलेज", "लाइपेज"),
            listOf("Pepsin", "Tyrosinase Enzyme (Copper-containing oxidase catalyzing tyrosine to DOPA)", "Amylase", "Lipase"),
            1,
            "टायरोसिनेज (Tyrosinase) एंजाइम टायरोसिन अमीनो एसिड को मेलेनिन में बदलता है। इस जीन के उत्परिवर्तन से मेलेनिन बिल्कुल नहीं बनता, जिससे त्वचा व बाल सफेद और आंखें गुलाबी-लाल दिखती हैं।",
            "Albinism results from mutations in the TYR gene encoding the copper enzyme Tyrosinase, preventing biological synthesis of melanin polymers from tyrosine.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_5_m10_q9", "sci_5",
            "मानव शरीर में यूरिया (Urea - NH₂CONH₂) का संश्लेषण अमोनिया और CO₂ से कहाँ होता है (ऑर्निथिन चक्र / Krebs-Henseleit Cycle)?",
            "In which vital organ does the biological Urea Cycle (Ornithine Cycle) convert toxic deaminated Ammonia (NH₃) into excretable Urea?",
            listOf("गुर्दे में (Kidneys)", "यकृत में (Liver / Hepatocytes)", "प्लीहा में", "फेफड़ों में"),
            listOf("Kidneys (Excretes urea in urine)", "Liver (Synthesizes urea via the hepatic Ornithine Cycle)", "Spleen", "Lungs"),
            1,
            "अमीनो एसिड के डी-एमिनेशन से बनने वाली अत्यंत विषैली अमोनिया को यकृत (Liver) में ऑर्निथिन चक्र द्वारा कम विषैले यूरिया में बदला जाता है, जिसे बाद में रक्त द्वारा गुर्दों में ले जाकर मूत्र में निकाला जाता है।",
            "Hepatic hepatocytes utilize mitochondrial and cytosolic enzymes in the Krebs-Henseleit Urea Cycle to detoxify waste ammonia into urea (2NH₃ + CO₂ → Urea + H₂O).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q10", "sci_5",
            "पक्षियों (Birds) और सरीसृपों (Reptiles) का मुख्य उत्सर्जी अपशिष्ट उत्पाद (Excretory Waste) क्या है जो जल संरक्षण के लिए अर्ध-ठोस पेस्ट के रूप में निकलता है?",
            "Which insoluble, non-toxic nitrogenous waste compound is excreted as a concentrated semi-solid white paste by Birds, Lizards, and terrestrial Insects to conserve water?",
            listOf("अमोनिया (Ammonotelic)", "यूरिक अम्ल (Uricotelic - Uric Acid / C₅H₄N₄O₃)", "यूरिया (Ureotelic)", "अमीनो एसिड"),
            listOf("Ammonia (Aquatic teleosts)", "Uric Acid (Uricotelic excretion in birds and reptiles)", "Urea (Mammals)", "Amino acids"),
            1,
            "पक्षी, छिपकलियां, सांप और स्थलीय कीट 'यूरिकोटेलिक' (Uricotelic) जीव हैं। वे जल की भारी बचत करने के लिए न्यूनतम पानी में यूरिक एसिड के सफेद क्रिस्टल पेस्ट के रूप में मल-मूत्र एक साथ उत्सर्जित करते हैं।",
            "Uricotelic organisms excrete crystalline Uric Acid pellets requiring negligible hydration, an evolutionary adaptation for avian egg development and desert survival.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q11", "sci_5",
            "मानव शरीर में रक्त शर्करा (Blood Glucose) के स्तर को बढ़ाने वाला 'ग्लूकागन' (Glucagon) हार्मोन अग्न्याशय की किन कोशिकाओं द्वारा स्रावित होता है?",
            "Glucagon, the hyperglycemic peptide hormone that stimulates hepatic glycogenolysis when blood sugar drops, is secreted by Pancreatic:",
            listOf("बीटा कोशिकाएं (β-cells - Insulin)", "अल्फा कोशिकाएं (Alpha cells / α-cells of Islets of Langerhans)", "डेल्टा कोशिकाएं (Somatostatin)", "F-कोशिकाएं"),
            listOf("Beta cells (Insulin)", "Alpha cells (α-cells of Islets of Langerhans)", "Delta cells (Somatostatin)", "F-cells"),
            1,
            "अग्न्याशय के लैंगरहैंस द्वीपिकाओं की अल्फा कोशिकाएं (α-cells) ग्लूकागन स्रावित करती हैं। यह यकृत में संचित ग्लाइकोजन को ग्लूकोज में तोड़कर (Glycogenolysis) रक्त शर्करा को सामान्य स्तर पर बनाए रखता है।",
            "Pancreatic Alpha cells secrete Glucagon during fasting to stimulate hepatic glycogenolysis and gluconeogenesis, elevating blood glucose counter to insulin.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q12", "sci_5",
            "रक्त में कैल्शियम (Ca²⁺) के स्तर को बढ़ाने वाला पैराथॉर्मोन (PTH / Parathyroid Hormone) किस ग्रंथि द्वारा स्रावित होता है?",
            "Parathyroid Hormone (PTH / Collip's Hormone), which mobilizes calcium from bones into the blood to elevate plasma Ca²⁺ levels, is secreted by:",
            listOf("थायरॉयड ग्रंथि (Calcitonin)", "पैराथायरॉयड ग्रंथि (Parathyroid Glands - 4 small glands behind thyroid)", "थाइमस", "पीयूष ग्रंथि"),
            listOf("Thyroid (Secretes calcitonin to lower calcium)", "Parathyroid Glands (4 pea-sized glands on posterior thyroid surface)", "Thymus", "Pituitary"),
            1,
            "पैराथायरॉयड ग्रंथियां PTH स्रावित करती हैं जो हड्डियों से कैल्शियम निकालकर रक्त में लाती हैं और गुर्दों में Ca²⁺ का पुनरावशोषण बढ़ाती हैं। थायरॉयड का कैल्सीटोनिन रक्त Ca²⁺ को घटाता है।",
            "Parathyroid Hormone (PTH) acts on osteoclasts, renal tubules, and activates calcitriol to maintain systemic ionized calcium homeostasis (~9-11 mg/dL).",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q13", "sci_5",
            "पुरुषों का प्राथमिक पुरुष सेक्स हार्मोन (Male Sex Hormone / Androgen) कौन-सा है जो वृषण (Testes) की लीडिग कोशिकाओं द्वारा स्रावित होता है?",
            "Which primary male androgenic steroid hormone is synthesized by interstitial Leydig cells in the Testes, promoting spermatogenesis and secondary sexual traits?",
            listOf("एस्ट्रोजन", "टेस्टोस्टेरोन (Testosterone)", "प्रोजेस्टेरोन", "प्रोलैक्टिन"),
            listOf("Estrogen", "Testosterone (Primary Male Androgen)", "Progesterone", "Prolactin"),
            1,
            "टेस्टोस्टेरोन (Testosterone) वृषण में बनता है। यह शुक्राणुजनन (Spermatogenesis), दाढ़ी-मूंछ का उगना, आवाज का भारी होना और मांसपेशियों की वृद्धि जैसे पुरुष लक्षणों को नियंत्रित करता है।",
            "Testosterone is the principal androgen driving male embryonic virilization, pubertal maturation, voice deepening, and sustained spermatogenesis.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q14", "sci_5",
            "महिलाओं में द्वितीयक लैंगिक लक्षणों (स्तन विकास, मासिक धर्म चक्र) को नियंत्रित करने वाला मुख्य महिला सेक्स हार्मोन कौन-सा है जो अंडाशय की ग्राफियान पुटिकाओं द्वारा बनता है?",
            "Which primary female steroid sex hormone is secreted by ovarian follicles to govern secondary sexual characteristics and endometrial proliferation?",
            listOf("टेस्टोस्टेरोन", "एस्ट्रोजन / एस्ट्राडियोल (Estrogen / Estradiol)", "ऑक्सीटोसिन", "वेसोप्रेसिन"),
            listOf("Testosterone", "Estrogen / 17β-Estradiol (Synthesized by ovarian granulosa cells)", "Oxytocin", "Vasopressin"),
            1,
            "एस्ट्रोजन (Estrogen) अंडाशय में परिपक्व हो रही पुटिकाओं द्वारा स्रावित होता है। यह गर्भाशय की आंतरिक परत (एंडोमेट्रियम) को मोटा करता है और महिला शारीरिक लक्षणों को नियंत्रित करता है।",
            "Estrogens (principally Estradiol) stimulate the proliferative phase of the uterine endometrium and regulate pubertal female development and bone density.",
            "Easy"
        ),
        makeScienceQ(
            "sci_5_m10_q15", "sci_5",
            "गर्भावस्था हार्मोन (Pregnancy Hormone) किसे कहा जाता है जो डिंबोत्सर्जन के बाद कॉर्पस ल्यूटियम (Corpus Luteum) द्वारा स्रावित होकर गर्भाशय में भ्रूण के आरोपण को बनाए रखता है?",
            "Which steroid hormone, known as the 'Pregnancy Hormone', is secreted by the ovarian Corpus Luteum and Placenta to sustain gestation?",
            listOf("एस्ट्रोजन", "प्रोजेस्टेरोन (Progesterone)", "एचसीजी", "रिलैक्सिन"),
            listOf("Estrogen", "Progesterone (Maintains secretorily mature endometrium for embryonic implantation)", "hCG", "Relaxin"),
            1,
            "प्रोजेस्टेरोन गर्भाशय की एंडोमेट्रियम को स्रावी अवस्था में बनाए रखता है, गर्भाशय के संकुचन को रोकता है और गर्भावस्था के 9 महीनों तक भ्रूण के सुरक्षित विकास को सुनिश्चित करता है।",
            "Progesterone stabilizes the vascularized uterine lining during the secretory luteal phase and maintains quiescence of the myometrium throughout gestation.",
            "Easy"
        )
    )
}
