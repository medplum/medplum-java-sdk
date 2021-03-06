/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CapabilityStatementInteractionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CapabilityStatement.CapabilityStatementInteraction(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CapabilityStatement.CapabilityStatementInteraction.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final CapabilityStatement.CapabilityStatementInteraction x = CapabilityStatement.CapabilityStatementInteraction.create().build();
        final CapabilityStatement.CapabilityStatementInteraction y = CapabilityStatement.CapabilityStatementInteraction.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementInteraction.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementInteraction.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementInteraction.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        assertEquals("x", CapabilityStatement.CapabilityStatementInteraction.create().code("x").build().code());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", CapabilityStatement.CapabilityStatementInteraction.create().documentation("x").build().documentation());
    }
}
