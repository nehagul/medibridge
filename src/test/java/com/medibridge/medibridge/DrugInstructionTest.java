package com.medibridge.medibridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrugInstructionTest {

    @Test
    public void testInstructionGeneration() {
        DrugInstruction instruction = new DrugInstruction(
            "Paracetamol", "500mg", "twice daily",
            "fever and pain relief",
            "WARNING: Doctor's instruction is final."
        );
        assertEquals("Take 500mg of Paracetamol twice daily. Used for: fever and pain relief.",
            instruction.getInstruction());
    }

    @Test
    public void testDisclaimerPresent() {
        DrugInstruction instruction = new DrugInstruction(
            "Aspirin", "100mg", "once daily",
            "blood thinning",
            "WARNING: Doctor's instruction is final."
        );
        assertNotNull(instruction.getDisclaimer());
        assertFalse(instruction.getDisclaimer().isEmpty());
    }

    @Test
    public void testDrugNameStored() {
        DrugInstruction instruction = new DrugInstruction(
            "Metformin", "500mg", "twice daily",
            "diabetes management",
            "WARNING: Doctor's instruction is final."
        );
        assertEquals("Metformin", instruction.getDrugName());
    }

    @Test
    public void testDoseStored() {
        DrugInstruction instruction = new DrugInstruction(
            "Ibuprofen", "400mg", "three times daily",
            "pain relief",
            "WARNING: Doctor's instruction is final."
        );
        assertEquals("400mg", instruction.getDose());
    }

    @Test
    public void testFrequencyStored() {
        DrugInstruction instruction = new DrugInstruction(
            "Omeprazole", "20mg", "once daily",
            "acidity relief",
            "WARNING: Doctor's instruction is final."
        );
        assertEquals("once daily", instruction.getFrequency());
    }

}