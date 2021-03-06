/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceSpecificationMoietyTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceSpecification.SubstanceSpecificationMoiety(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceSpecification.SubstanceSpecificationMoiety.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final SubstanceSpecification.SubstanceSpecificationMoiety x = SubstanceSpecification.SubstanceSpecificationMoiety.create().build();
        final SubstanceSpecification.SubstanceSpecificationMoiety y = SubstanceSpecification.SubstanceSpecificationMoiety.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceSpecification.SubstanceSpecificationMoiety.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationMoiety.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationMoiety.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testRole() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationMoiety.create().role(value).build().role());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationMoiety.create().identifier(value).build().identifier());
    }

    @Test
    public void testName() {
        assertEquals("x", SubstanceSpecification.SubstanceSpecificationMoiety.create().name("x").build().name());
    }

    @Test
    public void testStereochemistry() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationMoiety.create().stereochemistry(value).build().stereochemistry());
    }

    @Test
    public void testOpticalActivity() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationMoiety.create().opticalActivity(value).build().opticalActivity());
    }

    @Test
    public void testMolecularFormula() {
        assertEquals("x", SubstanceSpecification.SubstanceSpecificationMoiety.create().molecularFormula("x").build().molecularFormula());
    }

    @Test
    public void testAmountQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, SubstanceSpecification.SubstanceSpecificationMoiety.create().amountQuantity(value).build().amountQuantity());
    }

    @Test
    public void testAmountString() {
        assertEquals("x", SubstanceSpecification.SubstanceSpecificationMoiety.create().amountString("x").build().amountString());
    }
}
