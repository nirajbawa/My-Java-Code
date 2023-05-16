import java.applet.*;
import java.awt.*;

/*
 <applet code="p_8_Ellipse_and_circle" width="500" height="500">
 </applet>
 */

public class p_8_Ellipse_and_circle extends Applet{
    public void paint(Graphics g)
    {
       g.drawOval(10, 10, 50, 50);
       g.fillOval(200, 10, 70, 100);

       g.setColor(Color.red);
       g.fillOval(100, 200, 100, 100);
       g.setColor(Color.yellow);
       g.fillOval(200, 200, 100, 100);
       g.setColor(Color.green);
       g.fillOval(300, 200, 100, 100);

       g.setColor(Color.black);
       g.drawOval(600, 600, 200, 200);
       g.drawOval(550, 550, 300, 300);
       g.drawOval(500, 500,  400, 400);
    }
}
