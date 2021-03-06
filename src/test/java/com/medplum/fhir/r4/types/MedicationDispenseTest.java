/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class MedicationDispenseTest {

    @Test
    public void testConstructor() {
        assertNotNull(new MedicationDispense(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(MedicationDispense.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final MedicationDispense x = MedicationDispense.create().build();
        final MedicationDispense y = MedicationDispense.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", MedicationDispense.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, MedicationDispense.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, MedicationDispense.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", MedicationDispense.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, MedicationDispense.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().identifier(value).build().identifier());
    }

    @Test
    public void testPartOf() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().partOf(value).build().partOf());
    }

    @Test
    public void testStatus() {
        assertEquals("x", MedicationDispense.create().status("x").build().status());
    }

    @Test
    public void testStatusReasonCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationDispense.create().statusReasonCodeableConcept(value).build().statusReasonCodeableConcept());
    }

    @Test
    public void testStatusReasonReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationDispense.create().statusReasonReference(value).build().statusReasonReference());
    }

    @Test
    public void testCategory() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationDispense.create().category(value).build().category());
    }

    @Test
    public void testMedicationCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationDispense.create().medicationCodeableConcept(value).build().medicationCodeableConcept());
    }

    @Test
    public void testMedicationReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationDispense.create().medicationReference(value).build().medicationReference());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationDispense.create().subject(value).build().subject());
    }

    @Test
    public void testContext() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationDispense.create().context(value).build().context());
    }

    @Test
    public void testSupportingInformation() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().supportingInformation(value).build().supportingInformation());
    }

    @Test
    public void testPerformer() {
        final java.util.List<MedicationDispense.MedicationDispensePerformer> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().performer(value).build().performer());
    }

    @Test
    public void testLocation() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationDispense.create().location(value).build().location());
    }

    @Test
    public void testAuthorizingPrescription() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().authorizingPrescription(value).build().authorizingPrescription());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, MedicationDispense.create().type(value).build().type());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicationDispense.create().quantity(value).build().quantity());
    }

    @Test
    public void testDaysSupply() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, MedicationDispense.create().daysSupply(value).build().daysSupply());
    }

    @Test
    public void testWhenPrepared() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, MedicationDispense.create().whenPrepared(value).build().whenPrepared());
    }

    @Test
    public void testWhenHandedOver() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, MedicationDispense.create().whenHandedOver(value).build().whenHandedOver());
    }

    @Test
    public void testDestination() {
        final Reference value = Reference.create().build();
        assertEquals(value, MedicationDispense.create().destination(value).build().destination());
    }

    @Test
    public void testReceiver() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().receiver(value).build().receiver());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().note(value).build().note());
    }

    @Test
    public void testDosageInstruction() {
        final java.util.List<Dosage> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().dosageInstruction(value).build().dosageInstruction());
    }

    @Test
    public void testSubstitution() {
        final MedicationDispense.MedicationDispenseSubstitution value = MedicationDispense.MedicationDispenseSubstitution.create().build();
        assertEquals(value, MedicationDispense.create().substitution(value).build().substitution());
    }

    @Test
    public void testDetectedIssue() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().detectedIssue(value).build().detectedIssue());
    }

    @Test
    public void testEventHistory() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, MedicationDispense.create().eventHistory(value).build().eventHistory());
    }
}
