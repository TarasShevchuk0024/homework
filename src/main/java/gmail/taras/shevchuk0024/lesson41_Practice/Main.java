package gmail.taras.shevchuk0024.lesson41_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(10);

        System.out.println("Список 1 має дублікати чисел: " + duplicateNumbers.isDuplicate(list1));
        System.out.println("Список 2 має дублікати чисел: " + duplicateNumbers.isDuplicate(list2));
        System.out.println(" ");

        Map<String, Integer> equipment = new HashMap<>();
        equipment.put("Молоток", 15);
        equipment.put("Пила", 30);
        equipment.put("Лопата", 15);
        equipment.put("Відро", 25);

        Map<Integer, String> changed = newMap.changedMap(equipment);
        System.out.println(changed);
    }
}
