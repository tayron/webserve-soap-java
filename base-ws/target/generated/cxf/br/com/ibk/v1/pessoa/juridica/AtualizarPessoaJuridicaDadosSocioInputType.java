
package br.com.ibk.v1.pessoa.juridica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.PessoaJuridicaType;


/**
 * <p>Classe Java de AtualizarPessoaJuridicaDadosSocioInputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AtualizarPessoaJuridicaDadosSocioInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pessoa-juridica" type="{http://ibk.com.br/v1/ebo}PessoaJuridicaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtualizarPessoaJuridicaDadosSocioInputType", propOrder = {
    "pessoaJuridica"
})
public class AtualizarPessoaJuridicaDadosSocioInputType {

    @XmlElement(name = "pessoa-juridica")
    protected PessoaJuridicaType pessoaJuridica;

    /**
     * Obtém o valor da propriedade pessoaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link PessoaJuridicaType }
     *     
     */
    public PessoaJuridicaType getPessoaJuridica() {
        return pessoaJuridica;
    }

    /**
     * Define o valor da propriedade pessoaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaJuridicaType }
     *     
     */
    public void setPessoaJuridica(PessoaJuridicaType value) {
        this.pessoaJuridica = value;
    }

}
