package com.example.ui.data

import com.example.ui.model.GkQuestion

object GeographyQuestionHelper {
    fun makeGeographyQ(
        id: String,
        subtopic: String,
        qHi: String,
        qEn: String,
        optsHi: List<String>,
        optsEn: List<String>,
        ansIdx: Int,
        expHi: String,
        expEn: String,
        diff: String = "Moderate"
    ): GkQuestion = GkQuestion(
        id = id,
        category = "Indian Geography",
        categoryId = "geography",
        subtopic = subtopic,
        questionHindi = qHi,
        questionEnglish = qEn,
        optionsHindi = optsHi,
        optionsEnglish = optsEn,
        correctAnswerIndex = ansIdx,
        explanationHindi = expHi,
        explanationEnglish = expEn,
        difficulty = diff
    )

    fun generateTopicMocks(
        subtopicId: String,
        startMock: Int,
        endMock: Int,
        templateQuestions: List<GkQuestion>
    ): List<GkQuestion> {
        val result = mutableListOf<GkQuestion>()
        val cleanTopic = subtopicId.removePrefix("geo_")

        for (mock in startMock..endMock) {
            val questionsForMock = getUniqueQuestionsForMock(subtopicId, cleanTopic, mock)
            result.addAll(questionsForMock)
        }
        return result
    }

    private fun getUniqueQuestionsForMock(subtopicId: String, cleanTopic: String, mock: Int): List<GkQuestion> {
        val qList = mutableListOf<GkQuestion>()
        for (qNum in 1..15) {
            val qId = "geo_${cleanTopic}_m${mock}_q$qNum"
            val (qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff) = getQuestionData(cleanTopic, mock, qNum)
            qList.add(
                makeGeographyQ(
                    id = qId,
                    subtopic = subtopicId,
                    qHi = qHi,
                    qEn = qEn,
                    optsHi = optsHi,
                    optsEn = optsEn,
                    ansIdx = ansIdx,
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
            "1" -> getGeoTopic1Data(mock, qNum)
            "2" -> getGeoTopic2Data(mock, qNum)
            "3" -> getGeoTopic3Data(mock, qNum)
            "4" -> getGeoTopic4Data(mock, qNum)
            "5" -> getGeoTopic5Data(mock, qNum)
            "6" -> getGeoTopic6Data(mock, qNum)
            "7" -> getGeoTopic7Data(mock, qNum)
            "8" -> getGeoTopic8Data(mock, qNum)
            "9" -> getGeoTopic9Data(mock, qNum)
            "10" -> getGeoTopic10Data(mock, qNum)
            else -> getGeoTopic1Data(mock, qNum)
        }
    }

    // TOPIC 1: Physiographic Divisions & Himalayas
    private fun getGeoTopic1Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 15 + qNum)
        val questions = listOf(
            QPayload(
                "भारत की मुख्य भूमि का सबसे दक्षिणी बिंदु (Southernmost point of mainland India) कौन-सा है?",
                "Which is the southernmost mainland point of the Republic of India?",
                listOf("कन्याकुमारी / केप कोमोरिन (Kanyakumari, Tamil Nadu)", "इंदिरा पॉइंट (निकोबार)", "किबिथू (अरुणाचल)", "गुहार मोती (गुजरात)"),
                listOf("Kanyakumari / Cape Comorin (Tamil Nadu)", "Indira Point (Great Nicobar)", "Kibithu (Arunachal Pradesh)", "Guhar Moti (Gujarat)"),
                0, "भारत की मुख्य भूमि का दक्षिणतम बिंदु कन्याकुमारी (तमिलनाडु - 8°4' N) है, जबकि भारत का समग्र दक्षिणतम बिंदु इंदिरा पॉइंट (ग्रेट निकोबार - 6°45' N) है।",
                "Cape Comorin at Kanyakumari is the southernmost tip of mainland India.", "Easy"
            ),
            QPayload(
                "भारत का मानक समय रेखा (Standard Meridian of India - 82°30' E देशांतर) किस शहर के पास से होकर गुजरती है?",
                "The Standard Meridian of India (82°30' East longitude) passes through which landmark city?",
                listOf("मिर्जापुर / नैनी, प्रयागराज (Mirzapur, UP)", "उज्जैन", "भोपाल", "नागपुर"),
                listOf("Mirzapur / Naini, Prayagraj (UP)", "Ujjain", "Bhopal", "Nagpur"),
                0, "82°30' पूर्वी देशांतर रेखा मिर्जापुर (UP) से गुजरती है और 5 राज्यों (UP, MP, छत्तीसगढ़, ओडिशा, आंध्र प्रदेश) से होकर जाती है। यह ग्रीनविच समय से 5 घंटे 30 मिनट आगे है।",
                "Indian Standard Time (IST) is calculated from the 82°30'E meridian passing through Mirzapur, UP (+5:30 GMT).", "Easy"
            ),
            QPayload(
                "भारत की सबसे ऊंची पर्वत चोटी 'के-2' (K2 / गॉडविन ऑस्टिन - 8611 मीटर) किस पर्वत श्रेणी में स्थित है?",
                "Mount K2 (Godwin-Austen - 8,611m), India's highest elevation peak, is located in which mountain range?",
                listOf("काराकोरम श्रेणी (Karakoram Range, Trans-Himalayas)", "जास्कर श्रेणी", "लद्दाख श्रेणी", "पीर पंजाल श्रेणी"),
                listOf("Karakoram Range (Trans-Himalayas)", "Zanskar Range", "Ladakh Range", "Pir Panjal Range"),
                0, "के-2 (गॉडविन ऑस्टिन) ट्रांस हिमालय की काराकोरम श्रेणी में स्थित है और विश्व की दूसरी सबसे ऊंची चोटी है। कंचनजंगा (सिक्किम - 8586 मी.) भारत में स्थित निर्विवाद हिमालयी चोटी है।",
                "Mount K2 lies in the Karakoram range, standing as the second tallest peak on Earth.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 11)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 2: Drainage Systems & Rivers
    private fun getGeoTopic2Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 17 + qNum * 5)
        val questions = listOf(
            QPayload(
                "प्रायद्वीपीय भारत की सबसे लंबी नदी (Longest River of Peninsular India - 1465 किमी) कौन-सी है जिसे 'वृद्ध गंगा' या 'दक्षिण गंगा' भी कहा जाता है?",
                "Which is the longest river in Peninsular India (1,465 km), affectionately hailed as 'Dakshin Ganga' or 'Vridha Ganga'?",
                listOf("गोदावरी नदी (Godavari River - त्र्यंबकेश्वर, नासिक)", "कृष्णा नदी", "कावेरी नदी", "महानदी"),
                listOf("Godavari River (Trimbakeshwar, Nashik, Maharashtra)", "Krishna River", "Cauvery River", "Mahanadi"),
                0, "गोदावरी नदी नासिक के त्र्यंबकेश्वर से निकलकर बंगाल की खाड़ी में गिरती है। यह भारत की दूसरी सबसे लंबी नदी है।",
                "The Godavari River is the largest peninsular river basin in India, originating in Maharashtra.", "Easy"
            ),
            QPayload(
                "नर्मदा और ताप्ती नदियां भ्रंश घाटी (Rift Valley) से होकर बहती हुई किस सागर में गिरती हैं और ज्वारनदमुख (Estuary) बनाती हैं?",
                "Flowing through rift valleys between the Vindhya and Satpura ranges, the Narmada and Tapti rivers drain into:",
                listOf("अरब सागर (Arabian Sea / Gulf of Khambhat)", "बंगाल की खाड़ी", "मन्नार की खाड़ी", "हिंद महासागर"),
                listOf("Arabian Sea (Gulf of Khambhat)", "Bay of Bengal", "Gulf of Mannar", "Indian Ocean"),
                0, "नर्मदा और ताप्ती पश्चिम की ओर बहने वाली प्रमुख नदियां हैं जो डेल्टा नहीं बनातीं बल्कि ज्वारनदमुख (Estuaries) बनाती हैं।",
                "Narmada and Tapti flow westward in tectonic rift valleys, forming prominent estuaries in the Arabian Sea.", "Easy"
            ),
            QPayload(
                "विश्व का सबसे बड़ा नदी द्वीप 'माजुली द्वीप' (Majuli Island) किस नदी में स्थित है?",
                "In which mighty river of Assam is Majuli Island, the world's largest inhabited riverine island, situated?",
                listOf("ब्रह्मपुत्र नदी (Brahmaputra River, Assam)", "गंगा नदी", "सिंधु नदी", "मेघना नदी"),
                listOf("Brahmaputra River, Assam", "Ganga River", "Indus River", "Meghna River"),
                0, "माजुली असम में ब्रह्मपुत्र नदी पर स्थित विश्व का सबसे बड़ा नदी द्वीप है और भारत का पहला द्वीप जिला भी है।",
                "Majuli on the Brahmaputra River in Assam is recognized as the world's largest inhabited river island.", "Easy"
            )
        )
        val index = (seed + (mock * 5) + (qNum * 7)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 3: Climate & Monsoons
    private fun getGeoTopic3Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 19 + qNum * 3)
        val questions = listOf(
            QPayload(
                "भारत में ग्रीष्मकालीन दक्षिण-पश्चिम मानसून (South-West Monsoon) सर्वप्रथम किस राज्य के तट (मालाबार तट) पर जून के प्रथम सप्ताह में टकराता है?",
                "The South-West Monsoon makes its initial landfall on the Indian mainland in the first week of June along the coast of:",
                listOf("केरल (Malabar Coast, Kerala)", "तमिलनाडु", "महाराष्ट्र", "ओडिशा"),
                listOf("Kerala (Malabar Coast)", "Tamil Nadu", "Maharashtra", "Odisha"),
                0, "दक्षिण-पश्चिम मानसून 1 जून के आसपास केरल के मालाबार तट पर 'मानसून प्रस्फोट' (Monsoon Burst) के साथ दस्तक देता है।",
                "The Indian southwest monsoon officially arrives on the Kerala coast around June 1.", "Easy"
            ),
            QPayload(
                "विश्व में सर्वाधिक वार्षिक वर्षा (Highest Annual Rainfall - लगभग 11,872 मिमी) वाला स्थान 'मासिनराम' किस राज्य की खासी पहाड़ियों में स्थित है?",
                "In which northeastern state are Mawsynram and Cherrapunji, renowned for receiving the highest rainfall on Earth, situated?",
                listOf("मेघालय (Meghalaya - Khasi Hills)", "असम", "मिजोरम", "अरुणाचल प्रदेश"),
                listOf("Meghalaya (East Khasi Hills)", "Assam", "Mizoram", "Arunachal Pradesh"),
                0, "मेघालय के मासिनराम में कीपाकार (Funnel-shaped) खासी पहाड़ियों के कारण मानसूनी हवाएं घिरकर मूसलाधार वर्षा करती हैं।",
                "Mawsynram in the East Khasi Hills of Meghalaya records the highest average annual precipitation globally.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 13)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 4: Soils & Vegetation
    private fun getGeoTopic4Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 23 + qNum * 7)
        val questions = listOf(
            QPayload(
                "दक्कन के पठार पर बेसाल्ट लावा के अपक्षय से निर्मित कौन-सी मृदा 'कपास की खेती' के लिए सर्वोत्तम मानी जाती है जिसे 'रेगुर मिट्टी' भी कहते हैं?",
                "Which fertile volcanic soil of the Deccan Trap, known for high water retention and ideal for cotton, is termed 'Regur Soil'?",
                listOf("काली मिट्टी (Black / Regur Soil)", "जलोढ़ मिट्टी", "लाल-पीली मिट्टी", "लैटेराइट मिट्टी"),
                listOf("Black Cotton Soil (Regur Soil)", "Alluvial Soil", "Red & Yellow Soil", "Laterite Soil"),
                0, "काली मिट्टी (रेगुर) में क्ले की मात्रा अधिक होने से नमी सोखने की अद्भुत क्षमता होती है। यह महाराष्ट्र, गुजरात और MP में बहुतायत में पाई जाती है।",
                "Black soil (Regur) is rich in clay minerals, ideal for growing cotton and sugarcane.", "Easy"
            )
        )
        val index = (seed + (mock * 11) + (qNum * 17)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 5: Agriculture & Crops
    private fun getGeoTopic5Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 29 + qNum * 5)
        val questions = listOf(
            QPayload(
                "भारत में 'हरित क्रांति' (Green Revolution) का जनक किसे माना जाता है जिन्होंने अधिक उपज देने वाली गेहूं की प्रजातियां (HYV Seeds) पेश की थीं?",
                "Who is revered as the Father of India's Green Revolution for introducing high-yielding semi-dwarf wheat varieties?",
                listOf("डॉ. एम. एस. स्वामीनाथन (Dr. M.S. Swaminathan)", "डॉ. वर्गीज कुरियन", "डॉ. नॉर्मन बोरलॉग", "डॉ. आर. एस. परोदा"),
                listOf("Dr. M.S. Swaminathan", "Dr. Verghese Kurien", "Dr. Norman Borlaug", "Dr. R.S. Paroda"),
                0, "डॉ. एम. एस. स्वामीनाथन ने 1966-67 में पंजाब-हरियाणा में हरित क्रांति का सूत्रपात किया। नॉर्मन बोरलॉग विश्व में हरित क्रांति के जनक हैं।",
                "Dr. M.S. Swaminathan pioneered agricultural modernization leading to grain self-sufficiency in India.", "Easy"
            )
        )
        val index = (seed + (mock * 13) + (qNum * 19)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 6: Mineral Resources
    private fun getGeoTopic6Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 31 + qNum * 7)
        val questions = listOf(
            QPayload(
                "भारत का 'रूर प्रदेश' (Ruhr of India) खनिज संपदा की प्रचुरता के कारण किस पठार को कहा जाता है?",
                "Which mineral-rich plateau in Eastern India is celebrated as the 'Ruhr of India'?",
                listOf("छोटा नागपुर का पठार (Chota Nagpur Plateau - Jharkhand, Bengal, Odisha)", "दक्कन का पठार", "मालवा का पठार", "मेघालय का पठार"),
                listOf("Chota Nagpur Plateau", "Deccan Plateau", "Malwa Plateau", "Meghalaya Plateau"),
                0, "छोटा नागपुर पठार कोयला, लोहा, बॉक्साइट, अभ्रक और यूरेनियम (जादूगोड़ा) के अपार भंडारों के कारण भारत का रूर प्रदेश कहलाता है।",
                "Chota Nagpur Plateau contains India's greatest concentration of mineral resources and heavy industries.", "Easy"
            )
        )
        val index = (seed + (mock * 17) + (qNum * 23)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 7: Energy Resources
    private fun getGeoTopic7Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 37 + qNum * 9)
        val questions = listOf(
            QPayload(
                "भारत का पहला तेल का कुआं 1889 में किस स्थान पर खोदा गया था जो एशिया की सबसे पुरानी तेल रिफाइनरी भी है?",
                "Where was India's (and Asia's) first commercial oil well drilled in 1889, establishing the oldest operational refinery?",
                listOf("डिगबोई, असम (Digboi, Assam)", "बॉम्बे हाई", "अंकलेश्वर, गुजरात", "नहरकटिया"),
                listOf("Digboi, Assam", "Bombay High", "Ankleshwar, Gujarat", "Naharkatiya"),
                0, "डिगबोई (असम) में 1889 में पहला तेल कुआं और 1901 में एशिया की पहली तेल रिफाइनरी शुरू हुई थी।",
                "Digboi in Assam is known as the Birthplace of the Indian Oil Industry.", "Easy"
            )
        )
        val index = (seed + (mock * 19) + (qNum * 29)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 8: Transport & Highways
    private fun getGeoTopic8Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 41 + qNum * 11)
        val questions = listOf(
            QPayload(
                "भारत का सबसे लंबा राष्ट्रीय राजमार्ग (Longest National Highway - 4,112 किमी) कौन-सा है जो श्रीनगर से कन्याकुमारी तक जाता है?",
                "Which is the longest National Highway in India (4,112 km), stretching from Srinagar in J&K to Kanyakumari in Tamil Nadu?",
                listOf("राष्ट्रीय राजमार्ग 44 (NH 44 - North-South Corridor)", "NH 27", "NH 48", "NH 19"),
                listOf("National Highway 44 (NH 44)", "NH 27", "NH 48", "NH 19"),
                0, "NH 44 भारत का सबसे लंबा राजमार्ग है जो 11 राज्यों और 1 UT से गुजरता है। NH 27 (पोरबंदर से सिलचर) दूसरा सबसे लंबा है।",
                "NH 44 spans 4,112 km from North to South, serving as India's primary road transport artery.", "Easy"
            )
        )
        val index = (seed + (mock * 23) + (qNum * 31)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 9: Population & Demographics
    private fun getGeoTopic9Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 43 + qNum * 13)
        val questions = listOf(
            QPayload(
                "2011 की जनगणना के अनुसार भारत के किस राज्य में सर्वाधिक लिंगानुपात (Sex Ratio - 1084 महिलाएं प्रति 1000 पुरुष) दर्ज किया गया था?",
                "According to Census 2011, which Indian state recorded the highest sex ratio (1,084 females per 1,000 males)?",
                listOf("केरल (Kerala - 1084)", "तमिलनाडु", "आंध्र प्रदेश", "छत्तीसगढ़"),
                listOf("Kerala (1084 females per 1000 males)", "Tamil Nadu", "Andhra Pradesh", "Chhattisgarh"),
                0, "2011 की जनगणना में केरल का लिंगानुपात सर्वाधिक (1084) और साक्षरता दर (94%) भी देश में सबसे अधिक रही।",
                "Kerala led India in Census 2011 with the highest sex ratio and highest literacy rate.", "Easy"
            )
        )
        val index = (seed + (mock * 29) + (qNum * 37)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 10: Environmental Issues & Disasters
    private fun getGeoTopic10Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 47 + qNum * 17)
        val questions = listOf(
            QPayload(
                "उत्तराखंड में 1973 में पेड़ों को कटने से बचाने हेतु शुरू किए गए प्रसिद्ध 'चिपको आंदोलन' (Chipko Movement) के प्रणेता कौन थे?",
                "Who was the eminent environmentalist and Gandhian crusader who led the legendary Chipko Movement in Uttarakhand (1973)?",
                listOf("सुंदरलाल बहुगुणा एवं चंडी प्रसाद भट्ट", "मेधा पाटकर", "बाबा आमटे", "डॉ. सलीम अली"),
                listOf("Sunderlal Bahuguna & Chandi Prasad Bhatt (Gaura Devi)", "Medha Patkar", "Baba Amte", "Dr. Salim Ali"),
                0, "1973 में गोपेश्वर (चमोली, उत्तराखंड) में गौरा देवी, सुंदरलाल बहुगुणा ('पारिस्थितिकी स्थायी अर्थव्यवस्था है') और चंडी प्रसाद भट्ट ने चिपको आंदोलन चलाया।",
                "The Chipko Movement was a nonviolent forest conservation movement spearheaded by Sunderlal Bahuguna and Chandi Prasad Bhatt.", "Easy"
            )
        )
        val index = (seed + (mock * 31) + (qNum * 41)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }
}

fun makeGeographyQ(
    id: String,
    subtopic: String,
    qHi: String,
    qEn: String,
    optsHi: List<String>,
    optsEn: List<String>,
    ansIdx: Int,
    expHi: String,
    expEn: String,
    diff: String = "Moderate"
): GkQuestion = GeographyQuestionHelper.makeGeographyQ(id, subtopic, qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff)
