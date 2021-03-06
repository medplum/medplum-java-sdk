/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class StructureMapTargetTest {

    @Test
    public void testConstructor() {
        assertNotNull(new StructureMap.StructureMapTarget(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(StructureMap.StructureMapTarget.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final StructureMap.StructureMapTarget x = StructureMap.StructureMapTarget.create().build();
        final StructureMap.StructureMapTarget y = StructureMap.StructureMapTarget.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", StructureMap.StructureMapTarget.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapTarget.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapTarget.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testContext() {
        assertEquals("x", StructureMap.StructureMapTarget.create().context("x").build().context());
    }

    @Test
    public void testContextType() {
        assertEquals("x", StructureMap.StructureMapTarget.create().contextType("x").build().contextType());
    }

    @Test
    public void testElement() {
        assertEquals("x", StructureMap.StructureMapTarget.create().element("x").build().element());
    }

    @Test
    public void testVariable() {
        assertEquals("x", StructureMap.StructureMapTarget.create().variable("x").build().variable());
    }

    @Test
    public void testListMode() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapTarget.create().listMode(value).build().listMode());
    }

    @Test
    public void testListRuleId() {
        assertEquals("x", StructureMap.StructureMapTarget.create().listRuleId("x").build().listRuleId());
    }

    @Test
    public void testTransform() {
        assertEquals("x", StructureMap.StructureMapTarget.create().transform("x").build().transform());
    }

    @Test
    public void testParameter() {
        final java.util.List<StructureMap.StructureMapParameter> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapTarget.create().parameter(value).build().parameter());
    }
}
