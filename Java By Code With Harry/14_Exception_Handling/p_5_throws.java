import java.util.*;

class AreaException extends Exception{
    AreaException(String msg)
    {
        super(msg);
    }
}

public class p_5_throws {
    public static int divide(int a, int b) throws Exception
    {        
        return a/b;
    }
    public static int area(int rad) throws Exception
    {
        if(rad==0)
        {
            throw new AreaException("radius zero");
        }
        return (int) (Math.PI*Math.pow(rad, 2));
    }

    public static void main(String args[])
    {
        try{
            System.out.println(divide(100, 0));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        try{
            System.out.println(area(0));     
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
