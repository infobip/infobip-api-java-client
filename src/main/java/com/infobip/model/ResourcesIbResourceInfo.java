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
    @JsonSubTypes.Type(value = ResourcesAlphaResourceInfo.class, name = "ALPHANUMERIC"),
    @JsonSubTypes.Type(value = ResourcesAppleResourceInfo.class, name = "APPLE_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesNumberResourceInfo.class, name = "NUMBER"),
    @JsonSubTypes.Type(value = ResourcesOpenChannelResourceInfo.class, name = "OPEN_CHANNEL_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesRcsResourceInfo.class, name = "RCS_RESOURCE"),
    @JsonSubTypes.Type(value = ResourcesViberResourceInfo.class, name = "VIBER_RESOURCE")
})
public interface ResourcesIbResourceInfo {
    public ResourcesIbResourceType getResourceType();
}
