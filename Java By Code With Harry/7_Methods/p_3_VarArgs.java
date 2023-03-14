class p_3_VarArgs {
    static int sum(int ...args)
    {
        int sum = 0;
        for(int ele:args)
        {
            sum += ele;
        }
    
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println("hello");
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,35,74, 78, 15, 60, 70));
        System.out.println(sum());
    }
}
