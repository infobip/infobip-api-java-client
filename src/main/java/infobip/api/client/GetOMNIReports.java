package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.omni.reports.OMNIReportsResponse;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetOMNIReports {
    private final Configuration configuration;

    public GetOMNIReports(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetOMNIReportsService {
        @GET("/omni/1/reports")
        OMNIReportsResponse execute(@Query("bulkId") String bulkId, @Query("messageId") String messageId, @Query("limit") Integer limit, @Query("channel") String channel);
    }
    public OMNIReportsResponse execute(String bulkId, String messageId, Integer limit, String channel) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetOMNIReportsService service = restAdapter.create(GetOMNIReportsService.class);
        return service.execute(bulkId, messageId, limit, channel);
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