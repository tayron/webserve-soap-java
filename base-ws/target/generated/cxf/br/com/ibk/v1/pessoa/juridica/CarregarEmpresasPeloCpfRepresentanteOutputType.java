
package br.com.ibk.v1.pessoa.juridica;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.ibk.v1.ebo.PessoaJuridicaType;


/**
 * <p>Classe Java de CarregarEmpresasPeloCpfRepresentanteOutputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CarregarEmpresasPeloCpfRepresentanteOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="empresas" type="{http://ibk.com.br/v1/ebo}PessoaJuridicaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarregarEmpresasPeloCpfRepresentanteOutputType", propOrder = {
    "empresas"
})
public class CarregarEmpresasPeloCpfRepresentanteOutputType {

    protected List<PessoaJuridicaType> empresas;

    /**
     * Gets the value of the empresas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empresas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpresas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaJuridicaType }
     * 
     * 
     */
    public List<PessoaJuridicaType> getEmpresas() {
        if (empresas == null) {
            empresas = new ArrayList<PessoaJuridicaType>();
        }
        return this.empresas;
    }

}
