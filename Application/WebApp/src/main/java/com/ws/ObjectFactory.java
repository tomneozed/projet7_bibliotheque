
package com.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateOuvrageResponse_QNAME = new QName("http://com/", "createOuvrageResponse");
    private final static QName _DeleteOuvrageResponse_QNAME = new QName("http://com/", "deleteOuvrageResponse");
    private final static QName _NotRenderedLoansResponse_QNAME = new QName("http://com/", "notRenderedLoansResponse");
    private final static QName _AllAuteurs_QNAME = new QName("http://com/", "allAuteurs");
    private final static QName _AllOuvrages_QNAME = new QName("http://com/", "allOuvrages");
    private final static QName _CreateAuteur_QNAME = new QName("http://com/", "createAuteur");
    private final static QName _GetAuteur_QNAME = new QName("http://com/", "getAuteur");
    private final static QName _AllAuteursResponse_QNAME = new QName("http://com/", "allAuteursResponse");
    private final static QName _AllOuvragesResponse_QNAME = new QName("http://com/", "allOuvragesResponse");
    private final static QName _UpdateAuteur_QNAME = new QName("http://com/", "updateAuteur");
    private final static QName _GetLoan_QNAME = new QName("http://com/", "getLoan");
    private final static QName _GetOuvrageResponse_QNAME = new QName("http://com/", "getOuvrageResponse");
    private final static QName _CreateAuteurResponse_QNAME = new QName("http://com/", "createAuteurResponse");
    private final static QName _CreateLoan_QNAME = new QName("http://com/", "createLoan");
    private final static QName _CreateOuvrage_QNAME = new QName("http://com/", "createOuvrage");
    private final static QName _Identification_QNAME = new QName("http://com/", "identification");
    private final static QName _DeleteAuteurResponse_QNAME = new QName("http://com/", "deleteAuteurResponse");
    private final static QName _GetLoanResponse_QNAME = new QName("http://com/", "getLoanResponse");
    private final static QName _GetOuvrage_QNAME = new QName("http://com/", "getOuvrage");
    private final static QName _IdentificationResponse_QNAME = new QName("http://com/", "identificationResponse");
    private final static QName _AllLoansResponse_QNAME = new QName("http://com/", "allLoansResponse");
    private final static QName _LoanReturn_QNAME = new QName("http://com/", "loanReturn");
    private final static QName _DeleteAuteur_QNAME = new QName("http://com/", "deleteAuteur");
    private final static QName _UpdateAuteurResponse_QNAME = new QName("http://com/", "updateAuteurResponse");
    private final static QName _AllLoans_QNAME = new QName("http://com/", "allLoans");
    private final static QName _GetAuteurResponse_QNAME = new QName("http://com/", "getAuteurResponse");
    private final static QName _CreateLoanResponse_QNAME = new QName("http://com/", "createLoanResponse");
    private final static QName _NotRenderedLoans_QNAME = new QName("http://com/", "notRenderedLoans");
    private final static QName _LoanReturnResponse_QNAME = new QName("http://com/", "loanReturnResponse");
    private final static QName _DeleteOuvrage_QNAME = new QName("http://com/", "deleteOuvrage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAuteurResponse }
     * 
     */
    public GetAuteurResponse createGetAuteurResponse() {
        return new GetAuteurResponse();
    }

    /**
     * Create an instance of {@link AllLoans }
     * 
     */
    public AllLoans createAllLoans() {
        return new AllLoans();
    }

    /**
     * Create an instance of {@link DeleteAuteur }
     * 
     */
    public DeleteAuteur createDeleteAuteur() {
        return new DeleteAuteur();
    }

    /**
     * Create an instance of {@link UpdateAuteurResponse }
     * 
     */
    public UpdateAuteurResponse createUpdateAuteurResponse() {
        return new UpdateAuteurResponse();
    }

    /**
     * Create an instance of {@link DeleteOuvrage }
     * 
     */
    public DeleteOuvrage createDeleteOuvrage() {
        return new DeleteOuvrage();
    }

    /**
     * Create an instance of {@link LoanReturnResponse }
     * 
     */
    public LoanReturnResponse createLoanReturnResponse() {
        return new LoanReturnResponse();
    }

    /**
     * Create an instance of {@link CreateLoanResponse }
     * 
     */
    public CreateLoanResponse createCreateLoanResponse() {
        return new CreateLoanResponse();
    }

    /**
     * Create an instance of {@link NotRenderedLoans }
     * 
     */
    public NotRenderedLoans createNotRenderedLoans() {
        return new NotRenderedLoans();
    }

    /**
     * Create an instance of {@link Identification }
     * 
     */
    public Identification createIdentification() {
        return new Identification();
    }

    /**
     * Create an instance of {@link CreateLoan }
     * 
     */
    public CreateLoan createCreateLoan() {
        return new CreateLoan();
    }

    /**
     * Create an instance of {@link CreateOuvrage }
     * 
     */
    public CreateOuvrage createCreateOuvrage() {
        return new CreateOuvrage();
    }

    /**
     * Create an instance of {@link AllLoansResponse }
     * 
     */
    public AllLoansResponse createAllLoansResponse() {
        return new AllLoansResponse();
    }

    /**
     * Create an instance of {@link LoanReturn }
     * 
     */
    public LoanReturn createLoanReturn() {
        return new LoanReturn();
    }

    /**
     * Create an instance of {@link GetOuvrage }
     * 
     */
    public GetOuvrage createGetOuvrage() {
        return new GetOuvrage();
    }

    /**
     * Create an instance of {@link IdentificationResponse }
     * 
     */
    public IdentificationResponse createIdentificationResponse() {
        return new IdentificationResponse();
    }

    /**
     * Create an instance of {@link GetLoanResponse }
     * 
     */
    public GetLoanResponse createGetLoanResponse() {
        return new GetLoanResponse();
    }

    /**
     * Create an instance of {@link DeleteAuteurResponse }
     * 
     */
    public DeleteAuteurResponse createDeleteAuteurResponse() {
        return new DeleteAuteurResponse();
    }

    /**
     * Create an instance of {@link GetOuvrageResponse }
     * 
     */
    public GetOuvrageResponse createGetOuvrageResponse() {
        return new GetOuvrageResponse();
    }

    /**
     * Create an instance of {@link GetLoan }
     * 
     */
    public GetLoan createGetLoan() {
        return new GetLoan();
    }

    /**
     * Create an instance of {@link AllOuvragesResponse }
     * 
     */
    public AllOuvragesResponse createAllOuvragesResponse() {
        return new AllOuvragesResponse();
    }

    /**
     * Create an instance of {@link UpdateAuteur }
     * 
     */
    public UpdateAuteur createUpdateAuteur() {
        return new UpdateAuteur();
    }

    /**
     * Create an instance of {@link CreateAuteurResponse }
     * 
     */
    public CreateAuteurResponse createCreateAuteurResponse() {
        return new CreateAuteurResponse();
    }

    /**
     * Create an instance of {@link AllAuteurs }
     * 
     */
    public AllAuteurs createAllAuteurs() {
        return new AllAuteurs();
    }

    /**
     * Create an instance of {@link NotRenderedLoansResponse }
     * 
     */
    public NotRenderedLoansResponse createNotRenderedLoansResponse() {
        return new NotRenderedLoansResponse();
    }

    /**
     * Create an instance of {@link DeleteOuvrageResponse }
     * 
     */
    public DeleteOuvrageResponse createDeleteOuvrageResponse() {
        return new DeleteOuvrageResponse();
    }

    /**
     * Create an instance of {@link CreateOuvrageResponse }
     * 
     */
    public CreateOuvrageResponse createCreateOuvrageResponse() {
        return new CreateOuvrageResponse();
    }

    /**
     * Create an instance of {@link AllAuteursResponse }
     * 
     */
    public AllAuteursResponse createAllAuteursResponse() {
        return new AllAuteursResponse();
    }

    /**
     * Create an instance of {@link GetAuteur }
     * 
     */
    public GetAuteur createGetAuteur() {
        return new GetAuteur();
    }

    /**
     * Create an instance of {@link AllOuvrages }
     * 
     */
    public AllOuvrages createAllOuvrages() {
        return new AllOuvrages();
    }

    /**
     * Create an instance of {@link CreateAuteur }
     * 
     */
    public CreateAuteur createCreateAuteur() {
        return new CreateAuteur();
    }

    /**
     * Create an instance of {@link AbstractResponse }
     * 
     */
    public AbstractResponse createAbstractResponse() {
        return new AbstractResponse();
    }

    /**
     * Create an instance of {@link OuvragePojo }
     * 
     */
    public OuvragePojo createOuvragePojo() {
        return new OuvragePojo();
    }

    /**
     * Create an instance of {@link UtilisateurPojo }
     * 
     */
    public UtilisateurPojo createUtilisateurPojo() {
        return new UtilisateurPojo();
    }

    /**
     * Create an instance of {@link PretResponse }
     * 
     */
    public PretResponse createPretResponse() {
        return new PretResponse();
    }

    /**
     * Create an instance of {@link AuteurResponse }
     * 
     */
    public AuteurResponse createAuteurResponse() {
        return new AuteurResponse();
    }

    /**
     * Create an instance of {@link AuteurPojo }
     * 
     */
    public AuteurPojo createAuteurPojo() {
        return new AuteurPojo();
    }

    /**
     * Create an instance of {@link UtilisateurResponse }
     * 
     */
    public UtilisateurResponse createUtilisateurResponse() {
        return new UtilisateurResponse();
    }

    /**
     * Create an instance of {@link OuvrageResponse }
     * 
     */
    public OuvrageResponse createOuvrageResponse() {
        return new OuvrageResponse();
    }

    /**
     * Create an instance of {@link PretPojo }
     * 
     */
    public PretPojo createPretPojo() {
        return new PretPojo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "createOuvrageResponse")
    public JAXBElement<CreateOuvrageResponse> createCreateOuvrageResponse(CreateOuvrageResponse value) {
        return new JAXBElement<CreateOuvrageResponse>(_CreateOuvrageResponse_QNAME, CreateOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "deleteOuvrageResponse")
    public JAXBElement<DeleteOuvrageResponse> createDeleteOuvrageResponse(DeleteOuvrageResponse value) {
        return new JAXBElement<DeleteOuvrageResponse>(_DeleteOuvrageResponse_QNAME, DeleteOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotRenderedLoansResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "notRenderedLoansResponse")
    public JAXBElement<NotRenderedLoansResponse> createNotRenderedLoansResponse(NotRenderedLoansResponse value) {
        return new JAXBElement<NotRenderedLoansResponse>(_NotRenderedLoansResponse_QNAME, NotRenderedLoansResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllAuteurs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "allAuteurs")
    public JAXBElement<AllAuteurs> createAllAuteurs(AllAuteurs value) {
        return new JAXBElement<AllAuteurs>(_AllAuteurs_QNAME, AllAuteurs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllOuvrages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "allOuvrages")
    public JAXBElement<AllOuvrages> createAllOuvrages(AllOuvrages value) {
        return new JAXBElement<AllOuvrages>(_AllOuvrages_QNAME, AllOuvrages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "createAuteur")
    public JAXBElement<CreateAuteur> createCreateAuteur(CreateAuteur value) {
        return new JAXBElement<CreateAuteur>(_CreateAuteur_QNAME, CreateAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getAuteur")
    public JAXBElement<GetAuteur> createGetAuteur(GetAuteur value) {
        return new JAXBElement<GetAuteur>(_GetAuteur_QNAME, GetAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllAuteursResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "allAuteursResponse")
    public JAXBElement<AllAuteursResponse> createAllAuteursResponse(AllAuteursResponse value) {
        return new JAXBElement<AllAuteursResponse>(_AllAuteursResponse_QNAME, AllAuteursResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllOuvragesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "allOuvragesResponse")
    public JAXBElement<AllOuvragesResponse> createAllOuvragesResponse(AllOuvragesResponse value) {
        return new JAXBElement<AllOuvragesResponse>(_AllOuvragesResponse_QNAME, AllOuvragesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "updateAuteur")
    public JAXBElement<UpdateAuteur> createUpdateAuteur(UpdateAuteur value) {
        return new JAXBElement<UpdateAuteur>(_UpdateAuteur_QNAME, UpdateAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getLoan")
    public JAXBElement<GetLoan> createGetLoan(GetLoan value) {
        return new JAXBElement<GetLoan>(_GetLoan_QNAME, GetLoan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getOuvrageResponse")
    public JAXBElement<GetOuvrageResponse> createGetOuvrageResponse(GetOuvrageResponse value) {
        return new JAXBElement<GetOuvrageResponse>(_GetOuvrageResponse_QNAME, GetOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "createAuteurResponse")
    public JAXBElement<CreateAuteurResponse> createCreateAuteurResponse(CreateAuteurResponse value) {
        return new JAXBElement<CreateAuteurResponse>(_CreateAuteurResponse_QNAME, CreateAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLoan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "createLoan")
    public JAXBElement<CreateLoan> createCreateLoan(CreateLoan value) {
        return new JAXBElement<CreateLoan>(_CreateLoan_QNAME, CreateLoan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "createOuvrage")
    public JAXBElement<CreateOuvrage> createCreateOuvrage(CreateOuvrage value) {
        return new JAXBElement<CreateOuvrage>(_CreateOuvrage_QNAME, CreateOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "identification")
    public JAXBElement<Identification> createIdentification(Identification value) {
        return new JAXBElement<Identification>(_Identification_QNAME, Identification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "deleteAuteurResponse")
    public JAXBElement<DeleteAuteurResponse> createDeleteAuteurResponse(DeleteAuteurResponse value) {
        return new JAXBElement<DeleteAuteurResponse>(_DeleteAuteurResponse_QNAME, DeleteAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getLoanResponse")
    public JAXBElement<GetLoanResponse> createGetLoanResponse(GetLoanResponse value) {
        return new JAXBElement<GetLoanResponse>(_GetLoanResponse_QNAME, GetLoanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getOuvrage")
    public JAXBElement<GetOuvrage> createGetOuvrage(GetOuvrage value) {
        return new JAXBElement<GetOuvrage>(_GetOuvrage_QNAME, GetOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "identificationResponse")
    public JAXBElement<IdentificationResponse> createIdentificationResponse(IdentificationResponse value) {
        return new JAXBElement<IdentificationResponse>(_IdentificationResponse_QNAME, IdentificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllLoansResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "allLoansResponse")
    public JAXBElement<AllLoansResponse> createAllLoansResponse(AllLoansResponse value) {
        return new JAXBElement<AllLoansResponse>(_AllLoansResponse_QNAME, AllLoansResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanReturn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "loanReturn")
    public JAXBElement<LoanReturn> createLoanReturn(LoanReturn value) {
        return new JAXBElement<LoanReturn>(_LoanReturn_QNAME, LoanReturn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "deleteAuteur")
    public JAXBElement<DeleteAuteur> createDeleteAuteur(DeleteAuteur value) {
        return new JAXBElement<DeleteAuteur>(_DeleteAuteur_QNAME, DeleteAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "updateAuteurResponse")
    public JAXBElement<UpdateAuteurResponse> createUpdateAuteurResponse(UpdateAuteurResponse value) {
        return new JAXBElement<UpdateAuteurResponse>(_UpdateAuteurResponse_QNAME, UpdateAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllLoans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "allLoans")
    public JAXBElement<AllLoans> createAllLoans(AllLoans value) {
        return new JAXBElement<AllLoans>(_AllLoans_QNAME, AllLoans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "getAuteurResponse")
    public JAXBElement<GetAuteurResponse> createGetAuteurResponse(GetAuteurResponse value) {
        return new JAXBElement<GetAuteurResponse>(_GetAuteurResponse_QNAME, GetAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "createLoanResponse")
    public JAXBElement<CreateLoanResponse> createCreateLoanResponse(CreateLoanResponse value) {
        return new JAXBElement<CreateLoanResponse>(_CreateLoanResponse_QNAME, CreateLoanResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotRenderedLoans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "notRenderedLoans")
    public JAXBElement<NotRenderedLoans> createNotRenderedLoans(NotRenderedLoans value) {
        return new JAXBElement<NotRenderedLoans>(_NotRenderedLoans_QNAME, NotRenderedLoans.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanReturnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "loanReturnResponse")
    public JAXBElement<LoanReturnResponse> createLoanReturnResponse(LoanReturnResponse value) {
        return new JAXBElement<LoanReturnResponse>(_LoanReturnResponse_QNAME, LoanReturnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com/", name = "deleteOuvrage")
    public JAXBElement<DeleteOuvrage> createDeleteOuvrage(DeleteOuvrage value) {
        return new JAXBElement<DeleteOuvrage>(_DeleteOuvrage_QNAME, DeleteOuvrage.class, null, value);
    }

}
