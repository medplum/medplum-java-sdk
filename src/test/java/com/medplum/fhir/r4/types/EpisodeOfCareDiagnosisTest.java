/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class EpisodeOfCareDiagnosisTest {

    @Test
    public void testConstructor() {
        assertNotNull(new EpisodeOfCare.EpisodeOfCareDiagnosis(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(EpisodeOfCare.EpisodeOfCareDiagnosis.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final EpisodeOfCare.EpisodeOfCareDiagnosis x = EpisodeOfCare.EpisodeOfCareDiagnosis.create().build();
        final EpisodeOfCare.EpisodeOfCareDiagnosis y = EpisodeOfCare.EpisodeOfCareDiagnosis.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", EpisodeOfCare.EpisodeOfCareDiagnosis.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.EpisodeOfCareDiagnosis.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EpisodeOfCare.EpisodeOfCareDiagnosis.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCondition() {
        final Reference value = Reference.create().build();
        assertEquals(value, EpisodeOfCare.EpisodeOfCareDiagnosis.create().condition(value).build().condition());
    }

    @Test
    public void testRole() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, EpisodeOfCare.EpisodeOfCareDiagnosis.create().role(value).build().role());
    }

    @Test
    public void testRank() {
        assertEquals(1, EpisodeOfCare.EpisodeOfCareDiagnosis.create().rank(1).build().rank());
    }
}
