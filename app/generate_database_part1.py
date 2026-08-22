#!/usr/bin/env python3
"""
GYANIX COMPETITIVE GK DATABASE GENERATOR - PART 1 (5,000 MCQs)
Categories:
1. Indian History: 1,500 questions (GK00001 - GK01500)
2. Indian Polity & Constitution: 1,000 questions (GK01501 - GK02500)
3. Indian Geography: 1,000 questions (GK02501 - GK03500)
4. Indian Economy: 750 questions (GK03501 - GK04250)
5. World GK: 750 questions (GK04251 - GK05000)
Total: 5,000 questions
"""

import json
import os
import sys

def main():
    print("Generating GYANIX Competitive GK Database Part 1...")
    # Import sub-modules
    import generate_history
    import generate_polity
    import generate_geography
    import generate_economy
    import generate_world_gk

    history_qs = generate_history.generate_questions()
    polity_qs = generate_polity.generate_questions()
    geography_qs = generate_geography.generate_questions()
    economy_qs = generate_economy.generate_questions()
    world_gk_qs = generate_world_gk.generate_questions()

    print(f"Generated Indian History: {len(history_qs)}")
    print(f"Generated Indian Polity: {len(polity_qs)}")
    print(f"Generated Indian Geography: {len(geography_qs)}")
    print(f"Generated Indian Economy: {len(economy_qs)}")
    print(f"Generated World GK: {len(world_gk_qs)}")

    all_qs = history_qs + polity_qs + geography_qs + economy_qs + world_gk_qs
    print(f"Total Questions: {len(all_qs)}")

    # Strict Validation
    assert len(history_qs) == 1500, f"Expected 1500 History questions, got {len(history_qs)}"
    assert len(polity_qs) == 1000, f"Expected 1000 Polity questions, got {len(polity_qs)}"
    assert len(geography_qs) == 1000, f"Expected 1000 Geography questions, got {len(geography_qs)}"
    assert len(economy_qs) == 750, f"Expected 750 Economy questions, got {len(economy_qs)}"
    assert len(world_gk_qs) == 750, f"Expected 750 World GK questions, got {len(world_gk_qs)}"
    assert len(all_qs) == 5000, f"Expected 5000 total questions, got {len(all_qs)}"

    # Validate IDs and structure
    seen_ids = set()
    for idx, q in enumerate(all_qs, start=1):
        expected_id = f"GK{idx:05d}"
        if q["id"] != expected_id:
            raise ValueError(f"Question at index {idx} has ID {q['id']}, expected {expected_id}")
        if q["id"] in seen_ids:
            raise ValueError(f"Duplicate ID {q['id']}")
        seen_ids.add(q["id"])

        assert len(q["optionsHindi"]) == 4, f"Question {q['id']} must have 4 optionsHindi"
        assert len(q["optionsEnglish"]) == 4, f"Question {q['id']} must have 4 optionsEnglish"
        assert 0 <= q["correctAnswerIndex"] <= 3, f"Question {q['id']} invalid correctAnswerIndex {q['correctAnswerIndex']}"
        assert len(q["questionHindi"].strip()) > 5, f"Question {q['id']} empty questionHindi"
        assert len(q["explanationHindi"].strip()) > 5, f"Question {q['id']} empty explanationHindi"
        assert q["difficulty"] in ["Easy", "Moderate", "Hard"], f"Question {q['id']} invalid difficulty {q['difficulty']}"

    os.makedirs("app/src/main/assets/questions", exist_ok=True)

    # Save by category for modular loading
    with open("app/src/main/assets/questions/history_1500.json", "w", encoding="utf-8") as f:
        json.dump(history_qs, f, ensure_ascii=False, indent=2)
    with open("app/src/main/assets/questions/polity_1000.json", "w", encoding="utf-8") as f:
        json.dump(polity_qs, f, ensure_ascii=False, indent=2)
    with open("app/src/main/assets/questions/geography_1000.json", "w", encoding="utf-8") as f:
        json.dump(geography_qs, f, ensure_ascii=False, indent=2)
    with open("app/src/main/assets/questions/economy_750.json", "w", encoding="utf-8") as f:
        json.dump(economy_qs, f, ensure_ascii=False, indent=2)
    with open("app/src/main/assets/questions/world_gk_750.json", "w", encoding="utf-8") as f:
        json.dump(world_gk_qs, f, ensure_ascii=False, indent=2)

    # Also save combined master index or full file if needed
    with open("app/src/main/assets/questions/gk_part1_all_5000.json", "w", encoding="utf-8") as f:
        json.dump(all_qs, f, ensure_ascii=False, indent=None) # Compact

    print("Successfully generated and verified all 5,000 questions!")

if __name__ == "__main__":
    main()
