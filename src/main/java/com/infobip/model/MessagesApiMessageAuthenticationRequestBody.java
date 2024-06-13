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
 * Represents MessagesApiMessageAuthenticationRequestBody model.
 */
public class MessagesApiMessageAuthenticationRequestBody extends MessagesApiMessageBody {

    private String text;

    private List<String> scopes = null;

    private String imageUrl;

    /**
     * Constructs a new {@link MessagesApiMessageAuthenticationRequestBody} instance.
     */
    public MessagesApiMessageAuthenticationRequestBody() {
        super("AUTHENTICATION_REQUEST");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageAuthenticationRequestBody instance}.
     */
    public MessagesApiMessageAuthenticationRequestBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be sent.
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
     * Text to be sent.
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
     * Sets scopes.
     * <p>
     * Field description:
     * Array that specifies the scopes of the request.
     *
     * @param scopes
     * @return This {@link MessagesApiMessageAuthenticationRequestBody instance}.
     */
    public MessagesApiMessageAuthenticationRequestBody scopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Adds and item into scopes.
     * <p>
     * Field description:
     * Array that specifies the scopes of the request.
     *
     * @param scopesItem The item to be added to the list.
     * @return This {@link MessagesApiMessageAuthenticationRequestBody instance}.
     */
    public MessagesApiMessageAuthenticationRequestBody addScopesItem(String scopesItem) {
        if (this.scopes == null) {
            this.scopes = new ArrayList<>();
        }
        this.scopes.add(scopesItem);
        return this;
    }

    /**
     * Returns scopes.
     * <p>
     * Field description:
     * Array that specifies the scopes of the request.
     *
     * @return scopes
     */
    @JsonProperty("scopes")
    public List<String> getScopes() {
        return scopes;
    }

    /**
     * Sets scopes.
     * <p>
     * Field description:
     * Array that specifies the scopes of the request.
     *
     * @param scopes
     */
    @JsonProperty("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    /**
     * Sets imageUrl.
     * <p>
     * Field description:
     * URL of the image.
     *
     * @param imageUrl
     * @return This {@link MessagesApiMessageAuthenticationRequestBody instance}.
     */
    public MessagesApiMessageAuthenticationRequestBody imageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Returns imageUrl.
     * <p>
     * Field description:
     * URL of the image.
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
     * URL of the image.
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
        MessagesApiMessageAuthenticationRequestBody messagesApiMessageAuthenticationRequestBody =
                (MessagesApiMessageAuthenticationRequestBody) o;
        return Objects.equals(this.text, messagesApiMessageAuthenticationRequestBody.text)
                && Objects.equals(this.scopes, messagesApiMessageAuthenticationRequestBody.scopes)
                && Objects.equals(this.imageUrl, messagesApiMessageAuthenticationRequestBody.imageUrl)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, scopes, imageUrl, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageAuthenticationRequestBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    scopes: ")
                .append(toIndentedString(scopes))
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
