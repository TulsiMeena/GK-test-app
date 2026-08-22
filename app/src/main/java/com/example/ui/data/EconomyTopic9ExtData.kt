package com.example.ui.data

import com.example.ui.data.EconomyQuestionHelper.makeEconomyQ
import com.example.ui.model.GkQuestion

object EconomyTopic9ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions) - सेबी (SEBI), म्यूचुअल फंड, मुद्रा बाजार एवं वित्तीय नियामक
        // ==========================================
        makeEconomyQ(
            "eco_9_m6_q1", "eco_9",
            "भारतीय प्रतिभूति और विनिमय बोर्ड (SEBI) की स्थापना 1988 में एक गैर-सांविधिक निकाय के रूप में हुई थी; इसे किस ऐतिहासिक अधिनियम द्वारा 'सांविधिक स्वायत्त शक्तियां' (Statutory Status) प्रदान की गईं?",
            "SEBI was initially set up as an administrative non-statutory body in 1988; through which landmark legislation did Parliament grant it full statutory enforcement powers?",
            listOf("कंपनी अधिनियम, 1956", "सेबी अधिनियम, 1992 (SEBI Act, 1992 - 30 जनवरी 1992 / हर्षद मेहता शेयर घोटाले के बाद सशक्तिकरण)", "बैंकिंग विनियमन अधिनियम, 1949", "फेरा (FERA) अधिनियम"),
            listOf("Companies Act, 1956", "Securities and Exchange Board of India Act, 1992 (Enacted on 30 January 1992, granting comprehensive investigative, regulatory, and punitive powers)", "Banking Regulation Act, 1949", "FERA 1973"),
            1,
            "सेबी (SEBI) की स्थापना 12 अप्रैल 1988 को एक कार्यकारी आदेश द्वारा हुई थी। 1992 के कुख्यात शेयर बाजार घोटाले के बाद संसद द्वारा 'भारतीय प्रतिभूति एवं विनिमय बोर्ड अधिनियम, 1992' (SEBI Act, 1992) पारित कर 30 जनवरी 1992 को इसे पूर्ण वैधानिक दर्जा और अर्ध-न्यायिक शक्तियां दी गईं। इसका मुख्यालय बांद्रा-कुर्ला कॉम्प्लेक्स (BKC), मुंबई में है।",
            "The SEBI Act of 1992 established an autonomous regulatory regime ensuring market integrity and investor protection.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q2", "eco_9",
            "भारतीय प्रतिभूति और विनिमय बोर्ड (SEBI) की पहली महिला अध्यक्ष (First Woman Chairperson) बनने का गौरव मार्च 2022 में किसे प्राप्त हुआ?",
            "Who created history in March 2022 by becoming the first woman Chairperson of the Securities and Exchange Board of India (SEBI)?",
            listOf("अरुंधति भट्टाचार्य", "माधबी पुरी बुच (Madhabi Puri Buch - First woman and first private sector professional to head SEBI)", "उषा थोराट", "रेणुका रामनाथ"),
            listOf("Arundhati Bhattacharya", "Madhabi Puri Buch (Appointed Chairperson of SEBI in March 2022; former Whole-Time Member and ICICI executive)", "Usha Thorat", "Renuka Ramnath"),
            1,
            "माधबी पुरी बुच मार्च 2022 में सेबी की अध्यक्ष बनने वाली पहली महिला तथा निजी क्षेत्र से शीर्ष पद संभालने वाली पहली पेशेवर बनीं (उन्होंने अजय त्यागी का स्थान लिया)।",
            "Madhabi Puri Buch's appointment marked a historic milestone for institutional leadership in Indian capital market regulation.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q3", "eco_9",
            "शेयर बाजार में कंपनी के आंतरिक अधिकारियों द्वारा अप्रकाशित मूल्य-संवेदनशील गोपनीय जानकारी (UPSI) के आधार पर अनुचित लाभ कमाने के लिए किए जाने वाले अवैध सौदों को क्या कहते हैं?",
            "What is the illegal financial offense of trading listed company shares using Non-Public Price Sensitive Information (UPSI) strictly prohibited by SEBI?",
            listOf("हवाला कारोबार", "भेदिया कारोबार / इनसाइडर ट्रेडिंग (Insider Trading - SEBI Prohibition of Insider Trading Regulations)", "मनी लॉन्ड्रिंग", "राउंड ट्रिपिंग"),
            listOf("Hawala", "Insider Trading (Exploiting confidential internal company disclosures to execute profitable trades before market dissemination)", "Money Laundering", "Round Tripping"),
            1,
            "इनसाइडर ट्रेडिंग (Insider Trading) एक गंभीर वित्तीय अपराध है जिसमें कंपनी के प्रमोटर, निदेशक, ऑडिटर या कर्मचारी उस अप्रकाशित गोपनीय वित्तीय जानकारी (जैसे अप्रत्याशित भारी मुनाफा, विलय आदि) के सार्वजनिक होने से पहले शेयर खरीद या बेच लेते हैं। सेबी इस पर भारी जुर्माना और प्रतिबंध लगाता है।",
            "Stringent anti-insider trading frameworks maintain level-playing fields and fair price discovery in public bourses.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q4", "eco_9",
            "सेबी (SEBI) द्वारा दिए गए किसी दंडात्मक आदेश या जुर्माने के खिलाफ अपील सुनने वाला शीर्ष न्यायिक न्यायाधिकरण कौन-सा है?",
            "Which specialized statutory appellate body hears appeals against orders, rulings, and penalties passed by SEBI, IRDAI, and PFRDA?",
            listOf("राष्ट्रीय कंपनी कानून न्यायाधिकरण (NCLT)", "प्रतिभूति अपीलीय न्यायाधिकरण (SAT - Securities Appellate Tribunal / Mumbai / Presided by retired Supreme Court/High Court Judge)", "केंद्रीय प्रशासनिक न्यायाधिकरण (CAT)", "भारतीय प्रतिस्पर्धा आयोग (CCI)"),
            listOf("NCLT (National Company Law Tribunal)", "SAT (Securities Appellate Tribunal - Established under Section 15K of SEBI Act, 1992 in Mumbai)", "CAT (Central Administrative Tribunal)", "Competition Commission of India"),
            1,
            "सिक्योरिटीज अपीलेट ट्रिब्यूनल (SAT) मुंबई में स्थित एक वैधानिक अपीलीय निकाय है जो सेबी (SEBI), बीमा नियामक (IRDAI) और पेंशन नियामक (PFRDA) के आदेशों के विरुद्ध अपीलों की सुनवाई करता है। SAT के निर्णय के खिलाफ सीधे सर्वोच्च न्यायालय (Supreme Court) में अपील की जा सकती है।",
            "SAT provides a critical judicial check and balances system ensuring administrative justice for market participants.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_9_m6_q5", "eco_9",
            "भारत का पहला म्यूचुअल फंड कौन-सा था जिसकी स्थापना 1963 में संसद के एक विशेष अधिनियम द्वारा भारतीय रिजर्व बैंक के तत्वावधान में की गई थी?",
            "Which was the pioneer, very first Mutual Fund in India, established in 1963 by an Act of Parliament to cultivate investment habits among small savers?",
            listOf("एसबीआई म्यूचुअल फंड (1987)", "यूनिट ट्रस्ट ऑफ इंडिया (UTI - Unit Trust of India / 1964 में 'US-64' योजना शुरू)", "एलआईसी म्यूचुअल फंड", "कैनबैंक म्यूचुअल फंड"),
            listOf("SBI Mutual Fund (1987)", "UTI (Unit Trust of India - Established in 1963 under the UTI Act; launched the historic US-64 scheme)", "LIC Mutual Fund", "Canbank Mutual Fund"),
            1,
            "भारत में म्यूचुअल फंड उद्योग की शुरुआत 1963 में 'यूनिट ट्रस्ट ऑफ इंडिया' (UTI) की स्थापना के साथ हुई। 1964 में इसने देश की पहली और सबसे लोकप्रिय योजना 'यूनिट स्कीम-64' (US-64) शुरू की थी। 1987 में सरकारी बैंकों (SBI Mutual Fund) और 1993 में कोठारी पायनियर के साथ निजी क्षेत्र के म्यूचुअल फंडों को अनुमति दी गई।",
            "UTI democratized collective investment pools and paved the pathway for India's multitrillion-rupee asset management industry.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q6", "eco_9",
            "म्यूचुअल फंड में किसी योजना के एक यूनिट (इकाई) के दैनिक वास्तविक बाजार मूल्य को किस रूप में व्यक्त किया जाता है?",
            "What metric represents the per-unit intrinsic market value of a mutual fund scheme calculated by dividing total net assets by total outstanding units at the close of trading?",
            listOf("फेस वैल्यू (Face Value)", "नेट एसेट वैल्यू (NAV - Net Asset Value / शुद्ध परिसंपत्ति मूल्य = [कुल परिसंपत्ति - देनदारियां] / कुल यूनिट्स)", "एक्सपेंस रेशियो (Expense Ratio)", "अल्फा (Alpha)"),
            listOf("Face Value", "Net Asset Value (NAV - Net Asset Value computed on every business day after stock exchange closure)", "Expense Ratio", "Alpha"),
            1,
            "नेट एसेट वैल्यू (NAV) किसी म्यूचुअल फंड की एक यूनिट का मूल्य है। NAV = (फंड की कुल परिसंपत्तियों का वर्तमान बाजार मूल्य - कुल देनदारियां व खर्चे) / कुल बकाया यूनिटों की संख्या। सभी म्यूचुअल फंडों को प्रत्येक कारोबारी दिन के अंत में अपनी योजनाओं की एनएवी घोषित करना अनिवार्य होता है।",
            "Net Asset Value (NAV) provides an objective, mark-to-market valuation metric for mutual fund investors.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q7", "eco_9",
            "म्यूचुअल फंड में नियमित अंतराल (जैसे मासिक या त्रैमासिक) पर एक निश्चित पूर्व-निर्धारित राशि का निवेश करने की सबसे लोकप्रिय अनुशासित विधि को क्या कहा जाता है?",
            "What popular disciplined investment route allows retail investors to invest a fixed sum of money at regular intervals (monthly/quarterly) into a mutual fund scheme?",
            listOf("एकमुश्त निवेश (Lump Sum)", "व्यवस्थित निवेश योजना (SIP - Systematic Investment Plan / Dollar-Cost / Rupee-Cost Averaging)", "व्यवस्थित निकासी योजना (SWP)", "व्यवस्थित हस्तांतरण योजना (STP)"),
            listOf("Lump-sum Investment", "Systematic Investment Plan (SIP - Leverages compounding and Rupee Cost Averaging across volatile market cycles)", "Systematic Withdrawal Plan (SWP)", "Systematic Transfer Plan (STP)"),
            1,
            "सिस्टमैटिक इन्वेस्टमेंट प्लान (SIP) म्यूचुअल फंड में निवेश का सबसे लोकप्रिय तरीका है जिसमें निवेशक हर महीने अपनी पसंद की निश्चित राशि (जैसे ₹500 या ₹1,000) बैंक खाते से स्वतः कटवाकर निवेश करता है। इससे 'रुपया लागत औसत' (Rupee-Cost Averaging) और चक्रवृद्धि ब्याज (Compounding) का जबर्दस्त लाभ मिलता है।",
            "SIPs have become a structural engine channelizing domestic household savings directly into India's capital markets.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q8", "eco_9",
            "म्यूचुअल फंड हाउस द्वारा फंड प्रबंधन, प्रशासन, शोध, विपणन और संचालन लागतों की भरपाई हेतु फंड की कुल परिसंपत्ति से काटे जाने वाले वार्षिक प्रतिशत शुल्क को क्या कहते हैं?",
            "What is the annual percentage fee charged by an Asset Management Company (AMC) to cover fund manager fees, administrative expenses, and operational overheads?",
            listOf("एग्जिट लोड (Exit Load)", "व्यय अनुपात / एक्सपेंस रेशियो (TER - Total Expense Ratio / सेबी द्वारा अधिकतम सीमाएं निर्धारित)", "स्टैंप ड्यूटी", "ब्रोकरेज"),
            listOf("Exit Load", "Total Expense Ratio (TER - Governed under SEBI caps; Direct plans have lower TER compared to Regular broker-commission plans)", "Stamp Duty", "Brokerage"),
            1,
            "टोटल एक्सपेंस रेशियो (TER) वह वार्षिक प्रतिशत शुल्क है जो म्यूचुअल फंड कंपनी (AMC) फंड के प्रबंधन और संचालन के खर्च के रूप में कुल परिसंपत्ति (AUM) से दैनिक आधार पर काटती है। डायरेक्ट प्लान (Direct Plan) में ब्रोकर कमीशन न होने के कारण रेगुलर प्लान (Regular Plan) की तुलना में एक्सपेंस रेशियो कम होता है।",
            "Lower expense ratios compound over long horizons to generate significantly superior net wealth accumulation.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_9_m6_q9", "eco_9",
            "भारत में म्यूचुअल फंड उद्योग के विकास, नैतिकता, निवेशक जागरूकता ('म्यूचुअल फंड्स सही है' अभियान) और विनियमन का स्व-नियामक संघ कौन-सा है?",
            "Which premier industry association in India oversees mutual fund standards, investor awareness drives ('Mutual Funds Sahi Hai'), and ethical code enforcement?",
            listOf("इरडा (IRDAI)", "एम्फी (AMFI - Association of Mutual Funds in India / 1995 में स्थापित)", "एफबीआईएल (FBIL)", "फिक्की (FICCI)"),
            listOf("IRDAI", "AMFI (Association of Mutual Funds in India - Nodal representative body of all registered Asset Management Companies in India)", "FBIL", "FICCI"),
            1,
            "एसोसिएशन ऑफ म्यूचुअल फंड्स इन इंडिया (AMFI) की स्थापना 1995 में हुई थी। यह भारत के सभी सेबी-पंजीकृत म्यूचुअल फंडों (AMCs) का प्रतिनिधि गैर-लाभकारी निकाय है जो 'म्यूचुअल फंड्स सही है' जैसे राष्ट्रव्यापी निवेशक शिक्षा अभियानों और म्यूचुअल फंड वितरकों (ARN पंजीकरण) का प्रबंधन करता है।",
            "AMFI maintains professional codes of conduct and institutional transparency across India's mutual fund industry.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q10", "eco_9",
            "अल्पकालिक मुद्रा बाजार (Money Market) में केंद्र सरकार द्वारा अपनी अल्पकालिक वित्तीय जरूरतों को पूरा करने के लिए जारी किए जाने वाले 91 दिन, 182 दिन और 364 दिन के ऋण पत्रों को क्या कहते हैं?",
            "What are the sovereign short-term debt instruments issued by the Reserve Bank of India on behalf of the Central Government with tenors of 91, 182, and 364 days?",
            listOf("वाणिज्यिक पत्र (Commercial Paper)", "ट्रेजरी बिल / टी-बिल (Treasury Bills / T-Bills - Zero Coupon Securities issued at discount to face value)", "जमा प्रमाण पत्र (CD)", "कैश मैनेजमेंट बिल (CMB)"),
            listOf("Commercial Paper (Issued by corporates)", "Treasury Bills (T-Bills - Sovereign money market instruments issued at a discount and redeemed at par without explicit interest coupons)", "Certificate of Deposit", "Cash Management Bills"),
            1,
            "ट्रेजरी बिल (T-Bills) भारत सरकार की ओर से आरबीआई द्वारा जारी किए जाने वाले 1 वर्ष से कम (91 दिन, 182 दिन, 364 दिन) अवधि के जोखिम-मुक्त ऋण पत्र हैं। ये 'जीरो कूपन' बांड होते हैं जिन्हें अंकित मूल्य से छूट (Discount) पर बेचा जाता है और परिपक्वता पर पूरा अंकित मूल्य दिया जाता है। (राज्य सरकारें टी-बिल जारी नहीं कर सकतीं)।",
            "Treasury Bills serve as benchmark risk-free reference yields for India's domestic short-term money market.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_9_m6_q11", "eco_9",
            "मुद्रा बाजार में उच्च क्रेडिट रेटिंग वाली शीर्ष कॉर्पोरेट कंपनियों द्वारा बिना किसी बंधक (Unsecured) के अल्पकालिक पूंजी जुटाने हेतु 1990 में पेश किए गए वित्तीय साधन को क्या कहते हैं?",
            "Which unsecured promissory note money-market instrument was introduced in India in 1990 to enable highly rated corporate borrowers to raise short-term working capital?",
            listOf("ट्रेजरी बिल", "वाणिज्यिक पत्र (Commercial Paper - CP / न्यूनतम 7 दिन से अधिकतम 1 वर्ष / न्यूनतम ₹5 लाख मूल्य)", "मांग मुद्रा (Call Money)", "बैंक ड्राफ्ट"),
            listOf("Treasury Bill", "Commercial Paper (CP - Unsecured money-market promissory notes introduced following Vaghul Committee recommendations)", "Call Money", "Bank Draft"),
            1,
            "वाणिज्यिक पत्र (Commercial Paper - CP) वाघुल समिति की सिफारिश पर 1990 में शुरू किया गया था। यह शीर्ष कंपनियों द्वारा 7 दिन से लेकर 1 वर्ष तक की अल्पकालिक कार्यशील पूंजी जुटाने हेतु न्यूनतम ₹5 लाख के गुणकों में जारी किया जाने वाला गैर-जमानती प्रॉमिसरी नोट है।",
            "Commercial Paper provides blue-chip companies an alternative, lower-cost route for short-term liquidity outside traditional bank credit.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_9_m6_q12", "eco_9",
            "अनुसूचित वाणिज्यिक बैंकों द्वारा किसी संस्था या व्यक्ति से बड़ी सावधि जमा राशि जुटाने हेतु न्यूनतम ₹1 लाख के मूल्य में जारी किए जाने वाले परक्राम्य (Negotiable) साधन को क्या कहते हैं?",
            "What negotiable, dematerialized money-market instrument is issued by Scheduled Commercial Banks to mobilize large short-term deposits from high net-worth individuals and corporates?",
            listOf("ट्रेजरी बिल", "जमा प्रमाण पत्र (CD - Certificate of Deposit / 1989 में शुरू / न्यूनतम 7 दिन से 1 वर्ष)", "वाणिज्यिक बिल", "किसान विकास पत्र"),
            listOf("Treasury Bill", "Certificate of Deposit (CD - Introduced in 1989 on Vaghul Committee recommendations with minimum ₹1 Lakh denomination)", "Commercial Bill", "Kisan Vikas Patra"),
            1,
            "सर्टिफिकेट ऑफ डिपॉजिट (CD) 1989 में शुरू किया गया एक परक्राम्य मुद्रा बाजार साधन है जिसे अनुसूचित वाणिज्यिक बैंक (7 दिन से 1 वर्ष हेतु) और वित्तीय संस्थाएं (1 से 3 वर्ष हेतु) न्यूनतम ₹1 लाख के गुणकों में फंड जुटाने के लिए जारी करते हैं।",
            "Certificates of Deposit allow commercial banks to mobilize bulk wholesale funding during tight interbank liquidity conditions.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_9_m6_q13", "eco_9",
            "भारत की पहली और सबसे पुरानी क्रेडिट रेटिंग एजेंसी कौन-सी है जिसकी स्थापना 1987 में ICICI और UTI द्वारा की गई थी?",
            "Which is India's pioneer and oldest Credit Rating Agency, incorporated in 1987 and majority-owned by global ratings powerhouse S&P Global?",
            listOf("इक्रा (ICRA)", "क्रिसिल (CRISIL - Credit Rating Information Services of India Limited / Mumbai / 1987)", "केयर (CARE Ratings)", "इंडिया रेटिंग्स (India Ratings)"),
            listOf("ICRA (1991)", "CRISIL (Credit Rating Information Services of India Limited - Founded in 1987 as India's first domestic credit evaluation agency)", "CARE Ratings (1993)", "India Ratings"),
            1,
            "क्रिसिल (CRISIL) भारत की पहली क्रेडिट रेटिंग एजेंसी है जिसकी स्थापना 1987 में हुई थी। यह कंपनियों और बांडों की साख जोखिम (Credit Risk) का मूल्यांकन कर AAA, AA, BBB आदि रेटिंग देती है। (वर्तमान में S&P Global इसकी प्रमुख शेयरधारक है। अन्य प्रमुख एजेंसियां ICRA (Moody's) और CARE हैं)।",
            "CRISIL laid the institutional groundwork for independent risk profiling and debt instrument pricing in Indian financial markets.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q14", "eco_9",
            "कमोडिटी डेरिवेटिव्स बाजार में कच्चा तेल (Crude Oil), सोना, चांदी और प्राकृतिक गैस जैसे गैर-कृषि जिंसों के वायदा कारोबार का भारत का सबसे बड़ा एक्सचेंज कौन-सा है?",
            "Which is India's largest commodity derivatives exchange, dominating national turnover in precious metals (Gold, Silver), Crude Oil, and base metals?",
            listOf("एनसीडेक्स (NCDEX - प्रमुख कृषि जिंस एक्सचेंज)", "एमसीएक्स (MCX - Multi Commodity Exchange of India / Mumbai / 2003)", "बीएसई कमोडिटीज", "इंडियन गैस एक्सचेंज (IGX)"),
            listOf("NCDEX (National Commodity and Derivatives Exchange - Agri-commodities leader)", "MCX (Multi Commodity Exchange of India - Established in 2003; India's premier commodity derivatives platform)", "BSE Commodities", "Indian Gas Exchange"),
            1,
            "मल्टी कमोडिटी एक्सचेंज ऑफ इंडिया (MCX) भारत का सबसे बड़ा कमोडिटी एक्सचेंज है जो सोना, चांदी, कच्चा तेल और धातुओं के वायदा (Futures & Options) कारोबार में 90%+ बाजार हिस्सेदारी रखता है। (कृषि जिंसों जैसे ग्वार, चना, सोयाबीन आदि के लिए NCDEX शीर्ष एक्सचेंज है। 2015 से सेबी ही कमोडिटी एक्सचेंजों का नियामक है)।",
            "MCX serves as India's dominant domestic price discovery and corporate hedging platform for commodities.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m6_q15", "eco_9",
            "रियल एस्टेट और बुनियादी ढांचा परियोजनाओं में आम खुदरा निवेशकों को नियमित किराये/टोल आय प्राप्त करने के उद्देश्य से शुरू किए गए म्यूचुअल फंड जैसे निवेश ट्रस्ट कौन-से हैं?",
            "What investment trusts regulated by SEBI pool investor capital to purchase and operate income-yielding commercial real estate and infrastructure assets (highways, power grids)?",
            listOf("एंजेल फंड्स", "रीट्स (REITs - Real Estate Investment Trusts) एवं इनविट्स (InvITs - Infrastructure Investment Trusts)", "सॉवरेन वेल्थ फंड्स", "हेज फंड्स"),
            listOf("Angel Funds", "REITs (Real Estate Investment Trusts) and InvITs (Infrastructure Investment Trusts - Enabling fractional ownership of income-generating real assets)", "Sovereign Wealth Funds", "Hedge Funds"),
            1,
            "रीट्स (REITs) और इनविट्स (InvITs) सेबी द्वारा विनियमित ऐसे निवेश ट्रस्ट हैं जो बड़े वाणिज्यिक परिसरों (मॉल, आईटी पार्क - REITs) या राष्ट्रीय राजमार्गों व ट्रांसमिशन ग्रिडों (InvITs) में निवेशकों का पैसा लगाते हैं और होने वाले 90% किराये या टोल संग्रह को लाभांश के रूप में निवेशकों को वितरित करते हैं।",
            "REITs and InvITs facilitate the fractional monetization of infrastructure while yielding predictable passive cashflows for retail investors.",
            "Moderate"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + EconomyQuestionHelper.generateTopicMocks("eco_9", 7, 10, baseQuestions)
    }
}
