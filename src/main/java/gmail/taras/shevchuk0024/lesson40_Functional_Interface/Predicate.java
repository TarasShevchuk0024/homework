package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import java.util.function.Predicate;

public class PredicateUtils {
    public static Predicate<Integer> isPrime = number -> {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    };
}
