package homework.homework10.medicalCenter;

import homework.homework10.medicalCenter.models.Doctor;
import homework.homework10.medicalCenter.models.Patient;
import homework.homework10.medicalCenter.models.Person;
import homework.homework10.medicalCenter.storage.PersonStorage;
import homework.homework10.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Scanner;

import static homework.homework10.medicalCenter.Commands.*;

public class MedicalCenterDemo {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final PersonStorage PERSON_STORAGE = new PersonStorage();

    public static void main(String[] args) {
        boolean isRunning = true;
        while (isRunning) {
            Commands.printCommands();
            String command = SCANNER.nextLine();
            switch (command) {
                case EXIT:
                    isRunning = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAY_PATIENTS:
                    PERSON_STORAGE.printTodayPatients();
                    break;
                default:
                    System.err.println("Wrong command, Please try again");
            }
        }
    }

    private static void printDoctorPossibleProfessions() {
        Profession[] professions = Profession.values();
        for (Profession profession : professions) {
            System.out.println(profession);
        }
    }

    private static void addDoctor() {
        System.out.println("Please input name,surname,id,phone number and email");
        String[] data = SCANNER.nextLine().split(",");
        System.out.println("Please choose doctor's profession");
        printDoctorPossibleProfessions();
        String professionStr = SCANNER.nextLine();
        try {
            if (PERSON_STORAGE.getPersonById(data[2]) != null) {
                System.out.println("This id is already exists ,Please try again");
                return;
            }
            Profession profession = Profession.valueOf(professionStr);
            Doctor doctor = new Doctor(data[0], data[1], data[2], data[3], profession, data[4]);
            PERSON_STORAGE.add(doctor);
            System.out.println("Your registration was successful!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Please fill all fields");
        } catch (IllegalArgumentException e) {
            System.out.println(" Invalid input: there is no doctor with that specialty in the clinic.");
        }
    }

    private static void searchDoctorByProfession() {
        try {
            printDoctorPossibleProfessions();
            System.out.println("Please choose doctor's profession");
            String professionStr = SCANNER.nextLine();
            Profession prof = Profession.valueOf(professionStr);
            Doctor[] doctors = PERSON_STORAGE.searchByProfession(prof);
            if (doctors.length == 0) {
                System.err.println("Doctor with such specialty wasn't found");
                return;
            }
            for (Doctor doctor : doctors) {
                if (doctor != null) {
                    System.out.println(doctor);
                }
            }
        } catch (IllegalArgumentException e) {
            System.err.println("The profession was wrongly chosen.");
        }
    }

    private static void deleteDoctorById() {
        if (!PERSON_STORAGE.isDoctorExist()) {
            System.err.println("Please add doctor first");
            return;
        }
        PERSON_STORAGE.printDoctors();
        System.out.println("Please choose doctor's id");
        String idStr = SCANNER.nextLine();
        Person personById = PERSON_STORAGE.getPersonById(idStr);
        if (!(personById instanceof Doctor)) {
            System.err.println("Wrong id,Please write id correctly");
            return;
        }

        int index = PERSON_STORAGE.getPersonIndexById(idStr);
        PERSON_STORAGE.deletePersonByIndex(index);
        PERSON_STORAGE.deletePatientsWithoutDoctor();
        System.out.println("Doctor was deleted ");

    }

    private static void changeDoctorDataById() {
        if (!PERSON_STORAGE.isDoctorExist()) {
            System.err.println("Please add doctor first");
            return;
        }
        PERSON_STORAGE.printDoctors();
        System.out.println("Please choose doctor's id");
        String idStr = SCANNER.nextLine();
        Person personById = PERSON_STORAGE.getPersonById(idStr);
        if (personById instanceof Doctor) {
            try {
                Doctor doctor = (Doctor) personById;
                System.out.println("Professions of our clinic");
                printDoctorPossibleProfessions();
                System.out.println("Input name,surname,phone,email,profession");
                String[] docData = SCANNER.nextLine().split(",");
                doctor.setName(docData[0]);
                doctor.setSurname(docData[1]);
                doctor.setPhoneNumber(docData[2]);
                doctor.setEmail(docData[3]);
                doctor.setProfession(Profession.valueOf(docData[4]));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Please fill all fields");
            } catch (IllegalArgumentException e) {
                System.out.println("The profession was wrongly chosen");
            }
        } else
            System.err.println("Wrong id,Please write id correctly");
    }

    private static void addPatient() {
        if (!PERSON_STORAGE.isDoctorExist()) {
            System.err.println("Please add doctor first");
            return;
        }
        PERSON_STORAGE.printDoctors();
        System.out.println("Choose doctor by id");
        String doctorId = SCANNER.nextLine();
        Person doc = PERSON_STORAGE.getPersonById(doctorId);
        if (doc instanceof Doctor) {
            Doctor doctor = (Doctor) doc;
            try {
                System.out.println("Please input patient's name, surname, id,Phone number, register date time (00/00/0000 00:00)");
                String[] patientData = SCANNER.nextLine().split(",");
                if (PERSON_STORAGE.getPersonById(patientData[2]) != null) {
                    System.out.println("This id is already exists ,Please try again");
                    return;
                }
                if (!PERSON_STORAGE.doctorIsAvailable(doctor, DateUtil.stringToDate(patientData[4]))) {
                    System.out.println("The doctor is busy at that time");
                    return;
                }
                Patient patient = new Patient(patientData[0], patientData[1], patientData[2], patientData[3], DateUtil.stringToDate(patientData[4]), doctor);
                PERSON_STORAGE.add(patient);
                System.out.println("Your registration was successful");
            } catch (ParseException e) {
                System.out.println("Please write date correctly!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Please fill all fields");
            }
        } else System.err.println("Wrong id");
    }

    private static void printAllPatientsByDoctor() {
        if (!PERSON_STORAGE.isDoctorExist()) {
            System.err.println("Please input doctor first");
            return;
        }
        PERSON_STORAGE.printDoctors();
        System.out.println("Please input doctor's name");
        String name = SCANNER.nextLine();
        PERSON_STORAGE.printByDoctorName(name);
    }
}

