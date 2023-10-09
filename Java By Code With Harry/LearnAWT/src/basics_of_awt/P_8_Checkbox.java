package basics_of_awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class P_8_Checkbox {
    public static void main(String args[])
    {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());



        Label label = new Label("select options");
        frame.add(label);

        Checkbox checkboxes[] = {new Checkbox("python"),  new Checkbox("java"), new Checkbox("go"), new Checkbox("js")};

        for(int i = 0; i<checkboxes.length; i++)
        {
            frame.add(checkboxes[i]);
        }

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });


    }
}
