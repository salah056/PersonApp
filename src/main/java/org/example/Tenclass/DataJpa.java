package org.example.Tenclass;

public class DataJpa implements database {

    @Override
    public void setup() {
        System.out.println("dataJpa setup"+ timeout);
    }

    @Override
    public void connect() {
        System.out.println("dataJpa Connect");

    }

    @Override
    public void executeTransection() {
        System.out.println("dataJpa ExecuteTransection");

    }

    @Override
    public void endSetup() {
        System.out.println("dataJpa endsetup");

    }
}
