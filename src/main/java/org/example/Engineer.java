package org.example;

public class Engineer extends Employee {
    private String project;

    public Engineer(int no, String name, String surname, int year, String department, String project) {
        super(no, name, surname, year, department);
        this.project = project;
    }

    public void work() {
        System.out.println("Engineer is working on a project: " + project);
        assignTask("A very important task.");
    }

    public void assignTask(String task) {
        System.out.println("Engineer " + name + " works on the task: " + task);
    }

}
