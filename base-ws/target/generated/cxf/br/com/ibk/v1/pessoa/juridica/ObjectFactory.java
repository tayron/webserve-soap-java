
package br.com.ibk.v1.pessoa.juridica;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.pessoa.juridica package. 
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

    private final static QName _RemoverPessoaJuridicaPorCodigoPessoaInput_QNAME = new QName("http://ibk.com.br/v1/pessoa/juridica", "removerPessoaJuridicaPorCodigoPessoaInput");
    private final static QName _RemoverPessoaJuridicaPorCodigoPessoaOutput_QNAME = new QName("http://ibk.com.br/v1/pessoa/juridica", "removerPessoaJuridicaPorCodigoPessoaOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.pessoa.juridica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoverPessoaJuridicaPorCodigoPessoaInputType }
     * 
     */
    public RemoverPessoaJuridicaPorCodigoPessoaInputType createRemoverPessoaJuridicaPorCodigoPessoaInputType() {
        return new RemoverPessoaJuridicaPorCodigoPessoaInputType();
    }

    /**
     * Create an instance of {@link RemoverPessoaJuridicaPorCodigoPessoaOutputType }
     * 
     */
    public RemoverPessoaJuridicaPorCodigoPessoaOutputType createRemoverPessoaJuridicaPorCodigoPessoaOutputType() {
        return new RemoverPessoaJuridicaPorCodigoPessoaOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverPessoaJuridicaPorCodigoPessoaInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/pessoa/juridica", name = "removerPessoaJuridicaPorCodigoPessoaInput")
    public JAXBElement<RemoverPessoaJuridicaPorCodigoPessoaInputType> createRemoverPessoaJuridicaPorCodigoPessoaInput(RemoverPessoaJuridicaPorCodigoPessoaInputType value) {
        return new JAXBElement<RemoverPessoaJuridicaPorCodigoPessoaInputType>(_RemoverPessoaJuridicaPorCodigoPessoaInput_QNAME, RemoverPessoaJuridicaPorCodigoPessoaInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverPessoaJuridicaPorCodigoPessoaOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibk.com.br/v1/pessoa/juridica", name = "removerPessoaJuridicaPorCodigoPessoaOutput")
    public JAXBElement<RemoverPessoaJuridicaPorCodigoPessoaOutputType> createRemoverPessoaJuridicaPorCodigoPessoaOutput(RemoverPessoaJuridicaPorCodigoPessoaOutputType value) {
        return new JAXBElement<RemoverPessoaJuridicaPorCodigoPessoaOutputType>(_RemoverPessoaJuridicaPorCodigoPessoaOutput_QNAME, RemoverPessoaJuridicaPorCodigoPessoaOutputType.class, null, value);
    }

}
