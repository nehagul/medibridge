package com.medibridge.medibridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class PrescriptionController {

    @Autowired
    private DisclaimerService disclaimerService;

    @Autowired
    private OcrService ocrService;

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

        if (dose.toLowerCase().trim().equals("not sure")) {
            return new ErrorResponse(
                "Dose is unknown. Please consult your doctor or pharmacist for the correct dose.",
                drugName,
                disclaimerService.getUnknownDrugDisclaimer()
            );
        }

        String drugUse = DrugDictionary.getDrugUse(drugName);
        String urduDrugUse = DrugDictionary.getUrduDrugUse(drugName);
        DrugInstruction instruction = new DrugInstruction(
            drugName, dose, frequency, drugUse, urduDrugUse,
            disclaimerService.getMainDisclaimer()
        );
        return instruction;
    }

    @PostMapping("/ocr")
    public Object scanPrescription(@RequestParam("image") MultipartFile image) {

        OcrService.OcrResult result = ocrService.extractText(image);

        if (!result.success) {
            return new ErrorResponse(
                result.message,
                "unknown",
                disclaimerService.getLowConfidenceDisclaimer()
            );
        }

        return result;
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