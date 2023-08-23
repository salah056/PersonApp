package org.example.assignment10;

class Patient extends Person {

    private String patientId;
    private String medicalCondition;

    public Patient(Person person, String patientId, String medicalCondition) {
        super(person.getName(), person.getAge());
        this.patientId = patientId;
        this.medicalCondition = medicalCondition;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient ID: " + patientId);
        System.out.println("Medical Condition: " + medicalCondition);
    }
}