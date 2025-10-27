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
 * Template data. Values have to be set as registered in the template.
 */
public class WhatsAppTemplateDataContent {

    private WhatsAppTemplateBodyContent body;

    private WhatsAppTemplateHeaderContent header;

    private List<WhatsAppTemplateButtonContent> buttons = null;

    private WhatsAppTemplateCarouselContent carousel;

    private WhatsAppTemplateLimitedTimeOfferContent limitedTimeOffer;

    private WhatsAppTemplateOrderStatusContent orderStatus;

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link WhatsAppTemplateDataContent instance}.
     */
    public WhatsAppTemplateDataContent body(WhatsAppTemplateBodyContent body) {
        this.body = body;
        return this;
    }

    /**
     * Returns body.
     * <p>
     * The field is required.
     *
     * @return body
     */
    @JsonProperty("body")
    public WhatsAppTemplateBodyContent getBody() {
        return body;
    }

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(WhatsAppTemplateBodyContent body) {
        this.body = body;
    }

    /**
     * Sets header.
     *
     * @param header
     * @return This {@link WhatsAppTemplateDataContent instance}.
     */
    public WhatsAppTemplateDataContent header(WhatsAppTemplateHeaderContent header) {
        this.header = header;
        return this;
    }

    /**
     * Returns header.
     *
     * @return header
     */
    @JsonProperty("header")
    public WhatsAppTemplateHeaderContent getHeader() {
        return header;
    }

    /**
     * Sets header.
     *
     * @param header
     */
    @JsonProperty("header")
    public void setHeader(WhatsAppTemplateHeaderContent header) {
        this.header = header;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Template buttons. Should be defined in the correct order, only if &#x60;quick reply&#x60;, &#x60;dynamic URL&#x60;, &#x60;copy code&#x60; or &#x60;flow&#x60;  buttons have been registered. It can have up to ten buttons including a maximum of two &#x60;dynamic URL&#x60; buttons, one &#x60;copy code&#x60; button and one &#x60;flow&#x60; button. When &#x60;catalog&#x60;, &#x60;multi product&#x60; or &#x60;order details&#x60; button is used it needs to be the only button.
     *
     * @param buttons
     * @return This {@link WhatsAppTemplateDataContent instance}.
     */
    public WhatsAppTemplateDataContent buttons(List<WhatsAppTemplateButtonContent> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * Template buttons. Should be defined in the correct order, only if &#x60;quick reply&#x60;, &#x60;dynamic URL&#x60;, &#x60;copy code&#x60; or &#x60;flow&#x60;  buttons have been registered. It can have up to ten buttons including a maximum of two &#x60;dynamic URL&#x60; buttons, one &#x60;copy code&#x60; button and one &#x60;flow&#x60; button. When &#x60;catalog&#x60;, &#x60;multi product&#x60; or &#x60;order details&#x60; button is used it needs to be the only button.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link WhatsAppTemplateDataContent instance}.
     */
    public WhatsAppTemplateDataContent addButtonsItem(WhatsAppTemplateButtonContent buttonsItem) {
        if (this.buttons == null) {
            this.buttons = new ArrayList<>();
        }
        this.buttons.add(buttonsItem);
        return this;
    }

    /**
     * Returns buttons.
     * <p>
     * Field description:
     * Template buttons. Should be defined in the correct order, only if &#x60;quick reply&#x60;, &#x60;dynamic URL&#x60;, &#x60;copy code&#x60; or &#x60;flow&#x60;  buttons have been registered. It can have up to ten buttons including a maximum of two &#x60;dynamic URL&#x60; buttons, one &#x60;copy code&#x60; button and one &#x60;flow&#x60; button. When &#x60;catalog&#x60;, &#x60;multi product&#x60; or &#x60;order details&#x60; button is used it needs to be the only button.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<WhatsAppTemplateButtonContent> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Template buttons. Should be defined in the correct order, only if &#x60;quick reply&#x60;, &#x60;dynamic URL&#x60;, &#x60;copy code&#x60; or &#x60;flow&#x60;  buttons have been registered. It can have up to ten buttons including a maximum of two &#x60;dynamic URL&#x60; buttons, one &#x60;copy code&#x60; button and one &#x60;flow&#x60; button. When &#x60;catalog&#x60;, &#x60;multi product&#x60; or &#x60;order details&#x60; button is used it needs to be the only button.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<WhatsAppTemplateButtonContent> buttons) {
        this.buttons = buttons;
    }

    /**
     * Sets carousel.
     *
     * @param carousel
     * @return This {@link WhatsAppTemplateDataContent instance}.
     */
    public WhatsAppTemplateDataContent carousel(WhatsAppTemplateCarouselContent carousel) {
        this.carousel = carousel;
        return this;
    }

    /**
     * Returns carousel.
     *
     * @return carousel
     */
    @JsonProperty("carousel")
    public WhatsAppTemplateCarouselContent getCarousel() {
        return carousel;
    }

    /**
     * Sets carousel.
     *
     * @param carousel
     */
    @JsonProperty("carousel")
    public void setCarousel(WhatsAppTemplateCarouselContent carousel) {
        this.carousel = carousel;
    }

    /**
     * Sets limitedTimeOffer.
     *
     * @param limitedTimeOffer
     * @return This {@link WhatsAppTemplateDataContent instance}.
     */
    public WhatsAppTemplateDataContent limitedTimeOffer(WhatsAppTemplateLimitedTimeOfferContent limitedTimeOffer) {
        this.limitedTimeOffer = limitedTimeOffer;
        return this;
    }

    /**
     * Returns limitedTimeOffer.
     *
     * @return limitedTimeOffer
     */
    @JsonProperty("limitedTimeOffer")
    public WhatsAppTemplateLimitedTimeOfferContent getLimitedTimeOffer() {
        return limitedTimeOffer;
    }

    /**
     * Sets limitedTimeOffer.
     *
     * @param limitedTimeOffer
     */
    @JsonProperty("limitedTimeOffer")
    public void setLimitedTimeOffer(WhatsAppTemplateLimitedTimeOfferContent limitedTimeOffer) {
        this.limitedTimeOffer = limitedTimeOffer;
    }

    /**
     * Sets orderStatus.
     *
     * @param orderStatus
     * @return This {@link WhatsAppTemplateDataContent instance}.
     */
    public WhatsAppTemplateDataContent orderStatus(WhatsAppTemplateOrderStatusContent orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * Returns orderStatus.
     *
     * @return orderStatus
     */
    @JsonProperty("orderStatus")
    public WhatsAppTemplateOrderStatusContent getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets orderStatus.
     *
     * @param orderStatus
     */
    @JsonProperty("orderStatus")
    public void setOrderStatus(WhatsAppTemplateOrderStatusContent orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = (WhatsAppTemplateDataContent) o;
        return Objects.equals(this.body, whatsAppTemplateDataContent.body)
                && Objects.equals(this.header, whatsAppTemplateDataContent.header)
                && Objects.equals(this.buttons, whatsAppTemplateDataContent.buttons)
                && Objects.equals(this.carousel, whatsAppTemplateDataContent.carousel)
                && Objects.equals(this.limitedTimeOffer, whatsAppTemplateDataContent.limitedTimeOffer)
                && Objects.equals(this.orderStatus, whatsAppTemplateDataContent.orderStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, header, buttons, carousel, limitedTimeOffer, orderStatus);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateDataContent {")
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    header: ")
                .append(toIndentedString(header))
                .append(newLine)
                .append("    buttons: ")
                .append(toIndentedString(buttons))
                .append(newLine)
                .append("    carousel: ")
                .append(toIndentedString(carousel))
                .append(newLine)
                .append("    limitedTimeOffer: ")
                .append(toIndentedString(limitedTimeOffer))
                .append(newLine)
                .append("    orderStatus: ")
                .append(toIndentedString(orderStatus))
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
