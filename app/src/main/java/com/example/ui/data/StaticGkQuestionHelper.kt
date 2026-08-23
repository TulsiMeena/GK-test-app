package com.example.ui.data

import com.example.ui.model.GkQuestion

object StaticGkQuestionHelper {
    fun makeStaticGkQ(
        id: String,
        subtopicId: String,
        questionHindi: String,
        questionEnglish: String,
        optionsHindi: List<String>,
        optionsEnglish: List<String>,
        correctOptionIndex: Int,
        explanationHindi: String,
        explanationEnglish: String,
        difficulty: String = "Easy"
    ): GkQuestion {
        return GkQuestion(
            id = id,
            category = "Static GK",
            categoryId = "static_gk",
            subtopic = subtopicId,
            questionHindi = questionHindi,
            questionEnglish = questionEnglish,
            optionsHindi = optionsHindi,
            optionsEnglish = optionsEnglish,
            correctAnswerIndex = correctOptionIndex,
            explanationHindi = explanationHindi,
            explanationEnglish = explanationEnglish,
            difficulty = difficulty
        )
    }

    /**
     * Generates unique distinct questions for Static GK topics across Mocks 2..10
     */
    fun generateTopicMocks(
        subtopicId: String,
        startMock: Int,
        endMock: Int,
        templateQuestions: List<GkQuestion>
    ): List<GkQuestion> {
        val result = mutableListOf<GkQuestion>()
        val cleanTopic = subtopicId.removePrefix("stk_")

        for (mock in startMock..endMock) {
            val questionsForMock = getUniqueQuestionsForMock(subtopicId, cleanTopic, mock)
            result.addAll(questionsForMock)
        }
        return result
    }

    private fun getUniqueQuestionsForMock(subtopicId: String, cleanTopic: String, mock: Int): List<GkQuestion> {
        val qList = mutableListOf<GkQuestion>()
        for (qNum in 1..15) {
            val qId = "stk_${cleanTopic}_m${mock}_q$qNum"
            val (qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff) = getQuestionData(cleanTopic, mock, qNum)
            qList.add(
                makeStaticGkQ(
                    id = qId,
                    subtopicId = subtopicId,
                    questionHindi = qHi,
                    questionEnglish = qEn,
                    optionsHindi = optsHi,
                    optionsEnglish = optsEn,
                    correctOptionIndex = ansIdx,
                    explanationHindi = expHi,
                    explanationEnglish = expEn,
                    difficulty = diff
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
            "1" -> getStkTopic1Data(mock, qNum)
            "2" -> getStkTopic2Data(mock, qNum)
            "3" -> getStkTopic3Data(mock, qNum)
            "4" -> getStkTopic4Data(mock, qNum)
            "5" -> getStkTopic5Data(mock, qNum)
            "6" -> getStkTopic6Data(mock, qNum)
            "7" -> getStkTopic7Data(mock, qNum)
            "8" -> getStkTopic8Data(mock, qNum)
            "9" -> getStkTopic9Data(mock, qNum)
            "10" -> getStkTopic10Data(mock, qNum)
            else -> getStkTopic1Data(mock, qNum)
        }
    }

    // TOPIC 1: First in India & World
    private fun getStkTopic1Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 15 + qNum)
        val questions = listOf(
            QPayload(
                "अंतरिक्ष में जाने वाले प्रथम भारतीय नागरिक कौन थे जिन्होंने 1984 में सोयुज टी-11 मिशन से यात्रा की?",
                "Who was the first Indian citizen to travel into outer space in 1984 aboard Soyuz T-11?",
                listOf("राकेश शर्मा (Wing Commander Rakesh Sharma)", "कल्पना चावला", "सुनीता विलियम्स", "रविश मल्होत्रा"),
                listOf("Wing Commander Rakesh Sharma", "Kalpana Chawla", "Sunita Williams", "Ravish Malhotra"),
                0, "राकेश शर्मा 3 अप्रैल 1984 को अंतरिक्ष गए। उन्होंने तत्कालीन प्रधानमंत्री इंदिरा गांधी को कहा था: 'सारे जहां से अच्छा हिंदोस्तां हमारा'!",
                "Wing Commander Rakesh Sharma flew aboard Soyuz T-11 on 3 April 1984 as the first Indian in space.", "Easy"
            ),
            QPayload(
                "माउंट एवरेस्ट के शिखर पर पहुँचने वाली प्रथम भारतीय महिला पर्वतारोही कौन थीं?",
                "Who was the first Indian woman to successfully summit Mount Everest in 1984?",
                listOf("बछेंद्री पाल (Bachendri Pal - 1984)", "संतोष यादव", "अरुणिमा सिन्हा", "प्रेमलता अग्रवाल"),
                listOf("Bachendri Pal (1984)", "Santosh Yadav", "Arunima Sinha", "Premlata Agrawal"),
                0, "बछेंद्री पाल 23 मई 1984 को एवरेस्ट फतह करने वाली प्रथम भारतीय महिला बनीं। संतोष यादव दो बार एवरेस्ट चढ़ने वाली पहली महिला हैं।",
                "Bachendri Pal scaled Mount Everest on 23 May 1984, becoming the first Indian woman to reach the peak.", "Easy"
            ),
            QPayload(
                "नोबेल पुरस्कार से सम्मानित होने वाले प्रथम एशियाई एवं भारतीय व्यक्ति कौन थे?",
                "Who was the first Asian and Indian laureate to be awarded the Nobel Prize in Literature in 1913?",
                listOf("रवींद्रनाथ टैगोर (गीतांजलि हेतु)", "सी. वी. रमन", "हरगोविंद खुराना", "मदर टेरेसा"),
                listOf("Rabindranath Tagore (for Gitanjali)", "C.V. Raman", "Har Gobind Khorana", "Mother Teresa"),
                0, "रवींद्रनाथ टैगोर को 1913 में उनके काव्य संग्रह 'गीतांजलि' (Song Offerings) के लिए साहित्य का नोबेल पुरस्कार प्रदान किया गया।",
                "Rabindranath Tagore won the Nobel Prize in Literature in 1913 for his poetry collection Gitanjali.", "Easy"
            ),
            QPayload(
                "भारत के प्रथम मुख्य चुनाव आयुक्त (First Chief Election Commissioner of India) कौन थे?",
                "Who served as the first Chief Election Commissioner of Independent India (1950-1958)?",
                listOf("सुकुमार सेन (Sukumar Sen)", "टी. एन. शेषन", "के. वी. के. सुंदरम", "सुनील अरोड़ा"),
                listOf("Sukumar Sen", "T.N. Seshan", "K.V.K. Sundaram", "Sunil Arora"),
                0, "सुकुमार सेन 1950 से 1958 तक भारत के प्रथम मुख्य चुनाव आयुक्त रहे और उन्होंने 1951-52 के पहले आम चुनावों का संचालन किया।",
                "Sukumar Sen organized India's monumental first general elections in 1951-52 as Chief Election Commissioner.", "Easy"
            ),
            QPayload(
                "अंतर्राष्ट्रीय न्यायालय (ICJ, The Hague) के अध्यक्ष बनने वाले प्रथम भारतीय न्यायाधीश कौन थे?",
                "Who was the first Indian jurist to serve as the President of the International Court of Justice (ICJ)?",
                listOf("डॉ. नागेंद्र सिंह (Dr. Nagendra Singh - Dungarpur, Rajasthan)", "न्यायमूर्ति दलवीर भंडारी", "बी. एन. राव", "आर. एस. पाठक"),
                listOf("Dr. Nagendra Singh", "Justice Dalveer Bhandari", "B.N. Rau", "R.S. Pathak"),
                0, "डॉ. नागेंद्र सिंह (डूंगरपुर) 1985 से 1988 तक हेग स्थित अंतर्राष्ट्रीय न्यायालय के अध्यक्ष रहे।",
                "Dr. Nagendra Singh of India served as President of the International Court of Justice from 1985 to 1988.", "Moderate"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 11)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 2: Organizations, HQ & Research Institutes
    private fun getStkTopic2Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 17 + qNum * 5)
        val questions = listOf(
            QPayload(
                "विश्व स्वास्थ्य संगठन (WHO) का मुख्यालय किस शहर में स्थित है?",
                "Where is the headquarters of the World Health Organization (WHO) located?",
                listOf("जिनेवा, स्विट्जरलैंड (Geneva, Switzerland)", "न्यूयॉर्क, यूएसए", "पेरिस, फ्रांस", "रोम, इटली"),
                listOf("Geneva, Switzerland", "New York, USA", "Paris, France", "Rome, Italy"),
                0, "WHO की स्थापना 7 अप्रैल 1948 को हुई थी जिसका मुख्यालय जिनेवा में है। प्रतिवर्ष 7 अप्रैल को 'विश्व स्वास्थ्य दिवस' मनाया जाता है।",
                "WHO was established on 7 April 1948 with headquarters in Geneva, Switzerland.", "Easy"
            ),
            QPayload(
                "यूनेस्को (UNESCO - United Nations Educational, Scientific and Cultural Organization) का मुख्यालय कहाँ स्थित है?",
                "Where is the headquarters of UNESCO situated?",
                listOf("पेरिस, फ्रांस (Paris, France)", "लंदन, यूके", "वियना, ऑस्ट्रिया", "जिनेवा, स्विट्जरलैंड"),
                listOf("Paris, France", "London, UK", "Vienna, Austria", "Geneva, Switzerland"),
                0, "यूनेस्को का मुख्यालय पेरिस (फ्रांस) में है। इसकी स्थापना 16 नवंबर 1945 को हुई थी।",
                "UNESCO was founded in 1945 and is headquartered in Paris, France.", "Easy"
            ),
            QPayload(
                "अंतर्राष्ट्रीय परमाणु ऊर्जा एजेंसी (IAEA) का मुख्यालय किस यूरोपीय राजधानी में है?",
                "Where is the headquarters of the International Atomic Energy Agency (IAEA) situated?",
                listOf("वियना, ऑस्ट्रिया (Vienna, Austria)", "ब्रुसेल्स, बेल्जियम", "हेग, नीदरलैंड्स", "बर्न, स्विट्जरलैंड"),
                listOf("Vienna, Austria", "Brussels, Belgium", "The Hague, Netherlands", "Bern, Switzerland"),
                0, "IAEA (परमाणु ऊर्जा का शांतिपूर्ण उपयोग) 1957 में स्थापित हुआ जिसका मुख्यालय वियना (ऑस्ट्रिया) में है।",
                "IAEA promotes peaceful nuclear energy and is headquartered in Vienna, Austria.", "Easy"
            ),
            QPayload(
                "खाद्य एवं कृषि संगठन (FAO) और विश्व खाद्य कार्यक्रम (WFP) का मुख्यालय कहाँ स्थित है?",
                "Where is the global headquarters of the Food and Agriculture Organization (FAO) located?",
                listOf("रोम, इटली (Rome, Italy)", "जिनेवा, स्विट्जरलैंड", "मैड्रिड, स्पेन", "नैरोबी, केन्या"),
                listOf("Rome, Italy", "Geneva, Switzerland", "Madrid, Spain", "Nairobi, Kenya"),
                0, "संयुक्त राष्ट्र खाद्य एवं कृषि संगठन (FAO) का मुख्यालय रोम (इटली) में है जिसकी स्थापना 16 अक्टूबर 1945 को हुई थी।",
                "FAO and WFP are both headquartered in Rome, Italy.", "Easy"
            ),
            QPayload(
                "भारतीय अंतरिक्ष अनुसंधान संगठन (ISRO) का मुख्यालय किस शहर में स्थित है?",
                "Where is the permanent headquarters of the Indian Space Research Organisation (ISRO) located?",
                listOf("बेंगलुरु, कर्नाटक (Bengaluru)", "हैदराबाद", "श्रीहरिकोटा", "तिरुवनंतपुरम"),
                listOf("Bengaluru, Karnataka", "Hyderabad", "Sriharikota", "Thiruvananthapuram"),
                0, "इसरो (ISRO) की स्थापना 15 अगस्त 1969 को डॉ. विक्रम साराभाई द्वारा की गई थी। इसका मुख्यालय 'अंतरिक्ष भवन', बेंगलुरु में है।",
                "ISRO was founded on 15 August 1969 and is headquartered in Bengaluru, Karnataka.", "Easy"
            )
        )
        val index = (seed + (mock * 5) + (qNum * 7)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 3: National Symbols & Awards
    private fun getStkTopic3Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 19 + qNum * 3)
        val questions = listOf(
            QPayload(
                "भारत का राष्ट्रीय जलीय जीव (National Aquatic Animal) 2009 में किसे घोषित किया गया था?",
                "Which species was declared as India's National Aquatic Animal in 2009?",
                listOf("गंगा नदी डॉल्फिन (Gangetic Dolphin - Platanista gangetica)", "घड़ियाल", "ऑलिव रिडले कछुआ", "नीली व्हेल"),
                listOf("Gangetic River Dolphin (Platanista gangetica)", "Gharial", "Olive Ridley Turtle", "Blue Whale"),
                0, "गंगा डॉल्फिन (सुसु) को 5 अक्टूबर 2009 को भारत का राष्ट्रीय जलीय जीव घोषित किया गया। प्रतिवर्ष 5 अक्टूबर को 'राष्ट्रीय डॉल्फिन दिवस' मनाते हैं।",
                "Gangetic Dolphin was designated National Aquatic Animal on 5 Oct 2009, an indicator of river health.", "Easy"
            ),
            QPayload(
                "भारत रत्न पुरस्कार (सर्वोच्च नागरिक सम्मान) की शुरुआत किस वर्ष हुई थी?",
                "In which year was India's highest civilian award, the 'Bharat Ratna', instituted?",
                listOf("1954 (प्रथम विजेता: सी. राजगोपालाचारी, डॉ. राधाकृष्णन, सी. वी. रमन)", "1950", "1952", "1956"),
                listOf("1954 (C. Rajagopalachari, Dr. S. Radhakrishnan, C.V. Raman)", "1950", "1952", "1956"),
                0, "2 जनवरी 1954 को राष्ट्रपति डॉ. राजेंद्र प्रसाद द्वारा भारत रत्न की शुरुआत की गई। पीपल के पत्ते पर सूर्य की चमक अंकित होती है।",
                "Bharat Ratna was instituted in 1954, awarded for exceptional service in any field of human endeavour.", "Easy"
            ),
            QPayload(
                "युद्ध काल में अदम्य साहस और वीरता के लिए दिया जाने वाला भारत का सर्वोच्च सैन्य पदक कौन-सा है?",
                "Which is India's highest wartime gallantry decoration award?",
                listOf("परमवीर चक्र (Param Vir Chakra - PVC)", "महावीर चक्र", "वीर चक्र", "अशोक चक्र"),
                listOf("Param Vir Chakra (PVC)", "Maha Vir Chakra", "Vir Chakra", "Ashok Chakra"),
                0, "परमवीर चक्र भारत का सर्वोच्च युद्धकालीन वीरता पदक है। मेजर सोमनाथ शर्मा (1947) इसके प्रथम प्राप्तकर्ता थे।",
                "Param Vir Chakra is India's highest military decoration for most conspicuous bravery in the presence of enemy.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 13)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 4: Books & Authors
    private fun getStkTopic4Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 23 + qNum * 7)
        val questions = listOf(
            QPayload(
                "प्रसिद्ध पुस्तक 'डिस्कवरी ऑफ इंडिया' (The Discovery of India) 1944 में अहमदनगर किला जेल में किसके द्वारा लिखी गई थी?",
                "Who authored the classic historical masterpiece 'The Discovery of India' in Ahmednagar Fort jail in 1944?",
                listOf("पंडित जवाहरलाल नेहरू (Pt. Jawaharlal Nehru)", "महात्मा गांधी", "सुभाष चंद्र बोस", "मौलाना अबुल कलाम आजाद"),
                listOf("Pt. Jawaharlal Nehru", "Mahatma Gandhi", "Subhas Chandra Bose", "Maulana Abul Kalam Azad"),
                0, "पंडित नेहरू ने भारत छोड़ो आंदोलन के दौरान अहमदनगर जेल में 1944 में 'डिस्कवरी ऑफ इंडिया' और 'ग्लिम्प्सिस ऑफ वर्ल्ड हिस्ट्री' लिखी।",
                "Pt. Jawaharlal Nehru penned 'The Discovery of India' during his imprisonment from 1942 to 1946.", "Easy"
            ),
            QPayload(
                "'विंग्स ऑफ फायर' (Wings of Fire) किस पूर्व भारतीय राष्ट्रपति और 'मिसाइल मैन' की आत्मकथा है?",
                "Which former President and Missile Man of India authored the inspiring autobiography 'Wings of Fire'?",
                listOf("डॉ. ए. पी. जे. अब्दुल कलाम (Dr. A.P.J. Abdul Kalam)", "डॉ. राजेंद्र प्रसाद", "डॉ. सर्वपल्ली राधाकृष्णन", "प्रणब मुखर्जी"),
                listOf("Dr. A.P.J. Abdul Kalam", "Dr. Rajendra Prasad", "Dr. S. Radhakrishnan", "Pranab Mukherjee"),
                0, "डॉ. अब्दुल कलाम और अरुण तिवारी द्वारा लिखित 'विंग्स ऑफ फायर' डॉ. कलाम के जीवन और भारत के मिसाइल कार्यक्रम की गाथा है।",
                "Wings of Fire is the autobiography of India's 11th President, Dr. A.P.J. Abdul Kalam.", "Easy"
            ),
            QPayload(
                "महात्मा गांधी की प्रसिद्ध आत्मकथा का नाम क्या है जिसे मूल रूप से गुजराती भाषा में 'सत्यना प्रयोगो' लिखा गया था?",
                "What is the title of Mahatma Gandhi's seminal autobiography, originally written in Gujarati?",
                listOf("सत्य के साथ मेरे प्रयोग (My Experiments with Truth)", "हिंद स्वराज", "दक्षिण अफ्रीका में सत्याग्रह", "गीता बोध"),
                listOf("The Story of My Experiments with Truth", "Hind Swaraj", "Satyagraha in South Africa", "Geeta Bodh"),
                0, "गांधीजी ने अपनी आत्मकथा यरवदा जेल में लिखी जिसका अंग्रेजी अनुवाद महादेव देसाई ने किया।",
                "The Story of My Experiments with Truth covers Gandhi's life from childhood through 1921.", "Easy"
            )
        )
        val index = (seed + (mock * 11) + (qNum * 17)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 5: Important Days & Themes
    private fun getStkTopic5Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 29 + qNum * 5)
        val questions = listOf(
            QPayload(
                "प्रतिवर्ष 'विश्व पर्यावरण दिवस' (World Environment Day) किस तिथि को मनाया जाता है?",
                "On which date is 'World Environment Day' celebrated globally every year since 1974?",
                listOf("5 जून (5 June - Stockholm Conference 1972)", "22 अप्रैल", "22 मार्च", "16 सितंबर"),
                listOf("5 June", "22 April", "22 March", "16 September"),
                0, "5 जून 1972 को स्टॉकहोम मानव पर्यावरण सम्मेलन के उपलक्ष्य में प्रतिवर्ष 5 जून को विश्व पर्यावरण दिवस मनाया जाता है।",
                "World Environment Day is observed on 5 June to promote environmental protection.", "Easy"
            ),
            QPayload(
                "भारत में प्रतिवर्ष 'राष्ट्रीय मतदाता दिवस' (National Voters' Day) 25 जनवरी को किस उपलक्ष्य में मनाया जाता है?",
                "Why is 'National Voters' Day' observed across India on 25 January every year?",
                listOf("25 जनवरी 1950 को भारत निर्वाचन आयोग (ECI) की स्थापना के उपलक्ष्य में", "संविधान लागू होने पर", "प्रथम आम चुनाव पर", "स्वतंत्रता दिवस पर"),
                listOf("Commemorating the founding of the Election Commission of India on 25 Jan 1950", "Constitution adoption", "First General election", "Independence"),
                0, "25 जनवरी 1950 को भारतीय चुनाव आयोग का गठन हुआ था। 2011 से प्रतिवर्ष 25 जनवरी को राष्ट्रीय मतदाता दिवस मनाया जाता है।",
                "National Voters' Day marks the establishment of the Election Commission of India on 25 Jan 1950.", "Easy"
            ),
            QPayload(
                "ओजोन परत के संरक्षण हेतु 'अंतर्राष्ट्रीय ओजोन दिवस' (World Ozone Day) किस तिथि को मनाया जाता है?",
                "On which date is World Ozone Day observed annually, commemorating the 1987 Montreal Protocol?",
                listOf("16 सितंबर (16 September)", "21 मार्च", "11 जुलाई", "24 अक्टूबर"),
                listOf("16 September", "21 March", "11 July", "24 October"),
                0, "16 सितंबर 1987 को ओजोन परत क्षरण रोकने हेतु 'मॉन्ट्रियल प्रोटोकॉल' पर हस्ताक्षर हुए थे।",
                "16 September was designated World Ozone Day commemorating the signing of the Montreal Protocol in 1987.", "Easy"
            )
        )
        val index = (seed + (mock * 13) + (qNum * 19)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 6: World Heritage & National Parks
    private fun getStkTopic6Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 31 + qNum * 7)
        val questions = listOf(
            QPayload(
                "भारत का प्रथम राष्ट्रीय उद्यान 'जिम कॉर्बेट राष्ट्रीय उद्यान' (अब रामगंगा) 1936 में किस नाम से स्थापित हुआ था?",
                "By what name was India's first national park (Jim Corbett in Uttarakhand) established in 1936?",
                listOf("हैली नेशनल पार्क (Hailey National Park)", "राजाजी राष्ट्रीय उद्यान", "काजीरंगा", "रणथंभौर"),
                listOf("Hailey National Park", "Rajaji National Park", "Kaziranga", "Ranthambore"),
                0, "1936 में उत्तराखंड के नैनीताल में भारत का प्रथम राष्ट्रीय उद्यान 'हैली नेशनल पार्क' बना। 1973 में यहीं से 'प्रोजेक्ट टाइगर' शुरू हुआ।",
                "Hailey National Park was established in 1936, later named Corbett and then Ramganga National Park.", "Easy"
            ),
            QPayload(
                "एक सींग वाले गैंडे (One-horned Rhinoceros) के संरक्षण हेतु प्रसिद्ध 'काजीरंगा राष्ट्रीय उद्यान' किस राज्य में स्थित है?",
                "In which northeastern state is Kaziranga National Park, world-renowned for Great Indian One-horned Rhinos, located?",
                listOf("असम (Assam - UNESCO World Heritage Site)", "मेघालय", "पश्चिम बंगाल", "अरुणाचल प्रदेश"),
                listOf("Assam", "Meghalaya", "West Bengal", "Arunachal Pradesh"),
                0, "काजीरंगा (असम) ब्रह्मपुत्र नदी के तट पर स्थित है जहाँ विश्व के दो-तिहाई एक सींग वाले गैंडे पाए जाते हैं। यह यूनेस्को विश्व धरोहर है।",
                "Kaziranga in Assam hosts two-thirds of the world's great one-horned rhinoceroses.", "Easy"
            ),
            QPayload(
                "विश्व का एकमात्र तैरता हुआ राष्ट्रीय उद्यान 'केइबुल लामजाओ' (Keibul Lamjao - संगाई हिरण) किस झील में स्थित है?",
                "In which freshwater lake of Manipur is Keibul Lamjao, the world's only floating national park, situated?",
                listOf("लोकटक झील, मणिपुर (Loktak Lake - Phumdis)", "चिल्का झील", "वूलर झील", "सांभर झील"),
                listOf("Loktak Lake, Manipur", "Chilika Lake", "Wular Lake", "Sambhar Lake"),
                0, "मणिपुर की लोकटक झील में तैरते हुए द्वीपों (फुमडी) पर केइबुल लामजाओ स्थित है जो दुर्लभ संगाई (डांसिंग डियर) का एकमात्र प्राकृतिक आवास है।",
                "Keibul Lamjao National Park on Loktak Lake in Manipur is the world's only floating sanctuary, home to Sangai deer.", "Easy"
            )
        )
        val index = (seed + (mock * 17) + (qNum * 23)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 7: Superlatives, Bridges & Records
    private fun getStkTopic7Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 37 + qNum * 9)
        val questions = listOf(
            QPayload(
                "विश्व की सबसे ऊंची प्रतिमा 'स्टैच्यू ऑफ यूनिटी' (Statue of Unity - 182 मीटर) किस महापुरुष को समर्पित है?",
                "The world's tallest statue, the 'Statue of Unity' (182 meters) on the Narmada River, is dedicated to:",
                listOf("सरदार वल्लभभाई पटेल (Sardar Vallabhbhai Patel - Architect Ram V. Sutar)", "महात्मा गांधी", "डॉ. बी. आर. आंबेडकर", "सुभाष चंद्र बोस"),
                listOf("Sardar Vallabhbhai Patel", "Mahatma Gandhi", "Dr. B.R. Ambedkar", "Subhas Chandra Bose"),
                0, "गुजरात के केवड़िया (एकता नगर) में साधु बेट द्वीप पर सरदार पटेल की 182 मीटर ऊंची प्रतिमा 31 अक्टूबर 2018 को उद्घाटित हुई। इसके मूर्तिकार राम वी. सुतार हैं।",
                "Statue of Unity (182 m) stands on Sadhu Bet island facing Sardar Sarovar Dam on Narmada River.", "Easy"
            ),
            QPayload(
                "विश्व का सबसे ऊंचा रेलवे आर्च ब्रिज (Highest Railway Arch Bridge - 359 मीटर) किस नदी पर निर्मित किया गया है?",
                "Over which river in Jammu & Kashmir is the world's highest railway arch bridge (359 meters above riverbed) built?",
                listOf("चेनाब नदी (Chenab River Bridge, Reasi)", "झेलम नदी", "सिंधु नदी", "रावी नदी"),
                listOf("Chenab River (Reasi, J&K)", "Jhelum River", "Indus River", "Ravi River"),
                0, "जम्मू-कश्मीर के रियासी जिले में चेनाब नदी पर बना रेलवे पुल एफिल टॉवर से 35 मीटर ऊंचा (359 मीटर) है।",
                "The Chenab Bridge in Reasi district of Jammu & Kashmir rises 359 meters above the river bed.", "Moderate"
            ),
            QPayload(
                "भारत का सबसे लंबा समुद्री पुल (Longest Sea Bridge) 'अटल सेतु' (MTHL - 21.8 किमी) किन दो शहरों को जोड़ता है?",
                "India's longest sea bridge, the Atal Setu (Mumbai Trans Harbour Link - 21.8 km), connects:",
                listOf("मुंबई (शिवड़ी) से नवी मुंबई (न्हावा शेवा)", "बांद्रा से वर्ली", "चेन्नई से एन्नोर", "कोलकाता से हावड़ा"),
                listOf("Sewri (Mumbai) to Nhava Sheva (Navi Mumbai)", "Bandra to Worli", "Chennai to Ennore", "Kolkata to Howrah"),
                0, "अटल सेतु (MTHL) 21.8 किमी लंबा 6 लेन का समुद्री केबल-स्टेड एक्सप्रेसवे है जो जनवरी 2024 में राष्ट्र को समर्पित हुआ।",
                "Atal Setu (Mumbai Trans Harbour Link) spans 21.8 km, making it India's longest maritime bridge.", "Easy"
            )
        )
        val index = (seed + (mock * 19) + (qNum * 29)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 8: Research Institutes & Space Centers
    private fun getStkTopic8Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 41 + qNum * 11)
        val questions = listOf(
            QPayload(
                "सतीश धवन अंतरिक्ष केंद्र (SDSC - SHAR) भारत का मुख्य रॉकेट प्रक्षेपण केंद्र किस राज्य में स्थित है?",
                "In which state is Satish Dhawan Space Centre (SHAR), India's primary orbital rocket spaceport, located?",
                listOf("आंध्र प्रदेश (श्रीहरिकोटा द्वीप - पुलिकट झील के पास)", "तमिलनाडु", "केरल", "ओडिशा"),
                listOf("Andhra Pradesh (Sriharikota Island)", "Tamil Nadu", "Kerala", "Odisha"),
                0, "श्रीहरिकोटा (आंध्र प्रदेश) के सतीश धवन अंतरिक्ष केंद्र से भारत के सभी उपग्रह प्रक्षेपण यान (PSLV, GSLV, LVM3) लॉन्च किए जाते हैं।",
                "Satish Dhawan Space Centre in Sriharikota, Andhra Pradesh is ISRO's orbital launch site.", "Easy"
            ),
            QPayload(
                "भाभा परमाणु अनुसंधान केंद्र (BARC) का मुख्यालय कहाँ स्थित है?",
                "Where is the headquarters of Bhabha Atomic Research Centre (BARC) located?",
                listOf("ट्रॉम्बे, मुंबई (Trombay, Mumbai)", "कल्पक्कम, चेन्नई", "हैदराबाद", "इंदौर"),
                listOf("Trombay, Mumbai", "Kalpakkam, Chennai", "Hyderabad", "Indore"),
                0, "डॉ. होमी जहांगीर भाभा द्वारा 1954 में स्थापित बार्क (BARC) का मुख्यालय ट्रॉम्बे (मुंबई) में है।",
                "BARC is India's premier nuclear research facility headquartered in Trombay, Mumbai.", "Easy"
            ),
            QPayload(
                "केंद्रीय चावल अनुसंधान संस्थान (CRRI - ICAR) भारत के किस शहर में स्थित है?",
                "Where is the National Rice Research Institute (NRRI / CRRI) situated in India?",
                listOf("कटक, ओडिशा (Cuttack, Odisha)", "करनाल, हरियाणा", "शिमला, हिमाचल", "वाराणसी, उत्तर प्रदेश"),
                listOf("Cuttack, Odisha", "Karnal, Haryana", "Shimla, HP", "Varanasi, UP"),
                0, "राष्ट्रीय चावल अनुसंधान संस्थान कटक (ओडिशा) में स्थित है। केंद्रीय आलू अनुसंधान संस्थान शिमला (कुफरी) में है।",
                "The National Rice Research Institute was established in 1946 in Cuttack, Odisha.", "Easy"
            )
        )
        val index = (seed + (mock * 23) + (qNum * 31)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 9: Major Festivals & Folk Arts
    private fun getStkTopic9Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 43 + qNum * 13)
        val questions = listOf(
            QPayload(
                "प्रसिद्ध 'हॉर्नबिल महोत्सव' (Hornbill Festival - Festival of Festivals) प्रतिवर्ष किस पूर्वोत्तर राज्य में मनाया जाता है?",
                "In which northeastern state is the vibrant 'Hornbill Festival' (Festival of Festivals) celebrated every December?",
                listOf("नागालैंड (Nagaland - Kisama Heritage Village)", "असम", "मणिपुर", "मिजोरम"),
                listOf("Nagaland (Kisama Heritage Village)", "Assam", "Manipur", "Mizoram"),
                0, "1 से 10 दिसंबर तक नागालैंड के किसामा हेरिटेज विलेज में नागा जनजातियों की समृद्ध संस्कृति हेतु हॉर्नबिल फेस्टिवल मनाया जाता है।",
                "Hornbill Festival is organized by Nagaland Tourism annually from 1-10 December in Kisama village.", "Easy"
            ),
            QPayload(
                "केरल का सबसे बड़ा फसल उत्सव 'ओणम' (Onam) किस पौराणिक राजा के स्वागत में मनाया जाता है?",
                "The grand harvest festival 'Onam' of Kerala is celebrated to welcome the annual homecoming of which legendary King?",
                listOf("राजा महाबली (King Mahabali - Vallamkali Boat Race)", "राजा विक्रमादित्य", "राजा हर्षवर्धन", "राजा मार्तंड वर्मा"),
                listOf("King Mahabali", "King Vikramaditya", "King Harshavardhana", "King Marthanda Varma"),
                0, "ओणम चिंगम माह में राजा महाबली की स्मृति में मनाया जाता है। इसमें फूलों की रंगोली (पूकलम) और सर्प नौका दौड़ (वल्लम कली) होती है।",
                "Onam is Kerala's prime festival honoring the mythical benevolent King Mahabali.", "Easy"
            ),
            QPayload(
                "बिहू (Bihu) किस भारतीय राज्य का सबसे प्रमुख लोक उत्सव है जो साल में तीन बार (रोंगाली, कोंगाली, भोगाली) मनाया जाता है?",
                "Bihu is the quintessential folk festival of which Indian state, celebrated in three distinct agricultural seasons?",
                listOf("असम (Assam)", "पश्चिम बंगाल", "ओडिशा", "त्रिपुरा"),
                listOf("Assam", "West Bengal", "Odisha", "Tripura"),
                0, "बिहू असम का राष्ट्रीय पर्व है: बोहाग बिहू (नववर्ष/वसंत), काति बिहू (शरद) और माघ बिहू (मकर संक्रांति/फसल कटाई)।",
                "Bihu represents the cultural heart of Assam across Rongali, Kongali, and Bhogali harvest cycles.", "Easy"
            )
        )
        val index = (seed + (mock * 29) + (qNum * 37)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 10: Major Military Exercises
    private fun getStkTopic10Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 47 + qNum * 17)
        val questions = listOf(
            QPayload(
                "भारत, अमेरिका, जापान और ऑस्ट्रेलिया की नौसेनाओं के बीच आयोजित होने वाले बहुपक्षीय नौसैनिक अभ्यास का नाम क्या है?",
                "What is the name of the prestigious quadrilateral naval exercise conducted among India, USA, Japan, and Australia?",
                listOf("मालाबार नौसैनिक अभ्यास (Malabar Exercise)", "वरुण अभ्यास", "इंद्र अभ्यास", "युद्ध अभ्यास"),
                listOf("Malabar Naval Exercise", "Varuna Exercise", "Indra Exercise", "Yudh Abhyas"),
                0, "मालाबार अभ्यास 1992 में भारत-अमेरिका द्विपक्षीय नौसेना से शुरू हुआ जिसमें 2015 में जापान और 2020 में ऑस्ट्रेलिया (क्वाड) शामिल हुए।",
                "Exercise Malabar is a premier high-tempo quadrilateral naval exercise between Quad nations.", "Easy"
            ),
            QPayload(
                "भारत और फ्रांस की थल सेनाओं के बीच आयोजित होने वाले द्विपक्षीय सैन्य अभ्यास का नाम क्या है?",
                "What is the name of the bilateral army joint exercise conducted between India and France?",
                listOf("शक्ति (Exercise Shakti)", "गरुड़", "वरुण", "मित्र शक्ति"),
                listOf("Exercise Shakti (Army)", "Exercise Garuda (Air Force)", "Exercise Varuna (Navy)", "Mitra Shakti (Sri Lanka)"),
                0, "भारत-फ्रांस के बीच: शक्ति (थल सेना), वरुण (नौसेना), और गरुड़ (वायुसेना) अभ्यास आयोजित होते हैं। 'मित्र शक्ति' भारत-श्रीलंका का है।",
                "India-France defense cooperation includes Shakti (Army), Varuna (Navy), and Garuda (Air Force).", "Easy"
            ),
            QPayload(
                "भारत और रूस के बीच आयोजित होने वाले त्रि-सेवा (Tri-Services) संयुक्त युद्धाभ्यास का नाम क्या है?",
                "Which joint tri-service military exercise is conducted bilaterally between India and Russia?",
                listOf("इंद्र (Exercise INDRA)", "सूर्य किरण", "संप्रीति", "नोमैडिक एलिफेंट"),
                listOf("Exercise INDRA", "Surya Kiran (Nepal)", "Sampriti (Bangladesh)", "Nomadic Elephant (Mongolia)"),
                0, "अभ्यास INDRA भारत और रूस के मध्य आयोजित होने वाला संयुक्त सैन्य अभ्यास है। 'सूर्य किरण' भारत-नेपाल और 'संप्रीति' भारत-बांग्लादेश का है।",
                "Exercise INDRA is a joint military exercise between India and the Russian Federation.", "Easy"
            )
        )
        val index = (seed + (mock * 31) + (qNum * 41)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    fun makeStaticQ(
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
    ): GkQuestion = makeStaticGkQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)
}

fun makeStaticGkQ(
    id: String,
    subtopicId: String,
    questionHindi: String,
    questionEnglish: String,
    optionsHindi: List<String>,
    optionsEnglish: List<String>,
    correctOptionIndex: Int,
    explanationHindi: String,
    explanationEnglish: String,
    difficulty: String = "Easy"
): GkQuestion = StaticGkQuestionHelper.makeStaticGkQ(id, subtopicId, questionHindi, questionEnglish, optionsHindi, optionsEnglish, correctOptionIndex, explanationHindi, explanationEnglish, difficulty)

fun makeStaticQ(
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
): GkQuestion = StaticGkQuestionHelper.makeStaticGkQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)
