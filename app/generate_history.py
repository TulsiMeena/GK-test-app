#!/usr/bin/env python3
"""
Generates exactly 1,500 Indian History questions (GK00001 - GK01500)
Subtopics:
1. Ancient India & Indus Valley
2. Vedic Period, Mahajanapadas, Buddhism & Jainism
3. Mauryan Empire & Post-Mauryan Dynasties
4. Gupta Empire, Harsha & South Indian Kingdoms
5. Delhi Sultanate & Regional Kingdoms
6. Mughal Empire & Suri Dynasty
7. Maratha History, Sikh History, Bhakti & Sufi Movements
8. Advent of Europeans & British Expansion (1757-1856)
9. Revolt of 1857 & Early Resistance Movements
10. Socio-Religious Reform Movements
11. Indian National Congress & Moderate-Extremist Phase (1885-1915)
12. Gandhian Era & Major Movements (1915-1935)
13. Revolutionary Nationalism & INA (Subhas Bose)
14. Freedom Struggle & Towards Independence (1935-1947)
15. Constitutional Evolution, Acts, Treaties & Historical Literature
"""

def generate_questions():
    questions = []
    start_id = 1
    target_count = 1500

    # Let's define the comprehensive curated question bank for Indian History
    # We will build structured topic modules with specific facts, statements, chronologies, and matching MCQs
    
    # Subtopic 1: Ancient India & Indus Valley (120 questions)
    # Subtopic 2: Vedic, Mahajanapadas, Buddhism & Jainism (130 questions)
    # Subtopic 3: Mauryan Empire & Post-Mauryan (120 questions)
    # Subtopic 4: Gupta Empire, Harsha, Sangam & South Indian Kingdoms (130 questions)
    # Subtopic 5: Delhi Sultanate & Regional Kingdoms (130 questions)
    # Subtopic 6: Mughal Empire & Suri Dynasty (140 questions)
    # Subtopic 7: Maratha, Sikh, Bhakti & Sufi Movements (110 questions)
    # Subtopic 8: Advent of Europeans & British Expansion (110 questions)
    # Subtopic 9: Revolt of 1857 & Tribal/Peasant Revolts (100 questions)
    # Subtopic 10: Socio-Religious Reform Movements (90 questions)
    # Subtopic 11: INC & Moderate/Extremist Phases (100 questions)
    # Subtopic 12: Gandhian Era (Non-Cooperation, Civil Disobedience, Quit India) (130 questions)
    # Subtopic 13: Revolutionary Movements & INA (90 questions)
    # Subtopic 14: Towards Independence (Cabinet Mission, Mountbatten Plan, Partition) (90 questions)
    # Total = 120 + 130 + 120 + 130 + 130 + 140 + 110 + 110 + 100 + 90 + 100 + 130 + 90 + 90 = 1500 questions!

    items_data = []

    # Import internal builder
    from history_data_builder import build_all_history_items
    items_data = build_all_history_items()

    for idx, item in enumerate(items_data, start=start_id):
        qid = f"GK{idx:05d}"
        q = {
            "id": qid,
            "category": "Indian History",
            "categoryId": "history",
            "subtopic": item["subtopic"],
            "difficulty": item.get("difficulty", "Moderate"),
            "questionHindi": item["q_hi"],
            "questionEnglish": item.get("q_en", item["q_hi"]),
            "optionsHindi": item["opt_hi"],
            "optionsEnglish": item.get("opt_en", item["opt_hi"]),
            "correctAnswerIndex": item["ans"],
            "explanationHindi": item["exp_hi"],
            "explanationEnglish": item.get("exp_en", item["exp_hi"])
        }
        questions.append(q)

    assert len(questions) == target_count, f"History generated {len(questions)}, expected {target_count}"
    return questions

if __name__ == "__main__":
    qs = generate_questions()
    print(f"Generated {len(qs)} history questions. First: {qs[0]['id']}, Last: {qs[-1]['id']}")
