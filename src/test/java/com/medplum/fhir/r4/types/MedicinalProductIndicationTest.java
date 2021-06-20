/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductIndicationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductIndication(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductIndication.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MedicinalProductIndication x = MedicinalProductIndication.create().build();
        final MedicinalProductIndication y = MedicinalProductIndication.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductIndication.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicinalProductIndication.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, MedicinalProductIndication.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicinalProductIndication.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicinalProductIndication.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIndication.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIndication.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIndication.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSubject() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIndication.create().subject(value).build().subject());
    }

    @Test
    public void testDiseaseSymptomProcedure() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductIndication.create().diseaseSymptomProcedure(value).build().diseaseSymptomProcedure());
    }

    @Test
    public void testDiseaseStatus() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductIndication.create().diseaseStatus(value).build().diseaseStatus());
    }

    @Test
    public void testComorbidity() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIndication.create().comorbidity(value).build().comorbidity());
    }

    @Test
    public void testIntendedEffect() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductIndication.create().intendedEffect(value).build().intendedEffect());
    }

    @Test
    public void testDuration() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicinalProductIndication.create().duration(value).build().duration());
    }

    @Test
    public void testOtherTherapy() {
        final java.util.List<MedicinalProductIndication.MedicinalProductIndicationOtherTherapy> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIndication.create().otherTherapy(value).build().otherTherapy());
    }

    @Test
    public void testUndesirableEffect() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIndication.create().undesirableEffect(value).build().undesirableEffect());
    }

    @Test
    public void testPopulation() {
        final java.util.List<Population> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIndication.create().population(value).build().population());
    }
}
