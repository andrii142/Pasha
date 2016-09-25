package lesson8;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        //map.put(user1, new ArrayList<>());
        map.put("1", "Jan");
        map.put("2", "Feb");
        map.put("3", "Mar");

        System.out.println(map);

        System.out.println(map.get("2"));

        System.out.println(map.keySet());

        System.out.println(map.entrySet());

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("aaa", "Aan");
        treeMap.put("ccc", "Ceb");
        treeMap.put("bbb", "Bar");

        System.out.println(treeMap);





    }
}
