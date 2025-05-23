package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import java.util.function.UnaryOperator;

public class UnaryOperatorUtils {
    public static UnaryOperator<Integer> fibonacci = n -> {
        if (n == 0) {
            return 0;
        }
        
        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    };
}
