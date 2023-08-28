package org.example;

public class TestHRForManagers {
    public static void main(String[] args) {
        HR hr = new HRForManagers();
        Employee e = hr.getAnEmployee();
        System.out.println(e);

        HRForManagers hrfm = new HRForManagers();
        Manager m = hrfm.getAnEmployee();
        System.out.println(m);
    }
}
