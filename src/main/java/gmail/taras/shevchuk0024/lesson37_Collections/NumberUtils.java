package gmail.taras.shevchuk0024.lesson37_Collections;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static double getSum(List<Integer> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static List<Long> multiplyOddNumber(List<Integer> numbers) {
        List<Long> result = new ArrayList<>();
        for (Number number : numbers) {
            if (number.longValue() % 2 != 0) {
                result.add(number.longValue() * 2);
            }
        }
        return result;
    }

}