package infobip.api.model.account;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class AccountBalance {
    private Double amount;
    private Double balance;
    private String currency;
    private Integer currencyId;

    public AccountBalance() {
    }

    public Double getAmount() {
        return this.amount;
    }

    public AccountBalance setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public Double getBalance() {
        return this.balance;
    }

    public AccountBalance setBalance(Double balance) {
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

    public Integer getCurrencyId() {
        return this.currencyId;
    }

    public AccountBalance setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
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
        if (this.amount == null) {
            if (o.amount != null){
                return false;
            }
        } else if (!this.amount.equals(o.amount)) {
            return false;
        }
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
        if (this.currencyId == null) {
            if (o.currencyId != null){
                return false;
            }
        } else if (!this.currencyId.equals(o.currencyId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "AccountBalance{" +
            "amount='" + amount + "'" +
            ", balance='" + balance + "'" +
            ", currency='" + currency + "'" +
            ", currencyId='" + currencyId + "'" +
            '}';
    }
}