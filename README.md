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

**Date:** 24 June 2026  
**Users Tested:** 3 family members (non-technical users)

| User | Age | Background | Feedback |
|------|-----|------------|----------|
| Mother | 47 | School Teacher | "Instructions were very clear. I understood exactly when and how to take the medicine." |
| Father | 50 | Non-technical user | "Very useful. The warning about consulting doctor is important and reassuring." |
| Sister | 17 | College Student | "Simple and easy to understand. Better than reading a prescription label." |

**Overall Result:** All 3 users successfully understood medication instructions without any assistance.  
**Key Finding:** Disclaimer and doctor warning was noticed and appreciated by all users.  
**Conclusion:** MediBridge Phase 1 effectively communicates prescription information to non-technical users.
