/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ResearchElementDefinitionCharacteristicTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ResearchElementDefinition.ResearchElementDefinitionCharacteristic(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
    final ResearchElementDefinition.ResearchElementDefinitionCharacteristic x =
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().build();
    final ResearchElementDefinition.ResearchElementDefinitionCharacteristic y =
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testDefinitionCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().definitionCodeableConcept(value).build().definitionCodeableConcept());
    }

    @Test
    public void testDefinitionCanonical() {
        assertEquals("x", ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().definitionCanonical("x").build().definitionCanonical());
    }

    @Test
    public void testDefinitionExpression() {
        final Expression value = Expression.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().definitionExpression(value).build().definitionExpression());
    }

    @Test
    public void testDefinitionDataRequirement() {
        final DataRequirement value = DataRequirement.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().definitionDataRequirement(value).build().definitionDataRequirement());
    }

    @Test
    public void testUsageContext() {
        final java.util.List<UsageContext> value = java.util.Collections.emptyList();
        assertEquals(value, ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().usageContext(value).build().usageContext());
    }

    @Test
    public void testExclude() {
        assertEquals(true, ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().exclude(true).build().exclude());
    }

    @Test
    public void testUnitOfMeasure() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().unitOfMeasure(value).build().unitOfMeasure());
    }

    @Test
    public void testStudyEffectiveDescription() {
    assertEquals("x",
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().studyEffectiveDescription("x").build().studyEffectiveDescription());
    }

    @Test
    public void testStudyEffectiveDateTime() {
    assertEquals("x",
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().studyEffectiveDateTime("x").build().studyEffectiveDateTime());
    }

    @Test
    public void testStudyEffectivePeriod() {
        final Period value = Period.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().studyEffectivePeriod(value).build().studyEffectivePeriod());
    }

    @Test
    public void testStudyEffectiveDuration() {
        final Duration value = Duration.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().studyEffectiveDuration(value).build().studyEffectiveDuration());
    }

    @Test
    public void testStudyEffectiveTiming() {
        final Timing value = Timing.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().studyEffectiveTiming(value).build().studyEffectiveTiming());
    }

    @Test
    public void testStudyEffectiveTimeFromStart() {
        final Duration value = Duration.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().studyEffectiveTimeFromStart(value).build().studyEffectiveTimeFromStart());
    }

    @Test
    public void testStudyEffectiveGroupMeasure() {
    assertEquals("x",
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().studyEffectiveGroupMeasure("x").build().studyEffectiveGroupMeasure());
    }

    @Test
    public void testParticipantEffectiveDescription() {
    assertEquals("x",
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().participantEffectiveDescription("x").build().participantEffectiveDescription());
    }

    @Test
    public void testParticipantEffectiveDateTime() {
    assertEquals("x",
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().participantEffectiveDateTime("x").build().participantEffectiveDateTime());
    }

    @Test
    public void testParticipantEffectivePeriod() {
        final Period value = Period.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().participantEffectivePeriod(value).build().participantEffectivePeriod());
    }

    @Test
    public void testParticipantEffectiveDuration() {
        final Duration value = Duration.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().participantEffectiveDuration(value).build().participantEffectiveDuration());
    }

    @Test
    public void testParticipantEffectiveTiming() {
        final Timing value = Timing.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().participantEffectiveTiming(value).build().participantEffectiveTiming());
    }

    @Test
    public void testParticipantEffectiveTimeFromStart() {
        final Duration value = Duration.create().build();
    assertEquals(value,
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().participantEffectiveTimeFromStart(value).build().participantEffectiveTimeFromStart());
    }

    @Test
    public void testParticipantEffectiveGroupMeasure() {
    assertEquals("x",
            ResearchElementDefinition.ResearchElementDefinitionCharacteristic.create().participantEffectiveGroupMeasure("x").build().participantEffectiveGroupMeasure());
    }
}
