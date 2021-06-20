/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ImplementationGuideResourceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ImplementationGuide.ImplementationGuideResource(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ImplementationGuide.ImplementationGuideResource.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ImplementationGuide.ImplementationGuideResource x = ImplementationGuide.ImplementationGuideResource.create().build();
        final ImplementationGuide.ImplementationGuideResource y = ImplementationGuide.ImplementationGuideResource.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ImplementationGuide.ImplementationGuideResource.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuideResource.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuideResource.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ImplementationGuide.ImplementationGuideResource.create().reference(value).build().reference());
    }

    @Test
    public void testFhirVersion() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuideResource.create().fhirVersion(value).build().fhirVersion());
    }

    @Test
    public void testName() {
        assertEquals("x", ImplementationGuide.ImplementationGuideResource.create().name("x").build().name());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ImplementationGuide.ImplementationGuideResource.create().description("x").build().description());
    }

    @Test
    public void testExampleBoolean() {
        assertEquals(true, ImplementationGuide.ImplementationGuideResource.create().exampleBoolean(true).build().exampleBoolean());
    }

    @Test
    public void testExampleCanonical() {
        assertEquals("x", ImplementationGuide.ImplementationGuideResource.create().exampleCanonical("x").build().exampleCanonical());
    }

    @Test
    public void testGroupingId() {
        assertEquals("x", ImplementationGuide.ImplementationGuideResource.create().groupingId("x").build().groupingId());
    }
}
