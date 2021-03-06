/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class LinkageTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Linkage(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Linkage.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Linkage x = Linkage.create().build();
        final Linkage y = Linkage.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Linkage.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Linkage.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Linkage.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Linkage.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Linkage.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testActive() {
        assertEquals(true, Linkage.create().active(true).build().active());
    }

    @Test
    public void testAuthor() {
        final Reference value = Reference.create().build();
        assertEquals(value, Linkage.create().author(value).build().author());
    }

    @Test
    public void testItem() {
        final java.util.List<Linkage.LinkageItem> value = java.util.Collections.emptyList();
        assertEquals(value, Linkage.create().item(value).build().item());
    }
}
