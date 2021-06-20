/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Claim(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Claim.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Claim x = Claim.create().build();
        final Claim y = Claim.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Claim.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Claim.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Claim.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Claim.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Claim.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().identifier(value).build().identifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Claim.create().status("x").build().status());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.create().type(value).build().type());
    }

    @Test
    public void testSubType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.create().subType(value).build().subType());
    }

    @Test
    public void testUse() {
        assertEquals("x", Claim.create().use("x").build().use());
    }

    @Test
    public void testPatient() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.create().patient(value).build().patient());
    }

    @Test
    public void testBillablePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Claim.create().billablePeriod(value).build().billablePeriod());
    }

    @Test
    public void testCreated() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Claim.create().created(value).build().created());
    }

    @Test
    public void testEnterer() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.create().enterer(value).build().enterer());
    }

    @Test
    public void testInsurer() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.create().insurer(value).build().insurer());
    }

    @Test
    public void testProvider() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.create().provider(value).build().provider());
    }

    @Test
    public void testPriority() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.create().priority(value).build().priority());
    }

    @Test
    public void testFundsReserve() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Claim.create().fundsReserve(value).build().fundsReserve());
    }

    @Test
    public void testRelated() {
        final java.util.List<Claim.ClaimRelated> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().related(value).build().related());
    }

    @Test
    public void testPrescription() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.create().prescription(value).build().prescription());
    }

    @Test
    public void testOriginalPrescription() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.create().originalPrescription(value).build().originalPrescription());
    }

    @Test
    public void testPayee() {
        final Claim.ClaimPayee value = Claim.ClaimPayee.create().build();
        assertEquals(value, Claim.create().payee(value).build().payee());
    }

    @Test
    public void testReferral() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.create().referral(value).build().referral());
    }

    @Test
    public void testFacility() {
        final Reference value = Reference.create().build();
        assertEquals(value, Claim.create().facility(value).build().facility());
    }

    @Test
    public void testCareTeam() {
        final java.util.List<Claim.ClaimCareTeam> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().careTeam(value).build().careTeam());
    }

    @Test
    public void testSupportingInfo() {
        final java.util.List<Claim.ClaimSupportingInfo> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().supportingInfo(value).build().supportingInfo());
    }

    @Test
    public void testDiagnosis() {
        final java.util.List<Claim.ClaimDiagnosis> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().diagnosis(value).build().diagnosis());
    }

    @Test
    public void testProcedure() {
        final java.util.List<Claim.ClaimProcedure> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().procedure(value).build().procedure());
    }

    @Test
    public void testInsurance() {
        final java.util.List<Claim.ClaimInsurance> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().insurance(value).build().insurance());
    }

    @Test
    public void testAccident() {
        final Claim.ClaimAccident value = Claim.ClaimAccident.create().build();
        assertEquals(value, Claim.create().accident(value).build().accident());
    }

    @Test
    public void testItem() {
        final java.util.List<Claim.ClaimItem> value = java.util.Collections.emptyList();
        assertEquals(value, Claim.create().item(value).build().item());
    }

    @Test
    public void testTotal() {
        final Money value = Money.create().build();
        assertEquals(value, Claim.create().total(value).build().total());
    }
}
