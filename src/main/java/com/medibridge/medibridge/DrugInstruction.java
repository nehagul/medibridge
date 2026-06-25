package com.medibridge.medibridge;

public class DrugInstruction {

    private String drugName;
    private String dose;
    private String frequency;
    private String instruction;
    private String urduInstruction;
    private String disclaimer;

    public DrugInstruction(String drugName, String dose, String frequency, String drugUse, String urduDrugUse, String disclaimer) {
        this.drugName = drugName;
        this.dose = dose;
        this.frequency = frequency;
        this.disclaimer = disclaimer;
        this.instruction = "Take " + dose + " of " + drugName + " " + frequency + ". Used for: " + drugUse + ".";
        this.urduInstruction = generateUrduInstruction(drugName, dose, frequency, urduDrugUse);
    }

    private String generateUrduInstruction(String drugName, String dose, String frequency, String urduDrugUse) {
        String urduFrequency = translateFrequency(frequency);
        return drugName + " کی " + dose + " خوراک " + urduFrequency + "۔ استعمال: " + urduDrugUse + "۔";
    }

    private String translateFrequency(String frequency) {
        switch (frequency.toLowerCase().trim()) {
            case "once daily": return "دن میں ایک بار لیں";
            case "twice daily": return "دن میں دو بار لیں";
            case "three times daily": return "دن میں تین بار لیں";
            case "every 8 hours": return "ہر 8 گھنٹے بعد لیں";
            case "every 12 hours": return "ہر 12 گھنٹے بعد لیں";
            case "at night": return "رات کو سوتے وقت لیں";
            case "with food": return "کھانے کے ساتھ لیں";
            default: return frequency + " لیں";
        }
    }

    public String getDrugName() { return drugName; }
    public String getDose() { return dose; }
    public String getFrequency() { return frequency; }
    public String getInstruction() { return instruction; }
    public String getUrduInstruction() { return urduInstruction; }
    public String getDisclaimer() { return disclaimer; }

}