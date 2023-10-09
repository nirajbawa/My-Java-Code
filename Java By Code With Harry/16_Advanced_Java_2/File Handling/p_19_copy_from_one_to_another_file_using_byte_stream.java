import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class p_19_copy_from_one_to_another_file_using_byte_stream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("text.txt");
            FileOutputStream fos = new FileOutputStream("t.txt");

            int temp;
            byte data[] = new byte[1024];
            int dc = 0;
            while ((temp = fis.read()) != -1) {
                data[dc] = (byte) temp;
                dc++;
            }

            fis.close();

            for (int i = 0; i < dc; i++) {
                fos.write(data[i]);
            }

            fos.close();
           
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}