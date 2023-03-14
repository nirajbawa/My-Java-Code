class p_3_Multidimensional {
    public static void main(String args[])
    {
        System.out.println("hello");
        int [][] flats = new int[3][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;

        flats[1][0]=104;
        flats[1][1]=105;
        flats[1][2]=106;

        flats[2][0]=107;
        flats[2][1]=108;
        flats[2][2]=109;

        // System.out.println(flats[0][0]);

        for(int i = 0; i<flats.length; i++)
        {
            for(int j = 0; j<flats.length; j++)
            {
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        int a[][] = {{1,2,3}, {4,5,6}};


        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<=a.length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
