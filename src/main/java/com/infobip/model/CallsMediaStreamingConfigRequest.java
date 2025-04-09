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
 * Represents CallsMediaStreamingConfigRequest model.
 */
public class CallsMediaStreamingConfigRequest extends CallsMediaStreamConfigRequest {

    private SecurityConfig securityConfig;

    /**
     * Constructs a new {@link CallsMediaStreamingConfigRequest} instance.
     */
    public CallsMediaStreamingConfigRequest() {
        super("MEDIA_STREAMING");
    }

    /**
     * Sets securityConfig.
     *
     * @param securityConfig
     * @return This {@link CallsMediaStreamingConfigRequest instance}.
     */
    public CallsMediaStreamingConfigRequest securityConfig(SecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    /**
     * Returns securityConfig.
     *
     * @return securityConfig
     */
    @JsonProperty("securityConfig")
    public SecurityConfig getSecurityConfig() {
        return securityConfig;
    }

    /**
     * Sets securityConfig.
     *
     * @param securityConfig
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(SecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStreamingConfigRequest callsMediaStreamingConfigRequest = (CallsMediaStreamingConfigRequest) o;
        return Objects.equals(this.securityConfig, callsMediaStreamingConfigRequest.securityConfig) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityConfig, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamingConfigRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    securityConfig: ")
                .append(toIndentedString(securityConfig))
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
