/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class UsageContextTest {

    @Test
    public void testConstructor() {
        assertNotNull(new UsageContext(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(UsageContext.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final UsageContext x = UsageContext.create().build();
        final UsageContext y = UsageContext.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", UsageContext.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, UsageContext.create().extension(value).build().extension());
    }

    @Test
    public void testCode() {
        final Coding value = Coding.create().build();
        assertEquals(value, UsageContext.create().code(value).build().code());
    }

    @Test
    public void testValueCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, UsageContext.create().valueCodeableConcept(value).build().valueCodeableConcept());
    }

    @Test
    public void testValueQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, UsageContext.create().valueQuantity(value).build().valueQuantity());
    }

    @Test
    public void testValueRange() {
        final Range value = Range.create().build();
        assertEquals(value, UsageContext.create().valueRange(value).build().valueRange());
    }

    @Test
    public void testValueReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, UsageContext.create().valueReference(value).build().valueReference());
    }
}
