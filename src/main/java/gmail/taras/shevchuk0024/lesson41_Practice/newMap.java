package gmail.taras.shevchuk0024.lesson41_Practice;

import java.util.HashMap;
import java.util.Map;

public class newMap {

    public static Map<Integer, String> changedMap(Map<String, Integer> mainMap) {
        Map<Integer, String> changedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : mainMap.entrySet()) {
            Integer newKey = entry.getValue();
            String newValue = entry.getKey();

            changedMap.put(newKey, newValue);
        }
        return changedMap;
    }
}
