package gmail.taras.shevchuk0024.lesson41_Practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateNumbers {

    public static boolean isDuplicate(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.add(number)) {
                return true;
            }
        }
        return false;
    }
}
