/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

/**
 * Represents a wrapper for Infobip API base URL.
 *
 * @see <a href="https://www.infobip.com/docs/essentials/base-url">Infobip API base URL</a>
 */
public final class BaseUrl {

    private static final BaseUrl API = BaseUrl.from("https://api.infobip.com");

    private final URL url;

    private BaseUrl(String url) {
        Objects.requireNonNull(url);
        String urlWithoutTrailingSlashes = url.trim().replaceFirst("/+$", "");
        try {
            this.url = new URL(urlWithoutTrailingSlashes);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Provided argument can't be recognized as a valid URL.", e);
        }
    }

    /**
     * Creates a {@link BaseUrl} instance for the given Infobip API base URL value.
     *
     * @param baseUrl The given Infobip API base URL.
     * @return {@link BaseUrl} wrapper around the given base URL.
     * @throws NullPointerException if provided <code>baseUrl</code> is null.
     * @see <a href="https://www.infobip.com/docs/essentials/base-url">Infobip API base URL</a>
     */
    public static BaseUrl from(String baseUrl) {
        return new BaseUrl(baseUrl);
    }

    /**
     * Returns the default {@link BaseUrl} representing https://api.infobip.com" URL.
     *
     * @return The default {@link BaseUrl}
     * @see <a href="https://www.infobip.com/docs/essentials/base-url">Infobip API base URL</a>
     */
    public static BaseUrl api() {
        return API;
    }

    /**
     * Returns the {@link URL} representation of the given Infobip API base url.
     *
     * @return The {@link URL} representing the given Infobip API base url.
     * @see <a href="https://www.infobip.com/docs/essentials/base-url">Infobip API base URL</a>
     */
    public URL getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseUrl baseUrl = (BaseUrl) o;
        return url.equals(baseUrl.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url);
    }

    @Override
    public String toString() {
        return "BaseUrl{" + "url=" + url + '}';
    }
}
