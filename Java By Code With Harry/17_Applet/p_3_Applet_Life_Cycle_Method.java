import java.applet.Applet;
import java.awt.Graphics;

public class p_3_Applet_Life_Cycle_Method extends Applet {
    int count = 0;
    public void init()
    {
        System.out.println("init method "+ ++count);
    }
    public void start()
    {
        System.out.println("start method "+ ++count);
    }
    public void stop()
    {
        System.out.println("stop method "+ ++count);
    }
    public void destroy()
    {
        System.out.println("destroy method "+ ++count);
    }
    public void paint(Graphics g)
    {
        System.out.println("paint method "+ ++count);
        g.drawString("niraj", 50, 20);
    }
}


/*
    <APPLET code="p_3_Applet_Life_Cycle_Method.class" width="200" height="150"> </APPLET>
 */
