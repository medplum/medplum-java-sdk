/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class AccountCoverageTest {

    @Test
    public void testConstructor() {
        assertNotNull(new Account.AccountCoverage(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(Account.AccountCoverage.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final Account.AccountCoverage x = Account.AccountCoverage.create().build();
        final Account.AccountCoverage y = Account.AccountCoverage.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", Account.AccountCoverage.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Account.AccountCoverage.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, Account.AccountCoverage.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testCoverage() {
        final Reference value = Reference.create().build();
        assertEquals(value, Account.AccountCoverage.create().coverage(value).build().coverage());
    }

    @Test
    public void testPriority() {
        assertEquals(1, Account.AccountCoverage.create().priority(1).build().priority());
    }
}
