package infobip.examples;

import infobip.api.client.GetAccountBalance;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.account.AccountBalance;

public class GetAccountBalanceExample extends Example {

    public static void main(String[] args) {

        GetAccountBalance client = new GetAccountBalance(new BasicAuthConfiguration(USERNAME, PASSWORD));

        AccountBalance accountBalance = client.execute();

        System.out.println(accountBalance);
    }
}
