package org.example;

public class Manager extends Employee {
    protected String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 3000;

    public Manager(int no, String name, String surname, int year, String workingDepartment, String departmentManaged) {
        super(no, name, surname, year, workingDepartment);
        this.departmentManaged = departmentManaged;
    }

    public Manager(int no, String name, String surname, int year, String departmentManaged) {
        super(no, name, surname, year);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void work() {
        System.out.println("Manager is working!");
        manage();
    }

    public void manage() {
        System.out.println("Manager manages department: " + departmentManaged);
    }

    public void manageProject(String projectName) {
        System.out.println("Manager manages the project: " + projectName);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + MANAGEMENT_PAYMENT;
    }

    @Override
    public String toString() {
        return "Manager: " +
                "Department Managed - " + departmentManaged +
                ", no - " + no +
                ", name - " + name +
                ", surname - " + surname +
                ", year - " + year +
                ", department - " + department
                ;
    }
}
