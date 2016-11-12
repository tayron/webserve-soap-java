
package br.com.ibk.v1.pessoa.juridica;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.PessoaJuridicaType;


/**
 * <p>Classe Java de CarregarPessoaJuridicaPorCnpjEOuNomeOutputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CarregarPessoaJuridicaPorCnpjEOuNomeOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lista-pessoa-juridica" type="{http://ibk.com.br/v1/ebo}PessoaJuridicaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarregarPessoaJuridicaPorCnpjEOuNomeOutputType", propOrder = {
    "listaPessoaJuridica"
})
public class CarregarPessoaJuridicaPorCnpjEOuNomeOutputType {

    @XmlElement(name = "lista-pessoa-juridica")
    protected List<PessoaJuridicaType> listaPessoaJuridica;

    /**
     * Gets the value of the listaPessoaJuridica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaPessoaJuridica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaPessoaJuridica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaJuridicaType }
     * 
     * 
     */
    public List<PessoaJuridicaType> getListaPessoaJuridica() {
        if (listaPessoaJuridica == null) {
            listaPessoaJuridica = new ArrayList<PessoaJuridicaType>();
        }
        return this.listaPessoaJuridica;
    }

}
