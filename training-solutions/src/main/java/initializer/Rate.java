package initializer;

public class Rate {
    public double conversionFactor;
    public Currency currency;

    public Rate(Currency currency, double conversionFactor) {
        this.currency = currency;
        this.conversionFactor = conversionFactor;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }

    public Currency getCurrency() {
        return currency;
    }
}
