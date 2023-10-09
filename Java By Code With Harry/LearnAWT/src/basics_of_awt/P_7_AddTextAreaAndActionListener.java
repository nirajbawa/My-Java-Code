package basics_of_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;

public class P_7_AddTextAreaAndActionListener extends Frame {
    public P_7_AddTextAreaAndActionListener(String Title)
    {
        super(Title);
        setVisible(true);
        setSize(1000, 1000);
        setLayout(null);

        Label label = new Label("Enter Description : ");
        label.setBounds(400, 250, 100, 30);
        label.setBackground(Color.CYAN);
        add(label);

        TextArea textArea = new TextArea("Enter Text",10, 10);
        textArea.setBounds(250, 350, 400, 300);
        add(textArea);

        Button button = new Button("reset".toUpperCase());
        button.setBounds(400, 700, 100, 30);
        button.setBackground(Color.CYAN);
        button.setForeground(Color.black);
        add(button);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                System.out.println("hello");
            }
        });
    }
    public static void main(String args[])
    {
        new P_7_AddTextAreaAndActionListener("adding text area");
    }
}
