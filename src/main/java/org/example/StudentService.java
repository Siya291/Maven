package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<Student>();

    public List<Student> getAllStudents() {
        return this.students;
    }

    public void addStudents(Student student) {this.students.addAll(students);}
}
