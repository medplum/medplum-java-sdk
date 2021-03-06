/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A reference from one resource to another.
 */
public class Reference extends FhirObject {
    public static final String RESOURCE_TYPE = "Reference";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Reference(final JsonObject data) {
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
     * A reference to a location at which the other resource is found. The
     * reference may be a relative reference, in which case it is relative to
     * the service base URL, or an absolute URL that resolves to the location
     * where the resource is found. The reference may be version specific or
     * not. If the reference is not to a FHIR RESTful server, then it should
     * be assumed to be version specific. Internal fragment references (start
     * with '#') refer to contained resources.
     */
    public String reference() {
        return getString(FhirPropertyNames.PROPERTY_REFERENCE);
    }

    /**
     * The expected type of the target of the reference. If both
     * Reference.type and Reference.reference are populated and
     * Reference.reference is a FHIR URL, both SHALL be consistent.
     *
     * The type is the Canonical URL of Resource Definition that is the type
     * this reference refers to. References are URLs that are relative to
     * http://hl7.org/fhir/StructureDefinition/ e.g. &quot;Patient&quot; is a reference
     * to http://hl7.org/fhir/StructureDefinition/Patient. Absolute URLs are
     * only allowed for logical models (and can only be used in references in
     * logical models, not resources).
     */
    public java.net.URI type() {
        return getUri(FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * An identifier for the target resource. This is used when there is no
     * way to reference the other resource directly, either because the
     * entity it represents is not available through a FHIR server, or
     * because there is no way for the author of the resource to convert a
     * known identifier to an actual location. There is no requirement that a
     * Reference.identifier point to something that is actually exposed as a
     * FHIR instance, but it SHALL point to a business concept that would be
     * expected to be exposed as a FHIR instance, and that instance would
     * need to be of a FHIR resource type allowed by the reference.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Plain text narrative that identifies the resource in addition to the
     * resource reference.
     */
    public String display() {
        return getString(FhirPropertyNames.PROPERTY_DISPLAY);
    }

    /**
     * Optional Resource referred to by this reference.
     */
    public FhirResource resource() {
        return getObject(FhirResource.class, FhirPropertyNames.PROPERTY_RESOURCE);
    }

    public <T extends FhirResource> T resource(final Class<T> c) {
        return getObject(c, FhirPropertyNames.PROPERTY_RESOURCE);
    }

    public static final class Builder extends FhirObject.Builder<Reference, Reference.Builder> {

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

        public Builder reference(final String reference) {
            b.add(FhirPropertyNames.PROPERTY_REFERENCE, reference);
            return this;
        }

        public Builder type(final java.net.URI type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type.toString());
            return this;
        }

        public Builder identifier(final Identifier identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, identifier);
            return this;
        }

        public Builder display(final String display) {
            b.add(FhirPropertyNames.PROPERTY_DISPLAY, display);
            return this;
        }

        public Builder resource(final JsonObject resource) {
            b.add(FhirPropertyNames.PROPERTY_RESOURCE, resource);
            return this;
        }

        public Reference build() {
            return new Reference(b.build());
        }
    }
}
