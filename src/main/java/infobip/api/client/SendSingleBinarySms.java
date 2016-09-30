package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.send.SMSResponse;
import infobip.api.model.sms.mt.send.binary.SMSBinaryRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class SendSingleBinarySms {
    private final Configuration configuration;

    public SendSingleBinarySms(Configuration configuration) {
        this.configuration = configuration;
    }

    interface SendSingleBinarySmsService {
        @POST("/sms/1/binary/single")
        SMSResponse execute( @Body SMSBinaryRequest bodyObject);
    }
    public SMSResponse execute(SMSBinaryRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        SendSingleBinarySmsService service = restAdapter.create(SendSingleBinarySmsService.class);
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