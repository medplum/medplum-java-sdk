/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * An identifier - identifies some entity uniquely and unambiguously.
 * Typically this is used for business identifiers.
 */
public class Identifier extends FhirObject {
    public static final String RESOURCE_TYPE = "Identifier";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Identifier(final JsonObject data) {
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
     * The purpose of this identifier.
     */
    public String use() {
        return getString(FhirPropertyNames.PROPERTY_USE);
    }

    /**
     * A coded type for the identifier that can be used to determine which
     * identifier to use for a specific purpose.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * Establishes the namespace for the value - that is, a URL that
     * describes a set values that are unique.
     */
    public java.net.URI system() {
        return getUri(FhirPropertyNames.PROPERTY_SYSTEM);
    }

    /**
     * The portion of the identifier typically relevant to the user and which
     * is unique within the context of the system.
     */
    public String value() {
        return getString(FhirPropertyNames.PROPERTY_VALUE);
    }

    /**
     * Time period during which identifier is/was valid for use.
     */
    public Period period() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
    }

    /**
     * Organization that issued/manages the identifier.
     */
    public Reference assigner() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ASSIGNER);
    }

    public static final class Builder extends FhirObject.Builder<Identifier, Identifier.Builder> {

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

        public Builder use(final String use) {
            b.add(FhirPropertyNames.PROPERTY_USE, use);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder system(final java.net.URI system) {
            b.add(FhirPropertyNames.PROPERTY_SYSTEM, system.toString());
            return this;
        }

        public Builder value(final String value) {
            b.add(FhirPropertyNames.PROPERTY_VALUE, value);
            return this;
        }

        public Builder period(final Period period) {
            b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
            return this;
        }

        public Builder assigner(final Reference assigner) {
            b.add(FhirPropertyNames.PROPERTY_ASSIGNER, assigner);
            return this;
        }

        public Identifier build() {
            return new Identifier(b.build());
        }
    }
}
