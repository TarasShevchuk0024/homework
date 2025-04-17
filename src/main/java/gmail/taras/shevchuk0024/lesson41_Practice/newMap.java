package gmail.taras.shevchuk0024.lesson41_Practice;

import java.util.HashMap;
import java.util.Map;

public class MapInverter {

    public static Map<Integer, String> invertMap(Map<String, Integer> originalMap) {
        Map<Integer, String> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            Integer newKey = entry.getValue();
            String newValue = entry.getKey();
            invertedMap.put(newKey, newValue);
        }

        return invertedMap;
    }
}
