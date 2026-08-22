package com.example.ui.data

import com.example.ui.data.RajasthanQuestionHelper.makeRajQ
import com.example.ui.model.GkQuestion

object RajasthanTopic4Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeRajQ(
            "raj_4_m1_q1", "raj_4",
            "राजस्थान की एकमात्र बारहमासी (Perennial) और सबसे लंबी नदी कौन सी है जिसे 'कामधेनु' और 'चर्मण्वती' कहा जाता है?",
            "Which is the longest and only perennial river of Rajasthan, anciently named 'Charmanyavati' and called 'Kamdhenu'?",
            listOf("बनास नदी", "चंबल नदी (Chambal River - Janapav Hills, Vindhyas)", "लूणी नदी", "माही नदी"),
            listOf("Banas River", "Chambal River (Originates from Janapav hills near Mhow, MP)", "Luni River", "Mahi River"),
            1,
            "चंबल नदी मध्य प्रदेश में इंदौर के निकट जानापाव की पहाड़ियों से निकलती है और चौरासीगढ़ (चित्तौड़गढ़) से राजस्थान में प्रवेश करती है। यह यमुना की सहायक नदी है और अपने अवनालिका अपरदन (उत्खात भूमि / बीहड़) हेतु विख्यात है।",
            "Chambal is Rajasthan's prime perennial river system, joining the Yamuna in Uttar Pradesh after carving deep badland ravines.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q2", "raj_4",
            "पूर्णतः राजस्थान के भीतर बहने वाली सबसे लंबी नदी (480/512 किमी) कौन सी है जिसे 'वन की आशा' (Veranasha) कहा जाता है?",
            "Which is the longest river flowing entirely within the geographical territory of Rajasthan, known as 'Vashisthi' or 'Hope of the Forest' (Van Ki Asha)?",
            listOf("चंबल नदी", "बनास नदी (Banas River - Khamnor Hills, Rajsamand)", "लूणी नदी", "साबरमती नदी"),
            listOf("Chambal", "Banas River (Originates from Khamnor hills in Rajsamand)", "Luni", "Sabarmati"),
            1,
            "बनास नदी राजसमंद के खमनोर की पहाड़ियों से निकलकर राजसमंद, चित्तौड़गढ़, भीलवाड़ा, शाहपुरा, केकड़ी, टोंक और सवाई माधोपुर (रामेश्वरम) में चंबल में मिलती है। पूर्णतः राजस्थान में बहने वाली यह सबसे लंबी नदी है।",
            "The Banas River flows entirely within Rajasthan across six districts before merging into the Chambal at Rameshwaram Ghat.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q3", "raj_4",
            "मरुस्थल की जीवन रेखा 'लूणी नदी' (Luni River) अजमेर के नाग पहाड़ से निकलती है। इसका जल बालोतरा (बाड़मेर) तक मीठा तथा उसके बाद खारा क्यों हो जाता है?",
            "The Luni River carries fresh water from Ajmer's Nag Hills up to Balotra, after which it turns saline. Why?",
            listOf("नदी में समुद्र का पानी मिलने से", "बालोतरा के बाद भूमि में सोडियम क्लोराइड लवण की अधिकता होने के कारण (High concentration of salt-rich desert soil)", "प्रदूषण के कारण", "पहाड़ी पत्थरों के कारण"),
            listOf("Sea intrusion", "Leaching of high concentrations of soluble salts (sodium chloride) from arid soil beds after Balotra", "Industrial effluents", "Limestone minerals"),
            1,
            "लूणी नदी (प्राचीन नाम लवणवती) अजमेर के नाग पहाड़ से निकलकर 495 किमी (राजस्थान में 330 किमी) बहकर कच्छ के रण (गुजरात) में विलीन होती है। बालोतरा तक इसका जल मीठा तथा आगे क्षारीय/खारा हो जाता है, इसलिए इसे 'आधी मीठी - आधी खारी नदी' कहते हैं।",
            "Luni is Rajasthan's chief desert river, flowing into the Rann of Kutch; its water turns saline past Balotra due to saline tract deposits.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q4", "raj_4",
            "राजस्थान की वह कौन सी नदी है जो कर्क रेखा को दो बार (Twice) पार करती है और 'उलटे U' आकार में बहती है?",
            "Which river in southern Rajasthan crosses the Tropic of Cancer twice, forming an inverted 'U' shape loop?",
            listOf("चंबल नदी", "माही नदी (Mahi River - Dhar, MP to Gulf of Khambhat)", "सोम नदी", "जाखम नदी"),
            listOf("Chambal River", "Mahi River (Crosses Tropic of Cancer twice in Banswara & Dungarpur)", "Som River", "Jakham River"),
            1,
            "माही नदी (धार, MP से उद्गम) राजस्थान में खांदू गांव (बांसवाड़ा) से प्रवेश कर डूंगरपुर व बांसवाड़ा की सीमा बनाती हुई कर्क रेखा को दो बार काटती है और खंभात की खाड़ी (गुजरात) में गिरती है। इसे 'वागड़ व कांठल की गंगा' कहते हैं।",
            "The Mahi River is famous for cutting the Tropic of Cancer twice along its south-to-north-to-south arc in Rajasthan.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q5", "raj_4",
            "बेणेश्वर धाम (डूंगरपुर) में आदिवासियों का महाकुंभ किस त्रिवेणी संगम (Confluence of 3 rivers) पर आयोजित होता है?",
            "The revered tribal pilgrimage Beneshwar Dham in Dungarpur is located at the sacred Triveni Sangam of which three rivers?",
            listOf("बनास, बेड़च और मेनाल", "सोम, माही और जाखम नदी (Som, Mahi & Jakham rivers)", "चंबल, बनास और सीप", "कालीसिंध, आहू और परवन"),
            listOf("Banas, Berach & Menal", "Som, Mahi & Jakham rivers (Nawata Para, Dungarpur)", "Chambal, Banas & Seep", "Kalisindh, Ahu & Parwan"),
            1,
            "डूंगरपुर के नवाटापारा में सोम, माही और जाखम नदियों के संगम पर 'बेणेश्वर धाम' स्थित है जहाँ संत मावजी ने तपस्या की थी। माघ पूर्णिमा को यहाँ आदिवासियों का सबसे बड़ा मेला (आदिवासियों का कुंभ) भरता है। यहाँ भारत का एकमात्र खंडित शिवलिंग पूजनीय है।",
            "Beneshwar Dham is situated at the holy confluence of Som, Mahi, and Jakham, famous for the Mahashivratri/Magh Purnima tribal fair.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q6", "raj_4",
            "भारत की सबसे बड़ी अंतःस्थलीय खारे पानी की झील 'सांभर झील' (Sambhar Salt Lake) देश के कुल नमक उत्पादन का कितना प्रतिशत उत्पादित करती है?",
            "India's largest inland saline lake, Sambhar Lake (Jaipur/Nagaur/Didwana-Kuchaman), produces what proportion of India's total salt?",
            listOf("2.5%", "8.7% (Produces ~8.7% of India's total salt output)", "15.0%", "25.0%"),
            listOf("2.5%", "8.7% (Approx 8.7% of total Indian salt production - Ramsar Site 1990)", "15.0%", "25.0%"),
            1,
            "सांभर झील भारत की सबसे बड़ी अंतःस्थलीय लवणीय झील है, जहाँ 'हिंदुस्तान साल्ट्स लिमिटेड' द्वारा क्यार व बरार पद्धति से देश का 8.7% नमक बनाया जाता है। बिजोलिया शिलालेख के अनुसार इसका निर्माण चौहान शासक वासुदेव ने करवाया था। इसे 1990 में रामसर स्थल घोषित किया गया।",
            "Sambhar Salt Lake in central Rajasthan accounts for 8.7% of India's indigenous salt harvest and is a Ramsar wetland.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q7", "raj_4",
            "राजस्थान की सबसे ऊंची मीठे पानी की प्राकृतिक झील 'नक्की झील' (Nakki Lake) किस जिले में स्थित है जिसके बारे में मान्यता है कि यह देवताओं के नाखूनों से खोदी गई थी?",
            "Which is the highest freshwater lake in Rajasthan (altitude ~1,200 m), mythological folklore claiming it was dug out by divine fingernails?",
            listOf("उदयपुर", "नक्की झील, माउंट आबू (Nakki Lake, Mount Abu, Sirohi district)", "राजसमंद", "अजमेर"),
            listOf("Udaipur", "Nakki Lake, Mount Abu (Sirohi - 1200 m elevation surrounded by Toad Rock)", "Rajsamand", "Ajmer"),
            1,
            "नक्की झील माउंट आबू (सिरोही) में 1200 मीटर की ऊंचाई पर स्थित राज्य की सबसे ऊंची व सबसे गहरी क्रेटर/विवर्तनिक मीठे पानी की झील है। इसके निकट टॉड रॉक (मेंढक जैसी चट्टान), नन रॉक और नंदी रॉक स्थित हैं। यह गरासिया जनजाति का पवित्र तीर्थ है।",
            "Nakki Lake in Mount Abu is Rajasthan's highest altitude lake, flanked by iconic natural rock formations like Toad Rock.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q8", "raj_4",
            "उदयपुर को 'झीलों की नगरी' (City of Lakes) कहा जाता है। पिछोला झील के मध्य स्थित 'जग निवास' (Lake Palace) और 'जग मंदिर' का निर्माण किसने करवाया था?",
            "In Udaipur's picturesque Lake Pichola, who built the historic island pavilions Jag Mandir and Jag Niwas (now Lake Palace)?",
            listOf("महाराणा उदयसिंह", "महाराणा कर्ण सिंह / जगत सिंह प्रथम (Jag Mandir) एवं जगत सिंह द्वितीय (Jag Niwas)", "महाराणा कुंभा", "महाराणा भूपाल सिंह"),
            listOf("Maharana Udai Singh", "Maharana Karan Singh & Jagat Singh I (Jag Mandir) and Jagat Singh II (Jag Niwas)", "Maharana Kumbha", "Maharana Bhupal Singh"),
            1,
            "पिछोला झील का निर्माण 14वीं सदी में महाराणा लाखा के काल में 'पिच्छू' छीतर बंजारे ने करवाया था। इसमें स्थित जग मंदिर (जहाँ शाहजहां ने शरण ली थी) का निर्माण जगत सिंह प्रथम (1651) ने तथा जग निवास (लेक पैलेस) का निर्माण जगत सिंह द्वितीय (1746) ने पूरा करवाया।",
            "Lake Pichola houses the floating architectural gems Jag Mandir and Jag Niwas in Udaipur.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q9", "raj_4",
            "राजसमंद झील (राजसमंद) की 'नौचौकी पाल' पर 25 काले संगमरमर के शिलालेखों पर संस्कृत में उत्कीर्ण 'राजप्रशस्ति' (विश्व का सबसे बड़ा शिलालेख) के रचयिता कौन थे?",
            "Who authored the monumental 'Raj Prashasti'—the world's longest Sanskrit stone inscription engraved on 25 black marble slabs along Rajsamand Lake's Nauchowki embankment?",
            listOf("कविराज श्यामलदास", "रणछोड़ भट्ट तैलंग (Ranchhod Bhatt Tailang)", "पं. विद्याधर", "अत्रि-महेश"),
            listOf("Kaviraj Shyamaldas", "Ranchhod Bhatt Tailang (1676 AD, commissioned by Maharana Raj Singh I)", "Vidyadhar", "Atri-Mahesh"),
            1,
            "1676 ई. में महाराणा राजसिंह ने गोमती नदी के पानी को रोककर अकाल राहत कार्य के तहत राजसमंद झील बनवाई। इसकी नौचौकी पाल पर 25 बड़े संगमरमर के शिलापट्टों पर रणछोड़ भट्ट तैलंग द्वारा 24 सर्गों में मेवाड़ का इतिहास 'राजप्रशस्ति महाकाव्य' उत्कीर्ण है।",
            "Raj Prashasti, engraved on 25 stone slabs on Rajsamand lake bund by Ranchhod Bhatt Tailang, chronicles the Mewar lineage in Sanskrit verse.",
            "Moderate"
        ),
        makeRajQ(
            "raj_4_m1_q10", "raj_4",
            "अजमेर में नाग पहाड़ और तारागढ़ के बीच 'आनासागर झील' (Ana Sagar Lake) का निर्माण 1137 ई. में किसने करवाया था?",
            "Who constructed the scenic Ana Sagar Lake in Ajmer in 1137 AD by damming the Luni river tributaries?",
            listOf("अजयराज चौहान", "अर्णोराज / आनाजी चौहान (Arnoraj / Anaji Chauhan)", "पृथ्वीराज चौहान", "विग्रहराज चतुर्थ"),
            listOf("Ajayraj Chauhan", "Arnoraj / Anaji Chauhan (1137 AD)", "Prithviraj Chauhan", "Vigraharaj IV"),
            1,
            "1137 ई. में अर्णोराज (आनाजी) चौहान ने तुर्की आक्रांताओं के रक्त से सनी भूमि को शुद्ध करने हेतु बांडी नदी के जल को रोककर आनासागर झील बनवाई। जहाँ जहांगीर ने 'दौलत बाग' (सुभाष उद्यान) तथा शाहजहां ने 5 संगमरमर की 'बारहदरी' बनवाई।",
            "Ana Sagar Lake was excavated in 1137 by Arnoraj Chauhan, enhanced later with Mughal gardens (Daulat Bagh) by Jahangir and marble Baradaris by Shah Jahan.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q11", "raj_4",
            "एशिया की सबसे बड़ी मानव-निर्मित कृत्रिम मीठे पानी की झीलों में से एक 'जयसमंद झील' (सलूंबर/उदयपुर) को किस अन्य नाम से जाना जाता है?",
            "Which prominent freshwater artificial lake, built by Maharana Jai Singh (1685–1691) across the Gomti river with 7 inhabited islands (Baba Ka Bhagra & Pyari), is known as 'Dhebar Lake'?",
            listOf("राजसमंद झील", "ढेबर झील / जयसमंद झील (Dhebar Lake / Jaisamand Lake)", "फतेहसागर झील", "उदयसागर झील"),
            listOf("Rajsamand Lake", "Dhebar Lake / Jaisamand Lake (7 islands including Baba Ka Bhagra)", "Fatehsagar Lake", "Udaisagar Lake"),
            1,
            "जयसमंद झील (ढेबर झील) का निर्माण महाराणा जयसिंह ने 1685-1691 में गोमती नदी पर बांध बनाकर करवाया। इसमें 7 टापू हैं (सबसे बड़ा 'बाबा का भांगड़ा' और सबसे छोटा 'प्यारी' टापू)। यहाँ से 'श्यामपुरा' व 'भाट' नामक दो सिंचाई नहरें निकाली गई हैं।",
            "Jaisamand Lake (Dhebar Lake) spans 87 sq km, celebrated as Rajasthan's premier man-made freshwater reservoir.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q12", "raj_4",
            "राजस्थान की 'मरुगंगा' कही जाने वाली 'इंदिरा गांधी नहर परियोजना' (IGNP) का उद्गम पंजाब में किस बैराज से होता है?",
            "The Indira Gandhi Canal (IGNP)—the lifeline of western Rajasthan desert—originates from which barrage at the confluence of Satluj and Beas rivers in Punjab?",
            listOf("भाखड़ा बैराज", "हरिके बैराज (Harike Barrage, Ferozepur - Confluence of Satluj & Beas)", "नंगल बैराज", "पोंग बांध"),
            listOf("Bhakra Barrage", "Harike Barrage (Punjab - Confluence of Satluj & Beas rivers)", "Nangal Barrage", "Pong Dam"),
            1,
            "इंदिरा गांधी नहर (IGNP, पूर्व नाम राजस्थान नहर) पंजाब में फिरोजपुर के पास सतलुज और व्यास नदियों के संगम पर स्थित हरिके बैराज से निकलती है। इसके योजनाकार कंवर सैन (बीकानेर के मुख्य अभियंता) थे। इसका शिलान्यास 31 मार्च 1958 को गृहमंत्री गोविंद वल्लभ पंत ने किया था।",
            "The Indira Gandhi Canal originates at the Harike Barrage, supplying water over 650 km to transform arid Thar districts into productive agricultural belts.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q13", "raj_4",
            "चंबल नदी घाटी परियोजना (Chambal Valley Project) के अंतर्गत निर्मित 4 बांधों में से राजस्थान में स्थित बांध कौन से हैं?",
            "Among the 4 major dams built under the joint Chambal Multipurpose Project (Rajasthan & MP 50:50), which three dams are situated inside Rajasthan?",
            listOf("गांधी सागर, सरदार सरोवर व भाखड़ा", "राणा प्रताप सागर (चित्तौड़गढ़), जवाहर सागर (कोटा) एवं कोटा बैराज (कोटा)", "गांधी सागर, टिहरी व रिहंद", "मही बजाज सागर व बीसलपुर"),
            listOf("Gandhi Sagar, Sardar Sarovar & Bhakra", "Rana Pratap Sagar (Rawatbhata), Jawahar Sagar (Kota) & Kota Barrage (Kota)", "Gandhi Sagar, Tehri & Rihand", "Mahi Bajaj & Bisalpur"),
            1,
            "चंबल परियोजना राजस्थान और मध्य प्रदेश की 50:50 संयुक्त परियोजना है। इसके 4 बांध हैं: (1) गांधी सागर (मंदसौर, MP) (2) राणा प्रताप सागर (रावतभाटा, चित्तौड़गढ़ - राजस्थान का सबसे अधिक जल भराव क्षमता वाला बांध) (3) जवाहर सागर (पिकअप बांध, कोटा) (4) कोटा बैराज (केवल सिंचाई हेतु, कोटा)।",
            "Rana Pratap Sagar, Jawahar Sagar, and Kota Barrage are the three Chambal dams within Rajasthan territory.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q14", "raj_4",
            "राजस्थान की सबसे बड़ी पेयजल परियोजना 'बीसलपुर बांध' (Bisalpur Dam) किस जिले में बनास नदी पर स्थित है जो जयपुर, अजमेर व टोंक को जलापूर्ति करता है?",
            "Which major gravity dam across the Banas river in Tonk district supplies drinking water to Jaipur, Ajmer, and Tonk metropolitan areas?",
            listOf("भीलवाड़ा", "बीसलपुर बांध, टोंक (Bisalpur Dam across Banas river in Deoli, Tonk)", "सवाई माधोपुर", "दौसा"),
            listOf("Bhilwara", "Bisalpur Dam (Tonk district - Banas river gravity dam)", "Sawai Madhopur", "Dausa"),
            1,
            "बीसलपुर बांध टोंक जिले की देवली तहसील में बनास, डाई और खारी नदियों के संगम के पास कंक्रीट से निर्मित विशाल बांध है। यह राजस्थान की सबसे बड़ी पेयजल परियोजना है जिससे जयपुर, अजमेर, ब्यावर, दूदू और टोंक को स्वच्छ पेयजल मिलता है।",
            "Bisalpur Dam in Tonk on the Banas River is Rajasthan's prime urban drinking water lifeline.",
            "Easy"
        ),
        makeRajQ(
            "raj_4_m1_q15", "raj_4",
            "राजस्थान का सबसे ऊंचा बांध 'जाखम बांध' (Jakham Dam, 81 मीटर ऊंचा) किस जिले के सीतामाता वन्यजीव अभयारण्य में स्थित है?",
            "Which is the highest dam in Rajasthan (81 meters height), built across the Jakham river inside the Sita Mata Wildlife Sanctuary in Pratapgarh?",
            listOf("बांसवाड़ा", "जाखम बांध, प्रतापगढ़ (Jakham Dam, Pratapgarh - 81 meters)", "डूंगरपुर", "उदयपुर"),
            listOf("Banswara", "Jakham Dam (Pratapgarh district - height 81 m, constructed inside Sita Mata Wildlife Sanctuary)", "Dungarpur", "Udaipur"),
            1,
            "जाखम बांध प्रतापगढ़ जिले में जाखम नदी पर स्थित है। 81 मीटर की ऊंचाई के साथ यह राजस्थान का सबसे ऊंचा बांध है। यह सीतामाता वन्यजीव अभयारण्य (उड़न गिलहरी का स्वर्ग) के अंदर स्थित है।",
            "Jakham Dam in Pratapgarh stands at 81 meters, making it the highest masonry dam in the state of Rajasthan.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + RajasthanQuestionHelper.generateTopicMocks("raj_4", 2, 5, baseQuestions)
    }
}
