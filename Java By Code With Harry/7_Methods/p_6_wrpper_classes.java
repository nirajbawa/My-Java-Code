
import java.io.*;
import java.lang.*;


public class p_6_wrpper_classes {
    public static void main(String args[]){
        // wrapper classes are those classes that allow primetive data type to accessed as object

        String a = "100";
        
        System.out.println();
        System.out.println(a.getClass().getName());

        int c = 10;
        Integer i = new Integer(c);
        Integer k = new Integer(30);
        System.out.println(i+k); 

        Float f = new Float(20.5f);
        System.out.println();

        String t = "10.5";
        Float ff = new Float(Float.parseFloat(t));
        System.out.println(ff);

        String str = Integer.toString(c);
        System.out.println(str);
    }
}
