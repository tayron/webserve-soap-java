
package br.com.ibk.v1.pessoa.fisica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CarregarPessoaFisicaPorNumeroPropostaCpfInputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CarregarPessoaFisicaPorNumeroPropostaCpfInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero-proposta" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarregarPessoaFisicaPorNumeroPropostaCpfInputType", propOrder = {
    "numeroProposta",
    "cpf"
})
public class CarregarPessoaFisicaPorNumeroPropostaCpfInputType {

    @XmlElement(name = "numero-proposta")
    protected long numeroProposta;
    @XmlElement(required = true)
    protected String cpf;

    /**
     * Obtém o valor da propriedade numeroProposta.
     * 
     */
    public long getNumeroProposta() {
        return numeroProposta;
    }

    /**
     * Define o valor da propriedade numeroProposta.
     * 
     */
    public void setNumeroProposta(long value) {
        this.numeroProposta = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

}
