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

import java.io.File;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Stream;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class RequestDefinitionTest {

    @Test
    void shouldBuildRequestDefinitionWithMethodAndPathOnly() {
        // given
        String givenMethod = "GET";
        String givenPath = "/test";

        // when
        RequestDefinition requestDefinition =
                RequestDefinition.builder(givenMethod, givenPath).build();

        // then
        then(requestDefinition.method()).isEqualTo(givenMethod);
        then(requestDefinition.path()).isEqualTo(givenPath);
        then(requestDefinition.pathParameters()).isEmpty();
        then(requestDefinition.queryParameters()).isEmpty();
        then(requestDefinition.headerParameters()).isEmpty();
        then(requestDefinition.formParameters()).isEmpty();
        then(requestDefinition.body()).isEmpty();
        then(requestDefinition.requiresAuthentication()).isFalse();
        then(requestDefinition.accept()).isEmpty();
        then(requestDefinition.contentType()).isEmpty();
    }

    @Test
    void shouldBuildRequestDefinitionWithFullData(@TempDir File tempDir) {
        // given
        String givenMethod = "GET";
        String givenPath = "/test";
        String givenPathParameter = "pathParameter";
        String givenPathParameterValue = "pathParameterValue";
        String givenAnotherPathParameter = "anotherPathParameter";
        String givenAnotherPathParameterValue = "anotherPathParameterValue";
        String givenQueryParameter = "queryParameter";
        OffsetDateTime givenQueryParameterValue = OffsetDateTime.now();
        String givenAnotherQueryParameter = "givenAnotherQueryParameter";
        int givenAnotherQueryParameterValue = 100;
        String givenHeaderParameter = "givenHeaderParameter";
        String givenHeaderParameterValue = "givenHeaderParameterValue";
        String givenAnotherHeaderParameter = "givenAnotherHeaderParameter";
        List<String> givenAnotherHeaderParameterValue = List.of("givenAnotherHeaderParameterValue");
        String givenFormParameter = "formParameter";
        String givenFormParameterValue = "formParameter";
        String givenAnotherFormParameter = "anotherFormParameter";
        String givenRequestBody = "givenRequestBody";
        String givenAccept = "application/json";
        String givenContentType = "text/plain";

        // when
        RequestDefinition requestDefinition = RequestDefinition.builder(givenMethod, givenPath)
                .addPathParameter(new Parameter(givenPathParameter, givenPathParameterValue))
                .addPathParameter(new Parameter(givenAnotherPathParameter, givenAnotherPathParameterValue))
                .addQueryParameter(new Parameter(givenQueryParameter, givenQueryParameterValue))
                .addQueryParameter(new Parameter(givenAnotherQueryParameter, givenAnotherQueryParameterValue))
                .addHeaderParameter(new Parameter(givenHeaderParameter, givenHeaderParameterValue))
                .addHeaderParameter(new Parameter(givenAnotherHeaderParameter, givenAnotherHeaderParameterValue))
                .addFormParameter(new Parameter(givenFormParameter, givenFormParameterValue))
                .addFormParameter(new Parameter(givenAnotherFormParameter, tempDir))
                .body(givenRequestBody)
                .requiresAuthentication(true)
                .accept(givenAccept)
                .contentType(givenContentType)
                .build();

        // then
        then(requestDefinition.method()).isEqualTo(givenMethod);
        then(requestDefinition.path()).isEqualTo(givenPath);
        then(requestDefinition.pathParameters())
                .containsExactly(
                        new Parameter(givenPathParameter, givenPathParameterValue),
                        new Parameter(givenAnotherPathParameter, givenAnotherPathParameterValue));
        then(requestDefinition.queryParameters())
                .containsExactly(
                        new Parameter(givenQueryParameter, givenQueryParameterValue),
                        new Parameter(givenAnotherQueryParameter, givenAnotherQueryParameterValue));
        then(requestDefinition.headerParameters())
                .containsExactly(
                        new Parameter(givenHeaderParameter, givenHeaderParameterValue),
                        new Parameter(givenAnotherHeaderParameter, givenAnotherHeaderParameterValue));
        then(requestDefinition.formParameters())
                .containsExactly(
                        new Parameter(givenFormParameter, givenFormParameterValue),
                        new Parameter(givenAnotherFormParameter, tempDir));
        then(requestDefinition.body()).contains(givenRequestBody);
        then(requestDefinition.requiresAuthentication()).isTrue();
        then(requestDefinition.accept()).contains(givenAccept);
        then(requestDefinition.contentType()).contains(givenContentType);
    }

    @Test
    void shouldRespectEqualsAndHashcode() {
        // when
        RequestDefinition requestDefinition =
                RequestDefinition.builder("GET", "/test").build();
        RequestDefinition equalRequestDefinition =
                RequestDefinition.builder("GET", "/test").build();
        RequestDefinition notEqualRequestDefinition =
                RequestDefinition.builder("POST", "/test").build();

        // then
        then(requestDefinition).isEqualTo(equalRequestDefinition);
        then(requestDefinition).hasSameHashCodeAs(equalRequestDefinition);
        then(requestDefinition).isNotEqualTo(notEqualRequestDefinition);
        then(requestDefinition).doesNotHaveSameHashCodeAs(notEqualRequestDefinition);
    }

    @Test
    void shouldOverrideToString() {
        // given
        String givenMethod = "GET";
        Object givenPath = "/test";

        // when
        RequestDefinition requestDefinition =
                RequestDefinition.builder("GET", "/test").build();

        // then
        String expectedStringRepresentation = "RequestDefinition{" + "method='"
                + givenMethod + "', " + "path='"
                + givenPath + "', " + "pathParameters=[], "
                + "queryParameters=[], "
                + "headerParameters=[], "
                + "formParameters=[], "
                + "body=null, "
                + "requiresAuthentication=false, "
                + "accept='null', "
                + "contentType='null'"
                + "}";
        then(requestDefinition).hasToString(expectedStringRepresentation);
    }

    @ParameterizedTest
    @MethodSource("nullValueAssignments")
    void shouldThrowNullPointerExceptionWhenAssigningNullValues(ThrowingCallable nullAssignment) {
        // when, then
        thenNullPointerException().isThrownBy(nullAssignment);
    }

    private static Stream<ThrowingCallable> nullValueAssignments() {
        String givenMethod = "GET";
        String givenPath = "/test";
        return Stream.of(
                () -> RequestDefinition.builder(null, givenPath),
                () -> RequestDefinition.builder(givenMethod, null),
                () -> RequestDefinition.builder(givenMethod, givenPath).addPathParameter(null),
                () -> RequestDefinition.builder(givenMethod, givenPath).addQueryParameter(null),
                () -> RequestDefinition.builder(givenMethod, givenPath).addHeaderParameter(null),
                () -> RequestDefinition.builder(givenMethod, givenPath).addFormParameter(null),
                () -> RequestDefinition.builder(givenMethod, givenPath).body(null),
                () -> RequestDefinition.builder(givenMethod, givenPath).accept(null),
                () -> RequestDefinition.builder(givenMethod, givenPath).contentType(null));
    }
}
