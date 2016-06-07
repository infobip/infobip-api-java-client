package infobip.api.client;

import infobip.api.config.Configuration;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.send.SMSResponse;
import infobip.api.model.sms.mt.send.binary.SMSAdvancedBinaryRequest;

import com.google.gson.GsonBuilder;

import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SendMultipleSmsBinaryAdvanced {
    private final Configuration configuration;

    public SendMultipleSmsBinaryAdvanced(Configuration configuration) {
        this.configuration = configuration;
    }

    interface SendMultipleSmsBinaryAdvancedService {
        @POST("/sms/1/binary/advanced")
        SMSResponse execute(@Body SMSAdvancedBinaryRequest bodyObject);
    }
    public SMSResponse execute(SMSAdvancedBinaryRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        SendMultipleSmsBinaryAdvancedService service = restAdapter.create(SendMultipleSmsBinaryAdvancedService.class);
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