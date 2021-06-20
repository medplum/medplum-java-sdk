/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class InvoicePriceComponentTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Invoice.InvoicePriceComponent(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Invoice.InvoicePriceComponent.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Invoice.InvoicePriceComponent x = Invoice.InvoicePriceComponent.create().build();
        final Invoice.InvoicePriceComponent y = Invoice.InvoicePriceComponent.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Invoice.InvoicePriceComponent.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Invoice.InvoicePriceComponent.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Invoice.InvoicePriceComponent.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", Invoice.InvoicePriceComponent.create().type("x").build().type());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Invoice.InvoicePriceComponent.create().code(value).build().code());
    }

    @Test
    public void testFactor() {
        assertEquals(1.0, Invoice.InvoicePriceComponent.create().factor(1.0).build().factor());
    }

    @Test
    public void testAmount() {
        final Money value = Money.create().build();
        assertEquals(value, Invoice.InvoicePriceComponent.create().amount(value).build().amount());
    }
}
