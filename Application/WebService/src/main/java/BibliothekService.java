import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "bibliothek")
public class BibliothekService {

    @WebMethod
    public String helloMethod(){
        return "methode de test";
    }

}
