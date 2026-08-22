package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic4Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeArtCultureQ(
            "art_4_m1_q1", "art_4",
            "बिहार के मिथिला क्षेत्र (मधुबनी, दरभंगा) की कौन-सी विश्वप्रसिद्ध लोक चित्रकला उंगलियों, टहनियों, माचिस की तीलियों और प्राकृतिक रंगों से बनाई जाती है (GI Tag)?",
            "Which world-famous folk painting tradition from Bihar's Mithila region is traditionally created by women on mud walls and handmade paper using natural pigments (GI Tagged)?",
            listOf("मंजूषा चित्रकला", "मधुबनी चित्रकला / मिथिला पेंटिंग (Madhubani / Mithila Painting - Bihar / GI Tag / Bhitichitra & Aripana / Padma Shri Sita Devi & Mahasundari Devi)", "पट्टचित्र", "कलमकारी"),
            listOf("Manjusha Art", "Madhubani Painting (Features themes of Hindu deities, nature, sun, moon, and bamboo tree; styles include Bharni, Katchni, Tantrik)", "Pattachitra", "Kalamkari"),
            1,
            "मधुबनी (मिथिला) पेंटिंग बिहार की प्राचीन लोक चित्रकला है। इसमें चावल के पेस्ट और प्राकृतिक रंगों से रेखाचित्र बनाए जाते हैं। प्रसिद्ध कलाकार: सीता देवी, महासुंदरी देवी, गंगा देवी, दुलारी देवी (पद्म श्री 2021)।",
            "Madhubani art is characterized by eye-catching geometrical patterns depicting mythological deities, flora, fauna, and royal wedding scenes.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q2", "art_4",
            "महाराष्ट्र के ठाणे और पालघर जिलों के आदिवासियों द्वारा गोबर और लाल मिट्टी से लिपी दीवारों पर सफेद चावल के लेप से त्रिकोण और वृत्तों के संयोजन से बनाई जाने वाली प्रसिद्ध चित्रकला कौन-सी है?",
            "Which iconic tribal painting of Maharashtra (Thane/Palghar) uses simple geometric shapes (circle, triangle, square) made of white rice paste on ochre mud walls to depict community rituals?",
            listOf("पिथोरा पेंटिंग", "वरली चित्रकला (Warli Painting - Maharashtra / Tribal art / Jivya Soma Mashe / 'Tarpa Dance' circle)", "गोंड चित्रकला", "कालीघाट पेंटिंग"),
            listOf("Pithora Painting", "Warli Painting (Created by Warli tribe; Jivya Soma Mashe popularized it globally; depicts daily village life and harvest celebration)", "Gond Art", "Kalighat Painting"),
            1,
            "वरली चित्रकला महाराष्ट्र की वरली जनजाति की 2500+ वर्ष पुरानी भित्ति चित्रकला है। इसमें वृत्त (सूर्य/चंद्र), त्रिभुज (पहाड़/पेड़) और चौकोर (चौक/पवित्र बाड़ा) से जीवन का चक्र दर्शाया जाता है। जीव्या सोमा मशे (पद्म श्री 2011) इसके प्रख्यात कलाकार थे।",
            "Warli painting is celebrated for its minimalist aesthetic depicting mother nature and communal harmony without mythological deities.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q3", "art_4",
            "ओडिशा और पश्चिम बंगाल की प्रसिद्ध पारंपरिक 'कपड़े पर चित्रकारी' (Cloth-based Scroll Painting) कौन-सी है जो भगवान जगन्नाथ और कृष्ण लीला के प्रसंगों पर आधारित होती है?",
            "Which ancient scroll painting tradition on specially treated cloth (Patta) originates in Raghurajpur, Odisha, depicting Lord Jagannath, Balabhadra, and Subhadra?",
            listOf("मधुबनी", "पट्टचित्र (Pattachitra - Odisha & West Bengal / 'Patta' = Canvas, 'Chitra' = Picture / GI Tag / Raghurajpur Heritage Village)", "तंजौर पेंटिंग", "फाड़ चित्रकला"),
            listOf("Madhubani", "Pattachitra (Rooted in Jagannath temple tradition; uses stone/mineral colors and tamarind seed gum on cotton cloth coated with chalk)", "Tanjore Painting", "Phad Painting"),
            1,
            "पट्टचित्र (पट्ट = कपड़ा, चित्र = पेंटिंग) ओडिशा के रघुराजपुर हेरिटेज विलेज की 1000 वर्ष पुरानी कला है। जगन्नाथ मंदिर के 'अणवसर' काल में जब भगवान एकांतवास में होते हैं तो पट्टचित्रों की पूजा की जाती है।",
            "Pattachitra is famous for its intricate line drawings, brilliant natural colors, and disciplined decorative floral borders.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q4", "art_4",
            "आंध्र प्रदेश की कौन-सी प्रसिद्ध हस्तकला सूती कपड़े पर इमली की कलम (बांस की नुकीली छड़ी) और प्राकृतिक रंगों से हिंदू पौराणिक कथाओं के चित्रण के लिए जानी जाती है?",
            "Which GI-tagged textile and hand-painted art form of Andhra Pradesh derives its name from the Persian words for 'Pen' (Kalam) and 'Craftsmanship' (Kari)?",
            listOf("इकात", "कलमकारी (Kalamkari - Andhra Pradesh / Srikalahasti & Machilipatnam styles / Srikalahasti = Freehand temple art, Machilipatnam = Block printing)", "बाटिक", "अजरक"),
            listOf("Ikat", "Kalamkari (Practiced at Srikalahasti - using bamboo pen for temple murals, and Machilipatnam - using carved wooden blocks with vegetable dyes)", "Batik", "Ajrakh"),
            1,
            "कलमकारी (कलम + कारी = कलम से किया गया काम) आंध्र प्रदेश की 3000 वर्ष पुरानी कला है। इसके दो मुख्य केंद्र हैं: श्रीकालहस्ती शैली (हाथ से कलम द्वारा मंदिर भित्ति चित्र) और मछलीपट्टनम शैली (लकड़ी के नक्काशीदार ब्लॉक्स से छपाई)।",
            "Kalamkari is a magnificent textile painting tradition utilizing pure organic dyes like indigo, turmeric, and madder.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q5", "art_4",
            "तमिलनाडु के तंजावुर की कौन-सी समृद्ध चित्रकला शैली सोने के पतले वर्क (22 कैरेट गोल्ड फॉयल), कीमती रत्नों/कांच के पत्थरों और लकड़ी के तख्ते पर उभरी हुई नक्काशी (Gesso work) के लिए विश्वप्रसिद्ध है?",
            "Which opulent South Indian painting style from Tamil Nadu is distinguished by real 22-karat Gold Foil overlays, inlaid semi-precious stones, and 3D relief gesso work?",
            listOf("मैसूर पेंटिंग", "तंजौर चित्रकला / तंजावुर पेंटिंग (Tanjore / Thanjavur Painting - Tamil Nadu / Maratha patronage / Gold foil & Chettinad gemstones)", "केरल म्यूरल", "कलमकारी"),
            listOf("Mysore Painting", "Tanjore Painting (Developed in 16th-18th century under Nayakas and Marathas; depicts baby Krishna and Hindu deities on wooden plank/Palagai)", "Kerala Mural", "Kalamkari"),
            1,
            "तंजौर पेंटिंग (तंजावुर, तमिलनाडु) 16वीं सदी में विजयनगर और मराठा राजाओं (राजा सरफोजी द्वितीय) के संरक्षण में विकसित हुई। इसमें भगवान कृष्ण (माखन चोर) और देवताओं को असली सोने की पन्नी और रत्नों से सजाया जाता है।",
            "Thanjavur painting is renowned for its surface richness, vibrant color palette, and sparkling metallic brilliance.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q6", "art_4",
            "राजस्थान के भीलवाड़ा और शाहपुरा का कौन-सा प्रसिद्ध पारंपरिक लोक चित्रकला रूप लंबे कपड़े के स्क्रॉल (Scroll) पर लोक देवताओं (पाबूजी और देवनारायण जी) की शौर्य गाथाएं गाकर सुनाने के लिए बनाया जाता है?",
            "Which long cloth-scroll painting of Rajasthan (Shahpura/Bhilwara) is unfolded by traditional folk bards (Bhopas) while singing the heroic epics of folk deities Pabuji and Devnarayanji with Ravanhattha?",
            listOf("पिछवाई पेंटिंग", "फाड़ / फड़ चित्रकला (Phad Painting - Rajasthan / Joshi family of Shahpura / Pabuji ki Phad / Shri Lal Joshi)", "बणी-ठणी", "मांडणा"),
            listOf("Pichhwai Painting", "Phad Painting (Religious scroll painting measuring up to 30 feet, illuminated at night with oil lamps while bards chant ballads)", "Bani Thani", "Mandana"),
            1,
            "फड़ (Phad) पेंटिंग 700 वर्ष पुरानी राजस्थानी लोक कला है। इसमें 30 फीट लंबे कपड़े पर पाबूजी और देवनारायण जी की जीवन गाथाएं चित्रित होती हैं। भोपा और भोपी रावणहत्था बजाते हुए रात भर फड़ वाचन करते हैं। श्री लाल जोशी (पद्म श्री 2006) इसके शीर्ष कलाकार थे।",
            "Phad painting serves as a portable temple and visual storyboard for Rajasthan's nomadic pastoral communities.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q7", "art_4",
            "राजस्थान के नाथद्वारा (राजसमंद) में भगवान श्रीनाथजी (बाल कृष्ण) की मूर्ति के पीछे कपड़े पर लटकाई जाने वाली सुंदर पृष्ठभूमि चित्रकला को क्या कहा जाता है?",
            "What is the devotional cloth painting of Nathdwara (Rajasthan) called, hung behind the idol of Lord Shrinathji to depict seasonal festivals and Govardhan Leela?",
            listOf("फड़ पेंटिंग", "पिछवाई चित्रकला (Pichhwai Painting - Nathdwara, Rajasthan / 'Pichh' = Back / Shrinathji Vallabh Sampradaya)", "बणी-ठणी", "थेवा कला"),
            listOf("Phad Painting", "Pichhwai Painting (Literally 'that which hangs at the back'; rich cloth painting depicting cows, lotus flowers, and Shrinathji's Shringara)", "Bani Thani", "Thewa Art"),
            1,
            "पिछवाई (संस्कृत 'पीछे' से) नाथद्वारा में पुष्टिमार्ग/वल्लभ संप्रदाय के श्रीनाथजी मंदिर में मूर्ति के पीछे टांगी जाने वाली कलात्मक चित्रकला है। इसमें कमल के फूल, गायें, शरद पूर्णिमा और रासलीला मुख्य विषय होते हैं।",
            "Pichhwai paintings are intricate temple hangings created by skilled Mewari artisans celebrating the divine manifestations of Shrinathji.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q8", "art_4",
            "राजस्थान की 'किशनगढ़ शैली' (Kishangarh School of Painting) की किस अमर पेंटिंग को 'भारतीय मोनालिसा' (Mona Lisa of India) कहा जाता है, जिसे राजा सावंत सिंह के समय निहाल चंद ने चित्रित किया था?",
            "Which iconic miniature painting from the Kishangarh School of Rajasthan, painted by master artist Nihal Chand, is universally acclaimed as the 'Mona Lisa of India'?",
            listOf("रागमाला", "बणी-ठणी (Bani Thani - Kishangarh Style / Nihal Chand / Raja Sawant Singh / Arched eyebrows & lotus eyes)", "राधा-कृष्ण", "ढोला-मारू"),
            listOf("Ragamala", "Bani Thani (Depicts poetess-singer Rasik Bihari as idealized Radha with arched eyebrows, long neck, and pointed nose; postal stamp issued 1973)", "Radha-Krishna", "Dhola-Maru"),
            1,
            "बणी-ठणी (सजी-धजी महिला) 18वीं सदी में किशनगढ़ के राजा सावंत सिंह (नागरीदास) की प्रेयसी थीं। चित्रकार निहाल चंद ने उन्हें राधा के रूप में चित्रित किया। कला इतिहासकार एरिक डिकिंसन ने इसे 'भारत की मोनालिसा' नाम दिया।",
            "Bani Thani represents the apex of Rajput romantic aestheticism with its refined facial profile and gossamer-fine Odhni veil.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q9", "art_4",
            "मध्य प्रदेश और छत्तीसगढ़ के गोंड आदिवासियों द्वारा प्रकृति, पेड़ों और जानवरों को बिंदुओं (Dots) और महीन रेखाओं (Fine Lines) से चित्रित करने वाली विश्वप्रसिद्ध कला कौन-सी है?",
            "Which vibrant tribal art form of Madhya Pradesh uses dots and lines to depict animistic spirits, the tree of life (Mahua), and folklore, pioneered globally by Jangarh Singh Shyam?",
            listOf("वरली", "गोंड चित्रकला (Gond Painting / Jangarh Kalam - Madhya Pradesh / Patangarh village / GI Tag 2023)", "पिथोरा", "सौंदरा"),
            listOf("Warli", "Gond Painting (Created by Pardhan Gond community; characterized by distinct textured patterns like fish scales, dashes, and dots)", "Pithora", "Saura"),
            1,
            "गोंड चित्रकला मध्य प्रदेश के डिंडोरी (पाटनगढ़) के गोंड आदिवासियों की प्रसिद्ध कला है। जनगढ़ सिंह श्याम (1962-2001) ने इस आदिवासी भित्ति कला को कैनवास और वैश्विक दीर्घाओं तक पहुंचाया जिसे 'जनगढ़ कलाम' कहा जाता है। 2023 में इसे जीआई टैग मिला।",
            "Gond painting is a breathtaking expression of tribal imagination, where every master artist develops their own signature dot-and-line texture.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q10", "art_4",
            "गुजरात और मध्य प्रदेश के राठवा और भिलाला आदिवासियों द्वारा घर की दीवारों पर सुख-समृद्धि और मनोकामना पूर्ति के लिए चित्रित की जाने वाली पवित्र अनुष्ठानिक कला कौन-सी है?",
            "Which sacred ritual wall painting is executed by the Rathwa and Bhilala tribes of Gujarat (Chhota Udepur) and MP depicting horse-mounted deities led by Baba Pithora?",
            listOf("वरली", "पिथोरा चित्रकला (Pithora Painting - Rathwa & Bhilala tribes / Gujarat & MP / Performed by 'Lakhara' painters)", "वरली", "अल्पना"),
            listOf("Warli", "Pithora Painting (Ritualistic offering made to fulfill vows; depicts Baba Pithora and Raja Indra riding horses with sun and moon)", "Warli", "Alpana"),
            1,
            "पिथोरा चित्रकला गुजरात (छोटा उदेपुर) और म.प्र. के राठवा जनजाति की अनुष्ठानिक पेंटिंग है। यह किसी मन्नत के पूरे होने पर घर की बैठक में 'लखारा' (चित्रकार) द्वारा मुख्य देवता पिथोरा बाबा के सम्मान में बनाई जाती है। इसमें घोड़ों का चित्रण अनिवार्य होता है।",
            "Pithora paintings are living sacred spaces dedicated to Baba Pithora, bringing peace, cattle health, and harvest fortune to tribal homes.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q11", "art_4",
            "महाराष्ट्र के पैठण की कौन-सी प्रसिद्ध पारंपरिक हथकरघा रेशमी साड़ी अपने शुद्ध सोने/चांदी की जरी के मोर और तोता पल्लू के लिए जानी जाती है (GI Tag)?",
            "Which prestigious GI-tagged handloom silk saree from Paithan (Aurangabad, Maharashtra) is celebrated for its oblique square border and kaleidoscopic peacock (Mor) pallu woven in pure gold zari?",
            listOf("चंदेरी साड़ी", "पैठणी साड़ी (Paithani Saree - Maharashtra / Royal Maharashtrian bridal weave / Satavahana era origin)", "बनारसी साड़ी", "कांजीवरम साड़ी"),
            listOf("Chanderi Saree", "Paithani Saree (Known as the 'Queen of Sarees'; handwoven using fine mulberry silk and real silver-gold electroplated zari)", "Banarasi Saree", "Kanjeevaram Saree"),
            1,
            "पैठणी साड़ी महाराष्ट्र के छत्रपति संभाजीनगर (औरंगाबाद) के पैठण शहर की 2000 वर्ष पुरानी हथकरघा परंपरा है। सातवाहन राजाओं के समय से प्रसिद्ध इस साड़ी के पल्लू पर मोर, कमल और तोते की आकृतियां जरी से बुनी जाती हैं।",
            "Paithani is the crowning glory of Maharashtrian handloom heritage, prized for its lustrous silk and exquisite tapestry weaves.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q12", "art_4",
            "तमिलनाडु के कांचीपुरम की विश्वप्रसिद्ध 'कांजीवरम साड़ी' (Kanchipuram Silk Saree) की मुख्य तकनीकी विशेषता क्या है?",
            "What is the defining structural weaving technique of the legendary Kanjeevaram Silk Saree of Tamil Nadu (GI Tag)?",
            listOf("केवल सूती धागों से बुनाई", "कोरवई तकनीक - जिसमें साड़ी की बॉडी और पल्लू को अलग-अलग बुनकर अत्यंत मजबूती से आपस में जोड़ा जाता है (Korvai Weaving Technique / Pure Mulberry Silk & Silver Zari)", "ब्लॉक प्रिंटिंग", "टाई एंड डाई"),
            listOf("Pure cotton only", "Korvai technique (Body and border/pallu are woven separately on three-shuttle looms and interlocked with zig-zag joint; heavy mulberry silk dipped in rice water)", "Block printing", "Tie and dye"),
            1,
            "कांजीवरम साड़ी (कांचीपुरम, तमिलनाडु) शुद्ध मलबरी सिल्क और सूरत की असली चांदी-सोने की जरी से बनती है। इसकी विशेषता 'कोरवई' (Korvai) तकनीक है, जिसमें पल्लू और बॉर्डर को अलग बुनकर बॉडी से मजबूती से जोड़ा जाता है।",
            "Kanjeevaram sarees are celebrated worldwide as the pinnacle of South Indian bridal elegance due to their heavy drape and temple borders.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q13", "art_4",
            "मध्य प्रदेश के अशोकनगर जिले का कौन-सा ऐतिहासिक शहर अपनी हल्की, पारदर्शी और महीन रेशम-सूती साड़ियों के लिए विश्वविख्यात है?",
            "Which historic town in Ashoknagar district of Madhya Pradesh is internationally acclaimed for its feather-light, sheer, and gossamer handloom sarees with zari borders?",
            listOf("महेश्वर (महेश्वरी साड़ी)", "चंदेरी (Chanderi Sarees - Madhya Pradesh / Handloom GI Tag / Mughal & Scindia patronage)", "उज्जैन", "धार"),
            listOf("Maheshwar (Maheshwari Saree)", "Chanderi (Woven since the Vedic era / Shishupala legend; blending silk, fine cotton, and gold zari into sheer fabric)", "Ujjain", "Dhar"),
            1,
            "चंदेरी (मध्य प्रदेश) की साड़ियां अपनी पारदर्शिता, कोमलता और जरी की खूबसूरत बूटियों के लिए 13वीं सदी से प्रसिद्ध हैं। रानी अहिल्याबाई होल्कर ने नर्मदा किनारे 'महेश्वरी साड़ी' (खरगोन) को विकसित किया था।",
            "Chanderi handlooms produce sheer fabrics of royal distinction, favored by royalty across centuries of Indian history.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q14", "art_4",
            "राजस्थान के प्रतापगढ़ की 400 वर्ष पुरानी कौन-सी अनूठी आभूषण कला है जिसमें रंगीन बेल्जियम कांच पर शुद्ध 24 कैरेट सोने की बेहद बारीक नक्काशी की जाती है?",
            "Which unique 400-year-old jewelry craft of Pratapgarh (Rajasthan) involves fusing intricate 24-karat gold filigree sheets onto molten colored Belgian glass?",
            listOf("मीनाकारी (जयपुर)", "थेवा कला (Thewa Art - Pratapgarh, Rajasthan / Rajsoni family / GI Tag / 24-karat Gold on Colored Glass)", "कुंदन कला", "तारकशी"),
            listOf("Meenakari (Jaipur)", "Thewa Art (Invented in 1707 by Nathu Ji Soni; preserved as a strictly guarded family secret across generations of Rajsonis)", "Kundan Art", "Tarkashi"),
            1,
            "थेवा कला (प्रतापगढ़, राजस्थान) में रंगीन कांच (हरा, लाल, नीला) के ऊपर 24 कैरेट सोने की सूक्ष्म जालीदार नक्काशी चिपकाई जाती है। 1707 में नाथू जी सोनी ने इसकी शुरुआत की थी और राजा सावंत सिंह ने उन्हें 'राजसोनी' उपाधि दी थी।",
            "Thewa is an extraordinary micro-jewelry art form from Rajasthan with international patented recognition.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_4_m1_q15", "art_4",
            "ओडिशा के कटक की कौन-सी ऐतिहासिक हस्तकला शुद्ध चांदी के बेहद पतले और महीन तारों को मोड़कर जटिल आभूषण और मूर्तियां बनाने के लिए प्रसिद्ध है?",
            "Which historic filigree handicraft of Cuttack (Odisha), awarded the GI Tag in March 2024, creates delicate jewelry and Durga Puja Tableaux from pure drawn silver wires?",
            listOf("बिदरीवेयर", "चांदी की तारकशी / रूपा तारकशी (Chandi Tarakasi / Silver Filigree of Cuttack, Odisha - GI Tag March 2024)", "ढोकरा कला", "थेवा कला"),
            listOf("Bidriware", "Silver Filigree / Tarakasi (Cuttack is known as the 'Silver City' for its 500-year-old maritime filigree tradition)", "Dhokra Metal Casting", "Thewa Art"),
            1,
            "कटक (ओडिशा) को 'सिल्वर सिटी' कहा जाता है। यहाँ की 'चांदी की तारकशी' (तारकशी = तारों से खिंचाई) में 99% शुद्ध चांदी के बारीक तारों से आभूषण, ताज और दुर्गा पूजा के भव्य 'चांदी मेढ़ा' बनाए जाते हैं। मार्च 2024 में इसे जीआई टैग मिला।",
            "Cuttack's Chandi Tarakasi represents the apex of delicate metal craftsmanship in India, drawing global admirers.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_4", 2, 5, baseQuestions)
    }
}
