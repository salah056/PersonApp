package org.example.Tenclass;

public class HiibernateDb implements database {

    @Override
    public void setup() {
        System.out.println("hibernate setup"+ timeout);

    }

    @Override
    public void connect() {
        System.out.println("hibernate connect");

    }

    @Override
    public void executeTransection() {
        System.out.println("hibernate executeTransection");

    }

    @Override
    public void endSetup() {
        System.out.println("hibernate endsetup");

    }
}
