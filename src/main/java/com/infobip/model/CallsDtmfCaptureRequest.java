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
 * Represents CallsDtmfCaptureRequest model.
 */
public class CallsDtmfCaptureRequest {

    private Integer maxLength;

    private Integer timeout;

    private String terminator;

    private Integer digitTimeout;

    /**
     * Sets maxLength.
     * <p>
     * Field description:
     * Maximum number of digits to capture.
     * <p>
     * The field is required.
     *
     * @param maxLength
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest maxLength(Integer maxLength) {
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
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest timeout(Integer timeout) {
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
     * Sets terminator.
     * <p>
     * Field description:
     * Digit used to end input if less than &#x60;maxLength&#x60; digits have been pressed.
     *
     * @param terminator
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest terminator(String terminator) {
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
     * Sets digitTimeout.
     * <p>
     * Field description:
     * Duration, in milliseconds, to wait for a DTMF digit in-between individual digit inputs. If not set, &#x60;digitTimeout&#x60; will use the same duration as &#x60;timeout&#x60;.
     *
     * @param digitTimeout
     * @return This {@link CallsDtmfCaptureRequest instance}.
     */
    public CallsDtmfCaptureRequest digitTimeout(Integer digitTimeout) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDtmfCaptureRequest callsDtmfCaptureRequest = (CallsDtmfCaptureRequest) o;
        return Objects.equals(this.maxLength, callsDtmfCaptureRequest.maxLength)
                && Objects.equals(this.timeout, callsDtmfCaptureRequest.timeout)
                && Objects.equals(this.terminator, callsDtmfCaptureRequest.terminator)
                && Objects.equals(this.digitTimeout, callsDtmfCaptureRequest.digitTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxLength, timeout, terminator, digitTimeout);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDtmfCaptureRequest {")
                .append(newLine)
                .append("    maxLength: ")
                .append(toIndentedString(maxLength))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    terminator: ")
                .append(toIndentedString(terminator))
                .append(newLine)
                .append("    digitTimeout: ")
                .append(toIndentedString(digitTimeout))
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
