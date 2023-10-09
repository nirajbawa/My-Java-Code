import java.util.Scanner;

class p_1_strings{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = "niraj";
        String testName = new String("niraj");
        System.out.println(testName);
        // System.out.println(name);

        // output function in java

        System.out.println("name : ");
        System.out.println(name);

        System.out.print("name : ");
        System.out.print(name+"\n");

        System.out.printf("\'name\' : %d \n", name);
        System.out.format("name : %s", name);
        

        // get string input in java

        // System.out.println(" \nEnter Name :");
        // // name = sc.next(); // get single line
        // System.out.println("name : "+name);
        
        System.out.println(" \nEnter last name :");
        name = sc.nextLine();
        System.out.println("name : "+name);
    }
}