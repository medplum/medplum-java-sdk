/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A pharmaceutical product described in terms of its composition and
 * dose form.
 */
public class MedicinalProductPharmaceutical extends DomainResource {
    public static final String RESOURCE_TYPE = "MedicinalProductPharmaceutical";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicinalProductPharmaceutical(final JsonObject data) {
        super(data);
    }

    /**
     * An identifier for the pharmaceutical medicinal product.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The administrable dose form, after necessary reconstitution.
     */
    public CodeableConcept administrableDoseForm() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ADMINISTRABLE_DOSE_FORM);
    }

    /**
     * Todo.
     */
    public CodeableConcept unitOfPresentation() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_UNIT_OF_PRESENTATION);
    }

    /**
     * Ingredient.
     */
    public java.util.List<Reference> ingredient() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_INGREDIENT);
    }

    /**
     * Accompanying device.
     */
    public java.util.List<Reference> device() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_DEVICE);
    }

    /**
     * Characteristics e.g. a products onset of action.
     */
    public java.util.List<MedicinalProductPharmaceuticalCharacteristics> characteristics() {
        return getList(MedicinalProductPharmaceuticalCharacteristics.class, FhirPropertyNames.PROPERTY_CHARACTERISTICS);
    }

    /**
     * The path by which the pharmaceutical product is taken into or makes
     * contact with the body.
     */
    public java.util.List<MedicinalProductPharmaceuticalRouteOfAdministration> routeOfAdministration() {
        return getList(MedicinalProductPharmaceuticalRouteOfAdministration.class, FhirPropertyNames.PROPERTY_ROUTE_OF_ADMINISTRATION);
    }

    public static final class Builder extends DomainResource.Builder<MedicinalProductPharmaceutical, MedicinalProductPharmaceutical.Builder> {

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

        public Builder administrableDoseForm(final CodeableConcept administrableDoseForm) {
            b.add(FhirPropertyNames.PROPERTY_ADMINISTRABLE_DOSE_FORM, administrableDoseForm);
            return this;
        }

        public Builder unitOfPresentation(final CodeableConcept unitOfPresentation) {
            b.add(FhirPropertyNames.PROPERTY_UNIT_OF_PRESENTATION, unitOfPresentation);
            return this;
        }

        public Builder ingredient(final java.util.List<Reference> ingredient) {
            b.add(FhirPropertyNames.PROPERTY_INGREDIENT, FhirObject.toArray(ingredient));
            return this;
        }

        public Builder device(final java.util.List<Reference> device) {
            b.add(FhirPropertyNames.PROPERTY_DEVICE, FhirObject.toArray(device));
            return this;
        }

        public Builder characteristics(final java.util.List<MedicinalProductPharmaceuticalCharacteristics> characteristics) {
            b.add(FhirPropertyNames.PROPERTY_CHARACTERISTICS, FhirObject.toArray(characteristics));
            return this;
        }

        public Builder routeOfAdministration(final java.util.List<MedicinalProductPharmaceuticalRouteOfAdministration> routeOfAdministration) {
            b.add(FhirPropertyNames.PROPERTY_ROUTE_OF_ADMINISTRATION, FhirObject.toArray(routeOfAdministration));
            return this;
        }

        public MedicinalProductPharmaceutical build() {
            return new MedicinalProductPharmaceutical(b.build());
        }
    }

    /**
     * A pharmaceutical product described in terms of its composition and
     * dose form.
     */
    public static class MedicinalProductPharmaceuticalCharacteristics extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductPharmaceuticalCharacteristics";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductPharmaceuticalCharacteristics(final JsonObject data) {
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
         * A coded characteristic.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * The status of characteristic e.g. assigned or pending.
         */
        public CodeableConcept status() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_STATUS);
        }

        public static final class Builder extends FhirObject.Builder<MedicinalProductPharmaceuticalCharacteristics,
                MedicinalProductPharmaceuticalCharacteristics.Builder> {

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

            public Builder code(final CodeableConcept code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder status(final CodeableConcept status) {
                b.add(FhirPropertyNames.PROPERTY_STATUS, status);
                return this;
            }

            public MedicinalProductPharmaceuticalCharacteristics build() {
                return new MedicinalProductPharmaceuticalCharacteristics(b.build());
            }
        }
    }

    /**
     * A pharmaceutical product described in terms of its composition and
     * dose form.
     */
    public static class MedicinalProductPharmaceuticalRouteOfAdministration extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductPharmaceuticalRouteOfAdministration";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductPharmaceuticalRouteOfAdministration(final JsonObject data) {
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
         * Coded expression for the route.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * The first dose (dose quantity) administered in humans can be
         * specified, for a product under investigation, using a numerical value
         * and its unit of measurement.
         */
        public Quantity firstDose() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_FIRST_DOSE);
        }

        /**
         * The maximum single dose that can be administered as per the protocol
         * of a clinical trial can be specified using a numerical value and its
         * unit of measurement.
         */
        public Quantity maxSingleDose() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_MAX_SINGLE_DOSE);
        }

        /**
         * The maximum dose per day (maximum dose quantity to be administered in
         * any one 24-h period) that can be administered as per the protocol
         * referenced in the clinical trial authorisation.
         */
        public Quantity maxDosePerDay() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_MAX_DOSE_PER_DAY);
        }

        /**
         * The maximum dose per treatment period that can be administered as per
         * the protocol referenced in the clinical trial authorisation.
         */
        public Ratio maxDosePerTreatmentPeriod() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_MAX_DOSE_PER_TREATMENT_PERIOD);
        }

        /**
         * The maximum treatment period during which an Investigational Medicinal
         * Product can be administered as per the protocol referenced in the
         * clinical trial authorisation.
         */
        public Duration maxTreatmentPeriod() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_MAX_TREATMENT_PERIOD);
        }

        /**
         * A species for which this route applies.
         */
        public java.util.List<MedicinalProductPharmaceuticalTargetSpecies> targetSpecies() {
            return getList(MedicinalProductPharmaceuticalTargetSpecies.class, FhirPropertyNames.PROPERTY_TARGET_SPECIES);
        }

        public static final class Builder extends
                FhirObject.Builder<MedicinalProductPharmaceuticalRouteOfAdministration,
                MedicinalProductPharmaceuticalRouteOfAdministration.Builder> {

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

            public Builder code(final CodeableConcept code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder firstDose(final Quantity firstDose) {
                b.add(FhirPropertyNames.PROPERTY_FIRST_DOSE, firstDose);
                return this;
            }

            public Builder maxSingleDose(final Quantity maxSingleDose) {
                b.add(FhirPropertyNames.PROPERTY_MAX_SINGLE_DOSE, maxSingleDose);
                return this;
            }

            public Builder maxDosePerDay(final Quantity maxDosePerDay) {
                b.add(FhirPropertyNames.PROPERTY_MAX_DOSE_PER_DAY, maxDosePerDay);
                return this;
            }

            public Builder maxDosePerTreatmentPeriod(final Ratio maxDosePerTreatmentPeriod) {
                b.add(FhirPropertyNames.PROPERTY_MAX_DOSE_PER_TREATMENT_PERIOD, maxDosePerTreatmentPeriod);
                return this;
            }

            public Builder maxTreatmentPeriod(final Duration maxTreatmentPeriod) {
                b.add(FhirPropertyNames.PROPERTY_MAX_TREATMENT_PERIOD, maxTreatmentPeriod);
                return this;
            }

            public Builder targetSpecies(final java.util.List<MedicinalProductPharmaceuticalTargetSpecies> targetSpecies) {
                b.add(FhirPropertyNames.PROPERTY_TARGET_SPECIES, FhirObject.toArray(targetSpecies));
                return this;
            }

            public MedicinalProductPharmaceuticalRouteOfAdministration build() {
                return new MedicinalProductPharmaceuticalRouteOfAdministration(b.build());
            }
        }
    }

    /**
     * A pharmaceutical product described in terms of its composition and
     * dose form.
     */
    public static class MedicinalProductPharmaceuticalTargetSpecies extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductPharmaceuticalTargetSpecies";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductPharmaceuticalTargetSpecies(final JsonObject data) {
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
         * Coded expression for the species.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * A species specific time during which consumption of animal product is
         * not appropriate.
         */
        public java.util.List<MedicinalProductPharmaceuticalWithdrawalPeriod> withdrawalPeriod() {
            return getList(MedicinalProductPharmaceuticalWithdrawalPeriod.class, FhirPropertyNames.PROPERTY_WITHDRAWAL_PERIOD);
        }

        public static final class Builder extends FhirObject.Builder<MedicinalProductPharmaceuticalTargetSpecies,
                MedicinalProductPharmaceuticalTargetSpecies.Builder> {

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

            public Builder code(final CodeableConcept code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder withdrawalPeriod(final java.util.List<MedicinalProductPharmaceuticalWithdrawalPeriod> withdrawalPeriod) {
                b.add(FhirPropertyNames.PROPERTY_WITHDRAWAL_PERIOD, FhirObject.toArray(withdrawalPeriod));
                return this;
            }

            public MedicinalProductPharmaceuticalTargetSpecies build() {
                return new MedicinalProductPharmaceuticalTargetSpecies(b.build());
            }
        }
    }

    /**
     * A pharmaceutical product described in terms of its composition and
     * dose form.
     */
    public static class MedicinalProductPharmaceuticalWithdrawalPeriod extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductPharmaceuticalWithdrawalPeriod";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductPharmaceuticalWithdrawalPeriod(final JsonObject data) {
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
         * Coded expression for the type of tissue for which the withdrawal
         * period applues, e.g. meat, milk.
         */
        public CodeableConcept tissue() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TISSUE);
        }

        /**
         * A value for the time.
         */
        public Quantity value() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_VALUE);
        }

        /**
         * Extra information about the withdrawal period.
         */
        public String supportingInformation() {
            return getString(FhirPropertyNames.PROPERTY_SUPPORTING_INFORMATION);
        }

        public static final class Builder extends FhirObject.Builder<MedicinalProductPharmaceuticalWithdrawalPeriod,
                MedicinalProductPharmaceuticalWithdrawalPeriod.Builder> {

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

            public Builder tissue(final CodeableConcept tissue) {
                b.add(FhirPropertyNames.PROPERTY_TISSUE, tissue);
                return this;
            }

            public Builder value(final Quantity value) {
                b.add(FhirPropertyNames.PROPERTY_VALUE, value);
                return this;
            }

            public Builder supportingInformation(final String supportingInformation) {
                b.add(FhirPropertyNames.PROPERTY_SUPPORTING_INFORMATION, supportingInformation);
                return this;
            }

            public MedicinalProductPharmaceuticalWithdrawalPeriod build() {
                return new MedicinalProductPharmaceuticalWithdrawalPeriod(b.build());
            }
        }
    }
}
