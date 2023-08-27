package org.example.class24;

public class Abc {
    private int i = 20;

    public Abc() {
        System.out.println("Default Constructor");
    }

    public Abc(int i) {
        this();
        this.i = i;
        System.out.println(this.i);
    }

    public static void main(String[] args) {
        Abc ob = new Abc(1);
        Abc ob2 = new Abc(200);
    }
}
