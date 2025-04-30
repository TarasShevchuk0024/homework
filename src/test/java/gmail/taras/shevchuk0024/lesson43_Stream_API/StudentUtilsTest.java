package gmail.taras.shevchuk0024.lesson43_Stream_API;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StudentUtilsTest {
    private static final Student STUDENT_OLEH = new Student("Oleh", 19, 3.3);
    private static final Student STUDENT_TARAS = new Student("Taras", 20, 4.6);
    private static final Student STUDENT_ROMAN = new Student("Roman", 18, 4.1);
    private static final Student STUDENT_NAZAR = new Student("Nazar", 21, 3.6);
    private static final Student STUDENT_ANNA = new Student("Anna", 22, 4.4);
    private static final Student STUDENT_OLHA = new Student("Olha", 18, 3.9);

    private static final List<Student> STUDENTS = List.of(
            STUDENT_OLEH,
            STUDENT_TARAS,
            STUDENT_ROMAN,
            STUDENT_NAZAR,
            STUDENT_ANNA,
            STUDENT_OLHA
    );

    @Test
    void getStudentsWithLowGrade() {
        // given STUDENTS (constant)
        List<Student> expectedStudentsWithLowGrade = List.of(
                STUDENT_OLEH,
                STUDENT_NAZAR,
                STUDENT_OLHA
        );

        // when
        List<Student> studentsWithLowGrade = StudentUtils.getStudentsWithLowGrade(STUDENTS);

        // then
        assertEquals(expectedStudentsWithLowGrade.size(), studentsWithLowGrade.size());
        assertTrue(studentsWithLowGrade.containsAll(expectedStudentsWithLowGrade));
    }

    @Test
    void getStudentsWithHighGrade() {
        // given
        List<Student> expectedStudentsWithHighGrade = List.of(
                STUDENT_TARAS,
                STUDENT_ROMAN,
                STUDENT_ANNA
        );

        // when
        List<Student> studentsWithHighGrade = StudentUtils.getStudentsWithHighGrade(STUDENTS);

        // then
        assertEquals(expectedStudentsWithHighGrade.size(), studentsWithHighGrade.size());
        assertTrue(studentsWithHighGrade.containsAll(expectedStudentsWithHighGrade));
    }

    @Test
    void getStudentWithHighestGrade() {
        // given
        Student student = STUDENT_TARAS;

        // when
        Optional<Student> result = StudentUtils.getStudentWithHighestGrade(STUDENTS);

        // then
        assertEquals(student, result.get());
        assertTrue(result.isPresent());
    }

    @Test
    void isAnyStudentWithGrade5Exists() {
        // given
        List<Student> expectedStudentsWithGradeFive = List.of(
                STUDENT_TARAS,
                STUDENT_ROMAN,
                STUDENT_ANNA,
                STUDENT_OLEH,
                STUDENT_NAZAR,
                STUDENT_OLHA
        );
        // when
        boolean exists = StudentUtils.isAnyStudentWithGrade5Exists(STUDENTS);

        // then
        assertFalse(exists);
    }

    @Test
    void getNumberOfStudentsOlderThan20YearsOld() {
        // given
        long studentsAmount = 2;

        // when
        long result = StudentUtils.getNumberOfStudentsOlderThan20YearsOld(STUDENTS);

        // then
        assertEquals(studentsAmount, result);
    }

    @Test
    void sortByGradeDescending() {
        // given
        List<Student> expectedStudents = List.of(
                STUDENT_TARAS,
                STUDENT_ANNA,
                STUDENT_ROMAN,
                STUDENT_OLHA,
                STUDENT_NAZAR,
                STUDENT_OLEH
        );
        // when
        List<Student> result = StudentUtils.sortByGradeDescending(STUDENTS);

        // then
        assertEquals(expectedStudents, result);
    }

}