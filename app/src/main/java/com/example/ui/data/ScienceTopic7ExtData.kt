package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic7ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_7_m6_q1", "sci_7",
            "वर्ल्ड वाइड वेब (WWW - World Wide Web) और HTML का आविष्कार 1989 में CERN (स्विट्जरलैंड) में किसने किया था?",
            "Who invented the World Wide Web (WWW), HTML, HTTP, and the first web browser in 1989 while working at CERN?",
            listOf("विंट सेर्फ़", "सर टिम बर्नर्स-ली (Sir Tim Berners-Lee)", "मार्क जुकरबर्ग", "स्टीव जॉब्स"),
            listOf("Vint Cerf (Father of Internet)", "Sir Tim Berners-Lee (British computer scientist at CERN)", "Mark Zuckerberg", "Steve Jobs"),
            1,
            "टिम बर्नर्स-ली ने वैज्ञानिकों के बीच सूचना साझा करने के लिए हाइपरटेक्स्ट, URL, HTTP और HTML की नींव रखी और 1989 में वर्ल्ड वाइड वेब (WWW) की शुरुआत की। विंट सेर्फ़ और बॉब कान को 'इंटरनेट का जनक' (TCP/IP) कहा जाता है।",
            "Sir Tim Berners-Lee formulated the World Wide Web project at CERN in 1989, publishing the first website on August 6, 1991.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q2", "sci_7",
            "कंप्यूटर में 'मस्तिष्क' (Brain of Computer) किसे कहा जाता है जो सभी अंकगणितीय और तार्किक गणनाओं (ALU) को निष्पादित करता है?",
            "Which hardware microchip functions as the primary computational 'Brain of the Computer', executing program instructions and processing data?",
            listOf("हार्ड डिस्क (HDD)", "सीपीयू / सेंट्रल प्रोसेसिंग यूनिट / माइक्रोप्रोसेसर (CPU - Central Processing Unit)", "रैम (RAM)", "मदरबोर्ड"),
            listOf("Hard Disk Drive", "Central Processing Unit (CPU / Microprocessor containing ALU, Registers, and Control Unit)", "Random Access Memory", "Motherboard"),
            1,
            "CPU में तीन प्रमुख भाग होते हैं: 1. ALU (अंकगणितीय एवं तार्किक इकाई), 2. CU (नियंत्रण इकाई जो निर्देशों का प्रवाह नियंत्रित करती है), 3. रजिस्टर्स (अत्यंत तीव्र आंतरिक मेमोरी)।",
            "The CPU fetches, decodes, and executes machine instructions, coordinating system subsystems through its Arithmetic Logic Unit (ALU) and Control Unit (CU).",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q3", "sci_7",
            "कंप्यूटर की कौन-सी प्राथमिक मेमोरी 'अस्थिर' (Volatile Memory) होती है, जिसका डेटा बिजली बंद होते ही तुरंत नष्ट हो जाता है?",
            "Which primary internal semiconductor memory is volatile, losing all its stored runtime data immediately when the electrical power is turned off?",
            listOf("रोम (ROM)", "रैम / रैंडम एक्सेस मेमोरी (RAM - Random Access Memory)", "हार्ड डिस्क", "पेन ड्राइव"),
            listOf("ROM (Read-Only Memory - Non-volatile)", "RAM (Random Access Memory - Volatile primary workspace memory)", "Hard Disk Drive", "Flash USB Drive"),
            1,
            "RAM अस्थिर (Volatile) मेमोरी है जो वर्तमान में चल रहे प्रोग्रामों और ऑपरेटिंग सिस्टम के डेटा को अस्थायी रूप से रखती है। ROM गैर-अस्थिर (Non-volatile) होती है जिसमें BIOS/UEFI फर्मवेयर स्थाई रूप से सुरक्षित रहता है।",
            "Dynamic Random-Access Memory (DRAM) requires constant electrical refreshing; interruption of power dissipates the capacitor charges, erasing stored volatile workspace data.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q4", "sci_7",
            "डिजिटल डेटा भंडारण में 1 गीगाबाइट (1 GB) में कितने मेगाबाइट (MB) होते हैं?",
            "In standardized binary digital data storage metrics, exactly how many Megabytes (MB) constitute 1 Gigabyte (1 GB)?",
            listOf("100 MB", "1,024 MB (1 GB = 1024 MB = 2³⁰ Bytes)", "1,000 MB", "512 MB"),
            listOf("100 MB", "1,024 MB (Binary standard: 1 GB = 1024 MB; 1 TB = 1024 GB)", "1,000 MB", "512 MB"),
            1,
            "डेटा पदानुक्रम: 8 बिट = 1 बाइट; 1,024 बाइट = 1 KB (किलोबाइट); 1,024 KB = 1 MB (मेगाबाइट); 1,024 MB = 1 GB (गीगाबाइट); 1,024 GB = 1 TB (टेराबाइट); 1,024 TB = 1 PB (पेटाबाइट)।",
            "Binary computer architecture standard: 1 Byte = 8 bits, 1 KB = 1024 Bytes, 1 MB = 1024 KB, 1 GB = 1024 MB (2³⁰ bytes), 1 TB = 1024 GB.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q5", "sci_7",
            "इंटरनेट ऑफ थिंग्स (IoT - Internet of Things) क्या है?",
            "What is the technological concept of the 'Internet of Things' (IoT)?",
            listOf("केवल कंप्यूटरों का आपस में जुड़ना", "इंटरनेट से जुड़े भौतिक उपकरणों (घरेलू उपकरण, सेंसर, वाहन) का एक नेटवर्क जो बिना मानवीय हस्तक्षेप के डेटा एकत्र और साझा करते हैं", "केवल ऑनलाइन गेमिंग", "केवल ईमेल भेजना"),
            listOf("Only computers interconnecting", "Network of physical devices (appliances, smart meters, vehicles, wearables) embedded with sensors and software to collect and exchange data autonomously", "Online gaming only", "Email routing"),
            1,
            "IoT में स्मार्ट टीवी, स्मार्ट वॉच, एसी, सीसीटीवी और स्वचालित कारें सेंसर व इंटरनेट से जुड़कर वास्तविक समय में डेटा का आदान-प्रदान और स्वतः नियंत्रण करती हैं (जैसे स्मार्ट होम और स्मार्ट सिटी)।",
            "IoT interconnects physical everyday hardware objects embedded with microcontrollers, sensors, and network connectivity for automated telemetry and remote operation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q6", "sci_7",
            "ब्लॉकचेन तकनीक (Blockchain Technology) की मुख्य विशेषता क्या है जिस पर बिटकॉइन और अन्य क्रिप्टोकरेंसी आधारित हैं?",
            "What is the foundational architectural characteristic of Blockchain Technology underlying cryptocurrencies and smart contracts?",
            listOf("केंद्रीय सर्वर पर डेटा स्टोर होना", "विकेंद्रीकृत, वितरित और अपरिवर्तनीय डिजिटल बहीखाता (Decentralized, Distributed, and Immutable Cryptographic Ledger)", "केवल बैंक द्वारा नियंत्रित होना", "आसानी से हैक होना"),
            listOf("Centralized database", "Decentralized, Distributed, and Cryptographically Immutable Ledger across a peer-to-peer network", "Central bank control", "Easily altered records"),
            1,
            "ब्लॉकचेन एक विकेंद्रीकृत डिजिटल लेजर है जिसमें लेनदेन के रिकॉर्ड्स (ब्लॉक्स) क्रिप्टोग्राफिक हैश द्वारा एक श्रृंखला में जुड़े होते हैं। इसे किसी एक केंद्रीय सर्वर द्वारा बदला या मिटाया नहीं जा सकता।",
            "Blockchain utilizes consensus algorithms (Proof of Work/Stake) and SHA-256 cryptographic hashing to maintain a tamper-evident distributed ledger across decentralized nodes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q7", "sci_7",
            "आर्टिफिशियल इंटेलिजेंस (AI) में प्रयुक्त 'एलएलएम' (LLM) का पूर्ण रूप क्या है (जैसे Gemini, ChatGPT)?",
            "What does the acronym 'LLM' stand for in contemporary Generative Artificial Intelligence and Natural Language Processing?",
            listOf("Local Logic Machine", "लार्ज लैंग्वेज मॉडल (Large Language Model - जैसे Gemini, PaLM, GPT)", "Linear Learning Model", "Logical Language Memory"),
            listOf("Local Logic Machine", "Large Language Model (Transformer-based deep neural networks trained on vast text corpora)", "Linear Learning Model", "Logical Language Memory"),
            1,
            "लार्ज लैंग्वेज मॉडल (LLM) ट्रांसफॉर्मर आर्किटेक्चर पर आधारित विशाल न्यूरल नेटवर्क हैं जो अरबों/खरबों पैरामीटर्स और टेक्स्ट डेटा पर प्रशिक्षित होते हैं और मानव जैसी भाषा समझने व उत्पन्न करने में सक्षम होते हैं।",
            "Large Language Models (LLMs) are deep learning models trained on massive internet-scale text datasets using self-attention mechanisms to generate fluent natural language.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q8", "sci_7",
            "क्वांटम कंप्यूटर (Quantum Computer) पारंपरिक कंप्यूटर के 'बिट्स' (0 या 1) के स्थान पर गणना के लिए किसकी 'सुपरपोजिशन' और 'एंटैंगलमेंट' का उपयोग करते हैं?",
            "Quantum computers replace classical binary bits (0 or 1) with quantum units of information capable of existing simultaneously in superposition of states, known as:",
            listOf("बाइट्स (Bytes)", "क्यूबिट्स / क्वांटम बिट्स (Qubits / Quantum Bits)", "मेगाबिट्स", "प्रोटॉन बिट्स"),
            listOf("Bytes", "Qubits (Quantum Bits - leveraging quantum superposition and entanglement)", "Megabits", "Proton bits"),
            1,
            "क्यूबिट (Qubit) एक साथ 0 और 1 दोनों अवस्थाओं (Superposition) में रह सकता है। क्वांटम उलझाव (Entanglement) के कारण क्वांटम कंप्यूटर कुछ जटिल गणनाओं को सुपरकंप्यूटर से लाखों गुना तेज कर सकते हैं (क्वांटम सर्वोच्चता)।",
            "Qubits exploit quantum superposition and entanglement principles of quantum mechanics, enabling exponential parallel compute power for cryptography and molecular simulation.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_7_m6_q9", "sci_7",
            "दैनिक जीवन में भोजन पकाने के लिए प्रयुक्त 'माइक्रोवेव ओवन' (Microwave Oven) में भोजन किस सिद्धांत से गर्म होता है?",
            "In household Microwave Ovens (~2.45 GHz radiation), how is food rapidly and uniformly heated throughout?",
            listOf("चालन द्वारा बाहरी गर्मी से", "माइक्रोवेव विद्युत चुम्बकीय तरंगें भोजन में उपस्थित जल के ध्रुवीय अणुओं में तीव्र घूर्णन और घर्षण (Dielectric Heating of Polar Water Molecules) पैदा करती हैं", "रासायनिक क्रिया द्वारा", "संवाहन द्वारा"),
            listOf("External conduction", "Dielectric heating: 2.45 GHz microwaves rapidly oscillate polar water molecules, generating internal frictional heat", "Chemical combustion", "Convection current"),
            1,
            "माइक्रोवेव ओवन का मैग्नेट्रॉन 2.45 GHz की सूक्ष्म तरंगें छोड़ता है। भोजन के पानी के अणु (H₂O) द्विध्रुवीय होते हैं जो तरंग के साथ प्रति सेकंड अरबों बार घूमते हैं। आणविक घर्षण से अंदर ही अंदर तीव्र गर्मी पैदा होती है।",
            "Microwave ovens utilize dielectric heating where oscillating electromagnetic fields induce rapid rotational friction among water, fat, and sugar dipole molecules in food.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q10", "sci_7",
            "कारों और वाहनों में सुरक्षा के लिए लगे 'एयरबैग' (Automotive Airbag) दुर्घटना की स्थिति में किस रसायन के तीव्र विस्फोट और नाइट्रोजन गैस भरने से मिलीसेकंड में खुलते हैं?",
            "Automotive safety Airbags inflate within 30-40 milliseconds during high-speed frontal vehicular collisions due to the explosive deflagration of which chemical compound releasing pure Nitrogen gas?",
            listOf("सोडियम क्लोराइड", "सोडियम एजाइड (Sodium Azide - NaN₃ decomposes rapidly into N₂ gas)", "अमोनियम नाइट्रेट", "पोटेशियम नाइट्रेट"),
            listOf("Sodium chloride", "Sodium Azide (NaN₃ - rapidly decomposes: 2NaN₃ → 2Na + 3N₂ gas)", "Ammonium nitrate", "Potassium nitrate"),
            1,
            "सेंसर द्वारा टक्कर महसूस होते ही इग्नाइटर स्पार्क सोडियम एजाइड (NaN₃) को गर्म करता है। यह 30 मिलीसेकंड में विघटित होकर लगभग 70 लीटर शुद्ध नाइट्रोजन (N₂) गैस बनाता है जो एयरबैग को तुरंत फुला देती है।",
            "Impact crash sensors trigger electric ignition of solid Sodium Azide (NaN₃) propellant pellets, releasing non-toxic nitrogen gas (N₂) to cushion occupants before secondary impact.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_7_m6_q11", "sci_7",
            "घरों में प्रयुक्त 'एलईडी बल्ब' (LED - Light Emitting Diode) किस सिद्धांत पर कार्य करते हैं और सीएफएल व तापदीप्त बल्बों से बहुत कम बिजली क्यों लेते हैं?",
            "Solid-state LED lighting functions on which physical semiconductor principle, emitting light with high efficiency and minimal waste heat?",
            listOf("तंतु के अत्यधिक गर्म होने से (Incandescence)", "विद्युत-संदीप्ति (Electroluminescence - p-n संधि डायोड में इलेक्ट्रॉन और होल के पुनर्मिलन से फोटॉन का उत्सर्जन)", "गैस के आयनीकरण से", "रासायनिक दहन से"),
            listOf("Incandescent filament heating", "Electroluminescence (Direct recombination of electrons and holes across a forward-biased semiconductor p-n junction releasing photons)", "Gas ionization", "Chemical oxidation"),
            1,
            "LED में फॉरवर्ड बायस में करंट प्रवाहित करने पर p-n जंक्शन पर इलेक्ट्रॉन और कोटर (Holes) मिलकर सीधे प्रकाश फोटॉन उत्सर्जित करते हैं (विद्युत-संदीप्ति)। इसमें 80-90% विद्युत सीधे प्रकाश में बदलती है (ऊष्मा हानि नगण्य)।",
            "Light Emitting Diodes (LEDs) emit monochromatic photons via direct radiative electron-hole recombination (electroluminescence), converting electrical energy with exceptional luminous efficiency.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q12", "sci_7",
            "स्मार्टफोन और आधुनिक गैजेट्स में प्रयुक्त टचस्क्रीन (Capacitive Touchscreen) हमारी उंगली के स्पर्श को कैसे पहचानती है?",
            "How do modern smartphone Capacitive Touchscreens precisely register touch coordinates upon finger contact?",
            listOf("उंगली के दबाव और भार से (Resistive)", "मानव शरीर की विद्युत चालकता के कारण स्क्रीन के स्थिरवैद्युत क्षेत्र और धारिता (Capacitance) में सूक्ष्म परिवर्तन को मापकर", "उंगली की गर्मी से", "ध्वनि तरंगों से"),
            listOf("Mechanical pressure only", "Changes in local Electrostatic Field and Capacitance induced by the electrical conductivity of the human finger", "Infrared heat transfer", "Acoustic resonance"),
            1,
            "कैपेसिटिव स्क्रीन इंडियम टिन ऑक्साइड (ITO) की पारदर्शी चालक परत से बनी होती है। चूंकि मानव शरीर विद्युत का सुचालक है, उंगली छूते ही स्क्रीन की धारिता (Capacitance) बदल जाती है जिसे कंट्रोलर चिप तुरंत पहचान लेती है।",
            "Capacitive touchscreens maintain a continuous electrostatic grid. Touching the glass draws a minute electrical charge into the conductive human body, altering capacitance at the contact node.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q13", "sci_7",
            "स्मार्टफोन, लैपटॉप और इलेक्ट्रिक वाहनों (EVs) में प्रयुक्त 'लिथियम-आयन बैटरी' (Lithium-Ion Battery) के विकास के लिए 2019 में किन्हें नोबेल पुरस्कार दिया गया था?",
            "Who shared the 2019 Nobel Prize in Chemistry for the revolutionary invention and commercialization of Lithium-Ion Batteries?",
            listOf("वॉटसन और क्रिक", "जॉन गुडइनफ, एम. स्टेनली व्हिटिंगम और अकीरा योशिनो (John Goodenough, Stanley Whittingham, Akira Yoshino)", "रूदरफोर्ड और चैडविक", "मैडम क्यूरी"),
            listOf("Watson and Crick", "John B. Goodenough, M. Stanley Whittingham, and Akira Yoshino (2019 Nobel Chemistry)", "Rutherford and Chadwick", "Marie Curie"),
            1,
            "लिथियम-आयन बैटरियां उच्च ऊर्जा घनत्व वाली रिचार्जेबल बैटरियां हैं जिनमें Li⁺ आयन एनोड (ग्रेफाइट) और कैथोड (LiCoO₂) के बीच चलते हैं। जॉन गुडइनफ 97 वर्ष की आयु में नोबेल पाने वाले सबसे उम्रदराज व्यक्ति बने।",
            "Lithium-ion batteries store electrical potential via reversible intercalation of Li⁺ ions between layered electrodes, revolutionizing portable electronics and electric mobility.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q14", "sci_7",
            "फास्टैग (FASTag) और संपर्क रहित मेट्रो कार्ड किस वायरलेस संचार तकनीक पर कार्य करते हैं?",
            "Electronic toll collection FASTag and contactless smart transit cards operate on which short-range wireless radio frequency technology?",
            listOf("ब्लूटूथ", "रेडियो आवृत्ति पहचान / आरएफआईडी (RFID - Radio Frequency Identification) और एनएफसी (NFC)", "इन्फ्रारेड", "वाई-फाई"),
            listOf("Bluetooth", "Radio Frequency Identification (RFID / Passive UHF RFID tags) & NFC", "Infrared", "Wi-Fi"),
            1,
            "FASTag में निष्क्रिय RFID चिप और एंटीना लगा होता है जो गाड़ी के विंडस्क्रीन पर चिपकता है। टोल प्लाजा का RFID रीडर रेडियो तरंगों द्वारा बिना गाड़ी रोके खाते से टोल राशि स्वतः काट लेता है।",
            "FASTag employs passive Ultra High Frequency (UHF) RFID technology where reader transceiver antennas energize onboard tag transponders to debit toll fees in milliseconds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_7_m6_q15", "sci_7",
            "ऑप्टिकल फाइबर (Optical Fiber) केबल के माध्यम से हाई-स्पीड इंटरनेट डेटा किस भौतिक परिघटना द्वारा बिना ऊर्जा क्षय के प्रेषित होता है?",
            "High-speed fiber-optic telecommunication cables transmit digital data packets over thousands of kilometers using light pulses governed by:",
            listOf("प्रकाश का अपवर्तन", "पूर्ण आंतरिक परावर्तन (Total Internal Reflection - TIR)", "प्रकाश का विवर्तन", "प्रकाश का व्यतिकरण"),
            listOf("Light Refraction", "Total Internal Reflection (TIR - inside high-refractive index fused silica glass core)", "Light Diffraction", "Light Interference"),
            1,
            "ऑप्टिकल फाइबर में शुद्ध सिलिका ग्लास का कोर (Core) होता है जिसके ऊपर कम अपवर्तनांक की क्लैडिंग (Cladding) होती है। जब प्रकाश क्रांतिक कोण से अधिक पर प्रवेश करता है, तो पूर्ण आंतरिक परावर्तन (TIR) द्वारा प्रकाश के रूप में विशाल डेटा तीव्र गति से प्रेषित होता है।",
            "Fiber optics exploit Total Internal Reflection (TIR) within high-purity glass dielectric waveguides to transmit modulated laser light signals across transatlantic distances.",
            "Easy"
        )
    )
}
