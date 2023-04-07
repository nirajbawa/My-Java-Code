// Abtract in english means -> existing in thought or as an idea without concrete existance

abstract class parent{
    parent()
    {
        System.out.println("parent");
    }
    void sayHello(){
        System.out.println("hello");
    }
    abstract void greet();
}

abstract class child extends parent{
    child()
    {
        System.out.println("child");
    }
}

public class p_1_abstract_class extends child {
    p_1_abstract_class()
    {
        System.out.println("p_1_abstract_class");
    }
    @Override
    void greet()
    {
        System.out.println("good morning");
    }
    public static void main(String args[])
    {
        p_1_abstract_class a = new p_1_abstract_class();
        a.sayHello();
        a.greet();
    }
}
