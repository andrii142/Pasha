package lesson9.compareExamples;

import java.util.*;

public class CompareExamples {
    //psvm

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Yalta");
        list.add("Kiev");
        list.add("Praga");
        list.add("Krakow");


       /* Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //bbb aaa
                // -1 o1 < o2
                // 0 o1 == o2
                // 1 o1 > o2

                return o1.compareTo(o2);
            }
        };*/


        list.sort(new AlphabetComp());


        System.out.println(list);

        //array example
        //example 1
        String[] cities = new String[4];
        cities[0] = "Yalta";
        cities[1] = "Kiev";
        cities[2] = "Praga";
        cities[3] = "Krakow";

        Arrays.sort(cities);

        System.out.println(Arrays.deepToString(cities));

        //example 2
        User[] users = new User[4];
        users[0] = new User("Roma", 15);
        users[1] = new User("Denis", 25);
        users[2] = new User("Alexey", 5);
        users[3] = new User("Rita", 55);

        Arrays.sort(users);
        Arrays.sort(users, new UsersComparator());

        System.out.println(Arrays.deepToString(users));


        //tree set
        Set<User> set = new TreeSet<>();
        set.add(new User("Roma", 15));
        set.add(new User("Denis", 25));
        set.add(new User("Alexey", 5));
        set.add(new User("Roma", 55));

        System.out.println(set);

    }
}
