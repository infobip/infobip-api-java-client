package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.bulks.BulkResponse;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetBulks {
    private final Configuration configuration;

    public GetBulks(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetBulksService {
        @GET("/sms/1/bulks")
        BulkResponse execute(@Query("bulkId") String bulkId);
    }
    public BulkResponse execute(String bulkId) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetBulksService service = restAdapter.create(GetBulksService.class);
        return service.execute(bulkId);
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