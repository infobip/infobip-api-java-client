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
 * The runtime exception that may be thrown when using the Infobip API client library.
 * <p>
 * If you encounter this exception, Please contact support@infobip.com or open an issue on our Github repo.
 */
public class InternalException extends RuntimeException {

    private static final String OFFICIAL_MESSAGE =
            "An internal error occurred. " + "Contact support@infobip.com or open an issue on our Github repo. "
                    + "Include a minimal reproducible example. "
                    + "Thank you for using our library!";

    private InternalException(String message, Throwable cause) {
        super(String.format("%s Error message: %s.", OFFICIAL_MESSAGE, message), cause);
    }

    private InternalException(String message) {
        this(message, null);
    }

    public static InternalException becauseRequestBodySerializationFailed(JSONException cause) {
        return new InternalException("Request body can't be properly serialized.", cause);
    }

    public static InternalException becauseRequestBodyCanNotBeProcessed() {
        return new InternalException(
                "Request body can't be processed. The issue might be in the content type definition.");
    }

    public static InternalException becauseBodyWasDefinedForMethodThatDoesNotPermitIt() {
        return new InternalException("Request body was defined for a method that doesn't permit it.");
    }
}
