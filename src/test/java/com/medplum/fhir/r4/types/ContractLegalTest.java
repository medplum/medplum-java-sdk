/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ContractLegalTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Contract.ContractLegal(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Contract.ContractLegal.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Contract.ContractLegal x = Contract.ContractLegal.create().build();
        final Contract.ContractLegal y = Contract.ContractLegal.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Contract.ContractLegal.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractLegal.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Contract.ContractLegal.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testContentAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, Contract.ContractLegal.create().contentAttachment(value).build().contentAttachment());
    }

    @Test
    public void testContentReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, Contract.ContractLegal.create().contentReference(value).build().contentReference());
    }
}
