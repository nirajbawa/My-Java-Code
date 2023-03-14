class p_4_break_and_continue{
    public static void main(String args[])
    {
        // break and continue using loops

        for(int i = 0; i<5; i++)
        {
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2)
            {
                System.out.println("loop end");
                break;
            }
        }
        System.out.println("Out of loop");

        System.out.println("\n\n");

        for(int i = 0; i<5; i++)
        {
            if(i==2)
            {
                System.out.println("loop end");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
           
        }
        System.out.println("Out of loop");
    }
}