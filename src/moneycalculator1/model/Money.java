package moneycalculator1.model;

public class Money {
    private final double amount;
    private final Currency currency;
    public Object getAmount;

    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}
