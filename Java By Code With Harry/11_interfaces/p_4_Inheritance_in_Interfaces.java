

interface parent{
    void math1();
    void math2();
}

interface x{
    void hello();
}


interface child extends parent, x{
    void math3();
    void math4();
    interface nestingOfInterface
    {
        void hii();
    }
}

class sample implements child, child.nestingOfInterface{
    public void math1()
    {
        System.out.println("math1");
    }
    public void hello()
    {
        System.out.println("hello");
    }
    public void hii()
    {
        System.out.println("hii");
    }
    public void math2()
    {
        System.out.println("math2");
    }
    public void math3()
    {
        System.out.println("math3");
    }
    public void math4()
    {
        System.out.println("math4");
    }
    public void ok()
    {
        System.out.println("ok");
    }
}

class p_4_Inheritance_in_Interfaces {
    public static void main(String args[])   
    {
        // sample s = new sample();
        // s.math1();
        // s.math2();
        // s.hello();
        // s.hii();
        // s.math3();
        // s.math4();

        child c1 = new sample();
        c1.math1();
        c1.hello();
        c1.math4();
    }
}
