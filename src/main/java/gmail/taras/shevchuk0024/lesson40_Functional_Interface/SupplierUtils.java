package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierUtils {

    public static final String[] WEEK_DAYS = {
        "Понеділок",
        "Вівторок",
        "Середа",
        "Четвер",
        "Пʼятниця",
        "Субота",
        "Неділя"
    };

    public static Supplier<String> randomWeekDay = () -> {
        int randomWeekDayIndex = (int) (Math.random() * WEEK_DAYS.length);
        
        return WEEK_DAYS[randomWeekDayIndex];
    };
}
