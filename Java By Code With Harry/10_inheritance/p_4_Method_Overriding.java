
class A{
    public void meth1()
    {
        System.out.println("this is meth Of A");
    }
}

class B extends A{
    int c = 30;
    @Override //Notation
    public void meth1()
    {
        System.out.println("this is meth Of B");
    }
}

public class p_4_Method_Overriding {
    public static void main(String args[])
    {
        B obj = new B();
        obj.meth1();
       
    }
}


