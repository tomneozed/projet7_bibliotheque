
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
@WebServiceClient(name = "bibliothek", targetNamespace = "http://webservice.bibliothek.com/", wsdlLocation = "http://laptop-nv02e10l:8080/bibliothek1361172401379763406/bibliothek?wsdl")
public class Bibliothek
    extends Service
{

    private final static URL BIBLIOTHEK_WSDL_LOCATION;
    private final static WebServiceException BIBLIOTHEK_EXCEPTION;
    private final static QName BIBLIOTHEK_QNAME = new QName("http://webservice.bibliothek.com/", "bibliothek");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://laptop-nv02e10l:8080/bibliothek1361172401379763406/bibliothek?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BIBLIOTHEK_WSDL_LOCATION = url;
        BIBLIOTHEK_EXCEPTION = e;
    }

    public Bibliothek() {
        super(__getWsdlLocation(), BIBLIOTHEK_QNAME);
    }

    public Bibliothek(WebServiceFeature... features) {
        super(__getWsdlLocation(), BIBLIOTHEK_QNAME, features);
    }

    public Bibliothek(URL wsdlLocation) {
        super(wsdlLocation, BIBLIOTHEK_QNAME);
    }

    public Bibliothek(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BIBLIOTHEK_QNAME, features);
    }

    public Bibliothek(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Bibliothek(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
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
        if (BIBLIOTHEK_EXCEPTION!= null) {
            throw BIBLIOTHEK_EXCEPTION;
        }
        return BIBLIOTHEK_WSDL_LOCATION;
    }

}
