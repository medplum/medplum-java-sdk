/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ElementDefinitionMappingTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ElementDefinition.ElementDefinitionMapping(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ElementDefinition.ElementDefinitionMapping.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ElementDefinition.ElementDefinitionMapping x = ElementDefinition.ElementDefinitionMapping.create().build();
        final ElementDefinition.ElementDefinitionMapping y = ElementDefinition.ElementDefinitionMapping.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ElementDefinition.ElementDefinitionMapping.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ElementDefinition.ElementDefinitionMapping.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ElementDefinition.ElementDefinitionMapping.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentity() {
        assertEquals("x", ElementDefinition.ElementDefinitionMapping.create().identity("x").build().identity());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ElementDefinition.ElementDefinitionMapping.create().language("x").build().language());
    }

    @Test
    public void testMap() {
        assertEquals("x", ElementDefinition.ElementDefinitionMapping.create().map("x").build().map());
    }

    @Test
    public void testComment() {
        assertEquals("x", ElementDefinition.ElementDefinitionMapping.create().comment("x").build().comment());
    }
}
