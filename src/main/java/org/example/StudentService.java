package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(100, "Siyabonga"),
            new Student(101, "Makwa"),
            new Student(102, "Lona")
    ));

    public List<Student> getAllStudents() {
        return this.students;
    }

    public void addStudent(Student student) {this.students.add(student);}
}
