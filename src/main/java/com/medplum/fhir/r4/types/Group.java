/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * Represents a defined collection of entities that may be discussed or
 * acted upon collectively but which are not expected to act
 * collectively, and are not formally or legally recognized; i.e. a
 * collection of entities that isn't an Organization.
 */
public class Group extends DomainResource {
    public static final String RESOURCE_TYPE = "Group";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Group(final JsonObject data) {
        super(data);
    }

    /**
     * A unique business identifier for this group.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, FhirPropertyNames.PROPERTY_IDENTIFIER);
    }

    /**
     * Indicates whether the record for the group is available for use or is
     * merely being retained for historical purposes.
     */
    public Boolean active() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_ACTIVE);
    }

    /**
     * Identifies the broad classification of the kind of resources the group
     * includes.
     */
    public String type() {
        return getString(FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * If true, indicates that the resource refers to a specific group of
     * real individuals.  If false, the group defines a set of intended
     * individuals.
     */
    public Boolean actual() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_ACTUAL);
    }

    /**
     * Provides a specific type of resource the group includes; e.g. &quot;cow&quot;,
     * &quot;syringe&quot;, etc.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * A label assigned to the group for human identification and
     * communication.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * A count of the number of resource instances that are part of the
     * group.
     */
    public Integer quantity() {
        return data.getInt(FhirPropertyNames.PROPERTY_QUANTITY);
    }

    /**
     * Entity responsible for defining and maintaining Group characteristics
     * and/or registered members.
     */
    public Reference managingEntity() {
        return getObject(Reference.class, FhirPropertyNames.PROPERTY_MANAGING_ENTITY);
    }

    /**
     * Identifies traits whose presence r absence is shared by members of the
     * group.
     */
    public java.util.List<GroupCharacteristic> characteristic() {
        return getList(GroupCharacteristic.class, FhirPropertyNames.PROPERTY_CHARACTERISTIC);
    }

    /**
     * Identifies the resource instances that are members of the group.
     */
    public java.util.List<GroupMember> member() {
        return getList(GroupMember.class, FhirPropertyNames.PROPERTY_MEMBER);
    }

    public static final class Builder extends DomainResource.Builder<Group, Group.Builder> {

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

        public Builder active(final Boolean active) {
            b.add(FhirPropertyNames.PROPERTY_ACTIVE, active);
            return this;
        }

        public Builder type(final String type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder actual(final Boolean actual) {
            b.add(FhirPropertyNames.PROPERTY_ACTUAL, actual);
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder name(final String name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, name);
            return this;
        }

        public Builder quantity(final Integer quantity) {
            b.add(FhirPropertyNames.PROPERTY_QUANTITY, quantity);
            return this;
        }

        public Builder managingEntity(final Reference managingEntity) {
            b.add(FhirPropertyNames.PROPERTY_MANAGING_ENTITY, managingEntity);
            return this;
        }

        public Builder characteristic(final java.util.List<GroupCharacteristic> characteristic) {
            b.add(FhirPropertyNames.PROPERTY_CHARACTERISTIC, FhirObject.toArray(characteristic));
            return this;
        }

        public Builder member(final java.util.List<GroupMember> member) {
            b.add(FhirPropertyNames.PROPERTY_MEMBER, FhirObject.toArray(member));
            return this;
        }

        public Group build() {
            return new Group(b.build());
        }
    }

    /**
     * Represents a defined collection of entities that may be discussed or
     * acted upon collectively but which are not expected to act
     * collectively, and are not formally or legally recognized; i.e. a
     * collection of entities that isn't an Organization.
     */
    public static class GroupCharacteristic extends FhirObject {
        public static final String RESOURCE_TYPE = "GroupCharacteristic";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public GroupCharacteristic(final JsonObject data) {
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
         * A code that identifies the kind of trait being asserted.
         */
        public CodeableConcept code() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_CODE);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public CodeableConcept valueCodeableConcept() {
            return getObject(CodeableConcept.class, FhirPropertyNames.PROPERTY_VALUE_CODEABLE_CONCEPT);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public Boolean valueBoolean() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_VALUE_BOOLEAN);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public Quantity valueQuantity() {
            return getObject(Quantity.class, FhirPropertyNames.PROPERTY_VALUE_QUANTITY);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public Range valueRange() {
            return getObject(Range.class, FhirPropertyNames.PROPERTY_VALUE_RANGE);
        }

        /**
         * The value of the trait that holds (or does not hold - see 'exclude')
         * for members of the group.
         */
        public Reference valueReference() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_VALUE_REFERENCE);
        }

        /**
         * If true, indicates the characteristic is one that is NOT held by
         * members of the group.
         */
        public Boolean exclude() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_EXCLUDE);
        }

        /**
         * The period over which the characteristic is tested; e.g. the patient
         * had an operation during the month of June.
         */
        public Period period() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
        }

        public static final class Builder extends FhirObject.Builder<GroupCharacteristic, GroupCharacteristic.Builder> {

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

            public Builder valueCodeableConcept(final CodeableConcept valueCodeableConcept) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_CODEABLE_CONCEPT, valueCodeableConcept);
                return this;
            }

            public Builder valueBoolean(final Boolean valueBoolean) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_BOOLEAN, valueBoolean);
                return this;
            }

            public Builder valueQuantity(final Quantity valueQuantity) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_QUANTITY, valueQuantity);
                return this;
            }

            public Builder valueRange(final Range valueRange) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_RANGE, valueRange);
                return this;
            }

            public Builder valueReference(final Reference valueReference) {
                b.add(FhirPropertyNames.PROPERTY_VALUE_REFERENCE, valueReference);
                return this;
            }

            public Builder exclude(final Boolean exclude) {
                b.add(FhirPropertyNames.PROPERTY_EXCLUDE, exclude);
                return this;
            }

            public Builder period(final Period period) {
                b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
                return this;
            }

            public GroupCharacteristic build() {
                return new GroupCharacteristic(b.build());
            }
        }
    }

    /**
     * Represents a defined collection of entities that may be discussed or
     * acted upon collectively but which are not expected to act
     * collectively, and are not formally or legally recognized; i.e. a
     * collection of entities that isn't an Organization.
     */
    public static class GroupMember extends FhirObject {
        public static final String RESOURCE_TYPE = "GroupMember";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public GroupMember(final JsonObject data) {
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
         * A reference to the entity that is a member of the group. Must be
         * consistent with Group.type. If the entity is another group, then the
         * type must be the same.
         */
        public Reference entity() {
            return getObject(Reference.class, FhirPropertyNames.PROPERTY_ENTITY);
        }

        /**
         * The period that the member was in the group, if known.
         */
        public Period period() {
            return getObject(Period.class, FhirPropertyNames.PROPERTY_PERIOD);
        }

        /**
         * A flag to indicate that the member is no longer in the group, but
         * previously may have been a member.
         */
        public Boolean inactive() {
            return data.getBoolean(FhirPropertyNames.PROPERTY_INACTIVE);
        }

        public static final class Builder extends FhirObject.Builder<GroupMember, GroupMember.Builder> {

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

            public Builder entity(final Reference entity) {
                b.add(FhirPropertyNames.PROPERTY_ENTITY, entity);
                return this;
            }

            public Builder period(final Period period) {
                b.add(FhirPropertyNames.PROPERTY_PERIOD, period);
                return this;
            }

            public Builder inactive(final Boolean inactive) {
                b.add(FhirPropertyNames.PROPERTY_INACTIVE, inactive);
                return this;
            }

            public GroupMember build() {
                return new GroupMember(b.build());
            }
        }
    }
}
