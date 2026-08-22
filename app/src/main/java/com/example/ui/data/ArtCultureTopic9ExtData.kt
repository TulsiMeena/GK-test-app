package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic9ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions) - शास्त्रीय संगीत घराने, संगीत नाटक अकादमी, लोक वाद्य एवं वाद्यवृंद
        // ==========================================
        makeArtCultureQ(
            "art_9_m6_q1", "art_9",
            "शास्त्रीय संगीत में 'रसराज' की उपाधि से विभूषित और 'जसरंगी' (Jasrangi - स्त्री और पुरुष स्वरों की अनूठी जुगलबंदी) शैली के प्रवर्तक पंडित जसराज (Pandit Jasraj) किस घराने के शिखर पुरुष थे?",
            "Which illustrious vocalist, adorned with the title 'Sangeet Martand' and creator of the unique dual-scale polyphonic duet 'Jasrangi', was the doyen of the Mewati Gharana?",
            listOf("किराना घराना", "मेवाती घराना (Mewati Gharana - Founded by Ustad Ghagge Nazir Khan / Haveli Sangeet influence / Pandit Jasraj, Sanjeev Abhyankar)", "ग्वालियर घराना", "आगरा घराना"),
            listOf("Kirana Gharana", "Mewati Gharana (Rooted in Mewat region, Rajasthan; known for devotional bhakti lyrics, rich Meend ornamentation, and Jasrangi innovation)", "Gwalior Gharana", "Agra Gharana"),
            1,
            "पंडित जसराज (1930-2020, हरियाणा) मेवाती घराने के सबसे प्रख्यात गायक थे। उन्होंने हवेली संगीत और भक्ति रस को ख्याल गायकी में समाहित किया। उन्होंने 'जसरंगी' जुगलबंदी प्रणाली बनाई, जिसमें एक महिला और एक पुरुष गायक एक ही समय में 'मूर्च्छना' पद्धति से अलग-अलग सुरों में दो अलग राग गाते हैं। नासा ने 2019 में एक क्षुद्रग्रह (Asteroid 300128) का नाम 'पंडितजसराज' रखा।",
            "Mewati Gharana synthesizes deep spiritual contemplation with luminous vocal ornaments across ancient dhrupadic and khayal paradigms.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q2", "art_9",
            "'गान सरस्वती' की उपाधि से सम्मानित और जटिल रागों (जैसे भूपाल तोड़ी, संपूर्ण मालकौंस) की अद्वितीय व्याख्याकार किशोरी अमोनकर (Kishori Amonkar) हिंदुस्तानी संगीत के किस घराने से थीं?",
            "Revered as 'Gaan Saraswati', Padma Vibhushan Kishori Amonkar, celebrated for her sublime microtonal emotive depth and complex Jod-Ragas, was the titan of which Gharana?",
            listOf("पटियाला घराना", "जयपुर-अतरौली घराना (Jaipur-Atrauli Gharana - Founded by Ustad Alladiya Khan / Intricate melodic curves, Vakra ragas, and complex rhythm)", "किराना घराना", "बनारस घराना"),
            listOf("Patiala Gharana", "Jaipur-Atrauli Gharana (Founded by Ustad Alladiya Khan; celebrated for oblique (vakra) phrases, rare joint ragas, and sustained tension)", "Kirana Gharana", "Banaras Gharana"),
            1,
            "किशोरी अमोनकर (1932-2017, महाराष्ट्र) अपनी माता मोगूबाई कुर्डीकर की शिष्या थीं, जो जयपुर-अतरौली घराने के संस्थापक उस्ताद अल्लादिया खान की वरिष्ठ शिष्या थीं। यह घराना दुर्लभ 'अनवट' और 'जोड़' रागों, वक्र तानों और तानपुरे के हर सुर से संवाद स्थापित करने के लिए प्रसिद्ध है। मल्लिकार्जुन मंसूर और पद्मा तलवलकर भी इसी घराने के दिग्गज हैं।",
            "Jaipur-Atrauli Gharana is celebrated for its cerebral complexity, seamless dynamic transitions, and profound architectural grandeur.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q3", "art_9",
            "ध्रुपद-धमार और ख्याल गायकी के अनूठे संगम तथा 'रंगीला घराना' (Rangeela Gharana) के नाम से प्रसिद्ध 'आगरा घराने' के सबसे दिग्गज गायक कौन थे, जिन्हें 'आफताब-ए-मौसिकी' की उपाधि मिली थी?",
            "Which iconic maestro, given the royal title 'Aftab-e-Mousiqi' (Sun of Music), brought immense prestige to the Agra Gharana through his booming resonant Nom-Tom Alap and Khayal mastery?",
            listOf("उस्ताद अमीर खान", "उस्ताद फैयाज खान (Ustad Faiyaz Khan 'Prempiya' - 1886–1950, Baroda Court / Agra-Rangeela Gharana / Master of Nom-Tom Dhrupad & Bol-Baant)", "उस्ताद विलायत हुसैन खान", "शराफत हुसैन खान"),
            listOf("Ustad Amir Khan", "Ustad Faiyaz Khan (Conferred the title 'Aftab-e-Mousiqi'; unmatched mastery over Dhrupad-Dhamar, Nom-Tom alap, Bol-Taan, and Thumri)", "Ustad Vilayat Hussain Khan", "Sharafat Hussain Khan"),
            1,
            "उस्ताद फैयाज खान 'प्रेमपिया' (1886-1950) आगरा घराने के सबसे महान गायक थे। आगरा घराने की उत्पत्ति नौहार बानी के ध्रुपद गायकों से हुई थी, जिसे उस्ताद घग्घे खुदाबख्श ने ख्याल गायकी के साथ मिलाया। इसकी विशेषता भारी, गूंजदार आवाज, 'नोम-तोम' आलाप और ताल के साथ लयकारी (बोल-बांट) है।",
            "Agra Gharana stands distinct for preserving masculine dhrupadic rhythmic weight within classical Khayal interpretations.",
            "Moderate"
        ),
        makeArtCultureQ(
            "art_9_m6_q4", "art_9",
            "मध्य प्रदेश के सतना जिले में स्थित 'मैहर घराना' (Maihar Gharana / Senia Maihar) की स्थापना किस बहुमुखी संगीत तपस्वी 'बाबा' ने की थी, जिन्होंने पंडित रवि शंकर और उस्ताद अली अकबर खान जैसे विश्व प्रसिद्ध शिष्य गढ़े?",
            "Which legendary musical sage and royal court musician of Maihar Kingdom founded the Senia Maihar Gharana, shaping disciples like Ravi Shankar, Ali Akbar Khan, and Nikhil Banerjee?",
            listOf("उस्ताद हाफिज अली खान", "उस्ताद अलाउद्दीन खान / बाबा अलाउद्दीन खान (Ustad Allauddin Khan - 1862–1972 / Maihar Band founder / Master of Sitar, Sarod, Surshringar & Violin)", "उस्ताद मुश्ताक अली खान", "उस्ताद इनायत खान"),
            listOf("Ustad Hafiz Ali Khan", "Ustad Allauddin Khan (Revered as 'Baba Allauddin Khan'; multi-instrumentalist genius who trained his son Ali Akbar Khan, daughter Annapurna Devi, and Ravi Shankar)", "Ustad Mushtaq Ali Khan", "Ustad Enayet Khan"),
            1,
            "उस्ताद अलाउद्दीन खान (1862-1972) मैहर घराने के संस्थापक थे। वे तानसेन के वंशज उस्ताद वजीर खान (रामपुर-सेनिया घराना) के प्रमुख शिष्य थे। उन्होंने मैहर के अनाथ बच्चों को लेकर एशिया के पहले शास्त्रीय संगीत वाद्यवृंद 'मैहर बैंड' (1918) की स्थापना की और सितार, सरोद, सुरबहार, रबाब सहित सैकड़ों वाद्य यंत्रों में महारत हासिल की।",
            "Maihar Gharana revolutionized instrumental sitar and sarod gayaki-ang across modern international platforms.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q5", "art_9",
            "प्राचीन भारतीय वाद्य 'रुद्र वीणा' (Rudra Veena / Been) के सबसे शीर्ष ध्रुपद वादक कौन थे, जिन्हें खांडारबानी शैली के संरक्षण हेतु पद्म भूषण से सम्मानित किया गया?",
            "Which Padma Bhushan maestro was universally acclaimed as the supreme master of the ancient, sacred 'Rudra Veena' (Been), preserving the Khandarbani Dhrupad style?",
            listOf("उस्ताद विलायत खान", "उस्ताद असद अली खान (Ustad Asad Ali Khan - 1937–2011 / Khandarbani Dhrupad / Playing with heavy two-gourd Rudra Veena)", "उस्ताद जिया मोहिउद्दीन डागर", "पंडित राधिका मोहन मैत्रा"),
            listOf("Ustad Vilayat Khan", "Ustad Asad Ali Khan (Eminent Rudra Veena virtuoso descended from royal Jaipur court musicians; mastered solemn Khandarbani dhrupad glides)", "Ustad Zia Mohiuddin Dagar", "Pandit Radhika Mohan Maitra"),
            1,
            "उस्ताद असद अली खान (1937-2011) और उस्ताद जिया मोहिउद्दीन डागर भारत के सबसे महान 'रुद्र वीणा' वादक थे। रुद्र वीणा भगवान शिव द्वारा पार्वती के रूप को देखकर निर्मित मानी जाती है। इसमें दो बड़े तुम्बे (सूखे कद्दू/gourds), एक बड़ा बांस या सागौन का डंडा और 24 अचल पर्दे होते हैं। यह ध्रुपद शैली का सबसे गंभीर और आध्यात्मिक वाद्य है।",
            "The Rudra Veena embodies the ancient, meditative core of Indian acoustic acoustics and contemplative Naad Yoga.",
            "Moderate"
        ),
        makeArtCultureQ(
            "art_9_m6_q6", "art_9",
            "कर्नाटक संगीत में 11 वर्ष की अल्पायु में पश्चिमी वाद्य 'मैंडोलिन' (Mandolin) को शास्त्रीय मंच पर लाकर दुनिया भर में तहलका मचाने वाले बाल-प्रतिभा संगीतकार कौन थे?",
            "Which legendary child prodigy, conferred with Padma Shri at a young age, adapted the Western electronic Mandolin into a dazzling solo instrument for Carnatic classical music?",
            listOf("एल. सुब्रमण्यम", "यू. श्रीनिवास / मैंडोलिन श्रीनिवास (Uppalapu Srinivas - 1969–2014 / Introduced electric mandolin to Carnatic concerts / Collaborated with John McLaughlin in Remember Shakti)", "कादरी गोपालनाथ (सक्साफोन)", "एन. रविकिरण (चित्रवीणा)"),
            listOf("Dr. L. Subramaniam (Violin)", "U. Srinivas (Uppalapu Srinivas; globally acclaimed mandolin prodigy who adapted 5-string electric mandolin with Gamaka nuances)", "Kadri Gopalnath (Saxophone)", "N. Ravikiran (Chitravina)"),
            1,
            "उप्पलापु श्रीनिवास ('मैंडोलिन श्रीनिवास' - 1969-2014, आंध्र प्रदेश/चेन्नई) ने पश्चिमी मैंडोलिन में 5 एकल तार लगाकर उस पर कर्नाटक संगीत के जटिल 'गमक' (कंपन/glides) और राग बजाना संभव बनाया। जॉन मैकलॉघलिन के साथ 'रिमेम्बर शक्ति' बैंड में उनके प्रदर्शन को वैश्विक स्तर पर सराहा गया। (कादरी गोपालनाथ ने सैक्सोफोन को कर्नाटक संगीत में उतारा था)।",
            "Mandolin U. Srinivas stands as one of modern world music's most extraordinary instrumental innovators.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q7", "art_9",
            "चीनी मिट्टी के प्यालों में पानी की अलग-अलग मात्रा भरकर छोटी छड़ियों से मधुर ध्वनियां उत्पन्न करने वाले प्राचीन भारतीय वाद्य को क्या कहा जाता है?",
            "Which ancient Indian percussion-melodic instrument consists of a semi-circular set of porcelain bowls filled with tuned water levels struck with lightweight bamboo sticks?",
            listOf("काष्ठ तरंग", "जल तरंग (Jal Tarang - Mentioned in Vatsyayana's Kamasutra as one of 64 arts / Water waves instrument / Played by Pandit Milind Tulankar)", "कांच तरंग", "तबल तरंग"),
            listOf("Kashtha Tarang (Wooden xylophone)", "Jal Tarang (Acoustic instrument comprising water-filled ceramic cups creating precise pitches through vibrating water columns)", "Kanch Tarang (Glass)", "Tabal Tarang"),
            1,
            "'जल तरंग' (Jal Tarang) वात्स्यायन के 'कामसूत्र' में वर्णित 64 कलाओं में से एक है। इसमें 15 से 22 पोर्सिलेन/चीनी मिट्टी के कटोरे होते हैं। प्रत्येक कटोरे में पानी के स्तर को कम या ज्यादा करके सप्तक के स्वरों की पिच (आवृत्ति) सटीक रूप से सेट की जाती है। पंडित मिलिंद तुलणकर और डॉ. रंजना प्रधान इसके प्रमुख वादक हैं।",
            "Jal Tarang is one of the world's most delicate microtonal percussion-wave instruments, using water mass as a acoustic tuning regulator.",
            "Moderate"
        ),
        makeArtCultureQ(
            "art_9_m6_q8", "art_9",
            "छत्तीसगढ़ की पारंपरिक लोक गाथा 'पंडवानी' (Pandavani - महाभारत कथा गायन) की अंतरराष्ट्रीय ख्याति प्राप्त गायिका और 'पद्म विभूषण' (2019) से सम्मानित कलाकार कौन हैं?",
            "Which internationally acclaimed folk artist from Chhattisgarh, renowned for her dynamic enactment of the Mahabharata while playing the Tambura and Kartal, was awarded the Padma Vibhushan in 2019?",
            listOf("ऋतु वर्मा", "तीजन बाई (Teejan Bai - Kapalik style Pandavani exponent / Awarded Padma Shri 1987, Padma Bhushan 2003, Padma Vibhushan 2019, Fukuoka Prize)", "शांति बाई चेलक", "इला अरुण"),
            listOf("Ritu Verma (Vedamati style)", "Teejan Bai (Iconic Kapalik-style Pandavani singer who dramatizes the warrior Bhima wielding her single-string Tambura as a mace)", "Shanti Bai Chelak", "Ila Arun"),
            1,
            "तीजन बाई (जन्म 1956, गनियारी, भिलाई, छत्तीसगढ़) पंडवानी की कापालिक शैली की विख्यात गायिका हैं। वे अपने हाथ में तंबूरा (जिसे वे कभी भीम की गदा, कभी धनुष या तलवार बना लेती हैं) और खड़ताल लेकर ओजस्वी स्वर में महाभारत के प्रसंग सुनाती हैं। वे पद्मश्री, पद्म भूषण और पद्म विभूषण तीनों नागरिक सम्मान पाने वाली लोक कलाकार हैं।",
            "Teejan Bai elevated indigenous Chhattisgarhi Pandavani into a globally celebrated form of solo theatrical epic storytelling.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q9", "art_9",
            "राजस्थान के थार मरुस्थल के मांगणियार और लंगा लोक संगीतकारों द्वारा बजाया जाने वाला 17 तारों वाला पारंपरिक धनुषाकार (Bowed) वाद्य यंत्र कौन-सा है, जिसे 'साकर खान' ने अंतरराष्ट्रीय मंच पर बजाया था?",
            "Which 17-stringed bowed folk instrument, carved from a single piece of mango wood with a goatskin parchment belly, is played masterfully by Manganiyar musicians of Rajasthan like Padma Shri Sakar Khan?",
            listOf("रावणहत्था", "कमायचा (Kamaicha / Kamayacha - Sacred bowed instrument of the Manganiyars / Bow made of horsehair / Sakar Khan & Ghewar Khan)", "सुरिंदा", "अपांग"),
            listOf("Ravanahatha (Bowed stick fiddle)", "Kamaicha (One of the oldest surviving bowed instruments in the world, featuring 3 main gut strings and 14 steel sympathetic strings)", "Surinda", "Apang"),
            1,
            "'कमायचा' (Kamayacha) पश्चिमी राजस्थान (जैसलमेर, बाड़मेर) के मांगणियार लोक गायकों का सबसे मुख्य वाद्य है। यह गोल कटोरेनुमा लकड़ी पर बकरे की खाल मढ़कर बनाया जाता है। इसमें 3 मुख्य तार बकरे की आंत (gut) के और 14 सहायक तार स्टील के होते हैं, जिसे घोड़े के बाल की कमान (bow) से बजाया जाता है। पद्मश्री साकर खान (1938-2013) इसके विश्व प्रसिद्ध वादक थे।",
            "The Kamaicha produces a deep, haunting desert timbre capable of carrying vocal-like microtonal embellishments across sand dunes.",
            "Moderate"
        ),
        makeArtCultureQ(
            "art_9_m6_q10", "art_9",
            "पश्चिम बंगाल के रहस्यवादी घुमंतू 'बाउल' (Baul) गायकों द्वारा अपने आध्यात्मिक गीतों के साथ बजाया जाने वाला एक तार का पारंपरिक लोक वाद्य कौन-सा है?",
            "Which iconic single-stringed plucked rhythmic lute made of dried gourd and split bamboo is played by the mystic Baul minstrels of Bengal alongside the Dubki?",
            listOf("दोतारा", "एकतारा / गोपीयंत्र (Ektara / Gopiyantra - Single-string folk instrument / Sacred to Lalon Fakir & Baul Vaishnava-Sufi mystic singers)", "खमक (Anandalahari)", "सारिंदा"),
            listOf("Dotara (Two or four strings)", "Ektara (Resonant single-string drone instrument held in hand while dancing to divine love and Dehatattva lyrics)", "Khamak / Anandalahari", "Sarinda"),
            1,
            "पश्चिम बंगाल और बांग्लादेश के बाउल संतों (जैसे लालोन फकीर, पूर्ण दास बाउल) का सबसे प्रमुख वाद्य 'एकतारा' (Ektara) है। 2005 में यूनेस्को ने 'बाउल गीतों' को मानवता की अमूर्त सांस्कृतिक विरासत (Intangible Cultural Heritage) में शामिल किया था। बाउल संगीत में एकतारा, दोतारा, डुबकी और खमक से आध्यात्मिक आत्म-ज्ञान (देह-तत्व) के गीत गाए जाते हैं।",
            "The Ektara represents the minimalist spiritual philosophy of the Bauls, celebrating the divine within the human heart.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q11", "art_9",
            "दक्षिण भारतीय मंदिरों और शुभ विवाहों में बजाया जाने वाला अत्यंत शक्तिशाली और पवित्र सुषिर (पवन) वाद्य यंत्र 'नादस्वरम' (Nadaswaram / Mangala Vadyam) किस लकड़ी से बनाया जाता है?",
            "The monumental double-reed wind instrument 'Nadaswaram' (Mangala Vadyam), ubiquitous in South Indian temple rituals and weddings, is traditionally crafted from which seasoned wood?",
            listOf("चंदन की लकड़ी", "आबनूस / शीशम या आचा की लकड़ी (Aacha Wood / Hardwickia binata or Ebony - Heavy seasoned dark wood / Metal bell Anasu)", "बांस की लकड़ी", "सागौन की लकड़ी"),
            listOf("Sandalwood", "Aacha wood (Hardwickia binata - extremely dense, seasoned wood capable of withstanding intense acoustic wind pressure)", "Bamboo", "Teak"),
            1,
            "'नादस्वरम' (Nadaswaram) दुनिया के सबसे तेज आवाज वाले गैर-पीतल ध्वनिक वाद्यों में से एक है। इसे दक्षिण भारत में 'मंगल वाद्य' माना जाता है और यह 'आचा' (Aacha) की कठोर लकड़ी से बनता है। इसके आगे पीतल का फैला हुआ 'अणसु' (Bell) लगा होता है। इसे 'तविल' (Thavil) ढोलक के साथ बजाया जाता है। शेख चिन्ना मौलाना और थिरुविझा जयशंकर इसके महान वादक रहे हैं।",
            "The Nadaswaram stands as the sacred acoustic voice of South Indian temple rituals, celebrated for its expansive open-air acoustic resonance.",
            "Moderate"
        ),
        makeArtCultureQ(
            "art_9_m6_q12", "art_9",
            "कर्नाटक संगीत में लय का सबसे प्रमुख दो सिरों वाला पारंपरिक ड्रम वाद्य 'मृदंगम' (Mridangam) के सबसे महान प्रतिपादक कौन माने जाते हैं, जिन्हें 'मृदंग चक्रवर्ती' कहा जाता था?",
            "Which legendary maestro, revered as the 'Emperor of Mridangam' (Mridanga Chakravarthi), set the gold standard for South Indian classical rhythmic accompaniment during the 20th century?",
            listOf("उमयलपुरम के. शिवरामन", "पालघाट मणि अय्यर (Palghat Mani Iyer - 1912–1981 / Sangeet Natak Akademi Fellow / Revolutionized Mridangam tonal dynamics without microphone)", "कराईकुडी मणि", "तिरुवरूर भक्तवत्सलम"),
            listOf("Umayalpuram K. Sivaraman", "Palghat Mani Iyer (Legendary percussionist who elevated the Mridangam into a sovereign musical voice alongside vocal stalwarts like Ariyakudi and Semmangudi)", "Karaikudi Mani", "Tiruvarur Bakthavathsalam"),
            1,
            "पालघाट मणि अय्यर (1912-1981, केरल) कर्नाटक संगीत में मृदंगम के सबसे महान कलाकार थे। वे पहले ऐसे मृदंग वादक थे जिन्हें राष्ट्रपति का संगीत नाटक अकादमी पुरस्कार और पद्म भूषण मिला। उन्होंने माइक्रोफोन के बिना भी मृदंगम की प्राकृतिक धुन और बाएं-दाएं मुख के संतुलन से सभागारों को झंकृत कर दिया था।",
            "Palghat Mani Iyer transformed the South Indian Mridangam into a profound, melodious instrument of structural rhythmic mathematics.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q13", "art_9",
            "13वीं-14वीं शताब्दी में दिल्ली सल्तनत के काल में 'कव्वाली' (Qawwali), 'ख्याल' और 'तराना' गायन शैलियों के जनक तथा 'सितार' व 'तबला' के आविष्कार का श्रेय किस महान सूफी कवि-संगीतकार को दिया जाता है?",
            "Which polymath Sufi poet-musician of the Delhi Sultanate, disciple of Hazrat Nizamuddin Auliya, is celebrated as the 'Father of Qawwali' and pioneer of the Tarana and modern Indian tuning systems?",
            listOf("तानसेन", "अमीर खुसरो (Amir Khusrau - 1253–1325 / 'Tuti-e-Hind' / Blended Persian and Braj Bhasha / Devised Qawwali, Tarana, and ragas like Yaman)", "मिया बख्सू", "सुल्तान हुसैन शाह शर्की"),
            listOf("Tansen", "Amir Khusrau (Revered as the 'Parrot of India'; introduced Persian Maqam modes into Indian Ragas, devised Khayal innovations, and founded the Qawwal Bachhe lineage)", "Mian Bakhshu", "Sultan Hussain Shah Sharqi"),
            1,
            "अमीर खुसरो (1253-1325, पटियाली, यूपी) को 'तोता-ए-हिंद' (Tuti-e-Hind) कहा जाता है। उन्होंने हजरत निजामुद्दीन औलिया की दरगाह पर सूफी भक्ति गायन 'कव्वाली' की शुरुआत की। उन्होंने फारसी और भारतीय संगीत परंपराओं को मिलाकर राग यमन, साज़गिरी, ज़िलफ का सृजन किया और 'तराना' व 'कौल' जैसी गायन शैलियों को जन्म दिया।",
            "Amir Khusrau laid the foundational cultural bridge for Ganga-Jamuni tehzeeb and Indo-Persian composite musical traditions.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q14", "art_9",
            "उत्तर भारतीय शास्त्रीय संगीत में गायन और वादन को तालबद्ध करने वाला प्राचीनतम दो तरफा गंभीर ढोल वाद्य 'पखावज' (Pakhawaj / Mridanga) मुख्य रूप से किस गायन शैली की अनिवार्य संगत है?",
            "The majestic, deep-toned double-headed barrel drum 'Pakhawaj' is the mandatory classical rhythmic percussion accompanist for which ancient vocal style?",
            listOf("ठुमरी और दादरा", "ध्रुपद और धमार गायन (Dhrupad & Dhamar - Solemn spiritual singing / Open-handed heavy Pakhawaj bols / Pandit Ayodhya Prasad & Bhavani Shankar)", "गजल और कव्वाली", "टप्पा और चैती"),
            listOf("Thumri and Dadra", "Dhrupad and Dhamar (Ancient solemn Vedic vocal forms requiring the deep resonant rhythmic cycles of the Pakhawaj with wheat dough tuning)", "Ghazal and Qawwali", "Tappa and Chaiti"),
            1,
            "'पखावज' (या उत्तर भारतीय मृदंग) ध्रुपद और धमार गायन तथा कथक नृत्य (विशेषकर रायगढ़ व जयपुर शैली) का मुख्य ताल वाद्य है। इसके बाएं मुख पर गूंज पैदा करने के लिए ताजे गेहूं के आटे की लोई (dough) लगाई जाती है। पंडित भवानी शंकर, पंडित अयोध्या प्रसाद और बाबू कुदाऊ सिंह इसके ऐतिहासिक वादक रहे हैं।",
            "The Pakhawaj delivers profound low-frequency resonance indispensable for sustaining the monumental temple aesthetic of Dhrupad.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_9_m6_q15", "art_9",
            "राजस्थान के 'भोपा' (Bhopa) लोक गायकों द्वारा लोक देवता 'पाबूजी की पड़' (Phad of Pabuji) का वाचन करते समय बजाया जाने वाला प्राचीन नारियल के खोल का तार वाद्य कौन-सा है?",
            "Which ancient bowed string instrument, made of half a coconut shell covered with goatskin and a bamboo shaft with horsehair bow, is played by Rajasthani Bhopas while reciting Pabuji ki Phad?",
            listOf("कमायचा", "रावणहत्था (Ravanahatha / Ravanahasta - Ancient string fiddle believed to have originated in Lanka with King Ravana / 2 main strings and Sympathetic Tarabs)", "सारंगी", "मोरचंग"),
            listOf("Kamaicha", "Ravanahatha (Ancient bowed chordophone considered an ancestral precursor to the modern violin; played with a curved bow with ghungroos)", "Sarangi", "Morchang (Jaw harp)"),
            1,
            "'रावणहत्था' (Ravanahatha) राजस्थान और गुजरात का प्राचीन धनुष वाद्य है। मान्यता है कि इसका आविष्कार लंकापति रावण ने भगवान शिव की स्तुति के लिए किया था। पश्चिमी विद्वानों के अनुसार यह आधुनिक वायलिन का सबसे प्रारंभिक पूर्वज है। राजस्थान में पाबूजी महाराज के भोपे रातभर 'फड़' (चित्रित कपड़े का पर्दा) के सामने रावणहत्था बजाकर वीरता की गाथाएं गाते हैं।",
            "The Ravanahatha stands as one of the world's most historic bowed chordophones, carrying centuries of oral epic bardic traditions.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_9", 7, 10, baseQuestions)
    }
}
