package lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    void test() {
        int n = 5;
        while (n > 0) {
            if (n == 3) return;
            System.out.println(n);
            n--;
        }
    }

    public static void main(String[] args) {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("/Users/Andrey/Desktop/file.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            return;
        }

        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

                //line=+br.readLine();
                //line+='\n'
            }

            String everything = sb.toString();
            System.out.println(everything);
        } catch (IOException e) {
            System.out.println("read failed");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("can't close reade");
            }
        }
    }
}
