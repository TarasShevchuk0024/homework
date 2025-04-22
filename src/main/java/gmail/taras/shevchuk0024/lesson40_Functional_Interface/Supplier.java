package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import java.util.ArrayList;

public class Supplier {
    public static java.util.function.Supplier<String> randomWeekDay = () -> {
        ArrayList<String> days = new ArrayList<>();
        days.add("Понеділок");
        days.add("Вівторок");
        days.add("Середа");
        days.add("Четвер");
        days.add("Пʼятниця");
        days.add("Субота");
        days.add("Неділя");

        int value = (int) (Math.random() * days.size());
        return days.get(value);
    };
}
