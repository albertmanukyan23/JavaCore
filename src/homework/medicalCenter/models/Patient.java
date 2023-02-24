package homework.medicalCenter.models;

import homework.medicalCenter.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {
    private Date registerDateTime;
    private Doctor doctor;

    public Patient() {
    }

    public Patient(String name, String surname, String id, String phoneNumber, Date registerDateTime, Doctor doctor) {
        super(name, surname, id, phoneNumber);
        this.registerDateTime = registerDateTime;
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return Objects.equals(registerDateTime, patient.registerDateTime) && Objects.equals(doctor, patient.doctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registerDateTime, doctor);
    }

    @Override
    public String toString() {
        return super.toString() +
                "registerDateTime=" + DateUtil.dateToString(registerDateTime) +
                ", doctor=" + doctor +
                '}';
    }
}
