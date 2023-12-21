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
 * Represents WhatsAppOneTapButtonApiData model.
 */
public class WhatsAppOneTapButtonApiData extends WhatsAppAuthenticationButtonApiData {

    private String text;

    private String autofillText;

    private String packageName;

    private String signatureHash;

    /**
     * Constructs a new {@link WhatsAppOneTapButtonApiData} instance.
     */
    public WhatsAppOneTapButtonApiData() {
        super("ONE_TAP");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * When unable to validate a handshake the authentication template message will display a copy code button with this text instead. WhatsApp will use default value if not provided.
     *
     * @param text
     * @return This {@link WhatsAppOneTapButtonApiData instance}.
     */
    public WhatsAppOneTapButtonApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * When unable to validate a handshake the authentication template message will display a copy code button with this text instead. WhatsApp will use default value if not provided.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * When unable to validate a handshake the authentication template message will display a copy code button with this text instead. WhatsApp will use default value if not provided.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets autofillText.
     * <p>
     * Field description:
     * One-tap button text. WhatsApp will use default value if not provided.
     *
     * @param autofillText
     * @return This {@link WhatsAppOneTapButtonApiData instance}.
     */
    public WhatsAppOneTapButtonApiData autofillText(String autofillText) {
        this.autofillText = autofillText;
        return this;
    }

    /**
     * Returns autofillText.
     * <p>
     * Field description:
     * One-tap button text. WhatsApp will use default value if not provided.
     *
     * @return autofillText
     */
    @JsonProperty("autofillText")
    public String getAutofillText() {
        return autofillText;
    }

    /**
     * Sets autofillText.
     * <p>
     * Field description:
     * One-tap button text. WhatsApp will use default value if not provided.
     *
     * @param autofillText
     */
    @JsonProperty("autofillText")
    public void setAutofillText(String autofillText) {
        this.autofillText = autofillText;
    }

    /**
     * Sets packageName.
     * <p>
     * Field description:
     * Android app&#39;s package name.
     * <p>
     * The field is required.
     *
     * @param packageName
     * @return This {@link WhatsAppOneTapButtonApiData instance}.
     */
    public WhatsAppOneTapButtonApiData packageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Returns packageName.
     * <p>
     * Field description:
     * Android app&#39;s package name.
     * <p>
     * The field is required.
     *
     * @return packageName
     */
    @JsonProperty("packageName")
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets packageName.
     * <p>
     * Field description:
     * Android app&#39;s package name.
     * <p>
     * The field is required.
     *
     * @param packageName
     */
    @JsonProperty("packageName")
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * Sets signatureHash.
     * <p>
     * Field description:
     * App signing key hash.
     * <p>
     * The field is required.
     *
     * @param signatureHash
     * @return This {@link WhatsAppOneTapButtonApiData instance}.
     */
    public WhatsAppOneTapButtonApiData signatureHash(String signatureHash) {
        this.signatureHash = signatureHash;
        return this;
    }

    /**
     * Returns signatureHash.
     * <p>
     * Field description:
     * App signing key hash.
     * <p>
     * The field is required.
     *
     * @return signatureHash
     */
    @JsonProperty("signatureHash")
    public String getSignatureHash() {
        return signatureHash;
    }

    /**
     * Sets signatureHash.
     * <p>
     * Field description:
     * App signing key hash.
     * <p>
     * The field is required.
     *
     * @param signatureHash
     */
    @JsonProperty("signatureHash")
    public void setSignatureHash(String signatureHash) {
        this.signatureHash = signatureHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppOneTapButtonApiData whatsAppOneTapButtonApiData = (WhatsAppOneTapButtonApiData) o;
        return Objects.equals(this.text, whatsAppOneTapButtonApiData.text)
                && Objects.equals(this.autofillText, whatsAppOneTapButtonApiData.autofillText)
                && Objects.equals(this.packageName, whatsAppOneTapButtonApiData.packageName)
                && Objects.equals(this.signatureHash, whatsAppOneTapButtonApiData.signatureHash)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, autofillText, packageName, signatureHash, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppOneTapButtonApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    autofillText: ")
                .append(toIndentedString(autofillText))
                .append(newLine)
                .append("    packageName: ")
                .append(toIndentedString(packageName))
                .append(newLine)
                .append("    signatureHash: ")
                .append(toIndentedString(signatureHash))
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
