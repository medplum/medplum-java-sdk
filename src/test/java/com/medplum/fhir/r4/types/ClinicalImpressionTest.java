/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClinicalImpressionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ClinicalImpression(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ClinicalImpression.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ClinicalImpression x = ClinicalImpression.create().build();
        final ClinicalImpression y = ClinicalImpression.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ClinicalImpression.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ClinicalImpression.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ClinicalImpression.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ClinicalImpression.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, ClinicalImpression.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", ClinicalImpression.create().status("x").build().status());
    }

    @Test
    public void testStatusReason() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClinicalImpression.create().statusReason(value).build().statusReason());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClinicalImpression.create().code(value).build().code());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ClinicalImpression.create().description("x").build().description());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, ClinicalImpression.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, ClinicalImpression.create().encounter(value).build().encounter());
    }

    @Test
    public void testEffectiveDateTime() {
        assertEquals("x", ClinicalImpression.create().effectiveDateTime("x").build().effectiveDateTime());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, ClinicalImpression.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, ClinicalImpression.create().date(value).build().date());
    }

    @Test
    public void testAssessor() {
        final Reference value = Reference.create().build();
        assertEquals(value, ClinicalImpression.create().assessor(value).build().assessor());
    }

    @Test
    public void testPrevious() {
        final Reference value = Reference.create().build();
        assertEquals(value, ClinicalImpression.create().previous(value).build().previous());
    }

    @Test
    public void testProblem() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().problem(value).build().problem());
    }

    @Test
    public void testInvestigation() {
        final java.util.List<ClinicalImpression.ClinicalImpressionInvestigation> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().investigation(value).build().investigation());
    }

    @Test
    public void testProtocol() {
        final java.util.List<java.net.URI> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().protocol(value).build().protocol());
    }

    @Test
    public void testSummary() {
        assertEquals("x", ClinicalImpression.create().summary("x").build().summary());
    }

    @Test
    public void testFinding() {
        final java.util.List<ClinicalImpression.ClinicalImpressionFinding> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().finding(value).build().finding());
    }

    @Test
    public void testPrognosisCodeableConcept() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().prognosisCodeableConcept(value).build().prognosisCodeableConcept());
    }

    @Test
    public void testPrognosisReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().prognosisReference(value).build().prognosisReference());
    }

    @Test
    public void testSupportingInfo() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().supportingInfo(value).build().supportingInfo());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, ClinicalImpression.create().note(value).build().note());
    }
}
