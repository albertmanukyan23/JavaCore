package homework.homework10.medicalCenter.storage;

import homework.homework10.medicalCenter.models.Doctor;
import homework.homework10.medicalCenter.models.Patient;
import homework.homework10.medicalCenter.models.Person;
import homework.homework10.medicalCenter.util.DateUtil;
import homework.homework10.medicalCenter.Profession;

import java.util.Date;

public class PersonStorage {
    private Person[] people = new Person[10];
    private int size = 0;

    public void add(Person person) {
        if (size == people.length) {
            extend();
        }
        people[size++] = person;
    }

    private void extend() {
        Person[] newArray = new Person[people.length + 10];
        System.arraycopy(people, 0, newArray, 0, size);
        people = newArray;
    }

    public Person getPersonById(String id) {
        for (int i = 0; i < size; i++) {
            if (people[i].getId().equals(id)) {
                return people[i];
            }
        }
        return null;
    }

    public int getPersonIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (people[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public Doctor[] searchByProfession(Profession profession) {
        Doctor[] doctors = new Doctor[size];
        int docCount = 0;
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor && ((Doctor) people[i]).getProfession() == profession) {
                doctors[docCount++] = (Doctor) people[i];
            }
        }
        Doctor[] matchingDoctors = new Doctor[docCount];
        System.arraycopy(doctors, 0, matchingDoctors, 0, docCount);
        return matchingDoctors;
    }

    public void deletePersonByIndex(int index) {
        for (int i = index + 1; i < size; i++) {
            people[i - 1] = people[i];
        }
        size--;
    }

    public void deletePatientsWithoutDoctor() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient && ((Patient) people[i]).getDoctor() == null) {
                deletePersonByIndex(i);
            }
        }
    }

    public boolean doctorIsAvailable(Doctor doctor, Date date) {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (patient.getDoctor().equals(doctor) && DateUtil.isFreeTime(patient.getRegisterDateTime(), date)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isDoctorExist() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                return true;
            }
        }
        return false;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                System.out.println(people[i] + " ");
            }
        }
    }

    public void printByDoctorName(String name) {
        boolean isExist = false;
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient && ((Patient) people[i]).getDoctor().getName().equals(name)) {
                isExist = true;
                System.out.println(people[i]);
            }
        }
        if (!isExist) {
            System.err.println("Patients were not found");
        }
    }

    public void printTodayPatients() {
        boolean patientIsExistToday = false;
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (DateUtil.isSameDay(patient.getRegisterDateTime())) {
                    patientIsExistToday = true;
                    System.out.println(patient);
                }
            }
        }
        if (!patientIsExistToday) {
            System.err.println("There are no registered patients yet");
        }
    }
}
