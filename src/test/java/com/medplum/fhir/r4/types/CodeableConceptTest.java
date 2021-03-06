/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CodeableConceptTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CodeableConcept(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CodeableConcept.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final CodeableConcept x = CodeableConcept.create().build();
        final CodeableConcept y = CodeableConcept.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", CodeableConcept.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CodeableConcept.create().extension(value).build().extension());
    }

    @Test
    public void testCoding() {
        final java.util.List<Coding> value = java.util.Collections.emptyList();
        assertEquals(value, CodeableConcept.create().coding(value).build().coding());
    }

    @Test
    public void testText() {
        assertEquals("x", CodeableConcept.create().text("x").build().text());
    }
}
