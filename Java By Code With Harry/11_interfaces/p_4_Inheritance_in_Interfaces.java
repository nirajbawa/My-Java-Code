

interface parent{
    void math1();
    void math2();
}

interface child extends parent{
    void math3();
    void math4();
}

class sample implements child{
    public void math1()
    {
        System.out.println("math1");
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
}

class p_4_Inheritance_in_Interfaces {
    public static void main(String args[])   
    {
        sample s = new sample();
        s.math1();
        s.math2();
        s.math3();
        s.math4();
    }
}
