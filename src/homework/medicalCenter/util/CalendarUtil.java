package homework.medicalCenter.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {
    private static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public static Calendar stringToCalendar(String date) throws ParseException {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        Date inputDate = SDF.parse(date);
        calendar.setTime(inputDate);
        return calendar;
    }

    public static String calendarToString(Calendar calendar) {
        if (calendar == null) {
            return null;
        }
        return SDF.format(calendar.getTime());
    }

    public static int getDayOfWeekInMonth() {
        Calendar today = Calendar.getInstance();
        return today.get(Calendar.DAY_OF_MONTH);
    }
}
