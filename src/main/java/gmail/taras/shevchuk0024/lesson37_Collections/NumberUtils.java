package gmail.taras.shevchuk0024.lesson37_Collections;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static double getSum(List<Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                result.add(number * 2);
            }
        }
        return result;
    }

}