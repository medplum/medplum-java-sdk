/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class PatientCommunicationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Patient.PatientCommunication(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Patient.PatientCommunication.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Patient.PatientCommunication x = Patient.PatientCommunication.create().build();
        final Patient.PatientCommunication y = Patient.PatientCommunication.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Patient.PatientCommunication.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.PatientCommunication.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Patient.PatientCommunication.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testLanguage() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, Patient.PatientCommunication.create().language(value).build().language());
    }

    @Test
    public void testPreferred() {
        assertEquals(true, Patient.PatientCommunication.create().preferred(true).build().preferred());
    }
}
