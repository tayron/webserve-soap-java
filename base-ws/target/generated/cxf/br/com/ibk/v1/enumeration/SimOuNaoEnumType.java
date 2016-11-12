
package br.com.ibk.v1.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SimOuNaoEnumType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SimOuNaoEnumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SIM"/&gt;
 *     &lt;enumeration value="NAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SimOuNaoEnumType", namespace = "http://ibk.com.br/v1/enumeration")
@XmlEnum
public enum SimOuNaoEnumType {

    SIM,
    NAO;

    public String value() {
        return name();
    }

    public static SimOuNaoEnumType fromValue(String v) {
        return valueOf(v);
    }

}
