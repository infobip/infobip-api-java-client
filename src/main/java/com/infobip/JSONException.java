/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

/**
 * Specialized classed used for reporting problems encountered
 * when processing (serializing, deserializing) JSON within the library.
 *<p>
 * If the default serialization techniques provided by the library, {@link JSON} class,
 * were used please contact support.
 */
public final class JSONException extends RuntimeException {

    private JSONException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Factory method used for emphasizing that there was an exception during serialization.
     *
     * @param cause the cause of the error
     * @return the exception wrapped around given cause
     */
    public static JSONException becauseSerializationFailed(Throwable cause) {
        return new JSONException("Json serialization failed.", cause);
    }

    /**
     * Factory method used for emphasizing that there was an exception during deserialization.
     *
     * @param cause the cause of the error
     * @return the exception wrapped around given cause
     */
    public static JSONException becauseDeserializationFailed(Throwable cause) {
        return new JSONException("Json deserialization failed.", cause);
    }
}
