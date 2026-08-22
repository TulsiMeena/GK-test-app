package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic9Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_9_m1_q1", "spt_9",
            "1988 में भारत के पहले शतरंज ग्रैंडमास्टर (First Chess Grandmaster of India) बनने वाले और 5 बार विश्व शतरंज चैंपियन रहे महान खिलाड़ी कौन हैं?",
            "Who became India's first-ever Chess Grandmaster in 1988, won the World Chess Championship 5 times, and was the first recipient of the Rajiv Gandhi Khel Ratna Award in 1991-92?",
            listOf("पेंटाला हरिकृष्णा", "विश्वनाथन आनंद (Viswanathan Anand - 'Tiger of Madras', 5-time World Champion: 2000, 2007, 2008, 2010, 2012)", "डी. गुकेश", "आर. प्रज्ञानानंदा"),
            listOf("Pentala Harikrishna", "Viswanathan Anand (First Indian GM in 1988; 5-time World Chess Champion; 1st Khel Ratna awardee)", "D. Gukesh", "R. Praggnanandhaa"),
            1,
            "विश्वनाथन आनंद 1988 में भारत के पहले ग्रैंडमास्टर बने। उन्होंने 5 बार विश्व शतरंज चैंपियनशिप (2000, 2007, 2008, 2010, 2012) जीती। वे 1991-92 में भारत के सर्वोच्च खेल सम्मान 'खेल रत्न' के पहले विजेता थे।",
            "Viswanathan Anand is an Indian chess grandmaster and five-time world chess champion, widely regarded as one of the greatest chess players in history.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q2", "spt_9",
            "अप्रैल 2024 में 17 वर्ष की आयु में टोरंटो में 'FIDE कैंडिडेट्स टूर्नामेंट' जीतकर विश्व शतरंज चैंपियनशिप के सबसे युवा चैलेंजर बनने वाले भारतीय ग्रैंडमास्टर कौन हैं?",
            "In April 2024, which 17-year-old Indian Grandmaster made history by winning the FIDE Candidates Tournament in Toronto to become the youngest World Chess Championship challenger ever?",
            listOf("आर. प्रज्ञानानंदा", "डोम्माराजू गुकेश (D. Gukesh - Youngest Candidates winner at 17 years old)", "विदित गुजराती", "अर्जुन एरिगैसी"),
            listOf("R. Praggnanandhaa", "Dommaraju Gukesh (D. Gukesh - Youngest player ever to qualify to challenge Ding Liren for the World Championship crown)", "Vidit Gujrathi", "Arjun Erigaisi"),
            1,
            "डी. गुकेश (तमिलनाडु) ने 17 साल की उम्र में टोरंटो में कैंडिडेट्स 2024 जीतकर गैरी कास्पारोव (20 वर्ष) का 40 साल पुराना रिकॉर्ड तोड़ा और विश्व चैंपियनशिप खिताब के सबसे युवा दावेदार बने।",
            "Dommaraju Gukesh (D. Gukesh) won the 2024 Candidates Tournament at age 17, becoming the youngest-ever challenger for the undisputed World Chess Championship.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q3", "spt_9",
            "टोक्यो 2020 ओलंपिक और बुडापेस्ट 2023 विश्व एथलेटिक्स चैंपियनशिप में पुरुषों की भाला फेंक (Javelin Throw) स्पर्धा में स्वर्ण पदक जीतने वाले भारतीय एथलीट कौन हैं?",
            "Who created history by winning India's first Olympic track-and-field Gold medal at Tokyo 2020 (87.58m) and World Championship Gold at Budapest 2023 (88.17m)?",
            listOf("शिवपाल सिंह", "नीरज चोपड़ा (Neeraj Chopra - Olympic Gold Tokyo 2020, Olympic Silver Paris 2024, World Champion 2023, Diamond League Trophy)", "देवेंद्र झाझरिया", "किशोर जेना"),
            listOf("Shivpal Singh", "Neeraj Chopra (First Indian track-and-field Olympic Gold medalist, World Champion, Diamond League Champion)", "Devendra Jhajharia", "Kishore Jena"),
            1,
            "नीरज चोपड़ा (पानीपत, हरियाणा) ने टोक्यो 2020 ओलंपिक में 87.58 मीटर भाला फेंककर एथलेटिक्स में भारत का पहला ऐतिहासिक व्यक्तिगत स्वर्ण जीता। उन्होंने पेरिस 2024 में रजत (89.45 मी), 2023 विश्व चैंपियनशिप में स्वर्ण तथा डायमंड लीग ट्रॉफी जीती।",
            "Neeraj Chopra is an Indian track and field athlete who won the Olympic Gold medal in Javelin Throw at Tokyo 2020 and Silver at Paris 2024, and World Championship Gold in 2023.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q4", "spt_9",
            "100 मीटर (9.58 सेकंड) और 200 मीटर (19.19 सेकंड) दौड़ में विश्व रिकॉर्ड धारक तथा 8 बार के ओलंपिक स्वर्ण पदक विजेता 'लाइटनिंग बोल्ट' किस देश के धावक हैं?",
            "Holding the untouchable world records for both 100 meters (9.58 seconds) and 200 meters (19.19 seconds) set at Berlin 2009, Usain Bolt represented which Caribbean country?",
            listOf("त्रिनिदाद और टोबैगो", "जमैका (Jamaica - Usain Bolt, 8 Olympic Golds & 11 World Championship Golds)", "बहामास", "क्यूबा"),
            listOf("Trinidad and Tobago", "Jamaica (Usain Bolt - 'Lightning Bolt', widely considered the fastest human in history)", "Bahamas", "Cuba"),
            1,
            "उसेन बोल्ट (जमैका) ने 2009 बर्लिन विश्व चैंपियनशिप में 100 मी (9.58 से) और 200 मी (19.19 से) का ऐतिहासिक विश्व रिकॉर्ड बनाया। उन्होंने 2008, 2012 और 2016 ओलंपिक में लगातार 100 मी और 200 मी का स्वर्ण 'ट्रिपल-डबल' हासिल किया।",
            "Usain Bolt is a retired Jamaican sprinter, an eight-time Olympic gold medalist, and the world record holder in the 100m, 200m, and 4x100m relay.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q5", "spt_9",
            "'फ्लाइंग सिख' (The Flying Sikh) के नाम से प्रसिद्ध किस महान भारतीय धावक ने 1958 राष्ट्रमंडल खेलों (कार्डिफ) में 440 गज दौड़ में स्वतंत्र भारत का पहला स्वर्ण पदक जीता था?",
            "Known as the 'Flying Sikh', which legendary Indian sprinter won India's first individual Commonwealth Games Gold in 1958 (Cardiff) and finished 4th in the 400m at the 1960 Rome Olympics?",
            listOf("गुरबचन सिंह रंधावा", "मिल्खा सिंह (Milkha Singh - 'The Flying Sikh', 1958 Cardiff Gold, 4 Asian Games Golds)", "श्रीराम सिंह", "माखन सिंह"),
            listOf("Gurbachan Singh Randhawa", "Milkha Singh ('The Flying Sikh' - Won gold at 1958 Commonwealth Games, four Asian Games golds, 400m Rome 1960 photo-finish)", "Sriram Singh", "Makhan Singh"),
            1,
            "मिल्खा सिंह को पाकिस्तान के राष्ट्रपति अयूब खान ने 1960 में 'द फ्लाइंग सिख' की उपाधि दी थी। उन्होंने 1958 कार्डिफ राष्ट्रमंडल खेलों में स्वर्ण और 1958 व 1962 एशियाई खेलों में 4 स्वर्ण पदक जीते। 1960 रोम ओलंपिक की 400 मीटर दौड़ में वे 45.73 सेकंड के साथ चौथे स्थान पर रहे।",
            "Milkha Singh, also known as The Flying Sikh, was an Indian track and field sprinter who introduced Indian athletics to the international podium.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q6", "spt_9",
            "1984 के लॉस एंजिल्स ओलंपिक में महिलाओं की 400 मीटर बाधा दौड़ (400m Hurdles) के फाइनल में सेकंड के 1/100वें हिस्से से कांस्य पदक से चूकने वाली 'पय्योली एक्सप्रेस' कौन हैं?",
            "Affectionately nicknamed the 'Payyoli Express' and currently President of the Indian Olympic Association (IOA), which legend missed an Olympic bronze in 400m hurdles by 0.01 seconds at Los Angeles 1984?",
            listOf("शाइनी विल्सन", "पी. टी. उषा (P. T. Usha - 'Payyoli Express', 'Queen of Indian Track & Field', IOA President)", "के. एम. बीनामोल", "द्यूती चंद"),
            listOf("Shiny Wilson", "P. T. Usha ('Payyoli Express' - Won 4 Golds & 1 Silver at 1986 Seoul Asian Games; IOA President)", "K. M. Beenamol", "Dutee Chand"),
            1,
            "पी. टी. उषा (केरल) ने 1984 लॉस एंजिल्स ओलंपिक में 400 मी बाधा दौड़ 55.42 सेकंड में पूरी कर चौथा स्थान प्राप्त किया। उन्होंने 1986 सियोल एशियाई खेलों में 4 स्वर्ण व 1 रजत जीतकर इतिहास रचा। वे भारतीय ओलंपिक संघ (IOA) की पहली महिला अध्यक्ष हैं।",
            "P. T. Usha is a retired Indian track and field athlete and current President of the Indian Olympic Association, famous for dominating Asian sprinting in the 1980s.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q7", "spt_9",
            "2008 के बीजिंग ओलंपिक में पुरुषों की 10 मीटर एयर राइफल स्पर्धा में स्वर्ण पदक जीतकर व्यक्तिगत ओलंपिक स्वर्ण जीतने वाले पहले भारतीय कौन बने थे?",
            "At the Beijing 2008 Olympic Games, who became the first Indian in history to win an individual Olympic Gold medal in the Men's 10m Air Rifle event?",
            listOf("राज्यवर्धन सिंह राठौड़", "अभिनव बिंद्रा (Abhinav Bindra - First individual Olympic Gold for India, Beijing 2008 10m Air Rifle)", "गगन नारंग", "जीतू राय"),
            listOf("Rajyavardhan Singh Rathore", "Abhinav Bindra (Shooting sensation who shot a near-perfect 10.8 on final shot to clinch Beijing 2008 Gold)", "Gagan Narang", "Jitu Rai"),
            1,
            "अभिनव बिंद्रा (देहरादून/पंजाब) ने 11 अगस्त 2008 को बीजिंग ओलंपिक में 10 मीटर एयर राइफल में कुल 700.5 स्कोर के साथ स्वर्ण पदक जीता। वे ओलंपिक में व्यक्तिगत स्वर्ण पदक जीतने वाले भारत के पहले एथलीट बने।",
            "Abhinav Bindra is an Indian Olympic shooter and businessman who won India's first individual Olympic gold medal in the 10m Air Rifle event at the 2008 Beijing Olympics.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q8", "spt_9",
            "पेरिस ओलंपिक 2024 में एक ही ओलंपिक खेलों के संस्करण में दो कांस्य पदक जीतकर स्वतंत्रता के बाद ऐसा करने वाली पहली भारतीय एथलीट कौन बनीं?",
            "At the Paris 2024 Olympics, which shooting sensation became the first athlete from independent India to win two medals at a single edition of the Olympic Games?",
            listOf("अपूर्वी चंदेला", "मनु भाकर (Manu Bhaker - Bronze in Women's 10m Air Pistol & Mixed Team 10m Air Pistol with Sarabjot Singh at Paris 2024)", "सिफत कौर सामरा", "अवनी लेखरा"),
            listOf("Apurvi Chandela", "Manu Bhaker (Won 10m Air Pistol individual bronze and 10m Air Pistol mixed team bronze with Sarabjot Singh)", "Sift Kaur Samra", "Avani Lekhara"),
            1,
            "मनु भाकर (झज्जर, हरियाणा) ने पेरिस 2024 ओलंपिक में महिलाओं की 10 मीटर एयर पिस्टल में कांस्य पदक जीता और फिर सरबजोत सिंह के साथ 10 मीटर एयर पिस्टल मिक्स्ड टीम स्पर्धा में दूसरा कांस्य पदक जीतकर इतिहास रच दिया।",
            "Manu Bhaker is an Indian sport shooter who created history at Paris 2024 by becoming the first Indian post-independence to win two Olympic medals in a single Olympic Games.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q9", "spt_9",
            "फॉर्मूला वन (Formula 1) रेसिंग के इतिहास में संयुक्त रूप से सर्वाधिक 7 बार विश्व ड्राइवर्स चैंपियनशिप (World Drivers' Championships) का खिताब किन दो ड्राइवरों ने जीता है?",
            "In the history of Formula 1, which two legendary racing drivers jointly hold the record for the most World Drivers' Championship titles with 7 titles each?",
            listOf("आयर्टन सेना और एलेन प्रोस्ट", "माइकल शूमाकर और लुईस हैमिल्टन (Michael Schumacher - Ferrari/Benetton & Lewis Hamilton - Mercedes/McLaren)", "मैक्स वर्स्टापेन और सेबेस्टियन वेटेल", "फर्नांडो अलोंसो और जैकी स्टीवर्ट"),
            listOf("Ayrton Senna & Alain Prost", "Michael Schumacher (1994, 1995, 2000-2004) & Lewis Hamilton (2008, 2014, 2015, 2017-2020) - 7 titles each", "Max Verstappen & Sebastian Vettel", "Fernando Alonso & Jackie Stewart"),
            1,
            "माइकल शूमाकर (जर्मनी - 7 खिताब) और सर लुईस हैमिल्टन (ब्रिटेन - 7 खिताब) संयुक्त रूप से सर्वाधिक F1 विश्व चैंपियनशिप जीतने वाले ड्राइवर हैं। लुईस हैमिल्टन के पास सर्वाधिक 103+ ग्रां प्री रेस जीतने का विश्व रिकॉर्ड भी है।",
            "Michael Schumacher and Lewis Hamilton share the record for the most Formula One World Drivers' Championships, having won seven titles each.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q10", "spt_9",
            "भारत में आयोजित होने वाली पहली फॉर्मूला वन इंडियन ग्रां प्री (2011-2013) किस विश्वस्तरीय रेसिंग सर्किट पर आयोजित की गई थी?",
            "Held between 2011 and 2013, which racing circuit located in Greater Noida (Uttar Pradesh) hosted the Formula One Indian Grand Prix?",
            listOf("मद्रास मोटर रेस ट्रैक", "बुद्ध इंटरनेशनल सर्किट (Buddh International Circuit - BIC, Greater Noida, designed by Hermann Tilke)", "कारी मोटर स्पीडवे", "हैदराबाद स्ट्रीट सर्किट"),
            listOf("Madras Motor Race Track", "Buddh International Circuit (BIC, Greater Noida - 5.125 km FIA Grade 1 circuit, won by Sebastian Vettel 3 times)", "Kari Motor Speedway", "Hyderabad Street Circuit"),
            1,
            "बुद्ध इंटरनेशनल सर्किट (ग्रेटर नोएडा, उत्तर प्रदेश) 5.125 किमी लंबा एफआईए ग्रेड-1 रेसिंग ट्रैक है। 2011, 2012 और 2013 की तीनों इंडियन ग्रां प्री रेड बुल रेसिंग के जर्मन ड्राइवर सेबेस्टियन वेटेल ने जीती थीं।",
            "The Buddh International Circuit in Greater Noida, Uttar Pradesh, hosted the Formula One Indian Grand Prix from 2011 to 2013, with Sebastian Vettel winning all three editions.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q11", "spt_9",
            "बिलियर्ड्स और स्नूकर (Cue Sports) में 27 से अधिक बार विश्व चैंपियनशिप का खिताब जीतने वाले भारत के सबसे सफल क्यू स्पोर्ट्स खिलाड़ी कौन हैं?",
            "With over 27 IBSF World Billiards and Snooker Championship titles across formats, who is India's most decorated cueist and recipient of the Major Dhyan Chand Khel Ratna, Padma Bhushan, and Padma Shri?",
            listOf("गीत सेठी", "पंकज आडवाणी (Pankaj Advani - 'The Prince of India', 27+ World Titles in Billiards & Snooker)", "माइकल फरेरा", "यासीन मर्चेंट"),
            listOf("Geet Sethi", "Pankaj Advani (Master cueist with 27 World Titles; only player to win world titles in both long and short formats of snooker and billiards)", "Michael Ferreira", "Yasin Merchant"),
            1,
            "पंकज आडवाणी (पुणे/बेंगलुरु) ने आईबीएसएफ विश्व बिलियर्ड्स और स्नूकर में 27 से अधिक विश्व खिताब जीते हैं। वे बिलियर्ड्स और स्नूकर दोनों के सभी प्रारूपों (प्वाइंट्स व टाइम फॉर्मेट) में ग्रैंड स्लैम जीतने वाले एकमात्र खिलाड़ी हैं।",
            "Pankaj Advani is an Indian billiards and snooker player who has won 27 World Championships, holding the record for the most world titles by an Indian in any sport.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q12", "spt_9",
            "तीरंदाजी (Archery) में विश्व नंबर 1 रैंकिंग हासिल करने वाली और एशियाई खेल 2022 (हांग्जो) में 3 स्वर्ण पदक जीतने वाली भारतीय महिला कंपाउंड तीरंदाज कौन हैं?",
            "Who won a historic hat-trick of 3 Gold medals at the Hangzhou 2022 Asian Games (Individual, Women's Team, Mixed Team) in compound archery for India?",
            listOf("दीपिका कुमारी", "ज्योति सुरेखा वेन्नम (Jyothi Surekha Vennam - 3 Golds at Hangzhou Asian Games 2022 & World Archery Champion)", "अंकिता भकत", "डोला बनर्जी"),
            listOf("Deepika Kumari", "Jyothi Surekha Vennam (Compound archery ace from Vijayawada who swept all 3 gold medals at 2022 Asian Games)", "Ankita Bhakat", "Dola Banerjee"),
            1,
            "ज्योति सुरेखा वेन्नम (विजयवाड़ा, आंध्र प्रदेश) ने 2022 एशियाई खेलों (हांग्जो) में महिला व्यक्तिगत, महिला टीम और मिश्रित टीम (ओजस देवताले के साथ) तीनों स्पर्धाओं में 3 स्वर्ण पदक जीतकर अभूतपूर्व कीर्तिमान बनाया।",
            "Jyothi Surekha Vennam is an Indian compound archer who achieved a rare clean sweep of three Gold medals at the 2022 Asian Games in Hangzhou.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q13", "spt_9",
            "शतरंज के बिसात (Chessboard) में कुल कितने वर्ग (Squares / Houses) होते हैं और दोनों खिलाड़ियों के पास कुल कितने मोहरे (Pieces & Pawns) होते हैं?",
            "How many total squares (light and dark) are on a standard regulation chessboard, and how many total pieces (including pawns) are on the board at the start of a match?",
            listOf("36 वर्ग, 24 मोहरे", "64 वर्ग (8x8 ग्रिड), 32 मोहरे (16 सफेद + 16 काले) - 64 squares, 32 total chess pieces", "100 वर्ग, 40 मोहरे", "81 वर्ग, 36 मोहरे"),
            listOf("36 squares, 24 pieces", "64 squares (8 ranks x 8 files), 32 pieces in total (16 white and 16 black pieces/pawns)", "100 squares, 40 pieces", "81 squares, 36 pieces"),
            1,
            "शतरंज के बोर्ड में 8×8 का ग्रिड होता है जिसमें कुल 64 वर्ग (32 हल्के/सफेद और 32 गहरे/काले) होते हैं। शुरुआत में प्रत्येक खिलाड़ी के पास 1 राजा, 1 रानी, 2 हाथी (Rooks), 2 घोड़े (Knights), 2 ऊंट (Bishops) और 8 प्यादे (Pawns) मिलाकर 16 मोहरे होते हैं (कुल 32)।",
            "A standard chessboard consists of 64 alternating black and white squares in an 8x8 grid. Each player begins with 16 pieces: 1 king, 1 queen, 2 rooks, 2 knights, 2 bishops, and 8 pawns (32 total).",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q14", "spt_9",
            "असम की 'ढिंग एक्सप्रेस' (Dhing Express) के नाम से प्रसिद्ध किस भारतीय धाविका ने 2018 में फिनलैंड के टाम्परे में IAAF वर्ल्ड U-20 चैंपियनशिप में 400 मीटर में ऐतिहासिक स्वर्ण पदक जीता था?",
            "Nicknamed the 'Dhing Express', which sprinter became the first Indian track athlete to win a Gold medal in any global track event at the IAAF World U20 Championships in Tampere (2018)?",
            listOf("दुती चंद", "हिमा दास (Hima Das - 'Dhing Express' from Assam, World U20 400m Champion in 51.46s)", "ज्योति याराजी", "विथ्या रामराज"),
            listOf("Dutee Chand", "Hima Das ('Dhing Express' - Assam sprinter who won the 400m gold at 2018 World U20 Championships in Tampere, Finland)", "Jyothi Yarraji", "Vithya Ramraj"),
            1,
            "हिमा दास (ढिंग, नगांव, असम) ने 12 जुलाई 2018 को फिनलैंड में 400 मीटर दौड़ 51.46 सेकंड में जीतकर विश्व एथलेटिक्स में किसी भी ट्रैक स्पर्धा में स्वर्ण जीतने वाली पहली भारतीय एथलीट बनीं। उन्हें असम पुलिस में डीएसपी भी नियुक्त किया गया।",
            "Hima Das, nicknamed the Dhing Express, is an Indian sprinter from Assam who made history as the first Indian athlete to win a gold medal in a track event at an IAAF competition.",
            "Easy"
        ),
        makeSportsQ(
            "spt_9_m1_q15", "spt_9",
            "शतरंज में जब कोई प्यादा (Pawn) बोर्ड के अंतिम रैंक (विपक्षी छोर) पर पहुंच जाता है, तो उसे रानी, हाथी, ऊंट या घोड़े में बदलने की प्रक्रिया को क्या कहा जाता है?",
            "In Chess, when a pawn advances to the eighth rank (the furthest rank from its starting position), what is the special rule called where it is immediately transformed into a Queen, Rook, Bishop, or Knight?",
            listOf("कैसलिंग (Castling)", "प्यादा पदोन्नति / प्रमोशन (Pawn Promotion / Queening)", "एन पासेंट (En Passant)", "स्टेलमेट (Stalemate)"),
            listOf("Castling", "Pawn Promotion (Usually promoted to a Queen, hence also called 'Queening')", "En Passant", "Stalemate"),
            1,
            "जब कोई प्यादा 8वें रैंक (विपक्षी के अंतिम छोर) पर पहुंच जाता है, तो उसे तुरंत उसी रंग की रानी, हाथी, ऊंट या घोड़े में बदला जाता है। इसे 'प्यादा पदोन्नति' (Pawn Promotion) कहा जाता है। लगभग 95% से अधिक मामलों में खिलाड़ी रानी (Queen) का चयन करते हैं।",
            "Pawn promotion occurs in chess when a pawn reaches the eighth rank, allowing the player to immediately exchange it for a queen, rook, bishop, or knight of the same color.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_9", 2, 5, baseQuestions)
    }
}
