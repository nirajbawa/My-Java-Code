import java.util.*;

class ageException extends Exception{
    ageException(String msg)
    {
        super(msg);
    }
}

class ArrayIndexException extends Exception{
    @Override
    public String getMessage() {
        return "Array Index Exception getMessage";
    }
    @Override
    public String toString() {
        return "Array Index Exception toString";
    }
}

public class p_4_exception_class {
    public static void main(String args[])
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        age  = sc.nextInt();

        try{
            if(age<150)
            {
                age = 100/age;
                throw new ArithmeticException("error");
            }
            else{
                System.out.println("ok");
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }


        try{
            if(age>150)
            {
                throw new ageException("your age is invalid");
            }
            else{
                System.out.println("yes");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        int arr[] = {10, 20, 30};

        System.out.println("Enter index : ");
        int ind = sc.nextInt();

        try{
            if(ind>arr.length)
            {
                    throw new ArrayIndexException();
            }              
            else{
                System.out.println("yes");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
       
    }
}
