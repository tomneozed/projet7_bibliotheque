
package generated.bibliothekservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BibliothekServiceService", targetNamespace = "http://webservice.bibliothek.com/", wsdlLocation = "http://laptop-nv02e10l:8080/bibliothek2619102392002659713/BibliothekServiceService?wsdl")
public class BibliothekServiceService
    extends Service
{

    private final static URL BIBLIOTHEKSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException BIBLIOTHEKSERVICESERVICE_EXCEPTION;
    private final static QName BIBLIOTHEKSERVICESERVICE_QNAME = new QName("http://webservice.bibliothek.com/", "BibliothekServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.34:8084/bibliothek?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BIBLIOTHEKSERVICESERVICE_WSDL_LOCATION = url;
        BIBLIOTHEKSERVICESERVICE_EXCEPTION = e;
    }

    public BibliothekServiceService() {
        super(__getWsdlLocation(), BIBLIOTHEKSERVICESERVICE_QNAME);
    }

    public BibliothekServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BIBLIOTHEKSERVICESERVICE_QNAME, features);
    }

    public BibliothekServiceService(URL wsdlLocation) {
        super(wsdlLocation, BIBLIOTHEKSERVICESERVICE_QNAME);
    }

    public BibliothekServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BIBLIOTHEKSERVICESERVICE_QNAME, features);
    }

    public BibliothekServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BibliothekServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BibliothekService
     */
    @WebEndpoint(name = "BibliothekServicePort")
    public BibliothekService getBibliothekServicePort() {
        return super.getPort(new QName("http://webservice.bibliothek.com/", "BibliothekServicePort"), BibliothekService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BibliothekService
     */
    @WebEndpoint(name = "BibliothekServicePort")
    public BibliothekService getBibliothekServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.bibliothek.com/", "BibliothekServicePort"), BibliothekService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BIBLIOTHEKSERVICESERVICE_EXCEPTION!= null) {
            throw BIBLIOTHEKSERVICESERVICE_EXCEPTION;
        }
        return BIBLIOTHEKSERVICESERVICE_WSDL_LOCATION;
    }

}
