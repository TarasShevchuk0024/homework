package gmail.taras.shevchuk0024.lesson40_Functional_Interface;

import java.util.function.Function;

public class FunctionUtils {
    public static Function<Double, Long> roundToLong = d -> Math.round(d);
}
