package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadeExample {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 3;
        try {
            while (count > 0) {
                String input = br.readLine();
                System.out.println("The string " + input + " is read");

                try {
                    int a = Integer.valueOf(input);
                    System.out.println(a + 10);
                } catch (NumberFormatException e) {
                    System.out.println("it is not integer value");
                }

                count--;
            }
        } catch (IOException e) {
            System.out.println("read error...");
        }

        System.out.println("finished");

        try {
            br.close();
        } catch (IOException e) {
            System.out.println("closed is failed");
        }
    }
}
