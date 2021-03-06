/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A contributor to the content of a knowledge asset, including authors,
 * editors, reviewers, and endorsers.
 */
public class Contributor extends FhirObject {
    public static final String RESOURCE_TYPE = "Contributor";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Contributor(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references).
     * This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(FhirPropertyNames.PROPERTY_ID);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the element. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, FhirPropertyNames.PROPERTY_EXTENSION);
    }

    /**
     * The type of contributor.
     */
    public String type() {
        return getString(FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * The name of the individual or organization responsible for the
     * contribution.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * contributor.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_CONTACT);
    }

    public static final class Builder extends FhirObject.Builder<Contributor, Contributor.Builder> {

        private Builder() {
            super();
        }

        private Builder(final JsonObject data) {
            super(data);
        }

        public Builder id(final String id) {
            b.add(FhirPropertyNames.PROPERTY_ID, id);
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(FhirPropertyNames.PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder type(final String type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder name(final String name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, name);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(FhirPropertyNames.PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Contributor build() {
            return new Contributor(b.build());
        }
    }
}
