
package br.com.ibk.v1.enumeration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de EstadoCivilType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoCivilType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SOLTEIRO"/&gt;
 *     &lt;enumeration value="CASADO"/&gt;
 *     &lt;enumeration value="DIVORCIADO"/&gt;
 *     &lt;enumeration value="VIUVO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EstadoCivilType", namespace = "http://ibk.com.br/v1/enumeration")
@XmlEnum
public enum EstadoCivilType {

    SOLTEIRO,
    CASADO,
    DIVORCIADO,
    VIUVO;

    public String value() {
        return name();
    }

    public static EstadoCivilType fromValue(String v) {
        return valueOf(v);
    }

}
