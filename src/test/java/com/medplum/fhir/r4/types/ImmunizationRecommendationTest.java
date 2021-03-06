/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ImmunizationRecommendationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ImmunizationRecommendation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ImmunizationRecommendation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ImmunizationRecommendation x = ImmunizationRecommendation.create().build();
        final ImmunizationRecommendation y = ImmunizationRecommendation.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ImmunizationRecommendation.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ImmunizationRecommendation.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ImmunizationRecommendation.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ImmunizationRecommendation.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ImmunizationRecommendation.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.create().identifier(value).build().identifier());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, ImmunizationRecommendation.create().patient(value).build().patient());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ImmunizationRecommendation.create().date(value).build().date());
    }

    @Test
    public void testAuthority() {
        final Reference value = Reference.create().build();
        assertEquals(value, ImmunizationRecommendation.create().authority(value).build().authority());
    }

    @Test
    public void testRecommendation() {
        final java.util.List<ImmunizationRecommendation.ImmunizationRecommendationRecommendation> value = java.util.Collections.emptyList();
        assertEquals(value, ImmunizationRecommendation.create().recommendation(value).build().recommendation());
    }
}
