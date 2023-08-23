package org.example.assignment10;

class HealthcareSystem {

    public static void main(String[] args) {

        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("Jane Doe", 35);

        Patient patient = new Patient(person1, "123456789", "Cancer");

        Doctor doctor = new Doctor(person2, "Cardiology", "987654321");

        patient.displayInfo();
        doctor.displayInfo();
    }
}