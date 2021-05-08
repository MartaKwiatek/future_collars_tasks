package org.Marta;

import org.Marta.externalServices.ExchangeRate;

import java.math.BigDecimal;

public class CurrencyCalculator {
    private final ExchangeRate exchangeRate;

    public CurrencyCalculator(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public BigDecimal calculateSellingRate(BigDecimal amountInPLN, Currency currency) {
        BigDecimal sellingRate = exchangeRate.getSellingRate(currency);
        return sellingRate.multiply(amountInPLN);
    }

    public BigDecimal calculateBuyingRate(BigDecimal amountInPLN, Currency currency) {
        BigDecimal buyingRate = exchangeRate.getBuyingRate(currency);
        return buyingRate.multiply(amountInPLN);
    }
}
