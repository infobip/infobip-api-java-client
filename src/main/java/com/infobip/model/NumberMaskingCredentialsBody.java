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
 * Represents NumberMaskingCredentialsBody model.
 */
public class NumberMaskingCredentialsBody {

    private String apiId;

    private String key;

    /**
     * Sets apiId.
     * <p>
     * Field description:
     * The first part of the generate Authorization header.
     * <p>
     * The field is required.
     *
     * @param apiId
     * @return This {@link NumberMaskingCredentialsBody instance}.
     */
    public NumberMaskingCredentialsBody apiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * Returns apiId.
     * <p>
     * Field description:
     * The first part of the generate Authorization header.
     * <p>
     * The field is required.
     *
     * @return apiId
     */
    @JsonProperty("apiId")
    public String getApiId() {
        return apiId;
    }

    /**
     * Sets apiId.
     * <p>
     * Field description:
     * The first part of the generate Authorization header.
     * <p>
     * The field is required.
     *
     * @param apiId
     */
    @JsonProperty("apiId")
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Used to generate the second part of the Authorization header.
     * <p>
     * The field is required.
     *
     * @param key
     * @return This {@link NumberMaskingCredentialsBody instance}.
     */
    public NumberMaskingCredentialsBody key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns key.
     * <p>
     * Field description:
     * Used to generate the second part of the Authorization header.
     * <p>
     * The field is required.
     *
     * @return key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Used to generate the second part of the Authorization header.
     * <p>
     * The field is required.
     *
     * @param key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberMaskingCredentialsBody numberMaskingCredentialsBody = (NumberMaskingCredentialsBody) o;
        return Objects.equals(this.apiId, numberMaskingCredentialsBody.apiId)
                && Objects.equals(this.key, numberMaskingCredentialsBody.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, key);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberMaskingCredentialsBody {")
                .append(newLine)
                .append("    apiId: ")
                .append(toIndentedString(apiId))
                .append(newLine)
                .append("    key: ")
                .append(toIndentedString(key))
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
