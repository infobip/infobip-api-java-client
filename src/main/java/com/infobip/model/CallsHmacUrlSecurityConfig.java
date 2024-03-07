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
 * Represents CallsHmacUrlSecurityConfig model.
 */
public class CallsHmacUrlSecurityConfig extends CallsUrlSecurityConfig {

    private String secretKey;

    private HmacAlgorithm algorithm;

    /**
     * Constructs a new {@link CallsHmacUrlSecurityConfig} instance.
     */
    public CallsHmacUrlSecurityConfig() {
        super("HMAC");
    }

    /**
     * Sets secretKey.
     * <p>
     * Field description:
     * Secret key.
     * <p>
     * The field is required.
     *
     * @param secretKey
     * @return This {@link CallsHmacUrlSecurityConfig instance}.
     */
    public CallsHmacUrlSecurityConfig secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Returns secretKey.
     * <p>
     * Field description:
     * Secret key.
     * <p>
     * The field is required.
     *
     * @return secretKey
     */
    @JsonProperty("secretKey")
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Sets secretKey.
     * <p>
     * Field description:
     * Secret key.
     * <p>
     * The field is required.
     *
     * @param secretKey
     */
    @JsonProperty("secretKey")
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * Sets algorithm.
     * <p>
     * The field is required.
     *
     * @param algorithm
     * @return This {@link CallsHmacUrlSecurityConfig instance}.
     */
    public CallsHmacUrlSecurityConfig algorithm(HmacAlgorithm algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Returns algorithm.
     * <p>
     * The field is required.
     *
     * @return algorithm
     */
    @JsonProperty("algorithm")
    public HmacAlgorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets algorithm.
     * <p>
     * The field is required.
     *
     * @param algorithm
     */
    @JsonProperty("algorithm")
    public void setAlgorithm(HmacAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsHmacUrlSecurityConfig callsHmacUrlSecurityConfig = (CallsHmacUrlSecurityConfig) o;
        return Objects.equals(this.secretKey, callsHmacUrlSecurityConfig.secretKey)
                && Objects.equals(this.algorithm, callsHmacUrlSecurityConfig.algorithm)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secretKey, algorithm, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsHmacUrlSecurityConfig {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    secretKey: ")
                .append(toIndentedString(secretKey))
                .append(newLine)
                .append("    algorithm: ")
                .append(toIndentedString(algorithm))
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
