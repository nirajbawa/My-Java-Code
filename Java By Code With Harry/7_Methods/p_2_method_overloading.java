class p_2_method_overloading {
    static void hello()
    {
        System.out.println("hello");
    }

    static void editArr(int arr[])
    {
        arr[0] = 100;
    }

    static void foo()
    {
        System.out.println("good morning");
    }

    // parameters
    static void foo(String a)
    {
        System.out.println("good morning "+a+" bro");
    }

    static void foo(String a, String b)
    {
        System.out.println("good morning "+a+" "+b+" bro");
    }

    public static void main(String args[])
    {
        hello();
        int marks[] = {20, 30, 40, 50};
        editArr(marks);
        for(int i:marks)
        {
            System.out.println(i);
        }

        // method overloading
        foo();
        foo("niraj");
        // argumetns are actual
        foo("niraj", "bava");
    }
}