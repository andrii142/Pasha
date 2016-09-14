package lesson5.practice.enums;

public class MoneyConveter {
    private String city;
    private int maxAmount;
    private Currency currency;

    public MoneyConveter(String city, Currency currency, int maxAmount) {
        this.city = city;
        this.currency = currency;
        this.maxAmount = maxAmount;
    }

    @Override
    public String toString() {
        return "MoneyConveter{" +
                "city='" + city + '\'' +
                ", maxAmount=" + maxAmount +
                ", currency=" + currency +
                '}';
    }
}
