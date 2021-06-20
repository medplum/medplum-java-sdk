/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ProvenanceEntityTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Provenance.ProvenanceEntity(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Provenance.ProvenanceEntity.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Provenance.ProvenanceEntity x = Provenance.ProvenanceEntity.create().build();
        final Provenance.ProvenanceEntity y = Provenance.ProvenanceEntity.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Provenance.ProvenanceEntity.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Provenance.ProvenanceEntity.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Provenance.ProvenanceEntity.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testRole() {
        assertEquals("x", Provenance.ProvenanceEntity.create().role("x").build().role());
    }

    @Test
    public void testWhat() {
        final Reference value = Reference.create().build();
        assertEquals(value, Provenance.ProvenanceEntity.create().what(value).build().what());
    }

    @Test
    public void testAgent() {
        final java.util.List<Provenance.ProvenanceAgent> value = java.util.Collections.emptyList();
        assertEquals(value, Provenance.ProvenanceEntity.create().agent(value).build().agent());
    }
}
