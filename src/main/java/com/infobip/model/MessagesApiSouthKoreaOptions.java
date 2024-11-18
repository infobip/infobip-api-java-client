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
 * Use case dependent parameters for sending SMS to phone numbers registered in South Korea.
 */
public class MessagesApiSouthKoreaOptions {

    private String title;

    private Integer resellerCode;

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the message.
     *
     * @param title
     * @return This {@link MessagesApiSouthKoreaOptions instance}.
     */
    public MessagesApiSouthKoreaOptions title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the message.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the message.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets resellerCode.
     * <p>
     * Field description:
     * Reseller identification code: 9-digit registration number in the business registration certificate for South Korea. Resellers should submit this when sending.
     *
     * @param resellerCode
     * @return This {@link MessagesApiSouthKoreaOptions instance}.
     */
    public MessagesApiSouthKoreaOptions resellerCode(Integer resellerCode) {
        this.resellerCode = resellerCode;
        return this;
    }

    /**
     * Returns resellerCode.
     * <p>
     * Field description:
     * Reseller identification code: 9-digit registration number in the business registration certificate for South Korea. Resellers should submit this when sending.
     *
     * @return resellerCode
     */
    @JsonProperty("resellerCode")
    public Integer getResellerCode() {
        return resellerCode;
    }

    /**
     * Sets resellerCode.
     * <p>
     * Field description:
     * Reseller identification code: 9-digit registration number in the business registration certificate for South Korea. Resellers should submit this when sending.
     *
     * @param resellerCode
     */
    @JsonProperty("resellerCode")
    public void setResellerCode(Integer resellerCode) {
        this.resellerCode = resellerCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiSouthKoreaOptions messagesApiSouthKoreaOptions = (MessagesApiSouthKoreaOptions) o;
        return Objects.equals(this.title, messagesApiSouthKoreaOptions.title)
                && Objects.equals(this.resellerCode, messagesApiSouthKoreaOptions.resellerCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, resellerCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiSouthKoreaOptions {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    resellerCode: ")
                .append(toIndentedString(resellerCode))
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
