package basics_of_awt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class P_5_AddingTextFieldAndWindowListener {
    public static void main(String args[])
    {
        Frame frame = new Frame("Hello First GUI");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);

        Label  label = new Label("Name : ");
        label.setBounds(190, 250, 100, 20);
        label.setBackground(Color.CYAN);
        frame.add(label);

        TextField textField = new TextField();
        textField.setBounds(300, 250, 100, 20);
        textField.setBackground(Color.YELLOW);
        frame.add(textField);

        Button button = new Button("Submit");
        button.setBounds(230, 300, 100, 20);
        button.setBackground(Color.RED);
        frame.add(button);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}
