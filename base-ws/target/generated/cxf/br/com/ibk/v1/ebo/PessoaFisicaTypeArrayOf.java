
package br.com.ibk.v1.ebo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PessoaFisicaTypeArrayOf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PessoaFisicaTypeArrayOf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pessoa-fisica" type="{http://ibk.com.br/v1/ebo}PessoaFisicaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PessoaFisicaTypeArrayOf", propOrder = {
    "pessoaFisica"
})
public class PessoaFisicaTypeArrayOf {

    @XmlElement(name = "pessoa-fisica")
    protected List<PessoaFisicaType> pessoaFisica;

    /**
     * Gets the value of the pessoaFisica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaFisica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaFisica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaFisicaType }
     * 
     * 
     */
    public List<PessoaFisicaType> getPessoaFisica() {
        if (pessoaFisica == null) {
            pessoaFisica = new ArrayList<PessoaFisicaType>();
        }
        return this.pessoaFisica;
    }

}
