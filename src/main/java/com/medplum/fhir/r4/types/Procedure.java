/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * An action that is or was performed on or for a patient. This can be a
 * physical intervention like an operation, or less invasive like long
 * term services, counseling, or hypnotherapy.
 */
public class Procedure extends DomainResource {
    public static final String RESOURCE_TYPE = "Procedure";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Procedure(final JsonObject data) {
        super(data);
    }

    /**
     * Business identifiers assigned to this procedure by the performer or
     * other systems which remain constant as the resource is updated and is
     * propagated from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The URL pointing to a FHIR-defined protocol, guideline, order set or
     * other definition that is adhered to in whole or in part by this
     * Procedure.
     */
    public java.util.List<String> instantiatesCanonical() {
        return getList(String.class, FhirPropertyNames.PROPERTY_INSTANTIATES_CANONICAL);
    }

    /**
     * The URL pointing to an externally maintained protocol, guideline,
     * order set or other definition that is adhered to in whole or in part
     * by this Procedure.
     */
    public java.util.List<java.net.URI> instantiatesUri() {
        return getList(java.net.URI.class, FhirPropertyNames.PROPERTY_INSTANTIATES_URI);
    }

    /**
     * A reference to a resource that contains details of the request for
     * this procedure.
     */
    public java.util.List<Reference> basedOn() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_BASED_ON);
    }

    /**
     * A larger event of which this particular procedure is a component or
     * step.
     */
    public java.util.List<Reference> partOf() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_PART_OF);
    }

    /**
     * A code specifying the state of the procedure. Generally, this will be
     * the in-progress or completed state.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Captures the reason for the current state of the procedure.
     */
    public CodeableConcept statusReason() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_STATUS_REASON);
    }

    /**
     * A code that classifies the procedure for searching, sorting and
     * display purposes (e.g. &quot;Surgical Procedure&quot;).
     */
    public CodeableConcept category() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * The specific procedure that is performed. Use text if the exact nature
     * of the procedure cannot be coded (e.g. &quot;Laparoscopic Appendectomy&quot;).
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * The person, animal or group on which the procedure was performed.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The Encounter during which this Procedure was created or performed or
     * to which the creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENCOUNTER);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public String performedDateTime() {
        return getString(FhirPropertyNames.PROPERTY_PERFORMED_DATE_TIME);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public Period performedPeriod() {
        return getObject(Period.class, FhirPropertyNames.PROPERTY_PERFORMED_PERIOD);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public String performedString() {
        return getString(FhirPropertyNames.PROPERTY_PERFORMED_STRING);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public Age performedAge() {
        return getObject(Age.class, FhirPropertyNames.PROPERTY_PERFORMED_AGE);
    }

    /**
     * Estimated or actual date, date-time, period, or age when the procedure
     * was performed.  Allows a period to support complex procedures that
     * span more than one date, and also allows for the length of the
     * procedure to be captured.
     */
    public Range performedRange() {
        return getObject(Range.class, FhirPropertyNames.PROPERTY_PERFORMED_RANGE);
    }

    /**
     * Individual who recorded the record and takes responsibility for its
     * content.
     */
    public Reference recorder() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_RECORDER);
    }

    /**
     * Individual who is making the procedure statement.
     */
    public Reference asserter() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_ASSERTER);
    }

    /**
     * Limited to &quot;real&quot; people rather than equipment.
     */
    public java.util.List<ProcedurePerformer> performer() {
        return getList(ProcedurePerformer.class, FhirPropertyNames.PROPERTY_PERFORMER);
    }

    /**
     * The location where the procedure actually happened.  E.g. a newborn at
     * home, a tracheostomy at a restaurant.
     */
    public Reference location() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_LOCATION);
    }

    /**
     * The coded reason why the procedure was performed. This may be a coded
     * entity of some type, or may simply be present as text.
     */
    public java.util.List<CodeableConcept> reasonCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_REASON_CODE);
    }

    /**
     * The justification of why the procedure was performed.
     */
    public java.util.List<Reference> reasonReference() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REASON_REFERENCE);
    }

    /**
     * Detailed and structured anatomical location information. Multiple
     * locations are allowed - e.g. multiple punch biopsies of a lesion.
     */
    public java.util.List<CodeableConcept> bodySite() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_BODY_SITE);
    }

    /**
     * The outcome of the procedure - did it resolve the reasons for the
     * procedure being performed?
     */
    public CodeableConcept outcome() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_OUTCOME);
    }

    /**
     * This could be a histology result, pathology report, surgical report,
     * etc.
     */
    public java.util.List<Reference> report() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_REPORT);
    }

    /**
     * Any complications that occurred during the procedure, or in the
     * immediate post-performance period. These are generally tracked
     * separately from the notes, which will typically describe the procedure
     * itself rather than any 'post procedure' issues.
     */
    public java.util.List<CodeableConcept> complication() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_COMPLICATION);
    }

    /**
     * Any complications that occurred during the procedure, or in the
     * immediate post-performance period.
     */
    public java.util.List<Reference> complicationDetail() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_COMPLICATION_DETAIL);
    }

    /**
     * If the procedure required specific follow up - e.g. removal of
     * sutures. The follow up may be represented as a simple note or could
     * potentially be more complex, in which case the CarePlan resource can
     * be used.
     */
    public java.util.List<CodeableConcept> followUp() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_FOLLOW_UP);
    }

    /**
     * Any other notes and comments about the procedure.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    /**
     * A device that is implanted, removed or otherwise manipulated
     * (calibration, battery replacement, fitting a prosthesis, attaching a
     * wound-vac, etc.) as a focal portion of the Procedure.
     */
    public java.util.List<ProcedureFocalDevice> focalDevice() {
        return getList(ProcedureFocalDevice.class, FhirPropertyNames.PROPERTY_FOCAL_DEVICE);
    }

    /**
     * Identifies medications, devices and any other substance used as part
     * of the procedure.
     */
    public java.util.List<Reference> usedReference() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_USED_REFERENCE);
    }

    /**
     * Identifies coded items that were used as part of the procedure.
     */
    public java.util.List<CodeableConcept> usedCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_USED_CODE);
    }

    public static final class Builder extends DomainResource.Builder<Procedure, Procedure.Builder> {

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

        public Builder partOf(final java.util.List<Reference> partOf) {
            b.add(FhirPropertyNames.PROPERTY_PART_OF, FhirObject.toArray(partOf));
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

        public Builder category(final CodeableConcept category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, category);
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
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

        public Builder performedDateTime(final String performedDateTime) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMED_DATE_TIME, performedDateTime);
            return this;
        }

        public Builder performedPeriod(final Period performedPeriod) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMED_PERIOD, performedPeriod);
            return this;
        }

        public Builder performedString(final String performedString) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMED_STRING, performedString);
            return this;
        }

        public Builder performedAge(final Age performedAge) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMED_AGE, performedAge);
            return this;
        }

        public Builder performedRange(final Range performedRange) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMED_RANGE, performedRange);
            return this;
        }

        public Builder recorder(final Reference recorder) {
            b.add(FhirPropertyNames.PROPERTY_RECORDER, recorder);
            return this;
        }

        public Builder asserter(final Reference asserter) {
            b.add(FhirPropertyNames.PROPERTY_ASSERTER, asserter);
            return this;
        }

        public Builder performer(final java.util.List<ProcedurePerformer> performer) {
            b.add(FhirPropertyNames.PROPERTY_PERFORMER, FhirObject.toArray(performer));
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

        public Builder bodySite(final java.util.List<CodeableConcept> bodySite) {
            b.add(FhirPropertyNames.PROPERTY_BODY_SITE, FhirObject.toArray(bodySite));
            return this;
        }

        public Builder outcome(final CodeableConcept outcome) {
            b.add(FhirPropertyNames.PROPERTY_OUTCOME, outcome);
            return this;
        }

        public Builder report(final java.util.List<Reference> report) {
            b.add(FhirPropertyNames.PROPERTY_REPORT, FhirObject.toArray(report));
            return this;
        }

        public Builder complication(final java.util.List<CodeableConcept> complication) {
            b.add(FhirPropertyNames.PROPERTY_COMPLICATION, FhirObject.toArray(complication));
            return this;
        }

        public Builder complicationDetail(final java.util.List<Reference> complicationDetail) {
            b.add(FhirPropertyNames.PROPERTY_COMPLICATION_DETAIL, FhirObject.toArray(complicationDetail));
            return this;
        }

        public Builder followUp(final java.util.List<CodeableConcept> followUp) {
            b.add(FhirPropertyNames.PROPERTY_FOLLOW_UP, FhirObject.toArray(followUp));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder focalDevice(final java.util.List<ProcedureFocalDevice> focalDevice) {
            b.add(FhirPropertyNames.PROPERTY_FOCAL_DEVICE, FhirObject.toArray(focalDevice));
            return this;
        }

        public Builder usedReference(final java.util.List<Reference> usedReference) {
            b.add(FhirPropertyNames.PROPERTY_USED_REFERENCE, FhirObject.toArray(usedReference));
            return this;
        }

        public Builder usedCode(final java.util.List<CodeableConcept> usedCode) {
            b.add(FhirPropertyNames.PROPERTY_USED_CODE, FhirObject.toArray(usedCode));
            return this;
        }

        public Procedure build() {
            return new Procedure(b.build());
        }
    }

    /**
     * An action that is or was performed on or for a patient. This can be a
     * physical intervention like an operation, or less invasive like long
     * term services, counseling, or hypnotherapy.
     */
    public static class ProcedureFocalDevice extends FhirObject {
        public static final String RESOURCE_TYPE = "ProcedureFocalDevice";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ProcedureFocalDevice(final JsonObject data) {
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
         * The kind of change that happened to the device during the procedure.
         */
        public CodeableConcept action() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ACTION);
        }

        /**
         * The device that was manipulated (changed) during the procedure.
         */
        public Reference manipulated() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_MANIPULATED);
        }

        public static final class Builder extends FhirObject.Builder<ProcedureFocalDevice, ProcedureFocalDevice.Builder> {

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

            public Builder action(final CodeableConcept action) {
                b.add(FhirPropertyNames.PROPERTY_ACTION, action);
                return this;
            }

            public Builder manipulated(final Reference manipulated) {
                b.add(FhirPropertyNames.PROPERTY_MANIPULATED, manipulated);
                return this;
            }

            public ProcedureFocalDevice build() {
                return new ProcedureFocalDevice(b.build());
            }
        }
    }

    /**
     * An action that is or was performed on or for a patient. This can be a
     * physical intervention like an operation, or less invasive like long
     * term services, counseling, or hypnotherapy.
     */
    public static class ProcedurePerformer extends FhirObject {
        public static final String RESOURCE_TYPE = "ProcedurePerformer";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ProcedurePerformer(final JsonObject data) {
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
         * Distinguishes the type of involvement of the performer in the
         * procedure. For example, surgeon, anaesthetist, endoscopist.
         */
        public CodeableConcept function() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_FUNCTION);
        }

        /**
         * The practitioner who was involved in the procedure.
         */
        public Reference actor() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ACTOR);
        }

        /**
         * The organization the device or practitioner was acting on behalf of.
         */
        public Reference onBehalfOf() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ON_BEHALF_OF);
        }

        public static final class Builder extends FhirObject.Builder<ProcedurePerformer, ProcedurePerformer.Builder> {

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

            public Builder onBehalfOf(final Reference onBehalfOf) {
                b.add(FhirPropertyNames.PROPERTY_ON_BEHALF_OF, onBehalfOf);
                return this;
            }

            public ProcedurePerformer build() {
                return new ProcedurePerformer(b.build());
            }
        }
    }
}
