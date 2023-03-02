/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Class providing an abstraction used for Json serialization and deserialization.
 */
public class JSON {

    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    private final ObjectMapper objectMapper;

    /**
     * Default constructor which creates a preconfigured {@link JSON} instance.
     */
    public JSON() {
        objectMapper = configureObjectMapper();
    }

    /**
     * Serializes given target object into JSON.
     *
     * @param target given target object
     * @return JSON representation of the given target object
     * @throws JSONException if serialization fails
     */
    public String serialize(Object target) {
        try {
            return objectMapper.writeValueAsString(target);
        } catch (Exception e) {
            throw JSONException.becauseSerializationFailed(e);
        }
    }

    /**
     * Deserializes given JSON content into an object of given type.
     *
     * @param target     given target JSON
     * @param targetType deserialization result type
     * @param <T>        the type of the deserialization result
     * @return deserialization result
     * @throws JSONException if deserialization fails
     */
    public <T> T deserialize(String target, Type targetType) {
        try {
            return objectMapper.readValue(target, asTypeReference(targetType));
        } catch (Exception e) {
            throw JSONException.becauseDeserializationFailed(e);
        }
    }

    /**
     * Deserializes given {@link InputStream} representing JSON content into an object of given type.
     * <p>
     * To deserialize the {@link InputStream}, this method uses preconfigured {@link ObjectMapper} instance.
     * Closing the given {@link InputStream} fully depends on the {@link ObjectMapper} configuration.
     * The default configuration will close the stream. It's possible to reconfigure the {@link ObjectMapper} by
     * overriding the {@link #configureObjectMapper()} method.
     *
     * @param target     given target {@link InputStream}
     * @param targetType deserialization result type
     * @param <T>        the type of the deserialization result
     * @return deserialization result
     * @throws JSONException if deserialization fails
     */
    public <T> T deserialize(InputStream target, Type targetType) {
        try {
            return objectMapper.readValue(target, asTypeReference(targetType));
        } catch (Exception e) {
            throw JSONException.becauseDeserializationFailed(e);
        }
    }

    /**
     * An instance of {@link DateTimeFormatter} used for serializing (writing) date-time objects.
     * The formatter is set up to provide support for official Infobip date-time
     * <a href="https://www.infobip.com/docs/essentials/integration-best-practices#date-formats-backward-compatibility">format</a>.
     * Internally, {@link OffsetDateTime} instances are serialized using this formatter.
     *
     * @return formatter used for writing date time objects
     */
    public DateTimeFormatter dateTimeFormatter() {
        return DATE_TIME_FORMATTER;
    }

    /**
     * Provides a preconfigured {@link ObjectMapper} instance.
     *
     * @return preconfigured {@link ObjectMapper} instance.
     */
    protected ObjectMapper configureObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
        objectMapper.registerModule(configureJavaTimeModule());
        return objectMapper;
    }

    /**
     * Provides a preconfigured {@link JavaTimeModule} instance.
     *
     * @return preconfigured {@link JavaTimeModule} instance.
     */
    protected JavaTimeModule configureJavaTimeModule() {
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addSerializer(OffsetDateTime.class, OffsetDateTimeSerializer.INSTANCE);
        return javaTimeModule;
    }

    private static <T> TypeReference<T> asTypeReference(Type targetType) {
        return new TypeReference<>() {
            @Override
            public Type getType() {
                return targetType;
            }
        };
    }

    private static class OffsetDateTimeSerializer extends JsonSerializer<OffsetDateTime> {

        private static final OffsetDateTimeSerializer INSTANCE = new OffsetDateTimeSerializer();

        private OffsetDateTimeSerializer() {}

        @Override
        public void serialize(OffsetDateTime value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            gen.writeString(DATE_TIME_FORMATTER.format(value));
        }
    }
}
