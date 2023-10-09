package basics_of_awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class P_3_AddingButton {
    public P_3_AddingButton()
    {
        Frame frame = new Frame("Adding Button GUI");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);

        Button button = new Button("click me");
        button.setBounds(250, 250, 50, 30);
        frame.add(button);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }

        });
    }
    public static void main(String args[])
    {
        new P_3_AddingButton();
    }
}
