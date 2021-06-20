/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * The subscription resource is used to define a push-based subscription
 * from a server to another system. Once a subscription is registered
 * with the server, the server checks every resource that is created or
 * updated, and if the resource matches the given criteria, it sends a
 * message on the defined &quot;channel&quot; so that another system can take an
 * appropriate action.
 */
public class Subscription extends DomainResource {
    public static final String RESOURCE_TYPE = "Subscription";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Subscription(final JsonObject data) {
        super(data);
    }

    /**
     * The status of the subscription, which marks the server state for
     * managing the subscription.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * Contact details for a human to contact about the subscription. The
     * primary use of this for system administrator troubleshooting.
     */
    public java.util.List<ContactPoint> contact() {
        return getList(ContactPoint.class, FhirPropertyNames.PROPERTY_CONTACT);
    }

    /**
     * The time for the server to turn the subscription off.
     */
    public java.time.Instant end() {
        return getInstant(FhirPropertyNames.PROPERTY_END);
    }

    /**
     * A description of why this subscription is defined.
     */
    public String reason() {
        return getString(FhirPropertyNames.PROPERTY_REASON);
    }

    /**
     * The rules that the server should use to determine when to generate
     * notifications for this subscription.
     */
    public String criteria() {
        return getString(FhirPropertyNames.PROPERTY_CRITERIA);
    }

    /**
     * A record of the last error that occurred when the server processed a
     * notification.
     */
    public String error() {
        return getString(FhirPropertyNames.PROPERTY_ERROR);
    }

    /**
     * Details where to send notifications when resources are received that
     * meet the criteria.
     */
    public SubscriptionChannel channel() {
        return getObject(SubscriptionChannel.class, FhirPropertyNames.PROPERTY_CHANNEL);
    }

    public static final class Builder extends DomainResource.Builder<Subscription, Subscription.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder contact(final java.util.List<ContactPoint> contact) {
            b.add(FhirPropertyNames.PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder end(final java.time.Instant end) {
            b.add(FhirPropertyNames.PROPERTY_END, end.toString());
            return this;
        }

        public Builder reason(final String reason) {
            b.add(FhirPropertyNames.PROPERTY_REASON, reason);
            return this;
        }

        public Builder criteria(final String criteria) {
            b.add(FhirPropertyNames.PROPERTY_CRITERIA, criteria);
            return this;
        }

        public Builder error(final String error) {
            b.add(FhirPropertyNames.PROPERTY_ERROR, error);
            return this;
        }

        public Builder channel(final SubscriptionChannel channel) {
            b.add(FhirPropertyNames.PROPERTY_CHANNEL, channel);
            return this;
        }

        public Subscription build() {
            return new Subscription(b.build());
        }
    }

    /**
     * The subscription resource is used to define a push-based subscription
     * from a server to another system. Once a subscription is registered
     * with the server, the server checks every resource that is created or
     * updated, and if the resource matches the given criteria, it sends a
     * message on the defined &quot;channel&quot; so that another system can take an
     * appropriate action.
     */
    public static class SubscriptionChannel extends FhirObject {
        public static final String RESOURCE_TYPE = "SubscriptionChannel";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SubscriptionChannel(final JsonObject data) {
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
         * The type of channel to send notifications on.
         */
        public String type() {
            return getString(FhirPropertyNames.PROPERTY_TYPE);
        }

        /**
         * The url that describes the actual end-point to send messages to.
         */
        public java.net.URI endpoint() {
            return getUri(FhirPropertyNames.PROPERTY_ENDPOINT);
        }

        /**
         * The mime type to send the payload in - either application/fhir+xml, or
         * application/fhir+json. If the payload is not present, then there is no
         * payload in the notification, just a notification. The mime type
         * &quot;text/plain&quot; may also be used for Email and SMS subscriptions.
         */
        public String payload() {
            return getString(FhirPropertyNames.PROPERTY_PAYLOAD);
        }

        /**
         * Additional headers / information to send as part of the notification.
         */
        public java.util.List<String> header() {
            return getList(String.class, FhirPropertyNames.PROPERTY_HEADER);
        }

        public static final class Builder extends FhirObject.Builder<SubscriptionChannel, SubscriptionChannel.Builder> {

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

            public Builder type(final String type) {
                b.add(FhirPropertyNames.PROPERTY_TYPE, type);
                return this;
            }

            public Builder endpoint(final java.net.URI endpoint) {
                b.add(FhirPropertyNames.PROPERTY_ENDPOINT, endpoint.toString());
                return this;
            }

            public Builder payload(final String payload) {
                b.add(FhirPropertyNames.PROPERTY_PAYLOAD, payload);
                return this;
            }

            public Builder header(final java.util.List<String> header) {
                b.add(FhirPropertyNames.PROPERTY_HEADER, FhirObject.toStringArray(header));
                return this;
            }

            public SubscriptionChannel build() {
                return new SubscriptionChannel(b.build());
            }
        }
    }
}
