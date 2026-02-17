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
 * Opens the user&#39;s default web browser app to the specified URL.
 */
public class RcsOpenUrlSuggestion extends RcsSuggestion {

    private String text;

    private String postbackData;

    private String url;

    private RcsOpenUrlApplicationType application;

    private RcsWebviewViewModeType webviewViewMode;

    /**
     * Constructs a new {@link RcsOpenUrlSuggestion} instance.
     */
    public RcsOpenUrlSuggestion() {
        super("OPEN_URL");
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
     * @return This {@link RcsOpenUrlSuggestion instance}.
     */
    public RcsOpenUrlSuggestion text(String text) {
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
     * @return This {@link RcsOpenUrlSuggestion instance}.
     */
    public RcsOpenUrlSuggestion postbackData(String postbackData) {
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
     * Sets url.
     * <p>
     * Field description:
     * URL that will be opened on a mobile phone when the suggestion is selected. Must be a valid URI using the http or https scheme as defined in RFC 3986. Other URI schemes are not supported.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link RcsOpenUrlSuggestion instance}.
     */
    public RcsOpenUrlSuggestion url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL that will be opened on a mobile phone when the suggestion is selected. Must be a valid URI using the http or https scheme as defined in RFC 3986. Other URI schemes are not supported.
     * <p>
     * The field is required.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL that will be opened on a mobile phone when the suggestion is selected. Must be a valid URI using the http or https scheme as defined in RFC 3986. Other URI schemes are not supported.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets application.
     *
     * @param application
     * @return This {@link RcsOpenUrlSuggestion instance}.
     */
    public RcsOpenUrlSuggestion application(RcsOpenUrlApplicationType application) {
        this.application = application;
        return this;
    }

    /**
     * Returns application.
     *
     * @return application
     */
    @JsonProperty("application")
    public RcsOpenUrlApplicationType getApplication() {
        return application;
    }

    /**
     * Sets application.
     *
     * @param application
     */
    @JsonProperty("application")
    public void setApplication(RcsOpenUrlApplicationType application) {
        this.application = application;
    }

    /**
     * Sets webviewViewMode.
     *
     * @param webviewViewMode
     * @return This {@link RcsOpenUrlSuggestion instance}.
     */
    public RcsOpenUrlSuggestion webviewViewMode(RcsWebviewViewModeType webviewViewMode) {
        this.webviewViewMode = webviewViewMode;
        return this;
    }

    /**
     * Returns webviewViewMode.
     *
     * @return webviewViewMode
     */
    @JsonProperty("webviewViewMode")
    public RcsWebviewViewModeType getWebviewViewMode() {
        return webviewViewMode;
    }

    /**
     * Sets webviewViewMode.
     *
     * @param webviewViewMode
     */
    @JsonProperty("webviewViewMode")
    public void setWebviewViewMode(RcsWebviewViewModeType webviewViewMode) {
        this.webviewViewMode = webviewViewMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsOpenUrlSuggestion rcsOpenUrlSuggestion = (RcsOpenUrlSuggestion) o;
        return Objects.equals(this.text, rcsOpenUrlSuggestion.text)
                && Objects.equals(this.postbackData, rcsOpenUrlSuggestion.postbackData)
                && Objects.equals(this.url, rcsOpenUrlSuggestion.url)
                && Objects.equals(this.application, rcsOpenUrlSuggestion.application)
                && Objects.equals(this.webviewViewMode, rcsOpenUrlSuggestion.webviewViewMode)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, postbackData, url, application, webviewViewMode, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsOpenUrlSuggestion {")
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
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    application: ")
                .append(toIndentedString(application))
                .append(newLine)
                .append("    webviewViewMode: ")
                .append(toIndentedString(webviewViewMode))
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
