package homework.medicalCenter.models;

import homework.medicalCenter.util.CalendarUtil;

import java.util.Calendar;
import java.util.Objects;

public class Patient extends Person {
    private Calendar registerDateTime;
    private Doctor doctor;

    public Patient() {
    }

    public Patient(String name, String surname, String id, String phoneNumber, Calendar registerDateTime, Doctor doctor) {
        super(name, surname, id, phoneNumber);
        this.registerDateTime = registerDateTime;
        this.doctor = doctor;
    }

    public Calendar getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Calendar registerDateTime) {
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
        return Objects.equals(registerDateTime, patient.registerDateTime) && Objects.equals(doctor, patient.doctor) &&
                Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && Objects.equals(id, patient.id) && Objects.equals(phoneNumber, patient.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), registerDateTime, doctor);
    }

    @Override
    public String toString() {
        return "Patient{" +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "registerDateTime=" + CalendarUtil.calendarToString(registerDateTime) +
                ", doctor=" + doctor +
                '}';
    }
}
