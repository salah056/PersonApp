package org.example.Tenclass;

public class MainAbstract {
    public static void main(String[] args) {
        database db = new HiibernateDb();
        db.setup();
        db.connect();
        db.endSetup();
        db.executeTransection();
    }
}
