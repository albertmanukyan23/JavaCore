package homework.employee.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
   private static final SimpleDateFormat  SDF = new SimpleDateFormat("dd/MM/yyyy");
   public static Date stringToDate(String date) throws ParseException {
       if (date == null){
           return  null;
       }
       return SDF.parse(date);
   }
   public  static String dateToString(Date date){
       if (date == null){
           return null;
       }
       return  SDF.format(date);

   }
}
