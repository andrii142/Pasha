package lesson8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<String, Integer>();
// Помещаем данные на карточку
        hm.put("a", 5);
        hm.put("d", 8);
        hm.put("b", 12);
        hm.put("z", 5);

        // Получаем набор элементов
        Set<Map.Entry<String, Integer>> set = hm.entrySet();

// Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        // Добавляем значение
//        int value = hm.get("Рыжик");
 //       hm.put("Рыжик", value + 3);
  //      System.out.println("У Рыжика стало " + hm.get("Рыжик"));

    }
}
