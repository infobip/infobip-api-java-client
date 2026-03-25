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
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ResourcesAlphaWebhookNotifApiDoc.class, name = "ALPHANUMERIC_REGISTRATION"),
    @JsonSubTypes.Type(value = ResourcesNumberWebhookNotifApiDoc.class, name = "NUMBER_PURCHASE"),
    @JsonSubTypes.Type(value = ResourcesRcsWebhookNotifApiDoc.class, name = "RCS_SENDER_LAUNCH")
})
public interface ResourcesWebhookNotifApiDocResultContent {
    public ResourcesWebhookNotifContentType getType();
}
