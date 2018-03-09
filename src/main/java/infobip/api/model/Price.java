package infobip.api.model;

import java.math.BigDecimal;

/**
 * This is a generated class and is not intended for modification!
 */
public class Price {
    private BigDecimal pricePerMessage;
    private BigDecimal pricePerLookup;
    private String currency;

    public Price() {
    }

    public BigDecimal getPricePerMessage() {
        return this.pricePerMessage;
    }

    public Price setPricePerMessage(BigDecimal pricePerMessage) {
        this.pricePerMessage = pricePerMessage;
        return this;
    }

    public BigDecimal getPricePerLookup() {
        return this.pricePerLookup;
    }

    public Price setPricePerLookup(BigDecimal pricePerLookup) {
        this.pricePerLookup = pricePerLookup;
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Price setCurrency(String currency) {
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

        Price o = (Price)obj;
        if (this.pricePerMessage == null) {
            if (o.pricePerMessage != null){
                return false;
            }
        } else if (!this.pricePerMessage.equals(o.pricePerMessage)) {
            return false;
        }
        if (this.pricePerLookup == null) {
            if (o.pricePerLookup != null){
                return false;
            }
        } else if (!this.pricePerLookup.equals(o.pricePerLookup)) {
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
        return "Price{" +
            "pricePerMessage='" + pricePerMessage + "'" +
            ", pricePerLookup='" + pricePerLookup + "'" +
            ", currency='" + currency + "'" +
            '}';
    }
}