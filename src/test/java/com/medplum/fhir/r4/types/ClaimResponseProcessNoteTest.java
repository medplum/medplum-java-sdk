/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClaimResponseProcessNoteTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ClaimResponse.ClaimResponseProcessNote(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ClaimResponse.ClaimResponseProcessNote.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ClaimResponse.ClaimResponseProcessNote x = ClaimResponse.ClaimResponseProcessNote.create().build();
        final ClaimResponse.ClaimResponseProcessNote y = ClaimResponse.ClaimResponseProcessNote.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ClaimResponse.ClaimResponseProcessNote.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseProcessNote.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ClaimResponse.ClaimResponseProcessNote.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testNumber() {
        assertEquals(1, ClaimResponse.ClaimResponseProcessNote.create().number(1).build().number());
    }

    @Test
    public void testType() {
        assertEquals("x", ClaimResponse.ClaimResponseProcessNote.create().type("x").build().type());
    }

    @Test
    public void testText() {
        assertEquals("x", ClaimResponse.ClaimResponseProcessNote.create().text("x").build().text());
    }

    @Test
    public void testLanguage() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ClaimResponse.ClaimResponseProcessNote.create().language(value).build().language());
    }
}
