package br.com.ibk.v1.pessoa.fisica;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-12T14:54:14.991-02:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "CriarPessoaFisicaService", 
                  wsdlLocation = "file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/fisica/CriarPessoaFisica.wsdl",
                  targetNamespace = "http://ibk.com.br/v1/pessoa/fisica") 
public class CriarPessoaFisicaService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ibk.com.br/v1/pessoa/fisica", "CriarPessoaFisicaService");
    public final static QName CriarPessoaFisicaPort = new QName("http://ibk.com.br/v1/pessoa/fisica", "CriarPessoaFisicaPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/fisica/CriarPessoaFisica.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CriarPessoaFisicaService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Tayron/Projetos%20Java/base-ws/src/main/webapp/WEB-INF/v1/wsdl/pessoa/fisica/CriarPessoaFisica.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CriarPessoaFisicaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CriarPessoaFisicaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CriarPessoaFisicaService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CriarPessoaFisicaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CriarPessoaFisicaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CriarPessoaFisicaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CriarPessoaFisicaPortType
     */
    @WebEndpoint(name = "CriarPessoaFisicaPort")
    public CriarPessoaFisicaPortType getCriarPessoaFisicaPort() {
        return super.getPort(CriarPessoaFisicaPort, CriarPessoaFisicaPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CriarPessoaFisicaPortType
     */
    @WebEndpoint(name = "CriarPessoaFisicaPort")
    public CriarPessoaFisicaPortType getCriarPessoaFisicaPort(WebServiceFeature... features) {
        return super.getPort(CriarPessoaFisicaPort, CriarPessoaFisicaPortType.class, features);
    }

}