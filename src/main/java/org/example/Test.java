package org.example;

/**
 * Practice: Udemy course "Object-Oriented and Functional Programming with Java" by Akin Kaldiroglu
 * @author Farida Fatali
 * Factory Management System in Java for practice of Polymorphism.
 */

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Jon", "Davis", 4, "Production");
        System.out.println("Salary: " + e1.calculateSalary());
        e1.work();

        System.out.println();

        Manager m1 = new Manager(3, "Albert", "Jonathan", 17, "Sales", "Sales");
        System.out.println("Salary: " + m1.calculateSalary());
        m1.work();

        System.out.println();

        Director d1 = new Director(6, "Brad", "Johnson", 24, "Management", "Management", 4500);
        System.out.println("Salary: " + m1.calculateSalary());
        d1.work();
    }
}