
package com.example.concurrence.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.concurrence.api package. 
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

    private final static QName _SaveDamage_QNAME = new QName("http://controller.api.bms.com/", "saveDamage");
    private final static QName _SaveDamageResponse_QNAME = new QName("http://controller.api.bms.com/", "saveDamageResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.concurrence.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveDamage }
     * 
     */
    public SaveDamage createSaveDamage() {
        return new SaveDamage();
    }

    /**
     * Create an instance of {@link SaveDamageResponse }
     * 
     */
    public SaveDamageResponse createSaveDamageResponse() {
        return new SaveDamageResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDamage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.api.bms.com/", name = "saveDamage")
    public JAXBElement<SaveDamage> createSaveDamage(SaveDamage value) {
        return new JAXBElement<SaveDamage>(_SaveDamage_QNAME, SaveDamage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveDamageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.api.bms.com/", name = "saveDamageResponse")
    public JAXBElement<SaveDamageResponse> createSaveDamageResponse(SaveDamageResponse value) {
        return new JAXBElement<SaveDamageResponse>(_SaveDamageResponse_QNAME, SaveDamageResponse.class, null, value);
    }

}
