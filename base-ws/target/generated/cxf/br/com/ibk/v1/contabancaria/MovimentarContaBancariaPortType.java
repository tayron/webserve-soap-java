package br.com.ibk.v1.contabancaria;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-12T14:54:13.912-02:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://ibk.com.br/v1/contabancaria", name = "MovimentarContaBancariaPortType")
@XmlSeeAlso({ObjectFactory.class, br.com.ibk.v1.ebo.ObjectFactory.class, br.com.ibk.v1.fault.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MovimentarContaBancariaPortType {

    @WebMethod
    @WebResult(name = "retirarDeContaBancariaOutput", targetNamespace = "http://ibk.com.br/v1/contabancaria", partName = "output")
    public RetirarDeContaBancariaOutputType retirarDeContaBancaria(
        @WebParam(partName = "input", name = "retirarDeContaBancariaInput", targetNamespace = "http://ibk.com.br/v1/contabancaria")
        RetirarDeContaBancariaInputType input
    ) throws ContaBancariaFault;

    @WebMethod
    @WebResult(name = "depositarEmContaBancariaOutput", targetNamespace = "http://ibk.com.br/v1/contabancaria", partName = "output")
    public DepositarEmContaBancariaOutputType depositarEmContaBancaria(
        @WebParam(partName = "input", name = "depositarEmContaBancariaInput", targetNamespace = "http://ibk.com.br/v1/contabancaria")
        DepositarEmContaBancariaInputType input
    ) throws ContaBancariaFault;
}