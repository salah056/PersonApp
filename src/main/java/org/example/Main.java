package org.example;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);



        System.out.println("The element at index 0 is: " + numbers.get(0));
        System.out.println("The element at index 1 is: " + numbers.get(1));
        System.out.println("The element at index 2 is: " + numbers.get(2));


        int size = numbers.size();
        System.out.println("The size of the ArrayList is: " + size);

        numbers.remove(1);


        boolean contains = numbers.contains(10);
        System.out.println("Does the ArrayList contain 10? " + contains);

        numbers.clear();
        System.out.println("The ArrayList is cleared.");
    }
}
