package org.example;

public class PayrollOffice {
    public void paySalary(Employee employee) {
        double salary = employee.calculateSalary();
        System.out.println("Paying a salary of " + salary + " to " + employee.getName() + " " + employee.getSurname());
    }
}
