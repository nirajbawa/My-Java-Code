import java.util.Scanner;
import static java.lang.System.out;

public class p_1_Try_catch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Enter Number : ");
        input = sc.nextInt();
         
        try{
            out.println("1000/"+input+" = "+(100/input));
        }
        catch(Exception e)
        {
            System.out.println("the error is : "+e);
        }
        
    }
}
