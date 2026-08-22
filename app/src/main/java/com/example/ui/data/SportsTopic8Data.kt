package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic8Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_8_m1_q1", "spt_8",
            "कबड्डी (Kabaddi) मैच में मैदान का मानक आकार पुरुषों के लिए कितना होता है और प्रत्येक टीम में कितने सक्रिय खिलाड़ी मैदान पर खेलते हैं?",
            "What are the standard court dimensions for men's Kabaddi and how many active players participate on the court for each team simultaneously?",
            listOf("11 x 8 मीटर, 6 खिलाड़ी", "13 x 10 मीटर, 7 खिलाड़ी (13m x 10m court, 7 active players + 5 reserves)", "15 x 12 मीटर, 8 खिलाड़ी", "12 x 8 मीटर, 7 खिलाड़ी"),
            listOf("11 x 8 meters, 6 players", "13 x 10 meters, 7 active players on court (and 5 reserve substitutes)", "15 x 12 meters, 8 players", "12 x 8 meters, 7 players"),
            1,
            "पुरुष कबड्डी मैदान 13 × 10 मीटर (महिला/जूनियर: 12 × 8 मीटर) का होता है। प्रत्येक टीम में 12 खिलाड़ी होते हैं जिनमें से 7 खिलाड़ी कोर्ट में खेलते हैं और 5 स्थानापन्न (Reserves) होते हैं। मैच 20-20 मिनट के दो हिस्सों में खेला जाता है।",
            "Men's Kabaddi court measures 13m x 10m (women's 12m x 8m). Each team consists of 7 active players on court with up to 5 substitutes, playing two halves of 20 minutes each.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q2", "spt_8",
            "कबड्डी के खेल में जब किसी टीम के सभी खिलाड़ी आउट हो जाते हैं, तो विपक्षी टीम को कितने अतिरिक्त अंक दिए जाते हैं और इसे क्या कहा जाता है?",
            "In Kabaddi, when an entire opposing team is declared all-out, how many additional bonus points are awarded to the attacking team, and what is this term called?",
            listOf("1 अंक, सुपर रेड", "2 अंक, 'लोना' (Lona - 2 additional bonus points for getting opposing team all-out)", "3 अंक, बोनस पॉइंट", "4 अंक, ऑल-आउट बोनस"),
            listOf("1 point, Super Raid", "2 extra points, 'Lona' (awarded to the team that dismisses all players of opponent team)", "3 points, Bonus Point", "4 points, Grand Slam"),
            1,
            "जब एक टीम विपक्षी टीम के सभी खिलाड़ियों को आउट कर देती है, तो उसे 'लोना' (Lona) कहा जाता है और इसके लिए 2 अतिरिक्त अंक मिलते हैं, साथ ही विपक्षी टीम के सभी खिलाड़ी पुनः कोर्ट में आ जाते हैं।",
            "A 'Lona' occurs in Kabaddi when an entire team is dismissed. The opposing team receives 2 bonus points in addition to the points scored for eliminating the players.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q3", "spt_8",
            "खो-खो (Kho-Kho) खेल में मैदान का मानक आकार क्या होता है तथा चेज़र (Chaser) टीम के कितने खिलाड़ी वर्गों (Squares) में विपरीत दिशा में मुंह करके बैठते हैं?",
            "What are the standard ground dimensions of Kho-Kho and how many chasers sit in the central grid squares facing opposite directions?",
            listOf("24 x 14 मीटर, 7 चेज़र", "27 x 16 मीटर, 8 चेज़र (27m x 16m ground; 8 chasers sit in squares, 1 active chaser)", "30 x 18 मीटर, 9 चेज़र", "25 x 15 मीटर, 6 चेज़र"),
            listOf("24 x 14 meters, 7 chasers", "27 x 16 meters, 8 chasers sitting in grid squares + 1 active chaser chasing 3 defenders", "30 x 18 meters, 9 chasers", "25 x 15 meters, 6 chasers"),
            1,
            "खो-खो मैदान 27 × 16 मीटर का होता है। प्रत्येक टीम में 12 खिलाड़ी होते हैं (9 खेलने वाले + 3 अतिरिक्त)। 8 चेज़र केंद्रीय पट्टी के वर्गों में विपरीत दिशाओं में बैठते हैं और 1 सक्रिय चेज़र (Active Chaser) 3 धावकों (Defenders) का पीछा करता है।",
            "The standard Kho-Kho playing area is 27m x 16m. Eight chasers sit in the eight central squares facing alternate directions, while the ninth active chaser pursues three defenders.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q4", "spt_8",
            "प्राचीन भारतीय पारंपरिक जिम्नास्टिक खेल 'मलखंब' (Mallakhamb) को किस भारतीय राज्य ने अपना 'राज्य खेल' (State Sport) घोषित किया है?",
            "Which Indian state declared the traditional ancient aerial gymnastics sport 'Mallakhamb' (performed on a vertical wooden pole or rope) as its official State Sport in 2013?",
            listOf("महाराष्ट्र", "मध्य प्रदेश (Madhya Pradesh - Declared State Sport in 2013; Prabhash Joshi Award)", "राजस्थान", "गुजरात"),
            listOf("Maharashtra", "Madhya Pradesh (Declared official state sport in 2013; Prabhash Joshi Puraskar awarded for excellence)", "Rajasthan", "Gujarat"),
            1,
            "मध्य प्रदेश सरकार ने 2013 में 'मलखंब' को अपना राज्य खेल घोषित किया। मलखंब में खिलाड़ी एक ऊर्ध्वाधर सागौन/शीशम के खंभे, बेंत या लटकती रस्सी पर जटिल योग और जिम्नास्टिक मुद्राओं का प्रदर्शन करते हैं। मध्य प्रदेश इसके लिए 'प्रभाष जोशी पुरस्कार' देता है।",
            "Mallakhamb was declared the official State Sport of Madhya Pradesh in 2013. Practitioners perform dynamic aerial yoga postures on a polished wooden pole, hanging pole, or rope.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q5", "spt_8",
            "विश्व की सबसे पुरानी और वैज्ञानिक मार्शल आर्ट में से एक 'कलारिपयाट्टू' (Kalaripayattu) की उत्पत्ति किस भारतीय राज्य से मानी जाती है?",
            "Widely regarded as the 'Mother of all Martial Arts' dating back over 3,000 years, 'Kalaripayattu' originated in which Indian state?",
            listOf("तमिलनाडु", "केरल (Kerala - Ancient Indian martial art practiced in a Kalari arena)", "कर्नाटक", "ओडिशा"),
            listOf("Tamil Nadu", "Kerala (Ancient martial art featuring strikes, kicks, weaponry like Urumi, and Marmam pressure point therapy)", "Karnataka", "Odisha"),
            1,
            "कलारिपयाट्टू की उत्पत्ति केरल में हुई थी। इसके प्रवर्तक भगवान परशुराम माने जाते हैं। इसमें खाली हाथ की तकनीकों के साथ-साथ 'उरुमी' (लचीली तलवार), लाठी, कटार और मर्म चिकित्सा (Marmam) का अभ्यास 'कलारी' नामक अखाड़े में कराया जाता है।",
            "Kalaripayattu is an Indian martial art that originated in Kerala during the 3rd century BCE to 2nd century CE, incorporating strikes, kicks, grappling, and traditional flexible sword weaponry.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q6", "spt_8",
            "सिख गुरुओं और निहंग योद्धाओं द्वारा विकसित पारंपरिक हथियार-आधारित युद्ध कला 'गटका' (Gatka) मुख्य रूप से किस राज्य/समुदाय से जुड़ी है?",
            "Rooted in Sikh history and practiced with wooden sticks (soti) and shields (fari), the traditional martial art 'Gatka' is primarily associated with which state?",
            listOf("हरियाणा", "पंजाब (Punjab - Traditional Sikh martial art associated with Nihang Singhs)", "राजस्थान", "उत्तराखंड"),
            listOf("Haryana", "Punjab (Sikh martial art introduced during the era of Guru Hargobind Ji and Guru Gobind Singh Ji)", "Rajasthan", "Uttarakhand"),
            1,
            "गटका (Gatka) पंजाब की पारंपरिक सिख युद्ध कला है जिसे छठे सिख गुरु, गुरु हरगोबिंद जी और 10वें गुरु, गुरु गोबिंद सिंह जी के समय विकसित किया गया। इसमें लकड़ी की छड़ी (सोती), ढाल (फरी), तलवार और कृपाण का उपयोग होता है।",
            "Gatka is a traditional martial art associated with the Sikhs of Punjab, involving sword and stick fighting skills developed under the Sikh Gurus.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q7", "spt_8",
            "मणिपुर की प्रसिद्ध पारंपरिक मार्शल आर्ट जिसमें 'तलवार' (Thang) और 'भाले' (Ta) का कौशल प्रदर्शन किया जाता है, किस नाम से जानी जाती है?",
            "Which indigenous armed martial art form of Manipur, historically known as 'Huyen Langlon', features combat techniques with a sword (Thang) and a spear (Ta)?",
            listOf("सिलंबम", "थांग-ता (Thang-Ta / Huyen Langlon, Manipur)", "मर्दानी खेल", "पैका अखाड़ा"),
            listOf("Silambam", "Thang-Ta (Manipur - Traditional martial art involving Thang [sword] and Ta [spear])", "Mardani Khel", "Paika Akhada"),
            1,
            "थांग-ता (Thang-Ta) मणिपुर की मैतेई (Meitei) समुदाय की प्राचीन मार्शल आर्ट 'हुयेन लांगलोन' (Huyen Langlon) का सशस्त्र अंग है। इसमें 'थांग' का अर्थ तलवार और 'ता' का अर्थ भाला होता है। इसे खेलो इंडिया यूथ गेम्स में शामिल किया गया है।",
            "Thang-Ta is the traditional armed combat system of Manipur (part of Huyen Langlon), where 'Thang' refers to sword and 'Ta' refers to spear.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q8", "spt_8",
            "तमिलनाडु की प्राचीन लाठी-आधारित मार्शल आर्ट जिसमें 1.68 मीटर (5.5 फीट) की लचीली बांस की छड़ी का उपयोग किया जाता है, क्या कहलाती है?",
            "Which ancient weapon-based martial art of Tamil Nadu, mentioned in Sangam literature, utilizes a long flexible bamboo staff as its primary training weapon?",
            listOf("कलारिपयाट्टू", "सिलंबम (Silambam, Tamil Nadu - Bamboo staff martial art)", "वर्मकलै", "गटका"),
            listOf("Kalaripayattu", "Silambam (Tamil Nadu - Ancient martial art employing a 5.5-foot bamboo staff, originated during Pandya dynasty)", "Varma Kalai", "Gatka"),
            1,
            "सिलंबम (Silambam) तमिलनाडु की प्राचीनतम मार्शल आर्ट्स में से एक है। इसका उल्लेख संगम साहित्य (जैसे सिलप्पादिकारम) में मिलता है। इसमें बांस की लाठी (सिलंबम), सुरुल वल (लचीली तलवार) और सेडु कुच्ची का उपयोग होता है।",
            "Silambam is an ancient martial art originating from Tamil Nadu that focuses on staff fencing using bamboo poles, having roots dating back to the Sangam era.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q9", "spt_8",
            "केरल में ओणम उत्सव के दौरान पुन्नमदा झील (अलप्पुझा) में आयोजित होने वाली प्रसिद्ध सर्प नौका दौड़ (Snake Boat Race) किस प्रतिष्ठित ट्रॉफी के लिए लड़ी जाती है?",
            "Held annually on the second Saturday of August in Punnamada Lake, Alappuzha (Kerala), the famous Vallam Kali snake boat race is held for which prestigious silver trophy?",
            listOf("गांधी ट्रॉफी", "नेहरू ट्रॉफी बोट रेस (Nehru Trophy Boat Race - Chundan Vallam snake boats, Punnamada Lake)", "वल्लभभाई पटेल कप", "इंदिरा गांधी नौका कप"),
            listOf("Gandhi Trophy", "Nehru Trophy Boat Race (Instituted in 1952 after Jawaharlal Nehru visited Alappuzha; contested by Chundan Vallams)", "Vallabhbhai Patel Cup", "Indira Gandhi Boat Cup"),
            1,
            "नेहरू ट्रॉफी बोट रेस (Nehru Trophy) केरल के अलप्पुझा में पुन्नमदा झील में ओणम के दौरान आयोजित की जाती है। 1952 में पंडित जवाहरलाल नेहरू के दौरे के बाद इसकी शुरुआत हुई। इसमें 100-120 नाविकों वाली 100+ फीट लंबी 'चुंदन वल्लम' (सर्प नौकाएं) भाग लेती हैं।",
            "The Nehru Trophy Boat Race is a premier Vallam Kali held in Punnamada Lake near Alappuzha, Kerala, featuring majestic 100-120 oarsmen Chundan Vallams (snake boats).",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q10", "spt_8",
            "तमिलनाडु में पोंगल और मट्टू पोंगल पर्व के अवसर पर आयोजित होने वाला बैलों को वश में करने का प्राचीन पारंपरिक खेल कौन-सा है?",
            "Celebrated during the Mattu Pongal festival in Tamil Nadu (especially in Alanganallur and Palamedu), which traditional bull-taming sport involves participants embracing the hump of a charging bull?",
            listOf("कंबाला", "जल्लीकट्टू (Jallikattu / Eru Thazhuvuthal - Tamil Nadu bull-embracing sport)", "बुल फाइट स्पेन", "खोंग कांगजेई"),
            listOf("Kambala", "Jallikattu (Eru Thazhuvuthal - Ancient Tamil sport where players hold onto the hump of indigenous Pulikulam/Kangayam bulls)", "Spanish Corrida", "Khong Kangjei"),
            1,
            "जल्लीकट्टू (एरूतझुवुदल) तमिलनाडु का 2,000+ वर्ष पुराना पारंपरिक खेल है जो पोंगल (जनवरी) के दौरान अलंगनाल्लूर, पालमेडु और अवनियापुरम में आयोजित होता है। इसमें युवक देशी सांडों (जैसे पुलिकुलम नस्ल) के कूबड़ (Hump) को पकड़कर रोकने का प्रयास करते हैं।",
            "Jallikattu is a traditional bull-taming event held in Tamil Nadu as part of Pongal celebrations, where participants attempt to hold onto the bull's hump for a specified distance or time.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q11", "spt_8",
            "कर्नाटक के तटीय जिलों (उडुपी और दक्षिण कन्नड़) में कीचड़ भरे धान के खेतों में आयोजित होने वाली पारंपरिक 'भैंसा दौड़' (Buffalo Race) को क्या कहा जाता है?",
            "Conducted in wet slushy paddy fields across coastal Karnataka from November to March, which traditional annual buffalo racing sport is sponsored by local Tuluva households?",
            listOf("जल्लीकट्टू", "कंबाला (Kambala - Coastal Karnataka traditional buffalo race / Jockey runs alongside pair of buffaloes)", "मारमडी", "कोडी पंडेम"),
            listOf("Jallikattu", "Kambala (Annual buffalo race festival in Dakshina Kannada and Udupi districts of Karnataka)", "Maramadi", "Kodi Pandem"),
            1,
            "कंबाला (Kambala) तटीय कर्नाटक (तुलुनाडु) का प्रसिद्ध खेल है जिसमें धावक (Jockey) दो सधे हुए भैंसों की जोड़ी को कीचड़ भरे समानांतर ट्रैक पर दौड़ाता है। कंबाला धावक श्रीनिवास गौड़ा अपनी असाधारण गति के लिए राष्ट्रीय स्तर पर प्रसिद्ध हुए।",
            "Kambala is an annual buffalo race held in the southwestern Indian state of Karnataka, where farmers race a pair of buffaloes tied to a plough through muddy slush tracks.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q12", "spt_8",
            "आधुनिक खेल 'पोलो' (Polo) की उत्पत्ति भारत के किस पूर्वोत्तर राज्य के पारंपरिक अश्व-खेल 'सगोल कांगजेई' (Sagol Kangjei) से मानी जाती है?",
            "Modern equestrian polo evolved from the traditional pony-borne game 'Sagol Kangjei' played in which northeastern Indian state, home to the world's oldest polo ground at Imphal?",
            listOf("असम", "मणिपुर (Manipur - Birthplace of modern polo / Sagol Kangjei & Imphal Polo Ground)", "मेघालय", "नागालैंड"),
            listOf("Assam", "Manipur (Origin of modern polo derived from Sagol Kangjei; Imphal Polo Ground founded in 1859)", "Meghalaya", "Nagaland"),
            1,
            "आधुनिक पोलो की उत्पत्ति मणिपुर के पारंपरिक खेल 'सगोल कांगजेई' (Sagol Kangjei) से हुई। 1859 में ब्रिटिश अधिकारियों ने सिलचर में पहला क्लब बनाया। इंफाल का 'कांगजेइबुंग' (Imphal Polo Ground) दुनिया का सबसे पुराना पोलो मैदान है।",
            "Modern polo originates from Sagol Kangjei, an ancient sport played in Manipur on Manipuri ponies. The Imphal Polo Ground is recognized as the world's oldest operational polo ground.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q13", "spt_8",
            "महाराष्ट्र की पारंपरिक हथियार-आधारित युद्ध कला जिसमें पट्टा (दंड-तलवार), तलवार, ढाल और भाले का उपयोग किया जाता है और जिसे छत्रपति शिवाजी महाराज की सेना अपनाती थी, क्या कहलाती है?",
            "Which traditional armed martial art of Maharashtra, popularized by Maratha warriors under Chhatrapati Shivaji Maharaj, employs the Patta (gauntlet sword), talwar, and lathi?",
            listOf("गटका", "मर्दानी खेल (Mardani Khel, Maharashtra - Maratha martial art using Patta & Talwar)", "सिलंबम", "कलारिपयाट्टू"),
            listOf("Gatka", "Mardani Khel (Maharashtra - Weapon-centric martial art known for swift footwork, Patta sword and shield combat)", "Silambam", "Kalaripayattu"),
            1,
            "मर्दानी खेल (Mardani Khel) महाराष्ट्र (मुख्य रूप से कोल्हापुर) की पारंपरिक मराठा युद्ध कला है। यह छत्रपति शिवाजी महाराज की सेना द्वारा गुरिल्ला युद्ध (गनिमी कावा) में प्रयुक्त की जाती थी। इसमें 'पट्टा' (दस्ताने जैसी तलवार) इसका मुख्य हथियार है।",
            "Mardani Khel is an armed martial art from Maharashtra, heavily practiced during the Maratha Empire, emphasizing dexterity with the flexible Patta sword and shields.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q14", "spt_8",
            "भारतीय पारंपरिक कुश्ती (Pehlwani / Malla-Yuddha) में लाल मिट्टी के अखाड़े में सबसे प्रतिष्ठित राष्ट्रीय खिताब 'भारत केसरी' और 'रुस्तम-ए-हिंद' किस खेल से संबंधित हैं?",
            "In traditional Indian clay-pit wrestling (Pehlwani/Kushti), prestigious titles such as 'Bharat Kesari' and 'Rustam-e-Hind' are awarded to supreme champions in which sport?",
            listOf("कबड्डी", "कुश्ती / दंगल (Kushti / Pehlwani / Indian Clay Wrestling in Akhadas)", "मुक्केबाजी", "मलखंब"),
            listOf("Kabaddi", "Wrestling / Kushti (Traditional Indian dirt pit wrestling practiced in Akhadas under Ustads/Gurus)", "Boxing", "Mallakhamb"),
            1,
            "कुश्ती (पहलवानी) भारत का सबसे प्राचीन पारंपरिक मुकाबला खेल है जिसका उल्लेख 'मल्ल-युद्ध' के रूप में महाभारत में मिलता है। अखाड़ों में मिट्टी के गड्ढे (Matti Akhada) पर लड़ी जाने वाली कुश्ती में 'रुस्तम-ए-हिंद' (गामा पहलवान, दारा सिंह) और 'भारत केसरी' सर्वोच्च खिताब हैं।",
            "Kushti (Indian wrestling) is a traditional combat sport practiced on red clay in Akhadas. Legendary champions like The Great Gama and Dara Singh held the supreme 'Rustam-e-Hind' title.",
            "Easy"
        ),
        makeSportsQ(
            "spt_8_m1_q15", "spt_8",
            "भारत सरकार के युवा मामले एवं खेल मंत्रालय द्वारा 2014 में शुरू की गई 'प्रो कबड्डी लीग' (PKL) के पहले संस्करण (2014) की विजेता कौन-सी फ्रेंचाइजी टीम बनी थी?",
            "Inaugurated in 2014, which franchise team won the inaugural season title of the Pro Kabaddi League (PKL Season 1)?",
            listOf("यू मुंबा", "जयपुर पिंक पैंथर्स (Jaipur Pink Panthers - Defeated U Mumba in PKL 2014 final)", "पटना पाइरेट्स", "बेंगलुरु बुल्स"),
            listOf("U Mumba", "Jaipur Pink Panthers (Owned by Abhishek Bachchan; defeated U Mumba 35-24 in the 2014 final)", "Patna Pirates", "Bengaluru Bulls"),
            1,
            "प्रो कबड्डी लीग (PKL) का पहला सीजन 2014 में 'जयपुर पिंक पैंथर्स' ने यू मुंबा को 35-24 से हराकर जीता था। पटना पाइरेट्स पीकेएल के इतिहास की सबसे सफल टीम है जिसने लगातार 3 खिताब (सीजन 3, 4, 5) जीते हैं।",
            "The inaugural Pro Kabaddi League (PKL) in 2014 was won by the Jaipur Pink Panthers. PKL dramatically transformed the popularity and professionalism of Kabaddi globally.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_8", 2, 5, baseQuestions)
    }
}
