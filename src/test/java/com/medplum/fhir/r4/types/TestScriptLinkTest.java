/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TestScriptLinkTest {

    @Test
    public void testConstructor() {
        assertNotNull(new TestScript.TestScriptLink(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(TestScript.TestScriptLink.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final TestScript.TestScriptLink x = TestScript.TestScriptLink.create().build();
        final TestScript.TestScriptLink y = TestScript.TestScriptLink.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", TestScript.TestScriptLink.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptLink.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, TestScript.TestScriptLink.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, TestScript.TestScriptLink.create().url(value).build().url());
    }

    @Test
    public void testDescription() {
        assertEquals("x", TestScript.TestScriptLink.create().description("x").build().description());
    }
}
