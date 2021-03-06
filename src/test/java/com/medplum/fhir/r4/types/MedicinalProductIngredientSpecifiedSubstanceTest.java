/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicinalProductIngredientSpecifiedSubstanceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
    final MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance x =
            MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().build();
    final MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance y =
            MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
    assertEquals(value,
            MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().code(value).build().code());
    }

    @Test
    public void testGroup() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().group(value).build().group());
    }

    @Test
    public void testConfidentiality() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().confidentiality(value).build().confidentiality());
    }

    @Test
    public void testStrength() {
        final java.util.List<MedicinalProductIngredient.MedicinalProductIngredientStrength> value = java.util.Collections.emptyList();
        assertEquals(value, MedicinalProductIngredient.MedicinalProductIngredientSpecifiedSubstance.create().strength(value).build().strength());
    }
}
