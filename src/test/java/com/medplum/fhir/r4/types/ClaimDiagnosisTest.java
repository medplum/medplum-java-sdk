/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimDiagnosisTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Claim.ClaimDiagnosis(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Claim.ClaimDiagnosis.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Claim.ClaimDiagnosis x = Claim.ClaimDiagnosis.create().build();
        final Claim.ClaimDiagnosis y = Claim.ClaimDiagnosis.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Claim.ClaimDiagnosis.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimDiagnosis.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimDiagnosis.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequence() {
        assertEquals(1, Claim.ClaimDiagnosis.create().sequence(1).build().sequence());
    }

    @Test
    public void testDiagnosisCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimDiagnosis.create().diagnosisCodeableConcept(value).build().diagnosisCodeableConcept());
    }

    @Test
    public void testDiagnosisReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.ClaimDiagnosis.create().diagnosisReference(value).build().diagnosisReference());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimDiagnosis.create().type(value).build().type());
    }

    @Test
    public void testOnAdmission() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimDiagnosis.create().onAdmission(value).build().onAdmission());
    }

    @Test
    public void testPackageCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimDiagnosis.create().packageCode(value).build().packageCode());
    }
}
