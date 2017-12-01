//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.03 at 08:52:00 AM EDT 
//


package org.immregistries.dqa.hl7util.parser.profile.ack.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.immregistries.dqa.hl7util.parser.profile.intf.Field;
import org.immregistries.dqa.hl7util.parser.profile.intf.Segment;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.immregistries.dqa.hl7util.parser.profile.ack.generated package. 
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
public class AckObjectFactory {

    private final static QName _ConformanceProfileDatatypesDatatypeComponent_QNAME = new QName("", "DataTypeComponent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.immregistries.dqa.hl7util.parser.profile.ack.generated
     * 
     */
    public AckObjectFactory() {
    }

    /**
     * Create an instance of {@link AckConformanceProfile }
     * 
     */
    public AckConformanceProfile createConformanceProfile() {
        return new AckConformanceProfile();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Datatypes }
     * 
     */
    public AckConformanceProfile.Datatypes createConformanceProfileDatatypes() {
        return new AckConformanceProfile.Datatypes();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Datatypes.Datatype }
     * 
     */
    public AckConformanceProfile.Datatypes.Datatype createConformanceProfileDatatypesDatatype() {
        return new AckConformanceProfile.Datatypes.Datatype();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Segments }
     * 
     */
    public AckConformanceProfile.Segments createConformanceProfileSegments() {
        return new AckConformanceProfile.Segments();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Segments.Segment }
     * 
     */
    public Segment createConformanceProfileSegmentsSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Messages }
     * 
     */
    public AckConformanceProfile.Messages createConformanceProfileMessages() {
        return new AckConformanceProfile.Messages();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Messages.Message }
     * 
     */
    public AckConformanceProfile.Messages.Message createConformanceProfileMessagesMessage() {
        return new AckConformanceProfile.Messages.Message();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.MetaData }
     * 
     */
    public AckConformanceProfile.MetaData createConformanceProfileMetaData() {
        return new AckConformanceProfile.MetaData();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Encodings }
     * 
     */
    public AckConformanceProfile.Encodings createConformanceProfileEncodings() {
        return new AckConformanceProfile.Encodings();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Datatypes.Datatype.DataTypeComponent }
     * 
     */
    public AckConformanceProfile.Datatypes.Datatype.DataTypeComponent createConformanceProfileDatatypesDatatypeComponent() {
        return new AckConformanceProfile.Datatypes.Datatype.DataTypeComponent();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Segments.Segment.Field }
     * 
     */
    public Field createConformanceProfileSegmentsSegmentField() {
        return new Field();
    }

    /**
     * Create an instance of {@link AckConformanceProfile.Messages.Message.Segment }
     * 
     */
    public Segment createConformanceProfileMessagesMessageSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AckConformanceProfile.Datatypes.Datatype.DataTypeComponent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DataTypeComponent", scope = AckConformanceProfile.Datatypes.Datatype.class)
    public JAXBElement<AckConformanceProfile.Datatypes.Datatype.DataTypeComponent> createConformanceProfileDatatypesDatatypeComponent(AckConformanceProfile.Datatypes.Datatype.DataTypeComponent value) {
        return new JAXBElement<AckConformanceProfile.Datatypes.Datatype.DataTypeComponent>(_ConformanceProfileDatatypesDatatypeComponent_QNAME, AckConformanceProfile.Datatypes.Datatype.DataTypeComponent.class, AckConformanceProfile.Datatypes.Datatype.class, value);
    }

}
