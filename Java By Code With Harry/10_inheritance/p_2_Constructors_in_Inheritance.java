class base{
    base()
    {
        System.out.println("I am a base constructor");
    }
    base(int a)
    {
        System.out.println("I am base constructor with value of a as "+a);
    }
}

class Derived extends base{
    Derived()
    {
        // super(0);
        System.out.println("I am a derived class constructor");
    }

    Derived(int a, int b, int x)
    {
        super(x);
        System.out.println("i am an overloades Derived consturctor as a= "+a+" b= "+b);
    }
}


class Derived2 extends Derived{
    Derived2()
    {
        System.out.println("I am a Derived2 class constructor");
    }

    Derived2(int a, int b, int x)
    {
        super(a,b,x);
        System.out.println("Derived2 ----------");
    }
}

public class p_2_Constructors_in_Inheritance {
    public static void main(String args[])
    {
        Derived obj = new Derived(1,2,5);
        System.out.println();
        Derived2 obj2 = new Derived2(20, 30, 40);
    }
}
