import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class p_18_word_and_line_count_using_file_reader_and_buffered_reader{
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            int wordCount = 0, lineCount = 0;
            String line;
            
            while((line = br.readLine())!=null)
            {
                String temp[] = line.trim().split("\\s+");
                wordCount+= temp.length;
                lineCount++;
            }

            System.out.println("\n The number of words : "+wordCount);
            System.out.println("\n The number of line : "+lineCount);

        }
        catch(IOException e)
        {
            e.getStackTrace();
        }
    }
}