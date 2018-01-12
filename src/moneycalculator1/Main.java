package moneycalculator1;

import moneycalculator1.control.CalculateCommand;
import moneycalculator1.model.Currency;
import moneycalculator1.model.ExchangeRate;
import moneycalculator1.persistence.CurrencyListLoader;
import moneycalculator1.persistence.ExchangeRateLoader;
import moneycalculator1.persistence.rest.RestExchangeRateLoader;
import moneycalculator1.persistence.files.FileCurrencyListLoader;

public class Main {

    public static void main(String[] args) {
        CurrencyListLoader currencyLoader = new FileCurrencyListLoader("currencies");
        ExchangeRateLoader exchangeRateLoader = (ExchangeRateLoader) new RestExchangeRateLoader();
        
        MainFrame mainFrame = new MainFrame(currencyLoader.currencies());
        mainFrame.add(new CalculateCommand(mainFrame.getMoneyDialog(), mainFrame.getMoneyDisplay(), exchangeRateLoader));
    }

}
