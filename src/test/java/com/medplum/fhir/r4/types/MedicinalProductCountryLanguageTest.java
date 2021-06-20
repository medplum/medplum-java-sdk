/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductCountryLanguageTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProduct.MedicinalProductCountryLanguage(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProduct.MedicinalProductCountryLanguage.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MedicinalProduct.MedicinalProductCountryLanguage x = MedicinalProduct.MedicinalProductCountryLanguage.create().build();
        final MedicinalProduct.MedicinalProductCountryLanguage y = MedicinalProduct.MedicinalProductCountryLanguage.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProduct.MedicinalProductCountryLanguage.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCountry() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().country(value).build().country());
    }

    @Test
    public void testJurisdiction() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testLanguage() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProduct.MedicinalProductCountryLanguage.create().language(value).build().language());
    }
}
