package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.send.SMSResponse;
import infobip.api.model.sms.mt.send.textual.SMSAdvancedTextualRequest;

/**
 * This is a generated class and is not intended for modification!
 */
public class SendMultipleTextualSmsAdvanced {
    private final Configuration configuration;

    public SendMultipleTextualSmsAdvanced(Configuration configuration) {
        this.configuration = configuration;
    }

    interface SendMultipleTextualSmsAdvancedService {
        @POST("/sms/1/text/advanced")
        SMSResponse execute( @Body SMSAdvancedTextualRequest bodyObject);
    }
    public SMSResponse execute(SMSAdvancedTextualRequest bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        SendMultipleTextualSmsAdvancedService service = restAdapter.create(SendMultipleTextualSmsAdvancedService.class);
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