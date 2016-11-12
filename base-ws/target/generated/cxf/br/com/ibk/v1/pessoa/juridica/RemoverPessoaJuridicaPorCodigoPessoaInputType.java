
package br.com.ibk.v1.pessoa.juridica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RemoverPessoaJuridicaPorCodigoPessoaInputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RemoverPessoaJuridicaPorCodigoPessoaInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo-pessoa" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoverPessoaJuridicaPorCodigoPessoaInputType", propOrder = {
    "codigoPessoa"
})
public class RemoverPessoaJuridicaPorCodigoPessoaInputType {

    @XmlElement(name = "codigo-pessoa")
    protected long codigoPessoa;

    /**
     * Obtém o valor da propriedade codigoPessoa.
     * 
     */
    public long getCodigoPessoa() {
        return codigoPessoa;
    }

    /**
     * Define o valor da propriedade codigoPessoa.
     * 
     */
    public void setCodigoPessoa(long value) {
        this.codigoPessoa = value;
    }

}
