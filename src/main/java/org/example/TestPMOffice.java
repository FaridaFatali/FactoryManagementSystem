package org.example;

public class TestPMOffice {
    public static void main(String[] args) {
        PMOffice pmOffice = new PMOffice();

        Manager m1 = new Manager(3, "Albert", "Jonathan", 17, "Sales", "Sales");
        pmOffice.manageProject("ProjectX", m1);

        Director d1 = new Director(6, "Brad", "Johnson", 24, "Management", "Management", 4500);
        pmOffice.manageProject("ProjectY", d1);

        Employee e1 = new Employee(1, "Jon", "Davis", 4, "Production");
    }
}
