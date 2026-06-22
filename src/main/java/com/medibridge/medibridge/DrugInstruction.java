package com.medibridge.medibridge;

public class DrugInstruction {

    private String drugName;
    private String dose;
    private String frequency;
    private String instruction;
    private String disclaimer;

    public DrugInstruction(String drugName, String dose, String frequency, String drugUse) {
        this.drugName = drugName;
        this.dose = dose;
        this.frequency = frequency;
        this.disclaimer = "WARNING: This information is for help only. Doctor's instruction is final.";
        this.instruction = "Take " + dose + " of " + drugName + " " + frequency + ". Used for: " + drugUse + ".";
    }

    public String getDrugName() { return drugName; }
    public String getDose() { return dose; }
    public String getFrequency() { return frequency; }
    public String getInstruction() { return instruction; }
    public String getDisclaimer() { return disclaimer; }

}