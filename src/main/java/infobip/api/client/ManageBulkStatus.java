package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.bulks.status.BulkStatusResponse;
import infobip.api.model.sms.mt.bulks.status.UpdateStatusRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class ManageBulkStatus {
    private final Configuration configuration;

    public ManageBulkStatus(Configuration configuration) {
        this.configuration = configuration;
    }

    interface ManageBulkStatusService {
        @PUT("/sms/1/bulks/status")
        BulkStatusResponse execute(@Query("bulkId") String bulkId, @Body UpdateStatusRequest bodyObject);
    }
    public BulkStatusResponse execute(String bulkId,UpdateStatusRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        ManageBulkStatusService service = restAdapter.create(ManageBulkStatusService.class);
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