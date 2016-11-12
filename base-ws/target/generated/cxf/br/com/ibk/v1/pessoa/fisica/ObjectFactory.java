
package br.com.ibk.v1.pessoa.fisica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.pessoa.fisica package. 
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

    private final static QName _RemoverPessoaFisicaPorCodigoPessoaInput_QNAME = new QName("http://ibk.com.br/v1/pessoa/fisica", "removerPessoaFisicaPorCodigoPessoaInput");
    private final static QName _RemoverPessoaFisicaPorCodigoPessoaOutput_QNAME = new QName("http://ibk.com.br/v1/pessoa/fisica", "removerPessoaFisicaPorCodigoPessoaOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.pessoa.fisica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoverPessoaFisicaPorCodigoPessoaInputType }
     * 
     */
    public RemoverPessoaFisicaPorCodigoPessoaInputType createRemoverPessoaFisicaPorCodigoPessoaInputType() {
        return new RemoverPessoaFisicaPorCodigoPessoaInputType();
    }

    /**
     * Create an instance of {@link RemoverPessoaFisicaPorCodigoPessoaOutputType }
     * 
     */
    public RemoverPessoaFisicaPorCodigoPessoaOutputType createRemoverPessoaFisicaPorCodigoPessoaOutputType() {
        return new RemoverPessoaFisicaPorCodigoPessoaOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverPessoaFisicaPorCodigoPessoaInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/pessoa/fisica", name = "removerPessoaFisicaPorCodigoPessoaInput")
    public JAXBElement<RemoverPessoaFisicaPorCodigoPessoaInputType> createRemoverPessoaFisicaPorCodigoPessoaInput(RemoverPessoaFisicaPorCodigoPessoaInputType value) {
        return new JAXBElement<RemoverPessoaFisicaPorCodigoPessoaInputType>(_RemoverPessoaFisicaPorCodigoPessoaInput_QNAME, RemoverPessoaFisicaPorCodigoPessoaInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverPessoaFisicaPorCodigoPessoaOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/pessoa/fisica", name = "removerPessoaFisicaPorCodigoPessoaOutput")
    public JAXBElement<RemoverPessoaFisicaPorCodigoPessoaOutputType> createRemoverPessoaFisicaPorCodigoPessoaOutput(RemoverPessoaFisicaPorCodigoPessoaOutputType value) {
        return new JAXBElement<RemoverPessoaFisicaPorCodigoPessoaOutputType>(_RemoverPessoaFisicaPorCodigoPessoaOutput_QNAME, RemoverPessoaFisicaPorCodigoPessoaOutputType.class, null, value);
    }

}
