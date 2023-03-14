import java.util.Scanner;


public class p_3_Practice_set {
    public static void main(String args[])
    {
        System.out.println("Q1) ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Word : ");
        String input = sc.next();
        System.out.println("The lowerCase String Is : "+input.toLowerCase());

        System.out.println("Q2) ");
        String Test = "this is java";
        System.out.println("the Replaced String is : "+Test.replaceAll(" ", "_"));

        System.out.println("Q3) ");
        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>", input));

        String sample = "this is  string   ";

        System.out.println("The number of double spaces in string is : "+sample.indexOf("  "));
        System.out.println("The number of triple spaces in string is : "+sample.indexOf("   "));

        System.out.println("dear Harry, \n \tthis java course is nice. \nthanks");

    }
}
