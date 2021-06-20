/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ContractPartyTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Contract.ContractParty(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Contract.ContractParty.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Contract.ContractParty x = Contract.ContractParty.create().build();
        final Contract.ContractParty y = Contract.ContractParty.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Contract.ContractParty.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractParty.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractParty.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractParty.create().reference(value).build().reference());
    }

    @Test
    public void testRole() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Contract.ContractParty.create().role(value).build().role());
    }
}
