package org.Marta.externalServices;

import org.Marta.Currency;
import java.math.BigDecimal;

public interface ExchangeRate {
    BigDecimal getBuyingRate(Currency currency);
    BigDecimal getSellingRate(Currency currency);
}
