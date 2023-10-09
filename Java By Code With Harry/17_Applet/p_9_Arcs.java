import java.applet.*;
import java.awt.*;

/*
 <applet code="p_9_Arcs" width="1000" height="1000">
 </applet>
 */

public class p_9_Arcs extends Applet{
    public void paint(Graphics g)
    {
        g.drawArc(10, 60, 100, 100, 0, 90);
        g.fillArc(100, 60, 100, 100, 0, 90);
        g.drawArc(200, 20, 70, 90, 0, 270);


        // smiley face
        g.drawOval(500, 400, 500, 500);
        g.drawOval(600, 500, 100, 100);
        g.drawOval(800, 500, 100, 100);
        g.drawArc(650, 700, 200, 100, 180, 180);



        g.drawOval(150, 150, 300, 300);
        g.setColor(Color.black);
        g.fillOval(230, 200, 50, 50);
        g.setColor(Color.black);
        g.fillOval(300, 200, 50, 50);
        g.drawArc(250, 350, 100, 60, 180, 180);



    }
}
