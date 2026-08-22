package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic10Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_10_m1_q1", "spt_10",
            "पैरालंपिक खेलों (Paralympic Games) का जनक किसे माना जाता है, जिन्होंने 1948 में द्वितीय विश्व युद्ध के रीढ़ की हड्डी की चोट वाले दिग्गजों के लिए 'स्टोक मैंडविले गेम्स' की शुरुआत की थी?",
            "Who is celebrated as the founding father of the Paralympic Movement after he organized the 1948 Stoke Mandeville Games for British WWII spinal cord injury veterans?",
            listOf("पियरे डी कुबर्टिन", "डॉ. लुडविग गुट्टमैन (Sir Ludwig Guttmann - Stoke Mandeville Games 1948 / Father of the Paralympics)", "जुआन एंटोनियो समारांच", "फिलिप क्रेवन"),
            listOf("Pierre de Coubertin", "Dr. Ludwig Guttmann (German-British neurologist who pioneered rehabilitation through sports; organized 1948 Stoke Mandeville Games)", "Juan Antonio Samaranch", "Philip Craven"),
            1,
            "डॉ. लुडविग गुट्टमैन (न्यूरोलॉजिस्ट) ने 29 जुलाई 1948 को लंदन ओलंपिक के उद्घाटन के दिन स्टोक मैंडविले अस्पताल में व्हीलचेयर एथलीटों के लिए पहली प्रतियोगिता आयोजित की। यही प्रतियोगिता 1960 में रोम में पहले आधिकारिक पैरालंपिक खेलों में परिवर्तित हुई।",
            "Sir Ludwig Guttmann was a German-British neurologist who established the Stoke Mandeville Games in 1948, which evolved into the modern Paralympic Games.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q2", "spt_10",
            "1972 के हीडलबर्ग (जर्मनी) पैरालंपिक खेलों में 50 मीटर फ्रीस्टाइल तैराकी में स्वर्ण पदक जीतकर पैरालंपिक में भारत का पहला ऐतिहासिक स्वर्ण पदक किसने जीता था?",
            "Who won India's very first Paralympic Gold medal in history, setting a world record in the Men's 50m Freestyle 3 swimming event at the Heidelberg 1972 Paralympics?",
            listOf("देवेंद्र झाझरिया", "मुरलीकांत पेटकर (Murlikant Petkar - 1972 Heidelberg Gold in 50m Freestyle Swimming / 1965 war veteran)", "जोगिंदर सिंह बेदी", "मरियप्पन थंगावेलु"),
            listOf("Devendra Jhajharia", "Murlikant Petkar (Indian Army soldier disabled in 1965 Indo-Pak war who clocked 37.33s world record in 1972)", "Joginder Singh Bedi", "Mariyappan Thangavelu"),
            1,
            "मुरलीकांत पेटकर (1965 भारत-पाक युद्ध में गंभीर रूप से घायल भारतीय सेना के जवान) ने 1972 हीडलबर्ग पैरालंपिक में 50 मीटर फ्रीस्टाइल तैराकी में 37.33 सेकंड का विश्व रिकॉर्ड बनाकर स्वतंत्र भारत का पहला पैरालंपिक स्वर्ण पदक जीता था।",
            "Murlikant Petkar was India's first Paralympic gold medalist, winning the 50m freestyle swimming event with a world record at Heidelberg in 1972.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q3", "spt_10",
            "पैरालंपिक इतिहास में 3 पदक (2 स्वर्ण: एथेंस 2004 व रियो 2016; 1 रजत: टोक्यो 2020) जीतने वाले भारत के सबसे सफल पैरा-भाला फेंक एथलीट और पैरालंपिक समिति (PCI) के अध्यक्ष कौन हैं?",
            "Who is India's most decorated Paralympian with 3 Paralympic medals in F46 Javelin (Gold in Athens 2004, Gold in Rio 2016, Silver in Tokyo 2020) and current President of PCI?",
            listOf("सुमित अंतिल", "देवेंद्र झाझरिया (Devendra Jhajharia - First Indian to win 2 Paralympic Golds & Padma Bhushan awardee)", "सुंदर सिंह गुर्जर", "प्रमोद भगत"),
            listOf("Sumit Antil", "Devendra Jhajharia (Rajasthan javelin ace; 1st Indian Paralympian awarded Padma Bhushan; President of Paralympic Committee of India)", "Sundar Singh Gurjar", "Pramod Bhagat"),
            1,
            "देवेंद्र झाझरिया (चूरू, राजस्थान) ने F46 भाला फेंक में 2004 एथेंस और 2016 रियो में विश्व रिकॉर्ड के साथ स्वर्ण पदक जीता और टोक्यो 2020 में रजत पदक जीता। वे पद्म भूषण पाने वाले पहले पैरा-एथलीट हैं और वर्तमान में भारतीय पैरालंपिक समिति (PCI) के अध्यक्ष हैं।",
            "Devendra Jhajharia is an Indian Paralympic javelin thrower who won two Paralympic gold medals and one silver medal, becoming a pioneer of Indian para-sports.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q4", "spt_10",
            "टोक्यो 2020 और पेरिस 2024 पैरालंपिक खेलों में लगातार दो स्वर्ण पदक जीतकर लगातार दो पैरालंपिक में स्वर्ण जीतने वाली भारत की पहली महिला एथलीट कौन बनीं?",
            "Who created history as the first Indian woman to win back-to-back Paralympic Gold medals (R2 10m Air Rifle SH1 at Tokyo 2020 and Paris 2024)?",
            listOf("भाविना पटेल", "अवनी लेखरा (Avani Lekhara - Back-to-back Paralympic Golds at Tokyo 2020 & Paris 2024 + Tokyo 50m 3P Bronze)", "दीपा मलिक", "एकता भयान"),
            listOf("Bhavina Patel", "Avani Lekhara (Jaipur rifle shooter who won Gold at Tokyo 2020, Bronze at Tokyo 2020, and retained Gold at Paris 2024 in SH1 category)", "Deepa Malik", "Ekta Bhyan"),
            1,
            "अवनी लेखरा (जयपुर, राजस्थान) ने टोक्यो 2020 में 10 मीटर एयर राइफल (SH1) में स्वर्ण और 50 मीटर राइफल 3P में कांस्य जीता। उन्होंने पेरिस 2024 में 249.7 के पैरालंपिक रिकॉर्ड के साथ अपने स्वर्ण पदक का सफलतापूर्वक बचाव किया।",
            "Avani Lekhara is an Indian Paralympian and rifle shooter who became the first Indian woman to win multiple Paralympic gold medals in consecutive Games.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q5", "spt_10",
            "F64 श्रेणी में पुरुषों की भाला फेंक स्पर्धा में 70.59 मीटर का विश्व रिकॉर्ड फेंककर टोक्यो 2020 और पेरिस 2024 दोनों में लगातार स्वर्ण पदक जीतने वाले भारतीय पैरा-एथलीट कौन हैं?",
            "Who broke his own world record with a massive throw of 70.59m in the F64 category to win back-to-back Paralympic Gold medals at Tokyo 2020 and Paris 2024?",
            listOf("देवेंद्र झाझरिया", "सुमित अंतिल (Sumit Antil - World Record Holder & Double Paralympic Gold medalist in Men's Javelin F64)", "संदीप चौधरी", "प्रवीण कुमार"),
            listOf("Devendra Jhajharia", "Sumit Antil (Sonipat, Haryana javelin champion who dominated F64 javelin at both Tokyo 2020 and Paris 2024 Paralympics)", "Sandeep Chaudhary", "Praveen Kumar"),
            1,
            "सुमित अंतिल (सोनीपत, हरियाणा) ने टोक्यो 2020 पैरालंपिक में 68.55 मीटर और पेरिस 2024 में 70.59 मीटर का रिकॉर्ड थ्रो फेंककर लगातार दो पैरालंपिक स्वर्ण पदक जीते।",
            "Sumit Antil is an Indian para javelin thrower who won gold medals at the 2020 Tokyo and 2024 Paris Paralympics, repeatedly setting new world records.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q6", "spt_10",
            "अंतर्राष्ट्रीय पैरालंपिक समिति (IPC - International Paralympic Committee) का मुख्यालय किस देश और शहर में स्थित है?",
            "Where is the global headquarters of the International Paralympic Committee (IPC - founded in 1989) located?",
            listOf("लुसाने (स्विट्जरलैंड)", "बॉन, जर्मनी (Bonn, Germany - IPC Headquarters)", "विएना (ऑस्ट्रिया)", "पेरिस (फ्रांस)"),
            listOf("Lausanne, Switzerland", "Bonn, Germany (International Paralympic Committee official headquarters since 1999)", "Vienna, Austria", "Paris, France"),
            1,
            "अंतर्राष्ट्रीय पैरालंपिक समिति (IPC) की स्थापना 22 सितंबर 1989 को डसेलडोर्फ में हुई थी और इसका मुख्यालय बॉन (Bonn, जर्मनी) में स्थित है। इसका प्रतीक चिन्ह 'एगिटोस' (Agitos - 'मैं गतिमान हूँ') कहलाता है।",
            "The International Paralympic Committee (IPC) is the global governing body of the Paralympic Movement, headquartered in Bonn, Germany.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q7", "spt_10",
            "प्रथम 'शीतकालीन ओलंपिक खेल' (First Winter Olympic Games) किस वर्ष और किस स्थान पर आयोजित किए गए थे?",
            "In which year and at which alpine resort town were the inaugural Winter Olympic Games officially staged?",
            listOf("1896 एथेंस", "1924 शेमोनिक्स, फ्रांस (1924 Chamonix, France - First Olympic Winter Games)", "1932 लेक प्लासिड", "1952 ओस्लो"),
            listOf("1896 Athens", "1924 Chamonix, France (Held at the base of Mont Blanc; 16 nations contested 16 events)", "1932 Lake Placid", "1952 Oslo"),
            1,
            "पहले शीतकालीन ओलंपिक खेल 1924 में शेमोनिक्स (Chamonix, फ्रांस) में मोंट ब्लांक के पास आयोजित किए गए थे। इसमें 16 देशों के 250 से अधिक एथलीटों ने भाग लिया था।",
            "The 1924 Winter Olympics, officially known as the I Olympic Winter Games, were held in Chamonix, France, between 25 January and 5 February 1924.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q8", "spt_10",
            "विश्व का एकमात्र ऐसा शहर कौन-सा है जिसने ग्रीष्मकालीन ओलंपिक (2008) और शीतकालीन ओलंपिक (2022) दोनों की सफलतापूर्वक मेजबानी की है?",
            "Which city holds the unique global distinction of being the first and only city to host both the Summer Olympic Games (2008) and the Winter Olympic Games (2022)?",
            listOf("टोक्यो (जापान)", "बीजिंग, चीन (Beijing, China - First Dual Olympic City: 2008 Summer & 2022 Winter Olympics)", "पेरिस (फ्रांस)", "लंदन (ब्रिटेन)"),
            listOf("Tokyo, Japan", "Beijing, China (Summer 2008 & Winter 2022 'Dual Olympic City'; Bird's Nest stadium used for both opening ceremonies)", "Paris, France", "London, UK"),
            1,
            "बीजिंग (चीन) दुनिया का पहला और एकमात्र शहर है जिसने 2008 ग्रीष्मकालीन ओलंपिक और 2022 शीतकालीन ओलंपिक दोनों की मेजबानी की है। प्रतिष्ठित 'बर्ड्स नेस्ट' (नेशनल स्टेडियम) दोनों संस्करणों के उद्घाटन समारोह का गवाह बना।",
            "Beijing became the first city ever to host both editions of the Olympic Games, having hosted the Summer Olympics in 2008 and the Winter Olympics in 2022.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q9", "spt_10",
            "शीतकालीन ओलंपिक में ल्यूज (Luge - स्लेज रेसिंग) स्पर्धा में लगातार 6 बार (1998 से 2018) भारत का प्रतिनिधित्व करने वाले भारतीय विंटर ओलंपियन कौन हैं?",
            "Having represented India at six consecutive Winter Olympics (1998 Nagano to 2018 PyeongChang) in the high-speed Luge event, who is known as India's premier winter sports trailblazer?",
            listOf("मोहम्मद आरिफ खान", "शिवा केशवन (Shiva Keshavan - 6-time Olympian in Luge & Asian Luge Champion)", "जगदीश सिंह", "किशन सिंह"),
            listOf("Mohammad Arif Khan", "Shiva Keshavan (Manali-born luger who represented India in 6 consecutive Winter Olympics; Arjuna Awardee)", "Jagdish Singh", "Kishan Singh"),
            1,
            "शिवा केशवन (मनाली, हिमाचल प्रदेश) भारत के सबसे प्रमुख विंटर ओलंपियन हैं। उन्होंने ल्यूज (Luge) में 1998 से 2018 तक लगातार 6 शीतकालीन ओलंपिक में भाग लिया और दो बार एशियाई ल्यूज कप में स्वर्ण पदक जीता।",
            "Shiva Keshavan is an Indian luge athlete who represented India at six consecutive Winter Olympic Games from 1998 to 2018, holding the Asian speed record.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q10", "spt_10",
            "शीतकालीन ओलंपिक की स्पर्धा 'बायथलॉन' (Biathlon) किन दो खेलों का एक अनूठा संयुक्त प्रारूप (Combination) है?",
            "In the Winter Olympic discipline of 'Biathlon', athletes compete in a grueling combination of which two distinct sports?",
            listOf("आइस स्केटिंग और आइस हॉकी", "क्रॉस-कंट्री स्कीइंग और राइफल निशानेबाजी (Cross-Country Skiing and Rifle Shooting)", "स्की जंपिंग और स्नोबोर्डिंग", "बॉबस्लेह और ल्यूज"),
            listOf("Ice Skating and Ice Hockey", "Cross-Country Skiing and Rifle Marksmanship (Skiing endurance paired with precision shooting prone & standing)", "Ski Jumping and Snowboarding", "Bobsleigh and Luge"),
            1,
            "बायथलॉन (Biathlon) क्रॉस-कंट्री स्कीइंग (बर्फ पर लंबी दूरी की स्कीइंग) और राइफल शूटिंग (निशानेबाजी) का संयोजन है। स्कीइंग के दौरान एथलीटों को रुककर प्रोन (लेटकर) और स्टैंडिंग (खड़े होकर) स्थितियों में 50 मीटर दूरी पर निशानों को भेदना होता है।",
            "The biathlon is a winter sport that combines cross-country skiing and rifle shooting, originating as an exercise for Norwegian military ski patrols.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q11", "spt_10",
            "विश्व डोपिंग-रोधी एजेंसी (WADA - World Anti-Doping Agency) की स्थापना 1999 में हुई थी, इसका स्थायी वैश्विक मुख्यालय किस शहर में स्थित है?",
            "Established in November 1999 following the Lausanne Declaration on Doping in Sport, where is the permanent global headquarters of the World Anti-Doping Agency (WADA) located?",
            listOf("जिनेवा (स्विट्जरलैंड)", "मॉन्ट्रियल, कनाडा (Montreal, Canada - WADA Global Headquarters)", "पेरिस (फ्रांस)", "लंदन (ब्रिटेन)"),
            listOf("Geneva, Switzerland", "Montreal, Canada (WADA Headquarters at Stock Exchange Tower since 2002)", "Paris, France", "London, UK"),
            1,
            "WADA (विश्व डोपिंग-रोधी एजेंसी) की स्थापना 10 नवंबर 1999 को हुई थी। 2002 से इसका स्थायी मुख्यालय मॉन्ट्रियल (कनाडा) में स्थित है। इसका मुख्य कार्य 'विश्व डोपिंग-रोधी संहिता' (WADA Code) का क्रियान्वयन और खेलों में प्रतिबंधित दवाओं की निगरानी करना है।",
            "The World Anti-Doping Agency (WADA) is an international independent agency headquartered in Montreal, Canada, dedicated to promoting drug-free sport.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q12", "spt_10",
            "भारत में खेलों में डोपिंग की रोकथाम, परीक्षण और खिलाड़ियों में जागरूकता के लिए जिम्मेदार 'राष्ट्रीय डोपिंग रोधी एजेंसी' (NADA) की स्थापना किस वर्ष की गई थी?",
            "In which year was the National Anti-Doping Agency (NADA India) established as an autonomous body under the Ministry of Youth Affairs and Sports?",
            listOf("2000 में", "2005 में (NADA India established on 24 November 2005 / Headquarters: New Delhi)", "2010 में", "1999 में"),
            listOf("2000", "2005 (Established under the Societies Registration Act 1860; headquartered in New Delhi)", "2010", "1999"),
            1,
            "NADA (राष्ट्रीय डोपिंग रोधी एजेंसी) की स्थापना 24 नवंबर 2005 को नई दिल्ली में की गई थी। यह भारत में राष्ट्रीय खेल महासंघों और एथलीटों के डोप परीक्षण और वाडा कोड के अनुपालन की निगरानी करती है।",
            "The National Anti-Doping Agency (NADA) is the national organisation responsible for promoting, coordinating, and monitoring the doping control program in sports across India.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q13", "spt_10",
            "विश्व बैडमिंटन महासंघ (BWF - Badminton World Federation) का अंतरराष्ट्रीय मुख्यालय किस एशियाई राजधानी शहर में स्थित है?",
            "Where is the international headquarters of the Badminton World Federation (BWF - governing body of global badminton) located?",
            listOf("टोक्यो (जापान)", "कुआलालंपुर, मलेशिया (Kuala Lumpur, Malaysia - BWF Headquarters relocated from Cheltenham in 2005)", "जकार्ता (इंडोनेशिया)", "सिंगापुर"),
            listOf("Tokyo, Japan", "Kuala Lumpur, Malaysia (BWF relocated to Kuala Lumpur in 2005 from the UK)", "Jakarta, Indonesia", "Singapore"),
            1,
            "बैडमिंटन वर्ल्ड फेडरेशन (BWF) की स्थापना 1934 में हुई थी। 2005 में इसका मुख्यालय यूके से स्थानांतरित करके कुआलालंपुर (मलेशिया) में स्थापित किया गया।",
            "The Badminton World Federation (BWF) is the international governing body for the sport of badminton, headquartered in Kuala Lumpur, Malaysia.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q14", "spt_10",
            "अंतर्राष्ट्रीय हॉकी महासंघ (FIH - International Hockey Federation) का स्थायी मुख्यालय किस शहर में स्थित है?",
            "Where is the permanent headquarters of the International Hockey Federation (FIH - governing field hockey worldwide since 1924) situated?",
            listOf("नई दिल्ली (भारत)", "लुसाने, स्विट्जरलैंड (Lausanne, Switzerland - FIH Headquarters)", "एम्सटर्डम (नीदरलैंड)", "ब्रुसेल्स (बेल्जियम)"),
            listOf("New Delhi, India", "Lausanne, Switzerland (FIH moved from Brussels to Lausanne in 2005)", "Amsterdam, Netherlands", "Brussels, Belgium"),
            1,
            "अंतर्राष्ट्रीय हॉकी महासंघ (FIH) की स्थापना 7 जनवरी 1924 को पेरिस में हुई थी। इसका मुख्यालय लुसाने (स्विट्जरलैंड) में स्थित है। यह हॉकी विश्व कप और प्रो लीग का आयोजन करता है।",
            "The International Hockey Federation (FIH) is the governing body of field hockey and indoor field hockey, headquartered in Lausanne, Switzerland.",
            "Easy"
        ),
        makeSportsQ(
            "spt_10_m1_q15", "spt_10",
            "डोपिंग रोधी नियमों में 'TUE' का पूर्ण रूप क्या होता है, जो एथलीटों को किसी बीमारी के इलाज के लिए प्रतिबंधित दवा लेने की वैध अनुमति देता है?",
            "In anti-doping regulations governed by WADA, what does the acronym 'TUE' stand for, which permits an athlete to use a prohibited substance for legitimate medical treatment?",
            listOf("Total Urine Evaluation", "Therapeutic Use Exemption (उपचारात्मक उपयोग छूट - TUE granted by medical committee)", "Temporary Usage Extension", "Tested Urine Exemption"),
            listOf("Total Urine Evaluation", "Therapeutic Use Exemption (TUE allows an athlete to use a medication containing a banned substance under strict medical justification)", "Temporary Usage Extension", "Tested Urine Exemption"),
            1,
            "TUE का अर्थ 'Therapeutic Use Exemption' (उपचारात्मक उपयोग छूट) होता है। यदि किसी एथलीट को कोई वास्तविक चिकित्सकीय बीमारी (जैसे अस्थमा, इंसुलिन निर्भर मधुमेह) है, तो वह स्वतंत्र मेडिकल समिति से पूर्व अनुमति (TUE) लेकर निर्धारित दवा ले सकता है।",
            "A Therapeutic Use Exemption (TUE) allows an athlete who has an illness or medical condition requiring a medication on the Prohibited List to take the needed medicine without a doping violation.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_10", 2, 5, baseQuestions)
    }
}
