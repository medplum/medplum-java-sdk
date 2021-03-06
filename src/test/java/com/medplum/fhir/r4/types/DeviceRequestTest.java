/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DeviceRequestTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DeviceRequest(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DeviceRequest.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final DeviceRequest x = DeviceRequest.create().build();
        final DeviceRequest y = DeviceRequest.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", DeviceRequest.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, DeviceRequest.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, DeviceRequest.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", DeviceRequest.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, DeviceRequest.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().identifier(value).build().identifier());
    }

    @Test
    public void testInstantiatesCanonical() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().instantiatesCanonical(value).build().instantiatesCanonical());
    }

    @Test
    public void testInstantiatesUri() {
        final java.util.List<java.net.URI> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().instantiatesUri(value).build().instantiatesUri());
    }

    @Test
    public void testBasedOn() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().basedOn(value).build().basedOn());
    }

    @Test
    public void testPriorRequest() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().priorRequest(value).build().priorRequest());
    }

    @Test
    public void testGroupIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, DeviceRequest.create().groupIdentifier(value).build().groupIdentifier());
    }

    @Test
    public void testStatus() {
        assertEquals("x", DeviceRequest.create().status("x").build().status());
    }

    @Test
    public void testIntent() {
        assertEquals("x", DeviceRequest.create().intent("x").build().intent());
    }

    @Test
    public void testPriority() {
        assertEquals("x", DeviceRequest.create().priority("x").build().priority());
    }

    @Test
    public void testCodeReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, DeviceRequest.create().codeReference(value).build().codeReference());
    }

    @Test
    public void testCodeCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DeviceRequest.create().codeCodeableConcept(value).build().codeCodeableConcept());
    }

    @Test
    public void testParameter() {
        final java.util.List<DeviceRequest.DeviceRequestParameter> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().parameter(value).build().parameter());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, DeviceRequest.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, DeviceRequest.create().encounter(value).build().encounter());
    }

    @Test
    public void testOccurrenceDateTime() {
        assertEquals("x", DeviceRequest.create().occurrenceDateTime("x").build().occurrenceDateTime());
    }

    @Test
    public void testOccurrencePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, DeviceRequest.create().occurrencePeriod(value).build().occurrencePeriod());
    }

    @Test
    public void testOccurrenceTiming() {
        final Timing value = Timing.create().build();
        assertEquals(value, DeviceRequest.create().occurrenceTiming(value).build().occurrenceTiming());
    }

    @Test
    public void testAuthoredOn() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, DeviceRequest.create().authoredOn(value).build().authoredOn());
    }

    @Test
    public void testRequester() {
        final Reference value = Reference.create().build();
        assertEquals(value, DeviceRequest.create().requester(value).build().requester());
    }

    @Test
    public void testPerformerType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, DeviceRequest.create().performerType(value).build().performerType());
    }

    @Test
    public void testPerformer() {
        final Reference value = Reference.create().build();
        assertEquals(value, DeviceRequest.create().performer(value).build().performer());
    }

    @Test
    public void testReasonCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().reasonCode(value).build().reasonCode());
    }

    @Test
    public void testReasonReference() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().reasonReference(value).build().reasonReference());
    }

    @Test
    public void testInsurance() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().insurance(value).build().insurance());
    }

    @Test
    public void testSupportingInfo() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().supportingInfo(value).build().supportingInfo());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().note(value).build().note());
    }

    @Test
    public void testRelevantHistory() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, DeviceRequest.create().relevantHistory(value).build().relevantHistory());
    }
}
