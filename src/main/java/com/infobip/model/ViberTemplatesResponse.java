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
 * List of templates per page.
 */
public class ViberTemplatesResponse {

    private List<ViberTemplateResponseNoDates> templates = new ArrayList<>();

    private PageInfo paging;

    /**
     * Sets templates.
     * <p>
     * Field description:
     * List of templates for requested page.
     * <p>
     * The field is required.
     *
     * @param templates
     * @return This {@link ViberTemplatesResponse instance}.
     */
    public ViberTemplatesResponse templates(List<ViberTemplateResponseNoDates> templates) {
        this.templates = templates;
        return this;
    }

    /**
     * Adds and item into templates.
     * <p>
     * Field description:
     * List of templates for requested page.
     * <p>
     * The field is required.
     *
     * @param templatesItem The item to be added to the list.
     * @return This {@link ViberTemplatesResponse instance}.
     */
    public ViberTemplatesResponse addTemplatesItem(ViberTemplateResponseNoDates templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    /**
     * Returns templates.
     * <p>
     * Field description:
     * List of templates for requested page.
     * <p>
     * The field is required.
     *
     * @return templates
     */
    @JsonProperty("templates")
    public List<ViberTemplateResponseNoDates> getTemplates() {
        return templates;
    }

    /**
     * Sets templates.
     * <p>
     * Field description:
     * List of templates for requested page.
     * <p>
     * The field is required.
     *
     * @param templates
     */
    @JsonProperty("templates")
    public void setTemplates(List<ViberTemplateResponseNoDates> templates) {
        this.templates = templates;
    }

    /**
     * Sets paging.
     *
     * @param paging
     * @return This {@link ViberTemplatesResponse instance}.
     */
    public ViberTemplatesResponse paging(PageInfo paging) {
        this.paging = paging;
        return this;
    }

    /**
     * Returns paging.
     *
     * @return paging
     */
    @JsonProperty("paging")
    public PageInfo getPaging() {
        return paging;
    }

    /**
     * Sets paging.
     *
     * @param paging
     */
    @JsonProperty("paging")
    public void setPaging(PageInfo paging) {
        this.paging = paging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberTemplatesResponse viberTemplatesResponse = (ViberTemplatesResponse) o;
        return Objects.equals(this.templates, viberTemplatesResponse.templates)
                && Objects.equals(this.paging, viberTemplatesResponse.paging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templates, paging);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberTemplatesResponse {")
                .append(newLine)
                .append("    templates: ")
                .append(toIndentedString(templates))
                .append(newLine)
                .append("    paging: ")
                .append(toIndentedString(paging))
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
