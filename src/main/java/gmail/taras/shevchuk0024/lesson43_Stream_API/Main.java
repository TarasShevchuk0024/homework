package gmail.taras.shevchuk0024.lesson43_Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Oleh", 19, 3.3),
                new Student("Taras", 20, 4.6),
                new Student("Roman", 18, 4.1),
                new Student("Nazar", 21, 3.6),
                new Student("Anna", 22, 4.4),
                new Student("Olha", 18, 3.9)
        );

        List<Student> namesWithLowGrades = students.stream()
                .filter(student -> student.getGrade() < 4.0)
                .collect(Collectors.toList());
        System.out.println("1. Студенти з оцінкою менше 4.0: " + namesWithLowGrades);
        System.out.println(" ");

        Optional<Student> highestGrade = students.stream()
                .max(Comparator.comparing(Student::getGrade));
        System.out.println("2. Найкращий студент: " + highestGrade);
        System.out.println(" ");

        long olderThan20 = students.stream()
                .filter(student -> student.getAge() > 20)
                .count();
        System.out.println("3. Студенти, які старші за 20 років: " + olderThan20);
        System.out.println(" ");

        List<Student> sortedNames = students.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .collect(Collectors.toList());
        System.out.println("4. Імена студентів за спаданням оцінки: " + sortedNames);
        System.out.println(" ");

        boolean hasGradeFive = students.stream()
                .anyMatch(student -> student.getGrade() == 5.0);
        System.out.println("5. Чи є студент з оцінкою 5.0 ?: " + hasGradeFive);
        System.out.println(" ");

        List<Student> namesWithHighGrade = students.stream()
                .filter(student -> student.getGrade() > 4.0)
                .collect(Collectors.toList());
        System.out.println("6. Студенти з оцінкою > 4.0: " + namesWithHighGrade);
    }
}
