package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.nc.query.NumberContextResponse;
import infobip.api.model.nc.query.NumberContextRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class NumberContextQuery {
    private final Configuration configuration;

    public NumberContextQuery(Configuration configuration) {
        this.configuration = configuration;
    }

    interface NumberContextQueryService {
        @POST("/number/1/query")
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
        NumberContextQueryService service = restAdapter.create(NumberContextQueryService.class);
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