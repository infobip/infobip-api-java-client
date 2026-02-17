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
 * Opens the user&#39;s default calendar app and starts the new calendar event flow with the agent-specified event data pre-filled.
 */
public class RcsCreateCalendarEventSuggestion extends RcsSuggestion {

    private String text;

    private String postbackData;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private String title;

    private String description;

    /**
     * Constructs a new {@link RcsCreateCalendarEventSuggestion} instance.
     */
    public RcsCreateCalendarEventSuggestion() {
        super("CREATE_CALENDAR_EVENT");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Suggestion text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link RcsCreateCalendarEventSuggestion instance}.
     */
    public RcsCreateCalendarEventSuggestion text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Suggestion text.
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
     * Suggestion text.
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
     * Sets postbackData.
     * <p>
     * Field description:
     * Value which is going to be sent as a reply to a suggestion.
     * <p>
     * The field is required.
     *
     * @param postbackData
     * @return This {@link RcsCreateCalendarEventSuggestion instance}.
     */
    public RcsCreateCalendarEventSuggestion postbackData(String postbackData) {
        this.postbackData = postbackData;
        return this;
    }

    /**
     * Returns postbackData.
     * <p>
     * Field description:
     * Value which is going to be sent as a reply to a suggestion.
     * <p>
     * The field is required.
     *
     * @return postbackData
     */
    @JsonProperty("postbackData")
    public String getPostbackData() {
        return postbackData;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Value which is going to be sent as a reply to a suggestion.
     * <p>
     * The field is required.
     *
     * @param postbackData
     */
    @JsonProperty("postbackData")
    public void setPostbackData(String postbackData) {
        this.postbackData = postbackData;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * The date and time when the event starts.&lt;br/&gt;It must be in the future and before &#x60;endTime&#x60;. The required format is &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60; (for example, &#x60;2030-03-03T15:00:00.000+01:00&#x60;).&lt;br/&gt;The displayed &#x60;startTime&#x60; may be affected by the device&#39;s default time zone.&lt;br/&gt;For best practices on date formats, refer to our [documentation](https://www.infobip.com/docs/essentials/api-essentials/integration-best-practices#date-formats-backward-compatibility).
     * <p>
     * The field is required.
     *
     * @param startTime
     * @return This {@link RcsCreateCalendarEventSuggestion instance}.
     */
    public RcsCreateCalendarEventSuggestion startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * The date and time when the event starts.&lt;br/&gt;It must be in the future and before &#x60;endTime&#x60;. The required format is &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60; (for example, &#x60;2030-03-03T15:00:00.000+01:00&#x60;).&lt;br/&gt;The displayed &#x60;startTime&#x60; may be affected by the device&#39;s default time zone.&lt;br/&gt;For best practices on date formats, refer to our [documentation](https://www.infobip.com/docs/essentials/api-essentials/integration-best-practices#date-formats-backward-compatibility).
     * <p>
     * The field is required.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * The date and time when the event starts.&lt;br/&gt;It must be in the future and before &#x60;endTime&#x60;. The required format is &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60; (for example, &#x60;2030-03-03T15:00:00.000+01:00&#x60;).&lt;br/&gt;The displayed &#x60;startTime&#x60; may be affected by the device&#39;s default time zone.&lt;br/&gt;For best practices on date formats, refer to our [documentation](https://www.infobip.com/docs/essentials/api-essentials/integration-best-practices#date-formats-backward-compatibility).
     * <p>
     * The field is required.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * The date and time when the event ends.&lt;br/&gt;It must be in the future and after &#x60;startTime&#x60;. The required format is &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60; (for example, &#x60;2030-03-03T17:00:00.000+01:00&#x60;).&lt;br/&gt;The displayed &#x60;endTime&#x60; may be affected by the device&#39;s default time zone.&lt;br/&gt;For best practices on date formats, refer to our [documentation](https://www.infobip.com/docs/essentials/api-essentials/integration-best-practices#date-formats-backward-compatibility).
     * <p>
     * The field is required.
     *
     * @param endTime
     * @return This {@link RcsCreateCalendarEventSuggestion instance}.
     */
    public RcsCreateCalendarEventSuggestion endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * The date and time when the event ends.&lt;br/&gt;It must be in the future and after &#x60;startTime&#x60;. The required format is &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60; (for example, &#x60;2030-03-03T17:00:00.000+01:00&#x60;).&lt;br/&gt;The displayed &#x60;endTime&#x60; may be affected by the device&#39;s default time zone.&lt;br/&gt;For best practices on date formats, refer to our [documentation](https://www.infobip.com/docs/essentials/api-essentials/integration-best-practices#date-formats-backward-compatibility).
     * <p>
     * The field is required.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * The date and time when the event ends.&lt;br/&gt;It must be in the future and after &#x60;startTime&#x60;. The required format is &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60; (for example, &#x60;2030-03-03T17:00:00.000+01:00&#x60;).&lt;br/&gt;The displayed &#x60;endTime&#x60; may be affected by the device&#39;s default time zone.&lt;br/&gt;For best practices on date formats, refer to our [documentation](https://www.infobip.com/docs/essentials/api-essentials/integration-best-practices#date-formats-backward-compatibility).
     * <p>
     * The field is required.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Event title.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link RcsCreateCalendarEventSuggestion instance}.
     */
    public RcsCreateCalendarEventSuggestion title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Event title.
     * <p>
     * The field is required.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Event title.
     * <p>
     * The field is required.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Event description.
     *
     * @param description
     * @return This {@link RcsCreateCalendarEventSuggestion instance}.
     */
    public RcsCreateCalendarEventSuggestion description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Event description.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Event description.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCreateCalendarEventSuggestion rcsCreateCalendarEventSuggestion = (RcsCreateCalendarEventSuggestion) o;
        return Objects.equals(this.text, rcsCreateCalendarEventSuggestion.text)
                && Objects.equals(this.postbackData, rcsCreateCalendarEventSuggestion.postbackData)
                && Objects.equals(this.startTime, rcsCreateCalendarEventSuggestion.startTime)
                && Objects.equals(this.endTime, rcsCreateCalendarEventSuggestion.endTime)
                && Objects.equals(this.title, rcsCreateCalendarEventSuggestion.title)
                && Objects.equals(this.description, rcsCreateCalendarEventSuggestion.description)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, postbackData, startTime, endTime, title, description, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCreateCalendarEventSuggestion {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    postbackData: ")
                .append(toIndentedString(postbackData))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
