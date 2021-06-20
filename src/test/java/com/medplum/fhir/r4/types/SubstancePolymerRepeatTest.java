/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstancePolymerRepeatTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstancePolymer.SubstancePolymerRepeat(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstancePolymer.SubstancePolymerRepeat.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final SubstancePolymer.SubstancePolymerRepeat x = SubstancePolymer.SubstancePolymerRepeat.create().build();
        final SubstancePolymer.SubstancePolymerRepeat y = SubstancePolymer.SubstancePolymerRepeat.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SubstancePolymer.SubstancePolymerRepeat.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstancePolymer.SubstancePolymerRepeat.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstancePolymer.SubstancePolymerRepeat.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testNumberOfUnits() {
        assertEquals(1, SubstancePolymer.SubstancePolymerRepeat.create().numberOfUnits(1).build().numberOfUnits());
    }

    @Test
    public void testAverageMolecularFormula() {
        assertEquals("x", SubstancePolymer.SubstancePolymerRepeat.create().averageMolecularFormula("x").build().averageMolecularFormula());
    }

    @Test
    public void testRepeatUnitAmountType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstancePolymer.SubstancePolymerRepeat.create().repeatUnitAmountType(value).build().repeatUnitAmountType());
    }

    @Test
    public void testRepeatUnit() {
        final java.util.List<SubstancePolymer.SubstancePolymerRepeatUnit> value = java.util.Collections.emptyList();
        assertEquals(value, SubstancePolymer.SubstancePolymerRepeat.create().repeatUnit(value).build().repeatUnit());
    }
}
