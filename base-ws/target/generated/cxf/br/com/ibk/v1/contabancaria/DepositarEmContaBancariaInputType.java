
package br.com.ibk.v1.contabancaria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.ContaBancariaType;


/**
 * <p>Classe Java de depositarEmContaBancariaInputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="depositarEmContaBancariaInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conta" type="{http://ibk.com.br/v1/ebo}ContaBancariaType"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depositarEmContaBancariaInputType", propOrder = {
    "conta",
    "valor"
})
public class DepositarEmContaBancariaInputType {

    @XmlElement(required = true)
    protected ContaBancariaType conta;
    protected double valor;

    /**
     * Obtém o valor da propriedade conta.
     * 
     * @return
     *     possible object is
     *     {@link ContaBancariaType }
     *     
     */
    public ContaBancariaType getConta() {
        return conta;
    }

    /**
     * Define o valor da propriedade conta.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaBancariaType }
     *     
     */
    public void setConta(ContaBancariaType value) {
        this.conta = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
