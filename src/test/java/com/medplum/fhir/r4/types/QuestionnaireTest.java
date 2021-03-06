/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class QuestionnaireTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Questionnaire(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Questionnaire.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Questionnaire x = Questionnaire.create().build();
        final Questionnaire y = Questionnaire.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Questionnaire.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, Questionnaire.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Questionnaire.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Questionnaire.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, Questionnaire.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Questionnaire.create().url(value).build().url());
    }

    @Test
    public void testIdentifier() {
        final java.util.List<Identifier> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().identifier(value).build().identifier());
    }

    @Test
    public void testVersion() {
        assertEquals("x", Questionnaire.create().version("x").build().version());
    }

    @Test
    public void testName() {
        assertEquals("x", Questionnaire.create().name("x").build().name());
    }

    @Test
    public void testTitle() {
        assertEquals("x", Questionnaire.create().title("x").build().title());
    }

    @Test
    public void testDerivedFrom() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().derivedFrom(value).build().derivedFrom());
    }

    @Test
    public void testStatus() {
        assertEquals("x", Questionnaire.create().status("x").build().status());
    }

    @Test
    public void testExperimental() {
        assertEquals(true, Questionnaire.create().experimental(true).build().experimental());
    }

    @Test
    public void testSubjectType() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().subjectType(value).build().subjectType());
    }

    @Test
    public void testDate() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Questionnaire.create().date(value).build().date());
    }

    @Test
    public void testPublisher() {
        assertEquals("x", Questionnaire.create().publisher("x").build().publisher());
    }

    @Test
    public void testContact() {
        final java.util.List<ContactDetail> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().contact(value).build().contact());
    }

    @Test
    public void testDescription() {
        assertEquals("x", Questionnaire.create().description("x").build().description());
    }

    @Test
    public void testUseContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().useContext(value).build().useContext());
    }

    @Test
    public void testJurisdiction() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().jurisdiction(value).build().jurisdiction());
    }

    @Test
    public void testPurpose() {
        assertEquals("x", Questionnaire.create().purpose("x").build().purpose());
    }

    @Test
    public void testCopyright() {
        assertEquals("x", Questionnaire.create().copyright("x").build().copyright());
    }

    @Test
    public void testApprovalDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, Questionnaire.create().approvalDate(value).build().approvalDate());
    }

    @Test
    public void testLastReviewDate() {
        final java.time.LocalDate value = java.time.LocalDate.now();
        assertEquals(value, Questionnaire.create().lastReviewDate(value).build().lastReviewDate());
    }

    @Test
    public void testEffectivePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Questionnaire.create().effectivePeriod(value).build().effectivePeriod());
    }

    @Test
    public void testCode() {
        final java.util.List<Coding> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().code(value).build().code());
    }

    @Test
    public void testItem() {
        final java.util.List<Questionnaire.QuestionnaireItem> value = java.util.Collections.emptyList();
        assertEquals(value, Questionnaire.create().item(value).build().item());
    }
}
