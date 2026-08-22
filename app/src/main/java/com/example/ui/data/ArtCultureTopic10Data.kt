package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic10Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions) - भारत के प्रमुख मेले, धार्मिक यात्राएं एवं सांस्कृतिक उत्सव
        // ==========================================
        makeArtCultureQ(
            "art_10_m1_q1", "art_10",
            "दुनिया का सबसे बड़ा धार्मिक व सांस्कृतिक मानव समागम 'कुंभ मेला' (Kumbh Mela - UNESCO Intangible Heritage 2017) भारत के किन चार पवित्र तीर्थ स्थलों और नदियों के तट पर 12 वर्षों के चक्र में आयोजित होता है?",
            "At which four sacred holy cities and along which respective river banks is the grand Kumbh Mela—the world's largest peaceful religious congregation—held every 12 years?",
            listOf("वाराणसी (गंगा), अयोध्या (सरयू), मथुरा (यमुना) और द्वारका (गोमती)", "प्रयागराज (त्रिवेणी संगम), हरिद्वार (गंगा), उज्जैन (शिप्रा) और नासिक-त्र्यंबकेश्वर (गोदावरी)", "ऋषिकेश (गंगा), केदारनाथ (मंदाकिनी), पुरी (समुद्र) और रामेश्वरम", "गया (फल्गु), पुष्कर (सरोवर), बद्रीनाथ (अलकनंदा) और तिरुपति"),
            listOf("Varanasi, Ayodhya, Mathura, and Dwarka", "Prayagraj (Triveni Sangam), Haridwar (Ganga), Ujjain (Shipra), and Nashik-Trimbakeshwar (Godavari)", "Rishikesh, Kedarnath, Puri, and Rameswaram", "Gaya, Pushkar, Badrinath, and Tirupati"),
            1,
            "कुंभ मेला 4 पावन स्थलों पर आयोजित होता है:\n1. **प्रयागराज** (यूपी) - गंगा, यमुना और सरस्वती के संगम पर,\n2. **हरिद्वार** (उत्तराखंड) - गंगा नदी तट पर,\n3. **उज्जैन** (एमपी) - शिप्रा नदी तट पर (सिंहस्थ कुंभ),\n4. **नासिक** (महाराष्ट्र) - गोदावरी नदी तट पर (सिंहस्थ कुंभ)।\nसमुद्र मंथन से निकले अमृत कलश से अमृत की बूंदें इन चार स्थानों पर गिरी थीं। 2017 में यूनेस्को ने कुंभ मेले को अमूर्त सांस्कृतिक विरासत घोषित किया।",
            "The Kumbh Mela represents the world's most mammoth spiritual gathering of sadhus, akharas, and pilgrims based on planetary astrological alignments.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q2", "art_10",
            "राजस्थान के अजमेर जिले में कार्तिक पूर्णिमा (अक्टूबर-नवंबर) पर आयोजित होने वाला विश्व का सबसे बड़ा ऊंट व पशु मेला कौन-सा है, जहाँ एकमात्र प्राचीन ब्रह्मा मंदिर और पवित्र सरोवर स्थित है?",
            "Which world-famous international fair in Rajasthan, held on Kartik Purnima around a sacred holy lake, is renowned as the globe's largest camel and livestock trading festival?",
            listOf("नागौर मेला", "पुष्कर मेला (Pushkar Camel Fair - Sacred Pushkar Lake / World's only active major Brahma Temple / Maha Aarti & Desert Competitions)", "कोलायत मेला (बीकानेर)", "तिलवाड़ा पशु मेला (बाड़मेर)"),
            listOf("Nagaur Fair", "Pushkar Camel Fair (Historic annual livestock fair featuring thousands of colorfully decorated camels, Rajasthani folk dances, and sacred dip on Kartik Purnima)", "Kolayat Fair", "Tilwara Fair"),
            1,
            "पुष्कर मेला (अजमेर, राजस्थान) दुनिया का सबसे बड़ा ऊंट मेला है। यहाँ देश-विदेश से लाखों पर्यटक आते हैं। यह मेला कार्तिक पूर्णिमा को संपन्न होता है, जिस दिन श्रद्धालु पुष्कर झील में पावन स्नान करते हैं और 14वीं सदी के ऐतिहासिक 'ब्रह्मा मंदिर' में पूजा-अर्चना करते हैं। यहाँ मूंछ प्रतियोगिता, मटका दौड़ और पगड़ी बांधने जैसी पारंपरिक प्रतियोगिताएं होती हैं।",
            "Pushkar Fair is a vibrant cultural mosaic blending desert livestock commerce, Rajasthani folk arts, and deep spiritual rituals.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q3", "art_10",
            "बिहार के सारण जिले में गंगा और गंडक (नारायणी) नदी के संगम पर कार्तिक पूर्णिमा से प्रारंभ होने वाला 'एशिया का सबसे बड़ा पशु मेला' किस नाम से जाना जाता है?",
            "Which historic fair held at the confluence of the Ganges and Gandak rivers in Bihar, dating back to Chandragupta Maurya's era, is celebrated as Asia's largest livestock and cattle fair?",
            listOf("सोनपुर मेला / हरिहर क्षेत्र मेला (Sonepur Cattle Fair - Asia's Largest Cattle Fair / Elephant & Horse Trade / Harihar Nath Temple)", "राजगीर महोत्सव", "पितृपक्ष मेला (गया)", "वैशाली महोत्सव"),
            listOf("Sonepur Mela / Harihar Kshetra Fair (Asia's largest cattle fair where elephants, Arabian horses, camels, and cattle were historically traded; dedicated to Lord Harihar)", "Rajgir Mahotsav", "Pitrapaksha Fair (Gaya)", "Vaishali Mahotsav"),
            1,
            "सोनपुर मेला (बिहार) को 'हरिहर क्षेत्र मेला' या स्थानीय भाषा में 'छत्तर मेला' भी कहा जाता है। यह एशिया का सबसे बड़ा पशु मेला है। मान्यता है कि यहीं भगवान विष्णु ने ग्राह (मगरमच्छ) से गज (हाथी) की रक्षा की थी ('गज-ग्राह' की लड़ाई)। यहाँ भगवान विष्णु और शिव के संयुक्त रूप 'हरिहर नाथ मंदिर' में लाखों श्रद्धालु जलाभिषेक करते हैं।",
            "The Sonepur Fair represents an unbroken centuries-old rural trade and spiritual tradition along the sacred Gandak-Ganga confluence.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q4", "art_10",
            "असम के गुवाहाटी में नीलांचल पर्वत पर स्थित 51 शक्तिपीठों में प्रमुख 'मां कामाख्या मंदिर' में प्रतिवर्ष जून (आषाढ़) महीने में कौन-सा तांत्रिक मेला आयोजित होता है, जिसे 'पूर्व का महाकुंभ' कहा जाता है?",
            "Which unique annual Tantric festival is celebrated in June at the Kamakhya Temple atop Nilachal Hill in Guwahati, Assam, honoring the annual menstruation cycle of Goddess Kamakhya?",
            listOf("माजुली महोत्सव", "अंबुबाची मेला (Ambubachi Mela - Tantric fertility festival of Goddess Kamakhya / Brahmaputra turns red / 'Mahakumbh of the East')", "जोंबील मेला", "देउल महोत्सव"),
            listOf("Majuli Festival", "Ambubachi Mela (Four-day fertility congregation where the temple sanctum remains closed for 3 days to mark Mother Earth's creative cycle; sacred Raktavastra prasad)", "Jonbeel Mela", "Deul Festival"),
            1,
            "अंबुबाची मेला (गुवाहाटी, असम) कामाख्या शक्तिपीठ में मनाया जाता है। मान्यता है कि आषाढ़ मास में मां कामाख्या (धरती माता) अपने 3 दिवसीय वार्षिक रजोधर्म (मासिक चक्र) में होती हैं। इस दौरान मंदिर के कपाट 3 दिनों तक बंद रहते हैं और चौथे दिन कपाट खुलने पर लाखों श्रद्धालुओं और अघोरी-तांत्रिक साधुओं को 'रक्त वस्त्र' (लाल कपड़ा) प्रसाद के रूप में वितरित किया जाता है।",
            "The Ambubachi Mela is one of the most esoteric Shakta and Tantric spiritual congregations in the subcontinent.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q5", "art_10",
            "ओडिशा के पुरी में प्रतिवर्ष आषाढ़ शुक्ल द्वितीया को आयोजित होने वाली विश्व प्रसिद्ध 'जगन्नाथ रथ यात्रा' में भगवान जगन्नाथ के 16 पहियों वाले विशाल रथ का क्या नाम है?",
            "In the world-renowned annual Rath Yatra of Puri, Odisha, what is the specific name of Lord Jagannath's 45-foot-tall grand 16-wheeled chariot?",
            listOf("तालध्वज (बलभद्र का रथ)", "नंदीघोष / गरुड़ध्वज (Nandighosha / Garudadhwaja - 16 Wheels, Red & Yellow Fabric / Lord Jagannath's Chariot)", "देवदलन / दर्पदलन (सुभद्रा का रथ)", "पुष्पक विमान"),
            listOf("Taladhwaja (Balabhadra - 14 wheels)", "Nandighosha / Garudadhwaja (Lord Jagannath's 16-wheeled chariot draped in red and yellow cloth pulled by millions of devotees)", "Darpadalana / Debadalana (Subhadra - 12 wheels)", "Pushpaka"),
            1,
            "पुरी की रथ यात्रा में तीनों भाई-बहनों के अलग-अलग रथ होते हैं:\n1. **नंदीघोष** (भगवान जगन्नाथ का रथ - 16 पहिए, लाल और पीला कपड़ा),\n2. **तालध्वज** (भगवान बलभद्र का रथ - 14 पहिए, लाल और हरा कपड़ा),\n3. **देवदलन/दर्पदलन** (देवी सुभद्रा का रथ - 12 पहिए, लाल और काला कपड़ा)।\nयह यात्रा जगन्नाथ मंदिर से निकलकर 3 किमी दूर 'गुंडिचा मंदिर' (मौसी का घर) जाती है।",
            "The Puri Rath Yatra is an extraordinary egalitarian spectacle of devotion where millions pull the cosmic deities through the Grand Road (Bada Danda).",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q6", "art_10",
            "तेलंगाना के मुलुगु जिले में कोया (Koya) जनजाति द्वारा द्विवार्षिक रूप से मनाया जाने वाला 'मेदारम जतारा' (सम्माक्का-सारलम्मा जतारा) किस लिए प्रसिद्ध है?",
            "Why is the biennial 'Medaram Jatara' (Sammakka Saralamma Jatara), celebrated by the Koya tribe in the dense forests of Telangana, celebrated globally?",
            listOf("यह भारत का सबसे बड़ा नौका दौड़ उत्सव है", "यह कुंभ मेले के बाद भारत का दूसरा सबसे बड़ा और एशिया का सबसे बड़ा जनजातीय समागम है (Largest Tribal Congregation in Asia / Offering Jaggery 'Bangaram')", "यह केवल हाथियों का मेला है", "यह फसल कटाई का नृत्य उत्सव है"),
            listOf("Largest boat festival", "Asia's Largest Tribal Congregation (Second largest human gathering after Kumbh Mela; devotees offer jaggery known as 'Bangaram' equal to their body weight)", "Elephant fair", "Harvest dance"),
            1,
            "'मेदारम जतारा' (सम्माक्का-सारलम्मा जतारा) तेलंगाना के मुलुगु जिले के जंगलों में हर दो साल में आयोजित होता है। यह 12वीं सदी में काकतीय शासकों के अन्यायपूर्ण करों के खिलाफ लड़ने वाली मां-बेटी (सम्माक्का और सारलम्मा) के बलिदान की याद में मनाया जाता है। यहाँ 1.5 करोड़ से अधिक श्रद्धालु एकत्र होते हैं और देवी को अपने वजन के बराबर गुड़ ('बंगारम' यानी सोना) चढ़ाते हैं।",
            "Medaram Jatara is Asia's largest tribal gathering, commemorating indigenous rebellion against feudal oppression with zero Vedic caste hierarchy.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q7", "art_10",
            "पूर्वोत्तर राज्य नागालैंड में प्रतिवर्ष 1 से 10 दिसंबर के बीच किसामा हेरिटेज विलेज (कोहिमा) में 17 नागा जनजातियों की समृद्ध संस्कृति को प्रदर्शित करने वाला 'त्यौहारों का त्यौहार' (Festival of Festivals) कौन-सा है?",
            "Which iconic 10-day cultural extravaganza, celebrated annually from December 1-10 at Naga Heritage Village Kisama near Kohima, is popularly known as the 'Festival of Festivals'?",
            listOf("लुई-नगाई-नी उत्सव", "हॉर्नबिल महोत्सव (Hornbill Festival - Named after the revered Indian Hornbill bird / Showcases 17 Naga Tribes, warrior dances, archery & music)", "त्सुकेने उत्सव", "आओलिंग महोत्सव"),
            listOf("Lui-Ngai-Ni", "Hornbill Festival (Organized by the Government of Nagaland; unifying 17 distinct Naga indigenous tribes in vibrant traditional regalia and folk games)", "Tsukhenyie", "Aoleang"),
            1,
            "हॉर्नबिल महोत्सव (नागालैंड) राज्य स्थापना दिवस (1 दिसंबर) से शुरू होता है। इसका नाम नागा लोक कथाओं में पूजनीय पक्षी 'ग्रेट इंडियन हॉर्नबिल' के नाम पर रखा गया है। इसमें सभी नागा जनजातियां (अंगामी, आओ, कोन्याक, सुमी, चांग आदि) अपने पारंपरिक मोरंग (Morang), युद्ध नृत्य, देशी खेल, बांस क्राफ्ट और संगीत का प्रदर्शन करती हैं।",
            "The Hornbill Festival is a globally renowned tourism and anthropological spectacle preserving the living indigenous ethos of Nagaland.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q8", "art_10",
            "केरल के त्रिशूर में वड़क्कुन्नाथन मंदिर (Vadakkunnathan Temple) के प्रांगण में मेदाम (अप्रैल-मई) महीने में मनाया जाने वाला 'सभी पूरमों का राजा' (Mother of all Poorams) कौन-सा है?",
            "Which spectacular temple festival in Kerala, instituted by Sakthan Thampuran in the 18th century, is renowned for 30 majestically caparisoned elephants, Kudamattom umbrella exchange, and Ilanjithara Melam?",
            listOf("अट्टुकल पोंगाला", "त्रिशूर पूरम (Thrissur Pooram - Vadakkunnathan Shiva Temple / Ilanjithara Melam percussion / Kudamattom royal umbrella display / Grand Fireworks)", "नेहरू ट्रॉफी नौका दौड़", "विशु उत्सव"),
            listOf("Attukal Pongala", "Thrissur Pooram (The magnificent 'Mother of all Poorams' held at Thekkinkadu Maidan; competitive display of decorated tuskers and synchronized Panchavadyam)", "Nehru Trophy", "Vishu"),
            1,
            "त्रिशूर पूरम की शुरुआत 1798 में कोच्चि के राजा 'शक्तन थंपुरन' ने की थी। यह परमेक्कावू और तिरुवंबदी देवी मंदिरों के बीच एक मैत्रीपूर्ण प्रतिस्पर्धा है। इसमें 30 सजे-धजे हाथी आमने-सामने खड़े होकर रंग-बिरंगी रेशमी छतरियों को बिजली की गति से बदलते हैं (जिसे 'कुडमट्टम' कहा जाता है) और 250 से अधिक वादक 'इलांजिथरा मेलम' में चेंडा और मड्डलम बजाते हैं।",
            "Thrissur Pooram stands as Kerala's most awe-inspiring visual and acoustic temple festival, unifying thousands in rhythmic euphoria.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q9", "art_10",
            "उत्तराखंड के गढ़वाल हिमालय में स्थित पवित्र 'छोटा चार धाम' (Chota Char Dham) तीर्थ यात्रा में कौन-से चार पावन स्थल शामिल हैं, जिनकी यात्रा का पारंपरिक क्रम पश्चिम से पूर्व की ओर होता है?",
            "Which four sacred Himalayan shrines located in Uttarakhand constitute the revered 'Chota Char Dham' pilgrimage circuit, traditionally traversed from west to east?",
            listOf("ऋषिकेश, हरिद्वार, देवप्रयाग और रुद्रप्रयाग", "यमुनोत्री, गंगोत्री, केदारनाथ और बद्रीनाथ (Yamunotri, Gangotri, Kedarnath, and Badrinath - Dedicated to Yamuna, Ganga, Shiva, and Vishnu)", "अमरनाथ, वैष्णो देवी, केदारनाथ और बद्रीनाथ", "काशी, गया, प्रयाग और अयोध्या"),
            listOf("Rishikesh, Haridwar, Devprayag, Rudraprayag", "Yamunotri (Source of Yamuna), Gangotri (Source of Bhagirathi), Kedarnath (Mandakini / Shiva Jyotirlinga), and Badrinath (Alaknanda / Vishnu shrine)", "Amarnath, Vaishno Devi, Kedarnath, Badrinath", "Kashi, Gaya, Prayag, Ayodhya"),
            1,
            "उत्तराखंड के चार धाम यात्रा का पारंपरिक क्रम:\n1. **यमुनोत्री** (उत्तरकाशी - देवी यमुना),\n2. **गंगोत्री** (उत्तरकाशी - देवी गंगा/भागीरथी),\n3. **केदारनाथ** (रुद्रप्रयाग - 12 ज्योतिर्लिंगों में से एक, मंदाकिनी नदी),\n4. **बद्रीनाथ** (चमोली - भगवान बद्रीनारायण/विष्णु, अलकनंदा नदी)।\n(जबकि आदि शंकराचार्य द्वारा स्थापित अखिल भारतीय वृहद चार धाम हैं: बद्रीनाथ - उत्तर, द्वारका - पश्चिम, पुरी - पूर्व, और रामेश्वरम - दक्षिण)।",
            "The Chota Char Dham circuit represents the supreme high-altitude Himalayan pilgrimage of purification, penance, and spiritual devotion.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q10", "art_10",
            "लद्दाख के लेह में स्थित सबसे बड़े और सबसे अमीर 'हेमिस बौद्ध मठ' में तिब्बती बौद्ध धर्म के संस्थापक 'गुरु पद्मसंभव' (गुरु रिनपोचे) की जयंती पर कौन-सा प्रसिद्ध मुखौटा नृत्य (Masked Cham Dance) उत्सव मनाया जाता है?",
            "Which vibrant festival is celebrated in June-July at Hemis Gompa, Ladakh, commemorating the birth anniversary of Guru Padmasambhava with sacred 'Cham' masked dances?",
            listOf("लोसार उत्सव", "हेमिस महोत्सव (Hemis Festival - Celebrated at Hemis Monastery / Sacred Cham Dances depicting victory of Good over Evil / Unfurling of giant Thangka painting)", "सागा दावा", "दोसमोचे उत्सव"),
            listOf("Losar (Tibetan New Year)", "Hemis Festival (Sacred monastery festival where monks perform energetic Cham dances wearing ornate silk robes and terrifying deity masks to the clash of cymbals and long horns)", "Saga Dawa", "Dosmoche"),
            1,
            "हेमिस महोत्सव (लद्दाख) द्रुकपा काग्यू संप्रदाय के हेमिस मठ में मनाया जाता है। लामा और भिक्षु रंग-बिरंगे रेशमी वस्त्र और हाथ से बने लकड़ी-कागज के विशाल मुखौटे पहनकर 'छम नृत्य' (Cham Dance) करते हैं, जो बुराई पर अच्छाई और धर्म की विजय का प्रतीक है। हर 12 साल में यहाँ गुरु पद्मसंभव का दो मंजिला विशाल 'थांगका' (रेशमी चित्रपट) फहराया जाता है।",
            "Hemis Festival provides a profound immersion into Tantric Vajrayana Buddhist monastic rituals and Himalayan masked iconography.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q11", "art_10",
            "पश्चिम बंगाल के दक्षिण 24 परगना जिले में हुगली नदी और बंगाल की खाड़ी के संगम पर मकर संक्रांति (14-15 जनवरी) को आयोजित होने वाले भारत के दूसरे सबसे बड़े मेले 'गंगासागर मेला' में किस महर्षि का प्राचीन आश्रम स्थित है?",
            "At the Gangasagar Mela held on Sagar Island, West Bengal during Makar Sankranti, pilgrims take a holy dip at the Ganges delta before praying at the historic hermitage of which revered sage?",
            listOf("महर्षि वाल्मीकि", "महर्षि कपिल मुनि (Kapil Muni Ashram, Sagar Island - Founder of Samkhya Philosophy / Legend of King Sagara's 60,000 sons and Bhagiratha)", "महर्षि वशिष्ठ", "महर्षि भारद्वाज"),
            listOf("Maharshi Valmiki", "Kapil Muni (Ancient hermitage of Sage Kapila, the proponent of Samkhya philosophy; associated with King Bhagiratha bringing Ganga to redeem King Sagara's sons)", "Maharshi Vashishta", "Maharshi Bharadwaja"),
            1,
            "गंगासागर मेला (पश्चिम बंगाल) कुंभ मेले के बाद भारत का सबसे बड़ा जनसमागम है ('सारे तीरथ बार-बार, गंगासागर एक बार')। मकर संक्रांति पर लाखों श्रद्धालु उस स्थान पर डुबकी लगाते हैं जहाँ गंगा नदी सागर में विलीन होती है। पौराणिक कथा के अनुसार महर्षि कपिल मुनि के कोप से भस्म हुए राजा सगर के 60,000 पुत्रों के उद्धार के लिए ही भगीरथ गंगा को पृथ्वी पर लाए थे।",
            "Gangasagar Mela is a sacred estuarine pilgrimage that blends Vedic legends of redemption with holy Makar Sankranti coastal ablutions.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q12", "art_10",
            "उत्तराखंड के चमोली जिले में प्रत्येक 12 वर्ष में आयोजित होने वाली 280 किमी लंबी एशिया की सबसे कठिन और दुर्गम पैदल धार्मिक यात्रा 'नंदा देवी राज जात' (Nanda Devi Raj Jat) का नेतृत्व कौन-सा विशेष प्राणी करता है?",
            "In Uttarakhand's arduous 280-km, 22-day Himalayan pilgrimage 'Nanda Devi Raj Jat' held once every 12 years to escort Goddess Nanda to Mount Trishul, which animal miraculously leads the procession to Homkund?",
            listOf("सफेद घोड़ा", "चार सींगों वाला नर मेढ़ा / चौसिंगा खाडू (Chausingha Khadu - Four-horned miraculous ram born naturally before the Yatra / Carries Ringal Chhatoli)", "हिमालयी याक", "कस्तूरी मृग"),
            listOf("White stallion", "Four-horned ram / Chausingha Khadu (A miraculous four-horned ram born in the village leading the sacred journey carrying Goddess Nanda's jewellery basket to Homkund)", "Himalayan Yak", "Musk Deer"),
            1,
            "'नंदा देवी राज जात' (उत्तराखंड का महाकुंभ) चमोली के नौटी गांव से शुरू होकर 17,500 फीट की ऊंचाई पर स्थित 'होमकुंड' (त्रिशूल पर्वत की तलहटी) तक जाती है। इस 22 दिवसीय पैदल यात्रा का नेतृत्व एक चार सींगों वाला नर मेढ़ा ('चौसिंगा खाडू') करता है, जो होमकुंड पहुँचकर अपने आप भारी गहनों की पोटली उतारकर अकेले बर्फीले पहाड़ों की ओर विलीन हो जाता है।",
            "Nanda Devi Raj Jat is one of the most physically demanding and emotionally charged indigenous mountain pilgrimages on Earth.",
            "Moderate"
        ),
        makeArtCultureQ(
            "art_10_m1_q13", "art_10",
            "गुजरात के सुरेंद्रनगर जिले में त्रिनेत्रेश्वर महादेव मंदिर के प्रांगण में आयोजित होने वाला प्रसिद्ध 'तरणेतर मेला' (Tarnetar Fair) मुख्य रूप से अपनी किस हस्तशिल्प कला और वैवाहिक परंपरा के लिए जाना जाता है?",
            "The famous rural Tarnetar Fair in Surendranagar, Gujarat, celebrated by Bharwad, Rabari, and Koli pastoral communities, is universally famous for which unique handicraft artifact?",
            listOf("लकड़ी के खिलौने", "रंग-बिरंगी शीशे और जरी वाली कढ़ाईदार छतरियां (Embroidered Umbrellas / Tarnetar Chhatris with mirror-work / Traditional Matchmaking Fair)", "मिट्टी के बर्तन", "पटोला साड़ियां"),
            listOf("Wooden lacquer toys", "Exquisitely embroidered umbrellas adorned with intricate needlework and mirror embellishments, carried by young tribal men seeking marriage suitors", "Terracotta pottery", "Patola weaves"),
            1,
            "तरणेतर मेला (गुजरात) भाद्रपद शुक्ल चतुर्थी से षष्ठी (अगस्त-सितंबर) तक आयोजित होता है। यह महाभारत कालीन द्रौपदी के स्वयंवर की भूमि मानी जाती है। यहाँ भरवाड़, रबारी और कोली जनजातियों के युवक अपने हाथों से महीनों तक शीशे और गोटेदार कढ़ाई से बनाई गई खूबसूरत 'तरणेतर छतरियां' लेकर आते हैं और 'रास' व गरबा नृत्य करते हुए जीवनसाथी का चयन करते हैं।",
            "Tarnetar Fair is a breathtaking festival of vibrant Saurashtra pastoral folk embroidery, lively music, and ancient matchmaking folklore.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q14", "art_10",
            "पंजाब के लुधियाना जिले में 1930 के दशक से प्रतिवर्ष फरवरी में आयोजित होने वाले किस प्रसिद्ध ग्रामीण खेल उत्सव को 'भारत का ग्रामीण ओलंपिक' (Rural Olympics of India) कहा जाता है?",
            "Which iconic sports and cultural extravaganza held annually in February at Ludhiana, Punjab, featuring bullock cart races, tent pegging, and daredevil feats, is known as the 'Rural Olympics'?",
            listOf("होला मोहल्ला", "किला रायपुर खेल महोत्सव (Kila Raipur Sports Festival / Rural Olympics - Bullock cart races, Tractor races, Tug of War & Punjabi folklore)", "बैसाखी खेल मेला", "छपार मेला"),
            listOf("Hola Mohalla", "Kila Raipur Sports Festival (Celebrated as the 'Rural Olympics of India'; instituted in 1933 by Philanthropist Inder Singh Grewal)", "Baisakhi Sports Fair", "Chhapar Mela"),
            1,
            "किला रायपुर खेल मेला (लुधियाना, पंजाब) की शुरुआत 1933 में सरदार इंदर सिंह ग्रेवाल ने की थी। इसे 'रूरल ओलंपिक' कहा जाता है। इसमें पंजाब के ग्रामीण खेलों—जैसे तेज रफ्तार बैलगाड़ी दौड़, ट्रैक्टर दौड़, घोड़ों पर करतब (टेंट पेगिंग), दांतों से भारी गाड़ियां खींचना और बुजुर्गों की 100 मीटर दौड़—का रोमांचक प्रदर्शन होता है।",
            "Kila Raipur Sports Festival celebrates the raw athletic stamina, martial daring, and agricultural sportsmanship of Punjab's rural heartland.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m1_q15", "art_10",
            "दिसंबर 2021 में यूनेस्को द्वारा 'मानवता की अमूर्त सांस्कृतिक विरासत' (Intangible Cultural Heritage of Humanity) के रूप में प्रतिष्ठित होने वाला पश्चिम बंगाल का सबसे भव्य सार्वजनिक धार्मिक उत्सव कौन-सा है?",
            "Which grandiose public socio-cultural and religious festival of West Bengal, featuring mammoth thematic pandals and clay idols, was inscribed on UNESCO's Intangible Cultural Heritage list in December 2021?",
            listOf("काली पूजा", "कोलकाता की दुर्गा पूजा (Durga Puja in Kolkata - 14th Indian element inscribed on UNESCO ICH List in 2021 / Thematic Pandals & Dhunuchi Dance)", "जगद्धात्री पूजा", "सरस्वती पूजा"),
            listOf("Kali Puja", "Durga Puja in Kolkata (Inscribed by UNESCO in 2021 recognizing the sublime public arts, inclusive community celebrations, and artisan clay sculpting of Kumartuli)", "Jagaddhatri Puja", "Saraswati Puja"),
            1,
            "कोलकाता की दुर्गा पूजा (2021 में यूनेस्को अमूर्त सांस्कृतिक विरासत) अश्विन मास के शुक्ल पक्ष में 10 दिनों तक मनाई जाती है। यह न केवल धार्मिक आराधना है, बल्कि दुनिया का सबसे बड़ा खुला समकालीन कला प्रदर्शनी मंच (Public Art Installation) बन चुका है। कुमारटोली के मूर्तिकारों द्वारा गंगा की मिट्टी से बनाई गई प्रतिमाएं, धुनुची नृत्य, सिंदूर खेला और ढाक की थाप इसके मुख्य आकर्षण हैं।",
            "Kolkata's Durga Puja transcends religion, evolving into a colossal public installation festival bridging traditional crafts and modern art.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_10", 2, 5, baseQuestions)
    }
}
