# MediBridge 🏥

AI prescription interpreter for low-literacy patients in Pakistan and South Asia.

## Problem
Over 50% of patients in developing countries take medications incorrectly because 
prescription labels are written in complex English medical language they cannot read.

## Solution
MediBridge converts prescriptions into simple, clear instructions with:
- Plain language explanation
- Drug use information
- Safety disclaimer on every output
- Unknown drug detection — never guesses, always refers to doctor

## Safety First
- System never changes prescribed dose
- Unknown drugs → doctor referral immediately
- Disclaimer on every single output
- Assistance only, never medical decisions

## Current Features (Phase 1)
- 10 common drugs in dictionary
- Simple instruction generation
- Safety warning system
- REST API

## Tech Stack
- Java Spring Boot
- Maven
- REST API

## Developer
Neha Gul — CS Student, Islamabad

## Real User Testing — Phase 1

**Date:** June 2026  
**Users Tested:** 3 family members (non-technical users)

| User | Age | Background | Feedback |
|------|-----|------------|----------|
| Mother | 47 | School Teacher | "Very clear and easy to understand. The doctor warning at the end is very important." |
| Father | 50 | Non-technical user | "Instructions were clear but it would be better in Urdu language." |
| Sister | 17 | College Student | "This is really effective and helpful. A proper interface with buttons would make it even more user friendly." |

**Overall Result:** All 3 users successfully understood medication instructions without any assistance.

**What worked well:**
- Medication instructions were clear and simple
- Doctor disclaimer was noticed and appreciated by all users
- Drug name and dose information was easy to read

**Improvements needed (Phase 2 goals):**
- Add Urdu language support — requested by Father
- Add audio output — especially for elderly users
- Add visual icons/pictures and proper interface — requested by Sister
- Make interface more colorful and friendly

**Conclusion:** MediBridge Phase 1 successfully communicates prescription information to non-technical users. User feedback directly shapes Phase 2 development priorities.
