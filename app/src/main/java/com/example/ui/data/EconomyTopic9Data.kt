package com.example.ui.data

import com.example.ui.data.EconomyQuestionHelper.makeEconomyQ
import com.example.ui.model.GkQuestion

object EconomyTopic9Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions) - पूंजी बाजार, स्टॉक एक्सचेंज, BSE, NSE, IPO एवं सूचकांक
        // ==========================================
        makeEconomyQ(
            "eco_9_m1_q1", "eco_9",
            "एशिया का सबसे पुराना स्टॉक एक्सचेंज कौन-सा है जिसकी स्थापना 1875 में प्रेमचंद रायचंद द्वारा 'द नेटिव शेयर एंड स्टॉक ब्रोकर्स एसोसिएशन' के रूप में की गई थी?",
            "Which is Asia's oldest stock exchange, established in 1875 under a banyan tree by Premchand Roychand as 'The Native Share and Stock Brokers' Association'?",
            listOf("टोक्यो स्टॉक एक्सचेंज", "बॉम्बे स्टॉक एक्सचेंज (BSE - Bombay Stock Exchange / Dalal Street, Mumbai / Sensex)", "नेशनल स्टॉक एक्सचेंज (NSE)", "शंघाई स्टॉक एक्सचेंज"),
            listOf("Tokyo Stock Exchange", "Bombay Stock Exchange (BSE - Founded in July 1875 on Dalal Street, Mumbai; Asia's first and oldest stock exchange)", "National Stock Exchange", "Shanghai Stock Exchange"),
            1,
            "बॉम्बे स्टॉक एक्सचेंज (BSE) एशिया का सबसे पहला और सबसे पुराना स्टॉक एक्सचेंज है, जिसकी स्थापना 9 जुलाई 1875 को मुंबई के दलाल स्ट्रीट पर हुई थी। इसका प्रमुख संवेदी सूचकांक 'सेंसेक्स' (SENSEX) है जिसमें शीर्ष 30 बड़ी कंपनियां शामिल हैं।",
            "The Bombay Stock Exchange is an iconic historic pillar of India's commercial capitalism and financial markets.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q2", "eco_9",
            "भारत में आधुनिक, पारदर्शी एवं पूर्णतः इलेक्ट्रॉनिक स्क्रीन-आधारित व्यापार प्रणाली स्थापित करने के लिए 'फेरवानी समिति' (Pherwani Committee, 1991) की सिफारिश पर किस एक्सचेंज की स्थापना 1992 में की गई थी?",
            "Which premier national stock exchange was established in 1992 based on the recommendations of the M. J. Pherwani High-Powered Committee to introduce modern electronic screen-based trading?",
            listOf("मद्रास स्टॉक एक्सचेंज", "नेशनल स्टॉक एक्सचेंज (NSE - National Stock Exchange of India / NIFTY 50 / BKC, Mumbai)", "कलकत्ता स्टॉक एक्सचेंज", "मल्टी कमोडिटी एक्सचेंज (MCX)"),
            listOf("Madras Stock Exchange", "National Stock Exchange of India (NSE - Incorporated in 1992, recognized in 1993, and pioneered nationwide electronic screen-based order-matching)", "Calcutta Stock Exchange", "Multi Commodity Exchange"),
            1,
            "नेशनल स्टॉक एक्सचेंज (NSE) की स्थापना 1992 में फेरवानी समिति की सिफारिशों पर आईडीबीआई, एलआईसी व एसबीआई जैसी वित्तीय संस्थाओं द्वारा की गई। 1994 में इसने देश में पहली बार सैटेलाइट-लिंक्ड स्क्रीन-आधारित ट्रेडिंग (NEAT) शुरू की। इसका प्रमुख सूचकांक 'निफ्टी 50' (NIFTY 50) है।",
            "NSE revolutionized Indian capital markets through paperless nationwide electronic trading and robust risk management.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q3", "eco_9",
            "बॉम्बे स्टॉक एक्सचेंज के संवेदी सूचकांक 'सेंसेक्स' (SENSEX - Sensitive Index) की गणना में कितनी शीर्ष सूचीबद्ध कंपनियां शामिल होती हैं और इसका आधार वर्ष क्या है?",
            "How many top, actively traded blue-chip companies comprise the BSE SENSEX, and what is its historical Base Year?",
            listOf("50 कंपनियां (आधार वर्ष: 1995-96)", "30 कंपनियां (आधार वर्ष: 1978-79 = 100 / Free-Float Market Capitalization methodology)", "100 कंपनियां (आधार वर्ष: 1990-91)", "20 कंपनियां (आधार वर्ष: 1985-86)"),
            listOf("50 companies (Base: 1995-96)", "30 companies (Base Year: 1978-79 with a base value of 100 / Computed using Free-Float Market Capitalization)", "100 companies (Base: 1990-91)", "20 companies (Base: 1985-86)"),
            1,
            "सेंसेक्स (SENSEX - जिसे दीपक मोहनी द्वारा नाम दिया गया) में बीएसई की 30 सबसे बड़ी और तरल कंपनियां शामिल हैं। इसका आधार वर्ष 1978-79 (आधार मूल्य = 100) है। 2003 से इसकी गणना 'फ्री-फ्लोट मार्केट कैपिटलाइजेशन' पद्धति के आधार पर की जाती है।",
            "BSE SENSEX is regarded worldwide as the definitive barometer of the Indian economy and capital markets.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q4", "eco_9",
            "जब कोई गैर-सूचीबद्ध कंपनी पहली बार आम जनता के लिए अपने शेयर जारी करके शेयर बाजार में सूचीबद्ध होती है, तो इस प्रक्रिया को क्या कहा जाता है?",
            "When an unlisted private company offers its equity shares to the public for the very first time to raise fresh capital and list on a stock exchange, what is the offering called?",
            listOf("राइट्स इश्यू (Rights Issue)", "आरंभिक सार्वजनिक निर्गम (IPO - Initial Public Offering / Primary Market)", "फॉलो-ऑन पब्लिक ऑफर (FPO)", "बोनस शेयर (Bonus Shares)"),
            listOf("Rights Issue", "Initial Public Offering (IPO - Underwritten primary market process where a company transitions from private to publicly traded)", "Follow-on Public Offering (FPO)", "Bonus Issue"),
            1,
            "आरंभिक सार्वजनिक निर्गम (IPO) प्राथमिक बाजार (Primary Market) का हिस्सा है, जिसके माध्यम से कोई कंपनी पहली बार सार्वजनिक निवेशकों को शेयर बेचकर पूंजी जुटाती है। इसके बाद शेयर द्वितीयक बाजार (Secondary Market / स्टॉक एक्सचेंज) में खरीदे-बेचे जाते हैं।",
            "An IPO is the primary gateway for private enterprises to access retail, HNI, and institutional equity funding.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q5", "eco_9",
            "शेयर बाजार में जब किसी कंपनी के मौजूदा शेयरधारकों को उनकी वर्तमान हिस्सेदारी के अनुपात में नए शेयर खरीदने का पहला अधिकार दिया जाता है, तो उसे क्या कहते हैं?",
            "What is an issue of shares offered at a discounted price exclusively to existing shareholders in proportion to their current holding termed?",
            listOf("प्राइवेट प्लेसमेंट", "राइट्स इश्यू (Rights Issue / अधिकार निर्गम)", "स्वीट इक्विटी (Sweat Equity)", "ओएफएस (Offer for Sale)"),
            listOf("Private Placement", "Rights Issue (Enabling existing equity holders to protect their proportionate ownership against dilution)", "Sweat Equity", "Offer for Sale (OFS)"),
            1,
            "राइट्स इश्यू (Rights Issue) एक ऐसी प्रक्रिया है जिसमें कोई पहले से सूचीबद्ध कंपनी अतिरिक्त पूंजी जुटाने के लिए केवल अपने मौजूदा शेयरधारकों को उनके पास मौजूद शेयरों के अनुपात में रियायती मूल्य पर नए शेयर खरीदने का अवसर देती है।",
            "Rights issues protect existing shareholders from sudden dilution while raising equity capital cost-effectively.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_9_m1_q6", "eco_9",
            "शेयर बाजार में लगातार कीमतों के बढ़ने और निवेशकों के अत्यधिक आशावादी (Optimistic) माहौल को किस जानवर के प्रतीक से दर्शाया जाता है?",
            "In financial market terminology, which animal symbolizes rising stock prices, upward momentum, and high investor optimism?",
            listOf("भालू (Bear / मंदी)", "बुल / तेजड़िया (Bull - Bull Market / सींगों से ऊपर उछालने की प्रवृत्ति)", "बाघ (Tiger)", "भेड़िया (Wolf)"),
            listOf("Bear (Pessimistic / falling market)", "Bull (Bullish Market - Symbolizing upward price momentum and economic exuberance)", "Tiger", "Wolf"),
            1,
            "शेयर बाजार में:\n- 'बुल' (Bull / तेजड़िया): वह निवेशक जो बाजार या शेयरों के भाव बढ़ने की उम्मीद करता है (क्योंकि सांड अपने सींगों से शिकार को ऊपर उछालता है)।\n- 'बियर' (Bear / मंदड़िया): वह निवेशक जो कीमतों में गिरावट की उम्मीद करता है (क्योंकि भालू अपने पंजे से नीचे दबाता है)।",
            "The Bull and Bear duality defines market cycles of greed, fear, growth, and contraction across global bourses.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q7", "eco_9",
            "भारत में चीन के बाद दुनिया का पहला प्रमुख शेयर बाजार बनने का गौरव प्राप्त हुआ जिसने शेयर सौदों के निपटान हेतु किस सुपर-फास्ट सेटलमेंट चक्र को पूरी तरह लागू किया?",
            "India became the second major equity market in the world after China to transition all listed stocks to which fast rolling settlement cycle in January 2023?",
            listOf("T+5 सेटलमेंट", "T+1 सेटलमेंट (Trade Date + 1 Day Settlement Cycle / T+0 वैकल्पिक रूप से 2024 में शुरू)", "T+3 सेटलमेंट", "T+7 सेटलमेंट"),
            listOf("T+5 settlement", "T+1 Settlement Cycle (Trade plus 1 business day settlement, minimizing counterparty risk and freeing capital faster)", "T+3 settlement", "T+7 settlement"),
            1,
            "जनवरी 2023 में सेबी (SEBI) के नेतृत्व में भारतीय शेयर बाजार T+2 से पूरी तरह T+1 (ट्रेडिंग के अगले दिन शेयर व पैसे का निपटान) पर स्थानांतरित हो गया। मार्च 2024 में भारत ने चुनिंदा शेयरों हेतु T+0 (उसी दिन निपटान) का पायलट परीक्षण भी शुरू किया।",
            "The rapid rollout of T+1 and T+0 settlements placed Indian capital market infrastructure among the fastest globally.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_9_m1_q8", "eco_9",
            "शेयर बाजार में अत्यधिक उतार-चढ़ाव या घबराहट में भारी बिकवाली को रोकने के लिए सेबी द्वारा तय की गई उस सीमा को क्या कहते हैं जिसके पार जाने पर ट्रेडिंग कुछ समय हेतु रुक जाती है?",
            "What automated risk-mitigation mechanism halts nationwide stock exchange trading for a specified cooldown window during extreme market crashes or rallies?",
            listOf("स्टॉप लॉस (Stop Loss)", "सर्किट ब्रेकर / सर्किट लिमिट (Circuit Breakers - Index & Stock Level / 10%, 15%, 20% thresholds)", "शॉर्ट सेलिंग", "मार्जिन कॉल"),
            listOf("Stop Loss", "Circuit Breaker (Index-based market-wide halt triggers at 10%, 15%, and 20% swings to curb panic volatility)", "Short Selling", "Margin Call"),
            1,
            "सर्किट ब्रेकर (Circuit Breaker) वह सुरक्षा तंत्र है जो सेंसेक्स या निफ्टी में किसी दिन 10%, 15% या 20% की तीव्र गिरावट या उछाल आने पर पूरे देश में शेयर बाजार की ट्रेडिंग को 15 मिनट से लेकर पूरे दिन के लिए स्वतः रोक देता है ताकि निवेशक विवेकपूर्ण निर्णय ले सकें।",
            "Market-wide circuit breakers safeguard financial stability against algorithmic flash crashes and panic stampedes.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q9", "eco_9",
            "भारत में भौतिक कागजी शेयरों (Physical Share Certificates) को इलेक्ट्रॉनिक या डिजिटल रूप में परिवर्तित करने की प्रक्रिया को क्या कहा जाता है?",
            "What is the financial process of converting physical paper share certificates into an electronic, book-entry credit format in a Demat account?",
            listOf("रीमटेरियलाइजेशन (Rematerialisation)", "डीमटेरियलाइजेशन (Dematerialisation - Demat / 1996 में NSDL द्वारा शुरू)", "सिक्युरिटाइजेशन", "अमोर्टीजेशन"),
            listOf("Rematerialisation (Converting electronic back to paper)", "Dematerialisation (Demat - Pioneered under the Depositories Act, 1996 to eradicate fake certificates, bad deliveries, and postal delays)", "Securitisation", "Amortisation"),
            1,
            "डीमटेरियलाइजेशन (Demat) कागजी शेयर प्रमाण-पत्रों को इलेक्ट्रॉनिक प्रारूप में बदलने की प्रक्रिया है। 'डिपॉजिटरी अधिनियम, 1996' के बाद भारत में शेयरों की ट्रेडिंग डीमैट खाते के माध्यम से अनिवार्य कर दी गई, जिससे फर्जी शेयर, चोरी और डाक में खोने की समस्याएं समाप्त हो गईं।",
            "Dematerialization catalyzed the historic retail financialization wave across urban and rural India.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q10", "eco_9",
            "भारत में निवेशकों के इलेक्ट्रॉनिक शेयरों और प्रतिभूतियों को सुरक्षित रखने वाली दो प्रमुख केंद्रीय डिपॉजिटरी संस्थाएं कौन-सी हैं?",
            "Which are the two apex registered central depositories in India that hold investors' shares and securities safely in electronic book-entry form?",
            listOf("BSE और NSE", "NSDL (1996) और CDSL (1999) / National Securities Depository Ltd & Central Depository Services Ltd", "RBI और SBI", "SEBI और IRDAI"),
            listOf("BSE and NSE", "NSDL (National Securities Depository Limited, 1996) and CDSL (Central Depository Services Limited, 1999)", "RBI and SBI", "SEBI and IRDAI"),
            1,
            "भारत में दो केंद्रीय डिपॉजिटरी हैं:\n1. NSDL (नेशनल सिक्योरिटीज डिपॉजिटरी लिमिटेड - भारत की पहली डिपॉजिटरी, 1996 में NSE, UTI, IDBI द्वारा स्थापित),\n2. CDSL (सेंट्रल डिपॉजिटरी सर्विसेज लिमिटेड - 1999 में BSE, SBI, HDFC आदि द्वारा स्थापित, 10+ करोड़ डीमैट खाते पार करने वाली पहली संस्था)।",
            "NSDL and CDSL serve as the electronic bank vaults for millions of dematerialized equity and bond holdings.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q11", "eco_9",
            "शेयर बाजार में किसी सूचीबद्ध कंपनी की कीमत (Market Capitalization) की गणना किस प्रकार की जाती है?",
            "How is the Total Market Capitalization (Market Cap) of a publicly listed company on a stock exchange mathematically determined?",
            listOf("कंपनी की कुल संपत्ति + कुल ऋण", "कंपनी के कुल बकाया शेयरों की संख्या × एक शेयर का वर्तमान बाजार मूल्य (Total Outstanding Shares × Current Market Price)", "कंपनी का वार्षिक कुल राजस्व × 10", "कंपनी के बैंक खाते में जमा कुल नकद राशि"),
            listOf("Total Assets + Total Liabilities", "Total Outstanding Shares multiplied by Current Market Price per Share (Market Cap = Shares × CMP)", "Annual Revenue multiplied by PE", "Total Cash Reserves in Bank"),
            1,
            "मार्केट कैपिटलाइजेशन (Market Cap) = कुल जारी शेयर (Outstanding Shares) × प्रति शेयर वर्तमान बाजार मूल्य (Current Market Price)। इसके आधार पर कंपनियों को लार्ज कैप (शीर्ष 100), मिड कैप (101 से 250) और स्मॉल कैप (251 से नीचे) में बांटा जाता है।",
            "Market capitalization is the universal metric for sizing corporations and determining their index weightage.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q12", "eco_9",
            "शेयर बाजार में जब कोई निवेशक अपने पास शेयर न होते हुए भी पहले उच्च मूल्य पर बेचता है और बाद में गिरते मूल्य पर खरीदकर मुनाफा कमाता है, तो इस रणनीति को क्या कहते हैं?",
            "What trading technique involves selling borrowed shares in anticipation of a price decline, aiming to buy them back later at a cheaper rate?",
            listOf("लॉन्ग पोजीशन (Long Position)", "शॉर्ट सेलिंग (Short Selling - मंदी में लाभ कमाने की रणनीति)", "हेजिंग (Hedging)", "आर्बिट्रेज (Arbitrage)"),
            listOf("Long Position", "Short Selling (Borrowing and selling securities with intention to repurchase at a lower price during downtrends)", "Hedging", "Arbitrage"),
            1,
            "शॉर्ट सेलिंग (Short Selling) एक व्यापारिक रणनीति है जिसमें निवेशक किसी शेयर में गिरावट की उम्मीद करते हुए ब्रोकर से उधार लेकर शेयर तुरंत बेच देता है और जब भाव गिर जाता है तो सस्ते में खरीदकर ब्रोकर को लौटा देता है तथा अंतर का लाभ कमाता है।",
            "Short selling facilitates price discovery and provides liquidity, though subjected to stringent margin surveillance.",
            "Moderate"
        ),
        makeEconomyQ(
            "eco_9_m1_q13", "eco_9",
            "भारत का पहला अंतरराष्ट्रीय वित्तीय सेवा केंद्र (IFSC) और अंतरराष्ट्रीय स्टॉक एक्सचेंज (India INX) कहाँ स्थापित किया गया है?",
            "Where is India's first International Financial Services Centre (IFSC) and the mega international exchange 'India INX' located?",
            listOf("नरीमन प्वाइंट, मुंबई", "गिफ्ट सिटी (GIFT City - Gujarat International Finance Tec-City, गांधीनगर, गुजरात / IFSCA)", "साइबराबाद, हैदराबाद", "बीकेसी, मुंबई"),
            listOf("Nariman Point, Mumbai", "GIFT City (Gujarat International Finance Tec-City, Gandhinagar, Gujarat - Regulated by IFSCA)", "Cyberabad, Hyderabad", "BKC, Mumbai"),
            1,
            "गिफ्ट सिटी (GIFT City - गांधीनगर, गुजरात) भारत का पहला बहु-सेवा विशेष आर्थिक क्षेत्र (IFSC) है। यहाँ इंडिया आईएनएक्स (India INX - भारत का पहला अंतरराष्ट्रीय एक्सचेंज) और एनएसई इंटरनेशनल एक्सचेंज स्थित हैं, जिनका नियमन अंतरराष्ट्रीय वित्तीय सेवा केंद्र प्राधिकरण (IFSCA) करता है।",
            "GIFT IFSC positions India as a premier global financial gateway competing with Singapore, Dubai, and London.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q14", "eco_9",
            "शेयर बाजार में किसी कंपनी द्वारा अपने परिचालन लाभ में से अपने शेयरधारकों को नकद रूप में वितरित किए जाने वाले लाभ के अंश को क्या कहा जाता है?",
            "What portion of a corporation's after-tax net earnings is distributed directly to equity shareholders as cash reward on a per-share basis?",
            listOf("ब्याज (Interest)", "लाभांश (Dividend - Dividend Yield)", "पूंजीगत लाभ (Capital Gain)", "अधिभार (Surcharge)"),
            listOf("Interest (Paid on debt/bonds)", "Dividend (Direct reward distributed out of corporate reserves or profits to equity owners)", "Capital Gain", "Surcharge"),
            1,
            "लाभांश (Dividend) कंपनी द्वारा अपने शुद्ध लाभ में से शेयरधारकों को उनके धारित शेयरों के अनुपात में दिया जाने वाला नकद हिस्सा है। किसी शेयर के वार्षिक लाभांश को उसके बाजार मूल्य से विभाजित करने पर 'डिविडेंड यील्ड' (Dividend Yield) प्राप्त होती है।",
            "Dividend payouts reflect robust corporate cash generation and investor-friendly capital allocation policies.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_9_m1_q15", "eco_9",
            "जब कोई कंपनी अपने शेयरों की तरलता (Liquidity) बढ़ाने और खुदरा निवेशकों के लिए शेयर को अधिक किफायती बनाने हेतु एक शेयर को कई छोटे शेयरों में विभाजित करती है, तो इसे क्या कहते हैं?",
            "When a corporation divides its existing high-value shares into multiple lower-priced shares without changing overall market capitalization, what corporate action occurs?",
            listOf("बोनस शेयर (Bonus Issue)", "स्टॉक स्प्लिट / शेयर विभाजन (Stock Split - जैसे 1:2 या 1:10 Split / फेस वैल्यू कम होना)", "शेयर बायबैक (Buyback)", "डीलिस्टिंग (Delisting)"),
            listOf("Bonus Issue", "Stock Split (Splitting Face Value to enhance retail participation and traded liquidity)", "Share Buyback", "Delisting"),
            1,
            "स्टॉक स्प्लिट (Stock Split) में कंपनी अपने एक शेयर के अंकित मूल्य (Face Value - जैसे ₹10) को घटाकर (जैसे ₹1 या ₹2) शेयरों की कुल संख्या बढ़ा देती है। इससे शेयर का बाजार मूल्य आनुपातिक रूप से कम हो जाता है जिससे छोटे निवेशक आसानी से शेयर खरीद सकते हैं।",
            "Stock splits widen the retail shareholder base by lowering psychological nominal share price barriers.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + EconomyQuestionHelper.generateTopicMocks("eco_9", 2, 5, baseQuestions)
    }
}
