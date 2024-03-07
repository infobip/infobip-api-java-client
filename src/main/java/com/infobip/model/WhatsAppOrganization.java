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
 * Contains information about contact&#39;s company.
 */
public class WhatsAppOrganization {

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
     * @return This {@link WhatsAppOrganization instance}.
     */
    public WhatsAppOrganization company(String company) {
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
     * Department name.
     *
     * @param department
     * @return This {@link WhatsAppOrganization instance}.
     */
    public WhatsAppOrganization department(String department) {
        this.department = department;
        return this;
    }

    /**
     * Returns department.
     * <p>
     * Field description:
     * Department name.
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
     * Department name.
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
     * Title value.
     *
     * @param title
     * @return This {@link WhatsAppOrganization instance}.
     */
    public WhatsAppOrganization title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Title value.
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
     * Title value.
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
        WhatsAppOrganization whatsAppOrganization = (WhatsAppOrganization) o;
        return Objects.equals(this.company, whatsAppOrganization.company)
                && Objects.equals(this.department, whatsAppOrganization.department)
                && Objects.equals(this.title, whatsAppOrganization.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, department, title);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppOrganization {")
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
