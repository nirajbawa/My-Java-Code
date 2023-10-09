import java.io.FileWriter;
import java.io.IOException;

public class p_7_fileWriterClass {
    public static void main(String args[]) throws IOException
    {
        FileWriter fw = null;
        try{
            // writing file using file writer
            fw = new FileWriter("text.txt");
            fw.write("Name : Niraj Bava \n I am full stack developer.");
            System.out.println("\nWriting Complete");
            fw.close();
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
