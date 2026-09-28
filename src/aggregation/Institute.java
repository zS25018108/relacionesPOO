package com.relaciones;

import java.util.List;

public class Institute {
    private String instituteName;
    private List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        for (Department dept : departments) {
            List<Student> students = dept.getStudents();
            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}