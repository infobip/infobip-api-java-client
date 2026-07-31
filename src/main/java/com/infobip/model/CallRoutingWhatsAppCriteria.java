/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallRoutingWhatsAppCriteria model.
 */
public class CallRoutingWhatsAppCriteria extends CallRoutingCriteria {

    private String from;

    private List<CallRoutingCustomDataEntry> customData = null;

    /**
     * Constructs a new {@link CallRoutingWhatsAppCriteria} instance.
     */
    public CallRoutingWhatsAppCriteria() {
        super("WHATSAPP");
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Phone number or regular expression pattern representing the phone number. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
     *
     * @param from
     * @return This {@link CallRoutingWhatsAppCriteria instance}.
     */
    public CallRoutingWhatsAppCriteria from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Phone number or regular expression pattern representing the phone number. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Phone number or regular expression pattern representing the phone number. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * WhatsApp custom data. To meet the criteria, all of the provided custom data pairs must match.
     *
     * @param customData
     * @return This {@link CallRoutingWhatsAppCriteria instance}.
     */
    public CallRoutingWhatsAppCriteria customData(List<CallRoutingCustomDataEntry> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Adds and item into customData.
     * <p>
     * Field description:
     * WhatsApp custom data. To meet the criteria, all of the provided custom data pairs must match.
     *
     * @param customDataItem The item to be added to the list.
     * @return This {@link CallRoutingWhatsAppCriteria instance}.
     */
    public CallRoutingWhatsAppCriteria addCustomDataItem(CallRoutingCustomDataEntry customDataItem) {
        if (this.customData == null) {
            this.customData = new ArrayList<>();
        }
        this.customData.add(customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * WhatsApp custom data. To meet the criteria, all of the provided custom data pairs must match.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public List<CallRoutingCustomDataEntry> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * WhatsApp custom data. To meet the criteria, all of the provided custom data pairs must match.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(List<CallRoutingCustomDataEntry> customData) {
        this.customData = customData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingWhatsAppCriteria callRoutingWhatsAppCriteria = (CallRoutingWhatsAppCriteria) o;
        return Objects.equals(this.from, callRoutingWhatsAppCriteria.from)
                && Objects.equals(this.customData, callRoutingWhatsAppCriteria.customData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, customData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingWhatsAppCriteria {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
