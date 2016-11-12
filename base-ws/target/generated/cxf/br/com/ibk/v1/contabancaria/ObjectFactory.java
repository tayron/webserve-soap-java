
package br.com.ibk.v1.contabancaria;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.contabancaria package. 
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

    private final static QName _DepositarEmContaBancariaInput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "depositarEmContaBancariaInput");
    private final static QName _DepositarEmContaBancariaOutput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "depositarEmContaBancariaOutput");
    private final static QName _RetirarDeContaBancariaInput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "retirarDeContaBancariaInput");
    private final static QName _RetirarDeContaBancariaOutput_QNAME = new QName("http://ibk.com.br/v1/contabancaria", "retirarDeContaBancariaOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.contabancaria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DepositarEmContaBancariaInputType }
     * 
     */
    public DepositarEmContaBancariaInputType createDepositarEmContaBancariaInputType() {
        return new DepositarEmContaBancariaInputType();
    }

    /**
     * Create an instance of {@link DepositarEmContaBancariaOutputType }
     * 
     */
    public DepositarEmContaBancariaOutputType createDepositarEmContaBancariaOutputType() {
        return new DepositarEmContaBancariaOutputType();
    }

    /**
     * Create an instance of {@link RetirarDeContaBancariaInputType }
     * 
     */
    public RetirarDeContaBancariaInputType createRetirarDeContaBancariaInputType() {
        return new RetirarDeContaBancariaInputType();
    }

    /**
     * Create an instance of {@link RetirarDeContaBancariaOutputType }
     * 
     */
    public RetirarDeContaBancariaOutputType createRetirarDeContaBancariaOutputType() {
        return new RetirarDeContaBancariaOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositarEmContaBancariaInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "depositarEmContaBancariaInput")
    public JAXBElement<DepositarEmContaBancariaInputType> createDepositarEmContaBancariaInput(DepositarEmContaBancariaInputType value) {
        return new JAXBElement<DepositarEmContaBancariaInputType>(_DepositarEmContaBancariaInput_QNAME, DepositarEmContaBancariaInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositarEmContaBancariaOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "depositarEmContaBancariaOutput")
    public JAXBElement<DepositarEmContaBancariaOutputType> createDepositarEmContaBancariaOutput(DepositarEmContaBancariaOutputType value) {
        return new JAXBElement<DepositarEmContaBancariaOutputType>(_DepositarEmContaBancariaOutput_QNAME, DepositarEmContaBancariaOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarDeContaBancariaInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "retirarDeContaBancariaInput")
    public JAXBElement<RetirarDeContaBancariaInputType> createRetirarDeContaBancariaInput(RetirarDeContaBancariaInputType value) {
        return new JAXBElement<RetirarDeContaBancariaInputType>(_RetirarDeContaBancariaInput_QNAME, RetirarDeContaBancariaInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirarDeContaBancariaOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/contabancaria", name = "retirarDeContaBancariaOutput")
    public JAXBElement<RetirarDeContaBancariaOutputType> createRetirarDeContaBancariaOutput(RetirarDeContaBancariaOutputType value) {
        return new JAXBElement<RetirarDeContaBancariaOutputType>(_RetirarDeContaBancariaOutput_QNAME, RetirarDeContaBancariaOutputType.class, null, value);
    }

}
