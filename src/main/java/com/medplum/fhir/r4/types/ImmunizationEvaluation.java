/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Describes a comparison of an immunization event against published
 * recommendations to determine if the administration is &quot;valid&quot; in
 * relation to those  recommendations.
 */
public class ImmunizationEvaluation extends DomainResource {
    public static final String RESOURCE_TYPE = "ImmunizationEvaluation";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ImmunizationEvaluation(final JsonObject data) {
        super(data);
    }

    /**
     * A unique identifier assigned to this immunization evaluation record.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Indicates the current status of the evaluation of the vaccination
     * administration event.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * The individual for whom the evaluation is being done.
     */
    public Reference patient() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PATIENT);
    }

    /**
     * The date the evaluation of the vaccine administration event was
     * performed.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * Indicates the authority who published the protocol (e.g. ACIP).
     */
    public Reference authority() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_AUTHORITY);
    }

    /**
     * The vaccine preventable disease the dose is being evaluated against.
     */
    public CodeableConcept targetDisease() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TARGET_DISEASE);
    }

    /**
     * The vaccine administration event being evaluated.
     */
    public Reference immunizationEvent() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_IMMUNIZATION_EVENT);
    }

    /**
     * Indicates if the dose is valid or not valid with respect to the
     * published recommendations.
     */
    public CodeableConcept doseStatus() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_DOSE_STATUS);
    }

    /**
     * Provides an explanation as to why the vaccine administration event is
     * valid or not relative to the published recommendations.
     */
    public java.util.List<CodeableConcept> doseStatusReason() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_DOSE_STATUS_REASON);
    }

    /**
     * Additional information about the evaluation.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * One possible path to achieve presumed immunity against a disease -
     * within the context of an authority.
     */
    public String series() {
        return getString(FhirPropertyNames.PROPERTY_SERIES);
    }

    /**
     * Nominal position in a series.
     */
    public Integer doseNumberPositiveInt() {
        return data.getInt(FhirPropertyNames.PROPERTY_DOSE_NUMBER_POSITIVE_INT);
    }

    /**
     * Nominal position in a series.
     */
    public String doseNumberString() {
        return getString(FhirPropertyNames.PROPERTY_DOSE_NUMBER_STRING);
    }

    /**
     * The recommended number of doses to achieve immunity.
     */
    public Integer seriesDosesPositiveInt() {
        return data.getInt(FhirPropertyNames.PROPERTY_SERIES_DOSES_POSITIVE_INT);
    }

    /**
     * The recommended number of doses to achieve immunity.
     */
    public String seriesDosesString() {
        return getString(FhirPropertyNames.PROPERTY_SERIES_DOSES_STRING);
    }

    public static final class Builder extends DomainResource.Builder<ImmunizationEvaluation, ImmunizationEvaluation.Builder> {

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

        public Builder patient(final Reference patient) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT, patient);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(FhirPropertyNames.PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder authority(final Reference authority) {
            b.add(FhirPropertyNames.PROPERTY_AUTHORITY, authority);
            return this;
        }

        public Builder targetDisease(final CodeableConcept targetDisease) {
            b.add(FhirPropertyNames.PROPERTY_TARGET_DISEASE, targetDisease);
            return this;
        }

        public Builder immunizationEvent(final Reference immunizationEvent) {
            b.add(FhirPropertyNames.PROPERTY_IMMUNIZATION_EVENT, immunizationEvent);
            return this;
        }

        public Builder doseStatus(final CodeableConcept doseStatus) {
            b.add(FhirPropertyNames.PROPERTY_DOSE_STATUS, doseStatus);
            return this;
        }

        public Builder doseStatusReason(final java.util.List<CodeableConcept> doseStatusReason) {
            b.add(FhirPropertyNames.PROPERTY_DOSE_STATUS_REASON, FhirObject.toArray(doseStatusReason));
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder series(final String series) {
            b.add(FhirPropertyNames.PROPERTY_SERIES, series);
            return this;
        }

        public Builder doseNumberPositiveInt(final Integer doseNumberPositiveInt) {
            b.add(FhirPropertyNames.PROPERTY_DOSE_NUMBER_POSITIVE_INT, doseNumberPositiveInt);
            return this;
        }

        public Builder doseNumberString(final String doseNumberString) {
            b.add(FhirPropertyNames.PROPERTY_DOSE_NUMBER_STRING, doseNumberString);
            return this;
        }

        public Builder seriesDosesPositiveInt(final Integer seriesDosesPositiveInt) {
            b.add(FhirPropertyNames.PROPERTY_SERIES_DOSES_POSITIVE_INT, seriesDosesPositiveInt);
            return this;
        }

        public Builder seriesDosesString(final String seriesDosesString) {
            b.add(FhirPropertyNames.PROPERTY_SERIES_DOSES_STRING, seriesDosesString);
            return this;
        }

        public ImmunizationEvaluation build() {
            return new ImmunizationEvaluation(b.build());
        }
    }
}
