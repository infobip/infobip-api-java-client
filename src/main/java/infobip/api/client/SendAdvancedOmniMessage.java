package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.omni.send.OmniResponse;
import infobip.api.model.omni.send.OmniAdvancedRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class SendAdvancedOmniMessage {
    private final Configuration configuration;

    public SendAdvancedOmniMessage(Configuration configuration) {
        this.configuration = configuration;
    }

    interface SendAdvancedOmniMessageService {
        @POST("/omni/1/advanced")
        OmniResponse execute(@Body OmniAdvancedRequest bodyObject);
    }
    public OmniResponse execute(OmniAdvancedRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        SendAdvancedOmniMessageService service = restAdapter.create(SendAdvancedOmniMessageService.class);
        return service.execute(bodyObject);
    }

    private RequestInterceptor getRequestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                if (configuration != null && configuration.getAuthorizationHeader() != null) {
                    request.addHeader("Authorization", configuration.getAuthorizationHeader());
                    request.addHeader("User-Agent", "Java-Client-Library");
                }
            }
        };
    }
}