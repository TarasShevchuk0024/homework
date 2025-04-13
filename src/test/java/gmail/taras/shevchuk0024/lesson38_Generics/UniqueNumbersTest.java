package gmail.taras.shevchuk0024.lesson38_Generics;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumbersTest {
    @Test
    void shouldReturnListWithUniqueNumbers() {
        // given
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 40, 50, 30, 60);
        // when
        List<Integer> result = UniqueNumbers.getUniqueNumbers(numbers);
        // then
        List<Integer> expected = Arrays.asList(10, 20, 30, 40, 50, 60);
        assertEquals(expected, result);
    }

}