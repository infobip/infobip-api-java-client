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
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Options of the page.
 */
public class MessagesApiMessageDatePickerFormPageOptions {

    private String dateFormat;

    private OffsetDateTime startDate;

    private OffsetDateTime maximumDate;

    private OffsetDateTime minimumDate;

    private String dateLabel;

    /**
     * Sets dateFormat.
     * <p>
     * Field description:
     * Date format used on the page e.g. &#x60;MM/dd/yyyy&#x60;.
     *
     * @param dateFormat
     * @return This {@link MessagesApiMessageDatePickerFormPageOptions instance}.
     */
    public MessagesApiMessageDatePickerFormPageOptions dateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Returns dateFormat.
     * <p>
     * Field description:
     * Date format used on the page e.g. &#x60;MM/dd/yyyy&#x60;.
     *
     * @return dateFormat
     */
    @JsonProperty("dateFormat")
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Sets dateFormat.
     * <p>
     * Field description:
     * Date format used on the page e.g. &#x60;MM/dd/yyyy&#x60;.
     *
     * @param dateFormat
     */
    @JsonProperty("dateFormat")
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * Sets startDate.
     * <p>
     * Field description:
     * Date displayed by the date picker. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @param startDate
     * @return This {@link MessagesApiMessageDatePickerFormPageOptions instance}.
     */
    public MessagesApiMessageDatePickerFormPageOptions startDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Returns startDate.
     * <p>
     * Field description:
     * Date displayed by the date picker. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @return startDate
     */
    @JsonProperty("startDate")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    /**
     * Sets startDate.
     * <p>
     * Field description:
     * Date displayed by the date picker. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @param startDate
     */
    @JsonProperty("startDate")
    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    /**
     * Sets maximumDate.
     * <p>
     * Field description:
     * Maximum date that the date picker can show. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @param maximumDate
     * @return This {@link MessagesApiMessageDatePickerFormPageOptions instance}.
     */
    public MessagesApiMessageDatePickerFormPageOptions maximumDate(OffsetDateTime maximumDate) {
        this.maximumDate = maximumDate;
        return this;
    }

    /**
     * Returns maximumDate.
     * <p>
     * Field description:
     * Maximum date that the date picker can show. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @return maximumDate
     */
    @JsonProperty("maximumDate")
    public OffsetDateTime getMaximumDate() {
        return maximumDate;
    }

    /**
     * Sets maximumDate.
     * <p>
     * Field description:
     * Maximum date that the date picker can show. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @param maximumDate
     */
    @JsonProperty("maximumDate")
    public void setMaximumDate(OffsetDateTime maximumDate) {
        this.maximumDate = maximumDate;
    }

    /**
     * Sets minimumDate.
     * <p>
     * Field description:
     * Minimum date that the date picker can show. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @param minimumDate
     * @return This {@link MessagesApiMessageDatePickerFormPageOptions instance}.
     */
    public MessagesApiMessageDatePickerFormPageOptions minimumDate(OffsetDateTime minimumDate) {
        this.minimumDate = minimumDate;
        return this;
    }

    /**
     * Returns minimumDate.
     * <p>
     * Field description:
     * Minimum date that the date picker can show. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @return minimumDate
     */
    @JsonProperty("minimumDate")
    public OffsetDateTime getMinimumDate() {
        return minimumDate;
    }

    /**
     * Sets minimumDate.
     * <p>
     * Field description:
     * Minimum date that the date picker can show. Has the following format: &#x60;YYYY-MM-DD&#x60;.
     *
     * @param minimumDate
     */
    @JsonProperty("minimumDate")
    public void setMinimumDate(OffsetDateTime minimumDate) {
        this.minimumDate = minimumDate;
    }

    /**
     * Sets dateLabel.
     * <p>
     * Field description:
     * Text to be shown next to the date field.
     *
     * @param dateLabel
     * @return This {@link MessagesApiMessageDatePickerFormPageOptions instance}.
     */
    public MessagesApiMessageDatePickerFormPageOptions dateLabel(String dateLabel) {
        this.dateLabel = dateLabel;
        return this;
    }

    /**
     * Returns dateLabel.
     * <p>
     * Field description:
     * Text to be shown next to the date field.
     *
     * @return dateLabel
     */
    @JsonProperty("dateLabel")
    public String getDateLabel() {
        return dateLabel;
    }

    /**
     * Sets dateLabel.
     * <p>
     * Field description:
     * Text to be shown next to the date field.
     *
     * @param dateLabel
     */
    @JsonProperty("dateLabel")
    public void setDateLabel(String dateLabel) {
        this.dateLabel = dateLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageDatePickerFormPageOptions messagesApiMessageDatePickerFormPageOptions =
                (MessagesApiMessageDatePickerFormPageOptions) o;
        return Objects.equals(this.dateFormat, messagesApiMessageDatePickerFormPageOptions.dateFormat)
                && Objects.equals(this.startDate, messagesApiMessageDatePickerFormPageOptions.startDate)
                && Objects.equals(this.maximumDate, messagesApiMessageDatePickerFormPageOptions.maximumDate)
                && Objects.equals(this.minimumDate, messagesApiMessageDatePickerFormPageOptions.minimumDate)
                && Objects.equals(this.dateLabel, messagesApiMessageDatePickerFormPageOptions.dateLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateFormat, startDate, maximumDate, minimumDate, dateLabel);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageDatePickerFormPageOptions {")
                .append(newLine)
                .append("    dateFormat: ")
                .append(toIndentedString(dateFormat))
                .append(newLine)
                .append("    startDate: ")
                .append(toIndentedString(startDate))
                .append(newLine)
                .append("    maximumDate: ")
                .append(toIndentedString(maximumDate))
                .append(newLine)
                .append("    minimumDate: ")
                .append(toIndentedString(minimumDate))
                .append(newLine)
                .append("    dateLabel: ")
                .append(toIndentedString(dateLabel))
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
