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
 * Represents FlowExceptionResponse model.
 */
public class FlowExceptionResponse {

    private String type;

    private String title;

    private Integer status;

    private String detail;

    private String instance;

    private Integer errorCode;

    private String errorMessage;

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link FlowExceptionResponse instance}.
     */
    public FlowExceptionResponse type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets title.
     * <p>
     * The field is required.
     *
     * @param title
     * @return This {@link FlowExceptionResponse instance}.
     */
    public FlowExceptionResponse title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
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
     * The field is required.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link FlowExceptionResponse instance}.
     */
    public FlowExceptionResponse status(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Sets detail.
     * <p>
     * The field is required.
     *
     * @param detail
     * @return This {@link FlowExceptionResponse instance}.
     */
    public FlowExceptionResponse detail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Returns detail.
     * <p>
     * The field is required.
     *
     * @return detail
     */
    @JsonProperty("detail")
    public String getDetail() {
        return detail;
    }

    /**
     * Sets detail.
     * <p>
     * The field is required.
     *
     * @param detail
     */
    @JsonProperty("detail")
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Sets instance.
     * <p>
     * The field is required.
     *
     * @param instance
     * @return This {@link FlowExceptionResponse instance}.
     */
    public FlowExceptionResponse instance(String instance) {
        this.instance = instance;
        return this;
    }

    /**
     * Returns instance.
     * <p>
     * The field is required.
     *
     * @return instance
     */
    @JsonProperty("instance")
    public String getInstance() {
        return instance;
    }

    /**
     * Sets instance.
     * <p>
     * The field is required.
     *
     * @param instance
     */
    @JsonProperty("instance")
    public void setInstance(String instance) {
        this.instance = instance;
    }

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
        return Objects.equals(this.type, flowExceptionResponse.type)
                && Objects.equals(this.title, flowExceptionResponse.title)
                && Objects.equals(this.status, flowExceptionResponse.status)
                && Objects.equals(this.detail, flowExceptionResponse.detail)
                && Objects.equals(this.instance, flowExceptionResponse.instance)
                && Objects.equals(this.errorCode, flowExceptionResponse.errorCode)
                && Objects.equals(this.errorMessage, flowExceptionResponse.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, title, status, detail, instance, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowExceptionResponse {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    detail: ")
                .append(toIndentedString(detail))
                .append(newLine)
                .append("    instance: ")
                .append(toIndentedString(instance))
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
