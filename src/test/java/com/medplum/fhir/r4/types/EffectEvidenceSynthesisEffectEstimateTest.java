/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class EffectEvidenceSynthesisEffectEstimateTest {

    @Test
    public void testConstructor() {
        assertNotNull(new EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate x = EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().build();
    final EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate y =
            EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDescription() {
        assertEquals("x", EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().description("x").build().description());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().type(value).build().type());
    }

    @Test
    public void testVariantState() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().variantState(value).build().variantState());
    }

    @Test
    public void testValue() {
        assertEquals(1.0, EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().value(1.0).build().value());
    }

    @Test
    public void testUnitOfMeasure() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().unitOfMeasure(value).build().unitOfMeasure());
    }

    @Test
    public void testPrecisionEstimate() {
        final java.util.List<EffectEvidenceSynthesis.EffectEvidenceSynthesisPrecisionEstimate> value = java.util.Collections.emptyList();
        assertEquals(value, EffectEvidenceSynthesis.EffectEvidenceSynthesisEffectEstimate.create().precisionEstimate(value).build().precisionEstimate());
    }
}
