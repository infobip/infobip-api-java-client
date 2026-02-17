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
 * Represents CallsOpenAiProvider model.
 */
public class CallsOpenAiProvider extends CallsProvider {

    private String projectId;

    /**
     * Constructs a new {@link CallsOpenAiProvider} instance.
     */
    public CallsOpenAiProvider() {
        super("OPENAI_REALTIME");
    }

    /**
     * Sets projectId.
     * <p>
     * Field description:
     * OpenAI Realtime projectId
     * <p>
     * The field is required.
     *
     * @param projectId
     * @return This {@link CallsOpenAiProvider instance}.
     */
    public CallsOpenAiProvider projectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Returns projectId.
     * <p>
     * Field description:
     * OpenAI Realtime projectId
     * <p>
     * The field is required.
     *
     * @return projectId
     */
    @JsonProperty("projectId")
    public String getProjectId() {
        return projectId;
    }

    /**
     * Sets projectId.
     * <p>
     * Field description:
     * OpenAI Realtime projectId
     * <p>
     * The field is required.
     *
     * @param projectId
     */
    @JsonProperty("projectId")
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsOpenAiProvider callsOpenAiProvider = (CallsOpenAiProvider) o;
        return Objects.equals(this.projectId, callsOpenAiProvider.projectId) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsOpenAiProvider {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    projectId: ")
                .append(toIndentedString(projectId))
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
