package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

public class Consumer {
    public static java.util.function.Consumer<Integer> giveRandomNumber = maxAmount -> {
        int result = (int) (Math.random() * (maxAmount + 1));
        System.out.println("Випадкове число: " + result);
    };
}
