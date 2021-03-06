/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * An ingredient of a manufactured item or pharmaceutical product.
 */
public class MedicinalProductIngredient extends DomainResource {
    public static final String RESOURCE_TYPE = "MedicinalProductIngredient";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MedicinalProductIngredient(final JsonObject data) {
        super(data);
    }

    /**
     * The identifier(s) of this Ingredient that are assigned by business
     * processes and/or used to refer to it when a direct URL reference to
     * the resource itself is not appropriate.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Ingredient role e.g. Active ingredient, excipient.
     */
    public CodeableConcept role() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ROLE);
    }

    /**
     * If the ingredient is a known or suspected allergen.
     */
    public Boolean allergenicIndicator() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_ALLERGENIC_INDICATOR);
    }

    /**
     * Manufacturer of this Ingredient.
     */
    public java.util.List<Reference> manufacturer() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_MANUFACTURER);
    }

    /**
     * A specified substance that comprises this ingredient.
     */
    public java.util.List<MedicinalProductIngredientSpecifiedSubstance> specifiedSubstance() {
        return getList(MedicinalProductIngredientSpecifiedSubstance.class, FhirPropertyNames.PROPERTY_SPECIFIED_SUBSTANCE);
    }

    /**
     * The ingredient substance.
     */
    public MedicinalProductIngredientSubstance substance() {
        return getObject(MedicinalProductIngredientSubstance.class, FhirPropertyNames.PROPERTY_SUBSTANCE);
    }

    public static final class Builder extends DomainResource.Builder<MedicinalProductIngredient, MedicinalProductIngredient.Builder> {

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

        public Builder role(final CodeableConcept role) {
            b.add(FhirPropertyNames.PROPERTY_ROLE, role);
            return this;
        }

        public Builder allergenicIndicator(final Boolean allergenicIndicator) {
            b.add(FhirPropertyNames.PROPERTY_ALLERGENIC_INDICATOR, allergenicIndicator);
            return this;
        }

        public Builder manufacturer(final java.util.List<Reference> manufacturer) {
            b.add(FhirPropertyNames.PROPERTY_MANUFACTURER, FhirObject.toArray(manufacturer));
            return this;
        }

        public Builder specifiedSubstance(final java.util.List<MedicinalProductIngredientSpecifiedSubstance> specifiedSubstance) {
            b.add(FhirPropertyNames.PROPERTY_SPECIFIED_SUBSTANCE, FhirObject.toArray(specifiedSubstance));
            return this;
        }

        public Builder substance(final MedicinalProductIngredientSubstance substance) {
            b.add(FhirPropertyNames.PROPERTY_SUBSTANCE, substance);
            return this;
        }

        public MedicinalProductIngredient build() {
            return new MedicinalProductIngredient(b.build());
        }
    }

    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     */
    public static class MedicinalProductIngredientReferenceStrength extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIngredientReferenceStrength";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIngredientReferenceStrength(final JsonObject data) {
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
         * Relevant reference substance.
         */
        public CodeableConcept substance() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SUBSTANCE);
        }

        /**
         * Strength expressed in terms of a reference substance.
         */
        public Ratio strength() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_STRENGTH);
        }

        /**
         * Strength expressed in terms of a reference substance.
         */
        public Ratio strengthLowLimit() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_STRENGTH_LOW_LIMIT);
        }

        /**
         * For when strength is measured at a particular point or distance.
         */
        public String measurementPoint() {
            return getString(FhirPropertyNames.PROPERTY_MEASUREMENT_POINT);
        }

        /**
         * The country or countries for which the strength range applies.
         */
        public java.util.List<CodeableConcept> country() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_COUNTRY);
        }

        public static final class Builder extends FhirObject.Builder<MedicinalProductIngredientReferenceStrength,
                MedicinalProductIngredientReferenceStrength.Builder> {

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

            public Builder substance(final CodeableConcept substance) {
                b.add(FhirPropertyNames.PROPERTY_SUBSTANCE, substance);
                return this;
            }

            public Builder strength(final Ratio strength) {
                b.add(FhirPropertyNames.PROPERTY_STRENGTH, strength);
                return this;
            }

            public Builder strengthLowLimit(final Ratio strengthLowLimit) {
                b.add(FhirPropertyNames.PROPERTY_STRENGTH_LOW_LIMIT, strengthLowLimit);
                return this;
            }

            public Builder measurementPoint(final String measurementPoint) {
                b.add(FhirPropertyNames.PROPERTY_MEASUREMENT_POINT, measurementPoint);
                return this;
            }

            public Builder country(final java.util.List<CodeableConcept> country) {
                b.add(FhirPropertyNames.PROPERTY_COUNTRY, FhirObject.toArray(country));
                return this;
            }

            public MedicinalProductIngredientReferenceStrength build() {
                return new MedicinalProductIngredientReferenceStrength(b.build());
            }
        }
    }

    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     */
    public static class MedicinalProductIngredientSpecifiedSubstance extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIngredientSpecifiedSubstance";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIngredientSpecifiedSubstance(final JsonObject data) {
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
         * The specified substance.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * The group of specified substance, e.g. group 1 to 4.
         */
        public CodeableConcept group() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_GROUP);
        }

        /**
         * Confidentiality level of the specified substance as the ingredient.
         */
        public CodeableConcept confidentiality() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CONFIDENTIALITY);
        }

        /**
         * Quantity of the substance or specified substance present in the
         * manufactured item or pharmaceutical product.
         */
        public java.util.List<MedicinalProductIngredientStrength> strength() {
            return getList(MedicinalProductIngredientStrength.class, FhirPropertyNames.PROPERTY_STRENGTH);
        }

        public static final class Builder extends FhirObject.Builder<MedicinalProductIngredientSpecifiedSubstance,
                MedicinalProductIngredientSpecifiedSubstance.Builder> {

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

            public Builder group(final CodeableConcept group) {
                b.add(FhirPropertyNames.PROPERTY_GROUP, group);
                return this;
            }

            public Builder confidentiality(final CodeableConcept confidentiality) {
                b.add(FhirPropertyNames.PROPERTY_CONFIDENTIALITY, confidentiality);
                return this;
            }

            public Builder strength(final java.util.List<MedicinalProductIngredientStrength> strength) {
                b.add(FhirPropertyNames.PROPERTY_STRENGTH, FhirObject.toArray(strength));
                return this;
            }

            public MedicinalProductIngredientSpecifiedSubstance build() {
                return new MedicinalProductIngredientSpecifiedSubstance(b.build());
            }
        }
    }

    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     */
    public static class MedicinalProductIngredientStrength extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIngredientStrength";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIngredientStrength(final JsonObject data) {
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
         * The quantity of substance in the unit of presentation, or in the
         * volume (or mass) of the single pharmaceutical product or manufactured
         * item.
         */
        public Ratio presentation() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_PRESENTATION);
        }

        /**
         * A lower limit for the quantity of substance in the unit of
         * presentation. For use when there is a range of strengths, this is the
         * lower limit, with the presentation attribute becoming the upper limit.
         */
        public Ratio presentationLowLimit() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_PRESENTATION_LOW_LIMIT);
        }

        /**
         * The strength per unitary volume (or mass).
         */
        public Ratio concentration() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_CONCENTRATION);
        }

        /**
         * A lower limit for the strength per unitary volume (or mass), for when
         * there is a range. The concentration attribute then becomes the upper
         * limit.
         */
        public Ratio concentrationLowLimit() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_CONCENTRATION_LOW_LIMIT);
        }

        /**
         * For when strength is measured at a particular point or distance.
         */
        public String measurementPoint() {
            return getString(FhirPropertyNames.PROPERTY_MEASUREMENT_POINT);
        }

        /**
         * The country or countries for which the strength range applies.
         */
        public java.util.List<CodeableConcept> country() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_COUNTRY);
        }

        /**
         * Strength expressed in terms of a reference substance.
         */
        public java.util.List<MedicinalProductIngredientReferenceStrength> referenceStrength() {
            return getList(MedicinalProductIngredientReferenceStrength.class, FhirPropertyNames.PROPERTY_REFERENCE_STRENGTH);
        }

        public static final class Builder extends FhirObject.Builder<MedicinalProductIngredientStrength, MedicinalProductIngredientStrength.Builder> {

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

            public Builder presentation(final Ratio presentation) {
                b.add(FhirPropertyNames.PROPERTY_PRESENTATION, presentation);
                return this;
            }

            public Builder presentationLowLimit(final Ratio presentationLowLimit) {
                b.add(FhirPropertyNames.PROPERTY_PRESENTATION_LOW_LIMIT, presentationLowLimit);
                return this;
            }

            public Builder concentration(final Ratio concentration) {
                b.add(FhirPropertyNames.PROPERTY_CONCENTRATION, concentration);
                return this;
            }

            public Builder concentrationLowLimit(final Ratio concentrationLowLimit) {
                b.add(FhirPropertyNames.PROPERTY_CONCENTRATION_LOW_LIMIT, concentrationLowLimit);
                return this;
            }

            public Builder measurementPoint(final String measurementPoint) {
                b.add(FhirPropertyNames.PROPERTY_MEASUREMENT_POINT, measurementPoint);
                return this;
            }

            public Builder country(final java.util.List<CodeableConcept> country) {
                b.add(FhirPropertyNames.PROPERTY_COUNTRY, FhirObject.toArray(country));
                return this;
            }

            public Builder referenceStrength(final java.util.List<MedicinalProductIngredientReferenceStrength> referenceStrength) {
                b.add(FhirPropertyNames.PROPERTY_REFERENCE_STRENGTH, FhirObject.toArray(referenceStrength));
                return this;
            }

            public MedicinalProductIngredientStrength build() {
                return new MedicinalProductIngredientStrength(b.build());
            }
        }
    }

    /**
     * An ingredient of a manufactured item or pharmaceutical product.
     */
    public static class MedicinalProductIngredientSubstance extends FhirObject {
        public static final String RESOURCE_TYPE = "MedicinalProductIngredientSubstance";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MedicinalProductIngredientSubstance(final JsonObject data) {
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
         * The ingredient substance.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * Quantity of the substance or specified substance present in the
         * manufactured item or pharmaceutical product.
         */
        public java.util.List<MedicinalProductIngredientStrength> strength() {
            return getList(MedicinalProductIngredientStrength.class, FhirPropertyNames.PROPERTY_STRENGTH);
        }

        public static final class Builder extends FhirObject.Builder<MedicinalProductIngredientSubstance, MedicinalProductIngredientSubstance.Builder> {

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

            public Builder strength(final java.util.List<MedicinalProductIngredientStrength> strength) {
                b.add(FhirPropertyNames.PROPERTY_STRENGTH, FhirObject.toArray(strength));
                return this;
            }

            public MedicinalProductIngredientSubstance build() {
                return new MedicinalProductIngredientSubstance(b.build());
            }
        }
    }
}
