/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Represents CallRoutingHmacUrlSecurityConfig model.
 */
public class CallRoutingHmacUrlSecurityConfig extends CallRoutingUrlSecurityConfig {

    private String secretKey;

    /**
     * Represents algorithm enumeration.
     */
    public enum AlgorithmEnum {
        MD5("HMAC_MD5"),
        SHA_1("HMAC_SHA_1"),
        SHA_224("HMAC_SHA_224"),
        SHA_256("HMAC_SHA_256"),
        SHA_384("HMAC_SHA_384"),
        SHA_512("HMAC_SHA_512");

        private String value;

        AlgorithmEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AlgorithmEnum fromValue(String value) {
            for (AlgorithmEnum enumElement : AlgorithmEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private AlgorithmEnum algorithm;

    /**
     * Constructs a new {@link CallRoutingHmacUrlSecurityConfig} instance.
     */
    public CallRoutingHmacUrlSecurityConfig() {
        super("HMAC");
    }

    /**
     * Sets secretKey.
     * <p>
     * Field description:
     * Algorithm used for encryption.
     * <p>
     * The field is required.
     *
     * @param secretKey
     * @return This {@link CallRoutingHmacUrlSecurityConfig instance}.
     */
    public CallRoutingHmacUrlSecurityConfig secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * Returns secretKey.
     * <p>
     * Field description:
     * Algorithm used for encryption.
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
     * Algorithm used for encryption.
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
     * @return This {@link CallRoutingHmacUrlSecurityConfig instance}.
     */
    public CallRoutingHmacUrlSecurityConfig algorithm(AlgorithmEnum algorithm) {
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
    public AlgorithmEnum getAlgorithm() {
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
    public void setAlgorithm(AlgorithmEnum algorithm) {
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
        CallRoutingHmacUrlSecurityConfig callRoutingHmacUrlSecurityConfig = (CallRoutingHmacUrlSecurityConfig) o;
        return Objects.equals(this.secretKey, callRoutingHmacUrlSecurityConfig.secretKey)
                && Objects.equals(this.algorithm, callRoutingHmacUrlSecurityConfig.algorithm)
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
                .append("class CallRoutingHmacUrlSecurityConfig {")
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
