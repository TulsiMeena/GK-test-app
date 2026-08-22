package com.example.ui.data

import com.example.ui.data.ArtCultureQuestionHelper.makeArtCultureQ
import com.example.ui.model.GkQuestion

object ArtCultureTopic3Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeArtCultureQ(
            "art_3_m1_q1", "art_3",
            "भारतीय शास्त्रीय संगीत की दो प्रमुख शाखाएं कौन-सी हैं जो उत्तर और दक्षिण भारत में क्रमशः विकसित हुईं?",
            "What are the two major foundational traditions of Indian classical music that evolved in Northern and Southern India respectively?",
            listOf("लोक संगीत और सुगम संगीत", "हिंदुस्तानी शास्त्रीय संगीत (उत्तर भारत) और कर्नाटक शास्त्रीय संगीत (दक्षिण भारत) / Hindustani & Carnatic Music", "ध्रुपद और खयाल", "वैदिक संगीत और गंधर्व संगीत"),
            listOf("Folk & Light Music", "Hindustani Music (North India - Persian/Arab influence) and Carnatic Music (South India - indigenous tradition)", "Dhrupad and Khayal", "Vedic and Gandharva Music"),
            1,
            "भारतीय शास्त्रीय संगीत की 2 मुख्य धाराएं हैं: 1. हिंदुस्तानी शास्त्रीय संगीत (उत्तर भारत में 13वीं-14वीं सदी में अमीर खुसरो और मुगल संरक्षण में विकसित), 2. कर्नाटक संगीत (दक्षिण भारत - तमिलनाडु, कर्नाटक, केरल, आंध्र में त्यागराज, मुथुस्वामी दीक्षितर व श्यामा शास्त्री द्वारा विकसित)।",
            "Indian classical music bifurcates into the Hindustani tradition of North India and the Carnatic tradition of South India, sharing common roots in the Sama Veda.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q2", "art_3",
            "भारतीय संगीत की उत्पत्ति किस वेद से मानी जाती है जिसमें ऋग्वेद के मंत्रों को सप्तस्वरों (सा, रे, ग, म, प, ध, नि) में गायन के लिए संकलित किया गया है?",
            "The origins of Indian musical theory and melodic chanting (Samagana) are traced back to which foundational Vedic text?",
            listOf("ऋग्वेद", "सामवेद (Sama Veda - 'Veda of Melodies & Chants' / Root of Indian Classical Music)", "यजुर्वेद", "अथर्ववेद"),
            listOf("Rigveda", "Sama Veda (Root of Indian classical music; organized Riks into musical meters sung by Udgatri priests)", "Yajurveda", "Atharvaveda"),
            1,
            "सामवेद ('साम' = गान) भारतीय संगीत का मूल स्रोत है। इसमें ऋग्वेद की ऋचाओं को मधुर स्वर और लय में गाने की विधि दी गई है। यहीं से 'सप्तक' (सा, रे, ग, म, प, ध, नि) का विकास हुआ।",
            "The Sama Veda is universally revered as the primordial fountainhead of Indian music, establishing the foundation of Swaras and ragas.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q3", "art_3",
            "कर्नाटक संगीत के 'संगीत त्रिमूर्ति' (Trinity of Carnatic Music) के रूप में किन तीन महान 18वीं सदी के संगीतकार संतों को पूजा जाता है?",
            "Which three 18th-century composer-saints from Tiruvarur (Tamil Nadu) are venerated as the revered 'Trinity of Carnatic Music' (Sangeetha Trimurti)?",
            listOf("पुरंदर दास, कनक दास और अन्नमाचार्य", "त्यागराज, मुथुस्वामी दीक्षितर और श्यामा शास्त्री (Saint Tyagaraja, Muthuswami Dikshitar & Syama Sastri)", "स्वाति तिरुनल, गोपाल नायक और वेंकटमखी", "तानसेन, बैजू बावरा और हरिदास"),
            listOf("Purandara Dasa, Kanaka Dasa & Annamacharya", "Tyagaraja (Kritis like Pancharatna), Muthuswami Dikshitar (Kamalamba Navavarna), and Syama Sastri", "Swathi Thirunal & Venkatamakhin", "Tansen & Baiju Bawra"),
            1,
            "कर्नाटक संगीत की त्रिमूर्ति (तिरुवारूर में जन्मे): 1. संत त्यागराज (1767-1847 - पंचरत्न कृतियां), 2. मुथुस्वामी दीक्षितर (1775-1835 - संस्कृत में गंभीर कृतियां), 3. श्यामा शास्त्री (1762-1827 - आनंद भैरवी कृति)।",
            "Saint Tyagaraja, Muthuswami Dikshitar, and Syama Sastri transformed Carnatic music into an elevated spiritual science during the golden age of composition.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q4", "art_3",
            "कर्नाटक संगीत के 'पितामह' (Father of Carnatic Music) के रूप में किसे जाना जाता है जिन्होंने प्रारंभिक संगीत अभ्यास (सरली वरसई, जंतर वरसई) की रचना की?",
            "Who is venerated as the 'Pitamaha' (Grandfather / Founding Father) of Carnatic Music for structuring its pedagogical graded exercises (Sarali Varisai)?",
            listOf("त्यागराज", "संत पुरंदर दास (Saint Purandara Dasa - 1484 to 1564 / Haridasa of Karnataka / Mayamalavagowla raga system)", "कनक दास", "अन्नमाचार्य"),
            listOf("Tyagaraja", "Purandara Dasa (Created the basic learning syllabus and composed thousands of Keerthanas in Kannada dedicated to Lord Vittala)", "Kanaka Dasa", "Annamacharya"),
            1,
            "संत पुरंदर दास (1484-1564) कर्नाटक के महान हरिदास संत थे। उन्होंने संगीत शिक्षण की मानक प्रणाली बनाई और मायामालवगौल राग को प्रारंभिक राग के रूप में स्थापित किया।",
            "Purandara Dasa is universally hailed as the Father of Carnatic Music for codifying the foundational system of musical learning still practiced today.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q5", "art_3",
            "मुगल सम्राट अकबर के नवरत्नों में शामिल 'तानसेन' (Tansen - रामतनु पांडे) किस गायन शैली के महान गायक थे और उनका मकबरा कहाँ स्थित है?",
            "Mian Tansen (Ramtanu Pandey), legendary court musician of Emperor Akbar, was a master of which classical vocal form, and where is his historic tomb located?",
            listOf("खयाल - आगरा", "ध्रुपद (Dhrupad) - ग्वालियर, मध्य प्रदेश (Gwalior, Madhya Pradesh - Tansen's Tomb / Annual Tansen Samaroh)", "ठुमरी - लखनऊ", "गजल - दिल्ली"),
            listOf("Khayal - Agra", "Dhrupad (Tansen was an unmatched exponent of Dhrupad; invented ragas like Mian ki Todi, Darbari Kanada; tomb in Gwalior)", "Thumri - Lucknow", "Ghazal - Delhi"),
            1,
            "तानसेन (1506-1589) ध्रुपद गायन के महानतम गायक थे। उन्होंने स्वामी हरिदास से शिक्षा पाई थी। उनके द्वारा बनाए गए प्रसिद्ध राग: मियां की तोड़ी, दरबारी कान्हड़ा और मेघ मल्हार। उनका मकबरा ग्वालियर (म.प्र.) में है।",
            "Mian Tansen was the supreme musical genius of the Mughal court who mastered the majestic Dhrupad genre and created immortal ragas.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q6", "art_3",
            "विश्वविख्यात सितार वादक 'पंडित रवि शंकर' (Pt. Ravi Shankar) किस घराने से संबंधित थे और वे 1999 में किस सर्वोच्च नागरिक सम्मान से सम्मानित हुए?",
            "Legendary Sitar maestro Pandit Ravi Shankar belonged to which classical musical Gharana, and was awarded the Bharat Ratna in which year?",
            listOf("ग्वालियर घराना - 1990", "मैहर घराना (Maihar Gharana - Disciple of Ustad Allauddin Khan / Bharat Ratna in 1999 / 5 Grammy Awards)", "किराना घराना - 2001", "इमदादखानी घराना - 2005"),
            listOf("Gwalior Gharana", "Maihar Gharana (Trained under Baba Allauddin Khan; popularized Indian classical music in the West with George Harrison)", "Kirana Gharana", "Imdadkhani Gharana"),
            1,
            "पंडित रवि शंकर (1920-2012) मैहर घराने के शिष्य थे। उन्होंने उस्ताद अलाउद्दीन खान से सितार सीखा। वे 1999 में भारत रत्न और 5 ग्रैमी पुरस्कार जीतने वाले पहले भारतीय शास्त्रीय संगीतकार बने।",
            "Pandit Ravi Shankar was the foremost global ambassador of Indian classical music, immortalizing the sitar across the international stage.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q7", "art_3",
            "भारत के महान 'शहनाई' वादक कौन थे जिन्होंने 15 अगस्त 1947 को लाल किले की प्राचीर से शहनाई बजाई थी और उन्हें 2001 में 'भारत रत्न' मिला था?",
            "Which iconic Shehnai maestro played his auspicious instrument at the Red Fort on the historic dawn of Indian Independence (15 August 1947) and received the Bharat Ratna in 2001?",
            listOf("पंडित हरिप्रसाद चौरसिया", "उस्ताद बिस्मिल्लाह खान / कमरुद्दीन खान (Ustad Bismillah Khan - Shehnai Maestro of Varanasi / Bharat Ratna 2001)", "उस्ताद अली अकबर खान", "पंडित राम नारायण"),
            listOf("Pt. Hariprasad Chaurasia (Flute)", "Ustad Bismillah Khan (Transformed the humble folk instrument Shehnai into a world-class classical concert medium; Ganga-Jamuni tehzeeb icon)", "Ustad Ali Akbar Khan (Sarod)", "Pt. Ram Narayan (Sarangi)"),
            1,
            "उस्ताद बिस्मिल्लाह खान (1916-2006, वाराणसी) ने शहनाई को शादी-ब्याह से उठाकर शास्त्रीय संगीत के सर्वोच्च मंचों पर स्थापित किया। 2001 में उन्हें लता मंगेशकर के साथ भारत रत्न दिया गया।",
            "Ustad Bismillah Khan was a cultural titan whose soulful Shehnai music resonated through the spiritual ghats of Varanasi and global concert halls.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q8", "art_3",
            "विश्व प्रसिद्ध 'बांसुरी' (Bansuri / Indian Bamboo Flute) वादक कौन हैं जिन्होंने 'पद्म विभूषण' प्राप्त किया और 'शिव-हरि' की जोड़ी में संगीत दिया?",
            "Which celebrated Indian classical flautist (Bansuri maestro) of the Senia-Maihar tradition was awarded the Padma Vibhushan in 2000?",
            listOf("पंडित रवि शंकर", "पंडित हरिप्रसाद चौरसिया (Pt. Hariprasad Chaurasia - Bansuri Virtuoso / Vrindaban Gurukul)", "उस्ताद जाकिर हुसैन", "पंडित शिवकुमार शर्मा"),
            listOf("Pt. Ravi Shankar", "Pandit Hariprasad Chaurasia (Born in Prayagraj; transformed bamboo flute into global classical phenomenon; paired with Pt. Shivkumar Sharma as 'Shiv-Hari')", "Ustad Zakir Hussain", "Pt. Shivkumar Sharma"),
            1,
            "पंडित हरिप्रसाद चौरसिया (जन्म: 1938, प्रयागराज) भारत के शीर्ष बांसुरी वादक हैं। उन्होंने पंडित शिवकुमार शर्मा (संतूर) के साथ मिलकर 'शिव-हरि' जोड़ी के रूप में सिलसिला, चांदनी, डर जैसी फिल्मों में अमर संगीत दिया।",
            "Pandit Hariprasad Chaurasia elevated the simple Indian bamboo flute to breathtaking heights of classical virtuosity.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q9", "art_3",
            "कश्मीर की 100 तारों वाली 'संतूर' (Santoor - सौ तंत्री वीणा) को विश्व शास्त्रीय संगीत के मंच पर स्थापित करने वाले महान संगीतकार कौन थे?",
            "Which visionary musician from Jammu and Kashmir transformed the 100-string folk instrument 'Santoor' (Shata Tantri Veena) into a mainstream Indian classical concert instrument?",
            listOf("पंडित हरिप्रसाद चौरसिया", "पंडित शिवकुमार शर्मा (Pt. Shivkumar Sharma - 1938 to 2022 / Santoor Maestro / Padma Vibhushan 2001)", "पंडित भजन सोपोरी", "उस्ताद असद अली खान"),
            listOf("Pt. Hariprasad Chaurasia", "Pandit Shivkumar Sharma (Innovated curved walnut striking mallets and modified string tuning to produce Meend on Santoor)", "Pt. Bhajan Sopori", "Ustad Asad Ali Khan (Rudra Veena)"),
            1,
            "पंडित शिवकुमार शर्मा (1938-2022, जम्मू) ने कश्मीर के सूफियाना वाद्य 'संतूर' को तकनीकी नवाचारों द्वारा भारतीय शास्त्रीय संगीत के प्रमुख वाद्य के रूप में प्रतिष्ठित किया।",
            "Pandit Shivkumar Sharma was the undisputed pioneer who adapted and elevated the Kashmiri Santoor into classical perfection.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q10", "art_3",
            "विश्वविख्यात 'तबला' (Tabla) वादक उस्ताद जाकिर हुसैन किस महान तबला वादक के पुत्र हैं और वे किस घराने से संबंधित हैं?",
            "Ustad Zakir Hussain, recipient of the Padma Vibhushan (2023) and multiple Grammy Awards 2024 (including with Shakti), is the son of which legendary Punjab Gharana tabla maestro?",
            listOf("उस्ताद अल्ला रखा / कुरैशी अल्ला रखा खान (Ustad Alla Rakha - Punjab Gharana / Sitar-Tabla duets with Ravi Shankar)", "पंडित किशन महाराज", "उस्ताद अमीर हुसैन खान", "पंडित अनोखेलाल मिश्र"),
            listOf("Ustad Alla Rakha (Abbaji - Doyen of Punjab Gharana; rhythmic master who played with Ravi Shankar at Woodstock 1969)", "Pt. Kishan Maharaj (Banaras Gharana)", "Ustad Amir Hussain Khan", "Pt. Anokhelal Mishra"),
            1,
            "उस्ताद जाकिर हुसैन (जन्म: 1951, मुंबई) पंजाब घराने के महान उस्ताद अल्ला रखा के पुत्र हैं। फरवरी 2024 में उन्होंने 66वें ग्रैमी अवॉर्ड्स में एक ही रात में 3 ग्रैमी अवॉर्ड जीतकर इतिहास रचा।",
            "Ustad Zakir Hussain is universally hailed as one of the greatest percussion geniuses of modern world music.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q11", "art_3",
            "सरोद (Sarod) वाद्य यंत्र के विश्वविख्यात प्रतिपादक और 'ग्वालियर के उस्ताद अमजद अली खान' (Ustad Amjad Ali Khan) किस ऐतिहासिक घराने से संबंधित हैं?",
            "Sarod virtuoso Ustad Amjad Ali Khan, inventor of various new ragas and awarded the Padma Vibhushan in 2001, belongs to which historic lineage/Gharana?",
            listOf("किराना घराना", "सेनिया बंगश घराना / सेनिया घराना (Senia Bangash Gharana - Lineage traced to Tansen through Gwalior / Bangash Afghan Rabab)", "आगरा घराना", "पटियाला घराना"),
            listOf("Kirana Gharana", "Senia Bangash Gharana (Direct descendant of Ghulam Bandagi Khan Bangash who modified the Afghan Rabab into the modern Sarod)", "Agra Gharana", "Patiala Gharana"),
            1,
            "उस्ताद अमजद अली खान (ग्वालियर) सेनिया बंगश घराने के 6वीं पीढ़ी के सरोद वादक हैं। उनके पूर्वजों ने अफगान रबाब में स्टील की प्लेट और धातु के तार जोड़कर आधुनिक सरोद का आविष्कार किया था। उनके पुत्र अमान व अयान अली बंगश भी सरोद वादक हैं।",
            "Ustad Amjad Ali Khan has popularized the Sarod globally with his lyrical playing and seamless technical precision.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q12", "art_3",
            "कर्नाटक संगीत की महानतम गायिका जिन्हें 'कर्नाटक संगीत की रानी' कहा जाता है और जो 1998 में 'भारत रत्न' से सम्मानित होने वाली पहली संगीतकार बनीं?",
            "Who was the iconic Carnatic vocalist, celebrated as the 'Queen of Song', who became the first musician ever to be awarded India's highest civilian honor, the Bharat Ratna, in 1998?",
            listOf("डी. के. पट्टम्माल", "एम. एस. सुब्बुलक्ष्मी / मदुरै षण्मुखवदिवु सुब्बुलक्ष्मी (M. S. Subbulakshmi - 1916 to 2004 / Bharat Ratna 1998 / Ramon Magsaysay 1974)", "एम. एल. वसंतकुमारी", "बॉम्बे जयश्री"),
            listOf("D. K. Pattammal", "M. S. Subbulakshmi (Performed at UN General Assembly in 1966; renowned for Venkateswara Suprabhatam and Bhaja Govindam)", "M. L. Vasanthakumari", "Bombay Jayashri"),
            1,
            "एम. एस. सुब्बुलक्ष्मी (1916-2004, मदुरै) कर्नाटक संगीत की अद्वितीय साम्राज्ञी थीं। वे 1966 में संयुक्त राष्ट्र महासभा में गाने वाली पहली भारतीय थीं और 1974 में रेमन मैग्सेसे तथा 1998 में भारत रत्न पाने वाली पहली संगीतकार बनीं।",
            "M. S. Subbulakshmi was a legendary cultural icon whose celestial voice defined devotional and classical Carnatic music across the world.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q13", "art_3",
            "हिंदुस्तानी शास्त्रीय गायन के 'किराना घराना' (Kirana Gharana) के महानतम गायक जिन्हें 2008 में 'भारत रत्न' से सम्मानित किया गया था?",
            "Which sublime classical vocalist of the Kirana Gharana from Karnataka, celebrated for his soul-stirring 'Abhangs' and mastery over Khayal, was awarded the Bharat Ratna in 2008?",
            listOf("उस्ताद अमीर खान", "पंडित भीमसेन जोशी (Pt. Bhimsen Joshi - Kirana Gharana / 1922 to 2011 / Bharat Ratna 2008 / Sawai Gandharva Festival)", "पंडित जसराज (मेवाती)", "पंडित ओंकारनाथ ठाकुर"),
            listOf("Ustad Amir Khan", "Pandit Bhimsen Joshi (Trained under Sawai Gandharva; famous for devotional 'Santavani' and rendition of 'Mile Sur Mera Tumhara')", "Pt. Jasraj (Mewati Gharana)", "Pt. Omkarnath Thakur"),
            1,
            "पंडित भीमसेन जोशी (1922-2011, गदग, कर्नाटक) किराना घराने के शीर्ष गायक थे। उन्होंने उस्ताद अब्दुल करीम खान के शिष्य सवाई गंधर्व से तालीम ली। 2008 में उन्हें भारत रत्न प्रदान किया गया।",
            "Pandit Bhimsen Joshi was an intellectual and emotional giant of Hindustani classical vocal music whose voice moved millions.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q14", "art_3",
            "हिंदुस्तानी संगीत के सबसे पुराने और सबसे बड़े घराने 'ग्वालियर घराना' (Gwalior Gharana) की स्थापना का श्रेय किसे दिया जाता है?",
            "Which historic Gharana is recognized as the oldest Khayal Gharana in Hindustani classical music, founded during the 16th-18th century by Nathan Peer Baksh and Nathan Khan?",
            listOf("आगरा घराना", "ग्वालियर घराना (Gwalior Gharana - The mother of all Khayal Gharanas / Ustad Hassu Khan, Haddu Khan & Nathu Khan)", "जयपुर-अतरौली घराना", "पटियाला घराना"),
            listOf("Agra Gharana", "Gwalior Gharana (Noted for its simplicity, open-throated voice production, direct Bol-Taans, and Asthapadi singing)", "Jaipur-Atrauli Gharana", "Patiala Gharana"),
            1,
            "ग्वालियर घराना हिंदुस्तानी शास्त्रीय संगीत का सबसे प्राचीन घराना माना जाता है। नत्थन पीर बख्श तथा उनके पौत्रों हद्दू खान, हस्सू खान और नत्थू खान ने 19वीं सदी में ग्वालियर दरबार (सिंधिया संरक्षण) में इसे चरमोत्कर्ष पर पहुंचाया।",
            "The Gwalior Gharana is revered as the mother of all Hindustani vocal Gharanas, known for its pristine purity and expansive melodic architecture.",
            "Easy"
        ),
        makeArtCultureQ(
            "art_3_m1_q15", "art_3",
            "भारतीय शास्त्रीय संगीत में 'सारंगी' (Sarangi - सौ रंगों वाला वाद्य) को एकल शास्त्रीय वाद्य के रूप में प्रतिष्ठित करने वाले महान पद्म विभूषण वादक कौन हैं?",
            "Which maestro is credited with single-handedly elevating the bowed string instrument 'Sarangi' (literally 'a hundred colors') from accompaniment to solo concert acclaim?",
            listOf("उस्ताद बिस्मिल्लाह खान", "पंडित राम नारायण (Pt. Ram Narayan - Sarangi Maestro / Padma Vibhushan 2005 / International Soloist)", "उस्ताद सुल्तान खान", "उस्ताद सबरी खान"),
            listOf("Ustad Bismillah Khan", "Pandit Ram Narayan (Pioneered Sarangi solo concerts worldwide; first Sarangi player to win Padma Vibhushan in 2005)", "Ustad Sultan Khan", "Ustad Sabri Khan"),
            1,
            "पंडित राम नारायण (जन्म: 1927, उदयपुर) ने सारंगी को केवल गायकों की संगत करने वाले वाद्य से ऊपर उठाकर अंतरराष्ट्रीय एकल शास्त्रीय वाद्य का दर्जा दिलाया। 2005 में उन्हें पद्म विभूषण मिला।",
            "Pandit Ram Narayan transformed the traditional Sarangi into an internationally revered solo classical instrument.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + ArtCultureQuestionHelper.generateTopicMocks("art_3", 2, 5, baseQuestions)
    }
}
