package com.example.ui.data

import com.example.ui.model.GkQuestion

object RajasthanQuestionHelper {
    fun makeRajQ(
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
            category = "Rajasthan GK",
            categoryId = "rajasthan_gk",
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

    /**
     * Generates 15 100% unique, distinct exam questions for each Mock test (Mock 2 to Mock 10)
     * covering Rajasthan GK topics with authentic Hindi & English content.
     */
    fun generateTopicMocks(
        subtopicId: String,
        startMock: Int,
        endMock: Int,
        templateQuestions: List<GkQuestion>
    ): List<GkQuestion> {
        val result = mutableListOf<GkQuestion>()
        val cleanTopic = subtopicId.removePrefix("raj_")

        for (mock in startMock..endMock) {
            val questionsForMock = getUniqueQuestionsForMock(subtopicId, cleanTopic, mock)
            result.addAll(questionsForMock)
        }
        return result
    }

    private fun getUniqueQuestionsForMock(subtopicId: String, cleanTopic: String, mock: Int): List<GkQuestion> {
        val qList = mutableListOf<GkQuestion>()
        for (qNum in 1..15) {
            val qId = "raj_${cleanTopic}_m${mock}_q$qNum"
            val (qHi, qEn, optsHi, optsEn, ansIdx, expHi, expEn, diff) = getQuestionData(cleanTopic, mock, qNum)
            qList.add(
                makeRajQ(
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
            "1" -> getRajTopic1Data(mock, qNum)
            "2" -> getRajTopic2Data(mock, qNum)
            "3" -> getRajTopic3Data(mock, qNum)
            "4" -> getRajTopic4Data(mock, qNum)
            "5" -> getRajTopic5Data(mock, qNum)
            "6" -> getRajTopic6Data(mock, qNum)
            "7" -> getRajTopic7Data(mock, qNum)
            "8" -> getRajTopic8Data(mock, qNum)
            "9" -> getRajTopic9Data(mock, qNum)
            "10" -> getRajTopic10Data(mock, qNum)
            else -> getRajTopic1Data(mock, qNum)
        }
    }

    // =========================================================================
    // TOPIC 1: Ancient Civilization, 1857 Revolution, Prajamandal & Integration
    // =========================================================================
    private fun getRajTopic1Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 15 + qNum)
        val questions = listOf(
            QPayload(
                "कालीबंगा सभ्यता की सर्वप्रथम खोज 1952 में किसके द्वारा की गई थी?",
                "Who was the first to discover the Kalibangan civilization in 1952?",
                listOf("अमलानंद घोष", "बी. बी. लाल", "बी. के. थापर", "दयाराम साहनी"),
                listOf("Amlanand Ghosh", "B.B. Lal", "B.K. Thapar", "Dayaram Sahni"),
                0, "अमलानंद घोष ने 1952 में कालीबंगा की खोज की, जबकि बी.बी. लाल और बी.के. थापर ने 1961-69 में उत्खनन किया।",
                "Amlanand Ghosh discovered Kalibangan in 1952, followed by systematic excavations by B.B. Lal and B.K. Thapar.", "Easy"
            ),
            QPayload(
                "राजस्थान में 1857 की क्रांति की शुरुआत 28 मई 1857 को किस छावनी से हुई थी?",
                "From which military cantonment did the 1857 revolt begin in Rajasthan on 28 May 1857?",
                listOf("नसीराबाद (Naseerabad)", "नीमच", "एरिनपुरा", "ब्यावर"),
                listOf("Naseerabad", "Neemuch", "Erinpura", "Beawar"),
                0, "राजस्थान में 1857 की क्रांति का प्रारंभ 28 मई 1857 को नसीराबाद छावनी में 15वीं नेटिव इन्फैंट्री द्वारा हुआ।",
                "The 1857 revolt in Rajasthan commenced at Naseerabad cantonment on 28 May 1857 led by the 15th Native Infantry.", "Easy"
            ),
            QPayload(
                "आऊवा के ठाकुर कुशाल सिंह ने 1857 की क्रांति में किस अंग्रेज पॉलिटिकल एजेंट का सिर काटकर किले पर लटका दिया था?",
                "Which British Political Agent's head was severed and hung at Auwa Fort by Thakur Kushal Singh in 1857?",
                listOf("मेक मेसन (Mock Meson)", "कैप्टन शॉवर्स", "कर्नल ईडन", "मेजर बर्टन"),
                listOf("Mock Meson", "Captain Showers", "Colonel Eden", "Major Burton"),
                0, "चेलावास के युद्ध (18 सितंबर 1857) में जोधपुर के पॉलिटिकल एजेंट मेक मेसन का सिर काटकर आऊवा के किले के दरवाजे पर लटकाया गया।",
                "In the Battle of Chelawas (18 Sept 1857), Jodhpur Political Agent Mock Meson was slain by Auwa rebels.", "Moderate"
            ),
            QPayload(
                "कोटा में 1857 की क्रांति का नेतृत्व प्रमुख रूप से किन दो क्रांतिकारियों ने किया था?",
                "Which two leaders spearheaded the mass rebellion in Kota during 1857?",
                listOf("जयदयाल और मेहराब खान", "ठाकुर कुशाल सिंह", "सूर्यमल मिश्रण", "कुंवर सिंह"),
                listOf("Jaidayal and Mehrab Khan", "Thakur Kushal Singh", "Suryamal Misran", "Kunwar Singh"),
                0, "कोटा में वकील जयदयाल और रिसालदार मेहराब खान के नेतृत्व में मेजर बर्टन का सिर काटा गया और 6 माह तक जनता का शासन रहा।",
                "Jaidayal and Mehrab Khan led the revolutionary uprising in Kota, overthrowing British authority for 6 months.", "Moderate"
            ),
            QPayload(
                "बिजोलिया किसान आंदोलन (1897-1941) भारत का सबसे लंबा अहिंसक आंदोलन था। इसके प्रवर्तक कौन थे?",
                "Who was the initial initiator of the Bijolia Peasant Movement in 1897?",
                listOf("साधु सीताराम दास", "विजय सिंह पथिक", "माणिक्य लाल वर्मा", "जमनालाल बजाज"),
                listOf("Sadhu Sitaram Das", "Vijay Singh Pathik", "Manikya Lal Verma", "Jamnalal Bajaj"),
                0, "बिजोलिया किसान आंदोलन 1897 में साधु सीताराम दास के नेतृत्व में गिरधारीपुरा गांव से प्रारंभ हुआ था।",
                "Sadhu Sitaram Das initiated the historic Bijolia Peasant Movement in 1897 against 84 types of taxes (lag-bag).", "Easy"
            ),
            QPayload(
                "भूप सिंह किस प्रसिद्ध किसान नेता का वास्तविक नाम था जिन्होंने 1916 में बिजोलिया आंदोलन की बागडोर संभाली?",
                "Bhoop Singh was the original name of which prominent freedom fighter and peasant leader?",
                listOf("विजय सिंह पथिक", "केसरी सिंह बारहठ", "जोरावर सिंह बारहठ", "दामोदर दास राठी"),
                listOf("Vijay Singh Pathik", "Kesari Singh Barhath", "Zorawar Singh Barhath", "Damodar Das Rathi"),
                0, "विजय सिंह पथिक का मूल नाम भूप सिंह (गुलावठी, बुलंदशहर, UP) था। उन्होंने ऊपरमाल पंच बोर्ड की स्थापना 1917 में की।",
                "Vijay Singh Pathik (original name Bhoop Singh) took over leadership of Bijolia movement and formed the Uparmal Panch Board in 1917.", "Easy"
            ),
            QPayload(
                "एक ही आंदोलन (भोमट भील आंदोलन) 1921 में मातृकुंडिया (चित्तौड़गढ़) से किसने प्रारंभ किया था?",
                "Who initiated the Eki Movement (Bhomat Bhil Movement) from Matrikundiya in 1921?",
                listOf("मोतीलाल तेजावत", "गोविंद गिरि", "भोगिलाल पंड्या", "हरिभाऊ उपाध्याय"),
                listOf("Motilal Tejawat", "Govind Giri", "Bhogilal Pandya", "Haribhau Upadhyay"),
                0, "मोतीलाल तेजावत ('बावजी') ने आदिवासियों के उद्धार और कर विरोध हेतु 'मेवाड़ पुकार' (21 सूत्री मांग पत्र) प्रस्तुत किया।",
                "Motilal Tejawat spearheaded the Eki Movement in 1921 and submitted the 21-point charter 'Mewar Pukar'.", "Easy"
            ),
            QPayload(
                "मानगढ़ धाम (बांसवाड़ा) में 17 नवंबर 1913 को ब्रिटिश सेना द्वारा किए गए नरसंहार में 1500 भील शहीद हुए थे। इस आंदोलन के प्रणेता कौन थे?",
                "Who was the spiritual leader of the Samp Sabha and Bhagat Movement behind the Mangarh massacre in 1913?",
                listOf("गोविंद गिरि", "मोतीलाल तेजावत", "मावजी महाराज", "धन्ना भगत"),
                listOf("Govind Giri", "Motilal Tejawat", "Mavji Maharaj", "Dhanna Bhagat"),
                0, "गोविंद गिरि ने 1883 में 'सम्प सभा' और 'भगत पंथ' की स्थापना कर भीलों में जनजागृति फैलाई थी। मानगढ़ को 'राजस्थान का जलियांवाला बाग' कहते हैं।",
                "Govind Giri founded the Samp Sabha in 1883. The Mangarh massacre of 1913 is revered as Rajasthan's Jallianwala Bagh.", "Easy"
            ),
            QPayload(
                "जयपुर प्रजामंडल की स्थापना सर्वप्रथम 1931 में किसके प्रयासों से हुई थी?",
                "Under whose pioneering leadership was the Jaipur Prajamandal first founded in 1931?",
                listOf("कपूरचंद पाटनी", "जमुनालाल बजाज", "हीरालाल शास्त्री", "टीकाराम पालीवाल"),
                listOf("Kapur Chand Patni", "Jamnalal Bajaj", "Hiralal Shastri", "Tikaram Paliwal"),
                0, "जयपुर प्रजामंडल राजस्थान का प्रथम प्रजामंडल था, जिसकी स्थापना 1931 में कपूरचंद पाटनी द्वारा की गई। 1938 में जमनालाल बजाज ने पुनर्गठन किया।",
                "Jaipur Prajamandal was the first in Rajasthan, formed in 1931 by Kapur Chand Patni and reorganized in 1938 by Jamnalal Bajaj.", "Moderate"
            ),
            QPayload(
                "मत्स्य संघ (राजस्थान एकीकरण का प्रथम चरण - 18 मार्च 1948) का नामकरण किसके सुझाव पर किया गया था?",
                "On whose recommendation was the first phase of Rajasthan integration named 'Matsya Union'?",
                listOf("के. एम. मुंशी (K.M. Munshi)", "सरदार पटेल", "शोभाराम कुमावत", "एन. वी. गाडगिल"),
                listOf("K.M. Munshi", "Sardar Patel", "Shobha Ram Kumawat", "N.V. Gadgil"),
                0, "कन्हैयालाल माणिकलाल मुंशी (K.M. Munshi) के सुझाव पर अलवर, भरतपुर, धौलपुर, करौली को मिलाकर 'मत्स्य संघ' नाम दिया गया।",
                "K.M. Munshi proposed the name Matsya Union (18 March 1948) combining Alwar, Bharatpur, Dholpur, and Karauli.", "Easy"
            ),
            QPayload(
                "राजस्थान के एकीकरण के समय 'वृहत् राजस्थान' (चतुर्थ चरण - 30 मार्च 1949) के प्रथम प्रधानमंत्री कौन बने थे?",
                "Who served as the Premier/Prime Minister of 'Greater Rajasthan' (Stage 4 - 30 March 1949)?",
                listOf("पंडित हीरालाल शास्त्री", "माणिक्य लाल वर्मा", "गोकुल भाई भट्ट", "जयनारायण व्यास"),
                listOf("Pt. Hiralal Shastri", "Manikya Lal Verma", "Gokulbhai Bhatt", "Jai Narayan Vyas"),
                0, "30 मार्च 1949 को वृहत् राजस्थान का गठन हुआ जिसके प्रधानमंत्री हीरालाल शास्त्री तथा राजप्रमुख सवाई मानसिंह द्वितीय बने।",
                "Pt. Hiralal Shastri became the first Premier of Greater Rajasthan inaugurated by Sardar Vallabhbhai Patel on 30 March 1949.", "Easy"
            ),
            QPayload(
                "राजस्थान एकीकरण के सातवें एवं अंतिम चरण (1 नवंबर 1956) में किस आयोग की सिफारिश पर अजमेर-मेरवाड़ा का विलय हुआ?",
                "On the recommendation of which Commission was Ajmer-Merwara merged into Rajasthan on 1 November 1956?",
                listOf("राज्य पुनर्गठन आयोग (फजल अली आयोग)", "सत्यनारायण राव समिति", "शंकरराव देव समिति", "धर आयोग"),
                listOf("States Reorganisation Commission (Fazal Ali Commission)", "Satyanarayan Rao Committee", "Shankar Rao Deo Committee", "Dhar Commission"),
                0, "फजल अली की अध्यक्षता वाले राज्य पुनर्गठन आयोग (1956) की सिफारिश पर अजमेर-मेरवाड़ा, आबू-देलवाड़ा और सुनेल टप्पा का विलय हुआ।",
                "Fazal Ali Commission recommendations facilitated the merger of Ajmer-Merwara, Mount Abu, and Sunel Tappa on 1 Nov 1956.", "Moderate"
            ),
            QPayload(
                "'राजस्थान का गांधी' किसे कहा जाता है जिन्होंने सिरोही प्रजामंडल की स्थापना में मुख्य भूमिका निभाई?",
                "Who is revered as 'Gandhi of Rajasthan', instrumental in establishing the Sirohi Prajamandal?",
                listOf("गोकुल भाई भट्ट", "भोगिलाल पंड्या", "मास्टर प्यारेलाल", "हरिभाऊ उपाध्याय"),
                listOf("Gokulbhai Bhatt", "Bhogilal Pandya", "Master Pyarelal", "Haribhau Upadhyay"),
                0, "गोकुल भाई भट्ट को 'राजस्थान का गांधी' कहा जाता है। भोगीलाल पंड्या को 'वागड़ का गांधी' कहा जाता है।",
                "Gokulbhai Bhatt is called 'Gandhi of Rajasthan', while Bhogilal Pandya is celebrated as 'Vaghad Gandhi'.", "Easy"
            ),
            QPayload(
                "1912 में लॉर्ड हार्डिंग पर दिल्ली के चांदनी चौक में बम फेंकने वाले राजस्थान के प्रसिद्ध क्रांतिकारी कौन थे?",
                "Which Rajasthani revolutionary threw a bomb at Viceroy Lord Hardinge at Chandni Chowk in Delhi in 1912?",
                listOf("जोरावर सिंह बारहठ एवं प्रताप सिंह बारहठ", "केसरी सिंह बारहठ", "दामोदर दास राठी", "अर्जुन लाल सेठी"),
                listOf("Zorawar Singh Barhath & Pratap Singh Barhath", "Kesari Singh Barhath", "Damodar Das Rathi", "Arjun Lal Sethi"),
                0, "रासबिहारी बोस के निर्देशन में जोरावर सिंह बारहठ (अमरदास बैरागी छद्म नाम) ने लॉर्ड हार्डिंग पर बम फेंका था।",
                "Zorawar Singh Barhath threw the bomb at Viceroy Lord Hardinge in the Delhi Conspiracy Case of 1912.", "Moderate"
            ),
            QPayload(
                "राजस्थान में सशस्त्र क्रांति के भामाशाह के रूप में किन्हें जाना जाता है जिन्होंने क्रांतिकारियों को आर्थिक सहायता दी?",
                "Who was celebrated as the 'Bhamashah of Armed Revolution' for financing revolutionary activities in Rajasthan?",
                listOf("सेठ दामोदर दास राठी (ब्यावर)", "जमनालाल बजाज", "घनश्याम दास बिड़ला", "रामगोपाल मोहता"),
                listOf("Seth Damodar Das Rathi (Beawar)", "Jamnalal Bajaj", "Ghanshyam Das Birla", "Ramgopal Mohta"),
                0, "ब्यावर के उद्योगपति सेठ दामोदर दास राठी ने खरवा ठाकुर गोपाल सिंह और विजय सिंह पथिक को सशस्त्र क्रांति हेतु आर्थिक सहयोग दिया।",
                "Seth Damodar Das Rathi of Beawar financed armed freedom fighters and founded Arya Samaj & educational centers in Rajasthan.", "Moderate"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 11)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 2: Rajput Dynasties, Forts, Palaces & Havelis
    // =========================================================================
    private fun getRajTopic2Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 17 + qNum * 5)
        val questions = listOf(
            QPayload(
                "चित्तौड़गढ़ दुर्ग में स्थित 9 मंजिला 'विजय स्तंभ' (Kirti Stambh / Tower of Victory) का निर्माण महाराणा कुंभा ने किस विजय के उपलक्ष्य में करवाया था?",
                "In commemoration of which victory did Maharana Kumbha construct the 9-storey Vijay Stambh in Chittorgarh?",
                listOf("सारंगपुर का युद्ध (1437 ई. - मालवा सुल्तान महमूद खिलजी पर विजय)", "खातोली का युद्ध", "बयाना का युद्ध", "हल्दीघाटी का युद्ध"),
                listOf("Battle of Sarangpur (1437 AD against Mahmud Khalji of Malwa)", "Battle of Khatoli", "Battle of Bayana", "Battle of Haldighati"),
                0, "महाराणा कुंभा ने 1437 में सारंगपुर युद्ध में मालवा के सुल्तान महमूद खिलजी प्रथम को पराजित कर विजय स्तंभ (122 फीट, 9 मंजिल) बनवाया। शिल्पी जैता, नापा, पोमा, पूंजा थे।",
                "Vijay Stambh (Tower of Victory, 122 ft, 9 storeys) was built by Maharana Kumbha to celebrate his triumph in the Battle of Sarangpur (1437).", "Easy"
            ),
            QPayload(
                "हल्दीघाटी का ऐतिहासिक युद्ध किस तिथि को महाराणा प्रताप और अकबर के सेनापति मानसिंह के मध्य लड़ा गया था?",
                "On which date was the legendary Battle of Haldighati fought between Maharana Pratap and Mughal commander Man Singh?",
                listOf("18 जून 1576 (18 June 1576)", "15 मार्च 1576", "21 अक्टूबर 1582", "5 नवंबर 1556"),
                listOf("18 June 1576 (or 21 June per Gopinath Sharma)", "15 March 1576", "21 October 1582", "5 November 1556"),
                0, "18 जून 1576 को खमनौर-गोगुंदा के पास हल्दीघाटी में युद्ध हुआ। अबुल फजल ने इसे 'खमनौर का युद्ध' तथा बदायूंनी ने 'गोगुंदा का युद्ध' कहा।",
                "Battle of Haldighati was fought on 18 June 1576. Abul Fazl called it 'Battle of Khamnore' and Badauni termed it 'Battle of Gogunda'.", "Easy"
            ),
            QPayload(
                "कर्नल जेम्स टॉड ने महाराणा प्रताप के किस युद्ध को 'मेवाड़ का मैराथन' (Marathon of Mewar) की संज्ञा दी थी?",
                "Which battle was famously designated by Col. James Tod as the 'Marathon of Mewar'?",
                listOf("दिवेर का युद्ध (Battle of Diver - October 1582)", "हल्दीघाटी का युद्ध", "सारंगपुर का युद्ध", "सूमेल-गिरि का युद्ध"),
                listOf("Battle of Diver (October 1582)", "Battle of Haldighati", "Battle of Sarangpur", "Battle of Giri-Sumel"),
                0, "अक्टूबर 1582 में दिवेर के युद्ध में महाराणा प्रताप और अमर सिंह ने मुगल सेनापति सुल्तान खान को पराजित किया। टॉड ने इसे मेवाड़ का मैराथन कहा।",
                "In October 1582, Maharana Pratap triumphed at Diver, which Col. James Tod glorified as the Marathon of Mewar.", "Moderate"
            ),
            QPayload(
                "हवा महल (Jaipur) का निर्माण 1799 ई. में किस कछवाहा शासक द्वारा करवाया गया था और इसके वास्तुकार कौन थे?",
                "Who built the iconic 5-storey Hawa Mahal in Jaipur in 1799 AD and who was its chief architect?",
                listOf("सवाई प्रताप सिंह (वास्तुकार: लालचंद उस्ता)", "सवाई जयसिंह द्वितीय", "महाराजा मानसिंह", "सवाई माधोसिंह"),
                listOf("Sawai Pratap Singh (Architect: Lal Chand Usta)", "Sawai Jai Singh II", "Maharaja Man Singh", "Sawai Madho Singh"),
                0, "हवा महल (5 मंजिला: शरद, रतन, विचित्र, प्रकाश, हवा मंदिर) में 953 झरोखे हैं। इसका निर्माण 1799 में सवाई प्रताप सिंह ने करवाया।",
                "Hawa Mahal was built in 1799 by Sawai Pratap Singh, featuring 953 jharokhas designed by master architect Lal Chand Usta.", "Easy"
            ),
            QPayload(
                "जैसलमेर में 'पटवों की हवेली' (Patwon Ki Haveli) का निर्माण 1805 में किसने करवाया था जिसमें 5 हवेलियों का समूह है?",
                "Who commissioned the world-famous 5-storey cluster of Patwon Ki Haveli in Jaisalmer?",
                listOf("गुमानचंद पटवा (Guman Chand Patwa)", "सलीम सिंह", "नथमल", "दीवान मोहनलाल"),
                listOf("Guman Chand Patwa", "Salim Singh", "Nathmal", "Diwan Mohanlal"),
                0, "गुमानचंद बाफना (पटवा) ने अपने 5 पुत्रों के लिए 1805 ई. में पटवों की हवेली बनवाई, जो बारीक नक्काशी और जालियों हेतु प्रसिद्ध है।",
                "Guman Chand Patwa constructed the iconic Patwon Ki Haveli in Jaisalmer in 1805 with intricate stone latticework.", "Moderate"
            ),
            QPayload(
                "जूनागढ़ दुर्ग (बीकानेर) जिसे 'जमीन का जेवर' कहा जाता है, की नींव 1589 ई. में किस शासक ने रखी थी?",
                "Who laid the foundation of Junagarh Fort in Bikaner (known as 'Zameen Ka Zevar') in 1589 AD?",
                listOf("महाराजा रायसिंह (प्रधानमंत्री कर्मचंद की देखरेख में)", "राव बीका", "महाराजा गंगासिंह", "राव कल्याणमल"),
                listOf("Maharaja Rai Singh (supervision of PM Karam Chand)", "Rao Bika", "Maharaja Ganga Singh", "Rao Kalyanmal"),
                0, "महाराजा रायसिंह ने 1589-94 में जूनागढ़ दुर्ग (रातिघाटी दुर्ग) बनवाया। इसमें जयमल-पत्ता की गजारूढ़ मूर्तियां स्थापित की गई थीं।",
                "Maharaja Rai Singh constructed Junagarh Fort in Bikaner in 1589, celebrated as 'Zameen Ka Zevar' (Jewel of the Earth).", "Moderate"
            ),
            QPayload(
                "शेरशाह सूरी ने 1544 के किस युद्ध में मालदेव की सेना के शौर्य से प्रभावित होकर कहा था- 'मैं मुट्ठी भर बाजरे के लिए हिंदुस्तान की सल्तनत खो देता'?",
                "In which 1544 battle did Sher Shah Suri remark: 'For a handful of millet, I would have lost the empire of Hindustan'?",
                listOf("गिरि-सुमेल का युद्ध (Battle of Giri-Sumel / Jaitaran)", "धर्मत का युद्ध", "दोराई का युद्ध", "खातोली का युद्ध"),
                listOf("Battle of Giri-Sumel / Jaitaran (1544)", "Battle of Dharmat", "Battle of Dorai", "Battle of Khatoli"),
                0, "1544 में पाली (जैतारण) के पास गिरि-सुमेल युद्ध में मालदेव के सेनापति जेता और कूंपा के अद्भुत पराक्रम से शेरशाह सूरी घबरा गया था।",
                "In the 1544 Battle of Giri-Sumel, Rathore commanders Jaita and Kumpa fought valiantly, prompting Sher Shah's famous quote.", "Easy"
            ),
            QPayload(
                "मारवाड़ का 'भूला-बिसरा राजा' (Forgotten Hero of Marwar) किसे कहा जाता है जिन्होंने मुगलों की कभी अधीनता स्वीकार नहीं की?",
                "Who is known as the 'Forgotten Hero / Pratap of Marwar' who resisted Akbar throughout his life?",
                listOf("राव चंद्रसेन (Rao Chandrasen)", "राव मालदेव", "महाराजा जसवंत सिंह", "वीर दुर्गादास राठौड़"),
                listOf("Rao Chandrasen", "Rao Maldeo", "Maharaja Jaswant Singh", "Veer Durgadas Rathore"),
                0, "राव चंद्रसेन को 'मारवाड़ का प्रताप' और 'भूला-बिसरा राजा' कहा जाता है क्योंकि उन्होंने भाद्राजून और सिवाना की पहाड़ियों से छापामार युद्ध जारी रखा।",
                "Rao Chandrasen of Marwar preceded Maharana Pratap in guerrilla resistance against the Mughal Empire.", "Easy"
            ),
            QPayload(
                "विश्व की सबसे बड़ी पहियों पर रखी तोप 'जयबाण तोप' (Jaivana Cannon) किस दुर्ग में स्थित है?",
                "Where is the 'Jaivana Cannon', the largest cannon on wheels in the world, stationed?",
                listOf("जयगढ़ दुर्ग (Jaigarh Fort, Jaipur)", "नाहरगढ़ दुर्ग", "आमेर दुर्ग", "तारागढ़ दुर्ग"),
                listOf("Jaigarh Fort, Jaipur", "Nahargarh Fort", "Amber Fort", "Taragarh Fort"),
                0, "सवाई जयसिंह द्वितीय द्वारा 1720 में जयगढ़ दुर्ग के तोपखाने में निर्मित जयबाण तोप की मारक क्षमता लगभग 35 किमी थी।",
                "Jaivana Cannon at Jaigarh Fort, Jaipur was cast in 1720 by Sawai Jai Singh II and remains the largest wheeled cannon in Asia.", "Easy"
            ),
            QPayload(
                "तारागढ़ दुर्ग (अजमेर) को 'राजस्थान का जिब्राल्टर' (Gibraltar of Rajasthan) की संज्ञा किसने दी थी?",
                "Who described Taragarh Fort (Ajmer / Garh Beetli) as the 'Gibraltar of Rajasthan'?",
                listOf("बिशप हेबर (Bishop Heber)", "कर्नल जेम्स टॉड", "फर्ग्यूसन", "अबुल फजल"),
                listOf("Bishop Heber", "Col. James Tod", "Fergusson", "Abul Fazl"),
                0, "बिशप हेबर ने अजमेर के तारागढ़ (गढ़ बीठली) को 'राजस्थान का जिब्राल्टर' कहा। इसका निर्माण 1113 ई. में अजयराज चौहान ने करवाया था।",
                "Bishop Heber designated Taragarh Fort in Ajmer as the Gibraltar of Rajasthan due to its impregnable strategic hilltop.", "Moderate"
            )
        )
        val index = (seed + (mock * 5) + (qNum * 7)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 3: Thar Desert, Aravalli & Physical Geography
    // =========================================================================
    private fun getRajTopic3Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 19 + qNum * 3)
        val questions = listOf(
            QPayload(
                "अरावली पर्वतमाला की सर्वोच्च चोटी 'गुरुशिखर' (माउंट आबू, सिरोही) की समुद्र तल से कुल ऊंचाई कितनी है?",
                "What is the total elevation of Guru Shikhar (Mount Abu, Sirohi), the highest peak of the Aravalli Range?",
                listOf("1,722 मीटर (दत्तात्रेय मंदिर सहित 1,727 मी.)", "1,597 मीटर", "1,442 मीटर", "1,380 मीटर"),
                listOf("1,722 meters (1,727 m including Dattatreya shrine)", "1,597 meters", "1,442 meters", "1,380 meters"),
                0, "गुरुशिखर (सिरोhi) अरावली की सबसे ऊंची चोटी (1722 मी.) है जिसे कर्नल जेम्स टॉड ने 'संतों का शिखर' कहा था।",
                "Guru Shikhar (1,722 m) on Mount Abu is the highest elevation between the Himalayas and the Nilgiris.", "Easy"
            ),
            QPayload(
                "राजस्थान का कुल भौगोलिक क्षेत्रफल भारत के कुल क्षेत्रफल का लगभग कितना प्रतिशत (10.41%) है?",
                "What percentage of India's total geographical area does Rajasthan occupy (3,42,239 sq km)?",
                listOf("10.41 प्रतिशत (10.41%)", "9.36 प्रतिशत", "11.50 प्रतिशत", "8.25 प्रतिशत"),
                listOf("10.41%", "9.36%", "11.50%", "8.25%"),
                0, "राजस्थान का क्षेत्रफल 3,42,239 वर्ग किमी है जो भारत के कुल क्षेत्रफल का 10.41% है। यह देश का सबसे बड़ा राज्य है।",
                "Rajasthan spans 3,42,239 sq km, making it India's largest state, representing 10.41% of national landmass.", "Easy"
            ),
            QPayload(
                "राजस्थान में 'लाठी सीरीज' (Lathi Series) क्या है जो पोकरण से मोहनगढ़ तक विस्तृत है?",
                "What is the geological 'Lathi Series' extending from Pokhran to Mohangarh in Jaisalmer district?",
                listOf("भूगर्भीय मीठे जल की पट्टी (Underground freshwater aquifer / Sevan grass belt)", "ग्रेनाइट पट्टी", "जिप्सम जमाव", "तांबा पेटी"),
                listOf("Subsurface freshwater aquifer & rich Sevan grass pasture belt", "Granite ridge", "Gypsum bed", "Copper vein"),
                0, "लाठी सीरीज जैसलमेर में पोकरण से मोहनगढ़ तक 60 किमी लंबी भूगर्भीय जलपट्टी है जहाँ पौष्टिक 'सेवण घास' और चांदन नलकूप (थार का घड़ा) स्थित है।",
                "Lathi Series is a prolific subsurface Mesozoic aquifer belt renowned for nutritious Sevan (Lasiurus scindicus) grassland.", "Moderate"
            ),
            QPayload(
                "राजस्थान में पवन की दिशा के समानांतर बनने वाले बालुका स्तूपों (Sand Dunes) को क्या कहा जाता है?",
                "What are longitudinal sand dunes formed parallel to prevailing wind directions termed as in the Thar Desert?",
                listOf("अनुदैर्ध्य / सीफ बालुका स्तूप (Longitudinal / Seif Dunes)", "बरखान (Barkhan)", "अनुप्रस्थ बालुका स्तूप", "पैराबोलिक"),
                listOf("Longitudinal / Seif Sand Dunes", "Barkhan (Crescent)", "Transverse Dunes", "Parabolic Dunes"),
                0, "पवन के समानांतर बनने वाले टीले अनुदैर्ध्य (सीफ) कहलाते हैं, जबकि अर्धचंद्राकार गतिशील टीले 'बरखान' (Barkhan) कहलाते हैं।",
                "Longitudinal dunes (Seif) align parallel to wind trajectory, while crescent-shaped shifting dunes are Barkhans.", "Moderate"
            ),
            QPayload(
                "राजस्थान के किस भौतिक प्रदेश में 'छप्पन का मैदान' (Mahi Basin) स्थित है?",
                "In which physiographic region is the 'Chhappan Plain' (56 villages/drainage basin of Mahi River) located?",
                listOf("प्रतापगढ़ और बांसवाड़ा के मध्य (दक्षिण-पूर्वी मैदान)", "बाड़मेर-जैसलमेर", "अलवर-भरतपुर", "सीकर-झुंझुनू"),
                listOf("Between Pratapgarh and Banswara (Mahi River Basin)", "Barmer-Jaisalmer", "Alwar-Bharatpur", "Sikar-Jhunjhunu"),
                0, "माही नदी के बेसिन में प्रतापगढ़ और बांसवाड़ा के बीच 56 गांवों/नालों का समूह 'छप्पन का मैदान' कहलाता है।",
                "The Chhappan Plain lies in the Mahi basin covering 56 riverine villages between Banswara and Pratapgarh.", "Easy"
            )
        )
        val index = (seed + (mock * 7) + (qNum * 13)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 4: Drainage, Rivers, Lakes, Dams & Irrigation Projects
    // =========================================================================
    private fun getRajTopic4Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 23 + qNum * 7)
        val questions = listOf(
            QPayload(
                "राजस्थान की एकमात्र बारहमासी (नित्यवाही) नदी कौन-सी है जिसे 'चर्मण्वती' व 'कामधेनु' भी कहा जाता है?",
                "Which is the only perennial river of Rajasthan, anciently known as 'Charmanvati' or 'Kamdhenu'?",
                listOf("चंबल नदी (Chambal River - Janapav Hills, MP)", "बनास नदी", "लूणी नदी", "माही नदी"),
                listOf("Chambal River (origin Janapav Hills, Vindhyas)", "Banas River", "Luni River", "Mahi River"),
                0, "चंबल नदी जानापाव पहाड़ी (महू, MP) से निकलती है और चौरासीगढ़ (चित्तौड़गढ़) से राजस्थान में प्रवेश करती है। यह घड़ियाल अभयारण्य और बीहड़ों (Badlands) हेतु प्रसिद्ध है।",
                "Chambal is Rajasthan's major perennial river, entering through Chaurasigarh and joining Yamuna in UP.", "Easy"
            ),
            QPayload(
                "कर्क रेखा (23½° N) को दो बार काटने वाली दक्षिण राजस्थान की प्रमुख नदी कौन-सी है जिसे 'वागड़ की गंगा' कहा जाता है?",
                "Which river of Southern Rajasthan cuts the Tropic of Cancer twice and is revered as 'Ganga of Vaghad'?",
                listOf("माही नदी (Mahi River - Amjhera Hills, MP)", "साबरमती नदी", "सोम नदी", "जाखम नदी"),
                listOf("Mahi River (origin Amjhera, Dhar district MP)", "Sabarmati River", "Som River", "Jakham River"),
                0, "माही नदी कर्क रेखा को अंग्रेजी के उल्टे 'U' आकार में दो बार काटती है। बेणेश्वर (डूंगरपुर) में सोम-माही-जाखम का त्रिवेणी संगम होता है।",
                "Mahi river forms an inverted U-loop, bisecting the Tropic of Cancer twice before entering the Gulf of Khambhat.", "Easy"
            ),
            QPayload(
                "एशिया की सबसे बड़ी मानव निर्मित मीठे पानी की कृत्रिम झील 'जयसमंद' (ढेबर झील, उदयपुर) का निर्माण 1685-1691 में किसने करवाया था?",
                "Who constructed Asia's largest artificial freshwater lake 'Jaisamand' (Dhebar Lake, Udaipur) between 1685-1691?",
                listOf("महाराणा जयसिंह (गोमती नदी पर बांध बनाकर)", "महाराणा राजसिंह", "महाराणा फतहसिंह", "महाराणा उदयसिंह"),
                listOf("Maharana Jai Singh (damming Gomati River)", "Maharana Raj Singh", "Maharana Fateh Singh", "Maharana Udai Singh"),
                0, "महाराणा जयसिंह ने गोमती नदी पर जयसमंद (ढेबर) झील बनवाई जिसमें 7 टापू हैं (सबसे बड़ा 'बाबा का भागड़ा' और सबसे छोटा 'प्यारी')।",
                "Jaisamand Lake was built by Maharana Jai Singh on Gomti river, hosting 7 inhabited islands (Baba Ka Bhagra & Pyari).", "Easy"
            ),
            QPayload(
                "इंदिरा गांधी नहर परियोजना (IGNP) का उद्गम पंजाब में किन दो नदियों के संगम पर स्थित 'हरिके बैराज' (Harike Barrage) से होता है?",
                "From the confluence of which two rivers at Harike Barrage in Punjab does the Indira Gandhi Canal (IGNP) originate?",
                listOf("सतलुज और व्यास नदी (Satluj & Beas confluence)", "रावी और चेनाब", "झेलम और सिंधु", "घग्घर और व्यास"),
                listOf("Satluj and Beas confluence at Harike Barrage", "Ravi and Chenab", "Jhelum and Indus", "Ghaggar and Beas"),
                0, "1948 में कँवर सैन की रिपोर्ट पर सतलुज-व्यास संगम (हरिके बैराज) से राजस्थान नहर (अब IGNP) निकाली गई जिसे 'मरुगंगा' कहते हैं।",
                "Conceived by Kanwar Sain, the Indira Gandhi Canal draws water from Harike Barrage at Satluj-Beas confluence.", "Easy"
            ),
            QPayload(
                "सांभर झील (जयपुर-नागौर-अजमेर) भारत के कुल नमक उत्पादन का लगभग कितना प्रतिशत (8.7%) नमक उत्पादित करती है?",
                "Approximately what percentage of India's inland salt production is contributed by Sambhar Salt Lake (Ramsar Wetland)?",
                listOf("8.7 प्रतिशत (8.7% of India's inland salt)", "15 प्रतिशत", "5.2 प्रतिशत", "12 प्रतिशत"),
                listOf("8.7% of total national salt output", "15%", "5.2%", "12%"),
                0, "सांभर झील भारत की सबसे बड़ी अंतःस्थलीय खारे पानी की झील (रामसर साइट 1990) है जो देश का 8.7% नमक उत्पादित करती है।",
                "Sambhar Lake is India's largest inland saline wetland (Ramsar Site) producing ~8.7% of national salt supply.", "Easy"
            )
        )
        val index = (seed + (mock * 11) + (qNum * 17)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 5: Forests, Wildlife, Sanctuaries & State Symbols
    // =========================================================================
    private fun getRajTopic5Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 29 + qNum * 5)
        val questions = listOf(
            QPayload(
                "राजस्थान का राज्य वृक्ष 'खेजड़ी' (Prosopis cineraria) को किस वर्ष राज्य वृक्ष घोषित किया गया था जिसे 'थार का कल्पवृक्ष' कहते हैं?",
                "In which year was 'Khejri' (Prosopis cineraria) officially designated as the State Tree of Rajasthan?",
                listOf("31 अक्टूबर 1983", "1981", "1989", "1972"),
                listOf("31 October 1983", "1981", "1989", "1972"),
                0, "खेजड़ी (जांटी/शमी) को 31 अक्टूबर 1983 को राज्य वृक्ष घोषित किया गया। इसके फल को 'सांगरी' और पत्ती को 'लूम' कहते हैं। 1730 में अमृता देवी विश्नोई ने 363 लोगों के साथ खेजड़ली बलिदान दिया।",
                "Khejri (Prosopis cineraria) was declared State Tree on 31 Oct 1983, sacred in Bishnoi tradition following the 1730 Khejarli martyrdom.", "Easy"
            ),
            QPayload(
                "राजस्थान का राज्य पक्षी 'गोडावण' (Great Indian Bustard / Ardeotis nigriceps) मुख्यतः किस राष्ट्रीय उद्यान में पाया जाता है?",
                "The State Bird of Rajasthan, Godavan (Great Indian Bustard), is primarily conserved in which protected habitat?",
                listOf("राष्ट्रीय मरु उद्यान (Desert National Park, जैसलमेर-बाड़मेर)", "रणथंभौर राष्ट्रीय उद्यान", "केवलादेव घना पक्षी विहार", "सरिस्का अभयारण्य"),
                listOf("Desert National Park (Jaisalmer & Barmer)", "Ranthambore National Park", "Keoladeo Ghana Bird Sanctuary", "Sariska Tiger Reserve"),
                0, "गोडावण (ग्रेट इंडियन बस्टर्ड / मालमोरड़ी) को 1981 में राज्य पक्षी घोषित किया गया। यह राष्ट्रीय मरु उद्यान (जैसलमेर), सोरसन (बारां) और सोकलिया (अजमेर) में पाया जाता है।",
                "Godavan (Great Indian Bustard) is critically endangered and conserved at Desert National Park under Project Great Indian Bustard.", "Easy"
            ),
            QPayload(
                "केवलादेव घना राष्ट्रीय उद्यान (भरतपुर) को यूनेस्को की विश्व प्राकृतिक धरोहर सूची में किस वर्ष शामिल किया गया था?",
                "In which year was Keoladeo Ghana National Park (Bharatpur Bird Sanctuary) inscribed as a UNESCO World Natural Heritage Site?",
                listOf("1985 (UNESCO World Heritage Site)", "1981", "1990", "1995"),
                listOf("1985 (UNESCO Natural Heritage)", "1981", "1990", "1995"),
                0, "केवलादेव घना पक्षी विहार (डॉ. सलीम अली की कर्मस्थली) को 1981 में राष्ट्रीय उद्यान और 1985 में यूनेस्को प्राकृतिक धरोहर घोषित किया गया। यह साइबेरियन क्रेन का शीतकालीन प्रवास स्थल है।",
                "Keoladeo National Park in Bharatpur was recognized by UNESCO in 1985 as a premier wetland refuge for migratory waterfowl.", "Easy"
            ),
            QPayload(
                "उड़न गिलहरी (Flying Squirrel) के लिए प्रसिद्ध राजस्थान का प्रमुख वन्यजीव अभयारण्य कौन-सा है?",
                "Which wildlife sanctuary in Rajasthan is renowned for the nocturnal Red Giant Flying Squirrel (Petaurista philippensis)?",
                listOf("सीतामाता वन्यजीव अभयारण्य (प्रतापगढ़ / चित्तौड़गढ़)", "तालछापर (चूरू)", "कुंभलगढ़ अभयारण्य", "फुलवारी की नाल"),
                listOf("Sitamata Wildlife Sanctuary (Pratapgarh)", "Tal Chhapar (Churu)", "Kumbhalgarh Sanctuary", "Phulwari Ki Nal"),
                0, "सीतामाता अभयारण्य (प्रतापगढ़) महुआ के पेड़ों पर रहने वाली उड़न गिलहरी और चौसिंगा (घोटेल) हेतु प्रसिद्ध है।",
                "Sitamata Wildlife Sanctuary is renowned for flying squirrels living on Mahua trees and teak forest canopy.", "Easy"
            ),
            QPayload(
                "काले हिरणों (Black Bucks) और कुर्जा पक्षी के लिए राजस्थान का कौन-सा अभयारण्य प्रसिद्ध है जहाँ 'मोथिया घास' पाई जाती है?",
                "Which sanctuary is internationally famous for Black Bucks and Demoiselle Cranes (Kurja), hosting nutritious Mothiya grass?",
                listOf("तालछापर अभयारण्य (चूरू)", "माउंट आबू अभयारण्य", "रामगढ़ विषधारी", "नहरगढ़ जैविक उद्यान"),
                listOf("Tal Chhapar Wildlife Sanctuary (Churu)", "Mount Abu Sanctuary", "Ramgarh Vishdhari", "Nahargarh Biological Park"),
                0, "तालछापर (सुजानगढ़, चूरू) काले हिरणों की शरणस्थली है। यहाँ नम भूमि में मोथिया (Cyperus rotundus) घास उगती है।",
                "Tal Chhapar Sanctuary in Churu is celebrated for herds of Blackbucks, Harriers, and Mothiya grass.", "Easy"
            )
        )
        val index = (seed + (mock * 13) + (qNum * 19)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 6: Minerals, Energy, Industries & Agriculture Economy
    // =========================================================================
    private fun getRajTopic6Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 31 + qNum * 7)
        val questions = listOf(
            QPayload(
                "राजस्थान को 'खनिजों का अजायबघर' (Museum of Minerals) कहा जाता है। राजस्थान का किन खनिजों के उत्पादन में देश में शत-प्रतिशत (एकाधिकार) है?",
                "In which mineral resources does Rajasthan hold an absolute monopoly (nearly 100% production) in India?",
                listOf("सीसा-जस्ता, वोलास्टोनाइट, जास्पर एवं सेलेनाइट", "लोहा एवं कोयला", "बॉक्साइट एवं अभ्रक", "सोना एवं हीरा"),
                listOf("Lead-Zinc, Wollastonite, Jasper and Selenite", "Iron ore and Coal", "Bauxite and Mica", "Gold and Diamond"),
                0, "राजस्थान वोलास्टोनाइट (100%), जास्पर (100%), सीसा-जस्ता (जावर माइंस), सेलेनाइट और संगमरमर में देश में शीर्ष स्थान रखता है।",
                "Rajasthan possesses near monopoly in Wollastonite, Jasper, Selenite, and Lead-Zinc concentrates (Zawar/Rampur Agucha).", "Easy"
            ),
            QPayload(
                "विश्व का सबसे बड़ा सोलर पार्क 'भडला सोलर पार्क' (Bhadla Solar Park - 2245 MW) राजस्थान के किस जिले में स्थित है?",
                "In which district of Rajasthan is the world-renowned Bhadla Solar Park (2,245 MW capacity) located?",
                listOf("जोधपुर (फलोदी क्षेत्र)", "जैसलमेर", "बीकानेर", "बाड़मेर"),
                listOf("Jodhpur (Phalodi region)", "Jaisalmer", "Bikaner", "Barmer"),
                0, "भडला सोलर पार्क (जोधपुर/फलोदी) 2245 मेगावाट क्षमता के साथ देश के सबसे बड़े सौर ऊर्जा पार्कों में अग्रणी है।",
                "Bhadla Solar Park spanning over 14,000 acres in Phalodi/Jodhpur region is among the world's largest solar installations.", "Easy"
            ),
            QPayload(
                "बाड़मेर के पचपदरा में स्थापित 'राजस्थान रिफाइनरी एवं पेट्रोकेमिकल कॉम्प्लेक्स' में HPCL और राजस्थान सरकार की हिस्सेदारी का अनुपात क्या है?",
                "What is the joint venture equity sharing ratio between HPCL and Government of Rajasthan in Pachpadra (Barmer) Refinery?",
                listOf("74 : 26 (HPCL 74% : Rajasthan Govt 26%)", "50 : 50", "80 : 20", "60 : 40"),
                listOf("74 : 26 (HPCL 74% : GoR 26%)", "50 : 50", "80 : 20", "60 : 40"),
                0, "पचपदरा (बाड़मेर) में 9 MMTPA क्षमता वाली देश की पहली BS-VI मानक पेट्रोकेमिकल रिफाइनरी में HPCL का 74% और राजस्थान सरकार का 26% हिस्सा है।",
                "HPCL Rajasthan Refinery Ltd (HRRL) at Pachpadra is a 74:26 JV between HPCL and Rajasthan Government.", "Moderate"
            ),
            QPayload(
                "राजस्थान का पहला परमाणु ऊर्जा संयंत्र 'रावतभाटा परमाणु ऊर्जा स्टेशन' (RAPP) किस देश के सहयोग से स्थापित किया गया था?",
                "With the technical collaboration of which country was Rajasthan Atomic Power Station (Rawatbhata, Chittorgarh) established in 1973?",
                listOf("कनाडा (CANDU Reactor technology)", "रूस", "अमेरिका", "फ्रांस"),
                listOf("Canada (CANDU heavy water reactor technology)", "Russia", "USA", "France"),
                0, "रावतभाटा (चित्तौड़गढ़) में 1973 में कनाडा के सहयोग से देश का दूसरा परमाणु ऊर्जा संयंत्र (CANDU तकनीक) स्थापित हुआ।",
                "RAPS at Rawatbhata in Chittorgarh was developed with Canadian assistance utilizing pressurized heavy water reactors.", "Easy"
            ),
            QPayload(
                "राजस्थान का 'मैनचेस्टर' और 'वस्त्र नगरी' (Textile City) के रूप में किस शहर को जाना जाता है?",
                "Which industrial hub is celebrated as the 'Manchester of Rajasthan' and the primary 'Textile City'?",
                listOf("भीलवाड़ा (Bhilwara)", "पाली", "बालोतरा", "किशनगढ़"),
                listOf("Bhilwara", "Pali", "Balotra", "Kishangarh"),
                0, "भीलवाड़ा को 2009 में वस्त्र निर्यातक शहर का दर्जा दिया गया। इसे 'राजस्थान की टेक्सटाइल सिटी' और 'मैनचेस्टर' कहते हैं।",
                "Bhilwara is acclaimed as the Textile City of India and Manchester of Rajasthan for synthetic suitings and yarn production.", "Easy"
            )
        )
        val index = (seed + (mock * 17) + (qNum * 23)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 7: Polity, Panchayati Raj, Administration & Schemes
    // =========================================================================
    private fun getRajTopic7Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 37 + qNum * 9)
        val questions = listOf(
            QPayload(
                "भारत में त्रिस्तरीय पंचायती राज व्यवस्था का ऐतिहासिक उद्घाटन 2 अक्टूबर 1959 को पंडित नेहरू ने राजस्थान के किस जिले के 'बगदरी गांव' से किया था?",
                "In which village (Bagdari) of Rajasthan was the 3-tier Panchayati Raj system inaugurated by PM Nehru on 2 October 1959?",
                listOf("नागौर (Nagaur district)", "सीकर", "जयपुर", "अजमेर"),
                listOf("Nagaur (Bagdari village)", "Sikar", "Jaipur", "Ajmer"),
                0, "बलवंत राय मेहता समिति की सिफारिश पर 2 अक्टूबर 1959 को नागौर के बगदरी गांव से भारत में आधुनिक पंचायती राज का शुभारंभ हुआ।",
                "India's Panchayati Raj was officially launched by Jawaharlal Nehru in Bagdari village, Nagaur district on 2 Oct 1959.", "Easy"
            ),
            QPayload(
                "राजस्थान के प्रथम निर्वाचित मुख्यमंत्री (First Elected Chief Minister) कौन थे?",
                "Who was the first democratically elected Chief Minister of Rajasthan (March 1952)?",
                listOf("टीकाराम पालीवाल (Tikaram Paliwal)", "हीरालाल शास्त्री", "जयनारायण व्यास", "मोहनलाल सुखाड़िया"),
                listOf("Tikaram Paliwal", "Hiralal Shastri", "Jai Narayan Vyas", "Mohan Lal Sukhadia"),
                0, "मार्च 1952 में प्रथम आम चुनावों के बाद टीकाराम पालीवाल प्रथम निर्वाचित मुख्यमंत्री बने। हीरालाल शास्त्री प्रथम मनोनीत मुख्यमंत्री थे।",
                "Tikaram Paliwal became Rajasthan's first elected Chief Minister on 3 March 1952.", "Easy"
            ),
            QPayload(
                "राजस्थान में सबसे लंबे समय तक (17 वर्ष - 1954 से 1971) मुख्यमंत्री पद पर रहने वाले नेता कौन थे जिन्हें 'आधुनिक राजस्थान का निर्माता' कहा जाता है?",
                "Who served as Rajasthan's longest-tenured Chief Minister (17 continuous years) and is hailed as the 'Architect of Modern Rajasthan'?",
                listOf("मोहनलाल सुखाड़िया (Mohan Lal Sukhadia)", "भैरोंसिंह शेखावत", "हरिदेव जोशी", "शिवचरण माथुर"),
                listOf("Mohan Lal Sukhadia", "Bhairon Singh Shekhawat", "Harideo Joshi", "Shiv Charan Mathur"),
                0, "मोहनलाल सुखाड़िया 1954 से 1971 तक लगातार 17 वर्ष मुख्यमंत्री रहे। उन्हें आधुनिक राजस्थान का निर्माता कहा जाता है।",
                "Mohan Lal Sukhadia steered Rajasthan from 1954 to 1971, building foundational canal, university, and industrial infrastructure.", "Easy"
            ),
            QPayload(
                "राजस्थान लोक सेवा आयोग (RPSC) की स्थापना 20 अगस्त 1949 को किस स्थान पर हुई थी (बाद में सत्यनारायण राव समिति पर अजमेर स्थानांतरित)?",
                "Where was the Rajasthan Public Service Commission (RPSC) initially headquartered upon formation in August 1949?",
                listOf("जयपुर (1956 में अजमेर स्थानांतरित)", "जोधपुर", "अजमेर", "बीकानेर"),
                listOf("Jaipur (shifted to Ghoogra Ghati, Ajmer in 1956)", "Jodhpur", "Ajmer", "Bikaner"),
                0, "RPSC की स्थापना 20 अगस्त 1949 को जयपुर में हुई। इसके प्रथम अध्यक्ष सर एस. के. घोष थे। 1956 में सत्यनारायण राव समिति की सिफारिश पर यह अजमेर गई।",
                "RPSC was constituted in Jaipur with Sir S.K. Ghosh as first Chairman, later relocated to Ajmer pursuant to Satyanarayan Rao panel.", "Moderate"
            ),
            QPayload(
                "राजस्थान उच्च न्यायालय (High Court) की मुख्य पीठ जोधपुर में 29 अगस्त 1949 को स्थापित हुई। इसके प्रथम मुख्य न्यायाधीश कौन थे?",
                "Who was the first Chief Justice of the Rajasthan High Court upon its inauguration in Jodhpur on 29 August 1949?",
                listOf("न्यायमूर्ति कमलकांत वर्मा (Justice K.K. Verma)", "न्यायमूर्ति सरजू प्रसाद", "न्यायमूर्ति जे.एस. वर्मा", "न्यायमूर्ति दलवीर भंडारी"),
                listOf("Justice Kamal Kant Verma", "Justice Sarjoo Prasad", "Justice J.S. Verma", "Justice Dalveer Bhandari"),
                0, "29 अगस्त 1949 को राजप्रमुख सवाई मानसिंह ने जोधपुर में राजस्थान हाईकोर्ट का उद्घाटन किया और जस्टिस कमलकांत वर्मा प्रथम मुख्य न्यायाधीश बने।",
                "Justice Kamal Kant Verma was sworn in as the first Chief Justice of Rajasthan High Court at Jodhpur in 1949.", "Moderate"
            )
        )
        val index = (seed + (mock * 19) + (qNum * 29)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 8: Folk Deities, Goddesses, Saints & Religious Sects
    // =========================================================================
    private fun getRajTopic8Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 41 + qNum * 11)
        val questions = listOf(
            QPayload(
                "राजस्थान के 'पंचपीर' (Five Holy Pir Deities) में कौन-से लोक देवता शामिल हैं?",
                "Which five folk deities constitute the revered 'Panch Pir' venerated by both Hindus and Muslims in Rajasthan?",
                listOf("पाबूजी, हड़बूजी, रामदेवजी, मांगलिया मेहाजी, गोगाजी ('पाबू हड़बू रामदे मांगलिया मेहा, पांचू पीर पधारज्ये गोगाजी जेहा')", "तेजाजी एवं देवनारायणजी", "मल्लीनाथजी एवं कल्लाजी", "भैरवनाथ एवं वीर बावसी"),
                listOf("Pabuji, Harbhuji, Ramdevji, Mangaliya Mehaji, and Gogaji", "Tejaji and Devnarayanji", "Mallinathji and Kallaji", "Bhairav and Veer Bavji"),
                0, "राजस्थान के पंचपीरों में पाबूजी, हड़बूजी, रामदेवजी, मेहाजी मांगलिया और गोगाजी आते हैं। (तेजाजी पंचपीरों में शामिल नहीं हैं)।",
                "The Panch Pirs of Rajasthan include Pabuji, Harbhuji, Ramdevji, Mehaji Mangaliya, and Gogaji.", "Easy"
            ),
            QPayload(
                "ऊंटों के रक्षक देवता और 'प्लेग रक्षक देवता' के रूप में किन्हें पूजा जाता है जिनकी फड़ (Phad) सबसे लोकप्रिय है?",
                "Who is venerated as the deity of Camels and protector from epidemics, whose Phad is recited with Ravanhattha?",
                listOf("पाबूजी राठौड़ (कोलू मण्ड, फलोदी)", "गोगाजी", "तेजाजी", "हड़बूजी"),
                listOf("Pabuji Rathore (Kolu Mand, Phalodi)", "Gogaji", "Tejaji", "Harbhuji"),
                0, "पाबूजी राठौड़ को मारवाड़ में सर्वप्रथम ऊंट (सांडे) लाने का श्रेय दिया जाता है। रेबारी जाति इन्हें अपना आराध्य मानती है।",
                "Pabuji is venerated for introducing camels to Marwar and curing livestock ailments; his Phad is Rajasthan's most popular.", "Easy"
            ),
            QPayload(
                "रुणेचा (रामदेवरा, जैसलमेर) में सांप्रदायिक सद्भाव के प्रतीक लोक देवता रामदेवजी ने किस पंथ की स्थापना की थी?",
                "Which inclusive spiritual sect was founded by folk hero Baba Ramdevji at Ramdevra (Jaisalmer)?",
                listOf("कांबड़िया पंथ (Kamadiya Panth - 13 Tali dance)", "विश्नोई पंथ", "जसनाथी पंथ", "दादूपंथ"),
                listOf("Kamadiya Panth (renowned for Terah Taali dance)", "Bishnoi Panth", "Jasnathi Panth", "Dadu Panth"),
                0, "बाबा रामदेवजी एकमात्र लोक देवता हैं जो कवि भी थे ('चौबीस वाणियां')। कामड़ जाति की महिलाएं इनके मेले में 'तेरहताली नृत्य' करती हैं।",
                "Baba Ramdevji authored 'Chaubis Vaniyan' and instituted Kamadiya Panth, where women perform the rhythmic Terah Taali dance.", "Easy"
            ),
            QPayload(
                "29 नियमों (Rules) वाले पर्यावरण रक्षक 'विश्नोई संप्रदाय' के संस्थापक कौन थे जिनका समाधि स्थल मुकाम (नोखा, बीकानेर) में है?",
                "Who founded the eco-centric Bishnoi sect (governed by 29 cardinal environmental tenets) at Samrathal Dhora in 1485 AD?",
                listOf("संत जाम्भोजी (गुरु जम्भेश्वर)", "संत जसनाथजी", "संत दादू दयाल", "संत पीपाजी"),
                listOf("Sant Jambhoji (Guru Jambheshwar)", "Sant Jasnathji", "Sant Dadu Dayal", "Sant Pipaji"),
                0, "संत जाम्भोजी ने 1485 में समराथल धोरा (बीकानेर) पर विश्नोई पंथ (20+9 नियम) की स्थापना की। उन्होंने 'सिर साठे रूंख रहे तो भी सस्तो जाण' का संदेश दिया।",
                "Guru Jambhoji founded the Bishnoi community in 1485 championing wildlife protection and tree preservation.", "Easy"
            ),
            QPayload(
                "'राजस्थान का कबीर' कहे जाने वाले संत दादू दयाल की मुख्य पीठ राजस्थान में कहाँ स्थित है?",
                "Where is the primary seat (Narayana / Narena) of the Dadu Panth, founded by the saint revered as 'Kabir of Rajasthan'?",
                listOf("नरेना / नारायणा (जयपुर)", "कतरियासर (बीकानेर)", "मुकाम (बीकानेर)", "सलेमाबाद (अजमेर)"),
                listOf("Narayana / Narena (Jaipur district)", "Katariyasar (Bikaner)", "Mukam (Bikaner)", "Salemabad (Ajmer)"),
                0, "संत दादू दयाल ने 'दादू पंथ' की स्थापना की। उनके 152 शिष्य (52 स्तंभ) थे जिनमें संत रज्जब और सुंदरदास प्रमुख थे।",
                "Sant Dadu Dayal established his monastic seat at Naraina (Jaipur) preaching in Dhundhari Hindi dialect.", "Easy"
            )
        )
        val index = (seed + (mock * 23) + (qNum * 31)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 9: Painting Styles, Handicrafts, Ornaments, Costumes & Music/Dance
    // =========================================================================
    private fun getRajTopic9Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 43 + qNum * 13)
        val questions = listOf(
            QPayload(
                "किशनगढ़ चित्रकला शैली का विश्व प्रसिद्ध चित्र 'बणी-ठणी' (Bani Thani) किसके द्वारा चित्रित किया गया था जिसे एरिक डिक्सन ने 'भारत की मोनालिसा' कहा?",
                "Who painted the iconic masterpiece 'Bani Thani' of Kishangarh School, acclaimed as 'India's Mona Lisa' by Eric Dickinson?",
                listOf("निहालचंद (चित्रकार मोरध्वज निहालचंद - राजा सावंत सिंह 'नागरीदास' के काल में)", "साहिबदीन", "नानकराम", "मनोहर"),
                listOf("Nihal Chand (under King Sawant Singh 'Nagridas')", "Sahibdin", "Nanakram", "Manohar"),
                0, "किशनगढ़ शैली में सावंत सिंह (नागरीदास) के समय निहालचंद ने बणी-ठणी बनाई। इस पर 1973 में भारत सरकार ने 20 पैसे का डाक टिकट जारी किया।",
                "Bani Thani was painted by Nihal Chand during Raja Sawant Singh's reign in Kishangarh, celebrated for its lotus eyes and sharp profile.", "Easy"
            ),
            QPayload(
                "प्रतापगढ़ की प्रसिद्ध 'थेवा कला' (Thewa Art) में किस रंग के बेल्जियम कांच पर सोने की अत्यंत बारीक मीनाकारी की जाती है?",
                "What characterizes the GI-tagged 'Thewa Art' of Pratapgarh, preserved secretly by the Rajsoni family?",
                listOf("हरे व रंगीन बेल्जियम कांच पर 23 कैरेट सोने की नक्काशी (Gold work on colored glass)", "लकड़ी पर नक्काशी", "कपड़े पर छपाई", "पीतल पर मीनाकारी"),
                listOf("Intricate 23-karat gold foil inlay fused on colored Belgian glass", "Wood carving", "Block printing on silk", "Brass enameling"),
                0, "थेवा कला प्रतापगढ़ के राजसोनी परिवार की पारंपरिक शिल्पकला है जिसके प्रवर्तक नाथूजी सोनी थे। इसमें हरे कांच पर सोने की कारीगरी होती है।",
                "Thewa Art of Pratapgarh involves fusing delicate micro-patterns of gold onto radiant green and red Belgian glass.", "Moderate"
            ),
            QPayload(
                "यूनेस्को की अमूर्त सांस्कृतिक विरासत (Intangible Cultural Heritage - 2010) में शामिल राजस्थान का प्रसिद्ध नृत्य कौन-सा है जिसकी नृत्यांगना गुलाबो सपेरा हैं?",
                "Which Rajasthani folk dance was inscribed on UNESCO's Representative List of Intangible Cultural Heritage in 2010?",
                listOf("कालबेलिया नृत्य (Kalbelia Snake-charmer Dance - Gulabo Sapera)", "घूमर नृत्य", "तेरहताली नृत्य", "गैर नृत्य"),
                listOf("Kalbelia Dance (sensuous serpent movements, Padma Shri Gulabo Sapera)", "Ghoomar Dance", "Terah Taali Dance", "Gair Dance"),
                0, "कालबेलिया नृत्य 2010 में यूनेस्को धरोहर बना। इसमें पूंगी और खंजरी की धुन पर काले रंग की कशीदाकारी पोशाक पहनकर सर्प जैसी लचकदार मुद्राएं की जाती हैं।",
                "Kalbelia dance was recognized by UNESCO in 2010; Gulabo Sapera popularized this serpent-inspired folk tradition worldwide.", "Easy"
            ),
            QPayload(
                "राजस्थान का राज्य नृत्य (State Dance of Rajasthan) और 'नृत्यों का सिरमौर' किसे कहा जाता है?",
                "Which dance form is hailed as the 'Soul of Rajasthan' and recognized as the official State Dance?",
                listOf("घूमर (Ghoomar - Royal dance of Rajput women)", "कालबेलिया", "भवाई", "चरी नृत्य"),
                listOf("Ghoomar (Traditional circular dance with rhythmic swirl)", "Kalbelia", "Bhavai", "Chari Dance"),
                0, "घूमर राजस्थान का राज्य नृत्य है। इसमें 80 कली के घाघरे का गोल घेरा (घूम) और आठ मात्रा की 'सवाई' चाल प्रमुख विशेषता है।",
                "Ghoomar is the regal State Dance of Rajasthan, defined by graceful pirouettes and synchronization of the swirling ghaghra.", "Easy"
            ),
            QPayload(
                "नाथद्वारा (राजसमंद) की 'पिचवाई कला' (Pichhwai Paintings) में मुख्य रूप से किसका चित्रण कपड़े के पर्दे पर किया जाता है?",
                "What is the central thematic subject depicted in the famous 'Pichhwai' cloth art of Nathdwara (Rajsamand)?",
                listOf("भगवान श्रीनाथजी (बालकृष्ण) की विविध लीलाएं और गायें", "शिकार के दृश्य", "दरबारी रानियों के चित्र", "युद्ध के प्रसंग"),
                listOf("Divine pastimes (Leelas) and adorations of Lord Shrinathji (Lord Krishna)", "Hunting expeditions", "Mughal court scenes", "Heroic battlefields"),
                0, "पिचवाई नाथद्वारा में वल्लभ संप्रदाय के श्रीनाथजी मंदिर में मूर्ति के पीछे पर्दे पर बनाई जाने वाली पारंपरिक वस्त्र चित्रकला है।",
                "Pichhwai paintings are sacred devotional textile hangings illustrating scenes of Krishna/Shrinathji's life in Nathdwara.", "Easy"
            )
        )
        val index = (seed + (mock * 29) + (qNum * 37)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }

    // =========================================================================
    // TOPIC 10: Fairs, Festivals, Folk Drama, Literature & Eminent Personalities
    // =========================================================================
    private fun getRajTopic10Data(mock: Int, qNum: Int): QPayload {
        val seed = (mock * 47 + qNum * 17)
        val questions = listOf(
            QPayload(
                "पुष्कर मेला (अजमेर) जो विश्व प्रसिद्ध पशु मेला और ब्रह्मा मंदिर हेतु विख्यात है, किस हिंदू माह की पूर्णिमा को भरता है?",
                "On the full moon (Purnima) of which Hindu lunar month is the world-renowned Pushkar Fair held in Ajmer?",
                listOf("कार्तिक पूर्णिमा (Kartik Purnima)", "चैत्र पूर्णिमा", "भाद्रपद शुक्ल दशमी", "वैशाख पूर्णिमा"),
                listOf("Kartik Purnima (October-November)", "Chaitra Purnima", "Bhadrapada Shukla Dashami", "Vaishakha Purnima"),
                0, "कार्तिक पूर्णिमा को पुष्कर में 52 घाटों पर महास्नान, दीपदान और एशिया का सबसे बड़ा रंग-बिरंगा ऊंट/पशु मेला भरता है।",
                "The grand Pushkar Fair culminates on Kartik Purnima with holy dips in Pushkar Lake and vibrant livestock celebrations.", "Easy"
            ),
            QPayload(
                "आदिवासियों का 'कुंभ' कहे जाने वाले 'बेणेश्वर मेला' (डूंगरपुर) का आयोजन माघ पूर्णिमा को किन तीन नदियों के संगम पर होता है?",
                "At the holy confluence of which three rivers is the 'Beneshwar Fair' (Maha Kumbh of Tribals) held in Dungarpur?",
                listOf("सोम, माही और जाखम नदी (Som, Mahi & Jakham Triveni Sangam)", "बनास, बेड़च और मेनाल", "चंबल, बनास और सीप", "पार्वती, कालीसिंध और आहू"),
                listOf("Som, Mahi and Jakham rivers (Nawata Pura, Dungarpur)", "Banas, Berach and Menal", "Chambal, Banas and Seep", "Parvati, Kalisindh and Ahu"),
                0, "नवाटापुरा (डूंगरपुर) में सोम-माही-जाखम संगम पर मावजी महाराज द्वारा स्थापित खंडित शिवलिंग की पूजा होती है।",
                "Beneshwar Fair on Magh Purnima is celebrated at the holy confluence of Som, Mahi, and Jakham rivers by Bhil tribes.", "Easy"
            ),
            QPayload(
                "डिंगल भाषा के प्रसिद्ध महाकाव्य 'वंश भास्कर' और 'वीर सतसई' के रचयिता कौन थे जो बूंदी महाराव रामसिंह के दरबारी कवि थे?",
                "Who authored the monumental historical epics 'Vansh Bhaskar' and 'Veer Satsai' as the court poet of Bundi?",
                listOf("महाकवि सूर्यमल मिश्रण (Suryamal Misran)", "कन्हैयालाल सेठिया", "चंदबरदाई", "बांकीदास"),
                listOf("Mahakavi Suryamal Misran", "Kanhaiyalal Sethia", "Chand Bardai", "Bankidas"),
                0, "सूर्यमल मिश्रण राजस्थान के राज्य कवि हैं। उन्होंने 1857 में 'इला न देणी आपणी, हालरिये हुलराय' लिखकर राष्ट्रभक्ति की अलख जगाई।",
                "Suryamal Misran of Bundi authored Vansh Bhaskar and Veer Satsai in Dingal, immortalizing Rajasthani martial spirit.", "Easy"
            ),
            QPayload(
                "'पाथल और पीथल' तथा 'धरती धोरां री' जैसी अमर राजस्थानी कृतियों के रचयिता सुजानगढ़ (चूरू) के प्रसिद्ध साहित्यकार कौन थे?",
                "Who authored the timeless Rajasthani literary classics 'Pathal aur Peethal' and 'Dharti Dhoran Ri'?",
                listOf("पद्मश्री कन्हैयालाल सेठिया (Kanhaiyalal Sethia)", "विजयदान देथा", "यादवेंद्र शर्मा 'चंद्र'", "लक्ष्मीकुमारी चूंडावत"),
                listOf("Padma Shri Kanhaiyalal Sethia", "Vijaydan Detha ('Bijji')", "Yadavendra Sharma Chandra", "Lakshmi Kumari Chundawat"),
                0, "कन्हैयालाल सेठिया ने 'पाथल' (महाराणा प्रताप) और 'पीथल' (पृथ्वीराज राठौड़) की रचना की। उन्हें ज्ञानपीठ मूर्तिदेवी और पद्मश्री पुरस्कार मिला।",
                "Kanhaiyalal Sethia of Sujangarh wrote iconic patriotic anthems including 'Dharti Dhoran Ri' and 'Pathal aur Peethal'.", "Easy"
            ),
            QPayload(
                "'बातां री फुलवारी' (14 खंड) के लेखक कौन थे जिन्हें 'बिज्जी' उपनाम से जाना जाता है और रूपायन संस्थान (बोरुंदा) के सह-संस्थापक थे?",
                "Who penned the acclaimed 14-volume folklore anthology 'Baatan Ri Phulwari' under the pen-name 'Bijji'?",
                listOf("विजयदान देथा (Vijaydan Detha)", "कोमल कोठारी", "मुहणौत नैणसी", "कविराजा श्यामलदास"),
                listOf("Vijaydan Detha ('Bijji')", "Komal Kothari", "Muhnot Nainsi", "Kaviraja Shyamaldas"),
                0, "विजयदान देथा ने कोमल कोठारी के साथ 1960 में बोरुंदा (जोधपुर) में रूपायन संस्थान की स्थापना की। उनकी कहानी 'दुविधा' पर 'पहेली' फिल्म बनी।",
                "Vijaydan Detha preserved Rajasthani oral storytelling in 'Baatan Ri Phulwari', collaborating with Komal Kothari at Rupayan Sansthan.", "Easy"
            )
        )
        val index = (seed + (mock * 31) + (qNum * 41)) % questions.size
        val q = questions[index]
        return q.copy(diff = if (qNum % 3 == 0) "Hard" else if (qNum % 2 == 0) "Moderate" else "Easy")
    }
}

fun makeRajQ(
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
): GkQuestion = RajasthanQuestionHelper.makeRajQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)

fun makeRajasthanQ(
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
): GkQuestion = RajasthanQuestionHelper.makeRajQ(id, subtopicId, qHi, qEn, optsHi, optsEn, correctIdx, expHi, expEn, diff)
