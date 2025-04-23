package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import java.util.function.Consumer;

public class ConsumerUtils {
    public static Consumer<Integer> giveRandomNumber = maxNumber -> {
        int result = (int) (Math.random() * (maxNumber + 1));
        System.out.println("Випадкове число: " + result);
    };
}
