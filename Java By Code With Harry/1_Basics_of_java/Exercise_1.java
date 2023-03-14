import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your subject 1 Marks : ");
        float s1 = sc.nextFloat();
        System.out.println("enter your subject 2 Marks : ");
        float s2 = sc.nextFloat();
        System.out.println("enter your subject 3 Marks : ");
        float s3 = sc.nextFloat();
        System.out.println("enter your subject 4 Marks : ");
        float s4 = sc.nextFloat();
        System.out.println("enter your subject 5 Marks : ");
        float s5 = sc.nextFloat();

        float total = ((s1+s2+s3+s4+s5)/500.0f)*100;

        System.out.println("your Marks total is "+total);
    }
}