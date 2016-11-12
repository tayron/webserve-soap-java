
package br.com.ibk.v1.pessoa.fisica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.PessoaFisicaType;


/**
 * <p>Classe Java de AtualizarERetornarPessoaFisicaInputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AtualizarERetornarPessoaFisicaInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pessoa-fisica" type="{http://ibk.com.br/v1/ebo}PessoaFisicaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtualizarERetornarPessoaFisicaInputType", propOrder = {
    "pessoaFisica"
})
public class AtualizarERetornarPessoaFisicaInputType {

    @XmlElement(name = "pessoa-fisica")
    protected PessoaFisicaType pessoaFisica;

    /**
     * Obtém o valor da propriedade pessoaFisica.
     * 
     * @return
     *     possible object is
     *     {@link PessoaFisicaType }
     *     
     */
    public PessoaFisicaType getPessoaFisica() {
        return pessoaFisica;
    }

    /**
     * Define o valor da propriedade pessoaFisica.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaFisicaType }
     *     
     */
    public void setPessoaFisica(PessoaFisicaType value) {
        this.pessoaFisica = value;
    }

}
