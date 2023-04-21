import java.util.*;

public class p_3_Nested_try_catch {
    public static void main(String args[])
    {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while(flag)
        {
            System.out.println("Enter index : ");
            int index = sc.nextInt();

            try{
                System.out.println("Level 1 : ");
                try{
                    System.out.println(arr[index]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("exception level 2nd");
                }
            }
            catch(Exception e)
            {
                System.out.println("exception level 1st");
            }
        }

    }
}
