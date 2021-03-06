/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DeviceDefinitionMaterialTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DeviceDefinition.DeviceDefinitionMaterial(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DeviceDefinition.DeviceDefinitionMaterial.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final DeviceDefinition.DeviceDefinitionMaterial x = DeviceDefinition.DeviceDefinitionMaterial.create().build();
        final DeviceDefinition.DeviceDefinitionMaterial y = DeviceDefinition.DeviceDefinitionMaterial.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", DeviceDefinition.DeviceDefinitionMaterial.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceDefinition.DeviceDefinitionMaterial.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceDefinition.DeviceDefinitionMaterial.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSubstance() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DeviceDefinition.DeviceDefinitionMaterial.create().substance(value).build().substance());
    }

    @Test
    public void testAlternate() {
        assertEquals(true, DeviceDefinition.DeviceDefinitionMaterial.create().alternate(true).build().alternate());
    }

    @Test
    public void testAllergenicIndicator() {
        assertEquals(true, DeviceDefinition.DeviceDefinitionMaterial.create().allergenicIndicator(true).build().allergenicIndicator());
    }
}
