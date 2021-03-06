/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceSourceMaterialOrganismGeneralTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
    final SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral x =
            SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().build();
    final SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral y =
            SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testKingdom() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().kingdom(value).build().kingdom());
    }

    @Test
    public void testPhylum() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().phylum(value).build().phylum());
    }

    @Test
    public void testClassValue() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().classValue(value).build().classValue());
    }

    @Test
    public void testOrder() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, SubstanceSourceMaterial.SubstanceSourceMaterialOrganismGeneral.create().order(value).build().order());
    }
}
