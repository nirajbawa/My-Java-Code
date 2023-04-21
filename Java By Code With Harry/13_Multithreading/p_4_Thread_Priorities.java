
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
            System.out.println("hello "+ this.getName());
            i++;
        }
        
    }
}


public class p_4_Thread_Priorities {
    public static void main(String args[])
    {
        Fetchdata f1 = new Fetchdata("f1");
        Fetchdata f2 = new Fetchdata("f2");
        Fetchdata f3 = new Fetchdata("f3");
        Fetchdata f4 = new Fetchdata("f4");
        Fetchdata f5 = new Fetchdata("f5 most priority");

        f5.setPriority(Thread.MAX_PRIORITY);
        f1.setPriority(Thread.MIN_PRIORITY);
        f2.setPriority(Thread.MIN_PRIORITY);
        f3.setPriority(Thread.MIN_PRIORITY);
        f4.setPriority(Thread.MIN_PRIORITY);
        
        f1.start();
        f2.start();
        f3.start();
        f4.start();
        f5.start();

    }
}
