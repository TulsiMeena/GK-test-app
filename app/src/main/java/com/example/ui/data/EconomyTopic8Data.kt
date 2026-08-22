package com.example.ui.data

import com.example.ui.data.EconomyQuestionHelper.makeEconomyQ
import com.example.ui.model.GkQuestion

object EconomyTopic8Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions) - प्रत्यक्ष एवं अप्रत्यक्ष कर प्रणाली, प्रत्यक्ष कर सुधार व सिद्धांत
        // ==========================================
        makeEconomyQ(
            "eco_8_m1_q1", "eco_8",
            "अर्थशास्त्र में एडम स्मिथ (Adam Smith) द्वारा प्रतिपादित करारोपण के चार मूल सिद्धांत (Canons of Taxation) में कौन-सा शामिल नहीं है?",
            "Which of the following is NOT among the four classic Canons of Taxation formulated by Adam Smith in 'The Wealth of Nations' (1776)?",
            listOf("समानता का सिद्धांत (Canon of Equality/Equity)", "निश्चितता का सिद्धांत (Canon of Certainty)", "सुविधा एवं मितव्ययिता का सिद्धांत (Canon of Convenience & Economy)", "अस्थिरता का सिद्धांत (Canon of Instability / Arbitrariness)"),
            listOf("Canon of Equality/Equity", "Canon of Certainty", "Canon of Convenience and Economy", "Canon of Instability (Incorrect - Smith emphasized predictability and fairness)"),
            3,
            "एडम स्मिथ ने करारोपण के 4 सर्वमान्य नियम दिए थे:\n1. समानता/न्याय का नियम (Canon of Equality - क्षमता अनुसार कर),\n2. निश्चितता का नियम (Canon of Certainty - करदाता को कर की राशि व समय स्पष्ट ज्ञात हो),\n3. सुविधा का नियम (Canon of Convenience - कर चुकाने में सुविधा हो),\n4. मितव्ययिता का नियम (Canon of Economy - कर वसूली का खर्च न्यूनतम हो)।",
            "Adam Smith's four canons of taxation remain the bedrock of modern public finance and fiscal fairness.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m1_q2", "eco_8",
            "करारोपण के संदर्भ में 'कराघात' (Impact of Tax) और 'करापात' (Incidence of Tax) में क्या मौलिक अंतर होता है?",
            "In public finance and fiscal economics, what is the fundamental distinction between the 'Impact of Tax' and 'Incidence of Tax'?",
            listOf("दोनों पूर्णतः समान हैं", "कराघात उस व्यक्ति पर पड़ता है जो सबसे पहले कानूनी रूप से कर का भुगतान करता है, जबकि करापात अंतिम वित्तीय भार (Final Money Burden) को दर्शाता है", "करापात हमेशा सरकार पर पड़ता है", "कराघात केवल अप्रत्यक्ष करों पर लागू होता है"),
            listOf("Both terms are identical", "Impact refers to the immediate legal liability on the initial payer, whereas Incidence denotes the ultimate economic resting point of the tax burden", "Incidence always falls on the State", "Impact applies only to indirect duties"),
            1,
            "कराघात (Impact of Tax) तात्कालिक कानूनी देनदारी है जो उस व्यक्ति पर पड़ती है जिससे सरकार प्रत्यक्षतः कर वसूलती है। करापात (Incidence of Tax) कर का अंतिम भार (Ultimate Burden) है जो उस व्यक्ति पर पड़ता है जो कर को आगे किसी अन्य पर नहीं टाल सकता। प्रत्यक्ष कर में कराघात व करापात एक ही व्यक्ति पर होता है, जबकि अप्रत्यक्ष कर में कर का विवर्तन (Tax Shifting) संभव होता है।",
            "The distinction between tax impact, shifting, and ultimate incidence defines whether a levy is direct or indirect.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m1_q3", "eco_8",
            "आय बढ़ने के साथ-साथ यदि कर की दर में वृद्धि होती है, तो ऐसी कराधान प्रणाली को क्या कहा जाता है?",
            "When the marginal rate of taxation increases progressively with an increase in taxable income, what is this taxation system termed?",
            listOf("प्रतिगामी कर प्रणाली (Regressive Tax)", "प्रगामी / प्रगतिशील कर प्रणाली (Progressive Taxation - Income Tax in India)", "आनुपातिक कर प्रणाली (Proportional Tax)", "अधोगामी कर प्रणाली (Degressive Tax)"),
            listOf("Regressive Tax", "Progressive Taxation (Higher income earners bear a higher percentage rate to reduce economic inequality)", "Proportional Tax", "Degressive Tax"),
            1,
            "प्रगतिशील या प्रगामी कर प्रणाली (Progressive Tax) में आय बढ़ने पर कर की दर बढ़ती है (जैसे भारत में व्यक्तिगत आयकर)।\n- प्रतिगामी कर (Regressive Tax): गरीबों पर अमीरों की तुलना में आय के अनुपात में अधिक भार डालता है (जैसे अधिकांश अप्रत्यक्ष कर)।\n- आनुपातिक कर (Proportional Tax): सभी आय स्तरों पर समान प्रतिशत दर।",
            "Progressive taxation serves as a powerful fiscal tool for income redistribution and social equity.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m1_q4", "eco_8",
            "भारत में प्रत्यक्ष करों (Direct Taxes) के प्रशासन, नीति निर्धारण एवं संग्रह का शीर्ष निकाय कौन-सा है?",
            "Which apex statutory body is responsible for administering, formulating policy, and collecting Direct Taxes (Income Tax, Corporate Tax) in India?",
            listOf("केंद्रीय अप्रत्यक्ष कर एवं सीमा शुल्क बोर्ड (CBIC)", "केंद्रीय प्रत्यक्ष कर बोर्ड (CBDT - Central Board of Direct Taxes / Revenue Department, Ministry of Finance)", "प्रवर्तन निदेशालय (ED)", "भारतीय रिजर्व बैंक (RBI)"),
            listOf("CBIC (Indirect taxes and Customs)", "CBDT (Central Board of Direct Taxes, constituted under the Central Boards of Revenue Act, 1963)", "Enforcement Directorate", "Reserve Bank of India"),
            1,
            "केंद्रीय प्रत्यक्ष कर बोर्ड (CBDT) वित्त मंत्रालय के राजस्व विभाग के अंतर्गत एक सांविधिक निकाय है, जो 'केंद्रीय राजस्व बोर्ड अधिनियम, 1963' के तहत कार्य करता है। यह आयकर, कॉर्पोरेट टैक्स आदि प्रत्यक्ष करों के प्रशासन का सर्वोच्च प्राधिकरण है।",
            "CBDT formulates direct tax policy and oversees the nationwide Income Tax Department.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m1_q5", "eco_8",
            "भारत सरकार द्वारा घरेलू कंपनियों के लिए कॉर्पोरेट टैक्स की आधार दर को घटाकर 22% (और नई विनिर्माण कंपनियों हेतु 15%) किस ऐतिहासिक अध्यादेश/वर्ष में किया गया?",
            "In which landmark fiscal reform year did the Government of India slash the base corporate income tax rate to 22% for existing companies and 15% for new manufacturing units?",
            listOf("वर्ष 2014", "वर्ष 2019 (सितंबर 2019 - Taxation Laws Amendment Ordinance / निवेश एवं 'मेक इन इंडिया' को बढ़ावा देने हेतु)", "वर्ष 2016", "वर्ष 2021"),
            listOf("2014", "2019 (September 2019 Corporate Tax rate cut making India competitive with Southeast Asian economies)", "2016", "2021"),
            1,
            "सितंबर 2019 में भारत सरकार ने कॉर्पोरेट कर की दर को 30% से घटाकर 22% (प्रभावी दर उपकर व अधिभार सहित 25.17%) कर दिया और 1 अक्टूबर 2019 के बाद स्थापित नई विनिर्माण कंपनियों के लिए 15% (प्रभावी दर 17.16%) कर दिया, जिससे भारत वैश्विक स्तर पर विनिर्माण के लिए आकर्षक बना।",
            "The historic corporate tax reduction in 2019 catalyzed domestic capital expenditure and foreign direct investment.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m1_q6", "eco_8",
            "अर्थशास्त्र में 'लाफर वक्र' (Laffer Curve) किन दो चरों के बीच के संबंध को प्रदर्शित करता है?",
            "In fiscal supply-side economics, what relationship is depicted by the famous 'Laffer Curve' developed by Arthur Laffer?",
            listOf("मुद्रास्फीति और बेरोजगारी की दर", "कर की दर (Tax Rate) और सरकार को प्राप्त कुल कर राजस्व (Tax Revenue)", "राष्ट्रीय आय और आयात मांग", "बचत दर और निवेश दर"),
            listOf("Inflation and Unemployment rate (Phillips Curve)", "Tax Rate and Total Tax Revenue collected by the Government (showing an optimal revenue-maximizing tax rate)", "National income and import demand", "Savings rate and capital investment"),
            1,
            "आर्थर लाफर द्वारा विकसित 'लाफर वक्र' (Laffer Curve) कर की दर (Tax Rate) और कुल कर राजस्व (Tax Revenue) के बीच एक उल्टे 'U' आकार का संबंध दर्शाता है। यह सिद्ध करता है कि एक निश्चित इष्टतम सीमा (Optimal Point) से अधिक कर दर बढ़ाने पर कर वंचना (Tax Evasion) बढ़ती है और कुल राजस्व घटने लगता है।",
            "The Laffer curve demonstrates that excessive tax rates discourage economic activity and ultimately shrink the fiscal revenue base.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m1_q7", "eco_8",
            "भारत में कर सुधारों के लिए 1991 में डॉ. मनमोहन सिंह द्वारा गठित की गई ऐतिहासिक समिति कौन-सी थी जिसने कर दरों को तर्कसंगत बनाने की सिफारिश की?",
            "Which landmark Tax Reforms Committee was constituted in 1991 under the chairmanship of a distinguished economist to overhaul India's direct and indirect tax architecture?",
            listOf("राजा जे. चेलैया समिति (Raja J. Chelliah Committee on Tax Reforms - 1991-93)", "विजय केलकर समिति", "वाई. वी. रेड्डी समिति", "रंगराजन समिति"),
            listOf("Raja J. Chelliah Committee (Laid the foundational roadmap for lowering marginal tax rates, widening the tax base, and introducing Service Tax)", "Vijay Kelkar Committee", "Y. V. Reddy Committee", "C. Rangarajan Committee"),
            0,
            "डॉ. राजा जे. चेलैया समिति (1991-93) ने भारत में प्रत्यक्ष व अप्रत्यक्ष करों के सरलीकरण, कर दरों में कटौती, कर आधार के विस्तार और 1994 में सेवा कर (Service Tax) शुरू करने की ऐतिहासिक सिफारिशें की थीं।",
            "The Raja Chelliah Committee pioneered India's transition to modern, low-rate, broad-based taxation regimes.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m1_q8", "eco_8",
            "भारत में प्रत्यक्ष करों के सरलीकरण एवं जीएसटी लागू करने की सिफारिश करने वाली 'विजय केलकर कार्यबल समिति' (Task Force on Direct & Indirect Taxes) का गठन किस वर्ष हुआ था?",
            "In which year was the landmark Vijay Kelkar Task Force on Direct and Indirect Taxes constituted, which recommended a unified national Goods and Services Tax (GST)?",
            listOf("वर्ष 1998", "वर्ष 2002 (Kelkar Task Force Reports 2002-2004)", "वर्ष 2010", "वर्ष 2014"),
            listOf("1998", "2002 (The Kelkar Task Force submitted influential recommendations on income tax exemptions rationalization and conceptualized GST)", "2010", "2014"),
            1,
            "विजय केलकर समिति (2002) ने व्यक्तिगत आयकर व कॉर्पोरेट कर में छूटों को समाप्त कर दरों को कम करने और देश भर में एक साझा राष्ट्रीय वस्तु एवं सेवा कर (GST) लागू करने का पहला ठोस खाका प्रस्तुत किया था।",
            "The Kelkar Task Force laid the structural blueprint for India's indirect tax unification via GST.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m1_q9", "eco_8",
            "भारत में शेयर बाजार में शेयरों एवं प्रतिभूतियों की खरीद-बिक्री पर लगने वाले प्रत्यक्ष कर को क्या कहा जाता है जिसे 2004 में पी. चिदंबरम द्वारा पेश किया गया था?",
            "What is the direct tax levied on the purchase and sale of equities, equity mutual funds, and derivative contracts in Indian stock exchanges, introduced in 2004?",
            listOf("पूंजीगत लाभ कर (Capital Gains Tax)", "प्रतिभूति लेनदेन कर (STT - Securities Transaction Tax)", "वस्तु लेनदेन कर (CTT)", "लाभांश वितरण कर (DDT)"),
            listOf("Capital Gains Tax", "Securities Transaction Tax (STT - Levied on taxable securities transactions delivered through recognized exchanges)", "Commodities Transaction Tax (CTT)", "Dividend Distribution Tax (DDT)"),
            1,
            "सिक्योरिटीज ट्रांजेक्शन टैक्स (STT) 2004 के केंद्रीय बजट में पेश किया गया एक प्रत्यक्ष कर है, जो स्टॉक एक्सचेंजों पर इक्विटी शेयरों, डेरिवेटिव्स और इक्विटी ओरिएंटेड म्यूचुअल फंड्स के प्रत्येक खरीद-बिक्री सौदे पर स्वतः कटता है।",
            "STT ensures seamless, automated direct tax collection on all organized domestic stock exchange transactions.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m1_q10", "eco_8",
            "भारत में विदेशी बहुराष्ट्रीय डिजिटल कंपनियों (जैसे गूगल, फेसबुक आदि) द्वारा भारतीय विज्ञापनदाताओं से अर्जित ऑनलाइन राजस्व पर लगाया जाने वाला 2% से 6% का कर किस नाम से जाना जाता है?",
            "What is the direct tax levy instituted by India in 2016 (and expanded in 2020) on digital advertising and e-commerce supply services by non-resident tech giants lacking physical permanent establishment?",
            listOf("टॉबिन टैक्स (Tobin Tax)", "इक्वलाइजेशन लेवी / डिजिटल सेवा कर (Equalisation Levy / Google Tax)", "कार्बन टैक्स", "एंटी-डंपिंग ड्यूटी"),
            listOf("Tobin Tax", "Equalisation Levy (Popularly termed 'Google Tax' / Introduced under Finance Act 2016 to tax digital economy transactions)", "Carbon Tax", "Anti-Dumping Duty"),
            1,
            "इक्वलाइजेशन लेवी (Equalisation Levy - लोकप्रिय रूप से 'गूगल टैक्स') भारत द्वारा 2016 में शुरू किया गया था। यह भारत में बिना भौतिक उपस्थिति (Permanent Establishment) के डिजिटल विज्ञापन व ई-कॉमर्स सेवाओं से भारी मुनाफा कमाने वाली विदेशी तकनीकी कंपनियों पर लगाया जाता है।",
            "India was among the world's pioneers in introducing an Equalisation Levy to address the taxation challenges of the digitalized economy.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m1_q11", "eco_8",
            "अघोषित घरेलू आय व काले धन के मामलों के त्वरित समाधान हेतु भारत सरकार द्वारा 2020 में शुरू की गई प्रत्यक्ष कर विवाद समाधान योजना कौन-सी थी?",
            "Which landmark direct tax dispute settlement scheme was enacted by Parliament in 2020 to resolve long-pending litigations without penalty or prosecution?",
            listOf("सबका विश्वास योजना", "विवाद से विश्वास योजना (Vivad se Vishwas Scheme 2020)", "स्वैच्छिक आय घोषणा योजना (VDIS)", "प्रधानमंत्री गरीब कल्याण योजना"),
            listOf("Sabka Vishwas Scheme (Indirect tax dispute scheme)", "Vivad se Vishwas Scheme 2020 (Direct Taxes litigation resolution scheme)", "VDIS 1997", "PMGKY 2016"),
            1,
            "'विवाद से विश्वास योजना' (Direct Tax Vivad se Vishwas Act, 2020) प्रत्यक्ष कर के लंबित मामलों (इनकम टैक्स अपीलों) को निपटाने के लिए लाई गई थी, जिसमें करदाता को ब्याज व पेनल्टी में पूरी छूट देकर केवल विवादित कर का भुगतान करने का विकल्प दिया गया था। (अप्रत्यक्ष करों हेतु 2019 में 'सबका विश्वास' योजना लाई गई थी)।",
            "Vivad se Vishwas settled hundreds of thousands of tax litigation appeals and unlocked thousands of crores in public revenue.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_8_m1_q12", "eco_8",
            "भारत में व्यक्तिगत आयकर अधिनियम किस वर्ष पारित किया गया था जो आज भी देश में प्रत्यक्ष कराधान का मूल आधार है?",
            "In which year was the comprehensive Income Tax Act enacted in India, which continues to govern the assessment, levies, and collection of income tax across the country?",
            listOf("वर्ष 1950", "वर्ष 1961 (Income Tax Act, 1961 - Effective from 1 April 1962)", "वर्ष 1971", "वर्ष 1985"),
            listOf("1950", "1961 (Income-tax Act, 1961 containing sections for salary, house property, business profits, capital gains, and other sources)", "1971", "1985"),
            1,
            "भारत का 'आयकर अधिनियम, 1961' (Income Tax Act, 1961) 1 अप्रैल 1962 से लागू हुआ। यह अधिनियम देश में 5 प्रमुख आय शीर्षों (Salaries, House Property, Profits and Gains of Business or Profession, Capital Gains, Income from Other Sources) पर कर लगाने का नियमन करता है। (भारत में सर्वप्रथम आयकर 1860 में सर जेम्स विल्सन द्वारा 1857 के विद्रोह के नुकसान की भरपाई हेतु लगाया गया था)।",
            "The Income Tax Act of 1961 forms the structural statutory framework for direct taxation across India.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m1_q13", "eco_8",
            "किसी वित्तीय परिसंपत्ति (जैसे शेयर, रियल एस्टेट आदि) को 12 माह से अधिक (या रियल एस्टेट में 24 माह) रखकर बेचने पर होने वाले मुनाफे पर लगने वाले कर को क्या कहते हैं?",
            "What is the tax levied on profits earned from the sale of capital assets (such as listed shares, mutual funds, or real estate) held beyond a statutory holding period?",
            listOf("अल्पकालिक पूंजीगत लाभ कर (STCG)", "दीर्घकालिक पूंजीगत लाभ कर (LTCG - Long Term Capital Gains Tax)", "अप्रत्यक्ष उत्पाद शुल्क", "उपहार कर"),
            listOf("Short Term Capital Gains Tax (STCG)", "Long Term Capital Gains Tax (LTCG - Tax on long-term appreciation of capital assets)", "Excise Duty", "Gift Tax"),
            1,
            "दीर्घकालिक पूंजीगत लाभ कर (LTCG Tax) किसी परिसंपत्ति को एक निश्चित निर्धारित अवधि (जैसे सूचीबद्ध शेयर हेतु 12 माह, अचल संपत्ति हेतु 24 माह) से अधिक समय तक रखने के बाद बेचने से हुए लाभ पर लगाया जाता है।",
            "Capital gains taxation categorizes investment returns based on holding durations to incentivize long-term productive capital formation.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m1_q14", "eco_8",
            "कर वंचना (Tax Evasion) और कर परिहार / कर नियोजन (Tax Avoidance / Tax Planning) में क्या कानूनी अंतर है?",
            "What is the essential legal distinction between illegal 'Tax Evasion' and legitimate 'Tax Planning' in financial and fiscal jurisprudence?",
            listOf("दोनों पूर्णतः वैध हैं", "कर वंचना (Tax Evasion) गैरकानूनी, कपटपूर्ण और दंडनीय अपराध है, जबकि कर नियोजन (Tax Planning) कानून के प्रावधानों के भीतर रहकर कर भार कम करने का वैध तरीका है", "कर नियोजन गैरकानूनी है जबकि कर वंचना कानूनी है", "दोनों में कोई अंतर नहीं है"),
            listOf("Both practices are completely legal", "Tax Evasion is illegal, deliberate misrepresentation punishable by criminal penalties, while Tax Planning is legal utilization of exemptions and statutory rebates", "Tax planning is criminal while evasion is legitimate", "There is no legal distinction"),
            1,
            "कर वंचना (Tax Evasion) आय छुपाने या फर्जी खर्च दिखाकर कर न चुकाने का गैरकानूनी कृत्य है जो दंडनीय है। इसके विपरीत 'कर नियोजन' (Tax Planning) आयकर अधिनियम की धाराओं (जैसे 80C, 80D) का उपयोग करके वैध रूप से कर दायित्व को न्यूनतम करने की प्रक्रिया है।",
            "Sound fiscal administration strictly prosecutes illicit tax evasion while upholding taxpayers' rights to statutory tax planning.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_8_m1_q15", "eco_8",
            "भारत में गैर-पंजीकृत कंपनियों या स्टार्टअप्स द्वारा फेयर मार्केट वैल्यू (FMV) से अधिक मूल्य पर शेयर जारी करने पर लगने वाले कर को किस नाम से जाना जाता था (जिसे 2024 में समाप्त कर दिया गया)?",
            "Which direct tax provision introduced under Section 56(2)(viib) of the Income Tax Act in 2012 on unlisted companies raising capital above fair market value was officially abolished in Budget 2024?",
            listOf("गिफ्ट टैक्स", "एंजेल टैक्स (Angel Tax - Abolished in Union Budget 2024-25 to foster startup ecosystem)", "मैट (MAT)", "टॉबिन टैक्स"),
            listOf("Gift Tax", "Angel Tax (Introduced in 2012 to curb money laundering, abolished in 2024 to unlock venture capital inflows for Indian startups)", "Minimum Alternate Tax (MAT)", "Tobin Tax"),
            1,
            "एंजेल टैक्स (Angel Tax) 2012 में गैर-सूचीबद्ध कंपनियों द्वारा एंजेल निवेशकों से फेयर मार्केट वैल्यू से अधिक प्रीमियम पर जुटाई गई पूंजी पर लगाया गया था। भारतीय स्टार्टअप पारिस्थितिकी तंत्र को बढ़ावा देने और उद्यम पूंजी निवेश को प्रोत्साहित करने के लिए केंद्रीय बजट 2024-25 में इसे पूरी तरह समाप्त कर दिया गया।",
            "The abolition of the Angel Tax in 2024 was widely hailed as a historic boost for entrepreneurship and innovation funding in India.",
            "Moderate"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + EconomyQuestionHelper.generateTopicMocks("eco_8", 2, 5, baseQuestions)
    }
}
