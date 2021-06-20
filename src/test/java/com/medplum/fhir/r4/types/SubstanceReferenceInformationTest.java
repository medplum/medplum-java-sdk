/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class SubstanceReferenceInformationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new SubstanceReferenceInformation(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(SubstanceReferenceInformation.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final SubstanceReferenceInformation x = SubstanceReferenceInformation.create().build();
        final SubstanceReferenceInformation y = SubstanceReferenceInformation.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", SubstanceReferenceInformation.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, SubstanceReferenceInformation.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, SubstanceReferenceInformation.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", SubstanceReferenceInformation.create().language("x").build().language());
    }

    @Test
    public void testText() {
        final Narrative value = Narrative.create().build();
        assertEquals(value, SubstanceReferenceInformation.create().text(value).build().text());
    }

    @Test
    public void testContained() {
        final java.util.List<FhirResource> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.create().contained(value).build().contained());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testComment() {
        assertEquals("x", SubstanceReferenceInformation.create().comment("x").build().comment());
    }

    @Test
    public void testGene() {
        final java.util.List<SubstanceReferenceInformation.SubstanceReferenceInformationGene> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.create().gene(value).build().gene());
    }

    @Test
    public void testGeneElement() {
        final java.util.List<SubstanceReferenceInformation.SubstanceReferenceInformationGeneElement> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.create().geneElement(value).build().geneElement());
    }

    @Test
    public void testClassification() {
        final java.util.List<SubstanceReferenceInformation.SubstanceReferenceInformationClassification> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.create().classification(value).build().classification());
    }

    @Test
    public void testTarget() {
        final java.util.List<SubstanceReferenceInformation.SubstanceReferenceInformationTarget> value = java.util.Collections.emptyList();
        assertEquals(value, SubstanceReferenceInformation.create().target(value).build().target());
    }
}
