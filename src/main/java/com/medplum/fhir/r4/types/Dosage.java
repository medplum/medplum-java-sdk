/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Indicates how the medication is/was taken or should be taken by the
 * patient.
 */
public class Dosage extends FhirObject {
    public static final String RESOURCE_TYPE = "Dosage";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Dosage(final JsonObject data) {
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
     * Indicates the order in which the dosage instructions should be applied
     * or interpreted.
     */
    public Integer sequence() {
        return data.getInt(FhirPropertyNames.PROPERTY_SEQUENCE);
    }

    /**
     * Free text dosage instructions e.g. SIG.
     */
    public String text() {
        return getString(FhirPropertyNames.PROPERTY_TEXT);
    }

    /**
     * Supplemental instructions to the patient on how to take the medication
     * (e.g. &quot;with meals&quot; or&quot;take half to one hour before food&quot;) or warnings
     * for the patient about the medication (e.g. &quot;may cause drowsiness&quot; or
     * &quot;avoid exposure of skin to direct sunlight or sunlamps&quot;).
     */
    public java.util.List<CodeableConcept> additionalInstruction() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_ADDITIONAL_INSTRUCTION);
    }

    /**
     * Instructions in terms that are understood by the patient or consumer.
     */
    public String patientInstruction() {
        return getString(FhirPropertyNames.PROPERTY_PATIENT_INSTRUCTION);
    }

    /**
     * When medication should be administered.
     */
    public Timing timing() {
        return getObject(Timing.class, FhirPropertyNames.PROPERTY_TIMING);
    }

    /**
     * Indicates whether the Medication is only taken when needed within a
     * specific dosing schedule (Boolean option), or it indicates the
     * precondition for taking the Medication (CodeableConcept).
     */
    public Boolean asNeededBoolean() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_AS_NEEDED_BOOLEAN);
    }

    /**
     * Indicates whether the Medication is only taken when needed within a
     * specific dosing schedule (Boolean option), or it indicates the
     * precondition for taking the Medication (CodeableConcept).
     */
    public CodeableConcept asNeededCodeableConcept() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_AS_NEEDED_CODEABLE_CONCEPT);
    }

    /**
     * Body site to administer to.
     */
    public CodeableConcept site() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SITE);
    }

    /**
     * How drug should enter body.
     */
    public CodeableConcept route() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ROUTE);
    }

    /**
     * Technique for administering medication.
     */
    public CodeableConcept method() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_METHOD);
    }

    /**
     * The amount of medication administered.
     */
    public java.util.List<DosageDoseAndRate> doseAndRate() {
        return getList(DosageDoseAndRate.class, FhirPropertyNames.PROPERTY_DOSE_AND_RATE);
    }

    /**
     * Upper limit on medication per unit of time.
     */
    public Ratio maxDosePerPeriod() {
        return getObject(Ratio.class, FhirPropertyNames.PROPERTY_MAX_DOSE_PER_PERIOD);
    }

    /**
     * Upper limit on medication per administration.
     */
    public Quantity maxDosePerAdministration() {
        return getObject(Quantity.class, FhirPropertyNames.PROPERTY_MAX_DOSE_PER_ADMINISTRATION);
    }

    /**
     * Upper limit on medication per lifetime of the patient.
     */
    public Quantity maxDosePerLifetime() {
        return getObject(Quantity.class, FhirPropertyNames.PROPERTY_MAX_DOSE_PER_LIFETIME);
    }

    public static final class Builder extends FhirObject.Builder<Dosage, Dosage.Builder> {

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

        public Builder sequence(final Integer sequence) {
            b.add(FhirPropertyNames.PROPERTY_SEQUENCE, sequence);
            return this;
        }

        public Builder text(final String text) {
            b.add(FhirPropertyNames.PROPERTY_TEXT, text);
            return this;
        }

        public Builder additionalInstruction(final java.util.List<CodeableConcept> additionalInstruction) {
            b.add(FhirPropertyNames.PROPERTY_ADDITIONAL_INSTRUCTION, FhirObject.toArray(additionalInstruction));
            return this;
        }

        public Builder patientInstruction(final String patientInstruction) {
            b.add(FhirPropertyNames.PROPERTY_PATIENT_INSTRUCTION, patientInstruction);
            return this;
        }

        public Builder timing(final Timing timing) {
            b.add(FhirPropertyNames.PROPERTY_TIMING, timing);
            return this;
        }

        public Builder asNeededBoolean(final Boolean asNeededBoolean) {
            b.add(FhirPropertyNames.PROPERTY_AS_NEEDED_BOOLEAN, asNeededBoolean);
            return this;
        }

        public Builder asNeededCodeableConcept(final CodeableConcept asNeededCodeableConcept) {
            b.add(FhirPropertyNames.PROPERTY_AS_NEEDED_CODEABLE_CONCEPT, asNeededCodeableConcept);
            return this;
        }

        public Builder site(final CodeableConcept site) {
            b.add(FhirPropertyNames.PROPERTY_SITE, site);
            return this;
        }

        public Builder route(final CodeableConcept route) {
            b.add(FhirPropertyNames.PROPERTY_ROUTE, route);
            return this;
        }

        public Builder method(final CodeableConcept method) {
            b.add(FhirPropertyNames.PROPERTY_METHOD, method);
            return this;
        }

        public Builder doseAndRate(final java.util.List<DosageDoseAndRate> doseAndRate) {
            b.add(FhirPropertyNames.PROPERTY_DOSE_AND_RATE, FhirObject.toArray(doseAndRate));
            return this;
        }

        public Builder maxDosePerPeriod(final Ratio maxDosePerPeriod) {
            b.add(FhirPropertyNames.PROPERTY_MAX_DOSE_PER_PERIOD, maxDosePerPeriod);
            return this;
        }

        public Builder maxDosePerAdministration(final Quantity maxDosePerAdministration) {
            b.add(FhirPropertyNames.PROPERTY_MAX_DOSE_PER_ADMINISTRATION, maxDosePerAdministration);
            return this;
        }

        public Builder maxDosePerLifetime(final Quantity maxDosePerLifetime) {
            b.add(FhirPropertyNames.PROPERTY_MAX_DOSE_PER_LIFETIME, maxDosePerLifetime);
            return this;
        }

        public Dosage build() {
            return new Dosage(b.build());
        }
    }

    /**
     * Indicates how the medication is/was taken or should be taken by the
     * patient.
     */
    public static class DosageDoseAndRate extends FhirObject {
        public static final String RESOURCE_TYPE = "DosageDoseAndRate";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public DosageDoseAndRate(final JsonObject data) {
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
         * The kind of dose or rate specified, for example, ordered or
         * calculated.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * Amount of medication per dose.
         */
        public Range doseRange() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_DOSE_RANGE);
        }

        /**
         * Amount of medication per dose.
         */
        public Quantity doseQuantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_DOSE_QUANTITY);
        }

        /**
         * Amount of medication per unit of time.
         */
        public Ratio rateRatio() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_RATE_RATIO);
        }

        /**
         * Amount of medication per unit of time.
         */
        public Range rateRange() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_RATE_RANGE);
        }

        /**
         * Amount of medication per unit of time.
         */
        public Quantity rateQuantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_RATE_QUANTITY);
        }

        public static final class Builder extends FhirObject.Builder<DosageDoseAndRate, DosageDoseAndRate.Builder> {

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

            public Builder type(final CodeableConcept type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder doseRange(final Range doseRange) {
                b.add(FhirPropertyNames.PROPERTY_DOSE_RANGE, doseRange);
                return this;
            }

            public Builder doseQuantity(final Quantity doseQuantity) {
                b.add(FhirPropertyNames.PROPERTY_DOSE_QUANTITY, doseQuantity);
                return this;
            }

            public Builder rateRatio(final Ratio rateRatio) {
                b.add(FhirPropertyNames.PROPERTY_RATE_RATIO, rateRatio);
                return this;
            }

            public Builder rateRange(final Range rateRange) {
                b.add(FhirPropertyNames.PROPERTY_RATE_RANGE, rateRange);
                return this;
            }

            public Builder rateQuantity(final Quantity rateQuantity) {
                b.add(FhirPropertyNames.PROPERTY_RATE_QUANTITY, rateQuantity);
                return this;
            }

            public DosageDoseAndRate build() {
                return new DosageDoseAndRate(b.build());
            }
        }
    }
}
