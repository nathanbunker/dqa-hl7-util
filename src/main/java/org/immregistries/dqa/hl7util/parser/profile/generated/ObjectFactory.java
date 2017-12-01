//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.06 at 03:25:36 PM EDT 
//


package org.immregistries.dqa.hl7util.parser.profile.generated;

import javax.xml.bind.annotation.XmlRegistry;

import org.immregistries.dqa.hl7util.parser.profile.intf.Component;
import org.immregistries.dqa.hl7util.parser.profile.intf.Field;
import org.immregistries.dqa.hl7util.parser.profile.intf.HL7Component;
import org.immregistries.dqa.hl7util.parser.profile.intf.HL7Field;
import org.immregistries.dqa.hl7util.parser.profile.intf.HL7Segment;
import org.immregistries.dqa.hl7util.parser.profile.intf.HL7SubComponent;
import org.immregistries.dqa.hl7util.parser.profile.intf.Segment;
import org.immregistries.dqa.hl7util.parser.profile.intf.SubComponent;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.mi.mdch.immunization.message.profile package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.mi.mdch.immunization.message.profile
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HL7V2XConformanceProfile }
     * 
     */
    public HL7V2XConformanceProfile createHL7V2XConformanceProfile() {
        return new HL7V2XConformanceProfile();
    }

    /**
     * Create an instance of {@link MetaData }
     * 
     */
    public MetaData createMetaData() {
        return new MetaData();
    }

    /**
     * Create an instance of {@link Encodings }
     * 
     */
    public Encodings createEncodings() {
        return new Encodings();
    }

    /**
     * Create an instance of {@link DynamicDef }
     * 
     */
    public DynamicDef createDynamicDef() {
        return new DynamicDef();
    }

    /**
     * Create an instance of {@link StaticDef }
     * 
     */
    public StaticDef createStaticDef() {
        return new StaticDef();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public HL7Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link ConformanceStatement }
     * 
     */
    public ConformanceStatement createConformanceStatement() {
        return new ConformanceStatement();
    }

    /**
     * Create an instance of {@link SegmentGroup }
     * 
     */
    public SegmentGroup createSegmentGroup() {
        return new SegmentGroup();
    }

    /**
     * Create an instance of {@link SubComponent }
     * 
     */
    public HL7SubComponent createSubComponent() {
        return new SubComponent();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public HL7Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public HL7Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link Predicate }
     * 
     */
    public Predicate createPredicate() {
        return new Predicate();
    }

}
