
public class p_6_finally_block {
    public static int divide()
    {
        try{
            int a = 10, b = 30;
            int c = a/b;
            System.out.println(c);
            return c;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("fn");
        }
        return -1;
    }
    public static void main(String args[])
    {
        try{
            int a = 5, b = 0;
            int c = a/b;
            System.out.println(c);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("this is termination");
        }

        System.out.println(divide());


        int i = 10;
        int j = 2;

        while(true)
        {
            try{
                System.out.println(j/i);
            }
            catch(Exception e)
            {
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("this is execute");
            }
            i--;

        }

        try{
            System.out.println(5/5);
        }
        finally{
            System.out.println("ok");
        }
    }    
    
}
