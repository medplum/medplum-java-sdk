/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CoverageEligibilityResponseItemTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CoverageEligibilityResponse.CoverageEligibilityResponseItem(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CoverageEligibilityResponse.CoverageEligibilityResponseItem.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final CoverageEligibilityResponse.CoverageEligibilityResponseItem x = CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().build();
    final CoverageEligibilityResponse.CoverageEligibilityResponseItem y =
            CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCategory() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().category(value).build().category());
    }

    @Test
    public void testProductOrService() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().productOrService(value).build().productOrService());
    }

    @Test
    public void testModifier() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().modifier(value).build().modifier());
    }

    @Test
    public void testProvider() {
        final Reference value = Reference.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().provider(value).build().provider());
    }

    @Test
    public void testExcluded() {
        assertEquals(true, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().excluded(true).build().excluded());
    }

    @Test
    public void testName() {
        assertEquals("x", CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().name("x").build().name());
    }

    @Test
    public void testDescription() {
        assertEquals("x", CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().description("x").build().description());
    }

    @Test
    public void testNetwork() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().network(value).build().network());
    }

    @Test
    public void testUnit() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().unit(value).build().unit());
    }

    @Test
    public void testTerm() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().term(value).build().term());
    }

    @Test
    public void testBenefit() {
        final java.util.List<CoverageEligibilityResponse.CoverageEligibilityResponseBenefit> value = java.util.Collections.emptyList();
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().benefit(value).build().benefit());
    }

    @Test
    public void testAuthorizationRequired() {
        assertEquals(true, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().authorizationRequired(true).build().authorizationRequired());
    }

    @Test
    public void testAuthorizationSupporting() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
    assertEquals(value,
            CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().authorizationSupporting(value).build().authorizationSupporting());
    }

    @Test
    public void testAuthorizationUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, CoverageEligibilityResponse.CoverageEligibilityResponseItem.create().authorizationUrl(value).build().authorizationUrl());
    }
}
