import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    Student myStudent = new Student("Micheal", 70.5 , 73.2 , "B");
    @Test
//    Given
    void testThatMyStudentClassCanInitializeVariables(){
// When
        assertEquals("Micheal", myStudent.getName());
        myStudent.setName("AbdulHameed");
        assertEquals("AbdulHameed", myStudent.getName());

        assertEquals(70.5, myStudent.getGrade());
        myStudent.setGrade(56.7);
        assertEquals(56.7, myStudent.getGrade());

        assertEquals(73.2, myStudent.getAverage());
        myStudent.setAverage(85.3);
        assertEquals(85.3, myStudent.getAverage());
    }
    @Test
    void testThatStudentsScoresCanBeGradedWithLetter(){
        assertEquals("B", myStudent.getLetterGrade());

    }
}