package org.example.class24;

public class Abcd {
    private String name = "bob";

    public Abcd() {
    }

    public Abcd(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayinfo(){
        System.out.println("Super class");
    }
}
