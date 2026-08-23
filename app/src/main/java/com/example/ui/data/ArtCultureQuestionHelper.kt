package com.example.ui.data

import com.example.ui.model.GkQuestion

object ArtCultureQuestionHelper {
    fun makeArtQ(
        id: String,
        subtopicId: String,
        qHi: String,
        qEn: String,
        optsHi: List<String>,
        optsEn: List<String>,
        correctIdx: Int,
        expHi: String,
        expEn: String,
        diff: String = "Moderate"
    ): GkQuestion {
        return GkQuestion(
            id = id,
            category = "Art & Culture",
            categoryId = "art_culture",
            subtopic = subtopicId,
            questionHindi = qHi,
            questionEnglish = qEn,
            optionsHindi = optsHi,
            optionsEnglish = optsEn,
            correctAnswerIndex = correctIdx,
            explanationHindi = expHi,
            explanationEnglish = expEn,
            difficulty = diff
        )
    }

    fun makeArtCultureQ(
        id: String,
        subtopicId: String,
        qHi: String,
        qEn: String,
        optsHi: List<String>,
        optsEn: List<String>,
        correctIdx: Int,
        expHi: String,
        expEn: String,
        diff: String = "Moderate"
    ): GkQuestion = makeArtQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)

    fun generateTopicMocks(
        subtopicId: String,
        startMock: Int,
        endMock: Int,
        templateQuestions: List<GkQuestion>
    ): List<GkQuestion> {
        val result = mutableListOf<GkQuestion>()
        val cleanTopic = subtopicId.removePrefix("art_")

        for (mock in startMock..endMock) {
            val questionsForMock = getUniqueQuestionsForMock(subtopicId, cleanTopic, mock)
            result.addAll(questionsForMock)
        }
        return result
    }

    private fun getUniqueQuestionsForMock(subtopicId: String, cleanTopic: String, mock: Int): List<GkQuestion> {
        val qList = mutableListOf<GkQuestion>()
        for (qNum in 1..15) {
            val qId = "art_${cleanTopic}_m${mock}_q$qNum"
            val (qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff) = getQuestionData(cleanTopic, mock, qNum)
            qList.add(
                makeArtQ(
                    id = qId,
                    subtopicId = subtopicId,
                    qHi = qHi,
                    qEn = qEn,
                    optsHi = optsHi,
                    optsEn = optsEn,
                    correctIdx = ansIdx,
                    expHi = expHi,
                    expEn = expEn,
                    diff = diff
                )
            )
        }
        return qList
    }

    private data class QPayload(
        val qHi: String,
        val qEn: String,
        val optsHi: List<String>,
        val optsEn: List<String>,
        val ansIdx: Int,
        val expHi: String,
        val expEn: String,
        val diff: String
    )

    private fun getQuestionData(topicNum: String, mock: Int, qNum: Int): QPayload {
        return when (topicNum) {
            "1" -> getArtTopic1Data(mock, qNum)
            "2" -> getArtTopic2Data(mock, qNum)
            "3" -> getArtTopic3Data(mock, qNum)
            "4" -> getArtTopic4Data(mock, qNum)
            "5" -> getArtTopic5Data(mock, qNum)
            "6" -> getArtTopic6Data(mock, qNum)
            "7" -> getArtTopic7Data(mock, qNum)
            "8" -> getArtTopic8Data(mock, qNum)
            "9" -> getArtTopic9Data(mock, qNum)
            "10" -> getArtTopic10Data(mock, qNum)
            else -> getArtTopic1Data(mock, qNum)
        }
    }

    // TOPIC 1: Classical Dances & Exponents
    private fun getArtTopic1Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 15 + qNum)
        val questions = listOf(
            QPayload(
                "भरतनाट्यम (Bharatnatyam) भारत के किस राज्य का शास्त्रीय नृत्य है जिसका प्राचीन नाम 'सादिर' (Sadir Attam) था?",
                "Bharatnatyam, originally nurtured in temple sanctums as 'Sadir Attam', is the classical dance of which Indian state?",
                listOf("तमिलनाडु (Tamil Nadu)", "केरल", "कर्नाटक", "आंध्र प्रदेश"),
                listOf("Tamil Nadu", "Kerala", "Karnataka", "Andhra Pradesh"),
                0, "भरतनाट्यम तमिलनाडु का प्राचीनतम शास्त्रीय नृत्य है। रुक्मिणी देवी अरुंडेल ने इसे पुनर्जीवित कर 'कलाशेत्र' की स्थापना की।",
                "Bharatnatyam traces its origins to temple devadasis of Tamil Nadu, revitalized by Rukmini Devi Arundale.", "Easy"
            ),
            QPayload(
                "उत्तर भारत (विशेषकर उत्तर प्रदेश) का एकमात्र शास्त्रीय नृत्य कौन-सा है जिसमें 'तत्कार' और चक्कर प्रमुख होते हैं?",
                "Which is the sole classical dance form native to Northern India (Uttar Pradesh), defined by intricate footwork (Tatkar)?",
                listOf("कथक (Kathak - Lucknow & Jaipur Gharana)", "कथकली", "ओडिसी", "कुचिपुड़ी"),
                listOf("Kathak", "Kathakali", "Odissi", "Kuchipudi"),
                0, "कथक की उत्पत्ति कथावाचकों से हुई। पंडित बिरजू महाराज, लच्छू महाराज और सितारा देवी इसके शीर्ष हस्ताक्षर रहे।",
                "Kathak evolved through storytellers in North India, celebrated across Jaipur and Lucknow Gharanas.", "Easy"
            ),
            QPayload(
                "सत्रीया (Sattriya) नृत्य को संगीत नाटक अकादमी द्वारा 2000 में शास्त्रीय नृत्य का दर्जा दिया गया। इसके प्रवर्तक 15वीं सदी के कौन-से वैष्णव संत थे?",
                "Who was the 15th-century Vaishnavite saint-reformer who instituted Sattriya dance in Assam's monastic Sattras?",
                listOf("श्रीमंत शंकरदेव (Srimanta Sankardev)", "माधवदेव", "चैतन्य महाप्रभु", "वल्लभाचार्य"),
                listOf("Srimanta Sankardev", "Madhavdev", "Chaitanya Mahaprabhu", "Vallabhacharya"),
                0, "श्रीमंत शंकरदेव ने असम में वैष्णव धर्म के प्रचार और सत्रों (मठों) में भक्ति प्रदर्शन हेतु सत्रीया नृत्य और बोरगीत की रचना की।",
                "Srimanta Sankardev pioneered Sattriya dance in Assam in the 15th century as a medium of spiritual devotion.", "Easy"
            ),
            QPayload(
                "केरल का प्रसिद्ध शास्त्रीय नृत्य कौन-सा है जिसमें चेहरे पर हरा रंग (पच्चा - सात्विक चरित्र) और भारी मुकुट पहना जाता है?",
                "Which classical dance-drama of Kerala is renowned for stylized facial makeup (Pacha) and grand headgear depicting good vs evil?",
                listOf("कथकली (Kathakali)", "मोहिनीअट्टम", "कुडियाट्टम", "चाक्यार कूथु"),
                listOf("Kathakali", "Mohiniyattam", "Koodiyattam", "Chakyar Koothu"),
                0, "कथकली केरल का मूक नृत्य-नाट्य है जिसमें रामायण और महाभारत के प्रसंगों का मंचन नेत्रों व हस्तमुद्राओं से होता है।",
                "Kathakali is Kerala's dramatic dance-theatre combining elaborate painted faces, mime, and rhythmic choreography.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 11)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 2: Folk Dances & Regional Theatres
    private fun getArtTopic2Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 17 + qNum * 5)
        val questions = listOf(
            QPayload(
                "गुजरात का विश्व प्रसिद्ध लोक नृत्य 'गरबा' (Garba) जिसे यूनेस्को की अमूर्त सांस्कृतिक विरासत (2023) में शामिल किया गया, किस उत्सव पर किया जाता है?",
                "Garba of Gujarat, inscribed on UNESCO's Intangible Cultural Heritage list in 2023, is predominantly performed during:",
                listOf("नवरात्रि उत्सव (Navratri Festival)", "दीपावली", "होली", "मकर संक्रांति"),
                listOf("Navratri Festival", "Diwali", "Holi", "Makar Sankranti"),
                0, "गरबा शक्ति की उपासना का लोक नृत्य है जिसमें छिद्रित मिट्टी के घड़े में जलता हुआ दीप रखकर महिलाएं गोल घेरे में ताली बजाते हुए नृत्य करती हैं।",
                "Garba is an ecstatic circle dance honoring Goddess Durga, performed throughout the nine nights of Navratri.", "Easy"
            ),
            QPayload(
                "पंजाब का प्रसिद्ध पुरुष प्रधान लोक नृत्य 'भांगड़ा' और महिलाओं का लोक नृत्य 'गिद्दा' किस फसल उत्सव पर किया जाता है?",
                "The vibrant Punjabi folk dances 'Bhangra' and 'Giddha' are traditionally celebrated during which harvest festival?",
                listOf("बैसाखी (Baisakhi - Wheat harvest)", "लोहड़ी", "तीज", "गुरुपर्व"),
                listOf("Baisakhi", "Lohri", "Teej", "Gurpurab"),
                0, "ढोल की थाप और चिमटे के साथ बैसाखी के अवसर पर रबी की फसल पकने की खुशी में भांगड़ा और गिद्दा किया जाता है।",
                "Bhangra and Giddha celebrate the bounty of the spring harvest in Punjab, epitomized during Baisakhi.", "Easy"
            ),
            QPayload(
                "कर्नाटक का प्रसिद्ध पारंपरिक लोक यक्ष-नाट्य (Folk Dance Drama) कौन-सा है जो रातभर खुले मैदान में मंचित होता है?",
                "Which renowned traditional folk theatre of Karnataka combines mythology, thunderous percussion, and elaborate costumes?",
                listOf("यक्षगान (Yakshagana)", "कथकली", "तेरुक्कूत्तु", "बयालता"),
                listOf("Yakshagana", "Kathakali", "Therukoothu", "Bayalata"),
                0, "यक्षगान तटीय कर्नाटक (उडुपी, दक्षिण कन्नड़) का लोकप्रिय लोक रंगमंच है जिसमें चंडे की थाप पर पौराणिक गाथाएं अभिनीत होती हैं।",
                "Yakshagana is a dynamic coastal Karnataka folk opera dramatizing Indian epics with vibrant headgear and footwork.", "Easy"
            )
        )
        val index = (seed + (mock * 5) + (qNum * 7)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 3: Music Gharanas & Instruments
    private fun getArtTopic3Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 19 + qNum * 3)
        val questions = listOf(
            QPayload(
                "हिंदुस्तानी शास्त्रीय संगीत के सम्राट 'तानसेन' (रामतनु पांडे) किस मुगल शासक के नवरत्नों में शामिल थे?",
                "Mian Tansen (Ramtanu Pandey), the master of Dhrupad and creator of Raga Darbari Kanhra, graced the court of:",
                listOf("सम्राट अकबर (Emperor Akbar - Gwalior)", "शाहजहाँ", "बाबर", "जहांगीर"),
                listOf("Emperor Akbar", "Shah Jahan", "Babar", "Jahangir"),
                0, "तानसेन के गुरु स्वामी हरिदास थे। तानसेन का मकबरा ग्वालियर (मध्य प्रदेश) में स्थित है जहाँ प्रतिवर्ष तानसेन समारोह होता है।",
                "Tansen was one of the Navaratnas in Akbar's court, acclaimed for his sublime Dhrupad compositions.", "Easy"
            ),
            QPayload(
                "भारत रत्न से सम्मानित प्रसिद्ध शहनाई वादक कौन थे जिन्होंने 15 अगस्त 1947 को लाल किले की प्राचीर से शहनाई बजाई थी?",
                "Which legendary Shehnai maestro and Bharat Ratna recipient performed at the historic Red Fort on 15 August 1947?",
                listOf("उस्ताद बिस्मिल्लाह खान (Ustad Bismillah Khan - Varanasi)", "उस्ताद अल्ला रक्खा", "पंडित हरिप्रसाद चौरसिया", "उस्ताद अमजद अली खान"),
                listOf("Ustad Bismillah Khan (Varanasi)", "Ustad Alla Rakha", "Pt. Hariprasad Chaurasia", "Ustad Amjad Ali Khan"),
                0, "उस्ताद बिस्मिल्लाह खान (वाराणसी) को 2001 में भारत रत्न मिला। उन्होंने शहनाई को विवाह मंडप से शास्त्रीय मंच तक प्रतिष्ठा दिलाई।",
                "Ustad Bismillah Khan revolutionized the Shehnai into a revered classical concert instrument.", "Easy"
            ),
            QPayload(
                "पंडित रविशंकर और उस्ताद विलायत खान किस शास्त्रीय वाद्य यंत्र के विश्व प्रसिद्ध वादक रहे हैं?",
                "Pandit Ravi Shankar and Ustad Vilayat Khan are globally acclaimed maestros of which stringed musical instrument?",
                listOf("सितार (Sitar)", "सरोद", "संतूर", "वीणा"),
                listOf("Sitar", "Sarod", "Santoor", "Veena"),
                0, "पंडित रविशंकर को 1999 में भारत रत्न और 5 ग्रैमी पुरस्कार मिले। वे मैहर घराने के सितार वादक थे।",
                "Pandit Ravi Shankar was a global ambassador of Indian classical music on the Sitar.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 13)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 4: Painting Styles & Crafts
    private fun getArtTopic4Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 23 + qNum * 7)
        val questions = listOf(
            QPayload(
                "बिहार के मिथिलांचल क्षेत्र की प्रसिद्ध लोक चित्रकला कौन-सी है जिसमें प्राकृतिक रंगों और चावल के घोल का प्रयोग होता है?",
                "Which GI-tagged folk painting style originated in the Mithila region of Bihar using natural pigments and twigs?",
                listOf("मधुबनी चित्रकला (Madhubani / Mithila Painting)", "कलमकारी", "पट्टचित्र", "वारली"),
                listOf("Madhubani / Mithila Painting", "Kalamkari", "Pattachitra", "Warli"),
                0, "मधुबनी चित्रकला में कोहबर और भित्ति चित्र प्रमुख हैं। पद्मश्री जगदंबा देवी, सीता देवी, महासुंदरी देवी इसकी शीर्ष कलाकार रहीं।",
                "Madhubani art is characterized by eye-catching geometrical patterns and mythological themes drawn on walls and handmade paper.", "Easy"
            ),
            QPayload(
                "महाराष्ट्र की जनजातीय लोक कला 'वारली पेंटिंग' (Warli Painting) में आकृतियां बनाने हेतु किस प्राकृतिक सामग्री का उपयोग किया जाता है?",
                "What natural base and pigment are predominantly used in Maharashtra's indigenous 'Warli' tribal art?",
                listOf("गेरू की पृष्ठभूमि पर चावल के आटे का लेप (Rice paste on mud-ochre background)", "ऑयल पेंट", "धातु भस्म", "चारकोल"),
                listOf("Rice flour paste on cow-dung/ochre mud walls", "Oil paints", "Metallic leaf", "Charcoal"),
                0, "वारली पेंटिंग में त्रिकोण, वृत्त और रेखाओं द्वारा 'तारपा नृत्य' और सामाजिक जीवन का जीवंत अंकन होता है।",
                "Warli paintings depict communal harmony, harvest, and the circular Tarpa dance using elemental geometric shapes.", "Easy"
            )
        )
        val index = (seed + (mock * 11) + (qNum * 17)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 5: Architecture & Temples
    private fun getArtTopic5Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 29 + qNum * 5)
        val questions = listOf(
            QPayload(
                "ओडिशा में स्थित 13वीं सदी का विश्व प्रसिद्ध 'कोणार्क सूर्य मंदिर' (Black Pagoda) किस गंग वंश के शासक द्वारा बनवाया गया था?",
                "Which Eastern Ganga dynasty monarch built the 13th-century Konark Sun Temple (Black Pagoda) in Odisha?",
                listOf("नरसिंह देव प्रथम (Narasimhadeva I - 1250 AD)", "अनंतवर्मन चोडगंग", "कपिलेंद्र देव", "प्रतापरुद्र देव"),
                listOf("Narasimhadeva I (1250 AD)", "Anantavarman Chodaganga", "Kapilendra Deva", "Prataparudra Deva"),
                0, "कोणार्क सूर्य मंदिर 24 पहियों और 7 घोड़ों वाले सूर्य के रथ के आकार में कलिंग स्थापत्य शैली में निर्मित यूनेस्को विश्व धरोहर है।",
                "Konark Sun Temple was envisioned as a colossal chariot of the Sun God with 24 carved stone wheels.", "Easy"
            ),
            QPayload(
                "मध्य प्रदेश के छतरपुर जिले में स्थित 'खजुराहो के मंदिर' (UNESCO World Heritage) किन शासकों द्वारा 950-1050 ई. में बनवाए गए थे?",
                "The world-renowned Khajuraho Group of Monuments in Madhya Pradesh was constructed by rulers of which dynasty?",
                listOf("चंदेल शासक (Chandela Dynasty - Nagara Style)", "प्रतिहार शासक", "परमार शासक", "सोलंकी शासक"),
                listOf("Chandela Dynasty", "Gurjara-Pratiharas", "Paramaras", "Solankis"),
                0, "खजुराहो में कंदरिया महादेव मंदिर, लक्ष्मण मंदिर और चौंसठ योगिनी मंदिर प्रमुख नागर शैली के उत्कृष्ट नमूने हैं।",
                "Khajuraho temples represent the pinnacle of Nagara temple architecture built by Chandela kings.", "Easy"
            )
        )
        val index = (seed + (mock * 13) + (qNum * 19)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 6: Festivals & Traditions
    private fun getArtTopic6Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 31 + qNum * 7)
        val questions = listOf(
            QPayload(
                "कुंभ मेला (Kumbh Mela - UNESCO Intangible Heritage) भारत के किन 4 पवित्र तीर्थ स्थलों पर आयोजित होता है?",
                "Kumbh Mela, recognized by UNESCO as Intangible Cultural Heritage of Humanity, is held across which 4 sacred pilgrimage cities?",
                listOf("प्रयागराज, हरिद्वार, उज्जैन और नासिक", "वाराणसी, अयोध्या, मथुरा और पुरी", "द्वारका, बद्रीनाथ, रामेश्वरम और पुरी", "ऋषिकेश, गया, तिरुपति और पुष्कर"),
                listOf("Prayagraj (Ganga-Yamuna), Haridwar (Ganga), Ujjain (Shipra), and Nashik (Godavari)", "Varanasi, Ayodhya, Mathura, Puri", "Dwarka, Badrinath, Rameshwaram, Puri", "Rishikesh, Gaya, Tirupati, Pushkar"),
                0, "कुंभ मेला प्रयागराज (त्रिवेणी), हरिद्वार (गंगा), उज्जैन (शिप्रा) और नासिक (गोदावरी) में प्रत्येक 12 वर्ष में आयोजित होता है।",
                "Kumbh Mela rotates every 3 years among Prayagraj, Haridwar, Ujjain, and Nashik.", "Easy"
            )
        )
        val index = (seed + (mock * 17) + (qNum * 23)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 7: Classical Literature & Epics
    private fun getArtTopic7Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 37 + qNum * 9)
        val questions = listOf(
            QPayload(
                "संस्कृत के महाकवि कालिदास द्वारा रचित कौन-सा नाटक विश्व साहित्य में सर्वोच्च कृतियों में गिना जाता है?",
                "Which immortal Sanskrit drama authored by Mahakavi Kalidasa was among the first Indian works translated into Western languages?",
                listOf("अभिज्ञानशाकुंतलम् (Abhijnanashakuntalam - King Dushyanta & Shakuntala)", "मालविकाग्निमित्रम्", "विक्रमोर्वशीयम्", "मेघदूतम्"),
                listOf("Abhijnanashakuntalam", "Malavikagnimitram", "Vikramorvasiyam", "Meghadutam"),
                0, "सर विलियम जोन्स ने 1789 में 'अभिज्ञानशाकुंतलम्' का अंग्रेजी में अनुवाद किया। कालिदास को 'भारत का शेक्सपियर' कहा जाता है।",
                "Abhijnanashakuntalam by Kalidasa is regarded as a masterwork of Sanskrit dramatic literature.", "Easy"
            )
        )
        val index = (seed + (mock * 19) + (qNum * 29)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 8: UNESCO Heritage & Caves
    private fun getArtTopic8Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 41 + qNum * 11)
        val questions = listOf(
            QPayload(
                "महाराष्ट्र के औरंगाबाद (छत्रपति संभाजीनगर) में स्थित 'अजंता की गुफाएं' (Ajanta Caves) मुख्य रूप से किस धर्म और कला से संबंधित हैं?",
                "The UNESCO World Heritage rock-cut Ajanta Caves in Maharashtra primarily preserve masterpieces of which spiritual tradition?",
                listOf("बौद्ध धर्म (जातक कथाएं एवं भित्ति चित्र - Fresco Paintings)", "जैन धर्म", "शैव धर्म", "वैष्णव धर्म"),
                listOf("Buddhism (Jataka murals and chaitya-grihas)", "Jainism", "Shaivism", "Vaishnavism"),
                0, "अजंता में 30 बौद्ध गुफाएं हैं (2nd BCE to 6th CE) जो अपनी उत्कृष्ट फ्रेस्को चित्रकला (पद्मपाणि बोधिसत्व) हेतु विश्व विख्यात हैं।",
                "Ajanta Caves preserve 30 rock-cut Buddhist monuments celebrated for Jataka mural paintings.", "Easy"
            )
        )
        val index = (seed + (mock * 23) + (qNum * 31)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 9: Music Gharanas & Styles
    private fun getArtTopic9Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 43 + qNum * 13)
        val questions = listOf(
            QPayload(
                "हिंदुस्तानी शास्त्रीय गायन की 'ख्याल' (Khayal) शैली का सबसे प्राचीन और मूल घराना किसे माना जाता है?",
                "Which is revered as the oldest and foundational Gharana of Hindustani classical Khayal vocal music?",
                listOf("ग्वालियर घराना (Gwalior Gharana - Ustad Hassu Khan & Haddu Khan)", "आगरा घराना", "किराना घराना", "पटियाला घराना"),
                listOf("Gwalior Gharana", "Agra Gharana", "Kirana Gharana", "Patiala Gharana"),
                0, "ग्वालियर घराना खयाल गायकी का उद्गम स्थल है। पंडित ओंकारनाथ ठाकुर, वी. डी. पलुस्कर इसी परंपरा से संबद्ध थे।",
                "Gwalior Gharana is considered the mother of all Hindustani classical Khayal singing traditions.", "Easy"
            )
        )
        val index = (seed + (mock * 29) + (qNum * 37)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 10: Fairs & Cultural Festivals
    private fun getArtTopic10Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 47 + qNum * 17)
        val questions = listOf(
            QPayload(
                "पुरी (ओडिशा) की विश्व प्रसिद्ध 'भगवान जगन्नाथ रथ यात्रा' (Rath Yatra) किस हिंदू मास के शुक्ल पक्ष की द्वितीया को निकाली जाती है?",
                "During which Hindu lunar month is the colossal chariot procession of Lord Jagannath celebrated in Puri, Odisha?",
                listOf("आषाढ़ मास (Ashadha Shukla Dwitiya)", "श्रावण मास", "कार्तिक मास", "वैशाख मास"),
                listOf("Ashadha Shukla Dwitiya (June-July)", "Shravana month", "Kartik month", "Vaishakha month"),
                0, "आषाढ़ शुक्ल द्वितीया को भगवान जगन्नाथ (नंदीघोष रथ), बलभद्र (तालध्वज) और देवी सुभद्रा (देवदलन) गुंडिचा मंदिर की यात्रा पर निकलते हैं।",
                "Rath Yatra at Puri features three towering wooden chariots pulled by millions of devotees to Gundicha Temple.", "Easy"
            )
        )
        val index = (seed + (mock * 31) + (qNum * 41)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }
}

fun makeArtCultureQ(
    id: String,
    subtopicId: String,
    qHi: String,
    qEn: String,
    optsHi: List<String>,
    optsEn: List<String>,
    correctIdx: Int,
    expHi: String,
    expEn: String,
    diff: String = "Moderate"
): GkQuestion = ArtCultureQuestionHelper.makeArtCultureQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)
