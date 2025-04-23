package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SupplierTest {
    @Test
    void shouldReturnTheCorrectDayOfTheWeek() {
        // given
        ArrayList<String> days = new ArrayList<>();
        days.add("Понеділок");
        days.add("Вівторок");
        days.add("Середа");
        days.add("Четвер");
        days.add("Пʼятниця");
        days.add("Субота");
        days.add("Неділя");
        Supplier<String> randomWeekDay = () -> {
            int value = (int) (Math.random() * days.size());
            return days.get(value);
        };
        // when
        String day = randomWeekDay.get();

        // then
        assertTrue(days.contains(day));
    }
}