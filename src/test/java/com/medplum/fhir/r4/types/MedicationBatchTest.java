/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationBatchTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Medication.MedicationBatch(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Medication.MedicationBatch.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Medication.MedicationBatch x = Medication.MedicationBatch.create().build();
        final Medication.MedicationBatch y = Medication.MedicationBatch.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Medication.MedicationBatch.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Medication.MedicationBatch.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Medication.MedicationBatch.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLotNumber() {
        assertEquals("x", Medication.MedicationBatch.create().lotNumber("x").build().lotNumber());
    }

    @Test
    public void testExpirationDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Medication.MedicationBatch.create().expirationDate(value).build().expirationDate());
    }
}
