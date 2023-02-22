package homework.medicalCenter.util;

import homework.medicalCenter.models.Doctor;

public class DoctorUtil {
    public static void doctorDataSetter(String changingPos, String newData, Doctor doctor) {
        switch (changingPos) {
            case "name":
                doctor.setName(newData);
                break;
            case "surname":
                doctor.setSurname(newData);
                break;
            case "phone number":
                doctor.setPhoneNumber(newData);
                break;
            case "profession":
                doctor.setProfession(newData);
                break;
            case "email":
                doctor.setEmail(newData);
                break;
            default:
                System.out.println("Please try again");
        }
    }

}
