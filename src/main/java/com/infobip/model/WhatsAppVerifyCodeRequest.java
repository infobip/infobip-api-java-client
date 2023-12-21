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
 * Represents WhatsAppVerifyCodeRequest model.
 */
public class WhatsAppVerifyCodeRequest {

    private String code;

    /**
     * Sets code.
     * <p>
     * Field description:
     * Verification code.
     * <p>
     * The field is required.
     *
     * @param code
     * @return This {@link WhatsAppVerifyCodeRequest instance}.
     */
    public WhatsAppVerifyCodeRequest code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * Field description:
     * Verification code.
     * <p>
     * The field is required.
     *
     * @return code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     * <p>
     * Field description:
     * Verification code.
     * <p>
     * The field is required.
     *
     * @param code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppVerifyCodeRequest whatsAppVerifyCodeRequest = (WhatsAppVerifyCodeRequest) o;
        return Objects.equals(this.code, whatsAppVerifyCodeRequest.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppVerifyCodeRequest {")
                .append(newLine)
                .append("    code: ")
                .append(toIndentedString(code))
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
