/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AdverseEventTest {

    @Test
    public void testConstructor() {
        assertNotNull(new AdverseEvent(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(AdverseEvent.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final AdverseEvent x = AdverseEvent.create().build();
        final AdverseEvent y = AdverseEvent.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", AdverseEvent.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, AdverseEvent.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, AdverseEvent.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", AdverseEvent.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, AdverseEvent.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, AdverseEvent.create().identifier(value).build().identifier());
    }

    @Test
    public void testActuality() {
        assertEquals("x", AdverseEvent.create().actuality("x").build().actuality());
    }

    @Test
    public void testCategory() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().category(value).build().category());
    }

    @Test
    public void testEvent() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, AdverseEvent.create().event(value).build().event());
    }

    @Test
    public void testSubject() {
        final Reference value = Reference.create().build();
        assertEquals(value, AdverseEvent.create().subject(value).build().subject());
    }

    @Test
    public void testEncounter() {
        final Reference value = Reference.create().build();
        assertEquals(value, AdverseEvent.create().encounter(value).build().encounter());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, AdverseEvent.create().date(value).build().date());
    }

    @Test
    public void testDetected() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, AdverseEvent.create().detected(value).build().detected());
    }

    @Test
    public void testRecordedDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, AdverseEvent.create().recordedDate(value).build().recordedDate());
    }

    @Test
    public void testResultingCondition() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().resultingCondition(value).build().resultingCondition());
    }

    @Test
    public void testLocation() {
        final Reference value = Reference.create().build();
        assertEquals(value, AdverseEvent.create().location(value).build().location());
    }

    @Test
    public void testSeriousness() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, AdverseEvent.create().seriousness(value).build().seriousness());
    }

    @Test
    public void testSeverity() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, AdverseEvent.create().severity(value).build().severity());
    }

    @Test
    public void testOutcome() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, AdverseEvent.create().outcome(value).build().outcome());
    }

    @Test
    public void testRecorder() {
        final Reference value = Reference.create().build();
        assertEquals(value, AdverseEvent.create().recorder(value).build().recorder());
    }

    @Test
    public void testContributor() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().contributor(value).build().contributor());
    }

    @Test
    public void testSuspectEntity() {
        final java.util.List<AdverseEvent.AdverseEventSuspectEntity> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().suspectEntity(value).build().suspectEntity());
    }

    @Test
    public void testSubjectMedicalHistory() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().subjectMedicalHistory(value).build().subjectMedicalHistory());
    }

    @Test
    public void testReferenceDocument() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().referenceDocument(value).build().referenceDocument());
    }

    @Test
    public void testStudy() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, AdverseEvent.create().study(value).build().study());
    }
}
