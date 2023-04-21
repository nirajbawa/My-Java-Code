import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class p_8_time {
    public static void main(String[] args) {

        System.out.println();

        LocalDate d = LocalDate.now();
        System.out.println(d);

        System.out.println();

        LocalTime t = LocalTime.now();
        System.out.println(t);

        System.out.println();

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        System.out.println(LocalDate.now());
    }
}
