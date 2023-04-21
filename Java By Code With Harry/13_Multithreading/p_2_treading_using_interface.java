

class Fetchdata implements Runnable{
    @Override
    public void run()
    {
        int i = 0;
        while(i<100)
        {
            System.out.println("fetch data......");
            i++;
        }
    }
}


class Render implements Runnable{
    @Override
    public void run()
    {
        int i =0;
        while(i<100)
        {
            System.out.println("rendering.....");
            i++;
        }
    }
}


public class p_2_treading_using_interface {
    public static void main(String args[])
    {
        Fetchdata f = new Fetchdata();
        Thread t1 = new Thread(f);

        Render r = new Render();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

    }
}
