package homework.medicalCenter.storage;

import homework.medicalCenter.models.Doctor;
import homework.medicalCenter.models.Patient;
import homework.medicalCenter.models.Person;
import homework.medicalCenter.util.DateUtil;

import java.util.Calendar;
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

    public Doctor[] searchByProfession(String profession) {
        Doctor[] doctors = new Doctor[size];
        int docCount = 0;
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor && ((Doctor) people[i]).getProfession().equals(profession)) {
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
        if (size == 0) {
            System.err.println("The storage is empty");
            return;
        }
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
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (DateUtil.isSameDay(patient.getRegisterDateTime())) {
                    System.out.println(patient);
                }
            }
        }
    }

}
