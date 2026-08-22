package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic7Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeArtCultureQ(
            "art_7_m1_q1", "art_7",
            "भारत सरकार द्वारा अब तक कितनी भाषाओं को 'शास्त्रीय भाषा' (Classical Language) का आधिकारिक दर्जा दिया गया है, जिसमें अक्टूबर 2024 में 5 नई भाषाएं जोड़ी गईं?",
            "How many Indian languages have been officially recognized as 'Classical Languages' by the Government of India, following the landmark cabinet approval of 5 new languages in October 2024?",
            listOf("6 भाषाएं", "11 भाषाएं (11 Classical Languages - Tamil, Sanskrit, Kannada, Telugu, Malayalam, Odia + Marathi, Pali, Prakrit, Assamese, Bengali in Oct 2024)", "8 भाषाएं", "22 भाषाएं"),
            listOf("6 languages (Previous total)", "11 Languages (Tamil - 2004, Sanskrit - 2005, Kannada - 2008, Telugu - 2008, Malayalam - 2013, Odia - 2014; + Marathi, Pali, Prakrit, Assamese & Bengali approved in Oct 2024)", "8 languages", "22 languages (8th Schedule)"),
            1,
            "भारत में अब कुल 11 शास्त्रीय भाषाएं हैं: 1. तमिल (2004 - पहली), 2. संस्कृत (2005), 3. कन्नड़ (2008), 4. तेलुगु (2008), 5. मलयालम (2013), 6. ओडिया (2014) और 3 अक्टूबर 2024 को जोड़ी गई 5 नई भाषाएं: 7. मराठी, 8. पाली, 9. प्राकृत, 10. असमिया, 11. बंगाली।",
            "India now officially accords Classical Language status to 11 ancient tongues meeting strict criteria of high antiquity, rich literature, and original heritage.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q2", "art_7",
            "भारत का सर्वोच्च साहित्यिक सम्मान 'ज्ञानपीठ पुरस्कार' (Jnanpith Award - 1965 से प्रारंभ) पाने वाले पहले व्यक्ति कौन थे और उन्हें किस मलयालम कृति के लिए यह पुरस्कार मिला?",
            "Who was the inaugural recipient of India's highest literary honor, the Jnanpith Award, in 1965 for his anthology of Malayalam poems titled 'Odakkuzhal' (The Bamboo Flute)?",
            listOf("ताराशंकर बंद्योपाध्याय (बंगाली)", "जी. शंकर कुरुप / महाकवि जी. शंकर कुरुप (G. Sankara Kurup - 1965 / Malayalam poetry 'Odakkuzhal' / Bronze replica of Saraswati)", "उमाशंकर जोशी (गुजराती)", "सुमित्रानंदन पंत (हिंदी)"),
            listOf("Tarasankar Bandyopadhyay (Bengali)", "G. Sankara Kurup (Renowned Malayalam poet; awarded the first Jnanpith Award in 1965 with a cash prize and bronze replica of Vagdevi Saraswati)", "Umashankar Joshi (Gujarati)", "Sumitranandan Pant (Hindi - 1968)"),
            1,
            "जी. शंकर कुरुप (1901-1978, केरल) ने 1965 में पहला ज्ञानपीठ पुरस्कार अपनी मलयालम कविता संग्रह 'ओडक्कुझल' (बांसुरी) के लिए जीता था। भारतीय ज्ञानपीठ न्यास (साहू शांति प्रसाद जैन परिवार) द्वारा यह पुरस्कार संविधान की 8वीं अनुसूची की 22 भाषाओं + अंग्रेजी में दिया जाता है।",
            "G. Sankara Kurup made history as the first laureate of the prestigious Jnanpith Award for his transcendent Malayalam nature poetry.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q3", "art_7",
            "हिंदी साहित्य में 'ज्ञानपीठ पुरस्कार' (1968) प्राप्त करने वाले प्रथम लेखक कौन थे जिन्हें उनके प्रसिद्ध काव्य संग्रह 'चिदंबरा' के लिए यह सम्मान मिला?",
            "Who was the first Hindi author to be awarded the prestigious Jnanpith Award in 1968 for his masterwork anthology 'Chidambara'?",
            listOf("रामधारी सिंह 'दिनकर' (उर्वशी - 1972)", "सुमित्रानंदन पंत (Sumitranandan Pant - 1968 Jnanpith for 'Chidambara' / Chhayavadi poet of nature / 'Prakriti ke Sukumar Kavi')", "सूर्यकांत त्रिपाठी 'निराला'", "महादेवी वर्मा (यामा - 1982)"),
            listOf("Ramdhari Singh 'Dinkar' (Urvashi - 1972)", "Sumitranandan Pant (Renowned Chhayavada poet from Kausani, Uttarakhand; known as the 'Gentle Poet of Nature')", "Suryakant Tripathi 'Nirala'", "Mahadevi Varma (Yama - 1982)"),
            1,
            "सुमित्रानंदन पंत (1900-1977, कौसानी, उत्तराखंड) छायावाद के चार स्तंभों (प्रसाद, पंत, निराला, महादेवी) में से एक थे। 1968 में उनकी कृति 'चिदंबरा' के लिए उन्हें हिंदी का पहला ज्ञानपीठ पुरस्कार मिला।",
            "Sumitranandan Pant was an iconic lyrical poet whose romantic sensibilities and environmental philosophy transformed modern Hindi verse.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q4", "art_7",
            "प्राचीन संस्कृत व्याकरण का सबसे प्रामाणिक और वैज्ञानिक ग्रंथ 'अष्टाध्यायी' (Ashtadhyayi - 8 अध्यायों में लगभग 4000 सूत्र) 5वीं-6वीं शताब्दी ईसा पूर्व में किसके द्वारा रचा गया था?",
            "Which ancient Indian grammarian and scholar from Salatura (Gandhara) composed the foundational treatise on Sanskrit phonetics and generative grammar titled 'Ashtadhyayi'?",
            listOf("पतंजलि (महाभाष्य)", "महर्षि पाणिनि (Maharshi Panini - c. 5th-6th Century BCE / 'Father of Linguistics' / Ashtadhyayi & Shiva Sutras)", "कात्यायन (वार्तिक)", "यास्क (निरुक्त)"),
            listOf("Patanjali (Mahabhashya)", "Panini (Universal Father of Linguistics; established a rule-based generative formal language system anticipating modern computer science syntax)", "Katyayana (Varttika)", "Yaska (Nirukta)"),
            1,
            "महर्षि पाणिनि (गांधार/शलातुर) ने 'अष्टाध्यायी' (8 अध्याय, 3959 सूत्र) की रचना की। यह विश्व का सबसे प्राचीन, पूर्ण और वैज्ञानिक व्याकरण ग्रंथ है। आधुनिक भाषाविदों (नोम चॉम्स्की) ने स्वीकार किया है कि पाणिनि के सूत्र आधुनिक कंप्यूटर प्रोग्रामिंग भाषाओं (BNF) जैसे हैं।",
            "Panini's Ashtadhyayi is an intellectual masterpiece of formal linguistic analysis and rule-based phonetic engineering.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q5", "art_7",
            "संस्कृत के महानतम महाकवि और नाटककार 'कालिदास' (भारत के शेक्सपियर) द्वारा रचित विश्वविख्यात नाटक 'अभिज्ञानशाकुंतलम्' का पहली बार 1789 में अंग्रेजी में अनुवाद किसने किया था?",
            "Who was the British orientalist and founder of the Asiatic Society of Bengal who first translated Kalidasa's masterpiece play 'Abhijnanashakuntalam' into English in 1789?",
            listOf("जेम्स प्रिंसेप", "सर विलियम जोन्स (Sir William Jones - 1789 English translation 'Sacontalá, or The Fatal Ring' / Asiatic Society 1784)", "मैक्स मूलर", "चार्ल्स विल्किंस (भगवद्गीता का अनुवाद 1785)"),
            listOf("James Prinsep", "Sir William Jones (Supreme Court judge and pioneering philologist who introduced Indian Sanskrit drama to European intellectuals like Goethe)", "Max Müller", "Charles Wilkins (First English Gita translation in 1785)"),
            1,
            "सर विलियम जोन्स ने 1789 में कालिदास के 'अभिज्ञानशाकुंतलम्' का अंग्रेजी में अनुवाद किया, जिससे जर्मन कवि गेटे (Goethe) अत्यंत प्रभावित हुए। कालिदास गुप्त सम्राट चंद्रगुप्त द्वितीय 'विक्रमादित्य' के नवरत्नों में से एक थे। अन्य कृतियां: मेघदूतम्, रघुवंशम्, कुमारसंभवम्, मालविकाग्निमित्रम्।",
            "Sir William Jones's translation of Abhijnanashakuntalam unveiled the emotional depth of ancient Indian classical drama to Western civilization.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q6", "art_7",
            "तमिल भाषा का सबसे प्राचीन उपलब्ध व्याकरण ग्रंथ कौन-सा है जो 'संगम साहित्य' (Sangam Literature) का सबसे महत्वपूर्ण आधार स्तंभ है?",
            "Which is the oldest extant literary and grammatical work in the Tamil language, attributed to Sage Tolkappiyar and serving as the bedrock of Sangam literature?",
            listOf("शिलप्पादिकारम", "तोल्काप्पियम (Tolkappiyam - Authored by Tolkappiyar / 3 Books: Ezhuttu, Col, Porul / Earliest Tamil treatise on grammar & poetics)", "मणिमेखलै", "तिरुक्कुरल"),
            listOf("Silappadikaram", "Tolkappiyam (Composed during the Second Sangam; systematically analyzes phonology, morphology, semantics, and social conventions/Akam & Puram)", "Manimekalai", "Tirukkural"),
            1,
            "तोल्काप्पियम (ऋषि तोल्काप्पियर द्वारा रचित) तमिल भाषा का सबसे प्राचीन उपलब्ध ग्रंथ है। इसमें 3 खंड हैं: 1. एलुट्टु (ध्वनि/वर्ण), 2. सोल (शब्द/व्याकरण), 3. पोरुल (काव्य, प्रेम और युद्ध परंपराएं)। यह संगम युग के समाज का दर्पण है।",
            "Tolkappiyam is an monumental ancient linguistic treatise that codified classical Tamil grammar, meters, and cultural aesthetics.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q7", "art_7",
            "तमिल साहित्य के 'पंच महाकाव्य' (Five Great Epics of Tamil Literature) में से सबसे पहला और प्रसिद्ध महाकाव्य 'शिलप्पादिकारम' (Silappadikaram - नूपुर की कहानी) किसके द्वारा रचा गया था?",
            "Who was the Jain prince-poet who composed 'Silappadikaram' (The Tale of the Anklet), the earliest and most celebrated among the Five Great Epics of Tamil literature, featuring the heroic Kannagi?",
            listOf("सीथलै सतनार (मणिमेखलै)", "इलांगो आदिगल (Ilango Adigal - Jain prince of Chera dynasty / Silappadikaram / Kannagi, Kovalan & Madhavi / Pattini cult)", "तिरुवल्लुवर", "कंबन"),
            listOf("Seethalai Sathanar (Author of Manimekalai)", "Ilango Adigal (Brother of Chera King Senguttuvan; tells the tragic story of Kannagi whose righteous fury burnt Madurai after wrongful execution of husband Kovalan)", "Thiruvalluvar", "Kamban"),
            1,
            "शिलप्पादिकारम (नूपुर की कहानी) चेर राजकुमार इलांगो आदिगल द्वारा रचित पहला तमिल महाकाव्य है। इसमें कोवलन की निर्दोष हत्या पर उसकी पतिव्रता पत्नी 'कन्नगी' द्वारा अपने नूपुर (पायल) से सत्य साबित करने और पूरे मदुरै शहर को भस्म करने की अमर गाथा है।",
            "Silappadikaram is Tamil literature's supreme epic of tragic injustice, feminine moral power, and the establishment of the Kannagi / Pattini cult.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q8", "art_7",
            "तमिल संस्कृति के सबसे महान नीतिपरक ग्रंथ 'तिरुक्कुरल' (Tirukkural - 1330 दोहे / कुराल) के रचयिता कौन हैं जिन्हें 'तमिल का वेद' माना जाता है?",
            "Who is the venerated ancient Tamil poet-philosopher who composed the universally celebrated ethical masterpiece 'Tirukkural' (divided into Aram, Porul, and Inbam)?",
            listOf("इलांगो आदिगल", "संत तिरुवल्लुवर (Saint Thiruvalluvar - Author of Tirukkural / 133 Chapters & 1330 Couplets / Universal ethical guide)", "अव्वैयार", "सुब्रमण्य भारती"),
            listOf("Ilango Adigal", "Thiruvalluvar (Composed 1,330 couplets covering Dharma/Virtue, Artha/Wealth, and Kama/Love; revered as the secular ethical Bible of Tamil culture)", "Avvaiyar", "Subramania Bharati"),
            1,
            "संत तिरुवल्लुवर द्वारा रचित 'तिरुक्कुरल' तमिल भाषा का सर्वाधिक अनुवादित और सम्मानित ग्रंथ है। इसमें 133 अध्याय और 1330 कुराल (दोहे) हैं जो बिना किसी जाति, पंथ या धर्म के भेदभाव के सदाचार, न्याय, राजनीति और प्रेम की शिक्षा देते हैं। कन्याकुमारी में उनकी 133 फीट ऊंची प्रतिमा स्थित है।",
            "The Tirukkural is a universal beacon of humanistic ethics and statecraft, celebrated across world literature for timeless moral wisdom.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q9", "art_7",
            "भारतीय दर्शन की 'षड्दर्शन' (Six Orthodox Schools of Indian Philosophy - Astika Darshana) में कौन-से छह दर्शन शामिल हैं?",
            "What are the six orthodox schools of classical Indian philosophy (Shad Darshanas) that accept the foundational authority of the Vedas?",
            listOf("बौद्ध, जैन, चार्वाक, आजीवक, लोकायत और सांख्य", "सांख्य (कपिल), योग (पतंजलि), न्याय (गौतम), वैशेषिक (कणाद), मीमांसा (जैमिनी) और वेदांत (बादरायण) / Sankhya, Yoga, Nyaya, Vaisheshika, Mimamsa & Vedanta", "अद्वैत, द्वैत, विशिष्टाद्वैत, शुद्धाद्वैत, द्वैताद्वैत और अचिंत्य भेदाभेद", "आस्तिक, नास्तिक, भौतिक, तांत्रिक, वैदिक और औपनिषदिक"),
            listOf("Buddhism, Jainism, Charvaka, Ajivika, Lokayata, Sankhya", "Sankhya (Sage Kapila), Yoga (Patanjali), Nyaya (Akshapada Gautama), Vaisheshika (Kanada - Atomic theory), Purva Mimamsa (Jaimini), and Uttara Mimamsa/Vedanta (Badarayana)", "Advaita, Dvaita, Vishishtadvaita", "Vedic, Tantric, Astika"),
            1,
            "भारतीय आस्तिक दर्शन के 6 संप्रदाय (षड्दर्शन): 1. सांख्य (ऋषि कपिल - प्रकृति व पुरुष), 2. योग (महर्षि पतंजलि - अष्टांग योग), 3. न्याय (महर्षि गौतम - तर्क व प्रमाण), 4. वैशेषिक (ऋषि कणाद - परमाणुवाद), 5. मीमांसा (ऋषि जैमिनी - वैदिक कर्मकांड), 6. वेदांत (महर्षि बादरायण - उपनिषद व ब्रह्म सूत्र)।",
            "The Shad Darshanas represent India's profound philosophical heritage analyzing metaphysics, epistemology, atomism, and liberation.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q10", "art_7",
            "8वीं शताब्दी में 'अद्वैत वेदांत' (Advaita Vedanta - 'ब्रह्म सत्यं जगन्मिथ्या जीवो ब्रह्मैव नापरः') दर्शन का प्रतिपादन कर भारत के चारों कोनों में 4 प्रमुख मठों की स्थापना किसने की थी?",
            "Which 8th-century philosopher-reformer from Kalady (Kerala) consolidated the doctrine of Advaita Vedanta (Non-Dualism) and established four cardinal monastic centers (Mathas) across India?",
            listOf("रामानुजाचार्य (विशिष्टाद्वैत)", "आदि शंकराचार्य (Adi Shankaracharya - 788 to 820 CE / Advaita Vedanta / Sringeri, Puri, Dwarka, Badrinath Mathas / Dashanami Sannyasis)", "माधवाचार्य (द्वैत)", "वल्लभाचार्य (शुद्धाद्वैत)"),
            listOf("Ramanujacharya", "Adi Shankara (Revitalized Sanatana Dharma; composed Vivekachudamani and commentaries/Bhashyas on Prasthanatrayi: Upanishads, Bhagavad Gita & Brahma Sutras)", "Madhvacharya", "Vallabhacharya"),
            1,
            "आदि शंकराचार्य (कालड़ी, केरल) ने अद्वैत दर्शन दिया कि जीव और ब्रह्म में कोई भेद नहीं है। उन्होंने भारत की सांस्कृतिक एकता के लिए 4 पीठ स्थापित किए: 1. श्रृंगेरी (दक्षिण - कर्नाटक), 2. गोवर्धन पुरी (पूर्व - ओडिशा), 3. द्वारका शारदा पीठ (पश्चिम - गुजरात), 4. ज्योतिर्मठ बद्रीनाथ (उत्तर - उत्तराखंड)।",
            "Adi Shankaracharya was an intellectual luminary who unified India's spiritual topography through rigorous Vedic dialectics.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q11", "art_7",
            "11वीं-12वीं शताब्दी के महान वैष्णव संत 'रामानुजाचार्य' (Ramanujacharya) जिन्होंने 'विशिष्टाद्वैत' (Qualified Non-dualism) का प्रतिपादन किया, की 216 फीट ऊंची 'समानता की प्रतिमा' (Statue of Equality) कहाँ स्थित है?",
            "Where was the colossal 216-foot-tall 'Statue of Equality' (Panchaloha alloy statue honoring Vaishnavite philosopher Ramanujacharya, proponent of Vishishtadvaita) unveiled by PM Narendra Modi in February 2022?",
            listOf("श्रीरंगम, तमिलनाडु", "मुचिन्तल, शमशाबाद, हैदराबाद, तेलंगाना (Muchintal, Hyderabad, Telangana - Statue of Equality / 216 ft sitting posture / 108 Divya Desams replica)", "कांचीपुरम", "तिरुपति"),
            listOf("Srirangam, Tamil Nadu", "Hyderabad (Muchintal), Telangana (Second tallest sitting metal statue in the world, celebrating Ramanujacharya's radical egalitarianism and Bhakti reforms)", "Kanchipuram", "Tirupati"),
            1,
            "रामानुजाचार्य (1017-1137, पेरुम्बुदूर) ने विशिष्टाद्वैत दर्शन दिया और सभी जातियों को मंदिर प्रवेश व 'ॐ नमो नारायणाय' मंत्र की दीक्षा देकर सामाजिक समानता का संदेश दिया। फरवरी 2022 में हैदराबाद (मुचिन्तल) में उनकी 216 फीट ऊंची 'स्टैच्यू ऑफ इक्वेलिटी' का अनावरण हुआ।",
            "Ramanujacharya was a towering Vaishnava saint whose philosophy synthesized rigorous Upanishadic monism with compassionate devotional surrender (Prapatti).",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q12", "art_7",
            "12वीं शताब्दी में कश्मीर के प्रसिद्ध कवि 'कल्हण' (Kalhana) द्वारा संस्कृत में रचित ऐतिहासिक ग्रंथ 'राजतरंगिणी' (Rajatarangini - राजाओं की नदी) में कहाँ के राजाओं का क्रमबद्ध इतिहास दर्ज है?",
            "Kalhana's celebrated 12th-century Sanskrit chronicle 'Rajatarangini' (literally 'River of Kings' / 8 Tarangas and 7826 verses) provides the first authentic chronological history of which region of India?",
            listOf("बंगाल के पाल वंश का", "कश्मीर का क्रमबद्ध इतिहास (Chronological History of Kashmir from mythological times to 12th Century King Jayasimha / First scientific Indian historian)", "मगध साम्राज्य का", "विजयनगर का"),
            listOf("Bengal Pala Dynasty", "Kashmir (Pioneered objective historiography using ancient inscriptions, royal charters, and numismatic coins; completed in 1148-1150 CE under King Jayasimha)", "Magadha Empire", "Vijayanagara"),
            1,
            "कल्हण की 'राजतरंगिणी' (1148-1150 ईस्वी) भारतीय इतिहास लेखन का पहला प्रामाणिक और निष्पक्ष ग्रंथ माना जाता है। इसमें कश्मीर के महाभारत कालीन राजा गोनंद प्रथम से लेकर 12वीं सदी के राजा जयसिंह तक का इतिहास 8 तरंगों (अध्यायों) में काव्यात्मक रूप में वर्णित है।",
            "Kalhana is hailed as India's first scientific historian for setting objective historical criteria free from bias and sycophancy.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q13", "art_7",
            "प्रसिद्ध 'पंचतंत्र' (Panchatantra - पशु-पक्षियों के माध्यम से राजनीति और व्यावहारिक ज्ञान सिखाने वाली नीति कथाएं) की रचना प्राचीन काल में किसके द्वारा की गई थी?",
            "Who was the ancient Indian scholar who composed the timeless collection of interrelated animal fables and moral statecraft titled 'Panchatantra' for teaching three dull princes?",
            listOf("नारायण पंडित (हितोपदेश)", "पंडित विष्णु शर्मा (Pandit Vishnu Sharma - 3rd Century BCE / 5 Tantras: Mitra-bheda, Mitra-labha, Kakolukiyam, Labdhapranasam, Apariksitakarakam)", "सोमदेव (कथासरित्सागर)", "गुणाढ्य (बृहत्कथा)"),
            listOf("Narayana Pandita (Hitopadesha)", "Pandit Vishnu Sharma (Composed under King Amarasakti of Mahilaropya; translated into Arabic as 'Kalila wa Dimna' and into over 50 world languages)", "Somadeva (Kathasaritsagara)", "Gunadhya (Brihatkatha)"),
            1,
            "पंडित विष्णु शर्मा ने 'पंचतंत्र' (5 तंत्र: मित्रभेद, मित्रलाभ, काकोलूकीयम्, लब्धप्रणाशम् और अपरीक्षितकारकम्) की रचना की। यह बाइबिल के बाद दुनिया में सबसे अधिक भाषाओं (50+ भाषाओं में 200+ अनुवाद) में अनुवादित होने वाली पुस्तक है। अरब में इसे 'कलीला व दिमना' नाम से जाना गया।",
            "The Panchatantra is humanity's most widely traveled anthology of practical wisdom, diplomacy, and political psychology.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q14", "art_7",
            "हिंदी साहित्य का प्रथम महाकाव्य 'पृथ्वीराज रासो' (Prithviraj Raso - 69 समय/सर्ग) किसके द्वारा रचित माना जाता है जो सम्राट पृथ्वीराज चौहान के दरबारी कवि और मित्र थे?",
            "Which heroic epic poem in Braj Bhasha/Pingal, celebrating the chivalry, romance, and battles of Chauhan King Prithviraj III, was composed by his court poet Chand Bardai?",
            listOf("जगनिक (आल्हा-खंड)", "चंदबरदाई (Chand Bardai - Court poet of Prithviraj Chauhan / Prithviraj Raso / 'Char bans chaubis gaj angul asht praman')", "नरपति नाल्ह (बीसलदेव रासो)", "दलपत विजय"),
            listOf("Jagnik (Aalha-Khand)", "Chand Bardai (First epic poet of Hindi literature; accompanied Prithviraj to Ghazni; authored famous poetic measure directing arrow at Ghori)", "Narpati Nalha", "Dalpat Vijay"),
            1,
            "चंदबरदाई (1149-1200) को हिंदी का प्रथम महाकवि और 'पृथ्वीराज रासो' को हिंदी का प्रथम महाकाव्य माना जाता है (आचार्य रामचंद्र शुक्ल अनुसार)। इसमें 'चार बांस चौबीस गज, अंगुल अष्ट प्रमाण। ता ऊपर सुल्तान है, मत चूको चौहान' का प्रसिद्ध प्रसंग वर्णित है।",
            "Prithviraj Raso is a foundational monument of early Hindi bardic poetry and Rajput chivalric romance.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_7_m1_q15", "art_7",
            "16वीं शताब्दी में गोस्वामी तुलसीदास जी द्वारा अवधी भाषा में रचित अमर ग्रंथ 'श्रीरामचरितमानस' में कुल कितने काण्ड (सर्ग) हैं और उनका सही क्रम क्या है?",
            "How many Kandas (books/sections) comprise Goswami Tulsidas's monumental 16th-century Awadhi masterpiece 'Ramcharitmanas', and what is their precise sequential order?",
            listOf("5 काण्ड", "7 काण्ड: बालकाण्ड -> अयोध्याकाण्ड -> अरण्यकाण्ड -> किष्किन्धाकाण्ड -> सुंदरकाण्ड -> लंकाकाण्ड (युद्धकाण्ड) -> उत्तरकाण्ड / 7 Kandas (Bala, Ayodhya, Aranya, Kishkindha, Sundara, Lanka, Uttara)", "9 काण्ड", "12 काण्ड"),
            listOf("5 Kandas", "7 Kandas: Balakanda (Longest) -> Ayodhyakanda -> Aranyakanda -> Kishkindhakanda (Shortest) -> Sundarakanda -> Lankakanda (Yuddhakanda) -> Uttarakanda", "9 Kandas", "12 Kandas"),
            1,
            "गोस्वामी तुलसीदास जी ने संवत 1631 (1574 ईस्वी) में अयोध्या में रामनवमी पर 'श्रीरामचरितमानस' लिखना प्रारंभ किया जो 2 वर्ष 7 महीने 26 दिन में पूर्ण हुआ। इसमें कुल 7 काण्ड (बाल, अयोध्या, अरण्य, किष्किन्धा, सुंदर, लंका, उत्तर काण्ड) और दोहा-चौपाई छंद हैं।",
            "The Ramcharitmanas of Tulsidas is the crowning spiritual and literary epic of Awadhi literature, shaping North Indian religious ethos.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_7", 2, 5, baseQuestions)
    }
}
