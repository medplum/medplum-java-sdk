/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductPackagedTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductPackaged(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductPackaged.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MedicinalProductPackaged x = MedicinalProductPackaged.create().build();
        final MedicinalProductPackaged y = MedicinalProductPackaged.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductPackaged.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicinalProductPackaged.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, MedicinalProductPackaged.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicinalProductPackaged.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicinalProductPackaged.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().identifier(value).build().identifier());
    }

    @Test
    public void testSubject() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().subject(value).build().subject());
    }

    @Test
    public void testDescription() {
        assertEquals("x", MedicinalProductPackaged.create().description("x").build().description());
    }

    @Test
    public void testLegalStatusOfSupply() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductPackaged.create().legalStatusOfSupply(value).build().legalStatusOfSupply());
    }

    @Test
    public void testMarketingStatus() {
        final java.util.List<MarketingStatus> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().marketingStatus(value).build().marketingStatus());
    }

    @Test
    public void testMarketingAuthorization() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicinalProductPackaged.create().marketingAuthorization(value).build().marketingAuthorization());
    }

    @Test
    public void testManufacturer() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().manufacturer(value).build().manufacturer());
    }

    @Test
    public void testBatchIdentifier() {
        final java.util.List<MedicinalProductPackaged.MedicinalProductPackagedBatchIdentifier> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().batchIdentifier(value).build().batchIdentifier());
    }

    @Test
    public void testPackageItem() {
        final java.util.List<MedicinalProductPackaged.MedicinalProductPackagedPackageItem> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPackaged.create().packageItem(value).build().packageItem());
    }
}
