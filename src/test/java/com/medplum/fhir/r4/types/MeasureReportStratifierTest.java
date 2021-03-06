/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MeasureReportStratifierTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MeasureReport.MeasureReportStratifier(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MeasureReport.MeasureReportStratifier.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MeasureReport.MeasureReportStratifier x = MeasureReport.MeasureReportStratifier.create().build();
        final MeasureReport.MeasureReportStratifier y = MeasureReport.MeasureReportStratifier.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MeasureReport.MeasureReportStratifier.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MeasureReport.MeasureReportStratifier.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MeasureReport.MeasureReportStratifier.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MeasureReport.MeasureReportStratifier.create().code(value).build().code());
    }

    @Test
    public void testStratum() {
        final java.util.List<MeasureReport.MeasureReportStratum> value = java.util.Collections.emptyList();
        assertEquals(value, MeasureReport.MeasureReportStratifier.create().stratum(value).build().stratum());
    }
}
