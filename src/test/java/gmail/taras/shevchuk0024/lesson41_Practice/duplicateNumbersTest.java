package gmail.taras.shevchuk0024.lesson41_Practice;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class duplicateNumbersTest {
    @Test
    void shouldReturnFalseWhenListHasNoDuplicateNumbers() {
        //given
        List<Integer> listWithoutDuplicateNumbers = List.of(10, 20, 30, 40);

        // when
        boolean result = duplicateNumbers.isDuplicate(listWithoutDuplicateNumbers);

        // then
        assertFalse(result);
    }

    @Test
    void shouldReturnTrueWhenListHasDuplicateNumbers() {
        // given
        List<Integer> listWithDuplicateNumbers = List.of(10, 20, 30, 10);

        // when
        boolean result = duplicateNumbers.isDuplicate(listWithDuplicateNumbers);

        // then
        assertTrue(result);
    }

}