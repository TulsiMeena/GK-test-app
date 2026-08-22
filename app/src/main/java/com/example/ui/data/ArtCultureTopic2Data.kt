package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic2Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeArtCultureQ(
            "art_2_m1_q1", "art_2",
            "कर्नाटक का प्रसिद्ध पारंपरिक लोक नृत्य-नाट्य कौन-सा है जिसमें रात भर खुले मंच पर रामायण-महाभारत की गाथाओं का भव्य वेशभूषा, मुकुट और 'भागवत' के गायन के साथ मंचन किया जाता है?",
            "Which iconic folk theatre and dance-drama tradition of Karnataka features elaborate costumes, magnificent headgears (Mudi), and all-night performances guided by a Bhagavatha?",
            listOf("थेरुक्कूथु", "यक्षगान (Yakshagana - Karnataka / Coastal & Malenadu regions / 'Music of celestial beings')", "तमाशा", "नौटंकी"),
            listOf("Therukoothu", "Yakshagana (Traditional theatre form combining dance, music, dialogue, costume, and stagecraft; features Himmela and Mummela troupes)", "Tamasha", "Nautanki"),
            1,
            "यक्षगान (यक्षों का गान) कर्नाटक के तटीय (उडुपी, दक्षिण कन्नड़) और मलनाड क्षेत्रों का 500 वर्ष पुराना लोक नाट्य है। इसमें भागवत (गायक/निर्देशक), चंडे और मद्दल तालवादक तथा रंग-बिरंगे वेशधारी पात्र होते हैं।",
            "Yakshagana is a vibrant folk theatre form native to Karnataka depicting mythological epics with grand rhetorical delivery and acrobatic dance.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q2", "art_2",
            "पंजाब का कौन-सा अत्यंत ऊर्जावान लोक नृत्य पारंपरिक रूप से पुरुषों द्वारा वैशाखी के फसल कटाई उत्सव पर ढोल की थाप पर किया जाता है?",
            "Which high-energy folk dance of Punjab is traditionally performed by men to celebrate the spring harvest of Baisakhi to the resonant beats of the Dhol?",
            listOf("गिद्धा (महिलाओं द्वारा)", "भांगड़ा (Bhangra - Punjab / Harvest dance / Dhol, Chimta & Algoza instruments)", "झूमर", "धमाल"),
            listOf("Giddha (Women's folk dance)", "Bhangra (Dynamic folk dance celebrating harvest, characterized by athletic kicks, leaps, and Boliya lyrics)", "Jhoomar", "Dhamal"),
            1,
            "भांगड़ा पंजाब का विश्वविख्यात पुरुष लोक नृत्य है जो वैशाखी पर गेहूं की फसल कटाई की खुशी में किया जाता है। महिलाओं का समकक्ष नृत्य 'गिद्धा' (Giddha) है, जिसमें तालियां और बोलियां गाई जाती हैं।",
            "Bhangra is Punjab's most popular folk dance form, celebrated worldwide for its infectious rhythm, vibrant turban attire, and joyful athletic vitality.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q3", "art_2",
            "गुजरात का प्रसिद्ध लोक नृत्य कौन-सा है जो नवरात्रि के नौ दिनों में मिट्टी के छिद्रित दीपक (गर्भ-दीप) या मां दुर्गा की मूर्ति के चारों ओर तालियों की थाप पर वृत्ताकार रूप में किया जाता है?",
            "Which iconic folk dance of Gujarat was inscribed on UNESCO's Representative List of Intangible Cultural Heritage in December 2023, performed in circles during Navratri?",
            listOf("डांडिया रास", "गरबा (Garba - Gujarat / UNESCO Intangible Cultural Heritage Dec 2023 / Performed around Garbha Deep)", "टिप्पणी", "भवई"),
            listOf("Dandiya Raas", "Garba (Derived from Sanskrit 'Garbha' meaning womb; inscribed by UNESCO as Intangible Cultural Heritage of Humanity in 2023)", "Tippani", "Bhavai"),
            1,
            "गरबा (संस्कृत 'गर्भ') गुजरात का पारंपरिक लोक नृत्य है। दिसंबर 2023 में यूनेस्को ने गरबा को मानवता की अमूर्त सांस्कृतिक विरासत सूची में शामिल किया। डांडिया रास में लकड़ी की छड़ियों (डांडिया) का प्रयोग होता है।",
            "Garba is a devotional community folk dance of Gujarat performed in concentric circles honoring the feminine energy of Goddess Durga during Navratri.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q4", "art_2",
            "असम का सबसे लोकप्रिय और प्रमुख लोक नृत्य कौन-सा है जो साल में तीन बार फसलों के विभिन्न चरणों में युवा लड़के-लड़कियों द्वारा ढोल, पेपा (भैंस के सींग की बांसुरी) और गोगोना पर किया जाता है?",
            "Which is the primary folk dance of Assam, performed during spring (Rongali/Bohag), autumn (Kongali/Kati), and winter (Bhogali/Magh) to the sounds of Dhol and Pepa?",
            listOf("बगुरूम्बा (बोडो)", "बिहू नृत्य (Bihu Dance - Assam / Rongali Bihu in April / Dhol, Pepa, Toka, Gogona)", "झूमर", "भोरताल"),
            listOf("Bagurumba (Bodo tribe)", "Bihu Dance (Characterized by rapid hand movements, rhythmic hip sways, and traditional Muga silk Mekhela Chador)", "Jhumur", "Bhortal"),
            1,
            "बिहू असम का राष्ट्रीय लोक नृत्य है। रोंगाली बिहू (अप्रैल - नया साल व बुवाई), कोंगाली बिहू (अक्टूबर - सुरक्षा) और भोगाली बिहू (जनवरी - फसल कटाई) पर बिहू नृत्य किया जाता है। पेपा (भैंस के सींग का वाद्य) इसकी पहचान है।",
            "Bihu is the quintessential folk dance of Assam, symbolizing agrarian fertility, romance, and seasonal renewal in the Brahmaputra valley.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q5", "art_2",
            "राजस्थान का कौन-सा विश्वप्रसिद्ध लोक नृत्य पारंपरिक रूप से 'कालबेलिया' (सपेरा) समुदाय की महिलाओं द्वारा काले घाघरे में सांप की लचीली मुद्राओं की नकल करते हुए पुंगी की धुन पर किया जाता है (UNESCO 2010)?",
            "Which world-famous Rajasthani folk dance, performed by women of the snake-charmer Kalbelia community in swirling black lehengas, was inscribed on UNESCO's Intangible Heritage list in 2010?",
            listOf("घूमर", "कालबेलिया नृत्य / सपेरा नृत्य (Kalbelia Dance - Rajasthan / UNESCO 2010 / Gulabo Sapera)", "तेरहताली", "चरी नृत्य"),
            listOf("Ghoomar", "Kalbelia Dance (Sensuous serpent-mimicking folk dance accompanied by Poongi / Been and Khanjari percussion; Gulabo Sapera is legendary exponent)", "Terah Taali", "Chari Dance"),
            1,
            "कालबेलिया नृत्य राजस्थान के सपेरा समुदाय का पारंपरिक नृत्य है। गुलाबो सपेरा ने इसे वैश्विक मंचों पर पहुंचाया। यूनेस्को ने 2010 में इसे अमूर्त सांस्कृतिक विरासत का दर्जा दिया।",
            "Kalbelia is a mesmerizing folk dance of Rajasthan celebrated for its serpentine acrobatics, rhythmic Khanjari clatter, and shimmering embroidered costumes.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q6", "art_2",
            "राजस्थान का पारंपरिक राजसी लोक नृत्य 'घूमर' (Ghoomar) मूल रूप से किस जनजाति द्वारा मां सरस्वती और देवी दुर्गा की पूजा के लिए शुरू किया गया था?",
            "The royal folk dance 'Ghoomar' of Rajasthan, known for pirouetting dancers in flared skirts, was originally developed by which indigenous tribal community?",
            listOf("मीणा जनजाति", "भील जनजाति (Bhil Tribe of Rajasthan - Originally performed to worship Goddess Saraswati)", "गरासिया जनजाति", "सहरिया जनजाति"),
            listOf("Meena tribe", "Bhil Tribe (Later adopted and patronized by Rajput royal courts as a celebratory ladies' dance)", "Garasia tribe", "Sahariya tribe"),
            1,
            "घूमर नृत्य की उत्पत्ति भील जनजाति में हुई थी, जिसे बाद में राजपूत रानियों ने अपनाया। इसमें महिलाएं घूंघट ओढ़कर गोल-गोल घूमती हैं (घूमना = घूमर)।",
            "Ghoomar originated among the Bhil tribe and evolved into a celebrated royal dance of aristocratic Rajasthani culture.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q7", "art_2",
            "महाराष्ट्र का सबसे लोकप्रिय लोक नाट्य एवं संगीत रूप 'तमाशा' (Tamasha) और उसमें प्रस्तुत किया जाने वाला तेज गति का कामुक एवं श्रृंगारिक नृत्य कौन-सा है?",
            "What is the fast-paced, rhythmic, and expressive dance that forms the soul of Maharashtra's traditional folk theatre 'Tamasha', accompanied by Dholki?",
            listOf("कोली नृत्य", "लावणी (Lavani - Maharashtra / Performed to Dholki beats in nine-yard Nauvari saree / Shringar rasa)", "लेजिम", "गोंधल"),
            listOf("Koli dance", "Lavani (Traditional dance form of Maharashtra noted for its powerful rhythm, spicy eroticism, and social satire in Tamasha)", "Lejim", "Gondhal"),
            1,
            "लावणी (संस्कृत 'लावण्य' = सौंदर्य) महाराष्ट्र का प्रसिद्ध लोक नृत्य है। यह 9 गज की नौवारी साड़ी में ढोलकी की थाप पर प्रस्तुत किया जाता है और तमाशा लोक नाट्य का प्रमुख आकर्षण है।",
            "Lavani is Maharashtra's most celebrated folk dance, combining pulsating percussion with satirical narrative songs and expressive gestures.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q8", "art_2",
            "उत्तर प्रदेश का अत्यंत लोकप्रिय पारंपरिक लोक नाट्य कौन-सा है जिसमें खुले मंच पर दोहा, चौबोला और बहरे-तवील में संवाद गाए जाते हैं और हाथरस व कानपुर इसके मुख्य केंद्र हैं?",
            "Which prominent folk theatre form of Northern India (especially Uttar Pradesh) features poetic dialogues in Doha and Chaubola styles, with Hathras and Kanpur being major schools?",
            listOf("तमाशा", "नौटंकी (Nautanki - Uttar Pradesh / Hathras & Kanpur schools / Sangeet / Nagara & Dholak)", "माच", "भांड पाथेर"),
            listOf("Tamasha", "Nautanki (Operatic street theatre of UP accompanied by loud Nagara kettledrum, harmonium, and dholak)", "Maach", "Bhand Pather"),
            1,
            "नौटंकी उत्तर भारत (विशेषकर उत्तर प्रदेश) का लोकप्रिय लोक नाटक है। इसके दो मुख्य घराने हैं: हाथरस शैली (गायन प्रधान) और कानपुर शैली (नाटकीय संवाद प्रधान)। नगाड़ा इसका मुख्य वाद्य है।",
            "Nautanki is the principal secular folk theatre of the Hindi heartland, delivering high-decibel musical drama and folk romances.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q9", "art_2",
            "पूर्वी भारत (पश्चिम बंगाल, झारखंड और ओडिशा) का कौन-सा मुखौटा युक्त अर्ध-शास्त्रीय मार्शल नृत्य यूनेस्को (UNESCO 2010) की अमूर्त विरासत सूची में शामिल है?",
            "Which martial mask-dance tradition of Eastern India (practiced in Purulia, Seraikella, and Mayurbhanj styles across WB, Jharkhand, and Odisha) is inscribed by UNESCO?",
            listOf("पैका नृत्य", "छऊ नृत्य (Chhau Dance - UNESCO 2010 / Seraikella, Purulia & Mayurbhanj styles)", "करमा नृत्य", "झुमइर"),
            listOf("Paika dance", "Chhau Dance (Martial folk dance enacting mythological episodes with acrobatics, vigorous footwork, and clay/papier-mâché masks)", "Karma dance", "Jhumair"),
            1,
            "छऊ नृत्य की तीन शैलियां हैं: 1. पुरुलिया छऊ (पं. बंगाल - विशाल मुखौटे), 2. सरायकेला छऊ (झारखंड - प्रतीकात्मक मुखौटे), 3. मयूरभंज छऊ (ओडिशा - बिना मुखौटे का)। इसे संस्कृति मंत्रालय 9वां शास्त्रीय नृत्य भी मानता है।",
            "Chhau is a spectacular martial arts dance tradition of Eastern India, recognized by UNESCO in 2010 for its acrobatic vigor and artistic masks.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q10", "art_2",
            "मध्य प्रदेश का राज्य लोक नाट्य (State Folk Theatre) कौन-सा है जो मालवा क्षेत्र में खुले मंच पर ढोलक और सारंगी की संगत में मंचित किया जाता है?",
            "Which is the official state folk theatre form of Madhya Pradesh, native to the Malwa region and performed on a raised stage called 'Maach'?",
            listOf("नौटंकी", "माच (Maach - Madhya Pradesh / Malwa region / Derived from Sanskrit 'Manch')", "तमाशा", "रासलीला"),
            listOf("Nautanki", "Maach (Folk theatre originating in Ujjain/Malwa; involves poetic dialogue songs called 'Rangtoli')", "Tamasha", "Raasleela"),
            1,
            "माच (संस्कृत 'मंच' से) मध्य प्रदेश के मालवा क्षेत्र (उज्जैन, इंदौर) का 200 वर्ष पुराना पारंपरिक लोक नाट्य है। गुरु गोपाल जी को मालवा में माच का प्रवर्तक माना जाता है।",
            "Maach is the indigenous lyrical folk theatre tradition of Madhya Pradesh's Malwa region.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q11", "art_2",
            "जम्मू और कश्मीर का पारंपरिक व्यंग्यात्मक लोक नाट्य कौन-सा है जिसमें कृषि समाज, सामाजिक कुरीतियों और नौकरशाही पर हास्य-व्यंग्य किया जाता है?",
            "Which traditional satirical folk theatre of Jammu and Kashmir is performed by the folk entertainers called 'Bhands' with Surnai and Dhol?",
            listOf("रऊफ नृत्य", "भांड पाथेर (Bhand Pather - Jammu & Kashmir / Traditional satiric folk theatre)", "कुड नृत्य", "हफीजा"),
            listOf("Rouf dance", "Bhand Pather (Open-air street comedy depicting contemporary social evils, historical anecdotes, and administrative corruption)", "Kud dance", "Hafiza"),
            1,
            "भांड पाथेर (भांड = हास्य कलाकार, पाथेर = नाटक) कश्मीर घाटी का पारंपरिक लोक नाट्य है। इसमें सुरनाई (शहनाई जैसी) और ढोल की थाप पर व्यंग्य और हास्य प्रस्तुत किया जाता है।",
            "Bhand Pather is the traditional community folk theatre of Kashmir combining mimicry, slapstick comedy, and sharp social commentary.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q12", "art_2",
            "केरल की प्रसिद्ध अनुष्ठानिक और मंदिर नृत्य-नाट्य परंपरा 'थैय्यम' (Theyyam / कलियाट्टम) मुख्य रूप से किस क्षेत्र में पूर्वजों और स्थानीय देवताओं के आह्वान के लिए की जाती है?",
            "Which spectacular sacred ritual dance tradition of North Kerala (Malabar region) involves performers transforming into living deities through colossal vibrant headdresses?",
            listOf("कुटियाट्टम", "थैय्यम / कलियाट्टम (Theyyam - North Malabar, Kerala / Living Deities / Over 400 types of Theyyams)", "मुदियेट्टु (UNESCO 2010)", "चाक्यार कूथु"),
            listOf("Koodiyattam", "Theyyam (Ancient ritualistic folk worship where performers don elaborate costumes and face-paint to channel ancestral spirits)", "Mudiyettu (UNESCO Intangible Heritage 2010)", "Chakyar Koothu"),
            1,
            "थैय्यम (संस्कृत 'दैवम' = देवता) उत्तरी केरल (कन्नूर, कासरगोड) की 1500+ वर्ष पुरानी अनुष्ठानिक नृत्य कला है। इसमें 400 से अधिक प्रकार के थैय्यम होते हैं जिसमें नर्तक को साक्षात देवता मानकर पूजा जाता है।",
            "Theyyam is an extraordinary living ritual art of Kerala where the performer is believed to become the deity itself during the trance dance.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q13", "art_2",
            "राजस्थान की विश्वप्रसिद्ध 'कठपुतली' (Kathputli) कला किस प्रकार की कठपुतली परंपरा का प्रतिनिधित्व करती है?",
            "Rajasthan's centuries-old 'Kathputli' puppetry tradition belongs to which specific mechanical category of traditional Indian puppetry?",
            listOf("छाया कठपुतली (Shadow puppet)", "धागा कठपुतली / सूत्र कठपुतली (String Puppet / Marionette - Kathputli of Rajasthan made of mango wood)", "दस्ताना कठपुतली (Glove puppet)", "छड़ कठपुतली (Rod puppet)"),
            listOf("Shadow puppet", "String Puppet / Marionette (Carved from lightweight mango wood and manipulated using strings tied to fingers; accompanied by Dholak and whistling whistle/boli)", "Glove puppet", "Rod puppet"),
            1,
            "राजस्थान की कठपुतली (काठ = लकड़ी, पुतली = गुड़िया) धागा कठपुतली (String Puppet) है। इसे नट और भाट समुदाय द्वारा मंचित किया जाता है। प्रसिद्ध प्रसंग 'अमर सिंह राठौड़' की शौर्य गाथा है।",
            "Kathputli is the vibrant string-marionette tradition of Rajasthan carved from wood and brought to life through intricate finger manipulation.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q14", "art_2",
            "आंध्र प्रदेश की 'थोलू बोम्मलाटा' (Tholu Bommalata) और कर्नाटक की 'तोगलु गोम्बेआटा' किस प्रकार की कठपुतली कला के उत्कृष्ट उदाहरण हैं?",
            "The ancient folk traditions 'Tholu Bommalata' of Andhra Pradesh and 'Togalu Gombeyaata' of Karnataka are world-renowned forms of which puppetry type?",
            listOf("धागा कठपुतली", "छाया कठपुतली (Shadow Puppetry - Translucent leather puppets projected onto a backlit white screen)", "दस्ताना कठपुतली", "छड़ कठपुतली"),
            listOf("String puppetry", "Shadow Puppetry (Puppets crafted from treated deer/goat leather, painted with vegetable dyes and projected against an illuminated cotton sheet)", "Glove puppetry", "Rod puppetry"),
            1,
            "थोलू बोम्मलाटा (आंध्र) और तोगलु गोम्बेआटा (कर्नाटक) चमड़े की पारदर्शी छाया कठपुतली (Shadow Puppets) हैं। केरल में इसे 'तोलपावक्कूथु' और ओडिशा में 'रावणछाया' कहते हैं।",
            "Shadow puppetry in South India uses translucent, colorfully painted leather figures to project epic silhouettes on a lit screen.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_2_m1_q15", "art_2",
            "गोवा का सबसे प्रसिद्ध लोक नृत्य कौन-सा है जो सिग्मो (Shigmo / वसंत उत्सव) पर तलवार और दीयों के साथ रंग-बिरंगे परिधानों में प्रस्तुत किया जाता है?",
            "Which is the most popular folk dance of Goa, performed by women during Dhalo or during the Shigmo spring carnival holding brass lamps or carrying pots on head?",
            listOf("कोली नृत्य", "फुगड़ी और ढालो (Fugdi & Dhalo - Goa / Shigmo Festival / Tarangamel & Dhangar)", "टिप्पणी", "गरबा"),
            listOf("Koli dance", "Fugdi and Dhalo (Fugdi is an energetic Goan folk dance performed in circular/row formations during Hindu and Christian festivals)", "Tippani", "Garba"),
            1,
            "फुगड़ी (Fugdi) और ढालो गोवा के सबसे लोकप्रिय लोक नृत्य हैं। फुगड़ी महिलाएं गणेश चतुर्थी और सिग्मो पर तेज गति से गोलाकार घूमते हुए प्रस्तुत करती हैं। अन्य गोवा नृत्य: तरंगमेल, देखनी, कोरिदंघो।",
            "Fugdi is a vivacious Goan folk dance performed with rapid rhythmic clapping and footwork during religious and seasonal celebrations.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_2", 2, 5, baseQuestions)
    }
}
