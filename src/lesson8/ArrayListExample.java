package lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println(list);

        list.add("item");
        list.add("item1");
        list.add("item2");
        list.add("item3");

        System.out.println(list);

        list.add(1, "item9");

        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("test");
        list1.add("test1");

        list.addAll(list1);

        System.out.println(list);

        //list.clear();

        System.out.println(list);


        System.out.println(list.indexOf("test2"));

        UnaryOperator<String> op = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if(s.contains("item")) {
                    return null;
                }
                return s;
            }
        };

        //list.replaceAll(op);

        System.out.println(list);


        List<String> list2 = new ArrayList<>();
        list2.add("item");
        list2.add("test");

        //list.retainAll(list2);

        System.out.println(list);

        //list.set(1, "tttt");
        list.add(1, "tttt");

        System.out.println(list);


    }


}
