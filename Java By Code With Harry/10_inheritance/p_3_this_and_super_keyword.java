class base {
    int a;

    base(int a)
    {
        System.out.println("base consturctor as a = "+a);
    }
    void seta(int a) {
        this.a = a;
    }

    int geta() {
        return a;
    }
}

class derived extends base{
    derived(int a)
    {
        super(a);
    }
}

class p_3_this_and_super_keyword {
    public static void main(String args[]) {
        base obj = new base(10);
        obj.seta(10);
        System.out.println("a = " + obj.geta());
        System.out.println();
        derived d = new derived(20);
    }
}