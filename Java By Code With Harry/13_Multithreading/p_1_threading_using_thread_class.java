
class Fetchdata extends Thread{
    @Override
    public void run()
    {
        int i = 0;
        while(i<100)
        {
            System.out.println("fetching data....");
            i++;
        }
    }
}


class Rendering extends Thread{
    @Override
    public void run()
    {
        int i = 0;
        while(i<100)
        {
            System.out.println("rendering......");
            i++;
        }
    }
}


public class p_1_threading_using_thread_class {
    public static void main(String args[])
    {
        Fetchdata f = new Fetchdata();
        Rendering r = new Rendering();
        f.start();
        r.start();
    }
}
