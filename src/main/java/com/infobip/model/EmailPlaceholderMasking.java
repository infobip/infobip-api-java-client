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
 * Options to full or partially mask placeholders.
 */
public class EmailPlaceholderMasking {

    private String name;

    private String side;

    private String maskChar;

    private Integer visibleChars;

    private String delimiter;

    private List<String> skipChars = null;

    /**
     * Sets name.
     * <p>
     * Field description:
     * The placeholder name that needs to be masked.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link EmailPlaceholderMasking instance}.
     */
    public EmailPlaceholderMasking name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * The placeholder name that needs to be masked.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * The placeholder name that needs to be masked.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets side.
     * <p>
     * Field description:
     * The side from which characters should be hidden. Options are &#x60;L&#x60; (left) or &#x60;R&#x60; (right).
     *
     * @param side
     * @return This {@link EmailPlaceholderMasking instance}.
     */
    public EmailPlaceholderMasking side(String side) {
        this.side = side;
        return this;
    }

    /**
     * Returns side.
     * <p>
     * Field description:
     * The side from which characters should be hidden. Options are &#x60;L&#x60; (left) or &#x60;R&#x60; (right).
     *
     * @return side
     */
    @JsonProperty("side")
    public String getSide() {
        return side;
    }

    /**
     * Sets side.
     * <p>
     * Field description:
     * The side from which characters should be hidden. Options are &#x60;L&#x60; (left) or &#x60;R&#x60; (right).
     *
     * @param side
     */
    @JsonProperty("side")
    public void setSide(String side) {
        this.side = side;
    }

    /**
     * Sets maskChar.
     * <p>
     * Field description:
     * The character used to replace the masked placeholders, e.g., &#x60;*&#x60;, &#x60;+&#x60;.
     *
     * @param maskChar
     * @return This {@link EmailPlaceholderMasking instance}.
     */
    public EmailPlaceholderMasking maskChar(String maskChar) {
        this.maskChar = maskChar;
        return this;
    }

    /**
     * Returns maskChar.
     * <p>
     * Field description:
     * The character used to replace the masked placeholders, e.g., &#x60;*&#x60;, &#x60;+&#x60;.
     *
     * @return maskChar
     */
    @JsonProperty("maskChar")
    public String getMaskChar() {
        return maskChar;
    }

    /**
     * Sets maskChar.
     * <p>
     * Field description:
     * The character used to replace the masked placeholders, e.g., &#x60;*&#x60;, &#x60;+&#x60;.
     *
     * @param maskChar
     */
    @JsonProperty("maskChar")
    public void setMaskChar(String maskChar) {
        this.maskChar = maskChar;
    }

    /**
     * Sets visibleChars.
     * <p>
     * Field description:
     * The number of characters to leave visible. Ignored if a delimiter is specified. Defaults to 0 (i.e., all characters hidden) if not specified.
     *
     * @param visibleChars
     * @return This {@link EmailPlaceholderMasking instance}.
     */
    public EmailPlaceholderMasking visibleChars(Integer visibleChars) {
        this.visibleChars = visibleChars;
        return this;
    }

    /**
     * Returns visibleChars.
     * <p>
     * Field description:
     * The number of characters to leave visible. Ignored if a delimiter is specified. Defaults to 0 (i.e., all characters hidden) if not specified.
     *
     * @return visibleChars
     */
    @JsonProperty("visibleChars")
    public Integer getVisibleChars() {
        return visibleChars;
    }

    /**
     * Sets visibleChars.
     * <p>
     * Field description:
     * The number of characters to leave visible. Ignored if a delimiter is specified. Defaults to 0 (i.e., all characters hidden) if not specified.
     *
     * @param visibleChars
     */
    @JsonProperty("visibleChars")
    public void setVisibleChars(Integer visibleChars) {
        this.visibleChars = visibleChars;
    }

    /**
     * Sets delimiter.
     * <p>
     * Field description:
     * Optional delimiter character (e.g., &#x60;@&#x60;, &#x60;/&#x60;). When specified, masking applies only to the part of the placeholder before or after the delimiter, depending on the &#x60;side&#x60; value. If this is set, the &#x60;visibleChars&#x60; field is ignored.
     *
     * @param delimiter
     * @return This {@link EmailPlaceholderMasking instance}.
     */
    public EmailPlaceholderMasking delimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Returns delimiter.
     * <p>
     * Field description:
     * Optional delimiter character (e.g., &#x60;@&#x60;, &#x60;/&#x60;). When specified, masking applies only to the part of the placeholder before or after the delimiter, depending on the &#x60;side&#x60; value. If this is set, the &#x60;visibleChars&#x60; field is ignored.
     *
     * @return delimiter
     */
    @JsonProperty("delimiter")
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets delimiter.
     * <p>
     * Field description:
     * Optional delimiter character (e.g., &#x60;@&#x60;, &#x60;/&#x60;). When specified, masking applies only to the part of the placeholder before or after the delimiter, depending on the &#x60;side&#x60; value. If this is set, the &#x60;visibleChars&#x60; field is ignored.
     *
     * @param delimiter
     */
    @JsonProperty("delimiter")
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Sets skipChars.
     * <p>
     * Field description:
     * A list of characters that should not be masked, even if they fall within the masked region. For example, if we want to mask &#x60;(385)-9134849&#x60; into &#x60;(***)-********&#x60;, we should include the characters &#x60;(&#x60;,&#x60;)&#x60; and &#x60;-&#x60; in this list to preserve the formatting. In this case, only digits will be masked while parentheses and dashes remain visible.
     *
     * @param skipChars
     * @return This {@link EmailPlaceholderMasking instance}.
     */
    public EmailPlaceholderMasking skipChars(List<String> skipChars) {
        this.skipChars = skipChars;
        return this;
    }

    /**
     * Adds and item into skipChars.
     * <p>
     * Field description:
     * A list of characters that should not be masked, even if they fall within the masked region. For example, if we want to mask &#x60;(385)-9134849&#x60; into &#x60;(***)-********&#x60;, we should include the characters &#x60;(&#x60;,&#x60;)&#x60; and &#x60;-&#x60; in this list to preserve the formatting. In this case, only digits will be masked while parentheses and dashes remain visible.
     *
     * @param skipCharsItem The item to be added to the list.
     * @return This {@link EmailPlaceholderMasking instance}.
     */
    public EmailPlaceholderMasking addSkipCharsItem(String skipCharsItem) {
        if (this.skipChars == null) {
            this.skipChars = new ArrayList<>();
        }
        this.skipChars.add(skipCharsItem);
        return this;
    }

    /**
     * Returns skipChars.
     * <p>
     * Field description:
     * A list of characters that should not be masked, even if they fall within the masked region. For example, if we want to mask &#x60;(385)-9134849&#x60; into &#x60;(***)-********&#x60;, we should include the characters &#x60;(&#x60;,&#x60;)&#x60; and &#x60;-&#x60; in this list to preserve the formatting. In this case, only digits will be masked while parentheses and dashes remain visible.
     *
     * @return skipChars
     */
    @JsonProperty("skipChars")
    public List<String> getSkipChars() {
        return skipChars;
    }

    /**
     * Sets skipChars.
     * <p>
     * Field description:
     * A list of characters that should not be masked, even if they fall within the masked region. For example, if we want to mask &#x60;(385)-9134849&#x60; into &#x60;(***)-********&#x60;, we should include the characters &#x60;(&#x60;,&#x60;)&#x60; and &#x60;-&#x60; in this list to preserve the formatting. In this case, only digits will be masked while parentheses and dashes remain visible.
     *
     * @param skipChars
     */
    @JsonProperty("skipChars")
    public void setSkipChars(List<String> skipChars) {
        this.skipChars = skipChars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailPlaceholderMasking emailPlaceholderMasking = (EmailPlaceholderMasking) o;
        return Objects.equals(this.name, emailPlaceholderMasking.name)
                && Objects.equals(this.side, emailPlaceholderMasking.side)
                && Objects.equals(this.maskChar, emailPlaceholderMasking.maskChar)
                && Objects.equals(this.visibleChars, emailPlaceholderMasking.visibleChars)
                && Objects.equals(this.delimiter, emailPlaceholderMasking.delimiter)
                && Objects.equals(this.skipChars, emailPlaceholderMasking.skipChars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, side, maskChar, visibleChars, delimiter, skipChars);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailPlaceholderMasking {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    side: ")
                .append(toIndentedString(side))
                .append(newLine)
                .append("    maskChar: ")
                .append(toIndentedString(maskChar))
                .append(newLine)
                .append("    visibleChars: ")
                .append(toIndentedString(visibleChars))
                .append(newLine)
                .append("    delimiter: ")
                .append(toIndentedString(delimiter))
                .append(newLine)
                .append("    skipChars: ")
                .append(toIndentedString(skipChars))
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
