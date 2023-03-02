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
 * Represents TfaApplicationRequest model.
 */
public class TfaApplicationRequest {

    private TfaApplicationConfiguration _configuration;

    private Boolean enabled;

    private String name;

    /**
     * Sets _configuration.
     *
     * @param _configuration
     * @return This {@link TfaApplicationRequest instance}.
     */
    public TfaApplicationRequest _configuration(TfaApplicationConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Returns _configuration.
     *
     * @return _configuration
     */
    @JsonProperty("configuration")
    public TfaApplicationConfiguration getConfiguration() {
        return _configuration;
    }

    /**
     * Sets _configuration.
     *
     * @param _configuration
     */
    @JsonProperty("configuration")
    public void setConfiguration(TfaApplicationConfiguration _configuration) {
        this._configuration = _configuration;
    }

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether the created application is enabled.
     *
     * @param enabled
     * @return This {@link TfaApplicationRequest instance}.
     */
    public TfaApplicationRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Returns enabled.
     * <p>
     * Field description:
     * Indicates whether the created application is enabled.
     *
     * @return enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets enabled.
     * <p>
     * Field description:
     * Indicates whether the created application is enabled.
     *
     * @param enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * 2FA application name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link TfaApplicationRequest instance}.
     */
    public TfaApplicationRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * 2FA application name.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * 2FA application name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaApplicationRequest tfaApplicationRequest = (TfaApplicationRequest) o;
        return Objects.equals(this._configuration, tfaApplicationRequest._configuration)
                && Objects.equals(this.enabled, tfaApplicationRequest.enabled)
                && Objects.equals(this.name, tfaApplicationRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration, enabled, name);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaApplicationRequest {")
                .append(newLine)
                .append("    _configuration: ")
                .append(toIndentedString(_configuration))
                .append(newLine)
                .append("    enabled: ")
                .append(toIndentedString(enabled))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
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
