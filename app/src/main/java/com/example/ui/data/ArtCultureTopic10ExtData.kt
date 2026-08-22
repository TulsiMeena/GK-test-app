package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic10ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions) - धार्मिक यात्राएं, जनजातीय उत्सव, क्षेत्रीय त्यौहार एवं सांस्कृतिक मेले
        // ==========================================
        makeArtCultureQ(
            "art_10_m6_q1", "art_10",
            "बिहार के सुल्तानगंज में उत्तरवाहिनी गंगा से पवित्र जल भरकर झारखंड के देवघर स्थित 12 ज्योतिर्लिंगों में से एक 'बाबा बैद्यनाथ मंदिर' तक 105 किमी की नंगे पांव पैदल चलने वाली विश्व प्रसिद्ध कांवड़ यात्रा को क्या कहा जाता है?",
            "Which world-famous month-long sacred barefoot pilgrimage spans 105 km carrying holy Ganga water from Sultanganj, Bihar to the Baidyanath Jyotirlinga at Deoghar, Jharkhand, chanting 'Bol Bam'?",
            listOf("हरिद्वार कांवड़ यात्रा", "श्रावणी मेला / देवघर कांवड़ यात्रा (Shravani Mela / Deoghar Kanwar Yatra - Month of Shravan / 105 km barefoot trek carrying Ganga Jal to Baba Baidyanath)", "तपोवन यात्रा", "काशी विश्वनाथ यात्रा"),
            listOf("Haridwar Kanwar Yatra", "Shravani Mela, Deoghar (Month-long mass Shaivite pilgrimage where saffron-clad Kanwariyas carry water pots over 105 km to offer to Lord Shiva)", "Tapovan Yatra", "Kashi Vishwanath Yatra"),
            1,
            "'श्रावणी मेला' (देवघर, झारखंड) विश्व का सबसे लंबा और निरंतर चलने वाला धार्मिक पैदल मेला है। पूरे सावन मास (जुलाई-अगस्त) में लाखों भगवाधारी 'कांवरिया' सुल्तानगंज में गंगा नदी से 'कांवर' में जल भरकर 105 किमी का दुर्गम पथ नंगे पांव तय करते हुए 'बोल बम' के नारों के साथ देवघर पहुँचकर बाबा बैद्यनाथ का जलाभिषेक करते हैं।",
            "The Deoghar Shravani Mela represents a magnificent endurance of communal faith, discipline, and Shaivite pilgrimage tradition.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q2", "art_10",
            "जम्मू और कश्मीर के अनंतनाग जिले में 3,888 मीटर की ऊंचाई पर स्थित 'अमरनाथ गुफा' (Amarnath Cave) में प्राकृतिक रूप से बनने वाले बर्फ के शिवलिंग (Ice Stalagmite) के दर्शन हेतु तीर्थयात्री किन दो मुख्य मार्गों से यात्रा करते हैं?",
            "Pilgrims undertaking the sacred high-altitude Himalayan pilgrimage to the Amarnath Cave shrine in Jammu & Kashmir traverse which two traditional trekking routes?",
            listOf("सोनमर्ग और गुलमर्ग मार्ग", "पहलगाम (पारंपरिक चंदनवाड़ी-शेषनाग-पंचतरणी मार्ग) और बालटाल मार्ग (Pahalgam Traditional Route & Baltal Short Route / Shravana Purnima Raksha Bandhan culmination)", "कटरा और बाणगंगा मार्ग", "मनाली और लेह मार्ग"),
            listOf("Sonamarg and Gulmarg", "Pahalgam Route (Traditional 48km scenic trek via Chandanwari, Sheshnag, Panchtarni) and Baltal Route (Steep 14km fast route)", "Katra and Ban Ganga (Vaishno Devi)", "Manali and Leh"),
            1,
            "अमरनाथ यात्रा के दो मुख्य मार्ग हैं:\n1. **पहलगाम मार्ग** (पारंपरिक 48 किमी - चंदनवाड़ी, पिस्सू टॉप, शेषनाग झील, महागुणास पास, पंचतरणी होते हुए),\n2. **बालटाल मार्ग** (गांदरबल - 14 किमी तीव्र चढ़ाई वाला मार्ग)।\nगुफा में जल की बूंदों के जमने से प्राकृतिक बर्फ का शिवलिंग बनता है। यह यात्रा श्रावण पूर्णिमा (रक्षाबंधन) के दिन 'छड़ी मुबारक' के गुफा में पहुँचने के साथ संपन्न होती है।",
            "Amarnath Yatra is a demanding high-altitude Shaivite pilgrimage imbued with deep Himalayan folklore and mystical ice formation.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q3", "art_10",
            "बिहार, झारखंड और पूर्वी उत्तर प्रदेश का सबसे बड़ा और सबसे पवित्र चार दिवसीय महापर्व 'छठ पूजा' (Chhath Puja) में तीसरे और चौथे दिन क्रमशः किस समय भगवान सूर्य को 'अर्घ्य' समर्पित किया जाता है?",
            "In the four-day rigorous Vedic solar festival 'Chhath Puja' celebrated across Bihar, Jharkhand, and UP, when are the sacred milk and water libations (Arghya) offered to the Sun God?",
            listOf("केवल दोपहर के समय", "तीसरे दिन 'अस्ताचलगामी सूर्य' (डूबते सूर्य - Sandhya Arghya) को और चौथे दिन 'उदीयमान सूर्य' (उगते सूर्य - Usha Arghya) को", "केवल मध्यरात्रि में", "केवल प्रातःकाल में"),
            listOf("Only at noon", "3rd Day: Setting Sun (Sandhya Arghya at dusk) & 4th Day: Rising Sun (Usha Arghya at dawn) along sacred river ghats", "Only at midnight", "Only at dawn"),
            1,
            "छठ पूजा (कार्तिक शुक्ल चतुर्थी से सप्तमी) 4 दिनों का कठोर व्रत है:\n1. **नहाय-खाय** (पवित्र स्नान और कद्दू-भात प्रसाद),\n2. **खरना** (36 घंटे का निर्जला व्रत प्रारंभ, गुड़ की खीर का प्रसाद),\n3. **संध्या अर्घ्य** (डूबते हुए सूर्य और षष्ठी माता को नदी/तालाब में खड़े होकर सूप से अर्घ्य),\n4. **उषा अर्घ्य** (उगते हुए सूर्य को अर्घ्य देकर पारण)।\nइसमें प्रसाद के रूप में शुद्ध घी और आटे से बना 'ठेकुआ' चढ़ाया जाता है।",
            "Chhath Puja is uniquely democratic and scientifically aligned, honoring both the setting and rising sun without priestly intermediaries.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q4", "art_10",
            "असम में मनाए जाने वाले तीन प्रकार के 'बिहू' (Bihu) पर्वों में से कौन-सा बिहू वसंत ऋतु और असमिया नववर्ष के आगमन पर अप्रैल के मध्य में अत्यंत हर्षोल्लास और नृत्य के साथ मनाया जाता है?",
            "Among the three seasonal agricultural Bihu festivals of Assam, which one marks the Assamese New Year and vernal seed-sowing season in mid-April with vibrant folk dances?",
            listOf("काति बिहू (कोंगाली बिहू - अक्टूबर)", "बोहाग बिहू / रोंगाली बिहू (Bohag Bihu / Rongali Bihu - Celebrated in mid-April / Assamese New Year / Dhol, Pepa horn & Bihu Dance)", "माघ बिहू / भोगाली बिहू (जनवरी)", "कंगाली बिहू"),
            listOf("Kati Bihu (Kongali Bihu in Oct - silent prayer in paddy fields)", "Bohag Bihu / Rongali Bihu (Spring festival of merrymaking celebrating fertility, marked by Pepa buffalo horn and colorful Muga silk attire)", "Magh Bihu (Bhogali in Jan - feast of harvest bonfires)", "Kongali Bihu"),
            1,
            "असम में तीन बिहू मनाए जाते हैं:\n1. **रोंगाली/बोहाग बिहू** (अप्रैल) - वसंत का उत्सव, नया साल, ढोल-पेपा के साथ बिहू नृत्य;\n2. **कोंगाली/काति बिहू** (अक्टूबर) - फसलों की सुरक्षा के लिए तुलसी के पौधे और धान के खेतों में आकाशदीप जलाना;\n3. **भोगाली/माघ बिहू** (जनवरी) - फसल कटाई की खुशी में 'भेलाघर' और 'मेजी' (अलाव) जलाकर दावत (उरुका)।",
            "Rongali Bihu is the supreme cultural heartbeat of Assam, radiating joyous youthful vitality and agro-ecological rhythms.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q5", "art_10",
            "तमिलनाडु में चार दिनों तक मनाए जाने वाले फसल कटाई के महापर्व 'पोंगल' (Pongal) के तीसरे दिन कौन-सा विशेष त्यौहार मनाया जाता है, जिसमें पारंपरिक बैलों को वश में करने वाला खेल 'जल्लीकट्टू' (Jallikattu) आयोजित होता है?",
            "On which specific 3rd day of the four-day Tamil harvest festival 'Pongal' are cattle washed and decorated, and the ancient bull-embracing sport 'Jallikattu' (Eru Thazhuvuthal) conducted?",
            listOf("भोगी पोंगल (पहला दिन)", "मट्टू पोंगल (Mattu Pongal - 3rd Day / Worship of Cattle & Bulls / Jallikattu in Alanganallur, Madurai / Thanksgiving to livestock)", "सूर्य पोंगल (दूसरा दिन)", "कानुम पोंगल (चौथा दिन)"),
            listOf("Bhogi Pongal (1st Day - discarding old household items)", "Mattu Pongal (3rd Day - Honoring farm bulls and cows; famous Jallikattu bull-taming tournaments in Madurai district)", "Surya Pongal (2nd Day - boiling new rice in clay pot)", "Kaanum Pongal (4th Day - family reunions)"),
            1,
            "पोंगल के 4 दिन:\n1. **भोगी पोंगल** - इंद्रदेव की पूजा, पुरानी चीजों को अलाव में जलाना;\n2. **सूर्य पोंगल** - नए मिट्टी के बर्तन में नए चावल, दूध और गुड़ का 'पोंगल' पकाना ('पोंगोलो पोंगल');\n3. **मट्टू पोंगल** - कृषि में सहयोग देने वाले बैलों/गायों की पूजा और मदुरै के अलंगनल्लूर में 'जल्लीकट्टू' खेल;\n4. **कानुम पोंगल** - रिश्तेदारों से मिलना और सैर-सपाटा।",
            "Mattu Pongal expresses profound agrarian gratitude toward cattle, immortalized in the ancient Sangam martial sport of Jallikattu.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q6", "art_10",
            "केरल के 10 दिवसीय फसल उत्सव 'ओणम' (Onam - चिंगम मास) के दौरान पौराणिक असुर राजा महाबली के स्वागत में फूलों से बनाई जाने वाली रंगोली को क्या कहा जाता है?",
            "During Kerala's 10-day state harvest festival 'Onam' welcoming the legendary benevolent King Mahabali from the netherworld, what is the intricate floral carpet made on floors called?",
            listOf("अल्पना", "पूककलम (Pookkalam / Athapookkalam - Floral carpet layered from Atham to Thiruvonam day / 26-dish grand feast 'Onasadya')", "कोलम", "रंगोली"),
            listOf("Alpana (Bengal)", "Pookkalam (Intricate concentric circular carpet crafted with fresh seasonal petals, expanding in layers every day until Thiruvonam)", "Kolam (Tamil Nadu)", "Rangoli (Maharashtra)"),
            1,
            "ओणम केरल का सबसे बड़ा उत्सव है, जो 10 दिनों तक चलता है (पहले दिन 'अथम' से 10वें दिन 'तिरुवोणम' तक)। मान्यता है कि भगवान वामन द्वारा पाताल लोक भेजे गए प्रजावत्सल राजा महाबली वर्ष में एक बार अपनी प्रजा से मिलने आते हैं। उनके स्वागत में घरों के आगे 'पूककलम' (फूलों की रंगोली) बनाई जाती है, केले के पत्ते पर 26 व्यंजनों वाली 'ओणसद्या' परोसी जाती है और पंपा नदी में 'वल्लम कली' (सांप जैसी नौका दौड़) होती है।",
            "Onam is an egalitarian celebration of agrarian abundance, mythic justice, and Kerala's pluralistic cultural heritage.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q7", "art_10",
            "सिखों के दसवें गुरु 'गुरु गोविंद सिंह जी' द्वारा 1701 में आनंदपुर साहिब (पंजाब) में होली के अगले दिन सिखों में युद्ध कौशल, घुड़सवारी और 'गतका' (Gatka) के प्रदर्शन हेतु किस उत्सव की शुरुआत की गई थी?",
            "Which spectacular 3-day Sikh martial arts festival was established by Tenth Sikh Guru Gobind Singh Ji in 1701 at Takht Sri Anandpur Sahib following Holi?",
            listOf("बैसाखी", "होला मोहल्ला (Hola Mohalla - Mock battles, Gatka swordsmanship, tent pegging, and equestrian archery by Nihang warriors)", "लोहड़ी", "गुरपर्व"),
            listOf("Baisakhi (Harvest & Khalsa formation)", "Hola Mohalla (Instituted by Guru Gobind Singh at Anandpur Sahib; Nihang Sikhs display peerless Shastar Vidya martial courage and equestrian prowess)", "Lohri", "Gurpurab"),
            1,
            "'होला मोहल्ला' (आनंदपुर साहिब, पंजाब) होली के अगले दिन चेत वदी प्रतिपदा से शुरू होता है। गुरु गोविंद सिंह जी ने सिखों को सैन्य रूप से सशक्त और निडर बनाने के लिए इसकी शुरुआत की थी। इसमें नीले और पीले वस्त्रों से सुसज्जित 'निहंग सिख' (अकाली) नंगी तलवारों, भालों, गदाओं से 'गतका' खेलते हैं, तेज दौड़ते दो घोड़ों पर एक साथ खड़े होकर घुड़सवारी के हैरतअंगेज करतब दिखाते हैं।",
            "Hola Mohalla represents the sovereign spirit of Khalsa chivalry, Shastar Vidya martial traditions, and fraternal community service.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q8", "art_10",
            "उत्तर प्रदेश के ब्रज क्षेत्र में फाल्गुन शुक्ल नवमी को बरसाना और दशमी को नंदगांव में महिलाओं द्वारा पुरुषों पर लाठियों से प्रहार करने वाली विश्व प्रसिद्ध होली कौन-सी है?",
            "Which legendary festival of Braj, Uttar Pradesh, reenacts Radha and Krishna's playful divine pastime with women jokingly hitting men's leather shields with bamboo sticks?",
            listOf("फूलों की होली (वृंदावन)", "लट्ठमार होली (Lathmar Holi of Barsana and Nandgaon - Women of Barsana strike men of Nandgaon with sticks / Drenched in natural Tesu/Gulal)", "छड़ीमार होली (गोकुल)", "कीचड़ होली"),
            listOf("Phoolon ki Holi (Vrindavan)", "Lathmar Holi (Ancient tradition where Barsana women wield lathis while men from Nandgaon defend themselves with animal-hide shields amidst songs of Braj)", "Chhadimar Holi (Gokul)", "Keechad Holi"),
            1,
            "'लट्ठमार होली' बरसाना (राधा जी का गांव) और नंदगांव (श्रीकृष्ण का गांव) में खेली जाती है। मान्यता है कि कृष्ण अपने सखाओं (ग्वालों) के साथ बरसाना में राधा और उनकी सखियों को रंगने आए थे, तब गोपियों ने लाठियों से उन्हें खदेड़ा था। आज भी नंदगांव के हुरियारे बरसाना आते हैं और बरसाना की हुरियारिनें उन पर लाठियों की बरसात करती हैं, जिसे पुरुष ढाल से रोकते हैं।",
            "Lathmar Holi is an unforgettable vibrant manifestation of Braj devotional ecstasy, folk music, and feminine cultural supremacy.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q9", "art_10",
            "छत्तीसगढ़ के बस्तर संभाग में 75 दिनों तक चलने वाला 'विश्व का सबसे लंबा दशहरा' किस स्थानीय अधिष्ठात्री देवी को समर्पित है और यह पारंपरिक रावण दहन से कैसे भिन्न है?",
            "The 75-day Bastar Dussehra in Chhattisgarh—the world's longest festive carnival—is dedicated to which tribal supreme deity, and features no burning of Ravana effigies?",
            listOf("मां बम्लेश्वरी देवी", "मां दंतेश्वरी देवी (Maa Danteshwari - 75-day festival initiated by King Purushottam Dev / Tribals pull massive 8-wheeled wooden Rath without nails)", "मां समलेश्वरी देवी", "मां महामाया देवी"),
            listOf("Maa Bamleshwari", "Maa Danteshwari (Historical festival initiated in the 13th century; tribals from Gond, Maria, Muria tribes craft and pull a giant 8-wheeled double-decker wooden chariot)", "Maa Samaleswari", "Maa Mahamaya"),
            1,
            "बस्तर दशहरा (छत्तीसगढ़) 75 दिनों तक चलता है (सावन अमावस्या 'हरेली' से आश्विन शुक्ल त्रयोदशी तक)। 13वीं सदी में काकतीय राजा पुरुषोत्तम देव ने इसे शुरू किया था। इसमें रावण का पुतला नहीं जलाया जाता, बल्कि बस्तर की आराध्य देवी 'मां दंतेश्वरी' की पूजा होती है। मारिया और मुरिया जनजाति के हजारों लोग बिना लोहे की कील के बना विशाल 8 पहियों वाला लकड़ी का रथ रस्सियों से खींचते हैं।",
            "Bastar Dussehra stands as an extraordinary living synthesis of indigenous Gond tribal customs, nature communion, and royal heritage.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q10", "art_10",
            "मिजोरम राज्य का सबसे बड़ा और सबसे पुराना वसंत कृषि उत्सव 'चापचार कुट' (Chapchar Kut - मार्च) झूम खेती में जंगल साफ करने के बाद मनाया जाता है; इसमें कौन-सा बांस नृत्य प्रमुख आकर्षण है?",
            "Which vibrant spring festival in Mizoram, celebrated in March after clearing bamboo jungles for Jhum slash-and-burn farming, features the world-famous 'Cheraw' Bamboo Dance?",
            listOf("मीम कुट", "चापचार कुट (Chapchar Kut - Mizoram's Grandest Spring Festival / Cheraw Bamboo Dance performed in colourful Puanchei dress)", "थालफावांग कुट", "पॉल कुट"),
            listOf("Mim Kut", "Chapchar Kut (Oldest and most joyous Mizo festival of music and feasting; dancers step nimbly between clashing horizontal bamboo staves in Cheraw dance)", "Thalfavang Kut", "Pawl Kut (Harvest festival)"),
            1,
            "'चापचार कुट' (Chapchar Kut) मिजोरम का सबसे लोकप्रिय त्यौहार है। जब किसान झूम खेती के लिए जंगलों के बांस काटकर सुखाने के लिए छोड़ देते हैं, तब मार्च में यह उत्सव मनाया जाता है। इसका मुख्य आकर्षण 'चेराव नृत्य' (Cheraw Dance / Bamboo Dance) है, जिसमें पुरुष बांस की डंडियों को लयबद्ध तरीके से जमीन पर टकराते हैं और युवतियां पारंपरिक 'पुआनचेई' पोशाक पहनकर बांस के बीच फुर्ती से थिरकती हैं।",
            "Chapchar Kut embodies the communal harmony, hospitality, and intricate acrobatic bamboo choreography of the Mizo people.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q11", "art_10",
            "मेघालय के गारो हिल्स में गारो (Garo) जनजाति द्वारा सूर्य देवता 'सालजोंग' (Saljong) को फसल समर्पित करने हेतु नवंबर में मनाया जाने वाला '100 ड्रमों का उत्सव' (100 Drums Festival) कौन-सा है?",
            "Which grand post-harvest festival of the Garo tribe in Meghalaya, dedicated to Sun God Saljong (giver of fertility), is famously called the '100 Drums Festival'?",
            listOf("नोंगक्रेम नृत्य उत्सव", "वांगला महोत्सव (Wangala Festival / 100 Drums Festival - Garo Tribe / Men beat 100 long Dama drums while women perform graceful bird-like dance)", "शाद सुक मिनसिएम", "बेहदेइनखलम"),
            listOf("Nongkrem Dance (Khasi)", "Wangala Festival (The celebrated post-harvest thanksgiving where 100 synchronized Dama long drums echo across hills with dancers in feathered headdresses)", "Shad Suk Mynsiem", "Behdienkhlam (Jaintia)"),
            1,
            "'वांगला महोत्सव' (Wangala Festival) गारो जनजाति का सबसे बड़ा फसल कटाई का त्यौहार है। यह मेघालय के गारो हिल्स और असम में मनाया जाता है। इसमें 100 पुरुष एक साथ लंबे अंडाकार ढोल ('दामा') गले में लटकाकर ताल मिलाते हैं और महिलाएं पारंपरिक 'दोकमांदा' पोशाक और पंखों वाले मुकुट पहनकर पक्षियों की तरह नृत्य करती हैं।",
            "Wangala Festival is an exhilarating sonic and visual spectacle preserving ancient Garo animist thanksgiving rituals to the Sun deity.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q12", "art_10",
            "हरियाणा के फरीदाबाद में प्रतिवर्ष 1 से 15 फरवरी के मध्य आयोजित होने वाला 'विश्व का सबसे बड़ा हस्तशिल्प मेला' कौन-सा है, जिसमें प्रतिवर्ष एक थीम राज्य और एक साझेदार राष्ट्र चुना जाता है?",
            "Which world-renowned annual crafts fair in Faridabad, Haryana, organized since 1987 by Haryana Tourism, is acclaimed as the largest international crafts mela in the world?",
            listOf("दिल्ली हाट मेला", "सूरजकुंड अंतरराष्ट्रीय शिल्प मेला (Surajkund International Crafts Mela - World's largest crafts fair / Spotlights Indian handlooms, folk crafts & partner nations)", "ग्वालियर व्यापार मेला", "पुष्कर शिल्प मेला"),
            listOf("Dilli Haat Mela", "Surajkund International Crafts Mela (Faridabad; mammoth artisan exposition celebrating traditional rural handicrafts, handlooms, and global folk performing arts)", "Gwalior Trade Fair", "Pushkar Crafts Fair"),
            1,
            "सूरजकुंड अंतरराष्ट्रीय शिल्प मेला (फरीदाबाद, हरियाणा) 10वीं सदी के तोमर राजा सूरजमल द्वारा निर्मित ऐतिहासिक जलाशय 'सूरजकुंड' के पास लगता है। यह दुनिया का सबसे बड़ा हस्तशिल्प मेला है। इसमें भारत के सभी राज्यों और 40 से अधिक देशों के बुनकर, मूर्तिकार और दस्तकार अपनी कलाकृतियों की प्रदर्शनी लगाते हैं।",
            "Surajkund Crafts Mela is a glorious global showcase of India's living handloom heritage, rural craftsmanship, and culinary diversity.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q13", "art_10",
            "पश्चिमी ओडिशा में गणेश चतुर्थी के अगले दिन नए कटे हुए धान (New Rice) के चावल से बने पहले भोजन को अधिष्ठात्री देवी 'मां समलेश्वरी' को समर्पित करने वाला प्रमुख कृषि त्यौहार कौन-सा है?",
            "Which major agricultural and social thanksgiving festival of Western Odisha, celebrated on the day following Ganesh Chaturthi, honors the consumption of the season's first harvested rice?",
            listOf("राजा परबा (Raja Parba)", "नुआखाई (Nuakhai / Nuakhai Juhar - 'Nua' means new and 'Khai' means food / Offering Nabanna to Goddess Samaleswari in Sambalpur)", "बाली जात्रा (कटक)", "शीतल षष्ठी"),
            listOf("Raja Parba (Earth celebration)", "Nuakhai (Agrarian thanksgiving festival celebrated in Sambalpur, Kalahandi, Bolangir; families unite for 'Nuakhai Juhar' greetings and Sambalpuri folk dance)", "Bali Jatra (Cuttack)", "Sheetal Sasthi"),
            1,
            "'नुआखाई' (Nuakhai) पश्चिमी ओडिशा (संबलपुर, बलांगीर आदि) का सबसे बड़ा लोकपर्व है। 'नुआ' का अर्थ नया और 'खाई' का अर्थ खाना होता है। इस दिन किसान अपने खेतों से नए धान की पहली बाली लाकर उसका 'नबान्न' (खीर/प्रसाद) संबलपुर की मां समलेश्वरी देवी को अर्पित करते हैं। इसके बाद परिवार के सभी लोग एक साथ भोजन करते हैं और छोटों द्वारा बड़ों का चरण स्पर्श कर 'नुआखाई जुहार' कहा जाता है।",
            "Nuakhai fosters deep familial solidarity, agricultural sanctity, and vibrant Sambalpuri folk culture.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q14", "art_10",
            "ओडिशा के कटक में महानदी के तट पर गदगदिया घाट पर कार्तिक पूर्णिमा से 8 दिनों तक चलने वाला 'एशिया का सबसे बड़ा खुला व्यापार मेला' कौन-सा है, जो प्राचीन कलिंग नाविकों की बाली, जावा और सुमात्रा समुद्री व्यापार यात्राओं की स्मृति में मनाया जाता है?",
            "Which massive 8-day open-air trade fair in Cuttack on the Mahanadi River banks commemorates the ancient maritime voyage of Kalinga merchants (Sadhabas) to Bali, Java, and Sumatra on Boita Bandana?",
            listOf("कोणार्क महोत्सव", "बाली जात्रा (Bali Jatra / Bali Yatra - 'Voyage to Bali' / Asia's largest open-air business and cultural trade fair on Mahanadi banks)", "धनु जात्रा (बरगढ़)", "पुरी बीच फेस्टिवल"),
            listOf("Konark Dance Festival", "Bali Jatra (Grand historical maritime trade carnival marking Boita Bandana when miniature paper boats with lamps are floated into Mahanadi)", "Dhanu Jatra (Bargarh)", "Puri Beach Festival"),
            1,
            "'बाली जात्रा' (कटक, ओडिशा) प्राचीन कलिंग के समृद्ध समुद्री इतिहास की याद दिलाता है। कार्तिक पूर्णिमा के दिन प्राचीन कालिंग व्यापारी ('सधवा') 'बोइता' (बड़ी जहाजों) में व्यापार के लिए इंडोनेशिया के बाली, सुमात्रा, जावा और श्रीलंका जाते थे। इस दिन लोग महानदी में रंगीन कागजी नावें ('बोइता बंदाणा') तैराते हैं। यह एशिया के सबसे विशाल खुले मेलों में से एक है।",
            "Bali Jatra is an enduring testimony to ancient India's glorious seafaring legacy and trans-oceanic Indian Ocean maritime trade.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_10_m6_q15", "art_10",
            "ओडिशा के बरगढ़ में प्रतिवर्ष जनवरी में आयोजित होने वाला 'धनु जात्रा' (Dhanu Jatra) किस कारण से गिनीज बुक और दुनिया भर में प्रसिद्ध है?",
            "Why is the 11-day annual cultural festival 'Dhanu Jatra' of Bargarh, Odisha, celebrated as a unique world record in theatre?",
            listOf("यह केवल महिलाओं द्वारा अभिनीत नाटक है", "यह 8 वर्ग किमी क्षेत्र में फैला 'विश्व का सबसे बड़ा खुला रंगमंच' (World's Largest Open-Air Theatre) है जहाँ पूरा शहर कृष्ण-कंस प्रसंग का मंच बन जाता है", "यह विश्व का सबसे लंबा मूक नाटक है", "यह केवल कठपुतलियों द्वारा खेला जाता है"),
            listOf("Women-only play", "World's Largest Open-Air Theatre (Spanning an 8 sq km radius where Bargarh municipality turns into Mathura, Jeera river into Yamuna, and Ambapali into Gopapura)", "Longest silent drama", "Puppet only drama"),
            1,
            "'धनु जात्रा' (बरगढ़, ओडिशा) को दुनिया का सबसे बड़ा ओपन-एयर थिएटर माना जाता है। 11 दिनों तक पूरा बरगढ़ शहर प्राचीन 'मथुरा नगरी' बन जाता है, जीरा नदी 'यमुना' बन जाती है और अंबापाली गांव 'गोपपुर' बन जाता है। इस दौरान राजा कंस का किरदार निभाने वाला कलाकार पूरे शहर पर प्रतीकात्मक रूप से हुक्म चलाता है और कृष्ण-लीला का विशाल जीवंत मंचन होता है।",
            "Dhanu Jatra is a phenomenal community open-air performance blurring the lines between mythical theatre and everyday reality.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_10", 7, 10, baseQuestions)
    }
}
