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
 * Request to create or register a new Viber message template.
 */
public class ViberTemplateRequest {

    private ViberTemplateCategory category;

    private List<ViberTemplateBody> body = new ArrayList<>();

    private List<ViberTemplateParam> params = null;

    /**
     * Sets category.
     * <p>
     * The field is required.
     *
     * @param category
     * @return This {@link ViberTemplateRequest instance}.
     */
    public ViberTemplateRequest category(ViberTemplateCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Returns category.
     * <p>
     * The field is required.
     *
     * @return category
     */
    @JsonProperty("category")
    public ViberTemplateCategory getCategory() {
        return category;
    }

    /**
     * Sets category.
     * <p>
     * The field is required.
     *
     * @param category
     */
    @JsonProperty("category")
    public void setCategory(ViberTemplateCategory category) {
        this.category = category;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * List of template bodies per language. Currently limited to one body per template.
     * <p>
     * The field is required.
     *
     * @param body
     * @return This {@link ViberTemplateRequest instance}.
     */
    public ViberTemplateRequest body(List<ViberTemplateBody> body) {
        this.body = body;
        return this;
    }

    /**
     * Adds and item into body.
     * <p>
     * Field description:
     * List of template bodies per language. Currently limited to one body per template.
     * <p>
     * The field is required.
     *
     * @param bodyItem The item to be added to the list.
     * @return This {@link ViberTemplateRequest instance}.
     */
    public ViberTemplateRequest addBodyItem(ViberTemplateBody bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    /**
     * Returns body.
     * <p>
     * Field description:
     * List of template bodies per language. Currently limited to one body per template.
     * <p>
     * The field is required.
     *
     * @return body
     */
    @JsonProperty("body")
    public List<ViberTemplateBody> getBody() {
        return body;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * List of template bodies per language. Currently limited to one body per template.
     * <p>
     * The field is required.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(List<ViberTemplateBody> body) {
        this.body = body;
    }

    /**
     * Sets params.
     * <p>
     * Field description:
     * List of variable parameters used in the template. Maximum 8 parameters allowed. For OTP category, at least one parameter with name &#39;{{pin}}&#39; is required.
     *
     * @param params
     * @return This {@link ViberTemplateRequest instance}.
     */
    public ViberTemplateRequest params(List<ViberTemplateParam> params) {
        this.params = params;
        return this;
    }

    /**
     * Adds and item into params.
     * <p>
     * Field description:
     * List of variable parameters used in the template. Maximum 8 parameters allowed. For OTP category, at least one parameter with name &#39;{{pin}}&#39; is required.
     *
     * @param paramsItem The item to be added to the list.
     * @return This {@link ViberTemplateRequest instance}.
     */
    public ViberTemplateRequest addParamsItem(ViberTemplateParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    /**
     * Returns params.
     * <p>
     * Field description:
     * List of variable parameters used in the template. Maximum 8 parameters allowed. For OTP category, at least one parameter with name &#39;{{pin}}&#39; is required.
     *
     * @return params
     */
    @JsonProperty("params")
    public List<ViberTemplateParam> getParams() {
        return params;
    }

    /**
     * Sets params.
     * <p>
     * Field description:
     * List of variable parameters used in the template. Maximum 8 parameters allowed. For OTP category, at least one parameter with name &#39;{{pin}}&#39; is required.
     *
     * @param params
     */
    @JsonProperty("params")
    public void setParams(List<ViberTemplateParam> params) {
        this.params = params;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberTemplateRequest viberTemplateRequest = (ViberTemplateRequest) o;
        return Objects.equals(this.category, viberTemplateRequest.category)
                && Objects.equals(this.body, viberTemplateRequest.body)
                && Objects.equals(this.params, viberTemplateRequest.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, body, params);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberTemplateRequest {")
                .append(newLine)
                .append("    category: ")
                .append(toIndentedString(category))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    params: ")
                .append(toIndentedString(params))
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
