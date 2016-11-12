
package br.com.ibk.v1.ebo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.ibk.v1.enumeration.EstadoCivilType;
import br.com.ibk.v1.enumeration.SexoEnumType;


/**
 * <p>Classe Java de PessoaFisicaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PessoaFisicaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ibk.com.br/v1/ebo}PessoaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://ibk.com.br/v1/enumeration}SexoEnumType" minOccurs="0"/&gt;
 *         &lt;element name="nacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documento-identidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sigla-orgao-expedidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="data-nascimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="estado-civil" type="{http://ibk.com.br/v1/enumeration}EstadoCivilType" minOccurs="0"/&gt;
 *         &lt;element name="conjuge" type="{http://ibk.com.br/v1/ebo}PessoaFisicaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaFisicaType", propOrder = {
    "cpf",
    "sexo",
    "nacionalidade",
    "profissao",
    "documentoIdentidade",
    "siglaOrgaoExpedidor",
    "dataNascimento",
    "estadoCivil",
    "conjuge"
})
public class PessoaFisicaType
    extends PessoaType
{

    protected String cpf;
    @XmlSchemaType(name = "string")
    protected SexoEnumType sexo;
    protected String nacionalidade;
    protected String profissao;
    @XmlElement(name = "documento-identidade")
    protected String documentoIdentidade;
    @XmlElement(name = "sigla-orgao-expedidor")
    protected String siglaOrgaoExpedidor;
    @XmlElement(name = "data-nascimento")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(name = "estado-civil")
    @XmlSchemaType(name = "string")
    protected EstadoCivilType estadoCivil;
    protected PessoaFisicaType conjuge;

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

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link SexoEnumType }
     *     
     */
    public SexoEnumType getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link SexoEnumType }
     *     
     */
    public void setSexo(SexoEnumType value) {
        this.sexo = value;
    }

    /**
     * Obtém o valor da propriedade nacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Define o valor da propriedade nacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidade(String value) {
        this.nacionalidade = value;
    }

    /**
     * Obtém o valor da propriedade profissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * Define o valor da propriedade profissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfissao(String value) {
        this.profissao = value;
    }

    /**
     * Obtém o valor da propriedade documentoIdentidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoIdentidade() {
        return documentoIdentidade;
    }

    /**
     * Define o valor da propriedade documentoIdentidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoIdentidade(String value) {
        this.documentoIdentidade = value;
    }

    /**
     * Obtém o valor da propriedade siglaOrgaoExpedidor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaOrgaoExpedidor() {
        return siglaOrgaoExpedidor;
    }

    /**
     * Define o valor da propriedade siglaOrgaoExpedidor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaOrgaoExpedidor(String value) {
        this.siglaOrgaoExpedidor = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCivilType }
     *     
     */
    public EstadoCivilType getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define o valor da propriedade estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCivilType }
     *     
     */
    public void setEstadoCivil(EstadoCivilType value) {
        this.estadoCivil = value;
    }

    /**
     * Obtém o valor da propriedade conjuge.
     * 
     * @return
     *     possible object is
     *     {@link PessoaFisicaType }
     *     
     */
    public PessoaFisicaType getConjuge() {
        return conjuge;
    }

    /**
     * Define o valor da propriedade conjuge.
     * 
     * @param value
     *     allowed object is
     *     {@link PessoaFisicaType }
     *     
     */
    public void setConjuge(PessoaFisicaType value) {
        this.conjuge = value;
    }

}
