/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ExplanationOfBenefitProcessNoteTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ExplanationOfBenefit.ExplanationOfBenefitProcessNote(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ExplanationOfBenefit.ExplanationOfBenefitProcessNote x = ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().build();
        final ExplanationOfBenefit.ExplanationOfBenefitProcessNote y = ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testNumber() {
        assertEquals(1, ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().number(1).build().number());
    }

    @Test
    public void testType() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().type("x").build().type());
    }

    @Test
    public void testText() {
        assertEquals("x", ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().text("x").build().text());
    }

    @Test
    public void testLanguage() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ExplanationOfBenefit.ExplanationOfBenefitProcessNote.create().language(value).build().language());
    }
}
