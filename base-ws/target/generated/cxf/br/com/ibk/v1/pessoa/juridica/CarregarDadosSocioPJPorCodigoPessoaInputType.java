
package br.com.ibk.v1.pessoa.juridica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CarregarDadosSocioPJPorCodigoPessoaInputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CarregarDadosSocioPJPorCodigoPessoaInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo-pessoa" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarregarDadosSocioPJPorCodigoPessoaInputType", propOrder = {
    "codigoPessoa"
})
public class CarregarDadosSocioPJPorCodigoPessoaInputType {

    @XmlElement(name = "codigo-pessoa")
    protected Long codigoPessoa;

    /**
     * Obtém o valor da propriedade codigoPessoa.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodigoPessoa() {
        return codigoPessoa;
    }

    /**
     * Define o valor da propriedade codigoPessoa.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodigoPessoa(Long value) {
        this.codigoPessoa = value;
    }

}
