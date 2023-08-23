package org.example.assignment10;

class Doctor extends Person {

    private String specialization;
    private String doctorId;

    public Doctor(Person person, String specialization, String doctorId) {
        super(person.getName(), person.getAge());
        this.specialization = specialization;
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("Doctor ID: " + doctorId);
    }
}
