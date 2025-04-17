package gmail.taras.shevchuk0024.lesson41_Practice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class newMapTest {
    @Test
    void shouldChangeMap() {
        // given
        Map<String, Integer> mainMap = new HashMap<>();
        mainMap.put("Молоток", 15);
        mainMap.put("Відро", 25);

        // when
        Map<Integer, String> result = newMap.changedMap(mainMap);

        // then
        assertEquals("Молоток", result.get(15));
        assertEquals("Відро", result.get(25));
    }

    @Test
    void shouldChangeMapWithDuplicateValues() {
        // given
        Map<String, Integer> mainMap = new HashMap<>();
        mainMap.put("Молоток", 15);
        mainMap.put("Лопата", 15);
        mainMap.put("Пила", 30);

        // when
        Map<Integer, String> result = newMap.changedMap(mainMap);

        // then
        assertTrue(result.containsKey(15));
        assertTrue(result.containsKey(30));
    }
}