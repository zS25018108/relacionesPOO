package com.relaciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===Relaciones POO===");
        System.out.println("1) Asociación");
        System.out.println("2) Agregación");
        System.out.println("3) Composición");
        System.out.print("Opción: ");

        int opcion = in.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\n--- Ejemplo de Asociación ---");
                Bank bank = new Bank("BBVA");
                Employee emp1 = new Employee("Carlos");
                Employee emp2 = new Employee("Ana");

                Set<Employee> employees = new HashSet<>();
                employees.add(emp1);
                employees.add(emp2);

                bank.setEmployees(employees);

                System.out.println("Banco: " + bank.getBankName());
                System.out.println("Empleados asociados:");
                for (Employee e : bank.getEmployees()) {
                    System.out.println("- " + e.getName());
                }
                break;

            case 2:
                System.out.println("\n--- Ejemplo de Agregación ---");
                Student s1 = new Student("Parul", 1);
                Student s2 = new Student("Sachin", 2);
                Student s3 = new Student("Priya", 1);
                Student s4 = new Student("Rahul", 2);

                List<Student> cse_students = new ArrayList<>();
                cse_students.add(s1);
                cse_students.add(s2);

                List<Student> ee_students = new ArrayList<>();
                ee_students.add(s3);
                ee_students.add(s4);

                Department CSE = new Department("CSE", cse_students);
                Department EE = new Department("EE", ee_students);

                List<Department> departments = new ArrayList<>();
                departments.add(CSE);
                departments.add(EE);

                Institute institute = new Institute("BITS", departments);

                System.out.println("Total de estudiantes en el instituto: " + institute.getTotalStudentsInInstitute());
                break;

            case 3:
                System.out.println("\n--- Ejemplo de Composición ---");
                House house = new House("Dream House");

                house.addRoom(new Room("Living Room"));
                house.addRoom(new Room("Bedroom"));
                house.addRoom(new Room("Kitchen"));
                house.addRoom(new Room("Bathroom"));

                System.out.println("Total de habitaciones: " + house.getTotalRooms());
                System.out.println("Lista de habitaciones:");
                for (Room room : house.getRooms()) {
                    System.out.println("- " + room.getRoomName());
                }
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }

        in.close();
    }
}