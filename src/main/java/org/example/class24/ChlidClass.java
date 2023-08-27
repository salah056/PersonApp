package org.example.class24;

public class ChlidClass extends Abcd {
    public ChlidClass() {
        super();
    }

    public ChlidClass(String name) {
        super(name);
    }
    public void show(){
        super.displayinfo();
    }

    public static void main(String[] args) {
        ChlidClass ob = new ChlidClass("salah");
                ob.show();
    }
}
