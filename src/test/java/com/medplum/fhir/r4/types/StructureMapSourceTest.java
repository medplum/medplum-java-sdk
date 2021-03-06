/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.r4.types;

import static org.junit.jupiter.api.Assertions.*;

import jakarta.json.Json;

import org.junit.Test;

public class StructureMapSourceTest {

    @Test
    public void testConstructor() {
        assertNotNull(new StructureMap.StructureMapSource(Json.createObjectBuilder().build()));
    }

    @Test
    public void testBuilderFromJsonObject() {
        assertNotNull(StructureMap.StructureMapSource.create(Json.createObjectBuilder().build()).build());
    }

    @Test
    public void testCopyAll() {
        final StructureMap.StructureMapSource x = StructureMap.StructureMapSource.create().build();
        final StructureMap.StructureMapSource y = StructureMap.StructureMapSource.create().copyAll(x).build();
        assertEquals(x, y);
    }

    @Test
    public void testId() {
        assertEquals("x", StructureMap.StructureMapSource.create().id("x").build().id());
    }

    @Test
    public void testExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapSource.create().extension(value).build().extension());
    }

    @Test
    public void testModifierExtension() {
        final java.util.List<Extension> value = java.util.Collections.emptyList();
        assertEquals(value, StructureMap.StructureMapSource.create().modifierExtension(value).build().modifierExtension());
    }

    @Test
    public void testContext() {
        assertEquals("x", StructureMap.StructureMapSource.create().context("x").build().context());
    }

    @Test
    public void testMin() {
        assertEquals(1, StructureMap.StructureMapSource.create().min(1).build().min());
    }

    @Test
    public void testMax() {
        assertEquals("x", StructureMap.StructureMapSource.create().max("x").build().max());
    }

    @Test
    public void testType() {
        assertEquals("x", StructureMap.StructureMapSource.create().type("x").build().type());
    }

    @Test
    public void testDefaultValueBase64Binary() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueBase64Binary("x").build().defaultValueBase64Binary());
    }

    @Test
    public void testDefaultValueBoolean() {
        assertEquals(true, StructureMap.StructureMapSource.create().defaultValueBoolean(true).build().defaultValueBoolean());
    }

    @Test
    public void testDefaultValueCanonical() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueCanonical("x").build().defaultValueCanonical());
    }

    @Test
    public void testDefaultValueCode() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueCode("x").build().defaultValueCode());
    }

    @Test
    public void testDefaultValueDate() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueDate("x").build().defaultValueDate());
    }

    @Test
    public void testDefaultValueDateTime() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueDateTime("x").build().defaultValueDateTime());
    }

    @Test
    public void testDefaultValueDecimal() {
        assertEquals(1, StructureMap.StructureMapSource.create().defaultValueDecimal(1).build().defaultValueDecimal());
    }

    @Test
    public void testDefaultValueId() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueId("x").build().defaultValueId());
    }

    @Test
    public void testDefaultValueInstant() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueInstant("x").build().defaultValueInstant());
    }

    @Test
    public void testDefaultValueInteger() {
        assertEquals(1, StructureMap.StructureMapSource.create().defaultValueInteger(1).build().defaultValueInteger());
    }

    @Test
    public void testDefaultValueMarkdown() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueMarkdown("x").build().defaultValueMarkdown());
    }

    @Test
    public void testDefaultValueOid() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueOid("x").build().defaultValueOid());
    }

    @Test
    public void testDefaultValuePositiveInt() {
        assertEquals(1, StructureMap.StructureMapSource.create().defaultValuePositiveInt(1).build().defaultValuePositiveInt());
    }

    @Test
    public void testDefaultValueString() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueString("x").build().defaultValueString());
    }

    @Test
    public void testDefaultValueTime() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueTime("x").build().defaultValueTime());
    }

    @Test
    public void testDefaultValueUnsignedInt() {
        assertEquals(1, StructureMap.StructureMapSource.create().defaultValueUnsignedInt(1).build().defaultValueUnsignedInt());
    }

    @Test
    public void testDefaultValueUri() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueUri("x").build().defaultValueUri());
    }

    @Test
    public void testDefaultValueUrl() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueUrl("x").build().defaultValueUrl());
    }

    @Test
    public void testDefaultValueUuid() {
        assertEquals("x", StructureMap.StructureMapSource.create().defaultValueUuid("x").build().defaultValueUuid());
    }

    @Test
    public void testDefaultValueAddress() {
        final Address value = Address.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueAddress(value).build().defaultValueAddress());
    }

    @Test
    public void testDefaultValueAge() {
        final Age value = Age.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueAge(value).build().defaultValueAge());
    }

    @Test
    public void testDefaultValueAnnotation() {
        final Annotation value = Annotation.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueAnnotation(value).build().defaultValueAnnotation());
    }

    @Test
    public void testDefaultValueAttachment() {
        final Attachment value = Attachment.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueAttachment(value).build().defaultValueAttachment());
    }

    @Test
    public void testDefaultValueCodeableConcept() {
        final CodeableConcept value = CodeableConcept.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueCodeableConcept(value).build().defaultValueCodeableConcept());
    }

    @Test
    public void testDefaultValueCoding() {
        final Coding value = Coding.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueCoding(value).build().defaultValueCoding());
    }

    @Test
    public void testDefaultValueContactPoint() {
        final ContactPoint value = ContactPoint.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueContactPoint(value).build().defaultValueContactPoint());
    }

    @Test
    public void testDefaultValueCount() {
        final Count value = Count.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueCount(value).build().defaultValueCount());
    }

    @Test
    public void testDefaultValueDistance() {
        final Distance value = Distance.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueDistance(value).build().defaultValueDistance());
    }

    @Test
    public void testDefaultValueDuration() {
        final Duration value = Duration.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueDuration(value).build().defaultValueDuration());
    }

    @Test
    public void testDefaultValueHumanName() {
        final HumanName value = HumanName.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueHumanName(value).build().defaultValueHumanName());
    }

    @Test
    public void testDefaultValueIdentifier() {
        final Identifier value = Identifier.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueIdentifier(value).build().defaultValueIdentifier());
    }

    @Test
    public void testDefaultValueMoney() {
        final Money value = Money.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueMoney(value).build().defaultValueMoney());
    }

    @Test
    public void testDefaultValuePeriod() {
        final Period value = Period.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValuePeriod(value).build().defaultValuePeriod());
    }

    @Test
    public void testDefaultValueQuantity() {
        final Quantity value = Quantity.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueQuantity(value).build().defaultValueQuantity());
    }

    @Test
    public void testDefaultValueRange() {
        final Range value = Range.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueRange(value).build().defaultValueRange());
    }

    @Test
    public void testDefaultValueRatio() {
        final Ratio value = Ratio.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueRatio(value).build().defaultValueRatio());
    }

    @Test
    public void testDefaultValueReference() {
        final Reference value = Reference.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueReference(value).build().defaultValueReference());
    }

    @Test
    public void testDefaultValueSampledData() {
        final SampledData value = SampledData.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueSampledData(value).build().defaultValueSampledData());
    }

    @Test
    public void testDefaultValueSignature() {
        final Signature value = Signature.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueSignature(value).build().defaultValueSignature());
    }

    @Test
    public void testDefaultValueTiming() {
        final Timing value = Timing.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueTiming(value).build().defaultValueTiming());
    }

    @Test
    public void testDefaultValueContactDetail() {
        final ContactDetail value = ContactDetail.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueContactDetail(value).build().defaultValueContactDetail());
    }

    @Test
    public void testDefaultValueContributor() {
        final Contributor value = Contributor.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueContributor(value).build().defaultValueContributor());
    }

    @Test
    public void testDefaultValueDataRequirement() {
        final DataRequirement value = DataRequirement.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueDataRequirement(value).build().defaultValueDataRequirement());
    }

    @Test
    public void testDefaultValueExpression() {
        final Expression value = Expression.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueExpression(value).build().defaultValueExpression());
    }

    @Test
    public void testDefaultValueParameterDefinition() {
        final ParameterDefinition value = ParameterDefinition.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueParameterDefinition(value).build().defaultValueParameterDefinition());
    }

    @Test
    public void testDefaultValueRelatedArtifact() {
        final RelatedArtifact value = RelatedArtifact.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueRelatedArtifact(value).build().defaultValueRelatedArtifact());
    }

    @Test
    public void testDefaultValueTriggerDefinition() {
        final TriggerDefinition value = TriggerDefinition.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueTriggerDefinition(value).build().defaultValueTriggerDefinition());
    }

    @Test
    public void testDefaultValueUsageContext() {
        final UsageContext value = UsageContext.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueUsageContext(value).build().defaultValueUsageContext());
    }

    @Test
    public void testDefaultValueDosage() {
        final Dosage value = Dosage.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueDosage(value).build().defaultValueDosage());
    }

    @Test
    public void testDefaultValueMeta() {
        final Meta value = Meta.create().build();
        assertEquals(value, StructureMap.StructureMapSource.create().defaultValueMeta(value).build().defaultValueMeta());
    }

    @Test
    public void testElement() {
        assertEquals("x", StructureMap.StructureMapSource.create().element("x").build().element());
    }

    @Test
    public void testListMode() {
        assertEquals("x", StructureMap.StructureMapSource.create().listMode("x").build().listMode());
    }

    @Test
    public void testVariable() {
        assertEquals("x", StructureMap.StructureMapSource.create().variable("x").build().variable());
    }

    @Test
    public void testCondition() {
        assertEquals("x", StructureMap.StructureMapSource.create().condition("x").build().condition());
    }

    @Test
    public void testCheck() {
        assertEquals("x", StructureMap.StructureMapSource.create().check("x").build().check());
    }

    @Test
    public void testLogMessage() {
        assertEquals("x", StructureMap.StructureMapSource.create().logMessage("x").build().logMessage());
    }
}
