package infobip.api.model.account;

import java.math.BigDecimal;

/**
 * This is a generated class and is not intended for modification!
 */
public class AccountBalance {
    private BigDecimal balance;
    private String currency;

    public AccountBalance() {
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public AccountBalance setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    public AccountBalance setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        AccountBalance o = (AccountBalance)obj;
        if (this.balance == null) {
            if (o.balance != null){
                return false;
            }
        } else if (!this.balance.equals(o.balance)) {
            return false;
        }
        if (this.currency == null) {
            if (o.currency != null){
                return false;
            }
        } else if (!this.currency.equals(o.currency)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "AccountBalance{" +
            "balance='" + balance + "'" +
            ", currency='" + currency + "'" +
            '}';
    }
}