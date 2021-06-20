/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class BundleSearchTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Bundle.BundleSearch(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Bundle.BundleSearch.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Bundle.BundleSearch x = Bundle.BundleSearch.create().build();
        final Bundle.BundleSearch y = Bundle.BundleSearch.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Bundle.BundleSearch.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Bundle.BundleSearch.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Bundle.BundleSearch.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testMode() {
        assertEquals("x", Bundle.BundleSearch.create().mode("x").build().mode());
    }

    @Test
    public void testScore() {
        assertEquals(1.0, Bundle.BundleSearch.create().score(1.0).build().score());
    }
}
