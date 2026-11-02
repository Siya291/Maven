package org.example;

import junit.framework.TestCase;
import java.util.List;

public class StudentServiceTest extends TestCase {

    StudentService studentService = new StudentService();

    public void testGetAllStudents() {

        List<Student> actualResults = studentService.getAllStudents();

        assertEquals(3, actualResults.size());
    }

    public void testAddStudent() {
        Student student1 = new Student(104, "Ntiyiso");

        studentService.addStudent(student1);

        List<Student> allStudents = studentService.getAllStudents();
        assertTrue(allStudents.contains(student1));
    }
}