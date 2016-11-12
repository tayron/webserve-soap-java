
package br.com.ibk.v1.ebo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ibk.v1.ebo package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ibk.v1.ebo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnderecoType }
     * 
     */
    public EnderecoType createEnderecoType() {
        return new EnderecoType();
    }

    /**
     * Create an instance of {@link EnderecoTypeArrayOf }
     * 
     */
    public EnderecoTypeArrayOf createEnderecoTypeArrayOf() {
        return new EnderecoTypeArrayOf();
    }

    /**
     * Create an instance of {@link PessoaType }
     * 
     */
    public PessoaType createPessoaType() {
        return new PessoaType();
    }

    /**
     * Create an instance of {@link PessoaTypeArrayOf }
     * 
     */
    public PessoaTypeArrayOf createPessoaTypeArrayOf() {
        return new PessoaTypeArrayOf();
    }

    /**
     * Create an instance of {@link PessoaFisicaType }
     * 
     */
    public PessoaFisicaType createPessoaFisicaType() {
        return new PessoaFisicaType();
    }

    /**
     * Create an instance of {@link PessoaFisicaTypeArrayOf }
     * 
     */
    public PessoaFisicaTypeArrayOf createPessoaFisicaTypeArrayOf() {
        return new PessoaFisicaTypeArrayOf();
    }

}
