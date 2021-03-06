/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MeasureReportGroupTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MeasureReport.MeasureReportGroup(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MeasureReport.MeasureReportGroup.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MeasureReport.MeasureReportGroup x = MeasureReport.MeasureReportGroup.create().build();
        final MeasureReport.MeasureReportGroup y = MeasureReport.MeasureReportGroup.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MeasureReport.MeasureReportGroup.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MeasureReport.MeasureReportGroup.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MeasureReport.MeasureReportGroup.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MeasureReport.MeasureReportGroup.create().code(value).build().code());
    }

    @Test
    public void testPopulation() {
        final java.util.List<MeasureReport.MeasureReportPopulation> value = java.util.Collections.emptyList();
        assertEquals(value, MeasureReport.MeasureReportGroup.create().population(value).build().population());
    }

    @Test
    public void testMeasureScore() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MeasureReport.MeasureReportGroup.create().measureScore(value).build().measureScore());
    }

    @Test
    public void testStratifier() {
        final java.util.List<MeasureReport.MeasureReportStratifier> value = java.util.Collections.emptyList();
        assertEquals(value, MeasureReport.MeasureReportGroup.create().stratifier(value).build().stratifier());
    }
}
