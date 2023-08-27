package org.example.class25;

public class Person {
    private String name ="Bob";
    private int age = 20;
    private static int salary = 2000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Person.salary = salary;
    }

    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", age=" + age +"Salary= "+ salary;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(28);
        p1.setName("Mohd");
        Person p2 = new Person();
        p2.setAge(27);
        p2.setName("Salah.M");
        Person p3 = new Person();
        p3.setName("mo");
        p3.setSalary(0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
