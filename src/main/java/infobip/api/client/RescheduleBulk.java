package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.bulks.BulkResponse;
import infobip.api.model.sms.mt.bulks.BulkRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class RescheduleBulk {
    private final Configuration configuration;

    public RescheduleBulk(Configuration configuration) {
        this.configuration = configuration;
    }

    interface RescheduleBulkService {
        @PUT("/sms/1/bulks")
        BulkResponse execute(@Query("bulkId") String bulkId, @Body BulkRequest bodyObject);
    }
    public BulkResponse execute(String bulkId,BulkRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        RescheduleBulkService service = restAdapter.create(RescheduleBulkService.class);
        return service.execute(bulkId, bodyObject);
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