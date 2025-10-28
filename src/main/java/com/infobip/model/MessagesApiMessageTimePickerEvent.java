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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Event with possible occurrences and location.
 */
public class MessagesApiMessageTimePickerEvent {

    private String title;

    private List<MessagesApiMessageTimePickerTimeslot> timeslots = new ArrayList<>();

    private MessagesApiMessageTimePickerLocation location;

    private String imageUrl;

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of event.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link MessagesApiMessageTimePickerEvent instance}.
     */
    public MessagesApiMessageTimePickerEvent title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of event.
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
     * Title of event.
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
     * Sets timeslots.
     * <p>
     * Field description:
     * Possible timeslots for event.
     * <p>
     * The field is required.
     *
     * @param timeslots
     * @return This {@link MessagesApiMessageTimePickerEvent instance}.
     */
    public MessagesApiMessageTimePickerEvent timeslots(List<MessagesApiMessageTimePickerTimeslot> timeslots) {
        this.timeslots = timeslots;
        return this;
    }

    /**
     * Adds and item into timeslots.
     * <p>
     * Field description:
     * Possible timeslots for event.
     * <p>
     * The field is required.
     *
     * @param timeslotsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageTimePickerEvent instance}.
     */
    public MessagesApiMessageTimePickerEvent addTimeslotsItem(MessagesApiMessageTimePickerTimeslot timeslotsItem) {
        if (this.timeslots == null) {
            this.timeslots = new ArrayList<>();
        }
        this.timeslots.add(timeslotsItem);
        return this;
    }

    /**
     * Returns timeslots.
     * <p>
     * Field description:
     * Possible timeslots for event.
     * <p>
     * The field is required.
     *
     * @return timeslots
     */
    @JsonProperty("timeslots")
    public List<MessagesApiMessageTimePickerTimeslot> getTimeslots() {
        return timeslots;
    }

    /**
     * Sets timeslots.
     * <p>
     * Field description:
     * Possible timeslots for event.
     * <p>
     * The field is required.
     *
     * @param timeslots
     */
    @JsonProperty("timeslots")
    public void setTimeslots(List<MessagesApiMessageTimePickerTimeslot> timeslots) {
        this.timeslots = timeslots;
    }

    /**
     * Sets location.
     *
     * @param location
     * @return This {@link MessagesApiMessageTimePickerEvent instance}.
     */
    public MessagesApiMessageTimePickerEvent location(MessagesApiMessageTimePickerLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Returns location.
     *
     * @return location
     */
    @JsonProperty("location")
    public MessagesApiMessageTimePickerLocation getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location
     */
    @JsonProperty("location")
    public void setLocation(MessagesApiMessageTimePickerLocation location) {
        this.location = location;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * URL of the event&#39;s image.
     *
     * @param imageUrl
     * @return This {@link MessagesApiMessageTimePickerEvent instance}.
     */
    public MessagesApiMessageTimePickerEvent imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Returns imageUrl.
     * <p>
     * Field description:
     * URL of the event&#39;s image.
     *
     * @return imageUrl
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * URL of the event&#39;s image.
     *
     * @param imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageTimePickerEvent messagesApiMessageTimePickerEvent = (MessagesApiMessageTimePickerEvent) o;
        return Objects.equals(this.title, messagesApiMessageTimePickerEvent.title)
                && Objects.equals(this.timeslots, messagesApiMessageTimePickerEvent.timeslots)
                && Objects.equals(this.location, messagesApiMessageTimePickerEvent.location)
                && Objects.equals(this.imageUrl, messagesApiMessageTimePickerEvent.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, timeslots, location, imageUrl);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageTimePickerEvent {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    timeslots: ")
                .append(toIndentedString(timeslots))
                .append(newLine)
                .append("    location: ")
                .append(toIndentedString(location))
                .append(newLine)
                .append("    imageUrl: ")
                .append(toIndentedString(imageUrl))
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
