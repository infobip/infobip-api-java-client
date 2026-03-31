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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Conversions collection.
 */
public class WhatsAppMetaConversionModel {

    private String ctwaClickId;

    private WhatsAppMetaConversionType type;

    private WhatsAppConversionDetails details;

    private OffsetDateTime conversionTime;

    /**
     * Sets ctwaClickId.
     * <p>
     * Field description:
     * ctwaClickId is unique identifier of each click on the ad that clicks to WhatsApp. ctwaClickId is contained within the inbound message originating from the ad within the referral object. Check payload [here](https://www.infobip.com/docs/api/channels/whatsapp/whatsapp-inbound-messages/receive-whatsapp-inbound-messages).
     * <p>
     * The field is required.
     *
     * @param ctwaClickId
     * @return This {@link WhatsAppMetaConversionModel instance}.
     */
    public WhatsAppMetaConversionModel ctwaClickId(String ctwaClickId) {
        this.ctwaClickId = ctwaClickId;
        return this;
    }

    /**
     * Returns ctwaClickId.
     * <p>
     * Field description:
     * ctwaClickId is unique identifier of each click on the ad that clicks to WhatsApp. ctwaClickId is contained within the inbound message originating from the ad within the referral object. Check payload [here](https://www.infobip.com/docs/api/channels/whatsapp/whatsapp-inbound-messages/receive-whatsapp-inbound-messages).
     * <p>
     * The field is required.
     *
     * @return ctwaClickId
     */
    @JsonProperty("ctwaClickId")
    public String getCtwaClickId() {
        return ctwaClickId;
    }

    /**
     * Sets ctwaClickId.
     * <p>
     * Field description:
     * ctwaClickId is unique identifier of each click on the ad that clicks to WhatsApp. ctwaClickId is contained within the inbound message originating from the ad within the referral object. Check payload [here](https://www.infobip.com/docs/api/channels/whatsapp/whatsapp-inbound-messages/receive-whatsapp-inbound-messages).
     * <p>
     * The field is required.
     *
     * @param ctwaClickId
     */
    @JsonProperty("ctwaClickId")
    public void setCtwaClickId(String ctwaClickId) {
        this.ctwaClickId = ctwaClickId;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link WhatsAppMetaConversionModel instance}.
     */
    public WhatsAppMetaConversionModel type(WhatsAppMetaConversionType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public WhatsAppMetaConversionType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(WhatsAppMetaConversionType type) {
        this.type = type;
    }

    /**
     * Sets details.
     *
     * @param details
     * @return This {@link WhatsAppMetaConversionModel instance}.
     */
    public WhatsAppMetaConversionModel details(WhatsAppConversionDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Returns details.
     *
     * @return details
     */
    @JsonProperty("details")
    public WhatsAppConversionDetails getDetails() {
        return details;
    }

    /**
     * Sets details.
     *
     * @param details
     */
    @JsonProperty("details")
    public void setDetails(WhatsAppConversionDetails details) {
        this.details = details;
    }

    /**
     * Sets conversionTime.
     * <p>
     * Field description:
     * Time when the conversion happened. Must be in the format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. Date must not be older than 7 days. If omitted then current time of submission is used.
     *
     * @param conversionTime
     * @return This {@link WhatsAppMetaConversionModel instance}.
     */
    public WhatsAppMetaConversionModel conversionTime(OffsetDateTime conversionTime) {
        this.conversionTime = conversionTime;
        return this;
    }

    /**
     * Returns conversionTime.
     * <p>
     * Field description:
     * Time when the conversion happened. Must be in the format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. Date must not be older than 7 days. If omitted then current time of submission is used.
     *
     * @return conversionTime
     */
    @JsonProperty("conversionTime")
    public OffsetDateTime getConversionTime() {
        return conversionTime;
    }

    /**
     * Sets conversionTime.
     * <p>
     * Field description:
     * Time when the conversion happened. Must be in the format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. Date must not be older than 7 days. If omitted then current time of submission is used.
     *
     * @param conversionTime
     */
    @JsonProperty("conversionTime")
    public void setConversionTime(OffsetDateTime conversionTime) {
        this.conversionTime = conversionTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppMetaConversionModel whatsAppMetaConversionModel = (WhatsAppMetaConversionModel) o;
        return Objects.equals(this.ctwaClickId, whatsAppMetaConversionModel.ctwaClickId)
                && Objects.equals(this.type, whatsAppMetaConversionModel.type)
                && Objects.equals(this.details, whatsAppMetaConversionModel.details)
                && Objects.equals(this.conversionTime, whatsAppMetaConversionModel.conversionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ctwaClickId, type, details, conversionTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppMetaConversionModel {")
                .append(newLine)
                .append("    ctwaClickId: ")
                .append(toIndentedString(ctwaClickId))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    details: ")
                .append(toIndentedString(details))
                .append(newLine)
                .append("    conversionTime: ")
                .append(toIndentedString(conversionTime))
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
