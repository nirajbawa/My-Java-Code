class p_1_method {
    static int logic(int x, int y)
    {
        int z;
         if(x>y)
        {
            z = x+y;
        }
        else{
            z = x-y;
        }
        return z;
    }

    int add(int x, int y)
    {
        int z;
         if(x>y)
        {
            z = x+y;
        }
        else{
            z = x-y;
        }
        return z;
    }

    public static void main(String args[])
    {
        System.out.println("hello");
        int c = logic(1,2);
        System.out.println(c);

        int d;
        p_1_method obj = new p_1_method();
        d = obj.add(4, 3);
        System.out.println(d);
    }
}
