package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.reports.SMSReportResponse;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetSentSmsDeliveryReports {
    private final Configuration configuration;

    public GetSentSmsDeliveryReports(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetSentSmsDeliveryReportsService {
        @GET("/sms/1/reports")
        SMSReportResponse execute(@Query("bulkId") String bulkId, @Query("messageId") String messageId, @Query("limit") Integer limit);
    }
    public SMSReportResponse execute(String bulkId, String messageId, Integer limit) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetSentSmsDeliveryReportsService service = restAdapter.create(GetSentSmsDeliveryReportsService.class);
        return service.execute(bulkId, messageId, limit);
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