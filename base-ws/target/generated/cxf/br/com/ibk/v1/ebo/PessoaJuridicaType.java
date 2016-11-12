
package br.com.ibk.v1.ebo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de PessoaJuridicaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PessoaJuridicaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ibk.com.br/v1/ebo}PessoaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inscricao-estadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="razao-social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data-inicio-atividade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="valor-capital-social" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numero-empregados" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="contato" type="{http://ibk.com.br/v1/ebo}ContatoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaJuridicaType", propOrder = {
    "cnpj",
    "inscricaoEstadual",
    "razaoSocial",
    "dataInicioAtividade",
    "valorCapitalSocial",
    "numeroEmpregados",
    "contato"
})
public class PessoaJuridicaType
    extends PessoaType
{

    protected String cnpj;
    @XmlElement(name = "inscricao-estadual")
    protected String inscricaoEstadual;
    @XmlElement(name = "razao-social")
    protected String razaoSocial;
    @XmlElement(name = "data-inicio-atividade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInicioAtividade;
    @XmlElement(name = "valor-capital-social")
    protected BigDecimal valorCapitalSocial;
    @XmlElement(name = "numero-empregados")
    protected Integer numeroEmpregados;
    protected ContatoType contato;

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade inscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * Define o valor da propriedade inscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoEstadual(String value) {
        this.inscricaoEstadual = value;
    }

    /**
     * Obtém o valor da propriedade razaoSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define o valor da propriedade razaoSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Obtém o valor da propriedade dataInicioAtividade.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioAtividade() {
        return dataInicioAtividade;
    }

    /**
     * Define o valor da propriedade dataInicioAtividade.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioAtividade(XMLGregorianCalendar value) {
        this.dataInicioAtividade = value;
    }

    /**
     * Obtém o valor da propriedade valorCapitalSocial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCapitalSocial() {
        return valorCapitalSocial;
    }

    /**
     * Define o valor da propriedade valorCapitalSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCapitalSocial(BigDecimal value) {
        this.valorCapitalSocial = value;
    }

    /**
     * Obtém o valor da propriedade numeroEmpregados.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroEmpregados() {
        return numeroEmpregados;
    }

    /**
     * Define o valor da propriedade numeroEmpregados.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroEmpregados(Integer value) {
        this.numeroEmpregados = value;
    }

    /**
     * Obtém o valor da propriedade contato.
     * 
     * @return
     *     possible object is
     *     {@link ContatoType }
     *     
     */
    public ContatoType getContato() {
        return contato;
    }

    /**
     * Define o valor da propriedade contato.
     * 
     * @param value
     *     allowed object is
     *     {@link ContatoType }
     *     
     */
    public void setContato(ContatoType value) {
        this.contato = value;
    }

}
