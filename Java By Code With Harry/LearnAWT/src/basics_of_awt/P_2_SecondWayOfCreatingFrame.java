package basics_of_awt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class P_2_SecondWayOfCreatingFrame extends Frame {
    public P_2_SecondWayOfCreatingFrame(String Title)
    {
        super(Title);
        setSize(400, 300);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public static void main(String args[])
    {
        new P_2_SecondWayOfCreatingFrame("AWT GUI");
    }
}
