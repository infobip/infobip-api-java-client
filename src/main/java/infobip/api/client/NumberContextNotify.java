package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.nc.notify.NumberContextResponse;
import infobip.api.model.nc.notify.NumberContextRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class NumberContextNotify {
    private final Configuration configuration;

    public NumberContextNotify(Configuration configuration) {
        this.configuration = configuration;
    }

    interface NumberContextNotifyService {
        @POST("/number/1/notify")
        NumberContextResponse execute( @Body NumberContextRequest bodyObject);
    }
    public NumberContextResponse execute(NumberContextRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        NumberContextNotifyService service = restAdapter.create(NumberContextNotifyService.class);
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