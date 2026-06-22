package com.medibridge.medibridge;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PrescriptionController {

    @GetMapping("/parse")
    public Object parsePrescription(
            @RequestParam String drugName,
            @RequestParam String dose,
            @RequestParam String frequency) {

        if (!DrugDictionary.isDrugKnown(drugName)) {
            return new ErrorResponse(
                "WARNING: Drug not recognised. Please consult your doctor.",
                drugName
            );
        }

        String drugUse = DrugDictionary.getDrugUse(drugName);
        DrugInstruction instruction = new DrugInstruction(drugName, dose, frequency, drugUse);
        return instruction;
    }

    static class ErrorResponse {
        public String warning;
        public String drugName;
        public String disclaimer = "WARNING: This information is for help only. Doctor's instruction is final.";

        public ErrorResponse(String warning, String drugName) {
            this.warning = warning;
            this.drugName = drugName;
        }
    }
}