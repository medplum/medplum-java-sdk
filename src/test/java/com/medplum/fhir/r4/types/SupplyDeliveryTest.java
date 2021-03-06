/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SupplyDeliveryTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SupplyDelivery(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SupplyDelivery.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final SupplyDelivery x = SupplyDelivery.create().build();
        final SupplyDelivery y = SupplyDelivery.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SupplyDelivery.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, SupplyDelivery.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, SupplyDelivery.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", SupplyDelivery.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, SupplyDelivery.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, SupplyDelivery.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SupplyDelivery.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SupplyDelivery.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, SupplyDelivery.create().identifier(value).build().identifier());
    }

    @Test
    public void testBasedOn() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, SupplyDelivery.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testPartOf() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, SupplyDelivery.create().partOf(value).build().partOf());
    }

    @Test
    public void testStatus() {
        assertEquals("x", SupplyDelivery.create().status("x").build().status());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, SupplyDelivery.create().patient(value).build().patient());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SupplyDelivery.create().type(value).build().type());
    }

    @Test
    public void testSuppliedItem() {
        final SupplyDelivery.SupplyDeliverySuppliedItem value = SupplyDelivery.SupplyDeliverySuppliedItem.create().build();
        assertEquals(value, SupplyDelivery.create().suppliedItem(value).build().suppliedItem());
    }

    @Test
    public void testOccurrenceDateTime() {
        assertEquals("x", SupplyDelivery.create().occurrenceDateTime("x").build().occurrenceDateTime());
    }

    @Test
    public void testOccurrencePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, SupplyDelivery.create().occurrencePeriod(value).build().occurrencePeriod());
    }

    @Test
    public void testOccurrenceTiming() {
        final Timing value = Timing.create().build();
        assertEquals(value, SupplyDelivery.create().occurrenceTiming(value).build().occurrenceTiming());
    }

    @Test
    public void testSupplier() {
        final Reference value = Reference.create().build();
        assertEquals(value, SupplyDelivery.create().supplier(value).build().supplier());
    }

    @Test
    public void testDestination() {
        final Reference value = Reference.create().build();
        assertEquals(value, SupplyDelivery.create().destination(value).build().destination());
    }

    @Test
    public void testReceiver() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, SupplyDelivery.create().receiver(value).build().receiver());
    }
}
