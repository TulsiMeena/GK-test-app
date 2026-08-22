package com.example.ui.data

import com.example.ui.data.SportsQuestionHelper.makeSportsQ
import com.example.ui.model.GkQuestion

object SportsTopic5Data {
    val baseQuestions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeSportsQ(
            "spt_5_m1_q1", "spt_5",
            "इतिहास के पहले एशियाई खेल (First Asian Games 1951) किस शहर में आयोजित हुए थे और इसका उद्घाटन किसने किया था?",
            "In which city were the inaugural Asian Games held in March 1951, inaugurated by President Dr. Rajendra Prasad at the National Stadium?",
            listOf("मनीला (फिलीपींस)", "नई दिल्ली, भारत (New Delhi, India - 4 to 11 March 1951 / Major Dhyan Chand National Stadium)", "टोक्यो (जापान)", "जकार्ता (इंडोनेशिया)"),
            listOf("Manila, Philippines", "New Delhi, India (4–11 March 1951; 11 countries, 489 athletes; India finished 2nd)", "Tokyo, Japan", "Jakarta, Indonesia"),
            1,
            "पहले एशियाई खेल 4 से 11 मार्च 1951 तक नई दिल्ली के नेशनल स्टेडियम में आयोजित हुए थे। इसके मुख्य सूत्रधार प्रोफेसर गुरुदत्त सोंधी (G.D. Sondhi) और पंडित जवाहरलाल नेहरू थे। भारत 15 स्वर्ण सहित 51 पदकों के साथ दूसरे स्थान पर रहा था।",
            "The 1951 Asian Games were the inaugural multi-sport event held in New Delhi, India from 4 to 11 March 1951.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q2", "spt_5",
            "एशियाई खेलों का प्रतीक चिन्ह 'चमकता हुआ लाल सूरज' (Ever Onward / चमकता सूरज 16 किरणों के साथ) और आदर्श वाक्य 'Ever Onward' (सदा आगे की ओर) किसके द्वारा दिया गया था?",
            "Who coined the official motto 'Ever Onward' and conceptualized the radiant rising sun logo for the Asian Games?",
            listOf("महात्मा गांधी", "पंडित जवाहरलाल नेहरू (Pt. Jawaharlal Nehru - First Prime Minister of India)", "सर दोराबजी टाटा", "डॉ. राजेंद्र प्रसाद"),
            listOf("Mahatma Gandhi", "Pandit Jawaharlal Nehru (Proposed the motto 'Ever Onward' and the radiant rising sun emblem)", "Sir Dorabji Tata", "Dr. Rajendra Prasad"),
            1,
            "पंडित जवाहरलाल नेहरू ने एशियाई खेलों का आधिकारिक आदर्श वाक्य 'Ever Onward' (सदा आगे की ओर) दिया था और 16 किरणों वाला चमकता हुआ लाल सूर्य इसका प्रतीक चिन्ह बना।",
            "Pandit Jawaharlal Nehru coined the motto 'Ever Onward' for the Asian Games, signifying friendship and progress among Asian nations.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q3", "spt_5",
            "भारत ने अब तक कुल कितनी बार एशियाई खेलों (Asian Games) की मेजबानी की है?",
            "How many times has India hosted the Asian Games in total, both hosted in the national capital of New Delhi?",
            listOf("1 बार (1951)", "2 बार - 1951 और 1982 (Two times: 1st Asian Games 1951 & 9th Asian Games 1982 in New Delhi)", "3 बार", "4 बार"),
            listOf("1 time (1951)", "2 Times (1951 Inaugural Games and 1982 9th Asian Games featuring mascot Appu the Elephant)", "3 times", "4 times"),
            1,
            "भारत ने दो बार एशियाई खेलों की मेजबानी की है: पहली बार 1951 में (प्रथम एशियाई खेल) और दूसरी बार 1982 में (9वें एशियाई खेल, जिसका शुभंकर 'अप्पू' हाथी था और रंगीन टीवी प्रसारण शुरू हुआ था)।",
            "India has hosted the Asian Games twice, both times in New Delhi in 1951 and 1982.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q4", "spt_5",
            "2023 में हांगझू (चीन) में आयोजित 19वें एशियाई खेलों (19th Asian Games Hangzhou) में भारत ने ऐतिहासिक प्रदर्शन करते हुए कुल कितने पदक (28 स्वर्ण, 38 रजत, 41 कांस्य) जीतकर '100 पार' का लक्ष्य हासिल किया?",
            "How many total medals did India win at the 19th Asian Games Hangzhou 2022 (held in 2023), crossing the historic century mark with 28 Gold, 38 Silver, and 41 Bronze medals?",
            listOf("70 पदक (जकार्ता 2018)", "107 पदक (107 Medals: 28 Gold, 38 Silver, 41 Bronze / Historic 4th place finish)", "95 पदक", "121 पदक"),
            listOf("70 medals (Jakarta 2018)", "107 Medals (India's historic first-ever 100+ medal haul at the Asian Games)", "95 medals", "121 medals"),
            1,
            "हांगझू 2023 एशियाई खेलों में भारत ने रिकॉर्ड 107 पदक (28 स्वर्ण, 38 रजत, 41 कांस्य) जीतकर चौथा स्थान प्राप्त किया। यह भारत का एशियाई खेलों में अब तक का सर्वकालिक सर्वश्रेष्ठ प्रदर्शन है।",
            "India produced its greatest-ever performance in Asian Games history at Hangzhou 2023, crossing 100 medals for the first time with 107 total medals.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q5", "spt_5",
            "प्रथम राष्ट्रमंडल खेल (Inaugural Commonwealth Games - तब 'ब्रिटिश एम्पायर गेम्स' कहा जाता था) 1930 में किस शहर और देश में आयोजित हुए थे?",
            "In which city and country were the inaugural Commonwealth Games (originally named the 'British Empire Games') held in August 1930?",
            listOf("लंदन (ब्रिटेन)", "हैमिल्टन, कनाडा (Hamilton, Ontario, Canada - August 1930 / 11 Countries, 400 Athletes)", "सिडनी (ऑस्ट्रेलिया)", "ऑकलैंड (न्यूजीलैंड)"),
            listOf("London, UK", "Hamilton, Canada (Inaugural British Empire Games organized by Melville Marks Robinson in 1930)", "Sydney, Australia", "Auckland, New Zealand"),
            1,
            "पहले राष्ट्रमंडल खेल (ब्रिटिश एम्पायर गेम्स) 16 से 23 अगस्त 1930 तक हैमिल्टन (कनाडा) में आयोजित हुए थे। 11 देशों के 400 एथलीटों ने 6 खेलों में भाग लिया था।",
            "The 1930 British Empire Games were the first edition of what are now known as the Commonwealth Games, held in Hamilton, Canada.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q6", "spt_5",
            "राष्ट्रमंडल खेलों में भारत के लिए पहला स्वर्ण पदक (First Commonwealth Games Gold Medal for India) 1958 कार्डिफ (वेल्स) में 440 गज की दौड़ में किसने जीता था?",
            "Who won India's first-ever Commonwealth Games Gold Medal, winning the 440 yards sprint at the 1958 British Empire and Commonwealth Games in Cardiff, Wales?",
            listOf("के. डी. जाधव", "मिल्खा सिंह (Milkha Singh - 440 Yards Gold, Cardiff 1958 / 'The Flying Sikh')", "गुरबचन सिंह रंधावा", "प्रवीण कुमार सोबती"),
            listOf("K. D. Jadhav", "Milkha Singh (Clocked 46.6 seconds in Cardiff to become the first individual gold medalist from independent India)", "Gurbachan Singh Randhawa", "Praveen Kumar Sobti"),
            1,
            "मिल्खा सिंह ने 1958 कार्डिफ राष्ट्रमंडल खेलों में 440 गज की दौड़ 46.6 सेकंड में जीतकर स्वतंत्र भारत को राष्ट्रमंडल खेलों का पहला व्यक्तिगत स्वर्ण पदक दिलाया था।",
            "Milkha Singh made history in Cardiff in 1958 by claiming independent India's first Commonwealth gold medal.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q7", "spt_5",
            "भारत ने किस वर्ष 19वें राष्ट्रमंडल खेलों (XIX Commonwealth Games) की ऐतिहासिक मेजबानी नई दिल्ली में की थी जहाँ भारत 38 स्वर्ण सहित 101 पदकों के साथ दूसरे स्थान पर रहा था?",
            "In which year did India host the XIX Commonwealth Games in New Delhi, achieving its record best finish of 2nd place with 101 medals (38 Gold)?",
            listOf("2002", "2010 (Delhi 2010 Commonwealth Games - 3 to 14 October 2010 / Mascot: Shera)", "2006", "2014"),
            listOf("2002", "2010 (XIX Commonwealth Games held in New Delhi, 3–14 October 2010; Mascot 'Shera' the royal Bengal tiger)", "2006", "2014"),
            1,
            "19वें राष्ट्रमंडल खेल 3 से 14 अक्टूबर 2010 तक नई दिल्ली के जवाहरलाल नेहरू स्टेडियम में आयोजित हुए। इसका शुभंकर 'शेरा' (बाघ) था। भारत 101 पदकों (38 स्वर्ण) के साथ तालिका में ऑस्ट्रेलिया के बाद दूसरे स्थान पर रहा।",
            "The 2010 Commonwealth Games were held in Delhi, India, marking the largest international multi-sport event hosted in India.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q8", "spt_5",
            "एशियाई खेलों में व्यक्तिगत स्वर्ण पदक जीतने वाली पहली भारतीय महिला एथलीट कौन थीं जिन्होंने 1970 के बैंकॉक एशियाई खेलों में 400 मीटर दौड़ में स्वर्ण पदक जीता था?",
            "Who was the first Indian woman athlete to win an individual Gold Medal at the Asian Games, winning the 400m race at Bangkok 1970?",
            listOf("पी. टी. उषा", "कमलजीत संधू (Kamaljeet Sandhu - 400m Gold, Bangkok Asian Games 1970)", "शाइनी विल्सन", "एम. डी. वलसम्मा"),
            listOf("P. T. Usha", "Kamaljeet Sandhu (Clocked 57.3 seconds to win 400m gold in Bangkok on 15 Dec 1970; awarded Padma Shri 1971)", "Shiny Wilson", "M. D. Valsamma"),
            1,
            "कमलजीत संधू (पंजाब) ने 1970 के बैंकॉक एशियाई खेलों में 400 मीटर दौड़ 57.3 सेकंड में जीतकर एशियाई खेलों में स्वर्ण पदक जीतने वाली पहली भारतीय महिला बनने का गौरव हासिल किया।",
            "Kamaljeet Sandhu became the first Indian woman athlete to win an individual gold medal at any Asian Games at Bangkok 1970.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q9", "spt_5",
            "1986 के सियोल एशियाई खेलों (Seoul Asian Games 1986) में अकेले 4 स्वर्ण पदक (200मी, 400मी, 400मी बाधा दौड़, 4x400मी रिले) और 1 रजत पदक जीतकर इतिहास रचने वाली 'क्वीन ऑफ इंडियन ट्रैक' कौन हैं?",
            "Which iconic Indian track athlete won an astounding 4 Gold Medals (200m, 400m, 400m Hurdles, 4x400m Relay) and 1 Silver (100m) at the 1986 Seoul Asian Games?",
            listOf("कमलजीत संधू", "पी. टी. उषा (P. T. Usha - 'Golden Girl' / 4 Golds at Seoul Asian Games 1986)", "द्युति चंद", "हिमा दास"),
            listOf("Kamaljeet Sandhu", "P. T. Usha (Set Asian records in all 4 gold medal events at 1986 Seoul Asian Games)", "Dutee Chand", "Hima Das"),
            1,
            "पी. टी. उषा (उड़नपरी/गोल्डन गर्ल) ने 1986 सियोल एशियाई खेलों में 4 स्वर्ण और 1 रजत पदक जीतकर भारत को शीर्ष देशों में खड़ा कर दिया था।",
            "P. T. Usha dominated the 1986 Asian Games in Seoul by sweeping four gold medals and setting multiple continental records.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q10", "spt_5",
            "भारत सरकार द्वारा जमीनी स्तर पर खेलों को बढ़ावा देने और युवा प्रतिभाओं की खोज के लिए 'खेलो इंडिया यूथ गेम्स' (Khelo India Youth Games) की शुरुआत किस वर्ष की गई थी?",
            "In which year was the flagship national grassroots sports initiative 'Khelo India Youth Games' (originally 'Khelo India School Games') inaugurated in New Delhi?",
            listOf("2014", "2018 (Khelo India Youth Games - Inaugurated on 31 January 2018 by Prime Minister Narendra Modi)", "2016", "2020"),
            listOf("2014", "2018 (Inaugurated at Indira Gandhi Indoor Stadium, New Delhi in January 2018)", "2016", "2020"),
            1,
            "खेलो इंडिया स्कूल गेम्स की शुरुआत 31 जनवरी 2018 को नई दिल्ली में हुई थी, जिसे बाद में 'खेलो इंडिया यूथ गेम्स' नाम दिया गया। इसमें चयनित 1000 प्रतिभाशाली एथलीटों को 8 वर्षों तक प्रतिवर्ष ₹5 लाख की वित्तीय सहायता दी जाती है।",
            "The Khelo India Youth Games were launched in 2018 to revive the sports culture in India at the grassroots level.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q11", "spt_5",
            "विश्वविद्यालय स्तर की खेल प्रतिभाओं को निखारने के लिए 'खेलो इंडिया यूनिवर्सिटी गेम्स' (Khelo India University Games - KIUG) का पहला उद्घाटन सत्र 2020 में किस राज्य में आयोजित हुआ था?",
            "In which state was the inaugural edition of the Khelo India University Games (KIUG) held in February-March 2020?",
            listOf("महाराष्ट्र", "ओडिशा (Odisha - KIIT University, Bhubaneswar, February 2020)", "कर्नाटक", "उत्तर प्रदेश"),
            listOf("Maharashtra", "Odisha (Hosted at KIIT University in Bhubaneswar; Panjab University emerged champions)", "Karnataka (Hosted 2nd edition in Bengaluru 2022)", "Uttar Pradesh (Hosted 3rd edition 2023)"),
            1,
            "पहले खेलो इंडिया यूनिवर्सिटी गेम्स 2020 में भुवनेश्वर (ओडिशा) में आयोजित हुए थे, जिसमें पंजाब यूनिवर्सिटी (चंडीगढ़) चैंपियन रही थी।",
            "The inaugural Khelo India University Games took place in 2020 in Odisha, bringing university athletes into the national sports pipeline.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q12", "spt_5",
            "शीतकालीन और साहसिक खेलों को बढ़ावा देने के लिए 'खेलो इंडिया विंटर गेम्स' (Khelo India Winter Games) का पहला संस्करण 2020 में कहाँ आयोजित हुआ था?",
            "Where was the first edition of the Khelo India Winter Games held in March 2020 to promote winter sports and tourism in India?",
            listOf("मनाली (हिमाचल प्रदेश)", "गुलमर्ग, जम्मू और कश्मीर (Gulmarg, Jammu & Kashmir, March 2020)", "औली (उत्तराखंड)", "लेह (लद्दाख)"),
            listOf("Manali, Himachal Pradesh", "Gulmarg, Jammu and Kashmir (Organized by J&K Sports Council and Ministry of Youth Affairs and Sports)", "Auli, Uttarakhand", "Leh, Ladakh"),
            1,
            "पहले खेलो इंडिया विंटर गेम्स 7 से 11 मार्च 2020 तक गुलमर्ग (जम्मू और कश्मीर) में आयोजित हुए थे। जम्मू और कश्मीर ने पहले तीनों संस्करणों में शीर्ष स्थान हासिल किया।",
            "The Khelo India Winter Games debuted in Gulmarg, Jammu and Kashmir in 2020 to develop winter sports infrastructure in India.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q13", "spt_5",
            "भारत के 'राष्ट्रीय खेल' (National Games of India) की शुरुआत 1924 में लाहौर में किस नाम से हुई थी?",
            "The National Games of India originated in 1924 in Lahore (undivided India) under which historical name?",
            listOf("अखिल भारतीय खेल", "भारतीय ओलंपिक खेल (Indian Olympic Games - First held in Lahore in February 1924)", "राष्ट्रीय एथलेटिक्स मीट", "भारत खेल महोत्सव"),
            listOf("All India Games", "Indian Olympic Games (First organized in Lahore in 1924 to select athletes for 1924 Paris Olympics)", "National Athletics Meet", "Bharat Sports Festival"),
            1,
            "भारतीय राष्ट्रीय खेलों की शुरुआत फरवरी 1924 में लाहौर (अविभाजित भारत) में 'भारतीय ओलंपिक खेल' के रूप में हुई थी ताकि 1924 पेरिस ओलंपिक के लिए भारतीय दल का चयन किया जा सके। 1940 (बॉम्बे) में इसका नाम बदलकर 'राष्ट्रीय खेल' किया गया।",
            "The National Games of India were first held in 1924 as the Indian Olympic Games in Lahore to identify Olympic talent.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q14", "spt_5",
            "37वें राष्ट्रीय खेल (37th National Games of India) अक्टूबर-नवंबर 2023 में किस राज्य में आयोजित किए गए थे जहाँ महाराष्ट्र ने 'राजा भालिंद्र सिंह ट्रॉफी' जीती?",
            "Which state hosted the 37th National Games of India in October-November 2023, where Maharashtra emerged overall champions to win the Raja Bhalindra Singh Trophy?",
            listOf("गुजरात (36वें खेल)", "गोवा (Goa - 37th National Games 2023 / Mascot: 'Moga' the Gaur)", "उत्तराखंड (38वें खेल)", "केरल"),
            listOf("Gujarat (Hosted 36th edition in 2022)", "Goa (Hosted 37th National Games from 25 Oct to 9 Nov 2023; Maharashtra topped tally with 228 medals)", "Uttarakhand (38th National Games host)", "Kerala"),
            1,
            "37वें राष्ट्रीय खेल 2023 गोवा के 5 शहरों में आयोजित हुए। इसका शुभंकर 'मोगा' (भारतीय बाइसन/गौर) था। महाराष्ट्र 80 स्वर्ण सहित 228 पदकों के साथ चैंपियन बना।",
            "Goa hosted the 37th National Games in 2023, featuring 43 sports disciplines with Maharashtra lifting the championship trophy.",
            "Easy"
        ),
        makeSportsQ(
            "spt_5_m1_q15", "spt_5",
            "दक्षिण एशियाई खेल (South Asian Games - SAG) का पहला संस्करण 1984 में किस शहर में आयोजित हुआ था और इसका मुख्यालय कहाँ है?",
            "In which capital city was the first edition of the South Asian Games (SAG / SAF Games) held in September 1984?",
            listOf("नई दिल्ली (भारत)", "काठमांडू, नेपाल (Kathmandu, Nepal - Inaugural SAG 1984 / Secretariat located here)", "कोलंबो (श्रीलंका)", "ढाका (बांग्लादेश)"),
            listOf("New Delhi, India", "Kathmandu, Nepal (First SAF Games held 17-23 September 1984; 7 South Asian nations participated)", "Colombo, Sri Lanka", "Dhaka, Bangladesh"),
            1,
            "पहले दक्षिण एशियाई खेल (SAG) सितंबर 1984 में काठमांडू (नेपाल) में आयोजित हुए थे। भारत दक्षिण एशियाई खेलों के हर संस्करण में पदक तालिका में शीर्ष पर रहा है। इसका सचिवालय भी काठमांडू में है।",
            "The South Asian Games were inaugurated in Kathmandu, Nepal in 1984, contested by the 7 SAARC member nations.",
            "Easy"
        )
    )

    val questions: List<GkQuestion> by lazy {
        baseQuestions + SportsQuestionHelper.generateTopicMocks("spt_5", 2, 5, baseQuestions)
    }
}
