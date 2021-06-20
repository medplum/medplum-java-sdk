/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class PlanDefinitionActionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new PlanDefinition.PlanDefinitionAction(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(PlanDefinition.PlanDefinitionAction.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final PlanDefinition.PlanDefinitionAction x = PlanDefinition.PlanDefinitionAction.create().build();
        final PlanDefinition.PlanDefinitionAction y = PlanDefinition.PlanDefinitionAction.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testPrefix() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().prefix("x").build().prefix());
    }

    @Test
    public void testTitle() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().title("x").build().title());
    }

    @Test
    public void testDescription() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().description("x").build().description());
    }

    @Test
    public void testTextEquivalent() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().textEquivalent("x").build().textEquivalent());
    }

    @Test
    public void testPriority() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().priority("x").build().priority());
    }

    @Test
    public void testCode() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().code(value).build().code());
    }

    @Test
    public void testReason() {
        final java.util.List<CodeableConcept> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().reason(value).build().reason());
    }

    @Test
    public void testDocumentation() {
        final java.util.List<RelatedArtifact> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().documentation(value).build().documentation());
    }

    @Test
    public void testGoalId() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().goalId(value).build().goalId());
    }

    @Test
    public void testSubjectCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().subjectCodeableConcept(value).build().subjectCodeableConcept());
    }

    @Test
    public void testSubjectReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().subjectReference(value).build().subjectReference());
    }

    @Test
    public void testTrigger() {
        final java.util.List<TriggerDefinition> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().trigger(value).build().trigger());
    }

    @Test
    public void testCondition() {
        final java.util.List<PlanDefinition.PlanDefinitionCondition> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().condition(value).build().condition());
    }

    @Test
    public void testInput() {
        final java.util.List<DataRequirement> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().input(value).build().input());
    }

    @Test
    public void testOutput() {
        final java.util.List<DataRequirement> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().output(value).build().output());
    }

    @Test
    public void testRelatedAction() {
        final java.util.List<PlanDefinition.PlanDefinitionRelatedAction> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().relatedAction(value).build().relatedAction());
    }

    @Test
    public void testTimingDateTime() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().timingDateTime("x").build().timingDateTime());
    }

    @Test
    public void testTimingAge() {
        final Age value = Age.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().timingAge(value).build().timingAge());
    }

    @Test
    public void testTimingPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().timingPeriod(value).build().timingPeriod());
    }

    @Test
    public void testTimingDuration() {
        final Duration value = Duration.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().timingDuration(value).build().timingDuration());
    }

    @Test
    public void testTimingRange() {
        final Range value = Range.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().timingRange(value).build().timingRange());
    }

    @Test
    public void testTimingTiming() {
        final Timing value = Timing.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().timingTiming(value).build().timingTiming());
    }

    @Test
    public void testParticipant() {
        final java.util.List<PlanDefinition.PlanDefinitionParticipant> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().participant(value).build().participant());
    }

    @Test
    public void testType() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().type(value).build().type());
    }

    @Test
    public void testGroupingBehavior() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().groupingBehavior("x").build().groupingBehavior());
    }

    @Test
    public void testSelectionBehavior() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().selectionBehavior("x").build().selectionBehavior());
    }

    @Test
    public void testRequiredBehavior() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().requiredBehavior("x").build().requiredBehavior());
    }

    @Test
    public void testPrecheckBehavior() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().precheckBehavior("x").build().precheckBehavior());
    }

    @Test
    public void testCardinalityBehavior() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().cardinalityBehavior("x").build().cardinalityBehavior());
    }

    @Test
    public void testDefinitionCanonical() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().definitionCanonical("x").build().definitionCanonical());
    }

    @Test
    public void testDefinitionUri() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().definitionUri("x").build().definitionUri());
    }

    @Test
    public void testTransform() {
        assertEquals("x", PlanDefinition.PlanDefinitionAction.create().transform("x").build().transform());
    }

    @Test
    public void testDynamicValue() {
        final java.util.List<PlanDefinition.PlanDefinitionDynamicValue> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().dynamicValue(value).build().dynamicValue());
    }

    @Test
    public void testAction() {
        final java.util.List<PlanDefinition.PlanDefinitionAction> value = java.util.Collections.emptyList();
        assertEquals(value, PlanDefinition.PlanDefinitionAction.create().action(value).build().action());
    }
}
