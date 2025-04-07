/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Structure of the created template. Can consist of body (mandatory), header, footer, buttons, carousel, limited time offer and shortening options.
 */
public class WhatsAppDefaultTemplateStructureApiData {

    private WhatsAppHeaderApiData header;

    private WhatsAppBodyApiData body;

    private WhatsAppFooterApiData footer;

    private List<WhatsAppButtonApiData> buttons = null;

    private WhatsAppCarouselApiData carousel;

    private WhatsAppLimitedTimeOfferApiData limitedTimeOffer;

    private WhatsAppShorteningOptionsApiData shorteningOptions;

    /**
     * Template structure type.
     */
    public enum TypeEnum {
        TEXT("TEXT"),
        MEDIA("MEDIA"),
        UNSUPPORTED("UNSUPPORTED");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum enumElement : TypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private TypeEnum type;

    /**
     * Sets header.
     *
     * @param header
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData header(WhatsAppHeaderApiData header) {
        this.header = header;
        return this;
    }

    /**
     * Returns header.
     *
     * @return header
     */
    @JsonProperty("header")
    public WhatsAppHeaderApiData getHeader() {
        return header;
    }

    /**
     * Sets header.
     *
     * @param header
     */
    @JsonProperty("header")
    public void setHeader(WhatsAppHeaderApiData header) {
        this.header = header;
    }

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData body(WhatsAppBodyApiData body) {
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
    public WhatsAppBodyApiData getBody() {
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
    public void setBody(WhatsAppBodyApiData body) {
        this.body = body;
    }

    /**
     * Sets footer.
     *
     * @param footer
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData footer(WhatsAppFooterApiData footer) {
        this.footer = footer;
        return this;
    }

    /**
     * Returns footer.
     *
     * @return footer
     */
    @JsonProperty("footer")
    public WhatsAppFooterApiData getFooter() {
        return footer;
    }

    /**
     * Sets footer.
     *
     * @param footer
     */
    @JsonProperty("footer")
    public void setFooter(WhatsAppFooterApiData footer) {
        this.footer = footer;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Template buttons. Can contain 1 to 10 buttons which include up to 2 URL buttons, a phone number button and &#x60;copy code&#x60; button. &#x60;quick reply&#x60; and non &#x60;quick reply&#x60; buttons have to be grouped together.
     *
     * @param buttons
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData buttons(List<WhatsAppButtonApiData> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * Template buttons. Can contain 1 to 10 buttons which include up to 2 URL buttons, a phone number button and &#x60;copy code&#x60; button. &#x60;quick reply&#x60; and non &#x60;quick reply&#x60; buttons have to be grouped together.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData addButtonsItem(WhatsAppButtonApiData buttonsItem) {
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
     * Template buttons. Can contain 1 to 10 buttons which include up to 2 URL buttons, a phone number button and &#x60;copy code&#x60; button. &#x60;quick reply&#x60; and non &#x60;quick reply&#x60; buttons have to be grouped together.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<WhatsAppButtonApiData> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Template buttons. Can contain 1 to 10 buttons which include up to 2 URL buttons, a phone number button and &#x60;copy code&#x60; button. &#x60;quick reply&#x60; and non &#x60;quick reply&#x60; buttons have to be grouped together.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<WhatsAppButtonApiData> buttons) {
        this.buttons = buttons;
    }

    /**
     * Sets carousel.
     *
     * @param carousel
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData carousel(WhatsAppCarouselApiData carousel) {
        this.carousel = carousel;
        return this;
    }

    /**
     * Returns carousel.
     *
     * @return carousel
     */
    @JsonProperty("carousel")
    public WhatsAppCarouselApiData getCarousel() {
        return carousel;
    }

    /**
     * Sets carousel.
     *
     * @param carousel
     */
    @JsonProperty("carousel")
    public void setCarousel(WhatsAppCarouselApiData carousel) {
        this.carousel = carousel;
    }

    /**
     * Sets limitedTimeOffer.
     *
     * @param limitedTimeOffer
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData limitedTimeOffer(WhatsAppLimitedTimeOfferApiData limitedTimeOffer) {
        this.limitedTimeOffer = limitedTimeOffer;
        return this;
    }

    /**
     * Returns limitedTimeOffer.
     *
     * @return limitedTimeOffer
     */
    @JsonProperty("limitedTimeOffer")
    public WhatsAppLimitedTimeOfferApiData getLimitedTimeOffer() {
        return limitedTimeOffer;
    }

    /**
     * Sets limitedTimeOffer.
     *
     * @param limitedTimeOffer
     */
    @JsonProperty("limitedTimeOffer")
    public void setLimitedTimeOffer(WhatsAppLimitedTimeOfferApiData limitedTimeOffer) {
        this.limitedTimeOffer = limitedTimeOffer;
    }

    /**
     * Sets shorteningOptions.
     *
     * @param shorteningOptions
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData shorteningOptions(
            WhatsAppShorteningOptionsApiData shorteningOptions) {
        this.shorteningOptions = shorteningOptions;
        return this;
    }

    /**
     * Returns shorteningOptions.
     *
     * @return shorteningOptions
     */
    @JsonProperty("shorteningOptions")
    public WhatsAppShorteningOptionsApiData getShorteningOptions() {
        return shorteningOptions;
    }

    /**
     * Sets shorteningOptions.
     *
     * @param shorteningOptions
     */
    @JsonProperty("shorteningOptions")
    public void setShorteningOptions(WhatsAppShorteningOptionsApiData shorteningOptions) {
        this.shorteningOptions = shorteningOptions;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Template structure type.
     *
     * @param type
     * @return This {@link WhatsAppDefaultTemplateStructureApiData instance}.
     */
    public WhatsAppDefaultTemplateStructureApiData type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Template structure type.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Template structure type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                (WhatsAppDefaultTemplateStructureApiData) o;
        return Objects.equals(this.header, whatsAppDefaultTemplateStructureApiData.header)
                && Objects.equals(this.body, whatsAppDefaultTemplateStructureApiData.body)
                && Objects.equals(this.footer, whatsAppDefaultTemplateStructureApiData.footer)
                && Objects.equals(this.buttons, whatsAppDefaultTemplateStructureApiData.buttons)
                && Objects.equals(this.carousel, whatsAppDefaultTemplateStructureApiData.carousel)
                && Objects.equals(this.limitedTimeOffer, whatsAppDefaultTemplateStructureApiData.limitedTimeOffer)
                && Objects.equals(this.shorteningOptions, whatsAppDefaultTemplateStructureApiData.shorteningOptions)
                && Objects.equals(this.type, whatsAppDefaultTemplateStructureApiData.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, footer, buttons, carousel, limitedTimeOffer, shorteningOptions, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppDefaultTemplateStructureApiData {")
                .append(newLine)
                .append("    header: ")
                .append(toIndentedString(header))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    footer: ")
                .append(toIndentedString(footer))
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
                .append("    shorteningOptions: ")
                .append(toIndentedString(shorteningOptions))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
