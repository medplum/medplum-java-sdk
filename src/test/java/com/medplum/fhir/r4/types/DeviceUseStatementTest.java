/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DeviceUseStatementTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DeviceUseStatement(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DeviceUseStatement.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final DeviceUseStatement x = DeviceUseStatement.create().build();
        final DeviceUseStatement y = DeviceUseStatement.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", DeviceUseStatement.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, DeviceUseStatement.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, DeviceUseStatement.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", DeviceUseStatement.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, DeviceUseStatement.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().identifier(value).build().identifier());
    }

    @Test
    public void testBasedOn() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testStatus() {
        assertEquals("x", DeviceUseStatement.create().status("x").build().status());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, DeviceUseStatement.create().subject(value).build().subject());
    }

    @Test
    public void testDerivedFrom() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().derivedFrom(value).build().derivedFrom());
    }

    @Test
    public void testTimingTiming() {
        final Timing value = Timing.create().build();
        assertEquals(value, DeviceUseStatement.create().timingTiming(value).build().timingTiming());
    }

    @Test
    public void testTimingPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, DeviceUseStatement.create().timingPeriod(value).build().timingPeriod());
    }

    @Test
    public void testTimingDateTime() {
        assertEquals("x", DeviceUseStatement.create().timingDateTime("x").build().timingDateTime());
    }

    @Test
    public void testRecordedOn() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, DeviceUseStatement.create().recordedOn(value).build().recordedOn());
    }

    @Test
    public void testSource() {
        final Reference value = Reference.create().build();
        assertEquals(value, DeviceUseStatement.create().source(value).build().source());
    }

    @Test
    public void testDevice() {
        final Reference value = Reference.create().build();
        assertEquals(value, DeviceUseStatement.create().device(value).build().device());
    }

    @Test
    public void testReasonCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().reasonCode(value).build().reasonCode());
    }

    @Test
    public void testReasonReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().reasonReference(value).build().reasonReference());
    }

    @Test
    public void testBodySite() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DeviceUseStatement.create().bodySite(value).build().bodySite());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceUseStatement.create().note(value).build().note());
    }
}
