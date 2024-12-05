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
 * Represents CallsCaptureDtmfCallbackResponse model.
 */
public class CallsCaptureDtmfCallbackResponse extends CallbackResponse {

    private String fileId;

    private String fileUrl;

    private Integer maxLength = 15;

    private Integer timeout;

    private Integer digitTimeout;

    private String terminator;

    private Boolean addCountryCode;

    /**
     * Constructs a new {@link CallsCaptureDtmfCallbackResponse} instance.
     */
    public CallsCaptureDtmfCallbackResponse() {
        super("captureDtmf");
    }

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * ID of an audio file to play. Required if &#x60;fileUrl&#x60; is not provided.
     *
     * @param fileId
     * @return This {@link CallsCaptureDtmfCallbackResponse instance}.
     */
    public CallsCaptureDtmfCallbackResponse fileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Returns fileId.
     * <p>
     * Field description:
     * ID of an audio file to play. Required if &#x60;fileUrl&#x60; is not provided.
     *
     * @return fileId
     */
    @JsonProperty("fileId")
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets fileId.
     * <p>
     * Field description:
     * ID of an audio file to play. Required if &#x60;fileUrl&#x60; is not provided.
     *
     * @param fileId
     */
    @JsonProperty("fileId")
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * Sets fileUrl.
     * <p>
     * Field description:
     * URL of an audio file to play. Required if &#x60;fileId&#x60; is not provided.
     *
     * @param fileUrl
     * @return This {@link CallsCaptureDtmfCallbackResponse instance}.
     */
    public CallsCaptureDtmfCallbackResponse fileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    /**
     * Returns fileUrl.
     * <p>
     * Field description:
     * URL of an audio file to play. Required if &#x60;fileId&#x60; is not provided.
     *
     * @return fileUrl
     */
    @JsonProperty("fileUrl")
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * Sets fileUrl.
     * <p>
     * Field description:
     * URL of an audio file to play. Required if &#x60;fileId&#x60; is not provided.
     *
     * @param fileUrl
     */
    @JsonProperty("fileUrl")
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * Sets maxLength.
     * <p>
     * Field description:
     * Maximum number of digits to capture.
     * <p>
     * The field is required.
     *
     * @param maxLength
     * @return This {@link CallsCaptureDtmfCallbackResponse instance}.
     */
    public CallsCaptureDtmfCallbackResponse maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    /**
     * Returns maxLength.
     * <p>
     * Field description:
     * Maximum number of digits to capture.
     * <p>
     * The field is required.
     *
     * @return maxLength
     */
    @JsonProperty("maxLength")
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Sets maxLength.
     * <p>
     * Field description:
     * Maximum number of digits to capture.
     * <p>
     * The field is required.
     *
     * @param maxLength
     */
    @JsonProperty("maxLength")
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, to wait for the first DTMF digit response.
     * <p>
     * The field is required.
     *
     * @param timeout
     * @return This {@link CallsCaptureDtmfCallbackResponse instance}.
     */
    public CallsCaptureDtmfCallbackResponse timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, to wait for the first DTMF digit response.
     * <p>
     * The field is required.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * The duration, in milliseconds, to wait for the first DTMF digit response.
     * <p>
     * The field is required.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets digitTimeout.
     * <p>
     * Field description:
     * Duration, in milliseconds, to wait for a DTMF digit in-between individual digit inputs. If not set, &#x60;digitTimeout&#x60; will use the same duration as &#x60;timeout&#x60;.
     *
     * @param digitTimeout
     * @return This {@link CallsCaptureDtmfCallbackResponse instance}.
     */
    public CallsCaptureDtmfCallbackResponse digitTimeout(Integer digitTimeout) {
        this.digitTimeout = digitTimeout;
        return this;
    }

    /**
     * Returns digitTimeout.
     * <p>
     * Field description:
     * Duration, in milliseconds, to wait for a DTMF digit in-between individual digit inputs. If not set, &#x60;digitTimeout&#x60; will use the same duration as &#x60;timeout&#x60;.
     *
     * @return digitTimeout
     */
    @JsonProperty("digitTimeout")
    public Integer getDigitTimeout() {
        return digitTimeout;
    }

    /**
     * Sets digitTimeout.
     * <p>
     * Field description:
     * Duration, in milliseconds, to wait for a DTMF digit in-between individual digit inputs. If not set, &#x60;digitTimeout&#x60; will use the same duration as &#x60;timeout&#x60;.
     *
     * @param digitTimeout
     */
    @JsonProperty("digitTimeout")
    public void setDigitTimeout(Integer digitTimeout) {
        this.digitTimeout = digitTimeout;
    }

    /**
     * Sets terminator.
     * <p>
     * Field description:
     * Digit used to end input if less than &#x60;maxLength&#x60; digits have been pressed.
     *
     * @param terminator
     * @return This {@link CallsCaptureDtmfCallbackResponse instance}.
     */
    public CallsCaptureDtmfCallbackResponse terminator(String terminator) {
        this.terminator = terminator;
        return this;
    }

    /**
     * Returns terminator.
     * <p>
     * Field description:
     * Digit used to end input if less than &#x60;maxLength&#x60; digits have been pressed.
     *
     * @return terminator
     */
    @JsonProperty("terminator")
    public String getTerminator() {
        return terminator;
    }

    /**
     * Sets terminator.
     * <p>
     * Field description:
     * Digit used to end input if less than &#x60;maxLength&#x60; digits have been pressed.
     *
     * @param terminator
     */
    @JsonProperty("terminator")
    public void setTerminator(String terminator) {
        this.terminator = terminator;
    }

    /**
     * Sets addCountryCode.
     * <p>
     * Field description:
     * Whether to convert the collected number into international format or not.
     *
     * @param addCountryCode
     * @return This {@link CallsCaptureDtmfCallbackResponse instance}.
     */
    public CallsCaptureDtmfCallbackResponse addCountryCode(Boolean addCountryCode) {
        this.addCountryCode = addCountryCode;
        return this;
    }

    /**
     * Returns addCountryCode.
     * <p>
     * Field description:
     * Whether to convert the collected number into international format or not.
     *
     * @return addCountryCode
     */
    @JsonProperty("addCountryCode")
    public Boolean getAddCountryCode() {
        return addCountryCode;
    }

    /**
     * Sets addCountryCode.
     * <p>
     * Field description:
     * Whether to convert the collected number into international format or not.
     *
     * @param addCountryCode
     */
    @JsonProperty("addCountryCode")
    public void setAddCountryCode(Boolean addCountryCode) {
        this.addCountryCode = addCountryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCaptureDtmfCallbackResponse callsCaptureDtmfCallbackResponse = (CallsCaptureDtmfCallbackResponse) o;
        return Objects.equals(this.fileId, callsCaptureDtmfCallbackResponse.fileId)
                && Objects.equals(this.fileUrl, callsCaptureDtmfCallbackResponse.fileUrl)
                && Objects.equals(this.maxLength, callsCaptureDtmfCallbackResponse.maxLength)
                && Objects.equals(this.timeout, callsCaptureDtmfCallbackResponse.timeout)
                && Objects.equals(this.digitTimeout, callsCaptureDtmfCallbackResponse.digitTimeout)
                && Objects.equals(this.terminator, callsCaptureDtmfCallbackResponse.terminator)
                && Objects.equals(this.addCountryCode, callsCaptureDtmfCallbackResponse.addCountryCode)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                fileId, fileUrl, maxLength, timeout, digitTimeout, terminator, addCountryCode, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCaptureDtmfCallbackResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    fileId: ")
                .append(toIndentedString(fileId))
                .append(newLine)
                .append("    fileUrl: ")
                .append(toIndentedString(fileUrl))
                .append(newLine)
                .append("    maxLength: ")
                .append(toIndentedString(maxLength))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    digitTimeout: ")
                .append(toIndentedString(digitTimeout))
                .append(newLine)
                .append("    terminator: ")
                .append(toIndentedString(terminator))
                .append(newLine)
                .append("    addCountryCode: ")
                .append(toIndentedString(addCountryCode))
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
