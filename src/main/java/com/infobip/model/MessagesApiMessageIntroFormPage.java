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
 * Represents MessagesApiMessageIntroFormPage model.
 */
public class MessagesApiMessageIntroFormPage extends MessagesApiMessageFormPage {

    private String title;

    private String text;

    private String buttonText;

    private String imageUrl;

    /**
     * Constructs a new {@link MessagesApiMessageIntroFormPage} instance.
     */
    public MessagesApiMessageIntroFormPage() {
        super("INTRO");
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * If set, it displays in bold the title on the main page underneath the image.
     *
     * @param title
     * @return This {@link MessagesApiMessageIntroFormPage instance}.
     */
    public MessagesApiMessageIntroFormPage title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * If set, it displays in bold the title on the main page underneath the image.
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
     * If set, it displays in bold the title on the main page underneath the image.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * If set, displays additional text on the main page underneath the title.
     *
     * @param text
     * @return This {@link MessagesApiMessageIntroFormPage instance}.
     */
    public MessagesApiMessageIntroFormPage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * If set, displays additional text on the main page underneath the title.
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
     * If set, displays additional text on the main page underneath the title.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets buttonText.
     * <p>
     * Field description:
     * Text on the button shown on the main page. If missing then this view doesn&#39;t display and continues onto the first module.
     *
     * @param buttonText
     * @return This {@link MessagesApiMessageIntroFormPage instance}.
     */
    public MessagesApiMessageIntroFormPage buttonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    /**
     * Returns buttonText.
     * <p>
     * Field description:
     * Text on the button shown on the main page. If missing then this view doesn&#39;t display and continues onto the first module.
     *
     * @return buttonText
     */
    @JsonProperty("buttonText")
    public String getButtonText() {
        return buttonText;
    }

    /**
     * Sets buttonText.
     * <p>
     * Field description:
     * Text on the button shown on the main page. If missing then this view doesn&#39;t display and continues onto the first module.
     *
     * @param buttonText
     */
    @JsonProperty("buttonText")
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * Image to be shown at the top of the main page.
     *
     * @param imageUrl
     * @return This {@link MessagesApiMessageIntroFormPage instance}.
     */
    public MessagesApiMessageIntroFormPage imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Returns imageUrl.
     * <p>
     * Field description:
     * Image to be shown at the top of the main page.
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
     * Image to be shown at the top of the main page.
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
        MessagesApiMessageIntroFormPage messagesApiMessageIntroFormPage = (MessagesApiMessageIntroFormPage) o;
        return Objects.equals(this.title, messagesApiMessageIntroFormPage.title)
                && Objects.equals(this.text, messagesApiMessageIntroFormPage.text)
                && Objects.equals(this.buttonText, messagesApiMessageIntroFormPage.buttonText)
                && Objects.equals(this.imageUrl, messagesApiMessageIntroFormPage.imageUrl)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, buttonText, imageUrl, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageIntroFormPage {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    buttonText: ")
                .append(toIndentedString(buttonText))
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
