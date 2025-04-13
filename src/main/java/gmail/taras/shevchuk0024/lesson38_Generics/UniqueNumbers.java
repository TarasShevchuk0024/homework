package gmail.taras.shevchuk0024.lesson38_Generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumbers {
    public static List<Integer> getUniqueNumbers(List<Integer> numbers) {
        Set<Integer> checked = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (!checked.contains(number)) {
                checked.add(number);
                result.add(number);
            }
        }
        return result;
    }
}
