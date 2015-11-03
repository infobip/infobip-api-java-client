package infobip.api.client;

import infobip.api.config.Configuration;
import infobip.api.model.account.AccountBalance;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.http.GET;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class GetAccountBalance {
    private final Configuration configuration;

    public GetAccountBalance(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetAccountBalanceService {
        @GET("/account/1/balance")
        AccountBalance execute();
    }

    public AccountBalance execute() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .build();
        GetAccountBalanceService service = restAdapter.create(GetAccountBalanceService.class);
        return service.execute();
    }

    private RequestInterceptor getRequestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                if (configuration != null && configuration.getAuthorizationHeader() != null) {
                    request.addHeader("Authorization", configuration.getAuthorizationHeader());
                }
            }
        };
    }
}
