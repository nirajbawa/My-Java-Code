import java.util.*;

public class p_2_handling_specific_exception {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println("Enter the index of array : ");
        int ind = sc.nextInt();

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        try{
            System.out.println("the value at index "+ind+" is : "+arr[ind]);
            System.out.println("The arr["+ind+"]/"+num+" is : "+(arr[ind]/num));
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException : "+e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
