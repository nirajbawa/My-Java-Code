import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Demo{
    // Q2)
    @Deprecated
    void call()
    {
        System.out.println("calling...");
    }
}


interface Phone{
    void call();
    void message();
}

public class p_6_practice_set {
    // Q3)
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Demo d = new Demo();
        d.call();


        // Q5)

        
        try{
            FileWriter mulTable = new FileWriter("MulTable.txt");
            for(int j = 1; j<=10; j++)
            {
                for(int i = 1; i<=10; i++)
                {
                    mulTable.write(j+" * "+i+" = "+(j*i)+"\n");
                } 
                mulTable.write("\n\n");
            }
           
            mulTable.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }


        // Q5)
        

        Phone p = new Phone(){
            @Override
            public void call()
            {
                System.out.println("call...");
            }
            @Override
            public void message()
            {
                System.out.println("message.....");
            }
        };

        p.call();
        p.message();



    }
}
