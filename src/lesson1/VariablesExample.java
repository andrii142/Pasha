package lesson1;

public class VariablesExample {
    int a1;
    long a2;
    short a3;
    byte a4;

    float a5;
    double a6;

    boolean a7;

    char a8;

    //return value type - name - parameters
    boolean checkBuy(int price, long balance) {
        //logic

        //if(balance >= price) return true;
        //else return false;

        return balance >= price;

        // || && !
        // > < >= <=
    }

    static int checkBalances(int[] balances, int from) {
        int count = 0;

        //for (int i = 0; i < balances.length; i++) {
        //    if (balances[i] > from) count++;
        //}

        for (int element : balances) {
            if (element > from) count++;
        }

        //    /     % 


        return count;
    }

    public static void main(String[] args) {
        int[] balances = {100, 300, 500, 5200, 4030};

        int result = checkBalances(balances, 1000);
        System.out.println(result);
    }
}
