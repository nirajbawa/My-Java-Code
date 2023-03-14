public class p_5_practice_set {
    static void mulTable(int num)
    {
        for(int i = 1; i<=num; i++)
        {
            System.out.println("Table Of : "+i+"\n\n");
            for(int j=1; j<=10; j++)
            {
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.println("\n\n");
        }
    }

    static void pattern()
    {
        for(int i = 1; i<=4; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();

        for(int i = 4; i>0; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static int cal(int num)
    {
        if(num==1)
        {
            return 1;
        }
        else{
            return num+cal(num-1);
        }
    }


    static int faibonacci(int num)
    {
        if(num == 1 || num == 2)
        {
            return num-1;
        }
        else{
            return faibonacci(num-1)+faibonacci(num-2);
        }
    }


    static double sumSet(int ...nums)
    {
        int sum = 0; 
        for(int i:nums)
        {
            sum += i;
        }
        return (sum/nums.length);
    }

    static void PatternRec1(int num)
    {
        
        if(num>0)
        {
            PatternRec1(num-1);
            for(int j = 1; j<=num; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    static void PatternRec2(int num)
    {
        
        if(num==0)
        {
            return;
        }
        else{
            for(int j = 0; j<num; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
            PatternRec2(num-1);
        }
        
    }
    

    static float CelsiusToFar(Float cal)
    {
        return  cal * (9/5) + 32;
    }


    static int sumSetIt(int num)
    {
        int sum = 0;
        for(int i = 1; i<=num; i++)
        {
            sum +=i;
        }
        return sum;
    }
  

    public static void main(String args[])
    {
        System.out.println("Q1)\n");
        mulTable(5);
        
        System.out.println("\nQ2) Q4)\n");
        pattern();

        System.out.println("\nQ3)\n");
        System.out.println(cal(5));

        System.out.println("\nQ5)\n");
        System.out.println(faibonacci(5));

        System.out.println("\nQ6)\n");
        System.out.println("\nsum = " + sumSet(1,2));
        
        System.out.println("\nQ7)\n");
        PatternRec2(4);

        System.out.println("\nQ8)\n");
        PatternRec1(4);

        System.out.println("\nQ9)\n");
        System.out.println("\nFahrenheit = "+CelsiusToFar(1.0f));
        
        System.out.println("\nQ10)\n");
        System.out.println("Sum = "+sumSetIt(5));
    }
}
