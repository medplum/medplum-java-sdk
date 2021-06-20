/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * OAuth client application.
 */
public class ClientApplication extends FhirResource {
    public static final String RESOURCE_TYPE = "ClientApplication";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ClientApplication(final JsonObject data) {
        super(data);
    }

    /**
     * Client secret string used to verify the identity of a client.
     */
    public String secret() {
        return getString(FhirPropertyNames.PROPERTY_SECRET);
    }

    /**
     * Redirect URI used when redirecting a client back to the client
     * application.
     */
    public String redirectUri() {
        return getString(FhirPropertyNames.PROPERTY_REDIRECT_URI);
    }

    public static final class Builder extends FhirResource.Builder<ClientApplication, ClientApplication.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder secret(final String secret) {
            b.add(FhirPropertyNames.PROPERTY_SECRET, secret);
            return this;
        }

        public Builder redirectUri(final String redirectUri) {
            b.add(FhirPropertyNames.PROPERTY_REDIRECT_URI, redirectUri);
            return this;
        }

        public ClientApplication build() {
            return new ClientApplication(b.build());
        }
    }
}
