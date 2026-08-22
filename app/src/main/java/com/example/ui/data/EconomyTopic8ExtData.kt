package com.example.ui.data

import com.example.ui.data.EconomyQuestionHelper.makeEconomyQ
import com.example.ui.model.GkQuestion

object EconomyTopic8ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions) - जीएसटी (GST), 101वां संविधान संशोधन, जीएसटी परिषद एवं वित्त आयोग (Finance Commission)
        // ==========================================
        makeEconomyQ(
            "eco_8_m6_q1", "eco_8",
            "भारत में ऐतिहासिक वस्तु एवं सेवा कर (GST - Goods and Services Tax) किस संविधान संशोधन अधिनियम के तहत और किस तिथि से पूरे देश में लागू हुआ था?",
            "Under which Constitutional Amendment Act and on which historic date was the unified Goods and Services Tax (GST) rolled out across India?",
            listOf("100वां संविधान संशोधन (1 जनवरी 2017)", "101वां संविधान संशोधन अधिनियम, 2016 (लागू: 1 जुलाई 2017 / 'एक राष्ट्र, एक कर, एक बाजार')", "102वां संविधान संशोधन (8 नवंबर 2016)", "103वां संविधान संशोधन (1 अप्रैल 2018)"),
            listOf("100th Constitutional Amendment (1 Jan 2017)", "101st Constitutional Amendment Act, 2016 (Enacted midnight 1 July 2017 - 'One Nation, One Tax, One Market')", "102nd Amendment Act", "103rd Amendment Act"),
            1,
            "भारत में जीएसटी 101वें संविधान संशोधन अधिनियम, 2016 (122वां संविधान संशोधन विधेयक) द्वारा 1 जुलाई 2017 की मध्यरात्रि से संसद के केंद्रीय कक्ष से लागू किया गया। इसने केंद्र के 8 और राज्यों के 9 अप्रत्यक्ष करों (जैसे वैट, उत्पाद शुल्क, सेवा कर, प्रवेश कर आदि) को समाहित किया। (विश्व में सर्वप्रथम जीएसटी 1954 में फ्रांस में लागू हुआ था)।",
            "The 101st Constitutional Amendment marked India's most sweeping cooperative federalism fiscal reform since Independence.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q2", "eco_8",
            "भारतीय संविधान के किस नए अनुच्छेद के तहत 'जीएसटी परिषद' (GST Council) की स्थापना का प्रावधान किया गया है?",
            "Under which newly inserted Article of the Constitution of India is the apex federal decision-making body 'GST Council' established?",
            listOf("अनुच्छेद 246A", "अनुच्छेद 269A", "अनुच्छेद 279A (Article 279A - GST Council / अध्यक्ष: केंद्रीय वित्त मंत्री)", "अनुच्छेद 280"),
            listOf("Article 246A (Special provision for GST laws by Parliament & State Legislatures)", "Article 269A (Levy and collection of IGST on inter-state commerce)", "Article 279A (Empowering President to constitute GST Council within 60 days)", "Article 280 (Finance Commission)"),
            2,
            "101वें संविधान संशोधन द्वारा अनुच्छेद 279A जोड़ा गया, जिसके तहत राष्ट्रपति द्वारा 'जीएसटी परिषद' का गठन किया जाता है। इसके अध्यक्ष केंद्रीय वित्त मंत्री होते हैं और सभी राज्यों व केंद्र शासित प्रदेशों के वित्त मंत्री इसके सदस्य होते हैं। इसमें केंद्र का वोटिंग भार 1/3 (33.33%) और सभी राज्यों का संयुक्त भार 2/3 (66.67%) होता है, तथा निर्णय 3/4 (75%) बहुमत से होते हैं।",
            "Article 279A institutionalizes institutional cooperative fiscal federalism in the GST Council.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q3", "eco_8",
            "एक राज्य से दूसरे राज्य में होने वाले व्यापार (Inter-State Trade) पर कौन-सा जीएसटी लगाया जाता है और इसका संग्रह कौन करता है?",
            "Which component of GST is levied on inter-state supply of goods and services and cross-border imports under Article 269A, and collected by the Central Government?",
            listOf("केंद्रीय जीएसटी (CGST)", "राज्य जीएसटी (SGST)", "एकीकृत जीएसटी (IGST - Integrated GST / केंद्र द्वारा संगृहीत एवं गंतव्य राज्य के साथ विभाजित)", "केंद्र शासित प्रदेश जीएसटी (UTGST)"),
            listOf("CGST (Central GST on intra-state sales)", "SGST (State GST on intra-state sales)", "IGST (Integrated GST - Governed under IGST Act, 2017 and apportioned between Centre and destination State)", "UTGST"),
            2,
            "अंतर-राज्यीय (एक राज्य से दूसरे राज्य) व्यापार और आयात पर 'एकीकृत जीएसटी' (IGST) लगाया जाता है। इसे केंद्र सरकार वसूलती है और गंतव्य राज्य (Destination State) तथा केंद्र के बीच निर्धारित अनुपात में विभाजित किया जाता है। (जीएसटी एक 'गंतव्य-आधारित उपभोग कर' - Destination-based Consumption Tax है)।",
            "IGST seamlessly tracks inter-state input tax credits under the destination principle without cascading friction.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q4", "eco_8",
            "जीएसटी प्रणाली की वह कौन-सी सबसे महत्वपूर्ण विशेषता है जो आपूर्ति श्रृंखला में कर पर कर (Cascading Effect of Tax) को पूरी तरह समाप्त करती है?",
            "What core mechanism in the GST framework eliminates the cascading effect ('tax on tax') across multi-stage production and supply chains?",
            listOf("कंपोजिशन स्कीम", "इनपुट टैक्स क्रेडिट (ITC - Input Tax Credit / पूर्व में चुकाए गए इनपुट कर की कटौती का दावा)", "रिवर्स चार्ज मैकेनिज्म (RCM)", "ई-वे बिल"),
            listOf("Composition Scheme", "Input Tax Credit (ITC - Allowing registered businesses to set off tax paid on purchases against output tax liability)", "Reverse Charge Mechanism", "E-Way Bill"),
            1,
            "इनपुट टैक्स क्रेडिट (ITC) वह तंत्र है जिसके द्वारा कोई व्यापारी या निर्माता अपनी बिक्री पर लगने वाले आउटपुट टैक्स में से कच्चा माल या सेवाएं खरीदते समय पहले से चुकाए गए इनपुट टैक्स की राशि घटा सकता है। इससे केवल मूल्य वर्धन (Value Addition) पर ही शुद्ध कर लगता है और कर पर कर नहीं लगता।",
            "Input Tax Credit is the foundational engine that ensures GST operates strictly as a true value-added consumption tax.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q5", "eco_8",
            "वर्तमान में भारतीय जीएसटी प्रणाली में मुख्य रूप से कौन-सी चार मानक कर दरें (Tax Slabs) निर्धारित हैं?",
            "What are the four primary standard non-zero GST rate slabs adopted by the GST Council for goods and services in India?",
            listOf("2%, 8%, 16%, 24%", "5%, 12%, 18% और 28% (चार मुख्य जीएसटी स्लैब / 0% आवश्यक वस्तुएं व सोने पर 3%)", "4%, 10%, 20%, 30%", "6%, 12%, 18%, 26%"),
            listOf("2%, 8%, 16%, 24%", "5%, 12%, 18%, and 28% (Along with 0% exempt essentials, 0.25% uncut diamonds, and 3% on precious gold/silver)", "4%, 10%, 20%, 30%", "6%, 12%, 18%, 26%"),
            1,
            "भारत में जीएसटी की 4 प्रमुख मानक दरें हैं: 5%, 12%, 18% और 28%। खाद्यान्न, दूध, फल-सब्जियां जैसी आवश्यक वस्तुएं 0% (शून्य दर) पर हैं। 28% की उच्चतम श्रेणी में विलासिता (Luxury) एवं अहितकर (Sin Goods - सिगरेट, पान मसाला, लग्जरी कार) वस्तुएं रखी गई हैं जिन पर क्षतिपूर्ति उपकर (Compensation Cess) भी लगता है।",
            "The multi-tiered slab structure balances revenue buoyancy with socio-economic affordability for vulnerable citizens.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q6", "eco_8",
            "निम्नलिखित में से कौन-सी वस्तुएं वर्तमान में जीएसटी (GST) के दायरे से पूरी तरह बाहर हैं और उन पर पुराने उत्पाद शुल्क व वैट लागू हैं?",
            "Which of the following high-revenue commodity baskets is currently kept OUTSIDE the ambit of GST, remaining subject to Central Excise and State VAT?",
            listOf("ऑटोमोबाइल एवं सीमेंट", "पेट्रोलियम उत्पाद (कच्चा तेल, पेट्रोल, डीजल, ATF, प्राकृतिक गैस) एवं मानव उपभोग हेतु अल्कोहल (शराब)", "इलेक्ट्रॉनिक्स एवं वस्त्र", "दवाइयां एवं स्वास्थ्य सेवाएं"),
            listOf("Automobiles and cement", "Five specified petroleum products (Crude oil, Motor Spirit/Petrol, HSD/Diesel, Aviation Turbine Fuel, Natural Gas) and Alcohol for human consumption", "Electronics and textiles", "Pharmaceuticals and healthcare"),
            1,
            "संविधान के अनुच्छेद 366(12A) के तहत 'मानव उपभोग के लिए अल्कोहल' को जीएसटी की परिभाषा से बाहर रखा गया है (इस पर राज्य उत्पाद शुल्क व वैट लगता है)। इसके अलावा 5 पेट्रोलियम उत्पाद (पेट्रोल, डीजल, कच्चा तेल, एटीएफ, प्राकृतिक गैस) तथा बिजली व रियल एस्टेट स्टाम्प ड्यूटी वर्तमान में जीएसटी से बाहर हैं।",
            "Petroleum products and potable alcohol remain critical revenue reservoirs for States under traditional fiscal autonomy.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q7", "eco_8",
            "जीएसटी के तहत ₹50,000 से अधिक मूल्य के माल के एक राज्य से दूसरे राज्य या 10 किमी से अधिक परिवहन हेतु कौन-सा अनिवार्य इलेक्ट्रॉनिक दस्तावेज आवश्यक है?",
            "Which mandatory digital electronic tracking document is required under GST rules for the inter-state or intra-state movement of goods valued above ₹50,000?",
            listOf("ई-इनवॉइस (e-Invoice)", "ई-वे बिल (E-Way Bill - Electronic Way Bill / NIC पोर्टल द्वारा जनरेटेड)", "फॉर्म 26AS", "जीएसटीआर-3B"),
            listOf("e-Invoice", "E-Way Bill (Electronic Way Bill mandated to ensure real-time tracking of logistics consignments and prevent tax evasion)", "Form 26AS", "GSTR-3B"),
            1,
            "ई-वे बिल (Electronic Way Bill) एक अनिवार्य डिजिटल चालान है जिसे राष्ट्रीय सूचना विज्ञान केंद्र (NIC) के पोर्टल से ₹50,000 से अधिक मूल्य के माल के परिवहन से पूर्व ट्रांसपोर्टर या विक्रेता द्वारा जनरेट किया जाता है। यह माल के अवैध परिवहन और कर चोरी को रोकता है।",
            "The E-Way Bill ecosystem integrated logistics technology with tax enforcement, boosting compliance across freight corridors.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q8", "eco_8",
            "भारतीय संविधान के किस अनुच्छेद के तहत भारत के राष्ट्रपति द्वारा प्रत्येक 5 वर्ष में एक 'वित्त आयोग' (Finance Commission) के गठन का प्रावधान है?",
            "Under which Article of the Constitution of India does the President constitute a Finance Commission every five years or earlier to recommend fiscal devolution?",
            listOf("अनुच्छेद 275", "अनुच्छेद 280 (Article 280 - Constitution of Finance Commission)", "अनुच्छेद 265", "अनुच्छेद 300A"),
            listOf("Article 275 (Statutory Grants-in-aid to States)", "Article 280 (Mandates the President to constitute a Finance Commission consisting of a Chairman and four other members)", "Article 265 (Taxes not to be imposed save by authority of law)", "Article 300A (Right to Property)"),
            1,
            "संविधान के अनुच्छेद 280 के तहत राष्ट्रपति प्रत्येक 5 वर्ष (या आवश्यकतानुसार पहले) में एक वित्त आयोग का गठन करते हैं। इसमें एक अध्यक्ष और 4 अन्य सदस्य होते हैं। इसकी मुख्य जिम्मेदारी केंद्र और राज्यों के बीच शुद्ध कर आगमों (Net Proceeds of Taxes) का उर्ध्वाधर (Vertical) और राज्यों के बीच क्षैतिज (Horizontal) वितरण तय करना है।",
            "Article 280 serves as the primary constitutional vehicle for maintaining fiscal equilibrium between the Union and States.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q9", "eco_8",
            "स्वतंत्र भारत के 'प्रथम वित्त आयोग' (First Finance Commission, 1951) के अध्यक्ष कौन थे?",
            "Who served as the distinguished Chairman of the First Finance Commission of India constituted in November 1951?",
            listOf("के. संथानम", "के. सी. नियोगी (K. C. Neogy - First Finance Commission Chairman / 1952-1957)", "डॉ. विजय केलकर", "वाई. वी. रेड्डी"),
            listOf("K. Santhanam (Second Finance Commission Chairman)", "K. C. Neogy (Pioneered the institutional norms of revenue sharing between the newly independent Union and States)", "Dr. Vijay Kelkar (13th Finance Commission)", "Y. V. Reddy (14th Finance Commission)"),
            1,
            "भारत के प्रथम वित्त आयोग (1951-1956) के अध्यक्ष क्षितिज चंद्र नियोगी (K. C. Neogy) थे। उन्होंने राज्यों को केंद्रीय करों में 10% से 15% की हिस्सेदारी और अनुच्छेद 275 के तहत सहायता अनुदान की रूपरेखा तैयार की थी।",
            "K. C. Neogy set the foundational benchmarks for statutory fiscal devolution in the Republic of India.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q10", "eco_8",
            "14वें वित्त आयोग (अध्यक्ष: डॉ. वाई. वी. रेड्डी) ने राज्यों की केंद्रीय करों में हिस्सेदारी को 32% से बढ़ाकर ऐतिहासिक रूप से कितना प्रतिशत करने की सिफारिश की थी?",
            "The 14th Finance Commission under Dr. Y. V. Reddy made a historic quantum jump by recommending what percentage share for States in divisible central pool taxes?",
            listOf("35%", "42% (42% share recommended by 14th Finance Commission - Unprecedented fiscal decentralization)", "38%", "45%"),
            listOf("35%", "42% (A massive 10-percentage-point increase from 32% to 42%, granting unprecedented untied fiscal space to States)", "38%", "45%"),
            1,
            "14वें वित्त आयोग (2015-2020) ने केंद्रीय करों के विभाज्य कोष (Divisible Pool) में राज्यों का हिस्सा 32% से बढ़ाकर सीधे 42% कर दिया, जिससे राज्यों को अपनी प्राथमिकताओं के अनुसार खर्च करने की अभूतपूर्व स्वायत्तता मिली।",
            "The 14th Finance Commission's 42% devolution marked a watershed moment in cooperative fiscal empowerment of States.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m6_q11", "eco_8",
            "15वें वित्त आयोग (15th Finance Commission - 2021-2026) के अध्यक्ष कौन थे और उन्होंने राज्यों के लिए कितने प्रतिशत कर हस्तांतरण की सिफारिश की?",
            "Who was the Chairman of the 15th Finance Commission (2021-26), and what devolution share did the commission recommend for States after the reorganization of Jammu & Kashmir?",
            listOf("डॉ. सी. रंगराजन (42%)", "एन. के. सिंह (N. K. Singh - 41% कर हस्तांतरण / 1% जम्मू-कश्मीर व लद्दाख केंद्र शासित प्रदेशों हेतु समायोजित)", "डॉ. अरविंद पनगढ़िया (40%)", "वाई. वी. रेड्डी (42%)"),
            listOf("Dr. C. Rangarajan (42%)", "N. K. Singh (41% devolution share recommended for 28 States, adjusting 1% for the newly created Union Territories of J&K and Ladakh)", "Dr. Arvind Panagariya", "Y. V. Reddy"),
            1,
            "15वें वित्त आयोग के अध्यक्ष नंद किशोर सिंह (N. K. Singh) थे। उनकी रिपोर्ट का शीर्षक 'Finance Commission in Covid Times' था। उन्होंने राज्यों को 41% कर हस्तांतरण (14वें आयोग के 42% से 1% कम करके जम्मू-कश्मीर और लद्दाख के लिए रखा गया) की सिफारिश की। 15वें आयोग ने 2011 की जनगणना के आंकड़ों का उपयोग किया।",
            "The 15th Finance Commission navigated historic headwinds including Covid-19 and the Jammu & Kashmir reorganization.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q12", "eco_8",
            "भारत सरकार द्वारा 31 दिसंबर 2023 को गठित '16वें वित्त आयोग' (16th Finance Commission) का अध्यक्ष किसे नियुक्त किया गया है?",
            "Who has been appointed as the Chairman of the 16th Finance Commission of India constituted by the Government in December 2023 for recommendations spanning 2026 to 2031?",
            listOf("डॉ. सुब्रमण्यम स्वामी", "डॉ. अरविंद पनगढ़िया (Dr. Arvind Panagariya - Former Vice Chairman of NITI Aayog / 16th FC Chairman / Recommendations for 2026-2031)", "डॉ. शक्तिकांत दास", "के. वी. कामथ"),
            listOf("Dr. Subramanian Swamy", "Dr. Arvind Panagariya (Renowned economist, Columbia University professor, and founding Vice-Chairman of NITI Aayog)", "Dr. Shaktikanta Das", "K. V. Kamath"),
            1,
            "16वें वित्त आयोग का गठन 31 दिसंबर 2023 को किया गया जिसके अध्यक्ष नीति आयोग के प्रथम उपाध्यक्ष रहे प्रसिद्ध अर्थशास्त्री डॉ. अरविंद पनगढ़िया हैं। ऋत्विक रंजनम पांडे इसके सचिव हैं। यह आयोग 2026-27 से 2030-31 (5 वर्षों) के लिए अपनी सिफारिशें प्रस्तुत करेगा।",
            "The 16th Finance Commission under Dr. Arvind Panagariya will shape India's fiscal landscape through the end of the decade.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q13", "eco_8",
            "15वें वित्त आयोग द्वारा विभिन्न राज्यों के बीच करों के क्षैतिज वितरण (Horizontal Devolution) हेतु किस नए मानक (Criterion) को 12.5% भार के साथ शामिल किया गया?",
            "Which new demographic criterion was incorporated by the 15th Finance Commission with a 12.5% weight to reward States that successfully controlled their fertility rates?",
            listOf("शहरीकरण स्तर", "जनसांख्यिकीय प्रदर्शन (Demographic Performance - TFR प्रजनन दर नियंत्रण करने वाले राज्यों को पुरस्कृत करने हेतु)", "वन एवं पारिस्थितिकी (Forest & Ecology)", "कर प्रयास (Tax Effort)"),
            listOf("Urbanization rate", "Demographic Performance (12.5% weight rewarding States with lower Total Fertility Rates based on 1971 vs 2011 performance)", "Forest and Ecology", "Tax & Fiscal efforts"),
            1,
            "15वें वित्त आयोग के वितरण सूत्र के मानक:\n1. आय का अंतर (Income Distance) - 45%,\n2. जनसंख्या (2011 Census) - 15%,\n3. क्षेत्रफल (Area) - 15%,\n4. वन एवं पारिस्थितिकी (Forest & Ecology) - 10%,\n5. जनसांख्यिकीय प्रदर्शन (Demographic Performance) - 12.5%,\n6. कर प्रयास (Tax Effort) - 2.5%।",
            "The demographic performance metric balanced the adoption of the 2011 census with incentives for population stabilization.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m6_q14", "eco_8",
            "जीएसटी में छोटे व्यापारियों, खुदरा विक्रेताओं और रेस्तरांओं के लिए आसान अनुपालन और 1% से 5% की नाममात्र टर्नओवर कर दर वाली योजना कौन-सी है?",
            "Which simplified compliance scheme under GST allows small businesses and restaurants with annual turnover up to ₹1.5 Crore to pay a flat turnover tax rate without detailed ITC filing?",
            listOf("रिवर्स चार्ज योजना", "कंपोजिशन लेवी योजना (GST Composition Scheme - Section 10 of CGST Act / Up to ₹1.5 Cr turnover / 1% for traders & manufacturers, 5% for restaurants)", "विशेष आर्थिक क्षेत्र योजना", "ड्यूटी ड्रॉबैक योजना"),
            listOf("Reverse Charge Scheme", "GST Composition Scheme (Offers hassle-free quarterly lump-sum tax payment at 1% for manufacturers/traders and 5% for food service providers without collecting tax from consumers)", "Special Economic Zone scheme", "Duty Drawback Scheme"),
            1,
            "जीएसटी कंपोजिशन स्कीम (Composition Scheme) ₹1.5 करोड़ तक (पूर्वोत्तर व पहाड़ी राज्यों में ₹75 लाख) के वार्षिक कारोबार वाले छोटे व्यापारियों को नाममात्र दर (व्यापारी/निर्माता: 1%, रेस्तरां: 5%) पर तिमाही रिटर्न (CMP-08) दाखिल करने की सुविधा देती है। कंपोजिशन डीलर ग्राहक से टैक्स नहीं ले सकते और न ही ITC का दावा कर सकते हैं।",
            "The Composition Scheme significantly reduces administrative and compliance overheads for micro and small enterprises.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m6_q15", "eco_8",
            "जीएसटी प्रणाली के संपूर्ण आईटी बुनियादी ढांचे, डिजिटल नेटवर्क, रिटर्न फाइलिंग और चालान जनरेशन का प्रबंधन करने वाली कंपनी कौन-सी है?",
            "Which non-profit digital backbone entity operates and maintains the nationwide IT architecture, ledger databases, and filing portal for GST in India?",
            listOf("भारतीय राष्ट्रीय भुगतान निगम (NPCI)", "वस्तु एवं सेवा कर नेटवर्क (GSTN - Goods and Services Tax Network / 100% Government Owned / New Delhi)", "सेंट्रल डिपॉजिटरी सर्विसेज लिमिटेड (CDSL)", "राष्ट्रीय सूचना विज्ञान केंद्र (NIC)"),
            listOf("NPCI", "GSTN (Goods and Services Tax Network - Special purpose vehicle managing the pan-India digital GST IT platform, now 100% government-held)", "CDSL", "NIC"),
            1,
            "वस्तु एवं सेवा कर नेटवर्क (GSTN) एक विशेष प्रयोजन संस्था (SPV) है जो भारत के संपूर्ण जीएसटी पोर्टल (gst.gov.in), 1.4 करोड़ से अधिक पंजीकृत करदाताओं के रिटर्न, इनवॉइस मिलान और आईटी अवसंरचना का निर्बाध प्रबंधन करती है। वर्तमान में यह 100% सरकारी स्वामित्व (50% केंद्र + 50% राज्य) वाली कंपनी है।",
            "GSTN processes billions of invoices monthly, serving as the digital nervous system of Indian indirect taxation.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + EconomyQuestionHelper.generateTopicMocks("eco_8", 7, 10, baseQuestions)
    }
}
