#!/usr/bin/env python3
"""
GYANIX 5,000 COMPETITIVE EXAM QUESTION GENERATOR
Generates exactly 5,000 distinct, verified, competitive-exam level questions:
1. Indian History: 1,500 questions (GK00001 to GK01500)
2. Indian Polity & Constitution: 1,000 questions (GK01501 to GK02500)
3. Indian Geography: 1,000 questions (GK02501 to GK03500)
4. Indian Economy: 750 questions (GK03501 to GK04250)
5. World GK: 750 questions (GK04251 to GK05000)
"""

import json
import os
import random

# Fix random seed for exact deterministic results
random.seed(42)

def build_questions():
    all_questions = []
    
    # 1. INDIAN HISTORY (1500 questions: GK00001 - GK01500)
    import generate_history_data
    history_qs = generate_history_data.get_questions(start_id=1, count=1500)
    all_questions.extend(history_qs)
    print(f"Generated History: {len(history_qs)} questions (GK00001 to GK{len(history_qs):05d})")

    # 2. INDIAN POLITY & CONSTITUTION (1000 questions: GK01501 - GK02500)
    import generate_polity_data
    polity_qs = generate_polity_data.get_questions(start_id=1501, count=1000)
    all_questions.extend(polity_qs)
    print(f"Generated Polity: {len(polity_qs)} questions (GK01501 to GK{1500 + len(polity_qs):05d})")

    # 3. INDIAN GEOGRAPHY (1000 questions: GK02501 - GK03500)
    import generate_geography_data
    geo_qs = generate_geography_data.get_questions(start_id=2501, count=1000)
    all_questions.extend(geo_qs)
    print(f"Generated Geography: {len(geo_qs)} questions (GK02501 to GK{2500 + len(geo_qs):05d})")

    # 4. INDIAN ECONOMY (750 questions: GK03501 - GK04250)
    import generate_economy_data
    eco_qs = generate_economy_data.get_questions(start_id=3501, count=750)
    all_questions.extend(eco_qs)
    print(f"Generated Economy: {len(eco_qs)} questions (GK03501 to GK{3500 + len(eco_qs):05d})")

    # 5. WORLD GK (750 questions: GK04251 - GK05000)
    import generate_world_gk_data
    world_qs = generate_world_gk_data.get_questions(start_id=4251, count=750)
    all_questions.extend(world_qs)
    print(f"Generated World GK: {len(world_qs)} questions (GK04251 to GK{4250 + len(world_qs):05d})")

    print(f"Total Combined Questions: {len(all_questions)}")

    # Strict Auditing
    assert len(history_qs) == 1500, f"History count {len(history_qs)} != 1500"
    assert len(polity_qs) == 1000, f"Polity count {len(polity_qs)} != 1000"
    assert len(geo_qs) == 1000, f"Geography count {len(geo_qs)} != 1000"
    assert len(eco_qs) == 750, f"Economy count {len(eco_qs)} != 750"
    assert len(world_qs) == 750, f"World GK count {len(world_qs)} != 750"
    assert len(all_questions) == 5000, f"Total count {len(all_questions)} != 5000"

    seen_ids = set()
    for idx, q in enumerate(all_questions, start=1):
        expected_id = f"GK{idx:05d}"
        assert q["id"] == expected_id, f"Index {idx} has ID {q['id']}, expected {expected_id}"
        assert q["id"] not in seen_ids, f"Duplicate ID: {q['id']}"
        seen_ids.add(q["id"])

        assert len(q["optionsHindi"]) == 4, f"{q['id']} optionsHindi length != 4"
        assert len(q["optionsEnglish"]) == 4, f"{q['id']} optionsEnglish length != 4"
        assert 0 <= q["correctAnswerIndex"] <= 3, f"{q['id']} invalid correctAnswerIndex: {q['correctAnswerIndex']}"
        assert len(q["questionHindi"].strip()) > 0, f"{q['id']} empty questionHindi"
        assert len(q["explanationHindi"].strip()) > 0, f"{q['id']} empty explanationHindi"
        assert q["difficulty"] in ["Easy", "Moderate", "Hard"], f"{q['id']} invalid difficulty: {q['difficulty']}"

    out_dir = "app/src/main/assets/questions"
    os.makedirs(out_dir, exist_ok=True)

    with open(f"{out_dir}/history_1500.json", "w", encoding="utf-8") as f:
        json.dump(history_qs, f, ensure_ascii=False)
    with open(f"{out_dir}/polity_1000.json", "w", encoding="utf-8") as f:
        json.dump(polity_qs, f, ensure_ascii=False)
    with open(f"{out_dir}/geography_1000.json", "w", encoding="utf-8") as f:
        json.dump(geo_qs, f, ensure_ascii=False)
    with open(f"{out_dir}/economy_750.json", "w", encoding="utf-8") as f:
        json.dump(eco_qs, f, ensure_ascii=False)
    with open(f"{out_dir}/world_gk_750.json", "w", encoding="utf-8") as f:
        json.dump(world_qs, f, ensure_ascii=False)

    print("All JSON files generated and verified successfully!")

if __name__ == "__main__":
    build_questions()
