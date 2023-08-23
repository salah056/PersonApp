package org.example.eight;

public class Job {

    private String title;
    private double salary;

    public Job() {
    }

    public Job(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayinfo(){
        System.out.println("Title: " + title);
        System.out.println("Salary: $" + salary);
    }
}

