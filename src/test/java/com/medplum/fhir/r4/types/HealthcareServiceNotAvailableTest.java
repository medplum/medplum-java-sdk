/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class HealthcareServiceNotAvailableTest {

    @Test
    public void testConstructor() {
        assertNotNull(new HealthcareService.HealthcareServiceNotAvailable(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(HealthcareService.HealthcareServiceNotAvailable.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final HealthcareService.HealthcareServiceNotAvailable x = HealthcareService.HealthcareServiceNotAvailable.create().build();
        final HealthcareService.HealthcareServiceNotAvailable y = HealthcareService.HealthcareServiceNotAvailable.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", HealthcareService.HealthcareServiceNotAvailable.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.HealthcareServiceNotAvailable.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, HealthcareService.HealthcareServiceNotAvailable.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", HealthcareService.HealthcareServiceNotAvailable.create().description("x").build().description());
    }

    @Test
    public void testDuring() {
        final Period value = Period.create().build();
        assertEquals(value, HealthcareService.HealthcareServiceNotAvailable.create().during(value).build().during());
    }
}
