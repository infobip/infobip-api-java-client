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
 * Structure of the created authentication template. Must consist of body, footer and button.
 */
public class WhatsAppAuthenticationTemplateStructureApiData {

    private WhatsAppAuthenticationBodyApiData body;

    private WhatsAppAuthenticationFooterApiData footer;

    private List<WhatsAppAuthenticationButtonApiData> buttons = new ArrayList<>();

    /**
     * Sets body.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link WhatsAppAuthenticationTemplateStructureApiData instance}.
     */
    public WhatsAppAuthenticationTemplateStructureApiData body(WhatsAppAuthenticationBodyApiData body) {
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
    public WhatsAppAuthenticationBodyApiData getBody() {
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
    public void setBody(WhatsAppAuthenticationBodyApiData body) {
        this.body = body;
    }

    /**
     * Sets footer.
     * <p>
     * The field is required.
     *
     * @param footer
     * @return This {@link WhatsAppAuthenticationTemplateStructureApiData instance}.
     */
    public WhatsAppAuthenticationTemplateStructureApiData footer(WhatsAppAuthenticationFooterApiData footer) {
        this.footer = footer;
        return this;
    }

    /**
     * Returns footer.
     * <p>
     * The field is required.
     *
     * @return footer
     */
    @JsonProperty("footer")
    public WhatsAppAuthenticationFooterApiData getFooter() {
        return footer;
    }

    /**
     * Sets footer.
     * <p>
     * The field is required.
     *
     * @param footer
     */
    @JsonProperty("footer")
    public void setFooter(WhatsAppAuthenticationFooterApiData footer) {
        this.footer = footer;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Authentication template buttons. Has to be either a &#39;copy code&#39;  button or &#39;one-tap&#39; button.
     * <p>
     * The field is required.
     *
     * @param buttons
     * @return This {@link WhatsAppAuthenticationTemplateStructureApiData instance}.
     */
    public WhatsAppAuthenticationTemplateStructureApiData buttons(List<WhatsAppAuthenticationButtonApiData> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Adds and item into buttons.
     * <p>
     * Field description:
     * Authentication template buttons. Has to be either a &#39;copy code&#39;  button or &#39;one-tap&#39; button.
     * <p>
     * The field is required.
     *
     * @param buttonsItem The item to be added to the list.
     * @return This {@link WhatsAppAuthenticationTemplateStructureApiData instance}.
     */
    public WhatsAppAuthenticationTemplateStructureApiData addButtonsItem(
            WhatsAppAuthenticationButtonApiData buttonsItem) {
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
     * Authentication template buttons. Has to be either a &#39;copy code&#39;  button or &#39;one-tap&#39; button.
     * <p>
     * The field is required.
     *
     * @return buttons
     */
    @JsonProperty("buttons")
    public List<WhatsAppAuthenticationButtonApiData> getButtons() {
        return buttons;
    }

    /**
     * Sets buttons.
     * <p>
     * Field description:
     * Authentication template buttons. Has to be either a &#39;copy code&#39;  button or &#39;one-tap&#39; button.
     * <p>
     * The field is required.
     *
     * @param buttons
     */
    @JsonProperty("buttons")
    public void setButtons(List<WhatsAppAuthenticationButtonApiData> buttons) {
        this.buttons = buttons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppAuthenticationTemplateStructureApiData whatsAppAuthenticationTemplateStructureApiData =
                (WhatsAppAuthenticationTemplateStructureApiData) o;
        return Objects.equals(this.body, whatsAppAuthenticationTemplateStructureApiData.body)
                && Objects.equals(this.footer, whatsAppAuthenticationTemplateStructureApiData.footer)
                && Objects.equals(this.buttons, whatsAppAuthenticationTemplateStructureApiData.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, footer, buttons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppAuthenticationTemplateStructureApiData {")
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
