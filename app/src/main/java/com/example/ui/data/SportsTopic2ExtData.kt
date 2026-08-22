package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic2ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_2_m6_q1", "spt_2",
            "भारतीय क्रिकेट कंट्रोल बोर्ड (BCCI - Board of Control for Cricket in India) की स्थापना दिसंबर 1928 में हुई थी। इसका मुख्यालय किस स्टेडियम में स्थित है?",
            "Where is the permanent headquarters of the Board of Control for Cricket in India (BCCI - established in December 1928) located?",
            listOf("ईडन गार्डन्स (कोलकाता)", "क्रिकेट सेंटर, वानखेड़े स्टेडियम, मुंबई (Cricket Centre, Wankhede Stadium, Mumbai)", "एम. ए. चिदंबरम स्टेडियम (चेन्नई)", "फिरोजशाह कोटला / अरुण जेटली स्टेडियम (दिल्ली)"),
            listOf("Eden Gardens (Kolkata)", "Cricket Centre, Wankhede Stadium, Mumbai, Maharashtra", "M. A. Chidambaram Stadium (Chennai)", "Arun Jaitley Stadium (Delhi)"),
            1,
            "BCCI की स्थापना दिसंबर 1928 में तमिलनाडु सोसायटी पंजीकरण अधिनियम के तहत हुई थी। इसके पहले अध्यक्ष आर. ई. ग्रांट गोवन थे। इसका मुख्यालय वानखेड़े स्टेडियम (मुंबई) में स्थित है।",
            "The Board of Control for Cricket in India (BCCI) is the national governing body for cricket in India, headquartered at the Wankhede Stadium in Mumbai.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q2", "spt_2",
            "2008 में शुरू हुई इंडियन प्रीमियर लीग (IPL - Indian Premier League) का पहला उद्घाटन सत्र (Inaugural Edition) किस टीम ने शेन वॉर्न की कप्तानी में जीता था?",
            "Which franchise won the inaugural season of the Indian Premier League (IPL 2008) under the inspirational captaincy of Australian leg-spinner Shane Warne?",
            listOf("चेन्नई सुपर किंग्स", "राजस्थान रॉयल्स (Rajasthan Royals - Defeated CSK in the 2008 Final at DY Patil)", "मुंबई इंडियंस", "कोलकाता नाइट राइडर्स"),
            listOf("Chennai Super Kings", "Rajasthan Royals (Led by Shane Warne; defeated CSK by 3 wickets on 1 June 2008)", "Mumbai Indians", "Kolkata Knight Riders"),
            1,
            "1 जून 2008 को डी. वाई. पाटिल स्टेडियम (नवी मुंबई) में राजस्थान रॉयल्स ने शेन वॉर्न के नेतृत्व में चेन्नई सुपर किंग्स को 3 विकेट से हराकर पहला आईपीएल खिताब जीता।",
            "Rajasthan Royals were the champions of the inaugural season of the IPL in 2008 under the leadership of Shane Warne.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q3", "spt_2",
            "इंडियन प्रीमियर लीग (IPL) के इतिहास में सर्वाधिक 5-5 बार खिताब जीतने वाली दो सबसे सफल टीमें कौन-सी हैं?",
            "Which two franchises are the joint most successful in Indian Premier League (IPL) history, having each won five championship titles?",
            listOf("केकेआर और आरसीबी", "मुंबई इंडियंस (Mumbai Indians - 5 Titles) और चेन्नई सुपर किंग्स (Chennai Super Kings - 5 Titles)", "राजस्थान रॉयल्स और दिल्ली कैपिटल्स", "सनराइजर्स हैदराबाद और गुजरात टाइटन्स"),
            listOf("KKR & RCB", "Mumbai Indians (2013, 2015, 2017, 2019, 2020) and Chennai Super Kings (2010, 2011, 2018, 2021, 2023)", "RR & DC", "SRH & GT"),
            1,
            "मुंबई इंडियंस (रोहित शर्मा की कप्तानी में 5 बार: 2013, 2015, 2017, 2019, 2020) और चेन्नई सुपर किंग्स (एमएस धोनी की कप्तानी में 5 बार: 2010, 2011, 2018, 2021, 2023) आईपीएल की सबसे सफल टीमें हैं।",
            "Mumbai Indians and Chennai Super Kings share the record for winning the most IPL trophies with five titles each.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q4", "spt_2",
            "भारत की प्रमुख घरेलू प्रथम श्रेणी क्रिकेट प्रतियोगिता 'रणजी ट्रॉफी' (Ranji Trophy) का पहला सत्र 1934-35 में खेला गया था। यह प्रतियोगिता किसके नाम पर रखी गई है?",
            "India's premier domestic first-class cricket tournament 'Ranji Trophy' (inaugurated in 1934) is named in honor of which legendary cricketer?",
            listOf("सी. के. नायडू", "के. एस. रणजीतसिंहजी / नवानगर के जाम साहेब (K. S. Ranjitsinhji - 'Ranji' / Maharaja of Nawanagar)", "दलीप सिंह जी", "पटियाला के महाराजा"),
            listOf("C. K. Nayudu", "Kumar Shri Ranjitsinhji (Played for England and Sussex; pioneered the 'leg glance' shot)", "Duleepsinhji", "Maharaja of Patiala"),
            1,
            "रणजी ट्रॉफी (1934) भारत के महान बल्लेबाज के.एस. रणजीतसिंहजी (जिन्होंने इंग्लैंड के लिए टेस्ट खेले) की स्मृति में शुरू हुई थी। मुंबई (बॉम्बे) ने सर्वाधिक 42 बार रणजी ट्रॉफी जीती है।",
            "The Ranji Trophy is named after Kumar Shri Ranjitsinhji, the first Indian cricketer who played international cricket for England.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q5", "spt_2",
            "टेस्ट क्रिकेट में भारत के पहले आधिकारिक कप्तान (First Captain of the Indian Test Cricket Team in 1932 at Lord's) कौन थे?",
            "Who was appointed the first-ever captain of the Indian cricket team for their inaugural Test match against England at Lord's in June 1932?",
            listOf("लाला अमरनाथ", "सी. के. नायडू / कोत्तारी कनकैया नायडू (C. K. Nayudu - Led India in 1932 Lord's Test)", "विजय मर्चेंट", "पटौदी के नवाब"),
            listOf("Lala Amarnath", "C. K. Nayudu (Cottari Kanakaiya Nayudu - Led India in its historic first Test match at Lord's in June 1932)", "Vijay Merchant", "Iftikhar Ali Khan Pataudi"),
            1,
            "25 जून 1932 को लॉर्ड्स में भारत के पहले टेस्ट मैच में कर्नल सी. के. नायडू ने भारतीय टीम की कप्तानी की थी। वे भारत के पहले महान ऑलराउंडर और आक्रामक बल्लेबाज थे।",
            "C. K. Nayudu was the first captain of the Indian cricket team in Test matches, leading them in India's debut Test match in 1932.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q6", "spt_2",
            "स्वतंत्र भारत के लिए पहला टेस्ट शतक (First Test Century for Independent India in 1947 vs Australia) लगाने वाले बल्लेबाज कौन थे जो स्वतंत्र भारत के पहले कप्तान भी बने?",
            "Who scored the first-ever Test century for independent India against Australia in 1947 and also captained India to its first-ever Test victory in 1952?",
            listOf("सी. के. नायडू", "लाला अमरनाथ / नानक अमरनाथ भारद्वाज (Lala Amarnath - First Century for India in 1933 & 1st for Independent India in 1947)", "पॉली उमरीगर", "विनू मांकड़"),
            listOf("C. K. Nayudu", "Lala Amarnath (Scored 118 on debut in 1933; captained India to its first Test series win vs Pakistan in 1952)", "Polly Umrigar", "Vinoo Mankad"),
            1,
            "लाला अमरनाथ ने 1933 में भारत की धरती पर पहला टेस्ट शतक (118 रन) बनाया। 1952 में उनकी कप्तानी में भारत ने पाकिस्तान के खिलाफ अपनी पहली ऐतिहासिक टेस्ट श्रृंखला जीती।",
            "Lala Amarnath was an Indian cricketer who scored independent India's first test century and was the first captain to win a Test match for India.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q7", "spt_2",
            "टेस्ट क्रिकेट के इतिहास में 52 टेस्ट मैचों में 99.94 का अविश्वसनीय बल्लेबाजी औसत (Highest Career Batting Average) रखने वाले ऑस्ट्रेलिया के महानतम बल्लेबाज कौन हैं?",
            "Which legendary Australian cricketer holds the immortal world record for the highest career batting average in Test cricket history (99.94 across 52 Tests)?",
            listOf("स्टीव वॉ", "सर डोनाल्ड ब्रैडमैन / 'द डॉन' (Sir Donald Bradman - Batting Average 99.94 / 29 Test Centuries in 80 Innings)", "ग्रेग चैपल", "एलन बॉर्डर"),
            listOf("Steve Waugh", "Sir Donald Bradman (Nicknamed 'The Don'; scored 6,996 runs in 52 Tests; missed 100 average by 4 runs in final duck)", "Greg Chappell", "Allan Border"),
            1,
            "सर डॉन ब्रैडमैन (1908-2001) का टेस्ट करियर बल्लेबाजी औसत 99.94 था। वे अपने अंतिम टेस्ट मैच (1948, ओवल) में शून्य पर आउट हो गए, अन्यथा उनका औसत पूरे 100.00 होता।",
            "Sir Donald Bradman's career Test batting average of 99.94 is widely cited as the greatest achievement by any sportsman in any major sport.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q8", "spt_2",
            "टेस्ट क्रिकेट में तिहरा शतक (Triple Century - 300+ रन) लगाने वाले पहले भारतीय बल्लेबाज कौन थे जिन्होंने 2004 में मुल्तान में पाकिस्तान के खिलाफ 309 रन बनाए थे?",
            "Who was the first Indian batsman to score a triple century in Test cricket, scoring 309 runs against Pakistan in Multan in March 2004?",
            listOf("सचिन तेंदुलकर", "वीरेंद्र सहवाग (Virender Sehwag - 'Multan ka Sultan' / 309 vs PAK & 319 vs SA)", "राहुल द्रविड़", "वीवीएस लक्ष्मण"),
            listOf("Sachin Tendulkar", "Virender Sehwag (Only Indian with two Test triple centuries: 309 at Multan and 319 at Chennai)", "Rahul Dravid", "VVS Laxman"),
            1,
            "29 मार्च 2004 को वीरेंद्र सहवाग ने मुल्तान में 309 रन बनाकर 'मुल्तान का सुल्तान' का खिताब पाया। बाद में उन्होंने 2008 में चेन्नई में दक्षिण अफ्रीका के खिलाफ 319 रन बनाए। (करुण नायर 2016 में तिहरा शतक लगाने वाले दूसरे भारतीय बने)।",
            "Virender Sehwag holds the record for the highest individual score by an Indian in Tests (319) and is the only Indian with two Test triple tons.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q9", "spt_2",
            "टेस्ट क्रिकेट में ब्रायन लारा (वेस्टइंडीज) द्वारा 2004 में इंग्लैंड के खिलाफ एंटीगुआ में बनाया गया सर्वोच्च व्यक्तिगत स्कोर (Highest Individual Score in Test Cricket) कितना है?",
            "What is the world record for the highest individual score in a single Test innings, scored by West Indian legend Brian Lara against England in Antigua in 2004?",
            listOf("375 रन", "400 नॉट आउट (400 Not Out - Brian Lara vs England, St. John's, Antigua, April 2004)", "380 रन", "450 रन"),
            listOf("375 runs (Lara's previous record in 1994)", "400 Not Out (Brian Lara batted 778 minutes off 582 balls in April 2004)", "380 runs (Matthew Hayden)", "450 runs"),
            1,
            "ब्रायन लारा ने 10-12 अप्रैल 2004 को सेंट जॉन्स (एंटीगुआ) में इंग्लैंड के खिलाफ नाबाद 400 रन बनाकर टेस्ट क्रिकेट का सर्वोच्च व्यक्तिगत स्कोर बनाया। प्रथम श्रेणी क्रिकेट में भी 501* रनों का रिकॉर्ड लारा के नाम है।",
            "Brian Lara's 400 not out against England in 2004 remains the highest individual score in Test cricket history.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q10", "spt_2",
            "आईसीसी विश्व टेस्ट चैंपियनशिप (ICC World Test Championship) का पहला उद्घाटन फाइनल (2019-2021) किस देश ने साउथम्पटन में भारत को हराकर जीता था?",
            "Which team won the inaugural ICC World Test Championship (2019-21) by defeating India in the final at Southampton in June 2021?",
            listOf("ऑस्ट्रेलिया", "न्यूजीलैंड (New Zealand - Captain: Kane Williamson / Defeated India by 8 wickets)", "इंग्लैंड", "दक्षिण अफ्रीका"),
            listOf("Australia", "New Zealand (Led by Kane Williamson, won the inaugural WTC mace at the Rose Bowl, Southampton)", "England", "South Africa"),
            1,
            "न्यूजीलैंड ने जून 2021 में साउथम्पटन में भारत को 8 विकेट से हराकर पहला आईसीसी विश्व टेस्ट चैंपियनशिप खिताब जीता। (2021-23 का दूसरा संस्करण ऑस्ट्रेलिया ने भारत को ओवल में हराकर जीता)।",
            "New Zealand won the inaugural 2019-2021 ICC World Test Championship, defeating India in the final.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q11", "spt_2",
            "इंग्लैंड और ऑस्ट्रेलिया के बीच खेली जाने वाली ऐतिहासिक और सबसे पुरानी टेस्ट क्रिकेट श्रृंखला को क्या कहा जाता है?",
            "What is the historic biennial Test cricket series played between England and Australia called, contested for a tiny terracotta urn?",
            listOf("बॉर्डर-गावस्कर ट्रॉफी", "द एशेज (The Ashes - Contested since 1882 following England's defeat at the Oval)", "विजडन ट्रॉफी", "चैपल-हैडली ट्रॉफी"),
            listOf("Border-Gavaskar Trophy", "The Ashes (Symbolized by an urn containing ashes of a cricket ball/bail after Sporting Times 1882 obituary)", "Wisden Trophy", "Chappell-Hadlee Trophy"),
            1,
            "'द एशेज' (The Ashes) 1882 से इंग्लैंड और ऑस्ट्रेलिया के बीच खेली जाने वाली द्विपक्षीय टेस्ट श्रृंखला है। 1882 में ओवल में ऑस्ट्रेलिया से इंग्लैंड की हार के बाद 'स्पोर्टिंग टाइम्स' ने लिखा था कि 'अंग्रेजी क्रिकेट मर गया और उसके शव की राख (Ashes) ऑस्ट्रेलिया ले जाई गई'।",
            "The Ashes is a Test cricket series played between England and Australia, regarded as one of sports' greatest and oldest rivalries.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q12", "spt_2",
            "भारत और ऑस्ट्रेलिया के बीच खेली जाने वाली प्रतिष्ठित द्विपक्षीय टेस्ट क्रिकेट श्रृंखला को किस नाम से जाना जाता है?",
            "What is the prestigious bilateral Test cricket series contested between India and Australia named in honor of their greatest run-scorers?",
            listOf("एशेज ट्रॉफी", "बॉर्डर-गावस्कर ट्रॉफी (Border-Gavaskar Trophy - Named after Allan Border and Sunil Gavaskar)", "पटौदी ट्रॉफी", "एंथनी डी मेलो ट्रॉफी"),
            listOf("The Ashes", "Border-Gavaskar Trophy (Instituted in 1996 honoring Allan Border and Sunil Gavaskar, first two batsmen to 10,000 Test runs)", "Pataudi Trophy (India-England in England)", "Anthony de Mello Trophy (India-England in India)"),
            1,
            "बॉर्डर-गावस्कर ट्रॉफी (1996 में शुरू) टेस्ट क्रिकेट में 10,000 रन पूरे करने वाले विश्व के पहले दो बल्लेबाजों - सुनील गावस्कर (भारत) और एलन बॉर्डर (ऑस्ट्रेलिया) के सम्मान में खेली जाती है।",
            "The Border-Gavaskar Trophy is a Test cricket series played between India and Australia, celebrating their legendary batsmen.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q13", "spt_2",
            "महिला प्रीमियर लीग (WPL - Women's Premier League) का पहला उद्घाटन सत्र मार्च 2023 में किस टीम ने हरमनप्रीत कौर की कप्तानी में जीता था?",
            "Which franchise won the inaugural edition of the Women's Premier League (WPL 2023) under the captaincy of Harmanpreet Kaur?",
            listOf("दिल्ली कैपिटल्स", "मुंबई इंडियंस (Mumbai Indians - Defeated Delhi Capitals at Brabourne Stadium, Mumbai)", "रॉयल चैलेंजर्स बैंगलोर", "यूपी वॉरियर्स"),
            listOf("Delhi Capitals", "Mumbai Indians (Captain Harmanpreet Kaur; won by 7 wickets in Mumbai on 26 March 2023)", "Royal Challengers Bangalore (Won 2024)", "UP Warriorz"),
            1,
            "26 मार्च 2023 को ब्रेबॉर्न स्टेडियम (मुंबई) में हरमनप्रीत कौर की मुंबई इंडियंस ने दिल्ली कैपिटल्स को 7 विकेट से हराकर पहला विमेंस प्रीमियर लीग (WPL) खिताब जीता। (2024 में स्मृति मंधाना की RCB ने जीता)।",
            "Mumbai Indians became the inaugural champions of the Women's Premier League in 2023, defeating Delhi Capitals in the final.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q14", "spt_2",
            "आईसीसी की तीनों प्रमुख सफेद गेंद ट्रॉफियां (T20 विश्व कप 2007, वनडे विश्व कप 2011, और चैंपियंस ट्रॉफी 2013) जीतने वाले विश्व के एकमात्र कप्तान कौन हैं?",
            "Who is the only captain in cricket history to win all three major ICC limited-overs white-ball trophies (T20 World Cup, ODI World Cup, and Champions Trophy)?",
            listOf("रिकी पोंटिंग", "महेंद्र सिंह धोनी / एम. एस. धोनी (MS Dhoni - 2007 T20 WC, 2011 ODI WC, 2013 Champions Trophy)", "इमरान खान", "इयोन मोर्गन"),
            listOf("Ricky Ponting", "MS Dhoni (2007 ICC World Twenty20, 2011 ICC Cricket World Cup, 2013 ICC Champions Trophy)", "Imran Khan", "Eoin Morgan"),
            1,
            "एमएस धोनी दुनिया के एकमात्र कप्तान हैं जिन्होंने तीनों प्रमुख आईसीसी लिमिटेड ओवर टूर्नामेंट (2007 टी20 विश्व कप, 2011 वनडे विश्व कप, 2013 चैंपियंस ट्रॉफी) जीते हैं और टेस्ट में भारत को नंबर 1 रैंकिंग तक पहुंचाया।",
            "MS Dhoni is the only captain in cricket history to have lifted all three ICC limited-overs tournament trophies.",
            "Easy"
        ),
        makeSportsQ(
            "spt_2_m6_q15", "spt_2",
            "अंतर्राष्ट्रीय क्रिकेट में 'मांकडिंग' (Mankading) शब्द किस महान भारतीय ऑलराउंडर के नाम पर पड़ा जिन्होंने 1947 में नॉन-स्ट्राइकर छोर पर क्रीज छोड़ने वाले बिल ब्राउन को रन आउट किया था?",
            "The cricketing term 'Mankading' (running out a non-striker backing up too far before the ball is bowled) originated from which Indian all-rounder in 1947?",
            listOf("लाला अमरनाथ", "वीनू मांकड़ / मुलवंतराय हिम्मतलाल मांकड़ (Vinoo Mankad - 1947 Sydney Test vs Australia)", "कपिल देव", "सैयद किरमानी"),
            listOf("Lala Amarnath", "Vinoo Mankad (Legally ran out Australian batsman Bill Brown at non-striker's end in Sydney in December 1947)", "Kapil Dev", "Syed Kirmani"),
            1,
            "13 दिसंबर 1947 को सिडनी टेस्ट में वीनू मांकड़ ने ऑस्ट्रेलिया के बिल ब्राउन को गेंद फेंकने से पहले क्रीज छोड़ने पर रन आउट किया था। एमसीसी (MCC) ने अब इस नियम को पूरी तरह वैध 'रन आउट' घोषित किया है।",
            "Vinoo Mankad was a legendary Indian cricketer whose legal run-out of Bill Brown in 1947 led to the colloquial phrase 'Mankading'.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_2", 7, 10, baseQuestions)
    }
}
