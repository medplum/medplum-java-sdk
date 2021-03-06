/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class ClientApplicationTest {

    @Test
    public void testConstructor() {
        assertNotNull(new ClientApplication(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(ClientApplication.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final ClientApplication x = ClientApplication.create().build();
        final ClientApplication y = ClientApplication.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", ClientApplication.create().id("x").build().id());
    }

    @Test
    public void testMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, ClientApplication.create().meta(value).build().meta());
    }

    @Test
    public void testImplicitRules() {
        final java.net.URI value = java.net.URI.create("https://www.example.com");
        assertEquals(value, ClientApplication.create().implicitRules(value).build().implicitRules());
    }

    @Test
    public void testLanguage() {
        assertEquals("x", ClientApplication.create().language("x").build().language());
    }

    @Test
    public void testSecret() {
        assertEquals("x", ClientApplication.create().secret("x").build().secret());
    }

    @Test
    public void testRedirectUri() {
        assertEquals("x", ClientApplication.create().redirectUri("x").build().redirectUri());
    }
}
