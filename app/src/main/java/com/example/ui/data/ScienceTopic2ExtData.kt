package com.example.ui.data

import com.example.ui.data.ScienceQuestionHelper.makeScienceQ
import com.example.ui.model.GkQuestion

object ScienceTopic2ExtData {
    val questions: List<GkQuestion> = listOf(
        // ==========================================
        // MOCK TEST 6 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_2_m6_q1", "sci_2",
            "प्रकाश विद्युत प्रभाव (Photoelectric Effect) की सफल सैद्धांतिक व्याख्या के लिए अल्बर्ट आइंस्टीन को 1921 में भौतिकी का नोबेल पुरस्कार किस अवधारणा के आधार पर दिया गया?",
            "For which concept in explaining the Photoelectric Effect was Albert Einstein awarded the 1921 Nobel Prize in Physics?",
            listOf("प्रकाश का तरंग सिद्धांत", "प्रकाश का क्वांटम / फोटॉन सिद्धांत (Photon Theory of Light)", "सापेक्षता का सामान्य सिद्धांत", "ब्राउनियन गति"),
            listOf("Wave theory of light", "Light Quantum / Photon Theory (E = hν)", "General Relativity", "Brownian Motion"),
            1,
            "आइंस्टीन ने मैक्स प्लांक की क्वांटम परिकल्पना का विस्तार करते हुए बताया कि प्रकाश ऊर्जा के छोटे-छोटे बंडलों/पैकेटों (फोटॉन) के रूप में चलता है (E = hν), जो धातु की सतह से इलेक्ट्रॉन उत्सर्जित करते हैं।",
            "Einstein explained that light energy is quantized into discrete packets called Photons (E = hν); when a photon hits a bound electron, it transfers its entire quantum to eject the photoelectron.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q2", "sci_2",
            "सिनेमा हॉल की दीवारों और छतों पर ध्वनि-अवशोषक पदार्थ (Acoustic Materials) क्यों लगाए जाते हैं?",
            "Why are sound-absorbing acoustic materials installed on auditorium and cinema hall walls?",
            listOf("आवाज को बहुत तेज करने के लिए", "अनुरणन (Reverberation) और अवांछित प्रतिध्वनियों को कम करने के लिए", "तापमान नियंत्रित करने के लिए", "सजावट के लिए"),
            listOf("To amplify sound", "To minimize excessive Reverberation and acoustic echoes", "To regulate temperature", "For decoration"),
            1,
            "बंद हॉल में बार-बार परावर्तन से ध्वनि का बने रहना अनुरणन (Reverberation) कहलाता है। अधिक अनुरणन से आवाज गूंजती है और समझ नहीं आती। अवशोषक सामग्री अनुरणन काल को नियंत्रित करती है।",
            "Repeated acoustic reflections create lingering reverberation. Porous acoustic drapes and perforated acoustic tiles absorb reflections, optimizing reverberation time for crisp intelligibility.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q3", "sci_2",
            "मैक संख्या (Mach Number) किसकी चाल मापने के लिए प्रयुक्त अनुपात है?",
            "Mach Number is the ratio of an object's speed to:",
            listOf("प्रकाश की चाल (Speed of Light)", "उसी माध्यम में ध्वनि की चाल (Speed of Sound in that medium)", "पलायन वेग", "पृथ्वी की घूर्णन चाल"),
            listOf("Speed of Light", "Speed of Sound in the surrounding medium (Mach = v/c_sound)", "Escape velocity", "Earth rotation speed"),
            1,
            "मैक संख्या = (पिंड की चाल) / (माध्यम में ध्वनि की चाल)। जब चाल 1 मैक से अधिक होती है तो गति को पराध्वनिक (Supersonic) और 5 मैक से अधिक को अति-पराध्वनिक (Hypersonic) कहा जाता है।",
            "Mach Number is a dimensionless parameter: Mach = Velocity of object / Local speed of sound. Mach > 1 is Supersonic; Mach > 5 is Hypersonic.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q4", "sci_2",
            "जब कोई सुपरसोनिक विमान ध्वनि से तेज गति से उड़ता है, तो उसके पीछे शंकु के आकार की जो तीव्र प्रघाती तरंगें (Shock Waves) बनती हैं, उनसे उत्पन्न भीषण ध्वनि को क्या कहते हैं?",
            "The thunderous explosive sound produced by shock waves trailing behind a supersonic aircraft exceeding the speed of sound is called:",
            listOf("ध्वनिक बूम (Sonic Boom)", "अल्ट्रासाउंड गूंज", "मैक प्रतिध्वनि", "डॉप्लर विस्फोट"),
            listOf("Sonic Boom", "Ultrasound Echo", "Mach Resonance", "Doppler Blast"),
            0,
            "पराध्वनिक विमान के आगे हवा के अणु हट नहीं पाते और एक अत्यधिक संपीडित प्रघाती तरंग (Shock wave / Mach Cone) बनती है, जो जमीन पर भारी विस्फोट जैसी आवाज 'सोनिक बूम' उत्पन्न करती है।",
            "When an aircraft exceeds Mach 1, compressed air molecules cannot escape ahead, coalescing into a conical shock wave that sweeps over the ground as a deafening Sonic Boom.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q5", "sci_2",
            "दृश्य प्रकाश स्पेक्ट्रम (Visible Light Spectrum) की तरंगदैर्घ्य परास लगभग कितनी होती है?",
            "What is the approximate wavelength range of the Visible Light Spectrum for human vision?",
            listOf("100 nm से 200 nm", "380 nm से 750 nm (या 3800 Å से 7500 Å)", "1000 nm से 5000 nm", "0.01 nm से 10 nm"),
            listOf("100 nm to 200 nm", "380 nm to 750 nm (3800 Å to 7500 Å)", "1000 nm to 5000 nm", "0.01 nm to 10 nm"),
            1,
            "मानव आँख के लिए दृश्य प्रकाश स्पेक्ट्रम लगभग 380 नैनोमीटर (बैंगनी) से 750 नैनोमीटर (लाल) अथवा 3800 Å से 7500 Å तक विस्तृत होता है।",
            "The human visible light spectrum extends roughly from 380 nm (deep violet) to 750 nm (deep red), spanning 3800 to 7500 Angstroms.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q6", "sci_2",
            "दूर दृष्टि दोष (Hypermetropia / Farsightedness) के निवारण के लिए किस लेंस का उपयोग किया जाता है?",
            "Which type of lens is prescribed to correct Hypermetropia (Farsightedness)?",
            listOf("अवतल लेंस (Concave)", "उत्तल लेंस (Convex / Converging Lens)", "बेलनाकार लेंस", "समतल लेंस"),
            listOf("Concave lens", "Convex Lens (Converging)", "Cylindrical lens", "Flat lens"),
            1,
            "हाइपरमेट्रोपिया में निकट की वस्तु का प्रतिबिम्ब रेटिना के पीछे बनता है। अभिसारी उत्तल लेंस (Convex lens) किरणों को पहले ही मोड़कर प्रतिबिम्ब को रेटिना पर फोकस करता है।",
            "In hypermetropia, light rays from nearby objects focus behind the retina. A converging Convex lens adds positive optical power to bring the focal point onto the retina.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q7", "sci_2",
            "दृष्टि वैषम्य या अबिंदुकता (Astigmatism) दोष, जिसमें क्षैतिज और ऊर्ध्वाधर रेखाएं एक साथ स्पष्ट नहीं दिखतीं, को ठीक करने के लिए कौन-सा लेंस प्रयुक्त होता है?",
            "Astigmatism, caused by irregular corneal curvature leading to blurred horizontal and vertical lines, is corrected using:",
            listOf("उत्तल लेंस", "अवतल लेंस", "बेलनाकार लेंस (Cylindrical Lens)", "प्रिज्म चश्मा"),
            listOf("Convex lens", "Concave lens", "Cylindrical Lens", "Prism glasses"),
            2,
            "अबिंदुकता कॉर्निया की वक्रता की असमानता (गोलाई में विषमता) के कारण होती है। इसके निवारण के लिए एक विशेष अक्ष पर वक्राकार बेलनाकार लेंस (Cylindrical Lens) का प्रयोग किया जाता है।",
            "Astigmatism arises from asymmetric non-spherical corneal curvature. It is corrected using Toric / Cylindrical Lenses designed with differential focal powers along perpendicular axes.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m6_q8", "sci_2",
            "समतल दर्पण (Plane Mirror) द्वारा बने प्रतिबिम्ब की प्रकृति क्या होती है?",
            "What are the optical characteristics of an image formed by a standard Plane Mirror?",
            listOf("वास्तविक और उल्टा", "आभासी, सीधा, वस्तु के बराबर आकार और पार्श्वतः उल्टा (Virtual, Erect, Same Size, Laterally Inverted)", "आभासी और छोटा", "वास्तविक और आवर्धित"),
            listOf("Real and inverted", "Virtual, Erect, Same Size, and Laterally Inverted", "Virtual and diminished", "Real and magnified"),
            1,
            "समतल दर्पण द्वारा बना प्रतिबिम्ब हमेशा आभासी (दर्पण के पीछे), सीधा, वस्तु के ठीक बराबर आकार का, दर्पण से समान दूरी पर और पार्श्व परिवर्तित (दायां भाग बायां दिखना) होता है।",
            "A plane mirror produces a virtual, erect image located at the exact same distance behind the mirror as the object in front, identical in scale, and laterally reversed.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q9", "sci_2",
            "यदि दो समतल दर्पण एक-दूसरे के समानांतर (0° कोण पर) आमने-सामने रखे हों, तो उनके बीच रखी वस्तु के कितने प्रतिबिम्ब बनेंगे?",
            "How many images are formed of an object placed between two parallel plane mirrors facing each other (θ = 0°)?",
            listOf("2", "10", "अनंत (Infinite, n = ∞)", "360"),
            listOf("2", "10", "Infinite (n = ∞)", "360"),
            2,
            "प्रतिबिम्बों की संख्या n = (360° / θ) - 1 होती है। जब θ = 0° (समानांतर) हो, तो 360°/0 = ∞ (अनंत प्रतिबिम्ब) बनते हैं (जैसे नाई की दुकान में)।",
            "Formula for number of reflections n = (360°/θ) - 1. When mirrors are parallel (θ = 0°), infinite repetitive reflections create an endless corridor of virtual images.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q10", "sci_2",
            "किसी व्यक्ति को समतल दर्पण में अपना पूर्ण प्रतिबिम्ब (Full-length image) देखने के लिए दर्पण की न्यूनतम ऊंचाई कितनी होनी चाहिए?",
            "What is the minimum height of a flat plane mirror required for a person of height 'H' to view their complete head-to-toe image?",
            listOf("व्यक्ति की ऊंचाई के बराबर (H)", "व्यक्ति की ऊंचाई की आधी (H / 2)", "व्यक्ति की ऊंचाई की एक-चौथाई (H / 4)", "व्यक्ति की ऊंचाई का दोगुना (2H)"),
            listOf("Equal to height (H)", "Half the person's height (H / 2)", "One-fourth the height (H / 4)", "Twice the height (2H)"),
            1,
            "परावर्तन के नियमों और समरूप त्रिभुजों के ज्यामितीय सिद्धांत के अनुसार व्यक्ति को अपना पूरा प्रतिबिम्ब देखने के लिए समतल दर्पण की न्यूनतम ऊंचाई उसकी कुल ऊंचाई की आधी (H/2) होनी चाहिए।",
            "By the laws of geometric reflection, ray traces from head and feet to the eyes require a mirror vertical length equal to at least half the observer's standing height (H/2).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q11", "sci_2",
            "प्रकाश की चाल (Speed of Light in Vacuum) का सटीक मान क्या है?",
            "What is the exact designated value of the Speed of Light in vacuum (c)?",
            listOf("3 × 10⁶ m/s", "299,792,458 m/s (लगभग 3 × 10⁸ m/s)", "3 × 10⁸ km/s", "1.5 × 10⁸ m/s"),
            listOf("3 × 10⁶ m/s", "299,792,458 m/s (~3 × 10⁸ m/s)", "3 × 10⁸ km/s", "1.5 × 10⁸ m/s"),
            1,
            "निर्वात में प्रकाश की चाल सार्वत्रिक नियतांक c = 299,792,458 मीटर/सेकंड (लगभग 3 × 10⁸ m/s या 3 लाख किमी/सेकंड) होती है। माध्यम में जाने पर यह घटकर v = c/n हो जाती है।",
            "The speed of light in vacuum is defined exactly as c = 299,792,458 m/s (~3 × 10⁸ m/s). In transparent optical media, speed drops to v = c/n (where n is refractive index).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q12", "sci_2",
            "रंगों के प्राथमिक रंग (Primary Colors of Light) कौन-से हैं?",
            "What are the three Primary Colors of Light in additive color synthesis?",
            listOf("लाल, पीला, नीला", "लाल, हरा, नीला (RGB - Red, Green, Blue)", "पीला, मैजेंटा, सियान", "सफेद, काला, लाल"),
            listOf("Red, Yellow, Blue", "Red, Green, Blue (RGB)", "Yellow, Magenta, Cyan", "White, Black, Red"),
            1,
            "प्रकाश के योज्य प्राथमिक रंग लाल (Red), हरा (Green), और नीला (Blue) हैं। इन्हें समान अनुपात में मिलाने पर श्वेत प्रकाश (White light) बनता है। टीवी और कंप्यूटर डिस्प्ले RGB प्रणाली पर काम करते हैं।",
            "The additive primary light colors are Red, Green, and Blue (RGB). Superimposing all three at equal intensities generates white light.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q13", "sci_2",
            "जल में आंशिक रूप से डूबी हुई सीधी छड़ मुड़ी हुई और छोटी क्यों दिखाई देती है?",
            "Why does a straight pencil or stick partially submerged in water appear bent and foreshortened at the air-water interface?",
            listOf("प्रकाश के परावर्तन के कारण", "प्रकाश के अपवर्तन के कारण (Refraction of Light)", "प्रकाश के विवर्तन के कारण", "पृष्ठ तनाव के कारण"),
            listOf("Reflection of Light", "Refraction of Light at the water-air boundary", "Diffraction", "Surface Tension"),
            1,
            "पानी (सघन) से हवा (विरल) में आते समय प्रकाश किरणें अभिलम्ब से दूर झुक जाती हैं, जिससे डूबे हुए हिस्से से आने वाला प्रकाश ऊपर उठा हुआ प्रतीत होता है।",
            "Light rays originating from the submerged segment bend away from the surface normal upon exiting denser water into rarer air, creating an apparent raised virtual position.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m6_q14", "sci_2",
            "प्रकाश का विवर्तन (Diffraction of Light) कब सबसे अधिक स्पष्ट दिखाई देता है?",
            "Diffraction of waves becomes most pronounced when the size of the obstacle/aperture 'd' is:",
            listOf("तरंगदैर्घ्य (λ) की तुलना में बहुत बड़ा हो", "तरंगदैर्घ्य (λ) की कोटि के बराबर या तुलनीय हो (d ≈ λ)", "अनंत हो", "शून्य हो"),
            listOf("Much larger than wavelength (d >> λ)", "Comparable to the wavelength of the wave (d ≈ λ)", "Infinite", "Zero"),
            1,
            "विवर्तन (अवरोध के किनारों से तरंगों का मुड़ना) तब सबसे अधिक प्रभावी होता है जब अवरोध या छिद्र का आकार प्रकाश की तरंगदैर्घ्य (λ ~ 500 nm) की कोटि का होता है।",
            "Diffraction—the bending of wave fronts around corners—is maximum when aperture or obstacle dimensions are on the order of the incident wavelength (d ≈ λ).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m6_q15", "sci_2",
            "रेड शिफ्ट (Red Shift) और ब्लू शिफ्ट (Blue Shift) का खगोलशास्त्र में क्या उपयोग है?",
            "In observational astronomy, Red Shift and Blue Shift of spectral lines are used to determine:",
            listOf("तारों का रासायनिक संघटन", "दूरस्थ आकाशगंगाओं की गति की दिशा और वेग (Doppler Velocity: Red shift = receding away)", "तारों का तापमान", "ग्रहों का द्रव्यमान"),
            listOf("Chemical composition", "Relative velocity and motion of galaxies (Redshift = moving away from Earth)", "Star temperature", "Planetary mass"),
            1,
            "डॉप्लर प्रभाव के अनुसार जब कोई आकाशगंगा हमसे दूर जा रही होती है तो उसका प्रकाश लंबी तरंगदैर्घ्य (लाल रंग) की ओर विस्थापित होता है (Redshift)। इससे एडविन हबल ने सिद्ध किया कि ब्रह्मांड फैल रहा है।",
            "Optical Doppler shift shifts spectral lines toward the red end when celestial bodies are receding (Cosmological Redshift), proving that the Universe is expanding.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 7 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_2_m7_q1", "sci_2",
            "ध्वनि की प्रबलता (Loudness) का स्तर किसमें मापा जाता है?",
            "Sound intensity and loudness level is measured logarithmically in which unit?",
            listOf("हर्ट्ज (Hz)", "डेसिबल (Decibel - dB)", "पास्कल (Pa)", "कैंडेला (cd)"),
            listOf("Hertz (Hz)", "Decibel (dB)", "Pascal (Pa)", "Candela (cd)"),
            1,
            "ध्वनि तीव्रता का स्तर डेसिबल (dB) में मापा जाता है (L = 10 log₁₀(I/I₀))। सामान्य बातचीत ~60 dB, फुसफुसाहट ~30 dB, और 85 dB से अधिक की ध्वनि लगातार सुनने पर कान को क्षति पहुंचाती है।",
            "Sound pressure level is measured in Decibels (dB) on a logarithmic scale. Normal conversation is ~60 dB, whispering is ~30 dB, and continuous exposure above 85 dB risks hearing damage.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m7_q2", "sci_2",
            "सीटी बजती हुई रेलगाड़ी जब प्लेटफॉर्म पर खड़े श्रोता के पास आती है तो सीटी की तीक्ष्णता (Pitch) बढ़ती हुई क्यों प्रतीत होती है?",
            "As a whistling train approaches a stationary observer on a platform, why does the whistle sound shriller (higher pitch)?",
            listOf("ध्वनि का वेग बढ़ने के कारण", "प्रति सेकंड प्राप्त तरंगों की संख्या (आभासी आवृत्ति) बढ़ने के कारण (डॉप्लर प्रभाव)", "हवा का दाब बढ़ने से", "आयाम बढ़ने से"),
            listOf("Increase in sound velocity", "Apparent increase in received frequency due to Doppler effect", "Higher air pressure", "Increased amplitude"),
            1,
            "स्रोत के प्रेक्षक की ओर गति करने से ध्वनि की तरंगदैर्घ्य संकुचित हो जाती है और प्रेक्षक को प्रति सेकंड अधिक तरंगें प्राप्त होती हैं, जिससे आभासी आवृत्ति बढ़ जाती है (f' = f [v / (v - v_s)])।",
            "Approaching sound source compresses the wavefronts ahead of it, decreasing apparent wavelength and increasing perceived acoustic frequency (f' = f·v/(v - v_s)).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m7_q3", "sci_2",
            "यदि किसी लेंस को ऐसे द्रव में डुबोया जाए जिसका अपवर्तनांक लेंस के कांच के अपवर्तनांक के ठीक बराबर हो, तो लेंस कैसा व्यवहार करेगा?",
            "If a glass lens is immersed in a liquid whose refractive index exactly equals that of the glass (n_liquid = n_lens):",
            listOf("यह और अधिक अभिसारी हो जाएगा", "यह एक साधारण समतल कांच की पट्टिका की भांति व्यवहार करेगा और अदृश्य हो जाएगा (f = ∞, Power = 0)", "यह अवतल बन जाएगा", "यह दर्पण बन जाएगा"),
            listOf("Becomes more converging", "Becomes an ordinary flat transparent slab and appears invisible (f = ∞, Power = 0)", "Turns into concave", "Acts as mirror"),
            1,
            "लेंस निर्माता सूत्र 1/f = (n_l/n_m - 1)(1/R₁ - 1/R₂) के अनुसार जब n_lens = n_medium हो, तो 1/f = 0 अर्थात् फोकस दूरी f = ∞ हो जाती है और लेंस में कोई अपवर्तन नहीं होता।",
            "When lens and surrounding liquid have matching refractive indices (n_lens = n_liquid), relative index is 1, focal length becomes infinite (Power = 0), and the lens becomes optically invisible.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m7_q4", "sci_2",
            "ऑप्टिकल फेनोमेना 'ब्रुस्टर का नियम' (Brewster's Law) ध्रुवण कोण (θ_p) और माध्यम के अपवर्तनांक (n) में क्या संबंध बताता है?",
            "Brewster's Law relating Brewster polarization angle (θ_p) and refractive index (n) is expressed as:",
            listOf("n = sin θ_p", "n = tan θ_p", "n = cos θ_p", "n = cot θ_p"),
            listOf("n = sin θ_p", "n = tan θ_p", "n = cos θ_p", "n = cot θ_p"),
            1,
            "ब्रुस्टर के नियमानुसार ध्रुवण कोण की स्पर्शज्या (Tangent) माध्यम के अपवर्तनांक के बराबर होती है (n = tan θ_p)। इस कोण पर परावर्तित और अपवर्तित किरणें परस्पर लंबवत (90°) होती हैं।",
            "Brewster's Law states n = tan(θ_p). At this specific incidence angle, completely polarized reflected light is perpendicular (90°) to the refracted beam.",
            "Hard"
        ),
        makeScienceQ(
            "sci_2_m7_q5", "sci_2",
            "होलोग्राफी (Holography) तकनीक में लेजर प्रकाश का उपयोग करके किस प्रकार का प्रतिबिम्ब रिकॉर्ड किया जाता है?",
            "Holography utilizes coherent laser light to record what kind of imagery?",
            listOf("केवल द्वि-विमीय (2D) छायाचित्र", "त्रि-विमीय (3D) वास्तविक त्रिविम प्रतिबिम्ब (आयाम और कला दोनों)", "केवल एक्स-रे चित्र", "थर्मल चित्र"),
            listOf("2D photographic silhouette", "Complete 3-Dimensional (3D) wavefront (recording both amplitude and phase)", "X-ray radiograph", "Thermal map"),
            1,
            "होलोग्राफी डेनिस गैबोर द्वारा खोजी गई तकनीक है जिसमें लेजर प्रकाश के व्यतिकरण द्वारा वस्तु से परावर्तित प्रकाश तरंगों के आयाम (Amplitude) और कला (Phase) दोनों को रिकॉर्ड कर 3D प्रतिबिम्ब बनाया जाता है।",
            "Invented by Dennis Gabor, holography uses coherent laser interference patterns to record both the amplitude and optical phase of wavefronts, creating true 3D visual reconstructions.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m6_q6_b", "sci_2",
            "ध्वनि तरंगें निर्वात (Vacuum) में संचरित क्यों नहीं हो सकतीं?",
            "Why are Sound Waves completely incapable of propagating through a vacuum?",
            listOf("क्योंकि प्रकाश ध्वनि को रोक देता है", "क्योंकि ध्वनि यांत्रिक तरंगें हैं जिन्हें संचरण के लिए प्रत्यास्थ भौतिक माध्यम (कणों) की आवश्यकता होती है", "क्योंकि निर्वात में तापमान शून्य होता है", "क्योंकि गुरुत्वाकर्षण नहीं होता"),
            listOf("Light blocks sound", "Because sound waves are mechanical waves requiring a material elastic medium with vibrating particles", "Zero temperature in vacuum", "Absence of gravity"),
            1,
            "ध्वनि तरंगें माध्यम के कणों के दोलन और आपसी संपीडन-विरलन द्वारा आगे बढ़ती हैं। निर्वात में कोई पदार्थ या अणु न होने के कारण ध्वनि का संचरण असंभव है।",
            "Mechanical longitudinal sound waves rely on inter-particle molecular collisions to transfer acoustic vibrational energy; a vacuum lacks mass particles.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m7_q7", "sci_2",
            "हवा में आर्द्रता (Humidity) बढ़ने पर ध्वनि की चाल पर क्या प्रभाव पड़ता है?",
            "What happens to the Speed of Sound in air as atmospheric Humidity increases?",
            listOf("ध्वनि की चाल घटती है", "ध्वनि की चाल बढ़ जाती है (Increases)", "अपरिवर्तित रहती है", "शून्य हो जाती है"),
            listOf("Speed decreases", "Speed of sound increases", "Remains unchanged", "Becomes zero"),
            1,
            "जलवाष्प (H₂O, आणविक भार 18) शुष्क हवा (N₂ और O₂, औसत भार 29) से हल्की होती है, जिससे आर्द्र हवा का घनत्व शुष्क हवा से कम होता है। v = √(γP/ρ) के अनुसार घनत्व घटने से चाल बढ़ जाती है।",
            "Water vapor is less dense than dry air (molecular mass 18 vs 29). Higher humidity lowers air density (ρ), which proportionally increases sound velocity (v ∝ 1/√ρ).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m7_q8", "sci_2",
            "दाब में परिवर्तन करने पर नियत ताप पर हवा में ध्वनि की चाल पर क्या प्रभाव पड़ता है?",
            "At a constant temperature, what is the effect of changing air Pressure on the speed of sound?",
            listOf("दाब बढ़ने पर चाल बढ़ती है", "दाब बढ़ने पर चाल घटती है", "ध्वनि की चाल पर कोई प्रभाव नहीं पड़ता (Independent of pressure)", "चाल दोगुनी हो जाती है"),
            listOf("Speed increases with pressure", "Speed decreases with pressure", "Speed of sound is independent of pressure variations", "Speed doubles"),
            2,
            "लाप्लास सूत्र v = √(γP/ρ) के अनुसार समतापीय स्थिति में दाब (P) बढ़ने पर घनत्व (ρ) भी उसी अनुपात में बढ़ जाता है (P/ρ = Constant), अतः दाब परिवर्तन का ध्वनि की चाल पर कोई प्रभाव नहीं पड़ता।",
            "Under isothermal conditions, P/ρ = constant (Boyle's law). An increase in pressure causes an exact proportional increase in gas density, keeping sound velocity unchanged.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m7_q9", "sci_2",
            "स्टेथोस्कोप (Stethoscope), जिससे डॉक्टर हृदय और फेफड़ों की धड़कन सुनते हैं, किस सिद्धांत पर कार्य करता है?",
            "A medical Stethoscope operates primarily on which acoustic physical principle?",
            listOf("ध्वनि का बहुल परावर्तन (Multiple Reflection of Sound)", "ध्वनि का विवर्तन", "ध्वनि का अपवर्तन", "डॉप्लर प्रभाव"),
            listOf("Multiple Reflection of Sound inside rubber tubing", "Acoustic diffraction", "Refraction", "Doppler shift"),
            0,
            "स्टेथोस्कोप में छाती के अंग से उत्पन्न ध्वनि चेस्ट-पीस से नली के अंदर दीवारों से बार-बार परावर्तित (Multiple Reflection) होकर बिना ऊर्जा खोए डॉक्टर के कानों तक पहुंचती है।",
            "Sound waves from internal bodily organs travel through the stethoscope tube by continuous multiple reflections along inner walls to the earpieces without signal dispersion.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m7_q10", "sci_2",
            "यदि किसी उत्तल लेंस के आधे भाग को काले कागज से ढक दिया जाए, तो उसके द्वारा बने प्रतिबिम्ब पर क्या प्रभाव पड़ेगा?",
            "If the lower half of a Convex Lens is covered with opaque black paper, what change occurs in the formed image?",
            listOf("प्रतिबिम्ब का आधा भाग गायब हो जाएगा", "प्रतिबिम्ब पूरा बनेगा लेकिन उसकी चमक / तीव्रता (Intensity) कम हो जाएगी", "प्रतिबिम्ब उल्टा हो जाएगा", "कोई प्रतिबिम्ब नहीं बनेगा"),
            listOf("Half of the image disappears", "Full image is formed but with reduced brightness / intensity", "Image becomes inverted", "No image is formed"),
            1,
            "लेंस का प्रत्येक खुला भाग पूरी वस्तु से आने वाली किरणों को अपवर्तित कर पूरा प्रतिबिम्ब बनाता है। आधा भाग ढकने से लेंस में प्रवेश करने वाले प्रकाश की मात्रा कम हो जाती है, जिससे प्रतिबिम्ब की तीव्रता (Brightness) आधी हो जाती है।",
            "Every segment of a lens focuses rays from all parts of the object to form a complete image. Covering half the aperture reduces the gathered light flux, dimming the image intensity by half.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m7_q11", "sci_2",
            "कांच के प्रिज्म से गुजरने पर श्वेत प्रकाश का अपने सात घटक रंगों में विभक्त होना क्या कहलाता है?",
            "The splitting of composite white light into its seven constituent colors when passing through a prism is termed:",
            listOf("वर्ण विक्षेपण (Dispersion of Light)", "प्रकाश का परावर्तन", "प्रकाश का विवर्तन", "प्रकाश का ध्रुवण"),
            listOf("Dispersion of Light", "Specular Reflection", "Diffraction", "Polarization"),
            0,
            "कांच में विभिन्न रंगों के प्रकाश की चाल और अपवर्तनांक भिन्न-भिन्न होने के कारण वे अलग-अलग कोणों पर मुड़ जाते हैं। इस परिघटना को वर्ण विक्षेपण (Dispersion) कहते हैं।",
            "Different spectral wavelengths experience different refractive indices in glass (v = c/n), refracting at distinct angles to spread into a spectrum (VIBGYOR).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m7_q12", "sci_2",
            "प्रकाश की तरंगदैर्घ्य को सामान्यतः किस इकाई में व्यक्त किया जाता है?",
            "Optical wavelengths are most conventionally stated in which units?",
            listOf("नैनोमीटर (nm) या एंग्स्ट्रॉम (Å)", "मीटर", "किलोमीटर", "कैंडेला"),
            listOf("Nanometers (nm) or Angstroms (Å)", "Meters", "Kilometers", "Candelas"),
            0,
            "1 नैनोमीटर (nm) = 10⁻⁹ मीटर और 1 एंग्स्ट्रॉम (Å) = 10⁻¹⁰ मीटर होता है। दृश्य प्रकाश 380 nm (3800 Å) से 750 nm (7500 Å) के बीच होता है।",
            "Visible optical wavelengths span 380-750 nm (1 nm = 10⁻⁹ m = 10 Å).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m7_q13", "sci_2",
            "कैमरे का कौन-सा भाग मानव आँख की रेटिना (Retina) के समतुल्य कार्य करता है?",
            "Which component of an optical/digital camera functions equivalently to the human eye's Retina?",
            listOf("लेंस (Lens)", "शटर (Shutter)", "फिल्म या डिजिटल सेंसर (Film / Image Sensor)", "अपर्चर (Aperture)"),
            listOf("Lens", "Shutter", "Film or Digital Sensor (CCD/CMOS)", "Aperture"),
            2,
            "मानव आँख में रेटिना पर वास्तविक और उल्टा प्रतिबिम्ब बनता है और यह प्रकाशग्राही कोशिकाओं द्वारा संकेत मस्तिष्क को भेजती है। कैमरे में यह कार्य फिल्म या डिजिटल इमेज सेंसर (CCD/CMOS) करता है।",
            "In the eye, photoreceptor cells on the retina capture the inverted real image, corresponding directly to a photographic film or digital CMOS/CCD imaging sensor in a camera.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m7_q14", "sci_2",
            "परावर्तन के नियम के अनुसार आपतन कोण (Angle of Incidence - i) और परावर्तन कोण (Angle of Reflection - r) में क्या संबंध होता है?",
            "According to the First Law of Reflection, the angle of incidence 'i' and angle of reflection 'r' are related as:",
            listOf("i > r", "i < r", "i = r (आपतन कोण सदैव परावर्तन कोण के बराबर होता है)", "i + r = 90°"),
            listOf("i > r", "i < r", "i = r (Angle of incidence equals angle of reflection)", "i + r = 90°"),
            2,
            "समतल या गोलीय किसी भी परावर्तक सतह पर आपतन कोण सदैव परावर्तन कोण के बराबर होता है (∠i = ∠r), और आपतित किरण, परावर्तित किरण व अभिलम्ब एक ही तल में होते हैं।",
            "The law of reflection dictates that for any smooth or curved reflective interface, angle of incidence equals angle of reflection (∠i = ∠r) in the incident plane.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m7_q15", "sci_2",
            "ध्वनि तरंगों का कौन-सा गुण ध्वनि की 'गुणता' या 'स्वर-गुण' (Timbre / Quality) को निर्धारित करता है, जिससे एक ही पिच और लाउडनेस के दो वाद्यों की पहचान होती है?",
            "Which characteristic of a sound wave determines its unique Timbre (Acoustic Quality), distinguishing a flute from a violin playing the identical pitch and volume?",
            listOf("आवृत्ति", "आयाम", "तरंग रूप और सन्नादियों की संख्या (Waveform and Harmonic overtones)", "तरंग वेग"),
            listOf("Fundamental frequency", "Amplitude", "Waveform shape and presence of harmonic Overtones", "Wave velocity"),
            2,
            "गुणता (Timbre) मूल स्वरक के साथ उपस्थित अधिस्वरकों (Harmonics/Overtones) की संख्या और उनके सापेक्ष आयामों पर निर्भर करती है, जिससे तरंग का रूप (Waveform) विशिष्ट हो जाता है।",
            "Timbre is determined by the complex composite waveform profile and harmonic spectrum (overtones) accompanying the fundamental frequency.",
            "Moderate"
        ),

        // ==========================================
        // MOCK TEST 8 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_2_m8_q1", "sci_2",
            "समतल दर्पण की फोकस दूरी (Focal Length) और वक्रता त्रिज्या कितनी होती है?",
            "What is the Focal Length and Radius of Curvature of a flat Plane Mirror?",
            listOf("शून्य (Zero)", "अनंत (Infinite, f = ∞)", "25 सेमी", "1 मीटर"),
            listOf("Zero", "Infinite (f = ∞, R = ∞)", "25 cm", "1 meter"),
            1,
            "समतल दर्पण एक ऐसे गोले का भाग माना जा सकता है जिसकी त्रिज्या अनंत है। अतः समतल दर्पण की वक्रता त्रिज्या R = ∞ और फोकस दूरी f = R/2 = ∞ (अनंत) होती है (लेंस क्षमता P = 0 D)।",
            "A plane mirror can be idealized as a spherical surface with infinite radius of curvature (R = ∞). Hence, its focal length is infinite (f = ∞) and optical power is zero.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q2", "sci_2",
            "सड़क पर लगे स्ट्रीट लैंपों में प्रकाश को दूर-दूर तक फैलाने (अपसारी करने) के लिए किस दर्पण का उपयोग किया जाता है?",
            "Which type of reflector mirror is used in street lights to disperse light over a broad wide area?",
            listOf("अवतल दर्पण", "उत्तल दर्पण (Convex Mirror / Diverging Reflector)", "समतल दर्पण", "परवलयाकार दर्पण"),
            listOf("Concave mirror", "Convex Mirror (Diverging Reflector)", "Plane mirror", "Parabolic mirror"),
            1,
            "उत्तल दर्पण अपसारी (Diverging) दर्पण होता है। यह बल्ब के प्रकाश को चारों ओर फैला देता है, जिससे सड़क पर व्यापक दृष्टि क्षेत्र में रोशनी फैलती है। (गाड़ियों की हेडलाइट में अवतल दर्पण होता है)।",
            "Convex mirrors act as diverging optical surfaces that disperse emitted light over wide street areas. (Automobile headlights utilize concave parabolic reflectors for parallel beams).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q3", "sci_2",
            "जब प्रकाश एक सघन माध्यम (Denser Medium जैसे कांच) से विरल माध्यम (Rarer Medium जैसे हवा) में प्रवेश करता है, तो अपवर्तित किरण:",
            "When a ray of light transitions from an optically Denser medium to an optically Rarer medium, the refracted ray:",
            listOf("अभिलम्ब की ओर झुकती है", "अभिलम्ब से दूर झुकती है (Bends away from normal)", "सीधी निकल जाती है", "वापस लौट जाती है"),
            listOf("Bends towards the normal", "Bends away from the surface normal", "Travels straight", "Reflects back"),
            1,
            "स्नेल के नियम (n₁ sin i = n₂ sin r) के अनुसार जब n₁ > n₂ हो, तो कोण r > i होता है अर्थात चाल बढ़ने के कारण किरण अभिलम्ब से दूर हट जाती है।",
            "By Snell's Law (n₁ sin θ₁ = n₂ sin θ₂), entering an optically rarer medium of lower refractive index increases wave speed, bending the ray away from the normal (θ₂ > θ₁).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q4", "sci_2",
            "क्रांतिक कोण (Critical Angle - θ_c) वह आपतन कोण है जिसके लिए अपवर्तन कोण का मान कितना होता है?",
            "The Critical Angle (θ_c) for a medium boundary is defined as the angle of incidence in denser medium for which the angle of refraction is:",
            listOf("0°", "45°", "90° (समतल के समानांतर)", "180°"),
            listOf("0°", "45°", "90° (Grazing emergence)", "180°"),
            2,
            "जब सघन माध्यम में आपतन कोण बढ़ाते-बढ़ाते ऐसा मान आता है जिस पर विरल माध्यम में अपवर्तन कोण 90° (r = 90°) हो जाता है, उस आपतन कोण को क्रांतिक कोण (sin θ_c = 1/n) कहते हैं।",
            "The critical angle is the angle of incidence in an optically denser medium producing an angle of refraction of exactly 90° along the boundary interface (sin θ_c = 1/n).",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m8_q5", "sci_2",
            "प्रकाशिक फाइबर (Optical Fiber) के आविष्कारक और 'फादर ऑफ फाइबर ऑप्टिक्स' किन्हें माना जाता है?",
            "Who is celebrated globally as the 'Father of Fiber Optics' for his pioneering breakthroughs in transmitting light through glass fibers?",
            listOf("सी.वी. रमन", "नरेंद्र सिंह कपानी (Narinder Singh Kapany)", "होमी जहांगीर भाभा", "सत्येंद्र नाथ बोस"),
            listOf("C. V. Raman", "Narinder Singh Kapany", "Homi J. Bhabha", "Satyendra Nath Bose"),
            1,
            "भारतीय मूल के अमेरिकी भौतिक विज्ञानी डॉ. नरेंद्र सिंह कपानी ने 1950 के दशक में लचीले ग्लास फाइबर के माध्यम से प्रकाश के पूर्ण आंतरिक परावर्तन द्वारा संचरण को प्रदर्शित किया और 'फाइबर ऑप्टिक्स' शब्द गढ़ा।",
            "Indian-American physicist Dr. Narinder Singh Kapany pioneered high-transmission bundled optical fibers in the 1950s and coined the term 'Fiber Optics'.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q6", "sci_2",
            "लेजर (LASER) का पूर्ण रूप क्या है?",
            "What is the full expansion of the acronym LASER?",
            listOf("Light Amplification by Stimulated Emission of Radiation", "Light Absorption by Stimulated Energy Rays", "Laser Automated System for Energy Radiation", "Light Amplification by Solar Emission of Radiation"),
            listOf("Light Amplification by Stimulated Emission of Radiation", "Light Absorption by Stimulated Energy Rays", "Laser Automated System for Energy Radiation", "Light Amplification by Solar Emission of Radiation"),
            0,
            "LASER = Light Amplification by Stimulated Emission of Radiation (उद्दीप्त उत्सर्जन द्वारा प्रकाश का प्रवर्धन)। इसका आविष्कार थियोडोर मैमन (Theodore Maiman) ने 1960 में रूबी लेजर द्वारा किया था।",
            "LASER stands for Light Amplification by Stimulated Emission of Radiation, first realized experimentally by Theodore Maiman in 1960 using a synthetic ruby crystal.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q7", "sci_2",
            "लेजर प्रकाश की मुख्य विशेषताएं क्या होती हैं?",
            "What are the defining characteristics of Laser radiation?",
            listOf("असंगत और बहुवर्णी", "एकवर्णी, अत्यंत संसक्त और अत्यधिक दिशात्मक (Monochromatic, Coherent, Highly Directional)", "सभी दिशाओं में फैलने वाली", "कम तीव्रता वाली"),
            listOf("Incoherent and polychromatic", "Monochromatic, highly Coherent, and exceptionally Directional with high intensity", "Dispersive in all directions", "Low intensity"),
            1,
            "लेजर किरणें एक ही तरंगदैर्घ्य (एकवर्णी), एक ही कला में कंपन करने वाली (संसक्त - Coherent), और बिना फैले समानांतर पुंज के रूप में अत्यधिक दूरी तक जाने वाली (दिशात्मक) होती हैं।",
            "Laser beams exhibit extreme temporal/spatial coherence, monochromatic spectral purity (single wavelength), minimal beam divergence, and enormous power density.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q8", "sci_2",
            "जल में रखी मछली अपनी वास्तविक गहराई की तुलना में कहाँ दिखाई देती है?",
            "A fish swimming in a freshwater pond appears to an observer standing above the surface at:",
            listOf("वास्तविक गहराई पर ही", "वास्तविक गहराई से थोड़ा ऊपर (आभासी गहराई: h' = h / n)", "वास्तविक गहराई से और नीचे", "पानी की सतह पर"),
            listOf("At true depth", "Slightly above its real depth (Apparent depth: h' = h / n)", "Deeper than true depth", "On the surface"),
            1,
            "अपवर्तन के कारण आभासी गहराई h' = वास्तविक गहराई (h) / अपवर्तनांक (n)। चूंकि जल का n = 1.33 होता है, मछली अपनी वास्तविक स्थिति से लगभग 25% ऊपर उठी हुई दिखाई देती है।",
            "Due to refraction from water into air, apparent depth h' = real depth / n. With water's index n = 4/3, the fish appears ~25% shallower than its true geometric position.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q9", "sci_2",
            "पूर्ण सूर्यग्रहण (Total Solar Eclipse) के दौरान सूर्य का कौन-सा भाग नग्न आँखों से दिखाई देता है?",
            "During a Total Solar Eclipse, which outermost atmospheric layer of the Sun becomes visible as a pearly white halo?",
            listOf("प्रकाशमंडल (Photosphere)", "वर्णमंडल (Chromosphere)", "कोरोना / किरीट (Corona)", "सौर ज्वाला"),
            listOf("Photosphere", "Chromosphere", "Corona", "Solar Flare"),
            2,
            "सूर्यग्रहण में जब चंद्रमा सूर्य के चमकदार प्रकाशमंडल (Photosphere) को पूरी तरह ढक लेता है, तो सूर्य का अत्यधिक गर्म बाहरी वायुमंडल 'कोरोना' (Corona) सफेद प्रभा-मंडल के रूप में दिखाई देता है।",
            "When the lunar disk obscures the blinding photosphere during totality, the million-degree faint outer plasma atmosphere of the Sun, the Corona, shines brilliantly.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q10", "sci_2",
            "कांच में प्रकाश की चाल (Speed of Light in Glass, n = 1.5) कितनी होती है?",
            "What is the speed of light inside a crown glass medium with refractive index n = 1.5?",
            listOf("3 × 10⁸ m/s", "2 × 10⁸ m/s (200,000 km/s)", "1.5 × 10⁸ m/s", "2.25 × 10⁸ m/s"),
            listOf("3 × 10⁸ m/s", "2 × 10⁸ m/s (200,000 km/s)", "1.5 × 10⁸ m/s", "2.25 × 10⁸ m/s"),
            1,
            "माध्यम में प्रकाश की चाल v = c / n = (3 × 10⁸ m/s) / 1.5 = 2.0 × 10⁸ m/s (2 लाख किमी/सेकंड) होती है। जल (n=1.33) में यह 2.25 × 10⁸ m/s होती है।",
            "Velocity of light in a medium is v = c/n. For glass (n = 1.5): v = (3.0 × 10⁸ m/s) / 1.5 = 2.0 × 10⁸ m/s (200,000 km/s). In water (n = 1.33), it is 2.25 × 10⁸ m/s.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q11", "sci_2",
            "मानव आँख में प्रवेश करने वाले प्रकाश की मात्रा का नियंत्रण किसके द्वारा किया जाता है?",
            "In the human eye, the quantity of incoming light entering the pupil is regulated by:",
            listOf("कॉर्निया (Cornea)", "आइरिस / परितारिका (Iris)", "रेटिना (Retina)", "नेत्र लेंस (Eye Lens)"),
            listOf("Cornea", "Iris", "Retina", "Crystalline Lens"),
            1,
            "आइरिस (परितारिका) आँख की पुतली (Pupil) के आकार को संकुचित या प्रसारित करके आँख में जाने वाले प्रकाश की तीव्रता को नियंत्रित करती है (तेज धूप में पुतली सिकुड़ती है, अंधेरे में फैलती है)।",
            "The pigmented muscular Iris controls the aperture diameter of the pupil, constricting in bright illumination and dilating in low light to optimize retinal exposure.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q12", "sci_2",
            "नेत्रदान (Eye Donation) में दाता की आँख का कौन-सा विशिष्ट भाग प्रत्यारोपित (Transplanted) किया जाता है?",
            "In ocular corneal grafting surgery (Eye Donation), which specific anatomical tissue of the donor eye is transplanted?",
            listOf("रेटिना (Retina)", "कॉर्निया (Cornea - स्वच्छ पटल)", "पूरा नेत्रगोलक", "नेत्र लेंस"),
            listOf("Retina", "Cornea", "Entire eyeball", "Crystalline Lens"),
            1,
            "नेत्रदान में आँख की सबसे बाहरी पारदर्शी झिल्ली 'कॉर्निया' (Cornea) का प्रत्यारोपण किया जाता है। कॉर्निया में रक्त वाहिकाएं नहीं होतीं, जिससे प्रतिरक्षा अस्वीकृति (Rejection) का खतरा बहुत कम होता है।",
            "Corneal transplantation (keratoplasty) grafts the transparent anterior Cornea. Since the cornea is avascular, it has remarkably low rates of immune allograft rejection.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q13", "sci_2",
            "मानव आँख के रेटिना पर स्थित शंक्वाकार कोशिकाएं (Cones) और शलाका कोशिकाएं (Rods) क्रमशः किसके प्रति संवेदनशील होती हैं?",
            "In the human retina, Cone photoreceptors and Rod photoreceptors are specialized respectively for:",
            listOf("शंकु: रंगों के प्रति, शलाका: मंद प्रकाश/रोशनी की तीव्रता के प्रति", "शंकु: मंद प्रकाश, शलाका: रंगों के प्रति", "दोनों केवल काले और सफेद के लिए", "दोनों केवल गति के लिए"),
            listOf("Cones: Color vision and fine detail; Rods: Dim light and black/white scotopic vision", "Cones: Dim light; Rods: Color", "Both for black and white", "Both for motion only"),
            0,
            "कोन कोशिकाएं (Cones ~60 लाख) तीव्र प्रकाश में रंगों (लाल, हरा, नीला) की पहचान कराती हैं। रॉड कोशिकाएं (Rods ~12 करोड़) रोडोप्सिन वर्णक द्वारा अत्यंत मंद प्रकाश (रात के समय) में देखने में मदद करती हैं।",
            "Cones mediate photopic color vision and high visual acuity in bright illumination. Rods contain rhodopsin and provide scotopic vision in twilight/dim light.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m8_q14", "sci_2",
            "वर्णांधता (Color Blindness) से पीड़ित व्यक्ति मुख्य रूप से किन दो रंगों में अंतर नहीं कर पाता?",
            "A person afflicted with congenital Color Blindness (Daltonism) has difficulty distinguishing between:",
            listOf("सफेद और काला", "लाल और हरा रंग (Red and Green)", "नीला और पीला", "बैंगनी और नारंगी"),
            listOf("White and Black", "Red and Green colors", "Blue and Yellow", "Violet and Orange"),
            1,
            "लाल-हरा वर्णांधता (Protanopia/Deuteranopia) X-गुणसूत्र संलग्न आनुवंशिक विकार है जिसमें रेटिना में लाल या हरे रंग के कोन पिगमेंट की कमी से व्यक्ति लाल और हरे रंग में भेद नहीं कर पाता।",
            "Red-green color blindness is an X-linked recessive genetic condition caused by defect in photopigment cone cells, impairing discrimination between red and green hues.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m8_q15", "sci_2",
            "मोतियाबिंद (Cataract) रोग में आँख का कौन-सा भाग प्रभावित होता है?",
            "In Cataract eye disease, what pathological change occurs in the ocular system?",
            listOf("कॉर्निया सूख जाता है", "नेत्र लेंस धुंधला और अपारदर्शी (Cloudy / Opaque) हो जाता है", "रेटिना अलग हो जाती है", "ऑप्टिक तंत्रिका नष्ट हो जाती है"),
            listOf("Cornea dries up", "Crystalline eye lens becomes progressively cloudy and opaque", "Retina detaches", "Optic nerve degenerates"),
            1,
            "मोतियाबिंद में लेंस के प्रोटीन के विकृतीकरण से प्राकृतिक नेत्र लेंस धुंधला/अपारदर्शी हो जाता है जिससे दृष्टि क्षीण हो जाती है। शल्य चिकित्सा द्वारा इसे हटाकर कृत्रिम इंट्राओकुलर लेंस (IOL) लगाया जाता है।",
            "Cataracts occur when crystalline proteins aggregate, clouding the natural crystalline lens into opacity; treated by surgical phacoemulsification and Intraocular Lens (IOL) implantation.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 9 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_2_m9_q1", "sci_2",
            "ध्वनि तरंगों का परावर्तन कर शरीर के आंतरिक अंगों (जैसे हृदय, यकृत, गर्भाशय) का चित्र प्राप्त करने की तकनीक को क्या कहते हैं?",
            "The diagnostic medical imaging technique that utilizes reflected high-frequency sound waves to visualize internal organs is:",
            listOf("एक्स-रे (X-Ray)", "अल्ट्रासोनोग्राफी / अल्ट्रासाउंड (Ultrasonography / USG)", "एमआरआई (MRI)", "सीटी स्कैन (CT Scan)"),
            listOf("X-Ray radiography", "Ultrasonography / Diagnostic Ultrasound (USG)", "Magnetic Resonance Imaging (MRI)", "Computed Tomography (CT)"),
            1,
            "अल्ट्रासोनोग्राफी (USG) में 2 से 18 MHz की पराश्रव्य (Ultrasonic) तरंगें शरीर में भेजी जाती हैं। विभिन्न ऊतकों से परावर्तित प्रतिध्वनियों से स्क्रीन पर आंतरिक अंगों का वास्तविक समय का चित्र बनता है।",
            "Ultrasonography transmits high-frequency ultrasonic acoustic pulses (2-18 MHz) and processes returning boundary echoes into real-time anatomical images without ionizing radiation.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q2", "sci_2",
            "ईकोकार्डियोग्राफी (Echocardiography - ECHO) किस अंग की कार्यप्रणाली की जांच के लिए अल्ट्रासाउंड का उपयोग करती है?",
            "Echocardiography (ECHO) specifically uses ultrasonic waves to assess the anatomical structure and function of which organ?",
            listOf("मस्तिष्क (Brain)", "हृदय (Heart)", "गुर्दे (Kidneys)", "फेफड़े (Lungs)"),
            listOf("Brain", "Heart", "Kidneys", "Lungs"),
            1,
            "इकोकार्डियोग्राफी हृदय की वाल्वों, कक्षों और रक्त प्रवाह का अल्ट्रासाउंड आधारित परीक्षण है जो हृदय रोगों के सटीक निदान में उपयोग होता है।",
            "Echocardiography employs diagnostic ultrasound imaging and Doppler velocity mapping to visualize cardiac chambers, myocardial walls, and heart valves.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q3", "sci_2",
            "गैसों में ध्वनि की चाल (v) गैस के परम तापमान (T) के किस प्रकार समानुपाती होती है?",
            "The speed of sound 'v' in an ideal gas is directly proportional to:",
            listOf("परम तापमान के (v ∝ T)", "परम तापमान के वर्गमूल के (v ∝ √T)", "तापमान के वर्ग के (v ∝ T²)", "तापमान से स्वतंत्र"),
            listOf("Absolute temperature (v ∝ T)", "Square root of absolute temperature (v ∝ √T)", "Square of temperature (v ∝ T²)", "Independent of temperature"),
            1,
            "गैस में ध्वनि का वेग v = √(γRT/M) होता है। अतः ध्वनि की चाल गैस के परम तापमान के वर्गमूल (v ∝ √T) के समानुपाती होती है (तापमान बढ़ने पर ध्वनि की चाल बढ़ती है, प्रति 1°C पर 0.61 m/s)।",
            "Acoustic velocity in an ideal gas is v = √(γRT/M), directly proportional to the square root of absolute temperature (v ∝ √T). Speed in air increases by 0.61 m/s per 1°C rise.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m9_q4", "sci_2",
            "रेडियो तरंगों (Radio Waves) का परावर्तन पृथ्वी के वायुमंडल की किस परत से होता है?",
            "Long-distance terrestrial Radio Waves bounce back to Earth by reflection from which atmospheric layer?",
            listOf("क्षोभमंडल (Troposphere)", "समतापमंडल (Stratosphere)", "आयनमंडल (Ionosphere)", "बहिर्मंडल (Exosphere)"),
            listOf("Troposphere", "Stratosphere", "Ionosphere", "Exosphere"),
            2,
            "आयनमंडल (Ionosphere - 80 से 400 किमी) में उपस्थित आयनित गैसें और मुक्त इलेक्ट्रॉन मध्यम व लघु रेडियो तरंगों (HF/SW) को परावर्तित कर पुनः पृथ्वी पर भेजते हैं, जिससे बेतार संचार संभव होता है।",
            "The Ionosphere's plasma layer reflects high-frequency skywave radio signals back towards Earth, enabling transcontinental radio communications.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q5", "sci_2",
            "रडार (RADAR - Radio Detection and Ranging) में हवाई जहाजों की स्थिति और दूरी का पता लगाने के लिए किन तरंगों का उपयोग होता है?",
            "RADAR systems locate the azimuth and range of airborne aircraft using which electromagnetic waves?",
            listOf("ध्वनि तरंगें", "रेडियो तरंगें और सूक्ष्म तरंगें (Radio Waves and Microwaves)", "पराबैंगनी किरणें", "गामा किरणें"),
            listOf("Acoustic sound waves", "Radio Waves and Microwaves", "Ultraviolet rays", "Gamma rays"),
            1,
            "रडार में सूक्ष्म तरंगों/रेडियो तरंगों को प्रेषित किया जाता है। लक्ष्य से परावर्तित होकर लौटने वाली तरंगों के समय अंतराल और डॉप्लर शिफ्ट से विमान की दूरी, दिशा और चाल ज्ञात की जाती है।",
            "RADAR transmits directional electromagnetic radio/microwave pulses and detects echoes reflected from aircraft surfaces to calculate range, elevation, and Doppler velocity.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q6", "sci_2",
            "माइक्रोवेव ओवन (Microwave Oven) में भोजन पकाने के लिए किस आवृत्ति की सूक्ष्म तरंगों का उपयोग किया जाता है जो जल के अणुओं में तीव्र घूर्णन कंपन पैदा करती हैं?",
            "Domestic Microwave Ovens heat food by dielectric heating at what standard microwave frequency?",
            listOf("50 Hz", "2.45 GHz (2450 MHz)", "100 kHz", "10 GHz"),
            listOf("50 Hz", "2.45 GHz (2450 MHz)", "100 kHz", "10 GHz"),
            1,
            "माइक्रोवेव ओवन 2.45 GHz (λ ≈ 12.2 cm) की गैर-आयनीकरण सूक्ष्म तरंगें उत्पन्न करता है, जो भोजन में मौजूद जल के द्विध्रुवीय अणुओं (Water dipoles) को प्रति सेकंड अरबों बार घुमाकर घर्षण ऊष्मा पैदा करती हैं।",
            "Microwave ovens operate at 2.45 GHz. The alternating electric field causes rapid rotational oscillation of polar water molecules in food, generating thermal heat uniformly.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m9_q7", "sci_2",
            "रात में देखने वाले नाइट विजन कैमरों (Night Vision Goggles) और टीवी रिमोट कंट्रोल में किन तरंगों का उपयोग किया जाता है?",
            "Thermal night-vision devices and standard TV Remote Controllers utilize which electromagnetic radiation?",
            listOf("पराबैंगनी किरणें (UV Rays)", "अवरक्त किरणें (Infrared Rays - IR)", "एक्स-रे", "गामा किरणें"),
            listOf("Ultraviolet Rays (UV)", "Infrared Radiation (IR)", "X-Rays", "Gamma Rays"),
            1,
            "अवरक्त तरंगें (Infrared rays) ऊष्मीय विकिरण होती हैं। रात में सभी गर्म वस्तुएं और जीवित शरीर अवरक्त किरणें उत्सर्जित करते हैं जिन्हें नाइट विजन सेंसर पकड़ लेते हैं। टीवी रिमोट में नियर-IR LED होती है।",
            "Infrared radiation (IR) is emitted as thermal heat by all warm bodies. Thermal night vision detects these emissions; TV remotes pulse near-infrared signals to control devices.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q8", "sci_2",
            "जल शोधन (Water Purification) में जीवाणुओं और रोगाणुओं को नष्ट करने के लिए किस प्रकाश का उपयोग किया जाता है?",
            "In modern water purifiers (RO+UV systems), which radiation is utilized to sterilize microbial pathogens?",
            listOf("अवरक्त किरणें", "पराबैंगनी किरणें (Ultraviolet - UV-C Radiation)", "दृश्य प्रकाश", "रेडियो तरंगें"),
            listOf("Infrared rays", "Ultraviolet (UV-C) Radiation (~254 nm)", "Visible light", "Radio waves"),
            1,
            "पराबैंगनी किरणें (विशेष रूप से UV-C, तरंगदैर्घ्य ~254 nm) बैक्टीरिया और वायरस के डीएनए/आरएनए की आणविक संरचना को नष्ट कर उन्हें निष्प्रभावी कर देती हैं।",
            "Germicidal UV-C light (~254 nm) penetrates cell walls of bacteria, viruses, and protozoans, dimerizing their DNA/RNA thymine bases to render them non-viable.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q9", "sci_2",
            "अंगुलियों के निशान (Fingerprints) और जाली दस्तावेजों/नोटों की जांच के लिए फॉरेंसिक विज्ञान में किन किरणों का उपयोग होता है?",
            "In forensic science, latent fingerprints and counterfeit currency notes are detected using:",
            listOf("पराबैंगनी प्रकाश (Ultraviolet Light)", "अवरक्त किरणें", "सूक्ष्म तरंगें", "रेडियो तरंगें"),
            listOf("Ultraviolet Light (UV)", "Infrared rays", "Microwaves", "Radio waves"),
            0,
            "पराबैंगनी प्रकाश के अंतर्गत फ्लोरोसेंट पदार्थ और सुरक्षा धागे विशेष प्रतिदीप्ति (Fluorescence) प्रदर्शित करते हैं, जिससे जाली नोट और अदृश्य पसीने के निशान स्पष्ट दिखाई देते हैं।",
            "UV radiation stimulates fluorescence in security threads on authentic currency notes and forensic powders applied to latent fingerprints.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q10", "sci_2",
            "एक्स-किरणों (X-Rays) की खोज किसने की थी?",
            "Who discovered X-Rays in 1895 and received the very first Nobel Prize in Physics (1901)?",
            listOf("विलियम रॉन्टगन (Wilhelm Conrad Röntgen)", "हेनरी बेकेरल", "मैरी क्यूरी", "जे.जे. थॉमसन"),
            listOf("Wilhelm Conrad Röntgen", "Henri Becquerel", "Marie Curie", "J. J. Thomson"),
            0,
            "जर्मन भौतिक विज्ञानी डब्ल्यू.सी. रॉन्टगन ने 1895 में कैथोड किरणों के प्रयोग के दौरान अज्ञात भेदनकारी किरणों की खोज की और उन्हें 'X-Rays' नाम दिया। 1901 में उन्हें प्रथम नोबेल पुरस्कार मिला।",
            "German physicist Wilhelm Röntgen discovered X-rays in 1895 while experimenting with Crookes cathode-ray tubes, earning the inaugural Nobel Prize in Physics in 1901.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q11", "sci_2",
            "विद्युत चुम्बकीय स्पेक्ट्रम में सर्वाधिक ऊर्जा और भेदन क्षमता (Penetrating Power) वाली किरणें कौन-सी हैं?",
            "In the Electromagnetic Spectrum, which radiation possesses the highest frequency, photon energy, and penetrating power?",
            listOf("रेडियो तरंगें", "अवरक्त किरणें", "एक्स-किरणें", "गामा किरणें (Gamma Rays - γ)"),
            listOf("Radio waves", "Infrared rays", "X-Rays", "Gamma Rays (γ)"),
            3,
            "गामा किरणें (Gamma Rays) परमाणु के नाभिक से उत्सर्जित होती हैं। इनकी आवृत्ति और फोटॉन ऊर्जा सर्वाधिक (E = hν) और तरंगदैर्घ्य सबसे छोटी (< 0.01 nm) होती है, जिससे इनकी भेदन क्षमता अत्यधिक होती है।",
            "Gamma rays have the shortest wavelengths (< 10⁻¹² m) and highest photon energies (> 100 keV), imparting immense penetrating ability through thick lead shielding.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q12", "sci_2",
            "कैंसर के उपचार में ट्यूमर कोशिकाओं को नष्ट करने के लिए किस रेडियोधर्मी समस्थानिक से निकलने वाली गामा किरणों का उपयोग 'रेडियोथेरेपी' में किया जाता है?",
            "In medical Radiotherapy, Gamma rays emitted from which radioactive isotope are standardly used to destroy cancerous tumor tissue?",
            listOf("आयोडीन-131", "कोबाल्ट-60 (Cobalt-60)", "कार्बन-14", "सोडियम-24"),
            listOf("Iodine-131", "Cobalt-60", "Carbon-14", "Sodium-24"),
            1,
            "कोबाल्ट-60 (Co-60) उच्च ऊर्जा वाली गामा किरणें (1.17 MeV और 1.33 MeV) उत्सर्जित करता है, जिनका उपयोग कैंसर ट्यूमर के टेलीथेरेपी उपचार में कैंसर कोशिकाओं के डीएनए को नष्ट करने के लिए किया जाता है।",
            "Cobalt-60 is a potent gamma emitter widely used in external beam teletherapy radiotherapy machines to eradicate localized malignant tumors.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q13", "sci_2",
            "विद्युत चुम्बकीय तरंगों (Electromagnetic Waves) का प्रायोगिक सत्यापन सर्वप्रथम किस वैज्ञानिक ने किया था?",
            "Who first experimentally verified the existence of Electromagnetic Waves in 1887, confirming Maxwell's electromagnetic theory?",
            listOf("जेम्स क्लर्क मैक्सवेल", "हेनरिक हर्ट्ज़ (Heinrich Hertz)", "गुग्लिएल्मो मार्कोनी", "माइकल फैराडे"),
            listOf("James Clerk Maxwell", "Heinrich Hertz", "Guglielmo Marconi", "Michael Faraday"),
            1,
            "मैक्सवेल ने 1865 में गणितीय सिद्धांत दिया था, परन्तु हेनरिक हर्ट्ज़ ने 1887 में स्पार्क गैप प्रयोग द्वारा ईएम तरंगों को उत्पन्न और संसूचित कर प्रायोगिक प्रमाण दिया। आवृत्ति का मात्रक 'हर्ट्ज़' (Hz) उन्हीं के नाम पर है।",
            "Heinrich Hertz experimentally produced and detected electromagnetic waves using spark-gap transmitters in 1887, proving Maxwell's unified electromagnetic theory.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m9_q14", "sci_2",
            "प्रकाश विद्युत सेल (Photoelectric Cell) किस ऊर्जा को किस ऊर्जा में परिवर्तित करता है?",
            "A Photoelectric Cell (Solar cell / Photodiode) converts which energy into which form?",
            listOf("विद्युत ऊर्जा को प्रकाश ऊर्जा में", "प्रकाश ऊर्जा को विद्युत ऊर्जा में (Light Energy into Electrical Energy)", "रासायनिक ऊर्जा को प्रकाश में", "ऊष्मीय ऊर्जा को यांत्रिक में"),
            listOf("Electrical to Light energy", "Light Energy into Electrical Energy", "Chemical to Light", "Thermal to Mechanical"),
            1,
            "फोटोइलेक्ट्रिक सेल प्रकाश विद्युत प्रभाव पर कार्य करता है। जब फोटॉन अर्धचालक संधि पर गिरते हैं, तो इलेक्ट्रॉन-होल युग्म उत्पन्न होकर विद्युत धारा (Photocurrent) बहती है।",
            "A photocell operates on the photoelectric/photovoltaic effect, directly transforming incident optical photon energy into electrical voltage and current.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m9_q15", "sci_2",
            "ध्वनि तरंगों के व्यतिकरण (Interference) का उपयोग किन आधुनिक हेडफोनों में बाहरी शोर को समाप्त करने के लिए किया जाता है?",
            "Destructive Interference of sound waves is utilized in which modern acoustic technology to cancel external ambient background noise?",
            listOf("एक्टिव नॉइज़ कैंसिलेशन हेडफोन (Active Noise Cancellation - ANC)", "साधारण ईयरफोन", "एम्प्लीफायर", "रेडियो स्पीकर"),
            listOf("Active Noise Cancellation (ANC) Headphones", "Passive Earphones", "Audio Amplifiers", "Megaphones"),
            0,
            "ANC हेडफोन के बाहरी माइक्रोफोन परिवेशी शोर को रिकॉर्ड करते हैं और 180° विपरीत कला (Out of phase / Anti-noise) ध्वनि तरंग उत्पन्न करते हैं, जो विनाशी व्यतिकरण द्वारा शोर को समाप्त कर देती है।",
            "Active Noise Cancellation (ANC) captures ambient noise via external microphones and synthesizes an inverted anti-phase acoustic wave (180° phase shift) to cancel noise destructively.",
            "Easy"
        ),

        // ==========================================
        // MOCK TEST 10 (15 Questions)
        // ==========================================
        makeScienceQ(
            "sci_2_m10_q1", "sci_2",
            "एक आदर्श कृष्णिका (Perfect Blackbody) की अवशोषण क्षमता (Absorptivity - a) का मान कितना होता है?",
            "What is the Absorptivity (a) of an ideal theoretical Blackbody for all incident radiation?",
            listOf("0", "0.5", "1.0 (पूर्ण अवशोषण)", "अनंत"),
            listOf("0", "0.5", "1.0 (100% absorption)", "Infinite"),
            2,
            "आदर्श कृष्णिका उस पर आपतित होने वाले सभी तरंगदैर्घ्यों के विकिरण को पूर्णतः अवशोषित (Absorptivity a = 1) कर लेती है और किसी भी विकिरण को परावर्तित या पारगमित नहीं करती।",
            "An ideal blackbody has an absorptive power of unity (a = 1.0), perfectly absorbing all incident electromagnetic radiation irrespective of wavelength or incident angle.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q2", "sci_2",
            "किरचॉफ का विकिरण नियम (Kirchhoff's Law of Thermal Radiation) क्या बताता है?",
            "What fundamental principle does Kirchhoff's Law of Thermal Radiation establish?",
            listOf("अच्छे अवशोषक ही अच्छे उत्सर्जक होते हैं (Good Absorbers are Good Emitters: e = a)", "ठंडी वस्तुएं अधिक चमकती हैं", "विकिरण दाब", "ऊष्मा चालन"),
            listOf("Good Absorbers are Good Emitters (e_λ = a_λ at thermal equilibrium)", "Cold bodies shine brighter", "Radiation pressure", "Thermal conduction"),
            0,
            "किरचॉफ के नियमानुसार किसी निश्चित ताप पर किसी पदार्थ की उत्सर्जन क्षमता (Emissivity) और अवशोषण क्षमता (Absorptivity) का अनुपात समान होता है। जो वस्तु जिस रंग को अधिक अवशोषित करती है, गर्म करने पर वही रंग सबसे अधिक उत्सर्जित करती है।",
            "Kirchhoff's law states that at thermal equilibrium, spectral emissivity equals spectral absorptivity (e_λ = a_λ); a body that absorbs a specific wavelength efficiently will radiate it just as effectively.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m10_q3", "sci_2",
            "ग्रीनहाउस प्रभाव (Greenhouse Effect) के लिए मुख्य रूप से कौन-सी विद्युत चुम्बकीय किरणें जिम्मेदार हैं?",
            "Which electromagnetic radiation trapped by atmospheric greenhouse gases (CO₂, H₂O, CH₄) causes global planetary warming?",
            listOf("पराबैंगनी किरणें", "दीर्घ तरंगदैर्घ्य वाली अवरक्त किरणें (Thermal Infrared Radiation)", "एक्स-रे", "दृश्य प्रकाश"),
            listOf("Ultraviolet rays", "Long-wave Thermal Infrared Radiation", "X-Rays", "Visible light"),
            1,
            "पृथ्वी की सतह सूर्य के लघु-तरंग प्रकाश को अवशोषित कर गर्म होती है और दीर्घ तरंगदैर्घ्य वाली अवरक्त किरणें (Thermal Infrared) उत्सर्जित करती है, जिन्हें ग्रीनहाउस गैसें अवशोषित कर वापस वायुमंडल में लौटा देती हैं।",
            "Incoming shortwave solar radiation warms Earth's surface, which reradiates longwave terrestrial thermal Infrared. Greenhouse gases absorb and re-emit this IR, trapping heat.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q4", "sci_2",
            "सोनार (SONAR) में प्रयुक्त पराश्रव्य तरंगों की आवृत्ति कितनी होती है?",
            "The frequency of Ultrasonic waves used in SONAR and industrial crack detection is:",
            listOf("20 Hz से कम", "20 Hz से 20 kHz", "20 kHz (20,000 Hz) से अधिक", "1 Hz"),
            listOf("Below 20 Hz", "20 Hz to 20 kHz", "Above 20 kHz (20,000 Hz)", "1 Hz"),
            2,
            "पराश्रव्य तरंगों (Ultrasonic waves) की आवृत्ति 20,000 हर्ट्ज (20 kHz) से अधिक होती है। उच्च आवृत्ति के कारण इनमें उच्च ऊर्जा और न्यूनतम फैलाव होता है।",
            "Ultrasonic acoustic waves exceed the human hearing limit of 20 kHz, possessing short wavelengths that enable high directional resolution in marine bathymetry.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q5", "sci_2",
            "भूकंप आने से ठीक पहले पृथ्वी के अंदर से किस प्रकार की ध्वनि तरंगें उत्पन्न होती हैं जिन्हें जानवर पहले ही महसूस कर लेते हैं?",
            "Which acoustic seismic waves are emitted in the initial phase preceding a major earthquake that animals detect sensitively?",
            listOf("अपश्रव्य तरंगें (Infrasonic Waves < 20 Hz)", "पराश्रव्य तरंगें", "माइक्रोवेव", "गामा किरणें"),
            listOf("Infrasonic Waves (< 20 Hz)", "Ultrasonic waves", "Microwaves", "Gamma rays"),
            0,
            "भूकंप की मुख्य प्रघाती तरंगों से पहले निम्न आवृत्ति (< 20 Hz) की अपश्रव्य तरंगें (Infrasound) उत्पन्न होती हैं, जिन्हें हाथी, व्हेल, गेंडा और कुत्ते आसानी से सुन लेते हैं और बेचैन हो जाते हैं।",
            "Earthquake tectonic faults generate sub-audible Infrasonic waves (< 20 Hz) prior to surface shear rupture, sensed by sensitive animal sensory systems.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q6", "sci_2",
            "आकाश में बिजली चमकने के कुछ सेकंड बाद बादलों के गरजने की आवाज क्यों सुनाई देती है?",
            "Why is the clap of thunder heard several seconds after lightning flashes across the sky?",
            listOf("बिजली बाद में चमकती है", "प्रकाश की चाल (~3 × 10⁸ m/s) ध्वनि की चाल (~343 m/s) से अत्यधिक तीव्र होती है", "ध्वनि हवा में नहीं चल सकती", "बादल बहुत दूर होते हैं"),
            listOf("Lightning occurs later", "Speed of light (~3 × 10⁸ m/s) is vastly faster than the speed of sound in air (~343 m/s)", "Sound cannot travel in air", "Clouds are far"),
            1,
            "बिजली और गड़गड़ाहट एक ही क्षण उत्पन्न होती हैं। प्रकाश लगभग तात्कालिक रूप से (~3 लाख किमी/सेकंड) पहुंचता है, जबकि ध्वनि मात्र ~343 मीटर/सेकंड की गति से चलकर कुछ सेकंड बाद पहुंचती है।",
            "Lightning and thunder occur simultaneously. Light travels at 300,000 km/s (instantaneous arrival), while sound travels slowly at ~343 m/s (taking ~3 seconds per kilometer).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q7", "sci_2",
            "प्रकाश की किरण जब विरल माध्यम (हवा) से सघन माध्यम (कांच) में प्रवेश करती है, तो उसकी चाल और तरंगदैर्घ्य पर क्या प्रभाव पड़ता है?",
            "When a light ray enters an optically denser medium (glass) from air, what happens to its Speed and Wavelength?",
            listOf("चाल और तरंगदैर्घ्य दोनों घटते हैं (Both Speed and Wavelength decrease)", "चाल बढ़ती है, तरंगदैर्घ्य घटती है", "दोनों बढ़ते हैं", "दोनों अपरिवर्तित रहते हैं"),
            listOf("Both Speed and Wavelength decrease proportionally (v = c/n, λ' = λ/n)", "Speed increases, wavelength decreases", "Both increase", "Both remain unchanged"),
            0,
            "सघन माध्यम में अपवर्तनांक n > 1 होने से चाल v = c/n घट जाती है। चूंकि आवृत्ति f नियत रहती है, अतः v = fλ के अनुसार तरंगदैर्घ्य λ' = λ/n भी उसी अनुपात में घट जाती है।",
            "In a denser medium of index n, speed drops to v = c/n and wavelength shortens to λ' = λ/n, while frequency f remains strictly constant.",
            "Moderate"
        ),
        makeScienceQ(
            "sci_2_m10_q8", "sci_2",
            "सूर्य के प्रकाश को पृथ्वी तक पहुंचने में लगभग कितना समय लगता है?",
            "Approximately how much time does sunlight take to reach Earth across 150 million kilometers?",
            listOf("2 मिनट", "8 मिनट 20 सेकंड (लगभग 500 सेकंड)", "15 मिनट", "1 घंटा"),
            listOf("2 minutes", "8 minutes 20 seconds (~500 seconds)", "15 minutes", "1 hour"),
            1,
            "सूर्य से पृथ्वी की औसत दूरी लगभग 1.496 × 10⁸ किमी (1 AU) है। प्रकाश की चाल 3 लाख किमी/सेकंड से दूरी तय करने में t = (1.5 × 10⁸ km) / (3 × 10⁵ km/s) = 500 सेकंड (8 मिनट 20 सेकंड) लगते हैं।",
            "At a mean distance of 1 Astronomical Unit (~149.6 million km), light traveling at 300,000 km/s takes approximately 499-500 seconds (8 minutes and 20 seconds).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q9", "sci_2",
            "चंद्रमा से परावर्तित प्रकाश को पृथ्वी तक पहुंचने में कितना समय लगता है?",
            "How long does reflected moonlight take to travel from the Moon to Earth (~384,400 km)?",
            listOf("1.28 सेकंड (लगभग 1.3 सेकंड)", "8 मिनट", "60 सेकंड", "5 मिनट"),
            listOf("1.28 seconds (~1.3 s)", "8 minutes", "60 seconds", "5 minutes"),
            0,
            "पृथ्वी और चंद्रमा के बीच की औसत दूरी 384,400 किमी है। प्रकाश की चाल से यह दूरी तय करने में t = 384,400 / 300,000 ≈ 1.28 सेकंड का समय लगता है।",
            "With a mean lunar distance of 384,400 km, light traverses the lunar-terrestrial distance in approximately 1.28 to 1.3 seconds.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q10", "sci_2",
            "वाहनों की हेडलाइट में तीव्र समानांतर प्रकाश पुंज (Parallel Light Beam) प्राप्त करने के लिए किस दर्पण का उपयोग किया जाता है?",
            "Which type of concave reflector is employed in car headlights and searchlights to produce a powerful parallel beam of light?",
            listOf("उत्तल दर्पण", "परवलयाकार अवतल दर्पण (Parabolic Concave Mirror)", "समतल दर्पण", "उत्तल लेंस"),
            listOf("Convex mirror", "Parabolic Concave Mirror", "Plane mirror", "Convex lens"),
            1,
            "जब बल्ब को परवलयाकार अवतल दर्पण के मुख्य फोकस पर रखा जाता है, तो परावर्तन के पश्चात सभी प्रकाश किरणें मुख्य अक्ष के समानांतर होकर एक अत्यंत शक्तिशाली समानांतर पुंज बनाती हैं।",
            "Placing the bulb filament at the focal point of a parabolic concave reflector eliminates spherical aberration, reflecting all rays into a collimated parallel search beam.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q11", "sci_2",
            "सौर कुकर (Solar Cooker) में सूर्य के प्रकाश को एक बिंदु पर केंद्रित करने के लिए किस दर्पण का उपयोग किया जाता है?",
            "Which mirror is fitted in box-type and parabolic Solar Cookers to concentrate solar energy onto the cooking vessel?",
            listOf("उत्तल दर्पण", "अवतल दर्पण (Concave Mirror)", "समतल दर्पण", "बेलनाकार दर्पण"),
            listOf("Convex mirror", "Concave Mirror (Converging Reflector)", "Plane mirror", "Cylindrical mirror"),
            1,
            "अवतल दर्पण एक अभिसारी (Converging) दर्पण है जो समानांतर सौर किरणों को फोकस बिंदु पर केंद्रित कर अत्यधिक उच्च तापमान उत्पन्न करता है।",
            "Concave mirrors converge incoming parallel solar rays onto a concentrated focal point, achieving high cooking temperatures.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q12", "sci_2",
            "प्रकाशिक दूरी मापने के लिए 'माइकलसन व्यतिकरणमापी' (Michelson Interferometer) का उपयोग किस ऐतिहासिक प्रयोग में ईथर माध्यम की परिकल्पना को खारिज करने के लिए किया गया था?",
            "The Michelson-Morley experiment using optical interferometry famously disproved the existence of which hypothetical medium?",
            listOf("ल्यूमिनिफेरस ईथर (Luminiferous Aether)", "डार्क मैटर", "फैलता ब्रह्मांड", "फ्लोगाइस्टन"),
            listOf("Luminiferous Aether", "Dark Matter", "Cosmic plasma", "Phlogiston"),
            0,
            "1887 में अल्बर्ट माइकलसन और एडवर्ड मॉर्ले ने सिद्ध किया कि अंतरिक्ष में प्रकाश संचरण के लिए किसी 'ईथर' माध्यम का अस्तित्व नहीं है और प्रकाश की चाल सभी निर्देश तंत्रों में समान (c) रहती है।",
            "The 1887 Michelson-Morley experiment detected zero fringe shift for Earth's motion through the hypothesized Luminiferous Aether, paving the way for Special Relativity.",
            "Hard"
        ),
        makeScienceQ(
            "sci_2_m10_q13", "sci_2",
            "रमन प्रभाव (Raman Effect), जिसके लिए सर सी.वी. रमन को 1930 में नोबेल पुरस्कार दिया गया, किससे संबंधित है?",
            "The Raman Effect, discovered on 28th February 1928, describes which phenomenon of light interaction?",
            listOf("प्रकाश का अप्रत्यास्थ प्रकीर्णन (Inelastic Scattering of Light by Molecules)", "प्रकाश का ध्रुवण", "प्रकाश का अपवर्तन", "प्रकाश का पूर्ण आंतरिक परावर्तन"),
            listOf("Inelastic Scattering of Light by Molecules with vibrational energy shifts", "Optical Polarization", "Refraction", "Total Internal Reflection"),
            0,
            "रमन प्रभाव में जब प्रकाश किसी पारदर्शी द्रव/गैस से गुजरता है, तो प्रकीर्णित प्रकाश में आपतित प्रकाश से भिन्न आवृत्ति की नई रेखाएं (स्टोक्स और एंटी-स्टोक्स रेखाएं) पाई जाती हैं। 28 फरवरी को राष्ट्रीय विज्ञान दिवस मनाया जाता है।",
            "Raman scattering is inelastic photon scattering where interaction with molecular vibrations shifts the scattered photon's energy (Stokes/anti-Stokes lines). Celebrated as National Science Day (Feb 28).",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q14", "sci_2",
            "इंद्रधनुष (Rainbow) बनने में कौन-कौन सी प्रकाशीय परिघटनाएं एक साथ शामिल होती हैं?",
            "The formation of a natural Rainbow in the sky involves a combination of which optical phenomena?",
            listOf("केवल परावर्तन", "अपवर्तन, वर्ण विक्षेपण और आंतरिक परावर्तन (Refraction, Dispersion, and Total Internal Reflection)", "केवल विवर्तन", "केवल ध्रुवण"),
            listOf("Only Reflection", "Refraction, Dispersion, and Internal Reflection inside water droplets", "Only Diffraction", "Only Polarization"),
            1,
            "सूर्य का प्रकाश जब हवा में लटकी पानी की बूंदों में प्रवेश करता है तो अपवर्तन और वर्ण विक्षेपण द्वारा रंगों में बंटता है, बूंद की आंतरिक सतह से परावर्तित होता है और बाहर निकलते समय पुनः अपवर्तित होकर इंद्रधनुष बनाता है।",
            "Sunlight entering suspended raindrops undergoes refraction with chromatic dispersion, reflects off the inner droplet surface, and refracts again upon exit.",
            "Easy"
        ),
        makeScienceQ(
            "sci_2_m10_q15", "sci_2",
            "जब श्वेत प्रकाश एक लाल कांच की खिड़की से होकर गुजरता है, तो खिड़की लाल क्यों दिखाई देती है?",
            "When white light passes through a red-tinted transparent glass sheet, why does it appear pure red?",
            listOf("कांच लाल प्रकाश उत्पन्न करता है", "कांच लाल रंग के प्रकाश को पारगमित (Transmit) करता है और बाकी सभी रंगों को अवशोषित कर लेता है", "कांच लाल प्रकाश को अपवर्तित करता है", "कांच गर्म हो जाता है"),
            listOf("Glass creates red light", "The glass selectively transmits red light while absorbing all other visible spectral wavelengths", "Refracts red light", "Gets heated"),
            1,
            "पारदर्शी रंगीन वस्तुएं केवल अपने रंग के प्रकाश को अपने में से पारगमित (Transmit) होने देती हैं और शेष सभी रंगों को अवशोषित कर लेती हैं।",
            "A selective optical filter appears red because its chemical dyes absorb all non-red spectral wavelengths and allow only red photons to transmit through.",
            "Easy"
        )
    )
}
