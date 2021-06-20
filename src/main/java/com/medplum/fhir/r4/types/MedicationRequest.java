/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * An order or request for both supply of the medication and the
 * instructions for administration of the medication to a patient. The
 * resource is called &quot;MedicationRequest&quot; rather than
 * &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use
 * across inpatient and outpatient settings, including care plans, etc.,
 * and to harmonize with workflow patterns.
 */
public class MedicationRequest extends DomainResource {
    public static final String RESOURCE_TYPE = "MedicationRequest";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicationRequest(final JsonObject data) {
        super(data);
    }

    /**
     * Identifiers associated with this medication request that are defined
     * by business processes and/or used to refer to it when a direct URL
     * reference to the resource itself is not appropriate. They are business
     * identifiers assigned to this resource by the performer or other
     * systems and remain constant as the resource is updated and propagates
     * from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * A code specifying the current state of the order.  Generally, this
     * will be active or completed state.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Captures the reason for the current state of the MedicationRequest.
     */
    public CodeableConcept statusReason() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_STATUS_REASON);
    }

    /**
     * Whether the request is a proposal, plan, or an original order.
     */
    public String intent() {
        return getString(FhirPropertyNames.PROPERTY_INTENT);
    }

    /**
     * Indicates the type of medication request (for example, where the
     * medication is expected to be consumed or administered (i.e. inpatient
     * or outpatient)).
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * Indicates how quickly the Medication Request should be addressed with
     * respect to other requests.
     */
    public String priority() {
        return getString(FhirPropertyNames.PROPERTY_PRIORITY);
    }

    /**
     * If true indicates that the provider is asking for the medication
     * request not to occur.
     */
    public Boolean doNotPerform() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_DO_NOT_PERFORM);
    }

    /**
     * Indicates if this record was captured as a secondary 'reported' record
     * rather than as an original primary source-of-truth record.  It may
     * also indicate the source of the report.
     */
    public Boolean reportedBoolean() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_REPORTED_BOOLEAN);
    }

    /**
     * Indicates if this record was captured as a secondary 'reported' record
     * rather than as an original primary source-of-truth record.  It may
     * also indicate the source of the report.
     */
    public Reference reportedReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REPORTED_REFERENCE);
    }

    /**
     * Identifies the medication being requested. This is a link to a
     * resource that represents the medication which may be the details of
     * the medication or simply an attribute carrying a code that identifies
     * the medication from a known list of medications.
     */
    public CodeableConcept medicationCodeableConcept() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_MEDICATION_CODEABLE_CONCEPT);
    }

    /**
     * Identifies the medication being requested. This is a link to a
     * resource that represents the medication which may be the details of
     * the medication or simply an attribute carrying a code that identifies
     * the medication from a known list of medications.
     */
    public Reference medicationReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_MEDICATION_REFERENCE);
    }

    /**
     * A link to a resource representing the person or set of individuals to
     * whom the medication will be given.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The Encounter during which this [x] was created or to which the
     * creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * Include additional information (for example, patient height and
     * weight) that supports the ordering of the medication.
     */
    public java.util.List<Reference> supportingInformation() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_SUPPORTING_INFORMATION);
    }

    /**
     * The date (and perhaps time) when the prescription was initially
     * written or authored on.
     */
    public java.time.Instant authoredOn() {
        return getInstant(FhirPropertyNames.PROPERTY_AUTHORED_ON);
    }

    /**
     * The individual, organization, or device that initiated the request and
     * has responsibility for its activation.
     */
    public Reference requester() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REQUESTER);
    }

    /**
     * The specified desired performer of the medication treatment (e.g. the
     * performer of the medication administration).
     */
    public Reference performer() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PERFORMER);
    }

    /**
     * Indicates the type of performer of the administration of the
     * medication.
     */
    public CodeableConcept performerType() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PERFORMER_TYPE);
    }

    /**
     * The person who entered the order on behalf of another individual for
     * example in the case of a verbal or a telephone order.
     */
    public Reference recorder() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_RECORDER);
    }

    /**
     * The reason or the indication for ordering or not ordering the
     * medication.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON_CODE);
    }

    /**
     * Condition or observation that supports why the medication was ordered.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REASON_REFERENCE);
    }

    /**
     * The URL pointing to a protocol, guideline, orderset, or other
     * definition that is adhered to in whole or in part by this
     * MedicationRequest.
     */
    public java.util.List<String> instantiatesCanonical() {
        return getList(String.class, FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL);
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline,
     * orderset or other definition that is adhered to in whole or in part by
     * this MedicationRequest.
     */
    public java.util.List<java.net.URI> instantiatesUri() {
        return getList(java.net.URI.class, FhirPropertyNames.PROPERTY_INSTANTIATES_URI);
    }

    /**
     * A plan or request that is fulfilled in whole or in part by this
     * medication request.
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_BASED_ON);
    }

    /**
     * A shared identifier common to all requests that were authorized more
     * or less simultaneously by a single author, representing the identifier
     * of the requisition or prescription.
     */
    public Identifier groupIdentifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_GROUP_IDENTIFIER);
    }

    /**
     * The description of the overall patte3rn of the administration of the
     * medication to the patient.
     */
    public CodeableConcept courseOfTherapyType() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_COURSE_OF_THERAPY_TYPE);
    }

    /**
     * Insurance plans, coverage extensions, pre-authorizations and/or
     * pre-determinations that may be required for delivering the requested
     * service.
     */
    public java.util.List<Reference> insurance() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_INSURANCE);
    }

    /**
     * Extra information about the prescription that could not be conveyed by
     * the other attributes.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    /**
     * Indicates how the medication is to be used by the patient.
     */
    public java.util.List<Dosage> dosageInstruction() {
        return getList(Dosage.class, FhirPropertyNames.PROPERTY_DOSAGE_INSTRUCTION);
    }

    /**
     * Indicates the specific details for the dispense or medication supply
     * part of a medication request (also known as a Medication Prescription
     * or Medication Order).  Note that this information is not always sent
     * with the order.  There may be in some settings (e.g. hospitals)
     * institutional or system support for completing the dispense details in
     * the pharmacy department.
     */
    public MedicationRequestDispenseRequest dispenseRequest() {
        return getObject(MedicationRequestDispenseRequest.class, FhirPropertyNames.PROPERTY_DISPENSE_REQUEST);
    }

    /**
     * Indicates whether or not substitution can or should be part of the
     * dispense. In some cases, substitution must happen, in other cases
     * substitution must not happen. This block explains the prescriber's
     * intent. If nothing is specified substitution may be done.
     */
    public MedicationRequestSubstitution substitution() {
        return getObject(MedicationRequestSubstitution.class, FhirPropertyNames.PROPERTY_SUBSTITUTION);
    }

    /**
     * A link to a resource representing an earlier order related order or
     * prescription.
     */
    public Reference priorPrescription() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PRIOR_PRESCRIPTION);
    }

    /**
     * Indicates an actual or potential clinical issue with or between one or
     * more active or proposed clinical actions for a patient; e.g. Drug-drug
     * interaction, duplicate therapy, dosage alert etc.
     */
    public java.util.List<Reference> detectedIssue() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_DETECTED_ISSUE);
    }

    /**
     * Links to Provenance records for past versions of this resource or
     * fulfilling request or event resources that identify key state
     * transitions or updates that are likely to be relevant to a user
     * looking at the current version of the resource.
     */
    public java.util.List<Reference> eventHistory() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_EVENT_HISTORY);
    }

    public static final class Builder extends DomainResource.Builder<MedicationRequest, MedicationRequest.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder statusReason(final CodeableConcept statusReason) {
            b.add(FhirPropertyNames.PROPERTY_STATUS_REASON, statusReason);
            return this;
        }

        public Builder intent(final String intent) {
            b.add(FhirPropertyNames.PROPERTY_INTENT, intent);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder priority(final String priority) {
            b.add(FhirPropertyNames.PROPERTY_PRIORITY, priority);
            return this;
        }

        public Builder doNotPerform(final Boolean doNotPerform) {
            b.add(FhirPropertyNames.PROPERTY_DO_NOT_PERFORM, doNotPerform);
            return this;
        }

        public Builder reportedBoolean(final Boolean reportedBoolean) {
            b.add(FhirPropertyNames.PROPERTY_REPORTED_BOOLEAN, reportedBoolean);
            return this;
        }

        public Builder reportedReference(final Reference reportedReference) {
            b.add(FhirPropertyNames.PROPERTY_REPORTED_REFERENCE, reportedReference);
            return this;
        }

        public Builder medicationCodeableConcept(final CodeableConcept medicationCodeableConcept) {
            b.add(FhirPropertyNames.PROPERTY_MEDICATION_CODEABLE_CONCEPT, medicationCodeableConcept);
            return this;
        }

        public Builder medicationReference(final Reference medicationReference) {
            b.add(FhirPropertyNames.PROPERTY_MEDICATION_REFERENCE, medicationReference);
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

        public Builder supportingInformation(final java.util.List<Reference> supportingInformation) {
            b.add(FhirPropertyNames.PROPERTY_SUPPORTING_INFORMATION, FhirObject.toArray(supportingInformation));
            return this;
        }

        public Builder authoredOn(final java.time.Instant authoredOn) {
            b.add(FhirPropertyNames.PROPERTY_AUTHORED_ON, authoredOn.toString());
            return this;
        }

        public Builder requester(final Reference requester) {
            b.add(FhirPropertyNames.PROPERTY_REQUESTER, requester);
            return this;
        }

        public Builder performer(final Reference performer) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMER, performer);
            return this;
        }

        public Builder performerType(final CodeableConcept performerType) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMER_TYPE, performerType);
            return this;
        }

        public Builder recorder(final Reference recorder) {
            b.add(FhirPropertyNames.PROPERTY_RECORDER, recorder);
            return this;
        }

        public Builder reasonCode(final java.util.List<CodeableConcept> reasonCode) {
            b.add(FhirPropertyNames.PROPERTY_REASON_CODE, FhirObject.toArray(reasonCode));
            return this;
        }

        public Builder reasonReference(final java.util.List<Reference> reasonReference) {
            b.add(FhirPropertyNames.PROPERTY_REASON_REFERENCE, FhirObject.toArray(reasonReference));
            return this;
        }

        public Builder instantiatesCanonical(final java.util.List<String> instantiatesCanonical) {
            b.add(FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL, FhirObject.toStringArray(instantiatesCanonical));
            return this;
        }

        public Builder instantiatesUri(final java.util.List<java.net.URI> instantiatesUri) {
            b.add(FhirPropertyNames.PROPERTY_INSTANTIATES_URI, FhirObject.toUriArray(instantiatesUri));
            return this;
        }

        public Builder basedOn(final java.util.List<Reference> basedOn) {
            b.add(FhirPropertyNames.PROPERTY_BASED_ON, FhirObject.toArray(basedOn));
            return this;
        }

        public Builder groupIdentifier(final Identifier groupIdentifier) {
            b.add(FhirPropertyNames.PROPERTY_GROUP_IDENTIFIER, groupIdentifier);
            return this;
        }

        public Builder courseOfTherapyType(final CodeableConcept courseOfTherapyType) {
            b.add(FhirPropertyNames.PROPERTY_COURSE_OF_THERAPY_TYPE, courseOfTherapyType);
            return this;
        }

        public Builder insurance(final java.util.List<Reference> insurance) {
            b.add(FhirPropertyNames.PROPERTY_INSURANCE, FhirObject.toArray(insurance));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder dosageInstruction(final java.util.List<Dosage> dosageInstruction) {
            b.add(FhirPropertyNames.PROPERTY_DOSAGE_INSTRUCTION, FhirObject.toArray(dosageInstruction));
            return this;
        }

        public Builder dispenseRequest(final MedicationRequestDispenseRequest dispenseRequest) {
            b.add(FhirPropertyNames.PROPERTY_DISPENSE_REQUEST, dispenseRequest);
            return this;
        }

        public Builder substitution(final MedicationRequestSubstitution substitution) {
            b.add(FhirPropertyNames.PROPERTY_SUBSTITUTION, substitution);
            return this;
        }

        public Builder priorPrescription(final Reference priorPrescription) {
            b.add(FhirPropertyNames.PROPERTY_PRIOR_PRESCRIPTION, priorPrescription);
            return this;
        }

        public Builder detectedIssue(final java.util.List<Reference> detectedIssue) {
            b.add(FhirPropertyNames.PROPERTY_DETECTED_ISSUE, FhirObject.toArray(detectedIssue));
            return this;
        }

        public Builder eventHistory(final java.util.List<Reference> eventHistory) {
            b.add(FhirPropertyNames.PROPERTY_EVENT_HISTORY, FhirObject.toArray(eventHistory));
            return this;
        }

        public MedicationRequest build() {
            return new MedicationRequest(b.build());
        }
    }

    /**
     * An order or request for both supply of the medication and the
     * instructions for administration of the medication to a patient. The
     * resource is called &quot;MedicationRequest&quot; rather than
     * &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use
     * across inpatient and outpatient settings, including care plans, etc.,
     * and to harmonize with workflow patterns.
     */
    public static class MedicationRequestDispenseRequest extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicationRequestDispenseRequest";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicationRequestDispenseRequest(final JsonObject data) {
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
         * Indicates the quantity or duration for the first dispense of the
         * medication.
         */
        public MedicationRequestInitialFill initialFill() {
            return getObject(MedicationRequestInitialFill.class, FhirPropertyNames.PROPERTY_INITIAL_FILL);
        }

        /**
         * The minimum period of time that must occur between dispenses of the
         * medication.
         */
        public Duration dispenseInterval() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_DISPENSE_INTERVAL);
        }

        /**
         * This indicates the validity period of a prescription (stale dating the
         * Prescription).
         */
        public Period validityPeriod() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_VALIDITY_PERIOD);
        }

        /**
         * An integer indicating the number of times, in addition to the original
         * dispense, (aka refills or repeats) that the patient can receive the
         * prescribed medication. Usage Notes: This integer does not include the
         * original order dispense. This means that if an order indicates
         * dispense 30 tablets plus &quot;3 repeats&quot;, then the order can be dispensed
         * a total of 4 times and the patient can receive a total of 120 tablets.
         * A prescriber may explicitly say that zero refills are permitted after
         * the initial dispense.
         */
        public Integer numberOfRepeatsAllowed() {
            return data.getInt(FhirPropertyNames.PROPERTY_NUMBER_OF_REPEATS_ALLOWED);
        }

        /**
         * The amount that is to be dispensed for one fill.
         */
        public Quantity quantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_QUANTITY);
        }

        /**
         * Identifies the period time over which the supplied product is expected
         * to be used, or the length of time the dispense is expected to last.
         */
        public Duration expectedSupplyDuration() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_EXPECTED_SUPPLY_DURATION);
        }

        /**
         * Indicates the intended dispensing Organization specified by the
         * prescriber.
         */
        public Reference performer() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_PERFORMER);
        }

        public static final class Builder extends FhirObject.Builder<MedicationRequestDispenseRequest, MedicationRequestDispenseRequest.Builder> {

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

            public Builder initialFill(final MedicationRequestInitialFill initialFill) {
                b.add(FhirPropertyNames.PROPERTY_INITIAL_FILL, initialFill);
                return this;
            }

            public Builder dispenseInterval(final Duration dispenseInterval) {
                b.add(FhirPropertyNames.PROPERTY_DISPENSE_INTERVAL, dispenseInterval);
                return this;
            }

            public Builder validityPeriod(final Period validityPeriod) {
                b.add(FhirPropertyNames.PROPERTY_VALIDITY_PERIOD, validityPeriod);
                return this;
            }

            public Builder numberOfRepeatsAllowed(final Integer numberOfRepeatsAllowed) {
                b.add(FhirPropertyNames.PROPERTY_NUMBER_OF_REPEATS_ALLOWED, numberOfRepeatsAllowed);
                return this;
            }

            public Builder quantity(final Quantity quantity) {
                b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
                return this;
            }

            public Builder expectedSupplyDuration(final Duration expectedSupplyDuration) {
                b.add(FhirPropertyNames.PROPERTY_EXPECTED_SUPPLY_DURATION, expectedSupplyDuration);
                return this;
            }

            public Builder performer(final Reference performer) {
                b.add(FhirPropertyNames.PROPERTY_PERFORMER, performer);
                return this;
            }

            public MedicationRequestDispenseRequest build() {
                return new MedicationRequestDispenseRequest(b.build());
            }
        }
    }

    /**
     * An order or request for both supply of the medication and the
     * instructions for administration of the medication to a patient. The
     * resource is called &quot;MedicationRequest&quot; rather than
     * &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use
     * across inpatient and outpatient settings, including care plans, etc.,
     * and to harmonize with workflow patterns.
     */
    public static class MedicationRequestInitialFill extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicationRequestInitialFill";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicationRequestInitialFill(final JsonObject data) {
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
         * The amount or quantity to provide as part of the first dispense.
         */
        public Quantity quantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_QUANTITY);
        }

        /**
         * The length of time that the first dispense is expected to last.
         */
        public Duration duration() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_DURATION);
        }

        public static final class Builder extends FhirObject.Builder<MedicationRequestInitialFill, MedicationRequestInitialFill.Builder> {

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

            public Builder quantity(final Quantity quantity) {
                b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
                return this;
            }

            public Builder duration(final Duration duration) {
                b.add(FhirPropertyNames.PROPERTY_DURATION, duration);
                return this;
            }

            public MedicationRequestInitialFill build() {
                return new MedicationRequestInitialFill(b.build());
            }
        }
    }

    /**
     * An order or request for both supply of the medication and the
     * instructions for administration of the medication to a patient. The
     * resource is called &quot;MedicationRequest&quot; rather than
     * &quot;MedicationPrescription&quot; or &quot;MedicationOrder&quot; to generalize the use
     * across inpatient and outpatient settings, including care plans, etc.,
     * and to harmonize with workflow patterns.
     */
    public static class MedicationRequestSubstitution extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicationRequestSubstitution";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicationRequestSubstitution(final JsonObject data) {
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
         * True if the prescriber allows a different drug to be dispensed from
         * what was prescribed.
         */
        public Boolean allowedBoolean() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_ALLOWED_BOOLEAN);
        }

        /**
         * True if the prescriber allows a different drug to be dispensed from
         * what was prescribed.
         */
        public CodeableConcept allowedCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ALLOWED_CODEABLE_CONCEPT);
        }

        /**
         * Indicates the reason for the substitution, or why substitution must or
         * must not be performed.
         */
        public CodeableConcept reason() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON);
        }

        public static final class Builder extends FhirObject.Builder<MedicationRequestSubstitution, MedicationRequestSubstitution.Builder> {

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

            public Builder allowedBoolean(final Boolean allowedBoolean) {
                b.add(FhirPropertyNames.PROPERTY_ALLOWED_BOOLEAN, allowedBoolean);
                return this;
            }

            public Builder allowedCodeableConcept(final CodeableConcept allowedCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_ALLOWED_CODEABLE_CONCEPT, allowedCodeableConcept);
                return this;
            }

            public Builder reason(final CodeableConcept reason) {
                b.add(FhirPropertyNames.PROPERTY_REASON, reason);
                return this;
            }

            public MedicationRequestSubstitution build() {
                return new MedicationRequestSubstitution(b.build());
            }
        }
    }
}
