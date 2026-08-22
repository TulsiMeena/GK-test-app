package com.example.ui.data

import com.example.ui.data.EconomyQuestionHelper.makeEconomyQ
import com.example.ui.model.GkQuestion

object EconomyTopic10Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions) - प्रमुख फ्लैगशिप योजनाएं, वित्तीय समावेशन, आवास एवं ग्रामीण रोजगार
        // ==========================================
        makeEconomyQ(
            "eco_10_m1_q1", "eco_10",
            "विश्व के सबसे बड़े वित्तीय समावेशन अभियान 'प्रधानमंत्री जन धन योजना' (PMJDY) का शुभारंभ प्रधानमंत्री नरेंद्र मोदी द्वारा किस ऐतिहासिक तिथि को किया गया था?",
            "On which historic date was the world's largest financial inclusion mission 'Pradhan Mantri Jan Dhan Yojana' (PMJDY) officially launched across India?",
            listOf("15 अगस्त 2014", "28 अगस्त 2014 (28 August 2014 / 'मेरा खाता भाग्य विधाता' / 50+ करोड़ बैंक खाते)", "2 अक्टूबर 2014", "1 जनवरी 2015"),
            listOf("15 August 2014 (Announced from Red Fort)", "28 August 2014 (Officially launched nationwide with the motto 'Mera Khata Bhagya Vidhata')", "2 October 2014", "1 January 2015"),
            1,
            "प्रधानमंत्री जन धन योजना (PMJDY) 28 अगस्त 2014 को शुरू की गई थी। इसका उद्देश्य प्रत्येक असंबद्ध परिवार को जीरो-बैलेंस बचत बैंक खाता, ₹2 लाख का निःशुल्क दुर्घटना बीमा वाला RuPay डेबिट कार्ड और ₹10,000 तक की ओवरड्राफ्ट (OD) सुविधा प्रदान करना था। इसने 'JAM त्रिमूर्ति' (Jan Dhan, Aadhaar, Mobile) की नींव रखी।",
            "PMJDY anchored India's global leadership in universal banking access and direct benefit transfer mechanisms.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q2", "eco_10",
            "ग्रामीण परिवारों को एक वित्तीय वर्ष में कम से कम 100 दिनों के अकुशल शारीरिक श्रम रोजगार की कानूनी गारंटी देने वाला ऐतिहासिक 'मनरेगा अधिनियम' (MGNREGA Act) संसद द्वारा किस वर्ष पारित हुआ था?",
            "In which year was the historic legislation guaranteeing at least 100 days of statutory wage employment per rural household enacted by the Parliament of India?",
            listOf("वर्ष 2000", "वर्ष 2005 (National Rural Employment Guarantee Act, 2005 - NREGA / 2 फरवरी 2006 से लागू / 2009 में 'महात्मा गांधी' नाम जुड़ा)", "वर्ष 2009", "वर्ष 2014"),
            listOf("2000", "2005 (NREGA enacted in September 2005, rolled out on 2 February 2006 at Bandlapalli, AP; renamed MGNREGA on 2 October 2009)", "2009", "2014"),
            1,
            "महात्मा गांधी राष्ट्रीय ग्रामीण रोजगार गारंटी अधिनियम (MGNREGA) सितंबर 2005 में पारित हुआ और 2 फरवरी 2006 को आंध्र प्रदेश के अनंतपुर जिले के बंदलापल्ली से शुरू हुआ। 2 अक्टूबर 2009 को इसका नाम बदलकर 'मनरेगा' किया गया। यह काम मांगने के 15 दिनों के भीतर काम न मिलने पर 'बेरोजगारी भत्ता' पाने का कानूनी अधिकार देता है।",
            "MGNREGA serves as India's premier rural social safety net and lifeline against distress agrarian migration.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q3", "eco_10",
            "देश के सभी पात्र भूमिधारक किसान परिवारों को प्रति वर्ष ₹6,000 की प्रत्यक्ष आय सहायता प्रदान करने वाली 'प्रधानमंत्री किसान सम्मान निधि' (PM-KISAN) योजना किस तिथि से प्रभावी मानी गई है?",
            "From which retrospective date was the flagship central sector scheme 'PM-KISAN' (providing ₹6,000 annual direct income support in three equal installments of ₹2,000) made effective?",
            listOf("1 जनवरी 2019", "1 दिसंबर 2018 (Effective 1 Dec 2018 / 24 फरवरी 2019 को गोरखपुर, यूपी से औपचारिक शुभारंभ)", "1 अप्रैल 2019", "15 अगस्त 2018"),
            listOf("1 January 2019", "1 December 2018 (Formally launched by PM Modi from Gorakhpur, UP on 24 February 2019 with retrospective benefit from Dec 2018)", "1 April 2019", "15 August 2018"),
            1,
            "प्रधानमंत्री किसान सम्मान निधि (PM-KISAN) 100% केंद्र पोषित योजना है जो 1 दिसंबर 2018 से प्रभावी हुई और 24 फरवरी 2019 को गोरखपुर से शुरू की गई। इसके तहत पात्र किसानों के आधार-लिंक्ड बैंक खातों में ₹2000-₹2000 की तीन समान किस्तों (वार्षिक कुल ₹6,000) में डायरेक्ट बेनिफिट ट्रांसफर (DBT) किया जाता है।",
            "PM-KISAN directly supplements small and marginal farmers' liquidity for agricultural inputs and domestic needs.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q4", "eco_10",
            "'प्रधानमंत्री आवास योजना - ग्रामीण' (PMAY-G) के तहत मैदानी एवं पहाड़ी/दुर्गम क्षेत्रों में पक्का मकान बनाने हेतु दी जाने वाली वित्तीय सहायता राशि क्रमशः कितनी है?",
            "Under the restructured 'Pradhan Mantri Awas Yojana - Gramin' (PMAY-G launched in 2016), what financial unit assistance grant is disbursed for plain and hilly/difficult terrains respectively?",
            listOf("मैदानी: ₹70,000 और पहाड़ी: ₹75,000", "मैदानी क्षेत्र: ₹1,20,000 एवं पहाड़ी/पूर्वोत्तर क्षेत्र: ₹1,30,000 (साथ में शौचालय हेतु ₹12,000 व मनरेगा मजदूरी)", "मैदानी: ₹2,00,000 और पहाड़ी: ₹2,50,000", "सभी क्षेत्रों हेतु ₹1,00,000"),
            listOf("Plain: ₹70,000 and Hilly: ₹75,000 (Old Indira Awaas Yojana rates)", "Plain areas: ₹1,20,000 and Hilly/NE/Difficult areas: ₹1,30,000 (in addition to ₹12,000 SBM toilet aid & 90-95 days MGNREGA wages)", "Plain: ₹2,00,000 and Hilly: ₹2,50,000", "Uniform ₹1,00,000"),
            1,
            "2016 में पुरानी 'इंदिरा आवास योजना' का पुनर्गठन कर 'प्रधानमंत्री आवास योजना-ग्रामीण' (PMAY-G) शुरू की गई। इसमें मैदानी क्षेत्रों हेतु ₹1.20 लाख तथा पहाड़ी/पूर्वोत्तर राज्यों हेतु ₹1.30 लाख की 100% अनुदान सहायता सीधे लाभार्थी के खाते में दी जाती है। मकान का न्यूनतम क्षेत्रफल 25 वर्ग मीटर (रसोई सहित) तय है।",
            "PMAY-G revolutionized rural housing through direct DBT disbursements, geo-tagging, and female property ownership empowerment.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q5", "eco_10",
            "गरीब ग्रामीण महिलाओं को धुएं से मुक्ति और स्वच्छ रसोई ईंधन प्रदान करने हेतु 1 मई 2016 को बलिया (उत्तर प्रदेश) से शुरू की गई फ्लैगशिप योजना कौन-सी है?",
            "Which transformative welfare scheme was launched on 1 May 2016 from Ballia, Uttar Pradesh with the famous slogan 'Swachh Indhan, Behtar Jeevan' to provide deposit-free LPG connections to BPL women?",
            listOf("प्रधानमंत्री मातृ वंदना योजना", "प्रधानमंत्री उज्ज्वला योजना (PMUY - Pradhan Mantri Ujjwala Yojana / Ujjwala 2.0 launched from Mahoba, UP in August 2021)", "दीनदयाल अंत्योदय योजना", "अमृत (AMRUT) योजना"),
            listOf("Pradhan Mantri Matru Vandana Yojana", "Pradhan Mantri Ujjwala Yojana (PMUY - Delivered over 10 crore deposit-free LPG connections to women from below-poverty-line households)", "Deendayal Antyodaya Yojana", "AMRUT Scheme"),
            1,
            "प्रधानमंत्री उज्ज्वला योजना (PMUY) 1 मई 2016 को बलिया (यूपी) से पेट्रोलियम एवं प्राकृतिक गैस मंत्रालय द्वारा शुरू की गई थी। इसके तहत प्रति कनेक्शन ₹1600 की वित्तीय सहायता के साथ मुफ्त गैस कनेक्शन, पहला भरा सिलेंडर और चूल्हा दिया जाता है। 10 अगस्त 2021 को 'उज्ज्वला 2.0' महोबा (यूपी) से शुरू की गई।",
            "Ujjwala significantly reduced indoor air pollution, eye diseases, and drudgery among rural Indian women.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q6", "eco_10",
            "देश के प्रत्येक ग्रामीण परिवार को वर्ष 2024 तक नल से शुद्ध पेयजल (55 लीटर प्रति व्यक्ति प्रतिदिन) उपलब्ध कराने के उद्देश्य से 15 अगस्त 2019 को कौन-सा महत्वाकांक्षी राष्ट्रीय मिशन शुरू किया गया?",
            "Which mega national mission was announced by Prime Minister Narendra Modi on 15 August 2019 to provide functional tap water connections (FHTC) to every rural household?",
            listOf("राष्ट्रीय जल मिशन", "जल जीवन मिशन (JJM - Jal Jeevan Mission / 'हर घर जल' / जल शक्ति मंत्रालय / 55 lpcd शुद्ध पेयजल)", "नमामि गंगे कार्यक्रम", "अटल भूजल योजना"),
            listOf("National Water Mission", "Jal Jeevan Mission (JJM - Aimed at providing Functional Household Tap Connection of 55 liters per capita per day to all rural homes)", "Namami Gange Programme", "Atal Bhujal Yojana"),
            1,
            "जल जीवन मिशन (JJM) 15 अगस्त 2019 को जल शक्ति मंत्रालय के तहत घोषित किया गया। इसका लक्ष्य 2024 तक देश के 19 करोड़ से अधिक ग्रामीण घरों में 'हर घर नल से जल' (55 लीटर प्रति व्यक्ति प्रतिदिन) पहुंचाना है। गोवा 100% हर घर जल प्रमाणित होने वाला देश का पहला राज्य बना।",
            "Jal Jeevan Mission represents one of the largest decentralized drinking water infrastructure rollouts in global history.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q7", "eco_10",
            "सूक्ष्म एवं लघु उद्यमियों को बिना किसी संपत्ति बंधक (Collateral-Free) के ₹10 लाख (2024 से ₹20 लाख) तक का ऋण देने वाली 'प्रधानमंत्री मुद्रा योजना' (PMMY) के तहत तीन ऋण श्रेणियां कौन-सी हैं?",
            "Under the Pradhan Mantri MUDRA Yojana (PMMY launched on 8 April 2015), what are the three distinct loan categories according to the financing stages of micro enterprises?",
            listOf("बाल, युवा, वृद्ध", "शिशु (₹50,000 तक), किशोर (₹50,000 से ₹5 लाख), और तरुण (₹5 लाख से ₹10 लाख / तरुण प्लस: ₹20 लाख)", "प्राथमिक, माध्यमिक, उच्च", "लघु, मध्यम, वृहद"),
            listOf("Bal, Yuva, Vridha", "Shishu (Loans up to ₹50,000), Kishore (Loans above ₹50,000 up to ₹5 Lakh), and Tarun (Loans above ₹5 Lakh up to ₹10 Lakh; expanded to ₹20 Lakh in 2024)", "Primary, Secondary, Advanced", "Small, Medium, Large"),
            1,
            "प्रधानमंत्री मुद्रा योजना (PMMY) 8 अप्रैल 2015 को शुरू की गई। MUDRA का पूर्ण रूप 'Micro Units Development and Refinance Agency' है। इसमें 3 ऋण श्रेणियां हैं:\n1. शिशु (Shishu): ₹50,000 तक,\n2. किशोर (Kishore): ₹50,000 से ₹5 लाख,\n3. तरुण (Tarun): ₹5 लाख से ₹10 लाख (बजट 2024 में सफल तरुण उद्यमियों हेतु सीमा ₹20 लाख की गई)।",
            "MUDRA loans funded over 45 crore micro-entrepreneurs, with nearly 70% disbursements going to women entrepreneurs.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q8", "eco_10",
            "कोविड-19 महामारी के दौरान रेहड़ी-पटरी वालों एवं स्ट्रीट वेंडरों को अपना काम फिर से शुरू करने हेतु ₹10,000 से ₹50,000 तक की कार्यशील पूंजी संपार्श्विक-मुक्त ऋण देने के लिए कौन-सी योजना शुरू की गई?",
            "Which micro-credit scheme was launched on 1 June 2020 by the Ministry of Housing and Urban Affairs to provide collateral-free working capital loans to urban street vendors?",
            listOf("पीएम स्वनिधि (PM SVANidhi - PM Street Vendor's AtmaNirbhar Nidhi / 7% ब्याज सब्सिडी एवं डिजिटल कैशबैक)", "पीएम कुसुम योजना", "दीनदयाल उपाध्याय अंत्योदय योजना", "पीएम विकास योजना"),
            listOf("PM SVANidhi (PM Street Vendor's AtmaNirbhar Nidhi offering initial ₹10k, enhanced to ₹20k & ₹50k with 7% interest subvention)", "PM KUSUM Scheme", "Deendayal Upadhyaya Antyodaya Yojana", "PM VIKAS Scheme"),
            1,
            "पीएम स्वनिधि (PM SVANidhi) 1 जून 2020 को आवास एवं शहरी कार्य मंत्रालय द्वारा शुरू की गई। इसके तहत स्ट्रीट वेंडरों को पहले चरण में ₹10,000, समय पर चुकाने पर दूसरे चरण में ₹20,000 और तीसरे चरण में ₹50,000 का सस्ता ऋण (7% वार्षिक ब्याज सब्सिडी और प्रति वर्ष ₹1200 तक डिजिटल लेनदेन कैशबैक) दिया जाता है।",
            "PM SVANidhi integrated urban informal vendors into the formal banking and UPI digital payment mainstream.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q9", "eco_10",
            "17 सितंबर 2023 को विश्वकर्मा जयंती के अवसर पर पारंपरिक कारीगरों एवं शिल्पकारों (18 व्यवसायों) के समग्र विकास हेतु ₹13,000 करोड़ के परिव्यय के साथ कौन-सी केंद्रीय योजना शुरू की गई?",
            "Which comprehensive central scheme was launched on 17 September 2023 to support traditional artisans and craftspeople across 18 family-based trades with collateral-free subsidized credit and modern toolkits?",
            listOf("उस्ताद (USTTAD) योजना", "पीएम विश्वकर्मा योजना (PM Vishwakarma Scheme / ₹3 लाख तक का ऋण मात्र 5% ब्याज पर + ₹15,000 टूलकिट वाउचर + ₹500/दिन वजीफा)", "हुनर हाट योजना", "ग्रामोद्योग विकास योजना"),
            listOf("USTTAD Scheme", "PM Vishwakarma Scheme (End-to-end holistic support for traditional carpenters, blacksmiths, potters, masons, cobblers with ₹3 Lakh collateral-free credit at 5% interest)", "Hunar Haat", "Gramodyog Vikas Yojana"),
            1,
            "पीएम विश्वकर्मा योजना 17 सितंबर 2023 को शुरू हुई। इसके तहत 18 पारंपरिक व्यवसायों (बढ़ई, लोहार, कुम्हार, राजमिस्त्री, मूर्तिकार, दर्जी आदि) को PM विश्वकर्मा प्रमाण-पत्र व आईडी, आधुनिक टूलकिट हेतु ₹15,000 ई-वाउचर, बुनियादी व उन्नत प्रशिक्षण (₹500 दैनिक वजीफा), और बिना गारंटी के 5% ब्याज पर ₹3 लाख तक का ऋण (₹1 लाख पहली किस्त, ₹2 लाख दूसरी किस्त) मिलता है।",
            "PM Vishwakarma honors and uplifts India's centuries-old traditional artisan heritage into modern value chains.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q10", "eco_10",
            "राष्ट्रीय खाद्य सुरक्षा अधिनियम (NFSA, 2013) के तहत देश के 81.35 करोड़ से अधिक निर्धन व वंचित नागरिकों को 5 किलोग्राम प्रति व्यक्ति प्रतिमाह पूरी तरह 'मुफ्त खाद्यान्न' प्रदान करने वाली फ्लैगशिप योजना कौन-सी है?",
            "Which monumental welfare initiative provides 5 kg of completely free food grains per person per month to over 81.35 crore eligible NFSA beneficiaries across India?",
            listOf("अन्नपूर्णा योजना", "प्रधानमंत्री गरीब कल्याण अन्न योजना (PMGKAY - Pradhan Mantri Garib Kalyan Anna Yojana / जनवरी 2024 से आगामी 5 वर्षों हेतु विस्तारित)", "लक्षित सार्वजनिक वितरण प्रणाली (TPDS)", "मिड-डे मील योजना"),
            listOf("Annapurna Scheme", "PMGKAY (Pradhan Mantri Garib Kalyan Anna Yojana - Launched during Covid in 2020 and institutionalized for 5 years from 2024 costing ₹11.8 Lakh Crore)", "Targeted Public Distribution System", "Mid-Day Meal Scheme"),
            1,
            "प्रधानमंत्री गरीब कल्याण अन्न योजना (PMGKAY) को कोविड काल (मार्च 2020) में शुरू किया गया था। 1 जनवरी 2024 से केंद्रीय मंत्रिमंडल ने इस योजना को अगले 5 वर्षों के लिए विस्तारित कर दिया है, जिसके तहत देश के 81.35 करोड़ से अधिक नागरिकों (अंत्योदय एवं प्राथमिक गृहस्थी राशन कार्डधारकों) को 5 किलो चावल/गेहूं पूरी तरह मुफ्त मिलता है।",
            "PMGKAY is universally acclaimed as one of the world's most extensive food security interventions protecting against hunger.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q11", "eco_10",
            "बाल लिंगानुपात में सुधार और बालिकाओं की शिक्षा व सशक्तिकरण को बढ़ावा देने हेतु 'बेटी बचाओ, बेटी पढ़ाओ' (BBBP) योजना 22 जनवरी 2015 को किस राज्य के पानीपत से शुरू की गई थी?",
            "In which State was the nationwide social campaign 'Beti Bachao, Beti Padhao' (BBBP) launched by Prime Minister Narendra Modi on 22 January 2015?",
            listOf("राजस्थान", "हरियाणा (Panipat, Haryana / Lowest Child Sex Ratio in Census 2011 / Joint initiative of MoWCD, MoHFW & MoE)", "पंजाब", "उत्तर प्रदेश"),
            listOf("Rajasthan", "Haryana (Launched from Panipat, Haryana due to critical Child Sex Ratio imbalances in northern districts)", "Punjab", "Uttar Pradesh"),
            1,
            "'बेटी बचाओ, बेटी पढ़ाओ' (BBBP) योजना 22 जनवरी 2015 को पानीपत (हरियाणा) से शुरू की गई थी। यह महिला एवं बाल विकास मंत्रालय, स्वास्थ्य एवं परिवार कल्याण मंत्रालय तथा शिक्षा मंत्रालय की संयुक्त पहल है, जिसका उद्देश्य गिरते बाल लिंगानुपात (CSR) को रोकना, कन्या भ्रूण हत्या समाप्त करना और बालिकाओं की उच्च शिक्षा सुनिश्चित करना है।",
            "BBBP generated mass social transformation and measurable improvements in Sex Ratio at Birth (SRB) across priority districts.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q12", "eco_10",
            "10 वर्ष से कम आयु की बालिकाओं के उच्च अध्ययन व विवाह हेतु माता-पिता द्वारा डाकघर या बैंकों में खोले जाने वाले सर्वाधिक ब्याज दर वाले विशेष बचत खाते का क्या नाम है?",
            "What is the high-interest small savings scheme launched in 2015 exclusively for girl children under 10 years of age, offering Section 80C tax exemption under EEE status?",
            listOf("बालिका समृद्धि योजना", "सुकन्या समृद्धि योजना (SSY - Sukanya Samriddhi Account / 22 जनवरी 2015 को BBBP के तहत शुरू / न्यूनतम ₹250 जमा)", "महिला सम्मान बचत प्रमाण पत्र", "इंदिरा विकास पत्र"),
            listOf("Balika Samridhi Yojana", "Sukanya Samriddhi Yojana (SSY - Small savings scheme opened for a girl child up to 10 years of age with 21-year maturity period)", "Mahila Samman Savings Certificate", "Indira Vikas Patra"),
            1,
            "सुकन्या समृद्धि योजना (SSY) 22 जनवरी 2015 को 'बेटी बचाओ, बेटी पढ़ाओ' के तहत शुरू की गई थी। इसमें न्यूनतम ₹250 और अधिकतम ₹1.5 लाख प्रति वर्ष जमा किए जा सकते हैं। बालिका के 18 वर्ष होने पर उच्च शिक्षा हेतु 50% निकासी तथा 21 वर्ष में पूर्ण परिपक्वता होती है। यह 'EEE' (Exempt-Exempt-Exempt) कर छूट प्राप्त योजना है।",
            "Sukanya Samriddhi Yojana provides an unmatched compounding wealth-builder for the financial future of daughters in India.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q13", "eco_10",
            "अनुसूचित जाति (SC), अनुसूचित जनजाति (ST) और महिला उद्यमियों को विनिर्माण, सेवा या व्यापार में नए ग्रीनफील्ड उद्यम स्थापित करने हेतु ₹10 लाख से ₹1 करोड़ तक का बैंक ऋण देने वाली योजना कौन-सी है?",
            "Which central scheme launched on 5 April 2016 mandates every commercial bank branch to facilitate bank loans between ₹10 Lakh and ₹1 Crore to at least one SC/ST and one Woman borrower?",
            listOf("स्टार्टअप इंडिया", "स्टैंड-अप इंडिया योजना (Stand-Up India Scheme - SIDBI / ₹10 Lakh to ₹1 Crore for Greenfield Enterprises)", "मेक इन इंडिया", "प्रधानमंत्री मुद्रा योजना"),
            listOf("Startup India", "Stand-Up India Scheme (Launched in April 2016 to promote entrepreneurship among SC, ST, and Women borrowers for Greenfield ventures)", "Make in India", "Pradhan Mantri MUDRA Yojana"),
            1,
            "स्टैंड-अप इंडिया (Stand-Up India) योजना 5 अप्रैल 2016 को शुरू की गई थी। इसके तहत प्रत्येक अनुसूचित वाणिज्यिक बैंक की प्रत्येक शाखा को कम से कम एक SC या ST उधारकर्ता और कम से कम एक महिला उद्यमी को ग्रीनफील्ड परियोजना स्थापित करने के लिए ₹10 लाख से ₹1 करोड़ के बीच समग्र ऋण (Term Loan + Working Capital) देना अनिवार्य किया गया है।",
            "Stand-Up India dismantled historical structural credit barriers for women and marginalized communities.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q14", "eco_10",
            "भारत को वैश्विक विनिर्माण महाशक्ति बनाने और 14 प्रमुख रणनीतिक क्षेत्रों (मोबाइल, ऑटो, फार्मा, ड्रोन आदि) में घरेलू उत्पादन को बढ़ावा देने हेतु शुरू की गई ₹1.97 लाख करोड़ की प्रोत्साहन योजना कौन-सी है?",
            "Which flagship incentive scheme offering 4% to 6% cash incentives on incremental domestic sales was rolled out across 14 key manufacturing sectors to create global champions?",
            listOf("मेक इन इंडिया 2.0", "उत्पादन से जुड़ी प्रोत्साहन योजना (PLI Scheme - Production Linked Incentive / 14 Sectors / ₹1.97 Lakh Crore Outlay)", "पीएम मित्र (PM MITRA) योजना", "राष्ट्रीय विनिर्माण नीति"),
            listOf("Make in India 2.0", "Production Linked Incentive (PLI Scheme - Transforming India into a global manufacturing export hub in mobile phones, electronics, pharmaceuticals, solar PV)", "PM MITRA Mega Textile Parks", "National Manufacturing Policy"),
            1,
            "पीएलआई (PLI - Production Linked Incentive) योजना 2020 में भारत में घरेलू विनिर्माण को बढ़ावा देने, आयात पर निर्भरता घटाने और वैश्विक निर्यात बढ़ाने के लिए शुरू की गई थी। इसके तहत 14 प्रमुख क्षेत्रों (मोबाइल फोन, फार्मा, मेडिकल डिवाइस, ऑटो, सोलर मॉड्यूल, टेक्सटाइल आदि) में आधार वर्ष से अधिक वृद्धिशील उत्पादन/बिक्री पर 4% से 6% का सीधा नकद प्रोत्साहन दिया जाता है।",
            "The PLI scheme catalysed massive private investments and catapulted India into the world's second-largest mobile phone manufacturer.",
            "Easy"
        ),
        makeEconomyQ(
            "eco_10_m1_q15", "eco_10",
            "ग्रामीण भारत में स्वयं सहायता समूहों (SHGs) की महिला सदस्यों को स्थायी आजीविका और कौशल विकास द्वारा प्रति वर्ष कम से कम ₹1,00,000 की शुद्ध आय अर्जित कराने हेतु शुरू की गई ऐतिहासिक सरकारी पहल कौन-सी है?",
            "Which major national empowerment initiative aims to enable rural Self-Help Group (SHG) women members to earn a sustainable annual household income of at least ₹1 Lakh?",
            listOf("उज्ज्वला दीदी", "लखपति दीदी पहल (Lakhpati Didi Initiative - DAY-NRLM / लक्ष्य: 3 करोड़ ग्रामीण महिलाओं को लखपति दीदी बनाना / ड्रोन दीदी, एलईडी बल्ब, सिलाई, डेयरी)", "नमो दीदी योजना", "महिला ई-हाट"),
            listOf("Ujjwala Didi", "Lakhpati Didi Initiative (Under Deendayal Antyodaya Yojana - National Rural Livelihoods Mission aiming to empower 3 Crore rural women to earn ≥₹1 Lakh/year)", "Namo Didi", "Mahila E-Haat"),
            1,
            "'लखपति दीदी पहल' (Lakhpati Didi Initiative) दीनदयाल अंत्योदय योजना-राष्ट्रीय ग्रामीण आजीविका मिशन (DAY-NRLM) के अंतर्गत शुरू की गई एक राष्ट्रीय पहल है। 15 अगस्त 2023 को घोषित इस पहल का लक्ष्य 3 करोड़ ग्रामीण स्वयं सहायता समूह (SHG) की दीदियों को माइक्रो-एंटरप्राइज, पशुपालन, कृषि मूल्य संवर्धन और 'नमो ड्रोन दीदी' (ड्रोन से कीटनाशक छिड़काव) के जरिए प्रति वर्ष कम से कम ₹1 लाख कमाने में सक्षम बनाना है।",
            "The Lakhpati Didi movement represents a tectonic socio-economic transition from subsistence SHGs to vibrant rural women-led micro-enterprises.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + EconomyQuestionHelper.generateTopicMocks("eco_10", 2, 5, baseQuestions)
    }
}
