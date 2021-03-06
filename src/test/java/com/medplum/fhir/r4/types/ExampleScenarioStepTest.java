/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExampleScenarioStepTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExampleScenario.ExampleScenarioStep(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExampleScenario.ExampleScenarioStep.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ExampleScenario.ExampleScenarioStep x = ExampleScenario.ExampleScenarioStep.create().build();
        final ExampleScenario.ExampleScenarioStep y = ExampleScenario.ExampleScenarioStep.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ExampleScenario.ExampleScenarioStep.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioStep.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioStep.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testProcess() {
        final java.util.List<ExampleScenario.ExampleScenarioProcess> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioStep.create().process(value).build().process());
    }

    @Test
    public void testPause() {
        assertEquals(true, ExampleScenario.ExampleScenarioStep.create().pause(true).build().pause());
    }

    @Test
    public void testOperation() {
        final ExampleScenario.ExampleScenarioOperation value = ExampleScenario.ExampleScenarioOperation.create().build();
        assertEquals(value, ExampleScenario.ExampleScenarioStep.create().operation(value).build().operation());
    }

    @Test
    public void testAlternative() {
        final java.util.List<ExampleScenario.ExampleScenarioAlternative> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioStep.create().alternative(value).build().alternative());
    }
}
