
package br.com.ibk.v1.fault;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServicoFaultType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServicoFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servico-erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servico-erro-descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="negocio-erro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="negocio-erro-descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicoFaultType", propOrder = {
    "servicoErro",
    "servicoErroDescricao",
    "negocioErro",
    "negocioErroDescricao"
})
public class ServicoFaultType {

    @XmlElement(name = "servico-erro")
    protected String servicoErro;
    @XmlElement(name = "servico-erro-descricao")
    protected String servicoErroDescricao;
    @XmlElement(name = "negocio-erro")
    protected String negocioErro;
    @XmlElement(name = "negocio-erro-descricao")
    protected String negocioErroDescricao;

    /**
     * Obtém o valor da propriedade servicoErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicoErro() {
        return servicoErro;
    }

    /**
     * Define o valor da propriedade servicoErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicoErro(String value) {
        this.servicoErro = value;
    }

    /**
     * Obtém o valor da propriedade servicoErroDescricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicoErroDescricao() {
        return servicoErroDescricao;
    }

    /**
     * Define o valor da propriedade servicoErroDescricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicoErroDescricao(String value) {
        this.servicoErroDescricao = value;
    }

    /**
     * Obtém o valor da propriedade negocioErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegocioErro() {
        return negocioErro;
    }

    /**
     * Define o valor da propriedade negocioErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegocioErro(String value) {
        this.negocioErro = value;
    }

    /**
     * Obtém o valor da propriedade negocioErroDescricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegocioErroDescricao() {
        return negocioErroDescricao;
    }

    /**
     * Define o valor da propriedade negocioErroDescricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegocioErroDescricao(String value) {
        this.negocioErroDescricao = value;
    }

}
