package com.example.ui.data

import com.example.ui.model.GkQuestion

object WorldGkQuestionHelper {
    fun makeWorldQ(
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
            category = "World GK",
            categoryId = "world_gk",
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

    fun makeWorldGkQ(
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
    ): GkQuestion = makeWorldQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)

    fun generateTopicMocks(
        subtopicId: String,
        startMock: Int,
        endMock: Int,
        templateQuestions: List<GkQuestion>
    ): List<GkQuestion> {
        val result = mutableListOf<GkQuestion>()
        val cleanTopic = subtopicId.removePrefix("wgk_")

        for (mock in startMock..endMock) {
            val questionsForMock = getUniqueQuestionsForMock(subtopicId, cleanTopic, mock)
            result.addAll(questionsForMock)
        }
        return result
    }

    private fun getUniqueQuestionsForMock(subtopicId: String, cleanTopic: String, mock: Int): List<GkQuestion> {
        val qList = mutableListOf<GkQuestion>()
        for (qNum in 1..15) {
            val qId = "wgk_${cleanTopic}_m${mock}_q$qNum"
            val (qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff) = getQuestionData(cleanTopic, mock, qNum)
            qList.add(
                makeWorldQ(
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
            "1" -> getWgkTopic1Data(mock, qNum)
            "2" -> getWgkTopic2Data(mock, qNum)
            "3" -> getWgkTopic3Data(mock, qNum)
            "4" -> getWgkTopic4Data(mock, qNum)
            "5" -> getWgkTopic5Data(mock, qNum)
            "6" -> getWgkTopic6Data(mock, qNum)
            "7" -> getWgkTopic7Data(mock, qNum)
            "8" -> getWgkTopic8Data(mock, qNum)
            "9" -> getWgkTopic9Data(mock, qNum)
            "10" -> getWgkTopic10Data(mock, qNum)
            else -> getWgkTopic1Data(mock, qNum)
        }
    }

    // TOPIC 1: World Geography & Continents
    private fun getWgkTopic1Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 15 + qNum)
        val questions = listOf(
            QPayload(
                "विश्व का सबसे बड़ा और गहरा महासागर कौन-सा है जिसमें 'मारियाना गर्त' (Mariana Trench - 11,034 मीटर) स्थित है?",
                "Which is the largest and deepest ocean on Earth, containing the Mariana Trench (Challenger Deep)?",
                listOf("प्रशांत महासागर (Pacific Ocean)", "अटलांटिक महासागर", "हिंद महासागर", "आर्कटिक महासागर"),
                listOf("Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"),
                0, "प्रशांत महासागर पृथ्वी के लगभग एक-तिहाई भाग पर फैला है। इसका सबसे गहरा बिंदु चैलेंजर डीप (मारियाना गर्त - 11,034 मी.) है।",
                "The Pacific Ocean covers over 30% of Earth's surface and houses the deepest oceanic trench, Mariana Trench.", "Easy"
            ),
            QPayload(
                "विश्व का सबसे गर्म और सबसे बड़ा उष्णकटिबंधीय मरुस्थल 'सहारा मरुस्थल' किस महाद्वीप में स्थित है?",
                "In which continent is the Sahara Desert, the world's largest hot desert spanning 11 nations, located?",
                listOf("अफ्रीका (North Africa)", "एशिया", "ऑस्ट्रेलिया", "दक्षिण अमेरिका"),
                listOf("Africa (North Africa)", "Asia", "Australia", "South America"),
                0, "सहारा मरुस्थल उत्तरी अफ्रीका में 92 लाख वर्ग किमी क्षेत्र में विस्तृत है।",
                "The Sahara Desert spans approximately 9.2 million square kilometers across North Africa.", "Easy"
            ),
            QPayload(
                "विश्व की सबसे लंबी पर्वत श्रृंखला 'एंडीज पर्वतमाला' (7,000 किमी) किस महाद्वीप में स्थित है?",
                "In which continent is the Andes mountain range, the longest continental mountain range on Earth, situated?",
                listOf("दक्षिण अमेरिका (South America)", "उत्तर अमेरिका", "यूरोप", "एशिया"),
                listOf("South America", "North America", "Europe", "Asia"),
                0, "एंडीज पर्वतमाला दक्षिण अमेरिका के पश्चिमी तट पर 7 देशों (वेनेजुएला से चिली तक) में 7000 किमी तक फैली है। इसकी सबसे ऊंची चोटी एकांकागुआ है।",
                "The Andes run along the western coast of South America, with Mount Aconcagua as its highest peak.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 11)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 2: World Rivers & Lakes
    private fun getWgkTopic2Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 17 + qNum * 5)
        val questions = listOf(
            QPayload(
                "विश्व की सबसे लंबी नदी 'नील नदी' (Nile River - 6,650 किमी) का उद्गम किस झील से होता है?",
                "From which major African lake does the White Nile, primary headwater of the world's longest river Nile, originate?",
                listOf("विक्टोरिया झील (Lake Victoria)", "तांगानिका झील", "मलावी झील", "चाड झील"),
                listOf("Lake Victoria", "Lake Tanganyika", "Lake Malawi", "Lake Chad"),
                0, "नील नदी विक्टोरिया झील से निकलकर उत्तर की ओर बहती हुई भूमध्य सागर में गिरती है। इसे 'मिस्र का वरदान' कहा जाता है।",
                "The Nile River originates from Lake Victoria in East Africa and empties into the Mediterranean Sea.", "Easy"
            ),
            QPayload(
                "जल प्रवाह की मात्रा (Water Volume) के आधार पर विश्व की सबसे बड़ी नदी कौन-सी है?",
                "Which is the world's largest river by discharge volume, flowing through the vast Amazon Rainforest?",
                listOf("अमेजन नदी (Amazon River, दक्षिण अमेरिका)", "नील नदी", "यांग्त्सी नदी", "कांगो नदी"),
                listOf("Amazon River (South America)", "Nile River", "Yangtze River", "Congo River"),
                0, "अमेजन नदी विश्व में सर्वाधिक जल बहाव वाली नदी है जो पेरू के एंडीज से निकलकर अटलांटिक महासागर में गिरती है।",
                "The Amazon River carries greater water volume than the next seven largest rivers combined.", "Easy"
            ),
            QPayload(
                "विश्व की सबसे गहरी और आयतन की दृष्टि से सबसे बड़ी मीठे पानी की झील 'बैकाल झील' (Lake Baikal) किस देश में स्थित है?",
                "In which country is Lake Baikal, the world's deepest and most voluminous freshwater lake, situated?",
                listOf("रूस (साइबेरिया - Russia)", "कनाडा", "यूएसए", "नॉर्वे"),
                listOf("Russia (Siberia)", "Canada", "USA", "Norway"),
                0, "बैकाल झील (गहराई 1,642 मीटर) साइबेरिया (रूस) में स्थित है और इसमें विश्व के कुल तरल सतही ताजे पानी का 20% भाग है।",
                "Lake Baikal in Siberia, Russia contains approximately 20% of the world's unfrozen surface freshwater.", "Easy"
            )
        )
        val index = (seed + (mock * 5) + (qNum * 7)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 3: UN & International Bodies
    private fun getWgkTopic3Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 19 + qNum * 3)
        val questions = listOf(
            QPayload(
                "संयुक्त राष्ट्र संघ (United Nations) की स्थापना आधिकारिक रूप से 24 अक्टूबर 1945 को किस चार्टर के तहत हुई थी?",
                "The United Nations was officially founded on 24 October 1945 following the ratification of the Charter signed in:",
                listOf("सैन फ्रांसिस्को सम्मेलन (San Francisco Conference)", "लंदन सम्मेलन", "याल्टा सम्मेलन", "जिनेवा समझौता"),
                listOf("San Francisco Conference (UN Charter)", "London Conference", "Yalta Conference", "Geneva Accord"),
                0, "24 अक्टूबर 1945 को 51 संस्थापक देशों के साथ संयुक्त राष्ट्र का गठन हुआ। प्रतिवर्ष 24 अक्टूबर को 'संयुक्त राष्ट्र दिवस' मनाया जाता है।",
                "The UN Charter was signed on 26 June 1945 in San Francisco and entered into force on 24 October 1945.", "Easy"
            ),
            QPayload(
                "संयुक्त राष्ट्र सुरक्षा परिषद (UNSC) में कुल कितने स्थायी (Permanent - Veto Power) सदस्य देश हैं?",
                "How many permanent members with veto power constitute the UN Security Council (P5)?",
                listOf("5 स्थायी सदस्य (USA, Russia, China, UK, France)", "10 सदस्य", "15 सदस्य", "7 सदस्य"),
                listOf("5 Permanent Members (USA, Russia, China, UK, France)", "10 members", "15 members", "7 members"),
                0, "UNSC में 5 स्थायी सदस्य (वीटो शक्ति संपन्न: अमेरिका, रूस, चीन, ब्रिटेन, फ्रांस) और 10 अस्थायी सदस्य (2 वर्ष कार्यकाल) होते हैं।",
                "The UN Security Council consists of 5 permanent members (P5) and 10 non-permanent rotating members.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 13)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 4: Summits & Blocs (G20, BRICS)
    private fun getWgkTopic4Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 23 + qNum * 7)
        val questions = listOf(
            QPayload(
                "भारत की अध्यक्षता में आयोजित 18वें G20 शिखर सम्मेलन (नई दिल्ली - सितंबर 2023) में किस संघ को G20 का 21वां स्थायी सदस्य बनाया गया?",
                "Which continental bloc was formally inducted as the 21st permanent member of G20 during New Delhi Summit 2023?",
                listOf("अफ्रीकी संघ (African Union - 55 countries)", "आसियान (ASEAN)", "यूरोपीय संघ", "ओपेक (OPEC)"),
                listOf("African Union (AU - 55 African member states)", "ASEAN", "European Union", "OPEC"),
                0, "सितंबर 2023 में भारत मंडपम (नई दिल्ली) में भारत की ऐतिहासिक G20 अध्यक्षता में अफ्रीकी संघ को पूर्ण सदस्य बनाया गया ('वसुधैव कुटुम्बकम्')।",
                "The African Union joined as a permanent member during India's 2023 G20 Presidency at Bharat Mandapam.", "Easy"
            )
        )
        val index = (seed + (mock * 11) + (qNum * 17)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 5: World History & Wars
    private fun getWgkTopic5Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 29 + qNum * 5)
        val questions = listOf(
            QPayload(
                "फ्रांसीसी क्रांति (French Revolution) की शुरुआत 14 जुलाई 1789 को किस ऐतिहासिक जेल/किले के पतन के साथ हुई थी?",
                "The French Revolution erupted on 14 July 1789 with the storming of which medieval fortress and prison?",
                listOf("बास्तील का किला (Storming of Bastille)", "वर्साय का महल", "तुइलरीज पैलेस", "लूवर पैलेस"),
                listOf("Bastille Prison (Storming of the Bastille)", "Palace of Versailles", "Tuileries Palace", "Louvre Palace"),
                0, "14 जुलाई 1789 को बास्तील के पतन के साथ फ्रांसीसी क्रांति शुरू हुई जिसने विश्व को 'स्वतंत्रता, समानता और बंधुत्व' (Liberty, Equality, Fraternity) का नारा दिया।",
                "The Storming of the Bastille on 14 July 1789 symbolized the overthrow of absolute monarchical tyranny.", "Easy"
            )
        )
        val index = (seed + (mock * 13) + (qNum * 19)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 6: Capitals, Currencies & Parliaments
    private fun getWgkTopic6Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 31 + qNum * 7)
        val questions = listOf(
            QPayload(
                "जापान की संसद को आधिकारिक रूप से किस नाम से जाना जाता है और जापान की मुद्रा क्या है?",
                "What is the official legislative name of the Parliament of Japan and what is its currency?",
                listOf("डायट (National Diet) एवं येन (Yen)", "ड्यूमा एवं रूबल", "नेसेट एवं शेकेल", "कांग्रेस एवं डॉलर"),
                listOf("National Diet (Kokkai) & Japanese Yen", "Duma & Rouble", "Knesset & Shekel", "Congress & US Dollar"),
                0, "जापान की संसद को 'डायट' (Diet), रूस की संसद को 'ड्यूमा', और इस्राइल की संसद को 'नेसेट' कहा जाता है।",
                "Japan's bicameral parliament is the National Diet, and its national currency is the Yen.", "Easy"
            )
        )
        val index = (seed + (mock * 17) + (qNum * 23)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 7: Wonders & Nobel Prizes
    private fun getWgkTopic7Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 37 + qNum * 9)
        val questions = listOf(
            QPayload(
                "दो अलग-अलग वैज्ञानिक विधाओं (भौतिकी 1903 एवं रसायन 1911) में नोबेल पुरस्कार जीतने वाली विश्व की एकमात्र वैज्ञानिक कौन हैं?",
                "Who is the only scientist in history honored with Nobel Prizes in two distinct scientific fields (Physics 1903 & Chemistry 1911)?",
                listOf("मैरी क्यूरी (Marie Curie - Radioactivity & Radium/Polonium)", "अल्बर्ट आइंस्टीन", "लीनस पॉलिंग", "अर्नेस्ट रदरफोर्ड"),
                listOf("Marie Curie", "Albert Einstein", "Linus Pauling", "Ernest Rutherford"),
                0, "मैडम मैरी क्यूरी ने 1903 में रेडियोधर्मिता (भौतिकी) और 1911 में रेडियम व पोलोनियम की खोज (रसायन) हेतु नोबेल पुरस्कार जीता।",
                "Marie Curie was the first woman to win a Nobel Prize and the first person to win Nobel honors in two scientific fields.", "Easy"
            )
        )
        val index = (seed + (mock * 19) + (qNum * 29)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 8: Volcanoes & Earthquakes
    private fun getWgkTopic8Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 41 + qNum * 11)
        val questions = listOf(
            QPayload(
                "भूमध्य सागर का 'प्रकाश स्तंभ' (Lighthouse of the Mediterranean) किस सक्रिय ज्वालामुखी को कहा जाता है?",
                "Which active volcanic island in the Tyrrhenian Sea is hailed as the 'Lighthouse of the Mediterranean'?",
                listOf("स्ट्रॉम्बोली ज्वालामुखी (Stromboli Volcano, इटली)", "माउंट एटना", "माउंट वेसुवियस", "क्राकाटोआ"),
                listOf("Stromboli Volcano (Aeolian Islands, Italy)", "Mount Etna", "Mount Vesuvius", "Krakatoa"),
                0, "इटली के लिपारी द्वीप समूह में स्थित स्ट्रॉम्बोली ज्वालामुखी से निरंतर प्रज्वलित गैसें और लावा निकलता रहता है।",
                "Stromboli volcano has been erupting almost continuously for over 2,000 years, illuminating the Mediterranean sky.", "Easy"
            )
        )
        val index = (seed + (mock * 23) + (qNum * 31)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 9: Treaties & Geopolitical Blocs
    private fun getWgkTopic9Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 43 + qNum * 13)
        val questions = listOf(
            QPayload(
                "उत्तरी अटलांटिक संधि संगठन (NATO - North Atlantic Treaty Organization) की स्थापना 1949 में हुई थी। इसका मुख्यालय कहाँ है?",
                "Where is the permanent headquarters of the North Atlantic Treaty Organization (NATO) located?",
                listOf("ब्रुसेल्स, बेल्जियम (Brussels, Belgium)", "हेग, नीदरलैंड्स", "जिनेवा", "लंदन"),
                listOf("Brussels, Belgium", "The Hague, Netherlands", "Geneva", "London"),
                0, "नाटो की स्थापना 4 अप्रैल 1949 को वाशिंगटन संधि द्वारा सामूहिक रक्षा हेतु की गई थी। इसका मुख्यालय ब्रुसेल्स (बेल्जियम) में है।",
                "NATO is an intergovernmental military alliance headquartered in Brussels, Belgium.", "Easy"
            )
        )
        val index = (seed + (mock * 29) + (qNum * 37)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 10: Exploration & Space Missions
    private fun getWgkTopic10Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 47 + qNum * 17)
        val questions = listOf(
            QPayload(
                "20 जुलाई 1969 को चंद्रमा की सतह (Sea of Tranquility) पर कदम रखने वाले मानव इतिहास के प्रथम व्यक्ति कौन थे?",
                "Who was the first human to step onto the lunar surface during NASA's Apollo 11 mission on 20 July 1969?",
                listOf("नील आर्मस्ट्रांग (Neil Armstrong - 'That's one small step for man, one giant leap for mankind')", "बज एल्ड्रिन", "माइकल कोलिन्स", "यूरी गागरिन"),
                listOf("Neil Armstrong", "Buzz Aldrin", "Michael Collins", "Yuri Gagarin"),
                0, "अपोलो 11 अंतरिक्ष यान के कमांडर नील आर्मस्ट्रांग ने 20 जुलाई 1969 को चंद्रमा पर पहला कदम रखा। यूरी गागरिन (1961) अंतरिक्ष में जाने वाले पहले मानव थे।",
                "Neil Armstrong made history on 20 July 1969 by becoming the first person to walk on the Moon.", "Easy"
            )
        )
        val index = (seed + (mock * 31) + (qNum * 41)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }
}

fun makeWorldQ(
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
): GkQuestion = WorldGkQuestionHelper.makeWorldQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)

fun makeWorldGkQ(
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
): GkQuestion = WorldGkQuestionHelper.makeWorldGkQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)
