/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class IdentifierTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Identifier(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Identifier.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Identifier x = Identifier.create().build();
        final Identifier y = Identifier.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Identifier.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Identifier.create().extension(value).build().extension());
    }

    @Test
    public void testUse() {
        assertEquals("x", Identifier.create().use("x").build().use());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Identifier.create().type(value).build().type());
    }

    @Test
    public void testSystem() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Identifier.create().system(value).build().system());
    }

    @Test
    public void testValue() {
        assertEquals("x", Identifier.create().value("x").build().value());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Identifier.create().period(value).build().period());
    }

    @Test
    public void testAssigner() {
        final Reference value = Reference.create().build();
        assertEquals(value, Identifier.create().assigner(value).build().assigner());
    }
}
