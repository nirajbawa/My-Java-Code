//Runtime polymorphism (dynamic dispatch)

class phone{
    void switchOn()
    {
        System.out.println("switchOn");
    }
    void call()
    {
        System.out.println("calling 1 ");
    }
}


class smartPhone extends phone{
    void Youtube()
    {
        System.out.println("Youtube");
    }
    void call()
    {
        System.out.println("calling 2 ");
    }
    
}


public class p_5_Dynamic_Method_Dispatch {
    public static void main(String args[])
    {
        phone obj = new smartPhone();
        // smartPhone obj = new phone(); // not allowed
        obj.switchOn();
        obj.call();
        // obj.Youtube(); //this is not allowed
    }
}
