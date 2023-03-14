import java.util.Scanner;

class p_5_Practice_set {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1)");
        for(int i = 4; i>0; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("\n\nQ2)");

        System.out.println("enter Number : ");
        int n = sc.nextInt();

        int j = 1, s=0;
        while(j<=n)
        {
            if(j%2==0)
            {
                s+=j;
            }
            j++;
        }

        System.out.println("the sum of even numbers is : "+s);

        System.out.println();

        System.out.println("\n Q3)");

        for(int i = 1; i<=10; i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }

        System.out.println();

        System.out.println("\n Q4)");

        for(int i = 10; i>0; i--)
        {
            System.out.println(10+"*"+i+"="+10*i);
        }

        System.out.println("\n Q5)");

        System.out.println();
        int fact = 1;
        for(int i = 1; i<=n; i++)
        {
            fact = fact*i;
        }

        System.out.println("factorial is : "+fact);

        System.out.println("\n Q6)");

        int count = 1;
        fact = 1;
        while(count<=n)
        {
            fact = fact*count;
            count++;
        }
        System.out.println("factorial is : "+fact);

        System.out.println("\n Q7)");
        int r = 4, c;
        while(r>0)
        {
            c=1;
            while(c<=r)
            {
                System.out.print(" * ");
                c++;
            }
            System.out.println();
            r--;
        }

        // Q8) true

        System.out.println("\n Q9)");
        int sum = 0;
        for(int i = 1; i<=10; i++)
        {
            sum = sum+(8*i);
        }

        System.out.println("the sum is : "+sum);

        // Q10) 1) At least once

        System.out.println("\n Q11)");
        int ans = 0;
        for(int i = 1; i<=n; i++)
        {
            if(i%2==0)
            {
                ans+=i;
            }
        }

        System.out.println("the sum of even number is "+ans);
    }
}
