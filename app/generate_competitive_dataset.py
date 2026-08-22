#!/usr/bin/env python3
"""
Master Competitive GK Generator for GYANIX (Prompt 6A)
Produces exactly 5,000 unique questions in 5 category JSON assets:
1. Indian History: 1,500 questions (GK00001 - GK01500)
2. Indian Polity & Constitution: 1,000 questions (GK01501 - GK02500)
3. Indian Geography: 1,000 questions (GK02501 - GK03500)
4. Indian Economy: 750 questions (GK03501 - GK04250)
5. World GK: 750 questions (GK04251 - GK05000)
"""

import json
import os
import random

# Fixed seed
random.seed(42)

def build_dataset():
    print("Building GYANIX Question Database (5,000 Questions)...")
    out_dir = "app/src/main/assets/questions"
    os.makedirs(out_dir, exist_ok=True)

    # 1. Indian History (1,500)
    history_qs = generate_history_questions(start_id=1, count=1500)
    print(f"-> History: {len(history_qs)} questions")

    # 2. Indian Polity (1,000)
    polity_qs = generate_polity_questions(start_id=1501, count=1000)
    print(f"-> Polity: {len(polity_qs)} questions")

    # 3. Indian Geography (1,000)
    geography_qs = generate_geography_questions(start_id=2501, count=1000)
    print(f"-> Geography: {len(geography_qs)} questions")

    # 4. Indian Economy (750)
    economy_qs = generate_economy_questions(start_id=3501, count=750)
    print(f"-> Economy: {len(economy_qs)} questions")

    # 5. World GK (750)
    world_gk_qs = generate_world_gk_questions(start_id=4251, count=750)
    print(f"-> World GK: {len(world_gk_qs)} questions")

    all_qs = history_qs + polity_qs + geography_qs + economy_qs + world_gk_qs
    print(f"Total Dataset: {len(all_qs)} questions (GK00001 - GK05000)")

    # Assertions
    assert len(history_qs) == 1500
    assert len(polity_qs) == 1000
    assert len(geography_qs) == 1000
    assert len(economy_qs) == 750
    assert len(world_gk_qs) == 750
    assert len(all_qs) == 5000

    # Write files
    with open(f"{out_dir}/history_1500.json", "w", encoding="utf-8") as f:
        json.dump(history_qs, f, ensure_ascii=False, indent=2)
    with open(f"{out_dir}/polity_1000.json", "w", encoding="utf-8") as f:
        json.dump(polity_qs, f, ensure_ascii=False, indent=2)
    with open(f"{out_dir}/geography_1000.json", "w", encoding="utf-8") as f:
        json.dump(geography_qs, f, ensure_ascii=False, indent=2)
    with open(f"{out_dir}/economy_750.json", "w", encoding="utf-8") as f:
        json.dump(economy_qs, f, ensure_ascii=False, indent=2)
    with open(f"{out_dir}/world_gk_750.json", "w", encoding="utf-8") as f:
        json.dump(world_gk_qs, f, ensure_ascii=False, indent=2)

    print("Successfully wrote all JSON files to assets/questions/")

def make_q(qid, cat, cat_id, subtopic, diff, q_hi, q_en, opt_hi, opt_en, ans, exp_hi, exp_en):
    # Ensure options are properly shuffled or placed with valid index
    return {
        "id": qid,
        "category": cat,
        "categoryId": cat_id,
        "subtopic": subtopic,
        "difficulty": diff,
        "questionHindi": q_hi,
        "questionEnglish": q_en if q_en else q_hi,
        "optionsHindi": opt_hi,
        "optionsEnglish": opt_en if opt_en else opt_hi,
        "correctAnswerIndex": ans,
        "explanationHindi": exp_hi,
        "explanationEnglish": exp_en if exp_en else exp_hi
    }

# Helper to build questions with high factual density and varied formats
def generate_history_questions(start_id, count):
    from generator_history_impl import build_history_list
    return build_history_list(start_id, count)

def generate_polity_questions(start_id, count):
    from generator_polity_impl import build_polity_list
    return build_polity_list(start_id, count)

def generate_geography_questions(start_id, count):
    from generator_geography_impl import build_geography_list
    return build_geography_list(start_id, count)

def generate_economy_questions(start_id, count):
    from generator_economy_impl import build_economy_list
    return build_economy_list(start_id, count)

def generate_world_gk_questions(start_id, count):
    from generator_world_gk_impl import build_world_gk_list
    return build_world_gk_list(start_id, count)

if __name__ == "__main__":
    build_dataset()
