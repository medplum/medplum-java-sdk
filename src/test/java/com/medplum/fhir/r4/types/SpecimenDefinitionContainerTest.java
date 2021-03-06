/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SpecimenDefinitionContainerTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SpecimenDefinition.SpecimenDefinitionContainer(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SpecimenDefinition.SpecimenDefinitionContainer.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final SpecimenDefinition.SpecimenDefinitionContainer x = SpecimenDefinition.SpecimenDefinitionContainer.create().build();
        final SpecimenDefinition.SpecimenDefinitionContainer y = SpecimenDefinition.SpecimenDefinitionContainer.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SpecimenDefinition.SpecimenDefinitionContainer.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.SpecimenDefinitionContainer.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.SpecimenDefinitionContainer.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testMaterial() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SpecimenDefinition.SpecimenDefinitionContainer.create().material(value).build().material());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SpecimenDefinition.SpecimenDefinitionContainer.create().type(value).build().type());
    }

    @Test
    public void testCap() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SpecimenDefinition.SpecimenDefinitionContainer.create().cap(value).build().cap());
    }

    @Test
    public void testDescription() {
        assertEquals("x", SpecimenDefinition.SpecimenDefinitionContainer.create().description("x").build().description());
    }

    @Test
    public void testCapacity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, SpecimenDefinition.SpecimenDefinitionContainer.create().capacity(value).build().capacity());
    }

    @Test
    public void testMinimumVolumeQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, SpecimenDefinition.SpecimenDefinitionContainer.create().minimumVolumeQuantity(value).build().minimumVolumeQuantity());
    }

    @Test
    public void testMinimumVolumeString() {
        assertEquals("x", SpecimenDefinition.SpecimenDefinitionContainer.create().minimumVolumeString("x").build().minimumVolumeString());
    }

    @Test
    public void testAdditive() {
        final java.util.List<SpecimenDefinition.SpecimenDefinitionAdditive> value = java.util.Collections.emptyList();
        assertEquals(value, SpecimenDefinition.SpecimenDefinitionContainer.create().additive(value).build().additive());
    }

    @Test
    public void testPreparation() {
        assertEquals("x", SpecimenDefinition.SpecimenDefinitionContainer.create().preparation("x").build().preparation());
    }
}
