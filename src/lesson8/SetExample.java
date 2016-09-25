package lesson8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("item");
        set.add("item1");
        set.add("aitem2");
        set.add("item2");

        System.out.println(set);


        @SuppressWarnings("unchecked")
        Set<String> treeSet = new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return s1.length() - s2.length();
            }
        });


        treeSet.add("item");
        treeSet.add("item1");
        treeSet.add("aitem2");
        treeSet.add("item3");
        treeSet.add("ddddd");

        System.out.println(treeSet);
    }
}
