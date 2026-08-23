package com.example.ui.data

import com.example.ui.model.GkQuestion

object EconomyQuestionHelper {
    fun makeEconomyQ(
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
        category = "Indian Economy",
        categoryId = "economy",
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
        val cleanTopic = subtopicId.removePrefix("eco_")

        for (mock in startMock..endMock) {
            val questionsForMock = getUniqueQuestionsForMock(subtopicId, cleanTopic, mock)
            result.addAll(questionsForMock)
        }
        return result
    }

    private fun getUniqueQuestionsForMock(subtopicId: String, cleanTopic: String, mock: Int): List<GkQuestion> {
        val qList = mutableListOf<GkQuestion>()
        for (qNum in 1..15) {
            val qId = "eco_${cleanTopic}_m${mock}_q$qNum"
            val (qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff) = getQuestionData(cleanTopic, mock, qNum)
            qList.add(
                makeEconomyQ(
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
            "1" -> getEcoTopic1Data(mock, qNum)
            "2" -> getEcoTopic2Data(mock, qNum)
            "3" -> getEcoTopic3Data(mock, qNum)
            "4" -> getEcoTopic4Data(mock, qNum)
            "5" -> getEcoTopic5Data(mock, qNum)
            "6" -> getEcoTopic6Data(mock, qNum)
            "7" -> getEcoTopic7Data(mock, qNum)
            "8" -> getEcoTopic8Data(mock, qNum)
            "9" -> getEcoTopic9Data(mock, qNum)
            "10" -> getEcoTopic10Data(mock, qNum)
            else -> getEcoTopic1Data(mock, qNum)
        }
    }

    // TOPIC 1: National Income & GDP
    private fun getEcoTopic1Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 15 + qNum)
        val questions = listOf(
            QPayload(
                "भारत में राष्ट्रीय आय (National Income) की वैज्ञानिक गणना सर्वप्रथम 1931-32 में किसके द्वारा की गई थी?",
                "Who was the first economist to perform a scientific estimation of India's National Income in 1931-32?",
                listOf("डॉ. वी. के. आर. वी. राव (Dr. V.K.R.V. Rao)", "दादाभाई नौरोजी", "पी. सी. महालनोबिस", "अमर्त्य सेन"),
                listOf("Dr. V.K.R.V. Rao", "Dadabhai Naoroji", "P.C. Mahalanobis", "Amartya Sen"),
                0, "डॉ. वी. के. आर. वी. राव ने 1931-32 में पहली बार वैज्ञानिक विधि से राष्ट्रीय आय की गणना की। दादाभाई नौरोजी ने 1867-68 में पहली अनौपचारिक गणना (प्रति व्यक्ति आय ₹20) की थी।",
                "Dr. V.K.R.V. Rao pioneered the first scientific national income accounting for India in 1931-32.", "Easy"
            ),
            QPayload(
                "सकल घरेलू उत्पाद (GDP) में से मूल्यह्रास (Depreciation) घटाने पर कौन-सी अवधारणा प्राप्त होती है?",
                "Subtracting Depreciation (Consumption of Fixed Capital) from Gross Domestic Product (GDP) yields:",
                listOf("शुद्ध घरेलू उत्पाद (Net Domestic Product - NDP)", "सकल राष्ट्रीय उत्पाद (GNP)", "राष्ट्रीय आय (NNP at Factor Cost)", "व्यक्तिगत आय"),
                listOf("Net Domestic Product (NDP)", "Gross National Product (GNP)", "Net National Product (NNP)", "Personal Income"),
                0, "NDP = GDP - Depreciation (मूल्यह्रास)। इसी प्रकार NNP = GNP - Depreciation होता है।",
                "Net Domestic Product (NDP) equals Gross Domestic Product minus capital depreciation.", "Easy"
            ),
            QPayload(
                "भारत में राष्ट्रीय सांख्यिकी कार्यालय (NSO) द्वारा राष्ट्रीय आय की गणना हेतु वर्तमान में किस वर्ष को आधार वर्ष (Base Year) माना गया है?",
                "Which financial year is currently used as the benchmark Base Year for calculating India's Real GDP?",
                listOf("2011-12 (Base Year 2011-12)", "2004-05", "2017-18", "2020-21"),
                listOf("2011-12", "2004-05", "2017-18", "2020-21"),
                0, "केंद्रीय सांख्यिकी संगठन (CSO/NSO) ने जनवरी 2015 से राष्ट्रीय आय का आधार वर्ष 2004-05 से बदलकर 2011-12 कर दिया था।",
                "The base year for India's national accounts and GDP calculation was updated to 2011-12 in 2015.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 11)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 2: Fiscal Policy & Budget
    private fun getEcoTopic2Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 17 + qNum * 5)
        val questions = listOf(
            QPayload(
                "भारतीय संविधान के किस अनुच्छेद के तहत केंद्र सरकार के 'वार्षिक वित्तीय विवरण' (Annual Financial Statement / Budget) का उल्लेख है?",
                "Under which Article of the Constitution of India is the Annual Financial Statement (Union Budget) presented to Parliament?",
                listOf("अनुच्छेद 112 (Article 112)", "अनुच्छेद 110", "अनुच्छेद 280", "अनुच्छेद 360"),
                listOf("Article 112", "Article 110", "Article 280", "Article 360"),
                0, "संविधान में 'बजट' शब्द का प्रयोग नहीं है; अनुच्छेद 112 में इसे 'वार्षिक वित्तीय विवरण' (Annual Financial Statement) कहा गया है।",
                "Article 112 of the Indian Constitution mandates the presentation of the Annual Financial Statement.", "Easy"
            ),
            QPayload(
                "राजकोषीय उत्तरदायित्व और बजट प्रबंधन अधिनियम (FRBM Act) किस वर्ष लागू किया गया था?",
                "In which year was the Fiscal Responsibility and Budget Management (FRBM) Act enacted to enforce fiscal discipline?",
                listOf("2003 (FRBM Act 2003)", "1991", "2000", "2008"),
                listOf("2003", "1991", "2000", "2008"),
                0, "FRBM अधिनियम 2003 में राजकोषीय घाटा कम करने और वित्तीय स्थिरता लाने हेतु पारित किया गया था।",
                "The FRBM Act was enacted in 2003 to institutionalize financial discipline and reduce fiscal deficits.", "Easy"
            )
        )
        val index = (seed + (mock * 5) + (qNum * 7)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 3: RBI & Monetary Policy
    private fun getEcoTopic3Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 19 + qNum * 3)
        val questions = listOf(
            QPayload(
                "भारतीय रिज़र्व बैंक (RBI) की स्थापना 1 अप्रैल 1935 को किस आयोग की सिफारिश पर की गई थी?",
                "On the recommendations of which Commission was the Reserve Bank of India (RBI) established on 1 April 1935?",
                listOf("हिल्टन यंग आयोग (Hilton Young Commission / Royal Commission)", "हंटर आयोग", "साइमन कमीशन", "चेंबरलेन आयोग"),
                listOf("Hilton Young Commission (Royal Commission on Indian Currency and Finance)", "Hunter Commission", "Simon Commission", "Chamberlain Commission"),
                0, "1926 में हिल्टन यंग आयोग की सिफारिश पर RBI Act 1934 पारित हुआ और 1 अप्रैल 1935 को 5 करोड़ की अधिकृत पूंजी से RBI की स्थापना हुई। 1 जनवरी 1949 को इसका राष्ट्रीयकरण हुआ।",
                "RBI was set up on 1 April 1935 based on the Hilton Young Commission recommendations and nationalized in 1949.", "Easy"
            ),
            QPayload(
                "रेपो दर (Repo Rate) वह ब्याज दर है जिस पर:",
                "Repo Rate (Repurchase Option Rate) is the benchmark interest rate at which:",
                listOf("RBI वाणिज्यिक बैंकों को अल्पकालिक ऋण प्रदान करता है", "वाणिज्यिक बैंक RBI के पास अपनी अतिरिक्त नकदी जमा करते हैं", "बैंक आम जनता को ऋण देते हैं", "सरकार विदेशी ऋण लेती है"),
                listOf("RBI lends short-term funds to commercial banks against government securities", "Commercial banks park excess funds with RBI", "Banks lend to general public", "Government borrows from abroad"),
                0, "रेपो रेट वह दर है जिस पर RBI बैंकों को प्रतिभूतियों के बदले अल्पकालिक नकदी देता है। रिवर्स रेपो रेट पर बैंक अपनी अतिरिक्त तरलता RBI के पास जमा करते हैं।",
                "Repo rate is the policy rate at which the RBI lends liquidity to banks against government collateral.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 13)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 4: Five-Year Plans & NITI Aayog
    private fun getEcoTopic4Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 23 + qNum * 7)
        val questions = listOf(
            QPayload(
                "योजना आयोग (Planning Commission) के स्थान पर 'नीति आयोग' (NITI Aayog) का गठन किस तिथि को किया गया था?",
                "On which date was NITI Aayog (National Institution for Transforming India) officially constituted replacing Planning Commission?",
                listOf("1 जनवरी 2015 (1 January 2015)", "15 अगस्त 2014", "1 अप्रैल 2015", "8 नवंबर 2016"),
                listOf("1 January 2015", "15 August 2014", "1 April 2015", "8 November 2016"),
                0, "1 जनवरी 2015 को केंद्रीय मंत्रिमंडल के प्रस्ताव द्वारा थिंक-टैंक नीति आयोग (NITI - National Institution for Transforming India) का गठन हुआ। इसके पदेन अध्यक्ष प्रधानमंत्री होते हैं।",
                "NITI Aayog was established on 1 January 2015 to foster cooperative federalism with the Prime Minister as ex-officio Chairperson.", "Easy"
            ),
            QPayload(
                "भारत की 'द्वितीय पंचवर्षीय योजना' (1956-61) किस आर्थिक मॉडल पर आधारित थी जिसमें भारी उद्योगों को प्राथमिकता दी गई थी?",
                "India's Second Five-Year Plan (1956-61), focused on rapid industrialization and heavy industries, was based on the:",
                listOf("पी. सी. महालनोबिस मॉडल (P.C. Mahalanobis Heavy Industry Model)", "हैरोड-डोमर मॉडल", "गाडगिल योजना", "जॉन डब्ल्यू. मिलर मॉडल"),
                listOf("P.C. Mahalanobis Model", "Harrod-Domar Model", "Gadgil Plan", "John W. Miller Model"),
                0, "प्रथम पंचवर्षीय योजना हैरोड-डोमर मॉडल (कृषि प्राथमिकता) पर तथा द्वितीय योजना महालनोबिस मॉडल (भिलाई, राउरकेला, दुर्गापुर स्टील प्लांट) पर आधारित थी।",
                "The Second Five-Year Plan followed the Mahalanobis model, prioritizing basic and heavy capital goods industries.", "Easy"
            )
        )
        val index = (seed + (mock * 11) + (qNum * 17)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 5: Foreign Trade & WTO
    private fun getEcoTopic5Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 29 + qNum * 5)
        val questions = listOf(
            QPayload(
                "विश्व व्यापार संगठन (WTO - World Trade Organization) की स्थापना 1 जनवरी 1995 को किस समझौते (Agreement) के तहत हुई थी?",
                "The World Trade Organization (WTO) was established on 1 January 1995 following the ratification of the:",
                listOf("माराकेश समझौता (Marrakesh Agreement - GATT Uruguay Round)", "ब्रेटन वुड्स समझौता", "क्योटो प्रोटोकॉल", "पेरिस समझौता"),
                listOf("Marrakesh Agreement (Uruguay Round)", "Bretton Woods Agreement", "Kyoto Protocol", "Paris Agreement"),
                0, "1947 के गैट (GATT) को प्रतिस्थापित कर 1 जनवरी 1995 को माराकेश समझौते द्वारा WTO की स्थापना हुई जिसका मुख्यालय जिनेवा में है।",
                "WTO replaced GATT on 1 January 1995 pursuant to the 1994 Marrakesh Agreement.", "Easy"
            )
        )
        val index = (seed + (mock * 13) + (qNum * 19)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 6: Industry & Digital Economy
    private fun getEcoTopic6Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 31 + qNum * 7)
        val questions = listOf(
            QPayload(
                "भारत में महारत्न (Maharatna) कंपनियों का दर्जा प्राप्त करने के लिए किसी केंद्रीय सार्वजनिक उपक्रम (CPSE) का विगत 3 वर्षों का औसत वार्षिक निवल लाभ (Net Profit) कम से कम कितना होना चाहिए?",
                "To qualify for Maharatna status, a central public enterprise must record an average annual net profit after tax of at least:",
                listOf("₹5,000 करोड़ से अधिक", "₹1,000 करोड़", "₹2,500 करोड़", "₹10,000 करोड़"),
                listOf("Over ₹5,000 crore", "₹1,000 crore", "₹2,500 crore", "₹10,000 crore"),
                0, "महारत्न बनने के लिए नवरत्न दर्जा, स्टॉक एक्सचेंज पर सूचीबद्धता, 3 साल का औसत कारोबार ₹25,000 करोड़ और शुद्ध लाभ ₹5,000 करोड़ होना आवश्यक है।",
                "Maharatna CPSE criteria requires 3-year average annual net profit exceeding ₹5,000 crore.", "Easy"
            )
        )
        val index = (seed + (mock * 17) + (qNum * 23)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 7: Poverty & Unemployment
    private fun getEcoTopic7Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 37 + qNum * 9)
        val questions = listOf(
            QPayload(
                "भारत में योजना आयोग द्वारा गरीबी रेखा के निर्धारण हेतु किस समिति ने 'प्रति व्यक्ति उपभोग व्यय' (Monthly Per Capita Expenditure - MPCE) का पैमाना दिया था?",
                "Which landmark expert committee appointed by the Planning Commission recommended poverty lines based on consumption expenditure in 2009?",
                listOf("सुरेश तेंदुलकर समिति (Tendulkar Committee - 2009)", "रंगराजन समिति", "लकड़ावाला समिति", "अलघ समिति"),
                listOf("Tendulkar Committee (2009)", "Rangarajan Committee", "Lakdawala Committee", "Alagh Committee"),
                0, "सुरेश तेंदुलकर समिति ने 2009 में ग्रामीण क्षेत्र हेतु ₹27/दिन (₹816/माह) और शहरी क्षेत्र हेतु ₹33/दिन (₹1000/माह) उपभोग व्यय को गरीबी रेखा माना।",
                "The Tendulkar Committee (2009) shifted poverty estimation from calorie intake to private consumption expenditure.", "Easy"
            )
        )
        val index = (seed + (mock * 19) + (qNum * 29)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 8: Direct & Indirect Taxes & GST
    private fun getEcoTopic8Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 41 + qNum * 11)
        val questions = listOf(
            QPayload(
                "वस्तु एवं सेवा कर (GST - Goods and Services Tax) भारत में किस संवैधानिक संशोधन अधिनियम के तहत 1 जुलाई 2017 से लागू किया गया?",
                "Under which Constitutional Amendment Act was the Goods and Services Tax (GST) implemented in India on 1 July 2017?",
                listOf("101वां संविधान संशोधन अधिनियम (101st Amendment Act 2016)", "100वां संशोधन", "102वां संशोधन", "103वां संशोधन"),
                listOf("101st Constitutional Amendment Act, 2016", "100th Amendment", "102nd Amendment", "103rd Amendment"),
                0, "101वें संविधान संशोधन (122वां विधेयक) द्वारा 1 जुलाई 2017 को 'एक राष्ट्र, एक कर' (One Nation One Tax) के रूप में GST लागू हुआ। असम GST पास करने वाला पहला राज्य था।",
                "The 101st Constitutional Amendment Act paved the way for nationwide GST rollout on 1 July 2017.", "Easy"
            )
        )
        val index = (seed + (mock * 23) + (qNum * 31)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 9: Stock Market & SEBI
    private fun getEcoTopic9Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 43 + qNum * 13)
        val questions = listOf(
            QPayload(
                "भारतीय प्रतिभूति और विनिमय बोर्ड (SEBI) को किस वर्ष अधिनियम पारित करके वैधानिक/स्वायत्त दर्जा प्रदान किया गया था?",
                "In which year was SEBI granted statutory regulatory status through an Act of Parliament (SEBI Act)?",
                listOf("1992 (SEBI Act - 30 January 1992)", "1988", "1995", "2000"),
                listOf("1992 (SEBI Act, 1992)", "1988", "1995", "2000"),
                0, "सेबी की स्थापना 12 अप्रैल 1988 को गैर-वैधानिक निकाय के रूप में हुई थी, जिसे 30 जनवरी 1992 को SEBI Act 1992 द्वारा वैधानिक दर्जा मिला।",
                "SEBI was established in 1988 and conferred statutory regulatory powers via the SEBI Act on 30 Jan 1992.", "Easy"
            )
        )
        val index = (seed + (mock * 29) + (qNum * 37)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // TOPIC 10: Welfare Schemes
    private fun getEcoTopic10Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 47 + qNum * 17)
        val questions = listOf(
            QPayload(
                "प्रधानमंत्री जन धन योजना (PMJDY - वित्तीय समावेशन का राष्ट्रीय मिशन) की औपचारिक शुरुआत 28 अगस्त 2014 को किस नारे के साथ हुई थी?",
                "With which official motto was the Pradhan Mantri Jan Dhan Yojana (PMJDY) launched nationwide on 28 August 2014?",
                listOf("'मेरा खाता, भाग्य विधाता' (Mera Khata Bhagya Vidhata)", "हर हाथ को काम", "सबका साथ, सबका विकास", "डिजिटल इंडिया"),
                listOf("'Mera Khata Bhagya Vidhata' (My Account, Divine Fortune)", "Work for Every Hand", "Sabka Saath, Sabka Vikas", "Digital India"),
                0, "28 अगस्त 2014 को पीएम जन धन योजना शुरू हुई जिसका उद्देश्य प्रत्येक परिवार के लिए शून्य शेष बचत बैंक खाता, ₹10,000 ओवरड्राफ्ट और RuPay डेबिट कार्ड उपलब्ध कराना है।",
                "PMJDY was launched on 28 August 2014 with the tagline 'Mera Khata Bhagya Vidhata' for universal banking access.", "Easy"
            )
        )
        val index = (seed + (mock * 31) + (qNum * 41)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }
}

fun makeEconomyQ(
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
): GkQuestion = EconomyQuestionHelper.makeEconomyQ(id, subtopic, qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff)
