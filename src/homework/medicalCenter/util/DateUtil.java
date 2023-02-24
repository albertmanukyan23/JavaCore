package homework.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
  private  static  final Calendar calendarOfFirstPatient = Calendar.getInstance();
   private static final Calendar calendarOfSecondPatient = Calendar.getInstance();
    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static Date stringToDate(String date) throws ParseException {
        if (date == null) {
            return null;
        }
        return SDF.parse(date);
    }

    public static String dateToString(Date date) {
        if (date == null) {
            return null;
        }
        return SDF.format(date);
    }

    public static int getDayOfWeekInMonth() {
        Calendar today = Calendar.getInstance();
        return today.get(Calendar.DAY_OF_MONTH);
    }

    public static boolean isSameDayAndYear(Date regPatientDate, Date newPatientDate) {
        calendarOfFirstPatient.setTime(regPatientDate);
        calendarOfSecondPatient.setTime(newPatientDate);
        Calendar calendarRange1 = (Calendar) calendarOfFirstPatient.clone();
        calendarRange1.add(Calendar.MINUTE, 30);
        Calendar calendarRange2 = (Calendar) calendarOfFirstPatient.clone();
        calendarRange1.add(Calendar.MINUTE, -30);
              return  calendarOfFirstPatient.get(Calendar.DAY_OF_MONTH) == calendarOfSecondPatient.get(Calendar.DAY_OF_MONTH) &&
                      (calendarOfSecondPatient.before(calendarRange1) || calendarOfSecondPatient.after(calendarRange2));
    }
}
