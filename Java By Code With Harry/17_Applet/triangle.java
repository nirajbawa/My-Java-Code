import java.applet.Applet;
import java.awt.Graphics;

/*
    <APPLET code="triangle" width=500 height=500> </APPLET>
 */

public class triangle extends Applet{
    public void paint(Graphics g)
    {
        // javac p_1_first_applet.java
         // appletviewer p_1_first_applet.java

        g.drawString("Triangle", 100, 10);
        
        int xpt[] = {20, 100, 200};
        int ypt[] = {20, 100, 20};

        g.drawPolygon(xpt, ypt, 3);

       
    }
}

