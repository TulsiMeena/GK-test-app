package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic1ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m6_q1", "sci_1",
            "भौतिकी में एक 'एंग्स्ट्रॉम' (1 Å) का मान कितने मीटर के बराबर होता है?",
            "What is the value of 1 Angstrom (1 Å) in meters?",
            listOf("10⁻⁸ m", "10⁻¹⁰ m", "10⁻¹² m", "10⁻¹⁵ m"),
            listOf("10⁻⁸ m", "10⁻¹⁰ m", "10⁻¹² m", "10⁻¹⁵ m"),
            1,
            "1 एंग्स्ट्रॉम (Å) = 10⁻¹⁰ मीटर (या 0.1 नैनोमीटर) होता है। इसका उपयोग प्रकाश की तरंगदैर्घ्य और परमाण्विक दूरियों को मापने में किया जाता है। 1 फर्मी (fm) = 10⁻¹⁵ मीटर।",
            "1 Angstrom (Å) = 10⁻¹⁰ m = 0.1 nm, commonly used to specify atomic scales and optical wavelengths. 1 Fermi (fm) = 10⁻¹⁵ m.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m6_q2", "sci_1",
            "जब कोई चलती हुई बस अचानक रुकती है, तो यात्री आगे की ओर क्यों झुक जाते हैं?",
            "When a moving bus applies brakes suddenly, passengers jerk forward due to:",
            listOf("विराम का जड़त्व (Inertia of Rest)", "गति का जड़त्व (Inertia of Motion)", "दिशा का जड़त्व (Inertia of Direction)", "गुरुत्वाकर्षण बल"),
            listOf("Inertia of Rest", "Inertia of Motion", "Inertia of Direction", "Gravitational force"),
            1,
            "गति के जड़त्व (Inertia of Motion) के कारण शरीर का ऊपरी भाग अपनी पूर्व गति में आगे बढ़ते रहने का प्रयास करता है जबकि शरीर का निचला भाग बस के साथ रुक जाता है।",
            "Due to the inertia of motion, the passenger's upper torso tends to maintain its forward velocity even when the vehicle decelerates abruptly.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m6_q3", "sci_1",
            "गोली चलने पर बंदूक पीछे की ओर क्यों झटका (Recoil) देती है?",
            "Why does a rifle recoil backward when a bullet is fired?",
            listOf("संवेग संरक्षण और न्यूटन के तृतीय नियम के कारण", "द्रव्यमान संरक्षण के कारण", "ऊर्जा के ह्रास के कारण", "वायु के घर्षण के कारण"),
            listOf("Conservation of Momentum and Newton's Third Law", "Conservation of Mass", "Loss of Energy", "Air Resistance"),
            0,
            "फायरिंग से पूर्व निकाय का कुल संवेग शून्य होता है। गोली आगे निकलने पर (mv), संवेग शून्य बनाए रखने हेतु बंदूक विपरीत दिशा में रिकॉइल वेग (V = -mv/M) प्राप्त करती है।",
            "Total momentum before firing is zero. Forward momentum of the high-velocity bullet is balanced by backward recoil momentum of the heavier firearm (M·V = -m·v).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m6_q4", "sci_1",
            "किसी वस्तु के द्रव्यमान केंद्र (Center of Mass) के बारे में क्या सत्य है?",
            "Which statement regarding the Center of Mass (COM) of a body is correct?",
            listOf("यह सदैव वस्तु के अंदर स्थित होना चाहिए", "यह वस्तु के पदार्थ के बाहर भी स्थित हो सकता है (जैसे छल्ला या खोखला गोला)", "यह गुरुत्व केंद्र से हमेशा भिन्न होता है", "यह गति के साथ बदलता है"),
            listOf("Must always lie inside the body's material", "Can lie outside the material (e.g., a ring or hollow sphere)", "Is always different from center of gravity", "Changes with motion"),
            1,
            "द्रव्यमान केंद्र वह काल्पनिक बिंदु है जहाँ संपूर्ण द्रव्यमान केंद्रित माना जा सकता है। छल्ले (Ring), खोखले गोले या घोड़े की नाल जैसी वस्तुओं में द्रव्यमान केंद्र पदार्थ के बाहर शून्य स्थान में होता है।",
            "The center of mass is the point at which the total mass of the system is considered concentrated; for hollow objects like a ring or horseshoe, it lies outside the solid material.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m6_q5", "sci_1",
            "समुद्र में तैरते हिमखंड (Iceberg) का कितना भाग पानी की सतह से ऊपर रहता है?",
            "What fraction of a floating iceberg remains exposed above the sea surface?",
            listOf("लगभग 1/10 भाग (10%)", "लगभग 1/2 भाग (50%)", "लगभग 3/4 भाग (75%)", "लगभग 9/10 भाग (90%)"),
            listOf("Approximately 1/10th (10%)", "Approximately 1/2 (50%)", "Approximately 3/4th (75%)", "Approximately 9/10th (90%)"),
            0,
            "बर्फ का घनत्व (~0.92 g/cm³) समुद्री जल के घनत्व (~1.03 g/cm³) से थोड़ा कम होता है। प्लवन के नियमानुसार लगभग 9/10 भाग (90%) जलमग्न रहता है और केवल 1/10 भाग (10%) ऊपर दिखाई देता है।",
            "Pure ice density (~0.92 g/cm³) relative to saline seawater (~1.025 g/cm³) dictates that roughly 89-90% of an iceberg is submerged, exposing only ~10% above water.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m6_q6", "sci_1",
            "एक किलोवाट घंटा (1 kWh) विद्युत ऊर्जा कितने जूल के बराबर होती है?",
            "One kilowatt-hour (1 kWh) of commercial electrical energy equals how many Joules?",
            listOf("3.6 × 10⁶ J", "3.6 × 10⁵ J", "1000 J", "3.6 × 10³ J"),
            listOf("3.6 × 10⁶ J", "3.6 × 10⁵ J", "1000 J", "3.6 × 10³ J"),
            0,
            "1 kWh = 1000 W × 3600 s = 3.6 × 10⁶ जूल (या 3.6 मेगाजूल)। इसे सामान्यतः 1 'यूनिट' विद्युत कहा जाता है।",
            "1 kWh = 1000 Watts × 3600 seconds = 3.6 × 10⁶ Joules (3.6 MJ), standardly called one 'Unit' of electricity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m6_q7", "sci_1",
            "जब कोई वस्तु किसी खुरदरी सतह पर बिना फिसले लुढ़कती है (Pure Rolling), तो संपर्क बिंदु पर घर्षण बल द्वारा किया गया कार्य कितना होता है?",
            "In pure rolling of a wheel without slipping, what is the work done by static friction at the point of instantaneous contact?",
            listOf("धनात्मक", "ऋणात्मक", "शून्य (Zero, क्योंकि संपर्क बिंदु का तात्क्षणिक विस्थापन शून्य है)", "अनंत"),
            listOf("Positive", "Negative", "Zero (instantaneous displacement of point of contact is zero)", "Infinite"),
            2,
            "शुद्ध लोटनी गति (Pure Rolling) में संपर्क बिंदु तात्क्षणिक रूप से विरामावस्था में होता है (no relative slip), अतः तात्क्षणिक विस्थापन शून्य होने से स्थैतिक घर्षण द्वारा किया गया कार्य शून्य होता है।",
            "In ideal rolling without slipping, the contact point is instantaneously at rest (zero relative displacement), resulting in zero mechanical work done by static friction.",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m6_q8", "sci_1",
            "द्रव की श्यानता के कारण बहते हुए द्रव की कौन-सी परत का वेग सर्वाधिक होता है?",
            "In a laminar flow of liquid through a pipe, which fluid layer possesses the highest velocity?",
            listOf("पाइप की दीवार के सबसे निकट वाली परत", "पाइप के केंद्रीय अक्ष (Center axis) वाली परत", "सभी परतों का वेग समान होता है", "तलछट वाली परत"),
            listOf("Layer touching the pipe wall", "Central axial layer along the pipe centerline", "All layers have equal velocity", "Bottom layer"),
            1,
            "श्यानता के कारण पाइप की आंतरिक दीवार के संपर्क वाली परत का वेग शून्य (No-slip condition) होता है, जबकि केंद्रीय अक्ष पर श्यान घर्षण न्यूनतम होने से द्रव का वेग अधिकतम होता है (परवलयाकार वेग प्रोफाइल)।",
            "Due to fluid viscosity and boundary friction (no-slip condition), velocity is zero at the pipe boundary and reaches parabolic maximum along the central axis.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m6_q9", "sci_1",
            "तेल पानी की सतह पर तेजी से क्यों फैल जाता है?",
            "Why does a drop of oil spread into a thin sheen over a water surface?",
            listOf("तेल का पृष्ठ तनाव पानी के पृष्ठ तनाव से कम होता है", "तेल का पृष्ठ तनाव पानी से अधिक होता है", "तेल का घनत्व पानी से अधिक होता है", "तेल की श्यानता अधिक होती है"),
            listOf("Surface tension of oil is less than that of water", "Surface tension of oil is greater than water", "Density of oil is greater than water", "Viscosity of oil is high"),
            0,
            "पानी का पृष्ठ तनाव (~72 mN/m) तेल के पृष्ठ तनाव (~30 mN/m) से अधिक होता है। पानी का उच्च पृष्ठ तनाव तेल की बूंद को चारों ओर खींचकर पतली परत के रूप में फैला देता है।",
            "Water has higher surface tension than oil. Water's stronger pull expands the oil drop across the water surface into a thin iridescent film.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m6_q10", "sci_1",
            "पहाड़ों पर चढ़ते समय व्यक्ति आगे की ओर क्यों झुकता है?",
            "Why does a mountaineer lean forward while ascending a steep hill?",
            listOf("थकान कम करने के लिए", "स्थायित्व बढ़ाने और गुरुत्व केंद्र को आधार के भीतर बनाए रखने के लिए", "तेजी से चलने के लिए", "हवा से बचने के लिए"),
            listOf("To reduce fatigue", "To enhance stability by keeping the center of gravity within the base of support", "To move faster", "To shield from wind"),
            1,
            "आगे झुकने से शरीर का गुरुत्व केंद्र (Center of Gravity) आगे खिसक जाता है और पैरों द्वारा बनाए गए आधार के भीतर बना रहता है, जिससे संतुलन और स्थायित्व बना रहता है।",
            "Leaning forward shifts the climber's line of gravity downward and forward, ensuring it passes well within the feet support base to prevent toppling backward.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m6_q11", "sci_1",
            "यदि किसी तार को खींचकर उसकी लंबाई दोगुनी कर दी जाए, तो उसका यंग प्रत्यास्थता गुणांक (Young's Modulus - Y):",
            "If a wire is stretched to double its original length, its Young's Modulus of elasticity (Y):",
            listOf("दोगुना हो जाएगा", "चार गुना हो जाएगा", "आधा हो जाएगा", "अपरिवर्तित रहेगा (पदार्थ का अभिलाक्षणिक गुण है)"),
            listOf("Doubles", "Quadruples", "Halves", "Remains unchanged (material property)"),
            3,
            "यंग प्रत्यास्थता गुणांक (Y) पदार्थ की प्रकृति पर निर्भर करता है, वस्तु की लंबाई या मोटाई पर नहीं। तार खींचने पर प्रतिबल और विकृति दोनों बढ़ते हैं, जिससे Y नियत रहता है।",
            "Young's Modulus is an intrinsic material property independent of geometry (length or cross-section); it remains completely unchanged.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m6_q12", "sci_1",
            "किसी कृत्रिम उपग्रह में सरल लोलक का आवर्तकाल (Time Period) कितना होगा?",
            "What is the time period of a simple pendulum inside an orbiting artificial satellite?",
            listOf("शून्य", "अनंत (Infinite, T = ∞)", "2 सेकंड", "24 घंटे"),
            listOf("Zero", "Infinite (T = ∞)", "2 seconds", "24 hours"),
            1,
            "उपग्रह में प्रभावी गुरुत्वीय त्वरण g_eff = 0 होता है। T = 2π √(l/g) के अनुसार जब g = 0 हो, तो आवर्तकाल T = ∞ (अनंत) हो जाएगा अर्थात लोलक दोलन ही नहीं करेगा।",
            "Inside an orbiting satellite in free fall, apparent g = 0. Substituting into T = 2π √(l/g) gives T = ∞, meaning the pendulum will not oscillate at all.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m6_q13", "sci_1",
            "रेतीली जमीन पर ऊंट आसानी से क्यों चल सकता है जबकि इंसान के पैर धंस जाते हैं?",
            "Why can a camel walk effortlessly on desert sand while humans sink into it?",
            listOf("ऊंट का वजन कम होता है", "ऊंट के पैर चौड़े होने से संपर्क क्षेत्रफल बढ़ जाता है और रेत पर दाब कम पड़ता है (P = F/A)", "ऊंट के पैरों में घर्षण नहीं होता", "ऊंट तेज दौड़ता है"),
            listOf("Camel is lighter", "Broad padded feet increase contact area, greatly reducing ground pressure (P = F/A)", "Zero friction on feet", "Runs very fast"),
            1,
            "दाब P = F/A होता है। ऊंट के चौड़े गद्दीदार तलवे संपर्क क्षेत्रफल (A) बढ़ा देते हैं, जिससे रेत पर प्रति एकांक क्षेत्रफल लगने वाला दाब कम हो जाता है और पैर नहीं धंसते।",
            "Pressure is inversely proportional to surface area (P = F/A). Broad padded hooves distribute body weight over a large area, minimizing pressure on loose sand.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m6_q14", "sci_1",
            "स्पिन गेंदबाजी में क्रिकेट की गेंद का हवा में घूमना (Swing/Magnus Effect) किस नियम पर आधारित है?",
            "The aerodynamic curve/swing of a spinning ball in flight (Magnus Effect) is explained by:",
            listOf("आर्किमिडीज का सिद्धांत", "बरनौली का प्रमेय (Bernoulli's Principle)", "न्यूटन का शीतलन नियम", "पास्कल का नियम"),
            listOf("Archimedes' Principle", "Bernoulli's Principle", "Newton's Law of Cooling", "Pascal's Law"),
            1,
            "मैग्नस प्रभाव (Magnus Effect) के अनुसार घूमती गेंद के एक तरफ हवा की गति तेज होकर दाब कम कर देती है और दूसरी तरफ दाब अधिक रहता है, जिससे गेंद कम दाब की ओर मुड़ (Swing) जाती है।",
            "The Magnus Effect arises from Bernoulli's principle: spin increases airflow velocity and drops pressure on one side while increasing pressure on the opposite side, producing a lateral curved trajectory.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m6_q15", "sci_1",
            "जब कोई द्रव किसी ठोस सतह को गीला नहीं करता (जैसे पारा कांच को), तो उसका स्पर्श कोण (Angle of Contact) कैसा होता है?",
            "When a liquid does not wet a solid surface (like mercury on glass), its Angle of Contact is:",
            listOf("शून्य (0°)", "न्यूनकोण (< 90°)", "अधिक कोण (> 90°, Obtuse angle)", "90°"),
            listOf("Zero (0°)", "Acute (< 90°)", "Obtuse (> 90°)", "Exactly 90°"),
            2,
            "जब संसंजन बल (Cohesive force) आसंजन बल (Adhesive force) से बहुत अधिक होता है, तो द्रव सतह को गीला नहीं करता और उसका स्पर्श कोण अधिक कोण (> 90°) होता है (पारे और कांच के लिए लगभग 138°)।",
            "When cohesive forces within the liquid exceed adhesive forces with the container, the liquid does not wet the wall and exhibits an obtuse contact angle (> 90°, ~138° for mercury on glass).",
            "Hard"
        ),

        // ==========================================
        // MOCK TEST 7 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m7_q1", "sci_1",
            "घूर्णन त्रिज्या (Radius of Gyration - k) और जड़त्व आघूर्ण (I) तथा द्रव्यमान (M) में क्या संबंध है?",
            "What is the relationship between Radius of Gyration 'k', Moment of Inertia 'I', and Mass 'M'?",
            listOf("I = M k²", "I = M / k²", "I = M² k", "k = I × M"),
            listOf("I = M k²", "I = M / k²", "I = M² k", "k = I × M"),
            0,
            "घूर्णन त्रिज्या k वह दूरी है जहाँ सम्पूर्ण द्रव्यमान केंद्रित मान लेने पर जड़त्व आघूर्ण वही रहता है (I = M k² या k = √(I/M))।",
            "Radius of gyration k represents the effective radial distance of concentrated mass from rotation axis: I = M k² or k = √(I/M).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q2", "sci_1",
            "फ्लाईव्हील (Flywheel) का उपयोग भारी इंजनों में क्यों किया जाता है?",
            "Why is a heavy Flywheel used in internal combustion engines and machines?",
            listOf("इंजन को हल्का बनाने के लिए", "घूर्णन ऊर्जा संचित कर गति में उतार-चढ़ाव को नियंत्रित (Smooth) करने के लिए", "ईंधन जलाने के लिए", "शीतलन के लिए"),
            listOf("To reduce engine weight", "To store rotational kinetic energy and smooth out speed fluctuations", "To ignite fuel", "For radiator cooling"),
            1,
            "फ्लाईव्हील का जड़त्व आघूर्ण (I) बहुत अधिक होता है। यह पावर स्ट्रोक के दौरान अतिरिक्त ऊर्जा संचित करता है और शेष स्ट्रोक में ऊर्जा देकर इंजन की गति को एकसमान बनाए रखता है।",
            "A flywheel's large moment of inertia allows it to store rotational kinetic energy during high-power cycles and release it during idle strokes, dampening rotational fluctuations.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q3", "sci_1",
            "सापेक्षिक घनत्व (Relative Density / Specific Gravity) का मात्रक क्या है?",
            "What is the unit of Relative Density (Specific Gravity)?",
            listOf("kg/m³", "g/cm³", "मात्रकहीन (Dimensionless / Unitless)", "N/m²"),
            listOf("kg/m³", "g/cm³", "Unitless / Dimensionless", "N/m²"),
            2,
            "सापेक्षिक घनत्व = (पदार्थ का घनत्व) / (4°C पर जल का घनत्व)। यह दो समान भौतिक राशियों का अनुपात होने के कारण मात्रकहीन और विमाहीन (Unitless & Dimensionless) राशि है।",
            "Relative density = Density of substance / Density of water at 4°C. Being the ratio of two identical dimensions, it is strictly unitless and dimensionless.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m7_q4", "sci_1",
            "रेल की पटरियों के मोड़ पर बाहरी पटरी को भीतरी पटरी से थोड़ा ऊपर क्यों उठाया (Banked) जाता है?",
            "Why is the outer rail elevated above the inner rail on curved railway tracks (Banking of tracks)?",
            listOf("पानी के निकास के लिए", "ट्रेन के भार का क्षैतिज घटक आवश्यक अभिकेंद्रीय बल प्रदान करने के लिए", "पटरी घिसने से बचाने के लिए", "सुंदरता के लिए"),
            listOf("For water drainage", "To provide the necessary centripetal force from the horizontal component of normal reaction", "To prevent rail wear", "For aesthetic appeal"),
            1,
            "पटरियों के बैंकिंग (Banking) से अभिलम्ब प्रतिक्रिया बल का क्षैतिज घटक (N sin θ) ट्रेन को मुड़ने के लिए आवश्यक अभिकेंद्रीय बल प्रदान करता है, जिससे पटरियों और पहियों पर घर्षण तनाव घटता है।",
            "Superelevation or banking tilts the normal reaction vector inward so its horizontal component (N sin θ) supplies the required centripetal acceleration without relying on flange friction.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q5", "sci_1",
            "एक बकेट में पानी भरकर यदि उसे ऊर्ध्वाधर वृत्त में तेजी से घुमाया जाए, तो उच्चतम बिंदु पर भी पानी नीचे क्यों नहीं गिरता?",
            "If a bucket of water is whirled rapidly in a vertical circle, why does water not spill out even at the highest inverted point?",
            listOf("वायुमंडलीय दाब के कारण", "उच्चतम बिंदु पर अभिकेंद्रीय त्वरण गुरुत्वीय त्वरण से अधिक या बराबर होने के कारण", "पानी के संसंजन बल के कारण", "पानी के जम जाने से"),
            listOf("Atmospheric pressure", "Inward centripetal acceleration matches or exceeds gravitational acceleration (v ≥ √(gr))", "Cohesion of water", "Water freezes"),
            1,
            "उच्चतम बिंदु पर वृत्तीय गति बनाए रखने के लिए न्यूनतम क्रांतिक वेग v_critical = √(g·r) होता है। इस वेग पर नीचे की ओर आवश्यक अभिकेंद्रीय खिंचाव गुरुत्वाकर्षण द्वारा पूरा हो जाता है।",
            "At the top of the vertical loop, minimum speed v ≥ √(gr) ensures that the required inward centripetal acceleration is supplied entirely by gravity without water separating from the bucket base.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q6", "sci_1",
            "श्यानता (Viscosity) निम्नलिखित में से किसमें पाई जाती है?",
            "Viscosity is a property exhibited by:",
            listOf("केवल द्रवों में", "केवल ठोसों में", "द्रव और गैस दोनों (तरलों) में", "केवल आदर्श गैसों में"),
            listOf("Only liquids", "Only solids", "Both liquids and gases (Fluids)", "Only ideal gases"),
            2,
            "श्यानता सभी तरलों (Fluids = Liquids + Gases) का गुण है जो उनकी विभिन्न परतों के बीच आपेक्षिक गति का विरोध करता है। ठोसों में श्यानता नहीं होती।",
            "Viscosity is the internal friction property present in all real fluids (both liquids and gases) resisting relative shearing motion between adjacent layers.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m7_q7", "sci_1",
            "यदि किसी वस्तु को पृथ्वी तल से ऊपर ले जाया जाए, तो उसके भार में क्या परिवर्तन होगा?",
            "What happens to the weight of an object as it is taken to higher altitudes above the Earth's surface?",
            listOf("बढ़ता है", "घटता है (Decreases with altitude: g' = g(1 - 2h/R))", "समान रहता है", "पहले बढ़ता है फिर घटता है"),
            listOf("Increases", "Decreases (g' = g(1 - 2h/R))", "Remains constant", "First increases then decreases"),
            1,
            "पृथ्वी की सतह से ऊपर जाने पर गुरुत्वीय त्वरण g' = g / (1 + h/R)² घटता जाता है। अतः भार W = mg भी ऊंचाई के साथ लगातार घटता है।",
            "Gravitational acceleration decreases with altitude (g' ≈ g(1 - 2h/R)). Consequently, the object's weight (W = mg) decreases continuously.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m7_q8", "sci_1",
            "द्रवचालित प्रेस (Hydraulic Press) में 10 गुना बड़े पिस्टन पर कितना बल प्राप्त होगा यदि छोटे पिस्टन पर F बल लगाया जाए?",
            "In an ideal hydraulic press, if force F is applied on an input piston of area A, what force is exerted on an output piston of area 10A?",
            listOf("F / 10", "F", "10 F (10 गुना)", "100 F"),
            listOf("F / 10", "F", "10 F (10 times)", "100 F"),
            2,
            "पास्कल के नियम के अनुसार दोनों पिस्टनों पर द्रव का दाब समान रहता है (P = F₁/A₁ = F₂/A₂)। अतः F₂ = F₁ × (A₂/A₁) = F × 10 = 10 F।",
            "By Pascal's principle, pressure is transmitted equally: P = F₁/A₁ = F₂/A₂. Thus, output force F₂ = F₁ × (10A/A) = 10F (Force multiplier effect).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q9", "sci_1",
            "पॉयसन अनुपात (Poisson's Ratio - σ) का सैद्धांतिक मान किस परास के बीच होता है?",
            "What is the theoretical range of Poisson's Ratio (σ = Lateral strain / Longitudinal strain)?",
            listOf("0 से 1", "-1 से +0.5", "1 से 2", "-0.5 से +1"),
            listOf("0 to 1", "-1 to +0.5 (practically 0 to 0.5)", "1 to 2", "-0.5 to +1"),
            1,
            "पॉयसन अनुपात (पार्श्विक विकृति / अनुदैर्ध्य विकृति) का सैद्धांतिक मान -1 से +0.5 के बीच होता है, जबकि अधिकांश व्यावहारिक पदार्थों के लिए यह 0 से 0.5 (जैसे कॉर्क के लिए ~0, रबर के लिए ~0.5) होता है।",
            "Poisson's Ratio (lateral strain / axial strain) theoretically ranges between -1 and +0.5, while practically for isotropic engineering materials it lies between 0 and 0.5.",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m7_q10", "sci_1",
            "शीशे की खिड़की पर बंदूक की गोली लगने पर साफ गोल छेद बनता है जबकि पत्थर मारने पर पूरा शीशा चटक जाता है। यह किसका उदाहरण है?",
            "A bullet makes a clean neat hole in a glass pane while a thrown stone shatters it completely. This illustrates:",
            listOf("न्यूटन का तृतीय नियम", "विराम का जड़त्व और उच्च चाल (High speed localized impact)", "पृष्ठ तनाव", "प्रत्यास्थता"),
            listOf("Newton's Third Law", "Inertia of rest and extremely short impact time at high bullet velocity", "Surface tension", "Elasticity"),
            1,
            "गोली की अत्यधिक चाल के कारण संघट्ट का समय इतना कम होता है कि केवल संपर्क वाले हिस्से को गति मिलती है और शेष शीशा अपने विराम के जड़त्व के कारण स्थिर रह जाता है।",
            "The bullet's immense speed makes the contact time extremely brief; only the directly struck glass acquires velocity while surrounding glass remains in place due to inertia of rest.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q11", "sci_1",
            "वायुमंडलीय दाब को पारे के स्तंभ की ऊंचाई में सामान्यतः कितना माना जाता है?",
            "Standard atmospheric pressure at sea level is equivalent to a column of mercury of height:",
            listOf("76 cm (760 mm Hg)", "100 cm", "50 cm", "7.6 cm"),
            listOf("76 cm (760 mm Hg)", "100 cm", "50 cm", "7.6 cm"),
            0,
            "समुद्र तल पर 0°C पर मानक वायुमंडलीय दाब 76 सेमी (760 मिमी या 760 टॉर) पारे के स्तंभ के दाब के बराबर होता है, जो 1.01325 × 10⁵ Pa के बराबर है।",
            "Standard sea-level atmospheric pressure supports a 76 cm (760 mm Hg) column of pure mercury at 0°C, exactly equal to 1.01325 × 10⁵ N/m² (1 atm).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m7_q12", "sci_1",
            "यदि दो उपग्रह एक ही वृत्ताकार कक्षा में चक्कर लगा रहे हैं, तो उनका क्या समान होगा?",
            "If two satellites of different masses orbit Earth in the exact same circular orbit, which property must be identical?",
            listOf("द्रव्यमान", "कक्षीय चाल और आवर्तकाल (Orbital Speed and Time Period)", "गतिज ऊर्जा", "संवेग"),
            listOf("Mass", "Orbital Speed and Time Period (v = √(GM/r))", "Kinetic Energy", "Momentum"),
            1,
            "कक्षीय चाल v = √(GM/r) और आवर्तकाल T = 2π √(r³/GM) केवल पृथ्वी के द्रव्यमान और कक्षा की त्रिज्या (r) पर निर्भर करते हैं, उपग्रह के अपने द्रव्यमान पर नहीं।",
            "Orbital velocity (v = √(GM/r)) and period depend strictly on central body mass M and orbital radius r, completely independent of satellite mass.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q13", "sci_1",
            "गहरी खदानों में जाने पर 'g' के मान पर क्या प्रभाव पड़ता है?",
            "What happens to the value of gravitational acceleration 'g' as one descends deep into a mine beneath Earth's surface?",
            listOf("बढ़ता है", "घटता है (Decreases: g_d = g(1 - d/R))", "अपरिवर्तित रहता है", "अनंत हो जाता है"),
            listOf("Increases", "Decreases (g_d = g(1 - d/R))", "Remains unchanged", "Becomes infinite"),
            1,
            "पृथ्वी तल से नीचे गहराई 'd' में जाने पर g_d = g(1 - d/R) होता है, अतः गहराई में जाने पर गुरुत्वीय त्वरण घटता जाता है और केंद्र पर शून्य हो जाता है।",
            "Below Earth's surface, effective mass inside radius (R-d) decreases faster than distance reduction, giving g_depth = g(1 - d/R); hence gravity decreases linearly with depth.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q14", "sci_1",
            "पानी की सतह पर कपूर के छोटे-छोटे टुकड़े नाचते हुए क्यों दिखाई देते हैं?",
            "Why do tiny camphor crystals exhibit erratic dancing motions when dropped on a clean water surface?",
            listOf("रासायनिक अभिक्रिया के कारण", "असमान रूप से घुलने के कारण उत्पन्न पृष्ठ तनाव के अंतर के कारण", "पानी के वाष्पीकरण से", "कपूर के हल्का होने से"),
            listOf("Chemical combustion", "Asymmetrical dissolution creating surface tension differentials", "Water evaporation", "Camphor lightness"),
            1,
            "कपूर पानी में असमान रूप से घुलता है जिससे विभिन्न बिंदुओं पर पृष्ठ तनाव अलग-अलग हो जाता है। उच्च पृष्ठ तनाव वाला क्षेत्र कपूर के टुकड़े को अपनी ओर खींचता है, जिससे यह नाचता प्रतीत होता है।",
            "Camphor dissolves unevenly around its edges, locally depressing water surface tension asymmetrically; surrounding higher surface tension drags the crystal, creating erratic dancing motion.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m7_q15", "sci_1",
            "जब कोई तैराक पानी में आगे तैरता है, तो वह अपने हाथों से पानी को पीछे धकेलता है। यह किस नियम का उदाहरण है?",
            "A swimmer pushes water backward with arms and legs to propel forward. This is a direct example of:",
            listOf("न्यूटन का गति का तृतीय नियम (क्रिया-प्रतिक्रिया)", "न्यूटन का प्रथम नियम", "आर्किमिडीज का सिद्धांत", "पास्कल का नियम"),
            listOf("Newton's Third Law of Motion (Action-Reaction)", "Newton's First Law", "Archimedes' Principle", "Pascal's Law"),
            0,
            "तैराक द्वारा पानी पर पीछे की ओर लगाया गया बल 'क्रिया' है और पानी द्वारा तैराक पर आगे की ओर लगाया गया बल 'प्रतिक्रिया' है।",
            "Pushing water backward constitutes the action force; the water exerting an equal and opposite forward thrust on the swimmer's body is the reaction force.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 8 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m8_q1", "sci_1",
            "बल आघूर्ण (Torque / Moment of Force) का SI मात्रक क्या है?",
            "What is the SI unit of Torque (τ = r × F)?",
            listOf("न्यूटन (N)", "न्यूटन-मीटर (N·m)", "जूल/सेकंड", "पास्कल"),
            listOf("Newton", "Newton-meter (N·m)", "Joule/second", "Pascal"),
            1,
            "बल आघूर्ण τ = बल × घूर्णन अक्ष से लंबवत दूरी = F × r sin θ। इसका SI मात्रक न्यूटन-मीटर (N·m) है।",
            "Torque is the rotational analogue of force (τ = r × F). Its SI unit is Newton-meter (N·m).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m8_q2", "sci_1",
            "दरवाजे का हैंडल (Handle) कब्जे (Hinges) से दूर कोने पर क्यों लगाया जाता है?",
            "Why are door handles fitted at the farthest edge away from the hinges?",
            listOf("सुंदर दिखने के लिए", "लंबवत दूरी बढ़ाकर कम बल में अधिक बल आघूर्ण प्राप्त करने के लिए", "दरवाजे का भार संतुलित करने के लिए", "लकड़ी बचाने के लिए"),
            listOf("Aesthetic look", "To maximize perpendicular distance (r) and achieve greater torque with minimal applied force", "To balance door weight", "To save wood"),
            1,
            "बल आघूर्ण τ = F × r होता है। कब्जे से दूरी (r) जितनी अधिक होगी, दरवाजे को खोलने या बंद करने के लिए उतना ही कम बल (F) लगाना पड़ेगा।",
            "Torque τ = F × r. Maximizing the lever arm distance (r) minimizes the physical force required to rotate and swing the door open.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m8_q3", "sci_1",
            "एक आदर्श स्प्रिंग का स्प्रिंग नियतांक (Spring Constant - k) क्या व्यक्त करता है?",
            "What does the Spring Constant 'k' in Hooke's law (F = -kx) signify?",
            listOf("स्प्रिंग की लंबाई", "स्प्रिंग की कठोरता / दृढ़ता (Stiffness of spring)", "स्प्रिंग का द्रव्यमान", "स्प्रिंग का तापमान"),
            listOf("Length of spring", "Stiffness / Rigidity of the spring", "Mass of spring", "Temperature of spring"),
            1,
            "स्प्रिंग नियतांक k = F/x (एकांक विस्तार उत्पन्न करने के लिए आवश्यक बल) स्प्रिंग की कठोरता (Stiffness) को मापता है। इसका मात्रक N/m है।",
            "The spring constant k = F/x measures the stiffness of an elastic spring (restoring force per unit elongation). Unit: N/m.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m8_q4", "sci_1",
            "जब कोई धातु का गोला गर्म किया जाता है, तो उसके किस गुण में प्रतिशत वृद्धि सर्वाधिक होगी?",
            "When a solid metal sphere is heated uniformly, which parameter experiences the largest percentage increase?",
            listOf("त्रिज्या (Radius)", "पृष्ठीय क्षेत्रफल (Surface Area)", "आयतन (Volume)", "घनत्व (Density)"),
            listOf("Radius", "Surface Area", "Volume (ΔV/V = 3α ΔT)", "Density"),
            2,
            "तापीय प्रसार में आयतन प्रसार गुणांक γ ≈ 3α (रेखीय प्रसार गुणांक का 3 गुना) और क्षेत्रीय प्रसार β ≈ 2α होता है। अतः आयतन में प्रतिशत वृद्धि सर्वाधिक (त्रिज्या की वृद्धि का 3 गुना) होगी।",
            "Volumetric expansion coefficient γ ≈ 3α while superficial β ≈ 2α. Thus, fractional increase in volume (ΔV/V ≈ 3 Δr/r) is three times the radial expansion.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m8_q5", "sci_1",
            "रेनकोट और वाटरप्रूफ कपड़ों पर पानी क्यों नहीं ठहरता?",
            "Why does water slide off waterproof raincoats without wetting the fabric?",
            listOf("रासायनिक लेपन से स्पर्श कोण 90° से अधिक (अधिक कोण) हो जाता है", "कपड़ा पानी को सोख लेता है", "कपड़े का तापमान अधिक होता है", "गुरुत्वाकर्षण के कारण"),
            listOf("Hydrophobic coating makes the contact angle obtuse (> 90°)", "Fabric absorbs water", "High fabric temperature", "Due to gravity"),
            0,
            "वाटरप्रूफिंग एजेंट कपड़े के रेशों पर जल-विरोधी (Hydrophobic) परत बनाते हैं, जिससे पानी का स्पर्श कोण अधिक कोण (> 90°) हो जाता है और पानी बूंद बनकर फिसल जाता है।",
            "Waterproofing treatments lower fabric surface energy, rendering the contact angle obtuse (> 90°), preventing wetting and causing droplets to bead up and roll off.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m8_q6", "sci_1",
            "अत्यधिक ठंडे देशों में सर्दियों में पानी के नल के पाइप क्यों फट जाते हैं?",
            "Why do water pipes burst during freezing winter nights in cold regions?",
            listOf("ठंड से लोहे के सिकुड़ने से", "पानी के 0°C पर बर्फ में बदलने पर आयतन के असामान्य प्रसार (Expansion) के कारण", "वायुदाब बढ़ने से", "बर्फ के भारी होने से"),
            listOf("Iron contraction due to frost", "Anomalous expansion of water upon freezing into ice increasing volume by ~9%", "Increased air pressure", "Ice weight"),
            1,
            "पानी जब 4°C से 0°C तक ठंडा होकर बर्फ बनता है, तो असामान्य प्रसार के कारण इसका आयतन लगभग 9% बढ़ जाता है। परिबद्ध पाइप में यह भारी दाब उत्पन्न करता है जिससे पाइप फट जाते हैं।",
            "Water expands anomalously by roughly 9% upon freezing into crystalline ice. In confined plumbing, this expansion generates tremendous hydrostatic pressure that ruptures pipes.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m8_q7", "sci_1",
            "यदि किसी वस्तु का संवेग 50% बढ़ा दिया जाए, तो उसकी गतिज ऊर्जा में कितने प्रतिशत की वृद्धि होगी?",
            "If the momentum of a moving body is increased by 50%, by what percentage does its kinetic energy increase?",
            listOf("50%", "100%", "125%", "225%"),
            listOf("50%", "100%", "125%", "225%"),
            2,
            "KE = p² / 2m। नया संवेग p' = 1.5 p होने पर नई KE' = (1.5)² KE = 2.25 KE। अतः गतिज ऊर्जा में वृद्धि = (2.25 - 1) × 100 = 125% होगी।",
            "Since KE ∝ p², new momentum p' = 1.5p gives KE' = (1.5)² KE = 2.25 KE, corresponding to a (2.25 - 1) × 100 = 125% increase.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m8_q8", "sci_1",
            "समुद्र की गहराई मापने के लिए प्रयुक्त 'फैदम' (Fathom) कितने फीट के बराबर होता है?",
            "In nautical navigation, 1 Fathom is equal to how many feet?",
            listOf("4 फीट", "6 फीट (लगभग 1.828 मीटर)", "8 फीट", "10 फीट"),
            listOf("4 feet", "6 feet (approx 1.828 m)", "8 feet", "10 feet"),
            1,
            "1 फैदम (Fathom) = 6 फीट = 1.8288 मीटर होता है। फैदोमीटर (Fathometer) सोनार तरंगों द्वारा समुद्र की गहराई मापने का उपकरण है।",
            "1 Fathom = 6 feet = 1.8288 meters, historically used for sounding water depth. A Fathometer measures ocean depth using sonar reflections.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m8_q9", "sci_1",
            "केरोसिन तेल पानी पर क्यों तैरता है?",
            "Why does kerosene oil float on the surface of water?",
            listOf("केरोसिन का घनत्व पानी के घनत्व से कम होता है", "केरोसिन का घनत्व पानी से अधिक होता है", "केरोसिन का पृष्ठ तनाव अधिक होता है", "केरोसिन पानी में घुल जाता है"),
            listOf("Density of kerosene is less than density of water", "Density of kerosene is greater than water", "Kerosene has higher surface tension", "Kerosene is water-soluble"),
            0,
            "केरोसिन तेल का घनत्व (~0.8 g/cm³) पानी के घनत्व (1.0 g/cm³) से कम होता है, इसलिए यह पानी के ऊपर तैरता है।",
            "Kerosene is immiscible and less dense (~0.8 g/cm³) than water (1.0 g/cm³), allowing it to float buoyantly on top.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m8_q10", "sci_1",
            "जब कोई नाव पानी में तैरती है, तो उस पर कार्य करने वाले दो मुख्य बल कौन-से होते हैं?",
            "When a boat floats steadily on water, which two equal and opposite forces act on it?",
            listOf("गुरुत्वाकर्षण बल (नीचे) और उत्प्लावन बल (ऊपर)", "घर्षण बल और पृष्ठ तनाव", "वायुदाब और चुंबकीय बल", "श्यान बल और संवेग"),
            listOf("Downward Gravitational Force and Upward Buoyant Force", "Friction and Surface Tension", "Air Pressure and Magnetic Force", "Viscosity and Momentum"),
            0,
            "तैरती नाव संतुलन में होती है क्योंकि नीचे की ओर लगने वाला कुल गुरुत्वीय भार (W = mg) पानी द्वारा ऊपर की ओर लगाए जाने वाले उत्प्लावन बल (Buoyancy) द्वारा ठीक संतुलित होता है।",
            "A floating vessel rests in static equilibrium where downward gravity (weight) is counterbalanced by upward buoyant force exerted by displaced fluid.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m8_q11", "sci_1",
            "हवाई जहाज के ब्लैक बॉक्स (Black Box) का वास्तविक रंग क्या होता है?",
            "What is the actual high-visibility color of an aircraft's 'Black Box' (Flight Data Recorder)?",
            listOf("काला (Black)", "नारंगी / ब्राइट ऑरेंज (Bright Orange)", "लाल (Red)", "पीला (Yellow)"),
            listOf("Black", "Bright Fluorescent Orange", "Red", "Yellow"),
            1,
            "हवाई जहाज के ब्लैक बॉक्स (FDR और CVR) का वास्तविक रंग चमकीला नारंगी (Fluorescent Orange) होता है ताकि दुर्घटना के मलबे और समुद्र में इसे आसानी से खोजा जा सके।",
            "Despite its name, an aircraft flight recorder ('Black Box') is painted bright fluorescent orange with reflective strips to facilitate rapid recovery after a crash.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m8_q12", "sci_1",
            "जब किसी स्प्रिंग को संपीडित (Compress) या विस्तारित (Extend) किया जाता है, तो स्थितिज ऊर्जा (U):",
            "Whether a mechanical spring is stretched or compressed from equilibrium, its elastic potential energy (U):",
            listOf("दोनों स्थितियों में बढ़ती है (U = 1/2 kx²)", "खींचने पर बढ़ती है, दबाने पर घटती है", "दोनों स्थितियों में घटती है", "शून्य रहती है"),
            listOf("Increases in both cases (U = 1/2 kx²)", "Increases on stretching, decreases on compression", "Decreases in both cases", "Remains zero"),
            0,
            "प्रत्यास्थ स्थितिज ऊर्जा U = 1/2 kx² होती है। विस्थापन 'x' धनात्मक हो या ऋणात्मक, x² सदैव धनात्मक रहता है, अतः दोनों स्थितियों में स्थितिज ऊर्जा बढ़ती है।",
            "Elastic potential energy U = 1/2 kx². Since displacement squared (x²) is always positive, deforming the spring either way increases its stored potential energy.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m8_q13", "sci_1",
            "जेट इंजन और रॉकेट इंजन में क्या मूलभूत अंतर है?",
            "What is the primary operational difference between a Jet Engine and a Rocket Engine?",
            listOf("जेट इंजन अपने दहन के लिए वातावरण से ऑक्सीजन लेता है, जबकि रॉकेट अपना ऑक्सीकारक साथ ले जाता है", "जेट इंजन में ईंधन नहीं होता", "रॉकेट केवल ठोस ईंधन पर चलता है", "जेट इंजन अंतरिक्ष में काम कर सकता है"),
            listOf("Jet engine ingests oxygen from ambient atmosphere; rocket carries its own onboard oxidizer", "Jet engine uses no fuel", "Rocket only uses solid propellant", "Jet engine works in space"),
            0,
            "जेट इंजन वायुमंडलीय ऑक्सीजन का उपयोग करता है अतः यह केवल वायुमंडल में उड़ सकता है, जबकि रॉकेट अपने साथ ईंधन और ऑक्सीडाइज़र दोनों ले जाता है जिससे यह निर्वात/अंतरिक्ष में भी कार्य करता है।",
            "Jet engines are air-breathing systems requiring atmospheric oxygen; rockets carry both fuel and oxidizer, functioning self-sufficiently in space vacuum.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m8_q14", "sci_1",
            "किसी नत समतल (Inclined plane) की यांत्रिक दक्षता (Mechanical Advantage - MA) सदैव कैसी होती है?",
            "The ideal Mechanical Advantage (MA) of a frictionless Inclined Plane of length 'L' and height 'h' is:",
            listOf("MA = L / h (सदैव 1 से अधिक)", "MA = h / L", "MA = L × h", "सदैव 1 से कम"),
            listOf("MA = L / h (Always > 1)", "MA = h / L", "MA = L × h", "Always < 1"),
            0,
            "नत समतल भारी वस्तु को उठाने के लिए आवश्यक बल को कम कर देता है। इसका यांत्रिक लाभ MA = L/h = 1/sin θ होता है, जो हमेशा 1 से बड़ा होता है।",
            "An inclined plane acts as a force multiplier: MA = Effort distance / Load distance = L/h = 1/sin θ, which is always greater than unity.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m8_q15", "sci_1",
            "भौतिकी में 'जूल-सेकंड' (J·s) किस राशि का मात्रक है?",
            "In physics, 'Joule-second' (J·s) is the SI unit of which fundamental quantity?",
            listOf("बल", "प्लांक नियतांक और कोणीय संवेग (Planck's Constant and Angular Momentum)", "ऊर्जा", "शक्ति"),
            listOf("Force", "Planck's Constant and Angular Momentum", "Energy", "Power"),
            1,
            "प्लांक नियतांक h (E = hν) और कोणीय संवेग L (Iω) दोनों का SI मात्रक J·s (या kg·m²/s) और विमीय सूत्र [M L² T⁻¹] होता है।",
            "Planck's Constant (h = 6.626 × 10⁻³⁴ J·s) and Angular Momentum share the identical unit Joule-second (J·s) and dimensions [M L² T⁻¹].",
            "Hard"
        ),

        // ==========================================
        // MOCK TEST 9 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m9_q1", "sci_1",
            "एक नॉटिकल मील (1 Nautical Mile) कितने किलोमीटर के बराबर होता है?",
            "One International Nautical Mile is equal to how many kilometers?",
            listOf("1.609 km", "1.852 km", "2.105 km", "1.500 km"),
            listOf("1.609 km", "1.852 km", "2.105 km", "1.500 km"),
            1,
            "1 अंतर्राष्ट्रीय समुद्री मील (Nautical Mile) = 1.852 किमी (1852 मीटर) होता है। सामान्य मील (Statute Mile) = 1.609 किमी होता है। समुद्री चाल 'नॉट' (Knot = 1 NM/h) में मापी जाती है।",
            "1 International Nautical Mile = 1.852 km (1,852 meters). Standard statute mile = 1.609 km. Marine speed is measured in knots (1 knot = 1 NM/h).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q2", "sci_1",
            "जब कोई वस्तु स्वतंत्र रूप से गुरुत्वाकर्षण के अधीन गिरती है, तो प्रत्येक सेकंड में उसके वेग में कितनी वृद्धि होती है?",
            "For a body falling freely under gravity near Earth's surface, its velocity increases by how much every second?",
            listOf("4.9 m/s", "9.8 m/s", "19.6 m/s", "32 m/s"),
            listOf("4.9 m/s", "9.8 m/s", "19.6 m/s", "32 m/s"),
            1,
            "गुरुत्वीय त्वरण g = 9.8 m/s² का अर्थ है कि निर्वात में स्वतंत्र गिरती वस्तु का वेग प्रति सेकंड 9.8 मीटर/सेकंड की दर से बढ़ता है।",
            "Gravitational acceleration g = 9.8 m/s² signifies that free-fall downward velocity increases uniformly by 9.8 meters per second every elapsed second.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q3", "sci_1",
            "एक भारी पत्थर और एक हल्के पंख को निर्वात (Vacuum) में समान ऊंचाई से एक साथ गिराया जाए, तो क्या होगा?",
            "If a heavy lead stone and a light feather are dropped simultaneously from the same height in a high vacuum chamber:",
            listOf("पत्थर पहले गिरेगा", "पंख पहले गिरेगा", "दोनों एक साथ जमीन पर पहुंचेंगे (Both reach simultaneously)", "पंख हवा में तैरता रहेगा"),
            listOf("Stone falls first", "Feather falls first", "Both reach ground simultaneously", "Feather floats"),
            2,
            "गैलीलियो के प्रयोग के अनुसार निर्वात में वायु का श्यान प्रतिरोध शून्य होता है और सभी वस्तुओं पर गुरुत्वीय त्वरण g समान लगता है, अतः दोनों एक साथ जमीन पर पहुंचेंगे।",
            "In vacuum, absent aerodynamic air drag, all objects accelerate at the identical rate 'g' independent of their mass, striking the floor simultaneously.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q4", "sci_1",
            "जब दूध को मथा जाता है तो मक्खन अलग हो जाता है, इसका मुख्य कारण क्या है?",
            "When curd or milk is churned, butter separates out primarily due to:",
            listOf("गुरुत्वाकर्षण बल", "अपकेंद्रीय बल प्रभाव (Centrifugal effect)", "संसंजन बल", "घर्षण बल"),
            listOf("Gravitational force", "Centrifugal force effect", "Cohesive force", "Frictional force"),
            1,
            "मथने के दौरान घूर्णन से अपकेंद्रीय बल उत्पन्न होता है जो अधिक घनत्व वाले मट्ठे को बाहर की ओर धकेलता है और कम घनत्व वाला मक्खन केंद्र में एकत्रित होकर ऊपर आ जाता है।",
            "Churning rotation imparts centrifugal acceleration; the denser buttermilk fraction is flung outward while lower-density butter globules coalesce inward.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q5", "sci_1",
            "द्रव की छोटी बूंदें गोल होती हैं, लेकिन बड़ी बूंदें गुरुत्वाकर्षण के कारण कैसी हो जाती हैं?",
            "Small liquid drops are perfectly spherical, but larger drops become flattened at the top and bottom due to:",
            listOf("पृष्ठ तनाव की तुलना में गुरुत्वाकर्षण बल के प्रभावी होने से", "श्यानता बढ़ने से", "वाष्पीकरण से", "वायुदाब से"),
            listOf("Gravitational force becoming dominant over surface tension forces", "Increased viscosity", "Evaporation", "Air pressure"),
            0,
            "छोटी बूंदों में पृष्ठ तनाव गुरुत्वाकर्षण पर हावी रहता है जिससे वे पूर्ण गोल होती हैं। बड़ी बूंदों का द्रव्यमान अधिक होने से गुरुत्वीय बल उन्हें नीचे की ओर चपटा (Oblate) कर देता है।",
            "In small droplets, surface tension dominates over gravity. As droplet volume grows, gravitational force flattens the droplet into an oblate shape.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m9_q6", "sci_1",
            "किसी वस्तु के कार्य करने की दर (Rate of doing work) को क्या कहा जाता है?",
            "The rate of doing work or rate of energy transfer is defined as:",
            listOf("ऊर्जा (Energy)", "शक्ति (Power)", "बल (Force)", "संवेग (Momentum)"),
            listOf("Energy", "Power (P = W/t)", "Force", "Momentum"),
            1,
            "शक्ति = कार्य / समय (P = W/t)। इसका SI मात्रक वाट (Watt = Joule/second) है। जेम्स वाट के सम्मान में इसका नाम रखा गया।",
            "Power is the rate at which work is done or energy transferred (P = dW/dt). SI unit is Watt (1 W = 1 J/s).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q7", "sci_1",
            "सोनार (SONAR - Sound Navigation and Ranging) में किस प्रकार की तरंगों का उपयोग किया जाता है?",
            "SONAR technology uses which type of waves for underwater navigation and depth measurement?",
            listOf("रेडियो तरंगें (Radio Waves)", "पराश्रव्य तरंगें (Ultrasonic Waves)", "अवरक्त तरंगें (Infrared Waves)", "गामा किरणें (Gamma Rays)"),
            listOf("Radio Waves", "Ultrasonic Waves (> 20 kHz)", "Infrared Waves", "Gamma Rays"),
            1,
            "सोनार में उच्च आवृत्ति वाली पराश्रव्य ध्वनि तरंगों (Ultrasonic Waves > 20 kHz) का उपयोग समुद्र की गहराई, डूबे जहाजों और पनडुब्बियों का पता लगाने में किया जाता है।",
            "SONAR emits high-frequency ultrasonic acoustic pulses (> 20 kHz) that travel through water, measuring echo return time to detect submerged objects.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q8", "sci_1",
            "जल में डिटर्जेंट मिलाने से जल के पृष्ठ तनाव पर क्या प्रभाव पड़ता है?",
            "What happens to the surface tension of water when detergent is dissolved in it?",
            listOf("बढ़ता है", "घटता है (Decreases)", "समान रहता है", "शून्य हो जाता है"),
            listOf("Increases", "Decreases", "Remains unchanged", "Becomes zero"),
            1,
            "डिटर्जेंट मिलाने से जल का पृष्ठ तनाव घट जाता है, जिससे घोल कपड़ों के छिद्रों में आसानी से फैलकर मैल के कणों को अलग कर देता है।",
            "Detergents reduce water's surface tension by disrupting hydrogen bonding networks, enhancing wetting and cleansing efficiency.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q9", "sci_1",
            "गैसों और द्रवों में ऊष्मा का संचरण मुख्य रूप से किस विधि द्वारा होता है?",
            "Heat transfer in liquids and gases primarily occurs through which mechanism?",
            listOf("चालन (Conduction)", "संवहन (Convection)", "विकिरण (Radiation)", "विसरण (Diffusion)"),
            listOf("Conduction", "Convection", "Radiation", "Diffusion"),
            1,
            "संवहन (Convection) में द्रव या गैस के गर्म अणु स्वयं एक स्थान से दूसरे स्थान जाकर ऊष्मा का संचरण करते हैं (उदा. जल का उबलना, समुद्री हवाएं)। ठोसों में चालन होता है।",
            "Convection is heat transfer by the actual bulk movement of heated fluid molecules (liquids and gases) driven by buoyancy density differences.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q10", "sci_1",
            "सूर्य से पृथ्वी तक ऊष्मा किस विधि द्वारा पहुंचती है?",
            "By which mode of heat transfer does thermal energy from the Sun reach the Earth across space?",
            listOf("चालन (Conduction)", "संवहन (Convection)", "विकिरण (Thermal Radiation)", "परावर्तन (Reflection)"),
            listOf("Conduction", "Convection", "Thermal Radiation", "Reflection"),
            2,
            "विकिरण (Radiation) विद्युत चुम्बकीय तरंगों (अवरक्त किरणों) के रूप में प्रकाश की चाल से निर्वात में संचरित होती है। इसे किसी भौतिक माध्यम की आवश्यकता नहीं होती।",
            "Thermal radiation travels as electromagnetic waves (primarily infrared) at the speed of light through the vacuum of space without requiring a material medium.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q11", "sci_1",
            "थर्मस फ्लास्क (Dewar Flask) में ऊष्मा के तीनों संचरणों (चालन, संवहन, विकिरण) को रोकने के लिए क्या व्यवस्था होती है?",
            "In a Thermos Flask, how are conduction, convection, and radiation losses minimized?",
            listOf("दोहरी दीवार के बीच निर्वात और कांच की चमकदार चांदी पॉलिश", "केवल प्लास्टिक की दीवार", "अंदर बर्फ रखकर", "मोटी तांबे की परत"),
            listOf("Vacuum between double walls and mirrored silvered internal surfaces", "Only plastic wall", "Placing ice inside", "Thick copper layer"),
            0,
            "दोहरी कांच की दीवारों के बीच निर्वात चालन और संवहन को रोकता है, जबकि चांदी की चमकदार कलई आंतरिक विकिरण को परावर्तित कर बाहर जाने से रोकती है।",
            "The vacuum between double glass walls eliminates conduction and convection; silvered mirrored surfaces reflect radiant heat back inside.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m9_q12", "sci_1",
            "क्रिकेट की गेंद को बल्ले से मारने पर गेंद की गति किस प्रकार की गति होती है?",
            "The flight of a cricket ball struck high into the air by a bat follows what kind of trajectory?",
            listOf("सरल रेखीय गति", "प्रक्षेप्य गति / परवलयाकार पथ (Projectile Motion / Parabolic path)", "वृत्तीय गति", "आवर्ती गति"),
            listOf("Linear rectilinear motion", "Projectile Motion / Parabolic trajectory", "Circular motion", "Periodic oscillation"),
            1,
            "हवा में प्रक्षेपित गेंद पर केवल नीचे की ओर गुरुत्वाकर्षण बल कार्य करता है, जिससे इसका प्रक्षेप पथ परवलयाकार (Parabolic) होता है।",
            "Under constant downward gravitational acceleration, the launched ball traces a curved parabolic trajectory characteristic of projectile motion.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q13", "sci_1",
            "द्रव का दाब गहराई (Depth 'h') के साथ किस प्रकार परिवर्तित होता है?",
            "How does hydrostatic pressure in a static liquid vary with depth 'h' below the free surface?",
            listOf("गहराई के साथ घटता है", "गहराई के साथ रैखिक रूप से बढ़ता है (P = P₀ + ρgh)", "अपरिवर्तित रहता है", "शून्य हो जाता है"),
            listOf("Decreases with depth", "Increases linearly with depth (P = P₀ + ρgh)", "Remains constant", "Becomes zero"),
            1,
            "द्रव में किसी बिंदु पर कुल दाब P = P₀ + ρgh होता है, जहाँ ρ द्रव का घनत्व और g गुरुत्वीय त्वरण है। अतः गहराई बढ़ने के साथ दाब बढ़ता है (इसीलिए बांध की दीवारें नीचे चौड़ी बनाई जाती हैं)।",
            "Hydrostatic gauge pressure increases directly proportional to depth: P = ρgh. Hence, dam walls are constructed thicker at the bottom to withstand massive pressure.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m9_q14", "sci_1",
            "एक सरल आवर्त दोलक (Simple Harmonic Oscillator) की माध्य स्थिति (Mean Position) पर क्या अधिकतम होता है?",
            "For a particle undergoing Simple Harmonic Motion (SHM), what reaches its maximum value at the Mean Position (x = 0)?",
            listOf("स्थितिज ऊर्जा और त्वरण", "गतिज ऊर्जा और वेग (Kinetic Energy and Velocity)", "प्रत्यानयन बल", "विस्थापन"),
            listOf("Potential Energy and Acceleration", "Kinetic Energy and Velocity", "Restoring Force", "Displacement"),
            1,
            "माध्य स्थिति (x = 0) पर विस्थापन और त्वरण शून्य होते हैं, जबकि वेग v_max = ωA और गतिज ऊर्जा अधिकतम होती है। चरम बिंदुओं (Extreme positions) पर स्थितिज ऊर्जा अधिकतम होती है।",
            "At the mean equilibrium position (x = 0), displacement and restoring acceleration are zero, while velocity (v_max = ωA) and kinetic energy reach their peaks.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m9_q15", "sci_1",
            "परम शून्य तापमान (Absolute Zero Temperature) क्या है?",
            "What is the theoretical Absolute Zero Temperature on the Kelvin and Celsius scales?",
            listOf("0 °C", "0 K या -273.15 °C", "-100 °C", "-459 K"),
            listOf("0 °C", "0 K or -273.15 °C", "-100 °C", "-459 K"),
            1,
            "परम शून्य तापमान (0 K = -273.15 °C) वह सैद्धांतिक न्यूनतम तापमान है जिस पर पदार्थ के सभी अणुओं की गतिज ऊर्जा और आणविक हलचल पूर्णतः समाप्त (शून्य) हो जाती है।",
            "Absolute zero (0 Kelvin = -273.15°C) is the lowest theoretical temperature at which thermodynamic enthalpy and entropy of an ideal gas reach minimum and molecular kinetic motion ceases.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 10 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_1_m10_q1", "sci_1",
            "एक बैरल (1 Barrel) कच्चे तेल में लगभग कितने लीटर होते हैं?",
            "One standard US Barrel (bbl) of crude petroleum contains approximately how many liters?",
            listOf("100 लीटर", "159 लीटर (158.98 L)", "200 लीटर", "250 लीटर"),
            listOf("100 Liters", "159 Liters (158.98 L)", "200 Liters", "250 Liters"),
            1,
            "1 बैरल = 42 अमेरिकी गैलन = 158.987 लीटर (लगभग 159 लीटर) होता है। यह अंतर्राष्ट्रीय तेल व्यापार की मानक इकाई है।",
            "1 standard petroleum barrel = 42 US gallons ≈ 158.987 liters (~159 L), the global unit for crude oil trading.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m10_q2", "sci_1",
            "ऊष्मागतिकी का शून्यवाँ नियम (Zeroth Law of Thermodynamics) किसकी अवधारणा को परिभाषित करता है?",
            "The Zeroth Law of Thermodynamics establishes the fundamental definition of which physical concept?",
            listOf("ऊष्मा", "तापमान (Temperature)", "एंट्रॉपी (Entropy)", "आंतरिक ऊर्जा (Internal Energy)"),
            listOf("Heat", "Temperature", "Entropy", "Internal Energy"),
            1,
            "शून्यवाँ नियम कहता है कि यदि निकाय A और B निकाय C के साथ अलग-अलग तापीय साम्य में हैं, तो A और B भी आपस में तापीय साम्य में होंगे। यह तापमान (Temperature) की अवधारणा का आधार है।",
            "The Zeroth Law states that thermal equilibrium is transitive between systems, providing the operational definition of Temperature and thermometer calibration.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m10_q3", "sci_1",
            "ऊष्मागतिकी का प्रथम नियम (First Law of Thermodynamics) किसका विशिष्ट रूप है?",
            "The First Law of Thermodynamics (ΔQ = ΔU + ΔW) is a statement of:",
            listOf("ऊर्जा संरक्षण का नियम (Conservation of Energy)", "द्रव्यमान संरक्षण का नियम", "संवेग संरक्षण का नियम", "दाब का नियम"),
            listOf("Law of Conservation of Energy", "Law of Conservation of Mass", "Law of Conservation of Momentum", "Law of Pressure"),
            0,
            "प्रथम नियम कहता है कि निकाय को दी गई ऊष्मा (ΔQ) आंतरिक ऊर्जा में वृद्धि (ΔU) और किए गए कार्य (ΔW) के योग के बराबर होती है (ΔQ = ΔU + ΔW)। यह ऊर्जा संरक्षण का नियम है।",
            "The First Law asserts that total energy in an isolated thermodynamic system remains conserved: heat added equals change in internal energy plus work done (ΔQ = ΔU + ΔW).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m10_q4", "sci_1",
            "एंट्रॉपी (Entropy) भौतिकी में क्या दर्शाती है?",
            "In thermodynamics, what does Entropy (S) quantify?",
            listOf("निकाय की कुल ऊर्जा", "निकाय की आणविक अव्यवस्था या यादृच्छिकता (Measure of Disorder / Randomness)", "निकाय का तापमान", "निकाय का घनत्व"),
            listOf("Total system energy", "Molecular Disorder / Randomness of a system", "System temperature", "System density"),
            1,
            "ऊष्मागतिकी के द्वितीय नियम के अनुसार ब्रह्मांड की एंट्रॉपी निरंतर बढ़ रही है। एंट्रॉपी निकाय की आणविक अव्यवस्था (Disorder) का माप है।",
            "Entropy (S = dQ/T) quantifies thermodynamic disorder or randomness in a closed system; the Second Law states entropy of an isolated system always increases.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m10_q5", "sci_1",
            "कार के रेडिएटर में जल का उपयोग शीतलक (Coolant) के रूप में क्यों किया जाता है?",
            "Why is water widely employed as a coolant in automobile engine radiators?",
            listOf("यह सस्ता और आसानी से उपलब्ध है", "जल की विशिष्ट ऊष्मा धारिता (Specific Heat Capacity) अत्यधिक उच्च (~4200 J/kg·K) होती है", "इसका घनत्व अधिक है", "यह तेजी से वाष्पीकृत होता है"),
            listOf("Cheap and available", "Water possesses an exceptionally high Specific Heat Capacity (~4184 J/kg·K)", "High density", "Evaporates quickly"),
            1,
            "जल की विशिष्ट ऊष्मा धारिता (4184 J/kg·°C) सभी द्रवों में सर्वाधिक होती है, जिससे यह बिना अधिक तापमान बढ़ाए भारी मात्रा में ऊष्मा अवशोषित कर सकता है।",
            "Water's remarkably high specific heat capacity (4.184 J/g·°C) enables it to absorb immense thermal energy from the engine block with minimal temperature rise.",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m10_q6", "sci_1",
            "जल का त्रिक बिंदु (Triple Point of Water) किस तापमान और दाब पर होता है?",
            "At what precise temperature and pressure does the Triple Point of Water exist?",
            listOf("0 °C और 1 atm", "273.16 K (0.01 °C) और 611.65 Pa (0.006 atm)", "100 °C और 1 atm", "-273.15 °C और 0 Pa"),
            listOf("0 °C and 1 atm", "273.16 K (0.01 °C) and 611.65 Pa (0.006 atm)", "100 °C and 1 atm", "-273.15 °C and 0 Pa"),
            1,
            "त्रिक बिंदु वह अद्वितीय अवस्था है जहाँ जल की तीनों प्रावस्थाएं (ठोस बर्फ, द्रव जल और जलवाष्प) साम्यावस्था में सहअस्तित्व में रहती हैं (T = 273.16 K = 0.01°C, P = 611.65 Pa)।",
            "The triple point of water is the thermodynamic state where ice, liquid water, and water vapor coexist in stable thermodynamic equilibrium (273.16 K at 611.65 Pa).",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m10_q7", "sci_1",
            "रेफ्रिजरेटर किस चक्र (Thermodynamic Cycle) पर कार्य करता है?",
            "A domestic refrigerator functions on which reversed thermodynamic cycle?",
            listOf("कार्नो चक्र (Carnot Cycle)", "रिवर्स कार्नो / वाष्प संपीडन चक्र (Vapor Compression Refrigeration Cycle)", "ओटो चक्र (Otto Cycle)", "डीजल चक्र (Diesel Cycle)"),
            listOf("Carnot Cycle", "Vapor Compression Cycle (Reversed Carnot)", "Otto Cycle", "Diesel Cycle"),
            1,
            "घरेलू रेफ्रिजरेटर वाष्प संपीडन प्रशीतन चक्र (Vapour Compression Refrigeration Cycle) पर काम करता है, जिसमें संपीडक (Compressor), संघनित्र (Condenser), प्रसार वाल्व और वाष्पित्र (Evaporator) होते हैं।",
            "Refrigerators operate on the Vapor-Compression Refrigeration Cycle using volatile refrigerants to extract heat from a cold reservoir and reject it into warmer surroundings.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m10_q8", "sci_1",
            "स्टीफन-बोल्ट्ज़मान का नियम (Stefan-Boltzmann Law) विकिरण की दर E और परम ताप T में क्या संबंध बताता है?",
            "Stefan-Boltzmann Law states that total thermal radiation emitted per unit area of a blackbody (E) is proportional to:",
            listOf("E ∝ T", "E ∝ T²", "E ∝ T³", "E ∝ T⁴ (ताप के चतुर्थ घात के समानुपाती)"),
            listOf("E ∝ T", "E ∝ T²", "E ∝ T³", "E ∝ T⁴ (Fourth power of absolute temperature)"),
            3,
            "स्टीफन का नियम E = σ T⁴ होता है, जहाँ σ स्टीफन नियतांक (5.67 × 10⁻⁸ W/m²·K⁴) है। यदि कृष्णिका का परम ताप दोगुना कर दिया जाए, तो विकिरित ऊर्जा 16 गुनी (2⁴) हो जाएगी।",
            "Stefan-Boltzmann law E = σT⁴ establishes that total blackbody radiant power is proportional to the 4th power of absolute temperature (σ = 5.67 × 10⁻⁸ W/m²·K⁴).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m10_q9", "sci_1",
            "वीन का विस्थापन नियम (Wien's Displacement Law) क्या बताता है?",
            "What does Wien's Displacement Law (λ_max × T = Constant) state?",
            listOf("गर्म वस्तु से उत्सर्जित अधिकतम तीव्रता वाली तरंगदैर्घ्य परम ताप के व्युत्क्रमानुपाती होती है", "ऊष्मा चालन दर", "दाब और आयतन का संबंध", "एंट्रॉपी वृद्धि"),
            listOf("Peak emission wavelength is inversely proportional to absolute temperature (λ_max ∝ 1/T)", "Thermal conductivity", "Pressure-Volume relation", "Entropy rise"),
            0,
            "वीन के नियमानुसार λ_max × T = b (वीन नियतांक = 2.898 × 10⁻³ m·K)। किसी तारे का तापमान जितना अधिक होगा, उसकी अधिकतम चमक उतनी ही छोटी तरंगदैर्घ्य (नीले रंग) की ओर विस्थापित होगी।",
            "Wien's displacement law states that peak emission wavelength of blackbody radiation shifts inversely with temperature: λ_max T = 2.898 × 10⁻³ m·K (hotter stars appear blue).",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m10_q10", "sci_1",
            "न्यूटन का शीतलन नियम (Newton's Law of Cooling) कब लागू होता है?",
            "Newton's Law of Cooling is valid under which condition?",
            listOf("जब वस्तु और वातावरण के बीच का तापांतर बहुत कम (Small temperature difference) हो", "जब तापांतर 500°C से अधिक हो", "केवल निर्वात में", "केवल ठोस पदार्थों के लिए"),
            listOf("When temperature difference between body and surroundings is small (< ~30°C)", "When ΔT > 500°C", "Only in vacuum", "Only for solids"),
            0,
            "न्यूटन के शीतलन नियम के अनुसार ऊष्मा ह्रास की दर वस्तु और परिवेश के तापांतर के समानुपाती होती है (dQ/dt = -k(T - T₀))। यह नियम केवल अल्प तापांतर (Small ΔT) के लिए सत्य है।",
            "Newton's Law of Cooling states rate of heat loss dQ/dt ∝ (T - T_env), applicable strictly when temperature gradient between object and ambient surroundings is small.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m10_q11", "sci_1",
            "1 कैलोरी (1 Calorie) ऊष्मा कितने जूल यांत्रिक कार्य के बराबर होती है?",
            "One Calorie (1 cal) of thermal heat equals how many Joules of mechanical work (Mechanical Equivalent of Heat, J)?",
            listOf("3.14 J", "4.184 J (या ~4.2 J)", "9.8 J", "746 J"),
            listOf("3.14 J", "4.184 J (or ~4.2 J)", "9.8 J", "746 J"),
            1,
            "1 कैलोरी ऊष्मा 1 ग्राम शुद्ध जल का तापमान 14.5°C से 15.5°C तक (1°C) बढ़ाने के लिए आवश्यक ऊष्मा है। जूल के यांत्रिक तुल्यांक के अनुसार 1 cal = 4.184 जूल।",
            "1 calorie is the thermal energy needed to raise 1 gram of water by 1°C (from 14.5°C to 15.5°C). 1 cal = 4.184 Joules (Joule's mechanical equivalent of heat).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m10_q12", "sci_1",
            "रुद्धोष्म प्रक्रम (Adiabatic Process) की क्या विशेषता होती है?",
            "What is the defining characteristic of an Adiabatic Process?",
            listOf("तापमान नियत रहता है", "निकाय और वातावरण के बीच ऊष्मा का कोई आदान-प्रदान नहीं होता (dQ = 0)", "दाब नियत रहता है", "आयतन नियत रहता है"),
            listOf("Temperature is constant", "Zero heat exchange between system and environment (dQ = 0)", "Pressure is constant", "Volume is constant"),
            1,
            "रुद्धोष्म प्रक्रम में ऊष्मा का आदान-प्रदान शून्य (dQ = 0) होता है (PV^γ = Constant)। जैसे साइकिल के ट्यूब का अचानक फटना जिससे हवा ठंडी हो जाती है।",
            "In an adiabatic process, heat transfer is strictly zero (dQ = 0, PV^γ = constant). A rapid expansion (like a bursting tire) cools the expanding gas adiabatically.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_1_m10_q13", "sci_1",
            "एक कार्नो इंजन (Carnot Engine) की दक्षता 100% (η = 1) केवल तभी संभव हो सकती है जब सिंक (Sink) का तापमान कितना हो?",
            "The thermodynamic efficiency of an ideal Carnot Engine (η = 1 - T_sink / T_source) can be 100% only if sink temperature is:",
            listOf("0 °C", "0 K (परम शून्य ताप / Absolute Zero)", "100 °C", "अनंत"),
            listOf("0 °C", "0 Kelvin (Absolute Zero)", "100 °C", "Infinite"),
            1,
            "कार्नो दक्षता η = 1 - (T₂/T₁) होती है। η = 1 होने के लिए सिंक का ताप T₂ = 0 K होना चाहिए। चूंकि परम शून्य ताप प्राप्त करना असंभव है, अतः किसी भी ऊष्मा इंजन की दक्षता 100% नहीं हो सकती।",
            "Carnot efficiency η = 1 - (T_sink / T_source). Achieving 100% efficiency requires T_sink = 0 K, which is thermodynamically impossible by the Third Law.",
            "Hard"
        ),
        makeScienceQ(
            "sci_1_m10_q14", "sci_1",
            "बर्फ के गलन की गुप्त ऊष्मा (Latent Heat of Fusion of Ice) कितनी होती है?",
            "What is the Specific Latent Heat of Fusion of Ice at 0°C?",
            listOf("540 cal/g", "80 cal/g (लगभग 3.36 × 10⁵ J/kg)", "100 cal/g", "1 cal/g"),
            listOf("540 cal/g", "80 cal/g (~3.36 × 10⁵ J/kg)", "100 cal/g", "1 cal/g"),
            1,
            "0°C की 1 ग्राम बर्फ को 0°C के जल में बदलने के लिए आवश्यक ऊष्मा 80 कैलोरी/ग्राम (3.34 × 10⁵ J/kg) होती है। जल के वाष्पीकरण की गुप्त ऊष्मा 540 cal/g (2.26 × 10⁶ J/kg) होती है।",
            "The latent heat of fusion of ice is 80 cal/g (3.34 × 10⁵ J/kg). The latent heat of vaporization of water is much higher: 540 cal/g (2.26 × 10⁶ J/kg).",
            "Easy"
        ),
        makeScienceQ(
            "sci_1_m10_q15", "sci_1",
            "100°C के उबलते पानी की तुलना में 100°C की भाप (Steam) से जलने पर अधिक तीव्र जलन क्यों महसूस होती है?",
            "Why do burns caused by steam at 100°C feel much more severe than burns caused by boiling water at 100°C?",
            listOf("भाप का तापमान अधिक होता है", "भाप में 540 cal/g की अतिरिक्त वाष्पीकरण की गुप्त ऊष्मा (Latent Heat) संचित होती है", "भाप तेजी से फैलती है", "भाप का दाब अधिक होता है"),
            listOf("Steam has higher temperature", "Steam contains an extra 540 cal/g of latent heat of vaporization that is released upon condensing on skin", "Steam expands quickly", "Higher pressure"),
            1,
            "100°C की भाप जब त्वचा पर संघनित होती है, तो वह 540 कैलोरी/ग्राम की अतिरिक्त गुप्त ऊष्मा (Latent heat) मुक्त करती है, जिससे त्वचा को उबलते पानी की तुलना में बहुत अधिक ऊष्मा मिलती है।",
            "Upon contacting skin, 100°C steam condenses into water, releasing 540 calories per gram of latent heat of vaporization before cooling, inflicting far deeper tissue burns.",
            "Easy"
        )
    )
}
