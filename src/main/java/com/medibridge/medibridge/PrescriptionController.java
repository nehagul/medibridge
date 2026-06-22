package com.medibridge.medibridge;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PrescriptionController {

    @GetMapping("/parse")
    public DrugInstruction parsePrescription(
            @RequestParam String drugName,
            @RequestParam String dose,
            @RequestParam String frequency) {

        return new DrugInstruction(drugName, dose, frequency);
    }

}