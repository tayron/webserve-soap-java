
package br.com.ibk.v1.ebo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContatoTypeArrayOf complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContatoTypeArrayOf"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contato" type="{http://ibk.com.br/v1/ebo}ContatoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContatoTypeArrayOf", propOrder = {
    "contato"
})
public class ContatoTypeArrayOf {

    protected List<ContatoType> contato;

    /**
     * Gets the value of the contato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContato().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContatoType }
     * 
     * 
     */
    public List<ContatoType> getContato() {
        if (contato == null) {
            contato = new ArrayList<ContatoType>();
        }
        return this.contato;
    }

}
