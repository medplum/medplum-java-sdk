/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class FamilyMemberHistoryConditionTest {

    @Test
    public void testConstructor() {
        assertNotNull(new FamilyMemberHistory.FamilyMemberHistoryCondition(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(FamilyMemberHistory.FamilyMemberHistoryCondition.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final FamilyMemberHistory.FamilyMemberHistoryCondition x = FamilyMemberHistory.FamilyMemberHistoryCondition.create().build();
        final FamilyMemberHistory.FamilyMemberHistoryCondition y = FamilyMemberHistory.FamilyMemberHistoryCondition.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", FamilyMemberHistory.FamilyMemberHistoryCondition.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, FamilyMemberHistory.FamilyMemberHistoryCondition.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, FamilyMemberHistory.FamilyMemberHistoryCondition.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCode() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, FamilyMemberHistory.FamilyMemberHistoryCondition.create().code(value).build().code());
    }

    @Test
    public void testOutcome() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, FamilyMemberHistory.FamilyMemberHistoryCondition.create().outcome(value).build().outcome());
    }

    @Test
    public void testContributedToDeath() {
        assertEquals(true, FamilyMemberHistory.FamilyMemberHistoryCondition.create().contributedToDeath(true).build().contributedToDeath());
    }

    @Test
    public void testOnsetAge() {
        final Age value = Age.create().build();
        assertEquals(value, FamilyMemberHistory.FamilyMemberHistoryCondition.create().onsetAge(value).build().onsetAge());
    }

    @Test
    public void testOnsetRange() {
        final Range value = Range.create().build();
        assertEquals(value, FamilyMemberHistory.FamilyMemberHistoryCondition.create().onsetRange(value).build().onsetRange());
    }

    @Test
    public void testOnsetPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, FamilyMemberHistory.FamilyMemberHistoryCondition.create().onsetPeriod(value).build().onsetPeriod());
    }

    @Test
    public void testOnsetString() {
        assertEquals("x", FamilyMemberHistory.FamilyMemberHistoryCondition.create().onsetString("x").build().onsetString());
    }

    @Test
    public void testNote() {
        final java.util.List<Annotation> value = java.util.Collections.emptyList();
        assertEquals(value, FamilyMemberHistory.FamilyMemberHistoryCondition.create().note(value).build().note());
    }
}
