package org.Marta;

import org.Marta.externalServices.ExchangeRate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.stream.Stream;

class CurrencyCalculatorTest {

    @ParameterizedTest
    @MethodSource("provideCalculatedBuyingRate")
    void shouldConvertPlnInBuyingRate(BigDecimal expectedAmount, BigDecimal calculatedAmount) {
        Assertions.assertEquals(expectedAmount, calculatedAmount);
    }

    private static Stream<Arguments> provideCalculatedBuyingRate() {
        BigDecimal amountOfPLN = new BigDecimal("20.0");
        ExchangeRate exchangeRateMock = Mockito.mock(ExchangeRate.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(exchangeRateMock);

        Mockito.when(exchangeRateMock.getBuyingRate(Currency.EUR)).thenReturn(new BigDecimal("4.57"));
        Mockito.when(exchangeRateMock.getBuyingRate(Currency.USD)).thenReturn(new BigDecimal("3.80"));
        Mockito.when(exchangeRateMock.getBuyingRate(Currency.GBP)).thenReturn(new BigDecimal("5.28"));

        return Stream.of(
                Arguments.of(new BigDecimal("91.400"), currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.EUR)),
                Arguments.of(new BigDecimal("76.000"), currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.USD)),
                Arguments.of(new BigDecimal("105.600"), currencyCalculator.calculateBuyingRate(amountOfPLN, Currency.GBP))
        );
    }

    @ParameterizedTest
    @MethodSource("provideCalculatedSellingRate")
    void shouldConvertPlnInSellingRate(BigDecimal expectedAmount, BigDecimal calculatedAmount) {
        Assertions.assertEquals(expectedAmount, calculatedAmount);
    }

    private static Stream<Arguments> provideCalculatedSellingRate() {
        BigDecimal amountOfPLN = new BigDecimal("20.0");
        ExchangeRate exchangeRateMock = Mockito.mock(ExchangeRate.class);
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(exchangeRateMock);

        Mockito.when(exchangeRateMock.getSellingRate(Currency.EUR)).thenReturn(new BigDecimal("4.59"));
        Mockito.when(exchangeRateMock.getSellingRate(Currency.USD)).thenReturn(new BigDecimal("3.82"));
        Mockito.when(exchangeRateMock.getSellingRate(Currency.GBP)).thenReturn(new BigDecimal("5.32"));

        return Stream.of(
                Arguments.of(new BigDecimal("91.800"), currencyCalculator.calculateSellingRate(amountOfPLN, Currency.EUR)),
                Arguments.of(new BigDecimal("76.400"), currencyCalculator.calculateSellingRate(amountOfPLN, Currency.USD)),
                Arguments.of(new BigDecimal("106.400"), currencyCalculator.calculateSellingRate(amountOfPLN, Currency.GBP))
        );
    }
}