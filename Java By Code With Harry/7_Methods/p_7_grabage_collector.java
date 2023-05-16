
class A{
    A()
    {
        System.out.println("created");
    }
    @Override
    public void finalize() {
        System.out.println("destroyed");
    }
}


class p_7_grabage_collector{
    public static void main(String args[])
    {
        A A = new A();
        A b = new A();
        b = A;
        // A = null;

        System.gc();
    }
}


