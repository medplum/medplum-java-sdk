/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimProcedureTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Claim.ClaimProcedure(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Claim.ClaimProcedure.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Claim.ClaimProcedure x = Claim.ClaimProcedure.create().build();
        final Claim.ClaimProcedure y = Claim.ClaimProcedure.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Claim.ClaimProcedure.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimProcedure.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimProcedure.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSequence() {
        assertEquals(1, Claim.ClaimProcedure.create().sequence(1).build().sequence());
    }

    @Test
    public void testType() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimProcedure.create().type(value).build().type());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Claim.ClaimProcedure.create().date(value).build().date());
    }

    @Test
    public void testProcedureCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimProcedure.create().procedureCodeableConcept(value).build().procedureCodeableConcept());
    }

    @Test
    public void testProcedureReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.ClaimProcedure.create().procedureReference(value).build().procedureReference());
    }

    @Test
    public void testUdi() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimProcedure.create().udi(value).build().udi());
    }
}
