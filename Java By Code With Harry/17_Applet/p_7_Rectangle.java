import java.applet.*;
import java.awt.*;

/*
 <applet code="p_7_Rectangle" width="500" height="500">
 </applet>
 */

public class p_7_Rectangle extends Applet{
    public void paint(Graphics g)
    {
        g.drawRect(10,10,50,50);
        g.drawRoundRect(70, 30, 50, 30, 10, 10);
        g.fillRect(40,100,150,100);
        g.fillRoundRect(200,10,70,100,10,10);


        g.setColor(Color.ORANGE);
        g.fillRect(100, 250, 50, 50);
        g.setColor(Color.orange);
        g.fillRect(100, 350, 50, 50);
        g.setColor(Color.orange);
        g.fillRect(100, 450, 50, 50);
}
}