import java.util.Scanner;
class p_3_Practice_set {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Q1) 
        // int a = 10;
        // if(a=11)
        // {
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("no");
        // }
        // answer is error a=11 not valid

        // Q2)

        int m1, m2, m3;
        System.out.println("enter the marks for three subjects : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        
        float avg  = (m1+m2+m3)/3.0f;
        System.out.println(avg);
        System.out.println("your total percentage is : "+ avg);
        if(m1>=33 && m2 >=33 & m3>=33 && avg>=44)
        {
            System.out.println("you are pass");
        }
        else
        {
            System.out.println("you are fail");
        }
        

        // Q3)
        System.out.println("enter Income ");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5)
        {
            tax = tax+0;
        }
        else if(income>2.5f && income<=5f)
        {
            tax = tax + 0.05f * (income-2.5f);
        }
        else if(income>5f && income<=10.0f)
        {
            tax = tax + 0.05f * (income-2.5f);
            tax = tax + 0.2f * (income-10.0f);
        }
        else if(income>10.0f)
        {
            tax = tax + 0.05f * (income-2.5f);
            tax = tax + 0.2f * (income-10.0f);
            tax = tax + 0.3f * (income-10.0f);
        }

        System.out.println("your tax is : "+tax);

        // Q4)
        System.out.println("enter number : ");
        int day = sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid input");
        }

        // Q5)

        int year = sc.nextInt();

        if(year%4==0)
        {
            System.out.println("the year is leap");
        }
        else{
            System.out.println("year is not leap");
        }
    
        // Q6)

        System.out.println("enter website name : ");
        String webname = sc.next();
        if(webname.endsWith(".com"))
        {
            System.out.println("this is commercial website");
        }
        else if(webname.endsWith(".org"))
        {
            System.out.println("this is organizational website");
        }
        else if(webname.endsWith(".in"))
        {
            System.out.println("this is indian website");
        }

    }
}
