package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicateTest {
    @Test
    void shouldReturnTrueWhenNumberIsPrime() {
        // given
        int number = 3;
        // when
        boolean result = Predicate.isSimple.test(number);
        // then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseWhenNumberIsNotPrime() {
        // given
        int number = 40;
        // when
        boolean result = Predicate.isSimple.test(number);
        // then
        assertFalse(result);
    }
}
