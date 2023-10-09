package basics_of_awt;
import java.awt.*;

public class P_1_FirstWayOfCreatingFrame {
    public static void main(String args[])
    {
        Frame frame = new Frame("My GUI");
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
