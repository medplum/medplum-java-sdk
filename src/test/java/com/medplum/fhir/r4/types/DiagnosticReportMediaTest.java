/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DiagnosticReportMediaTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DiagnosticReport.DiagnosticReportMedia(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DiagnosticReport.DiagnosticReportMedia.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final DiagnosticReport.DiagnosticReportMedia x = DiagnosticReport.DiagnosticReportMedia.create().build();
        final DiagnosticReport.DiagnosticReportMedia y = DiagnosticReport.DiagnosticReportMedia.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", DiagnosticReport.DiagnosticReportMedia.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DiagnosticReport.DiagnosticReportMedia.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DiagnosticReport.DiagnosticReportMedia.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testComment() {
        assertEquals("x", DiagnosticReport.DiagnosticReportMedia.create().comment("x").build().comment());
    }

    @Test
    public void testLink() {
        final Reference value = Reference.create().build();
        assertEquals(value, DiagnosticReport.DiagnosticReportMedia.create().link(value).build().link());
    }
}
