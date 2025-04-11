package gmail.taras.shevchuk0024.lesson37_Collections;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);

        int sum = NumberUtils.getSum(myNumbers);
        System.out.println("Сума чисел: " + sum);


        List<Integer> multipliedOdds = NumberUtils.multiplyOddNumber(myNumbers);
        System.out.println("Помножені непарні числа: " + multipliedOdds);
    }
}
