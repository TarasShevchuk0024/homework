package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {
    @Test
    void shouldRoundDoubleToLong() {
        // given
        Double value = 65.2;

        // when
        Long result = Function.roundToLong.apply(value);

        // then
        assertEquals(65, result);
    }
}