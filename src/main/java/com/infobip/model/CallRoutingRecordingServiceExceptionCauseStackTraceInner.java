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
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Objects;

/**
 * Represents CallRoutingRecordingServiceExceptionCauseStackTraceInner model.
 */
@JsonTypeName("CallRoutingRecordingServiceException_cause_stackTrace_inner")
public class CallRoutingRecordingServiceExceptionCauseStackTraceInner {

    private String classLoaderName;

    private String moduleName;

    private String moduleVersion;

    private String methodName;

    private String fileName;

    private Integer lineNumber;

    private String className;

    private Boolean nativeMethod;

    /**
     * Sets classLoaderName.
     *
     * @param classLoaderName
     * @return This {@link CallRoutingRecordingServiceExceptionCauseStackTraceInner instance}.
     */
    public CallRoutingRecordingServiceExceptionCauseStackTraceInner classLoaderName(String classLoaderName) {
        this.classLoaderName = classLoaderName;
        return this;
    }

    /**
     * Returns classLoaderName.
     *
     * @return classLoaderName
     */
    @JsonProperty("classLoaderName")
    public String getClassLoaderName() {
        return classLoaderName;
    }

    /**
     * Sets classLoaderName.
     *
     * @param classLoaderName
     */
    @JsonProperty("classLoaderName")
    public void setClassLoaderName(String classLoaderName) {
        this.classLoaderName = classLoaderName;
    }

    /**
     * Sets moduleName.
     *
     * @param moduleName
     * @return This {@link CallRoutingRecordingServiceExceptionCauseStackTraceInner instance}.
     */
    public CallRoutingRecordingServiceExceptionCauseStackTraceInner moduleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * Returns moduleName.
     *
     * @return moduleName
     */
    @JsonProperty("moduleName")
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Sets moduleName.
     *
     * @param moduleName
     */
    @JsonProperty("moduleName")
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    /**
     * Sets moduleVersion.
     *
     * @param moduleVersion
     * @return This {@link CallRoutingRecordingServiceExceptionCauseStackTraceInner instance}.
     */
    public CallRoutingRecordingServiceExceptionCauseStackTraceInner moduleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }

    /**
     * Returns moduleVersion.
     *
     * @return moduleVersion
     */
    @JsonProperty("moduleVersion")
    public String getModuleVersion() {
        return moduleVersion;
    }

    /**
     * Sets moduleVersion.
     *
     * @param moduleVersion
     */
    @JsonProperty("moduleVersion")
    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    /**
     * Sets methodName.
     *
     * @param methodName
     * @return This {@link CallRoutingRecordingServiceExceptionCauseStackTraceInner instance}.
     */
    public CallRoutingRecordingServiceExceptionCauseStackTraceInner methodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    /**
     * Returns methodName.
     *
     * @return methodName
     */
    @JsonProperty("methodName")
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets methodName.
     *
     * @param methodName
     */
    @JsonProperty("methodName")
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * Sets fileName.
     *
     * @param fileName
     * @return This {@link CallRoutingRecordingServiceExceptionCauseStackTraceInner instance}.
     */
    public CallRoutingRecordingServiceExceptionCauseStackTraceInner fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Returns fileName.
     *
     * @return fileName
     */
    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets fileName.
     *
     * @param fileName
     */
    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Sets lineNumber.
     *
     * @param lineNumber
     * @return This {@link CallRoutingRecordingServiceExceptionCauseStackTraceInner instance}.
     */
    public CallRoutingRecordingServiceExceptionCauseStackTraceInner lineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }

    /**
     * Returns lineNumber.
     *
     * @return lineNumber
     */
    @JsonProperty("lineNumber")
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets lineNumber.
     *
     * @param lineNumber
     */
    @JsonProperty("lineNumber")
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * Sets className.
     *
     * @param className
     * @return This {@link CallRoutingRecordingServiceExceptionCauseStackTraceInner instance}.
     */
    public CallRoutingRecordingServiceExceptionCauseStackTraceInner className(String className) {
        this.className = className;
        return this;
    }

    /**
     * Returns className.
     *
     * @return className
     */
    @JsonProperty("className")
    public String getClassName() {
        return className;
    }

    /**
     * Sets className.
     *
     * @param className
     */
    @JsonProperty("className")
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Sets nativeMethod.
     *
     * @param nativeMethod
     * @return This {@link CallRoutingRecordingServiceExceptionCauseStackTraceInner instance}.
     */
    public CallRoutingRecordingServiceExceptionCauseStackTraceInner nativeMethod(Boolean nativeMethod) {
        this.nativeMethod = nativeMethod;
        return this;
    }

    /**
     * Returns nativeMethod.
     *
     * @return nativeMethod
     */
    @JsonProperty("nativeMethod")
    public Boolean getNativeMethod() {
        return nativeMethod;
    }

    /**
     * Sets nativeMethod.
     *
     * @param nativeMethod
     */
    @JsonProperty("nativeMethod")
    public void setNativeMethod(Boolean nativeMethod) {
        this.nativeMethod = nativeMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingRecordingServiceExceptionCauseStackTraceInner
                callRoutingRecordingServiceExceptionCauseStackTraceInner =
                        (CallRoutingRecordingServiceExceptionCauseStackTraceInner) o;
        return Objects.equals(
                        this.classLoaderName, callRoutingRecordingServiceExceptionCauseStackTraceInner.classLoaderName)
                && Objects.equals(this.moduleName, callRoutingRecordingServiceExceptionCauseStackTraceInner.moduleName)
                && Objects.equals(
                        this.moduleVersion, callRoutingRecordingServiceExceptionCauseStackTraceInner.moduleVersion)
                && Objects.equals(this.methodName, callRoutingRecordingServiceExceptionCauseStackTraceInner.methodName)
                && Objects.equals(this.fileName, callRoutingRecordingServiceExceptionCauseStackTraceInner.fileName)
                && Objects.equals(this.lineNumber, callRoutingRecordingServiceExceptionCauseStackTraceInner.lineNumber)
                && Objects.equals(this.className, callRoutingRecordingServiceExceptionCauseStackTraceInner.className)
                && Objects.equals(
                        this.nativeMethod, callRoutingRecordingServiceExceptionCauseStackTraceInner.nativeMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                classLoaderName, moduleName, moduleVersion, methodName, fileName, lineNumber, className, nativeMethod);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingRecordingServiceExceptionCauseStackTraceInner {")
                .append(newLine)
                .append("    classLoaderName: ")
                .append(toIndentedString(classLoaderName))
                .append(newLine)
                .append("    moduleName: ")
                .append(toIndentedString(moduleName))
                .append(newLine)
                .append("    moduleVersion: ")
                .append(toIndentedString(moduleVersion))
                .append(newLine)
                .append("    methodName: ")
                .append(toIndentedString(methodName))
                .append(newLine)
                .append("    fileName: ")
                .append(toIndentedString(fileName))
                .append(newLine)
                .append("    lineNumber: ")
                .append(toIndentedString(lineNumber))
                .append(newLine)
                .append("    className: ")
                .append(toIndentedString(className))
                .append(newLine)
                .append("    nativeMethod: ")
                .append(toIndentedString(nativeMethod))
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
