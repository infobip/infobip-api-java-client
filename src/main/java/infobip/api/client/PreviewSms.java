package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.send.preview.PreviewResponse;
import infobip.api.model.sms.mt.send.preview.PreviewRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class PreviewSms {
    private final Configuration configuration;

    public PreviewSms(Configuration configuration) {
        this.configuration = configuration;
    }

    interface PreviewSmsService {
        @POST("/sms/1/preview")
        PreviewResponse execute(@Body PreviewRequest bodyObject);
    }
    public PreviewResponse execute(PreviewRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        PreviewSmsService service = restAdapter.create(PreviewSmsService.class);
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