import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class p_15_Reading_and_writing_primitive_data_type {
    public static void main(String[] args) {
        try{
            FileOutputStream fs = new FileOutputStream("pre.txt");
            DataOutputStream dos = new DataOutputStream(fs);
            dos.writeInt(10);
            dos.writeChar('n');
            dos.writeBoolean(true);
            dos.close();
            fs.close();

            FileInputStream fi = new FileInputStream("pre.txt");
            DataInputStream dis = new DataInputStream(fi);
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readBoolean());
            fi.close();
            dis.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

        
    }
}
