/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class InsurancePlanCoverageTest {

    @Test
    public void testConstructor() {
        assertNotNull(new InsurancePlan.InsurancePlanCoverage(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(InsurancePlan.InsurancePlanCoverage.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final InsurancePlan.InsurancePlanCoverage x = InsurancePlan.InsurancePlanCoverage.create().build();
        final InsurancePlan.InsurancePlanCoverage y = InsurancePlan.InsurancePlanCoverage.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", InsurancePlan.InsurancePlanCoverage.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanCoverage.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanCoverage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, InsurancePlan.InsurancePlanCoverage.create().type(value).build().type());
    }

    @Test
    public void testNetwork() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanCoverage.create().network(value).build().network());
    }

    @Test
    public void testBenefit() {
        final java.util.List<InsurancePlan.InsurancePlanBenefit> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanCoverage.create().benefit(value).build().benefit());
    }
}
