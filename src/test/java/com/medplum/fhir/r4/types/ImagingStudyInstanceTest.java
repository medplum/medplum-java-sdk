/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ImagingStudyInstanceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ImagingStudy.ImagingStudyInstance(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ImagingStudy.ImagingStudyInstance.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ImagingStudy.ImagingStudyInstance x = ImagingStudy.ImagingStudyInstance.create().build();
        final ImagingStudy.ImagingStudyInstance y = ImagingStudy.ImagingStudyInstance.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ImagingStudy.ImagingStudyInstance.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImagingStudy.ImagingStudyInstance.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, ImagingStudy.ImagingStudyInstance.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testUid() {
        assertEquals("x", ImagingStudy.ImagingStudyInstance.create().uid("x").build().uid());
    }

    @Test
    public void testSopClass() {
        final Coding value = Coding.create().build();
        assertEquals(value, ImagingStudy.ImagingStudyInstance.create().sopClass(value).build().sopClass());
    }

    @Test
    public void testNumber() {
        assertEquals(1, ImagingStudy.ImagingStudyInstance.create().number(1).build().number());
    }

    @Test
    public void testTitle() {
        assertEquals("x", ImagingStudy.ImagingStudyInstance.create().title("x").build().title());
    }
}
