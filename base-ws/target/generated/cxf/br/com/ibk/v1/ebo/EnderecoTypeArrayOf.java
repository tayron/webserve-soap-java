
package br.com.ibk.v1.ebo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EnderecoTypeArrayOf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EnderecoTypeArrayOf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endereco" type="{http://ibk.com.br/v1/ebo}EnderecoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnderecoTypeArrayOf", propOrder = {
    "endereco"
})
public class EnderecoTypeArrayOf {

    protected List<EnderecoType> endereco;

    /**
     * Gets the value of the endereco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endereco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndereco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnderecoType }
     * 
     * 
     */
    public List<EnderecoType> getEndereco() {
        if (endereco == null) {
            endereco = new ArrayList<EnderecoType>();
        }
        return this.endereco;
    }

}
