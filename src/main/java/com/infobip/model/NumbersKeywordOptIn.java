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
 * The type of opt in that requires a user to type in a keyword.
 */
public class NumbersKeywordOptIn {

    private String callToAction;

    private List<String> keywords = new ArrayList<>();

    /**
     * Sets callToAction.
     * <p>
     * Field description:
     *     The message sent to the user to tell them how to subscribe. Must include:     • Product description     • Message frequency disclosure     • Complete terms and conditions OR link to complete terms and conditions     • Privacy policy OR link to privacy policy     • STOP keyword     • The \&quot;Message and data rates may apply\&quot; disclosure
     * <p>
     * The field is required.
     *
     * @param callToAction
     * @return This {@link NumbersKeywordOptIn instance}.
     */
    public NumbersKeywordOptIn callToAction(String callToAction) {
        this.callToAction = callToAction;
        return this;
    }

    /**
     * Returns callToAction.
     * <p>
     * Field description:
     *     The message sent to the user to tell them how to subscribe. Must include:     • Product description     • Message frequency disclosure     • Complete terms and conditions OR link to complete terms and conditions     • Privacy policy OR link to privacy policy     • STOP keyword     • The \&quot;Message and data rates may apply\&quot; disclosure
     * <p>
     * The field is required.
     *
     * @return callToAction
     */
    @JsonProperty("callToAction")
    public String getCallToAction() {
        return callToAction;
    }

    /**
     * Sets callToAction.
     * <p>
     * Field description:
     *     The message sent to the user to tell them how to subscribe. Must include:     • Product description     • Message frequency disclosure     • Complete terms and conditions OR link to complete terms and conditions     • Privacy policy OR link to privacy policy     • STOP keyword     • The \&quot;Message and data rates may apply\&quot; disclosure
     * <p>
     * The field is required.
     *
     * @param callToAction
     */
    @JsonProperty("callToAction")
    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    /**
     * Sets keywords.
     * <p>
     * Field description:
     * The keyword(s) the user will text to subscribe. Keyword(s) must include only uppercase letters and numbers.
     * <p>
     * The field is required.
     *
     * @param keywords
     * @return This {@link NumbersKeywordOptIn instance}.
     */
    public NumbersKeywordOptIn keywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Adds and item into keywords.
     * <p>
     * Field description:
     * The keyword(s) the user will text to subscribe. Keyword(s) must include only uppercase letters and numbers.
     * <p>
     * The field is required.
     *
     * @param keywordsItem The item to be added to the list.
     * @return This {@link NumbersKeywordOptIn instance}.
     */
    public NumbersKeywordOptIn addKeywordsItem(String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    /**
     * Returns keywords.
     * <p>
     * Field description:
     * The keyword(s) the user will text to subscribe. Keyword(s) must include only uppercase letters and numbers.
     * <p>
     * The field is required.
     *
     * @return keywords
     */
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    /**
     * Sets keywords.
     * <p>
     * Field description:
     * The keyword(s) the user will text to subscribe. Keyword(s) must include only uppercase letters and numbers.
     * <p>
     * The field is required.
     *
     * @param keywords
     */
    @JsonProperty("keywords")
    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersKeywordOptIn numbersKeywordOptIn = (NumbersKeywordOptIn) o;
        return Objects.equals(this.callToAction, numbersKeywordOptIn.callToAction)
                && Objects.equals(this.keywords, numbersKeywordOptIn.keywords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callToAction, keywords);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersKeywordOptIn {")
                .append(newLine)
                .append("    callToAction: ")
                .append(toIndentedString(callToAction))
                .append(newLine)
                .append("    keywords: ")
                .append(toIndentedString(keywords))
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
