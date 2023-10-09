import java.io.FileReader;
import java.io.IOException;

public class p_8_fileReader {
    public static void main(String args[])
    {
        FileReader fr = null;
        try{
            // Reading file using FileReader without BufferedReader and scanner only character
            fr = new FileReader("text.txt");
             int i;
            // i = fr.read();
            String str = "";
            int charC = 0;
            int wordC = 0;
            char temp;

            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
                temp = (char)i;
                str += temp;
                charC++;
                if(temp==' ')
                {
                    wordC++;
                }
                // i = fr.read();
            }

            System.out.println("\n"+str);
            System.out.println("\nthe number of characters in file is : "+charC);
            System.out.println("\nthe number of word in file is : "+wordC);
           
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            fr.close();
        }
    }
}
