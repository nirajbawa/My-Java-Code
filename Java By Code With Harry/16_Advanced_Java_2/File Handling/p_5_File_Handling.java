
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class p_5_File_Handling {
    public static void main(String[] args) {
            File myFile = new File("new.txt");
            try{
                myFile.createNewFile();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }

            try{
                FileWriter fileWriter = new FileWriter("new.txt");
                fileWriter.write("this is \nwriter");
                fileWriter.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
            try{
                Scanner sc = new Scanner(myFile);
                while(sc.hasNextLine())
                {
                    String line = sc.nextLine();
                    System.out.println(line);
                }
                sc.close();
            }
            catch(FileNotFoundException e)
            {
                System.out.println(e);
            }

            if(myFile.delete())
            {
                System.out.println(myFile.getName());
            }
            else{
                System.out.println("file not exist");
            }
            
    }
}
