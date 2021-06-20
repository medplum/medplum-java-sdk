/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * The interactions of the medicinal product with other medicinal
 * products, or other forms of interactions.
 */
public class MedicinalProductInteraction extends DomainResource {
    public static final String RESOURCE_TYPE = "MedicinalProductInteraction";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicinalProductInteraction(final JsonObject data) {
        super(data);
    }

    /**
     * The medication for which this is a described interaction.
     */
    public java.util.List<Reference> subject() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The interaction described.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * The specific medication, food or laboratory test that interacts.
     */
    public java.util.List<MedicinalProductInteractionInteractant> interactant() {
        return getList(MedicinalProductInteractionInteractant.class, FhirPropertyNames.PROPERTY_INTERACTANT);
    }

    /**
     * The type of the interaction e.g. drug-drug interaction, drug-food
     * interaction, drug-lab test interaction.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * The effect of the interaction, for example &quot;reduced gastric absorption
     * of primary medication&quot;.
     */
    public CodeableConcept effect() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_EFFECT);
    }

    /**
     * The incidence of the interaction, e.g. theoretical, observed.
     */
    public CodeableConcept incidence() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_INCIDENCE);
    }

    /**
     * Actions for managing the interaction.
     */
    public CodeableConcept management() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_MANAGEMENT);
    }

    public static final class Builder extends DomainResource.Builder<MedicinalProductInteraction, MedicinalProductInteraction.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder subject(final java.util.List<Reference> subject) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT, FhirObject.toArray(subject));
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder interactant(final java.util.List<MedicinalProductInteractionInteractant> interactant) {
            b.add(FhirPropertyNames.PROPERTY_INTERACTANT, FhirObject.toArray(interactant));
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder effect(final CodeableConcept effect) {
            b.add(FhirPropertyNames.PROPERTY_EFFECT, effect);
            return this;
        }

        public Builder incidence(final CodeableConcept incidence) {
            b.add(FhirPropertyNames.PROPERTY_INCIDENCE, incidence);
            return this;
        }

        public Builder management(final CodeableConcept management) {
            b.add(FhirPropertyNames.PROPERTY_MANAGEMENT, management);
            return this;
        }

        public MedicinalProductInteraction build() {
            return new MedicinalProductInteraction(b.build());
        }
    }

    /**
     * The interactions of the medicinal product with other medicinal
     * products, or other forms of interactions.
     */
    public static class MedicinalProductInteractionInteractant extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductInteractionInteractant";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductInteractionInteractant(final JsonObject data) {
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
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * The specific medication, food or laboratory test that interacts.
         */
        public Reference itemReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ITEM_REFERENCE);
        }

        /**
         * The specific medication, food or laboratory test that interacts.
         */
        public CodeableConcept itemCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ITEM_CODEABLE_CONCEPT);
        }

        public static final class Builder extends FhirObject.Builder<MedicinalProductInteractionInteractant, MedicinalProductInteractionInteractant.Builder> {

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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(FhirPropertyNames.PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder itemReference(final Reference itemReference) {
                b.add(FhirPropertyNames.PROPERTY_ITEM_REFERENCE, itemReference);
                return this;
            }

            public Builder itemCodeableConcept(final CodeableConcept itemCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_ITEM_CODEABLE_CONCEPT, itemCodeableConcept);
                return this;
            }

            public MedicinalProductInteractionInteractant build() {
                return new MedicinalProductInteractionInteractant(b.build());
            }
        }
    }
}
