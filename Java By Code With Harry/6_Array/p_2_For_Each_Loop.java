public class p_2_For_Each_Loop {
    public static void main(String args[])
    {
        int [] marks= {10,20,30,40,50};
        System.out.println(marks[0]);

        String [] arr = new String[5];
        arr[0] = "niraj";
        arr[1] = "bava";
        System.out.println(arr[1]); 

        System.out.println();

        for(int i = 0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println();

        for(int i = marks.length-1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println();
        
        // for each

        for(int element: marks)
        {
            System.out.println(element);
        }
    }
}
