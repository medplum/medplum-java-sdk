/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AttachmentTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Attachment(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Attachment.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Attachment x = Attachment.create().build();
        final Attachment y = Attachment.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Attachment.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Attachment.create().extension(value).build().extension());
    }

    @Test
    public void testContentType() {
        assertEquals("x", Attachment.create().contentType("x").build().contentType());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", Attachment.create().language("x").build().language());
    }

    @Test
    public void testData() {
        assertEquals("x", Attachment.create().data("x").build().data());
    }

    @Test
    public void testUrl() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, Attachment.create().url(value).build().url());
    }

    @Test
    public void testSizeValue() {
        assertEquals(1, Attachment.create().sizeValue(1).build().sizeValue());
    }

    @Test
    public void testHash() {
        assertEquals("x", Attachment.create().hash("x").build().hash());
    }

    @Test
    public void testTitle() {
        assertEquals("x", Attachment.create().title("x").build().title());
    }

    @Test
    public void testCreation() {
        final java.time.Instant value = java.time.Instant.now();
        assertEquals(value, Attachment.create().creation(value).build().creation());
    }
}
