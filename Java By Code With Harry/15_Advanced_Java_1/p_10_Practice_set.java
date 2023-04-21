import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class p_10_Practice_set {
    public static void main(String[] args) {

   
        // Q1)
        ArrayList<String> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String temp;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Name : ");
            temp = sc.nextLine();
            li.add(temp);
        }

        for (String string : li) {
            System.out.println(string);
        }
        

        System.out.println();

        // Q5)

        HashSet<Integer> h = new HashSet<>();
        h.add(6);
        h.add(6);
        h.add(46);
        
        h.add(69);
        h.add(9);
        h.add(6);
        
        for (Integer integer : h) {
            System.out.println(integer);
        }

        System.out.println();

        // Q2)

        Date d = new Date();
        System.out.println(d.getHours()+" : "+d.getMinutes()+" : "+d.getMinutes());

        System.out.println();

        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.HOUR_OF_DAY)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND)); 

        System.out.println();

        LocalTime t = LocalTime.now();
        
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("H : m : s");
        String date = tf.format(t);

        System.out.println(date);


    }
}
