
import niraj.NirajHome;

public class p_2_Access_Modifiers extends NirajHome {
    void getall()
    {
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z); // default cant access in sub class
        System.out.println(a);
        // goodmorning();
    }
    public static void main(String args[])
    {
        NirajHome a = new NirajHome();
        NirajHome.main(args);
        System.out.println(a.x);
        System.out.println(a.y);
        // System.out.println(a.z);
        // System.out.println(a.a);
        // a.goodmorning();
       

        // p_2_Access_Modifiers a = new p_2_Access_Modifiers();
        // a.getall();
    }
}
