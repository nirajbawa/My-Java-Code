

class goodMorning extends Thread{
    @Override
    public void run()
    {
        int i = 1;
        while(i<100)
        {
            System.out.println("good morning....");
            i++;
        }
    }
}


class welcome extends Thread{
    @Override
    public void run()
    {
        int i = 1;
        while(i<100)
        {
            System.out.println("welcome...");
            try{
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
           i++;
        }
    }
}

public class p_6_practice_set {
    public static void main(String args[])
    {

        // Q1)
        goodMorning t1 = new goodMorning();
        welcome t2 = new welcome();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("state of t1 : "+t1.getState());
        t1.start();
        System.out.println(Thread.currentThread().getState());
        t2.start();
    }
}
