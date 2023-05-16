import java.applet.*;
import java.awt.*;

/*
  <applet code="p_11_colors" width="500" height="500">
  </applet>
 */

public class p_11_colors extends Applet{
    public void paint(Graphics g)
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
        g.drawString("Its a colorful applet", 50, 30);

        Color newColor = new Color(255, 255, 0);

        g.setColor(newColor);
        g.drawString("Its a colorful applet", 50, 70);

        g.setColor(Color.red);
        g.fillRect(700, 700, 100, 100);
        g.setColor(Color.white);
        g.drawString("Hello third year students", 690, 850);




    }
}