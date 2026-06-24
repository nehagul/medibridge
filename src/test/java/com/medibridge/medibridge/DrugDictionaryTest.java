package com.medibridge.medibridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrugDictionaryTest {

    @Test
    public void testKnownDrug() {
        assertTrue(DrugDictionary.isDrugKnown("paracetamol"));
    }

    @Test
    public void testUnknownDrug() {
        assertFalse(DrugDictionary.isDrugKnown("xyz"));
    }

    @Test
    public void testDrugUse() {
        String use = DrugDictionary.getDrugUse("paracetamol");
        assertEquals("fever and pain relief", use);
    }

    @Test
    public void testUnknownDrugMessage() {
        String use = DrugDictionary.getDrugUse("xyz");
        assertEquals("UNKNOWN - Please consult your doctor", use);
    }

    @Test
    public void testCaseInsensitive() {
        assertTrue(DrugDictionary.isDrugKnown("PARACETAMOL"));
    }

}