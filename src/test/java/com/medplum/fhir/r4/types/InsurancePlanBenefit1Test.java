/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class InsurancePlanBenefit1Test {

    @Test
    public void testConstructor() {
        assertNotNull(new InsurancePlan.InsurancePlanBenefit1(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(InsurancePlan.InsurancePlanBenefit1.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final InsurancePlan.InsurancePlanBenefit1 x = InsurancePlan.InsurancePlanBenefit1.create().build();
        final InsurancePlan.InsurancePlanBenefit1 y = InsurancePlan.InsurancePlanBenefit1.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", InsurancePlan.InsurancePlanBenefit1.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanBenefit1.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanBenefit1.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, InsurancePlan.InsurancePlanBenefit1.create().type(value).build().type());
    }

    @Test
    public void testCost() {
        final java.util.List<InsurancePlan.InsurancePlanCost> value = java.util.Collections.emptyList();
        assertEquals(value, InsurancePlan.InsurancePlanBenefit1.create().cost(value).build().cost());
    }
}
