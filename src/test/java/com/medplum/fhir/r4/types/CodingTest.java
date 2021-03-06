/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CodingTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Coding(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Coding.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Coding x = Coding.create().build();
        final Coding y = Coding.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Coding.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Coding.create().extension(value).build().extension());
    }

    @Test
    public void testSystem() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Coding.create().system(value).build().system());
    }

    @Test
    public void testVersion() {
        assertEquals("x", Coding.create().version("x").build().version());
    }

    @Test
    public void testCode() {
        assertEquals("x", Coding.create().code("x").build().code());
    }

    @Test
    public void testDisplay() {
        assertEquals("x", Coding.create().display("x").build().display());
    }

    @Test
    public void testUserSelected() {
        assertEquals(true, Coding.create().userSelected(true).build().userSelected());
    }
}
