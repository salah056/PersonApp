package org.example;

import java.sql.SQLOutput;

public class Polyone {
    public void show(int a){

        System.out.println("Int method is called");
    }
    public void show(String a){
        System.out.println("Float method is called");

}

    public static void main(String[] args) {
        Polyone ob = new Polyone();
        ob.show('z');
    }
}
