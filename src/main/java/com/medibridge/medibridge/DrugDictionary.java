package com.medibridge.medibridge;

import java.util.HashMap;
import java.util.Map;

public class DrugDictionary {

    private static Map<String, String[]> drugs = new HashMap<>();

    static {
        drugs.put("paracetamol", new String[]{
            "Paracetamol", "fever and pain relief"});
        drugs.put("amoxicillin", new String[]{
            "Amoxicillin", "bacterial infection treatment"});
        drugs.put("metformin", new String[]{
            "Metformin", "diabetes management"});
        drugs.put("omeprazole", new String[]{
            "Omeprazole", "acidity and stomach ulcer relief"});
        drugs.put("ibuprofen", new String[]{
            "Ibuprofen", "pain and inflammation relief"});
        drugs.put("metoprolol", new String[]{
            "Metoprolol", "blood pressure and heart rate control"});
        drugs.put("atorvastatin", new String[]{
            "Atorvastatin", "cholesterol reduction"});
        drugs.put("aspirin", new String[]{
            "Aspirin", "blood thinning and pain relief"});
        drugs.put("ciprofloxacin", new String[]{
            "Ciprofloxacin", "bacterial infection treatment"});
        drugs.put("cetirizine", new String[]{
            "Cetirizine", "allergy relief"});
    }

    public static boolean isDrugKnown(String drugName) {
        return drugs.containsKey(drugName.toLowerCase());
    }

    public static String getDrugUse(String drugName) {
        if (isDrugKnown(drugName)) {
            return drugs.get(drugName.toLowerCase())[1];
        }
        return "UNKNOWN - Please consult your doctor";
    }

}