/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "resourceType",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourcesAlphaCoverageInfo.class, name = "ALPHANUMERIC"),
    @JsonSubTypes.Type(value = ResourcesAppleCoverageInfo.class, name = "APPLE_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesFacebookCoverageInfo.class, name = "FACEBOOK_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesKakaoCoverageInfo.class, name = "KAKAO_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesNumberCoverageInfo.class, name = "NUMBER"),
    @JsonSubTypes.Type(value = ResourcesOpenChannelCoverageInfo.class, name = "OPEN_CHANNEL_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesRcsCoverageInfo.class, name = "RCS_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesViberCoverageInfo.class, name = "VIBER_RESOURCE")
})
public interface ResourcesIbResourceCoverageInfo {
    public ResourcesIbResourceType getResourceType();
}
