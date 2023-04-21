

@FunctionalInterface
interface myinterface{
    void thisMethod();
    // void thisMethod2();
}


class Phone extends Thread{
    @Override
    public void run()
    {
        System.out.println("call...");
    }
    @Deprecated
    public void t()
    {
        System.out.println("hello");
    }
}

public class p_2_Annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Phone t = new Phone();
        t.start();

        t.t();
    }
}
