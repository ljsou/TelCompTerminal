
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orchestrateService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orchestrateService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JSONgraph" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reconfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orchestrateService", propOrder = {
    "jsoNgraph",
    "serviceName",
    "reconfiguration"
})
public class OrchestrateService {

    @XmlElement(name = "JSONgraph")
    protected String jsoNgraph;
    @XmlElement(name = "ServiceName")
    protected String serviceName;
    protected boolean reconfiguration;

    /**
     * Gets the value of the jsoNgraph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJSONgraph() {
        return jsoNgraph;
    }

    /**
     * Sets the value of the jsoNgraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJSONgraph(String value) {
        this.jsoNgraph = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the reconfiguration property.
     * 
     */
    public boolean isReconfiguration() {
        return reconfiguration;
    }

    /**
     * Sets the value of the reconfiguration property.
     * 
     */
    public void setReconfiguration(boolean value) {
        this.reconfiguration = value;
    }

}
