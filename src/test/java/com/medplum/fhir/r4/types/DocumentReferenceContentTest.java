/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class DocumentReferenceContentTest {

    @Test
    public void testConstructor() {
        assertNotNull(new DocumentReference.DocumentReferenceContent(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(DocumentReference.DocumentReferenceContent.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final DocumentReference.DocumentReferenceContent x = DocumentReference.DocumentReferenceContent.create().build();
        final DocumentReference.DocumentReferenceContent y = DocumentReference.DocumentReferenceContent.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", DocumentReference.DocumentReferenceContent.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentReference.DocumentReferenceContent.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, DocumentReference.DocumentReferenceContent.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, DocumentReference.DocumentReferenceContent.create().attachment(value).build().attachment());
    }

    @Test
    public void testFormat() {
        final Coding value = Coding.create().build();
        assertEquals(value, DocumentReference.DocumentReferenceContent.create().format(value).build().format());
    }
}
