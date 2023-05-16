import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p_11_file {
    public static void main(String[] args) {
        try{
            File f = new File("file.txt");
            File r = new File("niraj.txt");
            f.createNewFile();
            f.renameTo(r);
            if(f.exists())
            {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            System.out.println(f.length());
            System.out.println(f.getTotalSpace());
            // System.out.println(r.delete());
            System.out.println(r.canRead());
            System.out.println(r.canWrite());
            System.out.println(r.canExecute());
            

            File fp = new File("niraj");
            fp.mkdir();
            fp.delete();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
       

    }
}
