package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic1ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeArtCultureQ(
            "art_1_m6_q1", "art_1",
            "भरतनाट्यम और कुचिपुड़ी दोनों शास्त्रीय नृत्यों में समान रूप से पारंगत किस महान नृत्यांगना को पद्म भूषण और पद्म विभूषण (2001) दोनों से सम्मानित किया गया?",
            "Which iconic dancer was a dual master of both Bharatanatyam and Kuchipudi classical dance forms, awarded the Padma Vibhushan in 2001?",
            listOf("मल्लिका साराभाई", "यामिनी कृष्णमूर्ति / यामिनी पूर्णतिलका कृष्णमूर्ति (Yamini Krishnamurthy - Sangeet Natak Akademi Fellow / Asthana Nartaki of TTD)", "सोनल मानसिंह", "शोभना नारायण"),
            listOf("Mallika Sarabhai", "Yamini Krishnamurthy (Renowned virtuoso of both Bharatanatyam & Kuchipudi; honored with Padma Shri, Padma Bhushan, Padma Vibhushan)", "Sonal Mansingh", "Shovana Narayan"),
            1,
            "यामिनी कृष्णमूर्ति (1940-2024) भरतनाट्यम और कुचिपुड़ी की शीर्ष नृत्यांगना थीं। उन्हें तिरुमाला तिरुपति देवस्थानम (TTD) की 'आस्थान नर्तकी' घोषित किया गया था और तीनों पद्म पुरस्कारों से नवाजा गया।",
            "Yamini Krishnamurthy was a legendary exponent whose dynamic stage presence defined both Bharatanatyam and Kuchipudi for decades.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q2", "art_1",
            "ओडिसी और भरतनाट्यम की प्रसिद्ध नृत्यांगना 'सोनल मानसिंह' (Sonal Mansingh) वर्ष 2003 में पद्म विभूषण पाने वाली भारत की कौन-सी महिला नर्तकी बनीं?",
            "Sonal Mansingh, an exponent of both Bharatanatyam and Odissi, achieved what historic milestone when awarded the Padma Vibhushan in 2003?",
            listOf("सबसे उम्रदराज नृत्यांगना", "पद्म विभूषण प्राप्त करने वाली भारत की सबसे कम उम्र की महिला नर्तकी (Youngest female recipient of Padma Vibhushan in Dance in 2003)", "ओडिशा की पहली महिला", "राज्यसभा की पहली सदस्य"),
            listOf("Oldest classical dancer", "Youngest female recipient of Padma Vibhushan among all Indian dancers (Awarded in 2003 at age 59; nominated to Rajya Sabha in 2018)", "First Odia woman", "First woman in Parliament"),
            1,
            "सोनल मानसिंह (मुंबई) भरतनाट्यम और ओडिसी की दिग्गज नृत्यांगना हैं। 1977 में उन्होंने दिल्ली में 'सेंटर फॉर इंडियन क्लासिकल डांसेज' (CICD) की स्थापना की। 2003 में वे पद्म विभूषण पाने वाली सबसे कम उम्र की महिला कलाकार बनीं।",
            "Sonal Mansingh is an internationally acclaimed Indian classical dancer recognized with both Padma Bhushan and Padma Vibhushan.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q3", "art_1",
            "कथक नृत्य में 'ठुमरी' (Thumri) गायन के साथ भाव प्रदर्शन करने वाली और 'कथक क्वीन' कहलाने वाली प्रसिद्ध नृत्यांगना कौन थीं जिन्हें रवींद्रनाथ टैगोर ने 'नृत्य सम्राज्ञी' की उपाधि दी थी?",
            "Which iconic Kathak dancer, known as the 'Kathak Queen', was acclaimed by Rabindranath Tagore as 'Nritya Samragni' (Empress of Dance) at age 16?",
            listOf("शोभना नारायण", "सितारा देवी / धनलक्ष्मी (Sitara Devi - Banaras Gharana / 'Nritya Samragni' / Sangeet Natak Akademi Award 1969)", "दमयंती जोशी", "रोहिणी भाटे"),
            listOf("Shovana Narayan", "Sitara Devi (Born on Dhanteras day in Kolkata; daughter of Pt. Sukhdev Maharaj of Banaras Gharana)", "Damayanti Joshi", "Rohini Bhate"),
            1,
            "सितारा देवी (1920-2014) बनारस घराने की महान कथक नृत्यांगना थीं। गुरुदेव रवींद्रनाथ टैगोर ने उनका प्रदर्शन देखकर उन्हें 'नृत्य सम्राज्ञी' कहा था।",
            "Sitara Devi was an incandescent Kathak virtuoso celebrated for her passionate abhinaya and mastery over the Banaras Gharana style.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q4", "art_1",
            "केरल के 'कथकली' (Kathakali) नृत्य के पुनरुद्धार और संरक्षण के लिए 1930 में महाकवि वल्लथोल नारायण मेनन ने किस प्रतिष्ठित संस्थान की स्थापना की थी?",
            "Which renowned cultural institution was founded in 1930 by Mahakavi Vallathol Narayana Menon and Mukunda Raja to preserve and revive Kathakali in Kerala?",
            listOf("कलाक्षेत्र", "केरल कलामंडलम (Kerala Kalamandalam, Cheruthuruthy, Thrissur, Kerala - Founded 1930)", "दर्पणा अकादमी", "संगीत नाटक अकादमी"),
            listOf("Kalakshetra", "Kerala Kalamandalam (Deemed University of Art and Culture; preserved Kathakali, Mohiniyattam, and Kudiyattam)", "Darpana Academy", "Sangeet Natak Akademi"),
            1,
            "केरल कलामंडलम (चेरुथुरुथी, त्रिशूर) की स्थापना 1930 में कवि वल्लथोल नारायण मेनन ने की थी। इसने विलुप्त हो रहे कथकली और मोहिनीअट्टम को वैश्विक स्तर पर पुनर्जीवित किया।",
            "Kerala Kalamandalam is the premier public institution in India dedicated to the preservation of traditional Kerala performing arts.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q5", "art_1",
            "यूनेस्को द्वारा 2001 में 'मानवता की मौखिक एवं अमूर्त सांस्कृतिक विरासत' (Masterpiece of Oral and Intangible Heritage of Humanity) घोषित किया गया केरल का 2000 वर्ष पुराना संस्कृत नाट्य कौन-सा है?",
            "Which 2,000-year-old Sanskrit temple theatre tradition of Kerala was recognized by UNESCO in 2001 as a Masterpiece of the Oral and Intangible Heritage of Humanity?",
            listOf("थैय्यम", "कुटियाट्टम / कूडियाट्टम (Koodiyattam / Kutiyattam - Kerala Sanskrit Temple Theatre / Chakyar & Nambiar communities)", "यक्षगान", "तमाशा"),
            listOf("Theyyam", "Koodiyattam (Performed in Koothambalam temple theatres using Mizhavu drums; India's first UNESCO intangible heritage)", "Yakshagana", "Tamasha"),
            1,
            "कुटियाट्टम (केरल) विश्व की सबसे प्राचीन जीवित संस्कृत नाट्य परंपरा है (2000+ वर्ष)। इसे 2001 में यूनेस्को की पहली अमूर्त सांस्कृतिक विरासत सूची में शामिल किया गया था। प्रसिद्ध गुरु: अम्मानूर माधव चाक्यार।",
            "Koodiyattam is Kerala's sacred Sanskrit temple theatre, universally acknowledged as one of humanity's oldest performing art traditions.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q6", "art_1",
            "असम के 'सत्रिया' (Sattriya) शास्त्रीय नृत्य में प्रयुक्त होने वाले मुख्य वाद्य यंत्र कौन-से हैं?",
            "Which musical instruments are traditionally indispensable to the performance of Assam's Sattriya classical dance?",
            listOf("तबला और सितार", "खोल (मृदंग जैसा ताल वाद्य), ताल (झांझ/कांस्य मंजीरा) और बांसुरी (Khol drum, Bor-taal cymbals, Flute & Borgeet devotional songs)", "ढोलक और हारमोनियम", "चेंडा और मद्दलम्"),
            listOf("Tabla & Sitar", "Khol (Asymmetrical clay barrel drum), Taal (Cymbals), Flute, and Shankha (Conch)", "Dholak & Harmonium", "Chenda & Maddalam"),
            1,
            "सत्रिया नृत्य में मुख्य ताल वाद्य 'खोल' (Khol) और कांस्य का 'बोर-ताल' (Bor-taal / झांझ) होता है। इसके गीत श्रीमंत शंकरदेव द्वारा रचित 'बोरगीत' (Borgeet) रागों पर आधारित होते हैं।",
            "The Khol (percussion) and Taal (cymbals) are the signature instruments anchoring the rhythmic vitality of Sattriya dance.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q7", "art_1",
            "भरतनाट्यम नृत्य की पारंपरिक प्रस्तुति क्रम (Margam / Performance Repertoire) का सही क्रम कौन-सा है?",
            "What is the standard traditional chronological repertoire (Margam) of a complete solo Bharatanatyam dance recital?",
            listOf("तिल्लाना, पदम, शब्दम, वर्णम, आलारिप्पु", "आलारिप्पु -> जातिस्वरम -> शब्दम -> वर्णम -> पदम -> तिल्लाना (Alarippu -> Jatiswaram -> Shabdam -> Varnam -> Padam -> Tillana / Mangalam)", "वर्णम, आलारिप्पु, तिल्लाना, पदम", "पदम, वर्णम, आलारिप्पु, तिल्लाना"),
            listOf("Tillana, Padam, Shabdam, Varnam, Alarippu", "Alarippu (Invoking blessings) -> Jatiswaram (Nritta) -> Shabdam (Abhinaya debut) -> Varnam (The centerpiece) -> Padam (Slow devotional) -> Tillana (Rhythmic finale)", "Varnam, Alarippu, Tillana, Padam", "Padam, Varnam, Alarippu, Tillana"),
            1,
            "भरतनाट्यम का मार्गम (प्रस्तुति क्रम): 1. आलारिप्पु (पुष्पांजलि/शुरुआत), 2. जातिस्वरम (विशुद्ध लय), 3. शब्दम (भाव की शुरुआत), 4. वर्णम (सबसे कठिन और मुख्य भाग), 5. पदम/जावली (अभिनय), 6. तिल्लाना (तेज गति का समापन) और मंगलम।",
            "The Bharatanatyam Margam moves systematically from pure invocation (Alarippu) through complex drama (Varnam) to ecstatic climax (Tillana).",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q8", "art_1",
            "कथक नृत्य में पैरों के तालबद्ध संचालन (Footwork) और घुंघरुओं की झंकार को क्या कहा जाता है?",
            "In Kathak dance terminology, what is the term used for the intricate rhythmic footwork executed with ankle bells (Ghungroos)?",
            listOf("चक्कर", "तत्कार (Tatkar - Base footwork using syllables: Ta-Thei-Thei-Tat, Aa-Thei-Thei-Tat)", "पढ़ंत (Padhant)", "तोड़ा (Toda)"),
            listOf("Chakkar (Spins)", "Tatkar (Foundational rhythmic footwork producing dynamic micro-beats with metallic ghungroos)", "Padhant (Recitation)", "Toda (Rhythmic composition)"),
            1,
            "कथक में मूल पाद-संचालन को 'तत्कार' (Tatkar) कहते हैं। इसके मूल बोल 'ता थेई थेई तत, आ थेई थेई तत' होते हैं। नर्तक अपने पैरों में 100 से 150 घुंघरू बांधकर विभिन्न तालों (त्रिताल, झपताल) में तत्कार करते हैं।",
            "Tatkar is the rhythmic footwork that forms the foundation of pure rhythmic dance (nritta) in Kathak.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q9", "art_1",
            "प्रसिद्ध नृत्यांगना 'मृणालिनी साराभाई' (Mrinalini Sarabhai) जिन्होंने अहमदाबाद में 'दर्पणा अकादमी ऑफ परफॉर्मिंग आर्ट्स' (1949) की स्थापना की, किस नृत्य की विशेषज्ञ थीं?",
            "Mrinalini Sarabhai (wife of space scientist Dr. Vikram Sarabhai), founder of Darpana Academy in Ahmedabad, was a celebrated exponent of which classical dances?",
            listOf("कथक और ओडिसी", "भरतनाट्यम और कथकली (Bharatanatyam & Kathakali - Padma Bhushan 1992 / Sangeet Natak Akademi Fellow)", "मणिपुरी और सत्रिया", "कुचिपुड़ी और मोहिनीअट्टम"),
            listOf("Kathak & Odissi", "Bharatanatyam and Kathakali (Trained in Switzerland, Shantiniketan, and South India; choreographed over 300 dance dramas)", "Manipuri & Sattriya", "Kuchipudi & Mohiniyattam"),
            1,
            "मृणालिनी साराभाई (1918-2016) भरतनाट्यम और कथकली की विख्यात नृत्यांगना थीं। 1949 में उन्होंने अपने पति डॉ. विक्रम साराभाई के साथ अहमदाबाद में 'दर्पणा अकादमी' की स्थापना की। उनकी पुत्री मल्लिका साराभाई भी प्रसिद्ध नर्तकी हैं।",
            "Mrinalini Sarabhai was a pioneer who bridged classical South Indian dances with contemporary social themes through her Darpana Academy.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q10", "art_1",
            "कुचिपुड़ी नृत्य में 'भामा कलापम' (Bhama Kalapam) किसका एक प्रसिद्ध नृत्य-नाटक है जिसमें भगवान कृष्ण की किस पटरानी के मान और प्रेम का चित्रण होता है?",
            "In Kuchipudi classical repertoire, the masterwork 'Bhama Kalapam' composed by Siddhendra Yogi centers around the pride and devotion of which consort of Lord Krishna?",
            listOf("रुक्मिणी", "सत्यभामा (Queen Satyabhama - Proud and beloved consort of Lord Krishna / Mukha-Abhinaya)", "राधा", "जाम्बवती"),
            listOf("Rukmini", "Satyabhama (Depicts Satyabhama's longing, pride, jealousy, and eventual surrender to Lord Krishna)", "Radha", "Jambavati"),
            1,
            "सिद्धेंद्र योगी द्वारा रचित 'भामा कलापम' कुचिपुड़ी नृत्य का सबसे महत्वपूर्ण नाट्य-प्रसंग है। इसमें रानी सत्यभामा के श्रृंगार, मान (रूठना), विरह और समर्पण का सजीव चित्रण किया जाता है।",
            "Bhama Kalapam is the cornerstone dance-drama of Kuchipudi, famous for its intense emotional range in depicting Satyabhama.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q11", "art_1",
            "ओडिसी नृत्य के पारंपरिक रूप 'गोटीपुआ' (Gotipua) के संदर्भ में कौन-सा कथन सही है?",
            "Which statement correctly describes the 'Gotipua' folk/temple dance tradition of Raghurajpur, Odisha, from which modern Odissi was refined?",
            listOf("यह केवल वृद्ध महिलाओं द्वारा किया जाता है", "यह युवा लड़कों द्वारा महिलाओं के वस्त्र और श्रृंगार पहनकर जगन्नाथ जी के सम्मान में कलाबाजीयुक्त अंग-संचालन से किया जाता है (Young boys dressed as girls performing acrobatics / Bandha Nritya)", "यह केवल युद्ध कला है", "इसमें गायन नहीं होता"),
            listOf("Performed only by senior women", "Performed by young boys dressed as women to praise Lord Jagannath with intricate acrobatic Bandha poses", "Only martial combat", "Instrumental only"),
            1,
            "गोटीपुआ (एकल लड़का) ओडिशा की 16वीं सदी की परंपरा है, जिसमें किशोर लड़के युवतियों की तरह सजकर जगन्नाथ जी के सामने कलाबाजी और नृत्य प्रस्तुत करते हैं। गुरु केलुचरण महापात्र स्वयं बचपन में गोटीपुआ नर्तक थे।",
            "Gotipua is the precursor to modern Odissi, performed by young boys dressed in female costume executing acrobatic figures.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q12", "art_1",
            "मणिपुरी नृत्य के प्रमुख उप-रूप 'पुंग चोलोम' (Pung Cholom) में नर्तक किस वाद्य यंत्र को बजाते हुए हवा में कलाबाजियां और छलांग लगाते हैं?",
            "In the Manipuri dance tradition 'Pung Cholom' (Drum Dance), which traditional percussion instrument is played by acrobatic dancers while leaping in mid-air?",
            listOf("तबला", "पुंग / मणिपुरी मृदंग (Pung - Cylindrical wooden hand drum played with fingers and palms during acrobatic jumps)", "खोल", "धोलक"),
            listOf("Tabla", "Pung (Traditional Manipuri hand drum; performers combine vigorous jumps and spirals while maintaining complex tala)", "Khol", "Dholak"),
            1,
            "पुंग चोलोम मणिपुरी नृत्य का बेहद ऊर्जावान ड्रम नृत्य है। इसमें नर्तक 'पुंग' (मणिपुरी मृदंग) को गले में लटकाकर बजाते हुए हवा में कलाबाजियां, घूर्णन और छलांग लगाते हैं।",
            "Pung Cholom is a dynamic Manipuri percussion dance combining acrobatics, martial agility, and precise rhythmic drumming.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q13", "art_1",
            "शास्त्रीय नृत्य में 'अभिनय' (Abhinaya) के चार प्रमुख प्रकार कौन-से हैं जिनका वर्णन भरत मुनि के नाट्यशास्त्र में किया गया है?",
            "According to Bharata Muni's Natya Shastra, what are the four fundamental forms of 'Abhinaya' (Expression/Communication) in Indian classical dance?",
            listOf("राग, ताल, स्वर, लय", "आंगिक (शरीर), वाचिक (वाणी/गीत), आहार्य (वेशभूषा/श्रृंगार) और सात्विक (मनोभाव/अश्रु-रोमांच) / Angika, Vachika, Aharya, Sattvika", "दृष्टि, ग्रीवा, पद, हस्त", "तांडव, लास्य, नृत्त, नट्य"),
            listOf("Raga, Tala, Swara, Laya", "Angika (Bodily movement), Vachika (Verbal speech/lyrics), Aharya (Costume/makeup), and Sattvika (Involuntary emotional states like tears/trembling)", "Drishti, Greeva, Pada, Hasta", "Tandava, Lasya, Nritta, Natya"),
            1,
            "अभिनय के 4 अंग: 1. आंगिक (अंगों, हस्तमुद्राओं और दृष्टि से अभिव्यक्ति), 2. वाचिक (वाणी, संवाद और गीत), 3. आहार्य (वेशभूषा, आभूषण और रूप-सज्जा), 4. सात्विक (आंतरिक स्वाभाविक मनोभाव जैसे रोमांच, पसीना, अश्रु)।",
            "The fourfold Abhinaya represents the holistic expression spectrum enabling the dancer to evoke Rasa in the spectator.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q14", "art_1",
            "भगवान शिव के उग्र और संहारक नृत्य को 'तांडव' (Tandava) कहा जाता है, जबकि देवी पार्वती के कोमल, सौम्य और श्रृंगारिक नृत्य को क्या कहा जाता है?",
            "While Lord Shiva's masculine and cosmic destruction dance is called 'Tandava', what is the gentle, graceful, and feminine dance of Goddess Parvati called?",
            listOf("नृत्त", "लास्य (Lasya - Gentle, lyrical, graceful, and romantic feminine dance form / Associated with Goddess Parvati)", "नाट्य", "अभिनय"),
            listOf("Nritta", "Lasya (Characterized by gentle gestures, lyrical melodies, graceful sways, and romantic Bhava)", "Natya", "Abhinaya"),
            1,
            "भारतीय शास्त्रीय नृत्य दो मूल धाराओं पर आधारित है: 'तांडव' (शिव का ओजस्वी, पौरुष व गतिशील नृत्य) और 'लास्य' (पार्वती का कोमल, श्रृंगारिक, सौम्य व नारीसुलभ नृत्य)। मोहिनीअट्टम और ओडिसी लास्य प्रधान हैं जबकि कथकली में तांडव का प्रभाव है।",
            "Tandava and Lasya are the dual cosmic polarities of Indian classical dance, representing masculine energy and feminine grace.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_1_m6_q15", "art_1",
            "कथकली नृत्य में चेहरे पर हरा रंग (Paccha) किस प्रकार के पात्रों का प्रतीक होता है?",
            "In the color symbolism of Kathakali makeup (Vesham), what character trait is represented by the pure green face paint ('Paccha')?",
            listOf("राक्षसी और तामसिक स्वभाव", "सात्विक, कुलीन, वीर और दिव्य नायक (Noble, virtuous heroes and divine beings like Rama, Arjuna, Krishna, Nala)", "धूर्त और कपटी खलनायक (Kathi)", "ऋषि और तपस्वी (Minukku)"),
            listOf("Demonic nature", "Virtuous, noble characters, divine kings, and gods (Paccha symbolizes moral purity and royal divinity)", "Villainous characters", "Hermits and sages"),
            1,
            "कथकली में 'पच्चा' (हरा रंग) सात्विक और दिव्य नायकों (राम, अर्जुन, कृष्ण, नल) का प्रतीक है। 'कत्ती' (हरा + लाल चाकू) अहंकारी खलनायकों (रावण, दुर्योधन) का, और 'करी' (काला) शूर्पणखा जैसी राक्षसी प्रवृत्तियों का प्रतीक है।",
            "Paccha is the radiant green face paint in Kathakali worn by noble kings and deities signifying righteousness and sattvic qualities.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_1", 7, 10, baseQuestions)
    }
}
