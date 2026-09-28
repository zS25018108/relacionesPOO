package com.relaciones;

public class Student {
    private String studentName;
    private int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public int getstudentId() {
        return studentId;
    }

    public String getstudentName() {
        return studentName;
    }
}