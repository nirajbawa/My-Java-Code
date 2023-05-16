import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class p_10_fileWriter_using_bufferedWriter {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("newtext.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("my name is niraj\n I'm full stack developer 🧑‍💻🧑‍💻🧑‍💻🧑‍💻");
            bw.close();


        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }  
}
