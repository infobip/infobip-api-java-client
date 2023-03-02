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
 * Template structure.
 */
public class WhatsAppTemplateStructureApiData {

    private WhatsAppHeaderApiData header;

    private WhatsAppBodyApiData body;

    private WhatsAppFooterApiData footer;

    private List<WhatsAppButtonApiData> buttons = null;

    /**
     * Represents type enumeration.
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
     * @return This {@link WhatsAppTemplateStructureApiData instance}.
     */
    public WhatsAppTemplateStructureApiData header(WhatsAppHeaderApiData header) {
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
     * @return This {@link WhatsAppTemplateStructureApiData instance}.
     */
    public WhatsAppTemplateStructureApiData body(WhatsAppBodyApiData body) {
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
     * @return This {@link WhatsAppTemplateStructureApiData instance}.
     */
    public WhatsAppTemplateStructureApiData footer(WhatsAppFooterApiData footer) {
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
     * Template buttons. Can be either up to 3 &#x60;quick reply&#x60; buttons or up to 2 &#x60;call to action&#x60; buttons. Call to action buttons must be unique in type.
     *
     * @param buttons
     * @return This {@link WhatsAppTemplateStructureApiData instance}.
     */
    public WhatsAppTemplateStructureApiData buttons(List<WhatsAppButtonApiData> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * Template buttons. Can be either up to 3 &#x60;quick reply&#x60; buttons or up to 2 &#x60;call to action&#x60; buttons. Call to action buttons must be unique in type.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link WhatsAppTemplateStructureApiData instance}.
     */
    public WhatsAppTemplateStructureApiData addButtonsItem(WhatsAppButtonApiData buttonsItem) {
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
     * Template buttons. Can be either up to 3 &#x60;quick reply&#x60; buttons or up to 2 &#x60;call to action&#x60; buttons. Call to action buttons must be unique in type.
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
     * Template buttons. Can be either up to 3 &#x60;quick reply&#x60; buttons or up to 2 &#x60;call to action&#x60; buttons. Call to action buttons must be unique in type.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<WhatsAppButtonApiData> buttons) {
        this.buttons = buttons;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link WhatsAppTemplateStructureApiData instance}.
     */
    public WhatsAppTemplateStructureApiData type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets type.
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
        WhatsAppTemplateStructureApiData whatsAppTemplateStructureApiData = (WhatsAppTemplateStructureApiData) o;
        return Objects.equals(this.header, whatsAppTemplateStructureApiData.header)
                && Objects.equals(this.body, whatsAppTemplateStructureApiData.body)
                && Objects.equals(this.footer, whatsAppTemplateStructureApiData.footer)
                && Objects.equals(this.buttons, whatsAppTemplateStructureApiData.buttons)
                && Objects.equals(this.type, whatsAppTemplateStructureApiData.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, body, footer, buttons, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateStructureApiData {")
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
