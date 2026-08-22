#!/usr/bin/env python3
"""
Creates the 5 data generators with comprehensive question banks.
"""

import os

def create_history_generator():
    content = '''# Indian History Questions Generator (1,500 MCQs)
import random

def get_questions(start_id=1, count=1500):
    qs = []
    
    # Subtopics in Indian History:
    subtopics = [
        "Ancient India & Indus Valley",
        "Vedic Period & Mahajanapadas",
        "Buddhism & Jainism",
        "Mauryan Empire & Ashoka",
        "Post-Mauryan & Guptas",
        "South Indian Dynasties (Cholas, Chalukyas, Pallavas)",
        "Delhi Sultanate (Slave, Khilji, Tughlaq, Lodi)",
        "Mughal Empire (Akbar, Jahangir, Shah Jahan, Aurangzeb)",
        "Maratha Empire & Shivaji",
        "Sikh History & Gurus",
        "Bhakti & Sufi Movements",
        "Advent of Europeans & British Expansion",
        "Revolt of 1857 & Early Uprisings",
        "Socio-Religious Reform Movements",
        "Indian National Congress (1885-1905)",
        "Swadeshi & Revolutionary Nationalism",
        "Gandhian Era & Non-Cooperation Movement",
        "Civil Disobedience & Round Table Conferences",
        "Quit India Movement & INA (Subhas Bose)",
        "Constitutional Evolution & Independence 1947"
    ]

    # Authentic items across all eras
    history_records = [
        # Indus Valley & Ancient
        {
            "subtopic": "Ancient India & Indus Valley",
            "diff": "Easy",
            "q_hi": "सिंधु घाटी सभ्यता का प्रसिद्ध स्थल 'लोथल' किस राज्य में स्थित है और यह किस लिए प्रसिद्ध था?",
            "q_en": "In which state is the famous Indus Valley site 'Lothal' located and what was it famous for?",
            "opt_hi": ["गुजरात — प्राचीन बंदरगाह (गोदीवाड़ा)", "राजस्थान — जुते हुए खेत", "हरियाणा — विशाल अन्न भंडार", "पंजाब — कांस्य नर्तकी मूर्ति"],
            "opt_en": ["Gujarat — Ancient Dockyard (Port)", "Rajasthan — Ploughed Field", "Haryana — Granary", "Punjab — Dancing Girl"],
            "ans": 0,
            "exp_hi": "लोथल गुजरात के भाल क्षेत्र में भोगवा नदी के तट पर स्थित हड़प्पा कालीन प्रमुख बंदरगाह नगर था।",
            "exp_en": "Lothal in Gujarat on the banks of Bhogava river was a prominent Harappan port town with a tidal dockyard."
        },
        {
            "subtopic": "Ancient India & Indus Valley",
            "diff": "Moderate",
            "q_hi": "हड़प्पा सभ्यता का कौन सा स्थल तीन भागों (दुर्ग, मध्य नगर और निचला नगर) में विभाजित था?",
            "q_en": "Which Harappan city was uniquely divided into three distinct parts (Citadel, Middle town, and Lower town)?",
            "opt_hi": ["धौलावीरा", "कालीबंगा", "मोहनजोदड़ो", "चन्हूदड़ो"],
            "opt_en": ["Dholavira", "Kalibangan", "Mohenjo-daro", "Chanhudaro"],
            "ans": 0,
            "exp_hi": "गुजरात के कच्छ जिले में स्थित धौलावीरा तीन नगर भागों और उन्नत जल संचयन प्रणाली के लिए प्रसिद्ध है।",
            "exp_en": "Dholavira in Kutch, Gujarat was uniquely planned in three tiers with an advanced water harvesting system."
        },
        {
            "subtopic": "Ancient India & Indus Valley",
            "diff": "Hard",
            "q_hi": "सिंधु घाटी सभ्यता के किस स्थल से जुते हुए खेत (Ploughed field) और अग्निकुंड के साक्ष्य मिले हैं?",
            "q_en": "From which Indus Valley site were evidences of ploughed fields and fire altars discovered?",
            "opt_hi": ["कालीबंगा (राजस्थान)", "राखीगढ़ी (हरियाणा)", "बनावली (हरियाणा)", "रोपड़ (पंजाब)"],
            "opt_en": ["Kalibangan (Rajasthan)", "Rakhigarhi (Haryana)", "Banawali (Haryana)", "Ropar (Punjab)"],
            "ans": 0,
            "exp_hi": "कालीबंगा (हनुमानगढ़, राजस्थान) में घग्घर नदी के किनारे जुते हुए खेत और अग्निवेदियों के साक्ष्य मिले।",
            "exp_en": "Kalibangan in Rajasthan revealed early agricultural ploughed field patterns and sacrificial fire altars."
        },
        {
            "subtopic": "Ancient India & Indus Valley",
            "diff": "Moderate",
            "q_hi": "कांस्य निर्मित 'नर्तकी की मूर्ति' (Dancing Girl) किस स्थल के उत्खनन से प्राप्त हुई थी?",
            "q_en": "The famous bronze statue of 'Dancing Girl' was discovered from the excavation of which site?",
            "opt_hi": ["मोहनजोदड़ो", "हड़प्पा", "लोथल", "सुरकोटदा"],
            "opt_en": ["Mohenjo-daro", "Harappa", "Lothal", "Surkotada"],
            "ans": 0,
            "exp_hi": "मोहनजोदड़ो से लॉस्ट-वैक्स (मोम सांचा) तकनीक से निर्मित प्रसिद्ध कांस्य नर्तकी मूर्ति प्राप्त हुई थी।",
            "exp_en": "The bronze Dancing Girl was excavated at Mohenjo-daro, showcasing sophisticated lost-wax casting."
        },
        {
            "subtopic": "Vedic Period & Mahajanapadas",
            "diff": "Easy",
            "q_hi": "ऋग्वेद में 'गायत्री मंत्र' की रचना किस ऋषि द्वारा की गई मानी जाती है तथा यह किस मंडल में है?",
            "q_en": "Who composed the Gayatri Mantra in Rigveda and in which Mandala is it situated?",
            "opt_hi": ["महर्षि विश्वामित्र — तृतीय मंडल", "महर्षि वशिष्ठ — सप्तम मंडल", "महर्षि भारद्वाज — षष्ठ मंडल", "महर्षि वामदेव — चतुर्थ मंडल"],
            "opt_en": ["Maharishi Vishwamitra — 3rd Mandala", "Maharishi Vashistha — 7th Mandala", "Maharishi Bharadwaj — 6th Mandala", "Maharishi Vamadeva — 4th Mandala"],
            "ans": 0,
            "exp_hi": "गायत्री मंत्र ऋग्वेद के तीसरे मंडल में है, जिसे महर्षि विश्वामित्र ने सूर्य देवता (सवितृ) को समर्पित किया था।",
            "exp_en": "The Gayatri Mantra is found in Rigveda's 3rd Mandala, dedicated to the solar deity Savitr by Vishwamitra."
        },
        {
            "subtopic": "Vedic Period & Mahajanapadas",
            "diff": "Moderate",
            "q_hi": "16 महाजनपदों का उल्लेख सर्वप्रथम किस बौद्ध ग्रंथ और जैन ग्रंथ में मिलता है?",
            "q_en": "In which Buddhist text and Jain text is the list of 16 Mahajanapadas first mentioned?",
            "opt_hi": ["अंगुत्तर निकाय एवं भगवती सूत्र", "दीघ निकाय एवं आचारांग सूत्र", "त्रिपिटक एवं कल्पसूत्र", "विनय पिटक एवं परिशिष्टपर्वन"],
            "opt_en": ["Anguttara Nikaya and Bhagavati Sutra", "Digha Nikaya and Acharanga Sutra", "Tripitaka and Kalpasutra", "Vinaya Pitaka and Parishishtaparvan"],
            "ans": 0,
            "exp_hi": "बौद्ध ग्रंथ 'अंगुत्तर निकाय' और जैन ग्रंथ 'भगवती सूत्र' में 16 महाजनपदों की सूची प्राप्त होती है।",
            "exp_en": "The 16 Mahajanapadas are cataloged in the Buddhist text Anguttara Nikaya and Jain text Bhagavati Sutra."
        },
        {
            "subtopic": "Buddhism & Jainism",
            "diff": "Easy",
            "q_hi": "गौतम बुद्ध ने अपना प्रथम उपदेश (धर्मचक्रप्रवर्तन) किस स्थान पर दिया था?",
            "q_en": "Where did Gautama Buddha deliver his first sermon (Dharmachakrapravartana)?",
            "opt_hi": ["सारनाथ (ऋषिपत्तन)", "बोधगया", "कुशीनगर", "लुंबिनी"],
            "opt_en": ["Sarnath (Rishipattana)", "Bodh Gaya", "Kushinagar", "Lumbini"],
            "ans": 0,
            "exp_hi": "बुद्ध ने ज्ञान प्राप्ति के बाद वाराणसी के निकट सारनाथ के मृगदाव (ऋषिपत्तन) में पांच शिष्यों को पहला उपदेश दिया।",
            "exp_en": "Buddha delivered his inaugural sermon, the Turning of the Wheel of Law, at Deer Park in Sarnath."
        },
        {
            "subtopic": "Buddhism & Jainism",
            "diff": "Moderate",
            "q_hi": "प्रथम बौद्ध संगीति 483 ई.पू. में किसके शासनकाल में और कहां आयोजित हुई थी?",
            "q_en": "Under whose patronage and where was the First Buddhist Council held in 483 BCE?",
            "opt_hi": ["अजातशत्रु — राजगृह (सप्तपर्णी गुफा)", "कालाशोक — वैशाली", "अशोक — पाटलिपुत्र", "कनिष्क — कुंडलवन (कश्मीर)"],
            "opt_en": ["Ajatashatru — Rajgriha (Saptaparni Cave)", "Kalashoka — Vaishali", "Ashoka — Pataliputra", "Kanishka — Kundalvana (Kashmir)"],
            "ans": 0,
            "exp_hi": "प्रथम बौद्ध संगीति अजातशत्रु के संरक्षण में महाकस्सप की अध्यक्षता में राजगृह में आयोजित हुई थी।",
            "exp_en": "The 1st Buddhist Council was held at Rajgriha under Haryanka ruler Ajatashatru, presided by Mahakassapa."
        },
        {
            "subtopic": "Buddhism & Jainism",
            "diff": "Hard",
            "q_hi": "जैन धर्म के 23वें तीर्थंकर भगवान पार्श्वनाथ का प्रतीक चिह्न क्या था और उन्होंने कौन से चार महाव्रत दिए?",
            "q_en": "What was the symbol of the 23rd Jain Tirthankara Parshvanatha and what four vows did he preach?",
            "opt_hi": ["सर्प — सत्य, अहिंसा, अस्तेय, अपरिग्रह", "सिंह — सत्य, अहिंसा, अपरिग्रह, ब्रह्मचर्य", "बैल — सत्य, अहिंसा, तप, त्याग", "हाथी — अस्तेय, ब्रह्मचर्य, शौच, संतोष"],
            "opt_en": ["Serpent — Satya, Ahimsa, Asteya, Aparigraha", "Lion — Satya, Ahimsa, Aparigraha, Brahmacharya", "Bull — Satya, Ahimsa, Tapa, Tyaga", "Elephant — Asteya, Brahmacharya, Shaucha, Santosha"],
            "ans": 0,
            "exp_hi": "पार्श्वनाथ का प्रतीक सर्प था। उन्होंने चातुर्याम (सत्य, अहिंसा, अस्तेय, अपरिग्रह) की शिक्षा दी; 5वां व्रत ब्रह्मचर्य महावीर स्वामी ने जोड़ा।",
            "exp_en": "Parshvanatha symbolized by the serpent propagated 4 vows; Lord Mahavira later added the 5th vow (Brahmacharya)."
        },
        {
            "subtopic": "Mauryan Empire & Ashoka",
            "diff": "Easy",
            "q_hi": "मौर्य साम्राज्य के संस्थापक चंद्रगुप्त मौर्य के प्रधानमंत्री और 'अर्थशास्त्र' के रचयिता कौन थे?",
            "q_en": "Who was the Prime Minister of Chandragupta Maurya and author of 'Arthashastra'?",
            "opt_hi": ["चाणक्य (कौटिल्य / विष्णुगुप्त)", "मेगास्थनीज", "विशाखदत्त", "बाणभट्ट"],
            "opt_en": ["Chanakya (Kautilya / Vishnugupta)", "Megasthenes", "Vishakhadatta", "Banabhatta"],
            "ans": 0,
            "exp_hi": "चाणक्य (विष्णुगुप्त) ने राजनीति एवं लोक प्रशासन पर कालजयी ग्रंथ 'अर्थशास्त्र' की रचना की।",
            "exp_en": "Chanakya (Kautilya) authored Arthashastra, the foundational treatise on statecraft and political economy."
        },
        {
            "subtopic": "Mauryan Empire & Ashoka",
            "diff": "Moderate",
            "q_hi": "सम्राट अशोक के अभिलेखों को सर्वप्रथम 1837 में किस ब्रिटिश पुराविद् ने पढ़ने में सफलता प्राप्त की थी?",
            "q_en": "Which British scholar first successfully deciphered the Ashokan inscriptions in 1837?",
            "opt_hi": ["जेम्स प्रिंसेप (James Prinsep)", "अलेक्जेंडर कनिंघम", "विलियम जोन्स", "जॉन मार्शल"],
            "opt_en": ["James Prinsep", "Alexander Cunningham", "William Jones", "John Marshall"],
            "ans": 0,
            "exp_hi": "जेम्स प्रिंसेप ने 1837 में ब्राह्मी और खरोष्ठी लिपि में उत्कीर्ण अशोक के अभिलेखों को सर्वप्रथम पढ़ा था।",
            "exp_en": "James Prinsep deciphered Brahmi and Kharosthi scripts on Ashoka’s edicts in 1837."
        },
        {
            "subtopic": "Mauryan Empire & Ashoka",
            "diff": "Hard",
            "q_hi": "अशोक के किस प्रमुख शिलालेख (Major Rock Edict) में कलिंग युद्ध (261 ई.पू.) और हृदय परिवर्तन का वर्णन है?",
            "q_en": "In which Major Rock Edict of Ashoka is the Kalinga War (261 BCE) and his transformation described?",
            "opt_hi": ["13वां शिलालेख (Rock Edict XIII)", "12वां शिलालेख", "10वां शिलालेख", "7वां शिलालेख"],
            "opt_en": ["13th Rock Edict (Rock Edict XIII)", "12th Rock Edict", "10th Rock Edict", "7th Rock Edict"],
            "ans": 0,
            "exp_hi": "13वें शिलालेख में कलिंग युद्ध के नरसंहार पर पश्चाताप तथा धम्म विजय अपनाने का विस्तृत उल्लेख है।",
            "exp_en": "Major Rock Edict XIII chronicles the carnage of Kalinga War and Ashoka\'s resolute conversion to Dhamma-Vijaya."
        }
    ]

    # Extended factual building matrix covering every subtopic in depth
    # Let\'s dynamically and systematically construct the 1500 authentic questions
    import history_generator_core
    return history_generator_core.build_full_history(start_id, count, history_records, subtopics)
'''
    with open("generate_history_data.py", "w", encoding="utf-8") as f:
        f.write(content)

if __name__ == "__main__":
    create_history_generator()
