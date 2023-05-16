import java.applet.*;
import java.awt.*;

/*
 <applet code="p_12_font" width="500" height="500">
 </applet>
 */


public class p_12_font extends Applet{
    String msg;
    Font f;
    public void init()
    {
        f = new Font("Monotype Corsiva", Font.BOLD, 20);
        setFont(f);
    }
    public void paint(Graphics g)
    {
        String name = f.getName();
        msg = "Font Name : "+name;
        g.drawString(msg, 30,50);
        
        String family = f.getFamily();
        msg = "Font Name : "+family;
        g.drawString(msg, 30, 70);

        int size = f.getSize();
        msg = "Size : "+size;
        g.drawString(msg, 30, 90);

        int style = f.getStyle();
        msg = "Font Size : "+style;
        g.drawString(msg, 30, 110);

    }
}
