import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p_16_append_data_in_file {
    public static void main(String[] args) {
        try{
            File file = new File("test.txt");
            FileWriter fw1 = new FileWriter(file, false);
            fw1.write("this is file");
            fw1.close();

            FileWriter fw2 = new FileWriter(file, true);
            fw2.write("\n it's my file");
            fw2.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String temp;
            while((temp=br.readLine())!=null)
            {
                System.out.println(temp);
            }
            br.close();
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
