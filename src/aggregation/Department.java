package com.relaciones;

import java.util.List;

public class Department {
    private String deptName;
    private List<Student> students;

    public Department(String deptName, List<Student> students) {
        this.deptName = deptName;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}