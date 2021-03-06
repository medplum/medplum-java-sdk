/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ConceptMapTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ConceptMap(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ConceptMap.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ConceptMap x = ConceptMap.create().build();
        final ConceptMap y = ConceptMap.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ConceptMap.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ConceptMap.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ConceptMap.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ConceptMap.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ConceptMap.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ConceptMap.create().url(value).build().url());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, ConceptMap.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", ConceptMap.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", ConceptMap.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", ConceptMap.create().title("x").build().title());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ConceptMap.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, ConceptMap.create().experimental(true).build().experimental());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ConceptMap.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", ConceptMap.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ConceptMap.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", ConceptMap.create().purpose("x").build().purpose());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", ConceptMap.create().copyright("x").build().copyright());
    }

    @Test
    public void testSourceUri() {
        assertEquals("x", ConceptMap.create().sourceUri("x").build().sourceUri());
    }

    @Test
    public void testSourceCanonical() {
        assertEquals("x", ConceptMap.create().sourceCanonical("x").build().sourceCanonical());
    }

    @Test
    public void testTargetUri() {
        assertEquals("x", ConceptMap.create().targetUri("x").build().targetUri());
    }

    @Test
    public void testTargetCanonical() {
        assertEquals("x", ConceptMap.create().targetCanonical("x").build().targetCanonical());
    }

    @Test
    public void testGroup() {
        final java.util.List<ConceptMap.ConceptMapGroup> value = java.util.Collections.emptyList();
        assertEquals(value, ConceptMap.create().group(value).build().group());
    }
}
