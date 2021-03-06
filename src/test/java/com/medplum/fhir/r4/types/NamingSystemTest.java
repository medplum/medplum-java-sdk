/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class NamingSystemTest {

    @Test
    public void testConstructor() {
        assertNotNull(new NamingSystem(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(NamingSystem.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final NamingSystem x = NamingSystem.create().build();
        final NamingSystem y = NamingSystem.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", NamingSystem.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, NamingSystem.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, NamingSystem.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", NamingSystem.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, NamingSystem.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testName() {
        assertEquals("x", NamingSystem.create().name("x").build().name());
    }

    @Test
    public void testStatus() {
        assertEquals("x", NamingSystem.create().status("x").build().status());
    }

    @Test
    public void testKind() {
        assertEquals("x", NamingSystem.create().kind("x").build().kind());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, NamingSystem.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", NamingSystem.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.create().contact(value).build().contact());
    }

    @Test
    public void testResponsible() {
        assertEquals("x", NamingSystem.create().responsible("x").build().responsible());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, NamingSystem.create().type(value).build().type());
    }

    @Test
    public void testDescription() {
        assertEquals("x", NamingSystem.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testUsage() {
        assertEquals("x", NamingSystem.create().usage("x").build().usage());
    }

    @Test
    public void testUniqueId() {
        final java.util.List<NamingSystem.NamingSystemUniqueId> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.create().uniqueId(value).build().uniqueId());
    }
}
