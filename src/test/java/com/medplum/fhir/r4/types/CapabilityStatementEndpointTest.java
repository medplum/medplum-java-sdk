/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CapabilityStatementEndpointTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CapabilityStatement.CapabilityStatementEndpoint(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CapabilityStatement.CapabilityStatementEndpoint.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final CapabilityStatement.CapabilityStatementEndpoint x = CapabilityStatement.CapabilityStatementEndpoint.create().build();
        final CapabilityStatement.CapabilityStatementEndpoint y = CapabilityStatement.CapabilityStatementEndpoint.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", CapabilityStatement.CapabilityStatementEndpoint.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementEndpoint.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CapabilityStatement.CapabilityStatementEndpoint.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testProtocol() {
        final Coding value = Coding.create().build();
        assertEquals(value, CapabilityStatement.CapabilityStatementEndpoint.create().protocol(value).build().protocol());
    }

    @Test
    public void testAddress() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, CapabilityStatement.CapabilityStatementEndpoint.create().address(value).build().address());
    }
}
