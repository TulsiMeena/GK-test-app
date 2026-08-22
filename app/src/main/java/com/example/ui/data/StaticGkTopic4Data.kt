package com.example.ui.data

import com.example.ui.data.StaticGkQuestionHelper.makeStaticGkQ
import com.example.ui.model.GkQuestion

object StaticGkTopic4Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeStaticGkQ(
            "stk_4_m1_q1", "stk_4",
            "राष्ट्रपिता महात्मा गांधी की विश्वप्रसिद्ध आत्मकथा का नाम क्या है जो मूल रूप से गुजराती में 'सत्य ना प्रयोगो' शीर्षक से लिखी गई थी?",
            "What is the title of Mahatma Gandhi's monumental autobiography, originally written in Gujarati while imprisoned at Yerwada Central Jail and translated into English by Mahadev Desai?",
            listOf("हिंद स्वराज (1909)", "सत्य के साथ मेरे प्रयोग / द स्टोरी ऑफ माई एक्सपेरिमेंट्स विद ट्रुथ (The Story of My Experiments with Truth - 1927 / Navajivan Weekly / Translated by Mahadev Desai)", "मेरे सपनों का भारत", "दक्षिण अफ्रीका में सत्याग्रह"),
            listOf("Hind Swaraj (Indian Home Rule - 1909)", "The Story of My Experiments with Truth (Covers Gandhi's early childhood in Porbandar, youth in England, civil rights campaigns in South Africa up to 1921 Nagpur Congress)", "India of My Dreams", "Satyagraha in South Africa"),
            1,
            "महात्मा गांधी की आत्मकथा 'द स्टोरी ऑफ माई एक्सपेरिमेंट्स विद ट्रुथ' (सत्य के साथ मेरे प्रयोग) 1925 से 1929 तक 'नवजीवन' पत्रिका में धारावाहिक प्रकाशित हुई। इसका अंग्रेजी अनुवाद उनके निजी सचिव महादेव देसाई ने किया था।",
            "The Story of My Experiments with Truth is a globally revered classic detailing Gandhi's spiritual evolution and adherence to Ahimsa and Satyagraha.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q2", "stk_4",
            "भारत के प्रथम प्रधानमंत्री पंडित जवाहरलाल नेहरू ने 1944 में अहमदनगर किला जेल में बंदी रहते हुए भारत के समृद्ध इतिहास और संस्कृति पर कौन-सी कालजयी पुस्तक लिखी थी?",
            "Which iconic historical work did Pandit Jawaharlal Nehru write in 1944 while imprisoned for five months at Ahmednagar Fort during the Quit India Movement?",
            listOf("ग्लिम्प्सिस ऑफ वर्ल्ड हिस्ट्री (विश्व इतिहास की झलकियां)", "द डिस्कवरी ऑफ इंडिया / भारत की खोज (The Discovery of India - Published 1946 / Written in Ahmednagar Fort Jail / Philosophy, Upanishads & Freedom struggle)", "एन ऑटोबायोग्राफी (मेरी कहानी - 1936)", "लेटर्स फ्रॉम ए फादर टू हिज डॉटर (1929)"),
            listOf("Glimpses of World History (1934 - 196 letters to Indira)", "The Discovery of India (Epic journey from Indus Valley Civilization through the Vedas, Mauryas, Mughals to British Raj; adapted by Shyam Benegal as 'Bharat Ek Khoj')", "An Autobiography: Toward Freedom (1936)", "Letters from a Father to His Daughter (1929)"),
            1,
            "पंडित जवाहरलाल नेहरू ने 1942 के भारत छोड़ो आंदोलन के दौरान 'अहमदनगर किला जेल' (महाराष्ट्र) में 1944 में 'द डिस्कवरी ऑफ इंडिया' (भारत की खोज) लिखी। इस पर श्याम बेनेगल ने 53 कड़ियों का प्रसिद्ध धारावाहिक 'भारत एक खोज' (दूरदर्शन) बनाया था।",
            "The Discovery of India is a panoramic, lyrical journey through 5,000 years of India's intellectual and cultural heritage.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q3", "stk_4",
            "भारत के 'मिसाइल मैन' और 11वें राष्ट्रपति डॉ. ए. पी. जे. अब्दुल कलाम की अत्यंत प्रेरक आत्मकथा का क्या नाम है जिसके सह-लेखक अरुण तिवारी हैं?",
            "What is the title of the world-famous autobiography of Bharat Ratna Dr. A. P. J. Abdul Kalam (co-authored with Arun Tiwari in 1999) tracing his journey from Rameswaram to ISRO and DRDO?",
            listOf("इग्नाइटेड माइंड्स (प्रज्वलित मन)", "विंग्स ऑफ फायर / अग्नि की उड़ान (Wings of Fire: An Autobiography - 1999 / SLV-3, Agni, Prithvi & Pokhran-II)", "इंडिया 2020: ए विजन फॉर द न्यू मिलेनियम", "टर्निंग पॉइंट्स: ए जर्नी थ्रू चैलेंजेज"),
            listOf("Ignited Minds: Unleashing the Power Within India (2002)", "Wings of Fire: An Autobiography (Co-authored with Arun Tiwari; depicts Kalam's humble upbringing in Rameswaram, rocket development at ISRO, and missile programs at DRDO)", "India 2020: A Vision for the New Millennium (1998)", "Turning Points: A Journey Through Challenges (2012)"),
            1,
            "डॉ. ए. पी. जे. अब्दुल कलाम की आत्मकथा 'विंग्स ऑफ फायर' (अग्नि की उड़ान) 1999 में प्रकाशित हुई। इसमें रामेश्वरम में अखबार बांटने से लेकर भारत के प्रथम रॉकेट SLV-3, अग्नि-पृथ्वी मिसाइलों के निर्माण और पोखरण-2 परमाणु परीक्षण तक की प्रेरणादायक गाथा दर्ज है।",
            "Wings of Fire is an enduring beacon of scientific dedication, self-belief, and technological patriotism for Indian youth.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q4", "stk_4",
            "दक्षिण अफ्रीका के महान रंगभेद-विरोधी नेता और पूर्व राष्ट्रपति 'नेल्सन मंडेला' की प्रसिद्ध आत्मकथा का क्या नाम है जो रोबेन द्वीप जेल में 27 वर्षों के कारावास के अनुभव को दर्शाती है?",
            "What is the title of the historic 1994 autobiography of South African Nobel Peace Laureate Nelson Mandela, chronicling his 27 years of imprisonment and victory over Apartheid?",
            listOf("आई हैव ए ड्रीम (मार्टिन लूथर किंग)", "लॉन्ग वॉक टू फ्रीडम / स्वतंत्रता की लंबी यात्रा (Long Walk to Freedom - 1994 / Nelson Rolihlahla Mandela / Robben Island & Pollsmoor Prison)", "द स्ट्रगल इज माई लाइफ", "नो ईजी वॉक टू फ्रीडम"),
            listOf("I Have a Dream (Martin Luther King Jr.)", "Long Walk to Freedom (Published in 1994; chronicles Mandela's rural upbringing in Thembu royalty, African National Congress leadership, and Robben Island cell 5)", "The Struggle is My Life", "No Easy Walk to Freedom"),
            1,
            "नेल्सन मंडेला (1918-2013 - 'मदीबा') की आत्मकथा 'लॉन्ग वॉक टू फ्रीडम' (Long Walk to Freedom - 1994) है। उन्होंने रंगभेद के खिलाफ 27 वर्ष रोबेन द्वीप व अन्य जेलों में काटे और 1994 में दक्षिण अफ्रीका के पहले अश्वेत राष्ट्रपति बने। उन्हें 1993 में शांति का नोबेल और 1990 में भारत रत्न मिला।",
            "Long Walk to Freedom is a testament to human resilience, moral dignity, and the triumph of reconciliation over racial oppression.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q5", "stk_4",
            "1867 में प्रकाशित प्रसिद्ध पुस्तक 'दास कैपिटल' (Das Kapital) और 1848 में 'कम्युनिस्ट मेनिफेस्टो' लिखने वाले महान जर्मन दार्शनिक और अर्थशास्त्री कौन थे?",
            "Which revolutionary German philosopher, political theorist, and economist authored the foundational socialist texts 'The Communist Manifesto' (1848 with Engels) and 'Das Kapital' (1867)?",
            listOf("एडम स्मिथ (वेल्थ ऑफ नेशंस)", "कार्ल मार्क्स (Karl Marx - 1818 to 1883 / Das Kapital: Critique of Political Economy & The Communist Manifesto / 'Workers of the world, unite!')", "मैक्स वेबर", "जॉन मेनार्ड कीन्स"),
            listOf("Adam Smith (Wealth of Nations 1776 - Father of Modern Economics)", "Karl Marx (Developed historical materialism, surplus value theory, and class struggle doctrines that fundamentally reshaped 19th and 20th-century world politics)", "Max Weber (Protestant Ethic)", "John Maynard Keynes (General Theory of Employment)"),
            1,
            "कार्ल मार्क्स (1818-1883, जर्मनी) ने फ्रेडरिक एंगेल्स के साथ 'कम्युनिस्ट मेनिफेस्टो' (1848) और लंदन में 'दास कैपिटल' (1867) लिखी। उनका प्रसिद्ध नारा था: 'दुनिया के मजदूरों, एक हो जाओ! तुम्हारे पास खोने के लिए केवल अपनी जंजीरें हैं'।",
            "Das Kapital is one of the most influential political-economic critiques of capitalism ever published in human history.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q6", "stk_4",
            "1776 में प्रकाशित 'द वेल्थ ऑफ नेशंस' (An Inquiry into the Nature and Causes of the Wealth of Nations) पुस्तक के लेखक कौन हैं जिन्हें 'आधुनिक अर्थशास्त्र का जनक' (Father of Modern Economics) कहा जाता है?",
            "Who authored the foundational classical economics treatise 'The Wealth of Nations' in 1776, pioneering concepts of division of labor, free markets, and the 'Invisible Hand'?",
            listOf("कार्ल मार्क्स", "एडम स्मिथ (Adam Smith - 1723 to 1790 / Scottish Philosopher / 'The Wealth of Nations' 1776 / 'Invisible Hand' & Laissez-Faire)", "अमर्त्य सेन", "डेविड रिकार्डो"),
            listOf("Karl Marx (Das Kapital)", "Adam Smith (Scottish Enlightenment philosopher; articulated how rational self-interest and open market competition promote broader societal prosperity)", "Amartya Sen (Poverty and Famines)", "David Ricardo (Comparative Advantage)"),
            1,
            "एडम स्मिथ (स्कॉटलैंड) को 'आधुनिक अर्थशास्त्र का जनक' कहा जाता है। 1776 में प्रकाशित उनकी पुस्तक 'द वेल्थ ऑफ नेशंस' ने पूंजीवाद, श्रम विभाजन (Division of Labour) और 'अदृश्य हाथ' (Invisible Hand) के सिद्धांत की नींव रखी।",
            "The Wealth of Nations formulated the bedrock principles of classical market economies and free international trade.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q7", "stk_4",
            "1901 में प्रकाशित पुस्तक 'पॉवर्टी एंड अन-ब्रिटिश रूल इन इंडिया' (Poverty and Un-British Rule in India) के लेखक कौन हैं जिन्होंने भारत से ब्रिटेन को होने वाले 'धन की निकासी का सिद्धांत' (Drain of Wealth Theory) प्रतिपादित किया था?",
            "Who authored the pioneering 1901 economic exposé 'Poverty and Un-British Rule in India', mathematically demonstrating the systematic 'Drain of Wealth' from colonial India to Britain?",
            listOf("गोपाल कृष्ण गोखले", "दादाभाई नौरोजी / 'ग्रैंड ओल्ड मैन ऑफ इंडिया' (Dadabhai Naoroji - 1825 to 1917 / 'Poverty and Un-British Rule in India' / First Asian MP in British Parliament 1892)", "आर. सी. दत्त (इकोनॉमिक हिस्ट्री ऑफ इंडिया)", "महादेव गोविंद रानाडे"),
            listOf("Gopal Krishna Gokhale", "Dadabhai Naoroji ('Grand Old Man of India' - First Indian to calculate national per capita income ₹20 in 1867-68; elected MP for Finsbury Central in British House of Commons 1892)", "R. C. Dutt (Author of Economic History of India 1901)", "M. G. Ranade"),
            1,
            "दादाभाई नौरोजी ('भारत के वयोवृद्ध पुरुष') ने अपनी 1901 की पुस्तक 'पॉवर्टी एंड अन-ब्रिटिश रूल इन इंडिया' में साबित किया कि कैसे ब्रिटिश शासन भारतीय धन को ब्रिटेन खींच रहा है (Drain of Wealth)। 1867-68 में उन्होंने पहली बार भारत की प्रति व्यक्ति आय ₹20 आकलित की थी।",
            "Dadabhai Naoroji's Drain of Wealth thesis provided the foundational economic critique of British imperialism in India.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q8", "stk_4",
            "महान स्वतंत्रता सेनानी और 'पंजाब केसरी' लाला लाजपत राय द्वारा 1916 में अमेरिका में लिखी गई प्रसिद्ध राष्ट्रवादी पुस्तक कौन-सी है जिसमें कांग्रेस की स्थापना के 'सुरक्षा वाल्व सिद्धांत' (Safety Valve Theory) का उल्लेख किया गया था?",
            "Which influential 1916 nationalist book did Punjab Kesari Lala Lajpat Rai author while in exile in the United States, popularizing the 'Safety Valve Theory' of the Indian National Congress's origins?",
            listOf("आनंदमठ", "यंग इंडिया: एन इंटरप्रिटेशन (Young India: An Interpretation and a History of the Nationalist Movement - 1916 / Lala Lajpat Rai / Also 'Unhappy India' 1928)", "अनहैप्पी इंडिया (1928)", "इंडिया अनरेस्ट (वैलेंटाइन शिरोल)"),
            listOf("Anandamath (Bankim Chandra)", "Young India: An Interpretation (Published in New York in 1916; presented an authentic portrait of India's revolutionary awakening to international readers)", "Unhappy India (1928 rebuttal to Katherine Mayo's Mother India)", "Indian Unrest (Valentine Chirol 1910)"),
            1,
            "लाला लाजपत राय ने 1916 में न्यूयॉर्क में 'यंग इंडिया' (Young India) पुस्तक लिखी और 1928 में कैथरीन मेयो की पक्षपातपूर्ण पुस्तक 'मदर इंडिया' के जवाब में 'अनहैप्पी इंडिया' (Unhappy India) लिखी। (नोट: 'यंग इंडिया' नाम से साप्ताहिक पत्रिका महात्मा गांधी निकालते थे)।",
            "Lala Lajpat Rai's patriotic writings mobilized international and domestic public opinion against colonial exploitation.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q9", "stk_4",
            "1936 में डॉ. बी. आर. अंबेडकर द्वारा रचित वह कौन-सा प्रसिद्ध अप्रस्तुत भाषण ग्रंथ (Undelivered Speech) है जिसे हिंदू समाज में जाति व्यवस्था और अस्पृश्यता के उन्मूलन पर सबसे प्रखर विमर्श माना जाता है?",
            "Which seminal 1936 treatise by Dr. B. R. Ambedkar (originally written as a presidential address for the Jat-Pat Todak Mandal conference in Lahore) is revered as the ultimate critique of the caste system?",
            listOf("व्हाट कांग्रेस एंड गांधी हैव डन टू द अनटचेबल्स", "एनिहिलेशन ऑफ कास्ट / जाति का विनाश (Annihilation of Caste - 1936 / Dr. B. R. Ambedkar / Critique of Chaturvarnya & Shastras)", "द प्रॉब्लम ऑफ द रूपी (1923)", "हू वर द शूद्राज? (1946)"),
            listOf("What Congress and Gandhi Have Done to the Untouchables (1945)", "Annihilation of Caste (Privately published in 1936 after organizers cancelled the Lahore conference; argued that caste reform is impossible without dismantling scriptural sanction)", "The Problem of the Rupee: Its Origin and Solution (1923)", "Who Were the Shudras? (1946)"),
            1,
            "डॉ. बी. आर. अंबेडकर ने 1936 में 'एनिहिलेशन ऑफ कास्ट' (जाति का विनाश) लिखी। यह लाहौर के जात-पात तोड़क मंडल के वार्षिक सम्मेलन के लिए अध्यक्षीय भाषण था, जिसे आयोजकों द्वारा रद्द किए जाने पर डॉ. अंबेडकर ने स्वयं प्रकाशित किया।",
            "Annihilation of Caste is an intellectual tour de force advocating human equality, fraternity, and radical social democracy.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q10", "stk_4",
            "1923 में अंडमान की सेल्यूलर जेल में कारावास के दौरान विनायक दामोदर सावरकर (वीर सावरकर) द्वारा लिखी गई वैचारिक पुस्तक 'हिंदुत्व' का पूरा शीर्षक क्या था?",
            "Which ideological treatise did Vinayak Damodar Savarkar author while imprisoned in Ratnagiri/Cellular Jail, published in 1923 under the pseudonym 'A Maratha'?",
            listOf("द इंडियन वॉर ऑफ इंडिपेंडेंस 1857", "हिंदुत्व: हू इज ए हिंदू? (Essentials of Hindutva / Hindutva: Who is a Hindu? - 1923 / V. D. Savarkar / Concept of Pitribhumi & Punyabhumi)", "माझी जन्मठेप (मेरी जेल डायरी)", "हिंदू पद-पादशाही"),
            listOf("The Indian War of Independence 1857 (Published in 1909 - Termed 1857 as First War of Independence)", "Hindutva: Who is a Hindu? (Formulated the definition of Hindutva based on shared culture, ancestry, and viewing India as fatherland/Pitribhumi and holy land/Punyabhumi)", "Majhi Janmathep (My Transportation for Life - Marathi autobiography)", "Hindu Pad-Padshahi (1925)"),
            1,
            "वीर सावरकर ने 1923 में 'हिंदुत्व: हू इज ए हिंदू?' (Hindutva: Who is a Hindu?) पुस्तक लिखी। इससे पहले 1909 में उन्होंने लंदन में 'द इंडियन वॉर ऑफ इंडिपेंडेंस 1857' लिखी थी, जिसमें उन्होंने 1857 के विद्रोह को 'भारत का प्रथम स्वतंत्रता संग्राम' घोषित किया था।",
            "Savarkar's writings deeply influenced 20th-century Indian political nationalism and historical interpretation of the 1857 uprising.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q11", "stk_4",
            "स्वतंत्र भारत के प्रथम शिक्षा मंत्री 'मौलाना अबुल कलाम आजाद' की मरणोपरांत 1959 में पूर्ण रूप से प्रकाशित प्रसिद्ध पुस्तक कौन-सी है जिसमें भारत के विभाजन के वास्तविक कारणों का विश्लेषण है?",
            "Which landmark political chronicle by Maulana Abul Kalam Azad (completed with Humayun Kabir and published in full in 1988 with its sealed 30 pages) provides an insider account of Indian independence and Partition?",
            listOf("गुबार-ए-खातिर (पत्र संग्रह)", "इंडिया विन्स फ्रीडम / भारत की स्वतंत्रता की जीत (India Wins Freedom: An Autobiographical Narrative - Maulana Abul Kalam Azad / Partition history)", "तजकिरा", "अल-हिलाल"),
            listOf("Ghubar-e-Khatir (Epistolary essays written in Ahmednagar Fort)", "India Wins Freedom (Frank autobiographical analysis of Congress politics, Cabinet Mission, Lord Mountbatten, and tragic events leading to August 1947)", "Tazkirah (Autobiographical reflections 1916)", "Al-Hilal (Urdu weekly newspaper founded 1912)"),
            1,
            "मौलाना अबुल कलाम आजाद (1888-1958 - प्रथम शिक्षा मंत्री) की पुस्तक 'इंडिया विन्स फ्रीडम' (India Wins Freedom) 1959 में प्रकाशित हुई। इसके 30 गुप्त पृष्ठ राष्ट्रीय अभिलेखागार में सीलबंद रखे गए थे जिन्हें 30 साल बाद 1988 में सार्वजनिक किया गया।",
            "India Wins Freedom is a primary historical source on the intricate negotiations surrounding India's independence and partition.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q12", "stk_4",
            "1997 में प्रसिद्ध उपन्यास 'द गॉड ऑफ स्मॉल थिंग्स' (The God of Small Things) के लिए 'मैन बुकर पुरस्कार' जीतने वाली पहली भारतीय महिला नागरिक कौन बनीं?",
            "Who became the first Indian citizen to win the prestigious Booker Prize in 1997 for her debut novel 'The God of Small Things' set in Ayemenem, Kerala?",
            listOf("किरण देसाई (2006 बुकर - द इनहेरिटेंस ऑफ लॉस)", "अरुंधति रॉय (Arundhati Roy - 1997 Booker Prize for 'The God of Small Things' / Characters: Rahel & Estha twins / Also 'The Ministry of Utmost Happiness')", "झुम्पा लाहिड़ी (पुलित्जर 2000)", "अनीता देसाई"),
            listOf("Kiran Desai (The Inheritance of Loss - 2006 Booker winner)", "Arundhati Roy (First Indian woman and non-expatriate Indian citizen to win Booker Prize; explores caste boundaries, communism, and tragic love in Ayemenem)", "Jhumpa Lahiri (Interpreter of Maladies - Pulitzer 2000)", "Anita Desai (Clear Light of Day)"),
            1,
            "अरुंधति रॉय (मेघालय/केरल) को 1997 में उनके पहले उपन्यास 'द गॉड ऑफ स्मॉल थिंग्स' के लिए बुकर पुरस्कार मिला। यह पुरस्कार जीतने वाली वे पहली भारतीय नागरिक थीं। (2008 में अरविंद अडिगा को 'द व्हाइट टाइगर' और 2006 में किरण देसाई को 'द इनहेरिटेंस ऑफ लॉस' के लिए बुकर मिला था)।",
            "The God of Small Things is a world masterpiece celebrated for its lush linguistic virtuosity and poignant examination of social taboos.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q13", "stk_4",
            "विश्वविख्यात भौतिक विज्ञानी 'स्टीफन हॉकिंग' (Stephen Hawking) द्वारा 1988 में रचित ब्रह्मांड विज्ञान (Cosmology) की सबसे लोकप्रिय वैज्ञानिक पुस्तक कौन-सी है?",
            "Which record-shattering popular science book on cosmology, black holes, and the origin of the universe did theoretical physicist Stephen Hawking author in 1988?",
            listOf("द ग्रैंड डिजाइन (2010)", "ए ब्रीफ हिस्ट्री ऑफ टाइम / समय का संक्षिप्त इतिहास (A Brief History of Time: From the Big Bang to Black Holes - 1988 / 25+ million copies sold / 237 weeks on Sunday Times bestseller list)", "द यूनिवर्स इन ए नटशेल (2001)", "ब्रीफ आंसर्स टू द बिग क्वेश्चन्स (2018)"),
            listOf("The Grand Design (2010)", "A Brief History of Time (Non-technical masterwork introducing Big Bang theory, light cones, general relativity, quantum mechanics, and Hawking radiation to lay readers)", "The Universe in a Nutshell (2001)", "Brief Answers to the Big Questions (2018)"),
            1,
            "स्टीफन हॉकिंग (1942-2018, कैम्ब्रिज विश्वविद्यालय) की पुस्तक 'ए ब्रीफ हिस्ट्री ऑफ टाइम' (समय का संक्षिप्त इतिहास - 1988) दुनिया में 2.5 करोड़ से अधिक प्रतियों में बिकी। इसमें बिग बैंग, ब्लैक होल और हॉकिंग विकिरण को सरल भाषा में समझाया गया है।",
            "A Brief History of Time demystified modern relativistic astrophysics and quantum spacetime for global audiences.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q14", "stk_4",
            "महान भारतीय क्रिकेटर 'सचिन तेंदुलकर' की 2014 में प्रकाशित आत्मकथा का शीर्षक क्या है जिसके सह-लेखक बोरिया मजूमदार हैं?",
            "What is the title of the official autobiography of legendary batsman Sachin Tendulkar, released in November 2014, chronicling his 24-year international cricket career?",
            listOf("सेंचुरी इज नॉट एनफ (सौरव गांगुली)", "प्लेइंग इट माई वे (Playing It My Way: My Autobiography - Sachin Tendulkar & Boria Majumdar / Published Nov 2014 / Limca Book record for sales)", "281 एंड बियोंड (वी. वी. एस. लक्ष्मण)", "द टेस्ट ऑफ माई लाइफ (युवराज सिंह)"),
            listOf("A Century is Not Enough (Sourav Ganguly 2018)", "Playing It My Way (Co-authored with Boria Majumdar; entered Limca Book of Records for breaking best-selling adult non-fiction records on release day)", "281 and Beyond (V. V. S. Laxman 2018)", "The Test of My Life (Yuvraj Singh 2013)"),
            1,
            "सचिन तेंदुलकर की आत्मकथा 'प्लेइंग इट माई वे' (Playing It My Way) 6 नवंबर 2014 को रिलीज हुई थी।\nअन्य प्रमुख भारतीय क्रिकेटरों की आत्मकथाएं:\n- सौरव गांगुली: 'A Century is Not Enough'\n- युवराज सिंह: 'The Test of My Life'\n- वी. वी. एस. लक्ष्मण: '281 and Beyond'\n- सुरेश रैना: 'Believe'\n- सुनील गावस्कर: 'Sunny Days'",
            "Playing It My Way is an intimate chronicle of the dedication, psychological pressures, and triumphs of cricket's greatest icon.",
            "Easy"
        ),
        makeStaticGkQ(
            "stk_4_m1_q15", "stk_4",
            "भारत के 6 बार की विश्व मुक्केबाजी चैंपियन और ओलंपिक पदक विजेता 'एम. सी. मैरी कॉम' की आत्मकथा का क्या नाम है?",
            "What is the title of the inspirational autobiography of iconic Indian Olympic boxer and 6-time World Amateur Boxing Champion M. C. Mary Kom?",
            listOf("एस अगेंस्ट ऑड्स (सानिया मिर्जा)", "अनब्रेकेबल (Unbreakable: An Autobiography - M. C. Mary Kom / Published 2013 / Chronicling her journey from Churachandpur, Manipur to Olympic Bronze)", "गोल्डन गर्ल (पी. टी. उषा)", "स्ट्रेट फ्रॉम द हार्ट (कपिल देव)"),
            listOf("Ace Against Odds (Sania Mirza autobiography 2016)", "Unbreakable (Authored by Mary Kom with Dina Serto in 2013; captures her relentless struggle against poverty and overcoming patriarchal barriers)", "Golden Girl (P. T. Usha with Lokesh Sharma)", "Straight from the Heart (Kapil Dev)"),
            1,
            "एम. सी. मैरी कॉम (मणिपुर - 'मैग्निफिसेंट मैरी') की आत्मकथा 'अनब्रेकेबल' (Unbreakable - 2013) है।\nअन्य महिला एथलीटों की आत्मकथाएं:\n- सानिया मिर्जा: 'Ace Against Odds' (2016)\n- पी. टी. उषा: 'Golden Girl' (1987)\n- साइना नेहवाल: 'Playing to Win' (2012)\n- दुती चंद: 'Story So Far'",
            "Unbreakable is a moving account of maternal grit, athletic determination, and trailblazing boxing excellence.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + StaticGkQuestionHelper.generateTopicMocks("stk_4", 2, 5, baseQuestions)
    }
}
