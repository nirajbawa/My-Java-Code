class p_1_If_else {
    public static void main(String args[])
    {
        System.out.println("hello");
        int age = 6;

        // if else
        if(age>18)
        {
            System.out.println("yes boy you can drive");
        }
        else{
            System.out.println("you can not drive");
        }

        // if else if ladder

        age = 50;

        if(age>56)
        {
            System.out.println("you are experienced!");
        }
        else if(age>46)
        {
            System.out.println("you are semi-experienced!");
        }
        else{
            System.out.println("you are not experienced!");
        }
    }
}
