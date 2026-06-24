package com.medibridge.medibridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PrescriptionController {

    @Autowired
    private DisclaimerService disclaimerService;

    @GetMapping("/parse")
    public Object parsePrescription(
            @RequestParam String drugName,
            @RequestParam String dose,
            @RequestParam String frequency) {

        if (!DrugDictionary.isDrugKnown(drugName)) {
            return new ErrorResponse(
                "Drug not recognised. Please consult your doctor.",
                drugName,
                disclaimerService.getUnknownDrugDisclaimer()
            );
        }

        String drugUse = DrugDictionary.getDrugUse(drugName);
        DrugInstruction instruction = new DrugInstruction(
            drugName, dose, frequency, drugUse,
            disclaimerService.getMainDisclaimer()
        );
        return instruction;
    }

    static class ErrorResponse {
        public String warning;
        public String drugName;
        public String disclaimer;

        public ErrorResponse(String warning, String drugName, String disclaimer) {
            this.warning = warning;
            this.drugName = drugName;
            this.disclaimer = disclaimer;
        }
    }
}