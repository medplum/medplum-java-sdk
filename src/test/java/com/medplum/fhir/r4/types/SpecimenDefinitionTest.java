/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SpecimenDefinitionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SpecimenDefinition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SpecimenDefinition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final SpecimenDefinition x = SpecimenDefinition.create().build();
        final SpecimenDefinition y = SpecimenDefinition.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SpecimenDefinition.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, SpecimenDefinition.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, SpecimenDefinition.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", SpecimenDefinition.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, SpecimenDefinition.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, SpecimenDefinition.create().identifier(value).build().identifier());
    }

    @Test
    public void testTypeCollected() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SpecimenDefinition.create().typeCollected(value).build().typeCollected());
    }

    @Test
    public void testPatientPreparation() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.create().patientPreparation(value).build().patientPreparation());
    }

    @Test
    public void testTimeAspect() {
        assertEquals("x", SpecimenDefinition.create().timeAspect("x").build().timeAspect());
    }

    @Test
    public void testCollection() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.create().collection(value).build().collection());
    }

    @Test
    public void testTypeTested() {
        final java.util.List<SpecimenDefinition.SpecimenDefinitionTypeTested> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.create().typeTested(value).build().typeTested());
    }
}
