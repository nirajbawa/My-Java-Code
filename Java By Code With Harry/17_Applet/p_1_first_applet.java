import java.applet.Applet;
import java.awt.Graphics;

/*
    <APPLET code="p_1_first_applet.class" width=200 height=150> </APPLET>
 */

public class p_1_first_applet extends Applet{
    public void paint(Graphics g)
    {
        // javac p_1_first_applet.java
         // appletviewer p_1_first_applet.java
        g.drawString("niraj", 50, 20);
    }
}

