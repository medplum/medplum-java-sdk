/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CompartmentDefinitionResourceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CompartmentDefinition.CompartmentDefinitionResource(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CompartmentDefinition.CompartmentDefinitionResource.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final CompartmentDefinition.CompartmentDefinitionResource x = CompartmentDefinition.CompartmentDefinitionResource.create().build();
        final CompartmentDefinition.CompartmentDefinitionResource y = CompartmentDefinition.CompartmentDefinitionResource.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", CompartmentDefinition.CompartmentDefinitionResource.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CompartmentDefinition.CompartmentDefinitionResource.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CompartmentDefinition.CompartmentDefinitionResource.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        assertEquals("x", CompartmentDefinition.CompartmentDefinitionResource.create().code("x").build().code());
    }

    @Test
    public void testParam() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, CompartmentDefinition.CompartmentDefinitionResource.create().param(value).build().param());
    }

    @Test
    public void testDocumentation() {
        assertEquals("x", CompartmentDefinition.CompartmentDefinitionResource.create().documentation("x").build().documentation());
    }
}
