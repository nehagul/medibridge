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