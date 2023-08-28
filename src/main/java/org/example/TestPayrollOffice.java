package org.example;

public class TestPayrollOffice {
    public static void main(String[] args) {
        PayrollOffice payrollOffice = new PayrollOffice();

        Employee e1 = new Employee(1, "Joseph", "Statesman", 8, "Production");
        payrollOffice.paySalary(e1);

        Manager m1 = new Manager(2, "Angelina", "Lopez", 3, "Production", "Production");
        payrollOffice.paySalary(m1);

        Director d1 = new Director(3, "David", "Gonzales", 20, "Management", "Management", 3000);
        payrollOffice.paySalary(d1);

        Employee emp = e1;
        emp = m1;
        emp = d1;

        payrollOffice.paySalary(new Employee(4, "Mila", "Anniston", 12, "Sales"));
        payrollOffice.paySalary(new Manager(5, "Henry", "Graham", 13, "Sales", "Sales"));
        payrollOffice.paySalary(new Director(6, "Thomas", "David", 22, "Management", "Management", 5000));

        Engineer eng1 = new Engineer(7, "James", "Peterson", 12, "Production", "X ARGE");
        payrollOffice.paySalary(eng1);
    }
}
