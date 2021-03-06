package br.com.ibk.v1.pessoa.juridica;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-12T14:54:14.087-02:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "AtualizarPessoaJuridicaService", 
                  wsdlLocation = "file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/juridica/AtualizarPessoaJuridica.wsdl",
                  targetNamespace = "http://ibk.com.br/v1/pessoa/juridica") 
public class AtualizarPessoaJuridicaService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ibk.com.br/v1/pessoa/juridica", "AtualizarPessoaJuridicaService");
    public final static QName AtualizarPessoaJuridicaPort = new QName("http://ibk.com.br/v1/pessoa/juridica", "AtualizarPessoaJuridicaPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/juridica/AtualizarPessoaJuridica.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AtualizarPessoaJuridicaService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/juridica/AtualizarPessoaJuridica.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AtualizarPessoaJuridicaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AtualizarPessoaJuridicaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AtualizarPessoaJuridicaService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AtualizarPessoaJuridicaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AtualizarPessoaJuridicaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AtualizarPessoaJuridicaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AtualizarPessoaJuridicaPortType
     */
    @WebEndpoint(name = "AtualizarPessoaJuridicaPort")
    public AtualizarPessoaJuridicaPortType getAtualizarPessoaJuridicaPort() {
        return super.getPort(AtualizarPessoaJuridicaPort, AtualizarPessoaJuridicaPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AtualizarPessoaJuridicaPortType
     */
    @WebEndpoint(name = "AtualizarPessoaJuridicaPort")
    public AtualizarPessoaJuridicaPortType getAtualizarPessoaJuridicaPort(WebServiceFeature... features) {
        return super.getPort(AtualizarPessoaJuridicaPort, AtualizarPessoaJuridicaPortType.class, features);
    }

}
