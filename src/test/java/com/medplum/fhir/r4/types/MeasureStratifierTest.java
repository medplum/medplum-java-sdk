/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MeasureStratifierTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Measure.MeasureStratifier(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Measure.MeasureStratifier.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Measure.MeasureStratifier x = Measure.MeasureStratifier.create().build();
        final Measure.MeasureStratifier y = Measure.MeasureStratifier.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Measure.MeasureStratifier.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.MeasureStratifier.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.MeasureStratifier.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Measure.MeasureStratifier.create().code(value).build().code());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Measure.MeasureStratifier.create().description("x").build().description());
    }

    @Test
    public void testCriteria() {
        final Expression value = Expression.create().build();
        assertEquals(value, Measure.MeasureStratifier.create().criteria(value).build().criteria());
    }

    @Test
    public void testComponent() {
        final java.util.List<Measure.MeasureComponent> value = java.util.Collections.emptyList();
        assertEquals(value, Measure.MeasureStratifier.create().component(value).build().component());
    }
}
