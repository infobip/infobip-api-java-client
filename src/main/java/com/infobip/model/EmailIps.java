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
 * IP options per message.
 */
public class EmailIps {

    private String ipPoolId;

    /**
     * Sets ipPoolId.
     * <p>
     * Field description:
     * The ID of the IP pool that will be used to send the email.
     *
     * @param ipPoolId
     * @return This {@link EmailIps instance}.
     */
    public EmailIps ipPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }

    /**
     * Returns ipPoolId.
     * <p>
     * Field description:
     * The ID of the IP pool that will be used to send the email.
     *
     * @return ipPoolId
     */
    @JsonProperty("ipPoolId")
    public String getIpPoolId() {
        return ipPoolId;
    }

    /**
     * Sets ipPoolId.
     * <p>
     * Field description:
     * The ID of the IP pool that will be used to send the email.
     *
     * @param ipPoolId
     */
    @JsonProperty("ipPoolId")
    public void setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailIps emailIps = (EmailIps) o;
        return Objects.equals(this.ipPoolId, emailIps.ipPoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipPoolId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailIps {")
                .append(newLine)
                .append("    ipPoolId: ")
                .append(toIndentedString(ipPoolId))
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
