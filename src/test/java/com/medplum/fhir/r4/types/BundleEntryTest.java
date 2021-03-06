/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class BundleEntryTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Bundle.BundleEntry(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Bundle.BundleEntry.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Bundle.BundleEntry x = Bundle.BundleEntry.create().build();
        final Bundle.BundleEntry y = Bundle.BundleEntry.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Bundle.BundleEntry.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Bundle.BundleEntry.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Bundle.BundleEntry.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLink() {
        final java.util.List<Bundle.BundleLink> value = java.util.Collections.emptyList();
        assertEquals(value, Bundle.BundleEntry.create().link(value).build().link());
    }

    @Test
    public void testFullUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Bundle.BundleEntry.create().fullUrl(value).build().fullUrl());
    }

    @Test
    public void testResource() {
        final Patient p = Patient.create().build();
        assertEquals(p, Bundle.BundleEntry.create().resource(p).build().resource());
    }

    @Test
    public void testResourceAsClass() {
        final Patient p = Patient.create().build();
        assertEquals(p, Bundle.BundleEntry.create().resource(p).build().resource(Patient.class));
    }

    @Test
    public void testSearch() {
        final Bundle.BundleSearch value = Bundle.BundleSearch.create().build();
        assertEquals(value, Bundle.BundleEntry.create().search(value).build().search());
    }

    @Test
    public void testRequest() {
        final Bundle.BundleRequest value = Bundle.BundleRequest.create().build();
        assertEquals(value, Bundle.BundleEntry.create().request(value).build().request());
    }

    @Test
    public void testResponse() {
        final Bundle.BundleResponse value = Bundle.BundleResponse.create().build();
        assertEquals(value, Bundle.BundleEntry.create().response(value).build().response());
    }
}
