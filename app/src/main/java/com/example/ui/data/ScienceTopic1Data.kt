package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic1Data {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 1 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m1_q1", "sci_1",
            "अंतर्राष्ट्रीय मात्रक प्रणाली (SI) में ज्योति तीव्रता (Luminous Intensity) का मूल मात्रक क्या है?",
            "What is the base unit of Luminous Intensity in the International System of Units (SI)?",
            listOf("एम्पीयर (Ampere)", "कैंडेला (Candela)", "मोल (Mole)", "केल्विन (Kelvin)"),
            listOf("Ampere", "Candela", "Mole", "Kelvin"),
            1,
            "SI प्रणाली में 7 मूल मात्रक हैं: लंबाई (मीटर), द्रव्यमान (किलोग्राम), समय (सेकंड), विद्युत धारा (एम्पीयर), तापमान (केल्विन), पदार्थ की मात्रा (मोल), और ज्योति तीव्रता (कैंडेला - cd)।",
            "There are 7 base SI units: Meter (length), Kilogram (mass), Second (time), Ampere (current), Kelvin (temperature), Mole (amount of substance), and Candela (luminous intensity - cd).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m1_q2", "sci_1",
            "न्यूटन के गति के किस नियम को 'जड़त्व का नियम' (Law of Inertia) भी कहा जाता है?",
            "Which of Newton's laws of motion is also known as the 'Law of Inertia'?",
            listOf("प्रथम नियम (First Law)", "द्वितीय नियम (Second Law)", "तृतीय नियम (Third Law)", "गुरुत्वाकर्षण का नियम (Law of Gravitation)"),
            listOf("First Law", "Second Law", "Third Law", "Law of Gravitation"),
            0,
            "न्यूटन का प्रथम नियम कहता है कि प्रत्येक वस्तु अपनी विरामावस्था या सरल रेखा में एकसमान गति की अवस्था में तब तक बनी रहती है जब तक कि उस पर कोई बाह्य बल न लगाया जाए। इसे जड़त्व का नियम कहते हैं।",
            "Newton's First Law states that an object remains in a state of rest or uniform motion in a straight line unless acted upon by an external net force. It defines the property of inertia.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m1_q3", "sci_1",
            "सार्वत्रिक गुरुत्वाकर्षण नियतांक (Universal Gravitational Constant - G) का मान क्या है?",
            "What is the value of the Universal Gravitational Constant (G)?",
            listOf("9.8 m/s²", "6.674 × 10⁻¹¹ N·m²/kg²", "6.674 × 10¹¹ N·m²/kg²", "3 × 10⁸ m/s"),
            listOf("9.8 m/s²", "6.674 × 10⁻¹¹ N·m²/kg²", "6.674 × 10¹¹ N·m²/kg²", "3 × 10⁸ m/s"),
            1,
            "सार्वत्रिक गुरुत्वाकर्षण नियतांक G = 6.674 × 10⁻¹¹ N·m²/kg² होता है। इसका मान हेनरी कैवेंडिश ने सर्वप्रथम टॉर्सन बैलेंस द्वारा मापा था।",
            "The Universal Gravitational Constant G = 6.674 × 10⁻¹¹ N·m²/kg². Its value was first accurately determined by Henry Cavendish using a torsion balance.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m1_q4", "sci_1",
            "पृथ्वी की सतह से पलायन वेग (Escape Velocity) का मान लगभग कितना होता है?",
            "What is the approximate value of the Escape Velocity from the Earth's surface?",
            listOf("7.9 km/s", "11.2 km/s", "2.38 km/s", "42.1 km/s"),
            listOf("7.9 km/s", "11.2 km/s", "2.38 km/s", "42.1 km/s"),
            1,
            "पृथ्वी से किसी वस्तु को गुरुत्वाकर्षण क्षेत्र से बाहर भेजने के लिए आवश्यक न्यूनतम वेग पलायन वेग (ve = √(2gR)) कहलाता है, जो पृथ्वी के लिए लगभग 11.2 किमी/सेकंड है। चंद्रमा के लिए यह 2.38 किमी/सेकंड है।",
            "Escape velocity (ve = √(2gR)) is the minimum speed needed for a free object to escape from the gravitational influence of a celestial body. For Earth, it is approximately 11.2 km/s (and 2.38 km/s for the Moon).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m1_q5", "sci_1",
            "रॉकेट का प्रक्षेपण भौतिकी के किस संरक्षण सिद्धांत पर आधारित है?",
            "Rocket propulsion is based on which conservation principle in physics?",
            listOf("ऊर्जा संरक्षण (Conservation of Energy)", "द्रव्यमान संरक्षण (Conservation of Mass)", "रेखीय संवेग संरक्षण (Conservation of Linear Momentum)", "कोणीय संवेग संरक्षण (Conservation of Angular Momentum)"),
            listOf("Conservation of Energy", "Conservation of Mass", "Conservation of Linear Momentum", "Conservation of Angular Momentum"),
            2,
            "रॉकेट का कार्य सिद्धांत न्यूटन के तीसरे नियम और रेखीय संवेग संरक्षण के नियम (Law of Conservation of Linear Momentum) पर आधारित है। तीव्र वेग से निकलने वाली गैसें रॉकेट को आगे की ओर संवेग प्रदान करती हैं।",
            "Rocket propulsion operates on Newton's third law of motion and the principle of Conservation of Linear Momentum. High-velocity exhaust gases exert an equal and opposite momentum forward.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m1_q6", "sci_1",
            "जब कोई लिफ्ट एकसमान त्वरण (Uniform Acceleration 'a') से ऊपर की ओर जाती है, तो उसमें खड़े व्यक्ति का आभासी भार क्या होगा?",
            "When an elevator accelerates upward with a uniform acceleration 'a', what happens to the apparent weight of a person inside?",
            listOf("वास्तविक भार से कम होगा", "वास्तविक भार से अधिक होगा (R = m(g + a))", "अपरिवर्तित रहेगा", "शून्य हो जाएगा"),
            listOf("Less than true weight", "Greater than true weight (R = m(g + a))", "Remains unchanged", "Becomes zero"),
            1,
            "ऊपर की ओर त्वरित लिफ्ट में व्यक्ति पर नीचे की ओर छद्म बल (Pseudo force) लगता है, जिससे प्रतिक्रिया बल R = m(g + a) हो जाता है, अतः आभासी भार बढ़ जाता है।",
            "In an upward accelerating elevator, the pseudo force acts downward on the occupant, making the normal reaction R = m(g + a), which increases the apparent weight.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m1_q7", "sci_1",
            "कार्य (Work) और ऊर्जा (Energy) का SI मात्रक जूल (Joule) है। 1 जूल कितने अर्ग (Ergs) के बराबर होता है?",
            "The SI unit of work and energy is Joule. 1 Joule is equal to how many ergs?",
            listOf("10⁵ erg", "10⁶ erg", "10⁷ erg", "10⁸ erg"),
            listOf("10⁵ erg", "10⁶ erg", "10⁷ erg", "10⁸ erg"),
            2,
            "1 जूल = 1 न्यूटन × 1 मीटर = 10⁵ डाइन × 10² सेमी = 10⁷ अर्ग (Ergs)। अर्ग CGS प्रणाली में कार्य/ऊर्जा का मात्रक है।",
            "1 Joule = 1 N × 1 m = 10⁵ dyne × 10² cm = 10⁷ ergs. Erg is the CGS unit of work and energy.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m1_q8", "sci_1",
            "घूर्णन कर रही किसी वस्तु के जड़त्व आघूर्ण (Moment of Inertia) और कोणीय वेग (Angular Velocity) के गुणनफल को क्या कहते हैं?",
            "What is the product of Moment of Inertia (I) and Angular Velocity (ω) of a rotating body called?",
            listOf("बल आघूर्ण (Torque)", "कोणीय संवेग (Angular Momentum)", "अपकेंद्रीय बल (Centrifugal Force)", "घूर्णन गतिज ऊर्जा (Rotational KE)"),
            listOf("Torque", "Angular Momentum", "Centrifugal Force", "Rotational Kinetic Energy"),
            1,
            "कोणीय संवेग L = I × ω होता है। जब तक कोई बाह्य बल आघूर्ण (External Torque) न लगे, निकाय का कुल कोणीय संवेग संरक्षित रहता है (उदा. बैले डांसर का घूमना)।",
            "Angular Momentum L = I × ω (product of moment of inertia and angular velocity). In the absence of an external torque, total angular momentum remains conserved.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m1_q9", "sci_1",
            "वाशिंग मशीन का कार्य सिद्धांत और दूध से मक्खन अलग करने की प्रक्रिया किस पर आधारित है?",
            "The working principle of a washing machine spin-dryer and cream separation from milk is based on which concept?",
            listOf("अभिकेंद्रीय बल (Centripetal Force)", "अपकेंद्रीकरण / अपकेंद्रीय बल प्रभाव (Centrifugation / Centrifugal effect)", "गुरुत्वाकर्षण खिंचाव (Gravitational Pull)", "पृष्ठ तनाव (Surface Tension)"),
            listOf("Centripetal Force", "Centrifugation / Centrifugal effect", "Gravitational Pull", "Surface Tension"),
            1,
            "अपकेंद्रीकरण (Centrifugation) में घूर्णन के दौरान भारी कण परिधि की ओर बाहर धकेले जाते हैं और हल्के कण (जैसे मक्खन) केंद्र के निकट एकत्र होते हैं।",
            "Centrifugation uses centrifugal force/inertia where denser particles are forced outward to the perimeter while lighter particles (like cream/butter) separate near the center.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m1_q10", "sci_1",
            "पृथ्वी के केंद्र पर किसी वस्तु का गुरुत्वीय त्वरण (g) और भार (Weight) कितना होता है?",
            "What is the acceleration due to gravity (g) and weight of an object at the center of the Earth?",
            listOf("अधिकतम", "शून्य (g = 0, Weight = 0)", "अनंत (Infinite)", "सतह के बराबर"),
            listOf("Maximum", "Zero (g = 0, Weight = 0)", "Infinite", "Same as surface"),
            1,
            "पृथ्वी के केंद्र पर चारों ओर से समान गुरुत्वीय खिंचाव होने के कारण परिणामी गुरुत्वीय त्वरण g = 0 होता है, अतः किसी भी वस्तु का भार W = mg = 0 (भारहीनता) होगा।",
            "At the center of the Earth, gravitational pull from all directions cancels out, resulting in g = 0 and consequently zero apparent weight (W = mg = 0).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m1_q11", "sci_1",
            "एक हॉर्सपावर (1 Horsepower - HP) कितने वाट (Watts) के बराबर होता है?",
            "One Horsepower (1 HP) is equal to how many Watts?",
            listOf("700 W", "746 W", "786 W", "1000 W"),
            listOf("700 W", "746 W", "786 W", "1000 W"),
            1,
            "1 ब्रिटिश हॉर्सपावर = 746 वाट (Watts) होता है। वाट शक्ति (Power = Work/Time) का SI मात्रक है।",
            "1 British Horsepower = 746 Watts. Watt (Joule/second) is the SI unit of power.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m1_q12", "sci_1",
            "बरनौली का प्रमेय (Bernoulli's Principle) किस भौतिक राशि के संरक्षण पर आधारित है?",
            "Bernoulli's Principle in fluid dynamics is based on the conservation of which quantity?",
            listOf("द्रव्यमान (Mass)", "संवेग (Momentum)", "ऊर्जा (Energy)", "दाब (Pressure)"),
            listOf("Mass", "Momentum", "Energy", "Pressure"),
            2,
            "बरनौली प्रमेय आदर्श तरल के धारारेखीय प्रवाह में प्रति एकांक आयतन कुल ऊर्जा (दाब ऊर्जा + गतिज ऊर्जा + स्थितिज ऊर्जा = नियतांक) के संरक्षण को दर्शाता है। हवाई जहाज के पंखों का लिफ्ट इसी सिद्धांत पर काम करता है।",
            "Bernoulli's equation represents the conservation of mechanical energy in steady streamline flow of an ideal incompressible fluid (Pressure Energy + Kinetic Energy + Potential Energy = Constant).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m1_q13", "sci_1",
            "वर्षा की बूंदों का गोलाकार रूप धारण करने का मुख्य भौतिक कारण क्या है?",
            "What is the primary physical reason why falling raindrops acquire a spherical shape?",
            listOf("श्यानता (Viscosity)", "पृष्ठ तनाव (Surface Tension)", "वायुमंडलीय दाब (Atmospheric Pressure)", "गुरुत्वाकर्षण (Gravity)"),
            listOf("Viscosity", "Surface Tension", "Atmospheric Pressure", "Gravity"),
            1,
            "पृष्ठ तनाव (Surface Tension) के कारण द्रव की मुक्त सतह न्यूनतम पृष्ठीय क्षेत्रफल घेरने का प्रयास करती है। दिए गए आयतन के लिए गोले का पृष्ठीय क्षेत्रफल न्यूनतम होता है।",
            "Due to surface tension, liquids tend to minimize their surface area. For a given volume, a sphere possesses the minimum surface area, causing raindrops to be spherical.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m1_q14", "sci_1",
            "श्यानता गुणांक (Coefficient of Viscosity) का SI मात्रक क्या है?",
            "What is the SI unit of the Coefficient of Viscosity?",
            listOf("पास्कल (Pascal)", "पॉइज़ुली / पास्कल-सेकंड (Poiseuille / Pa·s)", "न्यूटन/मीटर (N/m)", "जूल-सेकंड (J·s)"),
            listOf("Pascal", "Poiseuille / Pascal-second (Pa·s)", "Newton/meter (N/m)", "Joule-second (J·s)"),
            1,
            "श्यानता का SI मात्रक पास्कल-सेकंड (Pa·s) या पॉइज़ुली (Poiseuille) या N·s/m² है। CGS मात्रक पॉइज़ (Poise) है (1 Pa·s = 10 Poise)।",
            "The SI unit of dynamic viscosity is Pascal-second (Pa·s) or Poiseuille (N·s/m²). The CGS unit is Poise (1 Pa·s = 10 Poise).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m1_q15", "sci_1",
            "हाइड्रोलिक ब्रेक और हाइड्रोलिक लिफ्ट भौतिकी के किस नियम पर कार्य करते हैं?",
            "Hydraulic brakes and hydraulic lifts operate on which law of physics?",
            listOf("आर्किमिडीज का सिद्धांत (Archimedes' Principle)", "पास्कल का नियम (Pascal's Law)", "हुक का नियम (Hooke's Law)", "बॉयल का नियम (Boyle's Law)"),
            listOf("Archimedes' Principle", "Pascal's Law", "Hooke's Law", "Boyle's Law"),
            1,
            "पास्कल के नियम के अनुसार, किसी परिबद्ध असम्पीड्य द्रव के किसी बिंदु पर लगाया गया दाब बिना क्षय हुए सभी दिशाओं में समान रूप से संचरित होता है।",
            "According to Pascal's Law, pressure applied to an enclosed incompressible fluid is transmitted undiminished in all directions throughout the fluid.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 2 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m2_q1", "sci_1",
            "दाब (Pressure) की SI इकाई क्या है?",
            "What is the SI unit of Pressure?",
            listOf("न्यूटन (Newton)", "पास्कल (Pascal - N/m²)", "बार (Bar)", "टॉर (Torr)"),
            listOf("Newton", "Pascal (N/m²)", "Bar", "Torr"),
            1,
            "दाब = बल / क्षेत्रफल (P = F/A)। इसका SI मात्रक न्यूटन प्रति वर्ग मीटर (N/m²) है जिसे पास्कल (Pascal) कहा जाता है। 1 Bar = 10⁵ Pa।",
            "Pressure = Force / Area. Its SI unit is Newton per square meter (N/m²), designated as Pascal (Pa). 1 Bar = 10⁵ Pa.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m2_q2", "sci_1",
            "जब कोई जहाज नदी से समुद्र में प्रवेश करता है, तो उसके जलस्तर में क्या परिवर्तन आता है?",
            "When a ship enters the sea from a freshwater river, what happens to its floating level?",
            listOf("वह थोड़ा नीचे डूब जाता है", "वह थोड़ा ऊपर उठ जाता है", "समान स्तर पर रहता है", "पूरी तरह डूब जाता है"),
            listOf("It sinks slightly", "It rises slightly higher", "Remains at the same level", "Sinks completely"),
            1,
            "समुद्री जल का घनत्व लवणता के कारण नदी के मीठे पानी से अधिक होता है। आर्किमिडीज के सिद्धांत के अनुसार अधिक घनत्व वाला द्रव अधिक उत्प्लावन बल प्रदान करता है, जिससे जहाज थोड़ा ऊपर उठ जाता है।",
            "Seawater is denser than river freshwater due to dissolved salts. Higher density provides greater buoyant force per unit submerged volume, causing the ship to float higher.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m2_q3", "sci_1",
            "केरोसिन तेल की बत्ती में तेल का ऊपर चढ़ना किस परिघटना का उदाहरण है?",
            "The rising of kerosene oil in the wick of a lamp is an example of which phenomenon?",
            listOf("केशिकत्व (Capillarity)", "श्यानता (Viscosity)", "वाष्पीकरण (Evaporation)", "परासरण (Osmosis)"),
            listOf("Capillarity", "Viscosity", "Evaporation", "Osmosis"),
            0,
            "बत्ती के रेशों के बीच बहुत महीन नलिकाएं (केशिकाएं) बन जाती हैं। संसंजन और आसंजन बलों तथा पृष्ठ तनाव के कारण तेल केशिकत्व (Capillary action) द्वारा ऊपर चढ़ता है।",
            "The microscopic pores between wick fibers act as capillary tubes. Cohesion, adhesion, and surface tension cause the liquid to ascend via capillarity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m2_q4", "sci_1",
            "भू-स्थिर उपग्रह (Geostationary Satellite) का परिक्रमण काल कितना होता है और यह पृथ्वी तल से लगभग कितनी ऊंचाई पर स्थित होता है?",
            "What is the orbital period and approximate altitude of a Geostationary Satellite from Earth's surface?",
            listOf("12 घंटे, 20,000 किमी", "24 घंटे, ~35,786 किमी (लगभग 36,000 किमी)", "48 घंटे, 10,000 किमी", "90 मिनट, 400 किमी"),
            listOf("12 hours, 20,000 km", "24 hours, ~35,786 km (~36,000 km)", "48 hours, 10,000 km", "90 minutes, 400 km"),
            1,
            "भू-स्थिर उपग्रह पृथ्वी की घूर्णन दिशा (पश्चिम से पूर्व) में विषुवतीय तल पर लगभग 35,786 किमी की ऊंचाई पर 24 घंटे में एक परिक्रमा पूरी करता है, जिससे यह पृथ्वी से स्थिर प्रतीत होता है।",
            "A geostationary satellite orbits Earth in the equatorial plane from west to east at an altitude of approximately 35,786 km with an orbital period of exactly 24 hours.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m2_q5", "sci_1",
            "हुक का नियम (Hooke's Law) प्रत्यास्थता की सीमा के भीतर किसके समानुपातिक होने को व्यक्त करता है?",
            "Hooke's Law states that within the elastic limit, stress is directly proportional to what?",
            listOf("विकृति (Strain)", "दाब (Pressure)", "आयतन (Volume)", "तापमान (Temperature)"),
            listOf("Strain", "Pressure", "Volume", "Temperature"),
            0,
            "हुक के नियमानुसार प्रत्यास्थता की सीमा के अंतर्गत प्रतिबल (Stress) सदैव विकृति (Strain) के समानुपाती होता है (Stress = E × Strain, जहाँ E प्रत्यास्थता गुणांक है)।",
            "Hooke's Law states that within elastic limits, Stress is directly proportional to Strain (Stress = Modulus of Elasticity × Strain).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m2_q6", "sci_1",
            "किसी सरल लोलक (Simple Pendulum) का आवर्तकाल (Time Period - T) किस सूत्र द्वारा निर्धारित होता है?",
            "The time period (T) of a simple pendulum of length 'l' is given by which formula?",
            listOf("T = 2π √(g/l)", "T = 2π √(l/g)", "T = 2π (l × g)", "T = (1/2π) √(l/g)"),
            listOf("T = 2π √(g/l)", "T = 2π √(l/g)", "T = 2π (l × g)", "T = (1/2π) √(l/g)"),
            1,
            "सरल लोलक का आवर्तकाल T = 2π √(l/g) होता है। आवर्तकाल केवल प्रभावकारी लंबाई (l) और गुरुत्वीय त्वरण (g) पर निर्भर करता है, लोलक के द्रव्यमान पर नहीं।",
            "The time period of a simple pendulum is T = 2π √(l/g). It depends solely on effective length (l) and local gravitational acceleration (g), independent of the bob's mass.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m2_q7", "sci_1",
            "गर्मियों में लोलक घड़ी (Pendulum Clock) की चाल पर क्या प्रभाव पड़ता है?",
            "What happens to the timekeeping of a pendulum clock in hot summer months?",
            listOf("तेज हो जाती है", "सुस्त (धीमी) हो जाती है", "अपरिवर्तित रहती है", "रुक जाती है"),
            listOf("Runs fast", "Runs slow (loses time)", "Remains unaffected", "Stops completely"),
            1,
            "गर्मियों में तापमान बढ़ने से लोलक की धातु की छड़ की लंबाई (l) तापीय प्रसार के कारण बढ़ जाती है। T ∝ √l होने से आवर्तकाल बढ़ जाता है, जिससे घड़ी सुस्त (slow) हो जाती है।",
            "In summer, thermal expansion increases the pendulum rod's length (l). Since T ∝ √l, the time period increases, causing the clock to run slower and lose time.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m2_q8", "sci_1",
            "गुरुत्वीय त्वरण 'g' का मान पृथ्वी पर कहाँ पर अधिकतम और कहाँ पर न्यूनतम (शून्य छोड़कर) होता है?",
            "Where is the value of gravitational acceleration 'g' maximum and minimum on Earth's surface?",
            listOf("भूमध्य रेखा पर अधिकतम, ध्रुवों पर न्यूनतम", "ध्रुवों पर अधिकतम, भूमध्य रेखा पर न्यूनतम", "कर्क रेखा पर अधिकतम, मकर पर न्यूनतम", "सभी जगह समान"),
            listOf("Max at Equator, Min at Poles", "Max at Poles, Min at Equator", "Max at Tropic of Cancer", "Uniform everywhere"),
            1,
            "पृथ्वी का आकार चपटा (Geoid) होने के कारण ध्रुवों पर त्रिज्या (R) न्यूनतम होती है (g ∝ 1/R²), अतः ध्रुवों पर g अधिकतम (~9.83 m/s²) और भूमध्य रेखा पर न्यूनतम (~9.78 m/s²) होता है।",
            "Due to Earth's oblate spheroid shape, polar radius is smaller than equatorial radius. Since g ∝ 1/R², 'g' is maximum at the poles (~9.83 m/s²) and minimum at the equator (~9.78 m/s²).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m2_q9", "sci_1",
            "क्रीम निकालने वाले सेपरेटर में दूध से क्रीम अलग होने का क्या कारण है?",
            "Why does cream separate from milk in a centrifugal separator?",
            listOf("क्रीम का घनत्व दूध से कम होता है", "क्रीम का घनत्व दूध से अधिक होता है", "समान घनत्व", "गुरुत्वीय खिंचाव"),
            listOf("Density of cream is less than milk", "Density of cream is higher than milk", "Identical density", "Gravitational force"),
            0,
            "दूध से वसा (क्रीम) का घनत्व जल/दूध के बाकी भाग से कम होता है। तेजी से घूमने पर अधिक घनत्व वाला भाग परिधि की ओर और कम घनत्व वाली क्रीम केंद्र पर एकत्र हो जाती है।",
            "Fat/cream has a lower density than the skimmed milk matrix. Centrifugal force pushes the heavier liquid outward, concentrating the lighter cream at the rotational axis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m2_q10", "sci_1",
            "साइकिल चालक मोड़ लेते समय अंदर की ओर क्यों झुकता है?",
            "Why does a cyclist lean inward while negotiating a curve?",
            listOf("गुरुत्वाकर्षण बल कम करने के लिए", "आवश्यक अभिकेंद्रीय बल (Centripetal Force) प्राप्त करने के लिए", "हवा के प्रतिरोध को कम करने के लिए", "घर्षण समाप्त करने के लिए"),
            listOf("To reduce gravity", "To generate necessary Centripetal Force", "To minimize wind drag", "To eliminate friction"),
            1,
            "मोड़ पर झुकने से जमीन द्वारा साइकिल पर लगने वाली प्रतिक्रिया का क्षैतिज घटक वृत्ताकार गति के लिए आवश्यक अभिकेंद्रीय बल (Centripetal Force = mv²/r) प्रदान करता है।",
            "Leaning generates a horizontal component of the ground's normal reaction force towards the center of curvature, providing the essential centripetal force (mv²/r) to prevent skidding.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m2_q11", "sci_1",
            "एक प्रक्षेप्य (Projectile) को अधिकतम क्षैतिज परास (Maximum Horizontal Range) प्राप्त करने के लिए कितने कोण पर प्रक्षेपित किया जाना चाहिए?",
            "At what angle with the horizontal must a projectile be launched to achieve maximum horizontal range?",
            listOf("30°", "45°", "60°", "90°"),
            listOf("30°", "45°", "60°", "90°"),
            1,
            "क्षैतिज परास R = (u² sin 2θ)/g होता है। sin 2θ का अधिकतम मान 1 होता है जब 2θ = 90° अर्थात θ = 45°। अतः 45° के कोण पर प्रक्षेपित करने पर परास अधिकतम होती है।",
            "Horizontal range R = (u² sin 2θ)/g. The factor sin 2θ reaches its maximum value of 1 when 2θ = 90°, yielding θ = 45°.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m2_q12", "sci_1",
            "साबुन या डिटर्जेंट मिलाने से जल के पृष्ठ तनाव (Surface Tension) पर क्या प्रभाव पड़ता है?",
            "What happens to the Surface Tension of water when soap or detergent is added?",
            listOf("बढ़ जाता है", "घट जाता है (Decreases)", "अपरिवर्तित रहता है", "शून्य हो जाता है"),
            listOf("Increases", "Decreases", "Remains unchanged", "Becomes zero"),
            1,
            "साबुन/डिटर्जेंट पृष्ठ-सक्रिय कारक (Surfactants) होते हैं जो जल के अणुओं के बीच संसंजन बल को कमजोर करके पृष्ठ तनाव को कम कर देते हैं, जिससे पानी कपड़ों के रेशों में गहराई तक जाकर मैल साफ करता है।",
            "Soaps and detergents are surfactants that lower water's surface tension by disrupting cohesive hydrogen bonds, allowing water to wet fabrics thoroughly and dislodge dirt.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m2_q13", "sci_1",
            "आर्किमिडीज का सिद्धांत (Archimedes' Principle) किससे संबंधित है?",
            "Archimedes' Principle is related to which phenomenon?",
            listOf("उत्प्लावन बल एवं तैरने के नियम (Buoyancy and Laws of Flotation)", "गैसों का गतिज सिद्धांत (Kinetic Theory)", "विद्युत अपघटन (Electrolysis)", "प्रकाश का अपवर्तन (Refraction)"),
            listOf("Buoyancy and Laws of Flotation", "Kinetic Theory of Gases", "Electrolysis", "Refraction of Light"),
            0,
            "जब कोई वस्तु किसी द्रव में पूर्ण या आंशिक रूप से डुबोई जाती है, तो उस पर ऊपर की ओर लगने वाला उत्प्लावन बल वस्तु द्वारा विस्थापित द्रव के भार के बराबर होता है।",
            "Archimedes' principle states that any body completely or partially submerged in a fluid is buoyed up by a force equal to the weight of the fluid displaced by the body.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m2_q14", "sci_1",
            "कैपलर का द्वितीय नियम (केपलर का क्षेत्रीय चाल नियम) किस भौतिक संरक्षण नियम का परिणाम है?",
            "Kepler's Second Law (Law of Equal Areas) is a direct consequence of the conservation of which quantity?",
            listOf("रेखीय संवेग (Linear Momentum)", "कोणीय संवेग (Angular Momentum)", "ऊर्जा (Energy)", "द्रव्यमान (Mass)"),
            listOf("Linear Momentum", "Angular Momentum", "Energy", "Mass"),
            1,
            "सूर्य और ग्रह के बीच गुरुत्वाकर्षण बल केंद्रीय बल (Central force) है, जिससे बल आघूर्ण τ = 0 होता है। परिणामस्वरूप ग्रह का कोणीय संवेग (L = mvr = constant) संरक्षित रहता है और क्षेत्रीय चाल (dA/dt = L/2m) नियत रहती है।",
            "Since gravitational force is central (torque τ = 0), angular momentum (L = constant) is conserved, which implies that areal velocity (dA/dt = L/2m) is strictly constant.",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m2_q15", "sci_1",
            "यदि किसी गतिशील पिंड का वेग दोगुना (2x) कर दिया जाए, तो उसकी गतिज ऊर्जा (Kinetic Energy) कितनी हो जाएगी?",
            "If the velocity of a moving body is doubled, what happens to its Kinetic Energy?",
            listOf("दोगुनी (2 गुना)", "चार गुनी (4 गुना)", "आधी", "अपरिवर्तित"),
            listOf("Doubled (2x)", "Quadrupled (4x)", "Halved", "Unchanged"),
            1,
            "गतिज ऊर्जा KE = 1/2 mv² होती है। वेग v दोगुना होने पर (2v)² = 4v² हो जाता है, अतः गतिज ऊर्जा 4 गुनी हो जाएगी।",
            "Kinetic Energy is proportional to the square of velocity (KE = 1/2 mv²). Doubling velocity (2v) increases KE by a factor of 2² = 4 times.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 3 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m3_q1", "sci_1",
            "गुरुत्वीय त्वरण 'g' और सार्वत्रिक गुरुत्वाकर्षण नियतांक 'G' में सही संबंध क्या है?",
            "What is the correct relationship between acceleration due to gravity 'g' and gravitational constant 'G'?",
            listOf("g = GM / R²", "g = GR² / M", "g = GMR", "g = GM² / R"),
            listOf("g = GM / R²", "g = GR² / M", "g = GMR", "g = GM² / R"),
            0,
            "पृथ्वी की सतह पर गुरुत्वीय त्वरण g = GM/R² होता है, जहाँ M पृथ्वी का द्रव्यमान और R पृथ्वी की त्रिज्या है।",
            "Acceleration due to gravity at Earth's surface is given by g = GM/R², where M is mass of Earth and R is radius of Earth.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m3_q2", "sci_1",
            "क्रिकेट खिलाड़ी कैच लपकते समय अपने हाथों को पीछे की ओर क्यों खींचता है?",
            "Why does a cricket fielder pull his hands backward while catching a fast ball?",
            listOf("संवेग परिवर्तन का समय बढ़ाकर बल का प्रभाव कम करने के लिए", "गेंद का वेग बढ़ाने के लिए", "अधिक बल लगाने के लिए", "जड़त्व बढ़ाने के लिए"),
            listOf("To increase time of impact and reduce impulsive force", "To increase ball velocity", "To exert more force", "To increase inertia"),
            0,
            "हाथ पीछे खींचने से संवेग परिवर्तन में लगने वाला समय (Δt) बढ़ जाता है। आवेग-संवेग प्रमेय (F = Δp/Δt) के अनुसार हाथों पर लगने वाला बल कम हो जाता है और चोट नहीं लगती।",
            "Pulling hands back increases the impact duration (Δt). From Newton's second law (F = Δp/Δt), a larger time interval reduces the impulsive force exerted on the player's palms.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q3", "sci_1",
            "निम्नलिखित में से कौन-सी एक सदिश राशि (Vector Quantity) है?",
            "Which of the following is a Vector Quantity?",
            listOf("चाल (Speed)", "द्रव्यमान (Mass)", "संवेग (Momentum)", "कार्य (Work)"),
            listOf("Speed", "Mass", "Momentum", "Work"),
            2,
            "संवेग (Momentum = mass × velocity), बल, विस्थापन, त्वरण, और वेग सदिश राशियां हैं जिनमें परिमाण और दिशा दोनों होते हैं। चाल, द्रव्यमान, कार्य और ऊर्जा अदिश राशियां (Scalar) हैं।",
            "Momentum (p = mv), force, velocity, acceleration, and displacement are vector quantities possessing both magnitude and direction. Speed, mass, and work are scalars.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q4", "sci_1",
            "शुद्ध जल का अधिकतम घनत्व (Maximum Density of Pure Water) किस तापमान पर होता है?",
            "At what temperature does pure water achieve its maximum density?",
            listOf("0 °C", "4 °C", "100 °C", "-4 °C"),
            listOf("0 °C", "4 °C", "100 °C", "-4 °C"),
            1,
            "जल के असामान्य प्रसार (Anomalous expansion) के कारण 0°C से 4°C तक गर्म करने पर इसका आयतन घटता है और 4°C पर इसका घनत्व अधिकतम (1000 kg/m³) होता है। इसी कारण झीलों के नीचे जलीय जीव जीवित रहते हैं।",
            "Due to water's anomalous expansion, heating from 0°C to 4°C causes contraction; it reaches peak density (1 g/cm³ or 1000 kg/m³) at 4°C (39.2°F), preserving aquatic life beneath frozen lakes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q5", "sci_1",
            "घर्षण बल (Frictional Force) हमेशा गति की दिशा के किस ओर कार्य करता है?",
            "In which direction does the Frictional Force always act relative to relative motion?",
            listOf("गति की दिशा में", "गति की विपरीत दिशा में (Opposite to motion)", "लंबवत दिशा में", "किसी भी दिशा में"),
            listOf("In the direction of motion", "Opposite to the direction of relative motion", "Perpendicular to motion", "Random direction"),
            1,
            "घर्षण बल संपर्क सतहों के बीच होने वाली सापेक्ष गति का सदैव विरोध करता है और स्पर्शरेखा के अनुदिश विपरीत दिशा में कार्य करता है।",
            "Frictional force always acts parallel to contact surfaces in the direction opposing the relative motion or tendency of motion between the bodies.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q6", "sci_1",
            "समतल सड़क पर कार मुड़ते समय आवश्यक अभिकेंद्रीय बल किससे प्राप्त होता है?",
            "On a flat horizontal road, what provides the necessary centripetal force for a turning car?",
            listOf("इंजन की शक्ति से", "टायरों और सड़क के बीच घर्षण बल से", "गुरुत्वाकर्षण बल से", "वायु प्रतिरोध से"),
            listOf("Engine power", "Frictional force between tires and road", "Gravitational force", "Air drag"),
            1,
            "समतल मोड़ पर मुड़ते समय टायरों और सड़क के बीच का स्थैतिक घर्षण बल (Static friction) अभिकेंद्रीय बल (mv²/r) प्रदान करता है। घर्षण कम होने (जैसे गीली सड़क पर) पर कार फिसल सकती है।",
            "On unbanked flat turns, static friction between the vehicle's tires and the road surface provides the requisite centripetal force.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m3_q7", "sci_1",
            "अंतरिक्ष में परिक्रमा कर रहे उपग्रह में बैठे अंतरिक्ष यात्री भारहीनता (Weightlessness) का अनुभव क्यों करते हैं?",
            "Why do astronauts inside an orbiting space station experience Weightlessness?",
            listOf("क्योंकि वहाँ गुरुत्वाकर्षण शून्य होता है", "क्योंकि उपग्रह और यात्री दोनों पृथ्वी की ओर स्वतंत्र रूप से गिर (Free Fall) रहे होते हैं", "वायुमंडल की अनुपस्थिति के कारण", "अपकेंद्रीय बल के कारण"),
            listOf("Because gravity is zero", "Because both satellite and astronaut are in continuous free fall towards Earth", "Due to absence of atmosphere", "Due to centrifugal force"),
            1,
            "कक्षा में गुरुत्वाकर्षण शून्य नहीं होता (लगभग 90% होता है), बल्कि उपग्रह और यात्री दोनों निरंतर स्वतंत्र पतन (Free Fall) की अवस्था में होते हैं जिससे सतह द्वारा प्रतिक्रिया बल शून्य हो जाता है।",
            "Gravity is not zero in orbit (~90% of surface value); rather, the craft and astronaut are in continuous free fall around Earth, reducing the normal reaction force to zero.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m3_q8", "sci_1",
            "कार्य (Work) शून्य होता है यदि लगाए गए बल और विस्थापन के बीच का कोण कितना हो?",
            "Work done is zero if the angle between applied force and displacement is:",
            listOf("0°", "45°", "90° (लंबवत)", "180°"),
            listOf("0°", "45°", "90° (Perpendicular)", "180°"),
            2,
            "कार्य W = F · d · cos θ होता है। जब बल और विस्थापन परस्पर लंबवत (θ = 90°) हों, तो cos 90° = 0 होने से किया गया कार्य शून्य होता है (जैसे कुली द्वारा सिर पर बोझ लेकर क्षैतिज चलना)।",
            "Work done W = F d cos θ. When force and displacement are perpendicular (θ = 90°), cos 90° = 0, rendering mechanical work zero (e.g., carrying load on head on horizontal ground).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q9", "sci_1",
            "द्रव की श्यानता (Viscosity of Liquids) पर तापमान बढ़ाने का क्या प्रभाव पड़ता है?",
            "What is the effect of increasing temperature on the Viscosity of Liquids?",
            listOf("बढ़ती है", "घटती है (Decreases)", "अपरिवर्तित रहती है", "पहले घटती है फिर बढ़ती है"),
            listOf("Increases", "Decreases", "Remains unchanged", "First decreases then increases"),
            1,
            "तापमान बढ़ने से द्रवों के अणुओं के बीच संसंजन बल (Cohesive force) कमजोर हो जाता है, जिससे द्रवों की श्यानता घट जाती है (जबकि गैसों की श्यानता तापमान बढ़ने पर बढ़ती है)।",
            "In liquids, viscosity is governed by intermolecular cohesion; higher temperature weakens cohesive bonds, reducing liquid viscosity (contrarily, gas viscosity increases with temperature).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m3_q10", "sci_1",
            "वायुमंडलीय दाब (Atmospheric Pressure) को मापने के लिए किस उपकरण का उपयोग किया जाता है?",
            "Which instrument is used to measure Atmospheric Pressure?",
            listOf("हाइड्रोमीटर (Hydrometer)", "बैरोमीटर (Barometer)", "मैनोमीटर (Manometer)", "एनीमोमीटर (Anemometer)"),
            listOf("Hydrometer", "Barometer", "Manometer", "Anemometer"),
            1,
            "वायुमंडलीय दाब बैरोमीटर (पारा बैरोमीटर / एनीरॉइड बैरोमीटर) द्वारा मापा जाता है। इसका आविष्कार टॉरिसेली (Torricelli) ने किया था। मानक वायुमंडलीय दाब 760 mm Hg या 1.013 × 10⁵ Pa होता है।",
            "Atmospheric pressure is measured using a Barometer, invented by Evangelista Torricelli. Standard atmospheric pressure equals 760 mm Hg (1 atm = 101.325 kPa).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q11", "sci_1",
            "बैरोमीटर के पाठ्यांक में अचानक तीव्र गिरावट (Sudden Fall in Barometer Reading) किसका संकेत देती है?",
            "A sudden sharp fall in the barometric reading indicates what upcoming weather condition?",
            listOf("साफ और शुष्क मौसम", "आंधी-तूफान (Storm / Gale)", "लगातार वर्षा", "अत्यधिक ठंड"),
            listOf("Clear dry weather", "Storm / Gale", "Continuous rain", "Extreme frost"),
            1,
            "बैरोमीटर पारे का अचानक गिरना निम्न वायुदाब क्षेत्र बनने का संकेत है, जिससे चारों ओर से तेज हवाएं केंद्र की ओर भागती हैं और आंधी-तूफान (Storm) आता है।",
            "A sudden steep drop in barometric pressure signals rapid formation of a low-pressure system, causing surrounding air to rush in and trigger a severe storm.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q12", "sci_1",
            "लोहे की एक कील पानी में डूब जाती है लेकिन लोहे का बना विशाल जहाज तैरता रहता है। इसका कारण क्या है?",
            "An iron nail sinks in water but a huge iron ship floats. What is the scientific explanation?",
            listOf("कील का भार अधिक होता है", "जहाज द्वारा विस्थापित जल का भार जहाज के कुल भार के बराबर होता है", "समुद्री जल में लोहा नहीं डूबता", "जहाज में इंजन लगा होता है"),
            listOf("Nail is heavier", "Weight of water displaced by ship equals total weight of ship", "Iron does not sink in sea", "Ship has an engine"),
            1,
            "जहाज की खोखली बनावट के कारण उसका औसत घनत्व पानी से कम होता है और वह अपने भार के बराबर पानी विस्थापित करता है, जिससे पर्याप्त उत्प्लावन बल (Buoyant Force) मिलता है।",
            "Due to its hollowed shape, the ship's overall average density is much lower than water; it displaces a large volume of water whose weight equals the ship's total weight.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q13", "sci_1",
            "पृष्ठ तनाव (Surface Tension) का विमीय सूत्र (Dimensional Formula) क्या है?",
            "What is the Dimensional Formula of Surface Tension (T = Force/Length)?",
            listOf("[M L T⁻²]", "[M L⁰ T⁻²]", "[M L² T⁻²]", "[M L⁻¹ T⁻¹]"),
            listOf("[M L T⁻²]", "[M L⁰ T⁻²]", "[M L² T⁻²]", "[M L⁻¹ T⁻¹]"),
            1,
            "पृष्ठ तनाव T = बल/लंबाई = [M L T⁻²] / [L] = [M L⁰ T⁻²] या [M T⁻²]। इसका SI मात्रक N/m या J/m² है।",
            "Surface tension T = Force/Length = [M L T⁻²] / [L] = [M L⁰ T⁻²] (or [M T⁻²]). SI unit is N/m or J/m².",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m3_q14", "sci_1",
            "पहाड़ों पर दाल पकाने में अधिक समय क्यों लगता है?",
            "Why does it take longer to cook pulses/food at high mountain altitudes in an open pot?",
            listOf("पहाड़ों पर ठंड अधिक होती है", "वायुमंडलीय दाब कम होने से जल का क्वथनांक (Boiling Point) कम हो जाता है", "ऑक्सीजन की कमी के कारण", "गुरुत्वाकर्षण कम होने के कारण"),
            listOf("Due to colder climate", "Lower atmospheric pressure reduces the boiling point of water", "Lack of oxygen", "Reduced gravity"),
            1,
            "ऊंचाई पर वायुमंडलीय दाब कम होने से जल 100°C से कम तापमान (जैसे 90-95°C) पर ही उबलने लगता है, जिससे भोजन को पकने के लिए आवश्यक ऊष्मा नहीं मिल पाती। प्रेशर कुकर दाब बढ़ाकर क्वथनांक बढ़ा देता है।",
            "At high elevations, lower ambient atmospheric pressure depresses water's boiling point below 100°C, providing insufficient cooking temperature unless cooked under pressure.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m3_q15", "sci_1",
            "साधारण तुला (Beam Balance) भौतिकी के किस सिद्धांत पर कार्य करती है?",
            "A conventional Beam Balance functions on which fundamental physical principle?",
            listOf("आघूर्णों का सिद्धांत (Principle of Moments)", "आर्किमिडीज का सिद्धांत", "पास्कल का नियम", "ऊर्जा संरक्षण"),
            listOf("Principle of Moments", "Archimedes' Principle", "Pascal's Law", "Conservation of Energy"),
            0,
            "साधारण तुला आघूर्णों के सिद्धांत (Principle of Moments) पर कार्य करती है: संतुलन की स्थिति में दक्षिणावर्त आघूर्ण (Clockwise Moment) = वामावर्त आघूर्ण (Anticlockwise Moment) (F₁ × d₁ = F₂ × d₂)।",
            "A beam balance operates on the Principle of Moments (first-class lever), where in equilibrium clockwise moments equal counterclockwise moments about the fulcrum.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 4 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m4_q1", "sci_1",
            "न्यूटन के गति के तृतीय नियम के अनुसार क्रिया और प्रतिक्रिया बल (Action and Reaction Forces):",
            "According to Newton's Third Law of Motion, Action and Reaction forces:",
            listOf("एक ही वस्तु पर कार्य करते हैं", "हमेशा दो भिन्न वस्तुओं पर कार्य करते हैं", "एक दूसरे को निरस्त कर देते हैं", "समान दिशा में होते हैं"),
            listOf("Act on the same object", "Always act on two different interacting bodies", "Always cancel each other out", "Act in the same direction"),
            1,
            "क्रिया और प्रतिक्रिया बल सदैव दो भिन्न वस्तुओं पर एक साथ, विपरीत दिशा में और समान परिमाण में कार्य करते हैं, इसलिए वे कभी एक-दूसरे को संतुलित/निरस्त नहीं करते।",
            "Action and reaction forces always act simultaneously on two distinct interacting bodies in opposite directions with equal magnitude, hence they never cancel each other on a single body.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m4_q2", "sci_1",
            "यदि किसी वस्तु का द्रव्यमान पृथ्वी पर 60 किग्रा है, तो चंद्रमा पर उसका द्रव्यमान और भार क्या होगा? (g_moon = g/6)",
            "If an object's mass on Earth is 60 kg, what will be its mass and weight on the Moon? (g_moon ≈ 1.63 m/s²)",
            listOf("द्रव्यमान 10 किग्रा, भार 60 N", "द्रव्यमान 60 किग्रा, भार ~98 N", "द्रव्यमान 10 किग्रा, भार 98 N", "द्रव्यमान 60 किग्रा, भार 600 N"),
            listOf("Mass 10 kg, Weight 60 N", "Mass 60 kg, Weight ~98 N", "Mass 10 kg, Weight 98 N", "Mass 60 kg, Weight 600 N"),
            1,
            "द्रव्यमान (Mass) पदार्थ की मात्रा है जो ब्रह्मांड में सर्वत्र अपरिवर्तित (60 kg) रहता है। भार W = m × g = 60 × (9.8/6) ≈ 98 न्यूटन (N) होगा।",
            "Mass is invariant across space (remains 60 kg). Weight depends on local gravity: W = m × (g/6) = 60 × 1.633 ≈ 98 N (approx 1/6th of Earth weight).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m4_q3", "sci_1",
            "ऊंचाई पर उड़ते हवाई जहाज में बैठे यात्री के फाउंटेन पेन से स्याही क्यों रिसने लगती है?",
            "Why does ink leak from a fountain pen inside an airplane flying at high altitude?",
            listOf("हवाई जहाज में अत्यधिक गर्मी के कारण", "बाहरी वायुमंडलीय दाब में कमी के कारण", "गुरुत्वाकर्षण बढ़ जाने से", "श्यानता घटने से"),
            listOf("Excessive cabin heat", "Decrease in outside atmospheric pressure", "Increased gravity", "Reduced viscosity"),
            1,
            "ऊंचाई पर वायुमंडलीय दाब कम हो जाता है जबकि पेन के अंदर हवा का दाब अधिक रहता है, जिससे अंदर का दाब स्याही को बाहर धकेल देता है।",
            "At high altitude, ambient atmospheric pressure decreases. The higher relative air pressure trapped inside the pen reservoir forces the ink out.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m4_q4", "sci_1",
            "लैम्प की बत्ती में तेल का ऊपर चढ़ना और ब्लॉटिंग पेपर द्वारा स्याही सोखना किस गुण पर आधारित है?",
            "Oil rising in a lamp wick and blotting paper absorbing spilled ink are governed by:",
            listOf("केशिकत्व (Capillarity)", "श्यानता (Viscosity)", "संघनन (Condensation)", "प्रत्यास्थता (Elasticity)"),
            listOf("Capillarity", "Viscosity", "Condensation", "Elasticity"),
            0,
            "ब्लॉटिंग पेपर में असंख्य बारीक छिद्र होते हैं जो केशिकाओं (Capillary tubes) की भांति कार्य करते हैं और केशिकत्व द्वारा द्रव को सोख लेते हैं।",
            "Blotting paper contains countless fine microscopic pores functioning as capillary tubes, soaking liquids rapidly through capillary suction.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m4_q5", "sci_1",
            "पानी से भरे बीकर में बर्फ का टुकड़ा तैर रहा है। जब पूरी बर्फ पिघल जाएगी, तो जलस्तर पर क्या प्रभाव पड़ेगा?",
            "A piece of ice is floating in a beaker filled with water. When the ice completely melts, what happens to the water level?",
            listOf("जलस्तर बढ़ जाएगा", "जलस्तर घट जाएगा", "जलस्तर अपरिवर्तित रहेगा (Remains Same)", "पानी बाहर बह जाएगा"),
            listOf("Water level rises", "Water level falls", "Water level remains unchanged", "Water overflows"),
            2,
            "तैरती बर्फ अपने भार के बराबर जल पहले ही विस्थापित कर चुकी होती है। पिघलने पर बना जल ठीक उसी विस्थापित आयतन को भरता है, इसलिए जलस्तर अपरिवर्तित रहता है।",
            "Floating ice displaces a volume of water whose mass exactly equals the mass of the ice. Upon melting, the melted ice occupies that exact displaced volume, leaving water level unchanged.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m4_q6", "sci_1",
            "हवाई जहाज के पंखों (Aerofoil wings) का ऊपरी भाग वक्राकार और निचला भाग चपटा क्यों बनाया जाता है?",
            "Why is the upper surface of an airplane wing (Aerofoil) curved while the bottom is relatively flat?",
            listOf("सुंदरता के लिए", "ऊपर वायु का वेग बढ़ाकर दाब कम करने और लिफ्ट उत्पन्न करने के लिए", "वजन कम करने के लिए", "गुरुत्वाकर्षण कम करने के लिए"),
            listOf("Aesthetic appeal", "To increase air speed above, reducing pressure to create upward lift (Bernoulli)", "To reduce weight", "To decrease gravity"),
            1,
            "बरनौली प्रमेय के अनुसार ऊपर हवा की गति तेज होने से पंख के ऊपर निम्न दाब और नीचे उच्च दाब बनता है, जिससे ऊपर की ओर उत्थापक बल (Aerodynamic Lift) मिलता है।",
            "According to Bernoulli's principle, air flows faster over the curved upper camber, creating lower dynamic pressure above than beneath, generating upward aerodynamic lift.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m4_q7", "sci_1",
            "एक घूमते हुए झूले पर या मोड़ पर मुड़ते समय बाहर की ओर लगने वाले आभासी बल (Pseudo Force) को क्या कहते हैं?",
            "What is the fictitious/pseudo force directed radially outward from the center in a rotating frame of reference called?",
            listOf("अभिकेंद्रीय बल (Centripetal Force)", "अपकेंद्रीय बल (Centrifugal Force)", "गुरुत्वाकर्षण बल (Gravitational Force)", "घर्षण बल (Frictional Force)"),
            listOf("Centripetal Force", "Centrifugal Force", "Gravitational Force", "Frictional Force"),
            1,
            "घूर्णन कर रहे गैर-जड़त्वीय निर्देश तंत्र (Non-inertial frame) में बाहर की ओर अनुभव होने वाला आभासी बल अपकेंद्रीय बल (Centrifugal force = mv²/r) कहलाता है।",
            "In a rotating non-inertial frame, the inertial reaction felt pushing radially outward is known as the Centrifugal Force.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m4_q8", "sci_1",
            "द्रव की बूंदों और साबुन के बुलबुलों के अंदर का अतिरिक्त दाब (Excess Pressure) किस सूत्र से दिया जाता है?",
            "What is the excess pressure inside a spherical soap bubble of surface tension T and radius R in air?",
            listOf("ΔP = T / R", "ΔP = 2T / R", "ΔP = 4T / R", "ΔP = 8T / R"),
            listOf("ΔP = T / R", "ΔP = 2T / R", "ΔP = 4T / R", "ΔP = 8T / R"),
            2,
            "द्रव की बूंद (1 मुक्त सतह) के अंदर अतिरिक्त दाब ΔP = 2T/R होता है, जबकि साबुन के बुलबुले में दो मुक्त सतहें (अंदर और बाहर) होने के कारण अतिरिक्त दाब ΔP = 4T/R होता है।",
            "A liquid drop has 1 free surface (ΔP = 2T/R), whereas a soap bubble has 2 free surfaces (inner and outer air interfaces), making excess pressure ΔP = 4T/R.",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m4_q9", "sci_1",
            "दूध की शुद्धता और उसका आपेक्षिक घनत्व मापने के लिए किस उपकरण का उपयोग किया जाता है?",
            "Which instrument is used to determine the purity and specific gravity of milk?",
            listOf("लैक्टोमीटर (Lactometer)", "हाइग्रोमीटर (Hygrometer)", "पायरोमीटर (Pyrometer)", "कैलोरीमीटर (Calorimeter)"),
            listOf("Lactometer", "Hygrometer", "Pyrometer", "Calorimeter"),
            0,
            "लैक्टोमीटर एक प्रकार का हाइड्रोमीटर है जो आर्किमिडीज के सिद्धांत पर दूध के आपेक्षिक घनत्व को मापकर पानी की मिलावट का पता लगाता है।",
            "A Lactometer is a specialized hydrometer that measures the specific gravity of milk based on Archimedes' principle to detect water adulteration.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m4_q10", "sci_1",
            "किसी गतिशील वस्तु का संवेग (Momentum - p) और गतिज ऊर्जा (KE - E) के बीच सही संबंध क्या है?",
            "What is the correct mathematical relation between momentum 'p' and kinetic energy 'E' of a body of mass 'm'?",
            listOf("E = p² / 2m", "E = 2mp", "E = p / 2m", "E = 2m / p²"),
            listOf("E = p² / 2m", "E = 2mp", "E = p / 2m", "E = 2m / p²"),
            0,
            "गतिज ऊर्जा E = 1/2 mv² = (mv)² / 2m = p² / 2m होता है। अथवा p = √(2mE)।",
            "Kinetic energy E = 1/2 mv² = (mv)² / (2m) = p² / (2m). Alternatively, momentum p = √(2mE).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m4_q11", "sci_1",
            "घड़ी के स्प्रिंग में और तनी हुई धनुष की डोरी में कौन-सी ऊर्जा संचित होती है?",
            "Which form of energy is stored in a wound clockwork spring or a stretched bowstring?",
            listOf("गतिज ऊर्जा (Kinetic Energy)", "प्रत्यास्थ स्थितिज ऊर्जा (Elastic Potential Energy)", "रासायनिक ऊर्जा (Chemical Energy)", "विद्युत ऊर्जा (Electrical Energy)"),
            listOf("Kinetic Energy", "Elastic Potential Energy", "Chemical Energy", "Electrical Energy"),
            1,
            "विरूपक बल लगाने पर वस्तु के आकार या विन्यास में परिवर्तन के कारण संचित ऊर्जा प्रत्यास्थ स्थितिज ऊर्जा (Elastic Potential Energy = 1/2 kx²) कहलाती है।",
            "Mechanical work performed to deform an elastic object is stored as Elastic Potential Energy (U = 1/2 kx² in a spring).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m4_q12", "sci_1",
            "श्यान बल (Viscous Force) के लिए स्टोक्स का नियम (Stokes' Law) क्या सूत्र देता है?",
            "What is Stokes' Law formula for the drag force F on a small sphere of radius 'r' moving with terminal velocity 'v' through fluid of viscosity 'η'?",
            listOf("F = 6πηrv", "F = 2πηrv", "F = 4πηr²v", "F = 6πηr/v"),
            listOf("F = 6πηrv", "F = 2πηrv", "F = 4πηr²v", "F = 6πηr/v"),
            0,
            "स्टोक्स के नियमानुसार श्यान माध्यम में गतिशील गोलीय वस्तु पर लगने वाला श्यान बल F = 6πηrv होता है।",
            "Stokes' law establishes that viscous drag on a small sphere moving through a laminar fluid is given by F = 6πηrv.",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m4_q13", "sci_1",
            "किसी वस्तु का सीमांत वेग (Terminal Velocity) कब प्राप्त होता है?",
            "When does a falling object through a viscous medium reach its Terminal Velocity?",
            listOf("जब गुरुत्वाकर्षण बल शून्य हो जाता है", "जब नीचे की ओर प्रभावी भार उत्प्लावन और श्यान बलों के योग के बराबर हो जाता है (शुद्ध त्वरण = 0)", "जब वेग प्रकाश के वेग के बराबर हो जाता है", "जब घर्षण शून्य हो जाता है"),
            listOf("When gravity becomes zero", "When downward weight is balanced by upward buoyant and viscous forces (net a = 0)", "When speed equals light speed", "When friction is zero"),
            1,
            "जब ऊपर की ओर लगने वाले श्यान बल और उत्प्लावन बल का योग नीचे की ओर लगने वाले गुरुत्वीय बल को पूरी तरह संतुलित कर देता है, तो परिणामी बल शून्य हो जाता है और वस्तु नियत सीमांत वेग से गिरती है।",
            "Terminal velocity is reached when upward resistive drag and buoyancy equal downward gravitational force, yielding net acceleration a = 0 and constant steady velocity.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m4_q14", "sci_1",
            "जब कोई व्यक्ति नाव से नदी के किनारे कूदता है, तो नाव पीछे की ओर क्यों खिसक जाती है?",
            "When a passenger jumps forward out of a boat onto the shore, why does the boat push backward into the water?",
            listOf("न्यूटन के प्रथम नियम के कारण", "न्यूटन के तृतीय नियम (क्रिया-प्रतिक्रिया) के कारण", "आर्किमिडीज के सिद्धांत के कारण", "गुरुत्वाकर्षण के कारण"),
            listOf("Newton's First Law", "Newton's Third Law (Action-Reaction)", "Archimedes' Principle", "Gravitational force"),
            1,
            "आगे कूदने के लिए व्यक्ति नाव पर पीछे की ओर बल (क्रिया) लगाता है। न्यूटन के तीसरे नियम के अनुसार नाव भी व्यक्ति पर आगे की ओर प्रतिक्रिया बल लगाती है, जिससे नाव पीछे खिसक जाती है।",
            "To propel forward, the person pushes backward on the boat (action). By Newton's Third Law, the boat exerts an equal forward reaction while recoiling backward.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m4_q15", "sci_1",
            "यदि पृथ्वी अपनी धुरी पर घूमना बंद कर दे, तो भूमध्य रेखा पर 'g' के मान पर क्या प्रभाव पड़ेगा?",
            "If the Earth suddenly stops rotating on its axis, what will happen to the value of 'g' at the equator?",
            listOf("घट जाएगा", "बढ़ जाएगा (Increases by ω²R)", "अपरिवर्तित रहेगा", "शून्य हो जाएगा"),
            listOf("Decreases", "Increases (by ω²R)", "Remains unchanged", "Becomes zero"),
            1,
            "घूर्णन के कारण भूमध्य रेखा पर आभासी g' = g - ω²R होता है। यदि घूर्णन रुक जाए (ω = 0), तो भूमध्य रेखा पर g का मान बढ़ जाएगा (ध्रुवों पर कोई प्रभाव नहीं पड़ेगा)।",
            "Rotation reduces equatorial gravity due to centrifugal relief (g' = g - ω²R). If Earth ceases rotation (ω = 0), equatorial 'g' increases by ω²R.",
            "Hard"
        ),

        // ==========================================
        // MOCK TEST 5 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m5_q1", "sci_1",
            "संवेग (Momentum) का SI मात्रक क्या है?",
            "What is the SI unit of Momentum (p = mv)?",
            listOf("kg·m/s²", "kg·m/s (किग्रा·मीटर/सेकंड)", "N·m", "Joule·s"),
            listOf("kg·m/s²", "kg·m/s", "N·m", "Joule·s"),
            1,
            "संवेग = द्रव्यमान × वेग (p = mv)। इसका SI मात्रक kg·m/s (या N·s) होता है।",
            "Momentum = mass × velocity. Its SI unit is kg·m/s or Newton-second (N·s).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m5_q2", "sci_1",
            "आवेग (Impulse) भौतिकी में किसके बराबर होता है?",
            "In physics, Impulse (J) is equal to:",
            listOf("बल × विस्थापन", "बल × समय अंतराल (या संवेग में परिवर्तन: Δp)", "द्रव्यमान × त्वरण", "कार्य / समय"),
            listOf("Force × Displacement", "Force × Time interval (or Change in Momentum: Δp)", "Mass × Acceleration", "Work / Time"),
            1,
            "आवेग J = F × Δt = Δp (संवेग में कुल परिवर्तन)। इसका मात्रक N·s या kg·m/s है।",
            "Impulse J = ∫ F dt = F_avg × Δt = Δp (total change in momentum). Unit: N·s.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m5_q3", "sci_1",
            "एक भारहीन गुब्बारे में 200 ग्राम जल भरा है। जल में इसका भार कितना होगा?",
            "A weightless balloon is filled with 200 g of water. What will be its apparent weight when submerged in water?",
            listOf("200 g", "100 g", "शून्य (Zero)", "400 g"),
            listOf("200 g", "100 g", "Zero", "400 g"),
            2,
            "गुब्बारे में भरे जल का भार = विस्थापित जल का भार = उत्प्लावन बल। अतः आभासी भार = वास्तविक भार - उत्प्लावन बल = 0 (शून्य)।",
            "The weight of water inside equals the weight of water displaced (buoyant force). Apparent weight = True weight - Buoyancy = 0.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m5_q4", "sci_1",
            "किसी वृत्तीय पथ पर नियत चाल से घूमती वस्तु में कौन-सा त्वरण होता है?",
            "An object moving along a circular path with constant speed experiences which type of acceleration?",
            listOf("स्पर्शरेखीय त्वरण (Tangential Acceleration)", "अभिकेंद्रीय त्वरण (Centripetal Acceleration, केंद्र की ओर)", "शून्य त्वरण", "कोणीय मंदन"),
            listOf("Tangential Acceleration", "Centripetal Acceleration (directed radially inward)", "Zero Acceleration", "Angular Retardation"),
            1,
            "चाल नियत होने पर भी दिशा निरंतर बदलने के कारण वेग बदलता है। केंद्र की ओर लगने वाले इस त्वरण को अभिकेंद्रीय त्वरण (ac = v²/r) कहते हैं।",
            "Even at constant speed, continuous change in velocity's direction produces an inward radial acceleration called Centripetal Acceleration (ac = v²/r).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m5_q5", "sci_1",
            "पेंसिल से कागज पर लिखना या ब्लैकबोर्ड पर चाक से लिखना किस बल के कारण संभव होता है?",
            "Writing with a pencil on paper or with chalk on a blackboard is possible due to which force?",
            listOf("गुरुत्वाकर्षण बल", "घर्षण बल (Friction)", "चुंबकीय बल", "संसंजन बल"),
            listOf("Gravitational force", "Frictional force", "Magnetic force", "Cohesive force"),
            1,
            "कागज और पेंसिल की नोक के बीच घर्षण बल ग्रेफाइट के कणों को घिसकर कागज के रेशों में चिपका देता है। घर्षण न हो तो लिखना असंभव होगा।",
            "Friction between pencil lead (graphite) and paper shears off microscopic graphite layers, anchoring them onto paper fibers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m5_q6", "sci_1",
            "एक समान घनत्व वाले ठोस गोले, खोखले गोले, और ठोस बेलन को एक नत समतल (Inclined Plane) से एक साथ लुढ़काया जाए, तो सबसे पहले नीचे कौन पहुंचेगा?",
            "If a solid sphere, hollow sphere, and solid cylinder of equal mass and radius are rolled down an incline, which reaches the bottom first?",
            listOf("ठोस गोला (Solid Sphere)", "खोखला गोला (Hollow Sphere)", "ठोस बेलन (Solid Cylinder)", "तीनों एक साथ"),
            listOf("Solid Sphere", "Hollow Sphere", "Solid Cylinder", "All arrive together"),
            0,
            "नत समतल पर त्वरण a = g sin θ / (1 + I/mR²) होता है। ठोस गोले का जड़त्व आघूर्ण I = 2/5 mR² सबसे कम होता है, अतः इसका त्वरण सर्वाधिक होगा और यह सबसे पहले पहुंचेगा।",
            "Acceleration down an incline is a = g sin θ / (1 + I/mR²). The solid sphere has the lowest moment of inertia factor (2/5 = 0.4), giving it the highest acceleration and fastest descent.",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m5_q7", "sci_1",
            "प्रत्यास्थ संघट्ट (Elastic Collision) में कौन-सी राशियां संरक्षित रहती हैं?",
            "Which quantities are strictly conserved in an Elastic Collision?",
            listOf("केवल संवेग", "केवल गतिज ऊर्जा", "संवेग और गतिज ऊर्जा दोनों (Both Momentum and Kinetic Energy)", "केवल स्थितिज ऊर्जा"),
            listOf("Only Momentum", "Only Kinetic Energy", "Both Momentum and Kinetic Energy", "Only Potential Energy"),
            2,
            "पूर्णतः प्रत्यास्थ संघट्ट में निकाय का कुल रेखीय संवेग और कुल गतिज ऊर्जा दोनों संरक्षित रहते हैं (उदा. गैस के अणुओं की टक्कर)।",
            "In an elastic collision, both total linear momentum and total kinetic energy of the system remain strictly conserved without dissipative losses.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m5_q8", "sci_1",
            "अपरूपण प्रत्यास्थता गुणांक (Modulus of Rigidity - η) किसका अनुपात होता है?",
            "Modulus of Rigidity (Shear Modulus) is defined as the ratio of:",
            listOf("अनुदैर्ध्य प्रतिबल / अनुदैर्ध्य विकृति", "अपरूपण प्रतिबल / अपरूपण विकृति (Shearing Stress / Shearing Strain)", "आयतन प्रतिबल / आयतन विकृति", "बल / क्षेत्रफल"),
            listOf("Longitudinal Stress / Strain", "Shearing Stress / Shearing Strain", "Volume Stress / Strain", "Force / Area"),
            1,
            "अपरूपण प्रत्यास्थता गुणांक η = अपरूपण प्रतिबल / अपरूपण विकृति (Shear Stress / Shear Strain) होता है। यह ठोसों के आकार परिवर्तन के विरोध को मापता है।",
            "Modulus of Rigidity (G or η) is the ratio of shear stress to shear strain within elastic limits, measuring resistance to shape deformation.",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m5_q9", "sci_1",
            "हवाई जहाज में यात्रा करते समय ऊंचाई पर नाक से खून बहने का क्या कारण हो सकता है?",
            "What causes bleeding from the nose (epistaxis) at extremely high altitudes?",
            listOf("रक्त वाहिकाओं में दाब की तुलना में बाहरी वायुमंडलीय दाब का बहुत कम होना", "ऑक्सीजन का विषैला प्रभाव", "अत्यधिक ठंड", "रक्त का जम जाना"),
            listOf("External atmospheric pressure being significantly lower than internal blood pressure", "Oxygen toxicity", "Extreme cold", "Blood clotting"),
            0,
            "ऊंचाई पर बाहरी वायुमंडलीय दाब घट जाता है, जबकि शरीर की रक्त वाहिकाओं का आंतरिक रक्तदाब अधिक बना रहता है। इस दाबांतर से नाक की महीन कोशिकाएं फट जाती हैं।",
            "High altitude lowers external ambient pressure. The higher internal blood pressure ruptures delicate nasal capillaries.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m5_q10", "sci_1",
            "महान वैज्ञानिक गैलीलियो गैलीली ने गति के नियमों की नींव किस प्रयोग से रखी थी?",
            "Galileo Galilei formulated the concept of inertia primarily through experiments using:",
            listOf("झुकी हुई ढलान वाली सतहों (Inclined Planes)", "पेंडुलम और घड़ी", "दूरबीन से ग्रहों का अध्ययन", "गेंदों को गिराकर"),
            listOf("Smooth Inclined Planes", "Pendulums and Clocks", "Telescopic Planetary Observations", "Dropping heavy balls"),
            0,
            "गैलीलियो ने दोहरे नत समतलों (Double Inclined Planes) पर कंचों को लुढ़काकर देखा कि घर्षण रहित तल पर वस्तु अनवरत गति करती रहेगी, जिससे न्यूटन के प्रथम नियम का आधार बना।",
            "Galileo deduced the concept of inertia by rolling balls along double inclined planes, observing that absent friction, a body maintains continuous motion indefinitely.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m5_q11", "sci_1",
            "1 प्रकाश वर्ष (Light Year) कितनी दूरी के बराबर होता है?",
            "One Light Year is equal to approximately how many meters?",
            listOf("9.46 × 10¹⁵ m", "9.46 × 10¹² m", "3.26 × 10¹⁵ m", "1.496 × 10¹¹ m"),
            listOf("9.46 × 10¹⁵ m", "9.46 × 10¹² m", "3.26 × 10¹⁵ m", "1.496 × 10¹¹ m"),
            0,
            "प्रकाश वर्ष निर्वात में प्रकाश द्वारा 1 वर्ष में तय की गई दूरी है = 3 × 10⁸ m/s × (365.25 × 24 × 3600 s) ≈ 9.46 × 10¹⁵ मीटर (या 9.46 × 10¹² किमी)।",
            "1 Light Year is the distance light travels in vacuum in one Julian year = c × t = 9.461 × 10¹⁵ meters (9.46 trillion km).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m5_q12", "sci_1",
            "खगोलीय दूरी मापने की सबसे बड़ी इकाई क्या है?",
            "What is the largest unit used for measuring Astronomical Distances?",
            listOf("प्रकाश वर्ष (Light Year)", "पारसेक (Parsec)", "खगोलीय इकाई (AU)", "किलोमीटर"),
            listOf("Light Year", "Parsec", "Astronomical Unit (AU)", "Kilometer"),
            1,
            "पारसेक (Parallactic Second) खगोलीय दूरी की सबसे बड़ी इकाई है। 1 पारसेक = 3.26 प्रकाश वर्ष = 3.08 × 10¹⁶ मीटर।",
            "Parsec (parallax of one arcsecond) is the largest astronomical distance unit: 1 parsec ≈ 3.26 light-years ≈ 3.0857 × 10¹⁶ meters.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m5_q13", "sci_1",
            "जल की सतह पर तेल की पतली परत डालने पर मच्छर के लार्वा क्यों मर जाते हैं?",
            "Why do mosquito larvae die when a thin film of kerosene or oil is sprayed on stagnant water surfaces?",
            listOf("तेल विषाक्त होता है", "जल का पृष्ठ तनाव कम होने से लार्वा पानी में डूब जाते हैं और सांस नहीं ले पाते", "तेल जल का तापमान बढ़ा देता है", "ऑक्सीजन समाप्त हो जाती है"),
            listOf("Oil is poisonous", "Lower surface tension causes larvae to sink and asphyxiate", "Oil heats water", "Consumes all dissolved oxygen"),
            1,
            "तेल डालने से पानी का पृष्ठ तनाव कम हो जाता है, जिससे लार्वा पानी की सतह पर टिक नहीं पाते और डूबकर श्वासनली बंद होने से मर जाते हैं।",
            "Oil reduces surface tension and clogs the respiratory siphons of mosquito larvae, causing them to drown and suffocate.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m5_q14", "sci_1",
            "साबुन के घोल के बुलबुले में हवा भरने पर उसका आकार बड़ा होने पर उसके अंदर का अतिरिक्त दाब (Excess Pressure):",
            "As a soap bubble is blown larger (radius R increases), the excess pressure inside it:",
            listOf("बढ़ता है", "घटता है (Decreases, ΔP ∝ 1/R)", "अपरिवर्तित रहता है", "शून्य हो जाता है"),
            listOf("Increases", "Decreases (ΔP ∝ 1/R)", "Remains constant", "Becomes zero"),
            1,
            "साबुन के बुलबुले के अंदर अतिरिक्त दाब ΔP = 4T/R होता है। जैसे-जैसे त्रिज्या R बढ़ती है, अंदर का अतिरिक्त दाब घटता जाता है।",
            "Excess pressure in a soap bubble is ΔP = 4T/R. As radius R increases, the excess internal pressure decreases inversely.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m5_q15", "sci_1",
            "पानी का कांच की नली में मेनिस्कस (Meniscus) कैसा होता है और पारे का कैसा होता है?",
            "What is the shape of the liquid Meniscus for water and mercury in a clean glass capillary tube?",
            listOf("पानी: अवतल (Concave), पारा: उत्तल (Convex)", "पानी: उत्तल, पारा: अवतल", "दोनों का समतल", "दोनों का अवतल"),
            listOf("Water: Concave, Mercury: Convex", "Water: Convex, Mercury: Concave", "Both flat", "Both concave"),
            0,
            "पानी और कांच के बीच आसंजन बल संसंजन बल से अधिक होने के कारण स्पर्श कोण न्यूनकोण होता है और मेनिस्कस अवतल बनता है। पारे में संसंजन बल अधिक होने से स्पर्श कोण अधिक कोण और मेनिस्कस उत्तल बनता है।",
            "Water wets glass (adhesive > cohesive force), forming a concave meniscus with acute contact angle. Mercury has strong cohesion (cohesive > adhesive), forming a convex meniscus with obtuse contact angle.",
            "Moderate"
        )
    )
}
