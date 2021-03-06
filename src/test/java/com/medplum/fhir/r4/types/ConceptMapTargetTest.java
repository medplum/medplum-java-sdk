/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ConceptMapTargetTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ConceptMap.ConceptMapTarget(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ConceptMap.ConceptMapTarget.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ConceptMap.ConceptMapTarget x = ConceptMap.ConceptMapTarget.create().build();
        final ConceptMap.ConceptMapTarget y = ConceptMap.ConceptMapTarget.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ConceptMap.ConceptMapTarget.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.ConceptMapTarget.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.ConceptMapTarget.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        assertEquals("x", ConceptMap.ConceptMapTarget.create().code("x").build().code());
    }

    @Test
    public void testDisplay() {
        assertEquals("x", ConceptMap.ConceptMapTarget.create().display("x").build().display());
    }

    @Test
    public void testEquivalence() {
        assertEquals("x", ConceptMap.ConceptMapTarget.create().equivalence("x").build().equivalence());
    }

    @Test
    public void testComment() {
        assertEquals("x", ConceptMap.ConceptMapTarget.create().comment("x").build().comment());
    }

    @Test
    public void testDependsOn() {
        final java.util.List<ConceptMap.ConceptMapDependsOn> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.ConceptMapTarget.create().dependsOn(value).build().dependsOn());
    }

    @Test
    public void testProduct() {
        final java.util.List<ConceptMap.ConceptMapDependsOn> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.ConceptMapTarget.create().product(value).build().product());
    }
}
