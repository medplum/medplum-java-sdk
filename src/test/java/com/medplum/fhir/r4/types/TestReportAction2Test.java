/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestReportAction2Test {

    @Test
    public void testConstructor() {
        assertNotNull(new TestReport.TestReportAction2(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestReport.TestReportAction2.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final TestReport.TestReportAction2 x = TestReport.TestReportAction2.create().build();
        final TestReport.TestReportAction2 y = TestReport.TestReportAction2.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", TestReport.TestReportAction2.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.TestReportAction2.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestReport.TestReportAction2.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testOperation() {
        final TestReport.TestReportOperation value = TestReport.TestReportOperation.create().build();
        assertEquals(value, TestReport.TestReportAction2.create().operation(value).build().operation());
    }
}
