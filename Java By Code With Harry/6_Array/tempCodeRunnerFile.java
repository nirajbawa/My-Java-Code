  int array[] = {20,30,40,50,60};
        
        for(int i = 0, j = array.length; i<array.length; i++, j--)
        {
            array[j-1] = array[i];
        }

        System.out.println("Array is : ");
        for(int i = 0; i<array.length; i++)
        {
            System.out.print(array[i]+ " ");
        }