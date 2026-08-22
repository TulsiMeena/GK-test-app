package com.example.ui.data

import com.example.ui.data.StaticGkQuestionHelper.makeStaticGkQ
import com.example.ui.model.GkQuestion

object StaticGkTopic1ExtData {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeStaticGkQ(
            "stk_1_m6_q1", "stk_1",
            "चंद्रमा की सतह पर कदम रखने वाले 'विश्व के प्रथम मानव' (First Person to Walk on the Moon) कौन थे जिन्होंने 20 जुलाई 1969 को अपोलो-11 मिशन के तहत यह ऐतिहासिक कदम रखा?",
            "Who was the American astronaut and aeronautical engineer who became the first person to walk on the Moon on 20 July 1969 during NASA's Apollo 11 mission?",
            listOf("बज एल्ड्रिन (दूसरे व्यक्ति)", "नील आर्मस्ट्रांग (Neil Armstrong - Apollo 11 Lunar Module Eagle Commander / 'One small step for man, one giant leap for mankind')", "माइकल कोलिन्स (कमांड मॉड्यूल पायलट)", "पीट कॉनराड"),
            listOf("Buzz Aldrin (Second person to step onto lunar surface)", "Neil Armstrong (Commanded Apollo 11 Lunar Module Eagle and set foot on the Sea of Tranquillity on 20 July 1969)", "Michael Collins (Command Module Pilot)", "Pete Conrad (Apollo 12)"),
            1,
            "नील आर्मस्ट्रांग 20 जुलाई 1969 को चंद्रमा पर 'शांति का सागर' (Sea of Tranquillity) में कदम रखने वाले पहले व्यक्ति बने। उन्होंने अपना बायां पैर रखते हुए कहा था: 'यह मनुष्य के लिए एक छोटा सा कदम है, लेकिन मानव जाति के लिए एक विशाल छलांग है'। उनके ठीक 19 मिनट बाद बज एल्ड्रिन दूसरे व्यक्ति बने।",
            "Neil Armstrong's historic lunar landing represents one of the greatest technological triumphs of civilization.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q2", "stk_1",
            "अंतरिक्ष में जाने वाली 'विश्व की प्रथम महिला' (First Woman in Space) कौन थीं जिन्होंने 16 जून 1963 को सोवियत संघ के 'वोस्तोक-6' यान से 48 बार पृथ्वी की परिक्रमा की थी?",
            "Who was the Soviet textile factory worker and parachutist who became the first woman in space on 16 June 1963 aboard Vostok 6?",
            listOf("स्वेतलाना सवित्स्काया (प्रथम महिला स्पेस वॉकर)", "वैलेंटीना तेरेश्कोवा (Valentina Tereshkova - Soviet Cosmonaut / Vostok 6 / Call sign 'Chaika' Seagull / 16 June 1963)", "सैली राइड (प्रथम अमेरिकी महिला)", "कल्पना चावला"),
            listOf("Svetlana Savitskaya (First woman to walk in space 1984)", "Valentina Tereshkova (Spent nearly 3 days in space, orbiting Earth 48 times at age 26; still the youngest female astronaut)", "Sally Ride (First American woman in space 1983)", "Kalpana Chawla"),
            1,
            "वैलेंटीना तेरेश्कोवा 16 जून 1963 को वोस्तोक-6 से अंतरिक्ष में जाने वाली दुनिया की पहली महिला बनीं। उनका कॉल साइन 'चायका' (सीगल - समुद्री पक्षी) था। 26 वर्ष की आयु में अंतरिक्ष जाने वाली वे सबसे कम उम्र की महिला बनीं।",
            "Valentina Tereshkova paved the way for female participation in cosmic aerospace exploration.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q3", "stk_1",
            "उत्तरी ध्रुव (North Pole) पर पहुंचने वाले 'विश्व के प्रथम व्यक्ति' (First Person to Reach the North Pole) कौन माने जाते हैं जिन्होंने 6 अप्रैल 1909 को यह उपलब्धि हासिल की?",
            "Which American explorer, accompanied by Matthew Henson and four Inuit men, is credited with leading the first expedition to reach the geographic North Pole on 6 April 1909?",
            listOf("रोआल्ड अमुंडसेन (दक्षिणी ध्रुव पर प्रथम)", "रॉबर्ट पियरी (Robert Peary - First to reach North Pole on 6 April 1909)", "फ्रेडरिक कुक", "रिचर्ड बर्ड"),
            listOf("Roald Amundsen (First to reach South Pole in 1911)", "Robert Peary (Led the overland dog-sled expedition across Arctic pack ice to the North Pole in 1909)", "Frederick Cook", "Richard Byrd"),
            1,
            "अमेरिकी नौसेना अधिकारी रॉबर्ट पियरी और मैथ्यू हेन्सन 6 अप्रैल 1909 को उत्तरी ध्रुव (आर्कटिक महासागर) पर पहुंचने वाले पहले व्यक्ति माने जाते हैं।",
            "Robert Peary's Arctic expedition marked the heroic conquest of the frozen geographical North Pole.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q4", "stk_1",
            "दक्षिणी ध्रुव (South Pole / अंटार्कटिका) पर पहुंचने वाले 'विश्व के प्रथम व्यक्ति' (First Person to Reach the South Pole) कौन थे जिन्होंने 14 दिसंबर 1911 को नार्वे का ध्वज फहराया था?",
            "Which Norwegian polar explorer won the historic race to the South Pole, successfully reaching 90° South on 14 December 1911 ahead of British explorer Robert Falcon Scott?",
            listOf("रॉबर्ट पियरी", "रोआल्ड अमुंडसेन (Roald Amundsen - Norwegian Explorer / First to South Pole on 14 Dec 1911 / Northwest Passage)", "रॉबर्ट फाल्कन स्कॉट", "अर्नेस्ट शेकलटन"),
            listOf("Robert Peary (North Pole)", "Roald Amundsen (Used Greenland sled dogs and skis to reach the South Pole on 14 December 1911; also first to navigate the Northwest Passage)", "Robert Falcon Scott (Reached 33 days later and perished on return)", "Ernest Shackleton"),
            1,
            "नॉर्वे के महान खोजकर्ता रोआल्ड अमुंडसेन 14 दिसंबर 1911 को दक्षिणी ध्रुव पर पहुंचने वाले दुनिया के पहले व्यक्ति बने। उन्होंने अपने 4 साथियों और स्लेज कुत्तों के साथ बर्फीले अंटार्कटिका पठार को पार किया था।",
            "Roald Amundsen is celebrated for his flawless polar logistical planning in conquering the frozen Antarctic South Pole.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q5", "stk_1",
            "विश्व में किसी भी देश की 'प्रथम महिला प्रधानमंत्री' (World's First Female Prime Minister) बनने का ऐतिहासिक गौरव 1960 में किस देश की सिरिमावो भंडारनायके को प्राप्त हुआ था?",
            "Who made world history in July 1960 by becoming the world's first female Prime Minister, leading the island nation of Ceylon (now Sri Lanka)?",
            listOf("इंदिरा गांधी (भारत - 1966)", "सिरिमावो भंडारनायके (Sirimavo Bandaranaike - Prime Minister of Ceylon/Sri Lanka 1960, 1970, 1994 / Non-Aligned Movement leader)", "गोल्डा मायर (इजराइल - 1969)", "मार्गरेट थैचर (ब्रिटेन - 1979)"),
            listOf("Indira Gandhi (India - 2nd female PM globally in Jan 1966)", "Sirimavo Bandaranaike (Elected Prime Minister of Ceylon on 21 July 1960 following the assassination of her husband S. W. R. D. Bandaranaike)", "Golda Meir (Israel - 1969)", "Margaret Thatcher (UK - 1979)"),
            1,
            "सिरिमावो भंडारनायके 21 जुलाई 1960 को श्रीलंका (सीलोन) की प्रधानमंत्री बनकर दुनिया की पहली महिला प्रधानमंत्री बनीं। (इंदिरा गांधी 1966 में दुनिया की दूसरी और भारत की पहली महिला प्रधानमंत्री बनी थीं; गोल्डा मायर 1969 में इजराइल की पहली महिला पीएम बनीं)।",
            "Sirimavo Bandaranaike shattered a global political barrier by becoming the world's first female head of government.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q6", "stk_1",
            "संयुक्त राष्ट्र महासभा (UN General Assembly) की 'प्रथम महिला अध्यक्ष' (First Female President of UNGA) बनने वाली भारतीय राजनयिक कौन थीं जिन्होंने 1953 में 8वें सत्र की अध्यक्षता की थी?",
            "Who was the eminent Indian diplomat and politician who made history in 1953 by being elected as the first woman President of the United Nations General Assembly (8th Session)?",
            listOf("सरोजिनी नायडू", "विजया लक्ष्मी पंडित (Vijaya Lakshmi Pandit - First Female President of UN General Assembly 1953 / Sister of Jawaharlal Nehru / Ambassador to USSR & USA)", "हंसा मेहता", "राजकुमारी अमृत कौर"),
            listOf("Sarojini Naidu", "Vijaya Lakshmi Pandit (Elected President of the UNGA on 15 September 1953; veteran freedom fighter and champion of anti-apartheid resolution against South Africa)", "Hansa Mehta (UN Universal Declaration of Human Rights)", "Rajkumari Amrit Kaur (First Health Minister)"),
            1,
            "विजया लक्ष्मी पंडित (1900-1990 - पं. जवाहरलाल नेहरू की बहन) 1953 में संयुक्त राष्ट्र महासभा (UNGA) के 8वें सत्र की पहली महिला अध्यक्ष बनीं। वे भारत की पहली कैबिनेट मंत्री (1937 उ.प्र.) और सोवियत संघ, अमेरिका तथा ब्रिटेन में भारत की राजदूत भी रहीं।",
            "Vijaya Lakshmi Pandit was an iconic diplomat whose election as UNGA President brought enormous prestige to newly independent India.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q7", "stk_1",
            "स्वतंत्र भारत की प्रथम महिला केंद्रीय कैबिनेट मंत्री (First Female Union Cabinet Minister) कौन थीं जिन्होंने प्रथम मंत्रिमंडल में 'स्वास्थ्य मंत्री' का पदभार संभाला और AIIMS की स्थापना की?",
            "Who was Independent India's first female Cabinet Minister, serving as the Union Minister of Health from 1947 to 1957, who spearheaded the establishment of AIIMS New Delhi?",
            listOf("सुचेता कृपलानी", "राजकुमारी अमृत कौर (Rajkumari Amrit Kaur - First Health Minister 1947-1957 / Founder of AIIMS New Delhi & Red Cross President)", "सरोजिनी नायडू", "कमलादेवी चट्टोपाध्याय"),
            listOf("Sucheta Kripalani (First Woman Chief Minister)", "Rajkumari Amrit Kaur (Gandhian freedom fighter from Kapurthala royal family; secured international funds from New Zealand to build AIIMS)", "Sarojini Naidu", "Kamaladevi Chattopadhyay"),
            1,
            "राजकुमारी अमृत कौर (1889-1964, कपूरथला रियासत) 1947 में नेहरू के पहले मंत्रिमंडल में स्वतंत्र भारत की पहली महिला कैबिनेट मंत्री (स्वास्थ्य मंत्री) बनीं। उन्होंने नई दिल्ली में 'अखिल भारतीय आयुर्विज्ञान संस्थान' (AIIMS) और लेडी इर्विन कॉलेज की स्थापना की।",
            "Rajkumari Amrit Kaur was a visionary healthcare administrator who established India's premier apex medical institute, AIIMS.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q8", "stk_1",
            "भारत के किसी भी राज्य की 'प्रथम महिला राज्यपाल' (First Female Governor of a State in India) बनने का गौरव किसे प्राप्त हुआ जिन्होंने 1947 में संयुक्त प्रांत (उत्तर प्रदेश) की राज्यपाल के रूप में कार्य किया?",
            "Who became the first woman to hold the office of Governor of an Indian state, serving as the Governor of Uttar Pradesh from 15 August 1947 until her demise in 1949?",
            listOf("पद्मजा नायडू", "श्रीमती सरोजिनी नायडू (Sarojini Naidu - 'Nightingale of India' / First Woman Governor of UP 1947-1949 / First Indian Woman Congress President 1925)", "सुचेता कृपलानी", "विजया लक्ष्मी पंडित"),
            listOf("Padmaja Naidu (Longest serving female Governor - West Bengal)", "Sarojini Naidu ('Bharat Kokila' - Celebrated poetess and freedom fighter who was appointed Governor of United Provinces on 15 August 1947)", "Sucheta Kripalani", "Vijaya Lakshmi Pandit"),
            1,
            "श्रीमती सरोजिनी नायडू ('भारत कोकिला') 15 अगस्त 1947 को उत्तर प्रदेश (संयुक्त प्रांत) की पहली महिला राज्यपाल बनीं। 1925 में कानपुर कांग्रेस अधिवेशन में वे भारतीय राष्ट्रीय कांग्रेस की पहली भारतीय महिला अध्यक्ष भी बनी थीं। (एनी बेसेंट 1917 में पहली महिला अध्यक्ष थीं)।",
            "Sarojini Naidu was a legendary nationalist and poetess who holds the distinction of being India's first female governor.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q9", "stk_1",
            "भारत के किसी भी राज्य की 'प्रथम महिला मुख्यमंत्री' (First Female Chief Minister of an Indian State) कौन थीं जिन्होंने 1963 से 1967 तक उत्तर प्रदेश की मुख्यमंत्री के रूप में कार्य किया?",
            "Who was the eminent freedom fighter who became the first female Chief Minister of an Indian state, serving as the 4th Chief Minister of Uttar Pradesh from 1963 to 1967?",
            listOf("नंदिनी सत्पथी (ओडिशा)", "सुचेता कृपलानी (Sucheta Kripalani - First Female Chief Minister of UP 1963-1967 / Sang Vande Mataram in Constituent Assembly 14 Aug 1947)", "जयललिता (तमिलनाडु)", "मायावती (उत्तर प्रदेश)"),
            listOf("Nandini Satpathy (Odisha)", "Sucheta Kripalani (Wife of Acharya J. B. Kripalani; leader in Quit India Movement 1942; sworn in as UP Chief Minister on 2 October 1963)", "J. Jayalalithaa", "Mayawati"),
            1,
            "सुचेता कृपलानी (1908-1974, अंबाला) 2 अक्टूबर 1963 को उत्तर प्रदेश की मुख्यमंत्री बनीं। वे भारत के किसी भी राज्य की पहली महिला मुख्यमंत्री थीं। 14 अगस्त 1947 की मध्यरात्रि को संविधान सभा के ऐतिहासिक सत्र में उन्होंने 'वंदे मातरम्' गाया था।",
            "Sucheta Kripalani was a fearless nationalist leader who set a milestone as India's first woman head of a state government.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q10", "stk_1",
            "ओलंपिक खेलों में कोई भी पदक जीतने वाली 'प्रथम भारतीय महिला' (First Indian Woman to Win an Olympic Medal) कौन थीं जिन्होंने 2000 सिडनी ओलंपिक में भारोत्तोलन में कांस्य पदक जीता था?",
            "Who became the first Indian woman to win an Olympic medal, clinching a historic Bronze in the women's 69 kg weightlifting event at the 2000 Sydney Olympic Games?",
            listOf("पी. टी. उषा (उड़नपरी)", "कर्णम मल्लेश्वरी (Karnam Malleswari - 2000 Sydney Olympics Bronze / Women's 69 kg Weightlifting / Padma Shri & Khel Ratna / 'Iron Lady of Andhra')", "साइना नेहवाल (बैडमिंटन 2012)", "मैरी कॉम (मुक्केबाजी 2012)"),
            listOf("P. T. Usha ('Payyoli Express' - 4th in 400m hurdles 1984)", "Karnam Malleswari (Lifted 110 kg in snatch and 130 kg in clean and jerk for a total of 240 kg to win Bronze on 19 Sept 2000)", "Saina Nehwal (Bronze 2012)", "Mary Kom (Bronze 2012)"),
            1,
            "कर्णम मल्लेश्वरी (आंध्र प्रदेश) 19 सितंबर 2000 को सिडनी ओलंपिक में 69 किग्रा भारोत्तोलन में 240 किग्रा वजन उठाकर कांस्य पदक जीतने वाली भारत की पहली महिला ओलंपियन बनीं। वे वर्तमान में दिल्ली स्पोर्ट्स यूनिवर्सिटी की पहली कुलपति हैं।",
            "Karnam Malleswari wrote golden history for Indian women's sports by securing the country's first female Olympic podium finish.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q11", "stk_1",
            "भारत का प्रथम 'परमाणु परीक्षण' (India's First Nuclear Test - कोड नाम: 'स्माइलिंग बुद्धा' / ऑपरेशन 77) 18 मई 1974 को राजस्थान के किस स्थान पर किया गया था?",
            "On 18 May 1974, India successfully conducted its first underground nuclear detonation codenamed 'Smiling Buddha' (Operation Happy Krishna) at which site under PM Indira Gandhi?",
            listOf("चांदीपुर (ओडिशा)", "पोखरण, जैसलमेर, राजस्थान (Pokhran Test Range, Thar Desert, Jaisalmer, Rajasthan - 'Smiling Buddha' 18 May 1974 / Dr. Raja Ramanna & Dr. Homi Sethna)", "श्रीहरिकोटा (आंध्र प्रदेश)", "थुम्बा (केरल)"),
            listOf("Chandipur (Odisha - Integrated Test Range)", "Pokhran, Jaisalmer, Rajasthan (Conducted on Buddha Purnima; designated as a 'Peaceful Nuclear Explosion' yielding ~12 kilotons)", "Sriharikota (Satish Dhawan Space Centre)", "Thumba (TERLS Kerala)"),
            1,
            "18 मई 1974 को बुद्ध पूर्णिमा के दिन राजस्थान के पोखरण (थार मरुस्थल) में भारत ने अपना पहला भूमिगत परमाणु परीक्षण किया। इसका गुप्त कोड नाम 'स्माइलिंग बुद्धा' (बुद्ध मुस्कुराए) था। इस अभियान के प्रमुख वैज्ञानिक डॉ. राजा रमन्ना और डॉ. होमी सेठना थे। (पोखरण-2 'ऑपरेशन शक्ति' 11 व 13 मई 1998 को हुआ)।",
            "The 1974 Pokhran test established India as the first nation outside the UN Security Council permanent five to develop nuclear capability.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q12", "stk_1",
            "भारत का प्रथम उपग्रह 'आर्यभट्ट' (India's First Satellite 'Aryabhata') 19 अप्रैल 1975 को किस देश के रॉकेट (कॉसमॉस-3एम) द्वारा अंतरिक्ष में प्रक्षेपित किया गया था?",
            "India's first indigenous unmanned satellite 'Aryabhata', built by ISRO under Prof. U. R. Rao, was launched on 19 April 1975 from Kapustin Yar using a launch vehicle of which country?",
            listOf("संयुक्त राज्य अमेरिका (USA)", "सोवियत संघ / रूस (Soviet Union - Kosmos-3M launch vehicle from Kapustin Yar / Named after 5th-century astronomer Aryabhata / ₹2 note feature)", "फ्रांस", "ब्रिटेन"),
            listOf("United States", "Soviet Union (Launched under bilateral scientific agreement; 360 kg satellite designed to study X-ray astronomy, aeronomics, and solar physics; featured on historic ₹2 rupee note)", "France", "United Kingdom"),
            1,
            "19 अप्रैल 1975 को भारत का पहला उपग्रह 'आर्यभट्ट' सोवियत संघ के कपूस्टिन यार से कॉसमॉस-3एम रॉकेट द्वारा प्रक्षेपित किया गया। इसका नामकरण प्रधानमंत्री इंदिरा गांधी ने 5वीं सदी के महान खगोलशास्त्री आर्यभट्ट के नाम पर किया था। यह ₹2 के पुराने नोट पर भी छपा था।",
            "The launch of Aryabhata in 1975 inaugurated India's glorious modern space exploration era.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q13", "stk_1",
            "भारत का प्रथम 'परमाणु अनुसंधान रिएक्टर' (India's First Nuclear Research Reactor) कौन-सा था जो 4 अगस्त 1956 को भाभा परमाणु अनुसंधान केंद्र (BARC), ट्रॉम्बे, मुंबई में क्रिटिकल हुआ था?",
            "Which was Asia's and India's first nuclear research reactor, commissioned on 4 August 1956 at the Bhabha Atomic Research Centre (BARC) in Trombay, Mumbai?",
            listOf("सायरस (CIRUS)", "अप्सरा (Apsara - First Nuclear Reactor of India & Asia / Swimming pool type reactor / 1 MW thermal power / Enriched Uranium fuel from UK)", "ध्रुव (Dhruva)", "पूर्णिमा (Purnima)"),
            listOf("CIRUS (Canada-India Reactor 1960)", "Apsara (Swimming-pool type reactor designed by Dr. Homi J. Bhabha; inaugurated by PM Nehru who named it Apsara / Water nymph)", "Dhruva (100 MW research reactor)", "Purnima (Fast reactor)"),
            1,
            "'अप्सरा' भारत और पूरे एशिया का पहला परमाणु रिएक्टर था जो 4 अगस्त 1956 को क्रिटिकल हुआ। इसे डॉ. होमी जहांगीर भाभा ('भारतीय परमाणु कार्यक्रम के जनक') के मार्गदर्शन में स्वदेशी रूप से डिजाइन किया गया था। प्रधानमंत्री नेहरू ने इसे 'अप्सरा' नाम दिया था।",
            "Apsara marked the pioneering dawn of nuclear science and atomic energy research across the Asian continent.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q14", "stk_1",
            "भारत में प्रथम 'मूक फिल्म' (First Indian Feature Silent Film) 1913 में 'राजा हरिश्चंद्र' बनाने वाले 'भारतीय सिनेमा के पितामह' (Father of Indian Cinema) कौन थे?",
            "Who is revered as the 'Father of Indian Cinema' for producing and directing India's first full-length indigenous silent feature film 'Raja Harishchandra' released on 3 May 1913 at Coronation Cinema, Bombay?",
            listOf("सत्यजीत रे", "धुंडीराज गोविंद फाल्के / दादा साहेब फाल्के (Dadasaheb Phalke - 1870 to 1944 / Directed 'Raja Harishchandra' 1913 / Dadasaheb Phalke Award instituted 1969)", "अर्देशिर ईरानी (प्रथम बोलती फिल्म 'आलम आरा' 1931)", "वी. शांताराम"),
            listOf("Satyajit Ray (Oscar Lifetime Achievement 1992)", "Dundiraj Govind Phalke / Dadasaheb Phalke (Pioneered Indian motion picture industry; cinema's highest annual award named after him; first recipient Devika Rani 1969)", "Ardeshir Irani (Directed first sound talkie film 'Alam Ara' in 1931)", "V. Shantaram"),
            1,
            "दादा साहेब फाल्के (1870-1944, त्र्यंबकेश्वर, नासिक) ने 1913 में भारत की पहली फीचर फिल्म 'राजा हरिश्चंद्र' बनाई। 1969 में भारत सरकार ने उनके सम्मान में भारतीय सिनेमा का सर्वोच्च सम्मान 'दादा साहेब फाल्के पुरस्कार' स्थापित किया (प्रथम विजेता: देविका रानी)। (1931 में अर्देशिर ईरानी ने पहली बोलती फिल्म 'आलम आरा' बनाई थी)।",
            "Dadasaheb Phalke's cinematic vision established the vibrant foundations of India's world-leading film industry.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_1_m6_q15", "stk_1",
            "स्वतंत्र भारत के प्रथम गवर्नर-जनरल (First Indian Governor-General of Free India) बनने वाले एकमात्र भारतीय राजनेता कौन थे जिन्हें 1954 में प्रथम 'भारत रत्न' से सम्मानित किया गया?",
            "Who was the eminent freedom fighter, statesman, and writer who served as the first and last Indian Governor-General of Free India (June 1948 to January 1950), affectionately called 'Rajaji'?",
            listOf("लॉर्ड माउंटबेटन (स्वतंत्र भारत के प्रथम गवर्नर-जनरल)", "चक्रवर्ती राजगोपालाचारी / राजाजी (C. Rajagopalachari / 'Rajaji' - Last Governor-General of India / First Bharat Ratna recipient 1954 / Swatantra Party founder)", "डॉ. राजेंद्र प्रसाद", "सरदार वल्लभभाई पटेल"),
            listOf("Lord Mountbatten (First Governor-General of independent Dominion of India 1947-1948)", "Chakravarti Rajagopalachari / Rajaji (Only Indian Governor-General of India; succeeded Mountbatten on 21 June 1948 until India became a Republic on 26 Jan 1950)", "Dr. Rajendra Prasad", "Sardar Vallabhbhai Patel"),
            1,
            "सी. राजगोपालाचारी ('राजाजी' - 1878-1972, तमिलनाडु) स्वतंत्र भारत के पहले और एकमात्र भारतीय गवर्नर-जनरल थे (21 जून 1948 से 26 जनवरी 1950 तक)। (लॉर्ड माउंटबेटन स्वतंत्र भारत के पहले ब्रिटिश गवर्नर-जनरल थे)। 1954 में उन्हें डॉ. राधाकृष्णन और डॉ. सी. वी. रमन के साथ भारत का पहला 'भारत रत्न' मिला।",
            "C. Rajagopalachari was an intellectual giant and the solitary Indian to hold the supreme office of Governor-General of India.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + StaticGkQuestionHelper.generateTopicMocks("stk_1", 7, 10, baseQuestions)
    }
}
