/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AuditEventSourceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new AuditEvent.AuditEventSource(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(AuditEvent.AuditEventSource.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final AuditEvent.AuditEventSource x = AuditEvent.AuditEventSource.create().build();
        final AuditEvent.AuditEventSource y = AuditEvent.AuditEventSource.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", AuditEvent.AuditEventSource.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventSource.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventSource.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testSite() {
        assertEquals("x", AuditEvent.AuditEventSource.create().site("x").build().site());
    }

    @Test
    public void testObserver() {
        final Reference value = Reference.create().build();
        assertEquals(value, AuditEvent.AuditEventSource.create().observer(value).build().observer());
    }

    @Test
    public void testType() {
        final java.util.List<Coding> value = java.util.Collections.emptyList();
        assertEquals(value, AuditEvent.AuditEventSource.create().type(value).build().type());
    }
}
