package org.example;

public class HR {
    public Employee getAnEmployee() {
        Employee e = null;
        int i = (int) (5 * Math.random());

        switch (i) {
            case 0 -> e = new Employee(1, "Jon", "Davis", 4, "Production");
            case 1 -> e = new Secretary(2, "Jennifer", "Vegas", 9, "Sales",
                    new Manager(3, "Albert", "Jonathan", 17, "Sales", "Sales"));
            case 2 -> e = new Engineer(4, "Allan", "Bruno", 5, "Production", "Improving production");
            case 3 -> e = new Manager(5, "Elba", "Wisdom", 14, "Production", "Production");
            case 4 -> e = new Director(6, "Brad", "Johnson", 24, "Management", "Management", 4500);
        }
        return e;
    }
}
