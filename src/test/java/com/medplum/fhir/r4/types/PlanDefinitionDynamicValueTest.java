/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class PlanDefinitionDynamicValueTest {

    @Test
    public void testConstructor() {
        assertNotNull(new PlanDefinition.PlanDefinitionDynamicValue(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(PlanDefinition.PlanDefinitionDynamicValue.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final PlanDefinition.PlanDefinitionDynamicValue x = PlanDefinition.PlanDefinitionDynamicValue.create().build();
        final PlanDefinition.PlanDefinitionDynamicValue y = PlanDefinition.PlanDefinitionDynamicValue.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", PlanDefinition.PlanDefinitionDynamicValue.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionDynamicValue.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionDynamicValue.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testPath() {
        assertEquals("x", PlanDefinition.PlanDefinitionDynamicValue.create().path("x").build().path());
    }

    @Test
    public void testExpression() {
        final Expression value = Expression.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionDynamicValue.create().expression(value).build().expression());
    }
}
