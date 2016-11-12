
package br.com.ibk.v1.pessoa.juridica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CarregarPessoaJuridicaPorCnpjEOuNomeInputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CarregarPessoaJuridicaPorCnpjEOuNomeInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id-login-usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cnpj-empresa-selecionada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="perfil-usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarregarPessoaJuridicaPorCnpjEOuNomeInputType", propOrder = {
    "cnpj",
    "nome",
    "idLoginUsuario",
    "cnpjEmpresaSelecionada",
    "perfilUsuario"
})
public class CarregarPessoaJuridicaPorCnpjEOuNomeInputType {

    protected String cnpj;
    protected String nome;
    @XmlElement(name = "id-login-usuario")
    protected String idLoginUsuario;
    @XmlElement(name = "cnpj-empresa-selecionada")
    protected String cnpjEmpresaSelecionada;
    @XmlElement(name = "perfil-usuario")
    protected String perfilUsuario;

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
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade idLoginUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLoginUsuario() {
        return idLoginUsuario;
    }

    /**
     * Define o valor da propriedade idLoginUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLoginUsuario(String value) {
        this.idLoginUsuario = value;
    }

    /**
     * Obtém o valor da propriedade cnpjEmpresaSelecionada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjEmpresaSelecionada() {
        return cnpjEmpresaSelecionada;
    }

    /**
     * Define o valor da propriedade cnpjEmpresaSelecionada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjEmpresaSelecionada(String value) {
        this.cnpjEmpresaSelecionada = value;
    }

    /**
     * Obtém o valor da propriedade perfilUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfilUsuario() {
        return perfilUsuario;
    }

    /**
     * Define o valor da propriedade perfilUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfilUsuario(String value) {
        this.perfilUsuario = value;
    }

}
