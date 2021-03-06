/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ElementDefinitionBaseTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ElementDefinition.ElementDefinitionBase(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ElementDefinition.ElementDefinitionBase.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ElementDefinition.ElementDefinitionBase x = ElementDefinition.ElementDefinitionBase.create().build();
        final ElementDefinition.ElementDefinitionBase y = ElementDefinition.ElementDefinitionBase.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ElementDefinition.ElementDefinitionBase.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ElementDefinition.ElementDefinitionBase.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ElementDefinition.ElementDefinitionBase.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testPath() {
        assertEquals("x", ElementDefinition.ElementDefinitionBase.create().path("x").build().path());
    }

    @Test
    public void testMin() {
        assertEquals(1, ElementDefinition.ElementDefinitionBase.create().min(1).build().min());
    }

    @Test
    public void testMax() {
        assertEquals("x", ElementDefinition.ElementDefinitionBase.create().max("x").build().max());
    }
}
