package com.example.ui.data

import com.example.ui.model.GkQuestion

object SportsQuestionHelper {
    fun makeSportsQ(
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
            category = "Sports & Games",
            categoryId = "sports",
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

    fun generateTopicMocks(
        subtopicId: String,
        startMock: Int,
        endMock: Int,
        templateQuestions: List<GkQuestion>
    ): List<GkQuestion> {
        val result = mutableListOf<GkQuestion>()
        val cleanTopic = subtopicId.removePrefix("spt_")

        for (mock in startMock..endMock) {
            val questionsForMock = getUniqueQuestionsForMock(subtopicId, cleanTopic, mock)
            result.addAll(questionsForMock)
        }
        return result
    }

    private fun getUniqueQuestionsForMock(subtopicId: String, cleanTopic: String, mock: Int): List<GkQuestion> {
        val qList = mutableListOf<GkQuestion>()
        for (qNum in 1..15) {
            val qId = "spt_${cleanTopic}_m${mock}_q$qNum"
            val (qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff) = getQuestionData(cleanTopic, mock, qNum)
            qList.add(
                makeSportsQ(
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
            "1" -> getSptTopic1Data(mock, qNum)
            "2" -> getSptTopic2Data(mock, qNum)
            "3" -> getSptTopic3Data(mock, qNum)
            "4" -> getSptTopic4Data(mock, qNum)
            "5" -> getSptTopic5Data(mock, qNum)
            "6" -> getSptTopic6Data(mock, qNum)
            "7" -> getSptTopic7Data(mock, qNum)
            "8" -> getSptTopic8Data(mock, qNum)
            "9" -> getSptTopic9Data(mock, qNum)
            "10" -> getSptTopic10Data(mock, qNum)
            else -> getSptTopic1Data(mock, qNum)
        }
    }

    // TOPIC 1: Olympics & Paralympics
    private fun getSptTopic1Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 15 + qNum)
        val questions = listOf(
            QPayload(
                "टोक्यो ओलंपिक 2020 (आयोजित 2021) में भारत के नीरज चोपड़ा ने भाला फेंक (Javelin Throw) में कितने मीटर की दूरी पर भाला फेंककर ऐतिहासिक स्वर्ण पदक जीता था?",
                "With a gold-winning throw of what exact distance did Neeraj Chopra clinch India's historic track & field Olympic Gold at Tokyo 2020?",
                listOf("87.58 मीटर (87.58 meters - 7 August 2021)", "88.07 मीटर", "86.45 मीटर", "89.94 मीटर"),
                listOf("87.58 meters", "88.07 meters", "86.45 meters", "89.94 meters"),
                0, "7 अगस्त 2021 को नीरज चोपड़ा ने 87.58 मीटर भाला फेंककर भारत को एथलेटिक्स का पहला ओलंपिक स्वर्ण दिलाया। 7 अगस्त को 'राष्ट्रीय भाला फेंक दिवस' घोषित किया गया।",
                "Neeraj Chopra won the Tokyo 2020 Javelin Gold with an 87.58m throw, inspiring National Javelin Day on 7 August.", "Easy"
            ),
            QPayload(
                "व्यक्तिगत स्पर्धा में ओलंपिक स्वर्ण पदक जीतने वाले स्वतंत्र भारत के प्रथम खिलाड़ी कौन थे?",
                "Who was the first individual Olympic Gold Medalist for independent India (Beijing 2008 10m Air Rifle)?",
                listOf("अभिनव बिंद्रा (Abhinav Bindra - Beijing 2008)", "के. डी. जाधव", "लिएंडर पेस", "सुशील कुमार"),
                listOf("Abhinav Bindra (Beijing 2008 10m Air Rifle)", "K.D. Jadhav", "Leander Paes", "Sushil Kumar"),
                0, "अभिनव बिंद्रा ने 2008 बीजिंग ओलंपिक में 10 मीटर एयर राइफल में भारत का पहला व्यक्तिगत स्वर्ण पदक जीता।",
                "Abhinav Bindra made history at the 2008 Beijing Olympics by winning India's first individual Olympic gold medal.", "Easy"
            ),
            QPayload(
                "ओलंपिक में लगातार दो पदक (रजत - रियो 2016, कांस्य - टोक्यो 2020) जीतने वाली प्रथम भारतीय महिला खिलाड़ी कौन हैं?",
                "Who is the first Indian woman athlete to win medals at two consecutive Olympic Games (Rio 2016 & Tokyo 2020)?",
                listOf("पी. वी. सिंधु (P.V. Sindhu - Badminton)", "साइना नेहवाल", "मैरी कॉम", "मीराबाई चानू"),
                listOf("P.V. Sindhu (Badminton)", "Saina Nehwal", "Mary Kom", "Mirabai Chanu"),
                0, "पी. वी. सिंधु ने रियो 2016 में बैडमिंटन एकल में रजत और टोक्यो 2020 में कांस्य पदक जीता।",
                "P.V. Sindhu became the first Indian woman to earn two consecutive Olympic badminton medals.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 11)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 2: Cricket & ICC Tournaments
    private fun getSptTopic2Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 17 + qNum * 5)
        val questions = listOf(
            QPayload(
                "भारतीय क्रिकेट टीम ने कपिल देव की कप्तानी में किस ऐतिहासिक तिथि को लॉर्ड्स के मैदान पर वेस्टइंडीज को हराकर पहला ICC एकदिवसीय विश्व कप जीता था?",
                "On which historic date did India, under Kapil Dev's captaincy, win their maiden ICC Cricket World Cup defeating West Indies at Lord's?",
                listOf("25 जून 1983 (25 June 1983)", "2 अप्रैल 2011", "24 सितंबर 2007", "15 जुलाई 1987"),
                listOf("25 June 1983", "2 April 2011", "24 September 2007", "15 July 1987"),
                0, "25 जून 1983 को भारत ने वेस्टइंडीज को 43 रनों से हराकर प्रूडेंशियल विश्व कप जीता। मोहिंदर अमरनाथ मैन ऑफ द मैच रहे।",
                "India defeated Clive Lloyd's West Indies by 43 runs in the historic 1983 World Cup Final at Lord's.", "Easy"
            ),
            QPayload(
                "अंतर्राष्ट्रीय क्रिकेट में 100 शतकों (Centuries) का विश्व कीर्तिमान स्थापित करने वाले एकमात्र बल्लेबाज कौन हैं?",
                "Who remains the only cricketer in history to register 100 international centuries across Tests and ODIs?",
                listOf("सचिन तेंदुलकर (Sachin Tendulkar - 51 Test, 49 ODI)", "विराट कोहली", "रिकी पोंटिंग", "रोहित शर्मा"),
                listOf("Sachin Tendulkar", "Virat Kohli", "Ricky Ponting", "Rohit Sharma"),
                0, "सचिन तेंदुलकर ने 2012 में बांग्लादेश के खिलाफ ढाका में अपना 100वां अंतर्राष्ट्रीय शतक पूरा किया।",
                "Sachin Tendulkar scored a legendary 100 international centuries during his 24-year illustrious career.", "Easy"
            )
        )
        val index = (seed + (mock * 5) + (qNum * 7)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 3: Football & FIFA
    private fun getSptTopic3Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 19 + qNum * 3)
        val questions = listOf(
            QPayload(
                "फीफा विश्व कप (FIFA World Cup) का खिताब सर्वाधिक 5 बार (1958, 1962, 1970, 1994, 2002) किस देश ने जीता है?",
                "Which nation holds the record of winning the most FIFA Men's World Cup titles (5 times)?",
                listOf("ब्राजील (Brazil)", "जर्मनी", "इटली", "अर्जेंटीना"),
                listOf("Brazil", "Germany", "Italy", "Argentina"),
                0, "ब्राजील ने पेले, रोनाल्डो, रोनाल्डिन्हो के दौर में 5 बार विश्व कप जीता। 2022 फीफा विश्व कप कतर में अर्जेंटीना ने जीता।",
                "Brazil is the only nation to win 5 FIFA World Cups, lifting trophies in 1958, 1962, 1970, 1994, and 2002.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 13)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 4: Tennis Grand Slams
    private fun getSptTopic4Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 23 + qNum * 7)
        val questions = listOf(
            QPayload(
                "चारों टेनिस ग्रैंड स्लैम में से कौन-सा टूर्नामेंट लाल बजरी (Clay Court / Roland Garros) पर खेला जाता है?",
                "Which of the four annual Grand Slam tennis tournaments is contested on red clay at Roland Garros?",
                listOf("फ्रेंच ओपन (French Open / Roland Garros)", "विंबलडन", "ऑस्ट्रेलियाई ओपन", "यूएस ओपन"),
                listOf("French Open (Roland Garros)", "Wimbledon (Grass)", "Australian Open (Hard)", "US Open (Hard)"),
                0, "फ्रेंच ओपन क्ले कोर्ट पर खेला जाता है। राफेल नडाल को रिकॉर्ड 14 फ्रेंच ओपन खिताबों के कारण 'किंग ऑफ क्ले' कहा जाता है।",
                "French Open is held on red clay courts, where Rafael Nadal holds a record 14 singles championships.", "Easy"
            )
        )
        val index = (seed + (mock * 11) + (qNum * 17)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 5: Asian & Commonwealth Games
    private fun getSptTopic5Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 29 + qNum * 5)
        val questions = listOf(
            QPayload(
                "प्रथम एशियाई खेल (First Asian Games) 1951 में किस शहर में आयोजित किए गए थे?",
                "In which city were the inaugural Asian Games hosted in March 1951?",
                listOf("नई दिल्ली, भारत (New Delhi - National Stadium)", "टोक्यो, जापान", "मनीला, फिलीपींस", "जकार्ता, इंडोनेशिया"),
                listOf("New Delhi, India (National Stadium)", "Tokyo, Japan", "Manila, Philippines", "Jakarta, Indonesia"),
                0, "4 से 11 मार्च 1951 तक नई दिल्ली के ध्यानचंद नेशनल स्टेडियम में पहले एशियाई खेल आयोजित हुए जिसका आदर्श वाक्य 'Ever Onward' था।",
                "The 1st Asian Games took place in New Delhi in 1951, inaugurated by President Dr. Rajendra Prasad.", "Easy"
            )
        )
        val index = (seed + (mock * 13) + (qNum * 19)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 6: Sports Awards & Trophies
    private fun getSptTopic6Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 31 + qNum * 7)
        val questions = listOf(
            QPayload(
                "भारत का सर्वोच्च खेल पुरस्कार 'मेजर ध्यानचंद खेल रत्न' (पूर्व नाम राजीव गांधी खेल रत्न) सर्वप्रथम 1991-92 में किसे दिया गया था?",
                "Who was the inaugural recipient of India's highest sporting honour, the Major Dhyan Chand Khel Ratna Award (1991-92)?",
                listOf("विश्वनाथन आनंद (Chess Grandmaster)", "सचिन तेंदुलकर", "गीत सेठी", "धनराज पिल्लै"),
                listOf("Viswanathan Anand (Chess Grandmaster)", "Sachin Tendulkar", "Geet Sethi", "Dhanraj Pillay"),
                0, "भारत के प्रथम ग्रैंडमास्टर विश्वनाथन आनंद को 1991-92 में पहला खेल रत्न पुरस्कार (राशि 25 लाख रु.) प्रदान किया गया।",
                "Chess Grandmaster Viswanathan Anand was honored with the first Khel Ratna award in 1991-92.", "Easy"
            )
        )
        val index = (seed + (mock * 17) + (qNum * 23)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 7: Terminology & Rules
    private fun getSptTopic7Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 37 + qNum * 9)
        val questions = listOf(
            QPayload(
                "खेल शब्दावली 'बटरफ्लाई स्ट्रोक' (Butterfly Stroke) और 'फ्रीस्टाइल' किस खेल से संबंधित हैं?",
                "The terms 'Butterfly Stroke', 'Backstroke', and 'Freestyle' are universally associated with:",
                listOf("तैराकी (Swimming)", "रोइंग", "वाटर पोलो", "नौकायन"),
                listOf("Swimming", "Rowing", "Water Polo", "Sailing"),
                0, "तैराकी में चार प्रमुख शैलियां होती हैं: फ्रीस्टाइल, बैकस्ट्रोक, ब्रेस्टस्ट्रोक और बटरफ्लाई स्ट्रोक।",
                "Butterfly stroke is one of the most physically demanding competitive swimming styles.", "Easy"
            )
        )
        val index = (seed + (mock * 19) + (qNum * 29)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 8: Traditional Sports & Martial Arts
    private fun getSptTopic8Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 41 + qNum * 11)
        val questions = listOf(
            QPayload(
                "केरल की प्राचीनतम मार्शल आर्ट 'कलारीपयट्टू' (Kalaripayattu) को क्या माना जाता है?",
                "Kalaripayattu, the revered martial art of Kerala, is traditionally celebrated as:",
                listOf("विश्व की प्राचीनतम जीवित युद्ध कला (Mother of all martial arts)", "तीरंदाजी विद्या", "कुश्ती शैली", "नौका रेस"),
                listOf("Mother of all martial arts (Oldest surviving combat system)", "Archery style", "Wrestling form", "Boat racing"),
                0, "कलारीपयट्टू केरल की 3000 वर्ष प्राचीन युद्ध कला है जिसे भगवान परशुराम द्वारा स्थापित माना जाता है।",
                "Kalaripayattu originated in Kerala as a holistic weapon and unarmed combat discipline.", "Easy"
            )
        )
        val index = (seed + (mock * 23) + (qNum * 31)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 9: Chess & Athletics
    private fun getSptTopic9Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 43 + qNum * 13)
        val questions = listOf(
            QPayload(
                "शतरंज (Chess) के बोर्ड पर कुल कितने चौखाने (Squares) होते हैं?",
                "How many total black and white squares constitute a standard tournament Chessboard (8x8 grid)?",
                listOf("64 वर्ग (32 सफेद और 32 काले)", "32 वर्ग", "100 वर्ग", "54 वर्ग"),
                listOf("64 squares (32 white and 32 black)", "32 squares", "100 squares", "54 squares"),
                0, "शतरंज का बोर्ड 8×8 के ग्रिड में 64 खानों का होता है। शतरंज का उद्गम भारत में 'चतुरंग' के रूप में हुआ था।",
                "A standard chessboard contains 64 squares arranged in an 8-by-8 grid.", "Easy"
            )
        )
        val index = (seed + (mock * 29) + (qNum * 37)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 10: Paralympic & Governance
    private fun getSptTopic10Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 47 + qNum * 17)
        val questions = listOf(
            QPayload(
                "टोक्यो पैरालंपिक 2020 में 10 मीटर एयर राइफल में स्वर्ण और 50 मीटर राइफल 3P में कांस्य जीतकर एक ही पैरालंपिक में 2 पदक जीतने वाली पहली भारतीय महिला कौन हैं?",
                "Who became the first Indian woman to win 2 medals at a single Paralympic Games (Gold in 10m Air Rifle SH1, Tokyo 2020)?",
                listOf("अवनि लेखरा (Avani Lekhara - Jaipur, Rajasthan)", "दीपा मलिक", "भाविना पटेल", "एकता भ्यान"),
                listOf("Avani Lekhara (Jaipur, Rajasthan)", "Deepa Malik", "Bhavina Patel", "Ekta Bhyan"),
                0, "जयपुर (राजस्थान) की निशानेबाज अवनि लेखरा ने टोक्यो 2020 और पेरिस 2024 पैरालंपिक में स्वर्ण पदक जीतकर इतिहास रचा।",
                "Avani Lekhara created history by winning gold at Tokyo 2020 and defending it at Paris 2024 Paralympics.", "Easy"
            )
        )
        val index = (seed + (mock * 31) + (qNum * 41)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }
}

fun makeSportsQ(
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
): GkQuestion = SportsQuestionHelper.makeSportsQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)
