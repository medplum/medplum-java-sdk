/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Actual or  potential/avoided event causing unintended physical injury
 * resulting from or contributed to by medical care, a research study or
 * other healthcare setting factors that requires additional monitoring,
 * treatment, or hospitalization, or that results in death.
 */
public class AdverseEvent extends DomainResource {
    public static final String RESOURCE_TYPE = "AdverseEvent";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public AdverseEvent(final JsonObject data) {
        super(data);
    }

    /**
     * Business identifiers assigned to this adverse event by the performer
     * or other systems which remain constant as the resource is updated and
     * propagates from server to server.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Whether the event actually happened, or just had the potential to.
     * Note that this is independent of whether anyone was affected or harmed
     * or how severely.
     */
    public String actuality() {
        return getString(FhirPropertyNames.PROPERTY_ACTUALITY);
    }

    /**
     * The overall type of event, intended for search and filtering purposes.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * This element defines the specific type of event that occurred or that
     * was prevented from occurring.
     */
    public CodeableConcept event() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_EVENT);
    }

    /**
     * This subject or group impacted by the event.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The Encounter during which AdverseEvent was created or to which the
     * creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * The date (and perhaps time) when the adverse event occurred.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * Estimated or actual date the AdverseEvent began, in the opinion of the
     * reporter.
     */
    public java.time.Instant detected() {
        return getInstant(FhirPropertyNames.PROPERTY_DETECTED);
    }

    /**
     * The date on which the existence of the AdverseEvent was first
     * recorded.
     */
    public java.time.Instant recordedDate() {
        return getInstant(FhirPropertyNames.PROPERTY_RECORDED_DATE);
    }

    /**
     * Includes information about the reaction that occurred as a result of
     * exposure to a substance (for example, a drug or a chemical).
     */
    public java.util.List<Reference> resultingCondition() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_RESULTING_CONDITION);
    }

    /**
     * The information about where the adverse event occurred.
     */
    public Reference location() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_LOCATION);
    }

    /**
     * Assessment whether this event was of real importance.
     */
    public CodeableConcept seriousness() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SERIOUSNESS);
    }

    /**
     * Describes the severity of the adverse event, in relation to the
     * subject. Contrast to AdverseEvent.seriousness - a severe rash might
     * not be serious, but a mild heart problem is.
     */
    public CodeableConcept severity() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SEVERITY);
    }

    /**
     * Describes the type of outcome from the adverse event.
     */
    public CodeableConcept outcome() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_OUTCOME);
    }

    /**
     * Information on who recorded the adverse event.  May be the patient or
     * a practitioner.
     */
    public Reference recorder() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_RECORDER);
    }

    /**
     * Parties that may or should contribute or have contributed information
     * to the adverse event, which can consist of one or more activities.
     * Such information includes information leading to the decision to
     * perform the activity and how to perform the activity (e.g.
     * consultant), information that the activity itself seeks to reveal
     * (e.g. informant of clinical history), or information about what
     * activity was performed (e.g. informant witness).
     */
    public java.util.List<Reference> contributor() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_CONTRIBUTOR);
    }

    /**
     * Describes the entity that is suspected to have caused the adverse
     * event.
     */
    public java.util.List<AdverseEventSuspectEntity> suspectEntity() {
        return getList(AdverseEventSuspectEntity.class, FhirPropertyNames.PROPERTY_SUSPECT_ENTITY);
    }

    /**
     * AdverseEvent.subjectMedicalHistory.
     */
    public java.util.List<Reference> subjectMedicalHistory() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT_MEDICAL_HISTORY);
    }

    /**
     * AdverseEvent.referenceDocument.
     */
    public java.util.List<Reference> referenceDocument() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REFERENCE_DOCUMENT);
    }

    /**
     * AdverseEvent.study.
     */
    public java.util.List<Reference> study() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_STUDY);
    }

    public static final class Builder extends DomainResource.Builder<AdverseEvent, AdverseEvent.Builder> {

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

        public Builder actuality(final String actuality) {
            b.add(FhirPropertyNames.PROPERTY_ACTUALITY, actuality);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder event(final CodeableConcept event) {
            b.add(FhirPropertyNames.PROPERTY_EVENT, event);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(FhirPropertyNames.PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(FhirPropertyNames.PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder detected(final java.time.Instant detected) {
            b.add(FhirPropertyNames.PROPERTY_DETECTED, detected.toString());
            return this;
        }

        public Builder recordedDate(final java.time.Instant recordedDate) {
            b.add(FhirPropertyNames.PROPERTY_RECORDED_DATE, recordedDate.toString());
            return this;
        }

        public Builder resultingCondition(final java.util.List<Reference> resultingCondition) {
            b.add(FhirPropertyNames.PROPERTY_RESULTING_CONDITION, FhirObject.toArray(resultingCondition));
            return this;
        }

        public Builder location(final Reference location) {
            b.add(FhirPropertyNames.PROPERTY_LOCATION, location);
            return this;
        }

        public Builder seriousness(final CodeableConcept seriousness) {
            b.add(FhirPropertyNames.PROPERTY_SERIOUSNESS, seriousness);
            return this;
        }

        public Builder severity(final CodeableConcept severity) {
            b.add(FhirPropertyNames.PROPERTY_SEVERITY, severity);
            return this;
        }

        public Builder outcome(final CodeableConcept outcome) {
            b.add(FhirPropertyNames.PROPERTY_OUTCOME, outcome);
            return this;
        }

        public Builder recorder(final Reference recorder) {
            b.add(FhirPropertyNames.PROPERTY_RECORDER, recorder);
            return this;
        }

        public Builder contributor(final java.util.List<Reference> contributor) {
            b.add(FhirPropertyNames.PROPERTY_CONTRIBUTOR, FhirObject.toArray(contributor));
            return this;
        }

        public Builder suspectEntity(final java.util.List<AdverseEventSuspectEntity> suspectEntity) {
            b.add(FhirPropertyNames.PROPERTY_SUSPECT_ENTITY, FhirObject.toArray(suspectEntity));
            return this;
        }

        public Builder subjectMedicalHistory(final java.util.List<Reference> subjectMedicalHistory) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT_MEDICAL_HISTORY, FhirObject.toArray(subjectMedicalHistory));
            return this;
        }

        public Builder referenceDocument(final java.util.List<Reference> referenceDocument) {
            b.add(FhirPropertyNames.PROPERTY_REFERENCE_DOCUMENT, FhirObject.toArray(referenceDocument));
            return this;
        }

        public Builder study(final java.util.List<Reference> study) {
            b.add(FhirPropertyNames.PROPERTY_STUDY, FhirObject.toArray(study));
            return this;
        }

        public AdverseEvent build() {
            return new AdverseEvent(b.build());
        }
    }

    /**
     * Actual or  potential/avoided event causing unintended physical injury
     * resulting from or contributed to by medical care, a research study or
     * other healthcare setting factors that requires additional monitoring,
     * treatment, or hospitalization, or that results in death.
     */
    public static class AdverseEventCausality extends FhirObject {
        public static final String RESOURCE_TYPE = "AdverseEventCausality";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AdverseEventCausality(final JsonObject data) {
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
         * Assessment of if the entity caused the event.
         */
        public CodeableConcept assessment() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ASSESSMENT);
        }

        /**
         * AdverseEvent.suspectEntity.causalityProductRelatedness.
         */
        public String productRelatedness() {
            return getString(FhirPropertyNames.PROPERTY_PRODUCT_RELATEDNESS);
        }

        /**
         * AdverseEvent.suspectEntity.causalityAuthor.
         */
        public Reference author() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_AUTHOR);
        }

        /**
         * ProbabilityScale | Bayesian | Checklist.
         */
        public CodeableConcept method() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_METHOD);
        }

        public static final class Builder extends FhirObject.Builder<AdverseEventCausality, AdverseEventCausality.Builder> {

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

            public Builder assessment(final CodeableConcept assessment) {
                b.add(FhirPropertyNames.PROPERTY_ASSESSMENT, assessment);
                return this;
            }

            public Builder productRelatedness(final String productRelatedness) {
                b.add(FhirPropertyNames.PROPERTY_PRODUCT_RELATEDNESS, productRelatedness);
                return this;
            }

            public Builder author(final Reference author) {
                b.add(FhirPropertyNames.PROPERTY_AUTHOR, author);
                return this;
            }

            public Builder method(final CodeableConcept method) {
                b.add(FhirPropertyNames.PROPERTY_METHOD, method);
                return this;
            }

            public AdverseEventCausality build() {
                return new AdverseEventCausality(b.build());
            }
        }
    }

    /**
     * Actual or  potential/avoided event causing unintended physical injury
     * resulting from or contributed to by medical care, a research study or
     * other healthcare setting factors that requires additional monitoring,
     * treatment, or hospitalization, or that results in death.
     */
    public static class AdverseEventSuspectEntity extends FhirObject {
        public static final String RESOURCE_TYPE = "AdverseEventSuspectEntity";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public AdverseEventSuspectEntity(final JsonObject data) {
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
         * Identifies the actual instance of what caused the adverse event.  May
         * be a substance, medication, medication administration, medication
         * statement or a device.
         */
        public Reference instance() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_INSTANCE);
        }

        /**
         * Information on the possible cause of the event.
         */
        public java.util.List<AdverseEventCausality> causality() {
            return getList(AdverseEventCausality.class, FhirPropertyNames.PROPERTY_CAUSALITY);
        }

        public static final class Builder extends FhirObject.Builder<AdverseEventSuspectEntity, AdverseEventSuspectEntity.Builder> {

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

            public Builder instance(final Reference instance) {
                b.add(FhirPropertyNames.PROPERTY_INSTANCE, instance);
                return this;
            }

            public Builder causality(final java.util.List<AdverseEventCausality> causality) {
                b.add(FhirPropertyNames.PROPERTY_CAUSALITY, FhirObject.toArray(causality));
                return this;
            }

            public AdverseEventSuspectEntity build() {
                return new AdverseEventSuspectEntity(b.build());
            }
        }
    }
}
