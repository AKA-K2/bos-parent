
package com.qwm.bos.utils;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICustomerService", targetNamespace = "http://bos_crm.qwm.com/")
@XmlSeeAlso({
//    ObjectFactory.class
})
public interface ICustomerService {


    /**
     * 
     * @return
     *     returns java.util.List<com.qwm.bos.utils.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findListNotAssociation", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindListNotAssociation")
    @ResponseWrapper(localName = "findListNotAssociationResponse", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindListNotAssociationResponse")
    public List<Customer> findListNotAssociation();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.qwm.bos.utils.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCustomerByTelephone", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindCustomerByTelephone")
    @ResponseWrapper(localName = "findCustomerByTelephoneResponse", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindCustomerByTelephoneResponse")
    public Customer findCustomerByTelephone(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.qwm.bos.utils.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findListAssociation", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindListAssociation")
    @ResponseWrapper(localName = "findListAssociationResponse", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindListAssociationResponse")
    public List<Customer> findListAssociation();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "assigncustomerstodecidedzone", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.Assigncustomerstodecidedzone")
    @ResponseWrapper(localName = "assigncustomerstodecidedzoneResponse", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.AssigncustomerstodecidedzoneResponse")
    public void assigncustomerstodecidedzone(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0,
            @WebParam(name = "arg1", targetNamespace = "")
            List<Integer> arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findDecidedzoneIdByAddress", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindDecidedzoneIdByAddress")
    @ResponseWrapper(localName = "findDecidedzoneIdByAddressResponse", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindDecidedzoneIdByAddressResponse")
    public String findDecidedzoneIdByAddress(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.qwm.bos.utils.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findListHasAssociation", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindListHasAssociation")
    @ResponseWrapper(localName = "findListHasAssociationResponse", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindListHasAssociationResponse")
    public List<Customer> findListHasAssociation(
            @WebParam(name = "arg0", targetNamespace = "")
            String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.qwm.bos.utils.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://bos_crm.qwm.com/", className = "com.qwm.bos.utils.FindAllResponse")
    public List<Customer> findAll();

}
