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
 * Organization information.
 */
public class WhatsAppWebhookOrganization {

    private String company;

    private String department;

    private String title;

    /**
     * Sets company.
     * <p>
     * Field description:
     * Company name.
     *
     * @param company
     * @return This {@link WhatsAppWebhookOrganization instance}.
     */
    public WhatsAppWebhookOrganization company(String company) {
        this.company = company;
        return this;
    }

    /**
     * Returns company.
     * <p>
     * Field description:
     * Company name.
     *
     * @return company
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * Sets company.
     * <p>
     * Field description:
     * Company name.
     *
     * @param company
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Sets department.
     * <p>
     * Field description:
     * Description name.
     *
     * @param department
     * @return This {@link WhatsAppWebhookOrganization instance}.
     */
    public WhatsAppWebhookOrganization department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Returns department.
     * <p>
     * Field description:
     * Description name.
     *
     * @return department
     */
    @JsonProperty("department")
    public String getDepartment() {
        return department;
    }

    /**
     * Sets department.
     * <p>
     * Field description:
     * Description name.
     *
     * @param department
     */
    @JsonProperty("department")
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Title.
     *
     * @param title
     * @return This {@link WhatsAppWebhookOrganization instance}.
     */
    public WhatsAppWebhookOrganization title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title.
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
     * Title.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWebhookOrganization whatsAppWebhookOrganization = (WhatsAppWebhookOrganization) o;
        return Objects.equals(this.company, whatsAppWebhookOrganization.company)
                && Objects.equals(this.department, whatsAppWebhookOrganization.department)
                && Objects.equals(this.title, whatsAppWebhookOrganization.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, department, title);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWebhookOrganization {")
                .append(newLine)
                .append("    company: ")
                .append(toIndentedString(company))
                .append(newLine)
                .append("    department: ")
                .append(toIndentedString(department))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
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
