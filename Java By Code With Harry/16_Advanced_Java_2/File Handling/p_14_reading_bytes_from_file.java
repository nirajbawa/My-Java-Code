import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;

public class p_14_reading_bytes_from_file {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("temp.txt");
            int i = fis.read();
            System.out.println(i);

            String str = "";
            while(i!=-1)
            {
                str += (char)i;
                i = fis.read();
            }

            System.out.println(str);
            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        

    }
}
