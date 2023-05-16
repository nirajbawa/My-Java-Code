import java.io.FileReader;
import java.io.BufferedReader;

public class p_9_filereader_using_buffered_reader {
    public static void main(String[] args) {
        try{
            
            FileReader fr = new FileReader("text.txt");

            BufferedReader br = new BufferedReader(fr);
            
            String temp, text = "";
            
            while((temp=br.readLine())!=null)
            {
                text += temp + "\n";
            }
            System.out.println(text);
            br.close();
            fr.close();

        }catch(Exception e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
