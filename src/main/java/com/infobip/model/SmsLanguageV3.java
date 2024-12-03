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
 * Sets the language parameters for the message being sent.
 */
public class SmsLanguageV3 {

    private SmsLanguageCode languageCode;

    private Boolean singleShift;

    private Boolean lockingShift;

    /**
     * Sets languageCode.
     *
     * @param languageCode
     * @return This {@link SmsLanguageV3 instance}.
     */
    public SmsLanguageV3 languageCode(SmsLanguageCode languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Returns languageCode.
     *
     * @return languageCode
     */
    @JsonProperty("languageCode")
    public SmsLanguageCode getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets languageCode.
     *
     * @param languageCode
     */
    @JsonProperty("languageCode")
    public void setLanguageCode(SmsLanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * Sets singleShift.
     * <p>
     * Field description:
     * Uses a single shift table which enhances only the extension table of the GSM default alphabet. Allows you to selectively improve character support without altering the entire message.
     *
     * @param singleShift
     * @return This {@link SmsLanguageV3 instance}.
     */
    public SmsLanguageV3 singleShift(Boolean singleShift) {
        this.singleShift = singleShift;
        return this;
    }

    /**
     * Returns singleShift.
     * <p>
     * Field description:
     * Uses a single shift table which enhances only the extension table of the GSM default alphabet. Allows you to selectively improve character support without altering the entire message.
     *
     * @return singleShift
     */
    @JsonProperty("singleShift")
    public Boolean getSingleShift() {
        return singleShift;
    }

    /**
     * Sets singleShift.
     * <p>
     * Field description:
     * Uses a single shift table which enhances only the extension table of the GSM default alphabet. Allows you to selectively improve character support without altering the entire message.
     *
     * @param singleShift
     */
    @JsonProperty("singleShift")
    public void setSingleShift(Boolean singleShift) {
        this.singleShift = singleShift;
    }

    /**
     * Sets lockingShift.
     * <p>
     * Field description:
     * Uses a locking shift table which allows you to represent characters beyond the standard GSM default alphabet. This flexibility enables better language support.
     *
     * @param lockingShift
     * @return This {@link SmsLanguageV3 instance}.
     */
    public SmsLanguageV3 lockingShift(Boolean lockingShift) {
        this.lockingShift = lockingShift;
        return this;
    }

    /**
     * Returns lockingShift.
     * <p>
     * Field description:
     * Uses a locking shift table which allows you to represent characters beyond the standard GSM default alphabet. This flexibility enables better language support.
     *
     * @return lockingShift
     */
    @JsonProperty("lockingShift")
    public Boolean getLockingShift() {
        return lockingShift;
    }

    /**
     * Sets lockingShift.
     * <p>
     * Field description:
     * Uses a locking shift table which allows you to represent characters beyond the standard GSM default alphabet. This flexibility enables better language support.
     *
     * @param lockingShift
     */
    @JsonProperty("lockingShift")
    public void setLockingShift(Boolean lockingShift) {
        this.lockingShift = lockingShift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsLanguageV3 smsLanguageV3 = (SmsLanguageV3) o;
        return Objects.equals(this.languageCode, smsLanguageV3.languageCode)
                && Objects.equals(this.singleShift, smsLanguageV3.singleShift)
                && Objects.equals(this.lockingShift, smsLanguageV3.lockingShift);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageCode, singleShift, lockingShift);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsLanguageV3 {")
                .append(newLine)
                .append("    languageCode: ")
                .append(toIndentedString(languageCode))
                .append(newLine)
                .append("    singleShift: ")
                .append(toIndentedString(singleShift))
                .append(newLine)
                .append("    lockingShift: ")
                .append(toIndentedString(lockingShift))
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
