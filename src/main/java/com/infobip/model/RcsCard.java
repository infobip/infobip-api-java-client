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
 * Represents RcsCard model.
 */
public class RcsCard {

    private String title;

    private String description;

    private String mediaUrl;

    private List<RcsSuggestedAction> actions;

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title of the rich card.
     *
     * @param title
     * @return This {@link RcsCard instance}.
     */
    public RcsCard title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title of the rich card.
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
     * Title of the rich card.
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
     * Description text of the rich card.
     *
     * @param description
     * @return This {@link RcsCard instance}.
     */
    public RcsCard description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description text of the rich card.
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
     * Description text of the rich card.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the media file for the card (image or video).
     *
     * @param mediaUrl
     * @return This {@link RcsCard instance}.
     */
    public RcsCard mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * Returns mediaUrl.
     * <p>
     * Field description:
     * URL of the media file for the card (image or video).
     *
     * @return mediaUrl
     */
    @JsonProperty("mediaUrl")
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * Sets mediaUrl.
     * <p>
     * Field description:
     * URL of the media file for the card (image or video).
     *
     * @param mediaUrl
     */
    @JsonProperty("mediaUrl")
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * Sets actions.
     * <p>
     * Field description:
     * List of actions for the card.
     *
     * @param actions
     * @return This {@link RcsCard instance}.
     */
    public RcsCard actions(List<RcsSuggestedAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Adds and item into actions.
     * <p>
     * Field description:
     * List of actions for the card.
     *
     * @param actionsItem The item to be added to the list.
     * @return This {@link RcsCard instance}.
     */
    public RcsCard addActionsItem(RcsSuggestedAction actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Returns actions.
     * <p>
     * Field description:
     * List of actions for the card.
     *
     * @return actions
     */
    @JsonProperty("actions")
    public List<RcsSuggestedAction> getActions() {
        return actions;
    }

    /**
     * Sets actions.
     * <p>
     * Field description:
     * List of actions for the card.
     *
     * @param actions
     */
    @JsonProperty("actions")
    public void setActions(List<RcsSuggestedAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCard rcsCard = (RcsCard) o;
        return Objects.equals(this.title, rcsCard.title)
                && Objects.equals(this.description, rcsCard.description)
                && Objects.equals(this.mediaUrl, rcsCard.mediaUrl)
                && Objects.equals(this.actions, rcsCard.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, mediaUrl, actions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCard {")
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    mediaUrl: ")
                .append(toIndentedString(mediaUrl))
                .append(newLine)
                .append("    actions: ")
                .append(toIndentedString(actions))
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
