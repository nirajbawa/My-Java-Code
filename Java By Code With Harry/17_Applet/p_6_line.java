import java.applet.*;
import java.awt.*;

/*
 <applet code="p_6_line" width="500" height="500">
 </applet>
 */

public class p_6_line extends Applet{
    public void paint(Graphics g)
    {
        g.drawLine(0, 0, 200, 100);
        g.drawLine(5,5,50,50);
    }
}
