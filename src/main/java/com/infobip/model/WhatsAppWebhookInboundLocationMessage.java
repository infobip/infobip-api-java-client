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
import java.util.Objects;

/**
 * Represents WhatsAppWebhookInboundLocationMessage model.
 */
public class WhatsAppWebhookInboundLocationMessage extends WhatsAppWebhookInboundMessage {

    private Double latitude;

    private Double longitude;

    private String address;

    private String name;

    private String url;

    private WhatsAppContext context;

    private WhatsAppWebhookReferral referral;

    /**
     * Constructs a new {@link WhatsAppWebhookInboundLocationMessage} instance.
     */
    public WhatsAppWebhookInboundLocationMessage() {
        super("LOCATION");
    }

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude. The value must be between -180 and 180.
     * <p>
     * The field is required.
     *
     * @param latitude
     * @return This {@link WhatsAppWebhookInboundLocationMessage instance}.
     */
    public WhatsAppWebhookInboundLocationMessage latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Returns latitude.
     * <p>
     * Field description:
     * Latitude. The value must be between -180 and 180.
     * <p>
     * The field is required.
     *
     * @return latitude
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     * <p>
     * Field description:
     * Latitude. The value must be between -180 and 180.
     * <p>
     * The field is required.
     *
     * @param latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Sets longitude.
     * <p>
     * Field description:
     * Longitude. The value must be between -90 and 90.
     * <p>
     * The field is required.
     *
     * @param longitude
     * @return This {@link WhatsAppWebhookInboundLocationMessage instance}.
     */
    public WhatsAppWebhookInboundLocationMessage longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Returns longitude.
     * <p>
     * Field description:
     * Longitude. The value must be between -90 and 90.
     * <p>
     * The field is required.
     *
     * @return longitude
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude.
     * <p>
     * Field description:
     * Longitude. The value must be between -90 and 90.
     * <p>
     * The field is required.
     *
     * @param longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Sets address.
     * <p>
     * Field description:
     * Location address.
     *
     * @param address
     * @return This {@link WhatsAppWebhookInboundLocationMessage instance}.
     */
    public WhatsAppWebhookInboundLocationMessage address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     * <p>
     * Field description:
     * Location address.
     *
     * @return address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     * <p>
     * Field description:
     * Location address.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Location name.
     *
     * @param name
     * @return This {@link WhatsAppWebhookInboundLocationMessage instance}.
     */
    public WhatsAppWebhookInboundLocationMessage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Location name.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Location name.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * Location URL.
     *
     * @param url
     * @return This {@link WhatsAppWebhookInboundLocationMessage instance}.
     */
    public WhatsAppWebhookInboundLocationMessage url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Location URL.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * Location URL.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets context.
     *
     * @param context
     * @return This {@link WhatsAppWebhookInboundLocationMessage instance}.
     */
    public WhatsAppWebhookInboundLocationMessage context(WhatsAppContext context) {
        this.context = context;
        return this;
    }

    /**
     * Returns context.
     *
     * @return context
     */
    @JsonProperty("context")
    public WhatsAppContext getContext() {
        return context;
    }

    /**
     * Sets context.
     *
     * @param context
     */
    @JsonProperty("context")
    public void setContext(WhatsAppContext context) {
        this.context = context;
    }

    /**
     * Sets referral.
     *
     * @param referral
     * @return This {@link WhatsAppWebhookInboundLocationMessage instance}.
     */
    public WhatsAppWebhookInboundLocationMessage referral(WhatsAppWebhookReferral referral) {
        this.referral = referral;
        return this;
    }

    /**
     * Returns referral.
     *
     * @return referral
     */
    @JsonProperty("referral")
    public WhatsAppWebhookReferral getReferral() {
        return referral;
    }

    /**
     * Sets referral.
     *
     * @param referral
     */
    @JsonProperty("referral")
    public void setReferral(WhatsAppWebhookReferral referral) {
        this.referral = referral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookInboundLocationMessage whatsAppWebhookInboundLocationMessage =
                (WhatsAppWebhookInboundLocationMessage) o;
        return Objects.equals(this.latitude, whatsAppWebhookInboundLocationMessage.latitude)
                && Objects.equals(this.longitude, whatsAppWebhookInboundLocationMessage.longitude)
                && Objects.equals(this.address, whatsAppWebhookInboundLocationMessage.address)
                && Objects.equals(this.name, whatsAppWebhookInboundLocationMessage.name)
                && Objects.equals(this.url, whatsAppWebhookInboundLocationMessage.url)
                && Objects.equals(this.context, whatsAppWebhookInboundLocationMessage.context)
                && Objects.equals(this.referral, whatsAppWebhookInboundLocationMessage.referral)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, address, name, url, context, referral, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookInboundLocationMessage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    latitude: ")
                .append(toIndentedString(latitude))
                .append(newLine)
                .append("    longitude: ")
                .append(toIndentedString(longitude))
                .append(newLine)
                .append("    address: ")
                .append(toIndentedString(address))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    context: ")
                .append(toIndentedString(context))
                .append(newLine)
                .append("    referral: ")
                .append(toIndentedString(referral))
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
