package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumerTest {
    @Test
    void shouldThrowExceptionWhenGeneratingNumber() {
        // given
        int maxAmount = 100;
        // when + then
        Consumer.giveRandomNumber.accept(maxAmount);
    }
}