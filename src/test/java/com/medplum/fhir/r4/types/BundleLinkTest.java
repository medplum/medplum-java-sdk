/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class BundleLinkTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Bundle.BundleLink(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Bundle.BundleLink.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Bundle.BundleLink x = Bundle.BundleLink.create().build();
        final Bundle.BundleLink y = Bundle.BundleLink.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Bundle.BundleLink.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Bundle.BundleLink.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Bundle.BundleLink.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testRelation() {
        assertEquals("x", Bundle.BundleLink.create().relation("x").build().relation());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Bundle.BundleLink.create().url(value).build().url());
    }
}
