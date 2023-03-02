/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.util.Objects;

/**
 * Represents a wrapper for Infobip API key.
 *
 * @see <a href="https://www.infobip.com/docs/essentials/api-authentication#api-key-header">Infobip API key header</a>
 */
public final class ApiKey {

    private static final String API_KEY_PREFIX = "App";

    private final String apiKeyHeaderValue;

    private ApiKey(String apiKey) {
        Objects.requireNonNull(apiKey);
        apiKeyHeaderValue = API_KEY_PREFIX + " " + apiKey;
    }

    /**
     * Creates an {@link ApiKey} instance for the given Infobip API key value.
     *
     * @param apiKey The given Infobip API key.
     * @return {@link ApiKey} wrapper around the given API key.
     * @throws NullPointerException if provided <code>apiKey</code> is null.
     * @see <a href="https://www.infobip.com/docs/essentials/api-authentication#api-key-header">Infobip API key header</a>
     */
    public static ApiKey from(String apiKey) {
        return new ApiKey(apiKey);
    }

    /**
     * Returns the Authorization header value for the Infobip API key authentication method.
     * <p>
     * The value is always in the format 'App apiKeyValue' where apiKeyValue is the provided Infobip API key value.
     *
     * @return The Authorization header value.
     * @see <a href="https://www.infobip.com/docs/essentials/api-authentication#api-key-header">Infobip API key header</a>
     */
    public String getAuthorizationHeaderValue() {
        return apiKeyHeaderValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiKey apiKey = (ApiKey) o;
        return apiKeyHeaderValue.equals(apiKey.apiKeyHeaderValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKeyHeaderValue);
    }

    @Override
    public String toString() {
        return "ApiKey{apiKeyHeaderValue='HIDDEN'}";
    }
}
