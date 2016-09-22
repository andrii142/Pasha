package lesson6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1001, "Jack", "Dawson", "IBM");
        User user2 = new User(1002, "Ann", "Wilson", "Luxoft");

        User user3 = new User(1001, "Jack", "Dawson", "IBM");

        User user4 = user1;

        System.out.println(user1 == user2);
        System.out.println(user1 == user3);

        System.out.println(user1 == user1);

        System.out.println(user1 == user4);


        //null.method -> null pointer pointer

        System.out.println(user1.hashCode());
        System.out.println(user4.hashCode());


        System.out.println(user1.equals(user3));

        Set<User> set = new HashSet<User>();
        set.add(user1);
        set.add(user3);

        System.out.println(set.toString());

        //int[][] twoDimArray = new int[2][2];
        //twoDimArray[0] = new int[] {1, 3};
        //twoDimArray[1] = new int[] {6, 7};
    }
}
