package org.example.ten;

public class Animal {

    private String name;

    public Animal() {
        this.name = "cat";
    }
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Name is "+this.name);
    }
}
