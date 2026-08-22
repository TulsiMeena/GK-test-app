package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic3Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_3_m1_q1", "spt_3",
            "अंतर्राष्ट्रीय फुटबॉल महासंघ (FIFA - Fédération Internationale de Football Association) का मुख्यालय किस शहर में स्थित है (स्थापना 1904, पेरिस)?",
            "Where is the global headquarters of FIFA (Fédération Internationale de Football Association - established 1904 in Paris) located?",
            listOf("पेरिस (फ्रांस)", "ज्यूरिख, स्विट्जरलैंड (Zurich, Switzerland - Home of FIFA)", "जिनेवा (स्विट्जरलैंड)", "लंदन (यूके)"),
            listOf("Paris, France", "Zurich, Switzerland (Home of FIFA complex since 1932)", "Geneva, Switzerland", "London, UK"),
            1,
            "फीफा (FIFA) की स्थापना 21 मई 1904 को पेरिस (फ्रांस) में हुई थी। 1932 से इसका मुख्यालय ज्यूरिख (स्विट्जरलैंड) में स्थित है। इसके पहले अध्यक्ष रॉबर्ट गुएरिन थे।",
            "FIFA is the international governing body of association football, headquartered in Zurich, Switzerland.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q2", "spt_3",
            "इतिहास का पहला फीफा पुरुष फुटबॉल विश्व कप (First FIFA World Cup 1930) किस देश में आयोजित हुआ था और किस देश ने इसे जीता था?",
            "Which country hosted and won the inaugural FIFA Men's World Cup in July 1930, defeating Argentina 4-2 in the final at Estadio Centenario?",
            listOf("ब्राजील", "उरुग्वे (Uruguay - Host and Champions in Montevideo, 1930)", "इटली", "अर्जेंटीना"),
            listOf("Brazil", "Uruguay (Defeated Argentina 4-2 in the final at Montevideo on 30 July 1930)", "Italy", "Argentina"),
            1,
            "पहला फीफा विश्व कप 1930 में उरुग्वे की राजधानी मोंटेवीडियो में आयोजित हुआ। उरुग्वे ने अर्जेंटीना को 4-2 से हराकर पहली 'जूल्स रिमेट ट्रॉफी' जीती।",
            "The 1930 FIFA World Cup was the inaugural tournament, hosted and won by Uruguay at the newly built Estadio Centenario in Montevideo.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q3", "spt_3",
            "फीफा पुरुष विश्व कप के इतिहास में सर्वाधिक 5 बार (1958, 1962, 1970, 1994, 2002) खिताब जीतने वाला दुनिया का सबसे सफल देश कौन-सा है?",
            "Which national football team has won the FIFA World Cup a record five times (1958, 1962, 1970, 1994, 2002), known as the 'Seleção'?",
            listOf("जर्मनी (4 बार)", "ब्राजील (Brazil - 5 World Cup Titles / 'Pentacampeões')", "इटली (4 बार)", "अर्जेंटीना (3 बार)"),
            listOf("Germany (4 titles)", "Brazil (5-time champions; only nation to play in every single World Cup tournament)", "Italy (4 titles)", "Argentina (3 titles)"),
            1,
            "ब्राजील ने रिकॉर्ड 5 बार (1958, 1962, 1970, 1994, 2002) फीफा विश्व कप जीता है। जर्मनी और इटली ने 4-4 बार तथा अर्जेंटीना ने 3 बार (1978, 1986, 2022) विश्व कप जीता है।",
            "Brazil is the most successful national team in the FIFA World Cup, having been crowned champion five times.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q4", "spt_3",
            "तीन फीफा विश्व कप (1958, 1962, 1970) जीतने वाले इतिहास के एकमात्र फुटबॉल खिलाड़ी कौन हैं जिन्हें 'ओ रेई' (The King of Football) कहा जाता है?",
            "Who is the only football player in history to win three FIFA World Cup tournaments (1958, 1962, 1970), celebrated globally as 'The King of Football'?",
            listOf("डिएगो माराडोना", "पेले / एडसन अरांतेस डो नैसिमेंटो (Pelé, Brazil - 3 World Cup Titles & ~1281 Goals)", "लियोनेल मेसी", "क्रिस्टियानो रोनाल्डो"),
            listOf("Diego Maradona", "Pelé (Edson Arantes do Nascimento, Brazil - Won World Cups in 1958, 1962, and 1970)", "Lionel Messi", "Cristiano Ronaldo"),
            1,
            "महान ब्राजीलियाई फुटबॉलर पेले (1940-2022) 17 वर्ष की उम्र में 1958 में विश्व कप जीतने वाले सबसे युवा खिलाड़ी बने और 3 विश्व कप (1958, 1962, 1970) जीतने वाले एकमात्र खिलाड़ी हैं।",
            "Pelé was a Brazilian professional footballer who is widely regarded as one of the greatest players of all time.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q5", "spt_3",
            "1986 फीफा विश्व कप में अर्जेंटीना को चैंपियन बनाने वाले किस महान फुटबॉलर ने इंग्लैंड के खिलाफ प्रसिद्ध 'हैंड ऑफ गॉड' (Hand of God) और 'गोल ऑफ द सेंचुरी' किया था?",
            "Which Argentine football legend captained his country to the 1986 World Cup title in Mexico, scoring both the infamous 'Hand of God' goal and the 'Goal of the Century' against England?",
            listOf("लियोनेल मेसी", "डिएगो माराडोना (Diego Maradona, Argentina - 1986 World Cup Champion / Golden Ball)", "गेब्रियल बतिस्तुता", "मारियो केम्प्स"),
            listOf("Lionel Messi", "Diego Maradona (Captained Argentina to 1986 triumph; scored two iconic goals against England in the quarter-final)", "Gabriel Batistuta", "Mario Kempes"),
            1,
            "22 जून 1986 को मैक्सिको के एज़्टेका स्टेडियम में डिएगो माराडोना ने इंग्लैंड के खिलाफ 2-1 की जीत में हाथ से गोल किया ('हैंड ऑफ गॉड') और 6 अंग्रेजी खिलाड़ियों को ड्रिबल कर 'सदी का सर्वश्रेष्ठ गोल' दागा।",
            "Diego Maradona was an Argentine professional football player and manager, revered as one of the greatest sports icons of the 20th century.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q6", "spt_3",
            "2022 के फीफा पुरुष विश्व कप (FIFA World Cup 2022 Qatar) का खिताब लियोनेल मेसी की कप्तानी में अर्जेंटीना ने किस देश को पेनल्टी शूटआउट (4-2) में हराकर जीता?",
            "Under Lionel Messi's captaincy, Argentina won the FIFA World Cup 2022 at Lusail Stadium in Qatar by defeating which defending champion team on penalties?",
            listOf("क्रोएशिया", "फ्रांस (France - Argentina won 4-2 on penalties after 3-3 draw; Mbappé scored final hat-trick)", "मोरक्को", "ब्राजील"),
            listOf("Croatia (3rd place)", "France (Argentina won thrilling final 3-3 [4-2 pens]; Messi Golden Ball, Mbappé Golden Boot)", "Morocco (4th place)", "Brazil"),
            1,
            "18 दिसंबर 2022 को कतर के लुसैल स्टेडियम में अर्जेंटीना ने फ्रांस को पेनल्टी शूटआउट में 4-2 से हराकर 36 साल बाद अपना तीसरा विश्व कप जीता। लियोनेल मेसी को 'गोल्डन बॉल' (टूर्नामेंट का सर्वश्रेष्ठ खिलाड़ी) मिला।",
            "The 2022 FIFA World Cup final in Qatar saw Argentina lift the trophy after a dramatic 3-3 draw with France, won on penalty kicks.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q7", "spt_3",
            "फीफा विश्व कप के इतिहास में सर्वाधिक व्यक्तिगत गोल (16 गोल) करने का विश्व रिकॉर्ड किस जर्मन स्ट्राइकर के नाम है?",
            "Which German striker holds the all-time record for the most goals scored in FIFA World Cup history (16 goals across 4 tournaments: 2002-2014)?",
            listOf("रोनाल्डो नाजारियो (15 गोल)", "मिरोस्लाव क्लोस (Miroslav Klose, Germany - 16 World Cup Goals)", "गर्ड मुलर (14 गोल)", "काइलियन एम्बाप्पे (12 गोल)"),
            listOf("Ronaldo Nazário (15 goals)", "Miroslav Klose (Scored 16 goals across 2002, 2006, 2010, and 2014 tournaments)", "Gerd Müller (14 goals)", "Kylian Mbappé (12 goals)"),
            1,
            "मिरोस्लाव क्लोस (जर्मनी) ने 4 विश्व कप (2002-2014) के 24 मैचों में 16 गोल दागकर ब्राजील के रोनाल्डो (15 गोल) का रिकॉर्ड तोड़ा। 2014 में वे जर्मनी के साथ विश्व चैंपियन भी बने।",
            "Miroslav Klose is the all-time top goalscorer in FIFA World Cup history with 16 goals.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q8", "spt_3",
            "फुटबॉल का सबसे प्रतिष्ठित व्यक्तिगत पुरस्कार 'बैलन डी'ओर' (Ballon d'Or - फ्रांस फुटबॉल पत्रिका द्वारा प्रदत्त) रिकॉर्ड 8 बार (Record 8 Titles) किसने जीता है?",
            "Who has won the prestigious Ballon d'Or award a record 8 times (2009, 2010, 2011, 2012, 2015, 2019, 2021, 2023)?",
            listOf("क्रिस्टियानो रोनाल्डो (5 बार)", "लियोनेल मेसी (Lionel Messi, Argentina - Record 8 Ballon d'Or Awards)", "जोहान क्रूफ (3 बार)", "मिशेल प्लाटिनी (3 बार)"),
            listOf("Cristiano Ronaldo (5 awards)", "Lionel Messi (Won record 8 Ballon d'Or awards across three decades)", "Johan Cruyff (3 awards)", "Michel Platini (3 awards)"),
            1,
            "लियोनेल मेसी (अर्जेंटीना/बार्सिलोना/इंटर मियामी) ने रिकॉर्ड 8 बार (2009, 2010, 2011, 2012, 2015, 2019, 2021, 2023) बैलन डी'ओर जीता है। क्रिस्टियानो रोनाल्डो ने 5 बार यह पुरस्कार जीता है।",
            "Lionel Messi holds the record for winning the most Ballon d'Or awards in history with eight trophies.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q9", "spt_3",
            "अंतर्राष्ट्रीय फुटबॉल में सर्वाधिक अंतरराष्ट्रीय गोल (130+ International Goals) करने का सर्वकालिक विश्व रिकॉर्ड किस पुर्तगाली फॉरवर्ड के नाम है?",
            "Which Portuguese football forward holds the all-time world record for the most international goals scored in Men's international football (>130 goals)?",
            listOf("अली देई (ईरान - 109 गोल)", "क्रिस्टियानो रोनाल्डो (Cristiano Ronaldo, Portugal - 130+ International Goals in 200+ Caps)", "लियोनेल मेसी", "सुनील छेत्री"),
            listOf("Ali Daei (Iran - 109 goals)", "Cristiano Ronaldo (CR7 - Scored over 130 international goals for Portugal; 5 Champions League titles)", "Lionel Messi", "Sunil Chhetri"),
            1,
            "क्रिस्टियानो रोनाल्डो (पुर्तगाल) 200 से अधिक अंतरराष्ट्रीय मैचों में 130 से अधिक गोल दागकर पुरुष अंतरराष्ट्रीय फुटबॉल इतिहास के शीर्ष गोलस्कोरर हैं। उन्होंने 2016 में पुर्तगाल को यूरो कप जिताया था।",
            "Cristiano Ronaldo holds the international records for most caps and most goals scored in men's international football history.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q10", "spt_3",
            "अंतर्राष्ट्रीय फुटबॉल में भारत के लिए सर्वाधिक 94 गोल (94 International Goals in 151 Caps) करने वाले और दुनिया के चौथे सबसे बड़े अंतरराष्ट्रीय गोलस्कोरर कौन हैं?",
            "Who is India's all-time leading goalscorer and most-capped international player, scoring 94 goals in 151 matches before retiring in June 2024?",
            listOf("बाईचुंग भूटिया", "सुनील छेत्री (Sunil Chhetri - 'Captain Fantastic' / 94 International Goals / Khel Ratna)", "आई. एम. विजयन", "पी. के. बनर्जी"),
            listOf("Baichung Bhutia", "Sunil Chhetri (Led India to multiple SAFF Championships, Nehru Cups, and Asian Cup qualifications)", "I. M. Vijayan", "P. K. Banerjee"),
            1,
            "सुनील छेत्री (151 मैच, 94 गोल) भारतीय फुटबॉल के महानतम कप्तान हैं। वे सक्रिय अंतरराष्ट्रीय खिलाड़ियों में रोनाल्डो और मेसी के बाद सबसे ज्यादा अंतरराष्ट्रीय गोल करने वाले खिलाड़ी रहे। उन्हें 2021 में खेल रत्न मिला।",
            "Sunil Chhetri is widely considered one of the greatest Indian footballers of all time, captaining the Indian national team for over a decade.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q11", "spt_3",
            "भारत और एशिया का सबसे पुराना तथा विश्व का तीसरा सबसे पुराना फुटबॉल टूर्नामेंट कौन-सा है जो 1888 में शिमला में शुरू हुआ था?",
            "Which is the oldest football tournament in Asia and third-oldest in the world, founded in 1888 in Shimla by Sir Henry Mortimer Durand?",
            listOf("संतोष ट्रॉफी", "डूरंड कप (Durand Cup - Asia's Oldest Football Tournament, Founded 1888)", "आईएफए शील्ड", "रोवर्स कप"),
            listOf("Santosh Trophy (National Championship since 1941)", "Durand Cup (Inaugurated in Shimla in 1888; organized by the Indian Armed Forces)", "IFA Shield (1893)", "Rovers Cup (1890)"),
            1,
            "डूरंड कप (1888) एशिया का सबसे पुराना फुटबॉल कप है जिसे ब्रिटिश भारत के विदेश सचिव सर मोर्टिमर डूरंड ने शिमला में शुरू किया था। मोहन बागान और ईस्ट बंगाल ने इसे रिकॉर्ड 16-16 बार जीता है।",
            "The Durand Football Tournament, commonly known as the Durand Cup, is the oldest existing club football tournament in Asia.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q12", "spt_3",
            "भारत की राष्ट्रीय राज्य-स्तरीय पुरुष फुटबॉल चैम्पियनशिप 'संतोष ट्रॉफी' (Santosh Trophy) की शुरुआत किस वर्ष हुई थी?",
            "In which year was the Senior National Football Championship for the 'Santosh Trophy' instituted by the Indian Football Association (IFA)?",
            listOf("1930", "1941 (Santosh Trophy - Named after Maharaja Sir Manmatha Nath Roy Chowdhury of Santosh)", "1950", "1962"),
            listOf("1930", "1941 (First edition won by Bengal defeating Delhi; West Bengal holds record 32 titles)", "1950", "1962"),
            1,
            "संतोष ट्रॉफी (1941) भारतीय राज्यों और सरकारी संस्थानों के बीच खेली जाने वाली मुख्य राष्ट्रीय फुटबॉल चैम्पियनशिप है। इसका नाम संतोष (अब बांग्लादेश) के महाराजा मन्मथ नाथ राय चौधरी के नाम पर रखा गया है। पश्चिम बंगाल ने इसे रिकॉर्ड 32 बार जीता है।",
            "The Santosh Trophy is a premier inter-state national football competition in India, organized annually by the AIFF.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q13", "spt_3",
            "29 जुलाई 1911 को किस भारतीय फुटबॉल क्लब ने ब्रिटिश सेना की 'ईस्ट यॉर्कशायर रेजिमेंट' को 2-1 से हराकर नंगे पैर ऐतिहासिक 'आईएफए शील्ड' (IFA Shield) जीती थी?",
            "Which historic Indian club defeated the British East Yorkshire Regiment 2-1 on 29 July 1911 to become the first all-Indian team to win the prestigious IFA Shield?",
            listOf("ईस्ट बंगाल एफसी", "मोहन बागान एसी (Mohan Bagan AC - Barefoot Historic Victory on 29 July 1911 / Mohun Bagan Day)", "मोहम्मडन एससी", "डेम्पो एससी"),
            listOf("East Bengal FC", "Mohun Bagan AC (Captained by Shibdas Bhaduri; celebrated annually on 29 July as Mohun Bagan Day)", "Mohammedan SC", "Dempo SC"),
            1,
            "29 जुलाई 1911 को मोहन बागान ने ब्रिटिश रेजिमेंट को नंगे पैर हराकर राष्ट्रवाद की अलख जगाई थी। 29 जुलाई को प्रतिवर्ष 'मोहन बागान दिवस' मनाया जाता है। मोहन बागान (स्थापना 1889) भारत का 'राष्ट्रीय क्लब' माना जाता है।",
            "Mohun Bagan's 1911 IFA Shield triumph is celebrated as a landmark victory of Indian nationalist pride against British colonial dominance.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q14", "spt_3",
            "अखिल भारतीय फुटबॉल महासंघ (AIFF - All India Football Federation) की स्थापना 1937 में शिमला में हुई थी। इसका मुख्यालय कहाँ स्थित है?",
            "Where is the headquarters of the All India Football Federation (AIFF - apex governing body of football in India, founded 1937) located?",
            listOf("कोलकाता", "फुटबॉल हाउस, द्वारका, नई दिल्ली (Football House, Dwarka, New Delhi)", "मुंबई", "बेंगलुरु"),
            listOf("Kolkata", "Football House, Dwarka, New Delhi (AIFF Headquarters)", "Mumbai", "Bengaluru"),
            1,
            "AIFF की स्थापना 23 जून 1937 को शिमला के आर्मी हेडक्वार्टर में हुई थी। 1948 में इसे फीफा की संबद्धता मिली। इसका मुख्यालय 'फुटबॉल हाउस', द्वारका (नई दिल्ली) में स्थित है।",
            "The All India Football Federation (AIFF) is the governing body of association football in India, headquartered in New Delhi.",
            "Easy"
        ),
        makeSportsQ(
            "spt_3_m1_q15", "spt_3",
            "2026 का 23वां फीफा पुरुष फुटबॉल विश्व कप (FIFA World Cup 2026) पहली बार 48 टीमों के साथ किन 3 देशों द्वारा संयुक्त रूप से आयोजित किया जाएगा?",
            "The 2026 FIFA World Cup will feature an expanded format of 48 national teams, jointly hosted across which three North American countries?",
            listOf("अर्जेंटीना, चिली और उरुग्वे", "संयुक्त राज्य अमेरिका, कनाडा और मैक्सिको (United States, Canada, and Mexico / United 2026)", "स्पेन, पुर्तगाल और मोरक्को", "ब्राजील, अर्जेंटीना और कोलंबिया"),
            listOf("Argentina, Chile & Uruguay", "United States, Canada, and Mexico (16 host cities; final at MetLife Stadium, New Jersey)", "Spain, Portugal & Morocco (Hosts for 2030)", "Brazil, Argentina & Colombia"),
            1,
            "2026 फीफा विश्व कप 11 जून से 19 जुलाई 2026 तक अमेरिका, कनाडा और मैक्सिको के 16 शहरों में खेला जाएगा। यह 3 देशों द्वारा आयोजित पहला और 48 टीमों का पहला विश्व कप होगा।",
            "The 2026 FIFA World Cup will be the first edition jointly hosted by three nations: Canada, Mexico, and the United States.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_3", 2, 5, baseQuestions)
    }
}
