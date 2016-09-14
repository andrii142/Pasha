package lesson5.practice.enums;

public class Main {
    public static void main(String[] args) {
        MoneyConveter moneyConveter1 = new MoneyConveter("London", Currency.EUR, 10000);
        MoneyConveter moneyConveter2 = new MoneyConveter("Kiev", Currency.UAH, 1000);
        MoneyConveter moneyConveter3 = new MoneyConveter("Krakow", Currency.PLN, 6000);

        System.out.println(moneyConveter1);
        System.out.println(moneyConveter2);
        System.out.println(moneyConveter3);

        Currency.values(); //will return
        //Currency[] values = {Currency.EUR, Currency.UAH, Currency.USD, Currency.PLN};

        Currency currency = Currency.valueOf("US");
        System.out.println(currency);
    }
}
