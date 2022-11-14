package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Dates {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatted = dateTimeFormatter.format(datetime);

        System.out.println(formatted);

        Calendar calendar = new GregorianCalendar();
        calendar.set(2022,10, 14,1,10,10);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.MONTH,-3);

        System.out.println(calendar.getTime());

        TimeZone timeZone = TimeZone.getDefault();

        System.out.println(timeZone.getDisplayName()+" \n"+timeZone.getID());

    }
}
