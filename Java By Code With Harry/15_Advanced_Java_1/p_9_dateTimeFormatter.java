import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class p_9_dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-YYYY -- E a");
        String mydate = dt.format(df);
        System.out.println(mydate);


        DateTimeFormatter dff = DateTimeFormatter.ISO_LOCAL_DATE;

        String date = dff.format(dt);

        System.out.println(date);
        
    }
}
