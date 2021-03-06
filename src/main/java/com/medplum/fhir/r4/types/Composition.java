/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A set of healthcare-related information that is assembled together
 * into a single logical package that provides a single coherent
 * statement of meaning, establishes its own context and that has
 * clinical attestation with regard to who is making the statement. A
 * Composition defines the structure and narrative content necessary for
 * a document. However, a Composition alone does not constitute a
 * document. Rather, the Composition must be the first entry in a Bundle
 * where Bundle.type=document, and any other resources referenced from
 * Composition must be included as subsequent entries in the Bundle (for
 * example Patient, Practitioner, Encounter, etc.).
 */
public class Composition extends DomainResource {
    public static final String RESOURCE_TYPE = "Composition";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Composition(final JsonObject data) {
        super(data);
    }

    /**
     * A version-independent identifier for the Composition. This identifier
     * stays constant as the composition is changed over time.
     */
    public Identifier identifier() {
        return getObject(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The workflow/clinical status of this composition. The status is a
     * marker for the clinical standing of the document.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Specifies the particular kind of composition (e.g. History and
     * Physical, Discharge Summary, Progress Note). This usually equates to
     * the purpose of making the composition.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * A categorization for the type of the composition - helps for indexing
     * and searching. This may be implied by or derived from the code
     * specified in the Composition Type.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * Who or what the composition is about. The composition can be about a
     * person, (patient or healthcare practitioner), a device (e.g. a
     * machine) or even a group of subjects (such as a document about a herd
     * of livestock, or a set of patients that share a common exposure).
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * Describes the clinical encounter or type of care this documentation is
     * associated with.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * The composition editing time, when the composition was last logically
     * changed by the author.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * Identifies who is responsible for the information in the composition,
     * not necessarily who typed it in.
     */
    public java.util.List<Reference> author() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_AUTHOR);
    }

    /**
     * Official human-readable label for the composition.
     */
    public String title() {
        return getString(FhirPropertyNames.PROPERTY_TITLE);
    }

    /**
     * The code specifying the level of confidentiality of the Composition.
     */
    public String confidentiality() {
        return getString(FhirPropertyNames.PROPERTY_CONFIDENTIALITY);
    }

    /**
     * A participant who has attested to the accuracy of the
     * composition/document.
     */
    public java.util.List<CompositionAttester> attester() {
        return getList(CompositionAttester.class, FhirPropertyNames.PROPERTY_ATTESTER);
    }

    /**
     * Identifies the organization or group who is responsible for ongoing
     * maintenance of and access to the composition/document information.
     */
    public Reference custodian() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_CUSTODIAN);
    }

    /**
     * Relationships that this composition has with other compositions or
     * documents that already exist.
     */
    public java.util.List<CompositionRelatesTo> relatesTo() {
        return getList(CompositionRelatesTo.class, FhirPropertyNames.PROPERTY_RELATES_TO);
    }

    /**
     * The clinical service, such as a colonoscopy or an appendectomy, being
     * documented.
     */
    public java.util.List<CompositionEvent> event() {
        return getList(CompositionEvent.class, FhirPropertyNames.PROPERTY_EVENT);
    }

    /**
     * The root of the sections that make up the composition.
     */
    public java.util.List<CompositionSection> section() {
        return getList(CompositionSection.class, FhirPropertyNames.PROPERTY_SECTION);
    }

    public static final class Builder extends DomainResource.Builder<Composition, Composition.Builder> {

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

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
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

        public Builder author(final java.util.List<Reference> author) {
            b.add(FhirPropertyNames.PROPERTY_AUTHOR, FhirObject.toArray(author));
            return this;
        }

        public Builder title(final String title) {
            b.add(FhirPropertyNames.PROPERTY_TITLE, title);
            return this;
        }

        public Builder confidentiality(final String confidentiality) {
            b.add(FhirPropertyNames.PROPERTY_CONFIDENTIALITY, confidentiality);
            return this;
        }

        public Builder attester(final java.util.List<CompositionAttester> attester) {
            b.add(FhirPropertyNames.PROPERTY_ATTESTER, FhirObject.toArray(attester));
            return this;
        }

        public Builder custodian(final Reference custodian) {
            b.add(FhirPropertyNames.PROPERTY_CUSTODIAN, custodian);
            return this;
        }

        public Builder relatesTo(final java.util.List<CompositionRelatesTo> relatesTo) {
            b.add(FhirPropertyNames.PROPERTY_RELATES_TO, FhirObject.toArray(relatesTo));
            return this;
        }

        public Builder event(final java.util.List<CompositionEvent> event) {
            b.add(FhirPropertyNames.PROPERTY_EVENT, FhirObject.toArray(event));
            return this;
        }

        public Builder section(final java.util.List<CompositionSection> section) {
            b.add(FhirPropertyNames.PROPERTY_SECTION, FhirObject.toArray(section));
            return this;
        }

        public Composition build() {
            return new Composition(b.build());
        }
    }

    /**
     * A set of healthcare-related information that is assembled together
     * into a single logical package that provides a single coherent
     * statement of meaning, establishes its own context and that has
     * clinical attestation with regard to who is making the statement. A
     * Composition defines the structure and narrative content necessary for
     * a document. However, a Composition alone does not constitute a
     * document. Rather, the Composition must be the first entry in a Bundle
     * where Bundle.type=document, and any other resources referenced from
     * Composition must be included as subsequent entries in the Bundle (for
     * example Patient, Practitioner, Encounter, etc.).
     */
    public static class CompositionAttester extends FhirObject {
        public static final String RESOURCE_TYPE = "CompositionAttester";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompositionAttester(final JsonObject data) {
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
         * The type of attestation the authenticator offers.
         */
        public String mode() {
            return getString(FhirPropertyNames.PROPERTY_MODE);
        }

        /**
         * When the composition was attested by the party.
         */
        public java.time.Instant time() {
            return getInstant(FhirPropertyNames.PROPERTY_TIME);
        }

        /**
         * Who attested the composition in the specified way.
         */
        public Reference party() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_PARTY);
        }

        public static final class Builder extends FhirObject.Builder<CompositionAttester, CompositionAttester.Builder> {

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

            public Builder mode(final String mode) {
                b.add(FhirPropertyNames.PROPERTY_MODE, mode);
                return this;
            }

            public Builder time(final java.time.Instant time) {
                b.add(FhirPropertyNames.PROPERTY_TIME, time.toString());
                return this;
            }

            public Builder party(final Reference party) {
                b.add(FhirPropertyNames.PROPERTY_PARTY, party);
                return this;
            }

            public CompositionAttester build() {
                return new CompositionAttester(b.build());
            }
        }
    }

    /**
     * A set of healthcare-related information that is assembled together
     * into a single logical package that provides a single coherent
     * statement of meaning, establishes its own context and that has
     * clinical attestation with regard to who is making the statement. A
     * Composition defines the structure and narrative content necessary for
     * a document. However, a Composition alone does not constitute a
     * document. Rather, the Composition must be the first entry in a Bundle
     * where Bundle.type=document, and any other resources referenced from
     * Composition must be included as subsequent entries in the Bundle (for
     * example Patient, Practitioner, Encounter, etc.).
     */
    public static class CompositionEvent extends FhirObject {
        public static final String RESOURCE_TYPE = "CompositionEvent";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompositionEvent(final JsonObject data) {
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
         * This list of codes represents the main clinical acts, such as a
         * colonoscopy or an appendectomy, being documented. In some cases, the
         * event is inherent in the typeCode, such as a &quot;History and Physical
         * Report&quot; in which the procedure being documented is necessarily a
         * &quot;History and Physical&quot; act.
         */
        public java.util.List<CodeableConcept> code() {
            return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * The period of time covered by the documentation. There is no assertion
         * that the documentation is a complete representation for this period,
         * only that it documents events during this time.
         */
        public Period period() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
        }

        /**
         * The description and/or reference of the event(s) being documented. For
         * example, this could be used to document such a colonoscopy or an
         * appendectomy.
         */
        public java.util.List<Reference> detail() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_DETAIL);
        }

        public static final class Builder extends FhirObject.Builder<CompositionEvent, CompositionEvent.Builder> {

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

            public Builder code(final java.util.List<CodeableConcept> code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, FhirObject.toArray(code));
                return this;
            }

            public Builder period(final Period period) {
                b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
                return this;
            }

            public Builder detail(final java.util.List<Reference> detail) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL, FhirObject.toArray(detail));
                return this;
            }

            public CompositionEvent build() {
                return new CompositionEvent(b.build());
            }
        }
    }

    /**
     * A set of healthcare-related information that is assembled together
     * into a single logical package that provides a single coherent
     * statement of meaning, establishes its own context and that has
     * clinical attestation with regard to who is making the statement. A
     * Composition defines the structure and narrative content necessary for
     * a document. However, a Composition alone does not constitute a
     * document. Rather, the Composition must be the first entry in a Bundle
     * where Bundle.type=document, and any other resources referenced from
     * Composition must be included as subsequent entries in the Bundle (for
     * example Patient, Practitioner, Encounter, etc.).
     */
    public static class CompositionRelatesTo extends FhirObject {
        public static final String RESOURCE_TYPE = "CompositionRelatesTo";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompositionRelatesTo(final JsonObject data) {
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
         * The type of relationship that this composition has with anther
         * composition or document.
         */
        public String code() {
            return getString(FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * The target composition/document of this relationship.
         */
        public Identifier targetIdentifier() {
            return getObject(Identifier.class, FhirPropertyNames.PROPERTY_TARGET_IDENTIFIER);
        }

        /**
         * The target composition/document of this relationship.
         */
        public Reference targetReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_TARGET_REFERENCE);
        }

        public static final class Builder extends FhirObject.Builder<CompositionRelatesTo, CompositionRelatesTo.Builder> {

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

            public Builder code(final String code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder targetIdentifier(final Identifier targetIdentifier) {
                b.add(FhirPropertyNames.PROPERTY_TARGET_IDENTIFIER, targetIdentifier);
                return this;
            }

            public Builder targetReference(final Reference targetReference) {
                b.add(FhirPropertyNames.PROPERTY_TARGET_REFERENCE, targetReference);
                return this;
            }

            public CompositionRelatesTo build() {
                return new CompositionRelatesTo(b.build());
            }
        }
    }

    /**
     * A set of healthcare-related information that is assembled together
     * into a single logical package that provides a single coherent
     * statement of meaning, establishes its own context and that has
     * clinical attestation with regard to who is making the statement. A
     * Composition defines the structure and narrative content necessary for
     * a document. However, a Composition alone does not constitute a
     * document. Rather, the Composition must be the first entry in a Bundle
     * where Bundle.type=document, and any other resources referenced from
     * Composition must be included as subsequent entries in the Bundle (for
     * example Patient, Practitioner, Encounter, etc.).
     */
    public static class CompositionSection extends FhirObject {
        public static final String RESOURCE_TYPE = "CompositionSection";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public CompositionSection(final JsonObject data) {
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
         * The label for this particular section.  This will be part of the
         * rendered content for the document, and is often used to build a table
         * of contents.
         */
        public String title() {
            return getString(FhirPropertyNames.PROPERTY_TITLE);
        }

        /**
         * A code identifying the kind of content contained within the section.
         * This must be consistent with the section title.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * Identifies who is responsible for the information in this section, not
         * necessarily who typed it in.
         */
        public java.util.List<Reference> author() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_AUTHOR);
        }

        /**
         * The actual focus of the section when it is not the subject of the
         * composition, but instead represents something or someone associated
         * with the subject such as (for a patient subject) a spouse, parent,
         * fetus, or donor. If not focus is specified, the focus is assumed to be
         * focus of the parent section, or, for a section in the Composition
         * itself, the subject of the composition. Sections with a focus SHALL
         * only include resources where the logical subject (patient, subject,
         * focus, etc.) matches the section focus, or the resources have no
         * logical subject (few resources).
         */
        public Reference focus() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_FOCUS);
        }

        /**
         * A human-readable narrative that contains the attested content of the
         * section, used to represent the content of the resource to a human. The
         * narrative need not encode all the structured data, but is required to
         * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
         * just read the narrative.
         */
        public Narrative text() {
            return getObject(Narrative.class, FhirPropertyNames.PROPERTY_TEXT);
        }

        /**
         * How the entry list was prepared - whether it is a working list that is
         * suitable for being maintained on an ongoing basis, or if it represents
         * a snapshot of a list of items from another source, or whether it is a
         * prepared list where items may be marked as added, modified or deleted.
         */
        public String mode() {
            return getString(FhirPropertyNames.PROPERTY_MODE);
        }

        /**
         * Specifies the order applied to the items in the section entries.
         */
        public CodeableConcept orderedBy() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ORDERED_BY);
        }

        /**
         * A reference to the actual resource from which the narrative in the
         * section is derived.
         */
        public java.util.List<Reference> entry() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_ENTRY);
        }

        /**
         * If the section is empty, why the list is empty. An empty section
         * typically has some text explaining the empty reason.
         */
        public CodeableConcept emptyReason() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_EMPTY_REASON);
        }

        /**
         * A nested sub-section within this section.
         */
        public java.util.List<CompositionSection> section() {
            return getList(CompositionSection.class, FhirPropertyNames.PROPERTY_SECTION);
        }

        public static final class Builder extends FhirObject.Builder<CompositionSection, CompositionSection.Builder> {

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

            public Builder title(final String title) {
                b.add(FhirPropertyNames.PROPERTY_TITLE, title);
                return this;
            }

            public Builder code(final CodeableConcept code) {
                b.add(FhirPropertyNames.PROPERTY_CODE, code);
                return this;
            }

            public Builder author(final java.util.List<Reference> author) {
                b.add(FhirPropertyNames.PROPERTY_AUTHOR, FhirObject.toArray(author));
                return this;
            }

            public Builder focus(final Reference focus) {
                b.add(FhirPropertyNames.PROPERTY_FOCUS, focus);
                return this;
            }

            public Builder text(final Narrative text) {
                b.add(FhirPropertyNames.PROPERTY_TEXT, text);
                return this;
            }

            public Builder mode(final String mode) {
                b.add(FhirPropertyNames.PROPERTY_MODE, mode);
                return this;
            }

            public Builder orderedBy(final CodeableConcept orderedBy) {
                b.add(FhirPropertyNames.PROPERTY_ORDERED_BY, orderedBy);
                return this;
            }

            public Builder entry(final java.util.List<Reference> entry) {
                b.add(FhirPropertyNames.PROPERTY_ENTRY, FhirObject.toArray(entry));
                return this;
            }

            public Builder emptyReason(final CodeableConcept emptyReason) {
                b.add(FhirPropertyNames.PROPERTY_EMPTY_REASON, emptyReason);
                return this;
            }

            public Builder section(final java.util.List<CompositionSection> section) {
                b.add(FhirPropertyNames.PROPERTY_SECTION, FhirObject.toArray(section));
                return this;
            }

            public CompositionSection build() {
                return new CompositionSection(b.build());
            }
        }
    }
}
