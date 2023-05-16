
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class p_12_read_file_using_scanner {
    public static void main(String[] args) {
        File f = new File("text.txt");
        try{
            Scanner sc = new Scanner(f);
            String str = "";
            while(sc.hasNextLine())
            {
                str += sc.nextLine() + "\n";
            }
            System.out.println(str);
            sc.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
