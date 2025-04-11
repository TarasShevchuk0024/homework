package gmail.taras.shevchuk0024.lesson37_Collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void shouldReturnCorrectSumOfNumbers() {
        // given
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
        // when
        int result = NumberUtils.getSum(numbers);
        // then
        assertEquals(495, result);
    }

    @Test
    void shouldMultiplyOddNumbersByTwo() {
        // given
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
        // when
        List<Integer> result = NumberUtils.multiplyOddNumber(numbers);
        // then
        List<Integer> expected = Arrays.asList(22, 66, 110, 154, 198);
        assertEquals(expected, result);
    }
}