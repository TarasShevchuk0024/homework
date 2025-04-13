package gmail.taras.shevchuk0024.lesson38_Generics;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> element : map2.entrySet()) {
            String key = element.getKey();
            Integer value = element.getValue();

            if (result.containsKey(key)) {
                result.put(key, result.get(key) + value);
            } else {
                result.put(key, value);
            }
        }
        return result;
    }

}
