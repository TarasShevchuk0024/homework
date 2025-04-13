package gmail.taras.shevchuk0024.lesson38_Generics;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapsTest {
    @Test
    void shouldMergeTwoMapsCorrectly() {
        // given
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Car", 2);
        map1.put("Bus", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Bus", 1);
        map2.put("Bike", 6);

        // when
        Map<String, Integer> result = Maps.mergeMaps(map1, map2);

        // then
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Car", 2);
        expected.put("Bus", 4);
        expected.put("Bike", 6);

        assertEquals(expected, result);
    }
}