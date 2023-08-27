package org.example.Tenclass;

public interface database {
     public abstract void setup();
     public abstract void connect();
     public abstract void executeTransection();
     public abstract void endSetup();

     public static final int timeout = 120;


}
