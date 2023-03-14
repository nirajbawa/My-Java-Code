class p_3_for_loop {
    public static void main(String args[])    
    {
        
        for(int i = 1; i<=5; i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }

        System.out.println("\n");

        for(int i = 0; i<5; i++)
        {
            System.out.println(2*i+1);
        }

        System.out.println("\n");

        for(int i = 5; i>0; i--)
        {
            System.out.println(i);
        }
    }
}
