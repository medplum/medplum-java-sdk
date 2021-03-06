/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ElementDefinitionBindingTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ElementDefinition.ElementDefinitionBinding(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ElementDefinition.ElementDefinitionBinding.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ElementDefinition.ElementDefinitionBinding x = ElementDefinition.ElementDefinitionBinding.create().build();
        final ElementDefinition.ElementDefinitionBinding y = ElementDefinition.ElementDefinitionBinding.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ElementDefinition.ElementDefinitionBinding.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ElementDefinition.ElementDefinitionBinding.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ElementDefinition.ElementDefinitionBinding.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testStrength() {
        assertEquals("x", ElementDefinition.ElementDefinitionBinding.create().strength("x").build().strength());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ElementDefinition.ElementDefinitionBinding.create().description("x").build().description());
    }

    @Test
    public void testValueSet() {
        assertEquals("x", ElementDefinition.ElementDefinitionBinding.create().valueSet("x").build().valueSet());
    }
}
