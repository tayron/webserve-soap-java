
package br.com.ibk.v1.pessoa.juridica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CarregarProponentePorNumeroPropostaInputType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CarregarProponentePorNumeroPropostaInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero-proposta" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarregarProponentePorNumeroPropostaInputType", propOrder = {
    "numeroProposta"
})
public class CarregarProponentePorNumeroPropostaInputType {

    @XmlElement(name = "numero-proposta")
    protected long numeroProposta;

    /**
     * Obtém o valor da propriedade numeroProposta.
     * 
     */
    public long getNumeroProposta() {
        return numeroProposta;
    }

    /**
     * Define o valor da propriedade numeroProposta.
     * 
     */
    public void setNumeroProposta(long value) {
        this.numeroProposta = value;
    }

}
