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
 * Represents NumbersCvVetImportRequest model.
 */
public class NumbersCvVetImportRequest extends NumbersVetImportRequest {

    private String authorizationToken;

    /**
     * Constructs a new {@link NumbersCvVetImportRequest} instance.
     */
    public NumbersCvVetImportRequest() {
        super("CAMPAIGN_VERIFY");
    }

    /**
     * Sets authorizationToken.
     * <p>
     * Field description:
     * Campaign Verify authorization token
     * <p>
     * The field is required.
     *
     * @param authorizationToken
     * @return This {@link NumbersCvVetImportRequest instance}.
     */
    public NumbersCvVetImportRequest authorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
        return this;
    }

    /**
     * Returns authorizationToken.
     * <p>
     * Field description:
     * Campaign Verify authorization token
     * <p>
     * The field is required.
     *
     * @return authorizationToken
     */
    @JsonProperty("authorizationToken")
    public String getAuthorizationToken() {
        return authorizationToken;
    }

    /**
     * Sets authorizationToken.
     * <p>
     * Field description:
     * Campaign Verify authorization token
     * <p>
     * The field is required.
     *
     * @param authorizationToken
     */
    @JsonProperty("authorizationToken")
    public void setAuthorizationToken(String authorizationToken) {
        this.authorizationToken = authorizationToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersCvVetImportRequest numbersCvVetImportRequest = (NumbersCvVetImportRequest) o;
        return Objects.equals(this.authorizationToken, numbersCvVetImportRequest.authorizationToken) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationToken, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersCvVetImportRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    authorizationToken: ")
                .append(toIndentedString(authorizationToken))
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
