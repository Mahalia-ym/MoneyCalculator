package moneycalculator1.model;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final Currency amount;

    public ExchangeRate(Currency from, Currency to, Currency amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public Currency getAmount() {
        return amount;
    }
}
