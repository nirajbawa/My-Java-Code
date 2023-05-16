import java.applet.*;
import java.awt.*;

/* 
    <applet code="p_10_polygons" width="500" height="500">
    </applet>
*/

public class p_10_polygons extends Applet{
    public void paint(Graphics g)
    {
        int xpt[] = {50, 20, 20, 20, 130};
        int ypt[] = {80, 30, 200, 200, 30};
        int num = 5;
        
        g.drawPolygon(xpt, ypt, num);
        g.fillPolygon(xpt, ypt, num);

        int x[] = {500, 700, 600};
        int y[] = {500, 500, 400};

        g.drawPolygon(x, y, 3);
        g.setColor(Color.red);
        g.fillPolygon(x, y, 3);

    }
}
