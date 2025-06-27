package Collection_Framework;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(df1);

        String myDate = dt.format(df1);
        myDate = dt.format(df);
        System.out.println(myDate);
    }
}
