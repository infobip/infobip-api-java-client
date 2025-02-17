package com.infobip;

import static org.assertj.core.api.BDDAssertions.then;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.io.IOException;
import org.junit.jupiter.api.Test;

class RawJsonDeserializerTest {

    static class TestObject {
        @JsonDeserialize(using = RawJsonDeserializer.class)
        private Object rawJson;

        public Object getRawJson() {
            return rawJson;
        }
    }

    @Test
    void shouldDeserializeRawJson() throws IOException {
        // given
        String json = "{\"key\":\"value\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(String.class, new RawJsonDeserializer());
        objectMapper.registerModule(module);

        // when
        String result = objectMapper.readValue(json, String.class);

        // then
        then(result).isEqualTo("{\"key\":\"value\"}");
    }

    @Test
    void shouldDeserializeObjectWithRawJson() throws IOException {
        // given
        String json = "{\"rawJson\": {\"key\":\"value\"}}";
        ObjectMapper objectMapper = new ObjectMapper();

        // when
        TestObject result = objectMapper.readValue(json, TestObject.class);

        String expectedRawJson = "{\"key\":\"value\"}";

        // then
        then(result.getRawJson()).isEqualTo(expectedRawJson);
    }
}
