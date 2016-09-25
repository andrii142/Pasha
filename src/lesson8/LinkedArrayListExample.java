package lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class LinkedArrayListExample {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        System.out.println(list);

        list.add("item");
        list.add("item1");
        list.add("item2");
        list.add("item3");

        System.out.println(list);

    }
}
