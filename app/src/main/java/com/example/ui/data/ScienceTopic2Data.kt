package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic2Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_2_m1_q1", "sci_2",
            "ध्वनि तरंगें (Sound Waves) किस प्रकार की तरंगें होती हैं?",
            "What type of waves are Sound Waves in air?",
            listOf("अनुप्रस्थ यांत्रिक तरंगें (Transverse Mechanical)", "अनुदैर्ध्य यांत्रिक तरंगें (Longitudinal Mechanical)", "विद्युत चुम्बकीय तरंगें (Electromagnetic)", "अप्रगामी तरंगें"),
            listOf("Transverse Mechanical", "Longitudinal Mechanical", "Electromagnetic", "Stationary waves"),
            1,
            "हवा में ध्वनि तरंगें अनुदैर्ध्य यांत्रिक तरंगें होती हैं जिनमें माध्यम के कण तरंग संचरण की दिशा के समानांतर संपीडन (Compression) और विरलन (Rarefaction) के रूप में कंपन करते हैं।",
            "Sound waves in gases and liquids are longitudinal mechanical waves where medium particles oscillate parallel to wave propagation direction via compressions and rarefactions.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q2", "sci_2",
            "ध्वनि की चाल (Speed of Sound) सबसे अधिक किस माध्यम में होती है?",
            "In which medium is the speed of sound the highest?",
            listOf("वायु (Air ~343 m/s)", "जल (Water ~1480 m/s)", "इस्पात / ठोस लोहा (Steel / Iron ~5100 m/s)", "निर्वात (Vacuum)"),
            listOf("Air (~343 m/s)", "Water (~1480 m/s)", "Steel / Solid Iron (~5100 m/s)", "Vacuum"),
            2,
            "ध्वनि की चाल माध्यम के प्रत्यास्थता गुणांक और घनत्व पर निर्भर करती है (v = √(E/ρ))। ठोसों (विशेषकर इस्पात ~5100 m/s) में प्रत्यास्थता सर्वाधिक होने से चाल सबसे अधिक होती है। निर्वात में ध्वनि संचरित नहीं हो सकती।",
            "Sound speed depends on medium elasticity and density (v = √(E/ρ)). Steel's high elastic modulus gives it a velocity of ~5100 m/s, far exceeding water (~1480 m/s) and air (~343 m/s). Sound cannot travel in vacuum.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q3", "sci_2",
            "मानव कान के लिए श्रव्य ध्वनि (Audible Sound) की आवृत्ति परास क्या है?",
            "What is the frequency range of Audible Sound for the human ear?",
            listOf("0 Hz से 20 Hz", "20 Hz से 20,000 Hz (20 kHz)", "20,000 Hz से अधिक", "100 kHz से ऊपर"),
            listOf("0 Hz to 20 Hz", "20 Hz to 20,000 Hz (20 kHz)", "> 20,000 Hz", "> 100 kHz"),
            1,
            "मानव कान 20 हर्ट्ज से 20,000 हर्ट्ज (20 kHz) के बीच की आवृत्तियों को सुन सकता है। 20 Hz से कम अपश्रव्य (Infrasonic) और 20,000 Hz से अधिक पराश्रव्य (Ultrasonic) कहलाती हैं।",
            "The human acoustic audible spectrum spans from 20 Hz to 20,000 Hz (20 kHz). Frequencies below 20 Hz are Infrasonic, and those above 20 kHz are Ultrasonic.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q4", "sci_2",
            "चमगादड़ रात में शिकार और बाधाओं का पता लगाने के लिए किस प्रकार की ध्वनि तरंगों का उपयोग करते हैं?",
            "Bats detect prey and navigate at night using which type of sound waves?",
            listOf("अपश्रव्य तरंगें (Infrasonic)", "श्रव्य ध्वनि", "पराश्रव्य तरंगें (Ultrasonic Waves - Echolocation)", "रेडियो तरंगें"),
            listOf("Infrasonic", "Audible sound", "Ultrasonic Waves (Echolocation)", "Radio waves"),
            2,
            "चमगादड़ उच्च आवृत्ति (20 kHz से ऊपर) की पराश्रव्य तरंगें उत्सर्जित करते हैं जो शिकार या अवरोध से टकराकर वापस आती हैं (इकोलोकेशन / प्रतिध्वनि निर्धारण)।",
            "Bats emit high-frequency ultrasonic chirps (> 20 kHz) and listen to returning echoes to map surroundings and capture prey via echolocation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q5", "sci_2",
            "स्पष्ट प्रतिध्वनि (Echo) सुनने के लिए श्रोता और परावर्तक सतह के बीच न्यूनतम दूरी लगभग कितनी होनी चाहिए?",
            "To hear a distinct Echo, what is the minimum distance required between the sound source and reflecting obstacle in air (v ≈ 344 m/s)?",
            listOf("5.5 मीटर", "11.2 मीटर", "17.2 मीटर (लगभग 17 मीटर)", "34.4 मीटर"),
            listOf("5.5 meters", "11.2 meters", "17.2 meters (~17 m)", "34.4 meters"),
            2,
            "मानव मस्तिष्क में ध्वनि की संवेदना 0.1 सेकंड तक बनी रहती है (Persistence of hearing)। 0.1 सेकंड में ध्वनि द्वारा तय कुल दूरी = 344 × 0.1 = 34.4 मीटर। अतः न्यूनतम परावर्तक दूरी = 34.4 / 2 = 17.2 मीटर होनी चाहिए।",
            "Persistence of hearing is 0.1 s. Total roundtrip distance at 344 m/s is 34.4 m, necessitating a minimum obstacle distance of 34.4 / 2 = 17.2 meters (~56 feet).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q6", "sci_2",
            "ध्वनि का तारत्व (Pitch) मुख्य रूप से ध्वनि के किस गुण पर निर्भर करता है?",
            "The Pitch of a sound, determining whether it sounds shrill or grave, depends primarily on:",
            listOf("आयाम (Amplitude)", "आवृत्ति (Frequency)", "तरंग वेग (Wave Velocity)", "ध्वनि की तीव्रता (Loudness)"),
            listOf("Amplitude", "Frequency", "Wave Velocity", "Loudness"),
            1,
            "तारत्व (Pitch) ध्वनि की आवृत्ति (Frequency) पर निर्भर करता है। उच्च आवृत्ति वाली ध्वनि का तारत्व अधिक और आवाज तीखी/पतली (जैसे महिलाओं और बच्चों की आवाज) होती है। प्रबलता (Loudness) आयाम पर निर्भर करती है।",
            "Pitch is determined directly by sound wave frequency (higher frequency = higher pitch/shriller tone). Loudness depends on amplitude.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q7", "sci_2",
            "डॉप्लर प्रभाव (Doppler Effect) किससे संबंधित है?",
            "The Doppler Effect describes the apparent change in frequency due to:",
            listOf("तापमान परिवर्तन", "श्रोता और ध्वनि/प्रकाश स्रोत के बीच आपेक्षिक गति (Relative Motion)", "माध्यम का घनत्व", "आयाम का क्षय"),
            listOf("Temperature variation", "Relative motion between source and observer", "Medium density", "Amplitude damping"),
            1,
            "जब ध्वनि या प्रकाश का स्रोत और प्रेक्षक एक-दूसरे की ओर या दूर गति करते हैं, तो प्रेक्षक द्वारा अनुभव की जाने वाली आभासी आवृत्ति बदल जाती है। इसे डॉप्लर प्रभाव कहते हैं (जैसे पास आती ट्रेन की सीटी की तीखी आवाज)।",
            "The Doppler effect is the perceived frequency shift of a wave when the wave source and observer are in relative motion towards or away from each other.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q8", "sci_2",
            "प्रकाश का अपवर्तन (Refraction of Light) होने पर प्रकाश का कौन-सा गुण अपरिवर्तित रहता है?",
            "When light undergoes Refraction transitioning from one optical medium to another, which property remains strictly unchanged?",
            listOf("तरंगदैर्घ्य (Wavelength)", "वेग (Velocity)", "आवृत्ति (Frequency)", "तीव्रता (Intensity)"),
            listOf("Wavelength", "Velocity", "Frequency", "Intensity"),
            2,
            "अपवर्तन के दौरान प्रकाश की चाल और तरंगदैर्घ्य (v = fλ) माध्यम के अपवर्तनांक के अनुसार बदल जाते हैं, लेकिन प्रकाश की आवृत्ति (Frequency) स्रोत का गुण होने के कारण सदैव अपरिवर्तित रहती है।",
            "During refraction, wave speed and wavelength adjust according to medium refractive index (v = fλ), but Frequency is determined purely by the emitter source and remains invariant.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m1_q9", "sci_2",
            "हीरे का अत्यधिक चमकना और ऑप्टिकल फाइबर (Optical Fiber) का कार्य सिद्धांत किस परिघटना पर आधारित है?",
            "The brilliant sparkling of diamond and signal transmission in Optical Fibers are based on:",
            listOf("प्रकाश का विवर्तन (Diffraction)", "पूर्ण आंतरिक परावर्तन (Total Internal Reflection - TIR)", "प्रकाश का प्रकीर्णन (Scattering)", "ध्रुवण (Polarization)"),
            listOf("Diffraction", "Total Internal Reflection (TIR)", "Scattering", "Polarization"),
            1,
            "जब प्रकाश सघन माध्यम से विरल माध्यम में क्रांतिक कोण (Critical Angle) से अधिक आपतन कोण पर प्रवेश करता है, तो प्रकाश पूरी तरह परावर्तित होकर उसी माध्यम में लौट आता है। हीरे का क्रांतिक कोण केवल 24.4° होता है।",
            "Total Internal Reflection occurs when light traveling through an optically dense medium strikes an interface at an angle exceeding the critical angle, perfectly reflecting 100% of the light back.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q10", "sci_2",
            "आकाश का रंग नीला दिखाई देने का मुख्य वैज्ञानिक कारण क्या है?",
            "The blue appearance of the clear daytime sky is primarily caused by:",
            listOf("रैले प्रकीर्णन (Rayleigh Scattering of Light)", "प्रकाश का अपवर्तन", "वायुमंडलीय परावर्तन", "ओजोन परत द्वारा अवशोषण"),
            listOf("Rayleigh Scattering of Light", "Atmospheric Refraction", "Specular Reflection", "Ozone Absorption"),
            0,
            "रैले के नियम के अनुसार प्रकीर्णन की तीव्रता I ∝ 1/λ⁴ होती है। नीले और बैंगनी प्रकाश की तरंगदैर्घ्य सबसे छोटी होने के कारण वायुमंडल के महीन कणों द्वारा उनका प्रकीर्णन सर्वाधिक होता है।",
            "By Rayleigh Scattering (I ∝ 1/λ⁴), shorter optical wavelengths (blue and violet) are scattered much more intensely by nitrogen and oxygen molecules than longer red wavelengths.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q11", "sci_2",
            "सूर्योदय और सूर्यास्त के समय सूर्य का रक्ताभ (लाल) दिखाई देना और सूर्य का कुछ मिनट पहले व बाद तक दिखाई देना किन कारणों से होता है?",
            "The reddish color of sunrise/sunset and early sunrise/delayed sunset are caused respectively by:",
            listOf("प्रकीर्णन और वायुमंडलीय अपवर्तन (Scattering and Atmospheric Refraction)", "अपवर्तन और विवर्तन", "ध्रुवण और प्रकीर्णन", "पूर्ण आंतरिक परावर्तन और व्यतिकरण"),
            listOf("Scattering and Atmospheric Refraction", "Refraction and Diffraction", "Polarization and Scattering", "TIR and Interference"),
            0,
            "क्षितिज पर अधिक वायुमंडलीय दूरी तय करने पर नीला प्रकाश प्रकीर्णित होकर बिखर जाता है और केवल लंबी तरंगदैर्घ्य वाला लाल प्रकाश आंखों तक पहुंचता है (प्रकीर्णन)। जबकि वायुमंडलीय अपवर्तन के कारण सूर्य 2 मिनट पहले व बाद तक दिखता है।",
            "Scattering removes short wavelengths, letting long red wavelengths penetrate long atmospheric horizons (red sun). Atmospheric refraction bends light over the horizon, adding ~2 minutes of daylight at dusk and dawn.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m1_q12", "sci_2",
            "निकट दृष्टि दोष (Myopia) के निवारण के लिए किस प्रकार के लेंस का चश्मा प्रयोग किया जाता है?",
            "Which type of corrective lens is prescribed for Myopia (Nearsightedness)?",
            listOf("उत्तल लेंस (Convex Lens)", "अवतल लेंस (Concave Lens / Diverging lens)", "द्विफोकसी लेंस (Bifocal Lens)", "बेलनाकार लेंस (Cylindrical Lens)"),
            listOf("Convex Lens", "Concave Lens (Diverging)", "Bifocal Lens", "Cylindrical Lens"),
            1,
            "मायोपिया में दूर की वस्तु का प्रतिबिम्ब रेटिना से पहले ही बन जाता है। अपसारी अवतल लेंस (Concave lens) प्रकाश किरणों को फैलाकर प्रतिबिम्ब को ठीक रेटिना पर केंद्रित करता है। हाइपरोपिया (दूर दृष्टि) में उत्तल लेंस प्रयुक्त होता है।",
            "In myopia, the eyeball is elongated and distant images focus in front of the retina. A diverging Concave lens spreads incoming parallel rays so they focus sharply on the retina.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q13", "sci_2",
            "लेंस की क्षमता (Power of a Lens) का SI मात्रक क्या है?",
            "What is the SI unit of Optical Power of a Lens (P = 1/f)?",
            listOf("मीटर", "डायोप्टर (Dioptre - D)", "लुमेन (Lumen)", "कैंडेला"),
            listOf("Meter", "Dioptre (D = m⁻¹)", "Lumen", "Candela"),
            1,
            "लेंस की क्षमता P = 1 / f (फोकस दूरी मीटर में)। इसका SI मात्रक डायोप्टर (D = m⁻¹) है। उत्तल लेंस की क्षमता धनात्मक (+) और अवतल लेंस की क्षमता ऋणात्मक (-) होती है।",
            "Optical lens power P = 1/f (focal length in meters). Its unit is Dioptre (D). Convex converging lenses have positive power (+D); concave diverging lenses have negative power (-D).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m1_q14", "sci_2",
            "प्राथमिक इंद्रधनुष (Primary Rainbow) बनने में जल की बूंदों के अंदर प्रकाश का क्या होता है?",
            "In the formation of a Primary Rainbow, light undergoing internal interaction in a raindrop experiences:",
            listOf("दो अपवर्तन और एक आंतरिक परावर्तन (Two Refractions and One Internal Reflection)", "दो अपवर्तन और दो आंतरिक परावर्तन", "केवल एक अपवर्तन", "केवल विवर्तन"),
            listOf("Two Refractions and One Internal Reflection", "Two Refractions and Two Internal Reflections", "Only one refraction", "Only diffraction"),
            0,
            "प्राथमिक इंद्रधनुष में प्रकाश किरण का बूंद में प्रवेश और निकास पर दो बार अपवर्तन और बूंद के भीतर एक बार आंतरिक परावर्तन होता है (कोणीय चौड़ाई ~40°-42°, लाल रंग बाहर)। द्वितीयक में 2 आंतरिक परावर्तन होते हैं।",
            "A primary rainbow forms from two refractions and one internal reflection inside suspended raindrops (subtending ~42° arc with red outside). A secondary rainbow involves two internal reflections.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m1_q15", "sci_2",
            "वाहनों में पीछे का दृश्य देखने (Rear-view mirror) के लिए किस दर्पण का उपयोग किया जाता है?",
            "Which type of mirror is fitted as a Rear-View Mirror in automobiles?",
            listOf("समतल दर्पण (Plane Mirror)", "अवतल दर्पण (Concave Mirror)", "उत्तल दर्पण (Convex Mirror)", "परवलयाकार दर्पण"),
            listOf("Plane Mirror", "Concave Mirror", "Convex Mirror", "Parabolic Mirror"),
            2,
            "उत्तल दर्पण (Convex mirror) सदैव सीधा, आभासी और छोटा प्रतिबिम्ब बनाता है तथा इसका दृष्टि क्षेत्र (Field of view) बहुत व्यापक होता है, जिससे चालक को पीछे का बड़ा क्षेत्र दिखाई देता है।",
            "Convex mirrors are used because they always produce erect, virtual, and diminished images while providing a significantly wider field of view behind the vehicle.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_2_m2_q1", "sci_2",
            "दांतों के डॉक्टर (Dentist) और शेविंग मिरर के रूप में किस दर्पण का उपयोग किया जाता है?",
            "Which mirror is used by Dentists and for Shaving Mirrors to examine close enlarged images?",
            listOf("उत्तल दर्पण (Convex Mirror)", "अवतल दर्पण (Concave Mirror)", "समतल दर्पण (Plane Mirror)", "बेलनाकार दर्पण"),
            listOf("Convex Mirror", "Concave Mirror", "Plane Mirror", "Cylindrical Mirror"),
            1,
            "जब किसी वस्तु को अवतल दर्पण के ध्रुव और फोकस के बीच रखा जाता है, तो यह सीधा और अत्यधिक आवर्धित (Enlarged) आभासी प्रतिबिम्ब बनाता है।",
            "Concave mirrors produce magnified, erect virtual images when an object is positioned between the focal point and optical pole, ideal for dentistry and shaving.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m2_q2", "sci_2",
            "साबुन के पतले झाग और तेल की पतली परत पर चमकीले रंग दिखाई देना किस प्रकाशीय परिघटना का परिणाम है?",
            "The vibrant swirling colors seen on thin soap bubbles and oil slicks on wet roads are due to:",
            listOf("प्रकाश का प्रकीर्णन", "प्रकाश का व्यतिकरण (Interference of Light)", "प्रकाश का विवर्तन", "प्रकाश का ध्रुवण"),
            listOf("Scattering", "Interference of Light (Thin Film Interference)", "Diffraction", "Polarization"),
            1,
            "पतली फिल्म (Thin film) की ऊपरी और निचली सतहों से परावर्तित होने वाली प्रकाश तरंगों के बीच रचनात्मक और विनाशी व्यतिकरण (Interference) के कारण चमकीले रंग दिखाई देते हैं।",
            "Thin-film interference occurs when light waves reflecting off upper and lower boundaries of a thin layer constructively and destructively interfere, generating vivid iridescent colors.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m2_q3", "sci_2",
            "तारों का टिमटिमाना (Twinkling of Stars) किस भौतिक परिघटना के कारण होता है?",
            "The Twinkling of Stars in the night sky is caused by:",
            listOf("प्रकाश का निरंतर वायुमंडलीय अपवर्तन (Atmospheric Refraction)", "तारों का आंतरिक प्रकाश का उतार-चढ़ाव", "प्रकाश का प्रकीर्णन", "ओजोन परत द्वारा परावर्तन"),
            listOf("Atmospheric Refraction of starlight through varying air density layers", "Pulsating stellar emission", "Rayleigh Scattering", "Reflection from clouds"),
            0,
            "वायुमंडल की विभिन्न परतों का तापमान और घनत्व निरंतर बदलता रहता है, जिससे उनका अपवर्तनांक बदलता रहता है। बिंदु स्रोत तारों का प्रकाश अपवर्तित होकर आंख तक अस्थिर मार्ग से पहुंचता है।",
            "Atmospheric refraction through turbulent layers of fluctuating temperature and density continually shifts the apparent position and intensity of distant point-source starlight.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m2_q4", "sci_2",
            "मृगमरीचिका (Mirage) रेगिस्तान में गर्मियों में बनने का मुख्य कारण क्या है?",
            "What causes the optical illusion of a Mirage on hot desert sands and paved highways in summer?",
            listOf("प्रकाश का विवर्तन", "पूर्ण आंतरिक परावर्तन एवं अपवर्तन (Total Internal Reflection & Refraction)", "प्रकाश का प्रकीर्णन", "प्रकाश का ध्रुवण"),
            listOf("Diffraction", "Total Internal Reflection and Refraction in heated air layers", "Scattering", "Polarization"),
            1,
            "गर्म जमीन के संपर्क वाली हवा अत्यधिक गर्म और विरल हो जाती है जबकि ऊपर की हवा सघन होती है। आसमान से आने वाला प्रकाश निरंतर मुड़ते हुए क्रांतिक कोण पार कर पूर्ण आंतरिक परावर्तित हो जाता है।",
            "Intensely heated ground lowers the density and refractive index of near-surface air; descending light rays bend progressively until Total Internal Reflection occurs, forming an inverted sky image resembling water.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m2_q5", "sci_2",
            "प्रकाशिक तंतु (Optical Fiber) में सिग्नल का ह्रास अत्यंत कम होता है। इसका मुख्य घटक क्या होता है?",
            "What are the two concentric layers of an Optical Fiber designed for total internal reflection?",
            listOf("कोर (Core, उच्च अपवर्तनांक) और क्लैडिंग (Cladding, निम्न अपवर्तनांक)", "कोर (निम्न अपवर्तनांक) और क्लैडिंग (उच्च अपवर्तनांक)", "केवल धातु का तार", "केवल प्लास्टिक शीट"),
            listOf("Core (high refractive index) and Cladding (lower refractive index)", "Core (low index) and Cladding (high index)", "Solid copper wire", "Plastic film"),
            0,
            "ऑप्टिकल फाइबर में केंद्रीय कोर (Core, n₁ ~1.5) का अपवर्तनांक बाहरी आवरण क्लैडिंग (Cladding, n₂ ~1.46) से अधिक होता है (n₁ > n₂), जिससे सिग्नल पूर्ण आंतरिक परावर्तन (TIR) द्वारा संचरित होता है।",
            "An optical fiber consists of a high-refractive-index glass/plastic Core surrounded by a lower-refractive-index Cladding (n_core > n_cladding), confining light by repeated Total Internal Reflection.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m2_q6", "sci_2",
            "धूप के चश्मों (Sunglasses) में चकाचौंध (Glare) को कम करने के लिए किसका उपयोग किया जाता है?",
            "What optical element is incorporated in premium sunglasses to eliminate blinding horizontal glare?",
            listOf("अवतल लेंस", "पोलेरॉइड / ध्रुवक (Polaroid Sheets)", "प्रिज्म", "उत्तल दर्पण"),
            listOf("Concave lens", "Polaroid Sheets (Polarizers)", "Prism", "Convex mirror"),
            1,
            "पानी या सड़क से परावर्तित प्रकाश क्षैतिज रूप से ध्रुवित (Horizontally polarized) होता है जो चकाचौंध पैदा करता है। पोलेरॉइड चश्मे में ऊर्ध्वाधर संचरण अक्ष होता है जो इस क्षैतिज प्रकाश को अवशोषित कर देता है।",
            "Light reflected from flat horizontal surfaces (water, roads) is predominantly horizontally polarized, causing glare. Vertical polaroid filters selectively absorb this glare without reducing general visibility.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m2_q7", "sci_2",
            "प्रकाश का वर्ण विक्षेपण (Dispersion of Light) प्रिज्म द्वारा होने पर किस रंग का विचलन (Deviation) सबसे अधिक और किसका सबसे कम होता है?",
            "When white light passes through a glass prism, which color experiences the Maximum and Minimum angular deviation respectively?",
            listOf("अधिकतम: लाल, न्यूनतम: बैंगनी", "अधिकतम: बैंगनी (Violet), न्यूनतम: लाल (Red)", "अधिकतम: पीला, न्यूनतम: हरा", "सभी का समान विचलन"),
            listOf("Max: Red, Min: Violet", "Max: Violet, Min: Red", "Max: Yellow, Min: Green", "Equal deviation"),
            1,
            "कांच में बैंगनी रंग की चाल सबसे कम और अपवर्तनांक (n_v) सबसे अधिक होता है (कॉशी सूत्र n ∝ 1/λ²), अतः बैंगनी रंग का विचलन सर्वाधिक (VIBGYOR में V सबसे नीचे) और लाल रंग का विचलन न्यूनतम होता है।",
            "According to Cauchy's dispersion formula, glass has the highest refractive index for violet (shortest wavelength) and lowest for red, deflecting violet light the most and red light the least.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m2_q8", "sci_2",
            "हवा का बुलबुला जल के अंदर किस प्रकार के लेंस की भांति व्यवहार करता है?",
            "An air bubble trapped inside a body of water behaves optically as which type of lens?",
            listOf("उत्तल लेंस (अभिसारी)", "अवतल लेंस (अपसारी / Diverging Lens)", "समतल कांच पट्टिका", "दर्पण"),
            listOf("Convex lens (Converging)", "Concave lens (Diverging Lens)", "Flat glass slab", "Mirror"),
            1,
            "यद्यपि हवा के बुलबुले की आकृति उभयोत्तल (Double Convex) होती है, परन्तु हवा का अपवर्तनांक (n=1) पानी के अपवर्तनांक (n=1.33) से कम होने के कारण यह अपसारी अवतल लेंस (Diverging lens) की भांति व्यवहार करता है।",
            "Although physically convex in geometry, because air inside has a lower refractive index than the surrounding water (n_air < n_water), light rays diverge, making it act as a Concave Diverging Lens.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m2_q9", "sci_2",
            "खतरे के सिग्नल का प्रकाश लाल रंग (Red Light) का ही क्यों बनाया जाता है?",
            "Why is Red Light universally chosen for emergency brake lights and danger signals?",
            listOf("लाल रंग सुंदर होता है", "लाल रंग की तरंगदैर्घ्य सबसे लंबी होने के कारण इसका प्रकीर्णन (Scattering) सबसे कम होता है", "यह तेजी से चलता है", "यह आँखों को चुभता है"),
            listOf("Aesthetic appeal", "Red possesses the longest visible wavelength, minimizing atmospheric Rayleigh scattering in fog/smoke", "Travels faster", "Irritates the eyes"),
            1,
            "रैले के नियमानुसार प्रकीर्णन I ∝ 1/λ⁴ होता है। लाल प्रकाश की तरंगदैर्घ्य (~700 nm) सर्वाधिक होने के कारण कोहरे और धुएं में इसका प्रकीर्णन न्यूनतम होता है और यह अत्यधिक दूरी से भी स्पष्ट दिखाई देता है।",
            "Red light has the longest wavelength in the visible spectrum (~700 nm). By Rayleigh's law (Scattering ∝ 1/λ⁴), it scatters the least through mist and smoke, remaining visible over greatest distances.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m2_q10", "sci_2",
            "मानव आँख की स्पष्ट दृष्टि की न्यूनतम दूरी (Least Distance of Distinct Vision - D) सामान्य आँख के लिए कितनी होती है?",
            "What is the Least Distance of Distinct Vision (Near Point) for a normal healthy human eye?",
            listOf("10 सेमी", "25 सेमी (25 cm)", "50 सेमी", "अनंत (Infinity)"),
            listOf("10 cm", "25 cm", "50 cm", "Infinity"),
            1,
            "सामान्य वयस्क आँख के लिए स्पष्ट दृष्टि की न्यूनतम दूरी (निकट बिंदु) 25 सेमी होती है। दूर बिंदु (Far point) अनंत पर होता है।",
            "The near point for a standard healthy human eye, accommodating without muscle strain, is exactly 25 cm (10 inches). The far point is infinity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m2_q11", "sci_2",
            "जरा दृष्टि दोष (Presbyopia), जो वृद्धावस्था में सिलियरी मांसपेशियों की शिथिलता से होता है, को ठीक करने के लिए कौन-सा लेंस प्रयुक्त होता है?",
            "Presbyopia, age-related loss of accommodation in elderly eyes, is corrected using:",
            listOf("केवल उत्तल लेंस", "केवल अवतल लेंस", "द्विफोकसी लेंस (Bifocal Lens - ऊपरी अवतल, निचला उत्तल)", "बेलनाकार लेंस"),
            listOf("Only Convex lens", "Only Concave lens", "Bifocal Lens (Upper concave for distance, lower convex for reading)", "Cylindrical lens"),
            2,
            "जरा दूरदर्शिता में आँख की समंजन क्षमता घट जाती है। इसके निवारण हेतु बाईफोकल लेंस प्रयुक्त होता है जिसका ऊपरी भाग दूर की दृष्टि हेतु अवतल और निचला भाग पढ़ने हेतु उत्तल लेंस होता है।",
            "Presbyopia impairs both near and distant accommodation due to hardening of the lens; it is corrected using Bifocal Lenses (upper segment concave for distance, lower convex for close reading).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m2_q12", "sci_2",
            "सरल सूक्ष्मदर्शी (Simple Microscope / Magnifying Glass) में किसका उपयोग किया जाता है?",
            "A Simple Microscope consists essentially of which optical element?",
            listOf("कम फोकस दूरी का उत्तल लेंस (Convex lens of short focal length)", "अधिक फोकस दूरी का अवतल लेंस", "समतल दर्पण", "प्रिज्म"),
            listOf("Convex lens of short focal length", "Concave lens of long focal length", "Plane mirror", "Prism"),
            0,
            "सरल सूक्ष्मदर्शी कम फोकस दूरी का उत्तल लेंस होता है। जब वस्तु को लेंस और उसके फोकस के बीच रखा जाता है, तो 25 सेमी पर सीधा, आभासी और आवर्धित प्रतिबिम्ब (M = 1 + D/f) बनता है।",
            "A simple magnifying glass is a single converging convex lens of short focal length that forms an upright, magnified virtual image (Magnification M = 1 + D/f).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m2_q13", "sci_2",
            "खगोलीय दूरदर्शी (Astronomical Telescope) में अभिदृश्यक (Objective) और नेत्रिका (Eyepiece) लेंस कैसे होते हैं?",
            "In an Astronomical Refracting Telescope, the Objective lens compared to the Eyepiece has:",
            listOf("बड़ा द्वारक और लंबी फोकस दूरी (Large aperture and long focal length)", "छोटा द्वारक और छोटी फोकस दूरी", "अवतल लेंस", "समतल लेंस"),
            listOf("Large aperture and long focal length (f_o > f_e)", "Small aperture and short focal length", "Concave lens", "Flat lens"),
            0,
            "खगोलीय दूरदर्शी का अभिदृश्यक लेंस दूर स्थित तारों से अधिकतम प्रकाश एकत्र करने के लिए बड़े द्वारक और लंबी फोकस दूरी (f_o) का उत्तल लेंस होता है, जबकि नेत्रिका छोटी फोकस दूरी (f_e) की होती है।",
            "The objective lens has a large diameter and long focal length (f_o) to gather maximum starlight flux, while the eyepiece is a smaller lens of short focal length (f_e) for high angular magnification (M = -f_o/f_e).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m2_q14", "sci_2",
            "प्रकाश की तरंग प्रकृति (Wave Nature of Light) को सिद्ध करने वाली सबसे निर्णायक परिघटनाएं कौन-सी हैं?",
            "Which optical phenomena definitively proved the Wave Theory of Light over Newton's corpuscular theory?",
            listOf("परावर्तन और अपवर्तन", "व्यतिकरण, विवर्तन और ध्रुवण (Interference, Diffraction and Polarization)", "प्रकाश विद्युत प्रभाव", "कॉम्पटन प्रभाव"),
            listOf("Reflection and Refraction", "Interference, Diffraction and Polarization", "Photoelectric Effect", "Compton Effect"),
            1,
            "यंग का द्वि-स्लिट व्यतिकरण प्रयोग और विवर्तन तथा ध्रुवण केवल तरंग सिद्धांत (हाइगेन्स और मैक्सवेल) द्वारा ही समझाए जा सकते हैं। प्रकाश विद्युत प्रभाव प्रकाश की कण प्रकृति (फोटॉन) को सिद्ध करता है।",
            "Interference (Young's double-slit), Fresnel diffraction, and wave polarization provided irrefutable empirical proof of the transverse electromagnetic wave nature of light.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m2_q15", "sci_2",
            "प्रकाश के ध्रुवण (Polarization of Light) की परिघटना यह सिद्ध करती है कि प्रकाश तरंगें कैसी होती हैं?",
            "The phenomenon of Polarization specifically proves that light waves are:",
            listOf("अनुदैर्ध्य तरंगें (Longitudinal)", "अनुप्रस्थ तरंगें (Transverse Waves)", "यांत्रिक तरंगें", "स्थैतिक तरंगें"),
            listOf("Longitudinal waves", "Transverse Waves", "Mechanical waves", "Static waves"),
            1,
            "ध्रुवण (Polarization) केवल अनुप्रस्थ तरंगों (Transverse waves) में ही संभव है, जिसमें कंपन तरंग संचरण की दिशा के लंबवत होते हैं। ध्वनि तरंगें अनुदैर्ध्य होने के कारण ध्रुवित नहीं की जा सकतीं।",
            "Polarization is unique exclusively to Transverse waves whose oscillations occur perpendicular to the direction of propagation; longitudinal sound waves cannot be polarized.",
            "Moderate"
        )
    )
}
