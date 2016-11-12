
package br.com.ibk.v1.contabancaria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.ContaBancariaType;


/**
 * <p>Classe Java de carregarContaBancariaPorCodigoPessoaOutputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="carregarContaBancariaPorCodigoPessoaOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conta-bancaria" type="{http://ibk.com.br/v1/ebo}ContaBancariaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carregarContaBancariaPorCodigoPessoaOutputType", propOrder = {
    "contaBancaria"
})
public class CarregarContaBancariaPorCodigoPessoaOutputType {

    @XmlElement(name = "conta-bancaria")
    protected ContaBancariaType contaBancaria;

    /**
     * Obtém o valor da propriedade contaBancaria.
     * 
     * @return
     *     possible object is
     *     {@link ContaBancariaType }
     *     
     */
    public ContaBancariaType getContaBancaria() {
        return contaBancaria;
    }

    /**
     * Define o valor da propriedade contaBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaBancariaType }
     *     
     */
    public void setContaBancaria(ContaBancariaType value) {
        this.contaBancaria = value;
    }

}
