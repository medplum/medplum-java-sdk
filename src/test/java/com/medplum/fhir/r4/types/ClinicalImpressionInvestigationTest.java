/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClinicalImpressionInvestigationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ClinicalImpression.ClinicalImpressionInvestigation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ClinicalImpression.ClinicalImpressionInvestigation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ClinicalImpression.ClinicalImpressionInvestigation x = ClinicalImpression.ClinicalImpressionInvestigation.create().build();
        final ClinicalImpression.ClinicalImpressionInvestigation y = ClinicalImpression.ClinicalImpressionInvestigation.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ClinicalImpression.ClinicalImpressionInvestigation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.ClinicalImpressionInvestigation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.ClinicalImpressionInvestigation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClinicalImpression.ClinicalImpressionInvestigation.create().code(value).build().code());
    }

    @Test
    public void testItem() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.ClinicalImpressionInvestigation.create().item(value).build().item());
    }
}
