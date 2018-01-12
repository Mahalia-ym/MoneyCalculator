package moneycalculator1.persistence;

import moneycalculator1.model.Currency;
import moneycalculator1.model.ExchangeRate;

public interface ExchangeRateLoader {
    ExchangeRate load(Currency from, Currency to);
}
