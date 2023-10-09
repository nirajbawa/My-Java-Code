import java.io.*;

public class p_17_copy_content_of_another_file {
    public static void main(String[] args) {
        try {
            File f = new File("text.txt");
            File c = new File("copy.txt");

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String temp, str = "";
            while((temp=br.readLine())!=null)
            {
                str+=temp+"\n";
            }

            fr.close();
            br.close();

            FileWriter fw = new FileWriter(c, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
