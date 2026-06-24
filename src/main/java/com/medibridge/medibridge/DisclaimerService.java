package com.medibridge.medibridge;

import org.springframework.stereotype.Service;

@Service
public class DisclaimerService {

    private static final String MAIN_DISCLAIMER = 
        "WARNING: This information is for assistance only. " +
        "Always follow your doctor's instructions. " +
        "Doctor's advice is the final authority.";

    private static final String UNKNOWN_DRUG_DISCLAIMER = 
        "WARNING: This drug was not recognised in our system. " +
        "Do NOT take any medication without consulting your doctor first.";

    private static final String LOW_CONFIDENCE_DISCLAIMER = 
        "WARNING: We could not read this prescription clearly. " +
        "Please show this prescription directly to your doctor or pharmacist.";

    public String getMainDisclaimer() {
        return MAIN_DISCLAIMER;
    }

    public String getUnknownDrugDisclaimer() {
        return UNKNOWN_DRUG_DISCLAIMER;
    }

    public String getLowConfidenceDisclaimer() {
        return LOW_CONFIDENCE_DISCLAIMER;
    }

    public String getFullDisclaimer(String type) {
        switch (type) {
            case "unknown": return getUnknownDrugDisclaimer();
            case "low_confidence": return getLowConfidenceDisclaimer();
            default: return getMainDisclaimer();
        }
    }

}