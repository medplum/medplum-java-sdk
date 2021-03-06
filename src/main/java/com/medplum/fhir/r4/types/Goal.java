/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Describes the intended objective(s) for a patient, group or
 * organization care, for example, weight loss, restoring an activity of
 * daily living, obtaining herd immunity via immunization, meeting a
 * process improvement objective, etc.
 */
public class Goal extends DomainResource {
    public static final String RESOURCE_TYPE = "Goal";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Goal(final JsonObject data) {
        super(data);
    }

    /**
     * Business identifiers assigned to this goal by the performer or other
     * systems which remain constant as the resource is updated and
     * propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * The state of the goal throughout its lifecycle.
     */
    public String lifecycleStatus() {
        return getString(FhirPropertyNames.PROPERTY_LIFECYCLE_STATUS);
    }

    /**
     * Describes the progression, or lack thereof, towards the goal against
     * the target.
     */
    public CodeableConcept achievementStatus() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_ACHIEVEMENT_STATUS);
    }

    /**
     * Indicates a category the goal falls within.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_CATEGORY);
    }

    /**
     * Identifies the mutually agreed level of importance associated with
     * reaching/sustaining the goal.
     */
    public CodeableConcept priority() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_PRIORITY);
    }

    /**
     * Human-readable and/or coded description of a specific desired
     * objective of care, such as &quot;control blood pressure&quot; or &quot;negotiate an
     * obstacle course&quot; or &quot;dance with child at wedding&quot;.
     */
    public CodeableConcept description() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * Identifies the patient, group or organization for whom the goal is
     * being established.
     */
    public Reference subject() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_SUBJECT);
    }

    /**
     * The date or event after which the goal should begin being pursued.
     */
    public String startDate() {
        return getString(FhirPropertyNames.PROPERTY_START_DATE);
    }

    /**
     * The date or event after which the goal should begin being pursued.
     */
    public CodeableConcept startCodeableConcept() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_START_CODEABLE_CONCEPT);
    }

    /**
     * Indicates what should be done by when.
     */
    public java.util.List<GoalTarget> target() {
        return getList(GoalTarget.class, FhirPropertyNames.PROPERTY_TARGET);
    }

    /**
     * Identifies when the current status.  I.e. When initially created, when
     * achieved, when cancelled, etc.
     */
    public java.time.LocalDate statusDate() {
        return getLocalDate(FhirPropertyNames.PROPERTY_STATUS_DATE);
    }

    /**
     * Captures the reason for the current status.
     */
    public String statusReason() {
        return getString(FhirPropertyNames.PROPERTY_STATUS_REASON);
    }

    /**
     * Indicates whose goal this is - patient goal, practitioner goal, etc.
     */
    public Reference expressedBy() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_EXPRESSED_BY);
    }

    /**
     * The identified conditions and other health record elements that are
     * intended to be addressed by the goal.
     */
    public java.util.List<Reference> addresses() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_ADDRESSES);
    }

    /**
     * Any comments related to the goal.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, FhirPropertyNames.PROPERTY_NOTE);
    }

    /**
     * Identifies the change (or lack of change) at the point when the status
     * of the goal is assessed.
     */
    public java.util.List<CodeableConcept> outcomeCode() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_OUTCOME_CODE);
    }

    /**
     * Details of what's changed (or not changed).
     */
    public java.util.List<Reference> outcomeReference() {
        return getList(Reference.class, FhirPropertyNames.PROPERTY_OUTCOME_REFERENCE);
    }

    public static final class Builder extends DomainResource.Builder<Goal, Goal.Builder> {

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

        public Builder lifecycleStatus(final String lifecycleStatus) {
            b.add(FhirPropertyNames.PROPERTY_LIFECYCLE_STATUS, lifecycleStatus);
            return this;
        }

        public Builder achievementStatus(final CodeableConcept achievementStatus) {
            b.add(FhirPropertyNames.PROPERTY_ACHIEVEMENT_STATUS, achievementStatus);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(FhirPropertyNames.PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder priority(final CodeableConcept priority) {
            b.add(FhirPropertyNames.PROPERTY_PRIORITY, priority);
            return this;
        }

        public Builder description(final CodeableConcept description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(FhirPropertyNames.PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder startDate(final String startDate) {
            b.add(FhirPropertyNames.PROPERTY_START_DATE, startDate);
            return this;
        }

        public Builder startCodeableConcept(final CodeableConcept startCodeableConcept) {
            b.add(FhirPropertyNames.PROPERTY_START_CODEABLE_CONCEPT, startCodeableConcept);
            return this;
        }

        public Builder target(final java.util.List<GoalTarget> target) {
            b.add(FhirPropertyNames.PROPERTY_TARGET, FhirObject.toArray(target));
            return this;
        }

        public Builder statusDate(final java.time.LocalDate statusDate) {
            b.add(FhirPropertyNames.PROPERTY_STATUS_DATE, statusDate.toString());
            return this;
        }

        public Builder statusReason(final String statusReason) {
            b.add(FhirPropertyNames.PROPERTY_STATUS_REASON, statusReason);
            return this;
        }

        public Builder expressedBy(final Reference expressedBy) {
            b.add(FhirPropertyNames.PROPERTY_EXPRESSED_BY, expressedBy);
            return this;
        }

        public Builder addresses(final java.util.List<Reference> addresses) {
            b.add(FhirPropertyNames.PROPERTY_ADDRESSES, FhirObject.toArray(addresses));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(FhirPropertyNames.PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Builder outcomeCode(final java.util.List<CodeableConcept> outcomeCode) {
            b.add(FhirPropertyNames.PROPERTY_OUTCOME_CODE, FhirObject.toArray(outcomeCode));
            return this;
        }

        public Builder outcomeReference(final java.util.List<Reference> outcomeReference) {
            b.add(FhirPropertyNames.PROPERTY_OUTCOME_REFERENCE, FhirObject.toArray(outcomeReference));
            return this;
        }

        public Goal build() {
            return new Goal(b.build());
        }
    }

    /**
     * Describes the intended objective(s) for a patient, group or
     * organization care, for example, weight loss, restoring an activity of
     * daily living, obtaining herd immunity via immunization, meeting a
     * process improvement objective, etc.
     */
    public static class GoalTarget extends FhirObject {
        public static final String RESOURCE_TYPE = "GoalTarget";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public GoalTarget(final JsonObject data) {
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
         * The parameter whose value is being tracked, e.g. body weight, blood
         * pressure, or hemoglobin A1c level.
         */
        public CodeableConcept measure() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_MEASURE);
        }

        /**
         * The target value of the focus to be achieved to signify the
         * fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low
         * or both values of the range can be specified. When a low value is
         * missing, it indicates that the goal is achieved at any focus value at
         * or below the high value. Similarly, if the high value is missing, it
         * indicates that the goal is achieved at any focus value at or above the
         * low value.
         */
        public Quantity detailQuantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_DETAIL_QUANTITY);
        }

        /**
         * The target value of the focus to be achieved to signify the
         * fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low
         * or both values of the range can be specified. When a low value is
         * missing, it indicates that the goal is achieved at any focus value at
         * or below the high value. Similarly, if the high value is missing, it
         * indicates that the goal is achieved at any focus value at or above the
         * low value.
         */
        public Range detailRange() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_DETAIL_RANGE);
        }

        /**
         * The target value of the focus to be achieved to signify the
         * fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low
         * or both values of the range can be specified. When a low value is
         * missing, it indicates that the goal is achieved at any focus value at
         * or below the high value. Similarly, if the high value is missing, it
         * indicates that the goal is achieved at any focus value at or above the
         * low value.
         */
        public CodeableConcept detailCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_DETAIL_CODEABLE_CONCEPT);
        }

        /**
         * The target value of the focus to be achieved to signify the
         * fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low
         * or both values of the range can be specified. When a low value is
         * missing, it indicates that the goal is achieved at any focus value at
         * or below the high value. Similarly, if the high value is missing, it
         * indicates that the goal is achieved at any focus value at or above the
         * low value.
         */
        public String detailString() {
            return getString(FhirPropertyNames.PROPERTY_DETAIL_STRING);
        }

        /**
         * The target value of the focus to be achieved to signify the
         * fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low
         * or both values of the range can be specified. When a low value is
         * missing, it indicates that the goal is achieved at any focus value at
         * or below the high value. Similarly, if the high value is missing, it
         * indicates that the goal is achieved at any focus value at or above the
         * low value.
         */
        public Boolean detailBoolean() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_DETAIL_BOOLEAN);
        }

        /**
         * The target value of the focus to be achieved to signify the
         * fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low
         * or both values of the range can be specified. When a low value is
         * missing, it indicates that the goal is achieved at any focus value at
         * or below the high value. Similarly, if the high value is missing, it
         * indicates that the goal is achieved at any focus value at or above the
         * low value.
         */
        public Integer detailInteger() {
            return data.getInt(FhirPropertyNames.PROPERTY_DETAIL_INTEGER);
        }

        /**
         * The target value of the focus to be achieved to signify the
         * fulfillment of the goal, e.g. 150 pounds, 7.0%. Either the high or low
         * or both values of the range can be specified. When a low value is
         * missing, it indicates that the goal is achieved at any focus value at
         * or below the high value. Similarly, if the high value is missing, it
         * indicates that the goal is achieved at any focus value at or above the
         * low value.
         */
        public Ratio detailRatio() {
            return getObject(Ratio.class, FhirPropertyNames.PROPERTY_DETAIL_RATIO);
        }

        /**
         * Indicates either the date or the duration after start by which the
         * goal should be met.
         */
        public String dueDate() {
            return getString(FhirPropertyNames.PROPERTY_DUE_DATE);
        }

        /**
         * Indicates either the date or the duration after start by which the
         * goal should be met.
         */
        public Duration dueDuration() {
            return getObject(Duration.class, FhirPropertyNames.PROPERTY_DUE_DURATION);
        }

        public static final class Builder extends FhirObject.Builder<GoalTarget, GoalTarget.Builder> {

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

            public Builder measure(final CodeableConcept measure) {
                b.add(FhirPropertyNames.PROPERTY_MEASURE, measure);
                return this;
            }

            public Builder detailQuantity(final Quantity detailQuantity) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL_QUANTITY, detailQuantity);
                return this;
            }

            public Builder detailRange(final Range detailRange) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL_RANGE, detailRange);
                return this;
            }

            public Builder detailCodeableConcept(final CodeableConcept detailCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL_CODEABLE_CONCEPT, detailCodeableConcept);
                return this;
            }

            public Builder detailString(final String detailString) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL_STRING, detailString);
                return this;
            }

            public Builder detailBoolean(final Boolean detailBoolean) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL_BOOLEAN, detailBoolean);
                return this;
            }

            public Builder detailInteger(final Integer detailInteger) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL_INTEGER, detailInteger);
                return this;
            }

            public Builder detailRatio(final Ratio detailRatio) {
                b.add(FhirPropertyNames.PROPERTY_DETAIL_RATIO, detailRatio);
                return this;
            }

            public Builder dueDate(final String dueDate) {
                b.add(FhirPropertyNames.PROPERTY_DUE_DATE, dueDate);
                return this;
            }

            public Builder dueDuration(final Duration dueDuration) {
                b.add(FhirPropertyNames.PROPERTY_DUE_DURATION, dueDuration);
                return this;
            }

            public GoalTarget build() {
                return new GoalTarget(b.build());
            }
        }
    }
}
