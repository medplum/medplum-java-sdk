/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class TimingRepeatTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Timing.TimingRepeat(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Timing.TimingRepeat.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Timing.TimingRepeat x = Timing.TimingRepeat.create().build();
        final Timing.TimingRepeat y = Timing.TimingRepeat.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Timing.TimingRepeat.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Timing.TimingRepeat.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Timing.TimingRepeat.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testBoundsDuration() {
        final Duration value = Duration.create().build();
        assertEquals(value, Timing.TimingRepeat.create().boundsDuration(value).build().boundsDuration());
    }

    @Test
    public void testBoundsRange() {
        final Range value = Range.create().build();
        assertEquals(value, Timing.TimingRepeat.create().boundsRange(value).build().boundsRange());
    }

    @Test
    public void testBoundsPeriod() {
        final Period value = Period.create().build();
        assertEquals(value, Timing.TimingRepeat.create().boundsPeriod(value).build().boundsPeriod());
    }

    @Test
    public void testCount() {
        assertEquals(1, Timing.TimingRepeat.create().count(1).build().count());
    }

    @Test
    public void testCountMax() {
        assertEquals(1, Timing.TimingRepeat.create().countMax(1).build().countMax());
    }

    @Test
    public void testDuration() {
        assertEquals(1.0, Timing.TimingRepeat.create().duration(1.0).build().duration());
    }

    @Test
    public void testDurationMax() {
        assertEquals(1.0, Timing.TimingRepeat.create().durationMax(1.0).build().durationMax());
    }

    @Test
    public void testDurationUnit() {
        assertEquals("x", Timing.TimingRepeat.create().durationUnit("x").build().durationUnit());
    }

    @Test
    public void testFrequency() {
        assertEquals(1, Timing.TimingRepeat.create().frequency(1).build().frequency());
    }

    @Test
    public void testFrequencyMax() {
        assertEquals(1, Timing.TimingRepeat.create().frequencyMax(1).build().frequencyMax());
    }

    @Test
    public void testPeriod() {
        assertEquals(1.0, Timing.TimingRepeat.create().period(1.0).build().period());
    }

    @Test
    public void testPeriodMax() {
        assertEquals(1.0, Timing.TimingRepeat.create().periodMax(1.0).build().periodMax());
    }

    @Test
    public void testPeriodUnit() {
        assertEquals("x", Timing.TimingRepeat.create().periodUnit("x").build().periodUnit());
    }

    @Test
    public void testDayOfWeek() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Timing.TimingRepeat.create().dayOfWeek(value).build().dayOfWeek());
    }

    @Test
    public void testTimeOfDay() {
        final java.util.List<java.time.Instant> value = java.util.Collections.emptyList();
        assertEquals(value, Timing.TimingRepeat.create().timeOfDay(value).build().timeOfDay());
    }

    @Test
    public void testWhen() {
        final java.util.List<String> value = java.util.Collections.emptyList();
        assertEquals(value, Timing.TimingRepeat.create().when(value).build().when());
    }

    @Test
    public void testOffset() {
        assertEquals(1, Timing.TimingRepeat.create().offset(1).build().offset());
    }
}
