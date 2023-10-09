package basics_of_awt;

import java.awt.*;

public class P_4_AddingLabel {
    P_4_AddingLabel()
    {
        Frame frame = new Frame("GUI LABEL");
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(null);

        Label label = new Label("this is label".toUpperCase());
        label.setBounds(250, 250, 100, 30);
        frame.add(label);

    }
    public  static void main(String args[])
    {
        new P_4_AddingLabel();
    }
}
