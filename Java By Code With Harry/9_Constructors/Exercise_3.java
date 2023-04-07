import java.util.*;
 

class guessTheNumber{
    private int user, computer;
    private Scanner sc;
    private Random Rand;
    private int i;
    public void Home()
    {
        System.out.println("\n\n\t\t---------GUESS THE NUMBER---------\n\n");
        System.out.println("\t\t1.Start \n\n\t\t2.Exit");
        System.out.print("\n\n\t\t ::::: ");
        sc = new Scanner(System.in);   
        user = sc.nextInt();
        if(user==1)
        {
            Driver();
        }
        else if(user==2)
        {
            System.out.println("Exit.....");
        }
        else{
            Home();
        }
    }
    public void GameMsg(String msg)
    {
        System.out.print(msg);
    }

    public void Driver()
    {
        i = 0;
        Rand = new Random();
        computer = Rand.nextInt(1, 100);

        while(true)
        {
            GameMsg("\n\n\t\tEnter The Number (1-100) ::: ");  
    
            user = sc.nextInt();
            
            if(user<computer)
            {
                System.out.println("\n\t\tRandom Number is greater than your current entered number ");
            }
            else if(user==computer){
                System.out.println("\n\t\tYour Enter Number is Matched...\n\n \t\tYou find correct number in "+i+" chances\n\n");
                break;
            }
            else{
                System.out.println("\n\t\tRandom Number is less than your current entered number ");
            }
            i++;
        }
        Driver();
    }
}

public class Exercise_3 {
    public static void main(String args[])
    {
        guessTheNumber g = new guessTheNumber();
        g.Home();

    }
}
