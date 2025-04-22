package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnaryOperatorTest {
    @Test
    void shouldReturnCorrectFibonacciNumber() {
        // given
        int value = 20;

        // when
        int result = UnaryOperator.fibonacci.apply(value);

        // then
        assertEquals(6765, result);
    }
}