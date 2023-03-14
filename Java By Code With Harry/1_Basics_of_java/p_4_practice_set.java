import java.util.Scanner;

public class p_4_practice_set {
    public static void main(String[] args)
    {
//        Q1)
        int a = 4;
        int b = 17;
        int c = 6;
        int sum = a+b+c;
        System.out.println(sum);

//        Q2)
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 50;
        float total = (subject1+subject2+subject3)/30;
        System.out.println(total);

//        Q3)

        System.out.println("what is your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" have a good day!");

//        4)

        System.out.println("Enter Km : ");
        float km = sc.nextFloat();
        double miles = km/1.609;
        System.out.println(miles);

//        Q5

        System.out.println("Enter Your Integer : ");
        boolean num = sc.hasNextInt();
        System.out.println(num);

    }
}
