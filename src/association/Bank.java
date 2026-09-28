package com.relaciones;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private String bankName;
    private Set<Employee> employees;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.employees = new HashSet<>();
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> getEmployees() {
        return this.employees;
    }
}