package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import java.util.function.Function;

import static gmail.taras.shevchuk0024.lesson40_Functional_Interface.FunctionUtils.roundToLong;
import static gmail.taras.shevchuk0024.lesson40_Functional_Interface.PredicateUtils.isPrime;
import static gmail.taras.shevchuk0024.lesson40_Functional_Interface.UnaryOperatorUtils.fibonacci;

public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання №1 - Predicate: Перевірка простого числа:");
        System.out.println(isPrime.test(3));
        System.out.println(isPrime.test(40));
        System.out.println(" ");

        System.out.println("Завдання №2 Consumer: Випадкове число від 0 до 100:");
        int maxAmount = 100;
        ConsumerUtils.giveRandomNumber.accept(maxAmount);
        System.out.println(" ");

        System.out.println("Завдання №3 Supplier: Випадковий день тижня:");
        String day = SupplierUtils.randomWeekDay.get();
        System.out.println("Випадковий день: " + day);
        System.out.println(" ");

        System.out.println("Завдання №4 Function: Округлення Double до Long:");
        System.out.println(roundToLong.apply(7.4));
        System.out.println(roundToLong.apply(23.8));
        System.out.println(roundToLong.apply(65.2));
        System.out.println(" ");

        System.out.println("Завдання №5: UnaryOperator: Фібоначчі:");
        System.out.println(fibonacci.apply(0));
        System.out.println(fibonacci.apply(1));
        System.out.println(fibonacci.apply(10));
        System.out.println(fibonacci.apply(20));


    }
}
