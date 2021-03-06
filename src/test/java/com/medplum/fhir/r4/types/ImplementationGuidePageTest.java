/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ImplementationGuidePageTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ImplementationGuide.ImplementationGuidePage(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ImplementationGuide.ImplementationGuidePage.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ImplementationGuide.ImplementationGuidePage x = ImplementationGuide.ImplementationGuidePage.create().build();
        final ImplementationGuide.ImplementationGuidePage y = ImplementationGuide.ImplementationGuidePage.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ImplementationGuide.ImplementationGuidePage.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuidePage.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuidePage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testNameUrl() {
        assertEquals("x", ImplementationGuide.ImplementationGuidePage.create().nameUrl("x").build().nameUrl());
    }

    @Test
    public void testNameReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, ImplementationGuide.ImplementationGuidePage.create().nameReference(value).build().nameReference());
    }

    @Test
    public void testTitle() {
        assertEquals("x", ImplementationGuide.ImplementationGuidePage.create().title("x").build().title());
    }

    @Test
    public void testGeneration() {
        assertEquals("x", ImplementationGuide.ImplementationGuidePage.create().generation("x").build().generation());
    }

    @Test
    public void testPage() {
        final java.util.List<ImplementationGuide.ImplementationGuidePage> value = java.util.Collections.emptyList();
        assertEquals(value, ImplementationGuide.ImplementationGuidePage.create().page(value).build().page());
    }
}
