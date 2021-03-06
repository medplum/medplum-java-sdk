/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductIngredientReferenceStrengthTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
    final MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength x =
            MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().build();
    final MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength y =
            MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
    assertEquals(value,
            MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSubstance() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().substance(value).build().substance());
    }

    @Test
    public void testStrength() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().strength(value).build().strength());
    }

    @Test
    public void testStrengthLowLimit() {
        final Ratio value = Ratio.create().build();
    assertEquals(value,
            MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().strengthLowLimit(value).build().strengthLowLimit());
    }

    @Test
    public void testMeasurementPoint() {
        assertEquals("x", MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().measurementPoint("x").build().measurementPoint());
    }

    @Test
    public void testCountry() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientReferenceStrength.create().country(value).build().country());
    }
}
