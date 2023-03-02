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
 * Represents WebRtcTokenResponseModel model.
 */
public class WebRtcTokenResponseModel {

    private String token;

    private String expirationTime;

    /**
     * Sets token.
     * <p>
     * Field description:
     * The access token used to connect client SDKs to Infobip WebRTC platform.
     *
     * @param token
     * @return This {@link WebRtcTokenResponseModel instance}.
     */
    public WebRtcTokenResponseModel token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Returns token.
     * <p>
     * Field description:
     * The access token used to connect client SDKs to Infobip WebRTC platform.
     *
     * @return token
     */
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    /**
     * Sets token.
     * <p>
     * Field description:
     * The access token used to connect client SDKs to Infobip WebRTC platform.
     *
     * @param token
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * Time point until which token is valid. The default value is 8h. If it expires, the user must be provided with the new valid token in order to continue using Infobip WebRTC platform. There is no notification about token expiry, you must track that by yourself.
     *
     * @param expirationTime
     * @return This {@link WebRtcTokenResponseModel instance}.
     */
    public WebRtcTokenResponseModel expirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Returns expirationTime.
     * <p>
     * Field description:
     * Time point until which token is valid. The default value is 8h. If it expires, the user must be provided with the new valid token in order to continue using Infobip WebRTC platform. There is no notification about token expiry, you must track that by yourself.
     *
     * @return expirationTime
     */
    @JsonProperty("expirationTime")
    public String getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * Time point until which token is valid. The default value is 8h. If it expires, the user must be provided with the new valid token in order to continue using Infobip WebRTC platform. There is no notification about token expiry, you must track that by yourself.
     *
     * @param expirationTime
     */
    @JsonProperty("expirationTime")
    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcTokenResponseModel webRtcTokenResponseModel = (WebRtcTokenResponseModel) o;
        return Objects.equals(this.token, webRtcTokenResponseModel.token)
                && Objects.equals(this.expirationTime, webRtcTokenResponseModel.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, expirationTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcTokenResponseModel {")
                .append(newLine)
                .append("    token: ")
                .append(toIndentedString(token))
                .append(newLine)
                .append("    expirationTime: ")
                .append(toIndentedString(expirationTime))
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
