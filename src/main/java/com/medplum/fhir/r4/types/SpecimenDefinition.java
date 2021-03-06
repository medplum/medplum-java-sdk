/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A kind of specimen with associated set of requirements.
 */
public class SpecimenDefinition extends DomainResource {
    public static final String RESOURCE_TYPE = "SpecimenDefinition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SpecimenDefinition(final JsonObject data) {
        super(data);
    }

    /**
     * A business identifier associated with the kind of specimen.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The kind of material to be collected.
     */
    public CodeableConcept typeCollected() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE_COLLECTED);
    }

    /**
     * Preparation of the patient for specimen collection.
     */
    public java.util.List<CodeableConcept> patientPreparation() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_PATIENT_PREPARATION);
    }

    /**
     * Time aspect of specimen collection (duration or offset).
     */
    public String timeAspect() {
        return getString(FhirPropertyNames.PROPERTY_TIME_ASPECT);
    }

    /**
     * The action to be performed for collecting the specimen.
     */
    public java.util.List<CodeableConcept> collection() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_COLLECTION);
    }

    /**
     * Specimen conditioned in a container as expected by the testing
     * laboratory.
     */
    public java.util.List<SpecimenDefinitionTypeTested> typeTested() {
        return getList(SpecimenDefinitionTypeTested.class, FhirPropertyNames.PROPERTY_TYPE_TESTED);
    }

    public static final class Builder extends DomainResource.Builder<SpecimenDefinition, SpecimenDefinition.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder identifier(final Identifier identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, identifier);
            return this;
        }

        public Builder typeCollected(final CodeableConcept typeCollected) {
            b.add(FhirPropertyNames.PROPERTY_TYPE_COLLECTED, typeCollected);
            return this;
        }

        public Builder patientPreparation(final java.util.List<CodeableConcept> patientPreparation) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT_PREPARATION, FhirObject.toArray(patientPreparation));
            return this;
        }

        public Builder timeAspect(final String timeAspect) {
            b.add(FhirPropertyNames.PROPERTY_TIME_ASPECT, timeAspect);
            return this;
        }

        public Builder collection(final java.util.List<CodeableConcept> collection) {
            b.add(FhirPropertyNames.PROPERTY_COLLECTION, FhirObject.toArray(collection));
            return this;
        }

        public Builder typeTested(final java.util.List<SpecimenDefinitionTypeTested> typeTested) {
            b.add(FhirPropertyNames.PROPERTY_TYPE_TESTED, FhirObject.toArray(typeTested));
            return this;
        }

        public SpecimenDefinition build() {
            return new SpecimenDefinition(b.build());
        }
    }

    /**
     * A kind of specimen with associated set of requirements.
     */
    public static class SpecimenDefinitionAdditive extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenDefinitionAdditive";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenDefinitionAdditive(final JsonObject data) {
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
         * Substance introduced in the kind of container to preserve, maintain or
         * enhance the specimen. Examples: Formalin, Citrate, EDTA.
         */
        public CodeableConcept additiveCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ADDITIVE_CODEABLE_CONCEPT);
        }

        /**
         * Substance introduced in the kind of container to preserve, maintain or
         * enhance the specimen. Examples: Formalin, Citrate, EDTA.
         */
        public Reference additiveReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ADDITIVE_REFERENCE);
        }

        public static final class Builder extends FhirObject.Builder<SpecimenDefinitionAdditive, SpecimenDefinitionAdditive.Builder> {

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

            public Builder additiveCodeableConcept(final CodeableConcept additiveCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_ADDITIVE_CODEABLE_CONCEPT, additiveCodeableConcept);
                return this;
            }

            public Builder additiveReference(final Reference additiveReference) {
                b.add(FhirPropertyNames.PROPERTY_ADDITIVE_REFERENCE, additiveReference);
                return this;
            }

            public SpecimenDefinitionAdditive build() {
                return new SpecimenDefinitionAdditive(b.build());
            }
        }
    }

    /**
     * A kind of specimen with associated set of requirements.
     */
    public static class SpecimenDefinitionContainer extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenDefinitionContainer";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenDefinitionContainer(final JsonObject data) {
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
         * The type of material of the container.
         */
        public CodeableConcept material() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_MATERIAL);
        }

        /**
         * The type of container used to contain this kind of specimen.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * Color of container cap.
         */
        public CodeableConcept cap() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CAP);
        }

        /**
         * The textual description of the kind of container.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * The capacity (volume or other measure) of this kind of container.
         */
        public Quantity capacity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_CAPACITY);
        }

        /**
         * The minimum volume to be conditioned in the container.
         */
        public Quantity minimumVolumeQuantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_MINIMUM_VOLUME_QUANTITY);
        }

        /**
         * The minimum volume to be conditioned in the container.
         */
        public String minimumVolumeString() {
            return getString(FhirPropertyNames.PROPERTY_MINIMUM_VOLUME_STRING);
        }

        /**
         * Substance introduced in the kind of container to preserve, maintain or
         * enhance the specimen. Examples: Formalin, Citrate, EDTA.
         */
        public java.util.List<SpecimenDefinitionAdditive> additive() {
            return getList(SpecimenDefinitionAdditive.class, FhirPropertyNames.PROPERTY_ADDITIVE);
        }

        /**
         * Special processing that should be applied to the container for this
         * kind of specimen.
         */
        public String preparation() {
            return getString(FhirPropertyNames.PROPERTY_PREPARATION);
        }

        public static final class Builder extends FhirObject.Builder<SpecimenDefinitionContainer, SpecimenDefinitionContainer.Builder> {

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

            public Builder material(final CodeableConcept material) {
                b.add(FhirPropertyNames.PROPERTY_MATERIAL, material);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder cap(final CodeableConcept cap) {
                b.add(FhirPropertyNames.PROPERTY_CAP, cap);
                return this;
            }

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder capacity(final Quantity capacity) {
                b.add(FhirPropertyNames.PROPERTY_CAPACITY, capacity);
                return this;
            }

            public Builder minimumVolumeQuantity(final Quantity minimumVolumeQuantity) {
                b.add(FhirPropertyNames.PROPERTY_MINIMUM_VOLUME_QUANTITY, minimumVolumeQuantity);
                return this;
            }

            public Builder minimumVolumeString(final String minimumVolumeString) {
                b.add(FhirPropertyNames.PROPERTY_MINIMUM_VOLUME_STRING, minimumVolumeString);
                return this;
            }

            public Builder additive(final java.util.List<SpecimenDefinitionAdditive> additive) {
                b.add(FhirPropertyNames.PROPERTY_ADDITIVE, FhirObject.toArray(additive));
                return this;
            }

            public Builder preparation(final String preparation) {
                b.add(FhirPropertyNames.PROPERTY_PREPARATION, preparation);
                return this;
            }

            public SpecimenDefinitionContainer build() {
                return new SpecimenDefinitionContainer(b.build());
            }
        }
    }

    /**
     * A kind of specimen with associated set of requirements.
     */
    public static class SpecimenDefinitionHandling extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenDefinitionHandling";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenDefinitionHandling(final JsonObject data) {
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
         * It qualifies the interval of temperature, which characterizes an
         * occurrence of handling. Conditions that are not related to temperature
         * may be handled in the instruction element.
         */
        public CodeableConcept temperatureQualifier() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TEMPERATURE_QUALIFIER);
        }

        /**
         * The temperature interval for this set of handling instructions.
         */
        public Range temperatureRange() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_TEMPERATURE_RANGE);
        }

        /**
         * The maximum time interval of preservation of the specimen with these
         * conditions.
         */
        public Duration maxDuration() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_MAX_DURATION);
        }

        /**
         * Additional textual instructions for the preservation or transport of
         * the specimen. For instance, 'Protect from light exposure'.
         */
        public String instruction() {
            return getString(FhirPropertyNames.PROPERTY_INSTRUCTION);
        }

        public static final class Builder extends FhirObject.Builder<SpecimenDefinitionHandling, SpecimenDefinitionHandling.Builder> {

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

            public Builder temperatureQualifier(final CodeableConcept temperatureQualifier) {
                b.add(FhirPropertyNames.PROPERTY_TEMPERATURE_QUALIFIER, temperatureQualifier);
                return this;
            }

            public Builder temperatureRange(final Range temperatureRange) {
                b.add(FhirPropertyNames.PROPERTY_TEMPERATURE_RANGE, temperatureRange);
                return this;
            }

            public Builder maxDuration(final Duration maxDuration) {
                b.add(FhirPropertyNames.PROPERTY_MAX_DURATION, maxDuration);
                return this;
            }

            public Builder instruction(final String instruction) {
                b.add(FhirPropertyNames.PROPERTY_INSTRUCTION, instruction);
                return this;
            }

            public SpecimenDefinitionHandling build() {
                return new SpecimenDefinitionHandling(b.build());
            }
        }
    }

    /**
     * A kind of specimen with associated set of requirements.
     */
    public static class SpecimenDefinitionTypeTested extends FhirObject {
        public static final String RESOURCE_TYPE = "SpecimenDefinitionTypeTested";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SpecimenDefinitionTypeTested(final JsonObject data) {
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
         * Primary of secondary specimen.
         */
        public Boolean isDerived() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_IS_DERIVED);
        }

        /**
         * The kind of specimen conditioned for testing expected by lab.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * The preference for this type of conditioned specimen.
         */
        public String preference() {
            return getString(FhirPropertyNames.PROPERTY_PREFERENCE);
        }

        /**
         * The specimen's container.
         */
        public SpecimenDefinitionContainer container() {
            return getObject(SpecimenDefinitionContainer.class, FhirPropertyNames.PROPERTY_CONTAINER);
        }

        /**
         * Requirements for delivery and special handling of this kind of
         * conditioned specimen.
         */
        public String requirement() {
            return getString(FhirPropertyNames.PROPERTY_REQUIREMENT);
        }

        /**
         * The usual time that a specimen of this kind is retained after the
         * ordered tests are completed, for the purpose of additional testing.
         */
        public Duration retentionTime() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_RETENTION_TIME);
        }

        /**
         * Criterion for rejection of the specimen in its container by the
         * laboratory.
         */
        public java.util.List<CodeableConcept> rejectionCriterion() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REJECTION_CRITERION);
        }

        /**
         * Set of instructions for preservation/transport of the specimen at a
         * defined temperature interval, prior the testing process.
         */
        public java.util.List<SpecimenDefinitionHandling> handling() {
            return getList(SpecimenDefinitionHandling.class, FhirPropertyNames.PROPERTY_HANDLING);
        }

        public static final class Builder extends FhirObject.Builder<SpecimenDefinitionTypeTested, SpecimenDefinitionTypeTested.Builder> {

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

            public Builder isDerived(final Boolean isDerived) {
                b.add(FhirPropertyNames.PROPERTY_IS_DERIVED, isDerived);
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder preference(final String preference) {
                b.add(FhirPropertyNames.PROPERTY_PREFERENCE, preference);
                return this;
            }

            public Builder container(final SpecimenDefinitionContainer container) {
                b.add(FhirPropertyNames.PROPERTY_CONTAINER, container);
                return this;
            }

            public Builder requirement(final String requirement) {
                b.add(FhirPropertyNames.PROPERTY_REQUIREMENT, requirement);
                return this;
            }

            public Builder retentionTime(final Duration retentionTime) {
                b.add(FhirPropertyNames.PROPERTY_RETENTION_TIME, retentionTime);
                return this;
            }

            public Builder rejectionCriterion(final java.util.List<CodeableConcept> rejectionCriterion) {
                b.add(FhirPropertyNames.PROPERTY_REJECTION_CRITERION, FhirObject.toArray(rejectionCriterion));
                return this;
            }

            public Builder handling(final java.util.List<SpecimenDefinitionHandling> handling) {
                b.add(FhirPropertyNames.PROPERTY_HANDLING, FhirObject.toArray(handling));
                return this;
            }

            public SpecimenDefinitionTypeTested build() {
                return new SpecimenDefinitionTypeTested(b.build());
            }
        }
    }
}
