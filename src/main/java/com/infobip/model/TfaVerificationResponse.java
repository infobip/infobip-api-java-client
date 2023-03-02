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
 * Represents TfaVerificationResponse model.
 */
public class TfaVerificationResponse {

    private List<TfaVerification> verifications = null;

    /**
     * Sets verifications.
     * <p>
     * Field description:
     * Collection of verifications
     *
     * @param verifications
     * @return This {@link TfaVerificationResponse instance}.
     */
    public TfaVerificationResponse verifications(List<TfaVerification> verifications) {
        this.verifications = verifications;
        return this;
    }

    /**
     * Adds and item into verifications.
     * <p>
     * Field description:
     * Collection of verifications
     *
     * @param verificationsItem The item to be added to the list.
     * @return This {@link TfaVerificationResponse instance}.
     */
    public TfaVerificationResponse addVerificationsItem(TfaVerification verificationsItem) {
        if (this.verifications == null) {
            this.verifications = new ArrayList<>();
        }
        this.verifications.add(verificationsItem);
        return this;
    }

    /**
     * Returns verifications.
     * <p>
     * Field description:
     * Collection of verifications
     *
     * @return verifications
     */
    @JsonProperty("verifications")
    public List<TfaVerification> getVerifications() {
        return verifications;
    }

    /**
     * Sets verifications.
     * <p>
     * Field description:
     * Collection of verifications
     *
     * @param verifications
     */
    @JsonProperty("verifications")
    public void setVerifications(List<TfaVerification> verifications) {
        this.verifications = verifications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaVerificationResponse tfaVerificationResponse = (TfaVerificationResponse) o;
        return Objects.equals(this.verifications, tfaVerificationResponse.verifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verifications);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaVerificationResponse {")
                .append(newLine)
                .append("    verifications: ")
                .append(toIndentedString(verifications))
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
