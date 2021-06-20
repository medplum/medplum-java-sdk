/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceReferenceInformationTargetTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceReferenceInformation.SubstanceReferenceInformationTarget(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
    final SubstanceReferenceInformation.SubstanceReferenceInformationTarget x =
            SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().build();
    final SubstanceReferenceInformation.SubstanceReferenceInformationTarget y =
            SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testTarget() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().target(value).build().target());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().type(value).build().type());
    }

    @Test
    public void testInteraction() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().interaction(value).build().interaction());
    }

    @Test
    public void testOrganism() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().organism(value).build().organism());
    }

    @Test
    public void testOrganismType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().organismType(value).build().organismType());
    }

    @Test
    public void testAmountQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().amountQuantity(value).build().amountQuantity());
    }

    @Test
    public void testAmountRange() {
        final Range value = Range.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().amountRange(value).build().amountRange());
    }

    @Test
    public void testAmountString() {
        assertEquals("x", SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().amountString("x").build().amountString());
    }

    @Test
    public void testAmountType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().amountType(value).build().amountType());
    }

    @Test
    public void testSource() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.SubstanceReferenceInformationTarget.create().source(value).build().source());
    }
}
