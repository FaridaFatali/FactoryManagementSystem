package org.example;

public class Employee {
    protected int no;
    protected String name;
    protected String surname;
    protected int year;
    protected String department;

    public static final int BASE_SALARY = 500;

    public Employee(int no, String name, String surname, int year, String department) {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.department = department;
    }

    public Employee(int no, String name, String surname, int year) {
        this.no = no;
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public double calculateSalary() {
        return year * BASE_SALARY;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", department='" + department + '\'' +
                '}';
    }


}
