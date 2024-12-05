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
 * SMS message to be sent if the Viber message could not be delivered.
 */
public class ViberSmsFailover {

    private String from;

    private String text;

    private Integer validityPeriod;

    private ValidityPeriodTimeUnit validityPeriodTimeUnit;

    /**
     * Sets from.
     * <p>
     * Field description:
     * SMS sender number. Must be in international format.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link ViberSmsFailover instance}.
     */
    public ViberSmsFailover from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * SMS sender number. Must be in international format.
     * <p>
     * The field is required.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * SMS sender number. Must be in international format.
     * <p>
     * The field is required.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the SMS that will be sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link ViberSmsFailover instance}.
     */
    public ViberSmsFailover text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the SMS that will be sent.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the SMS that will be sent.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * Message failover validity period. Required, if &#39;validityPeriodTimeUnit&#39; is set. Validity period must be between 30 seconds and 2 days.
     *
     * @param validityPeriod
     * @return This {@link ViberSmsFailover instance}.
     */
    public ViberSmsFailover validityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     * <p>
     * Field description:
     * Message failover validity period. Required, if &#39;validityPeriodTimeUnit&#39; is set. Validity period must be between 30 seconds and 2 days.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public Integer getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     * <p>
     * Field description:
     * Message failover validity period. Required, if &#39;validityPeriodTimeUnit&#39; is set. Validity period must be between 30 seconds and 2 days.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Sets validityPeriodTimeUnit.
     *
     * @param validityPeriodTimeUnit
     * @return This {@link ViberSmsFailover instance}.
     */
    public ViberSmsFailover validityPeriodTimeUnit(ValidityPeriodTimeUnit validityPeriodTimeUnit) {
        this.validityPeriodTimeUnit = validityPeriodTimeUnit;
        return this;
    }

    /**
     * Returns validityPeriodTimeUnit.
     *
     * @return validityPeriodTimeUnit
     */
    @JsonProperty("validityPeriodTimeUnit")
    public ValidityPeriodTimeUnit getValidityPeriodTimeUnit() {
        return validityPeriodTimeUnit;
    }

    /**
     * Sets validityPeriodTimeUnit.
     *
     * @param validityPeriodTimeUnit
     */
    @JsonProperty("validityPeriodTimeUnit")
    public void setValidityPeriodTimeUnit(ValidityPeriodTimeUnit validityPeriodTimeUnit) {
        this.validityPeriodTimeUnit = validityPeriodTimeUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberSmsFailover viberSmsFailover = (ViberSmsFailover) o;
        return Objects.equals(this.from, viberSmsFailover.from)
                && Objects.equals(this.text, viberSmsFailover.text)
                && Objects.equals(this.validityPeriod, viberSmsFailover.validityPeriod)
                && Objects.equals(this.validityPeriodTimeUnit, viberSmsFailover.validityPeriodTimeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, text, validityPeriod, validityPeriodTimeUnit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberSmsFailover {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    validityPeriodTimeUnit: ")
                .append(toIndentedString(validityPeriodTimeUnit))
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
