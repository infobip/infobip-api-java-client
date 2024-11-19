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
 * Represents MessagesApiMessageStickerBody model.
 */
public class MessagesApiMessageStickerBody extends MessagesApiMessageBody {

    private String reference;

    /**
     * Constructs a new {@link MessagesApiMessageStickerBody} instance.
     */
    public MessagesApiMessageStickerBody() {
        super("STICKER");
    }

    /**
     * Sets reference.
     * <p>
     * Field description:
     * Unique reference to the sticker. It can be URL or identifier. If it is URL, resource should be of WebP type.
     * <p>
     * The field is required.
     *
     * @param reference
     * @return This {@link MessagesApiMessageStickerBody instance}.
     */
    public MessagesApiMessageStickerBody reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Returns reference.
     * <p>
     * Field description:
     * Unique reference to the sticker. It can be URL or identifier. If it is URL, resource should be of WebP type.
     * <p>
     * The field is required.
     *
     * @return reference
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * Sets reference.
     * <p>
     * Field description:
     * Unique reference to the sticker. It can be URL or identifier. If it is URL, resource should be of WebP type.
     * <p>
     * The field is required.
     *
     * @param reference
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageStickerBody messagesApiMessageStickerBody = (MessagesApiMessageStickerBody) o;
        return Objects.equals(this.reference, messagesApiMessageStickerBody.reference) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageStickerBody {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    reference: ")
                .append(toIndentedString(reference))
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
