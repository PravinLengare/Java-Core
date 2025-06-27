package Collection_Framework;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
public class Calender_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        // Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c1 = Calendar.getInstance();
        System.out.println(c1.getTimeZone().getID());
        System.out.println(c1.getCalendarType());

        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":"+ c.get(Calendar.MINUTE));
    // GregorianCalendar implementation

        GregorianCalendar gr = new GregorianCalendar();
        System.out.println(gr.isLeapYear(2019));
        System.out.println(gr.getMinimalDaysInFirstWeek());
        System.out.println(gr.getTimeZone().getID());
        System.out.println(gr.getFirstDayOfWeek());

    // java.time classes and methods

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}
