/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CapabilityStatementOperationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CapabilityStatement.CapabilityStatementOperation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CapabilityStatement.CapabilityStatementOperation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final CapabilityStatement.CapabilityStatementOperation x = CapabilityStatement.CapabilityStatementOperation.create().build();
        final CapabilityStatement.CapabilityStatementOperation y = CapabilityStatement.CapabilityStatementOperation.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementOperation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementOperation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementOperation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", CapabilityStatement.CapabilityStatementOperation.create().name("x").build().name());
    }

    @Test
    public void testDefinition() {
        assertEquals("x", CapabilityStatement.CapabilityStatementOperation.create().definition("x").build().definition());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", CapabilityStatement.CapabilityStatementOperation.create().documentation("x").build().documentation());
    }
}
