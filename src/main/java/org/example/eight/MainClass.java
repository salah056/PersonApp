package org.example.eight;

public class MainClass {
//    public static void main(String[] args) {
//
//            OverloadedMethods calculator = new OverloadedMethods();
//
//            System.out.println("Sum of two integers: " + calculator.add(5, 10));
//            System.out.println("Sum of three integers: " + calculator.add(5, 10, 15));
//            System.out.println("Sum of two doubles: " + calculator.add(3.5, 2.7));
//    }

    public static void main(String[] args) {
        Job softwareEngineer = new Job("Software Engineer", 80000);
        Person person = new Person("Alice", 30, softwareEngineer);
        person.display_info();
    }
}


