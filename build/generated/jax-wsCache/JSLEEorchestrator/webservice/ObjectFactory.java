
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _OrchestrateServiceResponse_QNAME = new QName("http://webservice/", "orchestrateServiceResponse");
    private final static QName _GetDeployedServicesResponse_QNAME = new QName("http://webservice/", "getDeployedServicesResponse");
    private final static QName _DeleteService_QNAME = new QName("http://webservice/", "deleteService");
    private final static QName _GetDeployedServices_QNAME = new QName("http://webservice/", "getDeployedServices");
    private final static QName _OrchestrateService_QNAME = new QName("http://webservice/", "orchestrateService");
    private final static QName _TestBD_QNAME = new QName("http://webservice/", "testBD");
    private final static QName _DeleteServiceResponse_QNAME = new QName("http://webservice/", "deleteServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDeployedServicesResponse }
     * 
     */
    public GetDeployedServicesResponse createGetDeployedServicesResponse() {
        return new GetDeployedServicesResponse();
    }

    /**
     * Create an instance of {@link OrchestrateServiceResponse }
     * 
     */
    public OrchestrateServiceResponse createOrchestrateServiceResponse() {
        return new OrchestrateServiceResponse();
    }

    /**
     * Create an instance of {@link DeleteServiceResponse }
     * 
     */
    public DeleteServiceResponse createDeleteServiceResponse() {
        return new DeleteServiceResponse();
    }

    /**
     * Create an instance of {@link DeleteService }
     * 
     */
    public DeleteService createDeleteService() {
        return new DeleteService();
    }

    /**
     * Create an instance of {@link TestBD }
     * 
     */
    public TestBD createTestBD() {
        return new TestBD();
    }

    /**
     * Create an instance of {@link OrchestrateService }
     * 
     */
    public OrchestrateService createOrchestrateService() {
        return new OrchestrateService();
    }

    /**
     * Create an instance of {@link GetDeployedServices }
     * 
     */
    public GetDeployedServices createGetDeployedServices() {
        return new GetDeployedServices();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrchestrateServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "orchestrateServiceResponse")
    public JAXBElement<OrchestrateServiceResponse> createOrchestrateServiceResponse(OrchestrateServiceResponse value) {
        return new JAXBElement<OrchestrateServiceResponse>(_OrchestrateServiceResponse_QNAME, OrchestrateServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeployedServicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getDeployedServicesResponse")
    public JAXBElement<GetDeployedServicesResponse> createGetDeployedServicesResponse(GetDeployedServicesResponse value) {
        return new JAXBElement<GetDeployedServicesResponse>(_GetDeployedServicesResponse_QNAME, GetDeployedServicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "deleteService")
    public JAXBElement<DeleteService> createDeleteService(DeleteService value) {
        return new JAXBElement<DeleteService>(_DeleteService_QNAME, DeleteService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDeployedServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getDeployedServices")
    public JAXBElement<GetDeployedServices> createGetDeployedServices(GetDeployedServices value) {
        return new JAXBElement<GetDeployedServices>(_GetDeployedServices_QNAME, GetDeployedServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrchestrateService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "orchestrateService")
    public JAXBElement<OrchestrateService> createOrchestrateService(OrchestrateService value) {
        return new JAXBElement<OrchestrateService>(_OrchestrateService_QNAME, OrchestrateService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestBD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "testBD")
    public JAXBElement<TestBD> createTestBD(TestBD value) {
        return new JAXBElement<TestBD>(_TestBD_QNAME, TestBD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "deleteServiceResponse")
    public JAXBElement<DeleteServiceResponse> createDeleteServiceResponse(DeleteServiceResponse value) {
        return new JAXBElement<DeleteServiceResponse>(_DeleteServiceResponse_QNAME, DeleteServiceResponse.class, null, value);
    }

}
