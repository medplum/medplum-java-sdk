/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class NamingSystemUniqueIdTest {

    @Test
    public void testConstructor() {
        assertNotNull(new NamingSystem.NamingSystemUniqueId(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(NamingSystem.NamingSystemUniqueId.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final NamingSystem.NamingSystemUniqueId x = NamingSystem.NamingSystemUniqueId.create().build();
        final NamingSystem.NamingSystemUniqueId y = NamingSystem.NamingSystemUniqueId.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", NamingSystem.NamingSystemUniqueId.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.NamingSystemUniqueId.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, NamingSystem.NamingSystemUniqueId.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testType() {
        assertEquals("x", NamingSystem.NamingSystemUniqueId.create().type("x").build().type());
    }

    @Test
    public void testValue() {
        assertEquals("x", NamingSystem.NamingSystemUniqueId.create().value("x").build().value());
    }

    @Test
    public void testPreferred() {
        assertEquals(true, NamingSystem.NamingSystemUniqueId.create().preferred(true).build().preferred());
    }

    @Test
    public void testComment() {
        assertEquals("x", NamingSystem.NamingSystemUniqueId.create().comment("x").build().comment());
    }

    @Test
    public void testPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, NamingSystem.NamingSystemUniqueId.create().period(value).build().period());
    }
}
