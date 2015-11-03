package infobip.examples;

import infobip.api.client.GetAccountBalance;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.account.AccountBalance;

/**
 * Created by amarjanovic on 2.11.2015.
 */
public class GetAccountBalanceExample extends Example{

    public static void main(String[] args) {

        GetAccountBalance client = new GetAccountBalance(new BasicAuthConfiguration(BASE_URL, USERNAME, PASSWORD));

        AccountBalance accountBalance = client.execute();

        System.out.println(accountBalance);
    }
}
