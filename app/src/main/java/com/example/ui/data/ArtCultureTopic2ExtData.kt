package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic2ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeArtCultureQ(
            "art_2_m6_q1", "art_2",
            "केरल का प्रसिद्ध अनुष्ठानिक लोक नृत्य-नाटक 'मुदियेट्टु' (Mudiyettu), जिसे 2010 में यूनेस्को की अमूर्त विरासत सूची में शामिल किया गया, किस पौराणिक प्रसंग पर आधारित है?",
            "Mudiyettu, a ritual dance-drama of Kerala inscribed by UNESCO in 2010, dramatizes which mythological confrontation between divine and demonic forces?",
            listOf("राम और रावण युद्ध", "देवी भद्रकाली और राक्षस दारिका का युद्ध एवं वध (Battle and slaying of demon Darika by Goddess Bhadrakali)", "हिरण्यकशिपु वध", "महिषासुर मर्दिनी"),
            listOf("Rama vs Ravana war", "The mythological duel between the goddess Kali/Bhadrakali and the demon king Darika in village temples (Kavu)", "Narasimha slaying Hiranyakashipu", "Mahishasura Mardini"),
            1,
            "मुदियेट्टु केरल के काली मंदिरों में फसल कटाई के बाद किया जाने वाला अनुष्ठानिक नाटक है। इसमें देवी काली द्वारा राक्षस दारिका के वध का सजीव मंचन होता है। 2010 में इसे यूनेस्को विरासत घोषित किया गया।",
            "Mudiyettu is a traditional ritual theatre of Kerala celebrating the cosmic triumph of good over evil through Goddess Bhadrakali.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q2", "art_2",
            "मध्य प्रदेश और छत्तीसगढ़ के गोंड तथा बैगा आदिवासियों द्वारा करम वृक्ष की पूजा और फसल के समय किया जाने वाला प्रमुख जनजातीय नृत्य कौन-सा है?",
            "Which sacred tribal folk dance is performed by the Gond, Baiga, and Oraon tribes of Central and Eastern India during the worship of the sacred Karam tree?",
            listOf("भगोरिया नृत्य", "करमा नृत्य (Karma Dance - MP, Chhattisgarh, Jharkhand, Odisha / Karam festival / Mandar drum)", "सुआ नृत्य", "गौर मारिया नृत्य"),
            listOf("Bhagoria dance", "Karma Dance (Centuries-old tribal dance invoking fertility and prosperity, performed linking arms in lines to the beat of Mandar and Timki)", "Sua dance (Parrot dance)", "Gaur Maria dance"),
            1,
            "करमा नृत्य भाद्रपद मास के एकादशी को करम देवता (कर्म व भाग्य के देवता) की पूजा पर किया जाता है। पुरुष और महिलाएं मांदर और झांझ की थाप पर एक-दूसरे की कमर में हाथ डालकर नृत्य करते हैं।",
            "Karma dance is the most vibrant collective tribal dance of Central and Eastern India celebrating nature's bounty.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q3", "art_2",
            "छत्तीसगढ़ के बस्तर क्षेत्र की 'माड़िया गोंड' (Muria / Maria Gond) जनजाति द्वारा भैंस के सींगों वाला मुकुट पहनकर किया जाने वाला विश्वविख्यात नृत्य कौन-सा है?",
            "Which iconic tribal dance of Bastar, Chhattisgarh features male dancers wearing massive headgears made of wild buffalo horns decorated with cowrie shells?",
            listOf("सुआ नृत्य", "गौर मारिया नृत्य / बाइसन हॉर्न मारिया नृत्य (Gaur Maria / Bison Horn Maria Dance - Bastar, Chhattisgarh)", "पंथी नृत्य", "राउत नाचा"),
            listOf("Sua dance", "Gaur Maria Dance (Celebrated for hunting rituals and youth camaraderie, using cylindrical long drums)", "Panthi dance (Satnami community)", "Raut Nacha (Yadav community)"),
            1,
            "गौर मारिया (बाइसन हॉर्न) नृत्य बस्तर के माड़िया आदिवासियों का प्रसिद्ध शिकार और उत्सव नृत्य है। पुरुष जंगली भैंसे (गौर) के सींग और कौड़ियों से बना मुकुट पहनते हैं और ढोल बजाते हैं।",
            "The Gaur Maria dance is an internationally celebrated tribal art of Bastar showcasing magnificent buffalo-horn headpieces.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q4", "art_2",
            "मध्य प्रदेश के झाबुआ और अलीराजपुर जिलों में होली के अवसर पर भील और भिलाला जनजाति द्वारा आयोजित हाट और उत्सव नृत्य का क्या नाम है?",
            "What is the famous tribal festival and matchmaking dance fair celebrated by the Bhil and Bhilala tribes of Western Madhya Pradesh ahead of Holi?",
            listOf("करमा", "भगोरिया हाट एवं नृत्य (Bhagoria Haat & Dance - Jhabua, Alirajpur, Dhar, MP / Bhil-Bhilala tribes)", "मटकी नृत्य", "सैला नृत्य"),
            listOf("Karma", "Bhagoria Haat (A seven-day spring carnival where young tribal youths traditionally choose their life partners while dancing to massive Nagara drums)", "Matki dance", "Saila dance"),
            1,
            "भगोरिया उत्सव होली से एक सप्ताह पूर्व मालवा-निमाड़ के भील क्षेत्रों में मनाया जाता है। इसमें युवक-युवतियां सज-धजकर बांसुरी और मांदल की थाप पर नाचते हैं और पारंपरिक रूप से जीवनसाथी चुनते हैं।",
            "Bhagoria is a vibrant tribal carnival and folk dance of Madhya Pradesh celebrating youthful joy, romance, and harvest.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q5", "art_2",
            "लद्दाख का प्रसिद्ध बौद्ध मुखौटा नृत्य कौन-सा है जो हेमिस मठ (Hemis Monastery) में गुरु पद्मसंभव की जयंती पर विशाल मुखौटे पहनकर किया जाता है?",
            "Which sacred Tibetan Buddhist mask dance (Cham Dance) is performed by Lamas at Ladakh's Hemis Monastery to celebrate the birth of Guru Padmasambhava?",
            listOf("जब्रो नृत्य", "छम नृत्य / हेमिस त्सेचु (Chham Dance / Cham Dance - Hemis Tsechu Festival, Ladakh)", "शोंडोल नृत्य", "द्रुकपा नृत्य"),
            listOf("Jabro dance", "Chham Dance (Ritual mask dance enacted by Buddhist monks depicting the victory of Dharma over demonic forces)", "Shondol dance (Royal dance)", "Drukpa dance"),
            1,
            "छम (Cham) लद्दाख और सिक्किम के बौद्ध मठों का पवित्र मुखौटा नृत्य है। भिक्षु (लामा) रेशमी वस्त्र और भयंकर देवताओं के विशाल मुखौटे पहनकर पारंपरिक वाद्य यंत्रों (डुंगचेन ट्रम्पेट, झांझ) पर नृत्य करते हैं।",
            "The Cham Dance of Hemis Monastery in Ladakh is a mystical Buddhist mask dance dramatizing the subduing of evil spirits.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q6", "art_2",
            "पश्चिम बंगाल का कौन-सा प्रसिद्ध पारंपरिक लोक नाट्य रूप है जो खुले मैदानों में रात भर ऐतिहासिक और पौराणिक नाटकों का भावुक संवादों और गीतों के साथ मंचन करता है?",
            "Which open-air folk theatre of Bengal, originating from Chaitanya Mahaprabhu's devotional processions, delivers high-voltage theatrical drama with loud clarinets and violins?",
            listOf("तमाशा", "जात्रा (Jatra - West Bengal, Odisha, Tripura & Bangladesh / 'Going on a pilgrimage' / Vivek character)", "अंकिया नाट", "विदेशिया"),
            listOf("Tamasha", "Jatra (Literally 'journey'; open-stage secular and historical melodramas featuring symbolic characters like the 'Vivek' / Conscience)", "Ankiya Nat", "Bidesiya"),
            1,
            "जात्रा (संस्कृत 'यात्रा') बंगाल का अत्यंत लोकप्रिय लोक नाट्य है। 16वीं सदी में श्री चैतन्य के भक्ति गीतों से शुरू होकर यह आधुनिक काल में सामाजिक-राजनीतिक नाटकों का माध्यम बना। 'विवेक' (अंतरात्मा) इसका प्रमुख पात्र होता है।",
            "Jatra is Bengal's iconic open-air folk theatre form, famous for dramatic vocal declamations and live musical orchestra.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q7", "art_2",
            "बिहार के महान लोक नाटककार 'भिखारी ठाकुर' (जिन्हें 'भोजपुरी का शेक्सपियर' कहा जाता है) द्वारा रचित और मंचित प्रसिद्ध लोक नाट्य कौन-सा है?",
            "Which famous Bhojpuri folk theatre and musical play, depicting the pain of migrant laborers leaving behind wives in villages, was created by Bhikhari Thakur ('Shakespeare of Bhojpuri')?",
            listOf("जाट-जटिन", "विदेशिया (Bidesiya - Bhikhari Thakur / Bhojpuri Folk Theatre of Bihar)", "डोमकच", "सामा चकेवा"),
            listOf("Jat-Jatin", "Bidesiya (Classic Bhojpuri dance-drama dealing with migration, social hierarchy, and women's empowerment in rural Bihar)", "Domkach", "Sama Chakeva"),
            1,
            "भिखारी ठाकुर (1887-1958) ने 'विदेशिया' लोक नाट्य की रचना की, जो रोजी-रोटी की तलाश में कलकत्ता आदि परदेस जाने वाले पतियों और गांव में पीछे छूट जाने वाली पत्नियों के विरह व व्यथा पर आधारित है।",
            "Bidesiya is a legendary Bhojpuri musical folk play crafted by Bhikhari Thakur that captured the socio-economic reality of rural Bihar.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q8", "art_2",
            "तमिलनाडु का प्राचीन सड़क/खुला लोक नाट्य कौन-सा है जो द्रौपदी अम्मन मंदिरों में रात भर महाभारत की कथाओं (विशेषकर द्रौपदी चीरहरण, कर्ण मोक्षम) का मंचन करता है?",
            "Which traditional street theatre of Tamil Nadu is performed in village open spaces dedicated to Draupadi Amman temples, enacting all-night Mahabharata episodes?",
            listOf("यक्षगान", "थेरुक्कूथु (Therukoothu - Tamil Nadu / Street Play / 'Theru' = Street, 'Koothu' = Play)", "कूडियाट्टम", "विलापाट्टु"),
            listOf("Yakshagana", "Therukoothu (Vibrant street play incorporating high-pitched singing, heavy facial makeup, and rhythmic round dancing on open village soil)", "Koodiyattam", "Villu Paattu"),
            1,
            "थेरुक्कूथु (थेरु = सड़क, कूथु = नाटक) तमिलनाडु का पारंपरिक लोक नाट्य है। इसमें अभिनेता रंगीन श्रृंगार और भारी लकड़ी के आभूषण पहनकर खुले मैदान में गायन व संवाद के साथ महाभारत के प्रसंग प्रस्तुत करते हैं।",
            "Therukoothu is the quintessential street theatre tradition of Tamil Nadu enacted during temple festivals.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q9", "art_2",
            "पश्चिम बंगाल की 'डांगर पुतुल नाच' और ओडिशा की 'कंधेई नाच' किस प्रकार की कठपुतली कला की प्रमुख शैलियां हैं?",
            "The traditional puppetry styles 'Daanger Putul Nach' of West Bengal and 'Kandhei Nach' of Odisha belong to which puppetry classification?",
            listOf("धागा कठपुतली", "छड़ कठपुतली (Rod Puppets - Manipulated from below using central rods and joints)", "छाया कठपुतली", "दस्ताना कठपुतली"),
            listOf("String puppetry", "Rod Puppetry (Large wooden puppets mounted on rods operated by puppeteers hidden behind a screen)", "Shadow puppetry", "Glove puppetry"),
            1,
            "छड़ कठपुतली (Rod Puppets) में कठपुतलियों को नीचे से छड़ों (Rods) द्वारा संचालित किया जाता है। बंगाल का पुतुल नाच और ओडिशा का कंधेई नाच इसके उत्कृष्ट रूप हैं।",
            "Rod puppetry is an impressive theatrical art in Eastern India where large jointed wooden figures are animated using connecting rods.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q10", "art_2",
            "केरल की प्रसिद्ध दस्ताना कठपुतली (Glove Puppetry) कला कौन-सी है जो कथकली शैली के परिधानों और श्रृंगार में 18वीं शताब्दी से मंचित की जाती है?",
            "Which traditional glove-puppet theatre form of Kerala is heavily influenced by Kathakali dance in its makeup, ornate headgear, and performance repertoire?",
            listOf("तोलपावक्कूथु", "पावक्कथकली (Pavakathakali - Kerala Glove Puppet Theatre / 'Pava' = Doll, 'Kathakali' = Story-play)", "थोलू बोम्मलाटा", "यक्षगान बोम्बियाटा"),
            listOf("Tholpavakoothu", "Pavakathakali (Unique glove puppet tradition created by the Andi Pandaram community using Chenda and Chengila percussion)", "Tholu Bommalata", "Yakshagana Bombeyata"),
            1,
            "पावकथकली (पावा = गुड़िया, कथकली = नाटक) केरल की 300 वर्ष पुरानी दस्ताना कठपुतली कला है। इसमें कठपुतलियों का श्रृंगार और वेशभूषा हूबहू कथकली नर्तकों जैसी होती है।",
            "Pavakathakali is Kerala's exquisite glove-puppetry tradition replicating the grandeur of full-scale Kathakali dance-dramas in miniature.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q11", "art_2",
            "मिजोरम का विश्वविख्यात 'बांस नृत्य' (Bamboo Dance) कौन-सा है जिसमें जमीन पर समानांतर रखे बांस के डंडों को लयबद्ध रूप से टकराने पर युवतियां फुर्ती से कूदती हैं?",
            "What is the world-famous traditional 'Bamboo Dance' of Mizoram performed during Chapchar Kut festival with rhythmic clapping of bamboo staves?",
            listOf("थंग-ता", "चेराव नृत्य (Cheraw Dance / Bamboo Dance - Mizoram / Chapchar Kut Festival)", "खल्लम", "सोलकिया"),
            listOf("Thang-Ta", "Cheraw Dance (Ancient rhythmic dance where men tap bamboo pairs together while women gracefully step in and out of the grid without getting caught)", "Khallam", "Solakia"),
            1,
            "चेराव नृत्य (बांस नृत्य) मिजोरम का सबसे पुराना और प्रसिद्ध लोक नृत्य है। मार्च में 'चापचार कुट' उत्सव पर 6 से 8 व्यक्ति जमीन पर बांस के डंडों को तालबद्ध टकराते हैं और महिलाएं पारंपरिक 'पुआनचेई' पोशाक में उनके बीच थिरकती हैं।",
            "Cheraw is the mesmerizing bamboo dance of Mizoram requiring pinpoint agility and rhythmic precision.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q12", "art_2",
            "हिमाचल प्रदेश का कौन-सा मुखौटा और लोक नृत्य कुल्लू दशहरा में देव स्तुति और बुरी आत्माओं को भगाने के लिए नगाड़ा, करनाल और नरसिंघा पर किया जाता है?",
            "Which iconic folk dance of Himachal Pradesh, celebrating seasonal apple harvests and religious fairs, is performed linking hands in graceful wavy lines in Kullu and Shimla?",
            listOf("रऊफ", "नाटी नृत्य (Nati Dance - Himachal Pradesh / Guinness World Record 2016 in Kullu)", "झाली", "छपेली"),
            listOf("Rouf", "Nati Dance (Traditional slow-tempo graceful group dance of Himachal Pradesh; holds Guinness World Record for largest folk dance ensemble)", "Jhali", "Chhapeli"),
            1,
            "नाटी नृत्य हिमाचल प्रदेश (कुल्लू, शिमला, सिरमौर) का सबसे लोकप्रिय लोक नृत्य है। 2016 कुल्लू दशहरा में 20,000+ नर्तकियों ने एक साथ नाटी नृत्य कर गिनीज वर्ल्ड रिकॉर्ड बनाया था।",
            "Nati is the beloved community folk dance of Himachal Pradesh performed in scenic open hills during festive seasons.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q13", "art_2",
            "उत्तराखंड के कुमाऊं क्षेत्र का प्रसिद्ध युद्ध/तलवार लोक नृत्य कौन-सा है जो शादी-विवाह और मेलों में ढोल-दमाऊ की थाप पर ढाल और तलवार लेकर किया जाता है?",
            "Which ancient martial sword dance of the Kumaon region in Uttarakhand is traditionally enacted by Rajput groomsmen carrying swords and shields to Dhol-Damau beats?",
            listOf("झोड़ा", "छोलिया नृत्य (Chholiya Dance - Kumaon, Uttarakhand / Sword & Shield Martial Folk Dance)", "चांचरी", "हुड़का बोल"),
            listOf("Jhora", "Chholiya Dance (Dating back over a thousand years to the Khasia Rajput martial heritage, performed to avert evil spirits during weddings)", "Chanchari", "Hurka Baul"),
            1,
            "छोलिया नृत्य उत्तराखंड के कुमाऊं मंडल (पिथौरागढ़, अल्मोड़ा, चंपावत) का 1000 वर्ष पुराना मार्शल लोक नृत्य है। इसमें लाल-सफेद परिधान में नर्तक तलवार-ढाल लेकर युद्ध कलाएं प्रस्तुत करते हैं।",
            "Chholiya is Kumaon's historic martial sword dance combining athletic acrobatics, brass trumpets (Ransingha), and rhythmic Dhol beats.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q14", "art_2",
            "हरियाणा का प्रसिद्ध पारंपरिक लोक नृत्य कौन-सा है जिसमें महिलाएं सिर पर पीतल का मटका रखकर झूमती हैं और पुरुषों के साथ लूर/फाग पर हास्य-ठिठोली करती हैं?",
            "Which prominent folk dance of Haryana, named after the circular metal ring worn by dancers, is performed in spring around Holi with joyful musical teasing?",
            listOf("भांगड़ा", "धमाल, लूर और घूमर हरियाणा (Dhamal, Loor & Phag Dances - Haryana / Daf & Tasha drums)", "जाट-जटिन", "बिहू"),
            listOf("Bhangra", "Dhamal and Loor (Dhamal is traced back to the Mahabharata era played with Daf; Loor is performed exclusively by girls around Holi)", "Jat-Jatin", "Bihu"),
            1,
            "धमाल (महाभारत काल से संबंधित), लूर (होली पर केवल महिलाओं द्वारा सवाल-जवाब), फाग और खोरिया हरियाणा के प्रमुख लोक नृत्य हैं। डफ और ताशा इनके प्रमुख वाद्य यंत्र हैं।",
            "Dhamal and Loor are iconic folk dances of Haryana reflecting the vibrant agrarian lifestyle of the state.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m6_q15", "art_2",
            "नागालैंड के विभिन्न जनजातियों द्वारा मनाया जाने वाला सबसे प्रसिद्ध 'युद्ध नृत्य' (War Dance) कौन-सा है जो भाले, ढाल और रंग-बिरंगे पंखों वाले मुकुट के साथ किया जाता है?",
            "Which iconic warrior dance of Nagaland is performed by different Naga tribes brandishing traditional spears and shields during the famous Hornbill Festival?",
            listOf("चेराव नृत्य", "नागा युद्ध नृत्य / मोआत्सु एवं सेक्रेनी नृत्य (Naga Warrior Dance / Hornbill Dance - Nagaland / Ao, Angami, Konyak, Sumi tribes)", "बगुरूम्बा", "थांग-ता"),
            listOf("Cheraw", "Naga Warrior Dance (Features mock battles, war cries, athletic leaps, and feathered hornbill crowns)", "Bagurumba", "Thang-Ta"),
            1,
            "नागा युद्ध नृत्य नागालैंड की विभिन्न जनजातियों (अओ, अंगामी, कोन्याक, सुमी) का पारंपरिक शौर्य नृत्य है। इसमें योद्धा अपने पारंपरिक भालों और दाव (चाकू) के साथ युद्ध कौशल और हुंकार का प्रदर्शन करते हैं।",
            "The Naga warrior dance is a fierce and breathtaking tribal martial spectacle celebrating hunting prowess and tribal solidarity.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_2", 7, 10, baseQuestions)
    }
}
