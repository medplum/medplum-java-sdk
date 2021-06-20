/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductPharmaceuticalTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductPharmaceutical(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductPharmaceutical.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MedicinalProductPharmaceutical x = MedicinalProductPharmaceutical.create().build();
        final MedicinalProductPharmaceutical y = MedicinalProductPharmaceutical.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductPharmaceutical.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicinalProductPharmaceutical.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, MedicinalProductPharmaceutical.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicinalProductPharmaceutical.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicinalProductPharmaceutical.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPharmaceutical.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPharmaceutical.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPharmaceutical.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPharmaceutical.create().identifier(value).build().identifier());
    }

    @Test
    public void testAdministrableDoseForm() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductPharmaceutical.create().administrableDoseForm(value).build().administrableDoseForm());
    }

    @Test
    public void testUnitOfPresentation() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductPharmaceutical.create().unitOfPresentation(value).build().unitOfPresentation());
    }

    @Test
    public void testIngredient() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPharmaceutical.create().ingredient(value).build().ingredient());
    }

    @Test
    public void testDevice() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPharmaceutical.create().device(value).build().device());
    }

    @Test
    public void testCharacteristics() {
        final java.util.List<MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalCharacteristics> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPharmaceutical.create().characteristics(value).build().characteristics());
    }

    @Test
    public void testRouteOfAdministration() {
        final java.util.List<MedicinalProductPharmaceutical.MedicinalProductPharmaceuticalRouteOfAdministration> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductPharmaceutical.create().routeOfAdministration(value).build().routeOfAdministration());
    }
}
