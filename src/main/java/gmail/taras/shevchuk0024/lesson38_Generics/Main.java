package gmail.taras.shevchuk0024.lesson38_Generics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static gmail.taras.shevchuk0024.lesson38_Generics.Maps.mergeMaps;
import static gmail.taras.shevchuk0024.lesson38_Generics.UniqueNumbers.getUniqueNumbers;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 10, 40, 50, 30, 60);
        System.out.println(getUniqueNumbers(numbers));
        System.out.println(" ");

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Car", 2);
        map1.put("Bus", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Bus", 1);
        map2.put("Bike", 6);

        Map<String, Integer> result = mergeMaps(map1, map2);
        System.out.println(result);

    }
}
