/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceInstanceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Substance.SubstanceInstance(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Substance.SubstanceInstance.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Substance.SubstanceInstance x = Substance.SubstanceInstance.create().build();
        final Substance.SubstanceInstance y = Substance.SubstanceInstance.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Substance.SubstanceInstance.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Substance.SubstanceInstance.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Substance.SubstanceInstance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, Substance.SubstanceInstance.create().identifier(value).build().identifier());
    }

    @Test
    public void testExpiry() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Substance.SubstanceInstance.create().expiry(value).build().expiry());
    }

    @Test
    public void testQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, Substance.SubstanceInstance.create().quantity(value).build().quantity());
    }
}
