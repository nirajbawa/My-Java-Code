import java.util.Scanner;

class p_4_Practice_set {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q1)");
        int flats[] = {1,2,3,4,5};
        int sum = 0;
        for (int i : flats) {
            sum+=i;
        }
        System.out.println("the sum is : "+sum);

        System.out.println("Q2)");
        System.out.println("enter key");
        int key = sc.nextInt();
        for (int i : flats) {
            if(key==i)
            {
                System.out.println("elements is founded");
            }
        }

        System.out.println("Q3)");
        int marks[] = {20,30,40,50};
        int s=0;
        
        for (int i : marks) {
            s+=i;
        }
        System.out.println("the average marks is : "+(+s/marks.length));

        System.out.println("Q4)");

        System.out.println("Enter matrix : 2*3 : ");
        int matrix1[][] = new int[2][3];
        int matrix2[][] = new int[2][3];
        int matrix3[][] = new int[2][3];

        System.out.println("Enter marix 1 : ");
        for(int i = 0; i<matrix1.length; i++)
        {
            for(int j = 0; j<=matrix1.length; j++)
            {
                System.out.printf("matrix[%d][%d] = ", i ,j);
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter marix 2 : ");

        for(int i = 0; i<matrix2.length; i++)
        {
            for(int j = 0; j<=matrix2.length; j++)
            {
                System.out.printf("matrix[%d][%d] = ", i ,j);
                matrix2[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i<matrix1.length; i++)
        {
            for(int j = 0; j<matrix1.length; j++)
            {
                matrix3[i][j] += matrix3[i][j];
            }
        }

        System.out.println("The addition of two matrix is : ");

        for(int i = 0; i<matrix2.length; i++)
        {
            for(int j = 0; j<=matrix2.length; j++)
            {
                System.out.printf("matrix[%d][%d] = %d\n", i ,j, matrix3[i][j]);

            }
            System.out.println();
        }


        System.out.println("Q5)");



        int array[] = {20,30,40,50,60};
        int l = array.length;
        int n = Math.floorDiv(l, 2);
        
        for(int i = 0; i<=n; i++)
        {
            int temp = array[i];
            array[i] = array[l-i-1];
            array[l-i-1] = temp;
        }

        System.out.println("Array is : ");
        for(int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]+ " ");
        }

        System.out.println("\n\nQ6)");

        int max = 0;

        for (int i : array) {
            if(i>max)
            {
                max = i;
            }
        }

        System.out.println("The maximum number is : "+max);

        System.out.println("\n\nQ7)");

        int min = array[0];

        for (int i : array) {
            if(i<min)
            {
                min = i;
            }
        }

        System.out.println("The minimum number is : "+min);

        System.out.println("\n\nQ8)");

        boolean sorted = true;
        
        for(int i = 0; i<array.length-1; i++)
        {
            if(array[i]>array[i+1])
            {
                sorted = false;
                break;
            }
            
        }

        System.out.println(sorted);
    }
}
