package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.omni.send.OmniResponse;
import infobip.api.model.omni.send.OmniSimpleRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class SendSimpleOmniMessage {
    private final Configuration configuration;

    public SendSimpleOmniMessage(Configuration configuration) {
        this.configuration = configuration;
    }

    interface SendSimpleOmniMessageService {
        @POST("/omni/1/text")
        OmniResponse execute(@Body OmniSimpleRequest bodyObject);
    }
    public OmniResponse execute(OmniSimpleRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        SendSimpleOmniMessageService service = restAdapter.create(SendSimpleOmniMessageService.class);
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