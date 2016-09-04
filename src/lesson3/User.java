package lesson3;


public class User {
    private static int balance;


    static double withdraw(int summ) {
        balance -= summ;

        double a;
        if (summ <= 1000) {
            a = summ - ((summ * 5) / 100); //  / %
        } else {
            a = summ - ((summ * 10) / 100);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(withdraw(24));
    }
}
