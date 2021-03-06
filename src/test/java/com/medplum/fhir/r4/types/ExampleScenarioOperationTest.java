/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExampleScenarioOperationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExampleScenario.ExampleScenarioOperation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExampleScenario.ExampleScenarioOperation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ExampleScenario.ExampleScenarioOperation x = ExampleScenario.ExampleScenarioOperation.create().build();
        final ExampleScenario.ExampleScenarioOperation y = ExampleScenario.ExampleScenarioOperation.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ExampleScenario.ExampleScenarioOperation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioOperation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExampleScenario.ExampleScenarioOperation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testNumber() {
        assertEquals("x", ExampleScenario.ExampleScenarioOperation.create().number("x").build().number());
    }

    @Test
    public void testType() {
        assertEquals("x", ExampleScenario.ExampleScenarioOperation.create().type("x").build().type());
    }

    @Test
    public void testName() {
        assertEquals("x", ExampleScenario.ExampleScenarioOperation.create().name("x").build().name());
    }

    @Test
    public void testInitiator() {
        assertEquals("x", ExampleScenario.ExampleScenarioOperation.create().initiator("x").build().initiator());
    }

    @Test
    public void testReceiver() {
        assertEquals("x", ExampleScenario.ExampleScenarioOperation.create().receiver("x").build().receiver());
    }

    @Test
    public void testDescription() {
        assertEquals("x", ExampleScenario.ExampleScenarioOperation.create().description("x").build().description());
    }

    @Test
    public void testInitiatorActive() {
        assertEquals(true, ExampleScenario.ExampleScenarioOperation.create().initiatorActive(true).build().initiatorActive());
    }

    @Test
    public void testReceiverActive() {
        assertEquals(true, ExampleScenario.ExampleScenarioOperation.create().receiverActive(true).build().receiverActive());
    }

    @Test
    public void testRequest() {
        final ExampleScenario.ExampleScenarioContainedInstance value = ExampleScenario.ExampleScenarioContainedInstance.create().build();
        assertEquals(value, ExampleScenario.ExampleScenarioOperation.create().request(value).build().request());
    }

    @Test
    public void testResponse() {
        final ExampleScenario.ExampleScenarioContainedInstance value = ExampleScenario.ExampleScenarioContainedInstance.create().build();
        assertEquals(value, ExampleScenario.ExampleScenarioOperation.create().response(value).build().response());
    }
}
