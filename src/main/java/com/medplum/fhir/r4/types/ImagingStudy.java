/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Representation of the content produced in a DICOM imaging study. A
 * study comprises a set of series, each of which includes a set of
 * Service-Object Pair Instances (SOP Instances - images or other data)
 * acquired or produced in a common context.  A series is of only one
 * modality (e.g. X-ray, CT, MR, ultrasound), but a study may have
 * multiple series of different modalities.
 */
public class ImagingStudy extends DomainResource {
    public static final String RESOURCE_TYPE = "ImagingStudy";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public ImagingStudy(final JsonObject data) {
        super(data);
    }

    /**
     * Identifiers for the ImagingStudy such as DICOM Study Instance UID, and
     * Accession Number.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The current state of the ImagingStudy.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * A list of all the series.modality values that are actual acquisition
     * modalities, i.e. those in the DICOM Context Group 29 (value set OID
     * 1.2.840.10008.6.1.19).
     */
    public java.util.List<Coding> modality() {
        return getList(Coding.class, FhirPropertyNames.PROPERTY_MODALITY);
    }

    /**
     * The subject, typically a patient, of the imaging study.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The healthcare event (e.g. a patient and healthcare provider
     * interaction) during which this ImagingStudy is made.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * Date and time the study started.
     */
    public java.time.Instant started() {
        return getInstant(FhirPropertyNames.PROPERTY_STARTED);
    }

    /**
     * A list of the diagnostic requests that resulted in this imaging study
     * being performed.
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_BASED_ON);
    }

    /**
     * The requesting/referring physician.
     */
    public Reference referrer() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_REFERRER);
    }

    /**
     * Who read the study and interpreted the images or other content.
     */
    public java.util.List<Reference> interpreter() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_INTERPRETER);
    }

    /**
     * The network service providing access (e.g., query, view, or retrieval)
     * for the study. See implementation notes for information about using
     * DICOM endpoints. A study-level endpoint applies to each series in the
     * study, unless overridden by a series-level endpoint with the same
     * Endpoint.connectionType.
     */
    public java.util.List<Reference> endpoint() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_ENDPOINT);
    }

    /**
     * Number of Series in the Study. This value given may be larger than the
     * number of series elements this Resource contains due to resource
     * availability, security, or other factors. This element should be
     * present if any series elements are present.
     */
    public Integer numberOfSeries() {
        return data.getInt(FhirPropertyNames.PROPERTY_NUMBER_OF_SERIES);
    }

    /**
     * Number of SOP Instances in Study. This value given may be larger than
     * the number of instance elements this resource contains due to resource
     * availability, security, or other factors. This element should be
     * present if any instance elements are present.
     */
    public Integer numberOfInstances() {
        return data.getInt(FhirPropertyNames.PROPERTY_NUMBER_OF_INSTANCES);
    }

    /**
     * The procedure which this ImagingStudy was part of.
     */
    public Reference procedureReference() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_PROCEDURE_REFERENCE);
    }

    /**
     * The code for the performed procedure type.
     */
    public java.util.List<CodeableConcept> procedureCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_PROCEDURE_CODE);
    }

    /**
     * The principal physical location where the ImagingStudy was performed.
     */
    public Reference location() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_LOCATION);
    }

    /**
     * Description of clinical condition indicating why the ImagingStudy was
     * requested.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON_CODE);
    }

    /**
     * Indicates another resource whose existence justifies this Study.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REASON_REFERENCE);
    }

    /**
     * Per the recommended DICOM mapping, this element is derived from the
     * Study Description attribute (0008,1030). Observations or findings
     * about the imaging study should be recorded in another resource, e.g.
     * Observation, and not in this element.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    /**
     * The Imaging Manager description of the study. Institution-generated
     * description or classification of the Study (component) performed.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * Each study has one or more series of images or other content.
     */
    public java.util.List<ImagingStudySeries> series() {
        return getList(ImagingStudySeries.class, FhirPropertyNames.PROPERTY_SERIES);
    }

    public static final class Builder extends DomainResource.Builder<ImagingStudy, ImagingStudy.Builder> {

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

        public Builder modality(final java.util.List<Coding> modality) {
            b.add(FhirPropertyNames.PROPERTY_MODALITY, FhirObject.toArray(modality));
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

        public Builder started(final java.time.Instant started) {
            b.add(FhirPropertyNames.PROPERTY_STARTED, started.toString());
            return this;
        }

        public Builder basedOn(final java.util.List<Reference> basedOn) {
            b.add(FhirPropertyNames.PROPERTY_BASED_ON, FhirObject.toArray(basedOn));
            return this;
        }

        public Builder referrer(final Reference referrer) {
            b.add(FhirPropertyNames.PROPERTY_REFERRER, referrer);
            return this;
        }

        public Builder interpreter(final java.util.List<Reference> interpreter) {
            b.add(FhirPropertyNames.PROPERTY_INTERPRETER, FhirObject.toArray(interpreter));
            return this;
        }

        public Builder endpoint(final java.util.List<Reference> endpoint) {
            b.add(FhirPropertyNames.PROPERTY_ENDPOINT, FhirObject.toArray(endpoint));
            return this;
        }

        public Builder numberOfSeries(final Integer numberOfSeries) {
            b.add(FhirPropertyNames.PROPERTY_NUMBER_OF_SERIES, numberOfSeries);
            return this;
        }

        public Builder numberOfInstances(final Integer numberOfInstances) {
            b.add(FhirPropertyNames.PROPERTY_NUMBER_OF_INSTANCES, numberOfInstances);
            return this;
        }

        public Builder procedureReference(final Reference procedureReference) {
            b.add(FhirPropertyNames.PROPERTY_PROCEDURE_REFERENCE, procedureReference);
            return this;
        }

        public Builder procedureCode(final java.util.List<CodeableConcept> procedureCode) {
            b.add(FhirPropertyNames.PROPERTY_PROCEDURE_CODE, FhirObject.toArray(procedureCode));
            return this;
        }

        public Builder location(final Reference location) {
            b.add(FhirPropertyNames.PROPERTY_LOCATION, location);
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

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder series(final java.util.List<ImagingStudySeries> series) {
            b.add(FhirPropertyNames.PROPERTY_SERIES, FhirObject.toArray(series));
            return this;
        }

        public ImagingStudy build() {
            return new ImagingStudy(b.build());
        }
    }

    /**
     * Representation of the content produced in a DICOM imaging study. A
     * study comprises a set of series, each of which includes a set of
     * Service-Object Pair Instances (SOP Instances - images or other data)
     * acquired or produced in a common context.  A series is of only one
     * modality (e.g. X-ray, CT, MR, ultrasound), but a study may have
     * multiple series of different modalities.
     */
    public static class ImagingStudyInstance extends FhirObject {
        public static final String RESOURCE_TYPE = "ImagingStudyInstance";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ImagingStudyInstance(final JsonObject data) {
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
         * The DICOM SOP Instance UID for this image or other DICOM content.
         */
        public String uid() {
            return getString(FhirPropertyNames.PROPERTY_UID);
        }

        /**
         * DICOM instance  type.
         */
        public Coding sopClass() {
            return getObject(Coding.class, FhirPropertyNames.PROPERTY_SOP_CLASS);
        }

        /**
         * The number of instance in the series.
         */
        public Integer number() {
            return data.getInt(FhirPropertyNames.PROPERTY_NUMBER);
        }

        /**
         * The description of the instance.
         */
        public String title() {
            return getString(FhirPropertyNames.PROPERTY_TITLE);
        }

        public static final class Builder extends FhirObject.Builder<ImagingStudyInstance, ImagingStudyInstance.Builder> {

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

            public Builder uid(final String uid) {
                b.add(FhirPropertyNames.PROPERTY_UID, uid);
                return this;
            }

            public Builder sopClass(final Coding sopClass) {
                b.add(FhirPropertyNames.PROPERTY_SOP_CLASS, sopClass);
                return this;
            }

            public Builder number(final Integer number) {
                b.add(FhirPropertyNames.PROPERTY_NUMBER, number);
                return this;
            }

            public Builder title(final String title) {
                b.add(FhirPropertyNames.PROPERTY_TITLE, title);
                return this;
            }

            public ImagingStudyInstance build() {
                return new ImagingStudyInstance(b.build());
            }
        }
    }

    /**
     * Representation of the content produced in a DICOM imaging study. A
     * study comprises a set of series, each of which includes a set of
     * Service-Object Pair Instances (SOP Instances - images or other data)
     * acquired or produced in a common context.  A series is of only one
     * modality (e.g. X-ray, CT, MR, ultrasound), but a study may have
     * multiple series of different modalities.
     */
    public static class ImagingStudyPerformer extends FhirObject {
        public static final String RESOURCE_TYPE = "ImagingStudyPerformer";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ImagingStudyPerformer(final JsonObject data) {
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
         * Distinguishes the type of involvement of the performer in the series.
         */
        public CodeableConcept function() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_FUNCTION);
        }

        /**
         * Indicates who or what performed the series.
         */
        public Reference actor() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ACTOR);
        }

        public static final class Builder extends FhirObject.Builder<ImagingStudyPerformer, ImagingStudyPerformer.Builder> {

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

            public Builder function(final CodeableConcept function) {
                b.add(FhirPropertyNames.PROPERTY_FUNCTION, function);
                return this;
            }

            public Builder actor(final Reference actor) {
                b.add(FhirPropertyNames.PROPERTY_ACTOR, actor);
                return this;
            }

            public ImagingStudyPerformer build() {
                return new ImagingStudyPerformer(b.build());
            }
        }
    }

    /**
     * Representation of the content produced in a DICOM imaging study. A
     * study comprises a set of series, each of which includes a set of
     * Service-Object Pair Instances (SOP Instances - images or other data)
     * acquired or produced in a common context.  A series is of only one
     * modality (e.g. X-ray, CT, MR, ultrasound), but a study may have
     * multiple series of different modalities.
     */
    public static class ImagingStudySeries extends FhirObject {
        public static final String RESOURCE_TYPE = "ImagingStudySeries";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ImagingStudySeries(final JsonObject data) {
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
         * The DICOM Series Instance UID for the series.
         */
        public String uid() {
            return getString(FhirPropertyNames.PROPERTY_UID);
        }

        /**
         * The numeric identifier of this series in the study.
         */
        public Integer number() {
            return data.getInt(FhirPropertyNames.PROPERTY_NUMBER);
        }

        /**
         * The modality of this series sequence.
         */
        public Coding modality() {
            return getObject(Coding.class, FhirPropertyNames.PROPERTY_MODALITY);
        }

        /**
         * A description of the series.
         */
        public String description() {
            return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
        }

        /**
         * Number of SOP Instances in the Study. The value given may be larger
         * than the number of instance elements this resource contains due to
         * resource availability, security, or other factors. This element should
         * be present if any instance elements are present.
         */
        public Integer numberOfInstances() {
            return data.getInt(FhirPropertyNames.PROPERTY_NUMBER_OF_INSTANCES);
        }

        /**
         * The network service providing access (e.g., query, view, or retrieval)
         * for this series. See implementation notes for information about using
         * DICOM endpoints. A series-level endpoint, if present, has precedence
         * over a study-level endpoint with the same Endpoint.connectionType.
         */
        public java.util.List<Reference> endpoint() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_ENDPOINT);
        }

        /**
         * The anatomic structures examined. See DICOM Part 16 Annex L
         * (http://dicom.nema.org/medical/dicom/current/output/chtml/part16/chapter_L.html)
         * for DICOM to SNOMED-CT mappings. The bodySite may indicate the
         * laterality of body part imaged; if so, it shall be consistent with any
         * content of ImagingStudy.series.laterality.
         */
        public Coding bodySite() {
            return getObject(Coding.class, FhirPropertyNames.PROPERTY_BODY_SITE);
        }

        /**
         * The laterality of the (possibly paired) anatomic structures examined.
         * E.g., the left knee, both lungs, or unpaired abdomen. If present,
         * shall be consistent with any laterality information indicated in
         * ImagingStudy.series.bodySite.
         */
        public Coding laterality() {
            return getObject(Coding.class, FhirPropertyNames.PROPERTY_LATERALITY);
        }

        /**
         * The specimen imaged, e.g., for whole slide imaging of a biopsy.
         */
        public java.util.List<Reference> specimen() {
            return getList(Reference.class, FhirPropertyNames.PROPERTY_SPECIMEN);
        }

        /**
         * The date and time the series was started.
         */
        public java.time.Instant started() {
            return getInstant(FhirPropertyNames.PROPERTY_STARTED);
        }

        /**
         * Indicates who or what performed the series and how they were involved.
         */
        public java.util.List<ImagingStudyPerformer> performer() {
            return getList(ImagingStudyPerformer.class, FhirPropertyNames.PROPERTY_PERFORMER);
        }

        /**
         * A single SOP instance within the series, e.g. an image, or
         * presentation state.
         */
        public java.util.List<ImagingStudyInstance> instance() {
            return getList(ImagingStudyInstance.class, FhirPropertyNames.PROPERTY_INSTANCE);
        }

        public static final class Builder extends FhirObject.Builder<ImagingStudySeries, ImagingStudySeries.Builder> {

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

            public Builder uid(final String uid) {
                b.add(FhirPropertyNames.PROPERTY_UID, uid);
                return this;
            }

            public Builder number(final Integer number) {
                b.add(FhirPropertyNames.PROPERTY_NUMBER, number);
                return this;
            }

            public Builder modality(final Coding modality) {
                b.add(FhirPropertyNames.PROPERTY_MODALITY, modality);
                return this;
            }

            public Builder description(final String description) {
                b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
                return this;
            }

            public Builder numberOfInstances(final Integer numberOfInstances) {
                b.add(FhirPropertyNames.PROPERTY_NUMBER_OF_INSTANCES, numberOfInstances);
                return this;
            }

            public Builder endpoint(final java.util.List<Reference> endpoint) {
                b.add(FhirPropertyNames.PROPERTY_ENDPOINT, FhirObject.toArray(endpoint));
                return this;
            }

            public Builder bodySite(final Coding bodySite) {
                b.add(FhirPropertyNames.PROPERTY_BODY_SITE, bodySite);
                return this;
            }

            public Builder laterality(final Coding laterality) {
                b.add(FhirPropertyNames.PROPERTY_LATERALITY, laterality);
                return this;
            }

            public Builder specimen(final java.util.List<Reference> specimen) {
                b.add(FhirPropertyNames.PROPERTY_SPECIMEN, FhirObject.toArray(specimen));
                return this;
            }

            public Builder started(final java.time.Instant started) {
                b.add(FhirPropertyNames.PROPERTY_STARTED, started.toString());
                return this;
            }

            public Builder performer(final java.util.List<ImagingStudyPerformer> performer) {
                b.add(FhirPropertyNames.PROPERTY_PERFORMER, FhirObject.toArray(performer));
                return this;
            }

            public Builder instance(final java.util.List<ImagingStudyInstance> instance) {
                b.add(FhirPropertyNames.PROPERTY_INSTANCE, FhirObject.toArray(instance));
                return this;
            }

            public ImagingStudySeries build() {
                return new ImagingStudySeries(b.build());
            }
        }
    }
}
