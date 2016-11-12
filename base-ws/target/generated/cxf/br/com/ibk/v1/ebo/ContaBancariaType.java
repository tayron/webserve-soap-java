
package br.com.ibk.v1.ebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContaBancariaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContaBancariaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numero-agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digito-verificador-agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero-conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digito-verificador-conta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="banco" type="{http://ibk.com.br/v1/ebo}BancoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContaBancariaType", propOrder = {
    "codigo",
    "numeroAgencia",
    "digitoVerificadorAgencia",
    "numeroConta",
    "digitoVerificadorConta",
    "banco"
})
public class ContaBancariaType {

    protected Long codigo;
    @XmlElement(name = "numero-agencia")
    protected String numeroAgencia;
    @XmlElement(name = "digito-verificador-agencia")
    protected String digitoVerificadorAgencia;
    @XmlElement(name = "numero-conta")
    protected String numeroConta;
    @XmlElement(name = "digito-verificador-conta")
    protected String digitoVerificadorConta;
    protected BancoType banco;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigo(Long value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade numeroAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    /**
     * Define o valor da propriedade numeroAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAgencia(String value) {
        this.numeroAgencia = value;
    }

    /**
     * Obtém o valor da propriedade digitoVerificadorAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitoVerificadorAgencia() {
        return digitoVerificadorAgencia;
    }

    /**
     * Define o valor da propriedade digitoVerificadorAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitoVerificadorAgencia(String value) {
        this.digitoVerificadorAgencia = value;
    }

    /**
     * Obtém o valor da propriedade numeroConta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConta() {
        return numeroConta;
    }

    /**
     * Define o valor da propriedade numeroConta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConta(String value) {
        this.numeroConta = value;
    }

    /**
     * Obtém o valor da propriedade digitoVerificadorConta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitoVerificadorConta() {
        return digitoVerificadorConta;
    }

    /**
     * Define o valor da propriedade digitoVerificadorConta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitoVerificadorConta(String value) {
        this.digitoVerificadorConta = value;
    }

    /**
     * Obtém o valor da propriedade banco.
     * 
     * @return
     *     possible object is
     *     {@link BancoType }
     *     
     */
    public BancoType getBanco() {
        return banco;
    }

    /**
     * Define o valor da propriedade banco.
     * 
     * @param value
     *     allowed object is
     *     {@link BancoType }
     *     
     */
    public void setBanco(BancoType value) {
        this.banco = value;
    }

}
