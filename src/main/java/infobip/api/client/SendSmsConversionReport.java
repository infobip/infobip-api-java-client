package infobip.api.client;

import infobip.api.config.Configuration;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.conversion.ConversionRateSubmision;

import com.google.gson.GsonBuilder;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * 
 * @author SHIN DAE YONG
 */
public class SendSmsConversionReport {
    private final Configuration configuration;

    public SendSmsConversionReport(Configuration configuration) {
        this.configuration = configuration;
    }

    interface SendSmsConversionReportService {
        @POST("/ct/1/log/end/{messageId}")
        ConversionRateSubmision execute(@Path("messageId") String messageId,@Body String body);
    }
    public ConversionRateSubmision execute(String messageId) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        SendSmsConversionReportService service = restAdapter.create(SendSmsConversionReportService.class);
        return service.execute(messageId,"");
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