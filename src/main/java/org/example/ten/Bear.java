package org.example.ten;

public class Bear extends Animal{


    public Bear(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Bear class "+super.getName());
    }
}
