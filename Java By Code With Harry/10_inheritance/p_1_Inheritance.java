class base{
    public int a, b;
    public base()
    {
        System.out.println("base call");
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b)
    {
        this.b = b;
    }
}


class derived extends base{
    public derived()
    {
        System.out.println("base derived");
    }
    public int getA()
    {
        return a;
    }
    public int getB()
    {
        return b;
    }
}

public class p_1_Inheritance {
    public static void main(String args[])
    {
        derived d = new derived();
        d.setA(10);
        d.setB(20);
        
        System.out.println("a = "+d.getA());
        System.out.println("b = "+d.getB());
    }
}
