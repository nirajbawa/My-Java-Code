import java.util.Scanner;

public class p_1_Try_catch {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int input;
        System.out.println("Enter Number : ");
        input = sc.nextInt();
         
        try{
            System.out.println("1000/"+input+" = "+(100/input));
        }
        catch(Exception e)
        {
            System.out.println("the error is : "+e);
        }
        
    }
}
