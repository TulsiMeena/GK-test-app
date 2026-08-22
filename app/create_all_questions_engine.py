#!/usr/bin/env python3
"""
Full Dataset Generator for GYANIX (Prompt 6A)
Generates 5,000 competitive exam MCQs:
- Indian History: 1500 (GK00001 - GK01500)
- Indian Polity: 1000 (GK01501 - GK02500)
- Indian Geography: 1000 (GK02501 - GK03500)
- Indian Economy: 750 (GK03501 - GK04250)
- World GK: 750 (GK04251 - GK05000)
"""

import json
import os
import random

# Seed for deterministic generation
random.seed(42)

def generate_history_questions(start_id=1, count=1500):
    qs = []
    # Rich factual question templates and records across all historical eras
    # Ancient, Medieval, Modern, Freedom Struggle, Inscriptions, Rulers, Battles, Acts, Movements
    
    # We will build exactly 1500 unique questions
    from dataset_history_builder import get_history_dataset
    items = get_history_dataset(count)
    
    for idx, item in enumerate(items, start=start_id):
        qid = f"GK{idx:05d}"
        q = {
            "id": qid,
            "category": "Indian History",
            "categoryId": "history",
            "subtopic": item["subtopic"],
            "difficulty": item["difficulty"],
            "questionHindi": item["questionHindi"],
            "questionEnglish": item["questionEnglish"],
            "optionsHindi": item["optionsHindi"],
            "optionsEnglish": item["optionsEnglish"],
            "correctAnswerIndex": item["correctAnswerIndex"],
            "explanationHindi": item["explanationHindi"],
            "explanationEnglish": item["explanationEnglish"]
        }
        qs.append(q)
    return qs

def generate_polity_questions(start_id=1501, count=1000):
    qs = []
    from dataset_polity_builder import get_polity_dataset
    items = get_polity_dataset(count)
    
    for idx, item in enumerate(items, start=start_id):
        qid = f"GK{idx:05d}"
        q = {
            "id": qid,
            "category": "Indian Polity & Constitution",
            "categoryId": "polity",
            "subtopic": item["subtopic"],
            "difficulty": item["difficulty"],
            "questionHindi": item["questionHindi"],
            "questionEnglish": item["questionEnglish"],
            "optionsHindi": item["optionsHindi"],
            "optionsEnglish": item["optionsEnglish"],
            "correctAnswerIndex": item["correctAnswerIndex"],
            "explanationHindi": item["explanationHindi"],
            "explanationEnglish": item["explanationEnglish"]
        }
        qs.append(q)
    return qs

def generate_geography_questions(start_id=2501, count=1000):
    qs = []
    from dataset_geography_builder import get_geography_dataset
    items = get_geography_dataset(count)
    
    for idx, item in enumerate(items, start=start_id):
        qid = f"GK{idx:05d}"
        q = {
            "id": qid,
            "category": "Indian Geography",
            "categoryId": "geography",
            "subtopic": item["subtopic"],
            "difficulty": item["difficulty"],
            "questionHindi": item["questionHindi"],
            "questionEnglish": item["questionEnglish"],
            "optionsHindi": item["optionsHindi"],
            "optionsEnglish": item["optionsEnglish"],
            "correctAnswerIndex": item["correctAnswerIndex"],
            "explanationHindi": item["explanationHindi"],
            "explanationEnglish": item["explanationEnglish"]
        }
        qs.append(q)
    return qs

def generate_economy_questions(start_id=3501, count=750):
    qs = []
    from dataset_economy_builder import get_economy_dataset
    items = get_economy_dataset(count)
    
    for idx, item in enumerate(items, start=start_id):
        qid = f"GK{idx:05d}"
        q = {
            "id": qid,
            "category": "Indian Economy",
            "categoryId": "economy",
            "subtopic": item["subtopic"],
            "difficulty": item["difficulty"],
            "questionHindi": item["questionHindi"],
            "questionEnglish": item["questionEnglish"],
            "optionsHindi": item["optionsHindi"],
            "optionsEnglish": item["optionsEnglish"],
            "correctAnswerIndex": item["correctAnswerIndex"],
            "explanationHindi": item["explanationHindi"],
            "explanationEnglish": item["explanationEnglish"]
        }
        qs.append(q)
    return qs

def generate_world_gk_questions(start_id=4251, count=750):
    qs = []
    from dataset_world_gk_builder import get_world_gk_dataset
    items = get_world_gk_dataset(count)
    
    for idx, item in enumerate(items, start=start_id):
        qid = f"GK{idx:05d}"
        q = {
            "id": qid,
            "category": "World GK",
            "categoryId": "world_gk",
            "subtopic": item["subtopic"],
            "difficulty": item["difficulty"],
            "questionHindi": item["questionHindi"],
            "questionEnglish": item["questionEnglish"],
            "optionsHindi": item["optionsHindi"],
            "optionsEnglish": item["optionsEnglish"],
            "correctAnswerIndex": item["correctAnswerIndex"],
            "explanationHindi": item["explanationHindi"],
            "explanationEnglish": item["explanationEnglish"]
        }
        qs.append(q)
    return qs

def main():
    print("Building full 5,000 question dataset...")
    history = generate_history_questions(1, 1500)
    polity = generate_polity_questions(1501, 1000)
    geography = generate_geography_questions(2501, 1000)
    economy = generate_economy_questions(3501, 750)
    world_gk = generate_world_gk_questions(4251, 750)

    print(f"History: {len(history)}")
    print(f"Polity: {len(polity)}")
    print(f"Geography: {len(geography)}")
    print(f"Economy: {len(economy)}")
    print(f"World GK: {len(world_gk)}")

    total = history + polity + geography + economy + world_gk
    print(f"Total Questions: {len(total)}")

    assert len(history) == 1500
    assert len(polity) == 1000
    assert len(geography) == 1000
    assert len(economy) == 750
    assert len(world_gk) == 750
    assert len(total) == 5000

    out_dir = "app/src/main/assets/questions"
    os.makedirs(out_dir, exist_ok=True)

    with open(f"{out_dir}/history_1500.json", "w", encoding="utf-8") as f:
        json.dump(history, f, ensure_ascii=False)
    with open(f"{out_dir}/polity_1000.json", "w", encoding="utf-8") as f:
        json.dump(polity, f, ensure_ascii=False)
    with open(f"{out_dir}/geography_1000.json", "w", encoding="utf-8") as f:
        json.dump(geography, f, ensure_ascii=False)
    with open(f"{out_dir}/economy_750.json", "w", encoding="utf-8") as f:
        json.dump(economy, f, ensure_ascii=False)
    with open(f"{out_dir}/world_gk_750.json", "w", encoding="utf-8") as f:
        json.dump(world_gk, f, ensure_ascii=False)

    print("All 5 files written successfully!")

if __name__ == "__main__":
    main()
