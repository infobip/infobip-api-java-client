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
 * Represents WebRtcPushConfigurationResponse model.
 */
public class WebRtcPushConfigurationResponse {

    private String id;

    private String applicationId;

    private String name;

    private Boolean androidConfigured;

    private Boolean iosConfigured;

    /**
     * Sets id.
     * <p>
     * Field description:
     * The identifier to associate the push configuration with.
     *
     * @param id
     * @return This {@link WebRtcPushConfigurationResponse instance}.
     */
    public WebRtcPushConfigurationResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * The identifier to associate the push configuration with.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * The identifier to associate the push configuration with.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id to associate the push configuration with.
     *
     * @param applicationId
     * @return This {@link WebRtcPushConfigurationResponse instance}.
     */
    public WebRtcPushConfigurationResponse applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Application id to associate the push configuration with.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Application id to associate the push configuration with.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name describing the push configuration.
     *
     * @param name
     * @return This {@link WebRtcPushConfigurationResponse instance}.
     */
    public WebRtcPushConfigurationResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name describing the push configuration.
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
     * Name describing the push configuration.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets androidConfigured.
     * <p>
     * Field description:
     * Flag indicating whether the Android push notification config is set.
     *
     * @param androidConfigured
     * @return This {@link WebRtcPushConfigurationResponse instance}.
     */
    public WebRtcPushConfigurationResponse androidConfigured(Boolean androidConfigured) {
        this.androidConfigured = androidConfigured;
        return this;
    }

    /**
     * Returns androidConfigured.
     * <p>
     * Field description:
     * Flag indicating whether the Android push notification config is set.
     *
     * @return androidConfigured
     */
    @JsonProperty("androidConfigured")
    public Boolean getAndroidConfigured() {
        return androidConfigured;
    }

    /**
     * Sets androidConfigured.
     * <p>
     * Field description:
     * Flag indicating whether the Android push notification config is set.
     *
     * @param androidConfigured
     */
    @JsonProperty("androidConfigured")
    public void setAndroidConfigured(Boolean androidConfigured) {
        this.androidConfigured = androidConfigured;
    }

    /**
     * Sets iosConfigured.
     * <p>
     * Field description:
     * Flag indicating whether the iOS push notification config is set.
     *
     * @param iosConfigured
     * @return This {@link WebRtcPushConfigurationResponse instance}.
     */
    public WebRtcPushConfigurationResponse iosConfigured(Boolean iosConfigured) {
        this.iosConfigured = iosConfigured;
        return this;
    }

    /**
     * Returns iosConfigured.
     * <p>
     * Field description:
     * Flag indicating whether the iOS push notification config is set.
     *
     * @return iosConfigured
     */
    @JsonProperty("iosConfigured")
    public Boolean getIosConfigured() {
        return iosConfigured;
    }

    /**
     * Sets iosConfigured.
     * <p>
     * Field description:
     * Flag indicating whether the iOS push notification config is set.
     *
     * @param iosConfigured
     */
    @JsonProperty("iosConfigured")
    public void setIosConfigured(Boolean iosConfigured) {
        this.iosConfigured = iosConfigured;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcPushConfigurationResponse webRtcPushConfigurationResponse = (WebRtcPushConfigurationResponse) o;
        return Objects.equals(this.id, webRtcPushConfigurationResponse.id)
                && Objects.equals(this.applicationId, webRtcPushConfigurationResponse.applicationId)
                && Objects.equals(this.name, webRtcPushConfigurationResponse.name)
                && Objects.equals(this.androidConfigured, webRtcPushConfigurationResponse.androidConfigured)
                && Objects.equals(this.iosConfigured, webRtcPushConfigurationResponse.iosConfigured);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, applicationId, name, androidConfigured, iosConfigured);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcPushConfigurationResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    androidConfigured: ")
                .append(toIndentedString(androidConfigured))
                .append(newLine)
                .append("    iosConfigured: ")
                .append(toIndentedString(iosConfigured))
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
