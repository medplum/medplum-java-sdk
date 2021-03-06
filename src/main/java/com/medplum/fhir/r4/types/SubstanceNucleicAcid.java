/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Nucleic acids are defined by three distinct elements: the base, sugar
 * and linkage. Individual substance/moiety IDs will be created for each
 * of these elements. The nucleotide sequence will be always entered in
 * the 5&rsquo;-3&rsquo; direction.
 */
public class SubstanceNucleicAcid extends DomainResource {
    public static final String RESOURCE_TYPE = "SubstanceNucleicAcid";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SubstanceNucleicAcid(final JsonObject data) {
        super(data);
    }

    /**
     * The type of the sequence shall be specified based on a controlled
     * vocabulary.
     */
    public CodeableConcept sequenceType() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_SEQUENCE_TYPE);
    }

    /**
     * The number of linear sequences of nucleotides linked through
     * phosphodiester bonds shall be described. Subunits would be strands of
     * nucleic acids that are tightly associated typically through
     * Watson-Crick base pairing. NOTE: If not specified in the reference
     * source, the assumption is that there is 1 subunit.
     */
    public Integer numberOfSubunits() {
        return data.getInt(FhirPropertyNames.PROPERTY_NUMBER_OF_SUBUNITS);
    }

    /**
     * The area of hybridisation shall be described if applicable for double
     * stranded RNA or DNA. The number associated with the subunit followed
     * by the number associated to the residue shall be specified in
     * increasing order. The underscore &ldquo;&rdquo; shall be used as separator as
     * follows: &ldquo;Subunitnumber Residue&rdquo;.
     */
    public String areaOfHybridisation() {
        return getString(FhirPropertyNames.PROPERTY_AREA_OF_HYBRIDISATION);
    }

    /**
     * (TBC).
     */
    public CodeableConcept oligoNucleotideType() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_OLIGO_NUCLEOTIDE_TYPE);
    }

    /**
     * Subunits are listed in order of decreasing length; sequences of the
     * same length will be ordered by molecular weight; subunits that have
     * identical sequences will be repeated multiple times.
     */
    public java.util.List<SubstanceNucleicAcidSubunit> subunit() {
        return getList(SubstanceNucleicAcidSubunit.class, FhirPropertyNames.PROPERTY_SUBUNIT);
    }

    public static final class Builder extends DomainResource.Builder<SubstanceNucleicAcid, SubstanceNucleicAcid.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder sequenceType(final CodeableConcept sequenceType) {
            b.add(FhirPropertyNames.PROPERTY_SEQUENCE_TYPE, sequenceType);
            return this;
        }

        public Builder numberOfSubunits(final Integer numberOfSubunits) {
            b.add(FhirPropertyNames.PROPERTY_NUMBER_OF_SUBUNITS, numberOfSubunits);
            return this;
        }

        public Builder areaOfHybridisation(final String areaOfHybridisation) {
            b.add(FhirPropertyNames.PROPERTY_AREA_OF_HYBRIDISATION, areaOfHybridisation);
            return this;
        }

        public Builder oligoNucleotideType(final CodeableConcept oligoNucleotideType) {
            b.add(FhirPropertyNames.PROPERTY_OLIGO_NUCLEOTIDE_TYPE, oligoNucleotideType);
            return this;
        }

        public Builder subunit(final java.util.List<SubstanceNucleicAcidSubunit> subunit) {
            b.add(FhirPropertyNames.PROPERTY_SUBUNIT, FhirObject.toArray(subunit));
            return this;
        }

        public SubstanceNucleicAcid build() {
            return new SubstanceNucleicAcid(b.build());
        }
    }

    /**
     * Nucleic acids are defined by three distinct elements: the base, sugar
     * and linkage. Individual substance/moiety IDs will be created for each
     * of these elements. The nucleotide sequence will be always entered in
     * the 5&rsquo;-3&rsquo; direction.
     */
    public static class SubstanceNucleicAcidLinkage extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceNucleicAcidLinkage";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceNucleicAcidLinkage(final JsonObject data) {
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
         * The entity that links the sugar residues together should also be
         * captured for nearly all naturally occurring nucleic acid the linkage
         * is a phosphate group. For many synthetic oligonucleotides
         * phosphorothioate linkages are often seen. Linkage connectivity is
         * assumed to be 3&rsquo;-5&rsquo;. If the linkage is either 3&rsquo;-3&rsquo; or 5&rsquo;-5&rsquo; this
         * should be specified.
         */
        public String connectivity() {
            return getString(FhirPropertyNames.PROPERTY_CONNECTIVITY);
        }

        /**
         * Each linkage will be registered as a fragment and have an ID.
         */
        public Identifier identifier() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
        }

        /**
         * Each linkage will be registered as a fragment and have at least one
         * name. A single name shall be assigned to each linkage.
         */
        public String name() {
            return getString(FhirPropertyNames.PROPERTY_NAME);
        }

        /**
         * Residues shall be captured as described in 5.3.6.8.3.
         */
        public String residueSite() {
            return getString(FhirPropertyNames.PROPERTY_RESIDUE_SITE);
        }

        public static final class Builder extends FhirObject.Builder<SubstanceNucleicAcidLinkage, SubstanceNucleicAcidLinkage.Builder> {

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

            public Builder connectivity(final String connectivity) {
                b.add(FhirPropertyNames.PROPERTY_CONNECTIVITY, connectivity);
                return this;
            }

            public Builder identifier(final Identifier identifier) {
                b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, identifier);
                return this;
            }

            public Builder name(final String name) {
                b.add(FhirPropertyNames.PROPERTY_NAME, name);
                return this;
            }

            public Builder residueSite(final String residueSite) {
                b.add(FhirPropertyNames.PROPERTY_RESIDUE_SITE, residueSite);
                return this;
            }

            public SubstanceNucleicAcidLinkage build() {
                return new SubstanceNucleicAcidLinkage(b.build());
            }
        }
    }

    /**
     * Nucleic acids are defined by three distinct elements: the base, sugar
     * and linkage. Individual substance/moiety IDs will be created for each
     * of these elements. The nucleotide sequence will be always entered in
     * the 5&rsquo;-3&rsquo; direction.
     */
    public static class SubstanceNucleicAcidSubunit extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceNucleicAcidSubunit";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceNucleicAcidSubunit(final JsonObject data) {
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
         * Index of linear sequences of nucleic acids in order of decreasing
         * length. Sequences of the same length will be ordered by molecular
         * weight. Subunits that have identical sequences will be repeated and
         * have sequential subscripts.
         */
        public Integer subunit() {
            return data.getInt(FhirPropertyNames.PROPERTY_SUBUNIT);
        }

        /**
         * Actual nucleotide sequence notation from 5' to 3' end using standard
         * single letter codes. In addition to the base sequence, sugar and type
         * of phosphate or non-phosphate linkage should also be captured.
         */
        public String sequence() {
            return getString(FhirPropertyNames.PROPERTY_SEQUENCE);
        }

        /**
         * The length of the sequence shall be captured.
         */
        public Integer length() {
            return data.getInt(FhirPropertyNames.PROPERTY_LENGTH);
        }

        /**
         * (TBC).
         */
        public Attachment sequenceAttachment() {
            return getObject(Attachment.class, FhirPropertyNames.PROPERTY_SEQUENCE_ATTACHMENT);
        }

        /**
         * The nucleotide present at the 5&rsquo; terminal shall be specified based on
         * a controlled vocabulary. Since the sequence is represented from the 5'
         * to the 3' end, the 5&rsquo; prime nucleotide is the letter at the first
         * position in the sequence. A separate representation would be
         * redundant.
         */
        public CodeableConcept fivePrime() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_FIVE_PRIME);
        }

        /**
         * The nucleotide present at the 3&rsquo; terminal shall be specified based on
         * a controlled vocabulary. Since the sequence is represented from the 5'
         * to the 3' end, the 5&rsquo; prime nucleotide is the letter at the last
         * position in the sequence. A separate representation would be
         * redundant.
         */
        public CodeableConcept threePrime() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_THREE_PRIME);
        }

        /**
         * The linkages between sugar residues will also be captured.
         */
        public java.util.List<SubstanceNucleicAcidLinkage> linkage() {
            return getList(SubstanceNucleicAcidLinkage.class, FhirPropertyNames.PROPERTY_LINKAGE);
        }

        /**
         * 5.3.6.8.1 Sugar ID (Mandatory).
         */
        public java.util.List<SubstanceNucleicAcidSugar> sugar() {
            return getList(SubstanceNucleicAcidSugar.class, FhirPropertyNames.PROPERTY_SUGAR);
        }

        public static final class Builder extends FhirObject.Builder<SubstanceNucleicAcidSubunit, SubstanceNucleicAcidSubunit.Builder> {

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

            public Builder subunit(final Integer subunit) {
                b.add(FhirPropertyNames.PROPERTY_SUBUNIT, subunit);
                return this;
            }

            public Builder sequence(final String sequence) {
                b.add(FhirPropertyNames.PROPERTY_SEQUENCE, sequence);
                return this;
            }

            public Builder length(final Integer length) {
                b.add(FhirPropertyNames.PROPERTY_LENGTH, length);
                return this;
            }

            public Builder sequenceAttachment(final Attachment sequenceAttachment) {
                b.add(FhirPropertyNames.PROPERTY_SEQUENCE_ATTACHMENT, sequenceAttachment);
                return this;
            }

            public Builder fivePrime(final CodeableConcept fivePrime) {
                b.add(FhirPropertyNames.PROPERTY_FIVE_PRIME, fivePrime);
                return this;
            }

            public Builder threePrime(final CodeableConcept threePrime) {
                b.add(FhirPropertyNames.PROPERTY_THREE_PRIME, threePrime);
                return this;
            }

            public Builder linkage(final java.util.List<SubstanceNucleicAcidLinkage> linkage) {
                b.add(FhirPropertyNames.PROPERTY_LINKAGE, FhirObject.toArray(linkage));
                return this;
            }

            public Builder sugar(final java.util.List<SubstanceNucleicAcidSugar> sugar) {
                b.add(FhirPropertyNames.PROPERTY_SUGAR, FhirObject.toArray(sugar));
                return this;
            }

            public SubstanceNucleicAcidSubunit build() {
                return new SubstanceNucleicAcidSubunit(b.build());
            }
        }
    }

    /**
     * Nucleic acids are defined by three distinct elements: the base, sugar
     * and linkage. Individual substance/moiety IDs will be created for each
     * of these elements. The nucleotide sequence will be always entered in
     * the 5&rsquo;-3&rsquo; direction.
     */
    public static class SubstanceNucleicAcidSugar extends FhirObject {
        public static final String RESOURCE_TYPE = "SubstanceNucleicAcidSugar";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubstanceNucleicAcidSugar(final JsonObject data) {
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
         * The Substance ID of the sugar or sugar-like component that make up the
         * nucleotide.
         */
        public Identifier identifier() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
        }

        /**
         * The name of the sugar or sugar-like component that make up the
         * nucleotide.
         */
        public String name() {
            return getString(FhirPropertyNames.PROPERTY_NAME);
        }

        /**
         * The residues that contain a given sugar will be captured. The order of
         * given residues will be captured in the 5&lsquo;-3&lsquo;direction consistent with
         * the base sequences listed above.
         */
        public String residueSite() {
            return getString(FhirPropertyNames.PROPERTY_RESIDUE_SITE);
        }

        public static final class Builder extends FhirObject.Builder<SubstanceNucleicAcidSugar, SubstanceNucleicAcidSugar.Builder> {

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

            public Builder identifier(final Identifier identifier) {
                b.add(FhirPropertyNames.PROPERTY_IDENTIFIER, identifier);
                return this;
            }

            public Builder name(final String name) {
                b.add(FhirPropertyNames.PROPERTY_NAME, name);
                return this;
            }

            public Builder residueSite(final String residueSite) {
                b.add(FhirPropertyNames.PROPERTY_RESIDUE_SITE, residueSite);
                return this;
            }

            public SubstanceNucleicAcidSugar build() {
                return new SubstanceNucleicAcidSugar(b.build());
            }
        }
    }
}
