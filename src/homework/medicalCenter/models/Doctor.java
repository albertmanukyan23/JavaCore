package homework.medicalCenter.models;

import java.util.Objects;

public class Doctor extends Person {
    private String profession;
    private String email;

    public Doctor() {
    }

    ;

    public Doctor(String name, String surname, String id, String phoneNumber, String profession, String email) {
        super(name, surname, id, phoneNumber);
        this.profession = profession;
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(profession, doctor.profession) && Objects.equals(email, doctor.email) &&
                Objects.equals(name, doctor.name) && Objects.equals(surname, doctor.surname) && Objects.equals(id, doctor.id) && Objects.equals(phoneNumber, doctor.phoneNumber);

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), profession, email);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                " name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
