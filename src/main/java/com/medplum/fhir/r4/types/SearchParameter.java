/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import jakarta.json.JsonObject;

import com.medplum.fhir.r4.FhirPropertyNames;

/**
 * A search parameter that defines a named search item that can be used
 * to search/filter on a resource.
 */
public class SearchParameter extends DomainResource {
    public static final String RESOURCE_TYPE = "SearchParameter";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public SearchParameter(final JsonObject data) {
        super(data);
    }

    /**
     * An absolute URI that is used to identify this search parameter when it
     * is referenced in a specification, model, design or an instance; also
     * called its canonical identifier. This SHOULD be globally unique and
     * SHOULD be a literal address at which at which an authoritative
     * instance of this search parameter is (or will be) published. This URL
     * can be the target of a canonical reference. It SHALL remain the same
     * when the search parameter is stored on different servers.
     */
    public java.net.URI url() {
        return getUri(FhirPropertyNames.PROPERTY_URL);
    }

    /**
     * The identifier that is used to identify this version of the search
     * parameter when it is referenced in a specification, model, design or
     * instance. This is an arbitrary value managed by the search parameter
     * author and is not expected to be globally unique. For example, it
     * might be a timestamp (e.g. yyyymmdd) if a managed version is not
     * available. There is also no expectation that versions can be placed in
     * a lexicographical sequence.
     */
    public String version() {
        return getString(FhirPropertyNames.PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the search parameter. This name
     * should be usable as an identifier for the module by machine processing
     * applications such as code generation.
     */
    public String name() {
        return getString(FhirPropertyNames.PROPERTY_NAME);
    }

    /**
     * Where this search parameter is originally defined. If a derivedFrom is
     * provided, then the details in the search parameter must be consistent
     * with the definition from which it is defined. i.e. the parameter
     * should have the same meaning, and (usually) the functionality should
     * be a proper subset of the underlying search parameter.
     */
    public String derivedFrom() {
        return getString(FhirPropertyNames.PROPERTY_DERIVED_FROM);
    }

    /**
     * The status of this search parameter. Enables tracking the life-cycle
     * of the content.
     */
    public String status() {
        return getString(FhirPropertyNames.PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this search parameter is authored for
     * testing purposes (or education/evaluation/marketing) and is not
     * intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_EXPERIMENTAL);
    }

    /**
     * The date  (and optionally time) when the search parameter was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the search parameter changes.
     */
    public java.time.Instant date() {
        return getInstant(FhirPropertyNames.PROPERTY_DATE);
    }

    /**
     * The name of the organization or individual that published the search
     * parameter.
     */
    public String publisher() {
        return getString(FhirPropertyNames.PROPERTY_PUBLISHER);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * publisher.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, FhirPropertyNames.PROPERTY_CONTACT);
    }

    /**
     * And how it used.
     */
    public String description() {
        return getString(FhirPropertyNames.PROPERTY_DESCRIPTION);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate search parameter instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, FhirPropertyNames.PROPERTY_USE_CONTEXT);
    }

    /**
     * A legal or geographic region in which the search parameter is intended
     * to be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, FhirPropertyNames.PROPERTY_JURISDICTION);
    }

    /**
     * Explanation of why this search parameter is needed and why it has been
     * designed as it has.
     */
    public String purpose() {
        return getString(FhirPropertyNames.PROPERTY_PURPOSE);
    }

    /**
     * The code used in the URL or the parameter name in a parameters
     * resource for this search parameter.
     */
    public String code() {
        return getString(FhirPropertyNames.PROPERTY_CODE);
    }

    /**
     * The base resource type(s) that this search parameter can be used
     * against.
     */
    public java.util.List<String> base() {
        return getList(String.class, FhirPropertyNames.PROPERTY_BASE);
    }

    /**
     * The type of value that a search parameter may contain, and how the
     * content is interpreted.
     */
    public String type() {
        return getString(FhirPropertyNames.PROPERTY_TYPE);
    }

    /**
     * A FHIRPath expression that returns a set of elements for the search
     * parameter.
     */
    public String expression() {
        return getString(FhirPropertyNames.PROPERTY_EXPRESSION);
    }

    /**
     * An XPath expression that returns a set of elements for the search
     * parameter.
     */
    public String xpath() {
        return getString(FhirPropertyNames.PROPERTY_XPATH);
    }

    /**
     * How the search parameter relates to the set of elements returned by
     * evaluating the xpath query.
     */
    public String xpathUsage() {
        return getString(FhirPropertyNames.PROPERTY_XPATH_USAGE);
    }

    /**
     * Types of resource (if a resource is referenced).
     */
    public java.util.List<String> target() {
        return getList(String.class, FhirPropertyNames.PROPERTY_TARGET);
    }

    /**
     * Whether multiple values are allowed for each time the parameter
     * exists. Values are separated by commas, and the parameter matches if
     * any of the values match.
     */
    public Boolean multipleOr() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_MULTIPLE_OR);
    }

    /**
     * Whether multiple parameters are allowed - e.g. more than one parameter
     * with the same name. The search matches if all the parameters match.
     */
    public Boolean multipleAnd() {
        return data.getBoolean(FhirPropertyNames.PROPERTY_MULTIPLE_AND);
    }

    /**
     * Comparators supported for the search parameter.
     */
    public java.util.List<String> comparator() {
        return getList(String.class, FhirPropertyNames.PROPERTY_COMPARATOR);
    }

    /**
     * A modifier supported for the search parameter.
     */
    public java.util.List<String> modifier() {
        return getList(String.class, FhirPropertyNames.PROPERTY_MODIFIER);
    }

    /**
     * Contains the names of any search parameters which may be chained to
     * the containing search parameter. Chained parameters may be added to
     * search parameters of type reference and specify that resources will
     * only be returned if they contain a reference to a resource which
     * matches the chained parameter value. Values for this field should be
     * drawn from SearchParameter.code for a parameter on the target resource
     * type.
     */
    public java.util.List<String> chain() {
        return getList(String.class, FhirPropertyNames.PROPERTY_CHAIN);
    }

    /**
     * Used to define the parts of a composite search parameter.
     */
    public java.util.List<SearchParameterComponent> component() {
        return getList(SearchParameterComponent.class, FhirPropertyNames.PROPERTY_COMPONENT);
    }

    public static final class Builder extends DomainResource.Builder<SearchParameter, SearchParameter.Builder> {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder url(final java.net.URI url) {
            b.add(FhirPropertyNames.PROPERTY_URL, url.toString());
            return this;
        }

        public Builder version(final String version) {
            b.add(FhirPropertyNames.PROPERTY_VERSION, version);
            return this;
        }

        public Builder name(final String name) {
            b.add(FhirPropertyNames.PROPERTY_NAME, name);
            return this;
        }

        public Builder derivedFrom(final String derivedFrom) {
            b.add(FhirPropertyNames.PROPERTY_DERIVED_FROM, derivedFrom);
            return this;
        }

        public Builder status(final String status) {
            b.add(FhirPropertyNames.PROPERTY_STATUS, status);
            return this;
        }

        public Builder experimental(final Boolean experimental) {
            b.add(FhirPropertyNames.PROPERTY_EXPERIMENTAL, experimental);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(FhirPropertyNames.PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder publisher(final String publisher) {
            b.add(FhirPropertyNames.PROPERTY_PUBLISHER, publisher);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(FhirPropertyNames.PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder description(final String description) {
            b.add(FhirPropertyNames.PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder useContext(final java.util.List<UsageContext> useContext) {
            b.add(FhirPropertyNames.PROPERTY_USE_CONTEXT, FhirObject.toArray(useContext));
            return this;
        }

        public Builder jurisdiction(final java.util.List<CodeableConcept> jurisdiction) {
            b.add(FhirPropertyNames.PROPERTY_JURISDICTION, FhirObject.toArray(jurisdiction));
            return this;
        }

        public Builder purpose(final String purpose) {
            b.add(FhirPropertyNames.PROPERTY_PURPOSE, purpose);
            return this;
        }

        public Builder code(final String code) {
            b.add(FhirPropertyNames.PROPERTY_CODE, code);
            return this;
        }

        public Builder base(final java.util.List<String> base) {
            b.add(FhirPropertyNames.PROPERTY_BASE, FhirObject.toStringArray(base));
            return this;
        }

        public Builder type(final String type) {
            b.add(FhirPropertyNames.PROPERTY_TYPE, type);
            return this;
        }

        public Builder expression(final String expression) {
            b.add(FhirPropertyNames.PROPERTY_EXPRESSION, expression);
            return this;
        }

        public Builder xpath(final String xpath) {
            b.add(FhirPropertyNames.PROPERTY_XPATH, xpath);
            return this;
        }

        public Builder xpathUsage(final String xpathUsage) {
            b.add(FhirPropertyNames.PROPERTY_XPATH_USAGE, xpathUsage);
            return this;
        }

        public Builder target(final java.util.List<String> target) {
            b.add(FhirPropertyNames.PROPERTY_TARGET, FhirObject.toStringArray(target));
            return this;
        }

        public Builder multipleOr(final Boolean multipleOr) {
            b.add(FhirPropertyNames.PROPERTY_MULTIPLE_OR, multipleOr);
            return this;
        }

        public Builder multipleAnd(final Boolean multipleAnd) {
            b.add(FhirPropertyNames.PROPERTY_MULTIPLE_AND, multipleAnd);
            return this;
        }

        public Builder comparator(final java.util.List<String> comparator) {
            b.add(FhirPropertyNames.PROPERTY_COMPARATOR, FhirObject.toStringArray(comparator));
            return this;
        }

        public Builder modifier(final java.util.List<String> modifier) {
            b.add(FhirPropertyNames.PROPERTY_MODIFIER, FhirObject.toStringArray(modifier));
            return this;
        }

        public Builder chain(final java.util.List<String> chain) {
            b.add(FhirPropertyNames.PROPERTY_CHAIN, FhirObject.toStringArray(chain));
            return this;
        }

        public Builder component(final java.util.List<SearchParameterComponent> component) {
            b.add(FhirPropertyNames.PROPERTY_COMPONENT, FhirObject.toArray(component));
            return this;
        }

        public SearchParameter build() {
            return new SearchParameter(b.build());
        }
    }

    /**
     * A search parameter that defines a named search item that can be used
     * to search/filter on a resource.
     */
    public static class SearchParameterComponent extends FhirObject {
        public static final String RESOURCE_TYPE = "SearchParameterComponent";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public SearchParameterComponent(final JsonObject data) {
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
         * The definition of the search parameter that describes this part.
         */
        public String definition() {
            return getString(FhirPropertyNames.PROPERTY_DEFINITION);
        }

        /**
         * A sub-expression that defines how to extract values for this component
         * from the output of the main SearchParameter.expression.
         */
        public String expression() {
            return getString(FhirPropertyNames.PROPERTY_EXPRESSION);
        }

        public static final class Builder extends FhirObject.Builder<SearchParameterComponent, SearchParameterComponent.Builder> {

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

            public Builder definition(final String definition) {
                b.add(FhirPropertyNames.PROPERTY_DEFINITION, definition);
                return this;
            }

            public Builder expression(final String expression) {
                b.add(FhirPropertyNames.PROPERTY_EXPRESSION, expression);
                return this;
            }

            public SearchParameterComponent build() {
                return new SearchParameterComponent(b.build());
            }
        }
    }
}
