/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class EvidenceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Evidence(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Evidence.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Evidence x = Evidence.create().build();
        final Evidence y = Evidence.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Evidence.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Evidence.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Evidence.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Evidence.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Evidence.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Evidence.create().url(value).build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", Evidence.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", Evidence.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", Evidence.create().title("x").build().title());
    }

    @Test
    public void testShortTitle() {
        assertEquals("x", Evidence.create().shortTitle("x").build().shortTitle());
    }

    @Test
    public void testSubtitle() {
        assertEquals("x", Evidence.create().subtitle("x").build().subtitle());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Evidence.create().status("x").build().status());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Evidence.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", Evidence.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Evidence.create().description("x").build().description());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().note(value).build().note());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", Evidence.create().copyright("x").build().copyright());
    }

    @Test
    public void testApprovalDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, Evidence.create().approvalDate(value).build().approvalDate());
    }

    @Test
    public void testLastReviewDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, Evidence.create().lastReviewDate(value).build().lastReviewDate());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Evidence.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testTopic() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().topic(value).build().topic());
    }

    @Test
    public void testAuthor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().author(value).build().author());
    }

    @Test
    public void testEditor() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().editor(value).build().editor());
    }

    @Test
    public void testReviewer() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().reviewer(value).build().reviewer());
    }

    @Test
    public void testEndorser() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().endorser(value).build().endorser());
    }

    @Test
    public void testRelatedArtifact() {
        final java.util.List<RelatedArtifact> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().relatedArtifact(value).build().relatedArtifact());
    }

    @Test
    public void testExposureBackground() {
        final Reference value = Reference.create().build();
        assertEquals(value, Evidence.create().exposureBackground(value).build().exposureBackground());
    }

    @Test
    public void testExposureVariant() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().exposureVariant(value).build().exposureVariant());
    }

    @Test
    public void testOutcome() {
        final java.util.List<Reference> value = java.util.Collections.emptyList();
        assertEquals(value, Evidence.create().outcome(value).build().outcome());
    }
}
