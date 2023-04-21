
class MyGeneric<T1, T2>
{
    T2 t2;
    private T1 t1;
    MyGeneric(T2 t2, T1 t1)
    {
        this.t2 = t2;
        this.t1 = t1;
    }
    public T2 getT2()
    {
        return t2;
    }
    public T1 getT1()
    {
        return t1;
    }
}

public class p_4_Generics {
    public static void main(String[] args) {
         MyGeneric<String, Integer> g1 = new MyGeneric(1, "hello");
         String s = g1.getT1();
         int i = g1.getT2();
         System.out.println(s);
         System.out.println(i);
    }
}
