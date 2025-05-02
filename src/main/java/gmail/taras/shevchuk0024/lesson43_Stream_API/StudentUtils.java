package gmail.taras.shevchuk0024.lesson43_Stream_API;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentUtils {

    public static List<Student> getStudentsWithLowGrade(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrade() < 4.0)
                .collect(Collectors.toList());
    }

    public static List<Student> getStudentsWithHighGrade(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrade() > 4.0)
                .collect(Collectors.toList());
    }

    public static Optional<Student> getStudentWithHighestGrade(List<Student> students) {
        return students.stream()
                .max(Comparator.comparing(Student::getGrade));
    }

    public static boolean isAnyStudentWithGrade5Exists(List<Student> students) {
        return students.stream()
                .anyMatch(student -> student.getGrade() == 5.0);
    }

    public static long getNumberOfStudentsOlderThan20YearsOld(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAge() > 20)
                .count();
    }

    public static List<Student> sortByGradeDescending(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());
    }
}
