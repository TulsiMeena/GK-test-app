#!/usr/bin/env python3
"""
Full Dataset Generator for GYANIX (Prompt 6A)
Creates exact, unique, competitive-exam level questions for:
1. Indian History: 1,500 questions (GK00001 - GK01500)
2. Indian Polity & Constitution: 1,000 questions (GK01501 - GK02500)
3. Indian Geography: 1,000 questions (GK02501 - GK03500)
4. Indian Economy: 750 questions (GK03501 - GK04250)
5. World GK: 750 questions (GK04251 - GK05000)
Total: 5,000 questions
"""

import json
import os
import random

# Seed for deterministic generation
random.seed(101)

def main():
    print("Starting generator...")
    out_dir = "app/src/main/assets/questions"
    os.makedirs(out_dir, exist_ok=True)

    # We will generate each dataset directly and verify
    history_qs = make_history_qs()
    polity_qs = make_polity_qs()
    geography_qs = make_geography_qs()
    economy_qs = make_economy_qs()
    world_gk_qs = make_world_gk_qs()

    print(f"History: {len(history_qs)}")
    print(f"Polity: {len(polity_qs)}")
    print(f"Geography: {len(geography_qs)}")
    print(f"Economy: {len(economy_qs)}")
    print(f"World GK: {len(world_gk_qs)}")

    assert len(history_qs) == 1500, f"History count {len(history_qs)} != 1500"
    assert len(polity_qs) == 1000, f"Polity count {len(polity_qs)} != 1000"
    assert len(geography_qs) == 1000, f"Geography count {len(geography_qs)} != 1000"
    assert len(economy_qs) == 750, f"Economy count {len(economy_qs)} != 750"
    assert len(world_gk_qs) == 750, f"World GK count {len(world_gk_qs)} != 750"

    all_qs = history_qs + polity_qs + geography_qs + economy_qs + world_gk_qs
    assert len(all_qs) == 5000, f"Total count {len(all_qs)} != 5000"

    # Strict structural check
    seen_ids = set()
    for idx, q in enumerate(all_qs, start=1):
        expected_id = f"GK{idx:05d}"
        if q["id"] != expected_id:
            raise ValueError(f"Index {idx} expected {expected_id}, got {q['id']}")
        seen_ids.add(q["id"])
        if len(q["optionsHindi"]) != 4 or len(q["optionsEnglish"]) != 4:
            raise ValueError(f"Question {q['id']} does not have exactly 4 options")
        if not (0 <= q["correctAnswerIndex"] <= 3):
            raise ValueError(f"Question {q['id']} invalid correctAnswerIndex: {q['correctAnswerIndex']}")
        if not q["explanationHindi"] or not q["explanationEnglish"]:
            raise ValueError(f"Question {q['id']} missing explanation")

    with open(f"{out_dir}/history_1500.json", "w", encoding="utf-8") as f:
        json.dump(history_qs, f, ensure_ascii=False)
    with open(f"{out_dir}/polity_1000.json", "w", encoding="utf-8") as f:
        json.dump(polity_qs, f, ensure_ascii=False)
    with open(f"{out_dir}/geography_1000.json", "w", encoding="utf-8") as f:
        json.dump(geography_qs, f, ensure_ascii=False)
    with open(f"{out_dir}/economy_750.json", "w", encoding="utf-8") as f:
        json.dump(economy_qs, f, ensure_ascii=False)
    with open(f"{out_dir}/world_gk_750.json", "w", encoding="utf-8") as f:
        json.dump(world_gk_qs, f, ensure_ascii=False)

    print("Successfully generated and validated all 5,000 questions!")

