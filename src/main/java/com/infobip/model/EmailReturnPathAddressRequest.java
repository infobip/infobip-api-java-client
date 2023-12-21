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
 * Represents EmailReturnPathAddressRequest model.
 */
public class EmailReturnPathAddressRequest {

    private String returnPathAddress;

    /**
     * Sets returnPathAddress.
     * <p>
     * Field description:
     * Mailbox for return path, this mailbox should be based on the same domain. If you want to disable custom return path and use our default return path address set the value to an empty string.
     * <p>
     * The field is required.
     *
     * @param returnPathAddress
     * @return This {@link EmailReturnPathAddressRequest instance}.
     */
    public EmailReturnPathAddressRequest returnPathAddress(String returnPathAddress) {
        this.returnPathAddress = returnPathAddress;
        return this;
    }

    /**
     * Returns returnPathAddress.
     * <p>
     * Field description:
     * Mailbox for return path, this mailbox should be based on the same domain. If you want to disable custom return path and use our default return path address set the value to an empty string.
     * <p>
     * The field is required.
     *
     * @return returnPathAddress
     */
    @JsonProperty("returnPathAddress")
    public String getReturnPathAddress() {
        return returnPathAddress;
    }

    /**
     * Sets returnPathAddress.
     * <p>
     * Field description:
     * Mailbox for return path, this mailbox should be based on the same domain. If you want to disable custom return path and use our default return path address set the value to an empty string.
     * <p>
     * The field is required.
     *
     * @param returnPathAddress
     */
    @JsonProperty("returnPathAddress")
    public void setReturnPathAddress(String returnPathAddress) {
        this.returnPathAddress = returnPathAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailReturnPathAddressRequest emailReturnPathAddressRequest = (EmailReturnPathAddressRequest) o;
        return Objects.equals(this.returnPathAddress, emailReturnPathAddressRequest.returnPathAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(returnPathAddress);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailReturnPathAddressRequest {")
                .append(newLine)
                .append("    returnPathAddress: ")
                .append(toIndentedString(returnPathAddress))
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
