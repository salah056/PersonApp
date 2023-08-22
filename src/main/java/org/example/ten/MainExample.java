package org.example.ten;

import java.util.ArrayList;

public class MainExample {
    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        Animal a1 = new Animal("corcodile");
        Animal a2 = new Animal();

        Bear b1 = new Bear("bear bear");

        Dog d1 = new  Dog("Gerbmam");

        list.add(a1);
        list.add(a2);
        list.add(b1);
        list.add(d1);
        for (Animal a:list) {
            a.speak();
        }
    }
}
