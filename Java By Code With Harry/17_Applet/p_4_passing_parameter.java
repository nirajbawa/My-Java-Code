import java.applet.Applet;
import java.awt.Graphics;

/*
    <applet code="p_4_passing_parameter" width="500" height="500">
        <param name="username" value="niraj">
        <param name="s1" value="first">
        <param name="s2" value="second">
    </applet>
   
   
 */


public class p_4_passing_parameter extends Applet{
    String uname;
    String s1, s2, s3;
    public void init()
    {
        uname = getParameter("username");
        s1 = getParameter("s1");
        s2 = getParameter("s2");

        s3 = s1.concat(" "+s2);

        System.out.println("username : "+uname);
    }
    public void paint(Graphics g)
    {
        g.drawString("username "+uname, 50, 50);
        showStatus(s3);
    }
}