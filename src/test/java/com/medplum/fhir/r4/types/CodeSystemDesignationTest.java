/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class CodeSystemDesignationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new CodeSystem.CodeSystemDesignation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(CodeSystem.CodeSystemDesignation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final CodeSystem.CodeSystemDesignation x = CodeSystem.CodeSystemDesignation.create().build();
        final CodeSystem.CodeSystemDesignation y = CodeSystem.CodeSystemDesignation.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", CodeSystem.CodeSystemDesignation.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CodeSystem.CodeSystemDesignation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, CodeSystem.CodeSystemDesignation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", CodeSystem.CodeSystemDesignation.create().language("x").build().language());
    }

    @Test
    public void testUse() {
        final Coding value = Coding.create().build();
        assertEquals(value, CodeSystem.CodeSystemDesignation.create().use(value).build().use());
    }

    @Test
    public void testValue() {
        assertEquals("x", CodeSystem.CodeSystemDesignation.create().value("x").build().value());
    }
}
