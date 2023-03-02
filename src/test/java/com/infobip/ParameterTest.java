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

class ParameterTest {

    @Test
    void shouldThrowNullPointerExceptionIfNameIsNull() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new Parameter(null, "Some value."));
    }

    @Test
    void shouldThrowNullPointerExceptionIfValueIsNull() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new Parameter("name", null));
    }

    @Test
    void shouldAssignGivenValueToTheParameter() {
        // given
        String givenName = "givenName";
        Object givenValue = "givenValue";

        // when
        Parameter parameter = new Parameter(givenName, givenValue);

        // then
        then(parameter.name()).isEqualTo(givenName);
        then(parameter.value()).isEqualTo(givenValue);
    }

    @Test
    void shouldRespectEqualsAndHashcode() {
        // given
        String givenName = "givenName";
        String givenAnotherName = "givenAnotherName";
        Object givenValue = "givenValue";

        // when
        Parameter parameter = new Parameter(givenName, givenValue);
        Parameter equalParameter = new Parameter(givenName, givenValue);
        Parameter notEqualParameter = new Parameter(givenAnotherName, givenValue);

        // then
        then(parameter).isEqualTo(equalParameter);
        then(parameter).hasSameHashCodeAs(equalParameter);
        then(parameter).isNotEqualTo(notEqualParameter);
        then(parameter).doesNotHaveSameHashCodeAs(notEqualParameter);
    }

    @Test
    void shouldOverrideToString() {
        // given
        String givenName = "givenName";
        Object givenValue = "givenValue";

        // when
        Parameter parameter = new Parameter(givenName, givenValue);

        // then
        then(parameter).hasToString(String.format("Parameter{name='%s', value='%s'}", givenName, givenValue));
    }
}
