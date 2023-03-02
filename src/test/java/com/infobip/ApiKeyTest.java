/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.api.BDDAssertions.thenNullPointerException;

import org.junit.jupiter.api.Test;

public final class ApiKeyTest {

    @Test
    void shouldThrowNullPointerExceptionIfProvidedApiKeyIsNull() {
        // when, then
        thenNullPointerException().isThrownBy(() -> ApiKey.from(null));
    }

    @Test
    void shouldReportCorrectAuthorizationHeaderValue() {
        // given
        String givenApiKey = "givenApiKeyValue";

        // when
        ApiKey apiKey = ApiKey.from(givenApiKey);
        String authorizationHeaderValue = apiKey.getAuthorizationHeaderValue();

        // then
        String expectedAuthorizationHeaderValue = "App " + givenApiKey;
        then(authorizationHeaderValue).isEqualTo(expectedAuthorizationHeaderValue);
    }

    @Test
    void shouldRespectEqualsAndHashCodeContract() {
        // given
        String givenApiKey = "apiKey";
        String givenAnotherApiKey = "anotherApiKey";

        // when
        ApiKey apiKey = ApiKey.from(givenApiKey);
        ApiKey equalApiKey = ApiKey.from(givenApiKey);
        ApiKey notEqualApiKey = ApiKey.from(givenAnotherApiKey);

        // then
        then(apiKey).isEqualTo(equalApiKey);
        then(apiKey).hasSameHashCodeAs(equalApiKey);
        then(apiKey).isNotEqualTo(notEqualApiKey);
        then(apiKey).doesNotHaveSameHashCodeAs(notEqualApiKey);
    }

    @Test
    void shouldOverrideToString() {
        // given
        String givenApiKeyThatShouldBeHidden = "apiKeyToBeHidden";

        // when
        ApiKey apiKey = ApiKey.from(givenApiKeyThatShouldBeHidden);

        // then
        then(apiKey).hasToString("ApiKey{apiKeyHeaderValue='HIDDEN'}");
        then(apiKey.toString()).doesNotContain(givenApiKeyThatShouldBeHidden);
    }
}
