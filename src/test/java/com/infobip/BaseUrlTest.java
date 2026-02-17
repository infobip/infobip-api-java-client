/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import static org.assertj.core.api.BDDAssertions.*;

import java.net.URL;
import org.junit.jupiter.api.Test;

public final class BaseUrlTest {

    @Test
    void shouldThrowNullPointerExceptionIfProvidedBaseUrlIsNull() {
        // when, then
        thenNullPointerException().isThrownBy(() -> BaseUrl.from(null));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForMalformedUrl() {
        // when, then
        thenIllegalArgumentException().isThrownBy(() -> BaseUrl.from("malformed:url"));
    }

    @Test
    void shouldWrapApiUrl() {
        // given
        String givenUrl = "https://api.infobip.com";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("https");
        then(baseUrlWrapper.getHost()).isEqualTo("api.infobip.com");
        then(baseUrlWrapper.getPath()).isEqualTo("");
        then(baseUrlWrapper.toString()).isEqualTo(givenUrl);
    }

    @Test
    void shouldWrapPersonalizedApiUrl() {
        // given
        String givenUrl = "https://abcdef.api.infobip.com";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("https");
        then(baseUrlWrapper.getHost()).isEqualTo("abcdef.api.infobip.com");
        then(baseUrlWrapper.getPath()).isEqualTo("");
        then(baseUrlWrapper.toString()).isEqualTo(givenUrl);
    }

    @Test
    void shouldWrapIpAddress() {
        // given
        String givenUrl = "https://127.0.0.1";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("https");
        then(baseUrlWrapper.getHost()).isEqualTo("127.0.0.1");
        then(baseUrlWrapper.getPath()).isEqualTo("");
        then(baseUrlWrapper.toString()).isEqualTo(givenUrl);
    }

    @Test
    void shouldIgnoreTrailingSlash() {
        // given
        String givenUrl = "https://api.infobip.com/";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("https");
        then(baseUrlWrapper.getHost()).isEqualTo("api.infobip.com");
        then(baseUrlWrapper.getPath()).isEqualTo("");
        String expectedUrlWithoutTrailingSlash = "https://api.infobip.com";
        then(baseUrlWrapper.toString()).isEqualTo(expectedUrlWithoutTrailingSlash);
    }

    @Test
    void shouldIgnoreMultipleTrailingSlashes() {
        // given
        String givenUrl = "https://api.infobip.com//";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("https");
        then(baseUrlWrapper.getHost()).isEqualTo("api.infobip.com");
        then(baseUrlWrapper.getPath()).isEqualTo("");
        String expectedUrlWithoutTrailingSlash = "https://api.infobip.com";
        then(baseUrlWrapper.toString()).isEqualTo(expectedUrlWithoutTrailingSlash);
    }

    @Test
    void shouldTrimInput() {
        // given
        String givenUrl = " https://api.infobip.com   ";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("https");
        then(baseUrlWrapper.getHost()).isEqualTo("api.infobip.com");
        then(baseUrlWrapper.getPath()).isEqualTo("");
        String expectedTrimmedUrl = "https://api.infobip.com";
        then(baseUrlWrapper.toString()).isEqualTo(expectedTrimmedUrl);
    }

    @Test
    void shouldRespectEqualsAndHashCodeContract() {
        // given
        String givenUrl = "https://api.infobip.com";
        String givenAnotherUrl = "https://example.com";

        // when
        BaseUrl baseUrlWrapper = BaseUrl.from(givenUrl);
        BaseUrl equalBaseUrlWrapper = BaseUrl.from(givenUrl);
        BaseUrl notEqualBaseUrlWrapper = BaseUrl.from(givenAnotherUrl);

        // then
        then(baseUrlWrapper).isEqualTo(equalBaseUrlWrapper);
        then(baseUrlWrapper).hasSameHashCodeAs(equalBaseUrlWrapper);
        then(baseUrlWrapper).isNotEqualTo(notEqualBaseUrlWrapper);
        then(baseUrlWrapper).doesNotHaveSameHashCodeAs(notEqualBaseUrlWrapper);
    }

    @Test
    void shouldOverrideToString() {
        // given
        String givenUrl = "https://api.infobip.com";

        // when
        BaseUrl baseUrlWrapper = BaseUrl.from(givenUrl);

        // then
        then(baseUrlWrapper).hasToString("BaseUrl{url=https://api.infobip.com}");
    }

    @Test
    void shouldProvideDefaultApiUrl() {
        // given
        BaseUrl expectedDefaultApiUrl = BaseUrl.from("https://api.infobip.com");

        // when
        BaseUrl defaultApiUrl = BaseUrl.api();

        // then
        then(defaultApiUrl).isEqualTo(expectedDefaultApiUrl);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForHttpScheme() {
        // given
        String givenUrl = "http://api.infobip.com";

        // when, then
        thenIllegalArgumentException()
                .isThrownBy(() -> BaseUrl.from(givenUrl))
                .withMessage("HTTP scheme is not supported. Please provide a URL with HTTPS scheme.");
    }

    @Test
    void shouldAllowHttpSchemeForLocalhost() {
        // given
        String givenUrl = "http://localhost:8080";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("http");
        then(baseUrlWrapper.getHost()).isEqualTo("localhost");
        then(baseUrlWrapper.getPort()).isEqualTo(8080);
    }

    @Test
    void shouldAllowHttpSchemeFor127001() {
        // given
        String givenUrl = "http://127.0.0.1:9090";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("http");
        then(baseUrlWrapper.getHost()).isEqualTo("127.0.0.1");
        then(baseUrlWrapper.getPort()).isEqualTo(9090);
    }

    @Test
    void shouldAutomaticallyAddHttpsSchemeWhenNoSchemeProvided() {
        // given
        String givenUrl = "api.infobip.com";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("https");
        then(baseUrlWrapper.getHost()).isEqualTo("api.infobip.com");
        then(baseUrlWrapper.getPath()).isEqualTo("");
        then(baseUrlWrapper.toString()).isEqualTo("https://api.infobip.com");
    }

    @Test
    void shouldAcceptHttpsSchemeWithoutModification() {
        // given
        String givenUrl = "https://api.infobip.com";

        // when
        BaseUrl baseUrl = BaseUrl.from(givenUrl);

        // then
        URL baseUrlWrapper = baseUrl.getUrl();
        then(baseUrlWrapper.getProtocol()).isEqualTo("https");
        then(baseUrlWrapper.getHost()).isEqualTo("api.infobip.com");
        then(baseUrlWrapper.getPath()).isEqualTo("");
        then(baseUrlWrapper.toString()).isEqualTo(givenUrl);
    }
}
