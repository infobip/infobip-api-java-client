package infobip.api.config;

import java.util.concurrent.TimeUnit;

import com.squareup.okhttp.OkHttpClient;

import retrofit.client.Client;
import retrofit.client.OkClient;

public class TimeoutClientProvider implements Client.Provider {
    private final Configuration configuration;

    public TimeoutClientProvider(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Client get() {
        final OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setReadTimeout(configuration.getReadTimeout(), TimeUnit.MILLISECONDS);
        okHttpClient.setConnectTimeout(configuration.getConnectionTimeout(), TimeUnit.MILLISECONDS);
        return new OkClient(okHttpClient);
    }

}
