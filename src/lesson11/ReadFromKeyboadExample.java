package lesson11;

import java.util.Scanner;

public class ReadFromKeyboadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }

        scanner.close();
    }
}
