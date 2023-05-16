import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class p_13_Writing_byte {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("temp.txt");
            

            fos.write(97);

            String str = "\nvictus by hp\n reame 10 pro";
            fos.write(str.getBytes());
        
            fos.close();

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
