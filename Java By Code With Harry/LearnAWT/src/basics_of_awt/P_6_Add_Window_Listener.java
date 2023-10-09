package basics_of_awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class P_6_Add_Window_Listener extends Frame implements WindowListener {
    public P_6_Add_Window_Listener(String Title) {
        super(Title);
        addWindowListener(this);
        setVisible(true);
        setSize(500, 500);
    }
    public static void main(String args[]) {
        new P_6_Add_Window_Listener("Window Listener using interface");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window is open");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window is closing");
        Frame frame = (Frame)e.getSource();
        frame.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window is closed");
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("window iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("window deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window deactivated");
    }
}
