
package br.com.ibk.v1.ebo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PessoaJuridicaTypeArrayOf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PessoaJuridicaTypeArrayOf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pessoa-juridica" type="{http://ibk.com.br/v1/ebo}PessoaJuridicaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaJuridicaTypeArrayOf", propOrder = {
    "pessoaJuridica"
})
public class PessoaJuridicaTypeArrayOf {

    @XmlElement(name = "pessoa-juridica")
    protected List<PessoaJuridicaType> pessoaJuridica;

    /**
     * Gets the value of the pessoaJuridica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaJuridica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaJuridica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaJuridicaType }
     * 
     * 
     */
    public List<PessoaJuridicaType> getPessoaJuridica() {
        if (pessoaJuridica == null) {
            pessoaJuridica = new ArrayList<PessoaJuridicaType>();
        }
        return this.pessoaJuridica;
    }

}
