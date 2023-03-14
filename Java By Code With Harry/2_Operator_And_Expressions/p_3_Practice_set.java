import java.util.Scanner;

public class p_3_Practice_set {
    public static void main(String args[])
    {
        // Q1)
        float a = 7/40.f*9/2.0f;
        System.out.println(a);

        // Q2)

        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);
        grade = (char)(grade-8);
        System.out.println(grade);

        // Q3)
        System.out.println("enter number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x>8);

        // Q5)
        int y = 7;
        int z = (7*49/7+35/7);
        System.out.println(z);
        

    }
}
