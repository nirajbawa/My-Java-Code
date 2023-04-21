class Fetchdata extends Thread{
    Fetchdata(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        System.out.println("hello");
    }
}


class Render implements Runnable{
    @Override
    public void run()
    {
        System.out.println("hii");
    }
}


public class p_3_Constructors_from_Thread_class {
    public static void main(String args[])
    {
        Fetchdata f = new Fetchdata("fdata");
        f.start();
        System.out.println("F thread id : "+f.getId());
        System.out.println("F thread name : "+f.getName());
        System.out.println();

        Render r = new Render();
        Thread T2 = new Thread(r, "ren");
        System.out.println("R thread id : "+T2.getId());
        System.out.println("R thead name : "+T2.getName());

    }
}
