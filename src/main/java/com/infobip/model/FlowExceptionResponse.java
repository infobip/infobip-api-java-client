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
 * Response error codes  &lt;table&gt; &lt;tr&gt;&lt;th&gt;Error&lt;/th&gt;&lt;th&gt;ErrorCode&lt;/th&gt;&lt;th&gt;HTTP status&lt;/th&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Bad request&lt;/td&gt;&lt;td&gt;40001&lt;/td&gt;&lt;td&gt;400&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Duplicate person&lt;/td&gt;&lt;td&gt;40002&lt;/td&gt;&lt;td&gt;400&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Person manipulation failed&lt;/td&gt;&lt;td&gt;40003&lt;/td&gt;&lt;td&gt;400&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Person already in flow&lt;/td&gt;&lt;td&gt;40004&lt;/td&gt;&lt;td&gt;400&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Flow inactive&lt;/td&gt;&lt;td&gt;40005&lt;/td&gt;&lt;td&gt;400&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Person is not in the flow&lt;/td&gt;&lt;td&gt;40006&lt;/td&gt;&lt;td&gt;400&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Flow not found&lt;/td&gt;&lt;td&gt;40401&lt;/td&gt;&lt;td&gt;404&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Person not found&lt;/td&gt;&lt;td&gt;40402&lt;/td&gt;&lt;td&gt;404&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Action not found&lt;/td&gt;&lt;td&gt;40403&lt;/td&gt;&lt;td&gt;404&lt;/td&gt;&lt;/tr&gt; &lt;tr&gt;&lt;td&gt;Internal server error&lt;/td&gt;&lt;td&gt;50001&lt;/td&gt;&lt;td&gt;500&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt;
 */
public class FlowExceptionResponse {

    private Integer errorCode;

    private String errorMessage;

    /**
     * Sets errorCode.
     *
     * @param errorCode
     * @return This {@link FlowExceptionResponse instance}.
     */
    public FlowExceptionResponse errorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Sets errorMessage.
     *
     * @param errorMessage
     * @return This {@link FlowExceptionResponse instance}.
     */
    public FlowExceptionResponse errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Returns errorMessage.
     *
     * @return errorMessage
     */
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets errorMessage.
     *
     * @param errorMessage
     */
    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowExceptionResponse flowExceptionResponse = (FlowExceptionResponse) o;
        return Objects.equals(this.errorCode, flowExceptionResponse.errorCode)
                && Objects.equals(this.errorMessage, flowExceptionResponse.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMessage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowExceptionResponse {")
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
                .append(newLine)
                .append("    errorMessage: ")
                .append(toIndentedString(errorMessage))
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
