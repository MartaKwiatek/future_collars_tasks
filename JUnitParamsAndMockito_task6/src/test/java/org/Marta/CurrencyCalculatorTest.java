package org.Marta;

import org.Marta.externalServices.ExchangeRate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

class CurrencyCalculatorTest {

    @Test
    void shouldConvertPlnInBuyingRate() {
        //given
        BigDecimal amountOfPLN = new BigDecimal("20.0");
        ExchangeRate exchangeRateMock = Mockito.mock(ExchangeRate.class);

        Mockito.when(exchangeRateMock.getBuyingRate(Currency.EUR)).thenReturn(new BigDecimal("4.57"));
        Mockito.when(exchangeRateMock.getBuyingRate(Currency.USD)).thenReturn(new BigDecimal("3.80"));
        Mockito.when(exchangeRateMock.getBuyingRate(Currency.GBP)).thenReturn(new BigDecimal("5.28"));
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(exchangeRateMock);

        //when
        BigDecimal buyingRateEuro = currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.EUR);
        BigDecimal buyingRateDollar = currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.USD);
        BigDecimal buyingRatePound = currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.GBP);

        //then
        Assertions.assertEquals(new BigDecimal("91.400"), buyingRateEuro);
        Assertions.assertEquals(new BigDecimal("76.000"), buyingRateDollar);
        Assertions.assertEquals(new BigDecimal("105.600"), buyingRatePound);
    }

    @Test
    void shouldConvertPlnToEuroInSellingRate() {
        //given
        BigDecimal amountOfPLN = new BigDecimal("20.0");
        ExchangeRate exchangeRateMock = Mockito.mock(ExchangeRate.class);

        Mockito.when(exchangeRateMock.getSellingRate(Currency.EUR)).thenReturn(new BigDecimal("4.59"));
        Mockito.when(exchangeRateMock.getSellingRate(Currency.USD)).thenReturn(new BigDecimal("3.82"));
        Mockito.when(exchangeRateMock.getSellingRate(Currency.GBP)).thenReturn(new BigDecimal("5.32"));
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(exchangeRateMock);

        //when
        BigDecimal sellingRateEuro = currencyCalculator.calculateSellingRate(amountOfPLN, Currency.EUR);
        BigDecimal sellingRateDollar = currencyCalculator.calculateSellingRate(amountOfPLN, Currency.USD);
        BigDecimal sellingRatePound = currencyCalculator.calculateSellingRate(amountOfPLN, Currency.GBP);

        //then
        Assertions.assertEquals(new BigDecimal("91.800"), sellingRateEuro);
        Assertions.assertEquals(new BigDecimal("76.400"), sellingRateDollar);
        Assertions.assertEquals(new BigDecimal("106.400"), sellingRatePound);
    }
}