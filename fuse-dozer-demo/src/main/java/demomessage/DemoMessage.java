
package demomessage;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "item",
    "shipto",
    "@orderid",
    "@xmlns:xsi",
    "orderperson",
    "@xsi:noNamespaceSchemaLocation"
})
public class DemoMessage {

    @JsonProperty("item")
    private List<Item> item = new ArrayList<Item>();
    @JsonProperty("shipto")
    private Shipto shipto;
    @JsonProperty("@orderid")
    private String Orderid;
    @JsonProperty("@xmlns:xsi")
    private String XmlnsXsi;
    @JsonProperty("orderperson")
    private String orderperson;
    @JsonProperty("@xsi:noNamespaceSchemaLocation")
    private String XsiNoNamespaceSchemaLocation;

    /**
     * 
     * @return
     *     The item
     */
    @JsonProperty("item")
    public List<Item> getItem() {
        return item;
    }

    /**
     * 
     * @param item
     *     The item
     */
    @JsonProperty("item")
    public void setItem(List<Item> item) {
        this.item = item;
    }

    /**
     * 
     * @return
     *     The shipto
     */
    @JsonProperty("shipto")
    public Shipto getShipto() {
        return shipto;
    }

    /**
     * 
     * @param shipto
     *     The shipto
     */
    @JsonProperty("shipto")
    public void setShipto(Shipto shipto) {
        this.shipto = shipto;
    }

    /**
     * 
     * @return
     *     The Orderid
     */
    @JsonProperty("@orderid")
    public String getOrderid() {
        return Orderid;
    }

    /**
     * 
     * @param Orderid
     *     The @orderid
     */
    @JsonProperty("@orderid")
    public void setOrderid(String Orderid) {
        this.Orderid = Orderid;
    }

    /**
     * 
     * @return
     *     The XmlnsXsi
     */
    @JsonProperty("@xmlns:xsi")
    public String getXmlnsXsi() {
        return XmlnsXsi;
    }

    /**
     * 
     * @param XmlnsXsi
     *     The @xmlns:xsi
     */
    @JsonProperty("@xmlns:xsi")
    public void setXmlnsXsi(String XmlnsXsi) {
        this.XmlnsXsi = XmlnsXsi;
    }

    /**
     * 
     * @return
     *     The orderperson
     */
    @JsonProperty("orderperson")
    public String getOrderperson() {
        return orderperson;
    }

    /**
     * 
     * @param orderperson
     *     The orderperson
     */
    @JsonProperty("orderperson")
    public void setOrderperson(String orderperson) {
        this.orderperson = orderperson;
    }

    /**
     * 
     * @return
     *     The XsiNoNamespaceSchemaLocation
     */
    @JsonProperty("@xsi:noNamespaceSchemaLocation")
    public String getXsiNoNamespaceSchemaLocation() {
        return XsiNoNamespaceSchemaLocation;
    }

    /**
     * 
     * @param XsiNoNamespaceSchemaLocation
     *     The @xsi:noNamespaceSchemaLocation
     */
    @JsonProperty("@xsi:noNamespaceSchemaLocation")
    public void setXsiNoNamespaceSchemaLocation(String XsiNoNamespaceSchemaLocation) {
        this.XsiNoNamespaceSchemaLocation = XsiNoNamespaceSchemaLocation;
    }

}
