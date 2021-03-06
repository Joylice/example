
package com.example.concurrence.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ApiService", targetNamespace = "http://controller.api.bms.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ApiService {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg10
     * @param arg11
     * @param arg7
     * @param arg6
     * @param arg9
     * @param arg8
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saveDamage", targetNamespace = "http://controller.api.bms.com/", className = "com.example.concurrence.api.SaveDamage")
    @ResponseWrapper(localName = "saveDamageResponse", targetNamespace = "http://controller.api.bms.com/", className = "com.example.concurrence.api.SaveDamageResponse")
    @Action(input = "http://controller.api.bms.com/ApiService/saveDamageRequest", output = "http://controller.api.bms.com/ApiService/saveDamageResponse")
    public String saveDamage(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    String arg1,
            @WebParam(name = "arg2", targetNamespace = "")
                    String arg2,
            @WebParam(name = "arg3", targetNamespace = "")
                    String arg3,
            @WebParam(name = "arg4", targetNamespace = "")
                    String arg4,
            @WebParam(name = "arg5", targetNamespace = "")
                    String arg5,
            @WebParam(name = "arg6", targetNamespace = "")
                    String arg6,
            @WebParam(name = "arg7", targetNamespace = "")
                    Integer arg7,
            @WebParam(name = "arg8", targetNamespace = "")
                    Integer arg8,
            @WebParam(name = "arg9", targetNamespace = "")
                    XMLGregorianCalendar arg9,
            @WebParam(name = "arg10", targetNamespace = "")
                    String arg10,
            @WebParam(name = "arg11", targetNamespace = "")
                    String arg11);

}
