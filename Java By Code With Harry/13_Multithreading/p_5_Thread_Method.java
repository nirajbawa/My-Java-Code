class Fetchdata extends Thread{
    Fetchdata(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        int i = 1;
        while(i<100)
        {
            System.out.println(this.getName());
            try{
                Thread.sleep(50);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            i++;
        }
    }
}


public class p_5_Thread_Method {

    public static void main(String args[])
    {
        Fetchdata f1 = new Fetchdata("f1");
        Fetchdata f2 = new Fetchdata("f2");
        f1.start();
        try{
            f1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        f2.start();
    }
}
