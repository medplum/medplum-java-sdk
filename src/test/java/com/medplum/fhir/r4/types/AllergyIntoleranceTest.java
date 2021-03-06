/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AllergyIntoleranceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new AllergyIntolerance(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(AllergyIntolerance.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final AllergyIntolerance x = AllergyIntolerance.create().build();
        final AllergyIntolerance y = AllergyIntolerance.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", AllergyIntolerance.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, AllergyIntolerance.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, AllergyIntolerance.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", AllergyIntolerance.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, AllergyIntolerance.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, AllergyIntolerance.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AllergyIntolerance.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AllergyIntolerance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, AllergyIntolerance.create().identifier(value).build().identifier());
    }

    @Test
    public void testClinicalStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, AllergyIntolerance.create().clinicalStatus(value).build().clinicalStatus());
    }

    @Test
    public void testVerificationStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, AllergyIntolerance.create().verificationStatus(value).build().verificationStatus());
    }

    @Test
    public void testType() {
        assertEquals("x", AllergyIntolerance.create().type("x").build().type());
    }

    @Test
    public void testCategory() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, AllergyIntolerance.create().category(value).build().category());
    }

    @Test
    public void testCriticality() {
        assertEquals("x", AllergyIntolerance.create().criticality("x").build().criticality());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, AllergyIntolerance.create().code(value).build().code());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, AllergyIntolerance.create().patient(value).build().patient());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, AllergyIntolerance.create().encounter(value).build().encounter());
    }

    @Test
    public void testOnsetDateTime() {
        assertEquals("x", AllergyIntolerance.create().onsetDateTime("x").build().onsetDateTime());
    }

    @Test
    public void testOnsetAge() {
        final Age value = Age.create().build();
        assertEquals(value, AllergyIntolerance.create().onsetAge(value).build().onsetAge());
    }

    @Test
    public void testOnsetPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, AllergyIntolerance.create().onsetPeriod(value).build().onsetPeriod());
    }

    @Test
    public void testOnsetRange() {
        final Range value = Range.create().build();
        assertEquals(value, AllergyIntolerance.create().onsetRange(value).build().onsetRange());
    }

    @Test
    public void testOnsetString() {
        assertEquals("x", AllergyIntolerance.create().onsetString("x").build().onsetString());
    }

    @Test
    public void testRecordedDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, AllergyIntolerance.create().recordedDate(value).build().recordedDate());
    }

    @Test
    public void testRecorder() {
        final Reference value = Reference.create().build();
        assertEquals(value, AllergyIntolerance.create().recorder(value).build().recorder());
    }

    @Test
    public void testAsserter() {
        final Reference value = Reference.create().build();
        assertEquals(value, AllergyIntolerance.create().asserter(value).build().asserter());
    }

    @Test
    public void testLastOccurrence() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, AllergyIntolerance.create().lastOccurrence(value).build().lastOccurrence());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, AllergyIntolerance.create().note(value).build().note());
    }

    @Test
    public void testReaction() {
        final java.util.List<AllergyIntolerance.AllergyIntoleranceReaction> value = java.util.Collections.emptyList();
        assertEquals(value, AllergyIntolerance.create().reaction(value).build().reaction());
    }
}
