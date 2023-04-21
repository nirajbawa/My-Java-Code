import java.util.*;

class OverflowArr extends Exception {
    OverflowArr(String msg) {
        super(msg);
    }
}

public class p_7_practice_set {

    public static void cusEx() throws OverflowArr {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 10, 20, 30, 40, 50, 60 };

        while (true) {

            System.out.println("Enter index : ");
            int input = sc.nextInt();
            if (input > arr.length-1) {
                throw new OverflowArr("array out of range");
            }
            System.out.println(arr[input]);
        }
    }

    public static void main(String args[]) {

        
        

        // Q1)
        // int a
        int a;
        int b;

        a = 10;
        b = 0;

        // prime number // logical error
        // System.out.println(a/b); //runtime error

        // Q2)
        try {
            System.out.println(100 / 0);
        } catch (ArithmeticException e) {
            System.out.println("HaHa");
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }

        Scanner sc = new Scanner(System.in);

        // Q3)
        int arr[] = { 10, 20, 30, 40, 50, 60 };

        while (true) {
            try {
                System.out.println("Enter index : ");
                int input = sc.nextInt();
                if (input > arr.length-1) {
                    throw new OverflowArr("array out of range");
                }
                System.out.println(arr[input]);
            } catch (OverflowArr e) {
                System.out.println(e);
                break;
            }
            // catch(Exception e)
            // {
            // System.out.println(e);
            // break;
            // }
        }


        try{
            cusEx();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
