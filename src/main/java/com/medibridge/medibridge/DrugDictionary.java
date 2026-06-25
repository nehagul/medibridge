package com.medibridge.medibridge;

import java.util.HashMap;
import java.util.Map;

public class DrugDictionary {

    private static Map<String, String[]> drugs = new HashMap<>();

    static {
        drugs.put("paracetamol", new String[]{
            "Paracetamol", "fever and pain relief", "بخار اور درد سے نجات"});
        drugs.put("amoxicillin", new String[]{
            "Amoxicillin", "bacterial infection treatment", "بیکٹیریل انفیکشن کا علاج"});
        drugs.put("metformin", new String[]{
            "Metformin", "diabetes management", "ذیابیطس کا علاج"});
        drugs.put("omeprazole", new String[]{
            "Omeprazole", "acidity and stomach ulcer relief", "تیزابیت اور معدے کے السر سے نجات"});
        drugs.put("ibuprofen", new String[]{
            "Ibuprofen", "pain and inflammation relief", "درد اور سوزش سے نجات"});
        drugs.put("metoprolol", new String[]{
            "Metoprolol", "blood pressure and heart rate control", "بلڈ پریشر اور دل کی دھڑکن کا کنٹرول"});
        drugs.put("atorvastatin", new String[]{
            "Atorvastatin", "cholesterol reduction", "کولیسٹرول میں کمی"});
        drugs.put("aspirin", new String[]{
            "Aspirin", "blood thinning and pain relief", "خون پتلا کرنا اور درد سے نجات"});
        drugs.put("ciprofloxacin", new String[]{
            "Ciprofloxacin", "bacterial infection treatment", "بیکٹیریل انفیکشن کا علاج"});
        drugs.put("cetirizine", new String[]{
            "Cetirizine", "allergy relief", "الرجی سے نجات"});
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

    public static String getUrduDrugUse(String drugName) {
        if (isDrugKnown(drugName)) {
            return drugs.get(drugName.toLowerCase())[2];
        }
        return "نامعلوم - براہ کرم اپنے ڈاکٹر سے مشورہ کریں";
    }

}