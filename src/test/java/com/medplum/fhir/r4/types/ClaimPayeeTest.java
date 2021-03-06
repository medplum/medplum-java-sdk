/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimPayeeTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Claim.ClaimPayee(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Claim.ClaimPayee.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Claim.ClaimPayee x = Claim.ClaimPayee.create().build();
        final Claim.ClaimPayee y = Claim.ClaimPayee.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Claim.ClaimPayee.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimPayee.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.ClaimPayee.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.ClaimPayee.create().type(value).build().type());
    }

    @Test
    public void testParty() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.ClaimPayee.create().party(value).build().party());
    }
}
