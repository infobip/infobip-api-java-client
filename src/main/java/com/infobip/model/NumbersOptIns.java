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
 * Represents NumbersOptIns model.
 */
public class NumbersOptIns {

    private NumbersKeywordOptIn keyword;

    private NumbersWebOptIn web;

    private NumbersVerbalOptIn verbal;

    private NumbersInteractiveVoiceResponseOptIn interactiveVoiceResponse;

    /**
     * Sets keyword.
     *
     * @param keyword
     * @return This {@link NumbersOptIns instance}.
     */
    public NumbersOptIns keyword(NumbersKeywordOptIn keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * Returns keyword.
     *
     * @return keyword
     */
    @JsonProperty("keyword")
    public NumbersKeywordOptIn getKeyword() {
        return keyword;
    }

    /**
     * Sets keyword.
     *
     * @param keyword
     */
    @JsonProperty("keyword")
    public void setKeyword(NumbersKeywordOptIn keyword) {
        this.keyword = keyword;
    }

    /**
     * Sets web.
     *
     * @param web
     * @return This {@link NumbersOptIns instance}.
     */
    public NumbersOptIns web(NumbersWebOptIn web) {
        this.web = web;
        return this;
    }

    /**
     * Returns web.
     *
     * @return web
     */
    @JsonProperty("web")
    public NumbersWebOptIn getWeb() {
        return web;
    }

    /**
     * Sets web.
     *
     * @param web
     */
    @JsonProperty("web")
    public void setWeb(NumbersWebOptIn web) {
        this.web = web;
    }

    /**
     * Sets verbal.
     *
     * @param verbal
     * @return This {@link NumbersOptIns instance}.
     */
    public NumbersOptIns verbal(NumbersVerbalOptIn verbal) {
        this.verbal = verbal;
        return this;
    }

    /**
     * Returns verbal.
     *
     * @return verbal
     */
    @JsonProperty("verbal")
    public NumbersVerbalOptIn getVerbal() {
        return verbal;
    }

    /**
     * Sets verbal.
     *
     * @param verbal
     */
    @JsonProperty("verbal")
    public void setVerbal(NumbersVerbalOptIn verbal) {
        this.verbal = verbal;
    }

    /**
     * Sets interactiveVoiceResponse.
     *
     * @param interactiveVoiceResponse
     * @return This {@link NumbersOptIns instance}.
     */
    public NumbersOptIns interactiveVoiceResponse(NumbersInteractiveVoiceResponseOptIn interactiveVoiceResponse) {
        this.interactiveVoiceResponse = interactiveVoiceResponse;
        return this;
    }

    /**
     * Returns interactiveVoiceResponse.
     *
     * @return interactiveVoiceResponse
     */
    @JsonProperty("interactiveVoiceResponse")
    public NumbersInteractiveVoiceResponseOptIn getInteractiveVoiceResponse() {
        return interactiveVoiceResponse;
    }

    /**
     * Sets interactiveVoiceResponse.
     *
     * @param interactiveVoiceResponse
     */
    @JsonProperty("interactiveVoiceResponse")
    public void setInteractiveVoiceResponse(NumbersInteractiveVoiceResponseOptIn interactiveVoiceResponse) {
        this.interactiveVoiceResponse = interactiveVoiceResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersOptIns numbersOptIns = (NumbersOptIns) o;
        return Objects.equals(this.keyword, numbersOptIns.keyword)
                && Objects.equals(this.web, numbersOptIns.web)
                && Objects.equals(this.verbal, numbersOptIns.verbal)
                && Objects.equals(this.interactiveVoiceResponse, numbersOptIns.interactiveVoiceResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword, web, verbal, interactiveVoiceResponse);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersOptIns {")
                .append(newLine)
                .append("    keyword: ")
                .append(toIndentedString(keyword))
                .append(newLine)
                .append("    web: ")
                .append(toIndentedString(web))
                .append(newLine)
                .append("    verbal: ")
                .append(toIndentedString(verbal))
                .append(newLine)
                .append("    interactiveVoiceResponse: ")
                .append(toIndentedString(interactiveVoiceResponse))
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
