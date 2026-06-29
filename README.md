# 🏥 MediBridge
### AI Prescription Interpreter for Low-Literacy Patients

[![Java](https://img.shields.io/badge/Java-Spring%20Boot-green)](https://spring.io/)
[![License](https://img.shields.io/badge/License-MIT-blue)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Active-brightgreen)]()

---

## 🌍 The Problem

Over **50% of patients** in developing countries like Pakistan take medications incorrectly — wrong dose, wrong time, wrong combination. Not because they don't care, but because:

- Prescriptions are written in complex English medical language
- Many patients are low-literacy or non-English speakers
- Elderly patients forget their dose times
- No affordable, scalable solution exists

This causes **125,000+ deaths annually** in the US alone. In Pakistan and South Asia, the numbers are far worse and largely uncounted.

---

## 💡 The Solution

**MediBridge** converts any prescription into simple, clear instructions in **Urdu and English** — with audio support, dose reminders, and a built-in safety system.

> *"This information is for assistance only. Doctor's instruction is the final authority."*
> — shown on every single output, cannot be disabled.

---

## ✨ Features

| Feature | Description |
|---------|-------------|
| 💊 Drug Instructions | Simple English + Urdu instructions for 10 common drugs |
| 🔊 Audio Output | Slow, clear speech at 0.75x speed for elderly users |
| 🇵🇰 Bilingual UI | Full Urdu + English interface |
| ⏰ Dose Reminder | Browser notification + sound at dose time |
| 📷 OCR Scan | Upload prescription image — system extracts text |
| ⚠️ Safety System | Unknown drugs → doctor referral. Never guesses. |

---

## 🛡️ Safety First

MediBridge was designed with safety as the #1 priority:

- ✅ System **never** changes prescribed dose
- ✅ System **never** guesses unknown drugs — always refers to doctor
- ✅ Disclaimer on **every single output** — cannot be disabled
- ✅ "Not sure" dose → immediate doctor referral
- ✅ OCR unclear → rescan prompt, never a guess
- ✅ Assistance only — never medical decisions

---

## 🚀 Tech Stack

- **Backend:** Java Spring Boot
- **OCR:** Tesseract OCR (tess4j)
- **Frontend:** HTML, CSS, JavaScript
- **Audio:** Web Speech Synthesis API
- **Build:** Maven

---

## 📁 Project Structure
medibridge/

├── src/main/java/com/medibridge/medibridge/

│   ├── MedibridgeApplication.java     — Main entry point

│   ├── DrugInstruction.java           — Drug instruction model

│   ├── DrugDictionary.java            — 10 drugs with Urdu + English

│   ├── PrescriptionController.java    — REST API controller

│   ├── DisclaimerService.java         — Safety disclaimer system

│   └── OcrService.java                — OCR prescription scanner

├── src/main/resources/static/

│   └── index.html                     — Bilingual web interface

└── src/test/                          — 11 unit tests

---

## 🧪 Tests
Tests run: 11, Failures: 0, Errors: 0 ✅

- DrugDictionaryTest — 5 tests
- DrugInstructionTest — 5 tests
- MedibridgeApplicationTests — 1 test

---

## 🗺️ Roadmap
Phase 1 ✅ Core engine — drug dictionary, safety system, tests

Phase 2 ✅ Intelligence — audio, bilingual UI, web interface

Phase 3 ✅ Field features — OCR scan, dose reminders

Phase 4 ⏳ Polish — Google Vision API, MIT Solve submission

---

## 👩‍💻 Developer

**Neha Gul** — CS Student, COMSATS University Islamabad, Pakistan
- 2nd Semester — Building real-world health solutions

---

## 🌟 Impact Goal

> MediBridge aims to help **2 billion+** people worldwide affected by low health literacy — starting from Pakistan.
