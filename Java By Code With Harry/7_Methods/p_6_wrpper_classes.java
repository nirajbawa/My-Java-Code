
import java.io.*;
import java.lang.*;
import java.lang.ProcessBuilder.Redirect.Type;

public class p_6_wrpper_classes {
    public static void main(String args[]){
        // wrapper classes are those classes that allow primetive data type to accessed as object

        String a = "100";
        System.out.println(Integer.parseInt(a));
        System.out.println(a.getClass().getName());
    }
}
