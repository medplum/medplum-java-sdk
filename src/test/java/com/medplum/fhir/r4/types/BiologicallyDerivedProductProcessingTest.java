/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class BiologicallyDerivedProductProcessingTest {

    @Test
    public void testConstructor() {
        assertNotNull(new BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
    final BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing x =
            BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().build();
    final BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing y =
            BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().description("x").build().description());
    }

    @Test
    public void testProcedure() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().procedure(value).build().procedure());
    }

    @Test
    public void testAdditive() {
        final Reference value = Reference.create().build();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().additive(value).build().additive());
    }

    @Test
    public void testTimeDateTime() {
        assertEquals("x", BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().timeDateTime("x").build().timeDateTime());
    }

    @Test
    public void testTimePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, BiologicallyDerivedProduct.BiologicallyDerivedProductProcessing.create().timePeriod(value).build().timePeriod());
    }
}
