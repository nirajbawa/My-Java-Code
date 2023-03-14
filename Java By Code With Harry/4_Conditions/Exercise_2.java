import java.util.Scanner;
import java.util.Random;

class Exercise_2{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computer = rand.nextInt(1,4);
        System.out.println(computer);

        System.out.println("choose your option : \n \t 1.rock \n \t 2.paper \n \t 3.scissors  ");
        int user = sc.nextInt();

        if(computer==1)
        {
            if(user==1)
            {
                System.out.println("match tie");
            }
            else if(user==2)
            {
                System.out.println("computer win");
            }
            else if(user==3)
            {
                System.out.println("computer win");
            }
            else{
                System.out.println("Invalid Option");
            }
            
        }
        else if(computer==2)
        {
            if(user==2)
            {
                System.out.println("match tie");
            }
            else if(user==1)
            {
                System.out.println("user win");
            }
            else if(user==3)
            {
                System.out.println("user win");
            }
            else{
                System.out.println("Invalid Option");
            }
        }
        else{
            if(user==3)
            {
                System.out.println("match tie");
            }
            else if(user==1)
            {
                System.out.println("user win");
            }
            else if(user==2)
            {
                System.out.println("computer win");
            }
            else{
                System.out.println("Invalid Option");
            }
        }

    }
}