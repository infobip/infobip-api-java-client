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
 * List of feedback for requirements.
 */
public class ResourcesFilledRequirementFeedback {

    private String key;

    private ResourcesFeedbackCode code;

    private String feedback;

    /**
     * Sets key.
     * <p>
     * Field description:
     * Key of the requirement for which feedback is provided.
     *
     * @param key
     * @return This {@link ResourcesFilledRequirementFeedback instance}.
     */
    public ResourcesFilledRequirementFeedback key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns key.
     * <p>
     * Field description:
     * Key of the requirement for which feedback is provided.
     *
     * @return key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Key of the requirement for which feedback is provided.
     *
     * @param key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets code.
     *
     * @param code
     * @return This {@link ResourcesFilledRequirementFeedback instance}.
     */
    public ResourcesFilledRequirementFeedback code(ResourcesFeedbackCode code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     *
     * @return code
     */
    @JsonProperty("code")
    public ResourcesFeedbackCode getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code
     */
    @JsonProperty("code")
    public void setCode(ResourcesFeedbackCode code) {
        this.code = code;
    }

    /**
     * Sets feedback.
     * <p>
     * Field description:
     * Feedback for the requirement.
     *
     * @param feedback
     * @return This {@link ResourcesFilledRequirementFeedback instance}.
     */
    public ResourcesFilledRequirementFeedback feedback(String feedback) {
        this.feedback = feedback;
        return this;
    }

    /**
     * Returns feedback.
     * <p>
     * Field description:
     * Feedback for the requirement.
     *
     * @return feedback
     */
    @JsonProperty("feedback")
    public String getFeedback() {
        return feedback;
    }

    /**
     * Sets feedback.
     * <p>
     * Field description:
     * Feedback for the requirement.
     *
     * @param feedback
     */
    @JsonProperty("feedback")
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesFilledRequirementFeedback resourcesFilledRequirementFeedback = (ResourcesFilledRequirementFeedback) o;
        return Objects.equals(this.key, resourcesFilledRequirementFeedback.key)
                && Objects.equals(this.code, resourcesFilledRequirementFeedback.code)
                && Objects.equals(this.feedback, resourcesFilledRequirementFeedback.feedback);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, code, feedback);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesFilledRequirementFeedback {")
                .append(newLine)
                .append("    key: ")
                .append(toIndentedString(key))
                .append(newLine)
                .append("    code: ")
                .append(toIndentedString(code))
                .append(newLine)
                .append("    feedback: ")
                .append(toIndentedString(feedback))
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
