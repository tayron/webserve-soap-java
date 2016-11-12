
package br.com.ibk.v1.pessoa.juridica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.PessoaJuridicaType;


/**
 * <p>Classe Java de CarregarProponentePorNumeroPropostaOutputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CarregarProponentePorNumeroPropostaOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="proponente" type="{http://ibk.com.br/v1/ebo}PessoaJuridicaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarregarProponentePorNumeroPropostaOutputType", propOrder = {
    "proponente"
})
public class CarregarProponentePorNumeroPropostaOutputType {

    protected PessoaJuridicaType proponente;

    /**
     * Obtém o valor da propriedade proponente.
     * 
     * @return
     *     possible object is
     *     {@link PessoaJuridicaType }
     *     
     */
    public PessoaJuridicaType getProponente() {
        return proponente;
    }

    /**
     * Define o valor da propriedade proponente.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaJuridicaType }
     *     
     */
    public void setProponente(PessoaJuridicaType value) {
        this.proponente = value;
    }

}
